package com.bytedance.im.core.proto;

import X.C09CT;
import X.C0YRU;
import com.bytedance.im.core.proto.MessageIDIndexEntry;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class MessageIDIndexEntry extends Message<MessageIDIndexEntry, C0YRU> {
    public static final long serialVersionUID = 0;

    @C09CT("index_in_conversation")
    public final Long index_in_conversation;

    @C09CT("server_message_id")
    public final Long server_message_id;
    public static final ProtoAdapter<MessageIDIndexEntry> ADAPTER = new ProtoAdapter<MessageIDIndexEntry>() { // from class: X.0YRT
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final MessageIDIndexEntry decode(ProtoReader protoReader) {
            C0YRU c0yru = new C0YRU();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c0yru.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c0yru.LJ = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c0yru.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c0yru.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(MessageIDIndexEntry messageIDIndexEntry) {
            MessageIDIndexEntry messageIDIndexEntry2 = messageIDIndexEntry;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return protoAdapter.encodedSizeWithTag(1, messageIDIndexEntry2.server_message_id) + protoAdapter.encodedSizeWithTag(2, messageIDIndexEntry2.index_in_conversation) + messageIDIndexEntry2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, MessageIDIndexEntry messageIDIndexEntry) {
            MessageIDIndexEntry messageIDIndexEntry2 = messageIDIndexEntry;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, messageIDIndexEntry2.server_message_id);
            protoAdapter.encodeWithTag(protoWriter, 2, messageIDIndexEntry2.index_in_conversation);
            protoWriter.writeBytes(messageIDIndexEntry2.unknownFields());
        }
    };
    public static final Long DEFAULT_SERVER_MESSAGE_ID = 0L;
    public static final Long DEFAULT_INDEX_IN_CONVERSATION = 0L;

    @Override // com.squareup.wire.Message
    public C0YRU newBuilder() {
        C0YRU c0yru = new C0YRU();
        c0yru.LIZLLL = this.server_message_id;
        c0yru.LJ = this.index_in_conversation;
        c0yru.addUnknownFields(unknownFields());
        return c0yru;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", server_message_id=");
        sb.append(this.server_message_id);
        sb.append(", index_in_conversation=");
        sb.append(this.index_in_conversation);
        sb.replace(0, 2, "MessageIDIndexEntry{");
        sb.append('}');
        return sb.toString();
    }

    public MessageIDIndexEntry(Long l, Long l2) {
        this(l, l2, ByteString.EMPTY);
    }

    public MessageIDIndexEntry(Long l, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.server_message_id = l;
        this.index_in_conversation = l2;
    }
}
