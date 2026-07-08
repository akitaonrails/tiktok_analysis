package com.bytedance.scalpel.protos;

import X.C2225281C7q;
import com.bytedance.scalpel.protos.AttributionStageInfo;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class AttributionStageInfo extends Message<AttributionStageInfo, C2225281C7q> {
    public static final ProtoAdapter<AttributionStageInfo> ADAPTER = new ProtoAdapter<AttributionStageInfo>() { // from class: X.1C7r
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final AttributionStageInfo decode(ProtoReader protoReader) {
            C2225281C7q c2225281C7q = new C2225281C7q();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c2225281C7q.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c2225281C7q.LJFF = ProtoAdapter.UINT32.decode(protoReader);
                            }
                        } else {
                            c2225281C7q.LJ = ProtoAdapter.UINT32.decode(protoReader);
                        }
                    } else {
                        c2225281C7q.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2225281C7q.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(AttributionStageInfo attributionStageInfo) {
            AttributionStageInfo attributionStageInfo2 = attributionStageInfo;
            int iEncodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, attributionStageInfo2.stage);
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.UINT32;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, attributionStageInfo2.cpu_time_cost) + protoAdapter.encodedSizeWithTag(3, attributionStageInfo2.wall_time_cost) + attributionStageInfo2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, AttributionStageInfo attributionStageInfo) {
            AttributionStageInfo attributionStageInfo2 = attributionStageInfo;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, attributionStageInfo2.stage);
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.UINT32;
            protoAdapter.encodeWithTag(protoWriter, 2, attributionStageInfo2.cpu_time_cost);
            protoAdapter.encodeWithTag(protoWriter, 3, attributionStageInfo2.wall_time_cost);
            protoWriter.writeBytes(attributionStageInfo2.unknownFields());
        }
    };

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = WireField.Label.REQUIRED, tag = 2)
    public Integer cpu_time_cost;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public String stage;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = WireField.Label.REQUIRED, tag = 3)
    public Integer wall_time_cost;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.stage.hashCode()) * 37) + this.cpu_time_cost.hashCode()) * 37) + this.wall_time_cost.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2225281C7q newBuilder() {
        C2225281C7q c2225281C7q = new C2225281C7q();
        c2225281C7q.LIZLLL = this.stage;
        c2225281C7q.LJ = this.cpu_time_cost;
        c2225281C7q.LJFF = this.wall_time_cost;
        c2225281C7q.addUnknownFields(unknownFields());
        return c2225281C7q;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", stage=");
        sb.append(this.stage);
        sb.append(", cpu_time_cost=");
        sb.append(this.cpu_time_cost);
        sb.append(", wall_time_cost=");
        sb.append(this.wall_time_cost);
        sb.replace(0, 2, "AttributionStageInfo{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AttributionStageInfo)) {
            return false;
        }
        AttributionStageInfo attributionStageInfo = (AttributionStageInfo) obj;
        if (unknownFields().equals(attributionStageInfo.unknownFields()) && this.stage.equals(attributionStageInfo.stage) && this.cpu_time_cost.equals(attributionStageInfo.cpu_time_cost) && this.wall_time_cost.equals(attributionStageInfo.wall_time_cost)) {
            return true;
        }
        return false;
    }

    public AttributionStageInfo(String str, Integer num, Integer num2) {
        this(str, num, num2, ByteString.EMPTY);
    }

    public AttributionStageInfo(String str, Integer num, Integer num2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.stage = str;
        this.cpu_time_cost = num;
        this.wall_time_cost = num2;
    }
}
