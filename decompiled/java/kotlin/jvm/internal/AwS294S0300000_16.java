package kotlin.jvm.internal;

import X.AbstractC1023470cjx;
import X.C09AY;
import X.C1023640ckE;
import X.C1039050d95;
import X.C1046180dKa;
import X.C1046220dKe;
import X.C1341920l1a;
import X.EnumC1046210dKd;
import X.InterfaceC1046170dKZ;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.bullet.business.AdLynxStatBusiness;
import com.ss.android.ugc.aweme.commentv2.commentlist.powercell.PollCell;
import com.ss.android.ugc.aweme.commercialize.ba.impl.service.BAAnchorServiceImpl;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.log.AdLynxEventLoger;
import java.util.HashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS124S0101000_16;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public class AwS294S0300000_16 extends C09AY implements Function2 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            case 4:
                return invoke$4(this, obj, obj2);
            case 5:
                return invoke$5(this, obj, obj2);
            case 6:
                return invoke$6(this, obj, obj2);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS294S0300000_16 awS294S0300000_16, Object obj, Object obj2) {
        ((AbstractC1023470cjx) awS294S0300000_16.l0).withContext((AwemeRawAd) awS294S0300000_16.l1);
        Function2 function2 = (Function2) awS294S0300000_16.l2;
        if (function2 != null) {
            function2.invoke(obj, obj2);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AwS294S0300000_16 r9, java.lang.Object r10, java.lang.Object r11) {
        /*
            r5 = r10
            X.0tpg r5 = (X.InterfaceC1680500tpg) r5
            java.lang.Number r11 = (java.lang.Number) r11
            int r0 = r11.intValue()
            r1 = r0 & 3
            r0 = 2
            if (r1 != r0) goto L1a
            boolean r0 = r5.LIZ()
            if (r0 == 0) goto L1a
            r5.LIZJ()
        L17:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L1a:
            r0 = 2131829070(0x7f11214e, float:1.9291099E38)
            java.lang.String r6 = X.C0MBB.LIZIZ(r0, r5)
            r8 = 1
            r0 = -1746271574(0xffffffff97ea02aa, float:-1.5122568E-24)
            r5.LJJIIJZLJL(r0)
            java.lang.Object r0 = r9.l0
            com.ss.android.ugc.aweme.commentv2.commentlist.powercell.PollCell r0 = (com.ss.android.ugc.aweme.commentv2.commentlist.powercell.PollCell) r0
            boolean r4 = r5.LJII(r0)
            java.lang.Object r0 = r9.l1
            X.0l1a r0 = (X.C1341920l1a) r0
            boolean r0 = r5.LJII(r0)
            r4 = r4 | r0
            java.lang.Object r0 = r9.l2
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r5.LJJIIJ(r0)
            r4 = r4 | r0
            java.lang.Object r3 = r9.l0
            com.ss.android.ugc.aweme.commentv2.commentlist.powercell.PollCell r3 = (com.ss.android.ugc.aweme.commentv2.commentlist.powercell.PollCell) r3
            java.lang.Object r2 = r9.l1
            X.0l1a r2 = (X.C1341920l1a) r2
            java.lang.Object r1 = r9.l2
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r7 = r5.LJJ()
            if (r4 != 0) goto L5d
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r7 != r0) goto L67
        L5d:
            kotlin.jvm.internal.AwS260S0300000_16 r7 = new kotlin.jvm.internal.AwS260S0300000_16
            r0 = 26
            r7.<init>(r3, r2, r1, r0)
            r5.LJJIJIIJI(r7)
        L67:
            kotlin.jvm.functions.Function0 r7 = (kotlin.jvm.functions.Function0) r7
            r5.LJ()
            r3 = 48
            r4 = 0
            X.C1668330tW3.LJII(r3, r4, r5, r6, r7, r8)
            r0 = 2131829069(0x7f11214d, float:1.9291097E38)
            java.lang.String r6 = X.C0MBB.LIZIZ(r0, r5)
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r5.LJJIIJZLJL(r0)
            java.lang.Object r0 = r9.l2
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r5.LJJIIJ(r0)
            java.lang.Object r1 = r9.l2
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r7 = r5.LJJ()
            if (r0 != 0) goto L9a
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r7 != r0) goto La4
        L9a:
            kotlin.jvm.internal.AwS560S0100000_16 r7 = new kotlin.jvm.internal.AwS560S0100000_16
            r0 = 883(0x373, float:1.237E-42)
            r7.<init>(r1, r0)
            r5.LJJIJIIJI(r7)
        La4:
            kotlin.jvm.functions.Function0 r7 = (kotlin.jvm.functions.Function0) r7
            r5.LJ()
            r3 = 48
            r4 = 0
            X.C1668330tW3.LJIIIZ(r3, r4, r5, r6, r7, r8)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS294S0300000_16.invoke$1(kotlin.jvm.internal.AwS294S0300000_16, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$2(kotlin.jvm.internal.AwS294S0300000_16 r9, java.lang.Object r10, java.lang.Object r11) {
        /*
            r5 = r10
            X.0tpg r5 = (X.InterfaceC1680500tpg) r5
            java.lang.Number r11 = (java.lang.Number) r11
            int r0 = r11.intValue()
            r1 = r0 & 3
            r0 = 2
            if (r1 != r0) goto L1a
            boolean r0 = r5.LIZ()
            if (r0 == 0) goto L1a
            r5.LIZJ()
        L17:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L1a:
            r0 = 2131821804(0x7f1104ec, float:1.9276362E38)
            java.lang.String r6 = X.C0MBB.LIZIZ(r0, r5)
            r8 = 1
            r0 = -1746271574(0xffffffff97ea02aa, float:-1.5122568E-24)
            r5.LJJIIJZLJL(r0)
            java.lang.Object r0 = r9.l0
            com.ss.android.ugc.aweme.commercialize.ba.impl.service.BAAnchorServiceImpl r0 = (com.ss.android.ugc.aweme.commercialize.ba.impl.service.BAAnchorServiceImpl) r0
            boolean r4 = r5.LJII(r0)
            java.lang.Object r0 = r9.l1
            android.content.Context r0 = (android.content.Context) r0
            boolean r0 = r5.LJII(r0)
            r4 = r4 | r0
            java.lang.Object r0 = r9.l2
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r5.LJJIIJ(r0)
            r4 = r4 | r0
            java.lang.Object r3 = r9.l0
            com.ss.android.ugc.aweme.commercialize.ba.impl.service.BAAnchorServiceImpl r3 = (com.ss.android.ugc.aweme.commercialize.ba.impl.service.BAAnchorServiceImpl) r3
            java.lang.Object r2 = r9.l1
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r1 = r9.l2
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r7 = r5.LJJ()
            if (r4 != 0) goto L5d
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r7 != r0) goto L67
        L5d:
            kotlin.jvm.internal.AwS260S0300000_16 r7 = new kotlin.jvm.internal.AwS260S0300000_16
            r0 = 37
            r7.<init>(r3, r2, r1, r0)
            r5.LJJIJIIJI(r7)
        L67:
            kotlin.jvm.functions.Function0 r7 = (kotlin.jvm.functions.Function0) r7
            r5.LJ()
            r3 = 48
            r4 = 0
            X.C1668330tW3.LJIIIIZZ(r3, r4, r5, r6, r7, r8)
            r0 = 2131821803(0x7f1104eb, float:1.927636E38)
            java.lang.String r6 = X.C0MBB.LIZIZ(r0, r5)
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r5.LJJIIJZLJL(r0)
            java.lang.Object r0 = r9.l2
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r5.LJJIIJ(r0)
            java.lang.Object r1 = r9.l2
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r7 = r5.LJJ()
            if (r0 != 0) goto L9a
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r7 != r0) goto La4
        L9a:
            kotlin.jvm.internal.AwS560S0100000_16 r7 = new kotlin.jvm.internal.AwS560S0100000_16
            r0 = 1022(0x3fe, float:1.432E-42)
            r7.<init>(r1, r0)
            r5.LJJIJIIJI(r7)
        La4:
            kotlin.jvm.functions.Function0 r7 = (kotlin.jvm.functions.Function0) r7
            r5.LJ()
            r3 = 48
            r4 = 0
            X.C1668330tW3.LJIIIZ(r3, r4, r5, r6, r7, r8)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS294S0300000_16.invoke$2(kotlin.jvm.internal.AwS294S0300000_16, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$3(kotlin.jvm.internal.AwS294S0300000_16 r9, java.lang.Object r10, java.lang.Object r11) {
        /*
            r5 = r10
            X.0tpg r5 = (X.InterfaceC1680500tpg) r5
            java.lang.Number r11 = (java.lang.Number) r11
            int r0 = r11.intValue()
            r1 = r0 & 3
            r0 = 2
            if (r1 != r0) goto L1a
            boolean r0 = r5.LIZ()
            if (r0 == 0) goto L1a
            r5.LIZJ()
        L17:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L1a:
            r0 = 2131821816(0x7f1104f8, float:1.9276386E38)
            java.lang.String r6 = X.C0MBB.LIZIZ(r0, r5)
            r8 = 1
            r0 = -1746271574(0xffffffff97ea02aa, float:-1.5122568E-24)
            r5.LJJIIJZLJL(r0)
            java.lang.Object r0 = r9.l0
            com.ss.android.ugc.aweme.commercialize.ba.impl.service.BAAnchorServiceImpl r0 = (com.ss.android.ugc.aweme.commercialize.ba.impl.service.BAAnchorServiceImpl) r0
            boolean r4 = r5.LJII(r0)
            java.lang.Object r0 = r9.l1
            android.content.Context r0 = (android.content.Context) r0
            boolean r0 = r5.LJII(r0)
            r4 = r4 | r0
            java.lang.Object r0 = r9.l2
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r5.LJJIIJ(r0)
            r4 = r4 | r0
            java.lang.Object r3 = r9.l0
            com.ss.android.ugc.aweme.commercialize.ba.impl.service.BAAnchorServiceImpl r3 = (com.ss.android.ugc.aweme.commercialize.ba.impl.service.BAAnchorServiceImpl) r3
            java.lang.Object r2 = r9.l1
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r1 = r9.l2
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r7 = r5.LJJ()
            if (r4 != 0) goto L5d
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r7 != r0) goto L67
        L5d:
            kotlin.jvm.internal.AwS260S0300000_16 r7 = new kotlin.jvm.internal.AwS260S0300000_16
            r0 = 38
            r7.<init>(r3, r2, r1, r0)
            r5.LJJIJIIJI(r7)
        L67:
            kotlin.jvm.functions.Function0 r7 = (kotlin.jvm.functions.Function0) r7
            r5.LJ()
            r3 = 48
            r4 = 0
            X.C1668330tW3.LJIIIIZZ(r3, r4, r5, r6, r7, r8)
            r0 = 2131821813(0x7f1104f5, float:1.927638E38)
            java.lang.String r6 = X.C0MBB.LIZIZ(r0, r5)
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r5.LJJIIJZLJL(r0)
            java.lang.Object r0 = r9.l2
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r5.LJJIIJ(r0)
            java.lang.Object r1 = r9.l2
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r7 = r5.LJJ()
            if (r0 != 0) goto L9a
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r7 != r0) goto La4
        L9a:
            kotlin.jvm.internal.AwS560S0100000_16 r7 = new kotlin.jvm.internal.AwS560S0100000_16
            r0 = 1023(0x3ff, float:1.434E-42)
            r7.<init>(r1, r0)
            r5.LJJIJIIJI(r7)
        La4:
            kotlin.jvm.functions.Function0 r7 = (kotlin.jvm.functions.Function0) r7
            r5.LJ()
            r3 = 48
            r4 = 0
            X.C1668330tW3.LJIIIZ(r3, r4, r5, r6, r7, r8)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS294S0300000_16.invoke$3(kotlin.jvm.internal.AwS294S0300000_16, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$4(kotlin.jvm.internal.AwS294S0300000_16 r9, java.lang.Object r10, java.lang.Object r11) {
        /*
            r5 = r10
            X.0tpg r5 = (X.InterfaceC1680500tpg) r5
            java.lang.Number r11 = (java.lang.Number) r11
            int r0 = r11.intValue()
            r1 = r0 & 3
            r0 = 2
            if (r1 != r0) goto L1a
            boolean r0 = r5.LIZ()
            if (r0 == 0) goto L1a
            r5.LIZJ()
        L17:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L1a:
            r0 = 2131821810(0x7f1104f2, float:1.9276374E38)
            java.lang.String r6 = X.C0MBB.LIZIZ(r0, r5)
            r8 = 1
            r0 = -1746271574(0xffffffff97ea02aa, float:-1.5122568E-24)
            r5.LJJIIJZLJL(r0)
            java.lang.Object r0 = r9.l0
            com.ss.android.ugc.aweme.commercialize.ba.impl.service.BAAnchorServiceImpl r0 = (com.ss.android.ugc.aweme.commercialize.ba.impl.service.BAAnchorServiceImpl) r0
            boolean r4 = r5.LJII(r0)
            java.lang.Object r0 = r9.l1
            android.content.Context r0 = (android.content.Context) r0
            boolean r0 = r5.LJII(r0)
            r4 = r4 | r0
            java.lang.Object r0 = r9.l2
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r5.LJJIIJ(r0)
            r4 = r4 | r0
            java.lang.Object r3 = r9.l0
            com.ss.android.ugc.aweme.commercialize.ba.impl.service.BAAnchorServiceImpl r3 = (com.ss.android.ugc.aweme.commercialize.ba.impl.service.BAAnchorServiceImpl) r3
            java.lang.Object r2 = r9.l1
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r1 = r9.l2
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r7 = r5.LJJ()
            if (r4 != 0) goto L5d
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r7 != r0) goto L67
        L5d:
            kotlin.jvm.internal.AwS260S0300000_16 r7 = new kotlin.jvm.internal.AwS260S0300000_16
            r0 = 39
            r7.<init>(r3, r2, r1, r0)
            r5.LJJIJIIJI(r7)
        L67:
            kotlin.jvm.functions.Function0 r7 = (kotlin.jvm.functions.Function0) r7
            r5.LJ()
            r3 = 48
            r4 = 0
            X.C1668330tW3.LJIIIIZZ(r3, r4, r5, r6, r7, r8)
            r0 = 2131821813(0x7f1104f5, float:1.927638E38)
            java.lang.String r6 = X.C0MBB.LIZIZ(r0, r5)
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r5.LJJIIJZLJL(r0)
            java.lang.Object r0 = r9.l2
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r5.LJJIIJ(r0)
            java.lang.Object r1 = r9.l2
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r7 = r5.LJJ()
            if (r0 != 0) goto L9a
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r7 != r0) goto La4
        L9a:
            kotlin.jvm.internal.AwS560S0100000_16 r7 = new kotlin.jvm.internal.AwS560S0100000_16
            r0 = 1024(0x400, float:1.435E-42)
            r7.<init>(r1, r0)
            r5.LJJIJIIJI(r7)
        La4:
            kotlin.jvm.functions.Function0 r7 = (kotlin.jvm.functions.Function0) r7
            r5.LJ()
            r3 = 48
            r4 = 0
            X.C1668330tW3.LJIIIZ(r3, r4, r5, r6, r7, r8)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS294S0300000_16.invoke$4(kotlin.jvm.internal.AwS294S0300000_16, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$5(kotlin.jvm.internal.AwS294S0300000_16 r9, java.lang.Object r10, java.lang.Object r11) {
        /*
            r5 = r10
            X.0tpg r5 = (X.InterfaceC1680500tpg) r5
            java.lang.Number r11 = (java.lang.Number) r11
            int r0 = r11.intValue()
            r1 = r0 & 3
            r0 = 2
            if (r1 != r0) goto L1a
            boolean r0 = r5.LIZ()
            if (r0 == 0) goto L1a
            r5.LIZJ()
        L17:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L1a:
            r0 = 2131821807(0x7f1104ef, float:1.9276368E38)
            java.lang.String r6 = X.C0MBB.LIZIZ(r0, r5)
            r8 = 1
            r0 = -1746271574(0xffffffff97ea02aa, float:-1.5122568E-24)
            r5.LJJIIJZLJL(r0)
            java.lang.Object r0 = r9.l0
            com.ss.android.ugc.aweme.commercialize.ba.impl.service.BAAnchorServiceImpl r0 = (com.ss.android.ugc.aweme.commercialize.ba.impl.service.BAAnchorServiceImpl) r0
            boolean r4 = r5.LJII(r0)
            java.lang.Object r0 = r9.l1
            android.content.Context r0 = (android.content.Context) r0
            boolean r0 = r5.LJII(r0)
            r4 = r4 | r0
            java.lang.Object r0 = r9.l2
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r5.LJJIIJ(r0)
            r4 = r4 | r0
            java.lang.Object r3 = r9.l0
            com.ss.android.ugc.aweme.commercialize.ba.impl.service.BAAnchorServiceImpl r3 = (com.ss.android.ugc.aweme.commercialize.ba.impl.service.BAAnchorServiceImpl) r3
            java.lang.Object r2 = r9.l1
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r1 = r9.l2
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r7 = r5.LJJ()
            if (r4 != 0) goto L5d
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r7 != r0) goto L67
        L5d:
            kotlin.jvm.internal.AwS260S0300000_16 r7 = new kotlin.jvm.internal.AwS260S0300000_16
            r0 = 40
            r7.<init>(r3, r2, r1, r0)
            r5.LJJIJIIJI(r7)
        L67:
            kotlin.jvm.functions.Function0 r7 = (kotlin.jvm.functions.Function0) r7
            r5.LJ()
            r3 = 48
            r4 = 0
            X.C1668330tW3.LJIIIIZZ(r3, r4, r5, r6, r7, r8)
            r0 = 2131821813(0x7f1104f5, float:1.927638E38)
            java.lang.String r6 = X.C0MBB.LIZIZ(r0, r5)
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r5.LJJIIJZLJL(r0)
            java.lang.Object r0 = r9.l2
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r5.LJJIIJ(r0)
            java.lang.Object r1 = r9.l2
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r7 = r5.LJJ()
            if (r0 != 0) goto L9a
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r7 != r0) goto La4
        L9a:
            kotlin.jvm.internal.AwS560S0100000_16 r7 = new kotlin.jvm.internal.AwS560S0100000_16
            r0 = 1025(0x401, float:1.436E-42)
            r7.<init>(r1, r0)
            r5.LJJIJIIJI(r7)
        La4:
            kotlin.jvm.functions.Function0 r7 = (kotlin.jvm.functions.Function0) r7
            r5.LJ()
            r3 = 48
            r4 = 0
            X.C1668330tW3.LJIIIZ(r3, r4, r5, r6, r7, r8)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS294S0300000_16.invoke$5(kotlin.jvm.internal.AwS294S0300000_16, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$6(AwS294S0300000_16 awS294S0300000_16, Object obj, Object obj2) {
        View view = (View) obj;
        if (view != null && view.getContext() != null) {
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = (SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) awS294S0300000_16.l0;
            HashSet hashSet = (HashSet) awS294S0300000_16.l1;
            final C1039050d95 c1039050d95 = (C1039050d95) awS294S0300000_16.l2;
            C1046180dKa.LIZLLL.LIZJ(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, hashSet, new C1046220dKe(EnumC1046210dKd.USE_HALF, false, 28), new InterfaceC1046170dKZ() { // from class: X.0d3d
                @Override // X.InterfaceC1046170dKZ
                public final void LIZ(C1046150dKX c1046150dKX) {
                    C1028030crJ c1028030crJ;
                    C1027660cqi c1027660cqi;
                    int iIntValue;
                    AdLynxStatBusiness adLynxStatBusiness = (AdLynxStatBusiness) c1039050d95.LL.LIZIZ(AdLynxStatBusiness.class);
                    if (adLynxStatBusiness != null) {
                        int i = (int) (c1046150dKX.LIZLLL * 100);
                        C1027760cqs c1027760cqsLIZ = adLynxStatBusiness.LIZ();
                        if (c1027760cqsLIZ != null && (c1028030crJ = c1027760cqsLIZ.LJJJJI) != null && Intrinsics.LJFF(c1028030crJ.LIZJ(), Boolean.TRUE) && adLynxStatBusiness.LIZIZ && !adLynxStatBusiness.LIZJ && (c1027660cqi = adLynxStatBusiness.LIZ.LIZJ) != null) {
                            Integer num = (Integer) c1027660cqi.LJLLILLLL.LIZJ();
                            if (num != null) {
                                iIntValue = num.intValue() - 1;
                            } else {
                                iIntValue = 50;
                            }
                            if (i >= iIntValue) {
                                new AdLynxEventLoger(new Object[]{c1027660cqi}).logAd(C2268461Dqe.LIZ, String.valueOf(c1027660cqi.LIZJ()), c1027660cqi.LJ(), null, new AwS124S0101000_16(i, c1027660cqi, 14));
                                adLynxStatBusiness.LJIIIIZZ = System.currentTimeMillis();
                                adLynxStatBusiness.LIZJ = true;
                            }
                        }
                    }
                }
            });
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS294S0300000_16(AbstractC1023470cjx abstractC1023470cjx, AbstractC1023470cjx abstractC1023470cjx2, AwemeRawAd awemeRawAd, Function2<? super T, ? super C1023640ckE, Unit> function2) {
        super(2);
        this.$t = function2;
        this.l0 = abstractC1023470cjx;
        this.l1 = abstractC1023470cjx2;
        this.l2 = awemeRawAd;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS294S0300000_16(SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2, HashSet<String> hashSet, C1039050d95 c1039050d95) {
        super(2);
        this.$t = c1039050d95;
        this.l0 = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        this.l1 = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2;
        this.l2 = hashSet;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS294S0300000_16(PollCell pollCell, PollCell pollCell2, C1341920l1a c1341920l1a, Function0<Unit> function0) {
        super(2);
        this.$t = function0;
        this.l0 = pollCell;
        this.l1 = pollCell2;
        this.l2 = c1341920l1a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS294S0300000_16(BAAnchorServiceImpl bAAnchorServiceImpl, BAAnchorServiceImpl bAAnchorServiceImpl2, Context context, Function0<Unit> function0) {
        super(2);
        this.$t = function0;
        this.l0 = bAAnchorServiceImpl;
        this.l1 = bAAnchorServiceImpl2;
        this.l2 = context;
    }
}
