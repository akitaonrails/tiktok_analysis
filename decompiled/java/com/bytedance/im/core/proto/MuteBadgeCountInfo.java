package com.bytedance.im.core.proto;

import X.C09CT;
import X.C1CBV;
import X.EnumC19361710ox;
import com.bytedance.im.core.proto.MuteBadgeCountInfo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class MuteBadgeCountInfo extends Message<MuteBadgeCountInfo, C1CBV> {
    public static final long serialVersionUID = 0;

    @C09CT("badge_count")
    public final Integer badge_count;

    @C09CT("message_type")
    public final EnumC19361710ox message_type;
    public static final ProtoAdapter<MuteBadgeCountInfo> ADAPTER = new ProtoAdapter<MuteBadgeCountInfo>() { // from class: X.1CBU
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final MuteBadgeCountInfo decode(ProtoReader protoReader) {
            C1CBV c1cbv = new C1CBV();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1cbv.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c1cbv.LJ = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        try {
                            c1cbv.LIZLLL = EnumC19361710ox.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            TryCatchGuardChecker.doCheck(e);
                            c1cbv.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cbv.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(MuteBadgeCountInfo muteBadgeCountInfo) {
            MuteBadgeCountInfo muteBadgeCountInfo2 = muteBadgeCountInfo;
            return EnumC19361710ox.ADAPTER.encodedSizeWithTag(1, muteBadgeCountInfo2.message_type) + ProtoAdapter.INT32.encodedSizeWithTag(2, muteBadgeCountInfo2.badge_count) + muteBadgeCountInfo2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, MuteBadgeCountInfo muteBadgeCountInfo) {
            MuteBadgeCountInfo muteBadgeCountInfo2 = muteBadgeCountInfo;
            EnumC19361710ox.ADAPTER.encodeWithTag(protoWriter, 1, muteBadgeCountInfo2.message_type);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, muteBadgeCountInfo2.badge_count);
            protoWriter.writeBytes(muteBadgeCountInfo2.unknownFields());
        }
    };
    public static final EnumC19361710ox DEFAULT_MESSAGE_TYPE = EnumC19361710ox.TYPE_MENTION;
    public static final Integer DEFAULT_BADGE_COUNT = 0;

    @Override // com.squareup.wire.Message
    public C1CBV newBuilder() {
        C1CBV c1cbv = new C1CBV();
        c1cbv.LIZLLL = this.message_type;
        c1cbv.LJ = this.badge_count;
        c1cbv.addUnknownFields(unknownFields());
        return c1cbv;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", message_type=");
        sb.append(this.message_type);
        sb.append(", badge_count=");
        sb.append(this.badge_count);
        sb.replace(0, 2, "MuteBadgeCountInfo{");
        sb.append('}');
        return sb.toString();
    }

    public MuteBadgeCountInfo(EnumC19361710ox enumC19361710ox, Integer num) {
        this(enumC19361710ox, num, ByteString.EMPTY);
    }

    public MuteBadgeCountInfo(EnumC19361710ox enumC19361710ox, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.message_type = enumC19361710ox;
        this.badge_count = num;
    }
}
