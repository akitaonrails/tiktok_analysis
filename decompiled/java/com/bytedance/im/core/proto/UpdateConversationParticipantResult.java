package com.bytedance.im.core.proto;

import X.C09CT;
import X.C1DBA;
import com.bytedance.im.core.proto.Participant;
import com.bytedance.im.core.proto.UpdateConversationParticipantResult;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import okio.ByteString;

/* JADX INFO: loaded from: classes36.dex */
public final class UpdateConversationParticipantResult extends Message<UpdateConversationParticipantResult, C1DBA> {
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
    public static final ProtoAdapter<UpdateConversationParticipantResult> ADAPTER = new ProtoAdapter<UpdateConversationParticipantResult>() { // from class: X.1DB9
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final UpdateConversationParticipantResult decode(ProtoReader protoReader) {
            C1DBA c1dba = new C1DBA();
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
                                        c1dba.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                    } else {
                                        c1dba.LJII = ProtoAdapter.STRING.decode(protoReader);
                                    }
                                } else {
                                    c1dba.LJI = ProtoAdapter.INT64.decode(protoReader);
                                }
                            } else {
                                c1dba.LJFF = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c1dba.LJ = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c1dba.LIZLLL = Participant.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1dba.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(UpdateConversationParticipantResult updateConversationParticipantResult) {
            UpdateConversationParticipantResult updateConversationParticipantResult2 = updateConversationParticipantResult;
            int iEncodedSizeWithTag = Participant.ADAPTER.encodedSizeWithTag(1, updateConversationParticipantResult2.participant) + ProtoAdapter.INT32.encodedSizeWithTag(2, updateConversationParticipantResult2.status);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(3, updateConversationParticipantResult2.extra_info) + ProtoAdapter.INT64.encodedSizeWithTag(4, updateConversationParticipantResult2.check_code) + protoAdapter.encodedSizeWithTag(5, updateConversationParticipantResult2.check_message) + updateConversationParticipantResult2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, UpdateConversationParticipantResult updateConversationParticipantResult) {
            UpdateConversationParticipantResult updateConversationParticipantResult2 = updateConversationParticipantResult;
            Participant.ADAPTER.encodeWithTag(protoWriter, 1, updateConversationParticipantResult2.participant);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, updateConversationParticipantResult2.status);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 3, updateConversationParticipantResult2.extra_info);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, updateConversationParticipantResult2.check_code);
            protoAdapter.encodeWithTag(protoWriter, 5, updateConversationParticipantResult2.check_message);
            protoWriter.writeBytes(updateConversationParticipantResult2.unknownFields());
        }
    };
    public static final Integer DEFAULT_STATUS = 0;
    public static final Long DEFAULT_CHECK_CODE = 0L;

    @Override // com.squareup.wire.Message
    public C1DBA newBuilder() {
        C1DBA c1dba = new C1DBA();
        c1dba.LIZLLL = this.participant;
        c1dba.LJ = this.status;
        c1dba.LJFF = this.extra_info;
        c1dba.LJI = this.check_code;
        c1dba.LJII = this.check_message;
        c1dba.addUnknownFields(unknownFields());
        return c1dba;
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
        sb.replace(0, 2, "UpdateConversationParticipantResult{");
        sb.append('}');
        return sb.toString();
    }

    public UpdateConversationParticipantResult(Participant participant, Integer num, String str, Long l, String str2) {
        this(participant, num, str, l, str2, ByteString.EMPTY);
    }

    public UpdateConversationParticipantResult(Participant participant, Integer num, String str, Long l, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.participant = participant;
        this.status = num;
        this.extra_info = str;
        this.check_code = l;
        this.check_message = str2;
    }
}
