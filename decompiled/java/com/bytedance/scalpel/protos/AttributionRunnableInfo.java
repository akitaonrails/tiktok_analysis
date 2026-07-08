package com.bytedance.scalpel.protos;

import X.C1516540pZE;
import X.C1C7S;
import com.bytedance.scalpel.protos.AttributionRunnableInfo;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class AttributionRunnableInfo extends Message<AttributionRunnableInfo, C1C7S> {
    public static final ProtoAdapter<AttributionRunnableInfo> ADAPTER = new ProtoAdapter<AttributionRunnableInfo>() { // from class: X.1C7T
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final AttributionRunnableInfo decode(ProtoReader protoReader) {
            C1C7S c1c7s = new C1C7S();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c1c7s.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c1c7s.LJ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c1c7s.LJFF = ProtoAdapter.UINT32.decode(protoReader);
                            break;
                        case 4:
                            c1c7s.LJI = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c1c7s.LJII = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c1c7s.LJIIIIZZ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1c7s.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1c7s.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(AttributionRunnableInfo attributionRunnableInfo) {
            AttributionRunnableInfo attributionRunnableInfo2 = attributionRunnableInfo;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, attributionRunnableInfo2.name) + protoAdapter.encodedSizeWithTag(2, attributionRunnableInfo2.work_thread_name) + ProtoAdapter.UINT32.encodedSizeWithTag(3, attributionRunnableInfo2.cpu_time_cost) + protoAdapter.encodedSizeWithTag(4, attributionRunnableInfo2.runnable_scene) + protoAdapter.encodedSizeWithTag(5, attributionRunnableInfo2.runnable_scene_info) + ProtoAdapter.INT64.encodedSizeWithTag(6, attributionRunnableInfo2.start_wall_time) + attributionRunnableInfo2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, AttributionRunnableInfo attributionRunnableInfo) {
            AttributionRunnableInfo attributionRunnableInfo2 = attributionRunnableInfo;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, attributionRunnableInfo2.name);
            protoAdapter.encodeWithTag(protoWriter, 2, attributionRunnableInfo2.work_thread_name);
            ProtoAdapter.UINT32.encodeWithTag(protoWriter, 3, attributionRunnableInfo2.cpu_time_cost);
            protoAdapter.encodeWithTag(protoWriter, 4, attributionRunnableInfo2.runnable_scene);
            protoAdapter.encodeWithTag(protoWriter, 5, attributionRunnableInfo2.runnable_scene_info);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 6, attributionRunnableInfo2.start_wall_time);
            protoWriter.writeBytes(attributionRunnableInfo2.unknownFields());
        }
    };

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = WireField.Label.REQUIRED, tag = 3)
    public Integer cpu_time_cost;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public String name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public String runnable_scene;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    public String runnable_scene_info;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 6)
    public Long start_wall_time;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 2)
    public String work_thread_name;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((unknownFields().hashCode() * 37) + this.name.hashCode()) * 37) + this.work_thread_name.hashCode()) * 37) + this.cpu_time_cost.hashCode()) * 37;
        String str = this.runnable_scene;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.runnable_scene_info;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Long l = this.start_wall_time;
        int iHashCode4 = iHashCode3 + (l != null ? l.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public C1C7S newBuilder() {
        C1C7S c1c7s = new C1C7S();
        c1c7s.LIZLLL = this.name;
        c1c7s.LJ = this.work_thread_name;
        c1c7s.LJFF = this.cpu_time_cost;
        c1c7s.LJI = this.runnable_scene;
        c1c7s.LJII = this.runnable_scene_info;
        c1c7s.LJIIIIZZ = this.start_wall_time;
        c1c7s.addUnknownFields(unknownFields());
        return c1c7s;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", work_thread_name=");
        sb.append(this.work_thread_name);
        sb.append(", cpu_time_cost=");
        sb.append(this.cpu_time_cost);
        if (this.runnable_scene != null) {
            sb.append(", runnable_scene=");
            sb.append(this.runnable_scene);
        }
        if (this.runnable_scene_info != null) {
            sb.append(", runnable_scene_info=");
            sb.append(this.runnable_scene_info);
        }
        if (this.start_wall_time != null) {
            sb.append(", start_wall_time=");
            sb.append(this.start_wall_time);
        }
        sb.replace(0, 2, "AttributionRunnableInfo{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AttributionRunnableInfo)) {
            return false;
        }
        AttributionRunnableInfo attributionRunnableInfo = (AttributionRunnableInfo) obj;
        if (unknownFields().equals(attributionRunnableInfo.unknownFields()) && this.name.equals(attributionRunnableInfo.name) && this.work_thread_name.equals(attributionRunnableInfo.work_thread_name) && this.cpu_time_cost.equals(attributionRunnableInfo.cpu_time_cost) && C1516540pZE.LJ(this.runnable_scene, attributionRunnableInfo.runnable_scene) && C1516540pZE.LJ(this.runnable_scene_info, attributionRunnableInfo.runnable_scene_info) && C1516540pZE.LJ(this.start_wall_time, attributionRunnableInfo.start_wall_time)) {
            return true;
        }
        return false;
    }

    public AttributionRunnableInfo(String str, String str2, Integer num, String str3, String str4, Long l) {
        this(str, str2, num, str3, str4, l, ByteString.EMPTY);
    }

    public AttributionRunnableInfo(String str, String str2, Integer num, String str3, String str4, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.name = str;
        this.work_thread_name = str2;
        this.cpu_time_cost = num;
        this.runnable_scene = str3;
        this.runnable_scene_info = str4;
        this.start_wall_time = l;
    }
}
