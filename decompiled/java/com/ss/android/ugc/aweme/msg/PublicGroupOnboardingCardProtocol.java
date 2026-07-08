package com.ss.android.ugc.aweme.msg;

import X.C0Z2N;
import X.C0ZFW;
import X.C0ZQ6;
import X.C1229100i5c;
import X.C294790Bgz;
import X.C869590Y9l;
import X.C898790ZNt;
import X.C902730ZbD;
import X.InterfaceC1891350zJl;
import X.InterfaceC904590ZeD;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.im.messagelist.api.cell.IMMessageListProtocol;
import com.ss.android.ugc.aweme.im.messagelist.api.cell.MessageListProtocolEnum;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public final class PublicGroupOnboardingCardProtocol implements IMMessageListProtocol<C0Z2N> {
    public static final C0ZQ6 Companion = new Object() { // from class: X.0ZQ6
    };
    public final C898790ZNt msgHandlerCheck = new C898790ZNt(new int[]{1824});
    public final MessageListProtocolEnum interceptOrdering = MessageListProtocolEnum.PUBLIC_GROUP_ONBOARDING;
    public final Class<? extends PowerCell<C0Z2N>> withCell = PublicGroupOnboardingCardCell.class;

    @Override // X.InterfaceC902790ZbJ
    public Integer getCustomViewPoolSize() {
        return null;
    }

    @Override // X.InterfaceC902790ZbJ
    public Class<C0Z2N> getPowerItemClazz() {
        return null;
    }

    @Override // X.InterfaceC902770ZbH
    public boolean isEnabled() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.cell.IMMessageListProtocol
    public InterfaceC904590ZeD<MessageListProtocolEnum, C0Z2N> toMessageListProtocol() {
        return new C902730ZbD(this);
    }

    @Override // X.InterfaceC902770ZbH
    public MessageListProtocolEnum getInterceptOrdering() {
        return this.interceptOrdering;
    }

    @Override // X.InterfaceC902800ZbK
    public Class<? extends PowerCell<C0Z2N>> getWithCell() {
        return this.withCell;
    }

    @Override // X.InterfaceC902770ZbH
    public C898790ZNt getMsgHandlerCheck() {
        return this.msgHandlerCheck;
    }

    private final boolean shouldShowCard(C869590Y9l c869590Y9l) {
        String conversationId;
        if (!C294790Bgz.LIZ()) {
            return false;
        }
        C0ZFW c0zfw = C0ZFW.LIZ;
        if (c869590Y9l != null) {
            c0zfw.getClass();
            conversationId = c869590Y9l.getConversationId();
        } else {
            conversationId = null;
        }
        if (!C0ZFW.LJIJ(conversationId) || !C1229100i5c.LIZ.LJIIJJI(c869590Y9l.getConversationId())) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC902770ZbH
    public List<C869590Y9l> intercept(List<? extends C869590Y9l> list) {
        ArrayList arrayList = new ArrayList();
        for (C869590Y9l c869590Y9l : list) {
            C869590Y9l c869590Y9l2 = c869590Y9l;
            if (!getMsgHandlerCheck().LIZ(c869590Y9l2) || shouldShowCard(c869590Y9l2)) {
                arrayList.add(c869590Y9l);
            }
        }
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.cell.IMMessageListProtocol
    public C0Z2N mapToPowerItem(List<? extends C869590Y9l> list, C869590Y9l c869590Y9l, int i) {
        return new C0Z2N(c869590Y9l);
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.cell.IMMessageListProtocol
    public /* bridge */ /* synthetic */ InterfaceC1891350zJl mapToPowerItem(List list, C869590Y9l c869590Y9l, int i) {
        return mapToPowerItem((List<? extends C869590Y9l>) list, c869590Y9l, i);
    }
}
