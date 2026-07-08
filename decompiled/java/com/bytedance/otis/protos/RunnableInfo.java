package com.bytedance.otis.protos;

import X.C1516540pZE;
import X.C2225131C7b;
import com.bytedance.otis.protos.RunnableInfo;
import com.bytedance.otis.protos.SceneData;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class RunnableInfo extends Message<RunnableInfo, C2225131C7b> {
    public static final ProtoAdapter<RunnableInfo> ADAPTER = new ProtoAdapter<RunnableInfo>() { // from class: X.1C7c
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final RunnableInfo decode(ProtoReader protoReader) {
            C2225131C7b c2225131C7b = new C2225131C7b();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    if (iNextTag != 5) {
                                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                        c2225131C7b.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                    } else {
                                        c2225131C7b.LJII = SceneData.ADAPTER.decode(protoReader);
                                    }
                                } else {
                                    c2225131C7b.LJI = SceneData.ADAPTER.decode(protoReader);
                                }
                            } else {
                                c2225131C7b.LJFF = ProtoAdapter.INT64.decode(protoReader);
                            }
                        } else {
                            c2225131C7b.LJ = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c2225131C7b.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2225131C7b.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(RunnableInfo runnableInfo) {
            RunnableInfo runnableInfo2 = runnableInfo;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, runnableInfo2.name) + protoAdapter.encodedSizeWithTag(2, runnableInfo2.work_thread_name) + ProtoAdapter.INT64.encodedSizeWithTag(3, runnableInfo2.cpu_time_cost);
            ProtoAdapter<SceneData> protoAdapter2 = SceneData.ADAPTER;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(4, runnableInfo2.runnable_scene_start) + protoAdapter2.encodedSizeWithTag(5, runnableInfo2.runnable_scene_end) + runnableInfo2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, RunnableInfo runnableInfo) {
            RunnableInfo runnableInfo2 = runnableInfo;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, runnableInfo2.name);
            protoAdapter.encodeWithTag(protoWriter, 2, runnableInfo2.work_thread_name);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, runnableInfo2.cpu_time_cost);
            ProtoAdapter<SceneData> protoAdapter2 = SceneData.ADAPTER;
            protoAdapter2.encodeWithTag(protoWriter, 4, runnableInfo2.runnable_scene_start);
            protoAdapter2.encodeWithTag(protoWriter, 5, runnableInfo2.runnable_scene_end);
            protoWriter.writeBytes(runnableInfo2.unknownFields());
        }
    };

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
    public Long cpu_time_cost;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String name;

    @WireField(adapter = "com.bytedance.otis.protos.SceneData#ADAPTER", tag = 5)
    public SceneData runnable_scene_end;

    @WireField(adapter = "com.bytedance.otis.protos.SceneData#ADAPTER", tag = 4)
    public SceneData runnable_scene_start;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String work_thread_name;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.work_thread_name;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Long l = this.cpu_time_cost;
        int iHashCode4 = (iHashCode3 + (l != null ? l.hashCode() : 0)) * 37;
        SceneData sceneData = this.runnable_scene_start;
        int iHashCode5 = (iHashCode4 + (sceneData != null ? sceneData.hashCode() : 0)) * 37;
        SceneData sceneData2 = this.runnable_scene_end;
        int iHashCode6 = iHashCode5 + (sceneData2 != null ? sceneData2.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.squareup.wire.Message
    public C2225131C7b newBuilder() {
        C2225131C7b c2225131C7b = new C2225131C7b();
        c2225131C7b.LIZLLL = this.name;
        c2225131C7b.LJ = this.work_thread_name;
        c2225131C7b.LJFF = this.cpu_time_cost;
        c2225131C7b.LJI = this.runnable_scene_start;
        c2225131C7b.LJII = this.runnable_scene_end;
        c2225131C7b.addUnknownFields(unknownFields());
        return c2225131C7b;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        if (this.work_thread_name != null) {
            sb.append(", work_thread_name=");
            sb.append(this.work_thread_name);
        }
        if (this.cpu_time_cost != null) {
            sb.append(", cpu_time_cost=");
            sb.append(this.cpu_time_cost);
        }
        if (this.runnable_scene_start != null) {
            sb.append(", runnable_scene_start=");
            sb.append(this.runnable_scene_start);
        }
        if (this.runnable_scene_end != null) {
            sb.append(", runnable_scene_end=");
            sb.append(this.runnable_scene_end);
        }
        sb.replace(0, 2, "RunnableInfo{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RunnableInfo)) {
            return false;
        }
        RunnableInfo runnableInfo = (RunnableInfo) obj;
        if (unknownFields().equals(runnableInfo.unknownFields()) && C1516540pZE.LJ(this.name, runnableInfo.name) && C1516540pZE.LJ(this.work_thread_name, runnableInfo.work_thread_name) && C1516540pZE.LJ(this.cpu_time_cost, runnableInfo.cpu_time_cost) && C1516540pZE.LJ(this.runnable_scene_start, runnableInfo.runnable_scene_start) && C1516540pZE.LJ(this.runnable_scene_end, runnableInfo.runnable_scene_end)) {
            return true;
        }
        return false;
    }

    public RunnableInfo(String str, String str2, Long l, SceneData sceneData, SceneData sceneData2) {
        this(str, str2, l, sceneData, sceneData2, ByteString.EMPTY);
    }

    public RunnableInfo(String str, String str2, Long l, SceneData sceneData, SceneData sceneData2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.name = str;
        this.work_thread_name = str2;
        this.cpu_time_cost = l;
        this.runnable_scene_start = sceneData;
        this.runnable_scene_end = sceneData2;
    }
}
