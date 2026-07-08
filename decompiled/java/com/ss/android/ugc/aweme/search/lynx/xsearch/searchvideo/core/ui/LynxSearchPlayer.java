package com.ss.android.ugc.aweme.search.lynx.xsearch.searchvideo.core.ui;

import X.C0N0Y;
import X.C0Q58;
import X.C0Q5B;
import X.C1298700jts;
import X.C1298720jtu;
import X.C2097608Jq;
import X.C662190PyD;
import X.C664340Q4a;
import X.C946803n0;
import X.InterfaceC1312540kGC;
import X.InterfaceC1967107nB;
import X.InterfaceC661540PxA;
import X.InterfaceC662180PyC;
import Y.ARunnableS79S0200000_10;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.ss.android.ugc.aweme.search.lynx.xsearch.searchvideo.core.ui.LynxSearchPlayer;
import j27.s;
import java.lang.ref.WeakReference;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class LynxSearchPlayer extends LynxUI<View> {
    public C662190PyD LL;
    public boolean LLILLJJLI;

    public final InterfaceC661540PxA LJJIIZI() {
        C662190PyD c662190PyD = this.LL;
        if (c662190PyD != null) {
            return c662190PyD.LL;
        }
        return null;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void destroy() {
        InterfaceC661540PxA interfaceC661540PxALJJIIZI = LJJIIZI();
        if (interfaceC661540PxALJJIIZI != null && ((C0Q5B) interfaceC661540PxALJJIIZI).isPlaying()) {
            sendEvent("ended", C2097608Jq.LJ());
        }
        sendEvent("release", C2097608Jq.LJ());
        InterfaceC661540PxA interfaceC661540PxALJJIIZI2 = LJJIIZI();
        if (interfaceC661540PxALJJIIZI2 != null) {
            ((C0Q5B) interfaceC661540PxALJJIIZI2).release();
        }
        super.destroy();
    }

    @InterfaceC1967107nB
    public final void pause() {
        InterfaceC661540PxA interfaceC661540PxALJJIIZI = LJJIIZI();
        if (interfaceC661540PxALJJIIZI != null) {
            ((C0Q5B) interfaceC661540PxALJJIIZI).pause();
        }
    }

    @InterfaceC1967107nB
    public final void play() {
        InterfaceC661540PxA interfaceC661540PxALJJIIZI = LJJIIZI();
        if (interfaceC661540PxALJJIIZI != null) {
            ((C0Q5B) interfaceC661540PxALJJIIZI).play();
        }
    }

    @InterfaceC1967107nB
    public final void release() {
        InterfaceC661540PxA interfaceC661540PxALJJIIZI = LJJIIZI();
        if (interfaceC661540PxALJJIIZI != null) {
            ((C0Q5B) interfaceC661540PxALJJIIZI).release();
        }
        sendEvent("release", C2097608Jq.LJ());
    }

    @InterfaceC1967107nB
    public final void stop() {
        InterfaceC661540PxA interfaceC661540PxALJJIIZI = LJJIIZI();
        if (interfaceC661540PxALJJIIZI != null) {
            C0Q5B c0q5b = (C0Q5B) interfaceC661540PxALJJIIZI;
            C0N0Y c0n0y = c0q5b.LIZLLL.LJIILIIL;
            if (c0n0y != null) {
                c0n0y.LJJL();
                C664340Q4a c664340Q4a = c0q5b.LJFF;
                if (c664340Q4a != null) {
                    c664340Q4a.LLJILLL.put(Long.valueOf(System.currentTimeMillis()), "stop");
                }
            }
        }
    }

    public LynxSearchPlayer(s sVar) {
        super(sVar);
    }

    @InterfaceC1312540kGC(name = "aweme")
    public final void aweme(ReadableMap readableMap) {
        HandlerHook.viewPost(this.mView, new ARunnableS79S0200000_10(this, readableMap, 23));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0Q57] */
    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(Context context) {
        if (context != null) {
            C662190PyD c662190PyD = new C662190PyD(context, new InterfaceC662180PyC() { // from class: X.0Q57
                @Override // X.InterfaceC662180PyC
                public final /* synthetic */ void LIZ() {
                }

                @Override // X.InterfaceC662180PyC
                public final /* synthetic */ void LIZIZ() {
                }

                @Override // X.InterfaceC662180PyC
                public final /* synthetic */ void LIZJ() {
                }

                @Override // X.InterfaceC662180PyC
                public final /* synthetic */ void onBufferedPercent(String str, long j, int i) {
                }

                @Override // X.InterfaceC662180PyC
                public final /* synthetic */ void onBuffering(String str, boolean z) {
                }

                @Override // X.InterfaceC662180PyC
                public final /* synthetic */ void onDecoderBuffering(String str, boolean z) {
                }

                @Override // X.InterfaceC662180PyC
                public final /* synthetic */ void onPlayCompletedFirstTime(String str) {
                }

                @Override // X.InterfaceC662180PyC
                public final /* synthetic */ void onPlayPrepare(String str) {
                }

                @Override // X.InterfaceC662180PyC
                public final /* synthetic */ void onPlayProgressChange(String str, long j, long j2) {
                }

                @Override // X.InterfaceC662180PyC
                public final /* synthetic */ void onResumePlay(String str) {
                }

                @Override // X.InterfaceC662180PyC
                public final void onPausePlay(String str) {
                    this.LL.sendEvent("pause", C2097608Jq.LJ());
                }

                @Override // X.InterfaceC662180PyC
                public final void onPlayCompleted(String str) {
                    LynxSearchPlayer lynxSearchPlayer = this.LL;
                    if (!lynxSearchPlayer.LLILLJJLI) {
                        InterfaceC661540PxA interfaceC661540PxALJJIIZI = lynxSearchPlayer.LJJIIZI();
                        if (interfaceC661540PxALJJIIZI != null) {
                            ((C0Q5B) interfaceC661540PxALJJIIZI).pause();
                        }
                        this.LL.sendEvent("end", C2097608Jq.LJ());
                    }
                }

                @Override // X.InterfaceC662180PyC
                public final void onPlayStop(String str) {
                    this.LL.sendEvent("stop", C2097608Jq.LJ());
                }

                @Override // X.InterfaceC662180PyC
                public final void onPlaying(String str) {
                    this.LL.sendEvent("play", C2097608Jq.LJ());
                }

                @Override // X.InterfaceC662180PyC
                public final void onPlayFailed(String str, C1481290oeN c1481290oeN) {
                    Integer numValueOf;
                    LynxSearchPlayer lynxSearchPlayer = this.LL;
                    if (c1481290oeN != null) {
                        numValueOf = Integer.valueOf(c1481290oeN.LJ);
                    } else {
                        numValueOf = null;
                    }
                    lynxSearchPlayer.sendEvent("error", C2097908Jt.LIZJ(new Pair("error", numValueOf)));
                }

                @Override // X.InterfaceC662180PyC
                public final void onRenderFirstFrame(String str, C1480420ocy c1480420ocy) {
                    this.LL.sendEvent("firstframe", C2097608Jq.LJ());
                }
            });
            this.LL = c662190PyD;
            Fragment fragmentLIZ = C946803n0.LIZ(this.mView);
            if (fragmentLIZ != null) {
                new C0Q58(fragmentLIZ, new WeakReference(c662190PyD.LL));
            }
            return c662190PyD;
        }
        return null;
    }

    @InterfaceC1312540kGC(name = "loop")
    public final void loop(boolean z) {
        this.LLILLJJLI = z;
    }

    @InterfaceC1312540kGC(name = "mute")
    public final void mute(boolean z) {
        InterfaceC661540PxA interfaceC661540PxALJJIIZI = LJJIIZI();
        if (interfaceC661540PxALJJIIZI != null) {
            ((C0Q5B) interfaceC661540PxALJJIIZI).LJIILJJIL(z);
        }
    }

    @InterfaceC1312540kGC(name = "object-fit")
    public final void objectFit(String str) {
        String lowerCase;
        InterfaceC661540PxA interfaceC661540PxALJJIIZI;
        if (str != null) {
            lowerCase = str.toLowerCase(Locale.ROOT);
        } else {
            lowerCase = null;
        }
        if (Intrinsics.LJFF(lowerCase, "cover") && (interfaceC661540PxALJJIIZI = LJJIIZI()) != null) {
            ((C0Q5B) interfaceC661540PxALJJIIZI).LIZLLL(2);
        }
    }

    @InterfaceC1967107nB
    public final void setMute(boolean z) {
        InterfaceC661540PxA interfaceC661540PxALJJIIZI = LJJIIZI();
        if (interfaceC661540PxALJJIIZI != null) {
            ((C0Q5B) interfaceC661540PxALJJIIZI).LJIILJJIL(z);
        }
    }

    public final void sendEvent(String str, Map<String, ? extends Object> map) {
        C1298720jtu c1298720jtu;
        s sVar = this.mContext;
        if (sVar != null && (c1298720jtu = sVar.LLIZ) != null) {
            C1298700jts c1298700jts = new C1298700jts(getSign(), str);
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                c1298700jts.LIZIZ(entry.getValue(), entry.getKey());
            }
            c1298720jtu.LIZIZ(c1298700jts);
        }
    }
}
