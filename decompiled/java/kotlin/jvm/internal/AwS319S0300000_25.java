package kotlin.jvm.internal;

import X.C05P0;
import X.C05P1;
import X.C09AY;
import X.C0MBB;
import X.C0MXE;
import X.C0V0A;
import X.C0V0B;
import X.C0V0C;
import X.C1175204ik;
import X.C1214550hi9;
import X.C12823050b;
import X.C1296870jqv;
import X.C1320770kTT;
import X.C1331070kk5;
import X.C13D2;
import X.C13LZ;
import X.C13Z4;
import X.C1665110tQr;
import X.C1665930tSB;
import X.C1666190tSb;
import X.C1667200tUE;
import X.C1668040tVa;
import X.C1668490tWJ;
import X.C1668870tWv;
import X.C1668880tWw;
import X.C1669050tXD;
import X.C1669660tYC;
import X.C1670400tZO;
import X.C1670540tZc;
import X.C1671210tah;
import X.C1672220tcK;
import X.C1679520to6;
import X.C1679540to8;
import X.C1680510tph;
import X.C1680520tpi;
import X.C1680540tpk;
import X.C1682520tsw;
import X.C1685190txF;
import X.C1685380txY;
import X.C1685720ty6;
import X.C1685760tyA;
import X.C1685910tyP;
import X.C1687630u1B;
import X.C1690050u55;
import X.C1910890zpH;
import X.C1954807lC;
import X.C20084413iE;
import X.C633730OtP;
import X.EnumC1910860zpE;
import X.InterfaceC1631620sYq;
import X.InterfaceC1665870tS5;
import X.InterfaceC1668050tVb;
import X.InterfaceC1668850tWt;
import X.InterfaceC1680500tpg;
import X.InterfaceC1685750ty9;
import X.InterfaceC20032213Zo;
import X.InterfaceC20053113dB;
import X.InterfaceC636240OxS;
import android.content.Context;
import android.graphics.Bitmap;
import androidx.compose.foundation.layout.c;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.compliance.business.contentpreferences.nonpersonalized.NonPersonalizedBannerVM;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.tako.otherpage.searchdetailfeed.bottombar.ui.BottomTakoEntranceComposeAssem;
import com.ss.android.ugc.aweme.viewmodel.MentionFavoriteVideoVM;
import com.tts.oecverify.BdTuring;
import java.text.NumberFormat;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import o0.k;
import p2.g;

/* JADX INFO: loaded from: classes26.dex */
public class AwS319S0300000_25 extends C09AY implements InterfaceC1631620sYq {
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
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS319S0300000_25(C05P0 c05p0, C05P0<Bitmap> c05p02, C05P0<Bitmap> c05p03, C05P0<Bitmap> c05p04) {
        super(3);
        this.$t = c05p04;
        this.l0 = c05p0;
        this.l1 = c05p02;
        this.l2 = c05p03;
    }

    public static final Object invoke$0(AwS319S0300000_25 awS319S0300000_25, Object obj, Object obj2, Object obj3) {
        List<String> urlList;
        C1685380txY c1685380txYLIZLLL;
        UrlModel avatarLarger;
        UrlModel avatarLarger2;
        int i;
        InterfaceC1668850tWt interfaceC1668850tWt = (InterfaceC1668850tWt) obj;
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            if (interfaceC1680500tpg.LJJIIJ(interfaceC1668850tWt)) {
                i = 4;
            } else {
                i = 2;
            }
            iIntValue |= i;
        }
        if ((iIntValue & 19) == 18 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            float fLJI = interfaceC1668850tWt.LJI();
            C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
            InterfaceC1685750ty9 interfaceC1685750ty9LJIIJ = c.LJIIJ(c1685760tyA, fLJI * 1.1f);
            InterfaceC1668050tVb.LIZ.getClass();
            C1296870jqv c1296870jqv = C1668040tVa.LJFF;
            InterfaceC1685750ty9 interfaceC1685750ty9LIZIZ = interfaceC1668850tWt.LIZIZ(interfaceC1685750ty9LJIIJ, c1296870jqv);
            C1687630u1B c1687630u1B = (C1687630u1B) awS319S0300000_25.l0;
            User user = (User) awS319S0300000_25.l1;
            C05P0 c05p0 = (C05P0) awS319S0300000_25.l2;
            InterfaceC20053113dB interfaceC20053113dBLIZLLL = k.LIZLLL(C1668040tVa.LIZIZ, false);
            int iLIZ = C0MXE.LIZ(interfaceC1680500tpg);
            C13D2 c13d2LJJIFFI = interfaceC1680500tpg.LJJIFFI();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(interfaceC1680500tpg, interfaceC1685750ty9LIZIZ);
            g.LJLIIIL.getClass();
            AFwS214S0000000_25 aFwS214S0000000_25 = g.a.LIZIZ;
            List<String> urlList2 = null;
            if (interfaceC1680500tpg.LJIIJJI() instanceof InterfaceC20032213Zo) {
                interfaceC1680500tpg.LJJIII();
                if (interfaceC1680500tpg.LJJIIZ()) {
                    interfaceC1680500tpg.LJJI(aFwS214S0000000_25);
                } else {
                    interfaceC1680500tpg.LJIILJJIL();
                }
                C1665930tSB.LIZ(interfaceC1680500tpg, interfaceC20053113dBLIZLLL, g.a.LJI);
                C1665930tSB.LIZ(interfaceC1680500tpg, c13d2LJJIFFI, g.a.LJFF);
                AFwS311S0000000_25 aFwS311S0000000_25 = g.a.LJIIIIZZ;
                if (interfaceC1680500tpg.LJJIIZ() || !Intrinsics.LJFF(interfaceC1680500tpg.LJJ(), Integer.valueOf(iLIZ))) {
                    interfaceC1680500tpg.LJJIJIIJI(Integer.valueOf(iLIZ));
                    interfaceC1680500tpg.LIZIZ(Integer.valueOf(iLIZ), aFwS311S0000000_25);
                }
                C1665930tSB.LIZ(interfaceC1680500tpg, interfaceC1685750ty9LIZLLL, g.a.LIZLLL);
                C1672220tcK c1672220tcK = C1672220tcK.LIZ;
                InterfaceC1685750ty9 interfaceC1685750ty9LIZIZ2 = c1672220tcK.LIZIZ(c.LIZJ, c1296870jqv);
                interfaceC1680500tpg.LJJIIJZLJL(1849434622);
                Object objLJJ = interfaceC1680500tpg.LJJ();
                InterfaceC1680500tpg.LIZ.getClass();
                C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
                if (objLJJ == c1680520tpi) {
                    objLJJ = AFwS266S0000000_25.get$arr$(111);
                    interfaceC1680500tpg.LJJIJIIJI(objLJJ);
                }
                Function1 function1 = (Function1) objLJJ;
                interfaceC1680500tpg.LJ();
                interfaceC1680500tpg.LJJIIJZLJL(-1633490746);
                boolean zLJII = interfaceC1680500tpg.LJII(c1687630u1B);
                Object objLJJ2 = interfaceC1680500tpg.LJJ();
                if (zLJII || objLJJ2 == c1680520tpi) {
                    objLJJ2 = new AwS391S0200000_25(c1687630u1B, (C1687630u1B) c05p0, (C05P0<Boolean>) 54);
                    interfaceC1680500tpg.LJJIJIIJI(objLJJ2);
                }
                interfaceC1680500tpg.LJ();
                C20084413iE.LIZ(6, 0, interfaceC1680500tpg, interfaceC1685750ty9LIZIZ2, function1, (Function1) objLJJ2);
                C1910890zpH c1910890zpHLIZ = C1910890zpH.LIZLLL.LIZ(EnumC1910860zpE.CONNECT_NOW);
                StringBuilder sb = new StringBuilder("Current users' avatar url: ");
                if (user != null && (avatarLarger2 = user.getAvatarLarger()) != null) {
                    urlList = avatarLarger2.getUrlList();
                } else {
                    urlList = null;
                }
                sb.append(urlList);
                c1910890zpHLIZ.LIZ("CONNECT_NOW", sb.toString());
                if (user != null && (avatarLarger = user.getAvatarLarger()) != null) {
                    urlList2 = avatarLarger.getUrlList();
                }
                interfaceC1680500tpg.LJJIIJZLJL(-1535667163);
                if (urlList2 != null) {
                    if (urlList2.isEmpty()) {
                        interfaceC1680500tpg.LJJIIJZLJL(2139759060);
                        c1685380txYLIZLLL = C1668870tWv.LIZ(C1669660tYC.LJLJLLL, 0L, 0.0f, 0.0f, false, interfaceC1680500tpg, 0, 30);
                        interfaceC1680500tpg.LJ();
                    } else {
                        interfaceC1680500tpg.LJJIIJZLJL(2139763051);
                        c1685380txYLIZLLL = C1670540tZc.LIZLLL(new C1175204ik((String) ListProtector.get(urlList2, 0)), null, null, null, null, null, interfaceC1680500tpg, 0, 62);
                        interfaceC1680500tpg.LJ();
                    }
                    float f = 96;
                    C1671210tah.LIZ(c1685380txYLIZLLL, "current user's avatar", c1672220tcK.LIZIZ(C1667200tUE.LIZ(c.LJI(c.LJIILLIIL(c1685760tyA, f), f), C1669050tXD.LIZ), c1296870jqv), C1685910tyP.LJIIJ, interfaceC1680500tpg, 3120, 0);
                }
                interfaceC1680500tpg.LJ();
                interfaceC1680500tpg.LJIIIZ();
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS319S0300000_25 awS319S0300000_25, Object obj, Object obj2, Object obj3) {
        int i;
        InterfaceC1668850tWt interfaceC1668850tWt = (InterfaceC1668850tWt) obj;
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            if (interfaceC1680500tpg.LJJIIJ(interfaceC1668850tWt)) {
                i = 4;
            } else {
                i = 2;
            }
            iIntValue |= i;
        }
        if ((iIntValue & 19) == 18 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            ((BottomTakoEntranceComposeAssem) awS319S0300000_25.l0).Jo((C1214550hi9) awS319S0300000_25.l1, C13LZ.LIZLLL(interfaceC1668850tWt.LJ() - 45, 0, 8), (Function0) awS319S0300000_25.l2, interfaceC1680500tpg, 0);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$2(kotlin.jvm.internal.AwS319S0300000_25 r18, java.lang.Object r19, java.lang.Object r20, java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS319S0300000_25.invoke$2(kotlin.jvm.internal.AwS319S0300000_25, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$3(AwS319S0300000_25 awS319S0300000_25, Object obj, Object obj2, Object obj3) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj2;
        ((Number) obj3).intValue();
        if (((Boolean) ((C05P1) awS319S0300000_25.l0).getValue()).booleanValue()) {
            interfaceC1680500tpg.LJJIIJZLJL(-607980751);
            String str = (String) ((C05P1) awS319S0300000_25.l1).getValue();
            if (str == null) {
                str = "";
            }
            C1685190txF.LIZ(str, c.LJ(InterfaceC1685750ty9.LIZ, 1.0f), C1670400tZO.LIZIZ(interfaceC1680500tpg).B2(), C1670400tZO.LJ(interfaceC1680500tpg).LJIIZILJ, 0L, 3, 2, false, 1, null, null, interfaceC1680500tpg, 102236208, 0, 1680);
            interfaceC1680500tpg.LJ();
        } else {
            interfaceC1680500tpg.LJJIIJZLJL(-607592104);
            Unit unit = Unit.LIZ;
            interfaceC1680500tpg.LJJIIJZLJL(5004770);
            C1679540to8 c1679540to8 = (C1679540to8) awS319S0300000_25.l2;
            Object objLJJ = interfaceC1680500tpg.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            if (objLJJ == C1680510tph.LIZIZ) {
                objLJJ = new AwS604S0100000_25(c1679540to8, 531);
                interfaceC1680500tpg.LJJIJIIJI(objLJJ);
            }
            interfaceC1680500tpg.LJ();
            C1680540tpk.LIZIZ(unit, (Function1) objLJJ, interfaceC1680500tpg);
            C1679520to6.LIZ((C05P1) awS319S0300000_25.l1, (C1679540to8) awS319S0300000_25.l2, interfaceC1680500tpg, 48);
            interfaceC1680500tpg.LJ();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0131  */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v3, types: [X.0tXm, X.0tys] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$4(kotlin.jvm.internal.AwS319S0300000_25 r25, java.lang.Object r26, java.lang.Object r27, java.lang.Object r28) {
        /*
            Method dump skipped, instruction units count: 975
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS319S0300000_25.invoke$4(kotlin.jvm.internal.AwS319S0300000_25, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$5(AwS319S0300000_25 awS319S0300000_25, Object obj, Object obj2, Object obj3) {
        String strLIZIZ;
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj2;
        if ((((Number) obj3).intValue() & 17) == 16 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            C0V0B c0v0b = ((C1665110tQr) awS319S0300000_25.l0).LIZIZ;
            interfaceC1680500tpg.LJJIIJZLJL(852368927);
            if (c0v0b instanceof C0V0C) {
                c0v0b.getClass();
                strLIZIZ = C0MBB.LIZIZ(C0V0C.LIZIZ, interfaceC1680500tpg);
            } else if (c0v0b instanceof C0V0A) {
                strLIZIZ = ((C0V0A) c0v0b).LIZ;
            } else {
                throw new C1954807lC();
            }
            interfaceC1680500tpg.LJ();
            C1666190tSb.LIZ(NumberFormat.getInstance().format(1L), C0MBB.LIZIZ(2131821855, interfaceC1680500tpg), null, C13Z4.LIZJ(-1814898848, new C633730OtP(strLIZIZ, (C05P0) awS319S0300000_25.l1, (Function0) awS319S0300000_25.l2), interfaceC1680500tpg), interfaceC1680500tpg, 3072, 4);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS319S0300000_25 awS319S0300000_25, Object obj, Object obj2, Object obj3) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj2;
        if ((((Number) obj3).intValue() & 17) == 16 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            C1666190tSb.LIZ(NumberFormat.getInstance().format(2L), C0MBB.LIZIZ(2131821856, interfaceC1680500tpg), null, C13Z4.LIZJ(533650775, new AwS302S0300000_25((C1665110tQr) awS319S0300000_25.l0, (C1665110tQr) awS319S0300000_25.l1, (Function1<? super Float, Unit>) awS319S0300000_25.l2, (C05P0<Boolean>) 13), interfaceC1680500tpg), interfaceC1680500tpg, 3072, 4);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x034f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$7(kotlin.jvm.internal.AwS319S0300000_25 r38, java.lang.Object r39, java.lang.Object r40, java.lang.Object r41) {
        /*
            Method dump skipped, instruction units count: 949
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS319S0300000_25.invoke$7(kotlin.jvm.internal.AwS319S0300000_25, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$8(kotlin.jvm.internal.AwS319S0300000_25 r5, java.lang.Object r6, java.lang.Object r7, java.lang.Object r8) {
        /*
            r6 = r7
            X.0tpg r6 = (X.InterfaceC1680500tpg) r6
            java.lang.Number r8 = (java.lang.Number) r8
            int r0 = r8.intValue()
            r1 = r0 & 17
            r0 = 16
            if (r1 != r0) goto L1b
            boolean r0 = r6.LIZ()
            if (r0 == 0) goto L1b
            r6.LIZJ()
        L18:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L1b:
            java.lang.Object r2 = r5.l0
            X.0OxS r2 = (X.InterfaceC636240OxS) r2
            java.lang.Object r3 = r5.l1
            X.0u55 r3 = (X.C1690050u55) r3
            r4 = 0
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r6.LJJIIJZLJL(r0)
            java.lang.Object r0 = r5.l2
            com.ss.android.ugc.aweme.viewmodel.MentionFavoriteVideoVM r0 = (com.ss.android.ugc.aweme.viewmodel.MentionFavoriteVideoVM) r0
            boolean r0 = r6.LJII(r0)
            java.lang.Object r1 = r5.l2
            com.ss.android.ugc.aweme.viewmodel.MentionFavoriteVideoVM r1 = (com.ss.android.ugc.aweme.viewmodel.MentionFavoriteVideoVM) r1
            java.lang.Object r5 = r6.LJJ()
            if (r0 != 0) goto L45
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r5 != r0) goto L4f
        L45:
            kotlin.jvm.internal.AwS571S0100000_27 r5 = new kotlin.jvm.internal.AwS571S0100000_27
            r0 = 1363(0x553, float:1.91E-42)
            r5.<init>(r1, r0)
            r6.LJJIJIIJI(r5)
        L4f:
            kotlin.jvm.functions.Function0 r5 = (kotlin.jvm.functions.Function0) r5
            r6.LJ()
            r7 = 0
            r8 = 4
            X.C1670140tYy.LIZIZ(r2, r3, r4, r5, r6, r7, r8)
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS319S0300000_25.invoke$8(kotlin.jvm.internal.AwS319S0300000_25, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$9(AwS319S0300000_25 awS319S0300000_25, Object obj, Object obj2, Object obj3) {
        int i;
        InterfaceC1665870tS5 interfaceC1665870tS5 = (InterfaceC1665870tS5) obj;
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            if (interfaceC1680500tpg.LJJIIJ(interfaceC1665870tS5)) {
                i = 4;
            } else {
                i = 2;
            }
            iIntValue |= i;
        }
        if ((iIntValue & 19) == 18 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            C1668490tWJ.LJIIIIZZ((C1320770kTT) awS319S0300000_25.l0, interfaceC1680500tpg, 0);
            C1668880tWw c1668880tWw = (C1668880tWw) awS319S0300000_25.l1;
            C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
            InterfaceC1668050tVb.LIZ.getClass();
            C1668490tWJ.LIZ(c1668880tWw, c.LJIILIIL(C1682520tsw.LJIIIIZZ(interfaceC1665870tS5.LIZIZ(c1685760tyA, C1668040tVa.LJII), 14), 16), interfaceC1680500tpg, 0);
            C1668490tWJ.LJIIIZ((C1685910tyP) awS319S0300000_25.l2, interfaceC1680500tpg, 0);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS319S0300000_25(C05P1 c05p1, C05P1<Boolean> c05p12, C05P1<String> c05p13, C1679540to8 c1679540to8) {
        super(3);
        this.$t = c1679540to8;
        this.l0 = c05p1;
        this.l1 = c05p12;
        this.l2 = c05p13;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS319S0300000_25(InterfaceC636240OxS interfaceC636240OxS, InterfaceC636240OxS<C12823050b> interfaceC636240OxS2, C1690050u55 c1690050u55, MentionFavoriteVideoVM mentionFavoriteVideoVM) {
        super(3);
        this.$t = mentionFavoriteVideoVM;
        this.l0 = interfaceC636240OxS;
        this.l1 = interfaceC636240OxS2;
        this.l2 = c1690050u55;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS319S0300000_25(C1320770kTT c1320770kTT, C1320770kTT<C1331070kk5> c1320770kTT2, C1668880tWw c1668880tWw, C1685910tyP c1685910tyP) {
        super(3);
        this.$t = c1685910tyP;
        this.l0 = c1320770kTT;
        this.l1 = c1320770kTT2;
        this.l2 = c1668880tWw;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS319S0300000_25(C1665110tQr c1665110tQr, C1665110tQr c1665110tQr2, C05P0<Boolean> c05p0, Function0<Unit> function0) {
        super(3);
        this.$t = function0;
        this.l0 = c1665110tQr;
        this.l1 = c1665110tQr2;
        this.l2 = c05p0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS319S0300000_25(C1665110tQr c1665110tQr, C1665110tQr c1665110tQr2, Function1<? super Float, Unit> function1, C05P0<Boolean> c05p0) {
        super(3);
        this.$t = c05p0;
        this.l0 = c1665110tQr;
        this.l1 = c1665110tQr2;
        this.l2 = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS319S0300000_25(InterfaceC1685750ty9 interfaceC1685750ty9, Function0 function0, List list, int i) {
        super(3);
        this.$t = i;
        this.l0 = interfaceC1685750ty9;
        this.l1 = function0;
        this.l2 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS319S0300000_25(C1687630u1B c1687630u1B, C1687630u1B c1687630u1B2, User user, C05P0<Boolean> c05p0) {
        super(3);
        this.$t = c05p0;
        this.l0 = c1687630u1B;
        this.l1 = c1687630u1B2;
        this.l2 = user;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS319S0300000_25(Context context, InterfaceC1685750ty9 interfaceC1685750ty9, NonPersonalizedBannerVM nonPersonalizedBannerVM, int i) {
        super(3);
        this.$t = i;
        this.l0 = context;
        this.l1 = interfaceC1685750ty9;
        this.l2 = nonPersonalizedBannerVM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS319S0300000_25(BottomTakoEntranceComposeAssem bottomTakoEntranceComposeAssem, BottomTakoEntranceComposeAssem bottomTakoEntranceComposeAssem2, C1214550hi9 c1214550hi9, Function0<Unit> function0) {
        super(3);
        this.$t = function0;
        this.l0 = bottomTakoEntranceComposeAssem;
        this.l1 = bottomTakoEntranceComposeAssem2;
        this.l2 = c1214550hi9;
    }
}
