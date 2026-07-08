package com.bytedance.im.core.proto;

import X.C09CT;
import X.C0Y6S;
import X.C0Y6U;
import X.C1516540pZE;
import X.EnumC869400Y8s;
import com.bytedance.im.core.proto.GetUserConversationListRequestBody;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class GetUserConversationListRequestBody extends Message<GetUserConversationListRequestBody, C0Y6S> {
    public static final Integer DEFAULT_CUSTOMED_CON_TYPE;
    public static final Boolean DEFAULT_INCLUDE_REMOVED_GROUP;
    public static final Boolean DEFAULT_WITH_COLD;
    public static final long serialVersionUID = 0;

    @C09CT("con_type")
    public final EnumC869400Y8s con_type;

    @C09CT("cursor")
    public final Long cursor;

    @C09CT("customed_con_type")
    public final Integer customed_con_type;

    @C09CT("exclude_role")
    public final Integer exclude_role;

    @C09CT("include_multiple_roles")
    public final List<Integer> include_multiple_roles;

    @C09CT("include_removed_group")
    public final Boolean include_removed_group;

    @C09CT("include_role")
    public final Integer include_role;

    @C09CT("limit")
    public final Long limit;

    @C09CT("sort_type")
    public final C0Y6U sort_type;

    @C09CT("with_cold")
    public final Boolean with_cold;
    public static final ProtoAdapter<GetUserConversationListRequestBody> ADAPTER = new ProtoAdapter<GetUserConversationListRequestBody>() { // from class: X.0Y6T
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final GetUserConversationListRequestBody decode(ProtoReader protoReader) {
            C0Y6S c0y6s = new C0Y6S();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            try {
                                c0y6s.LIZLLL = C0Y6U.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c0y6s.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                            break;
                        case 2:
                            c0y6s.LJ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 3:
                            try {
                                c0y6s.LJFF = EnumC869400Y8s.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                TryCatchGuardChecker.doCheck(e2);
                                c0y6s.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                            }
                            break;
                        case 4:
                            c0y6s.LJI = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 5:
                            c0y6s.LJII = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 6:
                            c0y6s.LJIIIIZZ = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 7:
                            c0y6s.LJIIIZ = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 8:
                            c0y6s.LJIIJ = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c0y6s.LJIIJJI = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c0y6s.LJIIL.add(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c0y6s.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c0y6s.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(GetUserConversationListRequestBody getUserConversationListRequestBody) {
            GetUserConversationListRequestBody getUserConversationListRequestBody2 = getUserConversationListRequestBody;
            int iEncodedSizeWithTag = C0Y6U.ADAPTER.encodedSizeWithTag(1, getUserConversationListRequestBody2.sort_type);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, getUserConversationListRequestBody2.cursor) + EnumC869400Y8s.ADAPTER.encodedSizeWithTag(3, getUserConversationListRequestBody2.con_type) + protoAdapter.encodedSizeWithTag(4, getUserConversationListRequestBody2.limit);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + protoAdapter2.encodedSizeWithTag(5, getUserConversationListRequestBody2.include_role) + protoAdapter2.encodedSizeWithTag(6, getUserConversationListRequestBody2.exclude_role);
            ProtoAdapter<Boolean> protoAdapter3 = ProtoAdapter.BOOL;
            return iEncodedSizeWithTag3 + protoAdapter3.encodedSizeWithTag(7, getUserConversationListRequestBody2.include_removed_group) + protoAdapter3.encodedSizeWithTag(8, getUserConversationListRequestBody2.with_cold) + protoAdapter2.encodedSizeWithTag(9, getUserConversationListRequestBody2.customed_con_type) + protoAdapter2.asRepeated().encodedSizeWithTag(10, getUserConversationListRequestBody2.include_multiple_roles) + getUserConversationListRequestBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, GetUserConversationListRequestBody getUserConversationListRequestBody) {
            GetUserConversationListRequestBody getUserConversationListRequestBody2 = getUserConversationListRequestBody;
            C0Y6U.ADAPTER.encodeWithTag(protoWriter, 1, getUserConversationListRequestBody2.sort_type);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 2, getUserConversationListRequestBody2.cursor);
            EnumC869400Y8s.ADAPTER.encodeWithTag(protoWriter, 3, getUserConversationListRequestBody2.con_type);
            protoAdapter.encodeWithTag(protoWriter, 4, getUserConversationListRequestBody2.limit);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            protoAdapter2.encodeWithTag(protoWriter, 5, getUserConversationListRequestBody2.include_role);
            protoAdapter2.encodeWithTag(protoWriter, 6, getUserConversationListRequestBody2.exclude_role);
            ProtoAdapter<Boolean> protoAdapter3 = ProtoAdapter.BOOL;
            protoAdapter3.encodeWithTag(protoWriter, 7, getUserConversationListRequestBody2.include_removed_group);
            protoAdapter3.encodeWithTag(protoWriter, 8, getUserConversationListRequestBody2.with_cold);
            protoAdapter2.encodeWithTag(protoWriter, 9, getUserConversationListRequestBody2.customed_con_type);
            protoAdapter2.asRepeated().encodeWithTag(protoWriter, 10, getUserConversationListRequestBody2.include_multiple_roles);
            protoWriter.writeBytes(getUserConversationListRequestBody2.unknownFields());
        }
    };
    public static final C0Y6U DEFAULT_SORT_TYPE = C0Y6U.JOIN_TIME;
    public static final Long DEFAULT_CURSOR = 0L;
    public static final EnumC869400Y8s DEFAULT_CON_TYPE = EnumC869400Y8s.UNKNOWN_CONV_TYPE;
    public static final Long DEFAULT_LIMIT = 0L;
    public static final Integer DEFAULT_INCLUDE_ROLE = 0;
    public static final Integer DEFAULT_EXCLUDE_ROLE = 0;

    static {
        Boolean bool = Boolean.FALSE;
        DEFAULT_INCLUDE_REMOVED_GROUP = bool;
        DEFAULT_WITH_COLD = bool;
        DEFAULT_CUSTOMED_CON_TYPE = 0;
    }

    @Override // com.squareup.wire.Message
    public C0Y6S newBuilder() {
        C0Y6S c0y6s = new C0Y6S();
        c0y6s.LIZLLL = this.sort_type;
        c0y6s.LJ = this.cursor;
        c0y6s.LJFF = this.con_type;
        c0y6s.LJI = this.limit;
        c0y6s.LJII = this.include_role;
        c0y6s.LJIIIIZZ = this.exclude_role;
        c0y6s.LJIIIZ = this.include_removed_group;
        c0y6s.LJIIJ = this.with_cold;
        c0y6s.LJIIJJI = this.customed_con_type;
        c0y6s.LJIIL = C1516540pZE.LIZJ("include_multiple_roles", this.include_multiple_roles);
        c0y6s.addUnknownFields(unknownFields());
        return c0y6s;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.sort_type != null) {
            sb.append(", sort_type=");
            sb.append(this.sort_type);
        }
        if (this.cursor != null) {
            sb.append(", cursor=");
            sb.append(this.cursor);
        }
        if (this.con_type != null) {
            sb.append(", con_type=");
            sb.append(this.con_type);
        }
        if (this.limit != null) {
            sb.append(", limit=");
            sb.append(this.limit);
        }
        if (this.include_role != null) {
            sb.append(", include_role=");
            sb.append(this.include_role);
        }
        if (this.exclude_role != null) {
            sb.append(", exclude_role=");
            sb.append(this.exclude_role);
        }
        if (this.include_removed_group != null) {
            sb.append(", include_removed_group=");
            sb.append(this.include_removed_group);
        }
        if (this.with_cold != null) {
            sb.append(", with_cold=");
            sb.append(this.with_cold);
        }
        if (this.customed_con_type != null) {
            sb.append(", customed_con_type=");
            sb.append(this.customed_con_type);
        }
        List<Integer> list = this.include_multiple_roles;
        if (list != null && !list.isEmpty()) {
            sb.append(", include_multiple_roles=");
            sb.append(this.include_multiple_roles);
        }
        sb.replace(0, 2, "GetUserConversationListRequestBody{");
        sb.append('}');
        return sb.toString();
    }

    public GetUserConversationListRequestBody(C0Y6U c0y6u, Long l, EnumC869400Y8s enumC869400Y8s, Long l2, Integer num, Integer num2, Boolean bool, Boolean bool2, Integer num3, List<Integer> list) {
        this(c0y6u, l, enumC869400Y8s, l2, num, num2, bool, bool2, num3, list, ByteString.EMPTY);
    }

    public GetUserConversationListRequestBody(C0Y6U c0y6u, Long l, EnumC869400Y8s enumC869400Y8s, Long l2, Integer num, Integer num2, Boolean bool, Boolean bool2, Integer num3, List<Integer> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.sort_type = c0y6u;
        this.cursor = l;
        this.con_type = enumC869400Y8s;
        this.limit = l2;
        this.include_role = num;
        this.exclude_role = num2;
        this.include_removed_group = bool;
        this.with_cold = bool2;
        this.customed_con_type = num3;
        this.include_multiple_roles = C1516540pZE.LJFF("include_multiple_roles", list);
    }
}
