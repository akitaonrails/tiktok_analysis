package com.ss.android.ugc.aweme.commercialize.chatagent.botpage.actionbar;

import X.C019F;
import X.C0DJ1;
import X.C1076890e87;
import X.C1076930e8B;
import X.C13LE;
import X.C1558520qew;
import X.C1602160rnK;
import X.C1637806bA;
import X.C1697810uHb;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C322770Cl1;
import X.C436690HAl;
import X.C724750Sbp;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.commercialize.chatagent.api.model.CommerceAgentActionBarItem;
import com.ss.android.ugc.aweme.commercialize.chatagent.botpage.actionbar.model.CommerceAgentActiveActionItem;
import com.ss.android.ugc.aweme.commercialize.chatagent.botpage.cards.sug.CommerceAgentSugDataVM;
import com.ss.android.ugc.aweme.commercialize.chatagent.botpage.vm.ability.IMessageAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS583S0100000_4;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class CommerceAgentSevenTopActionBarAssem extends CommerceAgentBottomBarTopAssem<CommerceAgentActiveActionItem> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJJIL;
    public final AssemVMLazy LLJJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CommerceAgentSevenTopActionBarAssem.class, "sugVM", "getSugVM()Lcom/ss/android/ugc/aweme/commercialize/chatagent/botpage/cards/sug/CommerceAgentSugDataVM;", 0);
        C13LE.LIZ.getClass();
        LLJJJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public CommerceAgentSevenTopActionBarAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(CommerceAgentSugDataVM.class);
        this.LLJJJJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 129), AFwS252S0000000_16.get$arr$(111), null, true);
    }

    public final void hp(List<CommerceAgentActionBarItem> list) {
        Integer numValueOf;
        LinearLayout linearLayout;
        View viewTd;
        Context context = getContext();
        if (context == null) {
            return;
        }
        if (list != null) {
            int i = 0;
            for (CommerceAgentActionBarItem commerceAgentActionBarItem : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    CommerceAgentActionBarItem commerceAgentActionBarItem2 = commerceAgentActionBarItem;
                    if (Intrinsics.LJFF(commerceAgentActionBarItem2.type, "send")) {
                        Collection collection = this.LLJJIJIIJIL;
                        C1076890e87 c1076890e87 = new C1076890e87(context);
                        c1076890e87.setRenderData(new C1076930e8B(commerceAgentActionBarItem2.id, String.valueOf(commerceAgentActionBarItem2.name), String.valueOf(i), commerceAgentActionBarItem2.enterHint, commerceAgentActionBarItem2.exitHint, commerceAgentActionBarItem2.name, commerceAgentActionBarItem2.hint));
                        ((ArrayList) collection).add(c1076890e87);
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        if (!this.LLJJJ) {
            this.LLJJJ = true;
            FrameLayout frameLayout = this.LLJJI;
            if (frameLayout != null && (viewTd = C786410Ut5.Td(C786410Ut5.ne(frameLayout.getContext()), R.layout.ajp, null, false)) != null) {
                frameLayout.addView(viewTd);
                this.LLJJIII = (C436690HAl) viewTd.findViewById(R.id.efh);
                this.LLJJIJI = (LinearLayout) viewTd.findViewById(R.id.eff);
                C0DJ1.LIZIZ(viewTd.findViewById(R.id.efg));
            }
        }
        LinearLayout linearLayout2 = this.LLJJIJI;
        if (linearLayout2 != null && (numValueOf = Integer.valueOf(linearLayout2.getChildCount())) != null && numValueOf.intValue() > 0 && (linearLayout = this.LLJJIJI) != null) {
            C786410Ut5.LJJJJJL(linearLayout);
        }
        if (!((ArrayList) this.LLJJIJIIJIL).isEmpty()) {
            CommerceAgentActiveActionItem commerceAgentActiveActionItem = this.LLJJIJIL;
            if (commerceAgentActiveActionItem != null && commerceAgentActiveActionItem.id > 0) {
                C436690HAl c436690HAl = this.LLJJIII;
                if (c436690HAl != null && c436690HAl.getVisibility() != 0) {
                    C786410Ut5.LJLLLLLL(0, c436690HAl);
                }
            } else {
                C436690HAl c436690HAl2 = this.LLJJIII;
                if (c436690HAl2 != null && c436690HAl2.getVisibility() != 0) {
                    C786410Ut5.LJLLLLLL(0, c436690HAl2);
                }
            }
            for (View view : (ArrayList) this.LLJJIJIIJIL) {
                LinearLayout linearLayout3 = this.LLJJIJI;
                if (linearLayout3 != null) {
                    linearLayout3.addView(view);
                }
            }
            return;
        }
        C436690HAl c436690HAl3 = this.LLJJIII;
        if (c436690HAl3 != null) {
            int visibility = c436690HAl3.getVisibility();
            c436690HAl3.setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, c436690HAl3);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.chatagent.botpage.actionbar.CommerceAgentBottomBarTopAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        AssemVMLazy assemVMLazy = this.LLJJJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJJIL;
        hp(((CommerceAgentSugDataVM) assemVMLazy.getValue()).LL);
        IMessageAbility iMessageAbility = (IMessageAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IMessageAbility.class, null);
        if (iMessageAbility != null) {
            iMessageAbility.Zd(new AwS595S0100000_16(this, 331));
        }
        AssemViewModel.selectSubscribe$default(this.LLJJJJ.getValue(), C322770Cl1.LL, null, null, null, new AwS583S0100000_4(new AwS595S0100000_16(this, 332), (Function1<? super List<CommerceAgentActionBarItem>, Unit>) 9), 14, null);
    }
}
