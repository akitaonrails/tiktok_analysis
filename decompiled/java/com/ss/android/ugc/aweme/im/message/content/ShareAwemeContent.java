package com.ss.android.ugc.aweme.im.message.content;

import X.C08FF;
import X.C09CT;
import X.C123100dR;
import X.C2254308sP;
import X.C869590Y9l;
import X.EnumC896390ZEn;
import X.InterfaceC2044707zh;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public class ShareAwemeContent extends BaseContent {
    public static final Companion Companion = new Companion();

    @C09CT("author_username")
    public String authorUsername;

    @C09CT("awemeType")
    public int awemeType;

    @C09CT("content_name")
    public String contentName;

    @C09CT("content_thumb")
    public UrlModel contentThumb;

    @C09CT("cover_url")
    public UrlModel coverUrl;

    @C09CT("diamond_game_id")
    public String diamondGameId;

    @C09CT("cover_height")
    public float height;

    @C09CT("hot_spot_create_time")
    public long hotSpotCreateTime;

    @C09CT("is_ad_fake")
    public boolean isAdFake;

    @C09CT("is_hot_spot_video")
    public boolean isHotSpotVideo;

    @C09CT("isStory")
    public boolean isStory;

    @C09CT("itemId")
    public String itemId;

    @C09CT("need_skip_strange")
    public int needSkipStrange;

    @C09CT("secUID")
    public String secUid;

    @C09CT("send_method")
    public String sendMethod = "";

    @C09CT("content_title")
    public String title;

    @C09CT("uid")
    public String user;

    @C09CT("cover_width")
    public float width;

    public static /* synthetic */ void getAwemeType$annotations() {
    }

    public boolean showQuoteHint() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.im.message.content.BaseContent
    public List<UrlModel> getPreloadUrlList() {
        UrlModel urlModel = this.coverUrl;
        if (urlModel != null) {
            return Collections.singletonList(urlModel);
        }
        return null;
    }

    public final String getAuthorUsername() {
        return this.authorUsername;
    }

    public final int getAwemeType() {
        return this.awemeType;
    }

    public final String getContentName() {
        return this.contentName;
    }

    public final UrlModel getContentThumb() {
        return this.contentThumb;
    }

    public final UrlModel getCoverUrl() {
        return this.coverUrl;
    }

    public final String getDiamondGameId() {
        return this.diamondGameId;
    }

    public final float getHeight() {
        return this.height;
    }

    public final long getHotSpotCreateTime() {
        return this.hotSpotCreateTime;
    }

    public final String getItemId() {
        return this.itemId;
    }

    public final int getNeedSkipStrange() {
        return this.needSkipStrange;
    }

    public final String getSecUid() {
        return this.secUid;
    }

    public final String getSendMethod() {
        return this.sendMethod;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUser() {
        return this.user;
    }

    public final float getWidth() {
        return this.width;
    }

    public final boolean isAdFake() {
        return this.isAdFake;
    }

    public final boolean isHotSpotVideo() {
        return this.isHotSpotVideo;
    }

    public final boolean isStory() {
        return this.isStory;
    }

    public static final class Companion {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class SrcTypes {
            public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
            public static final /* synthetic */ SrcTypes[] $VALUES;
            public final String aSrc;
            public static final SrcTypes VIDEO_MENTION = new SrcTypes("VIDEO_MENTION", 0, "video_mention");
            public static final SrcTypes VIDEO_TAG = new SrcTypes("VIDEO_TAG", 1, "video_tag");
            public static final SrcTypes VIDEO_MENTION_AND_TAG = new SrcTypes("VIDEO_MENTION_AND_TAG", 2, "video_mention_and_tag");
            public static final SrcTypes STORY_MENTION = new SrcTypes("STORY_MENTION", 3, "story_mention");
            public static final SrcTypes ADD_POST_TO_STORY = new SrcTypes("ADD_POST_TO_STORY", 4, "add_post_to_story");
            public static final SrcTypes ADD_STORY_TO_STORY = new SrcTypes("ADD_STORY_TO_STORY", 5, "add_story_to_story");
            public static final SrcTypes VIDEO_REPOST = new SrcTypes("VIDEO_REPOST", 6, "video_repost");
            public static final SrcTypes VIDEO_FAVOURITE = new SrcTypes("VIDEO_FAVOURITE", 7, "video_favourite");
            public static final SrcTypes VIDEO_LIKE = new SrcTypes("VIDEO_LIKE", 8, "video_like");
            public static final SrcTypes VIDEO_COMMENT = new SrcTypes("VIDEO_COMMENT", 9, "video_comment");
            public static final SrcTypes STORY_LIKE = new SrcTypes("STORY_LIKE", 10, "story_like");
            public static final SrcTypes STORY_COMMENT = new SrcTypes("STORY_COMMENT", 11, "story_comment");

            public static final /* synthetic */ SrcTypes[] $values() {
                return new SrcTypes[]{VIDEO_MENTION, VIDEO_TAG, VIDEO_MENTION_AND_TAG, STORY_MENTION, ADD_POST_TO_STORY, ADD_STORY_TO_STORY, VIDEO_REPOST, VIDEO_FAVOURITE, VIDEO_LIKE, VIDEO_COMMENT, STORY_LIKE, STORY_COMMENT};
            }

            public static InterfaceC2044707zh<SrcTypes> getEntries() {
                return $ENTRIES;
            }

            static {
                SrcTypes[] srcTypesArr$values = $values();
                $VALUES = srcTypesArr$values;
                $ENTRIES = new C2254308sP(srcTypesArr$values);
            }

            public static SrcTypes[] values() {
                return (SrcTypes[]) $VALUES.clone();
            }

            public final String getASrc() {
                return this.aSrc;
            }

            public static SrcTypes valueOf(String str) {
                return (SrcTypes) C08FF.LIZ(SrcTypes.class, str);
            }

            public SrcTypes(String str, int i, String str2) {
                this.aSrc = str2;
            }
        }

        public final String getMessageFromForEventTracking(C869590Y9l c869590Y9l) {
            if (c869590Y9l == null) {
                return null;
            }
            if (Intrinsics.LJFF(c869590Y9l.getScene(), EnumC896390ZEn.STORY.getScene())) {
                return "story";
            }
            if (Intrinsics.LJFF(c869590Y9l.getScene(), EnumC896390ZEn.HIGHLIGHT_STORY.getScene())) {
                return "highlight_story";
            }
            if (Intrinsics.LJFF(c869590Y9l.getScene(), EnumC896390ZEn.HIGHLIGHT_STORY_COLLECTION.getScene())) {
                return "highlight_story_collection";
            }
            if (!C123100dR.LIZ(c869590Y9l.getScene())) {
                return null;
            }
            return "share_video";
        }

        public final String getMessageTypeForEventTracking(C869590Y9l c869590Y9l) {
            if (c869590Y9l == null) {
                return null;
            }
            if (isVideoTag(c869590Y9l)) {
                return "tag_video";
            }
            if (isVideoMention(c869590Y9l)) {
                return "mention_video";
            }
            if (isVideoMentionAndTag(c869590Y9l)) {
                return "tag_mention_video";
            }
            if (isStoryMention(c869590Y9l)) {
                return "mention_story";
            }
            if (isStoryToStoryBackwardsMention(c869590Y9l)) {
                return SrcTypes.ADD_STORY_TO_STORY.getASrc();
            }
            if (!isPostToStoryBackwardsMention(c869590Y9l)) {
                return null;
            }
            return SrcTypes.ADD_POST_TO_STORY.getASrc();
        }

        public final boolean hasInlineTag(C869590Y9l c869590Y9l) {
            if (!isVideoMention(c869590Y9l) && !isVideoTag(c869590Y9l) && !isVideoMentionAndTag(c869590Y9l) && !isStoryMention(c869590Y9l) && !isStoryToStoryBackwardsMention(c869590Y9l) && !isPostToStoryBackwardsMention(c869590Y9l)) {
                return false;
            }
            return true;
        }

        public final boolean isEncourageMufCommentMsg(C869590Y9l c869590Y9l) {
            String str;
            Map<String, String> ext;
            String aSrc = SrcTypes.VIDEO_COMMENT.getASrc();
            if (c869590Y9l != null && (ext = c869590Y9l.getExt()) != null) {
                str = ext.get("a:src");
            } else {
                str = null;
            }
            return Intrinsics.LJFF(aSrc, str);
        }

        public final boolean isEncourageMufCommentStoryMsg(C869590Y9l c869590Y9l) {
            String str;
            Map<String, String> ext;
            String aSrc = SrcTypes.STORY_COMMENT.getASrc();
            if (c869590Y9l != null && (ext = c869590Y9l.getExt()) != null) {
                str = ext.get("a:src");
            } else {
                str = null;
            }
            return Intrinsics.LJFF(aSrc, str);
        }

        public final boolean isEncourageMufFavouriteMsg(C869590Y9l c869590Y9l) {
            String str;
            Map<String, String> ext;
            String aSrc = SrcTypes.VIDEO_FAVOURITE.getASrc();
            if (c869590Y9l != null && (ext = c869590Y9l.getExt()) != null) {
                str = ext.get("a:src");
            } else {
                str = null;
            }
            return Intrinsics.LJFF(aSrc, str);
        }

        public final boolean isEncourageMufInteractionASrc(String str) {
            if (!Intrinsics.LJFF(SrcTypes.VIDEO_REPOST.getASrc(), str) && !Intrinsics.LJFF(SrcTypes.VIDEO_FAVOURITE.getASrc(), str) && !Intrinsics.LJFF(SrcTypes.VIDEO_LIKE.getASrc(), str) && !Intrinsics.LJFF(SrcTypes.VIDEO_COMMENT.getASrc(), str) && !Intrinsics.LJFF(SrcTypes.STORY_LIKE.getASrc(), str) && !Intrinsics.LJFF(SrcTypes.STORY_COMMENT.getASrc(), str)) {
                return false;
            }
            return true;
        }

        public final boolean isEncourageMufInteractionMsg(C869590Y9l c869590Y9l) {
            String str;
            Map<String, String> ext;
            if (c869590Y9l != null && (ext = c869590Y9l.getExt()) != null) {
                str = ext.get("a:src");
            } else {
                str = null;
            }
            return isEncourageMufInteractionASrc(str);
        }

        public final boolean isEncourageMufLikeMsg(C869590Y9l c869590Y9l) {
            String str;
            Map<String, String> ext;
            String aSrc = SrcTypes.VIDEO_LIKE.getASrc();
            if (c869590Y9l != null && (ext = c869590Y9l.getExt()) != null) {
                str = ext.get("a:src");
            } else {
                str = null;
            }
            return Intrinsics.LJFF(aSrc, str);
        }

        public final boolean isEncourageMufLikeStoryMsg(C869590Y9l c869590Y9l) {
            String str;
            Map<String, String> ext;
            String aSrc = SrcTypes.STORY_LIKE.getASrc();
            if (c869590Y9l != null && (ext = c869590Y9l.getExt()) != null) {
                str = ext.get("a:src");
            } else {
                str = null;
            }
            return Intrinsics.LJFF(aSrc, str);
        }

        public final boolean isEncourageMufRepostMsg(C869590Y9l c869590Y9l) {
            String str;
            Map<String, String> ext;
            String aSrc = SrcTypes.VIDEO_REPOST.getASrc();
            if (c869590Y9l != null && (ext = c869590Y9l.getExt()) != null) {
                str = ext.get("a:src");
            } else {
                str = null;
            }
            return Intrinsics.LJFF(aSrc, str);
        }

        public final boolean isPostToStoryBackwardsMention(C869590Y9l c869590Y9l) {
            String str;
            Map<String, String> ext;
            String aSrc = SrcTypes.ADD_POST_TO_STORY.getASrc();
            if (c869590Y9l != null && (ext = c869590Y9l.getExt()) != null) {
                str = ext.get("a:src");
            } else {
                str = null;
            }
            return Intrinsics.LJFF(aSrc, str);
        }

        public final boolean isStoryMention(C869590Y9l c869590Y9l) {
            String str;
            Map<String, String> ext;
            String aSrc = SrcTypes.STORY_MENTION.getASrc();
            if (c869590Y9l != null && (ext = c869590Y9l.getExt()) != null) {
                str = ext.get("a:src");
            } else {
                str = null;
            }
            return Intrinsics.LJFF(aSrc, str);
        }

        public final boolean isStoryToStoryBackwardsMention(C869590Y9l c869590Y9l) {
            String str;
            Map<String, String> ext;
            String aSrc = SrcTypes.ADD_STORY_TO_STORY.getASrc();
            if (c869590Y9l != null && (ext = c869590Y9l.getExt()) != null) {
                str = ext.get("a:src");
            } else {
                str = null;
            }
            return Intrinsics.LJFF(aSrc, str);
        }

        public final boolean isVideoMention(C869590Y9l c869590Y9l) {
            String str;
            Map<String, String> ext;
            String aSrc = SrcTypes.VIDEO_MENTION.getASrc();
            if (c869590Y9l != null && (ext = c869590Y9l.getExt()) != null) {
                str = ext.get("a:src");
            } else {
                str = null;
            }
            return Intrinsics.LJFF(aSrc, str);
        }

        public final boolean isVideoMentionAndTag(C869590Y9l c869590Y9l) {
            String str;
            Map<String, String> ext;
            String aSrc = SrcTypes.VIDEO_MENTION_AND_TAG.getASrc();
            if (c869590Y9l != null && (ext = c869590Y9l.getExt()) != null) {
                str = ext.get("a:src");
            } else {
                str = null;
            }
            return Intrinsics.LJFF(aSrc, str);
        }

        public final boolean isVideoTag(C869590Y9l c869590Y9l) {
            String str;
            Map<String, String> ext;
            String aSrc = SrcTypes.VIDEO_TAG.getASrc();
            if (c869590Y9l != null && (ext = c869590Y9l.getExt()) != null) {
                str = ext.get("a:src");
            } else {
                str = null;
            }
            return Intrinsics.LJFF(aSrc, str);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.message.content.BaseContent
    public Map<String, String> getExtForShare(C869590Y9l c869590Y9l) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(c869590Y9l.getExt());
        if (Companion.hasInlineTag(c869590Y9l)) {
            linkedHashMap.remove("a:src");
        }
        return linkedHashMap;
    }

    public final void setAdFake(boolean z) {
        this.isAdFake = z;
    }

    public final void setAuthorUsername(String str) {
        this.authorUsername = str;
    }

    public final void setAwemeType(int i) {
        this.awemeType = i;
    }

    public final void setContentName(String str) {
        this.contentName = str;
    }

    public final void setContentThumb(UrlModel urlModel) {
        this.contentThumb = urlModel;
    }

    public final void setCoverUrl(UrlModel urlModel) {
        this.coverUrl = urlModel;
    }

    public final void setDiamondGameId(String str) {
        this.diamondGameId = str;
    }

    public final void setHeight(float f) {
        this.height = f;
    }

    public final void setHotSpotCreateTime(long j) {
        this.hotSpotCreateTime = j;
    }

    public final void setHotSpotVideo(boolean z) {
        this.isHotSpotVideo = z;
    }

    public final void setItemId(String str) {
        this.itemId = str;
    }

    public final void setNeedSkipStrange(int i) {
        this.needSkipStrange = i;
    }

    public final void setSecUid(String str) {
        this.secUid = str;
    }

    public final void setSendMethod(String str) {
        this.sendMethod = str;
    }

    public final void setStory(boolean z) {
        this.isStory = z;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setUser(String str) {
        this.user = str;
    }

    public final void setWidth(float f) {
        this.width = f;
    }
}
