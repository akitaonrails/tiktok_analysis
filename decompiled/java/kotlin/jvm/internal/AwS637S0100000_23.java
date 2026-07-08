package kotlin.jvm.internal;

import X.AbstractC1541140qCu;
import X.C09AY;
import X.C1018703yb;
import X.C1051630dTN;
import X.C13LE;
import X.C1484960okI;
import X.C1492320owA;
import X.C1504580pFw;
import X.C1504700pG8;
import X.C1504750pGD;
import X.C1523090pjn;
import X.C1532390pyn;
import X.C1532720pzK;
import X.C1533950q1J;
import X.C1540930qCZ;
import X.C1541070qCn;
import X.C1541080qCo;
import X.C1541180qCy;
import X.C1546510qLZ;
import X.C1548760qPC;
import X.C1549500qQO;
import X.C1549940qR6;
import X.C2382909Vj;
import X.C259800zU;
import X.EnumC1492290ow7;
import X.EnumC1541150qCv;
import X.EnumC1541200qD0;
import X.EnumC1549900qR2;
import X.InterfaceC1503290pDr;
import X.InterfaceC1541240qD4;
import X.InterfaceC1554220qY0;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkPopup;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.lynx.tasm.LynxError;
import com.ss.android.ugc.aweme.ecommerce.sparkpreload.ECSparkPreloadInfo;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.Regex;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public class AwS637S0100000_23 extends C09AY implements Function2 {
    public final int $t;
    public Object l0;

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
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this, obj, obj2);
            case 14:
                return invoke$14(this, obj, obj2);
            case 15:
                return invoke$15(this, obj, obj2);
            case 16:
                return invoke$16(this, obj, obj2);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this, obj, obj2);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this, obj, obj2);
            case 19:
                return invoke$19(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS637S0100000_23(C259800zU c259800zU, C259800zU<Function0<Function2<InterfaceC1541240qD4, EnumC1541200qD0, Unit>>> c259800zU2) {
        super(2);
        this.$t = c259800zU2;
        this.l0 = c259800zU;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS637S0100000_23(C1051630dTN c1051630dTN, int i) {
        super(2);
        this.$t = i;
        this.l0 = c1051630dTN;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS637S0100000_23(C1484960okI c1484960okI, int i) {
        super(2);
        this.$t = i;
        this.l0 = c1484960okI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS637S0100000_23(C1492320owA c1492320owA, int i) {
        super(2);
        this.$t = i;
        this.l0 = c1492320owA;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS637S0100000_23(C1504580pFw c1504580pFw, int i) {
        super(2);
        this.$t = i;
        this.l0 = c1504580pFw;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS637S0100000_23(C1504700pG8 c1504700pG8, int i) {
        super(2);
        this.$t = i;
        this.l0 = c1504700pG8;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS637S0100000_23(C1504750pGD c1504750pGD, int i) {
        super(2);
        this.$t = i;
        this.l0 = c1504750pGD;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS637S0100000_23(C1532390pyn c1532390pyn, C1532390pyn<Pair<C1540930qCZ, AbstractC1541140qCu<?>>> c1532390pyn2) {
        super(2);
        this.$t = c1532390pyn2;
        this.l0 = c1532390pyn;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS637S0100000_23(C1541070qCn c1541070qCn, C1541070qCn<Input, Output> c1541070qCn2) {
        super(2);
        this.$t = c1541070qCn2;
        this.l0 = c1541070qCn;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS637S0100000_23(C1546510qLZ c1546510qLZ, int i) {
        super(2);
        this.$t = i;
        this.l0 = c1546510qLZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS637S0100000_23(C1548760qPC c1548760qPC, int i) {
        super(2);
        this.$t = i;
        this.l0 = c1548760qPC;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS637S0100000_23(Configuration configuration, int i) {
        super(2);
        this.$t = i;
        this.l0 = configuration;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS637S0100000_23(SparkContext sparkContext, int i) {
        super(2);
        this.$t = i;
        this.l0 = sparkContext;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS637S0100000_23(CompletionBlock completionBlock, CompletionBlock<InterfaceC1503290pDr> completionBlock2) {
        super(2);
        this.$t = completionBlock2;
        this.l0 = completionBlock;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS637S0100000_23(ECSparkPreloadInfo eCSparkPreloadInfo, int i) {
        super(2);
        this.$t = i;
        this.l0 = eCSparkPreloadInfo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS637S0100000_23(View view, Bundle bundle, int i) {
        super(2);
        this.$t = i;
        this.l0 = view;
    }

    public static final Object invoke$0(AwS637S0100000_23 awS637S0100000_23, Object obj, Object obj2) {
        return ((C1051630dTN) awS637S0100000_23.l0).LJIIIIZZ.invoke(((C1532720pzK) obj).LIZ, ((C1532720pzK) obj2).LIZ);
    }

    public static final Object invoke$1(AwS637S0100000_23 awS637S0100000_23, Object obj, Object obj2) {
        ((C1484960okI) awS637S0100000_23.l0).LJIJJLI((String) obj, (Function1) obj2);
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS637S0100000_23 awS637S0100000_23, Object obj, Object obj2) {
        Number number = (Number) obj2;
        return ((C1504700pG8) awS637S0100000_23.l0).LIZLLL(number, (JSONObject) obj);
    }

    public static final Object invoke$11(AwS637S0100000_23 awS637S0100000_23, Object obj, Object obj2) {
        String str = (String) obj2;
        if (((Boolean) obj).booleanValue()) {
            ((CompletionBlock) awS637S0100000_23.l0).onSuccess((XBaseResultModel) C1549500qQO.LIZLLL(C13LE.LIZ(InterfaceC1503290pDr.class)), "");
        } else {
            C2382909Vj.LIZ((CompletionBlock) awS637S0100000_23.l0, -1, str, null, 4);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS637S0100000_23 awS637S0100000_23, Object obj, Object obj2) {
        EnumC1549900qR2 enumC1549900qR2 = EnumC1549900qR2.LOAD_START;
        C1549940qR6.LIZIZ = enumC1549900qR2;
        C1523090pjn.LIZJ((SparkContext) awS637S0100000_23.l0, enumC1549900qR2.getStatus(), 0, null, C1549940qR6.LIZJ, 124);
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS637S0100000_23 awS637S0100000_23, Object obj, Object obj2) {
        ((InterfaceC1554220qY0) obj).LJIILIIL((SparkPopup) obj2, (View) awS637S0100000_23.l0);
        return Unit.LIZ;
    }

    public static final Object invoke$14(AwS637S0100000_23 awS637S0100000_23, Object obj, Object obj2) {
        ((InterfaceC1554220qY0) obj).LJJIFFI((SparkPopup) obj2);
        return Unit.LIZ;
    }

    public static final Object invoke$15(AwS637S0100000_23 awS637S0100000_23, Object obj, Object obj2) {
        ((InterfaceC1554220qY0) obj).LJJII();
        return Unit.LIZ;
    }

    public static final Object invoke$16(AwS637S0100000_23 awS637S0100000_23, Object obj, Object obj2) {
        ((InterfaceC1554220qY0) obj).LJIIL((SparkPopup) obj2, (Configuration) awS637S0100000_23.l0);
        return Unit.LIZ;
    }

    public static final Object invoke$17(AwS637S0100000_23 awS637S0100000_23, Object obj, Object obj2) {
        return Boolean.valueOf(((InterfaceC1554220qY0) obj).LJJIII((SparkPopup) obj2, (SparkContext) awS637S0100000_23.l0));
    }

    public static final Object invoke$18(AwS637S0100000_23 awS637S0100000_23, Object obj, Object obj2) {
        boolean zLJFF;
        String str = (String) obj;
        if (C1533950q1J.LJ(((C1546510qLZ) awS637S0100000_23.l0).LJIILJJIL)) {
            zLJFF = new Regex(((C1546510qLZ) awS637S0100000_23.l0).LJIILJJIL).containsMatchIn(str);
        } else {
            zLJFF = Intrinsics.LJFF(str, obj2);
        }
        return Boolean.valueOf(zLJFF);
    }

    public static final Object invoke$19(AwS637S0100000_23 awS637S0100000_23, Object obj, Object obj2) {
        Number number = (Number) obj2;
        return ((C1504580pFw) awS637S0100000_23.l0).LIZLLL(number, (JSONObject) obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$2(kotlin.jvm.internal.AwS637S0100000_23 r5, java.lang.Object r6, java.lang.Object r7) {
        /*
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            java.lang.Number r7 = (java.lang.Number) r7
            int r3 = r7.intValue()
            java.lang.Object r2 = r5.l0
            X.0okI r2 = (X.C1484960okI) r2
            r2.getClass()
            boolean r0 = X.C299140Bo0.LIZ()
            r5 = 0
            if (r0 != 0) goto L32
            X.0okJ r0 = r2.LIZLLL()
            if (r0 == 0) goto L30
            float r0 = r0.LJ
            java.lang.Float r1 = java.lang.Float.valueOf(r0)
        L26:
            r0 = 0
            boolean r0 = kotlin.jvm.internal.Intrinsics.LIZLLL(r1, r0)
            if (r0 != 0) goto L32
        L2d:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L30:
            r1 = r5
            goto L26
        L32:
            if (r6 <= 0) goto L2d
            if (r3 <= 0) goto L2d
            float r4 = (float) r3
            float r0 = (float) r6
            float r4 = r4 / r0
            java.lang.ref.WeakReference<android.widget.FrameLayout> r0 = r2.LIZJ
            if (r0 == 0) goto L2d
            java.lang.Object r1 = r0.get()
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            if (r1 == 0) goto L2d
            X.09RD r0 = new X.09RD
            r0.<init>(r1)
            java.util.Iterator r3 = r0.iterator()
        L4e:
            r1 = r3
            X.09RE r1 = (X.C09RE) r1
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L71
            java.lang.Object r2 = r1.next()
            boolean r0 = r2 instanceof android.view.TextureView
            if (r0 == 0) goto L4e
        L5f:
            boolean r0 = r2 instanceof android.view.TextureView
            if (r0 == 0) goto L2d
            android.view.TextureView r2 = (android.view.TextureView) r2
            if (r2 == 0) goto L2d
            Y.ARunnableS7S0100001_22 r1 = new Y.ARunnableS7S0100001_22
            r0 = 1
            r1.<init>(r4, r2, r0)
            com.bytedance.bpea.transmit.hook.HandlerHook.viewPost(r2, r1)
            goto L2d
        L71:
            r2 = r5
            goto L5f
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS637S0100000_23.invoke$2(kotlin.jvm.internal.AwS637S0100000_23, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006f, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.LJFF(new kotlin.text.Regex("/$").replace(r1, ""), new kotlin.text.Regex("/$").replace(r2, "")) != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$3(kotlin.jvm.internal.AwS637S0100000_23 r6, java.lang.Object r7, java.lang.Object r8) {
        /*
            java.lang.String r4 = ""
            java.lang.String r3 = "/$"
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r5 = "spark_page"
            java.lang.String r2 = "url"
            java.lang.Object r0 = r6.l0     // Catch: java.lang.Exception -> L73
            com.ss.android.ugc.aweme.ecommerce.sparkpreload.ECSparkPreloadInfo r0 = (com.ss.android.ugc.aweme.ecommerce.sparkpreload.ECSparkPreloadInfo) r0     // Catch: java.lang.Exception -> L73
            int r1 = r0.schemaType     // Catch: java.lang.Exception -> L73
            r0 = 2
            if (r1 != r0) goto L30
            android.net.Uri r0 = com.bytedance.mt.protector.impl.UriProtector.parse(r7)     // Catch: java.lang.Exception -> L73
            java.lang.String r1 = com.bytedance.mt.protector.impl.UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(r0, r5)     // Catch: java.lang.Exception -> L73
            android.net.Uri r0 = com.bytedance.mt.protector.impl.UriProtector.parse(r8)     // Catch: java.lang.Exception -> L73
            java.lang.String r0 = com.bytedance.mt.protector.impl.UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(r0, r5)     // Catch: java.lang.Exception -> L73
            if (r1 == 0) goto L77
            if (r0 == 0) goto L77
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r1)     // Catch: java.lang.Exception -> L73
            if (r0 == 0) goto L77
            goto L71
        L30:
            android.net.Uri r0 = com.bytedance.mt.protector.impl.UriProtector.parse(r7)     // Catch: java.lang.Exception -> L73
            java.lang.String r0 = com.bytedance.mt.protector.impl.UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(r0, r2)     // Catch: java.lang.Exception -> L73
            android.net.Uri r0 = com.bytedance.mt.protector.impl.UriProtector.parse(r0)     // Catch: java.lang.Exception -> L73
            java.lang.String r1 = r0.getPath()     // Catch: java.lang.Exception -> L73
            android.net.Uri r0 = com.bytedance.mt.protector.impl.UriProtector.parse(r8)     // Catch: java.lang.Exception -> L73
            java.lang.String r0 = com.bytedance.mt.protector.impl.UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(r0, r2)     // Catch: java.lang.Exception -> L73
            android.net.Uri r0 = com.bytedance.mt.protector.impl.UriProtector.parse(r0)     // Catch: java.lang.Exception -> L73
            java.lang.String r2 = r0.getPath()     // Catch: java.lang.Exception -> L73
            if (r1 == 0) goto L77
            if (r2 == 0) goto L77
            X.0pkt r0 = X.C1523770pkt.LIZ     // Catch: java.lang.Exception -> L73
            r0.getClass()     // Catch: java.lang.Exception -> L73
            kotlin.text.Regex r0 = new kotlin.text.Regex     // Catch: java.lang.Exception -> L73
            r0.<init>(r3)     // Catch: java.lang.Exception -> L73
            java.lang.String r1 = r0.replace(r1, r4)     // Catch: java.lang.Exception -> L73
            kotlin.text.Regex r0 = new kotlin.text.Regex     // Catch: java.lang.Exception -> L73
            r0.<init>(r3)     // Catch: java.lang.Exception -> L73
            java.lang.String r0 = r0.replace(r2, r4)     // Catch: java.lang.Exception -> L73
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)     // Catch: java.lang.Exception -> L73
            if (r0 == 0) goto L77
        L71:
            r0 = 1
            goto L78
        L73:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L77:
            r0 = 0
        L78:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS637S0100000_23.invoke$3(kotlin.jvm.internal.AwS637S0100000_23, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$4(AwS637S0100000_23 awS637S0100000_23, Object obj, Object obj2) {
        String str = (String) obj2;
        ((C1548760qPC) awS637S0100000_23.l0).getClass();
        C1018703yb.LIZLLL("rd_tiktokec_pdp_lynx_failed", new AwS28S1101000_23((LynxError) obj, C1548760qPC.LIZ(str), str, 1));
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS637S0100000_23 awS637S0100000_23, Object obj, Object obj2) {
        Function2 function2 = (Function2) ((Function0) ((C259800zU) awS637S0100000_23.l0).element).invoke();
        if (function2 != null) {
            function2.invoke(obj, obj2);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static final Object invoke$6(AwS637S0100000_23 awS637S0100000_23, Object obj, Object obj2) {
        C1540930qCZ c1540930qCZ = (C1540930qCZ) obj;
        AbstractC1541140qCu abstractC1541140qCu = (AbstractC1541140qCu) obj2;
        if (abstractC1541140qCu instanceof C1541080qCo) {
            C1541080qCo c1541080qCo = (C1541080qCo) abstractC1541140qCu;
            if (!c1541080qCo.LJ()) {
                if (c1541080qCo.LIZ.LIZ) {
                    c1541080qCo.LJII(EnumC1541150qCv.EXPIRED);
                } else {
                    int i = c1541080qCo.LJIILLIIL.LIZ.get();
                    if (i >= 0 && ((i & 65280) >> 8) == 250 && ((C1541070qCn) awS637S0100000_23.l0).LJIIIIZZ.LJI((C1541080qCo<Output>) c1541080qCo)) {
                        c1541080qCo.LJIIIZ(EnumC1541150qCv.EXPIRED);
                    }
                }
            }
        } else if ((abstractC1541140qCu instanceof C1541180qCy) && !abstractC1541140qCu.LJ()) {
            ((C1541070qCn) awS637S0100000_23.l0).LJIIJJI.LIZJ(c1540930qCZ, (AbstractC1541140qCu<V>) abstractC1541140qCu, EnumC1541150qCv.EXPIRED);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS637S0100000_23 awS637S0100000_23, Object obj, Object obj2) {
        ((C1532390pyn) awS637S0100000_23.l0).LIZ(new Pair(obj, obj2));
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS637S0100000_23 awS637S0100000_23, Object obj, Object obj2) throws JSONException {
        EnumC1492290ow7 enumC1492290ow7 = (EnumC1492290ow7) obj;
        C1492320owA c1492320owA = (C1492320owA) awS637S0100000_23.l0;
        if (!c1492320owA.LJ) {
            c1492320owA.LJ = true;
            System.currentTimeMillis();
            ((C1492320owA) awS637S0100000_23.l0).getClass();
            C1492320owA c1492320owA2 = (C1492320owA) awS637S0100000_23.l0;
            c1492320owA2.getClass();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("start_time", c1492320owA2.LIZLLL);
            jSONObject.put("duration", System.currentTimeMillis() - c1492320owA2.LIZLLL);
            jSONObject.put("detect_result", enumC1492290ow7.name());
            c1492320owA2.LIZ.LIZ(c1492320owA2, enumC1492290ow7, jSONObject);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS637S0100000_23 awS637S0100000_23, Object obj, Object obj2) {
        Number number = (Number) obj2;
        return ((C1504750pGD) awS637S0100000_23.l0).LIZLLL(number, (JSONObject) obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS637S0100000_23(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, int i) {
        super(2);
        this.$t = i;
        this.l0 = viewGroup;
    }
}
