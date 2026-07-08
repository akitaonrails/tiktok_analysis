package kotlin.jvm.internal;

import X.C09AY;
import X.C19EG;
import X.InterfaceC1631620sYq;
import android.app.Activity;
import android.content.Context;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.LiveHighLightPageFragment;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public class AwS473S0200000_4 extends C09AY implements InterfaceC1631620sYq {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            case 2:
                return invoke$2(this, obj, obj2, obj3);
            case 3:
                return invoke$3(this, obj, obj2, obj3);
            case 4:
                return invoke$4(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS473S0200000_4(Activity activity, Activity activity2, Function0<Unit> function0) {
        super(3);
        this.$t = function0;
        this.l0 = activity;
        this.l1 = activity2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS473S0200000_4(Context context, AwS550S0100000_6 awS550S0100000_6, int i) {
        super(3);
        this.$t = i;
        this.l0 = context;
        this.l1 = awS550S0100000_6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS473S0200000_4(LiveHighLightPageFragment liveHighLightPageFragment, C19EG c19eg, int i) {
        super(3);
        this.$t = i;
        this.l0 = liveHighLightPageFragment;
        this.l1 = c19eg;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS473S0200000_4(Map map, Map<String, ? extends Object> map2, Context context) {
        super(3);
        this.$t = context;
        this.l0 = map;
        this.l1 = map2;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$0(kotlin.jvm.internal.AwS473S0200000_4 r17, java.lang.Object r18, java.lang.Object r19, java.lang.Object r20) {
        /*
            r0 = r20
            r4 = r19
            r1 = r18
            java.lang.Number r1 = (java.lang.Number) r1
            int r3 = r1.intValue()
            X.0tpg r4 = (X.InterfaceC1680500tpg) r4
            java.lang.Number r0 = (java.lang.Number) r0
            int r5 = r0.intValue()
            r0 = r5 & 6
            r2 = 4
            if (r0 != 0) goto L21
            boolean r0 = r4.LJIJI(r3)
            if (r0 == 0) goto La8
            r0 = 4
        L20:
            r5 = r5 | r0
        L21:
            r1 = r5 & 19
            r0 = 18
            if (r1 != r0) goto L33
            boolean r0 = r4.LIZ()
            if (r0 == 0) goto L33
            r4.LIZJ()
        L30:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L33:
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r4.LJJIIJZLJL(r0)
            r0 = r5 & 14
            if (r0 != r2) goto La6
            r0 = 1
        L3e:
            java.lang.Object r6 = r4.LJJ()
            if (r0 != 0) goto L4d
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r6 != r0) goto L56
        L4d:
            kotlin.jvm.internal.AwS49S0001000_4 r6 = new kotlin.jvm.internal.AwS49S0001000_4
            r0 = 2
            r6.<init>(r3, r0)
            r4.LJJIJIIJI(r6)
        L56:
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            r4.LJ()
            r7 = 1
            X.0tW1 r8 = X.EnumC1668310tW1.Normal
            r9 = 0
            r10 = 0
            r5 = r17
            java.lang.Object r0 = r5.l0
            android.app.Activity r0 = (android.app.Activity) r0
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131825854(0x7f1114be, float:1.9284576E38)
            java.lang.String r11 = r1.getString(r0)
            java.lang.Object r0 = r5.l0
            android.app.Activity r0 = (android.app.Activity) r0
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131825853(0x7f1114bd, float:1.9284574E38)
            java.lang.String r12 = r1.getString(r0)
            kotlin.jvm.internal.AwS282S0300000_4 r3 = new kotlin.jvm.internal.AwS282S0300000_4
            java.lang.Object r2 = r5.l0
            android.app.Activity r2 = (android.app.Activity) r2
            java.lang.Object r1 = r5.l1
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            r0 = 0
            r3.<init>(r2, r1, r6, r0)
            r0 = 1408586192(0x53f551d0, float:2.1072791E12)
            X.12De r15 = X.C13Z4.LIZJ(r0, r3, r4)
            r18 = 805309872(0x30000db0, float:4.658558E-10)
            r20 = 1424(0x590, float:1.995E-42)
            r13 = r10
            r14 = r10
            r16 = r10
            r19 = r9
            r17 = r4
            X.C1668330tW3.LJI(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            goto L30
        La6:
            r0 = 0
            goto L3e
        La8:
            r0 = 2
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS473S0200000_4.invoke$0(kotlin.jvm.internal.AwS473S0200000_4, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AwS473S0200000_4 r16, java.lang.Object r17, java.lang.Object r18, java.lang.Object r19) {
        /*
            r0 = r19
            r15 = r18
            r1 = r17
            java.lang.Number r1 = (java.lang.Number) r1
            int r3 = r1.intValue()
            X.0tpg r15 = (X.InterfaceC1680500tpg) r15
            java.lang.Number r0 = (java.lang.Number) r0
            int r4 = r0.intValue()
            r0 = r4 & 6
            r2 = 4
            if (r0 != 0) goto L21
            boolean r0 = r15.LJIJI(r3)
            if (r0 == 0) goto L96
            r0 = 4
        L20:
            r4 = r4 | r0
        L21:
            r1 = r4 & 19
            r0 = 18
            if (r1 != r0) goto L33
            boolean r0 = r15.LIZ()
            if (r0 == 0) goto L33
            r15.LIZJ()
        L30:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L33:
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r15.LJJIIJZLJL(r0)
            r0 = r4 & 14
            if (r0 != r2) goto L94
            r0 = 1
        L3e:
            java.lang.Object r4 = r15.LJJ()
            if (r0 != 0) goto L4d
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r4 != r0) goto L57
        L4d:
            kotlin.jvm.internal.AwS49S0001000_4 r4 = new kotlin.jvm.internal.AwS49S0001000_4
            r0 = 18
            r4.<init>(r3, r0)
            r15.LJJIJIIJI(r4)
        L57:
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
            r15.LJ()
            r5 = 0
            X.0tW1 r6 = X.EnumC1668310tW1.Normal
            r8 = 0
            r0 = 2131828545(0x7f111f41, float:1.9290034E38)
            java.lang.String r9 = X.C0MBB.LIZIZ(r0, r15)
            r0 = 2131828542(0x7f111f3e, float:1.9290028E38)
            java.lang.String r10 = X.C0MBB.LIZIZ(r0, r15)
            kotlin.jvm.internal.AwS282S0300000_4 r3 = new kotlin.jvm.internal.AwS282S0300000_4
            r0 = r16
            java.lang.Object r2 = r0.l0
            java.util.Map r2 = (java.util.Map) r2
            java.lang.Object r1 = r0.l1
            android.content.Context r1 = (android.content.Context) r1
            r0 = 5
            r3.<init>(r1, r2, r4, r0)
            r0 = -184109071(0xfffffffff506b7f1, float:-1.7077601E32)
            X.12De r13 = X.C13Z4.LIZJ(r0, r3, r15)
            r16 = 805309872(0x30000db0, float:4.658558E-10)
            r18 = 1424(0x590, float:1.995E-42)
            r7 = r5
            r11 = r8
            r12 = r8
            r14 = r8
            r17 = r5
            X.C1668330tW3.LJI(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L30
        L94:
            r0 = 0
            goto L3e
        L96:
            r0 = 2
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS473S0200000_4.invoke$1(kotlin.jvm.internal.AwS473S0200000_4, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$2(kotlin.jvm.internal.AwS473S0200000_4 r16, java.lang.Object r17, java.lang.Object r18, java.lang.Object r19) {
        /*
            r0 = r19
            r15 = r18
            r1 = r17
            java.lang.Number r1 = (java.lang.Number) r1
            int r3 = r1.intValue()
            X.0tpg r15 = (X.InterfaceC1680500tpg) r15
            java.lang.Number r0 = (java.lang.Number) r0
            int r4 = r0.intValue()
            r0 = r4 & 6
            r2 = 4
            if (r0 != 0) goto L21
            boolean r0 = r15.LJIJI(r3)
            if (r0 == 0) goto L96
            r0 = 4
        L20:
            r4 = r4 | r0
        L21:
            r1 = r4 & 19
            r0 = 18
            if (r1 != r0) goto L33
            boolean r0 = r15.LIZ()
            if (r0 == 0) goto L33
            r15.LIZJ()
        L30:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L33:
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r15.LJJIIJZLJL(r0)
            r0 = r4 & 14
            if (r0 != r2) goto L94
            r0 = 1
        L3e:
            java.lang.Object r4 = r15.LJJ()
            if (r0 != 0) goto L4d
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r4 != r0) goto L57
        L4d:
            kotlin.jvm.internal.AwS49S0001000_4 r4 = new kotlin.jvm.internal.AwS49S0001000_4
            r0 = 20
            r4.<init>(r3, r0)
            r15.LJJIJIIJI(r4)
        L57:
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
            r15.LJ()
            r5 = 0
            X.0tW1 r6 = X.EnumC1668310tW1.Normal
            r8 = 0
            r0 = 2131828545(0x7f111f41, float:1.9290034E38)
            java.lang.String r9 = X.C0MBB.LIZIZ(r0, r15)
            r0 = 2131828542(0x7f111f3e, float:1.9290028E38)
            java.lang.String r10 = X.C0MBB.LIZIZ(r0, r15)
            kotlin.jvm.internal.AwS282S0300000_4 r3 = new kotlin.jvm.internal.AwS282S0300000_4
            r0 = r16
            java.lang.Object r2 = r0.l0
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r1 = r0.l1
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            r0 = 6
            r3.<init>(r2, r4, r1, r0)
            r0 = 1796494247(0x6b1453a7, float:1.7931606E26)
            X.12De r13 = X.C13Z4.LIZJ(r0, r3, r15)
            r16 = 805309872(0x30000db0, float:4.658558E-10)
            r18 = 1424(0x590, float:1.995E-42)
            r7 = r5
            r11 = r8
            r12 = r8
            r14 = r8
            r17 = r5
            X.C1668330tW3.LJI(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L30
        L94:
            r0 = 0
            goto L3e
        L96:
            r0 = 2
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS473S0200000_4.invoke$2(kotlin.jvm.internal.AwS473S0200000_4, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$3(kotlin.jvm.internal.AwS473S0200000_4 r16, java.lang.Object r17, java.lang.Object r18, java.lang.Object r19) {
        /*
            r0 = r19
            r15 = r18
            r1 = r17
            java.lang.Number r1 = (java.lang.Number) r1
            int r3 = r1.intValue()
            X.0tpg r15 = (X.InterfaceC1680500tpg) r15
            java.lang.Number r0 = (java.lang.Number) r0
            int r4 = r0.intValue()
            r0 = r4 & 6
            r2 = 4
            if (r0 != 0) goto L21
            boolean r0 = r15.LJIJI(r3)
            if (r0 == 0) goto L90
            r0 = 4
        L20:
            r4 = r4 | r0
        L21:
            r1 = r4 & 19
            r0 = 18
            if (r1 != r0) goto L33
            boolean r0 = r15.LIZ()
            if (r0 == 0) goto L33
            r15.LIZJ()
        L30:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L33:
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r15.LJJIIJZLJL(r0)
            r0 = r4 & 14
            if (r0 != r2) goto L8e
            r0 = 1
        L3e:
            java.lang.Object r4 = r15.LJJ()
            if (r0 != 0) goto L4d
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r4 != r0) goto L57
        L4d:
            kotlin.jvm.internal.AwS49S0001000_4 r4 = new kotlin.jvm.internal.AwS49S0001000_4
            r0 = 27
            r4.<init>(r3, r0)
            r15.LJJIJIIJI(r4)
        L57:
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
            r15.LJ()
            r5 = 0
            X.0tW1 r6 = X.EnumC1668310tW1.Normal
            r8 = 0
            r0 = 2131851269(0x7f117805, float:1.9336124E38)
            java.lang.String r10 = X.C0MBB.LIZIZ(r0, r15)
            kotlin.jvm.internal.AwS282S0300000_4 r3 = new kotlin.jvm.internal.AwS282S0300000_4
            r0 = r16
            java.lang.Object r2 = r0.l0
            com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.LiveHighLightPageFragment r2 = (com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.LiveHighLightPageFragment) r2
            java.lang.Object r1 = r0.l1
            X.19EG r1 = (X.C19EG) r1
            r0 = 7
            r3.<init>(r2, r1, r4, r0)
            r0 = 1609293971(0x5febe093, float:3.3993493E19)
            X.12De r13 = X.C13Z4.LIZJ(r0, r3, r15)
            r16 = 805309872(0x30000db0, float:4.658558E-10)
            r18 = 1456(0x5b0, float:2.04E-42)
            r7 = r5
            r9 = r8
            r11 = r8
            r12 = r8
            r14 = r8
            r17 = r5
            X.C1668330tW3.LJI(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L30
        L8e:
            r0 = 0
            goto L3e
        L90:
            r0 = 2
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS473S0200000_4.invoke$3(kotlin.jvm.internal.AwS473S0200000_4, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$4(kotlin.jvm.internal.AwS473S0200000_4 r16, java.lang.Object r17, java.lang.Object r18, java.lang.Object r19) {
        /*
            r0 = r19
            r15 = r18
            r1 = r17
            java.lang.Number r1 = (java.lang.Number) r1
            int r3 = r1.intValue()
            X.0tpg r15 = (X.InterfaceC1680500tpg) r15
            java.lang.Number r0 = (java.lang.Number) r0
            int r4 = r0.intValue()
            r0 = r4 & 6
            r2 = 4
            if (r0 != 0) goto L21
            boolean r0 = r15.LJIJI(r3)
            if (r0 == 0) goto L91
            r0 = 4
        L20:
            r4 = r4 | r0
        L21:
            r1 = r4 & 19
            r0 = 18
            if (r1 != r0) goto L33
            boolean r0 = r15.LIZ()
            if (r0 == 0) goto L33
            r15.LIZJ()
        L30:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L33:
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r15.LJJIIJZLJL(r0)
            r0 = r4 & 14
            if (r0 != r2) goto L8f
            r0 = 1
        L3e:
            java.lang.Object r4 = r15.LJJ()
            if (r0 != 0) goto L4d
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r4 != r0) goto L57
        L4d:
            kotlin.jvm.internal.AwS49S0001000_4 r4 = new kotlin.jvm.internal.AwS49S0001000_4
            r0 = 28
            r4.<init>(r3, r0)
            r15.LJJIJIIJI(r4)
        L57:
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
            r15.LJ()
            r5 = 1
            X.0tW1 r6 = X.EnumC1668310tW1.Normal
            r7 = 0
            r8 = 0
            r0 = 2131855478(0x7f118876, float:1.934466E38)
            java.lang.String r10 = X.C0MBB.LIZIZ(r0, r15)
            kotlin.jvm.internal.AwS282S0300000_4 r3 = new kotlin.jvm.internal.AwS282S0300000_4
            r0 = r16
            java.lang.Object r2 = r0.l0
            com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.LiveHighLightPageFragment r2 = (com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.LiveHighLightPageFragment) r2
            java.lang.Object r1 = r0.l1
            X.19EG r1 = (X.C19EG) r1
            r0 = 8
            r3.<init>(r2, r1, r4, r0)
            r0 = -1772874990(0xffffffff96541312, float:-1.7131241E-25)
            X.12De r13 = X.C13Z4.LIZJ(r0, r3, r15)
            r16 = 805309872(0x30000db0, float:4.658558E-10)
            r18 = 1456(0x5b0, float:2.04E-42)
            r9 = r8
            r11 = r8
            r12 = r8
            r14 = r8
            r17 = r7
            X.C1668330tW3.LJI(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L30
        L8f:
            r0 = 0
            goto L3e
        L91:
            r0 = 2
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS473S0200000_4.invoke$4(kotlin.jvm.internal.AwS473S0200000_4, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
