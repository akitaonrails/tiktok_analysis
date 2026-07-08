package kotlin.jvm.internal;

import X.C09AY;
import X.C15438062q;
import X.C1555830qab;
import X.C1708210uYN;
import X.C1708220uYO;
import X.C1708320uYY;
import X.C1898407c6;
import X.C259800zU;
import X.InterfaceC1708270uYT;
import android.app.Application;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.ecommerce.ug.backbutton.service.EcUgBackButtonServiceOfficial;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.POPayElement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes27.dex */
public class AwS2S1600000_26 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;
    public Object l6;
    public String s0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS2S1600000_26 awS2S1600000_26, Object obj) {
        C1898407c6 c1898407c6 = (C1898407c6) obj;
        C1708220uYO c1708220uYO = (C1708220uYO) awS2S1600000_26.l1;
        Context context = (Context) awS2S1600000_26.l2;
        String str = awS2S1600000_26.s0;
        C1708320uYY c1708320uYY = (C1708320uYY) awS2S1600000_26.l3;
        InterfaceC1708270uYT interfaceC1708270uYT = (InterfaceC1708270uYT) awS2S1600000_26.l4;
        Function1 function1 = (Function1) awS2S1600000_26.l5;
        Function1 function12 = (Function1) awS2S1600000_26.l6;
        c1708220uYO.getClass();
        ArrayList arrayList = null;
        if (c1898407c6.LIZLLL) {
            C1708210uYN c1708210uYN = C1708220uYO.LIZLLL;
            String str2 = c1898407c6.LIZJ;
            c1708210uYN.getClass();
            C1708210uYN.LIZJ(str, "2", str2, "cancel");
            interfaceC1708270uYT.LIZ(2, null);
        } else {
            List<C1555830qab> list = c1898407c6.LIZ;
            if (list != null) {
                arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                for (C1555830qab c1555830qab : list) {
                    arrayList.add(new POPayElement(c1555830qab.LIZ, c1555830qab.LIZIZ, c1555830qab.LIZJ, Boolean.valueOf(c1555830qab.LIZLLL)));
                }
            }
            String str3 = c1898407c6.LIZJ;
            if ((str3 == null || str3.length() == 0) && arrayList != null && !arrayList.isEmpty()) {
                function12.invoke(new C1708320uYY(c1708320uYY.LIZ, c1708320uYY.LIZIZ, c1708320uYY.LIZJ, c1708320uYY.LIZLLL, c1708320uYY.LJ, c1708320uYY.LJFF, arrayList, c1708320uYY.LJII, c1708320uYY.LJIIIIZZ));
            } else {
                String str4 = c1898407c6.LIZJ;
                if (str4 == null) {
                    str4 = "VENMO_ERROR_INVALID_PARAM";
                }
                C1708220uYO.LIZIZ(context, str, interfaceC1708270uYT, function1, str4);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS2S1600000_26 awS2S1600000_26, Object obj) {
        if (!((Boolean) obj).booleanValue()) {
            ((Application) awS2S1600000_26.l1).unregisterActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks) ((C259800zU) awS2S1600000_26.l2).element);
            ((ViewGroup) awS2S1600000_26.l3).addView((View) awS2S1600000_26.l4);
            EcUgBackButtonServiceOfficial ecUgBackButtonServiceOfficial = (EcUgBackButtonServiceOfficial) awS2S1600000_26.l5;
            View view = (View) awS2S1600000_26.l4;
            String str = awS2S1600000_26.s0;
            ecUgBackButtonServiceOfficial.getClass();
            EcUgBackButtonServiceOfficial.LJIIJJI(view, str);
            EcUgBackButtonServiceOfficial ecUgBackButtonServiceOfficial2 = (EcUgBackButtonServiceOfficial) awS2S1600000_26.l5;
            Map map = (Map) awS2S1600000_26.l6;
            ecUgBackButtonServiceOfficial2.getClass();
            EcUgBackButtonServiceOfficial.LJIIJ(map, true);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS2S1600000_26(C1708220uYO c1708220uYO, C1708220uYO c1708220uYO2, Context context, String str, C1708320uYY c1708320uYY, InterfaceC1708270uYT interfaceC1708270uYT, Function1<? super String, Unit> function1, Function1<? super C1708320uYY, Unit> function12) {
        super(1);
        this.$t = function12;
        this.l1 = c1708220uYO;
        this.l2 = c1708220uYO2;
        this.s0 = context;
        this.l3 = str;
        this.l4 = c1708320uYY;
        this.l5 = interfaceC1708270uYT;
        this.l6 = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS2S1600000_26(Application application, Application application2, C259800zU<Application.ActivityLifecycleCallbacks> c259800zU, ViewGroup viewGroup, View view, EcUgBackButtonServiceOfficial ecUgBackButtonServiceOfficial, String str, Map<String, Object> map) {
        super(1);
        this.$t = map;
        this.l1 = application;
        this.l2 = application2;
        this.l3 = c259800zU;
        this.l4 = viewGroup;
        this.l5 = view;
        this.s0 = ecUgBackButtonServiceOfficial;
        this.l6 = str;
    }
}
