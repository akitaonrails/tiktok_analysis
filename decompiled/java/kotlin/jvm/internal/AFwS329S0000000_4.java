package kotlin.jvm.internal;

import X.C09AY;
import X.InterfaceC1631620sYq;
import X.InterfaceC1680500tpg;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public class AFwS329S0000000_4 extends C09AY implements InterfaceC1631620sYq {
    public static final /* synthetic */ AtomicReferenceArray arr$ = new AtomicReferenceArray(13);
    public final int $t;

    public static AFwS329S0000000_4 get$arr$(int i) {
        AFwS329S0000000_4 aFwS329S0000000_4 = (AFwS329S0000000_4) arr$.get(i);
        if (aFwS329S0000000_4 != null) {
            return aFwS329S0000000_4;
        }
        arr$.compareAndSet(i, null, new AFwS329S0000000_4(i));
        return (AFwS329S0000000_4) arr$.get(i);
    }

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
            case 5:
                return invoke$5(this, obj, obj2, obj3);
            case 6:
                return invoke$6(this, obj, obj2, obj3);
            case 7:
                return invoke$7(this, obj, obj2, obj3);
            case 8:
                return invoke$8(this, obj, obj2, obj3);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj, obj2, obj3);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj, obj2, obj3);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj, obj2, obj3);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFwS329S0000000_4(int i) {
        super(3);
        this.$t = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$0(kotlin.jvm.internal.AFwS329S0000000_4 r13, java.lang.Object r14, java.lang.Object r15, java.lang.Object r16) {
        /*
            r0 = r16
            r13 = r15
            java.lang.Number r14 = (java.lang.Number) r14
            int r3 = r14.intValue()
            X.0tpg r13 = (X.InterfaceC1680500tpg) r13
            java.lang.Number r0 = (java.lang.Number) r0
            int r4 = r0.intValue()
            r0 = r4 & 6
            r2 = 4
            if (r0 != 0) goto L1e
            boolean r0 = r13.LJIJI(r3)
            if (r0 == 0) goto L87
            r0 = 4
        L1d:
            r4 = r4 | r0
        L1e:
            r1 = r4 & 19
            r0 = 18
            if (r1 != r0) goto L30
            boolean r0 = r13.LIZ()
            if (r0 == 0) goto L30
            r13.LIZJ()
        L2d:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L30:
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r13.LJJIIJZLJL(r0)
            r0 = r4 & 14
            if (r0 != r2) goto L85
            r0 = 1
        L3b:
            java.lang.Object r2 = r13.LJJ()
            if (r0 != 0) goto L4a
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r2 != r0) goto L53
        L4a:
            kotlin.jvm.internal.AwS49S0001000_4 r2 = new kotlin.jvm.internal.AwS49S0001000_4
            r0 = 0
            r2.<init>(r3, r0)
            r13.LJJIJIIJI(r2)
        L53:
            kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
            r13.LJ()
            r3 = 0
            X.0tW1 r4 = X.EnumC1668310tW1.Normal
            r6 = 0
            r0 = 2131858015(0x7f11925f, float:1.9349806E38)
            java.lang.String r7 = X.C0MBB.LIZIZ(r0, r13)
            r0 = 2131858014(0x7f11925e, float:1.9349804E38)
            java.lang.String r8 = X.C0MBB.LIZIZ(r0, r13)
            kotlin.jvm.internal.AwS618S0100000_4 r1 = new kotlin.jvm.internal.AwS618S0100000_4
            r0 = 0
            r1.<init>(r2, r0)
            r0 = 2079606377(0x7bf44669, float:2.536697E36)
            X.12De r11 = X.C13Z4.LIZJ(r0, r1, r13)
            r14 = 805309872(0x30000db0, float:4.658558E-10)
            r16 = 1424(0x590, float:1.995E-42)
            r5 = r3
            r9 = r6
            r10 = r6
            r12 = r6
            r15 = r3
            X.C1668330tW3.LJI(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            goto L2d
        L85:
            r0 = 0
            goto L3b
        L87:
            r0 = 2
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AFwS329S0000000_4.invoke$0(kotlin.jvm.internal.AFwS329S0000000_4, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AFwS329S0000000_4 r13, java.lang.Object r14, java.lang.Object r15, java.lang.Object r16) {
        /*
            r0 = r16
            r13 = r15
            java.lang.Number r14 = (java.lang.Number) r14
            int r3 = r14.intValue()
            X.0tpg r13 = (X.InterfaceC1680500tpg) r13
            java.lang.Number r0 = (java.lang.Number) r0
            int r4 = r0.intValue()
            r0 = r4 & 6
            r2 = 4
            if (r0 != 0) goto L1e
            boolean r0 = r13.LJIJI(r3)
            if (r0 == 0) goto L83
            r0 = 4
        L1d:
            r4 = r4 | r0
        L1e:
            r1 = r4 & 19
            r0 = 18
            if (r1 != r0) goto L30
            boolean r0 = r13.LIZ()
            if (r0 == 0) goto L30
            r13.LIZJ()
        L2d:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L30:
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r13.LJJIIJZLJL(r0)
            r0 = r4 & 14
            if (r0 != r2) goto L81
            r0 = 1
        L3b:
            java.lang.Object r2 = r13.LJJ()
            if (r0 != 0) goto L4a
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r2 != r0) goto L54
        L4a:
            kotlin.jvm.internal.AwS49S0001000_4 r2 = new kotlin.jvm.internal.AwS49S0001000_4
            r0 = 8
            r2.<init>(r3, r0)
            r13.LJJIJIIJI(r2)
        L54:
            kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
            r13.LJ()
            r3 = 1
            X.0tW1 r4 = X.EnumC1668310tW1.Normal
            r5 = 0
            r6 = 0
            r0 = 2131849579(0x7f11716b, float:1.9332696E38)
            java.lang.String r8 = X.C0MBB.LIZIZ(r0, r13)
            kotlin.jvm.internal.AwS618S0100000_4 r1 = new kotlin.jvm.internal.AwS618S0100000_4
            r0 = 26
            r1.<init>(r2, r0)
            r0 = -1455935423(0xffffffffa9383041, float:-4.089806E-14)
            X.12De r11 = X.C13Z4.LIZJ(r0, r1, r13)
            r14 = 805309872(0x30000db0, float:4.658558E-10)
            r16 = 1456(0x5b0, float:2.04E-42)
            r7 = r6
            r9 = r6
            r10 = r6
            r12 = r6
            r15 = r5
            X.C1668330tW3.LJI(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            goto L2d
        L81:
            r0 = 0
            goto L3b
        L83:
            r0 = 2
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AFwS329S0000000_4.invoke$1(kotlin.jvm.internal.AFwS329S0000000_4, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$10(AFwS329S0000000_4 aFwS329S0000000_4, Object obj, Object obj2, Object obj3) {
        boolean z;
        int i;
        Function2 function2 = (Function2) obj;
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            if (interfaceC1680500tpg.LJII(function2)) {
                i = 4;
            } else {
                i = 2;
            }
            iIntValue |= i;
        }
        if ((iIntValue & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (interfaceC1680500tpg.LJIJJLI(iIntValue & 1, z)) {
            function2.invoke(interfaceC1680500tpg, Integer.valueOf(iIntValue & 14));
        } else {
            interfaceC1680500tpg.LIZJ();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$11(AFwS329S0000000_4 aFwS329S0000000_4, Object obj, Object obj2, Object obj3) {
        boolean z;
        int i;
        Function2 function2 = (Function2) obj;
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            if (interfaceC1680500tpg.LJII(function2)) {
                i = 4;
            } else {
                i = 2;
            }
            iIntValue |= i;
        }
        if ((iIntValue & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (interfaceC1680500tpg.LJIJJLI(iIntValue & 1, z)) {
            function2.invoke(interfaceC1680500tpg, Integer.valueOf(iIntValue & 14));
        } else {
            interfaceC1680500tpg.LIZJ();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$12(AFwS329S0000000_4 aFwS329S0000000_4, Object obj, Object obj2, Object obj3) {
        boolean z;
        int i;
        Function2 function2 = (Function2) obj;
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            if (interfaceC1680500tpg.LJII(function2)) {
                i = 4;
            } else {
                i = 2;
            }
            iIntValue |= i;
        }
        if ((iIntValue & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (interfaceC1680500tpg.LJIJJLI(iIntValue & 1, z)) {
            function2.invoke(interfaceC1680500tpg, Integer.valueOf(iIntValue & 14));
        } else {
            interfaceC1680500tpg.LIZJ();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$2(kotlin.jvm.internal.AFwS329S0000000_4 r13, java.lang.Object r14, java.lang.Object r15, java.lang.Object r16) {
        /*
            r0 = r16
            r13 = r15
            java.lang.Number r14 = (java.lang.Number) r14
            int r3 = r14.intValue()
            X.0tpg r13 = (X.InterfaceC1680500tpg) r13
            java.lang.Number r0 = (java.lang.Number) r0
            int r4 = r0.intValue()
            r0 = r4 & 6
            r2 = 4
            if (r0 != 0) goto L1e
            boolean r0 = r13.LJIJI(r3)
            if (r0 == 0) goto L89
            r0 = 4
        L1d:
            r4 = r4 | r0
        L1e:
            r1 = r4 & 19
            r0 = 18
            if (r1 != r0) goto L30
            boolean r0 = r13.LIZ()
            if (r0 == 0) goto L30
            r13.LIZJ()
        L2d:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L30:
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r13.LJJIIJZLJL(r0)
            r0 = r4 & 14
            if (r0 != r2) goto L87
            r0 = 1
        L3b:
            java.lang.Object r2 = r13.LJJ()
            if (r0 != 0) goto L4a
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r2 != r0) goto L54
        L4a:
            kotlin.jvm.internal.AwS49S0001000_4 r2 = new kotlin.jvm.internal.AwS49S0001000_4
            r0 = 11
            r2.<init>(r3, r0)
            r13.LJJIJIIJI(r2)
        L54:
            kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
            r13.LJ()
            r3 = 1
            X.0tW1 r4 = X.EnumC1668310tW1.Normal
            r5 = 0
            r6 = 0
            r0 = 2131834777(0x7f113799, float:1.9302674E38)
            java.lang.String r7 = X.C0MBB.LIZIZ(r0, r13)
            r0 = 2131845241(0x7f116079, float:1.9323897E38)
            java.lang.String r8 = X.C0MBB.LIZIZ(r0, r13)
            kotlin.jvm.internal.AwS618S0100000_4 r1 = new kotlin.jvm.internal.AwS618S0100000_4
            r0 = 64
            r1.<init>(r2, r0)
            r0 = -772693617(0xffffffffd1f1a18f, float:-1.297247E11)
            X.12De r11 = X.C13Z4.LIZJ(r0, r1, r13)
            r14 = 805309872(0x30000db0, float:4.658558E-10)
            r16 = 1424(0x590, float:1.995E-42)
            r9 = r6
            r10 = r6
            r12 = r6
            r15 = r5
            X.C1668330tW3.LJI(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            goto L2d
        L87:
            r0 = 0
            goto L3b
        L89:
            r0 = 2
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AFwS329S0000000_4.invoke$2(kotlin.jvm.internal.AFwS329S0000000_4, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$3(kotlin.jvm.internal.AFwS329S0000000_4 r13, java.lang.Object r14, java.lang.Object r15, java.lang.Object r16) {
        /*
            r0 = r16
            r13 = r15
            java.lang.Number r14 = (java.lang.Number) r14
            int r3 = r14.intValue()
            X.0tpg r13 = (X.InterfaceC1680500tpg) r13
            java.lang.Number r0 = (java.lang.Number) r0
            int r4 = r0.intValue()
            r0 = r4 & 6
            r2 = 4
            if (r0 != 0) goto L1e
            boolean r0 = r13.LJIJI(r3)
            if (r0 == 0) goto L93
            r0 = 4
        L1d:
            r4 = r4 | r0
        L1e:
            r1 = r4 & 19
            r0 = 18
            if (r1 != r0) goto L30
            boolean r0 = r13.LIZ()
            if (r0 == 0) goto L30
            r13.LIZJ()
        L2d:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L30:
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r13.LJJIIJZLJL(r0)
            r0 = r4 & 14
            if (r0 != r2) goto L91
            r0 = 1
        L3b:
            java.lang.Object r2 = r13.LJJ()
            if (r0 != 0) goto L4a
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r2 != r0) goto L54
        L4a:
            kotlin.jvm.internal.AwS49S0001000_4 r2 = new kotlin.jvm.internal.AwS49S0001000_4
            r0 = 12
            r2.<init>(r3, r0)
            r13.LJJIJIIJI(r2)
        L54:
            kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
            r13.LJ()
            r3 = 1
            X.0tW1 r4 = X.EnumC1668310tW1.Normal
            r5 = 0
            r6 = 0
            boolean r0 = com.ss.android.ugc.aweme.ab.SubscribeSettingsExp.LIZIZ()
            if (r0 == 0) goto L8d
            r0 = 2131849279(0x7f11703f, float:1.9332087E38)
        L67:
            java.lang.String r7 = X.C0MBB.LIZIZ(r0, r13)
            r0 = 2131826369(0x7f1116c1, float:1.928562E38)
            java.lang.String r8 = X.C0MBB.LIZIZ(r0, r13)
            kotlin.jvm.internal.AwS618S0100000_4 r1 = new kotlin.jvm.internal.AwS618S0100000_4
            r0 = 65
            r1.<init>(r2, r0)
            r0 = -1064604010(0xffffffffc08b6e96, float:-4.3572493)
            X.12De r11 = X.C13Z4.LIZJ(r0, r1, r13)
            r14 = 805309872(0x30000db0, float:4.658558E-10)
            r16 = 1424(0x590, float:1.995E-42)
            r9 = r6
            r10 = r6
            r12 = r6
            r15 = r5
            X.C1668330tW3.LJI(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            goto L2d
        L8d:
            r0 = 2131834364(0x7f1135fc, float:1.9301836E38)
            goto L67
        L91:
            r0 = 0
            goto L3b
        L93:
            r0 = 2
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AFwS329S0000000_4.invoke$3(kotlin.jvm.internal.AFwS329S0000000_4, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$4(AFwS329S0000000_4 aFwS329S0000000_4, Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        return Boolean.FALSE;
    }

    public static final Object invoke$5(AFwS329S0000000_4 aFwS329S0000000_4, Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$6(kotlin.jvm.internal.AFwS329S0000000_4 r13, java.lang.Object r14, java.lang.Object r15, java.lang.Object r16) {
        /*
            r0 = r16
            r13 = r15
            java.lang.Number r14 = (java.lang.Number) r14
            int r3 = r14.intValue()
            X.0tpg r13 = (X.InterfaceC1680500tpg) r13
            java.lang.Number r0 = (java.lang.Number) r0
            int r4 = r0.intValue()
            r0 = r4 & 6
            r2 = 4
            if (r0 != 0) goto L1e
            boolean r0 = r13.LJIJI(r3)
            if (r0 == 0) goto L88
            r0 = 4
        L1d:
            r4 = r4 | r0
        L1e:
            r1 = r4 & 19
            r0 = 18
            if (r1 != r0) goto L30
            boolean r0 = r13.LIZ()
            if (r0 == 0) goto L30
            r13.LIZJ()
        L2d:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L30:
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r13.LJJIIJZLJL(r0)
            r0 = r4 & 14
            if (r0 != r2) goto L86
            r0 = 1
        L3b:
            java.lang.Object r2 = r13.LJJ()
            if (r0 != 0) goto L4a
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r2 != r0) goto L54
        L4a:
            kotlin.jvm.internal.AwS49S0001000_4 r2 = new kotlin.jvm.internal.AwS49S0001000_4
            r0 = 30
            r2.<init>(r3, r0)
            r13.LJJIJIIJI(r2)
        L54:
            kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
            r13.LJ()
            r3 = 0
            X.0tW1 r4 = X.EnumC1668310tW1.Normal
            r6 = 0
            r0 = 2131820544(0x7f110000, float:1.9273806E38)
            java.lang.String r7 = X.C0MBB.LIZIZ(r0, r13)
            r0 = 2131820545(0x7f110001, float:1.9273808E38)
            java.lang.String r8 = X.C0MBB.LIZIZ(r0, r13)
            kotlin.jvm.internal.AwS618S0100000_4 r1 = new kotlin.jvm.internal.AwS618S0100000_4
            r0 = 76
            r1.<init>(r2, r0)
            r0 = 1847986171(0x6e2607fb, float:1.284604E28)
            X.12De r11 = X.C13Z4.LIZJ(r0, r1, r13)
            r14 = 805309872(0x30000db0, float:4.658558E-10)
            r16 = 1424(0x590, float:1.995E-42)
            r5 = r3
            r9 = r6
            r10 = r6
            r12 = r6
            r15 = r3
            X.C1668330tW3.LJI(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            goto L2d
        L86:
            r0 = 0
            goto L3b
        L88:
            r0 = 2
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AFwS329S0000000_4.invoke$6(kotlin.jvm.internal.AFwS329S0000000_4, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$7(AFwS329S0000000_4 aFwS329S0000000_4, Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        return Boolean.FALSE;
    }

    public static final Object invoke$8(AFwS329S0000000_4 aFwS329S0000000_4, Object obj, Object obj2, Object obj3) {
        int i;
        Function2 function2 = (Function2) obj;
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            if (interfaceC1680500tpg.LJII(function2)) {
                i = 4;
            } else {
                i = 2;
            }
            iIntValue |= i;
        }
        if ((iIntValue & 19) == 18 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            function2.invoke(interfaceC1680500tpg, Integer.valueOf(iIntValue & 14));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$9(AFwS329S0000000_4 aFwS329S0000000_4, Object obj, Object obj2, Object obj3) {
        boolean z;
        int i;
        Function2 function2 = (Function2) obj;
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            if (interfaceC1680500tpg.LJII(function2)) {
                i = 4;
            } else {
                i = 2;
            }
            iIntValue |= i;
        }
        if ((iIntValue & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (interfaceC1680500tpg.LJIJJLI(iIntValue & 1, z)) {
            function2.invoke(interfaceC1680500tpg, Integer.valueOf(iIntValue & 14));
        } else {
            interfaceC1680500tpg.LIZJ();
        }
        return Unit.LIZ;
    }
}
