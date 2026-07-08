package kotlin.jvm.internal;

import X.C09AY;
import X.C0WOV;
import X.C1002190cBd;
import X.C1015030cWL;
import X.C1023640ckE;
import X.C1035880d3y;
import X.C1040740dBo;
import X.C1042340dEO;
import X.C1043500dGG;
import X.C2274541E1c;
import android.webkit.WebBackForwardList;
import android.webkit.WebView;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes17.dex */
public class AwS5S0200200_16 extends C09AY implements Function1 {
    public final int $t;
    public long j2;
    public long j3;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS5S0200200_16 awS5S0200200_16, Object obj) {
        int size;
        WebBackForwardList webBackForwardListCopyBackForwardList;
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C1043500dGG.LIZ.getClass();
        c1023640ckE.withParam(C1043500dGG.LJIILJJIL, Integer.valueOf(((C1040740dBo) awS5S0200200_16.l0).LLILLL));
        c1023640ckE.withParam(C1043500dGG.LJIILLIIL, ((C1040740dBo) awS5S0200200_16.l0).LLJI);
        c1023640ckE.withParam(C1043500dGG.LJIIZILJ, Long.valueOf(awS5S0200200_16.j2));
        c1023640ckE.withParam(C1043500dGG.LJIJJ, Long.valueOf(((C1040740dBo) awS5S0200200_16.l0).LLILZLL));
        c1023640ckE.withParam(C1043500dGG.LJIJJLI, Long.valueOf(((C1040740dBo) awS5S0200200_16.l0).LLIZ));
        c1023640ckE.withParam(C1043500dGG.LJIL, Long.valueOf(awS5S0200200_16.j3));
        C1002190cBd c1002190cBd = C1043500dGG.LJJIJLIJ;
        WebView webView = (WebView) awS5S0200200_16.l1;
        if (webView != null && (webBackForwardListCopyBackForwardList = webView.copyBackForwardList()) != null) {
            size = webBackForwardListCopyBackForwardList.getSize();
        } else {
            size = -1;
        }
        c1023640ckE.withParam(c1002190cBd, Integer.valueOf(size));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS5S0200200_16 awS5S0200200_16, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C1015030cWL.LIZ.getClass();
        c1023640ckE.withParam(C1015030cWL.LIZIZ, Long.valueOf(((AnoleComponentModel) awS5S0200200_16.l0).getID()));
        c1023640ckE.withParam(C1015030cWL.LIZJ, ((AnoleComponentModel) awS5S0200200_16.l0).type);
        c1023640ckE.withParam(C1015030cWL.LJ, ((C0WOV) awS5S0200200_16.l1).name());
        c1023640ckE.withParam(C1015030cWL.LJI, Long.valueOf(awS5S0200200_16.j2));
        c1023640ckE.withParam(C1015030cWL.LJFF, Long.valueOf(awS5S0200200_16.j3));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS5S0200200_16 awS5S0200200_16, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C2274541E1c.LIZ.getClass();
        c1023640ckE.withParam(C2274541E1c.LIZIZ, Long.valueOf(awS5S0200200_16.j2 - ((C1042340dEO) awS5S0200200_16.l0).LIZIZ));
        c1023640ckE.withParam(C2274541E1c.LJJJZ, Long.valueOf(awS5S0200200_16.j3));
        c1023640ckE.withParam(C2274541E1c.LIZLLL, Long.valueOf(((C1035880d3y) awS5S0200200_16.l1).getRecordingModel().currentPageScrollCount.get()));
        c1023640ckE.withParam(C2274541E1c.LIZJ, Long.valueOf(((C1035880d3y) awS5S0200200_16.l1).getRecordingModel().currentPageClickCount.get()));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS5S0200200_16(long j, C1042340dEO c1042340dEO, long j2, C1035880d3y c1035880d3y, int i) {
        super(1);
        this.$t = i;
        this.j2 = j;
        this.l0 = c1042340dEO;
        this.j3 = j2;
        this.l1 = c1035880d3y;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS5S0200200_16(C1040740dBo c1040740dBo, long j, long j2, WebView webView, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1040740dBo;
        this.j2 = j;
        this.j3 = j2;
        this.l1 = webView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS5S0200200_16(AnoleComponentModel anoleComponentModel, C0WOV c0wov, long j, long j2, int i) {
        super(1);
        this.$t = i;
        this.l0 = anoleComponentModel;
        this.l1 = c0wov;
        this.j2 = j;
        this.j3 = j2;
    }
}
