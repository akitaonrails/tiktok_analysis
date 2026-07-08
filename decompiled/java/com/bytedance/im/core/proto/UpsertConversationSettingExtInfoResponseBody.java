package com.bytedance.im.core.proto;

import X.C09CT;
import X.C0YV6;
import com.bytedance.im.core.proto.ConversationSettingInfo;
import com.bytedance.im.core.proto.UpsertConversationSettingExtInfoResponseBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class UpsertConversationSettingExtInfoResponseBody extends Message<UpsertConversationSettingExtInfoResponseBody, C0YV6> {
    public static final long serialVersionUID = 0;

    @C09CT("check_code")
    public final Long check_code;

    @C09CT("check_message")
    public final String check_message;

    @C09CT("extra_info")
    public final String extra_info;

    @C09CT("setting_info")
    public final ConversationSettingInfo setting_info;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final Integer status;
    public static final ProtoAdapter<UpsertConversationSettingExtInfoResponseBody> ADAPTER = new ProtoAdapter<UpsertConversationSettingExtInfoResponseBody>() { // from class: X.0YV5
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final UpsertConversationSettingExtInfoResponseBody decode(ProtoReader protoReader) {
            C0YV6 c0yv6 = new C0YV6();
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
                                        c0yv6.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                    } else {
                                        c0yv6.LJII = ProtoAdapter.STRING.decode(protoReader);
                                    }
                                } else {
                                    c0yv6.LJI = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c0yv6.LJFF = ProtoAdapter.INT64.decode(protoReader);
                            }
                        } else {
                            c0yv6.LJ = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c0yv6.LIZLLL = ConversationSettingInfo.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c0yv6.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(UpsertConversationSettingExtInfoResponseBody upsertConversationSettingExtInfoResponseBody) {
            UpsertConversationSettingExtInfoResponseBody upsertConversationSettingExtInfoResponseBody2 = upsertConversationSettingExtInfoResponseBody;
            int iEncodedSizeWithTag = ConversationSettingInfo.ADAPTER.encodedSizeWithTag(1, upsertConversationSettingExtInfoResponseBody2.setting_info) + ProtoAdapter.INT32.encodedSizeWithTag(2, upsertConversationSettingExtInfoResponseBody2.status) + ProtoAdapter.INT64.encodedSizeWithTag(3, upsertConversationSettingExtInfoResponseBody2.check_code);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(4, upsertConversationSettingExtInfoResponseBody2.check_message) + protoAdapter.encodedSizeWithTag(5, upsertConversationSettingExtInfoResponseBody2.extra_info) + upsertConversationSettingExtInfoResponseBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, UpsertConversationSettingExtInfoResponseBody upsertConversationSettingExtInfoResponseBody) {
            UpsertConversationSettingExtInfoResponseBody upsertConversationSettingExtInfoResponseBody2 = upsertConversationSettingExtInfoResponseBody;
            ConversationSettingInfo.ADAPTER.encodeWithTag(protoWriter, 1, upsertConversationSettingExtInfoResponseBody2.setting_info);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, upsertConversationSettingExtInfoResponseBody2.status);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, upsertConversationSettingExtInfoResponseBody2.check_code);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 4, upsertConversationSettingExtInfoResponseBody2.check_message);
            protoAdapter.encodeWithTag(protoWriter, 5, upsertConversationSettingExtInfoResponseBody2.extra_info);
            protoWriter.writeBytes(upsertConversationSettingExtInfoResponseBody2.unknownFields());
        }
    };
    public static final Integer DEFAULT_STATUS = 0;
    public static final Long DEFAULT_CHECK_CODE = 0L;

    @Override // com.squareup.wire.Message
    public C0YV6 newBuilder() {
        C0YV6 c0yv6 = new C0YV6();
        c0yv6.LIZLLL = this.setting_info;
        c0yv6.LJ = this.status;
        c0yv6.LJFF = this.check_code;
        c0yv6.LJI = this.check_message;
        c0yv6.LJII = this.extra_info;
        c0yv6.addUnknownFields(unknownFields());
        return c0yv6;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.setting_info != null) {
            sb.append(", setting_info=");
            sb.append(this.setting_info);
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
        sb.replace(0, 2, "UpsertConversationSettingExtInfoResponseBody{");
        sb.append('}');
        return sb.toString();
    }

    public UpsertConversationSettingExtInfoResponseBody(ConversationSettingInfo conversationSettingInfo, Integer num, Long l, String str, String str2) {
        this(conversationSettingInfo, num, l, str, str2, ByteString.EMPTY);
    }

    public UpsertConversationSettingExtInfoResponseBody(ConversationSettingInfo conversationSettingInfo, Integer num, Long l, String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.setting_info = conversationSettingInfo;
        this.status = num;
        this.check_code = l;
        this.check_message = str;
        this.extra_info = str2;
    }
}
