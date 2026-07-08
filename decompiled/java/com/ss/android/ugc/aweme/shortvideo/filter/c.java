package com.ss.android.ugc.aweme.shortvideo.filter;

import X.C09R3;
import X.C0CHQ;
import X.C0EHK;
import X.C13LE;
import X.C1453230nv7;
import X.C1622090sJT;
import X.C1641640sp0;
import X.C1644970suN;
import X.C1645020suS;
import X.C1664770tQJ;
import X.C1DRG;
import X.C201955140j;
import X.C201967140v;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C525800Kji;
import X.InterfaceC1647420syK;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import Y.AObserverS186S0200000_25;
import androidx.lifecycle.LiveData;
import com.ss.android.ugc.aweme.creative.model.CreativeInitialModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.InitialFilterConfig;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.effectmanager.effect.model.HorizontalEffectsModel;
import com.ss.android.ugc.gamora.recorder.sticker.l0;
import java.util.List;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public final class c extends k {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIIL;
    public static final int LLLIILIL;
    public final InterfaceC1731706qJ LLLII;
    public final InterfaceC1731706qJ LLLIIII;
    public List<? extends FilterBean> LLLIIIIL;
    public boolean LLLIIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(c.class, "recordAdapterApi", "getRecordAdapterApi()Lcom/ss/android/ugc/aweme/shortvideo/adapter/RecordAdapterApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(c.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        c09r3.getClass();
        LLLIIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
        LLLIILIL = 8;
    }

    private final InterfaceC1647420syK getRecordAdapterApi() {
        return (InterfaceC1647420syK) this.LLLII.getValue(this, LLLIIL[0]);
    }

    private final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LLLIIII.getValue(this, LLLIIL[1]);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.filter.k, X.C1644970suN, X.AbstractC2255721DQs
    public void onCreate() {
        InterfaceC1647420syK recordAdapterApi;
        if (!((Boolean) C525800Kji.LIZ.getValue()).booleanValue()) {
            yL2(true, "build_in");
        }
        super.onCreate();
        if (!C1622090sJT.LIZ(R5()) || (recordAdapterApi = getRecordAdapterApi()) == null) {
            return;
        }
        recordAdapterApi.Tb2(this);
    }

    @Override // X.C1644970suN, X.InterfaceC1644770su3
    public void bU() {
        CreativeModel creativeModel;
        CreativeInitialModel creativeInitialModel;
        InitialFilterConfig initialFilterConfig;
        ShortVideoContext shortVideoContext = getShortVideoContext();
        if (shortVideoContext == null || (creativeModel = shortVideoContext.creativeModel) == null || (creativeInitialModel = creativeModel.initialModel) == null || (initialFilterConfig = creativeInitialModel.filterConfig) == null) {
            return;
        }
        C201967140v c201967140v = C201967140v.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("applyInitialFilterConfig initialFilterConfig filter_id=");
        sbLIZ.append(initialFilterConfig.getFilterId());
        C201955140j.LIZJ(c201967140v, C2188811AlT.LIZIZ(sbLIZ));
        yL2(false, "build_in");
        List<? extends FilterBean> list = (List) C0CHQ.LIZ().LJJIL().LIZIZ().LJJI().LJFF().getValue();
        this.LLLIIIIL = list;
        if (list == null || list.isEmpty()) {
            C0EHK.LJIIJ(C0CHQ.LIZ().LJJIL().LIZIZ().LJJI().LJFF(), this, new AObserverS186S0200000_25((Object) this, (LiveData<C1641640sp0<HorizontalEffectsModel>>) initialFilterConfig, (l0) 1));
        }
        L6(initialFilterConfig);
    }

    public final void L6(InitialFilterConfig initialFilterConfig) {
        List<? extends FilterBean> list = this.LLLIIIIL;
        if (list != null && !list.isEmpty()) {
            List<? extends FilterBean> list2 = this.LLLIIIIL;
            FilterBean filterBean = null;
            if (list2 != null) {
                for (FilterBean filterBean2 : list2) {
                    FilterBean filterBean3 = filterBean2;
                    if (Intrinsics.LJFF(filterBean3.getResId(), initialFilterConfig.getResId()) || Intrinsics.LJFF(filterBean3.getId(), initialFilterConfig.getFilterId())) {
                        filterBean = filterBean2;
                        break;
                    }
                }
                FilterBean filterBean4 = filterBean;
                if (filterBean4 != null) {
                    K6(initialFilterConfig, filterBean4);
                    return;
                }
            }
            C201955140j.LIZJ(C201967140v.LIZIZ, "applyInitialFilterConfig filter not found");
            return;
        }
        C201955140j.LIZJ(C201967140v.LIZIZ, "applyInitialFilterConfig checkAndApplyFilter availableFilters: isEmpty}");
    }

    private final void K6(InitialFilterConfig initialFilterConfig, FilterBean filterBean) {
        if (this.LLLIIIL) {
            return;
        }
        if (!C1453230nv7.LJIIIZ(filterBean, C0CHQ.LIZ().LJJIL().LIZIZ())) {
            C201955140j.LIZJ(C201967140v.LIZIZ, "applyInitialFilterConfig applied applied default filter");
            JY1(true);
        } else {
            C201967140v c201967140v = C201967140v.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("applyInitialFilterConfig applied anchorFilterID=");
            sbLIZ.append(initialFilterConfig.getFilterId());
            sbLIZ.append(", filterID=");
            sbLIZ.append(filterBean.getId());
            C201955140j.LIZJ(c201967140v, C2188811AlT.LIZIZ(sbLIZ));
            this.LLJJIJI = null;
            C1644970suN.n5(this, filterBean, "anchor_auto_apply", true, false, false, false, false, false, 240, null);
        }
        this.LLLIIIL = true;
    }

    public c(C1DRG c1drg, String str, String str2, boolean z, C1645020suS c1645020suS) {
        super(c1drg, str, str2, z, c1645020suS, AFwS266S0000000_25.get$arr$(142), AFwS214S0000000_25.get$arr$(137), null);
        this.LLLII = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1647420syK.class, null);
        this.LLLIIII = C1664770tQJ.LIZIZ(getDiContainer(), ShortVideoContext.class, null);
    }
}
