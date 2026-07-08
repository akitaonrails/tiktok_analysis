package com.ss.android.ugc.aweme.slash.component.navigation;

import X.C019F;
import X.C1085640eME;
import X.C1173980gei;
import X.C1174040geo;
import X.C1174080ges;
import X.C1174090get;
import X.C1174110gev;
import X.C1174140gey;
import X.C1174200gf4;
import X.C1174850gg7;
import X.C1180060goW;
import X.C1186840gzS;
import X.C1189060h32;
import X.C13LE;
import X.C13LP;
import X.C15438062q;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1637806bA;
import X.C1845940y8W;
import X.C1846060y8i;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C337180DJs;
import X.C418440Gaw;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C814420VxA;
import X.EnumC041500Cv;
import X.InterfaceC1174060geq;
import X.InterfaceC1174130gex;
import X.InterfaceC1181010gq3;
import X.InterfaceC1846110y8n;
import X.InterfaceC2217461Bqa;
import Y.ARunnableS87S0200000_18;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent;
import com.ss.android.ugc.aweme.slash.component.navigation.SlashQuickNavigation;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS667S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class SlashQuickNavigation extends BaseSlashSlotAssemComponent<QuickNavBarModule> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJL;
    public C1846060y8i LLJJI;
    public List<C1174090get> LLJJIII;
    public List<C1174090get> LLJJIJI;
    public ViewGroup LLJJIJIIJIL;
    public final AssemVMLazy LLJJIJIL;
    public boolean LLJJJ;
    public boolean LLJJJIL;
    public String LLJJJJ;
    public String LLJJJJJIL;
    public final C1174040geo LLJJJJLIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SlashQuickNavigation.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/slash/component/navigation/QuickNavigationViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0geo] */
    public SlashQuickNavigation() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(QuickNavigationViewModel.class);
        this.LLJJIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS562S0100000_18(c19719912DlLIZ, 2245), AFwS256S0000000_18.get$arr$(754), null, true);
        this.LLJJJJLIIL = new InterfaceC1846110y8n() { // from class: X.0geo
            @Override // X.InterfaceC1846110y8n
            public final void LIZJ(C1845940y8W c1845940y8W) {
            }

            @Override // X.InterfaceC1846110y8n
            public final void LIZ(C1845940y8W c1845940y8W) {
                this.LIZ.kp(c1845940y8W);
            }

            @Override // X.InterfaceC1846110y8n
            public final void LIZIZ(C1845940y8W c1845940y8W) {
                this.LIZ.kp(c1845940y8W);
            }
        };
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.f9_;
    }

    public static int ip() {
        return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJIIJJI(C1558360qeg.LJFF(fragmentLJI, null), QuickNavigationContext.class, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, X.InterfaceC1173970geh
    public final void CG1(BaseComponentData baseComponentData) {
        QuickNavBarModule quickNavBarModule = (QuickNavBarModule) baseComponentData;
        super.CG1(quickNavBarModule);
        AssemVMLazy assemVMLazy = this.LLJJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJL;
        QuickNavigationViewModel.vQ2((QuickNavigationViewModel) assemVMLazy.getValue(), quickNavBarModule, null, 2);
    }

    public final void kp(C1845940y8W c1845940y8W) {
        boolean z;
        List<C1174090get> list;
        C1174090get c1174090get;
        C1174090get c1174090get2;
        InterfaceC1181010gq3 interfaceC1181010gq3LIZ;
        C1186840gzS c1186840gzSLw1;
        if (c1845940y8W.LIZ != EnumC041500Cv.SCROLL) {
            z = true;
        } else {
            z = false;
        }
        c1845940y8W.LIZ = null;
        if (z) {
            this.LLJJJ = true;
            List<C1174090get> list2 = this.LLJJIII;
            if (list2 != null && (c1174090get2 = (C1174090get) C13LP.LJJJLZIJ(c1845940y8W.LIZLLL, list2)) != null && (interfaceC1181010gq3LIZ = C1174850gg7.LIZ(this)) != null && (c1186840gzSLw1 = interfaceC1181010gq3LIZ.lw1()) != null) {
                c1186840gzSLw1.LIZ(new C1174140gey(c1174090get2.tabMark));
            }
        }
        if (this.LLJJJ && (list = this.LLJJIII) != null && (c1174090get = (C1174090get) C13LP.LJJJLZIJ(c1845940y8W.LIZLLL, list)) != null) {
            this.LLJJJJJIL = c1174090get.instanceId;
            InterfaceC1181010gq3 interfaceC1181010gq3LIZ2 = C1174850gg7.LIZ(this);
            if (interfaceC1181010gq3LIZ2 != null) {
                interfaceC1181010gq3LIZ2.K40(c1174090get.instanceId, ip());
            }
        }
    }

    public final void lp(String str) {
        C1174090get next;
        String str2;
        Object parent;
        C1186840gzS c1186840gzSLw1;
        C1186840gzS c1186840gzSLw12;
        String strLJJLIIIJ;
        ViewParent parent2;
        List<C1174090get> listLJLJJLL;
        List<C1174090get> list = this.LLJJIII;
        if (list != null && !list.isEmpty()) {
            List<C1174090get> list2 = this.LLJJIJI;
            C1845940y8W c1845940y8WLJII = null;
            if (list2 != null) {
                Iterator<C1174090get> it2 = list2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (Intrinsics.LJFF(next.instanceId, str)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                C1174090get c1174090get = next;
                if (c1174090get != null) {
                    List<C1174090get> list3 = this.LLJJIII;
                    if (list3 != null && (listLJLJJLL = C13LP.LJLJJLL(list3)) != null) {
                        for (C1174090get c1174090get2 : listLJLJJLL) {
                            if (c1174090get.onScreenIndex >= c1174090get2.onScreenIndex) {
                                break;
                            }
                        }
                        c1174090get2 = null;
                    } else {
                        c1174090get2 = null;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(c1174090get2);
                    sbLIZ.append('_');
                    sbLIZ.append(c1174090get);
                    C2188811AlT.LIZIZ(sbLIZ);
                    if (c1174090get2 != null) {
                        str2 = c1174090get2.instanceId;
                    } else {
                        str2 = null;
                    }
                    this.LLJJJJ = str2;
                    if (this.LLJJJ) {
                        return;
                    }
                    if (c1174090get2 == null) {
                        C337180DJs.LIZ(LJJIJL());
                        C1846060y8i c1846060y8i = this.LLJJI;
                        if (c1846060y8i != null) {
                            C1085640eME c1085640eME = C1846060y8i.LLJL;
                            c1846060y8i.LJIILL(null, true);
                            return;
                        }
                        return;
                    }
                    C1846060y8i c1846060y8i2 = this.LLJJI;
                    if (c1846060y8i2 != null && (parent2 = c1846060y8i2.getParent()) != null) {
                        parent = parent2.getParent();
                    } else {
                        parent = null;
                    }
                    if (parent instanceof FrameLayout) {
                        C1189060h32.LJJII((View) parent, null, -1, null, null);
                    }
                    C337180DJs.LIZJ(LJJIJL());
                    if (!this.LLJJJIL) {
                        this.LLJJJIL = true;
                        InterfaceC1181010gq3 interfaceC1181010gq3LIZ = C1174850gg7.LIZ(this);
                        if (interfaceC1181010gq3LIZ != null && (c1186840gzSLw12 = interfaceC1181010gq3LIZ.lw1()) != null) {
                            List<C1174090get> list4 = this.LLJJIII;
                            if (list4 != null) {
                                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list4, 10));
                                Iterator<C1174090get> it3 = list4.iterator();
                                while (it3.hasNext()) {
                                    arrayList.add(it3.next().tabMark);
                                }
                                strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62);
                            } else {
                                strLJJLIIIJ = null;
                            }
                            c1186840gzSLw12.LIZ(new C1174110gev(strLJJLIIIJ));
                        }
                        InterfaceC1181010gq3 interfaceC1181010gq3LIZ2 = C1174850gg7.LIZ(this);
                        if (interfaceC1181010gq3LIZ2 != null && (c1186840gzSLw1 = interfaceC1181010gq3LIZ2.lw1()) != null) {
                            String strLJFF = C1174850gg7.LJFF(this);
                            if (strLJFF == null) {
                                strLJFF = C1173980gei.LIZ(this);
                            }
                            c1186840gzSLw1.LIZ(new C1174200gf4(strLJFF, C1173980gei.LIZ(this)));
                        }
                    }
                    List<C1174090get> list5 = this.LLJJIII;
                    if (list5 == null) {
                        return;
                    }
                    int iIndexOf = list5.indexOf(c1174090get2);
                    C1846060y8i c1846060y8i3 = this.LLJJI;
                    if (c1846060y8i3 != null) {
                        c1845940y8WLJII = c1846060y8i3.LJII(iIndexOf);
                    }
                    C1846060y8i c1846060y8i4 = this.LLJJI;
                    if (c1846060y8i4 != null && c1846060y8i4.getSelectedTabPosition() == iIndexOf) {
                        return;
                    }
                    if (c1845940y8WLJII != null) {
                        c1845940y8WLJII.LIZ = EnumC041500Cv.SCROLL;
                    }
                    C1846060y8i c1846060y8i5 = this.LLJJI;
                    if (c1846060y8i5 == null) {
                        return;
                    }
                    C1085640eME c1085640eME2 = C1846060y8i.LLJL;
                    c1846060y8i5.LJIILL(c1845940y8WLJII, true);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJJI = (C1846060y8i) view.findViewById(R.id.vja);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.snb);
        this.LLJJIJIIJIL = viewGroup;
        C1180060goW.LJIIIZ(ip(), viewGroup);
        InterfaceC1181010gq3 interfaceC1181010gq3LIZ = C1174850gg7.LIZ(this);
        if (interfaceC1181010gq3LIZ != null) {
            interfaceC1181010gq3LIZ.Wd2(new InterfaceC1174130gex() { // from class: X.0gem
                @Override // X.InterfaceC1174130gex
                public final void LIZLLL(List<C1174050gep> list) {
                    C1174050gep c1174050gep;
                    C1174050gep c1174050gep2;
                    int iLIZJ;
                    ArrayList arrayList = (ArrayList) list;
                    int iLLLZL = 0;
                    if (arrayList.size() > 1) {
                        c1174050gep2 = (C1174050gep) ListProtector.get(list, 0);
                        c1174050gep = (C1174050gep) ListProtector.get(list, 1);
                    } else {
                        c1174050gep = null;
                        if (arrayList.size() != 1) {
                            return;
                        } else {
                            c1174050gep2 = (C1174050gep) ListProtector.get(list, 0);
                        }
                    }
                    if (c1174050gep2 == null) {
                        if (c1174050gep == null) {
                            return;
                        } else {
                            return;
                        }
                    }
                    if (c1174050gep == null) {
                        this.LL.lp(c1174050gep2.LIZIZ);
                        return;
                    }
                    int i = c1174050gep.LIZ;
                    SlashQuickNavigation slashQuickNavigation = this.LL;
                    slashQuickNavigation.getClass();
                    int iIp = SlashQuickNavigation.ip();
                    Context context = slashQuickNavigation.getContext();
                    if (context != null) {
                        iLIZJ = C497820Jfg.LIZJ(context);
                    } else {
                        iLIZJ = 0;
                    }
                    InterfaceC1181010gq3 interfaceC1181010gq3LIZ2 = C1174850gg7.LIZ(slashQuickNavigation);
                    if (interfaceC1181010gq3LIZ2 != null) {
                        iLLLZL = interfaceC1181010gq3LIZ2.LLLZL();
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("nav: ");
                    sbLIZ.append(iIp);
                    sbLIZ.append(", status: ");
                    sbLIZ.append(iLIZJ);
                    sbLIZ.append(", header: ");
                    sbLIZ.append(iLLLZL);
                    C2188811AlT.LIZIZ(sbLIZ);
                    if (i - (((iIp + iLIZJ) + iLLLZL) + 1) < 0) {
                        this.LL.lp(c1174050gep.LIZIZ);
                    } else {
                        this.LL.lp(c1174050gep2.LIZIZ);
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:56:0x00cd  */
                @Override // X.InterfaceC1174130gex
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LJJJJJ(int r8) {
                    /*
                        Method dump skipped, instruction units count: 208
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1174020gem.LJJJJJ(int):void");
                }
            });
        }
        InterfaceC1181010gq3 interfaceC1181010gq3LIZ2 = C1174850gg7.LIZ(this);
        if (interfaceC1181010gq3LIZ2 != null) {
            interfaceC1181010gq3LIZ2.Wd2(new InterfaceC1174060geq() { // from class: X.0gen
                @Override // X.InterfaceC1174060geq
                public final void LJIIZILJ(C1180620gpQ c1180620gpQ) {
                    if (c1180620gpQ != null && c1180620gpQ.LLILZ && c1180620gpQ.LLILLJJLI) {
                        C786410Ut5.LJJZZIII(C0CAU.LIZ, new ARunnableS87S0200000_18(this.LL, c1180620gpQ, 29));
                    }
                }
            });
        }
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI, null), new QuickNavigationContext() { // from class: com.ss.android.ugc.aweme.slash.component.navigation.SlashQuickNavigation$initAbility$1$1
                @Override // com.ss.android.ugc.aweme.slash.component.navigation.QuickNavigationContext
                public final C1174080ges UJ0(String str) {
                    C1174090get c1174090get;
                    Integer numValueOf;
                    String str2;
                    List<C1174090get> list = this.LL.LLJJIII;
                    Integer numValueOf2 = null;
                    if (list != null) {
                        c1174090get = (C1174090get) C13LP.LJJJJZI(list);
                    } else {
                        c1174090get = null;
                    }
                    List<C1174090get> list2 = this.LL.LLJJIJI;
                    int i = -1;
                    if (list2 != null) {
                        Iterator<C1174090get> it2 = list2.iterator();
                        int i2 = 0;
                        while (true) {
                            if (it2.hasNext()) {
                                String str3 = it2.next().instanceId;
                                if (c1174090get != null) {
                                    str2 = c1174090get.instanceId;
                                } else {
                                    str2 = null;
                                }
                                if (Intrinsics.LJFF(str3, str2)) {
                                    break;
                                }
                                i2++;
                            } else {
                                i2 = -1;
                                break;
                            }
                        }
                        numValueOf = Integer.valueOf(i2);
                    } else {
                        numValueOf = null;
                    }
                    List<C1174090get> list3 = this.LL.LLJJIJI;
                    if (list3 != null) {
                        Iterator<C1174090get> it3 = list3.iterator();
                        int i3 = 0;
                        while (true) {
                            if (!it3.hasNext()) {
                                break;
                            }
                            if (Intrinsics.LJFF(it3.next().instanceId, str)) {
                                i = i3;
                                break;
                            }
                            i3++;
                        }
                        numValueOf2 = Integer.valueOf(i);
                    }
                    if (numValueOf != null && numValueOf2 != null && numValueOf2.intValue() >= numValueOf.intValue()) {
                        this.LL.getClass();
                        return new C1174080ges(SlashQuickNavigation.ip(), true);
                    }
                    this.LL.getClass();
                    return new C1174080ges(SlashQuickNavigation.ip(), false);
                }
            }, QuickNavigationContext.class, null, null);
        }
        AssemVMLazy assemVMLazy = this.LLJJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJL;
        C736680Sv4.LJIIIZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0gOv
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1164180gOu) obj).LL;
            }
        }, new C2217381BqS() { // from class: X.0gOw
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1164180gOu) obj).LLILLJJLI;
            }
        }, C736820SvI.LIZLLL(), new AwS667S0100000_18(this, 21), 8);
        C337180DJs.LIZ(LJJIJL());
    }
}
