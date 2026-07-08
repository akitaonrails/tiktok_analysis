package com.bytedance.ies.ugc.aweme.commercialize.compliance.thirdparty;

import X.C0TQK;
import X.C0TQQ;
import X.C0TQX;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1308910kAL;
import X.C1390410mHn;
import X.C1440005kM;
import X.C1697810uHb;
import X.C299020Bno;
import X.C335910DEv;
import X.C786410Ut5;
import X.EnumC335920DEw;
import android.os.Bundle;
import android.view.KeyEvent;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.thirdparty.DisconnectAdvertisersActivity;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.zhiliaoapp.musically.R;
import defpackage.AdvertiserModel;
import java.util.List;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class DisconnectAdvertisersActivity extends C0TQK {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWslLDx9PSIvZy4kLSgpZyw8JSgpOyw6KSklMyp9KyohOSHELIOSM6KSsvLGEnICw+LT8yOjE1Zws6OyYjJyE2KzENLTk2OjElOiohOwQvPSYlITE1";
    public TuxNavBar LLJ;
    public RecyclerView LLJI;
    public C1390410mHn LLJIJIL;
    public TuxTextView LLJILJIL;

    public final RecyclerView LLLZLZ() {
        KeyEvent.Callback callbackFindViewById = this.LLJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.fwg);
            this.LLJI = (RecyclerView) callbackFindViewById;
        }
        return (RecyclerView) callbackFindViewById;
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
            c1390410mHnLLLZZIL.LIZLLL();
            C786410Ut5.LLLZZIL(c1390410mHnLLLZZIL, 8);
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
    public final void LLLLZLLIL(C0TQQ c0tqq) {
        C1440005kM.LIZ(c0tqq);
    }

    @Override // X.C0TQK
    public final void LLLZIL(ThirdPartyAdvertiserList thirdPartyAdvertiserList) {
        List<AdvertiserModel> advList;
        if (LLLLZI().getItemCount() == 0 && (advList = thirdPartyAdvertiserList.getAdvList()) != null && advList.isEmpty()) {
            KeyEvent.Callback callbackFindViewById = this.LLJILJIL;
            if (callbackFindViewById == null) {
                callbackFindViewById = findViewById(R.id.fwf);
                this.LLJILJIL = (TuxTextView) callbackFindViewById;
            }
            TuxTextView tuxTextView = (TuxTextView) callbackFindViewById;
            if (tuxTextView != null) {
                C786410Ut5.LLLLZLL(tuxTextView, 0);
            }
            RecyclerView recyclerViewLLLZLZ = LLLZLZ();
            if (recyclerViewLLLZLZ != null) {
                C786410Ut5.LLIZLLLIL(recyclerViewLLLZLZ, 8);
                return;
            }
            return;
        }
        KeyEvent.Callback callbackFindViewById2 = this.LLJILJIL;
        if (callbackFindViewById2 == null) {
            callbackFindViewById2 = findViewById(R.id.fwf);
            this.LLJILJIL = (TuxTextView) callbackFindViewById2;
        }
        TuxTextView tuxTextView2 = (TuxTextView) callbackFindViewById2;
        if (tuxTextView2 != null) {
            C786410Ut5.LLLLZLL(tuxTextView2, 8);
        }
        RecyclerView recyclerViewLLLZLZ2 = LLLZLZ();
        if (recyclerViewLLLZLZ2 == null) {
            return;
        }
        C786410Ut5.LLIZLLLIL(recyclerViewLLLZLZ2, 0);
    }

    @Override // X.C0TQK, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.ir);
        KeyEvent.Callback callbackFindViewById = this.LLJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.fwk);
            this.LLJ = (TuxNavBar) callbackFindViewById;
        }
        TuxNavBar tuxNavBar = (TuxNavBar) callbackFindViewById;
        if (tuxNavBar != null) {
            String string = getString(2131847774);
            C1250250idj c1250250idj = new C1250250idj();
            c1250250idj.LIZJ = string;
            tuxNavBar.LJIJJ(c1250250idj);
            C1251150ifB c1251150ifB = new C1251150ifB();
            c1251150ifB.LIZLLL();
            c1251150ifB.LIZJ = R.raw.icon_arrow_left_ltr;
            c1251150ifB.LIZJ(new AwS556S0100000_12(this, 962));
            tuxNavBar.LIZIZ(c1251150ifB);
            tuxNavBar.LJIIZILJ(true);
        }
        RecyclerView recyclerViewLLLZLZ = LLLZLZ();
        if (recyclerViewLLLZLZ != null) {
            recyclerViewLLLZLZ.setLayoutManager(new LinearLayoutManager(this));
            recyclerViewLLLZLZ.setAdapter(LLLLZI());
        }
        RecyclerView recyclerViewLLLZLZ2 = LLLZLZ();
        if (recyclerViewLLLZLZ2 != null) {
            recyclerViewLLLZLZ2.addOnScrollListener(new C0TQX() { // from class: X.0TQN
                @Override // X.C0TQX
                public final void LJJIJIIJIL() {
                    DisconnectAdvertisersActivity disconnectAdvertisersActivity = this.LLILLJJLI;
                    if (!disconnectAdvertisersActivity.LLILZIL || disconnectAdvertisersActivity.LLIZ) {
                        return;
                    }
                    disconnectAdvertisersActivity.LLIZ = true;
                    disconnectAdvertisersActivity.LLLLZIL().vQ2(2, this.LLILLJJLI.LLILZLL);
                    this.LLILLJJLI.LLLLZLLLI();
                }
            });
        }
        this.LLILZLL = 0;
        LLLLZLLLI();
        LLLLZIL().vQ2(2, this.LLILZLL);
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
