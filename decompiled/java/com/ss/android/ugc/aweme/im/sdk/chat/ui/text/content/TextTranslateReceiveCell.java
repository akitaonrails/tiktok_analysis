package com.ss.android.ugc.aweme.im.sdk.chat.ui.text.content;

import X.AbstractC738140SxQ;
import X.C019F;
import X.C0ZL0;
import X.C0ZQI;
import X.C0ZQJ;
import X.C0ZRM;
import X.C0ZS3;
import X.C13BV;
import X.C13IQ;
import X.C13LE;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1562980qm8;
import X.C1637806bA;
import X.C19719912Dl;
import X.C19EG;
import X.C1EEM;
import X.C2097608Jq;
import X.C2217381BqS;
import X.C457780HxI;
import X.C5182020e;
import X.C723580SZw;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C737910Sx3;
import X.C869590Y9l;
import X.EnumC901300ZXk;
import X.InterfaceC1681406iC;
import X.InterfaceC1731706qJ;
import X.InterfaceC2187708hf;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.messagelist.api.select.IMSelectTextAbility;
import com.ss.android.ugc.aweme.im.messagelist.api.ui.IIMMessageBubbleService;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.IMMessageListTranslationViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutPowerCell;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutReusedUISlotAssemReceive;
import com.ss.android.ugc.aweme.socialgame.api.model.EmojiGameInfo;
import com.ss.android.ugc.aweme.socialgame.api.service.ISocialGameService;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS593S0100000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class TextTranslateReceiveCell extends IMSkeletonLayoutPowerCell<IMSkeletonLayoutReusedUISlotAssemReceive, C0ZS3> {
    public final C1EEM LLJJJIL = C1EEM.LIZ;

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutPowerCell
    public final boolean V5() {
        return true;
    }

    @Override // com.bytedance.ext_power_list.AssemPowerCell
    public final ReusedUISlotAssem I5() {
        final C19719912Dl c19719912DlLIZ = C13LE.LIZ(TextTranslateReceiveAssem.class);
        return new IMSkeletonLayoutReusedUISlotAssemReceive(c19719912DlLIZ) { // from class: com.ss.android.ugc.aweme.im.sdk.chat.ui.text.content.TextTranslateReceiveCell$createAssemAttached2Cell$1
            public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIIL;
            public final C1559260qg8 LLLIIII = new C1559260qg8(new C723580SZw(this, C457780HxI.class, null), checkSupervisorPrepared());
            public final InterfaceC1731706qJ LLLIIIIL;

            static {
                C2217381BqS c2217381BqS = new C2217381BqS(TextTranslateReceiveCell$createAssemAttached2Cell$1.class, "translationVM", "getTranslationVM()Lcom/ss/android/ugc/aweme/im/sdk/chat/feature/IMMessageListTranslationViewModel;", 0);
                C13LE.LIZ.getClass();
                LLLIIL = new InterfaceC2217461Bqa[]{c2217381BqS};
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutReusedUISlotAssem
            public final void Tp() {
                InterfaceC1681406iC interfaceC1681406iCLIZ;
                CharSequence charSequence;
                C457780HxI c457780HxI = (C457780HxI) this.LLLIIII.getValue();
                if (c457780HxI != null) {
                    TextTranslateReceiveCell textTranslateReceiveCell = this.LLLIIIL;
                    ISocialGameService iSocialGameService = (ISocialGameService) PluggableExtentionKt.pluggableSpiForReal(ISocialGameService.class);
                    if (iSocialGameService == null || (interfaceC1681406iCLIZ = iSocialGameService.LIZ()) == null) {
                        return;
                    }
                    SessionInfo sessionInfo = c457780HxI.LL;
                    C0ZS3 c0zs3 = (C0ZS3) textTranslateReceiveCell.getItem();
                    interfaceC1681406iCLIZ.LIZIZ(sessionInfo, new EmojiGameInfo(0, (c0zs3 == null || (charSequence = c0zs3.LLILZIL) == null) ? null : charSequence.toString(), null));
                }
            }

            @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutReusedUISlotAssemReceive, com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.AbsSkeletonLayoutReusedUISlotAssem
            public final void op() {
                super.op();
                sp(new AwS593S0100000_14(this, 102));
            }

            @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutReusedUISlotAssem
            public final List<C1562980qm8<C0ZL0>> Gp(C869590Y9l c869590Y9l) {
                C19EG activity;
                FragmentManager supportFragmentManager;
                C0ZQI c0zqiUp = Up();
                Context context = getContext();
                if (context == null) {
                    return C13BV.INSTANCE;
                }
                Fragment fragmentLJI = C724240Sb0.LJI(this);
                if (fragmentLJI != null && (activity = fragmentLJI.getActivity()) != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
                    return C0ZQJ.LIZ(c869590Y9l, c0zqiUp, context, supportFragmentManager, (IMMessageListTranslationViewModel) this.LLLIIIIL.getValue(this, LLLIIL[0]), (IMSelectTextAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IMSelectTextAbility.class, null));
                }
                return C13BV.INSTANCE;
            }

            @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutReusedUISlotAssem, com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.AbsSkeletonLayoutReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
            public final void onViewCreated(View view) {
                View viewLJFF;
                super.onViewCreated(view);
                IIMMessageBubbleService iIMMessageBubbleService = (IIMMessageBubbleService) PluggableExtentionKt.pluggableSpiForReal(IIMMessageBubbleService.class);
                if (iIMMessageBubbleService != null && (viewLJFF = iIMMessageBubbleService.LJFF(view, false)) != null) {
                    TextTranslateReceiveCell textTranslateReceiveCell = this.LLLIIIL;
                    dM(viewLJFF);
                    textTranslateReceiveCell.R5(viewLJFF);
                    up(viewLJFF);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutReusedUISlotAssem
            public final C0ZRM zp(C869590Y9l c869590Y9l) {
                String uuid;
                AbstractC738140SxQ abstractC738140SxQ;
                TextTranslateAssem textTranslateAssem;
                EnumC901300ZXk enumC901300ZXk;
                AbstractC738140SxQ next;
                C869590Y9l c869590Y9l2;
                C0ZS3 c0zs3 = (C0ZS3) this.LLLIIIL.getItem();
                if (c0zs3 != null && (c869590Y9l2 = c0zs3.LL.LIZ.LIZ) != null) {
                    uuid = c869590Y9l2.getUuid();
                } else {
                    uuid = null;
                }
                if (!Intrinsics.LJFF(uuid, c869590Y9l.getUuid())) {
                    return C0ZRM.LIZJ;
                }
                List<AbstractC738140SxQ> children = getChildren();
                if (children != null) {
                    Iterator<AbstractC738140SxQ> it2 = children.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            if (next instanceof TextTranslateReceiveAssem) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    abstractC738140SxQ = next;
                } else {
                    abstractC738140SxQ = null;
                }
                if ((abstractC738140SxQ instanceof TextTranslateReceiveAssem) && (textTranslateAssem = (TextTranslateAssem) abstractC738140SxQ) != null && (enumC901300ZXk = textTranslateAssem.dq().LIZIZ) != null) {
                    return new C0ZRM(C2097608Jq.LJIILIIL(C0ZRM.LIZJ.LIZ, new Pair("message_position", enumC901300ZXk.getEtValue())), enumC901300ZXk);
                }
                return C0ZRM.LIZJ;
            }

            {
                C019F c019f = C019F.LIZ;
                C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(IMMessageListTranslationViewModel.class);
                this.LLLIIIIL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, C1637806bA.LIZ, new C5182020e((C13IQ) c19719912DlLIZ2, 27), null, AFwS248S0000000_14.get$arr$(12));
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutPowerCell
    public final InterfaceC2187708hf T5() {
        return this.LLJJJIL;
    }
}
