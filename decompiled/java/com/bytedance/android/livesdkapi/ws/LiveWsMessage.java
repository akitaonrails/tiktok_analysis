package com.bytedance.android.livesdkapi.ws;

import X.C1554390qYH;
import X.C2188811AlT;
import android.content.ComponentName;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes24.dex */
public class LiveWsMessage implements Parcelable {
    public static final Parcelable.Creator<LiveWsMessage> CREATOR = new C1554390qYH(1);
    public static LiveWsMessage EMPTY = new LiveWsMessage();
    public int channelId;
    public long logId;
    public int method;
    public List<MsgHeader> msgHeaders;
    public byte[] payload;
    public String payloadEncoding;
    public String payloadType;
    public ComponentName replayToComponentName;
    public long seqId;
    public int service;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public static class MsgHeader implements Parcelable {
        public static final Parcelable.Creator<MsgHeader> CREATOR = new C1554390qYH(0);
        public String key;
        public String value;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("MsgHeader{key='");
            sbLIZ.append(this.key);
            sbLIZ.append('\'');
            sbLIZ.append(", value='");
            sbLIZ.append(this.value);
            sbLIZ.append('\'');
            sbLIZ.append('}');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.key);
            parcel.writeString(this.value);
        }
    }

    public final byte[] LIZ() {
        if (this.payload == null) {
            this.payload = new byte[1];
        }
        return this.payload;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveWsMessage{, channelId = ");
        sbLIZ.append(this.channelId);
        sbLIZ.append(", logId=");
        sbLIZ.append(this.logId);
        sbLIZ.append(", service=");
        sbLIZ.append(this.service);
        sbLIZ.append(", method=");
        sbLIZ.append(this.method);
        sbLIZ.append(", msgHeaders=");
        sbLIZ.append(this.msgHeaders);
        sbLIZ.append(", payloadEncoding='");
        sbLIZ.append(this.payloadEncoding);
        sbLIZ.append('\'');
        sbLIZ.append(", payloadType='");
        sbLIZ.append(this.payloadType);
        sbLIZ.append('\'');
        sbLIZ.append(", payload=");
        sbLIZ.append(Arrays.toString(this.payload));
        sbLIZ.append(", replayToComponentName=");
        sbLIZ.append(this.replayToComponentName);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public LiveWsMessage() {
    }

    public LiveWsMessage(Parcel parcel) {
        this.seqId = parcel.readLong();
        this.logId = parcel.readLong();
        this.service = parcel.readInt();
        this.method = parcel.readInt();
        this.msgHeaders = parcel.createTypedArrayList(MsgHeader.CREATOR);
        this.payloadEncoding = parcel.readString();
        this.payloadType = parcel.readString();
        this.payload = parcel.createByteArray();
        this.replayToComponentName = (ComponentName) parcel.readParcelable(ComponentName.class.getClassLoader());
        this.channelId = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.seqId);
        parcel.writeLong(this.logId);
        parcel.writeInt(this.service);
        parcel.writeInt(this.method);
        parcel.writeTypedList(this.msgHeaders);
        parcel.writeString(this.payloadEncoding);
        parcel.writeString(this.payloadType);
        parcel.writeByteArray(this.payload);
        parcel.writeParcelable(this.replayToComponentName, i);
        parcel.writeInt(this.channelId);
    }

    public LiveWsMessage(int i, long j, long j2, int i2, int i3, List<MsgHeader> list, String str, String str2, byte[] bArr, ComponentName componentName) {
        this.channelId = i;
        this.seqId = j;
        this.logId = j2;
        this.service = i2;
        this.method = i3;
        this.msgHeaders = list;
        this.payloadEncoding = str;
        this.payloadType = str2;
        this.payload = bArr;
        this.replayToComponentName = componentName;
    }
}
