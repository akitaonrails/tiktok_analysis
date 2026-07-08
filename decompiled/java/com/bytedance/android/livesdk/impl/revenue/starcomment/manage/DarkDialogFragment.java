package com.bytedance.android.livesdk.impl.revenue.starcomment.manage;

import X.C0TZM;
import X.C465640INu;
import X.C497740JfY;
import X.C500260Jjc;
import X.C500980Jkm;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes8.dex */
public abstract class DarkDialogFragment extends LiveDialogFragment {
    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public boolean isSheet() {
        return true;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        DataChannel dataChannel = this.dataChannel;
        boolean zLJJIJIL = C500260Jjc.LJJIJIL(dataChannel != null ? (Boolean) dataChannel.gg0(C0TZM.class) : null);
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.gat);
        c500980Jkm.LIZJ = zLJJIJIL ? R.style.ahb : C497740JfY.LJJ() ? R.style.ahf : R.style.ahg;
        c500980Jkm.LJII = zLJJIJIL ? 80 : C497740JfY.LJJ() ? 3 : 5;
        c500980Jkm.LJI = 0.0f;
        c500980Jkm.LJIIIZ = zLJJIJIL ? -1 : C497740JfY.LJIIIZ(R.dimen.arw);
        int iLIZIZ = zLJJIJIL ? (C465640INu.LIZIZ(getContext()) * 550) / 375 : -1;
        int iLIZ = (int) (C465640INu.LIZ(getContext()) * 0.8f);
        if (iLIZIZ > iLIZ) {
            iLIZIZ = iLIZ;
        }
        c500980Jkm.LJIIJ = iLIZIZ;
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return super.onGetLayoutInflater(bundle).cloneInContext(new ContextThemeWrapper(getActivity(), R.style.z4));
    }
}
