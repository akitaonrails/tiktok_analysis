package com.bytedance.im.core.proto;

import X.C09CT;
import X.C1516540pZE;
import X.C1COC;
import X.EnumC19362810p8;
import com.bytedance.im.core.proto.SendUserActionRequestBody;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class SendUserActionRequestBody extends Message<SendUserActionRequestBody, C1COC> {
    public static final long serialVersionUID = 0;

    @C09CT("action_type")
    public final EnumC19362810p8 action_type;

    @C09CT("conversation_id")
    public final String conversation_id;

    @C09CT("conversation_short_id")
    public final Long conversation_short_id;

    @C09CT("conversation_type")
    public final Integer conversation_type;

    @C09CT("extra")
    public final Map<String, String> extra;
    public static final ProtoAdapter<SendUserActionRequestBody> ADAPTER = new ProtoAdapter<SendUserActionRequestBody>() { // from class: X.1COB
        public final ProtoAdapter<Map<String, String>> LIZ;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.LIZ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final SendUserActionRequestBody decode(ProtoReader protoReader) {
            C1COC c1coc = new C1COC();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    if (iNextTag != 5) {
                                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                        c1coc.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                    } else {
                                        c1coc.LJII.putAll(this.LIZ.decode(protoReader));
                                    }
                                } else {
                                    try {
                                        c1coc.LJI = EnumC19362810p8.ADAPTER.decode(protoReader);
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        TryCatchGuardChecker.doCheck(e);
                                        c1coc.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    }
                                }
                            } else {
                                c1coc.LJFF = ProtoAdapter.INT64.decode(protoReader);
                            }
                        } else {
                            c1coc.LJ = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c1coc.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1coc.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(SendUserActionRequestBody sendUserActionRequestBody) {
            SendUserActionRequestBody sendUserActionRequestBody2 = sendUserActionRequestBody;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, sendUserActionRequestBody2.conversation_id) + ProtoAdapter.INT32.encodedSizeWithTag(2, sendUserActionRequestBody2.conversation_type) + ProtoAdapter.INT64.encodedSizeWithTag(3, sendUserActionRequestBody2.conversation_short_id) + EnumC19362810p8.ADAPTER.encodedSizeWithTag(4, sendUserActionRequestBody2.action_type) + this.LIZ.encodedSizeWithTag(5, sendUserActionRequestBody2.extra) + sendUserActionRequestBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, SendUserActionRequestBody sendUserActionRequestBody) {
            SendUserActionRequestBody sendUserActionRequestBody2 = sendUserActionRequestBody;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, sendUserActionRequestBody2.conversation_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, sendUserActionRequestBody2.conversation_type);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, sendUserActionRequestBody2.conversation_short_id);
            EnumC19362810p8.ADAPTER.encodeWithTag(protoWriter, 4, sendUserActionRequestBody2.action_type);
            this.LIZ.encodeWithTag(protoWriter, 5, sendUserActionRequestBody2.extra);
            protoWriter.writeBytes(sendUserActionRequestBody2.unknownFields());
        }
    };
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final EnumC19362810p8 DEFAULT_ACTION_TYPE = EnumC19362810p8.ENTER_CONVERSATION;

    @Override // com.squareup.wire.Message
    public C1COC newBuilder() {
        C1COC c1coc = new C1COC();
        c1coc.LIZLLL = this.conversation_id;
        c1coc.LJ = this.conversation_type;
        c1coc.LJFF = this.conversation_short_id;
        c1coc.LJI = this.action_type;
        c1coc.LJII = C1516540pZE.LIZLLL("extra", this.extra);
        c1coc.addUnknownFields(unknownFields());
        return c1coc;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.conversation_id != null) {
            sb.append(", conversation_id=");
            sb.append(this.conversation_id);
        }
        if (this.conversation_type != null) {
            sb.append(", conversation_type=");
            sb.append(this.conversation_type);
        }
        if (this.conversation_short_id != null) {
            sb.append(", conversation_short_id=");
            sb.append(this.conversation_short_id);
        }
        if (this.action_type != null) {
            sb.append(", action_type=");
            sb.append(this.action_type);
        }
        Map<String, String> map = this.extra;
        if (map != null && !map.isEmpty()) {
            sb.append(", extra=");
            sb.append(this.extra);
        }
        sb.replace(0, 2, "SendUserActionRequestBody{");
        sb.append('}');
        return sb.toString();
    }

    public SendUserActionRequestBody(String str, Integer num, Long l, EnumC19362810p8 enumC19362810p8, Map<String, String> map) {
        this(str, num, l, enumC19362810p8, map, ByteString.EMPTY);
    }

    public SendUserActionRequestBody(String str, Integer num, Long l, EnumC19362810p8 enumC19362810p8, Map<String, String> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_id = str;
        this.conversation_type = num;
        this.conversation_short_id = l;
        this.action_type = enumC19362810p8;
        this.extra = C1516540pZE.LJI("extra", map);
    }
}
