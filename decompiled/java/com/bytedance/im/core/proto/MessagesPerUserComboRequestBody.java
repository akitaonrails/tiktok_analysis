package com.bytedance.im.core.proto;

import X.C09CT;
import X.C0YSL;
import X.C1516540pZE;
import com.bytedance.im.core.proto.MessagesPerUserComboRequestBody;
import com.bytedance.im.core.proto.MessagesPerUserInboxRequest;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class MessagesPerUserComboRequestBody extends Message<MessagesPerUserComboRequestBody, C0YSL> {
    public static final long serialVersionUID = 0;

    @C09CT("inboxes")
    public final List<MessagesPerUserInboxRequest> inboxes;

    @C09CT("last_pull_time")
    public final Long last_pull_time;

    @C09CT("status_adapter_map")
    public final Long status_adapter_map;
    public static final ProtoAdapter<MessagesPerUserComboRequestBody> ADAPTER = new ProtoAdapter<MessagesPerUserComboRequestBody>() { // from class: X.0YSK
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final MessagesPerUserComboRequestBody decode(ProtoReader protoReader) {
            C0YSL c0ysl = new C0YSL();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c0ysl.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c0ysl.LJFF = ProtoAdapter.INT64.decode(protoReader);
                            }
                        } else {
                            c0ysl.LJ = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c0ysl.LIZLLL.add(MessagesPerUserInboxRequest.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c0ysl.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(MessagesPerUserComboRequestBody messagesPerUserComboRequestBody) {
            MessagesPerUserComboRequestBody messagesPerUserComboRequestBody2 = messagesPerUserComboRequestBody;
            int iEncodedSizeWithTag = MessagesPerUserInboxRequest.ADAPTER.asRepeated().encodedSizeWithTag(1, messagesPerUserComboRequestBody2.inboxes);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, messagesPerUserComboRequestBody2.status_adapter_map) + protoAdapter.encodedSizeWithTag(3, messagesPerUserComboRequestBody2.last_pull_time) + messagesPerUserComboRequestBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, MessagesPerUserComboRequestBody messagesPerUserComboRequestBody) {
            MessagesPerUserComboRequestBody messagesPerUserComboRequestBody2 = messagesPerUserComboRequestBody;
            MessagesPerUserInboxRequest.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, messagesPerUserComboRequestBody2.inboxes);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 2, messagesPerUserComboRequestBody2.status_adapter_map);
            protoAdapter.encodeWithTag(protoWriter, 3, messagesPerUserComboRequestBody2.last_pull_time);
            protoWriter.writeBytes(messagesPerUserComboRequestBody2.unknownFields());
        }
    };
    public static final Long DEFAULT_STATUS_ADAPTER_MAP = 0L;
    public static final Long DEFAULT_LAST_PULL_TIME = 0L;

    @Override // com.squareup.wire.Message
    public C0YSL newBuilder() {
        C0YSL c0ysl = new C0YSL();
        c0ysl.LIZLLL = C1516540pZE.LIZJ("inboxes", this.inboxes);
        c0ysl.LJ = this.status_adapter_map;
        c0ysl.LJFF = this.last_pull_time;
        c0ysl.addUnknownFields(unknownFields());
        return c0ysl;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<MessagesPerUserInboxRequest> list = this.inboxes;
        if (list != null && !list.isEmpty()) {
            sb.append(", inboxes=");
            sb.append(this.inboxes);
        }
        if (this.status_adapter_map != null) {
            sb.append(", status_adapter_map=");
            sb.append(this.status_adapter_map);
        }
        if (this.last_pull_time != null) {
            sb.append(", last_pull_time=");
            sb.append(this.last_pull_time);
        }
        sb.replace(0, 2, "MessagesPerUserComboRequestBody{");
        sb.append('}');
        return sb.toString();
    }

    public MessagesPerUserComboRequestBody(List<MessagesPerUserInboxRequest> list, Long l, Long l2) {
        this(list, l, l2, ByteString.EMPTY);
    }

    public MessagesPerUserComboRequestBody(List<MessagesPerUserInboxRequest> list, Long l, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.inboxes = C1516540pZE.LJFF("inboxes", list);
        this.status_adapter_map = l;
        this.last_pull_time = l2;
    }
}
