package com.ss.android.ugc.aweme.ecommerce.base.selector;

import X.C01GW;
import X.C1308910kAL;
import X.C1389600mGU;
import X.C13LE;
import X.C168Q;
import X.C1697810uHb;
import X.C1766710w4j;
import X.C19719912Dl;
import X.C19741112Lp;
import X.C19F0;
import X.C20734616Bs;
import X.C214873197f;
import X.C21505619Eg;
import X.C2217381BqS;
import X.C299020Bno;
import X.C335910DEv;
import X.C452070Ho5;
import X.C452501pT;
import X.C724750Sbp;
import X.C965303pz;
import X.EnumC335920DEw;
import X.InterfaceC214877197j;
import X.InterfaceC2217461Bqa;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.scene.Scene;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.selector.EcChoosePhotoActivity;
import com.ss.android.ugc.aweme.ecommerce.base.selector.model.IEcPermissionAbility;
import com.ss.android.ugc.aweme.ecommerce.base.selector.viewmodel.EcPermissionVM;
import com.ss.android.ugc.aweme.ecommerce.core.ab.AddressConfig;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS397S0200000_31;
import kotlin.jvm.internal.AwS466S0200000_31;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS645S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class EcChoosePhotoActivity extends BaseActivity implements IEcPermissionAbility {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZIL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGExHELIOSKTYpZzw2JCAvPSAhZgAvCic8JzYpGSc8PCoNKjs6Piw4MA==";
    public final AssemVMLazy LL;
    public AwS645S0100000_31 LLILLJJLI;
    public final C01GW LLILLL;
    public C19F0<Intent> LLILZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(EcChoosePhotoActivity.class, "permissionVM", "getPermissionVM()Lcom/ss/android/ugc/aweme/ecommerce/base/selector/viewmodel/EcPermissionVM;", 0);
        C13LE.LIZ.getClass();
        LLILZIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.selector.EcChoosePhotoActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.selector.EcChoosePhotoActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.selector.EcChoosePhotoActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.selector.EcChoosePhotoActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.selector.EcChoosePhotoActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final EcPermissionVM LLLLLZL() {
        AssemVMLazy assemVMLazy = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZIL;
        return (EcPermissionVM) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.selector.model.IEcPermissionAbility
    public final void Pr() {
        C19741112Lp.LIZ.getClass();
        Intent intentLIZJ = C19741112Lp.LIZJ(this);
        C19F0<Intent> c19f0 = this.LLILZ;
        if (c19f0 != null) {
            c19f0.LIZ(intentLIZJ);
        }
    }

    public EcChoosePhotoActivity() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(EcPermissionVM.class);
        this.LL = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), new AwS568S0100000_24(c19719912DlLIZ, 327), new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS568S0100000_24((HasDefaultViewModelProviderFactory) this, 328), AFwS276S0000000_31.get$arr$(68));
        this.LLILLL = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(131));
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStop() {
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

    @Override // android.app.Activity
    public final void onEnterAnimationComplete() {
        super.onEnterAnimationComplete();
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        View viewFindViewById;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.selector.EcChoosePhotoActivity", "onCreate", true);
        super.onCreate(bundle);
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (C1389600mGU.LIZIZ(this)) {
            i = 0;
        } else {
            i = R.anim.kz;
        }
        overridePendingTransition(i, 0);
        setContentView(R.layout.ahn);
        if (((AddressConfig) C965303pz.LIZIZ.getValue()).enableE2E && (viewFindViewById = findViewById(R.id.trb)) != null) {
            viewFindViewById.setFitsSystemWindows(true);
        }
        final Class<C20734616Bs> cls = C20734616Bs.class;
        C214873197f c214873197f = new C214873197f(this, C20734616Bs.class);
        c214873197f.LJFF = R.id.i9u;
        c214873197f.LJIIIIZZ = "EcChoosePhotoActivity";
        c214873197f.LJI = false;
        c214873197f.LJII = new InterfaceC214877197j() { // from class: X.16Bt
            @Override // X.InterfaceC214877197j
            public final Scene LIZ(ClassLoader classLoader, String str, Bundle bundle2) {
                C20734616Bs c20734616Bs = null;
                if (TextUtils.equals(cls.getName(), str)) {
                    c20734616Bs = new C20734616Bs();
                    EcChoosePhotoActivity ecChoosePhotoActivity = this;
                    Bundle bundle3 = new Bundle();
                    try {
                        Bundle extras = ecChoosePhotoActivity.getIntent().getExtras();
                        if (extras != null) {
                            bundle3.putInt("result_code", extras.getInt("result_code", 0));
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    c20734616Bs.mArguments = bundle3;
                    EcPermissionVM ecPermissionVMLLLLLZL = ecChoosePhotoActivity.LLLLLZL();
                    c20734616Bs.LLJZIJLIL = ecPermissionVMLLLLLZL;
                    C736680Sv4.LJIIIIZZ(c20734616Bs, ecPermissionVMLLLLLZL, new C2217381BqS() { // from class: X.0c1K
                        @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                        public final Object get(Object obj) {
                            return Boolean.valueOf(((C995790c1J) obj).LL);
                        }
                    }, null, new AwS645S0100000_31(c20734616Bs, 91), 6);
                    c20734616Bs.LLL = ecChoosePhotoActivity;
                    ecChoosePhotoActivity.LLILLJJLI = new AwS645S0100000_31(c20734616Bs, 87);
                }
                return c20734616Bs;
            }
        };
        c214873197f.LIZ();
        this.LLILZ = registerForActivityResult(new C21505619Eg(), new C168Q() { // from class: X.16Bu
            @Override // X.C168Q
            public final void LIZ(Object obj) {
                EcPermissionVM ecPermissionVMLLLLLZL = this.LIZ.LLLLLZL();
                EcChoosePhotoActivity ecChoosePhotoActivity = this.LIZ;
                if (ecChoosePhotoActivity != null) {
                    ecPermissionVMLLLLLZL.setState(new AwS397S0200000_31(ecPermissionVMLLLLLZL, ecChoosePhotoActivity, 95));
                }
            }
        });
        EcPermissionVM ecPermissionVMLLLLLZL = LLLLLZL();
        ecPermissionVMLLLLLZL.setState(new AwS397S0200000_31(ecPermissionVMLLLLLZL, this, 95));
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.selector.EcChoosePhotoActivity", "onCreate", false);
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

    @Override // com.ss.android.ugc.aweme.ecommerce.base.selector.model.IEcPermissionAbility
    public final void vy1(AwS575S0100000_31 awS575S0100000_31) {
        C1766710w4j c1766710w4j = C1766710w4j.LIZ;
        c1766710w4j.getClass();
        if (!C1766710w4j.LIZIZ(this)) {
            C1766710w4j.LIZLLL(c1766710w4j, this, (String[]) this.LLILLL.getValue(), null, new AwS466S0200000_31(this, awS575S0100000_31, 4), 4);
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19GS, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        AwS645S0100000_31 awS645S0100000_31 = this.LLILLJJLI;
        if (awS645S0100000_31 != null && ((Boolean) awS645S0100000_31.invoke(Integer.valueOf(i), keyEvent)).booleanValue()) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }
}
