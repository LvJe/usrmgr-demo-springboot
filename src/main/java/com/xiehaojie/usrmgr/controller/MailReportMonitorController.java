/*
package com.xiehaojie.usrmgr.controller;

import com.guazi.dataworks.common.JsonResult;
import com.guazi.dataworks.mail.tracking.annotation.RequestLimit;
import com.guazi.dataworks.mail.tracking.service.MailReportService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

*/
/**
 * @author luomin4
 *//*


@Slf4j
@RestController
@RequestMapping("/mail")
@Api(value = "邮件报表管理")
public class MailReportMonitorController {

  @Autowired
  private MailReportService mailReportService;

  */
/**
   * Add the information of the mail clicked into database
   *//*

  @RequestLimit(limitTime = 1, count = 100000, timeUnit = TimeUnit.DAYS)
  @GetMapping("/add")
  @ApiOperation(value = "邮件报表任务内容获取", notes = "邮件报表任务内容获取")
  public JsonResult addInfo(@ApiParam(value = "邮件报表任务序号") @RequestParam("taskId") String taskId,
      @ApiParam(value = "邮件报表任务名") @RequestParam(value = "taskName", required = false) String taskName,
      @ApiParam(value = "邮件报表发送链接组", required = true) @RequestParam("userEmail") String userEmail,
      @ApiParam(value = "邮件报表任务发送时间", required = true) @RequestParam("sentDateTime") String sentDateTime) {
    try {
      mailReportService.addMailInfo(taskId, taskName, userEmail, sentDateTime);
      return JsonResult.buildSuccessResult();
    } catch (Exception e) {
      log.error("process error", e);
      return JsonResult.buildErrorResult(e.getMessage());
    }
  }

  @GetMapping("/")
  @ApiOperation(value = "邮件点击量")
  public JsonResult getClickCount(@ApiParam(value = "日期") @RequestParam("date") String date) {
    try {
      List<String> taskIds = mailReportService.getMailClickCount(date);
      return JsonResult.buildSuccessResult(taskIds);
    } catch (Exception e) {
      log.error("process error", e);
      return JsonResult.buildErrorResult(e.getMessage());
    }
  }

  @GetMapping("/name")
  @ApiOperation(value = "邮件点击量冷/热度")
  public JsonResult getClickCountByName(
      @ApiParam(value = "开始日期") @RequestParam("startDate") String startDate,
      @ApiParam(value = "结束日期") @RequestParam("endDate") String endDate) {
    try {
      log.info("getClickCountByName, 开始时间: {}, 结束时间: {}", startDate, endDate);
      Map<String, Integer> clickMap = mailReportService.getCountByTaskName(startDate, endDate);
      return JsonResult.buildSuccessResult(clickMap);
    } catch (Exception e) {
      log.error("process error", e);
      return JsonResult.buildErrorResult(e.getMessage());
    }
  }

}
*/
