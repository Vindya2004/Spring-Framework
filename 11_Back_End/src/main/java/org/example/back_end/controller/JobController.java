package org.example.back_end.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.back_end.dto.JobDTO;
import org.example.back_end.service.impl.JobServiceImpl;
import org.example.back_end.util.APIResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/v1/job")
@RestController
@RequiredArgsConstructor
@CrossOrigin
@Slf4j
public class JobController {
    private final JobServiceImpl jobService;

//    @PostMapping("create")
//    public void createJob(@RequestBody JobDTO jobDTO) {
//        jobService.saveJob(jobDTO);
//    }
    @PostMapping("create")
    public ResponseEntity<APIResponse> createJob(@Valid @RequestBody JobDTO jobDTO) {
        log.info("INFO-Create job");
        log.debug("DEBUG-Create job");
        log.error("ERROR-Create job");
        log.warn("WARN-Create job");
        log.trace("TRACE-Create job");
        jobService.saveJob(jobDTO);
        return ResponseEntity.ok(new APIResponse(
                201,
                "Job created Successfully",
                null
        ));
    }
    @PutMapping("update")
    public ResponseEntity<APIResponse> updateJob(@RequestBody JobDTO jobDTO){
        jobService.updateJob(jobDTO);
        return ResponseEntity.ok(new APIResponse(
                200,
                "Job updated successfully",
                null
        ));
    }


    @GetMapping("all")
    public ResponseEntity<APIResponse> getAllJobs() {
        List<JobDTO> jobDTOS = jobService.getAllJobs();
        return ResponseEntity.ok(
                new APIResponse(
                        200,
                        "Message",
                        jobDTOS

                )
        );
    }

//    @PatchMapping("status/{id}")
//    public void changeStatus(@PathVariable String id){
//        jobService.changeJobStatus(id);
//    }
    @PatchMapping("status/{id}")
    public ResponseEntity<APIResponse> changeStatus(@PathVariable String id) {
        jobService.changeJobStatus(id);
        return ResponseEntity.ok(
                new APIResponse(
                        200,
                        "Job status changed successfully (ID: " + id + ")",
                        null
                )
        );
    }

    //    @GetMapping("search/{keyword}")
//    public List<JobDTO> searchJob(@PathVariable("keyword") String keyword) {
//        return jobService.getAllJobsByKeyword(keyword);
//    }
    @GetMapping("search/{keyword}")
    public ResponseEntity<APIResponse> searchJob(@PathVariable("keyword") String keyword) {
        List<JobDTO> searchResults = jobService.getAllJobsByKeyword(keyword);

        return ResponseEntity.ok(new APIResponse(
                200,
                "Jobs fetched successfully for keyword: " + keyword,
                searchResults
        ));
    }
    @GetMapping("get/{id}")
    public JobDTO getJobById(@PathVariable("id") int id) {
        return jobService.getJobById(id);
    }
//    @DeleteMapping("delete/{id}")
//    public void deleteJob(@PathVariable("id") int id) {
//        jobService.deleteJob(id);
//    }
    @DeleteMapping("delete/{id}")
    public ResponseEntity<APIResponse> deleteJob(@PathVariable("id") int id) {
        jobService.deleteJob(id);
        return ResponseEntity.ok(new APIResponse(
                200,
                "Job deleted successfully (ID: " + id + ")",
                null
        ));
    }

    @GetMapping("jobs")
    public ResponseEntity<org.springframework.data.domain.Page<JobDTO>> getJobs(@PageableDefault(page = 0, size = 5) Pageable pageable) {
        Page<JobDTO> jobsPage = jobService.getJobs(pageable);
        return ResponseEntity.ok(jobsPage);
    }


}
