package com.ss.android.ugc.aweme.impl;

import X.C0CM3;
import X.C0CME;
import X.C0CN7;
import X.C312240CLu;
import X.RunnableC2080408Da;
import com.ss.android.ugc.aweme.performanceopt.api.IDowngradeApi;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.jvm.internal.AwS578S0100000_34;

/* JADX INFO: loaded from: classes5.dex */
public final class IDowngradeServiceImpl implements IDowngradeApi {
    @Override // com.ss.android.ugc.aweme.performanceopt.api.IDowngradeApi
    public final void LIZIZ(AwS578S0100000_34 awS578S0100000_34) {
        C0CM3 c0cm3 = new C0CM3();
        c0cm3.LIZIZ = true;
        c0cm3.LIZJ = 2;
        c0cm3.LJI = awS578S0100000_34;
        C312240CLu.LIZ(c0cm3);
    }

    @Override // com.ss.android.ugc.aweme.performanceopt.api.IDowngradeApi
    public final void LJFF(Function0 function0) {
        C0CM3 c0cm3 = new C0CM3();
        c0cm3.LIZ = C0CME.FIRST_UI_FRAME;
        c0cm3.LIZIZ = true;
        c0cm3.LJI = function0;
        C312240CLu.LIZ(c0cm3);
    }

    @Override // com.ss.android.ugc.aweme.performanceopt.api.IDowngradeApi
    public final void LJI(Function0 function0) {
        C0CM3 c0cm3 = new C0CM3();
        c0cm3.LIZIZ = true;
        c0cm3.LJI = function0;
        C312240CLu.LIZ(c0cm3);
    }

    @Override // com.ss.android.ugc.aweme.performanceopt.api.IDowngradeApi
    public final void LIZLLL(Function0 function0, boolean z) {
        C0CM3 c0cm3 = new C0CM3();
        c0cm3.LIZ = C0CME.SCROLL_END;
        c0cm3.LIZIZ = z;
        c0cm3.LJI = function0;
        C312240CLu.LIZ(c0cm3);
    }

    @Override // com.ss.android.ugc.aweme.performanceopt.api.IDowngradeApi
    public final void LIZ(long j, RunnableC2080408Da runnableC2080408Da, String str) {
        C0CM3 c0cm3 = new C0CM3();
        c0cm3.LIZIZ = true;
        c0cm3.LIZLLL = j;
        c0cm3.LJFF = str;
        c0cm3.LJI = new C0CN7(runnableC2080408Da);
        C312240CLu.LIZ(c0cm3);
    }

    @Override // com.ss.android.ugc.aweme.performanceopt.api.IDowngradeApi
    public final void LIZJ(long j, RunnableC2080408Da runnableC2080408Da, String str) {
        C0CM3 c0cm3 = new C0CM3();
        c0cm3.LIZ = C0CME.FIRST_UI_FRAME;
        c0cm3.LIZIZ = true;
        c0cm3.LIZLLL = j;
        c0cm3.LJFF = str;
        c0cm3.LJI = new AwS548S0100000_4(runnableC2080408Da, 495);
        C312240CLu.LIZ(c0cm3);
    }

    @Override // com.ss.android.ugc.aweme.performanceopt.api.IDowngradeApi
    public final void LJ(long j, String str, int i, Runnable runnable) {
        C0CM3 c0cm3 = new C0CM3();
        c0cm3.LIZIZ = true;
        c0cm3.LIZLLL = j;
        c0cm3.LJFF = str;
        c0cm3.LJ = i;
        c0cm3.LJI = new AwS548S0100000_4(runnable, 496);
        C312240CLu.LIZ(c0cm3);
    }
}
