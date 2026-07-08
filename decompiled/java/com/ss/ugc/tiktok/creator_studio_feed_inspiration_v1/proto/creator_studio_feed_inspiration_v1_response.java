package com.ss.ugc.tiktok.creator_studio_feed_inspiration_v1.proto;

import X.C1516540pZE;
import X.C1CEV;
import X.C5186020i;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.ss.ugc.tiktok.creator_studio_feed_inspiration_v1.proto.InspirationLogPbStructV1;
import com.ss.ugc.tiktok.creator_studio_feed_inspiration_v1.proto.creator_studio_feed_inspiration_v1_response;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class creator_studio_feed_inspiration_v1_response extends Message<creator_studio_feed_inspiration_v1_response, C1CEV> {
    public static final ProtoAdapter<creator_studio_feed_inspiration_v1_response> ADAPTER = new ProtoAdapter<creator_studio_feed_inspiration_v1_response>() { // from class: X.1CEU
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final creator_studio_feed_inspiration_v1_response decode(ProtoReader protoReader) {
            C1CEV c1cev = new C1CEV();
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
                                        c1cev.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                    } else {
                                        c1cev.LJII = InspirationLogPbStructV1.ADAPTER.decode(protoReader);
                                    }
                                } else {
                                    c1cev.LJI = ProtoAdapter.INT32.decode(protoReader);
                                }
                            } else {
                                c1cev.LJFF.add(C5186020i.ADAPTER.decode(protoReader));
                            }
                        } else {
                            c1cev.LJ = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c1cev.LIZLLL = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cev.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(creator_studio_feed_inspiration_v1_response creator_studio_feed_inspiration_v1_responseVar) {
            creator_studio_feed_inspiration_v1_response creator_studio_feed_inspiration_v1_responseVar2 = creator_studio_feed_inspiration_v1_responseVar;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            return protoAdapter.encodedSizeWithTag(1, creator_studio_feed_inspiration_v1_responseVar2.status_code) + ProtoAdapter.STRING.encodedSizeWithTag(2, creator_studio_feed_inspiration_v1_responseVar2.status_msg) + C5186020i.ADAPTER.asRepeated().encodedSizeWithTag(3, creator_studio_feed_inspiration_v1_responseVar2.aweme_list) + protoAdapter.encodedSizeWithTag(4, creator_studio_feed_inspiration_v1_responseVar2.has_more) + InspirationLogPbStructV1.ADAPTER.encodedSizeWithTag(5, creator_studio_feed_inspiration_v1_responseVar2.log_pb) + creator_studio_feed_inspiration_v1_responseVar2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, creator_studio_feed_inspiration_v1_response creator_studio_feed_inspiration_v1_responseVar) {
            creator_studio_feed_inspiration_v1_response creator_studio_feed_inspiration_v1_responseVar2 = creator_studio_feed_inspiration_v1_responseVar;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 1, creator_studio_feed_inspiration_v1_responseVar2.status_code);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, creator_studio_feed_inspiration_v1_responseVar2.status_msg);
            C5186020i.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, creator_studio_feed_inspiration_v1_responseVar2.aweme_list);
            protoAdapter.encodeWithTag(protoWriter, 4, creator_studio_feed_inspiration_v1_responseVar2.has_more);
            InspirationLogPbStructV1.ADAPTER.encodeWithTag(protoWriter, 5, creator_studio_feed_inspiration_v1_responseVar2.log_pb);
            protoWriter.writeBytes(creator_studio_feed_inspiration_v1_responseVar2.unknownFields());
        }
    };

    @WireField(adapter = "com.ss.ugc.tiktok.proto.AwemeStructV2#ADAPTER", label = WireField.Label.REPEATED, tag = 3)
    public List<C5186020i> aweme_list;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 4)
    public Integer has_more;

    @WireField(adapter = "com.ss.ugc.tiktok.creator_studio_feed_inspiration_v1.proto.InspirationLogPbStructV1#ADAPTER", tag = 5)
    public InspirationLogPbStructV1 log_pb;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public Integer status_code;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String status_msg;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Integer num = this.status_code;
        int iHashCode2 = (iHashCode + (num != null ? num.hashCode() : 0)) * 37;
        String str = this.status_msg;
        int iHashCode3 = (((iHashCode2 + (str != null ? str.hashCode() : 0)) * 37) + this.aweme_list.hashCode()) * 37;
        Integer num2 = this.has_more;
        int iHashCode4 = (iHashCode3 + (num2 != null ? num2.hashCode() : 0)) * 37;
        InspirationLogPbStructV1 inspirationLogPbStructV1 = this.log_pb;
        int iHashCode5 = iHashCode4 + (inspirationLogPbStructV1 != null ? inspirationLogPbStructV1.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public C1CEV newBuilder() {
        C1CEV c1cev = new C1CEV();
        c1cev.LIZLLL = this.status_code;
        c1cev.LJ = this.status_msg;
        c1cev.LJFF = C1516540pZE.LIZJ("aweme_list", this.aweme_list);
        c1cev.LJI = this.has_more;
        c1cev.LJII = this.log_pb;
        c1cev.addUnknownFields(unknownFields());
        return c1cev;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.status_code != null) {
            sb.append(", status_code=");
            sb.append(this.status_code);
        }
        if (this.status_msg != null) {
            sb.append(", status_msg=");
            sb.append(this.status_msg);
        }
        if (!this.aweme_list.isEmpty()) {
            sb.append(", aweme_list=");
            sb.append(this.aweme_list);
        }
        if (this.has_more != null) {
            sb.append(", has_more=");
            sb.append(this.has_more);
        }
        if (this.log_pb != null) {
            sb.append(", log_pb=");
            sb.append(this.log_pb);
        }
        sb.replace(0, 2, "creator_studio_feed_inspiration_v1_response{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof creator_studio_feed_inspiration_v1_response)) {
            return false;
        }
        creator_studio_feed_inspiration_v1_response creator_studio_feed_inspiration_v1_responseVar = (creator_studio_feed_inspiration_v1_response) obj;
        if (unknownFields().equals(creator_studio_feed_inspiration_v1_responseVar.unknownFields()) && C1516540pZE.LJ(this.status_code, creator_studio_feed_inspiration_v1_responseVar.status_code) && C1516540pZE.LJ(this.status_msg, creator_studio_feed_inspiration_v1_responseVar.status_msg) && this.aweme_list.equals(creator_studio_feed_inspiration_v1_responseVar.aweme_list) && C1516540pZE.LJ(this.has_more, creator_studio_feed_inspiration_v1_responseVar.has_more) && C1516540pZE.LJ(this.log_pb, creator_studio_feed_inspiration_v1_responseVar.log_pb)) {
            return true;
        }
        return false;
    }

    public creator_studio_feed_inspiration_v1_response(Integer num, String str, List<C5186020i> list, Integer num2, InspirationLogPbStructV1 inspirationLogPbStructV1) {
        this(num, str, list, num2, inspirationLogPbStructV1, ByteString.EMPTY);
    }

    public creator_studio_feed_inspiration_v1_response(Integer num, String str, List<C5186020i> list, Integer num2, InspirationLogPbStructV1 inspirationLogPbStructV1, ByteString byteString) {
        super(ADAPTER, byteString);
        this.status_code = num;
        this.status_msg = str;
        this.aweme_list = C1516540pZE.LJFF("aweme_list", list);
        this.has_more = num2;
        this.log_pb = inspirationLogPbStructV1;
    }
}
