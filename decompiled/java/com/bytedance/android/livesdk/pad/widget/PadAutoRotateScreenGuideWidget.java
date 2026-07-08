package com.bytedance.android.livesdk.pad.widget;

import X.AnonymousClass0956;
import X.C0PEM;
import X.C1143680frq;
import X.C1161920gLG;
import X.C1295960jpS;
import X.C16F5;
import X.C20441214yg;
import X.C21382118m3;
import X.C2188811AlT;
import X.C2226308nt;
import X.C23250099c;
import X.C439101nJ;
import X.C468540IYy;
import X.C497740JfY;
import X.C786410Ut5;
import Y.ALAdapterS3S0100000_6;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.feed.api.TopLiveSkylightVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.FullScreenSurveyShowing;
import com.bytedance.android.livesdk.pad.IPadAutoRotateScreenService;
import com.bytedance.android.livesdk.setting.PadAutoRotateScreenGuideSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class PadAutoRotateScreenGuideWidget extends LiveRecyclableWidget implements View.OnTouchListener {
    public static final /* synthetic */ int LLILZLL = 0;
    public C1295960jpS LL;
    public C16F5 LLILLJJLI;
    public Animator LLILLL;
    public long LLILZ;
    public AnonymousClass0956 LLILZIL;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.i0q;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        y1(true);
        Animator animator = this.LLILLL;
        if (animator == null || !animator.isRunning()) {
            return;
        }
        Animator animator2 = this.LLILLL;
        if (animator2 != null) {
            animator2.removeAllListeners();
        }
        Animator animator3 = this.LLILLL;
        if (animator3 != null) {
            animator3.cancel();
        }
    }

    public final void A1() {
        long jCurrentTimeMillis = this.LLILZ - System.currentTimeMillis();
        if (jCurrentTimeMillis < 0) {
            jCurrentTimeMillis = 0;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("showGuideDelay delay:");
        sbLIZ.append(jCurrentTimeMillis);
        C20441214yg.LJIIIZ("PadAutoRotateScreenGuideWidget", C2188811AlT.LIZIZ(sbLIZ));
        if (x1()) {
            AnonymousClass0956 anonymousClass0956 = this.LLILZIL;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            this.LLILZIL = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZJ, null, new C2226308nt(jCurrentTimeMillis, this, null), 2);
        }
    }

    public final boolean x1() {
        boolean zOD = ((IPadAutoRotateScreenService) C1161920gLG.LIZJ(IPadAutoRotateScreenService.class)).oD();
        Object objGg0 = DataChannelGlobal.LLILZ.gg0(TopLiveSkylightVisibilityChannel.class);
        DataChannel dataChannel = this.dataChannel;
        Object objGg02 = dataChannel != null ? dataChannel.gg0(FullScreenSurveyShowing.class) : null;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("canShowGuide can show pad auto rotate screen guide:");
        sbLIZ.append(zOD);
        sbLIZ.append(" top live sky light visibility:");
        sbLIZ.append(objGg0);
        sbLIZ.append(" full screen survey showing:");
        sbLIZ.append(objGg02);
        C20441214yg.LJIIIZ("PadAutoRotateScreenGuideWidget", C2188811AlT.LIZIZ(sbLIZ));
        if (!zOD) {
            return false;
        }
        Boolean bool = Boolean.TRUE;
        return (Intrinsics.LJFF(objGg02, bool) || Intrinsics.LJFF(objGg0, bool)) ? false : true;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        this.LL = (C1295960jpS) findViewById(R.id.pxz);
        this.LLILLJJLI = (C16F5) findViewById(R.id.py1);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        int i;
        IPadAutoRotateScreenService iPadAutoRotateScreenService = (IPadAutoRotateScreenService) C1161920gLG.LIZJ(IPadAutoRotateScreenService.class);
        if (iPadAutoRotateScreenService != null) {
            iPadAutoRotateScreenService.Wy1();
        }
        C16F5 c16f5 = this.LLILLJJLI;
        if (c16f5 != null) {
            if (((Boolean) C468540IYy.LIZ().getFirst()).booleanValue()) {
                i = 2131855015;
            } else {
                i = 2131855014;
            }
            c16f5.setText(i);
            c16f5.setWidth((C497740JfY.LJIIZILJ() * 556) / 1024);
            C21382118m3.LIZJ(c16f5, 1);
            try {
                C21382118m3.LIZIZ(c16f5, 36, 40, 4, 2);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJI("PadAutoRotateScreenGuideWidget", e);
            }
        }
        C1143680frq.LJIIJJI(this.LL, "tiktok_live_watch_resource_demand_1", "ttlive_pad_auto_rotate_screen_guide_lottie.zip");
        View view = this.contentView;
        if (view != null) {
            C439101nJ.LJI(view);
        }
        View view2 = this.contentView;
        if (view2 != null) {
            C786410Ut5.T4(view2, 0.0f);
        }
        C1295960jpS c1295960jpS = this.LL;
        if (c1295960jpS != null) {
            c1295960jpS.setRepeatCount(-1);
        }
        C1295960jpS c1295960jpS2 = this.LL;
        if (c1295960jpS2 != null) {
            c1295960jpS2.cancelAnimation();
        }
        int iCy0 = ((IPadAutoRotateScreenService) C1161920gLG.LIZJ(IPadAutoRotateScreenService.class)).Cy0();
        Object objGg0 = DataChannelGlobal.LLILZ.gg0(TopLiveSkylightVisibilityChannel.class);
        PadAutoRotateScreenGuideSetting padAutoRotateScreenGuideSetting = PadAutoRotateScreenGuideSetting.INSTANCE;
        int enterRoomCount = padAutoRotateScreenGuideSetting.getValue().getEnterRoomCount();
        this.LLILZ = System.currentTimeMillis() + padAutoRotateScreenGuideSetting.getValue().getDelay();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("enter room count:");
        sbLIZ.append(iCy0);
        sbLIZ.append(", target enter room count:");
        sbLIZ.append(enterRoomCount);
        sbLIZ.append(", top live sky light visibility:");
        sbLIZ.append(objGg0);
        sbLIZ.append(", can show time:");
        sbLIZ.append(this.LLILZ);
        C20441214yg.LJIIIZ("PadAutoRotateScreenGuideWidget", C2188811AlT.LIZIZ(sbLIZ));
        if (iCy0 < enterRoomCount) {
            return;
        }
        DataChannelGlobal.LLILZ.BQ2(this, this, TopLiveSkylightVisibilityChannel.class, new AwS586S0100000_7(this, 164));
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.BQ2(this, FullScreenSurveyShowing.class, new AwS586S0100000_7(this, 165));
        }
        A1();
    }

    public final void y1(boolean z) {
        boolean z2;
        if (!isViewValid()) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("hideGuide contentView is View.VISIBLE:");
        if (this.contentView.getVisibility() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        sbLIZ.append(z2);
        C20441214yg.LJIIIZ("PadAutoRotateScreenGuideWidget", C2188811AlT.LIZIZ(sbLIZ));
        AnonymousClass0956 anonymousClass0956 = this.LLILZIL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLILZIL = null;
        if (this.contentView.getVisibility() == 8 && !z) {
            return;
        }
        this.contentView.setOnTouchListener(null);
        if (z) {
            if (isViewValid()) {
                C439101nJ.LJI(this.contentView);
                C1295960jpS c1295960jpS = this.LL;
                if (c1295960jpS != null) {
                    c1295960jpS.cancelAnimation();
                    return;
                }
                return;
            }
            return;
        }
        z1(new AwS551S0100000_7(this, 80), false);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent == null) {
            return true;
        }
        int action = motionEvent.getAction();
        if (action != 1 && action != 2 && action != 3) {
            return true;
        }
        y1(false);
        return true;
    }

    public final void z1(Function0 function0, boolean z) {
        float f;
        Animator animator = this.LLILLL;
        if (animator != null && animator.isRunning()) {
            Animator animator2 = this.LLILLL;
            if (animator2 != null) {
                animator2.removeAllListeners();
            }
            Animator animator3 = this.LLILLL;
            if (animator3 != null) {
                animator3.cancel();
            }
        }
        View view = this.contentView;
        if (view == null) {
            return;
        }
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        float alpha = view.getAlpha();
        if (alpha == f) {
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.contentView, (Property<View, Float>) View.ALPHA, alpha, f);
        objectAnimatorOfFloat.setDuration(300L);
        objectAnimatorOfFloat.addListener(new ALAdapterS3S0100000_6(function0, 56));
        this.LLILLL = objectAnimatorOfFloat;
        objectAnimatorOfFloat.start();
    }
}
