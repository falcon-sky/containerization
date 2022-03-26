package com.rama.rest.reciever;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReceiverController {
  private static final Logger LOGGER = LoggerFactory.getLogger(ReceiverController.class);

  @GetMapping("/receiver/message")
  public String getDetail() {
    LOGGER.info("Receiver request message:");
    return "message from receiver";
  }

  @GetMapping("/receiver")
  public String getReceiver() {
    LOGGER.info("Receiver get:");
    return "Receiver get caller";
  }
}
