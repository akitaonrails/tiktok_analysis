package com.ss.android.ugc.aweme.creative.model.record;

import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.record.LayoutApplyFrom;
import java.io.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class LayoutApplyFrom implements Serializable, Parcelable {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ LayoutApplyFrom[] $VALUES;
    public static final LayoutApplyFrom ALBUM;
    public static final LayoutApplyFrom ANCHOR;
    public static final Parcelable.Creator<LayoutApplyFrom> CREATOR;
    public static final LayoutApplyFrom SIDEBAR;
    public static final LayoutApplyFrom UNKNOWN;

    @C09CT("apply_from")
    public final String value;

    public static InterfaceC2044707zh<LayoutApplyFrom> getEntries() {
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
        LayoutApplyFrom layoutApplyFrom = new LayoutApplyFrom("UNKNOWN", 0, "unknown");
        UNKNOWN = layoutApplyFrom;
        LayoutApplyFrom layoutApplyFrom2 = new LayoutApplyFrom("ANCHOR", 1, "anchor");
        ANCHOR = layoutApplyFrom2;
        LayoutApplyFrom layoutApplyFrom3 = new LayoutApplyFrom("SIDEBAR", 2, "sidebar");
        SIDEBAR = layoutApplyFrom3;
        LayoutApplyFrom layoutApplyFrom4 = new LayoutApplyFrom("ALBUM", 3, "album");
        ALBUM = layoutApplyFrom4;
        LayoutApplyFrom[] layoutApplyFromArr = {layoutApplyFrom, layoutApplyFrom2, layoutApplyFrom3, layoutApplyFrom4};
        $VALUES = layoutApplyFromArr;
        $ENTRIES = new C2254308sP(layoutApplyFromArr);
        CREATOR = new Parcelable.Creator<LayoutApplyFrom>() { // from class: X.0L9Z
            @Override // android.os.Parcelable.Creator
            public final LayoutApplyFrom createFromParcel(Parcel parcel) {
                return LayoutApplyFrom.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final LayoutApplyFrom[] newArray(int i) {
                return new LayoutApplyFrom[i];
            }
        };
    }

    public static LayoutApplyFrom[] values() {
        return (LayoutApplyFrom[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public static LayoutApplyFrom valueOf(String str) {
        return (LayoutApplyFrom) C08FF.LIZ(LayoutApplyFrom.class, str);
    }

    public LayoutApplyFrom(String str, int i, String str2) {
        this.value = str2;
    }
}
