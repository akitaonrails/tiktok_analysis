package com.bytedance.im.core.proto;

import X.C09CT;
import X.C1516540pZE;
import X.C2244861Ctg;
import X.EnumC2244831Ctd;
import com.bytedance.im.core.proto.BatchUnmarkMessageRequestBody;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class BatchUnmarkMessageRequestBody extends Message<BatchUnmarkMessageRequestBody, C2244861Ctg> {
    public static final long serialVersionUID = 0;

    @C09CT("action_type")
    public final EnumC2244831Ctd action_type;

    @C09CT("conversation_id")
    public final String conversation_id;

    @C09CT("conversation_short_id")
    public final Long conversation_short_id;

    @C09CT("conversation_type")
    public final Integer conversation_type;

    @C09CT("server_message_ids")
    public final List<Long> server_message_ids;

    @C09CT("tag")
    public final Long tag;
    public static final ProtoAdapter<BatchUnmarkMessageRequestBody> ADAPTER = new ProtoAdapter<BatchUnmarkMessageRequestBody>() { // from class: X.1Ctf
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final BatchUnmarkMessageRequestBody decode(ProtoReader protoReader) {
            C2244861Ctg c2244861Ctg = new C2244861Ctg();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c2244861Ctg.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c2244861Ctg.LJ = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 3:
                            c2244861Ctg.LJFF = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            c2244861Ctg.LJI.add(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 5:
                            try {
                                c2244861Ctg.LJII = EnumC2244831Ctd.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c2244861Ctg.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                            break;
                        case 6:
                            c2244861Ctg.LJIIIIZZ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2244861Ctg.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2244861Ctg.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(BatchUnmarkMessageRequestBody batchUnmarkMessageRequestBody) {
            BatchUnmarkMessageRequestBody batchUnmarkMessageRequestBody2 = batchUnmarkMessageRequestBody;
            int iEncodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, batchUnmarkMessageRequestBody2.conversation_id) + ProtoAdapter.INT32.encodedSizeWithTag(2, batchUnmarkMessageRequestBody2.conversation_type);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(3, batchUnmarkMessageRequestBody2.conversation_short_id) + protoAdapter.asRepeated().encodedSizeWithTag(4, batchUnmarkMessageRequestBody2.server_message_ids) + EnumC2244831Ctd.ADAPTER.encodedSizeWithTag(5, batchUnmarkMessageRequestBody2.action_type) + protoAdapter.encodedSizeWithTag(6, batchUnmarkMessageRequestBody2.tag) + batchUnmarkMessageRequestBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, BatchUnmarkMessageRequestBody batchUnmarkMessageRequestBody) {
            BatchUnmarkMessageRequestBody batchUnmarkMessageRequestBody2 = batchUnmarkMessageRequestBody;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, batchUnmarkMessageRequestBody2.conversation_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, batchUnmarkMessageRequestBody2.conversation_type);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 3, batchUnmarkMessageRequestBody2.conversation_short_id);
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 4, batchUnmarkMessageRequestBody2.server_message_ids);
            EnumC2244831Ctd.ADAPTER.encodeWithTag(protoWriter, 5, batchUnmarkMessageRequestBody2.action_type);
            protoAdapter.encodeWithTag(protoWriter, 6, batchUnmarkMessageRequestBody2.tag);
            protoWriter.writeBytes(batchUnmarkMessageRequestBody2.unknownFields());
        }
    };
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final EnumC2244831Ctd DEFAULT_ACTION_TYPE = EnumC2244831Ctd.UNKNOWN_ACTION;
    public static final Long DEFAULT_TAG = 0L;

    @Override // com.squareup.wire.Message
    public C2244861Ctg newBuilder() {
        C2244861Ctg c2244861Ctg = new C2244861Ctg();
        c2244861Ctg.LIZLLL = this.conversation_id;
        c2244861Ctg.LJ = this.conversation_type;
        c2244861Ctg.LJFF = this.conversation_short_id;
        c2244861Ctg.LJI = C1516540pZE.LIZJ("server_message_ids", this.server_message_ids);
        c2244861Ctg.LJII = this.action_type;
        c2244861Ctg.LJIIIIZZ = this.tag;
        c2244861Ctg.addUnknownFields(unknownFields());
        return c2244861Ctg;
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
        List<Long> list = this.server_message_ids;
        if (list != null && !list.isEmpty()) {
            sb.append(", server_message_ids=");
            sb.append(this.server_message_ids);
        }
        if (this.action_type != null) {
            sb.append(", action_type=");
            sb.append(this.action_type);
        }
        if (this.tag != null) {
            sb.append(", tag=");
            sb.append(this.tag);
        }
        sb.replace(0, 2, "BatchUnmarkMessageRequestBody{");
        sb.append('}');
        return sb.toString();
    }

    public BatchUnmarkMessageRequestBody(String str, Integer num, Long l, List<Long> list, EnumC2244831Ctd enumC2244831Ctd, Long l2) {
        this(str, num, l, list, enumC2244831Ctd, l2, ByteString.EMPTY);
    }

    public BatchUnmarkMessageRequestBody(String str, Integer num, Long l, List<Long> list, EnumC2244831Ctd enumC2244831Ctd, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_id = str;
        this.conversation_type = num;
        this.conversation_short_id = l;
        this.server_message_ids = C1516540pZE.LJFF("server_message_ids", list);
        this.action_type = enumC2244831Ctd;
        this.tag = l2;
    }
}
