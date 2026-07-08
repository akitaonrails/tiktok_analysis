package com.ss.android.ugc.feed.platform.panel.refreshpanel;

import X.AbstractC1616220sA0;
import X.C01GW;
import X.C036E;
import X.C04U7;
import X.C0O0L;
import X.C0XF1;
import X.C1255920ims;
import X.C1257170iot;
import X.C12ES;
import X.C1389890mGx;
import X.C1440005kM;
import X.C1559760qgw;
import X.C1566140qrE;
import X.C1581870rGb;
import X.C1581900rGe;
import X.C1581940rGi;
import X.C1581950rGj;
import X.C19EG;
import X.C2188811AlT;
import X.C299750Boz;
import X.C452501pT;
import X.C630740Ooa;
import X.C739830T0j;
import X.EnumC1609900rzo;
import X.EnumC452301pR;
import X.InterfaceC1554640qYg;
import X.InterfaceC1565950qqv;
import X.InterfaceC1581890rGd;
import X.InterfaceC1581910rGf;
import X.InterfaceC1581920rGg;
import X.InterfaceC494301wD;
import X.InterfaceC743730TFj;
import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.crash.Npth;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.ui.FeedFragment;
import com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent;
import com.ss.android.ugc.feed.platform.panel.presenter.IFeedFetchDataAbility;
import com.ss.android.ugc.feed.platform.panel.refreshpanel.RefreshPanelComponent;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class RefreshPanelComponent extends BasePanelUIComponent implements IRefreshAbility, InterfaceC743730TFj, InterfaceC1554640qYg {
    public static final /* synthetic */ int LLJJIII = 0;
    public InterfaceC1581890rGd LLJILJIL;
    public C1581870rGb LLJILJILJ;
    public final C01GW LLJJI;
    public final C1581900rGe LLJIJIL = new C1581900rGe("RefreshPanelComponent");
    public final CopyOnWriteArrayList<InterfaceC1581920rGg> LLJILLL = new CopyOnWriteArrayList<>();
    public final CopyOnWriteArrayList<InterfaceC1581910rGf> LLJJ = new CopyOnWriteArrayList<>();

    @Override // X.InterfaceC743730TFj
    public final void Bg(Activity activity, Fragment fragment) {
    }

    @Override // X.InterfaceC743730TFj
    public final void L() {
    }

    @Override // X.InterfaceC743730TFj
    public final void LLLZIL() {
    }

    @Override // X.InterfaceC743730TFj
    public final void M() {
    }

    @Override // X.InterfaceC743730TFj
    public final void M1(Configuration configuration) {
    }

    @Override // X.InterfaceC743730TFj
    public final void Mf(Bundle bundle) {
    }

    @Override // X.InterfaceC743730TFj
    public final void Re(Bundle bundle) {
    }

    @Override // X.InterfaceC743730TFj
    public final void Tg() {
    }

    @Override // X.InterfaceC743730TFj
    public final void cq() {
    }

    @Override // X.InterfaceC743730TFj
    public final void dd() {
    }

    @Override // X.InterfaceC743730TFj
    public final void fl() {
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent, X.InterfaceC1565950qqv
    public final void onPagePause(int i) {
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent, X.InterfaceC1565950qqv
    public final void onPageResume(int i) {
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -1860815867) {
            return null;
        }
        return this;
    }

    @Override // X.InterfaceC743730TFj
    public final void w4() {
    }

    @Override // com.bytedance.assem.arch.view.UIContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void xo() {
        try {
            C1581900rGe c1581900rGe = this.LLJIJIL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onCreateView ");
            sbLIZ.append(this);
            sbLIZ.append("  ");
            sbLIZ.append(getSupervisor().LLJJIII);
            c1581900rGe.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
            super.xo();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1581900rGe c1581900rGe2 = this.LLJIJIL;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onCreateView ");
            sbLIZ2.append(this);
            sbLIZ2.append(' ');
            sbLIZ2.append(th);
            c1581900rGe2.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ2));
            throw th;
        }
    }

    public RefreshPanelComponent() {
        C01GW c01gwLIZIZ;
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS568S0100000_24((InterfaceC1565950qqv) this, 1570), null);
            C1566140qrE.LIZJ(this, c630740Ooa);
            c01gwLIZIZ = c630740Ooa;
        } else {
            c01gwLIZIZ = C452501pT.LIZIZ(new C1559760qgw(false, this));
        }
        this.LLJJI = c01gwLIZIZ;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.refreshpanel.IRefreshAbility
    public final void B10() {
        Fragment fragment = getPanelContext().LJ;
        if (fragment instanceof FeedFragment) {
            setRefreshing(true);
            FeedFragment feedFragment = (FeedFragment) fragment;
            feedFragment.Oi(false);
            int i = feedFragment.LLILLL;
            if (i == 33 || i == 0) {
                C1440005kM.LIZ(new C739830T0j());
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.refreshpanel.IRefreshAbility
    public final boolean LJJIIJZLJL() {
        InterfaceC1581890rGd interfaceC1581890rGdGo;
        if (so() && (interfaceC1581890rGdGo = Go()) != null) {
            return interfaceC1581890rGdGo.LJJIIJZLJL();
        }
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C1581900rGe c1581900rGe = this.LLJIJIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onCreate ");
        sbLIZ.append(this);
        c1581900rGe.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final InterfaceC1581890rGd Go() {
        return this.LLJILJIL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Ho(View view) {
        InterfaceC1581890rGd interfaceC1581890rGd;
        if (!Intrinsics.LJFF(this.LLJILJIL, view)) {
            InterfaceC1581890rGd interfaceC1581890rGd2 = null;
            if ((view instanceof InterfaceC1581890rGd) && (interfaceC1581890rGd = (InterfaceC1581890rGd) view) != null) {
                this.LLJILJILJ = new C1581870rGb(interfaceC1581890rGd);
                interfaceC1581890rGd2 = interfaceC1581890rGd;
            }
            this.LLJILJIL = interfaceC1581890rGd2;
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.refreshpanel.IRefreshAbility
    public final void Ku0(InterfaceC1581920rGg interfaceC1581920rGg) {
        if (interfaceC1581920rGg != null && !this.LLJILLL.contains(interfaceC1581920rGg)) {
            this.LLJILLL.add(interfaceC1581920rGg);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.refreshpanel.IRefreshAbility
    public final boolean Oi(boolean z) {
        EnumC1609900rzo enumC1609900rzo;
        boolean z2;
        C1255920ims<?> c1255920imsKB1;
        Fragment fragment = getPanelContext().LJ;
        boolean zLJIIL = false;
        if (fragment == null || !(fragment instanceof FeedFragment) || this.LLJILJIL == null) {
            return false;
        }
        EnumC1609900rzo enumC1609900rzo2 = EnumC1609900rzo.DEFAULT;
        if (Intrinsics.LJFF("Following", getPanelContext().LIZ)) {
            enumC1609900rzo = EnumC1609900rzo.FOLLOW_FEED;
        } else if (Intrinsics.LJFF("For You", getPanelContext().LIZ)) {
            enumC1609900rzo = EnumC1609900rzo.RECOMMEND_FEED;
        } else if (Intrinsics.LJFF("Friends", getPanelContext().LIZ)) {
            enumC1609900rzo = EnumC1609900rzo.TAB_FRIENDS;
        } else {
            enumC1609900rzo = enumC1609900rzo2;
        }
        C19EG activity = fragment.getActivity();
        if (C036E.LIZ.LIZJ == C0O0L.NOT_AVAILABLE) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (activity != null && z2) {
            if (enumC1609900rzo != enumC1609900rzo2) {
                C1257170iot.LIZ(activity, enumC1609900rzo, null, null);
            } else if (C0XF1.LIZIZ(activity)) {
                C1389890mGx c1389890mGx = new C1389890mGx(activity);
                c1389890mGx.LJIIJ(activity.getString(2131829441));
                c1389890mGx.LJIIJJI();
            } else {
                C1389890mGx c1389890mGx2 = new C1389890mGx(activity);
                c1389890mGx2.LJIIIZ(2131837962);
                c1389890mGx2.LJIIJJI();
            }
            setRefreshing(false);
            if (Intrinsics.LJFF("Friends", getPanelContext().LIZ)) {
                C1440005kM.LIZ(new C1581940rGi("FRIENDS_FEED"));
                return false;
            }
            C1440005kM.LIZ(new C1581940rGi());
            return false;
        }
        IFeedFetchDataAbility iFeedFetchDataAbility = (IFeedFetchDataAbility) this.LLJJI.getValue();
        if (iFeedFetchDataAbility != null && (c1255920imsKB1 = iFeedFetchDataAbility.KB1()) != null) {
            zLJIIL = c1255920imsKB1.LJIIL();
        }
        return !zLJIIL;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        AbstractC1616220sA0 abstractC1616220sA0;
        View view2;
        super.onViewCreated(view);
        Ho(LJJIJL());
        int iLIZJ = (int) C12ES.LIZJ(49.0f, LJJIJL().getContext());
        int iLIZJ2 = (int) C12ES.LIZJ(113.0f, LJJIJL().getContext());
        C1581870rGb c1581870rGb = this.LLJILJILJ;
        if (c1581870rGb != null) {
            c1581870rGb.LJJIIZ(iLIZJ, iLIZJ2);
        }
        Fragment fragment = getPanelContext().LJ;
        if (fragment != null && (view2 = fragment.getView()) != null) {
            abstractC1616220sA0 = (AbstractC1616220sA0) view2.findViewById(R.id.viewpager);
        } else {
            abstractC1616220sA0 = null;
        }
        C1581900rGe c1581900rGe = this.LLJIJIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("find viewpager ");
        sbLIZ.append(abstractC1616220sA0);
        sbLIZ.append("  ");
        sbLIZ.append(this);
        c1581900rGe.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
        if (abstractC1616220sA0 != null) {
            C1581900rGe c1581900rGe2 = this.LLJIJIL;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("setViewPager ");
            sbLIZ2.append(abstractC1616220sA0);
            c1581900rGe2.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ2));
            InterfaceC1581890rGd interfaceC1581890rGd = this.LLJILJIL;
            if (interfaceC1581890rGd != null) {
                interfaceC1581890rGd.setViewPager(abstractC1616220sA0);
            }
        }
        if (((Boolean) C04U7.LIZ.getValue()).booleanValue() && (abstractC1616220sA0 == null || this.LLJILJIL == null)) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("RefreshPanelComponent viewPager is ");
            sbLIZ3.append(abstractC1616220sA0);
            sbLIZ3.append(", swipeRefreshLayout is ");
            sbLIZ3.append(this.LLJILJIL);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
            Npth.reportBizException("RefreshPanelComponent", new Throwable(strLIZIZ), strLIZIZ, (Map<String, String>) new HashMap(), true);
        }
        InterfaceC1581890rGd interfaceC1581890rGd2 = this.LLJILJIL;
        if (interfaceC1581890rGd2 != null) {
            interfaceC1581890rGd2.setOnRefreshListener(new InterfaceC1581920rGg() { // from class: X.0qyW
                @Override // X.InterfaceC1581920rGg
                public final void LJFF() {
                    FeedFragment feedFragment;
                    RefreshPanelComponent refreshPanelComponent = this.LL;
                    if (C0T1R.LIZIZ(refreshPanelComponent.getPanelContext().LIZ(), refreshPanelComponent.getPanelContext().LJ) == 1) {
                        C128Y c128y = refreshPanelComponent.getPanelContext().LJ;
                        if (c128y instanceof InterfaceC1566480qrm) {
                            ((InterfaceC1566480qrm) c128y).Xo(EnumC1581350rFl.PULL_DOWN_REFRESH);
                        } else if (c128y instanceof InterfaceC1587410rPX) {
                            ((InterfaceC1587410rPX) c128y).xK("slide_down", false);
                        } else if (c128y instanceof InterfaceC1570670qyX) {
                            ((InterfaceC1570670qyX) c128y).Bl("pull_refresh", "slide_down", false);
                        } else {
                            Fragment fragment2 = refreshPanelComponent.getPanelContext().LJ;
                            if ((fragment2 instanceof FeedFragment) && (feedFragment = (FeedFragment) fragment2) != null) {
                                feedFragment.Oi(false);
                            }
                        }
                        C1440005kM.LIZ(new C1564680qos(0));
                    }
                    Iterator<InterfaceC1581920rGg> it2 = this.LL.LLJILLL.iterator();
                    while (it2.hasNext()) {
                        it2.next().LJFF();
                    }
                }
            });
        }
        InterfaceC1581890rGd interfaceC1581890rGd3 = this.LLJILJIL;
        if (interfaceC1581890rGd3 != null) {
            interfaceC1581890rGd3.setOnVisibleListener(new InterfaceC1581910rGf() { // from class: X.0rGa
                @Override // X.InterfaceC1581910rGf
                public final void onInvisible() {
                    Iterator<InterfaceC1581910rGf> it2 = this.LIZ.LLJJ.iterator();
                    while (it2.hasNext()) {
                        it2.next().onInvisible();
                    }
                }

                @Override // X.InterfaceC1581910rGf
                public final void onVisible() {
                    Iterator<InterfaceC1581910rGf> it2 = this.LIZ.LLJJ.iterator();
                    while (it2.hasNext()) {
                        it2.next().onVisible();
                    }
                }
            });
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.refreshpanel.IRefreshAbility
    public final void rJ2(C1581950rGj c1581950rGj) {
        if (c1581950rGj != null) {
            this.LLJILLL.remove(c1581950rGj);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.refreshpanel.IRefreshAbility
    public final void setCanTouch(boolean z) {
        InterfaceC1581890rGd interfaceC1581890rGd = this.LLJILJIL;
        if (interfaceC1581890rGd != null) {
            interfaceC1581890rGd.setCanTouch(z);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.refreshpanel.IRefreshAbility
    public final void setEnabled(boolean z) {
        InterfaceC1581890rGd interfaceC1581890rGdGo = Go();
        if (interfaceC1581890rGdGo != null) {
            interfaceC1581890rGdGo.setEnabled(z);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.refreshpanel.IRefreshAbility
    public final void setRefreshing(boolean z) {
        C1581870rGb c1581870rGb = this.LLJILJILJ;
        if (c1581870rGb != null) {
            c1581870rGb.setRefreshing(z);
        }
    }

    @Override // X.InterfaceC743730TFj
    public final void LLZLLLL(View view, Bundle bundle) {
        View viewFindViewById;
        if (view != null) {
            viewFindViewById = view.findViewById(R.id.t25);
        } else {
            viewFindViewById = null;
        }
        Ho(viewFindViewById);
    }
}
