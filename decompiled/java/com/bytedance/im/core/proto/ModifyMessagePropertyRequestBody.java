package com.bytedance.im.core.proto;

import X.C09CT;
import X.C0YC4;
import com.bytedance.im.core.proto.ModifyMessagePropertyRequestBody;
import com.bytedance.im.core.proto.ModifyPropertyBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class ModifyMessagePropertyRequestBody extends Message<ModifyMessagePropertyRequestBody, C0YC4> {
    public static final ProtoAdapter<ModifyMessagePropertyRequestBody> ADAPTER = new ProtoAdapter<ModifyMessagePropertyRequestBody>() { // from class: X.0YC3
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final ModifyMessagePropertyRequestBody decode(ProtoReader protoReader) {
            C0YC4 c0yc4 = new C0YC4();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c0yc4.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c0yc4.LJ = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c0yc4.LIZLLL = ModifyPropertyBody.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c0yc4.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(ModifyMessagePropertyRequestBody modifyMessagePropertyRequestBody) {
            ModifyMessagePropertyRequestBody modifyMessagePropertyRequestBody2 = modifyMessagePropertyRequestBody;
            return ModifyPropertyBody.ADAPTER.encodedSizeWithTag(1, modifyMessagePropertyRequestBody2.property_list) + ProtoAdapter.STRING.encodedSizeWithTag(2, modifyMessagePropertyRequestBody2.ticket) + modifyMessagePropertyRequestBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, ModifyMessagePropertyRequestBody modifyMessagePropertyRequestBody) {
            ModifyMessagePropertyRequestBody modifyMessagePropertyRequestBody2 = modifyMessagePropertyRequestBody;
            ModifyPropertyBody.ADAPTER.encodeWithTag(protoWriter, 1, modifyMessagePropertyRequestBody2.property_list);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, modifyMessagePropertyRequestBody2.ticket);
            protoWriter.writeBytes(modifyMessagePropertyRequestBody2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @C09CT("property_list")
    public final ModifyPropertyBody property_list;

    @C09CT("ticket")
    public final String ticket;

    @Override // com.squareup.wire.Message
    public C0YC4 newBuilder() {
        C0YC4 c0yc4 = new C0YC4();
        c0yc4.LIZLLL = this.property_list;
        c0yc4.LJ = this.ticket;
        c0yc4.addUnknownFields(unknownFields());
        return c0yc4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.property_list != null) {
            sb.append(", property_list=");
            sb.append(this.property_list);
        }
        if (this.ticket != null) {
            sb.append(", ticket=");
            sb.append(this.ticket);
        }
        sb.replace(0, 2, "ModifyMessagePropertyRequestBody{");
        sb.append('}');
        return sb.toString();
    }

    public ModifyMessagePropertyRequestBody(ModifyPropertyBody modifyPropertyBody, String str) {
        this(modifyPropertyBody, str, ByteString.EMPTY);
    }

    public ModifyMessagePropertyRequestBody(ModifyPropertyBody modifyPropertyBody, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.property_list = modifyPropertyBody;
        this.ticket = str;
    }
}
