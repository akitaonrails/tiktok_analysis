package com.ss.android.ugc.aweme.im.messagelist;

import X.C0ZQ5;
import X.C869590Y9l;
import X.C898790ZNt;
import X.C902730ZbD;
import X.InterfaceC1891350zJl;
import X.InterfaceC903660Zci;
import X.InterfaceC904590ZeD;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.im.messagelist.api.cell.IMMessageListProtocol;
import com.ss.android.ugc.aweme.im.messagelist.api.cell.MessageListProtocolEnum;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public final class RecentActivityMessageListProtocol implements IMMessageListProtocol<C0ZQ5> {
    public final C898790ZNt LL = new C898790ZNt(new int[]{4060});
    public final Class<? extends PowerCell<C0ZQ5>> LLILLJJLI = RecentActivityCardPowerCell.class;
    public final MessageListProtocolEnum LLILLL = MessageListProtocolEnum.RECENT_ACTIVITY_CARD;

    @Override // X.InterfaceC902790ZbJ
    public final Integer getCustomViewPoolSize() {
        return null;
    }

    @Override // X.InterfaceC902790ZbJ
    public final Class<C0ZQ5> getPowerItemClazz() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC902770ZbH
    public final List<C869590Y9l> intercept(List<? extends C869590Y9l> list) {
        return list;
    }

    @Override // X.InterfaceC902770ZbH
    public final boolean isEnabled() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.cell.IMMessageListProtocol
    public final InterfaceC904590ZeD<MessageListProtocolEnum, C0ZQ5> toMessageListProtocol() {
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
    public final Class<? extends PowerCell<C0ZQ5>> getWithCell() {
        return this.LLILLJJLI;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.cell.IMMessageListProtocol
    public final InterfaceC1891350zJl mapToPowerItem(List list, C869590Y9l c869590Y9l, int i) {
        return C0ZQ5.LL;
    }
}
