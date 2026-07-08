package com.ss.android.ugc.aweme.tools.sticker.core.location;

import X.AbstractC1442160ndG;
import X.C098200Yq;
import X.C09CT;
import X.C0FKI;
import X.C1440500naa;
import X.C1466320oGE;
import X.C189200o6;
import X.C19591311kt;
import X.C19598511m3;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C786410Ut5;
import X.EnumC1466150oFx;
import X.EnumC1466210oG3;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.PoiStickerStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.location.LocationStickerModel;
import java.io.Serializable;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class LocationStickerModel implements StickerModel, Parcelable, Serializable {

    @C09CT("base_sticker_model")
    public final BaseStickerModel baseStickerModel;

    @C09CT("clickable")
    public final boolean clickable;

    @C09CT("is_cut_off")
    public final Boolean isCutOff;

    @C09CT("poi_data")
    public PoiData poiData;

    @C09CT("text_size")
    public final float textSize;

    @C09CT("location_sticker_theme")
    public final EnumC1466210oG3 theme;

    @C09CT("use_capsule_style")
    public final boolean useCapsuleStyle;
    public static final Parcelable.Creator<LocationStickerModel> CREATOR = new Parcelable.Creator<LocationStickerModel>() { // from class: X.0oG8
        @Override // android.os.Parcelable.Creator
        public final LocationStickerModel createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            Boolean boolValueOf;
            boolean z3;
            BaseStickerModel baseStickerModelCreateFromParcel = BaseStickerModel.CREATOR.createFromParcel(parcel);
            EnumC1466210oG3 enumC1466210oG3ValueOf = EnumC1466210oG3.valueOf(parcel.readString());
            PoiData poiData = (PoiData) parcel.readSerializable();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            float f = parcel.readFloat();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolValueOf = Boolean.valueOf(z2);
            }
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            return new LocationStickerModel(baseStickerModelCreateFromParcel, enumC1466210oG3ValueOf, poiData, z, f, boolValueOf, z3);
        }

        @Override // android.os.Parcelable.Creator
        public final LocationStickerModel[] newArray(int i) {
            return new LocationStickerModel[i];
        }
    };
    public static final int $stable = 8;

    public final LocationStickerModel copy(BaseStickerModel baseStickerModel, EnumC1466210oG3 enumC1466210oG3, PoiData poiData, boolean z, float f, Boolean bool, boolean z2) {
        return new LocationStickerModel(baseStickerModel, enumC1466210oG3, poiData, z, f, bool, z2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationStickerModel)) {
            return false;
        }
        LocationStickerModel locationStickerModel = (LocationStickerModel) obj;
        return Intrinsics.LJFF(this.baseStickerModel, locationStickerModel.baseStickerModel) && this.theme == locationStickerModel.theme && Intrinsics.LJFF(this.poiData, locationStickerModel.poiData) && this.clickable == locationStickerModel.clickable && Float.compare(this.textSize, locationStickerModel.textSize) == 0 && Intrinsics.LJFF(this.isCutOff, locationStickerModel.isCutOff) && this.useCapsuleStyle == locationStickerModel.useCapsuleStyle;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public boolean isNotEmptyModel() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public boolean isVERenderSticker() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public boolean needCompile() {
        return true;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LocationStickerModel(baseStickerModel=");
        sbLIZ.append(this.baseStickerModel);
        sbLIZ.append(", theme=");
        sbLIZ.append(this.theme);
        sbLIZ.append(", poiData=");
        sbLIZ.append(this.poiData);
        sbLIZ.append(", clickable=");
        sbLIZ.append(this.clickable);
        sbLIZ.append(", textSize=");
        sbLIZ.append(this.textSize);
        sbLIZ.append(", isCutOff=");
        sbLIZ.append(this.isCutOff);
        sbLIZ.append(", useCapsuleStyle=");
        sbLIZ.append(this.useCapsuleStyle);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v8, types: [int] */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.os.Parcel] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ?? BooleanValue;
        this.baseStickerModel.writeToParcel(parcel, i);
        parcel.writeString(this.theme.name());
        parcel.writeSerializable(this.poiData);
        parcel.writeInt(this.clickable ? 1 : 0);
        parcel.writeFloat(this.textSize);
        Boolean bool = this.isCutOff;
        if (bool == null) {
            BooleanValue = 0;
        } else {
            parcel.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        parcel.writeInt(BooleanValue);
        parcel.writeInt(this.useCapsuleStyle ? 1 : 0);
    }

    public LocationStickerModel() {
        this(new BaseStickerModel(0, 0, EnumC1466150oFx.LOCATION, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -5, 15, null), EnumC1466210oG3.DEFAULT, null, false, 30.0f, null, false);
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public int getId() {
        return this.baseStickerModel.getId();
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public InteractStickerStruct getInteractStickerStruct() {
        String str;
        Object c098200Yq;
        C19591311kt.LIZ.getClass();
        InteractStickerStruct interactStickerStructLIZLLL = C19591311kt.LIZLLL(this, true);
        PoiData poiData = this.poiData;
        if (poiData == null || (str = poiData.poiId) == null) {
            str = "";
        }
        PoiStickerStruct poiStickerStruct = new PoiStickerStruct(str);
        poiStickerStruct.setStickerTheme(this.theme.getType());
        poiStickerStruct.setPoiData(this.poiData);
        poiStickerStruct.setStartTime((int) this.baseStickerModel.getStartTime());
        poiStickerStruct.setEndTime((int) this.baseStickerModel.getEndTime());
        poiStickerStruct.setTextSize(this.textSize);
        interactStickerStructLIZLLL.setPoiStickerStruct(poiStickerStruct);
        interactStickerStructLIZLLL.setType(getStickerType().getType());
        try {
            Gson gsonLIZ = C19598511m3.LIZ();
            Pair[] pairArr = new Pair[2];
            pairArr[0] = new Pair("sticker_type", String.valueOf(this.theme.getType()));
            pairArr[1] = new Pair("is_cut_off", Intrinsics.LJFF(this.isCutOff, Boolean.TRUE) ? "1" : CardStruct.IStatusCode.DEFAULT);
            c098200Yq = gsonLIZ.LJIILL(C2097608Jq.LJIIIIZZ(pairArr));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        interactStickerStructLIZLLL.setAttr((String) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq));
        return interactStickerStructLIZLLL;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public EnumC1466150oFx getStickerType() {
        return this.baseStickerModel.getType();
    }

    public int hashCode() {
        int iHashCode = ((this.baseStickerModel.hashCode() * 31) + this.theme.hashCode()) * 31;
        PoiData poiData = this.poiData;
        int iHashCode2 = (((((iHashCode + (poiData == null ? 0 : poiData.hashCode())) * 31) + C786410Ut5.Z2(this.clickable)) * 31) + Float.floatToIntBits(this.textSize)) * 31;
        Boolean bool = this.isCutOff;
        return ((iHashCode2 + (bool != null ? bool.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.useCapsuleStyle);
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

    public final PoiData getPoiData() {
        return this.poiData;
    }

    public final float getTextSize() {
        return this.textSize;
    }

    public final EnumC1466210oG3 getTheme() {
        return this.theme;
    }

    public final boolean getUseCapsuleStyle() {
        return this.useCapsuleStyle;
    }

    public final Boolean isCutOff() {
        return this.isCutOff;
    }

    public final void setPoiData(PoiData poiData) {
        this.poiData = poiData;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public StickerModel updateMediaSize(Pair<Integer, Integer> pair) {
        return copy(BaseStickerModel.copy$default(this.baseStickerModel, 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, pair.getFirst().intValue(), pair.getSecond().intValue(), false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -24577, 15, null), this.theme, this.poiData, this.clickable, this.textSize, this.isCutOff, this.useCapsuleStyle);
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public AbstractC1442160ndG<?> stickerCompileComponent(Context context, String str, C1440500naa c1440500naa, C0FKI c0fki, String str2) {
        return new C1466320oGE(context, c1440500naa, c0fki, str);
    }

    public LocationStickerModel(BaseStickerModel baseStickerModel, EnumC1466210oG3 enumC1466210oG3, PoiData poiData, boolean z, float f, Boolean bool, boolean z2) {
        this.baseStickerModel = baseStickerModel;
        this.theme = enumC1466210oG3;
        this.poiData = poiData;
        this.clickable = z;
        this.textSize = f;
        this.isCutOff = bool;
        this.useCapsuleStyle = z2;
    }
}
