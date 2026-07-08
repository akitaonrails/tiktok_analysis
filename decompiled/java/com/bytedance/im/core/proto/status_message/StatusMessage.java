package com.bytedance.im.core.proto.status_message;

import X.C09CT;
import X.C2229841CPe;
import com.bytedance.im.core.proto.status_message.StatusMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class StatusMessage extends Message<StatusMessage, C2229841CPe> {
    public static final ByteString DEFAULT_ENTITY;
    public static final ByteString DEFAULT_VALUE;
    public static final Long DEFAULT_VERSION;
    public static final long serialVersionUID = 0;

    @C09CT("entity")
    public final ByteString entity;

    @C09CT("type")
    public final Integer type;

    @C09CT("value")
    public final ByteString value;

    @C09CT("version")
    public final Long version;
    public static final ProtoAdapter<StatusMessage> ADAPTER = new ProtoAdapter<StatusMessage>() { // from class: X.1CPd
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final StatusMessage decode(ProtoReader protoReader) {
            C2229841CPe c2229841CPe = new C2229841CPe();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                    c2229841CPe.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                } else {
                                    c2229841CPe.LJI = ProtoAdapter.INT64.decode(protoReader);
                                }
                            } else {
                                c2229841CPe.LJFF = ProtoAdapter.BYTES.decode(protoReader);
                            }
                        } else {
                            c2229841CPe.LJ = ProtoAdapter.BYTES.decode(protoReader);
                        }
                    } else {
                        c2229841CPe.LIZLLL = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2229841CPe.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(StatusMessage statusMessage) {
            StatusMessage statusMessage2 = statusMessage;
            int iEncodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(1, statusMessage2.type);
            ProtoAdapter<ByteString> protoAdapter = ProtoAdapter.BYTES;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, statusMessage2.entity) + protoAdapter.encodedSizeWithTag(3, statusMessage2.value) + ProtoAdapter.INT64.encodedSizeWithTag(4, statusMessage2.version) + statusMessage2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final StatusMessage redact(StatusMessage statusMessage) {
            C2229841CPe c2229841CPeNewBuilder = statusMessage.newBuilder();
            c2229841CPeNewBuilder.clearUnknownFields();
            return c2229841CPeNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, StatusMessage statusMessage) {
            StatusMessage statusMessage2 = statusMessage;
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, statusMessage2.type);
            ProtoAdapter<ByteString> protoAdapter = ProtoAdapter.BYTES;
            protoAdapter.encodeWithTag(protoWriter, 2, statusMessage2.entity);
            protoAdapter.encodeWithTag(protoWriter, 3, statusMessage2.value);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, statusMessage2.version);
            protoWriter.writeBytes(statusMessage2.unknownFields());
        }
    };
    public static final Integer DEFAULT_TYPE = 0;

    static {
        ByteString byteString = ByteString.EMPTY;
        DEFAULT_ENTITY = byteString;
        DEFAULT_VALUE = byteString;
        DEFAULT_VERSION = 0L;
    }

    @Override // com.squareup.wire.Message
    public C2229841CPe newBuilder() {
        C2229841CPe c2229841CPe = new C2229841CPe();
        c2229841CPe.LIZLLL = this.type;
        c2229841CPe.LJ = this.entity;
        c2229841CPe.LJFF = this.value;
        c2229841CPe.LJI = this.version;
        c2229841CPe.addUnknownFields(unknownFields());
        return c2229841CPe;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.entity != null) {
            sb.append(", entity=");
            sb.append(this.entity);
        }
        if (this.value != null) {
            sb.append(", value=");
            sb.append(this.value);
        }
        if (this.version != null) {
            sb.append(", version=");
            sb.append(this.version);
        }
        sb.replace(0, 2, "StatusMessage{");
        sb.append('}');
        return sb.toString();
    }

    public StatusMessage(Integer num, ByteString byteString, ByteString byteString2, Long l) {
        this(num, byteString, byteString2, l, ByteString.EMPTY);
    }

    public StatusMessage(Integer num, ByteString byteString, ByteString byteString2, Long l, ByteString byteString3) {
        super(ADAPTER, byteString3);
        this.type = num;
        this.entity = byteString;
        this.value = byteString2;
        this.version = l;
    }
}
