package com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.host.gamedetail;

import X.AbstractC1882430z5N;
import X.C1389600mGU;
import X.C1881590z41;
import X.C1881760z4I;
import X.C19GS;
import X.C2095008Iq;
import X.C520010KaN;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.host.leaderboard.LeaderboardPageFragment;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.scene.Scene;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: loaded from: classes29.dex */
public final class GameDetailPageActivity extends C19GS {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KyohOWE6JTUgZygyJSBiOS4hPCspOzw7ITViHELIOSJCYrJCQ1JjonZic5OiY9LTY/Zyc8OzFiLi4+LSEpPS46JGsLKCI2DCA4KCY/GCQrLA4wPCw6IDsq";

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        try {
            C1389600mGU.LIZIZ(this);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        overridePendingTransition(0, 0);
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

    @Override // X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        final String stringExtra;
        int iIntValue;
        final AbstractC1882430z5N c1881590z41;
        Integer numLJIIJJI;
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        Map map = null;
        getWindow().setEnterTransition(null);
        getWindow().setExitTransition(null);
        super.onCreate(bundle);
        setContentView(R.layout.j1);
        View viewFindViewById = findViewById(android.R.id.content);
        try {
            stringExtra = getIntent().getStringExtra("schema");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (stringExtra == null) {
            stringExtra = "";
        }
        Uri uri = UriProtector.parse(stringExtra);
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, Scene.SCENE_SERVICE);
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null && (numLJIIJJI = C2095008Iq.LJIIJJI(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) != null) {
            iIntValue = numLJIIJJI.intValue();
        } else {
            iIntValue = -1;
        }
        Serializable serializableExtra = getIntent().getSerializableExtra("extra");
        if (serializableExtra instanceof Map) {
            map = (Map) serializableExtra;
        }
        final FragmentManager fragmentManagerLJIL = C520010KaN.LJIL(this, true);
        if (!u.LJIJI(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "business"), "leaderboard", true) && iIntValue != 1000) {
            c1881590z41 = new C1881590z41(this, new C1881760z4I(iIntValue, this, a0.LJLJJI(a0.LJLJJI(a0.LJLILLLLZI(stringExtra).toString(), '\n'), '\r'), map));
        } else {
            c1881590z41 = new AbstractC1882430z5N(this, stringExtra) { // from class: X.0z3k
                public final String LLJILJILJ;
                public final LeaderboardPageFragment LLJILLL;

                @Override // X.AbstractC1882430z5N
                public final void LJIILL(boolean z) {
                    C23250099c.LIZLLL(LJIIIZ().LJIILL(), C0PEM.LIZJ, null, new C1881020z36(this, null), 2);
                }

                @Override // X.AbstractC1882430z5N
                public final void LJIJJ(FragmentManager fragmentManager) {
                    final LeaderboardPageFragment leaderboardPageFragment;
                    if (!fragmentManager.LJL() && !fragmentManager.LJLJJI() && (leaderboardPageFragment = this.LLJILLL) != null) {
                        leaderboardPageFragment.show(fragmentManager, "game_leaderboard");
                        C1882380z5I.LJI(LJII(), "leaderboard_page_raw_schema", this.LLJILJILJ);
                        LJIIIZ().getEventCenter().LIZJ("on_lynx_card_load_failed", new InterfaceC1882750z5t() { // from class: X.0z3l
                            @Override // X.InterfaceC1882750z5t
                            public final void y60(Object obj, String str) {
                                if (Intrinsics.LJFF(str, "on_lynx_card_load_failed")) {
                                    leaderboardPageFragment.dismiss();
                                }
                            }
                        });
                    }
                }

                {
                    this.LLJILJILJ = stringExtra;
                    C1882380z5I.LJI(LJII(), "entrance_type", "game_leaderboard");
                    LeaderboardPageFragment leaderboardPageFragment = new LeaderboardPageFragment();
                    leaderboardPageFragment.LLJ = this;
                    e(leaderboardPageFragment);
                    this.LLJILLL = leaderboardPageFragment;
                    LJIIZILJ("on_card_request_close");
                }

                @Override // X.AbstractC1882430z5N
                public final void LJIIJ(Object obj, String str) {
                    LeaderboardPageFragment leaderboardPageFragment;
                    if (Intrinsics.LJFF(str, "on_card_request_close") && (leaderboardPageFragment = this.LLJILLL) != null) {
                        leaderboardPageFragment.dismiss();
                    }
                }
            };
        }
        HandlerHook.viewPost(viewFindViewById, new Runnable() { // from class: X.0z8c
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                FragmentManager fragmentManager;
                C1C7U.LIZ("GameDetailPageActivity@db6b.onCreate$1");
                try {
                    if (!this.LL.isFinishing() && !this.LL.isDestroyed() && (fragmentManager = fragmentManagerLJIL) != null) {
                        AbstractC1882430z5N abstractC1882430z5N = c1881590z41;
                        if (!fragmentManager.LJL()) {
                            abstractC1882430z5N.LJIJJ(fragmentManager);
                        }
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("GameDetailPageActivity@db6b.onCreate$1");
            }
        });
    }
}
