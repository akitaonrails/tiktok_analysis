package com.ss.android.ugc.aweme.commercialize.profile;

import X.AbstractC1255880imo;
import X.C086I;
import X.C098200Yq;
import X.C0OBG;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1022820ciu;
import X.C1212520hes;
import X.C1260010itT;
import X.C1260260its;
import X.C12ES;
import X.C1603960rqE;
import X.C1685300txQ;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20533215Wg;
import X.C2184171Adz;
import X.C2200821BBo;
import X.C345780Dh2;
import X.C683640Qri;
import X.C786410Ut5;
import X.InterfaceC1212360hec;
import X.InterfaceC1258040iqI;
import X.InterfaceC1260110itd;
import X.InterfaceC683650Qrj;
import X.ViewTreeObserverOnGlobalLayoutListenerC1265990j37;
import Y.ACListenerS154S0100000_19;
import Y.AsS46S0100000_19;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.commercialize.profile.FakeUserAwemeApi;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.Unit;

/* JADX INFO: loaded from: classes20.dex */
public final class AdFakeUserProfileAwemeListFragment extends AmeBaseFragment implements InterfaceC1212360hec<Aweme>, InterfaceC1258040iqI, InterfaceC1260110itd, InterfaceC683650Qrj {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJCI2OiYlKCM6MiBiOTHELIOS08LiwgLGESLAMtIioGOyA+GT08LiwgLA4kLSgpBSYgPAM+KCg+LSs4";
    public RecyclerView LL;
    public C1749280vcc LLILLJJLI;
    public WrapGridLayoutManager LLILLL;
    public C1212520hes LLILZ;
    public boolean LLJ;
    public C1260010itT LLJI;
    public AwemeRawAd LLJIJIL;
    public long LLJILLL;
    public boolean LLJJ;
    public String LLILZIL = "";
    public String LLILZLL = "";
    public String LLIZ = "";
    public String LLIZLLLIL = "";
    public final List<String> LLJILJIL = new ArrayList();
    public final Map<String, Boolean> LLJILJILJ = new HashMap();

    @Override // X.InterfaceC1260110itd
    public final /* synthetic */ void GA(Boolean bool) {
    }

    @Override // X.InterfaceC1212360hec
    public final void Jm() {
    }

    @Override // X.InterfaceC1260110itd
    public final /* synthetic */ void LD(TuxTextView tuxTextView, Aweme aweme) {
    }

    @Override // X.InterfaceC1212360hec
    public final void LLJJJIL(List<Aweme> list, boolean z) {
    }

    @Override // X.InterfaceC1260110itd
    public final /* synthetic */ void LLLLLZL(MotionEvent motionEvent) {
    }

    @Override // X.InterfaceC1260110itd
    public final /* synthetic */ void NN() {
    }

    @Override // X.InterfaceC1212360hec
    public final /* synthetic */ void SY() {
    }

    @Override // X.InterfaceC1260110itd
    public final /* synthetic */ void Xt(View view, Aweme aweme, String str, int i) {
    }

    @Override // X.InterfaceC1260110itd
    public final /* synthetic */ void ZF(Aweme aweme, View view) {
    }

    @Override // X.InterfaceC1212360hec
    public final void bD1(Exception exc) {
    }

    @Override // X.InterfaceC1260110itd
    public final /* synthetic */ void fx(Boolean bool) {
    }

    @Override // X.InterfaceC1212360hec
    public final void mE(List<Aweme> list, boolean z) {
    }

    @Override // X.InterfaceC683650Qrj
    public final void n2(boolean z) {
    }

    @Override // X.InterfaceC1212360hec
    public final /* synthetic */ void zK() {
        throw null;
    }

    @Override // X.InterfaceC1212360hec
    public final void LJ() {
        C1260010itT c1260010itT = this.LLJI;
        if (c1260010itT == null || c1260010itT.getItemCount() != 0) {
            return;
        }
        PR();
    }

    public final void NR() {
        C1260010itT c1260010itT = this.LLJI;
        if (c1260010itT != null) {
            C1212520hes c1212520hes = this.LLILZ;
            if (c1212520hes == null) {
                c1212520hes = null;
            }
            Object[] objArr = new Object[8];
            objArr[0] = this.LLILZLL;
            int i = 1;
            objArr[1] = this.LLIZ;
            objArr[2] = Long.valueOf(this.LLJILLL);
            objArr[3] = 0L;
            objArr[4] = 6;
            List<T> list = c1260010itT.mmItems;
            if (list != 0 && list.size() != 0) {
                i = 4;
            }
            objArr[5] = Integer.valueOf(i);
            objArr[6] = this.LLIZLLLIL;
            objArr[7] = this.LLILZIL;
            c1212520hes.LIZJ(objArr);
        }
    }

    public final void OR() {
        C1749280vcc c1749280vcc = this.LLILLJJLI;
        if (c1749280vcc == null) {
            c1749280vcc = null;
        }
        C786410Ut5.LLLZLZ(c1749280vcc, 0);
        C1749280vcc c1749280vcc2 = this.LLILLJJLI;
        if (c1749280vcc2 == null) {
            c1749280vcc2 = null;
        }
        C1722300uv6 c1722300uv6 = new C1722300uv6();
        c1722300uv6.LJIIIIZZ = getString(R.string.l6r);
        c1749280vcc2.setStatus(c1722300uv6);
        C1749280vcc c1749280vcc3 = this.LLILLJJLI;
        C786410Ut5.l9(c1749280vcc3 != null ? c1749280vcc3 : null, new ACListenerS154S0100000_19(this, 92));
        this.LLJJ = false;
    }

    public final void PR() {
        C1749280vcc c1749280vcc = this.LLILLJJLI;
        if (c1749280vcc == null) {
            c1749280vcc = null;
        }
        C786410Ut5.LLLZLZ(c1749280vcc, 0);
        C1749280vcc c1749280vcc2 = this.LLILLJJLI;
        if (c1749280vcc2 == null) {
            c1749280vcc2 = null;
        }
        c1749280vcc2.LJ();
        C1749280vcc c1749280vcc3 = this.LLILLJJLI;
        if (c1749280vcc3 == null) {
            c1749280vcc3 = null;
        }
        C786410Ut5.l9(c1749280vcc3, null);
        this.LLJJ = true;
    }

    @Override // X.InterfaceC1258040iqI
    public final View LJJLIIIJILLIZJL() {
        RecyclerView recyclerView;
        if (!isViewValid() || (recyclerView = this.LL) == null) {
            return null;
        }
        return recyclerView;
    }

    @Override // X.InterfaceC1212360hec
    public final void Ng1() {
        if (isViewValid()) {
            OR();
        }
    }

    @Override // X.InterfaceC1212360hec
    public final void showLoadMoreLoading() {
        if (isViewValid()) {
            C1260010itT c1260010itT = this.LLJI;
            if (c1260010itT != null && c1260010itT.getItemCount() == 0) {
                PR();
            }
            C1260010itT c1260010itT2 = this.LLJI;
            if (c1260010itT2 != null) {
                c1260010itT2.showLoadMoreLoading();
            }
        }
    }

    @Override // X.InterfaceC683650Qrj
    public final boolean LJIIJJI() {
        return this.LLJ;
    }

    @Override // X.InterfaceC683650Qrj
    public final void preload() {
        NR();
    }

    public final void MR(boolean z) {
        int size;
        C1260010itT c1260010itT;
        List<T> list;
        Aweme aweme;
        List<T> list2;
        WrapGridLayoutManager wrapGridLayoutManager = this.LLILLL;
        if (wrapGridLayoutManager == null) {
            wrapGridLayoutManager = null;
        }
        if ((wrapGridLayoutManager instanceof WrapGridLayoutManager) && wrapGridLayoutManager != null) {
            int iFindLastVisibleItemPosition = wrapGridLayoutManager.findLastVisibleItemPosition();
            ((ArrayList) this.LLJILJIL).clear();
            if (z && iFindLastVisibleItemPosition >= 5) {
                iFindLastVisibleItemPosition = 5;
            }
            int i = iFindLastVisibleItemPosition + 1;
            for (int iFindFirstVisibleItemPosition = wrapGridLayoutManager.findFirstVisibleItemPosition(); iFindFirstVisibleItemPosition < i; iFindFirstVisibleItemPosition++) {
                C1260010itT c1260010itT2 = this.LLJI;
                if (c1260010itT2 != null && (list2 = c1260010itT2.mmItems) != 0) {
                    size = list2.size();
                } else {
                    size = 0;
                }
                if (iFindFirstVisibleItemPosition < size && (c1260010itT = this.LLJI) != null && (list = c1260010itT.mmItems) != 0 && (aweme = (Aweme) ListProtector.get(list, iFindFirstVisibleItemPosition)) != null) {
                    String aid = aweme.getAid();
                    Boolean bool = (Boolean) ((HashMap) this.LLJILJILJ).get(aid);
                    if (bool == null || !bool.booleanValue()) {
                        C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("homepage_ad", "othershow", this.LLJIJIL);
                        c1022820ciuLIZLLL.LIZJ("video_cover", "refer");
                        c1022820ciuLIZLLL.LIZIZ(aweme.getAid(), "item_id");
                        c1022820ciuLIZLLL.LJII();
                    }
                    ((HashMap) this.LLJILJILJ).put(aid, Boolean.TRUE);
                    ((ArrayList) this.LLJILJIL).add(aid);
                } else {
                    return;
                }
            }
            for (Object obj : ((HashMap) this.LLJILJILJ).keySet()) {
                if (!((ArrayList) this.LLJILJIL).contains(obj)) {
                    ((HashMap) this.LLJILJILJ).put(obj, Boolean.FALSE);
                }
            }
        }
    }

    @Override // X.InterfaceC1212360hec
    public final void Uq2(Exception exc) {
        List<Aweme> data;
        C1260010itT c1260010itT;
        if (!isViewValid()) {
            return;
        }
        OR();
        C1260010itT c1260010itT2 = this.LLJI;
        if (c1260010itT2 != null) {
            data = c1260010itT2.getData();
        } else {
            data = null;
        }
        if (!C086I.LIZIZ(data) && (c1260010itT = this.LLJI) != null) {
            c1260010itT.clearData();
        }
    }

    @Override // X.InterfaceC1212360hec
    public final void Wi(Exception exc) {
        if (!isViewValid()) {
            return;
        }
        C1260010itT c1260010itT = this.LLJI;
        if (c1260010itT != null && c1260010itT.getItemCount() == 0) {
            this.LLJJ = false;
            C1749280vcc c1749280vcc = this.LLILLJJLI;
            if (c1749280vcc == null) {
                c1749280vcc = null;
            }
            C786410Ut5.LLLZLZ(c1749280vcc, 8);
        }
        C1260010itT c1260010itT2 = this.LLJI;
        if (c1260010itT2 != null) {
            c1260010itT2.showPullUpLoadMore();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) throws Throwable {
        C1260010itT c1260010itT;
        List<T> list;
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10502, "com/ss/android/ugc/aweme/commercialize/profile/AdFakeUserProfileAwemeListFragment", "setUserVisibleHint", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLLzjHP2aI3/COMqHP3lj6MFIsfLOOHfG5InFGcAaDwHU+/aWVHxHw6Id+TO6TkQxGTQ89E", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        super.setUserVisibleHint(z);
        if (z && ((c1260010itT = this.LLJI) == null || c1260010itT.mmItems == null || (c1260010itT != null && (list = c1260010itT.mmItems) != 0 && list.size() == 0))) {
            NR();
        }
        C2200821BBo.LIZ.getClass();
        if (!C2200821BBo.LIZ() && C2200821BBo.LJI && z) {
            C20533215Wg.LIZ(AdFakeUserProfileAwemeListFragment.class);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1212360hec
    public final void Pj(List<Aweme> list, boolean z) {
        boolean z2;
        if (isViewValid()) {
            C1260010itT c1260010itT = this.LLJI;
            if (c1260010itT != null) {
                c1260010itT.resetLoadMoreState();
            }
            C1212520hes c1212520hes = this.LLILZ;
            C1749280vcc c1749280vcc = null;
            if (c1212520hes == null) {
                c1212520hes = null;
            }
            T t = c1212520hes.LL;
            T t2 = t.mData;
            if (t2 != 0 && ((FeedItemList) t2).getItems() != null && ((FeedItemList) t.mData).getItems().size() != 0) {
                int size = ((FeedItemList) t.mData).getItems().size();
                for (int i = 0; i < size; i++) {
                    ListProtector.set(((FeedItemList) t.mData).getItems(), i, ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).LLILLL((Aweme) ListProtector.get(((FeedItemList) t.mData).getItems(), i)));
                }
            }
            C1260010itT c1260010itT2 = this.LLJI;
            if (c1260010itT2 != null) {
                c1260010itT2.setData(list);
            }
            this.LLJ = z;
            C1260010itT c1260010itT3 = this.LLJI;
            if (c1260010itT3 != null && c1260010itT3.getBasicItemCount() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2 && !z && this.LLJJ) {
                this.LLJJ = false;
                C1749280vcc c1749280vcc2 = this.LLILLJJLI;
                if (c1749280vcc2 != null) {
                    c1749280vcc = c1749280vcc2;
                }
                C786410Ut5.LLLZLZ(c1749280vcc, 8);
                return;
            }
            if (C086I.LIZIZ(list) && z) {
                NR();
                return;
            }
            if (C086I.LIZIZ(list)) {
                return;
            }
            this.LLJJ = false;
            C1749280vcc c1749280vcc3 = this.LLILLJJLI;
            if (c1749280vcc3 != null) {
                c1749280vcc = c1749280vcc3;
            }
            C786410Ut5.LLLZLZ(c1749280vcc, 8);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        RecyclerView recyclerView;
        String string;
        String string2;
        String string3;
        String string4;
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView2 = (RecyclerView) view.findViewById(R.id.hl5);
        this.LL = recyclerView2;
        RecyclerView recyclerView3 = null;
        if (recyclerView2 == null) {
            recyclerView = null;
        } else {
            recyclerView = recyclerView2;
        }
        if (recyclerView2 == null) {
            recyclerView2 = null;
        }
        recyclerView.setOnFlingListener(new C683640Qri(recyclerView2, this));
        this.LLILLJJLI = (C1749280vcc) view.findViewById(R.id.hle);
        Bundle arguments = getArguments();
        String str = "";
        if (arguments == null || (string = arguments.getString("user_id")) == null) {
            string = "";
        }
        this.LLILZLL = string;
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (string2 = arguments2.getString("sec_user_id")) == null) {
            string2 = "";
        }
        this.LLIZ = string2;
        Bundle arguments3 = getArguments();
        if (arguments3 == null || (string3 = arguments3.getString("aweme_id")) == null) {
            string3 = "";
        }
        this.LLILZIL = string3;
        Bundle arguments4 = getArguments();
        if (arguments4 != null && (string4 = arguments4.getString("adv_id")) != null) {
            str = string4;
        }
        this.LLIZLLLIL = str;
        RecyclerView recyclerView4 = this.LL;
        if (recyclerView4 == null) {
            recyclerView4 = null;
        }
        recyclerView4.setOverScrollMode(2);
        WrapGridLayoutManager wrapGridLayoutManager = new WrapGridLayoutManager(2, 1, (Context) getActivity(), false);
        this.LLILLL = wrapGridLayoutManager;
        RecyclerView recyclerView5 = this.LL;
        if (recyclerView5 == null) {
            recyclerView5 = null;
        }
        recyclerView5.setLayoutManager(wrapGridLayoutManager);
        RecyclerView recyclerView6 = this.LL;
        if (recyclerView6 == null) {
            recyclerView6 = null;
        }
        recyclerView6.addItemDecoration(new C345780Dh2(2, (int) C12ES.LIZJ(1.0f, getContext()), false));
        RecyclerView recyclerView7 = this.LL;
        if (recyclerView7 == null) {
            recyclerView7 = null;
        }
        recyclerView7.addOnScrollListener(new C1260260its());
        C1260010itT c1260010itT = new C1260010itT(this);
        this.LLJI = c1260010itT;
        c1260010itT.LLILZ = this.LLILZIL;
        RecyclerView recyclerView8 = this.LL;
        if (recyclerView8 == null) {
            recyclerView8 = null;
        }
        recyclerView8.setAdapter(c1260010itT);
        RecyclerView recyclerView9 = this.LL;
        if (recyclerView9 == null) {
            recyclerView9 = null;
        }
        C786410Ut5.x3(recyclerView9.getViewTreeObserver(), new ViewTreeObserverOnGlobalLayoutListenerC1265990j37(this, 0));
        C1212520hes c1212520hes = new C1212520hes();
        this.LLILZ = c1212520hes;
        c1212520hes.LLILLJJLI = this;
        AbstractC1255880imo<Aweme, FeedItemList> abstractC1255880imo = new AbstractC1255880imo<Aweme, FeedItemList>() { // from class: X.0ihv
            @Override // X.AbstractC1255880imo
            public final void loadMoreList(Object... objArr) {
            }

            @Override // X.AbstractC1255880imo
            public final void refreshList(Object... objArr) {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.AbstractC1255880imo
            public final List<Aweme> getItems() {
                T t = this.mData;
                if (t == 0) {
                    return null;
                }
                return ((FeedItemList) t).getItems();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.AbstractC1255880imo
            public final boolean isHasMore() {
                T t = this.mData;
                return t != 0 && ((FeedItemList) t).isHasMore();
            }

            @Override // X.AbstractC666100QAu
            public final boolean checkParams(Object... objArr) {
                if (objArr.length < 8 || !(objArr[0] instanceof String) || !(objArr[1] instanceof String) || !(objArr[2] instanceof Long) || !(objArr[3] instanceof Long) || !(objArr[4] instanceof Integer) || !(objArr[5] instanceof Integer) || !(objArr[6] instanceof String) || !(objArr[7] instanceof String)) {
                    return false;
                }
                return true;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.AbstractC666100QAu
            public final void handleData(Object obj) {
                int size;
                List<Aweme> items;
                FeedItemList feedItemList = (FeedItemList) obj;
                if (this.mData == 0) {
                    super.handleData(feedItemList);
                    return;
                }
                if (feedItemList == null || feedItemList.getItems() == null) {
                    return;
                }
                List<Aweme> items2 = feedItemList.getItems();
                FeedItemList feedItemList2 = (FeedItemList) this.mData;
                if (feedItemList2 != null && (items = feedItemList2.getItems()) != null) {
                    size = items.size();
                } else {
                    size = 0;
                }
                insertItemList(items2, size);
                List<Aweme> items3 = ((FeedItemList) this.mData).getItems();
                super.handleData(feedItemList);
                ((FeedItemList) this.mData).setItems(items3);
            }

            @Override // X.AbstractC1255880imo, X.AbstractC666100QAu
            public final boolean sendRequest(Object... objArr) {
                if (checkParams(objArr)) {
                    return false;
                }
                final String str2 = (String) objArr[0];
                final String str3 = (String) objArr[1];
                final long jLongValue = ((Long) objArr[2]).longValue();
                final long jLongValue2 = ((Long) objArr[3]).longValue();
                final int iIntValue = ((Integer) objArr[4]).intValue();
                int iIntValue2 = ((Integer) objArr[5]).intValue();
                final String str4 = (String) objArr[6];
                final String str5 = (String) objArr[7];
                this.mListQueryType = iIntValue2;
                C1BVK.LIZIZ().LIZ(this.mHandler, new Callable() { // from class: X.0ihu
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        C1C7U.LIZ("FakeUserAwemeModel@bb70.sendRequest$1");
                        FeedItemList feedItemList = ((FakeUserAwemeApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(C0CQT.LIZJ).create(FakeUserAwemeApi.class)).getFakeUserAwemeList(str2, str3, jLongValue, jLongValue2, iIntValue, str4, str5).execute().LIZIZ;
                        C1C7U.LIZIZ("FakeUserAwemeModel@bb70.sendRequest$1");
                        return feedItemList;
                    }
                }, 0);
                return true;
            }
        };
        C1212520hes c1212520hes2 = this.LLILZ;
        if (c1212520hes2 == null) {
            c1212520hes2 = null;
        }
        c1212520hes2.LJIIJ(abstractC1255880imo);
        AsS46S0100000_19 asS46S0100000_19 = new AsS46S0100000_19(this, 1);
        RecyclerView recyclerView10 = this.LL;
        if (recyclerView10 != null) {
            recyclerView3 = recyclerView10;
        }
        recyclerView3.addOnScrollListener(asS46S0100000_19);
    }

    @Override // X.InterfaceC1260110itd
    public final void I2(Aweme aweme, View view, String str) {
        if (!C0OBG.LIZIZ(view) && aweme != null && getActivity() != null) {
            C1212520hes c1212520hes = this.LLILZ;
            if (c1212520hes == null) {
                c1212520hes = null;
            }
            C1603960rqE.LIZ = (AbstractC1255880imo) c1212520hes.LL;
            Bundle bundle = new Bundle();
            C786410Ut5.LJJJI(FollowStatusChangeMethod.PARAM_UID, aweme.getAid(), bundle);
            C786410Ut5.LJJJI("userid", this.LLILZLL, bundle);
            C786410Ut5.LJJJI("sec_userid", this.LLIZ, bundle);
            C786410Ut5.LJJJI("refer", "new_ad_fake_user", bundle);
            C786410Ut5.LJJJI("video_from", "from_ad_new_fake_user", bundle);
            C786410Ut5.LJJJI("feed_ad_aweme_id", this.LLILZIL, bundle);
            C786410Ut5.LJJJI("feed_adv_id", this.LLIZLLLIL, bundle);
            bundle.putLong("max_cursor", this.LLJILLL);
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(getActivity(), "aweme://aweme/detail/");
            smartRouteBuildRoute.withParam(bundle);
            smartRouteBuildRoute.open();
            C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("homepage_ad", "otherclick", this.LLJIJIL);
            c1022820ciuLIZLLL.LIZJ("video_cover", "refer");
            c1022820ciuLIZLLL.LIZIZ(aweme.getAid(), "item_id");
            c1022820ciuLIZLLL.LJII();
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.ed2, viewGroup, false);
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

    @Override // X.InterfaceC1260110itd
    public final void xe(View view, Aweme aweme, String str, int i) {
        I2(aweme, view, str);
    }
}
