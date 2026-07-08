package com.bytedance.android.livesdk.game.broadcast.mirror;

import X.C01GW;
import X.C098200Yq;
import X.C0IJT;
import X.C0JDJ;
import X.C0TH1;
import X.C0TH2;
import X.C0THC;
import X.C1143680frq;
import X.C1161920gLG;
import X.C1308910kAL;
import X.C1324720kZq;
import X.C1685300txQ;
import X.C16F5;
import X.C189200o6;
import X.C19514711Wn;
import X.C19EG;
import X.C19GS;
import X.C1AKO;
import X.C20441214yg;
import X.C2188811AlT;
import X.C292401Bi;
import X.C465220IMe;
import X.C474500IjA;
import X.C475510Ikn;
import X.C500260Jjc;
import X.C504210Jpz;
import X.C520010KaN;
import X.C743540TEq;
import X.C744140TGy;
import X.C766270U4b;
import X.C786410Ut5;
import X.C804420Vh2;
import X.C815520Vyw;
import X.InterfaceC19515111Wr;
import Y.ACListenerS147S0100000_12;
import Y.ARunnableS112S0100000_12;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.byted.cast.common.source.ServiceInfo;
import com.bytedance.android.livesdk.comp.api.game.service.IGameService;
import com.bytedance.android.livesdk.dataChannel.LiveCastChannel;
import com.bytedance.android.livesdk.game.broadcast.mirror.GameCast;
import com.bytedance.android.livesdk.game.broadcast.mirror.GameCastFragment;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.text.a0;
import org.json.JSONException;

/* JADX INFO: loaded from: classes13.dex */
public final class GameCastFragment extends BaseFragment implements View.OnClickListener, C1AKO, C0JDJ {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9LyQhLGHELIOSExOiotLSwyOzFiJCYhOio+ZwgyJSAPKDwnDjctLiI2JjE=";
    public long LLILLL;
    public C1324720kZq LLILZ;
    public C16F5 LLILZIL;
    public C16F5 LLILZLL;
    public C1324720kZq LLIZ;
    public View LLIZLLLIL;
    public C16F5 LLJ;
    public C16F5 LLJI;
    public boolean LLJILJIL;
    public boolean LL = true;
    public C0TH2 LLILLJJLI = C0TH2.STOPPED;
    public final C01GW LLJIJIL = C292401Bi.LIZ(new AwS556S0100000_12(this, 273));

    @Override // X.C1AKO
    public final void finish() {
    }

    @Override // X.C1AKO
    public final Fragment getFragment() {
        return this;
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, X.InterfaceC513210KAt
    public final /* synthetic */ int getThemeOverlay(Context context) {
        return C465220IMe.LIZ();
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment
    public final /* synthetic */ boolean isLight(Context context) {
        throw null;
    }

    public final boolean NR() throws JSONException {
        List<ServiceInfo> list;
        ServiceInfo next;
        C20441214yg.LIZIZ("GameLive_ByteCast", "connectAndCast");
        C744140TGy c744140TGy = (C744140TGy) DataChannelGlobal.LLILZ.gg0(MirrorCastDevicesChannel.class);
        if (c744140TGy != null && (list = c744140TGy.LIZ) != null) {
            Iterator<ServiceInfo> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (a0.LJJIIZI(next.name, "TTLiveStudioAndroid", false)) {
                    break;
                }
            }
            final ServiceInfo serviceInfo = next;
            if (serviceInfo != null) {
                if (Build.VERSION.SDK_INT >= 33 && !new C815520Vyw(requireContext()).LIZ()) {
                    this.LLJILJIL = false;
                    C19EG activity = getActivity();
                    if (activity != null) {
                        C19514711Wn.LIZIZ.LIZIZ(activity, TokenCert.Companion.with("bpea-live_cast_service_notification")).LIZIZ("android.permission.POST_NOTIFICATIONS").LIZJ(new InterfaceC19515111Wr() { // from class: X.0TH9
                            @Override // X.InterfaceC19515111Wr
                            public final void onCanceled() {
                                C20441214yg.LIZIZ("GameCastFragment", "notification permissions onCanceled");
                                DataChannelGlobal.LLILZ.HQ2(LiveCastChannel.class, C0TH2.NOTIFICATION_PERMISSIONS_ERROR);
                            }

                            @Override // X.InterfaceC19515111Wr
                            public final void LIZ(C0HWO... c0hwoArr) throws JSONException {
                                DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
                                Object objGg0 = dataChannelGlobal.gg0(LiveCastChannel.class);
                                EnumC442280HVy enumC442280HVy = ((C0HWO) C13LQ.LJIL(c0hwoArr)).LIZIZ;
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("notification permissions resultType");
                                sbLIZ.append(enumC442280HVy);
                                C20441214yg.LIZIZ("GameCastFragment", C2188811AlT.LIZIZ(sbLIZ));
                                if (enumC442280HVy == EnumC442280HVy.GRANTED) {
                                    C20441214yg.LIZIZ("GameCastFragment", "notification permissions is granted");
                                    GameCast gameCast = GameCast.LIZ;
                                    GameCast.LJIILIIL(serviceInfo, this);
                                    return;
                                }
                                C0TH2 c0th2 = C0TH2.NOTIFICATION_PERMISSIONS_ERROR;
                                if (objGg0 == c0th2) {
                                    GameCastFragment gameCastFragment = this;
                                    gameCastFragment.LLJILJIL = true;
                                    C0W78.LJII(gameCastFragment.getActivity());
                                    return;
                                }
                                dataChannelGlobal.HQ2(LiveCastChannel.class, c0th2);
                            }
                        });
                    }
                    return false;
                }
                GameCast gameCast = GameCast.LIZ;
                GameCast.LJIILIIL(serviceInfo, this);
                DataChannel dataChannelLJ = C475510Ikn.LJ(this);
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_screencasting_livestudio_btn_click");
                c474500IjALIZ.LJIJJLI(dataChannelLJ);
                c474500IjALIZ.LJJII(Long.valueOf(C743540TEq.LIZIZ()), "anchor_id");
                c474500IjALIZ.LJJII(LiveMode.LIVE_STUDIO.logStreamingType, "live_type");
                c474500IjALIZ.LIZ();
                return true;
            }
        }
        return false;
    }

    public final void PR() {
        View view;
        if (this.LL && (view = (View) this.LLJIJIL.getValue()) != null) {
            C786410Ut5.Ab(view, view.getRotation() + 3.0f);
            view.postOnAnimation(new ARunnableS112S0100000_12(this, 130));
        }
    }

    @Override // X.C1AKO
    public final boolean onBackPressed() {
        if (!C504210Jpz.LIZ) {
            return false;
        }
        FragmentManager fragmentManagerLJJI = C520010KaN.LJJI(this, false);
        if (fragmentManagerLJJI == null) {
            return true;
        }
        fragmentManagerLJJI.LJLLILLLL();
        return true;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() throws JSONException {
        super.onDestroy();
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        dataChannelGlobal.zQ2(this);
        GameCast gameCast = GameCast.LIZ;
        if (GameCast.LJI) {
            return;
        }
        GameCast.LJIILLIIL();
        dataChannelGlobal.HQ2(LiveCastChannel.class, C0TH2.INIT);
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() throws JSONException {
        super.onPause();
        this.LL = false;
        GameCast gameCast = GameCast.LIZ;
        GameCast.LJIILLIIL();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() throws JSONException {
        super.onResume();
        Object objGg0 = DataChannelGlobal.LLILZ.gg0(LiveCastChannel.class);
        if (objGg0 == null || C0TH2.INIT == objGg0 || C0TH2.BROWSING == objGg0) {
            C0TH2 c0th2 = C0TH2.BROWSING;
            GameCast.LIZ.LIZ();
            RR(c0th2);
        }
        if (this.LLJILJIL && Build.VERSION.SDK_INT >= 33 && new C815520Vyw(requireContext()).LIZ()) {
            C0TH2 c0th22 = C0TH2.BROWSING;
            GameCast.LIZ.LIZ();
            RR(c0th22);
            this.LLJILJIL = false;
        }
    }

    public final void OR(int i) {
        String str;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    str = "";
                } else {
                    str = "ttlive_game_cast_wireless_failed.png";
                }
            } else {
                str = "ttlive_game_cast_wireless_succeed.png";
            }
        } else {
            str = "ttlive_game_cast_wireless_loading.png";
        }
        if (str.length() == 0) {
            return;
        }
        C1143680frq.LIZLLL(this.LLILZ, "tiktok_live_game_demand_1", str);
    }

    public final void RR(C0TH2 c0th2) {
        int iIntValue;
        Integer numLIZJ;
        int iIntValue2;
        Integer numLIZJ2;
        String string;
        String strLIZIZ;
        int iIntValue3;
        Integer numLIZJ3;
        this.LLILLJJLI = c0th2;
        int[] iArr = C0TH1.LIZ;
        int i = iArr[c0th2.ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3) {
                if (i != 4) {
                    C16F5 c16f5 = this.LLILZIL;
                    if (c16f5 != null) {
                        c16f5.setText(getString(2131841797));
                    }
                    C16F5 c16f52 = this.LLILZLL;
                    if (c16f52 != null) {
                        c16f52.setSelected(false);
                        c16f52.setText("");
                    }
                    this.LL = true;
                    C500260Jjc.LLFFF((View) this.LLJIJIL.getValue());
                    PR();
                    GameCast.LIZ.LIZ();
                    OR(0);
                    C1324720kZq c1324720kZq = this.LLIZ;
                    if (c1324720kZq != null) {
                        C500260Jjc.LJIILIIL(c1324720kZq);
                    }
                    View view = this.LLIZLLLIL;
                    if (view != null) {
                        C500260Jjc.LJIILLIIL(view);
                    }
                    C16F5 c16f53 = this.LLJ;
                    if (c16f53 != null) {
                        C500260Jjc.LJIILLIIL(c16f53);
                    }
                    C16F5 c16f54 = this.LLJI;
                    if (c16f54 != null) {
                        C500260Jjc.LJIILLIIL(c16f54);
                        return;
                    }
                    return;
                }
                C16F5 c16f55 = this.LLILZIL;
                if (c16f55 != null) {
                    c16f55.setText(getString(2131841786));
                }
                C16F5 c16f56 = this.LLILZLL;
                if (c16f56 != null) {
                    c16f56.setSelected(false);
                    c16f56.setText(getString(2131840909));
                    Context context = c16f56.getContext();
                    if (context != null && (numLIZJ3 = C1308910kAL.LIZJ(R.attr.fy4, context)) != null) {
                        iIntValue3 = numLIZJ3.intValue();
                    } else {
                        iIntValue3 = 0;
                    }
                    c16f56.setTextColor(iIntValue3);
                }
                C1324720kZq c1324720kZq2 = this.LLIZ;
                if (c1324720kZq2 != null) {
                    C500260Jjc.LLFFF(c1324720kZq2);
                }
                View view2 = this.LLIZLLLIL;
                if (view2 != null) {
                    C500260Jjc.LLFFF(view2);
                }
                C16F5 c16f57 = this.LLJ;
                if (c16f57 != null) {
                    C500260Jjc.LLFFF(c16f57);
                }
                C16F5 c16f58 = this.LLJI;
                if (c16f58 != null) {
                    C500260Jjc.LLFFF(c16f58);
                }
                this.LL = false;
                C500260Jjc.LJIILIIL((View) this.LLJIJIL.getValue());
                OR(1);
                return;
            }
            C16F5 c16f59 = this.LLILZIL;
            if (c16f59 != null) {
                if (iArr[c0th2.ordinal()] == 2) {
                    strLIZIZ = getString(2131844016);
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(getString(2131842809));
                    sbLIZ.append(", ");
                    sbLIZ.append(getString(2131842810));
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                }
                c16f59.setText(strLIZIZ);
            }
            C16F5 c16f510 = this.LLILZLL;
            if (c16f510 != null) {
                c16f510.setSelected(true);
                C16F5 c16f511 = this.LLILZLL;
                if (c16f511 != null) {
                    if (iArr[c0th2.ordinal()] == 2) {
                        string = getString(2131844015);
                    } else {
                        string = getString(2131843634);
                    }
                    c16f511.setText(string);
                }
                Context context2 = c16f510.getContext();
                if (context2 != null && (numLIZJ2 = C1308910kAL.LIZJ(R.attr.fxc, context2)) != null) {
                    iIntValue2 = numLIZJ2.intValue();
                } else {
                    iIntValue2 = 0;
                }
                c16f510.setTextColor(iIntValue2);
            }
            this.LL = false;
            C500260Jjc.LJIILIIL((View) this.LLJIJIL.getValue());
            OR(2);
            C1324720kZq c1324720kZq3 = this.LLIZ;
            if (c1324720kZq3 != null) {
                C500260Jjc.LJIILIIL(c1324720kZq3);
            }
            View view3 = this.LLIZLLLIL;
            if (view3 != null) {
                C500260Jjc.LJIILLIIL(view3);
            }
            C16F5 c16f512 = this.LLJ;
            if (c16f512 != null) {
                C500260Jjc.LJIILLIIL(c16f512);
            }
            C16F5 c16f513 = this.LLJI;
            if (c16f513 == null) {
                return;
            }
            C500260Jjc.LJIILLIIL(c16f513);
            return;
        }
        C16F5 c16f514 = this.LLILZIL;
        if (c16f514 != null) {
            c16f514.setText(getString(2131841785));
        }
        C16F5 c16f515 = this.LLILZLL;
        if (c16f515 != null) {
            c16f515.setSelected(true);
            c16f515.setText(getString(2131840909));
            Context context3 = c16f515.getContext();
            if (context3 != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.fxc, context3)) != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = 0;
            }
            c16f515.setTextColor(iIntValue);
        }
        this.LL = false;
        C500260Jjc.LJIILIIL((View) this.LLJIJIL.getValue());
        OR(0);
        C1324720kZq c1324720kZq4 = this.LLIZ;
        if (c1324720kZq4 != null) {
            C500260Jjc.LJIILIIL(c1324720kZq4);
        }
        View view4 = this.LLIZLLLIL;
        if (view4 != null) {
            C500260Jjc.LJIILLIIL(view4);
        }
        C16F5 c16f516 = this.LLJ;
        if (c16f516 != null) {
            C500260Jjc.LJIILLIIL(c16f516);
        }
        C16F5 c16f517 = this.LLJI;
        if (c16f517 == null) {
            return;
        }
        C500260Jjc.LJIILLIIL(c16f517);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws JSONException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.LLILLL < 1000) {
            return;
        }
        this.LLILLL = jCurrentTimeMillis;
        if (!C804420Vh2.LJI(getContext())) {
            C766270U4b.LIZLLL(2131841844);
            return;
        }
        int i = C0TH1.LIZ[this.LLILLJJLI.ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3) {
                if (i != 4) {
                    if (i == 5) {
                        GameCast.LIZ.LIZ();
                    }
                } else {
                    return;
                }
            } else {
                GameCast gameCast = GameCast.LIZ;
                GameCast.LJ();
                RR(C0TH2.BROWSING);
            }
        } else if (view != null && view.isSelected() && NR()) {
            return;
        }
        C20441214yg.LIZIZ("GameLive_ByteCast", "there is no available devices or it is already casting...");
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) throws JSONException {
        Object c098200Yq;
        super.onViewCreated(view, bundle);
        View viewFindViewById = view.findViewById(R.id.dhm);
        if (viewFindViewById != null) {
            C786410Ut5.I7(new ACListenerS147S0100000_12(this, 187), viewFindViewById);
        }
        C743540TEq.LJIJ(C0THC.LIZIZ(), true);
        GameCast gameCast = GameCast.LIZ;
        GameCast.LJ();
        this.LLILZ = (C1324720kZq) view.findViewById(R.id.dhf);
        this.LLILZIL = (C16F5) view.findViewById(R.id.xqm);
        C16F5 c16f5 = (C16F5) view.findViewById(R.id.cp2);
        this.LLILZLL = c16f5;
        if (c16f5 != null) {
            C786410Ut5.l8(c16f5, this);
        }
        this.LLIZ = (C1324720kZq) view.findViewById(R.id.dhn);
        this.LLIZLLLIL = view.findViewById(R.id.fzj);
        this.LLJ = (C16F5) view.findViewById(R.id.xyg);
        C16F5 c16f52 = (C16F5) view.findViewById(R.id.xyh);
        this.LLJI = c16f52;
        if (c16f52 != null) {
            c16f52.setText(getString(2131844670));
        }
        C1324720kZq c1324720kZq = this.LLIZ;
        if (c1324720kZq != null) {
            C786410Ut5.e8(c1324720kZq, new ACListenerS147S0100000_12(this, 194));
        }
        C1143680frq.LIZLLL(this.LLIZ, "tiktok_live_game_demand_1", "ttlive_game_cast_wired_end.png");
        C786410Ut5.I7(new View.OnClickListener() { // from class: X.0TH3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
            }
        }, view);
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        dataChannelGlobal.CQ2(MirrorCastDevicesChannel.class, this, new AwS591S0100000_12(this, 534));
        dataChannelGlobal.CQ2(LiveCastChannel.class, this, new AwS591S0100000_12(this, 536));
        try {
            c098200Yq = Boolean.valueOf(GameCast.LJI);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C20441214yg.LJI("GameLive_ByteCast", thM5exceptionOrNullimpl);
            C766270U4b.LIZLLL(2131843792);
            C520010KaN.LIZLLL(this);
        }
        if (C189200o6.m8isSuccessimpl(c098200Yq)) {
            if (((Boolean) c098200Yq).booleanValue()) {
                RR(C0TH2.CASTING);
            } else {
                GameCast.LIZ.LIZ();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) throws JSONException {
        super.onActivityResult(i, i2, intent);
        ((IGameService) C1161920gLG.LIZJ(IGameService.class)).WK();
        GameCast.LIZ.LJII(i, i2, intent, this);
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
