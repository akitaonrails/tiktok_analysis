package com.ss.android.websocket.internal.proto;

import X.C1516540pZE;
import X.C1518240pby;
import X.C1518250pbz;
import X.C1554390qYH;
import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.ss.android.websocket.internal.proto.Frame;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: loaded from: classes24.dex */
public final class Frame extends Message<Frame, C1518240pby> implements Parcelable {
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.ss.android.websocket.internal.proto.Frame$ExtendedEntry#ADAPTER", label = WireField.Label.REPEATED, tag = 5)
    public final List<C1518250pbz> headers;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT64", label = WireField.Label.REQUIRED, tag = 2)
    public final Long logid;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.REQUIRED, tag = 4)
    public final Integer method;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", tag = 8)
    public final ByteString payload;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 6)
    public final String payload_encoding;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 7)
    public final String payload_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT64", label = WireField.Label.REQUIRED, tag = 1)
    public final Long seqid;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.REQUIRED, tag = 3)
    public final Integer service;
    public static final ProtoAdapter<Frame> ADAPTER = new ProtoAdapter<Frame>() { // from class: X.0pbx
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final Frame decode(ProtoReader protoReader) {
            C1518240pby c1518240pby = new C1518240pby();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c1518240pby.LIZLLL = ProtoAdapter.UINT64.decode(protoReader);
                            break;
                        case 2:
                            c1518240pby.LJ = ProtoAdapter.UINT64.decode(protoReader);
                            break;
                        case 3:
                            c1518240pby.LJFF = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            c1518240pby.LJI = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 5:
                            c1518240pby.LJII.add(C1518250pbz.ADAPTER.decode(protoReader));
                            break;
                        case 6:
                            c1518240pby.LJIIIIZZ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            c1518240pby.LJIIIZ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            c1518240pby.LJIIJ = ProtoAdapter.BYTES.decode(protoReader);
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1518240pby.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1518240pby.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(Frame frame) {
            Frame frame2 = frame;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.UINT64;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, frame2.seqid) + protoAdapter.encodedSizeWithTag(2, frame2.logid);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(3, frame2.service) + protoAdapter2.encodedSizeWithTag(4, frame2.method) + C1518250pbz.ADAPTER.asRepeated().encodedSizeWithTag(5, frame2.headers);
            ProtoAdapter<String> protoAdapter3 = ProtoAdapter.STRING;
            return iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(6, frame2.payload_encoding) + protoAdapter3.encodedSizeWithTag(7, frame2.payload_type) + ProtoAdapter.BYTES.encodedSizeWithTag(8, frame2.payload) + frame2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final Frame redact(Frame frame) {
            C1518240pby c1518240pbyNewBuilder = frame.newBuilder();
            C1516540pZE.LJIIIZ(c1518240pbyNewBuilder.LJII, C1518250pbz.ADAPTER);
            c1518240pbyNewBuilder.clearUnknownFields();
            return c1518240pbyNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, Frame frame) {
            Frame frame2 = frame;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.UINT64;
            protoAdapter.encodeWithTag(protoWriter, 1, frame2.seqid);
            protoAdapter.encodeWithTag(protoWriter, 2, frame2.logid);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            protoAdapter2.encodeWithTag(protoWriter, 3, frame2.service);
            protoAdapter2.encodeWithTag(protoWriter, 4, frame2.method);
            C1518250pbz.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, frame2.headers);
            ProtoAdapter<String> protoAdapter3 = ProtoAdapter.STRING;
            protoAdapter3.encodeWithTag(protoWriter, 6, frame2.payload_encoding);
            protoAdapter3.encodeWithTag(protoWriter, 7, frame2.payload_type);
            ProtoAdapter.BYTES.encodeWithTag(protoWriter, 8, frame2.payload);
            protoWriter.writeBytes(frame2.unknownFields());
        }
    };
    public static final Long DEFAULT_SEQID = 0L;
    public static final Long DEFAULT_LOGID = 0L;
    public static final Integer DEFAULT_SERVICE = 0;
    public static final Integer DEFAULT_METHOD = 0;
    public static final ByteString DEFAULT_PAYLOAD = ByteString.EMPTY;
    public static final Parcelable.Creator<Frame> CREATOR = new C1554390qYH(4);

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getMethod() {
        return this.method.intValue();
    }

    public Map<String, String> getMsgHeaders() {
        List<C1518250pbz> list = this.headers;
        if (list == null || list.isEmpty()) {
            return null;
        }
        HashMap map = new HashMap();
        for (C1518250pbz c1518250pbz : this.headers) {
            if (c1518250pbz != null) {
                map.put(c1518250pbz.key, c1518250pbz.value);
            }
        }
        return map;
    }

    public byte[] getPayload() {
        ByteString byteString = this.payload;
        if (byteString == null) {
            return null;
        }
        return byteString.toByteArray();
    }

    public long getSeqId() {
        return this.seqid.longValue();
    }

    public int getService() {
        return this.service.intValue();
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((unknownFields().hashCode() * 37) + this.seqid.hashCode()) * 37) + this.logid.hashCode()) * 37) + this.service.hashCode()) * 37) + this.method.hashCode()) * 37) + this.headers.hashCode()) * 37;
        String str = this.payload_encoding;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.payload_type;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        ByteString byteString = this.payload;
        int iHashCode4 = iHashCode3 + (byteString != null ? byteString.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public C1518240pby newBuilder() {
        C1518240pby c1518240pby = new C1518240pby();
        c1518240pby.LIZLLL = this.seqid;
        c1518240pby.LJ = this.logid;
        c1518240pby.LJFF = this.service;
        c1518240pby.LJI = this.method;
        c1518240pby.LJII = C1516540pZE.LIZJ("headers", this.headers);
        c1518240pby.LJIIIIZZ = this.payload_encoding;
        c1518240pby.LJIIIZ = this.payload_type;
        c1518240pby.LJIIJ = this.payload;
        c1518240pby.addUnknownFields(unknownFields());
        return c1518240pby;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", seqid=");
        sb.append(this.seqid);
        sb.append(", logid=");
        sb.append(this.logid);
        sb.append(", service=");
        sb.append(this.service);
        sb.append(", method=");
        sb.append(this.method);
        if (!this.headers.isEmpty()) {
            sb.append(", headers=");
            sb.append(this.headers);
        }
        if (this.payload_encoding != null) {
            sb.append(", payload_encoding=");
            sb.append(this.payload_encoding);
        }
        if (this.payload_type != null) {
            sb.append(", payload_type=");
            sb.append(this.payload_type);
        }
        if (this.payload != null) {
            sb.append(", payload=");
            sb.append(this.payload);
        }
        sb.replace(0, 2, "Frame{");
        sb.append('}');
        return sb.toString();
    }

    public String getPayloadEncoding() {
        return this.payload_encoding;
    }

    public String getPayloadType() {
        return this.payload_type;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Frame)) {
            return false;
        }
        Frame frame = (Frame) obj;
        if (unknownFields().equals(frame.unknownFields()) && this.seqid.equals(frame.seqid) && this.logid.equals(frame.logid) && this.service.equals(frame.service) && this.method.equals(frame.method) && this.headers.equals(frame.headers) && C1516540pZE.LJ(this.payload_encoding, frame.payload_encoding) && C1516540pZE.LJ(this.payload_type, frame.payload_type) && C1516540pZE.LJ(this.payload, frame.payload)) {
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(ADAPTER.encode(this));
    }

    public Frame(Long l, Long l2, Integer num, Integer num2, List<C1518250pbz> list, String str, String str2, ByteString byteString) {
        this(l, l2, num, num2, list, str, str2, byteString, ByteString.EMPTY);
    }

    public Frame(Long l, Long l2, Integer num, Integer num2, List<C1518250pbz> list, String str, String str2, ByteString byteString, ByteString byteString2) {
        super(ADAPTER, byteString2);
        this.seqid = l;
        this.logid = l2;
        this.service = num;
        this.method = num2;
        this.headers = C1516540pZE.LJFF("headers", list);
        this.payload_encoding = str;
        this.payload_type = str2;
        this.payload = byteString;
    }
}
