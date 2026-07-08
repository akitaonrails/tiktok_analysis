package com.bytedance.im.core.proto;

import X.C09CT;
import X.C0YTW;
import X.C1516540pZE;
import com.bytedance.im.core.proto.MessagesPerUserRequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class MessagesPerUserRequestBody extends Message<MessagesPerUserRequestBody, C0YTW> {
    public static final long serialVersionUID = 0;

    @C09CT("cursor")
    public final Long cursor;

    @C09CT("interval")
    public final Long interval;

    @C09CT("limit")
    public final Integer limit;

    @C09CT("new_user")
    public final Integer new_user;

    @C09CT("siderank_keys")
    public final List<String> siderank_keys;
    public static final ProtoAdapter<MessagesPerUserRequestBody> ADAPTER = new ProtoAdapter<MessagesPerUserRequestBody>() { // from class: X.0YTX
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final MessagesPerUserRequestBody decode(ProtoReader protoReader) {
            C0YTW c0ytw = new C0YTW();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    if (iNextTag != 5) {
                                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                        c0ytw.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                    } else {
                                        c0ytw.LJII.add(ProtoAdapter.STRING.decode(protoReader));
                                    }
                                } else {
                                    c0ytw.LJI = ProtoAdapter.INT32.decode(protoReader);
                                }
                            } else {
                                c0ytw.LJFF = ProtoAdapter.INT64.decode(protoReader);
                            }
                        } else {
                            c0ytw.LJ = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c0ytw.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c0ytw.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(MessagesPerUserRequestBody messagesPerUserRequestBody) {
            MessagesPerUserRequestBody messagesPerUserRequestBody2 = messagesPerUserRequestBody;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, messagesPerUserRequestBody2.cursor);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, messagesPerUserRequestBody2.limit) + protoAdapter.encodedSizeWithTag(3, messagesPerUserRequestBody2.interval) + protoAdapter2.encodedSizeWithTag(4, messagesPerUserRequestBody2.new_user) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(5, messagesPerUserRequestBody2.siderank_keys) + messagesPerUserRequestBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, MessagesPerUserRequestBody messagesPerUserRequestBody) {
            MessagesPerUserRequestBody messagesPerUserRequestBody2 = messagesPerUserRequestBody;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, messagesPerUserRequestBody2.cursor);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            protoAdapter2.encodeWithTag(protoWriter, 2, messagesPerUserRequestBody2.limit);
            protoAdapter.encodeWithTag(protoWriter, 3, messagesPerUserRequestBody2.interval);
            protoAdapter2.encodeWithTag(protoWriter, 4, messagesPerUserRequestBody2.new_user);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 5, messagesPerUserRequestBody2.siderank_keys);
            protoWriter.writeBytes(messagesPerUserRequestBody2.unknownFields());
        }
    };
    public static final Long DEFAULT_CURSOR = 0L;
    public static final Integer DEFAULT_LIMIT = 50;
    public static final Long DEFAULT_INTERVAL = 0L;
    public static final Integer DEFAULT_NEW_USER = 0;

    @Override // com.squareup.wire.Message
    public C0YTW newBuilder() {
        C0YTW c0ytw = new C0YTW();
        c0ytw.LIZLLL = this.cursor;
        c0ytw.LJ = this.limit;
        c0ytw.LJFF = this.interval;
        c0ytw.LJI = this.new_user;
        c0ytw.LJII = C1516540pZE.LIZJ("siderank_keys", this.siderank_keys);
        c0ytw.addUnknownFields(unknownFields());
        return c0ytw;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.cursor != null) {
            sb.append(", cursor=");
            sb.append(this.cursor);
        }
        if (this.limit != null) {
            sb.append(", limit=");
            sb.append(this.limit);
        }
        if (this.interval != null) {
            sb.append(", interval=");
            sb.append(this.interval);
        }
        if (this.new_user != null) {
            sb.append(", new_user=");
            sb.append(this.new_user);
        }
        List<String> list = this.siderank_keys;
        if (list != null && !list.isEmpty()) {
            sb.append(", siderank_keys=");
            sb.append(this.siderank_keys);
        }
        sb.replace(0, 2, "MessagesPerUserRequestBody{");
        sb.append('}');
        return sb.toString();
    }

    public MessagesPerUserRequestBody(Long l, Integer num, Long l2, Integer num2, List<String> list) {
        this(l, num, l2, num2, list, ByteString.EMPTY);
    }

    public MessagesPerUserRequestBody(Long l, Integer num, Long l2, Integer num2, List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.cursor = l;
        this.limit = num;
        this.interval = l2;
        this.new_user = num2;
        this.siderank_keys = C1516540pZE.LJFF("siderank_keys", list);
    }
}
