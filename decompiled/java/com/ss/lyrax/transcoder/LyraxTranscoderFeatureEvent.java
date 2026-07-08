package com.ss.lyrax.transcoder;

import X.C2188811AlT;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxTranscoderFeatureEvent {
    public String detailJsonString;
    public int errorCode;
    public LyraxTranscoderFeatureEventType eventType;
    public String featureName;
    public String message;
    public String projectKey;
    public String scene;
    public int subErrorCode;
    public String subType;
    public String taskId;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LyraxTranscoderFeatureEvent{taskId='");
        sbLIZ.append(this.taskId);
        sbLIZ.append('\'');
        sbLIZ.append(", eventType=");
        sbLIZ.append(this.eventType);
        sbLIZ.append(", projectKey='");
        sbLIZ.append(this.projectKey);
        sbLIZ.append('\'');
        sbLIZ.append(", featureName='");
        sbLIZ.append(this.featureName);
        sbLIZ.append('\'');
        sbLIZ.append(", detailJsonString='");
        sbLIZ.append(this.detailJsonString);
        sbLIZ.append('\'');
        sbLIZ.append(", errorCode=");
        sbLIZ.append(this.errorCode);
        sbLIZ.append(", subErrorCode=");
        sbLIZ.append(this.subErrorCode);
        sbLIZ.append(", message='");
        sbLIZ.append(this.message);
        sbLIZ.append('\'');
        sbLIZ.append(", scene='");
        sbLIZ.append(this.scene);
        sbLIZ.append('\'');
        sbLIZ.append(", subType='");
        sbLIZ.append(this.subType);
        sbLIZ.append('\'');
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public String getDetailJsonString() {
        return this.detailJsonString;
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public LyraxTranscoderFeatureEventType getEventType() {
        return this.eventType;
    }

    public String getFeatureName() {
        return this.featureName;
    }

    public String getMessage() {
        return this.message;
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public String getScene() {
        return this.scene;
    }

    public int getSubErrorCode() {
        return this.subErrorCode;
    }

    public String getSubType() {
        return this.subType;
    }

    public String getTaskId() {
        return this.taskId;
    }

    public static LyraxTranscoderFeatureEvent create(String str, LyraxTranscoderFeatureEventType lyraxTranscoderFeatureEventType, String str2, String str3, String str4, int i, int i2, String str5, String str6, String str7) {
        LyraxTranscoderFeatureEvent lyraxTranscoderFeatureEvent = new LyraxTranscoderFeatureEvent();
        lyraxTranscoderFeatureEvent.taskId = str;
        lyraxTranscoderFeatureEvent.eventType = lyraxTranscoderFeatureEventType;
        lyraxTranscoderFeatureEvent.projectKey = str2;
        lyraxTranscoderFeatureEvent.featureName = str3;
        lyraxTranscoderFeatureEvent.detailJsonString = str4;
        lyraxTranscoderFeatureEvent.errorCode = i;
        lyraxTranscoderFeatureEvent.subErrorCode = i2;
        lyraxTranscoderFeatureEvent.message = str5;
        lyraxTranscoderFeatureEvent.scene = str6;
        lyraxTranscoderFeatureEvent.subType = str7;
        return lyraxTranscoderFeatureEvent;
    }
}
