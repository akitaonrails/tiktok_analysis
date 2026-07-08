package com.bytedance.im.core.proto.status_message;

import X.C09CT;
import X.C0YWC;
import X.C1516540pZE;
import com.bytedance.im.core.proto.status_message.PropertyItem;
import com.bytedance.im.core.proto.status_message.PropertyItemList;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class PropertyItemList extends Message<PropertyItemList, C0YWC> {
    public static final ProtoAdapter<PropertyItemList> ADAPTER = new ProtoAdapter<PropertyItemList>() { // from class: X.0YWB
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final PropertyItemList decode(ProtoReader protoReader) {
            C0YWC c0ywc = new C0YWC();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c0ywc.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c0ywc.LIZLLL.add(PropertyItem.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c0ywc.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(PropertyItemList propertyItemList) {
            PropertyItemList propertyItemList2 = propertyItemList;
            return PropertyItem.ADAPTER.asRepeated().encodedSizeWithTag(1, propertyItemList2.Items) + propertyItemList2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final PropertyItemList redact(PropertyItemList propertyItemList) {
            C0YWC c0ywcNewBuilder = propertyItemList.newBuilder();
            C1516540pZE.LJIIIZ(c0ywcNewBuilder.LIZLLL, PropertyItem.ADAPTER);
            c0ywcNewBuilder.clearUnknownFields();
            return c0ywcNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, PropertyItemList propertyItemList) {
            PropertyItemList propertyItemList2 = propertyItemList;
            PropertyItem.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, propertyItemList2.Items);
            protoWriter.writeBytes(propertyItemList2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @C09CT("Items")
    public final List<PropertyItem> Items;

    @Override // com.squareup.wire.Message
    public C0YWC newBuilder() {
        C0YWC c0ywc = new C0YWC();
        c0ywc.LIZLLL = C1516540pZE.LIZJ("Items", this.Items);
        c0ywc.addUnknownFields(unknownFields());
        return c0ywc;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<PropertyItem> list = this.Items;
        if (list != null && !list.isEmpty()) {
            sb.append(", Items=");
            sb.append(this.Items);
        }
        sb.replace(0, 2, "PropertyItemList{");
        sb.append('}');
        return sb.toString();
    }

    public PropertyItemList(List<PropertyItem> list) {
        this(list, ByteString.EMPTY);
    }

    public PropertyItemList(List<PropertyItem> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.Items = C1516540pZE.LJFF("Items", list);
    }
}
