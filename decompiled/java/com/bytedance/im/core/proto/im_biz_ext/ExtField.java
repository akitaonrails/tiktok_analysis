package com.bytedance.im.core.proto.im_biz_ext;

import X.C09CT;
import X.C889740YvM;
import com.bytedance.im.core.proto.im_biz_ext.ExtField;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class ExtField extends Message<ExtField, C889740YvM> {
    public static final long serialVersionUID = 0;

    @C09CT("conv_ext")
    public final ByteString conv_ext;

    @C09CT("field_id")
    public final Integer field_id;

    @C09CT("version")
    public final Long version;
    public static final ProtoAdapter<ExtField> ADAPTER = new ProtoAdapter<ExtField>() { // from class: X.0YvL
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final ExtField decode(ProtoReader protoReader) {
            C889740YvM c889740YvM = new C889740YvM();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c889740YvM.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c889740YvM.LJFF = ProtoAdapter.INT64.decode(protoReader);
                            }
                        } else {
                            c889740YvM.LJ = ProtoAdapter.BYTES.decode(protoReader);
                        }
                    } else {
                        c889740YvM.LIZLLL = ProtoAdapter.UINT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c889740YvM.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(ExtField extField) {
            ExtField extField2 = extField;
            return ProtoAdapter.UINT32.encodedSizeWithTag(1, extField2.field_id) + ProtoAdapter.BYTES.encodedSizeWithTag(2, extField2.conv_ext) + ProtoAdapter.INT64.encodedSizeWithTag(3, extField2.version) + extField2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final ExtField redact(ExtField extField) {
            C889740YvM c889740YvMNewBuilder = extField.newBuilder();
            c889740YvMNewBuilder.clearUnknownFields();
            return c889740YvMNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, ExtField extField) {
            ExtField extField2 = extField;
            ProtoAdapter.UINT32.encodeWithTag(protoWriter, 1, extField2.field_id);
            ProtoAdapter.BYTES.encodeWithTag(protoWriter, 2, extField2.conv_ext);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, extField2.version);
            protoWriter.writeBytes(extField2.unknownFields());
        }
    };
    public static final Integer DEFAULT_FIELD_ID = 0;
    public static final ByteString DEFAULT_CONV_EXT = ByteString.EMPTY;
    public static final Long DEFAULT_VERSION = 0L;

    @Override // com.squareup.wire.Message
    public C889740YvM newBuilder() {
        C889740YvM c889740YvM = new C889740YvM();
        c889740YvM.LIZLLL = this.field_id;
        c889740YvM.LJ = this.conv_ext;
        c889740YvM.LJFF = this.version;
        c889740YvM.addUnknownFields(unknownFields());
        return c889740YvM;
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
        sb.replace(0, 2, "ExtField{");
        sb.append('}');
        return sb.toString();
    }

    public ExtField(Integer num, ByteString byteString, Long l) {
        this(num, byteString, l, ByteString.EMPTY);
    }

    public ExtField(Integer num, ByteString byteString, Long l, ByteString byteString2) {
        super(ADAPTER, byteString2);
        this.field_id = num;
        this.conv_ext = byteString;
        this.version = l;
    }
}
