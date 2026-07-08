package com.bytedance.im.core.proto;

import X.C09CT;
import X.C1516540pZE;
import X.C868010Y3j;
import com.bytedance.im.core.proto.UpsertConversationCoreExtInfoRequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class UpsertConversationCoreExtInfoRequestBody extends Message<UpsertConversationCoreExtInfoRequestBody, C868010Y3j> {
    public static final ProtoAdapter<UpsertConversationCoreExtInfoRequestBody> ADAPTER = new ProtoAdapter<UpsertConversationCoreExtInfoRequestBody>() { // from class: X.0Y3k
        public final ProtoAdapter<Map<String, String>> LIZ;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.LIZ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final UpsertConversationCoreExtInfoRequestBody decode(ProtoReader protoReader) {
            C868010Y3j c868010Y3j = new C868010Y3j();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                    c868010Y3j.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                } else {
                                    c868010Y3j.LJI.putAll(this.LIZ.decode(protoReader));
                                }
                            } else {
                                c868010Y3j.LJFF = ProtoAdapter.INT32.decode(protoReader);
                            }
                        } else {
                            c868010Y3j.LJ = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c868010Y3j.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c868010Y3j.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(UpsertConversationCoreExtInfoRequestBody upsertConversationCoreExtInfoRequestBody) {
            UpsertConversationCoreExtInfoRequestBody upsertConversationCoreExtInfoRequestBody2 = upsertConversationCoreExtInfoRequestBody;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, upsertConversationCoreExtInfoRequestBody2.conversation_id) + ProtoAdapter.INT64.encodedSizeWithTag(2, upsertConversationCoreExtInfoRequestBody2.conversation_short_id) + ProtoAdapter.INT32.encodedSizeWithTag(3, upsertConversationCoreExtInfoRequestBody2.conversation_type) + this.LIZ.encodedSizeWithTag(4, upsertConversationCoreExtInfoRequestBody2.ext) + upsertConversationCoreExtInfoRequestBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, UpsertConversationCoreExtInfoRequestBody upsertConversationCoreExtInfoRequestBody) {
            UpsertConversationCoreExtInfoRequestBody upsertConversationCoreExtInfoRequestBody2 = upsertConversationCoreExtInfoRequestBody;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, upsertConversationCoreExtInfoRequestBody2.conversation_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, upsertConversationCoreExtInfoRequestBody2.conversation_short_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, upsertConversationCoreExtInfoRequestBody2.conversation_type);
            this.LIZ.encodeWithTag(protoWriter, 4, upsertConversationCoreExtInfoRequestBody2.ext);
            protoWriter.writeBytes(upsertConversationCoreExtInfoRequestBody2.unknownFields());
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
    public C868010Y3j newBuilder() {
        C868010Y3j c868010Y3j = new C868010Y3j();
        c868010Y3j.LIZLLL = this.conversation_id;
        c868010Y3j.LJ = this.conversation_short_id;
        c868010Y3j.LJFF = this.conversation_type;
        c868010Y3j.LJI = C1516540pZE.LIZLLL("ext", this.ext);
        c868010Y3j.addUnknownFields(unknownFields());
        return c868010Y3j;
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
        sb.replace(0, 2, "UpsertConversationCoreExtInfoRequestBody{");
        sb.append('}');
        return sb.toString();
    }

    public UpsertConversationCoreExtInfoRequestBody(String str, Long l, Integer num, Map<String, String> map) {
        this(str, l, num, map, ByteString.EMPTY);
    }

    public UpsertConversationCoreExtInfoRequestBody(String str, Long l, Integer num, Map<String, String> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_id = str;
        this.conversation_short_id = l;
        this.conversation_type = num;
        this.ext = C1516540pZE.LJI("ext", map);
    }
}
