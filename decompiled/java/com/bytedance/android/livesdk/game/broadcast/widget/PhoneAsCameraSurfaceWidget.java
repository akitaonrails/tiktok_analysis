package com.bytedance.android.livesdk.game.broadcast.widget;

import X.AbstractC743230TDl;
import X.C011Z;
import X.C0J1N;
import X.C0TET;
import X.C11PQ;
import X.C11RD;
import X.C1324720kZq;
import X.C1701940uOG;
import X.C20441214yg;
import X.C2188811AlT;
import X.C497740JfY;
import X.C743410TEd;
import X.C786410Ut5;
import X.EnumC743340TDw;
import Y.ACListenerS147S0100000_12;
import Y.ARunnableS112S0100000_12;
import Y.AfS181S0100000_12;
import android.content.Context;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.dataChannel.LiveDualDeviceFlipCameraChannel;
import com.bytedance.android.livesdk.dataChannel.LivePhoneAsCameraMockFlipCameraChannel;
import com.bytedance.android.livesdk.dataChannel.LivePhoneAsCameraSurfaceCreatedEvent;
import com.bytedance.android.livesdk.dataChannel.LivePhoneAsCameraUserClickEvent;
import com.bytedance.android.livesdk.game.broadcast.widget.PhoneAsCameraSurfaceWidget;
import com.bytedance.android.livesdk.livesetting.game.GameWiredPhoneCameraFixSetting;
import com.bytedance.android.livesdkapi.dualdevice.IDualDeviceVideoWidget;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class PhoneAsCameraSurfaceWidget extends IPhoneAsCameraSurface {
    public final C0TET LL;
    public SurfaceView LLILLL;
    public IDualDeviceVideoWidget LLILZ;
    public View LLILZIL;
    public C1324720kZq LLILZLL;
    public boolean LLIZLLLIL;
    public final C743410TEd LLJILJIL;
    public final String LLILLJJLI = "PhoneAsCameraSurfaceWidget";
    public boolean LLIZ = true;
    public boolean LLJ = true;
    public final C11PQ<Boolean> LLJI = C11PQ.LJLLLLLL(Boolean.TRUE);
    public final ARunnableS112S0100000_12 LLJIJIL = new ARunnableS112S0100000_12(this, 133);

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.hge;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.android.livesdk.game.broadcast.widget.IPhoneAsCameraSurface, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void y1() {
        View view;
        String str = this.LLILLJJLI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("removeAndStartPowerSavaRunnable， couldShowPowerSavaImage: ");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", defaultCameraState: ");
        sbLIZ.append(this.LLJ);
        C20441214yg.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        View view2 = getView();
        if (view2 != null) {
            HandlerHook.viewRemoveCallbacks(view2, this.LLJIJIL);
        }
        if (this.LLIZ && this.LLJ && (view = getView()) != null) {
            HandlerHook.viewPostDelay(view, this.LLJIJIL, 30000L);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        IDualDeviceVideoWidget iDualDeviceVideoWidget;
        View view = getView();
        if (view != null) {
            HandlerHook.viewRemoveCallbacks(view, this.LLJIJIL);
        }
        if (!GameWiredPhoneCameraFixSetting.INSTANCE.isDefault() || (iDualDeviceVideoWidget = this.LLILZ) == null) {
            return;
        }
        iDualDeviceVideoWidget.z1(null);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getThemeOverlay(Context context) {
        return C011Z.LIZ.LJ();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        SurfaceView surfaceView;
        View viewFindViewById;
        SurfaceHolder holder;
        View viewFindViewById2;
        SurfaceView surfaceView2;
        ViewGroup.LayoutParams layoutParams;
        View view = getView();
        if (view != null && (layoutParams = view.getLayoutParams()) != null) {
            int iLJIIZILJ = C497740JfY.LJIIZILJ();
            layoutParams.width = iLJIIZILJ;
            layoutParams.height = (iLJIIZILJ * 16) / 9;
            View view2 = getView();
            if (view2 != null) {
                C786410Ut5.W5(view2, layoutParams);
            }
        }
        View view3 = getView();
        C1324720kZq c1324720kZq = null;
        if (view3 != null) {
            surfaceView = (SurfaceView) view3.findViewById(R.id.wq8);
        } else {
            surfaceView = null;
        }
        this.LLILLL = surfaceView;
        if (GameWiredPhoneCameraFixSetting.INSTANCE.isDefault() && (surfaceView2 = this.LLILLL) != null) {
            C786410Ut5.LLIIII(surfaceView2, 8);
        }
        View view4 = getView();
        if (view4 != null) {
            viewFindViewById = view4.findViewById(R.id.rn7);
        } else {
            viewFindViewById = null;
        }
        this.LLILZIL = viewFindViewById;
        View view5 = getView();
        if (view5 != null) {
            c1324720kZq = (C1324720kZq) view5.findViewById(R.id.bo6);
        }
        this.LLILZLL = c1324720kZq;
        View view6 = getView();
        if (view6 != null && (viewFindViewById2 = view6.findViewById(R.id.wqa)) != null) {
            C786410Ut5.I7(new ACListenerS147S0100000_12(this, 203), viewFindViewById2);
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.BQ2(this, LivePhoneAsCameraUserClickEvent.class, new AwS591S0100000_12(this, 543));
            dataChannel.EQ2(this, LiveDualDeviceFlipCameraChannel.class, new AwS591S0100000_12(this, 544));
            dataChannel.EQ2(this, LivePhoneAsCameraMockFlipCameraChannel.class, new AwS591S0100000_12(this, 545));
        }
        SurfaceView surfaceView3 = this.LLILLL;
        if (surfaceView3 != null && (holder = surfaceView3.getHolder()) != null) {
            holder.addCallback(new SurfaceHolder.Callback() { // from class: X.0TEi
                @Override // android.view.SurfaceHolder.Callback
                public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
                }

                @Override // android.view.SurfaceHolder.Callback
                public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                }

                @Override // android.view.SurfaceHolder.Callback
                public final void surfaceCreated(SurfaceHolder surfaceHolder) {
                    DataChannel dataChannel2;
                    PhoneAsCameraSurfaceWidget phoneAsCameraSurfaceWidget = this.LL;
                    if (phoneAsCameraSurfaceWidget.LL == C0TET.WIRED && (dataChannel2 = phoneAsCameraSurfaceWidget.dataChannel) != null) {
                        dataChannel2.FQ2(LivePhoneAsCameraSurfaceCreatedEvent.class);
                    }
                }
            });
        }
    }

    public final void x1(boolean z) {
        String str = this.LLILLJJLI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPowerSavaEventChanged， showPowerSava: ");
        sbLIZ.append(z);
        C20441214yg.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        if (z) {
            View view = this.LLILZIL;
            if (view != null) {
                C786410Ut5.LJLLLLLL(0, view);
            }
            if (GameWiredPhoneCameraFixSetting.INSTANCE.isDefault()) {
                this.LLJI.onNext(Boolean.FALSE);
                return;
            }
            SurfaceView surfaceView = this.LLILLL;
            if (surfaceView == null) {
                return;
            }
            C786410Ut5.LLIIII(surfaceView, 4);
            return;
        }
        View view2 = getView();
        if (view2 != null) {
            HandlerHook.viewRemoveCallbacks(view2, this.LLJIJIL);
        }
        View view3 = this.LLILZIL;
        if (view3 != null) {
            C786410Ut5.LJLLLLLL(4, view3);
        }
        if (GameWiredPhoneCameraFixSetting.INSTANCE.isDefault()) {
            this.LLJI.onNext(Boolean.TRUE);
            return;
        }
        SurfaceView surfaceView2 = this.LLILLL;
        if (surfaceView2 == null) {
            return;
        }
        C786410Ut5.LLIIII(surfaceView2, 0);
    }

    public final void z1(IDualDeviceVideoWidget iDualDeviceVideoWidget) {
        this.LLILZ = iDualDeviceVideoWidget;
        if (GameWiredPhoneCameraFixSetting.INSTANCE.isDefault() && iDualDeviceVideoWidget != null) {
            iDualDeviceVideoWidget.z1(this.LLJILJIL);
        }
    }

    public PhoneAsCameraSurfaceWidget(C11PQ<EnumC743340TDw> c11pq, C11PQ<AbstractC743230TDl> c11pq2, C0TET c0tet) {
        C0J1N c0j1n;
        C0J1N c0j1n2;
        this.LL = c0tet;
        AfS181S0100000_12 afS181S0100000_12 = new AfS181S0100000_12(this, 101);
        AfS181S0100000_12 afS181S0100000_122 = new AfS181S0100000_12(this, 103);
        if (c11pq2 != null && (c0j1n2 = (C0J1N) c11pq2.LJJJLZIJ(C1701940uOG.LIZIZ()).LIZJ(C11RD.LJ(this))) != null) {
            c0j1n2.LIZ(afS181S0100000_122, new AfS181S0100000_12(this, 99));
        }
        if (c11pq != null && (c0j1n = (C0J1N) c11pq.LJJJLZIJ(C1701940uOG.LIZIZ()).LIZJ(C11RD.LJ(this))) != null) {
            c0j1n.LIZ(afS181S0100000_12, new AfS181S0100000_12(this, 100));
        }
        this.LLJILJIL = new C743410TEd(this);
    }
}
