package com.bytedance.im.core.proto;

import X.C09CT;
import X.C2237841CiM;
import X.EnumC19365410pY;
import X.EnumC2220201Bv0;
import com.bytedance.im.core.proto.ClientACKRequestBody;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class ClientACKRequestBody extends Message<ClientACKRequestBody, C2237841CiM> {
    public static final long serialVersionUID = 0;

    @C09CT("client_time_stamp")
    public final Long client_time_stamp;

    @C09CT("cmd")
    public final Integer cmd;

    @C09CT("logid")
    public final String logid;

    @C09CT("network_type")
    public final EnumC2220201Bv0 network_type;

    @C09CT("server_message_id")
    public final Long server_message_id;

    @C09CT("start_time_stamp")
    public final Long start_time_stamp;

    @C09CT("type")
    public final EnumC19365410pY type;
    public static final ProtoAdapter<ClientACKRequestBody> ADAPTER = new ProtoAdapter<ClientACKRequestBody>() { // from class: X.1CiL
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final ClientACKRequestBody decode(ProtoReader protoReader) {
            C2237841CiM c2237841CiM = new C2237841CiM();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c2237841CiM.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 2:
                            c2237841CiM.LJ = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 3:
                            try {
                                c2237841CiM.LJFF = EnumC2220201Bv0.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c2237841CiM.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                            break;
                        case 4:
                            c2237841CiM.LJI = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c2237841CiM.LJII = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 6:
                            c2237841CiM.LJIIIIZZ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 7:
                            try {
                                c2237841CiM.LJIIIZ = EnumC19365410pY.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                TryCatchGuardChecker.doCheck(e2);
                                c2237841CiM.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                            }
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2237841CiM.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2237841CiM.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(ClientACKRequestBody clientACKRequestBody) {
            ClientACKRequestBody clientACKRequestBody2 = clientACKRequestBody;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return protoAdapter.encodedSizeWithTag(1, clientACKRequestBody2.start_time_stamp) + ProtoAdapter.INT32.encodedSizeWithTag(2, clientACKRequestBody2.cmd) + EnumC2220201Bv0.ADAPTER.encodedSizeWithTag(3, clientACKRequestBody2.network_type) + ProtoAdapter.STRING.encodedSizeWithTag(4, clientACKRequestBody2.logid) + protoAdapter.encodedSizeWithTag(5, clientACKRequestBody2.client_time_stamp) + protoAdapter.encodedSizeWithTag(6, clientACKRequestBody2.server_message_id) + EnumC19365410pY.ADAPTER.encodedSizeWithTag(7, clientACKRequestBody2.type) + clientACKRequestBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, ClientACKRequestBody clientACKRequestBody) {
            ClientACKRequestBody clientACKRequestBody2 = clientACKRequestBody;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, clientACKRequestBody2.start_time_stamp);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, clientACKRequestBody2.cmd);
            EnumC2220201Bv0.ADAPTER.encodeWithTag(protoWriter, 3, clientACKRequestBody2.network_type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, clientACKRequestBody2.logid);
            protoAdapter.encodeWithTag(protoWriter, 5, clientACKRequestBody2.client_time_stamp);
            protoAdapter.encodeWithTag(protoWriter, 6, clientACKRequestBody2.server_message_id);
            EnumC19365410pY.ADAPTER.encodeWithTag(protoWriter, 7, clientACKRequestBody2.type);
            protoWriter.writeBytes(clientACKRequestBody2.unknownFields());
        }
    };
    public static final Long DEFAULT_START_TIME_STAMP = 0L;
    public static final Integer DEFAULT_CMD = 0;
    public static final EnumC2220201Bv0 DEFAULT_NETWORK_TYPE = EnumC2220201Bv0.UNKNOWN;
    public static final Long DEFAULT_CLIENT_TIME_STAMP = 0L;
    public static final Long DEFAULT_SERVER_MESSAGE_ID = 0L;
    public static final EnumC19365410pY DEFAULT_TYPE = EnumC19365410pY.NOT_USE;

    @Override // com.squareup.wire.Message
    public C2237841CiM newBuilder() {
        C2237841CiM c2237841CiM = new C2237841CiM();
        c2237841CiM.LIZLLL = this.start_time_stamp;
        c2237841CiM.LJ = this.cmd;
        c2237841CiM.LJFF = this.network_type;
        c2237841CiM.LJI = this.logid;
        c2237841CiM.LJII = this.client_time_stamp;
        c2237841CiM.LJIIIIZZ = this.server_message_id;
        c2237841CiM.LJIIIZ = this.type;
        c2237841CiM.addUnknownFields(unknownFields());
        return c2237841CiM;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", start_time_stamp=");
        sb.append(this.start_time_stamp);
        sb.append(", cmd=");
        sb.append(this.cmd);
        if (this.network_type != null) {
            sb.append(", network_type=");
            sb.append(this.network_type);
        }
        if (this.logid != null) {
            sb.append(", logid=");
            sb.append(this.logid);
        }
        if (this.client_time_stamp != null) {
            sb.append(", client_time_stamp=");
            sb.append(this.client_time_stamp);
        }
        if (this.server_message_id != null) {
            sb.append(", server_message_id=");
            sb.append(this.server_message_id);
        }
        sb.append(", type=");
        sb.append(this.type);
        sb.replace(0, 2, "ClientACKRequestBody{");
        sb.append('}');
        return sb.toString();
    }

    public ClientACKRequestBody(Long l, Integer num, EnumC2220201Bv0 enumC2220201Bv0, String str, Long l2, Long l3, EnumC19365410pY enumC19365410pY) {
        this(l, num, enumC2220201Bv0, str, l2, l3, enumC19365410pY, ByteString.EMPTY);
    }

    public ClientACKRequestBody(Long l, Integer num, EnumC2220201Bv0 enumC2220201Bv0, String str, Long l2, Long l3, EnumC19365410pY enumC19365410pY, ByteString byteString) {
        super(ADAPTER, byteString);
        this.start_time_stamp = l;
        this.cmd = num;
        this.network_type = enumC2220201Bv0;
        this.logid = str;
        this.client_time_stamp = l2;
        this.server_message_id = l3;
        this.type = enumC19365410pY;
    }
}
