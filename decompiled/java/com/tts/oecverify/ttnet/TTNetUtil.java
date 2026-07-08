package com.tts.oecverify.ttnet;

import X.C080U;
import X.C0X52;
import X.C0XMB;
import X.C1494590ozp;
import X.C149R;
import X.C149T;
import X.C149W;
import X.C14A3;
import X.C1515120pWw;
import X.InterfaceC1494360ozS;
import X.InterfaceC1904907d9;
import X.InterfaceC841770X0l;
import com.bytedance.retrofit2.client.Request;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class TTNetUtil {
    public static final C149W LIZ = new C14A3() { // from class: X.149W
        @Override // X.C14A3
        public final void LIZIZ(String str, int i, long j, String str2, String str3, int i2, String str4) {
        }

        @Override // X.C14A3
        public final void LIZ(int i, int i2, int i3, int i4, String str, String str2, String str3, String str4) {
            C202191149l.LJIIJ(i, i2, i3, i4, str, str2, str3, str4);
        }
    };
    public static final C149T LIZIZ = new InterfaceC1494360ozS() { // from class: X.149T
        @Override // X.C08XE
        public final C1494320ozO LIZIZ(Map<String, List<String>> map) {
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:22:0x007e  */
        /* JADX WARN: Type inference failed for: r9v0 */
        /* JADX WARN: Type inference failed for: r9v1, types: [int] */
        /* JADX WARN: Type inference failed for: r9v6 */
        @Override // X.InterfaceC1494360ozS
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final X.C1494320ozO LIZ(java.lang.String r18, java.util.Map r19) {
            /*
                Method dump skipped, instruction units count: 525
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C149T.LIZ(java.lang.String, java.util.Map):X.0ozO");
        }
    };
    public static final C149R LIZJ = new InterfaceC1494360ozS() { // from class: X.149R
        @Override // X.C08XE
        public final C1494320ozO LIZIZ(Map<String, List<String>> map) {
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:22:0x008a  */
        /* JADX WARN: Type inference failed for: r4v0 */
        /* JADX WARN: Type inference failed for: r4v1, types: [int] */
        /* JADX WARN: Type inference failed for: r4v3 */
        @Override // X.InterfaceC1494360ozS
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final X.C1494320ozO LIZ(java.lang.String r12, java.util.Map r13) {
            /*
                r11 = this;
                java.util.HashMap r6 = new java.util.HashMap
                r6.<init>()
                r2 = 1
                boolean[] r7 = new boolean[r2]
                r5 = 0
                r7[r5] = r5
                java.util.concurrent.CountDownLatch r8 = new java.util.concurrent.CountDownLatch
                r8.<init>(r2)
                java.lang.String r1 = "oec-verify"
                boolean r0 = r13.containsKey(r1)
                if (r0 == 0) goto L9a
                java.lang.Object r1 = r13.get(r1)
                java.util.List r1 = (java.util.List) r1
                if (r1 == 0) goto L90
                int r0 = r1.size()
                if (r0 < r2) goto L90
                java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r1, r5)
                java.lang.String r0 = (java.lang.String) r0
                X.149J r9 = new X.149J
                r9.<init>(r0)
                android.net.Uri r1 = com.bytedance.mt.protector.impl.UriProtector.parse(r12)
                java.lang.String r0 = r1.getPath()
                if (r0 == 0) goto L51
                java.lang.String r0 = r1.getPath()
            L3f:
                r9.LJIILLIIL = r0
                com.tts.oecverify.BdTuring r0 = com.tts.oecverify.BdTuring.getInstance()
                com.tts.oecverify.BdTuringConfig r10 = r0.getConfig()
                if (r10 != 0) goto L54
                X.0ozO r0 = new X.0ozO
                r0.<init>(r5, r6)
                return r0
            L51:
                java.lang.String r0 = ""
                goto L3f
            L54:
                java.util.HashMap r0 = r10.getExpFeatures()
                if (r0 == 0) goto L8a
                java.util.HashMap r1 = r10.getExpFeatures()
                java.lang.String r0 = "useSView"
                java.lang.Object r1 = r1.get(r0)
                boolean r0 = r1 instanceof java.lang.Boolean
                if (r0 == 0) goto L8a
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r4 = r1.booleanValue()
            L6e:
                java.lang.String r3 = r9.LJIILIIL
                java.lang.String r2 = r9.LJIIJ
                java.lang.String r1 = r9.LJIILLIIL
                java.lang.String r0 = r9.LJIILL
                X.C202191149l.LJIILJJIL(r4, r3, r2, r1, r0)
                com.tts.oecverify.BdTuring r2 = com.tts.oecverify.BdTuring.getInstance()
                android.app.Activity r1 = r10.getTopActivity()
                X.149S r0 = new X.149S
                r0.<init>()
                r2.showVerifyDialog(r1, r9, r0)
                goto L8c
            L8a:
                r4 = 0
                goto L6e
            L8c:
                r8.await()     // Catch: java.lang.InterruptedException -> L96
                goto L9a
            L90:
                X.0ozO r0 = new X.0ozO
                r0.<init>(r5, r6)
                return r0
            L96:
                r0 = move-exception
                com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            L9a:
                X.0ozO r1 = new X.0ozO
                boolean r0 = r7[r5]
                r1.<init>(r0, r6)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C149R.LIZ(java.lang.String, java.util.Map):X.0ozO");
        }
    };

    public static void LIZ() {
        final HashMap map = new HashMap();
        map.put("oec-vc-sdk-version", "3.2.3.i18n");
        C1515120pWw.LIZIZ(new InterfaceC1904907d9() { // from class: com.tts.oecverify.ttnet.TTNetUtil.1
            @Override // X.InterfaceC1904907d9
            public final C0X52 intercept(InterfaceC841770X0l interfaceC841770X0l) {
                C1494590ozp c1494590ozp = (C1494590ozp) interfaceC841770X0l;
                Request request = c1494590ozp.LIZJ;
                LinkedList linkedList = new LinkedList();
                linkedList.addAll(request.getHeaders());
                for (String str : map.keySet()) {
                    linkedList.add(new C080U(str, (String) map.get(str)));
                }
                C0XMB c0xmbNewBuilder = request.newBuilder();
                c0xmbNewBuilder.LIZJ = linkedList;
                return c1494590ozp.LIZ(c0xmbNewBuilder.LIZ());
            }
        });
    }

    public static List<C080U> LIZIZ(Map<String, String> map) {
        LinkedList linkedList = new LinkedList();
        if (map != null) {
            for (String str : map.keySet()) {
                linkedList.add(new C080U(str, map.get(str)));
            }
        }
        return linkedList;
    }
}
