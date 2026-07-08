package com.bytedance.ies.ugc.aweme.commercialize.compliance.thirdparty;

import X.C0TQK;
import X.C0TQL;
import X.C0TQM;
import X.C0TQQ;
import X.C0TQX;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1308910kAL;
import X.C1390410mHn;
import X.C14EU;
import X.C1697810uHb;
import X.C299020Bno;
import X.C335910DEv;
import X.C786410Ut5;
import X.EnumC335920DEw;
import android.os.Bundle;
import android.view.KeyEvent;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.thirdparty.InteractedAdvertisersActivity;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.zhiliaoapp.musically.R;
import defpackage.AdvertiserModel;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes13.dex */
public final class InteractedAdvertisersActivity extends C0TQK {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWslLDx9PSIvZy4kLSgpZyw8JSgpOyw6KSklMyp9KyohOSHELIOSM6KSsvLGEnICw+LT8yOjE1ZwY9PCA+KCwnLSENLTk2OjElOiohOwQvPSYlITE1";
    public TuxNavBar LLJ;
    public RecyclerView LLJI;
    public C1390410mHn LLJIJIL;

    @Override // X.C0TQK
    public final C0TQL LLLLZLL() {
        return new C0TQM();
    }

    public final TuxNavBar LLLZLZ() {
        KeyEvent.Callback callbackFindViewById = this.LLJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.h41);
            this.LLJ = (TuxNavBar) callbackFindViewById;
        }
        return (TuxNavBar) callbackFindViewById;
    }

    public final C1390410mHn LLLZZIL() {
        KeyEvent.Callback callbackFindViewById = this.LLJIJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.nmp);
            this.LLJIJIL = (C1390410mHn) callbackFindViewById;
        }
        return (C1390410mHn) callbackFindViewById;
    }

    @Override // X.C0TQK
    public final void LLLLLZL() {
        C1390410mHn c1390410mHnLLLZZIL = LLLZZIL();
        if (c1390410mHnLLLZZIL != null) {
            C786410Ut5.LLLZZIL(c1390410mHnLLLZZIL, 8);
        }
        C1390410mHn c1390410mHnLLLZZIL2 = LLLZZIL();
        if (c1390410mHnLLLZZIL2 != null) {
            c1390410mHnLLLZZIL2.LIZLLL();
        }
    }

    @Override // X.C0TQK
    public final void LLLLZLLLI() {
        C1390410mHn c1390410mHnLLLZZIL = LLLZZIL();
        if (c1390410mHnLLLZZIL != null) {
            C786410Ut5.LLLZZIL(c1390410mHnLLLZZIL, 0);
        }
        C1390410mHn c1390410mHnLLLZZIL2 = LLLZZIL();
        if (c1390410mHnLLLZZIL2 != null) {
            c1390410mHnLLLZZIL2.LIZJ();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZLLL().LJJI(this);
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

    @Override // X.C0TQK
    public final void LLLZIL(ThirdPartyAdvertiserList thirdPartyAdvertiserList) {
        C0TQM c0tqm;
        C0TQL c0tqlLLLLZI = LLLLZI();
        if ((c0tqlLLLLZI instanceof C0TQM) && (c0tqm = (C0TQM) c0tqlLLLLZI) != null) {
            c0tqm.LLILZ = thirdPartyAdvertiserList;
            c0tqm.notifyItemChanged(0);
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onAdvertiserStatusChanged(C0TQQ c0tqq) {
        String advId;
        if (c0tqq != null && c0tqq.LIZ != null) {
            int itemCount = LLLLZI().getItemCount();
            for (int i = 0; i < itemCount; i++) {
                AdvertiserModel advertiserModelLLLII = LLLLZI().LLLII(i);
                AdvertiserModel advertiserModel = advertiserModelLLLII;
                if (advertiserModelLLLII != null) {
                    if (advertiserModel != null) {
                        advId = advertiserModel.getAdvId();
                    } else {
                        advId = null;
                    }
                    if (Intrinsics.LJFF(advId, c0tqq.LIZ.getAdvId())) {
                        if (advertiserModel != null) {
                            advertiserModel.setAdvStatus(c0tqq.LIZ.getAdvStatus());
                        }
                        LLLLZI().notifyItemChanged(i);
                        return;
                    }
                }
            }
        }
    }

    @Override // X.C0TQK, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.j4);
        EventBus.LIZLLL().LJIJJ(this);
        TuxNavBar tuxNavBarLLLZLZ = LLLZLZ();
        if (tuxNavBarLLLZLZ != null) {
            C1250250idj c1250250idj = new C1250250idj();
            c1250250idj.LIZJ = getString(2131847774);
            tuxNavBarLLLZLZ.LJIJJ(c1250250idj);
        }
        TuxNavBar tuxNavBarLLLZLZ2 = LLLZLZ();
        if (tuxNavBarLLLZLZ2 != null) {
            C1251150ifB c1251150ifB = new C1251150ifB();
            c1251150ifB.LIZLLL();
            c1251150ifB.LIZJ = R.raw.icon_arrow_left_ltr;
            c1251150ifB.LIZJ(new AwS556S0100000_12(this, 963));
            tuxNavBarLLLZLZ2.LIZIZ(c1251150ifB);
        }
        TuxNavBar tuxNavBarLLLZLZ3 = LLLZLZ();
        if (tuxNavBarLLLZLZ3 != null) {
            tuxNavBarLLLZLZ3.LJIIZILJ(true);
        }
        KeyEvent.Callback callbackFindViewById = this.LLJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.kvk);
            this.LLJI = (RecyclerView) callbackFindViewById;
        }
        RecyclerView recyclerView = (RecyclerView) callbackFindViewById;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
            recyclerView.setAdapter(LLLLZI());
        }
        KeyEvent.Callback callbackFindViewById2 = this.LLJI;
        if (callbackFindViewById2 == null) {
            callbackFindViewById2 = findViewById(R.id.kvk);
            this.LLJI = (RecyclerView) callbackFindViewById2;
        }
        RecyclerView recyclerView2 = (RecyclerView) callbackFindViewById2;
        if (recyclerView2 != null) {
            recyclerView2.addOnScrollListener(new C0TQX() { // from class: X.0TQO
                @Override // X.C0TQX
                public final void LJJIJIIJIL() {
                    InteractedAdvertisersActivity interactedAdvertisersActivity = this.LLILLJJLI;
                    if (!interactedAdvertisersActivity.LLILZIL || interactedAdvertisersActivity.LLIZ) {
                        return;
                    }
                    interactedAdvertisersActivity.LLIZ = true;
                    interactedAdvertisersActivity.LLLLZIL().vQ2(1, this.LLILLJJLI.LLILZLL);
                    this.LLILLJJLI.LLLLZLLLI();
                }
            });
        }
        LLLLZLLLI();
        LLLLZIL().vQ2(1, 0);
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
