package com.bytedance.im.core.proto;

import X.C09CT;
import X.C873180YNg;
import com.bytedance.im.core.proto.PrefetchConversationIdRequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class PrefetchConversationIdRequestBody extends Message<PrefetchConversationIdRequestBody, C873180YNg> {
    public static final ProtoAdapter<PrefetchConversationIdRequestBody> ADAPTER = new ProtoAdapter<PrefetchConversationIdRequestBody>() { // from class: X.0YNh
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final PrefetchConversationIdRequestBody decode(ProtoReader protoReader) {
            C873180YNg c873180YNg = new C873180YNg();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c873180YNg.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c873180YNg.LIZLLL = ProtoAdapter.BOOL.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c873180YNg.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(PrefetchConversationIdRequestBody prefetchConversationIdRequestBody) {
            PrefetchConversationIdRequestBody prefetchConversationIdRequestBody2 = prefetchConversationIdRequestBody;
            return ProtoAdapter.BOOL.encodedSizeWithTag(1, prefetchConversationIdRequestBody2.need_ids) + prefetchConversationIdRequestBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, PrefetchConversationIdRequestBody prefetchConversationIdRequestBody) {
            PrefetchConversationIdRequestBody prefetchConversationIdRequestBody2 = prefetchConversationIdRequestBody;
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, prefetchConversationIdRequestBody2.need_ids);
            protoWriter.writeBytes(prefetchConversationIdRequestBody2.unknownFields());
        }
    };
    public static final Boolean DEFAULT_NEED_IDS = Boolean.FALSE;
    public static final long serialVersionUID = 0;

    @C09CT("need_ids")
    public final Boolean need_ids;

    @Override // com.squareup.wire.Message
    public C873180YNg newBuilder() {
        C873180YNg c873180YNg = new C873180YNg();
        c873180YNg.LIZLLL = this.need_ids;
        c873180YNg.addUnknownFields(unknownFields());
        return c873180YNg;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.need_ids != null) {
            sb.append(", need_ids=");
            sb.append(this.need_ids);
        }
        sb.replace(0, 2, "PrefetchConversationIdRequestBody{");
        sb.append('}');
        return sb.toString();
    }

    public PrefetchConversationIdRequestBody(Boolean bool) {
        this(bool, ByteString.EMPTY);
    }

    public PrefetchConversationIdRequestBody(Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.need_ids = bool;
    }
}
