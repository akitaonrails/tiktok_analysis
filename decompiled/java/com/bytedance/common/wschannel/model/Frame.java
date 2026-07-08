package com.bytedance.common.wschannel.model;

import X.C1516540pZE;
import X.C1516550pZF;
import X.C1516580pZI;
import com.bytedance.common.wschannel.model.Frame;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes24.dex */
public final class Frame extends Message<Frame, C1516550pZF> {
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.bytedance.article.wschannel.model.Frame$ExtendedEntry#ADAPTER", label = WireField.Label.REPEATED, tag = 5)
    public final List<C1516580pZI> headers;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT64", label = WireField.Label.REQUIRED, tag = 2)
    public final Long logid;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = BdTuring.TYPE_ECAF)
    public final String logidnew;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.REQUIRED, tag = 4)
    public final Integer method;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = BdTuring.TYPE_EMAIL)
    public final String msgId;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", tag = 8)
    public final ByteString payload;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 6)
    public final String payload_encoding;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 7)
    public final String payload_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT64", label = WireField.Label.REQUIRED, tag = 1)
    public final Long seqid;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = HorizontalCarouselRecentEffectsLimitAB.LIMIT_10)
    public final String serverTiming;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.REQUIRED, tag = 3)
    public final Integer service;
    public static final ProtoAdapter<Frame> ADAPTER = new ProtoAdapter<Frame>() { // from class: X.0pZH
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final Frame decode(ProtoReader protoReader) {
            C1516550pZF c1516550pZF = new C1516550pZF();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c1516550pZF.LIZLLL = ProtoAdapter.UINT64.decode(protoReader);
                            break;
                        case 2:
                            c1516550pZF.LJ = ProtoAdapter.UINT64.decode(protoReader);
                            break;
                        case 3:
                            c1516550pZF.LJFF = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            c1516550pZF.LJI = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 5:
                            c1516550pZF.LJII.add(C1516580pZI.ADAPTER.decode(protoReader));
                            break;
                        case 6:
                            c1516550pZF.LJIIIIZZ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            c1516550pZF.LJIIIZ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            c1516550pZF.LJIIJ = ProtoAdapter.BYTES.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c1516550pZF.LJIIJJI = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c1516550pZF.LJIIL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c1516550pZF.LJIILIIL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1516550pZF.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1516550pZF.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(Frame frame) {
            int iEncodedSizeWithTag;
            int iEncodedSizeWithTag2;
            int iEncodedSizeWithTag3;
            int iEncodedSizeWithTag4;
            int iEncodedSizeWithTag5;
            Frame frame2 = frame;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.UINT64;
            int iEncodedSizeWithTag6 = protoAdapter.encodedSizeWithTag(1, frame2.seqid) + protoAdapter.encodedSizeWithTag(2, frame2.logid);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            int iEncodedSizeWithTag7 = iEncodedSizeWithTag6 + protoAdapter2.encodedSizeWithTag(3, frame2.service) + protoAdapter2.encodedSizeWithTag(4, frame2.method) + C1516580pZI.ADAPTER.asRepeated().encodedSizeWithTag(5, frame2.headers);
            String str = frame2.payload_encoding;
            int iEncodedSizeWithTag8 = 0;
            if (str != null) {
                iEncodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(6, str);
            } else {
                iEncodedSizeWithTag = 0;
            }
            int i = iEncodedSizeWithTag7 + iEncodedSizeWithTag;
            String str2 = frame2.payload_type;
            if (str2 != null) {
                iEncodedSizeWithTag2 = ProtoAdapter.STRING.encodedSizeWithTag(7, str2);
            } else {
                iEncodedSizeWithTag2 = 0;
            }
            int i2 = i + iEncodedSizeWithTag2;
            ByteString byteString = frame2.payload;
            if (byteString != null) {
                iEncodedSizeWithTag3 = ProtoAdapter.BYTES.encodedSizeWithTag(8, byteString);
            } else {
                iEncodedSizeWithTag3 = 0;
            }
            int i3 = i2 + iEncodedSizeWithTag3;
            String str3 = frame2.logidnew;
            if (str3 != null) {
                iEncodedSizeWithTag4 = ProtoAdapter.STRING.encodedSizeWithTag(9, str3);
            } else {
                iEncodedSizeWithTag4 = 0;
            }
            int i4 = i3 + iEncodedSizeWithTag4;
            String str4 = frame2.serverTiming;
            if (str4 != null) {
                iEncodedSizeWithTag5 = ProtoAdapter.STRING.encodedSizeWithTag(10, str4);
            } else {
                iEncodedSizeWithTag5 = 0;
            }
            int i5 = i4 + iEncodedSizeWithTag5;
            String str5 = frame2.msgId;
            if (str5 != null) {
                iEncodedSizeWithTag8 = ProtoAdapter.STRING.encodedSizeWithTag(11, str5);
            }
            return i5 + iEncodedSizeWithTag8 + frame2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final Frame redact(Frame frame) {
            C1516550pZF c1516550pZFNewBuilder = frame.newBuilder();
            C1516540pZE.LJIIIZ(c1516550pZFNewBuilder.LJII, C1516580pZI.ADAPTER);
            c1516550pZFNewBuilder.clearUnknownFields();
            return c1516550pZFNewBuilder.build();
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
            if (frame2.headers != null) {
                C1516580pZI.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, frame2.headers);
            }
            String str = frame2.payload_encoding;
            if (str != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, str);
            }
            String str2 = frame2.payload_type;
            if (str2 != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, str2);
            }
            ByteString byteString = frame2.payload;
            if (byteString != null) {
                ProtoAdapter.BYTES.encodeWithTag(protoWriter, 8, byteString);
            }
            String str3 = frame2.logidnew;
            if (str3 != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, str3);
            }
            String str4 = frame2.serverTiming;
            if (str4 != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 10, str4);
            }
            String str5 = frame2.msgId;
            if (str5 != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 11, str5);
            }
            protoWriter.writeBytes(frame2.unknownFields());
        }
    };
    public static final Long DEFAULT_SEQID = 0L;
    public static final Long DEFAULT_LOGID = 0L;
    public static final Integer DEFAULT_SERVICE = 0;
    public static final Integer DEFAULT_METHOD = 0;
    public static final ByteString DEFAULT_PAYLOAD = ByteString.EMPTY;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Long l = this.seqid;
        int iHashCode2 = (iHashCode + (l != null ? l.hashCode() : 0)) * 37;
        Long l2 = this.logid;
        int iHashCode3 = (iHashCode2 + (l2 != null ? l2.hashCode() : 0)) * 37;
        Integer num = this.service;
        int iHashCode4 = (iHashCode3 + (num != null ? num.hashCode() : 0)) * 37;
        Integer num2 = this.method;
        int iHashCode5 = (iHashCode4 + (num2 != null ? num2.hashCode() : 0)) * 37;
        List<C1516580pZI> list = this.headers;
        int iHashCode6 = (iHashCode5 + (list != null ? list.hashCode() : 1)) * 37;
        String str = this.payload_encoding;
        int iHashCode7 = (iHashCode6 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.payload_type;
        int iHashCode8 = (iHashCode7 + (str2 != null ? str2.hashCode() : 0)) * 37;
        ByteString byteString = this.payload;
        int iHashCode9 = (iHashCode8 + (byteString != null ? byteString.hashCode() : 0)) * 37;
        String str3 = this.logidnew;
        int iHashCode10 = (iHashCode9 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.serverTiming;
        int iHashCode11 = (iHashCode10 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.msgId;
        int iHashCode12 = iHashCode11 + (str5 != null ? str5.hashCode() : 0);
        this.hashCode = iHashCode12;
        return iHashCode12;
    }

    @Override // com.squareup.wire.Message
    public C1516550pZF newBuilder() {
        C1516550pZF c1516550pZF = new C1516550pZF();
        c1516550pZF.LIZLLL = this.seqid;
        c1516550pZF.LJ = this.logid;
        c1516550pZF.LJFF = this.service;
        c1516550pZF.LJI = this.method;
        c1516550pZF.LJII = C1516540pZE.LIZJ("headers", this.headers);
        c1516550pZF.LJIIIIZZ = this.payload_encoding;
        c1516550pZF.LJIIIZ = this.payload_type;
        c1516550pZF.LJIIJ = this.payload;
        c1516550pZF.LJIIJJI = this.logidnew;
        c1516550pZF.LJIIL = this.serverTiming;
        c1516550pZF.LJIILIIL = this.msgId;
        c1516550pZF.addUnknownFields(unknownFields());
        return c1516550pZF;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.seqid != null) {
            sb.append(", seqid=");
            sb.append(this.seqid);
        }
        if (this.logid != null) {
            sb.append(", logid=");
            sb.append(this.logid);
        }
        if (this.service != null) {
            sb.append(", service=");
            sb.append(this.service);
        }
        if (this.method != null) {
            sb.append(", method=");
            sb.append(this.method);
        }
        if (this.headers != null) {
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
        if (this.logidnew != null) {
            sb.append(", logidnew=");
            sb.append(this.logidnew);
        }
        if (this.serverTiming != null) {
            sb.append(", serverTiming=");
            sb.append(this.serverTiming);
        }
        if (this.msgId != null) {
            sb.append(", msgId=");
            sb.append(this.msgId);
        }
        sb.replace(0, 2, "Frame{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Frame)) {
            return false;
        }
        Frame frame = (Frame) obj;
        if (C1516540pZE.LJ(unknownFields(), frame.unknownFields()) && C1516540pZE.LJ(this.seqid, frame.seqid) && C1516540pZE.LJ(this.logid, frame.logid) && C1516540pZE.LJ(this.service, frame.service) && C1516540pZE.LJ(this.method, frame.method) && C1516540pZE.LJ(this.headers, frame.headers) && C1516540pZE.LJ(this.payload_encoding, frame.payload_encoding) && C1516540pZE.LJ(this.payload_type, frame.payload_type) && C1516540pZE.LJ(this.payload, frame.payload) && C1516540pZE.LJ(this.logidnew, frame.logidnew) && C1516540pZE.LJ(this.serverTiming, frame.serverTiming) && C1516540pZE.LJ(this.msgId, frame.msgId)) {
            return true;
        }
        return false;
    }

    public Frame(Long l, Long l2, Integer num, Integer num2, List<C1516580pZI> list, String str, String str2, ByteString byteString, String str3, String str4, String str5) {
        this(l, l2, num, num2, list, str, str2, byteString, str3, str4, str5, ByteString.EMPTY);
    }

    public Frame(Long l, Long l2, Integer num, Integer num2, List<C1516580pZI> list, String str, String str2, ByteString byteString, String str3, String str4, String str5, ByteString byteString2) {
        super(ADAPTER, byteString2);
        this.seqid = l;
        this.logid = l2;
        this.service = num;
        this.method = num2;
        this.headers = C1516540pZE.LJFF("headers", list);
        this.payload_encoding = str;
        this.payload_type = str2;
        this.payload = byteString;
        this.logidnew = str3;
        this.serverTiming = str4;
        this.msgId = str5;
    }
}
