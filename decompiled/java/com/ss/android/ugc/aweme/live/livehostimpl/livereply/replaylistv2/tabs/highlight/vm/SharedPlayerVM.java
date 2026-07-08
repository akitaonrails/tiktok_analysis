package com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylistv2.tabs.highlight.vm;

import X.C01GW;
import X.C118300cf;
import X.C1281010jRL;
import X.C1284720jXK;
import X.C1480290ocl;
import X.C1480420ocy;
import X.C1480430ocz;
import X.C1481290oeN;
import X.C1700490uLv;
import X.C1835690xrz;
import X.C1835700xs0;
import X.C1835740xs4;
import X.C20441214yg;
import X.C2188811AlT;
import X.C452501pT;
import X.C490850JMt;
import X.EnumC2281141EQm;
import X.InterfaceC0148002o;
import X.InterfaceC1482530ogN;
import X.InterfaceC1483420oho;
import X.InterfaceC1483820oiS;
import X.InterfaceC1484830ok5;
import X.InterfaceC1488100opM;
import android.view.Surface;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS216S0000000_27;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AwS393S0200000_27;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes28.dex */
public final class SharedPlayerVM extends AssemViewModel<C1835700xs0> implements InterfaceC1482530ogN {
    public WeakReference<InterfaceC1483820oiS> LLILLJJLI;
    public Float LLILZIL;
    public Float LLILZLL;
    public long LLIZ;
    public final C01GW LL = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(140));
    public boolean LLILLL = true;
    public final Map<Long, Float> LLILZ = new LinkedHashMap();

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void Au(Surface surface) {
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void Gk1(C1284720jXK c1284720jXK) {
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void LLZZLLIL(C1281010jRL c1281010jRL) {
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void Qe2(C1700490uLv c1700490uLv) {
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void VK() {
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void W1(String str) {
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void onBrightnessChanged(String str, float f) {
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void onBufferedPercent(String str, long j, int i) {
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void onBufferedTimeMs(String str, long j) {
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void onCompleteLoaded(String str, boolean z) {
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void onCrosstalkHappened(String str, List list) {
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void onDecoderBuffering(String str, boolean z, C1480430ocz c1480430ocz) {
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void onFrameAboutToBeRendered(int i, long j, long j2, Map map) {
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void onLiveRenderFirstFrame(String str, C1480420ocy c1480420ocy) {
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void onLoopPlay(String str, int i) {
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void onMaskInfoCallback(String str, C1480290ocl c1480290ocl) {
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void onPausePlay(String str, C1480430ocz c1480430ocz) {
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void onPlayCompleted(String str, int i) {
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void onPlayCompletedFirstTime(String str, C1480430ocz c1480430ocz) {
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void onPlayFailed(String str, C1481290oeN c1481290oeN, C1480430ocz c1480430ocz) {
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void onPlayPrepare(String str) {
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void onPlayPrepared(String str) {
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void onPlayRelease(String str) {
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void onPlayStop(String str, JSONObject jSONObject, C1480430ocz c1480430ocz) {
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void onPlayerInternalEvent(String str, int i, JSONObject jSONObject) {
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void onPlaying(String str, C1480430ocz c1480430ocz) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnPreRenderListener
    public final /* synthetic */ void onPreRenderReady(String str) {
        C490850JMt.LIZ(this, str);
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void onPreRenderSessionMissed(String str) {
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void onPreparePlay(String str, C1480430ocz c1480430ocz) {
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void onResumePlay(String str, C1480430ocz c1480430ocz) {
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void onRetryOnError(String str, C1481290oeN c1481290oeN) {
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void onSeekEnd(String str, boolean z) {
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void onSeekStart(String str, int i, float f) {
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void onSpeedChanged(String str, float f) {
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void onStopPlay(String str) {
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void onVideoBitrateChanged(String str, EnumC2281141EQm enumC2281141EQm, int i) {
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void onVideoSecondFrame(String str) {
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void tc(String str, JSONObject jSONObject) {
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void uv(JSONObject jSONObject) {
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1835700xs0(0);
    }

    public final InterfaceC1484830ok5 wQ2() {
        return (InterfaceC1484830ok5) this.LL.getValue();
    }

    @Override // X.InterfaceC1482530ogN
    public final void onPlayPause(String str) {
        setState(AFwS269S0000000_27.get$arr$(120));
    }

    public final void vQ2(boolean z) {
        this.LLILLL = z;
        InterfaceC1484830ok5 interfaceC1484830ok5WQ2 = wQ2();
        if (interfaceC1484830ok5WQ2 != null) {
            if (z) {
                InterfaceC1488100opM interfaceC1488100opMLJIILIIL = interfaceC1484830ok5WQ2.LJIILIIL();
                if (interfaceC1488100opMLJIILIIL != null) {
                    interfaceC1488100opMLJIILIIL.mute();
                    return;
                }
                return;
            }
            InterfaceC1488100opM interfaceC1488100opMLJIILIIL2 = interfaceC1484830ok5WQ2.LJIILIIL();
            if (interfaceC1488100opMLJIILIIL2 == null) {
                return;
            }
            interfaceC1488100opMLJIILIIL2.unmute();
        }
    }

    public final boolean xQ2(InterfaceC1483820oiS interfaceC1483820oiS) {
        InterfaceC1483820oiS interfaceC1483820oiS2;
        WeakReference<InterfaceC1483820oiS> weakReference = this.LLILLJJLI;
        if (weakReference != null) {
            interfaceC1483820oiS2 = weakReference.get();
        } else {
            interfaceC1483820oiS2 = null;
        }
        if (interfaceC1483820oiS2 == interfaceC1483820oiS) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1482530ogN
    public final void onRenderFirstFrame(String str, C1480420ocy c1480420ocy) {
        int width;
        C118300cf c118300cf = new C118300cf();
        C118300cf c118300cf2 = new C118300cf();
        InterfaceC1484830ok5 interfaceC1484830ok5WQ2 = wQ2();
        if (interfaceC1484830ok5WQ2 != null) {
            if (this.LLILLL) {
                InterfaceC1488100opM interfaceC1488100opMLJIILIIL = interfaceC1484830ok5WQ2.LJIILIIL();
                if (interfaceC1488100opMLJIILIIL != null) {
                    interfaceC1488100opMLJIILIIL.mute();
                }
            } else {
                InterfaceC1488100opM interfaceC1488100opMLJIILIIL2 = interfaceC1484830ok5WQ2.LJIILIIL();
                if (interfaceC1488100opMLJIILIIL2 != null) {
                    interfaceC1488100opMLJIILIIL2.unmute();
                }
            }
            InterfaceC1483420oho interfaceC1483420ohoLJIIIZ = interfaceC1484830ok5WQ2.LJIIIZ();
            int height = 0;
            if (interfaceC1483420ohoLJIIIZ != null) {
                width = interfaceC1483420ohoLJIIIZ.getWidth();
            } else {
                width = 0;
            }
            c118300cf.element = width;
            InterfaceC1483420oho interfaceC1483420ohoLJIIIZ2 = interfaceC1484830ok5WQ2.LJIIIZ();
            if (interfaceC1483420ohoLJIIIZ2 != null) {
                height = interfaceC1483420ohoLJIIIZ2.getHeight();
            }
            c118300cf2.element = height;
        }
        Float f = this.LLILZIL;
        if (f != null) {
            float fFloatValue = f.floatValue();
            InterfaceC1484830ok5 interfaceC1484830ok5WQ22 = wQ2();
            if (interfaceC1484830ok5WQ22 != null) {
                interfaceC1484830ok5WQ22.seek(fFloatValue);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("seek to saved progress: ");
            sbLIZ.append(fFloatValue);
            sbLIZ.append('%');
            C20441214yg.LIZIZ("LiveRecordingV2", C2188811AlT.LIZIZ(sbLIZ));
            this.LLILZIL = null;
        }
        setState(new AwS393S0200000_27(c118300cf, c118300cf2, 39));
    }

    @Override // X.InterfaceC1482530ogN
    public final void onBuffering(String str, boolean z, C1480430ocz c1480430ocz) {
        if (z) {
            setState(AFwS269S0000000_27.get$arr$(119));
        }
    }

    @Override // X.InterfaceC1482530ogN
    public final void onPlayProgressChange(String str, long j, long j2) {
        Long l = getState().LL;
        if (l != null) {
            long jLongValue = l.longValue();
            if (j2 > 0) {
                this.LLILZ.put(Long.valueOf(jLongValue), Float.valueOf((j / j2) * 100.0f));
            }
            setState(new C1835690xrz(j, j2));
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - this.LLIZ >= 3000) {
                this.LLIZ = jCurrentTimeMillis;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("progress: index=");
                sbLIZ.append(getState().LLILLJJLI);
                sbLIZ.append(" position=");
                sbLIZ.append(j);
                sbLIZ.append("ms duration=");
                sbLIZ.append(j2);
                sbLIZ.append("ms");
                C20441214yg.LIZIZ("LiveRecordingV2", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }

    @Override // X.InterfaceC1482530ogN
    public final void onVideoSizeChanged(String str, int i, int i2) {
        if (i > 0 && i2 > 0) {
            if (getState().LLILZLL == i && getState().LLIZ == i2) {
                return;
            }
            setState(new C1835740xs4(i, i2));
        }
    }
}
