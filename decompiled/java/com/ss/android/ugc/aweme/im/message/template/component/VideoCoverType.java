package com.ss.android.ugc.aweme.im.message.template.component;

import X.C08FF;
import X.C2254308sP;
import X.EnumC2244241Csg;
import X.InterfaceC2044707zh;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.component.VideoCoverType;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes35.dex */
public final class VideoCoverType implements BaseComponent<EnumC2244241Csg> {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ VideoCoverType[] $VALUES;
    public static final Parcelable.Creator<VideoCoverType> CREATOR;
    public static final VideoCoverType INVALID;
    public static final VideoCoverType LIVE;
    public static final VideoCoverType VIDEO;
    public final int value;

    public static InterfaceC2044707zh<VideoCoverType> getEntries() {
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
        VideoCoverType videoCoverType = new VideoCoverType("INVALID", 0, -1);
        INVALID = videoCoverType;
        VideoCoverType videoCoverType2 = new VideoCoverType("VIDEO", 1, EnumC2244241Csg.Video.getValue());
        VIDEO = videoCoverType2;
        VideoCoverType videoCoverType3 = new VideoCoverType("LIVE", 2, EnumC2244241Csg.Live.getValue());
        LIVE = videoCoverType3;
        VideoCoverType[] videoCoverTypeArr = {videoCoverType, videoCoverType2, videoCoverType3};
        $VALUES = videoCoverTypeArr;
        $ENTRIES = new C2254308sP(videoCoverTypeArr);
        CREATOR = new Parcelable.Creator<VideoCoverType>() { // from class: X.1Csj
            @Override // android.os.Parcelable.Creator
            public final VideoCoverType createFromParcel(Parcel parcel) {
                return VideoCoverType.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final VideoCoverType[] newArray(int i) {
                return new VideoCoverType[i];
            }
        };
    }

    public static VideoCoverType[] values() {
        return (VideoCoverType[]) $VALUES.clone();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ss.android.ugc.aweme.im.message.template.component.BaseComponent
    public EnumC2244241Csg toProto() {
        return EnumC2244241Csg.fromValue(this.value);
    }

    public final int getValue() {
        return this.value;
    }

    public static VideoCoverType valueOf(String str) {
        return (VideoCoverType) C08FF.LIZ(VideoCoverType.class, str);
    }

    public VideoCoverType(String str, int i, int i2) {
        this.value = i2;
    }
}
