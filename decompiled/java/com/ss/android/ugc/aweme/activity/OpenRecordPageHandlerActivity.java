package com.ss.android.ugc.aweme.activity;

import X.C1308910kAL;
import X.C1389600mGU;
import X.C1697810uHb;
import X.C299020Bno;
import X.C335910DEv;
import X.EnumC335920DEw;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.addyours.model.AddYourRecordParam;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.tools.sticker.IAddYoursStickerRecordService;
import com.ss.ugc.aweme.creation.base.AddYoursModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class OpenRecordPageHandlerActivity extends BaseActivity {
    public static final int $stable = 8;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQvPSYlITHELIOSE1ZwAjLSseLCw8OiEcKCg2ACQiLSM2OgQvPSYlITE1";
    public boolean needStartRecord;

    public void com_ss_android_ugc_aweme_activity_OpenRecordPageHandlerActivity__onStop$___twin___() {
        super.onStop();
    }

    public void com_ss_android_ugc_aweme_activity_OpenRecordPageHandlerActivity__setTheme$___twin___(int i) {
        super.setTheme(i);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.activity.OpenRecordPageHandlerActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.activity.OpenRecordPageHandlerActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public void onStop() {
        com_ss_android_ugc_aweme_activity_OpenRecordPageHandlerActivity_com_ss_android_ugc_aweme_lancet_ActivityEnterTransitionCoordinatorLancet_onStop(this);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.activity.OpenRecordPageHandlerActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        com_ss_android_ugc_aweme_activity_OpenRecordPageHandlerActivity_com_ss_android_ugc_aweme_tux_business_lancet_ThemeLancet_setTheme(this, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.content.Intent] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public void onResume() {
        ?? intent;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.activity.OpenRecordPageHandlerActivity", "onResume", true);
        super.onResume();
        if (!this.needStartRecord) {
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.activity.OpenRecordPageHandlerActivity", "onResume", false);
            return;
        }
        this.needStartRecord = false;
        try {
            intent = getIntent();
            String strINVOKEVIRTUAL_com_ss_android_ugc_aweme_activity_OpenRecordPageHandlerActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra = INVOKEVIRTUAL_com_ss_android_ugc_aweme_activity_OpenRecordPageHandlerActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(intent, "extar_start_creation_type");
            try {
                if (strINVOKEVIRTUAL_com_ss_android_ugc_aweme_activity_OpenRecordPageHandlerActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra != null && strINVOKEVIRTUAL_com_ss_android_ugc_aweme_activity_OpenRecordPageHandlerActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra.hashCode() == 1388698267 && strINVOKEVIRTUAL_com_ss_android_ugc_aweme_activity_OpenRecordPageHandlerActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra.equals("start_ay_record")) {
                    AddYoursModel addYoursModel = (AddYoursModel) getIntent().getParcelableExtra("extar_add_yours_params");
                    if (addYoursModel == null) {
                        exitPage();
                        ActivityAgent.onTrace("com.ss.android.ugc.aweme.activity.OpenRecordPageHandlerActivity", "onResume", false);
                        return;
                    }
                    String strINVOKEVIRTUAL_com_ss_android_ugc_aweme_activity_OpenRecordPageHandlerActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra2 = INVOKEVIRTUAL_com_ss_android_ugc_aweme_activity_OpenRecordPageHandlerActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(getIntent(), "extra_music_id");
                    String strINVOKEVIRTUAL_com_ss_android_ugc_aweme_activity_OpenRecordPageHandlerActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra3 = INVOKEVIRTUAL_com_ss_android_ugc_aweme_activity_OpenRecordPageHandlerActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(getIntent(), "extra_effect_id");
                    ArrayList<String> stringArrayListExtra = getIntent().getStringArrayListExtra("extra_hashtags");
                    String strINVOKEVIRTUAL_com_ss_android_ugc_aweme_activity_OpenRecordPageHandlerActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra4 = INVOKEVIRTUAL_com_ss_android_ugc_aweme_activity_OpenRecordPageHandlerActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(getIntent(), "extra_music_selected_from");
                    int intExtra = getIntent().getIntExtra("extra_landing_back", 0);
                    try {
                        intent = 0;
                        startAYRecord(addYoursModel, strINVOKEVIRTUAL_com_ss_android_ugc_aweme_activity_OpenRecordPageHandlerActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra2, strINVOKEVIRTUAL_com_ss_android_ugc_aweme_activity_OpenRecordPageHandlerActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra3, stringArrayListExtra, Integer.valueOf(intExtra), strINVOKEVIRTUAL_com_ss_android_ugc_aweme_activity_OpenRecordPageHandlerActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra4, getIntent().getBooleanExtra("extra_completed_event", false), INVOKEVIRTUAL_com_ss_android_ugc_aweme_activity_OpenRecordPageHandlerActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(getIntent(), "extra_wwa_campaign_id"), INVOKEVIRTUAL_com_ss_android_ugc_aweme_activity_OpenRecordPageHandlerActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(getIntent(), "extra_wwa_source_platform_channel"), INVOKEVIRTUAL_com_ss_android_ugc_aweme_activity_OpenRecordPageHandlerActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(getIntent(), "extra_wwa_back_url"), getIntent().getBooleanExtra("extra_wwa_show_story_button", true));
                    } catch (Exception e) {
                        e = e;
                        intent = 0;
                        TryCatchGuardChecker.doCheck(e);
                    }
                } else {
                    intent = 0;
                    exitPage();
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Exception e3) {
            e = e3;
            intent = 0;
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.activity.OpenRecordPageHandlerActivity", "onResume", intent);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        try {
            C1389600mGU.LIZIZ(this);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        overridePendingTransition(0, 0);
    }

    private final void exitPage() {
        finish();
    }

    public static void com_ss_android_ugc_aweme_activity_OpenRecordPageHandlerActivity_com_bytedance_sysoptimizer_EnterTransitionLancet_onStop(OpenRecordPageHandlerActivity openRecordPageHandlerActivity) {
        openRecordPageHandlerActivity.com_ss_android_ugc_aweme_activity_OpenRecordPageHandlerActivity__onStop$___twin___();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                openRecordPageHandlerActivity.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public static void com_ss_android_ugc_aweme_activity_OpenRecordPageHandlerActivity_com_ss_android_ugc_aweme_lancet_ActivityEnterTransitionCoordinatorLancet_onStop(OpenRecordPageHandlerActivity openRecordPageHandlerActivity) {
        com_ss_android_ugc_aweme_activity_OpenRecordPageHandlerActivity_com_bytedance_sysoptimizer_EnterTransitionLancet_onStop(openRecordPageHandlerActivity);
        try {
            openRecordPageHandlerActivity.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public void onCreate(Bundle bundle) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.activity.OpenRecordPageHandlerActivity", "onCreate", true);
        super.onCreate(bundle);
        try {
            C1389600mGU.LIZIZ(this);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        overridePendingTransition(0, 0);
        this.needStartRecord = true;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.activity.OpenRecordPageHandlerActivity", "onCreate", false);
    }

    public static String INVOKEVIRTUAL_com_ss_android_ugc_aweme_activity_OpenRecordPageHandlerActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static void com_ss_android_ugc_aweme_activity_OpenRecordPageHandlerActivity_com_ss_android_ugc_aweme_tux_business_lancet_ThemeLancet_setTheme(OpenRecordPageHandlerActivity openRecordPageHandlerActivity, int i) {
        boolean z;
        openRecordPageHandlerActivity.com_ss_android_ugc_aweme_activity_OpenRecordPageHandlerActivity__setTheme$___twin___(i);
        if (C299020Bno.LIZ() != 0) {
            boolean z2 = false;
            if (!C1697810uHb.LJIIJJI(Integer.valueOf(R.style.a9t), Integer.valueOf(R.style.a9u), Integer.valueOf(R.style.a9v), Integer.valueOf(R.style.a9s)).contains(Integer.valueOf(i))) {
                Integer numLIZ = C1308910kAL.LIZ(R.attr.g0c, openRecordPageHandlerActivity);
                if (numLIZ != null && numLIZ.intValue() == -1) {
                    z = true;
                } else {
                    z = false;
                }
                Integer numLIZ2 = C1308910kAL.LIZ(R.attr.g0d, openRecordPageHandlerActivity);
                if (numLIZ2 == null || numLIZ2.intValue() != 0) {
                    z2 = true;
                }
                if (z) {
                    openRecordPageHandlerActivity.getTheme().applyStyle(R.style.a9u, true);
                } else {
                    openRecordPageHandlerActivity.getTheme().applyStyle(R.style.a9t, true);
                }
                if (z2) {
                    openRecordPageHandlerActivity.getTheme().applyStyle(R.style.a9v, true);
                } else {
                    openRecordPageHandlerActivity.getTheme().applyStyle(R.style.a9s, true);
                }
            }
        }
        EnumC335920DEw enumC335920DEwLIZ = C335910DEv.LIZ();
        if (enumC335920DEwLIZ == EnumC335920DEw.V1) {
            openRecordPageHandlerActivity.getTheme().applyStyle(R.style.a9x, true);
        } else {
            if (enumC335920DEwLIZ != EnumC335920DEw.V2) {
                return;
            }
            openRecordPageHandlerActivity.getTheme().applyStyle(R.style.a9y, true);
        }
    }

    private final void startAYRecord(AddYoursModel addYoursModel, String str, String str2, ArrayList<String> arrayList, Number number, String str3, boolean z, String str4, String str5, String str6, boolean z2) {
        IAddYoursStickerRecordService iAddYoursStickerRecordService = (IAddYoursStickerRecordService) ServiceManager.get().getService(IAddYoursStickerRecordService.class);
        String ayEnterMethod = addYoursModel.getAyEnterMethod();
        if (ayEnterMethod == null) {
            ayEnterMethod = "H5";
        }
        iAddYoursStickerRecordService.LIZ(this, null, new AddYourRecordParam(null, false, false, "H5", "add_yours", ayEnterMethod, null, true, false, null, addYoursModel.getAyTopicId(), null, 0, str2, str, arrayList, number, str3, z, false, null, null, str4, str5, str6, z2, false)).LIZIZ();
    }
}
