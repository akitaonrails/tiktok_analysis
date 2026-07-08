package com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.hometab;

import X.AbstractC1583860rJo;
import X.C0C64;
import X.C1388190mED;
import X.C1581720rGM;
import X.C1583990rK1;
import X.C1584190rKL;
import X.C1584460rKm;
import X.C1585030rLh;
import X.C1592290rXP;
import X.C1593140rYm;
import X.C19EG;
import X.C2093608Ic;
import X.C2222691Bz1;
import X.EnumC1583960rJy;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.hox.Hox;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.HomeTabViewModel;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.spi.TabSwitchMetricService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes25.dex */
public final class HomeTabProtocol extends BottomTabProtocol {
    public View.OnClickListener LLILLL;
    public final C1581720rGM LLILZ = new AbstractC1583860rJo() { // from class: X.0rGM
        public final boolean LIZ = true;

        @Override // X.AbstractC1583860rJo
        public final boolean LIZIZ() {
            return this.LIZ;
        }

        @Override // X.AbstractC1583860rJo
        public final List<AbstractC1583720rJa> LIZ(Context context) {
            C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
            if (c19egLIZIZ != null) {
                List<InterfaceC1583870rJp> listLZ1 = HomeTabViewModel.LLILZIL.LIZ(c19egLIZIZ).lZ1(false);
                ArrayList arrayList = new ArrayList();
                for (InterfaceC1583870rJp interfaceC1583870rJp : listLZ1) {
                    if (interfaceC1583870rJp instanceof AbstractC1583720rJa) {
                        arrayList.add(interfaceC1583870rJp);
                    }
                }
                return arrayList;
            }
            "activity is null!".toString();
            throw new IllegalArgumentException("activity is null!");
        }

        @Override // X.AbstractC1583860rJo
        public final void LIZLLL(Context context, String str, Bundle bundle) {
            HomeViewPagerAbility homeViewPagerAbilityLIZ;
            Object ability;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("main node switch tag, ");
            sbLIZ.append(str);
            C1581650rGF.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
            if (c19egLIZIZ == null) {
                return;
            }
            int iFQ2 = Hox.LLJILJIL.LIZ(c19egLIZIZ).FQ2(str);
            boolean z = bundle.getBoolean("isSmoothScroll", false);
            String strP1 = null;
            if (C297720Bli.LIZ()) {
                C0QSJ c0qsjLIZJ = C687700QyG.LIZJ(C1558360qeg.LJI(c19egLIZIZ, null), MainActivityScope.class);
                if (c0qsjLIZJ != null) {
                    ability = c0qsjLIZJ.getAbility(HomeViewPagerAbility.class);
                } else {
                    ability = null;
                }
                if (!(ability instanceof HomeViewPagerAbility)) {
                    ability = null;
                }
                homeViewPagerAbilityLIZ = (HomeViewPagerAbility) ability;
            } else {
                MainActivityScope mainActivityScopeLIZJ = C0S4U.LIZJ(c19egLIZIZ);
                if (mainActivityScopeLIZJ != null) {
                    homeViewPagerAbilityLIZ = C0CUK.LIZ(mainActivityScopeLIZJ);
                } else {
                    homeViewPagerAbilityLIZ = null;
                }
            }
            TabSwitchMetricService.LIZ.getClass();
            TabSwitchMetricService tabSwitchMetricServiceLIZ = C1204000hR8.LIZ();
            if (tabSwitchMetricServiceLIZ != null) {
                tabSwitchMetricServiceLIZ.LJI();
                C1593220rYu c1593220rYu = C1593220rYu.LIZ;
                if (homeViewPagerAbilityLIZ != null) {
                    strP1 = homeViewPagerAbilityLIZ.P1();
                }
                C1593220rYu.LIZJ(strP1, str);
            }
            if (homeViewPagerAbilityLIZ != null) {
                homeViewPagerAbilityLIZ.Cl2(iFQ2, z, false);
            }
        }
    };
    public final C1592290rXP LLILZIL;
    public final String LLILZLL;
    public final String LLIZ;
    public final Class<? extends Fragment> LLIZLLLIL;
    public final EnumC1583960rJy LLJ;

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0rGM] */
    public HomeTabProtocol() {
        C1592290rXP c1592290rXP;
        boolean zLJIIL = C1585030rLh.LJIIL();
        Integer numValueOf = Integer.valueOf(R.id.nw7);
        if (zLJIIL) {
            c1592290rXP = new C1592290rXP(new C1593140rYm(R.raw.icon_tab_bottom_home_fill, R.attr.a1h, false, 12), new C1593140rYm(R.raw.icon_tab_bottom_home_fill, R.attr.a1h, false, 12), new C1593140rYm(R.raw.icon_tab_bottom_home, R.attr.a1k, false, 12), new C1593140rYm(R.raw.icon_tab_bottom_home, R.attr.a1k, false, 12), numValueOf, 32);
        } else {
            int i = C1583990rK1.LIZ[C1584190rKL.LIZ().ordinal()];
            if (i == 1) {
                c1592290rXP = new C1592290rXP(new C1593140rYm(R.raw.icon_bitmap_exp_02_icon_home_fill_light, R.attr.a1h, true, 4), new C1593140rYm(R.raw.icon_bitmap_exp_02_icon_home_fill_dark, R.attr.a1h, true, 4), new C1593140rYm(R.raw.icon_bitmap_exp_02_icon_home_light, R.attr.a1k, true, 4), new C1593140rYm(R.raw.icon_bitmap_exp_02_icon_home_dark, R.attr.a1k, true, 4), numValueOf, 32);
            } else if (i != 2) {
                c1592290rXP = new C1592290rXP(new C1593140rYm(R.drawable.bvb, R.attr.a1h, false, 12), new C1593140rYm(R.drawable.bv_, R.attr.ee, false, 12), new C1593140rYm(R.drawable.bvc, R.attr.a1k, false, 12), new C1593140rYm(R.drawable.bva, R.attr.eg, false, 12), numValueOf, 32);
            } else {
                c1592290rXP = new C1592290rXP(new C1593140rYm(R.raw.icon_bitmap_exp_02_icon_home_fill_light, R.attr.a1h, true, 4), new C1593140rYm(R.raw.icon_bitmap_exp_02_icon_home_fill_dark, R.attr.a1h, true, 4), new C1593140rYm(R.raw.icon_bitmap_exp_05_icon_home_light, R.attr.a1h, true, 4), new C1593140rYm(R.raw.icon_bitmap_exp_05_icon_home_dark, R.attr.a1h, true, 4), numValueOf, 32);
            }
        }
        this.LLILZIL = c1592290rXP;
        this.LLILZLL = "HOME";
        this.LLIZ = "homepage_hot";
        Class<? extends Fragment> fragmentClass = ((HomePageUIFrameService) ServiceManager.get().getService(HomePageUIFrameService.class)).getFragmentClass("HOME");
        if (fragmentClass == null) {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        this.LLIZLLLIL = fragmentClass;
        this.LLJ = EnumC1583960rJy.TAB_1;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final boolean enable() {
        return true;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final C1584460rKm LIZ() {
        return new C1584460rKm() { // from class: X.0rJw
            @Override // X.C1584460rKm
            public final View LIZ(InterfaceC1583080rIY interfaceC1583080rIY, C1593020rYa c1593020rYa) {
                View viewLIZ = super.LIZ(interfaceC1583080rIY, c1593020rYa);
                viewLIZ.setSelected(true);
                return viewLIZ;
            }
        };
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final C1592290rXP LIZJ() {
        return this.LLILZIL;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final EnumC1583960rJy LIZLLL() {
        return this.LLJ;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final AbstractC1583860rJo LJFF() {
        return this.LLILZ;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final Class<? extends Fragment> LLJIJIL() {
        return this.LLIZLLLIL;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final String getMob() {
        return this.LLIZ;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final String getTag() {
        return this.LLILZLL;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final void LJII(Context context) {
        if (this.LLILLL == null) {
            this.LLILLL = ((HomePageUIFrameService) ServiceManager.get().getService(HomePageUIFrameService.class)).getBottomClick(context, this.LLILZLL);
        }
        View.OnClickListener onClickListener = this.LLILLL;
        if (onClickListener != null) {
            onClickListener.onClick(null);
        }
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final void LJIIIIZZ(Context context) {
        if (this.LLILLL == null) {
            this.LLILLL = ((HomePageUIFrameService) ServiceManager.get().getService(HomePageUIFrameService.class)).getBottomClick(context, this.LLILZLL);
        }
        View view = new View(context);
        view.setTag("is_mocked_click");
        View.OnClickListener onClickListener = this.LLILLL;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final Bundle V9(Context context) {
        Intent intent;
        String stringExtra;
        int intExtra;
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        if (c19egLIZIZ != null && (intent = c19egLIZIZ.getIntent()) != null) {
            try {
                stringExtra = intent.getStringExtra("tab");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                stringExtra = null;
            }
            if (C2093608Ic.LJ(stringExtra)) {
                intExtra = intent.getIntExtra("tab", -1);
            } else {
                try {
                    if (stringExtra != null) {
                        intExtra = CastIntegerProtector.parseInt(stringExtra);
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    intExtra = -1;
                }
            }
            int intExtra2 = intent.getIntExtra("page_type", -1);
            if (intExtra < 0 && intExtra2 < 0) {
                return new Bundle();
            }
            Bundle bundle = new Bundle();
            bundle.putInt("tab", intExtra);
            bundle.putInt("page_type", intExtra2);
            return bundle;
        }
        return new Bundle();
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final String mc(Context context) {
        if (C2222691Bz1.LJIIIZ() && C0C64.LJIILLIIL().LJIIIZ(31744, "for_you_new_translations", true, false)) {
            return context.getResources().getString(2131835575);
        }
        return context.getResources().getString(2131836992);
    }
}
