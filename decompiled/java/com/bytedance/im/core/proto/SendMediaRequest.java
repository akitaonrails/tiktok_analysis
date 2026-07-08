package com.bytedance.im.core.proto;

import X.C09CT;
import X.C0YCM;
import X.EnumC870720YDu;
import com.bytedance.im.core.proto.MediaMeta;
import com.bytedance.im.core.proto.SendMediaRequest;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class SendMediaRequest extends Message<SendMediaRequest, C0YCM> {
    public static final ProtoAdapter<SendMediaRequest> ADAPTER = new ProtoAdapter<SendMediaRequest>() { // from class: X.0YCK
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final SendMediaRequest decode(ProtoReader protoReader) {
            C0YCM c0ycm = new C0YCM();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 10) {
                                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                    c0ycm.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                } else {
                                    c0ycm.LJI = MediaMeta.ADAPTER.decode(protoReader);
                                }
                            } else {
                                c0ycm.LJFF = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c0ycm.LJ = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        try {
                            c0ycm.LIZLLL = EnumC870720YDu.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            TryCatchGuardChecker.doCheck(e);
                            c0ycm.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c0ycm.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(SendMediaRequest sendMediaRequest) {
            SendMediaRequest sendMediaRequest2 = sendMediaRequest;
            int iEncodedSizeWithTag = EnumC870720YDu.ADAPTER.encodedSizeWithTag(1, sendMediaRequest2.type);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, sendMediaRequest2.id) + protoAdapter.encodedSizeWithTag(3, sendMediaRequest2.decrypt_key) + MediaMeta.ADAPTER.encodedSizeWithTag(10, sendMediaRequest2.metadata) + sendMediaRequest2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, SendMediaRequest sendMediaRequest) {
            SendMediaRequest sendMediaRequest2 = sendMediaRequest;
            EnumC870720YDu.ADAPTER.encodeWithTag(protoWriter, 1, sendMediaRequest2.type);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 2, sendMediaRequest2.id);
            protoAdapter.encodeWithTag(protoWriter, 3, sendMediaRequest2.decrypt_key);
            MediaMeta.ADAPTER.encodeWithTag(protoWriter, 10, sendMediaRequest2.metadata);
            protoWriter.writeBytes(sendMediaRequest2.unknownFields());
        }
    };
    public static final EnumC870720YDu DEFAULT_TYPE = EnumC870720YDu.IMG;
    public static final long serialVersionUID = 0;

    @C09CT("decrypt_key")
    public final String decrypt_key;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("metadata")
    public final MediaMeta metadata;

    @C09CT("type")
    public final EnumC870720YDu type;

    @Override // com.squareup.wire.Message
    public C0YCM newBuilder() {
        C0YCM c0ycm = new C0YCM();
        c0ycm.LIZLLL = this.type;
        c0ycm.LJ = this.id;
        c0ycm.LJFF = this.decrypt_key;
        c0ycm.LJI = this.metadata;
        c0ycm.addUnknownFields(unknownFields());
        return c0ycm;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.id != null) {
            sb.append(", id=");
            sb.append(this.id);
        }
        if (this.decrypt_key != null) {
            sb.append(", decrypt_key=");
            sb.append(this.decrypt_key);
        }
        if (this.metadata != null) {
            sb.append(", metadata=");
            sb.append(this.metadata);
        }
        sb.replace(0, 2, "SendMediaRequest{");
        sb.append('}');
        return sb.toString();
    }

    public SendMediaRequest(EnumC870720YDu enumC870720YDu, String str, String str2, MediaMeta mediaMeta) {
        this(enumC870720YDu, str, str2, mediaMeta, ByteString.EMPTY);
    }

    public SendMediaRequest(EnumC870720YDu enumC870720YDu, String str, String str2, MediaMeta mediaMeta, ByteString byteString) {
        super(ADAPTER, byteString);
        this.type = enumC870720YDu;
        this.id = str;
        this.decrypt_key = str2;
        this.metadata = mediaMeta;
    }
}
