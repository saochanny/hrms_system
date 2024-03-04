package com.chanty.hrsystem.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Table(name = "employments")
@Entity
public class Employment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employmentId;
    private Boolean isNetSalary;
    private BigDecimal salaryAmount;
    private String fullName;
    private LocalDate contractEndDate;
    private LocalDate probationStartDate;
    private LocalDate probationEndDate;
    private LocalDate startDate;
    private LocalDate endDate;
    private LocalDate retirementDate;
    private Long payrollParameterId;
    private Integer retirementAge;
    private Long contractTypeId;
    private Long employeeTypeId;
    private Long transportationTypeId;
    private Long LeaveTemplateId;
    private Long lineManagerId;
    private Long personId;

    private Long positionGroupId;
    private Long salaryCurrentId;
    private Long workLocationId;

    private Long regionId;
    private Long businessDivisionId;
    private Long departmentId;
    private Long branchProvinceId;
    private Long locationBranchId;
    private Long subLocationId;

    private Long lineId;
    private Long unitId;
    private Long positionFamilyId;
    private Long jobFamilyId;
    private Long categoryId;
    private Long functionId;
    private Long subFunctionId;
    private Long homeFunctionId;
    private Long jobGradeId;
    private Long personalGradeId;

    private Long jobLevelId;
    private Long jobGroupId;
    private Long jbCategoryId;
    private Long costCenterId;
    private Boolean allowRegenerateSalary;
    private LocalDateTime regenerateSalaryInMonth;
    private LocalDateTime annualLeaveBalancePayInMonth;

    private LocalDateTime finalPayInMonth;
    private String cardNO;
    private String status;
    private Long rosterId;
    private Boolean isExceptScan;
    private Boolean isResident;
    private Long careerTypeId;
    private Long careerReasonId;
    private Long careerHistoryId;

    private Boolean emailWelcomeStatus;
    private String onboardingStatus;
    private String onboardingLastMessage;

    private String taxMethod;
    private String taxPaidBy;
    private String jobDetail;

    private Integer noPrint;
    private String traineeCode;
    private LocalDate startDateProbationNewJoin;
    private LocalDate endDateProbationNewJoin;
    private LocalDate effectiveDate;

    private LocalDate leaveEntitleEffectiveDate;

}
