package com.bytedance.im.core.proto.status_message;

import X.C09CT;
import X.C2237991Cib;
import com.bytedance.im.core.proto.status_message.UpdateMessagePropertyEntity;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class UpdateMessagePropertyEntity extends Message<UpdateMessagePropertyEntity, C2237991Cib> {
    public static final ProtoAdapter<UpdateMessagePropertyEntity> ADAPTER = new ProtoAdapter<UpdateMessagePropertyEntity>() { // from class: X.1Cia
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final UpdateMessagePropertyEntity decode(ProtoReader protoReader) {
            C2237991Cib c2237991Cib = new C2237991Cib();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2237991Cib.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c2237991Cib.LJ = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c2237991Cib.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2237991Cib.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(UpdateMessagePropertyEntity updateMessagePropertyEntity) {
            UpdateMessagePropertyEntity updateMessagePropertyEntity2 = updateMessagePropertyEntity;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return protoAdapter.encodedSizeWithTag(1, updateMessagePropertyEntity2.server_message_id) + protoAdapter.encodedSizeWithTag(2, updateMessagePropertyEntity2.version) + updateMessagePropertyEntity2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final UpdateMessagePropertyEntity redact(UpdateMessagePropertyEntity updateMessagePropertyEntity) {
            C2237991Cib c2237991CibNewBuilder = updateMessagePropertyEntity.newBuilder();
            c2237991CibNewBuilder.clearUnknownFields();
            return c2237991CibNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, UpdateMessagePropertyEntity updateMessagePropertyEntity) {
            UpdateMessagePropertyEntity updateMessagePropertyEntity2 = updateMessagePropertyEntity;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, updateMessagePropertyEntity2.server_message_id);
            protoAdapter.encodeWithTag(protoWriter, 2, updateMessagePropertyEntity2.version);
            protoWriter.writeBytes(updateMessagePropertyEntity2.unknownFields());
        }
    };
    public static final Long DEFAULT_SERVER_MESSAGE_ID = 0L;
    public static final Long DEFAULT_VERSION = 0L;
    public static final long serialVersionUID = 0;

    @C09CT("server_message_id")
    public final Long server_message_id;

    @C09CT("version")
    public final Long version;

    @Override // com.squareup.wire.Message
    public C2237991Cib newBuilder() {
        C2237991Cib c2237991Cib = new C2237991Cib();
        c2237991Cib.LIZLLL = this.server_message_id;
        c2237991Cib.LJ = this.version;
        c2237991Cib.addUnknownFields(unknownFields());
        return c2237991Cib;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.server_message_id != null) {
            sb.append(", server_message_id=");
            sb.append(this.server_message_id);
        }
        if (this.version != null) {
            sb.append(", version=");
            sb.append(this.version);
        }
        sb.replace(0, 2, "UpdateMessagePropertyEntity{");
        sb.append('}');
        return sb.toString();
    }

    public UpdateMessagePropertyEntity(Long l, Long l2) {
        this(l, l2, ByteString.EMPTY);
    }

    public UpdateMessagePropertyEntity(Long l, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.server_message_id = l;
        this.version = l2;
    }
}
