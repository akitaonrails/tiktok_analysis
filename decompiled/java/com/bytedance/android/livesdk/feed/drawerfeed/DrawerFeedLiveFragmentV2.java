package com.bytedance.android.livesdk.feed.drawerfeed;

import X.C036E;
import X.C098200Yq;
import X.C0DUN;
import X.C0IJT;
import X.C0IR5;
import X.C0IUA;
import X.C0IXQ;
import X.C0J1N;
import X.C0J1R;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1148310fzJ;
import X.C1161920gLG;
import X.C11RD;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C1C7U;
import X.C1EOY;
import X.C20533215Wg;
import X.C2093608Ic;
import X.C2188811AlT;
import X.C2200821BBo;
import X.C467800IWc;
import X.C469280Iak;
import X.C470650Icx;
import X.C471000IdW;
import X.C471340Ie4;
import X.C471440IeE;
import X.C471500IeK;
import X.C471540IeO;
import X.C474500IjA;
import X.C481090Itn;
import X.C486980J7w;
import X.C497740JfY;
import X.C772770UTb;
import X.C784440Upu;
import X.C786410Ut5;
import X.C930940aKi;
import X.EnumC486990J7x;
import X.InterfaceC469760IbW;
import X.InterfaceC470900IdM;
import X.InterfaceC472150IfN;
import Y.ACListenerS142S0100000_7;
import Y.ALAdapterS4S0100000_7;
import Y.AfS176S0100000_7;
import Y.AsS34S0100000_7;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.live.network.response.BaseListResponse;
import com.bytedance.android.livesdk.feed.drawerfeed.DrawerFeedLiveFragmentV2;
import com.bytedance.android.livesdk.feed.viewmodel.TabFeedViewModel;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePreviewBackOptSetting;
import com.bytedance.android.livesdk.livesetting.feed.FeedPreloadSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveFeedPreloadSetting;
import com.bytedance.android.livesdk.model.ItemTab;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.bytedance.android.livesdkapi.user.ApplyLivePermission;
import com.bytedance.android.livesdkapi.user.DetailLivePermission;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public class DrawerFeedLiveFragmentV2 extends BaseFragment implements InterfaceC470900IdM {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9LiApLWE3HELIOSOiQ7LD01LSAoZwshKTIpOwk2LSEAIDk2DjctLiI2JjEaew==";
    public C481090Itn LL;
    public RecyclerView LLILLJJLI;
    public View LLILLL;
    public C470650Icx LLILZ;
    public GridLayoutManager LLILZIL;
    public C471440IeE LLILZLL;
    public TabFeedViewModel LLIZ;
    public InterfaceC469760IbW LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public long LLJILJIL;
    public boolean LLJILLL;
    public boolean LLJJ;
    public boolean LLJJI;
    public long LLJJIII;
    public String LLIZLLLIL = "";
    public String LLJILJILJ = "";
    public final Handler LLJJIJI = new BPEAHandler(Looper.getMainLooper()) { // from class: com.bytedance.android.livesdk.feed.drawerfeed.DrawerFeedLiveFragmentV2.1
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            C1C7U.LIZ("DrawerFeedLiveFragmentV2@cfb6.<field>$1");
            int i = message.what;
            if (i == 1) {
                DrawerFeedLiveFragmentV2 drawerFeedLiveFragmentV2 = DrawerFeedLiveFragmentV2.this;
                drawerFeedLiveFragmentV2.RR("show");
                View view = drawerFeedLiveFragmentV2.LLILLL;
                if (view != null) {
                    view.animate().setDuration(300L).alpha(1).setListener(new AnimatorListenerAdapter() { // from class: X.0IeS
                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public final void onAnimationEnd(Animator animator) {
                            super.onAnimationEnd(animator);
                        }

                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public final void onAnimationStart(Animator animator) {
                            super.onAnimationStart(animator);
                        }
                    }).start();
                }
            } else if (i == 54 && HandlerHook.getMessageObj(message.obj) != null && (HandlerHook.getMessageObj(message.obj) instanceof BaseListResponse)) {
                C471340Ie4.LJIIJ(DrawerFeedLiveFragmentV2.this.LLJILJILJ, (BaseListResponse) HandlerHook.getMessageObj(message.obj));
            }
            C1C7U.LIZIZ("DrawerFeedLiveFragmentV2@cfb6.<field>$1");
        }
    };

    @Override // X.InterfaceC470900IdM
    public final void qD() {
    }

    public final void PR() {
        String str;
        C470650Icx c470650Icx = this.LLILZ;
        if (c470650Icx == null || !(c470650Icx.LLLIILIL() == 0 || (LLLIILIL() == 1 && LJJLIIIJJI(0).type == 1005))) {
            str = "normal";
        } else {
            getContext();
            try {
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            str = C036E.LIZ.LIZIZ() ? "abnormal_error" : "network_error";
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_explore_page_show");
        c474500IjALIZ.LJJII(str, "show_type");
        C467800IWc c467800IWc = C467800IWc.LJIJ;
        c474500IjALIZ.LJJII(c467800IWc.LJFF, "show_method");
        c474500IjALIZ.LJJII(this.LLJILJILJ, "tab_type");
        c474500IjALIZ.LJJII(c467800IWc.LJIIL, "landing_reason");
        c474500IjALIZ.LJJII(C0IUA.LJJI, "from_drawer_tab");
        c474500IjALIZ.LJJII(Integer.valueOf(c467800IWc.LJI() ? 1 : 0), C467800IWc.LJIJJLI);
        c474500IjALIZ.LJJII(C0IXQ.LIZIZ(), C467800IWc.LJIL);
        c474500IjALIZ.LJJII(c467800IWc.LIZIZ(), "entrance_type");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJIIJ();
        c474500IjALIZ.LIZ();
        C471340Ie4.LJII(this.LLJILJILJ);
        RecyclerView recyclerView = this.LLILLJJLI;
        if (recyclerView != null) {
            recyclerView.addOnScrollListener(new C772770UTb(C1EOY.LIZ.LIZIZ("drawer_slide"), null));
        }
    }

    public final void SR() {
        String strLIZIZ;
        String strLIZIZ2;
        RR("click");
        if (LivePreviewBackOptSetting.INSTANCE.getValue()) {
            C0IR5 c0ir5 = (C0IR5) DataChannelGlobal.LLILZ.gg0(C1148310fzJ.class);
            if (c0ir5 == null || c0ir5.LJFF == null) {
                strLIZIZ2 = "{request_from:explore}";
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("{request_from:explore, inner_room_id:");
                sbLIZ.append(c0ir5.LIZJ);
                sbLIZ.append(", inner_enter_from_merge:");
                sbLIZ.append(c0ir5.LJFF.LIZIZ);
                sbLIZ.append(", inner_enter_method:");
                sbLIZ.append(c0ir5.LJFF.LIZ);
                sbLIZ.append("}");
                strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("sslocal://openRecord?enter_from=direct_shoot&tab=live&source_params=");
            sbLIZ2.append(strLIZIZ2);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        } else {
            strLIZIZ = "sslocal://openRecord?enter_from=direct_shoot&tab=live&source_params={request_from:explore}";
        }
        if (getContext() != null) {
            ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).handleSchema(getContext(), strLIZIZ, new Bundle());
        }
    }

    public final void UR() {
        if ("foru".equals(this.LLJILJILJ)) {
            C471340Ie4.LJIIIZ(this.LLJILJILJ, (BPEAHandler) this.LLJJIJI);
        }
    }

    @Override // X.InterfaceC470900IdM
    public final int uL() {
        int i = (LiveFeedPreloadSetting.INSTANCE.getValue().feedPreloadStyleTwo - 1) * 2;
        if (i > 1) {
            return i;
        }
        int value = FeedPreloadSetting.INSTANCE.getValue();
        if (value <= 1) {
            return 4;
        }
        return value;
    }

    @Override // X.InterfaceC470900IdM
    public final String url() {
        return !C2093608Ic.LJ(this.LLIZLLLIL) ? this.LLIZLLLIL : "";
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        C0DUN c0dun;
        super.onDestroy();
        C471340Ie4.LJ = null;
        C471340Ie4.LJJI = false;
        C471340Ie4.LJIL = 0;
        C471500IeK c471500IeK = C471340Ie4.LIZIZ;
        if (c471500IeK != null && (c0dun = C471340Ie4.LIZ) != null) {
            c0dun.removeOnScrollListener(c471500IeK);
        }
        C471340Ie4.LIZIZ = null;
        C471340Ie4.LIZ = null;
        ViewGroup viewGroup = C471340Ie4.LIZJ;
        if (viewGroup != null) {
            HandlerHook.viewRemoveCallbacks(viewGroup, null);
        }
        C471340Ie4.LIZJ = null;
        C471340Ie4.LJIJI = false;
        C471340Ie4.LJIJJ = false;
        C471340Ie4.LJIJ = null;
        C471340Ie4.LJJIFFI = 0L;
        C471340Ie4.LJJIIZI = false;
        C471340Ie4.LJJII = 0;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        NR("onPause");
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        NR("onResume");
        this.LLJJI = false;
    }

    public final void NR(String str) {
        boolean z;
        if (this.LLJJI) {
            return;
        }
        if (getUserVisibleHint() && isResumed()) {
            z = true;
        } else {
            z = false;
        }
        if (this.LLJJ == z) {
            return;
        }
        this.LLJJ = z;
        if (z) {
            if (this.LLJI) {
                RR("show");
            }
            TabFeedViewModel tabFeedViewModel = this.LLIZ;
            if (tabFeedViewModel != null) {
                tabFeedViewModel.AQ2(true);
            }
            C470650Icx c470650Icx = this.LLILZ;
            if (c470650Icx != null) {
                c470650Icx.LLLLIILLL(str, true);
                C470650Icx c470650Icx2 = this.LLILZ;
                c470650Icx2.LLJJIJIIJIL.onNext(C0J1R.LIZJ);
                c470650Icx2.LLJJJJJIL = false;
            }
            if (this.LLJILLL) {
                PR();
            }
            UR();
            return;
        }
        TabFeedViewModel tabFeedViewModel2 = this.LLIZ;
        if (tabFeedViewModel2 != null) {
            tabFeedViewModel2.AQ2(false);
            GridLayoutManager gridLayoutManager = this.LLILZIL;
            if (gridLayoutManager != null) {
                this.LLIZ.LLJJJIL = gridLayoutManager.findFirstCompletelyVisibleItemPosition();
                View viewFindViewByPosition = this.LLILZIL.findViewByPosition(this.LLIZ.LLJJJIL);
                if (viewFindViewByPosition != null) {
                    this.LLIZ.LLJJJJ = viewFindViewByPosition.getTop();
                }
            }
        }
        C470650Icx c470650Icx3 = this.LLILZ;
        if (c470650Icx3 != null) {
            c470650Icx3.LLLLIILLL(str, false);
            this.LLILZ.LLJJIJIL.onNext(C0J1R.LIZJ);
        }
        C471340Ie4.LJI(this.LLJILJILJ);
    }

    public final void RR(String str) {
        String idStr;
        HashMap map = new HashMap();
        map.put("action_type", str);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_explore_live_take_button");
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LIZ();
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null && room.getIdStr() != null) {
            idStr = room.getIdStr();
        } else {
            idStr = "";
        }
        if (!str.equals("show")) {
            if (str.equals("click")) {
                C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_live_entrance_click");
                c474500IjALIZ2.LJIL();
                c474500IjALIZ2.LJJII("explore", "enter_from");
                c474500IjALIZ2.LJJII("explore", "live_entrance_name");
                c474500IjALIZ2.LJJII(idStr, "entrance_room_id");
                c474500IjALIZ2.LIZ();
                return;
            }
            return;
        }
        C474500IjA c474500IjALIZ3 = C0IJT.LIZ("livesdk_live_entrance_show");
        c474500IjALIZ3.LJIL();
        c474500IjALIZ3.LJJII("explore", "enter_from");
        c474500IjALIZ3.LJJII("explore", "live_entrance_name");
        c474500IjALIZ3.LJJII(idStr, "entrance_room_id");
        c474500IjALIZ3.LIZ();
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C470650Icx c470650Icx = this.LLILZ;
        c470650Icx.notifyItemRangeChanged(0, c470650Icx.getItemCount());
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        C486980J7w.LJFF(EnumC486990J7x.LiveFeedInit);
        super.onCreate(bundle);
        List<ItemTab> listLIZJ = C471000IdW.LJ().LIZJ();
        if (listLIZJ != null && ((ArrayList) listLIZJ).size() > 0) {
            this.LLIZLLLIL = ((ItemTab) ListProtector.get(listLIZJ, 0)).getUrl();
        }
        ((C0J1N) C784440Upu.LIZ().LJ(C469280Iak.class).LJIILIIL(C0J1R.LIZIZ(this)).LIZJ(C11RD.LIZLLL(this))).LIZJ(new AfS176S0100000_7(this, 256));
        BtmSDK.INSTANCE.registerBtmPageOnCreate(this, "a2270.b277129", (String) null);
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) throws Throwable {
        Object obj;
        boolean z2 = true;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10502, "com/bytedance/android/livesdk/feed/drawerfeed/DrawerFeedLiveFragmentV2", "setUserVisibleHint", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl7S+2DnkbzffxjyqvOq01IbBlXWQ+MizsgiEGL+o9xk5DvuG0HXPf8w==", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        if (!z || !this.LLJ.isOpen()) {
            z2 = false;
        }
        super.setUserVisibleHint(z2);
        NR("userVisibleHint");
        C2200821BBo.LIZ.getClass();
        if (!C2200821BBo.LIZ() && C2200821BBo.LJI && z) {
            C20533215Wg.LIZ(getClass());
        }
    }

    public final void OR(int i, View view) {
        View view2;
        boolean z;
        if (this.LLJI && !this.LLJIJIL && (view2 = this.LLILLL) != null) {
            if (view2.getVisibility() == 0) {
                z = true;
            } else {
                z = false;
            }
            float fLIZIZ = (int) C497740JfY.LIZIZ(100.0f);
            if (i != 0) {
                if (i != 1 || z) {
                    return;
                }
                this.LLJIJIL = true;
                C786410Ut5.LJLLLLLL(0, view);
                RR("show");
                C786410Ut5.ed(view, fLIZIZ);
                view.animate().setDuration(300L).translationY(0.0f).setListener(new ALAdapterS4S0100000_7(this, 4)).alpha(1.0f).start();
                return;
            }
            if (!z) {
                return;
            }
            this.LLJIJIL = true;
            view.animate().setDuration(300L).translationY(fLIZIZ).setListener(new ALAdapterS4S0100000_7(this, 3)).alpha(0.0f).start();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02af  */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.0Icx] */
    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r9, android.os.Bundle r10) {
        /*
            Method dump skipped, instruction units count: 713
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.feed.drawerfeed.DrawerFeedLiveFragmentV2.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19GS c19gs;
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.ghv, viewGroup, false);
        this.LLILLJJLI = (RecyclerView) viewTd.findViewById(R.id.ms4);
        this.LL = (C481090Itn) viewTd.findViewById(R.id.wsc);
        this.LLILLJJLI.addOnScrollListener(new C471540IeO());
        this.LLILLJJLI.addOnScrollListener(new AsS34S0100000_7(this, 1));
        if (TextUtils.equals(this.LLJILJILJ, "foru")) {
            this.LLILLL = viewTd.findViewById(R.id.yqb);
            ((IHostUser) C1161920gLG.LIZJ(IHostUser.class)).requestLivePermission(new InterfaceC472150IfN() { // from class: X.0Ie9
                @Override // X.InterfaceC472150IfN
                public final void onFailed(Throwable th) {
                }

                @Override // X.InterfaceC472150IfN
                public final void LIZ(Boolean bool, DetailLivePermission detailLivePermission, ApplyLivePermission applyLivePermission, Boolean bool2, C783980UpA c783980UpA, Map<String, String> map) {
                    boolean z;
                    View view;
                    DrawerFeedLiveFragmentV2 drawerFeedLiveFragmentV2 = this.LIZ;
                    if (bool.booleanValue() && TextUtils.equals(this.LIZ.LLJILJILJ, "foru")) {
                        z = true;
                    } else {
                        z = false;
                    }
                    drawerFeedLiveFragmentV2.LLJI = z;
                    DrawerFeedLiveFragmentV2 drawerFeedLiveFragmentV22 = this.LIZ;
                    if (drawerFeedLiveFragmentV22.LLJI && (view = drawerFeedLiveFragmentV22.LLILLL) != null) {
                        C786410Ut5.LJLLLLLL(0, view);
                    }
                }
            }, "drawer_feed");
            C786410Ut5.I7(new ACListenerS142S0100000_7(this, 278), this.LLILLL);
        }
        try {
            ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(viewTd, this);
            viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            } else {
                c19gs = null;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return viewTd;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return viewTd;
        }
    }
}
