package com.heytap.msp.push.mode;

import X.C2188811AlT;

/* JADX INFO: loaded from: classes14.dex */
public class DataMessage extends BaseMode {
    public String mAppId;
    public String mAppPackage;
    public String mBalanceTime;
    public String mContent;
    public String mDataExtra;
    public String mDescription;
    public String mDistinctContent;
    public String mEndDate;
    public String mEventId;
    public String mForcedDelivery;
    public String mGlobalId;
    public String mMessageID;
    public int mMessageType;
    public int mMsgCommand;
    public int mNotifyID;
    public String mRule;
    public String mStartDate;
    public String mStatisticsExtra;
    public String mTimeRanges;
    public String mTitle;
    public String mTaskID = "";
    public String mMiniProgramPkg = "";

    public DataMessage() {
    }

    public DataMessage(String str, String str2) {
        this.mAppPackage = str;
        this.mGlobalId = str2;
    }

    public String getAppId() {
        return this.mAppId;
    }

    public String getAppPackage() {
        return this.mAppPackage;
    }

    public String getBalanceTime() {
        return this.mBalanceTime;
    }

    public String getContent() {
        return this.mContent;
    }

    public String getDataExtra() {
        return this.mDataExtra;
    }

    public String getDescription() {
        return this.mDescription;
    }

    public String getDistinctContent() {
        return this.mDistinctContent;
    }

    public String getEndDate() {
        return this.mEndDate;
    }

    public String getEventId() {
        return this.mEventId;
    }

    public String getForcedDelivery() {
        return this.mForcedDelivery;
    }

    public String getGlobalId() {
        return this.mGlobalId;
    }

    public String getMessageID() {
        return this.mMessageID;
    }

    public int getMessageType() {
        return this.mMessageType;
    }

    public String getMiniProgramPkg() {
        return this.mMiniProgramPkg;
    }

    public int getMsgCommand() {
        return this.mMsgCommand;
    }

    public int getNotifyID() {
        return this.mNotifyID;
    }

    public String getRule() {
        return this.mRule;
    }

    public String getStartDate() {
        return this.mStartDate;
    }

    public String getStatisticsExtra() {
        return this.mStatisticsExtra;
    }

    public String getTaskID() {
        return this.mTaskID;
    }

    public String getTimeRanges() {
        return this.mTimeRanges;
    }

    public String getTitle() {
        return this.mTitle;
    }

    @Override // com.heytap.msp.push.mode.BaseMode
    public int getType() {
        return 4103;
    }

    public void setAppId(String str) {
        this.mAppId = str;
    }

    public void setAppPackage(String str) {
        this.mAppPackage = str;
    }

    public void setBalanceTime(String str) {
        this.mBalanceTime = str;
    }

    public void setContent(String str) {
        this.mContent = str;
    }

    public void setDataExtra(String str) {
        this.mDataExtra = str;
    }

    public void setDescription(String str) {
        this.mDescription = str;
    }

    public void setDistinctContent(String str) {
        this.mDistinctContent = str;
    }

    public void setEndDate(String str) {
        this.mEndDate = str;
    }

    public void setEventId(String str) {
        this.mEventId = str;
    }

    public void setForcedDelivery(String str) {
        this.mForcedDelivery = str;
    }

    public void setGlobalId(String str) {
        this.mGlobalId = str;
    }

    public void setMessageID(String str) {
        this.mMessageID = str;
    }

    public void setMessageType(int i) {
        this.mMessageType = i;
    }

    public void setMiniProgramPkg(String str) {
        this.mMiniProgramPkg = str;
    }

    public void setMsgCommand(int i) {
        this.mMsgCommand = i;
    }

    public void setNotifyID(int i) {
        this.mNotifyID = i;
    }

    public void setRule(String str) {
        this.mRule = str;
    }

    public void setStartDate(String str) {
        this.mStartDate = str;
    }

    public void setStatisticsExtra(String str) {
        this.mStatisticsExtra = str;
    }

    public void setTaskID(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(i);
        sbLIZ.append("");
        this.mTaskID = C2188811AlT.LIZIZ(sbLIZ);
    }

    public void setTaskID(String str) {
        this.mTaskID = str;
    }

    public void setTimeRanges(String str) {
        this.mTimeRanges = str;
    }

    public void setTitle(String str) {
        this.mTitle = str;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DataMessage{mMessageID='");
        sbLIZ.append(this.mMessageID);
        sbLIZ.append('\'');
        sbLIZ.append(", mMessageType='");
        sbLIZ.append(this.mMessageType);
        sbLIZ.append('\'');
        sbLIZ.append(", mAppPackage='");
        sbLIZ.append(this.mAppPackage);
        sbLIZ.append('\'');
        sbLIZ.append(", mTaskID='");
        sbLIZ.append(this.mTaskID);
        sbLIZ.append('\'');
        sbLIZ.append(", mTitle='");
        sbLIZ.append(this.mTitle);
        sbLIZ.append('\'');
        sbLIZ.append(", mNotifyID='");
        sbLIZ.append(this.mNotifyID);
        sbLIZ.append('\'');
        sbLIZ.append(", mContent='");
        sbLIZ.append(this.mContent);
        sbLIZ.append('\'');
        sbLIZ.append(", mGlobalId='");
        sbLIZ.append(this.mGlobalId);
        sbLIZ.append('\'');
        sbLIZ.append(", mBalanceTime='");
        sbLIZ.append(this.mBalanceTime);
        sbLIZ.append('\'');
        sbLIZ.append(", mStartDate='");
        sbLIZ.append(this.mStartDate);
        sbLIZ.append('\'');
        sbLIZ.append(", mEndDate='");
        sbLIZ.append(this.mEndDate);
        sbLIZ.append('\'');
        sbLIZ.append(", mTimeRanges='");
        sbLIZ.append(this.mTimeRanges);
        sbLIZ.append('\'');
        sbLIZ.append(", mRule='");
        sbLIZ.append(this.mRule);
        sbLIZ.append('\'');
        sbLIZ.append(", mForcedDelivery='");
        sbLIZ.append(this.mForcedDelivery);
        sbLIZ.append('\'');
        sbLIZ.append(", mDistinctContent='");
        sbLIZ.append(this.mDistinctContent);
        sbLIZ.append('\'');
        sbLIZ.append(", mAppId='");
        sbLIZ.append(this.mAppId);
        sbLIZ.append('\'');
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
