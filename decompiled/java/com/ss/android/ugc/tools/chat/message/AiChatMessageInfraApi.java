package com.ss.android.ugc.tools.chat.message;

import X.C05YF;
import X.C869590Y9l;
import X.C904800ZeY;
import X.InterfaceC494301wD;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.view.View;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.IMessageEventProtocol;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes33.dex */
public interface AiChatMessageInfraApi extends C05YF, InterfaceC494301wD {
    List<C869590Y9l> Fu();

    void Gv0();

    void Pc(int i);

    void R80(C904800ZeY c904800ZeY);

    void RP1(int i);

    void Sq1();

    <T> T Ue1(Function2<? super View, ? super ViewOnAttachStateChangeListenerC20604515jv, ? extends T> function2);

    void Uk(long j);

    void ca0();

    void g6(Function1<? super Boolean, Unit> function1);

    void kw(String str, long j, boolean z);

    void lb(IMessageEventProtocol iMessageEventProtocol);

    void mv(boolean z);

    void pj(IMessageEventProtocol iMessageEventProtocol);
}
