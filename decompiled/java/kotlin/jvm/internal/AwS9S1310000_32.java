package kotlin.jvm.internal;

import X.AbstractC21194217wq;
import X.C09AY;
import X.C0NSL;
import X.C110600bQ;
import X.C2095008Iq;
import X.C21322518cR;
import X.C598410NdX;
import X.InterfaceC1540190qBN;
import com.bytedance.android.livesdk.model.message.ext.ECommerceMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.api.ProductListApi;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes33.dex */
public class AwS9S1310000_32 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;
    public boolean z4;

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

    public static final Object invoke$0(AwS9S1310000_32 awS9S1310000_32, Object obj) throws JSONException {
        String string;
        String string2;
        long id;
        Integer num;
        Long lLJIILIIL;
        String str;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        JSONObject jSONObjectLIZLLL = null;
        if (((AbstractC21194217wq) awS9S1310000_32.l1).LJJIL()) {
            ProductListApi productListApi = (ProductListApi) C0NSL.LIZ().create(ProductListApi.class);
            Room room = ((AbstractC21194217wq) awS9S1310000_32.l1).LLJILLL;
            if (room != null) {
                id = room.getId();
            } else {
                id = 0;
            }
            Long lLJIILIIL2 = C2095008Iq.LJIILIIL(AbstractC21194217wq.LJJIJ());
            Integer num2 = (Integer) awS9S1310000_32.l2;
            if (((num2 != null && num2.intValue() == 1) || ((num = (Integer) awS9S1310000_32.l2) != null && num.intValue() == 99)) && (str = awS9S1310000_32.s0) != null) {
                lLJIILIIL = C2095008Iq.LJIILIIL(str);
            } else {
                lLJIILIIL = null;
            }
            return new Pair(productListApi.getPopFromBroadcast(id, lLJIILIIL2, lLJIILIIL, null, null, null, null, null, null), null);
        }
        int iLJJIJL = ((AbstractC21194217wq) awS9S1310000_32.l1).LJJIJL(awS9S1310000_32.z4);
        Room room2 = ((AbstractC21194217wq) awS9S1310000_32.l1).LLJILLL;
        String str2 = "";
        if (room2 == null || (string = Long.valueOf(room2.getId()).toString()) == null) {
            string = "";
        }
        String strLJFF = C598410NdX.LJFF(string);
        ProductListApi productListApi2 = (ProductListApi) C0NSL.LIZ().create(ProductListApi.class);
        Room room3 = ((AbstractC21194217wq) awS9S1310000_32.l1).LLJILLL;
        if (room3 != null && (string2 = Long.valueOf(room3.getId()).toString()) != null) {
            str2 = string2;
        }
        String str3 = awS9S1310000_32.s0;
        String str4 = ((AbstractC21194217wq) awS9S1310000_32.l1).LLLFFI;
        Integer numValueOf = Integer.valueOf(iLJJIJL);
        ECommerceMessage eCommerceMessage = (ECommerceMessage) awS9S1310000_32.l3;
        if (eCommerceMessage != null) {
            C110600bQ.LIZ.getClass();
            jSONObjectLIZLLL = C110600bQ.LIZLLL(eCommerceMessage);
        }
        return new Pair(productListApi2.getIntroduceProductV2(strLJFF, str2, str3, 1, str4, numValueOf, jSONObjectLIZLLL, 1, zBooleanValue, null, null, null, 0, null, null, null), strLJFF);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x016e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AwS9S1310000_32 r14, java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS9S1310000_32.invoke$1(kotlin.jvm.internal.AwS9S1310000_32, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS9S1310000_32(C21322518cR c21322518cR, Function2 function2, String str, InterfaceC1540190qBN interfaceC1540190qBN, int i) {
        super(1);
        this.$t = i;
        this.l1 = c21322518cR;
        this.z4 = false;
        this.l2 = function2;
        this.s0 = str;
        this.l3 = interfaceC1540190qBN;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS9S1310000_32(AbstractC21194217wq abstractC21194217wq, Integer num, String str, boolean z, ECommerceMessage eCommerceMessage, int i) {
        super(1);
        this.$t = i;
        this.l1 = abstractC21194217wq;
        this.l2 = num;
        this.s0 = str;
        this.z4 = z;
        this.l3 = eCommerceMessage;
    }
}
