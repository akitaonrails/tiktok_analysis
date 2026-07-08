package kotlin.jvm.internal;

import X.C09AY;
import X.C0DOO;
import X.C23250099c;
import X.C337910DMn;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.profile.business.ur.school.findschoolfriends.FindSchoolFriendsPageContainerAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public class AwS187S1100000_4 extends C09AY implements Function2 {
    public final int $t;
    public Object l1;
    public String s0;

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
    public AwS187S1100000_4(FindSchoolFriendsPageContainerAssem findSchoolFriendsPageContainerAssem, String str, int i) {
        super(2);
        this.$t = i;
        this.l1 = findSchoolFriendsPageContainerAssem;
        this.s0 = str;
    }

    public static final Object invoke$0(AwS187S1100000_4 awS187S1100000_4, Object obj, Object obj2) {
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope((FindSchoolFriendsPageContainerAssem) awS187S1100000_4.l1), null, null, new C337910DMn((FindSchoolFriendsPageContainerAssem) awS187S1100000_4.l1, null), 3);
        C0DOO c0doo = C0DOO.LIZ;
        String str = awS187S1100000_4.s0;
        c0doo.getClass();
        C0DOO.LIZ("school_community_page", str, "not_now", null);
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AwS187S1100000_4 r4, java.lang.Object r5, java.lang.Object r6) {
        /*
            r2 = r5
            X.0tpg r2 = (X.InterfaceC1680500tpg) r2
            java.lang.Number r6 = (java.lang.Number) r6
            int r0 = r6.intValue()
            r1 = r0 & 3
            r0 = 2
            if (r1 != r0) goto L1a
            boolean r0 = r2.LIZ()
            if (r0 == 0) goto L1a
            r2.LIZJ()
        L17:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L1a:
            java.lang.String r3 = r4.s0
            r5 = 1
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r2.LJJIIJZLJL(r0)
            java.lang.Object r0 = r4.l1
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r2.LJJIIJ(r0)
            java.lang.Object r1 = r4.l1
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r4 = r2.LJJ()
            if (r0 != 0) goto L3e
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r4 != r0) goto L48
        L3e:
            kotlin.jvm.internal.AwS548S0100000_4 r4 = new kotlin.jvm.internal.AwS548S0100000_4
            r0 = 476(0x1dc, float:6.67E-43)
            r4.<init>(r1, r0)
            r2.LJJIJIIJI(r4)
        L48:
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
            r2.LJ()
            r0 = 48
            r1 = 0
            X.C1668330tW3.LJIIIZ(r0, r1, r2, r3, r4, r5)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS187S1100000_4.invoke$1(kotlin.jvm.internal.AwS187S1100000_4, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS187S1100000_4(String str, String str2, Function0<Unit> function0) {
        super(2);
        this.$t = function0;
        this.s0 = str;
        this.l1 = str2;
    }
}
