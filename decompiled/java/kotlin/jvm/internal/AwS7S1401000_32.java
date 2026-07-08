package kotlin.jvm.internal;

import X.AbstractC21194117wp;
import X.AbstractC21194217wq;
import X.AbstractC21196217xA;
import X.AbstractC21196817xG;
import X.C09AY;
import X.C0NSL;
import X.C110400bO;
import X.C110600bQ;
import X.C1563990qnl;
import X.C21183117v3;
import X.C598410NdX;
import com.bytedance.android.livesdk.model.message.ext.ECommerceMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.api.UsProductListApi;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.vo.UsPopupCardVO;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.api.ProductListApi;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;
import webcast.data.oec_msg.PopCardInfo;
import webcast.data.oec_msg.VoucherItem;

/* JADX INFO: loaded from: classes33.dex */
public class AwS7S1401000_32 extends C09AY implements Function1 {
    public final int $t;
    public int i5;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
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

    public static final Object invoke$0(AwS7S1401000_32 awS7S1401000_32, Object obj) {
        Long lValueOf;
        Long lValueOf2;
        JSONObject jSONObjectLIZLLL;
        String str;
        long id;
        String str2;
        Long lValueOf3;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        AbstractC21194117wp abstractC21194117wp = ((AbstractC21196817xG) awS7S1401000_32.l1).LIZ;
        if (abstractC21194117wp.LLLFZ) {
            UsProductListApi usProductListApi = (UsProductListApi) C0NSL.LIZ().create(UsProductListApi.class);
            Room room = ((AbstractC21196817xG) awS7S1401000_32.l1).LIZ.LLJILLL;
            if (room != null) {
                id = room.getId();
            } else {
                id = 0;
            }
            Long lValueOf4 = Long.valueOf(CastLongProtector.parseLong(AbstractC21194117wp.LJJIJ()));
            int i = ((PopCardInfo) awS7S1401000_32.l2).popCardType;
            if ((i == 1 || i == 99) && (str2 = awS7S1401000_32.s0) != null) {
                lValueOf3 = Long.valueOf(CastLongProtector.parseLong(str2));
            } else {
                lValueOf3 = null;
            }
            return new Pair(usProductListApi.getPopFromBroadcast(id, lValueOf4, lValueOf3), null);
        }
        Room room2 = abstractC21194117wp.LLJILLL;
        if (room2 != null) {
            lValueOf = Long.valueOf(room2.getId());
        } else {
            lValueOf = null;
        }
        String strLJFF = C598410NdX.LJFF(String.valueOf(lValueOf));
        UsProductListApi usProductListApi2 = (UsProductListApi) C0NSL.LIZ().create(UsProductListApi.class);
        Room room3 = ((AbstractC21196817xG) awS7S1401000_32.l1).LIZ.LLJILLL;
        if (room3 != null) {
            lValueOf2 = Long.valueOf(room3.getId());
        } else {
            lValueOf2 = null;
        }
        String strValueOf = String.valueOf(lValueOf2);
        String str3 = awS7S1401000_32.s0;
        Integer numValueOf = Integer.valueOf(((PopCardInfo) awS7S1401000_32.l2).popCardType);
        String str4 = ((AbstractC21196817xG) awS7S1401000_32.l1).LIZ.LLLF;
        Integer numValueOf2 = Integer.valueOf(awS7S1401000_32.i5);
        ECommerceMessage eCommerceMessage = (ECommerceMessage) awS7S1401000_32.l3;
        if (eCommerceMessage != null) {
            C110400bO.LIZ.getClass();
            jSONObjectLIZLLL = C110400bO.LIZLLL(eCommerceMessage);
        } else {
            jSONObjectLIZLLL = null;
        }
        C1563990qnl c1563990qnl = (C1563990qnl) awS7S1401000_32.l4;
        UsPopupCardVO usPopupCardVO = ((AbstractC21196817xG) awS7S1401000_32.l1).LIZ.LJJIJIIJI().LL;
        if (usPopupCardVO != null) {
            str = usPopupCardVO.popMsgCtxStr;
        } else {
            str = null;
        }
        return new Pair(usProductListApi2.getIntroduceProductV2(strLJFF, strValueOf, str3, numValueOf, 1, str4, numValueOf2, jSONObjectLIZLLL, 1, zBooleanValue, 0, C21183117v3.LIZJ(c1563990qnl, str, null)), strLJFF);
    }

    public static final Object invoke$1(AwS7S1401000_32 awS7S1401000_32, Object obj) throws JSONException {
        Long lValueOf;
        Long lValueOf2;
        String str;
        JSONObject jSONObjectLIZLLL;
        Long lValueOf3;
        Long lValueOf4;
        Integer numValueOf;
        Integer numValueOf2;
        String str2;
        VoucherItem voucherItem;
        long id;
        Long lValueOf5;
        Long lValueOf6;
        Long lValueOf7;
        Integer numValueOf3;
        Integer numValueOf4;
        String str3;
        String str4;
        VoucherItem voucherItem2;
        String str5;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        AbstractC21194217wq abstractC21194217wq = ((AbstractC21196217xA) awS7S1401000_32.l1).LIZ;
        String str6 = null;
        if (abstractC21194217wq.LLLII) {
            ProductListApi productListApi = (ProductListApi) C0NSL.LIZ().create(ProductListApi.class);
            Room room = ((AbstractC21196217xA) awS7S1401000_32.l1).LIZ.LLJILLL;
            if (room != null) {
                id = room.getId();
            } else {
                id = 0;
            }
            Long lValueOf8 = Long.valueOf(CastLongProtector.parseLong(AbstractC21194217wq.LJJIJ()));
            if (((PopCardInfo) awS7S1401000_32.l2).popCardType == 1 && (str5 = awS7S1401000_32.s0) != null) {
                lValueOf5 = Long.valueOf(CastLongProtector.parseLong(str5));
            } else {
                lValueOf5 = null;
            }
            if (((PopCardInfo) awS7S1401000_32.l2).popCardType == 3 && (voucherItem2 = (VoucherItem) awS7S1401000_32.l3) != null) {
                lValueOf6 = Long.valueOf(voucherItem2.voucherTypeId);
            } else {
                lValueOf6 = null;
            }
            VoucherItem voucherItem3 = (VoucherItem) awS7S1401000_32.l3;
            if (voucherItem3 != null) {
                lValueOf7 = Long.valueOf(voucherItem3.taskId);
            } else {
                lValueOf7 = null;
            }
            VoucherItem voucherItem4 = (VoucherItem) awS7S1401000_32.l3;
            if (voucherItem4 != null) {
                numValueOf3 = Integer.valueOf(voucherItem4.taskType);
            } else {
                numValueOf3 = null;
            }
            VoucherItem voucherItem5 = (VoucherItem) awS7S1401000_32.l3;
            if (voucherItem5 != null) {
                numValueOf4 = Integer.valueOf(voucherItem5.liveVoucherType);
            } else {
                numValueOf4 = null;
            }
            VoucherItem voucherItem6 = (VoucherItem) awS7S1401000_32.l3;
            if (voucherItem6 != null) {
                str3 = voucherItem6.creatorOperationUniqueId;
                str4 = voucherItem6.voucherMaxFaceValue;
            } else {
                str3 = null;
                str4 = null;
            }
            return new Pair(productListApi.getPopFromBroadcast(id, lValueOf8, lValueOf5, lValueOf6, lValueOf7, numValueOf3, numValueOf4, str3, str4), null);
        }
        Room room2 = abstractC21194217wq.LLJILLL;
        if (room2 != null) {
            lValueOf = Long.valueOf(room2.getId());
        } else {
            lValueOf = null;
        }
        String strLJFF = C598410NdX.LJFF(String.valueOf(lValueOf));
        ProductListApi productListApi2 = (ProductListApi) C0NSL.LIZ().create(ProductListApi.class);
        Room room3 = ((AbstractC21196217xA) awS7S1401000_32.l1).LIZ.LLJILLL;
        if (room3 != null) {
            lValueOf2 = Long.valueOf(room3.getId());
        } else {
            lValueOf2 = null;
        }
        String strValueOf = String.valueOf(lValueOf2);
        if (((PopCardInfo) awS7S1401000_32.l2).popCardType == 1) {
            str = awS7S1401000_32.s0;
        } else {
            str = null;
        }
        String str7 = ((AbstractC21196217xA) awS7S1401000_32.l1).LIZ.LLLFFI;
        Integer numValueOf5 = Integer.valueOf(awS7S1401000_32.i5);
        ECommerceMessage eCommerceMessage = (ECommerceMessage) awS7S1401000_32.l4;
        if (eCommerceMessage != null) {
            C110600bQ.LIZ.getClass();
            jSONObjectLIZLLL = C110600bQ.LIZLLL(eCommerceMessage);
        } else {
            jSONObjectLIZLLL = null;
        }
        if (((PopCardInfo) awS7S1401000_32.l2).popCardType == 3 && (voucherItem = (VoucherItem) awS7S1401000_32.l3) != null) {
            lValueOf3 = Long.valueOf(voucherItem.voucherTypeId);
        } else {
            lValueOf3 = null;
        }
        VoucherItem voucherItem7 = (VoucherItem) awS7S1401000_32.l3;
        if (voucherItem7 != null) {
            lValueOf4 = Long.valueOf(voucherItem7.taskId);
        } else {
            lValueOf4 = null;
        }
        VoucherItem voucherItem8 = (VoucherItem) awS7S1401000_32.l3;
        if (voucherItem8 != null) {
            numValueOf = Integer.valueOf(voucherItem8.taskType);
        } else {
            numValueOf = null;
        }
        VoucherItem voucherItem9 = (VoucherItem) awS7S1401000_32.l3;
        if (voucherItem9 != null) {
            numValueOf2 = Integer.valueOf(voucherItem9.liveVoucherType);
        } else {
            numValueOf2 = null;
        }
        VoucherItem voucherItem10 = (VoucherItem) awS7S1401000_32.l3;
        if (voucherItem10 != null) {
            str6 = voucherItem10.creatorOperationUniqueId;
            str2 = voucherItem10.voucherMaxFaceValue;
        } else {
            str2 = null;
        }
        return new Pair(productListApi2.getIntroduceProductV2(strLJFF, strValueOf, str, 1, str7, numValueOf5, jSONObjectLIZLLL, 1, zBooleanValue, lValueOf3, lValueOf4, numValueOf, 0, numValueOf2, str6, str2), strLJFF);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS7S1401000_32(AbstractC21196217xA abstractC21196217xA, PopCardInfo popCardInfo, String str, VoucherItem voucherItem, int i, ECommerceMessage eCommerceMessage, int i2) {
        super(1);
        this.$t = i2;
        this.l1 = abstractC21196217xA;
        this.l2 = popCardInfo;
        this.s0 = str;
        this.l3 = voucherItem;
        this.i5 = i;
        this.l4 = eCommerceMessage;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS7S1401000_32(AbstractC21196817xG abstractC21196817xG, PopCardInfo popCardInfo, String str, int i, ECommerceMessage eCommerceMessage, C1563990qnl c1563990qnl, int i2) {
        super(1);
        this.$t = i2;
        this.l1 = abstractC21196817xG;
        this.l2 = popCardInfo;
        this.s0 = str;
        this.i5 = i;
        this.l3 = eCommerceMessage;
        this.l4 = c1563990qnl;
    }
}
