package com.bytedance.im.core.proto;

import X.C09CT;
import X.C0YAO;
import X.C0YS5;
import com.bytedance.im.core.proto.ModifyMessagePropertyResponseBody;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class ModifyMessagePropertyResponseBody extends Message<ModifyMessagePropertyResponseBody, C0YS5> {
    public static final ProtoAdapter<ModifyMessagePropertyResponseBody> ADAPTER = new ProtoAdapter<ModifyMessagePropertyResponseBody>() { // from class: X.0YS4
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final ModifyMessagePropertyResponseBody decode(ProtoReader protoReader) {
            C0YS5 c0ys5 = new C0YS5();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c0ys5.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c0ys5.LJ = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        try {
                            c0ys5.LIZLLL = C0YAO.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            TryCatchGuardChecker.doCheck(e);
                            c0ys5.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c0ys5.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(ModifyMessagePropertyResponseBody modifyMessagePropertyResponseBody) {
            ModifyMessagePropertyResponseBody modifyMessagePropertyResponseBody2 = modifyMessagePropertyResponseBody;
            return C0YAO.ADAPTER.encodedSizeWithTag(1, modifyMessagePropertyResponseBody2.status) + ProtoAdapter.INT64.encodedSizeWithTag(2, modifyMessagePropertyResponseBody2.version) + modifyMessagePropertyResponseBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, ModifyMessagePropertyResponseBody modifyMessagePropertyResponseBody) {
            ModifyMessagePropertyResponseBody modifyMessagePropertyResponseBody2 = modifyMessagePropertyResponseBody;
            C0YAO.ADAPTER.encodeWithTag(protoWriter, 1, modifyMessagePropertyResponseBody2.status);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, modifyMessagePropertyResponseBody2.version);
            protoWriter.writeBytes(modifyMessagePropertyResponseBody2.unknownFields());
        }
    };
    public static final C0YAO DEFAULT_STATUS = C0YAO.MODIFY_PROPERTY_SUCCESS;
    public static final Long DEFAULT_VERSION = 0L;
    public static final long serialVersionUID = 0;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final C0YAO status;

    @C09CT("version")
    public final Long version;

    @Override // com.squareup.wire.Message
    public C0YS5 newBuilder() {
        C0YS5 c0ys5 = new C0YS5();
        c0ys5.LIZLLL = this.status;
        c0ys5.LJ = this.version;
        c0ys5.addUnknownFields(unknownFields());
        return c0ys5;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        if (this.version != null) {
            sb.append(", version=");
            sb.append(this.version);
        }
        sb.replace(0, 2, "ModifyMessagePropertyResponseBody{");
        sb.append('}');
        return sb.toString();
    }

    public ModifyMessagePropertyResponseBody(C0YAO c0yao, Long l) {
        this(c0yao, l, ByteString.EMPTY);
    }

    public ModifyMessagePropertyResponseBody(C0YAO c0yao, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.status = c0yao;
        this.version = l;
    }
}
