package com.bytedance.im.core.proto;

import X.C09CT;
import X.C873070YMv;
import com.bytedance.im.core.proto.MessageRange;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class MessageRange extends Message<MessageRange, C873070YMv> {
    public static final long serialVersionUID = 0;

    @C09CT("max_conv_index")
    public final Long max_conv_index;

    @C09CT("max_region")
    public final String max_region;

    @C09CT("min_conv_index")
    public final Long min_conv_index;

    @C09CT("min_region")
    public final String min_region;
    public static final ProtoAdapter<MessageRange> ADAPTER = new ProtoAdapter<MessageRange>() { // from class: X.0YMp
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final MessageRange decode(ProtoReader protoReader) {
            C873070YMv c873070YMv = new C873070YMv();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                    c873070YMv.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                } else {
                                    c873070YMv.LJI = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c873070YMv.LJFF = ProtoAdapter.INT64.decode(protoReader);
                            }
                        } else {
                            c873070YMv.LJ = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c873070YMv.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c873070YMv.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(MessageRange messageRange) {
            MessageRange messageRange2 = messageRange;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, messageRange2.min_conv_index);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, messageRange2.min_region) + protoAdapter.encodedSizeWithTag(3, messageRange2.max_conv_index) + protoAdapter2.encodedSizeWithTag(4, messageRange2.max_region) + messageRange2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, MessageRange messageRange) {
            MessageRange messageRange2 = messageRange;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, messageRange2.min_conv_index);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            protoAdapter2.encodeWithTag(protoWriter, 2, messageRange2.min_region);
            protoAdapter.encodeWithTag(protoWriter, 3, messageRange2.max_conv_index);
            protoAdapter2.encodeWithTag(protoWriter, 4, messageRange2.max_region);
            protoWriter.writeBytes(messageRange2.unknownFields());
        }
    };
    public static final Long DEFAULT_MIN_CONV_INDEX = 0L;
    public static final Long DEFAULT_MAX_CONV_INDEX = 0L;

    @Override // com.squareup.wire.Message
    public C873070YMv newBuilder() {
        C873070YMv c873070YMv = new C873070YMv();
        c873070YMv.LIZLLL = this.min_conv_index;
        c873070YMv.LJ = this.min_region;
        c873070YMv.LJFF = this.max_conv_index;
        c873070YMv.LJI = this.max_region;
        c873070YMv.addUnknownFields(unknownFields());
        return c873070YMv;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.min_conv_index != null) {
            sb.append(", min_conv_index=");
            sb.append(this.min_conv_index);
        }
        if (this.min_region != null) {
            sb.append(", min_region=");
            sb.append(this.min_region);
        }
        if (this.max_conv_index != null) {
            sb.append(", max_conv_index=");
            sb.append(this.max_conv_index);
        }
        if (this.max_region != null) {
            sb.append(", max_region=");
            sb.append(this.max_region);
        }
        sb.replace(0, 2, "MessageRange{");
        sb.append('}');
        return sb.toString();
    }

    public MessageRange(Long l, String str, Long l2, String str2) {
        this(l, str, l2, str2, ByteString.EMPTY);
    }

    public MessageRange(Long l, String str, Long l2, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.min_conv_index = l;
        this.min_region = str;
        this.max_conv_index = l2;
        this.max_region = str2;
    }
}
