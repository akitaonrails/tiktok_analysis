package com.ss.android.ugc.aweme.socialavatar.mixstudio.share;

import X.C1389890mGx;
import X.C2296808zG;
import X.C468701s5;
import X.C575910MiL;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.socialavatar.api.mixstudio.MixStudioShareService;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class MixStudioShareServiceImpl implements MixStudioShareService {
    @Override // com.ss.android.ugc.aweme.socialavatar.api.mixstudio.MixStudioShareService
    public final void LIZ(Fragment fragment) {
        C1389890mGx c1389890mGx = new C1389890mGx(fragment);
        c1389890mGx.LJIIIZ(2131848945);
        c1389890mGx.LJFF(R.raw.icon_tick_circle_fill);
        c1389890mGx.LJII(R.attr.a1h);
        c1389890mGx.LJIIJJI();
    }

    @Override // com.ss.android.ugc.aweme.socialavatar.api.mixstudio.MixStudioShareService
    public final Object LIZIZ(int i, Context context, String str, List list, C575910MiL c575910MiL, boolean z) {
        return C2296808zG.LJ(new C468701s5(i, context, str, list, null, z), c575910MiL);
    }
}
