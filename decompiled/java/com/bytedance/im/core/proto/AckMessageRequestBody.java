package com.bytedance.im.core.proto;

import X.C09CT;
import X.C0YMR;
import X.C1DBU;
import X.EnumC19365610pa;
import X.EnumC868450Y5b;
import X.EnumC869400Y8s;
import com.bytedance.im.core.proto.AckMessageRequestBody;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import okio.ByteString;

/* JADX INFO: loaded from: classes36.dex */
public final class AckMessageRequestBody extends Message<AckMessageRequestBody, C1DBU> {
    public static final long serialVersionUID = 0;

    @C09CT("cmd")
    public final C0YMR cmd;

    @C09CT("conv_type")
    public final EnumC869400Y8s conv_type;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("msg_type")
    public final EnumC868450Y5b msg_type;

    @C09CT("push_type")
    public final EnumC19365610pa push_type;

    @C09CT("start_timestamp")
    public final Long start_timestamp;
    public static final ProtoAdapter<AckMessageRequestBody> ADAPTER = new ProtoAdapter<AckMessageRequestBody>() { // from class: X.1DBT
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final AckMessageRequestBody decode(ProtoReader protoReader) {
            C1DBU c1dbu = new C1DBU();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c1dbu.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 2:
                            c1dbu.LJ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            try {
                                c1dbu.LJFF = EnumC869400Y8s.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c1dbu.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                            break;
                        case 4:
                            try {
                                c1dbu.LJI = EnumC868450Y5b.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                TryCatchGuardChecker.doCheck(e2);
                                c1dbu.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                            }
                            break;
                        case 5:
                            try {
                                c1dbu.LJII = EnumC19365610pa.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                TryCatchGuardChecker.doCheck(e3);
                                c1dbu.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                            }
                            break;
                        case 6:
                            try {
                                c1dbu.LJIIIIZZ = C0YMR.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                TryCatchGuardChecker.doCheck(e4);
                                c1dbu.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                            }
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1dbu.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1dbu.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(AckMessageRequestBody ackMessageRequestBody) {
            AckMessageRequestBody ackMessageRequestBody2 = ackMessageRequestBody;
            return ProtoAdapter.INT64.encodedSizeWithTag(1, ackMessageRequestBody2.start_timestamp) + ProtoAdapter.STRING.encodedSizeWithTag(2, ackMessageRequestBody2.id) + EnumC869400Y8s.ADAPTER.encodedSizeWithTag(3, ackMessageRequestBody2.conv_type) + EnumC868450Y5b.ADAPTER.encodedSizeWithTag(4, ackMessageRequestBody2.msg_type) + EnumC19365610pa.ADAPTER.encodedSizeWithTag(5, ackMessageRequestBody2.push_type) + C0YMR.ADAPTER.encodedSizeWithTag(6, ackMessageRequestBody2.cmd) + ackMessageRequestBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, AckMessageRequestBody ackMessageRequestBody) {
            AckMessageRequestBody ackMessageRequestBody2 = ackMessageRequestBody;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, ackMessageRequestBody2.start_timestamp);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, ackMessageRequestBody2.id);
            EnumC869400Y8s.ADAPTER.encodeWithTag(protoWriter, 3, ackMessageRequestBody2.conv_type);
            EnumC868450Y5b.ADAPTER.encodeWithTag(protoWriter, 4, ackMessageRequestBody2.msg_type);
            EnumC19365610pa.ADAPTER.encodeWithTag(protoWriter, 5, ackMessageRequestBody2.push_type);
            C0YMR.ADAPTER.encodeWithTag(protoWriter, 6, ackMessageRequestBody2.cmd);
            protoWriter.writeBytes(ackMessageRequestBody2.unknownFields());
        }
    };
    public static final Long DEFAULT_START_TIMESTAMP = 0L;
    public static final EnumC869400Y8s DEFAULT_CONV_TYPE = EnumC869400Y8s.UNKNOWN_CONV_TYPE;
    public static final EnumC868450Y5b DEFAULT_MSG_TYPE = EnumC868450Y5b.MESSAGE_TYPE_NOT_USED;
    public static final EnumC19365610pa DEFAULT_PUSH_TYPE = EnumC19365610pa.Internal;
    public static final C0YMR DEFAULT_CMD = C0YMR.IMCMD_NOT_USED;

    @Override // com.squareup.wire.Message
    public C1DBU newBuilder() {
        C1DBU c1dbu = new C1DBU();
        c1dbu.LIZLLL = this.start_timestamp;
        c1dbu.LJ = this.id;
        c1dbu.LJFF = this.conv_type;
        c1dbu.LJI = this.msg_type;
        c1dbu.LJII = this.push_type;
        c1dbu.LJIIIIZZ = this.cmd;
        c1dbu.addUnknownFields(unknownFields());
        return c1dbu;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", start_timestamp=");
        sb.append(this.start_timestamp);
        sb.append(", id=");
        sb.append(this.id);
        if (this.conv_type != null) {
            sb.append(", conv_type=");
            sb.append(this.conv_type);
        }
        if (this.msg_type != null) {
            sb.append(", msg_type=");
            sb.append(this.msg_type);
        }
        if (this.push_type != null) {
            sb.append(", push_type=");
            sb.append(this.push_type);
        }
        if (this.cmd != null) {
            sb.append(", cmd=");
            sb.append(this.cmd);
        }
        sb.replace(0, 2, "AckMessageRequestBody{");
        sb.append('}');
        return sb.toString();
    }

    public AckMessageRequestBody(Long l, String str, EnumC869400Y8s enumC869400Y8s, EnumC868450Y5b enumC868450Y5b, EnumC19365610pa enumC19365610pa, C0YMR c0ymr) {
        this(l, str, enumC869400Y8s, enumC868450Y5b, enumC19365610pa, c0ymr, ByteString.EMPTY);
    }

    public AckMessageRequestBody(Long l, String str, EnumC869400Y8s enumC869400Y8s, EnumC868450Y5b enumC868450Y5b, EnumC19365610pa enumC19365610pa, C0YMR c0ymr, ByteString byteString) {
        super(ADAPTER, byteString);
        this.start_timestamp = l;
        this.id = str;
        this.conv_type = enumC869400Y8s;
        this.msg_type = enumC868450Y5b;
        this.push_type = enumC19365610pa;
        this.cmd = c0ymr;
    }
}
