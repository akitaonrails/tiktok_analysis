package com.ss.android.ugc.aweme.live;

import X.AnonymousClass1995;
import X.C07MV;
import X.C098200Yq;
import X.C0IJT;
import X.C0TVI;
import X.C0UF5;
import X.C0UF6;
import X.C0UQS;
import X.C0WZX;
import X.C1086020eMq;
import X.C1161920gLG;
import X.C1322020kVU;
import X.C1324720kZq;
import X.C1388190mED;
import X.C14EU;
import X.C14K9;
import X.C1664600tQ2;
import X.C1685300txQ;
import X.C168R;
import X.C168V;
import X.C168Y;
import X.C16FZ;
import X.C1844940y6u;
import X.C189200o6;
import X.C19A3;
import X.C19EG;
import X.C19EH;
import X.C19GS;
import X.C1AF0;
import X.C1AKK;
import X.C1AKR;
import X.C1AKS;
import X.C1AKT;
import X.C1AKW;
import X.C1AKZ;
import X.C1CC2;
import X.C1DRG;
import X.C20441214yg;
import X.C20622515mp;
import X.C21305318Zf;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C2296808zG;
import X.C376800Epy;
import X.C474500IjA;
import X.C474750IjZ;
import X.C479860Iro;
import X.C484240Iys;
import X.C500260Jjc;
import X.C504210Jpz;
import X.C520010KaN;
import X.C774890UaV;
import X.C786410Ut5;
import X.C799570VYd;
import X.C930930aKh;
import X.C930940aKi;
import X.C951990asf;
import X.EnumC1153480g7e;
import X.EnumC2177591AKf;
import X.EnumC479890Irr;
import X.InterfaceC1452360nti;
import X.InterfaceC1452540nu0;
import X.InterfaceC20597015ii;
import X.InterfaceC2177561AKc;
import X.InterfaceC2177771AKx;
import X.InterfaceC362610EJn;
import X.InterfaceC479850Irn;
import X.InterfaceC484050IyZ;
import X.InterfaceC524950KiL;
import X.InterfaceC770380UJw;
import X.InterfaceC773120UUk;
import X.InterfaceC782610Umx;
import X.InterfaceC782970UnX;
import X.InterfaceC876920Yag;
import X.RunnableC1604300rqm;
import X.SurfaceHolderCallbackC2177731AKt;
import X.SurfaceHolderCallbackC2177741AKu;
import Y.ARunnableS112S0100000_12;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.ai.api.pitaya.LivePitayaEnv;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.liveinteract.competition.service.ILiveCompetitionExternalService;
import com.bytedance.android.livesdk.comp.api.performance.IPerformanceService;
import com.bytedance.android.livesdk.dataChannel.CreateVideoRoomSuccessEvent;
import com.bytedance.android.livesdk.dataChannel.RemoveRootFragmentEvent;
import com.bytedance.android.livesdk.dataChannel.StartVideoLiveBroadcastFailEvent;
import com.bytedance.android.livesdk.internal.Live;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.PlaybookOnNewIntentBugfixEnabledSettings;
import com.bytedance.android.livesdk.livesetting.performance.LiveBroadcastHostUseTTLH;
import com.bytedance.android.livesdk.livesetting.performance.LiveBroadcastLogBlockOpt;
import com.bytedance.android.livesdk.livesetting.performance.LiveBroadcastReuseSurfaceView;
import com.bytedance.android.livesdk.livesetting.performance.LiveHostApplogOpt;
import com.bytedance.android.livesdk.livesetting.performance.LiveHostDowngradeLegoTaskSettings;
import com.bytedance.android.livesdk.performance.memory.BroadcastMemoryCleanersEnableSetting;
import com.bytedance.android.livesdk.performance.memory.LiveMemoryTrigger;
import com.bytedance.android.livesdk.performance.memory.MemoryTriggerSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostCreativeTool;
import com.bytedance.applog.util.BlockHelper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.live.LiveBroadcastRootFragment;
import com.ss.android.ugc.aweme.live.smoothhost.LiveMultiTabWrapperActivity;
import com.ss.android.ugc.aweme.live.strategy.LegoTaskDowngradeStrategy;
import com.ss.android.ugc.aweme.services.effect.IEffectDeletableCheckerService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS278S0000000_32;
import kotlin.jvm.internal.AwS611S0100000_32;
import kotlin.jvm.internal.AwS612S0100000_33;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes34.dex */
public final class LiveBroadcastRootFragment extends BaseLiveSdkSceneFragment implements AnonymousClass1995, InterfaceC524950KiL, InterfaceC773120UUk, InterfaceC876920Yag, InterfaceC2177771AKx, InterfaceC1452540nu0, InterfaceC770380UJw {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiklPyHELIOSp9BCw6LA0hJyQoKi4gPBcjJjsVOiQrJCo9PA==";
    public C1AKS LLJJIJIIJIL;
    public C1AKR LLJJIJIL;
    public C774890UaV LLJJJIL;
    public C21305318Zf LLJJJJ;
    public C1086020eMq LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public boolean LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public boolean LLJLIL;
    public boolean LLJLILLLLZIIL;
    public boolean LLJLL;
    public View LLJLLL;
    public ViewGroup LLJZ;
    public FrameLayout LLJZIJLIL;
    public InterfaceC1452360nti LLL;
    public SurfaceHolderCallbackC2177731AKt LLLF;
    public SurfaceHolderCallbackC2177741AKu LLLFF;
    public C1AKZ LLLFFI;
    public SurfaceView LLLFZ;
    public View LLLI;
    public ViewGroup.LayoutParams LLLII;
    public ViewOutlineProvider LLLIIII;
    public Boolean LLLIIIIL;
    public InterfaceC782970UnX LLLIIIL;
    public final BPEAHandler LLLIIL;
    public boolean LLLIILIL;
    public C376800Epy LLLIL;
    public C16FZ LLLILZ;
    public boolean LLLILZJ;
    public boolean LLLILZLLLI;
    public boolean LLLIZZ;
    public boolean LLLJ;
    public int LLLJIL;
    public DisplayManager LLLJL;
    public C1AKW LLLL;
    public C1AKT LLLLII;
    public final ARunnableS112S0100000_12 LLLLIIIILLL;
    public final RunnableC1604300rqm LLLLIIL;
    public final String LLJJIII = "songsong";
    public final String LLJJIJI = "LiveBroadcastRootFragment";
    public final ArrayList<InterfaceC484050IyZ> LLJJJ = new ArrayList<>();
    public boolean LLJLLIL = true;

    @Override // X.InterfaceC524950KiL
    public final void AH(InterfaceC362610EJn interfaceC362610EJn) {
    }

    @Override // X.InterfaceC773120UUk
    public final ViewGroup JM() {
        qS(null, false);
        C774890UaV c774890UaV = this.LLJJJIL;
        if (c774890UaV != null) {
            return c774890UaV.LL;
        }
        return null;
    }

    @Override // X.InterfaceC773120UUk
    public final C1324720kZq Kl() {
        qS(null, false);
        C774890UaV c774890UaV = this.LLJJJIL;
        if (c774890UaV != null) {
            return c774890UaV.LLILLJJLI;
        }
        return null;
    }

    @Override // X.InterfaceC2177771AKx
    public final void LLIIZ(int i, int i2, Surface surface) {
    }

    @Override // X.InterfaceC2177771AKx
    public final void LLJLIL() {
    }

    @Override // X.InterfaceC2177771AKx
    public final void WB(Surface surface) {
    }

    @Override // X.InterfaceC773120UUk
    public final View ai() {
        qS(null, false);
        return null;
    }

    @Override // X.InterfaceC524950KiL
    public final void b8(InterfaceC362610EJn interfaceC362610EJn) {
    }

    @Override // X.InterfaceC773120UUk
    public final C1324720kZq fm() {
        qS(null, false);
        C774890UaV c774890UaV = this.LLJJJIL;
        if (c774890UaV != null) {
            return c774890UaV.LLIZ;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.live.BaseLiveSdkSceneFragment
    public final int getPageType() {
        return 1;
    }

    @Override // com.ss.android.ugc.aweme.live.BaseLiveSdkSceneFragment
    public final boolean iS() {
        return false;
    }

    @Override // X.InterfaceC773120UUk
    public final ImageView kE() {
        qS(null, false);
        C774890UaV c774890UaV = this.LLJJJIL;
        if (c774890UaV != null) {
            return c774890UaV.LLILZLL;
        }
        return null;
    }

    @Override // X.InterfaceC524950KiL
    public final void kF(InterfaceC362610EJn interfaceC362610EJn) {
    }

    @Override // X.InterfaceC770380UJw
    public final void lj() {
    }

    @Override // X.InterfaceC773120UUk
    public final View mj() {
        qS(null, false);
        C774890UaV c774890UaV = this.LLJJJIL;
        if (c774890UaV != null) {
            return c774890UaV.LLILZIL;
        }
        return null;
    }

    @Override // X.InterfaceC773120UUk
    public final View on() {
        qS(null, false);
        C774890UaV c774890UaV = this.LLJJJIL;
        if (c774890UaV != null) {
            return c774890UaV.LLILZ;
        }
        return null;
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, X.InterfaceC214902198i
    public final void onWindowFocusChanged(boolean z) {
    }

    @Override // X.InterfaceC773120UUk
    public final void tb() {
        qS(null, false);
        C774890UaV c774890UaV = this.LLJJJIL;
        if (c774890UaV != null) {
            c774890UaV.tb();
        }
    }

    @Override // X.InterfaceC770380UJw
    public final void Ot() {
        SurfaceView surfaceViewLJIJJLI;
        SurfaceHolderCallbackC2177731AKt surfaceHolderCallbackC2177731AKt = this.LLLF;
        if (surfaceHolderCallbackC2177731AKt != null && (surfaceViewLJIJJLI = surfaceHolderCallbackC2177731AKt.LJIJJLI()) != null) {
            C500260Jjc.LJIILIIL(surfaceViewLJIJJLI);
        }
        SurfaceView surfaceViewOS = oS();
        if (surfaceViewOS != null) {
            C786410Ut5.LJLLLLLL(8, surfaceViewOS);
        }
    }

    @Override // X.InterfaceC770380UJw
    public final void jw() {
        SurfaceView surfaceViewLJIJJLI;
        SurfaceHolder holder;
        InterfaceC1452360nti interfaceC1452360nti = this.LLL;
        if (interfaceC1452360nti != null && (surfaceViewLJIJJLI = interfaceC1452360nti.LJIJJLI()) != null && (holder = surfaceViewLJIJJLI.getHolder()) != null) {
            holder.setSizeFromLayout();
        }
        InterfaceC1452360nti interfaceC1452360nti2 = this.LLL;
        if (interfaceC1452360nti2 != null) {
            interfaceC1452360nti2.Wn2(this);
        }
    }

    public final int mS() throws Throwable {
        WindowManager windowManager;
        Display displayLLILZIL;
        if (Build.VERSION.SDK_INT >= 30) {
            C19EG activity = getActivity();
            if (activity == null) {
                return 0;
            }
            displayLLILZIL = activity.getDisplay();
        } else {
            C19EG activity2 = getActivity();
            if (activity2 == null || (windowManager = activity2.getWindowManager()) == null) {
                return 0;
            }
            displayLLILZIL = C2204961BRm.LLILZIL(windowManager, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOahdZqA8DvnvqwrRO6ZqM5OHFQZxb9ogIQ9OY2zEw==", null));
        }
        if (displayLLILZIL != null) {
            return displayLLILZIL.getRotation();
        }
        return 0;
    }

    public final C1DRG nS() {
        C19EG c19egLIZIZ;
        C19EG activity;
        IHostCreativeTool iHostCreativeTool = C520010KaN.LIZ;
        Object objNc2 = iHostCreativeTool != null ? iHostCreativeTool.nc2(getActivity()) : null;
        if (objNc2 instanceof C19A3) {
            C19A3 c19a3 = (C19A3) objNc2;
            if (C1664600tQ2.LJIIJJI(c19a3)) {
                return C1664600tQ2.LJ(c19a3).LJFF();
            }
        }
        if (objNc2 instanceof C19EG) {
            C19EG c19eg = (C19EG) objNc2;
            if (C1664600tQ2.LJIIJ(c19eg)) {
                return C1664600tQ2.LIZLLL(c19eg).LJFF();
            }
        }
        C19EG activity2 = getActivity();
        if (activity2 == null || (c19egLIZIZ = C1388190mED.LIZIZ(activity2)) == null || !C1664600tQ2.LJIIJ(c19egLIZIZ) || (activity = getActivity()) == null) {
            return null;
        }
        return C1664600tQ2.LIZLLL(activity).LJFF();
    }

    public final SurfaceView oS() {
        SurfaceView surfaceViewLJLIIIL;
        SurfaceView surfaceViewLJIJJLI;
        C1AKZ c1akz = this.LLLFFI;
        if (c1akz != null && (surfaceViewLJIJJLI = c1akz.LJIJJLI()) != null) {
            return surfaceViewLJIJJLI;
        }
        InterfaceC782970UnX interfaceC782970UnX = this.LLLIIIL;
        return (interfaceC782970UnX == null || (surfaceViewLJLIIIL = interfaceC782970UnX.LJLIIIL()) == null) ? this.LLLFZ : surfaceViewLJLIIIL;
    }

    @Override // com.ss.android.ugc.aweme.live.BaseLiveSdkSceneFragment, androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onDestroy() throws JSONException {
        Object c098200Yq;
        DisplayManager displayManager;
        String str = this.LLJJIII;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("rootFragment onDestroy");
        sbLIZ.append(this);
        C20441214yg.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        try {
            if (C07MV.LIZ() && (displayManager = this.LLLJL) != null) {
                displayManager.unregisterDisplayListener(this.LLLL);
            }
            super.onDestroy();
            release();
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onDestroy error. ");
            sbLIZ2.append(thM5exceptionOrNullimpl);
            C20441214yg.LJ("LiveBroadcastRootFragment", C2188811AlT.LIZIZ(sbLIZ2));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(Scene.SCENE_SERVICE, "LiveBroadcastRootFragment#onDestroy");
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("trace", Log.getStackTraceString(new Exception()));
            C1CC2.LJI("ttlive_live_host_common_exception_collector", jSONObject, jSONObject2, jSONObject3);
        }
    }

    public final boolean rS() {
        return C500260Jjc.LJJJI((Boolean) DataChannelGlobal.LLILZ.gg0(C951990asf.class));
    }

    public final void release() {
        if (this.LLJLILLLLZIIL) {
            return;
        }
        C21305318Zf c21305318Zf = this.LLJJJJ;
        if (c21305318Zf != null) {
            C799570VYd.LIZIZ().removeCallbacks(c21305318Zf.LJIIIIZZ);
            C2296808zG.LIZJ(c21305318Zf.LJII, null);
            if (c21305318Zf.LJFF.get()) {
                c21305318Zf.LJFF.set(false);
                BlockHelper.endBlock();
                BlockHelper.setBlockInterval(c21305318Zf.LJI);
            }
            this.LLJJJJ = null;
        }
        if (this.LLJJJJJIL != null) {
            C1086020eMq.LIZ();
            this.LLJJJJJIL = null;
        }
        this.LLJLILLLLZIIL = true;
        this.LLLLII = null;
        Live.getService().setBroadcastActivity(null);
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        Function1 function1 = (Function1) dataChannelGlobal.gg0(C168Y.class);
        if (function1 != null) {
            function1.invoke(0);
        }
        List list = (List) dataChannelGlobal.gg0(C168R.class);
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ((InterfaceC782610Umx) it2.next()).LIZ(0);
            }
        }
        DataChannelGlobal dataChannelGlobal2 = DataChannelGlobal.LLILZ;
        dataChannelGlobal2.IQ2(C168V.class);
        this.LLLIIL.removeCallbacksAndMessages(null);
        LivePitayaEnv.LJIIJ(this);
        CopyOnWriteArrayList<InterfaceC479850Irn> copyOnWriteArrayList = C479860Iro.LIZ;
        C479860Iro.LIZIZ(this, EnumC479890Irr.BROADCAST);
        C474750IjZ.LIZ();
        C1322020kVU.LIZ = false;
        dataChannelGlobal2.zQ2(this);
    }

    @Override // X.InterfaceC876920Yag
    public final List<Integer> zs() {
        return Collections.singletonList(11);
    }

    public LiveBroadcastRootFragment() {
        Looper looperMyLooper = Looper.myLooper();
        this.LLLIIL = new BPEAHandler(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper);
        aS(AFwS278S0000000_32.get$arr$(61));
        this.LLLLII = new C1AKT(this);
        this.LLLLIIIILLL = new ARunnableS112S0100000_12(this, 196);
        this.LLLLIIL = RunnableC1604300rqm.LL;
    }

    @Override // X.InterfaceC1452540nu0
    public final void LLLJIL() {
        SurfaceView surfaceViewOS = oS();
        if (surfaceViewOS != null) {
            C500260Jjc.LJIILIIL(surfaceViewOS);
        }
    }

    @Override // X.InterfaceC2177771AKx
    public final void M0() {
        ViewGroup viewGroup;
        if (LiveBroadcastReuseSurfaceView.getEnableRecordPage()) {
            ViewGroup.LayoutParams layoutParams = this.LLLII;
            if (layoutParams != null) {
                SurfaceView surfaceViewOS = oS();
                ViewParent parent = surfaceViewOS != null ? surfaceViewOS.getParent() : null;
                if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                    C786410Ut5.X5(layoutParams, viewGroup);
                }
                this.LLLII = null;
            }
            ViewOutlineProvider viewOutlineProvider = this.LLLIIII;
            if (viewOutlineProvider != null) {
                SurfaceView surfaceViewOS2 = oS();
                if (surfaceViewOS2 != null) {
                    surfaceViewOS2.setOutlineProvider(viewOutlineProvider);
                }
                this.LLLIIII = null;
            }
            Boolean bool = this.LLLIIIIL;
            if (bool != null) {
                boolean zBooleanValue = bool.booleanValue();
                SurfaceView surfaceViewOS3 = oS();
                if (surfaceViewOS3 != null) {
                    surfaceViewOS3.setClipToOutline(zBooleanValue);
                }
                this.LLLIIIIL = null;
            }
        }
    }

    @Override // X.InterfaceC773120UUk
    public final SurfaceView fI() {
        if (LiveBroadcastReuseSurfaceView.getEnable()) {
            return oS();
        }
        qS(null, false);
        C774890UaV c774890UaV = this.LLJJJIL;
        if (c774890UaV != null) {
            return c774890UaV.LLILLL;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void kS() {
        SurfaceView surfaceViewOS;
        C19EG c19egLIZIZ;
        C1DRG c1drgLJFF;
        C1DRG c1drgLJFF2;
        SurfaceHolderCallbackC2177741AKu surfaceHolderCallbackC2177741AKu;
        Bundle arguments = getArguments();
        boolean z = arguments != null ? arguments.getBoolean("is_light_record_container_mode") : false;
        if (!(getActivity() instanceof InterfaceC782970UnX) && !z) {
            IHostCreativeTool iHostCreativeTool = C520010KaN.LIZ;
            if (iHostCreativeTool == null || !iHostCreativeTool.UC0()) {
                C19EG activity = getActivity();
                if (activity != null && (c19egLIZIZ = C1388190mED.LIZIZ(activity)) != null && C1664600tQ2.LJIIJ(c19egLIZIZ)) {
                    C19EG activity2 = getActivity();
                    this.LLLF = (activity2 == null || (c1drgLJFF2 = C1664600tQ2.LIZLLL(activity2).LJFF()) == null) ? null : (SurfaceHolderCallbackC2177731AKt) c1drgLJFF2.LJII(SurfaceHolderCallbackC2177731AKt.class, null);
                    if (LiveBroadcastHostUseTTLH.getEnable()) {
                        try {
                            C19EG activity3 = getActivity();
                            this.LLLFF = (activity3 == null || (c1drgLJFF = C1664600tQ2.LIZLLL(activity3).LJFF()) == null) ? null : (SurfaceHolderCallbackC2177741AKu) c1drgLJFF.LJII(SurfaceHolderCallbackC2177741AKu.class, null);
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                }
            } else {
                C1DRG c1drgNS = nS();
                this.LLLF = c1drgNS != null ? (SurfaceHolderCallbackC2177731AKt) c1drgNS.LJII(SurfaceHolderCallbackC2177731AKt.class, null) : null;
                if (LiveBroadcastHostUseTTLH.getEnable()) {
                    if (c1drgNS != null) {
                        try {
                            surfaceHolderCallbackC2177741AKu = (SurfaceHolderCallbackC2177741AKu) c1drgNS.LJII(SurfaceHolderCallbackC2177741AKu.class, null);
                        } catch (Exception e2) {
                            TryCatchGuardChecker.doCheck(e2);
                        }
                    } else {
                        surfaceHolderCallbackC2177741AKu = null;
                    }
                    this.LLLFF = surfaceHolderCallbackC2177741AKu;
                }
            }
        }
        if (LiveBroadcastReuseSurfaceView.getEnableRecordPage()) {
            SurfaceHolderCallbackC2177731AKt surfaceHolderCallbackC2177731AKt = this.LLLF;
            this.LLL = surfaceHolderCallbackC2177731AKt;
            if (surfaceHolderCallbackC2177731AKt != null) {
                surfaceHolderCallbackC2177731AKt.d12(this);
            }
        }
        if (LiveBroadcastHostUseTTLH.getEnable()) {
            this.LLLFFI = this.LLLFF;
        }
        if (LiveBroadcastReuseSurfaceView.getEnableIndependentPage()) {
            if (z) {
                C1DRG c1drgNS2 = nS();
                InterfaceC782970UnX interfaceC782970UnX = c1drgNS2 != null ? (InterfaceC782970UnX) c1drgNS2.LJIIL(null, InterfaceC782970UnX.class) : null;
                this.LLLIIIL = interfaceC782970UnX;
                if (interfaceC782970UnX == null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("[LightRecordMode]can not found ILiveBroadcastSurfaceViewController, ");
                    IHostCreativeTool iHostCreativeTool2 = C520010KaN.LIZ;
                    sbLIZ.append(iHostCreativeTool2 != null ? iHostCreativeTool2.nc2(getActivity()) : null);
                    C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
                }
            } else {
                C19EG activity4 = getActivity();
                this.LLLIIIL = activity4 instanceof InterfaceC782970UnX ? (InterfaceC782970UnX) activity4 : null;
            }
        }
        if (!LiveBroadcastReuseSurfaceView.getEnable() || (surfaceViewOS = oS()) == null) {
            return;
        }
        surfaceViewOS.setZOrderMediaOverlay(true);
    }

    @Override // X.InterfaceC2177771AKx
    public final void l2() {
        View view;
        if (LiveBroadcastReuseSurfaceView.getEnableRecordPage()) {
            SurfaceView surfaceViewOS = oS();
            Object parent = surfaceViewOS != null ? surfaceViewOS.getParent() : null;
            this.LLLII = (!(parent instanceof ViewGroup) || (view = (View) parent) == null) ? null : view.getLayoutParams();
            SurfaceView surfaceViewOS2 = oS();
            this.LLLIIII = surfaceViewOS2 != null ? surfaceViewOS2.getOutlineProvider() : null;
            SurfaceView surfaceViewOS3 = oS();
            this.LLLIIIIL = surfaceViewOS3 != null ? Boolean.valueOf(surfaceViewOS3.getClipToOutline()) : null;
        }
    }

    @Override // X.InterfaceC770380UJw
    public final ViewGroup ol() {
        SurfaceView surfaceViewOS = oS();
        ViewParent parent = surfaceViewOS != null ? surfaceViewOS.getParent() : null;
        if (parent instanceof ViewGroup) {
            return (ViewGroup) parent;
        }
        return null;
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, X.InterfaceC214902198i
    public final boolean onBackPressed() {
        if (rS() && !this.LLLIZZ) {
            String str = this.LLJJIII;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Intercept onBackPressed canBack=");
            sbLIZ.append(this.LLLIZZ);
            C20441214yg.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
            return true;
        }
        C20441214yg.LIZIZ(this.LLJJIII, "no Intercept onBackPressed");
        C1AKR c1akr = this.LLJJIJIL;
        if (C500260Jjc.LJJJI(c1akr != null ? Boolean.valueOf(c1akr.onBackPressed()) : null)) {
            return true;
        }
        C1AKS c1aks = this.LLJJIJIIJIL;
        if (C500260Jjc.LJJJI(c1aks != null ? Boolean.valueOf(c1aks.onBackPressed()) : null)) {
            return true;
        }
        return super.onBackPressed();
    }

    @Override // com.ss.android.ugc.aweme.live.BaseLiveSdkSceneFragment, androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        C19EG activity;
        super.onResume();
        ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).setGoLiveFullChainLogParams(11, null, 0);
        if (this.LLJJL) {
            uS("livesdk_backtolive_live_take", true);
            this.LLJJL = false;
            this.LLJJLIIIJLLLLLLLZ = false;
        }
        if (LiveBroadcastReuseSurfaceView.getEnableRecordPage() || (activity = getActivity()) == null) {
            return;
        }
        ((IHostCreativeTool) C1161920gLG.LIZJ(IHostCreativeTool.class)).qh2(activity);
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        InterfaceC1452360nti interfaceC1452360nti;
        super.onStart();
        if (LiveBroadcastReuseSurfaceView.getEnableRecordPage() && (interfaceC1452360nti = this.LLL) != null) {
            interfaceC1452360nti.d12(this);
        }
        if (!LiveBroadcastReuseSurfaceView.getEnable() || ((ILiveCompetitionExternalService) C1161920gLG.LIZJ(ILiveCompetitionExternalService.class)).v91()) {
            return;
        }
        r7();
    }

    @Override // X.InterfaceC1452540nu0
    public final void r7() {
        SurfaceView surfaceViewOS = oS();
        if (surfaceViewOS != null) {
            C500260Jjc.LLFFF(surfaceViewOS);
        }
    }

    @Override // X.InterfaceC770380UJw
    public final SurfaceView w9() {
        return oS();
    }

    @Override // com.ss.android.ugc.aweme.live.BaseLiveSdkSceneFragment, X.InterfaceC20596815ig
    public final boolean JL() {
        return this.LLLJ;
    }

    @Override // com.ss.android.ugc.aweme.live.BaseLiveSdkSceneFragment, androidx.fragment.app.SAFTikTokFragment, X.InterfaceC214902198i
    public final void LLLLIILLL(Bundle bundle) {
        Parcelable parcelable;
        Bundle arguments;
        super.LLLLIILLL(bundle);
        this.LLJLLIL = true;
        C20441214yg.LIZIZ(this.LLJJIII, "rootFragment onNewIntent");
        if (bundle != null) {
            C1844940y6u.LIZIZ(getContext(), this, bundle);
            this.LLJJJJLIIL = bundle.getBoolean("is_one_tap_go_live", false);
            String string = bundle.getString("request_page");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("BroadcastActivity onNewIntent :");
            sbLIZ.append(string);
            C20441214yg.LIZIZ("LiveBroadcastRootFragment", C2188811AlT.LIZIZ(sbLIZ));
            if (this.LLJJJJLIIL || Intrinsics.LJFF("live_end_page", string) || Intrinsics.LJFF("live_recap", string) || Intrinsics.LJFF("try_mode", string)) {
                ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).setGoLiveFullChainLogParams(10, null, 0);
                this.LLLIILIL = false;
                Live.getService().LLJILJILJ(string);
                vQ();
                kS();
                qS(oS(), true);
                sS(bundle);
            }
            if (bundle.getBoolean("broadcast_click_notification", false)) {
                this.LLJJLIIIJLLLLLLLZ = bundle.getBoolean("is_live_pause", false);
                this.LLJL = bundle.getBoolean("broadcast_pre_start", false);
                this.LLJLIL = bundle.getBoolean("is_from_recall", false);
                uS("livesdk_backtolive_reminder_click", false);
                this.LLJJL = true;
                Live.getService().stopVideoBroadcastService();
            }
            if (PlaybookOnNewIntentBugfixEnabledSettings.INSTANCE.isEnable() && (parcelable = bundle.getParcelable("preview_page_active_playbook")) != null && (arguments = getArguments()) != null) {
                C786410Ut5.LJJIJL(arguments, "preview_page_active_playbook", parcelable);
            }
        }
    }

    @Override // X.InterfaceC524950KiL
    public final void Qh(InterfaceC484050IyZ interfaceC484050IyZ) {
        this.LLJJJ.add(interfaceC484050IyZ);
    }

    @Override // X.InterfaceC524950KiL
    public final void T4(InterfaceC484050IyZ interfaceC484050IyZ) {
        this.LLJJJ.remove(interfaceC484050IyZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00d6  */
    @Override // com.ss.android.ugc.aweme.live.BaseLiveSdkSceneFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onActivityCreated(android.os.Bundle r20) {
        /*
            Method dump skipped, instruction units count: 627
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.LiveBroadcastRootFragment.onActivityCreated(android.os.Bundle):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v35, types: [X.1AKW, android.hardware.display.DisplayManager$DisplayListener] */
    @Override // com.ss.android.ugc.aweme.live.BaseLiveSdkSceneFragment, androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Bundle bundle2;
        Window window;
        Object objH2;
        DisplayManager displayManager;
        super.onCreate(bundle);
        ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).setGoLiveFullChainLogParams(10, null, 0);
        this.LLLJIL = mS();
        if (C07MV.LIZ()) {
            Context context = getContext();
            if (context != null) {
                objH2 = C786410Ut5.H2(context, "display");
            } else {
                objH2 = null;
            }
            if (objH2 instanceof DisplayManager) {
                displayManager = (DisplayManager) objH2;
            } else {
                displayManager = 0;
            }
            this.LLLJL = displayManager;
            ?? r0 = new DisplayManager.DisplayListener() { // from class: X.1AKW
                @Override // android.hardware.display.DisplayManager.DisplayListener
                public final void onDisplayAdded(int i) {
                }

                @Override // android.hardware.display.DisplayManager.DisplayListener
                public final void onDisplayRemoved(int i) {
                }

                @Override // android.hardware.display.DisplayManager.DisplayListener
                public final void onDisplayChanged(int i) throws Throwable {
                    long j;
                    int iMS = this.LL.mS();
                    LiveBroadcastRootFragment liveBroadcastRootFragment = this.LL;
                    if (iMS != liveBroadcastRootFragment.LLLJIL) {
                        liveBroadcastRootFragment.LLLJIL = iMS;
                        C1AKS c1aks = liveBroadcastRootFragment.LLJJIJIIJIL;
                        if (c1aks != null) {
                            c1aks.i0();
                        }
                    }
                    LiveBroadcastRootFragment liveBroadcastRootFragment2 = this.LL;
                    C473410IhP.LJ(liveBroadcastRootFragment2.LLLLIIIILLL);
                    ARunnableS112S0100000_12 aRunnableS112S0100000_12 = liveBroadcastRootFragment2.LLLLIIIILLL;
                    C782940UnU.LIZ.getClass();
                    if (C782940UnU.LIZIZ()) {
                        j = 100;
                    } else {
                        j = 500;
                    }
                    C473410IhP.LIZJ(aRunnableS112S0100000_12, j);
                }
            };
            this.LLLL = r0;
            if (displayManager != 0) {
                displayManager.registerDisplayListener(r0, null);
            }
        }
        this.LLJLLIL = true;
        if (LiveHostDowngradeLegoTaskSettings.getDowngradeOnlyVideoType()) {
            new LegoTaskDowngradeStrategy("LiveHost", this).LIZ();
        }
        C19EG activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            C0UF6 c0uf6LIZJ = C0UF5.LIZJ();
            if (c0uf6LIZJ != null && c0uf6LIZJ.LIZ) {
                window.setBackgroundDrawableResource(R.drawable.ap6);
            } else {
                window.setBackgroundDrawable(new ColorDrawable(0));
            }
        }
        if (LiveBroadcastLogBlockOpt.enable()) {
            C21305318Zf c21305318Zf = new C21305318Zf();
            this.LLJJJJ = c21305318Zf;
            c21305318Zf.LIZ();
        }
        if (LiveHostApplogOpt.isEnabled()) {
            C1086020eMq c1086020eMq = new C1086020eMq();
            this.LLJJJJJIL = c1086020eMq;
            c1086020eMq.LIZIZ();
        }
        if (bundle != null && (bundle2 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key")) != null) {
            C786410Ut5.LJJIIZI(bundle2, new Bundle(), "android:support:fragments");
        }
        IEffectDeletableCheckerService iEffectDeletableCheckerService = (IEffectDeletableCheckerService) PluggableExtentionKt.pluggableSpi$default(IEffectDeletableCheckerService.class, false, false, false, 14, null);
        if (iEffectDeletableCheckerService != null) {
            iEffectDeletableCheckerService.needAbortCleanup();
        }
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        Function1 function1 = (Function1) dataChannelGlobal.gg0(C168Y.class);
        if (function1 != null) {
            function1.invoke(1);
        }
        List list = (List) dataChannelGlobal.gg0(C168R.class);
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ((InterfaceC782610Umx) it2.next()).LIZ(1);
            }
        }
        DataChannelGlobal.LLILZ.BQ2(this, this, CreateVideoRoomSuccessEvent.class, new AwS612S0100000_33(this, 85));
        DataChannelGlobal.LLILZ.BQ2(this, this, StartVideoLiveBroadcastFailEvent.class, new AwS611S0100000_32(this, 77));
        DataChannelGlobal.LLILZ.BQ2(this, this, RemoveRootFragmentEvent.class, new AwS612S0100000_33(this, 86));
        if (MemoryTriggerSetting.isEnabled()) {
            LiveMemoryTrigger.LJIIJ.getClass();
            LiveMemoryTrigger liveMemoryTrigger = C0UQS.LIZIZ;
            if (liveMemoryTrigger != null) {
                liveMemoryTrigger.Ek1(getContext(), this);
            }
            if (BroadcastMemoryCleanersEnableSetting.isClearNetDataPipelineCacheEnabledInLivePreview() && liveMemoryTrigger != null) {
                EnumC2177591AKf enumC2177591AKf = EnumC2177591AKf.CRITICAL;
                liveMemoryTrigger.YP1("preview_netDataPipeline", enumC2177591AKf, enumC2177591AKf, EnumC1153480g7e.PREVIEW, new InterfaceC2177561AKc() { // from class: X.1AKX
                    @Override // X.InterfaceC2177561AKc
                    public final void LIZ(EnumC1783030wV3 enumC1783030wV3) {
                        this.LIZ.getClass();
                        if (BroadcastMemoryCleanersEnableSetting.isClearNetDataPipelineCacheEnabledInLivePreview()) {
                            LiveMemoryTrigger.LJIIJ.getClass();
                            LiveMemoryTrigger liveMemoryTrigger2 = C0UQS.LIZIZ;
                            if (liveMemoryTrigger2 != null) {
                                liveMemoryTrigger2.q62(new Runnable() { // from class: X.0UjT
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        boolean zLIZ;
                                        C1C7U.LIZ("LiveBroadcastRootFragment@6cbf.clearNetDataPipelineCache$1");
                                        try {
                                            C792720V7u c792720V7u = C787960Uva.LIZ;
                                            synchronized (c792720V7u.LL) {
                                                try {
                                                    c792720V7u.LL.clear();
                                                } finally {
                                                }
                                            }
                                        } finally {
                                            if (!zLIZ) {
                                            }
                                        }
                                        C1C7U.LIZIZ("LiveBroadcastRootFragment@6cbf.clearNetDataPipelineCache$1");
                                    }
                                });
                            }
                        }
                    }
                });
                liveMemoryTrigger.Ge1();
            }
        }
    }

    @C14EU
    public final void onEvent(C484240Iys c484240Iys) {
        if (Live.getService() != null) {
            Live.getService().LJJIL();
        }
    }

    public final void sS(Bundle bundle) {
        boolean z;
        Context activity;
        LiveMultiTabWrapperActivity liveMultiTabWrapperActivity;
        InterfaceC20597015ii interfaceC20597015iiLIZJ;
        C1AKS c1aks;
        Fragment fragment;
        IPerformanceService iPerformanceService = (IPerformanceService) C1161920gLG.LIZJ(IPerformanceService.class);
        if (iPerformanceService != null) {
            iPerformanceService.VJ1();
        }
        this.LLLIZZ = true;
        this.LLJJIJIIJIL = Live.getService().createLiveBroadcastFragment(getContext(), this.LLLLII, bundle);
        FragmentManager fragmentManagerLJIIJJI = SAFExtensionKt.LJIIJJI(this);
        if (fragmentManagerLJIIJJI != null && (c1aks = this.LLJJIJIIJIL) != null && (fragment = c1aks.getFragment()) != null) {
            if (rS()) {
                C19EH c19ehLJIIJ = fragmentManagerLJIIJJI.LJIIJ();
                c19ehLJIIJ.LJIJ(R.id.iiv, fragment, null);
                c19ehLJIIJ.LJIIJ();
            } else {
                C19EH c19ehLJIIJ2 = fragmentManagerLJIIJJI.LJIIJ();
                c19ehLJIIJ2.LJIJ(R.id.iiv, fragment, null);
                c19ehLJIIJ2.LJIIIZ();
            }
        }
        C1AKK service = Live.getService();
        Context context = getContext();
        boolean z2 = this.LLJJJJLIIL;
        if (bundle != null) {
            z = bundle.getBoolean("is_try_mode", false);
        } else {
            z = false;
        }
        service.preloadLiveStream(context, z2, z);
        if (C504210Jpz.LIZ) {
            activity = getContext();
        } else {
            activity = getActivity();
        }
        if (activity != null) {
            Live.getService().setBroadcastActivity(activity);
        }
        if (this.LLJLLIL && !LiveBroadcastReuseSurfaceView.getEnable()) {
            this.LLJLLIL = false;
            if (!LiveBroadcastReuseSurfaceView.getEnableRecordPage() && (interfaceC20597015iiLIZJ = C20622515mp.LIZJ(getActivity())) != null) {
                interfaceC20597015iiLIZJ.ac(null);
            }
            if (!LiveBroadcastReuseSurfaceView.getEnableIndependentPage()) {
                C19EG activity2 = getActivity();
                if ((activity2 instanceof LiveMultiTabWrapperActivity) && (liveMultiTabWrapperActivity = (LiveMultiTabWrapperActivity) activity2) != null) {
                    liveMultiTabWrapperActivity.LLLJIL();
                }
            }
        }
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (Build.VERSION.SDK_INT >= 35) {
            C14K9.LJIJJ(view, new C0TVI() { // from class: X.14Dy
                @Override // X.C0TVI
                public final C20246014Ju onApplyWindowInsets(View view2, C20246014Ju c20246014Ju) {
                    C20244914Jj c20244914JjLIZ = c20246014Ju.LIZ(7);
                    view2.setPadding(c20244914JjLIZ.LIZ, 0, c20244914JjLIZ.LIZJ, c20244914JjLIZ.LIZLLL);
                    return c20246014Ju;
                }
            });
        }
    }

    public final void qS(SurfaceView surfaceView, boolean z) {
        FrameLayout frameLayout;
        boolean z2;
        View viewLJLLLL;
        ViewStub viewStub;
        if (!z && this.LLJJJIL != null) {
            return;
        }
        if (getView() == null && this.LLJLLL == null) {
            return;
        }
        View view = getView();
        if (view == null) {
            view = this.LLJLLL;
        }
        SurfaceView surfaceView2 = null;
        if (view != null) {
            frameLayout = (FrameLayout) view.findViewById(R.id.cgg);
        } else {
            frameLayout = null;
        }
        if ((!LiveBroadcastReuseSurfaceView.getEnable() && this.LLLFZ == null) || surfaceView == null) {
            if (this.LLLI == null) {
                if (frameLayout != null && (viewStub = (ViewStub) frameLayout.findViewById(R.id.wqb)) != null) {
                    viewLJLLLL = C786410Ut5.LJLLLL(viewStub);
                } else {
                    viewLJLLLL = null;
                }
                this.LLLI = viewLJLLLL;
            }
            View view2 = this.LLLI;
            if (view2 != null) {
                surfaceView2 = (SurfaceView) view2.findViewById(R.id.j3a);
            }
            this.LLLFZ = surfaceView2;
            C500260Jjc.LJIILIIL(surfaceView2);
        }
        C774890UaV c774890UaV = new C774890UaV();
        this.LLJJJIL = c774890UaV;
        if (frameLayout != null) {
            if (surfaceView == null) {
                surfaceView = this.LLLFZ;
                z2 = false;
            } else {
                z2 = true;
            }
            c774890UaV.LIZ(frameLayout, surfaceView, z2);
        }
    }

    public final void uS(String str, boolean z) {
        String str2;
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        Room room = (Room) dataChannelGlobal.gg0(C930940aKi.class);
        if (this.LLJJJJLIIL) {
            room = (Room) dataChannelGlobal.gg0(C930930aKh.class);
        }
        if (room == null) {
            return;
        }
        boolean z2 = this.LLJL;
        String str3 = "swtich_backstage";
        if (z2) {
            str2 = "start_live";
        } else if (!this.LLJJLIIIJLLLLLLLZ) {
            str2 = "swtich_backstage";
        } else {
            str2 = "manual_pause";
        }
        if (this.LLJLIL) {
            str3 = "before_end";
        } else if (z2) {
            str3 = "start_live";
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ(str);
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(Long.valueOf(room.getOwnerUserId()), "anchor_id");
        c474500IjALIZ.LJJII(room.getIdStr(), "room_id");
        c474500IjALIZ.LJJII(str2, "switch_type");
        c474500IjALIZ.LJJII(str3, "reminder_show_time");
        c474500IjALIZ.LJJII(room.getStreamType().logStreamingType, "live_type");
        if (z) {
            c474500IjALIZ.LJJII("backtolive_reminder", "enter_from");
        }
        c474500IjALIZ.LIZ();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2;
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.dbk, viewGroup, false);
        this.LLJLLL = viewTd;
        C19GS c19gs = null;
        if (viewTd instanceof ViewGroup) {
            viewGroup2 = (ViewGroup) viewTd;
        } else {
            viewGroup2 = null;
        }
        this.LLJZ = viewGroup2;
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

    @Override // androidx.fragment.app.SAFTikTokFragment, X.InterfaceC214902198i
    public final boolean onResult(int i, int i2, Intent intent) {
        Iterator<InterfaceC484050IyZ> it2 = this.LLJJJ.iterator();
        while (it2.hasNext()) {
            if (it2.next().onActivityResult(i, i2, intent)) {
                return true;
            }
        }
        return super.onResult(i, i2, intent);
    }
}
