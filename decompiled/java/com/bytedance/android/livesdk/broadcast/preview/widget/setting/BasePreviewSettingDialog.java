package com.bytedance.android.livesdk.broadcast.preview.widget.setting;

import X.C01GW;
import X.C1145100fu8;
import X.C1161920gLG;
import X.C19EH;
import X.C292401Bi;
import X.C475510Ikn;
import X.C500980Jkm;
import X.C748590TYb;
import X.C748660TYi;
import X.C781270Ukn;
import X.C786410Ut5;
import X.EnumC748580TYa;
import Y.ACListenerS147S0100000_12;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.DismissPreviewSettingDialogEvent;
import com.bytedance.android.live.broadcast.api.BroadcastSettingResponseChannel;
import com.bytedance.android.live.common.keyboard.MeasureLinearLayout;
import com.bytedance.android.livesdk.broadcast.preview.base.BasePreviewDialogFragment;
import com.bytedance.android.livesdk.dataChannel.BroadcastDialogPageChannel;
import com.bytedance.android.livesdk.dataChannel.DismissSettingDialogEvent;
import com.bytedance.android.livesdk.rank.api.IRankService;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class BasePreviewSettingDialog extends BasePreviewDialogFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KjcjKCswKTY4Zz8hLTHELIOSMlLDh9PywoLionZjYpPTs6JiJiCy4gLRU+LDk6LTIfLDsnISsrDSYyJCor";
    public MeasureLinearLayout LL;
    public View LLILLJJLI;
    public final C01GW LLILLL = C292401Bi.LIZ(AFwS199S0000000_12.get$arr$(78));
    public final C01GW LLILZ = C292401Bi.LIZ(new AwS556S0100000_12(this, 191));
    public final C01GW LLILZIL = C292401Bi.LIZ(AFwS199S0000000_12.get$arr$(80));
    public final C01GW LLILZLL = C292401Bi.LIZ(AFwS199S0000000_12.get$arr$(76));
    public final C01GW LLIZ = C292401Bi.LIZ(AFwS199S0000000_12.get$arr$(79));
    public final C01GW LLIZLLLIL = C292401Bi.LIZ(new AwS556S0100000_12(this, 189));
    public final C01GW LLJ = C292401Bi.LIZ(AFwS199S0000000_12.get$arr$(77));
    public final C01GW LLJI = C292401Bi.LIZ(AFwS199S0000000_12.get$arr$(75));
    public final C01GW LLJIJIL = C292401Bi.LIZ(new AwS556S0100000_12(this, 190));
    public BaseFragment LLJILJIL;
    public String LLJILJILJ;

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.g4x);
        c500980Jkm.LIZJ = R.style.ahl;
        c500980Jkm.LJIIL = new ColorDrawable(0);
        c500980Jkm.LJII = 80;
        c500980Jkm.LJI = 0.0f;
        c500980Jkm.LJIILIIL = 19;
        c500980Jkm.LJIIJ = -1;
        return c500980Jkm;
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
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        ViewTreeLifecycleOwner.set(decorView, this);
        ViewTreeViewModelStoreOwner.set(decorView, this);
        decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    public final Fragment MR(EnumC748580TYa enumC748580TYa) {
        switch (C748590TYb.LIZ[enumC748580TYa.ordinal()]) {
            case 1:
                return (Fragment) this.LLILLL.getValue();
            case 2:
                return (Fragment) this.LLILZ.getValue();
            case 3:
                return (Fragment) this.LLILZIL.getValue();
            case 4:
                return (Fragment) this.LLILZLL.getValue();
            case 5:
                return C781270Ukn.LJIIZILJ().wN1(this.LLJILJILJ);
            case 6:
                return (Fragment) this.LLIZLLLIL.getValue();
            case 7:
                return C781270Ukn.LIZIZ().Ot2();
            case 8:
                return (Fragment) this.LLJ.getValue();
            case BdTuring.TYPE_ECAF /* 9 */:
                return (Fragment) this.LLJI.getValue();
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return (Fragment) this.LLJIJIL.getValue();
            case BdTuring.TYPE_EMAIL /* 11 */:
                return C781270Ukn.LJIIZILJ().kk2();
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return (Fragment) this.LLIZ.getValue();
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                BaseFragment baseFragment = this.LLJILJIL;
                if (baseFragment != null) {
                    return baseFragment;
                }
                DataChannel dataChannelLJ = C475510Ikn.LJ(this);
                if (dataChannelLJ != null && dataChannelLJ.gg0(BroadcastSettingResponseChannel.class) != null) {
                    this.LLJILJIL = ((IRankService) C1161920gLG.LIZJ(IRankService.class)).Wq0(0);
                }
                return this.LLJILJIL;
            default:
                return null;
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        EnumC748580TYa enumC748580TYa;
        Window window;
        super.onViewCreated(view, bundle);
        View viewFindViewById = this.LL;
        Object obj = null;
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
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            C1145100fu8.LIZ(window);
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(0);
            window.setNavigationBarColor(-1);
        }
        View viewFindViewById2 = this.LLILLJJLI;
        if (viewFindViewById2 == null) {
            View view3 = getView();
            if (view3 != null) {
                viewFindViewById2 = view3.findViewById(R.id.pw6);
            } else {
                viewFindViewById2 = null;
            }
            this.LLILLJJLI = viewFindViewById2;
        }
        C786410Ut5.I7(new ACListenerS147S0100000_12(this, 159), viewFindViewById2);
        Bundle arguments = getArguments();
        if (arguments != null) {
            string = arguments.getString("argument_entrance");
        } else {
            string = null;
        }
        this.LLJILJILJ = string;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            try {
                obj = arguments2.get("argument_initial_page");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            } catch (OutOfMemoryError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        if (!(obj instanceof EnumC748580TYa) || (enumC748580TYa = (EnumC748580TYa) obj) == null) {
            enumC748580TYa = EnumC748580TYa.GUIDE;
        }
        C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
        Fragment fragmentMR = MR(enumC748580TYa);
        if (fragmentMR == null) {
            return;
        }
        c19ehLJIIJ.LIZIZ(R.id.iiv, fragmentMR);
        c19ehLJIIJ.LJIIIZ();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.BQ2(this, BroadcastDialogPageChannel.class, new C748660TYi(this));
            dataChannel.BQ2(this, DismissPreviewSettingDialogEvent.class, new AwS591S0100000_12(this, 397));
            dataChannel.BQ2(this, DismissSettingDialogEvent.class, new AwS591S0100000_12(this, 398));
        }
    }
}
