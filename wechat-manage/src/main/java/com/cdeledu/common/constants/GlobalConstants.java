package com.cdeledu.common.constants;

/**
 * @类描述: 全局配置类、系统常量
 * @创建者: 皇族灬战狼
 * @创建时间: 2016年12月7日 下午7:44:50
 * @版本: V1.0
 * @since: JDK 1.7
 */
public class GlobalConstants {
	/** 验证码 */
	public static final String IMAGECAPTCHA = "imageCaptcha";
	/** 全站在线人数 */
	public static final String ONLINEUSERNUMBER = "onLineUserNumber";
	/** 过滤标识，防止一次请求多次过滤 */
	public static final String FILTERED_REQUEST = "@@session_context_filtered_request";
	/** 保存用户到SESSION */
	public static final String USER_SESSION = "USER_SESSION";
	/** 将登录前的URL放到Session中的键名称 */
	public static final String LOGIN_TO_URL = "toUrl";
	/** 需要登录即可访问的URI资源 */
	public static final String[] INHERENT_URIS = { "/select", "/find", "/get", "/add", "/save",
			"/insert", "/edit", "/update", "/delete", "/bathDel" };
	/** 人员类型 */
	public static final Short User_Normal = 1;// 正常
	public static final Short User_Forbidden = 0;// 禁用
	public static final Short User_ADMIN = -1;// 超级管理员
	/** 日志级别定义 */
	public static final Integer Log_Leavel_INFO = 1;
	public static final Integer Log_Leavel_WARRING = 2;
	public static final Integer Log_Leavel_ERROR = 3;
	/** 日志类型 */
	public static final Integer Log_Type_LOGIN = 1; // 登陆
	public static final Integer Log_Type_EXIT = 2; // 退出
	public static final Integer Log_Type_INSERT = 3; // 插入
	public static final Integer Log_Type_DEL = 4; // 删除
	public static final Integer Log_Type_UPDATE = 5; // 更新
	public static final Integer Log_Type_UPLOAD = 6; // 上传
	public static final Integer Log_Type_OTHER = 7; // 其他
	
	
	/**
	 * 获取Key加载信息
	 */
	public static boolean printKeyLoadMessage(){
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("\r\n            ================================================================================================\r\n");
		stringBuilder.append("\r\n                  ___           ___           ___           ___                       ___           ___     ");
		stringBuilder.append("\r\n                 /\\__\\         /\\  \\         /\\  \\         /\\__\\          ___        /\\__\\         /\\  \\    ");
		stringBuilder.append("\r\n                /::|  |       /::\\  \\       /::\\  \\       /::|  |        /\\  \\      /::|  |       /::\\  \\   ");
		stringBuilder.append("\r\n               /:|:|  |      /:/\\:\\  \\     /:/\\:\\  \\     /:|:|  |        \\:\\  \\    /:|:|  |      /:/\\:\\  \\  ");
		stringBuilder.append("\r\n              /:/|:|__|__   /:/  \\:\\  \\   /::\\~\\:\\  \\   /:/|:|  |__      /::\\__\\  /:/|:|  |__   /:/  \\:\\  \\ ");
		stringBuilder.append("\r\n             /:/ |::::\\__\\ /:/__/ \\:\\__\\ /:/\\:\\ \\:\\__\\ /:/ |:| /\\__\\  __/:/\\/__/ /:/ |:| /\\__\\ /:/__/_\\:\\__\\");
		stringBuilder.append("\r\n             \\/__/~~/:/  / \\:\\  \\ /:/  / \\/_|::\\/:/  / \\/__|:|/:/  / /\\/:/  /    \\/__|:|/:/  / \\:\\  /\\ \\/__/");
		stringBuilder.append("\r\n                   /:/  /   \\:\\  /:/  /     |:|::/  /      |:/:/  /  \\::/__/         |:/:/  /   \\:\\ \\:\\__\\  ");
		stringBuilder.append("\r\n                  /:/  /     \\:\\/:/  /      |:|\\/__/       |::/  /    \\:\\__\\         |::/  /     \\:\\/:/  /  ");
		stringBuilder.append("\r\n                 /:/  /       \\::/  /       |:|  |         /:/  /      \\/__/         /:/  /       \\::/  /   ");
		stringBuilder.append("\r\n                 \\/__/         \\/__/         \\|__|         \\/__/                     \\/__/         \\/__/    \r\n");
		stringBuilder.append("\r\n                                                                   欢迎使用 猫宁Morning电子商城  - Powered By 爬梯子的猫                     \r\n");
		stringBuilder.append("\r\n            ================================================================================================\r\n");
		System.out.println(stringBuilder.toString());
		return true;
	}
}
