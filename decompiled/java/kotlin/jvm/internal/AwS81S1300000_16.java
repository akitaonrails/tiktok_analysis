package kotlin.jvm.internal;

import X.AbstractC1542100qES;
import X.C09AY;
import X.C1035880d3y;
import X.C1039440d9i;
import X.C1542120qEU;
import X.C786410Ut5;
import X.InterfaceC1036110d4L;
import X.InterfaceC1541990qEH;
import android.webkit.WebView;
import com.bytedance.hybrid.spark.SparkContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes17.dex */
public class AwS81S1300000_16 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS81S1300000_16 awS81S1300000_16) {
        ((AbstractC1542100qES) awS81S1300000_16.l1).LJL((InterfaceC1541990qEH) awS81S1300000_16.l2, awS81S1300000_16.s0, (C1542120qEU) awS81S1300000_16.l3);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AwS81S1300000_16 awS81S1300000_16) {
        InterfaceC1036110d4L interfaceC1036110d4L;
        String string;
        C1035880d3y c1035880d3y = ((C1039440d9i) awS81S1300000_16.l1).LIZ;
        if (c1035880d3y != null) {
            c1035880d3y.setIgnoreSslErrorOnce(false);
        }
        String url = ((WebView) awS81S1300000_16.l2).getUrl();
        if (url != null) {
            WebView webView = (WebView) awS81S1300000_16.l2;
            C1039440d9i c1039440d9i = (C1039440d9i) awS81S1300000_16.l1;
            Integer num = (Integer) awS81S1300000_16.l3;
            String str = awS81S1300000_16.s0;
            C786410Ut5.ue(webView, url);
            SparkContext sparkContext = c1039440d9i.LIZIZ;
            if (sparkContext != null && (interfaceC1036110d4L = (InterfaceC1036110d4L) sparkContext.LJFF(InterfaceC1036110d4L.class)) != null) {
                if (num != null) {
                    string = num.toString();
                } else {
                    string = null;
                }
                interfaceC1036110d4L.LJJIJ(string, str);
            }
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$2(AwS81S1300000_16 awS81S1300000_16) {
        InterfaceC1036110d4L interfaceC1036110d4L;
        String string;
        C1035880d3y c1035880d3y = ((C1039440d9i) awS81S1300000_16.l1).LIZ;
        if (c1035880d3y != null) {
            c1035880d3y.setIgnoreSslErrorOnce(true);
        }
        String url = ((WebView) awS81S1300000_16.l2).getUrl();
        if (url != null) {
            WebView webView = (WebView) awS81S1300000_16.l2;
            C1039440d9i c1039440d9i = (C1039440d9i) awS81S1300000_16.l1;
            Integer num = (Integer) awS81S1300000_16.l3;
            String str = awS81S1300000_16.s0;
            C786410Ut5.ue(webView, url);
            SparkContext sparkContext = c1039440d9i.LIZIZ;
            if (sparkContext != null && (interfaceC1036110d4L = (InterfaceC1036110d4L) sparkContext.LJFF(InterfaceC1036110d4L.class)) != null) {
                if (num != null) {
                    string = num.toString();
                } else {
                    string = null;
                }
                interfaceC1036110d4L.LJJIJ(string, str);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS81S1300000_16(C1039440d9i c1039440d9i, WebView webView, Integer num, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c1039440d9i;
        this.l2 = webView;
        this.l3 = num;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS81S1300000_16(AbstractC1542100qES abstractC1542100qES, InterfaceC1541990qEH interfaceC1541990qEH, String str, C1542120qEU c1542120qEU, int i) {
        super(0);
        this.$t = i;
        this.l1 = abstractC1542100qES;
        this.l2 = interfaceC1541990qEH;
        this.s0 = str;
        this.l3 = c1542120qEU;
    }
}
