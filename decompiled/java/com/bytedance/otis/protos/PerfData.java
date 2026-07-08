package com.bytedance.otis.protos;

import X.C1516540pZE;
import X.C1C8D;
import com.bytedance.otis.protos.PerfData;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class PerfData extends Message<PerfData, C1C8D> {
    public static final ProtoAdapter<PerfData> ADAPTER = new ProtoAdapter<PerfData>() { // from class: X.1C8E
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final PerfData decode(ProtoReader protoReader) {
            C1C8D c1c8d = new C1C8D();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c1c8d.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c1c8d.LJFF = ProtoAdapter.BYTES.decode(protoReader);
                            }
                        } else {
                            c1c8d.LJ = ProtoAdapter.UINT32.decode(protoReader);
                        }
                    } else {
                        c1c8d.LIZLLL = ProtoAdapter.UINT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1c8d.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(PerfData perfData) {
            PerfData perfData2 = perfData;
            return ProtoAdapter.UINT64.encodedSizeWithTag(1, perfData2.timestamp) + ProtoAdapter.UINT32.encodedSizeWithTag(2, perfData2.data_type) + ProtoAdapter.BYTES.encodedSizeWithTag(3, perfData2.data) + perfData2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, PerfData perfData) {
            PerfData perfData2 = perfData;
            ProtoAdapter.UINT64.encodeWithTag(protoWriter, 1, perfData2.timestamp);
            ProtoAdapter.UINT32.encodeWithTag(protoWriter, 2, perfData2.data_type);
            ProtoAdapter.BYTES.encodeWithTag(protoWriter, 3, perfData2.data);
            protoWriter.writeBytes(perfData2.unknownFields());
        }
    };

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", tag = 3)
    public ByteString data;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", tag = 2)
    public Integer data_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT64", tag = 1)
    public Long timestamp;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Long l = this.timestamp;
        int iHashCode2 = (iHashCode + (l != null ? l.hashCode() : 0)) * 37;
        Integer num = this.data_type;
        int iHashCode3 = (iHashCode2 + (num != null ? num.hashCode() : 0)) * 37;
        ByteString byteString = this.data;
        int iHashCode4 = iHashCode3 + (byteString != null ? byteString.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public C1C8D newBuilder() {
        C1C8D c1c8d = new C1C8D();
        c1c8d.LIZLLL = this.timestamp;
        c1c8d.LJ = this.data_type;
        c1c8d.LJFF = this.data;
        c1c8d.addUnknownFields(unknownFields());
        return c1c8d;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.timestamp != null) {
            sb.append(", timestamp=");
            sb.append(this.timestamp);
        }
        if (this.data_type != null) {
            sb.append(", data_type=");
            sb.append(this.data_type);
        }
        if (this.data != null) {
            sb.append(", data=");
            sb.append(this.data);
        }
        sb.replace(0, 2, "PerfData{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PerfData)) {
            return false;
        }
        PerfData perfData = (PerfData) obj;
        if (unknownFields().equals(perfData.unknownFields()) && C1516540pZE.LJ(this.timestamp, perfData.timestamp) && C1516540pZE.LJ(this.data_type, perfData.data_type) && C1516540pZE.LJ(this.data, perfData.data)) {
            return true;
        }
        return false;
    }

    public PerfData(Long l, Integer num, ByteString byteString) {
        this(l, num, byteString, ByteString.EMPTY);
    }

    public PerfData(Long l, Integer num, ByteString byteString, ByteString byteString2) {
        super(ADAPTER, byteString2);
        this.timestamp = l;
        this.data_type = num;
        this.data = byteString;
    }
}
