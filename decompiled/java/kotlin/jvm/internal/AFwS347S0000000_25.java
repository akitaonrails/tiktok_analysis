package kotlin.jvm.internal;

import X.C05Y0;
import X.C09AY;
import X.C0MBB;
import X.C0MXE;
import X.C11E7;
import X.C13D2;
import X.C1643800ssU;
import X.C1665910tS9;
import X.C1665930tSB;
import X.C1666190tSb;
import X.C1666280tSk;
import X.C1666870tTh;
import X.C1668040tVa;
import X.C1668100tVg;
import X.C1668880tWw;
import X.C1668930tX1;
import X.C1669660tYC;
import X.C1670400tZO;
import X.C1671550tbF;
import X.C1672220tcK;
import X.C1674030tfF;
import X.C1674080tfK;
import X.C1674090tfL;
import X.C1674100tfM;
import X.C1674110tfN;
import X.C1674190tfV;
import X.C1674780tgS;
import X.C1675020tgq;
import X.C1675080tgw;
import X.C1675840tiA;
import X.C1677050tk7;
import X.C1678710tmn;
import X.C1678780tmu;
import X.C1679660toK;
import X.C1680510tph;
import X.C1680770tq7;
import X.C1680910tqL;
import X.C1683130ttv;
import X.C1685190txF;
import X.C1685720ty6;
import X.C1685760tyA;
import X.C1685910tyP;
import X.C1685950tyT;
import X.C1686010tyZ;
import X.C1688900u3E;
import X.C1695940uEa;
import X.C1695950uEb;
import X.C1696000uEg;
import X.C1697320uGo;
import X.C20055113dV;
import X.EnumC1671200tag;
import X.EnumC1677000tk2;
import X.InterfaceC1631620sYq;
import X.InterfaceC1643980ssm;
import X.InterfaceC1668050tVb;
import X.InterfaceC1675090tgx;
import X.InterfaceC1676620tjQ;
import X.InterfaceC1680500tpg;
import X.InterfaceC1680960tqQ;
import X.InterfaceC1685750ty9;
import X.InterfaceC20032213Zo;
import X.InterfaceC20053113dB;
import X.InterfaceC20056613dk;
import android.graphics.Matrix;
import androidx.compose.foundation.layout.c;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.ss.android.ugc.aweme.discover.model.DiscoverSectionList;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.text.NumberFormat;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS33S0102000_25;
import o0.k;
import p2.g;

/* JADX INFO: loaded from: classes26.dex */
public class AFwS347S0000000_25 extends C09AY implements InterfaceC1631620sYq {
    public static final /* synthetic */ AtomicReferenceArray arr$ = new AtomicReferenceArray(28);
    public final int $t;

    public static AFwS347S0000000_25 get$arr$(int i) {
        AFwS347S0000000_25 aFwS347S0000000_25 = (AFwS347S0000000_25) arr$.get(i);
        if (aFwS347S0000000_25 != null) {
            return aFwS347S0000000_25;
        }
        arr$.compareAndSet(i, null, new AFwS347S0000000_25(i));
        return (AFwS347S0000000_25) arr$.get(i);
    }

    public static final Object invoke$12(AFwS347S0000000_25 aFwS347S0000000_25, Object obj, Object obj2, Object obj3) {
        return obj2 != null ? obj2 : obj3;
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
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this, obj, obj2, obj3);
            case 14:
                return invoke$14(this, obj, obj2, obj3);
            case 15:
                return invoke$15(this, obj, obj2, obj3);
            case 16:
                return invoke$16(this, obj, obj2, obj3);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this, obj, obj2, obj3);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this, obj, obj2, obj3);
            case 19:
                return invoke$19(this, obj, obj2, obj3);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return invoke$20(this, obj, obj2, obj3);
            case 21:
                return invoke$21(this, obj, obj2, obj3);
            case 22:
                return invoke$22(this, obj, obj2, obj3);
            case 23:
                return invoke$23(this, obj, obj2, obj3);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return invoke$24(this, obj, obj2, obj3);
            case 25:
                return invoke$25(this, obj, obj2, obj3);
            case 26:
                return invoke$26(this, obj, obj2, obj3);
            case 27:
                return invoke$27(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFwS347S0000000_25(int i) {
        super(3);
        this.$t = i;
    }

    public static final Object invoke$0(AFwS347S0000000_25 aFwS347S0000000_25, Object obj, Object obj2, Object obj3) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj2;
        ((Number) obj3).intValue();
        String strLIZIZ = C0MBB.LIZIZ(2131822605, interfaceC1680500tpg);
        InterfaceC1685750ty9 interfaceC1685750ty9LIZIZ = C1679660toK.LIZIZ(InterfaceC1685750ty9.LIZ, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, 1, 65535);
        interfaceC1680500tpg.LJJIIJZLJL(1849434622);
        Object objLJJ = interfaceC1680500tpg.LJJ();
        InterfaceC1680500tpg.LIZ.getClass();
        if (objLJJ == C1680510tph.LIZIZ) {
            objLJJ = AFwS266S0000000_25.get$arr$(2);
            interfaceC1680500tpg.LJJIJIIJI(objLJJ);
        }
        interfaceC1680500tpg.LJ();
        C1685190txF.LIZ(strLIZIZ, C1680910tqL.LIZIZ(interfaceC1685750ty9LIZIZ, (Function1) objLJJ), C1685910tyP.LJ, C1670400tZO.LJ(interfaceC1680500tpg).LJIILJJIL, 0L, 0, 0, false, 0, null, null, interfaceC1680500tpg, 384, 0, 2032);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AFwS347S0000000_25 aFwS347S0000000_25, Object obj, Object obj2, Object obj3) {
        float f;
        InterfaceC1685750ty9 interfaceC1685750ty9 = (InterfaceC1685750ty9) obj;
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj2;
        ((Number) obj3).intValue();
        interfaceC1680500tpg.LJJIIJZLJL(1011184794);
        if (interfaceC1680500tpg.LJJIL(C20055113dV.LJIILIIL) == EnumC1671200tag.Rtl) {
            f = -1.0f;
        } else {
            f = 1.0f;
        }
        InterfaceC1685750ty9 interfaceC1685750ty9LIZ = C1665910tS9.LIZ(interfaceC1685750ty9, f, 1.0f);
        interfaceC1680500tpg.LJ();
        return interfaceC1685750ty9LIZ;
    }

    public static final Object invoke$10(AFwS347S0000000_25 aFwS347S0000000_25, Object obj, Object obj2, Object obj3) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj2;
        ((Number) obj3).intValue();
        interfaceC1680500tpg.LJJIIJZLJL(-174918434);
        C1685950tyT c1685950tyT = new C1685950tyT();
        c1685950tyT.LIZ = 100;
        C1686010tyZ c1686010tyZ = new C1686010tyZ(c1685950tyT);
        interfaceC1680500tpg.LJ();
        return c1686010tyZ;
    }

    public static final Object invoke$11(AFwS347S0000000_25 aFwS347S0000000_25, Object obj, Object obj2, Object obj3) {
        InterfaceC1680960tqQ interfaceC1680960tqQ = (InterfaceC1680960tqQ) obj;
        long j = ((C1680770tq7) obj2).LIZ;
        C1695950uEb c1695950uEb = C1674780tgS.LIZ;
        C1695950uEb c1695950uEbLIZ = C1695940uEa.LIZ();
        C1675840tiA.LIZIZ(c1695950uEbLIZ, c1695950uEb);
        float[] fArrLIZ = C1696000uEg.LIZ();
        C1683130ttv bounds = c1695950uEbLIZ.getBounds();
        float f = bounds.LIZJ;
        float f2 = bounds.LIZ;
        float f3 = ((f - f2) + (f2 * 2.0f)) - (-36.0f);
        float f4 = bounds.LIZLLL;
        float f5 = bounds.LIZIZ;
        float fMin = Math.min(Float.intBitsToFloat((int) (j >> 32)) / f3, Float.intBitsToFloat((int) (j & 4294967295L)) / (((f4 - f5) + (f5 * 2.0f)) - (-36.0f)));
        float f6 = 18.0f * fMin;
        C1696000uEg.LJI(f6, f6, 0.0f, fArrLIZ);
        C1696000uEg.LJ(fMin, fMin, 1.0f, fArrLIZ);
        if (c1695950uEbLIZ.LJ == null) {
            c1695950uEbLIZ.LJ = new Matrix();
        }
        C1697320uGo.LIZ(c1695950uEbLIZ.LJ, fArrLIZ);
        c1695950uEbLIZ.LIZIZ.transform(c1695950uEbLIZ.LJ);
        C1675840tiA.LIZIZ(interfaceC1680960tqQ, c1695950uEbLIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$13(AFwS347S0000000_25 aFwS347S0000000_25, Object obj, Object obj2, Object obj3) {
        C1668880tWw c1668880tWw;
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj2;
        if ((((Number) obj3).intValue() & 17) == 16 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
            float f = 16;
            InterfaceC1685750ty9 interfaceC1685750ty9LJIILJJIL = c.LJIILJJIL(c1685760tyA, 22, f);
            InterfaceC1668050tVb.LIZ.getClass();
            InterfaceC20053113dB interfaceC20053113dBLIZLLL = k.LIZLLL(C1668040tVa.LIZIZ, false);
            int iLIZ = C0MXE.LIZ(interfaceC1680500tpg);
            C13D2 c13d2LJJIFFI = interfaceC1680500tpg.LJJIFFI();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(interfaceC1680500tpg, interfaceC1685750ty9LJIILJJIL);
            g.LJLIIIL.getClass();
            AFwS214S0000000_25 aFwS214S0000000_25 = g.a.LIZIZ;
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
                if (((Boolean) interfaceC1680500tpg.LJJIL(C1674190tfV.LIZ)).booleanValue()) {
                    c1668880tWw = C1668100tVg.LIZ;
                } else {
                    c1668880tWw = C1669660tYC.w;
                }
                C1668930tX1.LIZIZ(c1668880tWw, null, c1672220tcK.LIZIZ(c.LJIILIIL(c1685760tyA, f), C1668040tVa.LJ), C1670400tZO.LIZIZ(interfaceC1680500tpg).K3(), 0.0f, 0.0f, false, interfaceC1680500tpg, 48, 112);
                interfaceC1680500tpg.LJIIIZ();
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$14(AFwS347S0000000_25 aFwS347S0000000_25, Object obj, Object obj2, Object obj3) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj2;
        ((Number) obj3).intValue();
        interfaceC1680500tpg.LJJIIJZLJL(557634850);
        C1677050tk7 c1677050tk7 = C1666870tTh.LIZ;
        interfaceC1680500tpg.LJ();
        return c1677050tk7;
    }

    public static final Object invoke$15(AFwS347S0000000_25 aFwS347S0000000_25, Object obj, Object obj2, Object obj3) {
        C1643800ssU.LJ.put(obj, obj3);
        return obj2;
    }

    public static final Object invoke$16(AFwS347S0000000_25 aFwS347S0000000_25, Object obj, Object obj2, Object obj3) {
        float f;
        InterfaceC1685750ty9 interfaceC1685750ty9 = (InterfaceC1685750ty9) obj;
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj2;
        ((Number) obj3).intValue();
        interfaceC1680500tpg.LJJIIJZLJL(343545526);
        if (interfaceC1680500tpg.LJJIL(C20055113dV.LJIILIIL) == EnumC1671200tag.Rtl) {
            f = -1.0f;
        } else {
            f = 1.0f;
        }
        InterfaceC1685750ty9 interfaceC1685750ty9LIZ = C1665910tS9.LIZ(interfaceC1685750ty9, f, 1.0f);
        interfaceC1680500tpg.LJ();
        return interfaceC1685750ty9LIZ;
    }

    public static final Object invoke$17(AFwS347S0000000_25 aFwS347S0000000_25, Object obj, Object obj2, Object obj3) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj2;
        if ((((Number) obj3).intValue() & 17) == 16 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            C1666190tSb.LIZ(NumberFormat.getInstance().format(3L), C0MBB.LIZJ(2131821854, new Object[]{"✔"}, interfaceC1680500tpg), null, C1666280tSk.LIZ, interfaceC1680500tpg, 3072, 4);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$18(kotlin.jvm.internal.AFwS347S0000000_25 r10, java.lang.Object r11, java.lang.Object r12, java.lang.Object r13) {
        /*
            X.0tpg r12 = (X.InterfaceC1680500tpg) r12
            java.lang.Number r13 = (java.lang.Number) r13
            int r0 = r13.intValue()
            r1 = r0 & 17
            r0 = 16
            if (r1 != r0) goto L1a
            boolean r0 = r12.LIZ()
            if (r0 == 0) goto L1a
            r12.LIZJ()
        L17:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L1a:
            r0 = -259802511(0xfffffffff083ba71, float:-3.2614344E29)
            r12.LJJIIJZLJL(r0)
            java.lang.Class<com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.login.LoginGroupVM> r0 = com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.login.LoginGroupVM.class
            X.12Dl r2 = X.C13LE.LIZ(r0)
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r12.LJJIIJZLJL(r0)
            boolean r0 = r12.LJII(r2)
            java.lang.Object r6 = r12.LJJ()
            if (r0 != 0) goto L3f
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r6 != r0) goto L49
        L3f:
            X.020e r6 = new X.020e
            r0 = 332(0x14c, float:4.65E-43)
            r6.<init>(r2, r0)
            r12.LJJIJIIJI(r6)
        L49:
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            r12.LJ()
            r0 = 1849434622(0x6e3c21fe, float:1.4556069E28)
            r12.LJJIIJZLJL(r0)
            java.lang.Object r11 = r12.LJJ()
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r11 != r0) goto L6a
            r0 = 471(0x1d7, float:6.6E-43)
            kotlin.jvm.internal.AFwS266S0000000_25 r11 = kotlin.jvm.internal.AFwS266S0000000_25.get$arr$(r0)
            r12.LJJIJIIJI(r11)
        L6a:
            kotlin.jvm.functions.Function1 r11 = (kotlin.jvm.functions.Function1) r11
            r12.LJ()
            X.13DN r0 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalLifecycleOwner()
            java.lang.Object r3 = r12.LJJIL(r0)
            androidx.lifecycle.LifecycleOwner r3 = (androidx.lifecycle.LifecycleOwner) r3
            androidx.lifecycle.ViewModelStoreOwner r1 = X.C1685320txS.LIZ(r12)
            if (r1 == 0) goto Lbf
            X.13DQ r0 = X.C634900OvI.LIZ
            r12.LJJIL(r0)
            com.bytedance.assem.arch.viewModel.AssemVMLazy r4 = new com.bytedance.assem.arch.viewModel.AssemVMLazy
            kotlin.jvm.functions.Function0 r5 = X.C724750Sbp.LJIIJ(r3, r2)
            X.0Ho5 r7 = new X.0Ho5
            r7.<init>()
            X.06Wu r8 = new X.06Wu
            r2 = 0
            r8.<init>(r3, r2)
            X.0DOt r9 = new X.0DOt
            r9.<init>(r1, r2)
            boolean r0 = r3 instanceof androidx.lifecycle.HasDefaultViewModelProviderFactory
            if (r0 == 0) goto Lbc
            androidx.lifecycle.HasDefaultViewModelProviderFactory r3 = (androidx.lifecycle.HasDefaultViewModelProviderFactory) r3
            if (r3 == 0) goto Lbc
            kotlin.jvm.internal.AwS569S0100000_25 r10 = new kotlin.jvm.internal.AwS569S0100000_25
            r0 = 859(0x35b, float:1.204E-42)
            r10.<init>(r3, r0)
        La9:
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            com.bytedance.assem.arch.viewModel.AssemViewModel r1 = r4.getValue()
            r12.LJ()
            com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.login.LoginGroupVM r1 = (com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.login.LoginGroupVM) r1
            r0 = 48
            X.C14Y4.LJ(r1, r2, r12, r0, r2)
            goto L17
        Lbc:
            X.0fqj r10 = X.C1143000fqk.LIZ
            goto La9
        Lbf:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "ViewModelStoreOwner cannot be null"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AFwS347S0000000_25.invoke$18(kotlin.jvm.internal.AFwS347S0000000_25, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$19(AFwS347S0000000_25 aFwS347S0000000_25, Object obj, Object obj2, Object obj3) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj2;
        if ((((Number) obj3).intValue() & 17) == 16 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            C1688900u3E.LIZLLL(0, interfaceC1680500tpg, C0MBB.LIZIZ(2131829013, interfaceC1680500tpg));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AFwS347S0000000_25 aFwS347S0000000_25, Object obj, Object obj2, Object obj3) {
        Object obj4;
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj2;
        ((Number) obj3).intValue();
        interfaceC1680500tpg.LJJIJIIJIL(1964721376);
        if (((Boolean) interfaceC1680500tpg.LJJIL(C1678710tmn.LIZ)).booleanValue()) {
            final long j = C1678710tmn.LIZIZ;
            obj4 = new InterfaceC20056613dk(j) { // from class: X.0ttU
                public final long LIZIZ;

                @Override // X.InterfaceC1685750ty9
                public final /* synthetic */ InterfaceC1685750ty9 LIZ(InterfaceC1685750ty9 interfaceC1685750ty9) {
                    return C1685810tyF.LIZ(this, interfaceC1685750ty9);
                }

                @Override // X.InterfaceC20056613dk
                public final /* synthetic */ int LIZLLL(InterfaceC1676350tiz interfaceC1676350tiz, InterfaceC1676340tiy interfaceC1676340tiy, int i) {
                    return C1688380u2O.LIZJ(this, interfaceC1676350tiz, interfaceC1676340tiy, i);
                }

                @Override // X.InterfaceC20056613dk
                public final /* synthetic */ int LJIIL(InterfaceC1676350tiz interfaceC1676350tiz, InterfaceC1676340tiy interfaceC1676340tiy, int i) {
                    return C1688380u2O.LIZ(this, interfaceC1676350tiz, interfaceC1676340tiy, i);
                }

                @Override // X.InterfaceC1685750ty9
                public final /* synthetic */ boolean LJIILLIIL(Function1 function1) {
                    return C1672400tcc.LIZ(this, function1);
                }

                @Override // X.InterfaceC20056613dk
                public final /* synthetic */ int LJIJJLI(InterfaceC1676350tiz interfaceC1676350tiz, InterfaceC1676340tiy interfaceC1676340tiy, int i) {
                    return C1688380u2O.LIZLLL(this, interfaceC1676350tiz, interfaceC1676340tiy, i);
                }

                @Override // X.InterfaceC20056613dk
                public final /* synthetic */ int LJIL(InterfaceC1676350tiz interfaceC1676350tiz, InterfaceC1676340tiy interfaceC1676340tiy, int i) {
                    return C1688380u2O.LIZIZ(this, interfaceC1676350tiz, interfaceC1676340tiy, i);
                }

                public final int hashCode() {
                    return C786410Ut5.Y2(this.LIZIZ);
                }

                {
                    this.LIZIZ = j;
                }

                public final boolean equals(Object obj5) {
                    C1682860ttU c1682860ttU;
                    if (obj5 instanceof C1682860ttU) {
                        c1682860ttU = (C1682860ttU) obj5;
                    } else {
                        c1682860ttU = null;
                    }
                    if (c1682860ttU == null || this.LIZIZ != c1682860ttU.LIZIZ) {
                        return false;
                    }
                    return true;
                }

                @Override // X.InterfaceC1685750ty9
                public final Object LJIILJJIL(Object obj5, Function2 function2) {
                    return function2.invoke(obj5, this);
                }

                @Override // X.InterfaceC20056613dk
                public final InterfaceC1690350u5Z LJIILL(InterfaceC1689940u4u interfaceC1689940u4u, InterfaceC1673370teB interfaceC1673370teB, long j2) {
                    AbstractC1686530tzP abstractC1686530tzPLJJJJZ = interfaceC1673370teB.LJJJJZ(j2);
                    int iMax = Math.max(abstractC1686530tzPLJJJJZ.LL, interfaceC1689940u4u.LJLLJ(C1679680toM.LIZIZ(this.LIZIZ)));
                    int iMax2 = Math.max(abstractC1686530tzPLJJJJZ.LLILLJJLI, interfaceC1689940u4u.LJLLJ(C1679680toM.LIZ(this.LIZIZ)));
                    return interfaceC1689940u4u.LJLJJL(iMax, iMax2, C2097608Jq.LJ(), new AwS33S0102000_25(iMax, iMax2, abstractC1686530tzPLJJJJZ, 0));
                }
            };
        } else {
            obj4 = InterfaceC1685750ty9.LIZ;
        }
        interfaceC1680500tpg.LJJIJLIJ();
        return obj4;
    }

    public static final Object invoke$20(AFwS347S0000000_25 aFwS347S0000000_25, Object obj, Object obj2, Object obj3) {
        C1674080tfK.LIZ((C1674030tfF) obj, (InterfaceC1680500tpg) obj2, ((Number) obj3).intValue() & 14);
        return Unit.LIZ;
    }

    public static final Object invoke$21(AFwS347S0000000_25 aFwS347S0000000_25, Object obj, Object obj2, Object obj3) {
        C1674100tfM.LIZLLL((C1674030tfF) obj, (InterfaceC1680500tpg) obj2, ((Number) obj3).intValue() & 14);
        return Unit.LIZ;
    }

    public static final Object invoke$22(AFwS347S0000000_25 aFwS347S0000000_25, Object obj, Object obj2, Object obj3) {
        C1674110tfN.LIZ((C1674030tfF) obj, (InterfaceC1680500tpg) obj2, ((Number) obj3).intValue() & 14);
        return Unit.LIZ;
    }

    public static final Object invoke$23(AFwS347S0000000_25 aFwS347S0000000_25, Object obj, Object obj2, Object obj3) {
        C1674090tfL.LIZ((C1674030tfF) obj, (InterfaceC1680500tpg) obj2, ((Number) obj3).intValue() & 14);
        return Unit.LIZ;
    }

    public static final Object invoke$24(AFwS347S0000000_25 aFwS347S0000000_25, Object obj, Object obj2, Object obj3) {
        ((InterfaceC1643980ssm) obj).LJIIJ((FilterBean) obj2, true);
        return Unit.LIZ;
    }

    public static final Object invoke$25(AFwS347S0000000_25 aFwS347S0000000_25, Object obj, Object obj2, Object obj3) {
        ((InterfaceC1643980ssm) obj).LJIIJ((FilterBean) obj2, true);
        return Unit.LIZ;
    }

    public static final Object invoke$26(AFwS347S0000000_25 aFwS347S0000000_25, Object obj, Object obj2, Object obj3) {
        DiscoverSectionList discoverSectionList = (DiscoverSectionList) obj2;
        if (((C11E7) obj).cursor == -1) {
            if (discoverSectionList != null) {
                discoverSectionList.setCache(true);
            }
            return discoverSectionList;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$27(kotlin.jvm.internal.AFwS347S0000000_25 r4, java.lang.Object r5, java.lang.Object r6, java.lang.Object r7) {
        /*
            X.0ty9 r5 = (X.InterfaceC1685750ty9) r5
            X.0tpg r6 = (X.InterfaceC1680500tpg) r6
            java.lang.Number r7 = (java.lang.Number) r7
            r7.intValue()
            r0 = -2126899193(0xffffffff813a1807, float:-3.4180043E-38)
            r6.LJJIIJZLJL(r0)
            X.13DQ r0 = X.C1679830tob.LIZ
            java.lang.Object r0 = r6.LJJIL(r0)
            X.0toa r0 = (X.C1679820toa) r0
            long r1 = r0.LIZ
            X.0tyA r4 = X.InterfaceC1685750ty9.LIZ
            boolean r0 = r6.LJIJJ(r1)
            java.lang.Object r3 = r6.LJJ()
            if (r0 != 0) goto L2e
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r3 != r0) goto L37
        L2e:
            kotlin.jvm.internal.AwS39S0000100_25 r3 = new kotlin.jvm.internal.AwS39S0000100_25
            r0 = 5
            r3.<init>(r1, r0)
            r6.LJJIJIIJI(r3)
        L37:
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
            X.0ty9 r0 = X.C1680910tqL.LIZIZ(r4, r3)
            X.0ty9 r0 = r5.LIZ(r0)
            r6.LJ()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AFwS347S0000000_25.invoke$27(kotlin.jvm.internal.AFwS347S0000000_25, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$3(AFwS347S0000000_25 aFwS347S0000000_25, Object obj, Object obj2, Object obj3) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj2;
        ((Number) obj3).intValue();
        interfaceC1680500tpg.LJJIJIIJIL(-32667848);
        C1677050tk7 c1677050tk7LIZLLL = C1671550tbF.LIZLLL(150, 0, null, 6);
        interfaceC1680500tpg.LJJIJLIJ();
        return c1677050tk7LIZLLL;
    }

    public static final Object invoke$4(AFwS347S0000000_25 aFwS347S0000000_25, Object obj, Object obj2, Object obj3) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj2;
        ((Number) obj3).intValue();
        interfaceC1680500tpg.LJJIJIIJIL(-611722692);
        C1677050tk7 c1677050tk7LIZLLL = C1671550tbF.LIZLLL(150, 0, null, 6);
        interfaceC1680500tpg.LJJIJLIJ();
        return c1677050tk7LIZLLL;
    }

    public static final Object invoke$5(AFwS347S0000000_25 aFwS347S0000000_25, Object obj, Object obj2, Object obj3) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj2;
        ((Number) obj3).intValue();
        interfaceC1680500tpg.LJJIJIIJIL(-130058045);
        C1677050tk7 c1677050tk7LIZLLL = C1671550tbF.LIZLLL(150, 0, null, 6);
        interfaceC1680500tpg.LJJIJLIJ();
        return c1677050tk7LIZLLL;
    }

    public static final Object invoke$6(AFwS347S0000000_25 aFwS347S0000000_25, Object obj, Object obj2, Object obj3) {
        Object c1677050tk7;
        InterfaceC1676620tjQ interfaceC1676620tjQ = (InterfaceC1676620tjQ) obj;
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj2;
        ((Number) obj3).intValue();
        interfaceC1680500tpg.LJJIJIIJIL(-1079955085);
        EnumC1677000tk2 enumC1677000tk2 = EnumC1677000tk2.Focused;
        EnumC1677000tk2 enumC1677000tk22 = EnumC1677000tk2.UnfocusedEmpty;
        if (interfaceC1676620tjQ.LIZ(enumC1677000tk2, enumC1677000tk22)) {
            c1677050tk7 = C1671550tbF.LIZLLL(67, 0, C05Y0.LIZLLL, 2);
        } else if (!interfaceC1676620tjQ.LIZ(enumC1677000tk22, enumC1677000tk2) && !interfaceC1676620tjQ.LIZ(EnumC1677000tk2.UnfocusedNotEmpty, enumC1677000tk22)) {
            c1677050tk7 = C1671550tbF.LIZJ(0.0f, 0.0f, null, 7);
        } else {
            c1677050tk7 = new C1677050tk7(83, 67, C05Y0.LIZLLL);
        }
        interfaceC1680500tpg.LJJIJLIJ();
        return c1677050tk7;
    }

    public static final Object invoke$7(AFwS347S0000000_25 aFwS347S0000000_25, Object obj, Object obj2, Object obj3) {
        int i;
        C1675080tgw c1675080tgw = (C1675080tgw) obj;
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 14) == 0) {
            if (interfaceC1680500tpg.LJJIIJ(c1675080tgw)) {
                i = 4;
            } else {
                i = 2;
            }
            iIntValue |= i;
        }
        if ((iIntValue & 91) == 18 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            C1675020tgq.LIZIZ(c1675080tgw, null, null, interfaceC1680500tpg, iIntValue & 14, 6);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$8(AFwS347S0000000_25 aFwS347S0000000_25, Object obj, Object obj2, Object obj3) {
        int i;
        InterfaceC1675090tgx interfaceC1675090tgx = (InterfaceC1675090tgx) obj;
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 14) == 0) {
            if (interfaceC1680500tpg.LJJIIJ(interfaceC1675090tgx)) {
                i = 4;
            } else {
                i = 2;
            }
            iIntValue |= i;
        }
        if ((iIntValue & 91) == 18 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            C1678780tmu.LIZIZ(interfaceC1675090tgx, null, false, null, 0L, 0L, 0L, 0.0f, interfaceC1680500tpg, iIntValue & 14, 254);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$9(AFwS347S0000000_25 aFwS347S0000000_25, Object obj, Object obj2, Object obj3) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj2;
        ((Number) obj3).intValue();
        interfaceC1680500tpg.LJJIIJZLJL(-1483132342);
        C1685950tyT c1685950tyT = new C1685950tyT();
        c1685950tyT.LIZ = 100;
        C1686010tyZ c1686010tyZ = new C1686010tyZ(c1685950tyT);
        interfaceC1680500tpg.LJ();
        return c1686010tyZ;
    }
}
