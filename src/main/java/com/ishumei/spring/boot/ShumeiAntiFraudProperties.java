/*
 * Copyright (c) 2018, hiwepy (https://github.com/hiwepy).
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.ishumei.spring.boot;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * https://www.ishumei.com/
 * 
 * @author ： <a href="https://github.com/hiwepy">hiwepy</a>
 */
@ConfigurationProperties(ShumeiAntiFraudProperties.PREFIX)
public class ShumeiAntiFraudProperties {

	public static final String PREFIX = "shumei.anti.fraud";

	/**
	 * 应用标识： 用于区分相同公司的不同应用，该参数传递值可与数美服务协商用于区分应用，默认应用值：default
	 */
	private String appId;
	/**
	 * 公司密钥：用于权限认证，开通账号服务时由数美提供
	 */
	private String accessKey;
	/**
	 * 平台业务类型，可选值(必须大写) 直播：ZHIBO 电商：ECOM 游戏：GAME 新闻资讯 ：NEWS 论坛：FORUM 社交 ：SOCIAL
	 */
	private String type;
	/**
	 * 文本鉴定过滤时的渠道值
	 */
	private String channelTxt;
	/**
	 * 图片鉴定过滤时的渠道值
	 */
	private String channelImg;

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getAccessKey() {
		return accessKey;
	}

	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getChannelTxt() {
		return channelTxt;
	}

	public void setChannelTxt(String channelTxt) {
		this.channelTxt = channelTxt;
	}

	public String getChannelImg() {
		return channelImg;
	}

	public void setChannelImg(String channelImg) {
		this.channelImg = channelImg;
	}

}
