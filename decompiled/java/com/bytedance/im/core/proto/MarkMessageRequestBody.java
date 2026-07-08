package com.bytedance.im.core.proto;

import X.C09CT;
import X.C2251831DBt;
import X.EnumC2244831Ctd;
import com.bytedance.im.core.proto.MarkMessageRequestBody;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: loaded from: classes36.dex */
public final class MarkMessageRequestBody extends Message<MarkMessageRequestBody, C2251831DBt> {
    public static final long serialVersionUID = 0;

    @C09CT("action_type")
    public final EnumC2244831Ctd action_type;

    @C09CT("conversation_id")
    public final String conversation_id;

    @C09CT("conversation_short_id")
    public final Long conversation_short_id;

    @C09CT("conversation_type")
    public final Integer conversation_type;

    @C09CT("do_action")
    public final Boolean do_action;

    @C09CT("server_message_id")
    public final Long server_message_id;

    @C09CT("sort_time")
    public final Long sort_time;

    @C09CT("tag")
    public final Long tag;
    public static final ProtoAdapter<MarkMessageRequestBody> ADAPTER = new ProtoAdapter<MarkMessageRequestBody>() { // from class: X.1DBs
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final MarkMessageRequestBody decode(ProtoReader protoReader) {
            C2251831DBt c2251831DBt = new C2251831DBt();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c2251831DBt.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c2251831DBt.LJ = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 3:
                            c2251831DBt.LJFF = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            c2251831DBt.LJI = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 5:
                            c2251831DBt.LJII = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            try {
                                c2251831DBt.LJIIIIZZ = EnumC2244831Ctd.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c2251831DBt.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                            break;
                        case 7:
                            c2251831DBt.LJIIIZ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 8:
                            c2251831DBt.LJIIJ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2251831DBt.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2251831DBt.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(MarkMessageRequestBody markMessageRequestBody) {
            MarkMessageRequestBody markMessageRequestBody2 = markMessageRequestBody;
            int iEncodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, markMessageRequestBody2.conversation_id) + ProtoAdapter.INT32.encodedSizeWithTag(2, markMessageRequestBody2.conversation_type);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(3, markMessageRequestBody2.conversation_short_id) + protoAdapter.encodedSizeWithTag(4, markMessageRequestBody2.server_message_id) + ProtoAdapter.BOOL.encodedSizeWithTag(5, markMessageRequestBody2.do_action) + EnumC2244831Ctd.ADAPTER.encodedSizeWithTag(6, markMessageRequestBody2.action_type) + protoAdapter.encodedSizeWithTag(7, markMessageRequestBody2.sort_time) + protoAdapter.encodedSizeWithTag(8, markMessageRequestBody2.tag) + markMessageRequestBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, MarkMessageRequestBody markMessageRequestBody) {
            MarkMessageRequestBody markMessageRequestBody2 = markMessageRequestBody;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, markMessageRequestBody2.conversation_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, markMessageRequestBody2.conversation_type);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 3, markMessageRequestBody2.conversation_short_id);
            protoAdapter.encodeWithTag(protoWriter, 4, markMessageRequestBody2.server_message_id);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, markMessageRequestBody2.do_action);
            EnumC2244831Ctd.ADAPTER.encodeWithTag(protoWriter, 6, markMessageRequestBody2.action_type);
            protoAdapter.encodeWithTag(protoWriter, 7, markMessageRequestBody2.sort_time);
            protoAdapter.encodeWithTag(protoWriter, 8, markMessageRequestBody2.tag);
            protoWriter.writeBytes(markMessageRequestBody2.unknownFields());
        }
    };
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Long DEFAULT_SERVER_MESSAGE_ID = 0L;
    public static final Boolean DEFAULT_DO_ACTION = Boolean.FALSE;
    public static final EnumC2244831Ctd DEFAULT_ACTION_TYPE = EnumC2244831Ctd.UNKNOWN_ACTION;
    public static final Long DEFAULT_SORT_TIME = 0L;
    public static final Long DEFAULT_TAG = 0L;

    @Override // com.squareup.wire.Message
    public C2251831DBt newBuilder() {
        C2251831DBt c2251831DBt = new C2251831DBt();
        c2251831DBt.LIZLLL = this.conversation_id;
        c2251831DBt.LJ = this.conversation_type;
        c2251831DBt.LJFF = this.conversation_short_id;
        c2251831DBt.LJI = this.server_message_id;
        c2251831DBt.LJII = this.do_action;
        c2251831DBt.LJIIIIZZ = this.action_type;
        c2251831DBt.LJIIIZ = this.sort_time;
        c2251831DBt.LJIIJ = this.tag;
        c2251831DBt.addUnknownFields(unknownFields());
        return c2251831DBt;
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
        if (this.server_message_id != null) {
            sb.append(", server_message_id=");
            sb.append(this.server_message_id);
        }
        if (this.do_action != null) {
            sb.append(", do_action=");
            sb.append(this.do_action);
        }
        if (this.action_type != null) {
            sb.append(", action_type=");
            sb.append(this.action_type);
        }
        if (this.sort_time != null) {
            sb.append(", sort_time=");
            sb.append(this.sort_time);
        }
        if (this.tag != null) {
            sb.append(", tag=");
            sb.append(this.tag);
        }
        sb.replace(0, 2, "MarkMessageRequestBody{");
        sb.append('}');
        return sb.toString();
    }

    public MarkMessageRequestBody(String str, Integer num, Long l, Long l2, Boolean bool, EnumC2244831Ctd enumC2244831Ctd, Long l3, Long l4) {
        this(str, num, l, l2, bool, enumC2244831Ctd, l3, l4, ByteString.EMPTY);
    }

    public MarkMessageRequestBody(String str, Integer num, Long l, Long l2, Boolean bool, EnumC2244831Ctd enumC2244831Ctd, Long l3, Long l4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_id = str;
        this.conversation_type = num;
        this.conversation_short_id = l;
        this.server_message_id = l2;
        this.do_action = bool;
        this.action_type = enumC2244831Ctd;
        this.sort_time = l3;
        this.tag = l4;
    }
}
