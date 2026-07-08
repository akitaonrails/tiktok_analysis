package com.ss.android.ugc.aweme.im.saas.host.impl.share;

import X.C1365870leD;
import X.C14EU;
import X.C15580068c;
import X.C913430ZsT;
import com.ss.android.ugc.aweme.im.saas.host.api.share.IMShareCompleteEventApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes15.dex */
public final class IMShareCompleteEventImpl implements IMShareCompleteEventApi {
    public Function1<? super C913430ZsT, Unit> LIZIZ;

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.share.IMShareCompleteEventApi
    public final void LIZ() {
        C15580068c.LIZ.getClass();
        C15580068c.LIZ(this);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.share.IMShareCompleteEventApi
    public final void LIZIZ() {
        C15580068c.LIZ.getClass();
        C15580068c.LIZIZ(this);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.share.IMShareCompleteEventApi
    public final void LIZJ(Function1<? super C913430ZsT, Unit> function1) {
        this.LIZIZ = function1;
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onShareCompleteEvent(C1365870leD c1365870leD) {
        Function1<? super C913430ZsT, Unit> function1 = this.LIZIZ;
        if (function1 != null) {
            function1.invoke(new C913430ZsT(c1365870leD.LJIIIIZZ, Boolean.valueOf(c1365870leD.LJIILIIL), c1365870leD));
        }
    }
}
