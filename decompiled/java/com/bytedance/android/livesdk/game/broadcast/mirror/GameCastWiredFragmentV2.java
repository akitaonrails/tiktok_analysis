package com.bytedance.android.livesdk.game.broadcast.mirror;

import X.1JLc;
import X.C098200Yq;
import X.C0JDJ;
import X.C0THC;
import X.C0THL;
import X.C1143680frq;
import X.C11JF;
import X.C1324720kZq;
import X.C1685300txQ;
import X.C16F5;
import X.C189200o6;
import X.C19514711Wn;
import X.C19EG;
import X.C19GS;
import X.C20441214yg;
import X.C2188811AlT;
import X.C433901mT;
import X.C465220IMe;
import X.C500260Jjc;
import X.C743540TEq;
import X.C744020TGm;
import X.C786240Uso;
import X.C786410Ut5;
import X.C815520Vyw;
import X.InterfaceC420801kM;
import X.InterfaceC744130TGx;
import Y.ACListenerS147S0100000_12;
import Y.ARunnableS17S1100000_12;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.byted.cast.usbsource.usbdisplaysource.UsbSourceServer;
import com.bytedance.android.livesdk.game.broadcast.mirror.GameCastWiredFragmentV2;
import com.bytedance.android.livesdk.game.broadcast.mirror.widget.GameCastWiredWidget;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS130S0110000_12;
import kotlin.jvm.internal.AwS152S0101000_12;
import kotlin.jvm.internal.AwS29S1201000_12;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.text.u;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes13.dex */
public final class GameCastWiredFragmentV2 extends BaseFragment implements C0JDJ {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9LyQhLGExOiHELIOSotLSwyOzFiJCYhOio+ZwgyJSAPKDwnHyw+LCsVOiQrJCo9PBN+";
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

    public final void RR() {
        if (this.LLILLL) {
            C20441214yg.LIZIZ("GameCastWiredFragment", "startWiredCast isCasting --wiredFragment");
            return;
        }
        if (Build.VERSION.SDK_INT < 33 || new C815520Vyw(requireContext()).LIZ()) {
            C744020TGm.LIZJ(this);
            return;
        }
        C19EG activity = getActivity();
        if (activity != null) {
            C19514711Wn.LIZIZ.LIZIZ(activity, TokenCert.Companion.with("bpea-live_cast_service_notification")).LIZIZ("android.permission.POST_NOTIFICATIONS").LIZJ(new C786240Uso(this, 0));
        }
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
            C786410Ut5.I7(new ACListenerS147S0100000_12(this, 189), viewFindViewById);
        }
        C1143680frq.LIZLLL(this.LLILZLL, "tiktok_live_game_demand_1", "ttlive_game_cast_wired_end.png");
        C1324720kZq c1324720kZq = this.LLILZLL;
        if (c1324720kZq != null) {
            C786410Ut5.e8(c1324720kZq, new ACListenerS147S0100000_12(this, 192));
        }
        if (C0THC.LIZ(GameCastWiredWidget.class)) {
            z = true;
        } else {
            z = false;
        }
        C500260Jjc.LJJLIIIJJIZ(new AwS130S0110000_12(z, this, 6));
        this.LLILLL = z;
        OR(z);
        if (!this.LLILLL && isAdded() && getContext() != null) {
            this.LLJIJIL = new ARunnableS17S1100000_12(this, getString(2131841754), 4);
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
        InterfaceC744130TGx interfaceC744130TGx = new InterfaceC744130TGx() { // from class: X.0TH7
            @Override // X.InterfaceC744130TGx
            public final void LIZ() {
                C20441214yg.LIZIZ("GameCastWiredFragment", "onInitSucceed, start --wiredFragmnet");
                UsbSourceServer usbSourceServer = UsbSourceServer.getInstance((Activity) null, (Context) null);
                if (C500260Jjc.LJJJI(usbSourceServer != null ? Boolean.valueOf(usbSourceServer.isConnected()) : null)) {
                    this.LIZ.RR();
                }
            }

            @Override // X.InterfaceC744130TGx
            public final void LIZIZ() {
                if (this.LIZ.LLILLL) {
                    return;
                }
                C20441214yg.LIZIZ("GameCastWiredFragment", "onCastSucceed, --wiredFragmnet");
                GameCastWiredFragmentV2 gameCastWiredFragmentV2 = this.LIZ;
                gameCastWiredFragmentV2.getClass();
                C500260Jjc.LJJLIIIJJIZ(new AwS130S0110000_12(true, gameCastWiredFragmentV2, 6));
                gameCastWiredFragmentV2.LLILLL = true;
                GameCastWiredFragmentV2 gameCastWiredFragmentV22 = this.LIZ;
                gameCastWiredFragmentV22.LLILLJJLI = false;
                C500260Jjc.LJJLIIIJJIZ(new AwS556S0100000_12(gameCastWiredFragmentV22, 282));
                C743540TEq.LJJIFFI(false);
            }

            @Override // X.InterfaceC744130TGx
            public final void LIZLLL() {
                if (this.LIZ.LLILLL) {
                    C20441214yg.LIZIZ("GameCastWiredFragment", "onCastEnd, --wiredFragmnet");
                    GameCastWiredFragmentV2 gameCastWiredFragmentV2 = this.LIZ;
                    gameCastWiredFragmentV2.getClass();
                    C500260Jjc.LJJLIIIJJIZ(new AwS130S0110000_12(false, gameCastWiredFragmentV2, 6));
                    gameCastWiredFragmentV2.LLILLL = false;
                    C500260Jjc.LJJLIIIJJIZ(new AwS556S0100000_12(this.LIZ, 281));
                }
            }

            @Override // X.InterfaceC744130TGx
            public final void LJ() {
                if (this.LIZ.LLILLL) {
                    return;
                }
                C20441214yg.LIZIZ("GameCastWiredFragment", "onConnectSucceed, start --wiredFragmnet");
                this.LIZ.RR();
            }

            @Override // X.InterfaceC744130TGx
            public final void LIZJ(int i) {
                C20441214yg.LIZIZ("GameCastWiredFragment", "onDisConnected, stop --wiredFragmnet");
                if (this.LIZ.LLILLL) {
                    C20441214yg.LIZIZ("GameCastWiredFragment", "wired stop");
                    C744020TGm.LJIIIZ(true);
                }
                C500260Jjc.LJJLIIIJJIZ(new AwS152S0101000_12(this.LIZ, i, 7));
            }

            @Override // X.InterfaceC744130TGx
            public final void LJFF(int i) {
                C20441214yg.LIZIZ("GameCastWiredFragment", "onCastFailed, --wiredFragmnet");
                C500260Jjc.LJJLIIIJJIZ(new AwS152S0101000_12(this.LIZ, i, 6));
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
            C500260Jjc.LJJLIIIJJIZ(new AwS29S1201000_12(i, this, str, view, 1));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (!isAdded()) {
            return;
        }
        if (i != 20001) {
            1JLc r0 = C744020TGm.LIZ;
            return;
        }
        C744020TGm.LJ.set(false);
        if (i2 == -1 && intent != null) {
            C743540TEq.LJJIIZI(i2, 1, i, intent.toString(), false);
            C11JF c11jf = C744020TGm.LJIIL;
            if (c11jf != null) {
                c11jf.dispose();
            }
            C744020TGm.LJIIL = C433901mT.LIZ(this, new AwS556S0100000_12((Fragment) this, 278));
            AwS152S0101000_12 awS152S0101000_12 = new AwS152S0101000_12(this, intent, i2, 5);
            InterfaceC420801kM interfaceC420801kM = C744020TGm.LJIIJJI;
            if (interfaceC420801kM != null) {
                interfaceC420801kM.dispose();
            }
            C744020TGm.LJIIJJI = C433901mT.LIZIZ(this, awS152S0101000_12);
            return;
        }
        InterfaceC744130TGx interfaceC744130TGx = C744020TGm.LIZIZ;
        if (interfaceC744130TGx != null) {
            interfaceC744130TGx.LJFF(14004001);
        }
        C0THC.LIZLLL(GameCastWiredWidget.class, false);
        C743540TEq.LJJIIZI(i2, -1, i, String.valueOf(intent), false);
        C743540TEq.LJJIIJ(false, 10090, 0, "");
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
