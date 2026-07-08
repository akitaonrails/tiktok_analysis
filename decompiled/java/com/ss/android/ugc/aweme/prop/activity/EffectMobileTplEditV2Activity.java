package com.ss.android.ugc.aweme.prop.activity;

import X.C0LAB;
import X.C0WZX;
import X.C128Y;
import X.C1308910kAL;
import X.C1449260noi;
import X.C1697810uHb;
import X.C1737900vKG;
import X.C19EH;
import X.C2204961BRm;
import X.C299020Bno;
import X.C335910DEv;
import X.C786410Ut5;
import X.EnumC335920DEw;
import X.InterfaceC1736490vHz;
import X.InterfaceC1737690vJv;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.immersionbar.ImmersionBar;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.aweme.prop.fragment.MobileEffectDoneFragment;
import com.ss.android.ugc.aweme.prop.fragment.MobileEffectEditV2Fragment;
import com.ss.android.ugc.aweme.prop.mobileefffect.EffectDoneInitState;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.MobileEffectData;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class EffectMobileTplEditV2Activity extends BaseActivity implements InterfaceC1736490vHz {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjU+Jj99KSY4IDHELIOSk6PDxiDCk1LSY4BCAxISkpHT8/DSElPRlhCSY4IDk6PDw=";

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.prop.activity.EffectMobileTplEditV2Activity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.prop.activity.EffectMobileTplEditV2Activity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.prop.activity.EffectMobileTplEditV2Activity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.prop.activity.EffectMobileTplEditV2Activity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.prop.activity.EffectMobileTplEditV2Activity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        InterfaceC1737690vJv interfaceC1737690vJv;
        C128Y c128yLJJJJZ = getSupportFragmentManager().LJJJJZ(R.id.iiq);
        Boolean boolValueOf = null;
        if ((c128yLJJJJZ instanceof InterfaceC1737690vJv) && (interfaceC1737690vJv = (InterfaceC1737690vJv) c128yLJJJJZ) != null) {
            boolValueOf = Boolean.valueOf(interfaceC1737690vJv.onBackPressed());
        }
        if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
            return;
        }
        super.onBackPressed();
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

    @Override // X.InterfaceC1736490vHz
    public final void LIZLLL(EffectDoneInitState effectDoneInitState) {
        MobileEffectDoneFragment mobileEffectDoneFragment = new MobileEffectDoneFragment();
        Bundle bundle = new Bundle();
        C786410Ut5.LJJIJL(bundle, "mobile_effect_done_state", effectDoneInitState);
        mobileEffectDoneFragment.setArguments(bundle);
        C19EH c19ehLJIIJ = getSupportFragmentManager().LJIIJ();
        c19ehLJIIJ.LJIJ(R.id.iiq, mobileEffectDoneFragment, null);
        c19ehLJIIJ.LJIIIZ();
    }

    @Override // X.InterfaceC1736490vHz
    public final void LJJ(String str) throws Throwable {
        C2204961BRm.g(this, new Intent().putExtra("save_draft_id", str), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPq6bI+A3TGmNQa8Ykkn0uh5XE9q1PynEuwpD2ONqA6gxZKT0crxl8Lrfhk=", null));
        finish();
    }

    @Override // X.InterfaceC1736490vHz
    public final void LJJI(String str) throws Throwable {
        C2204961BRm.g(this, new Intent().putExtra("published_effect_id", str), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPq6bI+A3TGmNQa8Ykkn0uh5XE9q1PynEuwpD2ONqA6gxZKT0crxl8Lrfhk=", null));
        finish();
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Bundle extras;
        MobileEffectData mobileEffectData;
        String string;
        Bundle extras2;
        String string2;
        Bundle extras3;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.prop.activity.EffectMobileTplEditV2Activity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.jj);
        TuxImmersionBar tuxImmersionBar = new TuxImmersionBar(this, ImmersionBar.LJIILJJIL(this));
        tuxImmersionBar.LJIIIIZZ(R.attr.bx);
        tuxImmersionBar.LJ(R.attr.bx);
        tuxImmersionBar.LIZ(true);
        tuxImmersionBar.LIZLLL();
        try {
            extras = getIntent().getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            extras = null;
        }
        if (extras != null) {
            mobileEffectData = (MobileEffectData) extras.getParcelable("effect_init_data");
        } else {
            mobileEffectData = null;
        }
        if (!(mobileEffectData instanceof MobileEffectData)) {
            mobileEffectData = null;
        }
        if (mobileEffectData == null) {
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.prop.activity.EffectMobileTplEditV2Activity", "onCreate", false);
            return;
        }
        try {
            extras3 = getIntent().getExtras();
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        if (extras3 == null) {
            string = null;
        } else {
            string = extras3.getString("ENTER_FROM");
        }
        mobileEffectData.enterFrom = String.valueOf(string);
        MobileEffectEditV2Fragment mobileEffectEditV2Fragment = new MobileEffectEditV2Fragment();
        Bundle bundle2 = new Bundle();
        C786410Ut5.LJJIJL(bundle2, "effect_init_data", mobileEffectData);
        try {
            extras2 = getIntent().getExtras();
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
            extras2 = null;
        }
        if (extras2 != null) {
            string2 = extras2.getString("effect_sdk_extra");
        } else {
            string2 = null;
        }
        C786410Ut5.LJJJI("effect_sdk_extra", string2, bundle2);
        mobileEffectEditV2Fragment.setArguments(bundle2);
        C19EH c19ehLJIIJ = getSupportFragmentManager().LJIIJ();
        c19ehLJIIJ.LJIJ(R.id.iiq, mobileEffectEditV2Fragment, null);
        c19ehLJIIJ.LJIIIZ();
        C0LAB c0labLJFF = C1737900vKG.LJFF(mobileEffectData);
        c0labLJFF.LJ("enter_from", mobileEffectData.enterFrom);
        C1449260noi.LJ("mobile_effect_edit_entrance", c0labLJFF.LIZ);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.prop.activity.EffectMobileTplEditV2Activity", "onCreate", false);
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

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Fragment fragmentLJJJJZ = getSupportFragmentManager().LJJJJZ(R.id.iiq);
        if (fragmentLJJJJZ != null) {
            fragmentLJJJJZ.onActivityResult(i, i2, intent);
        }
    }
}
