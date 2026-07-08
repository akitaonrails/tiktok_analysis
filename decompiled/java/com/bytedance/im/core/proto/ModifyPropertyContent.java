package com.bytedance.im.core.proto;

import X.C09CT;
import X.C0YAP;
import X.C0YS6;
import X.C0YS9;
import com.bytedance.im.core.proto.ModifyPropertyContent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class ModifyPropertyContent extends Message<ModifyPropertyContent, C0YS9> {
    public static final long serialVersionUID = 0;

    @C09CT("biz_extra")
    public final ByteString biz_extra;

    @C09CT("idempotent_id")
    public final String idempotent_id;

    @C09CT("key")
    public final String key;

    @C09CT("operation")
    public final C0YS6 operation;

    @C09CT("type")
    public final C0YAP type;

    @C09CT("value")
    public final String value;
    public static final ProtoAdapter<ModifyPropertyContent> ADAPTER = new ProtoAdapter<ModifyPropertyContent>() { // from class: X.0YS8
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final ModifyPropertyContent decode(ProtoReader protoReader) {
            C0YS9 c0ys9 = new C0YS9();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            try {
                                c0ys9.LIZLLL = C0YS6.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c0ys9.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                            break;
                        case 2:
                            c0ys9.LJ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c0ys9.LJFF = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c0ys9.LJI = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            try {
                                c0ys9.LJII = C0YAP.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                TryCatchGuardChecker.doCheck(e2);
                                c0ys9.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                            }
                            break;
                        case 6:
                            c0ys9.LJIIIIZZ = ProtoAdapter.BYTES.decode(protoReader);
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c0ys9.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c0ys9.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(ModifyPropertyContent modifyPropertyContent) {
            ModifyPropertyContent modifyPropertyContent2 = modifyPropertyContent;
            int iEncodedSizeWithTag = C0YS6.ADAPTER.encodedSizeWithTag(1, modifyPropertyContent2.operation);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, modifyPropertyContent2.key) + protoAdapter.encodedSizeWithTag(3, modifyPropertyContent2.value) + protoAdapter.encodedSizeWithTag(4, modifyPropertyContent2.idempotent_id) + C0YAP.ADAPTER.encodedSizeWithTag(5, modifyPropertyContent2.type) + ProtoAdapter.BYTES.encodedSizeWithTag(6, modifyPropertyContent2.biz_extra) + modifyPropertyContent2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, ModifyPropertyContent modifyPropertyContent) {
            ModifyPropertyContent modifyPropertyContent2 = modifyPropertyContent;
            C0YS6.ADAPTER.encodeWithTag(protoWriter, 1, modifyPropertyContent2.operation);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 2, modifyPropertyContent2.key);
            protoAdapter.encodeWithTag(protoWriter, 3, modifyPropertyContent2.value);
            protoAdapter.encodeWithTag(protoWriter, 4, modifyPropertyContent2.idempotent_id);
            C0YAP.ADAPTER.encodeWithTag(protoWriter, 5, modifyPropertyContent2.type);
            ProtoAdapter.BYTES.encodeWithTag(protoWriter, 6, modifyPropertyContent2.biz_extra);
            protoWriter.writeBytes(modifyPropertyContent2.unknownFields());
        }
    };
    public static final C0YS6 DEFAULT_OPERATION = C0YS6.ADD_PROPERTY_ITEM;
    public static final C0YAP DEFAULT_TYPE = C0YAP.MESSAGE_REACTION_TYPE_UNKNOWN;
    public static final ByteString DEFAULT_BIZ_EXTRA = ByteString.EMPTY;

    @Override // com.squareup.wire.Message
    public C0YS9 newBuilder() {
        C0YS9 c0ys9 = new C0YS9();
        c0ys9.LIZLLL = this.operation;
        c0ys9.LJ = this.key;
        c0ys9.LJFF = this.value;
        c0ys9.LJI = this.idempotent_id;
        c0ys9.LJII = this.type;
        c0ys9.LJIIIIZZ = this.biz_extra;
        c0ys9.addUnknownFields(unknownFields());
        return c0ys9;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.operation != null) {
            sb.append(", operation=");
            sb.append(this.operation);
        }
        if (this.key != null) {
            sb.append(", key=");
            sb.append(this.key);
        }
        if (this.value != null) {
            sb.append(", value=");
            sb.append(this.value);
        }
        if (this.idempotent_id != null) {
            sb.append(", idempotent_id=");
            sb.append(this.idempotent_id);
        }
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.biz_extra != null) {
            sb.append(", biz_extra=");
            sb.append(this.biz_extra);
        }
        sb.replace(0, 2, "ModifyPropertyContent{");
        sb.append('}');
        return sb.toString();
    }

    public ModifyPropertyContent(C0YS6 c0ys6, String str, String str2, String str3, C0YAP c0yap) {
        this(c0ys6, str, str2, str3, c0yap, ByteString.EMPTY);
    }

    public ModifyPropertyContent(C0YS6 c0ys6, String str, String str2, String str3, C0YAP c0yap, ByteString byteString) {
        this(c0ys6, str, str2, str3, c0yap, byteString, ByteString.EMPTY);
    }

    public ModifyPropertyContent(C0YS6 c0ys6, String str, String str2, String str3, C0YAP c0yap, ByteString byteString, ByteString byteString2) {
        super(ADAPTER, byteString2);
        this.operation = c0ys6;
        this.key = str;
        this.value = str2;
        this.idempotent_id = str3;
        this.type = c0yap;
        this.biz_extra = byteString;
    }
}
