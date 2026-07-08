package com.ss.android.ugc.aweme.im.sdk.chat.ui.slots;

import X.C019F;
import X.C01GW;
import X.C0QSJ;
import X.C13LE;
import X.C1509305vX;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C457780HxI;
import X.C687700QyG;
import X.C723590SZx;
import X.C724750Sbp;
import X.C869590Y9l;
import X.C898560ZMw;
import X.C898900ZOe;
import X.C903960ZdC;
import X.InterfaceC2217461Bqa;
import X.InterfaceC879300YeW;
import android.content.Context;
import android.view.View;
import android.widget.Space;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.ChatroomEventAbility;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessagePowerListAbility;
import com.ss.android.ugc.aweme.im.messagelist.api.model.SkeletonLayoutCellAbility;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.MessageReactionsState;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.reaction.IMPendingReactionViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.ability.SkeletonLayoutAssemblerBridge;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.assem.ReusedSkeletonUIContentAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import wh6.AbS323S0300000_6;

/* JADX INFO: loaded from: classes15.dex */
public final class ReactionReusedSkeletonUIContent extends ReusedSkeletonUIContentAssem<ReactionReusedSkeletonUIContent, MessageReactionsState> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLIL;
    public final C1559260qg8 LLJJJJJIL;
    public final C1559260qg8 LLJJJJLIIL;
    public final C01GW LLJJL;
    public C903960ZdC LLJJLIIIJLLLLLLLZ;
    public final AssemVMLazy LLJL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ReactionReusedSkeletonUIContent.class, "pendingReactionViewModel", "getPendingReactionViewModel()Lcom/ss/android/ugc/aweme/im/sdk/chat/feature/reaction/IMPendingReactionViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public ReactionReusedSkeletonUIContent() {
        super(C898560ZMw.LIZ);
        this.LLJJJJJIL = new C1559260qg8(new C723590SZx(this, C457780HxI.class, null), checkSupervisorPrepared());
        this.LLJJJJLIIL = new C1559260qg8(new C723590SZx(this, C898900ZOe.class, null), checkSupervisorPrepared());
        this.LLJJL = C1509305vX.LIZ(new AwS558S0100000_14(this, 873));
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(IMPendingReactionViewModel.class);
        this.LLJL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS558S0100000_14(c19719912DlLIZ, 872), AFwS248S0000000_14.get$arr$(250), null, true);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.assem.ReusedSkeletonUIContentAssem, X.InterfaceC712990Rxx
    public final void unBind() {
        C903960ZdC c903960ZdC = this.LLJJLIIIJLLLLLLLZ;
        if (c903960ZdC != null) {
            c903960ZdC.LJIIZILJ = null;
        }
    }

    /* JADX WARN: Type inference failed for: r14v0, types: [X.0HzV] */
    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.assem.ReusedSkeletonUIContentAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        Object ability;
        Object ability2;
        final Context context = LJJIJL().getContext();
        final SmartImageView smartImageView = (SmartImageView) ((C898900ZOe) this.LLJJJJLIIL.getValue()).LL.findViewById(R.id.apb);
        Object obj = null;
        if (smartImageView != null) {
            SkeletonLayoutCellAbility skeletonLayoutCellAbility = (SkeletonLayoutCellAbility) this.LLJJL.getValue();
            if (skeletonLayoutCellAbility != null) {
                skeletonLayoutCellAbility.dM(smartImageView);
            }
        } else {
            smartImageView = null;
        }
        SkeletonLayoutCellAbility skeletonLayoutCellAbility2 = (SkeletonLayoutCellAbility) this.LLJJL.getValue();
        if (skeletonLayoutCellAbility2 != null) {
            skeletonLayoutCellAbility2.dM(LJJIJL());
        }
        View viewLJJIJL = LJJIJL();
        Space space = (Space) ((C898900ZOe) this.LLJJJJLIIL.getValue()).LL.findViewById(R.id.o9p);
        boolean zIsDissolvedGroup = ((C457780HxI) this.LLJJJJJIL.getValue()).LL.isDissolvedGroup();
        AssemVMLazy assemVMLazy = this.LLJL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLIL;
        IMPendingReactionViewModel iMPendingReactionViewModel = (IMPendingReactionViewModel) assemVMLazy.getValue();
        C0QSJ c0qsjLIZJ = C687700QyG.LIZJ(C1558520qew.LJIIL(this), ChatRoomScope.class);
        if (c0qsjLIZJ != null) {
            ability = c0qsjLIZJ.getAbility(MessagePowerListAbility.class);
        } else {
            ability = null;
        }
        if (!(ability instanceof MessagePowerListAbility)) {
            ability = null;
        }
        MessagePowerListAbility messagePowerListAbility = (MessagePowerListAbility) ability;
        if (messagePowerListAbility != null) {
            C0QSJ c0qsjLIZJ2 = C687700QyG.LIZJ(C1558520qew.LJIIL(this), ChatRoomScope.class);
            if (c0qsjLIZJ2 != null) {
                ability2 = c0qsjLIZJ2.getAbility(ChatroomEventAbility.class);
            } else {
                ability2 = null;
            }
            if (ability2 instanceof ChatroomEventAbility) {
                obj = ability2;
            }
            this.LLJJLIIIJLLLLLLLZ = new C903960ZdC(context, viewLJJIJL, smartImageView, space, zIsDissolvedGroup, iMPendingReactionViewModel, messagePowerListAbility, (ChatroomEventAbility) obj, new InterfaceC879300YeW() { // from class: X.0HzV
                @Override // X.InterfaceC879300YeW
                public final void LIZIZ(C455420HtU c455420HtU) {
                    SmartImageView smartImageView2 = smartImageView;
                    if (smartImageView2 != null) {
                        C786410Ut5.I7(new AbS323S0300000_6(context, this.LIZ, c455420HtU, 0), smartImageView2);
                    }
                }

                @Override // X.InterfaceC879300YeW
                public final void LIZ(C869590Y9l c869590Y9l, InterfaceC879330YeZ interfaceC879330YeZ) {
                    SkeletonLayoutAssemblerBridge skeletonLayoutAssemblerBridge = (SkeletonLayoutAssemblerBridge) C1558520qew.LIZ(C1558520qew.LJIIL(this.LIZ), SkeletonLayoutAssemblerBridge.class, null);
                    if (skeletonLayoutAssemblerBridge != null) {
                        skeletonLayoutAssemblerBridge.xs0(c869590Y9l, interfaceC879330YeZ);
                    }
                }
            });
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.assem.ReusedSkeletonUIContentAssem
    public final void ep(C869590Y9l c869590Y9l, MessageReactionsState messageReactionsState) {
        MessageReactionsState messageReactionsState2 = messageReactionsState;
        C903960ZdC c903960ZdC = this.LLJJLIIIJLLLLLLLZ;
        if (c903960ZdC != null) {
            MessageReactionsState messageReactionsState3 = c903960ZdC.LJIIZILJ;
            if (messageReactionsState3 == null || (messageReactionsState3 instanceof MessageReactionsState.Hidden)) {
                c903960ZdC.LJIIZILJ = MessageReactionsState.NoReactions.INSTANCE;
            }
            c903960ZdC.LIZ(c869590Y9l, messageReactionsState2);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.assem.ReusedSkeletonUIContentAssem
    public final void hp(C869590Y9l c869590Y9l, MessageReactionsState messageReactionsState, boolean z) {
        MessageReactionsState messageReactionsState2 = messageReactionsState;
        if (z) {
            C903960ZdC c903960ZdC = this.LLJJLIIIJLLLLLLLZ;
            if (c903960ZdC != null) {
                c903960ZdC.LIZ(c869590Y9l, messageReactionsState2);
                return;
            }
            return;
        }
        C903960ZdC c903960ZdC2 = this.LLJJLIIIJLLLLLLLZ;
        if (c903960ZdC2 == null) {
            return;
        }
        MessageReactionsState messageReactionsState3 = c903960ZdC2.LJIIZILJ;
        if (messageReactionsState3 == null || (messageReactionsState3 instanceof MessageReactionsState.Hidden)) {
            c903960ZdC2.LJIIZILJ = MessageReactionsState.NoReactions.INSTANCE;
        }
        c903960ZdC2.LIZ(c869590Y9l, messageReactionsState2);
    }
}
