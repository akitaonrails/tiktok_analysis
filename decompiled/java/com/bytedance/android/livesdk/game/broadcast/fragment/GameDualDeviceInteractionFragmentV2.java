package com.bytedance.android.livesdk.game.broadcast.fragment;

import X.C098200Yq;
import X.C09JN;
import X.C0J1N;
import X.C0JDJ;
import X.C0TD7;
import X.C0TDA;
import X.C0TDX;
import X.C1161920gLG;
import X.C11PQ;
import X.C11RD;
import X.C1273340jEy;
import X.C128Y;
import X.C12ES;
import X.C13LQ;
import X.C1685300txQ;
import X.C1701940uOG;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C19ME;
import X.C20441214yg;
import X.C2188811AlT;
import X.C439101nJ;
import X.C465220IMe;
import X.C475510Ikn;
import X.C486790J7d;
import X.C743510TEn;
import X.C781230Ukj;
import X.C786410Ut5;
import X.DialogInterfaceOnDismissListenerC786070UsX;
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
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.dataChannel.GameDualDeviceGiftCountChannel;
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
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class GameDualDeviceInteractionFragmentV2 extends BaseFragment implements C0TDX, C0JDJ {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9LyQhLGExOiotLSwyOzFiHELIOSLz0yLygpJzt9DyQhLAsmKSkILDk6KyAFJzs2OiQvPSY8JgM+KCg+LSs4H30=";
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
    public View LLJILJIL;
    public View LLJILJILJ;
    public View LLJILLL;
    public View LLJJ;
    public View LLJJI;
    public View LLJJIII;
    public View LLJJIJI;
    public RecyclableWidgetManager LLJJIJIIJIL;
    public DualDevicePowerWidget LLJJIJIL;
    public DualDevicePowerCameraWidget LLJJJ;
    public DualDeviceFlipPowerWidget LLJJJIL;
    public IDualDeviceVideoWidget LLJJJJ;
    public DualDevicePauseWidget LLJJJJJIL;
    public DataChannel LLJJJJLIIL;
    public C11PQ<C0TDA> LLJJL;
    public C1273340jEy LLJJLIIIJLLLLLLLZ;
    public C781230Ukj LLJL;
    public LiveDialogFragment LLJLILLLLZIIL;
    public boolean LLJZ;
    public boolean LLJZIJLIL;
    public InterfaceC420801kM LLLF;
    public int LLLFF;
    public ObjectAnimator LLLFFI;
    public final Map<Integer, C19ME> LLJLIL = new LinkedHashMap();
    public int LLJLL = 640;
    public int LLJLLIL = 480;
    public String LLJLLL = "";
    public final C11PQ<Boolean> LLL = C11PQ.LJLLLLLL(Boolean.FALSE);

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, X.InterfaceC513210KAt
    public final /* synthetic */ int getThemeOverlay(Context context) {
        return C465220IMe.LIZ();
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment
    public final /* synthetic */ boolean isLight(Context context) {
        throw null;
    }

    public final void PR() {
        InterfaceC420801kM interfaceC420801kM = this.LLLF;
        if (interfaceC420801kM != null) {
            interfaceC420801kM.dispose();
        }
        this.LLLF = ((C0J1N) this.LLL.LJJJLZIJ(C1701940uOG.LIZIZ()).LIZJ(C11RD.LIZLLL(this))).LIZ(new AfS181S0100000_12(this, 80), new C09JN() { // from class: X.0TEc
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("GameDualDeviceInteractionFragmentV2@ae16.observeSurfaceVisibility$2");
                C20441214yg.LJ("GameDualDeviceInteractionFragmentV2", Log.getStackTraceString((Throwable) obj));
                C1C7U.LIZIZ("GameDualDeviceInteractionFragmentV2@ae16.observeSurfaceVisibility$2");
            }
        });
    }

    public final void UR() {
        LiveIconView liveIconView = this.LLILLL;
        if (liveIconView != null) {
            ObjectAnimator objectAnimator = this.LLLFFI;
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
                this.LLLFFI = objectAnimatorOfFloat;
            }
        }
    }

    public final void VR() {
        View viewFindViewById;
        if (this.LLJJJJJIL == null) {
            return;
        }
        View view = getView();
        if (view != null && (viewFindViewById = view.findViewById(R.id.widget_pause)) != null) {
            C439101nJ.LJI(viewFindViewById);
        }
        RecyclableWidgetManager recyclableWidgetManager = this.LLJJIJIIJIL;
        if (recyclableWidgetManager != null) {
            recyclableWidgetManager.unload(this.LLJJJJJIL);
        }
        this.LLJJJJJIL = null;
    }

    @Override // X.C0TDX
    public final LiveDialogFragment s7() {
        LiveDialogFragment liveDialogFragmentX1;
        IDualDeviceVideoWidget iDualDeviceVideoWidget = this.LLJJJJ;
        if (iDualDeviceVideoWidget == null || (liveDialogFragmentX1 = iDualDeviceVideoWidget.x1()) == null) {
            return null;
        }
        this.LLJLILLLLZIIL = liveDialogFragmentX1;
        if (this.LLJZ) {
            ZR(0.0f, -1, R.id.w04, C439101nJ.LIZ(16));
        }
        liveDialogFragmentX1.addOnDismissListener(new DialogInterfaceOnDismissListenerC786070UsX(this, liveDialogFragmentX1, 0));
        return liveDialogFragmentX1;
    }

    @Override // X.C0TDX
    public final void lp() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("initVideoWidget() surfaceView = ");
        sbLIZ.append(this.LL);
        sbLIZ.append(",videoWidget = ");
        sbLIZ.append(this.LLJJJJ);
        C20441214yg.LJIIIZ("GameDualDeviceInteractionFragmentV2", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LL == null || this.LLJJJJ != null) {
            return;
        }
        IDualDeviceVideoWidget dualDeviceVideoWidgetV2 = ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).getDualDeviceVideoWidgetV2(this.LL);
        this.LLJJJJ = dualDeviceVideoWidgetV2;
        if (dualDeviceVideoWidgetV2 != null) {
            RecyclableWidgetManager recyclableWidgetManager = this.LLJJIJIIJIL;
            if (recyclableWidgetManager != null) {
                recyclableWidgetManager.load(dualDeviceVideoWidgetV2);
            }
            PR();
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("initVideoWidget() initVideo widget videoWidget = ");
        sbLIZ2.append(this.LLJJJJ);
        C20441214yg.LJIIIZ("GameDualDeviceInteractionFragmentV2", C2188811AlT.LIZIZ(sbLIZ2));
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        LiveIconView liveIconView = this.LLILLL;
        if (liveIconView != null) {
            C786410Ut5.Db(liveIconView, 0.0f);
        }
        ObjectAnimator objectAnimator = this.LLLFFI;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        DataChannel dataChannel = this.LLJJJJLIIL;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
        IDualDeviceVideoWidget iDualDeviceVideoWidget = this.LLJJJJ;
        if (iDualDeviceVideoWidget != null) {
            iDualDeviceVideoWidget.onDestroyView();
        }
        C781230Ukj c781230Ukj = this.LLJL;
        if (c781230Ukj != null) {
            c781230Ukj.LIZIZ();
        }
        ((LinkedHashMap) this.LLJLIL).clear();
        this.LLJILJIL = null;
        this.LLJILJILJ = null;
        this.LLJILLL = null;
        this.LLJJ = null;
        this.LLJJI = null;
        this.LLJJIJI = null;
        this.LLIZLLLIL = null;
        this.LLLFF = 0;
        C20441214yg.LJIIIZ("GameDualDeviceInteractionFragmentV2", "onDestroyView()");
    }

    public final void OR(boolean z) {
        Integer num;
        C781230Ukj c781230Ukj;
        int i;
        C0TDA c0tdaLJLZ = null;
        int iIntValue = 0;
        if (this.LLJZ) {
            WR(this.LLJILJIL, AFwS236S0000000_6.get$arr$(11));
            WR(this.LLJILJILJ, AFwS236S0000000_6.get$arr$(12));
            WR(this.LLJILLL, AFwS236S0000000_6.get$arr$(13));
            ZR(0.5f, 0, -1, 0);
            NR(true, null);
            LiveDialogFragment liveDialogFragment = this.LLJLILLLLZIIL;
            if (liveDialogFragment != null && liveDialogFragment.isShowing()) {
                ZR(0.0f, -1, R.id.w04, C439101nJ.LIZ(16));
            }
            View view = this.LLJJ;
            if (view != null) {
                C12ES.LJIILL(0, view);
            }
            View view2 = this.LLJJI;
            if (view2 != null) {
                C12ES.LJIILL(0, view2);
            }
        } else {
            for (View view3 : (ArrayList) C13LQ.LJIJI(new View[]{this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, this.LLILLJJLI})) {
                C19ME c19me = (C19ME) ((LinkedHashMap) this.LLJLIL).get(Integer.valueOf(view3.getId()));
                if (c19me != null) {
                    C786410Ut5.W5(view3, new C19ME(c19me));
                }
            }
            NR(false, Float.valueOf(0.0f));
            View view4 = this.LLJJ;
            if (view4 != null) {
                C439101nJ.LJI(view4);
            }
            View view5 = this.LLJJI;
            if (view5 != null) {
                C439101nJ.LJI(view5);
            }
        }
        View view6 = this.LLIZLLLIL;
        if (view6 != null) {
            C11PQ<C0TDA> c11pq = this.LLJJL;
            if (c11pq != null) {
                c0tdaLJLZ = c11pq.LJLZ();
            }
            if (c0tdaLJLZ instanceof C0TD7) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, view6);
        }
        if (z && (c781230Ukj = this.LLJL) != null) {
            c781230Ukj.LIZJ = this.LLJZ;
            c781230Ukj.LIZ();
        }
        DataChannel dataChannel = this.LLJJJJLIIL;
        if (dataChannel != null && (num = (Integer) dataChannel.gg0(GameDualDeviceGiftCountChannel.class)) != null) {
            iIntValue = num.intValue();
        }
        SR(iIntValue);
    }

    public final void RR(boolean z) {
        if (!z) {
            this.LLL.onNext(Boolean.TRUE);
        }
        IDualDeviceVideoWidget iDualDeviceVideoWidget = this.LLJJJJ;
        if (iDualDeviceVideoWidget != null) {
            iDualDeviceVideoWidget.y1(!z);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onCameraOff() cameraOff = ");
        sbLIZ.append(z);
        sbLIZ.append(" videoWidget = ");
        sbLIZ.append(this.LLJJJJ);
        C20441214yg.LJIIIZ("GameDualDeviceInteractionFragmentV2", C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void SR(int i) {
        FrameLayout.LayoutParams layoutParams;
        int iLIZ;
        if (i > 0) {
            if (i >= 2) {
                iLIZ = C439101nJ.LIZ(150);
            } else {
                iLIZ = C439101nJ.LIZ(105);
            }
            this.LLLFF = Math.max(this.LLLFF, iLIZ);
        } else {
            this.LLLFF = 0;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("refreshGiftTryBackgroundView() , isSidePanelMode = ");
        sbLIZ.append(this.LLJZ);
        sbLIZ.append(" giftCount = ");
        sbLIZ.append(i);
        sbLIZ.append(" finalHeightPx = ");
        sbLIZ.append(this.LLLFF);
        C20441214yg.LJIIIZ("GameDualDeviceInteractionFragmentV2", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LLJZ && i > 0) {
            View view = this.LLJJIJI;
            if (view != null) {
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                if ((layoutParams2 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams2) != null) {
                    layoutParams.height = this.LLLFF;
                    C786410Ut5.W5(view, layoutParams);
                }
                C12ES.LJIILL(0, view);
                return;
            }
            return;
        }
        View view2 = this.LLJJIJI;
        if (view2 == null) {
            return;
        }
        C439101nJ.LJI(view2);
    }

    @Override // X.C0TDX
    public final void W5(boolean z) {
        if (this.LLJZ == z) {
            return;
        }
        this.LLJZ = z;
        if (getView() != null && !this.LLJLIL.isEmpty()) {
            OR(true);
        }
    }

    @Override // X.C0TDX
    public final void wP(DualDevicePublicScreenConfigMsg dualDevicePublicScreenConfigMsg) {
        if (this.LLJL != null) {
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
        IDualDeviceVideoWidget iDualDeviceVideoWidget = this.LLJJJJ;
        if (iDualDeviceVideoWidget != null) {
            iDualDeviceVideoWidget.y1(z);
        }
    }

    public final void NR(boolean z, Float f) {
        View view;
        C19ME c19me;
        TextView textView;
        TextView textView2;
        if ((!z && this.LLJZ) || (view = this.LLILLJJLI) == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if ((layoutParams instanceof C19ME) && (c19me = (C19ME) layoutParams) != null && this.LLJLL > 0 && this.LLJLLIL > 0) {
            ((ViewGroup.MarginLayoutParams) c19me).width = 0;
            ((ViewGroup.MarginLayoutParams) c19me).height = 0;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("H,");
            sbLIZ.append(this.LLJLL);
            sbLIZ.append(':');
            sbLIZ.append(this.LLJLLIL);
            c19me.dimensionRatio = C2188811AlT.LIZIZ(sbLIZ);
            if (f != null) {
                c19me.verticalBias = f.floatValue();
            }
            C786410Ut5.W5(view, c19me);
            view.requestLayout();
            View view2 = this.LLJI;
            if (view2 != null) {
                if (z) {
                    view2.setPadding(view2.getPaddingLeft(), 0, view2.getPaddingRight(), view2.getPaddingBottom());
                    if ((view2 instanceof TextView) && (textView2 = (TextView) view2) != null) {
                        textView2.setGravity(17);
                        return;
                    }
                    return;
                }
                view2.setPadding(view2.getPaddingLeft(), C439101nJ.LIZ(95), view2.getPaddingRight(), view2.getPaddingBottom());
                if (!(view2 instanceof TextView) || (textView = (TextView) view2) == null) {
                    return;
                }
                textView.setGravity(1);
            }
        }
    }

    public final void WR(View view, Function1<? super C19ME, Unit> function1) {
        if (view == null) {
            return;
        }
        C19ME c19me = (C19ME) ((LinkedHashMap) this.LLJLIL).get(Integer.valueOf(view.getId()));
        if (c19me == null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (!(layoutParams instanceof C19ME) || (c19me = (C19ME) layoutParams) == null) {
                return;
            }
        }
        C19ME c19me2 = new C19ME(c19me);
        function1.invoke(c19me2);
        C786410Ut5.W5(view, c19me2);
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        C0J1N c0j1n;
        View viewFindViewById;
        InterfaceC743470TEj interfaceC743470TEj;
        C19ME c19me;
        InterfaceC743470TEj interfaceC743470TEj2;
        Room room;
        super.onViewCreated(view, bundle);
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        this.LLJJJJLIIL = dataChannelLJ;
        View viewFindViewById2 = null;
        if (dataChannelLJ == null || (room = (Room) dataChannelLJ.gg0(RoomChannel.class)) == null || (string = Long.valueOf(room.getId()).toString()) == null) {
            string = "";
        }
        this.LLJLLL = string;
        C128Y parentFragment = getParentFragment();
        if ((parentFragment instanceof InterfaceC743470TEj) && (interfaceC743470TEj2 = (InterfaceC743470TEj) parentFragment) != null) {
            this.LLJJLIIIJLLLLLLLZ = interfaceC743470TEj2.X7();
            this.LLJJL = interfaceC743470TEj2.getCurrentState();
            this.LLJLL = interfaceC743470TEj2.getVideoWidth();
            this.LLJLLIL = interfaceC743470TEj2.getVideoHeight();
            this.LLJZIJLIL = interfaceC743470TEj2.Yk();
        }
        this.LLJILJIL = view.findViewById(R.id.d9z);
        this.LLJILJILJ = view.findViewById(R.id.q1u);
        this.LLJILLL = view.findViewById(R.id.iy0);
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
        this.LLJJ = view.findViewById(R.id.vay);
        this.LLJJI = view.findViewById(R.id.vb0);
        this.LLJJIII = view.findViewById(R.id.gb8);
        this.LLJJIJI = view.findViewById(R.id.j0y);
        for (View view2 : (ArrayList) C13LQ.LJIJI(new View[]{this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, this.LLILLJJLI})) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if ((layoutParams instanceof C19ME) && (c19me = (C19ME) layoutParams) != null) {
                this.LLJLIL.put(Integer.valueOf(view2.getId()), new C19ME(c19me));
            }
        }
        OR(false);
        this.LLJJIJIIJIL = RecyclableWidgetManager.of(this, getView(), LiveWidgetProviderProxy.Companion.getInstance(), C486790J7d.LIZ);
        if (this.LLJZIJLIL) {
            if (this.LL != null && this.LLJJJJ == null) {
                C128Y parentFragment2 = getParentFragment();
                if ((parentFragment2 instanceof InterfaceC743470TEj) && (interfaceC743470TEj = (InterfaceC743470TEj) parentFragment2) != null && interfaceC743470TEj.getLiveStream() != null) {
                    this.LLJJJJ = ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).getDualDeviceVideoWidgetV2(this.LL);
                }
            }
        } else if (this.LLJJLIIIJLLLLLLLZ != null && this.LL != null && this.LLJJJJ == null) {
            this.LLJJJJ = ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).getDualDeviceVideoWidget(this.LLJJLIIIJLLLLLLLZ, this.LL, this.LLJLL, this.LLJLLIL, 0);
        }
        IDualDeviceVideoWidget iDualDeviceVideoWidget = this.LLJJJJ;
        if (iDualDeviceVideoWidget != null) {
            RecyclableWidgetManager recyclableWidgetManager = this.LLJJIJIIJIL;
            if (recyclableWidgetManager != null) {
                recyclableWidgetManager.load(iDualDeviceVideoWidget);
            }
            PR();
        }
        if (this.LLJJIJIL == null) {
            this.LLJJIJIL = new DualDevicePowerWidget(null, true, 1);
        }
        if (this.LLJJJ == null) {
            this.LLJJJ = new DualDevicePowerCameraWidget(true);
        }
        if (this.LLJJJIL == null) {
            this.LLJJJIL = new DualDeviceFlipPowerWidget(null, true, 1);
        }
        RecyclableWidgetManager recyclableWidgetManager2 = this.LLJJIJIIJIL;
        if (recyclableWidgetManager2 != null) {
            recyclableWidgetManager2.load(R.id.cft, this.LLJJJ);
        }
        RecyclableWidgetManager recyclableWidgetManager3 = this.LLJJIJIIJIL;
        if (recyclableWidgetManager3 != null) {
            recyclableWidgetManager3.load(R.id.cfs, this.LLJJIJIL);
        }
        RecyclableWidgetManager recyclableWidgetManager4 = this.LLJJIJIIJIL;
        if (recyclableWidgetManager4 != null) {
            recyclableWidgetManager4.load(R.id.cd7, this.LLJJJIL);
        }
        View view3 = getView();
        if (view3 != null && (viewFindViewById = view3.findViewById(R.id.cd0)) != null) {
            C12ES.LJIILL(0, viewFindViewById);
        }
        RecyclableWidgetManager recyclableWidgetManager5 = this.LLJJIJIIJIL;
        if (recyclableWidgetManager5 != null) {
            recyclableWidgetManager5.load(R.id.cd0, new DualDeviceEnhanceWidget(true));
        }
        View view4 = getView();
        if (view4 != null) {
            viewFindViewById2 = view4.findViewById(R.id.gb8);
        }
        this.LLJL = new C781230Ukj(getContext(), this, this.LLJJIJIIJIL, this.LLJJJJLIIL, this.LLJZ, viewFindViewById2, new AwS591S0100000_12(this, 25));
        DataChannel dataChannel = this.LLJJJJLIIL;
        if (dataChannel != null) {
            dataChannel.EQ2(this, LiveDualDevicePowerCameraChannel.class, new AwS591S0100000_12(this, 27));
            dataChannel.EQ2(this, LiveDualDeviceFlipCameraChannel.class, new AwS591S0100000_12(this, 10));
            dataChannel.CQ2(GameDualDeviceGiftCountChannel.class, this, new AwS591S0100000_12(this, 12));
        }
        C11PQ<C0TDA> c11pq = this.LLJJL;
        if (c11pq != null && (c0j1n = (C0J1N) c11pq.LJJJLZIJ(C1701940uOG.LIZIZ()).LJJIFFI().LIZJ(C11RD.LIZLLL(this))) != null) {
            c0j1n.LIZ(new AfS181S0100000_12(this, 4), new C09JN() { // from class: X.012f
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("GameDualDeviceInteractionFragmentV2@ae16.uiStateObserve$2");
                    C20441214yg.LJ("GameDualDeviceInteractionFragmentV2", Log.getStackTraceString((Throwable) obj));
                    C1C7U.LIZIZ("GameDualDeviceInteractionFragmentV2@ae16.uiStateObserve$2");
                }
            });
        }
        C20441214yg.LJIIIZ("GameDualDeviceInteractionFragmentV2", "onViewCreated()");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.LLJZ = C743510TEn.LIZ(getContext());
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.gij, viewGroup, false);
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

    public final void ZR(float f, int i, int i2, int i3) {
        C19ME c19me;
        View view = this.LLILLJJLI;
        if (view == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if ((layoutParams instanceof C19ME) && (c19me = (C19ME) layoutParams) != null) {
            c19me.topToTop = i;
            c19me.topToBottom = i2;
            c19me.bottomToBottom = 0;
            c19me.bottomToTop = -1;
            ((ViewGroup.MarginLayoutParams) c19me).topMargin = i3;
            c19me.verticalBias = f;
            C786410Ut5.W5(view, c19me);
        }
    }
}
