package com.bytedance.im.core.proto;

import X.C09CT;
import X.C0YV4;
import com.bytedance.im.core.proto.ConversationCoreInfo;
import com.bytedance.im.core.proto.SetConversationCoreInfoResponseBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class SetConversationCoreInfoResponseBody extends Message<SetConversationCoreInfoResponseBody, C0YV4> {
    public static final long serialVersionUID = 0;

    @C09CT("check_code")
    public final Long check_code;

    @C09CT("check_message")
    public final String check_message;

    @C09CT("conversation_core_info")
    public final ConversationCoreInfo conversation_core_info;

    @C09CT("extra_info")
    public final String extra_info;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final Integer status;
    public static final ProtoAdapter<SetConversationCoreInfoResponseBody> ADAPTER = new ProtoAdapter<SetConversationCoreInfoResponseBody>() { // from class: X.0YV3
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final SetConversationCoreInfoResponseBody decode(ProtoReader protoReader) {
            C0YV4 c0yv4 = new C0YV4();
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
                                        c0yv4.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                    } else {
                                        c0yv4.LJII = ProtoAdapter.STRING.decode(protoReader);
                                    }
                                } else {
                                    c0yv4.LJI = ProtoAdapter.INT64.decode(protoReader);
                                }
                            } else {
                                c0yv4.LJFF = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c0yv4.LJ = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c0yv4.LIZLLL = ConversationCoreInfo.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c0yv4.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(SetConversationCoreInfoResponseBody setConversationCoreInfoResponseBody) {
            SetConversationCoreInfoResponseBody setConversationCoreInfoResponseBody2 = setConversationCoreInfoResponseBody;
            int iEncodedSizeWithTag = ConversationCoreInfo.ADAPTER.encodedSizeWithTag(1, setConversationCoreInfoResponseBody2.conversation_core_info) + ProtoAdapter.INT32.encodedSizeWithTag(2, setConversationCoreInfoResponseBody2.status);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(3, setConversationCoreInfoResponseBody2.extra_info) + ProtoAdapter.INT64.encodedSizeWithTag(4, setConversationCoreInfoResponseBody2.check_code) + protoAdapter.encodedSizeWithTag(5, setConversationCoreInfoResponseBody2.check_message) + setConversationCoreInfoResponseBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, SetConversationCoreInfoResponseBody setConversationCoreInfoResponseBody) {
            SetConversationCoreInfoResponseBody setConversationCoreInfoResponseBody2 = setConversationCoreInfoResponseBody;
            ConversationCoreInfo.ADAPTER.encodeWithTag(protoWriter, 1, setConversationCoreInfoResponseBody2.conversation_core_info);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, setConversationCoreInfoResponseBody2.status);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 3, setConversationCoreInfoResponseBody2.extra_info);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, setConversationCoreInfoResponseBody2.check_code);
            protoAdapter.encodeWithTag(protoWriter, 5, setConversationCoreInfoResponseBody2.check_message);
            protoWriter.writeBytes(setConversationCoreInfoResponseBody2.unknownFields());
        }
    };
    public static final Integer DEFAULT_STATUS = 0;
    public static final Long DEFAULT_CHECK_CODE = 0L;

    @Override // com.squareup.wire.Message
    public C0YV4 newBuilder() {
        C0YV4 c0yv4 = new C0YV4();
        c0yv4.LIZLLL = this.conversation_core_info;
        c0yv4.LJ = this.status;
        c0yv4.LJFF = this.extra_info;
        c0yv4.LJI = this.check_code;
        c0yv4.LJII = this.check_message;
        c0yv4.addUnknownFields(unknownFields());
        return c0yv4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.conversation_core_info != null) {
            sb.append(", conversation_core_info=");
            sb.append(this.conversation_core_info);
        }
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        if (this.extra_info != null) {
            sb.append(", extra_info=");
            sb.append(this.extra_info);
        }
        if (this.check_code != null) {
            sb.append(", check_code=");
            sb.append(this.check_code);
        }
        if (this.check_message != null) {
            sb.append(", check_message=");
            sb.append(this.check_message);
        }
        sb.replace(0, 2, "SetConversationCoreInfoResponseBody{");
        sb.append('}');
        return sb.toString();
    }

    public SetConversationCoreInfoResponseBody(ConversationCoreInfo conversationCoreInfo, Integer num, String str, Long l, String str2) {
        this(conversationCoreInfo, num, str, l, str2, ByteString.EMPTY);
    }

    public SetConversationCoreInfoResponseBody(ConversationCoreInfo conversationCoreInfo, Integer num, String str, Long l, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_core_info = conversationCoreInfo;
        this.status = num;
        this.extra_info = str;
        this.check_code = l;
        this.check_message = str2;
    }
}
