package com.bytedance.im.core.proto;

import X.C09CT;
import X.C2230621CSe;
import com.bytedance.im.core.proto.ParticipantReadIndex;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class ParticipantReadIndex extends Message<ParticipantReadIndex, C2230621CSe> {
    public static final long serialVersionUID = 0;

    @C09CT("index")
    public final Long index;

    @C09CT("index_min")
    public final Long index_min;

    @C09CT("index_v2")
    public final Long index_v2;

    @C09CT("sec_uid")
    public final String sec_uid;

    @C09CT("user_id")
    public final Long user_id;
    public static final ProtoAdapter<ParticipantReadIndex> ADAPTER = new ProtoAdapter<ParticipantReadIndex>() { // from class: X.1CSd
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final ParticipantReadIndex decode(ProtoReader protoReader) {
            C2230621CSe c2230621CSe = new C2230621CSe();
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
                                        c2230621CSe.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                    } else {
                                        c2230621CSe.LJII = ProtoAdapter.INT64.decode(protoReader);
                                    }
                                } else {
                                    c2230621CSe.LJI = ProtoAdapter.INT64.decode(protoReader);
                                }
                            } else {
                                c2230621CSe.LJFF = ProtoAdapter.INT64.decode(protoReader);
                            }
                        } else {
                            c2230621CSe.LJ = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c2230621CSe.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2230621CSe.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(ParticipantReadIndex participantReadIndex) {
            ParticipantReadIndex participantReadIndex2 = participantReadIndex;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return protoAdapter.encodedSizeWithTag(1, participantReadIndex2.user_id) + ProtoAdapter.STRING.encodedSizeWithTag(2, participantReadIndex2.sec_uid) + protoAdapter.encodedSizeWithTag(3, participantReadIndex2.index) + protoAdapter.encodedSizeWithTag(4, participantReadIndex2.index_v2) + protoAdapter.encodedSizeWithTag(5, participantReadIndex2.index_min) + participantReadIndex2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, ParticipantReadIndex participantReadIndex) {
            ParticipantReadIndex participantReadIndex2 = participantReadIndex;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, participantReadIndex2.user_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, participantReadIndex2.sec_uid);
            protoAdapter.encodeWithTag(protoWriter, 3, participantReadIndex2.index);
            protoAdapter.encodeWithTag(protoWriter, 4, participantReadIndex2.index_v2);
            protoAdapter.encodeWithTag(protoWriter, 5, participantReadIndex2.index_min);
            protoWriter.writeBytes(participantReadIndex2.unknownFields());
        }
    };
    public static final Long DEFAULT_USER_ID = 0L;
    public static final Long DEFAULT_INDEX = 0L;
    public static final Long DEFAULT_INDEX_V2 = 0L;
    public static final Long DEFAULT_INDEX_MIN = 0L;

    @Override // com.squareup.wire.Message
    public C2230621CSe newBuilder() {
        C2230621CSe c2230621CSe = new C2230621CSe();
        c2230621CSe.LIZLLL = this.user_id;
        c2230621CSe.LJ = this.sec_uid;
        c2230621CSe.LJFF = this.index;
        c2230621CSe.LJI = this.index_v2;
        c2230621CSe.LJII = this.index_min;
        c2230621CSe.addUnknownFields(unknownFields());
        return c2230621CSe;
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
        if (this.index_min != null) {
            sb.append(", index_min=");
            sb.append(this.index_min);
        }
        sb.replace(0, 2, "ParticipantReadIndex{");
        sb.append('}');
        return sb.toString();
    }

    public ParticipantReadIndex(Long l, String str, Long l2, Long l3, Long l4) {
        this(l, str, l2, l3, l4, ByteString.EMPTY);
    }

    public ParticipantReadIndex(Long l, String str, Long l2, Long l3, Long l4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.user_id = l;
        this.sec_uid = str;
        this.index = l2;
        this.index_v2 = l3;
        this.index_min = l4;
    }
}
