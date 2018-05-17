package com.cdeledu.util.database.redis;

import java.util.List;
import java.util.Map;

import org.apache.poi.ss.formula.functions.T;

/**
 * 把今天最好的表现当作明天最新的起点．．～
 *
 * Today the best performance as tomorrow newest starter!
 *
 * @类描述: Redis 服务器命令
 * @创建者: 皇族灬战狼
 * @联系方式: duleilewuhen@sina.com
 * @创建时间: 2018年5月16日 下午7:27:46
 * @版本: V1.0
 * @since: JDK 1.7
 * @see <a href="redisdoc.com/server/index.html">Server（服务器）</a>
 */
interface RedisServerCommand {

	/** 返回关于 当前Redis 服务器的各种信息和统计数值 */
	List<T> getRedisServerInfo();

	/** 用于返回所有连接到服务器的客户端信息和统计数据 */
	List<T> getClientList();

	/** 关闭客户端连接 */
	boolean kill(String addr);

	/** 获取占用内存大小:返回当前数据库的 key 的数量 */
	Long dbSize();

	/** 获取当前redis使用内存大小情况 */
	Map<T, T> getMemeryInfo();

	/** 用于测试与服务器的连接是否仍然生效，或者用于测量延迟值 */
	boolean isPing();
}
