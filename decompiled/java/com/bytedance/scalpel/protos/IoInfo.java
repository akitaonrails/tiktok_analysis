package com.bytedance.scalpel.protos;

import X.C09CT;
import X.C1C9H;
import com.bytedance.scalpel.protos.IoInfo;
import com.bytedance.scalpel.protos.MethodStack;
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
public final class IoInfo extends Message<IoInfo, C1C9H> {
    public static final ProtoAdapter<IoInfo> ADAPTER = new ProtoAdapter<IoInfo>() { // from class: X.1C9G
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final IoInfo decode(ProtoReader protoReader) {
            return new C1C9H().build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(IoInfo ioInfo) {
            IoInfo ioInfo2 = ioInfo;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, ioInfo2.name) + protoAdapter.encodedSizeWithTag(2, ioInfo2.ownerStack) + protoAdapter.encodedSizeWithTag(3, ioInfo2.threadName) + TimeInfo.ADAPTER.encodedSizeWithTag(4, ioInfo2.timeInfo) + MethodStack.ADAPTER.encodedSizeWithTag(5, ioInfo2.stack) + TimeStampRange.ADAPTER.encodedSizeWithTag(100, ioInfo2.timeStampRange) + ioInfo2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, IoInfo ioInfo) {
            IoInfo ioInfo2 = ioInfo;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, ioInfo2.name);
            protoAdapter.encodeWithTag(protoWriter, 2, ioInfo2.ownerStack);
            protoAdapter.encodeWithTag(protoWriter, 3, ioInfo2.threadName);
            TimeInfo.ADAPTER.encodeWithTag(protoWriter, 4, ioInfo2.timeInfo);
            MethodStack.ADAPTER.encodeWithTag(protoWriter, 5, ioInfo2.stack);
            TimeStampRange.ADAPTER.encodeWithTag(protoWriter, 100, ioInfo2.timeStampRange);
            protoWriter.writeBytes(ioInfo2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    @C09CT("name")
    public String name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    @C09CT("owner_stack")
    public String ownerStack;

    @WireField(adapter = "com.bytedance.scalpel.protos.MethodStack#ADAPTER", tag = 5)
    @C09CT("stack")
    public MethodStack stack;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    @C09CT("thread_name")
    public String threadName;

    @WireField(adapter = "com.bytedance.scalpel.protos.TimeInfo#ADAPTER", label = WireField.Label.REQUIRED, tag = 4)
    @C09CT("time_info")
    public TimeInfo timeInfo;

    @WireField(adapter = "com.bytedance.scalpel.protos.TimeStampRange#ADAPTER", tag = 100)
    @C09CT("time_stamp_range")
    public TimeStampRange timeStampRange;

    @Override // com.squareup.wire.Message
    public C1C9H newBuilder() {
        C1C9H c1c9h = new C1C9H();
        c1c9h.LIZLLL = this.name;
        c1c9h.LJ = this.ownerStack;
        c1c9h.LJFF = this.threadName;
        c1c9h.LJI = this.timeInfo;
        c1c9h.LJII = this.stack;
        c1c9h.LJIIIIZZ = this.timeStampRange;
        c1c9h.addUnknownFields(unknownFields());
        return c1c9h;
    }

    public IoInfo(String str, String str2, String str3, TimeInfo timeInfo, MethodStack methodStack, TimeStampRange timeStampRange, ByteString byteString) {
        super(ADAPTER, byteString);
        this.name = str;
        this.ownerStack = str2;
        this.threadName = str3;
        this.timeInfo = timeInfo;
        this.stack = methodStack;
        this.timeStampRange = timeStampRange;
    }
}
