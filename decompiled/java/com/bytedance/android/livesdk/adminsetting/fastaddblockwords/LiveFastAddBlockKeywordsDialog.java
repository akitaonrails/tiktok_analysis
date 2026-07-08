package com.bytedance.android.livesdk.adminsetting.fastaddblockwords;

import X.C01GW;
import X.C0TY3;
import X.C1145100fu8;
import X.C19EH;
import X.C292401Bi;
import X.C500980Jkm;
import X.C786410Ut5;
import Y.ACListenerS147S0100000_12;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.common.keyboard.MeasureLinearLayout;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.dataChannel.BroadcastDialogPageChannel;
import com.bytedance.android.livesdk.dataChannel.DismissSettingDialogEvent;
import com.bytedance.android.livesdk.dataChannel.LiveEndDismissDialogEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveFastAddBlockKeywordsDialog extends LiveDialogFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KSEhICEgLTE4ICE0ZiMtOjHELIOSsyLCEuJSAwIzIjOysgZgklPyoVKTY4CCs3CikjKiQYLTw7Jj03OwElKCM8Lw==";
    public MeasureLinearLayout LL;
    public View LLILLJJLI;
    public final C01GW LLILLL = C292401Bi.LIZ(AFwS199S0000000_12.get$arr$(45));
    public final C01GW LLILZ = C292401Bi.LIZ(new AwS556S0100000_12(this, 149));
    public List<String> LLILZIL;

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.g83);
        c500980Jkm.LIZJ = R.style.ahx;
        c500980Jkm.LIZIZ = 0;
        c500980Jkm.LJIILIIL = 18;
        c500980Jkm.LJII = 80;
        c500980Jkm.LJIIIZ = -1;
        c500980Jkm.LJIIJ = -2;
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment
    public final void dismiss() {
        InputMethodManager inputMethodManager;
        Context context = getContext();
        Object objH2 = context != null ? C786410Ut5.H2(context, "input_method") : null;
        if ((objH2 instanceof InputMethodManager) && (inputMethodManager = (InputMethodManager) objH2) != null) {
            View view = getView();
            inputMethodManager.hideSoftInputFromWindow(view != null ? view.getWindowToken() : null, 0);
        }
        super.dismiss();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ArrayList<String> stringArrayList;
        Window window;
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null && (stringArrayList = arguments.getStringArrayList("key_block_keywords_list")) != null) {
            this.LLILZIL = stringArrayList;
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
                    viewFindViewById2 = view4.findViewById(R.id.view_outter);
                }
                this.LLILLJJLI = viewFindViewById2;
                view3 = viewFindViewById2;
            }
            C786410Ut5.I7(new ACListenerS147S0100000_12(this, 127), view3);
            C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
            c19ehLJIIJ.LIZIZ(R.id.eqx, (Fragment) this.LLILZ.getValue());
            c19ehLJIIJ.LJIIIZ();
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null) {
                dataChannel.BQ2(this, LiveEndDismissDialogEvent.class, new AwS591S0100000_12(this, 157));
            }
            DataChannel dataChannel2 = this.dataChannel;
            if (dataChannel2 != null) {
                dataChannel2.BQ2(this, BroadcastDialogPageChannel.class, new C0TY3(this));
                dataChannel2.BQ2(this, DismissSettingDialogEvent.class, new AwS591S0100000_12(this, 158));
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
}
