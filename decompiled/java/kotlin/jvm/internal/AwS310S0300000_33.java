package kotlin.jvm.internal;

import X.C09AY;
import X.C1118780fDg;
import X.C1118840fDm;
import X.C1126540fQC;
import X.C1746340vXs;
import X.C1A3S;
import X.C2178091AMd;
import X.C2182691Abb;
import X.C2182701Abc;
import X.C930540aK4;
import Y.ARunnableS102S0200000_33;
import android.content.Context;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.xelement.audiott.bean.XAudioSrc;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.history.HistoryRecordFragment;
import com.ss.android.ugc.aweme.setting.page.authmanager.AuthAppInfoFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes34.dex */
public class AwS310S0300000_33 extends C09AY implements Function2 {
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS310S0300000_33 awS310S0300000_33, Object obj, Object obj2) {
        ((Boolean) obj2).booleanValue();
        super/*X.1AMe*/.LIZIZ((XAudioSrc) awS310S0300000_33.l1, (Function1) awS310S0300000_33.l2);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS310S0300000_33 awS310S0300000_33, Object obj, Object obj2) {
        C2182701Abc c2182701Abc = (C2182701Abc) awS310S0300000_33.l0;
        HandlerHook.viewPost(c2182701Abc.LIZIZ.LJJIIJ(), new ARunnableS102S0200000_33((C1126540fQC) awS310S0300000_33.l1, c2182701Abc, 12));
        C1118780fDg.LIZIZ((C1118840fDm) awS310S0300000_33.l2, 4, 1, 2, C930540aK4.LJJII(UserService.getInstance().user().LJIJJLI()));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS310S0300000_33 awS310S0300000_33, Object obj, Object obj2) {
        C2182691Abb c2182691Abb = (C2182691Abb) awS310S0300000_33.l0;
        HandlerHook.viewPost(c2182691Abb.LIZIZ, new ARunnableS102S0200000_33((C1126540fQC) awS310S0300000_33.l1, c2182691Abb, 9));
        C1118780fDg.LIZIZ((C1118840fDm) awS310S0300000_33.l2, 4, 1, 2, C930540aK4.LJJII(UserService.getInstance().user().LJIJJLI()));
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$3(kotlin.jvm.internal.AwS310S0300000_33 r9, java.lang.Object r10, java.lang.Object r11) {
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
            r0 = 2131846168(0x7f116418, float:1.9325778E38)
            java.lang.String r6 = X.C0MBB.LIZIZ(r0, r5)
            r8 = 1
            r0 = -1746271574(0xffffffff97ea02aa, float:-1.5122568E-24)
            r5.LJJIIJZLJL(r0)
            java.lang.Object r0 = r9.l0
            android.content.Context r0 = (android.content.Context) r0
            boolean r4 = r5.LJII(r0)
            java.lang.Object r0 = r9.l1
            com.ss.android.ugc.aweme.setting.page.authmanager.AuthAppInfoFragment r0 = (com.ss.android.ugc.aweme.setting.page.authmanager.AuthAppInfoFragment) r0
            boolean r0 = r5.LJII(r0)
            r4 = r4 | r0
            java.lang.Object r0 = r9.l2
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r5.LJJIIJ(r0)
            r4 = r4 | r0
            java.lang.Object r3 = r9.l0
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r2 = r9.l1
            com.ss.android.ugc.aweme.setting.page.authmanager.AuthAppInfoFragment r2 = (com.ss.android.ugc.aweme.setting.page.authmanager.AuthAppInfoFragment) r2
            java.lang.Object r1 = r9.l2
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r7 = r5.LJJ()
            if (r4 != 0) goto L5d
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r7 != r0) goto L67
        L5d:
            kotlin.jvm.internal.AwS427S0200000_26 r7 = new kotlin.jvm.internal.AwS427S0200000_26
            r0 = 55
            r7.<init>(r3, r2, r1, r0)
            r5.LJJIJIIJI(r7)
        L67:
            kotlin.jvm.functions.Function0 r7 = (kotlin.jvm.functions.Function0) r7
            r5.LJ()
            r3 = 48
            r4 = 0
            X.C1668330tW3.LJIIIIZZ(r3, r4, r5, r6, r7, r8)
            r0 = 2131828338(0x7f111e72, float:1.9289614E38)
            java.lang.String r6 = X.C0MBB.LIZIZ(r0, r5)
            r0 = -1633490746(0xffffffff9ea2e8c6, float:-1.724869E-20)
            r5.LJJIIJZLJL(r0)
            java.lang.Object r0 = r9.l1
            com.ss.android.ugc.aweme.setting.page.authmanager.AuthAppInfoFragment r0 = (com.ss.android.ugc.aweme.setting.page.authmanager.AuthAppInfoFragment) r0
            boolean r3 = r5.LJII(r0)
            java.lang.Object r0 = r9.l2
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r5.LJJIIJ(r0)
            r3 = r3 | r0
            java.lang.Object r2 = r9.l1
            com.ss.android.ugc.aweme.setting.page.authmanager.AuthAppInfoFragment r2 = (com.ss.android.ugc.aweme.setting.page.authmanager.AuthAppInfoFragment) r2
            java.lang.Object r1 = r9.l2
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r7 = r5.LJJ()
            if (r3 != 0) goto La7
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r7 != r0) goto Lb1
        La7:
            kotlin.jvm.internal.AwS427S0200000_26 r7 = new kotlin.jvm.internal.AwS427S0200000_26
            r0 = 56
            r7.<init>(r2, r1, r0)
            r5.LJJIJIIJI(r7)
        Lb1:
            kotlin.jvm.functions.Function0 r7 = (kotlin.jvm.functions.Function0) r7
            r5.LJ()
            r3 = 48
            r4 = 0
            X.C1668330tW3.LJIIIZ(r3, r4, r5, r6, r7, r8)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS310S0300000_33.invoke$3(kotlin.jvm.internal.AwS310S0300000_33, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$4(kotlin.jvm.internal.AwS310S0300000_33 r11, java.lang.Object r12, java.lang.Object r13) {
        /*
            r7 = r12
            X.0tpg r7 = (X.InterfaceC1680500tpg) r7
            java.lang.Number r13 = (java.lang.Number) r13
            int r0 = r13.intValue()
            r1 = r0 & 3
            r0 = 2
            if (r1 != r0) goto L1a
            boolean r0 = r7.LIZ()
            if (r0 == 0) goto L1a
            r7.LIZJ()
        L17:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L1a:
            r0 = 2131848080(0x7f116b90, float:1.9329656E38)
            java.lang.String r8 = X.C0MBB.LIZIZ(r0, r7)
            r10 = 1
            r4 = -1746271574(0xffffffff97ea02aa, float:-1.5122568E-24)
            r7.LJJIIJZLJL(r4)
            java.lang.Object r0 = r11.l0
            com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel r0 = (com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel) r0
            boolean r5 = r7.LJII(r0)
            java.lang.Object r0 = r11.l1
            X.0vXs r0 = (X.C1746340vXs) r0
            boolean r0 = r7.LJII(r0)
            r5 = r5 | r0
            java.lang.Object r0 = r11.l2
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r7.LJJIIJ(r0)
            r5 = r5 | r0
            java.lang.Object r3 = r11.l0
            com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel r3 = (com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel) r3
            java.lang.Object r2 = r11.l1
            X.0vXs r2 = (X.C1746340vXs) r2
            java.lang.Object r1 = r11.l2
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r9 = r7.LJJ()
            if (r5 != 0) goto L5d
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r9 != r0) goto L67
        L5d:
            kotlin.jvm.internal.AwS270S0300000_26 r9 = new kotlin.jvm.internal.AwS270S0300000_26
            r0 = 147(0x93, float:2.06E-43)
            r9.<init>(r3, r2, r1, r0)
            r7.LJJIJIIJI(r9)
        L67:
            kotlin.jvm.functions.Function0 r9 = (kotlin.jvm.functions.Function0) r9
            r7.LJ()
            r5 = 48
            r6 = 0
            X.C1668330tW3.LJIIIIZZ(r5, r6, r7, r8, r9, r10)
            r0 = 2131848079(0x7f116b8f, float:1.9329654E38)
            java.lang.String r8 = X.C0MBB.LIZIZ(r0, r7)
            r7.LJJIIJZLJL(r4)
            java.lang.Object r0 = r11.l0
            com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel r0 = (com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel) r0
            boolean r4 = r7.LJII(r0)
            java.lang.Object r0 = r11.l1
            X.0vXs r0 = (X.C1746340vXs) r0
            boolean r0 = r7.LJII(r0)
            r4 = r4 | r0
            java.lang.Object r0 = r11.l2
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r7.LJJIIJ(r0)
            r4 = r4 | r0
            java.lang.Object r3 = r11.l0
            com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel r3 = (com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel) r3
            java.lang.Object r2 = r11.l1
            X.0vXs r2 = (X.C1746340vXs) r2
            java.lang.Object r1 = r11.l2
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r9 = r7.LJJ()
            if (r4 != 0) goto Lb1
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r9 != r0) goto Lbb
        Lb1:
            kotlin.jvm.internal.AwS270S0300000_26 r9 = new kotlin.jvm.internal.AwS270S0300000_26
            r0 = 148(0x94, float:2.07E-43)
            r9.<init>(r3, r2, r1, r0)
            r7.LJJIJIIJI(r9)
        Lbb:
            kotlin.jvm.functions.Function0 r9 = (kotlin.jvm.functions.Function0) r9
            r7.LJ()
            r5 = 48
            r6 = 0
            X.C1668330tW3.LJIIIZ(r5, r6, r7, r8, r9, r10)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS310S0300000_33.invoke$4(kotlin.jvm.internal.AwS310S0300000_33, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$5(kotlin.jvm.internal.AwS310S0300000_33 r11, java.lang.Object r12, java.lang.Object r13) {
        /*
            r7 = r12
            X.0tpg r7 = (X.InterfaceC1680500tpg) r7
            java.lang.Number r13 = (java.lang.Number) r13
            int r0 = r13.intValue()
            r1 = r0 & 3
            r0 = 2
            if (r1 != r0) goto L1a
            boolean r0 = r7.LIZ()
            if (r0 == 0) goto L1a
            r7.LIZJ()
        L17:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L1a:
            java.lang.Object r0 = r11.l0
            X.1A3S r0 = (X.C1A3S) r0
            java.lang.String r8 = r0.LJFF
            r10 = 1
            r4 = -1746271574(0xffffffff97ea02aa, float:-1.5122568E-24)
            r7.LJJIIJZLJL(r4)
            java.lang.Object r0 = r11.l1
            com.ss.android.ugc.aweme.ecommerce.search.vision.record.history.HistoryRecordFragment r0 = (com.ss.android.ugc.aweme.ecommerce.search.vision.record.history.HistoryRecordFragment) r0
            boolean r5 = r7.LJII(r0)
            java.lang.Object r0 = r11.l0
            X.1A3S r0 = (X.C1A3S) r0
            boolean r0 = r7.LJII(r0)
            r5 = r5 | r0
            java.lang.Object r0 = r11.l2
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r7.LJJIIJ(r0)
            r5 = r5 | r0
            java.lang.Object r3 = r11.l1
            com.ss.android.ugc.aweme.ecommerce.search.vision.record.history.HistoryRecordFragment r3 = (com.ss.android.ugc.aweme.ecommerce.search.vision.record.history.HistoryRecordFragment) r3
            java.lang.Object r2 = r11.l0
            X.1A3S r2 = (X.C1A3S) r2
            java.lang.Object r1 = r11.l2
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r9 = r7.LJJ()
            if (r5 != 0) goto L5c
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r9 != r0) goto L66
        L5c:
            kotlin.jvm.internal.AwS277S0300000_33 r9 = new kotlin.jvm.internal.AwS277S0300000_33
            r0 = 11
            r9.<init>(r3, r2, r1, r0)
            r7.LJJIJIIJI(r9)
        L66:
            kotlin.jvm.functions.Function0 r9 = (kotlin.jvm.functions.Function0) r9
            r7.LJ()
            r5 = 48
            r6 = 0
            X.C1668330tW3.LJIIIIZZ(r5, r6, r7, r8, r9, r10)
            java.lang.String r8 = "Cancel"
            r7.LJJIIJZLJL(r4)
            java.lang.Object r0 = r11.l1
            com.ss.android.ugc.aweme.ecommerce.search.vision.record.history.HistoryRecordFragment r0 = (com.ss.android.ugc.aweme.ecommerce.search.vision.record.history.HistoryRecordFragment) r0
            boolean r4 = r7.LJII(r0)
            java.lang.Object r0 = r11.l0
            X.1A3S r0 = (X.C1A3S) r0
            boolean r0 = r7.LJII(r0)
            r4 = r4 | r0
            java.lang.Object r0 = r11.l2
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r7.LJJIIJ(r0)
            r4 = r4 | r0
            java.lang.Object r3 = r11.l1
            com.ss.android.ugc.aweme.ecommerce.search.vision.record.history.HistoryRecordFragment r3 = (com.ss.android.ugc.aweme.ecommerce.search.vision.record.history.HistoryRecordFragment) r3
            java.lang.Object r2 = r11.l2
            kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
            java.lang.Object r1 = r11.l0
            X.1A3S r1 = (X.C1A3S) r1
            java.lang.Object r9 = r7.LJJ()
            if (r4 != 0) goto Lab
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r9 != r0) goto Lb5
        Lab:
            kotlin.jvm.internal.AwS277S0300000_33 r9 = new kotlin.jvm.internal.AwS277S0300000_33
            r0 = 12
            r9.<init>(r3, r1, r2, r0)
            r7.LJJIJIIJI(r9)
        Lb5:
            kotlin.jvm.functions.Function0 r9 = (kotlin.jvm.functions.Function0) r9
            r7.LJ()
            r5 = 54
            r6 = 0
            X.C1668330tW3.LJIIIZ(r5, r6, r7, r8, r9, r10)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS310S0300000_33.invoke$5(kotlin.jvm.internal.AwS310S0300000_33, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS310S0300000_33(C1126540fQC c1126540fQC, C1118840fDm c1118840fDm, C2182691Abb c2182691Abb, int i) {
        super(2);
        this.$t = i;
        this.l0 = c2182691Abb;
        this.l1 = c1126540fQC;
        this.l2 = c1118840fDm;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS310S0300000_33(C1126540fQC c1126540fQC, C1118840fDm c1118840fDm, C2182701Abc c2182701Abc, int i) {
        super(2);
        this.$t = i;
        this.l0 = c2182701Abc;
        this.l1 = c1126540fQC;
        this.l2 = c1118840fDm;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS310S0300000_33(C2178091AMd c2178091AMd, XAudioSrc xAudioSrc, AwS612S0100000_33 awS612S0100000_33, int i) {
        super(2);
        this.$t = i;
        this.l0 = c2178091AMd;
        this.l1 = xAudioSrc;
        this.l2 = awS612S0100000_33;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS310S0300000_33(Context context, Context context2, AuthAppInfoFragment authAppInfoFragment, Function0<Unit> function0) {
        super(2);
        this.$t = function0;
        this.l0 = context;
        this.l1 = context2;
        this.l2 = authAppInfoFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS310S0300000_33(AddressEditViewModel addressEditViewModel, AddressEditViewModel addressEditViewModel2, C1746340vXs c1746340vXs, Function0<Unit> function0) {
        super(2);
        this.$t = function0;
        this.l0 = addressEditViewModel;
        this.l1 = addressEditViewModel2;
        this.l2 = c1746340vXs;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS310S0300000_33(HistoryRecordFragment historyRecordFragment, C1A3S c1a3s, Function0 function0, int i) {
        super(2);
        this.$t = i;
        this.l0 = c1a3s;
        this.l1 = historyRecordFragment;
        this.l2 = function0;
    }
}
