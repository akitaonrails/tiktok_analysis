package com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.pdp;

import X.C0DDA;
import X.C0DET;
import X.C1308910kAL;
import X.C1524305xx;
import X.C19EH;
import X.C2188811AlT;
import X.C332710D2n;
import X.C335000DBi;
import X.C786410Ut5;
import X.C960203pA;
import X.EnumC335450DDb;
import X.InterfaceC333090D3z;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.ugc.aweme.rich.model.CommonAdData;
import com.bytedance.immersionbar.ImmersionBar;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.system.TuxImmersionBar;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
public final class PdpActivity extends C0DET implements InterfaceC333090D3z {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJCI2OiYlKCM6HELIOSMiBiPCwjZiwhOSN9PSxiOS40LTZiOSsjZhUoOQ4wPCw6IDsq";

    @Override // X.C0DET
    public final boolean LLLLZLLLI() {
        return true;
    }

    @Override // X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.pdp.PdpActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.pdp.PdpActivity", "onResume", false);
    }

    @Override // X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.pdp.PdpActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.pdp.PdpActivity", "onStart", false);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.pdp.PdpActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.C0DET
    public final int LLLLZIL() {
        return EnumC335450DDb.PDP.getValue();
    }

    @Override // X.InterfaceC333090D3z
    public final CommonAdData ee() {
        PdpFragment pdpFragment;
        Fragment fragmentLJJJJZI = getSupportFragmentManager().LJJJJZI("UcpPdpFragment");
        if (!(fragmentLJJJJZI instanceof PdpFragment) || (pdpFragment = (PdpFragment) fragmentLJJJJZI) == null) {
            return null;
        }
        return pdpFragment.ee();
    }

    @Override // X.InterfaceC333090D3z
    public final C335000DBi g4() {
        PdpFragment pdpFragment;
        Fragment fragmentLJJJJZI = getSupportFragmentManager().LJJJJZI("UcpPdpFragment");
        if (!(fragmentLJJJJZI instanceof PdpFragment) || (pdpFragment = (PdpFragment) fragmentLJJJJZI) == null) {
            return null;
        }
        return pdpFragment.LLJJ;
    }

    @Override // X.C19GS, X.C19EG, android.app.Activity
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

    @Override // X.C0DET, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Object serializableExtra;
        int iIntValue;
        Bundle extras;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.pdp.PdpActivity", "onCreate", true);
        super.onCreate(bundle);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("entry context -> ");
        Intent intent = getIntent();
        if (intent != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                serializableExtra = intent.getSerializableExtra("ucp_entry_context", C332710D2n.class);
            } else {
                Serializable serializableExtra2 = intent.getSerializableExtra("ucp_entry_context");
                if (!(serializableExtra2 instanceof C332710D2n)) {
                    serializableExtra2 = null;
                }
                serializableExtra = (C332710D2n) serializableExtra2;
            }
        } else {
            serializableExtra = null;
        }
        sbLIZ.append(serializableExtra);
        C2188811AlT.LIZIZ(sbLIZ);
        boolean zLIZIZ = C960203pA.LIZIZ(this);
        ImmersionBar immersionBarLJIILJJIL = ImmersionBar.LJIILJJIL(this);
        TuxImmersionBar tuxImmersionBar = new TuxImmersionBar(this, immersionBarLJIILJJIL);
        tuxImmersionBar.LJIIIIZZ(R.attr.zq);
        tuxImmersionBar.LJ(R.attr.zq);
        boolean z = true ^ zLIZIZ;
        immersionBarLJIILJJIL.LJIIJ(z);
        immersionBarLJIILJJIL.LJII(z);
        tuxImmersionBar.LIZ(false);
        tuxImmersionBar.LIZLLL();
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setId(R.id.ucp_pdp_fragment_container);
        frameLayout.setLayoutDirection(3);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zq, this);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        frameLayout.setBackgroundColor(iIntValue);
        C786410Ut5.a6(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        setContentView(frameLayout);
        if (bundle == null) {
            Intent intent2 = getIntent();
            if (intent2 != null) {
                try {
                    extras = intent2.getExtras();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (extras == null) {
                    extras = new Bundle();
                }
                Bundle bundle2 = new Bundle(extras);
                C1524305xx.LIZ.getClass();
                C1524305xx.LIZJ(bundle2);
                C19EH c19ehLJIIJ = getSupportFragmentManager().LJIIJ();
                int id = frameLayout.getId();
                String str = PdpFragment._pnsPageId;
                c19ehLJIIJ.LJIJ(id, C0DDA.LIZ(bundle2), "UcpPdpFragment");
                c19ehLJIIJ.LJIIIZ();
            } else {
                extras = new Bundle();
                Bundle bundle22 = new Bundle(extras);
                C1524305xx.LIZ.getClass();
                C1524305xx.LIZJ(bundle22);
                C19EH c19ehLJIIJ2 = getSupportFragmentManager().LJIIJ();
                int id2 = frameLayout.getId();
                String str2 = PdpFragment._pnsPageId;
                c19ehLJIIJ2.LJIJ(id2, C0DDA.LIZ(bundle22), "UcpPdpFragment");
                c19ehLJIIJ2.LJIIIZ();
            }
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.pdp.PdpActivity", "onCreate", false);
    }
}
