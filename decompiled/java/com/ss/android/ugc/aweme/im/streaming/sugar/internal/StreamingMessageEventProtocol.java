package com.ss.android.ugc.aweme.im.streaming.sugar.internal;

import X.C06SA;
import X.C06Z6;
import X.C1509705vb;
import X.C1746006sc;
import X.C1758306ub;
import X.C1761406v6;
import X.C1761506v7;
import X.C1761906vB;
import X.C1762006vC;
import X.C869590Y9l;
import X.InterfaceC1364105Vn;
import X.InterfaceC904740ZeS;
import X.InterfaceC905300ZfM;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.IMessageEventProtocol;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamingMessageEventProtocol implements IMessageEventProtocol {
    public final InterfaceC905300ZfM LL;
    public final C06Z6 LLILLJJLI = C06Z6.IO;

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.IMessageEventProtocol
    public final C06Z6 mh1() {
        return this.LLILLJJLI;
    }

    public StreamingMessageEventProtocol(InterfaceC905300ZfM interfaceC905300ZfM) {
        this.LL = interfaceC905300ZfM;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.IMessageEventProtocol
    public final void df1(InterfaceC904740ZeS interfaceC904740ZeS) {
        if (interfaceC904740ZeS instanceof C1509705vb) {
            for (C869590Y9l c869590Y9l : ((C1509705vb) interfaceC904740ZeS).LIZ) {
                this.LL.CN2(c869590Y9l);
                this.LL.x50(c869590Y9l);
            }
            return;
        }
        if (interfaceC904740ZeS instanceof C1762006vC) {
            for (C869590Y9l c869590Y9l2 : ((C1762006vC) interfaceC904740ZeS).LIZ) {
                this.LL.CN2(c869590Y9l2);
                this.LL.x50(c869590Y9l2);
                this.LL.p61(c869590Y9l2);
            }
            return;
        }
        if (interfaceC904740ZeS instanceof C1761906vB) {
            for (C869590Y9l c869590Y9l3 : ((C1761906vB) interfaceC904740ZeS).LIZ) {
                this.LL.CN2(c869590Y9l3);
                this.LL.x50(c869590Y9l3);
                this.LL.p61(c869590Y9l3);
            }
            return;
        }
        if (interfaceC904740ZeS instanceof C1758306ub) {
            for (C869590Y9l c869590Y9l4 : ((C1758306ub) interfaceC904740ZeS).LIZ) {
                this.LL.CN2(c869590Y9l4);
                this.LL.x50(c869590Y9l4);
                this.LL.p61(c869590Y9l4);
            }
            return;
        }
        if (interfaceC904740ZeS instanceof C1746006sc) {
            for (C869590Y9l c869590Y9l5 : ((C1746006sc) interfaceC904740ZeS).LIZ) {
                this.LL.CN2(c869590Y9l5);
                this.LL.x50(c869590Y9l5);
                this.LL.p61(c869590Y9l5);
            }
            return;
        }
        if (interfaceC904740ZeS instanceof C06SA) {
            this.LL.CN2(((C06SA) interfaceC904740ZeS).LIZJ);
        } else if (interfaceC904740ZeS instanceof C1761406v6) {
            this.LL.AD(((C1761406v6) interfaceC904740ZeS).LIZ);
        } else {
            if (!(interfaceC904740ZeS instanceof C1761506v7)) {
                return;
            }
            this.LL.AD(((C1761506v7) interfaceC904740ZeS).LIZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.IMessageEventProtocol
    public final Object NX1(InterfaceC904740ZeS interfaceC904740ZeS, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return false;
    }
}
