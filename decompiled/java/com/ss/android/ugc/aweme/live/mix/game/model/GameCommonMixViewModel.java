package com.ss.android.ugc.aweme.live.mix.game.model;

import X.AbstractC316870CbV;
import X.AbstractC329610Cw3;
import X.C0KBN;
import X.C15438062q;
import X.C207000qy;
import X.C2095008Iq;
import X.C2188811AlT;
import X.C2189821An6;
import X.C2217401BqU;
import X.C325980CqC;
import X.C331160CyY;
import X.C627660Ojc;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import X.InterfaceC1891350zJl;
import X.InterfaceC331170CyZ;
import X.InterfaceC636340Oxc;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS583S0100000_4;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.game.FeedRequestParams;
import webcast.api.game.InsertAwemeStruct;

/* JADX INFO: loaded from: classes5.dex */
public final class GameCommonMixViewModel extends BaseDetailShareVM<C325980CqC, C207000qy, C331160CyY> implements InterfaceC331170CyZ {
    public C331160CyY LLILZLL;
    public boolean LLIZ;
    public C2189821An6 LLJ;
    public final List<Aweme> LLILZIL = new ArrayList();
    public final String LLIZLLLIL = "";

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM, X.InterfaceC1603360rpG
    public final boolean cannotLoadLatest() {
        return true;
    }

    @Override // X.InterfaceC1603360rpG
    public final int getPageType(int i) {
        return 72;
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM, X.InterfaceC1603360rpG
    public final boolean cannotLoadMore() {
        return !this.LLIZ;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C325980CqC(0);
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM, X.C0PDP
    public final List<Aweme> getAwemeList() {
        return new ArrayList(this.LLILZIL);
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM, X.InterfaceC1603360rpG
    public final void unInit() {
        ((ArrayList) this.LLILZIL).clear();
        setState(new AwS583S0100000_4(this, 80));
        super.unInit();
    }

    public final List<C207000qy> CQ2(List<? extends Aweme> list) {
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Aweme aweme : list) {
                if (aweme.getAid() != null) {
                    arrayList.add(aweme);
                }
            }
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new C207000qy((Aweme) it2.next(), 0L, this.LLIZLLLIL));
            }
            return arrayList2;
        }
        return new ArrayList();
    }

    public final FeedRequestParams DQ2(boolean z) {
        long jLongValue;
        long jLongValue2;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String strLIZIZ;
        Map<String, String> extra;
        Map<String, String> extra2;
        String str6;
        Map<String, String> extra3;
        Map<String, String> extra4;
        Map<String, String> extra5;
        Map<String, String> extra6;
        Map<String, String> extra7;
        String str7;
        Long lLJIILIIL;
        Map<String, String> extra8;
        String str8;
        Long lLJIILIIL2;
        Map<String, String> extra9;
        String str9;
        Long lLJIILIIL3;
        FeedRequestParams feedRequestParams = new FeedRequestParams();
        C2189821An6 c2189821An6 = this.LLJ;
        long jLongValue3 = 0;
        if (c2189821An6 != null && (extra9 = c2189821An6.getExtra()) != null && (str9 = extra9.get("draw_room_id")) != null && (lLJIILIIL3 = C2095008Iq.LJIILIIL(str9)) != null) {
            jLongValue = lLJIILIIL3.longValue();
        } else {
            jLongValue = 0;
        }
        feedRequestParams.drawRoomId = jLongValue;
        C2189821An6 c2189821An62 = this.LLJ;
        if (c2189821An62 != null && (extra8 = c2189821An62.getExtra()) != null && (str8 = extra8.get("draw_video_id")) != null && (lLJIILIIL2 = C2095008Iq.LJIILIIL(str8)) != null) {
            jLongValue2 = lLJIILIIL2.longValue();
        } else {
            jLongValue2 = 0;
        }
        feedRequestParams.drawVideoId = jLongValue2;
        C2189821An6 c2189821An63 = this.LLJ;
        if (c2189821An63 != null && (extra7 = c2189821An63.getExtra()) != null && (str7 = extra7.get("draw_author_id")) != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str7)) != null) {
            jLongValue3 = lLJIILIIL.longValue();
        }
        feedRequestParams.drawAuthorId = jLongValue3;
        C2189821An6 c2189821An64 = this.LLJ;
        String str10 = "";
        if (c2189821An64 == null || (extra6 = c2189821An64.getExtra()) == null || (str = extra6.get("related_live_tag")) == null) {
            str = "";
        }
        feedRequestParams.relatedLiveTag = str;
        C2189821An6 c2189821An65 = this.LLJ;
        if (c2189821An65 == null || (extra5 = c2189821An65.getExtra()) == null || (str2 = extra5.get("enter_from_merge")) == null) {
            str2 = "";
        }
        C2189821An6 c2189821An66 = this.LLJ;
        if (c2189821An66 == null || (extra4 = c2189821An66.getExtra()) == null || (str3 = extra4.get("enter_method")) == null) {
            str3 = "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str2);
        sbLIZ.append('-');
        sbLIZ.append(str3);
        feedRequestParams.enterSource = C2188811AlT.LIZIZ(sbLIZ);
        C2189821An6 c2189821An67 = this.LLJ;
        if (c2189821An67 == null || (extra3 = c2189821An67.getExtra()) == null || (str4 = extra3.get("insert_aweme_ids")) == null) {
            str4 = "";
        }
        C2189821An6 c2189821An68 = this.LLJ;
        if (c2189821An68 != null && (extra2 = c2189821An68.getExtra()) != null && (str6 = extra2.get("insert_aweme_type")) != null) {
            str10 = str6;
        }
        if (z && str4.length() > 0 && str10.length() > 0) {
            InsertAwemeStruct insertAwemeStruct = new InsertAwemeStruct();
            insertAwemeStruct.awemeIdsStr = str4;
            insertAwemeStruct.awemeTypesStr = str10;
            feedRequestParams.insertAwemes = insertAwemeStruct;
        }
        C2189821An6 c2189821An69 = this.LLJ;
        if (c2189821An69 == null || (extra = c2189821An69.getExtra()) == null || (str5 = extra.get("req_from_prefix")) == null) {
            str5 = "related_live";
        }
        if (z) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str5);
            sbLIZ2.append("_refresh");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        } else {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(str5);
            sbLIZ3.append("_loadmore");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
        }
        feedRequestParams.reqFrom = strLIZIZ;
        return feedRequestParams;
    }

    public final void EQ2(List<? extends Aweme> list) {
        ((ArrayList) this.LLILZIL).clear();
        this.LLILZLL = null;
        this.LLIZ = true;
        if (list != null && !list.isEmpty()) {
            ((ArrayList) this.LLILZIL).addAll(list);
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM, X.InterfaceC1603360rpG
    public final boolean init(Fragment fragment) {
        Context context = fragment.getContext();
        if (context == null) {
            super.init(fragment);
            return true;
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = new ViewOnAttachStateChangeListenerC20604515jv(context, null);
        setListState(viewOnAttachStateChangeListenerC20604515jv.getState());
        viewOnAttachStateChangeListenerC20604515jv.LJIIL((AbstractC329610Cw3) new C2217401BqU(this) { // from class: X.0Cqu
            @Override // X.C2217401BqU, X.AbstractC2217341BqO, X.InterfaceC2217311BqL
            public final Object get() {
                return ((AssemListViewModel) this.receiver).getConfig();
            }
        }.get());
        super.init(fragment);
        return true;
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<C207000qy> c627660Ojc) {
        setState(new AwS583S0100000_4(c627660Ojc, (C627660Ojc<C0KBN>) 79));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<C331160CyY>> interfaceC1364105Vn) {
        return BQ2(true, interfaceC1364105Vn);
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final int vQ2(String str) {
        String aid;
        List<ITEM> listListGetAll = listGetAll();
        int i = -1;
        if (listListGetAll != 0) {
            Iterator it2 = listListGetAll.iterator();
            int i2 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Aweme aweme = ((C207000qy) it2.next()).LL;
                if (aweme != null) {
                    aid = aweme.getAid();
                } else {
                    aid = null;
                }
                if (Intrinsics.LJFF(aid, str)) {
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
        return ((C207000qy) interfaceC1891350zJl).LL;
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final List zQ2(InterfaceC636340Oxc interfaceC636340Oxc) {
        return CQ2(this.LLILZIL);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object BQ2(boolean r10, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<X.C331160CyY>> r11) {
        /*
            Method dump skipped, instruction units count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.mix.game.model.GameCommonMixViewModel.BQ2(boolean, X.05Vn):java.lang.Object");
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        return BQ2(false, interfaceC1364105Vn);
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM, X.InterfaceC1603360rpG
    public final void request(int i, C2189821An6 c2189821An6, int i2, boolean z) {
        this.LLJ = c2189821An6;
        super.request(i, c2189821An6, i2, z);
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final C331160CyY yQ2(int i, C2189821An6 c2189821An6, int i2, boolean z) {
        C331160CyY c331160CyY = this.LLILZLL;
        if (c331160CyY == null) {
            return new C331160CyY();
        }
        return c331160CyY;
    }
}
