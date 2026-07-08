package kotlin.jvm.internal;

import X.AbstractC1051250dSl;
import X.AbstractC1063090dlr;
import X.C09AY;
import X.C1014730cVr;
import X.C1014740cVs;
import X.C1024900cmG;
import X.C1028380crs;
import X.C1029710cu1;
import X.C1029750cu5;
import X.C1029760cu6;
import X.C1039850dAN;
import X.C1040740dBo;
import X.C1054420dXs;
import X.C1063050dln;
import X.C1063100dls;
import X.C1066400drC;
import X.C19724912Fj;
import X.C2188811AlT;
import X.C2429209fW;
import X.C737910Sx3;
import X.C786410Ut5;
import X.EnumC1039670dA5;
import X.EnumC1051280dSo;
import X.InterfaceC1036110d4L;
import X.InterfaceC1051160dSc;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.GameLiveBottomBarAssemV2;
import com.tts.oecverify.BdTuring;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes17.dex */
public class AwS165S1100000_16 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this);
            case 14:
                return invoke$14(this);
            case 15:
                return invoke$15(this);
            case 16:
                return invoke$16(this);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this);
            case 19:
                return invoke$19(this);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return invoke$20(this);
            case 21:
                return invoke$21(this);
            case 22:
                return invoke$22(this);
            case 23:
                return invoke$23(this);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return invoke$24(this);
            case 25:
                return invoke$25(this);
            case 26:
                return invoke$26(this);
            case 27:
                return invoke$27(this);
            case 28:
                return invoke$28(this);
            case 29:
                return invoke$29(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS165S1100000_16 awS165S1100000_16) {
        InterfaceC1036110d4L interfaceC1036110d4L = (InterfaceC1036110d4L) awS165S1100000_16.l1;
        if (interfaceC1036110d4L != null) {
            interfaceC1036110d4L.LJJII(awS165S1100000_16.s0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS165S1100000_16 awS165S1100000_16) {
        InterfaceC1036110d4L interfaceC1036110d4L = (InterfaceC1036110d4L) awS165S1100000_16.l1;
        if (interfaceC1036110d4L != null) {
            interfaceC1036110d4L.LJJII(awS165S1100000_16.s0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS165S1100000_16 awS165S1100000_16) {
        boolean z;
        boolean z2;
        EnumC1039670dA5 enumC1039670dA5 = EnumC1039670dA5.PRELOAD_SUCCESS;
        String scene = ((AbstractC1051250dSl) awS165S1100000_16.l1).getScene();
        String str = awS165S1100000_16.s0;
        AbstractC1051250dSl abstractC1051250dSl = (AbstractC1051250dSl) awS165S1100000_16.l1;
        C1028380crs c1028380crs = abstractC1051250dSl.hybridContainerOption;
        boolean z3 = true;
        if (abstractC1051250dSl.iAdHybridLoadStatus == null) {
            z = true;
        } else {
            z = false;
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        if (((AbstractC1051250dSl) awS165S1100000_16.l1).sparkMixture == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        Boolean boolValueOf2 = Boolean.valueOf(z2);
        InterfaceC1051160dSc interfaceC1051160dSc = ((AbstractC1051250dSl) awS165S1100000_16.l1).sparkMixture;
        if (interfaceC1051160dSc != null && interfaceC1051160dSc.getView() != null) {
            z3 = false;
        }
        C1029750cu5.LIZ(enumC1039670dA5, scene, str, c1028380crs, new C1029760cu6(null, boolValueOf, boolValueOf2, Boolean.valueOf(z3)));
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS165S1100000_16 awS165S1100000_16) {
        ((AbstractC1051250dSl) awS165S1100000_16.l1).renderState = EnumC1051280dSo.LL;
        ((AbstractC1051250dSl) awS165S1100000_16.l1).releaseCacheWithKey(awS165S1100000_16.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS165S1100000_16 awS165S1100000_16) {
        C1029750cu5.LIZ(EnumC1039670dA5.PRELOAD_VIEW, ((AbstractC1051250dSl) awS165S1100000_16.l1).getScene(), awS165S1100000_16.s0, ((AbstractC1051250dSl) awS165S1100000_16.l1).hybridContainerOption, null);
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS165S1100000_16 awS165S1100000_16) {
        boolean z;
        boolean z2;
        EnumC1039670dA5 enumC1039670dA5 = EnumC1039670dA5.PRELOAD_SUCCESS;
        String scene = ((AbstractC1051250dSl) awS165S1100000_16.l1).getScene();
        String str = awS165S1100000_16.s0;
        AbstractC1051250dSl abstractC1051250dSl = (AbstractC1051250dSl) awS165S1100000_16.l1;
        C1028380crs c1028380crs = abstractC1051250dSl.hybridContainerOption;
        boolean z3 = true;
        if (abstractC1051250dSl.iAdHybridLoadStatus == null) {
            z = true;
        } else {
            z = false;
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        if (((AbstractC1051250dSl) awS165S1100000_16.l1).sparkMixture == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        Boolean boolValueOf2 = Boolean.valueOf(z2);
        InterfaceC1051160dSc interfaceC1051160dSc = ((AbstractC1051250dSl) awS165S1100000_16.l1).sparkMixture;
        if (interfaceC1051160dSc != null && interfaceC1051160dSc.getView() != null) {
            z3 = false;
        }
        C1029750cu5.LIZ(enumC1039670dA5, scene, str, c1028380crs, new C1029760cu6(null, boolValueOf, boolValueOf2, Boolean.valueOf(z3)));
        return Unit.LIZ;
    }

    public static final Object invoke$14(AwS165S1100000_16 awS165S1100000_16) {
        boolean z;
        boolean z2;
        EnumC1039670dA5 enumC1039670dA5 = EnumC1039670dA5.LOAD_URL;
        String scene = ((AbstractC1051250dSl) awS165S1100000_16.l1).getScene();
        String str = awS165S1100000_16.s0;
        AbstractC1051250dSl abstractC1051250dSl = (AbstractC1051250dSl) awS165S1100000_16.l1;
        C1028380crs c1028380crs = abstractC1051250dSl.hybridContainerOption;
        boolean z3 = true;
        if (abstractC1051250dSl.iAdHybridLoadStatus == null) {
            z = true;
        } else {
            z = false;
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        if (((AbstractC1051250dSl) awS165S1100000_16.l1).sparkMixture == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        Boolean boolValueOf2 = Boolean.valueOf(z2);
        InterfaceC1051160dSc interfaceC1051160dSc = ((AbstractC1051250dSl) awS165S1100000_16.l1).sparkMixture;
        if (interfaceC1051160dSc != null && interfaceC1051160dSc.getView() != null) {
            z3 = false;
        }
        C1029750cu5.LIZ(enumC1039670dA5, scene, str, c1028380crs, new C1029760cu6(null, boolValueOf, boolValueOf2, Boolean.valueOf(z3)));
        return Unit.LIZ;
    }

    public static final Object invoke$15(AwS165S1100000_16 awS165S1100000_16) {
        boolean z;
        boolean z2;
        EnumC1039670dA5 enumC1039670dA5 = EnumC1039670dA5.LOAD_FAILED;
        String scene = ((AbstractC1051250dSl) awS165S1100000_16.l1).getScene();
        String str = awS165S1100000_16.s0;
        AbstractC1051250dSl abstractC1051250dSl = (AbstractC1051250dSl) awS165S1100000_16.l1;
        C1028380crs c1028380crs = abstractC1051250dSl.hybridContainerOption;
        Boolean boolValueOf = Boolean.valueOf(abstractC1051250dSl.isLoadFailed);
        boolean z3 = true;
        if (((AbstractC1051250dSl) awS165S1100000_16.l1).iAdHybridLoadStatus == null) {
            z = true;
        } else {
            z = false;
        }
        Boolean boolValueOf2 = Boolean.valueOf(z);
        if (((AbstractC1051250dSl) awS165S1100000_16.l1).sparkMixture == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        Boolean boolValueOf3 = Boolean.valueOf(z2);
        InterfaceC1051160dSc interfaceC1051160dSc = ((AbstractC1051250dSl) awS165S1100000_16.l1).sparkMixture;
        if (interfaceC1051160dSc != null && interfaceC1051160dSc.getView() != null) {
            z3 = false;
        }
        C1029750cu5.LIZ(enumC1039670dA5, scene, str, c1028380crs, new C1029760cu6(boolValueOf, boolValueOf2, boolValueOf3, Boolean.valueOf(z3)));
        return Unit.LIZ;
    }

    public static final Object invoke$16(AwS165S1100000_16 awS165S1100000_16) {
        C1029750cu5.LIZ(EnumC1039670dA5.LOAD_START, ((AbstractC1051250dSl) awS165S1100000_16.l1).getScene(), awS165S1100000_16.s0, ((AbstractC1051250dSl) awS165S1100000_16.l1).hybridContainerOption, null);
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004a A[PHI: r0 r4
      0x004a: PHI (r0v11 X.0cu4) = (r0v4 X.0cu4), (r0v12 X.0cu4) binds: [B:12:0x001a, B:10:0x0016] A[DONT_GENERATE, DONT_INLINE]
      0x004a: PHI (r4v2 java.lang.String) = (r4v0 java.lang.String), (r4v3 java.lang.String) binds: [B:12:0x001a, B:10:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$17(kotlin.jvm.internal.AwS165S1100000_16 r9) {
        /*
            java.lang.Object r0 = r9.l1
            X.0cu1 r0 = (X.C1029710cu1) r0
            X.0crs r8 = r0.LIZ
            com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader r0 = r0.LIZIZ
            if (r0 != 0) goto L51
            r7 = 1
        Lb:
            java.lang.String r6 = r9.s0
            r5 = 0
            if (r8 == 0) goto L4f
            X.0cu4 r0 = r8.LIZLLL
            if (r0 == 0) goto L18
            java.lang.String r4 = r0.LIZ
            if (r4 != 0) goto L4a
        L18:
            java.lang.String r4 = ""
            if (r0 != 0) goto L4a
            r3 = r5
            r2 = r5
        L1e:
            java.lang.String r1 = "anole_ad"
            java.lang.String r0 = "anole_spark_callback"
            X.0ciu r2 = X.C2184171Adz.LJ(r1, r0, r4, r3, r2)
            if (r8 == 0) goto L2a
            java.lang.String r5 = r8.LIZ
        L2a:
            java.lang.String r0 = "component_type"
            r2.LIZIZ(r5, r0)
            java.lang.String r1 = "type"
            X.0dA5 r0 = X.EnumC1039670dA5.CONTAINER_INSTANCE
            r2.LIZIZ(r0, r1)
            java.lang.String r1 = "is_container_instance_null"
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            r2.LIZIZ(r0, r1)
            java.lang.String r0 = "extra_msg"
            r2.LIZIZ(r6, r0)
            r2.LJII()
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L4a:
            java.lang.String r3 = r0.LIZIZ
            java.lang.String r2 = r0.LIZJ
            goto L1e
        L4f:
            r0 = r5
            goto L18
        L51:
            r7 = 0
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS165S1100000_16.invoke$17(kotlin.jvm.internal.AwS165S1100000_16):java.lang.Object");
    }

    public static final Object invoke$18(AwS165S1100000_16 awS165S1100000_16) {
        ((Function1) awS165S1100000_16.l1).invoke(awS165S1100000_16.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$19(AwS165S1100000_16 awS165S1100000_16) {
        Activity activityLIZIZ;
        boolean zLJIIJ;
        Context context = (Context) awS165S1100000_16.l1;
        if (context != null) {
            activityLIZIZ = C737910Sx3.LIZIZ(context);
        } else {
            activityLIZIZ = null;
        }
        if (activityLIZIZ != null) {
            zLJIIJ = C19724912Fj.LIZLLL().LJIIIZ(C737910Sx3.LIZIZ((Context) awS165S1100000_16.l1), awS165S1100000_16.s0, C2429209fW.LIZ().appendDataFlowId(new Bundle(), "402685958"), null);
        } else {
            zLJIIJ = C19724912Fj.LIZLLL().LJIIJ(C2429209fW.LIZ().appendDataFlowId(new Bundle(), "402685958"), awS165S1100000_16.s0);
        }
        return Boolean.valueOf(zLJIIJ);
    }

    public static final Object invoke$2(AwS165S1100000_16 awS165S1100000_16) {
        Uri uri;
        Context context = (Context) awS165S1100000_16.l1;
        String str = awS165S1100000_16.s0;
        if (str != null) {
            uri = UriProtector.parse(str);
        } else {
            uri = null;
        }
        C1024900cmG.LJ(context, uri);
        return Unit.LIZ;
    }

    public static final Object invoke$20(AwS165S1100000_16 awS165S1100000_16) {
        Activity activityLIZIZ;
        boolean zLJIIJ;
        Context context = (Context) awS165S1100000_16.l1;
        if (context != null) {
            activityLIZIZ = C737910Sx3.LIZIZ(context);
        } else {
            activityLIZIZ = null;
        }
        if (activityLIZIZ != null) {
            zLJIIJ = C19724912Fj.LIZLLL().LJIIIZ(C737910Sx3.LIZIZ((Context) awS165S1100000_16.l1), awS165S1100000_16.s0, C2429209fW.LIZ().appendDataFlowId(new Bundle(), "402685958"), null);
        } else {
            zLJIIJ = C19724912Fj.LIZLLL().LJIIJ(C2429209fW.LIZ().appendDataFlowId(new Bundle(), "402685958"), awS165S1100000_16.s0);
        }
        return Boolean.valueOf(zLJIIJ);
    }

    public static final Object invoke$21(AwS165S1100000_16 awS165S1100000_16) {
        InterfaceC1036110d4L interfaceC1036110d4L = (InterfaceC1036110d4L) awS165S1100000_16.l1;
        if (interfaceC1036110d4L != null) {
            interfaceC1036110d4L.LJJII(awS165S1100000_16.s0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$22(AwS165S1100000_16 awS165S1100000_16) {
        InterfaceC1036110d4L interfaceC1036110d4L = (InterfaceC1036110d4L) awS165S1100000_16.l1;
        if (interfaceC1036110d4L != null) {
            interfaceC1036110d4L.LJJII(awS165S1100000_16.s0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$23(AwS165S1100000_16 awS165S1100000_16) {
        AbstractC1063090dlr abstractC1063090dlr = C1063100dls.LIZIZ;
        if (!abstractC1063090dlr.LIZLLL && Intrinsics.LJFF(awS165S1100000_16.s0, abstractC1063090dlr.LIZ)) {
            ((C1063050dln) awS165S1100000_16.l1).LIZ();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$24(AwS165S1100000_16 awS165S1100000_16) {
        ((C1066400drC) awS165S1100000_16.l1).LJJLIIIJJI(awS165S1100000_16.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$25(AwS165S1100000_16 awS165S1100000_16) {
        Activity activityLIZIZ;
        boolean zLJIIJ;
        Context context = (Context) awS165S1100000_16.l1;
        if (context != null) {
            activityLIZIZ = C737910Sx3.LIZIZ(context);
        } else {
            activityLIZIZ = null;
        }
        if (activityLIZIZ != null) {
            zLJIIJ = C19724912Fj.LIZLLL().LJIIIZ(C737910Sx3.LIZIZ((Context) awS165S1100000_16.l1), awS165S1100000_16.s0, C2429209fW.LIZ().appendDataFlowId(new Bundle(), "402685958"), null);
        } else {
            zLJIIJ = C19724912Fj.LIZLLL().LJIIJ(C2429209fW.LIZ().appendDataFlowId(new Bundle(), "402685958"), awS165S1100000_16.s0);
        }
        return Boolean.valueOf(zLJIIJ);
    }

    public static final Object invoke$26(AwS165S1100000_16 awS165S1100000_16) {
        C1014730cVr c1014730cVr = (C1014730cVr) awS165S1100000_16.l1;
        C1014740cVs.LIZ(false, awS165S1100000_16.s0, c1014730cVr.LL, c1014730cVr.LLILLJJLI);
        return Unit.LIZ;
    }

    public static final Object invoke$27(AwS165S1100000_16 awS165S1100000_16) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("enterWatchLiveWithHeroId have hero_id, related_live_tag:");
        sbLIZ.append(awS165S1100000_16.s0);
        sbLIZ.append(", ");
        sbLIZ.append((GameLiveBottomBarAssemV2) awS165S1100000_16.l1);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$28(AwS165S1100000_16 awS165S1100000_16) {
        ((Function1) awS165S1100000_16.l1).invoke(awS165S1100000_16.s0);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$29(AwS165S1100000_16 awS165S1100000_16) {
        String str = awS165S1100000_16.s0;
        if (str != null) {
            C786410Ut5.ue(((C1039850dAN) awS165S1100000_16.l1).LIZ, str);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS165S1100000_16 awS165S1100000_16) {
        InterfaceC1036110d4L interfaceC1036110d4L = (InterfaceC1036110d4L) awS165S1100000_16.l1;
        if (interfaceC1036110d4L != null) {
            interfaceC1036110d4L.LJJII(awS165S1100000_16.s0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS165S1100000_16 awS165S1100000_16) {
        Uri uri;
        Context context = (Context) awS165S1100000_16.l1;
        String str = awS165S1100000_16.s0;
        if (str != null) {
            uri = UriProtector.parse(str);
        } else {
            uri = null;
        }
        C1024900cmG.LJI(context, uri);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS165S1100000_16 awS165S1100000_16) {
        InterfaceC1036110d4L interfaceC1036110d4L = (InterfaceC1036110d4L) awS165S1100000_16.l1;
        if (interfaceC1036110d4L != null) {
            interfaceC1036110d4L.LJJII(awS165S1100000_16.s0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS165S1100000_16 awS165S1100000_16) {
        InterfaceC1036110d4L interfaceC1036110d4L = (InterfaceC1036110d4L) awS165S1100000_16.l1;
        if (interfaceC1036110d4L != null) {
            interfaceC1036110d4L.LJJII(awS165S1100000_16.s0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS165S1100000_16 awS165S1100000_16) {
        Activity activityLIZIZ;
        boolean zLJIIJ;
        Context context = (Context) awS165S1100000_16.l1;
        if (context != null) {
            activityLIZIZ = C737910Sx3.LIZIZ(context);
        } else {
            activityLIZIZ = null;
        }
        if (activityLIZIZ != null) {
            zLJIIJ = C19724912Fj.LIZLLL().LJIIIZ(C737910Sx3.LIZIZ((Context) awS165S1100000_16.l1), awS165S1100000_16.s0, C2429209fW.LIZ().appendDataFlowId(new Bundle(), "402685958"), null);
        } else {
            zLJIIJ = C19724912Fj.LIZLLL().LJIIJ(C2429209fW.LIZ().appendDataFlowId(new Bundle(), "402685958"), awS165S1100000_16.s0);
        }
        return Boolean.valueOf(zLJIIJ);
    }

    public static final Object invoke$8(AwS165S1100000_16 awS165S1100000_16) {
        ((C1054420dXs) awS165S1100000_16.l1).LIZLLL(awS165S1100000_16.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS165S1100000_16 awS165S1100000_16) {
        ((C1054420dXs) awS165S1100000_16.l1).LIZLLL(awS165S1100000_16.s0);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS165S1100000_16(C1014730cVr c1014730cVr, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c1014730cVr;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS165S1100000_16(C1029710cu1 c1029710cu1, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c1029710cu1;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS165S1100000_16(InterfaceC1036110d4L interfaceC1036110d4L, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = interfaceC1036110d4L;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS165S1100000_16(C1040740dBo c1040740dBo, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c1040740dBo;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS165S1100000_16(AbstractC1051250dSl abstractC1051250dSl, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = abstractC1051250dSl;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS165S1100000_16(C1054420dXs c1054420dXs, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c1054420dXs;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS165S1100000_16(C1066400drC c1066400drC, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c1066400drC;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS165S1100000_16(Context context, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = context;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS165S1100000_16(String str, C1039850dAN c1039850dAN, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = c1039850dAN;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS165S1100000_16(String str, C1063050dln c1063050dln, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = c1063050dln;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS165S1100000_16(String str, GameLiveBottomBarAssemV2 gameLiveBottomBarAssemV2, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = gameLiveBottomBarAssemV2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS165S1100000_16(String str, Function1 function1, int i) {
        super(0);
        this.$t = i;
        this.l1 = function1;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS165S1100000_16(String str, AwS382S0200000_16 awS382S0200000_16, int i) {
        super(0);
        this.$t = i;
        this.l1 = awS382S0200000_16;
        this.s0 = str;
    }
}
