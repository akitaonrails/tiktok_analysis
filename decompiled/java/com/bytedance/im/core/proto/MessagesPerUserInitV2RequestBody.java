package com.bytedance.im.core.proto;

import X.C09CT;
import X.C1516540pZE;
import X.C869010Y7f;
import com.bytedance.im.core.proto.MessagesPerUserInitV2RequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class MessagesPerUserInitV2RequestBody extends Message<MessagesPerUserInitV2RequestBody, C869010Y7f> {
    public static final long serialVersionUID = 0;

    @C09CT("cursor")
    public final Long cursor;

    @C09CT("init_sub_type")
    public final Integer init_sub_type;

    @C09CT("new_user")
    public final Integer new_user;

    @C09CT("priority_chain_cursor")
    public final Long priority_chain_cursor;

    @C09CT("siderank_keys")
    public final List<String> siderank_keys;

    @C09CT("with_empty_conv")
    public final Boolean with_empty_conv;
    public static final ProtoAdapter<MessagesPerUserInitV2RequestBody> ADAPTER = new ProtoAdapter<MessagesPerUserInitV2RequestBody>() { // from class: X.0Y7g
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final MessagesPerUserInitV2RequestBody decode(ProtoReader protoReader) {
            C869010Y7f c869010Y7f = new C869010Y7f();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c869010Y7f.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 2:
                            c869010Y7f.LJ = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 3:
                            c869010Y7f.LJFF = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            c869010Y7f.LJI = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 5:
                            c869010Y7f.LJII.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 6:
                            c869010Y7f.LJIIIIZZ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c869010Y7f.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c869010Y7f.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(MessagesPerUserInitV2RequestBody messagesPerUserInitV2RequestBody) {
            MessagesPerUserInitV2RequestBody messagesPerUserInitV2RequestBody2 = messagesPerUserInitV2RequestBody;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, messagesPerUserInitV2RequestBody2.cursor);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, messagesPerUserInitV2RequestBody2.new_user) + protoAdapter2.encodedSizeWithTag(3, messagesPerUserInitV2RequestBody2.init_sub_type) + ProtoAdapter.BOOL.encodedSizeWithTag(4, messagesPerUserInitV2RequestBody2.with_empty_conv) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(5, messagesPerUserInitV2RequestBody2.siderank_keys) + protoAdapter.encodedSizeWithTag(6, messagesPerUserInitV2RequestBody2.priority_chain_cursor) + messagesPerUserInitV2RequestBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, MessagesPerUserInitV2RequestBody messagesPerUserInitV2RequestBody) {
            MessagesPerUserInitV2RequestBody messagesPerUserInitV2RequestBody2 = messagesPerUserInitV2RequestBody;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, messagesPerUserInitV2RequestBody2.cursor);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            protoAdapter2.encodeWithTag(protoWriter, 2, messagesPerUserInitV2RequestBody2.new_user);
            protoAdapter2.encodeWithTag(protoWriter, 3, messagesPerUserInitV2RequestBody2.init_sub_type);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, messagesPerUserInitV2RequestBody2.with_empty_conv);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 5, messagesPerUserInitV2RequestBody2.siderank_keys);
            protoAdapter.encodeWithTag(protoWriter, 6, messagesPerUserInitV2RequestBody2.priority_chain_cursor);
            protoWriter.writeBytes(messagesPerUserInitV2RequestBody2.unknownFields());
        }
    };
    public static final Long DEFAULT_CURSOR = 0L;
    public static final Integer DEFAULT_NEW_USER = 0;
    public static final Integer DEFAULT_INIT_SUB_TYPE = 0;
    public static final Boolean DEFAULT_WITH_EMPTY_CONV = Boolean.FALSE;
    public static final Long DEFAULT_PRIORITY_CHAIN_CURSOR = 0L;

    @Override // com.squareup.wire.Message
    public C869010Y7f newBuilder() {
        C869010Y7f c869010Y7f = new C869010Y7f();
        c869010Y7f.LIZLLL = this.cursor;
        c869010Y7f.LJ = this.new_user;
        c869010Y7f.LJFF = this.init_sub_type;
        c869010Y7f.LJI = this.with_empty_conv;
        c869010Y7f.LJII = C1516540pZE.LIZJ("siderank_keys", this.siderank_keys);
        c869010Y7f.LJIIIIZZ = this.priority_chain_cursor;
        c869010Y7f.addUnknownFields(unknownFields());
        return c869010Y7f;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.cursor != null) {
            sb.append(", cursor=");
            sb.append(this.cursor);
        }
        if (this.new_user != null) {
            sb.append(", new_user=");
            sb.append(this.new_user);
        }
        if (this.init_sub_type != null) {
            sb.append(", init_sub_type=");
            sb.append(this.init_sub_type);
        }
        if (this.with_empty_conv != null) {
            sb.append(", with_empty_conv=");
            sb.append(this.with_empty_conv);
        }
        List<String> list = this.siderank_keys;
        if (list != null && !list.isEmpty()) {
            sb.append(", siderank_keys=");
            sb.append(this.siderank_keys);
        }
        if (this.priority_chain_cursor != null) {
            sb.append(", priority_chain_cursor=");
            sb.append(this.priority_chain_cursor);
        }
        sb.replace(0, 2, "MessagesPerUserInitV2RequestBody{");
        sb.append('}');
        return sb.toString();
    }

    public MessagesPerUserInitV2RequestBody(Long l, Integer num, Integer num2, Boolean bool, List<String> list, Long l2) {
        this(l, num, num2, bool, list, l2, ByteString.EMPTY);
    }

    public MessagesPerUserInitV2RequestBody(Long l, Integer num, Integer num2, Boolean bool, List<String> list, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.cursor = l;
        this.new_user = num;
        this.init_sub_type = num2;
        this.with_empty_conv = bool;
        this.siderank_keys = C1516540pZE.LJFF("siderank_keys", list);
        this.priority_chain_cursor = l2;
    }
}
