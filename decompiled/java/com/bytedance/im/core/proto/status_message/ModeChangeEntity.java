package com.bytedance.im.core.proto.status_message;

import X.C09CT;
import X.C877040Yas;
import com.bytedance.im.core.proto.status_message.ModeChangeEntity;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class ModeChangeEntity extends Message<ModeChangeEntity, C877040Yas> {
    public static final ProtoAdapter<ModeChangeEntity> ADAPTER = new ProtoAdapter<ModeChangeEntity>() { // from class: X.0Yar
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final ModeChangeEntity decode(ProtoReader protoReader) {
            C877040Yas c877040Yas = new C877040Yas();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c877040Yas.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c877040Yas.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c877040Yas.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(ModeChangeEntity modeChangeEntity) {
            ModeChangeEntity modeChangeEntity2 = modeChangeEntity;
            return ProtoAdapter.INT64.encodedSizeWithTag(1, modeChangeEntity2.conversation_short_id) + modeChangeEntity2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final ModeChangeEntity redact(ModeChangeEntity modeChangeEntity) {
            C877040Yas c877040YasNewBuilder = modeChangeEntity.newBuilder();
            c877040YasNewBuilder.clearUnknownFields();
            return c877040YasNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, ModeChangeEntity modeChangeEntity) {
            ModeChangeEntity modeChangeEntity2 = modeChangeEntity;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, modeChangeEntity2.conversation_short_id);
            protoWriter.writeBytes(modeChangeEntity2.unknownFields());
        }
    };
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final long serialVersionUID = 0;

    @C09CT("conversation_short_id")
    public final Long conversation_short_id;

    @Override // com.squareup.wire.Message
    public C877040Yas newBuilder() {
        C877040Yas c877040Yas = new C877040Yas();
        c877040Yas.LIZLLL = this.conversation_short_id;
        c877040Yas.addUnknownFields(unknownFields());
        return c877040Yas;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.conversation_short_id != null) {
            sb.append(", conversation_short_id=");
            sb.append(this.conversation_short_id);
        }
        sb.replace(0, 2, "ModeChangeEntity{");
        sb.append('}');
        return sb.toString();
    }

    public ModeChangeEntity(Long l) {
        this(l, ByteString.EMPTY);
    }

    public ModeChangeEntity(Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_short_id = l;
    }
}
