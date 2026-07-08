package com.ss.android.ugc.aweme.inbox.workbench.viewmodel;

import X.C09R9;
import X.C1383370m6R;
import X.C13LE;
import X.C13LP;
import X.C1875807Wi;
import X.C623470Ocr;
import X.C623910OdZ;
import X.C623970Odf;
import X.C624240Oe6;
import X.C627660Ojc;
import X.EnumC623890OdX;
import X.EnumC623960Ode;
import X.InterfaceC0148002o;
import X.InterfaceC1891350zJl;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MissionStruct;
import com.ss.android.ugc.aweme.notice.repo.list.bean.WorkBenchNoticeResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AwS588S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class WorkBenchCardListViewModel extends AssemListViewModel<C623910OdZ, InterfaceC1891350zJl, String> {
    public static final /* synthetic */ int LLJJIJI = 0;
    public long LLILLL;
    public WorkBenchNoticeResponse LLILZIL;
    public WorkBenchNoticeResponse LLILZLL;
    public boolean LLIZ;
    public long LLIZLLLIL;
    public boolean LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;
    public boolean LLJJI;
    public int LL = EnumC623890OdX.TAB_UNKNOWN.getValue();
    public String LLILLJJLI = "";
    public String LLILZ = "";
    public final Set<Long> LLJ = new LinkedHashSet();
    public boolean LLJI = true;
    public final Set<Long> LLJIJIL = new LinkedHashSet();
    public final List<InterfaceC1891350zJl> LLJILJIL = new ArrayList();
    public final C09R9 LLJJIII = new C09R9(this, C13LE.LIZ(C624240Oe6.class));

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C623910OdZ(0);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.LL = EnumC623890OdX.TAB_UNKNOWN.getValue();
        this.LLILLJJLI = "";
        this.LLILLL = 0L;
        this.LLJ.clear();
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<InterfaceC1891350zJl> c627660Ojc) {
        setState(new AwS588S0100000_9(c627660Ojc, (C627660Ojc<C623470Ocr>) 240));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0121  */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onRefresh(X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.String>> r15) {
        /*
            Method dump skipped, instruction units count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.workbench.viewmodel.WorkBenchCardListViewModel.onRefresh(X.05Vn):java.lang.Object");
    }

    public final List<InterfaceC1891350zJl> vQ2(List<InterfaceC1891350zJl> list) {
        C623970Odf c623970Odf;
        C623970Odf c623970Odf2;
        C623970Odf c623970Odf3;
        MissionStruct missionStruct;
        MissionStruct missionStruct2;
        if (list.isEmpty()) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (InterfaceC1891350zJl interfaceC1891350zJl : list) {
            if ((interfaceC1891350zJl instanceof C623970Odf) && interfaceC1891350zJl != null) {
                arrayList.add(interfaceC1891350zJl);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.LLJI = true;
        Object objLJJJLZIJ = C13LP.LJJJLZIJ(0, arrayList2);
        if ((objLJJJLZIJ instanceof C623970Odf) && (c623970Odf = (C623970Odf) objLJJJLZIJ) != null) {
            MissionStruct missionStruct3 = c623970Odf.LL;
            if (missionStruct3 != null && missionStruct3.hasRead) {
                this.LLJI = false;
            } else {
                ListProtector.add(arrayList2, 0, new C1875807Wi(C1383370m6R.LJIIJ(2131837453), true));
                int size = arrayList2.size();
                Iterator it2 = arrayList2.iterator();
                int i = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    i++;
                    InterfaceC1891350zJl interfaceC1891350zJl2 = (InterfaceC1891350zJl) it2.next();
                    if (i < size && (interfaceC1891350zJl2 instanceof C623970Odf) && (c623970Odf2 = (C623970Odf) interfaceC1891350zJl2) != null) {
                        Object obj = ListProtector.get(arrayList2, i);
                        if ((obj instanceof C623970Odf) && (c623970Odf3 = (C623970Odf) obj) != null && (missionStruct = c623970Odf2.LL) != null && !missionStruct.hasRead && (missionStruct2 = c623970Odf3.LL) != null && missionStruct2.hasRead) {
                            if (i != -1) {
                                ListProtector.add(arrayList2, i, new C1875807Wi(C1383370m6R.LJIIJ(2131837454), false));
                                this.LLJI = false;
                                return arrayList2;
                            }
                        }
                    }
                }
            }
            return arrayList2;
        }
        return list;
    }

    public final boolean wQ2(Integer num) {
        if (num == null) {
            return false;
        }
        num.intValue();
        if (num.intValue() == EnumC623960Ode.STATUS_PENDING.getValue()) {
            if (this.LL != EnumC623890OdX.TAB_ALL.getValue() && this.LL != EnumC623890OdX.TAB_PENDING.getValue()) {
                return false;
            }
        } else {
            if (num.intValue() == EnumC623960Ode.STATUS_IN_PROGRESS.getValue()) {
                if (this.LL != EnumC623890OdX.TAB_ALL.getValue() && this.LL != EnumC623890OdX.TAB_IN_PROGRESS.getValue()) {
                    return false;
                }
            } else {
                if (num.intValue() == EnumC623960Ode.STATUS_COMPLETED.getValue()) {
                    if (this.LL != EnumC623890OdX.TAB_ALL.getValue() && this.LL != EnumC623890OdX.TAB_COMPLETED.getValue()) {
                        return false;
                    }
                } else {
                    if (num.intValue() != EnumC623960Ode.STATUS_CLOSED.getValue()) {
                        return false;
                    }
                    if (this.LL != EnumC623890OdX.TAB_ALL.getValue() && this.LL != EnumC623890OdX.TAB_CLOSED.getValue()) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public final List<InterfaceC1891350zJl> xQ2(WorkBenchNoticeResponse workBenchNoticeResponse, List<InterfaceC1891350zJl> list) {
        List<MissionStruct> missionList;
        long j;
        Integer numValueOf;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            arrayList.addAll(list);
        }
        if (workBenchNoticeResponse != null && (missionList = workBenchNoticeResponse.getMissionList()) != null) {
            for (MissionStruct missionStruct : missionList) {
                if (missionStruct != null) {
                    j = missionStruct.mid;
                } else {
                    j = 0;
                }
                if (!this.LLJ.contains(Long.valueOf(j))) {
                    if (missionStruct != null) {
                        numValueOf = Integer.valueOf(missionStruct.statusType);
                    } else {
                        numValueOf = null;
                    }
                    if (wQ2(numValueOf)) {
                        this.LLJ.add(Long.valueOf(j));
                        arrayList.add(new C623970Odf(missionStruct));
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x010d  */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /* JADX INFO: renamed from: yQ2, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onLoadMore(java.lang.String r14, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.String>> r15) {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.workbench.viewmodel.WorkBenchCardListViewModel.onLoadMore(java.lang.String, X.05Vn):java.lang.Object");
    }

    public static void AQ2(List list, C623970Odf c623970Odf, Set set) {
        C623970Odf c623970Odf2;
        MissionStruct missionStruct;
        C623970Odf c623970Odf3;
        MissionStruct missionStruct2;
        MissionStruct missionStruct3 = c623970Odf.LL;
        if (missionStruct3 != null) {
            long j = missionStruct3.mid;
            if (set.contains(Long.valueOf(j))) {
                Iterator it2 = list.iterator();
                int i = 0;
                while (it2.hasNext()) {
                    int i2 = i + 1;
                    InterfaceC1891350zJl interfaceC1891350zJl = (InterfaceC1891350zJl) it2.next();
                    boolean z = interfaceC1891350zJl instanceof C623970Odf;
                    if (z && (c623970Odf2 = (C623970Odf) interfaceC1891350zJl) != null && (missionStruct = c623970Odf2.LL) != null && missionStruct.mid == j) {
                        if (z && (c623970Odf3 = (C623970Odf) interfaceC1891350zJl) != null && (missionStruct2 = c623970Odf3.LL) != null) {
                            boolean z2 = missionStruct2.hasRead;
                            MissionStruct missionStruct4 = c623970Odf.LL;
                            C623970Odf c623970Odf4 = new C623970Odf(missionStruct4.copy(missionStruct4.mid, missionStruct4.sourceType, missionStruct4.statusType, missionStruct4.updateTime, missionStruct4.createTime, z2, missionStruct4.uiStruct, missionStruct4.messageExtra, missionStruct4.subSourceType, missionStruct4.subSourceLabel, missionStruct4.subSourceText, missionStruct4.unsubscribeStatus));
                            if (i != -1) {
                                ListProtector.set(list, i, c623970Odf4);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    i = i2;
                }
                return;
            }
            ListProtector.add(list, 0, c623970Odf);
            set.add(Long.valueOf(j));
        }
    }

    public static void zQ2(List list, C623970Odf c623970Odf, Set set) {
        C623970Odf c623970Odf2;
        MissionStruct missionStruct;
        MissionStruct missionStruct2 = c623970Odf.LL;
        if (missionStruct2 != null) {
            long j = missionStruct2.mid;
            if (set.contains(Long.valueOf(j))) {
                Iterator it2 = list.iterator();
                int i = 0;
                while (it2.hasNext()) {
                    int i2 = i + 1;
                    InterfaceC1891350zJl interfaceC1891350zJl = (InterfaceC1891350zJl) it2.next();
                    if ((interfaceC1891350zJl instanceof C623970Odf) && (c623970Odf2 = (C623970Odf) interfaceC1891350zJl) != null && (missionStruct = c623970Odf2.LL) != null && missionStruct.mid == j) {
                        if (i != -1) {
                            ListProtector.remove(list, i);
                            set.remove(Long.valueOf(j));
                            return;
                        }
                        return;
                    }
                    i = i2;
                }
            }
        }
    }
}
