package com.bytedance.common.wschannel.model;

import X.C0WKQ;
import X.C2103808Ma;
import X.C2188811AlT;
import X.C854630Xfp;
import android.content.ComponentName;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public class WsChannelMsg implements Parcelable {
    public static final Parcelable.Creator<WsChannelMsg> CREATOR = new Parcelable.Creator<WsChannelMsg>() { // from class: X.0WKR
        @Override // android.os.Parcelable.Creator
        public final WsChannelMsg createFromParcel(Parcel parcel) {
            return new WsChannelMsg(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final WsChannelMsg[] newArray(int i) {
            return new WsChannelMsg[i];
        }
    };
    public static WsChannelMsg EMPTY = new WsChannelMsg();
    public int channelId;
    public boolean isAckMsg;
    public long logId;
    public String logInfo;
    public int method;
    public List<MsgHeader> msgHeaders;
    public String msgId;
    public NewMsgTimeHolder newMsgTimeHolder;
    public byte[] payload;
    public String payloadEncoding;
    public String payloadType;
    public transient long receiveDataFromIpcTs;
    public ComponentName replayToComponentName;
    public long seqId;
    public String serverTiming;
    public int service;
    public C0WKQ state;
    public String uuid;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public static class MsgHeader implements Parcelable {
        public static final Parcelable.Creator<MsgHeader> CREATOR = new C854630Xfp(10);
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

    public final Map<String, String> LIZIZ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("seqId", String.valueOf(this.seqId));
        linkedHashMap.put("logId", String.valueOf(this.logId));
        linkedHashMap.put("service", String.valueOf(this.service));
        linkedHashMap.put("method", String.valueOf(this.method));
        linkedHashMap.put("payloadEncoding", this.payloadEncoding);
        linkedHashMap.put("payloadType", this.payloadType);
        try {
            linkedHashMap.put("payload_md5", C2103808Ma.LIZ(MessageDigest.getInstance("MD5").digest(this.payload)));
        } catch (NoSuchAlgorithmException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        linkedHashMap.put("channelId", String.valueOf(this.channelId));
        for (MsgHeader msgHeader : this.msgHeaders) {
            linkedHashMap.put(msgHeader.key, msgHeader.value);
        }
        return linkedHashMap;
    }

    public WsChannelMsg() {
        this.state = C0WKQ.Default;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WsChannelMsg{, channelId = ");
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

    public WsChannelMsg(Parcel parcel) {
        boolean z;
        this.state = C0WKQ.Default;
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
        this.uuid = parcel.readString();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.isAckMsg = z;
        this.state = C0WKQ.valueOf(parcel.readInt());
        this.newMsgTimeHolder = (NewMsgTimeHolder) parcel.readParcelable(NewMsgTimeHolder.class.getClassLoader());
        this.logInfo = parcel.readString();
        this.serverTiming = parcel.readString();
        this.msgId = parcel.readString();
    }

    public WsChannelMsg(WsChannelMsg wsChannelMsg) {
        this.state = C0WKQ.Default;
        this.seqId = wsChannelMsg.seqId;
        this.logId = wsChannelMsg.logId;
        this.service = wsChannelMsg.service;
        this.method = wsChannelMsg.method;
        this.msgHeaders = wsChannelMsg.msgHeaders;
        this.payload = wsChannelMsg.LIZ();
        this.payloadEncoding = wsChannelMsg.payloadEncoding;
        this.payloadType = wsChannelMsg.payloadType;
        this.channelId = wsChannelMsg.channelId;
        this.replayToComponentName = wsChannelMsg.replayToComponentName;
        this.newMsgTimeHolder = wsChannelMsg.newMsgTimeHolder;
        this.isAckMsg = wsChannelMsg.isAckMsg;
        this.uuid = wsChannelMsg.uuid;
        this.state = wsChannelMsg.state;
        this.logInfo = wsChannelMsg.logInfo;
        this.serverTiming = wsChannelMsg.serverTiming;
        this.msgId = wsChannelMsg.msgId;
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
        parcel.writeString(this.uuid);
        parcel.writeByte(this.isAckMsg ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.state.getTypeValue());
        parcel.writeParcelable(this.newMsgTimeHolder, i);
        parcel.writeString(this.logInfo);
        parcel.writeString(this.serverTiming);
        parcel.writeString(this.msgId);
    }

    public WsChannelMsg(int i, long j, long j2, int i2, int i3, List<MsgHeader> list, String str, String str2, byte[] bArr, ComponentName componentName) {
        this.state = C0WKQ.Default;
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
