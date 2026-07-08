package com.ss.android.ugc.profile.business.ur.school.findschoolfriends.schoolgroups;

import X.AbstractC316870CbV;
import X.C01GW;
import X.C05JG;
import X.C099M;
import X.C099Q;
import X.C099R;
import X.C0PEM;
import X.C0YSQ;
import X.C1007450cK7;
import X.C1157130gDX;
import X.C1214240hhe;
import X.C1214260hhg;
import X.C1234860iEu;
import X.C1236480iHW;
import X.C1236490iHX;
import X.C1910890zpH;
import X.C1DFH;
import X.C2107308Nj;
import X.C2188811AlT;
import X.C2252611DEt;
import X.C23250099c;
import X.C452501pT;
import X.C627660Ojc;
import X.EnumC1234850iEt;
import X.InterfaceC0148002o;
import X.InterfaceC1214250hhf;
import X.InterfaceC1364105Vn;
import X.InterfaceC497601wk;
import X.InterfaceC876950Yaj;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.profile.business.ur.school.datasource.GroupSectionInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AwS106S0110000_19;
import kotlin.jvm.internal.AwS228S0300000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS598S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class SchoolGroupsListViewModel extends AssemListViewModel<C1236480iHW, InterfaceC1214250hhf, C1007450cK7> {
    public static final /* synthetic */ int LLIZLLLIL = 0;
    public int LLILLL;
    public Long LLILZ;
    public final C01GW LL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(474));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(318));
    public final Map<String, Long> LLILZIL = new LinkedHashMap();
    public final Set<String> LLILZLL = Collections.newSetFromMap(new ConcurrentHashMap());
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2430));

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1236480iHW(0);
    }

    public final C1910890zpH getLogger() {
        return (C1910890zpH) this.LL.getValue();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C1910890zpH logger = getLogger();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("remove observer: ");
        sbLIZ.append(this.LLIZ.getValue());
        logger.LIZ("SchoolGroupsListViewModel", C2188811AlT.LIZIZ(sbLIZ));
        C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LJJIJIIJIL((C1236490iHX) this.LLIZ.getValue());
        this.LLILZLL.clear();
        this.LLILZ = null;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        C1910890zpH logger = getLogger();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("add observer: ");
        sbLIZ.append(this.LLIZ.getValue());
        logger.LIZ("SchoolGroupsListViewModel", C2188811AlT.LIZIZ(sbLIZ));
        C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LJI((C1236490iHX) this.LLIZ.getValue());
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<InterfaceC1214250hhf> c627660Ojc) {
        setState(new AwS598S0100000_19(c627660Ojc, (C627660Ojc<C1157130gDX>) 412));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<C1007450cK7>> interfaceC1364105Vn) {
        return yQ2(new C1007450cK7(""), interfaceC1364105Vn);
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(C1007450cK7 c1007450cK7, InterfaceC1364105Vn<? super AbstractC316870CbV<C1007450cK7>> interfaceC1364105Vn) {
        return yQ2(c1007450cK7, interfaceC1364105Vn);
    }

    public final Object yQ2(C1007450cK7 c1007450cK7, InterfaceC1364105Vn<? super AbstractC316870CbV<C1007450cK7>> interfaceC1364105Vn) {
        C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        withState(new AwS228S0300000_19(this, c1007450cK7, c2252611DEt, 16));
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLJIJ;
    }

    public final void wQ2(List<InterfaceC1214250hhf> list, C1236480iHW c1236480iHW, EnumC1234850iEt enumC1234850iEt) {
        Integer num;
        Integer num2;
        int i;
        Integer num3;
        GroupSectionInfo groupSectionInfo = c1236480iHW.LLILZIL;
        if (groupSectionInfo == null) {
            return;
        }
        C1910890zpH logger = getLogger();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("add headers: my count: ");
        sbLIZ.append(groupSectionInfo.myCnt);
        sbLIZ.append(", others count: ");
        sbLIZ.append(groupSectionInfo.othersCnt);
        logger.LIZ("SchoolGroupsListViewModel", C2188811AlT.LIZIZ(sbLIZ));
        Integer num4 = groupSectionInfo.myCnt;
        if ((num4 != null && num4.intValue() == 0 && (((num3 = groupSectionInfo.othersCnt) == null || num3.intValue() != 0) && enumC1234850iEt == EnumC1234850iEt.MY_GROUPS)) || (((num = groupSectionInfo.myCnt) == null || num.intValue() != 0) && (num2 = groupSectionInfo.othersCnt) != null && num2.intValue() == 0 && enumC1234850iEt == EnumC1234850iEt.EXPLORE)) {
            ArrayList arrayList = (ArrayList) list;
            Iterator it2 = arrayList.iterator();
            int i2 = 0;
            while (true) {
                i = -1;
                if (it2.hasNext()) {
                    InterfaceC1214250hhf interfaceC1214250hhf = (InterfaceC1214250hhf) it2.next();
                    if ((interfaceC1214250hhf instanceof C1214260hhg) && C1234860iEu.LIZ(((C1214260hhg) interfaceC1214250hhf).LL) == EnumC1234850iEt.MY_GROUPS) {
                        break;
                    } else {
                        i2++;
                    }
                } else {
                    i2 = -1;
                    break;
                }
            }
            Iterator it3 = arrayList.iterator();
            int i3 = 0;
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                InterfaceC1214250hhf interfaceC1214250hhf2 = (InterfaceC1214250hhf) it3.next();
                if ((interfaceC1214250hhf2 instanceof C1214260hhg) && C1234860iEu.LIZ(((C1214260hhg) interfaceC1214250hhf2).LL) == EnumC1234850iEt.EXPLORE) {
                    i = i3;
                    break;
                }
                i3++;
            }
            if (i2 >= 0 && i >= 0) {
                getLogger().LIZ("SchoolGroupsListViewModel", "actual add headers");
                ListProtector.add(list, i2, new C1214240hhe(EnumC1234850iEt.MY_GROUPS));
                ListProtector.add(list, i + 1, new C1214240hhe(EnumC1234850iEt.EXPLORE));
            }
        }
    }

    public final void xQ2(String str, String str2, Function0<Unit> function0) {
        long jLongValue;
        if (str2 == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(str2);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        long jCurrentTimeMillis = System.currentTimeMillis();
        Long l = (Long) ((LinkedHashMap) this.LLILZIL).get(strLIZIZ);
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        long j = jCurrentTimeMillis - jLongValue;
        if (j < 500) {
            C1910890zpH logger = getLogger();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("debounce: ");
            sbLIZ2.append(str);
            sbLIZ2.append(" ignored for ");
            sbLIZ2.append(str2);
            sbLIZ2.append(", timeDiff=");
            sbLIZ2.append(j);
            sbLIZ2.append("ms");
            logger.LJII("SchoolGroupsListViewModel", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        this.LLILZIL.put(strLIZIZ, Long.valueOf(jCurrentTimeMillis));
        InterfaceC497601wk assemVMScope = getAssemVMScope();
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(assemVMScope, C2107308Nj.LIZ, null, new C05JG(function0, null), 2);
    }

    public final void zQ2(List<InterfaceC1214250hhf> list, C1236480iHW c1236480iHW, EnumC1234850iEt enumC1234850iEt) {
        int i;
        Integer num;
        GroupSectionInfo groupSectionInfo = c1236480iHW.LLILZIL;
        if (groupSectionInfo == null) {
            return;
        }
        C1910890zpH logger = getLogger();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("remove headers: my count: ");
        sbLIZ.append(groupSectionInfo.myCnt);
        sbLIZ.append(", others count: ");
        sbLIZ.append(groupSectionInfo.othersCnt);
        logger.LIZ("SchoolGroupsListViewModel", C2188811AlT.LIZIZ(sbLIZ));
        Integer num2 = groupSectionInfo.myCnt;
        if (num2 == null || num2.intValue() != 1 || (((num = groupSectionInfo.othersCnt) != null && num.intValue() == 0) || enumC1234850iEt != EnumC1234850iEt.MY_GROUPS)) {
            Integer num3 = groupSectionInfo.othersCnt;
            if (num3 != null && num3.intValue() == 1) {
                Integer num4 = groupSectionInfo.myCnt;
                if ((num4 != null && num4.intValue() == 0) || enumC1234850iEt != EnumC1234850iEt.EXPLORE) {
                    return;
                }
            } else {
                return;
            }
        }
        ArrayList arrayList = (ArrayList) list;
        Iterator it2 = arrayList.iterator();
        int i2 = 0;
        while (true) {
            i = -1;
            if (it2.hasNext()) {
                InterfaceC1214250hhf interfaceC1214250hhf = (InterfaceC1214250hhf) it2.next();
                if ((interfaceC1214250hhf instanceof C1214240hhe) && ((C1214240hhe) interfaceC1214250hhf).LL.getId() == EnumC1234850iEt.MY_GROUPS.getId()) {
                    break;
                } else {
                    i2++;
                }
            } else {
                i2 = -1;
                break;
            }
        }
        Iterator it3 = arrayList.iterator();
        int i3 = 0;
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            InterfaceC1214250hhf interfaceC1214250hhf2 = (InterfaceC1214250hhf) it3.next();
            if ((interfaceC1214250hhf2 instanceof C1214240hhe) && ((C1214240hhe) interfaceC1214250hhf2).LL.getId() == EnumC1234850iEt.EXPLORE.getId()) {
                i = i3;
                break;
            }
            i3++;
        }
        if (i2 >= 0 && i >= 0) {
            getLogger().LIZ("SchoolGroupsListViewModel", "actual remove headers");
            ListProtector.remove(list, i);
            ListProtector.remove(list, i2);
        }
    }

    public final void vQ2(List list, C1214260hhg c1214260hhg, C1236480iHW c1236480iHW, boolean z) {
        if ((!((ArrayList) list).isEmpty()) && (ListProtector.get(list, 0) instanceof C1214240hhe)) {
            ListProtector.add(list, 1, c1214260hhg);
        } else {
            ListProtector.add(list, 0, c1214260hhg);
        }
        wQ2(list, c1236480iHW, EnumC1234850iEt.MY_GROUPS);
        if (z) {
            zQ2(list, c1236480iHW, EnumC1234850iEt.EXPLORE);
        }
        GroupSectionInfo groupSectionInfo = c1236480iHW.LLILZIL;
        if (groupSectionInfo == null) {
            return;
        }
        setState(new AwS106S0110000_19(groupSectionInfo, z, 6));
    }
}
