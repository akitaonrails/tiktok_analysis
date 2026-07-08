package com.ss.android.ugc.aweme.im.saas.host.impl.postmode;

import X.C0M3E;
import X.C0ZYO;
import X.C1EE2;
import X.C562310M3p;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.im.saas.host.api.postmode.IMPostModeService;

/* JADX INFO: loaded from: classes9.dex */
public final class IMPostModeServiceImpl implements IMPostModeService {
    @Override // com.ss.android.ugc.aweme.im.saas.host.api.postmode.IMPostModeService
    public final boolean LIZIZ() {
        return C1EE2.LIZIZ.LIZIZ();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0M3p] */
    @Override // com.ss.android.ugc.aweme.im.saas.host.api.postmode.IMPostModeService
    public final C562310M3p LIZJ(View view) {
        ViewGroup viewGroup;
        if (!(view instanceof ViewGroup) || (viewGroup = (ViewGroup) view) == null) {
            return null;
        }
        final C0M3E c0m3eLJIIJJI = C1EE2.LIZIZ.LJIIJJI(viewGroup);
        return new C0ZYO(c0m3eLJIIJJI) { // from class: X.0M3p
            public final C0M3E LIZ;

            {
                this.LIZ = c0m3eLJIIJJI;
            }

            @Override // X.C0ZYO
            public final void LIZIZ(boolean z) {
                this.LIZ.LIZIZ(z);
            }

            @Override // X.C0ZYO
            public final void LIZJ(EnumC562330M3r enumC562330M3r) {
                C0M0M c0m0m;
                C0M3E c0m3e = this.LIZ;
                int i = C562320M3q.LIZ[enumC562330M3r.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            c0m0m = C0M0M.LIVE_PHOTO;
                        } else {
                            throw new C1954807lC();
                        }
                    } else {
                        c0m0m = C0M0M.PHOTO;
                    }
                } else {
                    c0m0m = C0M0M.TEXT;
                }
                c0m3e.LJFF(c0m0m);
            }
        };
    }
}
