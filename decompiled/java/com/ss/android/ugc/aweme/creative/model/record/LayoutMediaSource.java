package com.ss.android.ugc.aweme.creative.model.record;

import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.record.LayoutMediaSource;
import java.io.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class LayoutMediaSource implements Serializable, Parcelable {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ LayoutMediaSource[] $VALUES;
    public static final LayoutMediaSource CAPTURE;
    public static final Parcelable.Creator<LayoutMediaSource> CREATOR;
    public static final LayoutMediaSource UPLOAD;

    @C09CT("media_source")
    public final int value;

    public static InterfaceC2044707zh<LayoutMediaSource> getEntries() {
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
        LayoutMediaSource layoutMediaSource = new LayoutMediaSource("CAPTURE", 0, 0);
        CAPTURE = layoutMediaSource;
        LayoutMediaSource layoutMediaSource2 = new LayoutMediaSource("UPLOAD", 1, 1);
        UPLOAD = layoutMediaSource2;
        LayoutMediaSource[] layoutMediaSourceArr = {layoutMediaSource, layoutMediaSource2};
        $VALUES = layoutMediaSourceArr;
        $ENTRIES = new C2254308sP(layoutMediaSourceArr);
        CREATOR = new Parcelable.Creator<LayoutMediaSource>() { // from class: X.0L9a
            @Override // android.os.Parcelable.Creator
            public final LayoutMediaSource createFromParcel(Parcel parcel) {
                return LayoutMediaSource.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final LayoutMediaSource[] newArray(int i) {
                return new LayoutMediaSource[i];
            }
        };
    }

    public static LayoutMediaSource[] values() {
        return (LayoutMediaSource[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }

    public static LayoutMediaSource valueOf(String str) {
        return (LayoutMediaSource) C08FF.LIZ(LayoutMediaSource.class, str);
    }

    public LayoutMediaSource(String str, int i, int i2) {
        this.value = i2;
    }
}
