package com.ss.android.ugc.aweme.im.sdk.chat.ui.text.content;

import X.AbstractC738140SxQ;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C0ZL0;
import X.C0ZQI;
import X.C0ZQJ;
import X.C0ZRM;
import X.C0ZS4;
import X.C0ZXL;
import X.C0ZXS;
import X.C0ZXU;
import X.C0ZXV;
import X.C0ZXY;
import X.C0ZXZ;
import X.C13BV;
import X.C13LE;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1562980qm8;
import X.C1954807lC;
import X.C19719912Dl;
import X.C19EG;
import X.C1EEM;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452080Ho6;
import X.C452501pT;
import X.C457780HxI;
import X.C723580SZw;
import X.C724240Sb0;
import X.C737910Sx3;
import X.C869590Y9l;
import X.EnumC901300ZXk;
import X.InterfaceC1681406iC;
import X.InterfaceC2187708hf;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC907020Zi8;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.messagelist.api.select.IMSelectTextAbility;
import com.ss.android.ugc.aweme.im.messagelist.api.ui.IIMMessageBubbleService;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.IMMessageListTranslationViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutPowerCell;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutReusedUISlotAssemSend;
import com.ss.android.ugc.aweme.socialgame.api.model.EmojiGameInfo;
import com.ss.android.ugc.aweme.socialgame.api.service.ISocialGameService;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS415S0200000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS593S0100000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class TextTranslateSendCell extends IMSkeletonLayoutPowerCell<IMSkeletonLayoutReusedUISlotAssemSend, C0ZS4> implements InterfaceC907020Zi8 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJLIIL;
    public final C1EEM LLJJJIL = C1EEM.LIZ;
    public View LLJJJJ;
    public final AssemVMLazy LLJJJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TextTranslateSendCell.class, "translationVM", "getTranslationVM()Lcom/ss/android/ugc/aweme/im/sdk/chat/feature/IMMessageListTranslationViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJJLIIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC907020Zi8
    public final void LJLLL(double d) {
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutPowerCell
    public final boolean V5() {
        return true;
    }

    public TextTranslateSendCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(IMMessageListTranslationViewModel.class);
        AwS558S0100000_14 awS558S0100000_14 = new AwS558S0100000_14(c19719912DlLIZ, 914);
        AFwS248S0000000_14 aFwS248S0000000_14 = AFwS248S0000000_14.get$arr$(261);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS558S0100000_14(c19719912DlLIZ, 925), awS558S0100000_14, AFwS201S0000000_14.get$arr$(225), new AwS558S0100000_14((C03K6) this, 900), new AwS558S0100000_14((C03K6) this, 902), new AwS558S0100000_14((HasDefaultViewModelProviderFactory) this, 904), aFwS248S0000000_14, new AwS558S0100000_14((C03K6) this, 906), null, new AwS558S0100000_14((C03K6) this, 907));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS558S0100000_14 awS558S0100000_142 = new AwS558S0100000_14((C03K6) this, 901);
            AwS558S0100000_14 awS558S0100000_143 = new AwS558S0100000_14((HasDefaultViewModelProviderFactory) this, 903);
            AwS558S0100000_14 awS558S0100000_144 = new AwS558S0100000_14(c19719912DlLIZ, 905);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS415S0200000_14((InterfaceC451590HnJ) obj, awS558S0100000_142, 44));
            AwS558S0100000_14 awS558S0100000_145 = new AwS558S0100000_14(c01gwLIZIZ, 908);
            AwS558S0100000_14 awS558S0100000_146 = new AwS558S0100000_14(c01gwLIZIZ, 909);
            AwS558S0100000_14 awS558S0100000_147 = new AwS558S0100000_14(c01gwLIZIZ, 910);
            AwS558S0100000_14 awS558S0100000_148 = new AwS558S0100000_14(c01gwLIZIZ, 911);
            AwS558S0100000_14 awS558S0100000_149 = new AwS558S0100000_14(c01gwLIZIZ, 912);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS558S0100000_144, awS558S0100000_14, new C452080Ho6(), awS558S0100000_145, awS558S0100000_146, awS558S0100000_143, aFwS248S0000000_14, awS558S0100000_147, awS558S0100000_148, awS558S0100000_149);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS558S0100000_14(c19719912DlLIZ, 913), awS558S0100000_14, AFwS201S0000000_14.get$arr$(223), new AwS558S0100000_14((C03K6) this, 915), new AwS558S0100000_14((C03K6) this, 916), new AwS558S0100000_14((HasDefaultViewModelProviderFactory) this, 917), aFwS248S0000000_14, new AwS558S0100000_14((C03K6) this, 918), null, new AwS558S0100000_14((C03K6) this, 919));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS558S0100000_14(c19719912DlLIZ, 920), awS558S0100000_14, AFwS201S0000000_14.get$arr$(224), new AwS558S0100000_14((C03K6) this, 921), new AwS558S0100000_14((C03K6) this, 922), new AwS558S0100000_14((C03K6) this, 923), aFwS248S0000000_14, null, null, new AwS558S0100000_14((C03K6) this, 924));
        }
        this.LLJJJJJIL = assemVMLazy;
    }

    @Override // com.bytedance.ext_power_list.AssemPowerCell
    public final ReusedUISlotAssem I5() {
        final C19719912Dl c19719912DlLIZ = C13LE.LIZ(TextTranslateSendAssem.class);
        return new IMSkeletonLayoutReusedUISlotAssemSend(c19719912DlLIZ) { // from class: com.ss.android.ugc.aweme.im.sdk.chat.ui.text.content.TextTranslateSendCell$createAssemAttached2Cell$1
            public final C1559260qg8 LLLIIII = new C1559260qg8(new C723580SZw(this, C457780HxI.class, null), checkSupervisorPrepared());

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutReusedUISlotAssem
            public final void Tp() {
                InterfaceC1681406iC interfaceC1681406iCLIZ;
                CharSequence charSequence;
                C457780HxI c457780HxI = (C457780HxI) this.LLLIIII.getValue();
                if (c457780HxI != null) {
                    TextTranslateSendCell textTranslateSendCell = this.LLLIIIIL;
                    ISocialGameService iSocialGameService = (ISocialGameService) PluggableExtentionKt.pluggableSpiForReal(ISocialGameService.class);
                    if (iSocialGameService == null || (interfaceC1681406iCLIZ = iSocialGameService.LIZ()) == null) {
                        return;
                    }
                    SessionInfo sessionInfo = c457780HxI.LL;
                    C0ZS4 c0zs4 = (C0ZS4) textTranslateSendCell.getItem();
                    interfaceC1681406iCLIZ.LIZIZ(sessionInfo, new EmojiGameInfo(0, (c0zs4 == null || (charSequence = c0zs4.LLILZIL) == null) ? null : charSequence.toString(), null));
                }
            }

            @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutReusedUISlotAssemSend, com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.AbsSkeletonLayoutReusedUISlotAssem
            public final void op() {
                super.op();
                sp(new AwS593S0100000_14(this, 104));
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
                    AssemVMLazy assemVMLazy = this.LLLIIIIL.LLJJJJJIL;
                    InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = TextTranslateSendCell.LLJJJJLIIL;
                    return C0ZQJ.LIZ(c869590Y9l, c0zqiUp, context, supportFragmentManager, (IMMessageListTranslationViewModel) assemVMLazy.getValue(), (IMSelectTextAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IMSelectTextAbility.class, null));
                }
                return C13BV.INSTANCE;
            }

            @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutReusedUISlotAssem, com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.AbsSkeletonLayoutReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
            public final void onViewCreated(View view) {
                View viewLJFF;
                super.onViewCreated(view);
                IIMMessageBubbleService iIMMessageBubbleService = (IIMMessageBubbleService) PluggableExtentionKt.pluggableSpiForReal(IIMMessageBubbleService.class);
                if (iIMMessageBubbleService != null && (viewLJFF = iIMMessageBubbleService.LJFF(view, false)) != null) {
                    TextTranslateSendCell textTranslateSendCell = this.LLLIIIIL;
                    dM(viewLJFF);
                    textTranslateSendCell.R5(viewLJFF);
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
                C0ZS4 c0zs4 = (C0ZS4) this.LLLIIIIL.getItem();
                if (c0zs4 != null && (c869590Y9l2 = c0zs4.LL.LIZ.LIZ) != null) {
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
                            if (next instanceof TextTranslateSendAssem) {
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
                if ((abstractC738140SxQ instanceof TextTranslateSendAssem) && (textTranslateAssem = (TextTranslateAssem) abstractC738140SxQ) != null && (enumC901300ZXk = textTranslateAssem.dq().LIZIZ) != null) {
                    return new C0ZRM(C2097608Jq.LJIILIIL(C0ZRM.LIZJ.LIZ, new Pair("message_position", enumC901300ZXk.getEtValue())), enumC901300ZXk);
                }
                return C0ZRM.LIZJ;
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC907020Zi8
    public final View getBackgroundView() {
        View view;
        C0ZXS c0zxs;
        C0ZS4 c0zs4 = (C0ZS4) getItem();
        C0ZXL c0zxl = (c0zs4 == null || (c0zxs = c0zs4.LLILLJJLI) == null) ? null : c0zxs.LIZJ;
        if (c0zxl instanceof C0ZXV) {
            view = this.LLJJJJ;
            if (view == null) {
                IIMMessageBubbleService iIMMessageBubbleService = (IIMMessageBubbleService) PluggableExtentionKt.pluggableSpiForReal(IIMMessageBubbleService.class);
                viewLJFF = iIMMessageBubbleService != null ? iIMMessageBubbleService.LJFF(LJJIJL(), false) : null;
                this.LLJJJJ = viewLJFF;
                return viewLJFF;
            }
            return view;
        }
        if (!(c0zxl instanceof C0ZXY) && !(c0zxl instanceof C0ZXZ)) {
            if (c0zxl instanceof C0ZXU) {
                if (((C0ZXU) c0zxl).LIZIZ.LIZJ instanceof C0ZXV) {
                    view = this.LLJJJJ;
                    if (view == null) {
                        IIMMessageBubbleService iIMMessageBubbleService2 = (IIMMessageBubbleService) PluggableExtentionKt.pluggableSpiForReal(IIMMessageBubbleService.class);
                        viewLJFF = iIMMessageBubbleService2 != null ? iIMMessageBubbleService2.LJFF(LJJIJL(), false) : null;
                        this.LLJJJJ = viewLJFF;
                        return viewLJFF;
                    }
                    return view;
                }
            } else if (c0zxl != null) {
                throw new C1954807lC();
            }
        }
        return viewLJFF;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutPowerCell
    public final InterfaceC2187708hf T5() {
        return this.LLJJJIL;
    }
}
