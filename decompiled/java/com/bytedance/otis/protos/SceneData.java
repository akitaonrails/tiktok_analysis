package com.bytedance.otis.protos;

import X.C1516540pZE;
import X.C2225151C7d;
import com.bytedance.otis.protos.SceneData;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class SceneData extends Message<SceneData, C2225151C7d> {
    public static final ProtoAdapter<SceneData> ADAPTER = new ProtoAdapter<SceneData>() { // from class: X.1C7e
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final SceneData decode(ProtoReader protoReader) {
            C2225151C7d c2225151C7d = new C2225151C7d();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2225151C7d.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c2225151C7d.LJ = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c2225151C7d.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2225151C7d.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(SceneData sceneData) {
            SceneData sceneData2 = sceneData;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, sceneData2.scene_name) + protoAdapter.encodedSizeWithTag(2, sceneData2.scene_info) + sceneData2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, SceneData sceneData) {
            SceneData sceneData2 = sceneData;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, sceneData2.scene_name);
            protoAdapter.encodeWithTag(protoWriter, 2, sceneData2.scene_info);
            protoWriter.writeBytes(sceneData2.unknownFields());
        }
    };

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String scene_info;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String scene_name;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.scene_name;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.scene_info;
        int iHashCode3 = iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public C2225151C7d newBuilder() {
        C2225151C7d c2225151C7d = new C2225151C7d();
        c2225151C7d.LIZLLL = this.scene_name;
        c2225151C7d.LJ = this.scene_info;
        c2225151C7d.addUnknownFields(unknownFields());
        return c2225151C7d;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.scene_name != null) {
            sb.append(", scene_name=");
            sb.append(this.scene_name);
        }
        if (this.scene_info != null) {
            sb.append(", scene_info=");
            sb.append(this.scene_info);
        }
        sb.replace(0, 2, "SceneData{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SceneData)) {
            return false;
        }
        SceneData sceneData = (SceneData) obj;
        if (unknownFields().equals(sceneData.unknownFields()) && C1516540pZE.LJ(this.scene_name, sceneData.scene_name) && C1516540pZE.LJ(this.scene_info, sceneData.scene_info)) {
            return true;
        }
        return false;
    }

    public SceneData(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public SceneData(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.scene_name = str;
        this.scene_info = str2;
    }
}
