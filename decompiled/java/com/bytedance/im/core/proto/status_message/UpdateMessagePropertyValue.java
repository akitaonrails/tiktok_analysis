package com.bytedance.im.core.proto.status_message;

import X.C09CT;
import X.C0YWA;
import X.C1516540pZE;
import com.bytedance.im.core.proto.status_message.PropertyItemList;
import com.bytedance.im.core.proto.status_message.UpdateMessagePropertyValue;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class UpdateMessagePropertyValue extends Message<UpdateMessagePropertyValue, C0YWA> {
    public static final ProtoAdapter<UpdateMessagePropertyValue> ADAPTER = new ProtoAdapter<UpdateMessagePropertyValue>() { // from class: X.0YW9
        public final ProtoAdapter<Map<String, String>> LIZ;
        public final ProtoAdapter<Map<String, PropertyItemList>> LIZIZ;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.LIZ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
            this.LIZIZ = ProtoAdapter.newMapAdapter(protoAdapter, PropertyItemList.ADAPTER);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final UpdateMessagePropertyValue decode(ProtoReader protoReader) {
            C0YWA c0ywa = new C0YWA();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c0ywa.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c0ywa.LJ.putAll(this.LIZIZ.decode(protoReader));
                        }
                    } else {
                        c0ywa.LIZLLL.putAll(this.LIZ.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c0ywa.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(UpdateMessagePropertyValue updateMessagePropertyValue) {
            UpdateMessagePropertyValue updateMessagePropertyValue2 = updateMessagePropertyValue;
            return this.LIZ.encodedSizeWithTag(1, updateMessagePropertyValue2.extensions) + this.LIZIZ.encodedSizeWithTag(2, updateMessagePropertyValue2.property_list) + updateMessagePropertyValue2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final UpdateMessagePropertyValue redact(UpdateMessagePropertyValue updateMessagePropertyValue) {
            C0YWA c0ywaNewBuilder = updateMessagePropertyValue.newBuilder();
            C1516540pZE.LJIIJ(c0ywaNewBuilder.LJ, PropertyItemList.ADAPTER);
            c0ywaNewBuilder.clearUnknownFields();
            return c0ywaNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, UpdateMessagePropertyValue updateMessagePropertyValue) {
            UpdateMessagePropertyValue updateMessagePropertyValue2 = updateMessagePropertyValue;
            this.LIZ.encodeWithTag(protoWriter, 1, updateMessagePropertyValue2.extensions);
            this.LIZIZ.encodeWithTag(protoWriter, 2, updateMessagePropertyValue2.property_list);
            protoWriter.writeBytes(updateMessagePropertyValue2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @C09CT("extensions")
    public final Map<String, String> extensions;

    @C09CT("property_list")
    public final Map<String, PropertyItemList> property_list;

    @Override // com.squareup.wire.Message
    public C0YWA newBuilder() {
        C0YWA c0ywa = new C0YWA();
        c0ywa.LIZLLL = C1516540pZE.LIZLLL("extensions", this.extensions);
        c0ywa.LJ = C1516540pZE.LIZLLL("property_list", this.property_list);
        c0ywa.addUnknownFields(unknownFields());
        return c0ywa;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Map<String, String> map = this.extensions;
        if (map != null && !map.isEmpty()) {
            sb.append(", extensions=");
            sb.append(this.extensions);
        }
        Map<String, PropertyItemList> map2 = this.property_list;
        if (map2 != null && !map2.isEmpty()) {
            sb.append(", property_list=");
            sb.append(this.property_list);
        }
        sb.replace(0, 2, "UpdateMessagePropertyValue{");
        sb.append('}');
        return sb.toString();
    }

    public UpdateMessagePropertyValue(Map<String, String> map, Map<String, PropertyItemList> map2) {
        this(map, map2, ByteString.EMPTY);
    }

    public UpdateMessagePropertyValue(Map<String, String> map, Map<String, PropertyItemList> map2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.extensions = C1516540pZE.LJI("extensions", map);
        this.property_list = C1516540pZE.LJI("property_list", map2);
    }
}
