package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku;

import X.C01GW;
import X.C041G;
import X.C042Y;
import X.C049X;
import X.C0H9H;
import X.C1003703wB;
import X.C1064604Ei;
import X.C1406590mht;
import X.C1406890miN;
import X.C1406900miO;
import X.C1748720vbi;
import X.C2188811AlT;
import X.C452501pT;
import X.C786410Ut5;
import X.C960203pA;
import X.EnumC1064704Ej;
import X.InterfaceC1065004Em;
import X.InterfaceC1065104En;
import X.InterfaceC1065204Eo;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.PdpHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SizeGuide;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropTag;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropValue;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS23S0202000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes2.dex */
public final class UsSkuVH extends PdpHolder<C1003703wB> implements InterfaceC1065204Eo {
    public static final float LLJLLIL = C0H9H.LIZ(0);
    public static final float LLJLLL = C0H9H.LIZ(16);
    public static final long LLJZ = 1000;
    public final ECBaseFragment LLJJIJIL;
    public final C01GW LLJJJ;
    public final LinkedList<C1064604Ei> LLJJJIL;
    public int LLJJJJ;
    public int LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public final C01GW LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public final List<SaleProp> LLJLIL;
    public final Map<Integer, SaleProp> LLJLILLLLZIIL;
    public View LLJLL;

    @Override // X.InterfaceC1065204Eo
    public final void a5() {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.PdpHolder, com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final PdpViewModel e6() {
        return (PdpViewModel) this.LLJJJ.getValue();
    }

    public final boolean f6() {
        SkuPanelState skuPanelStatePv0 = e6().Pv0();
        String[] strArr = skuPanelStatePv0 != null ? skuPanelStatePv0.checkedSkuIds : null;
        ProductPackStruct productPackStruct = e6().LLJILLL;
        return C041G.LJIILJJIL(productPackStruct != null ? productPackStruct.skus : null, strArr);
    }

    public static String d6(List list) {
        SalePropValue next;
        SalePropTag salePropTag;
        String str;
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                List<SalePropValue> list2 = ((SaleProp) it2.next()).salePropValueList;
                if (list2 != null) {
                    Iterator<SalePropValue> it3 = list2.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            next = it3.next();
                            SalePropTag salePropTag2 = next.salePropTag;
                            if (salePropTag2 != null && salePropTag2.tagName != null) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    SalePropValue salePropValue = next;
                    if (salePropValue != null && (salePropTag = salePropValue.salePropTag) != null && (str = salePropTag.tagName) != null) {
                        return str;
                    }
                }
            }
        }
        return null;
    }

    @Override // X.InterfaceC1065204Eo
    public final void LJLJLLL(SizeGuide sizeGuide) {
        e6().hS2(this.LLJJIJIL, sizeGuide);
    }

    /* JADX WARN: Code restructure failed: missing block: B:286:0x086d, code lost:
    
        r11 = r2.LL;
        r10 = r2.LLILZIL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x0871, code lost:
    
        if (r10 == null) goto L304;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x0873, code lost:
    
        r10 = (java.lang.String[]) r10.toArray(new java.lang.String[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x087c, code lost:
    
        r1 = X.C042X.LIZJ(r11, r10, r2.LLIZ);
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x0882, code lost:
    
        if (r1 == null) goto L309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x0884, code lost:
    
        r1 = r1.productLinkProperties;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x0886, code lost:
    
        if (r1 == null) goto L309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x0888, code lost:
    
        r10 = r1.propertyValues;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x088a, code lost:
    
        if (r10 == null) goto L309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x088c, code lost:
    
        r11 = X.C13LP.LL(r10, 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x0891, code lost:
    
        if (r11 == null) goto L309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x0893, code lost:
    
        r10 = new java.util.ArrayList(X.C15438062q.LJIJJ(r11, 10));
        r11 = r11.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x08a6, code lost:
    
        if (r11.hasNext() == false) goto L429;
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x08a8, code lost:
    
        r10.add(((com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.PropertyValue) r11.next()).valueName);
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x08b4, code lost:
    
        r1 = X.C13LP.LJJLIIIJ(r10, " & ", null, null, 0, null, null, 62);
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x08c6, code lost:
    
        if (r1 == null) goto L309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x08c8, code lost:
    
        r9 = h6(r9, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x08cd, code lost:
    
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x08d5, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x08d6, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x08f6, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x08f7, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x08fa, code lost:
    
        throw r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:168:0x05db  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x05e4  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x074b  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x0755 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r19v3, types: [java.util.HashMap, java.util.LinkedHashMap] */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void rr(java.lang.Object r40) {
        /*
            Method dump skipped, instruction units count: 2752
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.UsSkuVH.rr(java.lang.Object):void");
    }

    public UsSkuVH(View view, ECBaseFragment eCBaseFragment) {
        super(R.layout.b3a, view, true);
        this.LLJJIJIL = eCBaseFragment;
        this.LLJJJ = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1732));
        this.LLJJJIL = new LinkedList<>();
        this.LLJJJJJIL = -1;
        this.LLJJL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1731));
        this.LLJL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1730));
        this.LLJLIL = new ArrayList();
        this.LLJLILLLLZIIL = new LinkedHashMap();
    }

    public static String h6(String str, String str2) {
        if (a0.LJJJIL(str)) {
            return str;
        }
        int iLJJIZ = a0.LJJIZ(str, '(', 0, false, 6);
        int iLJJIZ2 = a0.LJJIZ(str, ')', iLJJIZ, false, 4);
        if (iLJJIZ != -1 && iLJJIZ2 != -1) {
            int i = iLJJIZ + 1;
            String strSubstring = str.substring(i, iLJJIZ2);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strSubstring);
            sbLIZ.append(" · ");
            sbLIZ.append(str2);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str.substring(0, i));
            sbLIZ2.append(strLIZIZ);
            sbLIZ2.append(str.substring(iLJJIZ2));
            return C2188811AlT.LIZIZ(sbLIZ2);
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(str);
        sbLIZ3.append('(');
        sbLIZ3.append(str2);
        sbLIZ3.append(')');
        return C2188811AlT.LIZIZ(sbLIZ3);
    }

    public static boolean i6(C1003703wB c1003703wB, List list) {
        String str;
        for (SaleProp saleProp : (ArrayList) list) {
            SizeGuide sizeGuide = c1003703wB.LLILZ;
            if (sizeGuide != null) {
                str = sizeGuide.showSalePropId;
            } else {
                str = null;
            }
            if (Intrinsics.LJFF(str, saleProp.propId)) {
                return true;
            }
        }
        return false;
    }

    public final SpannableString c6(String str, boolean z) {
        SpannableString spannableString = new SpannableString(str);
        if (!f6()) {
            C786410Ut5.p2(spannableString, new StrikethroughSpan(), 0, spannableString.length(), 33);
        } else if (z) {
            C786410Ut5.p2(spannableString, new ForegroundColorSpan(C960203pA.LIZ(R.attr.a1h, this.itemView.getContext())), 0, spannableString.length(), 33);
            return spannableString;
        }
        return spannableString;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x005f  */
    @Override // X.InterfaceC1065204Eo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void G4(int r19, int r20, X.C042Y r21) {
        /*
            r18 = this;
            r5 = r18
            com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel r0 = r5.e6()
            com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState r0 = r0.Pv0()
            java.lang.String r4 = "cancel"
            r15 = 0
            r6 = r21
            r8 = r19
            if (r0 == 0) goto L64
            java.lang.String[] r0 = r0.checkedSkuIds
            if (r0 == 0) goto L64
            java.lang.Object r1 = X.C13LQ.LJJIIZ(r8, r0)
            if (r6 == 0) goto L62
            java.lang.String r0 = r6.LL
        L1f:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L34
            r7 = r4
        L26:
            if (r6 == 0) goto L66
            boolean r1 = r6.LLILZIL
            r0 = 1
            if (r1 != r0) goto L66
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r7, r4)
            if (r0 == 0) goto L66
            return
        L34:
            if (r6 == 0) goto L5f
            java.lang.String r1 = r6.LL
            if (r1 == 0) goto L5f
            com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel r0 = r5.e6()
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct r0 = r0.LLJILLL
            if (r0 == 0) goto L5d
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.DefaultSelection r0 = r0.defaultSelection
            if (r0 == 0) goto L5d
            java.util.List<java.lang.String> r0 = r0.selectedProps
            if (r0 == 0) goto L5d
            boolean r0 = r0.contains(r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
        L52:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L5f
            java.lang.String r7 = "select"
            goto L26
        L5d:
            r1 = r15
            goto L52
        L5f:
            java.lang.String r7 = "reselect"
            goto L26
        L62:
            r0 = r15
            goto L1f
        L64:
            r7 = r15
            goto L26
        L66:
            int r0 = r5.LLJJJJJIL
            if (r8 != r0) goto L71
            com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel r0 = r5.e6()
            r0.getClass()
        L71:
            com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment r3 = r5.LLJJIJIL
            X.049i r2 = new X.049i
            r2.<init>()
            kotlin.jvm.internal.AwS367S0200000_1 r1 = new kotlin.jvm.internal.AwS367S0200000_1
            r0 = 332(0x14c, float:4.65E-43)
            r1.<init>(r6, r5, r0)
            X.C1748720vbi.LIZIZ(r3, r2, r1)
            r9 = r20
            if (r6 == 0) goto La4
            boolean r0 = r6.LIZIZ()
            if (r0 == 0) goto La4
            com.ss.android.ugc.aweme.ecommerce.service.vo.Image r3 = r6.LLILZ
            if (r3 == 0) goto La4
            com.ss.android.ugc.aweme.ecommerce.base.pdp.module.sku.v2.ImageSelectData r15 = new com.ss.android.ugc.aweme.ecommerce.base.pdp.module.sku.v2.ImageSelectData
            X.04DB r2 = X.C04DB.SKU_ENTRANCE
            boolean r0 = r6.LLILZIL
            if (r0 == 0) goto Lc4
            X.04DA r1 = X.C04DA.SKC
        L9a:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r7, r4)
            if (r0 != 0) goto Lc2
            r0 = r9
        La1:
            r15.<init>(r3, r2, r1, r0)
        La4:
            com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel r11 = r5.e6()
            if (r6 == 0) goto Lae
            java.lang.String r14 = r6.LL
            if (r14 != 0) goto Lb0
        Lae:
            java.lang.String r14 = ""
        Lb0:
            android.view.View r0 = r5.itemView
            kotlin.jvm.internal.AwS4S1202000_1 r4 = new kotlin.jvm.internal.AwS4S1202000_1
            r10 = 3
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r12 = r8
            r13 = r9
            r16 = r0
            r17 = r4
            r11.yS2(r12, r13, r14, r15, r16, r17)
            return
        Lc2:
            r0 = -1
            goto La1
        Lc4:
            X.04DA r1 = X.C04DA.SKU
            goto L9a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.UsSkuVH.G4(int, int, X.042Y):void");
    }

    @Override // X.InterfaceC1065204Eo
    public final void LLLLZLLLI(View view, int i, int i2, C042Y c042y) {
        InterfaceC1065004Em interfaceC1065004Em;
        if (view != null) {
            C1748720vbi.LJFF(view, new C049X(), new AwS545S0100000_1(c042y, 1380), new AwS23S0202000_1(c042y, i, i2, this, 1));
        }
        if (c042y != null && (interfaceC1065004Em = e6().g) != null) {
            interfaceC1065004Em.Rn(c042y);
        }
    }

    @Override // X.InterfaceC1065204Eo
    public final void Z(int i, int i2, EnumC1064704Ej enumC1064704Ej, List list) {
        if (list == null) {
            return;
        }
        C1406590mht.LIZ().LIZ(e6().LLLZL, new C1406900miO(e6().iH1(Integer.valueOf(e6().Tg2())), list, enumC1064704Ej, i, i2));
    }

    @Override // X.InterfaceC1065204Eo
    public final void o5(int i, C042Y c042y, List list, int i2) {
        if (c042y != null && c042y.LIZIZ()) {
            InterfaceC1065004Em interfaceC1065004Em = e6().g;
            if (interfaceC1065004Em != null) {
                interfaceC1065004Em.nj(c042y);
            }
            ((InterfaceC1065104En) e6().LLZZZIL.getValue()).LIZ(c042y);
            if (list != null) {
                C1406590mht.LIZ().LIZ(e6().LLLZL, new C1406890miN(e6().iH1(Integer.valueOf(e6().Tg2())), i, list, i2));
            }
        }
    }
}
