package com.ss.android.ugc.aweme.ecommerce.search.searchbar.asr;

import X.AbstractC19994813Le;
import X.C1421105hJ;
import X.C1766860w4y;
import X.C1851920yIA;
import X.C1906580ziK;
import X.C1954807lC;
import X.C19EG;
import X.C2188811AlT;
import X.C674620QdA;
import X.C674630QdB;
import X.C674640QdC;
import X.C674650QdD;
import X.C674690QdH;
import X.C786410Ut5;
import X.EnumC674660QdE;
import X.EnumC674680QdG;
import X.InterfaceC2038907yl;
import X.InterfaceC674710QdJ;
import Y.ARunnableS15S1100000_10;
import android.os.Looper;
import androidx.lifecycle.Lifecycle;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.ecommerce.search.searchbar.asr.EcSearchBarAsrHelper;
import java.util.ArrayList;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes11.dex */
public final class EcSearchBarAsrHelper {
    public static final /* synthetic */ int LJIIJ = 0;
    public final Lifecycle LIZ;
    public final String LIZIZ;
    public InterfaceC674710QdJ LIZJ;
    public String LIZLLL;
    public C674630QdB LJ;
    public boolean LJFF;
    public final BPEAHandler LJI = new BPEAHandler(Looper.getMainLooper());
    public ARunnableS15S1100000_10 LJII;
    public final EcSearchBarAsrHelper$hostLifecycleObserver$1 LJIIIIZZ;
    public final C674640QdC LJIIIZ;

    public final void LIZ() {
        ARunnableS15S1100000_10 aRunnableS15S1100000_10 = this.LJII;
        if (aRunnableS15S1100000_10 != null) {
            this.LJI.removeCallbacks(aRunnableS15S1100000_10);
        }
        this.LJII = null;
    }

    public final void LIZJ() {
        String str = this.LIZLLL;
        if (str == null) {
            return;
        }
        C1851920yIA.LIZ.getClass();
        if (C1851920yIA.LIZIZ(str, "manual_stop")) {
            this.LIZLLL = null;
            C674630QdB c674630QdB = this.LJ;
            if (c674630QdB != null) {
                Long l = c674630QdB.LJI;
                if (l != null) {
                    c674630QdB.LJII = Long.valueOf(System.currentTimeMillis() - l.longValue());
                }
                c674630QdB.LJIIIIZZ = EnumC674660QdE.MANUAL_STOP;
            }
            LIZLLL(new C674650QdD(EnumC674680QdG.END_RECORD, this.LJ));
            LIZ();
        }
    }

    public final void LIZIZ(boolean z) {
        EnumC674660QdE enumC674660QdE;
        String str = this.LIZLLL;
        if (str == null) {
            return;
        }
        C1851920yIA.LIZ.getClass();
        if (!C1851920yIA.LJIIIZ(str, true)) {
            return;
        }
        this.LIZLLL = null;
        C674630QdB c674630QdB = this.LJ;
        if (c674630QdB != null) {
            Long l = c674630QdB.LJI;
            if (l != null) {
                c674630QdB.LJII = Long.valueOf(System.currentTimeMillis() - l.longValue());
            }
            if (z) {
                enumC674660QdE = EnumC674660QdE.SWITCH_TAB;
            } else if (C1906580ziK.LJI()) {
                enumC674660QdE = EnumC674660QdE.SYSTEM_INTERRUPT;
            } else {
                enumC674660QdE = EnumC674660QdE.LEAVE_PAGE;
            }
            c674630QdB.LJIIIIZZ = enumC674660QdE;
        }
        LIZ();
    }

    public final void LIZLLL(C674650QdD c674650QdD) {
        C674630QdB c674630QdB;
        C674630QdB c674630QdB2;
        switch (C674690QdH.LIZ[c674650QdD.LIZ.ordinal()]) {
            case 1:
                C674630QdB c674630QdB3 = c674650QdD.LIZIZ;
                if (c674630QdB3 != null) {
                    C1421105hJ.LIZJ("tiktokec_voice_entry_click", c674630QdB3.LIZ());
                }
                break;
            case 2:
            case 3:
                C674630QdB c674630QdB4 = c674650QdD.LIZIZ;
                if (c674630QdB4 != null) {
                    C674620QdA.LIZIZ(c674630QdB4);
                }
                break;
            case 4:
                break;
            case 5:
                if (Intrinsics.LJFF(c674650QdD.LJII, "auto_silence") && (c674630QdB = c674650QdD.LIZIZ) != null) {
                    C674620QdA.LIZIZ(c674630QdB);
                }
                C674630QdB c674630QdB5 = c674650QdD.LIZIZ;
                if (c674630QdB5 != null) {
                    C674620QdA.LIZLLL(c674630QdB5);
                }
                break;
            case 6:
                if (Intrinsics.LJFF(c674650QdD.LJII, "auto_no_speech") && (c674630QdB2 = c674650QdD.LIZIZ) != null) {
                    C674620QdA.LIZIZ(c674630QdB2);
                }
                break;
            case 7:
                C674630QdB c674630QdB6 = c674650QdD.LIZIZ;
                if (c674630QdB6 != null) {
                    C674620QdA.LIZIZ(c674630QdB6);
                    C674620QdA.LIZLLL(c674630QdB6);
                }
                break;
            default:
                throw new C1954807lC();
        }
        InterfaceC674710QdJ interfaceC674710QdJ = this.LIZJ;
        if (interfaceC674710QdJ != null) {
            interfaceC674710QdJ.LIZ(c674650QdD);
        }
    }

    public final void LJ(C19EG c19eg) {
        this.LIZLLL = null;
        C1851920yIA.LIZ.getClass();
        String string = UUID.randomUUID().toString();
        if (C1851920yIA.LJIIIIZZ(string, c19eg, this.LJIIIZ, null)) {
            this.LIZLLL = string;
            if (this.LJ == null) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                StringBuilder sb = new StringBuilder(4);
                int i = 0;
                do {
                    sb.append("0123456789abcdefghijklmnopqrstuvwxyz".charAt(AbstractC19994813Le.Default.nextInt(36)));
                    i++;
                } while (i < 4);
                String string2 = sb.toString();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("asr_");
                sbLIZ.append(jCurrentTimeMillis);
                sbLIZ.append('_');
                sbLIZ.append(string2);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                C1766860w4y.LIZ.getClass();
                C674630QdB c674630QdB = new C674630QdB(strLIZIZ, this.LIZIZ, C1766860w4y.LIZIZ("ec_search_session_id"));
                this.LJ = c674630QdB;
                InterfaceC674710QdJ interfaceC674710QdJ = this.LIZJ;
                if (interfaceC674710QdJ != null) {
                    interfaceC674710QdJ.t3(c674630QdB);
                }
            }
            C674630QdB c674630QdB2 = this.LJ;
            if (c674630QdB2 != null) {
                c674630QdB2.LJI = null;
                c674630QdB2.LJII = null;
                c674630QdB2.LJIIIIZZ = null;
                c674630QdB2.LJIIIZ = null;
                c674630QdB2.LJIIJ = 0;
                c674630QdB2.LJIIJJI = "";
                c674630QdB2.LJIIL = "";
                c674630QdB2.LJIILIIL = null;
                c674630QdB2.LJIILJJIL = null;
                c674630QdB2.LJIILL = "";
            }
            C674630QdB c674630QdB3 = this.LJ;
            if (c674630QdB3 != null) {
                c674630QdB3.LJ++;
                c674630QdB3.LJI = Long.valueOf(System.currentTimeMillis());
            }
            LIZLLL(new C674650QdD(EnumC674680QdG.START_RECORD, this.LJ));
            LIZ();
            ARunnableS15S1100000_10 aRunnableS15S1100000_10 = new ARunnableS15S1100000_10(this, string, 9);
            this.LJII = aRunnableS15S1100000_10;
            C786410Ut5.LJLIIL(50000L, this.LJI, aRunnableS15S1100000_10);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0QdC] */
    public EcSearchBarAsrHelper(Lifecycle lifecycle, String str) {
        this.LIZ = lifecycle;
        this.LIZIZ = str;
        EcSearchBarAsrHelper$hostLifecycleObserver$1 ecSearchBarAsrHelper$hostLifecycleObserver$1 = new EcSearchBarAsrHelper$hostLifecycleObserver$1(this);
        this.LJIIIIZZ = ecSearchBarAsrHelper$hostLifecycleObserver$1;
        this.LJIIIZ = new InterfaceC2038907yl() { // from class: X.0QdC
            @Override // X.InterfaceC2038907yl
            public final void onVolumeUpdate(String str2, JSONArray jSONArray) {
                if (!Intrinsics.LJFF(str2, this.LL.LIZLLL)) {
                    return;
                }
                int length = jSONArray.length();
                ArrayList arrayList = new ArrayList(length);
                for (int i = 0; i < length; i++) {
                    arrayList.add(Float.valueOf((float) jSONArray.optDouble(i, 0.0d)));
                }
                InterfaceC674710QdJ interfaceC674710QdJ = this.LL.LIZJ;
                if (interfaceC674710QdJ != null) {
                    interfaceC674710QdJ.LIZIZ(arrayList);
                }
            }

            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            @Override // X.InterfaceC2038907yl
            public final void onResult(String str2, String str3, String str4, Integer num, String str5, long j, boolean z, String str6, String str7) {
                EnumC674680QdG enumC674680QdG;
                this.LL.getClass();
                switch (str3.hashCode()) {
                    case -1867169789:
                        if (!str3.equals("success")) {
                            return;
                        }
                        enumC674680QdG = EnumC674680QdG.SUCCESS;
                        break;
                        break;
                    case -1367724422:
                        if (!str3.equals("cancel")) {
                            return;
                        }
                        enumC674680QdG = EnumC674680QdG.CANCEL;
                        break;
                        break;
                    case -1313911455:
                        if (!str3.equals("timeout")) {
                            return;
                        }
                        enumC674680QdG = EnumC674680QdG.TIMEOUT;
                        break;
                        break;
                    case 3135262:
                        if (!str3.equals("fail")) {
                            return;
                        }
                        enumC674680QdG = EnumC674680QdG.FAILED;
                        break;
                        break;
                    default:
                        return;
                }
                if (enumC674680QdG == null) {
                    return;
                }
                C674630QdB c674630QdB = this.LL.LJ;
                if (c674630QdB != null) {
                    c674630QdB.LJIILJJIL = str3;
                    if (str4 != null) {
                        c674630QdB.LJIIL = str4;
                    }
                    if (num != null) {
                        c674630QdB.LJIILIIL = Integer.valueOf(num.intValue());
                    }
                    Long lValueOf = Long.valueOf(j);
                    if (lValueOf.longValue() > 0) {
                        long jLongValue = lValueOf.longValue();
                        Long l = c674630QdB.LJII;
                        if (l == null) {
                            c674630QdB.LJII = Long.valueOf(jLongValue);
                            c674630QdB.LJIIIZ = Long.valueOf(jLongValue);
                        } else {
                            c674630QdB.LJIIIZ = Long.valueOf(jLongValue - l.longValue());
                        }
                    }
                    if (enumC674680QdG == EnumC674680QdG.TIMEOUT) {
                        c674630QdB.LJIIIIZZ = EnumC674660QdE.TIMEOUT;
                    }
                    if (str7 != null) {
                        int iHashCode = str7.hashCode();
                        if (iHashCode != -310524709) {
                            if (iHashCode != -82617839) {
                                if (iHashCode == 1978005136 && str7.equals("auto_no_speech")) {
                                    c674630QdB.LJIIIIZZ = EnumC674660QdE.AUTO_NO_SPEECH;
                                }
                            } else if (str7.equals("auto_silence")) {
                                c674630QdB.LJIIIIZZ = EnumC674660QdE.AUTO_SILENCE;
                            }
                        } else if (str7.equals("manual_stop")) {
                            c674630QdB.LJIIIIZZ = EnumC674660QdE.MANUAL_STOP;
                        }
                    }
                }
                if (z && Intrinsics.LJFF(str2, this.LL.LIZLLL)) {
                    EcSearchBarAsrHelper ecSearchBarAsrHelper = this.LL;
                    ecSearchBarAsrHelper.LIZLLL = null;
                    ecSearchBarAsrHelper.LIZ();
                }
                EcSearchBarAsrHelper ecSearchBarAsrHelper2 = this.LL;
                ecSearchBarAsrHelper2.LIZLLL(new C674650QdD(enumC674680QdG, ecSearchBarAsrHelper2.LJ, str4, num, str5, Long.valueOf(j), str6, str7));
            }
        };
        if (lifecycle != null) {
            lifecycle.addObserver(ecSearchBarAsrHelper$hostLifecycleObserver$1);
        }
    }
}
