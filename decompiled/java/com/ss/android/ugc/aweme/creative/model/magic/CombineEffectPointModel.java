package com.ss.android.ugc.aweme.creative.model.magic;

import X.C09CT;
import X.C364780ERw;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.magic.CombineEffectPointModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.io.Serializable;

/* JADX INFO: loaded from: classes6.dex */
public class CombineEffectPointModel implements Serializable, Parcelable {

    @C09CT("combine_effect_key")
    public String key;

    @C09CT("combine_effect_name")
    public String name;

    @C09CT("combine_effect_panel")
    public String panel;

    @C09CT("combine_effect_resDir")
    public String resDir;

    @C09CT("combine_effect_resourceId")
    public String resourceId;
    public static final C364780ERw Companion = new Object() { // from class: X.0ERw
    };
    public static final Parcelable.Creator<CombineEffectPointModel> CREATOR = new Parcelable.Creator<CombineEffectPointModel>() { // from class: X.0ERv
        @Override // android.os.Parcelable.Creator
        public final CombineEffectPointModel createFromParcel(Parcel parcel) {
            CombineEffectPointModel.Companion.getClass();
            return new CombineEffectPointModel(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final CombineEffectPointModel[] newArray(int i) {
            return new CombineEffectPointModel[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public CombineEffectPointModel() {
        this.key = CardStruct.IStatusCode.DEFAULT;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPanel() {
        return this.panel;
    }

    public final String getResDir() {
        return this.resDir;
    }

    public final String getResourceId() {
        return this.resourceId;
    }

    public CombineEffectPointModel(Parcel parcel) {
        this();
        String string = parcel.readString();
        this.key = string == null ? "" : string;
        this.resDir = parcel.readString();
        this.name = parcel.readString();
        String string2 = parcel.readString();
        this.panel = string2 == null ? "" : string2;
        String string3 = parcel.readString();
        this.resourceId = string3 != null ? string3 : "";
    }

    public final void setKey(String str) {
        this.key = str;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setPanel(String str) {
        this.panel = str;
    }

    public final void setResDir(String str) {
        this.resDir = str;
    }

    public final void setResourceId(String str) {
        this.resourceId = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Companion.getClass();
        parcel.writeString(getKey());
        parcel.writeString(getResDir());
        parcel.writeString(getName());
        parcel.writeString(getPanel());
        parcel.writeString(getResourceId());
    }
}
