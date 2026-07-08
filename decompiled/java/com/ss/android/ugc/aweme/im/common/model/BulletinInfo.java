package com.ss.android.ugc.aweme.im.common.model;

import X.C09CT;
import X.C2272681DxS;
import X.EnumC19362310p3;
import X.EnumC2236881Cgo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.ss.android.ugc.aweme.im.common.model.BulletinInfo;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import okio.ByteString;

/* JADX INFO: loaded from: classes36.dex */
public final class BulletinInfo extends Message<BulletinInfo, C2272681DxS> {
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    @C09CT("avatar")
    public final String avatar;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
    @C09CT("bulletin_Id")
    public final Long bulletin_Id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    @C09CT("bulletin_name")
    public final String bulletin_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 7)
    @C09CT("closed_at")
    public final Long closed_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    @C09CT("desc")
    public final String desc;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 4)
    @C09CT("member_cnt")
    public final Long member_cnt;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = BdTuring.TYPE_ECAF)
    @C09CT("owner_name")
    public final String owner_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = HorizontalCarouselRecentEffectsLimitAB.LIMIT_10)
    @C09CT("owner_user_id")
    public final Long owner_user_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 8)
    @C09CT("reopen_before")
    public final Long reopen_before;

    @WireField(adapter = "com.ss.android.ugc.aweme.im.common.model.ReplyStatus#ADAPTER", tag = BdTuring.TYPE_SMS_VOICE)
    @C09CT("reply_status")
    public final EnumC19362310p3 reply_status;

    @WireField(adapter = "com.ss.android.ugc.aweme.im.common.model.BulletinStatus#ADAPTER", tag = 6)
    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final EnumC2236881Cgo status;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = BdTuring.TYPE_EMAIL)
    @C09CT("subscriber_name")
    public final String subscriber_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = HorizontalCarouselRecentEffectsLimitAB.LIMIT_12)
    @C09CT("subscriber_user_id")
    public final Long subscriber_user_id;
    public static final ProtoAdapter<BulletinInfo> ADAPTER = new ProtoAdapter<BulletinInfo>() { // from class: X.1DxR
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final BulletinInfo decode(ProtoReader protoReader) {
            C2272681DxS c2272681DxS = new C2272681DxS();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c2272681DxS.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 2:
                            c2272681DxS.LJ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c2272681DxS.LJFF = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c2272681DxS.LJI = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 5:
                            c2272681DxS.LJII = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            try {
                                c2272681DxS.LJIIIIZZ = EnumC2236881Cgo.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c2272681DxS.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                            break;
                        case 7:
                            c2272681DxS.LJIIIZ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 8:
                            c2272681DxS.LJIIJ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c2272681DxS.LJIIJJI = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c2272681DxS.LJIIL = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c2272681DxS.LJIILIIL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c2272681DxS.LJIILJJIL = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            try {
                                c2272681DxS.LJIILL = EnumC19362310p3.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                TryCatchGuardChecker.doCheck(e2);
                                c2272681DxS.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                            }
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2272681DxS.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2272681DxS.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(BulletinInfo bulletinInfo) {
            BulletinInfo bulletinInfo2 = bulletinInfo;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, bulletinInfo2.bulletin_Id);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, bulletinInfo2.desc) + protoAdapter2.encodedSizeWithTag(3, bulletinInfo2.bulletin_name) + protoAdapter.encodedSizeWithTag(4, bulletinInfo2.member_cnt) + protoAdapter2.encodedSizeWithTag(5, bulletinInfo2.avatar) + EnumC2236881Cgo.ADAPTER.encodedSizeWithTag(6, bulletinInfo2.status) + protoAdapter.encodedSizeWithTag(7, bulletinInfo2.closed_at) + protoAdapter.encodedSizeWithTag(8, bulletinInfo2.reopen_before) + protoAdapter2.encodedSizeWithTag(9, bulletinInfo2.owner_name) + protoAdapter.encodedSizeWithTag(10, bulletinInfo2.owner_user_id) + protoAdapter2.encodedSizeWithTag(11, bulletinInfo2.subscriber_name) + protoAdapter.encodedSizeWithTag(12, bulletinInfo2.subscriber_user_id) + EnumC19362310p3.ADAPTER.encodedSizeWithTag(13, bulletinInfo2.reply_status) + bulletinInfo2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final BulletinInfo redact(BulletinInfo bulletinInfo) {
            C2272681DxS c2272681DxSNewBuilder = bulletinInfo.newBuilder();
            c2272681DxSNewBuilder.clearUnknownFields();
            return c2272681DxSNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, BulletinInfo bulletinInfo) {
            BulletinInfo bulletinInfo2 = bulletinInfo;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, bulletinInfo2.bulletin_Id);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            protoAdapter2.encodeWithTag(protoWriter, 2, bulletinInfo2.desc);
            protoAdapter2.encodeWithTag(protoWriter, 3, bulletinInfo2.bulletin_name);
            protoAdapter.encodeWithTag(protoWriter, 4, bulletinInfo2.member_cnt);
            protoAdapter2.encodeWithTag(protoWriter, 5, bulletinInfo2.avatar);
            EnumC2236881Cgo.ADAPTER.encodeWithTag(protoWriter, 6, bulletinInfo2.status);
            protoAdapter.encodeWithTag(protoWriter, 7, bulletinInfo2.closed_at);
            protoAdapter.encodeWithTag(protoWriter, 8, bulletinInfo2.reopen_before);
            protoAdapter2.encodeWithTag(protoWriter, 9, bulletinInfo2.owner_name);
            protoAdapter.encodeWithTag(protoWriter, 10, bulletinInfo2.owner_user_id);
            protoAdapter2.encodeWithTag(protoWriter, 11, bulletinInfo2.subscriber_name);
            protoAdapter.encodeWithTag(protoWriter, 12, bulletinInfo2.subscriber_user_id);
            EnumC19362310p3.ADAPTER.encodeWithTag(protoWriter, 13, bulletinInfo2.reply_status);
            protoWriter.writeBytes(bulletinInfo2.unknownFields());
        }
    };
    public static final Long DEFAULT_BULLETIN_ID = 0L;
    public static final Long DEFAULT_MEMBER_CNT = 0L;
    public static final EnumC2236881Cgo DEFAULT_STATUS = EnumC2236881Cgo.NotExist;
    public static final Long DEFAULT_CLOSED_AT = 0L;
    public static final Long DEFAULT_REOPEN_BEFORE = 0L;
    public static final Long DEFAULT_OWNER_USER_ID = 0L;
    public static final Long DEFAULT_SUBSCRIBER_USER_ID = 0L;
    public static final EnumC19362310p3 DEFAULT_REPLY_STATUS = EnumC19362310p3.CanReply;

    @Override // com.squareup.wire.Message
    public C2272681DxS newBuilder() {
        C2272681DxS c2272681DxS = new C2272681DxS();
        c2272681DxS.LIZLLL = this.bulletin_Id;
        c2272681DxS.LJ = this.desc;
        c2272681DxS.LJFF = this.bulletin_name;
        c2272681DxS.LJI = this.member_cnt;
        c2272681DxS.LJII = this.avatar;
        c2272681DxS.LJIIIIZZ = this.status;
        c2272681DxS.LJIIIZ = this.closed_at;
        c2272681DxS.LJIIJ = this.reopen_before;
        c2272681DxS.LJIIJJI = this.owner_name;
        c2272681DxS.LJIIL = this.owner_user_id;
        c2272681DxS.LJIILIIL = this.subscriber_name;
        c2272681DxS.LJIILJJIL = this.subscriber_user_id;
        c2272681DxS.LJIILL = this.reply_status;
        c2272681DxS.addUnknownFields(unknownFields());
        return c2272681DxS;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.bulletin_Id != null) {
            sb.append(", bulletin_Id=");
            sb.append(this.bulletin_Id);
        }
        if (this.desc != null) {
            sb.append(", desc=");
            sb.append(this.desc);
        }
        if (this.bulletin_name != null) {
            sb.append(", bulletin_name=");
            sb.append(this.bulletin_name);
        }
        if (this.member_cnt != null) {
            sb.append(", member_cnt=");
            sb.append(this.member_cnt);
        }
        if (this.avatar != null) {
            sb.append(", avatar=");
            sb.append(this.avatar);
        }
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        if (this.closed_at != null) {
            sb.append(", closed_at=");
            sb.append(this.closed_at);
        }
        if (this.reopen_before != null) {
            sb.append(", reopen_before=");
            sb.append(this.reopen_before);
        }
        if (this.owner_name != null) {
            sb.append(", owner_name=");
            sb.append(this.owner_name);
        }
        if (this.owner_user_id != null) {
            sb.append(", owner_user_id=");
            sb.append(this.owner_user_id);
        }
        if (this.subscriber_name != null) {
            sb.append(", subscriber_name=");
            sb.append(this.subscriber_name);
        }
        if (this.subscriber_user_id != null) {
            sb.append(", subscriber_user_id=");
            sb.append(this.subscriber_user_id);
        }
        if (this.reply_status != null) {
            sb.append(", reply_status=");
            sb.append(this.reply_status);
        }
        sb.replace(0, 2, "BulletinInfo{");
        sb.append('}');
        return sb.toString();
    }

    public BulletinInfo(Long l, String str, String str2, Long l2, String str3, EnumC2236881Cgo enumC2236881Cgo, Long l3, Long l4, String str4, Long l5, String str5, Long l6, EnumC19362310p3 enumC19362310p3) {
        this(l, str, str2, l2, str3, enumC2236881Cgo, l3, l4, str4, l5, str5, l6, enumC19362310p3, ByteString.EMPTY);
    }

    public BulletinInfo(Long l, String str, String str2, Long l2, String str3, EnumC2236881Cgo enumC2236881Cgo, Long l3, Long l4, String str4, Long l5, String str5, Long l6, EnumC19362310p3 enumC19362310p3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.bulletin_Id = l;
        this.desc = str;
        this.bulletin_name = str2;
        this.member_cnt = l2;
        this.avatar = str3;
        this.status = enumC2236881Cgo;
        this.closed_at = l3;
        this.reopen_before = l4;
        this.owner_name = str4;
        this.owner_user_id = l5;
        this.subscriber_name = str5;
        this.subscriber_user_id = l6;
        this.reply_status = enumC19362310p3;
    }
}
