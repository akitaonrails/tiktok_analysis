package com.bytedance.im.core.proto;

import X.C09CT;
import X.C2251151D9d;
import com.bytedance.im.core.proto.GetCmdMessageReqBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: loaded from: classes36.dex */
public final class GetCmdMessageReqBody extends Message<GetCmdMessageReqBody, C2251151D9d> {
    public static final ProtoAdapter<GetCmdMessageReqBody> ADAPTER = new ProtoAdapter<GetCmdMessageReqBody>() { // from class: X.1D9c
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final GetCmdMessageReqBody decode(ProtoReader protoReader) {
            C2251151D9d c2251151D9d = new C2251151D9d();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c2251151D9d.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c2251151D9d.LJFF = ProtoAdapter.INT32.decode(protoReader);
                            }
                        } else {
                            c2251151D9d.LJ = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c2251151D9d.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2251151D9d.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(GetCmdMessageReqBody getCmdMessageReqBody) {
            GetCmdMessageReqBody getCmdMessageReqBody2 = getCmdMessageReqBody;
            return ProtoAdapter.INT64.encodedSizeWithTag(1, getCmdMessageReqBody2.cmd_index) + ProtoAdapter.STRING.encodedSizeWithTag(2, getCmdMessageReqBody2.source) + ProtoAdapter.INT32.encodedSizeWithTag(3, getCmdMessageReqBody2.new_user) + getCmdMessageReqBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, GetCmdMessageReqBody getCmdMessageReqBody) {
            GetCmdMessageReqBody getCmdMessageReqBody2 = getCmdMessageReqBody;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, getCmdMessageReqBody2.cmd_index);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, getCmdMessageReqBody2.source);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, getCmdMessageReqBody2.new_user);
            protoWriter.writeBytes(getCmdMessageReqBody2.unknownFields());
        }
    };
    public static final Long DEFAULT_CMD_INDEX = 0L;
    public static final Integer DEFAULT_NEW_USER = 0;
    public static final long serialVersionUID = 0;

    @C09CT("cmd_index")
    public final Long cmd_index;

    @C09CT("new_user")
    public final Integer new_user;

    @C09CT("source")
    public final String source;

    @Override // com.squareup.wire.Message
    public C2251151D9d newBuilder() {
        C2251151D9d c2251151D9d = new C2251151D9d();
        c2251151D9d.LIZLLL = this.cmd_index;
        c2251151D9d.LJ = this.source;
        c2251151D9d.LJFF = this.new_user;
        c2251151D9d.addUnknownFields(unknownFields());
        return c2251151D9d;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", cmd_index=");
        sb.append(this.cmd_index);
        sb.append(", source=");
        sb.append(this.source);
        if (this.new_user != null) {
            sb.append(", new_user=");
            sb.append(this.new_user);
        }
        sb.replace(0, 2, "GetCmdMessageReqBody{");
        sb.append('}');
        return sb.toString();
    }

    public GetCmdMessageReqBody(Long l, String str, Integer num) {
        this(l, str, num, ByteString.EMPTY);
    }

    public GetCmdMessageReqBody(Long l, String str, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.cmd_index = l;
        this.source = str;
        this.new_user = num;
    }
}
