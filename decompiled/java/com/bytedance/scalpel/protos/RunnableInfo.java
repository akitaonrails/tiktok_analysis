package com.bytedance.scalpel.protos;

import X.C09CT;
import X.C1C9F;
import com.bytedance.scalpel.protos.MethodStack;
import com.bytedance.scalpel.protos.RunnableInfo;
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
public final class RunnableInfo extends Message<RunnableInfo, C1C9F> {
    public static final ProtoAdapter<RunnableInfo> ADAPTER = new ProtoAdapter<RunnableInfo>() { // from class: X.1C9E
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final RunnableInfo decode(ProtoReader protoReader) {
            return new C1C9F().build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(RunnableInfo runnableInfo) {
            RunnableInfo runnableInfo2 = runnableInfo;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, runnableInfo2.name) + protoAdapter.encodedSizeWithTag(2, runnableInfo2.threadName) + TimeInfo.ADAPTER.encodedSizeWithTag(3, runnableInfo2.timeInfo) + MethodStack.ADAPTER.encodedSizeWithTag(4, runnableInfo2.methodStack) + ProtoAdapter.INT32.encodedSizeWithTag(5, runnableInfo2.tag) + ProtoAdapter.BOOL.encodedSizeWithTag(6, runnableInfo2.nameismethod) + TimeStampRange.ADAPTER.encodedSizeWithTag(100, runnableInfo2.timeStampRange) + runnableInfo2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, RunnableInfo runnableInfo) {
            RunnableInfo runnableInfo2 = runnableInfo;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, runnableInfo2.name);
            protoAdapter.encodeWithTag(protoWriter, 2, runnableInfo2.threadName);
            TimeInfo.ADAPTER.encodeWithTag(protoWriter, 3, runnableInfo2.timeInfo);
            MethodStack.ADAPTER.encodeWithTag(protoWriter, 4, runnableInfo2.methodStack);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, runnableInfo2.tag);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, runnableInfo2.nameismethod);
            TimeStampRange.ADAPTER.encodeWithTag(protoWriter, 100, runnableInfo2.timeStampRange);
            protoWriter.writeBytes(runnableInfo2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.bytedance.scalpel.protos.MethodStack#ADAPTER", tag = 4)
    @C09CT("method_stack")
    public MethodStack methodStack;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    @C09CT("name")
    public String name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 6)
    @C09CT("nameIsMethod")
    public Boolean nameismethod;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 5)
    @C09CT("tag")
    public Integer tag;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 2)
    @C09CT("thread_name")
    public String threadName;

    @WireField(adapter = "com.bytedance.scalpel.protos.TimeInfo#ADAPTER", label = WireField.Label.REQUIRED, tag = 3)
    @C09CT("time_info")
    public TimeInfo timeInfo;

    @WireField(adapter = "com.bytedance.scalpel.protos.TimeStampRange#ADAPTER", tag = 100)
    @C09CT("time_stamp_range")
    public TimeStampRange timeStampRange;

    @Override // com.squareup.wire.Message
    public C1C9F newBuilder() {
        C1C9F c1c9f = new C1C9F();
        c1c9f.LIZLLL = this.name;
        c1c9f.LJ = this.threadName;
        c1c9f.LJFF = this.timeInfo;
        c1c9f.LJI = this.methodStack;
        c1c9f.LJII = this.tag;
        c1c9f.LJIIIIZZ = this.nameismethod;
        c1c9f.LJIIIZ = this.timeStampRange;
        c1c9f.addUnknownFields(unknownFields());
        return c1c9f;
    }

    public RunnableInfo(String str, String str2, TimeInfo timeInfo, MethodStack methodStack, Integer num, Boolean bool, TimeStampRange timeStampRange, ByteString byteString) {
        super(ADAPTER, byteString);
        this.name = str;
        this.threadName = str2;
        this.timeInfo = timeInfo;
        this.methodStack = methodStack;
        this.tag = num;
        this.nameismethod = bool;
        this.timeStampRange = timeStampRange;
    }
}
