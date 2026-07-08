package com.bytedance.im.core.proto;

import X.C09CT;
import X.C2251871DBx;
import X.EnumC19361510ov;
import com.bytedance.im.core.proto.TokenInfo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: loaded from: classes36.dex */
public final class TokenInfo extends Message<TokenInfo, C2251871DBx> {
    public static final long serialVersionUID = 0;

    @C09CT("app_id")
    public final Integer app_id;

    @C09CT("app_id_without_hook")
    public final Integer app_id_without_hook;

    @C09CT("biz_id")
    public final Integer biz_id;

    @C09CT("mark_id")
    public final Integer mark_id;

    @C09CT("timestamp")
    public final Long timestamp;

    @C09CT("type")
    public final EnumC19361510ov type;

    @C09CT("user_id")
    public final Long user_id;

    @C09CT("user_id_without_hook")
    public final Long user_id_without_hook;
    public static final ProtoAdapter<TokenInfo> ADAPTER = new ProtoAdapter<TokenInfo>() { // from class: X.1DBw
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final TokenInfo decode(ProtoReader protoReader) {
            C2251871DBx c2251871DBx = new C2251871DBx();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c2251871DBx.LIZLLL = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 2:
                            try {
                                c2251871DBx.LJ = EnumC19361510ov.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c2251871DBx.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                            break;
                        case 3:
                            c2251871DBx.LJFF = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            c2251871DBx.LJI = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 5:
                            c2251871DBx.LJII = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 6:
                            c2251871DBx.LJIIIIZZ = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 7:
                            c2251871DBx.LJIIIZ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 8:
                            c2251871DBx.LJIIJ = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2251871DBx.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2251871DBx.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(TokenInfo tokenInfo) {
            TokenInfo tokenInfo2 = tokenInfo;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, tokenInfo2.mark_id) + EnumC19361510ov.ADAPTER.encodedSizeWithTag(2, tokenInfo2.type) + protoAdapter.encodedSizeWithTag(3, tokenInfo2.app_id);
            ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(4, tokenInfo2.user_id) + protoAdapter2.encodedSizeWithTag(5, tokenInfo2.timestamp) + protoAdapter.encodedSizeWithTag(6, tokenInfo2.app_id_without_hook) + protoAdapter2.encodedSizeWithTag(7, tokenInfo2.user_id_without_hook) + protoAdapter.encodedSizeWithTag(8, tokenInfo2.biz_id) + tokenInfo2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, TokenInfo tokenInfo) {
            TokenInfo tokenInfo2 = tokenInfo;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 1, tokenInfo2.mark_id);
            EnumC19361510ov.ADAPTER.encodeWithTag(protoWriter, 2, tokenInfo2.type);
            protoAdapter.encodeWithTag(protoWriter, 3, tokenInfo2.app_id);
            ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
            protoAdapter2.encodeWithTag(protoWriter, 4, tokenInfo2.user_id);
            protoAdapter2.encodeWithTag(protoWriter, 5, tokenInfo2.timestamp);
            protoAdapter.encodeWithTag(protoWriter, 6, tokenInfo2.app_id_without_hook);
            protoAdapter2.encodeWithTag(protoWriter, 7, tokenInfo2.user_id_without_hook);
            protoAdapter.encodeWithTag(protoWriter, 8, tokenInfo2.biz_id);
            protoWriter.writeBytes(tokenInfo2.unknownFields());
        }
    };
    public static final Integer DEFAULT_MARK_ID = 0;
    public static final EnumC19361510ov DEFAULT_TYPE = EnumC19361510ov.DEFAULT_TOKEN;
    public static final Integer DEFAULT_APP_ID = 0;
    public static final Long DEFAULT_USER_ID = 0L;
    public static final Long DEFAULT_TIMESTAMP = 0L;
    public static final Integer DEFAULT_APP_ID_WITHOUT_HOOK = 0;
    public static final Long DEFAULT_USER_ID_WITHOUT_HOOK = 0L;
    public static final Integer DEFAULT_BIZ_ID = 0;

    @Override // com.squareup.wire.Message
    public C2251871DBx newBuilder() {
        C2251871DBx c2251871DBx = new C2251871DBx();
        c2251871DBx.LIZLLL = this.mark_id;
        c2251871DBx.LJ = this.type;
        c2251871DBx.LJFF = this.app_id;
        c2251871DBx.LJI = this.user_id;
        c2251871DBx.LJII = this.timestamp;
        c2251871DBx.LJIIIIZZ = this.app_id_without_hook;
        c2251871DBx.LJIIIZ = this.user_id_without_hook;
        c2251871DBx.LJIIJ = this.biz_id;
        c2251871DBx.addUnknownFields(unknownFields());
        return c2251871DBx;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mark_id != null) {
            sb.append(", mark_id=");
            sb.append(this.mark_id);
        }
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.app_id != null) {
            sb.append(", app_id=");
            sb.append(this.app_id);
        }
        if (this.user_id != null) {
            sb.append(", user_id=");
            sb.append(this.user_id);
        }
        if (this.timestamp != null) {
            sb.append(", timestamp=");
            sb.append(this.timestamp);
        }
        if (this.app_id_without_hook != null) {
            sb.append(", app_id_without_hook=");
            sb.append(this.app_id_without_hook);
        }
        if (this.user_id_without_hook != null) {
            sb.append(", user_id_without_hook=");
            sb.append(this.user_id_without_hook);
        }
        if (this.biz_id != null) {
            sb.append(", biz_id=");
            sb.append(this.biz_id);
        }
        sb.replace(0, 2, "TokenInfo{");
        sb.append('}');
        return sb.toString();
    }

    public TokenInfo(Integer num, EnumC19361510ov enumC19361510ov, Integer num2, Long l, Long l2, Integer num3, Long l3, Integer num4) {
        this(num, enumC19361510ov, num2, l, l2, num3, l3, num4, ByteString.EMPTY);
    }

    public TokenInfo(Integer num, EnumC19361510ov enumC19361510ov, Integer num2, Long l, Long l2, Integer num3, Long l3, Integer num4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mark_id = num;
        this.type = enumC19361510ov;
        this.app_id = num2;
        this.user_id = l;
        this.timestamp = l2;
        this.app_id_without_hook = num3;
        this.user_id_without_hook = l3;
        this.biz_id = num4;
    }
}
