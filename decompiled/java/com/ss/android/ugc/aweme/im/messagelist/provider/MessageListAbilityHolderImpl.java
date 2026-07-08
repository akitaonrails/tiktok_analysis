package com.ss.android.ugc.aweme.im.messagelist.provider;

import X.C01GW;
import X.C01S9;
import X.C05YD;
import X.C11NZ;
import X.C2252331DDr;
import X.C869590Y9l;
import X.C905100Zf2;
import X.C905120Zf4;
import X.EnumC461200I6s;
import X.InterfaceC1891350zJl;
import X.InterfaceC904740ZeS;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListScrollAbility;
import com.ss.android.ugc.aweme.im.messagelist.ui.MessageListSubmitListAbilityImpl;
import com.ss.android.ugc.aweme.im.messagelist.ui.viewmodel.MessageListOperatorVM;
import com.ss.android.ugc.aweme.im.messagelist.ui.viewmodel.SocialIMSDKMessageListOperatorVM;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes15.dex */
public final class MessageListAbilityHolderImpl implements MessageListAbilityHolder, GenericLifecycleObserver {
    public final C01GW LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.IMessagePowerAdapterProtocol
    public final void C() {
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.IMessagePowerAdapterProtocol
    public final void Fj() {
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.IMessagePowerAdapterProtocol
    public final void YP2(List<? extends C869590Y9l> list, List<? extends InterfaceC904740ZeS> list2, List<? extends InterfaceC1891350zJl> list3) {
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessagePowerListAbility
    public final C05YD<List<InterfaceC1891350zJl>> B11() {
        return ((MessageListSubmitListAbilityImpl) ((C905100Zf2) this.LLILLL.getValue()).LIZ()).LLJLLL;
    }

    @Override // X.InterfaceC903640Zcg
    public final boolean LIZ() {
        return !((MessageListSubmitListAbilityImpl) ((C905100Zf2) this.LLILLL.getValue()).LIZ()).LLJJJJJIL;
    }

    @Override // X.InterfaceC903640Zcg
    public final boolean LIZLLL() {
        return ((MessageListSubmitListAbilityImpl) ((C905100Zf2) this.LLILLL.getValue()).LIZ()).LLJJJJLIIL;
    }

    public final MessageListOperatorVM LJFF() {
        return (MessageListOperatorVM) this.LLILLJJLI.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessagePowerListAbility
    public final RecyclerView LLII() {
        return (RecyclerView) ((C905120Zf4) this.LL.getValue()).LJIIIIZZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessagePowerListAbility
    public final C01S9<List<C869590Y9l>> bV1() {
        return ((MessageListSubmitListAbilityImpl) ((C905100Zf2) this.LLILLL.getValue()).LIZ()).LLJLL;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessagePowerListAbility
    public final List<C869590Y9l> vi2() {
        return ((MessageListSubmitListAbilityImpl) ((C905100Zf2) this.LLILLL.getValue()).LIZ()).vi2();
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.ChatroomEventAbility
    public final List<C869590Y9l> OM0() {
        return ((SocialIMSDKMessageListOperatorVM) LJFF()).OM0();
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListHasRenderedProvider
    public final C05YD<Boolean> W42() {
        return ((SocialIMSDKMessageListOperatorVM) LJFF()).LLJJIII;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListHasRenderedProvider
    public final C05YD<Boolean> dX() {
        return ((SocialIMSDKMessageListOperatorVM) LJFF()).LLJJIJI;
    }

    @Override // X.C0NZW
    public final C2252331DDr mz2() {
        return ((SocialIMSDKMessageListOperatorVM) LJFF()).LLJJ;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.ChatroomEventAbility
    public final void refresh() {
        ((SocialIMSDKMessageListOperatorVM) LJFF()).refresh();
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.ChatroomEventAbility
    public final C11NZ<InterfaceC904740ZeS> s9() {
        return LJFF().s9();
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.ChatroomEventAbility
    public final void QU0(InterfaceC904740ZeS interfaceC904740ZeS) {
        ((SocialIMSDKMessageListOperatorVM) LJFF()).QU0(interfaceC904740ZeS);
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListScrollAbility
    public final void C31(long j, Function2<? super C869590Y9l, ? super Integer, Unit> function2) {
        ((MessageListScrollAbility) this.LLILZ.getValue()).C31(j, function2);
    }

    public MessageListAbilityHolderImpl(C01GW<C905120Zf4> c01gw, C01GW<? extends MessageListOperatorVM> c01gw2, C01GW<C905100Zf2> c01gw3, C01GW<? extends MessageListScrollAbility> c01gw4) {
        this.LL = c01gw;
        this.LLILLJJLI = c01gw2;
        this.LLILLL = c01gw3;
        this.LLILZ = c01gw4;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListScrollAbility
    public final void d42(long j, EnumC461200I6s enumC461200I6s, boolean z, Function0<Unit> function0, Function1<? super Integer, Unit> function1, Function0<Unit> function02) {
        ((MessageListScrollAbility) this.LLILZ.getValue()).d42(j, enumC461200I6s, z, function0, function1, function02);
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListScrollAbility
    public final void nt2(int i, EnumC461200I6s enumC461200I6s, boolean z, Function0<Unit> function0, Function1<? super Integer, Unit> function1, Function0<Unit> function02) {
        ((MessageListScrollAbility) this.LLILZ.getValue()).nt2(i, enumC461200I6s, z, function0, function1, function02);
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListScrollAbility
    public final void xh1(long j, EnumC461200I6s enumC461200I6s, boolean z, Function0<Unit> function0, Function1<? super Integer, Unit> function1, Function0<Unit> function02) {
        ((MessageListScrollAbility) this.LLILZ.getValue()).xh1(j, enumC461200I6s, z, function0, function1, function02);
    }
}
