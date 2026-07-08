package com.bytedance.im.core.proto;

import X.C09CT;
import X.C0YV2;
import com.bytedance.im.core.proto.ConversationSettingInfo;
import com.bytedance.im.core.proto.SetConversationSettingInfoResponseBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class SetConversationSettingInfoResponseBody extends Message<SetConversationSettingInfoResponseBody, C0YV2> {
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
    public static final ProtoAdapter<SetConversationSettingInfoResponseBody> ADAPTER = new ProtoAdapter<SetConversationSettingInfoResponseBody>() { // from class: X.0YV1
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final SetConversationSettingInfoResponseBody decode(ProtoReader protoReader) {
            C0YV2 c0yv2 = new C0YV2();
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
                                        c0yv2.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                    } else {
                                        c0yv2.LJII = ProtoAdapter.STRING.decode(protoReader);
                                    }
                                } else {
                                    c0yv2.LJI = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c0yv2.LJFF = ProtoAdapter.INT64.decode(protoReader);
                            }
                        } else {
                            c0yv2.LJ = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c0yv2.LIZLLL = ConversationSettingInfo.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c0yv2.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(SetConversationSettingInfoResponseBody setConversationSettingInfoResponseBody) {
            SetConversationSettingInfoResponseBody setConversationSettingInfoResponseBody2 = setConversationSettingInfoResponseBody;
            int iEncodedSizeWithTag = ConversationSettingInfo.ADAPTER.encodedSizeWithTag(1, setConversationSettingInfoResponseBody2.setting_info) + ProtoAdapter.INT32.encodedSizeWithTag(2, setConversationSettingInfoResponseBody2.status) + ProtoAdapter.INT64.encodedSizeWithTag(3, setConversationSettingInfoResponseBody2.check_code);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(4, setConversationSettingInfoResponseBody2.check_message) + protoAdapter.encodedSizeWithTag(5, setConversationSettingInfoResponseBody2.extra_info) + setConversationSettingInfoResponseBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, SetConversationSettingInfoResponseBody setConversationSettingInfoResponseBody) {
            SetConversationSettingInfoResponseBody setConversationSettingInfoResponseBody2 = setConversationSettingInfoResponseBody;
            ConversationSettingInfo.ADAPTER.encodeWithTag(protoWriter, 1, setConversationSettingInfoResponseBody2.setting_info);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, setConversationSettingInfoResponseBody2.status);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, setConversationSettingInfoResponseBody2.check_code);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 4, setConversationSettingInfoResponseBody2.check_message);
            protoAdapter.encodeWithTag(protoWriter, 5, setConversationSettingInfoResponseBody2.extra_info);
            protoWriter.writeBytes(setConversationSettingInfoResponseBody2.unknownFields());
        }
    };
    public static final Integer DEFAULT_STATUS = 0;
    public static final Long DEFAULT_CHECK_CODE = 0L;

    @Override // com.squareup.wire.Message
    public C0YV2 newBuilder() {
        C0YV2 c0yv2 = new C0YV2();
        c0yv2.LIZLLL = this.setting_info;
        c0yv2.LJ = this.status;
        c0yv2.LJFF = this.check_code;
        c0yv2.LJI = this.check_message;
        c0yv2.LJII = this.extra_info;
        c0yv2.addUnknownFields(unknownFields());
        return c0yv2;
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
        sb.replace(0, 2, "SetConversationSettingInfoResponseBody{");
        sb.append('}');
        return sb.toString();
    }

    public SetConversationSettingInfoResponseBody(ConversationSettingInfo conversationSettingInfo, Integer num, Long l, String str, String str2) {
        this(conversationSettingInfo, num, l, str, str2, ByteString.EMPTY);
    }

    public SetConversationSettingInfoResponseBody(ConversationSettingInfo conversationSettingInfo, Integer num, Long l, String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.setting_info = conversationSettingInfo;
        this.status = num;
        this.check_code = l;
        this.check_message = str;
        this.extra_info = str2;
    }
}
