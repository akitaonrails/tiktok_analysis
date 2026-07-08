package com.ss.android.ugc.aweme.account.ui;

import X.AbstractActivityC1237560iJG;
import X.C01GW;
import X.C0XPY;
import X.C0XQ5;
import X.C1308910kAL;
import X.C1697810uHb;
import X.C299020Bno;
import X.C335910DEv;
import X.C452501pT;
import X.C786410Ut5;
import X.C852970Xd9;
import X.C853040XdG;
import X.C853670XeH;
import X.C960203pA;
import X.EnumC335920DEw;
import X.EnumC852660Xce;
import X.EnumC852910Xd3;
import X.InterfaceC586170Myt;
import X.InterfaceC876920Yag;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.account.login.v2.base.ActionResultModel;
import com.ss.android.ugc.aweme.app.services.IPushLaunchPageAssistantService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AwS592S0100000_13;

/* JADX INFO: loaded from: classes14.dex */
public final class BindOrModifyPhoneActivity extends AbstractActivityC1237560iJG implements InterfaceC876920Yag {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQvKiAmJjHELIOSFiPCZ9CiwiLQAhBSooICkqGC0jJyoSKzElPyYnMQ==";
    public boolean LLILZLL;
    public Bundle LLIZ;
    public Integer LLIZLLLIL;
    public EnumC852910Xd3 LLILZIL = EnumC852910Xd3.INPUT_PHONE_BIND;
    public final C01GW LLJ = C452501pT.LIZIZ(new C853040XdG(this));

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.ui.BindOrModifyPhoneActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.ui.BindOrModifyPhoneActivity", "onResume", false);
    }

    @Override // X.AbstractActivityC1237560iJG, com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.ui.BindOrModifyPhoneActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.ui.BindOrModifyPhoneActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.ui.BindOrModifyPhoneActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.InterfaceC876920Yag
    public final List<Integer> zs() {
        return Collections.singletonList(10);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity
    public final void finish() {
        super.finish();
        if (this.LLILZLL) {
            C0XQ5.LJIIJJI(this.LLIZLLLIL.intValue(), 1, this.LLIZ);
            return;
        }
        List<InterfaceC586170Myt> list = C0XQ5.LIZ;
        ((IPushLaunchPageAssistantService) C0XPY.LIZIZ(IPushLaunchPageAssistantService.class)).onFinish(this);
        User userLIZJ = C0XQ5.LIZJ();
        if (userLIZJ == null || userLIZJ.isPhoneBinded()) {
            return;
        }
        C0XQ5.LJIIJJI(7, 2, null);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStop() {
        super.onStop();
        if (this.LLILLL) {
            finish();
        }
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

    @Override // X.AbstractActivityC1237560iJG
    public final void LLLLZLLIL(Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        C852970Xd9 c852970Xd9 = EnumC852910Xd3.Companion;
        int i = bundle2.getInt("next_page", EnumC852910Xd3.INPUT_PHONE_BIND.getValue());
        c852970Xd9.getClass();
        EnumC852910Xd3 enumC852910Xd3LIZ = C852970Xd9.LIZ(i);
        bundle2.putInt("previous_page", bundle2.getInt("current_page", -1));
        bundle2.putInt("current_page", enumC852910Xd3LIZ.getValue());
        bundle2.remove("next_page");
        C786410Ut5.LJJJI("previous_page_name", bundle2.getString("current_page_name"), bundle2);
        bundle2.remove("current_page_name");
        C853670XeH.LIZ.getClass();
        AbstractActivityC1237560iJG.LLLZ(this, C853670XeH.LIZ(enumC852910Xd3LIZ), bundle2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0077, code lost:
    
        if (r4 != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bb, code lost:
    
        if (r11 != null) goto L18;
     */
    @Override // X.AbstractActivityC1237560iJG
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLLZLLLI(android.os.Bundle r11) {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.ui.BindOrModifyPhoneActivity.LLLLZLLLI(android.os.Bundle):void");
    }

    @Override // X.AbstractActivityC1237560iJG, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Bundle bundle2;
        String stringExtra;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.ui.BindOrModifyPhoneActivity", "onCreate", true);
        activityConfiguration(new AwS592S0100000_13(this, 37));
        super.onCreate(bundle);
        getWindow().setBackgroundDrawable(new ColorDrawable(C960203pA.LIZ(R.attr.bx, this)));
        C852970Xd9 c852970Xd9 = EnumC852910Xd3.Companion;
        int intExtra = getIntent().getIntExtra("next_page", EnumC852910Xd3.INPUT_PHONE_BIND.getValue());
        c852970Xd9.getClass();
        this.LLILZIL = C852970Xd9.LIZ(intExtra);
        Intent intent = getIntent();
        EnumC852660Xce enumC852660Xce = EnumC852660Xce.NONE;
        if (intent.getIntExtra("current_scene", enumC852660Xce.getValue()) == enumC852660Xce.getValue()) {
            getIntent().putExtra("current_scene", EnumC852660Xce.BIND_PHONE.getValue());
            getIntent().putExtra("enter_method", "first_bind_phone_click");
        }
        if (bundle == null) {
            MediatorLiveData<Bundle> mediatorLiveData = ((ActionResultModel) ViewModelProviders.of(this).get(ActionResultModel.class)).LL;
            String stringExtra2 = null;
            try {
                bundle2 = getIntent().getExtras();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            try {
                stringExtra = getIntent().getStringExtra("ENTER_REASON");
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                stringExtra = null;
            }
            C786410Ut5.LJJJI("enter_from", stringExtra, bundle2);
            try {
                stringExtra2 = getIntent().getStringExtra("enter_method");
            } catch (Exception e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            C786410Ut5.LJJJI("enter_method", stringExtra2, bundle2);
            String strLLLLLZL = AbstractActivityC1237560iJG.LLLLLZL(getIntent(), "enter_type");
            if (strLLLLLZL == null) {
                strLLLLLZL = "";
            }
            C786410Ut5.LJJJI("enter_type", strLLLLLZL, bundle2);
            bundle2.putInt("next_page", this.LLILZIL.getValue());
            mediatorLiveData.postValue(bundle2);
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.ui.BindOrModifyPhoneActivity", "onCreate", false);
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
