package com.bytedance.android.livesdk.feed.drawerfeed.base;

import X.C036E;
import X.C098200Yq;
import X.C0IJT;
import X.C0IUA;
import X.C0IXQ;
import X.C0IYZ;
import X.C0IZ7;
import X.C0J1N;
import X.C0J1O;
import X.C0J1R;
import X.C0J1U;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1161920gLG;
import X.C11NZ;
import X.C11RD;
import X.C1685300txQ;
import X.C1701940uOG;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C1EOY;
import X.C2093608Ic;
import X.C2097608Jq;
import X.C425530GmN;
import X.C464660IKa;
import X.C467800IWc;
import X.C469280Iak;
import X.C469770IbX;
import X.C470660Icy;
import X.C470870IdJ;
import X.C471000IdW;
import X.C471400IeA;
import X.C471440IeE;
import X.C471540IeO;
import X.C471640IeY;
import X.C474500IjA;
import X.C480460Ism;
import X.C481090Itn;
import X.C486980J7w;
import X.C497740JfY;
import X.C500260Jjc;
import X.C521590Kcv;
import X.C772770UTb;
import X.C784440Upu;
import X.C786410Ut5;
import X.EnumC469210Iad;
import X.EnumC470670Icz;
import X.EnumC486990J7x;
import X.InterfaceC1670800ta2;
import X.InterfaceC468510IYv;
import X.InterfaceC469760IbW;
import X.InterfaceC470900IdM;
import X.InterfaceC471650IeZ;
import X.InterfaceC471660Iea;
import X.InterfaceC472150IfN;
import Y.ACListenerS142S0100000_7;
import Y.ALAdapterS4S0100000_7;
import Y.AObserverS211S0100000_7;
import Y.AObserverS80S0110000_7;
import Y.AfS176S0100000_7;
import Y.AsS34S0100000_7;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.feed.api.FeedApi;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.feed.drawerfeed.base.BaseDrawerFeedLiveFragment;
import com.bytedance.android.livesdk.feed.repository.FeedRepository;
import com.bytedance.android.livesdk.feed.viewmodel.TabFeedViewModel;
import com.bytedance.android.livesdk.livesetting.feed.FeedPreloadSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveFeedPreloadSetting;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdk.model.ItemTab;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.bytedance.android.livesdkapi.user.ApplyLivePermission;
import com.bytedance.android.livesdkapi.user.DetailLivePermission;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.AwS551S0100000_7;

/* JADX INFO: loaded from: classes8.dex */
public abstract class BaseDrawerFeedLiveFragment extends BaseFragment implements InterfaceC470900IdM {
    public final InterfaceC469760IbW LL;
    public final C469770IbX LLILLJJLI;
    public final Function1<C469770IbX, C0IZ7> LLILLL;
    public final Function1<C469770IbX, C0IYZ> LLILZ;
    public RecyclerView LLILZIL;
    public C481090Itn LLILZLL;
    public C470660Icy LLIZ;
    public GridLayoutManager LLIZLLLIL;
    public String LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public TabFeedViewModel LLJILJIL;
    public C471440IeE LLJILJILJ;
    public final boolean LLJILLL;
    public boolean LLJJ;
    public C0IZ7 LLJJI;
    public View LLJJIII;
    public long LLJJIJI;
    public boolean LLJJIJIIJIL;
    public boolean LLJJIJIL;

    public long RR() {
        return -1L;
    }

    public Map<String, String> SR() {
        return null;
    }

    public boolean UR() {
        return false;
    }

    public boolean VR() {
        return false;
    }

    @Override // X.InterfaceC470900IdM
    public final void qD() {
    }

    public BaseDrawerFeedLiveFragment() {
        this(new C471640IeY(), new C469770IbX(0), AFwS237S0000000_7.get$arr$(10), AFwS237S0000000_7.get$arr$(11));
    }

    public void WR() {
        String str;
        C470660Icy c470660Icy;
        C470660Icy c470660Icy2;
        FeedItem feedItemLJJLIIIJJI;
        C470660Icy c470660Icy3 = this.LLIZ;
        if (c470660Icy3 == null || (c470660Icy3.LLLIILIL() != 0 && ((c470660Icy = this.LLIZ) == null || c470660Icy.LLLIILIL() != 1 || (c470660Icy2 = this.LLIZ) == null || (feedItemLJJLIIIJJI = c470660Icy2.LJJLIIIJJI(0)) == null || feedItemLJJLIIIJJI.type != 1005))) {
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
        c474500IjALIZ.LJJII(this.LLILLJJLI.LIZ, "tab_type");
        c474500IjALIZ.LJJII(c467800IWc.LJIIL, "landing_reason");
        c474500IjALIZ.LJJII(C0IUA.LJJI, "from_drawer_tab");
        c474500IjALIZ.LJJII(Integer.valueOf(c467800IWc.LJI() ? 1 : 0), C467800IWc.LJIJJLI);
        c474500IjALIZ.LJJII(C0IXQ.LIZIZ(), C467800IWc.LJIL);
        c474500IjALIZ.LJJII(c467800IWc.LIZIZ(), "entrance_type");
        c474500IjALIZ.LJJIIZI(SR());
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJIIJ();
        c474500IjALIZ.LIZ();
        RecyclerView recyclerView = this.LLILZIL;
        if (recyclerView != null) {
            recyclerView.addOnScrollListener(new C772770UTb(C1EOY.LIZ.LIZIZ("drawer_slide"), null));
        }
    }

    public final void aS() {
        ZR("click");
        if (getContext() != null) {
            ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).handleSchema(getContext(), "sslocal://openRecord?enter_from=direct_shoot&tab=live&source_params={request_from:explore}", new Bundle());
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
        String str;
        return (C2093608Ic.LJ(this.LLJ) || (str = this.LLJ) == null) ? "" : str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TabFeedViewModel OR() {
        TabFeedViewModel tabFeedViewModel;
        InterfaceC471660Iea interfaceC471660Iea;
        Fragment currentFragment;
        C19EG activity = getActivity();
        C471440IeE c471440IeE = null;
        if (activity == 0) {
            return null;
        }
        if (C464660IKa.LIZ() || this.LL.getContainerType() == EnumC469210Iad.EXTERNAL_CONTAINER) {
            C471440IeE c471440IeE2 = this.LLJILJILJ;
            if (c471440IeE2 != null) {
                c471440IeE2.LIZIZ = this;
                c471440IeE = c471440IeE2;
            }
            ViewModelProvider viewModelProviderOf = ViewModelProviders.of(this, c471440IeE);
            String str = this.LLILLJJLI.LIZ;
            tabFeedViewModel = (TabFeedViewModel) viewModelProviderOf.get(str != null ? str : "", TabFeedViewModel.class);
        } else if (!(activity instanceof InterfaceC471660Iea) || (interfaceC471660Iea = (InterfaceC471660Iea) activity) == null || (currentFragment = interfaceC471660Iea.getCurrentFragment()) == null) {
            C471440IeE c471440IeE3 = this.LLJILJILJ;
            if (c471440IeE3 != null) {
                c471440IeE3.LIZIZ = this;
                c471440IeE = c471440IeE3;
            }
            ViewModelProvider viewModelProviderOf2 = ViewModelProviders.of(activity, c471440IeE);
            String str2 = this.LLILLJJLI.LIZ;
            tabFeedViewModel = (TabFeedViewModel) viewModelProviderOf2.get(str2 != null ? str2 : "", TabFeedViewModel.class);
        } else {
            C471440IeE c471440IeE4 = this.LLJILJILJ;
            if (c471440IeE4 != null) {
                c471440IeE4.LIZIZ = this;
                c471440IeE = c471440IeE4;
            }
            ViewModelProvider viewModelProviderOf3 = ViewModelProviders.of(currentFragment, c471440IeE);
            String str3 = this.LLILLJJLI.LIZ;
            tabFeedViewModel = (TabFeedViewModel) viewModelProviderOf3.get(str3 != null ? str3 : "", TabFeedViewModel.class);
        }
        tabFeedViewModel.LLJLIL = RR();
        tabFeedViewModel.EQ2();
        tabFeedViewModel.FQ2();
        tabFeedViewModel.LLILLJJLI.observe(this, new AObserverS80S0110000_7(this, 0));
        C481090Itn c481090Itn = this.LLILZLL;
        if (c481090Itn != null) {
            c481090Itn.setOnRefreshListener(new AwS551S0100000_7(tabFeedViewModel, 58));
        }
        return tabFeedViewModel;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        if (this.LLJILLL) {
            NR("onPause");
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.LLJILLL) {
            NR("onResume");
            this.LLJJ = false;
        }
    }

    public final void NR(String str) {
        boolean z;
        int i;
        TabFeedViewModel tabFeedViewModel;
        if (this.LLJJ) {
            return;
        }
        if (getUserVisibleHint() && isResumed()) {
            z = true;
        } else {
            z = false;
        }
        if (this.LLJI == z) {
            return;
        }
        this.LLJI = z;
        if (z) {
            bS(str);
            return;
        }
        TabFeedViewModel tabFeedViewModel2 = this.LLJILJIL;
        if (tabFeedViewModel2 != null) {
            tabFeedViewModel2.AQ2(false);
        }
        GridLayoutManager gridLayoutManager = this.LLIZLLLIL;
        if (gridLayoutManager != null) {
            TabFeedViewModel tabFeedViewModel3 = this.LLJILJIL;
            if (tabFeedViewModel3 != null) {
                tabFeedViewModel3.LLJJJIL = gridLayoutManager.findFirstCompletelyVisibleItemPosition();
            }
            GridLayoutManager gridLayoutManager2 = this.LLIZLLLIL;
            if (gridLayoutManager2 != null) {
                TabFeedViewModel tabFeedViewModel4 = this.LLJILJIL;
                if (tabFeedViewModel4 != null) {
                    i = tabFeedViewModel4.LLJJJIL;
                } else {
                    i = 0;
                }
                View viewFindViewByPosition = gridLayoutManager2.findViewByPosition(i);
                if (viewFindViewByPosition != null && (tabFeedViewModel = this.LLJILJIL) != null) {
                    tabFeedViewModel.LLJJJJ = viewFindViewByPosition.getTop();
                }
            }
        }
        C470660Icy c470660Icy = this.LLIZ;
        if (c470660Icy != null) {
            c470660Icy.LLLLIILLL(str, false);
        }
        C470660Icy c470660Icy2 = this.LLIZ;
        if (c470660Icy2 == null) {
            return;
        }
        c470660Icy2.LLJJIJIL.onNext(C0J1R.LIZJ);
    }

    public final void ZR(String str) {
        HashMap map = new HashMap();
        map.put("action_type", str);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_explore_live_take_button");
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LIZ();
    }

    public void bS(String str) {
        TabFeedViewModel tabFeedViewModel = this.LLJILJIL;
        if (tabFeedViewModel != null) {
            tabFeedViewModel.AQ2(true);
        }
        C470660Icy c470660Icy = this.LLIZ;
        if (c470660Icy != null) {
            c470660Icy.LLLLIILLL(str, true);
        }
        C470660Icy c470660Icy2 = this.LLIZ;
        if (c470660Icy2 != null) {
            c470660Icy2.LLJJIJIIJIL.onNext(C0J1R.LIZJ);
            c470660Icy2.LLJJJJJIL = false;
        }
        if (this.LLJIJIL) {
            WR();
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String url;
        C486980J7w.LJFF(EnumC486990J7x.LiveFeedInit);
        super.onCreate(bundle);
        List<ItemTab> listLIZJ = C471000IdW.LJ().LIZJ();
        if (listLIZJ != null && ((ArrayList) listLIZJ).size() > 0) {
            ItemTab itemTab = (ItemTab) ListProtector.get(listLIZJ, 0);
            if (itemTab != null) {
                url = itemTab.getUrl();
            } else {
                url = null;
            }
            this.LLJ = url;
        }
        ((C0J1N) C784440Upu.LIZ().LJ(C469280Iak.class).LJIILIIL(C0J1R.LIZIZ(this)).LIZJ(C11RD.LIZLLL(this))).LIZJ(new AfS176S0100000_7(this, 60));
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10502, "com/bytedance/android/livesdk/feed/drawerfeed/base/BaseDrawerFeedLiveFragment", "setUserVisibleHint", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl7S+2DnkbzffxjyqvOq01IZZ2F90srXm0WHHqxxUYj3hJVAVckIwP0oS436WV3q8=", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        super.setUserVisibleHint(z);
        if (!this.LLJILLL) {
            return;
        }
        NR("userVisibleHint");
    }

    public final void PR(int i, View view) {
        View view2;
        boolean z;
        if (this.LLJJIJIIJIL && !this.LLJJIJIL && (view2 = this.LLJJIII) != null) {
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
                this.LLJJIJIL = true;
                C786410Ut5.LJLLLLLL(0, view);
                ZR("show");
                C786410Ut5.ed(view, fLIZIZ);
                view.animate().setDuration(300L).translationY(0.0f).setListener(new ALAdapterS4S0100000_7(this, 6)).alpha(1.0f).start();
                return;
            }
            if (!z) {
                return;
            }
            this.LLJJIJIL = true;
            view.animate().setDuration(300L).translationY(fLIZIZ).setListener(new ALAdapterS4S0100000_7(this, 5)).alpha(0.0f).start();
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        LifecycleOwner viewLifecycleOwner;
        MutableLiveData<List<ImageModel>> mutableLiveData;
        MutableLiveData<EnumC470670Icz> mutableLiveData2;
        InterfaceC471660Iea interfaceC471660Iea;
        InterfaceC471660Iea interfaceC471660Iea2;
        super.onViewCreated(view, bundle);
        final C0IYZ c0iyzInvoke = this.LLILZ.invoke(this.LLILLJJLI);
        Map<Integer, InterfaceC468510IYv> mapLJIIJ = C2097608Jq.LJIIJ(new Pair(Integer.valueOf(R.layout.gqc), c0iyzInvoke.LIZJ()), new Pair(Integer.valueOf(R.layout.hre), new InterfaceC468510IYv() { // from class: X.0IYw
            /* JADX WARN: Removed duplicated region for block: B:42:0x006c  */
            @Override // X.InterfaceC468510IYv
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.AbstractC468490IYt LIZ(android.view.ViewGroup r10, java.lang.Object[] r11) {
                /*
                    r9 = this;
                    r7 = r10
                    android.content.Context r0 = r7.getContext()
                    android.view.LayoutInflater r2 = X.C786410Ut5.ne(r0)
                    r0 = 2131569782(0x7f0d2c76, float:1.87652E38)
                    r1 = 0
                    android.view.View r2 = X.C786410Ut5.Td(r2, r0, r7, r1)
                    int r0 = r11.length
                    if (r0 != 0) goto L6e
                    r0 = 1
                L15:
                    r0 = r0 ^ 1
                    r8 = 0
                    if (r0 == 0) goto L6c
                    r3 = r11[r1]
                    boolean r0 = r3 instanceof java.lang.String
                    if (r0 == 0) goto L6c
                    java.lang.String r3 = (java.lang.String) r3
                L22:
                    int r1 = r11.length
                    r0 = 2
                    if (r1 <= r0) goto L6a
                    r4 = r11[r0]
                    boolean r0 = r4 instanceof X.C11RK
                    if (r0 == 0) goto L6a
                    boolean r0 = r4 instanceof X.C11RK
                    if (r0 == 0) goto L68
                    X.11RK r4 = (X.C11RK) r4
                L32:
                    int r1 = r11.length
                    r0 = 3
                    if (r1 <= r0) goto L66
                    r5 = r11[r0]
                    boolean r0 = r5 instanceof X.C11RK
                    if (r0 == 0) goto L66
                    boolean r0 = r5 instanceof X.C11RK
                    if (r0 == 0) goto L64
                    X.11RK r5 = (X.C11RK) r5
                L42:
                    int r1 = r11.length
                    r0 = 4
                    if (r1 <= r0) goto L62
                    r6 = r11[r0]
                    boolean r0 = r6 instanceof X.C11RK
                    if (r0 == 0) goto L62
                    boolean r0 = r6 instanceof X.C11RK
                    if (r0 == 0) goto L60
                    X.11RK r6 = (X.C11RK) r6
                L52:
                    X.0ehz r1 = new X.0ehz
                    X.0IYZ r0 = r1
                    X.0IbX r0 = r0.LIZ
                    if (r0 == 0) goto L5c
                    java.lang.String r8 = r0.LIZ
                L5c:
                    r1.<init>(r2, r3, r4, r5, r6, r7, r8)
                    return r1
                L60:
                    r6 = r8
                    goto L52
                L62:
                    r6 = r8
                    goto L52
                L64:
                    r5 = r8
                    goto L42
                L66:
                    r5 = r8
                    goto L42
                L68:
                    r4 = r8
                    goto L32
                L6a:
                    r4 = r8
                    goto L32
                L6c:
                    r3 = r8
                    goto L22
                L6e:
                    r0 = 0
                    goto L15
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C468520IYw.LIZ(android.view.ViewGroup, java.lang.Object[]):X.0IYt");
            }
        }), new Pair(Integer.valueOf(R.layout.hqt), c0iyzInvoke.LIZLLL()));
        Map<Integer, InterfaceC468510IYv> mapLIZIZ = c0iyzInvoke.LIZIZ();
        if (mapLIZIZ != null) {
            mapLJIIJ.putAll(mapLIZIZ);
        }
        this.LLIZ = c0iyzInvoke.LIZ(mapLJIIJ);
        C470870IdJ c470870IdJ = new C470870IdJ();
        this.LLJJI = this.LLILLL.invoke(this.LLILLJJLI);
        C480460Ism.LIZ().getClass();
        this.LLJILJILJ = new C471440IeE(new FeedRepository(c470870IdJ, (FeedApi) C480460Ism.LIZLLL(FeedApi.class), new C0J1U(), new C0J1O(), this.LLJJI, this.LLILLJJLI));
        this.LLJILJIL = OR();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 2);
        gridLayoutManager.LLIZ = new C521590Kcv(this, 4);
        this.LLIZLLLIL = gridLayoutManager;
        Boolean boolValueOf = null;
        if (!C464660IKa.LIZ() && this.LL.getContainerType() != EnumC469210Iad.EXTERNAL_CONTAINER) {
            InterfaceC1670800ta2 activity = getActivity();
            if ((activity instanceof InterfaceC471660Iea) && (interfaceC471660Iea = (InterfaceC471660Iea) activity) != null && interfaceC471660Iea.getCurrentFragment() != null) {
                InterfaceC1670800ta2 activity2 = getActivity();
                if ((activity2 instanceof InterfaceC471660Iea) && (interfaceC471660Iea2 = (InterfaceC471660Iea) activity2) != null) {
                    viewLifecycleOwner = interfaceC471660Iea2.getCurrentFragment();
                } else {
                    viewLifecycleOwner = null;
                }
            } else {
                viewLifecycleOwner = getActivity();
            }
        } else {
            viewLifecycleOwner = getViewLifecycleOwner();
        }
        C471400IeA c471400IeA = new C471400IeA();
        c471400IeA.LJI = viewLifecycleOwner;
        c471400IeA.LIZJ = this.LLJILJIL;
        RecyclerView recyclerView = this.LLILZIL;
        c471400IeA.LIZIZ = recyclerView;
        c471400IeA.LJII = new InterfaceC471650IeZ() { // from class: X.0IeM
            @Override // X.InterfaceC471650IeZ
            public final void LIZ() {
                this.LIZ.LLJJ = true;
                C0IU0.LJI(6);
            }
        };
        c471400IeA.LIZ = this.LLIZ;
        c471400IeA.LIZLLL = this.LLIZLLLIL;
        if (recyclerView != null) {
            recyclerView.setPadding(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getPaddingRight(), recyclerView.getPaddingBottom());
        }
        c471400IeA.LJFF = new C425530GmN();
        c471400IeA.LJ = 2;
        c471400IeA.LJIIIIZZ = this.LLILLJJLI.LIZ;
        c471400IeA.LIZ().LIZ();
        TabFeedViewModel tabFeedViewModel = this.LLJILJIL;
        if (tabFeedViewModel != null) {
            tabFeedViewModel.AQ2(getUserVisibleHint());
        }
        if (VR()) {
            TabFeedViewModel tabFeedViewModel2 = this.LLJILJIL;
            if (tabFeedViewModel2 != null) {
                boolValueOf = Boolean.valueOf(tabFeedViewModel2.LLJJLIIIJLLLLLLLZ);
            }
            if (C500260Jjc.LJJIFFI(boolValueOf)) {
                MR(C11NZ.LJJJJZ(1).LJJI(2L, TimeUnit.SECONDS).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJIJIIJIL(new AfS176S0100000_7(this, 61)).LJJLJ());
            }
        }
        TabFeedViewModel tabFeedViewModel3 = this.LLJILJIL;
        if (tabFeedViewModel3 != null && (mutableLiveData2 = tabFeedViewModel3.LLJJIII) != null) {
            mutableLiveData2.observe(this, new AObserverS211S0100000_7(this, 3));
        }
        TabFeedViewModel tabFeedViewModel4 = this.LLJILJIL;
        if (tabFeedViewModel4 != null && (mutableLiveData = tabFeedViewModel4.LLJJI) != null) {
            mutableLiveData.observe(this, new Observer() { // from class: X.0IeJ
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    Iterator it2 = ((List) obj).iterator();
                    while (it2.hasNext()) {
                        C1324570kZb.LJIIIIZZ((ImageModel) it2.next());
                    }
                }
            });
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView recyclerView;
        C481090Itn c481090Itn;
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.ghv, viewGroup, false);
        C19GS c19gs = null;
        if (viewTd != null) {
            recyclerView = (RecyclerView) viewTd.findViewById(R.id.ms4);
        } else {
            recyclerView = null;
        }
        this.LLILZIL = recyclerView;
        if (viewTd != null) {
            c481090Itn = (C481090Itn) viewTd.findViewById(R.id.wsc);
        } else {
            c481090Itn = null;
        }
        this.LLILZLL = c481090Itn;
        if (c481090Itn != null) {
            c481090Itn.stopNestedScroll(0);
        }
        RecyclerView recyclerView2 = this.LLILZIL;
        if (recyclerView2 != null) {
            recyclerView2.addOnScrollListener(new C471540IeO());
        }
        RecyclerView recyclerView3 = this.LLILZIL;
        if (recyclerView3 != null) {
            recyclerView3.addOnScrollListener(new AsS34S0100000_7(this, 2));
        }
        if (UR()) {
            this.LLJJIII = viewTd.findViewById(R.id.yqb);
            ((IHostUser) C1161920gLG.LIZJ(IHostUser.class)).requestLivePermission(new InterfaceC472150IfN() { // from class: X.0Ie8
                @Override // X.InterfaceC472150IfN
                public final void onFailed(Throwable th) {
                }

                @Override // X.InterfaceC472150IfN
                public final void LIZ(Boolean bool, DetailLivePermission detailLivePermission, ApplyLivePermission applyLivePermission, Boolean bool2, C783980UpA c783980UpA, Map map) {
                    boolean z;
                    View view;
                    boolean zBooleanValue = bool.booleanValue();
                    bool2.booleanValue();
                    BaseDrawerFeedLiveFragment baseDrawerFeedLiveFragment = this.LIZ;
                    if (zBooleanValue && TextUtils.equals(baseDrawerFeedLiveFragment.LLILLJJLI.LIZ, "foru")) {
                        z = true;
                    } else {
                        z = false;
                    }
                    baseDrawerFeedLiveFragment.LLJJIJIIJIL = z;
                    BaseDrawerFeedLiveFragment baseDrawerFeedLiveFragment2 = this.LIZ;
                    if (baseDrawerFeedLiveFragment2.LLJJIJIIJIL && (view = baseDrawerFeedLiveFragment2.LLJJIII) != null) {
                        C786410Ut5.LJLLLLLL(0, view);
                        this.LIZ.ZR("show");
                    }
                }
            }, "drawer_feed");
            View view = this.LLJJIII;
            if (view != null) {
                C786410Ut5.I7(new ACListenerS142S0100000_7(this, 286), view);
            }
        }
        try {
            ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(viewTd, this);
            viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
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

    /* JADX WARN: Multi-variable type inference failed */
    public BaseDrawerFeedLiveFragment(InterfaceC469760IbW interfaceC469760IbW, C469770IbX c469770IbX, Function1<? super C469770IbX, ? extends C0IZ7> function1, Function1<? super C469770IbX, ? extends C0IYZ> function12) {
        this.LL = interfaceC469760IbW;
        this.LLILLJJLI = c469770IbX;
        this.LLILLL = function1;
        this.LLILZ = function12;
        this.LLJILLL = true;
    }
}
