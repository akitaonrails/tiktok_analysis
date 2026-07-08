package com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.addon;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03BW;
import X.C03BY;
import X.C03IJ;
import X.C03K6;
import X.C03O0;
import X.C03XA;
import X.C09R3;
import X.C1077804Jk;
import X.C13LE;
import X.C1697810uHb;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C23271099x;
import X.C452080Ho6;
import X.C452501pT;
import X.C719102rN;
import X.C737910Sx3;
import X.C752702wn;
import X.C752802wo;
import X.C770702zh;
import X.C7727030b;
import X.C799503Aj;
import X.C826403Ks;
import X.C948503nH;
import X.EnumC804503Ch;
import X.EnumC805403Cq;
import X.EnumC805503Cr;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import Y.ARunnableS101S0100000_1;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.AddOnFeed;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.utils.SafeHandler;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS420S0200000_19;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class USAddonOrderCell extends ECPowerCell<C752802wo> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJZ;
    public final AssemVMLazy LLJ;
    public final AssemVMLazy LLJI;
    public final Map<Integer, Boolean> LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public final List<String> LLJILLL;
    public boolean LLJJ;
    public Map<String, Integer> LLJJI;
    public int LLJJIII;
    public boolean LLJJIJI;
    public String LLJJIJIIJIL;
    public final Map<String, String> LLJJIJIL;
    public boolean LLJJJ;
    public boolean LLJJJIL;
    public boolean LLJJJJ;
    public boolean LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public int LLJJL;
    public final SafeHandler LLJJLIIIJLLLLLLLZ;
    public final ARunnableS101S0100000_1 LLJL;
    public boolean LLJLIL;
    public HashMap<String, Object> LLJLILLLLZIIL;
    public HashMap<String, Object> LLJLL;
    public C03BW LLJLLIL;
    public final C1077804Jk LLJLLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(USAddonOrderCell.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/vm/OrderSubmitAssemViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(USAddonOrderCell.class, "addonVM", "getAddonVM()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/module/us/addon/OspAddonOrderViewModel;", 0);
        c09r3.getClass();
        LLJZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public USAddonOrderCell() {
        AssemVMLazy assemVMLazy;
        AssemVMLazy assemVMLazy2;
        Object obj = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(OrderSubmitAssemViewModel.class);
        AwS545S0100000_1 awS545S0100000_1 = new AwS545S0100000_1(c19719912DlLIZ, 502);
        AFwS228S0000000_1 aFwS228S0000000_1 = AFwS228S0000000_1.get$arr$(104);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ, 493), awS545S0100000_1, AFwS207S0000000_19.get$arr$(150), new AwS545S0100000_1((C03K6) this, 486), new AwS545S0100000_1((C03K6) this, 494), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 496), aFwS228S0000000_1, new AwS563S0100000_19((C03K6) this, 1179), null, new AwS545S0100000_1((C03K6) this, 499));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS545S0100000_1 awS545S0100000_12 = new AwS545S0100000_1((C03K6) this, 482);
            AwS545S0100000_1 awS545S0100000_13 = new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 484);
            AwS545S0100000_1 awS545S0100000_14 = new AwS545S0100000_1(c19719912DlLIZ, 487);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS420S0200000_19((InterfaceC451590HnJ) obj, awS545S0100000_12, 58));
            AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(c01gwLIZIZ, 1174);
            AwS563S0100000_19 awS563S0100000_192 = new AwS563S0100000_19(c01gwLIZIZ, 1176);
            AwS563S0100000_19 awS563S0100000_193 = new AwS563S0100000_19(c01gwLIZIZ, 1177);
            AwS563S0100000_19 awS563S0100000_194 = new AwS563S0100000_19(c01gwLIZIZ, 1178);
            AwS563S0100000_19 awS563S0100000_195 = new AwS563S0100000_19(c01gwLIZIZ, 1180);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS545S0100000_14, awS545S0100000_1, new C452080Ho6(), awS563S0100000_19, awS563S0100000_192, awS545S0100000_13, aFwS228S0000000_1, awS563S0100000_193, awS563S0100000_194, awS563S0100000_195);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ, 500), awS545S0100000_1, AFwS207S0000000_19.get$arr$(149), new AwS545S0100000_1((C03K6) this, 503), new AwS545S0100000_1((C03K6) this, 504), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 505), aFwS228S0000000_1, new AwS563S0100000_19((C03K6) this, 1185), null, new AwS545S0100000_1((C03K6) this, 506));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ, 507), awS545S0100000_1, AFwS207S0000000_19.get$arr$(151), new AwS545S0100000_1((C03K6) this, 509), new AwS545S0100000_1((C03K6) this, 511), new AwS545S0100000_1((C03K6) this, 514), aFwS228S0000000_1, null, null, new AwS545S0100000_1((C03K6) this, 477));
        }
        this.LLJ = assemVMLazy;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(OspAddonOrderViewModel.class);
        AwS545S0100000_1 awS545S0100000_15 = new AwS545S0100000_1(c19719912DlLIZ2, 478);
        AFwS228S0000000_1 aFwS228S0000000_12 = AFwS228S0000000_1.get$arr$(103);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy2 = new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ2, 481), awS545S0100000_15, AFwS207S0000000_19.get$arr$(148), new AwS545S0100000_1((C03K6) this, 485), new AwS545S0100000_1((C03K6) this, 488), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 490), aFwS228S0000000_12, new AwS563S0100000_19((C03K6) this, 1175), null, new AwS545S0100000_1((C03K6) this, 495));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS545S0100000_1 awS545S0100000_16 = new AwS545S0100000_1((C03K6) this, 497);
            AwS545S0100000_1 awS545S0100000_17 = new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 498);
            AwS545S0100000_1 awS545S0100000_18 = new AwS545S0100000_1(c19719912DlLIZ2, 501);
            C01GW c01gwLIZIZ2 = C452501pT.LIZIZ(new AwS420S0200000_19((InterfaceC451590HnJ) obj, awS545S0100000_16, 59));
            AwS563S0100000_19 awS563S0100000_196 = new AwS563S0100000_19(c01gwLIZIZ2, 1181);
            AwS563S0100000_19 awS563S0100000_197 = new AwS563S0100000_19(c01gwLIZIZ2, 1182);
            AwS563S0100000_19 awS563S0100000_198 = new AwS563S0100000_19(c01gwLIZIZ2, 1183);
            AwS563S0100000_19 awS563S0100000_199 = new AwS563S0100000_19(c01gwLIZIZ2, 1184);
            AwS563S0100000_19 awS563S0100000_1910 = new AwS563S0100000_19(c01gwLIZIZ2, 1186);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = C737910Sx3.LIZ;
            assemVMLazy2 = new AssemVMLazy(awS545S0100000_18, awS545S0100000_15, new C452080Ho6(), awS563S0100000_196, awS563S0100000_197, awS545S0100000_17, aFwS228S0000000_12, awS563S0100000_198, awS563S0100000_199, awS563S0100000_1910);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy2 = new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ2, 508), awS545S0100000_15, AFwS207S0000000_19.get$arr$(152), new AwS545S0100000_1((C03K6) this, 510), new AwS545S0100000_1((C03K6) this, 512), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 513), aFwS228S0000000_12, new AwS563S0100000_19((C03K6) this, 1173), null, new AwS545S0100000_1((C03K6) this, 479));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Don't support this VMScope: ");
                sbLIZ2.append(obj);
                sbLIZ2.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
            }
            assemVMLazy2 = new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ2, 480), awS545S0100000_15, AFwS207S0000000_19.get$arr$(147), new AwS545S0100000_1((C03K6) this, 483), new AwS545S0100000_1((C03K6) this, 489), new AwS545S0100000_1((C03K6) this, 491), aFwS228S0000000_12, null, null, new AwS545S0100000_1((C03K6) this, 492));
        }
        this.LLJI = assemVMLazy2;
        this.LLJIJIL = new LinkedHashMap();
        this.LLJILJILJ = true;
        this.LLJILLL = new ArrayList();
        this.LLJJI = new LinkedHashMap();
        this.LLJJIJIIJIL = "";
        this.LLJJIJIL = new LinkedHashMap();
        this.LLJJLIIIJLLLLLLLZ = new SafeHandler(this);
        this.LLJL = new ARunnableS101S0100000_1(this, 7);
        this.LLJLLL = new C1077804Jk(this, 1);
    }

    public final void L5() {
        List<C719102rN> list;
        C719102rN c719102rN;
        String str;
        ArrayList arrayList = new ArrayList();
        RecyclerView recyclerView = (RecyclerView) this.itemView.findViewById(R.id.ag5);
        boolean z = false;
        if (recyclerView != null) {
            int childCount = recyclerView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                if (childAt != null && childAt.getLocalVisibleRect(new Rect())) {
                    int childAdapterPosition = recyclerView.getChildAdapterPosition(childAt);
                    C752702wn c752702wn = T5().LLILZLL;
                    if (c752702wn != null && (list = c752702wn.LLILZLL) != null && (c719102rN = (C719102rN) C7727030b.LIZ(childAdapterPosition, list)) != null && (str = c719102rN.LLILZLL) != null) {
                        arrayList.add(str);
                    }
                }
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            if (!((ArrayList) this.LLJILLL).contains(it2.next())) {
                z = true;
            }
        }
        if (z) {
            ((ArrayList) this.LLJILLL).clear();
            ((ArrayList) this.LLJILLL).addAll(arrayList);
            ArrayList arrayList2 = new ArrayList();
            Iterator it3 = ((ArrayList) this.LLJILLL).iterator();
            while (it3.hasNext()) {
                arrayList2.add(new AddOnFeed((String) it3.next(), 1));
            }
            C948503nH.LJI(R5(), C23271099x.INSTANCE, new C826403Ks(T5(), arrayList2, null));
        }
    }

    public final void N5() {
        C719102rN displaySkuInfo;
        C799503Aj c799503Aj = (C799503Aj) this.itemView.findViewById(R.id.agc);
        String str = (c799503Aj == null || (displaySkuInfo = c799503Aj.getDisplaySkuInfo()) == null) ? null : displaySkuInfo.LLILZLL;
        if (!C770702zh.LIZIZ(str) || ((ArrayList) this.LLJILLL).contains(str)) {
            return;
        }
        ((ArrayList) this.LLJILLL).add(str);
        C948503nH.LJI(R5(), C23271099x.INSTANCE, new C826403Ks(T5(), C1697810uHb.LJIILJJIL(new AddOnFeed(str, 1)), null));
    }

    public final OspAddonOrderViewModel R5() {
        AssemVMLazy assemVMLazy = this.LLJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJZ;
        return (OspAddonOrderViewModel) assemVMLazy.getValue();
    }

    public final OrderSubmitAssemViewModel T5() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJZ;
        return (OrderSubmitAssemViewModel) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell, com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onCreate() {
        super.onCreate();
    }

    public final void b6(C752702wn c752702wn) {
        int i = 0;
        for (C719102rN c719102rN : c752702wn.LLILZLL) {
            int i2 = i + 1;
            if (i >= 0) {
                C719102rN c719102rN2 = c719102rN;
                if (!this.LLJIJIL.containsKey(Integer.valueOf(i2))) {
                    a6(c719102rN2, i2);
                } else {
                    if (Intrinsics.LJFF(((LinkedHashMap) this.LLJIJIL).get(Integer.valueOf(i2)), Boolean.FALSE)) {
                        a6(c719102rN2, i2);
                    }
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x04df  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0530  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x05c4  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x05cf  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x05df  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0665 A[PHI: r12
      0x0665: PHI (r12v8 java.lang.String) = (r12v6 java.lang.String), (r12v9 java.lang.String) binds: [B:333:0x0663, B:331:0x0660] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:359:0x02e7 A[EDGE_INSN: B:359:0x02e7->B:169:0x02e7 BREAK  A[LOOP:0: B:122:0x0205->B:362:0x0205], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:409:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01c3  */
    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell, com.bytedance.ies.powerlist.PowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindItemView(X.InterfaceC1891350zJl r28) {
        /*
            Method dump skipped, instruction units count: 1762
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.addon.USAddonOrderCell.onBindItemView(X.0zJl):void");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        C03XA c03xa = C03XA.LIZ;
        Context context = viewGroup.getContext();
        c03xa.getClass();
        return C03XA.LIZJ(context, R.layout.b1p, viewGroup, false);
    }

    public final List<C03BY> P5(C752702wn c752702wn, int i) {
        boolean zBooleanValue;
        Boolean bool;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        for (C719102rN c719102rN : c752702wn.LLILZLL) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                C719102rN c719102rN2 = c719102rN;
                String str = c719102rN2.LLILZLL;
                String str2 = "";
                if (str == null) {
                    str = "";
                }
                String str3 = c719102rN2.LLLLIL;
                if (str3 != null) {
                    str2 = str3;
                }
                Map<String, Boolean> map = c752702wn.LLIZ;
                if (map != null && (bool = map.get(str)) != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    zBooleanValue = false;
                }
                String str4 = c719102rN2.LLLLLIL;
                boolean z = true;
                if (str4 != null && str4.length() > 0) {
                    this.LLJJIJIIJIL = str4;
                }
                String str5 = c719102rN2.LLLLLILLIL;
                if (str5 != null && str5.length() > 0) {
                    this.LLJJIJIL.put(str2, str5);
                }
                Integer num = (Integer) ((LinkedHashMap) T5().LLLLLZIL).get(c719102rN2.LLLLIL);
                if (i2 != c752702wn.LLILZLL.size() - 1) {
                    z = false;
                }
                arrayList.add(new C03BY(c719102rN2, i, zBooleanValue, i3, num, Boolean.valueOf(z)));
                i2 = i3;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:96:0x014c  */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20, types: [int] */
    /* JADX WARN: Type inference failed for: r0v46 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.HashMap<java.lang.String, java.lang.Object> S5(X.C719102rN r7, int r8) {
        /*
            Method dump skipped, instruction units count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.addon.USAddonOrderCell.S5(X.02rN, int):java.util.HashMap");
    }

    public final void U5(String str, Map<String, ? extends Object> map) {
        HashMap<String, Object> mapHi1 = T5().hi1(false);
        mapHi1.put("module_name", "add_on_reminder");
        mapHi1.put("module_type", "display_product_card");
        if (map != null) {
            mapHi1.putAll(map);
        }
        HashMap<String, Object> map2 = this.LLJLL;
        if (map2 != null) {
            map2.putAll(mapHi1);
        } else {
            map2 = null;
        }
        X5(str, map2, null, null);
    }

    public final void W5(String str, EnumC805503Cr enumC805503Cr) {
        String str2;
        if (this.LLJJJ) {
            HashMap<String, Object> map = this.LLJLL;
            if (map != null) {
                map.put("action_type", str);
                if (enumC805503Cr == EnumC805503Cr.BUTTON) {
                    str2 = "check_box";
                } else {
                    str2 = "other";
                }
                map.put("click_area", str2);
            } else {
                map = null;
            }
            X5("tiktokec_product_select_option", map, null, null);
        }
    }

    public final void a6(C719102rN c719102rN, int i) {
        String string;
        String str;
        String str2;
        Object obj;
        OrderSubmitAssemViewModel orderSubmitAssemViewModelT5 = T5();
        HashMap<String, Object> map = T5().LLLIL;
        String str3 = "";
        if (map == null || (obj = map.get("track_id")) == null || (string = obj.toString()) == null) {
            string = "";
        }
        orderSubmitAssemViewModelT5.LLLLLJLJLL = string;
        C03O0 c03o0 = C03O0.LIZ;
        HashMap<String, Object> mapS5 = S5(c719102rN, i);
        Map<String, String> map2 = T5().LLLLLLIL;
        String str4 = null;
        if (c719102rN != null) {
            str = c719102rN.LLILZLL;
        } else {
            str = null;
        }
        String str5 = (String) ((HashMap) map2).get(str);
        if (str5 == null) {
            str5 = "";
        }
        HashMap<String, Object> map3 = this.LLJLILLLLZIIL;
        c03o0.getClass();
        C03O0.LJJLIIIJL("tiktokec_product_show", str5, mapS5, map3);
        HashMap<String, Object> mapS52 = S5(c719102rN, i);
        mapS52.put("card_name", "rec_goods_card");
        if (c719102rN != null) {
            str2 = c719102rN.LLJJIJIL;
        } else {
            str2 = null;
        }
        mapS52.put("author_id", String.valueOf(str2));
        Map<String, String> map4 = T5().LLLLLLIL;
        if (c719102rN != null) {
            str4 = c719102rN.LLILZLL;
        }
        String str6 = (String) ((HashMap) map4).get(str4);
        if (str6 != null) {
            str3 = str6;
        }
        C03O0.LJJLIIIJL("tiktokec_card_show", str3, mapS52, this.LLJLILLLLZIIL);
        this.LLJIJIL.put(Integer.valueOf(i), Boolean.TRUE);
    }

    public final void V5(String str, EnumC805503Cr enumC805503Cr, C719102rN c719102rN, int i) {
        String str2;
        if (this.LLJJJJLIIL) {
            C03O0 c03o0 = C03O0.LIZ;
            HashMap<String, Object> mapS5 = S5(c719102rN, i);
            mapS5.put("click_area", enumC805503Cr.getValue());
            mapS5.put("action_type", str);
            Map<String, String> map = T5().LLLLLLIL;
            if (c719102rN != null) {
                str2 = c719102rN.LLILZLL;
            } else {
                str2 = null;
            }
            String str3 = (String) ((HashMap) map).get(str2);
            if (str3 == null) {
                str3 = "";
            }
            HashMap<String, Object> map2 = this.LLJLILLLLZIIL;
            c03o0.getClass();
            C03O0.LJJLIIIJL("tiktokec_product_select_option", str3, mapS5, map2);
        }
    }

    public final void X5(String str, HashMap<String, Object> map, C719102rN c719102rN, Integer num) {
        C752702wn c752702wn;
        Integer num2;
        String str2;
        C752702wn c752702wn2 = T5().LLILZLL;
        if (c752702wn2 != null) {
            Integer num3 = c752702wn2.LLJJ;
            int value = EnumC804503Ch.ADDON.getValue();
            if (num3 != null && num3.intValue() == value && (c752702wn = T5().LLILZLL) != null && (num2 = c752702wn.LLJ) != null && num2.intValue() == 10) {
                if (map != null) {
                    OspAddonOrderViewModel ospAddonOrderViewModelR5 = R5();
                    if (c719102rN == null || (str2 = c719102rN.LLILZLL) == null) {
                        str2 = "";
                    }
                    ospAddonOrderViewModelR5.vQ2(str2, map);
                }
                C03O0 c03o0 = C03O0.LIZ;
                EnumC805403Cq enumC805403Cq = EnumC805403Cq.ADD_ITEM_ORDER;
                c03o0.getClass();
                C03O0.LJJJJLI(str, map, c719102rN, num, enumC805403Cq);
            }
        }
    }
}
