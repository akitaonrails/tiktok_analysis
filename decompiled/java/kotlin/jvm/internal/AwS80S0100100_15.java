package kotlin.jvm.internal;

import X.C09AY;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.randommatch.RandomMatchFragment;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes16.dex */
public class AwS80S0100100_15 extends C09AY implements Function2 {
    public final int $t;
    public long j1;
    public Object l0;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS80S0100100_15(long j, RandomMatchFragment randomMatchFragment, int i) {
        super(2);
        this.$t = i;
        this.l0 = randomMatchFragment;
        this.j1 = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$0(kotlin.jvm.internal.AwS80S0100100_15 r7, java.lang.Object r8, java.lang.Object r9) {
        /*
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r0 = r8.booleanValue()
            java.lang.String r6 = "RandomMatchFragment"
            if (r0 == 0) goto L25
            long r4 = r7.j1
            java.lang.Object r3 = r7.l0
            com.bytedance.android.live.liveinteract.multiguestv3.main.guest.randommatch.RandomMatchFragment r3 = (com.bytedance.android.live.liveinteract.multiguestv3.main.guest.randommatch.RandomMatchFragment) r3
            long r1 = r3.LLLJ
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 != 0) goto L25
            boolean r0 = r3.LLLJIL
            if (r0 != 0) goto L25
            r3.BS()
            java.lang.String r0 = "load anchorUser.avatarThumb bitmap success"
            X.C20441214yg.LJ(r6, r0)
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L25:
            java.lang.String r0 = "load anchorUser.avatarThumb bitmap fail"
            X.C20441214yg.LJ(r6, r0)
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS80S0100100_15.invoke$0(kotlin.jvm.internal.AwS80S0100100_15, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AwS80S0100100_15 r7, java.lang.Object r8, java.lang.Object r9) {
        /*
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r0 = r8.booleanValue()
            java.lang.String r6 = "RandomMatchFragment"
            if (r0 == 0) goto L25
            long r4 = r7.j1
            java.lang.Object r3 = r7.l0
            com.bytedance.android.live.liveinteract.multiguestv3.main.guest.randommatch.RandomMatchFragment r3 = (com.bytedance.android.live.liveinteract.multiguestv3.main.guest.randommatch.RandomMatchFragment) r3
            long r1 = r3.LLLJ
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 != 0) goto L25
            boolean r0 = r3.LLLJIL
            if (r0 != 0) goto L25
            r3.ES()
            java.lang.String r0 = "load currentUser.avatarThumb bitmap success"
            X.C20441214yg.LJ(r6, r0)
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L25:
            java.lang.String r0 = "load currentUser.avatarThumb bitmap fail"
            X.C20441214yg.LJ(r6, r0)
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS80S0100100_15.invoke$1(kotlin.jvm.internal.AwS80S0100100_15, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
