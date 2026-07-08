package com.ss.android.ugc.aweme.explore.data;

import X.C09CT;
import X.C15V0;
import X.C20529615Uw;
import X.C20529915Uz;
import X.EnumC20529715Ux;
import X.EnumC20529815Uy;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes32.dex */
public final class ExploreCardInsertResultStruct implements Serializable {
    public static final C20529615Uw Companion = new C20529615Uw();

    @C09CT("card_server_timestamp")
    public final Long cardServerTimestamp;

    @C09CT("chat_group_card")
    public final ExploreChatGroupInsertCard chatGroupCard;

    @C09CT("card_id")
    public final Long id;

    @C09CT("card_type")
    public final Integer insertCardType;

    @C09CT("card_insert_position")
    public final Integer insertPosition;

    @C09CT("card_insert_status")
    public final Integer insertStatus;
    public LogPbBean logPbBean;
    public String requestId;

    @C09CT("user_custom_topics_card")
    public final ExploreCustomTopicsInsertCard userCustomTopicsCard;

    public ExploreCardInsertResultStruct() {
        this(-1L, -1, Integer.valueOf(EnumC20529715Ux.EXPLORE_INSERT_CARD_TYPE_DEFAULT.getValue()), Integer.valueOf(EnumC20529815Uy.EXPLORE_INSERT_CARD_STATUS_TYPE_SUCCESS.getValue()), null, null, -1L);
    }

    public static final void bindRequestId(List<ExploreCardInsertResultStruct> list, String str, LogPbBean logPbBean) {
        Companion.getClass();
        C20529615Uw.LIZ(list, str, logPbBean);
    }

    public static final List<ExploreChatGroupStruct> reduceChatGroupCard(ExploreCardInsertResultStruct exploreCardInsertResultStruct) {
        Companion.getClass();
        return C20529615Uw.LIZIZ(exploreCardInsertResultStruct);
    }

    public static final List<ExploreCustomTopicStruct> reduceCustomTopicCard(ExploreCardInsertResultStruct exploreCardInsertResultStruct) {
        Companion.getClass();
        return C20529615Uw.LIZJ(exploreCardInsertResultStruct);
    }

    public static final List<ExploreCustomTopicStruct> reduceCustomTopicCard(List<ExploreCardInsertResultStruct> list) {
        Companion.getClass();
        return C20529615Uw.LIZLLL(list);
    }

    public static final List<ExploreChatGroupStruct> reduceGroupChatCard(List<ExploreCardInsertResultStruct> list) {
        Companion.getClass();
        return C20529615Uw.LJ(list);
    }

    public final EnumC20529815Uy getCardStatus() {
        C20529915Uz c20529915Uz = EnumC20529815Uy.Companion;
        Integer num = this.insertStatus;
        c20529915Uz.getClass();
        return C20529915Uz.LIZ(num);
    }

    public final EnumC20529715Ux getCardType() {
        C15V0 c15v0 = EnumC20529715Ux.Companion;
        Integer num = this.insertCardType;
        c15v0.getClass();
        return C15V0.LIZ(num);
    }

    public final void setLogPbBean(LogPbBean logPbBean) {
        this.logPbBean = logPbBean;
    }

    public final void setRequestId(String str) {
        this.requestId = str;
    }

    public ExploreCardInsertResultStruct(Long l, Integer num, Integer num2, Integer num3, ExploreCustomTopicsInsertCard exploreCustomTopicsInsertCard, ExploreChatGroupInsertCard exploreChatGroupInsertCard, Long l2) {
        this.id = l;
        this.insertPosition = num;
        this.insertCardType = num2;
        this.insertStatus = num3;
        this.userCustomTopicsCard = exploreCustomTopicsInsertCard;
        this.chatGroupCard = exploreChatGroupInsertCard;
        this.cardServerTimestamp = l2;
    }
}
