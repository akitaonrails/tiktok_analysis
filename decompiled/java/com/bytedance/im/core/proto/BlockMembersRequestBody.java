package com.bytedance.im.core.proto;

import X.C09CT;
import X.C1516540pZE;
import X.C1DBI;
import X.EnumC868560Y5m;
import com.bytedance.im.core.proto.BlockMembersRequestBody;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: loaded from: classes36.dex */
public final class BlockMembersRequestBody extends Message<BlockMembersRequestBody, C1DBI> {
    public static final long serialVersionUID = 0;

    @C09CT("biz_ext")
    public final Map<String, String> biz_ext;

    @C09CT("block_status")
    public final EnumC868560Y5m block_status;

    @C09CT("block_time")
    public final Map<Long, Long> block_time;

    @C09CT("conv_short_id")
    public final Long conv_short_id;

    @C09CT("conversation_id")
    public final String conversation_id;

    @C09CT("conversation_type")
    public final Integer conversation_type;
    public static final ProtoAdapter<BlockMembersRequestBody> ADAPTER = new ProtoAdapter<BlockMembersRequestBody>() { // from class: X.1DBH
        public final ProtoAdapter<Map<Long, Long>> LIZ;
        public final ProtoAdapter<Map<String, String>> LIZIZ;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            this.LIZ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            this.LIZIZ = ProtoAdapter.newMapAdapter(protoAdapter2, protoAdapter2);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final BlockMembersRequestBody decode(ProtoReader protoReader) {
            C1DBI c1dbi = new C1DBI();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    if (iNextTag != 5) {
                                        if (iNextTag != 11) {
                                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                            c1dbi.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                        } else {
                                            c1dbi.LJIIIIZZ.putAll(this.LIZIZ.decode(protoReader));
                                        }
                                    } else {
                                        c1dbi.LJII = ProtoAdapter.STRING.decode(protoReader);
                                    }
                                } else {
                                    c1dbi.LJI = ProtoAdapter.INT32.decode(protoReader);
                                }
                            } else {
                                c1dbi.LJFF = ProtoAdapter.INT64.decode(protoReader);
                            }
                        } else {
                            c1dbi.LJ.putAll(this.LIZ.decode(protoReader));
                        }
                    } else {
                        try {
                            c1dbi.LIZLLL = EnumC868560Y5m.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            TryCatchGuardChecker.doCheck(e);
                            c1dbi.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1dbi.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(BlockMembersRequestBody blockMembersRequestBody) {
            BlockMembersRequestBody blockMembersRequestBody2 = blockMembersRequestBody;
            return EnumC868560Y5m.ADAPTER.encodedSizeWithTag(1, blockMembersRequestBody2.block_status) + this.LIZ.encodedSizeWithTag(2, blockMembersRequestBody2.block_time) + ProtoAdapter.INT64.encodedSizeWithTag(3, blockMembersRequestBody2.conv_short_id) + ProtoAdapter.INT32.encodedSizeWithTag(4, blockMembersRequestBody2.conversation_type) + ProtoAdapter.STRING.encodedSizeWithTag(5, blockMembersRequestBody2.conversation_id) + this.LIZIZ.encodedSizeWithTag(11, blockMembersRequestBody2.biz_ext) + blockMembersRequestBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, BlockMembersRequestBody blockMembersRequestBody) {
            BlockMembersRequestBody blockMembersRequestBody2 = blockMembersRequestBody;
            EnumC868560Y5m.ADAPTER.encodeWithTag(protoWriter, 1, blockMembersRequestBody2.block_status);
            this.LIZ.encodeWithTag(protoWriter, 2, blockMembersRequestBody2.block_time);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, blockMembersRequestBody2.conv_short_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, blockMembersRequestBody2.conversation_type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, blockMembersRequestBody2.conversation_id);
            this.LIZIZ.encodeWithTag(protoWriter, 11, blockMembersRequestBody2.biz_ext);
            protoWriter.writeBytes(blockMembersRequestBody2.unknownFields());
        }
    };
    public static final EnumC868560Y5m DEFAULT_BLOCK_STATUS = EnumC868560Y5m.UNBLOCK;
    public static final Long DEFAULT_CONV_SHORT_ID = 0L;
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;

    @Override // com.squareup.wire.Message
    public C1DBI newBuilder() {
        C1DBI c1dbi = new C1DBI();
        c1dbi.LIZLLL = this.block_status;
        c1dbi.LJ = C1516540pZE.LIZLLL("block_time", this.block_time);
        c1dbi.LJFF = this.conv_short_id;
        c1dbi.LJI = this.conversation_type;
        c1dbi.LJII = this.conversation_id;
        c1dbi.LJIIIIZZ = C1516540pZE.LIZLLL("biz_ext", this.biz_ext);
        c1dbi.addUnknownFields(unknownFields());
        return c1dbi;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.block_status != null) {
            sb.append(", block_status=");
            sb.append(this.block_status);
        }
        Map<Long, Long> map = this.block_time;
        if (map != null && !map.isEmpty()) {
            sb.append(", block_time=");
            sb.append(this.block_time);
        }
        if (this.conv_short_id != null) {
            sb.append(", conv_short_id=");
            sb.append(this.conv_short_id);
        }
        if (this.conversation_type != null) {
            sb.append(", conversation_type=");
            sb.append(this.conversation_type);
        }
        if (this.conversation_id != null) {
            sb.append(", conversation_id=");
            sb.append(this.conversation_id);
        }
        Map<String, String> map2 = this.biz_ext;
        if (map2 != null && !map2.isEmpty()) {
            sb.append(", biz_ext=");
            sb.append(this.biz_ext);
        }
        sb.replace(0, 2, "BlockMembersRequestBody{");
        sb.append('}');
        return sb.toString();
    }

    public BlockMembersRequestBody(EnumC868560Y5m enumC868560Y5m, Map<Long, Long> map, Long l, Integer num, String str, Map<String, String> map2) {
        this(enumC868560Y5m, map, l, num, str, map2, ByteString.EMPTY);
    }

    public BlockMembersRequestBody(EnumC868560Y5m enumC868560Y5m, Map<Long, Long> map, Long l, Integer num, String str, Map<String, String> map2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.block_status = enumC868560Y5m;
        this.block_time = C1516540pZE.LJI("block_time", map);
        this.conv_short_id = l;
        this.conversation_type = num;
        this.conversation_id = str;
        this.biz_ext = C1516540pZE.LJI("biz_ext", map2);
    }
}
