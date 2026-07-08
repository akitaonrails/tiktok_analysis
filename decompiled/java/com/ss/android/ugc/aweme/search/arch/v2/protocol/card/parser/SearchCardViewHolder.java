package com.ss.android.ugc.aweme.search.arch.v2.protocol.card.parser;

import X.C01GW;
import X.C078C;
import X.C0BCQ;
import X.C0P8E;
import X.C0P8O;
import X.C0PA7;
import X.C0PC0;
import X.C0PCG;
import X.C0PCQ;
import X.C0PCX;
import X.C0PCY;
import X.C0PHM;
import X.C0PM7;
import X.C0PRC;
import X.C0PRF;
import X.C0PRP;
import X.C0PS7;
import X.C0PWT;
import X.C0PYA;
import X.C0PYB;
import X.C0PYC;
import X.C0PYD;
import X.C0Q39;
import X.C0Q3E;
import X.C0Q45;
import X.C0Q8M;
import X.C0QDC;
import X.C0RDF;
import X.C0SMN;
import X.C0SZQ;
import X.C0SZS;
import X.C0SZT;
import X.C0SZU;
import X.C13LE;
import X.C1558420qem;
import X.C1558520qew;
import X.C1823007Ca;
import X.C1839807Im;
import X.C19EG;
import X.C2097608Jq;
import X.C21565319aV;
import X.C2188811AlT;
import X.C2344809Gs;
import X.C452501pT;
import X.C587060N0u;
import X.C639820P7s;
import X.C639830P7t;
import X.C639840P7u;
import X.C640110P8v;
import X.C640480PAg;
import X.C646370PWx;
import X.C646670PYb;
import X.C647460PaS;
import X.C648880Pck;
import X.C650240Pew;
import X.C650350Pf7;
import X.C650630PfZ;
import X.C651130PgN;
import X.C652150Pi1;
import X.C655580PnY;
import X.C659720PuE;
import X.C663990Q2r;
import X.C664400Q4g;
import X.C664410Q4h;
import X.C669520QNy;
import X.C673150Qan;
import X.C687700QyG;
import X.EnumC665990QAj;
import X.InterfaceC1294060jmO;
import X.InterfaceC584630MwP;
import X.InterfaceC594520NTm;
import X.InterfaceC626240OhK;
import X.InterfaceC639340P5w;
import X.InterfaceC641760PFe;
import X.InterfaceC645880PVa;
import X.InterfaceC648070PbR;
import X.InterfaceC655050Pmh;
import X.InterfaceC659190PtN;
import X.InterfaceC665370Q7z;
import X.InterfaceC719640SKs;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.ext_power_list.AssemReusedDispatcher;
import com.bytedance.ext_power_list.AssemReusedVHContainer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol;
import com.ss.android.ugc.aweme.search.arch.v2.services.autoplay.SearchCardAutoplayableViewHolder;
import com.ss.android.ugc.aweme.search.arch.v2.services.signal.impl.SearchContextAbilityImpl;
import com.ss.android.ugc.aweme.search.pages.result.common.anchor.abililty.ISearchCardElementVisibilityControlAbility;
import com.ss.android.ugc.aweme.search.pages.result.common.anchor.ui.IAdjustAbility;
import com.ss.android.ugc.aweme.search.pages.result.common.searchlemon8photo.core.ui.assem.ICardVisitedAbility;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.ClickSearchTriggerAbility;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.cs.core.model.ClickSearchViewModel;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.ss.android.ugc.aweme.search.source.neo.model.CreationSearchSignalState;
import com.ss.android.ugc.aweme.search.source.neo.model.SearchBehaviorSignalState;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS411S0200000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchCardViewHolder extends SearchCardAutoplayableViewHolder implements InterfaceC648070PbR, ISearchContextAbility, InterfaceC639340P5w, InterfaceC626240OhK, C0SMN<SearchCardViewHolder, InterfaceC655050Pmh>, C0SZQ {
    public static final /* synthetic */ int LLJI = 0;
    public final /* synthetic */ C650350Pf7 LLILLJJLI;
    public final /* synthetic */ ISearchContextAbility LLILLL;
    public final /* synthetic */ AssemReusedVHContainer<SearchCardViewHolder, InterfaceC655050Pmh> LLILZ;
    public final LifecycleOwner LLILZIL;
    public final ISearchCardProtocol<InterfaceC594520NTm> LLILZLL;
    public final C01GW LLIZ;
    public ISearchCardElementVisibilityControlAbility LLIZLLLIL;
    public ICardVisitedAbility LLJ;

    public SearchCardViewHolder() {
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility
    public final C0PCY<C651130PgN> AX1() {
        return this.LLILLL.AX1();
    }

    @Override // com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility
    public final C0PCY<C0PS7> Bq1() {
        return this.LLILLL.Bq1();
    }

    @Override // X.C0SMN
    public final C0RDF C41() {
        return this.LLILZ.C41();
    }

    @Override // com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility
    public final C0PCY<C0PRP> CV0() {
        return this.LLILLL.CV0();
    }

    @Override // com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility
    public final C0PCY<C0PYB> FF2() {
        return this.LLILLL.FF2();
    }

    @Override // com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility
    public final C0PCY<C669520QNy> FU1() {
        return this.LLILLL.FU1();
    }

    @Override // com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility
    public final C0PCY<C0P8E> Im0() {
        return this.LLILLL.Im0();
    }

    @Override // com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility
    public final C0PCY<C646670PYb> Jh0() {
        return this.LLILLL.Jh0();
    }

    @Override // X.InterfaceC648350Pbt
    public final boolean L0() {
        this.LLILLJJLI.getClass();
        return true;
    }

    @Override // X.InterfaceC648350Pbt
    public final void LJJJLIIL() {
        this.LLILLJJLI.LJJJLIIL();
    }

    @Override // X.C0SMN
    public final AssemReusedDispatcher<SearchCardViewHolder, InterfaceC655050Pmh> LJJJLL() {
        return this.LLILZ.LJJJLL();
    }

    @Override // X.InterfaceC648350Pbt
    public final void LJJLIIIJLLLLLLLZ() {
        this.LLILLJJLI.LJJLIIIJLLLLLLLZ();
    }

    @Override // X.InterfaceC713360RyY
    public final ViewModelStoreOwner LLIIIILZ() {
        return this.LLILZ.LLIIIILZ();
    }

    @Override // X.InterfaceC648350Pbt
    public final boolean LLLLIIIILLL() {
        this.LLILLJJLI.getClass();
        return true;
    }

    @Override // X.InterfaceC648350Pbt
    public final void LLZZZIL(C587060N0u c587060N0u) {
        this.LLILLJJLI.getClass();
    }

    @Override // X.InterfaceC719640SKs
    public final Context Mk2() {
        this.LLILZ.getClass();
        return null;
    }

    @Override // X.InterfaceC648350Pbt
    public final void Mu(C650630PfZ c650630PfZ) {
        this.LLILLJJLI.Mu(c650630PfZ);
    }

    @Override // X.InterfaceC648350Pbt
    public final boolean N1() {
        return this.LLILLJJLI.N1();
    }

    @Override // com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility
    public final C0PCY<C0Q39> P70() {
        return this.LLILLL.P70();
    }

    @Override // com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility
    public final C0PCY<C0PRC> Ph1() {
        return this.LLILLL.Ph1();
    }

    @Override // com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility
    public final C0PCY<C640480PAg> Pw0() {
        return this.LLILLL.Pw0();
    }

    @Override // com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility
    public final C0PCY<C0P8O> R22() {
        return this.LLILLL.R22();
    }

    @Override // com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility
    public final C0PCY<C640110P8v> SL1() {
        return this.LLILLL.SL1();
    }

    @Override // X.C0SMN
    public final void Sl0(View view, InterfaceC719640SKs interfaceC719640SKs) {
        this.LLILZ.Sl0(view, interfaceC719640SKs);
    }

    @Override // com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility
    public final C0PCY<CreationSearchSignalState> UL1() {
        return this.LLILLL.UL1();
    }

    @Override // com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility
    public final C0PCY<C0PA7> VG2() {
        return this.LLILLL.VG2();
    }

    @Override // X.InterfaceC648350Pbt
    public final void W0(long j, C587060N0u c587060N0u) {
        this.LLILLJJLI.W0(j, c587060N0u);
    }

    @Override // com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility
    public final C0PCY<C639820P7s> Wa0() {
        return this.LLILLL.Wa0();
    }

    @Override // com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility
    public final C0PCY<C0PRF> Wg1() {
        return this.LLILLL.Wg1();
    }

    @Override // com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility
    public final C0PCY<C663990Q2r> Ww1() {
        return this.LLILLL.Ww1();
    }

    @Override // com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility
    public final C0PCY<C0Q8M> Xf0() {
        return this.LLILLL.Xf0();
    }

    @Override // com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility
    public final C0PCY<C0PYD> Y30() {
        return this.LLILLL.Y30();
    }

    @Override // com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility
    public final C0PCY<C652150Pi1> Y52() {
        return this.LLILLL.Y52();
    }

    @Override // com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility
    public final C0PCY<C0PM7> ak0() {
        return this.LLILLL.ak0();
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.autoplay.SearchCardAutoplayableViewHolder, com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.top1.core.SearchComponentAbleViewHolder, X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        super.bindAbility(obj, cls);
        if (cls == ISearchCardElementVisibilityControlAbility.class) {
            this.LLIZLLLIL = (ISearchCardElementVisibilityControlAbility) obj;
        } else if (cls == ICardVisitedAbility.class) {
            this.LLJ = (ICardVisitedAbility) obj;
        }
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility
    public final C0PCY<C0PYA> cP2() {
        return this.LLILLL.cP2();
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.autoplay.SearchCardAutoplayableViewHolder, com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.top1.core.SearchComponentAbleViewHolder, X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{SearchCardScope.class, SearchCardScope.class});
    }

    @Override // com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility
    public final C0PCY<C0PC0> cp2() {
        return this.LLILLL.cp2();
    }

    @Override // com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility
    public final C0PCY<C639830P7t> dP0() {
        return this.LLILLL.dP0();
    }

    @Override // com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility
    public final void fe(C0PWT c0pwt) {
        this.LLILLL.fe(c0pwt);
    }

    @Override // com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility
    public final C0PCY<C647460PaS> gX() {
        return this.LLILLL.gX();
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.autoplay.SearchCardAutoplayableViewHolder, com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.top1.core.SearchComponentAbleViewHolder, X.C0QSJ
    public final Object getAbility(Class cls) {
        return cls == ISearchCardElementVisibilityControlAbility.class ? this.LLIZLLLIL : cls == ICardVisitedAbility.class ? this.LLJ : super.getAbility(cls);
    }

    @Override // X.C0SMO
    public final C0SZU<SearchCardViewHolder, InterfaceC655050Pmh> getChild() {
        return this.LLILZ.getChild();
    }

    @Override // X.InterfaceC648350Pbt
    public final View getDetectView() {
        return this.LLILLJJLI.getDetectView();
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LLILZ.getLifecycle();
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.autoplay.SearchCardAutoplayableViewHolder, com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.top1.core.SearchComponentAbleViewHolder, X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList(super.getParentScopes());
        arrayList.add(SearchCardScope.class);
        arrayList.add(SearchCardScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC648350Pbt
    public final InterfaceC584630MwP getPreload() {
        this.LLILLJJLI.getClass();
        return null;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.autoplay.SearchCardAutoplayableViewHolder, com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.top1.core.SearchComponentAbleViewHolder, X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList(super.getScopes());
        arrayList.add(SearchCardScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC648350Pbt
    public final boolean isPlaying() {
        return this.LLILLJJLI.isPlaying();
    }

    @Override // com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility
    public final C0PCY<C639840P7u> jy() {
        return this.LLILLL.jy();
    }

    @Override // X.InterfaceC713360RyY
    public final InterfaceC665370Q7z k0() {
        return this.LLILZ.k0();
    }

    @Override // X.InterfaceC648350Pbt
    public final boolean l2() {
        this.LLILLJJLI.getClass();
        return true;
    }

    @Override // com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility
    public final C0PCY<C0PCX> lI1() {
        return this.LLILLL.lI1();
    }

    @Override // X.InterfaceC650540PfQ
    public final boolean mm() {
        return this.LLILLJJLI.mm();
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        this.LLILZ.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility
    public final C0PCY<C0QDC> ov1() {
        return this.LLILLL.ov1();
    }

    @Override // com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility
    public final C0PCY<C0PM7> pR() {
        return this.LLILLL.pR();
    }

    @Override // X.InterfaceC648350Pbt
    public final void release() {
        this.LLILLJJLI.getClass();
    }

    @Override // X.InterfaceC648350Pbt
    public final void setPlayMetrics(C664400Q4g c664400Q4g) {
        this.LLILLJJLI.getClass();
    }

    @Override // X.InterfaceC648350Pbt
    public final void setPlayableLifecycleListener(InterfaceC659190PtN interfaceC659190PtN) {
        this.LLILLJJLI.getClass();
    }

    @Override // com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility
    public final C0PCY<C0PM7> uF() {
        return this.LLILLL.uF();
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.autoplay.SearchCardAutoplayableViewHolder, com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.top1.core.SearchComponentAbleViewHolder, X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        super.unbindAbility(obj, cls);
        if (cls == ISearchCardElementVisibilityControlAbility.class) {
            this.LLIZLLLIL = null;
        } else if (cls == ICardVisitedAbility.class) {
            this.LLJ = null;
        }
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility
    public final C0PCY<C646370PWx> wO2() {
        return this.LLILLL.wO2();
    }

    @Override // X.C0SMN
    public final void wY0() {
        this.LLILZ.wY0();
    }

    @Override // X.InterfaceC648350Pbt
    public final void wp(C650630PfZ c650630PfZ) {
        this.LLILLJJLI.wp(c650630PfZ);
    }

    @Override // com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility
    public final C0PCY<SearchBehaviorSignalState> yY1() {
        return this.LLILLL.yY1();
    }

    @Override // X.InterfaceC648350Pbt
    public final Boolean z3() {
        this.LLILLJJLI.getClass();
        return null;
    }

    @Override // com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility
    public final C0PCY<C0PYC> zJ2() {
        return this.LLILLL.zJ2();
    }

    @Override // X.C0SZQ
    public final String C0() {
        String strLIZLLL;
        return (((Number) C078C.LIZ.getValue()).intValue() != 1 || (strLIZLLL = C13LE.LIZ(this.LLILZLL.getClass()).LIZLLL()) == null) ? "" : strLIZLLL;
    }

    @Override // X.InterfaceC719640SKs
    public final LifecycleOwner E82() {
        return this.LLILZ.LLJJIJI;
    }

    @Override // X.InterfaceC648070PbR
    public final void H1() {
        this.LLILLJJLI.LLILLJJLI = null;
    }

    @Override // X.InterfaceC719640SKs
    public final View LJJIJL() {
        return this.LLILZ.LLJJ;
    }

    @Override // X.C0SMN
    public final ReusedUIAssem<?> NG1() {
        return this.LLILZ.LLJILLL;
    }

    @Override // X.InterfaceC719640SKs
    public final boolean PO1() {
        return this.LLILZ.LLILLL;
    }

    @Override // X.InterfaceC719640SKs
    public final C19EG getActivity() {
        return this.LLILZ.LLJJI;
    }

    @Override // X.InterfaceC648350Pbt
    public final String getDebugId() {
        C650350Pf7 c650350Pf7 = this.LLILLJJLI;
        c650350Pf7.getClass();
        return C655580PnY.LIZ(c650350Pf7);
    }

    @Override // X.InterfaceC648350Pbt
    public final C0PCQ getPriority() {
        return this.LLILLJJLI.LLILLL;
    }

    @Override // X.C0SMO
    public final C0SZS<SearchCardViewHolder, InterfaceC655050Pmh> getProxy() {
        return this.LLILZ.LLIZLLLIL;
    }

    @Override // X.C0SMN
    public final ViewModelStore md1() {
        return this.LLILZ.LLJIJIL;
    }

    @Override // X.InterfaceC648350Pbt
    @InterfaceC1294060jmO
    public final View p0() {
        C650350Pf7 c650350Pf7 = this.LLILLJJLI;
        c650350Pf7.getClass();
        return C655580PnY.LIZIZ(c650350Pf7);
    }

    @Override // X.InterfaceC626240OhK
    public final IAdjustAbility v1() {
        return (IAdjustAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this.LLILZ.LLJILLL), IAdjustAbility.class, null);
    }

    @Override // X.InterfaceC648070PbR
    public final void LLILLIZIL(InterfaceC665370Q7z interfaceC665370Q7z) {
        this.LLILLJJLI.LLILLJJLI = interfaceC665370Q7z;
    }

    @Override // X.InterfaceC639340P5w
    public final void LLLIZZ(boolean z) {
        if (this.LLILZLL.getConfig().LIZLLL() == C0PHM.ONE_COLUMN) {
            C650240Pew.LIZ.getClass();
            int i = C650240Pew.LIZJ;
            if (z) {
                this.itemView.setPaddingRelative(i, i, i / 2, 0);
            } else {
                this.itemView.setPaddingRelative(i / 2, i, i, 0);
            }
        }
    }

    @Override // X.C0SMO
    public final void setProxy(C0SZS<SearchCardViewHolder, InterfaceC655050Pmh> c0szs) {
        this.LLILZ.LLIZLLLIL = c0szs;
    }

    @Override // X.C0SMN
    public final void SN1(int i, InterfaceC655050Pmh interfaceC655050Pmh) {
        this.LLILZ.LLJJJJLIIL(i, interfaceC655050Pmh, null);
    }

    public final void I5(int i, InterfaceC594520NTm interfaceC594520NTm, ClickSearchViewModel clickSearchViewModel, boolean z) {
        ClickSearchTriggerAbility clickSearchTriggerAbility;
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ = C1558420qem.LIZIZ(this);
        InterfaceC655050Pmh interfaceC655050PmhU42 = this.LLILZLL.U42(interfaceC594520NTm);
        ((InterfaceC641760PFe) this.LLIZ.getValue()).LIZ(interfaceC665370Q7zLIZIZ, interfaceC594520NTm, interfaceC655050PmhU42);
        if (C650240Pew.LIZ() && this.LLILZLL.getConfig().LIZLLL() == C0PHM.ONE_COLUMN) {
            C659720PuE.LIZ.getClass();
            if (C659720PuE.LIZ()) {
                C648880Pck.LIZJ(this.itemView);
                C21565319aV.LIZIZ(this.itemView, Float.valueOf(C1839807Im.LIZ()), null, null, null, null, 30);
            } else {
                C648880Pck.LIZIZ(this.itemView);
                C21565319aV.LIZIZ(this.itemView, Float.valueOf(0.0f), null, null, null, null, 30);
                C650240Pew.LIZ.getClass();
                int i2 = C650240Pew.LIZJ;
                if (z) {
                    this.itemView.setPaddingRelative(i2, i2, i2 / 2, 0);
                } else {
                    this.itemView.setPaddingRelative(i2 / 2, i2, i2, 0);
                }
            }
        }
        if (C1823007Ca.LIZ()) {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onReusedBind: ");
                sbLIZ.append(this);
                sbLIZ.append(", ");
                sbLIZ.append(i);
                sbLIZ.append(' ');
                sbLIZ.append(interfaceC655050PmhU42);
                C2344809Gs.LJFF("AssemList_SearchCardVH", C2188811AlT.LIZIZ(sbLIZ));
                this.LLILZ.LLJJJJLIIL(i, interfaceC655050PmhU42, null);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("onReusedBind meet error, ");
                sbLIZ2.append(e);
                C2344809Gs.LJFF("AssemList_SearchCardVH", C2188811AlT.LIZIZ(sbLIZ2));
                C0Q45 c0q45 = C0Q45.COMMON;
                EnumC665990QAj enumC665990QAj = EnumC665990QAj.LIST;
                Exception exc = new Exception();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("cardPosition", String.valueOf(i));
                linkedHashMap.put("cardProtocol", this.LLILZLL.getClass().getSimpleName());
                C664410Q4h.LIZIZ(c0q45, enumC665990QAj, exc, "SearchModularizationReuseBindError", C2097608Jq.LJ(), linkedHashMap, "search");
            }
        } else {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("onReusedBind: ");
            sbLIZ3.append(this);
            sbLIZ3.append(", ");
            sbLIZ3.append(i);
            sbLIZ3.append(' ');
            sbLIZ3.append(interfaceC655050PmhU42);
            C2344809Gs.LJFF("AssemList_SearchCardVH", C2188811AlT.LIZIZ(sbLIZ3));
            this.LLILZ.LLJJJJLIIL(i, interfaceC655050PmhU42, null);
        }
        this.LLILLJJLI.LLILLJJLI = interfaceC665370Q7zLIZIZ;
        if (clickSearchViewModel != null && (clickSearchTriggerAbility = (ClickSearchTriggerAbility) C1558520qew.LIZ(C1558420qem.LIZIZ(this), ClickSearchTriggerAbility.class, null)) != null) {
            clickSearchTriggerAbility.JD(clickSearchViewModel);
        }
        if (interfaceC655050PmhU42 instanceof InterfaceC645880PVa) {
            ISearchContextAbility iSearchContextAbilityLIZ = C0Q3E.LIZ(this.itemView);
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            InterfaceC645880PVa interfaceC645880PVa = (InterfaceC645880PVa) interfaceC655050PmhU42;
            linkedHashMap2.putAll(interfaceC645880PVa.LLIZLLLIL().LIZIZ());
            linkedHashMap2.putAll(interfaceC645880PVa.LLIZLLLIL().LIZ());
            linkedHashMap2.putAll(interfaceC645880PVa.LLIZLLLIL().LIZLLL());
            linkedHashMap2.putAll(interfaceC645880PVa.LLIZLLLIL().LIZJ());
            iSearchContextAbilityLIZ.fe(new C0PCG(linkedHashMap2));
        }
    }

    public SearchCardViewHolder(View view, LifecycleOwner lifecycleOwner, C0SZT c0szt, ISearchCardProtocol iSearchCardProtocol, Function0 function0, SearchContextAbilityImpl searchContextAbilityImpl) {
        super(view);
        this.LLILLJJLI = new C650350Pf7(view);
        this.LLILLL = searchContextAbilityImpl;
        AssemReusedVHContainer<SearchCardViewHolder, InterfaceC655050Pmh> assemReusedVHContainer = new AssemReusedVHContainer<>(lifecycleOwner, c0szt, iSearchCardProtocol.IM2(), view, function0);
        this.LLILZ = assemReusedVHContainer;
        this.LLILZIL = lifecycleOwner;
        this.LLILZLL = iSearchCardProtocol;
        this.LLIZ = C452501pT.LIZIZ(new AwS411S0200000_10(this, view, 113));
        Sl0(view.findViewById(R.id.u7z), this);
        if (((Boolean) C0BCQ.LIZ.getValue()).booleanValue() && ((Set) C0BCQ.LIZIZ.getValue()).contains(iSearchCardProtocol.getClass())) {
            assemReusedVHContainer.LLJILJILJ();
        }
    }
}
