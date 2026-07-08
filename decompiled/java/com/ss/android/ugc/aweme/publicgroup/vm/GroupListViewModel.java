package com.ss.android.ugc.aweme.publicgroup.vm;

import X.C01GW;
import X.C0Y8T;
import X.C0Y8Y;
import X.C0YSQ;
import X.C0ZFW;
import X.C1157220gDg;
import X.C1219970hqt;
import X.C1228470i4b;
import X.C1228780i56;
import X.C1228810i59;
import X.C1229260i5s;
import X.C1229580i6O;
import X.C1229630i6T;
import X.C1229760i6g;
import X.C1229790i6j;
import X.C1229800i6k;
import X.C1229840i6o;
import X.C1229970i71;
import X.C1383370m6R;
import X.C13BV;
import X.C13LP;
import X.C1529305yl;
import X.C15438062q;
import X.C1559260qg8;
import X.C291001Au;
import X.C452501pT;
import X.C459080HzO;
import X.C461720I8s;
import X.C723600SZy;
import X.EnumC1219960hqs;
import X.EnumC1229960i70;
import X.InterfaceC0148002o;
import X.InterfaceC1891350zJl;
import X.InterfaceC876950Yaj;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.publicgroup.data.GroupForPreview;
import com.ss.android.ugc.aweme.publicgroup.data.GroupPreviewDisplayMeta;
import com.ss.android.ugc.aweme.publicgroup.data.PopupDisplayMeta;
import com.ss.android.ugc.aweme.publicgroup.data.PreviewEntryMeta;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS106S0110000_19;
import kotlin.jvm.internal.AwS39S0310000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes20.dex */
public final class GroupListViewModel extends AssemViewModel<C1229630i6T> {
    public static final /* synthetic */ int LLIZ = 0;
    public final C1559260qg8 LL = new C1559260qg8(new C723600SZy(this, C1228780i56.class, null), true);
    public final Map<Long, Map<String, String>> LLILLJJLI = new LinkedHashMap();
    public final List<Long> LLILLL = new ArrayList();
    public final List<Long> LLILZ = new ArrayList();
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1717));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1718));

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        C291001Au c291001Au = new C291001Au("");
        C13BV c13bv = C13BV.INSTANCE;
        return new C1229630i6T(new C1229580i6O(c13bv, false, ""), new C1229840i6o(c13bv, false, false), false, c291001Au, false, false, null);
    }

    public final C1229260i5s xQ2() {
        return (C1229260i5s) this.LLILZIL.getValue();
    }

    public final C1228780i56 yQ2() {
        return (C1228780i56) this.LL.getValue();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LJJIJIIJIL((C1229790i6j) this.LLILZLL.getValue());
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LJI((C1229790i6j) this.LLILZLL.getValue());
    }

    public final boolean zQ2() {
        C1228470i4b c1228470i4b;
        C1228810i59 c1228810i59;
        C1228780i56 c1228780i56YQ2 = yQ2();
        return C461720I8s.LJI((c1228780i56YQ2 == null || (c1228470i4b = c1228780i56YQ2.LL) == null || (c1228810i59 = c1228470i4b.LIZIZ) == null) ? null : c1228810i59.LIZJ);
    }

    public final void AQ2(String str) {
        if (str == null) {
            return;
        }
        C1229630i6T c1229630i6T = (C1229630i6T) getState();
        List<InterfaceC1891350zJl> list = c1229630i6T.LL.LIZ;
        ArrayList arrayList = new ArrayList();
        for (InterfaceC1891350zJl interfaceC1891350zJl : list) {
            if (interfaceC1891350zJl instanceof C1229760i6g) {
                arrayList.add(interfaceC1891350zJl);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!Intrinsics.LJFF(String.valueOf(((C1229760i6g) obj).LL), str)) {
                arrayList2.add(obj);
            }
        }
        List<C1229760i6g> list2 = c1229630i6T.LLILLJJLI.LIZ;
        ArrayList arrayList3 = new ArrayList();
        for (C1229760i6g c1229760i6g : list2) {
            if (!Intrinsics.LJFF(String.valueOf(c1229760i6g.LL), str)) {
                arrayList3.add(c1229760i6g);
            }
        }
        boolean z = c1229630i6T.LLILZIL;
        if (arrayList2.size() != c1229630i6T.LL.LIZ.size() || arrayList3.size() != c1229630i6T.LLILLJJLI.LIZ.size()) {
            GQ2(arrayList2, arrayList3, z, null);
        }
    }

    public final void BQ2(boolean z) {
        String str;
        String str2;
        C1228470i4b c1228470i4b;
        C1228810i59 c1228810i59;
        Pair[] pairArr = new Pair[2];
        C1228780i56 c1228780i56YQ2 = yQ2();
        if (c1228780i56YQ2 == null || (c1228470i4b = c1228780i56YQ2.LL) == null || (c1228810i59 = c1228470i4b.LIZIZ) == null || (str = c1228810i59.LIZ) == null) {
            str = "";
        }
        pairArr[0] = new Pair("enter_from", str);
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[1] = new Pair("is_change_rank", str2);
        C459080HzO.LJFF("ttsocial_group_chat_save_btn_click", pairArr);
    }

    public final void CQ2(boolean z) {
        String str;
        C1228780i56 c1228780i56YQ2 = yQ2();
        if (c1228780i56YQ2 == null) {
            return;
        }
        C1228810i59 c1228810i59 = c1228780i56YQ2.LL.LIZIZ;
        Map<String, String> map = c1228810i59.LJIIJJI;
        Pair[] pairArr = new Pair[9];
        pairArr[0] = new Pair("enter_from", c1228810i59.LIZ);
        if (z) {
            str = "change_visibility";
        } else {
            str = c1228780i56YQ2.LL.LIZIZ.LIZIZ;
        }
        pairArr[1] = new Pair("enter_method", str);
        pairArr[2] = new Pair("is_profile_owner", C1529305yl.LIZ(Boolean.valueOf(zQ2())));
        List<InterfaceC1891350zJl> list = getState().LL.LIZ;
        ArrayList arrayList = new ArrayList();
        for (InterfaceC1891350zJl interfaceC1891350zJl : list) {
            if (interfaceC1891350zJl instanceof C1229760i6g) {
                arrayList.add(interfaceC1891350zJl);
            }
        }
        pairArr[3] = new Pair("visible_group_chat_list", C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, AFwS257S0000000_19.get$arr$(262), 30));
        List<InterfaceC1891350zJl> list2 = getState().LL.LIZ;
        ArrayList arrayList2 = new ArrayList();
        for (InterfaceC1891350zJl interfaceC1891350zJl2 : list2) {
            if (interfaceC1891350zJl2 instanceof C1229760i6g) {
                arrayList2.add(interfaceC1891350zJl2);
            }
        }
        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(Long.valueOf(((C1229760i6g) it2.next()).LL));
        }
        List<C1229760i6g> list3 = getState().LLILLJJLI.LIZ;
        ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(list3, 10));
        Iterator<C1229760i6g> it3 = list3.iterator();
        while (it3.hasNext()) {
            arrayList4.add(Long.valueOf(it3.next().LL));
        }
        pairArr[4] = new Pair("total_group_chat_list", C13LP.LJJLIIIJ(C13LP.LJLIL(arrayList4, arrayList3), ",", null, null, 0, null, null, 62));
        pairArr[5] = new Pair("enter_position", map.get("enter_position"));
        pairArr[6] = new Pair("group_id", map.get("group_id"));
        pairArr[7] = new Pair("is_video_author", map.get("is_video_author"));
        pairArr[8] = new Pair("group_owner_account_type", map.get("group_owner_account_type"));
        C459080HzO.LJFF("ttsocial_profile_group_chat_list_show", pairArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object vQ2(boolean r11, X.InterfaceC1364105Vn<? super kotlin.Unit> r12) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.publicgroup.vm.GroupListViewModel.vQ2(boolean, X.05Vn):java.lang.Object");
    }

    public final List wQ2(List list, boolean z) {
        EnumC1229960i70 enumC1229960i70LIZ;
        boolean zLJFF;
        boolean z2;
        C1228780i56 c1228780i56YQ2 = yQ2();
        if (c1228780i56YQ2 == null) {
            return C13BV.INSTANCE;
        }
        C1228810i59 c1228810i59 = c1228780i56YQ2.LL.LIZIZ;
        ArrayList<GroupPreviewDisplayMeta> arrayList = new ArrayList();
        for (Object obj : list) {
            GroupPreviewDisplayMeta groupPreviewDisplayMeta = (GroupPreviewDisplayMeta) obj;
            C1219970hqt c1219970hqt = EnumC1219960hqs.Companion;
            int i = groupPreviewDisplayMeta.groupInfo.businessType;
            c1219970hqt.getClass();
            EnumC1219960hqs enumC1219960hqsLIZ = C1219970hqt.LIZ(i);
            if (c1228810i59.LJIILL.length() > 0) {
                zLJFF = Intrinsics.LJFF(groupPreviewDisplayMeta.groupInfo.groupType, c1228810i59.LJIILL);
            } else {
                zLJFF = true;
            }
            if (c1228810i59.LJIILLIIL.contains(enumC1219960hqsLIZ) && !c1228810i59.LJIIZILJ.contains(enumC1219960hqsLIZ)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (zLJFF && z2) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        for (GroupPreviewDisplayMeta groupPreviewDisplayMeta2 : arrayList) {
            GroupForPreview groupForPreview = groupPreviewDisplayMeta2.groupInfo;
            long j = groupForPreview.convShortId;
            String str = groupForPreview.groupName;
            String str2 = groupForPreview.avatarUrl;
            int i2 = groupForPreview.groupSize;
            String str3 = groupForPreview.accessCriteriaDesc;
            if (zQ2()) {
                enumC1229960i70LIZ = EnumC1229960i70.IN_GROUP;
            } else {
                C1229970i71 c1229970i71 = EnumC1229960i70.Companion;
                int i3 = groupPreviewDisplayMeta2.userGroupStatus;
                c1229970i71.getClass();
                enumC1229960i70LIZ = C1229970i71.LIZ(i3);
            }
            GroupForPreview groupForPreview2 = groupPreviewDisplayMeta2.groupInfo;
            arrayList2.add(new C1229760i6g(j, str, str2, i2, enumC1229960i70LIZ, str3, groupForPreview2.groupDesc, groupForPreview2.groupType, groupForPreview2.businessType, z, false, groupPreviewDisplayMeta2));
        }
        return arrayList2;
    }

    public final void EQ2(String str, int i, PopupDisplayMeta popupDisplayMeta) {
        Object next;
        GroupPreviewDisplayMeta groupPreviewDisplayMeta;
        int i2;
        PopupDisplayMeta popupDisplayMeta2;
        PreviewEntryMeta previewEntryMeta;
        if (str == null) {
            return;
        }
        List<InterfaceC1891350zJl> list = ((C1229630i6T) getState()).LL.LIZ;
        ArrayList arrayList = new ArrayList();
        for (InterfaceC1891350zJl interfaceC1891350zJl : list) {
            if (interfaceC1891350zJl instanceof C1229760i6g) {
                arrayList.add(interfaceC1891350zJl);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(String.valueOf(((C1229760i6g) next).LL), str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C1229760i6g c1229760i6g = (C1229760i6g) next;
        if (c1229760i6g == null) {
            return;
        }
        GroupPreviewDisplayMeta groupPreviewDisplayMeta2 = c1229760i6g.LLJILJIL;
        if (groupPreviewDisplayMeta2 != null) {
            GroupForPreview groupForPreview = groupPreviewDisplayMeta2.groupInfo;
            GroupForPreview groupForPreview2 = new GroupForPreview(groupForPreview.convShortId, groupForPreview.groupName, groupForPreview.avatarUrl, c1229760i6g.LLILZ, groupForPreview.groupMemberLimit, groupForPreview.groupDesc, groupForPreview.groupOwnerId, groupForPreview.groupOwnerName, groupForPreview.needApproval, groupForPreview.auditQuestion, groupForPreview.accessCriteriaDesc, groupForPreview.businessType, groupForPreview.groupType, groupForPreview.effectiveConfig, groupForPreview.showStatus);
            if (popupDisplayMeta != null) {
                PopupDisplayMeta popupDisplayMeta3 = c1229760i6g.LLJILJIL.popupDisplayMeta;
                if (popupDisplayMeta3 != null) {
                    previewEntryMeta = popupDisplayMeta3.previewEntry;
                } else {
                    previewEntryMeta = null;
                }
                popupDisplayMeta2 = new PopupDisplayMeta(popupDisplayMeta.groupInfo, popupDisplayMeta.userGroupStatus, popupDisplayMeta.checkResults, popupDisplayMeta.groupInvitation, popupDisplayMeta.eventTracking, previewEntryMeta);
            } else {
                popupDisplayMeta2 = c1229760i6g.LLJILJIL.popupDisplayMeta;
            }
            groupPreviewDisplayMeta = new GroupPreviewDisplayMeta(groupForPreview2, i, groupPreviewDisplayMeta2.checkResults, groupPreviewDisplayMeta2.eventTracking, popupDisplayMeta2);
        } else {
            groupPreviewDisplayMeta = null;
        }
        EnumC1229960i70.Companion.getClass();
        EnumC1229960i70 enumC1229960i70LIZ = C1229970i71.LIZ(i);
        if (i == 1) {
            i2 = c1229760i6g.LLILZ - 1;
        } else {
            i2 = c1229760i6g.LLILZ;
        }
        C1229760i6g c1229760i6gLIZ = C1229760i6g.LIZ(c1229760i6g, null, null, i2, enumC1229960i70LIZ, null, false, false, groupPreviewDisplayMeta, 2023);
        List<InterfaceC1891350zJl> list2 = ((C1229630i6T) getState()).LL.LIZ;
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
        for (InterfaceC1891350zJl interfaceC1891350zJl2 : list2) {
            if ((interfaceC1891350zJl2 instanceof C1229760i6g) && ((C1229760i6g) interfaceC1891350zJl2).LL == c1229760i6gLIZ.LL) {
                interfaceC1891350zJl2 = c1229760i6gLIZ;
            }
            arrayList2.add(interfaceC1891350zJl2);
        }
        GQ2(arrayList2, ((C1229630i6T) getState()).LLILLJJLI.LIZ, ((C1229630i6T) getState()).LLILZIL, null);
    }

    public final void DQ2(List<? extends InterfaceC1891350zJl> list, long j, C0Y8T c0y8t, boolean z) {
        boolean z2;
        C0Y8Y coreInfo = c0y8t.getCoreInfo();
        if (coreInfo == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        boolean z3 = false;
        for (Object objLIZ : list) {
            if (objLIZ instanceof C1229760i6g) {
                C1229760i6g c1229760i6g = (C1229760i6g) objLIZ;
                if (c1229760i6g.LL == j) {
                    String strLJIILLIIL = C0ZFW.LIZ.LJIILLIIL(c0y8t);
                    if (strLJIILLIIL == null) {
                        strLJIILLIIL = c1229760i6g.LLILLL;
                    }
                    boolean z4 = !Intrinsics.LJFF(coreInfo.getName(), c1229760i6g.LLILLJJLI);
                    String str = c1229760i6g.LLILLL;
                    boolean z5 = !Intrinsics.LJFF(a0.LJJZ(strLJIILLIIL, "?", strLJIILLIIL), a0.LJJZ(str, "?", str));
                    if (c0y8t.getMemberCount() != c1229760i6g.LLILZ) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    boolean z6 = !Intrinsics.LJFF(coreInfo.getDesc(), c1229760i6g.LLIZ);
                    if (!z4 && !z5 && !z2 && !z6) {
                        objLIZ = c1229760i6g;
                    } else {
                        String name = coreInfo.getName();
                        if (name == null) {
                            name = c1229760i6g.LLILLJJLI;
                        }
                        int memberCount = c0y8t.getMemberCount();
                        String desc = coreInfo.getDesc();
                        if (desc == null) {
                            desc = c1229760i6g.LLIZ;
                        }
                        objLIZ = C1229760i6g.LIZ(c1229760i6g, name, strLJIILLIIL, memberCount, null, desc, false, false, null, 4017);
                        z3 = true;
                    }
                }
            }
            arrayList.add(objLIZ);
        }
        if (z3) {
            setState(new AwS106S0110000_19(z, (boolean) arrayList, (List<? extends InterfaceC1891350zJl>) 0));
        }
    }

    public final void FQ2(int i, boolean z, boolean z2, List list) {
        ArrayList arrayList = new ArrayList(list);
        ListProtector.set(arrayList, i, C1229760i6g.LIZ((C1229760i6g) ListProtector.get(arrayList, i), null, null, 0, null, null, false, z2, null, 3071));
        if (z) {
            setState(new AwS598S0100000_19(arrayList, (List<? extends ProfileComponents>) 513));
        } else {
            setState(new AwS598S0100000_19(arrayList, (List<? extends ProfileComponents>) 514));
        }
    }

    public final void GQ2(List<? extends InterfaceC1891350zJl> list, List<C1229760i6g> list2, boolean z, Boolean bool) {
        List<C1229760i6g> list3;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        String strLJIIJ;
        List<? extends InterfaceC1891350zJl> listSingletonList = list;
        if (zQ2()) {
            if (xQ2().LIZIZ) {
                list3 = list2;
            } else {
                list3 = C13BV.INSTANCE;
            }
            if (listSingletonList.isEmpty() && list3.isEmpty()) {
                z2 = true;
            } else {
                z2 = false;
            }
            ArrayList arrayList = new ArrayList();
            for (InterfaceC1891350zJl interfaceC1891350zJl : listSingletonList) {
                if (interfaceC1891350zJl instanceof C1229760i6g) {
                    arrayList.add(interfaceC1891350zJl);
                }
            }
            boolean zIsEmpty = arrayList.isEmpty();
            if (!z2 && xQ2().LIZ) {
                z3 = true;
            } else {
                z3 = false;
            }
            if ((!list3.isEmpty()) && !z && xQ2().LIZ) {
                z4 = true;
            } else {
                z4 = false;
            }
            if ((!list3.isEmpty()) && !z && xQ2().LIZIZ) {
                z5 = true;
            } else {
                z5 = false;
                if (z) {
                    strLJIIJ = C1383370m6R.LJIIJ(2131831861);
                }
                if (zIsEmpty && !z2 && xQ2().LIZ) {
                    listSingletonList = Collections.singletonList(new C1157220gDg(C1383370m6R.LJIIJ(2131831866), C1383370m6R.LJIIJ(2131831865)));
                }
                setState(new C1229800i6k(getState(), listSingletonList, z3, strLJIIJ, list2, z5, z4, bool, z, z2));
                return;
            }
            if (zIsEmpty) {
                strLJIIJ = "";
            } else {
                strLJIIJ = C1383370m6R.LJIIJ(2131831855);
            }
            if (zIsEmpty) {
                listSingletonList = Collections.singletonList(new C1157220gDg(C1383370m6R.LJIIJ(2131831866), C1383370m6R.LJIIJ(2131831865)));
            }
            setState(new C1229800i6k(getState(), listSingletonList, z3, strLJIIJ, list2, z5, z4, bool, z, z2));
            return;
        }
        setState(new AwS39S0310000_19(getState(), (C1229630i6T) listSingletonList, (List<? extends InterfaceC1891350zJl>) bool, (Boolean) listSingletonList.isEmpty(), true));
    }
}
