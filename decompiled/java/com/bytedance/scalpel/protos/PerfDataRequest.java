package com.bytedance.scalpel.protos;

import X.C09CT;
import X.C1516540pZE;
import X.C2225501C8m;
import com.bytedance.scalpel.protos.PerfData;
import com.bytedance.scalpel.protos.PerfDataRequest;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class PerfDataRequest extends Message<PerfDataRequest, C2225501C8m> {
    public static final ProtoAdapter<PerfDataRequest> ADAPTER = new ProtoAdapter<PerfDataRequest>() { // from class: X.1C8k
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final PerfDataRequest decode(ProtoReader protoReader) {
            return new C2225501C8m().build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(PerfDataRequest perfDataRequest) {
            PerfDataRequest perfDataRequest2 = perfDataRequest;
            return PerfData.ADAPTER.asRepeated().encodedSizeWithTag(1, perfDataRequest2.datas) + ProtoAdapter.UINT64.encodedSizeWithTag(2, perfDataRequest2.buildTime) + ProtoAdapter.STRING.encodedSizeWithTag(3, perfDataRequest2.releaseBuild) + perfDataRequest2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, PerfDataRequest perfDataRequest) {
            PerfDataRequest perfDataRequest2 = perfDataRequest;
            PerfData.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, perfDataRequest2.datas);
            ProtoAdapter.UINT64.encodeWithTag(protoWriter, 2, perfDataRequest2.buildTime);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, perfDataRequest2.releaseBuild);
            protoWriter.writeBytes(perfDataRequest2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT64", tag = 2)
    @C09CT("build_time")
    public Long buildTime;

    @WireField(adapter = "com.bytedance.scalpel.protos.PerfData#ADAPTER", label = WireField.Label.REPEATED, tag = 1)
    @C09CT("datas")
    public List<PerfData> datas;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    @C09CT("release_build")
    public String releaseBuild;

    @Override // com.squareup.wire.Message
    public C2225501C8m newBuilder() {
        C2225501C8m c2225501C8m = new C2225501C8m();
        c2225501C8m.LIZLLL = C1516540pZE.LIZJ("datas", this.datas);
        c2225501C8m.LJ = this.buildTime;
        c2225501C8m.LJFF = this.releaseBuild;
        c2225501C8m.addUnknownFields(unknownFields());
        return c2225501C8m;
    }

    public PerfDataRequest(List<PerfData> list, Long l, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.datas = C1516540pZE.LJFF("datas", list);
        this.buildTime = l;
        this.releaseBuild = str;
    }
}
