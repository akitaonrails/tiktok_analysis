package com.ss.android.ugc.aweme.innerpush.api.model;

import X.C09CT;
import X.C427870Gq9;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes32.dex */
public final class InnerPushUITemplate implements Serializable {

    @C09CT("avatar_breath")
    public Boolean avatarBreath;

    @C09CT("avatar_drawable")
    public List<? extends Drawable> avatarDrawables;

    @C09CT("avatar_image_border_width")
    public final float avatarImageBorderWidth;

    @C09CT("avatar_image_height")
    public final int avatarImageHeight;

    @C09CT("avatar_image_radius")
    public final float avatarImageRadius;

    @C09CT("avatar_image_width")
    public final int avatarImageWidth;
    public final transient List<Integer> avatarResIds;
    public transient boolean avatarRightLabelAutoPlay;
    public transient Drawable avatarRightLabelDrawable;

    @C09CT("avatar_right_label_height")
    public int avatarRightLabelHeight;
    public transient int avatarRightLabelMargin;
    public transient int avatarRightLabelPadding;

    @C09CT("avatar_right_label_url")
    public String avatarRightLabelUrl;

    @C09CT("avatar_right_label_width")
    public int avatarRightLabelWidth;

    @C09CT("avatar_ring")
    public final int avatarRing;
    public transient int avatarRingHeight;
    public transient int avatarRingPadding;
    public transient int avatarRingWidth;

    @C09CT("avatar_schema_url")
    public final String avatarSchema;
    public transient List<? extends UrlModel> avatarUrlModels;

    @C09CT("avatar_urls")
    public List<String> avatarUrls;

    @C09CT("bottom_button_text")
    public final String bottomBtnText;

    @C09CT("bottom_schema_url")
    public final String bottomSchemaUrl;

    @C09CT("bottom_type")
    public int bottomType;

    @C09CT("content")
    public String content;
    public CharSequence contentChar;

    @C09CT("content_limit_lines")
    public int contentLimitLines;

    @C09CT("from_users")
    public final List<User> fromUsers;

    @C09CT("global_radius")
    public int globalRadius;

    @C09CT("global_schema_url")
    public String globalSchemaUrl;
    public transient boolean isNeedDoubleClickCheck;

    @C09CT("left_type")
    public final int leftType;
    public transient String lightInteractionName;

    @C09CT("middle_alignment")
    public int middleAlignment;

    @C09CT("middle_schema_url")
    public final String middleSchemaUrl;
    public transient Function2<? super C427870Gq9, ? super C427870Gq9, Unit> multiAvatarsLoadFunction;
    public transient List<Bitmap> preloadAvatar;
    public transient Bitmap preloadLabelImage;
    public transient Bitmap preloadRightImage;
    public transient Bitmap preloadTopImage;
    public transient int pullUpLayoutType;

    @C09CT("right_button_text")
    public String rightBtnText;

    @C09CT("right_image_border_width")
    public final float rightImageBorderWidth;
    public transient Drawable rightImageDrawable;

    @C09CT("right_image_height")
    public int rightImageHeight;

    @C09CT("right_image_radius")
    public int rightImageRadius;
    public transient int rightImageResId;

    @C09CT("right_image_url")
    public String rightImageUrl;

    @C09CT("right_image_width")
    public int rightImageWidth;

    @C09CT("right_schema_url")
    public final String rightSchemaUrl;

    @C09CT("right_type")
    public int rightType;

    @C09CT("second_avatar_urls")
    public List<String> secondAvatarUrls;
    public transient Function1<? super C427870Gq9, Unit> singleAvatarLoadFunction;

    @C09CT("tag_text")
    public String tagText;

    @C09CT("title")
    public String title;
    public transient View topIconView;
    public transient int topIconViewHeight;
    public transient int topIconViewWidth;

    @C09CT("top_image_height")
    public int topImageHeight;

    @C09CT("top_image_radius")
    public int topImageRadius;
    public int topImageRes;

    @C09CT("top_image_url")
    public String topImageUrl;

    @C09CT("top_image_width")
    public int topImageWidth;

    @C09CT("top_schema_url")
    public final String topSchemaUrl;

    @C09CT("top_type")
    public int topType;

    public InnerPushUITemplate() {
        this(0, null, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 48, 48, 0.0f, 0.5f, null, 20, 20, null, false, -3, 3, null, 0, 0, 0, Boolean.FALSE, 0, 0, 0, 0, 0, null, null, null, null, 2, null, 0, null, null, 36, 48, 4, 0, null, null, 0.5f, null, true, 0, null, null, null, 12, null, null, null, null, null, 0);
    }

    public String toString() {
        return "InnerPushUITemplate(topType=" + this.topType + ", topImageUrl=" + this.topImageUrl + ", topImageRes=" + this.topImageRes + ", topImageWidth=" + this.topImageWidth + ", topImageHeight=" + this.topImageHeight + ", topImageRadius=" + this.topImageRadius + ", topSchemaUrl=" + this.topSchemaUrl + ", avatarUrls=" + this.avatarUrls + ", secondAvatarUrls=" + this.secondAvatarUrls + ", avatarUrlModels=" + this.avatarUrlModels + ", singleAvatarLoadFunction=" + this.singleAvatarLoadFunction + ", multiAvatarsLoadFunction=" + this.multiAvatarsLoadFunction + ", avatarResIds=" + this.avatarResIds + ", avatarDrawables=" + this.avatarDrawables + ", avatarSchema=" + this.avatarSchema + ", avatarImageWidth=" + this.avatarImageWidth + ", avatarImageHeight=" + this.avatarImageHeight + ", avatarImageRadius=" + this.avatarImageRadius + ", avatarImageBorderWidth=" + this.avatarImageBorderWidth + ", avatarRightLabelUrl=" + this.avatarRightLabelUrl + ", avatarRightLabelWidth=" + this.avatarRightLabelWidth + ", avatarRightLabelHeight=" + this.avatarRightLabelHeight + ", avatarRightLabelDrawable=" + this.avatarRightLabelDrawable + ", avatarRightLabelAutoPlay=" + this.avatarRightLabelAutoPlay + ", avatarRightLabelMargin=" + this.avatarRightLabelMargin + ", avatarRightLabelPadding=" + this.avatarRightLabelPadding + ", topIconView=" + this.topIconView + ", topIconViewWidth=" + this.topIconViewWidth + ", topIconViewHeight=" + this.topIconViewHeight + ", leftType=" + this.leftType + ", avatarBreath=" + this.avatarBreath + ", avatarRing=" + this.avatarRing + ", avatarRingWidth=" + this.avatarRingWidth + ", avatarRingHeight=" + this.avatarRingHeight + ", avatarRingPadding=" + this.avatarRingPadding + ", middleAlignment=" + this.middleAlignment + ", title=" + this.title + ", tagText=" + this.tagText + ", content=" + this.content + ", contentChar=" + ((Object) this.contentChar) + ", contentLimitLines=" + this.contentLimitLines + ", middleSchemaUrl=" + this.middleSchemaUrl + ", rightType=" + this.rightType + ", rightBtnText=" + this.rightBtnText + ", rightImageUrl=" + this.rightImageUrl + ", rightImageWidth=" + this.rightImageWidth + ", rightImageHeight=" + this.rightImageHeight + ", rightImageRadius=" + this.rightImageRadius + ", rightImageResId=" + this.rightImageResId + ", rightImageDrawable=" + this.rightImageDrawable + ", rightSchemaUrl=" + this.rightSchemaUrl + ", rightImageBorderWidth=" + this.rightImageBorderWidth + ", lightInteractionName=" + this.lightInteractionName + ", isNeedDoubleClickCheck=" + this.isNeedDoubleClickCheck + ", bottomType=" + this.bottomType + ", bottomBtnText=" + this.bottomBtnText + ", bottomSchemaUrl=" + this.bottomSchemaUrl + ", globalSchemaUrl=" + this.globalSchemaUrl + ", globalRadius=" + this.globalRadius + ", fromUsers=" + this.fromUsers + ", preloadAvatar=" + this.preloadAvatar + ", preloadLabelImage=" + this.preloadLabelImage + ", preloadRightImage=" + this.preloadRightImage + ", preloadTopImage=" + this.preloadTopImage + ", pullUpLayoutType=" + this.pullUpLayoutType + ')';
    }

    public final boolean isNeedDoubleClickCheck() {
        return this.isNeedDoubleClickCheck;
    }

    public final void setAvatarBreath(Boolean bool) {
        this.avatarBreath = bool;
    }

    public final void setAvatarDrawables(List<? extends Drawable> list) {
        this.avatarDrawables = list;
    }

    public final void setAvatarRightLabelAutoPlay(boolean z) {
        this.avatarRightLabelAutoPlay = z;
    }

    public final void setAvatarRightLabelDrawable(Drawable drawable) {
        this.avatarRightLabelDrawable = drawable;
    }

    public final void setAvatarRightLabelHeight(int i) {
        this.avatarRightLabelHeight = i;
    }

    public final void setAvatarRightLabelMargin(int i) {
        this.avatarRightLabelMargin = i;
    }

    public final void setAvatarRightLabelPadding(int i) {
        this.avatarRightLabelPadding = i;
    }

    public final void setAvatarRightLabelUrl(String str) {
        this.avatarRightLabelUrl = str;
    }

    public final void setAvatarRightLabelWidth(int i) {
        this.avatarRightLabelWidth = i;
    }

    public final void setAvatarRingHeight(int i) {
        this.avatarRingHeight = i;
    }

    public final void setAvatarRingPadding(int i) {
        this.avatarRingPadding = i;
    }

    public final void setAvatarRingWidth(int i) {
        this.avatarRingWidth = i;
    }

    public final void setAvatarUrlModels(List<? extends UrlModel> list) {
        this.avatarUrlModels = list;
    }

    public final void setAvatarUrls(List<String> list) {
        this.avatarUrls = list;
    }

    public final void setBottomType(int i) {
        this.bottomType = i;
    }

    public final void setContent(String str) {
        this.content = str;
    }

    public final void setContentChar(CharSequence charSequence) {
        this.contentChar = charSequence;
    }

    public final void setContentLimitLines(int i) {
        this.contentLimitLines = i;
    }

    public final void setGlobalRadius(int i) {
        this.globalRadius = i;
    }

    public final void setGlobalSchemaUrl(String str) {
        this.globalSchemaUrl = str;
    }

    public final void setLightInteractionName(String str) {
        this.lightInteractionName = str;
    }

    public final void setMiddleAlignment(int i) {
        this.middleAlignment = i;
    }

    public final void setMultiAvatarsLoadFunction(Function2<? super C427870Gq9, ? super C427870Gq9, Unit> function2) {
        this.multiAvatarsLoadFunction = function2;
    }

    public final void setNeedDoubleClickCheck(boolean z) {
        this.isNeedDoubleClickCheck = z;
    }

    public final void setPreloadAvatar(List<Bitmap> list) {
        this.preloadAvatar = list;
    }

    public final void setPreloadLabelImage(Bitmap bitmap) {
        this.preloadLabelImage = bitmap;
    }

    public final void setPreloadRightImage(Bitmap bitmap) {
        this.preloadRightImage = bitmap;
    }

    public final void setPreloadTopImage(Bitmap bitmap) {
        this.preloadTopImage = bitmap;
    }

    public final void setPullUpLayoutType(int i) {
        this.pullUpLayoutType = i;
    }

    public final void setRightBtnText(String str) {
        this.rightBtnText = str;
    }

    public final void setRightImageDrawable(Drawable drawable) {
        this.rightImageDrawable = drawable;
    }

    public final void setRightImageHeight(int i) {
        this.rightImageHeight = i;
    }

    public final void setRightImageRadius(int i) {
        this.rightImageRadius = i;
    }

    public final void setRightImageResId(int i) {
        this.rightImageResId = i;
    }

    public final void setRightImageUrl(String str) {
        this.rightImageUrl = str;
    }

    public final void setRightImageWidth(int i) {
        this.rightImageWidth = i;
    }

    public final void setRightType(int i) {
        this.rightType = i;
    }

    public final void setSecondAvatarUrls(List<String> list) {
        this.secondAvatarUrls = list;
    }

    public final void setSingleAvatarLoadFunction(Function1<? super C427870Gq9, Unit> function1) {
        this.singleAvatarLoadFunction = function1;
    }

    public final void setTagText(String str) {
        this.tagText = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setTopIconView(View view) {
        this.topIconView = view;
    }

    public final void setTopIconViewHeight(int i) {
        this.topIconViewHeight = i;
    }

    public final void setTopIconViewWidth(int i) {
        this.topIconViewWidth = i;
    }

    public final void setTopImageHeight(int i) {
        this.topImageHeight = i;
    }

    public final void setTopImageRadius(int i) {
        this.topImageRadius = i;
    }

    public final void setTopImageRes(int i) {
        this.topImageRes = i;
    }

    public final void setTopImageUrl(String str) {
        this.topImageUrl = str;
    }

    public final void setTopImageWidth(int i) {
        this.topImageWidth = i;
    }

    public final void setTopType(int i) {
        this.topType = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InnerPushUITemplate(int i, String str, int i2, int i3, int i4, int i5, String str2, List<String> list, List<String> list2, List<? extends UrlModel> list3, Function1<? super C427870Gq9, Unit> function1, Function2<? super C427870Gq9, ? super C427870Gq9, Unit> function2, List<Integer> list4, List<? extends Drawable> list5, String str3, int i6, int i7, float f, float f2, String str4, int i8, int i9, Drawable drawable, boolean z, int i10, int i11, View view, int i12, int i13, int i14, Boolean bool, int i15, int i16, int i17, int i18, int i19, String str5, String str6, String str7, CharSequence charSequence, int i20, String str8, int i21, String str9, String str10, int i22, int i23, int i24, int i25, Drawable drawable2, String str11, float f3, String str12, boolean z2, int i26, String str13, String str14, String str15, int i27, List<? extends User> list6, List<Bitmap> list7, Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, int i28) {
        this.topType = i;
        this.topImageUrl = str;
        this.topImageRes = i2;
        this.topImageWidth = i3;
        this.topImageHeight = i4;
        this.topImageRadius = i5;
        this.topSchemaUrl = str2;
        this.avatarUrls = list;
        this.secondAvatarUrls = list2;
        this.avatarUrlModels = list3;
        this.singleAvatarLoadFunction = function1;
        this.multiAvatarsLoadFunction = function2;
        this.avatarResIds = list4;
        this.avatarDrawables = list5;
        this.avatarSchema = str3;
        this.avatarImageWidth = i6;
        this.avatarImageHeight = i7;
        this.avatarImageRadius = f;
        this.avatarImageBorderWidth = f2;
        this.avatarRightLabelUrl = str4;
        this.avatarRightLabelWidth = i8;
        this.avatarRightLabelHeight = i9;
        this.avatarRightLabelDrawable = drawable;
        this.avatarRightLabelAutoPlay = z;
        this.avatarRightLabelMargin = i10;
        this.avatarRightLabelPadding = i11;
        this.topIconView = view;
        this.topIconViewWidth = i12;
        this.topIconViewHeight = i13;
        this.leftType = i14;
        this.avatarBreath = bool;
        this.avatarRing = i15;
        this.avatarRingWidth = i16;
        this.avatarRingHeight = i17;
        this.avatarRingPadding = i18;
        this.middleAlignment = i19;
        this.title = str5;
        this.tagText = str6;
        this.content = str7;
        this.contentChar = charSequence;
        this.contentLimitLines = i20;
        this.middleSchemaUrl = str8;
        this.rightType = i21;
        this.rightBtnText = str9;
        this.rightImageUrl = str10;
        this.rightImageWidth = i22;
        this.rightImageHeight = i23;
        this.rightImageRadius = i24;
        this.rightImageResId = i25;
        this.rightImageDrawable = drawable2;
        this.rightSchemaUrl = str11;
        this.rightImageBorderWidth = f3;
        this.lightInteractionName = str12;
        this.isNeedDoubleClickCheck = z2;
        this.bottomType = i26;
        this.bottomBtnText = str13;
        this.bottomSchemaUrl = str14;
        this.globalSchemaUrl = str15;
        this.globalRadius = i27;
        this.fromUsers = list6;
        this.preloadAvatar = list7;
        this.preloadLabelImage = bitmap;
        this.preloadRightImage = bitmap2;
        this.preloadTopImage = bitmap3;
        this.pullUpLayoutType = i28;
    }
}
