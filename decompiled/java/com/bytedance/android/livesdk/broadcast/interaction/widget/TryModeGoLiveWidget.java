package com.bytedance.android.livesdk.broadcast.interaction.widget;

import X.C01GW;
import X.C0IJT;
import X.C1148240fzC;
import X.C168U;
import X.C292401Bi;
import X.C473410IhP;
import X.C474500IjA;
import X.C497740JfY;
import X.C500260Jjc;
import X.C772260URc;
import X.C782110Um9;
import X.C785410UrT;
import X.C786410Ut5;
import X.InterfaceC743640TFa;
import Y.ACListenerS167S0100000_33;
import Y.ARunnableS133S0100000_33;
import Y.AcS499S0100000_33;
import android.os.CountDownTimer;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.broadcast.TryModeCloseDialogShowing;
import com.bytedance.android.livesdk.dataChannel.DialogMotionEvent;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownDurationSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.TryModeDialogOptSetting;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.AwS612S0100000_33;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class TryModeGoLiveWidget extends LiveWidget {
    public final C772260URc LL;
    public LiveDialog LLILLJJLI;
    public long LLILZ;
    public boolean LLILZIL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public String LLILLL = "";
    public long LLILZLL = System.currentTimeMillis();
    public final C01GW LLJI = C292401Bi.LIZ(new AwS577S0100000_33(this, 51));
    public final ARunnableS133S0100000_33 LLJIJIL = new ARunnableS133S0100000_33(this, 20);
    public final ARunnableS133S0100000_33 LLJILJIL = new ARunnableS133S0100000_33(this, 18);
    public final ARunnableS133S0100000_33 LLJILJILJ = new ARunnableS133S0100000_33(this, 19);

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.hqr;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void A1() {
        if (this.LLIZ) {
            C772260URc c772260URc = this.LL;
            if (c772260URc != null) {
                c772260URc.LIZIZ(this.LLILLL, "countdown_end");
            }
            LiveDialog liveDialog = this.LLILLJJLI;
            if (liveDialog != null) {
                liveDialog.dismiss();
                C785410UrT.LIZ(liveDialog);
            }
            this.LLJ = false;
        }
    }

    public final void y1() {
        TryModeDialogOptSetting tryModeDialogOptSetting = TryModeDialogOptSetting.INSTANCE;
        if (tryModeDialogOptSetting.enable()) {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.LLILZ;
            if (jCurrentTimeMillis >= tryModeDialogOptSetting.motionCheckStartDuration()) {
                if (jCurrentTimeMillis < tryModeDialogOptSetting.shortestCheckDuration()) {
                    C473410IhP.LIZ().removeCallbacks(this.LLJIJIL);
                }
                C473410IhP.LIZ().removeCallbacks(this.LLJILJILJ);
                if (this.LLILZIL) {
                    return;
                }
                C473410IhP.LIZJ(this.LLJILJILJ, tryModeDialogOptSetting.motionCheckDuration());
            }
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        DataChannelGlobal.LLILZ.IQ2(C168U.class);
        View view = getView();
        if (view != null) {
            C786410Ut5.I7(new ACListenerS167S0100000_33(this, 3), view);
        }
        this.LLILZ = System.currentTimeMillis();
        ARunnableS133S0100000_33 aRunnableS133S0100000_33 = this.LLJILJIL;
        TryModeDialogOptSetting tryModeDialogOptSetting = TryModeDialogOptSetting.INSTANCE;
        C473410IhP.LIZJ(aRunnableS133S0100000_33, tryModeDialogOptSetting.longestCheckDuration());
        if (tryModeDialogOptSetting.enable()) {
            C473410IhP.LIZJ(this.LLJIJIL, tryModeDialogOptSetting.shortestCheckDuration());
        }
        this.dataChannel.BQ2(this, DialogMotionEvent.class, new AwS612S0100000_33(this, 8));
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        C473410IhP.LIZ().removeCallbacks(this.LLJIJIL);
        C473410IhP.LIZ().removeCallbacks(this.LLJILJIL);
        C473410IhP.LIZ().removeCallbacks(this.LLJILJILJ);
        ((CountDownTimer) this.LLJI.getValue()).cancel();
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onPause() {
        super.onPause();
        this.LLIZ = false;
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onResume() {
        super.onResume();
        this.LLIZ = true;
        if (this.LLIZLLLIL) {
            z1(false);
        }
        if (this.LLJ) {
            A1();
        }
    }

    public TryModeGoLiveWidget(C772260URc c772260URc) {
        this.LL = c772260URc;
    }

    public final void x1(String str) {
        String str2;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_trymode_practice_end_popup");
        c474500IjALIZ.LJIJJLI(this.dataChannel);
        c474500IjALIZ.LJJII(this.LLILLL, "show_type");
        c474500IjALIZ.LJJII(str, "action_type");
        if (Intrinsics.LJFF(this.LLILLL, "countdown_end")) {
            C772260URc c772260URc = this.LL;
            Integer numValueOf = null;
            if (c772260URc != null) {
                str2 = c772260URc.LLJI;
            } else {
                str2 = null;
            }
            c474500IjALIZ.LJJII(str2, "countdown_type");
            C772260URc c772260URc2 = this.LL;
            if (c772260URc2 != null) {
                numValueOf = Integer.valueOf(c772260URc2.LLJIJIL);
            }
            c474500IjALIZ.LJJII(numValueOf, "countdown_window");
        }
        c474500IjALIZ.LIZ();
    }

    public final void z1(final boolean z) {
        Boolean boolValueOf;
        int i;
        String strLJIJI;
        Object objGg0 = this.dataChannel.gg0(TryModeCloseDialogShowing.class);
        Boolean bool = Boolean.TRUE;
        if (!Intrinsics.LJFF(objGg0, bool) && !Intrinsics.LJFF(DataChannelGlobal.LLILZ.gg0(C1148240fzC.class), bool)) {
            this.LLIZLLLIL = true;
            if (this.context != null) {
                if (z) {
                    i = 2131855362;
                    strLJIJI = C497740JfY.LJIJJ(2131855361, Integer.valueOf(LiveTryModeCountDownDurationSetting.INSTANCE.duration()));
                } else {
                    i = 2131855365;
                    strLJIJI = C497740JfY.LJIJI(2131855363);
                }
                C782110Um9 c782110Um9 = new C782110Um9(this.context);
                c782110Um9.LJIILLIIL = false;
                c782110Um9.LJIILL = false;
                c782110Um9.LJIIZILJ(i);
                c782110Um9.LJIIIZ(strLJIJI);
                c782110Um9.LJIIJ(2131855366, new InterfaceC743640TFa() { // from class: X.1AJy
                    @Override // X.InterfaceC743640TFa
                    public final void LIZ(LiveDialog liveDialog) {
                        this.LIZ.x1("back");
                        liveDialog.dismiss();
                        if (z) {
                            ((CountDownTimer) this.LIZ.LLJI.getValue()).cancel();
                        }
                    }
                });
                if (!z) {
                    c782110Um9.LJIILIIL(2131855364, new AcS499S0100000_33(this, 0));
                }
                this.LLILLJJLI = c782110Um9.LIZ();
            }
            if (TryModeDialogOptSetting.INSTANCE.enable()) {
                C473410IhP.LIZ().removeCallbacks(this.LLJIJIL);
                C473410IhP.LIZ().removeCallbacks(this.LLJILJIL);
                C473410IhP.LIZ().removeCallbacks(this.LLJILJILJ);
            }
            LiveDialog liveDialog = this.LLILLJJLI;
            if (liveDialog != null) {
                boolValueOf = Boolean.valueOf(liveDialog.isShowing());
            } else {
                boolValueOf = null;
            }
            if (C500260Jjc.LJJIFFI(boolValueOf) && this.LLIZ) {
                this.LLILZIL = true;
                this.LLIZLLLIL = false;
                x1("show");
                LiveDialog liveDialog2 = this.LLILLJJLI;
                if (liveDialog2 != null) {
                    C786410Ut5.E4(liveDialog2);
                }
                if (z) {
                    ((CountDownTimer) this.LLJI.getValue()).start();
                }
            }
        }
    }
}
