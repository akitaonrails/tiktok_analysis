package com.bytedance.im.core.proto;

import X.C09CT;
import X.C0YV8;
import com.bytedance.im.core.proto.ConversationCoreInfo;
import com.bytedance.im.core.proto.UpsertConversationCoreExtInfoResponseBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class UpsertConversationCoreExtInfoResponseBody extends Message<UpsertConversationCoreExtInfoResponseBody, C0YV8> {
    public static final long serialVersionUID = 0;

    @C09CT("check_code")
    public final Long check_code;

    @C09CT("check_message")
    public final String check_message;

    @C09CT("core_info")
    public final ConversationCoreInfo core_info;

    @C09CT("extra_info")
    public final String extra_info;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final Integer status;
    public static final ProtoAdapter<UpsertConversationCoreExtInfoResponseBody> ADAPTER = new ProtoAdapter<UpsertConversationCoreExtInfoResponseBody>() { // from class: X.0YV7
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final UpsertConversationCoreExtInfoResponseBody decode(ProtoReader protoReader) {
            C0YV8 c0yv8 = new C0YV8();
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
                                        c0yv8.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                    } else {
                                        c0yv8.LJII = ProtoAdapter.STRING.decode(protoReader);
                                    }
                                } else {
                                    c0yv8.LJI = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c0yv8.LJFF = ProtoAdapter.INT64.decode(protoReader);
                            }
                        } else {
                            c0yv8.LJ = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c0yv8.LIZLLL = ConversationCoreInfo.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c0yv8.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(UpsertConversationCoreExtInfoResponseBody upsertConversationCoreExtInfoResponseBody) {
            UpsertConversationCoreExtInfoResponseBody upsertConversationCoreExtInfoResponseBody2 = upsertConversationCoreExtInfoResponseBody;
            int iEncodedSizeWithTag = ConversationCoreInfo.ADAPTER.encodedSizeWithTag(1, upsertConversationCoreExtInfoResponseBody2.core_info) + ProtoAdapter.INT32.encodedSizeWithTag(2, upsertConversationCoreExtInfoResponseBody2.status) + ProtoAdapter.INT64.encodedSizeWithTag(3, upsertConversationCoreExtInfoResponseBody2.check_code);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(4, upsertConversationCoreExtInfoResponseBody2.check_message) + protoAdapter.encodedSizeWithTag(5, upsertConversationCoreExtInfoResponseBody2.extra_info) + upsertConversationCoreExtInfoResponseBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, UpsertConversationCoreExtInfoResponseBody upsertConversationCoreExtInfoResponseBody) {
            UpsertConversationCoreExtInfoResponseBody upsertConversationCoreExtInfoResponseBody2 = upsertConversationCoreExtInfoResponseBody;
            ConversationCoreInfo.ADAPTER.encodeWithTag(protoWriter, 1, upsertConversationCoreExtInfoResponseBody2.core_info);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, upsertConversationCoreExtInfoResponseBody2.status);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, upsertConversationCoreExtInfoResponseBody2.check_code);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 4, upsertConversationCoreExtInfoResponseBody2.check_message);
            protoAdapter.encodeWithTag(protoWriter, 5, upsertConversationCoreExtInfoResponseBody2.extra_info);
            protoWriter.writeBytes(upsertConversationCoreExtInfoResponseBody2.unknownFields());
        }
    };
    public static final Integer DEFAULT_STATUS = 0;
    public static final Long DEFAULT_CHECK_CODE = 0L;

    @Override // com.squareup.wire.Message
    public C0YV8 newBuilder() {
        C0YV8 c0yv8 = new C0YV8();
        c0yv8.LIZLLL = this.core_info;
        c0yv8.LJ = this.status;
        c0yv8.LJFF = this.check_code;
        c0yv8.LJI = this.check_message;
        c0yv8.LJII = this.extra_info;
        c0yv8.addUnknownFields(unknownFields());
        return c0yv8;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.core_info != null) {
            sb.append(", core_info=");
            sb.append(this.core_info);
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
        if (this.extra_info != null) {
            sb.append(", extra_info=");
            sb.append(this.extra_info);
        }
        sb.replace(0, 2, "UpsertConversationCoreExtInfoResponseBody{");
        sb.append('}');
        return sb.toString();
    }

    public UpsertConversationCoreExtInfoResponseBody(ConversationCoreInfo conversationCoreInfo, Integer num, Long l, String str, String str2) {
        this(conversationCoreInfo, num, l, str, str2, ByteString.EMPTY);
    }

    public UpsertConversationCoreExtInfoResponseBody(ConversationCoreInfo conversationCoreInfo, Integer num, Long l, String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.core_info = conversationCoreInfo;
        this.status = num;
        this.check_code = l;
        this.check_message = str;
        this.extra_info = str2;
    }
}
