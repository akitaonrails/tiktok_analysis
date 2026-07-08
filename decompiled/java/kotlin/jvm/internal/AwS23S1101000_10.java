package kotlin.jvm.internal;

import X.C09AY;
import X.C957403oi;
import X.InterfaceC683840Qs2;
import com.ss.android.ugc.aweme.ecommerce.search.vision.PhotoSearchBaseVM;
import com.ss.android.ugc.aweme.ecommerce.search.vision.result.PhotoSearchResultFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class AwS23S1101000_10 extends C09AY implements Function1 {
    public final int $t;
    public int i2;
    public Object l1;
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

    public static final Object invoke$0(AwS23S1101000_10 awS23S1101000_10, Object obj) {
        C957403oi c957403oi = (C957403oi) obj;
        c957403oi.LIZLLL("log_id", ((InterfaceC683840Qs2) awS23S1101000_10.l1).getSearchlogId());
        c957403oi.LIZLLL("search_entrance", ((InterfaceC683840Qs2) awS23S1101000_10.l1).getSearchEntrance());
        c957403oi.LIZLLL("search_position", ((InterfaceC683840Qs2) awS23S1101000_10.l1).getSearchPosition());
        c957403oi.LIZLLL("action_type", "long_press_feedback");
        c957403oi.LIZLLL("text_type", "recom_search_feedback");
        c957403oi.LIZLLL("answer_id", Integer.valueOf(awS23S1101000_10.i2));
        c957403oi.LIZLLL("group_id", ((InterfaceC683840Qs2) awS23S1101000_10.l1).getWordGroupId());
        c957403oi.LIZLLL("words_content", ((InterfaceC683840Qs2) awS23S1101000_10.l1).getWordContent());
        c957403oi.LIZLLL("impr_id", awS23S1101000_10.s0);
        String productId = ((InterfaceC683840Qs2) awS23S1101000_10.l1).getProductId();
        if (productId != null) {
            c957403oi.LIZLLL("product_id", productId);
        }
        String userId = ((InterfaceC683840Qs2) awS23S1101000_10.l1).getUserId();
        if (userId != null) {
            c957403oi.LIZLLL("user_id", userId);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS23S1101000_10 awS23S1101000_10, Object obj) throws JSONException {
        String strXQ2;
        JSONObject jSONObject = (JSONObject) obj;
        jSONObject.put("words_source", "photo_search");
        jSONObject.put("words_position", awS23S1101000_10.i2);
        jSONObject.put("entity_coord", awS23S1101000_10.s0);
        jSONObject.put("is_user_add", 0);
        PhotoSearchBaseVM photoSearchBaseVM = ((PhotoSearchResultFragment) awS23S1101000_10.l1).LLIZ;
        String str = null;
        if (photoSearchBaseVM != null) {
            strXQ2 = photoSearchBaseVM.xQ2(null);
        } else {
            strXQ2 = null;
        }
        jSONObject.put("raw_pic", strXQ2);
        PhotoSearchBaseVM photoSearchBaseVM2 = ((PhotoSearchResultFragment) awS23S1101000_10.l1).LLIZ;
        if (photoSearchBaseVM2 != null) {
            str = photoSearchBaseVM2.LLJJIJI;
        }
        jSONObject.put("first_photo_search_id", str);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS23S1101000_10(int i, String str, PhotoSearchResultFragment photoSearchResultFragment, int i2) {
        super(1);
        this.$t = i2;
        this.i2 = i;
        this.s0 = str;
        this.l1 = photoSearchResultFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS23S1101000_10(InterfaceC683840Qs2 interfaceC683840Qs2, int i, String str, int i2) {
        super(1);
        this.$t = i2;
        this.l1 = interfaceC683840Qs2;
        this.i2 = i;
        this.s0 = str;
    }
}
