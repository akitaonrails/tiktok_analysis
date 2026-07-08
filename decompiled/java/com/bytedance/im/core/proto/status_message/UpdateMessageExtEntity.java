package com.bytedance.im.core.proto.status_message;

import X.C09CT;
import X.C2237971CiZ;
import com.bytedance.im.core.proto.status_message.UpdateMessageExtEntity;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class UpdateMessageExtEntity extends Message<UpdateMessageExtEntity, C2237971CiZ> {
    public static final ProtoAdapter<UpdateMessageExtEntity> ADAPTER = new ProtoAdapter<UpdateMessageExtEntity>() { // from class: X.1CiY
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final UpdateMessageExtEntity decode(ProtoReader protoReader) {
            C2237971CiZ c2237971CiZ = new C2237971CiZ();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2237971CiZ.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c2237971CiZ.LJ = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c2237971CiZ.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2237971CiZ.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(UpdateMessageExtEntity updateMessageExtEntity) {
            UpdateMessageExtEntity updateMessageExtEntity2 = updateMessageExtEntity;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return protoAdapter.encodedSizeWithTag(1, updateMessageExtEntity2.server_message_id) + protoAdapter.encodedSizeWithTag(2, updateMessageExtEntity2.version) + updateMessageExtEntity2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final UpdateMessageExtEntity redact(UpdateMessageExtEntity updateMessageExtEntity) {
            C2237971CiZ c2237971CiZNewBuilder = updateMessageExtEntity.newBuilder();
            c2237971CiZNewBuilder.clearUnknownFields();
            return c2237971CiZNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, UpdateMessageExtEntity updateMessageExtEntity) {
            UpdateMessageExtEntity updateMessageExtEntity2 = updateMessageExtEntity;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, updateMessageExtEntity2.server_message_id);
            protoAdapter.encodeWithTag(protoWriter, 2, updateMessageExtEntity2.version);
            protoWriter.writeBytes(updateMessageExtEntity2.unknownFields());
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
    public C2237971CiZ newBuilder() {
        C2237971CiZ c2237971CiZ = new C2237971CiZ();
        c2237971CiZ.LIZLLL = this.server_message_id;
        c2237971CiZ.LJ = this.version;
        c2237971CiZ.addUnknownFields(unknownFields());
        return c2237971CiZ;
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
        sb.replace(0, 2, "UpdateMessageExtEntity{");
        sb.append('}');
        return sb.toString();
    }

    public UpdateMessageExtEntity(Long l, Long l2) {
        this(l, l2, ByteString.EMPTY);
    }

    public UpdateMessageExtEntity(Long l, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.server_message_id = l;
        this.version = l2;
    }
}
