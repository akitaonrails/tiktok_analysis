package com.ss.android.ugc.aweme.im.messagelist.protocols;

import X.C019F;
import X.C0I6Y;
import X.C0ZL0;
import X.C0ZLF;
import X.C0ZQB;
import X.C13IQ;
import X.C13LE;
import X.C1562980qm8;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C5182020e;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C869590Y9l;
import X.C900010ZSl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC461380I7k;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.im.messagelist.api.dynamic.DynamicCardViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutPowerCell;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutReusedUISlotAssemReceive;
import java.util.List;
import kotlin.jvm.internal.AFwS248S0000000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class DynamicCardReceivePowerCell extends IMSkeletonLayoutPowerCell<IMSkeletonLayoutReusedUISlotAssemReceive, C900010ZSl> {
    @Override // com.bytedance.ext_power_list.AssemPowerCell
    public final ReusedUISlotAssem I5() {
        final C19719912Dl c19719912DlLIZ = C13LE.LIZ(DynamicCardReusedUISlot.class);
        return new IMSkeletonLayoutReusedUISlotAssemReceive(c19719912DlLIZ) { // from class: com.ss.android.ugc.aweme.im.messagelist.protocols.DynamicCardReceivePowerCell$createAssemAttached2Cell$1
            public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIIIIL;
            public final AssemVMLazy LLLIIII;

            static {
                C2217381BqS c2217381BqS = new C2217381BqS(DynamicCardReceivePowerCell$createAssemAttached2Cell$1.class, "dynamicCardViewModel", "getDynamicCardViewModel()Lcom/ss/android/ugc/aweme/im/messagelist/api/dynamic/DynamicCardViewModel;", 0);
                C13LE.LIZ.getClass();
                LLLIIIIL = new InterfaceC2217461Bqa[]{c2217381BqS};
            }

            @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutReusedUISlotAssem
            public final void Tp() {
                AssemVMLazy assemVMLazy = this.LLLIIII;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLIIIIL;
                DynamicCardViewModel dynamicCardViewModel = (DynamicCardViewModel) assemVMLazy.getValue();
                C724270Sb3 c724270Sb3 = this.LLJI;
                dynamicCardViewModel.vQ2(C0I6Y.LIZ((InterfaceC461380I7k) (c724270Sb3 != null ? c724270Sb3.LL : null)));
            }

            {
                C019F c019f = C019F.LIZ;
                C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(DynamicCardViewModel.class);
                this.LLLIIII = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, C1637806bA.LIZ, new C5182020e((C13IQ) c19719912DlLIZ2, 204), AFwS248S0000000_14.get$arr$(372), null, true);
            }

            @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutReusedUISlotAssem
            public final List<C1562980qm8<C0ZL0>> Gp(C869590Y9l c869590Y9l) {
                return C0ZQB.LIZ(c869590Y9l, Up());
            }

            @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutReusedUISlotAssem
            public final C0ZLF Ip(C869590Y9l c869590Y9l) {
                C0ZLF c0zlfLIZIZ = C0ZQB.LIZIZ(c869590Y9l);
                if (c0zlfLIZIZ == null) {
                    return super.Ip(c869590Y9l);
                }
                return c0zlfLIZIZ;
            }
        };
    }
}
