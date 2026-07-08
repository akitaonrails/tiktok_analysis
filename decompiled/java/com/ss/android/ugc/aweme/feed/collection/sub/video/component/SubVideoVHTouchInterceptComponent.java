package com.ss.android.ugc.aweme.feed.collection.sub.video.component;

import X.AbstractC693100RGq;
import X.C0RJN;
import X.C1600710rkz;
import X.C19EG;
import X.C693090RGp;
import X.C724240Sb0;
import X.InterfaceC214902198i;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.IDetailFeedSafService;
import com.ss.android.ugc.aweme.feed.collection.sub.component.BaseSubVHTapTouchInterceptComponent;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.feed.platform.fragment.IDetailBaseAbility;

/* JADX INFO: loaded from: classes12.dex */
public final class SubVideoVHTouchInterceptComponent extends BaseSubVHTapTouchInterceptComponent<SubVideoVHTouchInterceptComponent> {
    @Override // com.ss.android.ugc.aweme.feed.collection.sub.component.BaseSubVHTapTouchInterceptComponent, X.InterfaceC693170RGx
    public final void tm(boolean z) {
        InterfaceC214902198i interfaceC214902198i;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            if (((fragmentLJI instanceof IDetailBaseAbility) || C1600710rkz.LIZ(fragmentLJI) != null) && z) {
                IDetailFeedSafService iDetailFeedSafService = (IDetailFeedSafService) PluggableExtentionKt.pluggableSpi$default(IDetailFeedSafService.class, false, false, false, 14, null);
                Object objLIZLLL = null;
                Fragment fragment = null;
                if (iDetailFeedSafService != null) {
                    C0RJN c0rjnLIZIZ = jm().LIZIZ();
                    if (c0rjnLIZIZ != null) {
                        fragment = c0rjnLIZIZ.LJ;
                    }
                    objLIZLLL = iDetailFeedSafService.LIZLLL(fragment);
                }
                if ((objLIZLLL instanceof InterfaceC214902198i) && (interfaceC214902198i = (InterfaceC214902198i) objLIZLLL) != null) {
                    interfaceC214902198i.finish();
                    return;
                }
                C19EG c19egLIZ = C724240Sb0.LIZ(this);
                if (c19egLIZ == null) {
                    return;
                }
                c19egLIZ.finish();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.component.BaseSubVHTapTouchInterceptComponent
    public final AbstractC693100RGq hp(float f, float f2, int i, long j) {
        return C693090RGp.LIZLLL;
    }
}
