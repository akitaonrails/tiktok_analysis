package com.bytedance.im.core.proto;

import X.C09CT;
import X.C0YT3;
import X.EnumC870720YDu;
import com.bytedance.im.core.proto.MediaUploadConfig;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class MediaUploadConfig extends Message<MediaUploadConfig, C0YT3> {
    public static final long serialVersionUID = 0;

    @C09CT("access_key")
    public final String access_key;

    @C09CT("current_time")
    public final Long current_time;

    @C09CT("expiry_time")
    public final Long expiry_time;

    @C09CT("host")
    public final String host;

    @C09CT("resource_space")
    public final String resource_space;

    @C09CT("secret_access_key")
    public final String secret_access_key;

    @C09CT("session_token")
    public final String session_token;

    @C09CT("type")
    public final EnumC870720YDu type;
    public static final ProtoAdapter<MediaUploadConfig> ADAPTER = new ProtoAdapter<MediaUploadConfig>() { // from class: X.0YT2
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final MediaUploadConfig decode(ProtoReader protoReader) {
            C0YT3 c0yt3 = new C0YT3();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            try {
                                c0yt3.LIZLLL = EnumC870720YDu.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c0yt3.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                            break;
                        case 2:
                            c0yt3.LJ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c0yt3.LJFF = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c0yt3.LJI = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 5:
                            c0yt3.LJII = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 6:
                            c0yt3.LJIIIIZZ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            c0yt3.LJIIIZ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            c0yt3.LJIIJ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c0yt3.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c0yt3.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(MediaUploadConfig mediaUploadConfig) {
            MediaUploadConfig mediaUploadConfig2 = mediaUploadConfig;
            int iEncodedSizeWithTag = EnumC870720YDu.ADAPTER.encodedSizeWithTag(1, mediaUploadConfig2.type);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, mediaUploadConfig2.resource_space) + protoAdapter.encodedSizeWithTag(3, mediaUploadConfig2.host);
            ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
            return iEncodedSizeWithTag2 + protoAdapter2.encodedSizeWithTag(4, mediaUploadConfig2.expiry_time) + protoAdapter2.encodedSizeWithTag(5, mediaUploadConfig2.current_time) + protoAdapter.encodedSizeWithTag(6, mediaUploadConfig2.access_key) + protoAdapter.encodedSizeWithTag(7, mediaUploadConfig2.session_token) + protoAdapter.encodedSizeWithTag(8, mediaUploadConfig2.secret_access_key) + mediaUploadConfig2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, MediaUploadConfig mediaUploadConfig) {
            MediaUploadConfig mediaUploadConfig2 = mediaUploadConfig;
            EnumC870720YDu.ADAPTER.encodeWithTag(protoWriter, 1, mediaUploadConfig2.type);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 2, mediaUploadConfig2.resource_space);
            protoAdapter.encodeWithTag(protoWriter, 3, mediaUploadConfig2.host);
            ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
            protoAdapter2.encodeWithTag(protoWriter, 4, mediaUploadConfig2.expiry_time);
            protoAdapter2.encodeWithTag(protoWriter, 5, mediaUploadConfig2.current_time);
            protoAdapter.encodeWithTag(protoWriter, 6, mediaUploadConfig2.access_key);
            protoAdapter.encodeWithTag(protoWriter, 7, mediaUploadConfig2.session_token);
            protoAdapter.encodeWithTag(protoWriter, 8, mediaUploadConfig2.secret_access_key);
            protoWriter.writeBytes(mediaUploadConfig2.unknownFields());
        }
    };
    public static final EnumC870720YDu DEFAULT_TYPE = EnumC870720YDu.IMG;
    public static final Long DEFAULT_EXPIRY_TIME = 0L;
    public static final Long DEFAULT_CURRENT_TIME = 0L;

    @Override // com.squareup.wire.Message
    public C0YT3 newBuilder() {
        C0YT3 c0yt3 = new C0YT3();
        c0yt3.LIZLLL = this.type;
        c0yt3.LJ = this.resource_space;
        c0yt3.LJFF = this.host;
        c0yt3.LJI = this.expiry_time;
        c0yt3.LJII = this.current_time;
        c0yt3.LJIIIIZZ = this.access_key;
        c0yt3.LJIIIZ = this.session_token;
        c0yt3.LJIIJ = this.secret_access_key;
        c0yt3.addUnknownFields(unknownFields());
        return c0yt3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.resource_space != null) {
            sb.append(", resource_space=");
            sb.append(this.resource_space);
        }
        if (this.host != null) {
            sb.append(", host=");
            sb.append(this.host);
        }
        if (this.expiry_time != null) {
            sb.append(", expiry_time=");
            sb.append(this.expiry_time);
        }
        if (this.current_time != null) {
            sb.append(", current_time=");
            sb.append(this.current_time);
        }
        if (this.access_key != null) {
            sb.append(", access_key=");
            sb.append(this.access_key);
        }
        if (this.session_token != null) {
            sb.append(", session_token=");
            sb.append(this.session_token);
        }
        if (this.secret_access_key != null) {
            sb.append(", secret_access_key=");
            sb.append(this.secret_access_key);
        }
        sb.replace(0, 2, "MediaUploadConfig{");
        sb.append('}');
        return sb.toString();
    }

    public MediaUploadConfig(EnumC870720YDu enumC870720YDu, String str, String str2, Long l, Long l2, String str3, String str4, String str5) {
        this(enumC870720YDu, str, str2, l, l2, str3, str4, str5, ByteString.EMPTY);
    }

    public MediaUploadConfig(EnumC870720YDu enumC870720YDu, String str, String str2, Long l, Long l2, String str3, String str4, String str5, ByteString byteString) {
        super(ADAPTER, byteString);
        this.type = enumC870720YDu;
        this.resource_space = str;
        this.host = str2;
        this.expiry_time = l;
        this.current_time = l2;
        this.access_key = str3;
        this.session_token = str4;
        this.secret_access_key = str5;
    }
}
