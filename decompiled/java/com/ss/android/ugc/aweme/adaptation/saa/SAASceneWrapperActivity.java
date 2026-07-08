package com.ss.android.ugc.aweme.adaptation.saa;

import X.AbstractActivityC19422710yn;
import X.AbstractC214814194y;
import X.AnonymousClass1950;
import X.AnonymousClass1987;
import X.AnonymousClass1988;
import X.C12WG;
import X.C1664590tQ1;
import X.C1664600tQ2;
import X.C197U;
import X.C198H;
import X.C198Q;
import X.C19AK;
import X.C19C8;
import X.C201954140i;
import X.C201955140j;
import X.C201967140v;
import X.C214868197a;
import X.C214932199m;
import X.C282970B7f;
import X.C289940BYa;
import X.C290160BYw;
import X.C299090Bnv;
import X.C554740LpI;
import X.C569770MWh;
import X.InterfaceC20011613Rq;
import X.InterfaceC20597515in;
import X.InterfaceC214897198d;
import X.InterfaceC214902198i;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.fragment.app.FragmentManager;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.scene.Scene;
import com.bytedance.scene.navigation.NavigationScene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.adaptation.saa.CreativeToolContainerScene;
import com.ss.android.ugc.aweme.adaptation.saa.SAASceneWrapperActivity;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import joo.f;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS278S0000000_32;
import lgo.a;

/* JADX INFO: loaded from: classes33.dex */
public class SAASceneWrapperActivity extends AbstractActivityC19422710yn implements InterfaceC20011613Rq, InterfaceC214897198d {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQoKD8nKTHELIOSElJiF9OyQtZxwSCRYvLCE2HzctOT82OgQvPSYlITE1";
    public final AnonymousClass1988 LL = new InterfaceC20597515in() { // from class: X.1988
        @Override // X.InterfaceC20597515in
        public final FragmentManager LIZ() {
            return this.LIZ.getSupportFragmentManager();
        }

        @Override // X.InterfaceC20597515in
        public final void LIZIZ(Function0<Unit> function0) {
            CreativeToolContainerScene creativeToolContainerSceneLLLLZI = this.LIZ.LLLLZI();
            if (creativeToolContainerSceneLLLLZI != null) {
                if (creativeToolContainerSceneLLLLZI.LLLI) {
                    function0.invoke();
                } else {
                    creativeToolContainerSceneLLLLZI.LLLII.add(function0);
                }
            }
        }
    };
    public final AnonymousClass1987 LLILLJJLI = new AnonymousClass1950() { // from class: X.1987
        @Override // X.AnonymousClass1950
        public final void LIZ() {
            CreativeToolContainerScene creativeToolContainerSceneLLLLZI;
            SAASceneWrapperActivity sAASceneWrapperActivity = this.LIZ;
            if (sAASceneWrapperActivity.LLILLL != null || (creativeToolContainerSceneLLLLZI = sAASceneWrapperActivity.LLLLZI()) == null) {
                return;
            }
            creativeToolContainerSceneLLLLZI.LLLI = true;
            Iterator<Function0<Unit>> it2 = creativeToolContainerSceneLLLLZI.LLLII.iterator();
            while (it2.hasNext()) {
                it2.next().invoke();
            }
        }
    };
    public NavigationScene LLILLL;
    public C19C8 LLILZ;

    @Override // X.InterfaceC214897198d
    public final void beforeNavigating(Scene scene, Scene scene2) {
    }

    @Override // X.InterfaceC214897198d
    public final InterfaceC214902198i getDynamicParentRootFragment() {
        return null;
    }

    @Override // X.InterfaceC214897198d
    public final C214932199m getDynamicParentScene() {
        return null;
    }

    @Override // X.InterfaceC214897198d
    public final boolean getEnableSAF() {
        return true;
    }

    @Override // X.InterfaceC20622815ms
    public final C198H getRootSAFSceneWrapper() {
        return null;
    }

    @Override // X.InterfaceC214897198d
    public final boolean getUseRootFragmentForPageCallbacks() {
        return false;
    }

    @Override // X.InterfaceC214897198d
    public final boolean migrateDarkModeImplToFragment() {
        return false;
    }

    @Override // X.InterfaceC214897198d
    public final boolean migrateImmersiveBarImplToFragment() {
        return false;
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.adaptation.saa.SAASceneWrapperActivity", "onResume", true);
        super.onResume();
        C19C8 c19c8 = this.LLILZ;
        if (c19c8 != null) {
            c19c8.LIZLLL();
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.adaptation.saa.SAASceneWrapperActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.adaptation.saa.SAASceneWrapperActivity", "onStart", true);
        super.onStart();
        C19C8 c19c8 = this.LLILZ;
        if (c19c8 != null) {
            c19c8.LJFF();
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.adaptation.saa.SAASceneWrapperActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.adaptation.saa.SAASceneWrapperActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.InterfaceC214897198d
    public final void setDynamicParentScene(C214932199m c214932199m) {
    }

    public final void LLLLLZL() {
        C201955140j.LIZJ(C201967140v.LIZIZ, "SAASceneWrapperActivity execute backToHomePage");
        finish();
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(this, "aweme://main");
        smartRouteBuildRoute.addFlags(268468224);
        smartRouteBuildRoute.open();
    }

    public final CreativeToolContainerScene LLLLZI() {
        NavigationScene navigationScene = this.LLILLL;
        Scene sceneLLLLIIIILLL = navigationScene != null ? navigationScene.LLLLIIIILLL() : null;
        if (sceneLLLLIIIILLL instanceof CreativeToolContainerScene) {
            return (CreativeToolContainerScene) sceneLLLLIIIILLL;
        }
        return null;
    }

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        NavigationScene navigationScene = this.LLILLL;
        if (navigationScene == null || !navigationScene.LLLLLJIL(null)) {
            super.onBackPressed();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity
    public final void finish() {
        super.finish();
        CreativeToolContainerScene creativeToolContainerSceneLLLLZI = LLLLZI();
        if (!(creativeToolContainerSceneLLLLZI instanceof AbstractC214814194y) || creativeToolContainerSceneLLLLZI == null) {
            return;
        }
        C569770MWh.LIZ(creativeToolContainerSceneLLLLZI.getFinishAnimationType(), this);
    }

    @Override // X.InterfaceC20622815ms
    public final FragmentManager getContainerFragmentManager() {
        CreativeToolContainerScene creativeToolContainerSceneLLLLZI = LLLLZI();
        if (creativeToolContainerSceneLLLLZI != null) {
            return creativeToolContainerSceneLLLLZI.getSupportFragmentManager();
        }
        return null;
    }

    @Override // X.InterfaceC20622815ms
    public final NavigationScene getNavigationScene() {
        CreativeToolContainerScene creativeToolContainerSceneLLLLZI = LLLLZI();
        if (creativeToolContainerSceneLLLLZI != null) {
            return creativeToolContainerSceneLLLLZI.LLJLIL;
        }
        return null;
    }

    @Override // X.C19EG
    public final FragmentManager getSupportFragmentManager() {
        FragmentManager containerFragmentManager = getContainerFragmentManager();
        return containerFragmentManager == null ? super.getSupportFragmentManager() : containerFragmentManager;
    }

    @Override // X.InterfaceC214897198d
    public final boolean isDelegateFragmentManager() {
        return C290160BYw.LIZ();
    }

    @Override // X.InterfaceC20011613Rq
    public final boolean isRecording() {
        CreativeToolContainerScene creativeToolContainerSceneLLLLZI = LLLLZI();
        if (creativeToolContainerSceneLLLLZI != null) {
            return creativeToolContainerSceneLLLLZI.isRecording();
        }
        return false;
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        C19C8 c19c8 = this.LLILZ;
        if (c19c8 != null) {
            c19c8.LJII();
        }
    }

    @Override // android.app.Activity
    public final void onEnterAnimationComplete() {
        super.onEnterAnimationComplete();
        a.LIZIZ.recordService().LJ();
        C201955140j.LJIILJJIL(C201954140i.LIZIZ, "SAASceneWrapperActivity onEnterAnimationComplete");
        CreativeToolContainerScene creativeToolContainerSceneLLLLZI = LLLLZI();
        if (!(creativeToolContainerSceneLLLLZI instanceof AbstractC214814194y) || creativeToolContainerSceneLLLLZI == null) {
            return;
        }
        creativeToolContainerSceneLLLLZI.onEnterAnimationComplete();
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onPause() {
        super.onPause();
        C19C8 c19c8 = this.LLILZ;
        if (c19c8 != null) {
            c19c8.LIZJ();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public void onStop() {
        super.onStop();
        C19C8 c19c8 = this.LLILZ;
        if (c19c8 != null) {
            c19c8.LJI();
        }
    }

    @Override // X.InterfaceC214897198d
    public final void finishLastPage() {
        C197U.LIZ(this);
    }

    @Override // X.InterfaceC20622815ms
    public final InterfaceC20597515in getAbility() {
        return this.LL;
    }

    @Override // X.InterfaceC214897198d
    public final AnonymousClass1950 provideSAFActivityCallBack() {
        return this.LLILLJJLI;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        CreativeToolContainerScene creativeToolContainerSceneLLLLZI = LLLLZI();
        if ((creativeToolContainerSceneLLLLZI instanceof AbstractC214814194y) && creativeToolContainerSceneLLLLZI != null) {
            creativeToolContainerSceneLLLLZI.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        NavigationScene navigationScene = this.LLILLL;
        if (navigationScene != null) {
            navigationScene.onConfigurationChanged(configuration);
        }
    }

    @Override // X.AbstractActivityC19422710yn, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public void onCreate(Bundle bundle) {
        Bundle bundle2;
        boolean z;
        boolean booleanExtra;
        boolean booleanExtra2;
        String stringExtra;
        boolean booleanExtra3;
        Intent intent;
        CreativeToolsPluginService creativeToolsPluginService;
        Intent intent2;
        boolean z2 = true;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.adaptation.saa.SAASceneWrapperActivity", "onCreate", true);
        C554740LpI c554740LpI = C554740LpI.LIZIZ;
        C201955140j.LIZJ(c554740LpI, "SAASceneWrapperActivity onCreate");
        String stringExtra2 = null;
        boolean z3 = false;
        if (bundle != null && !C290160BYw.LIZ() && bundle.getBoolean("saa:onSaveInstanceState_top_is_live_host_tag", false)) {
            bundle2 = null;
        } else {
            bundle2 = bundle;
        }
        super.onCreate(bundle);
        setContentView(R.layout.k4);
        Intent intent3 = getIntent();
        try {
            f.LIZ.getClass();
            f.LIZJ(this, intent3, bundle2);
            try {
                Bundle extras = getIntent().getExtras();
                if (extras != null) {
                    if (C299090Bnv.LIZ() && (((intent = getIntent()) == null || !intent.getBooleanExtra("ignoreVEPluginCheck", false)) && ((creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null)) == null || !creativeToolsPluginService.LIZJ(this, "SAASceneWrapperActivity", false)))) {
                        if (bundle != null) {
                            C201955140j.LIZJ(c554740LpI, "SAASceneWrapperActivity backToHomePage because savedInstanceState is not null");
                            LLLLLZL();
                            ActivityAgent.onTrace("com.ss.android.ugc.aweme.adaptation.saa.SAASceneWrapperActivity", "onCreate", false);
                            return;
                        } else if (((Boolean) C282970B7f.LIZ.getValue()).booleanValue() && (intent2 = getIntent()) != null && intent2.getBooleanExtra("extra_ve_gate_passed", false)) {
                            C201955140j.LIZJ(c554740LpI, "SAASceneWrapperActivity backToHomePage because gatePassed is not true");
                            LLLLLZL();
                            ActivityAgent.onTrace("com.ss.android.ugc.aweme.adaptation.saa.SAASceneWrapperActivity", "onCreate", false);
                            return;
                        }
                    }
                    StringBuilder sb = new StringBuilder("SAASceneWrapperActivity reportIfPluginNotReady isSavedInstanceStateNull: ");
                    if (bundle == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    sb.append(z);
                    sb.append(" ignoreVEPluginCheck: ");
                    Intent intent4 = getIntent();
                    if (intent4 != null) {
                        booleanExtra = intent4.getBooleanExtra("ignoreVEPluginCheck", false);
                    } else {
                        booleanExtra = false;
                    }
                    sb.append(booleanExtra);
                    sb.append(" gatePassed: ");
                    Intent intent5 = getIntent();
                    if (intent5 != null) {
                        booleanExtra2 = intent5.getBooleanExtra("extra_ve_gate_passed", false);
                    } else {
                        booleanExtra2 = false;
                    }
                    sb.append(booleanExtra2);
                    C201955140j.LIZJ(c554740LpI, sb.toString());
                    if (bundle != null) {
                        z2 = false;
                    }
                    Intent intent6 = getIntent();
                    if (intent6 == null || !intent6.getBooleanExtra("ignoreVEPluginCheck", false)) {
                        Intent intent7 = getIntent();
                        if (intent7 != null) {
                            try {
                                stringExtra = intent7.getStringExtra("enter_from");
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                stringExtra = null;
                            }
                        } else {
                            stringExtra = null;
                        }
                        Intent intent8 = getIntent();
                        if (intent8 != null) {
                            try {
                                stringExtra2 = intent8.getStringExtra("shoot_way");
                            } catch (Exception e2) {
                                TryCatchGuardChecker.doCheck(e2);
                            }
                        }
                        Intent intent9 = getIntent();
                        if (intent9 != null) {
                            booleanExtra3 = intent9.getBooleanExtra("isFromDraft", false);
                        } else {
                            booleanExtra3 = false;
                        }
                        z3 = false;
                        CreativeToolsPluginService creativeToolsPluginService2 = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
                        if (creativeToolsPluginService2 != null) {
                            creativeToolsPluginService2.LJII(Boolean.valueOf(booleanExtra3), z2, stringExtra, stringExtra2);
                        }
                    }
                    C1664590tQ1.LIZIZ(this, AFwS278S0000000_32.get$arr$(14));
                    C1664600tQ2.LIZIZ(this, AFwS278S0000000_32.get$arr$(15));
                    Pair<NavigationScene, C19AK<?>> pairLIZIZ = C214868197a.LIZIZ(this, CreativeToolContainerScene.class, extras, R.id.tya, true, C289940BYa.LIZ());
                    NavigationScene first = pairLIZIZ.getFirst();
                    C19AK<?> second = pairLIZIZ.getSecond();
                    this.LLILLL = first;
                    C19C8 c19c8 = new C19C8(second);
                    this.LLILZ = c19c8;
                    c19c8.LIZIZ(this, bundle2);
                    ActivityAgent.onTrace("com.ss.android.ugc.aweme.adaptation.saa.SAASceneWrapperActivity", "onCreate", z3);
                    return;
                }
            } catch (Exception e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            LLLLLZL();
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.adaptation.saa.SAASceneWrapperActivity", "onCreate", false);
        } catch (RuntimeException e4) {
            TryCatchGuardChecker.doCheck(e4);
            intent3.replaceExtras((Bundle) null);
            LLLLLZL();
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.adaptation.saa.SAASceneWrapperActivity", "onCreate", false);
        }
    }

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        C201955140j.LIZJ(C201954140i.LIZIZ, "SAAActivity onNewIntent");
        f.LIZ.getClass();
        Bundle extras = null;
        f.LIZJ(this, intent, null);
        CreativeToolContainerScene creativeToolContainerSceneLLLLZI = LLLLZI();
        if (creativeToolContainerSceneLLLLZI != null) {
            try {
                extras = intent.getExtras();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            creativeToolContainerSceneLLLLZI.processNewArguments(extras);
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C19C8 c19c8 = this.LLILZ;
        if (c19c8 != null) {
            c19c8.LJ(bundle);
        }
    }

    @Override // android.app.Activity
    public final void onTopResumedActivityChanged(boolean z) {
        super.onTopResumedActivityChanged(z);
        CreativeToolContainerScene creativeToolContainerSceneLLLLZI = LLLLZI();
        if ((creativeToolContainerSceneLLLLZI instanceof C198Q) && creativeToolContainerSceneLLLLZI != null) {
            creativeToolContainerSceneLLLLZI.vg(z);
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19GS, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        Object obj;
        Boolean boolOnActivityKeyDown;
        NavigationScene navigationScene = this.LLILLL;
        if (navigationScene != null) {
            Scene sceneLLLLIIIILLL = navigationScene.LLLLIIIILLL();
            obj = sceneLLLLIIIILLL;
            if (sceneLLLLIIIILLL != null) {
                boolean zLIZIZ = C12WG.LIZIZ(sceneLLLLIIIILLL);
                obj = sceneLLLLIIIILLL;
                if (zLIZIZ) {
                    return super.onKeyDown(i, keyEvent);
                }
            }
        } else {
            obj = null;
        }
        if ((obj instanceof C198H) && (boolOnActivityKeyDown = ((C198H) obj).onActivityKeyDown(i, keyEvent)) != null) {
            return boolOnActivityKeyDown.booleanValue();
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // X.ActivityC21503719Dn, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyLongPress(int i, KeyEvent keyEvent) {
        Object obj;
        Boolean boolOnActivityKeyLongPress;
        NavigationScene navigationScene = this.LLILLL;
        if (navigationScene != null) {
            Scene sceneLLLLIIIILLL = navigationScene.LLLLIIIILLL();
            obj = sceneLLLLIIIILLL;
            if (sceneLLLLIIIILLL != null) {
                boolean zLIZIZ = C12WG.LIZIZ(sceneLLLLIIIILLL);
                obj = sceneLLLLIIIILLL;
                if (zLIZIZ) {
                    return super.onKeyLongPress(i, keyEvent);
                }
            }
        } else {
            obj = null;
        }
        if ((obj instanceof C198H) && (boolOnActivityKeyLongPress = ((C198H) obj).onActivityKeyLongPress(i, keyEvent)) != null) {
            return boolOnActivityKeyLongPress.booleanValue();
        }
        return super.onKeyLongPress(i, keyEvent);
    }

    @Override // X.ActivityC21503719Dn, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        Object obj;
        Boolean boolOnActivityKeyUp;
        NavigationScene navigationScene = this.LLILLL;
        if (navigationScene != null) {
            Scene sceneLLLLIIIILLL = navigationScene.LLLLIIIILLL();
            obj = sceneLLLLIIIILLL;
            if (sceneLLLLIIIILLL != null) {
                boolean zLIZIZ = C12WG.LIZIZ(sceneLLLLIIIILLL);
                obj = sceneLLLLIIIILLL;
                if (zLIZIZ) {
                    return super.onKeyUp(i, keyEvent);
                }
            }
        } else {
            obj = null;
        }
        if ((obj instanceof C198H) && (boolOnActivityKeyUp = ((C198H) obj).onActivityKeyUp(i, keyEvent)) != null) {
            return boolOnActivityKeyUp.booleanValue();
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // X.AbstractActivityC19422710yn, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        CreativeToolContainerScene creativeToolContainerSceneLLLLZI = LLLLZI();
        if (creativeToolContainerSceneLLLLZI != null) {
            creativeToolContainerSceneLLLLZI.onActivityResult(i, i2, intent);
        }
    }
}
