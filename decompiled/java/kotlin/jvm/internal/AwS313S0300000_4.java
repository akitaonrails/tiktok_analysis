package kotlin.jvm.internal;

import X.C09AY;
import X.InterfaceC1631620sYq;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.ui.cell.feed.CollabFeedInvitedCell;
import com.ss.android.ugc.aweme.ui.cell.feed.CollabFeedInvitedPendingCell;

/* JADX INFO: loaded from: classes5.dex */
public class AwS313S0300000_4 extends C09AY implements InterfaceC1631620sYq {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            case 2:
                return invoke$2(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS313S0300000_4(CollabFeedInvitedCell collabFeedInvitedCell, Aweme aweme, User user, int i) {
        super(3);
        this.$t = i;
        this.l0 = collabFeedInvitedCell;
        this.l1 = aweme;
        this.l2 = user;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$0(kotlin.jvm.internal.AwS313S0300000_4 r17, java.lang.Object r18, java.lang.Object r19, java.lang.Object r20) {
        /*
            r0 = r20
            r3 = r19
            r1 = r18
            java.lang.Number r1 = (java.lang.Number) r1
            int r4 = r1.intValue()
            X.0tpg r3 = (X.InterfaceC1680500tpg) r3
            java.lang.Number r0 = (java.lang.Number) r0
            int r5 = r0.intValue()
            r0 = r5 & 6
            r2 = 4
            if (r0 != 0) goto L21
            boolean r0 = r3.LJIJI(r4)
            if (r0 == 0) goto Lba
            r0 = 4
        L20:
            r5 = r5 | r0
        L21:
            r1 = r5 & 19
            r0 = 18
            if (r1 != r0) goto L33
            boolean r0 = r3.LIZ()
            if (r0 == 0) goto L33
            r3.LIZJ()
        L30:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L33:
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r3.LJJIIJZLJL(r0)
            r0 = r5 & 14
            if (r0 != r2) goto Lb8
            r0 = 1
        L3e:
            java.lang.Object r6 = r3.LJJ()
            if (r0 != 0) goto L4d
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r6 != r0) goto L57
        L4d:
            kotlin.jvm.internal.AwS49S0001000_4 r6 = new kotlin.jvm.internal.AwS49S0001000_4
            r0 = 14
            r6.<init>(r4, r0)
            r3.LJJIJIIJI(r6)
        L57:
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            r3.LJ()
            r7 = 1
            X.0tW1 r8 = X.EnumC1668310tW1.Normal
            r9 = 0
            r10 = 0
            r5 = r17
            java.lang.Object r0 = r5.l0
            com.ss.android.ugc.aweme.ui.cell.feed.CollabFeedInvitedPendingCell r0 = (com.ss.android.ugc.aweme.ui.cell.feed.CollabFeedInvitedPendingCell) r0
            android.view.View r0 = r0.itemView
            android.content.Context r1 = r0.getContext()
            r0 = 2131828896(0x7f1120a0, float:1.9290746E38)
            java.lang.String r11 = r1.getString(r0)
            java.lang.Object r0 = r5.l0
            com.ss.android.ugc.aweme.ui.cell.feed.CollabFeedInvitedPendingCell r0 = (com.ss.android.ugc.aweme.ui.cell.feed.CollabFeedInvitedPendingCell) r0
            android.view.View r0 = r0.itemView
            android.content.Context r1 = r0.getContext()
            r0 = 2131828895(0x7f11209f, float:1.9290744E38)
            java.lang.String r12 = r1.getString(r0)
            kotlin.jvm.internal.AwS164S0400000_4 r4 = new kotlin.jvm.internal.AwS164S0400000_4
            java.lang.Object r2 = r5.l0
            com.ss.android.ugc.aweme.ui.cell.feed.CollabFeedInvitedPendingCell r2 = (com.ss.android.ugc.aweme.ui.cell.feed.CollabFeedInvitedPendingCell) r2
            java.lang.Object r1 = r5.l1
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = (com.ss.android.ugc.aweme.feed.model.Aweme) r1
            java.lang.Object r0 = r5.l2
            com.ss.android.ugc.aweme.profile.model.User r0 = (com.ss.android.ugc.aweme.profile.model.User) r0
            r18 = 1
            r14 = r2
            r15 = r6
            r16 = r1
            r17 = r0
            r13 = r4
            r13.<init>(r14, r15, r16, r17, r18)
            r0 = -1201586395(0xffffffffb8613f25, float:-5.370299E-5)
            X.12De r15 = X.C13Z4.LIZJ(r0, r4, r3)
            r18 = 805309872(0x30000db0, float:4.658558E-10)
            r20 = 1424(0x590, float:1.995E-42)
            r13 = r10
            r14 = r10
            r16 = r10
            r19 = r9
            r17 = r3
            X.C1668330tW3.LJI(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            goto L30
        Lb8:
            r0 = 0
            goto L3e
        Lba:
            r0 = 2
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS313S0300000_4.invoke$0(kotlin.jvm.internal.AwS313S0300000_4, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AwS313S0300000_4 r17, java.lang.Object r18, java.lang.Object r19, java.lang.Object r20) {
        /*
            r0 = r20
            r3 = r19
            r1 = r18
            java.lang.Number r1 = (java.lang.Number) r1
            int r4 = r1.intValue()
            X.0tpg r3 = (X.InterfaceC1680500tpg) r3
            java.lang.Number r0 = (java.lang.Number) r0
            int r5 = r0.intValue()
            r0 = r5 & 6
            r2 = 4
            if (r0 != 0) goto L21
            boolean r0 = r3.LJIJI(r4)
            if (r0 == 0) goto Lba
            r0 = 4
        L20:
            r5 = r5 | r0
        L21:
            r1 = r5 & 19
            r0 = 18
            if (r1 != r0) goto L33
            boolean r0 = r3.LIZ()
            if (r0 == 0) goto L33
            r3.LIZJ()
        L30:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L33:
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r3.LJJIIJZLJL(r0)
            r0 = r5 & 14
            if (r0 != r2) goto Lb8
            r0 = 1
        L3e:
            java.lang.Object r6 = r3.LJJ()
            if (r0 != 0) goto L4d
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r6 != r0) goto L57
        L4d:
            kotlin.jvm.internal.AwS49S0001000_4 r6 = new kotlin.jvm.internal.AwS49S0001000_4
            r0 = 15
            r6.<init>(r4, r0)
            r3.LJJIJIIJI(r6)
        L57:
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            r3.LJ()
            r7 = 1
            X.0tW1 r8 = X.EnumC1668310tW1.Normal
            r9 = 0
            r10 = 0
            r5 = r17
            java.lang.Object r0 = r5.l0
            com.ss.android.ugc.aweme.ui.cell.feed.CollabFeedInvitedCell r0 = (com.ss.android.ugc.aweme.ui.cell.feed.CollabFeedInvitedCell) r0
            android.view.View r0 = r0.itemView
            android.content.Context r1 = r0.getContext()
            r0 = 2131828921(0x7f1120b9, float:1.9290797E38)
            java.lang.String r11 = r1.getString(r0)
            java.lang.Object r0 = r5.l0
            com.ss.android.ugc.aweme.ui.cell.feed.CollabFeedInvitedCell r0 = (com.ss.android.ugc.aweme.ui.cell.feed.CollabFeedInvitedCell) r0
            android.view.View r0 = r0.itemView
            android.content.Context r1 = r0.getContext()
            r0 = 2131828920(0x7f1120b8, float:1.9290794E38)
            java.lang.String r12 = r1.getString(r0)
            kotlin.jvm.internal.AwS164S0400000_4 r4 = new kotlin.jvm.internal.AwS164S0400000_4
            java.lang.Object r2 = r5.l0
            com.ss.android.ugc.aweme.ui.cell.feed.CollabFeedInvitedCell r2 = (com.ss.android.ugc.aweme.ui.cell.feed.CollabFeedInvitedCell) r2
            java.lang.Object r1 = r5.l1
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = (com.ss.android.ugc.aweme.feed.model.Aweme) r1
            java.lang.Object r0 = r5.l2
            com.ss.android.ugc.aweme.profile.model.User r0 = (com.ss.android.ugc.aweme.profile.model.User) r0
            r18 = 2
            r14 = r2
            r15 = r6
            r16 = r1
            r17 = r0
            r13 = r4
            r13.<init>(r14, r15, r16, r17, r18)
            r0 = 1126833133(0x432a1bed, float:170.10909)
            X.12De r15 = X.C13Z4.LIZJ(r0, r4, r3)
            r18 = 805309872(0x30000db0, float:4.658558E-10)
            r20 = 1424(0x590, float:1.995E-42)
            r13 = r10
            r14 = r10
            r16 = r10
            r19 = r9
            r17 = r3
            X.C1668330tW3.LJI(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            goto L30
        Lb8:
            r0 = 0
            goto L3e
        Lba:
            r0 = 2
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS313S0300000_4.invoke$1(kotlin.jvm.internal.AwS313S0300000_4, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$2(kotlin.jvm.internal.AwS313S0300000_4 r17, java.lang.Object r18, java.lang.Object r19, java.lang.Object r20) {
        /*
            r0 = r20
            r3 = r19
            r1 = r18
            java.lang.Number r1 = (java.lang.Number) r1
            int r4 = r1.intValue()
            X.0tpg r3 = (X.InterfaceC1680500tpg) r3
            java.lang.Number r0 = (java.lang.Number) r0
            int r5 = r0.intValue()
            r0 = r5 & 6
            r2 = 4
            if (r0 != 0) goto L21
            boolean r0 = r3.LJIJI(r4)
            if (r0 == 0) goto Lba
            r0 = 4
        L20:
            r5 = r5 | r0
        L21:
            r1 = r5 & 19
            r0 = 18
            if (r1 != r0) goto L33
            boolean r0 = r3.LIZ()
            if (r0 == 0) goto L33
            r3.LIZJ()
        L30:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L33:
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r3.LJJIIJZLJL(r0)
            r0 = r5 & 14
            if (r0 != r2) goto Lb8
            r0 = 1
        L3e:
            java.lang.Object r6 = r3.LJJ()
            if (r0 != 0) goto L4d
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r6 != r0) goto L57
        L4d:
            kotlin.jvm.internal.AwS49S0001000_4 r6 = new kotlin.jvm.internal.AwS49S0001000_4
            r0 = 16
            r6.<init>(r4, r0)
            r3.LJJIJIIJI(r6)
        L57:
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            r3.LJ()
            r7 = 1
            X.0tW1 r8 = X.EnumC1668310tW1.Normal
            r9 = 0
            r10 = 0
            r5 = r17
            java.lang.Object r0 = r5.l0
            com.ss.android.ugc.aweme.ui.cell.feed.CollabFeedInvitedPendingCell r0 = (com.ss.android.ugc.aweme.ui.cell.feed.CollabFeedInvitedPendingCell) r0
            android.view.View r0 = r0.itemView
            android.content.Context r1 = r0.getContext()
            r0 = 2131828901(0x7f1120a5, float:1.9290756E38)
            java.lang.String r11 = r1.getString(r0)
            java.lang.Object r0 = r5.l0
            com.ss.android.ugc.aweme.ui.cell.feed.CollabFeedInvitedPendingCell r0 = (com.ss.android.ugc.aweme.ui.cell.feed.CollabFeedInvitedPendingCell) r0
            android.view.View r0 = r0.itemView
            android.content.Context r1 = r0.getContext()
            r0 = 2131828900(0x7f1120a4, float:1.9290754E38)
            java.lang.String r12 = r1.getString(r0)
            kotlin.jvm.internal.AwS164S0400000_4 r4 = new kotlin.jvm.internal.AwS164S0400000_4
            java.lang.Object r2 = r5.l0
            com.ss.android.ugc.aweme.ui.cell.feed.CollabFeedInvitedPendingCell r2 = (com.ss.android.ugc.aweme.ui.cell.feed.CollabFeedInvitedPendingCell) r2
            java.lang.Object r1 = r5.l1
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = (com.ss.android.ugc.aweme.feed.model.Aweme) r1
            java.lang.Object r0 = r5.l2
            com.ss.android.ugc.aweme.profile.model.User r0 = (com.ss.android.ugc.aweme.profile.model.User) r0
            r18 = 3
            r14 = r2
            r15 = r6
            r16 = r1
            r17 = r0
            r13 = r4
            r13.<init>(r14, r15, r16, r17, r18)
            r0 = 342417005(0x1468de6d, float:1.17568725E-26)
            X.12De r15 = X.C13Z4.LIZJ(r0, r4, r3)
            r18 = 805309872(0x30000db0, float:4.658558E-10)
            r20 = 1424(0x590, float:1.995E-42)
            r13 = r10
            r14 = r10
            r16 = r10
            r19 = r9
            r17 = r3
            X.C1668330tW3.LJI(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            goto L30
        Lb8:
            r0 = 0
            goto L3e
        Lba:
            r0 = 2
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS313S0300000_4.invoke$2(kotlin.jvm.internal.AwS313S0300000_4, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS313S0300000_4(CollabFeedInvitedPendingCell collabFeedInvitedPendingCell, Aweme aweme, User user, int i) {
        super(3);
        this.$t = i;
        this.l0 = collabFeedInvitedPendingCell;
        this.l1 = aweme;
        this.l2 = user;
    }
}
