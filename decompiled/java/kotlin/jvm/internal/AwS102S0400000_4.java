package kotlin.jvm.internal;

import X.C020W;
import X.C09AY;
import X.C0PEM;
import X.C118300cf;
import X.C11NZ;
import X.C11O8;
import X.C11S5;
import X.C1239300iM4;
import X.C1701940uOG;
import X.C1948507kB;
import X.C2188811AlT;
import X.C2296808zG;
import X.C23250099c;
import X.C333510D5p;
import X.C344660DfE;
import android.content.Context;
import com.bytedance.ies.ugc.aweme.rich.model.CommonAdData;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.UcpServiceImpl;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAddressService;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.tiktok.tns.userrelation.block.api.BlockManager;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.MatchResult;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes5.dex */
public class AwS102S0400000_4 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

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

    public static final Object invoke$0(AwS102S0400000_4 awS102S0400000_4, Object obj) {
        C11NZ<BaseResponse> c11nzLIZ;
        C11O8 c11o8LJJJLZIJ;
        C344660DfE c344660DfE = BlockManager.LIZ;
        String uid = ((User) awS102S0400000_4.l0).getUid();
        if (uid == null) {
            uid = "";
        }
        c344660DfE.getClass();
        BlockManager blockManager = C344660DfE.LIZIZ;
        if (blockManager != null && (c11nzLIZ = blockManager.LIZ(uid)) != null && (c11o8LJJJLZIJ = c11nzLIZ.LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ())) != null) {
            C1239300iM4.LJ(c11o8LJJJLZIJ, new C020W((Context) awS102S0400000_4.l2, (Function1) awS102S0400000_4.l1, 50), C1239300iM4.LIZJ, new C020W((Context) awS102S0400000_4.l2, (Context) awS102S0400000_4.l3, (Function0<Unit>) 51));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS102S0400000_4 awS102S0400000_4, Object obj) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C333510D5p(((Boolean) obj).booleanValue(), (UcpServiceImpl) awS102S0400000_4.l0, (CommonAdData) awS102S0400000_4.l1, (Function1) awS102S0400000_4.l2, (IECommerceAddressService) awS102S0400000_4.l3, null), 3);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS102S0400000_4 awS102S0400000_4, Object obj) {
        String value;
        String value2 = ((MatchResult) obj).getValue();
        int length = 0;
        String value3 = null;
        MatchResult matchResultFind$default = Regex.find$default(new Regex("(?<=\\()(.+?)(?=\\))"), value2, 0, 2, null);
        if (matchResultFind$default != null) {
            value = matchResultFind$default.getValue();
        } else {
            value = null;
        }
        MatchResult matchResultFind$default2 = Regex.find$default(new Regex("(?<=\\[)(.+?)(?=\\])"), value2, 0, 2, null);
        if (matchResultFind$default2 != null) {
            value3 = matchResultFind$default2.getValue();
        }
        if (C1948507kB.LIZ(value3) && C1948507kB.LIZ(value)) {
            ((HashMap) awS102S0400000_4.l0).put(String.valueOf(value3), value);
            HashMap map = (HashMap) awS102S0400000_4.l1;
            String strValueOf = String.valueOf(value3);
            StringBuilder sb = (StringBuilder) awS102S0400000_4.l2;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('[');
            sbLIZ.append(value3);
            sbLIZ.append(']');
            map.put(strValueOf, Integer.valueOf(sb.indexOf(C2188811AlT.LIZIZ(sbLIZ)) - ((C118300cf) awS102S0400000_4.l3).element));
            C118300cf c118300cf = (C118300cf) awS102S0400000_4.l3;
            int i = c118300cf.element;
            if (C1948507kB.LIZ(value)) {
                length = value.length();
            }
            c118300cf.element = i + length + 4;
        }
        return String.valueOf(value3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS102S0400000_4(UcpServiceImpl ucpServiceImpl, AwemeRawAd awemeRawAd, AwS89S1200000_4 awS89S1200000_4, IECommerceAddressService iECommerceAddressService, int i) {
        super(1);
        this.$t = i;
        this.l0 = ucpServiceImpl;
        this.l1 = awemeRawAd;
        this.l2 = awS89S1200000_4;
        this.l3 = iECommerceAddressService;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS102S0400000_4(User user, User user2, Function1<? super Throwable, Unit> function1, Context context, Function0<Unit> function0) {
        super(1);
        this.$t = function0;
        this.l0 = user;
        this.l1 = user2;
        this.l2 = function1;
        this.l3 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS102S0400000_4(HashMap map, HashMap<String, String> map2, HashMap<String, Integer> map3, StringBuilder sb, C118300cf c118300cf) {
        super(1);
        this.$t = c118300cf;
        this.l0 = map;
        this.l1 = map2;
        this.l2 = map3;
        this.l3 = sb;
    }
}
