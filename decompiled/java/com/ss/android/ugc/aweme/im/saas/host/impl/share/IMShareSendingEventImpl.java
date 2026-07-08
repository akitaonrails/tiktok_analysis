package com.ss.android.ugc.aweme.im.saas.host.impl.share;

import X.C1365850leB;
import X.C14EU;
import X.C15580068c;
import X.C913530Zsd;
import X.C913560Zsg;
import com.ss.android.ugc.aweme.im.saas.host.api.share.IMShareSendingEventApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS593S0100000_14;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes15.dex */
public final class IMShareSendingEventImpl implements IMShareSendingEventApi {
    public Function1<? super C913560Zsg, Unit> LIZIZ;

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.share.IMShareSendingEventApi
    public final void LIZ() {
        C15580068c.LIZ.getClass();
        C15580068c.LIZ(this);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.share.IMShareSendingEventApi
    public final void LIZIZ() {
        C15580068c.LIZ.getClass();
        C15580068c.LIZIZ(this);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.share.IMShareSendingEventApi
    public final void LIZJ(C913530Zsd c913530Zsd) {
        this.LIZIZ = c913530Zsd;
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onShareCompleteEvent(C1365850leB c1365850leB) {
        Function1<? super C913560Zsg, Unit> function1 = this.LIZIZ;
        if (function1 != null) {
            function1.invoke(new C913560Zsg(c1365850leB.LJIILIIL, c1365850leB.LIZIZ, c1365850leB.LJIIIIZZ, c1365850leB.LIZJ, new AwS593S0100000_14(c1365850leB, 74), c1365850leB, 16));
        }
    }
}
