package com.ss.android.ugc.aweme.im.message.template.component;

import X.C08FF;
import X.C2254308sP;
import X.EnumC2240771Cn5;
import X.InterfaceC2044707zh;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.component.StreamBlockTypeComponent;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes35.dex */
public final class StreamBlockTypeComponent implements BaseComponent<EnumC2240771Cn5> {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ StreamBlockTypeComponent[] $VALUES;
    public static final Parcelable.Creator<StreamBlockTypeComponent> CREATOR;
    public static final StreamBlockTypeComponent IMAGE;
    public static final StreamBlockTypeComponent MARKDOWN;
    public static final StreamBlockTypeComponent TEXT;
    public static final StreamBlockTypeComponent UNKNOWN;
    public final int value;

    public static InterfaceC2044707zh<StreamBlockTypeComponent> getEntries() {
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
        StreamBlockTypeComponent streamBlockTypeComponent = new StreamBlockTypeComponent("UNKNOWN", 0, EnumC2240771Cn5.STREAM_BLOCK_TYPE_UNKNOWN.getValue());
        UNKNOWN = streamBlockTypeComponent;
        StreamBlockTypeComponent streamBlockTypeComponent2 = new StreamBlockTypeComponent("TEXT", 1, EnumC2240771Cn5.STREAM_BLOCK_TYPE_TEXT.getValue());
        TEXT = streamBlockTypeComponent2;
        StreamBlockTypeComponent streamBlockTypeComponent3 = new StreamBlockTypeComponent("IMAGE", 2, EnumC2240771Cn5.STREAM_BLOCK_TYPE_IMAGE.getValue());
        IMAGE = streamBlockTypeComponent3;
        StreamBlockTypeComponent streamBlockTypeComponent4 = new StreamBlockTypeComponent("MARKDOWN", 3, EnumC2240771Cn5.STREAM_BLOCK_TYPE_MARKDOWN.getValue());
        MARKDOWN = streamBlockTypeComponent4;
        StreamBlockTypeComponent[] streamBlockTypeComponentArr = {streamBlockTypeComponent, streamBlockTypeComponent2, streamBlockTypeComponent3, streamBlockTypeComponent4};
        $VALUES = streamBlockTypeComponentArr;
        $ENTRIES = new C2254308sP(streamBlockTypeComponentArr);
        CREATOR = new Parcelable.Creator<StreamBlockTypeComponent>() { // from class: X.1Cn6
            @Override // android.os.Parcelable.Creator
            public final StreamBlockTypeComponent createFromParcel(Parcel parcel) {
                return StreamBlockTypeComponent.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final StreamBlockTypeComponent[] newArray(int i) {
                return new StreamBlockTypeComponent[i];
            }
        };
    }

    public static StreamBlockTypeComponent[] values() {
        return (StreamBlockTypeComponent[]) $VALUES.clone();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ss.android.ugc.aweme.im.message.template.component.BaseComponent
    public EnumC2240771Cn5 toProto() {
        return EnumC2240771Cn5.fromValue(this.value);
    }

    public final int getValue() {
        return this.value;
    }

    public static StreamBlockTypeComponent valueOf(String str) {
        return (StreamBlockTypeComponent) C08FF.LIZ(StreamBlockTypeComponent.class, str);
    }

    public StreamBlockTypeComponent(String str, int i, int i2) {
        this.value = i2;
    }
}
