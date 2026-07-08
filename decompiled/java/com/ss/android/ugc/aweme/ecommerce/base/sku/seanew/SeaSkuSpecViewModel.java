package com.ss.android.ugc.aweme.ecommerce.base.sku.seanew;

import X.C04AW;
import X.C1012603xc;
import X.C13LP;
import X.C15438062q;
import X.C1697810uHb;
import X.C1761780vwm;
import X.C1763810w03;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C908703gr;
import X.C936903lP;
import X.C937103lR;
import X.C968903qZ;
import X.DialogC1761330vw3;
import X.InterfaceC0148002o;
import X.InterfaceC1761400vwA;
import X.InterfaceC1763870w09;
import android.content.Context;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductUnavailableInfo;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropTag;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropValue;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuCommonConfig;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.AwS62S1300000_26;
import kotlin.jvm.internal.AwS89S0110000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SeaSkuSpecViewModel extends AssemViewModel<C936903lP> {
    public boolean LL;
    public List<SkuItem> LLILLJJLI;
    public int LLILLL;
    public List<SaleProp> LLILZ;
    public final CopyOnWriteArrayList<Image> LLILZIL = new CopyOnWriteArrayList<>();
    public final CopyOnWriteArrayList<String> LLILZLL = new CopyOnWriteArrayList<>();
    public final Map<String, Boolean> LLIZ = new HashMap();
    public final Set<String> LLIZLLLIL = new HashSet();
    public SkuCommonConfig LLJ;
    public String LLJI;
    public Image LLJIJIL;
    public boolean LLJILJIL;
    public C908703gr LLJILJILJ;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C936903lP(0);
    }

    public final String getProductId() {
        String str = this.LLJI;
        return str == null ? "" : str;
    }

    public final void EQ2(boolean z) {
        withState(new AwS89S0110000_1(this, 13));
    }

    public final ProductUnavailableInfo xQ2(List<String> list) {
        int iIntValue;
        SkuItem skuItemZQ2 = zQ2(list);
        if (skuItemZQ2 != null) {
            Integer num = skuItemZQ2.unavailableInfoId;
            if (num != null) {
                int iIntValue2 = num.intValue();
                SkuCommonConfig skuCommonConfig = this.LLJ;
                if (skuCommonConfig != null) {
                    return skuCommonConfig.LIZIZ(iIntValue2);
                }
                return null;
            }
            return null;
        }
        SkuCommonConfig skuCommonConfig2 = this.LLJ;
        if (skuCommonConfig2 != null) {
            Integer num2 = skuCommonConfig2.salePropUnavailableInfoId;
            if (num2 != null) {
                iIntValue = num2.intValue();
            } else {
                iIntValue = -1;
            }
            return skuCommonConfig2.LIZIZ(iIntValue);
        }
        return null;
    }

    public final String yQ2(int i) {
        List<SaleProp> list;
        SaleProp saleProp;
        if (i < 0 || (list = this.LLILZ) == null || (saleProp = (SaleProp) C13LP.LJJJLZIJ(i, list)) == null) {
            return "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sku_");
        sbLIZ.append(saleProp.propName);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final SkuItem zQ2(List<String> list) {
        List<SkuItem> list2 = this.LLILLJJLI;
        if (list2 != null && !list.isEmpty()) {
            if (!list.isEmpty()) {
                Iterator<String> it2 = list.iterator();
                while (it2.hasNext()) {
                    if (Intrinsics.LJFF(it2.next(), "")) {
                    }
                }
            }
            return (SkuItem) C04AW.LJ(C968903qZ.LIZ((String[]) list.toArray(new String[0])), list2);
        }
        return null;
    }

    public final Map<String, Object> AQ2(int i, int i2) {
        SaleProp saleProp;
        SalePropValue salePropValue;
        Object obj;
        if (i >= 0 && i2 >= 0) {
            List<SaleProp> list = this.LLILZ;
            if (list != null && (saleProp = (SaleProp) C13LP.LJJJLZIJ(i, list)) != null) {
                List<SalePropValue> list2 = saleProp.salePropValueList;
                if (list2 != null && (salePropValue = (SalePropValue) C13LP.LJJJLZIJ(i2, list2)) != null) {
                    String str = salePropValue.propValueId;
                    if (str == null) {
                        return C2097608Jq.LJ();
                    }
                    boolean zBQ2 = BQ2(i, str, getState().LL);
                    Boolean bool = salePropValue.isDefaultSelected;
                    Boolean bool2 = Boolean.TRUE;
                    Map<String, Object> mapLJIIJ = C2097608Jq.LJIIJ(new Pair("is_default_pre_select", Integer.valueOf(Intrinsics.LJFF(bool, bool2) ? 1 : 0)), new Pair("pdp_sku_attr_rank", Integer.valueOf(i + 1)), new Pair("pdp_sku_value_rank", Integer.valueOf(i2 + 1)), new Pair("sale_prop_status", Integer.valueOf(zBQ2 ? 1 : 0)));
                    String str2 = saleProp.propName;
                    if (str2 != null && str2.length() > 0) {
                        mapLJIIJ.put("pdp_sku_attr_value", str2);
                    }
                    if (Intrinsics.LJFF(salePropValue.isDefaultSelected, bool2)) {
                        SalePropTag salePropTag = salePropValue.salePropTag;
                        if (salePropTag != null && salePropTag.description != null) {
                            obj = "hot_tag";
                        } else if (i2 == 0) {
                            obj = "first_sku";
                        } else {
                            obj = "low_price";
                        }
                        mapLJIIJ.put("default_pre_select_type", obj);
                    }
                    return mapLJIIJ;
                }
                return C2097608Jq.LJ();
            }
            return C2097608Jq.LJ();
        }
        return C2097608Jq.LJ();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void vQ2(java.util.List<com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp> r6, com.ss.android.ugc.aweme.ecommerce.service.vo.Image r7) {
        /*
            r5 = this;
            java.util.concurrent.CopyOnWriteArrayList<com.ss.android.ugc.aweme.ecommerce.service.vo.Image> r0 = r5.LLILZIL
            r0.clear()
            java.util.concurrent.CopyOnWriteArrayList<java.lang.String> r0 = r5.LLILZLL
            r0.clear()
            r4 = 0
            if (r6 == 0) goto L6a
            java.util.Iterator r3 = r6.iterator()
        L11:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L68
            java.lang.Object r2 = r3.next()
            r0 = r2
            com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp r0 = (com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp) r0
            java.lang.Boolean r1 = r0.hasImage
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L11
        L28:
            com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp r2 = (com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp) r2
            if (r2 == 0) goto L36
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropValue> r0 = r2.salePropValueList
            if (r0 == 0) goto L36
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L3d
        L36:
            if (r7 == 0) goto L3d
            java.util.concurrent.CopyOnWriteArrayList<com.ss.android.ugc.aweme.ecommerce.service.vo.Image> r0 = r5.LLILZIL
            r0.add(r7)
        L3d:
            if (r2 == 0) goto L43
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropValue> r0 = r2.salePropValueList
            if (r0 != 0) goto L45
        L43:
            X.13BV r0 = X.C13BV.INSTANCE
        L45:
            java.util.Iterator r3 = r0.iterator()
        L49:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L6c
            java.lang.Object r2 = r3.next()
            com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropValue r2 = (com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropValue) r2
            com.ss.android.ugc.aweme.ecommerce.service.vo.Image r1 = r2.image
            if (r1 == 0) goto L5e
            java.util.concurrent.CopyOnWriteArrayList<com.ss.android.ugc.aweme.ecommerce.service.vo.Image> r0 = r5.LLILZIL
            r0.add(r1)
        L5e:
            java.lang.String r1 = r2.propValue
            if (r1 == 0) goto L49
            java.util.concurrent.CopyOnWriteArrayList<java.lang.String> r0 = r5.LLILZLL
            r0.add(r1)
            goto L49
        L68:
            r2 = r4
            goto L28
        L6a:
            r2 = r4
            goto L36
        L6c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.sku.seanew.SeaSkuSpecViewModel.vQ2(java.util.List, com.ss.android.ugc.aweme.ecommerce.service.vo.Image):void");
    }

    public static void DQ2(SeaSkuSpecViewModel seaSkuSpecViewModel, int i, int i2) {
        boolean z;
        if ((i2 & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        seaSkuSpecViewModel.withState(new C937103lR(i, seaSkuSpecViewModel, z, false));
    }

    public final boolean BQ2(int i, String str, List<String> list) {
        int i2;
        List<SkuItem> list2 = this.LLILLJJLI;
        if (list2 == null || list2.isEmpty() || (i2 = this.LLILLL) <= 0 || i < 0 || i >= i2 || list.size() != this.LLILLL) {
            return true;
        }
        String[] strArr = (String[]) list.toArray(new String[0]);
        strArr[i] = str;
        if (C04AW.LIZJ(list2, strArr) <= 0) {
            return false;
        }
        return true;
    }

    public final void CQ2(Context context, int i, final String str) {
        String str2;
        CopyOnWriteArrayList<Image> copyOnWriteArrayList = this.LLILZIL;
        final ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(copyOnWriteArrayList, 10));
        for (final Image image : copyOnWriteArrayList) {
            C1761780vwm c1761780vwm = C1761780vwm.LIZ;
            List<String> list = image.toImageUrlModel().LIZ;
            if (list == null || (str2 = (String) C13LP.LJJJLL(list)) == null) {
                str2 = "";
            }
            arrayList.add(C1761780vwm.LIZIZ(c1761780vwm, str2, image.getUri(), new InterfaceC1763870w09() { // from class: X.0vzg
                @Override // X.InterfaceC1763870w09
                public final void LIZ(C21649619o6 c21649619o6, String str3, String str4) {
                    String str5;
                    if (str3 == null) {
                        return;
                    }
                    C1326790kdB c1326790kdB = C1326790kdB.LIZ;
                    C1326840kdG c1326840kdG = C1326840kdG.LIZ;
                    String str6 = c1326840kdG.LIZLLL(str3, false).LIZ;
                    AwS62S1300000_26 awS62S1300000_26 = new AwS62S1300000_26(this.LIZ, c21649619o6, str4, image, 4);
                    c1326790kdB.getClass();
                    if (str6 != null) {
                        str5 = c1326840kdG.LIZLLL(str6, false).LIZ;
                    } else {
                        str5 = null;
                    }
                    C1325420kay.LIZJ(new C1763590vzh(awS62S1300000_26), str5);
                }
            }, 8));
        }
        DialogC1761330vw3 dialogC1761330vw3 = new DialogC1761330vw3(context, false);
        dialogC1761330vw3.LJJLJ(new C1763810w03(false));
        dialogC1761330vw3.LJJLJ(new C1012603xc(this.LLILZLL));
        dialogC1761330vw3.LJJLJLI(new InterfaceC1761400vwA() { // from class: X.03xa
            @Override // X.InterfaceC1761400vwA
            public final void LIZ() {
            }

            @Override // X.InterfaceC1761400vwA
            public final void onPageSelected(int i2) {
                String str3;
                C044V c044v = C044V.LIZ;
                String str4 = str;
                C1762980vyi c1762980vyi = (C1762980vyi) C13LP.LJJJLZIJ(i2, arrayList);
                if (c1762980vyi == null || (str3 = c1762980vyi.LIZIZ) == null) {
                    str3 = "";
                }
                c044v.getClass();
                C044V.LJIIIIZZ(str4, str3);
            }
        });
        dialogC1761330vw3.LJJZZI(arrayList);
        dialogC1761330vw3.LJJZZIII(i, null);
    }

    public final Pair<Image, Integer> wQ2(List<SaleProp> list, List<String> list2, List<Image> list3) {
        SaleProp saleProp;
        List<SalePropValue> list4;
        List<SalePropValue> list5;
        SaleProp next;
        if (list != null) {
            Iterator<SaleProp> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.hasImage, Boolean.TRUE)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            saleProp = next;
            if (saleProp != null) {
                list4 = saleProp.salePropValueList;
            }
            if (list4 == null && !list4.isEmpty()) {
                Object objLJJJLZIJ = C13LP.LJJJLZIJ(0, list2);
                if (objLJJJLZIJ == null) {
                    objLJJJLZIJ = "";
                }
                if (Intrinsics.LJFF(objLJJJLZIJ, "")) {
                    return new Pair<>(C13LP.LJJJLL(list3), 0);
                }
                if (saleProp != null && (list5 = saleProp.salePropValueList) != null) {
                    ArrayList arrayList = new ArrayList();
                    for (SalePropValue salePropValue : list5) {
                        if (salePropValue.image != null) {
                            arrayList.add(salePropValue);
                        }
                    }
                    int i = 0;
                    for (Object obj : arrayList) {
                        int i2 = i + 1;
                        if (i >= 0) {
                            SalePropValue salePropValue2 = (SalePropValue) obj;
                            if (Intrinsics.LJFF(salePropValue2.propValueId, objLJJJLZIJ)) {
                                return new Pair<>(salePropValue2.image, Integer.valueOf(i));
                            }
                            i = i2;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    }
                }
                return new Pair<>(C13LP.LJJJLL(list3), 0);
            }
            return new Pair<>(this.LLJIJIL, 0);
        }
        saleProp = null;
        list4 = null;
        if (list4 == null) {
        }
        return new Pair<>(this.LLJIJIL, 0);
    }
}
