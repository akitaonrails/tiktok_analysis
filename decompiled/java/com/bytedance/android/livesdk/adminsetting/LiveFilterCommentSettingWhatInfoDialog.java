package com.bytedance.android.livesdk.adminsetting;

import X.C16FS;
import X.C500980Jkm;
import X.C786410Ut5;
import Y.ACListenerS147S0100000_12;
import android.os.Bundle;
import android.view.View;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.dataChannel.LiveEndDismissDialogEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveFilterCommentSettingWhatInfoDialog extends LiveDialogFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KSEhICEgLTE4ICHELIOSE0ZgklPyoVISk4LD0QJyghLCEnGyA4PSY9LxIkKDsaJiMjDSYyJCor";

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.g6l);
        c500980Jkm.LJII = 80;
        c500980Jkm.LJIIIZ = -1;
        c500980Jkm.LJIIJ = -1;
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C786410Ut5.g8((LiveIconView) view.findViewById(R.id.jzi), new ACListenerS147S0100000_12(this, 113));
        C786410Ut5.h8((C16FS) view.findViewById(R.id.cst), new ACListenerS147S0100000_12(this, 114));
        C786410Ut5.I7(new ACListenerS147S0100000_12(this, 115), view.findViewById(R.id.view_outter));
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.BQ2(this, LiveEndDismissDialogEvent.class, new AwS591S0100000_12(this, 152));
        }
    }
}
