package kotlin.jvm.internal;

import X.C09AY;
import X.C1092800eXm;
import X.C1094950ebF;
import X.C1135810ff9;
import X.C1142020fpA;
import X.C1142070fpF;
import X.C1146350fw9;
import X.EnumC1142140fpM;
import com.bytedance.android.livesdk.livesetting.level.FansClubGameplayUpgradeFrequencyExpireDurationSetting;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes18.dex */
public class AwS32S0000100_17 extends C09AY implements Function1 {
    public final int $t;
    public long j0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS32S0000100_17(long j, int i) {
        super(1);
        this.$t = i;
        this.j0 = j;
    }

    public static final Object invoke$0(AwS32S0000100_17 awS32S0000100_17, Object obj) {
        boolean z;
        if (((C1146350fw9) obj).LL == awS32S0000100_17.j0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AwS32S0000100_17 r3, java.lang.Object r4) {
        /*
            java.lang.Number r4 = (java.lang.Number) r4
            long r1 = r4.longValue()
            X.0fSt r0 = com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager.inst()
            com.bytedance.android.livesdk.model.Gift r0 = r0.findGiftById(r1)
            r4 = 1
            if (r0 == 0) goto L32
            com.bytedance.android.livesdk.model.GiftLockInfo r0 = r0.giftSubInfo
            if (r0 == 0) goto L32
            boolean r0 = r0.mLock
            if (r0 != r4) goto L32
            long r2 = r3.j0
            X.14i1<java.util.concurrent.CopyOnWriteArraySet<java.lang.Long>> r0 = X.InterfaceC1094160eZy.t1
            java.lang.Object r1 = r0.LIZIZ()
            java.util.concurrent.CopyOnWriteArraySet r1 = (java.util.concurrent.CopyOnWriteArraySet) r1
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L32
        L2d:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            return r0
        L32:
            r4 = 0
            goto L2d
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS32S0000100_17.invoke$1(kotlin.jvm.internal.AwS32S0000100_17, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$2(AwS32S0000100_17 awS32S0000100_17, Object obj) {
        boolean z;
        if (awS32S0000100_17.j0 - ((C1092800eXm) obj).LIZJ > FansClubGameplayUpgradeFrequencyExpireDurationSetting.INSTANCE.getValue()) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$3(AwS32S0000100_17 awS32S0000100_17, Object obj) {
        C1142070fpF c1142070fpF = C1142070fpF.LIZ;
        long j = awS32S0000100_17.j0;
        c1142070fpF.getClass();
        return C1142020fpA.LIZ(C1142070fpF.LJJIII((C1142020fpA) obj, j, j), null, EnumC1142140fpM.COMPLETED, 0L, 0L, 0, null, null, 0.0f, 0, null, null, 2043);
    }

    public static final Object invoke$4(AwS32S0000100_17 awS32S0000100_17, Object obj) {
        boolean z;
        C1135810ff9 c1135810ff9 = (C1135810ff9) obj;
        if (c1135810ff9.LJJJJZ == 9223372036854775806L && c1135810ff9.LJJLI == awS32S0000100_17.j0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$5(AwS32S0000100_17 awS32S0000100_17, Object obj) {
        boolean z;
        if (((C1094950ebF) obj).LIZ == awS32S0000100_17.j0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
