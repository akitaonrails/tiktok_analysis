package com.ss.android.ugc.aweme.addyours.model;

import X.C09CT;
import X.InterfaceC2753014t;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class AddYoursTopic implements Serializable, InterfaceC2753014t {

    @C09CT("collect_status")
    public final int collectStatus;

    @C09CT("eoy_campaign")
    public final Boolean eoyCampaign;

    @C09CT("eoy_campaign_schema")
    public final String eoyCampaignSchema;

    @C09CT("from_question")
    public final Boolean fromQuestion;

    @C09CT("inviter_avatars")
    public final List<AddYoursAvatar> inviterAvatars;

    @C09CT("inviters_count")
    public final Long inviterCount;

    @C09CT("suggest_invitee_avatars")
    public final List<AddYoursAvatar> suggestInviteeAvatars;

    @C09CT("text")
    public final String text;

    @C09CT("topic_id")
    public final Long topicId;

    @C09CT("topic_type")
    public final int topicType;

    @C09CT("video")
    public final Aweme video;

    @C09CT("videos_count")
    public final Long videoCount;

    @C09CT("viewer_is_invited")
    public final Boolean viewerInvited;

    public AddYoursTopic() {
        this(null, null, null, null, null, null, null, null, -1, null, Boolean.FALSE, null, 0);
    }

    public final AddYoursTopic copy(Long l, String str, List<AddYoursAvatar> list, Long l2, List<AddYoursAvatar> list2, Long l3, Aweme aweme, Boolean bool, int i, Boolean bool2, Boolean bool3, String str2, int i2) {
        return new AddYoursTopic(l, str, list, l2, list2, l3, aweme, bool, i, bool2, bool3, str2, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddYoursTopic)) {
            return false;
        }
        AddYoursTopic addYoursTopic = (AddYoursTopic) obj;
        return Intrinsics.LJFF(this.topicId, addYoursTopic.topicId) && Intrinsics.LJFF(this.text, addYoursTopic.text) && Intrinsics.LJFF(this.inviterAvatars, addYoursTopic.inviterAvatars) && Intrinsics.LJFF(this.inviterCount, addYoursTopic.inviterCount) && Intrinsics.LJFF(this.suggestInviteeAvatars, addYoursTopic.suggestInviteeAvatars) && Intrinsics.LJFF(this.videoCount, addYoursTopic.videoCount) && Intrinsics.LJFF(this.video, addYoursTopic.video) && Intrinsics.LJFF(this.fromQuestion, addYoursTopic.fromQuestion) && this.collectStatus == addYoursTopic.collectStatus && Intrinsics.LJFF(this.viewerInvited, addYoursTopic.viewerInvited) && Intrinsics.LJFF(this.eoyCampaign, addYoursTopic.eoyCampaign) && Intrinsics.LJFF(this.eoyCampaignSchema, addYoursTopic.eoyCampaignSchema) && this.topicType == addYoursTopic.topicType;
    }

    public String getSourceId() {
        return "AddYoursTopic";
    }

    public int hashCode() {
        Long l = this.topicId;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.text;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<AddYoursAvatar> list = this.inviterAvatars;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Long l2 = this.inviterCount;
        int iHashCode4 = (iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        List<AddYoursAvatar> list2 = this.suggestInviteeAvatars;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Long l3 = this.videoCount;
        int iHashCode6 = (iHashCode5 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Aweme aweme = this.video;
        int iHashCode7 = (iHashCode6 + (aweme == null ? 0 : aweme.hashCode())) * 31;
        Boolean bool = this.fromQuestion;
        int iHashCode8 = (((iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31) + this.collectStatus) * 31;
        Boolean bool2 = this.viewerInvited;
        int iHashCode9 = (iHashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.eoyCampaign;
        int iHashCode10 = (iHashCode9 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str2 = this.eoyCampaignSchema;
        return ((iHashCode10 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.topicType;
    }

    public String toString() {
        return "AddYoursTopic(topicId=" + this.topicId + ", text=" + this.text + ", inviterAvatars=" + this.inviterAvatars + ", inviterCount=" + this.inviterCount + ", suggestInviteeAvatars=" + this.suggestInviteeAvatars + ", videoCount=" + this.videoCount + ", video=" + this.video + ", fromQuestion=" + this.fromQuestion + ", collectStatus=" + this.collectStatus + ", viewerInvited=" + this.viewerInvited + ", eoyCampaign=" + this.eoyCampaign + ", eoyCampaignSchema=" + this.eoyCampaignSchema + ", topicType=" + this.topicType + ')';
    }

    public final int getCollectStatus() {
        return this.collectStatus;
    }

    public final Boolean getEoyCampaign() {
        return this.eoyCampaign;
    }

    public final String getEoyCampaignSchema() {
        return this.eoyCampaignSchema;
    }

    public final Boolean getFromQuestion() {
        return this.fromQuestion;
    }

    public final List<AddYoursAvatar> getInviterAvatars() {
        return this.inviterAvatars;
    }

    public final Long getInviterCount() {
        return this.inviterCount;
    }

    public final List<AddYoursAvatar> getSuggestInviteeAvatars() {
        return this.suggestInviteeAvatars;
    }

    public final String getText() {
        return this.text;
    }

    public final Long getTopicId() {
        return this.topicId;
    }

    public final int getTopicType() {
        return this.topicType;
    }

    public final Aweme getVideo() {
        return this.video;
    }

    public final Long getVideoCount() {
        return this.videoCount;
    }

    public final Boolean getViewerInvited() {
        return this.viewerInvited;
    }

    public AddYoursTopic(Long l, String str, List<AddYoursAvatar> list, Long l2, List<AddYoursAvatar> list2, Long l3, Aweme aweme, Boolean bool, int i, Boolean bool2, Boolean bool3, String str2, int i2) {
        this.topicId = l;
        this.text = str;
        this.inviterAvatars = list;
        this.inviterCount = l2;
        this.suggestInviteeAvatars = list2;
        this.videoCount = l3;
        this.video = aweme;
        this.fromQuestion = bool;
        this.collectStatus = i;
        this.viewerInvited = bool2;
        this.eoyCampaign = bool3;
        this.eoyCampaignSchema = str2;
        this.topicType = i2;
    }
}
