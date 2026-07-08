package com.ss.android.ugc.aweme.live;

import X.C011Z;
import X.C01GW;
import X.C0HM9;
import X.C0UU9;
import X.C1119850fFP;
import X.C1308910kAL;
import X.C1697810uHb;
import X.C19EH;
import X.C202142147o;
import X.C299020Bno;
import X.C335910DEv;
import X.C452501pT;
import X.C565740MGu;
import X.C786410Ut5;
import X.EnumC335920DEw;
import X.InterfaceC20573715ex;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.KeyEvent;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import com.bytedance.android.livesdk.broadcast.preview.LiveCoverCameraFragment;
import com.bytedance.android.livesdk.internal.Live;
import com.bytedance.android.livesdk.utils.crop.CropFragment;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AwS575S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class LiveCoverCameraActivity extends BaseActivity implements InterfaceC20573715ex {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiklHELIOSPyp9BCw6LAw8PiA+Ci4+LTctCCwnITMlPTY=";
    public C0UU9 LL;
    public CropFragment LLILLJJLI;
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(216));

    @Override // X.InterfaceC20573715ex
    public final void E4() {
    }

    @Override // X.InterfaceC20573715ex
    public final boolean K6() {
        return false;
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        C202142147o.LIZ = null;
        super.onDestroy();
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveCoverCameraActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveCoverCameraActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveCoverCameraActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.InterfaceC20573715ex
    public final boolean wy() {
        return false;
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        Object obj;
        Lifecycle lifecycle;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveCoverCameraActivity", "onResume", true);
        super.onResume();
        if (C0HM9.LIZ && (obj = this.LL) != null && (lifecycle = ((Fragment) obj).getLifecycle()) != null) {
            lifecycle.addObserver(((IComplianceBusinessService) this.LLILLL.getValue()).LJJJJLI(this, 2131833820, "direct_shoot", "personal_homepage", "", null));
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveCoverCameraActivity", "onResume", false);
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
        CropFragment cropFragment;
        CropFragment cropFragment2;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveCoverCameraActivity", "onCreate", true);
        super.onCreate(bundle);
        C1119850fFP c1119850fFP = C011Z.LIZ;
        if (c1119850fFP.LJIJJ(this)) {
            setTheme(R.style.y0);
        }
        getTheme().applyStyle(c1119850fFP.LJIILJJIL(this), false);
        setContentView(R.layout.dau);
        getWindow().getDecorView().setBackgroundResource(0);
        Parcelable parcelableExtra = getIntent().getParcelableExtra("photoUri");
        boolean booleanExtra = getIntent().getBooleanExtra("isFromLiveCover", false);
        boolean booleanExtra2 = getIntent().getBooleanExtra("isFromMultiGuest", false);
        float floatExtra = getIntent().getFloatExtra("withToHeightRatio", 1.0f);
        if (booleanExtra) {
            if (parcelableExtra != null) {
                cropFragment2 = new CropFragment();
                Bundle bundle2 = new Bundle();
                C786410Ut5.LJJIJL(bundle2, "arg_origin_uri", parcelableExtra);
                bundle2.putBoolean("arg_is_for_live_cover", booleanExtra);
                cropFragment2.setArguments(bundle2);
            } else {
                cropFragment2 = null;
            }
            this.LLILLJJLI = cropFragment2;
            if (cropFragment2 != null) {
                cropFragment2.LLIZLLLIL = new AwS575S0100000_31(this, 763);
            }
        } else if (booleanExtra2) {
            if (parcelableExtra != null) {
                cropFragment = new CropFragment();
                Bundle bundle3 = new Bundle();
                C786410Ut5.LJJIJL(bundle3, "arg_origin_uri", parcelableExtra);
                bundle3.putBoolean("arg_is_for_multi_guest", booleanExtra2);
                bundle3.putFloat("arg_width_to_height_ratio", floatExtra);
                cropFragment.setArguments(bundle3);
            } else {
                cropFragment = null;
            }
            this.LLILLJJLI = cropFragment;
            if (cropFragment != null) {
                cropFragment.LLIZLLLIL = new AwS575S0100000_31(this, 764);
            }
        }
        C0UU9 c0uu9CreateLiveCoverCameraFragment = Live.getService().createLiveCoverCameraFragment();
        this.LL = c0uu9CreateLiveCoverCameraFragment;
        if (c0uu9CreateLiveCoverCameraFragment != null) {
            ((LiveCoverCameraFragment) c0uu9CreateLiveCoverCameraFragment).LLJJJJLIIL = new AwS575S0100000_31(this, 765);
        }
        C19EH c19ehLJIIJ = getSupportFragmentManager().LJIIJ();
        c19ehLJIIJ.LJIJ(R.id.iiv, (Fragment) this.LL, null);
        c19ehLJIIJ.LJIIIZ();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveCoverCameraActivity", "onCreate", false);
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
        if (!C565740MGu.LIZ() || (i != 24 && i != 25)) {
            return super.onKeyDown(i, keyEvent);
        }
        C0UU9 c0uu9 = this.LL;
        if (c0uu9 != null) {
            LiveCoverCameraFragment liveCoverCameraFragment = (LiveCoverCameraFragment) c0uu9;
            if (!liveCoverCameraFragment.LLJJIII) {
                liveCoverCameraFragment.SR();
                return true;
            }
            return true;
        }
        return false;
    }
}
