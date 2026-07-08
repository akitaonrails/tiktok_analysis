package com.bytedance.im.core.proto;

import X.C09CT;
import X.C0YLY;
import X.C1516540pZE;
import X.EnumC872600YLa;
import X.EnumC872610YLb;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.im.core.proto.MsgTrace;
import com.bytedance.im.core.proto.Request;
import com.bytedance.im.core.proto.RequestBody;
import com.bytedance.im.core.proto.TokenInfo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class Request extends Message<Request, C0YLY> {
    public static final String DEFAULT_TOKEN = "";
    public static final long serialVersionUID = 0;

    @C09CT("auth_type")
    public final EnumC872600YLa auth_type;

    @C09CT("body")
    public final RequestBody body;

    @C09CT("build_number")
    public final String build_number;

    @C09CT("channel")
    public final String channel;

    @C09CT("cmd")
    public final Integer cmd;

    @C09CT("config_id")
    public final Integer config_id;

    @C09CT("device_id")
    public final String device_id;

    @C09CT("device_platform")
    public final String device_platform;

    @C09CT("device_type")
    public final String device_type;

    @C09CT("headers")
    public final Map<String, String> headers;

    @C09CT("inbox_type")
    public final Integer inbox_type;

    @C09CT("msg_trace")
    public final MsgTrace msg_trace;

    @C09CT("os_version")
    public final String os_version;

    @C09CT("refer")
    public final EnumC872610YLb refer;

    @C09CT("retry_count")
    public final Integer retry_count;

    @C09CT("sdk_version")
    public final String sdk_version;

    @C09CT("sequence_id")
    public final Long sequence_id;

    @C09CT("source")
    public final String source;

    @C09CT("token")
    public final String token;

    @C09CT("token_info")
    public final TokenInfo token_info;

    @C09CT("version_code")
    public final String version_code;
    public static final ProtoAdapter<Request> ADAPTER = new ProtoAdapter<Request>() { // from class: X.0YLZ
        public final ProtoAdapter<Map<String, String>> LIZ;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.LIZ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final Request decode(ProtoReader protoReader) {
            C0YLY c0yly = new C0YLY();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c0yly.LIZLLL = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 2:
                            c0yly.LJ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 3:
                            c0yly.LJFF = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c0yly.LJI = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            try {
                                c0yly.LJII = EnumC872610YLb.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c0yly.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                            break;
                        case 6:
                            c0yly.LJIIIIZZ = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 7:
                            c0yly.LJIIIZ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            c0yly.LJIIJ = RequestBody.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c0yly.LJIIJJI = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c0yly.LJIIL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c0yly.LJIILIIL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c0yly.LJIILJJIL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            c0yly.LJIILL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 14:
                            c0yly.LJIILLIIL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 15:
                            c0yly.LJIIZILJ.putAll(this.LIZ.decode(protoReader));
                            break;
                        case 16:
                            c0yly.LJIJ = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                            c0yly.LJIJI = TokenInfo.ADAPTER.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                            try {
                                c0yly.LJIJJ = EnumC872600YLa.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                TryCatchGuardChecker.doCheck(e2);
                                c0yly.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                            }
                            break;
                        case 19:
                            c0yly.LJIJJLI = MsgTrace.ADAPTER.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                            c0yly.LJIL = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 21:
                            c0yly.LJJ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c0yly.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c0yly.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(Request request) {
            Request request2 = request;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, request2.cmd) + ProtoAdapter.INT64.encodedSizeWithTag(2, request2.sequence_id);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(3, request2.sdk_version) + protoAdapter2.encodedSizeWithTag(4, request2.token) + EnumC872610YLb.ADAPTER.encodedSizeWithTag(5, request2.refer) + protoAdapter.encodedSizeWithTag(6, request2.inbox_type) + protoAdapter2.encodedSizeWithTag(7, request2.build_number) + RequestBody.ADAPTER.encodedSizeWithTag(8, request2.body) + protoAdapter2.encodedSizeWithTag(9, request2.device_id) + protoAdapter2.encodedSizeWithTag(10, request2.channel) + protoAdapter2.encodedSizeWithTag(11, request2.device_platform) + protoAdapter2.encodedSizeWithTag(12, request2.device_type) + protoAdapter2.encodedSizeWithTag(13, request2.os_version) + protoAdapter2.encodedSizeWithTag(14, request2.version_code) + this.LIZ.encodedSizeWithTag(15, request2.headers) + protoAdapter.encodedSizeWithTag(16, request2.config_id) + TokenInfo.ADAPTER.encodedSizeWithTag(17, request2.token_info) + EnumC872600YLa.ADAPTER.encodedSizeWithTag(18, request2.auth_type) + MsgTrace.ADAPTER.encodedSizeWithTag(19, request2.msg_trace) + protoAdapter.encodedSizeWithTag(20, request2.retry_count) + protoAdapter2.encodedSizeWithTag(21, request2.source) + request2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, Request request) {
            Request request2 = request;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 1, request2.cmd);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, request2.sequence_id);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            protoAdapter2.encodeWithTag(protoWriter, 3, request2.sdk_version);
            protoAdapter2.encodeWithTag(protoWriter, 4, request2.token);
            EnumC872610YLb.ADAPTER.encodeWithTag(protoWriter, 5, request2.refer);
            protoAdapter.encodeWithTag(protoWriter, 6, request2.inbox_type);
            protoAdapter2.encodeWithTag(protoWriter, 7, request2.build_number);
            RequestBody.ADAPTER.encodeWithTag(protoWriter, 8, request2.body);
            protoAdapter2.encodeWithTag(protoWriter, 9, request2.device_id);
            protoAdapter2.encodeWithTag(protoWriter, 10, request2.channel);
            protoAdapter2.encodeWithTag(protoWriter, 11, request2.device_platform);
            protoAdapter2.encodeWithTag(protoWriter, 12, request2.device_type);
            protoAdapter2.encodeWithTag(protoWriter, 13, request2.os_version);
            protoAdapter2.encodeWithTag(protoWriter, 14, request2.version_code);
            this.LIZ.encodeWithTag(protoWriter, 15, request2.headers);
            protoAdapter.encodeWithTag(protoWriter, 16, request2.config_id);
            TokenInfo.ADAPTER.encodeWithTag(protoWriter, 17, request2.token_info);
            EnumC872600YLa.ADAPTER.encodeWithTag(protoWriter, 18, request2.auth_type);
            MsgTrace.ADAPTER.encodeWithTag(protoWriter, 19, request2.msg_trace);
            protoAdapter.encodeWithTag(protoWriter, 20, request2.retry_count);
            protoAdapter2.encodeWithTag(protoWriter, 21, request2.source);
            protoWriter.writeBytes(request2.unknownFields());
        }
    };
    public static final Integer DEFAULT_CMD = 0;
    public static final Long DEFAULT_SEQUENCE_ID = 0L;
    public static final EnumC872610YLb DEFAULT_REFER = EnumC872610YLb.REFER_NOT_USED;
    public static final Integer DEFAULT_INBOX_TYPE = 0;
    public static final Integer DEFAULT_CONFIG_ID = 0;
    public static final EnumC872600YLa DEFAULT_AUTH_TYPE = EnumC872600YLa.UNKNOWN_AUTH;
    public static final Integer DEFAULT_RETRY_COUNT = 0;

    @Override // com.squareup.wire.Message
    public C0YLY newBuilder() {
        C0YLY c0yly = new C0YLY();
        c0yly.LIZLLL = this.cmd;
        c0yly.LJ = this.sequence_id;
        c0yly.LJFF = this.sdk_version;
        c0yly.LJI = this.token;
        c0yly.LJII = this.refer;
        c0yly.LJIIIIZZ = this.inbox_type;
        c0yly.LJIIIZ = this.build_number;
        c0yly.LJIIJ = this.body;
        c0yly.LJIIJJI = this.device_id;
        c0yly.LJIIL = this.channel;
        c0yly.LJIILIIL = this.device_platform;
        c0yly.LJIILJJIL = this.device_type;
        c0yly.LJIILL = this.os_version;
        c0yly.LJIILLIIL = this.version_code;
        c0yly.LJIIZILJ = C1516540pZE.LIZLLL("headers", this.headers);
        c0yly.LJIJ = this.config_id;
        c0yly.LJIJI = this.token_info;
        c0yly.LJIJJ = this.auth_type;
        c0yly.LJIJJLI = this.msg_trace;
        c0yly.LJIL = this.retry_count;
        c0yly.LJJ = this.source;
        c0yly.addUnknownFields(unknownFields());
        return c0yly;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.cmd != null) {
            sb.append(", cmd=");
            sb.append(this.cmd);
        }
        if (this.sequence_id != null) {
            sb.append(", sequence_id=");
            sb.append(this.sequence_id);
        }
        if (this.sdk_version != null) {
            sb.append(", sdk_version=");
            sb.append(this.sdk_version);
        }
        if (this.token != null) {
            sb.append(", token=");
            sb.append(this.token);
        }
        if (this.refer != null) {
            sb.append(", refer=");
            sb.append(this.refer);
        }
        if (this.inbox_type != null) {
            sb.append(", inbox_type=");
            sb.append(this.inbox_type);
        }
        if (this.build_number != null) {
            sb.append(", build_number=");
            sb.append(this.build_number);
        }
        if (this.body != null) {
            sb.append(", body=");
            sb.append(this.body);
        }
        if (this.device_id != null) {
            sb.append(", device_id=");
            sb.append(this.device_id);
        }
        if (this.channel != null) {
            sb.append(", channel=");
            sb.append(this.channel);
        }
        if (this.device_platform != null) {
            sb.append(", device_platform=");
            sb.append(this.device_platform);
        }
        if (this.device_type != null) {
            sb.append(", device_type=");
            sb.append(this.device_type);
        }
        if (this.os_version != null) {
            sb.append(", os_version=");
            sb.append(this.os_version);
        }
        if (this.version_code != null) {
            sb.append(", version_code=");
            sb.append(this.version_code);
        }
        Map<String, String> map = this.headers;
        if (map != null && !map.isEmpty()) {
            sb.append(", headers=");
            sb.append(this.headers);
        }
        if (this.config_id != null) {
            sb.append(", config_id=");
            sb.append(this.config_id);
        }
        if (this.token_info != null) {
            sb.append(", token_info=");
            sb.append(this.token_info);
        }
        if (this.auth_type != null) {
            sb.append(", auth_type=");
            sb.append(this.auth_type);
        }
        if (this.msg_trace != null) {
            sb.append(", msg_trace=");
            sb.append(this.msg_trace);
        }
        if (this.retry_count != null) {
            sb.append(", retry_count=");
            sb.append(this.retry_count);
        }
        if (this.source != null) {
            sb.append(", source=");
            sb.append(this.source);
        }
        sb.replace(0, 2, "Request{");
        sb.append('}');
        return sb.toString();
    }

    public Request(Integer num, Long l, String str, String str2, EnumC872610YLb enumC872610YLb, Integer num2, String str3, RequestBody requestBody, String str4, String str5, String str6, String str7, String str8, String str9, Map<String, String> map, Integer num3, TokenInfo tokenInfo, EnumC872600YLa enumC872600YLa, MsgTrace msgTrace, Integer num4, String str10) {
        this(num, l, str, str2, enumC872610YLb, num2, str3, requestBody, str4, str5, str6, str7, str8, str9, map, num3, tokenInfo, enumC872600YLa, msgTrace, num4, str10, ByteString.EMPTY);
    }

    public Request(Integer num, Long l, String str, String str2, EnumC872610YLb enumC872610YLb, Integer num2, String str3, RequestBody requestBody, String str4, String str5, String str6, String str7, String str8, String str9, Map<String, String> map, Integer num3, TokenInfo tokenInfo, EnumC872600YLa enumC872600YLa, MsgTrace msgTrace, Integer num4, String str10, ByteString byteString) {
        super(ADAPTER, byteString);
        this.cmd = num;
        this.sequence_id = l;
        this.sdk_version = str;
        this.token = str2;
        this.refer = enumC872610YLb;
        this.inbox_type = num2;
        this.build_number = str3;
        this.body = requestBody;
        this.device_id = str4;
        this.channel = str5;
        this.device_platform = str6;
        this.device_type = str7;
        this.os_version = str8;
        this.version_code = str9;
        this.headers = C1516540pZE.LJI("headers", map);
        this.config_id = num3;
        this.token_info = tokenInfo;
        this.auth_type = enumC872600YLa;
        this.msg_trace = msgTrace;
        this.retry_count = num4;
        this.source = str10;
    }
}
