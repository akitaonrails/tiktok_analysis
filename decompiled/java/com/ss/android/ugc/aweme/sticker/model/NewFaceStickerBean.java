package com.ss.android.ugc.aweme.sticker.model;

import X.C09CT;
import X.C0PVY;
import X.EnumC1397990mU1;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class NewFaceStickerBean implements Serializable {

    @C09CT("attributions")
    public List<EffectAttribution> attributions;

    @C09CT("avatar_thumb")
    public UrlModel avatarThumb;

    @C09CT("challenge_guide")
    public ChallengeGuide challengeGuide;

    @C09CT("children")
    public List<String> children;

    @C09CT("commerce_sticker")
    public CommerceSticker commerceSticker;

    @C09CT("desc")
    public String desc;

    @C09CT("effect_id")
    public String effectId;

    @C09CT("effect_source")
    public int effectSource;

    @C09CT("effect_creator_type")
    public int effectType;

    @C09CT("extra")
    public String extra;

    @C09CT("icon_url")
    public UrlModel iconUrl;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public String id;

    @C09CT("can_be_edited")
    public boolean isEditable;

    @C09CT("is_favorite")
    public boolean isFavorite;

    @C09CT("is_top_effect")
    public boolean isTopEffect;

    @C09CT("linked_anchors")
    public List<EffectAnchor> linkedAnchors;
    public LogPbBean logPbBean;
    public boolean mIsSelect;

    @C09CT("sec_uid")
    public String mSecUid;

    @C09CT("tags")
    public List<String> mTags;

    @C09CT("template_info")
    public MobileEffectTemplateInfo mobileEffectTemplate;

    @C09CT("modified_at")
    public long modifiedAt;

    @C09CT("name")
    public String name;

    @C09CT("owner_id")
    public String ownerId;

    @C09CT("owner_nickname")
    public String ownerName;

    @C09CT("owner_verified_type")
    public int ownerVerifiedType;

    @C09CT("publish_time")
    public long publishTimeMillis;

    @C09CT("related_aweme")
    public Aweme relatedAweme;

    @C09CT("user_count")
    public long userCount;

    @C09CT("vv_count")
    public long viewCount;

    @C09CT("share_info")
    public ShareInfo shareInfo = new ShareInfo();

    @C09CT("featured_video_source")
    public int featureVideoSource = EnumC1397990mU1.AUTO_BIND.featureVideoSource;
    public boolean isFriendVideoPresent = false;
    public boolean isFollowerVideoPresent = false;

    @C09CT("moderation_status")
    public int moderationStatus = 0;

    @C09CT("reject_reason_content")
    public RejectContentBean rejectReasonContentBean = null;

    @C09CT("reject_instruction_content")
    public RejectContentBean rejectHowToFixContentBean = null;

    @C09CT("is_top_effect_designer")
    public boolean isTopDesigner = false;

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.id});
    }

    public EnumC1397990mU1 getFeatureVideoSource() {
        return EnumC1397990mU1.getCurrentFeatureVideoSource(this.featureVideoSource);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return C0PVY.LIZ(this.id, ((NewFaceStickerBean) obj).id);
        }
        return false;
    }
}
