package com.ss.android.ugc.aweme.im.message.template.component;

import X.C08FF;
import X.C2254308sP;
import X.EnumC906750Zhh;
import X.InterfaceC2044707zh;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.component.StreamBlockActionComponent;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes15.dex */
public final class StreamBlockActionComponent implements BaseComponent<EnumC906750Zhh> {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ StreamBlockActionComponent[] $VALUES;
    public static final StreamBlockActionComponent ADD;
    public static final Parcelable.Creator<StreamBlockActionComponent> CREATOR;
    public static final StreamBlockActionComponent UNKNOWN;
    public static final StreamBlockActionComponent UPDATE;
    public final int value;

    public static InterfaceC2044707zh<StreamBlockActionComponent> getEntries() {
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
        StreamBlockActionComponent streamBlockActionComponent = new StreamBlockActionComponent("UNKNOWN", 0, EnumC906750Zhh.STREAM_BLOCK_ACTION_UNKNOWN.getValue());
        UNKNOWN = streamBlockActionComponent;
        StreamBlockActionComponent streamBlockActionComponent2 = new StreamBlockActionComponent("ADD", 1, EnumC906750Zhh.STREAM_BLOCK_ACTION_ADD.getValue());
        ADD = streamBlockActionComponent2;
        StreamBlockActionComponent streamBlockActionComponent3 = new StreamBlockActionComponent("UPDATE", 2, EnumC906750Zhh.STREAM_BLOCK_ACTION_UPDATE.getValue());
        UPDATE = streamBlockActionComponent3;
        StreamBlockActionComponent[] streamBlockActionComponentArr = {streamBlockActionComponent, streamBlockActionComponent2, streamBlockActionComponent3};
        $VALUES = streamBlockActionComponentArr;
        $ENTRIES = new C2254308sP(streamBlockActionComponentArr);
        CREATOR = new Parcelable.Creator<StreamBlockActionComponent>() { // from class: X.0Zhi
            @Override // android.os.Parcelable.Creator
            public final StreamBlockActionComponent createFromParcel(Parcel parcel) {
                return StreamBlockActionComponent.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final StreamBlockActionComponent[] newArray(int i) {
                return new StreamBlockActionComponent[i];
            }
        };
    }

    public static StreamBlockActionComponent[] values() {
        return (StreamBlockActionComponent[]) $VALUES.clone();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ss.android.ugc.aweme.im.message.template.component.BaseComponent
    public EnumC906750Zhh toProto() {
        return EnumC906750Zhh.fromValue(this.value);
    }

    public final int getValue() {
        return this.value;
    }

    public static StreamBlockActionComponent valueOf(String str) {
        return (StreamBlockActionComponent) C08FF.LIZ(StreamBlockActionComponent.class, str);
    }

    public StreamBlockActionComponent(String str, int i, int i2) {
        this.value = i2;
    }
}
