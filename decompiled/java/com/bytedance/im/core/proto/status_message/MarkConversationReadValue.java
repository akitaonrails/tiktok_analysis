package com.bytedance.im.core.proto.status_message;

import X.C09CT;
import X.C876220YYy;
import X.EnumC868460Y5c;
import com.bytedance.im.core.proto.status_message.MarkConversationReadValue;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class MarkConversationReadValue extends Message<MarkConversationReadValue, C876220YYy> {
    public static final long serialVersionUID = 0;

    @C09CT("inboxType")
    public final Integer inboxType;

    @C09CT("mark_read_idempotent_id")
    public final String mark_read_idempotent_id;

    @C09CT("mark_read_reaction_key")
    public final String mark_read_reaction_key;

    @C09CT("mark_read_type")
    public final EnumC868460Y5c mark_read_type;

    @C09CT("read_badge_count_v2")
    public final Integer read_badge_count_v2;

    @C09CT("target_message_id")
    public final Long target_message_id;
    public static final ProtoAdapter<MarkConversationReadValue> ADAPTER = new ProtoAdapter<MarkConversationReadValue>() { // from class: X.0YYx
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final MarkConversationReadValue decode(ProtoReader protoReader) {
            C876220YYy c876220YYy = new C876220YYy();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c876220YYy.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 2:
                            c876220YYy.LJ = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 3:
                            c876220YYy.LJFF = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            try {
                                c876220YYy.LJI = EnumC868460Y5c.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c876220YYy.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                            break;
                        case 5:
                            c876220YYy.LJII = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c876220YYy.LJIIIIZZ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c876220YYy.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c876220YYy.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(MarkConversationReadValue markConversationReadValue) {
            MarkConversationReadValue markConversationReadValue2 = markConversationReadValue;
            int iEncodedSizeWithTag = ProtoAdapter.INT64.encodedSizeWithTag(1, markConversationReadValue2.target_message_id);
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, markConversationReadValue2.inboxType) + protoAdapter.encodedSizeWithTag(3, markConversationReadValue2.read_badge_count_v2) + EnumC868460Y5c.ADAPTER.encodedSizeWithTag(4, markConversationReadValue2.mark_read_type);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            return iEncodedSizeWithTag2 + protoAdapter2.encodedSizeWithTag(5, markConversationReadValue2.mark_read_idempotent_id) + protoAdapter2.encodedSizeWithTag(6, markConversationReadValue2.mark_read_reaction_key) + markConversationReadValue2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final MarkConversationReadValue redact(MarkConversationReadValue markConversationReadValue) {
            C876220YYy c876220YYyNewBuilder = markConversationReadValue.newBuilder();
            c876220YYyNewBuilder.clearUnknownFields();
            return c876220YYyNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, MarkConversationReadValue markConversationReadValue) {
            MarkConversationReadValue markConversationReadValue2 = markConversationReadValue;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, markConversationReadValue2.target_message_id);
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 2, markConversationReadValue2.inboxType);
            protoAdapter.encodeWithTag(protoWriter, 3, markConversationReadValue2.read_badge_count_v2);
            EnumC868460Y5c.ADAPTER.encodeWithTag(protoWriter, 4, markConversationReadValue2.mark_read_type);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            protoAdapter2.encodeWithTag(protoWriter, 5, markConversationReadValue2.mark_read_idempotent_id);
            protoAdapter2.encodeWithTag(protoWriter, 6, markConversationReadValue2.mark_read_reaction_key);
            protoWriter.writeBytes(markConversationReadValue2.unknownFields());
        }
    };
    public static final Long DEFAULT_TARGET_MESSAGE_ID = 0L;
    public static final Integer DEFAULT_INBOXTYPE = 0;
    public static final Integer DEFAULT_READ_BADGE_COUNT_V2 = 0;
    public static final EnumC868460Y5c DEFAULT_MARK_READ_TYPE = EnumC868460Y5c.TYPE_USER_MESSAGE;

    @Override // com.squareup.wire.Message
    public C876220YYy newBuilder() {
        C876220YYy c876220YYy = new C876220YYy();
        c876220YYy.LIZLLL = this.target_message_id;
        c876220YYy.LJ = this.inboxType;
        c876220YYy.LJFF = this.read_badge_count_v2;
        c876220YYy.LJI = this.mark_read_type;
        c876220YYy.LJII = this.mark_read_idempotent_id;
        c876220YYy.LJIIIIZZ = this.mark_read_reaction_key;
        c876220YYy.addUnknownFields(unknownFields());
        return c876220YYy;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.target_message_id != null) {
            sb.append(", target_message_id=");
            sb.append(this.target_message_id);
        }
        if (this.inboxType != null) {
            sb.append(", inboxType=");
            sb.append(this.inboxType);
        }
        if (this.read_badge_count_v2 != null) {
            sb.append(", read_badge_count_v2=");
            sb.append(this.read_badge_count_v2);
        }
        if (this.mark_read_type != null) {
            sb.append(", mark_read_type=");
            sb.append(this.mark_read_type);
        }
        if (this.mark_read_idempotent_id != null) {
            sb.append(", mark_read_idempotent_id=");
            sb.append(this.mark_read_idempotent_id);
        }
        if (this.mark_read_reaction_key != null) {
            sb.append(", mark_read_reaction_key=");
            sb.append(this.mark_read_reaction_key);
        }
        sb.replace(0, 2, "MarkConversationReadValue{");
        sb.append('}');
        return sb.toString();
    }

    public MarkConversationReadValue(Long l, Integer num, Integer num2, EnumC868460Y5c enumC868460Y5c, String str, String str2) {
        this(l, num, num2, enumC868460Y5c, str, str2, ByteString.EMPTY);
    }

    public MarkConversationReadValue(Long l, Integer num, Integer num2, EnumC868460Y5c enumC868460Y5c, String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.target_message_id = l;
        this.inboxType = num;
        this.read_badge_count_v2 = num2;
        this.mark_read_type = enumC868460Y5c;
        this.mark_read_idempotent_id = str;
        this.mark_read_reaction_key = str2;
    }
}
