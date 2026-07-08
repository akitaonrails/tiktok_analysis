package com.bytedance.im.core.proto.status_message;

import X.C09CT;
import X.C2237951CiX;
import com.bytedance.im.core.proto.status_message.RefreshMessageEntity;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class RefreshMessageEntity extends Message<RefreshMessageEntity, C2237951CiX> {
    public static final ProtoAdapter<RefreshMessageEntity> ADAPTER = new ProtoAdapter<RefreshMessageEntity>() { // from class: X.1CiW
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final RefreshMessageEntity decode(ProtoReader protoReader) {
            C2237951CiX c2237951CiX = new C2237951CiX();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2237951CiX.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c2237951CiX.LJ = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c2237951CiX.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2237951CiX.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(RefreshMessageEntity refreshMessageEntity) {
            RefreshMessageEntity refreshMessageEntity2 = refreshMessageEntity;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return protoAdapter.encodedSizeWithTag(1, refreshMessageEntity2.server_message_id) + protoAdapter.encodedSizeWithTag(2, refreshMessageEntity2.version) + refreshMessageEntity2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final RefreshMessageEntity redact(RefreshMessageEntity refreshMessageEntity) {
            C2237951CiX c2237951CiXNewBuilder = refreshMessageEntity.newBuilder();
            c2237951CiXNewBuilder.clearUnknownFields();
            return c2237951CiXNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, RefreshMessageEntity refreshMessageEntity) {
            RefreshMessageEntity refreshMessageEntity2 = refreshMessageEntity;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, refreshMessageEntity2.server_message_id);
            protoAdapter.encodeWithTag(protoWriter, 2, refreshMessageEntity2.version);
            protoWriter.writeBytes(refreshMessageEntity2.unknownFields());
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
    public C2237951CiX newBuilder() {
        C2237951CiX c2237951CiX = new C2237951CiX();
        c2237951CiX.LIZLLL = this.server_message_id;
        c2237951CiX.LJ = this.version;
        c2237951CiX.addUnknownFields(unknownFields());
        return c2237951CiX;
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
        sb.replace(0, 2, "RefreshMessageEntity{");
        sb.append('}');
        return sb.toString();
    }

    public RefreshMessageEntity(Long l, Long l2) {
        this(l, l2, ByteString.EMPTY);
    }

    public RefreshMessageEntity(Long l, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.server_message_id = l;
        this.version = l2;
    }
}
