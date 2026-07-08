package com.bytedance.otis.protos;

import X.C1516540pZE;
import X.C1C8C;
import com.bytedance.otis.protos.DropFrameInfo;
import com.bytedance.otis.protos.SceneData;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.tts.oecverify.BdTuring;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class DropFrameInfo extends Message<DropFrameInfo, C1C8C> {
    public static final ProtoAdapter<DropFrameInfo> ADAPTER = new ProtoAdapter<DropFrameInfo>() { // from class: X.1C8B
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final DropFrameInfo decode(ProtoReader protoReader) {
            C1C8C c1c8c = new C1C8C();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c1c8c.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 2:
                            c1c8c.LJ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 3:
                            c1c8c.LJFF = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            c1c8c.LJI = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 5:
                            c1c8c.LJII = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 6:
                            c1c8c.LJIIIIZZ = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 7:
                            c1c8c.LJIIIZ = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 8:
                            c1c8c.LJIIJ = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c1c8c.LJIIJJI = SceneData.ADAPTER.decode(protoReader);
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1c8c.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1c8c.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(DropFrameInfo dropFrameInfo) {
            DropFrameInfo dropFrameInfo2 = dropFrameInfo;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, dropFrameInfo2.internal_time) + protoAdapter.encodedSizeWithTag(2, dropFrameInfo2.drop_frame_time) + protoAdapter.encodedSizeWithTag(3, dropFrameInfo2.total_frame_time);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(4, dropFrameInfo2.drop_frame_count) + protoAdapter2.encodedSizeWithTag(5, dropFrameInfo2.drop_frame_level_1_count) + protoAdapter2.encodedSizeWithTag(6, dropFrameInfo2.drop_frame_level_2_count) + protoAdapter2.encodedSizeWithTag(7, dropFrameInfo2.drop_frame_level_3_count) + protoAdapter2.encodedSizeWithTag(8, dropFrameInfo2.drop_frame_level_4_count) + SceneData.ADAPTER.encodedSizeWithTag(9, dropFrameInfo2.scene_data) + dropFrameInfo2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, DropFrameInfo dropFrameInfo) {
            DropFrameInfo dropFrameInfo2 = dropFrameInfo;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, dropFrameInfo2.internal_time);
            protoAdapter.encodeWithTag(protoWriter, 2, dropFrameInfo2.drop_frame_time);
            protoAdapter.encodeWithTag(protoWriter, 3, dropFrameInfo2.total_frame_time);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            protoAdapter2.encodeWithTag(protoWriter, 4, dropFrameInfo2.drop_frame_count);
            protoAdapter2.encodeWithTag(protoWriter, 5, dropFrameInfo2.drop_frame_level_1_count);
            protoAdapter2.encodeWithTag(protoWriter, 6, dropFrameInfo2.drop_frame_level_2_count);
            protoAdapter2.encodeWithTag(protoWriter, 7, dropFrameInfo2.drop_frame_level_3_count);
            protoAdapter2.encodeWithTag(protoWriter, 8, dropFrameInfo2.drop_frame_level_4_count);
            SceneData.ADAPTER.encodeWithTag(protoWriter, 9, dropFrameInfo2.scene_data);
            protoWriter.writeBytes(dropFrameInfo2.unknownFields());
        }
    };

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 4)
    public Integer drop_frame_count;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 5)
    public Integer drop_frame_level_1_count;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 6)
    public Integer drop_frame_level_2_count;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 7)
    public Integer drop_frame_level_3_count;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 8)
    public Integer drop_frame_level_4_count;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public Long drop_frame_time;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
    public Long internal_time;

    @WireField(adapter = "com.bytedance.otis.protos.SceneData#ADAPTER", tag = BdTuring.TYPE_ECAF)
    public SceneData scene_data;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
    public Long total_frame_time;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Long l = this.internal_time;
        int iHashCode2 = (iHashCode + (l != null ? l.hashCode() : 0)) * 37;
        Long l2 = this.drop_frame_time;
        int iHashCode3 = (iHashCode2 + (l2 != null ? l2.hashCode() : 0)) * 37;
        Long l3 = this.total_frame_time;
        int iHashCode4 = (iHashCode3 + (l3 != null ? l3.hashCode() : 0)) * 37;
        Integer num = this.drop_frame_count;
        int iHashCode5 = (iHashCode4 + (num != null ? num.hashCode() : 0)) * 37;
        Integer num2 = this.drop_frame_level_1_count;
        int iHashCode6 = (iHashCode5 + (num2 != null ? num2.hashCode() : 0)) * 37;
        Integer num3 = this.drop_frame_level_2_count;
        int iHashCode7 = (iHashCode6 + (num3 != null ? num3.hashCode() : 0)) * 37;
        Integer num4 = this.drop_frame_level_3_count;
        int iHashCode8 = (iHashCode7 + (num4 != null ? num4.hashCode() : 0)) * 37;
        Integer num5 = this.drop_frame_level_4_count;
        int iHashCode9 = (iHashCode8 + (num5 != null ? num5.hashCode() : 0)) * 37;
        SceneData sceneData = this.scene_data;
        int iHashCode10 = iHashCode9 + (sceneData != null ? sceneData.hashCode() : 0);
        this.hashCode = iHashCode10;
        return iHashCode10;
    }

    @Override // com.squareup.wire.Message
    public C1C8C newBuilder() {
        C1C8C c1c8c = new C1C8C();
        c1c8c.LIZLLL = this.internal_time;
        c1c8c.LJ = this.drop_frame_time;
        c1c8c.LJFF = this.total_frame_time;
        c1c8c.LJI = this.drop_frame_count;
        c1c8c.LJII = this.drop_frame_level_1_count;
        c1c8c.LJIIIIZZ = this.drop_frame_level_2_count;
        c1c8c.LJIIIZ = this.drop_frame_level_3_count;
        c1c8c.LJIIJ = this.drop_frame_level_4_count;
        c1c8c.LJIIJJI = this.scene_data;
        c1c8c.addUnknownFields(unknownFields());
        return c1c8c;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.internal_time != null) {
            sb.append(", internal_time=");
            sb.append(this.internal_time);
        }
        if (this.drop_frame_time != null) {
            sb.append(", drop_frame_time=");
            sb.append(this.drop_frame_time);
        }
        if (this.total_frame_time != null) {
            sb.append(", total_frame_time=");
            sb.append(this.total_frame_time);
        }
        if (this.drop_frame_count != null) {
            sb.append(", drop_frame_count=");
            sb.append(this.drop_frame_count);
        }
        if (this.drop_frame_level_1_count != null) {
            sb.append(", drop_frame_level_1_count=");
            sb.append(this.drop_frame_level_1_count);
        }
        if (this.drop_frame_level_2_count != null) {
            sb.append(", drop_frame_level_2_count=");
            sb.append(this.drop_frame_level_2_count);
        }
        if (this.drop_frame_level_3_count != null) {
            sb.append(", drop_frame_level_3_count=");
            sb.append(this.drop_frame_level_3_count);
        }
        if (this.drop_frame_level_4_count != null) {
            sb.append(", drop_frame_level_4_count=");
            sb.append(this.drop_frame_level_4_count);
        }
        if (this.scene_data != null) {
            sb.append(", scene_data=");
            sb.append(this.scene_data);
        }
        sb.replace(0, 2, "DropFrameInfo{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DropFrameInfo)) {
            return false;
        }
        DropFrameInfo dropFrameInfo = (DropFrameInfo) obj;
        if (unknownFields().equals(dropFrameInfo.unknownFields()) && C1516540pZE.LJ(this.internal_time, dropFrameInfo.internal_time) && C1516540pZE.LJ(this.drop_frame_time, dropFrameInfo.drop_frame_time) && C1516540pZE.LJ(this.total_frame_time, dropFrameInfo.total_frame_time) && C1516540pZE.LJ(this.drop_frame_count, dropFrameInfo.drop_frame_count) && C1516540pZE.LJ(this.drop_frame_level_1_count, dropFrameInfo.drop_frame_level_1_count) && C1516540pZE.LJ(this.drop_frame_level_2_count, dropFrameInfo.drop_frame_level_2_count) && C1516540pZE.LJ(this.drop_frame_level_3_count, dropFrameInfo.drop_frame_level_3_count) && C1516540pZE.LJ(this.drop_frame_level_4_count, dropFrameInfo.drop_frame_level_4_count) && C1516540pZE.LJ(this.scene_data, dropFrameInfo.scene_data)) {
            return true;
        }
        return false;
    }

    public DropFrameInfo(Long l, Long l2, Long l3, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, SceneData sceneData) {
        this(l, l2, l3, num, num2, num3, num4, num5, sceneData, ByteString.EMPTY);
    }

    public DropFrameInfo(Long l, Long l2, Long l3, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, SceneData sceneData, ByteString byteString) {
        super(ADAPTER, byteString);
        this.internal_time = l;
        this.drop_frame_time = l2;
        this.total_frame_time = l3;
        this.drop_frame_count = num;
        this.drop_frame_level_1_count = num2;
        this.drop_frame_level_2_count = num3;
        this.drop_frame_level_3_count = num4;
        this.drop_frame_level_4_count = num5;
        this.scene_data = sceneData;
    }
}
