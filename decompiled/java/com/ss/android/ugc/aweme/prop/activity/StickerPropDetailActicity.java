package com.ss.android.ugc.aweme.prop.activity;

import X.C0CHQ;
import X.C0QFS;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1308910kAL;
import X.C1389600mGU;
import X.C1395980mQm;
import X.C1399920mX8;
import X.C1457570o27;
import X.C1697810uHb;
import X.C19EH;
import X.C1AF0;
import X.C299020Bno;
import X.C335910DEv;
import X.EnumC335920DEw;
import X.InterfaceC1399520mWU;
import X.InterfaceC1581830rGX;
import X.InterfaceC1740760vOs;
import Y.AObjectS122S0000000_21;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import androidx.fragment.app.FragmentManager;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.effectcreator.IEffectCreatorService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.prop.fragment.StickerPropDetailFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes22.dex */
public class StickerPropDetailActicity extends BaseActivity implements InterfaceC1581830rGX, InterfaceC1740760vOs, C0QFS {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjU+Jj99KSY4HELIOSIDk6PDxiGjs6Ky4pOx8hJzUILDsyISkNKjs6Kyw4MA==";

    @Override // X.InterfaceC1740760vOs
    public String getBtmPageCode() {
        return "b1030";
    }

    @Override // X.InterfaceC1581830rGX
    public final String getPageName() {
        return "prop_page";
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.prop.activity.StickerPropDetailActicity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.prop.activity.StickerPropDetailActicity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.prop.activity.StickerPropDetailActicity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.prop.activity.StickerPropDetailActicity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.prop.activity.StickerPropDetailActicity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.InterfaceC1740760vOs
    public final Map<String, String> r9() {
        return null;
    }

    public final void init() {
        C1395980mQm c1395980mQm = C1395980mQm.LIZ;
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        c1395980mQm.getClass();
        C19EH c19ehLJIIJ = supportFragmentManager.LJIIJ();
        c19ehLJIIJ.LJIJ(R.id.eqx, new StickerPropDetailFragment(), "sticker_prop_detail_fragment_tag");
        c19ehLJIIJ.LJIIIZ();
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

    @Override // X.InterfaceC1740760vOs
    public final String w3() {
        return String.valueOf(hashCode());
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String stringExtra;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.prop.activity.StickerPropDetailActicity", "onCreate", true);
        IEffectCreatorService iEffectCreatorService = (IEffectCreatorService) PluggableExtentionKt.pluggableSpi(IEffectCreatorService.class);
        if (iEffectCreatorService != null) {
            InterfaceC1399520mWU interfaceC1399520mWULJ = iEffectCreatorService.LJ();
            String currentUserID = C0CHQ.LIZ().getAccountService().getCurrentUserID();
            C0CHQ.LIZ().getApplicationService().getClass();
            String strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId = AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId();
            String stringExtra2 = null;
            try {
                stringExtra = getIntent().getStringExtra("extra_previous_page");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                stringExtra = null;
            }
            if (TextUtils.isEmpty(stringExtra)) {
                try {
                    stringExtra2 = getIntent().getStringExtra("enter_from");
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
                stringExtra = stringExtra2;
            }
            interfaceC1399520mWULJ.LIZ(currentUserID, strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId, stringExtra, "effect_detail");
        }
        activityConfiguration(new AObjectS122S0000000_21(5));
        super.onCreate(bundle);
        setContentView(R.layout.kd);
        C1395980mQm c1395980mQm = C1395980mQm.LIZ;
        Intent intent = getIntent();
        c1395980mQm.getClass();
        ArrayList<String> arrayListLIZ = C1395980mQm.LIZ(intent);
        if (arrayListLIZ != null && !arrayListLIZ.isEmpty()) {
            getIntent().putStringArrayListExtra("extra_stickers", arrayListLIZ);
            getSupportFragmentManager().LJZL(new C1399920mX8(getIntent()), false);
            init();
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.prop.activity.StickerPropDetailActicity", "onCreate", false);
            return;
        }
        C1AF0.LIZJ("No Prop id provided");
        finish();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.prop.activity.StickerPropDetailActicity", "onCreate", false);
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

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19GS, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (isDestroyed()) {
            return false;
        }
        if (i == 24 || i == 25) {
            C1457570o27.LIZ(i, "", "prop_page", "entrance");
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) throws Throwable {
        Activity activity;
        Intent intent2;
        super.onActivityResult(i, i2, intent);
        if (i == 10086) {
            int iIntValue = -1;
            if (i2 == -1) {
                C0WZX c0wzx = new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPq6bI+A3TGmNQa8YkknxPp2Wkd768O3VhrKkYLKoWHqlITF51GM4Q==", null);
                C0WST c0wst = new C0WST();
                Object[] objArr = {-1, intent};
                C0WZW c0wzw = new C0WZW(false, "(ILandroid/content/Intent;)V", c0wzx);
                C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11071, "com/ss/android/ugc/aweme/prop/activity/StickerPropDetailActicity", "setResult", this, objArr, "void", c0wzw);
                if (c0wsuLIZIZ.LIZ) {
                    c0wst.LIZ(11071, "com/ss/android/ugc/aweme/prop/activity/StickerPropDetailActicity", "setResult", null, objArr, this, c0wzw, false);
                } else {
                    Object[] objArr2 = c0wsuLIZIZ.LIZJ;
                    if (objArr2 != null) {
                        Object obj = objArr2[0];
                        if (obj != null) {
                            activity = (Activity) obj;
                        } else {
                            activity = this;
                        }
                        Object obj2 = objArr2[1];
                        if (obj2 != null) {
                            iIntValue = ((Integer) obj2).intValue();
                        }
                        Object obj3 = c0wsuLIZIZ.LIZJ[2];
                        if (obj3 != null) {
                            intent2 = (Intent) obj3;
                        } else {
                            intent2 = intent;
                        }
                    } else {
                        activity = this;
                        intent2 = intent;
                    }
                    activity.setResult(iIntValue, intent2);
                    c0wst.LIZ(11071, "com/ss/android/ugc/aweme/prop/activity/StickerPropDetailActicity", "setResult", null, objArr, activity, c0wzw, true);
                }
                finish();
                try {
                    C1389600mGU.LIZIZ(this);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                overridePendingTransition(0, 0);
            }
        }
    }
}
