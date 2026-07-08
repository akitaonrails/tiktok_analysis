package com.ss.android.ugc.aweme.im.messagelist.ui.viewmodel;

import X.AbstractC1702506lb;
import X.C0NZW;
import X.C11NZ;
import X.C823170WQx;
import X.C869590Y9l;
import X.InterfaceC904740ZeS;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.ChatroomEventAbility;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListHasRenderedProvider;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes15.dex */
public abstract class MessageListOperatorVM extends ViewModel implements ChatroomEventAbility, MessageListHasRenderedProvider, C0NZW, GenericLifecycleObserver {
    public final C823170WQx<Function1<InterfaceC904740ZeS, Unit>> LL = new C823170WQx<>();
    public final C823170WQx<Function1<AbstractC1702506lb, Unit>> LLILLJJLI = new C823170WQx<>();

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.ChatroomEventAbility
    public abstract C11NZ<InterfaceC904740ZeS> s9();

    public abstract List<C869590Y9l> vQ2();

    public abstract boolean wQ2();

    public abstract void xQ2(LifecycleOwner lifecycleOwner);

    public abstract void yQ2();

    public abstract void zQ2();
}
