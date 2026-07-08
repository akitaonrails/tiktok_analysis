package com.ss.android.ugc.aweme.share.systemshare;

import X.C098200Yq;
import X.C09OD;
import X.C0IDK;
import X.C0OM1;
import X.C1251150ifB;
import X.C1308910kAL;
import X.C13BV;
import X.C1599690rjL;
import X.C1685300txQ;
import X.C16HQ;
import X.C1749260vca;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20688315xR;
import X.C20688415xS;
import X.C344280Dec;
import X.C384050F3z;
import X.C418440Gaw;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1242460iRA;
import X.InterfaceC1368700lim;
import X.InterfaceC1670800ta2;
import X.InterfaceC20688515xT;
import X.InterfaceC20688615xU;
import Y.AObserverS210S0100000_6;
import Y.AObserverS233S0100000_31;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.sharepanel.api.IMSharePanelApi;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.share.systemshare.SystemShareFragment;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS575S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class SystemShareFragment extends Fragment implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYkKD02ZjHELIOSY1Ojs2JTYkKD02ZhY1Ojs2JRYkKD02DjctLiI2JjE=";
    public TuxNavBar LL;
    public LinearLayout LLILLJJLI;
    public C1749260vca LLILLL;
    public LinearLayout LLILZ;
    public LinearLayout LLILZIL;
    public RecyclerView LLILZLL;
    public RecyclerView LLIZ;
    public LiveData<C09OD> LLIZLLLIL;
    public boolean LLJ;
    public int LLJI;
    public InterfaceC20688615xU LLJILJIL;
    public C344280Dec LLJILJILJ;
    public C344280Dec LLJILLL;
    public List<? extends IMContact> LLJIJIL = C13BV.INSTANCE;
    public final MutableLiveData<Bitmap> LLJJ = new MutableLiveData<>();
    public String LLJJI = "share_panel";

    public final void VR() {
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)));
        translateAnimation.setFillBefore(false);
        translateAnimation.setFillAfter(false);
        translateAnimation.setDuration(200L);
        translateAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
        translateAnimation.setAnimationListener(new C0IDK(this, 1));
        NR().startAnimation(translateAnimation);
    }

    public final LinearLayout MR() {
        View viewFindViewById = this.LLILZIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.hbw) : null;
            this.LLILZIL = (LinearLayout) viewFindViewById;
        }
        return (LinearLayout) viewFindViewById;
    }

    public final LinearLayout NR() {
        View viewFindViewById = this.LLILZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.ije) : null;
            this.LLILZ = (LinearLayout) viewFindViewById;
        }
        return (LinearLayout) viewFindViewById;
    }

    public final TuxNavBar OR() {
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.p15) : null;
            this.LL = (TuxNavBar) viewFindViewById;
        }
        return (TuxNavBar) viewFindViewById;
    }

    public final RecyclerView PR() {
        View viewFindViewById = this.LLIZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.t0q) : null;
            this.LLIZ = (RecyclerView) viewFindViewById;
        }
        return (RecyclerView) viewFindViewById;
    }

    public final C1749260vca RR() {
        View viewFindViewById = this.LLILLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.u78) : null;
            this.LLILLL = (C1749260vca) viewFindViewById;
        }
        return (C1749260vca) viewFindViewById;
    }

    public final RecyclerView SR() {
        View viewFindViewById = this.LLILZLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.ue4) : null;
            this.LLILZLL = (RecyclerView) viewFindViewById;
        }
        return (RecyclerView) viewFindViewById;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLILZIL = null;
        this.LLILZLL = null;
        this.LLIZ = null;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        Window window;
        View decorView;
        View rootView;
        C19EG activity = getActivity();
        if (activity == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null || (rootView = decorView.getRootView()) == null) {
            return;
        }
        Rect rect = new Rect();
        rootView.getWindowVisibleDisplayFrame(rect);
        int height = rootView.getHeight() - rect.bottom;
        if (height > 0) {
            this.LLJI = height;
            C786410Ut5.C3(rootView.getViewTreeObserver(), this);
        }
    }

    public final void UR(IMContact iMContact) {
        C09OD value;
        List<MediaModel> list;
        InterfaceC20688515xT interfaceC20688515xT;
        LiveData<C09OD> liveData = this.LLIZLLLIL;
        if (liveData != null && (value = liveData.getValue()) != null && (list = value.LIZIZ) != null) {
            InterfaceC1670800ta2 activity = getActivity();
            if ((activity instanceof InterfaceC20688515xT) && (interfaceC20688515xT = (InterfaceC20688515xT) activity) != null) {
                interfaceC20688515xT.LLILIL(iMContact, list, this.LLJJI);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        IMSharePanelApi.LIZ.getClass();
        InterfaceC1368700lim interfaceC1368700limLJJJJIZL = C1599690rjL.LIZ().getShareService().LJJJJIZL();
        this.LLJILJIL = interfaceC1368700limLJJJJIZL;
        InterfaceC20688615xU interfaceC20688615xU = null;
        if (interfaceC1368700limLJJJJIZL == null) {
            interfaceC1368700limLJJJJIZL = null;
        }
        interfaceC1368700limLJJJJIZL.LJL();
        InterfaceC20688615xU interfaceC20688615xU2 = this.LLJILJIL;
        if (interfaceC20688615xU2 == null) {
            interfaceC20688615xU2 = null;
        }
        interfaceC20688615xU2.LIZ().observe(this, new AObserverS210S0100000_6(this, 55));
        InterfaceC20688615xU interfaceC20688615xU3 = this.LLJILJIL;
        if (interfaceC20688615xU3 == null) {
            interfaceC20688615xU3 = null;
        }
        interfaceC20688615xU3.LIZJ().observe(this, new AObserverS233S0100000_31(this, 64));
        InterfaceC20688615xU interfaceC20688615xU4 = this.LLJILJIL;
        if (interfaceC20688615xU4 == null) {
            interfaceC20688615xU4 = null;
        }
        interfaceC20688615xU4.LIZLLL().observe(this, new AObserverS233S0100000_31(this, 65));
        InterfaceC20688615xU interfaceC20688615xU5 = this.LLJILJIL;
        if (interfaceC20688615xU5 != null) {
            interfaceC20688615xU = interfaceC20688615xU5;
        }
        interfaceC20688615xU.refresh();
    }

    public final void WR(String str, List list) {
        boolean z;
        if (list.isEmpty()) {
            C786410Ut5.LJZL(0, MR());
            C786410Ut5.LLIZLLLIL(SR(), 8);
            C786410Ut5.LLIZLLLIL(PR(), 8);
            ((TextView) MR().findViewById(R.id.hc4)).setText(getString(2131824835));
            ((TextView) MR().findViewById(R.id.hc0)).setText(getString(2131824834));
            return;
        }
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        C344280Dec c344280Dec = null;
        if (z) {
            C786410Ut5.LJZL(8, MR());
            C786410Ut5.LLIZLLLIL(SR(), 8);
            C786410Ut5.LLIZLLLIL(PR(), 0);
            C344280Dec c344280Dec2 = this.LLJILJILJ;
            if (c344280Dec2 != null) {
                c344280Dec = c344280Dec2;
            }
            c344280Dec.LLILLJJLI = list;
            c344280Dec.LLILLL = str;
            c344280Dec.notifyDataSetChanged();
            return;
        }
        C786410Ut5.LJZL(8, MR());
        C786410Ut5.LLIZLLLIL(SR(), 0);
        C786410Ut5.LLIZLLLIL(PR(), 8);
        C344280Dec c344280Dec3 = this.LLJILLL;
        if (c344280Dec3 != null) {
            c344280Dec = c344280Dec3;
        }
        c344280Dec.LLILLJJLI = list;
        c344280Dec.LLILLL = str;
        c344280Dec.notifyDataSetChanged();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C19EG activity;
        Window window;
        View decorView;
        View rootView;
        TextView textView;
        int iIntValue;
        Integer numLIZJ;
        super.onViewCreated(view, bundle);
        C786410Ut5.LLLLZLLLI(OR(), 0);
        TuxNavBar tuxNavBarOR = OR();
        if (tuxNavBarOR != null) {
            C0OM1 c0om1 = new C0OM1();
            C1251150ifB c1251150ifB = new C1251150ifB();
            c1251150ifB.LIZLLL();
            c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
            c1251150ifB.LIZJ(new AwS575S0100000_31(this, 1014));
            c0om1.LIZIZ(c1251150ifB);
            c0om1.LIZLLL = false;
            tuxNavBarOR.setNavActions(c0om1);
            Context context = getContext();
            if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a1b, context)) != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = 0;
            }
            tuxNavBarOR.setNavBackground(iIntValue);
        }
        TuxNavBar tuxNavBarOR2 = OR();
        View viewFindViewById = null;
        if (tuxNavBarOR2 != null && (textView = (TextView) tuxNavBarOR2.findViewById(R.id.p1i)) != null) {
            textView.setText(getString(2131835798));
        }
        View viewFindViewById2 = this.LLILLJJLI;
        if (viewFindViewById2 == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById2 = view2.findViewById(R.id.eqx);
            } else {
                viewFindViewById2 = null;
            }
            this.LLILLJJLI = (LinearLayout) viewFindViewById2;
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById2.findViewById(R.id.t0q);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 1));
        C344280Dec c344280Dec = new C344280Dec(new C20688315xR(this));
        recyclerView.setAdapter(c344280Dec);
        this.LLJILJILJ = c344280Dec;
        View view3 = this.LLILLJJLI;
        if (view3 == null) {
            View view4 = getView();
            if (view4 != null) {
                viewFindViewById = view4.findViewById(R.id.eqx);
            }
            this.LLILLJJLI = (LinearLayout) viewFindViewById;
            view3 = viewFindViewById;
        }
        RecyclerView recyclerView2 = (RecyclerView) view3.findViewById(R.id.ue4);
        recyclerView2.setLayoutManager(new GridLayoutManager(getContext(), 1));
        C344280Dec c344280Dec2 = new C344280Dec(new C20688415xS(this));
        recyclerView2.setAdapter(c344280Dec2);
        this.LLJILLL = c344280Dec2;
        RR().setInnerStartIconColorAttr(R.attr.a1k);
        RR().getEditTextView().addTextChangedListener(new C16HQ(this, 9));
        C1749260vca c1749260vcaRR = RR();
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.uk);
        Drawable drawableLIZ = c384050F3z.LIZ(c1749260vcaRR.getContext());
        if (c1749260vcaRR.getChildCount() > 0) {
            c1749260vcaRR.getChildAt(0).setBackground(drawableLIZ);
        }
        if (this.LLJI <= 0 && (activity = getActivity()) != null && (window = activity.getWindow()) != null && (decorView = window.getDecorView()) != null && (rootView = decorView.getRootView()) != null) {
            C786410Ut5.x3(rootView.getViewTreeObserver(), this);
        }
        KeyboardUtils.LIZ(getViewLifecycleOwner(), RR(), new InterfaceC1242460iRA() { // from class: X.15xQ
            @Override // X.InterfaceC1242460iRA
            public final void onHide() {
                SystemShareFragment systemShareFragment = this.LL;
                if (systemShareFragment.LLJ) {
                    systemShareFragment.LLJ = false;
                    systemShareFragment.VR();
                }
                this.LL.LLJJI = "share_panel";
            }

            @Override // X.InterfaceC1242460iRA
            public final void onShow() {
                SystemShareFragment systemShareFragment = this.LL;
                if (!systemShareFragment.LLJ) {
                    systemShareFragment.LLJ = true;
                    systemShareFragment.VR();
                    C20684815ws.LJIILLIIL("system_share_search_click", new C2344009Gk().LIZ);
                }
                this.LL.LLJJI = "search";
            }
        });
        LiveData<C09OD> liveData = this.LLIZLLLIL;
        if (liveData != null) {
            liveData.observe(this, new AObserverS210S0100000_6(this, 56));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.c9t, viewGroup, false);
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
