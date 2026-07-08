package kotlin.jvm.internal;

import X.C09AY;
import X.C0TT3;
import X.C1167750gUf;
import X.C1184790gw9;
import X.C1185430gxB;
import X.C1187970h1H;
import X.C1188090h1T;
import X.C1367960lha;
import X.C1391190mJ3;
import X.C1397620mTQ;
import X.C19EG;
import X.C20248814Kw;
import X.C259800zU;
import X.C343970De7;
import X.EnumC1163900gOS;
import X.EnumC1184780gw8;
import X.EnumC1198680hIY;
import X.InterfaceC1167780gUi;
import X.InterfaceC1181010gq3;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.food.PoiDetailFoodHeaderAssem;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.search.PoiSearchVM;
import com.ss.android.ugc.aweme.poi_api.model.PoiLocation;
import com.ss.android.ugc.aweme.poi_api.service.IPoiService;
import com.ss.android.ugc.aweme.slash.data.EventModel;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes19.dex */
public class AwS6S2400000_18 extends C09AY implements Function1 {
    public final int $t;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;
    public String s0;
    public String s1;

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

    public static final Object invoke$0(AwS6S2400000_18 awS6S2400000_18, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LJFF(2131846236, new AwS6S2400000_18((Activity) awS6S2400000_18.l2, (Activity) awS6S2400000_18.l3, (Aweme) awS6S2400000_18.l4, (C259800zU<String>) awS6S2400000_18.l5, (InterfaceC1167780gUi) awS6S2400000_18.s0, awS6S2400000_18.s1, (String) 1));
        c1397620mTQ.LJII(R.string.f1_, new AwS597S0100000_18((InterfaceC1167780gUi) awS6S2400000_18.l5, 184));
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$1(AwS6S2400000_18 awS6S2400000_18, Object obj) {
        C1167750gUf c1167750gUf = C1167750gUf.LIZ;
        Activity activity = (Activity) awS6S2400000_18.l2;
        Aweme aweme = (Aweme) awS6S2400000_18.l3;
        String str = (String) ((C259800zU) awS6S2400000_18.l4).element;
        int operation = EnumC1163900gOS.VIDEOREMOVE.getOperation();
        InterfaceC1167780gUi interfaceC1167780gUi = (InterfaceC1167780gUi) awS6S2400000_18.l5;
        String str2 = awS6S2400000_18.s0;
        String str3 = awS6S2400000_18.s1;
        c1167750gUf.getClass();
        C1167750gUf.LIZ(activity, aweme, str, operation, interfaceC1167780gUi, str2, str3, false);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS6S2400000_18 awS6S2400000_18, Object obj) {
        C20248814Kw c20248814Kw = (C20248814Kw) obj;
        c20248814Kw.LIZ = new AwS562S0100000_18((FrameLayout) awS6S2400000_18.l2, 1012);
        c20248814Kw.LIZIZ(new C1184790gw9(awS6S2400000_18.s0, (PoiDetailFoodHeaderAssem) awS6S2400000_18.l3, (PoiListApi.PoiDetailResponse) awS6S2400000_18.l4, awS6S2400000_18.s1, (Pair) awS6S2400000_18.l5));
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS6S2400000_18 awS6S2400000_18, Object obj) {
        return C1187970h1H.LIZ((C1187970h1H) obj, null, new C1188090h1T(awS6S2400000_18.s0, awS6S2400000_18.s1, (Map) awS6S2400000_18.l2, (InterfaceC1181010gq3) awS6S2400000_18.l3, (PoiListApi.PoiMergedListResponse) awS6S2400000_18.l4, (C0TT3) awS6S2400000_18.l5), null, 5);
    }

    public static final Object invoke$4(AwS6S2400000_18 awS6S2400000_18, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LIZJ(0, awS6S2400000_18.s0, new AwS115S0400000_18((PoiSearchVM) awS6S2400000_18.l2, (C19EG) awS6S2400000_18.l3, (PoiData) awS6S2400000_18.l4, (EnumC1198680hIY) awS6S2400000_18.l5, 11));
        c1397620mTQ.LIZJ(1, awS6S2400000_18.s1, new AwS597S0100000_18((PoiSearchVM) awS6S2400000_18.l2, 673));
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS6S2400000_18 awS6S2400000_18, Object obj) {
        Double d;
        String str = TuxSheet._pnsPageId;
        C1391190mJ3.LJ((View) obj, C343970De7.LIZ);
        C1367960lha.LIZ.getClass();
        IPoiService iPoiServiceLIZ = C1367960lha.LIZ();
        Context context = (Context) awS6S2400000_18.l2;
        PoiLocation poiLocation = ((PoiListApi.PoiDetailResponse) awS6S2400000_18.l3).getPoiLocation();
        Double d2 = null;
        if (poiLocation != null) {
            d = poiLocation.lat;
        } else {
            d = null;
        }
        PoiLocation poiLocation2 = ((PoiListApi.PoiDetailResponse) awS6S2400000_18.l3).getPoiLocation();
        if (poiLocation2 != null) {
            d2 = poiLocation2.lng;
        }
        iPoiServiceLIZ.LJLL(context, d, d2, ((PoiListApi.PoiDetailResponse) awS6S2400000_18.l3).getName(), ((PoiListApi.PoiDetailResponse) awS6S2400000_18.l3).getAddress(), (Float) awS6S2400000_18.l4, awS6S2400000_18.s0, awS6S2400000_18.s1, (PageFinder) awS6S2400000_18.l5);
        C1185430gxB c1185430gxB = C1185430gxB.LIZ;
        String str2 = awS6S2400000_18.s0;
        String str3 = awS6S2400000_18.s1;
        PageFinder pageFinder = (PageFinder) awS6S2400000_18.l5;
        c1185430gxB.getClass();
        C1185430gxB.LJJI(pageFinder, str2, str3);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS6S2400000_18(Activity activity, Activity activity2, Aweme aweme, C259800zU<String> c259800zU, InterfaceC1167780gUi interfaceC1167780gUi, String str, String str2) {
        super(1);
        this.$t = str2;
        this.l2 = activity;
        this.l3 = activity2;
        this.l4 = aweme;
        this.l5 = c259800zU;
        this.s0 = interfaceC1167780gUi;
        this.s1 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS6S2400000_18(Context context, PoiListApi.PoiDetailResponse poiDetailResponse, Float f, String str, String str2, PageFinder pageFinder, int i) {
        super(1);
        this.$t = i;
        this.l2 = context;
        this.l3 = poiDetailResponse;
        this.l4 = f;
        this.s0 = str;
        this.s1 = str2;
        this.l5 = pageFinder;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS6S2400000_18(FrameLayout frameLayout, FrameLayout frameLayout2, String str, PoiDetailFoodHeaderAssem poiDetailFoodHeaderAssem, PoiListApi.PoiDetailResponse poiDetailResponse, String str2, Pair<? extends CharSequence, ? extends EnumC1184780gw8> pair) {
        super(1);
        this.$t = pair;
        this.l2 = frameLayout;
        this.s0 = frameLayout2;
        this.l3 = str;
        this.l4 = poiDetailFoodHeaderAssem;
        this.s1 = poiDetailResponse;
        this.l5 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS6S2400000_18(String str, String str2, PoiSearchVM poiSearchVM, C19EG c19eg, PoiData poiData, EnumC1198680hIY enumC1198680hIY, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
        this.l2 = poiSearchVM;
        this.l3 = c19eg;
        this.l4 = poiData;
        this.l5 = enumC1198680hIY;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS6S2400000_18(String str, String str2, String str3, Map<String, EventModel> map, InterfaceC1181010gq3 interfaceC1181010gq3, PoiListApi.PoiMergedListResponse poiMergedListResponse, C0TT3 c0tt3) {
        super(1);
        this.$t = c0tt3;
        this.s0 = str;
        this.s1 = str2;
        this.l2 = str3;
        this.l3 = map;
        this.l4 = interfaceC1181010gq3;
        this.l5 = poiMergedListResponse;
    }
}
