package com.bytedance.im.core.proto;

import X.C09CT;
import X.C875310YVl;
import com.bytedance.im.core.proto.Participant;
import com.bytedance.im.core.proto.UpdateConversationParticipantResponseBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class UpdateConversationParticipantResponseBody extends Message<UpdateConversationParticipantResponseBody, C875310YVl> {
    public static final long serialVersionUID = 0;

    @C09CT("check_code")
    public final Long check_code;

    @C09CT("check_message")
    public final String check_message;

    @C09CT("extra_info")
    public final String extra_info;

    @C09CT("participant")
    public final Participant participant;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final Integer status;
    public static final ProtoAdapter<UpdateConversationParticipantResponseBody> ADAPTER = new ProtoAdapter<UpdateConversationParticipantResponseBody>() { // from class: X.0YVk
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final UpdateConversationParticipantResponseBody decode(ProtoReader protoReader) {
            C875310YVl c875310YVl = new C875310YVl();
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
                                        c875310YVl.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                    } else {
                                        c875310YVl.LJII = ProtoAdapter.STRING.decode(protoReader);
                                    }
                                } else {
                                    c875310YVl.LJI = ProtoAdapter.INT64.decode(protoReader);
                                }
                            } else {
                                c875310YVl.LJFF = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c875310YVl.LJ = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c875310YVl.LIZLLL = Participant.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c875310YVl.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(UpdateConversationParticipantResponseBody updateConversationParticipantResponseBody) {
            UpdateConversationParticipantResponseBody updateConversationParticipantResponseBody2 = updateConversationParticipantResponseBody;
            int iEncodedSizeWithTag = Participant.ADAPTER.encodedSizeWithTag(1, updateConversationParticipantResponseBody2.participant) + ProtoAdapter.INT32.encodedSizeWithTag(2, updateConversationParticipantResponseBody2.status);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(3, updateConversationParticipantResponseBody2.extra_info) + ProtoAdapter.INT64.encodedSizeWithTag(4, updateConversationParticipantResponseBody2.check_code) + protoAdapter.encodedSizeWithTag(5, updateConversationParticipantResponseBody2.check_message) + updateConversationParticipantResponseBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, UpdateConversationParticipantResponseBody updateConversationParticipantResponseBody) {
            UpdateConversationParticipantResponseBody updateConversationParticipantResponseBody2 = updateConversationParticipantResponseBody;
            Participant.ADAPTER.encodeWithTag(protoWriter, 1, updateConversationParticipantResponseBody2.participant);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, updateConversationParticipantResponseBody2.status);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 3, updateConversationParticipantResponseBody2.extra_info);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, updateConversationParticipantResponseBody2.check_code);
            protoAdapter.encodeWithTag(protoWriter, 5, updateConversationParticipantResponseBody2.check_message);
            protoWriter.writeBytes(updateConversationParticipantResponseBody2.unknownFields());
        }
    };
    public static final Integer DEFAULT_STATUS = 0;
    public static final Long DEFAULT_CHECK_CODE = 0L;

    @Override // com.squareup.wire.Message
    public C875310YVl newBuilder() {
        C875310YVl c875310YVl = new C875310YVl();
        c875310YVl.LIZLLL = this.participant;
        c875310YVl.LJ = this.status;
        c875310YVl.LJFF = this.extra_info;
        c875310YVl.LJI = this.check_code;
        c875310YVl.LJII = this.check_message;
        c875310YVl.addUnknownFields(unknownFields());
        return c875310YVl;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.participant != null) {
            sb.append(", participant=");
            sb.append(this.participant);
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
        sb.replace(0, 2, "UpdateConversationParticipantResponseBody{");
        sb.append('}');
        return sb.toString();
    }

    public UpdateConversationParticipantResponseBody(Participant participant, Integer num, String str, Long l, String str2) {
        this(participant, num, str, l, str2, ByteString.EMPTY);
    }

    public UpdateConversationParticipantResponseBody(Participant participant, Integer num, String str, Long l, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.participant = participant;
        this.status = num;
        this.extra_info = str;
        this.check_code = l;
        this.check_message = str2;
    }
}
