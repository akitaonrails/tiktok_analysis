package com.ss.android.ugc.aweme.unifiedauthapi.model;

import X.C09CT;
import X.C0O1V;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class UnifiedAuthPopupConfig implements Serializable {
    public static final C0O1V Companion = new C0O1V();
    public String avatar;
    public long currentFreqCtrl;
    public int currentIndex;
    public String enterFrom;
    public String enterMethod;
    public String filterReason;
    public String intelligentTriggerId;
    public Boolean pitayaSuccess;

    @C09CT("instances")
    public List<PopupInstanceConfig> popupInstances;
    public String popupTriggerId;

    @C09CT("scene_id")
    public String sceneId;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int sceneStatus;

    @C09CT("sub_scene_id")
    public String subSceneId;
    public String sysPage;
    public String targetUserName;
    public String trigger;
    public long triggerTS;
    public boolean useServer;

    public int hashCode() {
        int iHashCode = ((((((((((((((this.sceneId.hashCode() * 31) + this.subSceneId.hashCode()) * 31) + this.sceneStatus) * 31) + C786410Ut5.Z2(this.useServer)) * 31) + this.enterFrom.hashCode()) * 31) + this.enterMethod.hashCode()) * 31) + this.trigger.hashCode()) * 31) + C786410Ut5.Y2(this.triggerTS)) * 31;
        Boolean bool = this.pitayaSuccess;
        int iHashCode2 = (((((((((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31) + C786410Ut5.Y2(this.currentFreqCtrl)) * 31) + this.filterReason.hashCode()) * 31) + this.popupTriggerId.hashCode()) * 31) + this.intelligentTriggerId.hashCode()) * 31;
        String str = this.avatar;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.targetUserName;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.sysPage;
        int iHashCode5 = (((iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.currentIndex) * 31;
        List<PopupInstanceConfig> list = this.popupInstances;
        return iHashCode5 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "UnifiedAuthPopupConfig(sceneId=" + this.sceneId + ", subSceneId=" + this.subSceneId + ", sceneStatus=" + this.sceneStatus + ", useServer=" + this.useServer + ", enterFrom=" + this.enterFrom + ", enterMethod=" + this.enterMethod + ", trigger=" + this.trigger + ", triggerTS=" + this.triggerTS + ", pitayaSuccess=" + this.pitayaSuccess + ", currentFreqCtrl=" + this.currentFreqCtrl + ", filterReason=" + this.filterReason + ", popupTriggerId=" + this.popupTriggerId + ", intelligentTriggerId=" + this.intelligentTriggerId + ", avatar=" + this.avatar + ", targetUserName=" + this.targetUserName + ", sysPage=" + this.sysPage + ", currentIndex=" + this.currentIndex + ", popupInstances=" + this.popupInstances + ')';
    }

    public UnifiedAuthPopupConfig() {
        this("", "", 1, false, "", "", "", 0L, Boolean.FALSE, 0L, "", "", "", null, null, null, 0, null);
    }

    public final void setAvatar(String str) {
        this.avatar = str;
    }

    public final void setCurrentFreqCtrl(long j) {
        this.currentFreqCtrl = j;
    }

    public final void setCurrentIndex(int i) {
        this.currentIndex = i;
    }

    public final void setEnterFrom(String str) {
        this.enterFrom = str;
    }

    public final void setEnterMethod(String str) {
        this.enterMethod = str;
    }

    public final void setFilterReason(String str) {
        this.filterReason = str;
    }

    public final void setIntelligentTriggerId(String str) {
        this.intelligentTriggerId = str;
    }

    public final void setPitayaSuccess(Boolean bool) {
        this.pitayaSuccess = bool;
    }

    public final void setPopupInstances(List<PopupInstanceConfig> list) {
        this.popupInstances = list;
    }

    public final void setPopupTriggerId(String str) {
        this.popupTriggerId = str;
    }

    public final void setSceneId(String str) {
        this.sceneId = str;
    }

    public final void setSceneStatus(int i) {
        this.sceneStatus = i;
    }

    public final void setSubSceneId(String str) {
        this.subSceneId = str;
    }

    public final void setSysPage(String str) {
        this.sysPage = str;
    }

    public final void setTargetUserName(String str) {
        this.targetUserName = str;
    }

    public final void setTrigger(String str) {
        this.trigger = str;
    }

    public final void setTriggerTS(long j) {
        this.triggerTS = j;
    }

    public final void setUseServer(boolean z) {
        this.useServer = z;
    }

    public UnifiedAuthPopupConfig(String str, String str2, int i, boolean z, String str3, String str4, String str5, long j, Boolean bool, long j2, String str6, String str7, String str8, String str9, String str10, String str11, int i2, List<PopupInstanceConfig> list) {
        this.sceneId = str;
        this.subSceneId = str2;
        this.sceneStatus = i;
        this.useServer = z;
        this.enterFrom = str3;
        this.enterMethod = str4;
        this.trigger = str5;
        this.triggerTS = j;
        this.pitayaSuccess = bool;
        this.currentFreqCtrl = j2;
        this.filterReason = str6;
        this.popupTriggerId = str7;
        this.intelligentTriggerId = str8;
        this.avatar = str9;
        this.targetUserName = str10;
        this.sysPage = str11;
        this.currentIndex = i2;
        this.popupInstances = list;
    }
}
