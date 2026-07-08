package com.ss.android.ugc.aweme.im.sdk.chat.ui.aweme;

import X.C019F;
import X.C0ZL0;
import X.C0ZQI;
import X.C13IQ;
import X.C13LE;
import X.C1562980qm8;
import X.C1637806bA;
import X.C19719912Dl;
import X.C1EEP;
import X.C2217381BqS;
import X.C461060I6e;
import X.C461240I6w;
import X.C462820ICy;
import X.C462830ICz;
import X.C5182020e;
import X.C724750Sbp;
import X.C869590Y9l;
import X.C898580ZMy;
import X.InterfaceC2187708hf;
import X.InterfaceC2217461Bqa;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.im.message.template.card.AwemeCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.BaseUserComponent;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutPowerCell;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutReusedUISlotAssemSend;
import com.ss.android.ugc.aweme.im.viewmodel.PanelStateViewModel;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.AwS593S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class AwemeCardSendPowerCell extends IMSkeletonLayoutPowerCell<IMSkeletonLayoutReusedUISlotAssemSend, C462820ICy> {
    public final C1EEP LLJJJIL = C1EEP.LIZ;

    @Override // com.bytedance.ext_power_list.AssemPowerCell
    public final ReusedUISlotAssem I5() {
        final C19719912Dl c19719912DlLIZ = C13LE.LIZ(AwemeCardAssem.class);
        return new IMSkeletonLayoutReusedUISlotAssemSend(c19719912DlLIZ) { // from class: com.ss.android.ugc.aweme.im.sdk.chat.ui.aweme.AwemeCardSendPowerCell$createAssemAttached2Cell$1
            public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIIIL;
            public final AssemVMLazy LLLIIII;

            static {
                C2217381BqS c2217381BqS = new C2217381BqS(AwemeCardSendPowerCell$createAssemAttached2Cell$1.class, "panelStateVM", "getPanelStateVM()Lcom/ss/android/ugc/aweme/im/viewmodel/PanelStateViewModel;", 0);
                C13LE.LIZ.getClass();
                LLLIIIL = new InterfaceC2217461Bqa[]{c2217381BqS};
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutReusedUISlotAssem
            public final void Tp() {
                C869590Y9l c869590Y9l;
                C462820ICy c462820ICy;
                AwemeCardTemplate awemeCardTemplateLIZIZ;
                BaseUserComponent baseUserComponent;
                Long l;
                Map<String, String> localExt;
                C462820ICy c462820ICy2 = (C462820ICy) this.LLLIIIIL.getItem();
                if (c462820ICy2 == null || (c869590Y9l = c462820ICy2.LL.LIZ.LIZ) == null || (c462820ICy = (C462820ICy) this.LLLIIIIL.getItem()) == null || (awemeCardTemplateLIZIZ = C462830ICz.LIZIZ(c462820ICy)) == null || (baseUserComponent = awemeCardTemplateLIZIZ.baseUserComponent) == null || (l = baseUserComponent.userId) == null) {
                    return;
                }
                long jLongValue = l.longValue();
                if (!C461060I6e.LIZ(c869590Y9l) || (localExt = c869590Y9l.getLocalExt()) == null) {
                    return;
                }
                C898580ZMy.LIZJ(String.valueOf(jLongValue), localExt);
            }

            @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutReusedUISlotAssemSend, com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.AbsSkeletonLayoutReusedUISlotAssem
            public final void op() {
                super.op();
                sp(new AwS593S0100000_14(this, 86));
            }

            @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutReusedUISlotAssem
            public final List<C1562980qm8<C0ZL0>> Gp(C869590Y9l c869590Y9l) {
                C0ZQI c0zqiUp = Up();
                AssemVMLazy assemVMLazy = this.LLLIIII;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLIIIL;
                return C461240I6w.LIZ(null, null, c869590Y9l, null, null, c0zqiUp, (PanelStateViewModel) assemVMLazy.getValue());
            }

            {
                C019F c019f = C019F.LIZ;
                C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(PanelStateViewModel.class);
                this.LLLIIII = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, C1637806bA.LIZ, new C5182020e((C13IQ) c19719912DlLIZ2, 613), AFwS237S0000000_7.get$arr$(358), null, true);
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutPowerCell
    public final InterfaceC2187708hf T5() {
        return this.LLJJJIL;
    }
}
