package com.bytedance.otis.protos;

import X.C1516540pZE;
import X.C1C8N;
import com.bytedance.otis.protos.BackgroundTaskInfo;
import com.bytedance.otis.protos.MethodStack;
import com.bytedance.otis.protos.TimeInfo;
import com.bytedance.otis.protos.TimeStampRange;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class BackgroundTaskInfo extends Message<BackgroundTaskInfo, C1C8N> {
    public static final ProtoAdapter<BackgroundTaskInfo> ADAPTER = new ProtoAdapter<BackgroundTaskInfo>() { // from class: X.1C8K
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final BackgroundTaskInfo decode(ProtoReader protoReader) {
            C1C8N c1c8n = new C1C8N();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    if (iNextTag != 5) {
                                        if (iNextTag != 100) {
                                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                            c1c8n.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                        } else {
                                            c1c8n.LJIIIIZZ = TimeStampRange.ADAPTER.decode(protoReader);
                                        }
                                    } else {
                                        c1c8n.LJII = ProtoAdapter.STRING.decode(protoReader);
                                    }
                                } else {
                                    c1c8n.LJI = TimeInfo.ADAPTER.decode(protoReader);
                                }
                            } else {
                                c1c8n.LJFF = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c1c8n.LJ = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c1c8n.LIZLLL.add(MethodStack.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1c8n.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(BackgroundTaskInfo backgroundTaskInfo) {
            BackgroundTaskInfo backgroundTaskInfo2 = backgroundTaskInfo;
            int iEncodedSizeWithTag = MethodStack.ADAPTER.asRepeated().encodedSizeWithTag(1, backgroundTaskInfo2.stacks) + ProtoAdapter.INT64.encodedSizeWithTag(2, backgroundTaskInfo2.interval_time);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(3, backgroundTaskInfo2.scene) + TimeInfo.ADAPTER.encodedSizeWithTag(4, backgroundTaskInfo2.time_info) + protoAdapter.encodedSizeWithTag(5, backgroundTaskInfo2.custom_scene) + TimeStampRange.ADAPTER.encodedSizeWithTag(100, backgroundTaskInfo2.time_stamp_range) + backgroundTaskInfo2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, BackgroundTaskInfo backgroundTaskInfo) {
            BackgroundTaskInfo backgroundTaskInfo2 = backgroundTaskInfo;
            MethodStack.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, backgroundTaskInfo2.stacks);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, backgroundTaskInfo2.interval_time);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 3, backgroundTaskInfo2.scene);
            TimeInfo.ADAPTER.encodeWithTag(protoWriter, 4, backgroundTaskInfo2.time_info);
            protoAdapter.encodeWithTag(protoWriter, 5, backgroundTaskInfo2.custom_scene);
            TimeStampRange.ADAPTER.encodeWithTag(protoWriter, 100, backgroundTaskInfo2.time_stamp_range);
            protoWriter.writeBytes(backgroundTaskInfo2.unknownFields());
        }
    };

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    public String custom_scene;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public Long interval_time;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public String scene;

    @WireField(adapter = "com.bytedance.otis.protos.MethodStack#ADAPTER", label = WireField.Label.REPEATED, tag = 1)
    public List<MethodStack> stacks;

    @WireField(adapter = "com.bytedance.otis.protos.TimeInfo#ADAPTER", tag = 4)
    public TimeInfo time_info;

    @WireField(adapter = "com.bytedance.otis.protos.TimeStampRange#ADAPTER", tag = 100)
    public TimeStampRange time_stamp_range;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.stacks.hashCode()) * 37;
        Long l = this.interval_time;
        int iHashCode2 = (iHashCode + (l != null ? l.hashCode() : 0)) * 37;
        String str = this.scene;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        TimeInfo timeInfo = this.time_info;
        int iHashCode4 = (iHashCode3 + (timeInfo != null ? timeInfo.hashCode() : 0)) * 37;
        String str2 = this.custom_scene;
        int iHashCode5 = (iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 37;
        TimeStampRange timeStampRange = this.time_stamp_range;
        int iHashCode6 = iHashCode5 + (timeStampRange != null ? timeStampRange.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.squareup.wire.Message
    public C1C8N newBuilder() {
        C1C8N c1c8n = new C1C8N();
        c1c8n.LIZLLL = C1516540pZE.LIZJ("stacks", this.stacks);
        c1c8n.LJ = this.interval_time;
        c1c8n.LJFF = this.scene;
        c1c8n.LJI = this.time_info;
        c1c8n.LJII = this.custom_scene;
        c1c8n.LJIIIIZZ = this.time_stamp_range;
        c1c8n.addUnknownFields(unknownFields());
        return c1c8n;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.stacks.isEmpty()) {
            sb.append(", stacks=");
            sb.append(this.stacks);
        }
        if (this.interval_time != null) {
            sb.append(", interval_time=");
            sb.append(this.interval_time);
        }
        if (this.scene != null) {
            sb.append(", scene=");
            sb.append(this.scene);
        }
        if (this.time_info != null) {
            sb.append(", time_info=");
            sb.append(this.time_info);
        }
        if (this.custom_scene != null) {
            sb.append(", custom_scene=");
            sb.append(this.custom_scene);
        }
        if (this.time_stamp_range != null) {
            sb.append(", time_stamp_range=");
            sb.append(this.time_stamp_range);
        }
        sb.replace(0, 2, "BackgroundTaskInfo{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BackgroundTaskInfo)) {
            return false;
        }
        BackgroundTaskInfo backgroundTaskInfo = (BackgroundTaskInfo) obj;
        if (unknownFields().equals(backgroundTaskInfo.unknownFields()) && this.stacks.equals(backgroundTaskInfo.stacks) && C1516540pZE.LJ(this.interval_time, backgroundTaskInfo.interval_time) && C1516540pZE.LJ(this.scene, backgroundTaskInfo.scene) && C1516540pZE.LJ(this.time_info, backgroundTaskInfo.time_info) && C1516540pZE.LJ(this.custom_scene, backgroundTaskInfo.custom_scene) && C1516540pZE.LJ(this.time_stamp_range, backgroundTaskInfo.time_stamp_range)) {
            return true;
        }
        return false;
    }

    public BackgroundTaskInfo(List<MethodStack> list, Long l, String str, TimeInfo timeInfo, String str2, TimeStampRange timeStampRange) {
        this(list, l, str, timeInfo, str2, timeStampRange, ByteString.EMPTY);
    }

    public BackgroundTaskInfo(List<MethodStack> list, Long l, String str, TimeInfo timeInfo, String str2, TimeStampRange timeStampRange, ByteString byteString) {
        super(ADAPTER, byteString);
        this.stacks = C1516540pZE.LJFF("stacks", list);
        this.interval_time = l;
        this.scene = str;
        this.time_info = timeInfo;
        this.custom_scene = str2;
        this.time_stamp_range = timeStampRange;
    }
}
