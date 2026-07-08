package com.ss.android.ugc.aweme.im.streaming.sugar.internal;

import X.C01GW;
import X.C05XL;
import X.C06SA;
import X.C06Z6;
import X.C095D;
import X.C452501pT;
import X.C869590Y9l;
import X.C905310ZfN;
import X.C905320ZfO;
import X.C905340ZfQ;
import X.C905350ZfR;
import X.C905950ZgP;
import X.EnumC905800ZgA;
import X.InterfaceC1364105Vn;
import X.InterfaceC904740ZeS;
import X.InterfaceC905630Zft;
import X.InterfaceC905750Zg5;
import com.ss.android.ugc.aweme.im.streaming.api.RetryInfoComponent;
import com.ss.android.ugc.aweme.im.streaming.sugar.StreamingSugar;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class StreamingSugarImpl implements StreamingSugar {
    public final InterfaceC905750Zg5 LL;
    public final InterfaceC905630Zft LLILLJJLI;
    public final C06Z6 LLILLL = C06Z6.IO;
    public final ConcurrentHashMap<String, C05XL<C869590Y9l>> LLILZ = new ConcurrentHashMap<>();
    public final C01GW LLILZIL = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(266));

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.IMessageEventProtocol
    public final C06Z6 mh1() {
        return this.LLILLL;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.IMessageEventProtocol
    public final void df1(InterfaceC904740ZeS interfaceC904740ZeS) {
        C06SA c06sa;
        if ((interfaceC904740ZeS instanceof C06SA) && (c06sa = (C06SA) interfaceC904740ZeS) != null) {
            for (Map.Entry<String, C05XL<C869590Y9l>> entry : this.LLILZ.entrySet()) {
                String key = entry.getKey();
                C05XL<C869590Y9l> value = entry.getValue();
                if (Intrinsics.LJFF(c06sa.LIZJ.getUuid(), key) && c06sa.LIZJ.isSuccessStatus()) {
                    value.LJIIZILJ(c06sa.LIZJ);
                    return;
                }
            }
        }
    }

    public StreamingSugarImpl(C905950ZgP c905950ZgP, InterfaceC905630Zft interfaceC905630Zft) {
        this.LL = c905950ZgP;
        this.LLILLJJLI = interfaceC905630Zft;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.IMessageEventProtocol
    public final Object NX1(InterfaceC904740ZeS interfaceC904740ZeS, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.im.streaming.sugar.StreamingSugar
    public final C095D Rx1(C905340ZfQ c905340ZfQ, RetryInfoComponent retryInfoComponent, EnumC905800ZgA enumC905800ZgA) {
        return new C095D(new C905310ZfN(c905340ZfQ, this, enumC905800ZgA, retryInfoComponent, null));
    }

    @Override // com.ss.android.ugc.aweme.im.streaming.sugar.StreamingSugar
    public final C095D l42(C905350ZfR c905350ZfR, RetryInfoComponent retryInfoComponent, EnumC905800ZgA enumC905800ZgA) {
        return new C095D(new C905320ZfO(c905350ZfR, this, enumC905800ZgA, retryInfoComponent, null));
    }
}
