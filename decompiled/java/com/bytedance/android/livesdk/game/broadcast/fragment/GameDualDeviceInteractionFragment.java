package com.bytedance.android.livesdk.game.broadcast.fragment;

import X.C098200Yq;
import X.C09JN;
import X.C0J1N;
import X.C0JDJ;
import X.C0TDA;
import X.C0TDX;
import X.C1161920gLG;
import X.C11PQ;
import X.C11RD;
import X.C1273340jEy;
import X.C128Y;
import X.C12ES;
import X.C14KS;
import X.C1685300txQ;
import X.C1701940uOG;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20441214yg;
import X.C2188811AlT;
import X.C439101nJ;
import X.C465220IMe;
import X.C475510Ikn;
import X.C486790J7d;
import X.C781230Ukj;
import X.C786410Ut5;
import X.InterfaceC1106030et7;
import X.InterfaceC420801kM;
import X.InterfaceC743470TEj;
import Y.AfS181S0100000_12;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.dataChannel.LiveDualDeviceFlipCameraChannel;
import com.bytedance.android.livesdk.dataChannel.LiveDualDevicePowerCameraChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.game.broadcast.mirror.message.DualDevicePublicScreenConfigMsg;
import com.bytedance.android.livesdk.game.broadcast.widget.DualDeviceEnhanceWidget;
import com.bytedance.android.livesdk.game.broadcast.widget.DualDeviceFlipPowerWidget;
import com.bytedance.android.livesdk.game.broadcast.widget.DualDevicePauseWidget;
import com.bytedance.android.livesdk.game.broadcast.widget.DualDevicePowerCameraWidget;
import com.bytedance.android.livesdk.game.broadcast.widget.DualDevicePowerWidget;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.dualdevice.IDualDeviceVideoWidget;
import com.bytedance.android.widget.Widget;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidgetProviderProxy;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class GameDualDeviceInteractionFragment extends BaseFragment implements C0TDX, C0JDJ {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9LyQhLGExOiotLSwyOzHELIOSFiLz0yLygpJzt9DyQhLAsmKSkILDk6KyAFJzs2OiQvPSY8JgM+KCg+LSs4";
    public SurfaceView LL;
    public View LLILLJJLI;
    public LiveIconView LLILLL;
    public TextView LLILZ;
    public View LLILZIL;
    public View LLILZLL;
    public View LLIZ;
    public View LLIZLLLIL;
    public View LLJ;
    public View LLJI;
    public Widget LLJIJIL;
    public RecyclableWidgetManager LLJILJIL;
    public DualDevicePowerWidget LLJILJILJ;
    public DualDevicePowerCameraWidget LLJILLL;
    public DualDeviceFlipPowerWidget LLJJ;
    public IDualDeviceVideoWidget LLJJI;
    public DualDevicePauseWidget LLJJIII;
    public DataChannel LLJJIJI;
    public C11PQ<C0TDA> LLJJIJIIJIL;
    public C1273340jEy LLJJIJIL;
    public C781230Ukj LLJJJ;
    public boolean LLJJJJLIIL;
    public InterfaceC420801kM LLJJLIIIJLLLLLLLZ;
    public ObjectAnimator LLJL;
    public int LLJJJIL = 640;
    public int LLJJJJ = 480;
    public String LLJJJJJIL = "";
    public final C11PQ<Boolean> LLJJL = C11PQ.LJLLLLLL(Boolean.FALSE);

    @Override // X.C0TDX
    public final void W5(boolean z) {
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, X.InterfaceC513210KAt
    public final /* synthetic */ int getThemeOverlay(Context context) {
        return C465220IMe.LIZ();
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment
    public final /* synthetic */ boolean isLight(Context context) {
        throw null;
    }

    public final void NR() {
        InterfaceC420801kM interfaceC420801kM = this.LLJJLIIIJLLLLLLLZ;
        if (interfaceC420801kM != null) {
            interfaceC420801kM.dispose();
        }
        this.LLJJLIIIJLLLLLLLZ = ((C0J1N) this.LLJJL.LJJJLZIJ(C1701940uOG.LIZIZ()).LIZJ(C11RD.LIZLLL(this))).LIZ(new AfS181S0100000_12(this, 79), new C09JN() { // from class: X.0TEb
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("GameDualDeviceInteractionFragment@2f0e.observeSurfaceVisibility$2");
                C20441214yg.LJ("GameDualDeviceInteractionFragment", Log.getStackTraceString((Throwable) obj));
                C1C7U.LIZIZ("GameDualDeviceInteractionFragment@2f0e.observeSurfaceVisibility$2");
            }
        });
    }

    public final void PR() {
        LiveIconView liveIconView = this.LLILLL;
        if (liveIconView != null) {
            ObjectAnimator objectAnimator = this.LLJL;
            if (objectAnimator == null || !objectAnimator.isRunning()) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(liveIconView, (Property<LiveIconView, Float>) View.ROTATION, 0.0f, 360.0f);
                if (objectAnimatorOfFloat != null) {
                    objectAnimatorOfFloat.setDuration(1000L);
                    objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
                    objectAnimatorOfFloat.setRepeatCount(-1);
                    C786410Ut5.Pd(objectAnimatorOfFloat);
                } else {
                    objectAnimatorOfFloat = null;
                }
                this.LLJL = objectAnimatorOfFloat;
            }
        }
    }

    public final void RR() {
        View viewFindViewById;
        if (this.LLJJIII == null) {
            return;
        }
        View view = getView();
        if (view != null && (viewFindViewById = view.findViewById(R.id.widget_pause)) != null) {
            C439101nJ.LJI(viewFindViewById);
        }
        RecyclableWidgetManager recyclableWidgetManager = this.LLJILJIL;
        if (recyclableWidgetManager != null) {
            recyclableWidgetManager.unload(this.LLJJIII);
        }
        this.LLJJIII = null;
    }

    @Override // X.C0TDX
    public final LiveDialogFragment s7() {
        IDualDeviceVideoWidget iDualDeviceVideoWidget = this.LLJJI;
        if (iDualDeviceVideoWidget != null) {
            return iDualDeviceVideoWidget.x1();
        }
        return null;
    }

    @Override // X.C0TDX
    public final void lp() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("initVideoWidget() surfaceView = ");
        sbLIZ.append(this.LL);
        sbLIZ.append(",videoWidget = ");
        sbLIZ.append(this.LLJJI);
        C20441214yg.LJIIIZ("GameDualDeviceInteractionFragment", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LL == null || this.LLJJI != null) {
            return;
        }
        IDualDeviceVideoWidget dualDeviceVideoWidgetV2 = ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).getDualDeviceVideoWidgetV2(this.LL);
        this.LLJJI = dualDeviceVideoWidgetV2;
        if (dualDeviceVideoWidgetV2 != null) {
            RecyclableWidgetManager recyclableWidgetManager = this.LLJILJIL;
            if (recyclableWidgetManager != null) {
                recyclableWidgetManager.load(dualDeviceVideoWidgetV2);
            }
            NR();
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("initVideoWidget() initVideo widget videoWidget = ");
        sbLIZ2.append(this.LLJJI);
        C20441214yg.LJIIIZ("GameDualDeviceInteractionFragment", C2188811AlT.LIZIZ(sbLIZ2));
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        LiveIconView liveIconView = this.LLILLL;
        if (liveIconView != null) {
            C786410Ut5.Db(liveIconView, 0.0f);
        }
        ObjectAnimator objectAnimator = this.LLJL;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        IDualDeviceVideoWidget iDualDeviceVideoWidget = this.LLJJI;
        if (iDualDeviceVideoWidget != null) {
            iDualDeviceVideoWidget.onDestroyView();
        }
        C781230Ukj c781230Ukj = this.LLJJJ;
        if (c781230Ukj != null) {
            c781230Ukj.LIZIZ();
        }
        C20441214yg.LJIIIZ("GameDualDeviceInteractionFragment", "onDestroyView()");
    }

    public final void OR(boolean z) {
        if (!z) {
            this.LLJJL.onNext(Boolean.TRUE);
        }
        IDualDeviceVideoWidget iDualDeviceVideoWidget = this.LLJJI;
        if (iDualDeviceVideoWidget != null) {
            iDualDeviceVideoWidget.y1(!z);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onCameraOff() cameraOff = ");
        sbLIZ.append(z);
        sbLIZ.append(" videoWidget = ");
        sbLIZ.append(this.LLJJI);
        C20441214yg.LJIIIZ("GameDualDeviceInteractionFragment", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.C0TDX
    public final void wP(DualDevicePublicScreenConfigMsg dualDevicePublicScreenConfigMsg) {
        if (this.LLJJJ != null) {
            int i = dualDevicePublicScreenConfigMsg.autoTranslationEnable;
            if (i == 1) {
                InterfaceC1106030et7.J5.LJFF(Boolean.TRUE);
            } else {
                if (i != 0) {
                    return;
                }
                InterfaceC1106030et7.J5.LJFF(Boolean.FALSE);
            }
        }
    }

    @Override // X.C0TDX
    public final void yp(boolean z) {
        IDualDeviceVideoWidget iDualDeviceVideoWidget = this.LLJJI;
        if (iDualDeviceVideoWidget != null) {
            iDualDeviceVideoWidget.y1(z);
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        C0J1N c0j1n;
        View viewFindViewById;
        InterfaceC743470TEj interfaceC743470TEj;
        ViewGroup.LayoutParams layoutParams;
        InterfaceC743470TEj interfaceC743470TEj2;
        Room room;
        super.onViewCreated(view, bundle);
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        this.LLJJIJI = dataChannelLJ;
        if (dataChannelLJ == null || (room = (Room) dataChannelLJ.gg0(RoomChannel.class)) == null || (string = Long.valueOf(room.getId()).toString()) == null) {
            string = "";
        }
        this.LLJJJJJIL = string;
        C128Y parentFragment = getParentFragment();
        if ((parentFragment instanceof InterfaceC743470TEj) && (interfaceC743470TEj2 = (InterfaceC743470TEj) parentFragment) != null) {
            this.LLJJIJIL = interfaceC743470TEj2.X7();
            this.LLJJIJIIJIL = interfaceC743470TEj2.getCurrentState();
            this.LLJJJIL = interfaceC743470TEj2.getVideoWidth();
            this.LLJJJJ = interfaceC743470TEj2.getVideoHeight();
            this.LLJJJJLIIL = interfaceC743470TEj2.Yk();
        }
        this.LLILLL = (LiveIconView) view.findViewById(R.id.kew);
        this.LLILZIL = view.findViewById(R.id.xyl);
        this.LL = (SurfaceView) view.findViewById(R.id.wq8);
        this.LLILZLL = view.findViewById(R.id.widget_container);
        this.LLILZ = (TextView) view.findViewById(R.id.xqm);
        this.LLIZ = view.findViewById(R.id.xqn);
        this.LLILLJJLI = view.findViewById(R.id.wq2);
        this.LLIZLLLIL = view.findViewById(R.id.mb9);
        this.LLJ = view.findViewById(R.id.kgt);
        this.LLJI = view.findViewById(R.id.zbn);
        View view2 = this.LLILLJJLI;
        if (view2 != null && (layoutParams = view2.getLayoutParams()) != null) {
            layoutParams.height = (C14KS.LJFF() * this.LLJJJJ) / this.LLJJJIL;
            View view3 = this.LLILLJJLI;
            if (view3 != null) {
                C786410Ut5.W5(view3, layoutParams);
            }
        }
        this.LLJILJIL = RecyclableWidgetManager.of(this, getView(), LiveWidgetProviderProxy.Companion.getInstance(), C486790J7d.LIZ);
        if (this.LLJJJJLIIL) {
            if (this.LL != null && this.LLJJI == null) {
                C128Y parentFragment2 = getParentFragment();
                if ((parentFragment2 instanceof InterfaceC743470TEj) && (interfaceC743470TEj = (InterfaceC743470TEj) parentFragment2) != null && interfaceC743470TEj.getLiveStream() != null) {
                    this.LLJJI = ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).getDualDeviceVideoWidgetV2(this.LL);
                }
            }
        } else if (this.LLJJIJIL != null && this.LL != null && this.LLJJI == null) {
            this.LLJJI = ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).getDualDeviceVideoWidget(this.LLJJIJIL, this.LL, this.LLJJJIL, this.LLJJJJ, 0);
        }
        IDualDeviceVideoWidget iDualDeviceVideoWidget = this.LLJJI;
        if (iDualDeviceVideoWidget != null) {
            RecyclableWidgetManager recyclableWidgetManager = this.LLJILJIL;
            if (recyclableWidgetManager != null) {
                recyclableWidgetManager.load(iDualDeviceVideoWidget);
            }
            NR();
        }
        if (this.LLJILJILJ == null) {
            this.LLJILJILJ = new DualDevicePowerWidget(null, true, 1);
        }
        if (this.LLJILLL == null) {
            this.LLJILLL = new DualDevicePowerCameraWidget(true);
        }
        if (this.LLJJ == null) {
            this.LLJJ = new DualDeviceFlipPowerWidget(null, true, 1);
        }
        RecyclableWidgetManager recyclableWidgetManager2 = this.LLJILJIL;
        if (recyclableWidgetManager2 != null) {
            recyclableWidgetManager2.load(R.id.cft, this.LLJILLL);
        }
        RecyclableWidgetManager recyclableWidgetManager3 = this.LLJILJIL;
        if (recyclableWidgetManager3 != null) {
            recyclableWidgetManager3.load(R.id.cfs, this.LLJILJILJ);
        }
        RecyclableWidgetManager recyclableWidgetManager4 = this.LLJILJIL;
        if (recyclableWidgetManager4 != null) {
            recyclableWidgetManager4.load(R.id.cd7, this.LLJJ);
        }
        View view4 = getView();
        if (view4 != null && (viewFindViewById = view4.findViewById(R.id.cd0)) != null) {
            C12ES.LJIILL(0, viewFindViewById);
        }
        RecyclableWidgetManager recyclableWidgetManager5 = this.LLJILJIL;
        if (recyclableWidgetManager5 != null) {
            recyclableWidgetManager5.load(R.id.cd0, new DualDeviceEnhanceWidget(true));
        }
        this.LLJJJ = new C781230Ukj(getContext(), this, this.LLJILJIL, this.LLJJIJI, false, null, new AwS591S0100000_12(this, 22));
        DataChannel dataChannel = this.LLJJIJI;
        if (dataChannel != null) {
            dataChannel.EQ2(this, LiveDualDevicePowerCameraChannel.class, new AwS591S0100000_12(this, 23));
            dataChannel.EQ2(this, LiveDualDeviceFlipCameraChannel.class, new AwS591S0100000_12(this, 24));
        }
        C11PQ<C0TDA> c11pq = this.LLJJIJIIJIL;
        if (c11pq != null && (c0j1n = (C0J1N) c11pq.LJJJLZIJ(C1701940uOG.LIZIZ()).LJJIFFI().LIZJ(C11RD.LIZLLL(this))) != null) {
            c0j1n.LIZ(new AfS181S0100000_12(this, 14), new C09JN() { // from class: X.012o
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("GameDualDeviceInteractionFragment@2f0e.uiStateObserve$2");
                    C20441214yg.LJ("GameDualDeviceInteractionFragment", Log.getStackTraceString((Throwable) obj));
                    C1C7U.LIZIZ("GameDualDeviceInteractionFragment@2f0e.uiStateObserve$2");
                }
            });
        }
        C20441214yg.LJIIIZ("GameDualDeviceInteractionFragment", "onViewCreated()");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.gii, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }
}
