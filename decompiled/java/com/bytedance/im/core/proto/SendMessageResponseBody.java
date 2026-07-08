package com.bytedance.im.core.proto;

import X.C09CT;
import X.C0ZCX;
import X.C0ZE2;
import X.EnumC895750ZCb;
import com.bytedance.im.core.proto.ConversationInfoV2;
import com.bytedance.im.core.proto.SendMessageResponseBody;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class SendMessageResponseBody extends Message<SendMessageResponseBody, C0ZE2> {
    public static final long serialVersionUID = 0;

    @C09CT("check_code")
    public final Long check_code;

    @C09CT("check_message")
    public final String check_message;

    @C09CT("client_message_id")
    public final String client_message_id;

    @C09CT("conversation")
    public final ConversationInfoV2 conversation;

    @C09CT("extra_info")
    public final String extra_info;

    @C09CT("filter_reason")
    public final C0ZCX filter_reason;

    @C09CT("filtered_content")
    public final String filtered_content;

    @C09CT("inboxPageCategory")
    public final EnumC895750ZCb inboxPageCategory;

    @C09CT("is_async_send")
    public final Boolean is_async_send;

    @C09CT("new_ticket")
    public final String new_ticket;

    @C09CT("server_message_id")
    public final Long server_message_id;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final Integer status;
    public static final ProtoAdapter<SendMessageResponseBody> ADAPTER = new ProtoAdapter<SendMessageResponseBody>() { // from class: X.0ZE1
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final SendMessageResponseBody decode(ProtoReader protoReader) {
            C0ZE2 c0ze2 = new C0ZE2();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c0ze2.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 2:
                            c0ze2.LJ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c0ze2.LJFF = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            c0ze2.LJI = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c0ze2.LJII = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 6:
                            c0ze2.LJIIIIZZ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            c0ze2.LJIIIZ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            c0ze2.LJIIJ = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c0ze2.LJIIJJI = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c0ze2.LJIIL = ConversationInfoV2.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c0ze2.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            try {
                                c0ze2.LJIILIIL = EnumC895750ZCb.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c0ze2.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            try {
                                c0ze2.LJIILJJIL = C0ZCX.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                TryCatchGuardChecker.doCheck(e2);
                                c0ze2.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                            }
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c0ze2.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(SendMessageResponseBody sendMessageResponseBody) {
            SendMessageResponseBody sendMessageResponseBody2 = sendMessageResponseBody;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, sendMessageResponseBody2.server_message_id);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, sendMessageResponseBody2.extra_info) + ProtoAdapter.INT32.encodedSizeWithTag(3, sendMessageResponseBody2.status) + protoAdapter2.encodedSizeWithTag(4, sendMessageResponseBody2.client_message_id) + protoAdapter.encodedSizeWithTag(5, sendMessageResponseBody2.check_code) + protoAdapter2.encodedSizeWithTag(6, sendMessageResponseBody2.check_message) + protoAdapter2.encodedSizeWithTag(7, sendMessageResponseBody2.filtered_content) + ProtoAdapter.BOOL.encodedSizeWithTag(8, sendMessageResponseBody2.is_async_send) + protoAdapter2.encodedSizeWithTag(9, sendMessageResponseBody2.new_ticket) + ConversationInfoV2.ADAPTER.encodedSizeWithTag(10, sendMessageResponseBody2.conversation) + EnumC895750ZCb.ADAPTER.encodedSizeWithTag(12, sendMessageResponseBody2.inboxPageCategory) + C0ZCX.ADAPTER.encodedSizeWithTag(13, sendMessageResponseBody2.filter_reason) + sendMessageResponseBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, SendMessageResponseBody sendMessageResponseBody) {
            SendMessageResponseBody sendMessageResponseBody2 = sendMessageResponseBody;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, sendMessageResponseBody2.server_message_id);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            protoAdapter2.encodeWithTag(protoWriter, 2, sendMessageResponseBody2.extra_info);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, sendMessageResponseBody2.status);
            protoAdapter2.encodeWithTag(protoWriter, 4, sendMessageResponseBody2.client_message_id);
            protoAdapter.encodeWithTag(protoWriter, 5, sendMessageResponseBody2.check_code);
            protoAdapter2.encodeWithTag(protoWriter, 6, sendMessageResponseBody2.check_message);
            protoAdapter2.encodeWithTag(protoWriter, 7, sendMessageResponseBody2.filtered_content);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 8, sendMessageResponseBody2.is_async_send);
            protoAdapter2.encodeWithTag(protoWriter, 9, sendMessageResponseBody2.new_ticket);
            ConversationInfoV2.ADAPTER.encodeWithTag(protoWriter, 10, sendMessageResponseBody2.conversation);
            EnumC895750ZCb.ADAPTER.encodeWithTag(protoWriter, 12, sendMessageResponseBody2.inboxPageCategory);
            C0ZCX.ADAPTER.encodeWithTag(protoWriter, 13, sendMessageResponseBody2.filter_reason);
            protoWriter.writeBytes(sendMessageResponseBody2.unknownFields());
        }
    };
    public static final Long DEFAULT_SERVER_MESSAGE_ID = 0L;
    public static final Integer DEFAULT_STATUS = 0;
    public static final Long DEFAULT_CHECK_CODE = 0L;
    public static final Boolean DEFAULT_IS_ASYNC_SEND = Boolean.FALSE;
    public static final EnumC895750ZCb DEFAULT_INBOXPAGECATEGORY = EnumC895750ZCb.NormalUserInbox;
    public static final C0ZCX DEFAULT_FILTER_REASON = C0ZCX.FilteredReasonNone;

    @Override // com.squareup.wire.Message
    public C0ZE2 newBuilder() {
        C0ZE2 c0ze2 = new C0ZE2();
        c0ze2.LIZLLL = this.server_message_id;
        c0ze2.LJ = this.extra_info;
        c0ze2.LJFF = this.status;
        c0ze2.LJI = this.client_message_id;
        c0ze2.LJII = this.check_code;
        c0ze2.LJIIIIZZ = this.check_message;
        c0ze2.LJIIIZ = this.filtered_content;
        c0ze2.LJIIJ = this.is_async_send;
        c0ze2.LJIIJJI = this.new_ticket;
        c0ze2.LJIIL = this.conversation;
        c0ze2.LJIILIIL = this.inboxPageCategory;
        c0ze2.LJIILJJIL = this.filter_reason;
        c0ze2.addUnknownFields(unknownFields());
        return c0ze2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.server_message_id != null) {
            sb.append(", server_message_id=");
            sb.append(this.server_message_id);
        }
        if (this.extra_info != null) {
            sb.append(", extra_info=");
            sb.append(this.extra_info);
        }
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        if (this.client_message_id != null) {
            sb.append(", client_message_id=");
            sb.append(this.client_message_id);
        }
        if (this.check_code != null) {
            sb.append(", check_code=");
            sb.append(this.check_code);
        }
        if (this.check_message != null) {
            sb.append(", check_message=");
            sb.append(this.check_message);
        }
        if (this.filtered_content != null) {
            sb.append(", filtered_content=");
            sb.append(this.filtered_content);
        }
        if (this.is_async_send != null) {
            sb.append(", is_async_send=");
            sb.append(this.is_async_send);
        }
        if (this.new_ticket != null) {
            sb.append(", new_ticket=");
            sb.append(this.new_ticket);
        }
        if (this.conversation != null) {
            sb.append(", conversation=");
            sb.append(this.conversation);
        }
        if (this.inboxPageCategory != null) {
            sb.append(", inboxPageCategory=");
            sb.append(this.inboxPageCategory);
        }
        if (this.filter_reason != null) {
            sb.append(", filter_reason=");
            sb.append(this.filter_reason);
        }
        sb.replace(0, 2, "SendMessageResponseBody{");
        sb.append('}');
        return sb.toString();
    }

    public SendMessageResponseBody(Long l, String str, Integer num, String str2, Long l2, String str3, String str4, Boolean bool, String str5, ConversationInfoV2 conversationInfoV2, EnumC895750ZCb enumC895750ZCb, C0ZCX c0zcx) {
        this(l, str, num, str2, l2, str3, str4, bool, str5, conversationInfoV2, enumC895750ZCb, c0zcx, ByteString.EMPTY);
    }

    public SendMessageResponseBody(Long l, String str, Integer num, String str2, Long l2, String str3, String str4, Boolean bool, String str5, ConversationInfoV2 conversationInfoV2, EnumC895750ZCb enumC895750ZCb, C0ZCX c0zcx, ByteString byteString) {
        super(ADAPTER, byteString);
        this.server_message_id = l;
        this.extra_info = str;
        this.status = num;
        this.client_message_id = str2;
        this.check_code = l2;
        this.check_message = str3;
        this.filtered_content = str4;
        this.is_async_send = bool;
        this.new_ticket = str5;
        this.conversation = conversationInfoV2;
        this.inboxPageCategory = enumC895750ZCb;
        this.filter_reason = c0zcx;
    }
}
