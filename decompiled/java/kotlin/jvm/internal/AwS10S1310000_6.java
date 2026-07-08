package kotlin.jvm.internal;

import X.C03DZ;
import X.C09AY;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2344009Gk;
import X.C434520H2c;
import X.C434570H2h;
import X.C435210H4t;
import X.C786410Ut5;
import X.InterfaceC434580H2i;
import android.view.View;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public class AwS10S1310000_6 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;
    public boolean z4;

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AwS10S1310000_6 awS10S1310000_6) {
        Integer numLIZIZ;
        if (awS10S1310000_6.z4) {
            String str = awS10S1310000_6.s0;
            if (str != null && (numLIZIZ = C435210H4t.LIZIZ(str)) != null) {
                View view = (View) awS10S1310000_6.l1;
                int iIntValue = numLIZIZ.intValue();
                if (view != null) {
                    view.setBackgroundColor(iIntValue);
                }
            }
            View view2 = (View) awS10S1310000_6.l1;
            if (view2 != null) {
                C03DZ.LIZJ(view2);
            }
            Function0 function0 = (Function0) awS10S1310000_6.l2;
            if (function0 != null) {
                function0.invoke();
            }
            C786410Ut5.T4((View) awS10S1310000_6.l3, 0.0f);
            C03DZ.LIZJ((View) awS10S1310000_6.l3);
            ((View) awS10S1310000_6.l3).animate().alpha(1.0f).setDuration(300L).start();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS10S1310000_6 awS10S1310000_6) {
        Map linkedHashMap;
        String str;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJII((Map) awS10S1310000_6.l1);
        InterfaceC434580H2i interfaceC434580H2i = (InterfaceC434580H2i) awS10S1310000_6.l2;
        if (interfaceC434580H2i != null) {
            boolean z = awS10S1310000_6.z4;
            if (interfaceC434580H2i instanceof C434570H2h) {
                linkedHashMap = C2097608Jq.LJIIJ(new Pair("words_source_type", "user_posts"), new Pair("words_source_link", ((C434570H2h) interfaceC434580H2i).LL.getAid()));
            } else if (interfaceC434580H2i instanceof C434520H2c) {
                linkedHashMap = C2097608Jq.LJIIJ(new Pair("words_source_type", "web_rag"), new Pair("words_source_link", ((C434520H2c) interfaceC434580H2i).LLILZIL));
            } else {
                linkedHashMap = new LinkedHashMap();
            }
            if (z) {
                str = "panel";
            } else {
                str = "page";
            }
            linkedHashMap.put("words_source_area", str);
        } else {
            linkedHashMap = null;
        }
        c2344009Gk.LJII(linkedHashMap);
        c2344009Gk.LJIIIIZZ("button_type", awS10S1310000_6.s0);
        c2344009Gk.LJII((Map) awS10S1310000_6.l3);
        C20684815ws.LJIILLIIL("search_result_click", c2344009Gk.LIZ);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS10S1310000_6(InterfaceC434580H2i interfaceC434580H2i, String str, Map map, Map map2, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l1 = map;
        this.l2 = interfaceC434580H2i;
        this.z4 = z;
        this.s0 = str;
        this.l3 = map2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS10S1310000_6(boolean z, boolean z2, String str, View view, Function0<Unit> function0, View view2) {
        super(0);
        this.$t = view2;
        this.z4 = z;
        this.s0 = z2;
        this.l1 = str;
        this.l2 = view;
        this.l3 = function0;
    }
}
