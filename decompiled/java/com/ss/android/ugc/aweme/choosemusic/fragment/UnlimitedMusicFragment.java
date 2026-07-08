package com.ss.android.ugc.aweme.choosemusic.fragment;

import X.AbstractC683510QrV;
import X.C01GW;
import X.C0P6P;
import X.C0PEM;
import X.C1411810mqJ;
import X.C1466090oFr;
import X.C15GO;
import X.C15GR;
import X.C15GU;
import X.C15H0;
import X.C15HO;
import X.C15HP;
import X.C15IK;
import X.C19EG;
import X.C20320214fA;
import X.C20438014yA;
import X.C20448514zr;
import X.C20448614zs;
import X.C20449014zw;
import X.C204665156p;
import X.C20491015Ga;
import X.C20491215Gc;
import X.C20494715Hl;
import X.C2296808zG;
import X.C23250099c;
import X.C452501pT;
import X.C629710Omv;
import X.C786410Ut5;
import X.EnumC20491915Gj;
import X.InterfaceC1258040iqI;
import X.InterfaceC20492315Gn;
import android.util.Pair;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class UnlimitedMusicFragment extends BaseMusicListFragment<C20448614zs> implements C15GU<C20448614zs>, C0P6P, InterfaceC1258040iqI {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYkJiAgLSg5OiHELIOSYwZiM+KCg+LSs4Zxo9JCwhIDs2LAg5OiYwDjctLiI2JjE=";
    public C15H0 LLJJIII;
    public final C01GW LLJJIJI = C452501pT.LIZIZ(new AwS575S0100000_31(this, 338));
    public final C204665156p LLJJIJIIJIL = new C204665156p();
    public C20320214fA LLJJIJIL;

    @Override // X.InterfaceC20492515Gp
    public final String LJLI() {
        return "unlimited_music_tab_list_data";
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment
    public final String OR() {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment
    public final boolean PR() {
        return false;
    }

    @Override // X.InterfaceC20492515Gp
    public final String R3() {
        return "unlimited_music_tab_list_load_more_status";
    }

    @Override // X.C15GU
    public final void b1() {
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment
    public final int getLayoutId() {
        return R.layout.c98;
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment
    public final int getPageType() {
        return 23;
    }

    @Override // X.InterfaceC20492515Gp
    public final String vu() {
        return "unlimited_music_tab_list_refresh_status";
    }

    @Override // X.C0P6P
    public final void LJJIFFI() {
        DataCenter dataCenter;
        C20320214fA c20320214fA;
        if (this.LLILZIL == null || (dataCenter = this.LLILZLL) == null) {
            return;
        }
        C20449014zw c20449014zw = (C20449014zw) dataCenter.get("unlimited_music_tab_list_data");
        InterfaceC20492315Gn<T> interfaceC20492315Gn = this.LLIZLLLIL;
        if ((interfaceC20492315Gn instanceof C15GR) && ((C15GR) interfaceC20492315Gn).LJIIJJI) {
            if (interfaceC20492315Gn != 0) {
                interfaceC20492315Gn.showLoadMoreLoading();
            }
            if (c20449014zw == null || (c20320214fA = this.LLJJIJIL) == null) {
                return;
            }
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C20438014yA(((Number) c20449014zw.LIZ("list_cursor")).intValue() + 1, c20320214fA, null), 3);
        }
    }

    @Override // X.InterfaceC1258040iqI
    public final View LJJLIIIJILLIZJL() {
        C15GR c15gr;
        Object obj = this.LLIZLLLIL;
        if (obj == null || !(obj instanceof C15GR) || (c15gr = (C15GR) obj) == null) {
            return null;
        }
        return c15gr.LIZIZ;
    }

    public final boolean VR() {
        C15GR c15gr;
        RecyclerView recyclerView;
        Object obj = this.LLIZLLLIL;
        if (!(obj instanceof C20491015Ga) || (c15gr = (C15GR) obj) == null || (recyclerView = c15gr.LIZIZ) == null) {
            return true;
        }
        return recyclerView.isShown();
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.LLJJIJIIJIL.LIZ();
        super.onDestroyView();
    }

    @Override // X.C15GU
    public final void refreshData() {
        C20320214fA c20320214fA = this.LLJJIJIL;
        if (c20320214fA != null) {
            c20320214fA.LIZ();
        }
    }

    @Override // X.C15GU
    public final void LJIJ() {
        C19EG activity = getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment, X.InterfaceC20492515Gp
    public final void initData() {
        super.initData();
        C20320214fA c20320214fA = new C20320214fA(this.LLILZLL);
        this.LLJJIJIL = c20320214fA;
        c20320214fA.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment, X.InterfaceC20494515Hj
    public final /* bridge */ /* synthetic */ void LLIIL(C15HP c15hp) {
        LLIIL(c15hp);
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment
    public final InterfaceC20492315Gn<C20448614zs> MR(View view) {
        C20494715Hl c20494715Hl;
        C20491015Ga c20491015Ga = new C20491015Ga(getContext(), view, this, 2131838159, this, this, this.LLJJI, EnumC20491915Gj.UNLIMITED_PAGE, this.LLJILLL);
        C786410Ut5.LLLLZLLLI(c20491015Ga.LIZ, 8);
        c20491015Ga.LJII(this);
        c20491015Ga.LJIILIIL = C629710Omv.LIZ(this);
        c20491015Ga.LJIIJ(new Pair<>(Long.valueOf(this.LLJIJIL), Long.valueOf(this.LLJILJIL)));
        int i = this.LLJ;
        AbstractC683510QrV abstractC683510QrV = c20491015Ga.LJFF;
        if (abstractC683510QrV instanceof C20494715Hl) {
            ((C20494715Hl) abstractC683510QrV).LLJJ = i;
        }
        String str = (String) this.LLILZLL.get("sticker_id", null);
        AbstractC683510QrV abstractC683510QrV2 = c20491015Ga.LJFF;
        if (abstractC683510QrV2 instanceof C20494715Hl) {
            ((C20494715Hl) abstractC683510QrV2).LLJJI = str;
        }
        String str2 = (String) this.LLILZLL.get("challenge_id", null);
        AbstractC683510QrV abstractC683510QrV3 = c20491015Ga.LJFF;
        if (abstractC683510QrV3 instanceof C20494715Hl) {
            ((C20494715Hl) abstractC683510QrV3).LLJJIII = str2;
        }
        C15HO c15ho = new C15HO("change_music_page", "unlimited", "", C15IK.LIZ);
        c15ho.LJIILIIL = "unlimited";
        c15ho.LIZIZ("unlimited");
        if (getParentFragment() instanceof NewMusicTabFragment) {
            c15ho.LJIILLIIL = "song_selection_page";
        }
        c20491015Ga.LJIIIZ(c15ho);
        c20491015Ga.LJIIIIZZ((C15H0) this.LLJJIJI.getValue());
        c20491015Ga.LIZLLL(new C15GO() { // from class: X.15Gg
            @Override // X.C15GO
            public final void LIZ() {
                this.LIZ.LJJIFFI();
            }
        }, 5);
        C20491215Gc c20491215Gc = new C20491215Gc();
        c20491015Ga.LJJ = c20491215Gc;
        AbstractC683510QrV abstractC683510QrV4 = c20491015Ga.LJFF;
        if (abstractC683510QrV4 instanceof C20494715Hl) {
            ((C20494715Hl) abstractC683510QrV4).LLJJJJJIL = c20491215Gc;
        }
        if ((abstractC683510QrV4 instanceof C20494715Hl) && (c20494715Hl = (C20494715Hl) abstractC683510QrV4) != null) {
            C204665156p c204665156p = this.LLJJIJIIJIL;
            RecyclerView recyclerView = c20491015Ga.LIZIZ;
            AwS575S0100000_31 awS575S0100000_31 = new AwS575S0100000_31(this, 337);
            c204665156p.LIZIZ = recyclerView;
            c204665156p.LIZJ = c20494715Hl;
            c204665156p.LIZLLL = awS575S0100000_31;
            recyclerView.addOnChildAttachStateChangeListener(c204665156p.LJ);
            c204665156p.LIZLLL();
        }
        AbstractC683510QrV abstractC683510QrV5 = c20491015Ga.LJFF;
        if (abstractC683510QrV5 instanceof C20494715Hl) {
            ((C20494715Hl) abstractC683510QrV5).LLJI = true;
        }
        return c20491015Ga;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment
    /* JADX INFO: renamed from: SR */
    public final void LLIIL(C15HP c15hp) {
        C20320214fA c20320214fA;
        super.LLIIL(c15hp);
        if (Intrinsics.LJFF("close_unlimited_music_tips", c15hp.LIZIZ) && (c20320214fA = this.LLJJIJIL) != null) {
            C20449014zw c20449014zw = (C20449014zw) c20320214fA.LIZ.get("unlimited_music_tab_list_data");
            List<C20448614zs> listLIZ = C20448514zr.LIZ(c20449014zw);
            C1466090oFr.LJIILJJIL(listLIZ, AFwS276S0000000_31.get$arr$(356));
            C20449014zw c20449014zw2 = new C20449014zw();
            c20449014zw2.LIZ.put("list_data", (V) listLIZ);
            c20449014zw2.LIZ.put("unlimited_music_tab_list_refresh_status", (V) 0);
            c20449014zw2.LIZ.put("list_cursor", (V) c20449014zw.LIZ("list_cursor"));
            c20449014zw2.LIZ.put("list_hasmore", (V) c20449014zw.LIZ("list_hasmore"));
            c20449014zw2.LIZIZ("action_type", 1);
            c20320214fA.LIZ.zQ2(c20449014zw2, "unlimited_music_tab_list_data");
            C1411810mqJ.LIZ().storeBoolean("unlimited_music_tip_closed_manually", true);
        }
    }

    @Override // X.C15GU
    public final /* bridge */ /* synthetic */ void P0(Object obj) {
    }
}
