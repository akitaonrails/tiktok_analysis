package kotlin.jvm.internal;

import X.C09AY;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.streak.api.StreakInlineMsgInfo;
import com.ss.android.ugc.aweme.setting.UpdateSettingServiceImpl;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class AwS32S1101000_2 extends C09AY implements Function0 {
    public final int $t;
    public int i2;
    public Object l1;
    public String s0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS32S1101000_2 awS32S1101000_2) {
        String str = awS32S1101000_2.s0;
        if (str != null) {
            String currentUserID = ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID();
            Pair<String, ? extends JSONObject> pair = ((UpdateSettingServiceImpl) awS32S1101000_2.l1).LIZ;
            if (pair != null && Intrinsics.LJFF(pair.getFirst(), currentUserID)) {
                JSONObject second = pair.getSecond();
                UpdateSettingServiceImpl updateSettingServiceImpl = (UpdateSettingServiceImpl) awS32S1101000_2.l1;
                int i = awS32S1101000_2.i2;
                updateSettingServiceImpl.getClass();
                if (UpdateSettingServiceImpl.LJIIJJI(i, str, second)) {
                    ((UpdateSettingServiceImpl) awS32S1101000_2.l1).LJIIJ(second);
                }
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0034 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AwS32S1101000_2 r6) {
        /*
            com.ss.android.ugc.aweme.im.streak.impl.utils.StreakLocalExtHelper r3 = com.ss.android.ugc.aweme.im.streak.impl.utils.StreakLocalExtHelper.LIZ
            java.lang.String r0 = r6.s0
            com.ss.android.ugc.aweme.im.streak.impl.utils.StreakLocalExtHelper$StreakInlineMsgHolder r5 = r3.LIZIZ(r0)
            if (r5 != 0) goto Lc
            com.ss.android.ugc.aweme.im.streak.impl.utils.StreakLocalExtHelper$StreakInlineMsgHolder r5 = com.ss.android.ugc.aweme.im.streak.impl.utils.StreakLocalExtHelper.LIZJ
        Lc:
            int r1 = r6.i2
            java.lang.Object r2 = r6.l1
            com.ss.android.ugc.aweme.im.streak.api.StreakInlineMsgInfo r2 = (com.ss.android.ugc.aweme.im.streak.api.StreakInlineMsgInfo) r2
            r5.getClass()
            r0 = 1
            if (r1 == r0) goto L2c
            r0 = 2
            if (r1 != r0) goto L23
            com.ss.android.ugc.aweme.im.streak.impl.utils.StreakLocalExtHelper$StreakInlineMsgHolder r1 = new com.ss.android.ugc.aweme.im.streak.impl.utils.StreakLocalExtHelper$StreakInlineMsgHolder
            com.ss.android.ugc.aweme.im.streak.api.StreakInlineMsgInfo r0 = r5.remindInlineMsg
            r1.<init>(r0, r2)
        L22:
            r5 = r1
        L23:
            r0 = 0
            java.lang.String r4 = X.C051M.LJ(r5, r0)
            java.lang.String r2 = r6.s0
            monitor-enter(r3)
            goto L34
        L2c:
            com.ss.android.ugc.aweme.im.streak.impl.utils.StreakLocalExtHelper$StreakInlineMsgHolder r1 = new com.ss.android.ugc.aweme.im.streak.impl.utils.StreakLocalExtHelper$StreakInlineMsgHolder
            com.ss.android.ugc.aweme.im.streak.api.StreakInlineMsgInfo r0 = r5.continueInlineMsg
            r1.<init>(r2, r0)
            goto L22
        L34:
            com.ss.android.ugc.aweme.im.streak.api.StreakInlineMsgInfo r0 = r5.continueInlineMsg     // Catch: java.lang.Throwable -> La0
            if (r0 != 0) goto L4f
            com.ss.android.ugc.aweme.im.streak.api.StreakInlineMsgInfo r0 = r5.remindInlineMsg     // Catch: java.lang.Throwable -> La0
            if (r0 != 0) goto L4f
            X.01GW r0 = com.ss.android.ugc.aweme.im.streak.impl.utils.StreakLocalExtHelper.LIZIZ     // Catch: java.lang.Throwable -> La0
            java.lang.Object r1 = r0.getValue()     // Catch: java.lang.Throwable -> La0
            android.util.LruCache r1 = (android.util.LruCache) r1     // Catch: java.lang.Throwable -> La0
            if (r1 == 0) goto L5f
            com.ss.android.ugc.aweme.im.streak.impl.utils.StreakLocalExtHelper$StreakInlineMsgHolder r0 = com.ss.android.ugc.aweme.im.streak.impl.utils.StreakLocalExtHelper.LIZJ     // Catch: java.lang.Throwable -> La0
            java.lang.Object r0 = r1.put(r2, r0)     // Catch: java.lang.Throwable -> La0
            com.ss.android.ugc.aweme.im.streak.impl.utils.StreakLocalExtHelper$StreakInlineMsgHolder r0 = (com.ss.android.ugc.aweme.im.streak.impl.utils.StreakLocalExtHelper.StreakInlineMsgHolder) r0     // Catch: java.lang.Throwable -> La0
            goto L5f
        L4f:
            X.01GW r0 = com.ss.android.ugc.aweme.im.streak.impl.utils.StreakLocalExtHelper.LIZIZ     // Catch: java.lang.Throwable -> La0
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> La0
            android.util.LruCache r0 = (android.util.LruCache) r0     // Catch: java.lang.Throwable -> La0
            if (r0 == 0) goto L5f
            java.lang.Object r0 = r0.put(r2, r5)     // Catch: java.lang.Throwable -> La0
            com.ss.android.ugc.aweme.im.streak.impl.utils.StreakLocalExtHelper$StreakInlineMsgHolder r0 = (com.ss.android.ugc.aweme.im.streak.impl.utils.StreakLocalExtHelper.StreakInlineMsgHolder) r0     // Catch: java.lang.Throwable -> La0
        L5f:
            monitor-exit(r3)
            java.lang.String r1 = r6.s0
            java.lang.String r0 = "streak_inline_msg_list"
            boolean r2 = com.ss.android.ugc.aweme.im.streak.impl.utils.StreakLocalExtHelper.LIZLLL(r1, r0, r4)
            boolean r0 = X.C1590906Kt.LIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "StreakLocalExtHelper: addOrUpdateStreakInlineMsgInfo, conversationId="
            r1.append(r0)
            java.lang.String r0 = r6.s0
            r1.append(r0)
            java.lang.String r0 = ", inlineMsgType="
            r1.append(r0)
            int r0 = r6.i2
            r1.append(r0)
            java.lang.String r0 = ", inlineMsg="
            r1.append(r0)
            java.lang.Object r0 = r6.l1
            com.ss.android.ugc.aweme.im.streak.api.StreakInlineMsgInfo r0 = (com.ss.android.ugc.aweme.im.streak.api.StreakInlineMsgInfo) r0
            r1.append(r0)
            java.lang.String r0 = ", result="
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C1590906Kt.LIZ(r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        La0:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> La0
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS32S1101000_2.invoke$1(kotlin.jvm.internal.AwS32S1101000_2):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS32S1101000_2(String str, int i, StreakInlineMsgInfo streakInlineMsgInfo, int i2) {
        super(0);
        this.$t = i2;
        this.s0 = str;
        this.i2 = i;
        this.l1 = streakInlineMsgInfo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS32S1101000_2(String str, UpdateSettingServiceImpl updateSettingServiceImpl, int i, int i2) {
        super(0);
        this.$t = i2;
        this.s0 = str;
        this.l1 = updateSettingServiceImpl;
        this.i2 = i;
    }
}
