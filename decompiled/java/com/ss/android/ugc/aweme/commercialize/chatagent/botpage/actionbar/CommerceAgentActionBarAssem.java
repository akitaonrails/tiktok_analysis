package com.ss.android.ugc.aweme.commercialize.chatagent.botpage.actionbar;

import X.C019F;
import X.C13IQ;
import X.C13LE;
import X.C1558520qew;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C322770Cl1;
import X.C724750Sbp;
import X.InterfaceC2217461Bqa;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.commercialize.chatagent.api.model.CommerceAgentActionBarItem;
import com.ss.android.ugc.aweme.commercialize.chatagent.botpage.actionbar.model.CommerceAgentActiveActionItem;
import com.ss.android.ugc.aweme.commercialize.chatagent.botpage.cards.sug.CommerceAgentSugDataVM;
import com.ss.android.ugc.aweme.commercialize.chatagent.botpage.vm.ability.IMessageAbility;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS583S0100000_4;
import kotlin.jvm.internal.AwS595S0100000_16;

/* JADX INFO: loaded from: classes17.dex */
public final class CommerceAgentActionBarAssem extends CommerceAgentBottomBarAssem<CommerceAgentActiveActionItem> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJLIIL;
    public final AssemVMLazy LLJJJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CommerceAgentActionBarAssem.class, "sugVM", "getSugVM()Lcom/ss/android/ugc/aweme/commercialize/chatagent/botpage/cards/sug/CommerceAgentSugDataVM;", 0);
        C13LE.LIZ.getClass();
        LLJJJJLIIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public CommerceAgentActionBarAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(CommerceAgentSugDataVM.class);
        this.LLJJJJJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS560S0100000_16((C13IQ) c19719912DlLIZ, 152), AFwS252S0000000_16.get$arr$(108), null, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void hp(java.util.List<com.ss.android.ugc.aweme.commercialize.chatagent.api.model.CommerceAgentActionBarItem> r22) {
        /*
            Method dump skipped, instruction units count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.chatagent.botpage.actionbar.CommerceAgentActionBarAssem.hp(java.util.List):void");
    }

    @Override // com.ss.android.ugc.aweme.commercialize.chatagent.botpage.actionbar.CommerceAgentBottomBarAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        AssemVMLazy assemVMLazy = this.LLJJJJJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJLIIL;
        hp(((CommerceAgentSugDataVM) assemVMLazy.getValue()).LL);
        IMessageAbility iMessageAbility = (IMessageAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IMessageAbility.class, null);
        if (iMessageAbility != null) {
            iMessageAbility.Zd(new AwS595S0100000_16(this, 329));
        }
        AssemViewModel.selectSubscribe$default(this.LLJJJJJIL.getValue(), C322770Cl1.LL, null, null, null, new AwS583S0100000_4(new AwS595S0100000_16(this, 330), (Function1<? super List<CommerceAgentActionBarItem>, Unit>) 9), 14, null);
    }
}
