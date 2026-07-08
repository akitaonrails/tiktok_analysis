package com.bytedance.otis.protos;

import X.C1516540pZE;
import X.C1C8Q;
import com.bytedance.otis.protos.TimeInfo;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class TimeInfo extends Message<TimeInfo, C1C8Q> {
    public static final ProtoAdapter<TimeInfo> ADAPTER = new ProtoAdapter<TimeInfo>() { // from class: X.1C8L
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final TimeInfo decode(ProtoReader protoReader) {
            C1C8Q c1c8q = new C1C8Q();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                    c1c8q.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                } else {
                                    c1c8q.LJI = ProtoAdapter.INT64.decode(protoReader);
                                }
                            } else {
                                c1c8q.LJFF = ProtoAdapter.INT64.decode(protoReader);
                            }
                        } else {
                            c1c8q.LJ = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c1c8q.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1c8q.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(TimeInfo timeInfo) {
            TimeInfo timeInfo2 = timeInfo;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return protoAdapter.encodedSizeWithTag(1, timeInfo2.start_wall_time) + protoAdapter.encodedSizeWithTag(2, timeInfo2.end_wall_time) + protoAdapter.encodedSizeWithTag(3, timeInfo2.start_cpu_time) + protoAdapter.encodedSizeWithTag(4, timeInfo2.end_cpu_time) + timeInfo2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, TimeInfo timeInfo) {
            TimeInfo timeInfo2 = timeInfo;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, timeInfo2.start_wall_time);
            protoAdapter.encodeWithTag(protoWriter, 2, timeInfo2.end_wall_time);
            protoAdapter.encodeWithTag(protoWriter, 3, timeInfo2.start_cpu_time);
            protoAdapter.encodeWithTag(protoWriter, 4, timeInfo2.end_cpu_time);
            protoWriter.writeBytes(timeInfo2.unknownFields());
        }
    };

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 4)
    public Long end_cpu_time;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public Long end_wall_time;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
    public Long start_cpu_time;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
    public Long start_wall_time;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Long l = this.start_wall_time;
        int iHashCode2 = (iHashCode + (l != null ? l.hashCode() : 0)) * 37;
        Long l2 = this.end_wall_time;
        int iHashCode3 = (iHashCode2 + (l2 != null ? l2.hashCode() : 0)) * 37;
        Long l3 = this.start_cpu_time;
        int iHashCode4 = (iHashCode3 + (l3 != null ? l3.hashCode() : 0)) * 37;
        Long l4 = this.end_cpu_time;
        int iHashCode5 = iHashCode4 + (l4 != null ? l4.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public C1C8Q newBuilder() {
        C1C8Q c1c8q = new C1C8Q();
        c1c8q.LIZLLL = this.start_wall_time;
        c1c8q.LJ = this.end_wall_time;
        c1c8q.LJFF = this.start_cpu_time;
        c1c8q.LJI = this.end_cpu_time;
        c1c8q.addUnknownFields(unknownFields());
        return c1c8q;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.start_wall_time != null) {
            sb.append(", start_wall_time=");
            sb.append(this.start_wall_time);
        }
        if (this.end_wall_time != null) {
            sb.append(", end_wall_time=");
            sb.append(this.end_wall_time);
        }
        if (this.start_cpu_time != null) {
            sb.append(", start_cpu_time=");
            sb.append(this.start_cpu_time);
        }
        if (this.end_cpu_time != null) {
            sb.append(", end_cpu_time=");
            sb.append(this.end_cpu_time);
        }
        sb.replace(0, 2, "TimeInfo{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TimeInfo)) {
            return false;
        }
        TimeInfo timeInfo = (TimeInfo) obj;
        if (unknownFields().equals(timeInfo.unknownFields()) && C1516540pZE.LJ(this.start_wall_time, timeInfo.start_wall_time) && C1516540pZE.LJ(this.end_wall_time, timeInfo.end_wall_time) && C1516540pZE.LJ(this.start_cpu_time, timeInfo.start_cpu_time) && C1516540pZE.LJ(this.end_cpu_time, timeInfo.end_cpu_time)) {
            return true;
        }
        return false;
    }

    public TimeInfo(Long l, Long l2, Long l3, Long l4) {
        this(l, l2, l3, l4, ByteString.EMPTY);
    }

    public TimeInfo(Long l, Long l2, Long l3, Long l4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.start_wall_time = l;
        this.end_wall_time = l2;
        this.start_cpu_time = l3;
        this.end_cpu_time = l4;
    }
}
