package com.bytedance.im.core.proto;

import X.C09CT;
import X.C1516540pZE;
import X.C868030Y3l;
import com.bytedance.im.core.proto.UpsertConversationSettingExtInfoRequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class UpsertConversationSettingExtInfoRequestBody extends Message<UpsertConversationSettingExtInfoRequestBody, C868030Y3l> {
    public static final ProtoAdapter<UpsertConversationSettingExtInfoRequestBody> ADAPTER = new ProtoAdapter<UpsertConversationSettingExtInfoRequestBody>() { // from class: X.0Y3m
        public final ProtoAdapter<Map<String, String>> LIZ;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.LIZ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final UpsertConversationSettingExtInfoRequestBody decode(ProtoReader protoReader) {
            C868030Y3l c868030Y3l = new C868030Y3l();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                    c868030Y3l.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                } else {
                                    c868030Y3l.LJI.putAll(this.LIZ.decode(protoReader));
                                }
                            } else {
                                c868030Y3l.LJFF = ProtoAdapter.INT32.decode(protoReader);
                            }
                        } else {
                            c868030Y3l.LJ = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c868030Y3l.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c868030Y3l.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(UpsertConversationSettingExtInfoRequestBody upsertConversationSettingExtInfoRequestBody) {
            UpsertConversationSettingExtInfoRequestBody upsertConversationSettingExtInfoRequestBody2 = upsertConversationSettingExtInfoRequestBody;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, upsertConversationSettingExtInfoRequestBody2.conversation_id) + ProtoAdapter.INT64.encodedSizeWithTag(2, upsertConversationSettingExtInfoRequestBody2.conversation_short_id) + ProtoAdapter.INT32.encodedSizeWithTag(3, upsertConversationSettingExtInfoRequestBody2.conversation_type) + this.LIZ.encodedSizeWithTag(4, upsertConversationSettingExtInfoRequestBody2.ext) + upsertConversationSettingExtInfoRequestBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, UpsertConversationSettingExtInfoRequestBody upsertConversationSettingExtInfoRequestBody) {
            UpsertConversationSettingExtInfoRequestBody upsertConversationSettingExtInfoRequestBody2 = upsertConversationSettingExtInfoRequestBody;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, upsertConversationSettingExtInfoRequestBody2.conversation_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, upsertConversationSettingExtInfoRequestBody2.conversation_short_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, upsertConversationSettingExtInfoRequestBody2.conversation_type);
            this.LIZ.encodeWithTag(protoWriter, 4, upsertConversationSettingExtInfoRequestBody2.ext);
            protoWriter.writeBytes(upsertConversationSettingExtInfoRequestBody2.unknownFields());
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
    public C868030Y3l newBuilder() {
        C868030Y3l c868030Y3l = new C868030Y3l();
        c868030Y3l.LIZLLL = this.conversation_id;
        c868030Y3l.LJ = this.conversation_short_id;
        c868030Y3l.LJFF = this.conversation_type;
        c868030Y3l.LJI = C1516540pZE.LIZLLL("ext", this.ext);
        c868030Y3l.addUnknownFields(unknownFields());
        return c868030Y3l;
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
        sb.replace(0, 2, "UpsertConversationSettingExtInfoRequestBody{");
        sb.append('}');
        return sb.toString();
    }

    public UpsertConversationSettingExtInfoRequestBody(String str, Long l, Integer num, Map<String, String> map) {
        this(str, l, num, map, ByteString.EMPTY);
    }

    public UpsertConversationSettingExtInfoRequestBody(String str, Long l, Integer num, Map<String, String> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_id = str;
        this.conversation_short_id = l;
        this.conversation_type = num;
        this.ext = C1516540pZE.LJI("ext", map);
    }
}
