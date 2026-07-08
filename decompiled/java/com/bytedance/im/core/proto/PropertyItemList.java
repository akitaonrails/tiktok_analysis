package com.bytedance.im.core.proto;

import X.C09CT;
import X.C0YVV;
import X.C1516540pZE;
import com.bytedance.im.core.proto.PropertyItem;
import com.bytedance.im.core.proto.PropertyItemList;
import com.bytedance.im.core.proto.UrlStruct;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class PropertyItemList extends Message<PropertyItemList, C0YVV> {
    public static final ProtoAdapter<PropertyItemList> ADAPTER = new ProtoAdapter<PropertyItemList>() { // from class: X.0YVU
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final PropertyItemList decode(ProtoReader protoReader) {
            C0YVV c0yvv = new C0YVV();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c0yvv.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c0yvv.LJ = UrlStruct.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c0yvv.LIZLLL.add(PropertyItem.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c0yvv.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(PropertyItemList propertyItemList) {
            PropertyItemList propertyItemList2 = propertyItemList;
            return PropertyItem.ADAPTER.asRepeated().encodedSizeWithTag(1, propertyItemList2.Items) + UrlStruct.ADAPTER.encodedSizeWithTag(2, propertyItemList2.resource_url) + propertyItemList2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, PropertyItemList propertyItemList) {
            PropertyItemList propertyItemList2 = propertyItemList;
            PropertyItem.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, propertyItemList2.Items);
            UrlStruct.ADAPTER.encodeWithTag(protoWriter, 2, propertyItemList2.resource_url);
            protoWriter.writeBytes(propertyItemList2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @C09CT("Items")
    public final List<PropertyItem> Items;

    @C09CT("resource_url")
    public final UrlStruct resource_url;

    @Override // com.squareup.wire.Message
    public C0YVV newBuilder() {
        C0YVV c0yvv = new C0YVV();
        c0yvv.LIZLLL = C1516540pZE.LIZJ("Items", this.Items);
        c0yvv.LJ = this.resource_url;
        c0yvv.addUnknownFields(unknownFields());
        return c0yvv;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<PropertyItem> list = this.Items;
        if (list != null && !list.isEmpty()) {
            sb.append(", Items=");
            sb.append(this.Items);
        }
        if (this.resource_url != null) {
            sb.append(", resource_url=");
            sb.append(this.resource_url);
        }
        sb.replace(0, 2, "PropertyItemList{");
        sb.append('}');
        return sb.toString();
    }

    public PropertyItemList(List<PropertyItem> list, UrlStruct urlStruct) {
        this(list, urlStruct, ByteString.EMPTY);
    }

    public PropertyItemList(List<PropertyItem> list, UrlStruct urlStruct, ByteString byteString) {
        super(ADAPTER, byteString);
        this.Items = C1516540pZE.LJFF("Items", list);
        this.resource_url = urlStruct;
    }
}
