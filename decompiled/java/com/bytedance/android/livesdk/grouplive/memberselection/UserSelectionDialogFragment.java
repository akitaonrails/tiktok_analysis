package com.bytedance.android.livesdk.grouplive.memberselection;

import X.C1130290fWF;
import X.C500980Jkm;
import X.C723850SaN;
import android.os.Bundle;
import android.view.View;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS596S0100000_17;

/* JADX INFO: loaded from: classes18.dex */
public final class UserSelectionDialogFragment extends LiveDialogFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9LzcjPD8/ITMpZyI2HELIOSJScpOzw2JCAvPSY8JmsZOiohGyAgLCwnISoiDSYyJCorDz0yLygpJzs=";
    public C1130290fWF LL;

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.goh);
        c500980Jkm.LIZJ = R.style.uh;
        c500980Jkm.LJI = 0.5f;
        c500980Jkm.LJII = 80;
        c500980Jkm.LJIIIZ = -1;
        c500980Jkm.LJIIJ = -2;
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C723850SaN.LIZ(this, false, null, new AwS596S0100000_17(this, 154), 3);
    }
}
