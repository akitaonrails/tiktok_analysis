package com.ss.android.ugc.tiktok.pns.privacy.setting.paprompt.ui;

import X.C0JBV;
import X.C1308910kAL;
import X.C1697810uHb;
import X.C19EH;
import X.C299020Bno;
import X.C335910DEv;
import X.EnumC335920DEw;
import X.InterfaceC1294060jmO;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingsDepService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS551S0100000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class PaPromptContainerActivity extends BaseActivity {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZjElIjs8I2s8Jzx9ODclPy4wMWs/LDsnHELIOSISsrZz8yODcjJD8nZjAlZx8yGDcjJD8nCyoiPS46JiA+CCwnITMlPTY=";

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.tiktok.pns.privacy.setting.paprompt.ui.PaPromptContainerActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.tiktok.pns.privacy.setting.paprompt.ui.PaPromptContainerActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.tiktok.pns.privacy.setting.paprompt.ui.PaPromptContainerActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.tiktok.pns.privacy.setting.paprompt.ui.PaPromptContainerActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.tiktok.pns.privacy.setting.paprompt.ui.PaPromptContainerActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    @InterfaceC1294060jmO
    public final void onBackPressed() {
        PaPromptProcessFragment paPromptProcessFragment;
        Fragment fragmentLJJJJZ = getSupportFragmentManager().LJJJJZ(R.id.tqy);
        if (!(fragmentLJJJJZ instanceof PaPromptProcessFragment) || (paPromptProcessFragment = (PaPromptProcessFragment) fragmentLJJJJZ) == null) {
            return;
        }
        paPromptProcessFragment.onBackPressed();
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        IPrivacySettingsDepService iPrivacySettingsDepService = (IPrivacySettingsDepService) PluggableExtentionKt.pluggableSpi$default(IPrivacySettingsDepService.class, false, false, false, 14, null);
        if (iPrivacySettingsDepService != null) {
            iPrivacySettingsDepService.LJJIFFI();
        }
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

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        PaPromptProcessFragment paPromptProcessFragment;
        int iIntValue;
        String stringExtra;
        Integer numLIZIZ;
        Integer numLJJIII;
        int iIntValue2 = 1;
        ActivityAgent.onTrace("com.ss.android.ugc.tiktok.pns.privacy.setting.paprompt.ui.PaPromptContainerActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.be4);
        Fragment fragmentLJJJJZI = getSupportFragmentManager().LJJJJZI("pa_prompt_process");
        if (fragmentLJJJJZI == null) {
            IPrivacySettingsDepService iPrivacySettingsDepService = (IPrivacySettingsDepService) PluggableExtentionKt.pluggableSpi$default(IPrivacySettingsDepService.class, false, false, false, 14, null);
            if (iPrivacySettingsDepService != null && (numLJJIII = iPrivacySettingsDepService.LJJIII()) != null) {
                iIntValue2 = numLJJIII.intValue();
            }
            IPrivacySettingsDepService iPrivacySettingsDepService2 = (IPrivacySettingsDepService) PluggableExtentionKt.pluggableSpi$default(IPrivacySettingsDepService.class, false, false, false, 14, null);
            if (iPrivacySettingsDepService2 != null && (numLIZIZ = iPrivacySettingsDepService2.LIZIZ()) != null) {
                iIntValue = numLIZIZ.intValue();
            } else {
                iIntValue = 0;
            }
            try {
                stringExtra = getIntent().getStringExtra("enter_position");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (stringExtra == null) {
                stringExtra = "";
            }
            fragmentLJJJJZI = C0JBV.LIZ(iIntValue2, iIntValue, stringExtra);
        }
        if ((fragmentLJJJJZI instanceof PaPromptProcessFragment) && (paPromptProcessFragment = (PaPromptProcessFragment) fragmentLJJJJZI) != null) {
            if (paPromptProcessFragment.isAdded()) {
                C19EH c19ehLJIIJ = getSupportFragmentManager().LJIIJ();
                c19ehLJIIJ.LJJIFFI(paPromptProcessFragment);
                c19ehLJIIJ.LJIIJ();
            } else {
                C19EH c19ehLJIIJ2 = getSupportFragmentManager().LJIIJ();
                c19ehLJIIJ2.LIZJ(R.id.tqy, paPromptProcessFragment, "pa_prompt_process");
                c19ehLJIIJ2.LJIIJ();
            }
            paPromptProcessFragment.LL = new AwS551S0100000_7(this, 793);
        }
        ActivityAgent.onTrace("com.ss.android.ugc.tiktok.pns.privacy.setting.paprompt.ui.PaPromptContainerActivity", "onCreate", false);
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
}
