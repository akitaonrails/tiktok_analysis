package com.bytedance.im.core.proto;

import X.C09CT;
import X.C1516540pZE;
import X.C2239591ClB;
import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.PreviewerMessagesInConversationResponseBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class PreviewerMessagesInConversationResponseBody extends Message<PreviewerMessagesInConversationResponseBody, C2239591ClB> {
    public static final long serialVersionUID = 0;

    @C09CT("check_code")
    public final Long check_code;

    @C09CT("check_message")
    public final String check_message;

    @C09CT("has_more")
    public final Boolean has_more;

    @C09CT("messages")
    public final List<MessageBody> messages;

    @C09CT("next_cursor")
    public final Long next_cursor;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final Integer status;
    public static final ProtoAdapter<PreviewerMessagesInConversationResponseBody> ADAPTER = new ProtoAdapter<PreviewerMessagesInConversationResponseBody>() { // from class: X.1ClA
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final PreviewerMessagesInConversationResponseBody decode(ProtoReader protoReader) {
            C2239591ClB c2239591ClB = new C2239591ClB();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c2239591ClB.LIZLLL.add(MessageBody.ADAPTER.decode(protoReader));
                            break;
                        case 2:
                            c2239591ClB.LJ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 3:
                            c2239591ClB.LJFF = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 4:
                            c2239591ClB.LJI = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 5:
                            c2239591ClB.LJII = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 6:
                            c2239591ClB.LJIIIIZZ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2239591ClB.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2239591ClB.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(PreviewerMessagesInConversationResponseBody previewerMessagesInConversationResponseBody) {
            PreviewerMessagesInConversationResponseBody previewerMessagesInConversationResponseBody2 = previewerMessagesInConversationResponseBody;
            int iEncodedSizeWithTag = MessageBody.ADAPTER.asRepeated().encodedSizeWithTag(1, previewerMessagesInConversationResponseBody2.messages);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, previewerMessagesInConversationResponseBody2.next_cursor) + ProtoAdapter.BOOL.encodedSizeWithTag(3, previewerMessagesInConversationResponseBody2.has_more) + ProtoAdapter.INT32.encodedSizeWithTag(4, previewerMessagesInConversationResponseBody2.status) + protoAdapter.encodedSizeWithTag(5, previewerMessagesInConversationResponseBody2.check_code) + ProtoAdapter.STRING.encodedSizeWithTag(6, previewerMessagesInConversationResponseBody2.check_message) + previewerMessagesInConversationResponseBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, PreviewerMessagesInConversationResponseBody previewerMessagesInConversationResponseBody) {
            PreviewerMessagesInConversationResponseBody previewerMessagesInConversationResponseBody2 = previewerMessagesInConversationResponseBody;
            MessageBody.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, previewerMessagesInConversationResponseBody2.messages);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 2, previewerMessagesInConversationResponseBody2.next_cursor);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, previewerMessagesInConversationResponseBody2.has_more);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, previewerMessagesInConversationResponseBody2.status);
            protoAdapter.encodeWithTag(protoWriter, 5, previewerMessagesInConversationResponseBody2.check_code);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, previewerMessagesInConversationResponseBody2.check_message);
            protoWriter.writeBytes(previewerMessagesInConversationResponseBody2.unknownFields());
        }
    };
    public static final Long DEFAULT_NEXT_CURSOR = 0L;
    public static final Boolean DEFAULT_HAS_MORE = Boolean.FALSE;
    public static final Integer DEFAULT_STATUS = 0;
    public static final Long DEFAULT_CHECK_CODE = 0L;

    @Override // com.squareup.wire.Message
    public C2239591ClB newBuilder() {
        C2239591ClB c2239591ClB = new C2239591ClB();
        c2239591ClB.LIZLLL = C1516540pZE.LIZJ("messages", this.messages);
        c2239591ClB.LJ = this.next_cursor;
        c2239591ClB.LJFF = this.has_more;
        c2239591ClB.LJI = this.status;
        c2239591ClB.LJII = this.check_code;
        c2239591ClB.LJIIIIZZ = this.check_message;
        c2239591ClB.addUnknownFields(unknownFields());
        return c2239591ClB;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<MessageBody> list = this.messages;
        if (list != null && !list.isEmpty()) {
            sb.append(", messages=");
            sb.append(this.messages);
        }
        if (this.next_cursor != null) {
            sb.append(", next_cursor=");
            sb.append(this.next_cursor);
        }
        if (this.has_more != null) {
            sb.append(", has_more=");
            sb.append(this.has_more);
        }
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        if (this.check_code != null) {
            sb.append(", check_code=");
            sb.append(this.check_code);
        }
        if (this.check_message != null) {
            sb.append(", check_message=");
            sb.append(this.check_message);
        }
        sb.replace(0, 2, "PreviewerMessagesInConversationResponseBody{");
        sb.append('}');
        return sb.toString();
    }

    public PreviewerMessagesInConversationResponseBody(List<MessageBody> list, Long l, Boolean bool, Integer num, Long l2, String str) {
        this(list, l, bool, num, l2, str, ByteString.EMPTY);
    }

    public PreviewerMessagesInConversationResponseBody(List<MessageBody> list, Long l, Boolean bool, Integer num, Long l2, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.messages = C1516540pZE.LJFF("messages", list);
        this.next_cursor = l;
        this.has_more = bool;
        this.status = num;
        this.check_code = l2;
        this.check_message = str;
    }
}
