package com.jeppesen.jcms.crew.leave.api.testAPI;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
/** For testing and reference purpose
 */
@RestController
public class crewleave {

    @GetMapping(path = "/leave/quota")
    public ResponseEntity<Quota> ping() {
    	 Quota q1 = new Quota();
         q1.setAvailableQuota(10);
         q1.setDescription("Thanks for submitting your request. We will try to accomdate your leave request and inform you at the earliest");
         return new ResponseEntity<Quota>(q1,HttpStatus.OK);
    }
}
