package projectTime;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class WhatTime
 */
@Stateless
@LocalBean
public class WhatTime implements WhatTimeLocal {

	@Override
	public Long info() {
		return System.currentTimeMillis();
	}

	

}
