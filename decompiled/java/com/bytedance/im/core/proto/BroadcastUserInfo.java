package com.bytedance.im.core.proto;

import X.C09CT;
import X.C1CSY;
import com.bytedance.im.core.proto.BroadcastUserInfo;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class BroadcastUserInfo extends Message<BroadcastUserInfo, C1CSY> {
    public static final long serialVersionUID = 0;

    @C09CT("conversation_short_id")
    public final Long conversation_short_id;

    @C09CT("conversation_type")
    public final Integer conversation_type;

    @C09CT("counter")
    public final Integer counter;
    public static final ProtoAdapter<BroadcastUserInfo> ADAPTER = new ProtoAdapter<BroadcastUserInfo>() { // from class: X.1CSX
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final BroadcastUserInfo decode(ProtoReader protoReader) {
            C1CSY c1csy = new C1CSY();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c1csy.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c1csy.LJFF = ProtoAdapter.INT32.decode(protoReader);
                            }
                        } else {
                            c1csy.LJ = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c1csy.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1csy.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(BroadcastUserInfo broadcastUserInfo) {
            BroadcastUserInfo broadcastUserInfo2 = broadcastUserInfo;
            int iEncodedSizeWithTag = ProtoAdapter.INT64.encodedSizeWithTag(1, broadcastUserInfo2.conversation_short_id);
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, broadcastUserInfo2.counter) + protoAdapter.encodedSizeWithTag(3, broadcastUserInfo2.conversation_type) + broadcastUserInfo2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, BroadcastUserInfo broadcastUserInfo) {
            BroadcastUserInfo broadcastUserInfo2 = broadcastUserInfo;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, broadcastUserInfo2.conversation_short_id);
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 2, broadcastUserInfo2.counter);
            protoAdapter.encodeWithTag(protoWriter, 3, broadcastUserInfo2.conversation_type);
            protoWriter.writeBytes(broadcastUserInfo2.unknownFields());
        }
    };
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Integer DEFAULT_COUNTER = 0;
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;

    @Override // com.squareup.wire.Message
    public C1CSY newBuilder() {
        C1CSY c1csy = new C1CSY();
        c1csy.LIZLLL = this.conversation_short_id;
        c1csy.LJ = this.counter;
        c1csy.LJFF = this.conversation_type;
        c1csy.addUnknownFields(unknownFields());
        return c1csy;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.conversation_short_id != null) {
            sb.append(", conversation_short_id=");
            sb.append(this.conversation_short_id);
        }
        if (this.counter != null) {
            sb.append(", counter=");
            sb.append(this.counter);
        }
        if (this.conversation_type != null) {
            sb.append(", conversation_type=");
            sb.append(this.conversation_type);
        }
        sb.replace(0, 2, "BroadcastUserInfo{");
        sb.append('}');
        return sb.toString();
    }

    public BroadcastUserInfo(Long l, Integer num, Integer num2) {
        this(l, num, num2, ByteString.EMPTY);
    }

    public BroadcastUserInfo(Long l, Integer num, Integer num2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_short_id = l;
        this.counter = num;
        this.conversation_type = num2;
    }
}
