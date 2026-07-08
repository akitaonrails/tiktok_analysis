package com.bytedance.android.livesdk.utils.crop;

import X.C1336570ksx;
import X.C16F5;
import X.C16HB;
import X.C1766560w4U;
import X.C19EG;
import X.C1CC2;
import X.C20689515xd;
import X.C475510Ikn;
import X.C497740JfY;
import X.C500260Jjc;
import X.C500980Jkm;
import X.C786410Ut5;
import Y.ACListenerS165S0100000_31;
import Y.ARunnableS131S0100000_31;
import android.app.Dialog;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.chatroom.event.SwitchCameraChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverCameraSetting;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes32.dex */
public final class CropFragment extends LiveDialogFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/HELIOSLSR9PTElJTx9KzcjOWEQOio8Dz0yLygpJzs=";
    public Uri LL;
    public String LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public float LLILZIL = 1.0f;
    public long LLILZLL = Long.MIN_VALUE;
    public Function1<? super String, Unit> LLIZ;
    public Function0<Unit> LLIZLLLIL;
    public C20689515xd LLJ;
    public LiveIconView LLJI;
    public C16F5 LLJIJIL;
    public LiveIconView LLJILJIL;
    public C16F5 LLJILJILJ;
    public C16F5 LLJILLL;

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.gh_);
        c500980Jkm.LIZJ = R.style.ajk;
        c500980Jkm.LJII = 80;
        c500980Jkm.LJIIJ = -1;
        c500980Jkm.LJIILIIL = 3;
        c500980Jkm.LJI = 0.0f;
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final boolean onBackPressed() {
        C19EG activity;
        if ((this.LLILLL || this.LLILZ) && (activity = getActivity()) != null) {
            activity.finish();
        }
        return super.onBackPressed();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.LLILZLL == Long.MIN_VALUE) {
            return;
        }
        C1CC2.LJIIIZ(0, SystemClock.elapsedRealtime() - this.LLILZLL, "ttlive_crop_fragment_all");
        this.LLILZLL = Long.MIN_VALUE;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        View decorView;
        super.onStart();
        if (LiveCoverCameraSetting.INSTANCE.enable() && C500260Jjc.LJ(getContext()) != null) {
            TuxImmersionBar tuxImmersionBarLIZJ = C1766560w4U.LIZJ(this, false);
            tuxImmersionBarLIZJ.LIZJ(false, false);
            tuxImmersionBarLIZJ.LIZIZ.LJIIL();
            tuxImmersionBarLIZJ.LJFF(-16777216);
            tuxImmersionBarLIZJ.LIZIZ.LJII(false);
            tuxImmersionBarLIZJ.LIZLLL();
        }
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        ViewTreeLifecycleOwner.set(decorView, this);
        ViewTreeViewModelStoreOwner.set(decorView, this);
        decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        if (dataChannelLJ != null) {
            dataChannelLJ.zW(SwitchCameraChannel.class, Boolean.FALSE);
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.LL = (Uri) arguments.getParcelable("arg_origin_uri");
            this.LLILLJJLI = arguments.getString("arg_origin_path");
            float f = arguments.getFloat("arg_width_to_height_ratio", this.LLILZIL);
            this.LLILZIL = f;
            if (f <= 0.0f) {
                this.LLILZIL = 1.0f;
            }
            this.LLILLL = arguments.getBoolean("arg_is_for_live_cover");
            this.LLILZ = arguments.getBoolean("arg_is_for_multi_guest");
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        if (dataChannelLJ != null) {
            dataChannelLJ.zW(SwitchCameraChannel.class, Boolean.TRUE);
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) throws Throwable {
        super.onViewCreated(view, bundle);
        boolean z = true;
        view.setFitsSystemWindows(true);
        this.LLJ = (C20689515xd) view.findViewById(R.id.f_e);
        this.LLJI = (LiveIconView) view.findViewById(R.id.zbp);
        this.LLJIJIL = (C16F5) view.findViewById(R.id.zbt);
        this.LLJILJIL = (LiveIconView) view.findViewById(R.id.zex);
        this.LLJILJILJ = (C16F5) view.findViewById(R.id.zgl);
        this.LLJILLL = (C16F5) view.findViewById(R.id.tv_save);
        C20689515xd c20689515xd = this.LLJ;
        if (c20689515xd != null) {
            float f = this.LLILZIL;
            C1336570ksx c1336570ksx = c20689515xd.LLILLL;
            if (c1336570ksx == null) {
                c1336570ksx = null;
            }
            c1336570ksx.LLILZIL = 0;
            if (f != 0.0f) {
                z = false;
            }
            float f2 = 1.0f;
            if (!z) {
                f2 = 1.0f / f;
            }
            c1336570ksx.LLILZLL = f2;
            c1336570ksx.LLILZ = (int) C497740JfY.LIZIZ(C20689515xd.LLILZLL);
            c1336570ksx.addOnLayoutChangeListener(new C16HB(c20689515xd, 9));
            HandlerHook.viewPostDelay(c1336570ksx, new ARunnableS131S0100000_31(c20689515xd, 181), 1000L);
            String str = this.LLILLJJLI;
            if (str != null) {
                c20689515xd.setOriginPath(str);
            } else {
                c20689515xd.setOriginUri(this.LL);
            }
        }
        if (LiveCoverCameraSetting.INSTANCE.enable()) {
            C500260Jjc.LLFFF(this.LLJILJILJ);
            C500260Jjc.LLFFF(this.LLJIJIL);
            C500260Jjc.LLFFF(this.LLJILLL);
            C500260Jjc.LJIILIIL(this.LLJI);
            C500260Jjc.LJIILIIL(this.LLJILJIL);
            if (!this.LLILLL && !this.LLILZ) {
                C16F5 c16f5 = this.LLJIJIL;
                if (c16f5 != null) {
                    c16f5.setText(getString(2131841080));
                }
                C16F5 c16f52 = this.LLJIJIL;
                if (c16f52 != null) {
                    C786410Ut5.l8(c16f52, new ACListenerS165S0100000_31(this, 56));
                }
                C16F5 c16f53 = this.LLJILLL;
                if (c16f53 != null) {
                    C786410Ut5.l8(c16f53, new ACListenerS165S0100000_31(this, 57));
                    return;
                }
                return;
            }
            C16F5 c16f54 = this.LLJIJIL;
            if (c16f54 != null) {
                c16f54.setText(getString(2131841084));
            }
            C16F5 c16f55 = this.LLJIJIL;
            if (c16f55 != null) {
                C786410Ut5.l8(c16f55, new ACListenerS165S0100000_31(this, 54));
            }
            C16F5 c16f56 = this.LLJILLL;
            if (c16f56 == null) {
                return;
            }
            C786410Ut5.l8(c16f56, new ACListenerS165S0100000_31(this, 55));
            return;
        }
        C500260Jjc.LJIILIIL(this.LLJILJILJ);
        C500260Jjc.LJIILIIL(this.LLJIJIL);
        C500260Jjc.LJIILIIL(this.LLJILLL);
        C500260Jjc.LLFFF(this.LLJI);
        C500260Jjc.LLFFF(this.LLJILJIL);
        LiveIconView liveIconView = this.LLJI;
        if (liveIconView != null) {
            C786410Ut5.g8(liveIconView, new ACListenerS165S0100000_31(this, 58));
        }
        LiveIconView liveIconView2 = this.LLJILJIL;
        if (liveIconView2 == null) {
            return;
        }
        C786410Ut5.g8(liveIconView2, new ACListenerS165S0100000_31(this, 59));
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.ss.android.ugc.aweme.tux.business.base.GlobalHookDialogFragment, androidx.fragment.app.DialogFragment
    public final void show(FragmentManager fragmentManager, String str) {
        this.LLILZLL = SystemClock.elapsedRealtime();
        super.show(fragmentManager, str);
        PopupMonitorServiceImpl.LIZ.getClass();
        PopupMonitorServiceImpl.LJJIZ(this);
    }
}
