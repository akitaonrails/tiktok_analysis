package com.bytedance.im.core.proto;

import X.C09CT;
import X.C0YRO;
import X.EnumC869400Y8s;
import com.bytedance.im.core.proto.ConversationCheckInfoV2;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class ConversationCheckInfoV2 extends Message<ConversationCheckInfoV2, C0YRO> {
    public static final ProtoAdapter<ConversationCheckInfoV2> ADAPTER = new ProtoAdapter<ConversationCheckInfoV2>() { // from class: X.0YRN
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final ConversationCheckInfoV2 decode(ProtoReader protoReader) {
            C0YRO c0yro = new C0YRO();
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
                                        c0yro.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                    } else {
                                        c0yro.LJII = ProtoAdapter.INT64.decode(protoReader);
                                    }
                                } else {
                                    c0yro.LJI = ProtoAdapter.BOOL.decode(protoReader);
                                }
                            } else {
                                try {
                                    c0yro.LJFF = EnumC869400Y8s.ADAPTER.decode(protoReader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    c0yro.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                }
                            }
                        } else {
                            c0yro.LJ = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c0yro.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c0yro.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(ConversationCheckInfoV2 conversationCheckInfoV2) {
            ConversationCheckInfoV2 conversationCheckInfoV22 = conversationCheckInfoV2;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return protoAdapter.encodedSizeWithTag(1, conversationCheckInfoV22.conv_short_id) + ProtoAdapter.STRING.encodedSizeWithTag(2, conversationCheckInfoV22.conv_id) + EnumC869400Y8s.ADAPTER.encodedSizeWithTag(3, conversationCheckInfoV22.conv_type) + ProtoAdapter.BOOL.encodedSizeWithTag(4, conversationCheckInfoV22.is_pinned) + protoAdapter.encodedSizeWithTag(5, conversationCheckInfoV22.min_index) + conversationCheckInfoV22.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, ConversationCheckInfoV2 conversationCheckInfoV2) {
            ConversationCheckInfoV2 conversationCheckInfoV22 = conversationCheckInfoV2;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, conversationCheckInfoV22.conv_short_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, conversationCheckInfoV22.conv_id);
            EnumC869400Y8s.ADAPTER.encodeWithTag(protoWriter, 3, conversationCheckInfoV22.conv_type);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, conversationCheckInfoV22.is_pinned);
            protoAdapter.encodeWithTag(protoWriter, 5, conversationCheckInfoV22.min_index);
            protoWriter.writeBytes(conversationCheckInfoV22.unknownFields());
        }
    };
    public static final Long DEFAULT_CONV_SHORT_ID = 0L;
    public static final EnumC869400Y8s DEFAULT_CONV_TYPE = EnumC869400Y8s.UNKNOWN_CONV_TYPE;
    public static final Boolean DEFAULT_IS_PINNED = Boolean.FALSE;
    public static final Long DEFAULT_MIN_INDEX = 0L;
    public static final long serialVersionUID = 0;

    @C09CT("conv_id")
    public final String conv_id;

    @C09CT("conv_short_id")
    public final Long conv_short_id;

    @C09CT("conv_type")
    public final EnumC869400Y8s conv_type;

    @C09CT("is_pinned")
    public final Boolean is_pinned;

    @C09CT("min_index")
    public final Long min_index;

    @Override // com.squareup.wire.Message
    public C0YRO newBuilder() {
        C0YRO c0yro = new C0YRO();
        c0yro.LIZLLL = this.conv_short_id;
        c0yro.LJ = this.conv_id;
        c0yro.LJFF = this.conv_type;
        c0yro.LJI = this.is_pinned;
        c0yro.LJII = this.min_index;
        c0yro.addUnknownFields(unknownFields());
        return c0yro;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", conv_short_id=");
        sb.append(this.conv_short_id);
        if (this.conv_id != null) {
            sb.append(", conv_id=");
            sb.append(this.conv_id);
        }
        sb.append(", conv_type=");
        sb.append(this.conv_type);
        if (this.is_pinned != null) {
            sb.append(", is_pinned=");
            sb.append(this.is_pinned);
        }
        if (this.min_index != null) {
            sb.append(", min_index=");
            sb.append(this.min_index);
        }
        sb.replace(0, 2, "ConversationCheckInfoV2{");
        sb.append('}');
        return sb.toString();
    }

    public ConversationCheckInfoV2(Long l, String str, EnumC869400Y8s enumC869400Y8s, Boolean bool, Long l2) {
        this(l, str, enumC869400Y8s, bool, l2, ByteString.EMPTY);
    }

    public ConversationCheckInfoV2(Long l, String str, EnumC869400Y8s enumC869400Y8s, Boolean bool, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conv_short_id = l;
        this.conv_id = str;
        this.conv_type = enumC869400Y8s;
        this.is_pinned = bool;
        this.min_index = l2;
    }
}
