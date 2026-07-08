package com.ss.android.ugc.aweme.tako.botpage.bottombox.novelbot;

import X.C019F;
import X.C01GW;
import X.C09R3;
import X.C13LE;
import X.C1637806bA;
import X.C1637906bB;
import X.C19719912Dl;
import X.C20242114Ih;
import X.C2217381BqS;
import X.C384050F3z;
import X.C418440Gaw;
import X.C427690Gpr;
import X.C452501pT;
import X.C724750Sbp;
import X.EnumC20241814Ie;
import X.InterfaceC1859790yUr;
import X.InterfaceC2217461Bqa;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.novelbot.BottomNovelBotContinueAssem;
import com.ss.android.ugc.aweme.tako.botpage.cards.novel.core.TakoNovelBotViewModel;
import com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.MessageChunkResult;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS274S0000000_30;
import kotlin.jvm.internal.AwS116S0110000_30;
import kotlin.jvm.internal.AwS396S0200000_30;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS574S0100000_30;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.AwS609S0100000_30;

/* JADX INFO: loaded from: classes31.dex */
public final class BottomNovelBotContinueAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJJIL;
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1248));
    public final AssemVMLazy LLJJIII;
    public final C01GW LLJJIJI;
    public final AssemVMLazy LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final C01GW LLJJJ;
    public final C01GW LLJJJIL;
    public final C20242114Ih LLJJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BottomNovelBotContinueAssem.class, "messageViewModel", "getMessageViewModel()Lcom/ss/android/ugc/aweme/tako/botpage/vm/MessageViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(BottomNovelBotContinueAssem.class, "novelBotViewModel", "getNovelBotViewModel()Lcom/ss/android/ugc/aweme/tako/botpage/cards/novel/core/TakoNovelBotViewModel;", 0);
        c09r3.getClass();
        LLJJJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [X.14Ih] */
    public BottomNovelBotContinueAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MessageViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJJIII = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS568S0100000_24(c19719912DlLIZ, 1249), AFwS274S0000000_30.get$arr$(129), null, true);
        this.LLJJIJI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1251));
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(TakoNovelBotViewModel.class);
        this.LLJJIJIIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS568S0100000_24(c19719912DlLIZ2, 1250), AFwS274S0000000_30.get$arr$(130), null, true);
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS574S0100000_30(this, 205));
        this.LLJJJ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1247));
        this.LLJJJIL = C452501pT.LIZIZ(new AwS574S0100000_30(this, 204));
        this.LLJJJJ = new InterfaceC1859790yUr() { // from class: X.14Ih
            @Override // X.InterfaceC1859790yUr
            public final void onFail() {
                TakoNovelBotViewModel takoNovelBotViewModelHp = this.LIZ.hp();
                takoNovelBotViewModelHp.setStateImmediate(new AwS609S0100000_30(EnumC20241814Ie.FAILED, 314));
                takoNovelBotViewModelHp.setStateImmediate(new AwS116S0110000_30(true, takoNovelBotViewModelHp, 3));
            }

            @Override // X.InterfaceC1859790yUr
            public final void LIZ(MessageChunkResult messageChunkResult) {
                BottomNovelBotContinueAssem bottomNovelBotContinueAssem = this.LIZ;
                AwS396S0200000_30 awS396S0200000_30 = new AwS396S0200000_30(messageChunkResult, bottomNovelBotContinueAssem, 20);
                AssemVMLazy assemVMLazy = bottomNovelBotContinueAssem.LLJJIII;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = BottomNovelBotContinueAssem.LLJJJJJIL;
                bottomNovelBotContinueAssem.withState(assemVMLazy.getValue(), new AwS396S0200000_30(bottomNovelBotContinueAssem, (BottomNovelBotContinueAssem) awS396S0200000_30, (Function1<? super Message, Unit>) 67));
            }
        };
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.fkd;
    }

    public final TakoNovelBotViewModel hp() {
        AssemVMLazy assemVMLazy = this.LLJJIJIIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJJIL;
        return (TakoNovelBotViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.zj);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(200));
        view.setBackground(c384050F3z.LIZ(view.getContext()));
        C427690Gpr.LJ(view, C418440Gaw.LIZIZ(200));
        hp().LLILLL = (Function0) this.LLJJJIL.getValue();
        TakoNovelBotViewModel takoNovelBotViewModelHp = hp();
        AssemViewModel.selectSubscribe$default(takoNovelBotViewModelHp, new C2217381BqS() { // from class: X.14Ik
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C20241914If) obj).LLILLL;
            }
        }, null, null, null, new AwS609S0100000_30(new AwS609S0100000_30(this, 90), 312), 14, null);
        AssemViewModel.selectSubscribe$default(takoNovelBotViewModelHp, new C2217381BqS() { // from class: X.14Ib
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C20241914If) obj).LLILLJJLI;
            }
        }, null, null, null, new AwS609S0100000_30(new AwS396S0200000_30(this, view, 19), 313), 14, null);
        AssemViewModel.selectSubscribe$default(takoNovelBotViewModelHp, new C2217381BqS() { // from class: X.14Ij
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C20241914If) obj).LL);
            }
        }, null, null, null, new AwS605S0100000_26(new AwS609S0100000_30(this, 91), 803), 14, null);
        TakoNovelBotViewModel takoNovelBotViewModelHp2 = hp();
        takoNovelBotViewModelHp2.setStateImmediate(new AwS609S0100000_30(EnumC20241814Ie.LOADING, 314));
        takoNovelBotViewModelHp2.setStateImmediate(new AwS116S0110000_30(false, takoNovelBotViewModelHp2, 3));
        AwS116S0110000_30 awS116S0110000_30 = new AwS116S0110000_30(this, true, 4);
        AssemVMLazy assemVMLazy = this.LLJJIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJJIL;
        withState(assemVMLazy.getValue(), new AwS396S0200000_30(this, (BottomNovelBotContinueAssem) awS116S0110000_30, (Function1<? super Message, Unit>) 67));
    }
}
