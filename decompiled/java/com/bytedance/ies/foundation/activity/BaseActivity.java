package com.bytedance.ies.foundation.activity;

import X.ActivityC21503719Dn;
import X.C01GW;
import X.C06W2;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C12ET;
import X.C1563370qml;
import X.C1577910rAD;
import X.C19719612Di;
import X.C19D2;
import X.C19DB;
import X.C19DE;
import X.C19DK;
import X.C19DP;
import X.C19DX;
import X.C19DZ;
import X.C21502619Dc;
import X.C21502719Dd;
import X.C21502819De;
import X.C21502919Df;
import X.C21503019Dg;
import X.C21503219Di;
import X.C21503319Dj;
import X.C21503419Dk;
import X.C21503519Dl;
import X.C21503619Dm;
import X.C21504119Dr;
import X.C452501pT;
import X.C726540Sei;
import X.EnumC682280QpW;
import X.InterfaceC1893770zNf;
import X.InterfaceC21503119Dh;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadSystemException;
import android.view.KeyEvent;
import android.view.View;
import androidx.activity.ComponentActivity;
import com.bytedance.ies.foundation.base.BaseViewModel;
import com.bytedance.router.SmartIntent;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jv6.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS355S0000000_32;
import kotlin.jvm.internal.AwS188S0101000_32;
import kotlin.jvm.internal.AwS354S0000000_32;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS681S0100000_32;

/* JADX INFO: loaded from: classes33.dex */
public class BaseActivity extends ActivityC21503719Dn implements C19DB, C12ET, InterfaceC1893770zNf {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWslLDx9Lio5JysyPCHELIOSwjJ2EyKzElPyYnMWsOKDw2CSY4IDk6PDw=";
    public WeakReference<BaseActivity> activityRef;
    public final List<C19D2> innerProcessors;
    public long mDestroyTime;
    public static final C726540Sei Companion = new C726540Sei();
    public static Class<? extends BaseActivityViewModel> viewModelClass = BaseActivityViewModel.class;
    public static final C21504119Dr callback = new C21504119Dr();
    public static final List<Function0<List<C19D2>>> processGenerator = new ArrayList();
    public final /* synthetic */ C21502619Dc $$delegate_0 = new C21502619Dc();
    public final C01GW baseViewModel$delegate = C452501pT.LIZIZ(new AwS576S0100000_32(this, 68));
    public final C01GW processors$delegate = C452501pT.LIZIZ(new C19DK(this));
    public final boolean enableCallbacks = true;

    public static /* synthetic */ void access$000(ActivityC21503719Dn activityC21503719Dn, Intent intent, int i, Bundle bundle) throws Throwable {
        com_bytedance_ies_foundation_activity_BaseActivity_com_bytedance_ies_powerpage_PowerActivity_startActivityForResult_super(activityC21503719Dn, intent, i, bundle, new C0WZX("dzBzEgAjS8/YVFkiQFyNY/5Yo2Rd7j/xaP3wGqYXFfLu0NFQXLcRghTwMUuivMMKV9w=", new String[]{"19417"}));
    }

    public static void com_bytedance_ies_foundation_activity_BaseActivity_com_bytedance_ies_powerpage_PowerActivity_startActivityForResult_super(ActivityC21503719Dn activityC21503719Dn, Intent intent, int i, Bundle bundle, C0WZX c0wzx) throws Throwable {
        ComponentActivity componentActivity;
        Intent intent2;
        Bundle bundle2;
        int iIntValue = i;
        C0WST c0wst = new C0WST();
        Object[] objArr = {intent, Integer.valueOf(iIntValue), bundle};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/content/Intent;ILandroid/os/Bundle;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11094, "com/bytedance/ies/powerpage/PowerActivity", "startActivityForResult", activityC21503719Dn, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11094, "com/bytedance/ies/powerpage/PowerActivity", "startActivityForResult", null, objArr, activityC21503719Dn, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            componentActivity = obj != null ? (ComponentActivity) obj : activityC21503719Dn;
            Object obj2 = objArr2[1];
            intent2 = obj2 != null ? (Intent) obj2 : intent;
            Object obj3 = objArr2[2];
            if (obj3 != null) {
                iIntValue = ((Integer) obj3).intValue();
            }
            Object obj4 = c0wsuLIZIZ.LIZJ[3];
            bundle2 = obj4 != null ? (Bundle) obj4 : bundle;
        } else {
            componentActivity = activityC21503719Dn;
            intent2 = intent;
            bundle2 = bundle;
        }
        super.startActivityForResult(intent2, iIntValue, bundle2);
        c0wst.LIZ(11094, "com/bytedance/ies/powerpage/PowerActivity", "startActivityForResult", null, objArr, componentActivity, c0wzw, true);
    }

    public void buildCommonIntent() {
    }

    public void dismissCustomToast() {
        this.$$delegate_0.getClass();
    }

    @Override // X.ActivityC21503719Dn, android.app.Activity
    public void finish() {
        super.finish();
        C21504119Dr c21504119Dr = callback;
        c21504119Dr.getClass();
        C21504119Dr.LIZ(c21504119Dr, this, false, null, AFwS355S0000000_32.get$arr$(1), 6);
    }

    public boolean isDarkModeSupported() {
        return true;
    }

    @Override // X.C19EG, X.C19FO, android.app.Activity
    public void onPause() {
        com_bytedance_ies_foundation_activity_BaseActivity_com_ss_android_ugc_aweme_lancet_CommonUILancet_onBaseAcitivtyPause(this);
    }

    @Override // X.C19GS
    public void onSupportContentChanged() {
        super.onSupportContentChanged();
        C21504119Dr c21504119Dr = callback;
        c21504119Dr.getClass();
        C21504119Dr.LIZ(c21504119Dr, this, false, null, new C21503419Dk(), 6);
    }

    public void showCustomToast(int i, String str) {
        this.$$delegate_0.LIZ(i, str);
    }

    public void com_bytedance_ies_foundation_activity_BaseActivity__onPause$___twin___() {
        C21504119Dr c21504119Dr = callback;
        c21504119Dr.getClass();
        C21504119Dr.LIZ(c21504119Dr, this, false, null, AFwS355S0000000_32.get$arr$(9), 6);
        super.onPause();
        C21504119Dr.LIZ(c21504119Dr, this, false, null, AFwS355S0000000_32.get$arr$(6), 6);
    }

    public final BaseActivityViewModel getBaseViewModel() {
        return (BaseActivityViewModel) this.baseViewModel$delegate.getValue();
    }

    public final List<C19DE> getProcessors$base_foundation_release() {
        return (List) this.processors$delegate.getValue();
    }

    public final BaseActivityViewModel getViewModel() {
        return (BaseActivityViewModel) C1563370qml.LIZ(this, EnumC682280QpW.MAIN, new C19DX(this));
    }

    @Override // X.InterfaceC1893770zNf
    public boolean isActive() {
        return ((Boolean) C1563370qml.LIZ(this, EnumC682280QpW.GET_CURRENT_STATE, new AwS551S0100000_7(this, 119))).booleanValue();
    }

    @Override // X.C19EG, X.C19FO, android.app.Activity
    public void onResume() {
        C21504119Dr c21504119Dr = callback;
        c21504119Dr.getClass();
        C21504119Dr.LIZ(c21504119Dr, this, false, null, new C21503219Di(), 6);
        super.onResume();
        C21504119Dr.LIZ(c21504119Dr, this, false, null, new C21503019Dg(), 6);
    }

    @Override // X.C19GS, X.C19EG, android.app.Activity
    public void onStart() {
        C21504119Dr c21504119Dr = callback;
        c21504119Dr.getClass();
        C21504119Dr.LIZ(c21504119Dr, this, false, null, new C21503319Dj(), 6);
        super.onStart();
        C21504119Dr.LIZ(c21504119Dr, this, false, null, new C21503619Dm(), 6);
    }

    @Override // X.C19GS, X.C19EG, android.app.Activity
    public void onStop() {
        C21504119Dr c21504119Dr = callback;
        c21504119Dr.getClass();
        C21504119Dr.LIZ(c21504119Dr, this, false, null, AFwS355S0000000_32.get$arr$(10), 6);
        super.onStop();
        C21504119Dr.LIZ(c21504119Dr, this, false, null, AFwS355S0000000_32.get$arr$(7), 6);
    }

    @Override // android.app.Activity
    public void onUserInteraction() {
        C21504119Dr c21504119Dr = callback;
        c21504119Dr.getClass();
        C21504119Dr.LIZ(c21504119Dr, this, false, null, new C21503519Dl(), 6);
        super.onUserInteraction();
    }

    public BaseActivity() {
        List<Function0<List<C19D2>>> list = processGenerator;
        ArrayList arrayList = new ArrayList();
        Iterator<Function0<List<C19D2>>> it2 = list.iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI(it2.next().invoke(), arrayList);
        }
        this.innerProcessors = arrayList;
    }

    @Override // android.app.Activity
    public Intent getIntent() {
        Intent intent = super.getIntent();
        if (intent == null || !(!SmartIntent.isSmartIntent(intent))) {
            return intent;
        }
        Intent intentSmartIntent = SmartIntent.smartIntent(intent);
        setIntent(intentSmartIntent);
        return intentSmartIntent;
    }

    public final List<C19DE> getRealProcessors$base_foundation_release() {
        return (List) getBaseViewModel().vQ2().LIZ.getValue();
    }

    @Override // X.C19GS, X.C19EG, android.app.Activity
    public void onDestroy() {
        this.mDestroyTime = System.currentTimeMillis();
        C21504119Dr c21504119Dr = callback;
        c21504119Dr.getClass();
        C21504119Dr.LIZ(c21504119Dr, this, false, null, AFwS355S0000000_32.get$arr$(8), 6);
        super.onDestroy();
        C21504119Dr.LIZ(c21504119Dr, this, false, null, AFwS355S0000000_32.get$arr$(5), 6);
    }

    @Override // X.C19DB
    public BaseViewModel provideBaseViewModel() {
        return getBaseViewModel();
    }

    public boolean getEnableCallbacks() {
        return this.enableCallbacks;
    }

    public final List<C19D2> getInnerProcessors$base_foundation_release() {
        return this.innerProcessors;
    }

    public static void com_bytedance_ies_foundation_activity_BaseActivity_com_ss_android_ugc_aweme_lancet_CommonUILancet_onBaseAcitivtyPause(BaseActivity baseActivity) {
        baseActivity.com_bytedance_ies_foundation_activity_BaseActivity__onPause$___twin___();
        C1577910rAD.LIZ = baseActivity.getClass();
    }

    private final void tryCatchDeadSystemException(Function0<Unit> function0) {
        if (Build.VERSION.SDK_INT > 24) {
            try {
                function0.invoke();
                return;
            } catch (DeadSystemException e) {
                TryCatchGuardChecker.doCheck(e);
                return;
            }
        }
        function0.invoke();
    }

    public void activityConfiguration(Function1<? super C06W2, Unit> function1) {
        function1.invoke(getViewModel());
    }

    @Override // X.C19GS, X.C19FO, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        Iterator<InterfaceC21503119Dh> it2 = callback.LL.iterator();
        while (it2.hasNext()) {
            context = it2.next().LIZJ(context);
        }
        super.attachBaseContext(context);
        try {
            a.LIZLLL(this);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        Iterator<InterfaceC21503119Dh> it3 = callback.LL.iterator();
        while (it3.hasNext()) {
            it3.next().LJIL(this, context);
        }
    }

    @Override // X.C19GS, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C21504119Dr c21504119Dr = callback;
        c21504119Dr.getClass();
        C21504119Dr.LIZ(c21504119Dr, this, false, null, new AwS681S0100000_32(configuration, 15), 6);
    }

    @Override // X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public void onCreate(Bundle bundle) {
        tryCatchDeadSystemException(new C19DZ(this, bundle));
    }

    @Override // X.ActivityC21503719Dn, android.app.Activity
    public void onRestoreInstanceState(Bundle bundle) {
        C21504119Dr c21504119Dr = callback;
        c21504119Dr.getClass();
        C21504119Dr.LIZ(c21504119Dr, this, false, null, new AwS681S0100000_32(bundle, 16), 6);
        super.onRestoreInstanceState(bundle);
        C21504119Dr.LIZ(c21504119Dr, this, false, null, new AwS681S0100000_32(bundle, 17), 6);
    }

    @Override // androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        C21504119Dr c21504119Dr = callback;
        c21504119Dr.getClass();
        C21504119Dr.LIZ(c21504119Dr, this, false, null, new AwS354S0000000_32(bundle, 2), 6);
        super.onSaveInstanceState(bundle);
        C21504119Dr.LIZ(c21504119Dr, this, false, null, new AwS354S0000000_32(bundle, 1), 6);
    }

    @Override // X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        C21504119Dr c21504119Dr = callback;
        c21504119Dr.getClass();
        C21504119Dr.LIZ(c21504119Dr, this, false, null, new C21502719Dd(z), 6);
    }

    public void setActivityRef(WeakReference<BaseActivity> weakReference) {
        this.$$delegate_0.LL = weakReference;
    }

    @Override // X.C19GS, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i) {
        super.setContentView(i);
        C21504119Dr c21504119Dr = callback;
        c21504119Dr.getClass();
        C21504119Dr.LIZ(c21504119Dr, this, false, null, new AwS354S0000000_32(this, i, 0), 6);
    }

    @Override // X.C19GS, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        try {
            super.setTheme(i);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public void showCustomToast(String str) {
        BaseActivity baseActivity;
        IActivityCustomToastHelper iActivityCustomToastHelper;
        WeakReference<BaseActivity> weakReference = this.$$delegate_0.LL;
        if (weakReference != null && (baseActivity = weakReference.get()) != null && (!baseActivity.isDestroyed()) && (iActivityCustomToastHelper = C19DP.LIZJ) != null) {
            iActivityCustomToastHelper.showCustomToast(baseActivity, str);
        }
    }

    @Override // X.C19GS, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        C21504119Dr c21504119Dr = callback;
        c21504119Dr.getClass();
        C21504119Dr.LIZ(c21504119Dr, this, false, null, new C21502819De(this, view), 6);
    }

    @Override // android.app.Activity
    public void onActivityReenter(int i, Intent intent) {
        super.onActivityReenter(i, intent);
        C21504119Dr c21504119Dr = callback;
        c21504119Dr.getClass();
        C21504119Dr.LIZ(c21504119Dr, this, false, null, new AwS188S0101000_32(i, intent, 0), 6);
    }

    @Override // X.ActivityC21503719Dn, X.C19GS, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        C21504119Dr c21504119Dr = callback;
        c21504119Dr.getClass();
        Boolean bool = (Boolean) C21504119Dr.LIZ(c21504119Dr, this, false, Boolean.FALSE, new AwS188S0101000_32(i, keyEvent, 1), 2);
        if (bool != null && bool.booleanValue()) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // X.C12ET
    public void showCustomLongToast(int i, String str) {
        this.$$delegate_0.LIZ(i, str);
    }

    @Override // X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C21504119Dr c21504119Dr = callback;
        c21504119Dr.getClass();
        C21504119Dr.LIZ(c21504119Dr, this, false, null, new C21502919Df(i, i2, intent), 6);
    }

    public void showCustomToast(String str, int i, int i2) {
        BaseActivity baseActivity;
        IActivityCustomToastHelper iActivityCustomToastHelper;
        WeakReference<BaseActivity> weakReference = this.$$delegate_0.LL;
        if (weakReference != null && (baseActivity = weakReference.get()) != null && (!baseActivity.isDestroyed()) && (iActivityCustomToastHelper = C19DP.LIZJ) != null) {
            iActivityCustomToastHelper.showCustomToast(baseActivity, str);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void startActivityForResult(Intent intent, int i, Bundle bundle) throws Throwable {
        callback.getClass();
        Iterator it2 = ((List) getViewModel().vQ2().LIZ.getValue()).iterator();
        while (it2.hasNext()) {
            it2.next().getClass();
        }
        INVOKESPECIAL_com_bytedance_ies_foundation_activity_BaseActivity_com_bytedance_router_monitor_page_PageLancet_startActivityForResult(this, intent, i, bundle);
    }

    public static void INVOKESPECIAL_com_bytedance_ies_foundation_activity_BaseActivity_com_bytedance_router_monitor_page_PageLancet_startActivityForResult(ActivityC21503719Dn activityC21503719Dn, Intent intent, int i, Bundle bundle) throws Throwable {
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activityC21503719Dn, intent, "Activity_startActivityForResult_3");
        access$000(activityC21503719Dn, intent, i, bundle);
    }

    @Override // X.C12ET
    public void showCustomToast(int i, String str, int i2, int i3) {
        this.$$delegate_0.LIZ(i, str);
    }
}
