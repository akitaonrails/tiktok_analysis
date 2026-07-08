package com.ss.android.ugc.aweme.live.sdk.chatroom.ui;

import X.AnonymousClass0956;
import X.C01GW;
import X.C0PEM;
import X.C0UD5;
import X.C0UF5;
import X.C0UF6;
import X.C0UHE;
import X.C0UJY;
import X.C0UKH;
import X.C0UPU;
import X.C1271250jBb;
import X.C1271270jBd;
import X.C1291830jin;
import X.C12IR;
import X.C1308910kAL;
import X.C1322110kVd;
import X.C1324570kZb;
import X.C1324720kZq;
import X.C13LE;
import X.C14EU;
import X.C14KS;
import X.C1664750tQH;
import X.C1664770tQJ;
import X.C19A3;
import X.C1ALZ;
import X.C1DFH;
import X.C1DRG;
import X.C20311414dk;
import X.C20328714gX;
import X.C2107308Nj;
import X.C21673119rt;
import X.C2177801ALa;
import X.C2177861ALg;
import X.C2217381BqS;
import X.C2296808zG;
import X.C23250099c;
import X.C259800zU;
import X.C337180DJs;
import X.C452501pT;
import X.C473410IhP;
import X.C497740JfY;
import X.C500260Jjc;
import X.C533930Kwp;
import X.C563400M7u;
import X.C565530MFz;
import X.C769220UFk;
import X.C775420UbM;
import X.C780090Uit;
import X.C780100Uiu;
import X.C782940UnU;
import X.C783950Up7;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1778840wOI;
import X.EnumC775440UbO;
import X.InterfaceC1324590kZd;
import X.InterfaceC1645720sva;
import X.InterfaceC1650190t2n;
import X.InterfaceC1650230t2r;
import X.InterfaceC2173471A4j;
import X.InterfaceC2177811ALb;
import X.InterfaceC2177821ALc;
import X.InterfaceC2177841ALe;
import X.InterfaceC2217461Bqa;
import X.InterfaceC379610EuV;
import X.InterfaceC497601wk;
import X.InterfaceC498680Jh4;
import X.InterfaceC770070UIr;
import X.InterfaceC770090UIt;
import X.InterfaceC770150UIz;
import X.InterfaceC771580UOm;
import X.InterfaceC775450UbP;
import X.InterfaceC782930UnT;
import X.SurfaceHolderCallbackC2177731AKt;
import X.SurfaceHolderCallbackC2177741AKu;
import Y.ARunnableS128S0100000_28;
import Y.ARunnableS131S0100000_31;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.OnLifecycleEvent;
import bck.u;
import com.bef.effectsdk.message.MessageCenter;
import com.bytedance.android.livesdk.dataChannel.BottomTagChangeEvent;
import com.bytedance.android.livesdk.dataChannel.MultiGuestFullScreenEvent;
import com.bytedance.android.livesdk.internal.Live;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkMicMgPreviewLivePageSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveBroadcastHostUseTTLH;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.live.sdk.chatroom.ui.TTLiveBroadcastView;
import com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS607S0100000_28;
import kotlin.jvm.internal.AwS610S0100000_31;
import org.greenrobot.eventbus.EventBus;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes34.dex */
public final class TTLiveBroadcastView implements InterfaceC379610EuV, C0UKH, GenericLifecycleObserver {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIL;
    public final Context LL;
    public final IRecordingOperationPanel LLILLJJLI;
    public final FrameLayout LLILLL;
    public final C19A3 LLILZ;
    public final C1DRG LLILZIL;
    public final C1664750tQH LLILZLL;
    public EnumC1778840wOI LLIZ;
    public final IRecordingOperationPanel LLIZLLLIL;
    public final FrameLayout LLJ;
    public C1322110kVd LLJI;
    public C21673119rt LLJIJIL;
    public InterfaceC782930UnT LLJILJIL;
    public PreviewWrapperFragment LLJILJILJ;
    public FragmentManager LLJILLL;
    public InterfaceC782930UnT LLJJ;
    public InterfaceC2177841ALe LLJJI;
    public boolean LLJJIII;
    public boolean LLJJIJI;
    public boolean LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public InterfaceC770090UIt LLJJJ;
    public InterfaceC770070UIr LLJJJIL;
    public final ConcurrentHashSet<C0UHE> LLJJJJ;
    public C0UJY LLJJJJJIL;
    public AnonymousClass0956 LLJJJJLIIL;
    public SurfaceHolderCallbackC2177731AKt LLJJL;
    public SurfaceHolderCallbackC2177741AKu LLJJLIIIJLLLLLLLZ;
    public InterfaceC1650190t2n LLJL;
    public boolean LLJLIL;
    public InterfaceC775450UbP LLJLILLLLZIIL;
    public boolean LLJLL;
    public C1324720kZq LLJLLIL;
    public View LLJLLL;
    public final C563400M7u LLJZ;
    public boolean LLJZIJLIL;
    public boolean LLL;
    public boolean LLLF;
    public boolean LLLFF;
    public final ARunnableS131S0100000_31 LLLFFI;
    public final C20328714gX LLLFZ;
    public String[] LLLI;
    public final C01GW LLLII;
    public final C01GW LLLIIII;
    public final C2177861ALg LLLIIIIL;
    public int LLLIIIL;
    public boolean LLLIIL;
    public final ARunnableS131S0100000_31 LLLIILIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TTLiveBroadcastView.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0);
        C13LE.LIZ.getClass();
        LLLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public final void LJIIJJI() {
        this.LLLF = false;
        LIZJ().St2().LJLJL(520, 924, new InterfaceC2173471A4j() { // from class: X.1ALV
            @Override // X.InterfaceC2173471A4j
            public final void LIZ(int i, Bitmap bitmap) {
                if (bitmap != null) {
                    C780100Uiu.LIZ = bitmap;
                }
                this.LIZ.LJIIL();
                this.LIZ.LLLF = true;
            }
        });
        C473410IhP.LIZJ(new ARunnableS128S0100000_28(this, 63), 100L);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
        } else if (event == Lifecycle.Event.ON_PAUSE) {
            onPause();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    public final InterfaceC1650230t2r LIZJ() {
        return (InterfaceC1650230t2r) this.LLILZLL.getValue(this, LLLIL[0]);
    }

    public final void LJ() {
        if (this.LLLFF) {
            LJIIIIZZ();
            return;
        }
        View view = this.LLJLLL;
        if (view == null || view.getVisibility() != 0) {
            if (this.LLJJIII || this.LLJZIJLIL) {
                View view2 = new View(this.LL);
                view2.setId(R.id.ytr);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                layoutParams.gravity = 17;
                C786410Ut5.W5(view2, layoutParams);
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.c95, view2.getContext());
                view2.setBackgroundColor(numLIZJ != null ? numLIZJ.intValue() : 0);
                this.LLJLLL = view2;
                FrameLayout frameLayout = this.LLILLL;
                if (frameLayout != null) {
                    frameLayout.addView(view2, 0);
                }
            }
        }
    }

    public final void LJFF() {
        InterfaceC497601wk interfaceC497601wkLIZ;
        SurfaceView surfaceViewLJIJJLI;
        if (this.LLJZ.LIZJ() != EnumC775440UbO.DEFAULT.getValue()) {
            return;
        }
        LJIIJJI();
        this.LLJJIJIL = true;
        IRecordingOperationPanel iRecordingOperationPanel = this.LLIZLLLIL;
        if (iRecordingOperationPanel != null) {
            iRecordingOperationPanel.closeCamera(C0UPU.LIZ());
        }
        if (C533930Kwp.LIZIZ(new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"})) {
            this.LLJZ.LJ(EnumC775440UbO.START_INIT.getValue());
            C1DRG c1drg = this.LLILZIL;
            this.LLJJL = c1drg != null ? (SurfaceHolderCallbackC2177731AKt) c1drg.LJII(SurfaceHolderCallbackC2177731AKt.class, null) : null;
            C1DRG c1drg2 = this.LLILZIL;
            SurfaceHolderCallbackC2177741AKu surfaceHolderCallbackC2177741AKu = c1drg2 != null ? (SurfaceHolderCallbackC2177741AKu) c1drg2.LJII(SurfaceHolderCallbackC2177741AKu.class, null) : null;
            this.LLJJLIIIJLLLLLLLZ = surfaceHolderCallbackC2177741AKu;
            if (surfaceHolderCallbackC2177741AKu != null && (surfaceViewLJIJJLI = surfaceHolderCallbackC2177741AKu.LJIJJLI()) != null) {
                C786410Ut5.LJLLLLLL(8, surfaceViewLJIJJLI);
            }
            Scene sceneLIZ = C565530MFz.LIZ(this.LLILZ);
            if (sceneLIZ == null || (interfaceC497601wkLIZ = LifecycleOwnerKt.getLifecycleScope(sceneLIZ)) == null) {
                C1DFH c1dfh = C0PEM.LIZ;
                interfaceC497601wkLIZ = C2296808zG.LIZ(C2107308Nj.LIZ);
            }
            C1DFH c1dfh2 = C0PEM.LIZ;
            this.LLJJJJLIIL = C23250099c.LIZLLL(interfaceC497601wkLIZ, C2107308Nj.LIZ, null, new C775420UbM(this, null), 2);
        }
    }

    public final void LJIIIIZZ() {
        View view;
        if (this.LLILZ.mViewDestroyed || (view = this.LLJLLL) == null) {
            return;
        }
        C337180DJs.LIZ(view);
    }

    public final void LJIIIZ() {
        C1324720kZq c1324720kZq;
        if (this.LLILZ.mViewDestroyed || (c1324720kZq = this.LLJLLIL) == null) {
            return;
        }
        c1324720kZq.setImageBitmap(null);
        C337180DJs.LIZ(c1324720kZq);
    }

    public final void LJIIL() {
        InterfaceC497601wk interfaceC497601wkLIZ;
        if (this.LLLF || this.LLJLL) {
            return;
        }
        Bitmap bitmap = C780100Uiu.LIZ;
        if (!C500260Jjc.LJJIFFI(bitmap != null ? Boolean.valueOf(bitmap.isRecycled()) : null)) {
            C1324570kZb.LJII(UserService.getInstance().user().LJIJJLI().getAvatarThumb(), C497740JfY.LJIIZILJ(), C497740JfY.LJIILLIIL(), new C1291830jin(C497740JfY.LJIIZILJ() / C497740JfY.LJIILLIIL()), new InterfaceC1324590kZd() { // from class: X.0Uis
                @Override // X.InterfaceC1324590kZd
                public final void onFailed() {
                }

                @Override // X.InterfaceC1324590kZd
                public final void LIZ(Bitmap bitmap2) {
                    if (bitmap2 != null && C500260Jjc.LJJIFFI(Boolean.valueOf(bitmap2.isRecycled()))) {
                        TTLiveBroadcastView tTLiveBroadcastView = this.LIZ;
                        if (tTLiveBroadcastView.LLJJIII || tTLiveBroadcastView.LLJZIJLIL) {
                            C1324720kZq c1324720kZq = tTLiveBroadcastView.LLJLLIL;
                            if (c1324720kZq != null) {
                                C500260Jjc.LLFFF(c1324720kZq);
                            }
                            C1324720kZq c1324720kZq2 = this.LIZ.LLJLLIL;
                            if (c1324720kZq2 != null) {
                                c1324720kZq2.setImageBitmap(bitmap2);
                            }
                        }
                    }
                }
            });
            return;
        }
        C259800zU c259800zU = new C259800zU();
        Scene sceneLIZ = C565530MFz.LIZ(this.LLILZ);
        if (sceneLIZ == null || (interfaceC497601wkLIZ = LifecycleOwnerKt.getLifecycleScope(sceneLIZ)) == null) {
            interfaceC497601wkLIZ = C2296808zG.LIZ(C0PEM.LIZJ);
        }
        C23250099c.LIZLLL(interfaceC497601wkLIZ, C0PEM.LIZJ, null, new C780090Uit(this, null, c259800zU), 2);
    }

    @Override // X.C0UKH
    public final void LJJIJLIJ() {
        if (this.LLJJIII) {
            C473410IhP.LJ(this.LLLIILIL);
            ARunnableS131S0100000_31 aRunnableS131S0100000_31 = this.LLLIILIL;
            C782940UnU.LIZ.getClass();
            C473410IhP.LIZJ(aRunnableS131S0100000_31, C782940UnU.LIZIZ() ? 100L : 500L);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00b2 A[PHI: r0
      0x00b2: PHI (r0v13 androidx.fragment.app.FragmentManager) = 
      (r0v15 androidx.fragment.app.FragmentManager)
      (r0v18 androidx.fragment.app.FragmentManager)
      (r0v24 androidx.fragment.app.FragmentManager)
      (r0v25 androidx.fragment.app.FragmentManager)
     binds: [B:54:0x00b0, B:63:0x00cf, B:67:0x00d9, B:52:0x00aa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b8  */
    @androidx.lifecycle.OnLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_DESTROY)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDestroy() {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.sdk.chatroom.ui.TTLiveBroadcastView.onDestroy():void");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
        InterfaceC2177841ALe interfaceC2177841ALe = this.LLJJI;
        if (interfaceC2177841ALe != null) {
            ((u) interfaceC2177841ALe).LJIIJ(false, false, false);
        }
    }

    public final SurfaceView LIZLLL() {
        SurfaceView surfaceViewLJIJJLI;
        SurfaceView surfaceViewLJIJJLI2;
        SurfaceView surfaceViewLJIJJLI3;
        if (LiveBroadcastHostUseTTLH.getEnable()) {
            C1DRG c1drg = this.LLILZIL;
            SurfaceHolderCallbackC2177741AKu surfaceHolderCallbackC2177741AKu = c1drg != null ? (SurfaceHolderCallbackC2177741AKu) c1drg.LJII(SurfaceHolderCallbackC2177741AKu.class, null) : null;
            this.LLJJLIIIJLLLLLLLZ = surfaceHolderCallbackC2177741AKu;
            if (surfaceHolderCallbackC2177741AKu != null) {
                return surfaceHolderCallbackC2177741AKu.LJIJJLI();
            }
            return null;
        }
        C1DRG c1drg2 = this.LLILZIL;
        SurfaceHolderCallbackC2177731AKt surfaceHolderCallbackC2177731AKt = c1drg2 != null ? (SurfaceHolderCallbackC2177731AKt) c1drg2.LJII(SurfaceHolderCallbackC2177731AKt.class, null) : null;
        this.LLJJL = surfaceHolderCallbackC2177731AKt;
        if (surfaceHolderCallbackC2177731AKt != null && (surfaceViewLJIJJLI3 = surfaceHolderCallbackC2177731AKt.LJIJJLI()) != null) {
            surfaceViewLJIJJLI3.setBackground(null);
        }
        SurfaceHolderCallbackC2177731AKt surfaceHolderCallbackC2177731AKt2 = this.LLJJL;
        if (surfaceHolderCallbackC2177731AKt2 != null && (surfaceViewLJIJJLI2 = surfaceHolderCallbackC2177731AKt2.LJIJJLI()) != null) {
            surfaceViewLJIJJLI2.setClipToOutline(false);
        }
        SurfaceHolderCallbackC2177731AKt surfaceHolderCallbackC2177731AKt3 = this.LLJJL;
        if (surfaceHolderCallbackC2177731AKt3 != null && (surfaceViewLJIJJLI = surfaceHolderCallbackC2177731AKt3.LJIJJLI()) != null) {
            surfaceViewLJIJJLI.setOutlineProvider(ViewOutlineProvider.BOUNDS);
        }
        SurfaceHolderCallbackC2177731AKt surfaceHolderCallbackC2177731AKt4 = this.LLJJL;
        if (surfaceHolderCallbackC2177731AKt4 != null) {
            return surfaceHolderCallbackC2177731AKt4.LJIJJLI();
        }
        return null;
    }

    public final SurfaceView LJII() {
        if (!LiveBroadcastHostUseTTLH.getEnable()) {
            return (SurfaceView) this.LLLIIII.getValue();
        }
        SurfaceHolderCallbackC2177741AKu surfaceHolderCallbackC2177741AKu = this.LLJJLIIIJLLLLLLLZ;
        if (surfaceHolderCallbackC2177741AKu != null) {
            return surfaceHolderCallbackC2177741AKu.LJIJJLI();
        }
        return null;
    }

    @Override // X.C0UKH
    public final void LLLJIL() {
        C337180DJs.LIZ(LJII());
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        C0UD5 c0ud5LJFF;
        SurfaceView surfaceView;
        if (!LiveBroadcastHostUseTTLH.getEnable() && LinkMicMgPreviewLivePageSetting.INSTANCE.showLayoutInPreviewLivePage() && this.LLJJIII) {
            View previewView = LIZJ().getPreviewView();
            if ((previewView instanceof SurfaceView) && (surfaceView = (SurfaceView) previewView) != null) {
                C786410Ut5.LLIIII(surfaceView, 4);
            }
            LIZJ().LJLJLLL(((SurfaceView) this.LLLIIII.getValue()).getHolder().getSurface());
        }
        if (this.LLJJIII && this.LLJJIJIIJIL && (c0ud5LJFF = C0UF5.LJFF()) != null) {
            c0ud5LJFF.LIZ = true;
        }
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLILZIL;
    }

    public static float LJIILIIL(float f) {
        return C814420VxA.LIZIZ(f * 100.0f) / 100.0f;
    }

    @Override // X.C0UKH
    public final void LJL(Boolean bool) {
        if (C500260Jjc.LJJIFFI(bool)) {
            LJIIIIZZ();
        }
    }

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
    @C14EU
    public final void onCameraReverse(C783950Up7 c783950Up7) {
        InterfaceC782930UnT interfaceC782930UnT;
        boolean z;
        if (this.LLJJIII && this.LLJJIJIIJIL && (interfaceC782930UnT = this.LLJILJIL) != null && interfaceC782930UnT.getCameraType() != (z = c783950Up7.LIZ)) {
            interfaceC782930UnT.Ad(z ? 1 : 0);
        }
    }

    public static Float LIZ(String str, JSONObject jSONObject) {
        if (jSONObject.has(str)) {
            JSONObject jSONObject2 = JSONObjectProtectorUtils.getJSONObject(jSONObject, str);
            if (jSONObject2.has("value")) {
                return Float.valueOf((float) JSONObjectProtectorUtils.getDouble(jSONObject2, "value"));
            }
            return null;
        }
        return null;
    }

    public static Integer LIZIZ(String str, JSONObject jSONObject) {
        if (jSONObject.has(str)) {
            JSONObject jSONObject2 = JSONObjectProtectorUtils.getJSONObject(jSONObject, str);
            if (jSONObject2.has("value")) {
                return Integer.valueOf(JSONObjectProtectorUtils.getInt(jSONObject2, "value"));
            }
            return null;
        }
        return null;
    }

    public final void LJIIJ(View view, boolean z) {
        float fLIZ;
        boolean z2;
        View viewLJII = view;
        C1271250jBb c1271250jBb = C1271270jBd.LIZ;
        if (c1271250jBb.LJFF(2)) {
            fLIZ = c1271250jBb.LIZLLL();
        } else {
            C769220UFk c769220UFk = C769220UFk.LIZ;
            int iLJI = C14KS.LJI(this.LL);
            int iLJ = C14KS.LJ(this.LL);
            c769220UFk.getClass();
            fLIZ = C769220UFk.LIZ(iLJI, iLJ);
        }
        C769220UFk c769220UFk2 = C769220UFk.LIZ;
        Context context = this.LL;
        if (viewLJII == null) {
            viewLJII = LJII();
        }
        C0UF6 c0uf6LIZJ = C0UF5.LIZJ();
        if (c0uf6LIZJ != null && c0uf6LIZJ.LIZ) {
            z2 = true;
        } else {
            z2 = false;
        }
        C769220UFk.LIZIZ(c769220UFk2, context, viewLJII, null, null, z2, fLIZ, false, z, 64);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.14gX] */
    /* JADX WARN: Type inference failed for: r1v7, types: [X.1ALZ, com.bef.effectsdk.message.MessageCenter$Listener] */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.1ALW] */
    /* JADX WARN: Type inference failed for: r2v4, types: [X.1ALX] */
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
    public TTLiveBroadcastView(Context context, IRecordingOperationPanel iRecordingOperationPanel, FrameLayout frameLayout, C19A3 c19a3, C1DRG c1drg) {
        InterfaceC2177841ALe interfaceC2177841ALeVideoRecorder;
        InterfaceC1650190t2n interfaceC1650190t2n;
        Lifecycle lifecycle;
        this.LL = context;
        this.LLILLJJLI = iRecordingOperationPanel;
        this.LLILLL = frameLayout;
        this.LLILZ = c19a3;
        this.LLILZIL = c1drg;
        this.LLILZLL = C1664770tQJ.LIZ(c1drg, InterfaceC1650230t2r.class, null);
        this.LLIZLLLIL = iRecordingOperationPanel;
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.LLJ = frameLayout2;
        this.LLJJJJ = new ConcurrentHashSet<>();
        this.LLJZ = new C563400M7u(EnumC775440UbO.DEFAULT.getValue());
        this.LLL = true;
        this.LLLFF = true;
        this.LLLFFI = new ARunnableS131S0100000_31(this, 77);
        this.LLLFZ = new InterfaceC771580UOm() { // from class: X.14gX
            @Override // X.InterfaceC771580UOm
            public final void LIZIZ() {
                this.LIZ.LLJJIJIIJIL = true;
            }
        };
        this.LLLII = C452501pT.LIZIZ(new AwS575S0100000_31(this, 768));
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS575S0100000_31(this, 767));
        this.LLLIIII = c01gwLIZIZ;
        this.LLLIIIIL = new C2177861ALg(this);
        this.LLLIILIL = new ARunnableS131S0100000_31(this, 78);
        Live.getService();
        EventBus.LIZLLL().LJIJJ(this);
        if (iRecordingOperationPanel != null && (lifecycle = iRecordingOperationPanel.getLifecycle()) != null) {
            lifecycle.addObserver(this);
        }
        C786410Ut5.LJZ(4, frameLayout2);
        frameLayout2.setId(R.id.mug);
        this.LLJIJIL = new C21673119rt(frameLayout2);
        this.LLJJ = Live.getService().createStartLiveFragment(new InterfaceC498680Jh4() { // from class: X.0UnZ
            @Override // X.InterfaceC498680Jh4
            public final void LIZ(C19EG c19eg, C1106210etP c1106210etP, C481160Itu c481160Itu) {
                C621180OYa.LIZ.LJJIZ(c19eg, c1106210etP, c481160Itu);
            }
        });
        if (LiveBroadcastHostUseTTLH.getEnable()) {
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
            dataChannelGlobal.CQ2(BottomTagChangeEvent.class, this, new AwS610S0100000_31(this, 274));
            if (LinkMicMgPreviewLivePageSetting.INSTANCE.showLayoutInPreviewLivePage()) {
                dataChannelGlobal.CQ2(MultiGuestFullScreenEvent.class, this, new AwS607S0100000_28(this, 171));
            }
            if (c1drg != null) {
                interfaceC1650190t2n = (InterfaceC1650190t2n) c1drg.LJII(InterfaceC1650190t2n.class, null);
            } else {
                interfaceC1650190t2n = null;
            }
            this.LLJL = interfaceC1650190t2n;
            LJFF();
        } else {
            if (iRecordingOperationPanel != null) {
                interfaceC2177841ALeVideoRecorder = iRecordingOperationPanel.videoRecorder();
            } else {
                interfaceC2177841ALeVideoRecorder = null;
            }
            this.LLJJI = interfaceC2177841ALeVideoRecorder;
            if (interfaceC2177841ALeVideoRecorder != null) {
                final ?? r2 = new InterfaceC2177821ALc() { // from class: X.1ALW
                    @Override // X.InterfaceC2177821ALc
                    public final void onMessageReceived(int i, int i2, int i3, String str) {
                        Iterator<C0UHE> it2 = this.LIZ.LLJJJJ.iterator();
                        while (it2.hasNext()) {
                            it2.next().onMessageReceived(i, i2, i3, str);
                        }
                    }
                };
                u uVar = (u) interfaceC2177841ALeVideoRecorder;
                C1ALZ c1alz = uVar.LJ;
                if (c1alz != null) {
                    uVar.LIZ.Tn(c1alz);
                }
                ?? r1 = new MessageCenter.Listener() { // from class: X.1ALZ
                    @Override // com.bef.effectsdk.message.MessageCenter.Listener
                    public final void onMessageReceived(int i, int i2, int i3, String str) {
                        r2.onMessageReceived(i, i2, i3, str);
                    }
                };
                uVar.LJ = r1;
                uVar.LIZ.to(r1);
            }
        }
        C20311414dk.LIZ = false;
        if (LinkMicMgPreviewLivePageSetting.INSTANCE.showLayoutInPreviewLivePage()) {
            this.LLJJIJI = true;
            if (!LiveBroadcastHostUseTTLH.getEnable()) {
                ((SurfaceView) c01gwLIZIZ.getValue()).getHolder().addCallback(new SurfaceHolder.Callback() { // from class: X.1ALT
                    @Override // android.view.SurfaceHolder.Callback
                    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
                        SurfaceView surfaceView;
                        View previewView = this.LL.LIZJ().getPreviewView();
                        if ((previewView instanceof SurfaceView) && (surfaceView = (SurfaceView) previewView) != null) {
                            C786410Ut5.LLIIII(surfaceView, 4);
                        }
                        this.LL.LIZJ().LJLJLLL(surfaceHolder.getSurface());
                        C20441214yg.LIZIZ("TTLiveBroadcastView", "surfaceCreated");
                    }

                    @Override // android.view.SurfaceHolder.Callback
                    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                        C20441214yg.LIZIZ("TTLiveBroadcastView", "surfaceDestroyed");
                    }

                    @Override // android.view.SurfaceHolder.Callback
                    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
                        SurfaceView surfaceView;
                        View previewView = this.LL.LIZJ().getPreviewView();
                        if ((previewView instanceof SurfaceView) && (surfaceView = (SurfaceView) previewView) != null) {
                            C786410Ut5.LLIIII(surfaceView, 4);
                        }
                        this.LL.LIZJ().LJLJLLL(surfaceHolder.getSurface());
                        C20441214yg.LIZIZ("TTLiveBroadcastView", "surfaceChanged");
                    }
                });
                LJIIJ(null, false);
            }
        }
        InterfaceC2177841ALe interfaceC2177841ALe = this.LLJJI;
        if (interfaceC2177841ALe != null) {
            ?? r22 = new InterfaceC2177811ALb() { // from class: X.1ALX
                @Override // X.InterfaceC2177811ALb
                public final void onResult(int i) {
                    TTLiveBroadcastView tTLiveBroadcastView = this.LIZIZ;
                    if (tTLiveBroadcastView.LLJJIJIL) {
                        InterfaceC770090UIt interfaceC770090UIt = tTLiveBroadcastView.LLJJJ;
                        if (interfaceC770090UIt != null) {
                            interfaceC770090UIt.onResult(-1);
                            return;
                        }
                        return;
                    }
                    InterfaceC770090UIt interfaceC770090UIt2 = tTLiveBroadcastView.LLJJJ;
                    if (interfaceC770090UIt2 == null) {
                        return;
                    }
                    interfaceC770090UIt2.onResult(i);
                }
            };
            InterfaceC2177811ALb.LIZ.getClass();
            InterfaceC1645720sva interfaceC1645720sva = ((u) interfaceC2177841ALe).LIZ;
            if (interfaceC1645720sva != null) {
                interfaceC1645720sva.Xn(new C2177801ALa(r22));
            }
        }
        InterfaceC2177841ALe interfaceC2177841ALe2 = this.LLJJI;
        if (interfaceC2177841ALe2 != null) {
            InterfaceC770150UIz interfaceC770150UIz = new InterfaceC770150UIz() { // from class: X.0UIn
                @Override // X.InterfaceC770150UIz
                public final void LIZ(List<Float> list) {
                    EnumC770010UIl enumC770010UIl;
                    TTLiveBroadcastView tTLiveBroadcastView = this.LIZ;
                    tTLiveBroadcastView.LLLIIIL++;
                    InterfaceC770070UIr interfaceC770070UIr = tTLiveBroadcastView.LLJJJIL;
                    if (interfaceC770070UIr != null) {
                        ArrayList arrayList = (ArrayList) list;
                        boolean z = !arrayList.isEmpty();
                        if (arrayList.size() == 1 && ((Number) C13LP.LJJJJZI(list)).floatValue() > 0.5d) {
                            enumC770010UIl = EnumC770010UIl.MALE;
                        } else if (arrayList.size() == 1 && ((Number) C13LP.LJJJJZI(list)).floatValue() <= 0.5d) {
                            enumC770010UIl = EnumC770010UIl.FEMALE;
                        } else if (arrayList.size() > 1) {
                            enumC770010UIl = EnumC770010UIl.MULTIPLE;
                        } else if (this.LIZ.LLLIIIL <= 5) {
                            enumC770010UIl = EnumC770010UIl.DEFAULT;
                        } else {
                            enumC770010UIl = EnumC770010UIl.NULL;
                        }
                        interfaceC770070UIr.LIZ(z, enumC770010UIl);
                    }
                }
            };
            u uVar2 = (u) interfaceC2177841ALe2;
            InterfaceC1645720sva interfaceC1645720sva2 = uVar2.LIZ;
            if (interfaceC1645720sva2 != null) {
                if (uVar2.LJFF == null) {
                    uVar2.LJFF = new C12IR(interfaceC770150UIz);
                }
                interfaceC1645720sva2.Bo(uVar2.LJFF);
            }
        }
    }

    public static void LJI(JSONObject jSONObject, String str, float f, float f2, float f3) {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("value", Float.valueOf(f));
        jSONObject2.put("min", Float.valueOf(f2));
        jSONObject2.put("max", Float.valueOf(f3));
        jSONObject.put(str, jSONObject2);
    }
}
