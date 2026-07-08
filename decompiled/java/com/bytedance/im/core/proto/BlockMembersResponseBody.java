package com.bytedance.im.core.proto;

import X.C09CT;
import X.C1516540pZE;
import X.C2224801C5u;
import com.bytedance.im.core.proto.BlockMembersResponseBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class BlockMembersResponseBody extends Message<BlockMembersResponseBody, C2224801C5u> {
    public static final ProtoAdapter<BlockMembersResponseBody> ADAPTER = new ProtoAdapter<BlockMembersResponseBody>() { // from class: X.1C5t
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final BlockMembersResponseBody decode(ProtoReader protoReader) {
            C2224801C5u c2224801C5u = new C2224801C5u();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c2224801C5u.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c2224801C5u.LIZLLL.add(ProtoAdapter.INT64.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2224801C5u.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(BlockMembersResponseBody blockMembersResponseBody) {
            BlockMembersResponseBody blockMembersResponseBody2 = blockMembersResponseBody;
            return ProtoAdapter.INT64.asRepeated().encodedSizeWithTag(1, blockMembersResponseBody2.failed_members) + blockMembersResponseBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, BlockMembersResponseBody blockMembersResponseBody) {
            BlockMembersResponseBody blockMembersResponseBody2 = blockMembersResponseBody;
            ProtoAdapter.INT64.asRepeated().encodeWithTag(protoWriter, 1, blockMembersResponseBody2.failed_members);
            protoWriter.writeBytes(blockMembersResponseBody2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @C09CT("failed_members")
    public final List<Long> failed_members;

    @Override // com.squareup.wire.Message
    public C2224801C5u newBuilder() {
        C2224801C5u c2224801C5u = new C2224801C5u();
        c2224801C5u.LIZLLL = C1516540pZE.LIZJ("failed_members", this.failed_members);
        c2224801C5u.addUnknownFields(unknownFields());
        return c2224801C5u;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<Long> list = this.failed_members;
        if (list != null && !list.isEmpty()) {
            sb.append(", failed_members=");
            sb.append(this.failed_members);
        }
        sb.replace(0, 2, "BlockMembersResponseBody{");
        sb.append('}');
        return sb.toString();
    }

    public BlockMembersResponseBody(List<Long> list) {
        this(list, ByteString.EMPTY);
    }

    public BlockMembersResponseBody(List<Long> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.failed_members = C1516540pZE.LJFF("failed_members", list);
    }
}
