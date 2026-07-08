package com.bytedance.otis.protos;

import X.C1516540pZE;
import X.C1C83;
import com.bytedance.otis.protos.CPUInfo;
import com.bytedance.otis.protos.RunnableInfo;
import com.bytedance.otis.protos.ThreadInfo;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.tts.oecverify.BdTuring;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class CPUInfo extends Message<CPUInfo, C1C83> {
    public static final ProtoAdapter<CPUInfo> ADAPTER = new ProtoAdapter<CPUInfo>() { // from class: X.1C81
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final CPUInfo decode(ProtoReader protoReader) {
            C1C83 c1c83 = new C1C83();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c1c83.LIZLLL.add(ThreadInfo.ADAPTER.decode(protoReader));
                            break;
                        case 2:
                            c1c83.LJ.add(RunnableInfo.ADAPTER.decode(protoReader));
                            break;
                        case 3:
                            c1c83.LJFF = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            c1c83.LJI = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 5:
                            c1c83.LJII = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 6:
                            c1c83.LJIIIIZZ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 7:
                            c1c83.LJIIIZ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 8:
                            c1c83.LJIIJ = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c1c83.LJIIJJI = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1c83.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1c83.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(CPUInfo cPUInfo) {
            CPUInfo cPUInfo2 = cPUInfo;
            int iEncodedSizeWithTag = ThreadInfo.ADAPTER.asRepeated().encodedSizeWithTag(1, cPUInfo2.thread_infos) + RunnableInfo.ADAPTER.asRepeated().encodedSizeWithTag(2, cPUInfo2.runnable_infos);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(3, cPUInfo2.dev_cpu_time) + protoAdapter.encodedSizeWithTag(4, cPUInfo2.dev_cpu_idle);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            return iEncodedSizeWithTag2 + protoAdapter2.encodedSizeWithTag(5, cPUInfo2.dev_cpu_core_count) + protoAdapter.encodedSizeWithTag(6, cPUInfo2.proc_cpu_time) + protoAdapter.encodedSizeWithTag(7, cPUInfo2.internal_time) + protoAdapter2.encodedSizeWithTag(8, cPUInfo2.thread_count_start) + protoAdapter2.encodedSizeWithTag(9, cPUInfo2.thread_count_end) + cPUInfo2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, CPUInfo cPUInfo) {
            CPUInfo cPUInfo2 = cPUInfo;
            ThreadInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, cPUInfo2.thread_infos);
            RunnableInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, cPUInfo2.runnable_infos);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 3, cPUInfo2.dev_cpu_time);
            protoAdapter.encodeWithTag(protoWriter, 4, cPUInfo2.dev_cpu_idle);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            protoAdapter2.encodeWithTag(protoWriter, 5, cPUInfo2.dev_cpu_core_count);
            protoAdapter.encodeWithTag(protoWriter, 6, cPUInfo2.proc_cpu_time);
            protoAdapter.encodeWithTag(protoWriter, 7, cPUInfo2.internal_time);
            protoAdapter2.encodeWithTag(protoWriter, 8, cPUInfo2.thread_count_start);
            protoAdapter2.encodeWithTag(protoWriter, 9, cPUInfo2.thread_count_end);
            protoWriter.writeBytes(cPUInfo2.unknownFields());
        }
    };

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 5)
    public Integer dev_cpu_core_count;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 4)
    public Long dev_cpu_idle;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
    public Long dev_cpu_time;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 7)
    public Long internal_time;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 6)
    public Long proc_cpu_time;

    @WireField(adapter = "com.bytedance.otis.protos.RunnableInfo#ADAPTER", label = WireField.Label.REPEATED, tag = 2)
    public List<RunnableInfo> runnable_infos;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = BdTuring.TYPE_ECAF)
    public Integer thread_count_end;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 8)
    public Integer thread_count_start;

    @WireField(adapter = "com.bytedance.otis.protos.ThreadInfo#ADAPTER", label = WireField.Label.REPEATED, tag = 1)
    public List<ThreadInfo> thread_infos;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.thread_infos.hashCode()) * 37) + this.runnable_infos.hashCode()) * 37;
        Long l = this.dev_cpu_time;
        int iHashCode2 = (iHashCode + (l != null ? l.hashCode() : 0)) * 37;
        Long l2 = this.dev_cpu_idle;
        int iHashCode3 = (iHashCode2 + (l2 != null ? l2.hashCode() : 0)) * 37;
        Integer num = this.dev_cpu_core_count;
        int iHashCode4 = (iHashCode3 + (num != null ? num.hashCode() : 0)) * 37;
        Long l3 = this.proc_cpu_time;
        int iHashCode5 = (iHashCode4 + (l3 != null ? l3.hashCode() : 0)) * 37;
        Long l4 = this.internal_time;
        int iHashCode6 = (iHashCode5 + (l4 != null ? l4.hashCode() : 0)) * 37;
        Integer num2 = this.thread_count_start;
        int iHashCode7 = (iHashCode6 + (num2 != null ? num2.hashCode() : 0)) * 37;
        Integer num3 = this.thread_count_end;
        int iHashCode8 = iHashCode7 + (num3 != null ? num3.hashCode() : 0);
        this.hashCode = iHashCode8;
        return iHashCode8;
    }

    @Override // com.squareup.wire.Message
    public C1C83 newBuilder() {
        C1C83 c1c83 = new C1C83();
        c1c83.LIZLLL = C1516540pZE.LIZJ("thread_infos", this.thread_infos);
        c1c83.LJ = C1516540pZE.LIZJ("runnable_infos", this.runnable_infos);
        c1c83.LJFF = this.dev_cpu_time;
        c1c83.LJI = this.dev_cpu_idle;
        c1c83.LJII = this.dev_cpu_core_count;
        c1c83.LJIIIIZZ = this.proc_cpu_time;
        c1c83.LJIIIZ = this.internal_time;
        c1c83.LJIIJ = this.thread_count_start;
        c1c83.LJIIJJI = this.thread_count_end;
        c1c83.addUnknownFields(unknownFields());
        return c1c83;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.thread_infos.isEmpty()) {
            sb.append(", thread_infos=");
            sb.append(this.thread_infos);
        }
        if (!this.runnable_infos.isEmpty()) {
            sb.append(", runnable_infos=");
            sb.append(this.runnable_infos);
        }
        if (this.dev_cpu_time != null) {
            sb.append(", dev_cpu_time=");
            sb.append(this.dev_cpu_time);
        }
        if (this.dev_cpu_idle != null) {
            sb.append(", dev_cpu_idle=");
            sb.append(this.dev_cpu_idle);
        }
        if (this.dev_cpu_core_count != null) {
            sb.append(", dev_cpu_core_count=");
            sb.append(this.dev_cpu_core_count);
        }
        if (this.proc_cpu_time != null) {
            sb.append(", proc_cpu_time=");
            sb.append(this.proc_cpu_time);
        }
        if (this.internal_time != null) {
            sb.append(", internal_time=");
            sb.append(this.internal_time);
        }
        if (this.thread_count_start != null) {
            sb.append(", thread_count_start=");
            sb.append(this.thread_count_start);
        }
        if (this.thread_count_end != null) {
            sb.append(", thread_count_end=");
            sb.append(this.thread_count_end);
        }
        sb.replace(0, 2, "CPUInfo{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CPUInfo)) {
            return false;
        }
        CPUInfo cPUInfo = (CPUInfo) obj;
        if (unknownFields().equals(cPUInfo.unknownFields()) && this.thread_infos.equals(cPUInfo.thread_infos) && this.runnable_infos.equals(cPUInfo.runnable_infos) && C1516540pZE.LJ(this.dev_cpu_time, cPUInfo.dev_cpu_time) && C1516540pZE.LJ(this.dev_cpu_idle, cPUInfo.dev_cpu_idle) && C1516540pZE.LJ(this.dev_cpu_core_count, cPUInfo.dev_cpu_core_count) && C1516540pZE.LJ(this.proc_cpu_time, cPUInfo.proc_cpu_time) && C1516540pZE.LJ(this.internal_time, cPUInfo.internal_time) && C1516540pZE.LJ(this.thread_count_start, cPUInfo.thread_count_start) && C1516540pZE.LJ(this.thread_count_end, cPUInfo.thread_count_end)) {
            return true;
        }
        return false;
    }

    public CPUInfo(List<ThreadInfo> list, List<RunnableInfo> list2, Long l, Long l2, Integer num, Long l3, Long l4, Integer num2, Integer num3) {
        this(list, list2, l, l2, num, l3, l4, num2, num3, ByteString.EMPTY);
    }

    public CPUInfo(List<ThreadInfo> list, List<RunnableInfo> list2, Long l, Long l2, Integer num, Long l3, Long l4, Integer num2, Integer num3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.thread_infos = C1516540pZE.LJFF("thread_infos", list);
        this.runnable_infos = C1516540pZE.LJFF("runnable_infos", list2);
        this.dev_cpu_time = l;
        this.dev_cpu_idle = l2;
        this.dev_cpu_core_count = num;
        this.proc_cpu_time = l3;
        this.internal_time = l4;
        this.thread_count_start = num2;
        this.thread_count_end = num3;
    }
}
