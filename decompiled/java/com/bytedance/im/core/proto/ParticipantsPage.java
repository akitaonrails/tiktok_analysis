package com.bytedance.im.core.proto;

import X.C09CT;
import X.C0Y4X;
import X.C1516540pZE;
import com.bytedance.im.core.proto.Participant;
import com.bytedance.im.core.proto.ParticipantsPage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class ParticipantsPage extends Message<ParticipantsPage, C0Y4X> {
    public static final long serialVersionUID = 0;

    @C09CT("cursor")
    public final Long cursor;

    @C09CT("has_more")
    public final Boolean has_more;

    @C09CT("participants")
    public final List<Participant> participants;
    public static final ProtoAdapter<ParticipantsPage> ADAPTER = new ProtoAdapter<ParticipantsPage>() { // from class: X.0Y4W
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final ParticipantsPage decode(ProtoReader protoReader) {
            C0Y4X c0y4x = new C0Y4X();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c0y4x.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c0y4x.LJFF = ProtoAdapter.INT64.decode(protoReader);
                            }
                        } else {
                            c0y4x.LJ = ProtoAdapter.BOOL.decode(protoReader);
                        }
                    } else {
                        c0y4x.LIZLLL.add(Participant.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c0y4x.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(ParticipantsPage participantsPage) {
            ParticipantsPage participantsPage2 = participantsPage;
            return Participant.ADAPTER.asRepeated().encodedSizeWithTag(1, participantsPage2.participants) + ProtoAdapter.BOOL.encodedSizeWithTag(2, participantsPage2.has_more) + ProtoAdapter.INT64.encodedSizeWithTag(3, participantsPage2.cursor) + participantsPage2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, ParticipantsPage participantsPage) {
            ParticipantsPage participantsPage2 = participantsPage;
            Participant.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, participantsPage2.participants);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, participantsPage2.has_more);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, participantsPage2.cursor);
            protoWriter.writeBytes(participantsPage2.unknownFields());
        }
    };
    public static final Boolean DEFAULT_HAS_MORE = Boolean.FALSE;
    public static final Long DEFAULT_CURSOR = 0L;

    @Override // com.squareup.wire.Message
    public C0Y4X newBuilder() {
        C0Y4X c0y4x = new C0Y4X();
        c0y4x.LIZLLL = C1516540pZE.LIZJ("participants", this.participants);
        c0y4x.LJ = this.has_more;
        c0y4x.LJFF = this.cursor;
        c0y4x.addUnknownFields(unknownFields());
        return c0y4x;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<Participant> list = this.participants;
        if (list != null && !list.isEmpty()) {
            sb.append(", participants=");
            sb.append(this.participants);
        }
        if (this.has_more != null) {
            sb.append(", has_more=");
            sb.append(this.has_more);
        }
        if (this.cursor != null) {
            sb.append(", cursor=");
            sb.append(this.cursor);
        }
        sb.replace(0, 2, "ParticipantsPage{");
        sb.append('}');
        return sb.toString();
    }

    public ParticipantsPage(List<Participant> list, Boolean bool, Long l) {
        this(list, bool, l, ByteString.EMPTY);
    }

    public ParticipantsPage(List<Participant> list, Boolean bool, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.participants = C1516540pZE.LJFF("participants", list);
        this.has_more = bool;
        this.cursor = l;
    }
}
