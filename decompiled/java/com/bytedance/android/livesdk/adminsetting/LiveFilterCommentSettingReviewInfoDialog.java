package com.bytedance.android.livesdk.adminsetting;

import X.C0HTI;
import X.C16FS;
import X.C500980Jkm;
import X.C786410Ut5;
import Y.ACListenerS142S0100000_7;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.dataChannel.LiveEndDismissDialogEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS586S0100000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveFilterCommentSettingReviewInfoDialog extends LiveDialogFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KSEhICEgLTE4ICE0HELIOSZgklPyoVISk4LD0QJyghLCEnGyA4PSY9LxcpPyY2PwwiLyAXISQgJig=";

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.g6i);
        c500980Jkm.LJII = 80;
        c500980Jkm.LJIIIZ = -1;
        c500980Jkm.LJIIJ = -1;
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        getActivity();
        return layoutInflaterOnGetLayoutInflater;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C786410Ut5.g8((LiveIconView) view.findViewById(R.id.jzi), new ACListenerS142S0100000_7(this, 10));
        C786410Ut5.h8((C16FS) view.findViewById(R.id.cst), new ACListenerS142S0100000_7(this, 11));
        C786410Ut5.I7(new ACListenerS142S0100000_7(this, 12), view.findViewById(R.id.view_outter));
        Context context = getContext();
        if (context != null) {
            AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(R.id.k69);
            C0HTI c0hti = new C0HTI();
            c0hti.LIZ = R.drawable.pm;
            appCompatImageView.setImageDrawable(c0hti.LIZ(context));
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.BQ2(this, LiveEndDismissDialogEvent.class, new AwS586S0100000_7(this, 20));
        }
    }
}
