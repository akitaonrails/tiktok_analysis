package com.bytedance.im.core.proto.im_biz_ext;

import X.C09CT;
import X.C0YZT;
import X.C1516540pZE;
import com.bytedance.im.core.proto.im_biz_ext.BizConvSettingPersistentExt;
import com.bytedance.im.core.proto.im_biz_ext.SettingExtField;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class BizConvSettingPersistentExt extends Message<BizConvSettingPersistentExt, C0YZT> {
    public static final ProtoAdapter<BizConvSettingPersistentExt> ADAPTER = new ProtoAdapter<BizConvSettingPersistentExt>() { // from class: X.0YZS
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final BizConvSettingPersistentExt decode(ProtoReader protoReader) {
            C0YZT c0yzt = new C0YZT();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c0yzt.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c0yzt.LIZLLL.add(SettingExtField.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c0yzt.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(BizConvSettingPersistentExt bizConvSettingPersistentExt) {
            BizConvSettingPersistentExt bizConvSettingPersistentExt2 = bizConvSettingPersistentExt;
            return SettingExtField.ADAPTER.asRepeated().encodedSizeWithTag(1, bizConvSettingPersistentExt2.fields) + bizConvSettingPersistentExt2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final BizConvSettingPersistentExt redact(BizConvSettingPersistentExt bizConvSettingPersistentExt) {
            C0YZT c0yztNewBuilder = bizConvSettingPersistentExt.newBuilder();
            C1516540pZE.LJIIIZ(c0yztNewBuilder.LIZLLL, SettingExtField.ADAPTER);
            c0yztNewBuilder.clearUnknownFields();
            return c0yztNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, BizConvSettingPersistentExt bizConvSettingPersistentExt) {
            BizConvSettingPersistentExt bizConvSettingPersistentExt2 = bizConvSettingPersistentExt;
            SettingExtField.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, bizConvSettingPersistentExt2.fields);
            protoWriter.writeBytes(bizConvSettingPersistentExt2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @C09CT("fields")
    public final List<SettingExtField> fields;

    @Override // com.squareup.wire.Message
    public C0YZT newBuilder() {
        C0YZT c0yzt = new C0YZT();
        c0yzt.LIZLLL = C1516540pZE.LIZJ("fields", this.fields);
        c0yzt.addUnknownFields(unknownFields());
        return c0yzt;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<SettingExtField> list = this.fields;
        if (list != null && !list.isEmpty()) {
            sb.append(", fields=");
            sb.append(this.fields);
        }
        sb.replace(0, 2, "BizConvSettingPersistentExt{");
        sb.append('}');
        return sb.toString();
    }

    public BizConvSettingPersistentExt(List<SettingExtField> list) {
        this(list, ByteString.EMPTY);
    }

    public BizConvSettingPersistentExt(List<SettingExtField> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.fields = C1516540pZE.LJFF("fields", list);
    }
}
