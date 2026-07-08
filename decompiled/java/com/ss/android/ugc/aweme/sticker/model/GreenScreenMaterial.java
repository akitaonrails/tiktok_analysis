package com.ss.android.ugc.aweme.sticker.model;

import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;
import com.ss.android.ugc.aweme.sticker.model.GreenScreenMaterial;
import java.io.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class GreenScreenMaterial implements Parcelable, Serializable {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ GreenScreenMaterial[] $VALUES;
    public static final Parcelable.Creator<GreenScreenMaterial> CREATOR;

    @C09CT("type")
    public final String type;
    public static final GreenScreenMaterial DEFAULT = new GreenScreenMaterial(LivePreviewCTASmartDisplayManager.DEFAULT, 0, "default");
    public static final GreenScreenMaterial PHOTO = new GreenScreenMaterial("PHOTO", 1, "photo");
    public static final GreenScreenMaterial VIDEO = new GreenScreenMaterial("VIDEO", 2, "video");
    public static final GreenScreenMaterial LIVE = new GreenScreenMaterial("LIVE", 3, "live");

    public static final /* synthetic */ GreenScreenMaterial[] $values() {
        return new GreenScreenMaterial[]{DEFAULT, PHOTO, VIDEO, LIVE};
    }

    public static InterfaceC2044707zh<GreenScreenMaterial> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }

    static {
        GreenScreenMaterial[] greenScreenMaterialArr$values = $values();
        $VALUES = greenScreenMaterialArr$values;
        $ENTRIES = new C2254308sP(greenScreenMaterialArr$values);
        CREATOR = new Parcelable.Creator<GreenScreenMaterial>() { // from class: X.0mst
            @Override // android.os.Parcelable.Creator
            public final GreenScreenMaterial createFromParcel(Parcel parcel) {
                return GreenScreenMaterial.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final GreenScreenMaterial[] newArray(int i) {
                return new GreenScreenMaterial[i];
            }
        };
    }

    public static GreenScreenMaterial[] values() {
        return (GreenScreenMaterial[]) $VALUES.clone();
    }

    public final String getType() {
        return this.type;
    }

    public static GreenScreenMaterial valueOf(String str) {
        return (GreenScreenMaterial) C08FF.LIZ(GreenScreenMaterial.class, str);
    }

    public GreenScreenMaterial(String str, int i, String str2) {
        this.type = str2;
    }
}
