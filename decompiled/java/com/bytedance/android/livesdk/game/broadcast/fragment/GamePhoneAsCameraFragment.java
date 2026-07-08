package com.bytedance.android.livesdk.game.broadcast.fragment;

import X.AbstractC743230TDl;
import X.C098200Yq;
import X.C0IGR;
import X.C0IJR;
import X.C0IP3;
import X.C0J1N;
import X.C0JDJ;
import X.C0TE0;
import X.C0TE6;
import X.C0TES;
import X.C0TET;
import X.C0TEU;
import X.C0TZV;
import X.C1161920gLG;
import X.C11PQ;
import X.C11RD;
import X.C1273340jEy;
import X.C1685300txQ;
import X.C1701940uOG;
import X.C189200o6;
import X.C1954807lC;
import X.C19EG;
import X.C19GS;
import X.C20441214yg;
import X.C465220IMe;
import X.C474470Ij7;
import X.C486790J7d;
import X.C497740JfY;
import X.C743540TEq;
import X.C782110Um9;
import X.C786410Ut5;
import X.EnumC743340TDw;
import X.InterfaceC743380TEa;
import Y.ACListenerS147S0100000_12;
import Y.ARunnableS120S0100000_20;
import Y.AcS495S0100000_12;
import Y.AfS181S0100000_12;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.livesdk.dataChannel.LiveDualDevicePowerEvent;
import com.bytedance.android.livesdk.dataChannel.LivePhoneAsCameraSurfaceCreatedEvent;
import com.bytedance.android.livesdk.game.broadcast.phoneascamera.PhoneAsCameraWiredStrategy;
import com.bytedance.android.livesdk.game.broadcast.widget.DualDeviceFlipPowerWidget;
import com.bytedance.android.livesdk.game.broadcast.widget.DualDevicePowerWidget;
import com.bytedance.android.livesdk.game.broadcast.widget.PhoneAsCameraErrorWidget;
import com.bytedance.android.livesdk.game.broadcast.widget.PhoneAsCameraSurfaceWidget;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdkapi.dualdevice.IDualDeviceVideoWidget;
import com.bytedance.android.widget.Widget;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidgetProviderProxy;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class GamePhoneAsCameraFragment extends BaseFragment implements C0IP3, C0IGR, C0JDJ {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9LyQhLGExOiotLSHELIOSwyOzFiLz0yLygpJzt9DyQhLB87JyspCDwQKSgpOy4VOiQrJCo9PA==";
    public int LL = 640;
    public int LLILLJJLI = 480;
    public C0TET LLILLL = C0TET.WIRELESS;
    public DualDeviceFlipPowerWidget LLILZ;
    public DualDevicePowerWidget LLILZIL;
    public PhoneAsCameraSurfaceWidget LLILZLL;
    public RecyclableWidgetManager LLIZ;
    public IDualDeviceVideoWidget LLIZLLLIL;
    public PhoneAsCameraErrorWidget LLJ;
    public C0TE0 LLJI;
    public InterfaceC743380TEa LLJIJIL;
    public C1273340jEy LLJILJIL;
    public String LLJILJILJ;
    public long LLJILLL;
    public DataChannel LLJJ;

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, X.InterfaceC513210KAt
    public final /* synthetic */ int getThemeOverlay(Context context) {
        return C465220IMe.LIZ();
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment
    public final /* synthetic */ boolean isLight(Context context) {
        throw null;
    }

    @Override // X.C0IGR
    public final boolean onBackPressed() {
        NR(getContext());
        return true;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        C1273340jEy c1273340jEy = this.LLJILJIL;
        if (c1273340jEy != null) {
            BPEAHandler bPEAHandler = c1273340jEy.LLIZ;
            if (bPEAHandler != null) {
                C786410Ut5.LJJZZIII(bPEAHandler, new ARunnableS120S0100000_20(c1273340jEy, 0));
            }
            c1273340jEy.LLIZLLLIL = null;
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        InterfaceC743380TEa interfaceC743380TEa = this.LLJIJIL;
        if (interfaceC743380TEa != null) {
            interfaceC743380TEa.LIZIZ(true);
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        InterfaceC743380TEa interfaceC743380TEa = this.LLJIJIL;
        if (interfaceC743380TEa != null) {
            interfaceC743380TEa.LIZIZ(false);
        }
    }

    @Override // X.C0IP3
    public final DataChannel provideDataChannel() {
        return this.LLJJ;
    }

    public final void NR(Context context) {
        if (context == null) {
            return;
        }
        C782110Um9 c782110Um9 = new C782110Um9(context);
        c782110Um9.LIZIZ = this;
        c782110Um9.LJIIIZ(C497740JfY.LJIJI(2131853614));
        c782110Um9.LJIIJJI(C497740JfY.LJIJI(2131843009), new AcS495S0100000_12(this, 15));
        c782110Um9.LJIILJJIL(C497740JfY.LJIJI(2131853602), new AcS495S0100000_12(this, 16));
        C786410Ut5.E4(c782110Um9.LIZ());
        C743540TEq.LJJIJIIJIL(this.LLILLL, "show", "disconnect", "", C0TES.LIZ(this.LLJJ));
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.LLJJ = C0IJR.LIZ(new ViewModelProvider(this), this);
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        InterfaceC743380TEa c0te6;
        InterfaceC743380TEa interfaceC743380TEa;
        C11PQ<EnumC743340TDw> c11pqLIZ;
        C0J1N c0j1n;
        C11PQ<EnumC743340TDw> c11pqLIZ2;
        C11PQ<AbstractC743230TDl> c11pqLIZLLL;
        SurfaceView surfaceView;
        C11PQ<EnumC743340TDw> c11pqLIZ3;
        C11PQ<AbstractC743230TDl> c11pqLIZLLL2;
        View view2;
        View view3;
        Serializable serializable;
        int i;
        int i2;
        String string;
        long j;
        String string2;
        C0TET c0tet;
        super.onViewCreated(view, bundle);
        C0TE0 c0te0 = null;
        try {
            Bundle arguments = getArguments();
            if (arguments != null) {
                serializable = arguments.getSerializable("phone_as_camera_link_type_key");
            } else {
                serializable = null;
            }
            if ((serializable instanceof C0TET) && (c0tet = (C0TET) serializable) != null) {
                this.LLILLL = c0tet;
            }
            Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                i = arguments2.getInt("video_width");
            } else {
                i = 640;
            }
            this.LL = i;
            Bundle arguments3 = getArguments();
            if (arguments3 != null) {
                i2 = arguments3.getInt("video_height");
            } else {
                i2 = 480;
            }
            this.LLILLJJLI = i2;
            Bundle arguments4 = getArguments();
            if (arguments4 != null) {
                string = arguments4.getString("enter_from");
            } else {
                string = null;
            }
            this.LLJILJILJ = string;
            Bundle arguments5 = getArguments();
            if (arguments5 != null) {
                j = arguments5.getLong("timestamp");
            } else {
                j = 0;
            }
            this.LLJILLL = j;
            Bundle arguments6 = getArguments();
            if (arguments6 == null || (string2 = arguments6.getString("room_id")) == null) {
                string2 = CardStruct.IStatusCode.DEFAULT;
            }
            DataChannel dataChannel = this.LLJJ;
            if (dataChannel != null) {
                dataChannel.SX0(C0TZV.class, string2);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJI("GamePhoneAsCameraFragment", e);
        }
        if (this.LLILLL != C0TET.WIRED && System.currentTimeMillis() - this.LLJILLL > 300000) {
            C474470Ij7.LIZ(getActivity(), this.LLJILJILJ, "invalid_qr", "invalid_qr", C497740JfY.LJIJI(2131855984));
            C743540TEq.LJJIJ(this.LLILLL, "fail", C0TES.LIZ(this.LLJJ), this.LLJILJILJ, "qr_code_expired");
            return;
        }
        C1273340jEy c1273340jEy = new C1273340jEy();
        this.LLJILJIL = c1273340jEy;
        C0TET c0tet2 = this.LLILLL;
        DataChannel dataChannel2 = this.LLJJ;
        String str = this.LLJILJILJ;
        AwS591S0100000_12 awS591S0100000_12 = new AwS591S0100000_12(this, 529);
        int i3 = C0TEU.LIZ[c0tet2.ordinal()];
        if (i3 != 1) {
            if (i3 == 2) {
                c0te6 = new PhoneAsCameraWiredStrategy(this, dataChannel2, c1273340jEy, str);
            } else {
                throw new C1954807lC();
            }
        } else {
            c0te6 = new C0TE6(this, dataChannel2, c1273340jEy, str, awS591S0100000_12);
        }
        this.LLJIJIL = c0te6;
        C1273340jEy c1273340jEy2 = this.LLJILJIL;
        if (c1273340jEy2 != null) {
            c1273340jEy2.LLIZLLLIL = this.LLJJ;
        }
        this.LLIZ = RecyclableWidgetManager.of(this, getView(), LiveWidgetProviderProxy.Companion.getInstance(), C486790J7d.LIZ);
        if (this.LLILZIL == null) {
            this.LLILZIL = new DualDevicePowerWidget(C497740JfY.LJIJI(2131853602), false, 2);
        }
        RecyclableWidgetManager recyclableWidgetManager = this.LLIZ;
        if (recyclableWidgetManager != null) {
            recyclableWidgetManager.load(R.id.cfs, this.LLILZIL);
        }
        C743540TEq.LJJIJIIJI(this.LLILLL, "show", "disconnect");
        if (this.LLILZ == null) {
            this.LLILZ = new DualDeviceFlipPowerWidget(C497740JfY.LJIJI(2131853605), false, 2);
        }
        DualDeviceFlipPowerWidget dualDeviceFlipPowerWidget = this.LLILZ;
        if (dualDeviceFlipPowerWidget != null && (view3 = dualDeviceFlipPowerWidget.getView()) != null) {
            C786410Ut5.T4(view3, 0.2f);
        }
        DualDeviceFlipPowerWidget dualDeviceFlipPowerWidget2 = this.LLILZ;
        if (dualDeviceFlipPowerWidget2 != null && (view2 = dualDeviceFlipPowerWidget2.getView()) != null) {
            view2.setClickable(false);
        }
        RecyclableWidgetManager recyclableWidgetManager2 = this.LLIZ;
        if (recyclableWidgetManager2 != null) {
            recyclableWidgetManager2.load(R.id.cd7, this.LLILZ);
        }
        if (this.LLILZLL == null) {
            InterfaceC743380TEa interfaceC743380TEa2 = this.LLJIJIL;
            if (interfaceC743380TEa2 != null) {
                c11pqLIZ3 = interfaceC743380TEa2.LIZ();
            } else {
                c11pqLIZ3 = null;
            }
            InterfaceC743380TEa interfaceC743380TEa3 = this.LLJIJIL;
            if (interfaceC743380TEa3 != null) {
                c11pqLIZLLL2 = interfaceC743380TEa3.LIZLLL();
            } else {
                c11pqLIZLLL2 = null;
            }
            this.LLILZLL = new PhoneAsCameraSurfaceWidget(c11pqLIZ3, c11pqLIZLLL2, this.LLILLL);
        }
        RecyclableWidgetManager recyclableWidgetManager3 = this.LLIZ;
        if (recyclableWidgetManager3 != null) {
            recyclableWidgetManager3.load(R.id.wq2, (Widget) this.LLILZLL, false);
        }
        if (this.LLIZLLLIL == null) {
            IBroadcastService iBroadcastService = (IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class);
            C1273340jEy c1273340jEy3 = this.LLJILJIL;
            PhoneAsCameraSurfaceWidget phoneAsCameraSurfaceWidget = this.LLILZLL;
            if (phoneAsCameraSurfaceWidget != null) {
                surfaceView = phoneAsCameraSurfaceWidget.LLILLL;
            } else {
                surfaceView = null;
            }
            IDualDeviceVideoWidget dualDeviceVideoWidget = iBroadcastService.getDualDeviceVideoWidget(c1273340jEy3, surfaceView, this.LL, this.LLILLJJLI, 1);
            this.LLIZLLLIL = dualDeviceVideoWidget;
            PhoneAsCameraSurfaceWidget phoneAsCameraSurfaceWidget2 = this.LLILZLL;
            if (phoneAsCameraSurfaceWidget2 != null) {
                phoneAsCameraSurfaceWidget2.z1(dualDeviceVideoWidget);
            }
        }
        if (this.LLJ == null) {
            InterfaceC743380TEa interfaceC743380TEa4 = this.LLJIJIL;
            if (interfaceC743380TEa4 != null) {
                c11pqLIZ2 = interfaceC743380TEa4.LIZ();
            } else {
                c11pqLIZ2 = null;
            }
            InterfaceC743380TEa interfaceC743380TEa5 = this.LLJIJIL;
            if (interfaceC743380TEa5 != null) {
                c11pqLIZLLL = interfaceC743380TEa5.LIZLLL();
            } else {
                c11pqLIZLLL = null;
            }
            this.LLJ = new PhoneAsCameraErrorWidget(c11pqLIZ2, c11pqLIZLLL, this.LLJILJILJ, this.LLILLL);
        }
        RecyclableWidgetManager recyclableWidgetManager4 = this.LLIZ;
        if (recyclableWidgetManager4 != null) {
            recyclableWidgetManager4.load(this.LLJ);
        }
        RecyclableWidgetManager recyclableWidgetManager5 = this.LLIZ;
        if (recyclableWidgetManager5 != null) {
            recyclableWidgetManager5.load(this.LLIZLLLIL);
        }
        View view4 = getView();
        if (view4 != null) {
            c0te0 = (C0TE0) view4.findViewById(R.id.nnp);
        }
        this.LLJI = c0te0;
        if (c0te0 != null && (interfaceC743380TEa = this.LLJIJIL) != null && (c11pqLIZ = interfaceC743380TEa.LIZ()) != null && (c0j1n = (C0J1N) c11pqLIZ.LJJJLZIJ(C1701940uOG.LIZIZ()).LIZJ(C11RD.LJ(this))) != null) {
            c0j1n.LIZ(c0te0.LLILZ, new AfS181S0100000_12(c0te0, 162));
        }
        DataChannel dataChannel3 = this.LLJJ;
        if (dataChannel3 != null) {
            dataChannel3.EQ2(this, LiveDualDevicePowerEvent.class, new AwS591S0100000_12(this, 18));
            dataChannel3.EQ2(this, LivePhoneAsCameraSurfaceCreatedEvent.class, new AwS591S0100000_12(this, 19));
        }
        InterfaceC743380TEa interfaceC743380TEa6 = this.LLJIJIL;
        if (interfaceC743380TEa6 != null) {
            interfaceC743380TEa6.LIZJ(getArguments());
        }
        C786410Ut5.I7(new ACListenerS147S0100000_12(this, 185), view);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.hgc, viewGroup, false);
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
