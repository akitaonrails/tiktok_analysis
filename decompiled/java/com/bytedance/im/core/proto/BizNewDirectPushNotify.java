package com.bytedance.im.core.proto;

import X.C09CT;
import X.C1516540pZE;
import X.C2229821CPc;
import com.bytedance.im.core.proto.BizNewDirectPushNotify;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class BizNewDirectPushNotify extends Message<BizNewDirectPushNotify, C2229821CPc> {
    public static final long serialVersionUID = 0;

    @C09CT("content")
    public final String content;

    @C09CT("create_time")
    public final Long create_time;

    @C09CT("ext")
    public final Map<String, String> ext;

    @C09CT("inbox_type")
    public final Integer inbox_type;

    @C09CT("message_type")
    public final Integer message_type;
    public static final ProtoAdapter<BizNewDirectPushNotify> ADAPTER = new ProtoAdapter<BizNewDirectPushNotify>() { // from class: X.1CPb
        public final ProtoAdapter<Map<String, String>> LIZ;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.LIZ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final BizNewDirectPushNotify decode(ProtoReader protoReader) {
            C2229821CPc c2229821CPc = new C2229821CPc();
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
                                        c2229821CPc.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                    } else {
                                        c2229821CPc.LJII = ProtoAdapter.INT64.decode(protoReader);
                                    }
                                } else {
                                    c2229821CPc.LJI.putAll(this.LIZ.decode(protoReader));
                                }
                            } else {
                                c2229821CPc.LJFF = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c2229821CPc.LJ = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c2229821CPc.LIZLLL = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2229821CPc.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(BizNewDirectPushNotify bizNewDirectPushNotify) {
            BizNewDirectPushNotify bizNewDirectPushNotify2 = bizNewDirectPushNotify;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            return protoAdapter.encodedSizeWithTag(1, bizNewDirectPushNotify2.inbox_type) + protoAdapter.encodedSizeWithTag(2, bizNewDirectPushNotify2.message_type) + ProtoAdapter.STRING.encodedSizeWithTag(3, bizNewDirectPushNotify2.content) + this.LIZ.encodedSizeWithTag(4, bizNewDirectPushNotify2.ext) + ProtoAdapter.INT64.encodedSizeWithTag(5, bizNewDirectPushNotify2.create_time) + bizNewDirectPushNotify2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, BizNewDirectPushNotify bizNewDirectPushNotify) {
            BizNewDirectPushNotify bizNewDirectPushNotify2 = bizNewDirectPushNotify;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 1, bizNewDirectPushNotify2.inbox_type);
            protoAdapter.encodeWithTag(protoWriter, 2, bizNewDirectPushNotify2.message_type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, bizNewDirectPushNotify2.content);
            this.LIZ.encodeWithTag(protoWriter, 4, bizNewDirectPushNotify2.ext);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, bizNewDirectPushNotify2.create_time);
            protoWriter.writeBytes(bizNewDirectPushNotify2.unknownFields());
        }
    };
    public static final Integer DEFAULT_INBOX_TYPE = 0;
    public static final Integer DEFAULT_MESSAGE_TYPE = 0;
    public static final Long DEFAULT_CREATE_TIME = 0L;

    @Override // com.squareup.wire.Message
    public C2229821CPc newBuilder() {
        C2229821CPc c2229821CPc = new C2229821CPc();
        c2229821CPc.LIZLLL = this.inbox_type;
        c2229821CPc.LJ = this.message_type;
        c2229821CPc.LJFF = this.content;
        c2229821CPc.LJI = C1516540pZE.LIZLLL("ext", this.ext);
        c2229821CPc.LJII = this.create_time;
        c2229821CPc.addUnknownFields(unknownFields());
        return c2229821CPc;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.inbox_type != null) {
            sb.append(", inbox_type=");
            sb.append(this.inbox_type);
        }
        if (this.message_type != null) {
            sb.append(", message_type=");
            sb.append(this.message_type);
        }
        if (this.content != null) {
            sb.append(", content=");
            sb.append(this.content);
        }
        Map<String, String> map = this.ext;
        if (map != null && !map.isEmpty()) {
            sb.append(", ext=");
            sb.append(this.ext);
        }
        if (this.create_time != null) {
            sb.append(", create_time=");
            sb.append(this.create_time);
        }
        sb.replace(0, 2, "BizNewDirectPushNotify{");
        sb.append('}');
        return sb.toString();
    }

    public BizNewDirectPushNotify(Integer num, Integer num2, String str, Map<String, String> map, Long l) {
        this(num, num2, str, map, l, ByteString.EMPTY);
    }

    public BizNewDirectPushNotify(Integer num, Integer num2, String str, Map<String, String> map, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.inbox_type = num;
        this.message_type = num2;
        this.content = str;
        this.ext = C1516540pZE.LJI("ext", map);
        this.create_time = l;
    }
}
