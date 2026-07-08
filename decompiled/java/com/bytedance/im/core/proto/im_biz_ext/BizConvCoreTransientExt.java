package com.bytedance.im.core.proto.im_biz_ext;

import X.C09CT;
import X.C0YWG;
import X.C1516540pZE;
import com.bytedance.im.core.proto.im_biz_ext.BizConvCoreTransientExt;
import com.bytedance.im.core.proto.im_biz_ext.ExtField;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class BizConvCoreTransientExt extends Message<BizConvCoreTransientExt, C0YWG> {
    public static final ProtoAdapter<BizConvCoreTransientExt> ADAPTER = new ProtoAdapter<BizConvCoreTransientExt>() { // from class: X.0YWF
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final BizConvCoreTransientExt decode(ProtoReader protoReader) {
            C0YWG c0ywg = new C0YWG();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c0ywg.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c0ywg.LIZLLL.add(ExtField.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c0ywg.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(BizConvCoreTransientExt bizConvCoreTransientExt) {
            BizConvCoreTransientExt bizConvCoreTransientExt2 = bizConvCoreTransientExt;
            return ExtField.ADAPTER.asRepeated().encodedSizeWithTag(1, bizConvCoreTransientExt2.fields) + bizConvCoreTransientExt2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final BizConvCoreTransientExt redact(BizConvCoreTransientExt bizConvCoreTransientExt) {
            C0YWG c0ywgNewBuilder = bizConvCoreTransientExt.newBuilder();
            C1516540pZE.LJIIIZ(c0ywgNewBuilder.LIZLLL, ExtField.ADAPTER);
            c0ywgNewBuilder.clearUnknownFields();
            return c0ywgNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, BizConvCoreTransientExt bizConvCoreTransientExt) {
            BizConvCoreTransientExt bizConvCoreTransientExt2 = bizConvCoreTransientExt;
            ExtField.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, bizConvCoreTransientExt2.fields);
            protoWriter.writeBytes(bizConvCoreTransientExt2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @C09CT("fields")
    public final List<ExtField> fields;

    @Override // com.squareup.wire.Message
    public C0YWG newBuilder() {
        C0YWG c0ywg = new C0YWG();
        c0ywg.LIZLLL = C1516540pZE.LIZJ("fields", this.fields);
        c0ywg.addUnknownFields(unknownFields());
        return c0ywg;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<ExtField> list = this.fields;
        if (list != null && !list.isEmpty()) {
            sb.append(", fields=");
            sb.append(this.fields);
        }
        sb.replace(0, 2, "BizConvCoreTransientExt{");
        sb.append('}');
        return sb.toString();
    }

    public BizConvCoreTransientExt(List<ExtField> list) {
        this(list, ByteString.EMPTY);
    }

    public BizConvCoreTransientExt(List<ExtField> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.fields = C1516540pZE.LJFF("fields", list);
    }
}
