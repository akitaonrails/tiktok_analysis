package com.bytedance.scalpel.protos;

import X.C09CT;
import X.C1C9J;
import com.bytedance.scalpel.protos.BinderInfo;
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
public final class BinderInfo extends Message<BinderInfo, C1C9J> {
    public static final ProtoAdapter<BinderInfo> ADAPTER = new ProtoAdapter<BinderInfo>() { // from class: X.1C9I
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final BinderInfo decode(ProtoReader protoReader) {
            return new C1C9J().build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(BinderInfo binderInfo) {
            BinderInfo binderInfo2 = binderInfo;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, binderInfo2.interfaceName) + ProtoAdapter.INT32.encodedSizeWithTag(2, binderInfo2.transactCode) + protoAdapter.encodedSizeWithTag(3, binderInfo2.transactName) + protoAdapter.encodedSizeWithTag(4, binderInfo2.threadName) + TimeInfo.ADAPTER.encodedSizeWithTag(5, binderInfo2.timeInfo) + MethodStack.ADAPTER.encodedSizeWithTag(6, binderInfo2.stack) + TimeStampRange.ADAPTER.encodedSizeWithTag(100, binderInfo2.timeStampRange) + binderInfo2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, BinderInfo binderInfo) {
            BinderInfo binderInfo2 = binderInfo;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, binderInfo2.interfaceName);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, binderInfo2.transactCode);
            protoAdapter.encodeWithTag(protoWriter, 3, binderInfo2.transactName);
            protoAdapter.encodeWithTag(protoWriter, 4, binderInfo2.threadName);
            TimeInfo.ADAPTER.encodeWithTag(protoWriter, 5, binderInfo2.timeInfo);
            MethodStack.ADAPTER.encodeWithTag(protoWriter, 6, binderInfo2.stack);
            TimeStampRange.ADAPTER.encodeWithTag(protoWriter, 100, binderInfo2.timeStampRange);
            protoWriter.writeBytes(binderInfo2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    @C09CT("interface_name")
    public String interfaceName;

    @WireField(adapter = "com.bytedance.scalpel.protos.MethodStack#ADAPTER", tag = 6)
    @C09CT("stack")
    public MethodStack stack;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 4)
    @C09CT("thread_name")
    public String threadName;

    @WireField(adapter = "com.bytedance.scalpel.protos.TimeInfo#ADAPTER", label = WireField.Label.REQUIRED, tag = 5)
    @C09CT("time_info")
    public TimeInfo timeInfo;

    @WireField(adapter = "com.bytedance.scalpel.protos.TimeStampRange#ADAPTER", tag = 100)
    @C09CT("time_stamp_range")
    public TimeStampRange timeStampRange;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.REQUIRED, tag = 2)
    @C09CT("transact_code")
    public Integer transactCode;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    @C09CT("transact_name")
    public String transactName;

    @Override // com.squareup.wire.Message
    public C1C9J newBuilder() {
        C1C9J c1c9j = new C1C9J();
        c1c9j.LIZLLL = this.interfaceName;
        c1c9j.LJ = this.transactCode;
        c1c9j.LJFF = this.transactName;
        c1c9j.LJI = this.threadName;
        c1c9j.LJII = this.timeInfo;
        c1c9j.LJIIIIZZ = this.stack;
        c1c9j.LJIIIZ = this.timeStampRange;
        c1c9j.addUnknownFields(unknownFields());
        return c1c9j;
    }

    public BinderInfo(String str, Integer num, String str2, String str3, TimeInfo timeInfo, MethodStack methodStack, TimeStampRange timeStampRange, ByteString byteString) {
        super(ADAPTER, byteString);
        this.interfaceName = str;
        this.transactCode = num;
        this.transactName = str2;
        this.threadName = str3;
        this.timeInfo = timeInfo;
        this.stack = methodStack;
        this.timeStampRange = timeStampRange;
    }
}
