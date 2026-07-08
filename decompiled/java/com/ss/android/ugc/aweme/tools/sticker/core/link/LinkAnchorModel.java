package com.ss.android.ugc.aweme.tools.sticker.core.link;

import X.AbstractC1442160ndG;
import X.C09CT;
import X.C0FKI;
import X.C1440500naa;
import X.C19591311kt;
import X.C2188811AlT;
import X.EnumC1466150oFx;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.attributionlink.model.AttributionLinkStoryAnchorStruct;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.link.LinkAnchorModel;
import java.io.Serializable;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class LinkAnchorModel implements StickerModel, Serializable {

    @C09CT("base_sticker_model")
    public final BaseStickerModel baseStickerModel;

    @C09CT("display_text")
    public String displayText;

    @C09CT("link_address")
    public String fullURL;

    @C09CT("external_title")
    public String title;
    public static final Parcelable.Creator<LinkAnchorModel> CREATOR = new Parcelable.Creator<LinkAnchorModel>() { // from class: X.0oGG
        @Override // android.os.Parcelable.Creator
        public final LinkAnchorModel createFromParcel(Parcel parcel) {
            return new LinkAnchorModel(BaseStickerModel.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final LinkAnchorModel[] newArray(int i) {
            return new LinkAnchorModel[i];
        }
    };
    public static final int $stable = 8;

    public final LinkAnchorModel copy(BaseStickerModel baseStickerModel, String str, String str2, String str3) {
        return new LinkAnchorModel(baseStickerModel, str, str2, str3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LinkAnchorModel)) {
            return false;
        }
        LinkAnchorModel linkAnchorModel = (LinkAnchorModel) obj;
        return Intrinsics.LJFF(this.baseStickerModel, linkAnchorModel.baseStickerModel) && Intrinsics.LJFF(this.fullURL, linkAnchorModel.fullURL) && Intrinsics.LJFF(this.displayText, linkAnchorModel.displayText) && Intrinsics.LJFF(this.title, linkAnchorModel.title);
    }

    public int hashCode() {
        return (((((this.baseStickerModel.hashCode() * 31) + this.fullURL.hashCode()) * 31) + this.displayText.hashCode()) * 31) + this.title.hashCode();
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
        sbLIZ.append("LinkAnchorModel(baseStickerModel=");
        sbLIZ.append(this.baseStickerModel);
        sbLIZ.append(", fullURL=");
        sbLIZ.append(this.fullURL);
        sbLIZ.append(", displayText=");
        sbLIZ.append(this.displayText);
        sbLIZ.append(", title=");
        sbLIZ.append(this.title);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.baseStickerModel.writeToParcel(parcel, i);
        parcel.writeString(this.fullURL);
        parcel.writeString(this.displayText);
        parcel.writeString(this.title);
    }

    public LinkAnchorModel() {
        this(new BaseStickerModel(0, 0, EnumC1466150oFx.LINK_ANCHOR, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -5, 15, null), "", "", "");
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public int getId() {
        return this.baseStickerModel.getId();
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public InteractStickerStruct getInteractStickerStruct() {
        C19591311kt.LIZ.getClass();
        InteractStickerStruct interactStickerStructLIZLLL = C19591311kt.LIZLLL(this, true);
        interactStickerStructLIZLLL.setType(getStickerType().getType());
        interactStickerStructLIZLLL.setAttributionLinkStoryAnchorStruct(new AttributionLinkStoryAnchorStruct(this.title, this.fullURL, this.displayText));
        return interactStickerStructLIZLLL;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public EnumC1466150oFx getStickerType() {
        return this.baseStickerModel.getType();
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public boolean isNotEmptyModel() {
        return this.fullURL.length() > 0;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public BaseStickerModel getBaseModel() {
        return this.baseStickerModel;
    }

    public final BaseStickerModel getBaseStickerModel() {
        return this.baseStickerModel;
    }

    public final String getDisplayText() {
        return this.displayText;
    }

    public final String getFullURL() {
        return this.fullURL;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setDisplayText(String str) {
        this.displayText = str;
    }

    public final void setFullURL(String str) {
        this.fullURL = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public StickerModel updateMediaSize(Pair<Integer, Integer> pair) {
        return copy(BaseStickerModel.copy$default(this.baseStickerModel, 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, pair.getFirst().intValue(), pair.getSecond().intValue(), false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -24577, 15, null), this.fullURL, this.displayText, this.title);
    }

    public LinkAnchorModel(BaseStickerModel baseStickerModel, String str, String str2, String str3) {
        this.baseStickerModel = baseStickerModel;
        this.fullURL = str;
        this.displayText = str2;
        this.title = str3;
    }
}
