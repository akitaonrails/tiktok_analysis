package com.bytedance.otis.protos;

import X.C1516540pZE;
import X.C1C8G;
import com.bytedance.otis.protos.PerfData;
import com.bytedance.otis.protos.PerfDataRequest;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class PerfDataRequest extends Message<PerfDataRequest, C1C8G> {
    public static final ProtoAdapter<PerfDataRequest> ADAPTER = new ProtoAdapter<PerfDataRequest>() { // from class: X.1C8F
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final PerfDataRequest decode(ProtoReader protoReader) {
            C1C8G c1c8g = new C1C8G();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c1c8g.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c1c8g.LJFF = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c1c8g.LJ = ProtoAdapter.UINT64.decode(protoReader);
                        }
                    } else {
                        c1c8g.LIZLLL.add(PerfData.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1c8g.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(PerfDataRequest perfDataRequest) {
            PerfDataRequest perfDataRequest2 = perfDataRequest;
            return PerfData.ADAPTER.asRepeated().encodedSizeWithTag(1, perfDataRequest2.datas) + ProtoAdapter.UINT64.encodedSizeWithTag(2, perfDataRequest2.build_time) + ProtoAdapter.STRING.encodedSizeWithTag(3, perfDataRequest2.release_build) + perfDataRequest2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, PerfDataRequest perfDataRequest) {
            PerfDataRequest perfDataRequest2 = perfDataRequest;
            PerfData.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, perfDataRequest2.datas);
            ProtoAdapter.UINT64.encodeWithTag(protoWriter, 2, perfDataRequest2.build_time);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, perfDataRequest2.release_build);
            protoWriter.writeBytes(perfDataRequest2.unknownFields());
        }
    };

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT64", tag = 2)
    public Long build_time;

    @WireField(adapter = "com.bytedance.otis.protos.PerfData#ADAPTER", label = WireField.Label.REPEATED, tag = 1)
    public List<PerfData> datas;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public String release_build;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.datas.hashCode()) * 37;
        Long l = this.build_time;
        int iHashCode2 = (iHashCode + (l != null ? l.hashCode() : 0)) * 37;
        String str = this.release_build;
        int iHashCode3 = iHashCode2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public C1C8G newBuilder() {
        C1C8G c1c8g = new C1C8G();
        c1c8g.LIZLLL = C1516540pZE.LIZJ("datas", this.datas);
        c1c8g.LJ = this.build_time;
        c1c8g.LJFF = this.release_build;
        c1c8g.addUnknownFields(unknownFields());
        return c1c8g;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.datas.isEmpty()) {
            sb.append(", datas=");
            sb.append(this.datas);
        }
        if (this.build_time != null) {
            sb.append(", build_time=");
            sb.append(this.build_time);
        }
        if (this.release_build != null) {
            sb.append(", release_build=");
            sb.append(this.release_build);
        }
        sb.replace(0, 2, "PerfDataRequest{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PerfDataRequest)) {
            return false;
        }
        PerfDataRequest perfDataRequest = (PerfDataRequest) obj;
        if (unknownFields().equals(perfDataRequest.unknownFields()) && this.datas.equals(perfDataRequest.datas) && C1516540pZE.LJ(this.build_time, perfDataRequest.build_time) && C1516540pZE.LJ(this.release_build, perfDataRequest.release_build)) {
            return true;
        }
        return false;
    }

    public PerfDataRequest(List<PerfData> list, Long l, String str) {
        this(list, l, str, ByteString.EMPTY);
    }

    public PerfDataRequest(List<PerfData> list, Long l, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.datas = C1516540pZE.LJFF("datas", list);
        this.build_time = l;
        this.release_build = str;
    }
}
