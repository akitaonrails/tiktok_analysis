package com.bytedance.otis.protos;

import X.C1516540pZE;
import X.C1C8R;
import com.bytedance.otis.protos.TimeStampRange;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class TimeStampRange extends Message<TimeStampRange, C1C8R> {
    public static final ProtoAdapter<TimeStampRange> ADAPTER = new ProtoAdapter<TimeStampRange>() { // from class: X.1C8M
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final TimeStampRange decode(ProtoReader protoReader) {
            C1C8R c1c8r = new C1C8R();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1c8r.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c1c8r.LJ = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c1c8r.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1c8r.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(TimeStampRange timeStampRange) {
            TimeStampRange timeStampRange2 = timeStampRange;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return protoAdapter.encodedSizeWithTag(1, timeStampRange2.start_timestamp) + protoAdapter.encodedSizeWithTag(2, timeStampRange2.end_timestamp) + timeStampRange2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, TimeStampRange timeStampRange) {
            TimeStampRange timeStampRange2 = timeStampRange;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, timeStampRange2.start_timestamp);
            protoAdapter.encodeWithTag(protoWriter, 2, timeStampRange2.end_timestamp);
            protoWriter.writeBytes(timeStampRange2.unknownFields());
        }
    };

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public Long end_timestamp;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
    public Long start_timestamp;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Long l = this.start_timestamp;
        int iHashCode2 = (iHashCode + (l != null ? l.hashCode() : 0)) * 37;
        Long l2 = this.end_timestamp;
        int iHashCode3 = iHashCode2 + (l2 != null ? l2.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public C1C8R newBuilder() {
        C1C8R c1c8r = new C1C8R();
        c1c8r.LIZLLL = this.start_timestamp;
        c1c8r.LJ = this.end_timestamp;
        c1c8r.addUnknownFields(unknownFields());
        return c1c8r;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.start_timestamp != null) {
            sb.append(", start_timestamp=");
            sb.append(this.start_timestamp);
        }
        if (this.end_timestamp != null) {
            sb.append(", end_timestamp=");
            sb.append(this.end_timestamp);
        }
        sb.replace(0, 2, "TimeStampRange{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TimeStampRange)) {
            return false;
        }
        TimeStampRange timeStampRange = (TimeStampRange) obj;
        if (unknownFields().equals(timeStampRange.unknownFields()) && C1516540pZE.LJ(this.start_timestamp, timeStampRange.start_timestamp) && C1516540pZE.LJ(this.end_timestamp, timeStampRange.end_timestamp)) {
            return true;
        }
        return false;
    }

    public TimeStampRange(Long l, Long l2) {
        this(l, l2, ByteString.EMPTY);
    }

    public TimeStampRange(Long l, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.start_timestamp = l;
        this.end_timestamp = l2;
    }
}
