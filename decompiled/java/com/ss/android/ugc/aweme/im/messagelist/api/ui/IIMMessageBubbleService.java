package com.ss.android.ugc.aweme.im.messagelist.api.ui;

import X.AnonymousClass0956;
import X.C0ZXS;
import X.C0ZY6;
import X.C422360GhG;
import android.view.View;
import androidx.lifecycle.LifecycleCoroutineScope;
import com.ss.android.ugc.aweme.models.MessageBubbleStyle;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes15.dex */
public interface IIMMessageBubbleService {
    AnonymousClass0956 LIZ(View view, C0ZXS c0zxs, boolean z, LifecycleCoroutineScope lifecycleCoroutineScope, Function0 function0, Function1 function1, C0ZY6 c0zy6);

    C0ZXS LIZIZ(MessageBubbleStyle messageBubbleStyle);

    void LIZJ(View view, double d, double d2, int i, int i2);

    C0ZXS LIZLLL(MessageBubbleStyle messageBubbleStyle);

    C0ZXS LJ(MessageBubbleStyle messageBubbleStyle);

    View LJFF(View view, boolean z);

    C0ZXS LJI(MessageBubbleStyle messageBubbleStyle);

    AnonymousClass0956 LJII(View view, C0ZXS c0zxs, boolean z, LifecycleCoroutineScope lifecycleCoroutineScope, Function0 function0, Function1 function1, C0ZY6 c0zy6);

    C422360GhG LJIIIIZZ();
}
