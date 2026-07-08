package com.ss.android.ugc.aweme.sticker.pagination;

import X.C1631250sYF;
import X.C1636320sgQ;
import X.C1636520sgk;
import X.InterfaceC1624480sNK;
import X.InterfaceC1625970sPj;
import X.InterfaceC1631540sYi;
import X.InterfaceC1635560sfC;
import X.InterfaceC1636390sgX;
import Y.AObserverS227S0100000_25;
import Y.AsS51S0100000_25;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.ss.android.ugc.aweme.sticker.pagination.StickerFooterModel;
import com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.StickerCategoryFragment;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes26.dex */
public final class CategoryEffectPageFragment extends StickerCategoryFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjY4ICw4LTdiOS40HELIOSISstPSY8JmsPKDs2Lyo+MAo1LiAvPR8yLyAKOy40JSAiPQ==";

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.StickerCategoryFragment, com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.AbstractStickerFragment
    public final String SR() {
        return "category_effect_page";
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.StickerCategoryFragment
    public final InterfaceC1631540sYi<Effect> rS() {
        return new PagingStickerListViewModel(this, RR().LJJLIIIJJIZ().LJ, RR(), PR().LIZIZ, UR(), PR().LJI, uS());
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.StickerCategoryFragment
    public final C1636320sgQ sS() {
        final InterfaceC1624480sNK interfaceC1624480sNKRR = RR();
        final InterfaceC1635560sfC interfaceC1635560sfCUR = UR();
        final InterfaceC1631540sYi<Effect> interfaceC1631540sYiIS = iS();
        final C1636520sgk c1636520sgk = PR().LJFF;
        final InterfaceC1625970sPj interfaceC1625970sPj = OR().LIZLLL;
        final InterfaceC1636390sgX interfaceC1636390sgX = OR().LIZIZ;
        final C1631250sYF c1631250sYFOR = OR();
        final EffectCategoryModel effectCategoryModelHS = hS();
        final int i = this.LLILZIL;
        return new C1636320sgQ(interfaceC1624480sNKRR, interfaceC1635560sfCUR, interfaceC1631540sYiIS, c1636520sgk, interfaceC1625970sPj, interfaceC1636390sgX, c1631250sYFOR, effectCategoryModelHS, i) { // from class: X.0sfs
            /* JADX WARN: Type inference failed for: r0v2, types: [com.ss.android.ugc.effectmanager.effect.model.Effect, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v3, types: [T, com.ss.android.ugc.effectmanager.effect.model.Effect] */
            @Override // X.AbstractC1636650sgx
            public final Effect LLLII(int i2) {
                if (i2 == getItemCount() - 1) {
                    return this.LLILZLL;
                }
                return super.LLLII(i2);
            }

            @Override // X.AbstractC1636650sgx
            public final C1636260sgK<Effect> LLLILZ(ViewGroup viewGroup) {
                View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.cwn, viewGroup, false);
                viewTd.getLayoutParams().height = -2;
                return new C1636260sgK<T>(viewTd) { // from class: X.0sXx
                    public final View LLILZIL;
                    public final View LLILZLL;
                    public final TextView LLIZ;

                    {
                        super(viewTd);
                        this.LLILZIL = viewTd;
                        this.LLILZLL = viewTd.findViewById(R.id.l2r);
                        this.LLIZ = (TextView) viewTd.findViewById(R.id.l21);
                    }

                    @Override // X.C1636260sgK
                    public final void L5(int i2, Object obj) {
                        if (!(obj instanceof StickerFooterModel)) {
                            return;
                        }
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.LLILZIL.getLayoutParams();
                        StickerFooterModel stickerFooterModel = (StickerFooterModel) obj;
                        Integer textRes = stickerFooterModel.getTextRes();
                        if (textRes != null) {
                            this.LLIZ.setText(this.LLILZIL.getContext().getText(textRes.intValue()));
                        }
                        EnumC1641470soj status = stickerFooterModel.getStatus();
                        EnumC1641470soj enumC1641470soj = EnumC1641470soj.LOADING;
                        if (status != enumC1641470soj && stickerFooterModel.getStatus() != EnumC1641470soj.ERROR) {
                            marginLayoutParams.width = 0;
                            marginLayoutParams.height = 0;
                            marginLayoutParams.bottomMargin = 0;
                            C786410Ut5.W5(this.LLILZIL, marginLayoutParams);
                            C786410Ut5.LLIL(this.LLIZ, 8);
                            C786410Ut5.LJLLLLLL(8, this.LLILZLL);
                            return;
                        }
                        marginLayoutParams.width = -1;
                        marginLayoutParams.height = C11VU.LIZJ(56.0d, this.LLILZIL.getContext());
                        marginLayoutParams.bottomMargin = C11VU.LIZJ(75.0d, this.LLILZIL.getContext());
                        C786410Ut5.W5(this.LLILZIL, marginLayoutParams);
                        C786410Ut5.W5(this.LLILZIL, marginLayoutParams);
                        if (stickerFooterModel.getStatus() == enumC1641470soj) {
                            C786410Ut5.LLIL(this.LLIZ, 8);
                            C786410Ut5.LJLLLLLL(0, this.LLILZLL);
                        } else {
                            C786410Ut5.LLIL(this.LLIZ, 0);
                            C786410Ut5.LJLLLLLL(8, this.LLILZLL);
                        }
                    }
                };
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.StickerCategoryFragment
    public final void dS() {
        super.dS();
        LLII().addOnScrollListener(new AsS51S0100000_25(this, 1));
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.StickerCategoryFragment
    public final void gS() {
        super.gS();
        iS().oI2().observe(this, new AObserverS227S0100000_25(this, 37));
    }
}
