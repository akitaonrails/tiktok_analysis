package kotlin.jvm.internal;

import X.AbstractC738140SxQ;
import X.C098200Yq;
import X.C09AY;
import X.C13LP;
import X.C1708710uZB;
import X.C1708720uZC;
import X.C1710160ubW;
import X.C1755780vn6;
import X.C1755800vn8;
import X.C189200o6;
import X.C2188811AlT;
import X.C2197108jB;
import X.C723850SaN;
import X.EnumC1488970oql;
import X.EnumC1709680uak;
import X.InterfaceC0148002o;
import X.InterfaceC1179400gnS;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.header.BaseItemViewModel;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.PIPOPaymentMethod;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.CustomizedInfo;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.GroupInfo;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.PaymentMethodTips;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.SortItem;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes27.dex */
public class AwS89S1300000_26 extends C09AY implements Function0 {
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
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r23v0, types: [com.ss.android.ugc.aweme.pipo.cashier.common.model.po.POBindInfo] */
    /* JADX WARN: Type inference failed for: r24v0, types: [com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.CBIFlow] */
    /* JADX WARN: Type inference failed for: r27v0, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r31v0, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r32v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r33v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r34v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r39v0, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r45v0, types: [com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.CBIPaymentMethod] */
    /* JADX WARN: Type inference failed for: r46v0, types: [com.ss.android.ugc.aweme.pipo.cashier.common.model.PIPOPaymentOptionHybridInfo] */
    /* JADX WARN: Type inference failed for: r47v0, types: [com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.PricingPlan] */
    /* JADX WARN: Type inference failed for: r48v0, types: [com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.CBIMarketingInfo] */
    /* JADX WARN: Type inference failed for: r49v0, types: [java.util.List] */
    public static final Object invoke$0(AwS89S1300000_26 awS89S1300000_26) {
        String strLJJLIIIJ;
        EnumC1709680uak enumC1709680uak;
        EnumC1488970oql enumC1488970oql;
        Integer num;
        ArrayList arrayList = new ArrayList();
        GroupInfo groupInfo = (GroupInfo) awS89S1300000_26.l1;
        List<SortItem> list = groupInfo.sortList;
        if (list != null) {
            C1710160ubW c1710160ubW = (C1710160ubW) awS89S1300000_26.l2;
            EnumC1709680uak enumC1709680uak2 = (EnumC1709680uak) awS89S1300000_26.l3;
            String str = awS89S1300000_26.s0;
            Iterator<SortItem> it2 = list.iterator();
            while (it2.hasNext()) {
                c1710160ubW.LIZ(it2.next(), enumC1709680uak2, str, groupInfo.paymentMethodGroupCode, groupInfo.paymentMethodGroupType, new AwS605S0100000_26(arrayList, (ArrayList<PaymentOption>) 376));
            }
        }
        GroupInfo groupInfo2 = (GroupInfo) awS89S1300000_26.l1;
        String str2 = groupInfo2.paymentMethodGroupCode;
        String str3 = groupInfo2.paymentMethodGroupType;
        String str4 = groupInfo2.displayRawText;
        String str5 = groupInfo2.iconUrl;
        String str6 = groupInfo2.darkModeIconUrl;
        boolean z = groupInfo2.available;
        String str7 = null;
        try {
            List<PaymentMethodTips> list2 = groupInfo2.paymentMethodTips;
            if (list2 != null && !list2.isEmpty()) {
                List<PaymentMethodTips> list3 = groupInfo2.paymentMethodTips;
                ArrayList arrayList2 = new ArrayList();
                Iterator<PaymentMethodTips> it3 = list3.iterator();
                while (it3.hasNext()) {
                    String str8 = it3.next().tips;
                    if (str8 != null && (!a0.LJJJIL(str8))) {
                        arrayList2.add(str8);
                    }
                }
                str7 = null;
                strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList2, "\n", null, null, 0, null, null, 62);
            } else {
                strLJJLIIIJ = groupInfo2.unavailableRawText;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                strLJJLIIIJ = groupInfo2.unavailableRawText;
            } else {
                throw new C2197108jB();
            }
        }
        if (Intrinsics.LJFF(((GroupInfo) awS89S1300000_26.l1).paymentMethodGroupCode, "pm_pi_ccdc_all")) {
            enumC1709680uak = EnumC1709680uak.CCDC_GROUP;
        } else {
            enumC1709680uak = EnumC1709680uak.NORMAL_GROUP;
        }
        CustomizedInfo customizedInfo = ((C1710160ubW) awS89S1300000_26.l2).LJI;
        if (customizedInfo != null && (num = customizedInfo.ccdcBindType) != null && num.intValue() != 0 && num.intValue() == 1) {
            enumC1488970oql = EnumC1488970oql.REAL;
        } else {
            enumC1488970oql = EnumC1488970oql.FAKE;
        }
        PIPOPaymentMethod pIPOPaymentMethod = new PIPOPaymentMethod(awS89S1300000_26.s0, str7, str7, str7, str2, str3, str4, str5, str6, str7, str7, str7, str7, false, str7, z, Boolean.FALSE, str7, str7, str7, str7, str7, str7, str7, str7, strLJJLIIIJ, str7, Boolean.FALSE, str7, str7, enumC1709680uak, arrayList, str7, str7, str7, str7, str7, enumC1488970oql, str7);
        if (pIPOPaymentMethod.available && !pIPOPaymentMethod.LIZIZ()) {
            GroupInfo groupInfo3 = (GroupInfo) awS89S1300000_26.l1;
            C1708720uZC c1708720uZCLIZ = C1708710uZB.LIZ("Cashier");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("group not keep: ");
            sbLIZ.append(groupInfo3.available);
            c1708720uZCLIZ.LIZ(4, C2188811AlT.LIZIZ(sbLIZ));
            return str7;
        }
        C1710160ubW c1710160ubW2 = (C1710160ubW) awS89S1300000_26.l2;
        return pIPOPaymentMethod.LJFF(c1710160ubW2.LIZ, c1710160ubW2.LIZJ);
    }

    public static final Object invoke$1(AwS89S1300000_26 awS89S1300000_26) {
        AbstractC738140SxQ abstractC738140SxQ = ((C1755780vn6) awS89S1300000_26.l1).LIZ;
        C723850SaN.LIZJ(abstractC738140SxQ, new AwS384S0200000_18(abstractC738140SxQ, (InterfaceC1179400gnS) awS89S1300000_26.l2, 292));
        BaseItemViewModel<? extends InterfaceC0148002o> baseItemViewModelLIZIZ = ((InterfaceC1179400gnS) awS89S1300000_26.l2).LIZIZ(((C1755780vn6) awS89S1300000_26.l1).LIZ);
        C1755800vn8 c1755800vn8 = ((C1755780vn6) awS89S1300000_26.l1).LIZJ;
        c1755800vn8.LIZ.put(awS89S1300000_26.s0, new WeakReference<>(baseItemViewModelLIZIZ));
        baseItemViewModelLIZIZ.vQ2(awS89S1300000_26.l3);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS89S1300000_26(C1755780vn6 c1755780vn6, InterfaceC1179400gnS interfaceC1179400gnS, String str, Object obj, int i) {
        super(0);
        this.$t = i;
        this.l1 = c1755780vn6;
        this.l2 = interfaceC1179400gnS;
        this.s0 = str;
        this.l3 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS89S1300000_26(GroupInfo groupInfo, C1710160ubW c1710160ubW, String str, EnumC1709680uak enumC1709680uak, int i) {
        super(0);
        this.$t = i;
        this.l1 = groupInfo;
        this.l2 = c1710160ubW;
        this.s0 = str;
        this.l3 = enumC1709680uak;
    }
}
