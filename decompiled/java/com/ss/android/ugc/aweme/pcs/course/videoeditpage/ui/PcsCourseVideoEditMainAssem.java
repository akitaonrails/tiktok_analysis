package com.ss.android.ugc.aweme.pcs.course.videoeditpage.ui;

import X.AbstractC489130JGd;
import X.AbstractC738140SxQ;
import X.C0F9X;
import X.C0JHC;
import X.C1220000hqw;
import X.C13LE;
import X.C1419820n3E;
import X.C1554960qZC;
import X.C2217381BqS;
import X.C2263141Di4;
import X.C2263161Di6;
import X.C2263181Di8;
import X.C2263201DiA;
import X.C451610HnL;
import X.C452070Ho5;
import X.C489190JGj;
import X.C491160JNy;
import X.C723700Sa8;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import X.InterfaceC1555100qZQ;
import X.InterfaceC2263211DiB;
import android.os.Environment;
import android.util.Log;
import android.view.SurfaceView;
import android.view.View;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.INLEPlayer;
import com.bytedance.ies.nle.editor_jni.INLEPurePlayer;
import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEEditorListener;
import com.bytedance.ies.nle.editor_jni.NLELoggerListener;
import com.bytedance.ies.nle.editor_jni.NLEMediaConfig;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nleeditor.NLE;
import com.bytedance.provider.impl.GScope;
import com.ss.android.ugc.aweme.pcs.course.videoeditpage.vm.PcsVideoEditVM;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.AwS579S0100000_35;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.jvm.internal.AwS649S0100000_35;

/* JADX INFO: loaded from: classes36.dex */
public final class PcsCourseVideoEditMainAssem extends UISlotAssem {
    public final C736950SvV LLJJI = new C736950SvV(C13LE.LIZ(PcsVideoEditVM.class), null, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS279S0000000_33.get$arr$(206), new AwS577S0100000_33((AbstractC738140SxQ) this, 2849), new C451610HnL(this, true, true), new C723700Sa8(this));
    public C0JHC LLJJIII;
    public C2263161Di6 LLJJIJI;
    public SurfaceView LLJJIJIIJIL;
    public C491160JNy LLJJIJIL;
    public LiveIconView LLJJJ;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.hlo;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStop_isOnStopEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public final C0JHC hp() {
        if (this.LLJJIII == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(GScope.LL, "source_default_key", C0JHC.class, null);
            this.LLJJIII = interfaceC1555100qZQLIZIZ != null ? (C0JHC) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return this.LLJJIII;
    }

    public final PcsVideoEditVM ip() {
        return (PcsVideoEditVM) this.LLJJI.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C2263161Di6 c2263161Di6 = this.LLJJIJI;
        if (c2263161Di6 != null) {
            INLEMediaSession iNLEMediaSession = c2263161Di6.LIZIZ.LIZLLL;
            if (iNLEMediaSession != null) {
                iNLEMediaSession.getPlayerApi().surfaceDestroyed();
                iNLEMediaSession.getPlayerApi().destroy();
                iNLEMediaSession.getMediaRuntimeApi().cancelPreprocessI2V();
                iNLEMediaSession.getEffectApi().removeEffectMessageCenterCallback();
            }
            c2263161Di6.LIZ.getModel().clearTrack();
        }
        this.LLJJIJI = null;
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        C2263141Di4 c2263141Di4LIZ;
        super.onResume();
        C2263161Di6 c2263161Di6 = this.LLJJIJI;
        if (c2263161Di6 == null || (c2263141Di4LIZ = c2263161Di6.LIZ()) == null) {
            return;
        }
        c2263141Di4LIZ.LIZ(false);
    }

    @Override // X.AbstractC738140SxQ
    public final void onStop() {
        C2263141Di4 c2263141Di4LIZ;
        super.onStop();
        C2263161Di6 c2263161Di6 = this.LLJJIJI;
        if (c2263161Di6 == null || (c2263141Di4LIZ = c2263161Di6.LIZ()) == null) {
            return;
        }
        c2263141Di4LIZ.LIZ(false);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        INLEMediaSession iNLEMediaSession;
        INLEPlayer playerApi;
        super.onViewCreated(view);
        this.LLJJIJIIJIL = (SurfaceView) view.findViewById(R.id.video_surface);
        this.LLJJIJIL = (C491160JNy) view.findViewById(R.id.video_edit_seek_bar);
        this.LLJJJ = (LiveIconView) view.findViewById(R.id.qnb);
        PcsVideoEditVM pcsVideoEditVMIp = ip();
        C489190JGj c489190JGj = new C489190JGj(0.0f);
        pcsVideoEditVMIp.getClass();
        pcsVideoEditVMIp.setState(new AwS586S0100000_7((AbstractC489130JGd) c489190JGj, 569));
        NLE nle = NLE.INSTANCE;
        NLE.loadNLELibrary$default(nle, true, false, false, 6, null);
        C1419820n3E.LIZ.LIZ();
        nle.setLogLevel(LogLevel.LEVEL_VERBOSE);
        nle.setLogger(new NLELoggerListener() { // from class: X.0Ly0
            @Override // com.bytedance.ies.nle.editor_jni.NLELoggerListener
            public final void onLog(LogLevel logLevel, String str) {
                int i;
                if (logLevel == null) {
                    i = -1;
                } else {
                    i = C560130Lxz.LIZ[logLevel.ordinal()];
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                if (i != 5) {
                                    if (str == null) {
                                        str = "";
                                    }
                                    Log.println(3, "NLEDemoNative", str);
                                    return;
                                } else {
                                    if (str == null) {
                                        str = "";
                                    }
                                    Log.println(6, "NLEDemoNative", str);
                                    return;
                                }
                            }
                            if (str == null) {
                                str = "";
                            }
                            Log.println(5, "NLEDemoNative", str);
                            return;
                        }
                        if (str == null) {
                            str = "";
                        }
                        Log.println(4, "NLEDemoNative", str);
                        return;
                    }
                    if (str == null) {
                        str = "";
                    }
                    Log.println(3, "NLEDemoNative", str);
                    return;
                }
                if (str == null) {
                    str = "";
                }
                Log.println(2, "NLEDemoNative", str);
            }
        });
        final C2263161Di6 c2263161Di6 = new C2263161Di6(new NLEEditor(), new C2263181Di8(getContext()));
        this.LLJJIJI = c2263161Di6;
        C2263201DiA c2263201DiA = (C2263201DiA) c2263161Di6.LIZJ.getValue();
        SurfaceView surfaceView = this.LLJJIJIIJIL;
        c2263201DiA.LIZIZ.getClass();
        NLEMediaConfig nLEMediaConfig = new NLEMediaConfig();
        nLEMediaConfig.setWorkSpace(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM).getAbsolutePath());
        nLEMediaConfig.setEnableCatchExceptionInCallback(true);
        nLEMediaConfig.setEnableCoexistGlobalEffect(true);
        c2263201DiA.LIZIZ.LIZLLL = C0F9X.LIZ(nLEMediaConfig, surfaceView, null, 12);
        C2263161Di6 c2263161Di62 = this.LLJJIJI;
        if (c2263161Di62 != null && (iNLEMediaSession = c2263161Di62.LIZIZ.LIZLLL) != null && (playerApi = iNLEMediaSession.getPlayerApi()) != null) {
            playerApi.addPlayerInfoListener(new INLEPurePlayer.INLEPurePlayerInfoListener() { // from class: X.1Di0
                @Override // com.bytedance.ies.nle.editor_jni.INLEPurePlayer.INLEPurePlayerInfoListener
                public final void onPrepared() {
                    C2263181Di8 c2263181Di8;
                    PcsVideoEditVM pcsVideoEditVMIp2 = this.LIZ.ip();
                    C489180JGi c489180JGi = C489180JGi.LIZ;
                    pcsVideoEditVMIp2.getClass();
                    pcsVideoEditVMIp2.setState(new AwS586S0100000_7((AbstractC489130JGd) c489180JGi, 569));
                    C2263161Di6 c2263161Di63 = this.LIZ.LLJJIJI;
                    if (c2263161Di63 == null || (c2263181Di8 = c2263161Di63.LIZIZ) == null) {
                        return;
                    }
                    c2263181Di8.LIZIZ = true;
                }

                @Override // com.bytedance.ies.nle.editor_jni.INLEPurePlayer.INLEPurePlayerInfoListener
                public final void onFirstFrameRender() {
                    INLEPurePlayer.INLEPurePlayerInfoListener.DefaultImpls.onFirstFrameRender(this);
                }

                @Override // com.bytedance.ies.nle.editor_jni.INLEPurePlayer.INLEPurePlayerInfoListener
                public final void onPlayEnd() {
                    INLEPurePlayer.INLEPurePlayerInfoListener.DefaultImpls.onPlayEnd(this);
                }

                @Override // com.bytedance.ies.nle.editor_jni.INLEPurePlayer.INLEPurePlayerInfoListener
                public final void onPlayerPause() {
                    INLEPurePlayer.INLEPurePlayerInfoListener.DefaultImpls.onPlayerPause(this);
                }

                @Override // com.bytedance.ies.nle.editor_jni.INLEPurePlayer.INLEPurePlayerInfoListener
                public final void onPlayTime(int i, long j) {
                    INLEPurePlayer.INLEPurePlayerInfoListener.DefaultImpls.onPlayTime(this, i, j);
                }
            });
        }
        final C2263201DiA c2263201DiA2 = (C2263201DiA) c2263161Di6.LIZJ.getValue();
        final AwS546S0100000_2 awS546S0100000_2 = new AwS546S0100000_2(this, 1181);
        c2263201DiA2.LIZ.setListener(new NLEEditorListener() { // from class: X.1Dhz
            @Override // com.bytedance.ies.nle.editor_jni.NLEEditorListener
            public final void onChanged() {
                INLEPlayer playerApi2;
                INLEPlayer playerApi3;
                NLEModel model = c2263201DiA2.LIZ.getModel();
                if (model != null) {
                    C2263201DiA c2263201DiA3 = c2263201DiA2;
                    if (model.getTracks() != null && (!r0.isEmpty())) {
                        INLEMediaSession iNLEMediaSession2 = c2263201DiA3.LIZIZ.LIZLLL;
                        if (iNLEMediaSession2 != null) {
                            iNLEMediaSession2.setDataSource(model);
                        }
                        INLEMediaSession iNLEMediaSession3 = c2263201DiA3.LIZIZ.LIZLLL;
                        if (iNLEMediaSession3 != null && (playerApi3 = iNLEMediaSession3.getPlayerApi()) != null) {
                            playerApi3.prepare();
                        }
                        INLEMediaSession iNLEMediaSession4 = c2263201DiA3.LIZIZ.LIZLLL;
                        if (iNLEMediaSession4 != null && (playerApi2 = iNLEMediaSession4.getPlayerApi()) != null) {
                            playerApi2.pause();
                        }
                    }
                }
                Function0<Unit> function0 = awS546S0100000_2;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        });
        c2263161Di6.LIZ().LIZJ.add(new InterfaceC2263211DiB() { // from class: X.1Di3
            @Override // X.InterfaceC2263211DiB
            public final void LIZ() {
                C500260Jjc.LJJLIIIJJIZ(new AwS579S0100000_35(this.LIZ, 409));
            }

            @Override // X.InterfaceC2263211DiB
            public final void LIZIZ() {
                if (c2263161Di6.LIZIZ.LIZIZ) {
                    C500260Jjc.LJJLIIIJJIZ(new AwS579S0100000_35(this.LIZ, 408));
                }
            }

            @Override // X.InterfaceC2263211DiB
            public final void LIZJ(boolean z) {
                if (z) {
                    C489110JGb.LJIILJJIL(this.LIZ.hp(), C489320JGw.LIZ(this.LIZ.ip().getState().LLILZIL), "resume", "click");
                }
            }

            @Override // X.InterfaceC2263211DiB
            public final void df(boolean z) {
                if (z) {
                    C489110JGb.LJIILJJIL(this.LIZ.hp(), C489320JGw.LIZ(this.LIZ.ip().getState().LLILZIL), "pause", "click");
                }
            }
        });
        PcsVideoEditVM pcsVideoEditVMIp2 = ip();
        C2263161Di6 c2263161Di63 = this.LLJJIJI;
        pcsVideoEditVMIp2.getClass();
        pcsVideoEditVMIp2.setState(new AwS586S0100000_7(c2263161Di63, 568));
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0JHr
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C489550JHt) obj).LLILLJJLI;
            }
        }, null, new AwS649S0100000_35(this, 24), 6);
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0JGg
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C489550JHt) obj).LL;
            }
        }, null, new AwS649S0100000_35(this, 25), 6);
        C723850SaN.LIZLLL(this, new AwS581S0100000_2(this, 656));
    }
}
