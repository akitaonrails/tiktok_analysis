package com.ss.android.ugc.aweme.im.sdk.chat.ui.aweme;

import X.AbstractC899510ZQn;
import X.C019F;
import X.C09R3;
import X.C0IBF;
import X.C0ZL0;
import X.C0ZQI;
import X.C13IQ;
import X.C13LE;
import X.C1559260qg8;
import X.C1562980qm8;
import X.C1637806bA;
import X.C1637906bB;
import X.C19719912Dl;
import X.C1EEP;
import X.C2217381BqS;
import X.C457780HxI;
import X.C457970Hxb;
import X.C461060I6e;
import X.C461240I6w;
import X.C461250I6x;
import X.C462510IBt;
import X.C462810ICx;
import X.C462830ICz;
import X.C5182020e;
import X.C723580SZw;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C869590Y9l;
import X.C898580ZMy;
import X.InterfaceC2187708hf;
import X.InterfaceC2217461Bqa;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.message.template.card.AwemeCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.BaseUserComponent;
import com.ss.android.ugc.aweme.im.saas.host.api.messagelist.IMAwemeCardHostBridge;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.MessageLeftIconState;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.ability.SkeletonLayoutAssemblerBridge;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.assem.ReusedSkeletonUISlotAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutPowerCell;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutReusedUISlotAssemReceive;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.camera.ChatRoomCameraVM;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.slots.SideMessageStatusReusedSkeletonUISlot;
import com.ss.android.ugc.aweme.im.viewmodel.PanelStateViewModel;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS223S0300000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class AwemeCardReceivePowerCell extends IMSkeletonLayoutPowerCell<IMSkeletonLayoutReusedUISlotAssemReceive, C462810ICx> {
    public final C1EEP LLJJJIL = C1EEP.LIZ;

    @Override // com.bytedance.ext_power_list.AssemPowerCell
    public final ReusedUISlotAssem I5() {
        final C19719912Dl c19719912DlLIZ = C13LE.LIZ(AwemeCardAssem.class);
        return new IMSkeletonLayoutReusedUISlotAssemReceive(c19719912DlLIZ) { // from class: com.ss.android.ugc.aweme.im.sdk.chat.ui.aweme.AwemeCardReceivePowerCell$createAssemAttached2Cell$1
            public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIILIL;
            public final C1559260qg8 LLLIIII = new C1559260qg8(new C723580SZw(this, C457780HxI.class, null), checkSupervisorPrepared());
            public final AssemVMLazy LLLIIIIL;
            public final AssemVMLazy LLLIIIL;

            static {
                C2217381BqS c2217381BqS = new C2217381BqS(AwemeCardReceivePowerCell$createAssemAttached2Cell$1.class, "chatRoomCameraVM", "getChatRoomCameraVM()Lcom/ss/android/ugc/aweme/im/sdk/chat/ui/base/assems/input/camera/ChatRoomCameraVM;", 0);
                C09R3 c09r3 = C13LE.LIZ;
                c09r3.getClass();
                C2217381BqS c2217381BqS2 = new C2217381BqS(AwemeCardReceivePowerCell$createAssemAttached2Cell$1.class, "panelStateVM", "getPanelStateVM()Lcom/ss/android/ugc/aweme/im/viewmodel/PanelStateViewModel;", 0);
                c09r3.getClass();
                LLLIILIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutReusedUISlotAssem
            public final void Tp() {
                C869590Y9l c869590Y9l;
                C462810ICx c462810ICx;
                AwemeCardTemplate awemeCardTemplateLIZIZ;
                BaseUserComponent baseUserComponent;
                Long l;
                Map<String, String> localExt;
                C462810ICx c462810ICx2 = (C462810ICx) this.LLLIIL.getItem();
                if (c462810ICx2 == null || (c869590Y9l = c462810ICx2.LL.LIZ.LIZ) == null || (c462810ICx = (C462810ICx) this.LLLIIL.getItem()) == null || (awemeCardTemplateLIZIZ = C462830ICz.LIZIZ(c462810ICx)) == null || (baseUserComponent = awemeCardTemplateLIZIZ.baseUserComponent) == null || (l = baseUserComponent.userId) == null) {
                    return;
                }
                long jLongValue = l.longValue();
                if (!C461060I6e.LIZ(c869590Y9l) || (localExt = c869590Y9l.getLocalExt()) == null) {
                    return;
                }
                C898580ZMy.LIZJ(String.valueOf(jLongValue), localExt);
            }

            @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutReusedUISlotAssemReceive, com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.AbsSkeletonLayoutReusedUISlotAssem
            public final void op() {
                super.op();
                SkeletonLayoutAssemblerBridge skeletonLayoutAssemblerBridgeBp = Bp();
                AbstractC899510ZQn<?, ?> abstractC899510ZQnFQ2 = skeletonLayoutAssemblerBridgeBp != null ? skeletonLayoutAssemblerBridgeBp.fQ2(C462510IBt.LIZ) : null;
                if (!(abstractC899510ZQnFQ2 instanceof AbstractC899510ZQn) || abstractC899510ZQnFQ2 == null) {
                    return;
                }
                IMAwemeCardHostBridge.LIZ.getClass();
                IMAwemeCardHostBridge value = C461250I6x.LIZIZ.getValue();
                C19719912Dl c19719912DlLIZLLL = value != null ? value.LIZLLL() : null;
                if (!(c19719912DlLIZLLL instanceof C13IQ) || c19719912DlLIZLLL == null) {
                    return;
                }
                tp(C462510IBt.LIZ);
                sp(new AwS223S0300000_14(this, (AwemeCardReceivePowerCell$createAssemAttached2Cell$1) c19719912DlLIZLLL, (C13IQ<? extends ReusedSkeletonUISlotAssem<SideMessageStatusReusedSkeletonUISlot, MessageLeftIconState>>) abstractC899510ZQnFQ2, (AbstractC899510ZQn<?, MessageLeftIconState>) 3));
            }

            @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutReusedUISlotAssem
            public final List<C1562980qm8<C0ZL0>> Gp(C869590Y9l c869590Y9l) {
                SessionInfo sessionInfo;
                C0ZQI c0zqiUp = Up();
                C457780HxI c457780HxI = (C457780HxI) this.LLLIIII.getValue();
                if (c457780HxI != null) {
                    sessionInfo = c457780HxI.LL;
                } else {
                    sessionInfo = null;
                }
                AssemVMLazy assemVMLazy = this.LLLIIIIL;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLIILIL;
                C0IBF c0ibf = ((C457970Hxb) assemVMLazy.getValue().getState()).LL;
                return C461240I6w.LIZ(C724240Sb0.LIZ(this), C724240Sb0.LJI(this), c869590Y9l, sessionInfo, c0ibf, c0zqiUp, (PanelStateViewModel) this.LLLIIIL.getValue());
            }

            {
                C019F c019f = C019F.LIZ;
                C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(ChatRoomCameraVM.class);
                C1637906bB c1637906bB = C1637806bA.LIZ;
                this.LLLIIIIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new C5182020e((C13IQ) c19719912DlLIZ2, 611), AFwS236S0000000_6.get$arr$(535), null, true);
                C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(PanelStateViewModel.class);
                this.LLLIIIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c019f, c1637906bB, new C5182020e((C13IQ) c19719912DlLIZ3, 612), AFwS236S0000000_6.get$arr$(536), null, true);
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutPowerCell
    public final InterfaceC2187708hf T5() {
        return this.LLJJJIL;
    }
}
