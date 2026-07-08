package com.ss.android.ugc.aweme.im.streak.impl.utils;

import X.C01GW;
import X.C05C8;
import X.C09CT;
import X.C0PEM;
import X.C0Y8T;
import X.C0YNP;
import X.C0YSQ;
import X.C13LP;
import X.C1565006Au;
import X.C1565106Av;
import X.C1565306Ax;
import X.C1590906Kt;
import X.C2095008Iq;
import X.C2188811AlT;
import X.C2296808zG;
import X.C23250099c;
import X.C452501pT;
import X.InterfaceC876950Yaj;
import android.os.Looper;
import com.ss.android.ugc.aweme.im.streak.api.StreakInlineMsgInfo;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: loaded from: classes3.dex */
public final class StreakLocalExtHelper {
    public static final StreakLocalExtHelper LIZ = new StreakLocalExtHelper();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C1565006Au());
    public static final StreakInlineMsgHolder LIZJ = new StreakInlineMsgHolder(null, null);

    public static void LIZ(Function0 function0) {
        if (C1565106Av.LIZLLL && Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C05C8(function0, null), 3);
        } else {
            function0.invoke();
        }
    }

    public static C1565306Ax LIZJ(String str) {
        boolean z;
        boolean z2;
        boolean z3;
        Integer numLJIIJJI;
        Long lLJIILIIL;
        String strLJFF = C0YNP.LJFF(str, "streak_unlock_anim");
        if (strLJFF == null) {
            strLJFF = "";
        }
        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(strLJFF, new String[]{"-"}, 0, 6);
        String str2 = (String) C13LP.LJJJLZIJ(0, listLJJLIIIJILLIZJL);
        String str3 = (String) C13LP.LJJJLZIJ(1, listLJJLIIIJILLIZJL);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (str2 != null && str2.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        boolean z4 = !z;
        if (str3 != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str3)) != null && lLJIILIIL.longValue() <= jCurrentTimeMillis) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z4 && z2) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (str2 != null && u.LJJIIJZLJL(str2, "streak_anim_", false)) {
            numLJIIJJI = C2095008Iq.LJIIJJI(a0.LJJJJZ("streak_anim_", str2));
        } else {
            numLJIIJJI = null;
        }
        boolean z5 = C1590906Kt.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StreakLocalExtHelper: getStreakUnlockAnimInfo, convId=");
        sbLIZ.append(str);
        sbLIZ.append(", isAnimAvailable=");
        sbLIZ.append(z3);
        sbLIZ.append(", level=");
        sbLIZ.append(numLJIIJJI);
        C1590906Kt.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        return new C1565306Ax(z3, numLJIIJJI);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.im.streak.impl.utils.StreakLocalExtHelper.StreakInlineMsgHolder LIZIZ(java.lang.String r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            com.ss.android.ugc.aweme.im.streak.impl.utils.StreakLocalExtHelper r0 = com.ss.android.ugc.aweme.im.streak.impl.utils.StreakLocalExtHelper.LIZ     // Catch: java.lang.Throwable -> L70
            r0.getClass()     // Catch: java.lang.Throwable -> L70
            X.01GW r0 = com.ss.android.ugc.aweme.im.streak.impl.utils.StreakLocalExtHelper.LIZIZ     // Catch: java.lang.Throwable -> L70
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L70
            android.util.LruCache r0 = (android.util.LruCache) r0     // Catch: java.lang.Throwable -> L70
            r2 = 0
            if (r0 == 0) goto L1b
            java.lang.Object r0 = r0.get(r4)     // Catch: java.lang.Throwable -> L70
            com.ss.android.ugc.aweme.im.streak.impl.utils.StreakLocalExtHelper$StreakInlineMsgHolder r0 = (com.ss.android.ugc.aweme.im.streak.impl.utils.StreakLocalExtHelper.StreakInlineMsgHolder) r0     // Catch: java.lang.Throwable -> L70
            if (r0 == 0) goto L1b
            monitor-exit(r3)
            return r0
        L1b:
            monitor-exit(r3)
            java.lang.String r0 = "streak_inline_msg_list"
            java.lang.String r1 = X.C0YNP.LJFF(r4, r0)
            if (r1 == 0) goto L49
            java.lang.Class<com.ss.android.ugc.aweme.im.streak.impl.utils.StreakLocalExtHelper$StreakInlineMsgHolder> r0 = com.ss.android.ugc.aweme.im.streak.impl.utils.StreakLocalExtHelper.StreakInlineMsgHolder.class
            java.lang.Object r1 = X.C051M.LIZIZ(r0, r1)     // Catch: java.lang.Throwable -> L30
            com.ss.android.ugc.aweme.im.streak.impl.utils.StreakLocalExtHelper$StreakInlineMsgHolder r1 = (com.ss.android.ugc.aweme.im.streak.impl.utils.StreakLocalExtHelper.StreakInlineMsgHolder) r1     // Catch: java.lang.Throwable -> L30
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L30
            goto L3c
        L30:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L3c:
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)
            if (r0 == 0) goto L43
            r1 = r2
        L43:
            com.ss.android.ugc.aweme.im.streak.impl.utils.StreakLocalExtHelper$StreakInlineMsgHolder r1 = (com.ss.android.ugc.aweme.im.streak.impl.utils.StreakLocalExtHelper.StreakInlineMsgHolder) r1
            if (r1 == 0) goto L49
            r2 = r1
            goto L4b
        L49:
            boolean r0 = X.C1590906Kt.LIZ
        L4b:
            monitor-enter(r3)
            com.ss.android.ugc.aweme.im.streak.impl.utils.StreakLocalExtHelper r0 = com.ss.android.ugc.aweme.im.streak.impl.utils.StreakLocalExtHelper.LIZ     // Catch: java.lang.Throwable -> L6a
            r0.getClass()     // Catch: java.lang.Throwable -> L6a
            X.01GW r0 = com.ss.android.ugc.aweme.im.streak.impl.utils.StreakLocalExtHelper.LIZIZ     // Catch: java.lang.Throwable -> L6a
            java.lang.Object r1 = r0.getValue()     // Catch: java.lang.Throwable -> L6a
            android.util.LruCache r1 = (android.util.LruCache) r1     // Catch: java.lang.Throwable -> L6a
            if (r1 == 0) goto L68
            if (r2 != 0) goto L5e
            goto L60
        L5e:
            r0 = r2
            goto L62
        L60:
            com.ss.android.ugc.aweme.im.streak.impl.utils.StreakLocalExtHelper$StreakInlineMsgHolder r0 = com.ss.android.ugc.aweme.im.streak.impl.utils.StreakLocalExtHelper.LIZJ     // Catch: java.lang.Throwable -> L6a
        L62:
            java.lang.Object r0 = r1.put(r4, r0)     // Catch: java.lang.Throwable -> L6a
            com.ss.android.ugc.aweme.im.streak.impl.utils.StreakLocalExtHelper$StreakInlineMsgHolder r0 = (com.ss.android.ugc.aweme.im.streak.impl.utils.StreakLocalExtHelper.StreakInlineMsgHolder) r0     // Catch: java.lang.Throwable -> L6a
        L68:
            monitor-exit(r3)
            return r2
        L6a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L6a
            monitor-exit(r3)
            throw r0
        L70:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L70
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.streak.impl.utils.StreakLocalExtHelper.LIZIZ(java.lang.String):com.ss.android.ugc.aweme.im.streak.impl.utils.StreakLocalExtHelper$StreakInlineMsgHolder");
    }

    public static final class StreakInlineMsgHolder {

        @C09CT("continue_inline_msg")
        public final StreakInlineMsgInfo continueInlineMsg;

        @C09CT("remind_inline_msg")
        public final StreakInlineMsgInfo remindInlineMsg;

        public StreakInlineMsgHolder() {
            this(null, null);
        }

        public StreakInlineMsgHolder(StreakInlineMsgInfo streakInlineMsgInfo, StreakInlineMsgInfo streakInlineMsgInfo2) {
            this.remindInlineMsg = streakInlineMsgInfo;
            this.continueInlineMsg = streakInlineMsgInfo2;
        }
    }

    public static boolean LIZLLL(String str, String str2, String str3) {
        if (str3 == null) {
            str3 = "";
        }
        C0YNP.LJIIIIZZ(str, str2, str3);
        C0Y8T c0y8tLJIL = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LJIL(str);
        if (c0y8tLJIL == null) {
            C1590906Kt.LIZIZ("StreakLocalExtHelper: getStreakAnimNameFromConv, conversation == null");
            return false;
        }
        Map<String, String> localExt = c0y8tLJIL.getLocalExt();
        if (localExt == null) {
            localExt = new LinkedHashMap<>();
        }
        C0YNP.LIZIZ(str).LJJ(localExt, null);
        return true;
    }
}
