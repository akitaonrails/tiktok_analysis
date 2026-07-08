package com.bytedance.im.core.proto;

import X.C09CT;
import X.C2251851DBv;
import X.EnumC2244831Ctd;
import com.bytedance.im.core.proto.PullMarkMessageRequestBody;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.tts.oecverify.BdTuring;
import okio.ByteString;

/* JADX INFO: loaded from: classes36.dex */
public final class PullMarkMessageRequestBody extends Message<PullMarkMessageRequestBody, C2251851DBv> {
    public static final EnumC2244831Ctd DEFAULT_ACTION_TYPE;
    public static final Boolean DEFAULT_ASC;
    public static final Boolean DEFAULT_CLEAR_UNREAD_COUNT;
    public static final Long DEFAULT_TAG;
    public static final long serialVersionUID = 0;

    @C09CT("action_type")
    public final EnumC2244831Ctd action_type;

    @C09CT("asc")
    public final Boolean asc;

    @C09CT("clear_unread_count")
    public final Boolean clear_unread_count;

    @C09CT("conversation_id")
    public final String conversation_id;

    @C09CT("conversation_short_id")
    public final Long conversation_short_id;

    @C09CT("conversation_type")
    public final Integer conversation_type;

    @C09CT("cursor")
    public final Long cursor;

    @C09CT("limit")
    public final Long limit;

    @C09CT("tag")
    public final Long tag;
    public static final ProtoAdapter<PullMarkMessageRequestBody> ADAPTER = new ProtoAdapter<PullMarkMessageRequestBody>() { // from class: X.1DBu
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final PullMarkMessageRequestBody decode(ProtoReader protoReader) {
            C2251851DBv c2251851DBv = new C2251851DBv();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c2251851DBv.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c2251851DBv.LJ = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 3:
                            c2251851DBv.LJFF = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            c2251851DBv.LJI = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 5:
                            c2251851DBv.LJII = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 6:
                            c2251851DBv.LJIIIIZZ = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 7:
                            try {
                                c2251851DBv.LJIIIZ = EnumC2244831Ctd.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c2251851DBv.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                            break;
                        case 8:
                            c2251851DBv.LJIIJ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c2251851DBv.LJIIJJI = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2251851DBv.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2251851DBv.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(PullMarkMessageRequestBody pullMarkMessageRequestBody) {
            PullMarkMessageRequestBody pullMarkMessageRequestBody2 = pullMarkMessageRequestBody;
            int iEncodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, pullMarkMessageRequestBody2.conversation_id) + ProtoAdapter.INT32.encodedSizeWithTag(2, pullMarkMessageRequestBody2.conversation_type);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(3, pullMarkMessageRequestBody2.conversation_short_id) + protoAdapter.encodedSizeWithTag(4, pullMarkMessageRequestBody2.cursor) + protoAdapter.encodedSizeWithTag(5, pullMarkMessageRequestBody2.limit);
            ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
            return iEncodedSizeWithTag2 + protoAdapter2.encodedSizeWithTag(6, pullMarkMessageRequestBody2.asc) + EnumC2244831Ctd.ADAPTER.encodedSizeWithTag(7, pullMarkMessageRequestBody2.action_type) + protoAdapter.encodedSizeWithTag(8, pullMarkMessageRequestBody2.tag) + protoAdapter2.encodedSizeWithTag(9, pullMarkMessageRequestBody2.clear_unread_count) + pullMarkMessageRequestBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, PullMarkMessageRequestBody pullMarkMessageRequestBody) {
            PullMarkMessageRequestBody pullMarkMessageRequestBody2 = pullMarkMessageRequestBody;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, pullMarkMessageRequestBody2.conversation_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, pullMarkMessageRequestBody2.conversation_type);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 3, pullMarkMessageRequestBody2.conversation_short_id);
            protoAdapter.encodeWithTag(protoWriter, 4, pullMarkMessageRequestBody2.cursor);
            protoAdapter.encodeWithTag(protoWriter, 5, pullMarkMessageRequestBody2.limit);
            ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
            protoAdapter2.encodeWithTag(protoWriter, 6, pullMarkMessageRequestBody2.asc);
            EnumC2244831Ctd.ADAPTER.encodeWithTag(protoWriter, 7, pullMarkMessageRequestBody2.action_type);
            protoAdapter.encodeWithTag(protoWriter, 8, pullMarkMessageRequestBody2.tag);
            protoAdapter2.encodeWithTag(protoWriter, 9, pullMarkMessageRequestBody2.clear_unread_count);
            protoWriter.writeBytes(pullMarkMessageRequestBody2.unknownFields());
        }
    };
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Long DEFAULT_CURSOR = 0L;
    public static final Long DEFAULT_LIMIT = 0L;

    static {
        Boolean bool = Boolean.FALSE;
        DEFAULT_ASC = bool;
        DEFAULT_ACTION_TYPE = EnumC2244831Ctd.UNKNOWN_ACTION;
        DEFAULT_TAG = 0L;
        DEFAULT_CLEAR_UNREAD_COUNT = bool;
    }

    @Override // com.squareup.wire.Message
    public C2251851DBv newBuilder() {
        C2251851DBv c2251851DBv = new C2251851DBv();
        c2251851DBv.LIZLLL = this.conversation_id;
        c2251851DBv.LJ = this.conversation_type;
        c2251851DBv.LJFF = this.conversation_short_id;
        c2251851DBv.LJI = this.cursor;
        c2251851DBv.LJII = this.limit;
        c2251851DBv.LJIIIIZZ = this.asc;
        c2251851DBv.LJIIIZ = this.action_type;
        c2251851DBv.LJIIJ = this.tag;
        c2251851DBv.LJIIJJI = this.clear_unread_count;
        c2251851DBv.addUnknownFields(unknownFields());
        return c2251851DBv;
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
        if (this.cursor != null) {
            sb.append(", cursor=");
            sb.append(this.cursor);
        }
        if (this.limit != null) {
            sb.append(", limit=");
            sb.append(this.limit);
        }
        if (this.asc != null) {
            sb.append(", asc=");
            sb.append(this.asc);
        }
        if (this.action_type != null) {
            sb.append(", action_type=");
            sb.append(this.action_type);
        }
        if (this.tag != null) {
            sb.append(", tag=");
            sb.append(this.tag);
        }
        if (this.clear_unread_count != null) {
            sb.append(", clear_unread_count=");
            sb.append(this.clear_unread_count);
        }
        sb.replace(0, 2, "PullMarkMessageRequestBody{");
        sb.append('}');
        return sb.toString();
    }

    public PullMarkMessageRequestBody(String str, Integer num, Long l, Long l2, Long l3, Boolean bool, EnumC2244831Ctd enumC2244831Ctd, Long l4, Boolean bool2) {
        this(str, num, l, l2, l3, bool, enumC2244831Ctd, l4, bool2, ByteString.EMPTY);
    }

    public PullMarkMessageRequestBody(String str, Integer num, Long l, Long l2, Long l3, Boolean bool, EnumC2244831Ctd enumC2244831Ctd, Long l4, Boolean bool2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_id = str;
        this.conversation_type = num;
        this.conversation_short_id = l;
        this.cursor = l2;
        this.limit = l3;
        this.asc = bool;
        this.action_type = enumC2244831Ctd;
        this.tag = l4;
        this.clear_unread_count = bool2;
    }
}
