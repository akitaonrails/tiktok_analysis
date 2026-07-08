package com.ss.android.ugc.aweme.minis.payment.subscription.page;

import X.C01GW;
import X.C098200Yq;
import X.C1389890mGx;
import X.C1685300txQ;
import X.C1841240y0w;
import X.C1841350y17;
import X.C189200o6;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2195221Avo;
import X.C452501pT;
import X.C786410Ut5;
import X.EnumC1841230y0v;
import Y.ACListenerS161S0100000_27;
import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.minis.payment.subscription.data.MinisSubscriptionSheetParams;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS571S0100000_27;

/* JADX INFO: loaded from: classes28.dex */
public final class MinisSubscriptionFragment extends BaseFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiglJyYgZjUtMCI2JjFiOjoxHELIOSOyY+ID8nISoiZz8yLyBiBCY9ITYfPC0gKzclOTs6JysKOy40JSAiPQ==";
    public Function1<? super MinisSubscriptionSheetParams, Unit> LLIZ;
    public Function0<Unit> LLIZLLLIL;
    public View LLJI;
    public TuxTextView LLJIJIL;
    public TuxTextView LLJILJIL;
    public TuxTextView LLJILJILJ;
    public TuxIconView LLJILLL;
    public TuxTextView LLJJ;
    public TuxTextView LLJJI;
    public TuxTextView LLJJIII;
    public C197039127h LLJJIJI;
    public TuxTextView LLJJIJIIJIL;
    public TuxTextView LLJJIJIL;
    public TuxTextView LLJJJ;
    public TuxTextView LLJJJIL;
    public TuxTextView LLJJJJ;
    public View LLJJJJJIL;
    public C1841350y17 LLJJJJLIIL;
    public C1841350y17 LLJJL;
    public TuxTextView LLJJLIIIJLLLLLLLZ;
    public TuxTextView LLJL;
    public boolean LLJLILLLLZIIL;
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 608));
    public EnumC1841230y0v LLJLIL = EnumC1841230y0v.WEB;
    public final ACListenerS161S0100000_27 LLJLL = new ACListenerS161S0100000_27(this, 54);

    public final void SR() {
        C197039127h c197039127h = this.LLJJIJI;
        if (c197039127h != null) {
            c197039127h.setLoading(false);
        }
    }

    public final MinisSubscriptionSheetParams UR() {
        return (MinisSubscriptionSheetParams) this.LLJ.getValue();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        int i = C2187451AjH.LIZ;
    }

    public final void VR(String str) {
        Activity activityLIZLLL = C2195221Avo.LIZLLL();
        if (activityLIZLLL != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(activityLIZLLL);
            c1389890mGx.LJ(Integer.valueOf(R.style.y0));
            c1389890mGx.LJIIJ(str);
            c1389890mGx.LJIIJJI();
        }
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("showResultToast, instance:");
        sbLIZ.append(activityLIZLLL);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x011e A[PHI: r2
      0x011e: PHI (r2v9 com.ss.android.ugc.aweme.minis.model.payment.subscription.DiscountInfo) = 
      (r2v8 com.ss.android.ugc.aweme.minis.model.payment.subscription.DiscountInfo)
      (r2v12 com.ss.android.ugc.aweme.minis.model.payment.subscription.DiscountInfo)
      (r2v12 com.ss.android.ugc.aweme.minis.model.payment.subscription.DiscountInfo)
     binds: [B:99:0x011b, B:69:0x00da, B:71:0x00de] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0132 A[PHI: r2
      0x0132: PHI (r2v7 java.lang.String) = (r2v5 java.lang.String), (r2v11 java.lang.String) binds: [B:109:0x0130, B:107:0x012c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01b4 A[PHI: r0 r12 r13
      0x01b4: PHI (r0v2 java.lang.String) = (r0v1 java.lang.String), (r0v45 java.lang.String), (r0v45 java.lang.String) binds: [B:22:0x002d, B:31:0x0042, B:33:0x0046] A[DONT_GENERATE, DONT_INLINE]
      0x01b4: PHI (r12v1 java.lang.String) = (r12v0 java.lang.String), (r12v8 java.lang.String), (r12v8 java.lang.String) binds: [B:22:0x002d, B:31:0x0042, B:33:0x0046] A[DONT_GENERATE, DONT_INLINE]
      0x01b4: PHI (r13v2 java.lang.String) = (r13v1 java.lang.String), (r13v6 java.lang.String), (r13v6 java.lang.String) binds: [B:22:0x002d, B:31:0x0042, B:33:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01b9 A[PHI: r0 r2 r12 r13
      0x01b9: PHI (r0v3 java.lang.String) = (r0v2 java.lang.String), (r0v44 java.lang.String), (r0v44 java.lang.String) binds: [B:142:0x01b5, B:36:0x004e, B:38:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x01b9: PHI (r2v1 java.lang.String) = (r2v0 java.lang.String), (r2v18 java.lang.String), (r2v18 java.lang.String) binds: [B:142:0x01b5, B:36:0x004e, B:38:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x01b9: PHI (r12v2 java.lang.String) = (r12v1 java.lang.String), (r12v7 java.lang.String), (r12v7 java.lang.String) binds: [B:142:0x01b5, B:36:0x004e, B:38:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x01b9: PHI (r13v3 java.lang.String) = (r13v2 java.lang.String), (r13v5 java.lang.String), (r13v5 java.lang.String) binds: [B:142:0x01b5, B:36:0x004e, B:38:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x001e A[PHI: r13
      0x001e: PHI (r13v7 java.lang.String) = (r13v0 java.lang.String), (r13v8 java.lang.String) binds: [B:14:0x001c, B:12:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002c A[PHI: r13
      0x002c: PHI (r13v1 java.lang.String) = (r13v0 java.lang.String), (r13v7 java.lang.String), (r13v7 java.lang.String), (r13v7 java.lang.String) binds: [B:14:0x001c, B:16:0x0022, B:18:0x0026, B:20:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002f A[PHI: r12 r13
      0x002f: PHI (r12v8 java.lang.String) = (r12v0 java.lang.String), (r12v9 java.lang.String) binds: [B:22:0x002d, B:20:0x002a] A[DONT_GENERATE, DONT_INLINE]
      0x002f: PHI (r13v6 java.lang.String) = (r13v1 java.lang.String), (r13v7 java.lang.String) binds: [B:22:0x002d, B:20:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void WR(X.EnumC1841230y0v r15) {
        /*
            Method dump skipped, instruction units count: 447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.minis.payment.subscription.page.MinisSubscriptionFragment.WR(X.0y0v):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0309 A[PHI: r12
      0x0309: PHI (r12v9 com.ss.android.ugc.aweme.minis.model.payment.subscription.DiscountInfo) = 
      (r12v1 com.ss.android.ugc.aweme.minis.model.payment.subscription.DiscountInfo)
      (r12v10 com.ss.android.ugc.aweme.minis.model.payment.subscription.DiscountInfo)
     binds: [B:357:0x0755, B:137:0x0307] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03fb A[PHI: r8
      0x03fb: PHI (r8v10 com.ss.android.ugc.aweme.minis.model.payment.subscription.DiscountInfo) = 
      (r8v8 com.ss.android.ugc.aweme.minis.model.payment.subscription.DiscountInfo)
      (r8v12 com.ss.android.ugc.aweme.minis.model.payment.subscription.DiscountInfo)
     binds: [B:335:0x068f, B:181:0x03f9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x058c  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0592  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x05c6  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x05d1  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x05f0  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0610 A[PHI: r7
      0x0610: PHI (r7v5 java.lang.String) = (r7v4 java.lang.String), (r7v7 java.lang.String), (r7v7 java.lang.String) binds: [B:304:0x060c, B:251:0x0569, B:253:0x056d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0619  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x061c  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x068e  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0693  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x06fa  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0703  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0722  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x075a  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x079b  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x080d  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0811  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0817 A[PHI: r20
      0x0817: PHI (r20v1 java.lang.String) = (r20v0 java.lang.String), (r20v13 java.lang.String) binds: [B:396:0x0813, B:97:0x028e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:401:0x081c A[PHI: r1 r20
      0x081c: PHI (r1v27 java.lang.String) = (r1v26 java.lang.String), (r1v74 java.lang.String) binds: [B:399:0x0818, B:100:0x0294] A[DONT_GENERATE, DONT_INLINE]
      0x081c: PHI (r20v2 java.lang.String) = (r20v1 java.lang.String), (r20v12 java.lang.String) binds: [B:399:0x0818, B:100:0x0294] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:404:0x0821 A[PHI: r1 r15 r20
      0x0821: PHI (r1v28 java.lang.String) = (r1v27 java.lang.String), (r1v73 java.lang.String) binds: [B:402:0x081d, B:103:0x029a] A[DONT_GENERATE, DONT_INLINE]
      0x0821: PHI (r15v1 java.lang.String) = (r15v0 java.lang.String), (r15v13 java.lang.String) binds: [B:402:0x081d, B:103:0x029a] A[DONT_GENERATE, DONT_INLINE]
      0x0821: PHI (r20v3 java.lang.String) = (r20v2 java.lang.String), (r20v11 java.lang.String) binds: [B:402:0x081d, B:103:0x029a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:407:0x0826 A[PHI: r1 r13 r15 r20
      0x0826: PHI (r1v29 java.lang.String) = (r1v28 java.lang.String), (r1v72 java.lang.String) binds: [B:405:0x0822, B:106:0x02a0] A[DONT_GENERATE, DONT_INLINE]
      0x0826: PHI (r13v3 java.lang.String) = (r13v2 java.lang.String), (r13v12 java.lang.String) binds: [B:405:0x0822, B:106:0x02a0] A[DONT_GENERATE, DONT_INLINE]
      0x0826: PHI (r15v2 java.lang.String) = (r15v1 java.lang.String), (r15v12 java.lang.String) binds: [B:405:0x0822, B:106:0x02a0] A[DONT_GENERATE, DONT_INLINE]
      0x0826: PHI (r20v4 java.lang.String) = (r20v3 java.lang.String), (r20v10 java.lang.String) binds: [B:405:0x0822, B:106:0x02a0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:410:0x082c A[PHI: r1 r13 r15 r19 r20
      0x082c: PHI (r1v30 java.lang.String) = (r1v29 java.lang.String), (r1v71 java.lang.String) binds: [B:408:0x0828, B:109:0x02a8] A[DONT_GENERATE, DONT_INLINE]
      0x082c: PHI (r13v4 java.lang.String) = (r13v3 java.lang.String), (r13v11 java.lang.String) binds: [B:408:0x0828, B:109:0x02a8] A[DONT_GENERATE, DONT_INLINE]
      0x082c: PHI (r15v3 java.lang.String) = (r15v2 java.lang.String), (r15v11 java.lang.String) binds: [B:408:0x0828, B:109:0x02a8] A[DONT_GENERATE, DONT_INLINE]
      0x082c: PHI (r19v1 java.lang.String) = (r19v0 java.lang.String), (r19v5 java.lang.String) binds: [B:408:0x0828, B:109:0x02a8] A[DONT_GENERATE, DONT_INLINE]
      0x082c: PHI (r20v5 java.lang.String) = (r20v4 java.lang.String), (r20v9 java.lang.String) binds: [B:408:0x0828, B:109:0x02a8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0831 A[PHI: r1 r11 r13 r15 r19 r20
      0x0831: PHI (r1v31 java.lang.String) = (r1v30 java.lang.String), (r1v70 java.lang.String) binds: [B:411:0x082d, B:112:0x02ae] A[DONT_GENERATE, DONT_INLINE]
      0x0831: PHI (r11v1 java.lang.String) = (r11v0 java.lang.String), (r11v7 java.lang.String) binds: [B:411:0x082d, B:112:0x02ae] A[DONT_GENERATE, DONT_INLINE]
      0x0831: PHI (r13v5 java.lang.String) = (r13v4 java.lang.String), (r13v10 java.lang.String) binds: [B:411:0x082d, B:112:0x02ae] A[DONT_GENERATE, DONT_INLINE]
      0x0831: PHI (r15v4 java.lang.String) = (r15v3 java.lang.String), (r15v10 java.lang.String) binds: [B:411:0x082d, B:112:0x02ae] A[DONT_GENERATE, DONT_INLINE]
      0x0831: PHI (r19v2 java.lang.String) = (r19v1 java.lang.String), (r19v4 java.lang.String) binds: [B:411:0x082d, B:112:0x02ae] A[DONT_GENERATE, DONT_INLINE]
      0x0831: PHI (r20v6 java.lang.String) = (r20v5 java.lang.String), (r20v8 java.lang.String) binds: [B:411:0x082d, B:112:0x02ae] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:417:0x083a A[PHI: r22
      0x083a: PHI (r22v1 java.lang.String) = (r22v0 java.lang.String), (r22v10 java.lang.String) binds: [B:415:0x0836, B:73:0x023d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:420:0x0840 A[PHI: r21 r22
      0x0840: PHI (r21v1 java.lang.Object) = (r21v26 java.lang.Object), (r21v27 java.lang.Object) binds: [B:418:0x083c, B:76:0x0245] A[DONT_GENERATE, DONT_INLINE]
      0x0840: PHI (r22v2 java.lang.String) = (r22v1 java.lang.String), (r22v9 java.lang.String) binds: [B:418:0x083c, B:76:0x0245] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:423:0x0845 A[PHI: r6 r21 r22
      0x0845: PHI (r6v8 java.lang.String) = (r6v7 java.lang.String), (r6v16 java.lang.String) binds: [B:421:0x0841, B:79:0x024b] A[DONT_GENERATE, DONT_INLINE]
      0x0845: PHI (r21v2 java.lang.Object) = (r21v24 java.lang.Object), (r21v25 java.lang.Object) binds: [B:421:0x0841, B:79:0x024b] A[DONT_GENERATE, DONT_INLINE]
      0x0845: PHI (r22v3 java.lang.String) = (r22v2 java.lang.String), (r22v8 java.lang.String) binds: [B:421:0x0841, B:79:0x024b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:426:0x084a A[PHI: r5 r6 r21 r22
      0x084a: PHI (r5v6 java.lang.String) = (r5v5 java.lang.String), (r5v10 java.lang.String) binds: [B:424:0x0846, B:82:0x0251] A[DONT_GENERATE, DONT_INLINE]
      0x084a: PHI (r6v9 java.lang.String) = (r6v8 java.lang.String), (r6v15 java.lang.String) binds: [B:424:0x0846, B:82:0x0251] A[DONT_GENERATE, DONT_INLINE]
      0x084a: PHI (r21v3 java.lang.Object) = (r21v22 java.lang.Object), (r21v23 java.lang.Object) binds: [B:424:0x0846, B:82:0x0251] A[DONT_GENERATE, DONT_INLINE]
      0x084a: PHI (r22v4 java.lang.String) = (r22v3 java.lang.String), (r22v7 java.lang.String) binds: [B:424:0x0846, B:82:0x0251] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0290  */
    /* JADX WARN: Type inference failed for: r0v32, types: [T, java.lang.String] */
    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r24, android.os.Bundle r25) {
        /*
            Method dump skipped, instruction units count: 2164
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.minis.payment.subscription.page.MinisSubscriptionFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        if (C1841240y0w.LIZ()) {
            i = R.layout.dnc;
        } else {
            i = R.layout.dnb;
        }
        View viewTd = C786410Ut5.Td(layoutInflater, i, viewGroup, false);
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onCreateView, view:");
        sbLIZ.append(viewTd);
        C2188811AlT.LIZIZ(sbLIZ);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }
}
