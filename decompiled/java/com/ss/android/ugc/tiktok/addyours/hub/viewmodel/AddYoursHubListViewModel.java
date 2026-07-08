package com.ss.android.ugc.tiktok.addyours.hub.viewmodel;

import X.AbstractC316870CbV;
import X.AbstractC848400XPy;
import X.C09R9;
import X.C0O2K;
import X.C0XQ7;
import X.C13LE;
import X.C2095008Iq;
import X.C316640Cb8;
import X.C316650Cb9;
import X.C317290CcB;
import X.C615470OCb;
import X.C615480OCc;
import X.C615490OCd;
import X.C615510OCf;
import X.C623470Ocr;
import X.C627660Ojc;
import X.C730000SkI;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import X.InterfaceC615520OCg;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.aweme.addyours.model.AddYoursTopic;
import com.ss.android.ugc.tiktok.addyours.hub.model.HubFeedResponse;
import com.ss.android.ugc.tiktok.addyours.model.AddYoursPagination;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS588S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class AddYoursHubListViewModel extends AssemListViewModel<C615470OCb, C0O2K, C615510OCf> {
    public String LL;
    public int LLILLJJLI = 2;
    public final C09R9 LLILLL = new C09R9(this, C13LE.LIZ(C615490OCd.class));

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C615470OCb(0);
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<C0O2K> c627660Ojc) {
        setState(new AwS588S0100000_9(c627660Ojc, (C627660Ojc<C623470Ocr>) 423));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<C615510OCf>> interfaceC1364105Vn) {
        return vQ2(new C615510OCf(0));
    }

    public final AbstractC316870CbV<C615510OCf> vQ2(C615510OCf c615510OCf) {
        Long lLJIILIIL;
        boolean zBooleanValue;
        long jLongValue;
        long jLongValue2;
        int iIntValue;
        String str = this.LL;
        if (str != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str)) != null) {
            long jLongValue3 = lLJIILIIL.longValue();
            System.currentTimeMillis();
            if (this.LLILLJJLI == 1) {
                C730000SkI.LIZIZ.LIZJ(1, 4);
            }
            HubFeedResponse hubFeedResponseLJL = ((InterfaceC615520OCg) this.LLILLL.getValue().getOperator()).LJL(this.LLILLJJLI, c615510OCf.LIZIZ, 30, jLongValue3, c615510OCf.LIZ);
            if (hubFeedResponseLJL == null) {
                return C317290CcB.LIZIZ(AbstractC316870CbV.LIZ);
            }
            if (this.LLILLJJLI == 1) {
                C730000SkI.LIZIZ.LIZJ(1, 5);
            }
            boolean zLIZJ = ((AbstractC848400XPy) C0XQ7.LJFF()).LIZJ(this.LL);
            Boolean bool = hubFeedResponseLJL.hasMore;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = false;
            }
            AddYoursPagination addYoursPagination = hubFeedResponseLJL.pagination;
            long jLongValue4 = 0;
            if (addYoursPagination == null) {
                addYoursPagination = new AddYoursPagination(0L, 1);
            }
            setState(new AwS588S0100000_9(hubFeedResponseLJL.viewedUser, 603));
            Long l = hubFeedResponseLJL.sharedCount;
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            Long l2 = hubFeedResponseLJL.unFinishedCount;
            if (l2 != null) {
                jLongValue2 = l2.longValue();
            } else {
                jLongValue2 = 0;
            }
            setState(new C615480OCc(jLongValue, jLongValue2));
            ArrayList arrayList = new ArrayList();
            List<AddYoursTopic> list = hubFeedResponseLJL.topicList;
            if (list != null) {
                for (AddYoursTopic addYoursTopic : list) {
                    if (addYoursTopic != null) {
                        arrayList.add(new C0O2K(this.LLILLJJLI, addYoursTopic, zLIZJ));
                    }
                }
            }
            if (zBooleanValue) {
                C317290CcB c317290CcB = AbstractC316870CbV.LIZ;
                Long l3 = addYoursPagination.cursor;
                if (l3 != null) {
                    jLongValue4 = l3.longValue();
                }
                Integer num = addYoursPagination.loadType;
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 1;
                }
                return C317290CcB.LJ(c317290CcB, null, new C615510OCf(jLongValue4, iIntValue), arrayList, 1);
            }
            AbstractC316870CbV.LIZ.getClass();
            return new C316640Cb8(arrayList);
        }
        C317290CcB c317290CcB2 = AbstractC316870CbV.LIZ;
        Exception exc = new Exception("uid is null");
        c317290CcB2.getClass();
        return new C316650Cb9(exc);
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(C615510OCf c615510OCf, InterfaceC1364105Vn<? super AbstractC316870CbV<C615510OCf>> interfaceC1364105Vn) {
        return vQ2(c615510OCf);
    }
}
