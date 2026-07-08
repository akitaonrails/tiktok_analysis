package com.ss.android.ugc.aweme.ecommerce.base.osp.module.combinesku.sku;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03DZ;
import X.C03IJ;
import X.C03K6;
import X.C03XA;
import X.C041T;
import X.C042W;
import X.C049X;
import X.C049Y;
import X.C0H1U;
import X.C1019103yf;
import X.C10515049h;
import X.C10516049i;
import X.C128Y;
import X.C13LE;
import X.C13LQ;
import X.C1697810uHb;
import X.C1748720vbi;
import X.C1748800vbq;
import X.C19719912Dl;
import X.C1AF0;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452080Ho6;
import X.C452501pT;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C755702xH;
import X.C786410Ut5;
import X.C813303Fr;
import X.C814703Gf;
import X.C919503ib;
import X.C960603pE;
import X.EnumC1014603xw;
import X.InterfaceC1748810vbr;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC813403Fs;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SkuSelection;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBase;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SizeGuide;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropValue;
import com.zhiliaoapp.musically.R;
import g1c.AjS10S0000000_1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS185S0000000_1;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS23S0202000_1;
import kotlin.jvm.internal.AwS420S0200000_19;
import kotlin.jvm.internal.AwS4S1202000_1;
import kotlin.jvm.internal.AwS52S1000000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.AwS615S0100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class USCombinedSkuCell extends ECPowerCell<C755702xH> implements InterfaceC813403Fs {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public final AssemVMLazy LLJ;
    public C813303Fr LLJI;
    public int LLJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(USCombinedSkuCell.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/vm/OrderSubmitAssemViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell, com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onCreate() {
        super.onCreate();
        C736680Sv4.LJIIIIZZ(this, N5(), new C2217381BqS() { // from class: X.041U
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C03JV) obj).LLLLLIL;
            }
        }, null, new AwS615S0100000_1(this, 201), 6);
    }

    public USCombinedSkuCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(OrderSubmitAssemViewModel.class);
        AwS545S0100000_1 awS545S0100000_1 = new AwS545S0100000_1(c19719912DlLIZ, 237);
        AFwS228S0000000_1 aFwS228S0000000_1 = AFwS228S0000000_1.get$arr$(76);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ, 227), awS545S0100000_1, AFwS207S0000000_19.get$arr$(114), new AwS545S0100000_1((C03K6) this, 229), new AwS545S0100000_1((C03K6) this, 231), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 233), aFwS228S0000000_1, new AwS563S0100000_19((C03K6) this, 1096), null, new AwS545S0100000_1((C03K6) this, 235));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS545S0100000_1 awS545S0100000_12 = new AwS545S0100000_1((C03K6) this, 230);
            AwS545S0100000_1 awS545S0100000_13 = new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 232);
            AwS545S0100000_1 awS545S0100000_14 = new AwS545S0100000_1(c19719912DlLIZ, 234);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS420S0200000_19((InterfaceC451590HnJ) obj, awS545S0100000_12, 47));
            AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(c01gwLIZIZ, 1097);
            AwS563S0100000_19 awS563S0100000_192 = new AwS563S0100000_19(c01gwLIZIZ, 1098);
            AwS563S0100000_19 awS563S0100000_193 = new AwS563S0100000_19(c01gwLIZIZ, 1099);
            AwS563S0100000_19 awS563S0100000_194 = new AwS563S0100000_19(c01gwLIZIZ, 1100);
            AwS563S0100000_19 awS563S0100000_195 = new AwS563S0100000_19(c01gwLIZIZ, 1101);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS545S0100000_14, awS545S0100000_1, new C452080Ho6(), awS563S0100000_19, awS563S0100000_192, awS545S0100000_13, aFwS228S0000000_1, awS563S0100000_193, awS563S0100000_194, awS563S0100000_195);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ, 236), awS545S0100000_1, AFwS207S0000000_19.get$arr$(115), new AwS545S0100000_1((C03K6) this, 238), new AwS545S0100000_1((C03K6) this, 239), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 240), aFwS228S0000000_1, new AwS563S0100000_19((C03K6) this, 1102), null, new AwS545S0100000_1((C03K6) this, 241));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ, 242), awS545S0100000_1, AFwS207S0000000_19.get$arr$(116), new AwS545S0100000_1((C03K6) this, 243), new AwS545S0100000_1((C03K6) this, 244), new AwS545S0100000_1((C03K6) this, 225), aFwS228S0000000_1, null, null, new AwS545S0100000_1((C03K6) this, 226));
        }
        this.LLJ = assemVMLazy;
        this.LLJIJIL = -1;
    }

    public final void L5() {
        View viewFindViewById = this.itemView.findViewById(R.id.vi5);
        if (viewFindViewById != null) {
            ((TuxTextView) viewFindViewById.findViewById(R.id.yyv)).setTextColorRes(R.attr.a1p);
            TuxTextView tuxTextView = (TuxTextView) viewFindViewById.findViewById(R.id.yyw);
            tuxTextView.setTextColorRes(R.attr.a1p);
            C786410Ut5.I7(new AjS10S0000000_1(16), tuxTextView);
        }
    }

    public final OrderSubmitAssemViewModel N5() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
        return (OrderSubmitAssemViewModel) assemVMLazy.getValue();
    }

    @Override // X.InterfaceC813403Fs
    public final void LJLJLLL(SizeGuide sizeGuide) {
        InterfaceC1748810vbr interfaceC1748810vbr;
        String strLJ;
        FragmentManager fragmentManager;
        Context context;
        if (sizeGuide == null) {
            return;
        }
        try {
            C128Y fragment = getFragment();
            if (fragment instanceof InterfaceC1748810vbr) {
                interfaceC1748810vbr = (InterfaceC1748810vbr) fragment;
            } else {
                interfaceC1748810vbr = null;
            }
            String str = sizeGuide.skuSizeGuideSchema;
            if (str != null && str.length() != 0) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                HashMap<String, Object> map = N5().LLLIL;
                if (map != null) {
                    linkedHashMap.putAll(map);
                }
                if (interfaceC1748810vbr != null) {
                    for (Map.Entry<String, Object> entry : C1748800vbq.LIZ(interfaceC1748810vbr).entrySet()) {
                        Object value = entry.getValue();
                        if (value != null) {
                            linkedHashMap.put(entry.getKey(), value);
                        }
                    }
                }
                linkedHashMap.put("init_time", Long.valueOf(System.currentTimeMillis()));
                linkedHashMap.put("previous_page", "order_submit");
                Fragment fragment2 = getFragment();
                if (fragment2 != null && (context = fragment2.getContext()) != null) {
                    C919503ib.LIZIZ(context, sizeGuide.skuSizeGuideSchema, C2097908Jt.LIZJ(new Pair("track_params", linkedHashMap)), false).open();
                }
            } else {
                if (interfaceC1748810vbr == null || (strLJ = C960603pE.LJ(interfaceC1748810vbr)) == null) {
                    strLJ = "";
                }
                Fragment fragment3 = getFragment();
                if (fragment3 != null && (fragmentManager = fragment3.getFragmentManager()) != null) {
                    C814703Gf.LIZ(fragmentManager, strLJ, sizeGuide);
                }
            }
            if (interfaceC1748810vbr != null) {
                C1748720vbi.LIZIZ(interfaceC1748810vbr, new C049Y(), AFwS228S0000000_1.get$arr$(77));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            EnumC1014603xw enumC1014603xw = EnumC1014603xw.ERR103;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onSizeGuideClick exception ");
            sbLIZ.append(e.getMessage());
            C1019103yf.LIZ(enumC1014603xw, new RuntimeException(C2188811AlT.LIZIZ(sbLIZ)), null);
        }
    }

    @Override // X.InterfaceC813403Fs
    public final void LLLLZLL(View view) {
        C1748720vbi.LJFF(view, new C049X(), AFwS185S0000000_1.get$arr$(460), AFwS228S0000000_1.get$arr$(718));
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        int size;
        String[] strArr;
        String[] strArr2;
        List<SaleProp> list;
        int i;
        C755702xH c755702xH = (C755702xH) interfaceC1891350zJl;
        super.onBindItemView(c755702xH);
        boolean z = c755702xH.LLIZLLLIL;
        View viewFindViewById = this.itemView.findViewById(R.id.vi5);
        View viewFindViewById2 = this.itemView.findViewById(R.id.vhy);
        int i2 = 8;
        if (viewFindViewById2 != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, viewFindViewById2);
        }
        if (viewFindViewById != null) {
            if (!z) {
                i2 = 0;
            }
            C786410Ut5.LJLLLLLL(i2, viewFindViewById);
        }
        if (!c755702xH.LLIZLLLIL) {
            this.LLJI = (C813303Fr) this.itemView.findViewById(R.id.vi5);
            SkuSelection skuSelection = c755702xH.LLILZLL;
            if (skuSelection != null && (list = skuSelection.saleProps) != null) {
                size = list.size();
            } else {
                size = 0;
            }
            SizeGuide sizeGuide = null;
            if (size > 0) {
                strArr = new String[size];
                int i3 = 0;
                do {
                    strArr[i3] = "";
                    i3++;
                } while (i3 < size);
            } else {
                strArr = null;
            }
            C813303Fr c813303Fr = this.LLJI;
            if (c813303Fr != null) {
                c813303Fr.setListener(this);
            }
            List<String> list2 = c755702xH.LLIZ;
            if (list2 != null && (strArr2 = (String[]) list2.toArray(new String[0])) != null) {
                strArr = strArr2;
            }
            C813303Fr c813303Fr2 = this.LLJI;
            if (c813303Fr2 != null) {
                SkuSelection skuSelection2 = c755702xH.LLILZLL;
                Map<String, Boolean> map = N5().P;
                if (skuSelection2 != null && !Intrinsics.LJFF(skuSelection2.isWithDefaultSku, Boolean.TRUE)) {
                    C03DZ.LIZJ(c813303Fr2);
                    try {
                        ArrayList arrayList = new ArrayList();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        List<SaleProp> list3 = skuSelection2.saleProps;
                        if (list3 != null) {
                            int i4 = 0;
                            for (SaleProp saleProp : list3) {
                                int i5 = i4 + 1;
                                if (i4 >= 0) {
                                    SaleProp saleProp2 = saleProp;
                                    List<SalePropValue> list4 = saleProp2.salePropValueList;
                                    if (list4 != null && list4.size() == 1) {
                                        arrayList.add(saleProp2);
                                    } else {
                                        List<SalePropValue> list5 = saleProp2.salePropValueList;
                                        if (list5 != null && list5.size() > 1) {
                                            linkedHashMap.put(Integer.valueOf(i4), saleProp2);
                                        }
                                    }
                                    i4 = i5;
                                } else {
                                    C1697810uHb.LJIJI();
                                    throw null;
                                }
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            ProductBase productBase = skuSelection2.baseInfo;
                            if (productBase != null) {
                                sizeGuide = productBase.sizeGuide;
                            }
                            c813303Fr2.e0(sizeGuide, arrayList);
                        }
                        if (!linkedHashMap.isEmpty()) {
                            c813303Fr2.h0(skuSelection2, linkedHashMap, strArr, map);
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        C1AF0.LJFF(e, "initErrorMsg");
                    }
                } else {
                    C0H1U.LIZIZ(c813303Fr2);
                }
            }
            C1748720vbi.LJFF(this.itemView, new C10515049h(), AFwS185S0000000_1.get$arr$(459), AFwS228S0000000_1.get$arr$(717));
            C736680Sv4.LJIJJ(N5(), new AwS580S0100000_1(this, 796));
            if (this.LLILLL) {
                L5();
            }
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        C03XA c03xa = C03XA.LIZ;
        Context context = viewGroup.getContext();
        c03xa.getClass();
        View viewLIZJ = C03XA.LIZJ(context, R.layout.b2u, viewGroup, false);
        viewLIZJ.setTag("sku_item_view");
        return viewLIZJ;
    }

    @Override // X.InterfaceC813403Fs
    public final void o(SaleProp saleProp, boolean z) {
        OrderSubmitAssemViewModel orderSubmitAssemViewModelN5 = N5();
        String str = saleProp.propId;
        if (str != null) {
            orderSubmitAssemViewModelN5.P.put(str, Boolean.valueOf(z));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC813403Fs
    public final void LLJJL(int i, int i2, C041T c041t) {
        C813303Fr c813303Fr;
        SkuSelection skuSelection;
        int size;
        String str;
        List<SaleProp> list;
        List<SaleProp> list2;
        boolean zLJFF;
        C755702xH c755702xH = (C755702xH) getItem();
        if ((c755702xH == null || !Intrinsics.LJFF(c755702xH.LLJ, Boolean.TRUE)) && (c813303Fr = (C813303Fr) this.itemView.findViewById(R.id.vi5)) != null) {
            C755702xH c755702xH2 = (C755702xH) getItem();
            String str2 = null;
            if (c755702xH2 != null) {
                skuSelection = c755702xH2.LLILZLL;
            } else {
                skuSelection = null;
            }
            String[] strArr = N5().N;
            Map<String, Boolean> map = N5().P;
            AwS580S0100000_1 awS580S0100000_1 = new AwS580S0100000_1(this, 96);
            if (c041t != null && c041t.LJIIIZ != C042W.NOT_EXPANDABLE && skuSelection != null && (list2 = skuSelection.saleProps) != null) {
                int i3 = 0;
                for (SaleProp saleProp : list2) {
                    int i4 = i3 + 1;
                    if (i3 >= 0) {
                        SaleProp saleProp2 = saleProp;
                        if (i3 == i) {
                            InterfaceC813403Fs interfaceC813403Fs = c813303Fr.LL;
                            if (interfaceC813403Fs != null) {
                                if (map != null) {
                                    zLJFF = Intrinsics.LJFF(((LinkedHashMap) map).get(saleProp2.propId), Boolean.FALSE);
                                } else {
                                    zLJFF = false;
                                }
                                interfaceC813403Fs.o(saleProp2, zLJFF);
                            }
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            int i5 = 0;
                            for (SaleProp saleProp3 : skuSelection.saleProps) {
                                int i6 = i5 + 1;
                                if (i5 >= 0) {
                                    SaleProp saleProp4 = saleProp3;
                                    List<SalePropValue> list3 = saleProp4.salePropValueList;
                                    if (list3 != null && list3.size() > 1) {
                                        linkedHashMap.put(Integer.valueOf(i5), saleProp4);
                                    }
                                    i5 = i6;
                                } else {
                                    C1697810uHb.LJIJI();
                                    throw null;
                                }
                            }
                            c813303Fr.h0(skuSelection, linkedHashMap, strArr, map);
                            return;
                        }
                        List<SalePropValue> list4 = saleProp2.salePropValueList;
                        if (list4 != null) {
                            list4.size();
                        }
                        i3 = i4;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            }
            if (strArr != null) {
                Object objLJJIIZ = C13LQ.LJJIIZ(i, strArr);
                if (c041t != null) {
                    str2 = c041t.LIZ;
                }
                if (Intrinsics.LJFF(objLJJIIZ, str2)) {
                    str2 = "cancel";
                } else {
                    str2 = "select";
                }
            }
            C1748720vbi.LIZLLL(c813303Fr, new C10516049i(), new AwS52S1000000_1(str2, 45));
            C1748720vbi.LIZLLL(c813303Fr, new C049Y(), new AwS4S1202000_1(skuSelection, i, str2, c041t, i2, 2));
            if (c041t != null && c041t.LJ && Intrinsics.LJFF(str2, "cancel")) {
                return;
            }
            if (skuSelection != null && (list = skuSelection.saleProps) != null) {
                size = list.size();
            } else {
                size = 0;
            }
            String str3 = "";
            if (strArr == null) {
                strArr = new String[size];
                for (int i7 = 0; i7 < size; i7++) {
                    strArr[i7] = "";
                }
            }
            if (strArr.length < size) {
                strArr = new String[size];
                int i8 = 0;
                do {
                    strArr[i8] = "";
                    i8++;
                } while (i8 < size);
            }
            if (i < strArr.length) {
                if (Intrinsics.LJFF(str2, "cancel")) {
                    strArr[i] = "";
                } else {
                    if (c041t != null && (str = c041t.LIZ) != null) {
                        str3 = str;
                    }
                    strArr[i] = str3;
                }
                awS580S0100000_1.invoke(strArr);
            }
        }
    }

    @Override // X.InterfaceC813403Fs
    public final void b0(View view, int i, int i2, C041T c041t) {
        if (view != null) {
            C1748720vbi.LJFF(view, new C049X(), new AwS545S0100000_1(c041t, 228), new AwS23S0202000_1(this, i, c041t, i2, 0));
        }
    }
}
