package kotlin.jvm.internal;

import X.ActivityC2186501Ahk;
import X.C09AY;
import X.C1724380uyS;
import X.C1746340vXs;
import X.C1A3S;
import X.C1AFI;
import X.C2186441Ahe;
import X.C2186531Ahn;
import X.C2186691Ai3;
import X.C2186731Ai7;
import X.C2188811AlT;
import X.C786410Ut5;
import X.EnumC1738800vLi;
import X.InterfaceC1631620sYq;
import X.InterfaceC1738830vLl;
import Y.ARunnableS35S1200000_33;
import android.content.Context;
import android.graphics.Bitmap;
import co5.g;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.history.HistoryRecordFragment;
import com.ss.android.ugc.aweme.setting.page.authmanager.AuthAppInfoFragment;
import kotlin.Unit;
import oo5.b;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes34.dex */
public class AwS494S0200000_33 extends C09AY implements InterfaceC1631620sYq {
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
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS494S0200000_33(C2186691Ai3 c2186691Ai3, Bitmap bitmap, int i) {
        super(3);
        this.$t = i;
        this.l0 = c2186691Ai3;
        this.l1 = bitmap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS494S0200000_33(Context context, AuthAppInfoFragment authAppInfoFragment, int i) {
        super(3);
        this.$t = i;
        this.l0 = context;
        this.l1 = authAppInfoFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS494S0200000_33(AddressEditViewModel addressEditViewModel, C1746340vXs c1746340vXs, int i) {
        super(3);
        this.$t = i;
        this.l0 = addressEditViewModel;
        this.l1 = c1746340vXs;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS494S0200000_33(HistoryRecordFragment historyRecordFragment, C1A3S c1a3s, int i) {
        super(3);
        this.$t = i;
        this.l0 = c1a3s;
        this.l1 = historyRecordFragment;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$0(kotlin.jvm.internal.AwS494S0200000_33 r16, java.lang.Object r17, java.lang.Object r18, java.lang.Object r19) {
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
            if (r0 == 0) goto L8b
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
            if (r0 != r2) goto L89
            r0 = 1
        L3e:
            java.lang.Object r4 = r15.LJJ()
            if (r0 != 0) goto L4d
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r4 != r0) goto L56
        L4d:
            kotlin.jvm.internal.AwS66S0001000_33 r4 = new kotlin.jvm.internal.AwS66S0001000_33
            r0 = 5
            r4.<init>(r3, r0)
            r15.LJJIJIIJI(r4)
        L56:
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
            r15.LJ()
            r5 = 1
            X.0tW1 r6 = X.EnumC1668310tW1.Normal
            r7 = 0
            r8 = 0
            java.lang.String r9 = com.ss.android.ugc.aweme.setting.page.authmanager.AuthAppInfoFragment.LLJJIJI
            java.lang.String r10 = com.ss.android.ugc.aweme.setting.page.authmanager.AuthAppInfoFragment.LLJJIJIIJIL
            kotlin.jvm.internal.AwS310S0300000_33 r3 = new kotlin.jvm.internal.AwS310S0300000_33
            r0 = r16
            java.lang.Object r2 = r0.l0
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r1 = r0.l1
            com.ss.android.ugc.aweme.setting.page.authmanager.AuthAppInfoFragment r1 = (com.ss.android.ugc.aweme.setting.page.authmanager.AuthAppInfoFragment) r1
            r0 = 3
            r3.<init>(r2, r1, r4, r0)
            r0 = 299722428(0x11dd66bc, float:3.4930967E-28)
            X.12De r13 = X.C13Z4.LIZJ(r0, r3, r15)
            r16 = 805309872(0x30000db0, float:4.658558E-10)
            r18 = 1424(0x590, float:1.995E-42)
            r11 = r8
            r12 = r8
            r14 = r8
            r17 = r7
            X.C1668330tW3.LJI(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L30
        L89:
            r0 = 0
            goto L3e
        L8b:
            r0 = 2
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS494S0200000_33.invoke$0(kotlin.jvm.internal.AwS494S0200000_33, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(final AwS494S0200000_33 awS494S0200000_33, Object obj, Object obj2, Object obj3) {
        Object objOpt;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        String str = (String) obj2;
        C1AFI c1afi = (C1AFI) obj3;
        try {
            if (((C2186691Ai3) awS494S0200000_33.l0).LIZ.LL.LIZIZ) {
                if (!zBooleanValue) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("recordNetErrorCount: ");
                    sbLIZ.append(((C2186691Ai3) awS494S0200000_33.l0).LIZ.LL.LJIIIZ);
                    C2188811AlT.LIZIZ(sbLIZ);
                    C2186531Ahn c2186531Ahn = ((C2186691Ai3) awS494S0200000_33.l0).LIZ.LL;
                    int i = c2186531Ahn.LJIIIZ + 1;
                    c2186531Ahn.LJIIIZ = i;
                    if (i > 5) {
                        c2186531Ahn.LJIIIZ = 0;
                        c2186531Ahn.LIZIZ = false;
                        ActivityC2186501Ahk activityC2186501Ahk = ((C2186691Ai3) awS494S0200000_33.l0).LIZ.LL.LJII;
                        if (activityC2186501Ahk != null) {
                            activityC2186501Ahk.LLZZLLIL(C1724380uyS.LIZ("pipo_payin_dropin_cashier_networkerror_statement"));
                        }
                        BPEAHandler bPEAHandler = ((C2186691Ai3) awS494S0200000_33.l0).LIZ.LL.LJ;
                        if (bPEAHandler != null) {
                            C786410Ut5.LJLIIL(1800L, bPEAHandler, new ARunnableS35S1200000_33(awS494S0200000_33, c1afi, str, 0));
                        }
                    }
                }
                if (c1afi != null) {
                    if (c1afi.LJIIL) {
                        c1afi.LIZ((Bitmap) awS494S0200000_33.l1);
                        if (c1afi.LJIILIIL != null) {
                            final g gVarLIZ = C2186441Ahe.LIZ(c1afi);
                            gVarLIZ.LIZ = (Bitmap) awS494S0200000_33.l1;
                            b.LJIJJLI.getClass();
                            b.LJIILLIIL = "server";
                            b.LJIIJJI = System.currentTimeMillis();
                            Bitmap bitmap = gVarLIZ.LIZ;
                            if (bitmap != null) {
                                eo5.b bVar = new eo5.b() { // from class: X.1Ai6
                                    @Override // eo5.b
                                    public final void LIZ(int i2, int i3, String str2, g gVar, String str3) {
                                        g gVar2 = gVarLIZ;
                                        gVar2.LJII = gVar.LJII;
                                        ((C2186691Ai3) this.LIZ.l0).LIZ.LL.LIZ(1, 1, "success", gVar2);
                                    }
                                };
                                InterfaceC1738830vLl interfaceC1738830vLl = b.LIZ.LJIIJ;
                                if (interfaceC1738830vLl != null) {
                                    interfaceC1738830vLl.LIZ(EnumC1738800vLi.ImageCropped.getValue(), new C2186731Ai7(bVar), bitmap);
                                }
                            }
                        }
                    } else if (!c1afi.LJIIL) {
                        JSONObject jSONObject = c1afi.LIZ;
                        if (((C2186691Ai3) awS494S0200000_33.l0).LIZ.LL.LJII != null && jSONObject != null && (objOpt = jSONObject.opt("error_message")) != null) {
                            objOpt.toString();
                        }
                    }
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$2(kotlin.jvm.internal.AwS494S0200000_33 r16, java.lang.Object r17, java.lang.Object r18, java.lang.Object r19) {
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
            kotlin.jvm.internal.AwS66S0001000_33 r4 = new kotlin.jvm.internal.AwS66S0001000_33
            r0 = 12
            r4.<init>(r3, r0)
            r15.LJJIJIIJI(r4)
        L57:
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
            r15.LJ()
            r5 = 1
            X.0tW1 r6 = X.EnumC1668310tW1.Normal
            r7 = 0
            r8 = 0
            r0 = 2131848082(0x7f116b92, float:1.932966E38)
            java.lang.String r9 = X.C0MBB.LIZIZ(r0, r15)
            r0 = 2131848081(0x7f116b91, float:1.9329658E38)
            java.lang.String r10 = X.C0MBB.LIZIZ(r0, r15)
            kotlin.jvm.internal.AwS310S0300000_33 r3 = new kotlin.jvm.internal.AwS310S0300000_33
            r0 = r16
            java.lang.Object r2 = r0.l0
            com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel r2 = (com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel) r2
            java.lang.Object r1 = r0.l1
            X.0vXs r1 = (X.C1746340vXs) r1
            r0 = 4
            r3.<init>(r2, r1, r4, r0)
            r0 = -738857109(0xffffffffd3f5ef6b, float:-2.1125675E12)
            X.12De r13 = X.C13Z4.LIZJ(r0, r3, r15)
            r16 = 805309872(0x30000db0, float:4.658558E-10)
            r18 = 1424(0x590, float:1.995E-42)
            r11 = r8
            r12 = r8
            r14 = r8
            r17 = r7
            X.C1668330tW3.LJI(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L30
        L94:
            r0 = 0
            goto L3e
        L96:
            r0 = 2
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS494S0200000_33.invoke$2(kotlin.jvm.internal.AwS494S0200000_33, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$3(kotlin.jvm.internal.AwS494S0200000_33 r16, java.lang.Object r17, java.lang.Object r18, java.lang.Object r19) {
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
            if (r0 == 0) goto L8c
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
            if (r0 != r2) goto L8a
            r0 = 1
        L3e:
            java.lang.Object r4 = r15.LJJ()
            if (r0 != 0) goto L4d
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r4 != r0) goto L57
        L4d:
            kotlin.jvm.internal.AwS66S0001000_33 r4 = new kotlin.jvm.internal.AwS66S0001000_33
            r0 = 13
            r4.<init>(r3, r0)
            r15.LJJIJIIJI(r4)
        L57:
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
            r15.LJ()
            r5 = 1
            X.0tW1 r6 = X.EnumC1668310tW1.Normal
            r7 = 0
            r8 = 0
            r0 = r16
            java.lang.Object r3 = r0.l0
            X.1A3S r3 = (X.C1A3S) r3
            java.lang.String r9 = r3.LIZLLL
            java.lang.String r10 = r3.LJ
            kotlin.jvm.internal.AwS310S0300000_33 r2 = new kotlin.jvm.internal.AwS310S0300000_33
            java.lang.Object r1 = r0.l1
            com.ss.android.ugc.aweme.ecommerce.search.vision.record.history.HistoryRecordFragment r1 = (com.ss.android.ugc.aweme.ecommerce.search.vision.record.history.HistoryRecordFragment) r1
            r0 = 5
            r2.<init>(r1, r3, r4, r0)
            r0 = 1091393751(0x410d58d7, float:8.834189)
            X.12De r13 = X.C13Z4.LIZJ(r0, r2, r15)
            r16 = 805309872(0x30000db0, float:4.658558E-10)
            r18 = 1424(0x590, float:1.995E-42)
            r11 = r8
            r12 = r8
            r14 = r8
            r17 = r7
            X.C1668330tW3.LJI(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L30
        L8a:
            r0 = 0
            goto L3e
        L8c:
            r0 = 2
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS494S0200000_33.invoke$3(kotlin.jvm.internal.AwS494S0200000_33, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
