package com.bytedance.scalpel.protos;

import X.C09CT;
import X.C1C9B;
import com.bytedance.scalpel.protos.GCRecord;
import com.bytedance.scalpel.protos.TimeInfo;
import com.bytedance.scalpel.protos.TimeStampRange;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class GCRecord extends Message<GCRecord, C1C9B> {
    public static final ProtoAdapter<GCRecord> ADAPTER = new ProtoAdapter<GCRecord>() { // from class: X.1C9A
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final GCRecord decode(ProtoReader protoReader) {
            return new C1C9B().build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(GCRecord gCRecord) {
            GCRecord gCRecord2 = gCRecord;
            int iEncodedSizeWithTag = ProtoAdapter.UINT32.encodedSizeWithTag(1, gCRecord2.gcType);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.UINT64;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, gCRecord2.allocSize) + protoAdapter.encodedSizeWithTag(3, gCRecord2.startTime) + protoAdapter.encodedSizeWithTag(4, gCRecord2.endTime) + ProtoAdapter.STRING.encodedSizeWithTag(5, gCRecord2.threadName) + TimeInfo.ADAPTER.encodedSizeWithTag(6, gCRecord2.timeInfo) + TimeStampRange.ADAPTER.encodedSizeWithTag(100, gCRecord2.timeStampRange) + gCRecord2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, GCRecord gCRecord) {
            GCRecord gCRecord2 = gCRecord;
            ProtoAdapter.UINT32.encodeWithTag(protoWriter, 1, gCRecord2.gcType);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.UINT64;
            protoAdapter.encodeWithTag(protoWriter, 2, gCRecord2.allocSize);
            protoAdapter.encodeWithTag(protoWriter, 3, gCRecord2.startTime);
            protoAdapter.encodeWithTag(protoWriter, 4, gCRecord2.endTime);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, gCRecord2.threadName);
            TimeInfo.ADAPTER.encodeWithTag(protoWriter, 6, gCRecord2.timeInfo);
            TimeStampRange.ADAPTER.encodeWithTag(protoWriter, 100, gCRecord2.timeStampRange);
            protoWriter.writeBytes(gCRecord2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT64", label = WireField.Label.REQUIRED, tag = 2)
    @C09CT("alloc_size")
    public Long allocSize;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT64", label = WireField.Label.REQUIRED, tag = 4)
    @C09CT("end_time")
    public Long endTime;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = WireField.Label.REQUIRED, tag = 1)
    @C09CT("gc_type")
    public Integer gcType;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT64", label = WireField.Label.REQUIRED, tag = 3)
    @C09CT("start_time")
    public Long startTime;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    @C09CT("thread_name")
    public String threadName;

    @WireField(adapter = "com.bytedance.scalpel.protos.TimeInfo#ADAPTER", tag = 6)
    @C09CT("time_info")
    public TimeInfo timeInfo;

    @WireField(adapter = "com.bytedance.scalpel.protos.TimeStampRange#ADAPTER", tag = 100)
    @C09CT("time_stamp_range")
    public TimeStampRange timeStampRange;

    @Override // com.squareup.wire.Message
    public C1C9B newBuilder() {
        C1C9B c1c9b = new C1C9B();
        c1c9b.LIZLLL = this.gcType;
        c1c9b.LJ = this.allocSize;
        c1c9b.LJFF = this.startTime;
        c1c9b.LJI = this.endTime;
        c1c9b.LJII = this.threadName;
        c1c9b.LJIIIIZZ = this.timeInfo;
        c1c9b.LJIIIZ = this.timeStampRange;
        c1c9b.addUnknownFields(unknownFields());
        return c1c9b;
    }

    public GCRecord(Integer num, Long l, Long l2, Long l3, String str, TimeInfo timeInfo, TimeStampRange timeStampRange, ByteString byteString) {
        super(ADAPTER, byteString);
        this.gcType = num;
        this.allocSize = l;
        this.startTime = l2;
        this.endTime = l3;
        this.threadName = str;
        this.timeInfo = timeInfo;
        this.timeStampRange = timeStampRange;
    }
}
