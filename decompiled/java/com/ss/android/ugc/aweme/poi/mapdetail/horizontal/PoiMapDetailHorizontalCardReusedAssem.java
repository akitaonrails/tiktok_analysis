package com.ss.android.ugc.aweme.poi.mapdetail.horizontal;

import X.C01D1;
import X.C01GW;
import X.C098200Yq;
import X.C09R3;
import X.C1175580ghI;
import X.C1175980ghw;
import X.C1185430gxB;
import X.C1206904nr;
import X.C1247530iZL;
import X.C1367960lha;
import X.C13LE;
import X.C1637806bA;
import X.C1637906bB;
import X.C189200o6;
import X.C19719912Dl;
import X.C19M4;
import X.C2211631BhB;
import X.C2217381BqS;
import X.C2248361CzK;
import X.C337180DJs;
import X.C339190DRl;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C698190Ra5;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.C960203pA;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.poi.detail.cells.PoiCardCellData;
import com.ss.android.ugc.aweme.poi.detail.container.model.DynamicIcon;
import com.ss.android.ugc.aweme.poi.mapdetail.model.PoiCardAiSummary;
import com.ss.android.ugc.aweme.poi.mapdetail.viewmodel.PoiMapDetailFilterVM;
import com.ss.android.ugc.aweme.poi.mapdetail.viewmodel.PoiMapDetailPageVM;
import com.ss.android.ugc.aweme.poi.mapmode.model.Location;
import com.ss.android.ugc.aweme.slash.cell.arc.SlashPowerListCellGroupCommonReusedAssem;
import com.zhiliaoapp.musically.R;
import irm.AkS57S0200000_18;
import irm.AkS87S0100000_18;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS2S4400000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiMapDetailHorizontalCardReusedAssem extends SlashPowerListCellGroupCommonReusedAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLFFI;
    public final InterfaceC1731706qJ LLJLLIL;
    public final InterfaceC1731706qJ LLJLLL;
    public C19M4 LLJZ;
    public ViewGroup LLJZIJLIL;
    public ViewGroup LLL;
    public TuxIconView LLLF;
    public TuxTextView LLLFF;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiMapDetailHorizontalCardReusedAssem.class, "pageVM", "getPageVM()Lcom/ss/android/ugc/aweme/poi/mapdetail/viewmodel/PoiMapDetailPageVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(PoiMapDetailHorizontalCardReusedAssem.class, "filterVM", "getFilterVM()Lcom/ss/android/ugc/aweme/poi/mapdetail/viewmodel/PoiMapDetailFilterVM;", 0);
        c09r3.getClass();
        LLLFFI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public PoiMapDetailHorizontalCardReusedAssem() {
        super(0);
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiMapDetailPageVM.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJLLIL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, c1637906bB, new AwS562S0100000_18(c19719912DlLIZ, 1440), null, AFwS256S0000000_18.get$arr$(494));
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(PoiMapDetailFilterVM.class);
        this.LLJLLL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c01d1, c1637906bB, new AwS562S0100000_18(c19719912DlLIZ2, 1441), null, AFwS256S0000000_18.get$arr$(495));
    }

    @Override // com.ss.android.ugc.aweme.slash.cell.arc.SlashPowerListCellGroupCommonReusedAssem, com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.dyq;
    }

    @Override // com.ss.android.ugc.aweme.slash.cell.arc.SlashPowerListCellGroupCommonReusedAssem
    public final ViewGroup sp() {
        View view = this.LLJLILLLLZIIL;
        if (view != null) {
            return (ViewGroup) view.findViewById(R.id.qxc);
        }
        return null;
    }

    public final PoiMapDetailFilterVM tp() {
        return (PoiMapDetailFilterVM) this.LLJLLL.getValue(this, LLLFFI[1]);
    }

    public final PoiMapDetailPageVM up() {
        return (PoiMapDetailPageVM) this.LLJLLIL.getValue(this, LLLFFI[0]);
    }

    public final C1175580ghI yp() {
        C724270Sb3 c724270Sb3 = this.LLJI;
        Object obj = ((C1175980ghw) (c724270Sb3 != null ? c724270Sb3.LL : null)).LLILLJJLI;
        if (obj instanceof C1175580ghI) {
            return (C1175580ghI) obj;
        }
        return null;
    }

    public final PoiCardCellData zp() {
        C724270Sb3 c724270Sb3 = this.LLJI;
        Object obj = ((C1175980ghw) (c724270Sb3 != null ? c724270Sb3.LL : null)).LL.LLILLJJLI;
        if (obj instanceof PoiCardCellData) {
            return (PoiCardCellData) obj;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.slash.cell.arc.SlashPowerListCellGroupCommonReusedAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLJLILLLLZIIL = view;
        this.LLJZIJLIL = (ViewGroup) view.findViewById(R.id.rao);
        this.LLL = (ViewGroup) view.findViewById(R.id.evm);
        this.LLJZ = (C19M4) view.findViewById(R.id.qw7);
        this.LLLF = (TuxIconView) view.findViewById(R.id.hpt);
        this.LLLFF = (TuxTextView) view.findViewById(R.id.hpu);
        C786410Ut5.I7(new AkS87S0100000_18(this, 44), view.findViewById(R.id.tsz));
        View viewFindViewById = view.findViewById(R.id.hpr);
        C786410Ut5.I7(new AkS57S0200000_18(this, viewFindViewById, 8), viewFindViewById);
        C2211631BhB.LJ(viewFindViewById, new AwS597S0100000_18(this, 401));
        C786410Ut5.I7(new AkS87S0100000_18(this, 45), view);
    }

    @Override // com.ss.android.ugc.aweme.slash.cell.arc.SlashPowerListCellGroupCommonReusedAssem
    /* JADX INFO: renamed from: op */
    public final void up(C1175980ghw c1175980ghw) {
        PoiCardAiSummary poiCardAiSummary;
        Context context;
        PoiCardAiSummary poiCardAiSummary2;
        DynamicIcon dynamicIcon;
        String str;
        Object c098200Yq;
        String str2;
        PoiCardAiSummary poiCardAiSummary3;
        super.up(c1175980ghw);
        C1175580ghI c1175580ghIYp = yp();
        String string = null;
        if (c1175580ghIYp != null) {
            poiCardAiSummary = c1175580ghIYp.LIZIZ;
        } else {
            poiCardAiSummary = null;
        }
        boolean zLJFF = false;
        if (poiCardAiSummary != null) {
            C19M4 c19m4 = this.LLJZ;
            if (c19m4 != null) {
                C1175580ghI c1175580ghIYp2 = yp();
                if (c1175580ghIYp2 != null && (poiCardAiSummary3 = c1175580ghIYp2.LIZIZ) != null) {
                    str2 = poiCardAiSummary3.recommendationText;
                } else {
                    str2 = null;
                }
                c19m4.setText(str2);
            }
            C1175580ghI c1175580ghIYp3 = yp();
            if (c1175580ghIYp3 != null && (poiCardAiSummary2 = c1175580ghIYp3.LIZIZ) != null && (dynamicIcon = poiCardAiSummary2.icon) != null && (str = dynamicIcon.tuxToken) != null) {
                try {
                    C01GW c01gw = C2248361CzK.LIZ;
                    c098200Yq = C2248361CzK.LJFF(LJJIJL().getContext(), str);
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = null;
                }
                C698190Ra5 c698190Ra5 = (C698190Ra5) c098200Yq;
                if (c698190Ra5 != null) {
                    C419910GdJ c419910GdJ = new C419910GdJ();
                    c419910GdJ.LIZ = c698190Ra5.LIZ;
                    c419910GdJ.LIZLLL = c698190Ra5.LIZIZ;
                    c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(13));
                    c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(13));
                    C19M4 c19m42 = this.LLJZ;
                    if (c19m42 != null) {
                        c19m42.setStartIcon(c419910GdJ);
                    }
                    C19M4 c19m43 = this.LLJZ;
                    if (c19m43 != null) {
                        c19m43.setCompoundDrawablePadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
                    }
                }
            }
            C19M4 c19m44 = this.LLJZ;
            if (c19m44 != null) {
                C337180DJs.LIZJ(c19m44);
            }
            ViewGroup viewGroup = this.LLJZIJLIL;
            if (viewGroup != null && (context = viewGroup.getContext()) != null && C960203pA.LIZIZ(context)) {
                ViewGroup viewGroup2 = this.LLJZIJLIL;
                if (viewGroup2 != null) {
                    viewGroup2.setBackgroundResource(R.drawable.cup);
                }
            } else {
                ViewGroup viewGroup3 = this.LLJZIJLIL;
                if (viewGroup3 != null) {
                    viewGroup3.setBackgroundResource(R.drawable.cuq);
                }
            }
            ViewGroup viewGroup4 = this.LLL;
            if (viewGroup4 != null) {
                viewGroup4.setBackgroundResource(R.drawable.cur);
            }
        } else {
            C1175580ghI c1175580ghIYp4 = yp();
            if (c1175580ghIYp4 != null && c1175580ghIYp4.LIZJ) {
                C19M4 c19m45 = this.LLJZ;
                if (c19m45 != null) {
                    C337180DJs.LIZIZ(c19m45);
                }
            } else {
                C19M4 c19m46 = this.LLJZ;
                if (c19m46 != null) {
                    C339190DRl.LIZIZ(c19m46);
                }
            }
            ViewGroup viewGroup5 = this.LLJZIJLIL;
            if (viewGroup5 != null) {
                viewGroup5.setBackground(null);
            }
            ViewGroup viewGroup6 = this.LLL;
            if (viewGroup6 != null) {
                viewGroup6.setBackgroundResource(R.drawable.cur);
            }
        }
        PoiCardCellData poiCardCellDataZp = zp();
        if (poiCardCellDataZp != null) {
            zLJFF = Intrinsics.LJFF(poiCardCellDataZp.isCollected, Boolean.TRUE);
        }
        if (zLJFF) {
            TuxIconView tuxIconView = this.LLLF;
            if (tuxIconView != null) {
                C419910GdJ c419910GdJ2 = new C419910GdJ();
                c419910GdJ2.LIZ = R.raw.icon_bookmark_fill;
                c419910GdJ2.LJ = Integer.valueOf(R.attr.a1i);
                tuxIconView.setTuxIcon(c419910GdJ2);
            }
            TuxTextView tuxTextView = this.LLLFF;
            if (tuxTextView != null) {
                if (C1206904nr.LIZ()) {
                    Context context2 = getContext();
                    if (context2 != null) {
                        string = context2.getString(2131844689);
                    }
                } else {
                    Context context3 = getContext();
                    if (context3 != null) {
                        string = context3.getString(2131821909);
                    }
                }
                tuxTextView.setText(string);
                return;
            }
            return;
        }
        TuxIconView tuxIconView2 = this.LLLF;
        if (tuxIconView2 != null) {
            C419910GdJ c419910GdJ3 = new C419910GdJ();
            c419910GdJ3.LIZ = R.raw.icon_bookmark;
            c419910GdJ3.LJ = Integer.valueOf(R.attr.a1i);
            tuxIconView2.setTuxIcon(c419910GdJ3);
        }
        TuxTextView tuxTextView2 = this.LLLFF;
        if (tuxTextView2 == null) {
            return;
        }
        if (C1206904nr.LIZ()) {
            Context context4 = getContext();
            if (context4 != null) {
                string = context4.getString(2131844688);
            }
        } else {
            Context context5 = getContext();
            if (context5 != null) {
                string = context5.getString(2131821908);
            }
        }
        tuxTextView2.setText(string);
    }

    @Override // com.ss.android.ugc.aweme.slash.cell.arc.SlashPowerListCellGroupCommonReusedAssem, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(Object obj) {
        up((C1175980ghw) obj);
    }

    public final void Ap(Context context, ArrayList arrayList, String str, String str2, Location location, String str3) {
        C1367960lha.LIZ.getClass();
        if (!C1367960lha.LIZ().LJI(context)) {
            C1185430gxB.LIZ.getClass();
            C1185430gxB.LJIL(null, "map_mode", str);
            return;
        }
        C1247530iZL c1247530iZL = new C1247530iZL();
        c1247530iZL.LIZ = context.getResources().getString(2131844800);
        c1247530iZL.LIZJ(R.raw.icon_arrow_up_right_ltr);
        c1247530iZL.LIZJ = 0;
        c1247530iZL.LIZ(new AwS2S4400000_18(context, location, str2, str3, str, this, 0));
        arrayList.add(c1247530iZL);
    }
}
