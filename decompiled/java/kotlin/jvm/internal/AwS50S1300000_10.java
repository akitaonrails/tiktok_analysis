package kotlin.jvm.internal;

import X.C09AY;
import X.C0PQW;
import X.C1202104n5;
import X.C676180Qfg;
import X.EnumC645610PTz;
import com.ss.android.ugc.aweme.ecommerce.search.vision.PhotoSearchBaseVM;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchBusinessEnterParams;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchEnterParams;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchLogEnterParams;
import com.ss.android.ugc.aweme.vision.model.ProductCard;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class AwS50S1300000_10 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
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

    public static final Object invoke$0(AwS50S1300000_10 awS50S1300000_10, Object obj) throws JSONException {
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
        jSONObject.put("words_position", ((Integer) awS50S1300000_10.l1).intValue());
        ProductCard productCard = (ProductCard) awS50S1300000_10.l2;
        String str7 = null;
        if (productCard != null) {
            str = productCard.productId;
        } else {
            str = null;
        }
        jSONObject.put("enter_product_id", str);
        jSONObject.put("is_user_add", 0);
        ProductCard productCard2 = (ProductCard) awS50S1300000_10.l2;
        if (productCard2 != null) {
            str2 = productCard2.url;
        } else {
            str2 = null;
        }
        jSONObject.put("raw_pic", str2);
        jSONObject.put("click_type", awS50S1300000_10.s0);
        PhotoSearchBaseVM photoSearchBaseVM = ((C676180Qfg) awS50S1300000_10.l3).LLILLJJLI;
        if (photoSearchBaseVM != null) {
            str3 = photoSearchBaseVM.LLJJIII;
        } else {
            str3 = null;
        }
        jSONObject.put("search_id", str3);
        PhotoSearchBaseVM photoSearchBaseVM2 = ((C676180Qfg) awS50S1300000_10.l3).LLILLJJLI;
        if (photoSearchBaseVM2 != null && (photoSearchEnterParams4 = photoSearchBaseVM2.LLILLL) != null && (photoSearchLogEnterParams3 = photoSearchEnterParams4.logParams) != null) {
            str4 = photoSearchLogEnterParams3.searchEntrance;
        } else {
            str4 = null;
        }
        jSONObject.put("search_entrance", str4);
        PhotoSearchBaseVM photoSearchBaseVM3 = ((C676180Qfg) awS50S1300000_10.l3).LLILLJJLI;
        if (photoSearchBaseVM3 != null && (photoSearchEnterParams3 = photoSearchBaseVM3.LLILLL) != null && (photoSearchBusinessEnterParams = photoSearchEnterParams3.businessParams) != null) {
            str5 = photoSearchBusinessEnterParams.enterFrom;
        } else {
            str5 = null;
        }
        jSONObject.put("enter_from", str5);
        PhotoSearchBaseVM photoSearchBaseVM4 = ((C676180Qfg) awS50S1300000_10.l3).LLILLJJLI;
        if (photoSearchBaseVM4 != null && (photoSearchEnterParams2 = photoSearchBaseVM4.LLILLL) != null && (photoSearchLogEnterParams2 = photoSearchEnterParams2.logParams) != null) {
            str6 = photoSearchLogEnterParams2.sourcePageName;
        } else {
            str6 = null;
        }
        jSONObject.put("source_page_name", str6);
        PhotoSearchBaseVM photoSearchBaseVM5 = ((C676180Qfg) awS50S1300000_10.l3).LLILLJJLI;
        if (photoSearchBaseVM5 != null && (photoSearchEnterParams = photoSearchBaseVM5.LLILLL) != null && (photoSearchLogEnterParams = photoSearchEnterParams.logParams) != null) {
            str7 = photoSearchLogEnterParams.photoSearchModule;
        }
        jSONObject.put("photo_search_module", str7);
        jSONObject.put("search_type", "photo_search");
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS50S1300000_10 awS50S1300000_10, Object obj) {
        if (((Boolean) ((Function0) awS50S1300000_10.l1).invoke()).booleanValue()) {
            ((C0PQW) awS50S1300000_10.l2).LIZLLL().postValue(obj);
        } else {
            C1202104n5.LIZ().LJJ((EnumC645610PTz) awS50S1300000_10.l3, awS50S1300000_10.s0, "networkFail", "checkPostCondition failed", Boolean.TRUE);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS50S1300000_10(Integer num, ProductCard productCard, C676180Qfg c676180Qfg, int i) {
        super(1);
        this.$t = i;
        this.l1 = num;
        this.l2 = productCard;
        this.s0 = "frame";
        this.l3 = c676180Qfg;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS50S1300000_10(AwS150S0101000_10 awS150S0101000_10, C0PQW c0pqw, EnumC645610PTz enumC645610PTz, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = awS150S0101000_10;
        this.l2 = c0pqw;
        this.l3 = enumC645610PTz;
        this.s0 = str;
    }
}
