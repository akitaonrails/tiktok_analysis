package com.ss.android.ugc.aweme.msg;

import X.C0ZQ4;
import X.C869590Y9l;
import X.C898790ZNt;
import X.C902730ZbD;
import X.InterfaceC1891350zJl;
import X.InterfaceC903660Zci;
import X.InterfaceC904590ZeD;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.im.messagelist.api.cell.IMMessageListProtocol;
import com.ss.android.ugc.aweme.im.messagelist.api.cell.MessageListProtocolEnum;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class GroupChatCreationProtocol implements IMMessageListProtocol<C0ZQ4> {
    public final C898790ZNt LL = new C898790ZNt(new int[]{1039});
    public final Class<? extends PowerCell<C0ZQ4>> LLILLJJLI = GroupChatCreationPowerCell.class;
    public final MessageListProtocolEnum LLILLL = MessageListProtocolEnum.NEW_CREATE_GROUP_MSG;

    @Override // X.InterfaceC902790ZbJ
    public final Integer getCustomViewPoolSize() {
        return null;
    }

    @Override // X.InterfaceC902790ZbJ
    public final Class<C0ZQ4> getPowerItemClazz() {
        return null;
    }

    @Override // X.InterfaceC902770ZbH
    public final boolean isEnabled() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.cell.IMMessageListProtocol
    public final InterfaceC904590ZeD<MessageListProtocolEnum, C0ZQ4> toMessageListProtocol() {
        return new C902730ZbD(this);
    }

    @Override // X.InterfaceC902770ZbH
    public final MessageListProtocolEnum getInterceptOrdering() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC902770ZbH
    public final /* bridge */ /* synthetic */ InterfaceC903660Zci getMsgHandlerCheck() {
        return this.LL;
    }

    @Override // X.InterfaceC902800ZbK
    public final Class<? extends PowerCell<C0ZQ4>> getWithCell() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC902770ZbH
    public final List<C869590Y9l> intercept(List<? extends C869590Y9l> list) {
        ArrayList arrayList = new ArrayList();
        for (C869590Y9l c869590Y9l : list) {
            C869590Y9l c869590Y9l2 = c869590Y9l;
            if (c869590Y9l2.getMsgType() != 1039 || Intrinsics.LJFF(c869590Y9l2.getUuid(), "group_creation_fake_message_uuid")) {
                arrayList.add(c869590Y9l);
            }
        }
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.cell.IMMessageListProtocol
    public final InterfaceC1891350zJl mapToPowerItem(List list, C869590Y9l c869590Y9l, int i) {
        return C0ZQ4.LL;
    }
}
