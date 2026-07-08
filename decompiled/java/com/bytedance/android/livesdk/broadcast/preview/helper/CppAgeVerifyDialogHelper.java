package com.bytedance.android.livesdk.broadcast.preview.helper;

import X.C1143680frq;
import X.C1143780fs0;
import X.C16FS;
import X.C497740JfY;
import X.C500980Jkm;
import X.C786410Ut5;
import Y.ACListenerS147S0100000_12;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes13.dex */
public final class CppAgeVerifyDialogHelper extends LiveDialogFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KjcjKCswKTY4ZzHELIOS8hLTMlLDh9ICAgOSohZgY8OQ40LRMpOyY1MQElKCM8Lw0pJT82Og==";

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.g5a);
        c500980Jkm.LIZJ = R.style.ai6;
        c500980Jkm.LJII = 80;
        c500980Jkm.LJIIIZ = -1;
        c500980Jkm.LJIIJ = -1;
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ((TextView) view.findViewById(R.id.fti)).setText(C497740JfY.LJIJI(2131840745));
        ((TextView) view.findViewById(R.id.ftg)).setText(C497740JfY.LJIJI(2131840744));
        C786410Ut5.h8((C16FS) view.findViewById(R.id.cqt), new ACListenerS147S0100000_12(this, 138));
        C786410Ut5.I7(new ACListenerS147S0100000_12(this, 139), view.findViewById(R.id.view_outter));
        C1143680frq.LJI(view.findViewById(R.id.ft6), C1143780fs0.LJIIJ("tiktok_live_broadcast_demand_4", "ttlive_cpp_age_verify_processing.png"), null, true);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.ss.android.ugc.aweme.tux.business.base.GlobalHookDialogFragment, androidx.fragment.app.DialogFragment
    public final void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
        PopupMonitorServiceImpl.LIZ.getClass();
        PopupMonitorServiceImpl.LJJIZ(this);
    }
}
