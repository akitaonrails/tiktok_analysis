package com.bytedance.scalpel.protos;

import X.C09CT;
import X.C1516540pZE;
import X.C1C98;
import com.bytedance.scalpel.protos.BinderInfo;
import com.bytedance.scalpel.protos.GCRecord;
import com.bytedance.scalpel.protos.IoInfo;
import com.bytedance.scalpel.protos.LockInfo;
import com.bytedance.scalpel.protos.MsgInfo;
import com.bytedance.scalpel.protos.PerformanceInfo;
import com.bytedance.scalpel.protos.RunnableInfo;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class PerformanceInfo extends Message<PerformanceInfo, C1C98> {
    public static final ProtoAdapter<PerformanceInfo> ADAPTER = new ProtoAdapter<PerformanceInfo>() { // from class: X.1C99
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final PerformanceInfo decode(ProtoReader protoReader) {
            return new C1C98().build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(PerformanceInfo performanceInfo) {
            PerformanceInfo performanceInfo2 = performanceInfo;
            return GCRecord.ADAPTER.asRepeated().encodedSizeWithTag(1, performanceInfo2.gcRecordList) + BinderInfo.ADAPTER.asRepeated().encodedSizeWithTag(2, performanceInfo2.binderInfoList) + LockInfo.ADAPTER.asRepeated().encodedSizeWithTag(3, performanceInfo2.lockInfoList) + MsgInfo.ADAPTER.asRepeated().encodedSizeWithTag(4, performanceInfo2.msgInfoList) + RunnableInfo.ADAPTER.asRepeated().encodedSizeWithTag(5, performanceInfo2.runnableInfoList) + IoInfo.ADAPTER.asRepeated().encodedSizeWithTag(6, performanceInfo2.ioInfoList) + performanceInfo2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, PerformanceInfo performanceInfo) {
            PerformanceInfo performanceInfo2 = performanceInfo;
            GCRecord.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, performanceInfo2.gcRecordList);
            BinderInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, performanceInfo2.binderInfoList);
            LockInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, performanceInfo2.lockInfoList);
            MsgInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, performanceInfo2.msgInfoList);
            RunnableInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, performanceInfo2.runnableInfoList);
            IoInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 6, performanceInfo2.ioInfoList);
            protoWriter.writeBytes(performanceInfo2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.bytedance.scalpel.protos.BinderInfo#ADAPTER", label = WireField.Label.REPEATED, tag = 2)
    @C09CT("binder_info_list")
    public List<BinderInfo> binderInfoList;

    @WireField(adapter = "com.bytedance.scalpel.protos.GCRecord#ADAPTER", label = WireField.Label.REPEATED, tag = 1)
    @C09CT("gc_record_list")
    public List<GCRecord> gcRecordList;

    @WireField(adapter = "com.bytedance.scalpel.protos.IoInfo#ADAPTER", label = WireField.Label.REPEATED, tag = 6)
    @C09CT("io_info_list")
    public List<IoInfo> ioInfoList;

    @WireField(adapter = "com.bytedance.scalpel.protos.LockInfo#ADAPTER", label = WireField.Label.REPEATED, tag = 3)
    @C09CT("lock_info_list")
    public List<LockInfo> lockInfoList;

    @WireField(adapter = "com.bytedance.scalpel.protos.MsgInfo#ADAPTER", label = WireField.Label.REPEATED, tag = 4)
    @C09CT("msg_info_list")
    public List<MsgInfo> msgInfoList;

    @WireField(adapter = "com.bytedance.scalpel.protos.RunnableInfo#ADAPTER", label = WireField.Label.REPEATED, tag = 5)
    @C09CT("runnable_info_list")
    public List<RunnableInfo> runnableInfoList;

    @Override // com.squareup.wire.Message
    public C1C98 newBuilder() {
        C1C98 c1c98 = new C1C98();
        c1c98.LIZLLL = C1516540pZE.LIZJ("gcRecordList", this.gcRecordList);
        c1c98.LJ = C1516540pZE.LIZJ("binderInfoList", this.binderInfoList);
        c1c98.LJFF = C1516540pZE.LIZJ("lockInfoList", this.lockInfoList);
        c1c98.LJI = C1516540pZE.LIZJ("msgInfoList", this.msgInfoList);
        c1c98.LJII = C1516540pZE.LIZJ("runnableInfoList", this.runnableInfoList);
        c1c98.LJIIIIZZ = C1516540pZE.LIZJ("ioInfoList", this.ioInfoList);
        c1c98.addUnknownFields(unknownFields());
        return c1c98;
    }

    public PerformanceInfo(List<GCRecord> list, List<BinderInfo> list2, List<LockInfo> list3, List<MsgInfo> list4, List<RunnableInfo> list5, List<IoInfo> list6, ByteString byteString) {
        super(ADAPTER, byteString);
        this.gcRecordList = C1516540pZE.LJFF("gcRecordList", list);
        this.binderInfoList = C1516540pZE.LJFF("binderInfoList", list2);
        this.lockInfoList = C1516540pZE.LJFF("lockInfoList", list3);
        this.msgInfoList = C1516540pZE.LJFF("msgInfoList", list4);
        this.runnableInfoList = C1516540pZE.LJFF("runnableInfoList", list5);
        this.ioInfoList = C1516540pZE.LJFF("ioInfoList", list6);
    }
}
