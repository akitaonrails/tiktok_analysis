package com.bytedance.otis.protos;

import X.C1516540pZE;
import X.C1C3V;
import com.bytedance.otis.protos.BackgroundTask;
import com.bytedance.otis.protos.BackgroundTaskInfo;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class BackgroundTask extends Message<BackgroundTask, C1C3V> {
    public static final ProtoAdapter<BackgroundTask> ADAPTER = new ProtoAdapter<BackgroundTask>() { // from class: X.1C3U
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final BackgroundTask decode(ProtoReader protoReader) {
            C1C3V c1c3v = new C1C3V();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1c3v.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c1c3v.LJ.add(BackgroundTaskInfo.ADAPTER.decode(protoReader));
                        }
                    } else {
                        c1c3v.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1c3v.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(BackgroundTask backgroundTask) {
            BackgroundTask backgroundTask2 = backgroundTask;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, backgroundTask2.method_mapping) + BackgroundTaskInfo.ADAPTER.asRepeated().encodedSizeWithTag(2, backgroundTask2.background_task_info) + backgroundTask2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, BackgroundTask backgroundTask) {
            BackgroundTask backgroundTask2 = backgroundTask;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, backgroundTask2.method_mapping);
            BackgroundTaskInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, backgroundTask2.background_task_info);
            protoWriter.writeBytes(backgroundTask2.unknownFields());
        }
    };

    @WireField(adapter = "com.bytedance.otis.protos.BackgroundTaskInfo#ADAPTER", label = WireField.Label.REPEATED, tag = 2)
    public List<BackgroundTaskInfo> background_task_info;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String method_mapping;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.method_mapping;
        int iHashCode2 = ((iHashCode + (str != null ? str.hashCode() : 0)) * 37) + this.background_task_info.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public C1C3V newBuilder() {
        C1C3V c1c3v = new C1C3V();
        c1c3v.LIZLLL = this.method_mapping;
        c1c3v.LJ = C1516540pZE.LIZJ("background_task_info", this.background_task_info);
        c1c3v.addUnknownFields(unknownFields());
        return c1c3v;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.method_mapping != null) {
            sb.append(", method_mapping=");
            sb.append(this.method_mapping);
        }
        if (!this.background_task_info.isEmpty()) {
            sb.append(", background_task_info=");
            sb.append(this.background_task_info);
        }
        sb.replace(0, 2, "BackgroundTask{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BackgroundTask)) {
            return false;
        }
        BackgroundTask backgroundTask = (BackgroundTask) obj;
        if (unknownFields().equals(backgroundTask.unknownFields()) && C1516540pZE.LJ(this.method_mapping, backgroundTask.method_mapping) && this.background_task_info.equals(backgroundTask.background_task_info)) {
            return true;
        }
        return false;
    }

    public BackgroundTask(String str, List<BackgroundTaskInfo> list) {
        this(str, list, ByteString.EMPTY);
    }

    public BackgroundTask(String str, List<BackgroundTaskInfo> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.method_mapping = str;
        this.background_task_info = C1516540pZE.LJFF("background_task_info", list);
    }
}
