package com.bytedance.android.livesdk.event;

import X.EnumC495990Jcj;
import com.bytedance.android.live.base.model.user.User;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class UserProfileEvent {
    public String anchorRecommendationType;
    public boolean battleEnable;
    public boolean canRecognizeEnigmaSetManually;
    public String cardEnterFrom;
    public String chatType;
    public String clickMethod;
    public String clickModule;
    public boolean coHostEnable;
    public String content;
    public String crmLabel;
    public boolean currentHasMultiCoHostPermission;
    public long currentMultiCoHostGuestId;
    public int disableNavigateBadgeType;
    public String enigmaEnterFrom;
    public boolean enigmaSetManually;
    public Map<String, String> extraParams;
    public String fromLiveModule;
    public String interactLogLabel;
    public boolean isFromProgrammedLiveFollowCard;
    public boolean isFromProgrammedLiveMenu;
    public Boolean isShowMask;
    public boolean linkInRoomEnable;
    public String mClickUserPosition;
    public Boolean mEnterFromRankList;
    public String mEventModule;
    public String mEventPage;
    public Map<String, String> mRankInfo;
    public String mReportType;
    public int mScene;
    public String mShowEntrance;
    public String mSource;
    public String messageType;
    public long msgId;
    public int multiGuestLinkmicAudienceNoticeType;
    public long pinId;
    public long pinMsgId;
    public boolean playLeagueAnim;
    public long releaseId;
    public long roomId;
    public Map<String, String> trackExtra;
    public User user;
    public long userId;

    public boolean isCanRecognizeEnigma() {
        if (this.canRecognizeEnigmaSetManually || this.enigmaSetManually) {
            return true;
        }
        User user = this.user;
        return (user == null || user.enigmaInfo == null) ? false : true;
    }

    public boolean isEnigma() {
        User.EnigmaInfo enigmaInfo;
        if (this.enigmaSetManually) {
            return true;
        }
        User user = this.user;
        if (user == null || (enigmaInfo = user.enigmaInfo) == null) {
            return false;
        }
        return enigmaInfo.isEnigmaMaskOn;
    }

    public Boolean getEnterFromRankList() {
        return this.mEnterFromRankList;
    }

    public String getFromLiveModule() {
        return this.fromLiveModule;
    }

    public int getMultiGuestLinkmicAudienceNoticeType() {
        return this.multiGuestLinkmicAudienceNoticeType;
    }

    public UserProfileEvent(User user) {
        Boolean bool = Boolean.FALSE;
        this.mEnterFromRankList = bool;
        this.mEventPage = null;
        this.content = "";
        this.clickModule = "";
        this.clickMethod = "";
        this.coHostEnable = false;
        this.battleEnable = false;
        this.linkInRoomEnable = true;
        this.currentHasMultiCoHostPermission = false;
        this.chatType = "1";
        this.mReportType = "report_anchor";
        this.isFromProgrammedLiveMenu = false;
        this.isFromProgrammedLiveFollowCard = false;
        this.cardEnterFrom = "";
        this.enigmaEnterFrom = "others";
        this.disableNavigateBadgeType = -1;
        this.fromLiveModule = "";
        this.crmLabel = "";
        this.enigmaSetManually = false;
        this.canRecognizeEnigmaSetManually = false;
        this.multiGuestLinkmicAudienceNoticeType = -1;
        this.playLeagueAnim = false;
        this.isShowMask = bool;
        this.mScene = EnumC495990Jcj.DEFAULT.ordinal();
        if (user != null) {
            this.user = user;
            return;
        }
        throw new RuntimeException("mUser cannot be null!");
    }

    public void setClickModule(String str) {
        this.clickModule = str;
    }

    public void setClickUserPosition(String str) {
        this.mClickUserPosition = str;
    }

    public void setEnigmaOutside(User.EnigmaInfo enigmaInfo) {
        if (enigmaInfo == null) {
            this.enigmaSetManually = false;
            this.canRecognizeEnigmaSetManually = false;
        } else {
            this.enigmaSetManually = enigmaInfo.isEnigmaMaskOn;
            this.canRecognizeEnigmaSetManually = true;
        }
    }

    public void setEnterFromRankList(Boolean bool) {
        this.mEnterFromRankList = bool;
    }

    public void setEventModule(String str) {
        this.mEventModule = str;
    }

    public void setExtraParams(Map<String, String> map) {
        this.extraParams = map;
    }

    public void setFromLiveModule(String str) {
        this.fromLiveModule = str;
    }

    public void setMultiGuestLinkmicAudienceNoticeType(int i) {
        this.multiGuestLinkmicAudienceNoticeType = i;
    }

    public UserProfileEvent(long j) {
        Boolean bool = Boolean.FALSE;
        this.mEnterFromRankList = bool;
        this.mEventPage = null;
        this.content = "";
        this.clickModule = "";
        this.clickMethod = "";
        this.coHostEnable = false;
        this.battleEnable = false;
        this.linkInRoomEnable = true;
        this.currentHasMultiCoHostPermission = false;
        this.chatType = "1";
        this.mReportType = "report_anchor";
        this.isFromProgrammedLiveMenu = false;
        this.isFromProgrammedLiveFollowCard = false;
        this.cardEnterFrom = "";
        this.enigmaEnterFrom = "others";
        this.disableNavigateBadgeType = -1;
        this.fromLiveModule = "";
        this.crmLabel = "";
        this.enigmaSetManually = false;
        this.canRecognizeEnigmaSetManually = false;
        this.multiGuestLinkmicAudienceNoticeType = -1;
        this.playLeagueAnim = false;
        this.isShowMask = bool;
        this.mScene = EnumC495990Jcj.DEFAULT.ordinal();
        this.userId = j;
    }

    public void setEnigmaOutside(boolean z) {
        this.enigmaSetManually = z;
        this.canRecognizeEnigmaSetManually = true;
    }

    public UserProfileEvent(long j, String str) {
        Boolean bool = Boolean.FALSE;
        this.mEnterFromRankList = bool;
        this.mEventPage = null;
        this.content = "";
        this.clickModule = "";
        this.clickMethod = "";
        this.coHostEnable = false;
        this.battleEnable = false;
        this.linkInRoomEnable = true;
        this.currentHasMultiCoHostPermission = false;
        this.chatType = "1";
        this.mReportType = "report_anchor";
        this.isFromProgrammedLiveMenu = false;
        this.isFromProgrammedLiveFollowCard = false;
        this.cardEnterFrom = "";
        this.enigmaEnterFrom = "others";
        this.disableNavigateBadgeType = -1;
        this.fromLiveModule = "";
        this.crmLabel = "";
        this.enigmaSetManually = false;
        this.canRecognizeEnigmaSetManually = false;
        this.multiGuestLinkmicAudienceNoticeType = -1;
        this.playLeagueAnim = false;
        this.isShowMask = bool;
        this.mScene = EnumC495990Jcj.DEFAULT.ordinal();
        this.userId = j;
        this.clickModule = str;
    }

    public UserProfileEvent(User user, String str) {
        this(user);
        this.interactLogLabel = str;
    }
}
