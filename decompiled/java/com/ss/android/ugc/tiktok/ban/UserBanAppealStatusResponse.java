package com.ss.android.ugc.tiktok.ban;

import X.C09CT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.network.model.BaseResponse;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class UserBanAppealStatusResponse extends BaseResponse {

    @C09CT("appeal_type")
    public final int appealType;

    @C09CT("appeal_url")
    public final String appealUrl;

    @C09CT("ban_time")
    public final long banTime;

    @C09CT("ban_type")
    public final int banType;

    @C09CT("button_list")
    public final List<PopButton> buttonList;

    @C09CT("popup_accessory")
    public final PopAccessory popAccessory;

    @C09CT("pop_content")
    public final String popContent;

    @C09CT("pop_content_with_url")
    public final TextWithInlineLink popContentWithUrl;

    @C09CT("pop_title")
    public final String popTitle;

    @C09CT("punish_log_id")
    public final String punishId;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final int status;

    public UserBanAppealStatusResponse() {
        this(-1, -1, 0L, -1, null, null, null, null, null, null, "");
    }

    public final UserBanAppealStatusResponse copy(int i, int i2, long j, int i3, String str, String str2, TextWithInlineLink textWithInlineLink, String str3, List<PopButton> list, PopAccessory popAccessory, String str4) {
        return new UserBanAppealStatusResponse(i, i2, j, i3, str, str2, textWithInlineLink, str3, list, popAccessory, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserBanAppealStatusResponse)) {
            return false;
        }
        UserBanAppealStatusResponse userBanAppealStatusResponse = (UserBanAppealStatusResponse) obj;
        return this.status == userBanAppealStatusResponse.status && this.banType == userBanAppealStatusResponse.banType && this.banTime == userBanAppealStatusResponse.banTime && this.appealType == userBanAppealStatusResponse.appealType && Intrinsics.LJFF(this.popTitle, userBanAppealStatusResponse.popTitle) && Intrinsics.LJFF(this.popContent, userBanAppealStatusResponse.popContent) && Intrinsics.LJFF(this.popContentWithUrl, userBanAppealStatusResponse.popContentWithUrl) && Intrinsics.LJFF(this.appealUrl, userBanAppealStatusResponse.appealUrl) && Intrinsics.LJFF(this.buttonList, userBanAppealStatusResponse.buttonList) && Intrinsics.LJFF(this.popAccessory, userBanAppealStatusResponse.popAccessory) && Intrinsics.LJFF(this.punishId, userBanAppealStatusResponse.punishId);
    }

    public int hashCode() {
        int iY2 = ((((((this.status * 31) + this.banType) * 31) + C786410Ut5.Y2(this.banTime)) * 31) + this.appealType) * 31;
        String str = this.popTitle;
        int iHashCode = (iY2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.popContent;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        TextWithInlineLink textWithInlineLink = this.popContentWithUrl;
        int iHashCode3 = (iHashCode2 + (textWithInlineLink == null ? 0 : textWithInlineLink.hashCode())) * 31;
        String str3 = this.appealUrl;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<PopButton> list = this.buttonList;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        PopAccessory popAccessory = this.popAccessory;
        return ((iHashCode5 + (popAccessory != null ? popAccessory.hashCode() : 0)) * 31) + this.punishId.hashCode();
    }

    public String toString() {
        return "UserBanAppealStatusResponse(status=" + this.status + ", banType=" + this.banType + ", banTime=" + this.banTime + ", appealType=" + this.appealType + ", popTitle=" + this.popTitle + ", popContent=" + this.popContent + ", popContentWithUrl=" + this.popContentWithUrl + ", appealUrl=" + this.appealUrl + ", buttonList=" + this.buttonList + ", popAccessory=" + this.popAccessory + ", punishId=" + this.punishId + ')';
    }

    public final int getAppealType() {
        return this.appealType;
    }

    public final String getAppealUrl() {
        return this.appealUrl;
    }

    public final long getBanTime() {
        return this.banTime;
    }

    public final int getBanType() {
        return this.banType;
    }

    public final List<PopButton> getButtonList() {
        return this.buttonList;
    }

    public final PopAccessory getPopAccessory() {
        return this.popAccessory;
    }

    public final String getPopContent() {
        return this.popContent;
    }

    public final TextWithInlineLink getPopContentWithUrl() {
        return this.popContentWithUrl;
    }

    public final String getPopTitle() {
        return this.popTitle;
    }

    public final String getPunishId() {
        return this.punishId;
    }

    public final int getStatus() {
        return this.status;
    }

    public UserBanAppealStatusResponse(int i, int i2, long j, int i3, String str, String str2, TextWithInlineLink textWithInlineLink, String str3, List<PopButton> list, PopAccessory popAccessory, String str4) {
        this.status = i;
        this.banType = i2;
        this.banTime = j;
        this.appealType = i3;
        this.popTitle = str;
        this.popContent = str2;
        this.popContentWithUrl = textWithInlineLink;
        this.appealUrl = str3;
        this.buttonList = list;
        this.popAccessory = popAccessory;
        this.punishId = str4;
    }
}
