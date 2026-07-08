package com.ss.android.ugc.aweme.tools.sticker.core.article;

import X.AbstractC1442160ndG;
import X.C09CT;
import X.C0FKI;
import X.C1440500naa;
import X.C1533950q1J;
import X.C19591311kt;
import X.C19624611qG;
import X.C2188811AlT;
import X.EnumC1466150oFx;
import X.EnumC1779140wOm;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.article.model.ArticleStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.article.ArticleStickerModel;
import java.io.Serializable;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class ArticleStickerModel implements StickerModel, Serializable {

    @C09CT("article_link")
    public String articleLink;

    @C09CT("article_title")
    public String articleTitle;

    @C09CT("base_sticker_model")
    public final BaseStickerModel baseStickerModel;

    @C09CT("brand_icon_id")
    public String brandIconId;

    @C09CT("brand_icon_url")
    public String brandIconUrl;

    @C09CT("brand_theme_color")
    public String brandThemeColor;

    @C09CT("preview_container_height_px")
    public Integer previewContainerHeightPx;

    @C09CT("real_media_height")
    public Integer realMediaHeight;

    @C09CT("real_media_width")
    public Integer realMediaWidth;

    @C09CT("style_state")
    public StyleModel styleState;
    public static final C19624611qG Companion = new Object() { // from class: X.11qG
    };
    public static final Parcelable.Creator<ArticleStickerModel> CREATOR = new Parcelable.Creator<ArticleStickerModel>() { // from class: X.11ob
        @Override // android.os.Parcelable.Creator
        public final ArticleStickerModel createFromParcel(Parcel parcel) {
            Integer numValueOf;
            Integer numValueOf2;
            BaseStickerModel baseStickerModelCreateFromParcel = BaseStickerModel.CREATOR.createFromParcel(parcel);
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            ArticleStickerModel.StyleModel styleModel = (ArticleStickerModel.StyleModel) parcel.readSerializable();
            Integer numValueOf3 = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                numValueOf2 = null;
            } else {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                numValueOf3 = Integer.valueOf(parcel.readInt());
            }
            return new ArticleStickerModel(baseStickerModelCreateFromParcel, string, string2, string3, string4, string5, styleModel, numValueOf, numValueOf2, numValueOf3);
        }

        @Override // android.os.Parcelable.Creator
        public final ArticleStickerModel[] newArray(int i) {
            return new ArticleStickerModel[i];
        }
    };
    public static final int $stable = 8;
    public static final ArticleStickerModel EMPTY = new ArticleStickerModel(new BaseStickerModel(114, 0, EnumC1466150oFx.ARTICLE, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -6, 15, null), null, null, null, null, null, null, null, null, null);

    public final ArticleStickerModel copy(BaseStickerModel baseStickerModel, String str, String str2, String str3, String str4, String str5, StyleModel styleModel, Integer num, Integer num2, Integer num3) {
        return new ArticleStickerModel(baseStickerModel, str, str2, str3, str4, str5, styleModel, num, num2, num3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ArticleStickerModel)) {
            return false;
        }
        ArticleStickerModel articleStickerModel = (ArticleStickerModel) obj;
        return Intrinsics.LJFF(this.baseStickerModel, articleStickerModel.baseStickerModel) && Intrinsics.LJFF(this.articleLink, articleStickerModel.articleLink) && Intrinsics.LJFF(this.articleTitle, articleStickerModel.articleTitle) && Intrinsics.LJFF(this.brandIconId, articleStickerModel.brandIconId) && Intrinsics.LJFF(this.brandIconUrl, articleStickerModel.brandIconUrl) && Intrinsics.LJFF(this.brandThemeColor, articleStickerModel.brandThemeColor) && Intrinsics.LJFF(this.styleState, articleStickerModel.styleState) && Intrinsics.LJFF(this.previewContainerHeightPx, articleStickerModel.previewContainerHeightPx) && Intrinsics.LJFF(this.realMediaWidth, articleStickerModel.realMediaWidth) && Intrinsics.LJFF(this.realMediaHeight, articleStickerModel.realMediaHeight);
    }

    public int hashCode() {
        int iHashCode = this.baseStickerModel.hashCode() * 31;
        String str = this.articleLink;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.articleTitle;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.brandIconId;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.brandIconUrl;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.brandThemeColor;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        StyleModel styleModel = this.styleState;
        int iHashCode7 = (iHashCode6 + (styleModel == null ? 0 : styleModel.hashCode())) * 31;
        Integer num = this.previewContainerHeightPx;
        int iHashCode8 = (iHashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.realMediaWidth;
        int iHashCode9 = (iHashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.realMediaHeight;
        return iHashCode9 + (num3 != null ? num3.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public boolean isVERenderSticker() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public boolean needCompile() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public AbstractC1442160ndG<?> stickerCompileComponent(Context context, String str, C1440500naa c1440500naa, C0FKI c0fki, String str2) {
        return null;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ArticleStickerModel(baseStickerModel=");
        sbLIZ.append(this.baseStickerModel);
        sbLIZ.append(", articleLink=");
        sbLIZ.append(this.articleLink);
        sbLIZ.append(", articleTitle=");
        sbLIZ.append(this.articleTitle);
        sbLIZ.append(", brandIconId=");
        sbLIZ.append(this.brandIconId);
        sbLIZ.append(", brandIconUrl=");
        sbLIZ.append(this.brandIconUrl);
        sbLIZ.append(", brandThemeColor=");
        sbLIZ.append(this.brandThemeColor);
        sbLIZ.append(", styleState=");
        sbLIZ.append(this.styleState);
        sbLIZ.append(", previewContainerHeightPx=");
        sbLIZ.append(this.previewContainerHeightPx);
        sbLIZ.append(", realMediaWidth=");
        sbLIZ.append(this.realMediaWidth);
        sbLIZ.append(", realMediaHeight=");
        sbLIZ.append(this.realMediaHeight);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.baseStickerModel.writeToParcel(parcel, i);
        parcel.writeString(this.articleLink);
        parcel.writeString(this.articleTitle);
        parcel.writeString(this.brandIconId);
        parcel.writeString(this.brandIconUrl);
        parcel.writeString(this.brandThemeColor);
        parcel.writeSerializable(this.styleState);
        Integer num = this.previewContainerHeightPx;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.realMediaWidth;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Integer num3 = this.realMediaHeight;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
    }

    public ArticleStickerModel() {
        this(new BaseStickerModel(114, 0, EnumC1466150oFx.ARTICLE, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -6, 15, null), null, null, null, null, null, null, null, null, null);
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public int getId() {
        return this.baseStickerModel.getId();
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public InteractStickerStruct getInteractStickerStruct() {
        Integer num = this.realMediaWidth;
        int iIntValue = num != null ? num.intValue() : 0;
        Integer num2 = this.realMediaHeight;
        int iIntValue2 = num2 != null ? num2.intValue() : 0;
        ArticleStickerModel articleStickerModelCopy = (iIntValue <= 0 || iIntValue2 <= 0) ? this : copy(BaseStickerModel.copy$default(this.baseStickerModel, 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, iIntValue, iIntValue2, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -24577, 15, null), this.articleLink, this.articleTitle, this.brandIconId, this.brandIconUrl, this.brandThemeColor, this.styleState, this.previewContainerHeightPx, this.realMediaWidth, this.realMediaHeight);
        C19591311kt.LIZ.getClass();
        InteractStickerStruct interactStickerStructLIZLLL = C19591311kt.LIZLLL(articleStickerModelCopy, true);
        interactStickerStructLIZLLL.setType(getStickerType().getType());
        interactStickerStructLIZLLL.setNoGlobal(true);
        interactStickerStructLIZLLL.setArticleSticker(new ArticleStickerStruct(articleStickerModelCopy.articleLink, articleStickerModelCopy.articleTitle, articleStickerModelCopy.brandIconId, articleStickerModelCopy.brandIconUrl, articleStickerModelCopy.brandThemeColor));
        return interactStickerStructLIZLLL;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public EnumC1466150oFx getStickerType() {
        return this.baseStickerModel.getType();
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public boolean isNotEmptyModel() {
        return C1533950q1J.LJ(this.articleLink) && C1533950q1J.LJ(this.articleTitle);
    }

    public final String getArticleLink() {
        return this.articleLink;
    }

    public final String getArticleTitle() {
        return this.articleTitle;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public BaseStickerModel getBaseModel() {
        return this.baseStickerModel;
    }

    public final BaseStickerModel getBaseStickerModel() {
        return this.baseStickerModel;
    }

    public final String getBrandIconId() {
        return this.brandIconId;
    }

    public final String getBrandIconUrl() {
        return this.brandIconUrl;
    }

    public final String getBrandThemeColor() {
        return this.brandThemeColor;
    }

    public final Integer getPreviewContainerHeightPx() {
        return this.previewContainerHeightPx;
    }

    public final Integer getRealMediaHeight() {
        return this.realMediaHeight;
    }

    public final Integer getRealMediaWidth() {
        return this.realMediaWidth;
    }

    public final StyleModel getStyleState() {
        return this.styleState;
    }

    public static final class StyleModel implements Serializable {
        public static final int $stable = 8;

        @C09CT("need_anim")
        public Boolean needAnim;

        @C09CT("type")
        public EnumC1779140wOm type;

        public StyleModel() {
            this(null, null);
        }

        public final StyleModel copy(EnumC1779140wOm enumC1779140wOm, Boolean bool) {
            return new StyleModel(enumC1779140wOm, bool);
        }

        public final void setNeedAnim(Boolean bool) {
            this.needAnim = bool;
        }

        public final void setType(EnumC1779140wOm enumC1779140wOm) {
            this.type = enumC1779140wOm;
        }

        public StyleModel(EnumC1779140wOm enumC1779140wOm, Boolean bool) {
            this.type = enumC1779140wOm;
            this.needAnim = bool;
        }
    }

    public final void setArticleLink(String str) {
        this.articleLink = str;
    }

    public final void setArticleTitle(String str) {
        this.articleTitle = str;
    }

    public final void setBrandIconId(String str) {
        this.brandIconId = str;
    }

    public final void setBrandIconUrl(String str) {
        this.brandIconUrl = str;
    }

    public final void setBrandThemeColor(String str) {
        this.brandThemeColor = str;
    }

    public final void setPreviewContainerHeightPx(Integer num) {
        this.previewContainerHeightPx = num;
    }

    public final void setRealMediaHeight(Integer num) {
        this.realMediaHeight = num;
    }

    public final void setRealMediaWidth(Integer num) {
        this.realMediaWidth = num;
    }

    public final void setStyleState(StyleModel styleModel) {
        this.styleState = styleModel;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public StickerModel updateMediaSize(Pair<Integer, Integer> pair) {
        return copy(BaseStickerModel.copy$default(this.baseStickerModel, 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, pair.getFirst().intValue(), pair.getSecond().intValue(), false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -24577, 15, null), this.articleLink, this.articleTitle, this.brandIconId, this.brandIconUrl, this.brandThemeColor, this.styleState, this.previewContainerHeightPx, this.realMediaWidth, this.realMediaHeight);
    }

    public ArticleStickerModel(BaseStickerModel baseStickerModel, String str, String str2, String str3, String str4, String str5, StyleModel styleModel, Integer num, Integer num2, Integer num3) {
        this.baseStickerModel = baseStickerModel;
        this.articleLink = str;
        this.articleTitle = str2;
        this.brandIconId = str3;
        this.brandIconUrl = str4;
        this.brandThemeColor = str5;
        this.styleState = styleModel;
        this.previewContainerHeightPx = num;
        this.realMediaWidth = num2;
        this.realMediaHeight = num3;
    }
}
