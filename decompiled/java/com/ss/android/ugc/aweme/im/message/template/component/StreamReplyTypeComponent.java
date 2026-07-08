package com.ss.android.ugc.aweme.im.message.template.component;

import X.C08FF;
import X.C2254308sP;
import X.EnumC906790Zhl;
import X.InterfaceC2044707zh;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.component.StreamReplyTypeComponent;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes15.dex */
public final class StreamReplyTypeComponent implements BaseComponent<EnumC906790Zhl> {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ StreamReplyTypeComponent[] $VALUES;
    public static final StreamReplyTypeComponent ANSWER;
    public static final Parcelable.Creator<StreamReplyTypeComponent> CREATOR;
    public static final StreamReplyTypeComponent FUNCTION_CALL;
    public static final StreamReplyTypeComponent SUGGEST;
    public static final StreamReplyTypeComponent THINKING;
    public static final StreamReplyTypeComponent TOOL_OUTPUT;
    public static final StreamReplyTypeComponent UNKNOWN;
    public static final StreamReplyTypeComponent VERBOSE;
    public final int value;

    public static InterfaceC2044707zh<StreamReplyTypeComponent> getEntries() {
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
        StreamReplyTypeComponent streamReplyTypeComponent = new StreamReplyTypeComponent("UNKNOWN", 0, EnumC906790Zhl.STREAM_REPLY_TYPE_UNKNOWN.getValue());
        UNKNOWN = streamReplyTypeComponent;
        StreamReplyTypeComponent streamReplyTypeComponent2 = new StreamReplyTypeComponent("ANSWER", 1, EnumC906790Zhl.STREAM_REPLY_TYPE_ANSWER.getValue());
        ANSWER = streamReplyTypeComponent2;
        StreamReplyTypeComponent streamReplyTypeComponent3 = new StreamReplyTypeComponent("SUGGEST", 2, EnumC906790Zhl.STREAM_REPLY_TYPE_SUGGEST.getValue());
        SUGGEST = streamReplyTypeComponent3;
        StreamReplyTypeComponent streamReplyTypeComponent4 = new StreamReplyTypeComponent("FUNCTION_CALL", 3, EnumC906790Zhl.STREAM_REPLY_TYPE_FUNCTION_CALL.getValue());
        FUNCTION_CALL = streamReplyTypeComponent4;
        StreamReplyTypeComponent streamReplyTypeComponent5 = new StreamReplyTypeComponent("TOOL_OUTPUT", 4, EnumC906790Zhl.STREAM_REPLY_TYPE_TOOL_OUTPUT.getValue());
        TOOL_OUTPUT = streamReplyTypeComponent5;
        StreamReplyTypeComponent streamReplyTypeComponent6 = new StreamReplyTypeComponent("THINKING", 5, EnumC906790Zhl.STREAM_REPLY_TYPE_THINKING.getValue());
        THINKING = streamReplyTypeComponent6;
        StreamReplyTypeComponent streamReplyTypeComponent7 = new StreamReplyTypeComponent("VERBOSE", 6, EnumC906790Zhl.STREAM_REPLY_TYPE_VERBOSE.getValue());
        VERBOSE = streamReplyTypeComponent7;
        StreamReplyTypeComponent[] streamReplyTypeComponentArr = {streamReplyTypeComponent, streamReplyTypeComponent2, streamReplyTypeComponent3, streamReplyTypeComponent4, streamReplyTypeComponent5, streamReplyTypeComponent6, streamReplyTypeComponent7};
        $VALUES = streamReplyTypeComponentArr;
        $ENTRIES = new C2254308sP(streamReplyTypeComponentArr);
        CREATOR = new Parcelable.Creator<StreamReplyTypeComponent>() { // from class: X.0Zhm
            @Override // android.os.Parcelable.Creator
            public final StreamReplyTypeComponent createFromParcel(Parcel parcel) {
                return StreamReplyTypeComponent.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final StreamReplyTypeComponent[] newArray(int i) {
                return new StreamReplyTypeComponent[i];
            }
        };
    }

    public static StreamReplyTypeComponent[] values() {
        return (StreamReplyTypeComponent[]) $VALUES.clone();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ss.android.ugc.aweme.im.message.template.component.BaseComponent
    public EnumC906790Zhl toProto() {
        return EnumC906790Zhl.fromValue(this.value);
    }

    public final int getValue() {
        return this.value;
    }

    public static StreamReplyTypeComponent valueOf(String str) {
        return (StreamReplyTypeComponent) C08FF.LIZ(StreamReplyTypeComponent.class, str);
    }

    public StreamReplyTypeComponent(String str, int i, int i2) {
        this.value = i2;
    }
}
