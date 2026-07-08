package com.ss.android.ugc.aweme.im.sdk.unreadindicator;

import X.C910640Zny;
import X.C910680Zo2;
import X.C910740Zo8;
import X.EnumC910600Znu;
import X.InterfaceC1364105Vn;
import X.InterfaceC910720Zo6;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListScrollAbility;

/* JADX INFO: loaded from: classes15.dex */
public final class UnreadMessageHandler implements UnreadHandler {
    public final int LL = 2131755646;
    public final EnumC910600Znu LLILLJJLI = EnumC910600Znu.MESSAGE;

    @Override // com.ss.android.ugc.aweme.im.sdk.unreadindicator.UnreadHandler
    public final boolean HZ0(long j, long j2) {
        return j <= j2;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.unreadindicator.UnreadHandler
    public final int tJ() {
        return this.LL;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.unreadindicator.UnreadHandler
    public final EnumC910600Znu tP2() {
        return this.LLILLJJLI;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.unreadindicator.UnreadHandler
    public final Object kQ1(InterfaceC910720Zo6 interfaceC910720Zo6, InterfaceC1364105Vn<? super C910740Zo8> interfaceC1364105Vn) {
        long jLongValue;
        Long unreadCount = interfaceC910720Zo6.getUnreadCount();
        long jLongValue2 = 0;
        if (unreadCount != null) {
            jLongValue = unreadCount.longValue();
        } else {
            jLongValue = 0;
        }
        Long readIndex = interfaceC910720Zo6.getReadIndex();
        if (readIndex != null) {
            jLongValue2 = readIndex.longValue();
        }
        return new C910740Zo8(jLongValue, jLongValue2);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.unreadindicator.UnreadHandler
    public final C910680Zo2 nz1(MessageListScrollAbility messageListScrollAbility, C910740Zo8 c910740Zo8) {
        return new C910680Zo2(this.LLILLJJLI, c910740Zo8.LIZ, this.LL, null, c910740Zo8.LIZIZ);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.unreadindicator.UnreadHandler
    public final Object mN1(long j, InterfaceC910720Zo6 interfaceC910720Zo6, MessageListScrollAbility messageListScrollAbility, InterfaceC1364105Vn<? super C910680Zo2> interfaceC1364105Vn) {
        return C910640Zny.LIZ(this, j, interfaceC910720Zo6, messageListScrollAbility, interfaceC1364105Vn);
    }
}
