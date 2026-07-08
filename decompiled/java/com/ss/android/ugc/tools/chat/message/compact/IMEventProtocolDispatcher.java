package com.ss.android.ugc.tools.chat.message.compact;

import X.C06Z6;
import X.C869590Y9l;
import X.InterfaceC1891350zJl;
import X.InterfaceC904740ZeS;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.IMessageEventProtocol;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.IMessagePowerAdapterProtocol;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes15.dex */
public final class IMEventProtocolDispatcher implements IMessageEventProtocol, IMessagePowerAdapterProtocol {
    public final CopyOnWriteArrayList<IMessageEventProtocol> LL = new CopyOnWriteArrayList<>();
    public final CopyOnWriteArrayList<IMessagePowerAdapterProtocol> LLILLJJLI = new CopyOnWriteArrayList<>();

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.IMessagePowerAdapterProtocol
    public final void C() {
        Iterator<IMessagePowerAdapterProtocol> it2 = this.LLILLJJLI.iterator();
        while (it2.hasNext()) {
            it2.next().C();
        }
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.IMessagePowerAdapterProtocol
    public final void Fj() {
        Iterator<IMessagePowerAdapterProtocol> it2 = this.LLILLJJLI.iterator();
        while (it2.hasNext()) {
            it2.next().Fj();
        }
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.IMessageEventProtocol
    public final C06Z6 mh1() {
        return C06Z6.MAIN;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.IMessageEventProtocol
    public final void df1(InterfaceC904740ZeS interfaceC904740ZeS) {
        Iterator<IMessageEventProtocol> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().df1(interfaceC904740ZeS);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0054 -> B:11:0x0028). Please report as a decompilation issue!!! */
    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.IMessageEventProtocol
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object NX1(X.InterfaceC904740ZeS r6, X.InterfaceC1364105Vn<? super java.lang.Boolean> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C904760ZeU
            if (r0 == 0) goto L57
            r4 = r7
            X.0ZeU r4 = (X.C904760ZeU) r4
            int r2 = r4.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L57
            int r2 = r2 - r1
            r4.LLILZIL = r2
        L12:
            java.lang.Object r0 = r4.LLILLL
            java.lang.Object r3 = X.C099R.LJFF()
            int r1 = r4.LLILZIL
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L5d
            java.lang.Object r1 = r4.LLILLJJLI
            java.util.Iterator r1 = (java.util.Iterator) r1
            X.0ZeS r6 = r4.LL
            X.C155000ia.LIZIZ(r0)
        L28:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L3e
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        L35:
            X.C155000ia.LIZIZ(r0)
            java.util.concurrent.CopyOnWriteArrayList<com.ss.android.ugc.aweme.im.messagelist.api.ability.IMessageEventProtocol> r0 = r5.LL
            java.util.Iterator r1 = r0.iterator()
        L3e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L65
            java.lang.Object r0 = r1.next()
            com.ss.android.ugc.aweme.im.messagelist.api.ability.IMessageEventProtocol r0 = (com.ss.android.ugc.aweme.im.messagelist.api.ability.IMessageEventProtocol) r0
            r4.LL = r6
            r4.LLILLJJLI = r1
            r4.LLILZIL = r2
            java.lang.Object r0 = r0.NX1(r6, r4)
            if (r0 != r3) goto L28
            return r3
        L57:
            X.0ZeU r4 = new X.0ZeU
            r4.<init>(r5, r7)
            goto L12
        L5d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L65:
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.tools.chat.message.compact.IMEventProtocolDispatcher.NX1(X.0ZeS, X.05Vn):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.IMessagePowerAdapterProtocol
    public final void YP2(List<? extends C869590Y9l> list, List<? extends InterfaceC904740ZeS> list2, List<? extends InterfaceC1891350zJl> list3) {
        Iterator<IMessagePowerAdapterProtocol> it2 = this.LLILLJJLI.iterator();
        while (it2.hasNext()) {
            it2.next().YP2(list, list2, list3);
        }
    }
}
