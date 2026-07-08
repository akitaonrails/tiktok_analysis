package com.ss.android.ugc.aweme.tako.botpage.cards.answer.messagedisclaimer;

import X.C019F;
import X.C01GW;
import X.C09R3;
import X.C13LE;
import X.C1637806bA;
import X.C1637906bB;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import X.C724750Sbp;
import X.InterfaceC1587906Jp;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC712990Rxx;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.tako.botpage.components.action.multiple.TakoMultipleSelectVM;
import com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS274S0000000_30;
import kotlin.jvm.internal.AwS574S0100000_30;
import kotlin.jvm.internal.AwS609S0100000_30;

/* JADX INFO: loaded from: classes31.dex */
public final class TakoMessageDisclamerAssem extends ReusedUISlotAssem<TakoMessageDisclamerAssem> implements InterfaceC712990Rxx<InterfaceC1891350zJl> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLLL;
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS574S0100000_30(this, 221));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS574S0100000_30(this, 218));
    public final AssemVMLazy LLJLIL;
    public boolean LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public TuxTextView LLJLLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TakoMessageDisclamerAssem.class, "multipleSelectVM", "getMultipleSelectVM()Lcom/ss/android/ugc/aweme/tako/botpage/components/action/multiple/TakoMultipleSelectVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(TakoMessageDisclamerAssem.class, "messageViewModel", "getMessageViewModel()Lcom/ss/android/ugc/aweme/tako/botpage/vm/MessageViewModel;", 0);
        c09r3.getClass();
        LLJLLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public TakoMessageDisclamerAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TakoMultipleSelectVM.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS574S0100000_30(c19719912DlLIZ, 219), AFwS274S0000000_30.get$arr$(138), null, true);
        this.LLJLL = C452501pT.LIZIZ(new AwS574S0100000_30(this, 217));
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(MessageViewModel.class);
        C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS574S0100000_30(c19719912DlLIZ2, 220), AFwS274S0000000_30.get$arr$(139), null, true);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fld;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void op() {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.botpage.cards.answer.messagedisclaimer.TakoMessageDisclamerAssem.op():void");
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLJLLIL = (TuxTextView) view.findViewById(R.id.fw7);
        AssemVMLazy assemVMLazy = this.LLJLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLLL;
        ((TakoMultipleSelectVM) assemVMLazy.getValue()).GQ2(new AwS609S0100000_30(this, 93));
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(InterfaceC1891350zJl interfaceC1891350zJl) {
        op();
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(InterfaceC1891350zJl interfaceC1891350zJl) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(InterfaceC1891350zJl interfaceC1891350zJl) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
