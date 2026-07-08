package com.ss.android.ugc.aweme.im.message.template.component;

import X.C08FF;
import X.C2254308sP;
import X.EnumC2240801Cn8;
import X.InterfaceC2044707zh;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.component.StreamStatusComponent;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes35.dex */
public final class StreamStatusComponent implements BaseComponent<EnumC2240801Cn8> {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ StreamStatusComponent[] $VALUES;
    public static final Parcelable.Creator<StreamStatusComponent> CREATOR;
    public static final StreamStatusComponent ERROR;
    public static final StreamStatusComponent FINISH;
    public static final StreamStatusComponent START;
    public static final StreamStatusComponent UNKNOWN;
    public static final StreamStatusComponent WAIT;
    public final int value;

    public static InterfaceC2044707zh<StreamStatusComponent> getEntries() {
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
        StreamStatusComponent streamStatusComponent = new StreamStatusComponent("UNKNOWN", 0, EnumC2240801Cn8.STREAM_STATUS_UNKNOWN.getValue());
        UNKNOWN = streamStatusComponent;
        StreamStatusComponent streamStatusComponent2 = new StreamStatusComponent("START", 1, EnumC2240801Cn8.STREAM_STATUS_START.getValue());
        START = streamStatusComponent2;
        StreamStatusComponent streamStatusComponent3 = new StreamStatusComponent("WAIT", 2, EnumC2240801Cn8.STREAM_STATUS_WAIT.getValue());
        WAIT = streamStatusComponent3;
        StreamStatusComponent streamStatusComponent4 = new StreamStatusComponent("FINISH", 3, EnumC2240801Cn8.STREAM_STATUS_FINISH.getValue());
        FINISH = streamStatusComponent4;
        StreamStatusComponent streamStatusComponent5 = new StreamStatusComponent("ERROR", 4, EnumC2240801Cn8.STREAM_STATUS_ERROR.getValue());
        ERROR = streamStatusComponent5;
        StreamStatusComponent[] streamStatusComponentArr = {streamStatusComponent, streamStatusComponent2, streamStatusComponent3, streamStatusComponent4, streamStatusComponent5};
        $VALUES = streamStatusComponentArr;
        $ENTRIES = new C2254308sP(streamStatusComponentArr);
        CREATOR = new Parcelable.Creator<StreamStatusComponent>() { // from class: X.1Cn9
            @Override // android.os.Parcelable.Creator
            public final StreamStatusComponent createFromParcel(Parcel parcel) {
                return StreamStatusComponent.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final StreamStatusComponent[] newArray(int i) {
                return new StreamStatusComponent[i];
            }
        };
    }

    public static StreamStatusComponent[] values() {
        return (StreamStatusComponent[]) $VALUES.clone();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ss.android.ugc.aweme.im.message.template.component.BaseComponent
    public EnumC2240801Cn8 toProto() {
        return EnumC2240801Cn8.fromValue(this.value);
    }

    public final int getValue() {
        return this.value;
    }

    public static StreamStatusComponent valueOf(String str) {
        return (StreamStatusComponent) C08FF.LIZ(StreamStatusComponent.class, str);
    }

    public StreamStatusComponent(String str, int i, int i2) {
        this.value = i2;
    }
}
