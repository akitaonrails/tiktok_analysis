package com.bytedance.scalpel.protos;

import X.C09CT;
import X.C1516540pZE;
import X.C1C91;
import com.bytedance.scalpel.protos.MethodStack;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class MethodStack extends Message<MethodStack, C1C91> {
    public static final ProtoAdapter<MethodStack> ADAPTER = new ProtoAdapter<MethodStack>() { // from class: X.1C92
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final MethodStack decode(ProtoReader protoReader) {
            return new C1C91().build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(MethodStack methodStack) {
            MethodStack methodStack2 = methodStack;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, methodStack2.time) + protoAdapter.asRepeated().encodedSizeWithTag(2, methodStack2.ids) + ProtoAdapter.INT32.encodedSizeWithTag(3, methodStack2.stackType);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(4, methodStack2.threadName) + protoAdapter2.asRepeated().encodedSizeWithTag(5, methodStack2.methods) + protoAdapter2.asRepeated().encodedSizeWithTag(6, methodStack2.nativeStack) + protoAdapter.encodedSizeWithTag(7, methodStack2.realtimeInfoJank) + methodStack2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, MethodStack methodStack) {
            MethodStack methodStack2 = methodStack;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, methodStack2.time);
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 2, methodStack2.ids);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, methodStack2.stackType);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            protoAdapter2.encodeWithTag(protoWriter, 4, methodStack2.threadName);
            protoAdapter2.asRepeated().encodeWithTag(protoWriter, 5, methodStack2.methods);
            protoAdapter2.asRepeated().encodeWithTag(protoWriter, 6, methodStack2.nativeStack);
            protoAdapter.encodeWithTag(protoWriter, 7, methodStack2.realtimeInfoJank);
            protoWriter.writeBytes(methodStack2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REPEATED, tag = 2)
    @C09CT("ids")
    public List<Long> ids;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, tag = 5)
    @C09CT("methods")
    public List<String> methods;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, tag = 6)
    @C09CT("realtime_info_jank")
    public List<String> nativeStack;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 7)
    @C09CT("realtime_info_jank")
    public Long realtimeInfoJank;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 3)
    @C09CT("stack_type")
    public Integer stackType;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    @C09CT("thread_name")
    public String threadName;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 1)
    @C09CT("time")
    public Long time;

    @Override // com.squareup.wire.Message
    public C1C91 newBuilder() {
        C1C91 c1c91 = new C1C91();
        c1c91.LIZLLL = this.time;
        c1c91.LJ = C1516540pZE.LIZJ("ids", this.ids);
        c1c91.LJFF = this.stackType;
        c1c91.LJI = this.threadName;
        c1c91.LJII = C1516540pZE.LIZJ("methods", this.methods);
        c1c91.LJIIIIZZ = C1516540pZE.LIZJ("nativeStack", this.nativeStack);
        c1c91.LJIIIZ = this.realtimeInfoJank;
        c1c91.addUnknownFields(unknownFields());
        return c1c91;
    }

    public MethodStack(Long l, List<Long> list, Integer num, String str, List<String> list2, List<String> list3, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.time = l;
        this.ids = C1516540pZE.LJFF("ids", list);
        this.stackType = num;
        this.threadName = str;
        this.methods = C1516540pZE.LJFF("methods", list2);
        this.nativeStack = C1516540pZE.LJFF("nativeStack", list3);
        this.realtimeInfoJank = l2;
    }
}
