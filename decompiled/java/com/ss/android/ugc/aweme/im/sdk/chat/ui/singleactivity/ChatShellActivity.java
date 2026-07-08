package com.ss.android.ugc.aweme.im.sdk.chat.ui.singleactivity;

import X.AbstractC1563340qmi;
import X.C1308910kAL;
import X.C1617800sCY;
import X.C1697810uHb;
import X.C199Y;
import X.C2188811AlT;
import X.C299020Bno;
import X.C335910DEv;
import X.EnumC335920DEw;
import X.EnumC682280QpW;
import X.InterfaceC214902198i;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.SAFContextThemeConfig;
import com.ss.android.ugc.aweme.im.common.experiment.ChatSAFLifecycleCheckSetting;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/* JADX INFO: loaded from: classes25.dex */
public final class ChatShellActivity extends C199Y {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiwhZzw3I2svIS4nHELIOSZjAlZzw6JiIgLC4wPCw6IDsqZgYkKDsAICAgJQ4wPCw6IDsq";
    public final Class<? extends InterfaceC214902198i> LL = ChatRootFragment.class;
    public final boolean LLILLJJLI = true;
    public final boolean LLILLL = true;
    public final boolean LLILZ = ((ChatSAFLifecycleCheckSetting.MetaData) ChatSAFLifecycleCheckSetting.LIZIZ.getValue()).checkSAFCheck;
    public final SAFContextThemeConfig LLILZIL = new SAFContextThemeConfig(false, 0);
    public final float LLILZLL = C1617800sCY.LIZ();

    @Override // X.C199Y, X.InterfaceC214897198d
    public final boolean isDelegateFragmentManager() {
        return true;
    }

    @Override // X.C199Y, X.InterfaceC214897198d
    public final boolean migrateDarkModeImplToFragment() {
        return true;
    }

    @Override // X.C199Y, X.InterfaceC214897198d
    public final boolean migrateImmersiveBarImplToFragment() {
        return true;
    }

    @Override // X.C199Y, com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.ui.singleactivity.ChatShellActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.ui.singleactivity.ChatShellActivity", "onResume", false);
    }

    @Override // X.C199Y, com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.ui.singleactivity.ChatShellActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.ui.singleactivity.ChatShellActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.ui.singleactivity.ChatShellActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.C199Y
    public final AbstractC1563340qmi createSafLifecycleRegistry() {
        return new AbstractC1563340qmi(this) { // from class: X.0sCV
            @Override // X.AbstractC1563340qmi
            public final String LJ() {
                return "ChatSAFPrefixId";
            }

            @Override // X.AbstractC1563340qmi, X.InterfaceC1563360qmk
            public final boolean LIZIZ() {
                return ((ChatSAFLifecycleCheckSetting.MetaData) ChatSAFLifecycleCheckSetting.LIZIZ.getValue()).checkSAFCheck;
            }

            @Override // X.AbstractC1563340qmi
            public final boolean LJII() {
                C01GW c01gw = ChatSAFLifecycleCheckSetting.LIZIZ;
                if (!((ChatSAFLifecycleCheckSetting.MetaData) c01gw.getValue()).checkSAFCheck || ((ChatSAFLifecycleCheckSetting.MetaData) c01gw.getValue()).crashRatio <= 0.0f) {
                    return false;
                }
                return ((ChatSAFLifecycleCheckSetting.MetaData) c01gw.getValue()).crashRatio >= 1.0f || ((Random) ChatSAFLifecycleCheckSetting.LIZJ.getValue()).nextFloat() < ((ChatSAFLifecycleCheckSetting.MetaData) c01gw.getValue()).crashRatio;
            }

            {
                super(this);
            }
        };
    }

    @Override // X.C199Y, com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
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

    @Override // X.C199Y
    public final float getAutoRecycleInvisibleScenesThreshold() {
        return this.LLILZLL;
    }

    @Override // X.C199Y
    public final boolean getEnableNavigation() {
        return this.LLILLJJLI;
    }

    @Override // X.C199Y
    public final boolean getEnableUseNavigationSceneWindowFocusChangedDispatch() {
        return this.LLILLL;
    }

    @Override // X.C199Y
    public final boolean getEnableViewModelStoreCheck() {
        return this.LLILZ;
    }

    @Override // X.C199Y
    public final Class<? extends InterfaceC214902198i> getRootFragmentClz() {
        return this.LL;
    }

    @Override // X.C199Y
    public final SAFContextThemeConfig getRootPageContextConfig() {
        return this.LLILZIL;
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19FO, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        AbstractC1563340qmi abstractC1563340qmi;
        super.attachBaseContext(context);
        Lifecycle lifecycle = getLifecycle();
        if ((lifecycle instanceof AbstractC1563340qmi) && (abstractC1563340qmi = (AbstractC1563340qmi) lifecycle) != null) {
            abstractC1563340qmi.LIZLLL(EnumC682280QpW.MAIN.getValue() | EnumC682280QpW.FINISH.getValue() | EnumC682280QpW.IS_FINISHING.getValue() | EnumC682280QpW.IS_DESTROY.getValue());
            abstractC1563340qmi.LIZLLL(EnumC682280QpW.GET_CURRENT_STATE.getValue() | EnumC682280QpW.LIVEDATA_OBSERVE.getValue() | EnumC682280QpW.VSCOPE_ATTACH.getValue());
            abstractC1563340qmi.LIZLLL(EnumC682280QpW.VIEWMODEL_STORE.getValue());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00c3  */
    @Override // X.C199Y, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r12) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.ui.singleactivity.ChatShellActivity.onCreate(android.os.Bundle):void");
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.String] */
    public final void LLLLLZL(int i, View view, String str, List list) {
        String strLIZIZ;
        int id = view.getId();
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(getResources().getResourceTypeName(id));
            sbLIZ.append('/');
            sbLIZ.append(getResources().getResourceEntryName(id));
            id = C2188811AlT.LIZIZ(sbLIZ);
            strLIZIZ = id;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("id/");
            sbLIZ2.append(Integer.toHexString(id));
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        }
        String str2 = str + " -> " + view.getClass().getSimpleName() + '(' + strLIZIZ + ')';
        if (view.getId() == i) {
            ((ArrayList) list).add(str2);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                LLLLLZL(i, viewGroup.getChildAt(i2), str2, list);
            }
        }
    }
}
