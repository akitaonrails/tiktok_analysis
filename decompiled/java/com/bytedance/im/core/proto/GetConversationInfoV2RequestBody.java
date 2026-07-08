package com.bytedance.im.core.proto;

import X.C09CT;
import X.C1516540pZE;
import X.C867430Y1d;
import com.bytedance.im.core.proto.GetConversationInfoV2RequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class GetConversationInfoV2RequestBody extends Message<GetConversationInfoV2RequestBody, C867430Y1d> {
    public static final ProtoAdapter<GetConversationInfoV2RequestBody> ADAPTER = new ProtoAdapter<GetConversationInfoV2RequestBody>() { // from class: X.0Y2m
        public final ProtoAdapter<Map<String, String>> LIZ;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.LIZ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final GetConversationInfoV2RequestBody decode(ProtoReader protoReader) {
            C867430Y1d c867430Y1d = new C867430Y1d();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                    c867430Y1d.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                } else {
                                    c867430Y1d.LJI.putAll(this.LIZ.decode(protoReader));
                                }
                            } else {
                                c867430Y1d.LJFF = ProtoAdapter.INT32.decode(protoReader);
                            }
                        } else {
                            c867430Y1d.LJ = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c867430Y1d.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c867430Y1d.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(GetConversationInfoV2RequestBody getConversationInfoV2RequestBody) {
            GetConversationInfoV2RequestBody getConversationInfoV2RequestBody2 = getConversationInfoV2RequestBody;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, getConversationInfoV2RequestBody2.conversation_id) + ProtoAdapter.INT64.encodedSizeWithTag(2, getConversationInfoV2RequestBody2.conversation_short_id) + ProtoAdapter.INT32.encodedSizeWithTag(3, getConversationInfoV2RequestBody2.conversation_type) + this.LIZ.encodedSizeWithTag(4, getConversationInfoV2RequestBody2.ext) + getConversationInfoV2RequestBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, GetConversationInfoV2RequestBody getConversationInfoV2RequestBody) {
            GetConversationInfoV2RequestBody getConversationInfoV2RequestBody2 = getConversationInfoV2RequestBody;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getConversationInfoV2RequestBody2.conversation_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, getConversationInfoV2RequestBody2.conversation_short_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, getConversationInfoV2RequestBody2.conversation_type);
            this.LIZ.encodeWithTag(protoWriter, 4, getConversationInfoV2RequestBody2.ext);
            protoWriter.writeBytes(getConversationInfoV2RequestBody2.unknownFields());
        }
    };
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final long serialVersionUID = 0;

    @C09CT("conversation_id")
    public final String conversation_id;

    @C09CT("conversation_short_id")
    public final Long conversation_short_id;

    @C09CT("conversation_type")
    public final Integer conversation_type;

    @C09CT("ext")
    public final Map<String, String> ext;

    @Override // com.squareup.wire.Message
    public C867430Y1d newBuilder() {
        C867430Y1d c867430Y1d = new C867430Y1d();
        c867430Y1d.LIZLLL = this.conversation_id;
        c867430Y1d.LJ = this.conversation_short_id;
        c867430Y1d.LJFF = this.conversation_type;
        c867430Y1d.LJI = C1516540pZE.LIZLLL("ext", this.ext);
        c867430Y1d.addUnknownFields(unknownFields());
        return c867430Y1d;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.conversation_id != null) {
            sb.append(", conversation_id=");
            sb.append(this.conversation_id);
        }
        if (this.conversation_short_id != null) {
            sb.append(", conversation_short_id=");
            sb.append(this.conversation_short_id);
        }
        if (this.conversation_type != null) {
            sb.append(", conversation_type=");
            sb.append(this.conversation_type);
        }
        Map<String, String> map = this.ext;
        if (map != null && !map.isEmpty()) {
            sb.append(", ext=");
            sb.append(this.ext);
        }
        sb.replace(0, 2, "GetConversationInfoV2RequestBody{");
        sb.append('}');
        return sb.toString();
    }

    public GetConversationInfoV2RequestBody(String str, Long l, Integer num, Map<String, String> map) {
        this(str, l, num, map, ByteString.EMPTY);
    }

    public GetConversationInfoV2RequestBody(String str, Long l, Integer num, Map<String, String> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_id = str;
        this.conversation_short_id = l;
        this.conversation_type = num;
        this.ext = C1516540pZE.LJI("ext", map);
    }
}
