package com.ss.android.ugc.aweme.tools.draft;

import X.ActivityC214874197g;
import X.C0C64;
import X.C0CHQ;
import X.C0MB1;
import X.C0WZX;
import X.C1192870h9B;
import X.C11S5;
import X.C11VU;
import X.C1202330hOR;
import X.C122T;
import X.C1308910kAL;
import X.C1388190mED;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C1397620mTQ;
import X.C1439910nZd;
import X.C1444700nhM;
import X.C1697810uHb;
import X.C1701330uNH;
import X.C19514711Wn;
import X.C19565911gn;
import X.C19EG;
import X.C19EH;
import X.C2204961BRm;
import X.C299020Bno;
import X.C330790Cxx;
import X.C335910DEv;
import X.C533930Kwp;
import X.C560530Lyd;
import X.C581130Mql;
import X.EnumC335920DEw;
import X.InterfaceC362610EJn;
import X.InterfaceC484050IyZ;
import X.InterfaceC524950KiL;
import Y.AObjectS351S0100000_8;
import Y.AObjectS383S0100000_8;
import Y.ARunnableS104S0100000_4;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.internal.AVCommerceServiceImpl;
import com.ss.android.ugc.aweme.specact.api.ISpecActService;
import com.ss.android.ugc.aweme.tools.draft.draftbox.DraftBoxFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes9.dex */
public class DraftBoxActivity extends ActivityC214874197g implements InterfaceC524950KiL, C0MB1 {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjEjHELIOSJiMgZiE+KCknZgE+KCknCio0CCwnITMlPTY=";
    public Fragment LL;
    public final ArrayList<InterfaceC362610EJn> LLILLJJLI = new ArrayList<>();
    public final C560530Lyd<Boolean> LLILLL = new C560530Lyd<>();
    public final C560530Lyd<Boolean> LLILZ = new C560530Lyd<>();

    @Override // X.InterfaceC524950KiL
    public final void Qh(InterfaceC484050IyZ interfaceC484050IyZ) {
    }

    @Override // X.InterfaceC524950KiL
    public final void T4(InterfaceC484050IyZ interfaceC484050IyZ) {
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.tools.draft.DraftBoxActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.tools.draft.DraftBoxActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.tools.draft.DraftBoxActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.ActivityC214874197g
    public final C1202330hOR LLLLLZL() {
        C1192870h9B.LIZ.getClass();
        return C1192870h9B.LIZJ;
    }

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        Iterator<InterfaceC362610EJn> it2 = this.LLILLJJLI.iterator();
        while (it2.hasNext() && !it2.next().onKeyDown(4, null)) {
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.tools.draft.DraftBoxActivity", "onStart", true);
        super.onStart();
        C0CHQ.LIZ().getPublishService().LJJJJJ().LIZLLL();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.tools.draft.DraftBoxActivity", "onStart", false);
    }

    static {
        C19565911gn.LIZ();
        C122T.LIZ();
    }

    public final void init() {
        Bundle extras;
        Fragment fragmentLJJJJZ = getSupportFragmentManager().LJJJJZ(R.id.iiv);
        this.LL = fragmentLJJJJZ;
        if (fragmentLJJJJZ == null) {
            this.LL = C0C64.LJIILLIIL().LJIJ(31744, 1, "draft_box_count_and_size", true) == 1 ? new DraftBoxFragment() : new DraftFragment();
            if (getIntent() != null) {
                Fragment fragment = this.LL;
                try {
                    extras = getIntent().getExtras();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    extras = null;
                }
                fragment.setArguments(extras);
            }
            C19EH c19ehLJIIJ = getSupportFragmentManager().LJIIJ();
            c19ehLJIIJ.LIZIZ(R.id.iiv, this.LL);
            c19ehLJIIJ.LJII(null);
            c19ehLJIIJ.LJIIJ();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        AVCommerceServiceImpl.LJIIJ().LIZJ();
        ((ISpecActService) ServiceManager.get().getService(ISpecActService.class)).LJJJJZI();
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStop() {
        C0CHQ.LIZ().getPublishService().LJJJJJ().LIZ();
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        try {
            getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }

    public static void LLLLZLLLI(Context context) {
        C1397620mTQ c1397620mTQ = new C1397620mTQ(context);
        c1397620mTQ.LIZJ(0, context.getResources().getString(2131849194), new AObjectS351S0100000_8(context, 9));
        c1397620mTQ.LJII(2131849193, null);
        C1397580mTM c1397580mTM = new C1397580mTM(context);
        c1397580mTM.LIZ(2131832434);
        c1397580mTM.LJIIL = c1397620mTQ;
        new C1397510mTF(c1397580mTM).LIZLLL();
    }

    @Override // X.InterfaceC524950KiL
    public final void AH(InterfaceC362610EJn interfaceC362610EJn) {
        ListProtector.add(this.LLILLJJLI, 0, interfaceC362610EJn);
    }

    @Override // X.InterfaceC524950KiL
    public final void b8(InterfaceC362610EJn interfaceC362610EJn) {
        this.LLILLJJLI.remove(interfaceC362610EJn);
    }

    @Override // X.InterfaceC524950KiL
    public final void kF(InterfaceC362610EJn interfaceC362610EJn) {
        this.LLILLJJLI.add(interfaceC362610EJn);
    }

    @Override // X.ActivityC214874197g, X.AbstractActivityC19422710yn, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        boolean zLJI = MethodIDManager.LJI(71984);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.tools.draft.DraftBoxActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.jq);
        C0CHQ.LIZ().LJJIIJZLJL().getMonitor().LIZ();
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_draft_not_request_album_permission", true, false)) {
            init();
        } else {
            LLLLZLLIL(this, new AObjectS383S0100000_8(this, 22), new AObjectS383S0100000_8(this, 23));
        }
        C0CHQ.LIZ().getPublishService().LJJIJIIJIL();
        C1444700nhM.LIZ();
        C1439910nZd.LIZ();
        C0CHQ.LIZ().getPublishService().LJIIIIZZ();
        C0CHQ.LIZ().getPublishService().LJJLIIIIJ().LIZ();
        AVCommerceServiceImpl.LJIIJ().LIZLLL((int) C11VU.LIZIZ(15.0f, this));
        Intent intent = getIntent();
        C330790Cxx.LIZ.getClass();
        C11S5.LIZIZ.LIZIZ(new ARunnableS104S0100000_4(intent, 116));
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.tools.draft.DraftBoxActivity", "onCreate", false);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (intent == null) {
            return;
        }
        C330790Cxx.LIZ.getClass();
        C11S5.LIZIZ.LIZIZ(new ARunnableS104S0100000_4(intent, 116));
        this.LLILLL.LJIIJ(Boolean.valueOf(intent.getBooleanExtra("need_finish_posted_draft_fragment", false)));
        this.LLILZ.LJIIJ(Boolean.valueOf(intent.getBooleanExtra("need_refresh_draft", false)));
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        boolean z;
        super.setTheme(i);
        if (C299020Bno.LIZ() != 0) {
            boolean z2 = false;
            if (!C1697810uHb.LJIIJJI(Integer.valueOf(R.style.a9t), Integer.valueOf(R.style.a9u), Integer.valueOf(R.style.a9v), Integer.valueOf(R.style.a9s)).contains(Integer.valueOf(i))) {
                Integer numLIZ = C1308910kAL.LIZ(R.attr.g0c, this);
                if (numLIZ != null && numLIZ.intValue() == -1) {
                    z = true;
                } else {
                    z = false;
                }
                Integer numLIZ2 = C1308910kAL.LIZ(R.attr.g0d, this);
                if (numLIZ2 == null || numLIZ2.intValue() != 0) {
                    z2 = true;
                }
                if (z) {
                    getTheme().applyStyle(R.style.a9u, true);
                } else {
                    getTheme().applyStyle(R.style.a9t, true);
                }
                if (z2) {
                    getTheme().applyStyle(R.style.a9v, true);
                } else {
                    getTheme().applyStyle(R.style.a9s, true);
                }
            }
        }
        EnumC335920DEw enumC335920DEwLIZ = C335910DEv.LIZ();
        if (enumC335920DEwLIZ == EnumC335920DEw.V1) {
            getTheme().applyStyle(R.style.a9x, true);
        } else {
            if (enumC335920DEwLIZ != EnumC335920DEw.V2) {
                return;
            }
            getTheme().applyStyle(R.style.a9y, true);
        }
    }

    public static void LLLLZLL(Context context, Intent intent) {
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
        C1701330uNH.LIZ(intent, context);
        C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6nbJPdkjb1xjMDJZX5xzzpEu08SmmujryVlhA=", null));
    }

    public static void LLLLZLLIL(Context context, Function0<Void> function0, Function0<Void> function02) {
        C19514711Wn c19514711WnLIZLLL;
        if (!(context instanceof C19EG)) {
            function0.invoke();
            return;
        }
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        if (C533930Kwp.LIZJ()) {
            function0.invoke();
            return;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            c19514711WnLIZLLL = C19514711Wn.LIZLLL(c19egLIZIZ, TokenCert.with("bpea-tools_request_storage_permission_draft_box_target33"));
            c19514711WnLIZLLL.LIZIZ("android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO");
        } else {
            c19514711WnLIZLLL = C19514711Wn.LIZLLL(c19egLIZIZ, TokenCert.with("bpea-tools_request_storage_permission_draft_box"));
            c19514711WnLIZLLL.LIZIZ("android.permission.WRITE_EXTERNAL_STORAGE");
        }
        c19514711WnLIZLLL.LIZJ(new C581130Mql(function0, function02, 1));
    }
}
