package com.bytedance.im.core.proto.im_biz_ext;

import X.C09CT;
import X.C0YZV;
import X.C1516540pZE;
import com.bytedance.im.core.proto.im_biz_ext.BizConvSettingTransientExt;
import com.bytedance.im.core.proto.im_biz_ext.SettingExtField;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class BizConvSettingTransientExt extends Message<BizConvSettingTransientExt, C0YZV> {
    public static final ProtoAdapter<BizConvSettingTransientExt> ADAPTER = new ProtoAdapter<BizConvSettingTransientExt>() { // from class: X.0YZU
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final BizConvSettingTransientExt decode(ProtoReader protoReader) {
            C0YZV c0yzv = new C0YZV();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c0yzv.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c0yzv.LIZLLL.add(SettingExtField.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c0yzv.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(BizConvSettingTransientExt bizConvSettingTransientExt) {
            BizConvSettingTransientExt bizConvSettingTransientExt2 = bizConvSettingTransientExt;
            return SettingExtField.ADAPTER.asRepeated().encodedSizeWithTag(1, bizConvSettingTransientExt2.fields) + bizConvSettingTransientExt2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final BizConvSettingTransientExt redact(BizConvSettingTransientExt bizConvSettingTransientExt) {
            C0YZV c0yzvNewBuilder = bizConvSettingTransientExt.newBuilder();
            C1516540pZE.LJIIIZ(c0yzvNewBuilder.LIZLLL, SettingExtField.ADAPTER);
            c0yzvNewBuilder.clearUnknownFields();
            return c0yzvNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, BizConvSettingTransientExt bizConvSettingTransientExt) {
            BizConvSettingTransientExt bizConvSettingTransientExt2 = bizConvSettingTransientExt;
            SettingExtField.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, bizConvSettingTransientExt2.fields);
            protoWriter.writeBytes(bizConvSettingTransientExt2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @C09CT("fields")
    public final List<SettingExtField> fields;

    @Override // com.squareup.wire.Message
    public C0YZV newBuilder() {
        C0YZV c0yzv = new C0YZV();
        c0yzv.LIZLLL = C1516540pZE.LIZJ("fields", this.fields);
        c0yzv.addUnknownFields(unknownFields());
        return c0yzv;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<SettingExtField> list = this.fields;
        if (list != null && !list.isEmpty()) {
            sb.append(", fields=");
            sb.append(this.fields);
        }
        sb.replace(0, 2, "BizConvSettingTransientExt{");
        sb.append('}');
        return sb.toString();
    }

    public BizConvSettingTransientExt(List<SettingExtField> list) {
        this(list, ByteString.EMPTY);
    }

    public BizConvSettingTransientExt(List<SettingExtField> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.fields = C1516540pZE.LJFF("fields", list);
    }
}
