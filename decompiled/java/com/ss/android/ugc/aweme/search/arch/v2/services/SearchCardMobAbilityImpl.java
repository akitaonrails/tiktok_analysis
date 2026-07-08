package com.ss.android.ugc.aweme.search.arch.v2.services;

import X.C01GW;
import X.C078E;
import X.C07BZ;
import X.C0BRN;
import X.C0PRC;
import X.C0Q3E;
import X.C0R45;
import X.C1558520qew;
import X.C2097608Jq;
import X.C452501pT;
import X.C473401sq;
import X.C643200PKs;
import X.C645920PVe;
import X.C646370PWx;
import X.C650410PfD;
import X.C650430PfF;
import X.C654740PmC;
import X.C823050WQl;
import X.InterfaceC594520NTm;
import X.InterfaceC641770PFf;
import X.InterfaceC645880PVa;
import X.InterfaceC655050Pmh;
import X.InterfaceC665370Q7z;
import Y.ARunnableS110S0100000_10;
import android.view.View;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.parser.SearchCardViewHolder;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.ability.SearchTopFragmentAbility;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import java.util.Map;
import kotlin.jvm.internal.AwS254S0300000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS624S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchCardMobAbilityImpl implements SearchServiceCenter$MobAbility, InterfaceC641770PFf {
    public static final /* synthetic */ int LLJILJIL = 0;
    public final InterfaceC665370Q7z LL;
    public final View LLILLJJLI;
    public final ISearchCardProtocol<InterfaceC594520NTm> LLILLL;
    public final ISearchContextAbility LLILZ;
    public boolean LLILZIL;
    public Map<String, String> LLILZLL;
    public Map<String, String> LLIZ;
    public Map<String, String> LLIZLLLIL;
    public Map<String, String> LLJ;
    public boolean LLJI;
    public InterfaceC594520NTm LLJIJIL;

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$MobAbility
    public final Map<String, String> XE0() {
        Map<String, String> map = this.LLILZLL;
        return map == null ? C2097608Jq.LJ() : map;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$MobAbility
    public final Map<String, String> sl1() {
        Map<String, String> map = this.LLJ;
        return map == null ? C2097608Jq.LJ() : map;
    }

    public final void LIZIZ(Map<String, String> map) {
        if (((Number) C078E.LIZ.getValue()).intValue() == 0 && ((C646370PWx) C0Q3E.LIZ(this.LLILLJJLI).wO2().LIZJ()).LLJJIJI) {
            return;
        }
        Integer numValueOf = null;
        if (C650410PfD.LIZ()) {
            int i = ((C646370PWx) C0Q3E.LIZ(this.LLILLJJLI).wO2().LIZJ()).LLJIJIL;
            SearchServiceCenter$AdapterControlAbility searchServiceCenter$AdapterControlAbility = (SearchServiceCenter$AdapterControlAbility) C1558520qew.LIZ(this.LL, SearchServiceCenter$AdapterControlAbility.class, null);
            if (searchServiceCenter$AdapterControlAbility != null) {
                numValueOf = Integer.valueOf(searchServiceCenter$AdapterControlAbility.XR1(i));
            }
        }
        AwS254S0300000_10 awS254S0300000_10 = new AwS254S0300000_10(this, (SearchCardMobAbilityImpl) map, (Map<String, String>) numValueOf, (Integer) 4);
        if (this.LLILLL.getConfig().LIZ()) {
            C823050WQl.LIZIZ().execute(new ARunnableS110S0100000_10(awS254S0300000_10, 38));
        } else {
            awS254S0300000_10.invoke();
        }
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$MobAbility
    public final void Nj1(InterfaceC645880PVa interfaceC645880PVa) {
        C650430PfF c650430PfFLLIZLLLIL;
        C654740PmC c654740PmC = new C654740PmC(null);
        C0PRC c0prc = (C0PRC) this.LLILZ.Ph1().LIZJ();
        c654740PmC.LJJIIZI(c0prc.LLILLL);
        c654740PmC.LJIIZILJ("search_keyword", c0prc.LLIZLLLIL);
        C646370PWx c646370PWx = (C646370PWx) this.LLILZ.wO2().LIZJ();
        c654740PmC.LJIJJ(c646370PWx.LLILLL);
        c654740PmC.LJJIIZ(Integer.valueOf(c646370PWx.LLILZLL));
        C643200PKs.LIZ(c654740PmC, c646370PWx, null);
        Map<String, String> map = this.LLIZ;
        if (map != null) {
            c654740PmC.LJIILLIIL.putAll(map);
        } else {
            Map<String, String> map2 = this.LLILZLL;
            if (map2 != null) {
                c654740PmC.LJIILLIIL.putAll(map2);
            }
        }
        if (interfaceC645880PVa != null && (c650430PfFLLIZLLLIL = interfaceC645880PVa.LLIZLLLIL()) != null) {
            c654740PmC.LJIILLIIL.putAll(c650430PfFLLIZLLLIL.LIZ());
        }
        if (C0BRN.LIZ()) {
            C645920PVe.LIZIZ(c654740PmC, this.LLILLJJLI, c654740PmC.LJIILLIIL.get("search_result_id"), c654740PmC.LJIILLIIL.get("list_item_id"));
        }
        c654740PmC.LJIILJJIL();
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$MobAbility
    public final void ms2(Map<String, String> map) {
        LIZIZ(map);
    }

    @Override // X.InterfaceC641770PFf
    public final void LIZ(InterfaceC594520NTm interfaceC594520NTm, InterfaceC655050Pmh interfaceC655050Pmh) {
        this.LLJIJIL = interfaceC594520NTm;
        if (interfaceC655050Pmh instanceof InterfaceC645880PVa) {
            InterfaceC645880PVa interfaceC645880PVa = (InterfaceC645880PVa) interfaceC655050Pmh;
            this.LLILZLL = interfaceC645880PVa.LLIZLLLIL().LIZIZ();
            this.LLIZ = interfaceC645880PVa.LLIZLLLIL().LIZ();
            this.LLIZLLLIL = interfaceC645880PVa.LLIZLLLIL().LIZLLL();
            this.LLJ = interfaceC645880PVa.LLIZLLLIL().LIZJ();
            boolean zLLJJJIL = interfaceC645880PVa.LLJJJIL();
            this.LLILZIL = zLLJJJIL;
            if (zLLJJJIL && C07BZ.LIZ() && !this.LLJI) {
                C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 286));
                this.LLJI = true;
                C473401sq.LIZIZ(this.LLILLJJLI, new AwS554S0100000_10(c01gwLIZIZ, (C01GW<? extends SearchTopFragmentAbility>) 284), 0.0f, new AwS554S0100000_10(this, 285), false, null, new AwS624S0100000_10(this, 21), 26);
            }
        }
    }

    public SearchCardMobAbilityImpl(InterfaceC665370Q7z interfaceC665370Q7z, View view, ISearchCardProtocol iSearchCardProtocol, SearchCardViewHolder searchCardViewHolder) {
        this.LL = interfaceC665370Q7z;
        this.LLILLJJLI = view;
        this.LLILLL = iSearchCardProtocol;
        this.LLILZ = searchCardViewHolder;
        if (!C07BZ.LIZ()) {
            view.addOnAttachStateChangeListener(new C0R45(this, 5));
        }
        this.LLILZIL = true;
    }
}
