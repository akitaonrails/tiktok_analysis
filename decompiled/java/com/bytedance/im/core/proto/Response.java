package com.bytedance.im.core.proto;

import X.C09CT;
import X.C0YON;
import X.C1516540pZE;
import com.bytedance.im.core.proto.Response;
import com.bytedance.im.core.proto.ResponseBody;
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
public final class Response extends Message<Response, C0YON> {
    public static final long serialVersionUID = 0;

    @C09CT("body")
    public final ResponseBody body;

    @C09CT("cmd")
    public final Integer cmd;

    @C09CT("error_desc")
    public final String error_desc;

    @C09CT("expected_user_id")
    public final Long expected_user_id;

    @C09CT("headers")
    public final Map<String, String> headers;

    @C09CT("inbox_type")
    public final Integer inbox_type;

    @C09CT("log_id")
    public final String log_id;

    @C09CT("region")
    public final String region;

    @C09CT("request_arrived_time")
    public final Long request_arrived_time;

    @C09CT("retry_count")
    public final Integer retry_count;

    @C09CT("sequence_id")
    public final Long sequence_id;

    @C09CT("server_execution_end_time")
    public final Long server_execution_end_time;

    @C09CT("server_start_time")
    public final Long server_start_time;

    @C09CT("start_time_stamp")
    public final Long start_time_stamp;

    @C09CT("status_code")
    public final Integer status_code;
    public static final ProtoAdapter<Response> ADAPTER = new ProtoAdapter<Response>() { // from class: X.0YOM
        public final ProtoAdapter<Map<String, String>> LIZ;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.LIZ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final Response decode(ProtoReader protoReader) {
            C0YON c0yon = new C0YON();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c0yon.LIZLLL = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 2:
                            c0yon.LJ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 3:
                            c0yon.LJFF = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            c0yon.LJI = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c0yon.LJII = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 6:
                            c0yon.LJIIIIZZ = ResponseBody.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            c0yon.LJIIIZ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            c0yon.LJIIJ.putAll(this.LIZ.decode(protoReader));
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c0yon.LJIIJJI = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c0yon.LJIIL = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c0yon.LJIILIIL = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c0yon.LJIILJJIL = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            c0yon.LJIILL = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 14:
                            c0yon.LJIILLIIL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 15:
                            c0yon.LJIIZILJ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c0yon.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c0yon.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(Response response) {
            Response response2 = response;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, response2.cmd);
            ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, response2.sequence_id) + protoAdapter.encodedSizeWithTag(3, response2.status_code);
            ProtoAdapter<String> protoAdapter3 = ProtoAdapter.STRING;
            return iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(4, response2.error_desc) + protoAdapter.encodedSizeWithTag(5, response2.inbox_type) + ResponseBody.ADAPTER.encodedSizeWithTag(6, response2.body) + protoAdapter3.encodedSizeWithTag(7, response2.log_id) + this.LIZ.encodedSizeWithTag(8, response2.headers) + protoAdapter2.encodedSizeWithTag(9, response2.start_time_stamp) + protoAdapter2.encodedSizeWithTag(10, response2.request_arrived_time) + protoAdapter2.encodedSizeWithTag(11, response2.server_execution_end_time) + protoAdapter.encodedSizeWithTag(12, response2.retry_count) + protoAdapter2.encodedSizeWithTag(13, response2.server_start_time) + protoAdapter3.encodedSizeWithTag(14, response2.region) + protoAdapter2.encodedSizeWithTag(15, response2.expected_user_id) + response2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, Response response) {
            Response response2 = response;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 1, response2.cmd);
            ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
            protoAdapter2.encodeWithTag(protoWriter, 2, response2.sequence_id);
            protoAdapter.encodeWithTag(protoWriter, 3, response2.status_code);
            ProtoAdapter<String> protoAdapter3 = ProtoAdapter.STRING;
            protoAdapter3.encodeWithTag(protoWriter, 4, response2.error_desc);
            protoAdapter.encodeWithTag(protoWriter, 5, response2.inbox_type);
            ResponseBody.ADAPTER.encodeWithTag(protoWriter, 6, response2.body);
            protoAdapter3.encodeWithTag(protoWriter, 7, response2.log_id);
            this.LIZ.encodeWithTag(protoWriter, 8, response2.headers);
            protoAdapter2.encodeWithTag(protoWriter, 9, response2.start_time_stamp);
            protoAdapter2.encodeWithTag(protoWriter, 10, response2.request_arrived_time);
            protoAdapter2.encodeWithTag(protoWriter, 11, response2.server_execution_end_time);
            protoAdapter.encodeWithTag(protoWriter, 12, response2.retry_count);
            protoAdapter2.encodeWithTag(protoWriter, 13, response2.server_start_time);
            protoAdapter3.encodeWithTag(protoWriter, 14, response2.region);
            protoAdapter2.encodeWithTag(protoWriter, 15, response2.expected_user_id);
            protoWriter.writeBytes(response2.unknownFields());
        }
    };
    public static final Integer DEFAULT_CMD = 0;
    public static final Long DEFAULT_SEQUENCE_ID = 0L;
    public static final Integer DEFAULT_STATUS_CODE = 0;
    public static final Integer DEFAULT_INBOX_TYPE = 0;
    public static final Long DEFAULT_START_TIME_STAMP = 0L;
    public static final Long DEFAULT_REQUEST_ARRIVED_TIME = 0L;
    public static final Long DEFAULT_SERVER_EXECUTION_END_TIME = 0L;
    public static final Integer DEFAULT_RETRY_COUNT = 0;
    public static final Long DEFAULT_SERVER_START_TIME = 0L;
    public static final Long DEFAULT_EXPECTED_USER_ID = 0L;

    @Override // com.squareup.wire.Message
    public C0YON newBuilder() {
        C0YON c0yon = new C0YON();
        c0yon.LIZLLL = this.cmd;
        c0yon.LJ = this.sequence_id;
        c0yon.LJFF = this.status_code;
        c0yon.LJI = this.error_desc;
        c0yon.LJII = this.inbox_type;
        c0yon.LJIIIIZZ = this.body;
        c0yon.LJIIIZ = this.log_id;
        c0yon.LJIIJ = C1516540pZE.LIZLLL("headers", this.headers);
        c0yon.LJIIJJI = this.start_time_stamp;
        c0yon.LJIIL = this.request_arrived_time;
        c0yon.LJIILIIL = this.server_execution_end_time;
        c0yon.LJIILJJIL = this.retry_count;
        c0yon.LJIILL = this.server_start_time;
        c0yon.LJIILLIIL = this.region;
        c0yon.LJIIZILJ = this.expected_user_id;
        c0yon.addUnknownFields(unknownFields());
        return c0yon;
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
        if (this.status_code != null) {
            sb.append(", status_code=");
            sb.append(this.status_code);
        }
        if (this.error_desc != null) {
            sb.append(", error_desc=");
            sb.append(this.error_desc);
        }
        if (this.inbox_type != null) {
            sb.append(", inbox_type=");
            sb.append(this.inbox_type);
        }
        if (this.body != null) {
            sb.append(", body=");
            sb.append(this.body);
        }
        if (this.log_id != null) {
            sb.append(", log_id=");
            sb.append(this.log_id);
        }
        Map<String, String> map = this.headers;
        if (map != null && !map.isEmpty()) {
            sb.append(", headers=");
            sb.append(this.headers);
        }
        if (this.start_time_stamp != null) {
            sb.append(", start_time_stamp=");
            sb.append(this.start_time_stamp);
        }
        if (this.request_arrived_time != null) {
            sb.append(", request_arrived_time=");
            sb.append(this.request_arrived_time);
        }
        if (this.server_execution_end_time != null) {
            sb.append(", server_execution_end_time=");
            sb.append(this.server_execution_end_time);
        }
        if (this.retry_count != null) {
            sb.append(", retry_count=");
            sb.append(this.retry_count);
        }
        if (this.server_start_time != null) {
            sb.append(", server_start_time=");
            sb.append(this.server_start_time);
        }
        if (this.region != null) {
            sb.append(", region=");
            sb.append(this.region);
        }
        if (this.expected_user_id != null) {
            sb.append(", expected_user_id=");
            sb.append(this.expected_user_id);
        }
        sb.replace(0, 2, "Response{");
        sb.append('}');
        return sb.toString();
    }

    public Response(Integer num, Long l, Integer num2, String str, Integer num3, ResponseBody responseBody, String str2, Map<String, String> map, Long l2, Long l3, Long l4, Integer num4, Long l5, String str3, Long l6) {
        this(num, l, num2, str, num3, responseBody, str2, map, l2, l3, l4, num4, l5, str3, l6, ByteString.EMPTY);
    }

    public Response(Integer num, Long l, Integer num2, String str, Integer num3, ResponseBody responseBody, String str2, Map<String, String> map, Long l2, Long l3, Long l4, Integer num4, Long l5, String str3, Long l6, ByteString byteString) {
        super(ADAPTER, byteString);
        this.cmd = num;
        this.sequence_id = l;
        this.status_code = num2;
        this.error_desc = str;
        this.inbox_type = num3;
        this.body = responseBody;
        this.log_id = str2;
        this.headers = C1516540pZE.LJI("headers", map);
        this.start_time_stamp = l2;
        this.request_arrived_time = l3;
        this.server_execution_end_time = l4;
        this.retry_count = num4;
        this.server_start_time = l5;
        this.region = str3;
        this.expected_user_id = l6;
    }
}
