package com.bytedance.im.core.proto.status_message;

import X.C09CT;
import X.C0YGM;
import X.C0YSJ;
import com.bytedance.im.core.proto.status_message.RefreshAllMessageValue;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class RefreshAllMessageValue extends Message<RefreshAllMessageValue, C0YSJ> {
    public static final ProtoAdapter<RefreshAllMessageValue> ADAPTER = new ProtoAdapter<RefreshAllMessageValue>() { // from class: X.0YSI
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final RefreshAllMessageValue decode(ProtoReader protoReader) {
            C0YSJ c0ysj = new C0YSJ();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c0ysj.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c0ysj.LJ = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        try {
                            c0ysj.LIZLLL = C0YGM.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            TryCatchGuardChecker.doCheck(e);
                            c0ysj.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c0ysj.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(RefreshAllMessageValue refreshAllMessageValue) {
            RefreshAllMessageValue refreshAllMessageValue2 = refreshAllMessageValue;
            return C0YGM.ADAPTER.encodedSizeWithTag(1, refreshAllMessageValue2.reset_type) + ProtoAdapter.STRING.encodedSizeWithTag(2, refreshAllMessageValue2.reason) + refreshAllMessageValue2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final RefreshAllMessageValue redact(RefreshAllMessageValue refreshAllMessageValue) {
            C0YSJ c0ysjNewBuilder = refreshAllMessageValue.newBuilder();
            c0ysjNewBuilder.clearUnknownFields();
            return c0ysjNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, RefreshAllMessageValue refreshAllMessageValue) {
            RefreshAllMessageValue refreshAllMessageValue2 = refreshAllMessageValue;
            C0YGM.ADAPTER.encodeWithTag(protoWriter, 1, refreshAllMessageValue2.reset_type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, refreshAllMessageValue2.reason);
            protoWriter.writeBytes(refreshAllMessageValue2.unknownFields());
        }
    };
    public static final C0YGM DEFAULT_RESET_TYPE = C0YGM.ResetTypeUnknown;
    public static final long serialVersionUID = 0;

    @C09CT("reason")
    public final String reason;

    @C09CT("reset_type")
    public final C0YGM reset_type;

    @Override // com.squareup.wire.Message
    public C0YSJ newBuilder() {
        C0YSJ c0ysj = new C0YSJ();
        c0ysj.LIZLLL = this.reset_type;
        c0ysj.LJ = this.reason;
        c0ysj.addUnknownFields(unknownFields());
        return c0ysj;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.reset_type != null) {
            sb.append(", reset_type=");
            sb.append(this.reset_type);
        }
        if (this.reason != null) {
            sb.append(", reason=");
            sb.append(this.reason);
        }
        sb.replace(0, 2, "RefreshAllMessageValue{");
        sb.append('}');
        return sb.toString();
    }

    public RefreshAllMessageValue(C0YGM c0ygm, String str) {
        this(c0ygm, str, ByteString.EMPTY);
    }

    public RefreshAllMessageValue(C0YGM c0ygm, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.reset_type = c0ygm;
        this.reason = str;
    }
}
