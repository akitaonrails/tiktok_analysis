package com.bytedance.scalpel.protos;

import X.C1516540pZE;
import X.C2225461C8i;
import X.C2225511C8n;
import com.bytedance.scalpel.protos.AttributionMsg;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class AttributionMsg extends Message<AttributionMsg, C2225511C8n> {
    public static final ProtoAdapter<AttributionMsg> ADAPTER = new ProtoAdapter<AttributionMsg>() { // from class: X.1C8h
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final AttributionMsg decode(ProtoReader protoReader) {
            C2225511C8n c2225511C8n = new C2225511C8n();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c2225511C8n.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c2225511C8n.LIZLLL.add(AttributionMsg.AttributionItemMsg.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2225511C8n.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(AttributionMsg attributionMsg) {
            AttributionMsg attributionMsg2 = attributionMsg;
            return AttributionMsg.AttributionItemMsg.ADAPTER.asRepeated().encodedSizeWithTag(1, attributionMsg2.data) + attributionMsg2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, AttributionMsg attributionMsg) {
            AttributionMsg attributionMsg2 = attributionMsg;
            AttributionMsg.AttributionItemMsg.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, attributionMsg2.data);
            protoWriter.writeBytes(attributionMsg2.unknownFields());
        }
    };

    @WireField(adapter = "com.bytedance.scalpel.protos.AttributionMsg$AttributionItemMsg#ADAPTER", label = WireField.Label.REPEATED, tag = 1)
    public List<AttributionItemMsg> data;

    public static final class AttributionItemMsg extends Message<AttributionItemMsg, C2225461C8i> {
        public static final ProtoAdapter<AttributionItemMsg> ADAPTER = new ProtoAdapter<AttributionItemMsg>() { // from class: X.1C8g
            {
                FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final AttributionMsg.AttributionItemMsg decode(ProtoReader protoReader) {
                C2225461C8i c2225461C8i = new C2225461C8i();
                long jBeginMessage = protoReader.beginMessage();
                while (true) {
                    int iNextTag = protoReader.nextTag();
                    if (iNextTag != -1) {
                        if (iNextTag != 1) {
                            if (iNextTag != 2) {
                                if (iNextTag != 3) {
                                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                    c2225461C8i.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                } else {
                                    c2225461C8i.LJFF.add(ProtoAdapter.BYTES.decode(protoReader));
                                }
                            } else {
                                c2225461C8i.LJ = ProtoAdapter.UINT32.decode(protoReader);
                            }
                        } else {
                            c2225461C8i.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        protoReader.endMessage(jBeginMessage);
                        return c2225461C8i.build();
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(AttributionMsg.AttributionItemMsg attributionItemMsg) {
                AttributionMsg.AttributionItemMsg attributionItemMsg2 = attributionItemMsg;
                return ProtoAdapter.STRING.encodedSizeWithTag(1, attributionItemMsg2.scene) + ProtoAdapter.UINT32.encodedSizeWithTag(2, attributionItemMsg2.event_type) + ProtoAdapter.BYTES.asRepeated().encodedSizeWithTag(3, attributionItemMsg2.data) + attributionItemMsg2.unknownFields().size();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, AttributionMsg.AttributionItemMsg attributionItemMsg) {
                AttributionMsg.AttributionItemMsg attributionItemMsg2 = attributionItemMsg;
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, attributionItemMsg2.scene);
                ProtoAdapter.UINT32.encodeWithTag(protoWriter, 2, attributionItemMsg2.event_type);
                ProtoAdapter.BYTES.asRepeated().encodeWithTag(protoWriter, 3, attributionItemMsg2.data);
                protoWriter.writeBytes(attributionItemMsg2.unknownFields());
            }
        };

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = WireField.Label.REPEATED, tag = 3)
        public List<ByteString> data;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = WireField.Label.REQUIRED, tag = 2)
        public Integer event_type;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
        public String scene;

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = (((((unknownFields().hashCode() * 37) + this.scene.hashCode()) * 37) + this.event_type.hashCode()) * 37) + this.data.hashCode();
            this.hashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.squareup.wire.Message
        public C2225461C8i newBuilder() {
            C2225461C8i c2225461C8i = new C2225461C8i();
            c2225461C8i.LIZLLL = this.scene;
            c2225461C8i.LJ = this.event_type;
            c2225461C8i.LJFF = C1516540pZE.LIZJ("data", this.data);
            c2225461C8i.addUnknownFields(unknownFields());
            return c2225461C8i;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(", scene=");
            sb.append(this.scene);
            sb.append(", event_type=");
            sb.append(this.event_type);
            if (!this.data.isEmpty()) {
                sb.append(", data=");
                sb.append(this.data);
            }
            sb.replace(0, 2, "AttributionItemMsg{");
            sb.append('}');
            return sb.toString();
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AttributionItemMsg)) {
                return false;
            }
            AttributionItemMsg attributionItemMsg = (AttributionItemMsg) obj;
            if (unknownFields().equals(attributionItemMsg.unknownFields()) && this.scene.equals(attributionItemMsg.scene) && this.event_type.equals(attributionItemMsg.event_type) && this.data.equals(attributionItemMsg.data)) {
                return true;
            }
            return false;
        }

        public AttributionItemMsg(String str, Integer num, List<ByteString> list) {
            this(str, num, list, ByteString.EMPTY);
        }

        public AttributionItemMsg(String str, Integer num, List<ByteString> list, ByteString byteString) {
            super(ADAPTER, byteString);
            this.scene = str;
            this.event_type = num;
            this.data = C1516540pZE.LJFF("data", list);
        }
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.data.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2225511C8n newBuilder() {
        C2225511C8n c2225511C8n = new C2225511C8n();
        c2225511C8n.LIZLLL = C1516540pZE.LIZJ("data", this.data);
        c2225511C8n.addUnknownFields(unknownFields());
        return c2225511C8n;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.data.isEmpty()) {
            sb.append(", data=");
            sb.append(this.data);
        }
        sb.replace(0, 2, "AttributionMsg{");
        sb.append('}');
        return sb.toString();
    }

    public AttributionMsg(List<AttributionItemMsg> list) {
        this(list, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AttributionMsg)) {
            return false;
        }
        AttributionMsg attributionMsg = (AttributionMsg) obj;
        if (unknownFields().equals(attributionMsg.unknownFields()) && this.data.equals(attributionMsg.data)) {
            return true;
        }
        return false;
    }

    public AttributionMsg(List<AttributionItemMsg> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.data = C1516540pZE.LJFF("data", list);
    }
}
