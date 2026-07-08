package com.ss.android.ugc.aweme.story.friendanniversary;

import X.C01GW;
import X.C1717906o5;
import X.C452501pT;
import X.C461720I8s;
import X.C869590Y9l;
import X.C898790ZNt;
import X.C901870ZZp;
import X.C902320ZaY;
import X.C902380Zae;
import X.C902730ZbD;
import X.InterfaceC1891350zJl;
import X.InterfaceC903660Zci;
import X.InterfaceC904590ZeD;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.im.common.model.RelationshipCelebrationTarget;
import com.ss.android.ugc.aweme.im.messagelist.api.cell.IMMessageListProtocol;
import com.ss.android.ugc.aweme.im.messagelist.api.cell.MessageListProtocolEnum;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS201S0000000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class StoryFriendAnniversaryMessageListProtocol implements IMMessageListProtocol<C901870ZZp> {
    public final C898790ZNt LL = new C898790ZNt(new int[]{4067});
    public final Class<? extends PowerCell<C901870ZZp>> LLILLJJLI = StoryFriendAnniversaryCardPowerCell.class;
    public final MessageListProtocolEnum LLILLL = MessageListProtocolEnum.STORY_FRIEND_ANNIVERSARY_CARD;
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(308));

    @Override // X.InterfaceC902790ZbJ
    public final Integer getCustomViewPoolSize() {
        return null;
    }

    @Override // X.InterfaceC902790ZbJ
    public final Class<C901870ZZp> getPowerItemClazz() {
        return null;
    }

    @Override // X.InterfaceC902770ZbH
    public final boolean isEnabled() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.cell.IMMessageListProtocol
    public final InterfaceC904590ZeD<MessageListProtocolEnum, C901870ZZp> toMessageListProtocol() {
        return new C902730ZbD(this);
    }

    @Override // X.InterfaceC902770ZbH
    public final MessageListProtocolEnum getInterceptOrdering() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC902770ZbH
    public final InterfaceC903660Zci getMsgHandlerCheck() {
        return this.LL;
    }

    @Override // X.InterfaceC902800ZbK
    public final Class<? extends PowerCell<C901870ZZp>> getWithCell() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC902770ZbH
    public final List<C869590Y9l> intercept(List<? extends C869590Y9l> list) {
        C902380Zae c902380ZaeLIZ;
        RelationshipCelebrationTarget relationshipCelebrationTargetLIZJ;
        StoryFriendAnniversaryService storyFriendAnniversaryService;
        ArrayList arrayList = new ArrayList();
        for (C869590Y9l c869590Y9l : list) {
            if (c869590Y9l.getMsgType() != 4068) {
                arrayList.add(c869590Y9l);
            }
        }
        if (!C1717906o5.LIZ()) {
            return arrayList;
        }
        for (C869590Y9l c869590Y9l2 : list) {
            StoryFriendAnniversaryService storyFriendAnniversaryService2 = (StoryFriendAnniversaryService) this.LLILZ.getValue();
            if (storyFriendAnniversaryService2 != null && (c902380ZaeLIZ = storyFriendAnniversaryService2.LIZ(C461720I8s.LIZIZ())) != null && (relationshipCelebrationTargetLIZJ = c902380ZaeLIZ.LIZJ(c869590Y9l2.getConversationId())) != null && c869590Y9l2.getCreatedAt() > relationshipCelebrationTargetLIZJ.lastShowTime && c869590Y9l2.getMsgType() != 4067 && c869590Y9l2.getMsgType() != 4068 && (storyFriendAnniversaryService = (StoryFriendAnniversaryService) this.LLILZ.getValue()) != null && storyFriendAnniversaryService.LIZ(C461720I8s.LIZIZ()) != null) {
                new C902320ZaY();
                C902320ZaY.LIZIZ(c869590Y9l2.getConversationId(), relationshipCelebrationTargetLIZJ);
            }
        }
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.cell.IMMessageListProtocol
    public final InterfaceC1891350zJl mapToPowerItem(List list, C869590Y9l c869590Y9l, int i) {
        return C901870ZZp.LL;
    }
}
