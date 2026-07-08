package com.bytedance.android.livesdk.broadcast.interaction.widget.debug;

import X.AbstractC1273900jFs;
import X.C0UHD;
import X.C0VSJ;
import X.C1273030jET;
import X.C1273730jFb;
import X.C1286920jas;
import X.C16F5;
import X.C20441214yg;
import X.C2188811AlT;
import X.C500260Jjc;
import X.C766270U4b;
import X.C786410Ut5;
import X.C930890aKd;
import X.InterfaceC1272490jDb;
import X.InterfaceC1276250jJf;
import X.InterfaceC1327180kdo;
import X.InterfaceC766480U4w;
import X.InterfaceC769940UIe;
import X.RunnableC1276220jJc;
import X.TextureViewSurfaceTextureListenerC1281950jSr;
import Y.ARunnableS120S0100000_20;
import Y.ARunnableS24S1200000_20;
import android.graphics.Bitmap;
import android.os.Handler;
import android.view.Surface;
import android.view.TextureView;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.DebugChangeImageOrientationEvent;
import com.bytedance.android.live.broadcast.DebugDumpImageDebugEvent;
import com.bytedance.android.live.broadcast.DebugReplaceImageDebugEvent;
import com.bytedance.android.livesdk.broadcast.interaction.widget.debug.MockImageVideoWidget;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAnchorVideoMockPath;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.ss.ttlivestreamer.core.opengl.GLThread;
import com.ss.ttvideoengine.TTVideoEngine;
import com.zhiliaoapp.musically.R;
import java.util.Locale;
import java.util.Set;
import javax.microedition.khronos.egl.EGLContext;
import kotlin.jvm.internal.AwS378S0200000_12;
import kotlin.jvm.internal.AwS386S0200000_20;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.AwS599S0100000_20;
import kotlin.jvm.internal.AwS609S0100000_30;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes21.dex */
public final class MockImageVideoWidget extends LiveWidget implements C0UHD {
    public final Fragment LL;
    public TTVideoEngine LLILLJJLI;
    public Surface LLILLL;
    public Surface LLILZ;
    public RunnableC1276220jJc LLILZIL;
    public int LLILZLL;
    public Handler LLIZ;
    public GLThread LLIZLLLIL;
    public Bitmap LLJ;
    public C16F5 LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public final ARunnableS120S0100000_20 LLJILJILJ = new ARunnableS120S0100000_20(this, 199);
    public C1286920jas LLJILLL;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.h8q;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void A1() {
        Handler handler = this.LLIZ;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        Handler handler2 = this.LLIZ;
        if (handler2 != null) {
            C786410Ut5.LJJZZIII(handler2, new ARunnableS120S0100000_20(this, 25));
        }
    }

    public final void B1() {
        AbstractC1273900jFs liveCore;
        TTVideoEngine tTVideoEngine = this.LLILLJJLI;
        if (tTVideoEngine != null) {
            tTVideoEngine.stop();
        }
        TTVideoEngine tTVideoEngine2 = this.LLILLJJLI;
        if (tTVideoEngine2 != null) {
            tTVideoEngine2.release();
        }
        RunnableC1276220jJc runnableC1276220jJc = this.LLILZIL;
        if (runnableC1276220jJc != null) {
            runnableC1276220jJc.LJFF();
        }
        this.LLILLJJLI = null;
        this.LLILZIL = null;
        InterfaceC769940UIe interfaceC769940UIe = (InterfaceC769940UIe) DataChannelGlobal.LLILZ.gg0(C930890aKd.class);
        if (interfaceC769940UIe == null || (liveCore = interfaceC769940UIe.getLiveCore()) == null) {
            return;
        }
        liveCore.LJJLIL(1);
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [X.0jar] */
    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        C16F5 c16f5;
        C16F5 c16f52;
        AbstractC1273900jFs liveCore;
        AbstractC1273900jFs liveCore2;
        TextureView textureView;
        super.onCreate();
        if (LiveAnchorVideoMockPath.INSTANCE.getValue().length() > 0) {
            C20441214yg.LIZIZ("MockVideoControlWidget", "startEffectAutomatedTesting");
            ViewGroup viewGroup = this.containerView;
            if (viewGroup != null && (textureView = (TextureView) viewGroup.findViewById(R.id.xrw)) != null) {
                C786410Ut5.LLIIIILZ(textureView, 0);
                textureView.setSurfaceTextureListener(new TextureViewSurfaceTextureListenerC1281950jSr() { // from class: X.0jSs
                    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
                    /* JADX WARN: Removed duplicated region for block: B:22:0x0055 A[PHI: r1
                      0x0055: PHI (r1v2 int) = (r1v1 int), (r1v6 int) binds: [B:20:0x0052, B:10:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
                    @Override // android.view.TextureView.SurfaceTextureListener
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void onSurfaceTextureAvailable(android.graphics.SurfaceTexture r4, int r5, int r6) {
                        /*
                            r3 = this;
                            com.bytedance.ies.sdk.datachannel.DataChannelGlobal r1 = com.bytedance.ies.sdk.datachannel.DataChannelGlobal.LLILZ
                            java.lang.Class<X.0aKd> r0 = X.C930890aKd.class
                            java.lang.Object r0 = r1.gg0(r0)
                            X.0UIe r0 = (X.InterfaceC769940UIe) r0
                            if (r0 == 0) goto L4f
                            X.0jFs r2 = r0.getLiveCore()
                            if (r2 == 0) goto L50
                            X.0j8W r0 = r2.LLD()
                            if (r0 == 0) goto L50
                            int r1 = r0.LJJIIZI()
                        L1c:
                            X.0j8W r0 = r2.LLD()
                            if (r0 == 0) goto L55
                            int r0 = r0.LJJIIJ()
                        L26:
                            r4.setDefaultBufferSize(r1, r0)
                            com.bytedance.android.livesdk.broadcast.interaction.widget.debug.MockImageVideoWidget r1 = r3.LL
                            android.view.Surface r0 = new android.view.Surface
                            r0.<init>(r4)
                            r1.LLILLL = r0
                            com.bytedance.android.livesdk.livesetting.broadcast.LiveAnchorVideoMockPath r0 = com.bytedance.android.livesdk.livesetting.broadcast.LiveAnchorVideoMockPath.INSTANCE
                            java.lang.String r2 = r0.getValue()
                            java.lang.String r0 = ".png"
                            r1 = 0
                            boolean r0 = kotlin.text.u.LJIIZILJ(r2, r0, r1)
                            if (r0 != 0) goto L58
                            java.lang.String r0 = ".jpg"
                            boolean r0 = kotlin.text.u.LJIIZILJ(r2, r0, r1)
                            if (r0 != 0) goto L58
                            com.bytedance.android.livesdk.broadcast.interaction.widget.debug.MockImageVideoWidget r0 = r3.LL
                            r0.z1(r2)
                            return
                        L4f:
                            r2 = 0
                        L50:
                            r1 = 720(0x2d0, float:1.009E-42)
                            if (r2 == 0) goto L55
                            goto L1c
                        L55:
                            r0 = 1280(0x500, float:1.794E-42)
                            goto L26
                        L58:
                            com.bytedance.android.livesdk.broadcast.interaction.widget.debug.MockImageVideoWidget r0 = r3.LL
                            r0.y1(r2)
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C1281960jSs.onSurfaceTextureAvailable(android.graphics.SurfaceTexture, int, int):void");
                    }
                });
            }
            InterfaceC769940UIe interfaceC769940UIe = (InterfaceC769940UIe) DataChannelGlobal.LLILZ.gg0(C930890aKd.class);
            if (interfaceC769940UIe == null || (liveCore2 = interfaceC769940UIe.getLiveCore()) == null) {
                return;
            }
            liveCore2.LJJLIL(4);
            return;
        }
        ViewGroup viewGroup2 = this.containerView;
        if (viewGroup2 != null) {
            c16f5 = (C16F5) viewGroup2.findViewById(R.id.t6r);
            if (c16f5 != null) {
                C500260Jjc.LJLIIIL(500L, c16f5, new AwS609S0100000_30(this, 52));
                c16f5.setText("Replace camera image");
            }
        } else {
            c16f5 = null;
        }
        ViewGroup viewGroup3 = this.containerView;
        if (viewGroup3 != null) {
            c16f52 = (C16F5) viewGroup3.findViewById(R.id.gby);
            if (c16f52 != null) {
                C500260Jjc.LJLIIIL(500L, c16f52, new AwS591S0100000_12(this, 198));
                c16f52.setText("Dump image");
            }
        } else {
            c16f52 = null;
        }
        ViewGroup viewGroup4 = this.containerView;
        this.LLJI = viewGroup4 != null ? (C16F5) viewGroup4.findViewById(R.id.video_size_text) : null;
        if (InterfaceC766480U4w.LJL.LIZIZ().booleanValue()) {
            x1(c16f5);
        }
        if (InterfaceC766480U4w.LJLI.LIZIZ().booleanValue()) {
            C500260Jjc.LLFFF(c16f52);
            InterfaceC769940UIe interfaceC769940UIe2 = (InterfaceC769940UIe) DataChannelGlobal.LLILZ.gg0(C930890aKd.class);
            if (interfaceC769940UIe2 != null && (liveCore = interfaceC769940UIe2.getLiveCore()) != null) {
                liveCore.LJIJI(this);
            }
        }
        this.LLJILJIL = InterfaceC766480U4w.LJLIIIL.LIZIZ().booleanValue();
        DataChannelGlobal.LLILZ.BQ2(this, this, DebugReplaceImageDebugEvent.class, new AwS386S0200000_20(this, c16f5, 1));
        DataChannelGlobal.LLILZ.BQ2(this, this, DebugDumpImageDebugEvent.class, new AwS378S0200000_12(this, c16f52, 20));
        DataChannelGlobal.LLILZ.BQ2(this, this, DebugChangeImageOrientationEvent.class, new AwS599S0100000_20(this, 14));
        Fragment fragment = this.LL;
        if (fragment != null) {
            this.LLJILLL = new C1286920jas(fragment.requireActivity(), fragment, new InterfaceC1327180kdo() { // from class: X.0jar
                @Override // X.InterfaceC1327180kdo
                public final void onCanceled() {
                    C766270U4b.LJIIJJI("cancel to choose");
                }

                @Override // X.InterfaceC1327180kdo
                public final void LIZ(String str) {
                    if (str != null) {
                        MockImageVideoWidget mockImageVideoWidget = this.LIZ;
                        mockImageVideoWidget.B1();
                        mockImageVideoWidget.A1();
                        Set setLJLIIL = C13LQ.LJLIIL(new String[]{"jpg", "jpeg", "png", "gif", "bmp", "webp"});
                        String strLJJLJ = a0.LJJLJ('.', str, "");
                        Locale locale = Locale.ROOT;
                        if (setLJLIIL.contains(strLJJLJ.toLowerCase(locale))) {
                            C766270U4b.LJIIJJI("choose a image");
                            mockImageVideoWidget.y1(str);
                        } else if (C13LQ.LJLIIL(new String[]{"mp4", "mov", "avi", "mkv", "flv", "3gp"}).contains(a0.LJJLJ('.', str, "").toLowerCase(locale))) {
                            C766270U4b.LJIIJJI("choose a video");
                            mockImageVideoWidget.z1(str);
                        } else {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("unsupported media type:");
                            sbLIZ.append(str);
                            C766270U4b.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ));
                        }
                    }
                }
            });
        } else {
            C766270U4b.LJIIJJI("fragment is null");
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.BQ2(this, PickResultChannel.class, new AwS599S0100000_20(this, 15));
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        AbstractC1273900jFs liveCore;
        B1();
        A1();
        InterfaceC769940UIe interfaceC769940UIe = (InterfaceC769940UIe) DataChannelGlobal.LLILZ.gg0(C930890aKd.class);
        if (interfaceC769940UIe != null && (liveCore = interfaceC769940UIe.getLiveCore()) != null) {
            liveCore.LLJZ(this);
        }
        super.onDestroy();
    }

    public MockImageVideoWidget(BaseFragment baseFragment) {
        this.LL = baseFragment;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0094 A[PHI: r1
      0x0094: PHI (r1v4 int) = (r1v3 int), (r1v9 int) binds: [B:30:0x0091, B:18:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x1(X.C16F5 r7) {
        /*
            r6 = this;
            android.view.ViewGroup r1 = r6.containerView
            r2 = 0
            if (r1 == 0) goto L97
            r0 = 2131394507(0x7f0a7fcb, float:1.84097E38)
            android.view.View r1 = r1.findViewById(r0)
            android.view.TextureView r1 = (android.view.TextureView) r1
        Le:
            boolean r0 = r6.LLJIJIL
            if (r0 != 0) goto L22
            r0 = 1
            r6.LLJIJIL = r0
            if (r1 == 0) goto L22
            X.C500260Jjc.LLFFF(r1)
            X.0jSq r0 = new X.0jSq
            r0.<init>()
            r1.setSurfaceTextureListener(r0)
        L22:
            X.C500260Jjc.LLFFF(r7)
            com.bytedance.ies.sdk.datachannel.DataChannelGlobal r5 = com.bytedance.ies.sdk.datachannel.DataChannelGlobal.LLILZ
            java.lang.Class<X.0aKd> r0 = X.C930890aKd.class
            java.lang.Object r0 = r5.gg0(r0)
            X.0UIe r0 = (X.InterfaceC769940UIe) r0
            if (r0 == 0) goto L8f
            X.0jFs r2 = r0.getLiveCore()
            if (r2 == 0) goto L8f
            X.0j8W r0 = r2.LLD()
            if (r0 == 0) goto L8f
            int r1 = r0.LJJIIZI()
        L41:
            X.0j8W r0 = r2.LLD()
            if (r0 == 0) goto L94
            int r4 = r0.LJJIIJ()
        L4b:
            X.16F5 r3 = r6.LLJI
            if (r3 == 0) goto L75
            java.lang.StringBuilder r2 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "Camera Resolution ratio: "
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = " / "
            r2.append(r0)
            r2.append(r4)
            java.lang.String r0 = " = "
            r2.append(r0)
            float r1 = (float) r1
            float r0 = (float) r4
            float r1 = r1 / r0
            r2.append(r1)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r2)
            r3.setText(r0)
        L75:
            X.16F5 r0 = r6.LLJI
            X.C500260Jjc.LLFFF(r0)
            java.lang.Class<X.0aKd> r0 = X.C930890aKd.class
            java.lang.Object r0 = r5.gg0(r0)
            X.0UIe r0 = (X.InterfaceC769940UIe) r0
            if (r0 == 0) goto L8e
            X.0jFs r1 = r0.getLiveCore()
            if (r1 == 0) goto L8e
            r0 = 4
            r1.LJJLIL(r0)
        L8e:
            return
        L8f:
            r1 = 720(0x2d0, float:1.009E-42)
            if (r2 == 0) goto L94
            goto L41
        L94:
            r4 = 1280(0x500, float:1.794E-42)
            goto L4b
        L97:
            r1 = r2
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.broadcast.interaction.widget.debug.MockImageVideoWidget.x1(X.16F5):void");
    }

    public final void y1(String str) {
        AbstractC1273900jFs liveCore;
        Handler handler;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startMockImage path:");
        sbLIZ.append(str);
        C20441214yg.LIZIZ("MockVideoControlWidget", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC769940UIe interfaceC769940UIe = (InterfaceC769940UIe) DataChannelGlobal.LLILZ.gg0(C930890aKd.class);
        if (interfaceC769940UIe != null && (liveCore = interfaceC769940UIe.getLiveCore()) != null) {
            GLThread gLThreadLIZ = C1273730jFb.LIZ(0, "mock_video");
            this.LLIZLLLIL = gLThreadLIZ;
            gLThreadLIZ.start();
            GLThread gLThread = this.LLIZLLLIL;
            if (gLThread != null) {
                handler = gLThread.getHandler();
            } else {
                handler = null;
            }
            this.LLIZ = handler;
            if (handler != null) {
                C786410Ut5.LJJZZIII(handler, new ARunnableS24S1200000_20(liveCore, str, this, 8));
            }
            Handler handler2 = this.LLIZ;
            if (handler2 != null) {
                C786410Ut5.LJJZZIII(handler2, this.LLJILJILJ);
            }
        }
    }

    public final void z1(String str) {
        boolean z;
        final AbstractC1273900jFs liveCore;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startMockVideo path:");
        sbLIZ.append(str);
        sbLIZ.append("， isFileExist:");
        if (str.length() > 0 && new C0VSJ(str).exists()) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        C20441214yg.LIZIZ("MockVideoControlWidget", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC769940UIe interfaceC769940UIe = (InterfaceC769940UIe) DataChannelGlobal.LLILZ.gg0(C930890aKd.class);
        if (interfaceC769940UIe != null && (liveCore = interfaceC769940UIe.getLiveCore()) != null) {
            TTVideoEngine tTVideoEngine = new TTVideoEngine(this.context, 0);
            tTVideoEngine.LJIJI(str);
            tTVideoEngine.LIZJ(199, 1);
            tTVideoEngine.LIZJ(7, 1);
            tTVideoEngine.setLooping(true);
            tTVideoEngine.setSurface(this.LLILLL);
            tTVideoEngine.play();
            this.LLILLJJLI = tTVideoEngine;
            RunnableC1276220jJc runnableC1276220jJc = new RunnableC1276220jJc(liveCore.LLD().LJLJI.LJIIZILJ, liveCore.LLD().LJJIIZI(), liveCore.LLD().LJJIIJ(), liveCore.LLD().LJJIJIIJI(), new InterfaceC1276250jJf() { // from class: X.0jK6
                @Override // X.InterfaceC1276250jJf
                public final void LIZ(int i, int i2, int i3, long j) {
                    liveCore.LJIIJJI(j, i, i2, i3, null, 0, false);
                }
            });
            this.LLILZIL = runnableC1276220jJc;
            Surface surfaceLJ = runnableC1276220jJc.LJ();
            this.LLILZ = surfaceLJ;
            RunnableC1276220jJc runnableC1276220jJc2 = this.LLILZIL;
            if (runnableC1276220jJc2 != null) {
                runnableC1276220jJc2.LIZ(liveCore.LLD().LJJIIZI(), liveCore.LLD().LJJIIJ(), surfaceLJ);
            }
        }
    }

    @Override // X.C0UHD
    public final void u(EGLContext eGLContext, int i, boolean z, int i2, int i3, long j, float[] fArr, Object... objArr) {
        this.LLJ = C1273030jET.LIZ(i, i2, i3, z);
    }

    @Override // X.C0UHD
    public final void LLLLZLL(EGLContext eGLContext, int i, boolean z, InterfaceC1272490jDb interfaceC1272490jDb, int i2, int i3, long j, float[] fArr, long j2, Object... objArr) {
        u(eGLContext, i, z, i2, i3, j, fArr, objArr);
    }
}
