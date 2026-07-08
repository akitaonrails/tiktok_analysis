package com.ss.android.ugc.aweme.ecommerce.sticker;

import X.AbstractC1442160ndG;
import X.C09CT;
import X.C0FKI;
import X.C1440500naa;
import X.C19591311kt;
import X.C2188811AlT;
import X.C786410Ut5;
import X.EnumC1466150oFx;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.sticker.EcommerceStickerModel;
import com.ss.android.ugc.aweme.sticker.data.EcommerceStickerBg;
import com.ss.android.ugc.aweme.sticker.data.EcommerceStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.EcommerceStickerTitle;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import java.io.Serializable;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class EcommerceStickerModel implements StickerModel, Parcelable, Serializable {
    public static final Parcelable.Creator<EcommerceStickerModel> CREATOR = new Parcelable.Creator<EcommerceStickerModel>() { // from class: X.11k9
        @Override // android.os.Parcelable.Creator
        public final EcommerceStickerModel createFromParcel(Parcel parcel) {
            boolean z;
            BaseStickerModel baseStickerModel = (BaseStickerModel) parcel.readParcelable(EcommerceStickerModel.class.getClassLoader());
            EcommerceStickerStruct ecommerceStickerStruct = (EcommerceStickerStruct) parcel.readSerializable();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new EcommerceStickerModel(baseStickerModel, ecommerceStickerStruct, z);
        }

        @Override // android.os.Parcelable.Creator
        public final EcommerceStickerModel[] newArray(int i) {
            return new EcommerceStickerModel[i];
        }
    };

    @C09CT("base_sticker_model")
    public final BaseStickerModel baseStickerModel;

    @C09CT("clickable")
    public final boolean clickable;

    @C09CT("ecommerce_sticker")
    public final EcommerceStickerStruct ecommerceSticker;

    public EcommerceStickerModel() {
        this(new BaseStickerModel(0, 0, EnumC1466150oFx.ECOMMERCE, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -5, 15, null), new EcommerceStickerStruct(null, null, null), false);
    }

    public final EcommerceStickerModel copy(BaseStickerModel baseStickerModel, EcommerceStickerStruct ecommerceStickerStruct, boolean z) {
        return new EcommerceStickerModel(baseStickerModel, ecommerceStickerStruct, z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EcommerceStickerModel)) {
            return false;
        }
        EcommerceStickerModel ecommerceStickerModel = (EcommerceStickerModel) obj;
        return Intrinsics.LJFF(this.baseStickerModel, ecommerceStickerModel.baseStickerModel) && Intrinsics.LJFF(this.ecommerceSticker, ecommerceStickerModel.ecommerceSticker) && this.clickable == ecommerceStickerModel.clickable;
    }

    public int hashCode() {
        return (((this.baseStickerModel.hashCode() * 31) + this.ecommerceSticker.hashCode()) * 31) + C786410Ut5.Z2(this.clickable);
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
        sbLIZ.append("EcommerceStickerModel(baseStickerModel=");
        sbLIZ.append(this.baseStickerModel);
        sbLIZ.append(", ecommerceSticker=");
        sbLIZ.append(this.ecommerceSticker);
        sbLIZ.append(", clickable=");
        sbLIZ.append(this.clickable);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.baseStickerModel, i);
        parcel.writeSerializable(this.ecommerceSticker);
        parcel.writeInt(this.clickable ? 1 : 0);
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public int getId() {
        return this.baseStickerModel.getId();
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public InteractStickerStruct getInteractStickerStruct() {
        C19591311kt.LIZ.getClass();
        InteractStickerStruct interactStickerStructLIZLLL = C19591311kt.LIZLLL(this, true);
        interactStickerStructLIZLLL.setEcommerceStickerStruct(this.ecommerceSticker);
        interactStickerStructLIZLLL.setType(getStickerType().getType());
        return interactStickerStructLIZLLL;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public EnumC1466150oFx getStickerType() {
        return this.baseStickerModel.getType();
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public boolean isNotEmptyModel() {
        String str;
        EcommerceStickerTitle title = this.ecommerceSticker.getTitle();
        String str2 = title != null ? title.text : null;
        if (str2 != null && str2.length() != 0) {
            return true;
        }
        EcommerceStickerBg bg = this.ecommerceSticker.getBg();
        return (bg == null || (str = bg.url) == null || str.length() == 0) ? false : true;
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

    public final EcommerceStickerStruct getEcommerceSticker() {
        return this.ecommerceSticker;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public StickerModel updateMediaSize(Pair<Integer, Integer> pair) {
        return copy(BaseStickerModel.copy$default(this.baseStickerModel, 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, pair.getFirst().intValue(), pair.getSecond().intValue(), false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -24577, 15, null), this.ecommerceSticker, this.clickable);
    }

    public EcommerceStickerModel(BaseStickerModel baseStickerModel, EcommerceStickerStruct ecommerceStickerStruct, boolean z) {
        this.baseStickerModel = baseStickerModel;
        this.ecommerceSticker = ecommerceStickerStruct;
        this.clickable = z;
    }
}
