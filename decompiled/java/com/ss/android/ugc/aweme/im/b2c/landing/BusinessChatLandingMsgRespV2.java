package com.ss.android.ugc.aweme.im.b2c.landing;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BusinessChatLandingMsgRespV2 extends BaseResponse {
    public long LL;

    @C09CT("chat_intros")
    public final List<ChatIntro> chatIntro;

    @C09CT("keyword_infos")
    public final List<KeywordReply> keywordReplies;

    @C09CT("landing_messages")
    public final List<BusinessAutoMessage> landingMessages;

    @C09CT("source")
    public final Integer source;

    @C09CT("suggested_question_list")
    public final List<SuggestedQuestion> sugQuestions;

    @C09CT("suggested_question_tips")
    public final String suggestedQuestionTips;

    public BusinessChatLandingMsgRespV2() {
        this(null, null, null, null, null, null, 63, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BusinessChatLandingMsgRespV2)) {
            return false;
        }
        BusinessChatLandingMsgRespV2 businessChatLandingMsgRespV2 = (BusinessChatLandingMsgRespV2) obj;
        return Intrinsics.LJFF(this.source, businessChatLandingMsgRespV2.source) && Intrinsics.LJFF(this.landingMessages, businessChatLandingMsgRespV2.landingMessages) && Intrinsics.LJFF(this.sugQuestions, businessChatLandingMsgRespV2.sugQuestions) && Intrinsics.LJFF(this.suggestedQuestionTips, businessChatLandingMsgRespV2.suggestedQuestionTips) && Intrinsics.LJFF(this.keywordReplies, businessChatLandingMsgRespV2.keywordReplies) && Intrinsics.LJFF(this.chatIntro, businessChatLandingMsgRespV2.chatIntro);
    }

    public final int hashCode() {
        Integer num = this.source;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<BusinessAutoMessage> list = this.landingMessages;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<SuggestedQuestion> list2 = this.sugQuestions;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.suggestedQuestionTips;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        List<KeywordReply> list3 = this.keywordReplies;
        int iHashCode5 = (iHashCode4 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<ChatIntro> list4 = this.chatIntro;
        return iHashCode5 + (list4 != null ? list4.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BusinessChatLandingMsgRespV2(source=");
        sbLIZ.append(this.source);
        sbLIZ.append(", landingMessages=");
        sbLIZ.append(this.landingMessages);
        sbLIZ.append(", sugQuestions=");
        sbLIZ.append(this.sugQuestions);
        sbLIZ.append(", suggestedQuestionTips=");
        sbLIZ.append(this.suggestedQuestionTips);
        sbLIZ.append(", keywordReplies=");
        sbLIZ.append(this.keywordReplies);
        sbLIZ.append(", chatIntro=");
        sbLIZ.append(this.chatIntro);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public BusinessChatLandingMsgRespV2(Integer num, List<BusinessAutoMessage> list, List<SuggestedQuestion> list2, String str, List<KeywordReply> list3, List<ChatIntro> list4) {
        this.source = num;
        this.landingMessages = list;
        this.sugQuestions = list2;
        this.suggestedQuestionTips = str;
        this.keywordReplies = list3;
        this.chatIntro = list4;
    }

    public BusinessChatLandingMsgRespV2(Integer num, List list, List list2, String str, List list3, List list4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0 : num, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? "" : str, (i & 16) != 0 ? C13BV.INSTANCE : list3, (i & 32) == 0 ? list4 : null);
    }
}
