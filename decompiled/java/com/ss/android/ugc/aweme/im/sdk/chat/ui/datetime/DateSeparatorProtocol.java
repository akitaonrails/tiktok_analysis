package com.ss.android.ugc.aweme.im.sdk.chat.ui.datetime;

import X.C1279804zc;
import X.C898790ZNt;
import X.C902730ZbD;
import X.InterfaceC903660Zci;
import X.InterfaceC904590ZeD;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.im.messagelist.api.cell.IMMessageListProtocol;
import com.ss.android.ugc.aweme.im.messagelist.api.cell.MessageListProtocolEnum;

/* JADX INFO: loaded from: classes3.dex */
public final class DateSeparatorProtocol implements IMMessageListProtocol<C1279804zc> {
    public final C898790ZNt LL = new C898790ZNt(new int[]{4006});
    public final Class<? extends PowerCell<C1279804zc>> LLILLJJLI = DateSeparatorPowerCell.class;
    public final MessageListProtocolEnum LLILLL = MessageListProtocolEnum.DATE_SEPARATOR_PROTOCOL;

    @Override // X.InterfaceC902790ZbJ
    public final Integer getCustomViewPoolSize() {
        return null;
    }

    @Override // X.InterfaceC902790ZbJ
    public final Class<C1279804zc> getPowerItemClazz() {
        return null;
    }

    @Override // X.InterfaceC902770ZbH
    public final boolean isEnabled() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.cell.IMMessageListProtocol
    public final InterfaceC904590ZeD<MessageListProtocolEnum, C1279804zc> toMessageListProtocol() {
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
    public final Class<? extends PowerCell<C1279804zc>> getWithCell() {
        return this.LLILLJJLI;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x012c  */
    @Override // X.InterfaceC902770ZbH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<X.C869590Y9l> intercept(java.util.List<? extends X.C869590Y9l> r17) {
        /*
            Method dump skipped, instruction units count: 764
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.ui.datetime.DateSeparatorProtocol.intercept(java.util.List):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006a A[PHI: r11
      0x006a: PHI (r11v1 boolean) = (r11v0 boolean), (r11v5 boolean) binds: [B:24:0x0067, B:13:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006e A[PHI: r11 r12
      0x006e: PHI (r11v2 boolean) = (r11v1 boolean), (r11v4 boolean) binds: [B:27:0x006b, B:16:0x0054] A[DONT_GENERATE, DONT_INLINE]
      0x006e: PHI (r12v1 boolean) = (r12v0 boolean), (r12v3 boolean) binds: [B:27:0x006b, B:16:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ss.android.ugc.aweme.im.messagelist.api.cell.IMMessageListProtocol
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC1891350zJl mapToPowerItem(java.util.List r22, X.C869590Y9l r23, int r24) {
        /*
            r21 = this;
            int r0 = r24 + (-1)
            r1 = r22
            java.lang.Object r5 = X.C13LP.LJJJLZIJ(r0, r1)
            X.0Y9l r5 = (X.C869590Y9l) r5
            X.04zc r15 = new X.04zc
            r2 = r23
            long r16 = r2.getCreatedAt()
            java.util.Map r1 = r2.getLocalExt()
            java.lang.String r0 = "formatted-timestamp"
            java.lang.Object r1 = r1.get(r0)
            java.lang.String r1 = (java.lang.String) r1
            boolean r19 = X.C901060ZWm.LIZIZ(r2)
            boolean r8 = X.C0ZDX.LJJIJIL(r2)
            boolean r9 = X.C0ZOT.LIZIZ(r2, r5)
            java.util.Map r0 = r2.getPropertyItemListMap()
            r4 = 1
            if (r0 == 0) goto L70
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L70
            r0 = 0
        L38:
            r10 = r0 ^ 1
            if (r5 == 0) goto L66
            boolean r0 = X.C0ZDX.LJJIJIL(r5)
            if (r0 != r4) goto L66
            r11 = 1
        L43:
            long r6 = r2.getSender()
            long r2 = r5.getSender()
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 != 0) goto L6a
            r12 = 1
        L50:
            boolean r0 = X.C0ZDX.LJJJ(r5)
            if (r0 != r4) goto L6e
            r13 = 1
        L57:
            if (r24 != 0) goto L64
            r14 = 1
        L5a:
            X.0ZqV r20 = X.C912220ZqW.LIZ(r8, r9, r10, r11, r12, r13, r14)
            r18 = r1
            r15.<init>(r16, r18, r19, r20)
            return r15
        L64:
            r14 = 0
            goto L5a
        L66:
            r11 = 0
            if (r5 == 0) goto L6a
            goto L43
        L6a:
            r12 = 0
            if (r5 == 0) goto L6e
            goto L50
        L6e:
            r13 = 0
            goto L57
        L70:
            r0 = 1
            goto L38
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.ui.datetime.DateSeparatorProtocol.mapToPowerItem(java.util.List, X.0Y9l, int):X.0zJl");
    }
}
