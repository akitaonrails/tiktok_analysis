package com.bytedance.im.core.proto;

import X.C09CT;
import X.C1516540pZE;
import X.C1DBO;
import X.EnumC19362610p6;
import X.EnumC869400Y8s;
import com.bytedance.im.core.proto.GetTicketRequestBody;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: loaded from: classes36.dex */
public final class GetTicketRequestBody extends Message<GetTicketRequestBody, C1DBO> {
    public static final long serialVersionUID = 0;

    @C09CT("conversation_short_id")
    public final Long conversation_short_id;

    @C09CT("conversation_type")
    public final EnumC869400Y8s conversation_type;

    @C09CT("customed_conversation_type")
    public final Integer customed_conversation_type;

    @C09CT("ext")
    public final Map<String, String> ext;

    @C09CT("ticket_type")
    public final EnumC19362610p6 ticket_type;

    @C09CT("to_id")
    public final Long to_id;
    public static final ProtoAdapter<GetTicketRequestBody> ADAPTER = new ProtoAdapter<GetTicketRequestBody>() { // from class: X.1DBN
        public final ProtoAdapter<Map<String, String>> LIZ;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.LIZ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final GetTicketRequestBody decode(ProtoReader protoReader) {
            C1DBO c1dbo = new C1DBO();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 4) {
                                if (iNextTag != 5) {
                                    if (iNextTag != 6) {
                                        if (iNextTag != 10) {
                                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                            c1dbo.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                        } else {
                                            c1dbo.LJII.putAll(this.LIZ.decode(protoReader));
                                        }
                                    } else {
                                        c1dbo.LJIIIIZZ = ProtoAdapter.INT32.decode(protoReader);
                                    }
                                } else {
                                    c1dbo.LJI = ProtoAdapter.INT64.decode(protoReader);
                                }
                            } else {
                                c1dbo.LJFF = ProtoAdapter.INT64.decode(protoReader);
                            }
                        } else {
                            try {
                                c1dbo.LJ = EnumC869400Y8s.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c1dbo.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        }
                    } else {
                        try {
                            c1dbo.LIZLLL = EnumC19362610p6.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                            TryCatchGuardChecker.doCheck(e2);
                            c1dbo.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        }
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1dbo.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(GetTicketRequestBody getTicketRequestBody) {
            GetTicketRequestBody getTicketRequestBody2 = getTicketRequestBody;
            int iEncodedSizeWithTag = EnumC19362610p6.ADAPTER.encodedSizeWithTag(1, getTicketRequestBody2.ticket_type) + EnumC869400Y8s.ADAPTER.encodedSizeWithTag(2, getTicketRequestBody2.conversation_type);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(4, getTicketRequestBody2.to_id) + protoAdapter.encodedSizeWithTag(5, getTicketRequestBody2.conversation_short_id) + this.LIZ.encodedSizeWithTag(10, getTicketRequestBody2.ext) + ProtoAdapter.INT32.encodedSizeWithTag(6, getTicketRequestBody2.customed_conversation_type) + getTicketRequestBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, GetTicketRequestBody getTicketRequestBody) {
            GetTicketRequestBody getTicketRequestBody2 = getTicketRequestBody;
            EnumC19362610p6.ADAPTER.encodeWithTag(protoWriter, 1, getTicketRequestBody2.ticket_type);
            EnumC869400Y8s.ADAPTER.encodeWithTag(protoWriter, 2, getTicketRequestBody2.conversation_type);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 4, getTicketRequestBody2.to_id);
            protoAdapter.encodeWithTag(protoWriter, 5, getTicketRequestBody2.conversation_short_id);
            this.LIZ.encodeWithTag(protoWriter, 10, getTicketRequestBody2.ext);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, getTicketRequestBody2.customed_conversation_type);
            protoWriter.writeBytes(getTicketRequestBody2.unknownFields());
        }
    };
    public static final EnumC19362610p6 DEFAULT_TICKET_TYPE = EnumC19362610p6.TICKET_TYPE_APP;
    public static final EnumC869400Y8s DEFAULT_CONVERSATION_TYPE = EnumC869400Y8s.UNKNOWN_CONV_TYPE;
    public static final Long DEFAULT_TO_ID = 0L;
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Integer DEFAULT_CUSTOMED_CONVERSATION_TYPE = 0;

    @Override // com.squareup.wire.Message
    public C1DBO newBuilder() {
        C1DBO c1dbo = new C1DBO();
        c1dbo.LIZLLL = this.ticket_type;
        c1dbo.LJ = this.conversation_type;
        c1dbo.LJFF = this.to_id;
        c1dbo.LJI = this.conversation_short_id;
        c1dbo.LJII = C1516540pZE.LIZLLL("ext", this.ext);
        c1dbo.LJIIIIZZ = this.customed_conversation_type;
        c1dbo.addUnknownFields(unknownFields());
        return c1dbo;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.ticket_type != null) {
            sb.append(", ticket_type=");
            sb.append(this.ticket_type);
        }
        if (this.conversation_type != null) {
            sb.append(", conversation_type=");
            sb.append(this.conversation_type);
        }
        if (this.to_id != null) {
            sb.append(", to_id=");
            sb.append(this.to_id);
        }
        if (this.conversation_short_id != null) {
            sb.append(", conversation_short_id=");
            sb.append(this.conversation_short_id);
        }
        Map<String, String> map = this.ext;
        if (map != null && !map.isEmpty()) {
            sb.append(", ext=");
            sb.append(this.ext);
        }
        if (this.customed_conversation_type != null) {
            sb.append(", customed_conversation_type=");
            sb.append(this.customed_conversation_type);
        }
        sb.replace(0, 2, "GetTicketRequestBody{");
        sb.append('}');
        return sb.toString();
    }

    public GetTicketRequestBody(EnumC19362610p6 enumC19362610p6, EnumC869400Y8s enumC869400Y8s, Long l, Long l2, Map<String, String> map, Integer num) {
        this(enumC19362610p6, enumC869400Y8s, l, l2, map, num, ByteString.EMPTY);
    }

    public GetTicketRequestBody(EnumC19362610p6 enumC19362610p6, EnumC869400Y8s enumC869400Y8s, Long l, Long l2, Map<String, String> map, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.ticket_type = enumC19362610p6;
        this.conversation_type = enumC869400Y8s;
        this.to_id = l;
        this.conversation_short_id = l2;
        this.ext = C1516540pZE.LJI("ext", map);
        this.customed_conversation_type = num;
    }
}
