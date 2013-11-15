package org.feuyeux.jaxrs2.atup.core.info;

import org.feuyeux.jaxrs2.atup.core.domain.AtupDevice;
import org.feuyeux.jaxrs2.atup.core.domain.AtupTestSuite;

import java.util.Date;

public class AtupTestCaseInfo extends AtupInfo {
    private Integer caseId;
    private String caseName;
    private AtupTestSuite suite;
    private AtupDevice device;
    private String caseBody;
    private Date createTime;
    private Date updateTime;
    private Integer caseStatus;

    public AtupTestCaseInfo() {

    }

    public Integer getCaseId() {
        return caseId;
    }

    public void setCaseId(Integer caseId) {
        this.caseId = caseId;
    }

    public String getCaseName() {
        return caseName;
    }

    public void setCaseName(String caseName) {
        this.caseName = caseName;
    }

    public AtupTestSuite getSuite() {
        return suite;
    }

    public void setSuite(AtupTestSuite suite) {
        this.suite = suite;
    }

    public Integer getCaseStatus() {
        return caseStatus;
    }

    public void setCaseStatus(Integer caseStatus) {
        this.caseStatus = caseStatus;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCaseBody() {
        return caseBody;
    }

    public void setCaseBody(String caseBody) {
        this.caseBody = caseBody;
    }

    public AtupDevice getDevice() {
        return device;
    }

    public void setDevice(AtupDevice device) {
        this.device = device;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}