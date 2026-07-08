package com.bytedance.android.livesdk.giftlimitnotification;

import X.C1145100fu8;
import X.C19EH;
import X.C250000xu;
import X.C786410Ut5;
import Y.ACListenerS147S0100000_12;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import com.bytedance.android.live.common.keyboard.MeasureLinearLayout;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes13.dex */
public final class GiftLimitSettingAmountDialog extends LiveDialogFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9LywqPSM6JSw4JyHELIOSAnISMlKi4nISoiZwg6LjEAICI6PBYpPTs6JiINJCAmJjEIIC4/JyI=";
    public MeasureLinearLayout LL;
    public View LLILLJJLI;

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C500980Jkm createParams() {
        /*
            r5 = this;
            com.bytedance.ies.sdk.datachannel.DataChannel r2 = r5.dataChannel
            r1 = 1
            if (r2 == 0) goto L40
            java.lang.Class<X.0TZM> r0 = X.C0TZM.class
            java.lang.Object r0 = r2.gg0(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L40
            boolean r0 = r0.booleanValue()
            if (r0 == r1) goto L41
            if (r0 != 0) goto L44
            r4 = 5
        L18:
            r3 = -1
            if (r0 != r1) goto L38
            r2 = -1
            r3 = -2
        L1d:
            X.0Jkm r1 = new X.0Jkm
            r0 = 2131568290(0x7f0d26a2, float:1.8762174E38)
            r1.<init>(r0)
            r0 = 2131887714(0x7f120662, float:1.9410043E38)
            r1.LIZJ = r0
            r0 = 48
            r1.LJIILIIL = r0
            r1.LJII = r4
            r1.LJIIIZ = r2
            r1.LJIIJ = r3
            r0 = 0
            r1.LIZIZ = r0
            return r1
        L38:
            r0 = 1140129792(0x43f50000, float:490.0)
            float r0 = X.C497740JfY.LIZIZ(r0)
            int r2 = (int) r0
            goto L1d
        L40:
            r0 = 1
        L41:
            r4 = 80
            goto L18
        L44:
            X.07lC r0 = new X.07lC
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.giftlimitnotification.GiftLimitSettingAmountDialog.createParams():X.0Jkm");
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
                viewFindViewById2 = view4.findViewById(R.id.uuv);
            }
            this.LLILLJJLI = viewFindViewById2;
            view3 = viewFindViewById2;
        }
        C786410Ut5.I7(new ACListenerS147S0100000_12(this, 207), view3);
        C250000xu.LIZ.getClass();
        if (C250000xu.LJJII) {
            C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
            c19ehLJIIJ.LIZIZ(R.id.iyd, new LiveGiftReminderAmountKeyboardFragment());
            c19ehLJIIJ.LJIIIZ();
        } else {
            C19EH c19ehLJIIJ2 = getChildFragmentManager().LJIIJ();
            c19ehLJIIJ2.LIZIZ(R.id.iyd, new LiveGiftReminderAmountFragment());
            c19ehLJIIJ2.LJIIIZ();
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
