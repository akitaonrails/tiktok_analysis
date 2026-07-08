package com.bytedance.android.livesdk.adminsetting;

import X.C0IJT;
import X.C0KYR;
import X.C1119920fFW;
import X.C1143680frq;
import X.C1143780fs0;
import X.C16FS;
import X.C2188811AlT;
import X.C474500IjA;
import X.C497740JfY;
import X.C500980Jkm;
import X.C786410Ut5;
import Y.ACListenerS142S0100000_7;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.dataChannel.LiveEndDismissDialogEvent;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveFilterCommentsFlagUpdatesDialog extends LiveDialogFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KSEhICEgLTE4HELIOSICE0ZgklPyoVISk4LD0QJyghLCEnOwMgKCgGOCEtPSogDCwtJSA0";

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
        TextView textView = (TextView) view.findViewById(R.id.tv_title);
        TextView textView2 = (TextView) view.findViewById(R.id.zf0);
        C786410Ut5.g8((LiveIconView) view.findViewById(R.id.jzi), new ACListenerS142S0100000_7(this, 16));
        C786410Ut5.h8((C16FS) view.findViewById(R.id.cst), new ACListenerS142S0100000_7(this, 17));
        C786410Ut5.I7(new ACListenerS142S0100000_7(this, 18), view.findViewById(R.id.view_outter));
        textView.setText(C497740JfY.LJIJI(2131834616));
        if (getContext() != null) {
            String strLJIJI = C497740JfY.LJIJI(2131842728);
            if (strLJIJI == null) {
                strLJIJI = "";
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(C497740JfY.LJIJJ(2131834614, strLJIJI));
            sbLIZ.append("\n\n");
            sbLIZ.append(C497740JfY.LJIJI(2131834615));
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            int iLJJJ = a0.LJJJ(C497740JfY.LJIJJ(2131834614, "||||"), "||||", 0, false, 6);
            int length = strLJIJI.length() + iLJJJ;
            SpannableString spannableString = new SpannableString(strLIZIZ);
            C1119920fFW.LJIIIIZZ(spannableString, iLJJJ, length, 34, OppoPermissionPopupMaskDelayExp.DEFAULT);
            textView2.setText(spannableString);
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.BQ2(this, LiveEndDismissDialogEvent.class, new AwS586S0100000_7(this, 22));
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
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_comment_filter_education_popup_show");
        c474500IjALIZ.LJIJJLI(this.dataChannel);
        c474500IjALIZ.LJJII(C0KYR.LIZJ(this.dataChannel), "admin_type");
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
        c474500IjALIZ.LIZ();
    }
}
