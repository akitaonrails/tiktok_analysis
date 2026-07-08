package com.bytedance.im.core.proto;

import X.C09CT;
import X.C0Y4G;
import com.bytedance.im.core.proto.ConversationCoreInfo;
import com.bytedance.im.core.proto.ConversationInfoV2;
import com.bytedance.im.core.proto.ConversationSettingInfo;
import com.bytedance.im.core.proto.Participant;
import com.bytedance.im.core.proto.ParticipantsPage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class ConversationInfoV2 extends Message<ConversationInfoV2, C0Y4G> {
    public static final long serialVersionUID = 0;

    @C09CT("badge_count")
    public final Integer badge_count;

    @C09CT("badge_count_v2")
    public final Integer badge_count_v2;

    @C09CT("badge_version")
    public final Long badge_version;

    @C09CT("biz_ext")
    public final ByteString biz_ext;

    @C09CT("conversation_core_info")
    public final ConversationCoreInfo conversation_core_info;

    @C09CT("conversation_id")
    public final String conversation_id;

    @C09CT("conversation_rank_version")
    public final Long conversation_rank_version;

    @C09CT("conversation_setting_info")
    public final ConversationSettingInfo conversation_setting_info;

    @C09CT("conversation_short_id")
    public final Long conversation_short_id;

    @C09CT("conversation_type")
    public final Integer conversation_type;

    @C09CT("first_page_participants")
    public final ParticipantsPage first_page_participants;

    @C09CT("inbox_type")
    public final Integer inbox_type;

    @C09CT("is_participant")
    public final Boolean is_participant;

    @C09CT("participants_count")
    public final Integer participants_count;

    @C09CT("ticket")
    public final String ticket;

    @C09CT("user_info")
    public final Participant user_info;
    public static final ProtoAdapter<ConversationInfoV2> ADAPTER = new ProtoAdapter<ConversationInfoV2>() { // from class: X.0Y4V
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final ConversationInfoV2 decode(ProtoReader protoReader) {
            C0Y4G c0y4g = new C0Y4G();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    if (iNextTag != 20) {
                                        if (iNextTag != 100) {
                                            if (iNextTag != 50) {
                                                if (iNextTag != 51) {
                                                    switch (iNextTag) {
                                                        case 6:
                                                            c0y4g.LJII = ParticipantsPage.ADAPTER.decode(protoReader);
                                                            break;
                                                        case 7:
                                                            c0y4g.LJIIIIZZ = ProtoAdapter.INT32.decode(protoReader);
                                                            break;
                                                        case 8:
                                                            c0y4g.LJIIIZ = ProtoAdapter.BOOL.decode(protoReader);
                                                            break;
                                                        case BdTuring.TYPE_ECAF /* 9 */:
                                                            c0y4g.LJIIJ = ProtoAdapter.INT32.decode(protoReader);
                                                            break;
                                                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                                                            c0y4g.LJIIJJI = ProtoAdapter.INT32.decode(protoReader);
                                                            break;
                                                        case BdTuring.TYPE_EMAIL /* 11 */:
                                                            c0y4g.LJIIL = ProtoAdapter.INT32.decode(protoReader);
                                                            break;
                                                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                                                            c0y4g.LJIILIIL = ProtoAdapter.INT64.decode(protoReader);
                                                            break;
                                                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                                                            c0y4g.LJIILJJIL = ProtoAdapter.INT64.decode(protoReader);
                                                            break;
                                                        default:
                                                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                                            c0y4g.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                                            break;
                                                    }
                                                } else {
                                                    c0y4g.LJIIZILJ = ConversationSettingInfo.ADAPTER.decode(protoReader);
                                                }
                                            } else {
                                                c0y4g.LJIILLIIL = ConversationCoreInfo.ADAPTER.decode(protoReader);
                                            }
                                        } else {
                                            c0y4g.LJIJ = ProtoAdapter.BYTES.decode(protoReader);
                                        }
                                    } else {
                                        c0y4g.LJIILL = Participant.ADAPTER.decode(protoReader);
                                    }
                                } else {
                                    c0y4g.LJI = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c0y4g.LJFF = ProtoAdapter.INT32.decode(protoReader);
                            }
                        } else {
                            c0y4g.LJ = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c0y4g.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c0y4g.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(ConversationInfoV2 conversationInfoV2) {
            ConversationInfoV2 conversationInfoV22 = conversationInfoV2;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, conversationInfoV22.conversation_id);
            ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, conversationInfoV22.conversation_short_id);
            ProtoAdapter<Integer> protoAdapter3 = ProtoAdapter.INT32;
            return iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(3, conversationInfoV22.conversation_type) + protoAdapter.encodedSizeWithTag(4, conversationInfoV22.ticket) + ParticipantsPage.ADAPTER.encodedSizeWithTag(6, conversationInfoV22.first_page_participants) + protoAdapter3.encodedSizeWithTag(7, conversationInfoV22.participants_count) + ProtoAdapter.BOOL.encodedSizeWithTag(8, conversationInfoV22.is_participant) + protoAdapter3.encodedSizeWithTag(9, conversationInfoV22.inbox_type) + protoAdapter3.encodedSizeWithTag(10, conversationInfoV22.badge_count) + protoAdapter3.encodedSizeWithTag(11, conversationInfoV22.badge_count_v2) + protoAdapter2.encodedSizeWithTag(12, conversationInfoV22.conversation_rank_version) + protoAdapter2.encodedSizeWithTag(13, conversationInfoV22.badge_version) + Participant.ADAPTER.encodedSizeWithTag(20, conversationInfoV22.user_info) + ConversationCoreInfo.ADAPTER.encodedSizeWithTag(50, conversationInfoV22.conversation_core_info) + ConversationSettingInfo.ADAPTER.encodedSizeWithTag(51, conversationInfoV22.conversation_setting_info) + ProtoAdapter.BYTES.encodedSizeWithTag(100, conversationInfoV22.biz_ext) + conversationInfoV22.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, ConversationInfoV2 conversationInfoV2) {
            ConversationInfoV2 conversationInfoV22 = conversationInfoV2;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, conversationInfoV22.conversation_id);
            ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
            protoAdapter2.encodeWithTag(protoWriter, 2, conversationInfoV22.conversation_short_id);
            ProtoAdapter<Integer> protoAdapter3 = ProtoAdapter.INT32;
            protoAdapter3.encodeWithTag(protoWriter, 3, conversationInfoV22.conversation_type);
            protoAdapter.encodeWithTag(protoWriter, 4, conversationInfoV22.ticket);
            ParticipantsPage.ADAPTER.encodeWithTag(protoWriter, 6, conversationInfoV22.first_page_participants);
            protoAdapter3.encodeWithTag(protoWriter, 7, conversationInfoV22.participants_count);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 8, conversationInfoV22.is_participant);
            protoAdapter3.encodeWithTag(protoWriter, 9, conversationInfoV22.inbox_type);
            protoAdapter3.encodeWithTag(protoWriter, 10, conversationInfoV22.badge_count);
            protoAdapter3.encodeWithTag(protoWriter, 11, conversationInfoV22.badge_count_v2);
            protoAdapter2.encodeWithTag(protoWriter, 12, conversationInfoV22.conversation_rank_version);
            protoAdapter2.encodeWithTag(protoWriter, 13, conversationInfoV22.badge_version);
            Participant.ADAPTER.encodeWithTag(protoWriter, 20, conversationInfoV22.user_info);
            ConversationCoreInfo.ADAPTER.encodeWithTag(protoWriter, 50, conversationInfoV22.conversation_core_info);
            ConversationSettingInfo.ADAPTER.encodeWithTag(protoWriter, 51, conversationInfoV22.conversation_setting_info);
            ProtoAdapter.BYTES.encodeWithTag(protoWriter, 100, conversationInfoV22.biz_ext);
            protoWriter.writeBytes(conversationInfoV22.unknownFields());
        }
    };
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final Integer DEFAULT_PARTICIPANTS_COUNT = 0;
    public static final Boolean DEFAULT_IS_PARTICIPANT = Boolean.FALSE;
    public static final Integer DEFAULT_INBOX_TYPE = 0;
    public static final Integer DEFAULT_BADGE_COUNT = 0;
    public static final Integer DEFAULT_BADGE_COUNT_V2 = 0;
    public static final Long DEFAULT_CONVERSATION_RANK_VERSION = 0L;
    public static final Long DEFAULT_BADGE_VERSION = 0L;
    public static final ByteString DEFAULT_BIZ_EXT = ByteString.EMPTY;

    @Override // com.squareup.wire.Message
    public C0Y4G newBuilder() {
        C0Y4G c0y4g = new C0Y4G();
        c0y4g.LIZLLL = this.conversation_id;
        c0y4g.LJ = this.conversation_short_id;
        c0y4g.LJFF = this.conversation_type;
        c0y4g.LJI = this.ticket;
        c0y4g.LJII = this.first_page_participants;
        c0y4g.LJIIIIZZ = this.participants_count;
        c0y4g.LJIIIZ = this.is_participant;
        c0y4g.LJIIJ = this.inbox_type;
        c0y4g.LJIIJJI = this.badge_count;
        c0y4g.LJIIL = this.badge_count_v2;
        c0y4g.LJIILIIL = this.conversation_rank_version;
        c0y4g.LJIILJJIL = this.badge_version;
        c0y4g.LJIILL = this.user_info;
        c0y4g.LJIILLIIL = this.conversation_core_info;
        c0y4g.LJIIZILJ = this.conversation_setting_info;
        c0y4g.LJIJ = this.biz_ext;
        c0y4g.addUnknownFields(unknownFields());
        return c0y4g;
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
        if (this.ticket != null) {
            sb.append(", ticket=");
            sb.append(this.ticket);
        }
        if (this.first_page_participants != null) {
            sb.append(", first_page_participants=");
            sb.append(this.first_page_participants);
        }
        if (this.participants_count != null) {
            sb.append(", participants_count=");
            sb.append(this.participants_count);
        }
        if (this.is_participant != null) {
            sb.append(", is_participant=");
            sb.append(this.is_participant);
        }
        if (this.inbox_type != null) {
            sb.append(", inbox_type=");
            sb.append(this.inbox_type);
        }
        if (this.badge_count != null) {
            sb.append(", badge_count=");
            sb.append(this.badge_count);
        }
        if (this.badge_count_v2 != null) {
            sb.append(", badge_count_v2=");
            sb.append(this.badge_count_v2);
        }
        if (this.conversation_rank_version != null) {
            sb.append(", conversation_rank_version=");
            sb.append(this.conversation_rank_version);
        }
        if (this.badge_version != null) {
            sb.append(", badge_version=");
            sb.append(this.badge_version);
        }
        if (this.user_info != null) {
            sb.append(", user_info=");
            sb.append(this.user_info);
        }
        if (this.conversation_core_info != null) {
            sb.append(", conversation_core_info=");
            sb.append(this.conversation_core_info);
        }
        if (this.conversation_setting_info != null) {
            sb.append(", conversation_setting_info=");
            sb.append(this.conversation_setting_info);
        }
        if (this.biz_ext != null) {
            sb.append(", biz_ext=");
            sb.append(this.biz_ext);
        }
        sb.replace(0, 2, "ConversationInfoV2{");
        sb.append('}');
        return sb.toString();
    }

    public ConversationInfoV2(String str, Long l, Integer num, String str2, ParticipantsPage participantsPage, Integer num2, Boolean bool, Integer num3, Integer num4, Integer num5, Long l2, Long l3, Participant participant, ConversationCoreInfo conversationCoreInfo, ConversationSettingInfo conversationSettingInfo, ByteString byteString) {
        this(str, l, num, str2, participantsPage, num2, bool, num3, num4, num5, l2, l3, participant, conversationCoreInfo, conversationSettingInfo, byteString, ByteString.EMPTY);
    }

    public ConversationInfoV2(String str, Long l, Integer num, String str2, ParticipantsPage participantsPage, Integer num2, Boolean bool, Integer num3, Integer num4, Integer num5, Long l2, Long l3, Participant participant, ConversationCoreInfo conversationCoreInfo, ConversationSettingInfo conversationSettingInfo, ByteString byteString, ByteString byteString2) {
        super(ADAPTER, byteString2);
        this.conversation_id = str;
        this.conversation_short_id = l;
        this.conversation_type = num;
        this.ticket = str2;
        this.first_page_participants = participantsPage;
        this.participants_count = num2;
        this.is_participant = bool;
        this.inbox_type = num3;
        this.badge_count = num4;
        this.badge_count_v2 = num5;
        this.conversation_rank_version = l2;
        this.badge_version = l3;
        this.user_info = participant;
        this.conversation_core_info = conversationCoreInfo;
        this.conversation_setting_info = conversationSettingInfo;
        this.biz_ext = byteString;
    }
}
