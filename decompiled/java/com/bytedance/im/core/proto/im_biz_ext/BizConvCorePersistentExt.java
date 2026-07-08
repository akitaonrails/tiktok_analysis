package com.bytedance.im.core.proto.im_biz_ext;

import X.C09CT;
import X.C0YWE;
import X.C1516540pZE;
import com.bytedance.im.core.proto.im_biz_ext.BizConvCorePersistentExt;
import com.bytedance.im.core.proto.im_biz_ext.ExtField;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class BizConvCorePersistentExt extends Message<BizConvCorePersistentExt, C0YWE> {
    public static final ProtoAdapter<BizConvCorePersistentExt> ADAPTER = new ProtoAdapter<BizConvCorePersistentExt>() { // from class: X.0YWD
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final BizConvCorePersistentExt decode(ProtoReader protoReader) {
            C0YWE c0ywe = new C0YWE();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c0ywe.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c0ywe.LIZLLL.add(ExtField.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c0ywe.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(BizConvCorePersistentExt bizConvCorePersistentExt) {
            BizConvCorePersistentExt bizConvCorePersistentExt2 = bizConvCorePersistentExt;
            return ExtField.ADAPTER.asRepeated().encodedSizeWithTag(1, bizConvCorePersistentExt2.fields) + bizConvCorePersistentExt2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final BizConvCorePersistentExt redact(BizConvCorePersistentExt bizConvCorePersistentExt) {
            C0YWE c0yweNewBuilder = bizConvCorePersistentExt.newBuilder();
            C1516540pZE.LJIIIZ(c0yweNewBuilder.LIZLLL, ExtField.ADAPTER);
            c0yweNewBuilder.clearUnknownFields();
            return c0yweNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, BizConvCorePersistentExt bizConvCorePersistentExt) {
            BizConvCorePersistentExt bizConvCorePersistentExt2 = bizConvCorePersistentExt;
            ExtField.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, bizConvCorePersistentExt2.fields);
            protoWriter.writeBytes(bizConvCorePersistentExt2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @C09CT("fields")
    public final List<ExtField> fields;

    @Override // com.squareup.wire.Message
    public C0YWE newBuilder() {
        C0YWE c0ywe = new C0YWE();
        c0ywe.LIZLLL = C1516540pZE.LIZJ("fields", this.fields);
        c0ywe.addUnknownFields(unknownFields());
        return c0ywe;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<ExtField> list = this.fields;
        if (list != null && !list.isEmpty()) {
            sb.append(", fields=");
            sb.append(this.fields);
        }
        sb.replace(0, 2, "BizConvCorePersistentExt{");
        sb.append('}');
        return sb.toString();
    }

    public BizConvCorePersistentExt(List<ExtField> list) {
        this(list, ByteString.EMPTY);
    }

    public BizConvCorePersistentExt(List<ExtField> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.fields = C1516540pZE.LJFF("fields", list);
    }
}
