package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.panel;

import X.C019F;
import X.C09R3;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1637906bB;
import X.C19659111vp;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C23250099c;
import X.C259800zU;
import X.C287610BPb;
import X.C384050F3z;
import X.C418440Gaw;
import X.C426750GoL;
import X.C449650HkB;
import X.C457640Hx4;
import X.C458820Hyy;
import X.C723580SZw;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.C814420VxA;
import X.C817403Hg;
import X.InterfaceC2217461Bqa;
import X.InterfaceC456120Huc;
import X.InterfaceC458730Hyp;
import Y.ATListenerS98S0400000_6;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.ss.android.ugc.aweme.emoji.emojiPageV2.EmojiPanelBottomPaddingVM;
import com.ss.android.ugc.aweme.im.common.assem.IMUISlotViewAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.ChatroomHeightViewModel;
import com.ss.android.ugc.aweme.im.viewmodel.InputPanelSizeViewModel;
import com.ss.android.ugc.aweme.im.viewmodel.PanelStateViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS620S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class ChatroomPanelKnob extends IMUISlotViewAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJ;
    public final AssemVMLazy LLJJI;
    public final C1559260qg8 LLJJIII;
    public final AssemVMLazy LLJJIJI;
    public final AssemVMLazy LLJJIJIIJIL;
    public final AssemVMLazy LLJJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ChatroomPanelKnob.class, "panelStateVM", "getPanelStateVM()Lcom/ss/android/ugc/aweme/im/viewmodel/PanelStateViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(ChatroomPanelKnob.class, "chatroomHeightVM", "getChatroomHeightVM()Lcom/ss/android/ugc/aweme/im/sdk/chat/viewmodel/ChatroomHeightViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(ChatroomPanelKnob.class, "emojiPanelBottomPaddingVM", "getEmojiPanelBottomPaddingVM()Lcom/ss/android/ugc/aweme/emoji/emojiPageV2/EmojiPanelBottomPaddingVM;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(ChatroomPanelKnob.class, "inputPanelSizeVM", "getInputPanelSizeVM()Lcom/ss/android/ugc/aweme/im/viewmodel/InputPanelSizeViewModel;", 0);
        c09r3.getClass();
        LLJJJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4};
    }

    public ChatroomPanelKnob() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PanelStateViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS550S0100000_6(c19719912DlLIZ, 264), AFwS236S0000000_6.get$arr$(137), null, true);
        this.LLJJIII = new C1559260qg8(new C723580SZw(this, C449650HkB.class, null), checkSupervisorPrepared());
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(ChatroomHeightViewModel.class);
        this.LLJJIJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS550S0100000_6(c19719912DlLIZ2, 265), AFwS236S0000000_6.get$arr$(138), null, true);
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(EmojiPanelBottomPaddingVM.class);
        this.LLJJIJIIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c019f, c1637906bB, new AwS550S0100000_6(c19719912DlLIZ3, 266), AFwS236S0000000_6.get$arr$(139), null, true);
        C19719912Dl c19719912DlLIZ4 = C13LE.LIZ(InputPanelSizeViewModel.class);
        this.LLJJIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ4), c019f, c1637906bB, new AwS550S0100000_6(c19719912DlLIZ4, 267), AFwS236S0000000_6.get$arr$(140), null, true);
    }

    @Override // com.ss.android.ugc.aweme.im.common.assem.IMUISlotViewAssem
    public final View LLLILZJ() {
        Context context = getContext();
        if (context == null) {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        View view = new View(context);
        C786410Ut5.W5(view, new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), 17));
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(4));
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a01);
        view.setBackground(c384050F3z.LIZ(view.getContext()));
        return view;
    }

    public final ChatroomHeightViewModel ip() {
        AssemVMLazy assemVMLazy = this.LLJJIJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJ;
        return (ChatroomHeightViewModel) assemVMLazy.getValue();
    }

    public final PanelStateViewModel kp() {
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJ;
        return (PanelStateViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        int i;
        super.onViewCreated(view);
        LJJIJL().getLayoutParams().height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LJIIIIZZ = Float.valueOf(C418440Gaw.LIZIZ(12));
        c384050F3z.LJIIIZ = Float.valueOf(C418440Gaw.LIZIZ(12));
        C449650HkB c449650HkB = (C449650HkB) this.LLJJIII.getValue();
        if (c449650HkB != null) {
            i = c449650HkB.LLILLJJLI;
        } else {
            i = R.attr.zq;
        }
        c384050F3z.LIZIZ = Integer.valueOf(i);
        Drawable drawableLIZ = c384050F3z.LIZ(view.getContext());
        C19659111vp c19659111vp = new C19659111vp();
        c19659111vp.LIZ = C418440Gaw.LIZIZ(12);
        c19659111vp.LJFF = Integer.valueOf(ColorProtector.parseColor("#1a000000"));
        c19659111vp.LIZLLL = C418440Gaw.LIZIZ(16);
        LJJIJL().setBackground(C426750GoL.LJIILIIL(drawableLIZ, c19659111vp.LIZ(view.getContext())));
        View viewLJJIJL = LJJIJL();
        C817403Hg c817403Hg = new C817403Hg();
        viewLJJIJL.setOnTouchListener(new ATListenerS98S0400000_6(new C259800zU(), this, new C259800zU(), c817403Hg, 0));
        ChatroomHeightViewModel chatroomHeightViewModelIp = ip();
        subscribe(chatroomHeightViewModelIp, C736820SvI.LIZIZ(chatroomHeightViewModelIp.usedInReusedScene), null, new AwS620S0100000_6(this, 28));
        if (C287610BPb.LIZ()) {
            AssemVMLazy assemVMLazy = this.LLJJIJIL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJ;
            C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0Hyz
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Integer.valueOf(((C457640Hx4) obj).LLILLJJLI);
                }
            }, null, new AwS620S0100000_6(this, 29), 6);
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C458820Hyy(this, null), 3);
    }

    public final int hp(int i, int i2) {
        AssemVMLazy assemVMLazy = this.LLJJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJ;
        int iMin = Math.min((i - i2) - ((C457640Hx4) assemVMLazy.getValue().getState()).LLILLJJLI, (int) (((double) i) * 0.68d));
        if (iMin < 0) {
            return 0;
        }
        return iMin;
    }

    public final void mp(int i, int i2) {
        PanelStateViewModel panelStateViewModelKp = kp();
        int iHp = hp(i, i2);
        panelStateViewModelKp.LLILLL = iHp;
        InterfaceC456120Huc interfaceC456120Huc = (InterfaceC456120Huc) panelStateViewModelKp.LLIZ.getValue();
        if ((interfaceC456120Huc instanceof InterfaceC458730Hyp) && ((Number) panelStateViewModelKp.LLJ.getValue()).intValue() > iHp) {
            panelStateViewModelKp.vQ2(interfaceC456120Huc, iHp);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void lp(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = X.C287610BPb.LIZ()
            r4 = 0
            if (r0 == 0) goto L4a
            int r5 = r6.hp(r7, r8)
            int r5 = r5 - r9
            if (r5 >= 0) goto Lf
            r5 = 0
        Lf:
            X.0qg8 r0 = r6.LLJJIII
            java.lang.Object r0 = r0.getValue()
            X.0HkB r0 = (X.C449650HkB) r0
            if (r0 == 0) goto L48
            boolean r1 = r0.LLJLLL
            r0 = 1
            if (r1 != r0) goto L48
        L1e:
            r1 = 2
            if (r0 == 0) goto L34
            android.view.View r0 = r6.getContentView()
            X.14Ju r0 = X.C14K4.LIZ(r0)
            if (r0 == 0) goto L33
            X.14Jj r0 = r0.LIZ(r1)
            if (r0 == 0) goto L33
            int r4 = r0.LIZLLL
        L33:
            int r5 = r5 + r4
        L34:
            com.bytedance.assem.arch.viewModel.AssemVMLazy r1 = r6.LLJJIJIIJIL
            X.1Bqa<java.lang.Object>[] r0 = com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.panel.ChatroomPanelKnob.LLJJJ
            com.bytedance.assem.arch.viewModel.AssemViewModel r0 = r1.getValue()
            com.ss.android.ugc.aweme.emoji.emojiPageV2.EmojiPanelBottomPaddingVM r0 = (com.ss.android.ugc.aweme.emoji.emojiPageV2.EmojiPanelBottomPaddingVM) r0
            X.1DDq r1 = r0.LL
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r1.setValue(r0)
            return
        L48:
            r0 = 0
            goto L1e
        L4a:
            double r2 = (double) r7
            r0 = 4604300115038500291(0x3fe5c28f5c28f5c3, double:0.68)
            double r2 = r2 * r0
            double r0 = (double) r9
            double r2 = r2 - r0
            int r5 = (int) r2
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.panel.ChatroomPanelKnob.lp(int, int, int):void");
    }
}
