package com.ss.android.ugc.aweme.search.performance.metrics.keyboardcost;

import X.AbstractC738140SxQ;
import X.C0QOB;
import X.C0QSJ;
import X.C13LE;
import X.C2217381BqS;
import X.C669820QPc;
import X.C687700QyG;
import X.InterfaceC1146704e9;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC670010QPv;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.search.middle.SearchResultFragmentScope;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchKeyboardCostAssem extends AbstractC738140SxQ implements InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZIL;
    public final C669820QPc LL = new InterfaceC670010QPv() { // from class: X.0QPc
        @Override // X.InterfaceC670010QPv
        public final void onProgress(float f) {
        }

        @Override // X.InterfaceC670010QPv
        public final void LIZ(C669990QPt c669990QPt) throws JSONException {
            String str;
            Long lValueOf;
            Long lValueOf2;
            String str2;
            Long lValueOf3;
            Long lValueOf4;
            Long lValueOf5;
            Long lValueOf6;
            long j;
            String str3;
            Long lValueOf7;
            if (c669990QPt.LIZ) {
                C669870QPh.LIZ.getClass();
                C669860QPg c669860QPg = C669870QPh.LIZIZ;
                if (c669860QPg != null) {
                    long j2 = 0;
                    boolean z = true;
                    if (c669860QPg.LIZ != 0) {
                        if (c669860QPg.LJFF != 0) {
                            z = false;
                        }
                        if (!z) {
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            C669860QPg c669860QPg2 = C669870QPh.LIZIZ;
                            if (c669860QPg2 != null) {
                                j = c669860QPg2.LJFF;
                            } else {
                                j = 0;
                            }
                            c669860QPg.LJ = jCurrentTimeMillis - j;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("type:");
                            C669860QPg c669860QPg3 = C669870QPh.LIZIZ;
                            if (c669860QPg3 != null) {
                                str3 = c669860QPg3.LJI;
                            } else {
                                str3 = null;
                            }
                            sbLIZ.append(str3);
                            sbLIZ.append(" animDuration cost:");
                            C669860QPg c669860QPg4 = C669870QPh.LIZIZ;
                            if (c669860QPg4 != null) {
                                lValueOf7 = Long.valueOf(c669860QPg4.LJ);
                            } else {
                                lValueOf7 = null;
                            }
                            sbLIZ.append(lValueOf7);
                            C2188811AlT.LIZIZ(sbLIZ);
                        }
                        C669860QPg c669860QPg5 = C669870QPh.LIZIZ;
                        if (c669860QPg5 != null) {
                            long jCurrentTimeMillis2 = System.currentTimeMillis();
                            C669860QPg c669860QPg6 = C669870QPh.LIZIZ;
                            if (c669860QPg6 != null) {
                                j2 = c669860QPg6.LIZ;
                            }
                            c669860QPg5.LJII = jCurrentTimeMillis2 - j2;
                        }
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("type:");
                        C669860QPg c669860QPg7 = C669870QPh.LIZIZ;
                        if (c669860QPg7 != null) {
                            str = c669860QPg7.LJI;
                        } else {
                            str = null;
                        }
                        sbLIZ2.append(str);
                        sbLIZ2.append(" cost:");
                        C669860QPg c669860QPg8 = C669870QPh.LIZIZ;
                        if (c669860QPg8 != null) {
                            lValueOf = Long.valueOf(c669860QPg8.LJII);
                        } else {
                            lValueOf = null;
                        }
                        sbLIZ2.append(lValueOf);
                        C2188811AlT.LIZIZ(sbLIZ2);
                        JSONObject jSONObject = new JSONObject();
                        C669860QPg c669860QPg9 = C669870QPh.LIZIZ;
                        if (c669860QPg9 != null) {
                            lValueOf2 = Long.valueOf(c669860QPg9.LJII);
                        } else {
                            lValueOf2 = null;
                        }
                        jSONObject.put("cost", lValueOf2);
                        C669860QPg c669860QPg10 = C669870QPh.LIZIZ;
                        if (c669860QPg10 != null) {
                            str2 = c669860QPg10.LJI;
                        } else {
                            str2 = null;
                        }
                        jSONObject.put("type", str2);
                        C669860QPg c669860QPg11 = C669870QPh.LIZIZ;
                        if (c669860QPg11 != null) {
                            lValueOf3 = Long.valueOf(c669860QPg11.LIZIZ);
                        } else {
                            lValueOf3 = null;
                        }
                        jSONObject.put("open_cost", lValueOf3);
                        C669860QPg c669860QPg12 = C669870QPh.LIZIZ;
                        if (c669860QPg12 != null) {
                            lValueOf4 = Long.valueOf(c669860QPg12.LIZJ);
                        } else {
                            lValueOf4 = null;
                        }
                        jSONObject.put("prepare_cost", lValueOf4);
                        C669860QPg c669860QPg13 = C669870QPh.LIZIZ;
                        if (c669860QPg13 != null) {
                            lValueOf5 = Long.valueOf(c669860QPg13.LIZLLL);
                        } else {
                            lValueOf5 = null;
                        }
                        jSONObject.put("start_cost", lValueOf5);
                        C669860QPg c669860QPg14 = C669870QPh.LIZIZ;
                        if (c669860QPg14 != null) {
                            lValueOf6 = Long.valueOf(c669860QPg14.LJ);
                        } else {
                            lValueOf6 = null;
                        }
                        jSONObject.put("anim_duration", lValueOf6);
                        jSONObject.put("version", 2);
                        C667590QGn.LIZ.getClass();
                        String str4 = C667590QGn.LIZIZ;
                        if (str4 == null) {
                            str4 = "";
                        }
                        jSONObject.put("blankpage_id", str4);
                        AppLogNewUtils.onEventV3("search_trigger_keyboard_monitor", jSONObject);
                        C669870QPh.LIZIZ = null;
                    }
                }
            }
        }

        @Override // X.InterfaceC670010QPv
        public final void LIZIZ(C669990QPt c669990QPt) {
            String str;
            C669870QPh.LIZ.getClass();
            C669860QPg c669860QPg = C669870QPh.LIZIZ;
            if (c669860QPg != null) {
                long j = 0;
                if (c669860QPg.LIZ != 0 && c669860QPg.LIZLLL == 0) {
                    c669860QPg.LJFF = System.currentTimeMillis();
                    C669860QPg c669860QPg2 = C669870QPh.LIZIZ;
                    if (c669860QPg2 != null) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        C669860QPg c669860QPg3 = C669870QPh.LIZIZ;
                        if (c669860QPg3 != null) {
                            j = c669860QPg3.LIZ;
                        }
                        c669860QPg2.LIZLLL = jCurrentTimeMillis - j;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("type:");
                    C669860QPg c669860QPg4 = C669870QPh.LIZIZ;
                    Long lValueOf = null;
                    if (c669860QPg4 != null) {
                        str = c669860QPg4.LJI;
                    } else {
                        str = null;
                    }
                    sbLIZ.append(str);
                    sbLIZ.append(" onStart cost:");
                    C669860QPg c669860QPg5 = C669870QPh.LIZIZ;
                    if (c669860QPg5 != null) {
                        lValueOf = Long.valueOf(c669860QPg5.LIZLLL);
                    }
                    sbLIZ.append(lValueOf);
                    C2188811AlT.LIZIZ(sbLIZ);
                }
            }
        }

        @Override // X.InterfaceC670010QPv
        public final void LIZJ(C669990QPt c669990QPt) {
            String str;
            C669870QPh.LIZ.getClass();
            C669860QPg c669860QPg = C669870QPh.LIZIZ;
            if (c669860QPg != null) {
                long j = 0;
                if (c669860QPg.LIZ != 0 && c669860QPg.LIZJ == 0) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    C669860QPg c669860QPg2 = C669870QPh.LIZIZ;
                    if (c669860QPg2 != null) {
                        j = c669860QPg2.LIZ;
                    }
                    c669860QPg.LIZJ = jCurrentTimeMillis - j;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("type:");
                    C669860QPg c669860QPg3 = C669870QPh.LIZIZ;
                    Long lValueOf = null;
                    if (c669860QPg3 != null) {
                        str = c669860QPg3.LJI;
                    } else {
                        str = null;
                    }
                    sbLIZ.append(str);
                    sbLIZ.append(" onPrepare cost:");
                    C669860QPg c669860QPg4 = C669870QPh.LIZIZ;
                    if (c669860QPg4 != null) {
                        lValueOf = Long.valueOf(c669860QPg4.LIZJ);
                    }
                    sbLIZ.append(lValueOf);
                    C2188811AlT.LIZIZ(sbLIZ);
                }
            }
        }
    };
    public volatile C0QOB LLILLJJLI;
    public InterfaceC665370Q7z LLILLL;
    public C0QSJ LLILZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SearchKeyboardCostAssem.class, "searchKeyboardMonitorAbility", "getSearchKeyboardMonitorAbility()Lcom/ss/android/ugc/aweme/search/common/keyboard/listener/ability/SearchKeyboardMonitorAbility;", 0);
        C13LE.LIZ.getClass();
        LLILZIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{SearchResultFragmentScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SearchResultFragmentScope.class);
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0029 A[Catch: all -> 0x0035, PHI: r1
      0x0029: PHI (r1v1 X.0QSJ) = (r1v0 X.0QSJ), (r1v3 X.0QSJ) binds: [B:8:0x000b, B:13:0x0025] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {, blocks: (B:5:0x0005, B:7:0x0009, B:9:0x000d, B:11:0x0011, B:12:0x0017, B:16:0x0031, B:17:0x0033, B:15:0x0029), top: B:24:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C0QOB bo() {
        /*
            r4 = this;
            X.0QOB r0 = r4.LLILLJJLI
            if (r0 != 0) goto L39
            monitor-enter(r4)
            X.0QOB r0 = r4.LLILLJJLI     // Catch: java.lang.Throwable -> L35
            if (r0 != 0) goto L38
            X.0QSJ r1 = r4.LLILZ     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L29
            X.0Q7z r3 = r4.LLILLL     // Catch: java.lang.Throwable -> L35
            if (r3 != 0) goto L17
            X.0Q7z r3 = X.C687700QyG.LJIIIZ(r4)     // Catch: java.lang.Throwable -> L35
            r4.LLILLL = r3     // Catch: java.lang.Throwable -> L35
        L17:
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L35
            java.lang.Class<com.ss.android.ugc.aweme.search.middle.SearchResultFragmentScope> r1 = com.ss.android.ugc.aweme.search.middle.SearchResultFragmentScope.class
            r0 = 0
            r2[r0] = r1     // Catch: java.lang.Throwable -> L35
            X.0QSJ r1 = X.C687700QyG.LIZLLL(r3, r2)     // Catch: java.lang.Throwable -> L35
            r4.LLILZ = r1     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L29
            r0 = 0
            goto L31
        L29:
            java.lang.Class<X.0QOB> r0 = X.C0QOB.class
            java.lang.Object r0 = r1.getAbility(r0)     // Catch: java.lang.Throwable -> L35
            X.0QOB r0 = (X.C0QOB) r0     // Catch: java.lang.Throwable -> L35
        L31:
            r4.LLILLJJLI = r0     // Catch: java.lang.Throwable -> L35
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L35
            return r0
        L35:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L38:
            monitor-exit(r4)
        L39:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.performance.metrics.keyboardcost.SearchKeyboardCostAssem.bo():X.0QOB");
    }

    @Override // X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C0QOB c0qobBo = bo();
        if (c0qobBo != null) {
            c0qobBo.S0(this.LL);
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C0QOB c0qobBo = bo();
        if (c0qobBo != null) {
            c0qobBo.cb(this.LL);
        }
    }
}
