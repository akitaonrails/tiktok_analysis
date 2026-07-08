package com.ss.android.ugc.aweme.search.pages.result.photosearch;

import X.C0BRN;
import X.C0PRC;
import X.C0R45;
import X.C1284660jXE;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C645920PVe;
import X.C645930PVf;
import X.C646370PWx;
import X.C650430PfF;
import X.C654740PmC;
import X.InterfaceC594520NTm;
import X.InterfaceC641770PFf;
import X.InterfaceC645880PVa;
import X.InterfaceC655050Pmh;
import android.view.View;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$MobAbility;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchCardCellMobAbilityImpl implements SearchServiceCenter$MobAbility, InterfaceC641770PFf {
    public final View LL;
    public final ISearchCardProtocol<InterfaceC594520NTm> LLILLJJLI;
    public final ISearchContextAbility LLILLL;
    public Map<String, String> LLILZ;
    public Map<String, String> LLILZIL;
    public Map<String, String> LLILZLL;
    public Map<String, String> LLIZ;

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$MobAbility
    public final Map<String, String> XE0() {
        Map<String, String> map = this.LLILZ;
        return map == null ? C2097608Jq.LJ() : map;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$MobAbility
    public final Map<String, String> sl1() {
        Map<String, String> map = this.LLIZ;
        return map == null ? C2097608Jq.LJ() : map;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$MobAbility
    public final void Nj1(InterfaceC645880PVa interfaceC645880PVa) {
        C650430PfF c650430PfFLLIZLLLIL;
        C654740PmC c654740PmC = new C654740PmC(null);
        C0PRC c0prc = (C0PRC) this.LLILLL.Ph1().LIZJ();
        c654740PmC.LJJIIZI(c0prc.LLILLL);
        c654740PmC.LJIIZILJ("search_keyword", c0prc.LLIZLLLIL);
        C646370PWx c646370PWx = (C646370PWx) this.LLILLL.wO2().LIZJ();
        c654740PmC.LJIJJ(c646370PWx.LLILLL);
        c654740PmC.LJJIIZ(Integer.valueOf(c646370PWx.LLILZLL));
        Map<String, String> map = this.LLILZIL;
        if (map != null) {
            c654740PmC.LJIILLIIL.putAll(map);
        } else {
            Map<String, String> map2 = this.LLILZ;
            if (map2 != null) {
                c654740PmC.LJIILLIIL.putAll(map2);
            }
        }
        if (interfaceC645880PVa != null && (c650430PfFLLIZLLLIL = interfaceC645880PVa.LLIZLLLIL()) != null) {
            c654740PmC.LJIILLIIL.putAll(c650430PfFLLIZLLLIL.LIZ());
        }
        if (C0BRN.LIZ()) {
            C645920PVe.LIZIZ(c654740PmC, this.LL, c654740PmC.LJIILLIIL.get("search_result_id"), c654740PmC.LJIILLIIL.get("list_item_id"));
        }
        C645930PVf.LIZ(c654740PmC);
        c654740PmC.LJIILJJIL();
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$MobAbility
    public final void ms2(Map<String, String> map) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("Not support sub item yet");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC641770PFf
    public final void LIZ(InterfaceC594520NTm interfaceC594520NTm, InterfaceC655050Pmh interfaceC655050Pmh) {
        if (interfaceC655050Pmh instanceof InterfaceC645880PVa) {
            InterfaceC645880PVa interfaceC645880PVa = (InterfaceC645880PVa) interfaceC655050Pmh;
            this.LLILZ = interfaceC645880PVa.LLIZLLLIL().LIZIZ();
            this.LLILZIL = interfaceC645880PVa.LLIZLLLIL().LIZ();
            this.LLILZLL = interfaceC645880PVa.LLIZLLLIL().LIZLLL();
            this.LLIZ = interfaceC645880PVa.LLIZLLLIL().LIZJ();
            interfaceC645880PVa.LLJJJIL();
        }
    }

    public SearchCardCellMobAbilityImpl(View view, ISearchCardProtocol<InterfaceC594520NTm> iSearchCardProtocol, ISearchContextAbility iSearchContextAbility) {
        this.LL = view;
        this.LLILLJJLI = iSearchCardProtocol;
        this.LLILLL = iSearchContextAbility;
        view.addOnAttachStateChangeListener(new C0R45(this, 14));
    }
}
