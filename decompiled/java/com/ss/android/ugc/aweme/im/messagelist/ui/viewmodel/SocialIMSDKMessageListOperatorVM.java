package com.ss.android.ugc.aweme.im.messagelist.ui.viewmodel;

import X.AbstractC1702506lb;
import X.C01GW;
import X.C05YD;
import X.C09IR;
import X.C11NJ;
import X.C11NZ;
import X.C11RK;
import X.C11RO;
import X.C11S5;
import X.C1239300iM4;
import X.C13LE;
import X.C1807770x8x;
import X.C1BNE;
import X.C2217381BqS;
import X.C2252321DDq;
import X.C2252331DDr;
import X.C452501pT;
import X.C869590Y9l;
import X.C904630ZeH;
import X.InterfaceC1755906uD;
import X.InterfaceC2217461Bqa;
import X.InterfaceC904740ZeS;
import X.InterfaceC905060Zey;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import java.util.List;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.AwS593S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class SocialIMSDKMessageListOperatorVM extends MessageListOperatorVM {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIL;
    public final InterfaceC1755906uD LLILLL;
    public final InterfaceC905060Zey LLILZ;
    public final String LLJ;
    public boolean LLJIJIL;
    public final C2252331DDr LLJILLL;
    public final C2252331DDr LLJJ;
    public final C2252321DDq LLJJI;
    public final C2252321DDq LLJJIII;
    public final C2252321DDq LLJJIJI;
    public volatile C1807770x8x LLJJIJIIJIL;
    public final C11NJ LLILZIL = new C11NJ();
    public final C11NJ LLILZLL = new C11NJ();
    public final C01GW LLIZ = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(149));
    public final C11RO LLIZLLLIL = C11S5.LIZ();
    public boolean LLJI = true;
    public final C11RK<InterfaceC904740ZeS> LLJILJIL = new C11RK<>();
    public final C11RK<AbstractC1702506lb> LLJILJILJ = new C11RK<>();

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SocialIMSDKMessageListOperatorVM.class, "messageModelObservableProvider", "getMessageModelObservableProvider()Lcom/ss/android/ugc/aweme/im/sdk/chat/data/rx/MessageModelObservableProvider;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.ui.viewmodel.MessageListOperatorVM, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    public final void AQ2() {
        this.LLILZIL.LIZ(C1239300iM4.LIZLLL(this.LLILZ.LIZLLL(this.LLJ).LJJIJIIJI(this.LLIZLLLIL), new AwS593S0100000_14(this, 62), new AwS593S0100000_14(this, 63)));
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.ChatroomEventAbility
    public final List<C869590Y9l> OM0() {
        return this.LLILLL.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.ChatroomEventAbility
    public final void refresh() {
        this.LLILLL.refresh();
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.ui.viewmodel.MessageListOperatorVM
    public final List<C869590Y9l> vQ2() {
        return this.LLILLL.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.ui.viewmodel.MessageListOperatorVM
    public final void yQ2() {
        this.LLJJIJI.setValue(Boolean.TRUE);
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.ui.viewmodel.MessageListOperatorVM
    public final void zQ2() {
        this.LLJJI.setValue(Boolean.TRUE);
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.LLJILJIL.onComplete();
        this.LLJILJILJ.onComplete();
        this.LLILZLL.LJ();
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListHasRenderedProvider
    public final C05YD<Boolean> W42() {
        return this.LLJJIII;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListHasRenderedProvider
    public final C05YD<Boolean> dX() {
        return this.LLJJIJI;
    }

    @Override // X.C0NZW
    public final C2252331DDr mz2() {
        return this.LLJJ;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.ui.viewmodel.MessageListOperatorVM, com.ss.android.ugc.aweme.im.messagelist.api.ability.ChatroomEventAbility
    public final C11NZ<InterfaceC904740ZeS> s9() {
        return this.LLJILJIL;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.ui.viewmodel.MessageListOperatorVM
    public final boolean wQ2() {
        return this.LLJIJIL;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.ChatroomEventAbility
    public final void QU0(InterfaceC904740ZeS interfaceC904740ZeS) {
        this.LLJILJIL.onNext(interfaceC904740ZeS);
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.ui.viewmodel.MessageListOperatorVM
    public final void xQ2(LifecycleOwner lifecycleOwner) {
        lifecycleOwner.getLifecycle().addObserver(new SocialIMSDKMessageListOperatorVM$initLifecycleOwner$1(this, lifecycleOwner));
    }

    public SocialIMSDKMessageListOperatorVM(C904630ZeH c904630ZeH, InterfaceC1755906uD interfaceC1755906uD, InterfaceC905060Zey interfaceC905060Zey) {
        this.LLILLL = interfaceC1755906uD;
        this.LLILZ = interfaceC905060Zey;
        this.LLJ = c904630ZeH.LIZ;
        C2252331DDr c2252331DDrLIZIZ = C09IR.LIZIZ(0, 1, null, 5);
        this.LLJILLL = c2252331DDrLIZIZ;
        this.LLJJ = c2252331DDrLIZIZ;
        Boolean bool = Boolean.FALSE;
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(bool);
        this.LLJJI = c2252321DDqLIZ;
        this.LLJJIII = c2252321DDqLIZ;
        this.LLJJIJI = C1BNE.LIZ(bool);
    }
}
