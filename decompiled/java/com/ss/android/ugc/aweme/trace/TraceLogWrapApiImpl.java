package com.ss.android.ugc.aweme.trace;

import X.AbstractC794590VEz;
import X.C0VG5;
import X.C0VG6;
import X.C0VGA;
import X.C1954807lC;
import X.C2188811AlT;
import X.C794670VFh;
import X.C794750VFp;
import X.C794850VFz;
import X.C807000VlC;
import X.C807020VlE;
import X.C807040VlG;
import X.C807080VlK;
import X.C807090VlL;
import X.C807100VlM;
import X.C807140VlQ;
import X.C807150VlR;
import X.C807160VlS;
import X.C807170VlT;
import X.C807180VlU;
import X.C807190VlV;
import X.C807210VlX;
import X.C807230VlZ;
import X.C807240Vla;
import X.EnumC794690VFj;
import X.EnumC794730VFn;
import X.EnumC807010VlD;
import X.EnumC807050VlH;
import X.EnumC807060VlI;
import X.InterfaceC794710VFl;
import X.InterfaceC794760VFq;
import android.os.Process;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Iterator;
import kotlin.jvm.internal.AwS127S1100000_13;
import kotlin.jvm.internal.AwS20S1100100_13;
import kotlin.jvm.internal.AwS222S0300000_13;
import kotlin.jvm.internal.AwS379S0200000_13;
import kotlin.jvm.internal.AwS592S0100000_13;
import kotlin.jvm.internal.AwS5S3100000_13;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public final class TraceLogWrapApiImpl implements ITraceLogWrapApi {
    public final C807190VlV LIZ = new C807190VlV();
    public final C807040VlG LIZIZ = new C807040VlG();

    public static boolean LJIIL() {
        return Intrinsics.LJFF(C0VGA.LIZ().globalEnable, Boolean.TRUE);
    }

    @Override // com.ss.android.ugc.aweme.trace.ITraceLogWrapApi
    public final void LJI() {
        if (LJIIL()) {
            C0VGA.LJIIIIZZ(new AwS592S0100000_13(this, 50));
        }
    }

    public static boolean LJIIJJI(EnumC807010VlD enumC807010VlD) {
        if (enumC807010VlD != EnumC807010VlD.ORIGIN_LOG && enumC807010VlD != EnumC807010VlD.ALOG && enumC807010VlD != EnumC807010VlD.UNKNOWN_LOG) {
            return !C0VGA.LIZLLL();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.trace.ITraceLogWrapApi
    public final void LIZ(C807170VlT c807170VlT) {
        if (!LJIIL()) {
            return;
        }
        C0VGA.LJIIIIZZ(new AwS379S0200000_13(this, c807170VlT, 3));
    }

    @Override // com.ss.android.ugc.aweme.trace.ITraceLogWrapApi
    public final void LIZIZ(String str) {
        long jLongValue;
        if (!LJIIL()) {
            return;
        }
        Long l = C0VGA.LIZ().logTraceDelayTs;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 15000;
        }
        C0VGA.LJII(jLongValue, new AwS20S1100100_13(this, str, jLongValue, 0));
    }

    @Override // com.ss.android.ugc.aweme.trace.ITraceLogWrapApi
    public final String LJ(String str) {
        C807090VlL c807090VlL;
        if (!LJIIL()) {
            return "";
        }
        C807000VlC.LIZ.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ttk_trace_span_");
        sbLIZ.append(C807000VlC.LIZIZ.incrementAndGet());
        sbLIZ.append("-00");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C807190VlV c807190VlV = this.LIZ;
        c807190VlV.getClass();
        C807160VlS c807160VlS = C0VGA.LIZ.get(str);
        if (c807160VlS != null) {
            c807190VlV.LIZ.getClass();
            if (C0VGA.LIZLLL() && C0VGA.LJFF()) {
                c807090VlL = new C807090VlL(strLIZIZ, c807160VlS, null, 252);
                C0VGA.LJIIIIZZ(new AwS379S0200000_13(c807090VlL, (C807090VlL) null, 19));
            } else {
                c807090VlL = new C807090VlL(strLIZIZ, c807160VlS, C807020VlE.LIZ(c807160VlS, null), 188);
            }
            C0VGA.LIZIZ.put(c807090VlL.LIZ, c807090VlL);
        }
        return strLIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.trace.ITraceLogWrapApi
    public final String LJFF(String str) {
        if (!LJIIL()) {
            return "";
        }
        C807000VlC.LIZ.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ttk_trace_");
        sbLIZ.append(C807000VlC.LIZIZ.incrementAndGet());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        this.LIZ.LIZ.getClass();
        AbstractC794590VEz abstractC794590VEzLIZ = C794670VFh.LIZ("app.ui.page", EnumC794690VFj.BATCH, EnumC794730VFn.SERIAL_WRAPPER_MODE, C0VGA.LIZJ(), C794850VFz.LIZ, str);
        C0VGA.LJIIIIZZ(new AwS592S0100000_13(abstractC794590VEzLIZ, 68));
        System.currentTimeMillis();
        C0VGA.LIZ.put(strLIZIZ, new C807160VlS(abstractC794590VEzLIZ, strLIZIZ, "app.ui.page", str));
        return strLIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.trace.ITraceLogWrapApi
    public final void LJII(String str) {
        if (!LJIIL()) {
            return;
        }
        C0VGA.LJIIIIZZ(new AwS127S1100000_13(this, str, 1));
    }

    @Override // com.ss.android.ugc.aweme.trace.ITraceLogWrapApi
    public final String LJIIJ(String str) {
        C807090VlL c807090VlL;
        if (!LJIIL()) {
            return "";
        }
        C807000VlC.LIZ.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ttk_trace_span_");
        sbLIZ.append(C807000VlC.LIZIZ.incrementAndGet());
        sbLIZ.append("-00");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C807190VlV c807190VlV = this.LIZ;
        c807190VlV.getClass();
        C807090VlL c807090VlLLIZIZ = C0VGA.LIZIZ(str);
        if (c807090VlLLIZIZ != null) {
            c807190VlV.LIZ.getClass();
            if (C0VGA.LIZLLL() && C0VGA.LJFF()) {
                c807090VlL = new C807090VlL(strLIZIZ, c807090VlLLIZIZ.LIZIZ, null, 248);
                C0VGA.LJIIIIZZ(new AwS379S0200000_13(c807090VlL, c807090VlLLIZIZ, 19));
            } else {
                C807160VlS c807160VlS = c807090VlLLIZIZ.LIZIZ;
                c807090VlL = new C807090VlL(strLIZIZ, c807160VlS, C807020VlE.LIZ(c807160VlS, c807090VlLLIZIZ), 184);
            }
            C0VGA.LIZIZ.put(c807090VlL.LIZ, c807090VlL);
        }
        return strLIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.trace.ITraceLogWrapApi
    public final void LIZJ(EnumC807060VlI enumC807060VlI, C807180VlU c807180VlU) {
        if (!LJIIL()) {
            return;
        }
        C0VGA.LJIIIIZZ(new AwS222S0300000_13(enumC807060VlI, this, c807180VlU, 3));
    }

    @Override // com.ss.android.ugc.aweme.trace.ITraceLogWrapApi
    public final void LIZLLL(EnumC807060VlI enumC807060VlI, C807150VlR c807150VlR) {
        if (!LJIIL()) {
            return;
        }
        C0VGA.LJIIIIZZ(new AwS222S0300000_13(enumC807060VlI, this, c807150VlR, 5));
    }

    @Override // com.ss.android.ugc.aweme.trace.ITraceLogWrapApi
    public final void LJIIIIZZ(EnumC807060VlI enumC807060VlI, C807140VlQ c807140VlQ) {
        if (!LJIIL()) {
            return;
        }
        C0VGA.LJIIIIZZ(new AwS222S0300000_13(enumC807060VlI, this, c807140VlQ, 4));
    }

    public final void LJIILIIL(C807100VlM c807100VlM, long j) {
        InterfaceC794710VFl interfaceC794710VFl;
        InterfaceC794760VFq interfaceC794760VFq;
        Iterator<String> itKeys;
        int iIntValue;
        Object objOpt;
        JSONObject jSONObject = c807100VlM.LIZJ;
        if (jSONObject != null) {
            if (c807100VlM.LIZLLL && (itKeys = jSONObject.keys()) != null) {
                Integer num = C0VGA.LIZ().unsampledSingleParamMaxSize;
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 100;
                }
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (next != null && (objOpt = jSONObject.opt(next)) != null) {
                        String string = objOpt.toString();
                        if (string.length() > iIntValue) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(string.substring(0, iIntValue));
                            sbLIZ.append("...");
                            jSONObject.put(next, C2188811AlT.LIZIZ(sbLIZ));
                        }
                    }
                }
            }
            C807040VlG c807040VlG = this.LIZIZ;
            String str = c807100VlM.LIZ;
            c807040VlG.getClass();
            C807090VlL c807090VlLLIZIZ = C0VGA.LIZIZ(str);
            if (c807090VlLLIZIZ != null) {
                c807040VlG.LIZ.getClass();
                c807090VlLLIZIZ.LJ = jSONObject;
            }
        }
        C807040VlG c807040VlG2 = this.LIZIZ;
        String str2 = c807100VlM.LIZ;
        c807040VlG2.getClass();
        C807090VlL c807090VlLLIZIZ2 = C0VGA.LIZIZ(str2);
        if (c807090VlLLIZIZ2 != null) {
            c807040VlG2.LIZ.getClass();
            final C807210VlX c807210VlX = c807090VlLLIZIZ2.LIZLLL;
            if (c807210VlX != null) {
                EnumC807050VlH enumC807050VlH = c807210VlX.LIZIZ;
                Object obj = c807090VlLLIZIZ2.LJFF;
                if ((obj instanceof InterfaceC794710VFl) && (interfaceC794710VFl = (InterfaceC794710VFl) obj) != null) {
                    int i = C807080VlK.LIZ[enumC807050VlH.ordinal()];
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i == 4) {
                                    interfaceC794760VFq = new C807240Vla(c807210VlX) { // from class: X.0VlY
                                        public final C807210VlX LIZLLL;

                                        @Override // X.InterfaceC794760VFq
                                        public final JSONObject LIZ() throws JSONException {
                                            JSONObject jSONObject2 = new JSONObject();
                                            jSONObject2.put("url", this.LIZ);
                                            jSONObject2.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, this.LIZIZ);
                                            jSONObject2.put("duration", this.LIZJ);
                                            jSONObject2.put("x-tt-logid", this.LIZLLL.LJIIJJI);
                                            return jSONObject2;
                                        }

                                        /* JADX WARN: Illegal instructions before constructor call */
                                        {
                                            String path = UriProtector.parse(c807210VlX.LJIIIIZZ).getPath();
                                            super(path == null ? "" : path, c807210VlX.LJIIIZ, c807210VlX.LJIIJ);
                                            this.LIZLLL = c807210VlX;
                                        }
                                    };
                                } else {
                                    throw new C1954807lC();
                                }
                            } else {
                                interfaceC794760VFq = new C0VG5(c807210VlX) { // from class: X.0VlP
                                    /* JADX WARN: Illegal instructions before constructor call */
                                    {
                                        String str3 = c807210VlX.LJFF;
                                        new InterfaceC794760VFq(str3 == null ? "" : str3, c807210VlX.LJII, c807210VlX.LJI) { // from class: X.0VG5
                                            public static int LIZLLL;
                                            public static String LJ;
                                            public final String LIZ;
                                            public final String LIZIZ;
                                            public final long LIZJ;

                                            @Override // X.InterfaceC794760VFq
                                            public final JSONObject LIZ() throws JSONException {
                                                JSONObject jSONObject2 = new JSONObject();
                                                jSONObject2.put("event", this.LIZ);
                                                if (!TextUtils.isEmpty(this.LIZIZ)) {
                                                    jSONObject2.put("thread_id", this.LIZJ);
                                                    jSONObject2.put("thread_name", this.LIZIZ);
                                                }
                                                if (TextUtils.isEmpty(LJ)) {
                                                    LIZLLL = Process.myPid();
                                                    LJ = C792400V6o.LIZIZ();
                                                }
                                                jSONObject2.put("process_id", LIZLLL);
                                                jSONObject2.put("process_name", LJ);
                                                return jSONObject2;
                                            }

                                            {
                                                this.LIZ = str;
                                                this.LIZIZ = str;
                                                this.LIZJ = j;
                                            }
                                        };
                                    }
                                };
                            }
                        } else {
                            interfaceC794760VFq = new C0VG6(c807210VlX) { // from class: X.0VlO
                                /* JADX WARN: Illegal instructions before constructor call */
                                {
                                    String str3 = c807210VlX.LJFF;
                                    new InterfaceC794760VFq(str3 == null ? "" : str3) { // from class: X.0VG6
                                        public final String LIZ;

                                        @Override // X.InterfaceC794760VFq
                                        public final JSONObject LIZ() throws JSONException {
                                            JSONObject jSONObject2 = new JSONObject();
                                            jSONObject2.put("service_name", this.LIZ);
                                            jSONObject2.put("log_type", "service_monitor");
                                            return jSONObject2;
                                        }

                                        {
                                            this.LIZ = str;
                                        }
                                    };
                                }
                            };
                        }
                    } else {
                        interfaceC794760VFq = new C807230VlZ(c807210VlX) { // from class: X.0VlW
                            /* JADX WARN: Illegal instructions before constructor call */
                            {
                                boolean z = c807210VlX.LIZLLL;
                                super(z, c807210VlX.LIZJ);
                                int i2 = 1;
                                if (z) {
                                    if (c807210VlX.LJ > 1) {
                                        i2 = 3;
                                    }
                                } else if (c807210VlX.LJ <= 1) {
                                    i2 = 2;
                                } else {
                                    i2 = 4;
                                }
                                this.LIZ = i2;
                            }
                        };
                    }
                    interfaceC794710VFl.LJ(new C794750VFp(interfaceC794710VFl, enumC807050VlH.getType(), c807090VlLLIZIZ2.LIZJ.getCategory(), interfaceC794760VFq, c807090VlLLIZIZ2.LJ, c807210VlX.LIZ ? 1 : 0));
                    Long l = c807090VlLLIZIZ2.LJI;
                    if (l != null) {
                        j = l.longValue();
                    }
                    if (c807090VlLLIZIZ2.LJI == null) {
                        c807090VlLLIZIZ2.LJI = Long.valueOf(j);
                    }
                    interfaceC794710VFl.LIZ(j, j);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.trace.ITraceLogWrapApi
    public final void LJIIIZ(String str, String str2, String str3) {
        if (!LJIIL()) {
            return;
        }
        C0VGA.LJIIIIZZ(new AwS5S3100000_13(this, str, str2, str3, 1));
    }
}
