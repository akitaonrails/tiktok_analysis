package com.bytedance.im.core.proto;

import X.C09CT;
import X.C0Y8Z;
import X.C1516540pZE;
import X.EnumC868560Y5m;
import com.bytedance.im.core.proto.Participant;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.tts.oecverify.BdTuring;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class Participant extends Message<Participant, C0Y8Z> {
    public static final long serialVersionUID = 0;

    @C09CT("alias")
    public final String alias;

    @C09CT("biz_role")
    public final String biz_role;

    @C09CT("blocked")
    public final EnumC868560Y5m blocked;

    @C09CT("ext")
    public final Map<String, String> ext;

    @C09CT("left_block_time")
    public final Long left_block_time;

    @C09CT("role")
    public final Integer role;

    @C09CT("sec_uid")
    public final String sec_uid;

    @C09CT("sort_order")
    public final Long sort_order;

    @C09CT("user_id")
    public final Long user_id;
    public static final ProtoAdapter<Participant> ADAPTER = new ProtoAdapter<Participant>() { // from class: X.0Y8X
        public final ProtoAdapter<Map<String, String>> LIZ;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.LIZ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final Participant decode(ProtoReader protoReader) {
            C0Y8Z c0y8z = new C0Y8Z();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c0y8z.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 2:
                            c0y8z.LJ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 3:
                            c0y8z.LJFF = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            c0y8z.LJI = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c0y8z.LJII = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            try {
                                c0y8z.LJIIIIZZ = EnumC868560Y5m.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c0y8z.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                            break;
                        case 7:
                            c0y8z.LJIIIZ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 8:
                            c0y8z.LJIIJ.putAll(this.LIZ.decode(protoReader));
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c0y8z.LJIIJJI = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c0y8z.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c0y8z.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(Participant participant) {
            Participant participant2 = participant;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, participant2.user_id) + protoAdapter.encodedSizeWithTag(2, participant2.sort_order) + ProtoAdapter.INT32.encodedSizeWithTag(3, participant2.role);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(4, participant2.alias) + protoAdapter2.encodedSizeWithTag(5, participant2.sec_uid) + EnumC868560Y5m.ADAPTER.encodedSizeWithTag(6, participant2.blocked) + protoAdapter.encodedSizeWithTag(7, participant2.left_block_time) + this.LIZ.encodedSizeWithTag(8, participant2.ext) + protoAdapter2.encodedSizeWithTag(9, participant2.biz_role) + participant2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, Participant participant) {
            Participant participant2 = participant;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, participant2.user_id);
            protoAdapter.encodeWithTag(protoWriter, 2, participant2.sort_order);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, participant2.role);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            protoAdapter2.encodeWithTag(protoWriter, 4, participant2.alias);
            protoAdapter2.encodeWithTag(protoWriter, 5, participant2.sec_uid);
            EnumC868560Y5m.ADAPTER.encodeWithTag(protoWriter, 6, participant2.blocked);
            protoAdapter.encodeWithTag(protoWriter, 7, participant2.left_block_time);
            this.LIZ.encodeWithTag(protoWriter, 8, participant2.ext);
            protoAdapter2.encodeWithTag(protoWriter, 9, participant2.biz_role);
            protoWriter.writeBytes(participant2.unknownFields());
        }
    };
    public static final Long DEFAULT_USER_ID = 0L;
    public static final Long DEFAULT_SORT_ORDER = 0L;
    public static final Integer DEFAULT_ROLE = 0;
    public static final EnumC868560Y5m DEFAULT_BLOCKED = EnumC868560Y5m.UNBLOCK;
    public static final Long DEFAULT_LEFT_BLOCK_TIME = 0L;

    @Override // com.squareup.wire.Message
    public C0Y8Z newBuilder() {
        C0Y8Z c0y8z = new C0Y8Z();
        c0y8z.LIZLLL = this.user_id;
        c0y8z.LJ = this.sort_order;
        c0y8z.LJFF = this.role;
        c0y8z.LJI = this.alias;
        c0y8z.LJII = this.sec_uid;
        c0y8z.LJIIIIZZ = this.blocked;
        c0y8z.LJIIIZ = this.left_block_time;
        c0y8z.LJIIJ = C1516540pZE.LIZLLL("ext", this.ext);
        c0y8z.LJIIJJI = this.biz_role;
        c0y8z.addUnknownFields(unknownFields());
        return c0y8z;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.user_id != null) {
            sb.append(", user_id=");
            sb.append(this.user_id);
        }
        if (this.sort_order != null) {
            sb.append(", sort_order=");
            sb.append(this.sort_order);
        }
        if (this.role != null) {
            sb.append(", role=");
            sb.append(this.role);
        }
        if (this.alias != null) {
            sb.append(", alias=");
            sb.append(this.alias);
        }
        if (this.sec_uid != null) {
            sb.append(", sec_uid=");
            sb.append(this.sec_uid);
        }
        if (this.blocked != null) {
            sb.append(", blocked=");
            sb.append(this.blocked);
        }
        if (this.left_block_time != null) {
            sb.append(", left_block_time=");
            sb.append(this.left_block_time);
        }
        Map<String, String> map = this.ext;
        if (map != null && !map.isEmpty()) {
            sb.append(", ext=");
            sb.append(this.ext);
        }
        if (this.biz_role != null) {
            sb.append(", biz_role=");
            sb.append(this.biz_role);
        }
        sb.replace(0, 2, "Participant{");
        sb.append('}');
        return sb.toString();
    }

    public Participant(Long l, Long l2, Integer num, String str, String str2, EnumC868560Y5m enumC868560Y5m, Long l3, Map<String, String> map, String str3) {
        this(l, l2, num, str, str2, enumC868560Y5m, l3, map, str3, ByteString.EMPTY);
    }

    public Participant(Long l, Long l2, Integer num, String str, String str2, EnumC868560Y5m enumC868560Y5m, Long l3, Map<String, String> map, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.user_id = l;
        this.sort_order = l2;
        this.role = num;
        this.alias = str;
        this.sec_uid = str2;
        this.blocked = enumC868560Y5m;
        this.left_block_time = l3;
        this.ext = C1516540pZE.LJI("ext", map);
        this.biz_role = str3;
    }
}
