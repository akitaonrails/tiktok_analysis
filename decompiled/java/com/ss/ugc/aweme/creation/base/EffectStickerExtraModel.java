package com.ss.ugc.aweme.creation.base;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.ugc.aweme.creation.base.EffectStickerExtraModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public class EffectStickerExtraModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<EffectStickerExtraModel> CREATOR = new Parcelable.Creator<EffectStickerExtraModel>() { // from class: X.0Mhn
        @Override // android.os.Parcelable.Creator
        public final EffectStickerExtraModel createFromParcel(Parcel parcel) {
            return new EffectStickerExtraModel(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final EffectStickerExtraModel[] newArray(int i) {
            return new EffectStickerExtraModel[i];
        }
    };

    @C09CT("effect_id")
    public String effectId;

    @C09CT("panel_category")
    public String panelCategory;

    @C09CT("panel_name")
    public String panelName;

    public EffectStickerExtraModel() {
        this(null, null, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.effectId);
        parcel.writeString(this.panelName);
        parcel.writeString(this.panelCategory);
    }

    public final String getEffectId() {
        return this.effectId;
    }

    public final String getPanelCategory() {
        return this.panelCategory;
    }

    public final String getPanelName() {
        return this.panelName;
    }

    public final void setEffectId(String str) {
        this.effectId = str;
    }

    public final void setPanelCategory(String str) {
        this.panelCategory = str;
    }

    public final void setPanelName(String str) {
        this.panelName = str;
    }

    public EffectStickerExtraModel(String str, String str2, String str3) {
        this.effectId = str;
        this.panelName = str2;
        this.panelCategory = str3;
    }
}
