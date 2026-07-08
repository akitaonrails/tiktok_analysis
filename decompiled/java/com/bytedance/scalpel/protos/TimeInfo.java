package com.bytedance.scalpel.protos;

import X.C09CT;
import X.C1C95;
import com.bytedance.scalpel.protos.TimeInfo;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class TimeInfo extends Message<TimeInfo, C1C95> {
    public static final ProtoAdapter<TimeInfo> ADAPTER = new ProtoAdapter<TimeInfo>() { // from class: X.1C90
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final TimeInfo decode(ProtoReader protoReader) {
            return new C1C95().build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(TimeInfo timeInfo) {
            TimeInfo timeInfo2 = timeInfo;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return protoAdapter.encodedSizeWithTag(1, timeInfo2.startWallTime) + protoAdapter.encodedSizeWithTag(2, timeInfo2.endWallTime) + protoAdapter.encodedSizeWithTag(3, timeInfo2.startCpuTime) + protoAdapter.encodedSizeWithTag(4, timeInfo2.endCpuTime) + timeInfo2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, TimeInfo timeInfo) {
            TimeInfo timeInfo2 = timeInfo;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, timeInfo2.startWallTime);
            protoAdapter.encodeWithTag(protoWriter, 2, timeInfo2.endWallTime);
            protoAdapter.encodeWithTag(protoWriter, 3, timeInfo2.startCpuTime);
            protoAdapter.encodeWithTag(protoWriter, 4, timeInfo2.endCpuTime);
            protoWriter.writeBytes(timeInfo2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 4)
    @C09CT("end_cpu_time")
    public Long endCpuTime;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    @C09CT("end_wall_time")
    public Long endWallTime;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
    @C09CT("start_cpu_time")
    public Long startCpuTime;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
    @C09CT("start_wall_time")
    public Long startWallTime;

    @Override // com.squareup.wire.Message
    public C1C95 newBuilder() {
        C1C95 c1c95 = new C1C95();
        c1c95.LIZLLL = this.startWallTime;
        c1c95.LJ = this.endWallTime;
        c1c95.LJFF = this.startCpuTime;
        c1c95.LJI = this.endCpuTime;
        c1c95.addUnknownFields(unknownFields());
        return c1c95;
    }

    public TimeInfo(Long l, Long l2, Long l3, Long l4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.startWallTime = l;
        this.endWallTime = l2;
        this.startCpuTime = l3;
        this.endCpuTime = l4;
    }
}
