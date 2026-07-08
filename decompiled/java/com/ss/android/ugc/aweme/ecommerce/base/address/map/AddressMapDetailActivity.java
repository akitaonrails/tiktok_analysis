package com.ss.android.ugc.aweme.ecommerce.base.address.map;

import X.AbstractActivityC1743740vTg;
import X.AnonymousClass0410;
import X.C1308910kAL;
import X.C1697810uHb;
import X.C19EH;
import X.C299020Bno;
import X.C335910DEv;
import X.EnumC1740810vOx;
import X.EnumC335920DEw;
import X.InterfaceC1740760vOs;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.address.AddressPageStarter;
import com.zhiliaoapp.musically.R;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class AddressMapDetailActivity extends AbstractActivityC1743740vTg implements InterfaceC1740760vOs {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGExKTYpHELIOSZy43LDcpOjx9JSQ8Zw43LDcpOjweKTUILDsyISkNKjs6Piw4MA==";
    public RelativeLayout LLILZIL;
    public final String LLILZLL = "address_map_detail_fragment";
    public AddressMapDetailFragment LLIZ;

    @Override // X.AbstractActivityC1743740vTg, X.InterfaceC1748820vbs
    public final String getPageName() {
        return "trajectory_map_for_address";
    }

    @Override // X.AbstractActivityC1743740vTg, com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.address.map.AddressMapDetailActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.address.map.AddressMapDetailActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.address.map.AddressMapDetailActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.address.map.AddressMapDetailActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.address.map.AddressMapDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.InterfaceC1740760vOs
    public final Map<String, String> r9() {
        return null;
    }

    @Override // X.InterfaceC1740760vOs
    public String getBtmPageCode() {
        return EnumC1740810vOx.ADDRESS_MAP_DETAIL_PAGE.getPageCode();
    }

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        finish();
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

    @Override // X.AbstractActivityC1743740vTg, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        AddressMapDetailFragment addressMapDetailFragment;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.address.map.AddressMapDetailActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.aj1);
        if (bundle != null) {
            Fragment fragmentLJJJJZI = getSupportFragmentManager().LJJJJZI(this.LLILZLL);
            if (fragmentLJJJJZI instanceof AddressMapDetailFragment) {
                addressMapDetailFragment = (AddressMapDetailFragment) fragmentLJJJJZI;
            } else {
                addressMapDetailFragment = null;
            }
            this.LLIZ = addressMapDetailFragment;
        }
        AnonymousClass0410 anonymousClass0410 = AddressPageStarter.AddressMapDetailEnterParams.Companion;
        Intent intent = getIntent();
        anonymousClass0410.getClass();
        AddressPageStarter.AddressMapDetailEnterParams addressMapDetailEnterParamsLIZIZ = AnonymousClass0410.LIZIZ(intent);
        if (addressMapDetailEnterParamsLIZIZ != null) {
            AddressMapDetailFragment addressMapDetailFragment2 = new AddressMapDetailFragment();
            addressMapDetailFragment2.LLILZIL = addressMapDetailEnterParamsLIZIZ;
            this.LLIZ = addressMapDetailFragment2;
        }
        AddressMapDetailFragment addressMapDetailFragment3 = this.LLIZ;
        if (addressMapDetailFragment3 != null) {
            C19EH c19ehLJIIJ = getSupportFragmentManager().LJIIJ();
            View viewFindViewById = this.LLILZIL;
            if (viewFindViewById == null) {
                viewFindViewById = findViewById(R.id.eqx);
                this.LLILZIL = (RelativeLayout) viewFindViewById;
            }
            c19ehLJIIJ.LIZJ(viewFindViewById.getId(), addressMapDetailFragment3, this.LLILZLL);
            c19ehLJIIJ.LJIIJ();
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.address.map.AddressMapDetailActivity", "onCreate", false);
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
