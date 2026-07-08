package com.ss.android.ugc.aweme.im.saas.host.impl.im;

import X.C0I0B;
import X.C20684815ws;
import X.C2344009Gk;
import X.EnumC1489905sP;
import com.ss.android.ugc.aweme.im.saas.host.api.im.IMImageStudioApi;

/* JADX INFO: loaded from: classes3.dex */
public final class IMImageStudioService implements IMImageStudioApi {
    @Override // com.ss.android.ugc.aweme.im.saas.host.api.im.IMImageStudioApi
    public final void LIZ(EnumC1489905sP enumC1489905sP, String str) {
        C0I0B.LJFF.LIZIZ();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("action_type", str);
        c2344009Gk.LJIIIIZZ("badge_type", enumC1489905sP.getParam());
        C20684815ws.LJIILLIIL("imagine_studio_typing_box_entry", c2344009Gk.LIZ);
    }
}
