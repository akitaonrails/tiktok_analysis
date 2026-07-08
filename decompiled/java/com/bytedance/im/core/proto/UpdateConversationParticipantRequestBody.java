package com.bytedance.im.core.proto;

import X.C09CT;
import X.C0Y12;
import X.C1516540pZE;
import com.bytedance.im.core.proto.UpdateConversationParticipantRequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class UpdateConversationParticipantRequestBody extends Message<UpdateConversationParticipantRequestBody, C0Y12> {
    public static final long serialVersionUID = 0;

    @C09CT("alias")
    public final String alias;

    @C09CT("biz_ext")
    public final Map<String, String> biz_ext;

    @C09CT("biz_role")
    public final String biz_role;

    @C09CT("conversation_id")
    public final String conversation_id;

    @C09CT("conversation_short_id")
    public final Long conversation_short_id;

    @C09CT("conversation_type")
    public final Integer conversation_type;

    @C09CT("is_alias_set")
    public final Boolean is_alias_set;

    @C09CT("role")
    public final Integer role;

    @C09CT("user_id")
    public final Long user_id;
    public static final ProtoAdapter<UpdateConversationParticipantRequestBody> ADAPTER = new ProtoAdapter<UpdateConversationParticipantRequestBody>() { // from class: X.0Y2n
        public final ProtoAdapter<Map<String, String>> LIZ;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.LIZ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final UpdateConversationParticipantRequestBody decode(ProtoReader protoReader) {
            C0Y12 c0y12 = new C0Y12();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 11) {
                        switch (iNextTag) {
                            case 1:
                                c0y12.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 2:
                                c0y12.LJ = ProtoAdapter.INT64.decode(protoReader);
                                break;
                            case 3:
                                c0y12.LJFF = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case 4:
                                c0y12.LJI = ProtoAdapter.INT64.decode(protoReader);
                                break;
                            case 5:
                                c0y12.LJII = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case 6:
                                c0y12.LJIIIIZZ = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 7:
                                c0y12.LJIIIZ = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 8:
                                c0y12.LJIIJ = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            default:
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c0y12.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                        }
                    } else {
                        c0y12.LJIIJJI.putAll(this.LIZ.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c0y12.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(UpdateConversationParticipantRequestBody updateConversationParticipantRequestBody) {
            UpdateConversationParticipantRequestBody updateConversationParticipantRequestBody2 = updateConversationParticipantRequestBody;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, updateConversationParticipantRequestBody2.conversation_id);
            ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, updateConversationParticipantRequestBody2.conversation_short_id);
            ProtoAdapter<Integer> protoAdapter3 = ProtoAdapter.INT32;
            return iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(3, updateConversationParticipantRequestBody2.conversation_type) + protoAdapter2.encodedSizeWithTag(4, updateConversationParticipantRequestBody2.user_id) + protoAdapter3.encodedSizeWithTag(5, updateConversationParticipantRequestBody2.role) + protoAdapter.encodedSizeWithTag(6, updateConversationParticipantRequestBody2.alias) + ProtoAdapter.BOOL.encodedSizeWithTag(7, updateConversationParticipantRequestBody2.is_alias_set) + protoAdapter.encodedSizeWithTag(8, updateConversationParticipantRequestBody2.biz_role) + this.LIZ.encodedSizeWithTag(11, updateConversationParticipantRequestBody2.biz_ext) + updateConversationParticipantRequestBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, UpdateConversationParticipantRequestBody updateConversationParticipantRequestBody) {
            UpdateConversationParticipantRequestBody updateConversationParticipantRequestBody2 = updateConversationParticipantRequestBody;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, updateConversationParticipantRequestBody2.conversation_id);
            ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
            protoAdapter2.encodeWithTag(protoWriter, 2, updateConversationParticipantRequestBody2.conversation_short_id);
            ProtoAdapter<Integer> protoAdapter3 = ProtoAdapter.INT32;
            protoAdapter3.encodeWithTag(protoWriter, 3, updateConversationParticipantRequestBody2.conversation_type);
            protoAdapter2.encodeWithTag(protoWriter, 4, updateConversationParticipantRequestBody2.user_id);
            protoAdapter3.encodeWithTag(protoWriter, 5, updateConversationParticipantRequestBody2.role);
            protoAdapter.encodeWithTag(protoWriter, 6, updateConversationParticipantRequestBody2.alias);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, updateConversationParticipantRequestBody2.is_alias_set);
            protoAdapter.encodeWithTag(protoWriter, 8, updateConversationParticipantRequestBody2.biz_role);
            this.LIZ.encodeWithTag(protoWriter, 11, updateConversationParticipantRequestBody2.biz_ext);
            protoWriter.writeBytes(updateConversationParticipantRequestBody2.unknownFields());
        }
    };
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final Long DEFAULT_USER_ID = 0L;
    public static final Integer DEFAULT_ROLE = 0;
    public static final Boolean DEFAULT_IS_ALIAS_SET = Boolean.FALSE;

    @Override // com.squareup.wire.Message
    public C0Y12 newBuilder() {
        C0Y12 c0y12 = new C0Y12();
        c0y12.LIZLLL = this.conversation_id;
        c0y12.LJ = this.conversation_short_id;
        c0y12.LJFF = this.conversation_type;
        c0y12.LJI = this.user_id;
        c0y12.LJII = this.role;
        c0y12.LJIIIIZZ = this.alias;
        c0y12.LJIIIZ = this.is_alias_set;
        c0y12.LJIIJ = this.biz_role;
        c0y12.LJIIJJI = C1516540pZE.LIZLLL("biz_ext", this.biz_ext);
        c0y12.addUnknownFields(unknownFields());
        return c0y12;
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
        if (this.user_id != null) {
            sb.append(", user_id=");
            sb.append(this.user_id);
        }
        if (this.role != null) {
            sb.append(", role=");
            sb.append(this.role);
        }
        if (this.alias != null) {
            sb.append(", alias=");
            sb.append(this.alias);
        }
        if (this.is_alias_set != null) {
            sb.append(", is_alias_set=");
            sb.append(this.is_alias_set);
        }
        if (this.biz_role != null) {
            sb.append(", biz_role=");
            sb.append(this.biz_role);
        }
        Map<String, String> map = this.biz_ext;
        if (map != null && !map.isEmpty()) {
            sb.append(", biz_ext=");
            sb.append(this.biz_ext);
        }
        sb.replace(0, 2, "UpdateConversationParticipantRequestBody{");
        sb.append('}');
        return sb.toString();
    }

    public UpdateConversationParticipantRequestBody(String str, Long l, Integer num, Long l2, Integer num2, String str2, Boolean bool, String str3, Map<String, String> map) {
        this(str, l, num, l2, num2, str2, bool, str3, map, ByteString.EMPTY);
    }

    public UpdateConversationParticipantRequestBody(String str, Long l, Integer num, Long l2, Integer num2, String str2, Boolean bool, String str3, Map<String, String> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_id = str;
        this.conversation_short_id = l;
        this.conversation_type = num;
        this.user_id = l2;
        this.role = num2;
        this.alias = str2;
        this.is_alias_set = bool;
        this.biz_role = str3;
        this.biz_ext = C1516540pZE.LJI("biz_ext", map);
    }
}
