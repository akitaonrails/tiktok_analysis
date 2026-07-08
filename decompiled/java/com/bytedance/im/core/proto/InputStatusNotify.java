package com.bytedance.im.core.proto;

import X.C09CT;
import X.C0YM0;
import X.C0YSB;
import X.EnumC869400Y8s;
import X.EnumC872840YLy;
import com.bytedance.im.core.proto.InputStatusNotify;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class InputStatusNotify extends Message<InputStatusNotify, C0YSB> {
    public static final long serialVersionUID = 0;

    @C09CT("conversation_id")
    public final String conversation_id;

    @C09CT("conversation_short_id")
    public final Long conversation_short_id;

    @C09CT("conversation_type")
    public final EnumC869400Y8s conversation_type;

    @C09CT("create_time")
    public final Long create_time;

    @C09CT("input_status")
    public final EnumC872840YLy input_status;

    @C09CT(Scene.SCENE_SERVICE)
    public final C0YM0 scene;

    @C09CT("sender")
    public final Long sender;

    @C09CT("stay_time")
    public final Long stay_time;
    public static final ProtoAdapter<InputStatusNotify> ADAPTER = new ProtoAdapter<InputStatusNotify>() { // from class: X.0YSA
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final InputStatusNotify decode(ProtoReader protoReader) {
            C0YSB c0ysb = new C0YSB();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 10) {
                        switch (iNextTag) {
                            case 1:
                                c0ysb.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                                break;
                            case 2:
                                c0ysb.LJ = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 3:
                                c0ysb.LJFF = ProtoAdapter.INT64.decode(protoReader);
                                break;
                            case 4:
                                try {
                                    c0ysb.LJI = EnumC869400Y8s.ADAPTER.decode(protoReader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    c0ysb.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                }
                                break;
                            case 5:
                                try {
                                    c0ysb.LJII = EnumC872840YLy.ADAPTER.decode(protoReader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    TryCatchGuardChecker.doCheck(e2);
                                    c0ysb.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                }
                                break;
                            case 6:
                                try {
                                    c0ysb.LJIIIIZZ = C0YM0.ADAPTER.decode(protoReader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                    TryCatchGuardChecker.doCheck(e3);
                                    c0ysb.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                }
                                break;
                            case 7:
                                c0ysb.LJIIIZ = ProtoAdapter.INT64.decode(protoReader);
                                break;
                            default:
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c0ysb.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                        }
                    } else {
                        c0ysb.LJIIJ = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c0ysb.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(InputStatusNotify inputStatusNotify) {
            InputStatusNotify inputStatusNotify2 = inputStatusNotify;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return protoAdapter.encodedSizeWithTag(1, inputStatusNotify2.sender) + ProtoAdapter.STRING.encodedSizeWithTag(2, inputStatusNotify2.conversation_id) + protoAdapter.encodedSizeWithTag(3, inputStatusNotify2.conversation_short_id) + EnumC869400Y8s.ADAPTER.encodedSizeWithTag(4, inputStatusNotify2.conversation_type) + EnumC872840YLy.ADAPTER.encodedSizeWithTag(5, inputStatusNotify2.input_status) + C0YM0.ADAPTER.encodedSizeWithTag(6, inputStatusNotify2.scene) + protoAdapter.encodedSizeWithTag(7, inputStatusNotify2.stay_time) + protoAdapter.encodedSizeWithTag(10, inputStatusNotify2.create_time) + inputStatusNotify2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, InputStatusNotify inputStatusNotify) {
            InputStatusNotify inputStatusNotify2 = inputStatusNotify;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, inputStatusNotify2.sender);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, inputStatusNotify2.conversation_id);
            protoAdapter.encodeWithTag(protoWriter, 3, inputStatusNotify2.conversation_short_id);
            EnumC869400Y8s.ADAPTER.encodeWithTag(protoWriter, 4, inputStatusNotify2.conversation_type);
            EnumC872840YLy.ADAPTER.encodeWithTag(protoWriter, 5, inputStatusNotify2.input_status);
            C0YM0.ADAPTER.encodeWithTag(protoWriter, 6, inputStatusNotify2.scene);
            protoAdapter.encodeWithTag(protoWriter, 7, inputStatusNotify2.stay_time);
            protoAdapter.encodeWithTag(protoWriter, 10, inputStatusNotify2.create_time);
            protoWriter.writeBytes(inputStatusNotify2.unknownFields());
        }
    };
    public static final Long DEFAULT_SENDER = 0L;
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final EnumC869400Y8s DEFAULT_CONVERSATION_TYPE = EnumC869400Y8s.UNKNOWN_CONV_TYPE;
    public static final EnumC872840YLy DEFAULT_INPUT_STATUS = EnumC872840YLy.TYPING;
    public static final C0YM0 DEFAULT_SCENE = C0YM0.INPUT_STATUS_SCENE_UNKNOWN;
    public static final Long DEFAULT_STAY_TIME = 0L;
    public static final Long DEFAULT_CREATE_TIME = 0L;

    @Override // com.squareup.wire.Message
    public C0YSB newBuilder() {
        C0YSB c0ysb = new C0YSB();
        c0ysb.LIZLLL = this.sender;
        c0ysb.LJ = this.conversation_id;
        c0ysb.LJFF = this.conversation_short_id;
        c0ysb.LJI = this.conversation_type;
        c0ysb.LJII = this.input_status;
        c0ysb.LJIIIIZZ = this.scene;
        c0ysb.LJIIIZ = this.stay_time;
        c0ysb.LJIIJ = this.create_time;
        c0ysb.addUnknownFields(unknownFields());
        return c0ysb;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.sender != null) {
            sb.append(", sender=");
            sb.append(this.sender);
        }
        if (this.conversation_id != null) {
            sb.append(", conversation_id=");
            sb.append(this.conversation_id);
        }
        if (this.conversation_short_id != null) {
            sb.append(", conversation_short_id=");
            sb.append(this.conversation_short_id);
        }
        if (this.conversation_type != null) {
            sb.append(", conversation_type=");
            sb.append(this.conversation_type);
        }
        sb.append(", input_status=");
        sb.append(this.input_status);
        if (this.scene != null) {
            sb.append(", scene=");
            sb.append(this.scene);
        }
        if (this.stay_time != null) {
            sb.append(", stay_time=");
            sb.append(this.stay_time);
        }
        sb.append(", create_time=");
        sb.append(this.create_time);
        sb.replace(0, 2, "InputStatusNotify{");
        sb.append('}');
        return sb.toString();
    }

    public InputStatusNotify(Long l, String str, Long l2, EnumC869400Y8s enumC869400Y8s, EnumC872840YLy enumC872840YLy, C0YM0 c0ym0, Long l3, Long l4) {
        this(l, str, l2, enumC869400Y8s, enumC872840YLy, c0ym0, l3, l4, ByteString.EMPTY);
    }

    public InputStatusNotify(Long l, String str, Long l2, EnumC869400Y8s enumC869400Y8s, EnumC872840YLy enumC872840YLy, C0YM0 c0ym0, Long l3, Long l4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.sender = l;
        this.conversation_id = str;
        this.conversation_short_id = l2;
        this.conversation_type = enumC869400Y8s;
        this.input_status = enumC872840YLy;
        this.scene = c0ym0;
        this.stay_time = l3;
        this.create_time = l4;
    }
}
