package com.bytedance.im.core.proto;

import X.C09CT;
import X.C0YKW;
import X.EnumC868450Y5b;
import X.EnumC869400Y8s;
import X.EnumC872340YKa;
import com.bytedance.im.core.proto.AckMessage;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class AckMessage extends Message<AckMessage, C0YKW> {
    public static final ProtoAdapter<AckMessage> ADAPTER = new ProtoAdapter<AckMessage>() { // from class: X.0YKV
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final AckMessage decode(ProtoReader protoReader) {
            C0YKW c0ykw = new C0YKW();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c0ykw.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c0ykw.LJ = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 3:
                            try {
                                c0ykw.LJFF = EnumC868450Y5b.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c0ykw.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                            break;
                        case 4:
                            c0ykw.LJI = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c0ykw.LJII = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 6:
                            try {
                                c0ykw.LJIIIIZZ = EnumC869400Y8s.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                TryCatchGuardChecker.doCheck(e2);
                                c0ykw.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                            }
                            break;
                        case 7:
                            try {
                                c0ykw.LJIIIZ = EnumC872340YKa.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                TryCatchGuardChecker.doCheck(e3);
                                c0ykw.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                            }
                            break;
                        case 8:
                            c0ykw.LJIIJ = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c0ykw.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c0ykw.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(AckMessage ackMessage) {
            AckMessage ackMessage2 = ackMessage;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, ackMessage2.server_msg_id);
            ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, ackMessage2.is_ws) + EnumC868450Y5b.ADAPTER.encodedSizeWithTag(3, ackMessage2.msg_type) + protoAdapter.encodedSizeWithTag(4, ackMessage2.scene) + ProtoAdapter.INT32.encodedSizeWithTag(5, ackMessage2.inbox_type) + EnumC869400Y8s.ADAPTER.encodedSizeWithTag(6, ackMessage2.conv_type) + EnumC872340YKa.ADAPTER.encodedSizeWithTag(7, ackMessage2.cmd_type) + protoAdapter2.encodedSizeWithTag(8, ackMessage2.first_save_to_db) + ackMessage2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, AckMessage ackMessage) {
            AckMessage ackMessage2 = ackMessage;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, ackMessage2.server_msg_id);
            ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
            protoAdapter2.encodeWithTag(protoWriter, 2, ackMessage2.is_ws);
            EnumC868450Y5b.ADAPTER.encodeWithTag(protoWriter, 3, ackMessage2.msg_type);
            protoAdapter.encodeWithTag(protoWriter, 4, ackMessage2.scene);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, ackMessage2.inbox_type);
            EnumC869400Y8s.ADAPTER.encodeWithTag(protoWriter, 6, ackMessage2.conv_type);
            EnumC872340YKa.ADAPTER.encodeWithTag(protoWriter, 7, ackMessage2.cmd_type);
            protoAdapter2.encodeWithTag(protoWriter, 8, ackMessage2.first_save_to_db);
            protoWriter.writeBytes(ackMessage2.unknownFields());
        }
    };
    public static final EnumC872340YKa DEFAULT_CMD_TYPE;
    public static final EnumC869400Y8s DEFAULT_CONV_TYPE;
    public static final Boolean DEFAULT_FIRST_SAVE_TO_DB;
    public static final Integer DEFAULT_INBOX_TYPE;
    public static final Boolean DEFAULT_IS_WS;
    public static final EnumC868450Y5b DEFAULT_MSG_TYPE;
    public static final long serialVersionUID = 0;

    @C09CT("cmd_type")
    public final EnumC872340YKa cmd_type;

    @C09CT("conv_type")
    public final EnumC869400Y8s conv_type;

    @C09CT("first_save_to_db")
    public final Boolean first_save_to_db;

    @C09CT("inbox_type")
    public final Integer inbox_type;

    @C09CT("is_ws")
    public final Boolean is_ws;

    @C09CT("msg_type")
    public final EnumC868450Y5b msg_type;

    @C09CT(Scene.SCENE_SERVICE)
    public final String scene;

    @C09CT("server_msg_id")
    public final String server_msg_id;

    static {
        Boolean bool = Boolean.FALSE;
        DEFAULT_IS_WS = bool;
        DEFAULT_MSG_TYPE = EnumC868450Y5b.MESSAGE_TYPE_NOT_USED;
        DEFAULT_INBOX_TYPE = 0;
        DEFAULT_CONV_TYPE = EnumC869400Y8s.UNKNOWN_CONV_TYPE;
        DEFAULT_CMD_TYPE = EnumC872340YKa.CmdTypeUnknown;
        DEFAULT_FIRST_SAVE_TO_DB = bool;
    }

    @Override // com.squareup.wire.Message
    public C0YKW newBuilder() {
        C0YKW c0ykw = new C0YKW();
        c0ykw.LIZLLL = this.server_msg_id;
        c0ykw.LJ = this.is_ws;
        c0ykw.LJFF = this.msg_type;
        c0ykw.LJI = this.scene;
        c0ykw.LJII = this.inbox_type;
        c0ykw.LJIIIIZZ = this.conv_type;
        c0ykw.LJIIIZ = this.cmd_type;
        c0ykw.LJIIJ = this.first_save_to_db;
        c0ykw.addUnknownFields(unknownFields());
        return c0ykw;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", server_msg_id=");
        sb.append(this.server_msg_id);
        sb.append(", is_ws=");
        sb.append(this.is_ws);
        sb.append(", msg_type=");
        sb.append(this.msg_type);
        sb.append(", scene=");
        sb.append(this.scene);
        if (this.inbox_type != null) {
            sb.append(", inbox_type=");
            sb.append(this.inbox_type);
        }
        if (this.conv_type != null) {
            sb.append(", conv_type=");
            sb.append(this.conv_type);
        }
        if (this.cmd_type != null) {
            sb.append(", cmd_type=");
            sb.append(this.cmd_type);
        }
        if (this.first_save_to_db != null) {
            sb.append(", first_save_to_db=");
            sb.append(this.first_save_to_db);
        }
        sb.replace(0, 2, "AckMessage{");
        sb.append('}');
        return sb.toString();
    }

    public AckMessage(String str, Boolean bool, EnumC868450Y5b enumC868450Y5b, String str2, Integer num, EnumC869400Y8s enumC869400Y8s, EnumC872340YKa enumC872340YKa, Boolean bool2) {
        this(str, bool, enumC868450Y5b, str2, num, enumC869400Y8s, enumC872340YKa, bool2, ByteString.EMPTY);
    }

    public AckMessage(String str, Boolean bool, EnumC868450Y5b enumC868450Y5b, String str2, Integer num, EnumC869400Y8s enumC869400Y8s, EnumC872340YKa enumC872340YKa, Boolean bool2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.server_msg_id = str;
        this.is_ws = bool;
        this.msg_type = enumC868450Y5b;
        this.scene = str2;
        this.inbox_type = num;
        this.conv_type = enumC869400Y8s;
        this.cmd_type = enumC872340YKa;
        this.first_save_to_db = bool2;
    }
}
