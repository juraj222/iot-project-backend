package iot.fei.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import iot.fei.core.domain.DataLogs;
import iot.fei.core.service.DataLogsService;

@Controller
@RequestMapping("/devices")
public class DeviceController {
	@Autowired
	DataLogsService dataLogsService;

	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody DataLogs createDL(@RequestBody DataLogs dl) {
		return dataLogsService.createDataLogs(dl);
	}

	@CrossOrigin
	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody List<DataLogs> getAllDL() {
		return dataLogsService.getAllDataLogs();
	}
}
