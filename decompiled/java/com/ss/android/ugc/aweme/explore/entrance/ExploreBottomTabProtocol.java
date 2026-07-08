package com.ss.android.ugc.aweme.explore.entrance;

import X.AbstractC1583860rJo;
import X.C01GW;
import X.C0BKD;
import X.C1583440rJ8;
import X.C1584040rK6;
import X.C1584190rKL;
import X.C1584460rKm;
import X.C1584490rKp;
import X.C1584550rKv;
import X.C1589820rTQ;
import X.C1592290rXP;
import X.C1593140rYm;
import X.C15WT;
import X.C1910420zoW;
import X.C282750B6j;
import X.C293140BeK;
import X.C452501pT;
import X.EnumC1583960rJy;
import X.InterfaceC1589850rTT;
import Y.ARunnableS93S0200000_24;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol;
import com.ss.android.ugc.aweme.explore.monitor.cache.ExploreCacheMonitor;
import com.ss.android.ugc.aweme.explore.monitor.ff.ExploreColdBootMonitor;
import com.ss.android.ugc.aweme.explore.ui.container.Explore2TabFeedFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS568S0100000_24;
import org.json.JSONException;

/* JADX INFO: loaded from: classes25.dex */
public final class ExploreBottomTabProtocol extends BottomTabProtocol {
    public Context LLILZ;
    public final C1592290rXP LLILZLL;
    public final Class<? extends Fragment> LLIZ;
    public final EnumC1583960rJy LLIZLLLIL;
    public final String LLILLL = "homepage_explore";
    public final C01GW LLILZIL = C452501pT.LIZIZ(new C1584490rKp(this));

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final AbstractC1583860rJo LJFF() {
        return null;
    }

    public ExploreBottomTabProtocol() {
        C1592290rXP c1592290rXP;
        int i = C1584040rK6.LIZ[C1584190rKL.LIZ().ordinal()];
        Integer numValueOf = Integer.valueOf(R.id.nw6);
        if (i == 1) {
            c1592290rXP = new C1592290rXP(new C1593140rYm(R.raw.icon_bitmap_exp_02_icon_explore_fill_light, R.attr.a1h, true, 4), new C1593140rYm(R.raw.icon_bitmap_exp_02_icon_explore_fill_dark, R.attr.a1h, true, 4), new C1593140rYm(R.raw.icon_bitmap_exp_02_icon_explore_light, R.attr.a1k, true, 4), new C1593140rYm(R.raw.icon_bitmap_exp_02_icon_explore_dark, R.attr.a1k, true, 4), numValueOf, 32);
        } else if (i != 2) {
            c1592290rXP = new C1592290rXP(new C1593140rYm(R.drawable.br6, R.attr.a1h, false, 12), new C1593140rYm(R.drawable.br4, R.attr.ee, false, 12), new C1593140rYm(R.drawable.br7, R.attr.a1k, false, 12), new C1593140rYm(R.drawable.br5, R.attr.eg, false, 12), numValueOf, 32);
        } else {
            c1592290rXP = new C1592290rXP(new C1593140rYm(R.raw.icon_bitmap_exp_02_icon_explore_fill_light, R.attr.a1h, true, 4), new C1593140rYm(R.raw.icon_bitmap_exp_02_icon_explore_fill_dark, R.attr.a1h, true, 4), new C1593140rYm(R.raw.icon_bitmap_exp_05_icon_explore_light, R.attr.a1h, true, 4), new C1593140rYm(R.raw.icon_bitmap_exp_05_icon_explore_dark, R.attr.a1h, true, 4), numValueOf, 32);
        }
        this.LLILZLL = c1592290rXP;
        this.LLIZ = Explore2TabFeedFragment.class;
        this.LLIZLLLIL = EnumC1583960rJy.TAB_2;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final C1584460rKm LIZ() {
        return new C1584460rKm() { // from class: X.0rKo
            @Override // X.C1584460rKm
            public final View LIZ(InterfaceC1583080rIY interfaceC1583080rIY, C1593020rYa c1593020rYa) {
                C19EG c19egLIZIZ;
                View viewLIZ = super.LIZ(interfaceC1583080rIY, c1593020rYa);
                Context context = this.LLILLJJLI.LLILZ;
                if (context != null) {
                    c19egLIZIZ = C1388190mED.LIZIZ(context);
                } else {
                    c19egLIZIZ = null;
                }
                HandlerHook.viewPostDelay(viewLIZ, new ARunnableS93S0200000_24(viewLIZ, c19egLIZIZ, 8), 800L);
                return viewLIZ;
            }
        };
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final InterfaceC1589850rTT LJ() {
        if (((Boolean) C282750B6j.LIZ.getValue()).booleanValue()) {
            return C1589820rTQ.LIZ;
        }
        return null;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final boolean enable() {
        return C1583440rJ8.LIZ();
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final C1592290rXP LIZJ() {
        return this.LLILZLL;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final EnumC1583960rJy LIZLLL() {
        return this.LLIZLLLIL;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final Class<? extends Fragment> LLJIJIL() {
        return this.LLIZ;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final String getTag() {
        return this.LLILLL;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final void LJII(Context context) {
        if (!((Boolean) C0BKD.LIZ.getValue()).booleanValue()) {
            ExploreColdBootMonitor.INSTANCE.start("click", "explore_bottom_tab");
        }
        ExploreCacheMonitor.INSTANCE.start();
        C1910420zoW.LIZJ();
        C15WT.LIZIZ.LIZIZ(context);
        ((View.OnClickListener) this.LLILZIL.getValue()).onClick(null);
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final void init(Context context) throws JSONException {
        this.LLILZ = context;
        C1584550rKv.LIZ.getClass();
        C1584550rKv.LIZ();
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final String mc(Context context) {
        return C293140BeK.LIZ(context, new AwS568S0100000_24(context, 363));
    }
}
