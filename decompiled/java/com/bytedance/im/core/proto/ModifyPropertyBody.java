package com.bytedance.im.core.proto;

import X.C09CT;
import X.C0YAH;
import X.C1516540pZE;
import com.bytedance.im.core.proto.ModifyPropertyBody;
import com.bytedance.im.core.proto.ModifyPropertyContent;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class ModifyPropertyBody extends Message<ModifyPropertyBody, C0YAH> {
    public static final long serialVersionUID = 0;

    @C09CT("client_message_id")
    public final String client_message_id;

    @C09CT("conversation_id")
    public final String conversation_id;

    @C09CT("conversation_short_id")
    public final Long conversation_short_id;

    @C09CT("conversation_type")
    public final Integer conversation_type;

    @C09CT("modify_property_content")
    public final List<ModifyPropertyContent> modify_property_content;

    @C09CT("server_message_id")
    public final Long server_message_id;
    public static final ProtoAdapter<ModifyPropertyBody> ADAPTER = new ProtoAdapter<ModifyPropertyBody>() { // from class: X.0YAI
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final ModifyPropertyBody decode(ProtoReader protoReader) {
            C0YAH c0yah = new C0YAH();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c0yah.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c0yah.LJ = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 3:
                            c0yah.LJFF = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            c0yah.LJI = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 5:
                            c0yah.LJII = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c0yah.LJIIIIZZ.add(ModifyPropertyContent.ADAPTER.decode(protoReader));
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c0yah.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c0yah.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(ModifyPropertyBody modifyPropertyBody) {
            ModifyPropertyBody modifyPropertyBody2 = modifyPropertyBody;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, modifyPropertyBody2.conversation_id) + ProtoAdapter.INT32.encodedSizeWithTag(2, modifyPropertyBody2.conversation_type);
            ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(3, modifyPropertyBody2.conversation_short_id) + protoAdapter2.encodedSizeWithTag(4, modifyPropertyBody2.server_message_id) + protoAdapter.encodedSizeWithTag(5, modifyPropertyBody2.client_message_id) + ModifyPropertyContent.ADAPTER.asRepeated().encodedSizeWithTag(6, modifyPropertyBody2.modify_property_content) + modifyPropertyBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, ModifyPropertyBody modifyPropertyBody) {
            ModifyPropertyBody modifyPropertyBody2 = modifyPropertyBody;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, modifyPropertyBody2.conversation_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, modifyPropertyBody2.conversation_type);
            ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
            protoAdapter2.encodeWithTag(protoWriter, 3, modifyPropertyBody2.conversation_short_id);
            protoAdapter2.encodeWithTag(protoWriter, 4, modifyPropertyBody2.server_message_id);
            protoAdapter.encodeWithTag(protoWriter, 5, modifyPropertyBody2.client_message_id);
            ModifyPropertyContent.ADAPTER.asRepeated().encodeWithTag(protoWriter, 6, modifyPropertyBody2.modify_property_content);
            protoWriter.writeBytes(modifyPropertyBody2.unknownFields());
        }
    };
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Long DEFAULT_SERVER_MESSAGE_ID = 0L;

    @Override // com.squareup.wire.Message
    public C0YAH newBuilder() {
        C0YAH c0yah = new C0YAH();
        c0yah.LIZLLL = this.conversation_id;
        c0yah.LJ = this.conversation_type;
        c0yah.LJFF = this.conversation_short_id;
        c0yah.LJI = this.server_message_id;
        c0yah.LJII = this.client_message_id;
        c0yah.LJIIIIZZ = C1516540pZE.LIZJ("modify_property_content", this.modify_property_content);
        c0yah.addUnknownFields(unknownFields());
        return c0yah;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.conversation_id != null) {
            sb.append(", conversation_id=");
            sb.append(this.conversation_id);
        }
        if (this.conversation_type != null) {
            sb.append(", conversation_type=");
            sb.append(this.conversation_type);
        }
        if (this.conversation_short_id != null) {
            sb.append(", conversation_short_id=");
            sb.append(this.conversation_short_id);
        }
        if (this.server_message_id != null) {
            sb.append(", server_message_id=");
            sb.append(this.server_message_id);
        }
        if (this.client_message_id != null) {
            sb.append(", client_message_id=");
            sb.append(this.client_message_id);
        }
        List<ModifyPropertyContent> list = this.modify_property_content;
        if (list != null && !list.isEmpty()) {
            sb.append(", modify_property_content=");
            sb.append(this.modify_property_content);
        }
        sb.replace(0, 2, "ModifyPropertyBody{");
        sb.append('}');
        return sb.toString();
    }

    public ModifyPropertyBody(String str, Integer num, Long l, Long l2, String str2, List<ModifyPropertyContent> list) {
        this(str, num, l, l2, str2, list, ByteString.EMPTY);
    }

    public ModifyPropertyBody(String str, Integer num, Long l, Long l2, String str2, List<ModifyPropertyContent> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_id = str;
        this.conversation_type = num;
        this.conversation_short_id = l;
        this.server_message_id = l2;
        this.client_message_id = str2;
        this.modify_property_content = C1516540pZE.LJFF("modify_property_content", list);
    }
}
