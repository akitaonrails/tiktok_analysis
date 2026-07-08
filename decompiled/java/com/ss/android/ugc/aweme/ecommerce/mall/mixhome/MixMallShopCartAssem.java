package com.ss.android.ugc.aweme.ecommerce.mall.mixhome;

import X.AbstractViewOnClickListenerC420730Ged;
import X.C019F;
import X.C01GW;
import X.C098200Yq;
import X.C127G;
import X.C13LE;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1564670qor;
import X.C1608210rx5;
import X.C1637806bA;
import X.C1767950w6j;
import X.C189200o6;
import X.C1934807hy;
import X.C19719912Dl;
import X.C19EG;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2341109Fh;
import X.C452501pT;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C788150Uvt;
import X.InterfaceC1583600rJO;
import X.InterfaceC2217461Bqa;
import Y.AObjectS398S0100000_24;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.hox.Hox;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.bytedance.tiktok.homepage.mainfragment.ability.IMFShopAbility;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.badge.TuxAlertBadgeLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ecommerce.mall.ShopMallMixFragment;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS603S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class MixMallShopCartAssem extends UIContentAssem implements GetTopTabCartViewAbility {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJ;
    public TuxAlertBadgeLayout LLIZLLLIL;
    public TuxIconView LLJ;
    public final C1608210rx5 LLJI = new C1608210rx5(this, C13LE.LJII(ShopMallMixFragment.class));
    public final AssemVMLazy LLJIJIL;
    public final C01GW LLJILJIL;
    public final C1564670qor LLJILJILJ;
    public C127G LLJILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MixMallShopCartAssem.class, "shopMixVM", "getShopMixVM()Lcom/ss/android/ugc/aweme/ecommerce/mall/mixhome/ShopMallMixViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.0qor] */
    public MixMallShopCartAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ShopMallMixViewModel.class);
        this.LLJIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 337), AFwS264S0000000_24.get$arr$(89), null, true);
        this.LLJILJIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 336));
        this.LLJILJILJ = new InterfaceC1583600rJO() { // from class: X.0qor
            @Override // X.InterfaceC1583600rJO
            public final void Ja() {
                Fragment fragmentBQ2;
                IMFShopAbility iMFShopAbilityLIZLLL;
                C19EG c19egLIZ = C724240Sb0.LIZ(this.LL);
                if (c19egLIZ == null || !Hox.LLJILJIL.LIZ(c19egLIZ).KQ2("Shop") || (fragmentBQ2 = C343710Ddh.LIZ(c19egLIZ).BQ2()) == null || (iMFShopAbilityLIZLLL = C1561720qk6.LIZLLL(fragmentBQ2)) == null) {
                    return;
                }
                iMFShopAbilityLIZLLL.ly("Shop");
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ShopMallMixFragment Go() {
        return (ShopMallMixFragment) this.LLJI.getValue();
    }

    public final ShopMallMixViewModel Ho() {
        AssemVMLazy assemVMLazy = this.LLJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJ;
        return (ShopMallMixViewModel) assemVMLazy.getValue();
    }

    public final TuxAlertBadgeLayout Jo() {
        View viewFindViewById = this.LLIZLLLIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.v8m) : null;
            this.LLIZLLLIL = (TuxAlertBadgeLayout) viewFindViewById;
        }
        return (TuxAlertBadgeLayout) viewFindViewById;
    }

    public final TuxIconView Lo() {
        View viewFindViewById = this.LLJ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.v8l) : null;
            this.LLJ = (TuxIconView) viewFindViewById;
        }
        return (TuxIconView) viewFindViewById;
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJILLL;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJILLL;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{ShopMallMixViewModel.class, new AObjectS398S0100000_24(this, 4)}, defaultViewModelProviderFactory);
                    this.LLJILLL = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mall.mixhome.GetTopTabCartViewAbility
    public final View nb() {
        return LJJIJL();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            C1558520qew.LJIIJJI(C1558360qeg.LJI(c19egLIZ, null), GetTopTabCartViewAbility.class, null);
        }
        HomeTabAbility homeTabAbility = (HomeTabAbility) this.LLJILJIL.getValue();
        if (homeTabAbility != null) {
            homeTabAbility.Ci2(this.LLJILJILJ);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        C2341109Fh.LIZ.getClass();
        C2341109Fh.LIZ("onViewCreated");
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            C1558520qew.LJII(C1558360qeg.LJI(c19egLIZ, null), this, GetTopTabCartViewAbility.class, null, null);
        }
        Jo().LIZIZ();
        No("sslocal://webcast_lynxview?hide_nav_bar=1&use_new_container=1&trans_status_bar=1&hide_status_bar=0&trackParams=%7B%22previous_page%22%3A%22mall%22%2C%22enter_from%22%3A%22mall%22%7D&url=https%3A%2F%2Flf19-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ffe_tiktok_ecommerce_shop_cart%2Fall%2Fpages%2Fmain%2Ftemplate.js", C2097608Jq.LJIIJ(new Pair("notice_number", CardStruct.IStatusCode.DEFAULT)), new C1934807hy(C1767950w6j.LIZ));
        AssemViewModel.asyncSubscribe$default(Ho(), new C2217381BqS() { // from class: X.0qzi
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1571460qzo) obj).LLILLL;
            }
        }, null, null, null, new AwS603S0100000_24(this, 429), 14, null);
        AssemViewModel.asyncSubscribe$default(Ho(), new C2217381BqS() { // from class: X.0qzj
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1571460qzo) obj).LLILZIL;
            }
        }, null, null, null, new AwS603S0100000_24(this, 430), 14, null);
        HomeTabAbility homeTabAbility = (HomeTabAbility) this.LLJILJIL.getValue();
        if (homeTabAbility != null) {
            homeTabAbility.UF0(this.LLJILJILJ);
        }
    }

    public final void No(final String str, final Map map, final Function2 function2) {
        View view;
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("mixhome shop cart schema ");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LIZ(strLIZIZ);
        TuxIconView tuxIconViewLo = Lo();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            view = fragmentLJI.getView();
        } else {
            view = null;
        }
        if (tuxIconViewLo != null && view != null) {
            try {
                C788150Uvt.LIZ.put(tuxIconViewLo, new WeakReference<>(view));
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        C786410Ut5.I7(new AbstractViewOnClickListenerC420730Ged() { // from class: X.0sC0
            /* JADX WARN: Removed duplicated region for block: B:27:0x00f3  */
            /* JADX WARN: Removed duplicated region for block: B:30:0x00fc  */
            /* JADX WARN: Removed duplicated region for block: B:33:0x011c  */
            /* JADX WARN: Removed duplicated region for block: B:40:0x017e  */
            @Override // X.AbstractViewOnClickListenerC420730Ged
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(android.view.View r22) {
                /*
                    Method dump skipped, instruction units count: 727
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1617460sC0.LIZ(android.view.View):void");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(700L);
            }
        }, Lo());
    }
}
