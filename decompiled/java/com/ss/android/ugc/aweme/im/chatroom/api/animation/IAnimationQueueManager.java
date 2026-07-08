package com.ss.android.ugc.aweme.im.chatroom.api.animation;

import X.AbstractC1751306tT;
import X.C06XH;
import X.InterfaceC494301wD;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public interface IAnimationQueueManager extends InterfaceC494301wD {
    void enqueue(Function1<? super Function1<? super Boolean, Unit>, Unit> function1, Function0<Unit> function0, C06XH c06xh, Function1<? super Boolean, Unit> function12, boolean z, boolean z2, long j, AbstractC1751306tT abstractC1751306tT);

    void onPopupOrSheetDismissed(boolean z);

    void setLongPressPopupShowing(boolean z);
}
