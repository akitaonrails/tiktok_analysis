package com.ss.android.ugc.aweme.im.message.content;

import X.C08FF;
import X.C09CT;
import X.C0IB8;
import X.C0IB9;
import X.C0IBA;
import X.C0ZCV;
import X.C2188811AlT;
import X.C2254308sP;
import X.C869590Y9l;
import X.InterfaceC1294060jmO;
import X.InterfaceC2044707zh;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.message.template.component.FallbackStatusComponent;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes15.dex */
public class BaseContent extends C0ZCV implements Serializable {

    @C09CT("ext")
    public SystemContent _extContent;

    @C09CT("prev_conv_id")
    public String prevConvId;

    @C09CT("prev_id")
    public Long prevId;

    @C09CT("reference_video")
    public ReferenceVideo refVideo;

    @C09CT("root_conv_id")
    public String rootConvId;

    @C09CT("root_id")
    public Long rootId;

    @C09CT("root_relation_tag")
    public String rootRelationTag;

    @C09CT("aweType")
    public int type;

    @C09CT("is_card")
    public Boolean isCard = Boolean.FALSE;

    @C09CT("sendStartTime")
    public Long sendStartTime = 0L;

    @C09CT("reference_scene")
    public Integer referenceScene = 0;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ReferenceSceneType {
        public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
        public static final /* synthetic */ ReferenceSceneType[] $VALUES;
        public static final ReferenceSceneType NONE = new ReferenceSceneType("NONE", 0);
        public static final ReferenceSceneType NUDGE_LIKE = new ReferenceSceneType("NUDGE_LIKE", 1);
        public static final ReferenceSceneType NUDGE_FAVOURITE = new ReferenceSceneType("NUDGE_FAVOURITE", 2);
        public static final ReferenceSceneType NUDGE_REPOST = new ReferenceSceneType("NUDGE_REPOST", 3);
        public static final ReferenceSceneType REPLY_TO_REPOST = new ReferenceSceneType("REPLY_TO_REPOST", 4);
        public static final ReferenceSceneType QUOTED_PREVIEW = new ReferenceSceneType("QUOTED_PREVIEW", 5);
        public static final ReferenceSceneType RECENT_ACTIVITY_POST = new ReferenceSceneType("RECENT_ACTIVITY_POST", 6);
        public static final ReferenceSceneType RECENT_ACTIVITY_REPOST = new ReferenceSceneType("RECENT_ACTIVITY_REPOST", 7);
        public static final ReferenceSceneType REPLY_TO_REPOST_NEW = new ReferenceSceneType("REPLY_TO_REPOST_NEW", 8);
        public static final ReferenceSceneType STORY_REPLY = new ReferenceSceneType("STORY_REPLY", 9);
        public static final ReferenceSceneType SHARE_COMMENT = new ReferenceSceneType("SHARE_COMMENT", 10);
        public static final ReferenceSceneType SHARED_REPOST = new ReferenceSceneType("SHARED_REPOST", 11);

        public static final /* synthetic */ ReferenceSceneType[] $values() {
            return new ReferenceSceneType[]{NONE, NUDGE_LIKE, NUDGE_FAVOURITE, NUDGE_REPOST, REPLY_TO_REPOST, QUOTED_PREVIEW, RECENT_ACTIVITY_POST, RECENT_ACTIVITY_REPOST, REPLY_TO_REPOST_NEW, STORY_REPLY, SHARE_COMMENT, SHARED_REPOST};
        }

        public static InterfaceC2044707zh<ReferenceSceneType> getEntries() {
            return $ENTRIES;
        }

        static {
            ReferenceSceneType[] referenceSceneTypeArr$values = $values();
            $VALUES = referenceSceneTypeArr$values;
            $ENTRIES = new C2254308sP(referenceSceneTypeArr$values);
        }

        public static ReferenceSceneType[] values() {
            return (ReferenceSceneType[]) $VALUES.clone();
        }

        public static ReferenceSceneType valueOf(String str) {
            return (ReferenceSceneType) C08FF.LIZ(ReferenceSceneType.class, str);
        }

        public ReferenceSceneType(String str, int i) {
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class ReferenceVideo implements Serializable {

        @C09CT("expire_at")
        public long expireAt;

        @C09CT("reference_video_cover_url")
        public UrlModel refVideoCoverUrl;

        @C09CT("reference_video_is_story")
        public boolean refVideoIsStory;

        @C09CT("reference_video_id")
        public String refVideoId = "";

        @C09CT("reference_video_author_uid")
        public String refVideoAuthorUid = "";

        @C09CT("reference_video_author_secuid")
        public String refVideoAuthorSecUid = "";

        @C09CT("reference_video_aweme_type")
        public int refVideoAwemeType = -1;

        @C09CT("video_status")
        public int status = FallbackStatusComponent.UNKNOWN.getValue();

        @C09CT("origin_author_uid")
        public long originAuthorId = -1;

        @InterfaceC1294060jmO
        public static /* synthetic */ void getStatus$annotations() {
        }

        public final FallbackStatusComponent getFallbackStatusComponent() {
            C0IB9 c0ib9 = FallbackStatusComponent.Companion;
            int i = this.status;
            c0ib9.getClass();
            return C0IB8.LIZ(C0IBA.fromValue(i));
        }

        public final long getExpireAt() {
            return this.expireAt;
        }

        public final long getOriginAuthorId() {
            return this.originAuthorId;
        }

        public final String getRefVideoAuthorSecUid() {
            return this.refVideoAuthorSecUid;
        }

        public final String getRefVideoAuthorUid() {
            return this.refVideoAuthorUid;
        }

        public final int getRefVideoAwemeType() {
            return this.refVideoAwemeType;
        }

        public final UrlModel getRefVideoCoverUrl() {
            return this.refVideoCoverUrl;
        }

        public final String getRefVideoId() {
            return this.refVideoId;
        }

        public final boolean getRefVideoIsStory() {
            return this.refVideoIsStory;
        }

        public final int getStatus() {
            return this.status;
        }

        public final void setExpireAt(long j) {
            this.expireAt = j;
        }

        public final void setFallbackStatusComponent(FallbackStatusComponent fallbackStatusComponent) {
            this.status = fallbackStatusComponent.getValue();
        }

        public final void setOriginAuthorId(long j) {
            this.originAuthorId = j;
        }

        public final void setRefVideoAuthorSecUid(String str) {
            this.refVideoAuthorSecUid = str;
        }

        public final void setRefVideoAuthorUid(String str) {
            this.refVideoAuthorUid = str;
        }

        public final void setRefVideoAwemeType(int i) {
            this.refVideoAwemeType = i;
        }

        public final void setRefVideoCoverUrl(UrlModel urlModel) {
            this.refVideoCoverUrl = urlModel;
        }

        public final void setRefVideoId(String str) {
            this.refVideoId = str;
        }

        public final void setRefVideoIsStory(boolean z) {
            this.refVideoIsStory = z;
        }

        public final void setStatus(int i) {
            this.status = i;
        }
    }

    public List<UrlModel> getPreloadUrlList() {
        return null;
    }

    public final SystemContent getExtContent() {
        SystemContent systemContent = this._extContent;
        if (systemContent != null) {
            systemContent.type = 100;
        }
        return systemContent;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(getClass().getSimpleName());
        sbLIZ.append("{type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", prevId=");
        sbLIZ.append(this.prevId);
        sbLIZ.append(", rootId=");
        sbLIZ.append(this.rootId);
        sbLIZ.append(", prevConvId=");
        sbLIZ.append(this.prevConvId);
        sbLIZ.append(", rootConvId=");
        sbLIZ.append(this.rootConvId);
        sbLIZ.append(", isCard=");
        sbLIZ.append(this.isCard);
        sbLIZ.append(", refVide=");
        sbLIZ.append(this.refVideo);
        sbLIZ.append(", extContent=");
        sbLIZ.append(this._extContent);
        sbLIZ.append(", sendStartTime=");
        sbLIZ.append(this.sendStartTime);
        sbLIZ.append(", rootRelationTag=");
        sbLIZ.append(this.rootRelationTag);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getPrevConvId() {
        return this.prevConvId;
    }

    public final Long getPrevId() {
        return this.prevId;
    }

    public final ReferenceVideo getRefVideo() {
        return this.refVideo;
    }

    public final Integer getReferenceScene() {
        return this.referenceScene;
    }

    public final String getRootConvId() {
        return this.rootConvId;
    }

    public final Long getRootId() {
        return this.rootId;
    }

    public final String getRootRelationTag() {
        return this.rootRelationTag;
    }

    public final Long getSendStartTime() {
        return this.sendStartTime;
    }

    public final Boolean isCard() {
        return this.isCard;
    }

    public final void copyBaseContentRequestFieldsFrom(BaseContent baseContent) {
        this.type = baseContent.type;
        this.prevId = baseContent.prevId;
        this.rootId = baseContent.rootId;
        this._extContent = baseContent._extContent;
        this.refVideo = baseContent.refVideo;
        this.prevConvId = baseContent.prevConvId;
        this.rootConvId = baseContent.rootConvId;
        this.rootRelationTag = baseContent.rootRelationTag;
        this.isCard = null;
        this.sendStartTime = null;
        this.refVideo = baseContent.refVideo;
        this.referenceScene = baseContent.referenceScene;
    }

    public Map<String, String> getExtForShare(C869590Y9l c869590Y9l) {
        return c869590Y9l.getExt();
    }

    public final void setCard(Boolean bool) {
        this.isCard = bool;
    }

    public final void setPrevConvId(String str) {
        this.prevConvId = str;
    }

    public final void setPrevId(Long l) {
        this.prevId = l;
    }

    public final void setRefVideo(ReferenceVideo referenceVideo) {
        this.refVideo = referenceVideo;
    }

    public final void setReferenceScene(Integer num) {
        this.referenceScene = num;
    }

    public final void setRootConvId(String str) {
        this.rootConvId = str;
    }

    public final void setRootId(Long l) {
        this.rootId = l;
    }

    public final void setRootRelationTag(String str) {
        this.rootRelationTag = str;
    }

    public final void setSendStartTime(Long l) {
        this.sendStartTime = l;
    }

    public final void wrapForward(long j, String str, String str2) {
        if (j > 0 && !TextUtils.isEmpty(str)) {
            this.prevId = Long.valueOf(j);
            Long l = this.rootId;
            if (l == null || l.longValue() <= 0) {
                this.rootId = Long.valueOf(j);
            }
            this.prevConvId = str;
            if (TextUtils.isEmpty(this.rootConvId)) {
                this.rootConvId = str;
            }
            if (TextUtils.isEmpty(this.rootRelationTag)) {
                this.rootRelationTag = str2;
            }
        }
    }
}
