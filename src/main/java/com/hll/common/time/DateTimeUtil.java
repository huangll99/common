package com.hll.common.time;

import java.sql.Timestamp;
import java.time.LocalDateTime;

/**
 * 日期时间处理工具类
 * Created by huangll on 2016/12/26.
 */
public class DateTimeUtil {

  /**
   * 获取今天最后的时间：23:59:59
   *
   * @return
   */
  public static long getLastTimeOfToday() {
    LocalDateTime lastTime = LocalDateTime.now().withHour(23).withMinute(59).withSecond(59);
    return Timestamp.valueOf(lastTime).getTime();
  }


  public static void main(String[] args) {
    System.out.println(getLastTimeOfToday());
  }
}
