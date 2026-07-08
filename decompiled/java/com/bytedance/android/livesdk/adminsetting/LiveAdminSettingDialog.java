package com.bytedance.android.livesdk.adminsetting;

import X.C01C5;
import X.C01GW;
import X.C0IJT;
import X.C0IP3;
import X.C0KYR;
import X.C0TYU;
import X.C0TYV;
import X.C0TYX;
import X.C0TZ7;
import X.C0TZA;
import X.C1145100fu8;
import X.C162100jj;
import X.C1954807lC;
import X.C19EH;
import X.C292401Bi;
import X.C418440Gaw;
import X.C474500IjA;
import X.C475510Ikn;
import X.C500260Jjc;
import X.C500980Jkm;
import X.C786410Ut5;
import X.C814420VxA;
import X.C931020aKq;
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
import com.bytedance.android.live.broadcast.api.BroadcastEndShowEvent;
import com.bytedance.android.live.common.keyboard.MeasureLinearLayout;
import com.bytedance.android.live.room.LiveEndEvent;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.dataChannel.BroadcastDialogPageChannel;
import com.bytedance.android.livesdk.dataChannel.BroadcastDialogPageCloseInternal;
import com.bytedance.android.livesdk.dataChannel.RefreshMoreRedDotEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveAdminSettingDialog extends LiveDialogFragment implements C0IP3 {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KSEhHELIOSICEgLTE4ICE0ZgklPyoSLCglJxw2PDElJygXISQgJig=";
    public MeasureLinearLayout LL;
    public View LLILLJJLI;
    public String LLILLL;
    public C0TYU LLILZ;
    public final C01GW LLILZIL = C292401Bi.LIZ(new AwS551S0100000_7(this, 12));

    static {
        new C0TYV();
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    public final boolean fu() {
        return ((Boolean) this.LLILZIL.getValue()).booleanValue();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        Object obj;
        int i;
        int iLIZIZ;
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
        int i2 = fu() ? ((Boolean) obj).booleanValue() ? R.style.ahy : R.style.ahx : R.style.ahz;
        boolean zFu = fu();
        if (zFu) {
            i = 80;
        } else {
            if (zFu) {
                throw new C1954807lC();
            }
            i = 5;
        }
        boolean zFu2 = fu();
        int i3 = -1;
        if (zFu2) {
            iLIZIZ = -1;
        } else {
            if (zFu2) {
                throw new C1954807lC();
            }
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(490.0f)));
        }
        boolean zFu3 = fu();
        if (zFu3) {
            i3 = -2;
        } else if (zFu3) {
            throw new C1954807lC();
        }
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.g88);
        c500980Jkm.LIZIZ = 0;
        c500980Jkm.LIZJ = i2;
        c500980Jkm.LJIILIIL = 18;
        c500980Jkm.LJII = i;
        c500980Jkm.LJIIIZ = iLIZIZ;
        c500980Jkm.LJIIJ = i3;
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment
    public final void dismiss() {
        InputMethodManager inputMethodManager;
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        if (dataChannelLJ != null) {
            dataChannelLJ.FQ2(RefreshMoreRedDotEvent.class);
        }
        Context context = getContext();
        Object objH2 = context != null ? C786410Ut5.H2(context, "input_method") : null;
        if ((objH2 instanceof InputMethodManager) && (inputMethodManager = (InputMethodManager) objH2) != null) {
            View view = getView();
            inputMethodManager.hideSoftInputFromWindow(view != null ? view.getWindowToken() : null, 0);
        }
        C0TZ7 c0tz7 = C0TZ7.LIZ;
        DataChannel dataChannelLJ2 = C475510Ikn.LJ(this);
        c0tz7.getClass();
        if (C0TZ7.LIZIZ(dataChannelLJ2) && dataChannelLJ2 != null) {
            dataChannelLJ2.SX0(C0TZA.class, null);
        }
        super.dismiss();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        View decorView;
        super.onStart();
        C0TZ7 c0tz7 = C0TZ7.LIZ;
        Context context = getContext();
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        AwS556S0100000_12 awS556S0100000_12 = new AwS556S0100000_12(this, 2);
        c0tz7.getClass();
        C0TZ7.LJFF(context, dataChannelLJ, awS556S0100000_12);
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

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        this.dataChannel = (DataChannel) DataChannelGlobal.LLILZ.gg0(C931020aKq.class);
        super.onCreate(bundle);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.BQ2(this, BroadcastEndShowEvent.class, new AwS591S0100000_12(this, 139));
            dataChannel.BQ2(this, LiveEndEvent.class, new AwS591S0100000_12(this, 140));
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
        Fragment fragmentLIZ;
        String str;
        Window window;
        DataChannel dataChannel;
        DataChannel dataChannel2;
        super.onViewCreated(view, bundle);
        View viewFindViewById = this.LL;
        String string = null;
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
        C786410Ut5.I7(new ACListenerS147S0100000_12(this, 72), viewFindViewById2);
        Bundle arguments = getArguments();
        if (arguments != null) {
            string = arguments.getString("argument_entrance");
        }
        this.LLILLL = string;
        this.LLILZ = new C0TYU(this.dataChannel, string, new AwS556S0100000_12(this, 88));
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            try {
                obj = arguments2.get("argument_initial_page");
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
            C0TYU c0tyu = this.LLILZ;
            if (c0tyu != null && (fragmentLIZ = c0tyu.LIZ(enumC748580TYa)) != null) {
                c19ehLJIIJ.LIZIZ(R.id.aic, fragmentLIZ);
                c19ehLJIIJ.LJIIIZ();
                if (isAdded() && (dataChannel2 = this.dataChannel) != null) {
                    dataChannel2.BQ2(this, BroadcastDialogPageChannel.class, new C0TYX(this));
                }
                if (Intrinsics.LJFF(this.LLILLL, "from_tns_onboarding_capsule") && (dataChannel = this.dataChannel) != null) {
                    dataChannel.BQ2(this, BroadcastDialogPageCloseInternal.class, new AwS591S0100000_12(this, 141));
                }
                Dialog dialog = getDialog();
                if (dialog != null && (window = dialog.getWindow()) != null) {
                    C1145100fu8.LIZ(window);
                    window.addFlags(Integer.MIN_VALUE);
                    window.setStatusBarColor(0);
                    window.setNavigationBarColor(-1);
                }
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_moderator_icon");
                c474500IjALIZ.LJIJJLI(C475510Ikn.LJ(this));
                c474500IjALIZ.LJIILJJIL("live_take_detail");
                c474500IjALIZ.LJJII("show", "action_type");
                c474500IjALIZ.LIZ();
                C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_live_rankings_settings_show");
                c474500IjALIZ2.LJIJJLI(C475510Ikn.LJ(this));
                c474500IjALIZ2.LJIILJJIL("live_take_detail");
                c474500IjALIZ2.LIZ();
                C474500IjA c474500IjALIZ3 = C0IJT.LIZ("livesdk_anchor_comment_settings_show");
                c474500IjALIZ3.LJIJJLI(C475510Ikn.LJ(this));
                c474500IjALIZ3.LJIILJJIL("live_take_detail");
                if (C500260Jjc.LJJJI(Boolean.valueOf(C01C5.LIZ(C475510Ikn.LJ(this))))) {
                    str = "moderator";
                } else {
                    str = "anchor";
                }
                c474500IjALIZ3.LJJII(str, "user_type");
                c474500IjALIZ3.LJJII(C0KYR.LIZIZ(C162100jj.LIZ(this.dataChannel), this.dataChannel), "admin_type");
                c474500IjALIZ3.LJJII("more_panel", "panel_type");
                c474500IjALIZ3.LJJII(C0KYR.LIZJ(this.dataChannel), "admin_type");
                c474500IjALIZ3.LIZ();
            }
        }
    }
}
