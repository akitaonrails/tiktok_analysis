package com.bytedance.android.livesdk.adminsetting;

import X.C0IJT;
import X.C0KYR;
import X.C1143680frq;
import X.C1143780fs0;
import X.C16FS;
import X.C20736316Cj;
import X.C20743516Fd;
import X.C474500IjA;
import X.C497740JfY;
import X.C500980Jkm;
import X.C786410Ut5;
import Y.ACListenerS142S0100000_7;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.dataChannel.LiveEndDismissDialogEvent;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveFilterCommentSettingReviewInfoDialogNew extends LiveDialogFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KSEhICEgLTE4ICE0ZgHELIOSklPyoVISk4LD0QJyghLCEnGyA4PSY9LxcpPyY2PwwiLyAXISQgJigdLTI=";

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.g6j);
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
        String strLJIIJ;
        super.onViewCreated(view, bundle);
        C786410Ut5.g8((LiveIconView) view.findViewById(R.id.jzi), new ACListenerS142S0100000_7(this, 13));
        C786410Ut5.h8((C16FS) view.findViewById(R.id.cst), new ACListenerS142S0100000_7(this, 14));
        C786410Ut5.I7(new ACListenerS142S0100000_7(this, 15), view.findViewById(R.id.view_outter));
        TextView textView = (TextView) view.findViewById(R.id.zf0);
        Context context = getContext();
        if (context != null) {
            String string = context.getString(2131834609, "|");
            int iLJJJ = a0.LJJJ(string, "|", 0, false, 6);
            SpannableString spannableString = new SpannableString(string);
            C20743516Fd c20743516FdLIZLLL = C20736316Cj.LIZLLL(R.attr.cca, getContext());
            if (c20743516FdLIZLLL != null) {
                int iLIZIZ = (int) C497740JfY.LIZIZ(15);
                c20743516FdLIZLLL.setBounds(0, 0, iLIZIZ, iLIZIZ);
                C786410Ut5.p2(spannableString, new ImageSpan(c20743516FdLIZLLL, 1), iLJJJ, iLJJJ + 1, 17);
                textView.setText(spannableString);
            }
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.BQ2(this, LiveEndDismissDialogEvent.class, new AwS586S0100000_7(this, 21));
        }
        View viewFindViewById = view.findViewById(R.id.lj9);
        if (viewFindViewById != null) {
            if (C497740JfY.LJJ()) {
                strLJIIJ = C1143780fs0.LJIIJ("tiktok_live_watch_resource_demand_3", "filtered_comment_rtl_x2.png");
            } else {
                strLJIIJ = C1143780fs0.LJIIJ("tiktok_live_watch_resource_demand_3", "filtered_comment_x2.png");
            }
            C1143680frq.LJI(viewFindViewById, strLJIIJ, null, true);
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_comment_filter_learn_more_click");
        c474500IjALIZ.LJIJJLI(this.dataChannel);
        c474500IjALIZ.LJJII(C0KYR.LIZJ(this.dataChannel), "admin_type");
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
        c474500IjALIZ.LIZ();
    }
}
