package com.ss.ugc.tiktok.creator_studio_feed_inspiration_v1.proto;

import X.C1516540pZE;
import X.C1C6O;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.ss.ugc.tiktok.creator_studio_feed_inspiration_v1.proto.creator_studio_feed_inspiration_v1_request;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class creator_studio_feed_inspiration_v1_request extends Message<creator_studio_feed_inspiration_v1_request, C1C6O> {
    public static final ProtoAdapter<creator_studio_feed_inspiration_v1_request> ADAPTER = new ProtoAdapter<creator_studio_feed_inspiration_v1_request>() { // from class: X.1C6N
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final creator_studio_feed_inspiration_v1_request decode(ProtoReader protoReader) {
            C1C6O c1c6o = new C1C6O();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1c6o.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c1c6o.LJ = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c1c6o.LIZLLL = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1c6o.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(creator_studio_feed_inspiration_v1_request creator_studio_feed_inspiration_v1_requestVar) {
            creator_studio_feed_inspiration_v1_request creator_studio_feed_inspiration_v1_requestVar2 = creator_studio_feed_inspiration_v1_requestVar;
            return ProtoAdapter.INT32.encodedSizeWithTag(1, creator_studio_feed_inspiration_v1_requestVar2.pull_type) + ProtoAdapter.STRING.encodedSizeWithTag(2, creator_studio_feed_inspiration_v1_requestVar2.survey_params) + creator_studio_feed_inspiration_v1_requestVar2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, creator_studio_feed_inspiration_v1_request creator_studio_feed_inspiration_v1_requestVar) {
            creator_studio_feed_inspiration_v1_request creator_studio_feed_inspiration_v1_requestVar2 = creator_studio_feed_inspiration_v1_requestVar;
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, creator_studio_feed_inspiration_v1_requestVar2.pull_type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, creator_studio_feed_inspiration_v1_requestVar2.survey_params);
            protoWriter.writeBytes(creator_studio_feed_inspiration_v1_requestVar2.unknownFields());
        }
    };

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public Integer pull_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String survey_params;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Integer num = this.pull_type;
        int iHashCode2 = (iHashCode + (num != null ? num.hashCode() : 0)) * 37;
        String str = this.survey_params;
        int iHashCode3 = iHashCode2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public C1C6O newBuilder() {
        C1C6O c1c6o = new C1C6O();
        c1c6o.LIZLLL = this.pull_type;
        c1c6o.LJ = this.survey_params;
        c1c6o.addUnknownFields(unknownFields());
        return c1c6o;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.pull_type != null) {
            sb.append(", pull_type=");
            sb.append(this.pull_type);
        }
        if (this.survey_params != null) {
            sb.append(", survey_params=");
            sb.append(this.survey_params);
        }
        sb.replace(0, 2, "creator_studio_feed_inspiration_v1_request{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof creator_studio_feed_inspiration_v1_request)) {
            return false;
        }
        creator_studio_feed_inspiration_v1_request creator_studio_feed_inspiration_v1_requestVar = (creator_studio_feed_inspiration_v1_request) obj;
        if (unknownFields().equals(creator_studio_feed_inspiration_v1_requestVar.unknownFields()) && C1516540pZE.LJ(this.pull_type, creator_studio_feed_inspiration_v1_requestVar.pull_type) && C1516540pZE.LJ(this.survey_params, creator_studio_feed_inspiration_v1_requestVar.survey_params)) {
            return true;
        }
        return false;
    }

    public creator_studio_feed_inspiration_v1_request(Integer num, String str) {
        this(num, str, ByteString.EMPTY);
    }

    public creator_studio_feed_inspiration_v1_request(Integer num, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.pull_type = num;
        this.survey_params = str;
    }
}
