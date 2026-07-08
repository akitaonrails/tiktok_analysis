package com.ss.android.ugc.aweme.poi.mapmode.cell;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C09R3;
import X.C1166820gTA;
import X.C1180060goW;
import X.C1189060h32;
import X.C1189100h36;
import X.C1205490hTX;
import X.C123100dR;
import X.C1308910kAL;
import X.C13LE;
import X.C19719912Dl;
import X.C1EMR;
import X.C20642515q3;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C339190DRl;
import X.C418440Gaw;
import X.C452080Ho6;
import X.C452501pT;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1166860gTE;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.poi.mapmode.model.PoiLandmark;
import com.ss.android.ugc.aweme.poi.mapmode.viewmodel.PoiMapModeNavTabVM;
import com.ss.android.ugc.aweme.poi.mapmode.viewmodel.PoiMapModePageVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS419S0200000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiMapModeNavTabSelectCell extends PowerCell<C1166820gTA> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZ;
    public final AssemVMLazy LL;
    public final AssemVMLazy LLILLJJLI;
    public View LLILLL;
    public TuxTextView LLILZ;
    public TuxTextView LLILZIL;
    public TuxIconView LLILZLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiMapModeNavTabSelectCell.class, "pageVM", "getPageVM()Lcom/ss/android/ugc/aweme/poi/mapmode/viewmodel/PoiMapModePageVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(PoiMapModeNavTabSelectCell.class, "navBarVM", "getNavBarVM()Lcom/ss/android/ugc/aweme/poi/mapmode/viewmodel/PoiMapModeNavTabVM;", 0);
        c09r3.getClass();
        LLIZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public PoiMapModeNavTabSelectCell() {
        AssemVMLazy assemVMLazy;
        AssemVMLazy assemVMLazy2;
        Object obj = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiMapModePageVM.class);
        AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18(c19719912DlLIZ, 1575);
        AFwS256S0000000_18 aFwS256S0000000_18 = AFwS256S0000000_18.get$arr$(518);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS562S0100000_18(c19719912DlLIZ, 1562), awS562S0100000_18, AFwS206S0000000_18.get$arr$(401), new AwS562S0100000_18((C03K6) this, 1552), new AwS562S0100000_18((C03K6) this, 1563), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 1566), aFwS256S0000000_18, new AwS562S0100000_18((C03K6) this, 1569), null, new AwS562S0100000_18((C03K6) this, 1572));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS562S0100000_18 awS562S0100000_182 = new AwS562S0100000_18((C03K6) this, 1548);
            AwS562S0100000_18 awS562S0100000_183 = new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 1550);
            AwS562S0100000_18 awS562S0100000_184 = new AwS562S0100000_18(c19719912DlLIZ, 1553);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS419S0200000_18((InterfaceC451590HnJ) obj, awS562S0100000_182, 80));
            AwS562S0100000_18 awS562S0100000_185 = new AwS562S0100000_18(c01gwLIZIZ, 1558);
            AwS562S0100000_18 awS562S0100000_186 = new AwS562S0100000_18(c01gwLIZIZ, 1561);
            AwS562S0100000_18 awS562S0100000_187 = new AwS562S0100000_18(c01gwLIZIZ, 1564);
            AwS562S0100000_18 awS562S0100000_188 = new AwS562S0100000_18(c01gwLIZIZ, 1567);
            AwS562S0100000_18 awS562S0100000_189 = new AwS562S0100000_18(c01gwLIZIZ, 1570);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS562S0100000_184, awS562S0100000_18, new C452080Ho6(), awS562S0100000_185, awS562S0100000_186, awS562S0100000_183, aFwS256S0000000_18, awS562S0100000_187, awS562S0100000_188, awS562S0100000_189);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS562S0100000_18(c19719912DlLIZ, 1573), awS562S0100000_18, AFwS206S0000000_18.get$arr$(400), new AwS562S0100000_18((C03K6) this, 1577), new AwS562S0100000_18((C03K6) this, 1579), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 1581), aFwS256S0000000_18, new AwS562S0100000_18((C03K6) this, 1583), null, new AwS562S0100000_18((C03K6) this, 1585));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS562S0100000_18(c19719912DlLIZ, 1586), awS562S0100000_18, AFwS206S0000000_18.get$arr$(402), new AwS562S0100000_18((C03K6) this, 1588), new AwS562S0100000_18((C03K6) this, 1590), new AwS562S0100000_18((C03K6) this, 1593), aFwS256S0000000_18, null, null, new AwS562S0100000_18((C03K6) this, 1595));
        }
        this.LL = assemVMLazy;
        Object obj2 = C019F.LIZ;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(PoiMapModeNavTabVM.class);
        AwS562S0100000_18 awS562S0100000_1810 = new AwS562S0100000_18(c19719912DlLIZ2, 1597);
        AFwS256S0000000_18 aFwS256S0000000_182 = AFwS256S0000000_18.get$arr$(517);
        if (Intrinsics.LJFF(obj2, obj)) {
            assemVMLazy2 = new AssemVMLazy(new AwS562S0100000_18(c19719912DlLIZ2, 1547), awS562S0100000_1810, AFwS206S0000000_18.get$arr$(399), new AwS562S0100000_18((C03K6) this, 1551), new AwS562S0100000_18((C03K6) this, 1554), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 1556), aFwS256S0000000_182, new AwS562S0100000_18((C03K6) this, 1559), null, new AwS562S0100000_18((C03K6) this, 1565));
        } else if (obj2 instanceof InterfaceC451590HnJ) {
            AwS562S0100000_18 awS562S0100000_1811 = new AwS562S0100000_18((C03K6) this, 1568);
            AwS562S0100000_18 awS562S0100000_1812 = new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 1571);
            AwS562S0100000_18 awS562S0100000_1813 = new AwS562S0100000_18(c19719912DlLIZ2, 1574);
            C01GW c01gwLIZIZ2 = C452501pT.LIZIZ(new AwS419S0200000_18((InterfaceC451590HnJ) obj2, awS562S0100000_1811, 81));
            AwS562S0100000_18 awS562S0100000_1814 = new AwS562S0100000_18(c01gwLIZIZ2, 1576);
            AwS562S0100000_18 awS562S0100000_1815 = new AwS562S0100000_18(c01gwLIZIZ2, 1578);
            AwS562S0100000_18 awS562S0100000_1816 = new AwS562S0100000_18(c01gwLIZIZ2, 1580);
            AwS562S0100000_18 awS562S0100000_1817 = new AwS562S0100000_18(c01gwLIZIZ2, 1582);
            AwS562S0100000_18 awS562S0100000_1818 = new AwS562S0100000_18(c01gwLIZIZ2, 1584);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = C737910Sx3.LIZ;
            assemVMLazy2 = new AssemVMLazy(awS562S0100000_1813, awS562S0100000_1810, new C452080Ho6(), awS562S0100000_1814, awS562S0100000_1815, awS562S0100000_1812, aFwS256S0000000_182, awS562S0100000_1816, awS562S0100000_1817, awS562S0100000_1818);
        } else if (Intrinsics.LJFF(obj2, obj2)) {
            assemVMLazy2 = new AssemVMLazy(new AwS562S0100000_18(c19719912DlLIZ2, 1587), awS562S0100000_1810, AFwS206S0000000_18.get$arr$(403), new AwS562S0100000_18((C03K6) this, 1589), new AwS562S0100000_18((C03K6) this, 1591), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 1592), aFwS256S0000000_182, new AwS562S0100000_18((C03K6) this, 1594), null, new AwS562S0100000_18((C03K6) this, 1596));
        } else {
            if (!Intrinsics.LJFF(obj2, C03IJ.LIZ)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Don't support this VMScope: ");
                sbLIZ2.append(obj2);
                sbLIZ2.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
            }
            assemVMLazy2 = new AssemVMLazy(new AwS562S0100000_18(c19719912DlLIZ2, 1546), awS562S0100000_1810, AFwS206S0000000_18.get$arr$(398), new AwS562S0100000_18((C03K6) this, 1549), new AwS562S0100000_18((C03K6) this, 1555), new AwS562S0100000_18((C03K6) this, 1557), aFwS256S0000000_182, null, null, new AwS562S0100000_18((C03K6) this, 1560));
        }
        this.LLILLJJLI = assemVMLazy2;
    }

    public final PoiMapModePageVM L5() {
        AssemVMLazy assemVMLazy = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLIZ;
        return (PoiMapModePageVM) assemVMLazy.getValue();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.LLILLL = this.itemView.findViewById(R.id.p2k);
        this.LLILZ = (TuxTextView) this.itemView.findViewById(R.id.ulo);
        this.LLILZIL = (TuxTextView) this.itemView.findViewById(R.id.ulm);
        this.LLILZLL = (TuxIconView) this.itemView.findViewById(R.id.uln);
        View view = this.LLILLL;
        if (view != null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(C418440Gaw.LIZIZ(Integer.valueOf(EnumC1166860gTE.CAPSULE.getCornerRadiusDp())));
            view.setBackground(gradientDrawable);
        }
        View view2 = this.LLILLL;
        if (view2 != null) {
            C1189060h32.LJJIIJ(view2, new AwS597S0100000_18(this, 413));
        }
    }

    public final void N5(boolean z) {
        int iIntValue;
        GradientDrawable gradientDrawable;
        int iIntValue2 = 0;
        if (z) {
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a00, this.itemView.getContext());
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = 0;
            }
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a0o, this.itemView.getContext());
            if (numLIZJ2 != null) {
                iIntValue2 = numLIZJ2.intValue();
            }
        } else {
            Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.a03, this.itemView.getContext());
            if (numLIZJ3 != null) {
                iIntValue = numLIZJ3.intValue();
            } else {
                iIntValue = 0;
            }
            Integer numLIZJ4 = C1308910kAL.LIZJ(R.attr.a1k, this.itemView.getContext());
            if (numLIZJ4 != null) {
                iIntValue2 = numLIZJ4.intValue();
            }
        }
        View view = this.LLILLL;
        Drawable background = null;
        if (view != null) {
            background = view.getBackground();
        }
        if ((background instanceof GradientDrawable) && (gradientDrawable = (GradientDrawable) background) != null) {
            gradientDrawable.setColor(iIntValue);
        }
        TuxTextView tuxTextView = this.LLILZ;
        if (tuxTextView != null) {
            tuxTextView.setTextColor(iIntValue2);
        }
        TuxTextView tuxTextView2 = this.LLILZIL;
        if (tuxTextView2 != null) {
            tuxTextView2.setTextColor(iIntValue2);
        }
        TuxIconView tuxIconView = this.LLILZLL;
        if (tuxIconView != null) {
            tuxIconView.setTintColor(iIntValue2);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        String name;
        String str;
        C1166820gTA c1166820gTA = (C1166820gTA) interfaceC1891350zJl;
        super.onBindItemView(c1166820gTA);
        try {
            PoiLandmark poiLandmark = c1166820gTA.LL;
            if (poiLandmark != null && (name = poiLandmark.getName()) != null && C123100dR.LIZ(name) && (str = c1166820gTA.LLILLL) != null && C123100dR.LIZ(str)) {
                TuxTextView tuxTextView = this.LLILZ;
                if (tuxTextView != null) {
                    String name2 = c1166820gTA.LL.getName();
                    if (name2 == null) {
                        name2 = "";
                    }
                    tuxTextView.setText(name2);
                }
                TuxTextView tuxTextView2 = this.LLILZIL;
                if (tuxTextView2 != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("· ");
                    sbLIZ.append(c1166820gTA.LLILLL);
                    tuxTextView2.setText(C2188811AlT.LIZIZ(sbLIZ));
                }
                TuxTextView tuxTextView3 = this.LLILZ;
                if (tuxTextView3 != null) {
                    C339190DRl.LIZLLL(tuxTextView3);
                }
                C339190DRl.LIZLLL(this.LLILZIL);
                N5(true);
                I5(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(161)), this.LLILZ, this.LLILZIL);
                return;
            }
            TuxTextView tuxTextView4 = this.LLILZ;
            if (tuxTextView4 != null) {
                tuxTextView4.setText(C20642515q3.LJI(2131845965));
            }
            TuxTextView tuxTextView5 = this.LLILZIL;
            if (tuxTextView5 != null) {
                C339190DRl.LIZIZ(tuxTextView5);
            }
            N5(false);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1205490hTX.LIZ.LJ(C1EMR.MAP_MODE_ERR, e);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.e52, viewGroup, false);
    }

    public static void I5(int i, TuxTextView tuxTextView, TuxTextView tuxTextView2) {
        C1180060goW.LJFF(tuxTextView);
        int iLJFF = C1180060goW.LJFF(tuxTextView) + C1180060goW.LIZLLL(tuxTextView);
        C1180060goW.LJFF(tuxTextView2);
        int iLJFF2 = C1180060goW.LJFF(tuxTextView2) + C1180060goW.LIZLLL(tuxTextView2);
        if (iLJFF + iLJFF2 > i) {
            int iMin = Math.min(Math.max(i - iLJFF2, C1189100h36.LIZ), iLJFF) - C1180060goW.LIZLLL(tuxTextView);
            C1180060goW.LJIIJJI(tuxTextView, iMin);
            C1180060goW.LJIIJJI(tuxTextView2, (i - iMin) - C1180060goW.LIZLLL(tuxTextView));
        }
    }
}
