package com.ss.android.ugc.aweme.homepage.ui.inflate;

import X.AnonymousClass0716;
import X.C098200Yq;
import X.C0CCZ;
import X.C0VZ0;
import X.C1157804fw;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C13LQ;
import X.C1584190rKL;
import X.C1585030rLh;
import X.C1874850yt9;
import X.C189200o6;
import X.C315230CXh;
import X.C419910GdJ;
import X.C497820Jfg;
import X.C730700SlQ;
import X.C799710VYr;
import X.C799890VZj;
import X.C799900VZk;
import X.C800330VaR;
import X.EnumC1584180rKK;
import X.EnumC714850S2h;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC1584170rKJ;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.LruCache;
import com.bytedance.touchpoint.api.model.CoinBottomTab;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService;
import com.ss.android.ugc.aweme.search.ISearchService;
import com.ss.android.ugc.aweme.search.ISearchServiceLowEnd;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes25.dex */
public final class PreDrawableInflate implements IPreDrawableInflate {
    public final Map<String, Object> LL = new ConcurrentHashMap();
    public final Map<Integer, Drawable> LLILLJJLI = new ConcurrentHashMap();

    @Override // X.InterfaceC799850VZf
    public final int LIZJ() {
        return R.style.xm;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "PreDrawableInflate";
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.InterfaceC308150C6b
    public final /* synthetic */ void run(Context context) {
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ int targetProcess() {
        return C799710VYr.LIZ();
    }

    @Override // X.InterfaceC799850VZf
    public final Class<? extends Activity> LIZIZ() {
        return ((HomePageUIFrameService) ServiceManager.get().getService(HomePageUIFrameService.class)).getHomePageInflateActivityClass();
    }

    @Override // X.InterfaceC800080Va2
    public final EnumC799980VZs triggerType() {
        return EnumC799980VZs.INFLATE;
    }

    public final Drawable LJ(Context context) {
        Drawable drawable = (Drawable) ((ConcurrentHashMap) this.LLILLJJLI).remove(Integer.valueOf(R.raw.icon_tab_arrow_counter_clockwise));
        if (drawable == null) {
            drawable = null;
            if (context != null) {
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.raw.icon_tab_arrow_counter_clockwise;
                TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(context);
                if (tuxIconDrawableLIZ != null) {
                    return tuxIconDrawableLIZ;
                }
                if (context != null) {
                    return C800330VaR.LIZIZ(context, R.raw.icon_tab_arrow_counter_clockwise);
                }
            }
        }
        return drawable;
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.inflate.IPreDrawableInflate
    public final Object getValue(String str) {
        return ((ConcurrentHashMap) this.LL).get("status_bar_height");
    }

    public final Drawable LIZ(int i, Context context) {
        Drawable drawable = (Drawable) ((ConcurrentHashMap) this.LLILLJJLI).remove(Integer.valueOf(i));
        if (drawable == null) {
            return C800330VaR.LIZIZ(context, i);
        }
        return drawable;
    }

    public final void LJFF(Context context, int i) {
        try {
            Drawable drawableLIZIZ = C800330VaR.LIZIZ(context, i);
            ((ConcurrentHashMap) this.LLILLJJLI).put(Integer.valueOf(i), drawableLIZIZ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // X.InterfaceC799850VZf
    public final void LJII(Activity activity, Context context) {
        boolean zLJL;
        if (((Boolean) AnonymousClass0716.LJJIIZI.getValue()).booleanValue()) {
            return;
        }
        if (!((Boolean) AnonymousClass0716.LJ.getValue()).booleanValue()) {
            LJFF(context, R.drawable.cfa);
            LJFF(context, R.drawable.a3b);
            LJFF(context, R.drawable.bvn);
        }
        if (C1157804fw.LIZ()) {
            zLJL = ((InterfaceC1584170rKJ) ServiceManager.get().getService(ISearchServiceLowEnd.class)).LJL();
        } else {
            zLJL = ((InterfaceC1584170rKJ) ServiceManager.get().getService(ISearchService.class)).LJL();
        }
        if (zLJL) {
            LJFF(context, R.drawable.bus);
            LJFF(context, R.drawable.bup);
            LJFF(context, R.drawable.bur);
        } else {
            LJFF(context, R.drawable.bve);
            LJFF(context, R.drawable.bvd);
            LJFF(context, R.drawable.bvj);
        }
        if (C1585030rLh.LJIIL()) {
            LJIIIIZZ(R.raw.icon_tab_bottom_home_fill, context);
            LJIIIIZZ(R.raw.icon_tab_bottom_home, context);
            LJIIIIZZ(R.raw.icon_tab_bottom_friends, context);
            LJIIIIZZ(R.raw.icon_tab_bottom_friends_fill, context);
            LJIIIIZZ(R.raw.icon_tab_bottom_inbox, context);
            LJIIIIZZ(R.raw.icon_tab_bottom_inbox_fill, context);
            LJIIIIZZ(R.raw.icon_tab_bottom_profile, context);
            LJIIIIZZ(R.raw.icon_tab_bottom_profile_fill, context);
            Pair pair = (Pair) C315230CXh.LIZJ.getValue();
            if (pair != null) {
                LJIIIIZZ(((Number) pair.getFirst()).intValue(), context);
                LJIIIIZZ(((Number) pair.getSecond()).intValue(), context);
            }
        }
        LJIIIIZZ(R.raw.icon_tab_home_fill, context);
        LJIIIIZZ(R.raw.icon_color_create_light, context);
        LJIIIIZZ(R.raw.icon_color_create_dark, context);
        LJFF(context, R.drawable.buw);
        LJFF(context, R.drawable.bv1);
        LJFF(context, 2130971643);
        EnumC1584180rKK enumC1584180rKKLIZ = C1584190rKL.LIZ();
        if (enumC1584180rKKLIZ == EnumC1584180rKK.V2 || enumC1584180rKKLIZ == EnumC1584180rKK.V5) {
            Iterator it2 = C13LQ.LJLIIL(new Integer[]{Integer.valueOf(R.raw.icon_bitmap_exp_02_icon_explore_light), Integer.valueOf(R.raw.icon_bitmap_exp_02_icon_explore_dark), Integer.valueOf(R.raw.icon_bitmap_exp_02_icon_explore_fill_light), Integer.valueOf(R.raw.icon_bitmap_exp_02_icon_explore_fill_dark), Integer.valueOf(R.raw.icon_bitmap_exp_02_icon_friends_light), Integer.valueOf(R.raw.icon_bitmap_exp_02_icon_friends_dark), Integer.valueOf(R.raw.icon_bitmap_exp_02_icon_friends_fill_light), Integer.valueOf(R.raw.icon_bitmap_exp_02_icon_friends_fill_dark), Integer.valueOf(R.raw.icon_bitmap_exp_02_icon_home_light), Integer.valueOf(R.raw.icon_bitmap_exp_02_icon_home_dark), Integer.valueOf(R.raw.icon_bitmap_exp_02_icon_home_fill_light), Integer.valueOf(R.raw.icon_bitmap_exp_02_icon_home_fill_dark), Integer.valueOf(R.raw.icon_bitmap_exp_02_icon_live_wave_light), Integer.valueOf(R.raw.icon_bitmap_exp_02_icon_live_wave_dark), Integer.valueOf(R.raw.icon_bitmap_exp_02_icon_live_wave_fill_light), Integer.valueOf(R.raw.icon_bitmap_exp_02_icon_live_wave_fill_dark), Integer.valueOf(R.raw.icon_bitmap_exp_02_icon_inbox_light), Integer.valueOf(R.raw.icon_bitmap_exp_02_icon_inbox_dark), Integer.valueOf(R.raw.icon_bitmap_exp_02_icon_inbox_fill_light), Integer.valueOf(R.raw.icon_bitmap_exp_02_icon_inbox_fill_dark), Integer.valueOf(R.raw.icon_bitmap_exp_02_icon_profile_light), Integer.valueOf(R.raw.icon_bitmap_exp_02_icon_profile_dark), Integer.valueOf(R.raw.icon_bitmap_exp_02_icon_profile_fill_light), Integer.valueOf(R.raw.icon_bitmap_exp_02_icon_profile_fill_dark), Integer.valueOf(R.raw.icon_bitmap_exp_02_icon_bag_fill_light), Integer.valueOf(R.raw.icon_bitmap_exp_02_icon_bag_fill_dark), Integer.valueOf(R.raw.icon_bitmap_exp_02_icon_bag_light), Integer.valueOf(R.raw.icon_bitmap_exp_02_icon_bag_dark), Integer.valueOf(R.raw.icon_bitmap_exp_02_icon_color_create_dark), Integer.valueOf(R.raw.icon_bitmap_exp_02_icon_color_create_light), Integer.valueOf(R.raw.icon_bitmap_exp_05_icon_explore_light), Integer.valueOf(R.raw.icon_bitmap_exp_05_icon_explore_dark), Integer.valueOf(R.raw.icon_bitmap_exp_02_icon_explore_fill_light), Integer.valueOf(R.raw.icon_bitmap_exp_02_icon_explore_fill_dark), Integer.valueOf(R.raw.icon_bitmap_exp_05_icon_friends_light), Integer.valueOf(R.raw.icon_bitmap_exp_05_icon_friends_dark), Integer.valueOf(R.raw.icon_bitmap_exp_02_icon_friends_fill_light), Integer.valueOf(R.raw.icon_bitmap_exp_02_icon_friends_fill_dark), Integer.valueOf(R.raw.icon_bitmap_exp_05_icon_home_light), Integer.valueOf(R.raw.icon_bitmap_exp_05_icon_home_dark), Integer.valueOf(R.raw.icon_bitmap_exp_02_icon_home_fill_light), Integer.valueOf(R.raw.icon_bitmap_exp_02_icon_home_fill_dark), Integer.valueOf(R.raw.icon_bitmap_exp_05_icon_live_wave_light), Integer.valueOf(R.raw.icon_bitmap_exp_05_icon_live_wave_dark), Integer.valueOf(R.raw.icon_bitmap_exp_02_icon_live_wave_fill_light), Integer.valueOf(R.raw.icon_bitmap_exp_02_icon_live_wave_fill_dark), Integer.valueOf(R.raw.icon_bitmap_exp_05_icon_inbox_light), Integer.valueOf(R.raw.icon_bitmap_exp_05_icon_inbox_dark), Integer.valueOf(R.raw.icon_bitmap_exp_02_icon_inbox_fill_light), Integer.valueOf(R.raw.icon_bitmap_exp_02_icon_inbox_fill_dark), Integer.valueOf(R.raw.icon_bitmap_exp_05_icon_profile_light), Integer.valueOf(R.raw.icon_bitmap_exp_05_icon_profile_dark), Integer.valueOf(R.raw.icon_bitmap_exp_02_icon_profile_fill_light), Integer.valueOf(R.raw.icon_bitmap_exp_02_icon_profile_fill_dark), Integer.valueOf(R.raw.icon_bitmap_exp_02_icon_bag_fill_light), Integer.valueOf(R.raw.icon_bitmap_exp_02_icon_bag_fill_dark), Integer.valueOf(R.raw.icon_bitmap_exp_05_icon_bag_light), Integer.valueOf(R.raw.icon_bitmap_exp_05_icon_bag_dark), Integer.valueOf(R.raw.icon_bitmap_exp_02_icon_color_create_dark), Integer.valueOf(R.raw.icon_bitmap_exp_02_icon_color_create_light)}).iterator();
            while (it2.hasNext()) {
                LJFF(context, ((Number) it2.next()).intValue());
            }
            Iterator it3 = Collections.singleton(Integer.valueOf(R.raw.icon_tab_arrow_counter_clockwise)).iterator();
            while (it3.hasNext()) {
                LJIIIIZZ(((Number) it3.next()).intValue(), context);
            }
        }
        CoinBottomTab coinBottomTab = (CoinBottomTab) C1874850yt9.LIZ(29, CoinBottomTab.class);
        if (coinBottomTab != null) {
            try {
                C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(coinBottomTab.iconURL);
                c1331670kl3LJIIIZ.LJJIJL(context);
                c1331670kl3LJIIIZ.LJJIIZ = EnumC714850S2h.CUSTOM;
                c1331670kl3LJIIIZ.LJJJJJ = "coin_bottom_tab";
                c1331670kl3LJIIIZ.LJJIFFI();
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        try {
            LruCache<String, Drawable> lruCache = C730700SlQ.LIZ;
            ((ConcurrentHashMap) this.LL).put("status_bar_height", Integer.valueOf(C497820Jfg.LIZJ(context)));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C799900VZk.LIZ.getClass();
        new C799890VZj().LIZ(new C0CCZ() { // from class: com.ss.android.ugc.aweme.homepage.ui.inflate.PreDrawableInflate$inflate$2
            @Override // X.InterfaceC800080Va2
            public final /* synthetic */ List finalizedBy() {
                return null;
            }

            @Override // X.InterfaceC800080Va2
            public final String key() {
                return "PreDrawableInflate$inflate$2";
            }

            @Override // X.InterfaceC800080Va2
            public final /* synthetic */ boolean meetTrigger() {
                return true;
            }

            @Override // X.C0CCZ
            public final /* synthetic */ boolean serialExecute() {
                return false;
            }

            @Override // X.InterfaceC800080Va2
            public final /* synthetic */ int targetProcess() {
                return C0VZ0.LIZ();
            }

            @Override // X.InterfaceC800080Va2
            public final /* synthetic */ EnumC799980VZs triggerType() {
                return C0VZ0.LIZIZ(this);
            }

            @Override // X.C0CCZ
            public final EnumC799870VZh type() {
                return EnumC799870VZh.BOOT_FINISH;
            }

            @Override // X.InterfaceC308150C6b
            public final void run(Context context2) {
                PreDrawableInflate preDrawableInflate = this.LL;
                ((ConcurrentHashMap) preDrawableInflate.LL).clear();
                ((ConcurrentHashMap) preDrawableInflate.LLILLJJLI).clear();
            }
        });
    }

    public final void LJIIIIZZ(int i, Context context) {
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = i;
        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(context);
        ((ConcurrentHashMap) this.LLILLJJLI).put(Integer.valueOf(i), tuxIconDrawableLIZ);
    }
}
