package com.ss.android.ugc.aweme.poi.mapdetail.assem;

import X.C01D1;
import X.C01GW;
import X.C09R3;
import X.C0OM1;
import X.C1176540giq;
import X.C1179870goD;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1308910kAL;
import X.C13LE;
import X.C1637806bA;
import X.C1637906bB;
import X.C1770850wBP;
import X.C19719912Dl;
import X.C19M4;
import X.C2217381BqS;
import X.C339190DRl;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C426750GoL;
import X.C427690Gpr;
import X.C452501pT;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C747370TTj;
import X.C786410Ut5;
import X.C814420VxA;
import X.C891980Yyy;
import X.EnumC1175760gha;
import X.InterfaceC1747020vYy;
import X.InterfaceC2217461Bqa;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.sheet.selectsheet.TuxSingleSelectionSheet;
import com.ss.android.ugc.aweme.poi.mapdetail.model.PoiFeedCenterRecallArea;
import com.ss.android.ugc.aweme.poi.mapdetail.model.PoiFeedFilterOption;
import com.ss.android.ugc.aweme.poi.mapdetail.viewmodel.PoiMapDetailAreaFilterVM;
import com.ss.android.ugc.aweme.poi.mapdetail.viewmodel.PoiMapDetailFilterVM;
import com.ss.android.ugc.aweme.poi.mapdetail.viewmodel.PoiMapDetailPageVM;
import com.zhiliaoapp.musically.R;
import irm.AkS57S0200000_18;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.AwS632S0100000_18;
import kotlin.jvm.internal.AwS667S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiMapDetailFilterAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJIL;
    public HorizontalScrollView LLIZLLLIL;
    public LinearLayout LLJ;
    public C19M4 LLJI;
    public final Map<Integer, C19M4> LLJIJIL = new LinkedHashMap();
    public final Map<Integer, String> LLJILJIL = new LinkedHashMap();
    public C19M4 LLJILJILJ;
    public final AssemVMLazy LLJILLL;
    public final AssemVMLazy LLJJ;
    public final AssemVMLazy LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public PoiFeedCenterRecallArea LLJJIJIIJIL;
    public List<PoiFeedFilterOption> LLJJIJIL;
    public String LLJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiMapDetailFilterAssem.class, "pageVM", "getPageVM()Lcom/ss/android/ugc/aweme/poi/mapdetail/viewmodel/PoiMapDetailPageVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(PoiMapDetailFilterAssem.class, "filterVM", "getFilterVM()Lcom/ss/android/ugc/aweme/poi/mapdetail/viewmodel/PoiMapDetailFilterVM;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(PoiMapDetailFilterAssem.class, "areaFilterVM", "getAreaFilterVM()Lcom/ss/android/ugc/aweme/poi/mapdetail/viewmodel/PoiMapDetailAreaFilterVM;", 0);
        c09r3.getClass();
        LLJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    public PoiMapDetailFilterAssem() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiMapDetailPageVM.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJILLL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, c1637906bB, new AwS562S0100000_18(c19719912DlLIZ, 1391), AFwS256S0000000_18.get$arr$(473), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(PoiMapDetailFilterVM.class);
        this.LLJJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c01d1, c1637906bB, new AwS562S0100000_18(c19719912DlLIZ2, 1392), AFwS256S0000000_18.get$arr$(474), null, true);
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(PoiMapDetailAreaFilterVM.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c01d1, c1637906bB, new AwS562S0100000_18(c19719912DlLIZ3, 1393), AFwS256S0000000_18.get$arr$(475), null, true);
        this.LLJJIII = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1388));
        this.LLJJIJI = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1390));
        this.LLJJJ = "sort_by_recommend";
    }

    public final PoiMapDetailAreaFilterVM Ho() {
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJIL;
        return (PoiMapDetailAreaFilterVM) assemVMLazy.getValue();
    }

    public final PoiMapDetailFilterVM Jo() {
        AssemVMLazy assemVMLazy = this.LLJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJIL;
        return (PoiMapDetailFilterVM) assemVMLazy.getValue();
    }

    public final PoiMapDetailPageVM Lo() {
        AssemVMLazy assemVMLazy = this.LLJILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJIL;
        return (PoiMapDetailPageVM) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        Lo().LLJI = Jo();
        Jo().LL = Ho();
        this.LLJ = (LinearLayout) view.findViewById(R.id.hxk);
        this.LLIZLLLIL = (HorizontalScrollView) view.findViewById(R.id.hxg);
        if (C426750GoL.LIZLLL(view.getContext())) {
            LinearLayout linearLayout = this.LLJ;
            if (linearLayout != null) {
                linearLayout.setLayoutDirection(1);
            }
            HorizontalScrollView horizontalScrollView = this.LLIZLLLIL;
            if (horizontalScrollView != null) {
                horizontalScrollView.setLayoutDirection(1);
            }
        } else {
            LinearLayout linearLayout2 = this.LLJ;
            if (linearLayout2 != null) {
                linearLayout2.setLayoutDirection(0);
            }
            HorizontalScrollView horizontalScrollView2 = this.LLIZLLLIL;
            if (horizontalScrollView2 != null) {
                horizontalScrollView2.setLayoutDirection(0);
            }
        }
        if (Lo().LLILZ == EnumC1175760gha.ACC_NEARBY) {
            C339190DRl.LIZIZ(this.LLJ);
        } else {
            C339190DRl.LIZLLL(this.LLJ);
        }
        C736680Sv4.LJIIIIZZ(this, Lo(), new C2217381BqS() { // from class: X.0gik
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1175650ghP) obj).LLILLJJLI;
            }
        }, null, new AwS632S0100000_18(this, 15), 6);
        C736680Sv4.LJIIIIZZ(this, Jo(), new C2217381BqS() { // from class: X.0goC
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1176370giZ) obj).LL;
            }
        }, null, new C1176540giq(this), 6);
        C736680Sv4.LJIIIZ(this, Ho(), new C2217381BqS() { // from class: X.0goF
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1179840goA) obj).LL;
            }
        }, new C2217381BqS() { // from class: X.0goH
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1179840goA) obj).LLILLJJLI;
            }
        }, null, new AwS667S0100000_18(this, 5), 12);
        PoiMapDetailFilterVM poiMapDetailFilterVMJo = Jo();
        C1179870goD c1179870goD = new C2217381BqS() { // from class: X.0goD
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1176370giZ) obj).LLILLJJLI;
            }
        };
        C1770850wBP c1770850wBP = new C1770850wBP();
        c1770850wBP.LIZ = true;
        C736680Sv4.LJIIIIZZ(this, poiMapDetailFilterVMJo, c1179870goD, c1770850wBP, new AwS632S0100000_18(this, 12), 4);
        C736680Sv4.LJIIIIZZ(this, Jo(), new C2217381BqS() { // from class: X.0gih
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1176370giZ) obj).LLILLL;
            }
        }, null, new AwS632S0100000_18(this, 13), 6);
    }

    public final C19M4 Go(String str, Function1<? super C19M4, Unit> function1) {
        C19M4 c19m4 = new C19M4(LJJIJL().getContext(), null, 6);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
        C786410Ut5.O6(c19m4, marginLayoutParams);
        c19m4.setMaxWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(180)));
        c19m4.setPaddingRelative(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5)));
        c19m4.setTuxFont(52);
        c19m4.setCompoundDrawablePadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
        c19m4.setText(str);
        c19m4.setMaxLines(1);
        c19m4.setEllipsize(TextUtils.TruncateAt.END);
        C427690Gpr.LJI(c19m4, null);
        C786410Ut5.I7(new AkS57S0200000_18(function1, c19m4, 7), c19m4);
        return c19m4;
    }

    public final void No(C19M4 c19m4, String str) {
        int iIntValue;
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_chevron_down;
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        c419910GdJ.LIZLLL = C1308910kAL.LIZJ(R.attr.a1h, LJJIJL().getContext());
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
        c19m4.setEndIcon(c419910GdJ);
        c19m4.setText(str);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, LJJIJL().getContext());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        c19m4.setTextColor(iIntValue);
        c19m4.setBackgroundResource(R.drawable.cuo);
    }

    public final void So(C19M4 c19m4, String str) {
        int iIntValue;
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_chevron_down;
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        c419910GdJ.LIZLLL = C1308910kAL.LIZJ(R.attr.a1j, LJJIJL().getContext());
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1j);
        c19m4.setEndIcon(c419910GdJ);
        c19m4.setText(str);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1j, LJJIJL().getContext());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        c19m4.setTextColor(iIntValue);
        c19m4.setBackgroundResource(R.drawable.cun);
    }

    public final void Oo(String str, List<C747370TTj> list, Function1<? super C747370TTj, Unit> function1) {
        FragmentManager childFragmentManager;
        C891980Yyy c891980Yyy = new C891980Yyy();
        TuxSingleSelectionSheet tuxSingleSelectionSheet = c891980Yyy.LIZ;
        C0OM1 c0om1 = new C0OM1();
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = str;
        c0om1.LIZJ = c1250250idj;
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
        c1251150ifB.LIZJ(new AwS562S0100000_18(tuxSingleSelectionSheet, 1389));
        c0om1.LIZIZ(c1251150ifB);
        c0om1.LIZLLL = false;
        TuxSingleSelectionSheet tuxSingleSelectionSheet2 = c891980Yyy.LIZ;
        tuxSingleSelectionSheet2.LLJJIII = c0om1;
        tuxSingleSelectionSheet2.LLJJIJI = 0;
        tuxSingleSelectionSheet2.LLJJIJIL = list;
        c891980Yyy.LIZ.LLJJJ = new AwS597S0100000_18(function1, (Function1<? super InterfaceC1747020vYy, Unit>) 395);
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null && (childFragmentManager = fragmentLJI.getChildFragmentManager()) != null) {
            tuxSingleSelectionSheet.show(childFragmentManager, str);
        }
    }
}
