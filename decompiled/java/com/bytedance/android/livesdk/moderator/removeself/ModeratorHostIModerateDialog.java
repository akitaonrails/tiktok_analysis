package com.bytedance.android.livesdk.moderator.removeself;

import X.C1145100fu8;
import X.C1161920gLG;
import X.C19EH;
import X.C748470TXp;
import X.C786410Ut5;
import Y.ACListenerS147S0100000_12;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import com.bytedance.android.live.common.keyboard.MeasureLinearLayout;
import com.bytedance.android.live.moderator.IModeratorService;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.dataChannel.BroadcastDialogPageChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes13.dex */
public final class ModeratorHostIModerateDialog extends LiveDialogFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9JSooLD0yPCo+ZzHELIOS02JSo6LDw2JCNiBCA3LTctPSAhACo/PQYeJyEpOy4nLQElKCM8Lw==";
    public MeasureLinearLayout LL;
    public View LLILLJJLI;

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C500980Jkm createParams() {
        /*
            r6 = this;
            com.bytedance.ies.sdk.datachannel.DataChannel r2 = r6.dataChannel
            r1 = 1
            if (r2 == 0) goto L3e
            java.lang.Class<X.0TZM> r0 = X.C0TZM.class
            java.lang.Object r0 = r2.gg0(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L3e
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L3f
            r5 = 2131886824(0x7f1202e8, float:1.9408238E38)
        L18:
            r4 = 5
        L19:
            r3 = -1
            if (r0 != r1) goto L36
            r2 = -1
            r3 = -2
        L1e:
            X.0Jkm r1 = new X.0Jkm
            r0 = 2131569055(0x7f0d299f, float:1.8763726E38)
            r1.<init>(r0)
            r1.LIZJ = r5
            r0 = 48
            r1.LJIILIIL = r0
            r1.LJII = r4
            r1.LJIIIZ = r2
            r1.LJIIJ = r3
            r0 = 0
            r1.LJI = r0
            return r1
        L36:
            r0 = 1140129792(0x43f50000, float:490.0)
            float r0 = X.C497740JfY.LIZIZ(r0)
            int r2 = (int) r0
            goto L1e
        L3e:
            r0 = 1
        L3f:
            r5 = 2131886823(0x7f1202e7, float:1.9408236E38)
            if (r0 != r1) goto L47
            r4 = 80
            goto L19
        L47:
            if (r0 == 0) goto L18
            X.07lC r0 = new X.07lC
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.moderator.removeself.ModeratorHostIModerateDialog.createParams():X.0Jkm");
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Window window;
        super.onViewCreated(view, bundle);
        View viewFindViewById = this.LL;
        View viewFindViewById2 = null;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.o4y);
            } else {
                viewFindViewById = null;
            }
            this.LL = (MeasureLinearLayout) viewFindViewById;
        }
        ((MeasureLinearLayout) viewFindViewById).setWindowInsetsEnable(true);
        View view3 = this.LLILLJJLI;
        if (view3 == null) {
            View view4 = getView();
            if (view4 != null) {
                viewFindViewById2 = view4.findViewById(R.id.uvy);
            }
            this.LLILLJJLI = viewFindViewById2;
            view3 = viewFindViewById2;
        }
        C786410Ut5.I7(new ACListenerS147S0100000_12(this, 227), view3);
        ModeratorHostIModeratorListFragment moderatorHostIModeratorListFragmentQp0 = ((IModeratorService) C1161920gLG.LIZJ(IModeratorService.class)).Qp0();
        if (moderatorHostIModeratorListFragmentQp0 != null) {
            C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
            c19ehLJIIJ.LIZIZ(R.id.iye, moderatorHostIModeratorListFragmentQp0);
            c19ehLJIIJ.LJIIIZ();
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.BQ2(this, BroadcastDialogPageChannel.class, new C748470TXp(this));
        }
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            C1145100fu8.LIZ(window);
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(0);
            window.setNavigationBarColor(-1);
        }
    }
}
