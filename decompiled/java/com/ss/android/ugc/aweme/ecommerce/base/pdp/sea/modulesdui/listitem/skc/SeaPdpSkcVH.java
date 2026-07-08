package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.skc;

import X.C01GW;
import X.C04DQ;
import X.C04DT;
import X.C13LE;
import X.C1755600vmo;
import X.C19719912Dl;
import X.C452501pT;
import X.C786410Ut5;
import X.C961303pL;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.PdpHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.sku.v2.ImageSelectData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.di.PageStateContext;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.skc.SeaPdpSkcVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropValue;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuVoucher;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.zhiliaoapp.musically.R;
import g1c.AjS60S0100000_1;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS141S0101000_1;
import kotlin.jvm.internal.AwS270S0300000_26;
import kotlin.jvm.internal.AwS367S0200000_1;
import kotlin.jvm.internal.AwS88S0201000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SeaPdpSkcVH extends PdpHolder<C961303pL> {
    public final C01GW LLJJIJIL;
    public final C04DQ LLJJJ;
    public final TuxIconView LLJJJIL;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.PdpHolder, com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final SeaPdpViewModel c6() {
        return (SeaPdpViewModel) this.LLJJIJIL.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [X.04At] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.PdpHolder, com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH, com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onCreate() {
        super.onCreate();
        this.LLJJJ.LIZJ(new C04DT() { // from class: X.04At
            @Override // X.C04DT
            public final void LIZIZ(View view, int i, C04DL c04dl) {
                C1748720vbi.LJFF(view, new C049X(), new AwS141S0101000_1(i, c04dl, 1), new AwS88S0201000_1(this.LIZ, i, c04dl, 3));
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.C04DT
            public final void LIZ(View view, int i, C04DL c04dl, boolean z) {
                C04BX c04bxLIZ;
                Image image;
                int size;
                String[] strArr;
                Object objLJJIIZ;
                SkuPanelState skuPanelState;
                String str;
                String str2;
                String[] strArr2;
                PageStateContext pageStateContextSR2;
                List<SaleProp> list;
                SaleProp saleProp;
                List<SalePropValue> list2;
                SalePropValue salePropValue;
                String[] strArr3;
                SkuItem skuItemLIZJ;
                String str3;
                String str4;
                SkuVoucher skuVoucher;
                String str5;
                List<SkuItem> list3;
                String[] strArr4;
                String[] strArr5;
                List<SaleProp> list4;
                if (z) {
                    return;
                }
                if (c04dl != null && (c04bxLIZ = c04dl.LIZ()) != null && (image = c04bxLIZ.LIZIZ) != null) {
                    SeaPdpSkcVH seaPdpSkcVH = this.LIZ;
                    SeaPdpViewModel seaPdpViewModelC6 = seaPdpSkcVH.c6();
                    int i2 = ((C961303pL) seaPdpSkcVH.LLILLJJLI).LIZ;
                    String str6 = c04dl.LIZ().LIZ;
                    ImageSelectData imageSelectData = new ImageSelectData(image, C04DB.SKU_ENTRANCE, C04DA.SKC, i);
                    String str7 = c04dl.LIZ().LIZ;
                    ProductPackStruct productPackStruct = seaPdpViewModelC6.LLJIJIL;
                    int i3 = 0;
                    if (productPackStruct != null && (list4 = productPackStruct.saleProps) != null) {
                        size = list4.size();
                    } else {
                        size = 0;
                    }
                    if (i2 >= 0 && i2 < size) {
                        SkuPanelState skuPanelState2 = seaPdpViewModelC6.LLJILJIL;
                        if (skuPanelState2 != null) {
                            skuPanelState2.isSkuManuallySelected = Boolean.TRUE;
                        }
                        Image image2 = null;
                        if (skuPanelState2 != null) {
                            strArr = skuPanelState2.checkedSkuIds;
                        } else {
                            strArr = null;
                        }
                        String str8 = "";
                        if (strArr != null && skuPanelState2 != null && (strArr4 = skuPanelState2.checkedSkuIds) != null && strArr4.length > i2) {
                            if (skuPanelState2 != null && (strArr5 = skuPanelState2.checkedSkuIds) != null) {
                                if (Intrinsics.LJFF(strArr5[i2], str6)) {
                                    strArr5[i2] = "";
                                } else {
                                    strArr5[i2] = str6;
                                }
                            }
                        } else {
                            String[] strArr6 = new String[size];
                            int i4 = 0;
                            do {
                                strArr6[i4] = "";
                                i4++;
                            } while (i4 < size);
                            do {
                                SkuPanelState skuPanelState3 = seaPdpViewModelC6.LLJILJIL;
                                if (skuPanelState3 == null || (strArr2 = skuPanelState3.checkedSkuIds) == null || (objLJJIIZ = C13LQ.LJJIIZ(i3, strArr2)) == null) {
                                    objLJJIIZ = "";
                                }
                                strArr6[i3] = objLJJIIZ;
                                i3++;
                            } while (i3 < size);
                            if (Intrinsics.LJFF(strArr6[i2], str6)) {
                                strArr6[i2] = "";
                            } else {
                                strArr6[i2] = str6;
                            }
                            SkuPanelState skuPanelState4 = seaPdpViewModelC6.LLJILJIL;
                            if (skuPanelState4 != null) {
                                ProductPackStruct productPackStruct2 = seaPdpViewModelC6.LLJIJIL;
                                if (productPackStruct2 != null && (str2 = productPackStruct2.productId) != null) {
                                    str8 = str2;
                                }
                                skuPanelState = SkuPanelState.LIZIZ(skuPanelState4, str8, null, null, null, strArr6, 1, null, null, false, 0, null, null, null, null, null, null, 67108800);
                            } else {
                                ProductPackStruct productPackStruct3 = seaPdpViewModelC6.LLJIJIL;
                                if (productPackStruct3 != null && (str = productPackStruct3.productId) != null) {
                                    str8 = str;
                                }
                                skuPanelState = new SkuPanelState(str8, null, null, null, strArr6, 1, null, null, false, 0, null, null, null, null, null, null, null, null, null, null, 0, "", null, Boolean.FALSE, null, null);
                            }
                            seaPdpViewModelC6.LLJILJIL = skuPanelState;
                        }
                        SkuPanelState skuPanelState5 = seaPdpViewModelC6.LLJILJIL;
                        if (skuPanelState5 != null && (strArr3 = skuPanelState5.checkedSkuIds) != null) {
                            String strLIZ = C036I.LIZ(strArr3);
                            ProductPackStruct productPackStruct4 = seaPdpViewModelC6.LLJIJIL;
                            if (productPackStruct4 != null && (list3 = productPackStruct4.skus) != null) {
                                skuItemLIZJ = C731902tR.LIZJ(strLIZ, list3);
                            } else {
                                skuItemLIZJ = null;
                            }
                            SkuPanelState skuPanelState6 = seaPdpViewModelC6.LLJILJIL;
                            if (skuPanelState6 != null) {
                                if (skuItemLIZJ != null) {
                                    str3 = skuItemLIZJ.skuId;
                                } else {
                                    str3 = null;
                                }
                                skuPanelState6.skuId = str3;
                                if (skuItemLIZJ != null) {
                                    str4 = skuItemLIZJ.warehouseId;
                                } else {
                                    str4 = null;
                                }
                                skuPanelState6.warehouseId = str4;
                                if (skuItemLIZJ != null) {
                                    skuVoucher = skuItemLIZJ.voucherInfo;
                                } else {
                                    skuVoucher = null;
                                }
                                skuPanelState6.voucherInfo = skuVoucher;
                                if (skuItemLIZJ != null) {
                                    str5 = skuItemLIZJ.link;
                                } else {
                                    str5 = null;
                                }
                                skuPanelState6.link = str5;
                                skuPanelState6.productQuantity = Integer.valueOf(C041G.LJIIJ(skuPanelState6, skuItemLIZJ));
                            }
                        }
                        ProductPackStruct productPackStruct5 = seaPdpViewModelC6.LLJIJIL;
                        if (productPackStruct5 != null && (list = productPackStruct5.saleProps) != null && (saleProp = (SaleProp) C13LP.LJJJLZIJ(i2, list)) != null && (list2 = saleProp.salePropValueList) != null && (salePropValue = (SalePropValue) C13LP.LJJJLZIJ(i, list2)) != null) {
                            image2 = salePropValue.image;
                        }
                        if (imageSelectData.source == C04DA.SKC && str7 != null && (pageStateContextSR2 = seaPdpViewModelC6.SR2()) != null) {
                            PageStateContext.LIZLLL(pageStateContextSR2, "header_list_key", str7);
                        }
                        SkuPanelState skuPanelState7 = seaPdpViewModelC6.LLJILJIL;
                        if (skuPanelState7 != null) {
                            ArrayList<Integer> arrayList = skuPanelState7.clickSpecGroupIds;
                            if (arrayList == null) {
                                arrayList = new ArrayList<>();
                            }
                            if (!arrayList.contains(Integer.valueOf(i2))) {
                                arrayList.add(Integer.valueOf(i2));
                            }
                            skuPanelState7.clickSpecGroupIds = arrayList;
                            if (image2 != null) {
                                skuPanelState7.clickImageSource = imageSelectData;
                            }
                        }
                        seaPdpViewModelC6.TS2(seaPdpViewModelC6.LLJILJIL, true, true, false, false, false);
                    } else {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("the sku group id is error : ");
                        sbLIZ.append(i2);
                        sbLIZ.append("  : ");
                        sbLIZ.append(size);
                        C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
                    }
                }
                C1748720vbi.LIZLLL(view, new C10516049i(), new AwS367S0200000_1(this.LIZ, c04dl, 116));
                C1748720vbi.LIZLLL(view, new C049Y(), new AwS88S0201000_1(this.LIZ, i, c04dl, 4));
            }
        });
        C786410Ut5.I7(new AjS60S0100000_1(this, 29), this.LLJJJIL);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SeaPdpSkcVH(ViewGroup viewGroup) {
        C1755600vmo c1755600vmo = C1755600vmo.LIZ;
        Context context = viewGroup.getContext();
        c1755600vmo.getClass();
        super(0, C1755600vmo.LIZ(R.layout.ax8, context, viewGroup, false, false), true);
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SeaPdpViewModel.class);
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS270S0300000_26(this, c19719912DlLIZ, c19719912DlLIZ, 78));
        this.LLJJJ = (C04DQ) this.itemView.findViewById(R.id.vdz);
        this.LLJJJIL = (TuxIconView) this.itemView.findViewById(R.id.l8u);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0060  */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void rr(java.lang.Object r17) {
        /*
            r16 = this;
            r12 = r17
            X.03pL r12 = (X.C961303pL) r12
            com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp r0 = r12.LIZIZ
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropValue> r0 = r0.salePropValueList
            r2 = 0
            if (r0 == 0) goto L29
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r0.iterator()
        L14:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L2b
            java.lang.Object r1 = r3.next()
            r0 = r1
            com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropValue r0 = (com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropValue) r0
            com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropTag r0 = r0.salePropTag
            if (r0 == 0) goto L14
            r4.add(r1)
            goto L14
        L29:
            r5 = 0
            goto L2f
        L2b:
            int r5 = r4.size()
        L2f:
            com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp r0 = r12.LIZIZ
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropValue> r0 = r0.salePropValueList
            if (r0 == 0) goto L60
            java.util.Iterator r4 = r0.iterator()
        L39:
            boolean r0 = r4.hasNext()
            r3 = 0
            if (r0 == 0) goto L54
            java.lang.Object r1 = r4.next()
            r0 = r1
            com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropValue r0 = (com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropValue) r0
            com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropTag r0 = r0.salePropTag
            if (r0 == 0) goto L4d
            java.lang.String r3 = r0.tagName
        L4d:
            boolean r0 = X.C1533950q1J.LJ(r3)
            if (r0 == 0) goto L39
            r3 = r1
        L54:
            com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropValue r3 = (com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropValue) r3
            if (r3 == 0) goto L60
            com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropTag r0 = r3.salePropTag
            if (r0 == 0) goto L60
            java.lang.String r9 = r0.tagName
            if (r9 != 0) goto L62
        L60:
            java.lang.String r9 = "hot"
        L62:
            r11 = r16
            X.04DQ r4 = r11.LLJJJ
            com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp r6 = r12.LIZIZ
            java.lang.String r8 = r12.LIZJ
            com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkcInfo r7 = r12.LIZLLL
            boolean r0 = r4.LIZLLL(r5, r6, r7, r8, r9)
            if (r0 == 0) goto La6
            android.view.View r0 = r11.itemView
            X.C786410Ut5.LJLLLLLL(r2, r0)
            android.view.View r2 = r11.itemView
            X.049h r1 = new X.049h
            r1.<init>()
            r0 = 550(0x226, float:7.71E-43)
            kotlin.jvm.internal.AFwS185S0000000_1 r0 = kotlin.jvm.internal.AFwS185S0000000_1.get$arr$(r0)
            kotlin.jvm.internal.AwS16S1201000_1 r10 = new kotlin.jvm.internal.AwS16S1201000_1
            r15 = 7
            r13 = r5
            r14 = r9
            r10.<init>(r11, r12, r13, r14, r15)
            X.C1748720vbi.LJFF(r2, r1, r0, r10)
            com.bytedance.tux.icon.TuxIconView r3 = r11.LLJJJIL
            X.049X r2 = new X.049X
            r2.<init>()
            r0 = 551(0x227, float:7.72E-43)
            kotlin.jvm.internal.AFwS185S0000000_1 r1 = kotlin.jvm.internal.AFwS185S0000000_1.get$arr$(r0)
            r0 = 932(0x3a4, float:1.306E-42)
            kotlin.jvm.internal.AFwS228S0000000_1 r0 = kotlin.jvm.internal.AFwS228S0000000_1.get$arr$(r0)
            X.C1748720vbi.LJFF(r3, r2, r1, r0)
            return
        La6:
            android.view.View r1 = r11.itemView
            r0 = 8
            X.C786410Ut5.LJLLLLLL(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.skc.SeaPdpSkcVH.rr(java.lang.Object):void");
    }
}
