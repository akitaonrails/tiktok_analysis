package com.bytedance.im.core.proto;

import X.C09CT;
import X.C0YM0;
import X.C1516540pZE;
import X.C872820YLw;
import X.EnumC872840YLy;
import com.bytedance.im.core.proto.SendInputStatusRequestBody;
import com.bytedance.scene.Scene;
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
public final class SendInputStatusRequestBody extends Message<SendInputStatusRequestBody, C872820YLw> {
    public static final long serialVersionUID = 0;

    @C09CT("conversation_id")
    public final String conversation_id;

    @C09CT("conversation_short_id")
    public final Long conversation_short_id;

    @C09CT("conversation_type")
    public final Integer conversation_type;

    @C09CT("extra")
    public final Map<String, String> extra;

    @C09CT(Scene.SCENE_SERVICE)
    public final C0YM0 scene;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final EnumC872840YLy status;

    @C09CT("stay_time")
    public final Long stay_time;
    public static final ProtoAdapter<SendInputStatusRequestBody> ADAPTER = new ProtoAdapter<SendInputStatusRequestBody>() { // from class: X.0YLx
        public final ProtoAdapter<Map<String, String>> LIZ;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.LIZ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final SendInputStatusRequestBody decode(ProtoReader protoReader) {
            C872820YLw c872820YLw = new C872820YLw();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c872820YLw.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c872820YLw.LJ = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 3:
                            c872820YLw.LJFF = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            try {
                                c872820YLw.LJI = EnumC872840YLy.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c872820YLw.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                            break;
                        case 5:
                            c872820YLw.LJII.putAll(this.LIZ.decode(protoReader));
                            break;
                        case 6:
                            try {
                                c872820YLw.LJIIIIZZ = C0YM0.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                TryCatchGuardChecker.doCheck(e2);
                                c872820YLw.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                            }
                            break;
                        case 7:
                            c872820YLw.LJIIIZ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c872820YLw.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c872820YLw.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(SendInputStatusRequestBody sendInputStatusRequestBody) {
            SendInputStatusRequestBody sendInputStatusRequestBody2 = sendInputStatusRequestBody;
            int iEncodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, sendInputStatusRequestBody2.conversation_id) + ProtoAdapter.INT32.encodedSizeWithTag(2, sendInputStatusRequestBody2.conversation_type);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(3, sendInputStatusRequestBody2.conversation_short_id) + EnumC872840YLy.ADAPTER.encodedSizeWithTag(4, sendInputStatusRequestBody2.status) + this.LIZ.encodedSizeWithTag(5, sendInputStatusRequestBody2.extra) + C0YM0.ADAPTER.encodedSizeWithTag(6, sendInputStatusRequestBody2.scene) + protoAdapter.encodedSizeWithTag(7, sendInputStatusRequestBody2.stay_time) + sendInputStatusRequestBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, SendInputStatusRequestBody sendInputStatusRequestBody) {
            SendInputStatusRequestBody sendInputStatusRequestBody2 = sendInputStatusRequestBody;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, sendInputStatusRequestBody2.conversation_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, sendInputStatusRequestBody2.conversation_type);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 3, sendInputStatusRequestBody2.conversation_short_id);
            EnumC872840YLy.ADAPTER.encodeWithTag(protoWriter, 4, sendInputStatusRequestBody2.status);
            this.LIZ.encodeWithTag(protoWriter, 5, sendInputStatusRequestBody2.extra);
            C0YM0.ADAPTER.encodeWithTag(protoWriter, 6, sendInputStatusRequestBody2.scene);
            protoAdapter.encodeWithTag(protoWriter, 7, sendInputStatusRequestBody2.stay_time);
            protoWriter.writeBytes(sendInputStatusRequestBody2.unknownFields());
        }
    };
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final EnumC872840YLy DEFAULT_STATUS = EnumC872840YLy.TYPING;
    public static final C0YM0 DEFAULT_SCENE = C0YM0.INPUT_STATUS_SCENE_UNKNOWN;
    public static final Long DEFAULT_STAY_TIME = 0L;

    @Override // com.squareup.wire.Message
    public C872820YLw newBuilder() {
        C872820YLw c872820YLw = new C872820YLw();
        c872820YLw.LIZLLL = this.conversation_id;
        c872820YLw.LJ = this.conversation_type;
        c872820YLw.LJFF = this.conversation_short_id;
        c872820YLw.LJI = this.status;
        c872820YLw.LJII = C1516540pZE.LIZLLL("extra", this.extra);
        c872820YLw.LJIIIIZZ = this.scene;
        c872820YLw.LJIIIZ = this.stay_time;
        c872820YLw.addUnknownFields(unknownFields());
        return c872820YLw;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.conversation_id != null) {
            sb.append(", conversation_id=");
            sb.append(this.conversation_id);
        }
        if (this.conversation_type != null) {
            sb.append(", conversation_type=");
            sb.append(this.conversation_type);
        }
        if (this.conversation_short_id != null) {
            sb.append(", conversation_short_id=");
            sb.append(this.conversation_short_id);
        }
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        Map<String, String> map = this.extra;
        if (map != null && !map.isEmpty()) {
            sb.append(", extra=");
            sb.append(this.extra);
        }
        if (this.scene != null) {
            sb.append(", scene=");
            sb.append(this.scene);
        }
        if (this.stay_time != null) {
            sb.append(", stay_time=");
            sb.append(this.stay_time);
        }
        sb.replace(0, 2, "SendInputStatusRequestBody{");
        sb.append('}');
        return sb.toString();
    }

    public SendInputStatusRequestBody(String str, Integer num, Long l, EnumC872840YLy enumC872840YLy, Map<String, String> map, C0YM0 c0ym0, Long l2) {
        this(str, num, l, enumC872840YLy, map, c0ym0, l2, ByteString.EMPTY);
    }

    public SendInputStatusRequestBody(String str, Integer num, Long l, EnumC872840YLy enumC872840YLy, Map<String, String> map, C0YM0 c0ym0, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_id = str;
        this.conversation_type = num;
        this.conversation_short_id = l;
        this.status = enumC872840YLy;
        this.extra = C1516540pZE.LJI("extra", map);
        this.scene = c0ym0;
        this.stay_time = l2;
    }
}
