package com.ss.android.ugc.nearby.feedcard.vm;

import X.AbstractC316870CbV;
import X.AbstractC848400XPy;
import X.AnonymousClass0956;
import X.C07WA;
import X.C0BXK;
import X.C0XQ7;
import X.C1165730gRP;
import X.C1204080hRG;
import X.C1204440hRq;
import X.C1204450hRr;
import X.C1204470hRt;
import X.C1204510hRx;
import X.C1204570hS3;
import X.C1204810hSR;
import X.C1204850hSV;
import X.C1210880hcE;
import X.C14EU;
import X.C1DEV;
import X.C2188811AlT;
import X.C2189821An6;
import X.C2191201ApK;
import X.C316640Cb8;
import X.C316650Cb9;
import X.C317290CcB;
import X.C484220Iyq;
import X.C622680Oba;
import X.C627660Ojc;
import X.C737030Svd;
import X.InterfaceC0148002o;
import X.InterfaceC1204490hRv;
import X.InterfaceC1364105Vn;
import X.InterfaceC1891350zJl;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.nearby.settings.NearbyClientSettings;
import com.ss.android.ugc.nearby.settings.NearbyDoubleColumnCacheOptExperiment;
import com.ss.android.ugc.nearby.settings.NearbyLocationChangeCardExpData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS132S1100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes19.dex */
public final class NearbyFeedSharedViewModel extends BaseDetailShareVM<C1204510hRx, InterfaceC1204490hRv, C07WA> {
    public volatile long LLILZIL;
    public C1204080hRG LLIZ;
    public C1204450hRr LLIZLLLIL;
    public C1204440hRq LLJ;
    public volatile AnonymousClass0956 LLJI;
    public volatile String LLJIJIL;
    public volatile Function1<? super C1204470hRt, Unit> LLJILJIL;
    public volatile boolean LLJILJILJ;
    public boolean LLJJ;
    public boolean LLJJI;
    public boolean LLJJIII;
    public final int LLJJIJI;
    public int LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public final C1DEV LLILZLL = C2191201ApK.LIZ();
    public final boolean LLJILLL = ComplianceServiceProvider.LJI().LJIIJ(false);

    @Override // X.InterfaceC1603360rpG
    public final int getPageType(int i) {
        return 32;
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM, X.InterfaceC1603360rpG
    public final boolean init(Fragment fragment) {
        return true;
    }

    public final void FQ2() {
        withState(new AwS597S0100000_18(this, 606));
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1204510hRx(0);
    }

    public NearbyFeedSharedViewModel() {
        Integer num = ((NearbyLocationChangeCardExpData) C1204850hSV.LIZIZ.getValue()).cardIndex;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("index = ");
        sbLIZ.append(num);
        C2188811AlT.LIZIZ(sbLIZ);
        this.LLJJIJI = (num != null ? num.intValue() : 4) - 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int CQ2() {
        List<InterfaceC1204490hRv> list = ((C1204510hRx) getState()).LL.LLILZ;
        if (list == null) {
            return 0;
        }
        ArrayList arrayList = new ArrayList();
        for (InterfaceC1204490hRv interfaceC1204490hRv : list) {
            if (interfaceC1204490hRv instanceof C1204470hRt) {
                arrayList.add(interfaceC1204490hRv);
            }
        }
        return arrayList.size();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C622680Oba.LIZLLL(this);
        this.LLIZLLLIL = null;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        C622680Oba.LIZJ(this);
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM, X.InterfaceC1603360rpG
    public final void unInit() {
        super.unInit();
    }

    public final boolean BQ2(Integer num) {
        Long l;
        long jLongValue;
        boolean z;
        C1204080hRG c1204080hRG;
        C1204080hRG c1204080hRG2;
        NearbyClientSettings.LocationFeedbackCardInterval locationFeedbackCardInterval;
        if (num == null || !C1204850hSV.LIZ() || this.LLJJIII) {
            return false;
        }
        C1204570hS3 c1204570hS3 = C1204570hS3.LIZIZ;
        if (c1204570hS3.LIZIZ() || num.intValue() > 0) {
            return false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LocationChangeCard get() enterNearbyTimeLastTime = ");
        sbLIZ.append(C1204570hS3.LIZJ);
        C2188811AlT.LIZIZ(sbLIZ);
        long j = C1204570hS3.LIZJ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("LocationChangeCard lastEnterNearbyTime = ");
        sbLIZ2.append(j);
        C2188811AlT.LIZIZ(sbLIZ2);
        if (j != 0) {
            Map<String, NearbyClientSettings.LocationFeedbackCardInterval> map = NearbyClientSettings.LIZIZ().insertCardTypeIntervalMap;
            if (map != null && (locationFeedbackCardInterval = map.get("location_change_card_type")) != null) {
                l = locationFeedbackCardInterval.enterNearbyIntervalTime;
            } else {
                l = null;
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("getNoInterestAuthorizeShowFrequency time = ");
            sbLIZ3.append(l);
            C2188811AlT.LIZIZ(sbLIZ3);
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 2592000000L;
            }
            long jCurrentTimeMillis = System.currentTimeMillis() - j;
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("LocationChangeCard timeDiff = ");
            sbLIZ4.append(jCurrentTimeMillis);
            sbLIZ4.append(",return = ");
            if (jCurrentTimeMillis <= jLongValue) {
                z = true;
            } else {
                z = false;
            }
            sbLIZ4.append(z);
            C2188811AlT.LIZIZ(sbLIZ4);
            if (jCurrentTimeMillis <= jLongValue) {
                String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("ttkls_nearby_location_change_card_popup");
                sbLIZ5.append("_isinnearby_");
                sbLIZ5.append(curUserId);
                boolean z2 = c1204570hS3.LIZ.getBoolean(C2188811AlT.LIZIZ(sbLIZ5), false);
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append("getIsInNearbyRegionLastTime = ");
                sbLIZ6.append(z2);
                C2188811AlT.LIZIZ(sbLIZ6);
                if (!z2 || num.intValue() != 0) {
                    return false;
                }
                C1204080hRG c1204080hRG3 = this.LLIZ;
                if (c1204080hRG3 != null && !c1204080hRG3.LIZJ) {
                    return true;
                }
                if (!NearbyDoubleColumnCacheOptExperiment.LIZ() || (c1204080hRG = this.LLIZ) == null || !Intrinsics.LJFF(c1204080hRG.LJ, Boolean.FALSE) || (c1204080hRG2 = this.LLIZ) == null || c1204080hRG2.LIZIZ()) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final void DQ2(List<InterfaceC1891350zJl> list) {
        C1204810hSR c1204810hSR = new C1204810hSR(System.currentTimeMillis());
        int i = this.LLJJIJI - this.LLJJIJIIJIL;
        ListProtector.add(list, i, c1204810hSR);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LocationChangeCard toInsertPosition = ");
        sbLIZ.append(i);
        sbLIZ.append(",insert card in loadmore");
        C2188811AlT.LIZIZ(sbLIZ);
        this.LLJJIII = true;
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<InterfaceC1204490hRv> c627660Ojc) {
        setState(new AwS597S0100000_18(c627660Ojc, (C627660Ojc<C1165730gRP>) 605));
    }

    @C14EU
    public final void onDeleteAwemeEvent(C1210880hcE c1210880hcE) {
        if (C0BXK.LIZ()) {
            vQ2(c1210880hcE.LIZ.getAid());
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onJsBroadCastEvent(C484220Iyq c484220Iyq) {
        String string;
        try {
            if (TextUtils.equals("videoReportSuccess", JSONObjectProtectorUtils.getString(c484220Iyq.LIZ, "eventName")) && (string = JSONObjectProtectorUtils.getString(JSONObjectProtectorUtils.getJSONObject(c484220Iyq.LIZ, "data"), "object_id")) != null && string.length() != 0) {
                vQ2(string);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("something was wrong with onJsBroadCastEvent, e=");
            sbLIZ.append(e.getMessage());
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<C07WA>> interfaceC1364105Vn) {
        List<InterfaceC1204490hRv> list;
        this.LLILZIL = 0L;
        C1204080hRG c1204080hRG = this.LLIZ;
        if (c1204080hRG != null && (list = c1204080hRG.LIZ) != null) {
            this.LLILZIL++;
            C1204080hRG c1204080hRG2 = this.LLIZ;
            if (c1204080hRG2 != null && Intrinsics.LJFF(c1204080hRG2.LIZIZ, true)) {
                return C317290CcB.LJ(AbstractC316870CbV.LIZ, null, new C07WA(this.LLILZIL), list, 1);
            }
            AbstractC316870CbV.LIZ.getClass();
            return new C316640Cb8(list);
        }
        C317290CcB c317290CcB = AbstractC316870CbV.LIZ;
        Exception exc = new Exception("first page data is null");
        c317290CcB.getClass();
        return new C316650Cb9(exc);
    }

    @C14EU
    public final void onVideoEvent(C737030Svd c737030Svd) {
        String str;
        String str2;
        int i = c737030Svd.LIZ;
        if (i != 2) {
            if (i == 13) {
                Object obj = c737030Svd.LIZIZ;
                if ((obj instanceof String) && (str2 = (String) obj) != null && str2.length() != 0) {
                    withState(new AwS132S1100000_18(str2, this, 13));
                    return;
                }
                return;
            }
            return;
        }
        Object obj2 = c737030Svd.LIZIZ;
        if ((obj2 instanceof String) && (str = (String) obj2) != null && str.length() != 0) {
            vQ2(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final int vQ2(String str) {
        int i;
        String aid;
        String aid2;
        List<ITEM> listListGetAll = listGetAll();
        int i2 = -1;
        if (listListGetAll != 0) {
            Iterator it2 = listListGetAll.iterator();
            i = 0;
            while (true) {
                if (it2.hasNext()) {
                    InterfaceC1204490hRv interfaceC1204490hRv = (InterfaceC1204490hRv) it2.next();
                    if (interfaceC1204490hRv instanceof C1204470hRt) {
                        Aweme aweme = ((C1204470hRt) interfaceC1204490hRv).LL;
                        if (aweme != null) {
                            aid2 = aweme.getAid();
                        } else {
                            aid2 = null;
                        }
                        if (Intrinsics.LJFF(aid2, str)) {
                            break;
                        }
                    }
                    i++;
                } else {
                    i = -1;
                    break;
                }
            }
        } else {
            i = 0;
        }
        List<ITEM> listListGetAll2 = listGetAll();
        if (listListGetAll2 != 0) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : listListGetAll2) {
                if (obj instanceof C1204470hRt) {
                    arrayList.add(obj);
                }
            }
            Iterator it3 = arrayList.iterator();
            int i3 = 0;
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                InterfaceC1204490hRv interfaceC1204490hRv2 = (InterfaceC1204490hRv) it3.next();
                if (interfaceC1204490hRv2 instanceof C1204470hRt) {
                    Aweme aweme2 = ((C1204470hRt) interfaceC1204490hRv2).LL;
                    if (aweme2 != null) {
                        aid = aweme2.getAid();
                    } else {
                        aid = null;
                    }
                    if (Intrinsics.LJFF(aid, str)) {
                        i2 = i3;
                        break;
                    }
                }
                i3++;
            }
        }
        if (i >= 0) {
            listRemoveItemAt(i);
        }
        return i2;
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final Aweme xQ2(InterfaceC1891350zJl interfaceC1891350zJl) {
        InterfaceC1204490hRv interfaceC1204490hRv = (InterfaceC1204490hRv) interfaceC1891350zJl;
        if (interfaceC1204490hRv instanceof C1204470hRt) {
            return ((C1204470hRt) interfaceC1204490hRv).LL;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ef A[Catch: all -> 0x022f, TryCatch #1 {all -> 0x022f, blocks: (B:44:0x00e8, B:45:0x00eb, B:47:0x00ef, B:49:0x00fd, B:53:0x013b, B:55:0x014e, B:59:0x0157, B:61:0x015b, B:62:0x015e, B:64:0x0167, B:65:0x016e, B:67:0x019d, B:69:0x01a3, B:71:0x01ac, B:72:0x01b8, B:74:0x01ce, B:75:0x01e3, B:78:0x01f1, B:81:0x0215, B:85:0x022b), top: B:92:0x001e }] */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /* JADX INFO: renamed from: EQ2, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onLoadMore(X.C07WA r12, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<X.C07WA>> r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 565
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.nearby.feedcard.vm.NearbyFeedSharedViewModel.onLoadMore(X.07WA, X.05Vn):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final C07WA yQ2(int i, C2189821An6 c2189821An6, int i2, boolean z) {
        return new C07WA(this.LLILZIL);
    }
}
