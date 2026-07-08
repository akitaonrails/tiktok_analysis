package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import X.C2188811AlT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdkapi.message.BaseMessage;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import java.util.Comparator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class MemberMessage extends AbstractC1136060ffY implements Comparator {
    public boolean LLILLJJLI;

    @C09CT("action")
    public int action;

    @C09CT("action_description")
    public String actionDescription;

    @C09CT("action_duration")
    public Long actionDuration;

    @C09CT("admin_permissions")
    public Map<Integer, Integer> adminPermissions;

    @C09CT("allow_preview_time")
    public long allowPreviewTime;

    @C09CT("anchor_display_text")
    public Text anchorDisplayText;

    @C09CT("background_image_v2")
    public ImageModel background;

    @C09CT("client_enter_source")
    public String clientEnterSource;

    @C09CT("client_enter_type")
    public String clientEnterType;

    @C09CT("client_live_reason")
    public String clientLiveReason;

    @C09CT("member_count")
    public int count;

    @C09CT("display_style")
    public int displayStyle;

    @C09CT("enter_effect_config")
    public EffectConfigBean effectConfig;

    @C09CT("enter_type")
    public int enterType;

    @C09CT("hit_ab_status")
    public int hitAbStatus;

    @C09CT("is_top_user")
    public boolean isTopUser;

    @C09CT("kick_source")
    public int kickSource;

    @C09CT("last_subscription_action")
    public long lastSubscriptionAction;

    @C09CT("live_sub_only_month")
    public long liveSubOnlyMonth;

    @C09CT("live_sub_only_tier")
    public long liveSubOnlyTier;

    @C09CT("operator")
    public User operator;

    @C09CT("pop_str")
    public String popStr;

    @C09CT("public_area_message_common")
    public PublicAreaMessageCommon publicAreaMessageCommon;

    @C09CT("rank_score")
    public int rankScore;

    @C09CT("is_set_to_admin")
    public boolean setToAdmin;

    @C09CT("show_wave")
    public long showWave;

    @C09CT("top_user_no")
    public int topUserNo;

    @C09CT("user")
    public User user;

    @C09CT("user_id")
    public long userId;

    @C09CT("user_share_type")
    public String userShareType;

    @C09CT("wave_algorithm_data")
    public WaveAlgorithmData waveAlgorithmData;

    @C09CT("ec_streamer_key")
    public String ecStreamerKey = "";
    public transient String LL = "";
    public boolean LLILLL = true;

    public static class EffectConfigBean {

        @C09CT("badge")
        public ImageModel badge;

        @C09CT("icon")
        public ImageModel icon;

        @C09CT("text")
        public Text textKey;

        @C09CT("type")
        public int type;
    }

    @Override // com.bytedance.android.livesdkapi.message.BaseMessage
    public final boolean canText() {
        return (this.user != null && (this.LLILLJJLI || this.action != 7)) || this.action == 47;
    }

    public final int hashCode() {
        CommonMessageData commonMessageData = this.baseMessage;
        return commonMessageData != null ? Objects.hash(Long.valueOf(commonMessageData.messageId)) : super.hashCode();
    }

    @Override // X.AbstractC1136060ffY
    public final boolean supportDisplayText() {
        CommonMessageData commonMessageData;
        return (!this.LLILLL || (commonMessageData = this.baseMessage) == null || commonMessageData.displayText == null || this.isTopUser) ? false : true;
    }

    public MemberMessage() {
        this.type = C001A.MEMBER;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MemberMessage{action=");
        sbLIZ.append(this.action);
        sbLIZ.append(", enterType=");
        sbLIZ.append(this.enterType);
        sbLIZ.append(", actionDescription='");
        sbLIZ.append(this.actionDescription);
        sbLIZ.append('\'');
        sbLIZ.append(", enterEffectConfig=");
        sbLIZ.append(this.effectConfig);
        sbLIZ.append(", userId=");
        sbLIZ.append(this.userId);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        CommonMessageData commonMessageData;
        CommonMessageData commonMessageData2;
        if (!(obj instanceof MemberMessage) || (commonMessageData = ((BaseMessage) obj).baseMessage) == null || (commonMessageData2 = this.baseMessage) == null || commonMessageData2.messageId != commonMessageData.messageId) {
            return false;
        }
        return true;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = ((MemberMessage) obj).rankScore;
        int i2 = ((MemberMessage) obj2).rankScore;
        if (i == i2) {
            return -1;
        }
        return i - i2;
    }
}
