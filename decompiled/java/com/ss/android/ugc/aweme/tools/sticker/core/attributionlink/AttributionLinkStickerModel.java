package com.ss.android.ugc.aweme.tools.sticker.core.attributionlink;

import X.AbstractC1442160ndG;
import X.C09CT;
import X.C0FKI;
import X.C123100dR;
import X.C1440500naa;
import X.C19591311kt;
import X.C2188811AlT;
import X.C786410Ut5;
import X.EnumC1466150oFx;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.attributionlink.model.AttributionLinkShareFormat;
import com.ss.android.ugc.aweme.attributionlink.model.AttributionLinkStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.attributionlink.AttributionLinkScenario;
import com.ss.android.ugc.aweme.tools.sticker.core.attributionlink.AttributionLinkStickerModel;
import java.io.Serializable;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class AttributionLinkStickerModel implements StickerModel, Parcelable, Serializable {

    @C09CT("base_sticker_model")
    public final BaseStickerModel baseStickerModel;

    @C09CT("clickable")
    public final boolean clickable;

    @C09CT("editable")
    public final boolean editable;

    @C09CT("media_size")
    public final int mediaSize;

    @C09CT("scenario")
    public final AttributionLinkScenario scenario;

    @C09CT("share_format")
    public final AttributionLinkShareFormat shareFormat;

    @C09CT("title")
    public final String title;

    @C09CT("url")
    public final String url;

    @C09CT("visible")
    public final boolean visible;
    public static final Parcelable.Creator<AttributionLinkStickerModel> CREATOR = new Parcelable.Creator<AttributionLinkStickerModel>() { // from class: X.11lB
        @Override // android.os.Parcelable.Creator
        public final AttributionLinkStickerModel createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            BaseStickerModel baseStickerModelCreateFromParcel = BaseStickerModel.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            return new AttributionLinkStickerModel(baseStickerModelCreateFromParcel, z, z2, z3, AttributionLinkScenario.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), AttributionLinkShareFormat.valueOf(parcel.readString()), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final AttributionLinkStickerModel[] newArray(int i) {
            return new AttributionLinkStickerModel[i];
        }
    };
    public static final int $stable = 8;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public AttributionLinkStickerModel() {
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        Object[] objArr4 = 0 == true ? 1 : 0;
        Object[] objArr5 = 0 == true ? 1 : 0;
        this(null, false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, objArr, objArr2, objArr3, objArr4, 0 == true ? 1 : 0, 511, objArr5);
    }

    public final AttributionLinkStickerModel copy(BaseStickerModel baseStickerModel, boolean z, boolean z2, boolean z3, AttributionLinkScenario attributionLinkScenario, String str, String str2, AttributionLinkShareFormat attributionLinkShareFormat, int i) {
        return new AttributionLinkStickerModel(baseStickerModel, z, z2, z3, attributionLinkScenario, str, str2, attributionLinkShareFormat, i);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AttributionLinkStickerModel)) {
            return false;
        }
        AttributionLinkStickerModel attributionLinkStickerModel = (AttributionLinkStickerModel) obj;
        return Intrinsics.LJFF(this.baseStickerModel, attributionLinkStickerModel.baseStickerModel) && this.visible == attributionLinkStickerModel.visible && this.editable == attributionLinkStickerModel.editable && this.clickable == attributionLinkStickerModel.clickable && this.scenario == attributionLinkStickerModel.scenario && Intrinsics.LJFF(this.title, attributionLinkStickerModel.title) && Intrinsics.LJFF(this.url, attributionLinkStickerModel.url) && this.shareFormat == attributionLinkStickerModel.shareFormat && this.mediaSize == attributionLinkStickerModel.mediaSize;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.baseStickerModel.hashCode() * 31) + C786410Ut5.Z2(this.visible)) * 31) + C786410Ut5.Z2(this.editable)) * 31) + C786410Ut5.Z2(this.clickable)) * 31) + this.scenario.hashCode()) * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.url;
        return ((((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.shareFormat.hashCode()) * 31) + this.mediaSize;
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
        sbLIZ.append("AttributionLinkStickerModel(baseStickerModel=");
        sbLIZ.append(this.baseStickerModel);
        sbLIZ.append(", visible=");
        sbLIZ.append(this.visible);
        sbLIZ.append(", editable=");
        sbLIZ.append(this.editable);
        sbLIZ.append(", clickable=");
        sbLIZ.append(this.clickable);
        sbLIZ.append(", scenario=");
        sbLIZ.append(this.scenario);
        sbLIZ.append(", title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", url=");
        sbLIZ.append(this.url);
        sbLIZ.append(", shareFormat=");
        sbLIZ.append(this.shareFormat);
        sbLIZ.append(", mediaSize=");
        sbLIZ.append(this.mediaSize);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public StickerModel updateMediaSize(Pair<Integer, Integer> pair) {
        return this;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.baseStickerModel.writeToParcel(parcel, i);
        parcel.writeInt(this.visible ? 1 : 0);
        parcel.writeInt(this.editable ? 1 : 0);
        parcel.writeInt(this.clickable ? 1 : 0);
        parcel.writeString(this.scenario.name());
        parcel.writeString(this.title);
        parcel.writeString(this.url);
        parcel.writeString(this.shareFormat.name());
        parcel.writeInt(this.mediaSize);
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public int getId() {
        return this.baseStickerModel.getId();
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public InteractStickerStruct getInteractStickerStruct() {
        C19591311kt.LIZ.getClass();
        InteractStickerStruct interactStickerStructLIZLLL = C19591311kt.LIZLLL(this, false);
        interactStickerStructLIZLLL.setType(getStickerType().getType());
        interactStickerStructLIZLLL.setAttributionLinkStickerStruct(new AttributionLinkStickerStruct(this.scenario.getValue(), this.title, this.url, this.shareFormat.getValue(), 0));
        return interactStickerStructLIZLLL;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public boolean isNotEmptyModel() {
        return C123100dR.LIZ(this.title) && C123100dR.LIZ(this.url);
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public BaseStickerModel getBaseModel() {
        return this.baseStickerModel;
    }

    public final BaseStickerModel getBaseStickerModel() {
        return this.baseStickerModel;
    }

    public final boolean getClickable() {
        return this.clickable;
    }

    public final boolean getEditable() {
        return this.editable;
    }

    public final int getMediaSize() {
        return this.mediaSize;
    }

    public final AttributionLinkScenario getScenario() {
        return this.scenario;
    }

    public final AttributionLinkShareFormat getShareFormat() {
        return this.shareFormat;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public EnumC1466150oFx getStickerType() {
        return EnumC1466150oFx.ATTRIBUTION_LINK;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public final boolean getVisible() {
        return this.visible;
    }

    public AttributionLinkStickerModel(BaseStickerModel baseStickerModel, boolean z, boolean z2, boolean z3, AttributionLinkScenario attributionLinkScenario, String str, String str2, AttributionLinkShareFormat attributionLinkShareFormat, int i) {
        this.baseStickerModel = baseStickerModel;
        this.visible = z;
        this.editable = z2;
        this.clickable = z3;
        this.scenario = attributionLinkScenario;
        this.title = str;
        this.url = str2;
        this.shareFormat = attributionLinkShareFormat;
        this.mediaSize = i;
    }

    public /* synthetic */ AttributionLinkStickerModel(BaseStickerModel baseStickerModel, boolean z, boolean z2, boolean z3, AttributionLinkScenario attributionLinkScenario, String str, String str2, AttributionLinkShareFormat attributionLinkShareFormat, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? new BaseStickerModel(0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -1, 15, null) : baseStickerModel, (i2 & 2) != 0 ? true : z, (i2 & 4) != 0 ? false : z2, (i2 & 8) != 0 ? false : z3, (i2 & 16) != 0 ? AttributionLinkScenario.ATTRIBUTION_LINK_SCENARIO_UNKNOWN : attributionLinkScenario, (i2 & 32) != 0 ? null : str, (i2 & 64) == 0 ? str2 : null, (i2 & 128) != 0 ? AttributionLinkShareFormat.ATTRIBUTION_LINK_SHARE_FORMAT_UNKNOWN : attributionLinkShareFormat, (i2 & 256) == 0 ? i : 0);
    }
}
