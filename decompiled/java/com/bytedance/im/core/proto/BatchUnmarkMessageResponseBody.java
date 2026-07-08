package com.bytedance.im.core.proto;

import X.C09CT;
import X.C0YIG;
import X.C1DBQ;
import com.bytedance.im.core.proto.BatchUnmarkMessageResponseBody;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import okio.ByteString;

/* JADX INFO: loaded from: classes36.dex */
public final class BatchUnmarkMessageResponseBody extends Message<BatchUnmarkMessageResponseBody, C1DBQ> {
    public static final long serialVersionUID = 0;

    @C09CT("check_code")
    public final Long check_code;

    @C09CT("check_message")
    public final String check_message;

    @C09CT("server_message_id")
    public final Long server_message_id;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final C0YIG status;
    public static final ProtoAdapter<BatchUnmarkMessageResponseBody> ADAPTER = new ProtoAdapter<BatchUnmarkMessageResponseBody>() { // from class: X.1DBP
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final BatchUnmarkMessageResponseBody decode(ProtoReader protoReader) {
            C1DBQ c1dbq = new C1DBQ();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                    c1dbq.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                } else {
                                    try {
                                        c1dbq.LJI = C0YIG.ADAPTER.decode(protoReader);
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        TryCatchGuardChecker.doCheck(e);
                                        c1dbq.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    }
                                }
                            } else {
                                c1dbq.LJFF = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c1dbq.LJ = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c1dbq.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1dbq.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(BatchUnmarkMessageResponseBody batchUnmarkMessageResponseBody) {
            BatchUnmarkMessageResponseBody batchUnmarkMessageResponseBody2 = batchUnmarkMessageResponseBody;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return protoAdapter.encodedSizeWithTag(1, batchUnmarkMessageResponseBody2.server_message_id) + protoAdapter.encodedSizeWithTag(2, batchUnmarkMessageResponseBody2.check_code) + ProtoAdapter.STRING.encodedSizeWithTag(3, batchUnmarkMessageResponseBody2.check_message) + C0YIG.ADAPTER.encodedSizeWithTag(4, batchUnmarkMessageResponseBody2.status) + batchUnmarkMessageResponseBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, BatchUnmarkMessageResponseBody batchUnmarkMessageResponseBody) {
            BatchUnmarkMessageResponseBody batchUnmarkMessageResponseBody2 = batchUnmarkMessageResponseBody;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, batchUnmarkMessageResponseBody2.server_message_id);
            protoAdapter.encodeWithTag(protoWriter, 2, batchUnmarkMessageResponseBody2.check_code);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, batchUnmarkMessageResponseBody2.check_message);
            C0YIG.ADAPTER.encodeWithTag(protoWriter, 4, batchUnmarkMessageResponseBody2.status);
            protoWriter.writeBytes(batchUnmarkMessageResponseBody2.unknownFields());
        }
    };
    public static final Long DEFAULT_SERVER_MESSAGE_ID = 0L;
    public static final Long DEFAULT_CHECK_CODE = 0L;
    public static final C0YIG DEFAULT_STATUS = C0YIG.OK;

    @Override // com.squareup.wire.Message
    public C1DBQ newBuilder() {
        C1DBQ c1dbq = new C1DBQ();
        c1dbq.LIZLLL = this.server_message_id;
        c1dbq.LJ = this.check_code;
        c1dbq.LJFF = this.check_message;
        c1dbq.LJI = this.status;
        c1dbq.addUnknownFields(unknownFields());
        return c1dbq;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.server_message_id != null) {
            sb.append(", server_message_id=");
            sb.append(this.server_message_id);
        }
        if (this.check_code != null) {
            sb.append(", check_code=");
            sb.append(this.check_code);
        }
        if (this.check_message != null) {
            sb.append(", check_message=");
            sb.append(this.check_message);
        }
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        sb.replace(0, 2, "BatchUnmarkMessageResponseBody{");
        sb.append('}');
        return sb.toString();
    }

    public BatchUnmarkMessageResponseBody(Long l, Long l2, String str, C0YIG c0yig) {
        this(l, l2, str, c0yig, ByteString.EMPTY);
    }

    public BatchUnmarkMessageResponseBody(Long l, Long l2, String str, C0YIG c0yig, ByteString byteString) {
        super(ADAPTER, byteString);
        this.server_message_id = l;
        this.check_code = l2;
        this.check_message = str;
        this.status = c0yig;
    }
}
