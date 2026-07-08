package com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint;

import X.AlertDialogC1397820mTk;
import X.C0LD3;
import X.C0LEP;
import X.C0MVY;
import X.C1463270oBJ;
import X.C194353111z;
import X.C1C7U;
import X.C785410UrT;
import X.InterfaceC1452170ntP;
import X.InterfaceC1463540oBk;
import X.InterfaceC1464150oCj;
import android.app.Activity;
import android.os.Looper;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public final class StickPointGetVideoFrameManager {
    public InterfaceC1452170ntP LIZ;
    public int LIZIZ;
    public VideoSegment LIZJ;
    public int LIZLLL;
    public List<? extends VideoSegment> LJ;
    public InterfaceC1463540oBk LJFF;
    public AlertDialogC1397820mTk LJI;
    public Activity LJII;
    public float LJIIIIZZ;
    public float LJIIIZ;
    public boolean LJIIJ;
    public final HashSet<String> LJIIJJI = new HashSet<>();
    public final StickPointGetVideoFrameManager$mainHandler$1 LJIIL;

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.StickPointGetVideoFrameManager$mainHandler$1] */
    public StickPointGetVideoFrameManager() {
        final Looper mainLooper = Looper.getMainLooper();
        this.LJIIL = new BPEAHandler(mainLooper) { // from class: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.StickPointGetVideoFrameManager$mainHandler$1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                C1C7U.LIZ("StickPointGetVideoFrameManager@f528.mainHandler$1");
                int i = message.what;
                if (i == 1001) {
                    StickPointGetVideoFrameManager stickPointGetVideoFrameManager = this.LL;
                    float fFloatValue = ((Float) HandlerHook.getMessageObj(message.obj)).floatValue();
                    if (fFloatValue >= 1.0f) {
                        VideoSegment videoSegment = stickPointGetVideoFrameManager.LIZJ;
                        if (videoSegment != null) {
                            videoSegment.isGetVideoFrame = true;
                            HashSet<String> hashSet = stickPointGetVideoFrameManager.LJIIJJI;
                            String strLJFF = videoSegment.LJFF(false);
                            strLJFF.toString();
                            hashSet.add(strLJFF);
                        }
                        int i2 = stickPointGetVideoFrameManager.LIZIZ + 1;
                        stickPointGetVideoFrameManager.LIZIZ = i2;
                        stickPointGetVideoFrameManager.LJIIIZ = stickPointGetVideoFrameManager.LJIIIIZZ * i2;
                        if (i2 >= stickPointGetVideoFrameManager.LJ.size()) {
                            stickPointGetVideoFrameManager.LIZ(true, false, true);
                        } else {
                            VideoSegment videoSegment2 = (VideoSegment) ListProtector.get(stickPointGetVideoFrameManager.LJ, stickPointGetVideoFrameManager.LIZIZ);
                            stickPointGetVideoFrameManager.LIZJ = videoSegment2;
                            if (videoSegment2 == null) {
                                stickPointGetVideoFrameManager.LIZ(false, false, false);
                            } else {
                                int i3 = videoSegment2.videoIndex;
                                stickPointGetVideoFrameManager.LIZLLL = i3;
                                if (!stickPointGetVideoFrameManager.LJIIJ) {
                                    stickPointGetVideoFrameManager.LIZ.Nf(i3, new C1463270oBJ(stickPointGetVideoFrameManager));
                                }
                            }
                        }
                    } else {
                        float f = (fFloatValue * stickPointGetVideoFrameManager.LJIIIIZZ) + stickPointGetVideoFrameManager.LJIIIZ;
                        InterfaceC1463540oBk interfaceC1463540oBk = stickPointGetVideoFrameManager.LJFF;
                        if (interfaceC1463540oBk != null) {
                            interfaceC1463540oBk.LIZ();
                        }
                        int i4 = 100;
                        int i5 = (int) (f * 100);
                        if (i5 < 100) {
                            i4 = i5;
                        }
                        AlertDialogC1397820mTk alertDialogC1397820mTk = stickPointGetVideoFrameManager.LJI;
                        if (alertDialogC1397820mTk != null && alertDialogC1397820mTk.isShowing()) {
                            stickPointGetVideoFrameManager.LJI.LIZ(i4);
                        }
                    }
                } else if (i == 1002) {
                    final StickPointGetVideoFrameManager stickPointGetVideoFrameManager2 = this.LL;
                    if (((Float) HandlerHook.getMessageObj(message.obj)).floatValue() >= 1.0f) {
                        VideoSegment videoSegment3 = stickPointGetVideoFrameManager2.LIZJ;
                        if (videoSegment3 != null) {
                            videoSegment3.isGetVideoFrame = true;
                        }
                        int i6 = stickPointGetVideoFrameManager2.LIZIZ + 1;
                        stickPointGetVideoFrameManager2.LIZIZ = i6;
                        if (i6 < stickPointGetVideoFrameManager2.LJ.size()) {
                            VideoSegment videoSegment4 = (VideoSegment) ListProtector.get(stickPointGetVideoFrameManager2.LJ, stickPointGetVideoFrameManager2.LIZIZ);
                            stickPointGetVideoFrameManager2.LIZJ = videoSegment4;
                            if (videoSegment4 != null) {
                                int i7 = videoSegment4.videoIndex;
                                stickPointGetVideoFrameManager2.LIZLLL = i7;
                                stickPointGetVideoFrameManager2.LIZ.Nf(i7, new InterfaceC1464150oCj() { // from class: X.0oBK
                                    @Override // X.InterfaceC1464150oCj
                                    public final void onProgress(float f2) {
                                        Message messageObtain = Message.obtain();
                                        messageObtain.what = 1002;
                                        messageObtain.obj = Float.valueOf(f2);
                                        sendMessage(messageObtain);
                                    }
                                });
                            }
                        }
                    } else {
                        stickPointGetVideoFrameManager2.getClass();
                    }
                }
                C1C7U.LIZIZ("StickPointGetVideoFrameManager@f528.mainHandler$1");
            }
        };
    }

    public final void LIZ(boolean z, boolean z2, boolean z3) {
        AlertDialogC1397820mTk alertDialogC1397820mTk = this.LJI;
        if (alertDialogC1397820mTk != null && alertDialogC1397820mTk.isShowing()) {
            AlertDialogC1397820mTk alertDialogC1397820mTk2 = this.LJI;
            alertDialogC1397820mTk2.dismiss();
            C785410UrT.LIZ(alertDialogC1397820mTk2);
            C194353111z.LIZ.LIZIZ(1012, C0MVY.DISMISS, C0LD3.PROGRESS_WITH_MESSAGE, C0LEP.CLOSE_VISIBLE);
        }
        InterfaceC1463540oBk interfaceC1463540oBk = this.LJFF;
        if (interfaceC1463540oBk != null) {
            if (this.LJIIJ) {
                interfaceC1463540oBk.LIZIZ(false, z2);
            } else {
                interfaceC1463540oBk.LIZIZ(z, z2);
            }
        }
    }
}
