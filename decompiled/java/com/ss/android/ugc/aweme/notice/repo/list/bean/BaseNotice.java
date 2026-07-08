package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import X.C0PVY;
import X.C1697810uHb;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes29.dex */
public class BaseNotice implements Cloneable {
    public static final int CREATOR = 62;
    public static final int RECOMMEND_LIVE = 50;

    @C09CT("account_type")
    public String accountType;

    @C09CT("ad")
    public AdHelperNotice adHelperNotice;

    @C09CT("affinity_score")
    public float affinityScore;

    @C09CT("announcement")
    public AnnouncementNotice announcement;

    @C09CT("at")
    public AtMe atMe;

    @C09CT("biz_notice")
    public BusinessAccountNotice businessAccountNotice;

    @C09CT("category_title")
    public String categoryTitle;

    @C09CT("channel_category")
    public int channelCategory;

    @C09CT("channel_info")
    public NoticeChannelInfo channelInfo;

    @C09CT("check_profile")
    public CheckProfileNotice checkProfileNotice;

    @C09CT("comment")
    public CommentNotice commentNotice;

    @C09CT("create_time")
    public long createTime;
    public String dataSourceInterfaceName;

    @C09CT("digg")
    public DiggNotice diggNotice;

    @C09CT("disable_info")
    public NoticeDisableInfo disableInfo;

    @C09CT("donation")
    public DonationNotice donationNotice;

    @C09CT("duet")
    public DuetNotice duetNotice;

    @C09CT("follow_request_approve")
    public FollowApproveNotice followApproveNotice;

    @C09CT("follow")
    public FollowNotice followNotice;

    @C09CT("friend")
    public FriendNotice friendNotice;

    @C09CT("has_read")
    public boolean hasRead;

    @C09CT("info_photo_boosted_vv")
    public String infoPhotoBoostedVv;

    @C09CT("info_photo_total_vv")
    public String infoPhotoTotalVv;

    @C09CT("is_friend")
    public boolean isFriend;

    @C09CT("is_priority")
    public boolean isPriority;
    public transient long lastReadTime;
    public transient LogPbBean logPbBean;

    @C09CT("lowest_position")
    public int lowestPosition;

    @C09CT("should_collapse")
    public boolean needCollapse;

    @C09CT("nid")
    public String nid;

    @C09CT("frequency_configs")
    public List<NoticeFrequencyControlConfig> noticeFrequencyList;
    public transient int noticeListType;

    @C09CT("group_id")
    public String photoBoostedGroupId;

    @C09CT("create_aweme")
    public PostNotice postNotice;
    public transient int priority;

    @C09CT("promote_notice")
    public PromoteNotice promoteNotice;

    @C09CT("search_highlights")
    public List<SearchHighLights> searchHighLights;

    @C09CT("task_id")
    public long taskId;

    @C09CT("tcm_notice")
    public TcmNotice tcmNotice;

    @C09CT("template_id")
    public String templateId;

    @C09CT("template_notice")
    public GeneralTemplateNotice templateNotice;

    @C09CT("text")
    public UserTextNotice textNotice;

    @C09CT("type")
    public int type;
    public transient int unreadCount;

    @C09CT("unsubscribed_status")
    public int unsubscribedStatus;

    @C09CT("user_id")
    public String userId;

    @C09CT("vote_notice")
    public VoteNotice voteNotice;
    public transient int timeLineType = -1;
    public transient int clientOrder = -1;

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.type), this.nid, Long.valueOf(this.createTime), Boolean.valueOf(this.hasRead), this.followNotice});
    }

    public String getAccountType() {
        AnnouncementNotice announcementNotice;
        String strValueOf;
        CommentNotice commentNotice;
        if (TextUtils.isEmpty(this.accountType)) {
            GeneralTemplateNotice generalTemplateNotice = this.templateNotice;
            if (generalTemplateNotice != null) {
                strValueOf = "ai_remix";
                try {
                    String str = generalTemplateNotice.messageExtra;
                    JSONObject jSONObject = str != null ? new JSONObject(str) : new JSONObject();
                    String strOptString = jSONObject.optString("business_extra");
                    JSONObject jSONObject2 = strOptString != null ? new JSONObject(strOptString) : new JSONObject();
                    if (Intrinsics.LJFF(jSONObject2.optString("account_type"), "ai_theater")) {
                        strValueOf = "ai_theater";
                    } else if (!Intrinsics.LJFF(jSONObject2.optString("account_type"), "ai_remix")) {
                        strValueOf = jSONObject.optString("account_type");
                        if (strValueOf.length() == 0) {
                            strValueOf = jSONObject2.optString("account_type");
                        }
                    }
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                this.accountType = strValueOf;
            } else {
                if (this.type == 31 && (commentNotice = this.commentNotice) != null && commentNotice.isReplyWithVideo()) {
                    CommentNotice commentNotice2 = this.commentNotice;
                    Integer numValueOf = commentNotice2 != null ? Integer.valueOf(commentNotice2.getCommentType()) : null;
                    strValueOf = (numValueOf == null || numValueOf.intValue() != 17) ? (numValueOf == null || numValueOf.intValue() != 18) ? (numValueOf == null || numValueOf.intValue() != 19) ? "" : "video_reply_like" : "video_reply_reply" : "video_reply_comment";
                } else {
                    int i = this.type;
                    if (i == 41) {
                        strValueOf = "like";
                    } else if (i == 31) {
                        strValueOf = "comment";
                    } else if (i == 45) {
                        strValueOf = "at";
                    } else if (i == 21) {
                        strValueOf = "duet";
                    } else if (i == 33) {
                        strValueOf = "fans";
                    } else if (i == 23) {
                        strValueOf = "follow_accept";
                    } else {
                        strValueOf = ((i != 1 && i != 11) || (announcementNotice = this.announcement) == null || announcementNotice.getChallenge() == null) ? false : true ? "tag" : String.valueOf(this.type);
                    }
                }
                this.accountType = strValueOf;
            }
        }
        return this.accountType;
    }

    public String getTemplateId() {
        String str;
        String str2 = "";
        try {
            GeneralTemplateNotice generalTemplateNotice = this.templateNotice;
            String strOptString = ((generalTemplateNotice == null || (str = generalTemplateNotice.messageExtra) == null) ? new JSONObject() : new JSONObject(str)).optString("business_extra");
            JSONObject jSONObject = strOptString != null ? new JSONObject(strOptString) : new JSONObject();
            String strOptString2 = jSONObject.optString("account_type");
            if (strOptString2 == null) {
                strOptString2 = "";
            }
            String strOptString3 = jSONObject.optString("template_id");
            if (strOptString3 == null) {
                strOptString3 = "";
            }
            if (C1697810uHb.LJIIJJI("ai_theater", "ai_remix").contains(strOptString2)) {
                if (strOptString3.length() > 0) {
                    str2 = strOptString3;
                }
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return TextUtils.isEmpty(str2) ? this.templateId : str2;
    }

    public boolean isUnsubscribe() {
        return this.unsubscribedStatus == 1;
    }

    public boolean needForceInsert() {
        int i = this.type;
        return (i == 1 || i == 2) && this.lowestPosition > 0;
    }

    public boolean supportUnsubscribe() {
        return this.unsubscribedStatus != 0;
    }

    public String unsubscribeStatusToMob() {
        int i = this.unsubscribedStatus;
        return i == 1 ? "unsubscribed" : i == 2 ? "subscribed" : "normal";
    }

    @Override // 
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public BaseNotice mo291clone() {
        try {
            return (BaseNotice) super.clone();
        } catch (CloneNotSupportedException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new AssertionError();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BaseNotice baseNotice = (BaseNotice) obj;
        if (this.type == baseNotice.type && C0PVY.LIZ(this.nid, baseNotice.nid) && this.createTime == baseNotice.createTime && this.hasRead == baseNotice.hasRead && C0PVY.LIZ(this.followNotice, baseNotice.followNotice) && C0PVY.LIZ(this.diggNotice, baseNotice.diggNotice) && C0PVY.LIZ(this.templateNotice, baseNotice.templateNotice) && C0PVY.LIZ(this.disableInfo, baseNotice.disableInfo) && this.unsubscribedStatus == baseNotice.unsubscribedStatus) {
            return true;
        }
        return false;
    }

    public void setAccountType(String str) {
        this.accountType = str;
    }

    public void setTemplateId(String str) {
        this.templateId = str;
    }

    public void updateUnsubscribeStatus(Boolean bool) {
        if (bool.booleanValue()) {
            this.unsubscribedStatus = 1;
        } else {
            this.unsubscribedStatus = 2;
        }
    }
}
