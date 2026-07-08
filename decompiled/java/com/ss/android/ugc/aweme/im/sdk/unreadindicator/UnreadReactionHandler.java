package com.ss.android.ugc.aweme.im.sdk.unreadindicator;

import X.C910640Zny;
import X.C910680Zo2;
import X.C910740Zo8;
import X.EnumC910600Znu;
import X.InterfaceC1364105Vn;
import X.InterfaceC910720Zo6;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListScrollAbility;

/* JADX INFO: loaded from: classes15.dex */
public final class UnreadReactionHandler implements UnreadHandler {
    public final int LL = 2131755647;
    public final EnumC910600Znu LLILLJJLI = EnumC910600Znu.REACTION;

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

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d0  */
    @Override // com.ss.android.ugc.aweme.im.sdk.unreadindicator.UnreadHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object kQ1(X.InterfaceC910720Zo6 r16, X.InterfaceC1364105Vn<? super X.C910740Zo8> r17) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.unreadindicator.UnreadReactionHandler.kQ1(X.0Zo6, X.05Vn):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.unreadindicator.UnreadHandler
    public final C910680Zo2 nz1(MessageListScrollAbility messageListScrollAbility, C910740Zo8 c910740Zo8) {
        return C910640Zny.LIZIZ(this, c910740Zo8, messageListScrollAbility);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.unreadindicator.UnreadHandler
    public final Object mN1(long j, InterfaceC910720Zo6 interfaceC910720Zo6, MessageListScrollAbility messageListScrollAbility, InterfaceC1364105Vn<? super C910680Zo2> interfaceC1364105Vn) {
        return C910640Zny.LIZ(this, j, interfaceC910720Zo6, messageListScrollAbility, interfaceC1364105Vn);
    }
}
