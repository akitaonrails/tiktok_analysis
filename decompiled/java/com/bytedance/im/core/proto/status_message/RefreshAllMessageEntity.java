package com.bytedance.im.core.proto.status_message;

import X.C09CT;
import X.C877080Yaw;
import com.bytedance.im.core.proto.status_message.RefreshAllMessageEntity;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class RefreshAllMessageEntity extends Message<RefreshAllMessageEntity, C877080Yaw> {
    public static final ProtoAdapter<RefreshAllMessageEntity> ADAPTER = new ProtoAdapter<RefreshAllMessageEntity>() { // from class: X.0Yav
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final RefreshAllMessageEntity decode(ProtoReader protoReader) {
            C877080Yaw c877080Yaw = new C877080Yaw();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c877080Yaw.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c877080Yaw.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c877080Yaw.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(RefreshAllMessageEntity refreshAllMessageEntity) {
            RefreshAllMessageEntity refreshAllMessageEntity2 = refreshAllMessageEntity;
            return ProtoAdapter.INT64.encodedSizeWithTag(1, refreshAllMessageEntity2.user_id) + refreshAllMessageEntity2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final RefreshAllMessageEntity redact(RefreshAllMessageEntity refreshAllMessageEntity) {
            C877080Yaw c877080YawNewBuilder = refreshAllMessageEntity.newBuilder();
            c877080YawNewBuilder.clearUnknownFields();
            return c877080YawNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, RefreshAllMessageEntity refreshAllMessageEntity) {
            RefreshAllMessageEntity refreshAllMessageEntity2 = refreshAllMessageEntity;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, refreshAllMessageEntity2.user_id);
            protoWriter.writeBytes(refreshAllMessageEntity2.unknownFields());
        }
    };
    public static final Long DEFAULT_USER_ID = 0L;
    public static final long serialVersionUID = 0;

    @C09CT("user_id")
    public final Long user_id;

    @Override // com.squareup.wire.Message
    public C877080Yaw newBuilder() {
        C877080Yaw c877080Yaw = new C877080Yaw();
        c877080Yaw.LIZLLL = this.user_id;
        c877080Yaw.addUnknownFields(unknownFields());
        return c877080Yaw;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.user_id != null) {
            sb.append(", user_id=");
            sb.append(this.user_id);
        }
        sb.replace(0, 2, "RefreshAllMessageEntity{");
        sb.append('}');
        return sb.toString();
    }

    public RefreshAllMessageEntity(Long l) {
        this(l, ByteString.EMPTY);
    }

    public RefreshAllMessageEntity(Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.user_id = l;
    }
}
