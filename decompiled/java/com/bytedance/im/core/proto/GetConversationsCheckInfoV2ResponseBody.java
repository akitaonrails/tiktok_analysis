package com.bytedance.im.core.proto;

import X.C09CT;
import X.C0YRQ;
import X.C1516540pZE;
import com.bytedance.im.core.proto.ConversationCheckInfoV2;
import com.bytedance.im.core.proto.GetConversationsCheckInfoV2ResponseBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class GetConversationsCheckInfoV2ResponseBody extends Message<GetConversationsCheckInfoV2ResponseBody, C0YRQ> {
    public static final ProtoAdapter<GetConversationsCheckInfoV2ResponseBody> ADAPTER = new ProtoAdapter<GetConversationsCheckInfoV2ResponseBody>() { // from class: X.0YRP
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final GetConversationsCheckInfoV2ResponseBody decode(ProtoReader protoReader) {
            C0YRQ c0yrq = new C0YRQ();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c0yrq.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c0yrq.LJFF = ProtoAdapter.BOOL.decode(protoReader);
                            }
                        } else {
                            c0yrq.LJ = ProtoAdapter.BOOL.decode(protoReader);
                        }
                    } else {
                        c0yrq.LIZLLL.add(ConversationCheckInfoV2.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c0yrq.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(GetConversationsCheckInfoV2ResponseBody getConversationsCheckInfoV2ResponseBody) {
            GetConversationsCheckInfoV2ResponseBody getConversationsCheckInfoV2ResponseBody2 = getConversationsCheckInfoV2ResponseBody;
            int iEncodedSizeWithTag = ConversationCheckInfoV2.ADAPTER.asRepeated().encodedSizeWithTag(1, getConversationsCheckInfoV2ResponseBody2.conv_list);
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, getConversationsCheckInfoV2ResponseBody2.is_demoted) + protoAdapter.encodedSizeWithTag(3, getConversationsCheckInfoV2ResponseBody2.is_pinned_included) + getConversationsCheckInfoV2ResponseBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, GetConversationsCheckInfoV2ResponseBody getConversationsCheckInfoV2ResponseBody) {
            GetConversationsCheckInfoV2ResponseBody getConversationsCheckInfoV2ResponseBody2 = getConversationsCheckInfoV2ResponseBody;
            ConversationCheckInfoV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getConversationsCheckInfoV2ResponseBody2.conv_list);
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            protoAdapter.encodeWithTag(protoWriter, 2, getConversationsCheckInfoV2ResponseBody2.is_demoted);
            protoAdapter.encodeWithTag(protoWriter, 3, getConversationsCheckInfoV2ResponseBody2.is_pinned_included);
            protoWriter.writeBytes(getConversationsCheckInfoV2ResponseBody2.unknownFields());
        }
    };
    public static final Boolean DEFAULT_IS_DEMOTED;
    public static final Boolean DEFAULT_IS_PINNED_INCLUDED;
    public static final long serialVersionUID = 0;

    @C09CT("conv_list")
    public final List<ConversationCheckInfoV2> conv_list;

    @C09CT("is_demoted")
    public final Boolean is_demoted;

    @C09CT("is_pinned_included")
    public final Boolean is_pinned_included;

    static {
        Boolean bool = Boolean.FALSE;
        DEFAULT_IS_DEMOTED = bool;
        DEFAULT_IS_PINNED_INCLUDED = bool;
    }

    @Override // com.squareup.wire.Message
    public C0YRQ newBuilder() {
        C0YRQ c0yrq = new C0YRQ();
        c0yrq.LIZLLL = C1516540pZE.LIZJ("conv_list", this.conv_list);
        c0yrq.LJ = this.is_demoted;
        c0yrq.LJFF = this.is_pinned_included;
        c0yrq.addUnknownFields(unknownFields());
        return c0yrq;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<ConversationCheckInfoV2> list = this.conv_list;
        if (list != null && !list.isEmpty()) {
            sb.append(", conv_list=");
            sb.append(this.conv_list);
        }
        if (this.is_demoted != null) {
            sb.append(", is_demoted=");
            sb.append(this.is_demoted);
        }
        if (this.is_pinned_included != null) {
            sb.append(", is_pinned_included=");
            sb.append(this.is_pinned_included);
        }
        sb.replace(0, 2, "GetConversationsCheckInfoV2ResponseBody{");
        sb.append('}');
        return sb.toString();
    }

    public GetConversationsCheckInfoV2ResponseBody(List<ConversationCheckInfoV2> list, Boolean bool, Boolean bool2) {
        this(list, bool, bool2, ByteString.EMPTY);
    }

    public GetConversationsCheckInfoV2ResponseBody(List<ConversationCheckInfoV2> list, Boolean bool, Boolean bool2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conv_list = C1516540pZE.LJFF("conv_list", list);
        this.is_demoted = bool;
        this.is_pinned_included = bool2;
    }
}
