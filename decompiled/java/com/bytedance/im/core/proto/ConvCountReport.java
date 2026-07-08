package com.bytedance.im.core.proto;

import X.C09CT;
import X.C1DBM;
import X.EnumC869400Y8s;
import com.bytedance.im.core.proto.ConvCountReport;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: loaded from: classes36.dex */
public final class ConvCountReport extends Message<ConvCountReport, C1DBM> {
    public static final long serialVersionUID = 0;

    @C09CT("conv_short_id")
    public final Long conv_short_id;

    @C09CT("conversation_type")
    public final EnumC869400Y8s conversation_type;

    @C09CT("customed_conversation_type")
    public final Integer customed_conversation_type;

    @C09CT("unread_count")
    public final Long unread_count;
    public static final ProtoAdapter<ConvCountReport> ADAPTER = new ProtoAdapter<ConvCountReport>() { // from class: X.1DBL
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final ConvCountReport decode(ProtoReader protoReader) {
            C1DBM c1dbm = new C1DBM();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                    c1dbm.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                } else {
                                    c1dbm.LJI = ProtoAdapter.INT32.decode(protoReader);
                                }
                            } else {
                                try {
                                    c1dbm.LJFF = EnumC869400Y8s.ADAPTER.decode(protoReader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    c1dbm.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                }
                            }
                        } else {
                            c1dbm.LJ = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c1dbm.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1dbm.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(ConvCountReport convCountReport) {
            ConvCountReport convCountReport2 = convCountReport;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return protoAdapter.encodedSizeWithTag(1, convCountReport2.conv_short_id) + protoAdapter.encodedSizeWithTag(2, convCountReport2.unread_count) + EnumC869400Y8s.ADAPTER.encodedSizeWithTag(3, convCountReport2.conversation_type) + ProtoAdapter.INT32.encodedSizeWithTag(4, convCountReport2.customed_conversation_type) + convCountReport2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, ConvCountReport convCountReport) {
            ConvCountReport convCountReport2 = convCountReport;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, convCountReport2.conv_short_id);
            protoAdapter.encodeWithTag(protoWriter, 2, convCountReport2.unread_count);
            EnumC869400Y8s.ADAPTER.encodeWithTag(protoWriter, 3, convCountReport2.conversation_type);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, convCountReport2.customed_conversation_type);
            protoWriter.writeBytes(convCountReport2.unknownFields());
        }
    };
    public static final Long DEFAULT_CONV_SHORT_ID = 0L;
    public static final Long DEFAULT_UNREAD_COUNT = 0L;
    public static final EnumC869400Y8s DEFAULT_CONVERSATION_TYPE = EnumC869400Y8s.UNKNOWN_CONV_TYPE;
    public static final Integer DEFAULT_CUSTOMED_CONVERSATION_TYPE = 0;

    @Override // com.squareup.wire.Message
    public C1DBM newBuilder() {
        C1DBM c1dbm = new C1DBM();
        c1dbm.LIZLLL = this.conv_short_id;
        c1dbm.LJ = this.unread_count;
        c1dbm.LJFF = this.conversation_type;
        c1dbm.LJI = this.customed_conversation_type;
        c1dbm.addUnknownFields(unknownFields());
        return c1dbm;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.conv_short_id != null) {
            sb.append(", conv_short_id=");
            sb.append(this.conv_short_id);
        }
        if (this.unread_count != null) {
            sb.append(", unread_count=");
            sb.append(this.unread_count);
        }
        if (this.conversation_type != null) {
            sb.append(", conversation_type=");
            sb.append(this.conversation_type);
        }
        if (this.customed_conversation_type != null) {
            sb.append(", customed_conversation_type=");
            sb.append(this.customed_conversation_type);
        }
        sb.replace(0, 2, "ConvCountReport{");
        sb.append('}');
        return sb.toString();
    }

    public ConvCountReport(Long l, Long l2, EnumC869400Y8s enumC869400Y8s, Integer num) {
        this(l, l2, enumC869400Y8s, num, ByteString.EMPTY);
    }

    public ConvCountReport(Long l, Long l2, EnumC869400Y8s enumC869400Y8s, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conv_short_id = l;
        this.unread_count = l2;
        this.conversation_type = enumC869400Y8s;
        this.customed_conversation_type = num;
    }
}
