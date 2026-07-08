package com.ss.android.ugc.aweme.choosemusic.fragment;

import X.AbstractC683510QrV;
import X.C01GW;
import X.C0P6P;
import X.C0RD4;
import X.C15GO;
import X.C15GR;
import X.C15GU;
import X.C15H0;
import X.C15HO;
import X.C15IK;
import X.C1911780zqi;
import X.C19EG;
import X.C20325814g4;
import X.C20448614zs;
import X.C20449014zw;
import X.C204594153w;
import X.C204665156p;
import X.C20491015Ga;
import X.C20491215Gc;
import X.C20493415Gy;
import X.C20494715Hl;
import X.C20496415Ic;
import X.C452501pT;
import X.C629710Omv;
import X.C7740030o;
import X.C786410Ut5;
import X.EnumC20491915Gj;
import X.InterfaceC1258040iqI;
import X.InterfaceC20492315Gn;
import android.util.Pair;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.choosemusic.api.ChooseMusicApi;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.AwS575S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class ForYouMusicFragment extends BaseMusicListFragment<C20448614zs> implements C15GU<C20448614zs>, C0P6P, InterfaceC1258040iqI {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYkJiAgLSg5HELIOSOiYwZiM+KCg+LSs4Zwk8OhwjPAImOywvDz0yLygpJzs=";
    public C15H0 LLJJIII;
    public final C01GW LLJJIJI = C452501pT.LIZIZ(new AwS575S0100000_31(this, 334));
    public final C204665156p LLJJIJIIJIL = new C204665156p();

    @Override // X.InterfaceC20492515Gp
    public final String LJLI() {
        return "for_you_tab_list_data";
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
        return "for_you_tab_list_load_more_status";
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
        return 14;
    }

    @Override // X.C15GU
    public final void refreshData() {
    }

    @Override // X.InterfaceC20492515Gp
    public final String vu() {
        return "for_you_tab_list_refresh_status";
    }

    @Override // X.C0P6P
    public final void LJJIFFI() {
        DataCenter dataCenter;
        String strLJIILL;
        if (this.LLILZIL == null || (dataCenter = this.LLILZLL) == null) {
            return;
        }
        C20449014zw c20449014zw = (C20449014zw) dataCenter.get("for_you_tab_list_data");
        InterfaceC20492315Gn<T> interfaceC20492315Gn = this.LLIZLLLIL;
        if ((interfaceC20492315Gn instanceof C15GR) && ((C15GR) interfaceC20492315Gn).LJIIJJI) {
            if (interfaceC20492315Gn != 0) {
                interfaceC20492315Gn.showLoadMoreLoading();
            }
            if (c20449014zw != null) {
                C204594153w c204594153w = this.LLILZIL;
                int iIntValue = ((Number) c20449014zw.LIZ("list_cursor")).intValue();
                int i = this.LLJ;
                boolean z = this.LLJJ;
                Map<String, Object> map = this.LLJI;
                c204594153w.getClass();
                String strLIZ = C20325814g4.LIZ();
                Integer num = C1911780zqi.LIZJ(z) ? 24 : null;
                C20496415Ic.LIZ.getClass();
                try {
                    strLJIILL = C7740030o.LIZ().getGson().LJIILL(C20496415Ic.LIZIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    strLJIILL = "";
                }
                c204594153w.LIZIZ(ChooseMusicApi.LJI(Integer.valueOf(iIntValue), num, null, false, i, strLIZ, strLJIILL, c204594153w.LJFF(i, map)), null, true, null, true, z);
            }
        }
    }

    @Override // X.InterfaceC1258040iqI
    public final View LJJLIIIJILLIZJL() {
        Object obj = this.LLIZLLLIL;
        if (obj == null) {
            return null;
        }
        return ((C15GR) obj).LIZIZ;
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
    public final void LJIJ() {
        C19EG activity = getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment, X.InterfaceC20492515Gp
    public final DataCenter bm() {
        DataCenter dataCenterBm = super.bm();
        this.LLILZLL = dataCenterBm;
        dataCenterBm.yQ2("data_challenge", this, false);
        dataCenterBm.yQ2("data_sticker", this, false);
        return this.LLILZLL;
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment
    public final InterfaceC20492315Gn<C20448614zs> MR(View view) {
        C20494715Hl c20494715Hl;
        C20491015Ga c20491015Ga = new C20491015Ga(getContext(), view, this, 2131838159, this, this, this.LLJJI, EnumC20491915Gj.FOR_YOU_PAGE, this.LLJILLL);
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
        C15HO c15ho = new C15HO("change_music_page", "recommend", "", C15IK.LIZ);
        c15ho.LJIILIIL = "recommend";
        c15ho.LIZIZ("recommend_mc_id");
        if (getParentFragment() instanceof NewMusicTabFragment) {
            c15ho.LJIILLIIL = "song_selection_page";
        }
        c20491015Ga.LJIIIZ(c15ho);
        c20491015Ga.LJIIIIZZ((C20493415Gy) this.LLJJIJI.getValue());
        c20491015Ga.LIZLLL(new C15GO() { // from class: X.15Gf
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
        DataCenter dataCenter = this.LLILZLL;
        if (dataCenter != null) {
            boolean zBooleanValue = ((Boolean) dataCenter.get("key_show_lyric_tag")).booleanValue();
            c20491015Ga.LJJI = zBooleanValue;
            AbstractC683510QrV abstractC683510QrV5 = c20491015Ga.LJFF;
            if (abstractC683510QrV5 instanceof C20494715Hl) {
                ((C20494715Hl) abstractC683510QrV5).LLJJJJLIIL = zBooleanValue;
            }
        }
        AbstractC683510QrV abstractC683510QrV6 = c20491015Ga.LJFF;
        if ((abstractC683510QrV6 instanceof C20494715Hl) && (c20494715Hl = (C20494715Hl) abstractC683510QrV6) != null) {
            C204665156p c204665156p = this.LLJJIJIIJIL;
            RecyclerView recyclerView = c20491015Ga.LIZIZ;
            AwS575S0100000_31 awS575S0100000_31 = new AwS575S0100000_31(this, 333);
            c204665156p.LIZIZ = recyclerView;
            c204665156p.LIZJ = c20494715Hl;
            c204665156p.LIZLLL = awS575S0100000_31;
            recyclerView.addOnChildAttachStateChangeListener(c204665156p.LJ);
            c204665156p.LIZLLL();
        }
        AbstractC683510QrV abstractC683510QrV7 = c20491015Ga.LJFF;
        if (abstractC683510QrV7 instanceof C20494715Hl) {
            ((C20494715Hl) abstractC683510QrV7).LLJI = true;
        }
        return c20491015Ga;
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment
    /* JADX INFO: renamed from: RR */
    public final void onChanged(C0RD4 c0rd4) {
        String str;
        String str2;
        super.onChanged(c0rd4);
        if (isViewValid() && c0rd4 != null && (str = c0rd4.LIZ) != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != 1730565544) {
                if (iHashCode == 2085247502) {
                    str2 = "data_challenge";
                } else {
                    return;
                }
            } else {
                str2 = "data_sticker";
            }
            str.equals(str2);
        }
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment, androidx.lifecycle.Observer
    public final /* bridge */ /* synthetic */ void onChanged(C0RD4 c0rd4) {
        onChanged(c0rd4);
    }

    @Override // X.C15GU
    public final /* bridge */ /* synthetic */ void P0(Object obj) {
    }
}
