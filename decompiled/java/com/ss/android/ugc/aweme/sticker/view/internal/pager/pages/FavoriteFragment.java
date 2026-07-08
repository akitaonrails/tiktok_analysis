package com.ss.android.ugc.aweme.sticker.view.internal.pager.pages;

import X.C1635990sft;
import X.C1636070sg1;
import X.C1636150sg9;
import X.C1636320sgQ;
import X.C786410Ut5;
import X.EnumC1641470soj;
import X.InterfaceC1631540sYi;
import X.InterfaceC1640430sn3;
import X.ViewOnLayoutChangeListenerC1698100uI4;
import android.view.View;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import duk.p;
import java.util.List;
import kotlin.jvm.internal.AwS604S0100000_25;

/* JADX INFO: loaded from: classes26.dex */
public class FavoriteFragment extends StickerCategoryFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjY4ICw4LTdiPyY2P2HELIOSslJzs2OistJWEjKSIpO2EjKSIpOmEVKTMjOyYnLQM+KCg+LSs4";

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.StickerCategoryFragment, com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.AbstractStickerFragment
    public final String SR() {
        return "favorite";
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.StickerCategoryFragment
    public InterfaceC1631540sYi<Effect> rS() {
        return new FavoriteStickerListViewModel(this, RR(), PR().LIZIZ, UR(), PR().LJI);
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.StickerCategoryFragment
    public C1636320sgQ sS() {
        return new C1635990sft(RR(), UR(), iS(), PR().LJFF, OR().LIZLLL, OR().LIZIZ, OR(), hS(), this.LLILZIL);
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.StickerCategoryFragment
    public final boolean BS(Effect effect) {
        p pVarLJJJJIZL = RR().LJJJJIZL();
        if (pVarLJJJJIZL != null) {
            return pVarLJJJJIZL.LJ(effect, null);
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.AbstractStickerFragment
    public final InterfaceC1640430sn3<EnumC1641470soj> bS(View view) {
        InterfaceC1640430sn3<EnumC1641470soj> interfaceC1640430sn3BS = super.bS(view);
        ((C1636150sg9) interfaceC1640430sn3BS).LLILLJJLI.put(EnumC1641470soj.EMPTY, new AwS604S0100000_25(this, 312));
        return interfaceC1640430sn3BS;
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.StickerCategoryFragment
    public final void zS(List<? extends Effect> list) {
        C1636320sgQ c1636320sgQ = this.LLILZ;
        if (c1636320sgQ == null || getActivity() == null) {
            return;
        }
        C786410Ut5.LLIZLLLIL(LLII(), 0);
        c1636320sgQ.LLILZIL = this.LLILZIL;
        LLII().addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC1698100uI4(this, 2));
        c1636320sgQ.setData(list);
        C1636070sg1.LIZIZ(list, RR());
    }
}
