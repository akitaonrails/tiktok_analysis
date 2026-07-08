package com.ss.android.ugc.aweme.creative.model;

import X.C040H;
import X.C09CT;
import X.C0MY0;
import X.C13BV;
import X.C1404460meS;
import X.C738640SyE;
import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.feed.model.story.AvatarThoughtInfo;
import com.ss.android.ugc.aweme.feed.model.story.RichTextInfo;
import com.ss.android.ugc.aweme.feed.model.story.StoryNoteTextExtra;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes23.dex */
public final class StoryNoteInfoModel implements Serializable {
    public static final C1404460meS Companion = new Object() { // from class: X.0meS
    };

    @C040H
    @C0MY0
    public transient String animatedAvatarFilePath;

    @C040H
    public transient String animatedAvatarUri;

    @C040H
    @C09CT("avatar_info")
    public final AvatarThoughtInfo avatarInfo;

    @C040H
    @C09CT("background_info")
    public final BackGroundInfo backGroundInfo;

    @C040H
    public transient String coverImageUri;

    @C040H
    public transient String defaultLandingAvatar;

    @C040H
    public transient List<Bitmap> extractedBitmap;

    @C040H
    public transient List<String> extractedBitmapPath;

    @C040H
    public transient boolean hasAvatarPrompt;

    @C040H
    @C09CT("has_note_prompt")
    public boolean hasNotePrompt;

    @C040H
    public transient boolean hasSocialAvatar;

    @C040H
    public transient boolean isFromAvatarDraft;

    @C040H
    public transient boolean isFromNotification;

    @C040H
    @C09CT("note_prompt_text")
    public String notePromptText;

    @C040H
    @C09CT("rich_text")
    public final List<RichTextInfo> richText;

    @C040H
    public transient String storyArchiveTabName;

    @C040H
    @C09CT("sub_type")
    public final int subType;

    @C040H
    @C09CT("text_content")
    public final String textContent;

    @C040H
    @C09CT("text_extra")
    public final List<StoryNoteTextExtra> textExtras;

    @C040H
    public transient String tryItOutPosition;

    @C040H
    public transient boolean usingSocialAvatar;

    public StoryNoteInfoModel() {
        this(0, "", new BackGroundInfo(1, null, null, null), null, null, null, null, null, null, false, null, null, "", false, false, null, false, false, false, null, null);
    }

    public final boolean isFromAvatarDraft() {
        return this.isFromAvatarDraft;
    }

    public final boolean isFromNotification() {
        return this.isFromNotification;
    }

    public final void setAnimatedAvatarFilePath(String str) {
        this.animatedAvatarFilePath = str;
    }

    public final void setAnimatedAvatarUri(String str) {
        this.animatedAvatarUri = str;
    }

    public final void setCoverImageUri(String str) {
        this.coverImageUri = str;
    }

    public final void setDefaultLandingAvatar(String str) {
        this.defaultLandingAvatar = str;
    }

    public final void setExtractedBitmap(List<Bitmap> list) {
        this.extractedBitmap = list;
    }

    public final void setExtractedBitmapPath(List<String> list) {
        this.extractedBitmapPath = list;
    }

    public final void setFromAvatarDraft(boolean z) {
        this.isFromAvatarDraft = z;
    }

    public final void setFromNotification(boolean z) {
        this.isFromNotification = z;
    }

    public final void setHasAvatarPrompt(boolean z) {
        this.hasAvatarPrompt = z;
    }

    public final void setHasNotePrompt(boolean z) {
        this.hasNotePrompt = z;
    }

    public final void setHasSocialAvatar(boolean z) {
        this.hasSocialAvatar = z;
    }

    public final void setNotePromptText(String str) {
        this.notePromptText = str;
    }

    public final void setStoryArchiveTabName(String str) {
        this.storyArchiveTabName = str;
    }

    public final void setTryItOutPosition(String str) {
        this.tryItOutPosition = str;
    }

    public final void setUsingSocialAvatar(boolean z) {
        this.usingSocialAvatar = z;
    }

    /* JADX INFO: loaded from: classes12.dex */
    public static final class GradientImageData implements Serializable {

        @C040H
        @C09CT("colors")
        public final List<String> colors;

        @C040H
        @C09CT("locations")
        public final List<Float> locations;

        public GradientImageData() {
            this(null, null, 3, null);
        }

        public GradientImageData(List<String> list, List<Float> list2) {
            this.colors = list;
            this.locations = list2;
        }

        public GradientImageData(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? C13BV.INSTANCE : list2);
        }
    }

    /* JADX INFO: loaded from: classes12.dex */
    public static final class BackGroundInfo implements Serializable {
        public static final C738640SyE Companion = new Object() { // from class: X.0SyE
        };

        @C040H
        @C09CT("background_type")
        public final int backGroundImageType;

        @C040H
        @C09CT("background_gecko_id")
        public final String backgroundGeckoId;

        @C040H
        @C09CT("background_img_url")
        public final String backgroundImgUrl;

        @C040H
        @C09CT("gradient_img_data")
        public final GradientImageData gradientImgData;

        public BackGroundInfo() {
            this(1, null, null, null);
        }

        public BackGroundInfo(int i, GradientImageData gradientImageData, String str, String str2) {
            this.backGroundImageType = i;
            this.gradientImgData = gradientImageData;
            this.backgroundImgUrl = str;
            this.backgroundGeckoId = str2;
        }
    }

    public StoryNoteInfoModel(int i, String str, BackGroundInfo backGroundInfo, String str2, String str3, String str4, List<Bitmap> list, List<String> list2, List<RichTextInfo> list3, boolean z, String str5, AvatarThoughtInfo avatarThoughtInfo, String str6, boolean z2, boolean z3, String str7, boolean z4, boolean z5, boolean z6, String str8, List<StoryNoteTextExtra> list4) {
        this.subType = i;
        this.textContent = str;
        this.backGroundInfo = backGroundInfo;
        this.coverImageUri = str2;
        this.animatedAvatarUri = str3;
        this.animatedAvatarFilePath = str4;
        this.extractedBitmap = list;
        this.extractedBitmapPath = list2;
        this.richText = list3;
        this.hasNotePrompt = z;
        this.notePromptText = str5;
        this.avatarInfo = avatarThoughtInfo;
        this.defaultLandingAvatar = str6;
        this.hasAvatarPrompt = z2;
        this.isFromNotification = z3;
        this.tryItOutPosition = str7;
        this.hasSocialAvatar = z4;
        this.usingSocialAvatar = z5;
        this.isFromAvatarDraft = z6;
        this.storyArchiveTabName = str8;
        this.textExtras = list4;
    }
}
