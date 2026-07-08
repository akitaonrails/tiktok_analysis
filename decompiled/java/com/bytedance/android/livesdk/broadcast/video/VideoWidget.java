package com.bytedance.android.livesdk.broadcast.video;

import X.AbstractC1273900jFs;
import X.AnonymousClass0956;
import X.C0IJT;
import X.C0J1N;
import X.C0U3P;
import X.C0U3Q;
import X.C0U4R;
import X.C0U6C;
import X.C0U79;
import X.C0U86;
import X.C0UAL;
import X.C0UD4;
import X.C0UDP;
import X.C0UFI;
import X.C0UFT;
import X.C0UG2;
import X.C0UG3;
import X.C0UGO;
import X.C0UGW;
import X.C0UGX;
import X.C0UGY;
import X.C0UH0;
import X.C0UH1;
import X.C0UHA;
import X.C0UHE;
import X.C0UVE;
import X.C0UX6;
import X.C0VSJ;
import X.C1161920gLG;
import X.C11JL;
import X.C11LS;
import X.C11NJ;
import X.C11RD;
import X.C1274030jG5;
import X.C1275030jHh;
import X.C1286510jaD;
import X.C1548820qPI;
import X.C192400oc;
import X.C19EG;
import X.C20441214yg;
import X.C21656719pF;
import X.C2252331DDr;
import X.C262100zr;
import X.C465900IOu;
import X.C474500IjA;
import X.C500260Jjc;
import X.C760500TsO;
import X.C761830TuX;
import X.C766270U4b;
import X.C768460UCm;
import X.C768740UDo;
import X.C768990UEn;
import X.C769010UEp;
import X.C769030UEr;
import X.C769040UEs;
import X.C769050UEt;
import X.C769200UFi;
import X.C769360UFy;
import X.C769380UGa;
import X.C769430UGf;
import X.C769440UGg;
import X.C769540UGq;
import X.C771670UOv;
import X.C773340UVg;
import X.C775900Uc8;
import X.C781270Ukn;
import X.C781930Ulr;
import X.C784440Upu;
import X.C786110Usb;
import X.C930750aKP;
import X.C930780aKS;
import X.C930950aKj;
import X.C930960aKk;
import X.C931040aKs;
import X.EnumC1102750enp;
import X.EnumC754620Tiu;
import X.EnumC775910Uc9;
import X.InterfaceC1107590evd;
import X.InterfaceC1141530foN;
import X.InterfaceC1268640j7O;
import X.InterfaceC1273910jFt;
import X.InterfaceC754220TiG;
import X.InterfaceC768780UDs;
import X.InterfaceC768930UEh;
import X.InterfaceC769170UFf;
import X.InterfaceC769400UGc;
import X.InterfaceC769460UGi;
import X.InterfaceC769510UGn;
import X.InterfaceC769620UGy;
import X.InterfaceC769940UIe;
import X.InterfaceC772190UQv;
import X.InterfaceC775310UbB;
import Y.AfS181S0100000_12;
import android.os.Message;
import android.view.SurfaceView;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.effect.api.EffectRedDotStatusChangeEvent;
import com.bytedance.android.live.effect.api.FaceDetectEnabledEvent;
import com.bytedance.android.live.effect.api.FaceDetectEvent;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.gift.GiftService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.uikit.reddot.RedDotExtensionKt;
import com.bytedance.android.live.usermanage.IUserManageService;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.broadcast.RestartLiveChannel;
import com.bytedance.android.livesdk.dataChannel.BGMInitDataChannel;
import com.bytedance.android.livesdk.dataChannel.ECLiveStatusChangeChannel;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.TtlsLiveProductNumber;
import com.bytedance.android.livesdk.effect.StickerImageUploader;
import com.bytedance.android.livesdk.livesetting.broadcast.AnchorReuseCameraCaptureABSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBGMSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastForceUploadVideoImageSetting;
import com.bytedance.android.livesdk.livesetting.effect.LiveEffectFaceDetectAllowlistSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicFixCameraTurnOn;
import com.bytedance.android.livesdk.livesetting.performance.LiveGoal2GreenScreenSetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.StreamUrlExtra;
import com.bytedance.android.livesdkapi.host.IHostCommerce;
import com.bytedance.android.livesdkapi.host.IHostCreativeTool;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import com.ss.ttlivestreamer.core.opengl.GlUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public class VideoWidget extends LiveWidget implements InterfaceC754220TiG, C0UH0, WeakHandler.IHandler, C0UHE, InterfaceC1141530foN {
    public static final /* synthetic */ int LLLIZZ = 0;
    public boolean LLILZ;
    public final InterfaceC769940UIe LLILZIL;
    public final InterfaceC1268640j7O LLILZLL;
    public InterfaceC769170UFf LLIZ;
    public final C0UGO LLIZLLLIL;
    public SurfaceView LLJ;
    public View LLJIJIL;
    public View LLJILJIL;
    public C0UHA LLJILJILJ;
    public final StreamUrlExtra LLJJI;
    public Room LLJJIJI;
    public C0UGX LLJJIJIIJIL;
    public volatile boolean LLJJJ;
    public long LLJJJIL;
    public boolean LLJJJJ;
    public FragmentManager LLJJLIIIJLLLLLLLZ;
    public C0UH1 LLJLIL;
    public C1286510jaD LLJLILLLLZIIL;
    public C21656719pF LLJLL;
    public LiveEffect LLJLLIL;
    public InterfaceC768930UEh LLJZ;
    public C19EG LLJZIJLIL;
    public C0UAL LLL;
    public LiveDialogFragment LLLF;
    public C769050UEt LLLFF;
    public C0UDP LLLFFI;
    public boolean LLLI;
    public C781930Ulr LLLII;
    public final InterfaceC769620UGy LLLIIII;
    public C192400oc LLLIIIIL;
    public InterfaceC769510UGn LLLIIIL;
    public final Float LL = Float.valueOf(0.34f);
    public final Float LLILLJJLI = Float.valueOf(1.0f);
    public boolean LLILLL = false;
    public boolean LLJI = false;
    public Boolean LLJILLL = Boolean.FALSE;
    public final InterfaceC769400UGc LLJJ = C781270Ukn.LJII().createStickerGiftEffectManager("VideoWidget", false);
    public boolean LLJJIII = true;
    public final WeakHandler LLJJIJIL = new WeakHandler(this);
    public final Map<String, Runnable> LLJJJJJIL = new HashMap();
    public final C769430UGf LLJJJJLIIL = new C769430UGf(this);
    public final C769440UGg LLJJL = new C769440UGg(this);
    public boolean LLJL = false;
    public boolean LLJLLL = false;
    public int LLLFZ = 100;
    public boolean LLLIIL = false;
    public final C760500TsO LLLIILIL = new C0U86() { // from class: X.0TsO
        @Override // X.C0U86
        public final void LIZ(LiveEffect liveEffect, String str, boolean z) {
            if (C0UD4.LIZ.equals(str) && z && liveEffect != null) {
                C474500IjA c474500IjALIZ = C0IJT.LIZ("live_take_gesture_select");
                c474500IjALIZ.LJIJJLI(this.LIZ.dataChannel);
                c474500IjALIZ.LJIIJJI("live_take");
                c474500IjALIZ.LJIILL("click");
                c474500IjALIZ.LJJII(Long.valueOf(liveEffect.getEffectId()), "gesture_id");
                c474500IjALIZ.LIZ();
            }
            Map<String, Map<String, LiveEffect>> mapJr = C768460UCm.LIZIZ().jr();
            String str2 = C0UD4.LIZIZ;
            if (mapJr.containsKey(str2) && mapJr.get(str2).size() > 0) {
                this.LIZ.LLJJJ = true;
            } else {
                this.LIZ.LLJJJ = false;
                this.LIZ.LLJJIJIL.removeMessages(101);
                DataChannel dataChannel = this.LIZ.dataChannel;
                if (dataChannel != null) {
                    dataChannel.LC0(FaceDetectEvent.class, Boolean.FALSE);
                }
            }
            this.LIZ.G1(liveEffect, z);
            if (!z) {
                ((IHostCommerce) C1161920gLG.LIZJ(IHostCommerce.class)).nj(Long.valueOf(this.LIZ.x1()));
            }
        }
    };
    public final C0UG3 LLLIL = new C0UG2() { // from class: X.0UG3
        @Override // X.C0UG2
        public final void LIZIZ() {
        }
    };
    public C786110Usb LLLILZ = null;
    public C0UGW LLLILZJ = null;
    public final C768990UEn LLLILZLLLI = new C768990UEn(this);

    public final void C1() {
        this.LLILLL = false;
        Iterator it2 = ((HashMap) this.LLJJJJJIL).values().iterator();
        while (it2.hasNext()) {
            this.LLJJIJIL.removeCallbacks((Runnable) it2.next());
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("pm_live_gesture_use");
        c474500IjALIZ.LJIJJLI(this.dataChannel);
        c474500IjALIZ.LJIIJJI("live_take");
        c474500IjALIZ.LJIILL("other");
        c474500IjALIZ.LJIILJJIL("live_take_detail");
        c474500IjALIZ.LJJII("unused", "use_status");
        c474500IjALIZ.LIZ();
        C1286510jaD c1286510jaD = this.LLJLILLLLZIIL;
        if (c1286510jaD != null) {
            c1286510jaD.LJIIJ = 0L;
            c1286510jaD.LIZLLL();
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public final boolean enablePacedLoad() {
        return false;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void B1() {
        if (this.LLLFF == null && this.dataChannel != null && (this.LLILZIL instanceof InterfaceC768780UDs)) {
            this.LLLFF = new C769050UEt(this.dataChannel, this.LLJ, (InterfaceC768780UDs) this.LLILZIL);
        }
    }

    @Override // X.InterfaceC754220TiG
    public final InterfaceC1273910jFt getLiveCore() {
        return this.LLILZIL.getLiveCore();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        if (this.LLILZ) {
            return;
        }
        InterfaceC769510UGn interfaceC769510UGn = this.LLLIIIL;
        boolean z = false;
        if (interfaceC769510UGn != null) {
            interfaceC769510UGn.LIZIZ(false, true);
        }
        AnonymousClass0956 anonymousClass0956 = C769380UGa.LJ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        AnonymousClass0956 anonymousClass09562 = C769380UGa.LJIIIZ;
        if (anonymousClass09562 != null) {
            anonymousClass09562.LIZIZ(null);
        }
        C769380UGa.LIZ = false;
        C769380UGa.LIZIZ = true;
        C769380UGa.LJFF = -1;
        C769380UGa.LJI = false;
        C769380UGa.LJIIJ = null;
        ((ArrayList) C769380UGa.LIZJ).clear();
        ((ArrayList) C769380UGa.LJII).clear();
        this.LLILZ = true;
        C1548820qPI.LJIIIIZZ("live_goal_update_event", this);
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        dataChannelGlobal.zQ2(this);
        if (this.LLJJJJ) {
            dataChannelGlobal.JQ2(C930750aKP.class, Boolean.valueOf(this.LLJJIII));
        } else if (dataChannelGlobal.gg0(RestartLiveChannel.class) == null) {
            C769540UGq.LIZ = 500;
            C769540UGq.LIZIZ = false;
            C769540UGq.LIZJ = false;
            dataChannelGlobal.IQ2(C930750aKP.class);
        }
        C769430UGf c769430UGf = this.LLJJJJLIIL;
        c769430UGf.getClass();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("pm_live_mirror_use");
        c474500IjALIZ.LJIIJJI("live_take");
        c474500IjALIZ.LJIILJJIL("live_take_detail");
        c474500IjALIZ.LJJII(Long.valueOf(c769430UGf.LLILZIL.LLJJIJI.getId()), "room_id");
        c474500IjALIZ.LJJII(Long.valueOf(c769430UGf.LLILZIL.LLJJIJI.getOwnerUserId()), "anchor_id");
        c474500IjALIZ.LJJII(Integer.valueOf(c769430UGf.LLILZIL.LLJJIII ? 1 : 0), "is_open");
        c474500IjALIZ.LJJII(c769430UGf.LL ? "front" : "back", "camera_type");
        c474500IjALIZ.LIZ();
        C769200UFi.LIZJ = null;
        ((C0U79) C768460UCm.LJ()).LIZ(this.dataChannel);
        C781270Ukn.LJI().releasePanelResource(true);
        C781270Ukn.LJI().releaseBgPanelResource();
        C781270Ukn.LJI().releaseBgApplyManager();
        ((IHostCreativeTool) C1161920gLG.LIZJ(IHostCreativeTool.class)).K42();
        ((IHostCreativeTool) C1161920gLG.LIZJ(IHostCreativeTool.class)).releaseGalleryModule();
        if (LiveGoal2GreenScreenSetting.INSTANCE.getEnable()) {
            ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveGoalEffectHelper().getClass();
            C0UFI.LIZJ = null;
        }
        if (this.LLILLL) {
            C1();
        }
        this.LLIZ = null;
        C781270Ukn.LJI().stickerPresenter().onDestroy();
        C781270Ukn.LJI().destroyEffectPalletHandler();
        C768460UCm.LIZIZ().vr(null);
        C768460UCm.LIZIZ().nr(null);
        C768460UCm.LIZIZ().tr(this.LLLIILIL);
        C768460UCm.LIZIZ().Br(this.LLLIL);
        if (!C500260Jjc.LJJJIL(this.dataChannel)) {
            C768460UCm.LIZIZ().release();
        }
        if (this.LLJJJJ && AnchorReuseCameraCaptureABSetting.enable() && ((Boolean) dataChannelGlobal.gg0(C930780aKS.class)).booleanValue()) {
            z = true;
        } else {
            this.LLJILJILJ.LJIIZILJ(CertProviderManagerKt.findCert("bpea-434", 1476788483));
        }
        this.LLJILJILJ.LJIILL(this.LLJJIJIIJIL);
        C0UHA c0uha = this.LLJILJILJ;
        if (c0uha != null) {
            c0uha.LJIIL(this);
        }
        this.LLJJ.onDestroy();
        GiftService.LLILLJJLI.getGiftPreDownloadService().release();
        if (!z) {
            GlUtil.nativeDetachThreadToOpenGl();
        }
        this.LLJJIJIL.removeCallbacksAndMessages(null);
        C0UH1 c0uh1 = this.LLJLIL;
        if (c0uh1 != null) {
            C20441214yg.LIZIZ("CaptureVideoUploadController", "stop");
            if (!((C11NJ) c0uh1.LJI.getValue()).LLILLJJLI) {
                ((C11NJ) c0uh1.LJI.getValue()).dispose();
            }
            try {
                new C0VSJ((String) c0uh1.LJ.getValue()).delete();
                new C0VSJ((String) c0uh1.LJFF.getValue()).delete();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C20441214yg.LJI("CaptureVideoUploadController", th);
            }
            this.LLJLIL = null;
        }
        StickerImageUploader stickerImageUploader = C769030UEr.LIZ;
        C11LS c11ls = stickerImageUploader.LIZIZ;
        if (c11ls != null && !c11ls.isDisposed()) {
            stickerImageUploader.LIZIZ.dispose();
        }
        C11JL c11jl = stickerImageUploader.LIZ;
        if (c11jl != null && !c11jl.isDisposed()) {
            stickerImageUploader.LIZ.dispose();
        }
        stickerImageUploader.LIZLLL.LIZ.clear();
        if (!z) {
            C0UFT.LJIIIIZZ = null;
            C0UFT.LJIIIZ = null;
            C0UFT.LJFF = true;
        }
        C0UAL c0ual = this.LLL;
        if (c0ual != null) {
            ((C768740UDo) c0ual).LIZIZ();
        }
        this.LLLF = null;
        this.LLJZIJLIL = null;
        super.onDestroy();
    }

    public final long x1() {
        Room room = this.LLJJIJI;
        if (room != null) {
            return room.getId();
        }
        return 0L;
    }

    public final EnumC754620Tiu y1() {
        Object obj = LiveMode.VIDEO;
        DataChannel dataChannel = this.dataChannel;
        LiveMode liveMode = dataChannel != null ? (LiveMode) dataChannel.gg0(LiveModeChannel.class) : obj;
        return (liveMode == null || liveMode.equals(obj)) ? EnumC754620Tiu.VIDEO : liveMode.equals(LiveMode.THIRD_PARTY) ? EnumC754620Tiu.OBS : liveMode.equals(LiveMode.SCREEN_RECORD) ? EnumC754620Tiu.GAME : liveMode.equals(LiveMode.LIVE_VOICE) ? EnumC754620Tiu.VOICE : EnumC754620Tiu.VIDEO;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.SurfaceView z1() {
        /*
            r3 = this;
            android.view.SurfaceView r0 = r3.LLJ
            if (r0 == 0) goto L5
            return r0
        L5:
            boolean r0 = X.C769530UGp.LIZ
            r1 = 0
            if (r0 == 0) goto L53
            X.0eep r0 = r3.widgetCallback
            androidx.fragment.app.Fragment r0 = r0.getFragment()
            androidx.fragment.app.Fragment r2 = X.C520010KaN.LJII(r0)
            boolean r0 = r2 instanceof X.InterfaceC773120UUk
            if (r0 == 0) goto L3c
            X.0UUk r2 = (X.InterfaceC773120UUk) r2
        L1a:
            if (r2 == 0) goto L2c
            android.view.SurfaceView r1 = r2.fI()
            android.view.View r0 = r2.on()
            r3.LLJIJIL = r0
            android.view.View r0 = r2.ai()
            r3.LLJILJIL = r0
        L2c:
            r3.LLJ = r1
            r0 = 1
            r3.LLJI = r0
            boolean r0 = X.C504210Jpz.LIZ
            if (r0 != 0) goto L3b
            if (r1 == 0) goto L3b
            r0 = 0
            X.C786410Ut5.LLIIII(r1, r0)
        L3b:
            return r1
        L3c:
            X.19EG r0 = r3.LLJZIJLIL
            if (r0 != 0) goto L48
            android.content.Context r0 = r3.context
            X.19EG r0 = X.C500260Jjc.LIZ(r0)
            r3.LLJZIJLIL = r0
        L48:
            X.19EG r2 = r3.LLJZIJLIL
            r3.LLJZIJLIL = r2
            boolean r0 = r2 instanceof X.InterfaceC773120UUk
            if (r0 == 0) goto L2c
            X.0UUk r2 = (X.InterfaceC773120UUk) r2
            goto L1a
        L53:
            X.19EG r0 = r3.LLJZIJLIL
            if (r0 != 0) goto L5f
            android.content.Context r0 = r3.context
            X.19EG r0 = X.C500260Jjc.LIZ(r0)
            r3.LLJZIJLIL = r0
        L5f:
            X.19EG r2 = r3.LLJZIJLIL
            r3.LLJZIJLIL = r2
            boolean r0 = r2 instanceof X.InterfaceC773120UUk
            if (r0 == 0) goto L2c
            X.0UUk r2 = (X.InterfaceC773120UUk) r2
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.broadcast.video.VideoWidget.z1():android.view.SurfaceView");
    }

    @Override // com.bytedance.android.widget.Widget
    public final View getView() {
        return z1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0710  */
    /* JADX WARN: Type inference failed for: r1v5, types: [X.0UGX, X.0jDh] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate() {
        /*
            Method dump skipped, instruction units count: 1863
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.broadcast.video.VideoWidget.onCreate():void");
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onPause() {
        super.onPause();
        C1286510jaD c1286510jaD = this.LLJLILLLLZIIL;
        if (c1286510jaD != null) {
            c1286510jaD.LIZ();
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onResume() {
        super.onResume();
        if (this.LLJILJILJ != null && ((Boolean) DataChannelGlobal.LLILZ.gg0(C930780aKS.class)).booleanValue() && this.LLLI) {
            this.LLLI = false;
            if (!AnchorReuseCameraCaptureABSetting.enable()) {
                this.LLJILJILJ.LJIILIIL(CertProviderManagerKt.findCert("bpea-805", 1476788233), true);
            }
        }
        this.LLJJ.onResume();
        C1286510jaD c1286510jaD = this.LLJLILLLLZIIL;
        if (c1286510jaD != null) {
            c1286510jaD.LIZIZ(this.LLJJIJI.effectFrameUploadDemotion == 1);
        }
    }

    public final void A1(C0UGY c0ugy) {
        C781930Ulr c781930Ulr;
        C0UHA c0uha;
        if (C0UVE.LIZ() && (c781930Ulr = this.LLLII) != null && (!c781930Ulr.LLIZ) && (c0uha = this.LLJILJILJ) != null) {
            C0UVE.LIZIZ = false;
            C0UGY c0ugy2 = C0UGY.ENTER_FOREGROUND;
            if (c0ugy == c0ugy2 || c0ugy == C0UGY.CAMERA_DISCONNECTED || c0ugy == C0UGY.SCREEN_OFF || c0ugy == C0UGY.PLAYING_NO_OVER_LAY_PERMISSION) {
                SurfaceView surfaceViewZ1 = z1();
                if (surfaceViewZ1 != null) {
                    c0uha.LLIZ.C3(surfaceViewZ1);
                }
                if (C0UVE.LIZJ) {
                    C0UVE.LIZJ = false;
                }
                InterfaceC769620UGy interfaceC769620UGy = this.LLLIIII;
                if (interfaceC769620UGy != null && c0ugy != c0ugy2) {
                    interfaceC769620UGy.LIZ();
                }
            }
            this.LLLII.LIZIZ(false, c0ugy);
        }
    }

    public final <T> void E1(Class<T> cls) {
        ((C0J1N) C784440Upu.LIZ().LJ(cls).LIZJ(C11RD.LJ(this))).LIZJ(new AfS181S0100000_12(this, 249));
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        boolean z;
        boolean z2;
        if (isViewValid() && message.what == 101) {
            Map<String, Map<String, LiveEffect>> mapJr = C768460UCm.LIZIZ().jr();
            String str = C0UD4.LIZIZ;
            boolean z3 = false;
            if (mapJr.containsKey(str) && !mapJr.get(str).isEmpty()) {
                ArrayList<LiveEffect> arrayList = new ArrayList(mapJr.get(str).values());
                HashSet hashSet = new HashSet();
                for (LiveEffect liveEffect : arrayList) {
                    if (!liveEffect.LLJJ().isEmpty()) {
                        hashSet.addAll(liveEffect.LLJJ());
                    }
                }
                Iterator it2 = hashSet.iterator();
                z = false;
                while (true) {
                    if (it2.hasNext()) {
                        String str2 = (String) it2.next();
                        if (z) {
                            break;
                        }
                        String[] allowlist = LiveEffectFaceDetectAllowlistSetting.INSTANCE.getALLOWLIST();
                        int length = allowlist.length;
                        int i = 0;
                        while (true) {
                            if (i >= length) {
                                break;
                            }
                            if (str2.contains(allowlist[i])) {
                                z = true;
                                break;
                            }
                            i++;
                        }
                    } else if (!z) {
                        DataChannel dataChannel = this.dataChannel;
                        Boolean bool = Boolean.FALSE;
                        dataChannel.LC0(FaceDetectEvent.class, bool);
                        this.dataChannel.LC0(FaceDetectEnabledEvent.class, bool);
                    }
                }
            } else {
                z = false;
            }
            if (!this.LLLIIL && z) {
                DataChannel dataChannel2 = this.dataChannel;
                if ((HandlerHook.getMessageObj(message.obj) instanceof Integer) && ((Integer) HandlerHook.getMessageObj(message.obj)).intValue() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                dataChannel2.LC0(FaceDetectEvent.class, Boolean.valueOf(z2));
            }
            if (C769380UGa.LIZ) {
                if ((HandlerHook.getMessageObj(message.obj) instanceof Integer) && ((Integer) HandlerHook.getMessageObj(message.obj)).intValue() <= 0) {
                    z3 = true;
                }
                C769380UGa.LIZIZ = z3;
            }
        }
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        InterfaceC1107590evd interfaceC1107590evd;
        if (!c262100zr.LIZ.equals("live_goal_update_event") || (interfaceC1107590evd = c262100zr.LIZIZ) == null) {
            return;
        }
        C0U6C liveGoalEffectHelper = ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveGoalEffectHelper();
        if (interfaceC1107590evd.hasKey("isQuit") && interfaceC1107590evd.getBoolean("isQuit")) {
            ((C0UFI) liveGoalEffectHelper).LJIILLIIL();
            return;
        }
        if (interfaceC1107590evd.hasKey("live_goal_background_position") && interfaceC1107590evd.getInt("live_goal_background_position") == 0) {
            ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveGameEffectHelper().getClass();
            if (C769040UEs.LIZLLL) {
                C769040UEs.LIZJ = null;
            }
            ((C0UFI) liveGoalEffectHelper).LJIIJJI();
        } else {
            C0UFI.LJJIFFI();
            C0UFI.LJJI();
        }
        liveGoalEffectHelper.getClass();
        C0UFI.LJ = null;
    }

    public void onEvent(C465900IOu c465900IOu) {
        boolean z;
        int i = c465900IOu.LIZ;
        if (i != 2) {
            if (i != 40) {
                if (i == 41) {
                    this.LLJILJILJ.LJIILIIL(CertProviderManagerKt.findCert("certBpea805", 1476788483), false);
                    this.dataChannel.LC0(FaceDetectEnabledEvent.class, Boolean.FALSE);
                    return;
                }
                return;
            }
            if (LinkMicFixCameraTurnOn.INSTANCE.enable()) {
                this.LLJILJILJ.LIZ();
            }
            this.LLJILJILJ.LJIILIIL(CertProviderManagerKt.findCert("bpea-805", 1476788233), true);
            this.dataChannel.LC0(FaceDetectEnabledEvent.class, Boolean.TRUE);
            return;
        }
        this.LLJILJILJ.LJIIJ(CertProviderManagerKt.findCert("bpea-377", 1476788233));
        if (InterfaceC772190UQv.c3.LIZ().intValue() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (!this.LLJJIII) {
            this.LLJILJILJ.LLIZ.s3(false);
        }
        C769430UGf c769430UGf = this.LLJJJJLIIL;
        c769430UGf.LL = z;
        c769430UGf.LJ(true);
    }

    public final void G1(LiveEffect liveEffect, boolean z) {
        boolean z2;
        if (this.LLJLILLLLZIIL != null) {
            if ((liveEffect != null && liveEffect.LJJJI()) || LiveBroadcastForceUploadVideoImageSetting.INSTANCE.isEnable()) {
                if (z) {
                    C1286510jaD c1286510jaD = this.LLJLILLLLZIIL;
                    InterfaceC769940UIe interfaceC769940UIe = this.LLILZIL;
                    long id = this.LLJJIJI.getId();
                    if (this.LLJJIJI.effectFrameUploadDemotion == 1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    c1286510jaD.LIZJ(interfaceC769940UIe, id, z2);
                    return;
                }
                this.LLJLILLLLZIIL.LIZLLL();
            }
        }
    }

    @Override // X.InterfaceC754220TiG
    public final C1274030jG5 i3(C1275030jHh c1275030jHh, InterfaceC775310UbB interfaceC775310UbB) {
        return this.LLILZIL.i3(c1275030jHh, interfaceC775310UbB);
    }

    public static void D1(DataChannel dataChannel, InterfaceC769460UGi interfaceC769460UGi, boolean z) {
        String strValueOf;
        C769360UFy c769360UFyLJI;
        Boolean bool = (Boolean) dataChannel.gg0(ECLiveStatusChangeChannel.class);
        Integer num = (Integer) dataChannel.gg0(TtlsLiveProductNumber.class);
        if ((bool != null && bool.booleanValue()) || (num != null && num.intValue() > 0)) {
            HashMap map = new HashMap();
            map.put("extra", "ecom");
            C0U4R c0u4r = new C0U4R();
            c0u4r.LIZLLL = 2131842667;
            c0u4r.LJI = map;
            c0u4r.LJFF = true;
            c0u4r.LJII = dataChannel;
            c0u4r.LIZJ = "pm_live_bgmusic_playlist_music_cannot_enter";
            C766270U4b.LJIIJ(c0u4r);
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_ksong_conflict_toast_show");
            c474500IjALIZ.LJIJJLI(dataChannel);
            c474500IjALIZ.LIZ();
            return;
        }
        C768460UCm.LJIIIIZZ();
        if (C761830TuX.LIZJ()) {
            C766270U4b.LIZLLL(2131842672);
            return;
        }
        ConcurrentHashSet<C0U3Q> concurrentHashSet = C0U3P.LIZ;
        if (C0U3P.LIZIZ(C0U3Q.KARAOKE)) {
            HashMap map2 = new HashMap();
            map2.put("extra", "karaoke");
            C0U4R c0u4r2 = new C0U4R();
            c0u4r2.LIZLLL = 2131840654;
            c0u4r2.LIZJ = "pm_mt_LIVEKaraoke_LIVEhostPage_musicKaraokeToast";
            c0u4r2.LJFF = true;
            c0u4r2.LJII = dataChannel;
            c0u4r2.LJI = map2;
            C766270U4b.LJIIJ(c0u4r2);
            return;
        }
        if (interfaceC769460UGi.LIZ() == null || dataChannel.gg0(BGMInitDataChannel.class) == Boolean.FALSE) {
            if (LiveBGMSetting.INSTANCE.inLiveBGMUpgrade()) {
                interfaceC769460UGi.LIZIZ(C781270Ukn.LJI().getLiveBGMDialog());
            } else {
                interfaceC769460UGi.LIZIZ(C781270Ukn.LJI().getLiveMusicDialog());
            }
        }
        Room room = (Room) dataChannel.gg0(RoomChannel.class);
        FragmentManager fragmentManager = interfaceC769460UGi.getFragmentManager();
        LiveDialogFragment liveDialogFragmentLIZ = interfaceC769460UGi.LIZ();
        if (fragmentManager != null && liveDialogFragmentLIZ != null) {
            liveDialogFragmentLIZ.show(fragmentManager, "MUSIC");
            if (room != null) {
                strValueOf = String.valueOf(room.getOwnerUserId());
            } else {
                strValueOf = "";
            }
            if (z) {
                C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_anchor_ksong_icon_click");
                c474500IjALIZ2.LJIJJLI(dataChannel);
                c474500IjALIZ2.LJJII(strValueOf, "anchor_id");
                c474500IjALIZ2.LJJII("decorate", "enter_from");
                if (C500260Jjc.LJJJIL(dataChannel) && (c769360UFyLJI = C771670UOv.LJI()) != null) {
                    c474500IjALIZ2.LJJII(c769360UFyLJI.LIZIZ, "click_type");
                    c769360UFyLJI.LIZIZ = "normal_click_icon";
                }
                c474500IjALIZ2.LIZ();
            }
            RedDotExtensionKt.LIZ(C0UX6.LIVE_BROADCAST_ENHANCE_BGM);
            EnumC1102750enp.MUSIC.setRedDotVisible(dataChannel, false);
            dataChannel.FQ2(EffectRedDotStatusChangeEvent.class);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0253  */
    /* JADX WARN: Type inference failed for: r4v26, types: [X.0UGx, java.lang.Object] */
    @Override // X.C0UHE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMessageReceived(final int r29, final int r30, final int r31, final java.lang.String r32) {
        /*
            Method dump skipped, instruction units count: 2144
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.broadcast.video.VideoWidget.onMessageReceived(int, int, int, java.lang.String):void");
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [X.0TsO] */
    /* JADX WARN: Type inference failed for: r0v13, types: [X.0UG3] */
    public VideoWidget(InterfaceC769170UFf interfaceC769170UFf, StreamUrlExtra streamUrlExtra, InterfaceC769940UIe interfaceC769940UIe, C0UGO c0ugo, C773340UVg c773340UVg) {
        this.LLLI = true;
        this.LLILZIL = interfaceC769940UIe;
        if (interfaceC769940UIe != null) {
            AbstractC1273900jFs liveCore = interfaceC769940UIe.getLiveCore();
            C2252331DDr c2252331DDr = C775900Uc8.LIZ;
            C775900Uc8.LIZLLL(EnumC775910Uc9.AV, true, new AwS591S0100000_12(liveCore, 30));
            this.LLILZLL = interfaceC769940UIe.LJIIL();
        }
        this.LLLIIII = c773340UVg;
        this.LLIZ = interfaceC769170UFf;
        this.LLJJI = streamUrlExtra;
        this.LLIZLLLIL = c0ugo;
        this.LLLI = true;
    }

    public final void F1(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Map<String, String> map) {
        String str;
        this.dataChannel.SX0(C769010UEp.class, Boolean.valueOf(z2));
        ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveStickerLogManager().LIZLLL(z2);
        ((IUserManageService) C1161920gLG.LIZJ(IUserManageService.class)).w60(x1(), this.dataChannel, 7, false, null);
        if (this.context != null && this.dataChannel != null) {
            C781270Ukn.LJI().showStickerPanel(this.context, this.dataChannel, z, this.LLLILZLLLI, z4, z5, z2, map);
        }
        if (z3) {
            if (C500260Jjc.LJJJIL(this.dataChannel)) {
                C769360UFy c769360UFyLJI = C771670UOv.LJI();
                str = c769360UFyLJI.LIZ;
                c769360UFyLJI.LIZ = "normal_click_icon";
            } else {
                str = "";
            }
            C474500IjA c474500IjALIZ = C0IJT.LIZ("pm_live_sticker_click");
            c474500IjALIZ.LJIJJLI(this.dataChannel);
            c474500IjALIZ.LJJII(Integer.valueOf(z2 ? 1 : 0), "is_new_anchor_guide");
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
            c474500IjALIZ.LJJII(dataChannelGlobal.gg0(C931040aKs.class), "enter_from");
            c474500IjALIZ.LJJII(dataChannelGlobal.gg0(C930950aKj.class), "banner_id");
            c474500IjALIZ.LJJII(dataChannelGlobal.gg0(C930960aKk.class), "banner_from");
            c474500IjALIZ.LJJII(0, "is_special_icon");
            c474500IjALIZ.LJJII(0, "is_animation");
            c474500IjALIZ.LJJII(((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).ry(), "link_id");
            c474500IjALIZ.LJJII(0, "is_same_effect_scene");
            c474500IjALIZ.LJJII(((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).getBroadcastScene(), Scene.SCENE_SERVICE);
            c474500IjALIZ.LJJII(str, "click_type");
            c474500IjALIZ.LJJIJL();
        }
    }
}
