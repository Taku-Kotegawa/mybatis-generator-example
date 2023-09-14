package com.example.mybatisgeneratorexample.domain.model.mbg;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * Database Table Remarks:
 *   部署
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table public.organization
 */
public class Organization extends OrganizationKey implements Serializable {
    /**
     * Database Column Remarks:
     *   作成者
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.organization.created_by
     *
     * @mbg.generated
     */
    private String createdBy;

    /**
     * Database Column Remarks:
     *   作成日時
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.organization.created_date
     *
     * @mbg.generated
     */
    private LocalDateTime createdDate;

    /**
     * Database Column Remarks:
     *   最終更新者
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.organization.last_modified_by
     *
     * @mbg.generated
     */
    private String lastModifiedBy;

    /**
     * Database Column Remarks:
     *   最終更新日時
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.organization.last_modified_date
     *
     * @mbg.generated
     */
    private LocalDateTime lastModifiedDate;

    /**
     * Database Column Remarks:
     *   部門長ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.organization.director_id
     *
     * @mbg.generated
     */
    private Long directorId;

    /**
     * Database Column Remarks:
     *   部署名
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.organization.group_name
     *
     * @mbg.generated
     */
    private String groupName;

    /**
     * Database Column Remarks:
     *   親部署ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.organization.parent_id
     *
     * @mbg.generated
     */
    private Long parentId;

    /**
     * Database Column Remarks:
     *   ステータス
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.organization.status
     *
     * @mbg.generated
     */
    private String status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table public.organization
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.organization.created_by
     *
     * @return the value of public.organization.created_by
     *
     * @mbg.generated
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.organization.created_by
     *
     * @param createdBy the value for public.organization.created_by
     *
     * @mbg.generated
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.organization.created_date
     *
     * @return the value of public.organization.created_date
     *
     * @mbg.generated
     */
    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.organization.created_date
     *
     * @param createdDate the value for public.organization.created_date
     *
     * @mbg.generated
     */
    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.organization.last_modified_by
     *
     * @return the value of public.organization.last_modified_by
     *
     * @mbg.generated
     */
    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.organization.last_modified_by
     *
     * @param lastModifiedBy the value for public.organization.last_modified_by
     *
     * @mbg.generated
     */
    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.organization.last_modified_date
     *
     * @return the value of public.organization.last_modified_date
     *
     * @mbg.generated
     */
    public LocalDateTime getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.organization.last_modified_date
     *
     * @param lastModifiedDate the value for public.organization.last_modified_date
     *
     * @mbg.generated
     */
    public void setLastModifiedDate(LocalDateTime lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.organization.director_id
     *
     * @return the value of public.organization.director_id
     *
     * @mbg.generated
     */
    public Long getDirectorId() {
        return directorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.organization.director_id
     *
     * @param directorId the value for public.organization.director_id
     *
     * @mbg.generated
     */
    public void setDirectorId(Long directorId) {
        this.directorId = directorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.organization.group_name
     *
     * @return the value of public.organization.group_name
     *
     * @mbg.generated
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.organization.group_name
     *
     * @param groupName the value for public.organization.group_name
     *
     * @mbg.generated
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.organization.parent_id
     *
     * @return the value of public.organization.parent_id
     *
     * @mbg.generated
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.organization.parent_id
     *
     * @param parentId the value for public.organization.parent_id
     *
     * @mbg.generated
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.organization.status
     *
     * @return the value of public.organization.status
     *
     * @mbg.generated
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.organization.status
     *
     * @param status the value for public.organization.status
     *
     * @mbg.generated
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.organization
     *
     * @mbg.generated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Organization other = (Organization) that;
        return (this.getOrganizationId() == null ? other.getOrganizationId() == null : this.getOrganizationId().equals(other.getOrganizationId()))
            && (this.getVersion() == null ? other.getVersion() == null : this.getVersion().equals(other.getVersion()))
            && (this.getCreatedBy() == null ? other.getCreatedBy() == null : this.getCreatedBy().equals(other.getCreatedBy()))
            && (this.getCreatedDate() == null ? other.getCreatedDate() == null : this.getCreatedDate().equals(other.getCreatedDate()))
            && (this.getLastModifiedBy() == null ? other.getLastModifiedBy() == null : this.getLastModifiedBy().equals(other.getLastModifiedBy()))
            && (this.getLastModifiedDate() == null ? other.getLastModifiedDate() == null : this.getLastModifiedDate().equals(other.getLastModifiedDate()))
            && (this.getDirectorId() == null ? other.getDirectorId() == null : this.getDirectorId().equals(other.getDirectorId()))
            && (this.getGroupName() == null ? other.getGroupName() == null : this.getGroupName().equals(other.getGroupName()))
            && (this.getParentId() == null ? other.getParentId() == null : this.getParentId().equals(other.getParentId()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.organization
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOrganizationId() == null) ? 0 : getOrganizationId().hashCode());
        result = prime * result + ((getVersion() == null) ? 0 : getVersion().hashCode());
        result = prime * result + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        result = prime * result + ((getCreatedDate() == null) ? 0 : getCreatedDate().hashCode());
        result = prime * result + ((getLastModifiedBy() == null) ? 0 : getLastModifiedBy().hashCode());
        result = prime * result + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        result = prime * result + ((getDirectorId() == null) ? 0 : getDirectorId().hashCode());
        result = prime * result + ((getGroupName() == null) ? 0 : getGroupName().hashCode());
        result = prime * result + ((getParentId() == null) ? 0 : getParentId().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.organization
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", createdBy=").append(createdBy);
        sb.append(", createdDate=").append(createdDate);
        sb.append(", lastModifiedBy=").append(lastModifiedBy);
        sb.append(", lastModifiedDate=").append(lastModifiedDate);
        sb.append(", directorId=").append(directorId);
        sb.append(", groupName=").append(groupName);
        sb.append(", parentId=").append(parentId);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}