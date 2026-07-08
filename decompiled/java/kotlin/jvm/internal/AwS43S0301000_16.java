package kotlin.jvm.internal;

import X.C09AY;
import X.C1002190cBd;
import X.C1023640ckE;
import X.C1035880d3y;
import X.C1040740dBo;
import X.C1043500dGG;
import X.C12ES;
import X.C1E1M;
import X.C2268451Dqd;
import X.C2273131DyB;
import X.C7740030o;
import X.C844470XAv;
import android.webkit.WebView;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.metric.LogItem;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.ad.FeatureCenterModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes17.dex */
public class AwS43S0301000_16 extends C09AY implements Function1 {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS43S0301000_16 awS43S0301000_16, Object obj) {
        String url;
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C1043500dGG.LIZ.getClass();
        c1023640ckE.withParam(C1043500dGG.LJIILJJIL, Integer.valueOf(((C1040740dBo) awS43S0301000_16.l0).LLILLL));
        c1023640ckE.withParam(C1043500dGG.LJIILLIIL, ((C1040740dBo) awS43S0301000_16.l0).LLJI);
        C1002190cBd c1002190cBd = C1043500dGG.LJJII;
        WebView webView = (WebView) awS43S0301000_16.l1;
        if (webView != null) {
            url = webView.getUrl();
        } else {
            url = null;
        }
        c1023640ckE.withParam(c1002190cBd, url);
        c1023640ckE.withParam(C1043500dGG.LJJLIIJ, Integer.valueOf(awS43S0301000_16.i3));
        C1002190cBd c1002190cBd2 = C1043500dGG.LJJZ;
        float currentOffset = ((C1035880d3y) awS43S0301000_16.l2).getCurrentOffset();
        C844470XAv.LIZ.getClass();
        c1023640ckE.withParam(c1002190cBd2, Double.valueOf(currentOffset / C12ES.LJIIIIZZ(C844470XAv.LIZ())));
        c1023640ckE.withParam(C1043500dGG.LJJZZI, Integer.valueOf(((C1035880d3y) awS43S0301000_16.l2).getWebPageScrollCount()));
        c1023640ckE.withParam(C1043500dGG.LJJZZIII, Double.valueOf(((C1035880d3y) awS43S0301000_16.l2).getWebPageScrollOffset() / C12ES.LJIIIIZZ(C844470XAv.LIZ())));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS43S0301000_16 awS43S0301000_16, Object obj) {
        String str;
        Long l;
        FeatureCenterModel feature;
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C2268451Dqd.LIZ.getClass();
        c1023640ckE.withParam(C2268451Dqd.LJIIZILJ, Long.valueOf(((C1040740dBo) awS43S0301000_16.l0).LLILLL));
        c1023640ckE.withParam(C2268451Dqd.LJJIJL, ((C1040740dBo) awS43S0301000_16.l0).LLJI);
        c1023640ckE.withParam(C2268451Dqd.LJII, "iab");
        c1023640ckE.withParam(C2268451Dqd.LJJIL, GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), (List) awS43S0301000_16.l1));
        c1023640ckE.withParam(C2268451Dqd.LJI, Long.valueOf(((C1040740dBo) awS43S0301000_16.l0).LLJJIJIL));
        c1023640ckE.withParam(C2268451Dqd.LJJIIJ, (Long) awS43S0301000_16.l2);
        C1002190cBd c1002190cBd = C2268451Dqd.LJIIIIZZ;
        if (((C1040740dBo) awS43S0301000_16.l0).LLJJJIL) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c1023640ckE.withParam(c1002190cBd, str);
        c1023640ckE.withParam(C2268451Dqd.LJIJ, Long.valueOf(awS43S0301000_16.i3));
        C1E1M.LIZ.getClass();
        C1002190cBd c1002190cBd2 = C1E1M.LJIIJJI;
        AwemeRawAd awemeRawAd = ((C1040740dBo) awS43S0301000_16.l0).LL.getAwemeRawAd();
        if (awemeRawAd != null && (feature = awemeRawAd.getFeature()) != null) {
            l = feature.pricingType;
        } else {
            l = null;
        }
        c1023640ckE.withParam(c1002190cBd2, l);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS43S0301000_16 awS43S0301000_16, Object obj) {
        String str;
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C2268451Dqd.LIZ.getClass();
        c1023640ckE.withParam(C2268451Dqd.LJIIZILJ, Long.valueOf(((C1040740dBo) awS43S0301000_16.l0).LLILLL));
        c1023640ckE.withParam(C2268451Dqd.LJJIJL, ((C1040740dBo) awS43S0301000_16.l0).LLJI);
        c1023640ckE.withParam(C2268451Dqd.LJII, "iab");
        c1023640ckE.withParam(C2268451Dqd.LJJIL, GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), (List) awS43S0301000_16.l1));
        c1023640ckE.withParam(C2268451Dqd.LJI, Long.valueOf(((C1040740dBo) awS43S0301000_16.l0).LLJJIJIL));
        c1023640ckE.withParam(C2268451Dqd.LJJIIJ, (Long) awS43S0301000_16.l2);
        C1002190cBd c1002190cBd = C2268451Dqd.LJIIIIZZ;
        if (((C1040740dBo) awS43S0301000_16.l0).LLJJJIL) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c1023640ckE.withParam(c1002190cBd, str);
        c1023640ckE.withParam(C2268451Dqd.LJIJ, Long.valueOf(awS43S0301000_16.i3));
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS43S0301000_16 awS43S0301000_16, Object obj) {
        String url;
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C2273131DyB.LIZ.getClass();
        c1023640ckE.withParam(C2273131DyB.LJIILJJIL, Long.valueOf(((C1040740dBo) awS43S0301000_16.l0).LLILLL));
        c1023640ckE.withParam(C2273131DyB.LJJIIZI, ((C1040740dBo) awS43S0301000_16.l0).LLJI);
        C1002190cBd c1002190cBd = C2273131DyB.LJIIIIZZ;
        WebView webView = (WebView) awS43S0301000_16.l1;
        if (webView != null) {
            url = webView.getUrl();
        } else {
            url = null;
        }
        c1023640ckE.withParam(c1002190cBd, url);
        c1023640ckE.withParam(C2273131DyB.LJI, Long.valueOf(((C1040740dBo) awS43S0301000_16.l0).LLJJIJIL));
        c1023640ckE.withParam(C2273131DyB.LJII, "iab");
        c1023640ckE.withParam(C2273131DyB.LJIIIZ, Long.valueOf(awS43S0301000_16.i3));
        C1002190cBd c1002190cBd2 = C2273131DyB.LJJIJL;
        float currentOffset = ((C1035880d3y) awS43S0301000_16.l2).getCurrentOffset();
        C844470XAv.LIZ.getClass();
        c1023640ckE.withParam(c1002190cBd2, Double.valueOf(currentOffset / C12ES.LJIIIIZZ(C844470XAv.LIZ())));
        c1023640ckE.withParam(C2273131DyB.LJIILLIIL, Long.valueOf(((C1035880d3y) awS43S0301000_16.l2).getWebPageScrollCount()));
        c1023640ckE.withParam(C2273131DyB.LJJII, Double.valueOf(((C1035880d3y) awS43S0301000_16.l2).getWebPageScrollOffset() / C12ES.LJIIIIZZ(C844470XAv.LIZ())));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS43S0301000_16(C1040740dBo c1040740dBo, WebView webView, int i, C1035880d3y c1035880d3y, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c1040740dBo;
        this.l1 = webView;
        this.i3 = i;
        this.l2 = c1035880d3y;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS43S0301000_16(C1040740dBo c1040740dBo, C1040740dBo c1040740dBo2, List<LogItem> list, Long l, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1040740dBo;
        this.l1 = c1040740dBo2;
        this.l2 = list;
        this.i3 = l;
    }
}
