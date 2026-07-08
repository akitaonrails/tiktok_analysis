package kotlin.jvm.internal;

import X.C09AY;
import X.C1002190cBd;
import X.C1023640ckE;
import X.C1035880d3y;
import X.C1042410dEV;
import X.C1043500dGG;
import X.C1047920dNO;
import X.C1047960dNS;
import X.C1066420drE;
import X.C2265811DmN;
import X.C2265831DmP;
import X.C2274561E1e;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.scene.Scene;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.ad.recording.engageinfo.IAdLandPageEngageInfoProvider;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.model.PaymentModel;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.model.PaymentNodeStatusModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes17.dex */
public class AwS6S3100000_16 extends C09AY implements Function1 {
    public final int $t;
    public Object l3;
    public String s0;
    public String s1;
    public String s2;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS6S3100000_16 awS6S3100000_16, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C2274561E1e.LIZ.getClass();
        c1023640ckE.withParam(C2274561E1e.LJIIIIZZ, awS6S3100000_16.s0);
        c1023640ckE.withParam(C2274561E1e.LJII, awS6S3100000_16.s1);
        c1023640ckE.withParam(C2274561E1e.LJI, awS6S3100000_16.s2);
        c1023640ckE.withParam(C2274561E1e.LJFF, "js_event");
        c1023640ckE.withParam(C2274561E1e.LJIIL, "js_event");
        c1023640ckE.withParam(C2274561E1e.LJJLIIIJL, "");
        c1023640ckE.withParam(C2274561E1e.LJIIJJI, "");
        c1023640ckE.withParam(C2274561E1e.LJIIIZ, ((C1042410dEV) awS6S3100000_16.l3).LJ);
        c1023640ckE.withParam(C2274561E1e.LJJLIIIJ, "");
        c1023640ckE.withParam(C2274561E1e.LJJLIIIJJI, Long.valueOf(((C1042410dEV) awS6S3100000_16.l3).LJI));
        c1023640ckE.withParam(C2274561E1e.LJJLIIIJILLIZJL, Long.valueOf(((C1042410dEV) awS6S3100000_16.l3).LJIIJ));
        c1023640ckE.withParam(C2274561E1e.LJJLIIIJJIZ, ((C1042410dEV) awS6S3100000_16.l3).LJIIIIZZ);
        c1023640ckE.withParam(C2274561E1e.LJJIJIL, ((C1042410dEV) awS6S3100000_16.l3).LIZJ);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS6S3100000_16 awS6S3100000_16, Object obj) {
        SmartRouter.buildRoute(((C1066420drE) awS6S3100000_16.l3).LJIILJJIL(), UriProtector.parse("//studio/editor_pro").buildUpon().appendQueryParameter(Scene.SCENE_SERVICE, "open_ep_magic").appendQueryParameter("resource_type", awS6S3100000_16.s0).appendQueryParameter("enter_from", ((C1066420drE) awS6S3100000_16.l3).LJIJJLI()).appendQueryParameter("enter_method", ((C1066420drE) awS6S3100000_16.l3).LJIJJ()).appendQueryParameter("effect_id", awS6S3100000_16.s1).appendQueryParameter("resource_id", awS6S3100000_16.s2).toString()).open();
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS6S3100000_16 awS6S3100000_16, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C2265831DmP.LIZ.getClass();
        c1023640ckE.withParam(C2265831DmP.LJIILL, ((C1047920dNO) awS6S3100000_16.l3).LIZIZ);
        c1023640ckE.withParam(C2265831DmP.LJIIZILJ, awS6S3100000_16.s0);
        c1023640ckE.withParam(C2265831DmP.LJIILLIIL, awS6S3100000_16.s1);
        c1023640ckE.withParam(C2265831DmP.LJJIJL, awS6S3100000_16.s2);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS6S3100000_16 awS6S3100000_16, Object obj) {
        PaymentNodeStatusModel paymentNodeStatusModel;
        String str;
        int pageCount;
        String str2;
        PaymentModel paymentModel;
        PaymentModel paymentModel2;
        PaymentModel paymentModel3;
        PaymentModel paymentModel4;
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C2265811DmN.LIZ.getClass();
        c1023640ckE.withParam(C2265811DmN.LJIIZILJ, awS6S3100000_16.s0);
        C1002190cBd c1002190cBd = C2265811DmN.LJIJ;
        Gson gson = new Gson();
        C1035880d3y c1035880d3y = ((C1047960dNS) awS6S3100000_16.l3).LJ;
        String str3 = null;
        if (c1035880d3y != null && (paymentModel4 = c1035880d3y.getPaymentModel()) != null) {
            paymentNodeStatusModel = paymentModel4.nodeStatus;
        } else {
            paymentNodeStatusModel = null;
        }
        c1023640ckE.withParam(c1002190cBd, GsonProtectorUtils.toJson(gson, paymentNodeStatusModel));
        C1002190cBd c1002190cBd2 = C2265811DmN.LJIJJLI;
        C1035880d3y c1035880d3y2 = ((C1047960dNS) awS6S3100000_16.l3).LJ;
        if (c1035880d3y2 != null && (paymentModel3 = c1035880d3y2.getPaymentModel()) != null) {
            str = paymentModel3.paymentId;
        } else {
            str = null;
        }
        c1023640ckE.withParam(c1002190cBd2, str);
        C1002190cBd c1002190cBd3 = C2265811DmN.LJIJI;
        C1035880d3y c1035880d3y3 = ((C1047960dNS) awS6S3100000_16.l3).LJ;
        if (c1035880d3y3 != null) {
            pageCount = c1035880d3y3.getPageCount();
        } else {
            pageCount = -1;
        }
        c1023640ckE.withParam(c1002190cBd3, Long.valueOf(pageCount));
        C1002190cBd c1002190cBd4 = C2265811DmN.LJIL;
        C1035880d3y c1035880d3y4 = ((C1047960dNS) awS6S3100000_16.l3).LJ;
        if (c1035880d3y4 != null && (paymentModel2 = c1035880d3y4.getPaymentModel()) != null) {
            str2 = paymentModel2.paymentMethod;
        } else {
            str2 = null;
        }
        c1023640ckE.withParam(c1002190cBd4, str2);
        C1002190cBd c1002190cBd5 = C2265811DmN.LJJ;
        C1035880d3y c1035880d3y5 = ((C1047960dNS) awS6S3100000_16.l3).LJ;
        if (c1035880d3y5 != null && (paymentModel = c1035880d3y5.getPaymentModel()) != null) {
            str3 = paymentModel.paymentType;
        }
        c1023640ckE.withParam(c1002190cBd5, str3);
        c1023640ckE.withParam(C2265811DmN.LJJIJIIJIL, awS6S3100000_16.s1);
        c1023640ckE.withParam(C2265811DmN.LJJIL, awS6S3100000_16.s2);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS6S3100000_16 awS6S3100000_16, Object obj) {
        String strLIZIZ;
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C2274561E1e.LIZ.getClass();
        c1023640ckE.withParam(C2274561E1e.LJJLIIIJLJLI, awS6S3100000_16.s0);
        c1023640ckE.withParam(C2274561E1e.LJJLIIIJLLLLLLLZ, awS6S3100000_16.s1);
        c1023640ckE.withParam(C2274561E1e.LJIIL, "pixel");
        c1023640ckE.withParam(C2274561E1e.LJIIJ, ((C1035880d3y) awS6S3100000_16.l3).getContainerId());
        String str = "";
        c1023640ckE.withParam(C2274561E1e.LJJLIIIJL, "");
        c1023640ckE.withParam(C2274561E1e.LJIIJJI, "");
        c1023640ckE.withParam(C2274561E1e.LJIIIZ, awS6S3100000_16.s2);
        c1023640ckE.withParam(C2274561E1e.LJJLIIIJ, "");
        c1023640ckE.withParam(C2274561E1e.LJJLIIIJJI, Long.valueOf(((C1035880d3y) awS6S3100000_16.l3).getRecordingModel().eventIndex.incrementAndGet()));
        c1023640ckE.withParam(C2274561E1e.LJJLIIIJILLIZJL, Long.valueOf(System.currentTimeMillis()));
        C1002190cBd c1002190cBd = C2274561E1e.LJJLIIIJJIZ;
        IAdLandPageEngageInfoProvider iAdLandPageEngageInfoProvider = (IAdLandPageEngageInfoProvider) PluggableExtentionKt.pluggableSpi$default(IAdLandPageEngageInfoProvider.class, false, false, false, 14, null);
        if (iAdLandPageEngageInfoProvider == null || (strLIZIZ = iAdLandPageEngageInfoProvider.LIZIZ(((C1035880d3y) awS6S3100000_16.l3).getRealCreativeIdStr())) == null) {
            strLIZIZ = "";
        }
        c1023640ckE.withParam(c1002190cBd, strLIZIZ);
        C1002190cBd c1002190cBd2 = C2274561E1e.LJJIJIL;
        String currentUrlOrWebUrl = ((C1035880d3y) awS6S3100000_16.l3).getCurrentUrlOrWebUrl();
        if (currentUrlOrWebUrl != null) {
            str = currentUrlOrWebUrl;
        }
        c1023640ckE.withParam(c1002190cBd2, str);
        c1023640ckE.withParam(C2274561E1e.LJFF, "pixel");
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS6S3100000_16 awS6S3100000_16, Object obj) {
        int i;
        int i2;
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C1043500dGG.LIZ.getClass();
        C1002190cBd c1002190cBd = C1043500dGG.LLJJIJIIJIL;
        String str = awS6S3100000_16.s0;
        int i3 = 0;
        if (str != null && !a0.LJJJIL(str)) {
            i = 0;
        } else {
            i = 1;
        }
        c1023640ckE.withParam(c1002190cBd, Integer.valueOf(i ^ 1));
        C1002190cBd c1002190cBd2 = C1043500dGG.LLJJIJIL;
        String str2 = awS6S3100000_16.s1;
        if (str2 != null && !a0.LJJJIL(str2)) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        c1023640ckE.withParam(c1002190cBd2, Integer.valueOf(i2 ^ 1));
        C1002190cBd c1002190cBd3 = C1043500dGG.LLJJJ;
        String str3 = awS6S3100000_16.s2;
        if (str3 == null || a0.LJJJIL(str3)) {
            i3 = 1;
        }
        c1023640ckE.withParam(c1002190cBd3, Integer.valueOf(i3 ^ 1));
        c1023640ckE.withParam(C1043500dGG.LLJJJIL, awS6S3100000_16.s0);
        c1023640ckE.withParam(C1043500dGG.LLJJJJ, (Long) awS6S3100000_16.l3);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS6S3100000_16(C1035880d3y c1035880d3y, String str, String str2, String str3, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
        this.l3 = c1035880d3y;
        this.s2 = str3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS6S3100000_16(C1047920dNO c1047920dNO, String str, String str2, String str3, int i) {
        super(1);
        this.$t = i;
        this.l3 = c1047920dNO;
        this.s0 = str;
        this.s1 = str2;
        this.s2 = str3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS6S3100000_16(String str, C1047960dNS c1047960dNS, String str2, String str3, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l3 = c1047960dNS;
        this.s1 = str2;
        this.s2 = str3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS6S3100000_16(String str, C1066420drE c1066420drE, String str2, String str3, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l3 = c1066420drE;
        this.s1 = str2;
        this.s2 = str3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS6S3100000_16(String str, String str2, String str3, C1042410dEV c1042410dEV, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
        this.s2 = str3;
        this.l3 = c1042410dEV;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS6S3100000_16(String str, String str2, String str3, Long l, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
        this.s2 = str3;
        this.l3 = l;
    }
}
