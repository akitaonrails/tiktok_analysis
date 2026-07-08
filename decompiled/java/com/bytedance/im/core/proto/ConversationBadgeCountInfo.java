package com.bytedance.im.core.proto;

import X.C09CT;
import X.C875140YUu;
import com.bytedance.im.core.proto.ConversationBadgeCountInfo;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class ConversationBadgeCountInfo extends Message<ConversationBadgeCountInfo, C875140YUu> {
    public static final long serialVersionUID = 0;

    @C09CT("badge_count")
    public final Integer badge_count;

    @C09CT("badge_count_v2")
    public final Integer badge_count_v2;

    @C09CT("badge_version")
    public final Long badge_version;

    @C09CT("conversation_id")
    public final String conversation_id;

    @C09CT("conversation_index_v2")
    public final Long conversation_index_v2;

    @C09CT("conversation_short_id")
    public final Long conversation_short_id;

    @C09CT("read_badge_count_v2")
    public final Integer read_badge_count_v2;
    public static final ProtoAdapter<ConversationBadgeCountInfo> ADAPTER = new ProtoAdapter<ConversationBadgeCountInfo>() { // from class: X.0YUt
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final ConversationBadgeCountInfo decode(ProtoReader protoReader) {
            C875140YUu c875140YUu = new C875140YUu();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c875140YUu.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 2:
                            c875140YUu.LJ = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 3:
                            c875140YUu.LJFF = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            c875140YUu.LJI = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c875140YUu.LJII = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 6:
                            c875140YUu.LJIIIIZZ = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 7:
                            c875140YUu.LJIIIZ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c875140YUu.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c875140YUu.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(ConversationBadgeCountInfo conversationBadgeCountInfo) {
            ConversationBadgeCountInfo conversationBadgeCountInfo2 = conversationBadgeCountInfo;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, conversationBadgeCountInfo2.conversation_short_id);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, conversationBadgeCountInfo2.badge_count) + protoAdapter.encodedSizeWithTag(3, conversationBadgeCountInfo2.conversation_index_v2) + ProtoAdapter.STRING.encodedSizeWithTag(4, conversationBadgeCountInfo2.conversation_id) + protoAdapter2.encodedSizeWithTag(5, conversationBadgeCountInfo2.read_badge_count_v2) + protoAdapter2.encodedSizeWithTag(6, conversationBadgeCountInfo2.badge_count_v2) + protoAdapter.encodedSizeWithTag(7, conversationBadgeCountInfo2.badge_version) + conversationBadgeCountInfo2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, ConversationBadgeCountInfo conversationBadgeCountInfo) {
            ConversationBadgeCountInfo conversationBadgeCountInfo2 = conversationBadgeCountInfo;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, conversationBadgeCountInfo2.conversation_short_id);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            protoAdapter2.encodeWithTag(protoWriter, 2, conversationBadgeCountInfo2.badge_count);
            protoAdapter.encodeWithTag(protoWriter, 3, conversationBadgeCountInfo2.conversation_index_v2);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, conversationBadgeCountInfo2.conversation_id);
            protoAdapter2.encodeWithTag(protoWriter, 5, conversationBadgeCountInfo2.read_badge_count_v2);
            protoAdapter2.encodeWithTag(protoWriter, 6, conversationBadgeCountInfo2.badge_count_v2);
            protoAdapter.encodeWithTag(protoWriter, 7, conversationBadgeCountInfo2.badge_version);
            protoWriter.writeBytes(conversationBadgeCountInfo2.unknownFields());
        }
    };
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Integer DEFAULT_BADGE_COUNT = 0;
    public static final Long DEFAULT_CONVERSATION_INDEX_V2 = 0L;
    public static final Integer DEFAULT_READ_BADGE_COUNT_V2 = 0;
    public static final Integer DEFAULT_BADGE_COUNT_V2 = 0;
    public static final Long DEFAULT_BADGE_VERSION = 0L;

    @Override // com.squareup.wire.Message
    public C875140YUu newBuilder() {
        C875140YUu c875140YUu = new C875140YUu();
        c875140YUu.LIZLLL = this.conversation_short_id;
        c875140YUu.LJ = this.badge_count;
        c875140YUu.LJFF = this.conversation_index_v2;
        c875140YUu.LJI = this.conversation_id;
        c875140YUu.LJII = this.read_badge_count_v2;
        c875140YUu.LJIIIIZZ = this.badge_count_v2;
        c875140YUu.LJIIIZ = this.badge_version;
        c875140YUu.addUnknownFields(unknownFields());
        return c875140YUu;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", conversation_short_id=");
        sb.append(this.conversation_short_id);
        sb.append(", badge_count=");
        sb.append(this.badge_count);
        sb.append(", conversation_index_v2=");
        sb.append(this.conversation_index_v2);
        sb.append(", conversation_id=");
        sb.append(this.conversation_id);
        if (this.read_badge_count_v2 != null) {
            sb.append(", read_badge_count_v2=");
            sb.append(this.read_badge_count_v2);
        }
        if (this.badge_count_v2 != null) {
            sb.append(", badge_count_v2=");
            sb.append(this.badge_count_v2);
        }
        if (this.badge_version != null) {
            sb.append(", badge_version=");
            sb.append(this.badge_version);
        }
        sb.replace(0, 2, "ConversationBadgeCountInfo{");
        sb.append('}');
        return sb.toString();
    }

    public ConversationBadgeCountInfo(Long l, Integer num, Long l2, String str, Integer num2, Integer num3, Long l3) {
        this(l, num, l2, str, num2, num3, l3, ByteString.EMPTY);
    }

    public ConversationBadgeCountInfo(Long l, Integer num, Long l2, String str, Integer num2, Integer num3, Long l3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_short_id = l;
        this.badge_count = num;
        this.conversation_index_v2 = l2;
        this.conversation_id = str;
        this.read_badge_count_v2 = num2;
        this.badge_count_v2 = num3;
        this.badge_version = l3;
    }
}
