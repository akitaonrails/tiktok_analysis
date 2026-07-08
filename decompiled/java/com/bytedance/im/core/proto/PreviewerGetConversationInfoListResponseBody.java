package com.bytedance.im.core.proto;

import X.C09CT;
import X.C0YZR;
import X.C1516540pZE;
import com.bytedance.im.core.proto.ConversationInfoV2;
import com.bytedance.im.core.proto.PreviewerGetConversationInfoListResponseBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class PreviewerGetConversationInfoListResponseBody extends Message<PreviewerGetConversationInfoListResponseBody, C0YZR> {
    public static final long serialVersionUID = 0;

    @C09CT("check_code")
    public final Long check_code;

    @C09CT("check_message")
    public final String check_message;

    @C09CT("conversation_info_list")
    public final List<ConversationInfoV2> conversation_info_list;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final Integer status;
    public static final ProtoAdapter<PreviewerGetConversationInfoListResponseBody> ADAPTER = new ProtoAdapter<PreviewerGetConversationInfoListResponseBody>() { // from class: X.0YZQ
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final PreviewerGetConversationInfoListResponseBody decode(ProtoReader protoReader) {
            C0YZR c0yzr = new C0YZR();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                    c0yzr.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                } else {
                                    c0yzr.LJI = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c0yzr.LJFF = ProtoAdapter.INT64.decode(protoReader);
                            }
                        } else {
                            c0yzr.LJ = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c0yzr.LIZLLL.add(ConversationInfoV2.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c0yzr.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(PreviewerGetConversationInfoListResponseBody previewerGetConversationInfoListResponseBody) {
            PreviewerGetConversationInfoListResponseBody previewerGetConversationInfoListResponseBody2 = previewerGetConversationInfoListResponseBody;
            return ConversationInfoV2.ADAPTER.asRepeated().encodedSizeWithTag(1, previewerGetConversationInfoListResponseBody2.conversation_info_list) + ProtoAdapter.INT32.encodedSizeWithTag(2, previewerGetConversationInfoListResponseBody2.status) + ProtoAdapter.INT64.encodedSizeWithTag(3, previewerGetConversationInfoListResponseBody2.check_code) + ProtoAdapter.STRING.encodedSizeWithTag(4, previewerGetConversationInfoListResponseBody2.check_message) + previewerGetConversationInfoListResponseBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, PreviewerGetConversationInfoListResponseBody previewerGetConversationInfoListResponseBody) {
            PreviewerGetConversationInfoListResponseBody previewerGetConversationInfoListResponseBody2 = previewerGetConversationInfoListResponseBody;
            ConversationInfoV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, previewerGetConversationInfoListResponseBody2.conversation_info_list);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, previewerGetConversationInfoListResponseBody2.status);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, previewerGetConversationInfoListResponseBody2.check_code);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, previewerGetConversationInfoListResponseBody2.check_message);
            protoWriter.writeBytes(previewerGetConversationInfoListResponseBody2.unknownFields());
        }
    };
    public static final Integer DEFAULT_STATUS = 0;
    public static final Long DEFAULT_CHECK_CODE = 0L;

    @Override // com.squareup.wire.Message
    public C0YZR newBuilder() {
        C0YZR c0yzr = new C0YZR();
        c0yzr.LIZLLL = C1516540pZE.LIZJ("conversation_info_list", this.conversation_info_list);
        c0yzr.LJ = this.status;
        c0yzr.LJFF = this.check_code;
        c0yzr.LJI = this.check_message;
        c0yzr.addUnknownFields(unknownFields());
        return c0yzr;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<ConversationInfoV2> list = this.conversation_info_list;
        if (list != null && !list.isEmpty()) {
            sb.append(", conversation_info_list=");
            sb.append(this.conversation_info_list);
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
        sb.replace(0, 2, "PreviewerGetConversationInfoListResponseBody{");
        sb.append('}');
        return sb.toString();
    }

    public PreviewerGetConversationInfoListResponseBody(List<ConversationInfoV2> list, Integer num, Long l, String str) {
        this(list, num, l, str, ByteString.EMPTY);
    }

    public PreviewerGetConversationInfoListResponseBody(List<ConversationInfoV2> list, Integer num, Long l, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_info_list = C1516540pZE.LJFF("conversation_info_list", list);
        this.status = num;
        this.check_code = l;
        this.check_message = str;
    }
}
