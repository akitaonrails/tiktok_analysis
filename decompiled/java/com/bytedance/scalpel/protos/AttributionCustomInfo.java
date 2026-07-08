package com.bytedance.scalpel.protos;

import X.C1516540pZE;
import X.C1C7O;
import X.C1C7Q;
import com.bytedance.scalpel.protos.AttributionCustomInfo;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class AttributionCustomInfo extends Message<AttributionCustomInfo, C1C7O> {
    public static final ProtoAdapter<AttributionCustomInfo> ADAPTER = new ProtoAdapter<AttributionCustomInfo>() { // from class: X.1C7N
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final AttributionCustomInfo decode(ProtoReader protoReader) {
            C1C7O c1c7o = new C1C7O();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1c7o.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c1c7o.LJ.add(AttributionCustomInfo.CustomItemInfo.ADAPTER.decode(protoReader));
                        }
                    } else {
                        c1c7o.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1c7o.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(AttributionCustomInfo attributionCustomInfo) {
            AttributionCustomInfo attributionCustomInfo2 = attributionCustomInfo;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, attributionCustomInfo2.eventType) + AttributionCustomInfo.CustomItemInfo.ADAPTER.asRepeated().encodedSizeWithTag(2, attributionCustomInfo2.list) + attributionCustomInfo2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, AttributionCustomInfo attributionCustomInfo) {
            AttributionCustomInfo attributionCustomInfo2 = attributionCustomInfo;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, attributionCustomInfo2.eventType);
            AttributionCustomInfo.CustomItemInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, attributionCustomInfo2.list);
            protoWriter.writeBytes(attributionCustomInfo2.unknownFields());
        }
    };

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public String eventType;

    @WireField(adapter = "com.bytedance.scalpel.protos.AttributionCustomInfo$CustomItemInfo#ADAPTER", label = WireField.Label.REPEATED, tag = 2)
    public List<CustomItemInfo> list;

    public static final class CustomItemInfo extends Message<CustomItemInfo, C1C7Q> {
        public static final ProtoAdapter<CustomItemInfo> ADAPTER = new ProtoAdapter<CustomItemInfo>() { // from class: X.1C7P
            {
                FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final AttributionCustomInfo.CustomItemInfo decode(ProtoReader protoReader) {
                C1C7Q c1c7q = new C1C7Q();
                long jBeginMessage = protoReader.beginMessage();
                while (true) {
                    int iNextTag = protoReader.nextTag();
                    if (iNextTag != -1) {
                        if (iNextTag != 1) {
                            if (iNextTag != 2) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c1c7q.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c1c7q.LJ = ProtoAdapter.DOUBLE.decode(protoReader);
                            }
                        } else {
                            c1c7q.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        protoReader.endMessage(jBeginMessage);
                        return c1c7q.build();
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(AttributionCustomInfo.CustomItemInfo customItemInfo) {
                AttributionCustomInfo.CustomItemInfo customItemInfo2 = customItemInfo;
                return ProtoAdapter.STRING.encodedSizeWithTag(1, customItemInfo2.name) + ProtoAdapter.DOUBLE.encodedSizeWithTag(2, customItemInfo2.value) + customItemInfo2.unknownFields().size();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, AttributionCustomInfo.CustomItemInfo customItemInfo) {
                AttributionCustomInfo.CustomItemInfo customItemInfo2 = customItemInfo;
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, customItemInfo2.name);
                ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 2, customItemInfo2.value);
                protoWriter.writeBytes(customItemInfo2.unknownFields());
            }
        };

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
        public String name;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = WireField.Label.REQUIRED, tag = 2)
        public Double value;

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = (((unknownFields().hashCode() * 37) + this.name.hashCode()) * 37) + this.value.hashCode();
            this.hashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.squareup.wire.Message
        public C1C7Q newBuilder() {
            C1C7Q c1c7q = new C1C7Q();
            c1c7q.LIZLLL = this.name;
            c1c7q.LJ = this.value;
            c1c7q.addUnknownFields(unknownFields());
            return c1c7q;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(", name=");
            sb.append(this.name);
            sb.append(", value=");
            sb.append(this.value);
            sb.replace(0, 2, "CustomItemInfo{");
            sb.append('}');
            return sb.toString();
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CustomItemInfo)) {
                return false;
            }
            CustomItemInfo customItemInfo = (CustomItemInfo) obj;
            if (unknownFields().equals(customItemInfo.unknownFields()) && this.name.equals(customItemInfo.name) && this.value.equals(customItemInfo.value)) {
                return true;
            }
            return false;
        }

        public CustomItemInfo(String str, Double d) {
            this(str, d, ByteString.EMPTY);
        }

        public CustomItemInfo(String str, Double d, ByteString byteString) {
            super(ADAPTER, byteString);
            this.name = str;
            this.value = d;
        }
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.eventType.hashCode()) * 37) + this.list.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1C7O newBuilder() {
        C1C7O c1c7o = new C1C7O();
        c1c7o.LIZLLL = this.eventType;
        c1c7o.LJ = C1516540pZE.LIZJ("list", this.list);
        c1c7o.addUnknownFields(unknownFields());
        return c1c7o;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", eventType=");
        sb.append(this.eventType);
        if (!this.list.isEmpty()) {
            sb.append(", list=");
            sb.append(this.list);
        }
        sb.replace(0, 2, "AttributionCustomInfo{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AttributionCustomInfo)) {
            return false;
        }
        AttributionCustomInfo attributionCustomInfo = (AttributionCustomInfo) obj;
        if (unknownFields().equals(attributionCustomInfo.unknownFields()) && this.eventType.equals(attributionCustomInfo.eventType) && this.list.equals(attributionCustomInfo.list)) {
            return true;
        }
        return false;
    }

    public AttributionCustomInfo(String str, List<CustomItemInfo> list) {
        this(str, list, ByteString.EMPTY);
    }

    public AttributionCustomInfo(String str, List<CustomItemInfo> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.eventType = str;
        this.list = C1516540pZE.LJFF("list", list);
    }
}
