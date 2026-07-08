package com.ss.android.ugc.aweme.discover.adapter;

import X.C01GW;
import X.C1029590ctp;
import X.C10EU;
import X.C10ZJ;
import X.C117J;
import X.C1194770hCF;
import X.C11DI;
import X.C11ET;
import X.C13BV;
import X.C13LE;
import X.C13LP;
import X.C14KQ;
import X.C15O7;
import X.C1602160rnK;
import X.C1618300sDM;
import X.C1697810uHb;
import X.C19252910Tv;
import X.C19466811Ec;
import X.C19719912Dl;
import X.C20684815ws;
import X.C21595819fQ;
import X.C341940Daq;
import X.C444960Hcc;
import X.C452501pT;
import X.C497820Jfg;
import X.C786410Ut5;
import X.C794420VEi;
import X.InterfaceC469360Ias;
import Y.ACallableS9S1101000_29;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.discover.model.Banner;
import com.ss.android.ugc.aweme.discover.model.DiscoverSectionItem;
import com.ss.android.ugc.aweme.discover.ui.TrendsTabFragment;
import com.ss.android.ugc.aweme.discover.viewmodel.TrendsTabViewModel;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS270S0300000_26;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class DiscoverBannerViewHolder extends JediSimpleViewHolder<DiscoverSectionItem> implements C11DI, InterfaceC469360Ias, C117J {
    public static final List<Banner> LLJJJIL = C1697810uHb.LJIILJJIL(new Banner());
    public final TextView LLJI;
    public final ViewPager LLJIJIL;
    public final C1194770hCF LLJILJIL;
    public final View LLJILJILJ;
    public C11ET LLJILLL;
    public final C19466811Ec LLJJ;
    public List<? extends Banner> LLJJI;
    public final Context LLJJIII;
    public boolean LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C11DI LLJJIJIL;
    public int LLJJJ;

    @Override // X.InterfaceC469360Ias
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageScrolled(int i, float f, int i2) {
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onPause() {
        X5(false);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.C11DI
    public final void cQ() {
        this.LLJJIJIL.cQ();
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onResume() {
        withState((JediViewModel) this.LLJJIJIIJIL.getValue(), new AwS608S0100000_29(this, 81));
    }

    @Override // X.C117J
    public final void IB(boolean z) {
        this.LLJJIJI = z;
        if (z && getLifecycle().getCurrentState().compareTo(Lifecycle.State.STARTED) >= 0) {
            W5(this.LLJIJIL.getCurrentItem());
            X5(true);
        }
    }

    public final void W5(int i) {
        if (!this.LLJJI.isEmpty()) {
            List<? extends Banner> list = this.LLJJI;
            Banner banner = (Banner) ListProtector.get(list, i % list.size());
            int size = (i % this.LLJJI.size()) + 1;
            List<? extends Banner> list2 = this.LLJJI;
            C15O7.LIZIZ(new ACallableS9S1101000_29(size, banner, C10ZJ.LIZ(((Banner) ListProtector.get(list2, i % list2.size())).getSchema()), 1), C20684815ws.LJFF(), null);
            if (banner.isAd()) {
                C1029590ctp.LIZLLL().LJIIIIZZ(this.LLJJIII, banner, (i % this.LLJJI.size()) + 1);
                if (C10EU.LJIIIIZZ()) {
                    C794420VEi.LIZIZ("ftc_show_banner_ad", "", null);
                }
            }
        }
    }

    public final void X5(boolean z) {
        if (z) {
            this.LLJJ.LIZ();
            return;
        }
        C19466811Ec c19466811Ec = this.LLJJ;
        if (c19466811Ec.LLILZLL) {
            c19466811Ec.LLILZLL = false;
            c19466811Ec.LLIZ.removeCallbacksAndMessages(null);
        }
        this.LLJIJIL.setOnTouchListener(null);
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageSelected(int i) {
        withState((JediViewModel) this.LLJJIJIIJIL.getValue(), new AwS608S0100000_29(this, 80));
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void rr(DiscoverSectionItem discoverSectionItem) {
        int i;
        List<Banner> listLJLJJLL = ((DiscoverSectionItem.BannerSection) discoverSectionItem).bannerList;
        if (!Intrinsics.LJFF(listLJLJJLL, LLJJJIL)) {
            Context context = this.itemView.getContext();
            Pair pairLLJJIJIIJIL = C19252910Tv.LIZIZ.LIZLLL().LJII().LLJJIJIIJIL(listLJLJJLL.size(), listLJLJJLL.size() * 10000);
            int iIntValue = ((Number) pairLLJJIJIIJIL.getFirst()).intValue();
            int iIntValue2 = ((Number) pairLLJJIJIIJIL.getSecond()).intValue();
            if (this.LLJILLL == null) {
                this.LLJILLL = new C11ET(this, C786410Ut5.ne(context));
                this.LLJIJIL.setAdapter(new C21595819fQ(this.LLJILLL, iIntValue));
            }
            boolean zLIZJ = C444960Hcc.LIZJ(context);
            this.LLJJ.LLILLL = listLJLJJLL.size();
            C11ET c11et = this.LLJILLL;
            if (c11et.LLILZIL != listLJLJJLL) {
                c11et.LLILZIL = listLJLJJLL;
                c11et.notifyDataSetChanged();
            }
            this.LLJILJIL.setUpViewPager(this.LLJIJIL);
            C1194770hCF c1194770hCF = this.LLJILJIL;
            if (listLJLJJLL.size() < 2) {
                i = 8;
            } else {
                i = 0;
            }
            int visibility = c1194770hCF.getVisibility();
            c1194770hCF.setVisibility(i);
            C1602160rnK.LIZIZ(visibility, i, c1194770hCF);
            if (zLIZJ) {
                listLJLJJLL = C13LP.LJLJJLL(listLJLJJLL);
            }
            this.LLJJI = listLJLJJLL;
            if (zLIZJ) {
                iIntValue2--;
            }
            this.LLJIJIL.setCurrentItem(iIntValue2);
            this.LLJIJIL.setCurrentItem(iIntValue2);
            withState((JediViewModel) this.LLJJIJIIJIL.getValue(), new AwS608S0100000_29(this, 596));
        }
    }

    public DiscoverBannerViewHolder(TrendsTabFragment trendsTabFragment, View view) {
        super(view);
        this.LLJI = (TextView) view.findViewById(R.id.ziu);
        ViewPager viewPager = (ViewPager) view.findViewById(R.id.viewpager);
        this.LLJIJIL = viewPager;
        C1194770hCF c1194770hCF = (C1194770hCF) view.findViewById(R.id.g3k);
        this.LLJILJIL = c1194770hCF;
        View viewFindViewById = view.findViewById(R.id.w0u);
        this.LLJILJILJ = viewFindViewById;
        this.LLJJI = C13BV.INSTANCE;
        this.LLJJIII = view.getContext();
        this.LLJJIJI = true;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TrendsTabViewModel.class);
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS270S0300000_26(this, c19719912DlLIZ, c19719912DlLIZ, 119));
        this.LLJJIJIL = trendsTabFragment;
        C1618300sDM c1618300sDM = C1618300sDM.LIZ;
        Context context = this.LLJJIII;
        TextView textView = this.LLJI;
        ViewPager viewPager2 = this.LLJIJIL;
        int iLJIIIIZZ = C14KQ.LJIIIIZZ(context);
        c1618300sDM.getClass();
        C1618300sDM.LIZ(context, textView, viewPager2, iLJIIIIZZ);
        this.LLJJ = new C19466811Ec(this.LLJIJIL, Mp4ScreenVideoLoadTimeout.CONTROL);
        viewFindViewById.getLayoutParams().height = C497820Jfg.LIZJ(view.getContext());
        viewPager.addOnPageChangeListener(this);
        c1194770hCF.setLayoutDirection(0);
    }

    @Override // X.InterfaceC487330J9f
    public final void onConfigurationChanged(Activity activity, Configuration configuration) {
        int i = this.LLJJJ;
        int i2 = configuration.screenWidthDp;
        if (i != i2) {
            this.LLJJJ = i2;
            C1618300sDM c1618300sDM = C1618300sDM.LIZ;
            Context context = this.LLJJIII;
            TextView textView = this.LLJI;
            ViewPager viewPager = this.LLJIJIL;
            int iLIZ = C341940Daq.LIZ(i2);
            c1618300sDM.getClass();
            C1618300sDM.LIZ(context, textView, viewPager, iLIZ);
        }
    }
}
