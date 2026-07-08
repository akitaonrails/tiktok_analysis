package com.bytedance.im.core.proto;

import X.C09CT;
import X.C0YFV;
import X.C0YKB;
import X.C0YKE;
import com.bytedance.im.core.proto.MessagesPerUserInboxRequest;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class MessagesPerUserInboxRequest extends Message<MessagesPerUserInboxRequest, C0YKE> {
    public static final long serialVersionUID = 0;

    @C09CT("cursor")
    public final Long cursor;

    @C09CT("cursor_type")
    public final C0YFV cursor_type;

    @C09CT("inbox_type")
    public final Integer inbox_type;

    @C09CT("limit")
    public final Integer limit;

    @C09CT(Scene.SCENE_SERVICE)
    public final C0YKB scene;
    public static final ProtoAdapter<MessagesPerUserInboxRequest> ADAPTER = new ProtoAdapter<MessagesPerUserInboxRequest>() { // from class: X.0YKF
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final MessagesPerUserInboxRequest decode(ProtoReader protoReader) {
            C0YKE c0yke = new C0YKE();
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
                                        c0yke.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                    } else {
                                        try {
                                            c0yke.LJII = C0YFV.ADAPTER.decode(protoReader);
                                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                            TryCatchGuardChecker.doCheck(e);
                                            c0yke.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                        }
                                    }
                                } else {
                                    try {
                                        c0yke.LJI = C0YKB.ADAPTER.decode(protoReader);
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                        TryCatchGuardChecker.doCheck(e2);
                                        c0yke.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                    }
                                }
                            } else {
                                c0yke.LJFF = ProtoAdapter.INT32.decode(protoReader);
                            }
                        } else {
                            c0yke.LJ = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c0yke.LIZLLL = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c0yke.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(MessagesPerUserInboxRequest messagesPerUserInboxRequest) {
            MessagesPerUserInboxRequest messagesPerUserInboxRequest2 = messagesPerUserInboxRequest;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            return protoAdapter.encodedSizeWithTag(1, messagesPerUserInboxRequest2.inbox_type) + ProtoAdapter.INT64.encodedSizeWithTag(2, messagesPerUserInboxRequest2.cursor) + protoAdapter.encodedSizeWithTag(3, messagesPerUserInboxRequest2.limit) + C0YKB.ADAPTER.encodedSizeWithTag(4, messagesPerUserInboxRequest2.scene) + C0YFV.ADAPTER.encodedSizeWithTag(5, messagesPerUserInboxRequest2.cursor_type) + messagesPerUserInboxRequest2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, MessagesPerUserInboxRequest messagesPerUserInboxRequest) {
            MessagesPerUserInboxRequest messagesPerUserInboxRequest2 = messagesPerUserInboxRequest;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 1, messagesPerUserInboxRequest2.inbox_type);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, messagesPerUserInboxRequest2.cursor);
            protoAdapter.encodeWithTag(protoWriter, 3, messagesPerUserInboxRequest2.limit);
            C0YKB.ADAPTER.encodeWithTag(protoWriter, 4, messagesPerUserInboxRequest2.scene);
            C0YFV.ADAPTER.encodeWithTag(protoWriter, 5, messagesPerUserInboxRequest2.cursor_type);
            protoWriter.writeBytes(messagesPerUserInboxRequest2.unknownFields());
        }
    };
    public static final Integer DEFAULT_INBOX_TYPE = 0;
    public static final Long DEFAULT_CURSOR = 0L;
    public static final Integer DEFAULT_LIMIT = 50;
    public static final C0YKB DEFAULT_SCENE = C0YKB.PULL_SCENE_UNKNOWN;
    public static final C0YFV DEFAULT_CURSOR_TYPE = C0YFV.CURSOR_TYPE_USER_MSG_CHAIN;

    @Override // com.squareup.wire.Message
    public C0YKE newBuilder() {
        C0YKE c0yke = new C0YKE();
        c0yke.LIZLLL = this.inbox_type;
        c0yke.LJ = this.cursor;
        c0yke.LJFF = this.limit;
        c0yke.LJI = this.scene;
        c0yke.LJII = this.cursor_type;
        c0yke.addUnknownFields(unknownFields());
        return c0yke;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.inbox_type != null) {
            sb.append(", inbox_type=");
            sb.append(this.inbox_type);
        }
        if (this.cursor != null) {
            sb.append(", cursor=");
            sb.append(this.cursor);
        }
        if (this.limit != null) {
            sb.append(", limit=");
            sb.append(this.limit);
        }
        if (this.scene != null) {
            sb.append(", scene=");
            sb.append(this.scene);
        }
        if (this.cursor_type != null) {
            sb.append(", cursor_type=");
            sb.append(this.cursor_type);
        }
        sb.replace(0, 2, "MessagesPerUserInboxRequest{");
        sb.append('}');
        return sb.toString();
    }

    public MessagesPerUserInboxRequest(Integer num, Long l, Integer num2, C0YKB c0ykb, C0YFV c0yfv) {
        this(num, l, num2, c0ykb, c0yfv, ByteString.EMPTY);
    }

    public MessagesPerUserInboxRequest(Integer num, Long l, Integer num2, C0YKB c0ykb, C0YFV c0yfv, ByteString byteString) {
        super(ADAPTER, byteString);
        this.inbox_type = num;
        this.cursor = l;
        this.limit = num2;
        this.scene = c0ykb;
        this.cursor_type = c0yfv;
    }
}
