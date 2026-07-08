package tuk;

import X.C13LP;
import X.C1624200sMs;
import X.C1624550sNR;
import X.C1625440sOs;
import X.C1625920sPe;
import X.C1629340sVA;
import X.C1629430sVJ;
import X.C1629440sVK;
import X.C1629460sVM;
import X.C1629520sVS;
import X.C1629620sVc;
import X.C2281551ESb;
import X.EnumC1448980noG;
import X.InterfaceC1629300sV6;
import X.InterfaceC1629550sVV;
import X.InterfaceC1629760sVq;
import X.InterfaceC1632620saS;
import X.InterfaceC1635390sev;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: loaded from: classes26.dex */
public final class f implements InterfaceC1629760sVq {
    public final InterfaceC1629300sV6 LIZ;
    public final Function0<InterfaceC1629550sVV> LIZIZ;
    public final Function0<InterfaceC1635390sev> LIZJ;
    public final HashMap<String, Effect> LIZLLL = new HashMap<>();

    @Override // X.InterfaceC1629760sVq
    public final boolean LIZ(Effect effect, boolean z) {
        boolean zContainsKey = this.LIZLLL.containsKey(effect.getId());
        if (z) {
            if (!zContainsKey && !this.LIZ.LIZIZ(effect)) {
                return false;
            }
            return true;
        }
        return zContainsKey;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.0sVH] */
    @Override // X.InterfaceC1632640saU
    public final void LIZIZ(C1629340sVA c1629340sVA, final InterfaceC1632620saS<C1629340sVA, Effect, C1629620sVc> interfaceC1632620saS) {
        List<String> music;
        String str;
        List<String> music2;
        final C1629340sVA c1629340sVA2 = c1629340sVA;
        boolean zLIZ = this.LIZ.LIZ(c1629340sVA2.LIZ);
        final ?? r3 = new InterfaceC1632620saS<C1629340sVA, Effect, C1629620sVc>() { // from class: X.0sVH
            @Override // X.InterfaceC1632620saS
            public final void LIZJ(int i, Object obj) {
                interfaceC1632620saS.LIZJ(i, obj);
            }

            @Override // X.InterfaceC1632620saS
            public final void LIZLLL(C1629340sVA c1629340sVA3, Effect effect) {
                interfaceC1632620saS.LIZLLL(c1629340sVA3, effect);
            }

            @Override // X.InterfaceC1632620saS
            public final void LIZ(C1629340sVA c1629340sVA3, Effect effect, C1629620sVc c1629620sVc, long j) {
                C1629340sVA c1629340sVA4 = c1629340sVA3;
                this.LIZ.LIZLLL.put(c1629340sVA4.LIZ.getId(), c1629340sVA4.LIZ);
                interfaceC1632620saS.LIZ(c1629340sVA4, effect, c1629620sVc, j);
            }

            @Override // X.InterfaceC1632620saS
            public final void LIZIZ(C1629340sVA c1629340sVA3, Exception exc, C1629620sVc c1629620sVc, long j) {
                interfaceC1632620saS.LIZIZ(c1629340sVA3, exc, c1629620sVc, j);
            }
        };
        this.LIZIZ.invoke().LIZIZ();
        Effect effect = c1629340sVA2.LIZ;
        if ((!C1624200sMs.LJIILL(effect) || (music2 = effect.getMusic()) == null || music2.isEmpty()) && (!C1624550sNR.LIZIZ(effect) || (music = effect.getMusic()) == null || music.isEmpty())) {
            if (zLIZ) {
                r3.LIZLLL(c1629340sVA2, c1629340sVA2.LIZ);
                return;
            } else {
                LIZJ(c1629340sVA2, new IEffectDownloadProgressListener(c1629340sVA2, r3) { // from class: X.0sVI
                    public final C1629340sVA LIZ;
                    public final InterfaceC1632620saS<C1629340sVA, Effect, C1629620sVc> LIZIZ;
                    public long LIZJ = System.currentTimeMillis();
                    public long LIZLLL;

                    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
                    public final void onStart(Effect effect2) {
                        this.LIZJ = System.currentTimeMillis();
                    }

                    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                    public final void onSuccess(Effect effect2) {
                        Effect effect3 = effect2;
                        long jCurrentTimeMillis = System.currentTimeMillis() - this.LIZJ;
                        InterfaceC1632620saS<C1629340sVA, Effect, C1629620sVc> interfaceC1632620saS2 = this.LIZIZ;
                        C1629340sVA c1629340sVA3 = this.LIZ;
                        if (effect3 == null) {
                            effect3 = c1629340sVA3.LIZ;
                        }
                        interfaceC1632620saS2.LIZ(c1629340sVA3, effect3, new C1629620sVc(this.LIZLLL, 3), jCurrentTimeMillis);
                    }

                    {
                        this.LIZ = c1629340sVA2;
                        this.LIZIZ = r3;
                    }

                    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
                    public final void onFail(Effect effect2, ExceptionResult exceptionResult) {
                        this.LIZIZ.LIZIZ(this.LIZ, exceptionResult.getException(), new C1629620sVc(Integer.valueOf(exceptionResult.getErrorCode()), exceptionResult.getMsg(), this.LIZLLL), System.currentTimeMillis() - this.LIZJ);
                    }

                    @Override // com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener
                    public final void onProgress(Effect effect2, int i, long j) {
                        this.LIZLLL = j;
                        this.LIZIZ.LIZJ(i, this.LIZ);
                    }
                });
                return;
            }
        }
        C1629430sVJ c1629430sVJ = new C1629430sVJ(c1629340sVA2, r3);
        if (zLIZ) {
            c1629430sVJ.LIZLLL();
        } else {
            LIZJ(c1629340sVA2, c1629430sVJ);
        }
        List<String> music3 = c1629340sVA2.LIZ.getMusic();
        if (music3 != null && (str = (String) C13LP.LJJJLL(music3)) != null) {
            this.LIZIZ.invoke().LIZ(str, new C1629520sVS(c1629430sVJ), new C1629460sVM(c1629430sVJ), new C1629440sVK(c1629430sVJ), !LIZ(c1629340sVA2.LIZ, false));
        } else {
            c1629430sVJ.onFailed();
        }
    }

    public final void LIZJ(C1629340sVA c1629340sVA, IEffectDownloadProgressListener iEffectDownloadProgressListener) {
        C1625440sOs c1625440sOs;
        C1625920sPe c1625920sPe;
        EnumC1448980noG enumC1448980noG;
        C2281551ESb c2281551ESb = C2281551ESb.LIZIZ;
        if (c2281551ESb.LJIILJJIL()) {
            C1625440sOs c1625440sOs2 = c1629340sVA.LIZJ;
            if (c1625440sOs2 != null) {
                enumC1448980noG = c1625440sOs2.LIZJ;
            } else {
                enumC1448980noG = null;
            }
            if (enumC1448980noG == EnumC1448980noG.UI_CLICK) {
                this.LIZJ.invoke().LJ(c1629340sVA.LIZ, true, true, true, iEffectDownloadProgressListener);
                return;
            }
        }
        if (c2281551ESb.LJIILJJIL() && (c1625440sOs = c1629340sVA.LIZJ) != null && (c1625920sPe = c1625440sOs.LJIIIZ) != null && c1625920sPe.LIZ) {
            InterfaceC1635390sev interfaceC1635390sevInvoke = this.LIZJ.invoke();
            Effect effect = c1629340sVA.LIZ;
            c1629340sVA.LIZJ.LJIIIZ.getClass();
            interfaceC1635390sevInvoke.LJ(effect, true, false, true, iEffectDownloadProgressListener);
            return;
        }
        this.LIZJ.invoke().LJIIL(c1629340sVA.LIZ, iEffectDownloadProgressListener);
    }

    public f(InterfaceC1629300sV6 interfaceC1629300sV6, AwS569S0100000_25 awS569S0100000_25, AwS569S0100000_25 awS569S0100000_252) {
        this.LIZ = interfaceC1629300sV6;
        this.LIZIZ = awS569S0100000_25;
        this.LIZJ = awS569S0100000_252;
    }
}
