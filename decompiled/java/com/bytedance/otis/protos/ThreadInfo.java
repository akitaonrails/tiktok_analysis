package com.bytedance.otis.protos;

import X.C1516540pZE;
import X.C1C84;
import com.bytedance.otis.protos.SceneData;
import com.bytedance.otis.protos.ThreadInfo;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class ThreadInfo extends Message<ThreadInfo, C1C84> {
    public static final ProtoAdapter<ThreadInfo> ADAPTER = new ProtoAdapter<ThreadInfo>() { // from class: X.1C82
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final ThreadInfo decode(ProtoReader protoReader) {
            C1C84 c1c84 = new C1C84();
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
                                        c1c84.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                    } else {
                                        c1c84.LJII = SceneData.ADAPTER.decode(protoReader);
                                    }
                                } else {
                                    c1c84.LJI = SceneData.ADAPTER.decode(protoReader);
                                }
                            } else {
                                c1c84.LJFF = ProtoAdapter.INT64.decode(protoReader);
                            }
                        } else {
                            c1c84.LJ = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c1c84.LIZLLL = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1c84.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(ThreadInfo threadInfo) {
            ThreadInfo threadInfo2 = threadInfo;
            int iEncodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(1, threadInfo2.tid) + ProtoAdapter.STRING.encodedSizeWithTag(2, threadInfo2.name) + ProtoAdapter.INT64.encodedSizeWithTag(3, threadInfo2.cpu_time);
            ProtoAdapter<SceneData> protoAdapter = SceneData.ADAPTER;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(4, threadInfo2.thread_scene_start) + protoAdapter.encodedSizeWithTag(5, threadInfo2.thread_scene_end) + threadInfo2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, ThreadInfo threadInfo) {
            ThreadInfo threadInfo2 = threadInfo;
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, threadInfo2.tid);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, threadInfo2.name);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, threadInfo2.cpu_time);
            ProtoAdapter<SceneData> protoAdapter = SceneData.ADAPTER;
            protoAdapter.encodeWithTag(protoWriter, 4, threadInfo2.thread_scene_start);
            protoAdapter.encodeWithTag(protoWriter, 5, threadInfo2.thread_scene_end);
            protoWriter.writeBytes(threadInfo2.unknownFields());
        }
    };

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
    public Long cpu_time;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String name;

    @WireField(adapter = "com.bytedance.otis.protos.SceneData#ADAPTER", tag = 5)
    public SceneData thread_scene_end;

    @WireField(adapter = "com.bytedance.otis.protos.SceneData#ADAPTER", tag = 4)
    public SceneData thread_scene_start;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public Integer tid;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Integer num = this.tid;
        int iHashCode2 = (iHashCode + (num != null ? num.hashCode() : 0)) * 37;
        String str = this.name;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        Long l = this.cpu_time;
        int iHashCode4 = (iHashCode3 + (l != null ? l.hashCode() : 0)) * 37;
        SceneData sceneData = this.thread_scene_start;
        int iHashCode5 = (iHashCode4 + (sceneData != null ? sceneData.hashCode() : 0)) * 37;
        SceneData sceneData2 = this.thread_scene_end;
        int iHashCode6 = iHashCode5 + (sceneData2 != null ? sceneData2.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.squareup.wire.Message
    public C1C84 newBuilder() {
        C1C84 c1c84 = new C1C84();
        c1c84.LIZLLL = this.tid;
        c1c84.LJ = this.name;
        c1c84.LJFF = this.cpu_time;
        c1c84.LJI = this.thread_scene_start;
        c1c84.LJII = this.thread_scene_end;
        c1c84.addUnknownFields(unknownFields());
        return c1c84;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.tid != null) {
            sb.append(", tid=");
            sb.append(this.tid);
        }
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        if (this.cpu_time != null) {
            sb.append(", cpu_time=");
            sb.append(this.cpu_time);
        }
        if (this.thread_scene_start != null) {
            sb.append(", thread_scene_start=");
            sb.append(this.thread_scene_start);
        }
        if (this.thread_scene_end != null) {
            sb.append(", thread_scene_end=");
            sb.append(this.thread_scene_end);
        }
        sb.replace(0, 2, "ThreadInfo{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ThreadInfo)) {
            return false;
        }
        ThreadInfo threadInfo = (ThreadInfo) obj;
        if (unknownFields().equals(threadInfo.unknownFields()) && C1516540pZE.LJ(this.tid, threadInfo.tid) && C1516540pZE.LJ(this.name, threadInfo.name) && C1516540pZE.LJ(this.cpu_time, threadInfo.cpu_time) && C1516540pZE.LJ(this.thread_scene_start, threadInfo.thread_scene_start) && C1516540pZE.LJ(this.thread_scene_end, threadInfo.thread_scene_end)) {
            return true;
        }
        return false;
    }

    public ThreadInfo(Integer num, String str, Long l, SceneData sceneData, SceneData sceneData2) {
        this(num, str, l, sceneData, sceneData2, ByteString.EMPTY);
    }

    public ThreadInfo(Integer num, String str, Long l, SceneData sceneData, SceneData sceneData2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.tid = num;
        this.name = str;
        this.cpu_time = l;
        this.thread_scene_start = sceneData;
        this.thread_scene_end = sceneData2;
    }
}
