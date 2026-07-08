package com.bytedance.android.livesdk.share;

import X.C1106210etP;
import X.C1161920gLG;
import X.C481220Iu0;
import X.C497740JfY;
import X.C500950Jkj;
import X.InterfaceC1118490fDD;
import X.InterfaceC1372610lp5;
import X.InterfaceC481210Itz;
import android.app.Activity;
import android.app.Dialog;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import com.bytedance.android.live.share.IShareService;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveShareDialog extends LiveDialogFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiHELIOSA/LSR9Oy0tOyp9BCw6LBw7KTcpDSYyJCor";
    public boolean LL = true;
    public C1106210etP LLILLJJLI;
    public InterfaceC1372610lp5 LLILLL;

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0024  */
    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C500980Jkm createParams() {
        /*
            r6 = this;
            X.0etP r0 = r6.LLILLJJLI
            r1 = 1
            if (r0 == 0) goto L44
            boolean r0 = r0.LJJJIL
        L7:
            r6.LL = r0
            if (r0 == 0) goto L37
            r3 = 2131887753(0x7f120689, float:1.9410122E38)
            if (r0 != r1) goto L2f
            r4 = 80
        L12:
            boolean r0 = r6.LL
            r2 = -1
            if (r0 != r1) goto L24
            r5 = -1
        L18:
            boolean r0 = r6.LL
            if (r0 == r1) goto L46
            if (r0 == 0) goto L46
            X.07lC r0 = new X.07lC
            r0.<init>()
            throw r0
        L24:
            if (r0 != 0) goto L87
            r0 = 1136361472(0x43bb8000, float:375.0)
            float r0 = X.C497740JfY.LIZIZ(r0)
            int r5 = (int) r0
            goto L18
        L2f:
            if (r0 == 0) goto L3a
            X.07lC r0 = new X.07lC
            r0.<init>()
            throw r0
        L37:
            r3 = 2131887820(0x7f1206cc, float:1.9410258E38)
        L3a:
            boolean r0 = X.C497740JfY.LJJ()
            if (r0 == 0) goto L42
            r4 = 3
            goto L12
        L42:
            r4 = 5
            goto L12
        L44:
            r0 = 1
            goto L7
        L46:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "share dialog createParams , isPortrait = "
            r1.append(r0)
            boolean r0 = r6.LL
            r1.append(r0)
            java.lang.String r0 = ", share params = "
            r1.append(r0)
            X.0etP r0 = r6.LLILLJJLI
            r1.append(r0)
            java.lang.String r0 = " , data channel = "
            r1.append(r0)
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = r6.dataChannel
            r1.append(r0)
            r0 = 32
            r1.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "LiveShareDialog"
            X.C20441214yg.LIZIZ(r0, r1)
            X.0Jkm r1 = new X.0Jkm
            r0 = 2131567565(0x7f0d23cd, float:1.8760704E38)
            r1.<init>(r0)
            r1.LIZJ = r3
            r1.LJII = r4
            r1.LJIIIZ = r5
            r1.LJIIJ = r2
            return r1
        L87:
            X.07lC r0 = new X.07lC
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.share.LiveShareDialog.createParams():X.0Jkm");
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final InterfaceC1118490fDD genLandscapeDialogProxy() {
        return new C500950Jkj(R.layout.g5h);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final Dialog newDialog(Bundle bundle) {
        if (this.LLILLJJLI != null && this.LLILLL != null) {
            InterfaceC481210Itz interfaceC481210ItzMh = ((IShareService) C1161920gLG.LIZJ(IShareService.class)).mh();
            return ((C481220Iu0) interfaceC481210ItzMh).LIZ.getShareDialog(getActivity(), this.LLILLJJLI, this.LLILLL);
        }
        return super.newDialog(bundle);
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (isShowing()) {
            dismiss();
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        getActivity();
        return layoutInflaterOnGetLayoutInflater;
    }

    public static final LiveShareDialog MR(C1106210etP c1106210etP, InterfaceC1372610lp5 interfaceC1372610lp5) {
        LiveShareDialog liveShareDialog = new LiveShareDialog();
        liveShareDialog.LLILLJJLI = c1106210etP;
        liveShareDialog.LLILLL = interfaceC1372610lp5;
        return liveShareDialog;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Dialog dialog;
        Window window;
        super.onViewCreated(view, bundle);
        if (this.LL && (dialog = getDialog()) != null && (window = dialog.getWindow()) != null) {
            window.setStatusBarColor(C497740JfY.LJFF(R.color.a1d));
        }
    }

    public static final TuxSheet NR(Activity activity, C1106210etP c1106210etP, InterfaceC1372610lp5 interfaceC1372610lp5) {
        return ((C481220Iu0) ((IShareService) C1161920gLG.LIZJ(IShareService.class)).mh()).LIZ(activity, c1106210etP, interfaceC1372610lp5);
    }
}
