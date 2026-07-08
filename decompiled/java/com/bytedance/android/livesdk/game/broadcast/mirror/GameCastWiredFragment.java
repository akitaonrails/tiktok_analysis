package com.bytedance.android.livesdk.game.broadcast.mirror;

import X.1JLc;
import X.C098200Yq;
import X.C0JDJ;
import X.C0THC;
import X.C0THL;
import X.C1143680frq;
import X.C1324720kZq;
import X.C1685300txQ;
import X.C16F5;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20441214yg;
import X.C2188811AlT;
import X.C465220IMe;
import X.C500260Jjc;
import X.C743540TEq;
import X.C744020TGm;
import X.C786410Ut5;
import X.InterfaceC744130TGx;
import Y.ACListenerS147S0100000_12;
import Y.ARunnableS17S1100000_12;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.livesdk.game.broadcast.mirror.GameCastWiredFragment;
import com.bytedance.android.livesdk.game.broadcast.mirror.widget.GameCastWiredWidget;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS130S0110000_12;
import kotlin.jvm.internal.AwS152S0101000_12;
import kotlin.jvm.internal.AwS29S1201000_12;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.text.u;
import org.json.JSONException;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes13.dex */
public final class GameCastWiredFragment extends BaseFragment implements C0JDJ {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9LyQhLGExOiHELIOSotLSwyOzFiJCYhOio+ZwgyJSAPKDwnHyw+LCsVOiQrJCo9PA==";
    public boolean LL;
    public boolean LLILLJJLI;
    public boolean LLILLL;
    public View LLILZ;
    public C1324720kZq LLILZIL;
    public C1324720kZq LLILZLL;
    public C16F5 LLIZ;
    public View LLIZLLLIL;
    public C16F5 LLJ;
    public C16F5 LLJI;
    public ARunnableS17S1100000_12 LLJIJIL;

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, X.InterfaceC513210KAt
    public final /* synthetic */ int getThemeOverlay(Context context) {
        return C465220IMe.LIZ();
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment
    public final /* synthetic */ boolean isLight(Context context) {
        throw null;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        if (!C0THC.LIZ(GameCastWiredWidget.class)) {
            C744020TGm.LJIIJJI(true);
        }
        C744020TGm.LIZIZ = null;
        super.onDestroy();
    }

    public final void NR() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("loadWiredCastFailedIcon  isCasting: ");
        sbLIZ.append(this.LLILLL);
        C20441214yg.LIZIZ("GameCastWiredFragment", C2188811AlT.LIZIZ(sbLIZ));
        C1143680frq.LIZLLL(this.LLILZIL, "tiktok_live_game_demand_1", "ttlive_game_cast_wired_failed.png");
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        View view = getView();
        if (view != null) {
            HandlerHook.viewRemoveCallbacks(view, this.LLJIJIL);
        }
        this.LLJIJIL = null;
        this.LLILLJJLI = false;
        super.onDestroyView();
    }

    public final void OR(boolean z) {
        String str;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("loadWiredCastStateIcon  isCasting: ");
        sbLIZ.append(z);
        C20441214yg.LIZIZ("GameCastWiredFragment", C2188811AlT.LIZIZ(sbLIZ));
        C1324720kZq c1324720kZq = this.LLILZIL;
        if (z) {
            str = "ttlive_game_cast_wired_succeed.png";
        } else {
            str = "ttlive_game_cast_wired_loading.png";
        }
        C1143680frq.LIZLLL(c1324720kZq, "tiktok_live_game_demand_1", str);
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        super.onViewCreated(view, bundle);
        this.LLILZ = view.findViewById(R.id.cp2);
        this.LLILZIL = (C1324720kZq) view.findViewById(R.id.dhf);
        this.LLILZLL = (C1324720kZq) view.findViewById(R.id.dhn);
        this.LLIZ = (C16F5) view.findViewById(R.id.xqm);
        this.LLIZLLLIL = view.findViewById(R.id.fzj);
        this.LLJ = (C16F5) view.findViewById(R.id.xyg);
        C16F5 c16f5 = (C16F5) view.findViewById(R.id.xyh);
        this.LLJI = c16f5;
        if (c16f5 != null) {
            c16f5.setText(getString(2131844669));
        }
        View viewFindViewById = view.findViewById(R.id.dhm);
        if (viewFindViewById != null) {
            C786410Ut5.I7(new ACListenerS147S0100000_12(this, 188), viewFindViewById);
        }
        C1143680frq.LIZLLL(this.LLILZLL, "tiktok_live_game_demand_1", "ttlive_game_cast_wired_end.png");
        C1324720kZq c1324720kZq = this.LLILZLL;
        if (c1324720kZq != null) {
            C786410Ut5.e8(c1324720kZq, new ACListenerS147S0100000_12(this, 191));
        }
        Bundle arguments = getArguments();
        if (arguments != null && arguments.getBoolean("key_wired_cast_is_showing")) {
            z = true;
        } else {
            z = false;
        }
        C500260Jjc.LJJLIIIJJIZ(new AwS130S0110000_12(z, this, 7));
        this.LLILLL = z;
        OR(z);
        if (!this.LLILLL && isAdded() && getContext() != null) {
            this.LLJIJIL = new ARunnableS17S1100000_12(this, getString(2131841754), 3);
            HandlerHook.viewPostDelay(view, this.LLJIJIL, 20000L);
        }
        if (!this.LLILLL) {
            this.LLILLJJLI = true;
            PR(0, this.LLIZ, u.LJJIFFI(getString(2131841755), e3.d, "", false));
        } else {
            C16F5 c16f52 = this.LLIZ;
            if (c16f52 != null) {
                c16f52.setText(getString(2131841741));
            }
        }
        C743540TEq.LJIJ(C0THC.LIZIZ(), false);
        Context context = getContext();
        InterfaceC744130TGx interfaceC744130TGx = new InterfaceC744130TGx() { // from class: X.0THA
            @Override // X.InterfaceC744130TGx
            public final void LIZ() throws JSONException {
                C20441214yg.LIZIZ("GameCastWiredFragment", "onInitSucceed, start --wiredFragmnet");
                GameCastWiredFragment gameCastWiredFragment = this.LIZ;
                if (gameCastWiredFragment.LLILLL) {
                    C20441214yg.LIZIZ("GameCastWiredFragment", "startWiredCast isCasting --wiredFragment");
                } else {
                    C744020TGm.LJI(gameCastWiredFragment);
                }
            }

            @Override // X.InterfaceC744130TGx
            public final void LIZIZ() {
                if (this.LIZ.LLILLL) {
                    return;
                }
                C20441214yg.LIZIZ("GameCastWiredFragment", "onCastSucceed, --wiredFragmnet");
                GameCastWiredFragment gameCastWiredFragment = this.LIZ;
                gameCastWiredFragment.getClass();
                C500260Jjc.LJJLIIIJJIZ(new AwS130S0110000_12(true, gameCastWiredFragment, 7));
                gameCastWiredFragment.LLILLL = true;
                GameCastWiredFragment gameCastWiredFragment2 = this.LIZ;
                gameCastWiredFragment2.LLILLJJLI = false;
                C500260Jjc.LJJLIIIJJIZ(new AwS556S0100000_12(gameCastWiredFragment2, 287));
                C743540TEq.LJJIFFI(false);
            }

            @Override // X.InterfaceC744130TGx
            public final void LIZLLL() {
                if (this.LIZ.LLILLL) {
                    C20441214yg.LIZIZ("GameCastWiredFragment", "onCastEnd, --wiredFragmnet");
                    GameCastWiredFragment gameCastWiredFragment = this.LIZ;
                    gameCastWiredFragment.getClass();
                    C500260Jjc.LJJLIIIJJIZ(new AwS130S0110000_12(false, gameCastWiredFragment, 7));
                    gameCastWiredFragment.LLILLL = false;
                    C500260Jjc.LJJLIIIJJIZ(new AwS556S0100000_12(this.LIZ, 285));
                }
            }

            @Override // X.InterfaceC744130TGx
            public final void LJ() throws JSONException {
                if (this.LIZ.LLILLL) {
                    return;
                }
                C20441214yg.LIZIZ("GameCastWiredFragment", "onConnectSucceed, start --wiredFragmnet");
                GameCastWiredFragment gameCastWiredFragment = this.LIZ;
                if (gameCastWiredFragment.LLILLL) {
                    C20441214yg.LIZIZ("GameCastWiredFragment", "startWiredCast isCasting --wiredFragment");
                } else {
                    C744020TGm.LJI(gameCastWiredFragment);
                }
            }

            @Override // X.InterfaceC744130TGx
            public final void LIZJ(int i) {
                C20441214yg.LIZIZ("GameCastWiredFragment", "onDisConnected, stop --wiredFragmnet");
                if (this.LIZ.LLILLL) {
                    C20441214yg.LIZIZ("GameCastWiredFragment", "wired stop");
                    C744020TGm.LJIIIZ(true);
                }
                C500260Jjc.LJJLIIIJJIZ(new AwS152S0101000_12(this.LIZ, i, 9));
            }

            @Override // X.InterfaceC744130TGx
            public final void LJFF(int i) {
                C20441214yg.LIZIZ("GameCastWiredFragment", "onCastFailed, --wiredFragmnet");
                C500260Jjc.LJJLIIIJJIZ(new AwS152S0101000_12(this.LIZ, i, 8));
            }
        };
        if (context == null) {
            1JLc r0 = C744020TGm.LIZ;
        } else {
            C744020TGm.LJI = true;
            C744020TGm.LIZLLL(context);
            C744020TGm.LIZIZ = interfaceC744130TGx;
            C744020TGm.LIZJ = new C0THL(context);
        }
        View view2 = this.LLILZ;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(4, view2);
        }
    }

    public final void PR(int i, View view, String str) {
        if (view != null && str != null && this.LLILLJJLI && !this.LLILLL) {
            C500260Jjc.LJJLIIIJJIZ(new AwS29S1201000_12(i, this, str, view, 0));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) throws JSONException {
        super.onActivityResult(i, i2, intent);
        C744020TGm.LIZ(i, i2, intent, this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.ggr, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }
}
