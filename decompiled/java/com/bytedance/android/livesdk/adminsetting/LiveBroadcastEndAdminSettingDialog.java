package com.bytedance.android.livesdk.adminsetting;

import X.C01GW;
import X.C0IP3;
import X.C0TYP;
import X.C0TZ7;
import X.C0TZA;
import X.C1145100fu8;
import X.C1161920gLG;
import X.C19EH;
import X.C292401Bi;
import X.C389001fE;
import X.C475510Ikn;
import X.C500980Jkm;
import X.C748520TXu;
import X.C786410Ut5;
import X.EnumC748580TYa;
import Y.ACListenerS147S0100000_12;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.adminsetting.IAdminSettingService;
import com.bytedance.android.live.common.keyboard.MeasureLinearLayout;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.dataChannel.BroadcastDialogPageChannel;
import com.bytedance.android.livesdk.dataChannel.BroadcastDialogPageCloseInternal;
import com.bytedance.android.livesdk.moderator.ModeratorPermissionEditFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS591S0100000_12;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveBroadcastEndAdminSettingDialog extends LiveDialogFragment implements C0IP3 {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KSEhICEgLTE4HELIOSICE0ZgklPyoROiotLSwyOzEJJysSLCglJxw2PDElJygXISQgJig=";
    public MeasureLinearLayout LL;
    public View LLILLJJLI;
    public final String LLILLL = "from_broadcast_end";
    public final C01GW LLILZ = C292401Bi.LIZ(AFwS199S0000000_12.get$arr$(42));
    public final C01GW LLILZIL = C292401Bi.LIZ(new AwS556S0100000_12(this, 94));

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        Object obj;
        Bundle arguments = getArguments();
        if (arguments != null) {
            try {
                obj = arguments.get("argument_dim");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            } catch (OutOfMemoryError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            if (obj == null) {
                obj = Boolean.FALSE;
            }
        } else {
            obj = Boolean.FALSE;
        }
        int i = ((Boolean) obj).booleanValue() ? R.style.ahy : R.style.ahx;
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.g88);
        c500980Jkm.LIZIZ = 0;
        c500980Jkm.LIZJ = i;
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
        C0TZ7 c0tz7 = C0TZ7.LIZ;
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        c0tz7.getClass();
        if (C0TZ7.LIZIZ(dataChannelLJ) && dataChannelLJ != null) {
            dataChannelLJ.SX0(C0TZA.class, null);
        }
        super.dismiss();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
        C389001fE.LIZ("broadcast_end_update_tns_onboarding_sheet_info", new JSONObject(), System.currentTimeMillis(), false);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        View decorView;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        ViewTreeLifecycleOwner.set(decorView, this);
        ViewTreeViewModelStoreOwner.set(decorView, this);
        decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // X.C0IP3
    public final DataChannel provideDataChannel() {
        return this.dataChannel;
    }

    public final Fragment MR(EnumC748580TYa enumC748580TYa) {
        switch (C0TYP.LIZ[enumC748580TYa.ordinal()]) {
            case 1:
                return (Fragment) this.LLILZ.getValue();
            case 2:
                return ((IAdminSettingService) C1161920gLG.LIZJ(IAdminSettingService.class)).eu2();
            case 3:
                return new LiveCommentAddBlockKeywordsOptFragment(this.LLILLL);
            case 4:
                return new LiveCommentBlockKeywordsOptFragment(this.LLILLL);
            case 5:
                return (Fragment) this.LLILZIL.getValue();
            case 6:
                return new ModeratorPermissionEditFragment();
            case 7:
                dismiss();
                return null;
            default:
                return null;
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        if (dataChannelLJ != null) {
            dataChannelLJ.BQ2(this, BroadcastDialogPageCloseInternal.class, new AwS591S0100000_12(this, 148));
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        getActivity();
        return layoutInflaterOnGetLayoutInflater;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Object obj;
        EnumC748580TYa enumC748580TYa;
        Window window;
        DataChannel dataChannel;
        super.onViewCreated(view, bundle);
        View viewFindViewById = this.LL;
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
        View viewFindViewById2 = this.LLILLJJLI;
        if (viewFindViewById2 == null) {
            View view3 = getView();
            if (view3 != null) {
                viewFindViewById2 = view3.findViewById(R.id.uvy);
            } else {
                viewFindViewById2 = null;
            }
            this.LLILLJJLI = viewFindViewById2;
        }
        C786410Ut5.I7(new ACListenerS147S0100000_12(this, 83), viewFindViewById2);
        Bundle arguments = getArguments();
        if (arguments != null) {
            try {
                obj = arguments.get("argument_initial_page");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            } catch (OutOfMemoryError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            if (obj == null) {
                obj = EnumC748580TYa.GUIDE;
            }
        } else {
            obj = EnumC748580TYa.GUIDE;
        }
        if ((obj instanceof EnumC748580TYa) && (enumC748580TYa = (EnumC748580TYa) obj) != null) {
            C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
            Fragment fragmentMR = MR(enumC748580TYa);
            if (fragmentMR == null) {
                return;
            }
            c19ehLJIIJ.LIZIZ(R.id.aic, fragmentMR);
            c19ehLJIIJ.LJIIIZ();
            if (isAdded() && (dataChannel = this.dataChannel) != null) {
                dataChannel.BQ2(this, BroadcastDialogPageChannel.class, new C748520TXu(this));
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
