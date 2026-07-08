package com.bytedance.ies.xelement.audiott;

import X.C1289960jfm;
import X.C1298720jtu;
import X.C1310290kCZ;
import X.C1AMW;
import X.C1AMX;
import X.C1AMZ;
import X.C2188811AlT;
import X.C786410Ut5;
import X.C997870c4f;
import X.InterfaceC1310460kCq;
import X.InterfaceC1312540kGC;
import X.InterfaceC1967107nB;
import X.InterfaceC2178061AMa;
import Y.ARunnableS35S1100000_31;
import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.xelement.audiott.LynxAudioTTView;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.lynx.base.log.LynxLog;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.ui.view.UISimpleView;
import com.ss.ttvideoengine.TTVideoEngine;
import cxo.s0;
import j27.s;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS612S0100000_33;

/* JADX INFO: loaded from: classes34.dex */
public final class LynxAudioTTView extends UISimpleView<C997870c4f> implements InterfaceC2178061AMa, InterfaceC1310460kCq {
    public static final /* synthetic */ int LLILZIL = 0;
    public C1AMZ LL;
    public C1AMW LLILLJJLI;
    public boolean LLILLL;
    public final C1AMX LLILZ;

    public LynxAudioTTView() {
        throw null;
    }

    @Override // X.InterfaceC1310460kCq
    public final void LJIIIIZZ() {
    }

    @Override // X.InterfaceC1310460kCq
    public final void LJIILLIIL() {
        C1AMZ c1amz;
        if (!this.LLILLL || (c1amz = this.LL) == null) {
            return;
        }
        c1amz.LLJILLL = 2;
        TTVideoEngine tTVideoEngine = c1amz.LLILZ;
        if (tTVideoEngine != null) {
            tTVideoEngine.pause();
        }
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void destroy() {
        super.destroy();
        C1AMZ c1amz = this.LL;
        if (c1amz != null) {
            c1amz.LLJILLL = 4;
            TTVideoEngine tTVideoEngine = c1amz.LLILZ;
            if (tTVideoEngine != null) {
                tTVideoEngine.release();
            }
            TTVideoEngine tTVideoEngine2 = c1amz.LLILZ;
            if (tTVideoEngine2 != null) {
                tTVideoEngine2.LLJJ(null);
            }
            TTVideoEngine tTVideoEngine3 = c1amz.LLILZ;
            if (tTVideoEngine3 != null) {
                tTVideoEngine3.LLI(null);
            }
            c1amz.LLILZ = null;
            HandlerThread handlerThread = c1amz.LLJJIJI;
            if (handlerThread != null) {
                handlerThread.quit();
            }
        }
        C1AMZ c1amz2 = this.LL;
        if (c1amz2 != null) {
            c1amz2.LLILZIL = null;
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onNodeRemoved() {
        super.onNodeRemoved();
        C1AMZ c1amz = this.LL;
        if (c1amz != null) {
            c1amz.LLJILLL = 2;
            TTVideoEngine tTVideoEngine = c1amz.LLILZ;
            if (tTVideoEngine != null) {
                tTVideoEngine.pause();
            }
        }
    }

    @Override // X.InterfaceC2178061AMa
    public final void LIZIZ(boolean z) {
        C1298720jtu c1298720jtu;
        String strLIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sign: ");
        sbLIZ.append(getSign());
        sbLIZ.append(", onfinished");
        LynxLog.i("LynxAudioTTView", C2188811AlT.LIZIZ(sbLIZ));
        s sVar = this.mContext;
        if (sVar != null && (c1298720jtu = sVar.LLIZ) != null) {
            C1289960jfm c1289960jfm = new C1289960jfm(getSign(), "finished");
            C1AMZ c1amz = this.LL;
            if (c1amz != null) {
                strLIZ = c1amz.LIZ();
            } else {
                strLIZ = null;
            }
            c1289960jfm.LIZIZ(strLIZ, "currentSrcID");
            c1289960jfm.LIZIZ(Boolean.valueOf(z), "loop");
            c1298720jtu.LIZIZ(c1289960jfm);
        }
    }

    @Override // X.InterfaceC2178061AMa
    public final void LIZJ(int i) {
        C1298720jtu c1298720jtu;
        String str;
        String strLIZLLL;
        s sVar = this.mContext;
        if (sVar != null && (c1298720jtu = sVar.LLIZ) != null) {
            if (i != 0 && i == 1) {
                str = "success";
            } else {
                str = "loading";
            }
            C1289960jfm c1289960jfm = new C1289960jfm(getSign(), "srcloadingstatechanged");
            C1AMZ c1amz = this.LL;
            if (c1amz != null) {
                strLIZLLL = c1amz.LIZLLL();
            } else {
                strLIZLLL = null;
            }
            c1289960jfm.LIZIZ(strLIZLLL, "currentSrcID");
            c1289960jfm.LIZIZ(Integer.valueOf(i), "code");
            c1289960jfm.LIZIZ(str, "msg");
            c1289960jfm.LIZIZ(str, "type");
            c1298720jtu.LIZIZ(c1289960jfm);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0052  */
    @Override // X.InterfaceC2178061AMa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIL(int r6) {
        /*
            r5 = this;
            j27.s r0 = r5.mContext
            if (r0 == 0) goto L46
            X.0jtu r4 = r0.LLIZ
            if (r4 == 0) goto L46
            if (r6 == 0) goto L52
            r0 = 1
            if (r6 == r0) goto L4f
            r0 = 2
            if (r6 == r0) goto L4c
            r0 = 3
            if (r6 == r0) goto L49
            r0 = 4
            if (r6 != r0) goto L52
            java.lang.String r3 = "prepared"
        L18:
            X.0jfm r2 = new X.0jfm
            int r1 = r5.getSign()
            java.lang.String r0 = "playbackstatechanged"
            r2.<init>(r1, r0)
            X.1AMZ r0 = r5.LL
            if (r0 == 0) goto L47
            java.lang.String r1 = r0.LIZ()
        L2b:
            java.lang.String r0 = "currentSrcID"
            r2.LIZIZ(r1, r0)
            java.lang.String r1 = "code"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r2.LIZIZ(r0, r1)
            java.lang.String r0 = "msg"
            r2.LIZIZ(r3, r0)
            java.lang.String r0 = "type"
            r2.LIZIZ(r3, r0)
            r4.LIZIZ(r2)
        L46:
            return
        L47:
            r1 = 0
            goto L2b
        L49:
            java.lang.String r3 = "error"
            goto L18
        L4c:
            java.lang.String r3 = "paused"
            goto L18
        L4f:
            java.lang.String r3 = "playing"
            goto L18
        L52:
            java.lang.String r3 = "stopped"
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.xelement.audiott.LynxAudioTTView.LJIIL(int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0046  */
    @Override // X.InterfaceC2178061AMa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJI(int r6) {
        /*
            r5 = this;
            j27.s r0 = r5.mContext
            if (r0 == 0) goto L40
            X.0jtu r4 = r0.LLIZ
            if (r4 == 0) goto L40
            if (r6 == 0) goto L46
            r0 = 1
            if (r6 == r0) goto L43
            r0 = 2
            if (r6 != r0) goto L46
            java.lang.String r3 = "stalled"
        L12:
            X.0jfm r2 = new X.0jfm
            int r1 = r5.getSign()
            java.lang.String r0 = "loadingstatechanged"
            r2.<init>(r1, r0)
            X.1AMZ r0 = r5.LL
            if (r0 == 0) goto L41
            java.lang.String r1 = r0.LIZ()
        L25:
            java.lang.String r0 = "currentSrcID"
            r2.LIZIZ(r1, r0)
            java.lang.String r1 = "code"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r2.LIZIZ(r0, r1)
            java.lang.String r0 = "msg"
            r2.LIZIZ(r3, r0)
            java.lang.String r0 = "type"
            r2.LIZIZ(r3, r0)
            r4.LIZIZ(r2)
        L40:
            return
        L41:
            r1 = 0
            goto L25
        L43:
            java.lang.String r3 = "playable"
            goto L12
        L46:
            java.lang.String r3 = "init"
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.xelement.audiott.LynxAudioTTView.LJJI(int):void");
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(final Context context) {
        boolean z;
        C1310290kCZ c1310290kCZ = this.mContext.LLLIIII;
        if (c1310290kCZ != null) {
            z = c1310290kCZ.LJIIIZ;
        } else {
            z = false;
        }
        C1AMZ c1amz = new C1AMZ(context, z);
        this.LL = c1amz;
        c1amz.LLILZIL = this;
        this.LLILLJJLI = new C1AMW(context);
        return new FrameLayout(context) { // from class: X.0c4f
            {
                new LinkedHashMap();
            }
        };
    }

    @InterfaceC1312540kGC(name = "autoplay")
    public final void isAutoPlay(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sign: ");
        sbLIZ.append(getSign());
        sbLIZ.append(", isAutoPlay -> ");
        sbLIZ.append(z);
        LynxLog.i("LynxAudioTTView", C2188811AlT.LIZIZ(sbLIZ));
        C1AMZ c1amz = this.LL;
        if (c1amz != null && c1amz.LLJIJIL != z) {
            c1amz.LLJIJIL = z;
            if (z && c1amz.LLIZLLLIL != null && c1amz.LLJJ != 1) {
                c1amz.LJIIJ();
            }
        }
    }

    @Override // X.InterfaceC2178061AMa
    public final void onPlaybackTimeChanged(long j) {
        C1298720jtu c1298720jtu;
        String strLIZ;
        s sVar = this.mContext;
        if (sVar != null && (c1298720jtu = sVar.LLIZ) != null) {
            C1289960jfm c1289960jfm = new C1289960jfm(getSign(), "timeupdate");
            C1AMZ c1amz = this.LL;
            if (c1amz != null) {
                strLIZ = c1amz.LIZ();
            } else {
                strLIZ = null;
            }
            c1289960jfm.LIZIZ(strLIZ, "currentSrcID");
            c1289960jfm.LIZIZ(Long.valueOf(j), "currentTime");
            c1298720jtu.LIZIZ(c1289960jfm);
        }
    }

    @InterfaceC1967107nB
    public final void pause(Callback callback) {
        String strLIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sign: ");
        sbLIZ.append(getSign());
        sbLIZ.append(", Control method: --> pause()");
        LynxLog.i("LynxAudioTTView", C2188811AlT.LIZIZ(sbLIZ));
        C1AMZ c1amz = this.LL;
        if (c1amz != null) {
            c1amz.LLJILLL = 2;
            TTVideoEngine tTVideoEngine = c1amz.LLILZ;
            if (tTVideoEngine != null) {
                tTVideoEngine.pause();
            }
        }
        if (callback != null) {
            Object[] objArr = new Object[2];
            objArr[0] = 0;
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            C1AMZ c1amz2 = this.LL;
            if (c1amz2 != null) {
                strLIZ = c1amz2.LIZ();
            } else {
                strLIZ = null;
            }
            javaOnlyMap.put("currentSrcID", strLIZ);
            objArr[1] = javaOnlyMap;
            callback.invoke(objArr);
        }
    }

    @InterfaceC1967107nB
    public final void play(Callback callback) {
        String strLIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sign: ");
        sbLIZ.append(getSign());
        sbLIZ.append(", Control method: --> play()");
        LynxLog.i("LynxAudioTTView", C2188811AlT.LIZIZ(sbLIZ));
        C1AMZ c1amz = this.LL;
        if (c1amz != null) {
            c1amz.LJIIJ();
        }
        if (callback != null) {
            Object[] objArr = new Object[2];
            objArr[0] = 0;
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            C1AMZ c1amz2 = this.LL;
            String strLIZLLL = null;
            if (c1amz2 != null) {
                strLIZ = c1amz2.LIZ();
            } else {
                strLIZ = null;
            }
            javaOnlyMap.put("currentSrcID", strLIZ);
            C1AMZ c1amz3 = this.LL;
            if (c1amz3 != null) {
                strLIZLLL = c1amz3.LIZLLL();
            }
            javaOnlyMap.put("loadingSrcID", strLIZLLL);
            objArr[1] = javaOnlyMap;
            callback.invoke(objArr);
        }
    }

    @InterfaceC1967107nB
    public final void playerInfo(Callback callback) {
        String strLIZ;
        Integer numValueOf;
        Integer numValueOf2;
        Long lValueOf;
        Integer numValueOf3;
        long jLJJJLZIJ;
        int iLJJLIIIJILLIZJL;
        int iLJJJJL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sign: ");
        sbLIZ.append(getSign());
        sbLIZ.append(", Getter method: -> playerInfo");
        LynxLog.i("LynxAudioTTView", C2188811AlT.LIZIZ(sbLIZ));
        if (callback != null) {
            Object[] objArr = new Object[2];
            int iLJJJIL = 0;
            objArr[0] = 0;
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            C1AMZ c1amz = this.LL;
            Long lValueOf2 = null;
            if (c1amz != null) {
                strLIZ = c1amz.LIZ();
            } else {
                strLIZ = null;
            }
            javaOnlyMap.put("currentSrcID", strLIZ);
            C1AMZ c1amz2 = this.LL;
            if (c1amz2 != null) {
                TTVideoEngine tTVideoEngine = c1amz2.LLILZ;
                if (tTVideoEngine != null) {
                    iLJJJJL = tTVideoEngine.LJJJJL();
                } else {
                    iLJJJJL = 0;
                }
                numValueOf = Integer.valueOf(iLJJJJL);
            } else {
                numValueOf = null;
            }
            javaOnlyMap.put("duration", numValueOf);
            C1AMZ c1amz3 = this.LL;
            if (c1amz3 != null) {
                TTVideoEngine tTVideoEngine2 = c1amz3.LLILZ;
                if (tTVideoEngine2 != null) {
                    iLJJLIIIJILLIZJL = tTVideoEngine2.LJJLIIIJILLIZJL();
                } else {
                    iLJJLIIIJILLIZJL = -1;
                }
                numValueOf2 = Integer.valueOf(iLJJLIIIJILLIZJL);
            } else {
                numValueOf2 = null;
            }
            javaOnlyMap.put("playbackstate", numValueOf2);
            C1AMZ c1amz4 = this.LL;
            long jLJJJLZIJ2 = 0;
            if (c1amz4 != null) {
                TTVideoEngine tTVideoEngine3 = c1amz4.LLILZ;
                if (tTVideoEngine3 != null) {
                    jLJJJLZIJ = tTVideoEngine3.LJJJLZIJ(60);
                } else {
                    jLJJJLZIJ = 0;
                }
                lValueOf = Long.valueOf(jLJJJLZIJ);
            } else {
                lValueOf = null;
            }
            javaOnlyMap.put("playBitrate", lValueOf);
            C1AMZ c1amz5 = this.LL;
            if (c1amz5 != null) {
                TTVideoEngine tTVideoEngine4 = c1amz5.LLILZ;
                if (tTVideoEngine4 != null) {
                    iLJJJIL = tTVideoEngine4.LJJJIL();
                }
                numValueOf3 = Integer.valueOf(iLJJJIL);
            } else {
                numValueOf3 = null;
            }
            javaOnlyMap.put("currentTime", numValueOf3);
            C1AMZ c1amz6 = this.LL;
            if (c1amz6 != null) {
                TTVideoEngine tTVideoEngine5 = c1amz6.LLILZ;
                if (tTVideoEngine5 != null) {
                    jLJJJLZIJ2 = tTVideoEngine5.LJJJLZIJ(61);
                }
                lValueOf2 = Long.valueOf(jLJJJLZIJ2);
            }
            javaOnlyMap.put("cacheTime", lValueOf2);
            objArr[1] = javaOnlyMap;
            callback.invoke(objArr);
        }
    }

    @InterfaceC1967107nB
    public final void prepare(Callback callback) {
        String strLIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sign: ");
        sbLIZ.append(getSign());
        sbLIZ.append(", Control method: -> prepare");
        LynxLog.i("LynxAudioTTView", C2188811AlT.LIZIZ(sbLIZ));
        C1AMZ c1amz = this.LL;
        if (c1amz != null) {
            c1amz.LLJILLL = 5;
            TTVideoEngine tTVideoEngine = c1amz.LLILZ;
            if (tTVideoEngine != null) {
                tTVideoEngine.prepare();
            }
        }
        if (callback != null) {
            Object[] objArr = new Object[2];
            objArr[0] = 0;
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            C1AMZ c1amz2 = this.LL;
            if (c1amz2 != null) {
                strLIZ = c1amz2.LIZ();
            } else {
                strLIZ = null;
            }
            javaOnlyMap.put("currentSrcID", strLIZ);
            objArr[1] = javaOnlyMap;
            callback.invoke(objArr);
        }
    }

    @InterfaceC1967107nB
    public final void releaseFocus(Callback callback) {
        Integer numValueOf;
        int iAbandonAudioFocus;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sign: ");
        sbLIZ.append(getSign());
        sbLIZ.append(", Control method: --> releaseFocus()");
        LynxLog.i("LynxAudioTTView", C2188811AlT.LIZIZ(sbLIZ));
        C1AMW c1amw = this.LLILLJJLI;
        if (c1amw != null) {
            C1AMX c1amx = this.LLILZ;
            if (Build.VERSION.SDK_INT >= 26) {
                AudioFocusRequest audioFocusRequest = c1amw.LIZIZ;
                if (audioFocusRequest != null) {
                    iAbandonAudioFocus = c1amw.LIZ.abandonAudioFocusRequest(audioFocusRequest);
                } else {
                    iAbandonAudioFocus = -1;
                }
            } else {
                iAbandonAudioFocus = c1amw.LIZ.abandonAudioFocus(c1amx);
            }
            numValueOf = Integer.valueOf(iAbandonAudioFocus);
        } else {
            numValueOf = null;
        }
        if (callback != null) {
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            javaOnlyMap.put("code", numValueOf);
            callback.invoke(0, javaOnlyMap);
        }
    }

    @InterfaceC1967107nB
    public final void requestFocus(Callback callback) {
        Integer numValueOf;
        int iQ4;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sign: ");
        sbLIZ.append(getSign());
        sbLIZ.append(", Control method: --> requestFocus()");
        LynxLog.i("LynxAudioTTView", C2188811AlT.LIZIZ(sbLIZ));
        C1AMW c1amw = this.LLILLJJLI;
        if (c1amw != null) {
            C1AMX c1amx = this.LLILZ;
            if (Build.VERSION.SDK_INT >= 26) {
                AudioFocusRequest audioFocusRequestBuild = new AudioFocusRequest.Builder(1).setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(2).build()).setAcceptsDelayedFocusGain(true).setOnAudioFocusChangeListener(c1amx).build();
                c1amw.LIZIZ = audioFocusRequestBuild;
                iQ4 = C786410Ut5.p4(c1amw.LIZ, audioFocusRequestBuild);
            } else {
                iQ4 = C786410Ut5.q4(c1amw.LIZ, c1amx, 3, 1);
            }
            numValueOf = Integer.valueOf(iQ4);
        } else {
            numValueOf = null;
        }
        if (callback != null) {
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            javaOnlyMap.put("code", numValueOf);
            callback.invoke(0, javaOnlyMap);
        }
    }

    @InterfaceC1967107nB
    public final void resume(Callback callback) {
        String strLIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sign: ");
        sbLIZ.append(getSign());
        sbLIZ.append(", Control method: --> resume()");
        LynxLog.i("LynxAudioTTView", C2188811AlT.LIZIZ(sbLIZ));
        C1AMZ c1amz = this.LL;
        if (c1amz != null) {
            c1amz.LJIIJ();
        }
        if (callback != null) {
            Object[] objArr = new Object[2];
            objArr[0] = 0;
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            C1AMZ c1amz2 = this.LL;
            String strLIZLLL = null;
            if (c1amz2 != null) {
                strLIZ = c1amz2.LIZ();
            } else {
                strLIZ = null;
            }
            javaOnlyMap.put("currentSrcID", strLIZ);
            C1AMZ c1amz3 = this.LL;
            if (c1amz3 != null) {
                strLIZLLL = c1amz3.LIZLLL();
            }
            javaOnlyMap.put("loadingSrcID", strLIZLLL);
            objArr[1] = javaOnlyMap;
            callback.invoke(objArr);
        }
    }

    @InterfaceC1312540kGC(name = "enableasync")
    public final void setEnableAsync(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sign: ");
        sbLIZ.append(getSign());
        sbLIZ.append(", setEnableAsync -> ");
        sbLIZ.append(z);
        LynxLog.i("LynxAudioTTView", C2188811AlT.LIZIZ(sbLIZ));
        C1AMZ c1amz = this.LL;
        if (c1amz != null) {
            c1amz.LLJJIII = z;
        }
    }

    @InterfaceC1312540kGC(name = "headers")
    public final void setHeaders(String str) {
        C1AMZ c1amz;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sign: ");
        sbLIZ.append(getSign());
        sbLIZ.append(", headers -> ");
        sbLIZ.append(str);
        LynxLog.i("LynxAudioTTView", C2188811AlT.LIZIZ(sbLIZ));
        if (str != null && str.length() > 0 && (c1amz = this.LL) != null) {
            try {
                Map<String, String> map = (Map) GsonProtectorUtils.fromJson((Gson) c1amz.LLJ.getValue(), str, (Type) Map.class);
                c1amz.LLJILJILJ = map;
                if (map != null) {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        String key = entry.getKey();
                        String value = entry.getValue();
                        TTVideoEngine tTVideoEngine = c1amz.LLILZ;
                        if (tTVideoEngine != null) {
                            tTVideoEngine.LJJIII(key, value);
                        }
                    }
                }
            } catch (com.google.gson.s e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    @InterfaceC1312540kGC(name = "loop")
    public final void setLoop(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sign: ");
        sbLIZ.append(getSign());
        sbLIZ.append(", setLoop -> ");
        sbLIZ.append(z);
        LynxLog.i("LynxAudioTTView", C2188811AlT.LIZIZ(sbLIZ));
        C1AMZ c1amz = this.LL;
        if (c1amz != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("setLoop: ");
            sbLIZ2.append(z);
            LynxLog.i("AudioEnginePlayer", C2188811AlT.LIZIZ(sbLIZ2));
            if (c1amz.LLJILJIL != z) {
                c1amz.LLJILJIL = z;
                TTVideoEngine tTVideoEngine = c1amz.LLILZ;
                if (tTVideoEngine != null) {
                    tTVideoEngine.setLooping(z);
                }
            }
        }
    }

    @InterfaceC1312540kGC(name = "pause-on-hide")
    public final void setPauseOnHide(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sign: ");
        sbLIZ.append(getSign());
        sbLIZ.append(", pauseOnHide -> ");
        sbLIZ.append(z);
        LynxLog.i("LynxAudioTTView", C2188811AlT.LIZIZ(sbLIZ));
        this.LLILLL = z;
    }

    @InterfaceC1312540kGC(name = "playertype")
    public final void setPlayerType(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sign: ");
        sbLIZ.append(getSign());
        sbLIZ.append(", setPlayerType -> ");
        sbLIZ.append(str);
        LynxLog.i("LynxAudioTTView", C2188811AlT.LIZIZ(sbLIZ));
        C1AMZ c1amz = this.LL;
        if (c1amz != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("setPlayerType: ");
            sbLIZ2.append(str);
            LynxLog.i("AudioEnginePlayer", C2188811AlT.LIZIZ(sbLIZ2));
            c1amz.LLILLL = str;
        }
    }

    @InterfaceC1312540kGC(name = "src")
    public final void setSrc(String str) {
        C1AMZ c1amz;
        Looper looperW2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sign: ");
        sbLIZ.append(getSign());
        sbLIZ.append(", setSrc -> ");
        sbLIZ.append(str);
        LynxLog.i("LynxAudioTTView", C2188811AlT.LIZIZ(sbLIZ));
        if (str != null && str.length() > 0 && (c1amz = this.LL) != null) {
            HandlerThread handlerThread = c1amz.LLJJIJI;
            if (handlerThread != null && (looperW2 = C786410Ut5.W2(handlerThread)) != null) {
                C786410Ut5.LJJZZIII(new BPEAHandler(looperW2), new ARunnableS35S1100000_31(c1amz, str, 14));
            } else {
                C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS35S1100000_31(c1amz, str, 15));
            }
        }
    }

    @InterfaceC1312540kGC(name = "interval")
    public final void setUpdateInterval(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sign: ");
        sbLIZ.append(getSign());
        sbLIZ.append(", update interval -> ");
        sbLIZ.append(i);
        LynxLog.i("LynxAudioTTView", C2188811AlT.LIZIZ(sbLIZ));
        C1AMZ c1amz = this.LL;
        if (c1amz != null) {
            c1amz.LLJJI = i;
        }
    }

    @InterfaceC1967107nB
    public final void stop(Callback callback) {
        String strLIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sign: ");
        sbLIZ.append(getSign());
        sbLIZ.append(", Control method: --> stop()");
        LynxLog.i("LynxAudioTTView", C2188811AlT.LIZIZ(sbLIZ));
        C1AMZ c1amz = this.LL;
        if (c1amz != null) {
            c1amz.LLJILLL = 3;
            TTVideoEngine tTVideoEngine = c1amz.LLILZ;
            if (tTVideoEngine != null) {
                tTVideoEngine.stop();
            }
        }
        if (callback != null) {
            Object[] objArr = new Object[2];
            objArr[0] = 0;
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            C1AMZ c1amz2 = this.LL;
            if (c1amz2 != null) {
                strLIZ = c1amz2.LIZ();
            } else {
                strLIZ = null;
            }
            javaOnlyMap.put("currentSrcID", strLIZ);
            objArr[1] = javaOnlyMap;
            callback.invoke(objArr);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.1AMX] */
    public LynxAudioTTView(s sVar, Object obj) {
        super(sVar, obj);
        this.LLILZ = new AudioManager.OnAudioFocusChangeListener() { // from class: X.1AMX
            @Override // android.media.AudioManager.OnAudioFocusChangeListener
            public final void onAudioFocusChange(int i) {
                LynxAudioTTView lynxAudioTTView = this.LL;
                if (i != -2) {
                    if (i != -1) {
                        if (i != 1) {
                            int i2 = LynxAudioTTView.LLILZIL;
                            return;
                        }
                        C1AMZ c1amz = lynxAudioTTView.LL;
                        if (c1amz == null) {
                            return;
                        }
                        c1amz.LJIIJ();
                        return;
                    }
                    C1AMZ c1amz2 = lynxAudioTTView.LL;
                    if (c1amz2 == null) {
                        return;
                    }
                    c1amz2.LLJILLL = 3;
                    TTVideoEngine tTVideoEngine = c1amz2.LLILZ;
                    if (tTVideoEngine == null) {
                        return;
                    }
                    tTVideoEngine.stop();
                    return;
                }
                C1AMZ c1amz3 = lynxAudioTTView.LL;
                if (c1amz3 == null) {
                    return;
                }
                c1amz3.LLJILLL = 2;
                TTVideoEngine tTVideoEngine2 = c1amz3.LLILZ;
                if (tTVideoEngine2 == null) {
                    return;
                }
                tTVideoEngine2.pause();
            }
        };
    }

    @Override // X.InterfaceC2178061AMa
    public final void LJIIJ(int i, String str) {
        C1298720jtu c1298720jtu;
        String strLIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sign: ");
        sbLIZ.append(getSign());
        sbLIZ.append(", onError -> code=");
        sbLIZ.append(i);
        sbLIZ.append(", errMsg=");
        sbLIZ.append(str);
        LynxLog.i("LynxAudioTTView", C2188811AlT.LIZIZ(sbLIZ));
        s sVar = this.mContext;
        if (sVar != null && (c1298720jtu = sVar.LLIZ) != null) {
            C1289960jfm c1289960jfm = new C1289960jfm(getSign(), "error");
            C1AMZ c1amz = this.LL;
            if (c1amz != null) {
                strLIZ = c1amz.LIZ();
            } else {
                strLIZ = "";
            }
            c1289960jfm.LIZIZ(strLIZ, "currentSrcID");
            c1289960jfm.LIZIZ(Integer.valueOf(i), "code");
            c1289960jfm.LIZIZ(str, "msg");
            c1298720jtu.LIZIZ(c1289960jfm);
        }
    }

    @InterfaceC1967107nB
    public final void mute(ReadableMap readableMap, Callback callback) {
        String strLIZ;
        TTVideoEngine tTVideoEngine;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sign: ");
        sbLIZ.append(getSign());
        sbLIZ.append(", Control method: --> mute()");
        LynxLog.i("LynxAudioTTView", C2188811AlT.LIZIZ(sbLIZ));
        boolean z = readableMap.getBoolean("mute", false);
        C1AMZ c1amz = this.LL;
        if (c1amz != null && (tTVideoEngine = c1amz.LLILZ) != null) {
            tTVideoEngine.LJ(z);
        }
        if (callback != null) {
            Object[] objArr = new Object[2];
            objArr[0] = 0;
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            C1AMZ c1amz2 = this.LL;
            if (c1amz2 != null) {
                strLIZ = c1amz2.LIZ();
            } else {
                strLIZ = null;
            }
            javaOnlyMap.put("currentSrcID", strLIZ);
            objArr[1] = javaOnlyMap;
            callback.invoke(objArr);
        }
    }

    @InterfaceC1967107nB
    public final void seek(ReadableMap readableMap, Callback callback) {
        String strLIZ;
        int i = readableMap.getInt("currentTime", 0);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sign: ");
        sbLIZ.append(getSign());
        sbLIZ.append(", Control method: --> seek(), param is: ");
        sbLIZ.append(i);
        LynxLog.i("LynxAudioTTView", C2188811AlT.LIZIZ(sbLIZ));
        C1AMZ c1amz = this.LL;
        if (c1amz != null) {
            final AwS612S0100000_33 awS612S0100000_33 = new AwS612S0100000_33(this, 42);
            TTVideoEngine tTVideoEngine = c1amz.LLILZ;
            if (tTVideoEngine != null) {
                tTVideoEngine.LJIJJLI(i, new s0() { // from class: X.1AMY
                    @Override // cxo.s0
                    public final void LJII(boolean z) {
                        awS612S0100000_33.invoke(Boolean.valueOf(z));
                    }
                });
            }
        }
        if (callback != null) {
            Object[] objArr = new Object[2];
            objArr[0] = 0;
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            C1AMZ c1amz2 = this.LL;
            String strLIZLLL = null;
            if (c1amz2 != null) {
                strLIZ = c1amz2.LIZ();
            } else {
                strLIZ = null;
            }
            javaOnlyMap.put("currentSrcID", strLIZ);
            C1AMZ c1amz3 = this.LL;
            if (c1amz3 != null) {
                strLIZLLL = c1amz3.LIZLLL();
            }
            javaOnlyMap.put("loadingSrcID", strLIZLLL);
            objArr[1] = javaOnlyMap;
            callback.invoke(objArr);
        }
    }

    @InterfaceC1967107nB
    public final void setVolume(ReadableMap readableMap, Callback callback) {
        String strLIZ;
        double d = readableMap.getDouble("volume", -1.0d);
        if (d >= 0.0d && d <= 1.0d) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("sign: ");
            sbLIZ.append(getSign());
            sbLIZ.append(", Control method: -> setVolume");
            sbLIZ.append(d);
            LynxLog.i("LynxAudioTTView", C2188811AlT.LIZIZ(sbLIZ));
            C1AMZ c1amz = this.LL;
            if (c1amz != null) {
                float f = (float) d;
                c1amz.LLJILLL = 6;
                TTVideoEngine tTVideoEngine = c1amz.LLILZ;
                if (tTVideoEngine != null) {
                    tTVideoEngine.LIZJ(415, 1);
                }
                TTVideoEngine tTVideoEngine2 = c1amz.LLILZ;
                if (tTVideoEngine2 != null) {
                    tTVideoEngine2.LJIILLIIL(f, f);
                }
            }
            if (callback != null) {
                Object[] objArr = new Object[2];
                objArr[0] = 0;
                JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
                C1AMZ c1amz2 = this.LL;
                if (c1amz2 != null) {
                    strLIZ = c1amz2.LIZ();
                } else {
                    strLIZ = null;
                }
                javaOnlyMap.put("currentSrcID", strLIZ);
                objArr[1] = javaOnlyMap;
                callback.invoke(objArr);
                return;
            }
            return;
        }
        if (callback != null) {
            JavaOnlyMap javaOnlyMap2 = new JavaOnlyMap();
            javaOnlyMap2.putString("msg", "The volume needs to be set between 0 and 1");
            callback.invoke(4, javaOnlyMap2);
        }
    }
}
