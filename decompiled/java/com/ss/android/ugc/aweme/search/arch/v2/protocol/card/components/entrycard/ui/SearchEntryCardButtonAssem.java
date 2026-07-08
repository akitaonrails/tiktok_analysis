package com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.entrycard.ui;

import X.C07E5;
import X.C13IQ;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C197039127h;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C656240Poc;
import X.C683100Qqq;
import X.C723580SZw;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS145S0100000_10;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.entrycard.viewmodel.SearchEntranceVM;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS446S0200000_10;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchEntryCardButtonAssem extends ReusedUISlotAssem<SearchEntryCardButtonAssem> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLIL;
    public final AssemVMLazy LLJJLIIIJLLLLLLLZ;
    public final C1559260qg8 LLJL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SearchEntryCardButtonAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/search/arch/v2/protocol/card/components/entrycard/viewmodel/SearchEntranceVM;", 0);
        C13LE.LIZ.getClass();
        LLJLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public SearchEntryCardButtonAssem() {
        C683100Qqq c683100Qqq = C683100Qqq.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SearchEntranceVM.class);
        this.LLJJLIIIJLLLLLLLZ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c683100Qqq, C1637806bA.LIZ, new AwS554S0100000_10((C13IQ) c19719912DlLIZ, 236), AFwS241S0000000_10.get$arr$(143), null, true);
        this.LLJL = new C1559260qg8(new C723580SZw(this, C656240Poc.class, null), checkSupervisorPrepared());
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.ev1;
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
        C197039127h c197039127h = (C197039127h) view.findViewById(R.id.yzw);
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.i4z);
        AssemVMLazy assemVMLazy = this.LLJJLIIIJLLLLLLLZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLIL;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0Qqp
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C683130Qqt) obj).LLILZLL;
            }
        }, null, new AwS446S0200000_10(c197039127h, frameLayout, 1), 6);
        C656240Poc c656240Poc = (C656240Poc) this.LLJL.getValue();
        if (c656240Poc != null && (function0 = c656240Poc.LLILZIL) != null) {
            C786410Ut5.U8(c197039127h, new ACListenerS145S0100000_10(function0, 12));
        }
    }
}
