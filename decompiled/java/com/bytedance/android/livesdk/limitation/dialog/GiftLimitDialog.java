package com.bytedance.android.livesdk.limitation.dialog;

import X.C1130860fXA;
import X.C1131370fXz;
import X.C1132510fZp;
import X.C11NJ;
import X.C16F5;
import X.C2188811AlT;
import X.C500980Jkm;
import X.C784440Upu;
import X.C786410Ut5;
import X.EnumC1127360fRW;
import Y.ACListenerS152S0100000_17;
import Y.AfS186S0100000_17;
import android.app.Dialog;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes18.dex */
public final class GiftLimitDialog extends LiveDialogFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9JCHELIOSwhIDsyPCwjJ2E3ISQgJih9DywqPQM6JSw4DSYyJCor";
    public C16F5 LL;
    public C16F5 LLILLJJLI;
    public final C11NJ LLILLL = new C11NJ();
    public long LLILZ;
    public int LLILZIL;
    public long LLILZLL;

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return false;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.g77);
        c500980Jkm.LJIILIIL = 48;
        c500980Jkm.LJII = 17;
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        this.LLILLL.LJ();
        super.onDestroy();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment
    public final void dismissAllowingStateLoss() {
        super.dismissAllowingStateLoss();
        C1131370fXz.LJ = EnumC1127360fRW.ItemCountdown;
        C784440Upu.LIZ().LIZIZ(new C1130860fXA(C1131370fXz.LIZ, C1131370fXz.LIZIZ()));
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        View decorView;
        Window window2;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && (window2 = dialog.getWindow()) != null) {
            window2.setLayout(-1, -1);
        }
        Dialog dialog2 = getDialog();
        if (dialog2 == null || (window = dialog2.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        ViewTreeLifecycleOwner.set(decorView, this);
        ViewTreeViewModelStoreOwner.set(decorView, this);
        decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    public final void MR(long j) {
        String strLIZIZ;
        String strLIZIZ2;
        int i = (int) (j / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
        int i2 = i / 60;
        int i3 = i % 60;
        if (i2 >= 10) {
            strLIZIZ = String.valueOf(i2);
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('0');
            sbLIZ.append(i2);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        if (i3 >= 10) {
            strLIZIZ2 = String.valueOf(i3);
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append('0');
            sbLIZ2.append(i3);
            strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        }
        C16F5 c16f5 = this.LL;
        C16F5 c16f52 = null;
        if (c16f5 == null) {
            c16f5 = null;
        }
        c16f5.setText(strLIZIZ);
        C16F5 c16f53 = this.LLILLJJLI;
        if (c16f53 != null) {
            c16f52 = c16f53;
        }
        c16f52.setText(strLIZIZ2);
    }

    public final void NR(C1132510fZp c1132510fZp) {
        long j = c1132510fZp.LIZ;
        if (j > 0) {
            MR(j);
        } else {
            super.dismissAllowingStateLoss();
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.LL = (C16F5) view.findViewById(R.id.f0r);
        this.LLILLJJLI = (C16F5) view.findViewById(R.id.f0u);
        C786410Ut5.l8((C16F5) view.findViewById(R.id.mok), new ACListenerS152S0100000_17(this, 194));
        C786410Ut5.I7(new ACListenerS152S0100000_17(this, 195), view.findViewById(R.id.mog));
        TextView textView = (TextView) view.findViewById(R.id.moh);
        Resources resources = getResources();
        int i = (int) this.LLILZ;
        String quantityString = resources.getQuantityString(2131755588, i, Integer.valueOf(i));
        int i2 = this.LLILZIL;
        String quantityString2 = resources.getQuantityString(2131755589, i2, Integer.valueOf(i2));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(quantityString);
        sbLIZ.append(quantityString2);
        textView.setText(C2188811AlT.LIZIZ(sbLIZ));
        MR(this.LLILZLL * ((long) LSPassThroughRecordSizeConfig.DEFAULT));
        this.LLILLL.LIZ(C784440Upu.LIZ().LIZJ(this, C1132510fZp.class).LIZJ(new AfS186S0100000_17(this, 198)));
    }
}
