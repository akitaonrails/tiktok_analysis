package com.bytedance.im.core.proto;

import X.C09CT;
import X.C1DBK;
import X.EnumC868560Y5m;
import com.bytedance.im.core.proto.BlockConversationRequestBody;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: loaded from: classes36.dex */
public final class BlockConversationRequestBody extends Message<BlockConversationRequestBody, C1DBK> {
    public static final long serialVersionUID = 0;

    @C09CT("block_normal_only")
    public final Boolean block_normal_only;

    @C09CT("block_status")
    public final EnumC868560Y5m block_status;

    @C09CT("conv_short_id")
    public final Long conv_short_id;

    @C09CT("conversation_id")
    public final String conversation_id;

    @C09CT("conversation_type")
    public final Integer conversation_type;
    public static final ProtoAdapter<BlockConversationRequestBody> ADAPTER = new ProtoAdapter<BlockConversationRequestBody>() { // from class: X.1DBJ
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final BlockConversationRequestBody decode(ProtoReader protoReader) {
            C1DBK c1dbk = new C1DBK();
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
                                        c1dbk.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                    } else {
                                        c1dbk.LJII = ProtoAdapter.BOOL.decode(protoReader);
                                    }
                                } else {
                                    try {
                                        c1dbk.LJI = EnumC868560Y5m.ADAPTER.decode(protoReader);
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        TryCatchGuardChecker.doCheck(e);
                                        c1dbk.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    }
                                }
                            } else {
                                c1dbk.LJFF = ProtoAdapter.INT32.decode(protoReader);
                            }
                        } else {
                            c1dbk.LJ = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c1dbk.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1dbk.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(BlockConversationRequestBody blockConversationRequestBody) {
            BlockConversationRequestBody blockConversationRequestBody2 = blockConversationRequestBody;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, blockConversationRequestBody2.conversation_id) + ProtoAdapter.INT64.encodedSizeWithTag(2, blockConversationRequestBody2.conv_short_id) + ProtoAdapter.INT32.encodedSizeWithTag(3, blockConversationRequestBody2.conversation_type) + EnumC868560Y5m.ADAPTER.encodedSizeWithTag(4, blockConversationRequestBody2.block_status) + ProtoAdapter.BOOL.encodedSizeWithTag(5, blockConversationRequestBody2.block_normal_only) + blockConversationRequestBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, BlockConversationRequestBody blockConversationRequestBody) {
            BlockConversationRequestBody blockConversationRequestBody2 = blockConversationRequestBody;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, blockConversationRequestBody2.conversation_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, blockConversationRequestBody2.conv_short_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, blockConversationRequestBody2.conversation_type);
            EnumC868560Y5m.ADAPTER.encodeWithTag(protoWriter, 4, blockConversationRequestBody2.block_status);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, blockConversationRequestBody2.block_normal_only);
            protoWriter.writeBytes(blockConversationRequestBody2.unknownFields());
        }
    };
    public static final Long DEFAULT_CONV_SHORT_ID = 0L;
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final EnumC868560Y5m DEFAULT_BLOCK_STATUS = EnumC868560Y5m.UNBLOCK;
    public static final Boolean DEFAULT_BLOCK_NORMAL_ONLY = Boolean.FALSE;

    @Override // com.squareup.wire.Message
    public C1DBK newBuilder() {
        C1DBK c1dbk = new C1DBK();
        c1dbk.LIZLLL = this.conversation_id;
        c1dbk.LJ = this.conv_short_id;
        c1dbk.LJFF = this.conversation_type;
        c1dbk.LJI = this.block_status;
        c1dbk.LJII = this.block_normal_only;
        c1dbk.addUnknownFields(unknownFields());
        return c1dbk;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.conversation_id != null) {
            sb.append(", conversation_id=");
            sb.append(this.conversation_id);
        }
        if (this.conv_short_id != null) {
            sb.append(", conv_short_id=");
            sb.append(this.conv_short_id);
        }
        if (this.conversation_type != null) {
            sb.append(", conversation_type=");
            sb.append(this.conversation_type);
        }
        if (this.block_status != null) {
            sb.append(", block_status=");
            sb.append(this.block_status);
        }
        if (this.block_normal_only != null) {
            sb.append(", block_normal_only=");
            sb.append(this.block_normal_only);
        }
        sb.replace(0, 2, "BlockConversationRequestBody{");
        sb.append('}');
        return sb.toString();
    }

    public BlockConversationRequestBody(String str, Long l, Integer num, EnumC868560Y5m enumC868560Y5m, Boolean bool) {
        this(str, l, num, enumC868560Y5m, bool, ByteString.EMPTY);
    }

    public BlockConversationRequestBody(String str, Long l, Integer num, EnumC868560Y5m enumC868560Y5m, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_id = str;
        this.conv_short_id = l;
        this.conversation_type = num;
        this.block_status = enumC868560Y5m;
        this.block_normal_only = bool;
    }
}
