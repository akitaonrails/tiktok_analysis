package com.ss.android.ugc.aweme.pipfeed.components.single;

import X.C01GW;
import X.C1697810uHb;
import X.C587650N3b;
import X.EnumC19385810sq;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes30.dex */
public final class PipStatusViewViewModel extends ViewModel {
    public static final List<Pair<EnumC19385810sq, EnumC19385810sq>> LLILZ;
    public static final List<EnumC19385810sq> LLILZIL;
    public static final List<EnumC19385810sq> LLILZLL;
    public final MutableLiveData<EnumC19385810sq> LL = new MutableLiveData<>(EnumC19385810sq.LOADING_BLACKOUT);
    public final MutableLiveData<Boolean> LLILLJJLI;
    public final C01GW LLILLL;

    static {
        EnumC19385810sq enumC19385810sq = EnumC19385810sq.NET_ERROR;
        EnumC19385810sq enumC19385810sq2 = EnumC19385810sq.LOADING;
        EnumC19385810sq enumC19385810sq3 = EnumC19385810sq.NO_STATUS;
        EnumC19385810sq enumC19385810sq4 = EnumC19385810sq.SCREEN_TIME_LIMIT;
        LLILZ = C1697810uHb.LJIIJJI(new Pair(enumC19385810sq, enumC19385810sq2), new Pair(enumC19385810sq, enumC19385810sq3), new Pair(enumC19385810sq2, enumC19385810sq4));
        LLILZIL = C1697810uHb.LJIIJJI(enumC19385810sq3, EnumC19385810sq.TRANSITION, enumC19385810sq2);
        LLILZLL = C1697810uHb.LJIIJJI(enumC19385810sq2, EnumC19385810sq.LOADING_BLACKOUT, enumC19385810sq, enumC19385810sq4);
    }

    public PipStatusViewViewModel() {
        new MutableLiveData(EnumC19385810sq.SCREEN_TIME_LIMIT);
        this.LLILLJJLI = new MutableLiveData<>(Boolean.FALSE);
        this.LLILLL = C587650N3b.LIZ("PipStatusViewViewModel");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        if (r2 != null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
    
        r2 = (X.AbstractC1604130rqV) r7.LLILLL.getValue();
        r1 = X.C2188811AlT.LIZ();
        r1.append("start transition from ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005f, code lost:
    
        if (r5 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0061, code lost:
    
        r3 = r5.name();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0065, code lost:
    
        r1.append(r3);
        r1.append(" to ");
        r1.append(r8.name());
        r2.LJIIIZ(X.C2188811AlT.LIZIZ(r1));
        r7.LL.setValue(r8);
        r7.LLILLJJLI.setValue(java.lang.Boolean.valueOf(!com.ss.android.ugc.aweme.pipfeed.components.single.PipStatusViewViewModel.LLILZIL.contains(r8)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008f, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void vQ2(X.EnumC19385810sq r8) {
        /*
            r7 = this;
            androidx.lifecycle.MutableLiveData<X.10sq> r0 = r7.LL
            java.lang.Object r5 = r0.getValue()
            X.10sq r5 = (X.EnumC19385810sq) r5
            java.lang.String r4 = " to "
            r3 = 0
            if (r5 == r8) goto L2e
            java.util.List<kotlin.Pair<X.10sq, X.10sq>> r0 = com.ss.android.ugc.aweme.pipfeed.components.single.PipStatusViewViewModel.LLILZ
            java.util.Iterator r6 = r0.iterator()
        L13:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L4e
            java.lang.Object r2 = r6.next()
            r1 = r2
            kotlin.Pair r1 = (kotlin.Pair) r1
            java.lang.Object r0 = r1.getFirst()
            if (r0 != r5) goto L13
            java.lang.Object r0 = r1.getSecond()
            if (r0 != r8) goto L13
            if (r2 == 0) goto L4e
        L2e:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "illegal transition from "
            r1.append(r0)
            if (r5 == 0) goto L3d
            java.lang.String r3 = r5.name()
        L3d:
            r1.append(r3)
            r1.append(r4)
            java.lang.String r0 = r8.name()
            r1.append(r0)
            X.C2188811AlT.LIZIZ(r1)
            return
        L4e:
            X.01GW r0 = r7.LLILLL
            java.lang.Object r2 = r0.getValue()
            X.0rqV r2 = (X.AbstractC1604130rqV) r2
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "start transition from "
            r1.append(r0)
            if (r5 == 0) goto L65
            java.lang.String r3 = r5.name()
        L65:
            r1.append(r3)
            r1.append(r4)
            java.lang.String r0 = r8.name()
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.LJIIIZ(r0)
            androidx.lifecycle.MutableLiveData<X.10sq> r0 = r7.LL
            r0.setValue(r8)
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> r1 = r7.LLILLJJLI
            java.util.List<X.10sq> r0 = com.ss.android.ugc.aweme.pipfeed.components.single.PipStatusViewViewModel.LLILZIL
            boolean r0 = r0.contains(r8)
            r0 = r0 ^ 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.setValue(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.pipfeed.components.single.PipStatusViewViewModel.vQ2(X.10sq):void");
    }
}
