package com.ss.android.ugc.aweme.pipo.cashier.common.model;

import X.C09CT;
import X.C13BV;
import X.C15438062q;
import X.C1709400uaI;
import X.C1710110ubR;
import X.C2097608Jq;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: loaded from: classes27.dex */
public final class PIPOPaymentOptionSource {
    public static final /* synthetic */ int LIZ = 0;

    @C09CT("all_po_areas")
    public final List<PIPOPaymentOptionArea> allPOAreas;

    @C09CT("key")
    public final String key;

    @C09CT("local_added_ccdc_pos")
    public List<PaymentOption> localAddedCCDCPOs;

    @C09CT("local_added_to_rec")
    public List<String> localAddedToRecPOs;

    @C09CT("pool")
    public final List<PaymentOption> pool;

    @C09CT("rec_po_areas")
    public final List<PIPOPaymentOptionArea> recPOAreas;

    public PIPOPaymentOptionSource() {
        this(null, null, null, null, null, null, 63, null);
    }

    public final PIPOPaymentOptionSource LIZIZ() {
        List<PaymentOption> list = this.pool;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<PaymentOption> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().LIZLLL());
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        List<PIPOPaymentOptionArea> list2 = this.recPOAreas;
        ArrayList arrayList5 = new ArrayList(C15438062q.LJIJJ(list2, 10));
        Iterator<PIPOPaymentOptionArea> it3 = list2.iterator();
        while (it3.hasNext()) {
            arrayList5.add(it3.next().LIZ());
        }
        ArrayList arrayList6 = new ArrayList(arrayList5);
        List<PIPOPaymentOptionArea> list3 = this.allPOAreas;
        ArrayList arrayList7 = new ArrayList(C15438062q.LJIJJ(list3, 10));
        Iterator<PIPOPaymentOptionArea> it4 = list3.iterator();
        while (it4.hasNext()) {
            arrayList7.add(it4.next().LIZ());
        }
        return LIZJ(this, arrayList2, arrayList3, arrayList4, arrayList6, new ArrayList(arrayList7), 1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PIPOPaymentOptionSource)) {
            return false;
        }
        PIPOPaymentOptionSource pIPOPaymentOptionSource = (PIPOPaymentOptionSource) obj;
        return Intrinsics.LJFF(this.key, pIPOPaymentOptionSource.key) && Intrinsics.LJFF(this.pool, pIPOPaymentOptionSource.pool) && Intrinsics.LJFF(this.localAddedCCDCPOs, pIPOPaymentOptionSource.localAddedCCDCPOs) && Intrinsics.LJFF(this.localAddedToRecPOs, pIPOPaymentOptionSource.localAddedToRecPOs) && Intrinsics.LJFF(this.recPOAreas, pIPOPaymentOptionSource.recPOAreas) && Intrinsics.LJFF(this.allPOAreas, pIPOPaymentOptionSource.allPOAreas);
    }

    public final int hashCode() {
        return (((((((((this.key.hashCode() * 31) + this.pool.hashCode()) * 31) + this.localAddedCCDCPOs.hashCode()) * 31) + this.localAddedToRecPOs.hashCode()) * 31) + this.recPOAreas.hashCode()) * 31) + this.allPOAreas.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PIPOPaymentOptionSource(key=");
        sbLIZ.append(this.key);
        sbLIZ.append(", pool=");
        sbLIZ.append(this.pool);
        sbLIZ.append(", localAddedCCDCPOs=");
        sbLIZ.append(this.localAddedCCDCPOs);
        sbLIZ.append(", localAddedToRecPOs=");
        sbLIZ.append(this.localAddedToRecPOs);
        sbLIZ.append(", recPOAreas=");
        sbLIZ.append(this.recPOAreas);
        sbLIZ.append(", allPOAreas=");
        sbLIZ.append(this.allPOAreas);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final PaymentOption LIZLLL(String str) {
        String str2;
        PaymentOption paymentOptionLJ = LJ(str);
        if (paymentOptionLJ == null || (str2 = paymentOptionLJ.parentKey) == null) {
            return null;
        }
        return LJ(str2);
    }

    public final PaymentOption LJ(String str) {
        PaymentOption paymentOption;
        PaymentOption next;
        Iterator<PaymentOption> it2 = this.pool.iterator();
        while (true) {
            paymentOption = null;
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.LIZ, str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        PaymentOption paymentOption2 = next;
        if (paymentOption2 == null) {
            Iterator<PaymentOption> it3 = this.localAddedCCDCPOs.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                PaymentOption next2 = it3.next();
                if (Intrinsics.LJFF(next2.LIZ, str)) {
                    paymentOption = next2;
                    break;
                }
            }
            return paymentOption;
        }
        return paymentOption2;
    }

    public static int LIZ(List list, Set set) {
        Iterator it2 = list.iterator();
        int i = 0;
        while (it2.hasNext()) {
            for (PaymentOption paymentOption : ((PIPOPaymentOptionArea) it2.next()).paymentOptions) {
                if (!set.contains(paymentOption.LIZ)) {
                    List<PaymentOption> list2 = paymentOption.LIZLLL;
                    if (list2 != null && !list2.isEmpty()) {
                        Iterator<PaymentOption> it3 = list2.iterator();
                        while (it3.hasNext()) {
                            if (set.contains(it3.next().LIZ)) {
                            }
                        }
                    }
                }
                i++;
            }
        }
        return i;
    }

    public final PaymentOption LJFF(String str, String str2) {
        PaymentOption next;
        Iterator<PaymentOption> it2 = this.pool.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                PaymentOption paymentOption = next;
                if (Intrinsics.LJFF(paymentOption.LJIL(), str) && Intrinsics.LJFF(paymentOption.LJJ(), str2)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        return next;
    }

    public final boolean LJII(String str, String str2) throws JSONException {
        PIPOPaymentOptionSource pIPOPaymentOptionSource;
        Iterator<PIPOPaymentOptionArea> it2 = this.recPOAreas.iterator();
        boolean z = false;
        while (true) {
            int i = 3;
            if (!it2.hasNext()) {
                break;
            }
            PIPOPaymentOptionArea next = it2.next();
            ArrayList arrayList = new ArrayList();
            for (PaymentOption paymentOption : next.paymentOptions) {
                boolean z2 = paymentOption.statusAttr.available;
                if (paymentOption.LJIJI()) {
                    String strValueOf = String.valueOf(z2);
                    String strValueOf2 = String.valueOf(paymentOption.statusAttr.available);
                    Pair[] pairArr = new Pair[i];
                    pairArr[0] = new Pair("sourceKey", C1710110ubR.LIZJ(this.key));
                    pairArr[1] = new Pair("poKey", C1710110ubR.LIZJ(paymentOption.LIZ));
                    pairArr[2] = new Pair("area", "rec");
                    C1710110ubR.LJII("normalize_unavailable_app_dependency", "app_dependency_unavailable", "payment_option_available", strValueOf, strValueOf2, C1709400uaI.LIZ(str2, C2097608Jq.LJIIIIZZ(pairArr)));
                    C1709400uaI.LIZJ(str, this.key);
                    z = true;
                } else {
                    arrayList.add(paymentOption);
                }
                i = 3;
            }
            if (next.paymentOptions.size() != arrayList.size()) {
                next.paymentOptions.clear();
                next.paymentOptions.addAll(arrayList);
            }
        }
        for (PIPOPaymentOptionArea pIPOPaymentOptionArea : this.allPOAreas) {
            String str3 = this.key;
            pIPOPaymentOptionArea.getClass();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            boolean z3 = false;
            for (PaymentOption paymentOption2 : pIPOPaymentOptionArea.paymentOptions) {
                boolean z4 = paymentOption2.statusAttr.available;
                if (paymentOption2.LJIJI()) {
                    C1710110ubR.LJII("normalize_unavailable_app_dependency", "app_dependency_unavailable", "payment_option_available", String.valueOf(z4), String.valueOf(paymentOption2.statusAttr.available), C1709400uaI.LIZ(str2, C2097608Jq.LJIIIIZZ(new Pair("sourceKey", C1710110ubR.LIZJ(str3)), new Pair("poKey", C1710110ubR.LIZJ(paymentOption2.LIZ)), new Pair("area", "all"))));
                    C1709400uaI.LIZJ(str, str3);
                    if (paymentOption2.LJJII()) {
                        arrayList3.add(paymentOption2);
                    }
                    z3 = true;
                } else {
                    arrayList2.add(paymentOption2);
                }
            }
            if (z3) {
                pIPOPaymentOptionArea.paymentOptions.clear();
                pIPOPaymentOptionArea.paymentOptions.addAll(arrayList2);
                pIPOPaymentOptionArea.paymentOptions.addAll(arrayList3);
                z = true;
            }
        }
        Iterator<PaymentOption> it3 = this.pool.iterator();
        while (it3.hasNext()) {
            PIPOPaymentOptionHybridInfo pIPOPaymentOptionHybridInfo = it3.next().LJ;
            if (pIPOPaymentOptionHybridInfo != null && (pIPOPaymentOptionSource = pIPOPaymentOptionHybridInfo.source) != null && pIPOPaymentOptionSource.LJII(str, str2)) {
                z = true;
            }
        }
        return z;
    }

    public PIPOPaymentOptionSource(String str, List<PaymentOption> list, List<PaymentOption> list2, List<String> list3, List<PIPOPaymentOptionArea> list4, List<PIPOPaymentOptionArea> list5) {
        this.key = str;
        this.pool = list;
        this.localAddedCCDCPOs = list2;
        this.localAddedToRecPOs = list3;
        this.recPOAreas = list4;
        this.allPOAreas = list5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00aa, code lost:
    
        if (r31 != false) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJI(java.lang.String r27, java.lang.String r28, java.lang.String r29, boolean r30, boolean r31, boolean r32) {
        /*
            Method dump skipped, instruction units count: 849
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.pipo.cashier.common.model.PIPOPaymentOptionSource.LJI(java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean):boolean");
    }

    public static PIPOPaymentOptionSource LIZJ(PIPOPaymentOptionSource pIPOPaymentOptionSource, List list, List list2, List list3, List list4, List list5, int i) {
        String str;
        List list6 = list5;
        List list7 = list4;
        List list8 = list3;
        List list9 = list2;
        List list10 = list;
        if ((i & 1) != 0) {
            str = pIPOPaymentOptionSource.key;
        } else {
            str = null;
        }
        if ((i & 2) != 0) {
            list10 = pIPOPaymentOptionSource.pool;
        }
        if ((i & 4) != 0) {
            list9 = pIPOPaymentOptionSource.localAddedCCDCPOs;
        }
        if ((i & 8) != 0) {
            list8 = pIPOPaymentOptionSource.localAddedToRecPOs;
        }
        if ((i & 16) != 0) {
            list7 = pIPOPaymentOptionSource.recPOAreas;
        }
        if ((i & 32) != 0) {
            list6 = pIPOPaymentOptionSource.allPOAreas;
        }
        pIPOPaymentOptionSource.getClass();
        return new PIPOPaymentOptionSource(str, list10, list9, list8, list7, list6);
    }

    public PIPOPaymentOptionSource(String str, List list, List list2, List list3, List list4, List list5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? C13BV.INSTANCE : list, (i & 4) != 0 ? new ArrayList() : list2, (i & 8) != 0 ? new ArrayList() : list3, (i & 16) != 0 ? new ArrayList() : list4, (i & 32) != 0 ? new ArrayList() : list5);
    }
}
