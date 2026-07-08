package com.bytedance.im.core.proto;

import X.C09CT;
import X.C0YGM;
import X.C0YSH;
import X.C1516540pZE;
import com.bytedance.im.core.proto.MessagePerUserInboxResponse;
import com.bytedance.im.core.proto.MessagesPerUserComboResponseBody;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class MessagesPerUserComboResponseBody extends Message<MessagesPerUserComboResponseBody, C0YSH> {
    public static final long serialVersionUID = 0;

    @C09CT("inboxes")
    public final List<MessagePerUserInboxResponse> inboxes;

    @C09CT("last_pull_time")
    public final Long last_pull_time;

    @C09CT("need_reset")
    public final Boolean need_reset;

    @C09CT("reset_type")
    public final C0YGM reset_type;

    @C09CT("reset_version")
    public final Long reset_version;
    public static final ProtoAdapter<MessagesPerUserComboResponseBody> ADAPTER = new ProtoAdapter<MessagesPerUserComboResponseBody>() { // from class: X.0YSG
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final MessagesPerUserComboResponseBody decode(ProtoReader protoReader) {
            C0YSH c0ysh = new C0YSH();
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
                                        c0ysh.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                    } else {
                                        c0ysh.LJII = ProtoAdapter.INT64.decode(protoReader);
                                    }
                                } else {
                                    try {
                                        c0ysh.LJI = C0YGM.ADAPTER.decode(protoReader);
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        TryCatchGuardChecker.doCheck(e);
                                        c0ysh.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    }
                                }
                            } else {
                                c0ysh.LJFF = ProtoAdapter.INT64.decode(protoReader);
                            }
                        } else {
                            c0ysh.LJ = ProtoAdapter.BOOL.decode(protoReader);
                        }
                    } else {
                        c0ysh.LIZLLL.add(MessagePerUserInboxResponse.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c0ysh.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(MessagesPerUserComboResponseBody messagesPerUserComboResponseBody) {
            MessagesPerUserComboResponseBody messagesPerUserComboResponseBody2 = messagesPerUserComboResponseBody;
            int iEncodedSizeWithTag = MessagePerUserInboxResponse.ADAPTER.asRepeated().encodedSizeWithTag(1, messagesPerUserComboResponseBody2.inboxes) + ProtoAdapter.BOOL.encodedSizeWithTag(2, messagesPerUserComboResponseBody2.need_reset);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(3, messagesPerUserComboResponseBody2.reset_version) + C0YGM.ADAPTER.encodedSizeWithTag(4, messagesPerUserComboResponseBody2.reset_type) + protoAdapter.encodedSizeWithTag(5, messagesPerUserComboResponseBody2.last_pull_time) + messagesPerUserComboResponseBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, MessagesPerUserComboResponseBody messagesPerUserComboResponseBody) {
            MessagesPerUserComboResponseBody messagesPerUserComboResponseBody2 = messagesPerUserComboResponseBody;
            MessagePerUserInboxResponse.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, messagesPerUserComboResponseBody2.inboxes);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, messagesPerUserComboResponseBody2.need_reset);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 3, messagesPerUserComboResponseBody2.reset_version);
            C0YGM.ADAPTER.encodeWithTag(protoWriter, 4, messagesPerUserComboResponseBody2.reset_type);
            protoAdapter.encodeWithTag(protoWriter, 5, messagesPerUserComboResponseBody2.last_pull_time);
            protoWriter.writeBytes(messagesPerUserComboResponseBody2.unknownFields());
        }
    };
    public static final Boolean DEFAULT_NEED_RESET = Boolean.FALSE;
    public static final Long DEFAULT_RESET_VERSION = 0L;
    public static final C0YGM DEFAULT_RESET_TYPE = C0YGM.ResetTypeUnknown;
    public static final Long DEFAULT_LAST_PULL_TIME = 0L;

    @Override // com.squareup.wire.Message
    public C0YSH newBuilder() {
        C0YSH c0ysh = new C0YSH();
        c0ysh.LIZLLL = C1516540pZE.LIZJ("inboxes", this.inboxes);
        c0ysh.LJ = this.need_reset;
        c0ysh.LJFF = this.reset_version;
        c0ysh.LJI = this.reset_type;
        c0ysh.LJII = this.last_pull_time;
        c0ysh.addUnknownFields(unknownFields());
        return c0ysh;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<MessagePerUserInboxResponse> list = this.inboxes;
        if (list != null && !list.isEmpty()) {
            sb.append(", inboxes=");
            sb.append(this.inboxes);
        }
        if (this.need_reset != null) {
            sb.append(", need_reset=");
            sb.append(this.need_reset);
        }
        if (this.reset_version != null) {
            sb.append(", reset_version=");
            sb.append(this.reset_version);
        }
        if (this.reset_type != null) {
            sb.append(", reset_type=");
            sb.append(this.reset_type);
        }
        if (this.last_pull_time != null) {
            sb.append(", last_pull_time=");
            sb.append(this.last_pull_time);
        }
        sb.replace(0, 2, "MessagesPerUserComboResponseBody{");
        sb.append('}');
        return sb.toString();
    }

    public MessagesPerUserComboResponseBody(List<MessagePerUserInboxResponse> list, Boolean bool, Long l, C0YGM c0ygm, Long l2) {
        this(list, bool, l, c0ygm, l2, ByteString.EMPTY);
    }

    public MessagesPerUserComboResponseBody(List<MessagePerUserInboxResponse> list, Boolean bool, Long l, C0YGM c0ygm, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.inboxes = C1516540pZE.LJFF("inboxes", list);
        this.need_reset = bool;
        this.reset_version = l;
        this.reset_type = c0ygm;
        this.last_pull_time = l2;
    }
}
