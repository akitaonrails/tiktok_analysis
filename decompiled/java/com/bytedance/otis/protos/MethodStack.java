package com.bytedance.otis.protos;

import X.C1516540pZE;
import X.C1C8O;
import com.bytedance.otis.protos.MethodStack;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class MethodStack extends Message<MethodStack, C1C8O> {
    public static final ProtoAdapter<MethodStack> ADAPTER = new ProtoAdapter<MethodStack>() { // from class: X.1C8P
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final MethodStack decode(ProtoReader protoReader) {
            C1C8O c1c8o = new C1C8O();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c1c8o.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 2:
                            c1c8o.LJ.add(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 3:
                            c1c8o.LJFF = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            c1c8o.LJI = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c1c8o.LJII.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 6:
                            c1c8o.LJIIIIZZ.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 7:
                            c1c8o.LJIIIZ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1c8o.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1c8o.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(MethodStack methodStack) {
            MethodStack methodStack2 = methodStack;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, methodStack2.time) + protoAdapter.asRepeated().encodedSizeWithTag(2, methodStack2.ids) + ProtoAdapter.INT32.encodedSizeWithTag(3, methodStack2.stack_type);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(4, methodStack2.thread_name) + protoAdapter2.asRepeated().encodedSizeWithTag(5, methodStack2.methods) + protoAdapter2.asRepeated().encodedSizeWithTag(6, methodStack2.native_stack) + protoAdapter.encodedSizeWithTag(7, methodStack2.realtime_info_jank) + methodStack2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, MethodStack methodStack) {
            MethodStack methodStack2 = methodStack;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, methodStack2.time);
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 2, methodStack2.ids);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, methodStack2.stack_type);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            protoAdapter2.encodeWithTag(protoWriter, 4, methodStack2.thread_name);
            protoAdapter2.asRepeated().encodeWithTag(protoWriter, 5, methodStack2.methods);
            protoAdapter2.asRepeated().encodeWithTag(protoWriter, 6, methodStack2.native_stack);
            protoAdapter.encodeWithTag(protoWriter, 7, methodStack2.realtime_info_jank);
            protoWriter.writeBytes(methodStack2.unknownFields());
        }
    };

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REPEATED, tag = 2)
    public List<Long> ids;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, tag = 5)
    public List<String> methods;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, tag = 6)
    public List<String> native_stack;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 7)
    public Long realtime_info_jank;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 3)
    public Integer stack_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public String thread_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
    public Long time;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Long l = this.time;
        int iHashCode2 = (((iHashCode + (l != null ? l.hashCode() : 0)) * 37) + this.ids.hashCode()) * 37;
        Integer num = this.stack_type;
        int iHashCode3 = (iHashCode2 + (num != null ? num.hashCode() : 0)) * 37;
        String str = this.thread_name;
        int iHashCode4 = (((((iHashCode3 + (str != null ? str.hashCode() : 0)) * 37) + this.methods.hashCode()) * 37) + this.native_stack.hashCode()) * 37;
        Long l2 = this.realtime_info_jank;
        int iHashCode5 = iHashCode4 + (l2 != null ? l2.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public C1C8O newBuilder() {
        C1C8O c1c8o = new C1C8O();
        c1c8o.LIZLLL = this.time;
        c1c8o.LJ = C1516540pZE.LIZJ("ids", this.ids);
        c1c8o.LJFF = this.stack_type;
        c1c8o.LJI = this.thread_name;
        c1c8o.LJII = C1516540pZE.LIZJ("methods", this.methods);
        c1c8o.LJIIIIZZ = C1516540pZE.LIZJ("native_stack", this.native_stack);
        c1c8o.LJIIIZ = this.realtime_info_jank;
        c1c8o.addUnknownFields(unknownFields());
        return c1c8o;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.time != null) {
            sb.append(", time=");
            sb.append(this.time);
        }
        if (!this.ids.isEmpty()) {
            sb.append(", ids=");
            sb.append(this.ids);
        }
        if (this.stack_type != null) {
            sb.append(", stack_type=");
            sb.append(this.stack_type);
        }
        if (this.thread_name != null) {
            sb.append(", thread_name=");
            sb.append(this.thread_name);
        }
        if (!this.methods.isEmpty()) {
            sb.append(", methods=");
            sb.append(this.methods);
        }
        if (!this.native_stack.isEmpty()) {
            sb.append(", native_stack=");
            sb.append(this.native_stack);
        }
        if (this.realtime_info_jank != null) {
            sb.append(", realtime_info_jank=");
            sb.append(this.realtime_info_jank);
        }
        sb.replace(0, 2, "MethodStack{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MethodStack)) {
            return false;
        }
        MethodStack methodStack = (MethodStack) obj;
        if (unknownFields().equals(methodStack.unknownFields()) && C1516540pZE.LJ(this.time, methodStack.time) && this.ids.equals(methodStack.ids) && C1516540pZE.LJ(this.stack_type, methodStack.stack_type) && C1516540pZE.LJ(this.thread_name, methodStack.thread_name) && this.methods.equals(methodStack.methods) && this.native_stack.equals(methodStack.native_stack) && C1516540pZE.LJ(this.realtime_info_jank, methodStack.realtime_info_jank)) {
            return true;
        }
        return false;
    }

    public MethodStack(Long l, List<Long> list, Integer num, String str, List<String> list2, List<String> list3, Long l2) {
        this(l, list, num, str, list2, list3, l2, ByteString.EMPTY);
    }

    public MethodStack(Long l, List<Long> list, Integer num, String str, List<String> list2, List<String> list3, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.time = l;
        this.ids = C1516540pZE.LJFF("ids", list);
        this.stack_type = num;
        this.thread_name = str;
        this.methods = C1516540pZE.LJFF("methods", list2);
        this.native_stack = C1516540pZE.LJFF("native_stack", list3);
        this.realtime_info_jank = l2;
    }
}
