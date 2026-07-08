package kotlin.jvm.internal;

import X.AbstractC642490PHz;
import X.C09AY;
import X.C0P7A;
import X.C0R0K;
import X.C0R0L;
import X.C13LE;
import X.C13LP;
import X.C640970PCd;
import X.C642240PHa;
import X.C642440PHu;
import X.C642570PIh;
import X.C676180Qfg;
import X.InterfaceC1858000yRy;
import X.InterfaceC660500PvU;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.tasm.behavior.ui.view.UIComponent;
import com.ss.android.ugc.aweme.ecommerce.search.result.ISearchResultSubPageAbility;
import com.ss.android.ugc.aweme.ecommerce.search.result.tab.ECSearchLynxFilterAssem;
import com.ss.android.ugc.aweme.ecommerce.search.vision.PhotoSearchBaseVM;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem.SearchVideoBottomAnchorManagerAssem;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchBusinessEnterParams;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchEnterParams;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchLogEnterParams;
import com.ss.android.ugc.aweme.vision.model.ProductCard;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class AwS96S0201000_10 extends C09AY implements Function1 {
    public final int $t;
    public int i2;
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
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS96S0201000_10 awS96S0201000_10, Object obj) {
        ((ECSearchLynxFilterAssem) awS96S0201000_10.l0).ip((ISearchResultSubPageAbility) awS96S0201000_10.l1, awS96S0201000_10.i2, ((Number) obj).intValue());
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS96S0201000_10 awS96S0201000_10, Object obj) {
        Function0 function0 = (Function0) obj;
        C0R0L c0r0l = (C0R0L) awS96S0201000_10.l0;
        int i = awS96S0201000_10.i2;
        JavaOnlyArray javaOnlyArray = c0r0l.LLJLL.LJIJ;
        if (javaOnlyArray != null && javaOnlyArray.contains(Integer.valueOf(i))) {
            if (((UIComponent) awS96S0201000_10.l1).getWidth() != 0) {
                C0R0K c0r0k = ((C0R0L) awS96S0201000_10.l0).LLJLL;
                if (!c0r0k.LJJI) {
                    c0r0k.LJIL = ((UIComponent) awS96S0201000_10.l1).getWidth();
                    ((UIComponent) awS96S0201000_10.l1).setWidth(0);
                    ((C0R0L) awS96S0201000_10.l0).LLJLL.LJJI = true;
                    function0.invoke();
                    return Boolean.FALSE;
                }
            }
            return Boolean.TRUE;
        }
        function0.invoke();
        return Boolean.TRUE;
    }

    public static final Object invoke$2(AwS96S0201000_10 awS96S0201000_10, Object obj) throws JSONException {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        PhotoSearchEnterParams photoSearchEnterParams;
        PhotoSearchLogEnterParams photoSearchLogEnterParams;
        PhotoSearchEnterParams photoSearchEnterParams2;
        PhotoSearchLogEnterParams photoSearchLogEnterParams2;
        PhotoSearchEnterParams photoSearchEnterParams3;
        PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams;
        PhotoSearchEnterParams photoSearchEnterParams4;
        PhotoSearchLogEnterParams photoSearchLogEnterParams3;
        JSONObject jSONObject = (JSONObject) obj;
        jSONObject.put("words_source", "photo_search");
        jSONObject.put("words_position", awS96S0201000_10.i2);
        jSONObject.put("is_user_add", 0);
        ProductCard productCard = (ProductCard) awS96S0201000_10.l0;
        String str7 = null;
        if (productCard != null) {
            str = productCard.productId;
        } else {
            str = null;
        }
        jSONObject.put("enter_product_id", str);
        ProductCard productCard2 = (ProductCard) awS96S0201000_10.l0;
        if (productCard2 != null) {
            str2 = productCard2.url;
        } else {
            str2 = null;
        }
        jSONObject.put("raw_pic", str2);
        PhotoSearchBaseVM photoSearchBaseVM = ((C676180Qfg) awS96S0201000_10.l1).LLILLJJLI;
        if (photoSearchBaseVM != null) {
            str3 = photoSearchBaseVM.LLJJIII;
        } else {
            str3 = null;
        }
        jSONObject.put("search_id", str3);
        PhotoSearchBaseVM photoSearchBaseVM2 = ((C676180Qfg) awS96S0201000_10.l1).LLILLJJLI;
        if (photoSearchBaseVM2 != null && (photoSearchEnterParams4 = photoSearchBaseVM2.LLILLL) != null && (photoSearchLogEnterParams3 = photoSearchEnterParams4.logParams) != null) {
            str4 = photoSearchLogEnterParams3.searchEntrance;
        } else {
            str4 = null;
        }
        jSONObject.put("search_entrance", str4);
        PhotoSearchBaseVM photoSearchBaseVM3 = ((C676180Qfg) awS96S0201000_10.l1).LLILLJJLI;
        if (photoSearchBaseVM3 != null && (photoSearchEnterParams3 = photoSearchBaseVM3.LLILLL) != null && (photoSearchBusinessEnterParams = photoSearchEnterParams3.businessParams) != null) {
            str5 = photoSearchBusinessEnterParams.enterFrom;
        } else {
            str5 = null;
        }
        jSONObject.put("enter_from", str5);
        PhotoSearchBaseVM photoSearchBaseVM4 = ((C676180Qfg) awS96S0201000_10.l1).LLILLJJLI;
        if (photoSearchBaseVM4 != null && (photoSearchEnterParams2 = photoSearchBaseVM4.LLILLL) != null && (photoSearchLogEnterParams2 = photoSearchEnterParams2.logParams) != null) {
            str6 = photoSearchLogEnterParams2.sourcePageName;
        } else {
            str6 = null;
        }
        jSONObject.put("source_page_name", str6);
        PhotoSearchBaseVM photoSearchBaseVM5 = ((C676180Qfg) awS96S0201000_10.l1).LLILLJJLI;
        if (photoSearchBaseVM5 != null && (photoSearchEnterParams = photoSearchBaseVM5.LLILLL) != null && (photoSearchLogEnterParams = photoSearchEnterParams.logParams) != null) {
            str7 = photoSearchLogEnterParams.photoSearchModule;
        }
        jSONObject.put("photo_search_module", str7);
        jSONObject.put("search_type", "photo_search");
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x01ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$3(kotlin.jvm.internal.AwS96S0201000_10 r11, java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 437
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS96S0201000_10.invoke$3(kotlin.jvm.internal.AwS96S0201000_10, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$4(AwS96S0201000_10 awS96S0201000_10, Object obj) {
        C642440PHu c642440PHu = (C642440PHu) obj;
        C642570PIh c642570PIh = (C642570PIh) C13LP.LJJJLZIJ(awS96S0201000_10.i2, ((AbstractC642490PHz) awS96S0201000_10.l0).LIZ((InterfaceC1858000yRy) awS96S0201000_10.l1));
        if (c642570PIh != 0) {
            AbstractC642490PHz abstractC642490PHz = (AbstractC642490PHz) awS96S0201000_10.l0;
            abstractC642490PHz.getClass();
            new AwS376S0200000_10(c642570PIh, (C642570PIh) abstractC642490PHz, (AbstractC642490PHz<InterfaceC1858000yRy>) 70).invoke(c642440PHu);
            if (c642570PIh instanceof C642240PHa) {
                c642440PHu.LJFF = (C642240PHa) c642570PIh;
            }
            C0P7A c0p7a = c642440PHu.LIZIZ.LJIIIZ;
            String str = c642440PHu.LIZLLL;
            C640970PCd c640970PCd = c0p7a.LIZ.get(C13LE.LIZ(C642570PIh.class));
            if (c640970PCd == null) {
                c640970PCd = new C640970PCd();
                c0p7a.LIZ.put(C13LE.LIZ(C642570PIh.class), c640970PCd);
            }
            HashMap<String, Object> map = c640970PCd.LIZ;
            if (map != null) {
                map.put(str, c642570PIh);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS96S0201000_10(int i, ProductCard productCard, C676180Qfg c676180Qfg, int i2) {
        super(1);
        this.$t = i2;
        this.i2 = i;
        this.l0 = productCard;
        this.l1 = c676180Qfg;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS96S0201000_10(AbstractC642490PHz abstractC642490PHz, AbstractC642490PHz<InterfaceC1858000yRy> abstractC642490PHz2, InterfaceC1858000yRy interfaceC1858000yRy, int i) {
        super(1);
        this.$t = i;
        this.l0 = abstractC642490PHz;
        this.l1 = abstractC642490PHz2;
        this.i2 = interfaceC1858000yRy;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS96S0201000_10(InterfaceC660500PvU interfaceC660500PvU, SearchVideoBottomAnchorManagerAssem searchVideoBottomAnchorManagerAssem, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = interfaceC660500PvU;
        this.l1 = searchVideoBottomAnchorManagerAssem;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS96S0201000_10(C0R0L c0r0l, int i, UIComponent uIComponent, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c0r0l;
        this.i2 = i;
        this.l1 = uIComponent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS96S0201000_10(ECSearchLynxFilterAssem eCSearchLynxFilterAssem, ISearchResultSubPageAbility iSearchResultSubPageAbility, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = eCSearchLynxFilterAssem;
        this.l1 = iSearchResultSubPageAbility;
        this.i2 = i;
    }
}
