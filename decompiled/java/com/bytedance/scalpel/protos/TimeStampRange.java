package com.bytedance.scalpel.protos;

import X.C09CT;
import X.C1C96;
import com.bytedance.scalpel.protos.TimeStampRange;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class TimeStampRange extends Message<TimeStampRange, C1C96> {
    public static final ProtoAdapter<TimeStampRange> ADAPTER = new ProtoAdapter<TimeStampRange>() { // from class: X.1C97
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final TimeStampRange decode(ProtoReader protoReader) {
            return new C1C96().build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(TimeStampRange timeStampRange) {
            TimeStampRange timeStampRange2 = timeStampRange;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return protoAdapter.encodedSizeWithTag(1, timeStampRange2.startTimestamp) + protoAdapter.encodedSizeWithTag(2, timeStampRange2.endTimestamp) + timeStampRange2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, TimeStampRange timeStampRange) {
            TimeStampRange timeStampRange2 = timeStampRange;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, timeStampRange2.startTimestamp);
            protoAdapter.encodeWithTag(protoWriter, 2, timeStampRange2.endTimestamp);
            protoWriter.writeBytes(timeStampRange2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    @C09CT("end_timestamp")
    public Long endTimestamp;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
    @C09CT("start_timestamp")
    public Long startTimestamp;

    @Override // com.squareup.wire.Message
    public C1C96 newBuilder() {
        C1C96 c1c96 = new C1C96();
        c1c96.LIZLLL = this.startTimestamp;
        c1c96.LJ = this.endTimestamp;
        c1c96.addUnknownFields(unknownFields());
        return c1c96;
    }

    public TimeStampRange(Long l, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.startTimestamp = l;
        this.endTimestamp = l2;
    }
}
