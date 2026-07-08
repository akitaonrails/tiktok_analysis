package com.ss.android.ugc.aweme.series.feed.seriescenter;

import X.C01GW;
import X.C098200Yq;
import X.C0QSJ;
import X.C0TVI;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1264160j0A;
import X.C1308910kAL;
import X.C14K9;
import X.C1577610r9j;
import X.C1578690rBT;
import X.C1685300txQ;
import X.C1749280vcc;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20097313kJ;
import X.C20673215v0;
import X.C296910BkP;
import X.C418440Gaw;
import X.C452501pT;
import X.C497820Jfg;
import X.C673150Qan;
import X.C687700QyG;
import X.C786410Ut5;
import X.C814420VxA;
import X.C960203pA;
import X.EnumC1573550r3B;
import X.EnumC1609900rzo;
import X.InterfaceC1146704e9;
import X.InterfaceC1158780gGC;
import X.InterfaceC1572860r24;
import X.InterfaceC1577580r9g;
import X.InterfaceC1577740r9w;
import X.InterfaceC1577950rAH;
import X.InterfaceC1578680rBS;
import X.InterfaceC665370Q7z;
import X.InterfaceC687730QyJ;
import X.InterfaceC737790Swr;
import X.InterfaceC836760Ws6;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.minidrama.common.component.topfeed.common.model.SkylightBlockInfo;
import com.ss.android.ugc.aweme.minidrama.common.component.topfeed.common.model.SkylightBlocks;
import com.ss.android.ugc.aweme.minidrama.tab.v2.DramaTopTabMainFragmentScope;
import com.ss.android.ugc.aweme.series.feed.api.SeriesCenterListResponse;
import com.ss.android.ugc.aweme.series.feed.model.SeriesCenterCenterScene;
import com.ss.android.ugc.aweme.series.feed.model.SeriesCenterSceneEnum;
import com.ss.android.ugc.aweme.series.feed.tab.v2.DramaPicksFragment;
import com.ss.android.ugc.aweme.util.MiniDramaPagePerformanceMonitor;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS603S0100000_24;
import org.json.JSONException;

/* JADX INFO: loaded from: classes25.dex */
@InterfaceC836760Ws6
public final class InnerFeedDiscoverSeriesCenterFragment extends BaseFragment implements InterfaceC1577950rAH, InterfaceC1578680rBS, InterfaceC737790Swr, C0QSJ, InterfaceC1146704e9 {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYpOyY2O2sqLCo3ZjYpOyY2OyHELIOSYpJzs2OmsFJyE2OgMpLCsXITYvJjk2OhYpOyY2OwYpJzs2OgM+KCg+LSs4";
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 948));
    public final C1578690rBT LLIZLLLIL = SR();
    public final InnerFeedDiscoverSeriesCenterFragment LLJ = this;
    public InterfaceC1577950rAH LLJI;
    public InterfaceC1577740r9w LLJIJIL;
    public InterfaceC1577580r9g LLJILJIL;

    @Override // X.InterfaceC1577950rAH
    public final InterfaceC1572860r24 Iu() {
        return null;
    }

    @Override // X.InterfaceC1577950rAH
    public final void JB() {
    }

    @Override // X.InterfaceC1577950rAH
    public final void KH() {
    }

    @Override // X.InterfaceC1578680rBS
    public final void SE(boolean z) {
    }

    @Override // X.InterfaceC1577950rAH
    public final void T6(AwS603S0100000_24 awS603S0100000_24) {
    }

    @Override // X.InterfaceC1577950rAH
    public final void Uw() {
    }

    @Override // X.InterfaceC1577950rAH
    public final void Xm(String str) {
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        if (cls == InterfaceC1577950rAH.class) {
            this.LLJI = (InterfaceC1577950rAH) obj;
        } else if (cls == InterfaceC1577740r9w.class) {
            this.LLJIJIL = (InterfaceC1577740r9w) obj;
        } else if (cls == InterfaceC1577580r9g.class) {
            this.LLJILJIL = (InterfaceC1577580r9g) obj;
        }
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{DramaTopTabMainFragmentScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        if (cls == InterfaceC1577950rAH.class) {
            return this.LLJI;
        }
        if (cls == InterfaceC1577740r9w.class) {
            return this.LLJIJIL;
        }
        if (cls == InterfaceC1577580r9g.class) {
            return this.LLJILJIL;
        }
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(DramaTopTabMainFragmentScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(DramaTopTabMainFragmentScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC1577950rAH
    public final String mr() {
        return "";
    }

    @Override // X.InterfaceC1578680rBS
    public final InterfaceC1577950rAH n9() {
        return this;
    }

    @Override // X.InterfaceC1577950rAH
    public final void q9() {
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        if (cls == InterfaceC1577950rAH.class) {
            this.LLJI = null;
        } else if (cls == InterfaceC1577740r9w.class) {
            this.LLJIJIL = null;
        } else if (cls == InterfaceC1577580r9g.class) {
            this.LLJILJIL = null;
        }
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.InterfaceC1577950rAH
    public final boolean xf() {
        return true;
    }

    @Override // X.InterfaceC1577950rAH
    public final void yw() {
    }

    @Override // X.InterfaceC1577950rAH
    public final boolean zA() {
        return false;
    }

    @Override // X.InterfaceC1578680rBS
    public final float JO() {
        return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44)) + (getContext() != null ? C497820Jfg.LIZJ(r0) : 0);
    }

    @Override // X.InterfaceC1578680rBS
    public final DramaPicksFragment Li() {
        C1577610r9j c1577610r9j = DramaPicksFragment.LLJJIJI;
        Bundle bundle = new Bundle();
        Bundle arguments = getArguments();
        C786410Ut5.LJJJI("enter_from", arguments != null ? arguments.getString("enter_from") : null, bundle);
        c1577610r9j.getClass();
        Bundle bundle2 = new Bundle();
        C786410Ut5.LJJIIJZLJL(bundle2, bundle);
        DramaPicksFragment dramaPicksFragment = new DramaPicksFragment();
        dramaPicksFragment.setArguments(bundle2);
        return dramaPicksFragment;
    }

    public final C1578690rBT SR() {
        return (C1578690rBT) this.LLIZ.getValue();
    }

    @Override // X.InterfaceC1578680rBS
    public final InterfaceC1158780gGC m4() {
        return new InterfaceC1158780gGC() { // from class: X.0r8B
            @Override // X.InterfaceC1158780gGC
            public final Object LIZ() {
                Object c098200Yq;
                Object c1577560r9e;
                try {
                    SeriesCenterSceneEnum seriesCenterSceneEnum = C296910BkP.LIZ() ? SeriesCenterSceneEnum.MAIN : SeriesCenterSceneEnum.TREND;
                    String strValueOf = String.valueOf(seriesCenterSceneEnum.getValue());
                    Boolean bool = Boolean.TRUE;
                    SeriesCenterListResponse seriesCenterListResponse = (SeriesCenterListResponse) C1576960r8g.LIZ(seriesCenterSceneEnum, "", strValueOf, null, bool, bool, 24).LIZLLL();
                    SkylightBlocks skylightBlocks = seriesCenterListResponse.skylightBlocks;
                    List<SkylightBlockInfo> list = skylightBlocks != null ? skylightBlocks.blocks : null;
                    if (list == null || list.isEmpty()) {
                        c1577560r9e = new C098200Yq(new IllegalStateException("retry"));
                        C189200o6.m2constructorimpl(c1577560r9e);
                    } else {
                        C1574080r42.LIZIZ = seriesCenterListResponse;
                        c1577560r9e = new C1577560r9e(seriesCenterListResponse.skylightBlocks, new SeriesCenterCenterScene(seriesCenterSceneEnum, null, null, null), Boolean.FALSE);
                        C189200o6.m2constructorimpl(c1577560r9e);
                    }
                    c098200Yq = C189200o6.m1boximpl(c1577560r9e);
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                if (thM5exceptionOrNullimpl != null) {
                    C098200Yq c098200Yq2 = new C098200Yq(thM5exceptionOrNullimpl);
                    C189200o6.m2constructorimpl(c098200Yq2);
                    c098200Yq = C189200o6.m1boximpl(c098200Yq2);
                }
                return ((C189200o6) c098200Yq).m10unboximpl();
            }
        };
    }

    @Override // X.InterfaceC1577950rAH
    public final String d9() {
        String string;
        Bundle arguments = getArguments();
        return (arguments == null || (string = arguments.getString("enter_from")) == null) ? "" : string;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        SR().LJIJI();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        SR().getClass();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        SR().LJIJJ();
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C0QSJ c0qsjLIZIZ = C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{DramaTopTabMainFragmentScope.class});
        c0qsjLIZIZ.unbindAbility(this.LLJ, InterfaceC1577950rAH.class);
        c0qsjLIZIZ.unbindAbility(this.LLIZLLLIL, InterfaceC1577740r9w.class);
    }

    @Override // X.InterfaceC1578680rBS
    public final boolean dH(Context context) {
        if (context == null || C960203pA.LIZIZ(context)) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) throws JSONException {
        C687700QyG.LJI(this);
        super.onCreate(bundle);
        NR(AFwS264S0000000_24.get$arr$(292));
        MiniDramaPagePerformanceMonitor.LIZIZ(EnumC1573550r3B.TOP_TAB);
        SR();
        C1578690rBT.LJIJ(bundle);
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C0QSJ c0qsjLIZIZ = C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{DramaTopTabMainFragmentScope.class});
        c0qsjLIZIZ.bindAbility(this.LLJ, InterfaceC1577950rAH.class);
        c0qsjLIZIZ.bindAbility(this.LLIZLLLIL, InterfaceC1577740r9w.class);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        SR().LJIL(view, bundle);
    }

    @Override // X.InterfaceC1578680rBS
    public final C1749280vcc hG(Throwable th, boolean z, AwS568S0100000_24 awS568S0100000_24) {
        int i;
        Context context = getContext();
        if (context == null) {
            return null;
        }
        if (z) {
            i = R.style.z4;
        } else {
            i = R.style.zd;
        }
        C1749280vcc c1749280vcc = new C1749280vcc(new ContextThemeWrapper(context, i), null, 6);
        C1264160j0A.LIZ(c1749280vcc, EnumC1609900rzo.DEFAULT, th, new AwS568S0100000_24(awS568S0100000_24, 1821));
        return c1749280vcc;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Activity activity;
        View viewLIZLLL;
        int i;
        Context contextRequireContext = requireContext();
        FrameLayout frameLayout = new FrameLayout(contextRequireContext);
        Context context = SR().getContext();
        C19GS c19gs = null;
        if (context instanceof Activity) {
            activity = (Activity) context;
        } else {
            activity = null;
        }
        if (activity == null) {
            viewLIZLLL = null;
        } else {
            viewLIZLLL = C20673215v0.LIZLLL(R.layout.bo3, activity, frameLayout, false);
        }
        if (viewLIZLLL != null) {
            frameLayout.addView(viewLIZLLL, new FrameLayout.LayoutParams(-1, -1));
            final int paddingBottom = viewLIZLLL.getPaddingBottom();
            C14K9.LJIJJ(viewLIZLLL, new C0TVI() { // from class: X.0DRE
                @Override // X.C0TVI
                public final C20246014Ju onApplyWindowInsets(View view, C20246014Ju c20246014Ju) {
                    view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), paddingBottom + c20246014Ju.LIZ(130).LIZLLL);
                    return c20246014Ju;
                }
            });
            C20097313kJ.LIZJ(viewLIZLLL);
            TuxNavBar tuxNavBar = new TuxNavBar(contextRequireContext, null, 6);
            C1251150ifB c1251150ifB = new C1251150ifB();
            c1251150ifB.LIZLLL();
            c1251150ifB.LIZJ = R.raw.icon_chevron_left_ltr;
            c1251150ifB.LIZLLL = true;
            c1251150ifB.LIZJ(new AwS568S0100000_24(this, 949));
            tuxNavBar.LIZIZ(c1251150ifB);
            tuxNavBar.LJIIZILJ(false);
            C1250250idj c1250250idj = new C1250250idj();
            c1250250idj.LIZJ = tuxNavBar.getContext().getString(2131839423);
            tuxNavBar.LJIJJ(c1250250idj);
            if (C296910BkP.LIZ()) {
                i = R.attr.zp;
            } else {
                i = R.attr.bx;
            }
            Integer numLIZJ = C1308910kAL.LIZJ(i, contextRequireContext);
            if (numLIZJ != null) {
                tuxNavBar.setNavBackground(numLIZJ.intValue());
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44)), 48);
            layoutParams.topMargin = C497820Jfg.LIZJ(contextRequireContext);
            frameLayout.addView(tuxNavBar, layoutParams);
        }
        try {
            ViewTreeLifecycleOwner.set(frameLayout, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(frameLayout, this);
            frameLayout.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity2 = getActivity();
            if (activity2 instanceof C19GS) {
                c19gs = (C19GS) activity2;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return frameLayout;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return frameLayout;
        }
    }
}
