package com.ss.android.ugc.aweme.poi.mapmode.cell;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C09R3;
import X.C1166830gTB;
import X.C1205490hTX;
import X.C1308910kAL;
import X.C13LE;
import X.C1582480rHa;
import X.C1582570rHj;
import X.C1582580rHk;
import X.C19719912Dl;
import X.C1EMR;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452080Ho6;
import X.C452501pT;
import X.C737910Sx3;
import X.C786410Ut5;
import X.EnumC1166860gTE;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import Y.ACListenerS153S0100000_18;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.common.ConnectionResult;
import com.ss.android.ugc.aweme.poi.mapmode.viewmodel.PoiMapModeNavTabVM;
import com.ss.android.ugc.aweme.poi.mapmode.viewmodel.PoiMapModePageVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS419S0200000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiMapModeNavTabCategoryCell extends PowerCell<C1166830gTB> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZ;
    public final AssemVMLazy LL;
    public final AssemVMLazy LLILLJJLI;
    public C1582570rHj LLILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiMapModeNavTabCategoryCell.class, "pageVM", "getPageVM()Lcom/ss/android/ugc/aweme/poi/mapmode/viewmodel/PoiMapModePageVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(PoiMapModeNavTabCategoryCell.class, "navBarVM", "getNavBarVM()Lcom/ss/android/ugc/aweme/poi/mapmode/viewmodel/PoiMapModeNavTabVM;", 0);
        c09r3.getClass();
        LLILZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public PoiMapModeNavTabCategoryCell() {
        AssemVMLazy assemVMLazy;
        AssemVMLazy assemVMLazy2;
        Object obj = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiMapModePageVM.class);
        AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18(c19719912DlLIZ, 1523);
        AFwS256S0000000_18 aFwS256S0000000_18 = AFwS256S0000000_18.get$arr$(516);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS562S0100000_18(c19719912DlLIZ, 1510), awS562S0100000_18, AFwS206S0000000_18.get$arr$(395), new AwS562S0100000_18((C03K6) this, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED), new AwS562S0100000_18((C03K6) this, 1511), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 1514), aFwS256S0000000_18, new AwS562S0100000_18((C03K6) this, 1517), null, new AwS562S0100000_18((C03K6) this, 1520));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS562S0100000_18 awS562S0100000_182 = new AwS562S0100000_18((C03K6) this, 1496);
            AwS562S0100000_18 awS562S0100000_183 = new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 1498);
            AwS562S0100000_18 awS562S0100000_184 = new AwS562S0100000_18(c19719912DlLIZ, 1501);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS419S0200000_18((InterfaceC451590HnJ) obj, awS562S0100000_182, 78));
            AwS562S0100000_18 awS562S0100000_185 = new AwS562S0100000_18(c01gwLIZIZ, 1506);
            AwS562S0100000_18 awS562S0100000_186 = new AwS562S0100000_18(c01gwLIZIZ, 1509);
            AwS562S0100000_18 awS562S0100000_187 = new AwS562S0100000_18(c01gwLIZIZ, 1512);
            AwS562S0100000_18 awS562S0100000_188 = new AwS562S0100000_18(c01gwLIZIZ, 1515);
            AwS562S0100000_18 awS562S0100000_189 = new AwS562S0100000_18(c01gwLIZIZ, 1518);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS562S0100000_184, awS562S0100000_18, new C452080Ho6(), awS562S0100000_185, awS562S0100000_186, awS562S0100000_183, aFwS256S0000000_18, awS562S0100000_187, awS562S0100000_188, awS562S0100000_189);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS562S0100000_18(c19719912DlLIZ, 1521), awS562S0100000_18, AFwS206S0000000_18.get$arr$(394), new AwS562S0100000_18((C03K6) this, 1525), new AwS562S0100000_18((C03K6) this, 1527), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 1529), aFwS256S0000000_18, new AwS562S0100000_18((C03K6) this, 1531), null, new AwS562S0100000_18((C03K6) this, 1533));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS562S0100000_18(c19719912DlLIZ, 1534), awS562S0100000_18, AFwS206S0000000_18.get$arr$(396), new AwS562S0100000_18((C03K6) this, 1536), new AwS562S0100000_18((C03K6) this, 1538), new AwS562S0100000_18((C03K6) this, 1541), aFwS256S0000000_18, null, null, new AwS562S0100000_18((C03K6) this, 1543));
        }
        this.LL = assemVMLazy;
        Object obj2 = C019F.LIZ;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(PoiMapModeNavTabVM.class);
        AwS562S0100000_18 awS562S0100000_1810 = new AwS562S0100000_18(c19719912DlLIZ2, 1545);
        AFwS256S0000000_18 aFwS256S0000000_182 = AFwS256S0000000_18.get$arr$(515);
        if (Intrinsics.LJFF(obj2, obj)) {
            assemVMLazy2 = new AssemVMLazy(new AwS562S0100000_18(c19719912DlLIZ2, 1495), awS562S0100000_1810, AFwS206S0000000_18.get$arr$(393), new AwS562S0100000_18((C03K6) this, 1499), new AwS562S0100000_18((C03K6) this, 1502), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 1504), aFwS256S0000000_182, new AwS562S0100000_18((C03K6) this, 1507), null, new AwS562S0100000_18((C03K6) this, 1513));
        } else if (obj2 instanceof InterfaceC451590HnJ) {
            AwS562S0100000_18 awS562S0100000_1811 = new AwS562S0100000_18((C03K6) this, 1516);
            AwS562S0100000_18 awS562S0100000_1812 = new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 1519);
            AwS562S0100000_18 awS562S0100000_1813 = new AwS562S0100000_18(c19719912DlLIZ2, 1522);
            C01GW c01gwLIZIZ2 = C452501pT.LIZIZ(new AwS419S0200000_18((InterfaceC451590HnJ) obj2, awS562S0100000_1811, 79));
            AwS562S0100000_18 awS562S0100000_1814 = new AwS562S0100000_18(c01gwLIZIZ2, 1524);
            AwS562S0100000_18 awS562S0100000_1815 = new AwS562S0100000_18(c01gwLIZIZ2, 1526);
            AwS562S0100000_18 awS562S0100000_1816 = new AwS562S0100000_18(c01gwLIZIZ2, 1528);
            AwS562S0100000_18 awS562S0100000_1817 = new AwS562S0100000_18(c01gwLIZIZ2, 1530);
            AwS562S0100000_18 awS562S0100000_1818 = new AwS562S0100000_18(c01gwLIZIZ2, 1532);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = C737910Sx3.LIZ;
            assemVMLazy2 = new AssemVMLazy(awS562S0100000_1813, awS562S0100000_1810, new C452080Ho6(), awS562S0100000_1814, awS562S0100000_1815, awS562S0100000_1812, aFwS256S0000000_182, awS562S0100000_1816, awS562S0100000_1817, awS562S0100000_1818);
        } else if (Intrinsics.LJFF(obj2, obj2)) {
            assemVMLazy2 = new AssemVMLazy(new AwS562S0100000_18(c19719912DlLIZ2, 1535), awS562S0100000_1810, AFwS206S0000000_18.get$arr$(397), new AwS562S0100000_18((C03K6) this, 1537), new AwS562S0100000_18((C03K6) this, 1539), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 1540), aFwS256S0000000_182, new AwS562S0100000_18((C03K6) this, 1542), null, new AwS562S0100000_18((C03K6) this, 1544));
        } else {
            if (!Intrinsics.LJFF(obj2, C03IJ.LIZ)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Don't support this VMScope: ");
                sbLIZ2.append(obj2);
                sbLIZ2.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
            }
            assemVMLazy2 = new AssemVMLazy(new AwS562S0100000_18(c19719912DlLIZ2, 1494), awS562S0100000_1810, AFwS206S0000000_18.get$arr$(392), new AwS562S0100000_18((C03K6) this, 1497), new AwS562S0100000_18((C03K6) this, 1503), new AwS562S0100000_18((C03K6) this, 1505), aFwS256S0000000_182, null, null, new AwS562S0100000_18((C03K6) this, 1508));
        }
        this.LLILLJJLI = assemVMLazy2;
    }

    public final PoiMapModePageVM I5() {
        AssemVMLazy assemVMLazy = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZ;
        return (PoiMapModePageVM) assemVMLazy.getValue();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        try {
            this.LLILLL = (C1582570rHj) this.itemView.findViewById(R.id.p29);
            C1582570rHj c1582570rHj = this.LLILLL;
            if (c1582570rHj != null) {
                c1582570rHj.setVariant(EnumC1166860gTE.CAPSULE);
                c1582570rHj.setWidthRule(new C1582580rHk(0, 0, 7));
                c1582570rHj.setSelectionStyle(new C1582480rHa(C1308910kAL.LIZJ(R.attr.d8, c1582570rHj.getContext()), C1308910kAL.LIZJ(R.attr.a0o, c1582570rHj.getContext()), C1308910kAL.LIZJ(R.attr.a03, c1582570rHj.getContext()), C1308910kAL.LIZJ(R.attr.a1k, c1582570rHj.getContext())));
                c1582570rHj.setFont(62);
                C786410Ut5.V8(c1582570rHj, new ACListenerS153S0100000_18(this, 66));
                c1582570rHj.setSelected(false);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1205490hTX.LIZ.LJ(C1EMR.MAP_MODE_ERR, e);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1166830gTB c1166830gTB = (C1166830gTB) interfaceC1891350zJl;
        C1582570rHj c1582570rHj = this.LLILLL;
        if (c1582570rHj != null) {
            String tabName = c1166830gTB.LLILLJJLI.getTabName();
            if (tabName == null) {
                tabName = "";
            }
            c1582570rHj.LJ(tabName, null, null);
        }
        C1582570rHj c1582570rHj2 = this.LLILLL;
        if (c1582570rHj2 != null) {
            c1582570rHj2.setSelected(c1166830gTB.LL);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.e51, viewGroup, false);
    }
}
