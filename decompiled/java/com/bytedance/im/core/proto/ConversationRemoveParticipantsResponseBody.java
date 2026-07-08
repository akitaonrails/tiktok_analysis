package com.bytedance.im.core.proto;

import X.C09CT;
import X.C1516540pZE;
import X.C1DBC;
import com.bytedance.im.core.proto.ConversationRemoveParticipantsResponseBody;
import com.bytedance.im.core.proto.SecUidPair;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes36.dex */
public final class ConversationRemoveParticipantsResponseBody extends Message<ConversationRemoveParticipantsResponseBody, C1DBC> {
    public static final long serialVersionUID = 0;

    @C09CT("check_code")
    public final Long check_code;

    @C09CT("check_message")
    public final String check_message;

    @C09CT("extra_info")
    public final String extra_info;

    @C09CT("failed_participants")
    public final List<Long> failed_participants;

    @C09CT("failed_sec_participants")
    public final List<SecUidPair> failed_sec_participants;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final Integer status;
    public static final ProtoAdapter<ConversationRemoveParticipantsResponseBody> ADAPTER = new ProtoAdapter<ConversationRemoveParticipantsResponseBody>() { // from class: X.1DBB
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final ConversationRemoveParticipantsResponseBody decode(ProtoReader protoReader) {
            C1DBC c1dbc = new C1DBC();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c1dbc.LIZLLL.add(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 2:
                            c1dbc.LJ = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 3:
                            c1dbc.LJFF = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c1dbc.LJI = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 5:
                            c1dbc.LJII = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c1dbc.LJIIIIZZ.add(SecUidPair.ADAPTER.decode(protoReader));
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1dbc.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1dbc.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(ConversationRemoveParticipantsResponseBody conversationRemoveParticipantsResponseBody) {
            ConversationRemoveParticipantsResponseBody conversationRemoveParticipantsResponseBody2 = conversationRemoveParticipantsResponseBody;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            int iEncodedSizeWithTag = protoAdapter.asRepeated().encodedSizeWithTag(1, conversationRemoveParticipantsResponseBody2.failed_participants) + ProtoAdapter.INT32.encodedSizeWithTag(2, conversationRemoveParticipantsResponseBody2.status);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(3, conversationRemoveParticipantsResponseBody2.extra_info) + protoAdapter.encodedSizeWithTag(4, conversationRemoveParticipantsResponseBody2.check_code) + protoAdapter2.encodedSizeWithTag(5, conversationRemoveParticipantsResponseBody2.check_message) + SecUidPair.ADAPTER.asRepeated().encodedSizeWithTag(6, conversationRemoveParticipantsResponseBody2.failed_sec_participants) + conversationRemoveParticipantsResponseBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, ConversationRemoveParticipantsResponseBody conversationRemoveParticipantsResponseBody) {
            ConversationRemoveParticipantsResponseBody conversationRemoveParticipantsResponseBody2 = conversationRemoveParticipantsResponseBody;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 1, conversationRemoveParticipantsResponseBody2.failed_participants);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, conversationRemoveParticipantsResponseBody2.status);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            protoAdapter2.encodeWithTag(protoWriter, 3, conversationRemoveParticipantsResponseBody2.extra_info);
            protoAdapter.encodeWithTag(protoWriter, 4, conversationRemoveParticipantsResponseBody2.check_code);
            protoAdapter2.encodeWithTag(protoWriter, 5, conversationRemoveParticipantsResponseBody2.check_message);
            SecUidPair.ADAPTER.asRepeated().encodeWithTag(protoWriter, 6, conversationRemoveParticipantsResponseBody2.failed_sec_participants);
            protoWriter.writeBytes(conversationRemoveParticipantsResponseBody2.unknownFields());
        }
    };
    public static final Integer DEFAULT_STATUS = 0;
    public static final Long DEFAULT_CHECK_CODE = 0L;

    @Override // com.squareup.wire.Message
    public C1DBC newBuilder() {
        C1DBC c1dbc = new C1DBC();
        c1dbc.LIZLLL = C1516540pZE.LIZJ("failed_participants", this.failed_participants);
        c1dbc.LJ = this.status;
        c1dbc.LJFF = this.extra_info;
        c1dbc.LJI = this.check_code;
        c1dbc.LJII = this.check_message;
        c1dbc.LJIIIIZZ = C1516540pZE.LIZJ("failed_sec_participants", this.failed_sec_participants);
        c1dbc.addUnknownFields(unknownFields());
        return c1dbc;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<Long> list = this.failed_participants;
        if (list != null && !list.isEmpty()) {
            sb.append(", failed_participants=");
            sb.append(this.failed_participants);
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
        List<SecUidPair> list2 = this.failed_sec_participants;
        if (list2 != null && !list2.isEmpty()) {
            sb.append(", failed_sec_participants=");
            sb.append(this.failed_sec_participants);
        }
        sb.replace(0, 2, "ConversationRemoveParticipantsResponseBody{");
        sb.append('}');
        return sb.toString();
    }

    public ConversationRemoveParticipantsResponseBody(List<Long> list, Integer num, String str, Long l, String str2, List<SecUidPair> list2) {
        this(list, num, str, l, str2, list2, ByteString.EMPTY);
    }

    public ConversationRemoveParticipantsResponseBody(List<Long> list, Integer num, String str, Long l, String str2, List<SecUidPair> list2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.failed_participants = C1516540pZE.LJFF("failed_participants", list);
        this.status = num;
        this.extra_info = str;
        this.check_code = l;
        this.check_message = str2;
        this.failed_sec_participants = C1516540pZE.LJFF("failed_sec_participants", list2);
    }
}
