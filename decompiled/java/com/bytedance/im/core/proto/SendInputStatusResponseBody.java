package com.bytedance.im.core.proto;

import X.C09CT;
import X.C0YZN;
import X.C0YZO;
import X.C1516540pZE;
import com.bytedance.im.core.proto.SendInputStatusResponseBody;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class SendInputStatusResponseBody extends Message<SendInputStatusResponseBody, C0YZN> {
    public static final ProtoAdapter<SendInputStatusResponseBody> ADAPTER = new ProtoAdapter<SendInputStatusResponseBody>() { // from class: X.0YZM
        public final ProtoAdapter<Map<String, String>> LIZ;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.LIZ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final SendInputStatusResponseBody decode(ProtoReader protoReader) {
            C0YZN c0yzn = new C0YZN();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c0yzn.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c0yzn.LJ.putAll(this.LIZ.decode(protoReader));
                        }
                    } else {
                        try {
                            c0yzn.LIZLLL = C0YZO.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            TryCatchGuardChecker.doCheck(e);
                            c0yzn.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c0yzn.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(SendInputStatusResponseBody sendInputStatusResponseBody) {
            SendInputStatusResponseBody sendInputStatusResponseBody2 = sendInputStatusResponseBody;
            return C0YZO.ADAPTER.encodedSizeWithTag(1, sendInputStatusResponseBody2.status) + this.LIZ.encodedSizeWithTag(2, sendInputStatusResponseBody2.extra) + sendInputStatusResponseBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, SendInputStatusResponseBody sendInputStatusResponseBody) {
            SendInputStatusResponseBody sendInputStatusResponseBody2 = sendInputStatusResponseBody;
            C0YZO.ADAPTER.encodeWithTag(protoWriter, 1, sendInputStatusResponseBody2.status);
            this.LIZ.encodeWithTag(protoWriter, 2, sendInputStatusResponseBody2.extra);
            protoWriter.writeBytes(sendInputStatusResponseBody2.unknownFields());
        }
    };
    public static final C0YZO DEFAULT_STATUS = C0YZO.Success;
    public static final long serialVersionUID = 0;

    @C09CT("extra")
    public final Map<String, String> extra;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final C0YZO status;

    @Override // com.squareup.wire.Message
    public C0YZN newBuilder() {
        C0YZN c0yzn = new C0YZN();
        c0yzn.LIZLLL = this.status;
        c0yzn.LJ = C1516540pZE.LIZLLL("extra", this.extra);
        c0yzn.addUnknownFields(unknownFields());
        return c0yzn;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        Map<String, String> map = this.extra;
        if (map != null && !map.isEmpty()) {
            sb.append(", extra=");
            sb.append(this.extra);
        }
        sb.replace(0, 2, "SendInputStatusResponseBody{");
        sb.append('}');
        return sb.toString();
    }

    public SendInputStatusResponseBody(C0YZO c0yzo, Map<String, String> map) {
        this(c0yzo, map, ByteString.EMPTY);
    }

    public SendInputStatusResponseBody(C0YZO c0yzo, Map<String, String> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.status = c0yzo;
        this.extra = C1516540pZE.LJI("extra", map);
    }
}
