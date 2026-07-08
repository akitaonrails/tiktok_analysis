package com.ss.android.ugc.aweme.explore.monitor.lcp;

import X.AnonymousClass1581;
import X.AnonymousClass1582;
import X.C1267604xe;
import X.C15V4;
import X.C1778300wNQ;
import X.C20531715Vr;
import X.C20531815Vs;
import X.EnumC1083610eIx;
import X.EnumC1779750wPl;
import X.EnumC20526215To;
import X.EnumC20531915Vt;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes32.dex */
public final class ExploreLCPTracker {
    public static final ExploreLCPTracker INSTANCE = new ExploreLCPTracker();
    public static volatile boolean hasEverEnded;
    public static volatile C20531715Vr monitor;
    public static volatile C1778300wNQ pending;

    private final C1778300wNQ consumePending() {
        C1778300wNQ c1778300wNQ = pending;
        pending = null;
        return c1778300wNQ;
    }

    public final void markDataLoadSuccess$explore_release(Long l) {
        C20531715Vr c20531715Vr;
        if (!C1267604xe.LIZ() || (c20531715Vr = monitor) == null || ignoreFromMainTab(c20531715Vr, l)) {
            return;
        }
        synchronized (c20531715Vr) {
            if (!c20531715Vr.LLJJJ) {
                if (!c20531715Vr.LLJILJIL) {
                    c20531715Vr.LLJILJIL = true;
                    c20531715Vr.LLJILJILJ = Long.valueOf(c20531715Vr.LIZIZ());
                    c20531715Vr.LJIIL();
                    c20531715Vr.LJIILIIL();
                }
            }
        }
        evictIfEnded(c20531715Vr, "markDataLoadSuccess");
    }

    public final void markVisible(Long l) {
        C20531715Vr c20531715Vr;
        if (!C1267604xe.LIZ() || (c20531715Vr = monitor) == null || ignoreFromMainTab(c20531715Vr, l)) {
            return;
        }
        synchronized (c20531715Vr) {
            if (c20531715Vr.LLJJJ) {
                return;
            }
            if (!c20531715Vr.LLJJJIL) {
                c20531715Vr.LLJJJIL = true;
                if (c20531715Vr.LLILLL == null) {
                    c20531715Vr.LLILLL = Long.valueOf(c20531715Vr.LIZIZ());
                }
            }
        }
    }

    public final void onChangeTab$explore_release(Long l) {
        C20531715Vr c20531715Vr;
        if (!C1267604xe.LIZ() || (c20531715Vr = monitor) == null) {
            return;
        }
        synchronized (c20531715Vr) {
            c20531715Vr.LIZ(EnumC20531915Vt.CHANGE_TAB);
        }
        evictIfEnded(c20531715Vr, "onChangeTab");
    }

    public final void onDisappear$explore_release(Long l) {
        C20531715Vr c20531715Vr;
        if (!C1267604xe.LIZ() || (c20531715Vr = monitor) == null) {
            return;
        }
        synchronized (c20531715Vr) {
            c20531715Vr.LIZ(EnumC20531915Vt.DISAPPEAR);
        }
        evictIfEnded(c20531715Vr, "onDisappear");
    }

    public final void onEnterBackground$explore_release(Long l) {
        C20531715Vr c20531715Vr;
        if (!C1267604xe.LIZ() || (c20531715Vr = monitor) == null) {
            return;
        }
        synchronized (c20531715Vr) {
            c20531715Vr.LIZ(EnumC20531915Vt.ENTER_BACKGROUND);
        }
        evictIfEnded(c20531715Vr, "onEnterBackground");
    }

    private final synchronized void evictIfEnded(C20531715Vr c20531715Vr, String str) {
        if (!c20531715Vr.LJ()) {
            return;
        }
        if (monitor == c20531715Vr) {
            monitor = null;
            hasEverEnded = true;
        }
    }

    private final boolean ignoreFromMainTab(C20531715Vr c20531715Vr, Long l) {
        boolean z;
        synchronized (c20531715Vr) {
            z = c20531715Vr.LL instanceof AnonymousClass1581;
        }
        if (z && l != null && l.longValue() == 0) {
            return true;
        }
        return false;
    }

    public final void markFailure$explore_release(Long l, EnumC1779750wPl enumC1779750wPl) {
        C20531715Vr c20531715Vr;
        if (!C1267604xe.LIZ() || (c20531715Vr = monitor) == null || ignoreFromMainTab(c20531715Vr, l)) {
            return;
        }
        synchronized (c20531715Vr) {
            if (!c20531715Vr.LLJJJ) {
                c20531715Vr.LLJJJJ = true;
                c20531715Vr.LLJJJJJIL = enumC1779750wPl;
                if (enumC1779750wPl == EnumC1779750wPl.DATA_LOAD) {
                    c20531715Vr.LLJJJ = true;
                    C20531715Vr.LLJJL.removeCallbacks(c20531715Vr.LLJJJJLIIL);
                    if (!c20531715Vr.LLJJIJIL) {
                        c20531715Vr.LJIIIIZZ(EnumC1083610eIx.END, EnumC20531915Vt.FAILED);
                    }
                }
            }
        }
        evictIfEnded(c20531715Vr, "markFailure");
    }

    public final void pullType$explore_release(Long l, int i) {
        C20531715Vr c20531715Vr;
        if (!C1267604xe.LIZ() || (c20531715Vr = monitor) == null || ignoreFromMainTab(c20531715Vr, l)) {
            return;
        }
        synchronized (c20531715Vr) {
            if (c20531715Vr.LLJJJ) {
                return;
            }
            if (c20531715Vr.LLJJI == null) {
                c20531715Vr.LLJJI = Integer.valueOf(i);
            }
        }
    }

    public final void recordStage$explore_release(Long l, C15V4 c15v4) {
        C20531715Vr c20531715Vr;
        if (!C1267604xe.LIZ() || (c20531715Vr = monitor) == null || ignoreFromMainTab(c20531715Vr, l)) {
            return;
        }
        c20531715Vr.LJII(c15v4);
    }

    public final boolean snapshotVisibleFirstScreen$explore_release(Long l, Set<String> set) {
        C20531715Vr c20531715Vr;
        boolean z = false;
        if (!C1267604xe.LIZ() || (c20531715Vr = monitor) == null || ignoreFromMainTab(c20531715Vr, l)) {
            return false;
        }
        synchronized (c20531715Vr) {
            if (!c20531715Vr.LLJJJ) {
                if (!set.isEmpty()) {
                    if (!c20531715Vr.LLJI) {
                        ((LinkedHashMap) c20531715Vr.LLIZLLLIL).keySet().retainAll(set);
                        c20531715Vr.LLJI = true;
                        c20531715Vr.LJIIL();
                        c20531715Vr.LJIILIIL();
                        z = !c20531715Vr.LLJJJ;
                    } else if (!c20531715Vr.LLJIJIL && (!c20531715Vr.LLJ.isEmpty())) {
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : set) {
                            if (c20531715Vr.LLJ.containsKey((String) obj)) {
                                arrayList.add(obj);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            ((LinkedHashMap) c20531715Vr.LLJ).keySet().retainAll(arrayList);
                            c20531715Vr.LLJIJIL = true;
                            c20531715Vr.LJIILIIL();
                        }
                    } else {
                        z = !c20531715Vr.LLJJJ;
                    }
                }
                z = true;
            }
        }
        evictIfEnded(c20531715Vr, "snapshotVisibleFirstScreen");
        return z;
    }

    public final void markAvatarLoaded$explore_release(Long l, String str, boolean z) {
        C20531715Vr c20531715Vr;
        C20531815Vs c20531815Vs;
        if (!C1267604xe.LIZ() || (c20531715Vr = monitor) == null || ignoreFromMainTab(c20531715Vr, l)) {
            return;
        }
        synchronized (c20531715Vr) {
            if (!c20531715Vr.LLJJJ) {
                if (str != null && str.length() > 0 && 1 != 0) {
                    if ((c20531715Vr.LLJILJIL && (c20531815Vs = (C20531815Vs) ((LinkedHashMap) c20531715Vr.LLJ).get(str)) != null) || (c20531815Vs = (C20531815Vs) ((LinkedHashMap) c20531715Vr.LLIZLLLIL).get(str)) != null) {
                        if (!c20531815Vs.LJI) {
                            c20531815Vs.LJI = true;
                            c20531815Vs.LJII = Long.valueOf(c20531715Vr.LIZIZ());
                            c20531815Vs.LJIIIIZZ = z;
                            if (!z) {
                                c20531715Vr.LLJJJJ = true;
                                c20531715Vr.LLJJJJJIL = EnumC1779750wPl.AVATAR_LOAD;
                            }
                        }
                        c20531715Vr.LJIIL();
                        c20531715Vr.LJIILIIL();
                    }
                }
            }
        }
        evictIfEnded(c20531715Vr, "markAvatarLoaded");
    }

    public final void markCoverLoaded$explore_release(Long l, String str, boolean z) {
        C20531715Vr c20531715Vr;
        C20531815Vs c20531815Vs;
        if (!C1267604xe.LIZ() || (c20531715Vr = monitor) == null || ignoreFromMainTab(c20531715Vr, l)) {
            return;
        }
        synchronized (c20531715Vr) {
            if (!c20531715Vr.LLJJJ) {
                if (str != null && str.length() > 0 && 1 != 0) {
                    if ((c20531715Vr.LLJILJIL && (c20531815Vs = (C20531815Vs) ((LinkedHashMap) c20531715Vr.LLJ).get(str)) != null) || (c20531815Vs = (C20531815Vs) ((LinkedHashMap) c20531715Vr.LLIZLLLIL).get(str)) != null) {
                        if (!c20531815Vs.LIZLLL) {
                            c20531815Vs.LIZLLL = true;
                            c20531815Vs.LJ = Long.valueOf(c20531715Vr.LIZIZ());
                            c20531815Vs.LJFF = z;
                            if (!z) {
                                c20531715Vr.LLJJJJ = true;
                                c20531715Vr.LLJJJJJIL = EnumC1779750wPl.COVER_LOAD;
                            }
                        }
                        c20531715Vr.LJIIL();
                        c20531715Vr.LJIILIIL();
                    }
                }
            }
        }
        evictIfEnded(c20531715Vr, "markCoverLoaded");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0015  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0030 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setPendingContext(X.EnumC20526215To r9, java.lang.Long r10, java.lang.String r11) {
        /*
            r8 = this;
            r5 = 0
            r4 = 0
            if (r9 != 0) goto L31
            if (r10 != 0) goto L31
            if (r11 == 0) goto Le
            int r0 = r11.length()
            if (r0 != 0) goto L33
        Le:
            r1 = r4
        Lf:
            X.08cD r0 = X.C2153908cD.LIZ
            com.ss.android.ugc.aweme.explore.monitor.lcp.ExploreLCPTracker.pending = r1
            if (r10 == 0) goto L25
            long r6 = r10.longValue()
            r1 = 0
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 == 0) goto L25
        L1f:
            X.15Vr r3 = com.ss.android.ugc.aweme.explore.monitor.lcp.ExploreLCPTracker.monitor
            if (r3 == 0) goto L30
            monitor-enter(r3)
            goto L44
        L25:
            r10 = r4
            if (r9 != 0) goto L1f
            if (r11 == 0) goto L30
            boolean r0 = kotlin.text.a0.LJJJIL(r11)
            if (r0 == 0) goto L1f
        L30:
            return
        L31:
            if (r11 == 0) goto L42
        L33:
            boolean r0 = kotlin.text.a0.LJJJIL(r11)
            r0 = r0 ^ 1
            if (r0 == 0) goto L42
            r0 = r11
        L3c:
            X.0wNQ r1 = new X.0wNQ
            r1.<init>(r9, r10, r0)
            goto Lf
        L42:
            r0 = r4
            goto L3c
        L44:
            boolean r0 = r3.LLJJJ     // Catch: java.lang.Throwable -> L9f
            if (r0 == 0) goto L4a
            monitor-exit(r3)
            return
        L4a:
            if (r10 == 0) goto L81
            X.1582 r0 = r3.LL     // Catch: java.lang.Throwable -> L9f
            boolean r0 = r0 instanceof X.AnonymousClass1581     // Catch: java.lang.Throwable -> L9f
            if (r0 != 0) goto L81
            X.1581 r2 = new X.1581     // Catch: java.lang.Throwable -> L9f
            long r0 = r10.longValue()     // Catch: java.lang.Throwable -> L9f
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L9f
            r3.LL = r2     // Catch: java.lang.Throwable -> L9f
            r3.LLJJI = r4     // Catch: java.lang.Throwable -> L9f
            java.util.Map<java.lang.String, X.15Vs> r0 = r3.LLIZLLLIL     // Catch: java.lang.Throwable -> L9f
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0     // Catch: java.lang.Throwable -> L9f
            r0.clear()     // Catch: java.lang.Throwable -> L9f
            java.util.Map<java.lang.String, X.15Vs> r0 = r3.LLJ     // Catch: java.lang.Throwable -> L9f
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0     // Catch: java.lang.Throwable -> L9f
            r0.clear()     // Catch: java.lang.Throwable -> L9f
            r3.LLJI = r5     // Catch: java.lang.Throwable -> L9f
            r3.LLJIJIL = r5     // Catch: java.lang.Throwable -> L9f
            r3.LLJILJIL = r5     // Catch: java.lang.Throwable -> L9f
            r3.LLJILJILJ = r4     // Catch: java.lang.Throwable -> L9f
            r3.LLILZ = r4     // Catch: java.lang.Throwable -> L9f
            r3.LLILZIL = r4     // Catch: java.lang.Throwable -> L9f
            r3.LLILZLL = r4     // Catch: java.lang.Throwable -> L9f
            r3.LLIZ = r4     // Catch: java.lang.Throwable -> L9f
            r3.LLJJJJ = r5     // Catch: java.lang.Throwable -> L9f
            r3.LLJJJJJIL = r4     // Catch: java.lang.Throwable -> L9f
        L81:
            if (r11 == 0) goto L95
            boolean r0 = kotlin.text.a0.LJJJIL(r11)     // Catch: java.lang.Throwable -> L9f
            if (r0 != 0) goto L95
            java.lang.String r0 = r3.LLJJIJI     // Catch: java.lang.Throwable -> L9f
            if (r0 == 0) goto L93
            int r0 = r0.length()     // Catch: java.lang.Throwable -> L9f
            if (r0 != 0) goto L95
        L93:
            r3.LLJJIJI = r11     // Catch: java.lang.Throwable -> L9f
        L95:
            if (r9 == 0) goto L9d
            java.lang.String r0 = r9.getValue()     // Catch: java.lang.Throwable -> L9f
            r3.LLJJ = r0     // Catch: java.lang.Throwable -> L9f
        L9d:
            monitor-exit(r3)
            return
        L9f:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.explore.monitor.lcp.ExploreLCPTracker.setPendingContext(X.15To, java.lang.Long, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0067 A[Catch: all -> 0x00bd, TryCatch #0 {, blocks: (B:12:0x0014, B:16:0x001c, B:19:0x0025, B:21:0x0029, B:23:0x002f, B:24:0x0039, B:29:0x0048, B:30:0x004a, B:32:0x0052, B:34:0x005e, B:41:0x0082, B:42:0x0086, B:44:0x008c, B:46:0x0098, B:48:0x009c, B:50:0x00a4, B:36:0x0067, B:38:0x006b, B:40:0x0073, B:28:0x0045), top: B:61:0x0014 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void bindFirstScreenCell$explore_release(java.lang.Long r7, java.lang.String r8, boolean r9, int r10) {
        /*
            r6 = this;
            boolean r0 = X.C1267604xe.LIZ()
            if (r0 != 0) goto L7
            return
        L7:
            X.15Vr r4 = com.ss.android.ugc.aweme.explore.monitor.lcp.ExploreLCPTracker.monitor
            if (r4 != 0) goto Lc
            return
        Lc:
            boolean r0 = r6.ignoreFromMainTab(r4, r7)
            if (r0 == 0) goto L13
            return
        L13:
            monitor-enter(r4)
            boolean r0 = r4.LLJJJ     // Catch: java.lang.Throwable -> Lbd
            if (r0 == 0) goto L1a
            goto Lb6
        L1a:
            if (r8 == 0) goto Lb4
            int r0 = r8.length()     // Catch: java.lang.Throwable -> Lbd
            r1 = 1
            if (r0 <= 0) goto Lb4
            if (r9 != 0) goto L45
            boolean r0 = r4.LLJILJIL     // Catch: java.lang.Throwable -> Lbd
            if (r0 != 0) goto L48
            r4.LLJILJIL = r1     // Catch: java.lang.Throwable -> Lbd
            java.lang.Long r0 = r4.LLJILJILJ     // Catch: java.lang.Throwable -> Lbd
            if (r0 != 0) goto L39
            long r0 = r4.LIZIZ()     // Catch: java.lang.Throwable -> Lbd
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> Lbd
            r4.LLJILJILJ = r0     // Catch: java.lang.Throwable -> Lbd
        L39:
            r4.LJIIL()     // Catch: java.lang.Throwable -> Lbd
            r4.LJIILIIL()     // Catch: java.lang.Throwable -> Lbd
            boolean r0 = r4.LLJJJ     // Catch: java.lang.Throwable -> Lbd
            if (r0 == 0) goto L48
            monitor-exit(r4)
            goto Lb7
        L45:
            X.13oo r5 = X.EnumC20125213oo.LL     // Catch: java.lang.Throwable -> Lbd
            goto L4a
        L48:
            X.13oo r5 = X.EnumC20125213oo.LLILLJJLI     // Catch: java.lang.Throwable -> Lbd
        L4a:
            X.15VB r0 = X.C15VB.REFRESH     // Catch: java.lang.Throwable -> Lbd
            int r0 = r0.getValue()     // Catch: java.lang.Throwable -> Lbd
            if (r10 != r0) goto L67
            java.util.Map<java.lang.String, X.15Vs> r0 = r4.LLIZLLLIL     // Catch: java.lang.Throwable -> Lbd
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0     // Catch: java.lang.Throwable -> Lbd
            java.util.Collection r1 = r0.values()     // Catch: java.lang.Throwable -> Lbd
            boolean r0 = r1 instanceof java.util.Collection     // Catch: java.lang.Throwable -> Lbd
            if (r0 == 0) goto L82
            r0 = r1
            java.util.Collection r0 = (java.util.Collection) r0     // Catch: java.lang.Throwable -> Lbd
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> Lbd
            if (r0 == 0) goto L82
        L67:
            boolean r0 = r4.LLJI     // Catch: java.lang.Throwable -> Lbd
            if (r0 != 0) goto Lb2
            java.util.Map<java.lang.String, X.15Vs> r0 = r4.LLIZLLLIL     // Catch: java.lang.Throwable -> Lbd
            boolean r0 = r0.containsKey(r8)     // Catch: java.lang.Throwable -> Lbd
            if (r0 != 0) goto Lb2
            java.util.Map<java.lang.String, X.15Vs> r3 = r4.LLIZLLLIL     // Catch: java.lang.Throwable -> Lbd
            X.15Vs r2 = new X.15Vs     // Catch: java.lang.Throwable -> Lbd
            long r0 = r4.LIZIZ()     // Catch: java.lang.Throwable -> Lbd
            r2.<init>(r5, r10, r0)     // Catch: java.lang.Throwable -> Lbd
            r3.put(r8, r2)     // Catch: java.lang.Throwable -> Lbd
            goto Lb2
        L82:
            java.util.Iterator r2 = r1.iterator()     // Catch: java.lang.Throwable -> Lbd
        L86:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Throwable -> Lbd
            if (r0 == 0) goto L67
            java.lang.Object r0 = r2.next()     // Catch: java.lang.Throwable -> Lbd
            X.15Vs r0 = (X.C20531815Vs) r0     // Catch: java.lang.Throwable -> Lbd
            X.13oo r1 = r0.LIZ     // Catch: java.lang.Throwable -> Lbd
            X.13oo r0 = X.EnumC20125213oo.LL     // Catch: java.lang.Throwable -> Lbd
            if (r1 != r0) goto L86
            boolean r0 = r4.LLJIJIL     // Catch: java.lang.Throwable -> Lbd
            if (r0 != 0) goto Lb2
            java.util.Map<java.lang.String, X.15Vs> r0 = r4.LLJ     // Catch: java.lang.Throwable -> Lbd
            boolean r0 = r0.containsKey(r8)     // Catch: java.lang.Throwable -> Lbd
            if (r0 != 0) goto Lb2
            java.util.Map<java.lang.String, X.15Vs> r3 = r4.LLJ     // Catch: java.lang.Throwable -> Lbd
            X.15Vs r2 = new X.15Vs     // Catch: java.lang.Throwable -> Lbd
            long r0 = r4.LIZIZ()     // Catch: java.lang.Throwable -> Lbd
            r2.<init>(r5, r10, r0)     // Catch: java.lang.Throwable -> Lbd
            r3.put(r8, r2)     // Catch: java.lang.Throwable -> Lbd
        Lb2:
            monitor-exit(r4)
            goto Lb7
        Lb4:
            monitor-exit(r4)
            goto Lb7
        Lb6:
            monitor-exit(r4)
        Lb7:
            java.lang.String r0 = "bindFirstScreenCell"
            r6.evictIfEnded(r4, r0)
            return
        Lbd:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.explore.monitor.lcp.ExploreLCPTracker.bindFirstScreenCell$explore_release(java.lang.Long, java.lang.String, boolean, int):void");
    }

    public final synchronized void start(Long l, String str, String str2, String str3, String str4, Integer num) {
        EnumC20526215To enumC20526215To;
        long jLongValue;
        boolean z;
        AnonymousClass1582 anonymousClass1581;
        Long l2;
        EnumC20526215To enumC20526215To2;
        String value;
        boolean zLIZ = C1267604xe.LIZ();
        C1778300wNQ c1778300wNQConsumePending = consumePending();
        String str5 = null;
        if (c1778300wNQConsumePending == null || (enumC20526215To2 = c1778300wNQConsumePending.LIZ) == null || (value = enumC20526215To2.getValue()) == null) {
            EnumC20526215To.Companion.getClass();
            if (Intrinsics.LJFF(str, "slide")) {
                enumC20526215To = EnumC20526215To.SLIDE;
            } else if (Intrinsics.LJFF(str2, "explore_bottom_tab")) {
                enumC20526215To = EnumC20526215To.CLICK_BUTTON_ICON;
            } else if (Intrinsics.LJFF(str2, "explore_top_tab") || Intrinsics.LJFF(str2, "subtab")) {
                enumC20526215To = EnumC20526215To.CLICK_TOP_ICON;
            }
            if (enumC20526215To != null) {
                str = enumC20526215To.getValue();
            }
        } else {
            str = value;
        }
        if (c1778300wNQConsumePending != null && (l2 = c1778300wNQConsumePending.LIZIZ) != null) {
            jLongValue = l2.longValue();
        } else if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        if (jLongValue != 0) {
            z = true;
        } else {
            z = false;
        }
        if (num == null) {
            if (z) {
                num = 1;
            } else if (Intrinsics.LJFF(str2, "explore_top_tab")) {
                num = 1;
            } else if (Intrinsics.LJFF(str2, "explore_bottom_tab")) {
                num = 0;
            } else {
                num = null;
            }
        }
        if (str3 == null) {
            str3 = "homepage_hot";
        }
        if (str4 == null || !(!a0.LJJJIL(str4))) {
            if (c1778300wNQConsumePending != null) {
                str5 = c1778300wNQConsumePending.LIZJ;
            }
        } else {
            str5 = str4;
        }
        if (!zLIZ) {
            return;
        }
        if (hasEverEnded) {
            return;
        }
        C20531715Vr c20531715Vr = monitor;
        if (c20531715Vr != null) {
            c20531715Vr.LIZLLL(str);
            c20531715Vr.LIZJ(str3);
            c20531715Vr.LJI(num);
            c20531715Vr.LJFF(str5);
            return;
        }
        if (z) {
            anonymousClass1581 = new AnonymousClass1581(jLongValue);
        } else {
            anonymousClass1581 = new AnonymousClass1582() { // from class: X.1583
            };
        }
        C20531715Vr c20531715Vr2 = new C20531715Vr(anonymousClass1581);
        monitor = c20531715Vr2;
        c20531715Vr2.LIZLLL(str);
        c20531715Vr2.LIZJ(str3);
        c20531715Vr2.LJI(num);
        c20531715Vr2.LJFF(str5);
        c20531715Vr2.LJIIJJI();
    }
}
