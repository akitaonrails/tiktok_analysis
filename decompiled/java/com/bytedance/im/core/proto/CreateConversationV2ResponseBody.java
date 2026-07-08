package com.bytedance.im.core.proto;

import X.C09CT;
import X.C875450YVz;
import com.bytedance.im.core.proto.ConversationInfoV2;
import com.bytedance.im.core.proto.CreateConversationV2ResponseBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class CreateConversationV2ResponseBody extends Message<CreateConversationV2ResponseBody, C875450YVz> {
    public static final long serialVersionUID = 0;

    @C09CT("check_code")
    public final Long check_code;

    @C09CT("check_message")
    public final String check_message;

    @C09CT("conversation")
    public final ConversationInfoV2 conversation;

    @C09CT("extra_info")
    public final String extra_info;

    @C09CT("is_existed")
    public final Boolean is_existed;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final Integer status;
    public static final ProtoAdapter<CreateConversationV2ResponseBody> ADAPTER = new ProtoAdapter<CreateConversationV2ResponseBody>() { // from class: X.0YVy
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final CreateConversationV2ResponseBody decode(ProtoReader protoReader) {
            C875450YVz c875450YVz = new C875450YVz();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c875450YVz.LIZLLL = ConversationInfoV2.ADAPTER.decode(protoReader);
                            break;
                        case 2:
                            c875450YVz.LJ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 3:
                            c875450YVz.LJFF = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c875450YVz.LJI = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c875450YVz.LJII = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 6:
                            c875450YVz.LJIIIIZZ = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c875450YVz.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c875450YVz.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(CreateConversationV2ResponseBody createConversationV2ResponseBody) {
            CreateConversationV2ResponseBody createConversationV2ResponseBody2 = createConversationV2ResponseBody;
            int iEncodedSizeWithTag = ConversationInfoV2.ADAPTER.encodedSizeWithTag(1, createConversationV2ResponseBody2.conversation) + ProtoAdapter.INT64.encodedSizeWithTag(2, createConversationV2ResponseBody2.check_code);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(3, createConversationV2ResponseBody2.check_message) + protoAdapter.encodedSizeWithTag(4, createConversationV2ResponseBody2.extra_info) + ProtoAdapter.INT32.encodedSizeWithTag(5, createConversationV2ResponseBody2.status) + ProtoAdapter.BOOL.encodedSizeWithTag(6, createConversationV2ResponseBody2.is_existed) + createConversationV2ResponseBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, CreateConversationV2ResponseBody createConversationV2ResponseBody) {
            CreateConversationV2ResponseBody createConversationV2ResponseBody2 = createConversationV2ResponseBody;
            ConversationInfoV2.ADAPTER.encodeWithTag(protoWriter, 1, createConversationV2ResponseBody2.conversation);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, createConversationV2ResponseBody2.check_code);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 3, createConversationV2ResponseBody2.check_message);
            protoAdapter.encodeWithTag(protoWriter, 4, createConversationV2ResponseBody2.extra_info);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, createConversationV2ResponseBody2.status);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, createConversationV2ResponseBody2.is_existed);
            protoWriter.writeBytes(createConversationV2ResponseBody2.unknownFields());
        }
    };
    public static final Long DEFAULT_CHECK_CODE = 0L;
    public static final Integer DEFAULT_STATUS = 0;
    public static final Boolean DEFAULT_IS_EXISTED = Boolean.FALSE;

    @Override // com.squareup.wire.Message
    public C875450YVz newBuilder() {
        C875450YVz c875450YVz = new C875450YVz();
        c875450YVz.LIZLLL = this.conversation;
        c875450YVz.LJ = this.check_code;
        c875450YVz.LJFF = this.check_message;
        c875450YVz.LJI = this.extra_info;
        c875450YVz.LJII = this.status;
        c875450YVz.LJIIIIZZ = this.is_existed;
        c875450YVz.addUnknownFields(unknownFields());
        return c875450YVz;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.conversation != null) {
            sb.append(", conversation=");
            sb.append(this.conversation);
        }
        if (this.check_code != null) {
            sb.append(", check_code=");
            sb.append(this.check_code);
        }
        if (this.check_message != null) {
            sb.append(", check_message=");
            sb.append(this.check_message);
        }
        if (this.extra_info != null) {
            sb.append(", extra_info=");
            sb.append(this.extra_info);
        }
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        if (this.is_existed != null) {
            sb.append(", is_existed=");
            sb.append(this.is_existed);
        }
        sb.replace(0, 2, "CreateConversationV2ResponseBody{");
        sb.append('}');
        return sb.toString();
    }

    public CreateConversationV2ResponseBody(ConversationInfoV2 conversationInfoV2, Long l, String str, String str2, Integer num, Boolean bool) {
        this(conversationInfoV2, l, str, str2, num, bool, ByteString.EMPTY);
    }

    public CreateConversationV2ResponseBody(ConversationInfoV2 conversationInfoV2, Long l, String str, String str2, Integer num, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation = conversationInfoV2;
        this.check_code = l;
        this.check_message = str;
        this.extra_info = str2;
        this.status = num;
        this.is_existed = bool;
    }
}
