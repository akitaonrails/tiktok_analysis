package com.ss.android.ugc.aweme.impl;

import X.C086T;
import X.C08TN;
import X.C0VWW;
import X.C1512800pTC;
import X.C1702420uP2;
import X.C21602719gX;
import X.C2187451AjH;
import X.C584470Mw9;
import X.C791380V2q;
import X.EnumC1609850rzj;
import X.InterfaceC2184631Aej;
import android.content.Intent;
import com.bytedance.common.jato.JatoXL;
import com.bytedance.common.jato.gfx.DoFrameController;
import com.ss.android.ugc.aweme.performanceopt.api.IOptimizerHelperService;
import java.util.Arrays;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes34.dex */
public final class OptimizerHelperServiceImpl implements IOptimizerHelperService {
    @Override // com.ss.android.ugc.aweme.performanceopt.api.IOptimizerHelperService
    public final void LIZLLL() {
    }

    @Override // com.ss.android.ugc.aweme.performanceopt.api.IOptimizerHelperService
    public final void LJIILLIIL() {
    }

    @Override // com.ss.android.ugc.aweme.performanceopt.api.IOptimizerHelperService
    public final void LJIILL() {
        int i = C2187451AjH.LIZ;
        DoFrameController.LIZIZ = 0;
    }

    @Override // com.ss.android.ugc.aweme.performanceopt.api.IOptimizerHelperService
    public final boolean LIZJ() {
        return JatoXL.isInited();
    }

    @Override // com.ss.android.ugc.aweme.performanceopt.api.IOptimizerHelperService
    public final boolean LJFF() {
        return C08TN.LIZ().LJJJJZI.ordinal() < EnumC1609850rzj.FEED_TOTAL.ordinal();
    }

    @Override // com.ss.android.ugc.aweme.performanceopt.api.IOptimizerHelperService
    public final Intent LJIJ() {
        Intent intentLIZ = C086T.LIZ();
        return intentLIZ == null ? new Intent() : intentLIZ;
    }

    @Override // com.ss.android.ugc.aweme.performanceopt.api.IOptimizerHelperService
    public final void LIZIZ() {
        C2187451AjH.LJJIIJZLJL();
    }

    @Override // com.ss.android.ugc.aweme.performanceopt.api.IOptimizerHelperService
    public final void LJIIIIZZ() {
        int i = C2187451AjH.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.performanceopt.api.IOptimizerHelperService
    public final void LJIIJ() {
        C584470Mw9.LJI();
    }

    @Override // com.ss.android.ugc.aweme.performanceopt.api.IOptimizerHelperService
    public final void LJIIJJI() {
        C2187451AjH.LJJIIZ();
    }

    @Override // com.ss.android.ugc.aweme.performanceopt.api.IOptimizerHelperService
    public final void LJIILIIL() {
        int i = C2187451AjH.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.performanceopt.api.IOptimizerHelperService
    public final void LJIJI() {
        C584470Mw9.LJIIIIZZ();
    }

    @Override // com.ss.android.ugc.aweme.performanceopt.api.IOptimizerHelperService
    public final String getCurrentFragment() {
        return C2187451AjH.LJIIIZ;
    }

    @Override // com.ss.android.ugc.aweme.performanceopt.api.IOptimizerHelperService
    public final void LIZ(String str) {
        C0VWW.LIZIZ(str);
    }

    @Override // com.ss.android.ugc.aweme.performanceopt.api.IOptimizerHelperService
    public final void LJ(long j) {
        C2187451AjH.LJJI(j);
    }

    @Override // com.ss.android.ugc.aweme.performanceopt.api.IOptimizerHelperService
    public final void LJI(InterfaceC2184631Aej interfaceC2184631Aej) {
        ((CopyOnWriteArrayList) C2187451AjH.LJIIL).remove(interfaceC2184631Aej);
    }

    @Override // com.ss.android.ugc.aweme.performanceopt.api.IOptimizerHelperService
    public final void LJIIIZ(long j) {
        C2187451AjH.LJI(j);
    }

    @Override // com.ss.android.ugc.aweme.performanceopt.api.IOptimizerHelperService
    public final void LJIIL(long j) {
        C2187451AjH.LJFF(j);
    }

    @Override // com.ss.android.ugc.aweme.performanceopt.api.IOptimizerHelperService
    public final void LJIILJJIL(C21602719gX c21602719gX) {
        C2187451AjH.LJIIZILJ(c21602719gX);
    }

    @Override // com.ss.android.ugc.aweme.performanceopt.api.IOptimizerHelperService
    public final void LJIIZILJ(C1512800pTC c1512800pTC) {
        C791380V2q c791380V2q = C791380V2q.LIZ;
        C791380V2q.LIZIZ.add(c1512800pTC);
    }

    @Override // com.ss.android.ugc.aweme.performanceopt.api.IOptimizerHelperService
    public final void sh(String str) {
        C0VWW.LJI(str);
    }

    @Override // com.ss.android.ugc.aweme.performanceopt.api.IOptimizerHelperService
    public final void LJII(long j, int... iArr) {
        C1702420uP2.LIZIZ(j, Arrays.copyOf(iArr, iArr.length));
    }
}
