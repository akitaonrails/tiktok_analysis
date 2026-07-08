package com.ss.android.ugc.aweme.ecommerce.showcase.mix.assem;

import X.C019F;
import X.C1166240gSE;
import X.C1166470gSb;
import X.C13LE;
import X.C1558520qew;
import X.C1637806bA;
import X.C1846060y8i;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C724750Sbp;
import X.C736680Sv4;
import X.InterfaceC1554640qYg;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.ecommerce.mix.model.TabBarItemData;
import com.ss.android.ugc.aweme.ecommerce.mix.view.MixUIContentAssem;
import com.ss.android.ugc.aweme.ecommerce.showcase.mix.ability.StoreTabBarAbility;
import com.ss.android.ugc.aweme.ecommerce.showcase.mix.viewmodel.StoreMixViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.AwS632S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class StoreTabBarAssem extends MixUIContentAssem<C1166240gSE> implements StoreTabBarAbility, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJ;
    public C1846060y8i LLJJIII;
    public final AssemVMLazy LLJJIJI;
    public final ArrayList<TabBarItemData> LLJJIJIIJIL;
    public C1166470gSb LLJJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(StoreTabBarAssem.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/showcase/mix/viewmodel/StoreMixViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public StoreTabBarAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(StoreMixViewModel.class);
        this.LLJJIJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS562S0100000_18(c19719912DlLIZ, 204), AFwS256S0000000_18.get$arr$(68), null, true);
        this.LLJJIJIIJIL = new ArrayList<>();
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -811442224) {
            return null;
        }
        return this;
    }

    public final C1846060y8i Oo() {
        View viewFindViewById = this.LLJJIII;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.wya) : null;
            this.LLJJIII = (C1846060y8i) viewFindViewById;
        }
        return (C1846060y8i) viewFindViewById;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.showcase.mix.ability.StoreTabBarAbility
    public final int cz0() {
        if (LJJIJL().getVisibility() == 0) {
            return LJJIJL().getHeight();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mix.view.MixUIContentAssem, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C1846060y8i c1846060y8iOo = Oo();
        if (c1846060y8iOo != null) {
            c1846060y8iOo.LLJILLL.clear();
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mix.view.MixUIContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        AssemVMLazy assemVMLazy = this.LLJJIJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJ;
        ((StoreMixViewModel) assemVMLazy.getValue()).wQ2(2, new AwS597S0100000_18(this, 77));
        C736680Sv4.LJIIIIZZ(this, this.LLJJIJI.getValue(), new C2217381BqS() { // from class: X.0gSY
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1166370gSR) obj).LL;
            }
        }, null, new AwS632S0100000_18(this, 35), 6);
    }
}
