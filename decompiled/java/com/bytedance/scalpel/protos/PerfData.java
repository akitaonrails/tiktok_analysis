package com.bytedance.scalpel.protos;

import X.C09CT;
import X.C2225471C8j;
import com.bytedance.scalpel.protos.PerfData;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class PerfData extends Message<PerfData, C2225471C8j> {
    public static final ProtoAdapter<PerfData> ADAPTER = new ProtoAdapter<PerfData>() { // from class: X.1C8l
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final PerfData decode(ProtoReader protoReader) {
            return new C2225471C8j().build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(PerfData perfData) {
            PerfData perfData2 = perfData;
            return ProtoAdapter.UINT64.encodedSizeWithTag(1, perfData2.timestamp) + ProtoAdapter.UINT32.encodedSizeWithTag(2, perfData2.dataType) + ProtoAdapter.BYTES.encodedSizeWithTag(3, perfData2.data) + perfData2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, PerfData perfData) {
            PerfData perfData2 = perfData;
            ProtoAdapter.UINT64.encodeWithTag(protoWriter, 1, perfData2.timestamp);
            ProtoAdapter.UINT32.encodeWithTag(protoWriter, 2, perfData2.dataType);
            ProtoAdapter.BYTES.encodeWithTag(protoWriter, 3, perfData2.data);
            protoWriter.writeBytes(perfData2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", tag = 3)
    @C09CT("data")
    public ByteString data;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = WireField.Label.REQUIRED, tag = 2)
    @C09CT("data_type")
    public Integer dataType;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT64", label = WireField.Label.REQUIRED, tag = 1)
    @C09CT("timestamp")
    public Long timestamp;

    @Override // com.squareup.wire.Message
    public C2225471C8j newBuilder() {
        C2225471C8j c2225471C8j = new C2225471C8j();
        c2225471C8j.LIZLLL = this.timestamp;
        c2225471C8j.LJ = this.dataType;
        c2225471C8j.LJFF = this.data;
        c2225471C8j.addUnknownFields(unknownFields());
        return c2225471C8j;
    }

    public PerfData(Long l, Integer num, ByteString byteString, ByteString byteString2) {
        super(ADAPTER, byteString2);
        this.timestamp = l;
        this.dataType = num;
        this.data = byteString;
    }
}
