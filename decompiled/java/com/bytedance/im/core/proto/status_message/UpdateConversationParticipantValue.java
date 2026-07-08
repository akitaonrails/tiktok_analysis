package com.bytedance.im.core.proto.status_message;

import X.C09CT;
import X.C1516540pZE;
import X.C867830Y2r;
import com.bytedance.im.core.proto.status_message.UpdateConversationParticipantValue;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class UpdateConversationParticipantValue extends Message<UpdateConversationParticipantValue, C867830Y2r> {
    public static final ProtoAdapter<UpdateConversationParticipantValue> ADAPTER = new ProtoAdapter<UpdateConversationParticipantValue>() { // from class: X.0Y2q
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final UpdateConversationParticipantValue decode(ProtoReader protoReader) {
            C867830Y2r c867830Y2r = new C867830Y2r();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c867830Y2r.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c867830Y2r.LJFF.add(ProtoAdapter.INT64.decode(protoReader));
                            }
                        } else {
                            c867830Y2r.LJ.add(ProtoAdapter.INT64.decode(protoReader));
                        }
                    } else {
                        c867830Y2r.LIZLLL.add(ProtoAdapter.INT64.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c867830Y2r.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(UpdateConversationParticipantValue updateConversationParticipantValue) {
            UpdateConversationParticipantValue updateConversationParticipantValue2 = updateConversationParticipantValue;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return protoAdapter.asRepeated().encodedSizeWithTag(1, updateConversationParticipantValue2.added_participant) + protoAdapter.asRepeated().encodedSizeWithTag(2, updateConversationParticipantValue2.removed_participant) + protoAdapter.asRepeated().encodedSizeWithTag(3, updateConversationParticipantValue2.modified_participant) + updateConversationParticipantValue2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final UpdateConversationParticipantValue redact(UpdateConversationParticipantValue updateConversationParticipantValue) {
            C867830Y2r c867830Y2rNewBuilder = updateConversationParticipantValue.newBuilder();
            c867830Y2rNewBuilder.clearUnknownFields();
            return c867830Y2rNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, UpdateConversationParticipantValue updateConversationParticipantValue) {
            UpdateConversationParticipantValue updateConversationParticipantValue2 = updateConversationParticipantValue;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 1, updateConversationParticipantValue2.added_participant);
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 2, updateConversationParticipantValue2.removed_participant);
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 3, updateConversationParticipantValue2.modified_participant);
            protoWriter.writeBytes(updateConversationParticipantValue2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @C09CT("added_participant")
    public final List<Long> added_participant;

    @C09CT("modified_participant")
    public final List<Long> modified_participant;

    @C09CT("removed_participant")
    public final List<Long> removed_participant;

    @Override // com.squareup.wire.Message
    public C867830Y2r newBuilder() {
        C867830Y2r c867830Y2r = new C867830Y2r();
        c867830Y2r.LIZLLL = C1516540pZE.LIZJ("added_participant", this.added_participant);
        c867830Y2r.LJ = C1516540pZE.LIZJ("removed_participant", this.removed_participant);
        c867830Y2r.LJFF = C1516540pZE.LIZJ("modified_participant", this.modified_participant);
        c867830Y2r.addUnknownFields(unknownFields());
        return c867830Y2r;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<Long> list = this.added_participant;
        if (list != null && !list.isEmpty()) {
            sb.append(", added_participant=");
            sb.append(this.added_participant);
        }
        List<Long> list2 = this.removed_participant;
        if (list2 != null && !list2.isEmpty()) {
            sb.append(", removed_participant=");
            sb.append(this.removed_participant);
        }
        List<Long> list3 = this.modified_participant;
        if (list3 != null && !list3.isEmpty()) {
            sb.append(", modified_participant=");
            sb.append(this.modified_participant);
        }
        sb.replace(0, 2, "UpdateConversationParticipantValue{");
        sb.append('}');
        return sb.toString();
    }

    public UpdateConversationParticipantValue(List<Long> list, List<Long> list2, List<Long> list3) {
        this(list, list2, list3, ByteString.EMPTY);
    }

    public UpdateConversationParticipantValue(List<Long> list, List<Long> list2, List<Long> list3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.added_participant = C1516540pZE.LJFF("added_participant", list);
        this.removed_participant = C1516540pZE.LJFF("removed_participant", list2);
        this.modified_participant = C1516540pZE.LJFF("modified_participant", list3);
    }
}
