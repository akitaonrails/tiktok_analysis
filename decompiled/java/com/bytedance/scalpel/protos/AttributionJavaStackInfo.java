package com.bytedance.scalpel.protos;

import X.C1516540pZE;
import X.C2225341C7w;
import X.C2225371C7z;
import com.bytedance.scalpel.protos.AttributionJavaStackInfo;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class AttributionJavaStackInfo extends Message<AttributionJavaStackInfo, C2225371C7z> {
    public static final ProtoAdapter<AttributionJavaStackInfo> ADAPTER = new ProtoAdapter<AttributionJavaStackInfo>() { // from class: X.1C7y
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final AttributionJavaStackInfo decode(ProtoReader protoReader) {
            C2225371C7z c2225371C7z = new C2225371C7z();
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
                                        c2225371C7z.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                    } else {
                                        c2225371C7z.LJII.add(AttributionJavaStackInfo.JavaStackItemInfo.ADAPTER.decode(protoReader));
                                    }
                                } else {
                                    c2225371C7z.LJI = ProtoAdapter.INT64.decode(protoReader);
                                }
                            } else {
                                c2225371C7z.LJFF = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c2225371C7z.LJ = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c2225371C7z.LIZLLL.add(ProtoAdapter.STRING.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2225371C7z.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(AttributionJavaStackInfo attributionJavaStackInfo) {
            AttributionJavaStackInfo attributionJavaStackInfo2 = attributionJavaStackInfo;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.asRepeated().encodedSizeWithTag(1, attributionJavaStackInfo2.method_mapping) + protoAdapter.encodedSizeWithTag(2, attributionJavaStackInfo2.stage) + protoAdapter.encodedSizeWithTag(3, attributionJavaStackInfo2.thread_name) + ProtoAdapter.INT64.encodedSizeWithTag(4, attributionJavaStackInfo2.startTime) + AttributionJavaStackInfo.JavaStackItemInfo.ADAPTER.asRepeated().encodedSizeWithTag(5, attributionJavaStackInfo2.list) + attributionJavaStackInfo2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, AttributionJavaStackInfo attributionJavaStackInfo) {
            AttributionJavaStackInfo attributionJavaStackInfo2 = attributionJavaStackInfo;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 1, attributionJavaStackInfo2.method_mapping);
            protoAdapter.encodeWithTag(protoWriter, 2, attributionJavaStackInfo2.stage);
            protoAdapter.encodeWithTag(protoWriter, 3, attributionJavaStackInfo2.thread_name);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, attributionJavaStackInfo2.startTime);
            AttributionJavaStackInfo.JavaStackItemInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, attributionJavaStackInfo2.list);
            protoWriter.writeBytes(attributionJavaStackInfo2.unknownFields());
        }
    };

    @WireField(adapter = "com.bytedance.scalpel.protos.AttributionJavaStackInfo$JavaStackItemInfo#ADAPTER", label = WireField.Label.REPEATED, tag = 5)
    public List<JavaStackItemInfo> list;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, tag = 1)
    public List<String> method_mapping;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 2)
    public String stage;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 4)
    public Long startTime;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 3)
    public String thread_name;

    public static final class JavaStackItemInfo extends Message<JavaStackItemInfo, C2225341C7w> {
        public static final ProtoAdapter<JavaStackItemInfo> ADAPTER = new ProtoAdapter<JavaStackItemInfo>() { // from class: X.1C7x
            {
                FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final AttributionJavaStackInfo.JavaStackItemInfo decode(ProtoReader protoReader) {
                C2225341C7w c2225341C7w = new C2225341C7w();
                long jBeginMessage = protoReader.beginMessage();
                while (true) {
                    int iNextTag = protoReader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                c2225341C7w.LIZLLL = ProtoAdapter.UINT32.decode(protoReader);
                                break;
                            case 2:
                                c2225341C7w.LJ = ProtoAdapter.INT64.decode(protoReader);
                                break;
                            case 3:
                                c2225341C7w.LJFF = ProtoAdapter.INT64.decode(protoReader);
                                break;
                            case 4:
                                c2225341C7w.LJI = ProtoAdapter.INT64.decode(protoReader);
                                break;
                            case 5:
                                c2225341C7w.LJII = ProtoAdapter.INT64.decode(protoReader);
                                break;
                            case 6:
                                c2225341C7w.LJIIIIZZ = ProtoAdapter.INT64.decode(protoReader);
                                break;
                            case 7:
                                c2225341C7w.LJIIIZ.add(ProtoAdapter.INT64.decode(protoReader));
                                break;
                            default:
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c2225341C7w.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                        }
                    } else {
                        protoReader.endMessage(jBeginMessage);
                        return c2225341C7w.build();
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(AttributionJavaStackInfo.JavaStackItemInfo javaStackItemInfo) {
                AttributionJavaStackInfo.JavaStackItemInfo javaStackItemInfo2 = javaStackItemInfo;
                int iEncodedSizeWithTag = ProtoAdapter.UINT32.encodedSizeWithTag(1, javaStackItemInfo2.type);
                ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
                return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, javaStackItemInfo2.start_wall_time) + protoAdapter.encodedSizeWithTag(3, javaStackItemInfo2.end_wall_time) + protoAdapter.encodedSizeWithTag(4, javaStackItemInfo2.start_cpu_time) + protoAdapter.encodedSizeWithTag(5, javaStackItemInfo2.end_cpu_time) + protoAdapter.encodedSizeWithTag(6, javaStackItemInfo2.memory_size) + protoAdapter.asRepeated().encodedSizeWithTag(7, javaStackItemInfo2.method_ids) + javaStackItemInfo2.unknownFields().size();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, AttributionJavaStackInfo.JavaStackItemInfo javaStackItemInfo) {
                AttributionJavaStackInfo.JavaStackItemInfo javaStackItemInfo2 = javaStackItemInfo;
                ProtoAdapter.UINT32.encodeWithTag(protoWriter, 1, javaStackItemInfo2.type);
                ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
                protoAdapter.encodeWithTag(protoWriter, 2, javaStackItemInfo2.start_wall_time);
                protoAdapter.encodeWithTag(protoWriter, 3, javaStackItemInfo2.end_wall_time);
                protoAdapter.encodeWithTag(protoWriter, 4, javaStackItemInfo2.start_cpu_time);
                protoAdapter.encodeWithTag(protoWriter, 5, javaStackItemInfo2.end_cpu_time);
                protoAdapter.encodeWithTag(protoWriter, 6, javaStackItemInfo2.memory_size);
                protoAdapter.asRepeated().encodeWithTag(protoWriter, 7, javaStackItemInfo2.method_ids);
                protoWriter.writeBytes(javaStackItemInfo2.unknownFields());
            }
        };

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 5)
        public Long end_cpu_time;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 3)
        public Long end_wall_time;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 6)
        public Long memory_size;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REPEATED, tag = 7)
        public List<Long> method_ids;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 4)
        public Long start_cpu_time;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 2)
        public Long start_wall_time;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = WireField.Label.REQUIRED, tag = 1)
        public Integer type;

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = (((((((((((((unknownFields().hashCode() * 37) + this.type.hashCode()) * 37) + this.start_wall_time.hashCode()) * 37) + this.end_wall_time.hashCode()) * 37) + this.start_cpu_time.hashCode()) * 37) + this.end_cpu_time.hashCode()) * 37) + this.memory_size.hashCode()) * 37) + this.method_ids.hashCode();
            this.hashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.squareup.wire.Message
        public C2225341C7w newBuilder() {
            C2225341C7w c2225341C7w = new C2225341C7w();
            c2225341C7w.LIZLLL = this.type;
            c2225341C7w.LJ = this.start_wall_time;
            c2225341C7w.LJFF = this.end_wall_time;
            c2225341C7w.LJI = this.start_cpu_time;
            c2225341C7w.LJII = this.end_cpu_time;
            c2225341C7w.LJIIIIZZ = this.memory_size;
            c2225341C7w.LJIIIZ = C1516540pZE.LIZJ("method_ids", this.method_ids);
            c2225341C7w.addUnknownFields(unknownFields());
            return c2225341C7w;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(", type=");
            sb.append(this.type);
            sb.append(", start_wall_time=");
            sb.append(this.start_wall_time);
            sb.append(", end_wall_time=");
            sb.append(this.end_wall_time);
            sb.append(", start_cpu_time=");
            sb.append(this.start_cpu_time);
            sb.append(", end_cpu_time=");
            sb.append(this.end_cpu_time);
            sb.append(", memory_size=");
            sb.append(this.memory_size);
            if (!this.method_ids.isEmpty()) {
                sb.append(", method_ids=");
                sb.append(this.method_ids);
            }
            sb.replace(0, 2, "JavaStackItemInfo{");
            sb.append('}');
            return sb.toString();
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof JavaStackItemInfo)) {
                return false;
            }
            JavaStackItemInfo javaStackItemInfo = (JavaStackItemInfo) obj;
            if (unknownFields().equals(javaStackItemInfo.unknownFields()) && this.type.equals(javaStackItemInfo.type) && this.start_wall_time.equals(javaStackItemInfo.start_wall_time) && this.end_wall_time.equals(javaStackItemInfo.end_wall_time) && this.start_cpu_time.equals(javaStackItemInfo.start_cpu_time) && this.end_cpu_time.equals(javaStackItemInfo.end_cpu_time) && this.memory_size.equals(javaStackItemInfo.memory_size) && this.method_ids.equals(javaStackItemInfo.method_ids)) {
                return true;
            }
            return false;
        }

        public JavaStackItemInfo(Integer num, Long l, Long l2, Long l3, Long l4, Long l5, List<Long> list) {
            this(num, l, l2, l3, l4, l5, list, ByteString.EMPTY);
        }

        public JavaStackItemInfo(Integer num, Long l, Long l2, Long l3, Long l4, Long l5, List<Long> list, ByteString byteString) {
            super(ADAPTER, byteString);
            this.type = num;
            this.start_wall_time = l;
            this.end_wall_time = l2;
            this.start_cpu_time = l3;
            this.end_cpu_time = l4;
            this.memory_size = l5;
            this.method_ids = C1516540pZE.LJFF("method_ids", list);
        }
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((unknownFields().hashCode() * 37) + this.method_mapping.hashCode()) * 37) + this.stage.hashCode()) * 37) + this.thread_name.hashCode()) * 37) + this.startTime.hashCode()) * 37) + this.list.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2225371C7z newBuilder() {
        C2225371C7z c2225371C7z = new C2225371C7z();
        c2225371C7z.LIZLLL = C1516540pZE.LIZJ("method_mapping", this.method_mapping);
        c2225371C7z.LJ = this.stage;
        c2225371C7z.LJFF = this.thread_name;
        c2225371C7z.LJI = this.startTime;
        c2225371C7z.LJII = C1516540pZE.LIZJ("list", this.list);
        c2225371C7z.addUnknownFields(unknownFields());
        return c2225371C7z;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.method_mapping.isEmpty()) {
            sb.append(", method_mapping=");
            sb.append(this.method_mapping);
        }
        sb.append(", stage=");
        sb.append(this.stage);
        sb.append(", thread_name=");
        sb.append(this.thread_name);
        sb.append(", startTime=");
        sb.append(this.startTime);
        if (!this.list.isEmpty()) {
            sb.append(", list=");
            sb.append(this.list);
        }
        sb.replace(0, 2, "AttributionJavaStackInfo{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AttributionJavaStackInfo)) {
            return false;
        }
        AttributionJavaStackInfo attributionJavaStackInfo = (AttributionJavaStackInfo) obj;
        if (unknownFields().equals(attributionJavaStackInfo.unknownFields()) && this.method_mapping.equals(attributionJavaStackInfo.method_mapping) && this.stage.equals(attributionJavaStackInfo.stage) && this.thread_name.equals(attributionJavaStackInfo.thread_name) && this.startTime.equals(attributionJavaStackInfo.startTime) && this.list.equals(attributionJavaStackInfo.list)) {
            return true;
        }
        return false;
    }

    public AttributionJavaStackInfo(List<String> list, String str, String str2, Long l, List<JavaStackItemInfo> list2) {
        this(list, str, str2, l, list2, ByteString.EMPTY);
    }

    public AttributionJavaStackInfo(List<String> list, String str, String str2, Long l, List<JavaStackItemInfo> list2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.method_mapping = C1516540pZE.LJFF("method_mapping", list);
        this.stage = str;
        this.thread_name = str2;
        this.startTime = l;
        this.list = C1516540pZE.LJFF("list", list2);
    }
}
