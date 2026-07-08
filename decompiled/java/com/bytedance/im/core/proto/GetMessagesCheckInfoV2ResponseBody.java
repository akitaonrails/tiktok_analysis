package com.bytedance.im.core.proto;

import X.C09CT;
import X.C0YW6;
import X.C1516540pZE;
import com.bytedance.im.core.proto.GetMessagesCheckInfoV2ResponseBody;
import com.bytedance.im.core.proto.MessageCheckInfoV2;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class GetMessagesCheckInfoV2ResponseBody extends Message<GetMessagesCheckInfoV2ResponseBody, C0YW6> {
    public static final ProtoAdapter<GetMessagesCheckInfoV2ResponseBody> ADAPTER = new ProtoAdapter<GetMessagesCheckInfoV2ResponseBody>() { // from class: X.0YW5
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final GetMessagesCheckInfoV2ResponseBody decode(ProtoReader protoReader) {
            C0YW6 c0yw6 = new C0YW6();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                    c0yw6.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                } else {
                                    c0yw6.LJI = ProtoAdapter.BOOL.decode(protoReader);
                                }
                            } else {
                                c0yw6.LJFF = ProtoAdapter.INT64.decode(protoReader);
                            }
                        } else {
                            c0yw6.LJ = ProtoAdapter.BOOL.decode(protoReader);
                        }
                    } else {
                        c0yw6.LIZLLL.add(MessageCheckInfoV2.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c0yw6.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(GetMessagesCheckInfoV2ResponseBody getMessagesCheckInfoV2ResponseBody) {
            GetMessagesCheckInfoV2ResponseBody getMessagesCheckInfoV2ResponseBody2 = getMessagesCheckInfoV2ResponseBody;
            int iEncodedSizeWithTag = MessageCheckInfoV2.ADAPTER.asRepeated().encodedSizeWithTag(1, getMessagesCheckInfoV2ResponseBody2.msg_list);
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, getMessagesCheckInfoV2ResponseBody2.has_more) + ProtoAdapter.INT64.encodedSizeWithTag(3, getMessagesCheckInfoV2ResponseBody2.next_cursor) + protoAdapter.encodedSizeWithTag(4, getMessagesCheckInfoV2ResponseBody2.is_demoted) + getMessagesCheckInfoV2ResponseBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, GetMessagesCheckInfoV2ResponseBody getMessagesCheckInfoV2ResponseBody) {
            GetMessagesCheckInfoV2ResponseBody getMessagesCheckInfoV2ResponseBody2 = getMessagesCheckInfoV2ResponseBody;
            MessageCheckInfoV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getMessagesCheckInfoV2ResponseBody2.msg_list);
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            protoAdapter.encodeWithTag(protoWriter, 2, getMessagesCheckInfoV2ResponseBody2.has_more);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, getMessagesCheckInfoV2ResponseBody2.next_cursor);
            protoAdapter.encodeWithTag(protoWriter, 4, getMessagesCheckInfoV2ResponseBody2.is_demoted);
            protoWriter.writeBytes(getMessagesCheckInfoV2ResponseBody2.unknownFields());
        }
    };
    public static final Boolean DEFAULT_HAS_MORE;
    public static final Boolean DEFAULT_IS_DEMOTED;
    public static final Long DEFAULT_NEXT_CURSOR;
    public static final long serialVersionUID = 0;

    @C09CT("has_more")
    public final Boolean has_more;

    @C09CT("is_demoted")
    public final Boolean is_demoted;

    @C09CT("msg_list")
    public final List<MessageCheckInfoV2> msg_list;

    @C09CT("next_cursor")
    public final Long next_cursor;

    static {
        Boolean bool = Boolean.FALSE;
        DEFAULT_HAS_MORE = bool;
        DEFAULT_NEXT_CURSOR = 0L;
        DEFAULT_IS_DEMOTED = bool;
    }

    @Override // com.squareup.wire.Message
    public C0YW6 newBuilder() {
        C0YW6 c0yw6 = new C0YW6();
        c0yw6.LIZLLL = C1516540pZE.LIZJ("msg_list", this.msg_list);
        c0yw6.LJ = this.has_more;
        c0yw6.LJFF = this.next_cursor;
        c0yw6.LJI = this.is_demoted;
        c0yw6.addUnknownFields(unknownFields());
        return c0yw6;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<MessageCheckInfoV2> list = this.msg_list;
        if (list != null && !list.isEmpty()) {
            sb.append(", msg_list=");
            sb.append(this.msg_list);
        }
        if (this.has_more != null) {
            sb.append(", has_more=");
            sb.append(this.has_more);
        }
        if (this.next_cursor != null) {
            sb.append(", next_cursor=");
            sb.append(this.next_cursor);
        }
        if (this.is_demoted != null) {
            sb.append(", is_demoted=");
            sb.append(this.is_demoted);
        }
        sb.replace(0, 2, "GetMessagesCheckInfoV2ResponseBody{");
        sb.append('}');
        return sb.toString();
    }

    public GetMessagesCheckInfoV2ResponseBody(List<MessageCheckInfoV2> list, Boolean bool, Long l, Boolean bool2) {
        this(list, bool, l, bool2, ByteString.EMPTY);
    }

    public GetMessagesCheckInfoV2ResponseBody(List<MessageCheckInfoV2> list, Boolean bool, Long l, Boolean bool2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.msg_list = C1516540pZE.LJFF("msg_list", list);
        this.has_more = bool;
        this.next_cursor = l;
        this.is_demoted = bool2;
    }
}
