package kotlin.jvm.internal;

import X.C09AY;
import X.C0L2O;
import X.C1341920l1a;
import X.C1372620lp6;
import X.C1537900q7g;
import X.C1537910q7h;
import X.C1541950qED;
import X.C2188811AlT;
import X.C2211941Bhg;
import X.C2213981Bky;
import X.C786410Ut5;
import X.InterfaceC1531560pxS;
import X.InterfaceC1631620sYq;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import android.app.Activity;
import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.hybrid.spark.SparkContext;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.commentv2.commentlist.powercell.PollCell;
import com.ss.android.ugc.aweme.commercialize.ba.impl.service.BAAnchorServiceImpl;
import com.ss.android.ugc.aweme.share.improve.pkg.ProductSharePackage;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import java.net.URLEncoder;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes17.dex */
public class AwS481S0200000_16 extends C09AY implements InterfaceC1631620sYq {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC1631620sYq
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
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
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS481S0200000_16(C1372620lp6 c1372620lp6, Activity activity, int i) {
        super(3);
        this.$t = i;
        this.l0 = c1372620lp6;
        this.l1 = activity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS481S0200000_16(PollCell pollCell, C1341920l1a c1341920l1a, int i) {
        super(3);
        this.$t = i;
        this.l0 = pollCell;
        this.l1 = c1341920l1a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS481S0200000_16(BAAnchorServiceImpl bAAnchorServiceImpl, Context context, int i) {
        super(3);
        this.$t = i;
        this.l0 = bAAnchorServiceImpl;
        this.l1 = context;
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AwS481S0200000_16 awS481S0200000_16, Object obj, Object obj2, Object obj3) {
        InterfaceC1531560pxS interfaceC1531560pxS;
        C1537910q7h c1537910q7h;
        ((Number) obj).intValue();
        ((Boolean) obj2).booleanValue();
        int iIntValue = ((Number) obj3).intValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(ProductSharePackage.SHARE_PREVIEW);
        sbLIZ.append(URLEncoder.encode(((C1372620lp6) awS481S0200000_16.l0).LJIIIZ));
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C1537900q7g c1537900q7g = C1541950qED.LIZJ;
        Activity activity = (Activity) awS481S0200000_16.l1;
        SparkContext sparkContext = new SparkContext();
        String str = ((C1372620lp6) awS481S0200000_16.l0).LJIIJJI;
        if (str != null) {
            strLIZIZ = str;
        }
        sparkContext.LJJLIIJ(strLIZIZ);
        sparkContext.usePreload = true;
        c1537900q7g.getClass();
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ = new C1541950qED(activity, sparkContext).LIZ(false);
        C786410Ut5.C6(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ, new FrameLayout.LayoutParams(-1, -1));
        SparkContext sparkContext2 = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ.getSparkContext();
        if (sparkContext2 != null) {
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ.LJJIJ(sparkContext2);
        }
        Map<String, Object> map = ((C1372620lp6) awS481S0200000_16.l0).LJIIL;
        if (map != null) {
            SparkContext sparkContext3 = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ.getSparkContext();
            if (sparkContext3 != null) {
                interfaceC1531560pxS = sparkContext3.hybridParams;
            } else {
                interfaceC1531560pxS = null;
            }
            if ((interfaceC1531560pxS instanceof C1537910q7h) && (c1537910q7h = (C1537910q7h) interfaceC1531560pxS) != null) {
                c1537910q7h.LJIJJ = TemplateData.LJII(map);
            }
        }
        sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ.LJIIIIZZ();
        FrameLayout.LayoutParams layoutParamsLIZ = C0L2O.LIZ((Activity) awS481S0200000_16.l1, iIntValue, ScreenUtils.getScreenHeight((Activity) awS481S0200000_16.l1), 0.8f, 1.0f, 0.2f);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ);
        }
        sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ.setOnClickListener(null);
        return new Pair(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ, layoutParamsLIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AwS481S0200000_16 r16, java.lang.Object r17, java.lang.Object r18, java.lang.Object r19) {
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
            kotlin.jvm.internal.AwS58S0001000_16 r4 = new kotlin.jvm.internal.AwS58S0001000_16
            r0 = 8
            r4.<init>(r3, r0)
            r15.LJJIJIIJI(r4)
        L57:
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
            r15.LJ()
            r5 = 0
            X.0tW1 r6 = X.EnumC1668310tW1.Normal
            r8 = 0
            r0 = 2131829071(0x7f11214f, float:1.92911E38)
            java.lang.String r9 = X.C0MBB.LIZIZ(r0, r15)
            r0 = 2131829068(0x7f11214c, float:1.9291095E38)
            java.lang.String r10 = X.C0MBB.LIZIZ(r0, r15)
            kotlin.jvm.internal.AwS294S0300000_16 r3 = new kotlin.jvm.internal.AwS294S0300000_16
            r0 = r16
            java.lang.Object r2 = r0.l0
            com.ss.android.ugc.aweme.commentv2.commentlist.powercell.PollCell r2 = (com.ss.android.ugc.aweme.commentv2.commentlist.powercell.PollCell) r2
            java.lang.Object r1 = r0.l1
            X.0l1a r1 = (X.C1341920l1a) r1
            r0 = 1
            r3.<init>(r2, r1, r4, r0)
            r0 = 1063072354(0x3f5d3262, float:0.86405003)
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
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS481S0200000_16.invoke$1(kotlin.jvm.internal.AwS481S0200000_16, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$2(kotlin.jvm.internal.AwS481S0200000_16 r16, java.lang.Object r17, java.lang.Object r18, java.lang.Object r19) {
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
            kotlin.jvm.internal.AwS58S0001000_16 r4 = new kotlin.jvm.internal.AwS58S0001000_16
            r0 = 13
            r4.<init>(r3, r0)
            r15.LJJIJIIJI(r4)
        L57:
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
            r15.LJ()
            r5 = 0
            X.0tW1 r6 = X.EnumC1668310tW1.Normal
            r8 = 0
            r0 = 2131821811(0x7f1104f3, float:1.9276376E38)
            java.lang.String r9 = X.C0MBB.LIZIZ(r0, r15)
            r0 = 2131821809(0x7f1104f1, float:1.9276372E38)
            java.lang.String r10 = X.C0MBB.LIZIZ(r0, r15)
            kotlin.jvm.internal.AwS294S0300000_16 r3 = new kotlin.jvm.internal.AwS294S0300000_16
            r0 = r16
            java.lang.Object r2 = r0.l0
            com.ss.android.ugc.aweme.commercialize.ba.impl.service.BAAnchorServiceImpl r2 = (com.ss.android.ugc.aweme.commercialize.ba.impl.service.BAAnchorServiceImpl) r2
            java.lang.Object r1 = r0.l1
            android.content.Context r1 = (android.content.Context) r1
            r0 = 5
            r3.<init>(r2, r1, r4, r0)
            r0 = -971439516(0xffffffffc6190264, float:-9792.598)
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
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS481S0200000_16.invoke$2(kotlin.jvm.internal.AwS481S0200000_16, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$3(kotlin.jvm.internal.AwS481S0200000_16 r16, java.lang.Object r17, java.lang.Object r18, java.lang.Object r19) {
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
            kotlin.jvm.internal.AwS58S0001000_16 r4 = new kotlin.jvm.internal.AwS58S0001000_16
            r0 = 10
            r4.<init>(r3, r0)
            r15.LJJIJIIJI(r4)
        L57:
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
            r15.LJ()
            r5 = 0
            X.0tW1 r6 = X.EnumC1668310tW1.Normal
            r8 = 0
            r0 = 2131821805(0x7f1104ed, float:1.9276364E38)
            java.lang.String r9 = X.C0MBB.LIZIZ(r0, r15)
            r0 = 2131821802(0x7f1104ea, float:1.9276357E38)
            java.lang.String r10 = X.C0MBB.LIZIZ(r0, r15)
            kotlin.jvm.internal.AwS294S0300000_16 r3 = new kotlin.jvm.internal.AwS294S0300000_16
            r0 = r16
            java.lang.Object r2 = r0.l0
            com.ss.android.ugc.aweme.commercialize.ba.impl.service.BAAnchorServiceImpl r2 = (com.ss.android.ugc.aweme.commercialize.ba.impl.service.BAAnchorServiceImpl) r2
            java.lang.Object r1 = r0.l1
            android.content.Context r1 = (android.content.Context) r1
            r0 = 2
            r3.<init>(r2, r1, r4, r0)
            r0 = -735269693(0xffffffffd42cacc3, float:-2.9665313E12)
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
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS481S0200000_16.invoke$3(kotlin.jvm.internal.AwS481S0200000_16, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$4(kotlin.jvm.internal.AwS481S0200000_16 r16, java.lang.Object r17, java.lang.Object r18, java.lang.Object r19) {
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
            kotlin.jvm.internal.AwS58S0001000_16 r4 = new kotlin.jvm.internal.AwS58S0001000_16
            r0 = 11
            r4.<init>(r3, r0)
            r15.LJJIJIIJI(r4)
        L57:
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
            r15.LJ()
            r5 = 0
            X.0tW1 r6 = X.EnumC1668310tW1.Normal
            r8 = 0
            r0 = 2131821815(0x7f1104f7, float:1.9276384E38)
            java.lang.String r9 = X.C0MBB.LIZIZ(r0, r15)
            r0 = 2131821814(0x7f1104f6, float:1.9276382E38)
            java.lang.String r10 = X.C0MBB.LIZIZ(r0, r15)
            kotlin.jvm.internal.AwS294S0300000_16 r3 = new kotlin.jvm.internal.AwS294S0300000_16
            r0 = r16
            java.lang.Object r2 = r0.l0
            com.ss.android.ugc.aweme.commercialize.ba.impl.service.BAAnchorServiceImpl r2 = (com.ss.android.ugc.aweme.commercialize.ba.impl.service.BAAnchorServiceImpl) r2
            java.lang.Object r1 = r0.l1
            android.content.Context r1 = (android.content.Context) r1
            r0 = 3
            r3.<init>(r2, r1, r4, r0)
            r0 = -1443779162(0xffffffffa9f1ada6, float:-1.0732673E-13)
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
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS481S0200000_16.invoke$4(kotlin.jvm.internal.AwS481S0200000_16, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$5(kotlin.jvm.internal.AwS481S0200000_16 r16, java.lang.Object r17, java.lang.Object r18, java.lang.Object r19) {
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
            kotlin.jvm.internal.AwS58S0001000_16 r4 = new kotlin.jvm.internal.AwS58S0001000_16
            r0 = 12
            r4.<init>(r3, r0)
            r15.LJJIJIIJI(r4)
        L57:
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
            r15.LJ()
            r5 = 0
            X.0tW1 r6 = X.EnumC1668310tW1.Normal
            r8 = 0
            r0 = 2131821811(0x7f1104f3, float:1.9276376E38)
            java.lang.String r9 = X.C0MBB.LIZIZ(r0, r15)
            r0 = 2131821808(0x7f1104f0, float:1.927637E38)
            java.lang.String r10 = X.C0MBB.LIZIZ(r0, r15)
            kotlin.jvm.internal.AwS294S0300000_16 r3 = new kotlin.jvm.internal.AwS294S0300000_16
            r0 = r16
            java.lang.Object r2 = r0.l0
            com.ss.android.ugc.aweme.commercialize.ba.impl.service.BAAnchorServiceImpl r2 = (com.ss.android.ugc.aweme.commercialize.ba.impl.service.BAAnchorServiceImpl) r2
            java.lang.Object r1 = r0.l1
            android.content.Context r1 = (android.content.Context) r1
            r0 = 4
            r3.<init>(r2, r1, r4, r0)
            r0 = -1207609339(0xffffffffb8055805, float:-3.1791646E-5)
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
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS481S0200000_16.invoke$5(kotlin.jvm.internal.AwS481S0200000_16, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
