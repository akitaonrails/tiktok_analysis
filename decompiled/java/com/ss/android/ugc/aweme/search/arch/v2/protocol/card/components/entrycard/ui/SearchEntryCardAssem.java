package com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.entrycard.ui;

import X.C07E5;
import X.C0R46;
import X.C13IQ;
import X.C13LE;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1954807lC;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C423870Gjh;
import X.C423880Gji;
import X.C423920Gjm;
import X.C427690Gpr;
import X.C656240Poc;
import X.C683100Qqq;
import X.C683110Qqr;
import X.C683130Qqt;
import X.C723580SZw;
import X.C723830SaL;
import X.C724750Sbp;
import X.C786410Ut5;
import X.InterfaceC1587906Jp;
import X.InterfaceC2217461Bqa;
import X.InterfaceC423860Gjg;
import X.InterfaceC423930Gjn;
import X.InterfaceC712990Rxx;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.commercialize.ability.CustomBgGradientAbility;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.entrycard.ISearchEntryCardAbility;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.entrycard.viewmodel.SearchEntranceVM;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS376S0200000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS589S0100000_10;
import wh6.AbS692S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchEntryCardAssem extends ReusedUISlotAssem<SearchEntryCardAssem> implements InterfaceC712990Rxx<Object>, ISearchEntryCardAbility {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLIL;
    public final AssemVMLazy LLJJLIIIJLLLLLLLZ;
    public final C1559260qg8 LLJL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SearchEntryCardAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/search/arch/v2/protocol/card/components/entrycard/viewmodel/SearchEntranceVM;", 0);
        C13LE.LIZ.getClass();
        LLJLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public SearchEntryCardAssem() {
        C683100Qqq c683100Qqq = C683100Qqq.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SearchEntranceVM.class);
        this.LLJJLIIIJLLLLLLLZ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c683100Qqq, C1637806bA.LIZ, new AwS554S0100000_10((C13IQ) c19719912DlLIZ, 235), AFwS241S0000000_10.get$arr$(142), null, true);
        this.LLJL = new C1559260qg8(new C723580SZw(this, C656240Poc.class, null), checkSupervisorPrepared());
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.ev2;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final boolean ur(Object obj) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final void vr(Object obj) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.entrycard.ISearchEntryCardAbility
    public final SearchEntranceVM vm() {
        AssemVMLazy assemVMLazy = this.LLJJLIIIJLLLLLLLZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLIL;
        return (SearchEntranceVM) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final Context So(Context context) {
        if (C07E5.LIZ()) {
            return LJJIJL().getContext();
        }
        return context;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        Function0<Unit> function0;
        Function0<Unit> function02;
        C723830SaL.LIZ(this, null, new AwS589S0100000_10(this, 120));
        C656240Poc c656240Poc = (C656240Poc) this.LLJL.getValue();
        if (c656240Poc != null && (function02 = c656240Poc.LLILLJJLI) != null) {
            C786410Ut5.I7(new AbS692S0100000_10(function02, 1), view);
            C427690Gpr.LJ(view, 0.0f);
        }
        C656240Poc c656240Poc2 = (C656240Poc) this.LLJL.getValue();
        if (c656240Poc2 != null && (function0 = c656240Poc2.LLILLL) != null) {
            view.setOnLongClickListener(new C0R46(function0, 1));
            C427690Gpr.LJ(view, 0.0f);
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(Object obj) {
        Function0<C683110Qqr> function0;
        C683110Qqr c683110QqrInvoke;
        C683130Qqt c683130Qqt;
        CustomBgGradientAbility customBgGradientAbility = (CustomBgGradientAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), CustomBgGradientAbility.class, null);
        if (customBgGradientAbility != null) {
            customBgGradientAbility.pL0(this);
        }
        C656240Poc c656240Poc = (C656240Poc) this.LLJL.getValue();
        if (c656240Poc != null && (function0 = c656240Poc.LL) != null && (c683110QqrInvoke = function0.invoke()) != null) {
            AssemVMLazy assemVMLazy = this.LLJJLIIIJLLLLLLLZ;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLIL;
            AssemViewModel value = assemVMLazy.getValue();
            InterfaceC423930Gjn interfaceC423930Gjn = c683110QqrInvoke.LLILLJJLI;
            if (interfaceC423930Gjn instanceof C423920Gjm) {
                c683130Qqt = new C683130Qqt(null, null, null, ((C423920Gjm) interfaceC423930Gjn).LIZ, 47);
            } else if (interfaceC423930Gjn instanceof C423880Gji) {
                C423880Gji c423880Gji = (C423880Gji) interfaceC423930Gjn;
                List<InterfaceC423860Gjg> list = c423880Gji.LIZ;
                List<InterfaceC423860Gjg> list2 = c423880Gji.LIZIZ;
                List<InterfaceC423860Gjg> list3 = c423880Gji.LIZJ;
                if (list == null) {
                    return;
                }
                if (list2 == null && list3 == null) {
                    c683130Qqt = new C683130Qqt(new C423870Gjh(2, list), null, null, null, 61);
                } else {
                    if (list == null) {
                        return;
                    }
                    if (list2 != null) {
                        if (list3 == null) {
                            c683130Qqt = new C683130Qqt(new C423870Gjh(1, list), new C423870Gjh(2, list2), null, null, 57);
                        } else {
                            c683130Qqt = new C683130Qqt(new C423870Gjh(1, list), new C423870Gjh(1, list2), new C423870Gjh(1, list3), null, 49);
                        }
                    } else if (list3 == null) {
                        return;
                    } else {
                        c683130Qqt = new C683130Qqt(new C423870Gjh(1, list), null, new C423870Gjh(2, list3), null, 53);
                    }
                }
            } else {
                throw new C1954807lC();
            }
            value.setState(new AwS376S0200000_10(c683130Qqt, c683110QqrInvoke, 86));
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
