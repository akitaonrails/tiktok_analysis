package com.ss.android.ugc.aweme.feed.landscape.viewmodels;

import X.AbstractC1255880imo;
import X.AbstractC316870CbV;
import X.C1157130gDX;
import X.C1212340hea;
import X.C1218140hnw;
import X.C1279404zY;
import X.C2105908Mv;
import X.C2189821An6;
import X.C316650Cb9;
import X.C317290CcB;
import X.C627660Ojc;
import X.InterfaceC0148002o;
import X.InterfaceC1209780haS;
import X.InterfaceC1364105Vn;
import X.InterfaceC1891350zJl;
import X.InterfaceC726620Seq;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class LandscapeProfileViewModel extends BaseDetailShareVM<C1218140hnw, C1279404zY, Long> implements InterfaceC726620Seq {
    public boolean LLILZIL;
    public String LLILZLL;
    public String LLIZ;
    public AbstractC1255880imo<Aweme, FeedItemList> LLIZLLLIL;
    public C1212340hea LLJ;

    @Override // X.InterfaceC1603360rpG
    public final int getPageType(int i) {
        return 26000;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1218140hnw(0);
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM, X.C0PDP
    public final List<Aweme> getAwemeList() {
        C1212340hea c1212340hea = this.LLJ;
        if (!(c1212340hea instanceof C1212340hea) || c1212340hea == null) {
            return new ArrayList();
        }
        AbstractC1255880imo abstractC1255880imo = (AbstractC1255880imo) c1212340hea.LL;
        return c1212340hea.LJIJI(abstractC1255880imo != null ? abstractC1255880imo.getItems() : null);
    }

    @Override // X.InterfaceC726620Seq
    public final List<Aweme> p01() {
        C1212340hea c1212340hea = this.LLJ;
        if (!(c1212340hea instanceof C1212340hea) || c1212340hea == null) {
            return new ArrayList();
        }
        AbstractC1255880imo abstractC1255880imo = (AbstractC1255880imo) c1212340hea.LL;
        List<Aweme> listLJIJI = c1212340hea.LJIJI(abstractC1255880imo != null ? abstractC1255880imo.getItems() : null);
        for (Aweme aweme : (ArrayList) listLJIJI) {
            AwemeExtKt.appendMobParam(aweme, "landscape_screen_item_soure", Intrinsics.LJFF(aweme.getAid(), this.LLIZ) ? "enter_group" : "profile");
        }
        return listLJIJI;
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM, X.InterfaceC1603360rpG
    public final void unInit() {
        super.unInit();
        C1212340hea c1212340hea = this.LLJ;
        if (c1212340hea != null) {
            c1212340hea.LJIILJJIL();
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM, X.InterfaceC1603360rpG
    public final void bindView(InterfaceC1209780haS interfaceC1209780haS) {
        super.bindView(interfaceC1209780haS);
        C1212340hea c1212340hea = new C1212340hea();
        c1212340hea.LLILLJJLI = this.LLILLJJLI;
        c1212340hea.LJIIJ(this.LLIZLLLIL);
        this.LLJ = c1212340hea;
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<C1279404zY> c627660Ojc) {
        setState(new AwS598S0100000_19(c627660Ojc, (C627660Ojc<C1157130gDX>) 160));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<Long>> interfaceC1364105Vn) {
        C317290CcB c317290CcB = AbstractC316870CbV.LIZ;
        Exception exc = new Exception();
        c317290CcB.getClass();
        return new C316650Cb9(exc);
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final int vQ2(String str) {
        List<ITEM> listListGetAll = listGetAll();
        int i = -1;
        if (listListGetAll != 0) {
            Iterator it2 = listListGetAll.iterator();
            int i2 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (Intrinsics.LJFF(((C1279404zY) it2.next()).LL.getAid(), str)) {
                    i = i2;
                    if (i2 >= 0) {
                        listRemoveItemAt(i2);
                    }
                } else {
                    i2++;
                }
            }
        }
        return i;
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final Aweme xQ2(InterfaceC1891350zJl interfaceC1891350zJl) {
        return ((C1279404zY) interfaceC1891350zJl).LL;
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        ((Number) obj).longValue();
        C317290CcB c317290CcB = AbstractC316870CbV.LIZ;
        Exception exc = new Exception();
        c317290CcB.getClass();
        return new C316650Cb9(exc);
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM, X.InterfaceC1603360rpG
    public final void request(int i, C2189821An6 c2189821An6, int i2, boolean z) {
        boolean zLIZ = C2105908Mv.LIZ(c2189821An6.getSecUid());
        int i3 = LSPassThroughRecordSizeConfig.DEFAULT;
        if (zLIZ) {
            C1212340hea c1212340hea = this.LLJ;
            if (c1212340hea != null) {
                Object[] objArr = new Object[5];
                objArr[0] = Integer.valueOf(i);
                objArr[1] = Boolean.TRUE;
                objArr[2] = this.LLILZLL;
                objArr[3] = Integer.valueOf(c2189821An6.getVideoType());
                if (!this.LLILZIL) {
                    i3 = 2000;
                }
                objArr[4] = Integer.valueOf(i3);
                c1212340hea.LIZJ(objArr);
                return;
            }
            return;
        }
        C1212340hea c1212340hea2 = this.LLJ;
        if (c1212340hea2 == null) {
            return;
        }
        Object[] objArr2 = new Object[6];
        objArr2[0] = Integer.valueOf(i);
        objArr2[1] = Boolean.TRUE;
        objArr2[2] = this.LLILZLL;
        objArr2[3] = Integer.valueOf(c2189821An6.getVideoType());
        if (!this.LLILZIL) {
            i3 = 2000;
        }
        objArr2[4] = Integer.valueOf(i3);
        objArr2[5] = c2189821An6.getSecUid();
        c1212340hea2.LIZJ(objArr2);
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final Long yQ2(int i, C2189821An6 c2189821An6, int i2, boolean z) {
        return 0L;
    }
}
