package com.ss.android.ugc.aweme.publish.activity;

import X.C01GW;
import X.C0CHQ;
import X.C0WZX;
import X.C128Y;
import X.C1308910kAL;
import X.C14K9;
import X.C1697810uHb;
import X.C19EH;
import X.C2204961BRm;
import X.C299020Bno;
import X.C335910DEv;
import X.C340330DVv;
import X.C346530DiF;
import X.C452501pT;
import X.C497820Jfg;
import X.C786410Ut5;
import X.EnumC335920DEw;
import X.InterfaceC1399520mWU;
import X.InterfaceC1736320vHi;
import X.InterfaceC1737080vIw;
import X.InterfaceC1737690vJv;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.effectcreatormobile.ckeapi.data.PassThroughParams;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.immersionbar.ImmersionBar;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.effectcreator.IEffectCreatorService;
import com.ss.android.ugc.aweme.effectcreator.models.EffectPackageDataWrapper;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.model.draft.DraftSavedExtraData;
import com.ss.android.ugc.aweme.prop.fragment.MobileEffectDoneFragment;
import com.ss.android.ugc.aweme.prop.mobileefffect.EffectDoneInitState;
import com.ss.android.ugc.aweme.publish.detail.EffectMobilePublishDetailFragment;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.MobileEffectData;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.EffectPublishedExtraData;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.MobileEffect;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class EffectMobileTemplatePublishActivity extends BaseActivity implements InterfaceC1736320vHi {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjU5KyM6Oy1iKCwnITMlHELIOSPTZ9DSMqLCwnBSouICM2HCAhOSMyPCAcPC0/ITYkCCwnITMlPTY=";
    public final C01GW LL = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(252));

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.publish.activity.EffectMobileTemplatePublishActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.publish.activity.EffectMobileTemplatePublishActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.publish.activity.EffectMobileTemplatePublishActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.publish.activity.EffectMobileTemplatePublishActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.publish.activity.EffectMobileTemplatePublishActivity", "onWindowFocusChanged", true);
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
    public final void onDestroy() {
        super.onDestroy();
        InterfaceC1737080vIw interfaceC1737080vIw = (InterfaceC1737080vIw) this.LL.getValue();
        if (interfaceC1737080vIw != null) {
            interfaceC1737080vIw.clear();
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

    @Override // X.InterfaceC1736320vHi
    public final void LIZLLL(EffectDoneInitState effectDoneInitState) {
        MobileEffectDoneFragment mobileEffectDoneFragment = new MobileEffectDoneFragment();
        Bundle bundle = new Bundle();
        C786410Ut5.LJJIJL(bundle, "mobile_effect_done_state", effectDoneInitState);
        mobileEffectDoneFragment.setArguments(bundle);
        C19EH c19ehLJIIJ = getSupportFragmentManager().LJIIJ();
        c19ehLJIIJ.LJIJ(R.id.iiq, mobileEffectDoneFragment, null);
        c19ehLJIIJ.LJIIIZ();
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        MobileEffectData mobileEffectData;
        String string;
        Bundle extras;
        Bundle extras2;
        View viewFindViewById;
        InterfaceC1399520mWU interfaceC1399520mWULJ;
        MobileEffectData mobileEffectData2;
        PassThroughParams passThroughParamsLIZIZ;
        String string2;
        Bundle extras3;
        String strValueOf;
        EffectPackageDataWrapper effectPackageDataWrapper;
        Bundle extras4;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.publish.activity.EffectMobileTemplatePublishActivity", "onCreate", true);
        super.onCreate(bundle);
        IEffectCreatorService iEffectCreatorService = (IEffectCreatorService) PluggableExtentionKt.pluggableSpi$default(IEffectCreatorService.class, false, false, false, 14, null);
        if (iEffectCreatorService != null && (interfaceC1399520mWULJ = iEffectCreatorService.LJ()) != null) {
            String currentUserID = C0CHQ.LIZ().getAccountService().getCurrentUserID();
            C0CHQ.LIZ().getApplicationService().getClass();
            String strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId = AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId();
            try {
                extras4 = getIntent().getExtras();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (extras4 == null) {
                mobileEffectData2 = null;
            } else {
                mobileEffectData2 = (MobileEffectData) extras4.getParcelable("effect_init_data");
            }
            if ((!(mobileEffectData2 instanceof MobileEffectData) || mobileEffectData2 == null || (effectPackageDataWrapper = mobileEffectData2.publishData) == null || (strValueOf = effectPackageDataWrapper.ameEnterFrom) == null || strValueOf.length() == 0) && ((passThroughParamsLIZIZ = C340330DVv.LIZIZ(this)) == null || (strValueOf = passThroughParamsLIZIZ.ameEnterFrom) == null || strValueOf.length() <= 0)) {
                PassThroughParams passThroughParamsLIZIZ2 = C340330DVv.LIZIZ(this);
                if (passThroughParamsLIZIZ2 == null || (string2 = passThroughParamsLIZIZ2.enterFrom) == null || string2.length() == 0) {
                    try {
                        extras3 = getIntent().getExtras();
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                    }
                    if (extras3 == null) {
                        string2 = null;
                    } else {
                        string2 = extras3.getString("ENTER_FROM");
                    }
                }
                strValueOf = String.valueOf(string2);
            }
            interfaceC1399520mWULJ.LIZ(currentUserID, strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId, strValueOf, "effect_publish");
        }
        if (bundle != null) {
            super.finish();
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.publish.activity.EffectMobileTemplatePublishActivity", "onCreate", false);
            return;
        }
        setContentView(R.layout.jk);
        View viewFindViewById2 = findViewById(R.id.a5y);
        if (viewFindViewById2 != null) {
            viewFindViewById2.getLayoutParams().height = C497820Jfg.LIZJ(viewFindViewById2.getContext());
        }
        TuxImmersionBar tuxImmersionBar = new TuxImmersionBar(this, ImmersionBar.LJIILJJIL(this));
        tuxImmersionBar.LJIIIIZZ(R.attr.bx);
        tuxImmersionBar.LJ(R.attr.bx);
        tuxImmersionBar.LIZ(true);
        tuxImmersionBar.LIZLLL();
        if (Build.VERSION.SDK_INT >= 35 && (viewFindViewById = findViewById(R.id.eqx)) != null) {
            C14K9.LJIJJ(viewFindViewById, new C346530DiF(viewFindViewById, 3));
        }
        try {
            extras2 = getIntent().getExtras();
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        if (extras2 == null) {
            mobileEffectData = null;
        } else {
            mobileEffectData = (MobileEffectData) extras2.getParcelable("effect_init_data");
        }
        if ((mobileEffectData instanceof MobileEffectData) && mobileEffectData != null) {
            try {
                extras = getIntent().getExtras();
            } catch (Exception e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
            if (extras == null) {
                string = null;
            } else {
                string = extras.getString("ENTER_FROM");
            }
            mobileEffectData.enterFrom = String.valueOf(string);
            EffectMobilePublishDetailFragment effectMobilePublishDetailFragment = new EffectMobilePublishDetailFragment();
            Bundle bundle2 = new Bundle();
            C786410Ut5.LJJIJL(bundle2, "effect_init_data", mobileEffectData);
            effectMobilePublishDetailFragment.setArguments(bundle2);
            C19EH c19ehLJIIJ = getSupportFragmentManager().LJIIJ();
            c19ehLJIIJ.LJIJ(R.id.iiq, effectMobilePublishDetailFragment, null);
            c19ehLJIIJ.LJIIIZ();
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.publish.activity.EffectMobileTemplatePublishActivity", "onCreate", false);
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

    @Override // X.InterfaceC1736320vHi
    public final void LJLI(String str, DraftSavedExtraData draftSavedExtraData) throws Throwable {
        Intent intent = new Intent();
        intent.putExtra("save_draft_id", str);
        intent.putExtra("save_draft_extra_data", draftSavedExtraData);
        C2204961BRm.h(this, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPq9YZPHzzowjKH3KPScBT9ri0olXrDzJlzT0+RyQSiGZWSlhnxHQQifd5i0QAkYPnr9juA=", null));
        finish();
    }

    @Override // X.InterfaceC1736320vHi
    public final void LJLLILLLL(String str, EffectPublishedExtraData effectPublishedExtraData) throws Throwable {
        MobileEffect mobileEffect;
        Intent intentPutExtra = new Intent().putExtra("published_effect_id", str);
        if (effectPublishedExtraData != null && (mobileEffect = effectPublishedExtraData.mobileEffect) != null) {
            mobileEffect.mustCallBeforeParcelize();
        }
        intentPutExtra.putExtra("published_effect_extra_data", effectPublishedExtraData);
        C2204961BRm.h(this, intentPutExtra, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPq9YZPHzzowjKH3KPScBT9ri0olXrDzJlzT0+RyQSiGZWSlhnxHQQifd5i0QAkYPnr9juA=", null));
        finish();
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Fragment fragmentLJJJJZ = getSupportFragmentManager().LJJJJZ(R.id.iiq);
        if (fragmentLJJJJZ != null) {
            fragmentLJJJJZ.onActivityResult(i, i, intent);
        }
    }
}
