package com.ss.android.ugc.aweme.im.chatlist.impl.feature.archive;

import X.C13BV;
import X.C15438062q;
import X.C2188811AlT;
import X.C884160YmM;
import X.C887580Yrs;
import X.C890610Ywl;
import X.EnumC880850Yh1;
import X.InterfaceC0148002o;
import X.InterfaceC1891350zJl;
import X.InterfaceC884020Ym8;
import X.InterfaceC884640Yn8;
import X.InterfaceC887660Ys0;
import X.InterfaceC888500YtM;
import Y.AComparatorS33S0000000_14;
import Y.AComparatorS513S0100000_14;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.im.core.chatlist.api.engine.IChatListEngine;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS380S0200000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class ArchivePageViewModel extends AssemViewModel<C887580Yrs> {
    public InterfaceC884020Ym8 LL;
    public List<? extends InterfaceC1891350zJl> LLILLJJLI;
    public List<? extends C890610Ywl> LLILLL;
    public List<? extends InterfaceC1891350zJl> LLILZ = C13BV.INSTANCE;
    public final AComparatorS513S0100000_14 LLILZIL = new AComparatorS513S0100000_14(new AComparatorS33S0000000_14(3), 0);
    public volatile boolean LLILZLL;
    public boolean LLIZ;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C887580Yrs(0);
    }

    public final void xQ2() {
        List<? extends InterfaceC1891350zJl> list;
        List<? extends C890610Ywl> list2 = this.LLILLL;
        if (list2 == null || (list = this.LLILLJJLI) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        while (i < list.size() && i2 < list2.size()) {
            if (this.LLILZIL.compare(ListProtector.get(list, i), ListProtector.get(list2, i2)) >= 0) {
                arrayList.add(ListProtector.get(list, i));
                i++;
            } else {
                arrayList.add(ListProtector.get(list2, i2));
                i2++;
            }
        }
        if (i < list.size()) {
            arrayList.addAll(list.subList(i, list.size()));
        }
        if (i2 < list2.size()) {
            arrayList.addAll(list2.subList(i2, list2.size()));
        }
        this.LLILZ = arrayList;
        setState(new AwS380S0200000_14((EnumC880850Yh1) null, this, 115));
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        InterfaceC884640Yn8 config;
        super.onCleared();
        InterfaceC884020Ym8 interfaceC884020Ym8 = this.LL;
        if (interfaceC884020Ym8 == null || (config = interfaceC884020Ym8.getConfig()) == null) {
            return;
        }
        IChatListEngine.LIZ.getClass();
        C884160YmM.LIZ().LJIIIIZZ(config);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    public static List vQ2(ArchivePageViewModel archivePageViewModel) {
        ?? arrayList;
        InterfaceC887660Ys0 interfaceC887660Ys0;
        Object objLIZ;
        C890610Ywl c890610Ywl;
        List<InterfaceC1891350zJl> list = archivePageViewModel.getState().LLILLL;
        Integer numValueOf = null;
        if (list != null) {
            arrayList = new ArrayList();
            for (InterfaceC1891350zJl interfaceC1891350zJl : list) {
                if ((interfaceC1891350zJl instanceof InterfaceC887660Ys0) && (interfaceC887660Ys0 = (InterfaceC887660Ys0) interfaceC1891350zJl) != null && interfaceC887660Ys0.isSelected()) {
                    if ((interfaceC1891350zJl instanceof C890610Ywl) && (c890610Ywl = (C890610Ywl) interfaceC1891350zJl) != null) {
                        objLIZ = c890610Ywl.LIZ();
                    } else {
                        objLIZ = null;
                    }
                    if ((objLIZ instanceof InterfaceC888500YtM) && objLIZ != null) {
                        arrayList.add(objLIZ);
                    }
                }
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getSelectedConversationId, all item size=");
        if (list != null) {
            numValueOf = Integer.valueOf(list.size());
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(", selected size=");
        sbLIZ.append(arrayList.size());
        C2188811AlT.LIZIZ(sbLIZ);
        return arrayList;
    }

    public final void wQ2(EnumC880850Yh1 enumC880850Yh1) {
        this.LLIZ = false;
        if (getState().LLILLJJLI == enumC880850Yh1) {
            return;
        }
        setState(new AwS380S0200000_14(enumC880850Yh1, this, 115));
    }

    public final void yQ2(List<? extends InterfaceC1891350zJl> list) {
        InterfaceC887660Ys0 interfaceC887660Ys0;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (InterfaceC1891350zJl interfaceC1891350zJl : list) {
            Object objCopyData = null;
            if ((interfaceC1891350zJl instanceof InterfaceC887660Ys0) && (interfaceC887660Ys0 = (InterfaceC887660Ys0) interfaceC1891350zJl) != null && (!interfaceC887660Ys0.getEnableSelect())) {
                objCopyData = interfaceC887660Ys0.copyData(false, false, false, false, false, null);
            }
            if ((objCopyData instanceof InterfaceC1891350zJl) && objCopyData != null) {
                interfaceC1891350zJl = objCopyData;
            }
            arrayList.add(interfaceC1891350zJl);
        }
        this.LLILLJJLI = arrayList;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("set noticeArchiveItems: ");
        sbLIZ.append(Integer.valueOf(arrayList.size()));
        C2188811AlT.LIZIZ(sbLIZ);
        xQ2();
    }
}
