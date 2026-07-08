package com.ss.android.ugc.aweme.tako.otherpage.image.create;

import X.AbstractC21673619ry;
import X.AbstractC848400XPy;
import X.C01D1;
import X.C0PEM;
import X.C0XQ7;
import X.C1153130g75;
import X.C1203130hPj;
import X.C1203140hPk;
import X.C1203200hPq;
import X.C1308910kAL;
import X.C13LE;
import X.C13LP;
import X.C15438062q;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1582480rHa;
import X.C1637806bA;
import X.C1749280vcc;
import X.C1852270yIj;
import X.C1852480yJ4;
import X.C1852650yJL;
import X.C1860520yW2;
import X.C1864580yca;
import X.C19719912Dl;
import X.C20600815jK;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C23250099c;
import X.C325190Cov;
import X.C622840Obq;
import X.C723580SZw;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.EnumC622850Obr;
import X.InterfaceC1203170hPn;
import X.InterfaceC1554640qYg;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC636730OyF;
import X.ViewOnAttachStateChangeListenerC20631115oD;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewModelKt;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.tako.ccl.net.TemplateTabData;
import com.ss.android.ugc.aweme.tako.ccl.net.TemplateTabsResponse;
import com.ss.android.ugc.aweme.tako.model.TakoPageContext;
import com.ss.android.ugc.aweme.tako.otherpage.image.create.TakoImageCreateMultiTabAssem;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS641S0100000_27;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoImageCreateMultiTabAssem extends UISlotAssem implements ITakoMultiTabTemplateAbility, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJJIL;
    public C1203130hPj LLJJI;
    public ViewOnAttachStateChangeListenerC20631115oD LLJJIII;
    public ViewGroup LLJJIJI;
    public C1749280vcc LLJJIJIIJIL;
    public int LLJJIJIL = -1;
    public final AssemVMLazy LLJJJ;
    public TemplateTabsResponse LLJJJIL;
    public final C1559260qg8 LLJJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TakoImageCreateMultiTabAssem.class, "templateSquareVM", "getTemplateSquareVM()Lcom/ss/android/ugc/aweme/tako/otherpage/image/create/TakoImageTemplateTabViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public TakoImageCreateMultiTabAssem() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TakoImageTemplateTabViewModel.class);
        this.LLJJJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 1346), AFwS269S0000000_27.get$arr$(274), null, true);
        this.LLJJJJ = new C1559260qg8(new C723580SZw(this, TakoPageContext.class, null), checkSupervisorPrepared());
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.fon;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -62267471) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.aweme.tako.otherpage.image.create.ITakoMultiTabTemplateAbility
    public final boolean cm1() {
        TemplateTabsResponse templateTabsResponse = this.LLJJJIL;
        if (templateTabsResponse == null) {
            return false;
        }
        Iterator<TemplateTabData> it2 = templateTabsResponse.tabs.iterator();
        int i = 0;
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            if (!C1852480yJ4.LIZ(it2.next())) {
                i++;
            } else if (i >= 0) {
                C13LP.LJJJLZIJ(i, templateTabsResponse.tabs);
                C1203130hPj c1203130hPj = this.LLJJI;
                if (c1203130hPj != null) {
                    c1203130hPj.LIZ(i, true, C1203200hPq.LIZ);
                }
                ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD = this.LLJJIII;
                if (viewOnAttachStateChangeListenerC20631115oD != null) {
                    viewOnAttachStateChangeListenerC20631115oD.setCurrentItem(i, false);
                }
                hp(i);
                return true;
            }
        }
        return false;
    }

    public final void ip() {
        InterfaceC636730OyF fragmentItemOperator;
        InterfaceC636730OyF fragmentItemOperator2;
        C20600815jK<InterfaceC1891350zJl> state;
        ViewGroup viewGroup = this.LLJJIJI;
        if (viewGroup != null) {
            C786410Ut5.LJLZ(8, viewGroup);
        }
        C1203130hPj c1203130hPj = this.LLJJI;
        if (c1203130hPj != null) {
            C786410Ut5.LLLLLLL(c1203130hPj, 0);
        }
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD = this.LLJJIII;
        if (viewOnAttachStateChangeListenerC20631115oD != null) {
            C786410Ut5.LLLLL(viewOnAttachStateChangeListenerC20631115oD, 0);
        }
        C1860520yW2.LIZ.getClass();
        TemplateTabsResponse templateTabsResponseLJIILJJIL = C1860520yW2.LJIILJJIL();
        this.LLJJJIL = templateTabsResponseLJIILJJIL;
        List<TemplateTabData> list = templateTabsResponseLJIILJJIL.tabs;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<TemplateTabData> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().tabName);
        }
        C1203130hPj c1203130hPj2 = this.LLJJI;
        Integer numValueOf = null;
        if (c1203130hPj2 != null) {
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                arrayList2.add(new C1203140hPk((String) it3.next(), null, 14));
            }
            c1203130hPj2.setChips(arrayList2);
        }
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD2 = this.LLJJIII;
        if (viewOnAttachStateChangeListenerC20631115oD2 != null && (fragmentItemOperator2 = viewOnAttachStateChangeListenerC20631115oD2.getFragmentItemOperator()) != null && (state = fragmentItemOperator2.getState()) != null) {
            List<TemplateTabData> list2 = templateTabsResponseLJIILJJIL.tabs;
            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list2, 10));
            for (TemplateTabData templateTabData : list2) {
                arrayList3.add(new TabTemplateFragmentItem(templateTabData.tabId, templateTabData.tabName, templateTabData.tabEnName, templateTabData.tabType, (TakoPageContext) this.LLJJJJ.getValue()));
            }
            state.LIZLLL(arrayList3, null);
        }
        C1852270yIj.LIZ.getClass();
        C1852650yJL c1852650yJL = C1852270yIj.LIZLLL;
        String str = c1852650yJL != null ? c1852650yJL.LJIIIZ : null;
        if (str != null && str.length() > 0) {
            Iterator<TemplateTabData> it4 = templateTabsResponseLJIILJJIL.tabs.iterator();
            int i = 0;
            while (true) {
                if (!it4.hasNext()) {
                    i = -1;
                    break;
                } else if (Intrinsics.LJFF(it4.next().tabId, str)) {
                    break;
                } else {
                    i++;
                }
            }
            numValueOf = Integer.valueOf(i);
        }
        C622840Obq c622840Obq = new C622840Obq();
        c622840Obq.LJI = false;
        c622840Obq.LJIIIZ = numValueOf != null ? numValueOf.intValue() : 0;
        c622840Obq.LJIIJ = true;
        c622840Obq.LJII = EnumC622850Obr.LIMITED_NUM_FRAGMENTS_NO_DESTROY;
        c622840Obq.LIZ = 1;
        c622840Obq.LJIIIIZZ = 3;
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD3 = this.LLJJIII;
        if (viewOnAttachStateChangeListenerC20631115oD3 == null || (fragmentItemOperator = viewOnAttachStateChangeListenerC20631115oD3.getFragmentItemOperator()) == null) {
            return;
        }
        fragmentItemOperator.LIZLLL(c622840Obq);
    }

    @Override // com.ss.android.ugc.aweme.tako.otherpage.image.create.ITakoMultiTabTemplateAbility
    public final TemplateTabData j50() {
        List<TemplateTabData> list;
        Integer numValueOf = Integer.valueOf(this.LLJJIJIL);
        int iIntValue = numValueOf.intValue() >= 0 ? numValueOf.intValue() : 0;
        TemplateTabsResponse templateTabsResponse = this.LLJJJIL;
        if (templateTabsResponse == null || (list = templateTabsResponse.tabs) == null) {
            return null;
        }
        return (TemplateTabData) C13LP.LJJJLZIJ(iIntValue, list);
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    public final void hp(int i) {
        RecyclerView recyclerView;
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition;
        View view;
        AbstractC21673619ry adapter;
        C1203130hPj c1203130hPj;
        RecyclerView recyclerView2;
        C1203130hPj c1203130hPj2 = this.LLJJI;
        if (c1203130hPj2 != null && (recyclerView = c1203130hPj2.getRecyclerView()) != null && (viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i)) != null && (view = viewHolderFindViewHolderForAdapterPosition.itemView) != null && (adapter = recyclerView.getAdapter()) != null && adapter.getItemCount() > 0 && (c1203130hPj = this.LLJJI) != null && (recyclerView2 = c1203130hPj.getRecyclerView()) != null) {
            recyclerView.smoothScrollBy((view.getLeft() + (view.getWidth() / 2)) - (recyclerView2.getWidth() / 2), 0);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        int iIntValue4;
        if (C724240Sb0.LJI(this) == null) {
            return;
        }
        this.LLJJIJI = (ViewGroup) view.findViewById(R.id.x83);
        this.LLJJIJIIJIL = (C1749280vcc) view.findViewById(R.id.x82);
        this.LLJJI = (C1203130hPj) view.findViewById(R.id.x84);
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD = (ViewOnAttachStateChangeListenerC20631115oD) view.findViewById(R.id.x8h);
        this.LLJJIII = viewOnAttachStateChangeListenerC20631115oD;
        if (viewOnAttachStateChangeListenerC20631115oD != null) {
            viewOnAttachStateChangeListenerC20631115oD.registerOnPageChangeCallback(new C1864580yca(this, 3));
        }
        C1203130hPj c1203130hPj = this.LLJJI;
        if (c1203130hPj != null) {
            c1203130hPj.getRecyclerView().setOverScrollMode(2);
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a00, c1203130hPj.getContext());
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = 0;
            }
            Integer numValueOf = Integer.valueOf(iIntValue);
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a0o, c1203130hPj.getContext());
            if (numLIZJ2 != null) {
                iIntValue2 = numLIZJ2.intValue();
            } else {
                iIntValue2 = 0;
            }
            Integer numValueOf2 = Integer.valueOf(iIntValue2);
            Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.a03, c1203130hPj.getContext());
            if (numLIZJ3 != null) {
                iIntValue3 = numLIZJ3.intValue();
            } else {
                iIntValue3 = 0;
            }
            Integer numValueOf3 = Integer.valueOf(iIntValue3);
            Integer numLIZJ4 = C1308910kAL.LIZJ(R.attr.a1j, c1203130hPj.getContext());
            if (numLIZJ4 != null) {
                iIntValue4 = numLIZJ4.intValue();
            } else {
                iIntValue4 = 0;
            }
            c1203130hPj.setSelectionStyle(new C1582480rHa(numValueOf, numValueOf2, numValueOf3, Integer.valueOf(iIntValue4)));
            c1203130hPj.setOnSelectedChangeListener(new InterfaceC1203170hPn() { // from class: X.0yJ6
                @Override // X.InterfaceC1203170hPn
                public final void LIZ(int i, boolean z, AbstractC1203190hPp abstractC1203190hPp) {
                    String str;
                    String str2;
                    String str3;
                    String strLIZJ;
                    String str4;
                    List<TemplateTabData> list;
                    TemplateTabData templateTabData;
                    List<TemplateTabData> list2;
                    TemplateTabData templateTabData2;
                    List<TemplateTabData> list3;
                    TemplateTabData templateTabData3;
                    if (z && (abstractC1203190hPp instanceof C1203210hPr)) {
                        TakoImageCreateMultiTabAssem takoImageCreateMultiTabAssem = this.LIZ;
                        takoImageCreateMultiTabAssem.LLJJIJIL = -1;
                        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD2 = takoImageCreateMultiTabAssem.LLJJIII;
                        if (viewOnAttachStateChangeListenerC20631115oD2 != null) {
                            viewOnAttachStateChangeListenerC20631115oD2.setCurrentItem(i, false);
                        }
                        TemplateTabsResponse templateTabsResponse = this.LIZ.LLJJJIL;
                        String str5 = "";
                        if (templateTabsResponse == null || (list3 = templateTabsResponse.tabs) == null || (templateTabData3 = (TemplateTabData) C13LP.LJJJLZIJ(i, list3)) == null || (str = templateTabData3.tabId) == null) {
                            str = "";
                        }
                        TemplateTabsResponse templateTabsResponse2 = this.LIZ.LLJJJIL;
                        if (templateTabsResponse2 != null && (list2 = templateTabsResponse2.tabs) != null && (templateTabData2 = (TemplateTabData) C13LP.LJJJLZIJ(i, list2)) != null) {
                            str2 = templateTabData2.tabEnName;
                        } else {
                            str2 = null;
                        }
                        TemplateTabsResponse templateTabsResponse3 = this.LIZ.LLJJJIL;
                        if (templateTabsResponse3 != null && (list = templateTabsResponse3.tabs) != null && (templateTabData = (TemplateTabData) C13LP.LJJJLZIJ(i, list)) != null) {
                            str3 = templateTabData.tabName;
                        } else {
                            str3 = null;
                        }
                        C1862330yYx c1862330yYx = C1862330yYx.LIZ;
                        C1852270yIj.LIZ.getClass();
                        String str6 = C1852270yIj.LIZJ.get("enter_from");
                        if (str6 == null) {
                            str6 = "";
                        }
                        String str7 = C1852270yIj.LIZJ.get("enter_method");
                        if (str7 == null) {
                            str7 = "";
                        }
                        String str8 = C1852270yIj.LIZJ.get("process_id");
                        if (str8 == null) {
                            str8 = "";
                        }
                        String str9 = C1852270yIj.LIZJ.get("tako_session_id");
                        if (str9 == null) {
                            str9 = "";
                        }
                        String str10 = C1852270yIj.LIZJ.get("tako_chat_id");
                        if (str10 == null) {
                            str10 = "";
                        }
                        C1852650yJL c1852650yJL = C1852270yIj.LIZLLL;
                        if (c1852650yJL != null) {
                            strLIZJ = C1855920yOc.LIZJ(Integer.valueOf(c1852650yJL.LIZ));
                        } else {
                            strLIZJ = null;
                        }
                        C1852650yJL c1852650yJL2 = C1852270yIj.LIZLLL;
                        if (c1852650yJL2 != null) {
                            str4 = c1852650yJL2.LJI;
                        } else {
                            str4 = null;
                        }
                        Pair[] pairArr = new Pair[3];
                        pairArr[0] = new Pair("tab_id", str);
                        if (str2 == null) {
                            str2 = str3;
                        }
                        pairArr[1] = new Pair("template_tab", str2);
                        String str11 = C1852270yIj.LIZJ.get("push_id");
                        if (str11 != null) {
                            str5 = str11;
                        }
                        pairArr[2] = new Pair("push_id", str5);
                        C1862330yYx.LJJ(c1862330yYx, str6, str7, str8, str9, str10, "create_image_template", "click_tab", null, null, strLIZJ, str4, null, null, null, C2097608Jq.LJIIJ(pairArr), 47488);
                    }
                    this.LIZ.hp(i);
                }
            });
        }
        AssemVMLazy assemVMLazy = this.LLJJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJJIL;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0yJ2
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0R92) obj).LL;
            }
        }, C736820SvI.LIZLLL(), new AwS641S0100000_27(this, 68), 4);
        C1860520yW2.LIZ.getClass();
        List<TemplateTabData> list = C1860520yW2.LJIILJJIL().tabs;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<TemplateTabData> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().tabName);
        }
        C1860520yW2.LIZ.getClass();
        Keva kevaLJIIL = C1860520yW2.LJIIL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tako_template_tabs_ts_");
        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        long j = kevaLJIIL.getLong(C2188811AlT.LIZIZ(sbLIZ), 0L);
        C1153130g75.LIZ.getClass();
        if (System.currentTimeMillis() - j <= ((Number) C1153130g75.LIZIZ.getValue()).longValue() * 1000 && !arrayList.isEmpty()) {
            ip();
            return;
        }
        ViewGroup viewGroup = this.LLJJIJI;
        if (viewGroup != null) {
            C786410Ut5.LJLZ(0, viewGroup);
        }
        C1749280vcc c1749280vcc = this.LLJJIJIIJIL;
        if (c1749280vcc != null) {
            c1749280vcc.LJ();
        }
        AssemVMLazy assemVMLazy2 = this.LLJJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = LLJJJJJIL;
        TakoImageTemplateTabViewModel takoImageTemplateTabViewModel = (TakoImageTemplateTabViewModel) assemVMLazy2.getValue();
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(takoImageTemplateTabViewModel), C0PEM.LIZJ, null, new C325190Cov(takoImageTemplateTabViewModel, null), 2);
    }
}
