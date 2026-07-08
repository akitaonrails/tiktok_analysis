package kotlin.jvm.internal;

import X.C09AY;
import X.C1003570cDr;
import X.C1009460cNM;
import X.C1009740cNo;
import X.C1032800cz0;
import X.C1044250dHT;
import X.C1050860dS8;
import X.C1720106oR;
import X.C2097608Jq;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C339190DRl;
import X.C423810Gjb;
import X.C423870Gjh;
import X.C668320QJi;
import X.C683130Qqt;
import X.C786410Ut5;
import X.C857280Xk6;
import X.C991670buf;
import X.EnumC1005330cGh;
import X.EnumC1008920cMU;
import X.EnumC1035280d30;
import X.InterfaceC1014270cV7;
import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.commercialize.model.AnoleLogInfo;
import com.ss.android.ugc.aweme.component.gestureupcomponent.AnoleGestureContextModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.rich.reward.ui.GmtRewardAdContainer;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.profile.business.ad.ad.UserProfileADAssemV2;
import com.tts.oecverify.BdTuring;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes17.dex */
public class AwS452S0200000_16 extends C09AY implements Function2 {
    public final int $t;
    public Object l0;
    public Object l1;

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
            case 7:
                return invoke$7(this, obj, obj2);
            case 8:
                return invoke$8(this, obj, obj2);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj, obj2);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj, obj2);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj, obj2);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS452S0200000_16(C668320QJi c668320QJi, C668320QJi c668320QJi2, Function0<Unit> function0) {
        super(2);
        this.$t = function0;
        this.l0 = c668320QJi;
        this.l1 = c668320QJi2;
    }

    public static final Object invoke$0(AwS452S0200000_16 awS452S0200000_16, Object obj, Object obj2) {
        String str;
        String str2;
        float fFloatValue = ((Number) obj).floatValue();
        float fFloatValue2 = ((Number) obj2).floatValue();
        AnoleGestureContextModel.TapContext tapContext = ((AnoleGestureContextModel) awS452S0200000_16.l0).getTapContext();
        if (tapContext != null) {
            C1003570cDr c1003570cDr = (C1003570cDr) awS452S0200000_16.l1;
            InterfaceC1014270cV7 interfaceC1014270cV7 = c1003570cDr.LLILLL;
            Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair(EnumC1005330cGh.ENTER_FROM.getRName(), 99));
            String rName = EnumC1005330cGh.REFER.getRName();
            AnoleLogInfo logInfo = tapContext.getLogInfo();
            if (logInfo == null || (str = logInfo.refer) == null) {
                str = "full_screen_tap";
            }
            mapLJIIJ.put(rName, str);
            String rName2 = EnumC1005330cGh.TAG.getRName();
            AnoleLogInfo logInfo2 = tapContext.getLogInfo();
            if (logInfo2 == null || (str2 = logInfo2.tag) == null) {
                str2 = "draw_ad";
            }
            mapLJIIJ.put(rName2, str2);
            String rName3 = EnumC1005330cGh.AD_EXTRA_DATA.getRName();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(fFloatValue);
            sbLIZ.append(',');
            sbLIZ.append(fFloatValue2);
            mapLJIIJ.put(rName3, C2097608Jq.LJIIJ(new Pair("gesture_area", "full_screen_gesture"), new Pair("locationPoint", C2188811AlT.LIZIZ(sbLIZ))));
            interfaceC1014270cV7.LJIJ(new C991670buf(mapLJIIJ), c1003570cDr);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS452S0200000_16 awS452S0200000_16, Object obj, Object obj2) {
        if (((C683130Qqt) obj2).LLILLJJLI != null) {
            C339190DRl.LIZLLL((LinearLayout) awS452S0200000_16.l0);
            C339190DRl.LIZIZ((TuxTextView) awS452S0200000_16.l1);
        } else {
            C339190DRl.LIZLLL((TuxTextView) awS452S0200000_16.l1);
            C339190DRl.LIZIZ((LinearLayout) awS452S0200000_16.l0);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$10(kotlin.jvm.internal.AwS452S0200000_16 r4, java.lang.Object r5, java.lang.Object r6) {
        /*
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r3 = r5.booleanValue()
            com.ss.android.ugc.aweme.rich.reward.api.GmtRewardClaimResult r6 = (com.ss.android.ugc.aweme.rich.reward.api.GmtRewardClaimResult) r6
            java.lang.Object r2 = r4.l0
            com.ss.android.ugc.aweme.rich.reward.ui.GmtRewardAdContainer r2 = (com.ss.android.ugc.aweme.rich.reward.ui.GmtRewardAdContainer) r2
            if (r6 == 0) goto L25
            boolean r1 = r6.showReceiveAgainAlert
            r0 = 1
            if (r1 != r0) goto L25
        L13:
            r2.LLJJJJJIL = r0
            java.lang.Object r2 = r4.l1
            X.0cz0 r2 = (X.C1032800cz0) r2
            X.0cys r1 = new X.0cys
            r1.<init>(r3)
            r0 = 0
            r2.taskCompleted(r3, r0, r1)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L25:
            r0 = 0
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS452S0200000_16.invoke$10(kotlin.jvm.internal.AwS452S0200000_16, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static /* bridge */ /* synthetic */ Object invoke$11(AwS452S0200000_16 awS452S0200000_16, Object obj, Object obj2) {
        C1009460cNM c1009460cNM;
        List<?> listLJJIL;
        final boolean zBooleanValue = ((Boolean) obj).booleanValue();
        final boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        if (((C1009460cNM) awS452S0200000_16.l0).LJJIL() != null && (listLJJIL = (c1009460cNM = (C1009460cNM) awS452S0200000_16.l0).LJJIL()) != null) {
            Iterator<?> it2 = listLJJIL.iterator();
            while (true) {
                if (it2.hasNext()) {
                    Object obj3 = ((Map) it2.next()).get("component_type");
                    EnumC1008920cMU[] enumC1008920cMUArrValues = EnumC1008920cMU.values();
                    int length = enumC1008920cMUArrValues.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            EnumC1008920cMU enumC1008920cMU = enumC1008920cMUArrValues[i];
                            if (Intrinsics.LJFF(enumC1008920cMU.getType(), obj3)) {
                                if (C1009740cNo.LIZ(c1009460cNM.LIZ, enumC1008920cMU)) {
                                    break;
                                }
                            } else {
                                i++;
                            }
                        }
                    }
                } else {
                    AwemeRawAd awemeRawAd = c1009460cNM.LIZ.getAwemeRawAd();
                    if (awemeRawAd == null || awemeRawAd.getAnimationType() == -1) {
                    }
                }
            }
            final BPEAHandler bPEAHandler = new BPEAHandler(Looper.getMainLooper());
            final long jUptimeMillis = SystemClock.uptimeMillis();
            final long millis = TimeUnit.MINUTES.toMillis(5L);
            final C1009460cNM c1009460cNM2 = (C1009460cNM) awS452S0200000_16.l0;
            final Function2 function2 = (Function2) awS452S0200000_16.l1;
            C786410Ut5.LJJZZIII(bPEAHandler, new Runnable() { // from class: X.080O
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("FeedItemModuleImpl@ed3f.registerCarouselImageStayObserver$1$runnable$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("FeedItemModuleImpl@ed3f.registerCarouselImageStayObserver$1$runnable$1");
                }

                public final void LIZ() {
                    long jUptimeMillis2 = SystemClock.uptimeMillis() - jUptimeMillis;
                    try {
                        if (!c1009460cNM2.LJJIIZ) {
                            if (jUptimeMillis2 < millis) {
                                C786410Ut5.LJLIIL(150L, bPEAHandler, this);
                            }
                        } else {
                            try {
                                function2.invoke(Boolean.valueOf(zBooleanValue), Boolean.valueOf(zBooleanValue2));
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                            }
                        }
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                    }
                }
            });
        } else {
            ((Function2) awS452S0200000_16.l1).invoke(Boolean.valueOf(zBooleanValue), Boolean.valueOf(zBooleanValue2));
        }
        ((C1009460cNM) awS452S0200000_16.l0).getClass();
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$12(kotlin.jvm.internal.AwS452S0200000_16 r8, java.lang.Object r9, java.lang.Object r10) {
        /*
            r4 = r9
            X.0tpg r4 = (X.InterfaceC1680500tpg) r4
            java.lang.Number r10 = (java.lang.Number) r10
            int r0 = r10.intValue()
            r1 = r0 & 3
            r0 = 2
            if (r1 != r0) goto L1a
            boolean r0 = r4.LIZ()
            if (r0 == 0) goto L1a
            r4.LIZJ()
        L17:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L1a:
            r0 = 2131858018(0x7f119262, float:1.9349812E38)
            java.lang.String r5 = X.C0MBB.LIZIZ(r0, r4)
            r7 = 1
            r0 = -1633490746(0xffffffff9ea2e8c6, float:-1.724869E-20)
            r4.LJJIIJZLJL(r0)
            java.lang.Object r0 = r8.l0
            X.0dS8 r0 = (X.C1050860dS8) r0
            boolean r3 = r4.LJII(r0)
            java.lang.Object r0 = r8.l1
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r4.LJJIIJ(r0)
            r3 = r3 | r0
            java.lang.Object r2 = r8.l0
            X.0dS8 r2 = (X.C1050860dS8) r2
            java.lang.Object r1 = r8.l1
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r6 = r4.LJJ()
            if (r3 != 0) goto L50
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r6 != r0) goto L5a
        L50:
            kotlin.jvm.internal.AwS417S0200000_16 r6 = new kotlin.jvm.internal.AwS417S0200000_16
            r0 = 121(0x79, float:1.7E-43)
            r6.<init>(r2, r1, r0)
            r4.LJJIJIIJI(r6)
        L5a:
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            r4.LJ()
            r2 = 48
            r3 = 0
            X.C1668330tW3.LJIIIIZZ(r2, r3, r4, r5, r6, r7)
            r0 = 2131858013(0x7f11925d, float:1.9349802E38)
            java.lang.String r5 = X.C0MBB.LIZIZ(r0, r4)
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r4.LJJIIJZLJL(r0)
            java.lang.Object r0 = r8.l1
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r4.LJJIIJ(r0)
            java.lang.Object r1 = r8.l1
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r6 = r4.LJJ()
            if (r0 != 0) goto L8d
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r6 != r0) goto L97
        L8d:
            kotlin.jvm.internal.AwS560S0100000_16 r6 = new kotlin.jvm.internal.AwS560S0100000_16
            r0 = 1032(0x408, float:1.446E-42)
            r6.<init>(r1, r0)
            r4.LJJIJIIJI(r6)
        L97:
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            r4.LJ()
            r2 = 48
            r3 = 0
            X.C1668330tW3.LJIIIZ(r2, r3, r4, r5, r6, r7)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS452S0200000_16.invoke$12(kotlin.jvm.internal.AwS452S0200000_16, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$2(AwS452S0200000_16 awS452S0200000_16, Object obj, Object obj2) {
        C423810Gjb.LIZ((Context) awS452S0200000_16.l0, EnumC1035280d30.LL, (LinearLayout) awS452S0200000_16.l1, (C423870Gjh) obj2);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS452S0200000_16 awS452S0200000_16, Object obj, Object obj2) {
        C423810Gjb.LIZ((Context) awS452S0200000_16.l0, EnumC1035280d30.LLILLJJLI, (LinearLayout) awS452S0200000_16.l1, (C423870Gjh) obj2);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS452S0200000_16 awS452S0200000_16, Object obj, Object obj2) {
        C423810Gjb.LIZ((Context) awS452S0200000_16.l0, EnumC1035280d30.LLILLL, (LinearLayout) awS452S0200000_16.l1, (C423870Gjh) obj2);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS452S0200000_16 awS452S0200000_16, Object obj, Object obj2) {
        Aweme aweme = (Aweme) obj2;
        if (aweme != null) {
            ((UserProfileADAssemV2) awS452S0200000_16.l0).LLJJ = AwemeExtKt.isAdTraffic(aweme);
            if (((UserProfileADAssemV2) awS452S0200000_16.l0).Tp()) {
                if (!aweme.isAd() && !AwemeExtKt.isAdTraffic(aweme) && aweme.getAwemeRawAd() == null) {
                    int i = C2187451AjH.LIZ;
                    C1720106oR.LJI("test_log", "not ad skip logic");
                } else {
                    UserProfileADAssemV2 userProfileADAssemV2 = (UserProfileADAssemV2) awS452S0200000_16.l0;
                    if (!userProfileADAssemV2.LLJJJJ) {
                        userProfileADAssemV2.No((View) awS452S0200000_16.l1);
                    }
                    ((UserProfileADAssemV2) awS452S0200000_16.l0).fq((View) awS452S0200000_16.l1, aweme);
                }
            } else {
                ((UserProfileADAssemV2) awS452S0200000_16.l0).fq((View) awS452S0200000_16.l1, aweme);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0231 A[PHI: r5
      0x0231: PHI (r5v5 java.lang.String) = (r5v1 java.lang.String), (r5v6 java.lang.String) binds: [B:84:0x0170, B:82:0x016a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x016c A[PHI: r5
      0x016c: PHI (r5v1 java.lang.String) = (r5v0 java.lang.String), (r5v6 java.lang.String) binds: [B:80:0x0166, B:82:0x016a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$6(kotlin.jvm.internal.AwS452S0200000_16 r13, java.lang.Object r14, java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 748
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS452S0200000_16.invoke$6(kotlin.jvm.internal.AwS452S0200000_16, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$7(kotlin.jvm.internal.AwS452S0200000_16 r13, java.lang.Object r14, java.lang.Object r15) {
        /*
            r5 = r14
            X.0tpg r5 = (X.InterfaceC1680500tpg) r5
            java.lang.Number r15 = (java.lang.Number) r15
            int r0 = r15.intValue()
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
            java.lang.Object r0 = r13.l0
            X.0dHT r0 = (X.C1044250dHT) r0
            com.ss.android.ugc.aweme.feed.model.ad.AdExternalGuideDialogConfig r0 = r0.LJFF
            java.lang.String r6 = r0.getConfirmText()
            java.lang.String r12 = ""
            if (r6 != 0) goto L29
            r6 = r12
        L29:
            r8 = 1
            r2 = -1633490746(0xffffffff9ea2e8c6, float:-1.724869E-20)
            r5.LJJIIJZLJL(r2)
            java.lang.Object r0 = r13.l0
            X.0dHT r0 = (X.C1044250dHT) r0
            boolean r4 = r5.LJII(r0)
            java.lang.Object r0 = r13.l1
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r5.LJJIIJ(r0)
            r4 = r4 | r0
            java.lang.Object r3 = r13.l0
            X.0dHT r3 = (X.C1044250dHT) r3
            java.lang.Object r1 = r13.l1
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r7 = r5.LJJ()
            if (r4 != 0) goto L58
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r7 != r0) goto L62
        L58:
            kotlin.jvm.internal.AwS417S0200000_16 r7 = new kotlin.jvm.internal.AwS417S0200000_16
            r0 = 62
            r7.<init>(r3, r1, r0)
            r5.LJJIJIIJI(r7)
        L62:
            kotlin.jvm.functions.Function0 r7 = (kotlin.jvm.functions.Function0) r7
            r5.LJ()
            r3 = 48
            r4 = 0
            X.C1668330tW3.LJIIIIZZ(r3, r4, r5, r6, r7, r8)
            java.lang.Object r0 = r13.l0
            X.0dHT r0 = (X.C1044250dHT) r0
            com.ss.android.ugc.aweme.feed.model.ad.AdExternalGuideDialogConfig r0 = r0.LJFF
            java.lang.String r0 = r0.getCancelText()
            if (r0 == 0) goto L7a
            r12 = r0
        L7a:
            r5.LJJIIJZLJL(r2)
            java.lang.Object r0 = r13.l0
            X.0dHT r0 = (X.C1044250dHT) r0
            boolean r3 = r5.LJII(r0)
            java.lang.Object r0 = r13.l1
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r5.LJJIIJ(r0)
            r3 = r3 | r0
            java.lang.Object r2 = r13.l0
            X.0dHT r2 = (X.C1044250dHT) r2
            java.lang.Object r1 = r13.l1
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r13 = r5.LJJ()
            if (r3 != 0) goto La5
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r13 != r0) goto Laf
        La5:
            kotlin.jvm.internal.AwS417S0200000_16 r13 = new kotlin.jvm.internal.AwS417S0200000_16
            r0 = 63
            r13.<init>(r2, r1, r0)
            r5.LJJIJIIJI(r13)
        Laf:
            kotlin.jvm.functions.Function0 r13 = (kotlin.jvm.functions.Function0) r13
            r5.LJ()
            r9 = 48
            r10 = 0
            r11 = r5
            r14 = r8
            X.C1668330tW3.LJIIIZ(r9, r10, r11, r12, r13, r14)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS452S0200000_16.invoke$7(kotlin.jvm.internal.AwS452S0200000_16, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$8(kotlin.jvm.internal.AwS452S0200000_16 r8, java.lang.Object r9, java.lang.Object r10) {
        /*
            r4 = r9
            X.0tpg r4 = (X.InterfaceC1680500tpg) r4
            java.lang.Number r10 = (java.lang.Number) r10
            int r0 = r10.intValue()
            r1 = r0 & 3
            r0 = 2
            if (r1 != r0) goto L1a
            boolean r0 = r4.LIZ()
            if (r0 == 0) goto L1a
            r4.LIZJ()
        L17:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L1a:
            r0 = 2131847713(0x7f116a21, float:1.9328911E38)
            java.lang.String r5 = X.C0MBB.LIZIZ(r0, r4)
            r7 = 1
            r0 = -1633490746(0xffffffff9ea2e8c6, float:-1.724869E-20)
            r4.LJJIIJZLJL(r0)
            java.lang.Object r0 = r8.l0
            X.0Xk6 r0 = (X.C857280Xk6) r0
            boolean r3 = r4.LJII(r0)
            java.lang.Object r0 = r8.l1
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r4.LJJIIJ(r0)
            r3 = r3 | r0
            java.lang.Object r2 = r8.l0
            X.0Xk6 r2 = (X.C857280Xk6) r2
            java.lang.Object r1 = r8.l1
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r6 = r4.LJJ()
            if (r3 != 0) goto L50
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r6 != r0) goto L5a
        L50:
            kotlin.jvm.internal.AwS413S0200000_12 r6 = new kotlin.jvm.internal.AwS413S0200000_12
            r0 = 38
            r6.<init>(r2, r1, r0)
            r4.LJJIJIIJI(r6)
        L5a:
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            r4.LJ()
            r2 = 48
            r3 = 0
            X.C1668330tW3.LJIIIIZZ(r2, r3, r4, r5, r6, r7)
            r0 = 2131833452(0x7f11326c, float:1.9299986E38)
            java.lang.String r5 = X.C0MBB.LIZIZ(r0, r4)
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r4.LJJIIJZLJL(r0)
            java.lang.Object r0 = r8.l1
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r4.LJJIIJ(r0)
            java.lang.Object r1 = r8.l1
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r6 = r4.LJJ()
            if (r0 != 0) goto L8d
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r6 != r0) goto L97
        L8d:
            kotlin.jvm.internal.AwS560S0100000_16 r6 = new kotlin.jvm.internal.AwS560S0100000_16
            r0 = 732(0x2dc, float:1.026E-42)
            r6.<init>(r1, r0)
            r4.LJJIJIIJI(r6)
        L97:
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            r4.LJ()
            r2 = 48
            r3 = 0
            X.C1668330tW3.LJIIIZ(r2, r3, r4, r5, r6, r7)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS452S0200000_16.invoke$8(kotlin.jvm.internal.AwS452S0200000_16, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$9(kotlin.jvm.internal.AwS452S0200000_16 r8, java.lang.Object r9, java.lang.Object r10) {
        /*
            r4 = r9
            X.0tpg r4 = (X.InterfaceC1680500tpg) r4
            java.lang.Number r10 = (java.lang.Number) r10
            int r0 = r10.intValue()
            r1 = r0 & 3
            r0 = 2
            if (r1 != r0) goto L1a
            boolean r0 = r4.LIZ()
            if (r0 == 0) goto L1a
            r4.LIZJ()
        L17:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L1a:
            r0 = 2131847137(0x7f1167e1, float:1.9327743E38)
            java.lang.String r5 = X.C0MBB.LIZIZ(r0, r4)
            r7 = 1
            r0 = -1633490746(0xffffffff9ea2e8c6, float:-1.724869E-20)
            r4.LJJIIJZLJL(r0)
            java.lang.Object r0 = r8.l0
            X.0QJi r0 = (X.C668320QJi) r0
            boolean r3 = r4.LJII(r0)
            java.lang.Object r0 = r8.l1
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r4.LJJIIJ(r0)
            r3 = r3 | r0
            java.lang.Object r2 = r8.l0
            X.0QJi r2 = (X.C668320QJi) r2
            java.lang.Object r1 = r8.l1
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r6 = r4.LJJ()
            if (r3 != 0) goto L50
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r6 != r0) goto L5a
        L50:
            kotlin.jvm.internal.AwS411S0200000_10 r6 = new kotlin.jvm.internal.AwS411S0200000_10
            r0 = 81
            r6.<init>(r2, r1, r0)
            r4.LJJIJIIJI(r6)
        L5a:
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            r4.LJ()
            r2 = 48
            r3 = 0
            X.C1668330tW3.LJIIIIZZ(r2, r3, r4, r5, r6, r7)
            r0 = 2131828338(0x7f111e72, float:1.9289614E38)
            java.lang.String r5 = X.C0MBB.LIZIZ(r0, r4)
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r4.LJJIIJZLJL(r0)
            java.lang.Object r0 = r8.l1
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r4.LJJIIJ(r0)
            java.lang.Object r1 = r8.l1
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r6 = r4.LJJ()
            if (r0 != 0) goto L8d
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r6 != r0) goto L97
        L8d:
            kotlin.jvm.internal.AwS554S0100000_10 r6 = new kotlin.jvm.internal.AwS554S0100000_10
            r0 = 1054(0x41e, float:1.477E-42)
            r6.<init>(r1, r0)
            r4.LJJIJIIJI(r6)
        L97:
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            r4.LJ()
            r2 = 48
            r3 = 0
            X.C1668330tW3.LJIIIZ(r2, r3, r4, r5, r6, r7)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS452S0200000_16.invoke$9(kotlin.jvm.internal.AwS452S0200000_16, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS452S0200000_16(C857280Xk6 c857280Xk6, C857280Xk6 c857280Xk62, Function0<Unit> function0) {
        super(2);
        this.$t = function0;
        this.l0 = c857280Xk6;
        this.l1 = c857280Xk62;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS452S0200000_16(C1009460cNM c1009460cNM, AwS81S0100100_16 awS81S0100100_16, int i) {
        super(2);
        this.$t = i;
        this.l0 = c1009460cNM;
        this.l1 = awS81S0100100_16;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS452S0200000_16(C1044250dHT c1044250dHT, C1044250dHT c1044250dHT2, Function0<Unit> function0) {
        super(2);
        this.$t = function0;
        this.l0 = c1044250dHT;
        this.l1 = c1044250dHT2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS452S0200000_16(C1050860dS8 c1050860dS8, C1050860dS8 c1050860dS82, Function0<Unit> function0) {
        super(2);
        this.$t = function0;
        this.l0 = c1050860dS8;
        this.l1 = c1050860dS82;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS452S0200000_16(Context context, LinearLayout linearLayout, int i) {
        super(2);
        this.$t = i;
        this.l0 = context;
        this.l1 = linearLayout;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS452S0200000_16(LinearLayout linearLayout, TuxTextView tuxTextView, int i) {
        super(2);
        this.$t = i;
        this.l0 = linearLayout;
        this.l1 = tuxTextView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS452S0200000_16(AnoleGestureContextModel anoleGestureContextModel, C1003570cDr c1003570cDr, int i) {
        super(2);
        this.$t = i;
        this.l0 = anoleGestureContextModel;
        this.l1 = c1003570cDr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS452S0200000_16(GmtRewardAdContainer gmtRewardAdContainer, C1032800cz0 c1032800cz0, int i) {
        super(2);
        this.$t = i;
        this.l0 = gmtRewardAdContainer;
        this.l1 = c1032800cz0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS452S0200000_16(UserProfileADAssemV2 userProfileADAssemV2, View view, int i) {
        super(2);
        this.$t = i;
        this.l0 = userProfileADAssemV2;
        this.l1 = view;
    }
}
