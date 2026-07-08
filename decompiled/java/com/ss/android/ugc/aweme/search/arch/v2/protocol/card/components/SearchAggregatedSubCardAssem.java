package com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components;

import X.C01GW;
import X.C03H5;
import X.C07BZ;
import X.C0PCQ;
import X.C0PRC;
import X.C0Q3E;
import X.C0QSJ;
import X.C1558420qem;
import X.C1558520qew;
import X.C452501pT;
import X.C473401sq;
import X.C587060N0u;
import X.C646370PWx;
import X.C650350Pf7;
import X.C650630PfZ;
import X.C654760PmE;
import X.C655580PnY;
import X.C664400Q4g;
import X.C673150Qan;
import X.C687700QyG;
import X.InterfaceC1146704e9;
import X.InterfaceC1294060jmO;
import X.InterfaceC1891350zJl;
import X.InterfaceC584630MwP;
import X.InterfaceC645880PVa;
import X.InterfaceC648070PbR;
import X.InterfaceC658500PsG;
import X.InterfaceC659190PtN;
import X.InterfaceC665370Q7z;
import X.InterfaceC687730QyJ;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.ext_power_list.AssemPowerCell;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.scope.SearchPlayerScope;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.ability.SearchTopFragmentAbility;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS624S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public abstract class SearchAggregatedSubCardAssem<ASSEM extends ReusedUISlotAssem<? extends C03H5>, T extends InterfaceC1891350zJl> extends AssemPowerCell<ASSEM, T> implements InterfaceC648070PbR, C0QSJ, InterfaceC1146704e9 {
    public static final /* synthetic */ int LLJI = 0;
    public final /* synthetic */ C650350Pf7 LLIZ = new C650350Pf7(null);
    public boolean LLIZLLLIL;
    public InterfaceC658500PsG LLJ;

    @Override // X.InterfaceC648350Pbt
    public final boolean L0() {
        this.LLIZ.getClass();
        return true;
    }

    @Override // X.InterfaceC648350Pbt
    public final void LJJJLIIL() {
        this.LLIZ.LJJJLIIL();
    }

    @Override // X.InterfaceC648350Pbt
    public final void LJJLIIIJLLLLLLLZ() {
        this.LLIZ.LJJLIIIJLLLLLLLZ();
    }

    @Override // X.InterfaceC648350Pbt
    public final boolean LLLLIIIILLL() {
        this.LLIZ.getClass();
        return true;
    }

    @Override // X.InterfaceC648350Pbt
    public final void LLZZZIL(C587060N0u c587060N0u) {
        this.LLIZ.getClass();
    }

    @Override // X.InterfaceC648350Pbt
    public final void Mu(C650630PfZ c650630PfZ) {
        this.LLIZ.Mu(c650630PfZ);
    }

    @Override // X.InterfaceC648350Pbt
    public final boolean N1() {
        return this.LLIZ.N1();
    }

    public abstract ASSEM R5();

    @Override // X.InterfaceC648350Pbt
    public final void W0(long j, C587060N0u c587060N0u) {
        this.LLIZ.W0(j, c587060N0u);
    }

    @Override // X.C0QSJ
    public void bindAbility(Object obj, Class cls) {
        if (cls == InterfaceC658500PsG.class) {
            this.LLJ = (InterfaceC658500PsG) obj;
        }
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{SearchPlayerScope.class});
    }

    @Override // X.C0QSJ
    public Object getAbility(Class cls) {
        if (cls == InterfaceC658500PsG.class) {
            return this.LLJ;
        }
        return null;
    }

    @Override // X.InterfaceC648350Pbt
    public final View getDetectView() {
        return this.LLIZ.getDetectView();
    }

    @Override // X.InterfaceC1146704e9
    public List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SearchPlayerScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC648350Pbt
    public final InterfaceC584630MwP getPreload() {
        this.LLIZ.getClass();
        return null;
    }

    @Override // X.C0QSJ
    public List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SearchPlayerScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC648350Pbt
    public final boolean isPlaying() {
        return this.LLIZ.isPlaying();
    }

    @Override // X.InterfaceC648350Pbt
    public final boolean l2() {
        this.LLIZ.getClass();
        return true;
    }

    @Override // X.InterfaceC650540PfQ
    public final boolean mm() {
        return this.LLIZ.mm();
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.InterfaceC648350Pbt
    public final void release() {
        this.LLIZ.getClass();
    }

    @Override // X.InterfaceC648350Pbt
    public final void setPlayMetrics(C664400Q4g c664400Q4g) {
        this.LLIZ.getClass();
    }

    @Override // X.InterfaceC648350Pbt
    public final void setPlayableLifecycleListener(InterfaceC659190PtN interfaceC659190PtN) {
        this.LLIZ.getClass();
    }

    @Override // X.C0QSJ
    public void unbindAbility(Object obj, Class cls) {
        if (cls == InterfaceC658500PsG.class) {
            this.LLJ = null;
        }
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.InterfaceC648350Pbt
    public final void wp(C650630PfZ c650630PfZ) {
        this.LLIZ.wp(c650630PfZ);
    }

    @Override // X.InterfaceC648350Pbt
    public final Boolean z3() {
        this.LLIZ.getClass();
        return null;
    }

    @Override // X.InterfaceC648070PbR
    public final void H1() {
        this.LLIZ.LLILLJJLI = null;
    }

    @Override // X.InterfaceC648350Pbt
    public final String getDebugId() {
        C650350Pf7 c650350Pf7 = this.LLIZ;
        c650350Pf7.getClass();
        return C655580PnY.LIZ(c650350Pf7);
    }

    @Override // X.InterfaceC648350Pbt
    public final C0PCQ getPriority() {
        return this.LLIZ.LLILLL;
    }

    @Override // X.InterfaceC648350Pbt
    @InterfaceC1294060jmO
    public final View p0() {
        C650350Pf7 c650350Pf7 = this.LLIZ;
        c650350Pf7.getClass();
        return C655580PnY.LIZIZ(c650350Pf7);
    }

    @Override // com.bytedance.ext_power_list.AssemPowerCell
    public final ASSEM I5() {
        return (ASSEM) R5();
    }

    public final void S5() {
        ISearchContextAbility iSearchContextAbilityLJI;
        String str;
        InterfaceC645880PVa interfaceC645880PVa;
        InterfaceC665370Q7z interfaceC665370Q7zLJIILIIL = C1558520qew.LJIILIIL(this);
        if (interfaceC665370Q7zLJIILIIL == null || (iSearchContextAbilityLJI = (ISearchContextAbility) C1558520qew.LIZ(interfaceC665370Q7zLJIILIIL, ISearchContextAbility.class, null)) == null) {
            iSearchContextAbilityLJI = C0Q3E.LJI();
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        C654760PmE c654760PmE = new C654760PmE(null);
        C0PRC c0prc = (C0PRC) iSearchContextAbilityLJI.Ph1().LIZJ();
        c654760PmE.LJJIIZI(c0prc.LLILLL);
        c654760PmE.LJIIZILJ("search_keyword", c0prc.LLIZLLLIL);
        C646370PWx c646370PWx = (C646370PWx) iSearchContextAbilityLJI.wO2().LIZJ();
        c654760PmE.LJIJJ(c646370PWx.LLILLL);
        c654760PmE.LJJIIZ(Integer.valueOf(c646370PWx.LLILZLL));
        Integer numValueOf = Integer.valueOf(c646370PWx.LLILZ);
        if (numValueOf != null) {
            c654760PmE.LJIIZILJ("is_quote_video", String.valueOf(numValueOf.intValue()));
        }
        c654760PmE.LJIIZILJ("is_page", str);
        c654760PmE.LJJIJIL(c646370PWx.LLILZIL);
        Integer num = c646370PWx.LLJILJIL;
        if (num != null) {
            c654760PmE.LIZLLL(num.intValue(), "universal_rank");
            c654760PmE.LJ("insert_type", c646370PWx.LLJILJILJ);
        }
        T item = getItem();
        if ((item instanceof InterfaceC645880PVa) && (interfaceC645880PVa = (InterfaceC645880PVa) item) != null) {
            c654760PmE.LJIJ(interfaceC645880PVa.LLIZLLLIL().LIZLLL());
        }
        c654760PmE.LJIILJJIL();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        super.onViewAttachedToWindow();
        if (C07BZ.LIZ()) {
            return;
        }
        S5();
    }

    @Override // X.InterfaceC648070PbR
    public final void LLILLIZIL(InterfaceC665370Q7z interfaceC665370Q7z) {
        this.LLIZ.LLILLJJLI = interfaceC665370Q7z;
    }

    @Override // com.bytedance.ext_power_list.AssemPowerCell
    /* JADX INFO: renamed from: N5 */
    public final void SN1(int i, T t) {
        P5(t);
        this.LLIZ.LLILLJJLI = C1558420qem.LIZIZ(this);
        if (C07BZ.LIZ() && !this.LLIZLLLIL) {
            this.LLIZLLLIL = true;
            C473401sq.LIZIZ(this.itemView, new AwS554S0100000_10(C452501pT.LIZIZ(new AwS554S0100000_10((SearchAggregatedSubCardAssem) this, 206)), (C01GW<? extends SearchTopFragmentAbility>) 204), 0.0f, new AwS554S0100000_10((InterfaceC1891350zJl) t, 205), false, null, new AwS624S0100000_10(this, 13), 26);
        }
    }

    @Override // com.bytedance.ext_power_list.AssemPowerCell, X.C0SMN
    public final /* bridge */ /* synthetic */ void SN1(int i, Object obj) {
        SN1(i, (InterfaceC1891350zJl) obj);
    }
}
