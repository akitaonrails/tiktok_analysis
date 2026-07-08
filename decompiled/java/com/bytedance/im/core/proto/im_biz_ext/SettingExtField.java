package com.bytedance.im.core.proto.im_biz_ext;

import X.C09CT;
import X.C889650YvD;
import com.bytedance.im.core.proto.im_biz_ext.SettingExtField;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class SettingExtField extends Message<SettingExtField, C889650YvD> {
    public static final long serialVersionUID = 0;

    @C09CT("conv_ext")
    public final ByteString conv_ext;

    @C09CT("field_id")
    public final Integer field_id;

    @C09CT("version")
    public final Long version;
    public static final ProtoAdapter<SettingExtField> ADAPTER = new ProtoAdapter<SettingExtField>() { // from class: X.0Yv8
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final SettingExtField decode(ProtoReader protoReader) {
            C889650YvD c889650YvD = new C889650YvD();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c889650YvD.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c889650YvD.LJFF = ProtoAdapter.INT64.decode(protoReader);
                            }
                        } else {
                            c889650YvD.LJ = ProtoAdapter.BYTES.decode(protoReader);
                        }
                    } else {
                        c889650YvD.LIZLLL = ProtoAdapter.UINT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c889650YvD.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(SettingExtField settingExtField) {
            SettingExtField settingExtField2 = settingExtField;
            return ProtoAdapter.UINT32.encodedSizeWithTag(1, settingExtField2.field_id) + ProtoAdapter.BYTES.encodedSizeWithTag(2, settingExtField2.conv_ext) + ProtoAdapter.INT64.encodedSizeWithTag(3, settingExtField2.version) + settingExtField2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final SettingExtField redact(SettingExtField settingExtField) {
            C889650YvD c889650YvDNewBuilder = settingExtField.newBuilder();
            c889650YvDNewBuilder.clearUnknownFields();
            return c889650YvDNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, SettingExtField settingExtField) {
            SettingExtField settingExtField2 = settingExtField;
            ProtoAdapter.UINT32.encodeWithTag(protoWriter, 1, settingExtField2.field_id);
            ProtoAdapter.BYTES.encodeWithTag(protoWriter, 2, settingExtField2.conv_ext);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, settingExtField2.version);
            protoWriter.writeBytes(settingExtField2.unknownFields());
        }
    };
    public static final Integer DEFAULT_FIELD_ID = 0;
    public static final ByteString DEFAULT_CONV_EXT = ByteString.EMPTY;
    public static final Long DEFAULT_VERSION = 0L;

    @Override // com.squareup.wire.Message
    public C889650YvD newBuilder() {
        C889650YvD c889650YvD = new C889650YvD();
        c889650YvD.LIZLLL = this.field_id;
        c889650YvD.LJ = this.conv_ext;
        c889650YvD.LJFF = this.version;
        c889650YvD.addUnknownFields(unknownFields());
        return c889650YvD;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.field_id != null) {
            sb.append(", field_id=");
            sb.append(this.field_id);
        }
        if (this.conv_ext != null) {
            sb.append(", conv_ext=");
            sb.append(this.conv_ext);
        }
        if (this.version != null) {
            sb.append(", version=");
            sb.append(this.version);
        }
        sb.replace(0, 2, "SettingExtField{");
        sb.append('}');
        return sb.toString();
    }

    public SettingExtField(Integer num, ByteString byteString, Long l) {
        this(num, byteString, l, ByteString.EMPTY);
    }

    public SettingExtField(Integer num, ByteString byteString, Long l, ByteString byteString2) {
        super(ADAPTER, byteString2);
        this.field_id = num;
        this.conv_ext = byteString;
        this.version = l;
    }
}
