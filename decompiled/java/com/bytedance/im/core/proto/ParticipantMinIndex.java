package com.bytedance.im.core.proto;

import X.C09CT;
import X.C2230601CSc;
import com.bytedance.im.core.proto.ParticipantMinIndex;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class ParticipantMinIndex extends Message<ParticipantMinIndex, C2230601CSc> {
    public static final long serialVersionUID = 0;

    @C09CT("index")
    public final Long index;

    @C09CT("index_v2")
    public final Long index_v2;

    @C09CT("sec_uid")
    public final String sec_uid;

    @C09CT("user_id")
    public final Long user_id;
    public static final ProtoAdapter<ParticipantMinIndex> ADAPTER = new ProtoAdapter<ParticipantMinIndex>() { // from class: X.1CSb
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final ParticipantMinIndex decode(ProtoReader protoReader) {
            C2230601CSc c2230601CSc = new C2230601CSc();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                    c2230601CSc.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                } else {
                                    c2230601CSc.LJI = ProtoAdapter.INT64.decode(protoReader);
                                }
                            } else {
                                c2230601CSc.LJFF = ProtoAdapter.INT64.decode(protoReader);
                            }
                        } else {
                            c2230601CSc.LJ = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c2230601CSc.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2230601CSc.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(ParticipantMinIndex participantMinIndex) {
            ParticipantMinIndex participantMinIndex2 = participantMinIndex;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return protoAdapter.encodedSizeWithTag(1, participantMinIndex2.user_id) + ProtoAdapter.STRING.encodedSizeWithTag(2, participantMinIndex2.sec_uid) + protoAdapter.encodedSizeWithTag(3, participantMinIndex2.index) + protoAdapter.encodedSizeWithTag(4, participantMinIndex2.index_v2) + participantMinIndex2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, ParticipantMinIndex participantMinIndex) {
            ParticipantMinIndex participantMinIndex2 = participantMinIndex;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, participantMinIndex2.user_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, participantMinIndex2.sec_uid);
            protoAdapter.encodeWithTag(protoWriter, 3, participantMinIndex2.index);
            protoAdapter.encodeWithTag(protoWriter, 4, participantMinIndex2.index_v2);
            protoWriter.writeBytes(participantMinIndex2.unknownFields());
        }
    };
    public static final Long DEFAULT_USER_ID = 0L;
    public static final Long DEFAULT_INDEX = 0L;
    public static final Long DEFAULT_INDEX_V2 = 0L;

    @Override // com.squareup.wire.Message
    public C2230601CSc newBuilder() {
        C2230601CSc c2230601CSc = new C2230601CSc();
        c2230601CSc.LIZLLL = this.user_id;
        c2230601CSc.LJ = this.sec_uid;
        c2230601CSc.LJFF = this.index;
        c2230601CSc.LJI = this.index_v2;
        c2230601CSc.addUnknownFields(unknownFields());
        return c2230601CSc;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.user_id != null) {
            sb.append(", user_id=");
            sb.append(this.user_id);
        }
        if (this.sec_uid != null) {
            sb.append(", sec_uid=");
            sb.append(this.sec_uid);
        }
        if (this.index != null) {
            sb.append(", index=");
            sb.append(this.index);
        }
        if (this.index_v2 != null) {
            sb.append(", index_v2=");
            sb.append(this.index_v2);
        }
        sb.replace(0, 2, "ParticipantMinIndex{");
        sb.append('}');
        return sb.toString();
    }

    public ParticipantMinIndex(Long l, String str, Long l2, Long l3) {
        this(l, str, l2, l3, ByteString.EMPTY);
    }

    public ParticipantMinIndex(Long l, String str, Long l2, Long l3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.user_id = l;
        this.sec_uid = str;
        this.index = l2;
        this.index_v2 = l3;
    }
}
