package com.ss.android.ugc.aweme.im.saas.host.impl.share;

import X.C1365860leC;
import X.C14EU;
import X.C15580068c;
import X.C913590Zsj;
import X.C913600Zsk;
import com.ss.android.ugc.aweme.im.saas.host.api.share.IMShareUndoEventApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes15.dex */
public final class IMShareUndoEventImpl implements IMShareUndoEventApi {
    public Function1<? super C913600Zsk, Unit> LIZIZ;

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.share.IMShareUndoEventApi
    public final void LIZ() {
        C15580068c.LIZ.getClass();
        C15580068c.LIZ(this);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.share.IMShareUndoEventApi
    public final void LIZIZ() {
        C15580068c.LIZ.getClass();
        C15580068c.LIZIZ(this);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.share.IMShareUndoEventApi
    public final void LIZJ(C913590Zsj c913590Zsj) {
        this.LIZIZ = c913590Zsj;
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onShareCompleteEvent(C1365860leC c1365860leC) {
        Function1<? super C913600Zsk, Unit> function1 = this.LIZIZ;
        if (function1 != null) {
            function1.invoke(new C913600Zsk(c1365860leC.LJI, c1365860leC.LIZJ, c1365860leC));
        }
    }
}
