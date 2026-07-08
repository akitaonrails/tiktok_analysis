package com.bytedance.im.core.proto;

import X.C09CT;
import X.C2237211ChL;
import com.bytedance.im.core.proto.SecUidPair;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class SecUidPair extends Message<SecUidPair, C2237211ChL> {
    public static final ProtoAdapter<SecUidPair> ADAPTER = new ProtoAdapter<SecUidPair>() { // from class: X.1ChK
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final SecUidPair decode(ProtoReader protoReader) {
            C2237211ChL c2237211ChL = new C2237211ChL();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2237211ChL.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c2237211ChL.LJ = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c2237211ChL.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2237211ChL.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(SecUidPair secUidPair) {
            SecUidPair secUidPair2 = secUidPair;
            return ProtoAdapter.INT64.encodedSizeWithTag(1, secUidPair2.uid) + ProtoAdapter.STRING.encodedSizeWithTag(2, secUidPair2.sec_uid) + secUidPair2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, SecUidPair secUidPair) {
            SecUidPair secUidPair2 = secUidPair;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, secUidPair2.uid);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, secUidPair2.sec_uid);
            protoWriter.writeBytes(secUidPair2.unknownFields());
        }
    };
    public static final Long DEFAULT_UID = 0L;
    public static final long serialVersionUID = 0;

    @C09CT("sec_uid")
    public final String sec_uid;

    @C09CT("uid")
    public final Long uid;

    @Override // com.squareup.wire.Message
    public C2237211ChL newBuilder() {
        C2237211ChL c2237211ChL = new C2237211ChL();
        c2237211ChL.LIZLLL = this.uid;
        c2237211ChL.LJ = this.sec_uid;
        c2237211ChL.addUnknownFields(unknownFields());
        return c2237211ChL;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.uid != null) {
            sb.append(", uid=");
            sb.append(this.uid);
        }
        if (this.sec_uid != null) {
            sb.append(", sec_uid=");
            sb.append(this.sec_uid);
        }
        sb.replace(0, 2, "SecUidPair{");
        sb.append('}');
        return sb.toString();
    }

    public SecUidPair(Long l, String str) {
        this(l, str, ByteString.EMPTY);
    }

    public SecUidPair(Long l, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.uid = l;
        this.sec_uid = str;
    }
}
