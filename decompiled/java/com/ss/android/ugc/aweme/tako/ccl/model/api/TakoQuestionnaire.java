package com.ss.android.ugc.aweme.tako.ccl.model.api;

import X.C09CT;
import X.C1856360yPK;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoQuestionnaire implements Serializable {
    public static final C1856360yPK Companion = new Object() { // from class: X.0yPK
    };

    @C09CT("anchor_reply_uuid")
    public String anchorReplyUuid;

    @C09CT("anchor_uuid")
    public String anchorUuid;

    @C09CT("character_limit_text")
    public final String characterLimitText;

    @C09CT("extra_info")
    public final String extraInfo;

    @C09CT("follow_message_id")
    public String followMessageId;

    @C09CT("follow_reply_message_id")
    public String followReplyMessageId;

    @C09CT("follow_reply_message_rank")
    public int followReplyMessageRank;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final int id;

    @C09CT("input_tips")
    public final String inputTips;

    @C09CT("level_2_title")
    public final String level2Title;

    @C09CT("options")
    public final List<TakoQuestionnaireText> options;

    @C09CT("star_num")
    public final int starNum;

    @C09CT("submit_toast")
    public final String submitToast;

    @C09CT("title")
    public final String title;

    @C09CT("type")
    public final int type;

    @C09CT("very_bad_text")
    public final String veryBadText;

    @C09CT("very_good_text")
    public final String veryGoodText;

    public TakoQuestionnaire() {
        this(0, 0, null, null, null, null, null, null, null, null, 0, null, null, null, "", "", 0);
    }

    public int hashCode() {
        int i = ((this.id * 31) + this.type) * 31;
        String str = this.title;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.level2Title;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<TakoQuestionnaireText> list = this.options;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.inputTips;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.submitToast;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.veryGoodText;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.veryBadText;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.characterLimitText;
        int iHashCode8 = (((iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31) + this.starNum) * 31;
        String str8 = this.extraInfo;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.anchorUuid;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.anchorReplyUuid;
        return ((((((iHashCode10 + (str10 != null ? str10.hashCode() : 0)) * 31) + this.followMessageId.hashCode()) * 31) + this.followReplyMessageId.hashCode()) * 31) + this.followReplyMessageRank;
    }

    public String toString() {
        return "TakoQuestionnaire(id=" + this.id + ", type=" + this.type + ", title=" + this.title + ", level2Title=" + this.level2Title + ", options=" + this.options + ", inputTips=" + this.inputTips + ", submitToast=" + this.submitToast + ", veryGoodText=" + this.veryGoodText + ", veryBadText=" + this.veryBadText + ", characterLimitText=" + this.characterLimitText + ", starNum=" + this.starNum + ", extraInfo=" + this.extraInfo + ", anchorUuid=" + this.anchorUuid + ", anchorReplyUuid=" + this.anchorReplyUuid + ", followMessageId=" + this.followMessageId + ", followReplyMessageId=" + this.followReplyMessageId + ", followReplyMessageRank=" + this.followReplyMessageRank + ')';
    }

    public final void setAnchorReplyUuid(String str) {
        this.anchorReplyUuid = str;
    }

    public final void setAnchorUuid(String str) {
        this.anchorUuid = str;
    }

    public final void setFollowMessageId(String str) {
        this.followMessageId = str;
    }

    public final void setFollowReplyMessageId(String str) {
        this.followReplyMessageId = str;
    }

    public final void setFollowReplyMessageRank(int i) {
        this.followReplyMessageRank = i;
    }

    public TakoQuestionnaire(int i, int i2, String str, String str2, List<TakoQuestionnaireText> list, String str3, String str4, String str5, String str6, String str7, int i3, String str8, String str9, String str10, String str11, String str12, int i4) {
        this.id = i;
        this.type = i2;
        this.title = str;
        this.level2Title = str2;
        this.options = list;
        this.inputTips = str3;
        this.submitToast = str4;
        this.veryGoodText = str5;
        this.veryBadText = str6;
        this.characterLimitText = str7;
        this.starNum = i3;
        this.extraInfo = str8;
        this.anchorUuid = str9;
        this.anchorReplyUuid = str10;
        this.followMessageId = str11;
        this.followReplyMessageId = str12;
        this.followReplyMessageRank = i4;
    }
}
