package com.ss.android.ugc.aweme.im.quickchat.ui.assem;

import X.AbstractC738140SxQ;
import X.C019F;
import X.C01GW;
import X.C1220000hqw;
import X.C1308910kAL;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C441201ne;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C456260Huq;
import X.C463000IDq;
import X.C723580SZw;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.im.assem.BasePanelContainerAssem;
import com.ss.android.ugc.aweme.im.chatroom.input.components.inputfield.InputFieldVM;
import com.ss.android.ugc.aweme.im.sticker.api.viewmodel.IMStickerPanelEventViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS585S0100000_6;
import kotlin.jvm.internal.AwS620S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class IMQuickMessagePanelContainerAssem extends BasePanelContainerAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJ;
    public final AssemVMLazy LLJJIII;
    public final C1559260qg8 LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C736950SvV LLJJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(IMQuickMessagePanelContainerAssem.class, "inputFieldVM", "getInputFieldVM()Lcom/ss/android/ugc/aweme/im/chatroom/input/components/inputfield/InputFieldVM;", 0);
        C13LE.LIZ.getClass();
        LLJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.ss.android.ugc.aweme.im.assem.BasePanelContainerAssem
    public final boolean Go() {
        return false;
    }

    public IMQuickMessagePanelContainerAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(InputFieldVM.class);
        this.LLJJIII = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS550S0100000_6(c19719912DlLIZ, 167), AFwS236S0000000_6.get$arr$(100), null, true);
        this.LLJJIJI = new C1559260qg8(new C723580SZw(this, C456260Huq.class, null), checkSupervisorPrepared());
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 166));
        AwS550S0100000_6 awS550S0100000_6 = new AwS550S0100000_6(this, 169);
        this.LLJJIJIL = new C736950SvV(C13LE.LIZ(IMStickerPanelEventViewModel.class), awS550S0100000_6, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS236S0000000_6.get$arr$(101), new AwS550S0100000_6((AbstractC738140SxQ) this, 168), new C451610HnL(this, true, true), new C723700Sa8(this));
    }

    public final InputFieldVM bp() {
        AssemVMLazy assemVMLazy = this.LLJJIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJ;
        return (InputFieldVM) assemVMLazy.getValue();
    }

    public final IMStickerPanelEventViewModel cp() {
        return (IMStickerPanelEventViewModel) this.LLJJIJIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.ability.RequestKeyboardAbility
    public final void Fr() {
        bp().LLJZIJLIL();
    }

    @Override // com.ss.android.ugc.aweme.im.assem.BasePanelContainerAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        Integer numLIZJ;
        super.onViewCreated(view);
        Context context = getContext();
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.zm, context)) != null) {
            view.setBackgroundColor(numLIZJ.intValue());
        }
        C736680Sv4.LJIIIIZZ(this, cp(), new C2217381BqS() { // from class: X.0HwG
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C454050HrH) obj).LL;
            }
        }, null, new AwS620S0100000_6(this, 19), 6);
        C736680Sv4.LJIIIIZZ(this, cp(), new C2217381BqS() { // from class: X.0HwF
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C454050HrH) obj).LLILLJJLI;
            }
        }, null, new AwS620S0100000_6(this, 20), 6);
        C736680Sv4.LJIIIIZZ(this, cp(), new C2217381BqS() { // from class: X.0HwH
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C454050HrH) obj).LLIZ;
            }
        }, null, new AwS620S0100000_6(this, 21), 6);
        C736680Sv4.LJIIIIZZ(this, cp(), new C2217381BqS() { // from class: X.0HwI
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C454050HrH) obj).LLILZIL;
            }
        }, null, new AwS620S0100000_6(this, 22), 6);
        C736680Sv4.LJIIIIZZ(this, cp(), new C2217381BqS() { // from class: X.0HwJ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C454050HrH) obj).LLILLL;
            }
        }, null, new AwS620S0100000_6(this, 25), 6);
        C736680Sv4.LJIIIIZZ(this, cp(), new C2217381BqS() { // from class: X.0HrN
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C454050HrH) obj).LLILZLL;
            }
        }, null, new AwS620S0100000_6(this, 26), 6);
        C441201ne.LIZ(this, new C463000IDq(Jo().LLIZ, 28), "sticker_panel_unified_quick_message", new AwS585S0100000_6(this, 84));
    }
}
