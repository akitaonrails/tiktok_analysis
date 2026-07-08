package com.ss.android.ugc.aweme.poi.revisit.view;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C09R3;
import X.C0FNT;
import X.C0OM1;
import X.C1076030e6j;
import X.C1076190e6z;
import X.C1189060h32;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1308910kAL;
import X.C13BV;
import X.C13IQ;
import X.C13LE;
import X.C13LP;
import X.C15438062q;
import X.C1558520qew;
import X.C1697810uHb;
import X.C19719912Dl;
import X.C19EG;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C259800zU;
import X.C452080Ho6;
import X.C452501pT;
import X.C717610SCx;
import X.C717620SCy;
import X.C737910Sx3;
import X.C747370TTj;
import X.C786410Ut5;
import X.C891980Yyy;
import X.DialogInterfaceOnDismissListenerC1077310e8n;
import X.EnumC1177720gkk;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC665370Q7z;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.selectsheet.TuxMultiSelectionSheet;
import com.bytedance.tux.sheet.selectsheet.TuxSingleSelectionSheet;
import com.ss.android.ugc.aweme.poi.revisit.api.PoiRevisitApi;
import com.ss.android.ugc.aweme.poi.revisit.vm.PoiRevisitNavTabViewModel;
import com.ss.android.ugc.aweme.poi.revisit.vm.PoiRevisitViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.IndexedValue;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AwS382S0200000_16;
import kotlin.jvm.internal.AwS417S0200000_16;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class PoiRevisitNavTabFilterCell extends PowerCell<C1076030e6j> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZLLLIL;
    public final AssemVMLazy LL;
    public final AssemVMLazy LLILLJJLI;
    public View LLILLL;
    public TuxTextView LLILZ;
    public TuxIconView LLILZIL;
    public final List<String> LLILZLL;
    public final Map<String, Integer> LLIZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiRevisitNavTabFilterCell.class, "pageVM", "getPageVM()Lcom/ss/android/ugc/aweme/poi/revisit/vm/PoiRevisitViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(PoiRevisitNavTabFilterCell.class, "tabVM", "getTabVM()Lcom/ss/android/ugc/aweme/poi/revisit/vm/PoiRevisitNavTabViewModel;", 0);
        c09r3.getClass();
        LLIZLLLIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public PoiRevisitNavTabFilterCell() {
        AssemVMLazy assemVMLazy;
        AssemVMLazy assemVMLazy2;
        Object obj = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiRevisitViewModel.class);
        AwS560S0100000_16 awS560S0100000_16 = new AwS560S0100000_16((C13IQ) c19719912DlLIZ, 466);
        AFwS252S0000000_16 aFwS252S0000000_16 = AFwS252S0000000_16.get$arr$(310);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS560S0100000_16((C13IQ) c19719912DlLIZ, 453), awS560S0100000_16, AFwS204S0000000_16.get$arr$(222), new AwS560S0100000_16((C03K6) this, 443), new AwS560S0100000_16((C03K6) this, 454), new AwS560S0100000_16((HasDefaultViewModelProviderFactory) this, 457), aFwS252S0000000_16, new AwS560S0100000_16((C03K6) this, 460), null, new AwS560S0100000_16((C03K6) this, 463));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS560S0100000_16 awS560S0100000_162 = new AwS560S0100000_16((C03K6) this, 439);
            AwS560S0100000_16 awS560S0100000_163 = new AwS560S0100000_16((HasDefaultViewModelProviderFactory) this, 441);
            AwS560S0100000_16 awS560S0100000_164 = new AwS560S0100000_16((C13IQ) c19719912DlLIZ, 444);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS417S0200000_16((InterfaceC451590HnJ) obj, awS560S0100000_162, 28));
            AwS560S0100000_16 awS560S0100000_165 = new AwS560S0100000_16(c01gwLIZIZ, 449);
            AwS560S0100000_16 awS560S0100000_166 = new AwS560S0100000_16(c01gwLIZIZ, 452);
            AwS560S0100000_16 awS560S0100000_167 = new AwS560S0100000_16(c01gwLIZIZ, 455);
            AwS560S0100000_16 awS560S0100000_168 = new AwS560S0100000_16(c01gwLIZIZ, 458);
            AwS560S0100000_16 awS560S0100000_169 = new AwS560S0100000_16(c01gwLIZIZ, 461);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS560S0100000_164, awS560S0100000_16, new C452080Ho6(), awS560S0100000_165, awS560S0100000_166, awS560S0100000_163, aFwS252S0000000_16, awS560S0100000_167, awS560S0100000_168, awS560S0100000_169);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS560S0100000_16((C13IQ) c19719912DlLIZ, 464), awS560S0100000_16, AFwS204S0000000_16.get$arr$(227), new AwS560S0100000_16((C03K6) this, 468), new AwS560S0100000_16((C03K6) this, 470), new AwS560S0100000_16((HasDefaultViewModelProviderFactory) this, 472), aFwS252S0000000_16, new AwS560S0100000_16((C03K6) this, 474), null, new AwS560S0100000_16((C03K6) this, 421));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS560S0100000_16((C13IQ) c19719912DlLIZ, 423), awS560S0100000_16, AFwS204S0000000_16.get$arr$(223), new AwS560S0100000_16((C03K6) this, 426), new AwS560S0100000_16((C03K6) this, 427), new AwS560S0100000_16((C03K6) this, 430), aFwS252S0000000_16, null, null, new AwS560S0100000_16((C03K6) this, 432));
        }
        this.LL = assemVMLazy;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(PoiRevisitNavTabViewModel.class);
        AwS560S0100000_16 awS560S0100000_1610 = new AwS560S0100000_16((C13IQ) c19719912DlLIZ2, 435);
        AFwS252S0000000_16 aFwS252S0000000_162 = AFwS252S0000000_16.get$arr$(311);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy2 = new AssemVMLazy(new AwS560S0100000_16((C13IQ) c19719912DlLIZ2, 438), awS560S0100000_1610, AFwS204S0000000_16.get$arr$(226), new AwS560S0100000_16((C03K6) this, 442), new AwS560S0100000_16((C03K6) this, 445), new AwS560S0100000_16((HasDefaultViewModelProviderFactory) this, 447), aFwS252S0000000_162, new AwS560S0100000_16((C03K6) this, 450), null, new AwS560S0100000_16((C03K6) this, 456));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS560S0100000_16 awS560S0100000_1611 = new AwS560S0100000_16((C03K6) this, 459);
            AwS560S0100000_16 awS560S0100000_1612 = new AwS560S0100000_16((HasDefaultViewModelProviderFactory) this, 462);
            AwS560S0100000_16 awS560S0100000_1613 = new AwS560S0100000_16((C13IQ) c19719912DlLIZ2, 465);
            C01GW c01gwLIZIZ2 = C452501pT.LIZIZ(new AwS417S0200000_16((InterfaceC451590HnJ) obj, awS560S0100000_1611, 29));
            AwS560S0100000_16 awS560S0100000_1614 = new AwS560S0100000_16(c01gwLIZIZ2, 467);
            AwS560S0100000_16 awS560S0100000_1615 = new AwS560S0100000_16(c01gwLIZIZ2, 469);
            AwS560S0100000_16 awS560S0100000_1616 = new AwS560S0100000_16(c01gwLIZIZ2, 471);
            AwS560S0100000_16 awS560S0100000_1617 = new AwS560S0100000_16(c01gwLIZIZ2, 473);
            AwS560S0100000_16 awS560S0100000_1618 = new AwS560S0100000_16(c01gwLIZIZ2, 422);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = C737910Sx3.LIZ;
            assemVMLazy2 = new AssemVMLazy(awS560S0100000_1613, awS560S0100000_1610, new C452080Ho6(), awS560S0100000_1614, awS560S0100000_1615, awS560S0100000_1612, aFwS252S0000000_162, awS560S0100000_1616, awS560S0100000_1617, awS560S0100000_1618);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy2 = new AssemVMLazy(new AwS560S0100000_16((C13IQ) c19719912DlLIZ2, 424), awS560S0100000_1610, AFwS204S0000000_16.get$arr$(224), new AwS560S0100000_16((C03K6) this, 428), new AwS560S0100000_16((C03K6) this, 429), new AwS560S0100000_16((HasDefaultViewModelProviderFactory) this, 431), aFwS252S0000000_162, new AwS560S0100000_16((C03K6) this, 433), null, new AwS560S0100000_16((C03K6) this, 436));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Don't support this VMScope: ");
                sbLIZ2.append(obj);
                sbLIZ2.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
            }
            assemVMLazy2 = new AssemVMLazy(new AwS560S0100000_16((C13IQ) c19719912DlLIZ2, 437), awS560S0100000_1610, AFwS204S0000000_16.get$arr$(225), new AwS560S0100000_16((C03K6) this, 440), new AwS560S0100000_16((C03K6) this, 446), new AwS560S0100000_16((C03K6) this, 448), aFwS252S0000000_162, null, null, new AwS560S0100000_16((C03K6) this, 451));
        }
        this.LLILLJJLI = assemVMLazy2;
        List<String> listLJIIJJI = C1697810uHb.LJIIJJI("Food and Drink", "Travel", "Hotel", "Beauty", "Leisure", "Others");
        this.LLILZLL = listLJIIJJI;
        C717620SCy c717620SCyLLIIL = C13LP.LLIIL(listLJIIJJI);
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(c717620SCyLLIIL, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ < 16 ? 16 : iLIZIZ);
        Iterator it2 = c717620SCyLLIIL.iterator();
        while (true) {
            C717610SCx c717610SCx = (C717610SCx) it2;
            if (!c717610SCx.hasNext()) {
                this.LLIZ = linkedHashMap;
                return;
            } else {
                IndexedValue indexedValue = (IndexedValue) c717610SCx.next();
                Pair pair = new Pair(indexedValue.LIZIZ, Integer.valueOf(indexedValue.LIZ));
                linkedHashMap.put(pair.getFirst(), pair.getSecond());
            }
        }
    }

    public final PoiRevisitViewModel L5() {
        AssemVMLazy assemVMLazy = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLIZLLLIL;
        return (PoiRevisitViewModel) assemVMLazy.getValue();
    }

    public final PoiRevisitNavTabViewModel N5() {
        AssemVMLazy assemVMLazy = this.LLILLJJLI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLIZLLLIL;
        return (PoiRevisitNavTabViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.LLILLL = this.itemView.findViewById(R.id.p2k);
        this.LLILZ = (TuxTextView) this.itemView.findViewById(R.id.ulp);
        this.LLILZIL = (TuxIconView) this.itemView.findViewById(R.id.uln);
        View view = this.LLILLL;
        if (view != null) {
            C1189060h32.LJJIIJ(view, new AwS595S0100000_16(this, 122));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009a A[PHI: r0
      0x009a: PHI (r0v21 java.lang.String) = 
      (r0v4 java.lang.String)
      (r0v8 java.lang.String)
      (r0v12 java.lang.String)
      (r0v16 java.lang.String)
      (r0v20 java.lang.String)
      (r0v25 java.lang.String)
     binds: [B:45:0x0097, B:38:0x007f, B:31:0x0067, B:24:0x004f, B:17:0x0037, B:10:0x001f] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String I5(java.lang.String r4) {
        /*
            r3 = this;
            int r0 = r4.hashCode()
            java.lang.String r2 = ""
            switch(r0) {
                case -1922936957: goto La;
                case -1781830854: goto L22;
                case -349382707: goto L3a;
                case 69915028: goto L52;
                case 1722859013: goto L6a;
                case 1985805468: goto L82;
                default: goto L9;
            }
        L9:
            return r2
        La:
            java.lang.String r0 = "Others"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L9
            android.content.Context r1 = r3.getContext()
            if (r1 == 0) goto L9
            r0 = 2131844711(0x7f115e67, float:1.9322822E38)
            java.lang.String r0 = r1.getString(r0)
            if (r0 != 0) goto L9a
            return r2
        L22:
            java.lang.String r0 = "Travel"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L9
            android.content.Context r1 = r3.getContext()
            if (r1 == 0) goto L9
            r0 = 2131844706(0x7f115e62, float:1.9322812E38)
            java.lang.String r0 = r1.getString(r0)
            if (r0 != 0) goto L9a
            return r2
        L3a:
            java.lang.String r0 = "Food and Drink"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L9
            android.content.Context r1 = r3.getContext()
            if (r1 == 0) goto L9
            r0 = 2131844707(0x7f115e63, float:1.9322814E38)
            java.lang.String r0 = r1.getString(r0)
            if (r0 != 0) goto L9a
            return r2
        L52:
            java.lang.String r0 = "Hotel"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L9
            android.content.Context r1 = r3.getContext()
            if (r1 == 0) goto L9
            r0 = 2131844708(0x7f115e64, float:1.9322816E38)
            java.lang.String r0 = r1.getString(r0)
            if (r0 != 0) goto L9a
            return r2
        L6a:
            java.lang.String r0 = "Leisure"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L9
            android.content.Context r1 = r3.getContext()
            if (r1 == 0) goto L9
            r0 = 2131844710(0x7f115e66, float:1.932282E38)
            java.lang.String r0 = r1.getString(r0)
            if (r0 != 0) goto L9a
            return r2
        L82:
            java.lang.String r0 = "Beauty"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L9
            android.content.Context r1 = r3.getContext()
            if (r1 == 0) goto L9
            r0 = 2131844709(0x7f115e65, float:1.9322818E38)
            java.lang.String r0 = r1.getString(r0)
            if (r0 != 0) goto L9a
            return r2
        L9a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.revisit.view.PoiRevisitNavTabFilterCell.I5(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    /* JADX WARN: Type inference failed for: r0v11, types: [T, com.bytedance.tux.sheet.selectsheet.TuxMultiSelectionSheet] */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List<X.0TTj>] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void P5(X.C1076030e6j r14) {
        /*
            Method dump skipped, instruction units count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.revisit.view.PoiRevisitNavTabFilterCell.P5(X.0e6j):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [T, com.bytedance.tux.sheet.selectsheet.TuxSingleSelectionSheet] */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List<X.0TTj>] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
    public final void R5(C1076030e6j c1076030e6j) {
        List<String> listLJJJJI;
        String str;
        ?? arrayList;
        String string;
        C19EG c19eg;
        FragmentManager supportFragmentManager;
        List<PoiRevisitApi.PoiRevisitCardModel> list;
        PoiRevisitApi.GeoInfo geoInfo;
        String str2;
        IPoiRevisitMapAssemAbility iPoiRevisitMapAssemAbility;
        C1076190e6z c1076190e6z = L5().LL;
        PoiRevisitViewModel.zQ2(c1076190e6z.LIZ, null);
        EnumC1177720gkk enumC1177720gkk = c1076190e6z.LIZIZ;
        if (enumC1177720gkk != null) {
            enumC1177720gkk.onRegionFilterChanged(c1076190e6z);
        }
        InterfaceC665370Q7z interfaceC665370Q7z = L5().LLJ;
        if (interfaceC665370Q7z != null && (iPoiRevisitMapAssemAbility = (IPoiRevisitMapAssemAbility) C1558520qew.LIZ(interfaceC665370Q7z, IPoiRevisitMapAssemAbility.class, null)) != null) {
            iPoiRevisitMapAssemAbility.ZX0();
        }
        PoiRevisitApi.PoiRevisitCardListResponse poiRevisitCardListResponseWQ2 = L5().wQ2(false, true, true);
        if (poiRevisitCardListResponseWQ2 != null && (list = poiRevisitCardListResponseWQ2.poiCardList) != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator<PoiRevisitApi.PoiRevisitCardModel> it2 = list.iterator();
            while (it2.hasNext()) {
                PoiRevisitApi.PoiGeoInfo poiGeoInfo = it2.next().poiGeoInfo;
                if (poiGeoInfo != null && (geoInfo = poiGeoInfo.l2) != null && (str2 = geoInfo.geoName) != null) {
                    arrayList2.add(str2);
                }
            }
            listLJJJJI = C13LP.LJJJJI(arrayList2);
        } else {
            listLJJJJI = null;
        }
        C1076030e6j c1076030e6j2 = N5().LL;
        if (c1076030e6j2 != null) {
            str = c1076030e6j2.LLILLJJLI;
        } else {
            str = null;
        }
        if (listLJJJJI != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(listLJJJJI, 10));
            for (String str3 : listLJJJJI) {
                arrayList.add(new C747370TTj(str3, null, Intrinsics.LJFF(str3, str), null, null, 26));
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        C259800zU c259800zU = new C259800zU();
        Context context = getContext();
        if (context == null || (string = context.getString(2131844716)) == null) {
            string = "";
        }
        C891980Yyy c891980Yyy = new C891980Yyy();
        C0OM1 c0om1 = new C0OM1();
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = string;
        c0om1.LIZJ = c1250250idj;
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
        c1251150ifB.LIZJ(new AwS560S0100000_16(c259800zU, (C259800zU<TuxMultiSelectionSheet>) 434));
        c0om1.LIZIZ(c1251150ifB);
        c0om1.LIZLLL = false;
        TuxSingleSelectionSheet tuxSingleSelectionSheet = c891980Yyy.LIZ;
        tuxSingleSelectionSheet.LLJJIII = c0om1;
        tuxSingleSelectionSheet.LLJJIJI = 0;
        tuxSingleSelectionSheet.LLJJIJIL = arrayList;
        tuxSingleSelectionSheet.LLILLJJLI = new DialogInterfaceOnDismissListenerC1077310e8n(this, c1076030e6j, 1);
        AwS382S0200000_16 awS382S0200000_16 = new AwS382S0200000_16(this, c1076030e6j, 36);
        ?? r0 = c891980Yyy.LIZ;
        r0.LLJJJ = awS382S0200000_16;
        c259800zU.element = r0;
        Activity activityLIZ = C0FNT.LIZ(this.itemView.getContext());
        if ((activityLIZ instanceof C19EG) && (c19eg = (C19EG) activityLIZ) != null && (supportFragmentManager = c19eg.getSupportFragmentManager()) != null) {
            ((DialogFragment) c259800zU.element).show(supportFragmentManager, "PoiRevisitFilterCell");
        }
    }

    public final void S5(C1076030e6j c1076030e6j) {
        Integer numLIZJ;
        Integer numLIZJ2;
        View view = this.LLILLL;
        if (view != null) {
            view.setBackgroundResource(R.drawable.cvh);
        }
        TuxTextView tuxTextView = this.LLILZ;
        if (tuxTextView != null) {
            String str = c1076030e6j.LLILLJJLI;
            if (str == null) {
                str = c1076030e6j.LLILLL;
            }
            tuxTextView.setText(str);
        }
        Context context = getContext();
        if (context != null && (numLIZJ2 = C1308910kAL.LIZJ(R.attr.a00, context)) != null) {
            int iIntValue = numLIZJ2.intValue();
            TuxTextView tuxTextView2 = this.LLILZ;
            if (tuxTextView2 != null) {
                tuxTextView2.setTextColor(iIntValue);
            }
        }
        Context context2 = getContext();
        if (context2 != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a00, context2)) != null) {
            int iIntValue2 = numLIZJ.intValue();
            TuxIconView tuxIconView = this.LLILZIL;
            if (tuxIconView != null) {
                tuxIconView.setTintColor(iIntValue2);
            }
        }
    }

    public final void T5(C1076030e6j c1076030e6j) {
        Integer numLIZJ;
        Integer numLIZJ2;
        View view = this.LLILLL;
        if (view != null) {
            view.setBackgroundResource(R.drawable.cvi);
        }
        TuxTextView tuxTextView = this.LLILZ;
        if (tuxTextView != null) {
            tuxTextView.setText(c1076030e6j.LLILLL);
        }
        Context context = getContext();
        if (context != null && (numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1j, context)) != null) {
            int iIntValue = numLIZJ2.intValue();
            TuxTextView tuxTextView2 = this.LLILZ;
            if (tuxTextView2 != null) {
                tuxTextView2.setTextColor(iIntValue);
            }
        }
        Context context2 = getContext();
        if (context2 != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a1k, context2)) != null) {
            int iIntValue2 = numLIZJ.intValue();
            TuxIconView tuxIconView = this.LLILZIL;
            if (tuxIconView != null) {
                tuxIconView.setTintColor(iIntValue2);
            }
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1076030e6j c1076030e6j = (C1076030e6j) interfaceC1891350zJl;
        super.onBindItemView(c1076030e6j);
        try {
            if (c1076030e6j.LL) {
                S5(c1076030e6j);
            } else {
                T5(c1076030e6j);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("something was wrong with onBindItemView, e.message=");
            sbLIZ.append(e.getMessage());
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.e8j, viewGroup, false);
    }
}
