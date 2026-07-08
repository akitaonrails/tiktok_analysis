package com.ss.android.ugc.profile.business.ur.school.findschoolfriends.schoolposts;

import X.AbstractC316870CbV;
import X.C01GW;
import X.C099M;
import X.C099Q;
import X.C099R;
import X.C1210880hcE;
import X.C13LP;
import X.C14EU;
import X.C1579330rCV;
import X.C1581060rFI;
import X.C1581170rFT;
import X.C1910890zpH;
import X.C1912107eJ;
import X.C2252611DEt;
import X.C452501pT;
import X.C484220Iyq;
import X.C627660Ojc;
import X.C737030Svd;
import X.EnumC1581430rFt;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import X.InterfaceC1891350zJl;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AwS138S1100000_24;
import kotlin.jvm.internal.AwS390S0200000_24;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.AwS75S0210000_24;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;

/* JADX INFO: loaded from: classes25.dex */
public final class SchoolPostsListViewModel extends AssemListViewModel<C1579330rCV, C1581170rFT, C1581060rFI> {
    public static final /* synthetic */ int LLJI = 0;
    public boolean LLILZLL;
    public final C01GW LL = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(427));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(442));
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(441));
    public boolean LLILZ = true;
    public final Set<String> LLILZIL = new LinkedHashSet();
    public int LLIZ = -1;
    public String LLIZLLLIL = EnumC1581430rFt.OTHER.getValue();
    public final C1912107eJ LLJ = new C1912107eJ();

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1579330rCV(0);
    }

    public final C1910890zpH getLogger() {
        return (C1910890zpH) this.LL.getValue();
    }

    public SchoolPostsListViewModel() {
        if (EventBus.LIZLLL().LJIIJ(this)) {
            return;
        }
        EventBus.LIZLLL().LJIJJ(this);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        if (EventBus.LIZLLL().LJIIJ(this)) {
            EventBus.LIZLLL().LJJI(this);
        }
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<C1581170rFT> c627660Ojc) {
        setState(new AwS603S0100000_24(c627660Ojc, (C627660Ojc<InterfaceC1891350zJl>) 411));
    }

    @C14EU
    public final void onDeleteAwemeEvent(C1210880hcE c1210880hcE) {
        withState(new AwS390S0200000_24(this, c1210880hcE, 58));
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onJsBroadCastEvent(C484220Iyq c484220Iyq) {
        String string;
        try {
            if (TextUtils.equals("videoReportSuccess", JSONObjectProtectorUtils.getString(c484220Iyq.LIZ, "eventName")) && (string = JSONObjectProtectorUtils.getString(JSONObjectProtectorUtils.getJSONObject(c484220Iyq.LIZ, "data"), "object_id")) != null && string.length() != 0) {
                this.LLIZLLLIL = EnumC1581430rFt.OTHER.getValue();
                if (string != null && string.length() != 0) {
                    withState(new AwS138S1100000_24(string, this, 5));
                }
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<C1581060rFI>> interfaceC1364105Vn) {
        getLogger().LIZ("SchoolPostsListViewModel", "onRefresh");
        this.LLILZIL.clear();
        this.LLIZ = -1;
        this.LLILZLL = false;
        return vQ2(true, interfaceC1364105Vn);
    }

    @C14EU
    public final void onVideoEvent(C737030Svd c737030Svd) {
        String str;
        List<ITEM> listListGetAll;
        String aid;
        C1581170rFT c1581170rFT;
        Pair pair;
        long diggCount;
        Aweme awemeLLILZ;
        Aweme aweme;
        if (c737030Svd.LIZ != 13) {
            return;
        }
        Object obj = c737030Svd.LIZIZ;
        if (!(obj instanceof String) || (str = (String) obj) == null || (listListGetAll = listGetAll()) == 0) {
            return;
        }
        Iterator it2 = listListGetAll.iterator();
        boolean z = false;
        int i = 0;
        while (true) {
            int i2 = -1;
            if (it2.hasNext()) {
                C1581170rFT c1581170rFT2 = (C1581170rFT) it2.next();
                if ((c1581170rFT2 instanceof C1581170rFT) && c1581170rFT2 != null && (aweme = c1581170rFT2.LL) != null) {
                    aid = aweme.getAid();
                } else {
                    aid = null;
                }
                if (Intrinsics.LJFF(aid, str)) {
                    if (i >= 0) {
                        Object objLJJJLZIJ = C13LP.LJJJLZIJ(i, listListGetAll);
                        if ((objLJJJLZIJ instanceof C1581170rFT) && (c1581170rFT = (C1581170rFT) objLJJJLZIJ) != null) {
                            Bundle bundle = c737030Svd.LIZJ;
                            if (bundle != null) {
                                i2 = bundle.getInt("user_digged", -1);
                            }
                            IAwemeService iAwemeService = (IAwemeService) PluggableExtentionKt.pluggableSpi$default(IAwemeService.class, false, false, false, 14, null);
                            if (iAwemeService != null && (awemeLLILZ = iAwemeService.LLILZ(str)) != null) {
                                pair = new Pair(awemeLLILZ, Boolean.valueOf(awemeLLILZ.isLike()));
                            } else if (i2 != 0 && i2 != 1) {
                                Aweme aweme2 = c1581170rFT.LL;
                                pair = new Pair(aweme2, Boolean.valueOf(aweme2.isLike()));
                            } else {
                                c1581170rFT.LL.setUserDigg(i2);
                                AwemeStatistics statistics = c1581170rFT.LL.getStatistics();
                                if (statistics != null) {
                                    if (i2 != 0) {
                                        diggCount = 1 + statistics.getDiggCount();
                                    } else {
                                        long diggCount2 = statistics.getDiggCount() - 1;
                                        diggCount = 0;
                                        if (diggCount2 >= 0) {
                                            diggCount = diggCount2;
                                        }
                                    }
                                    statistics.setDiggCount(diggCount);
                                }
                                Aweme aweme3 = c1581170rFT.LL;
                                if (i2 == 1) {
                                    z = true;
                                }
                                pair = new Pair(aweme3, Boolean.valueOf(z));
                            }
                            listSetItemAt(i, new C1581170rFT((Aweme) pair.getFirst(), ((Boolean) pair.getSecond()).booleanValue(), c1581170rFT.LLILLL, c1581170rFT.LLILZ, c1581170rFT.LLILZIL));
                            return;
                        }
                        return;
                    }
                    return;
                }
                i++;
            } else {
                return;
            }
        }
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(C1581060rFI c1581060rFI, InterfaceC1364105Vn<? super AbstractC316870CbV<C1581060rFI>> interfaceC1364105Vn) {
        getLogger().LIZ("SchoolPostsListViewModel", "onLoadMore");
        return vQ2(false, interfaceC1364105Vn);
    }

    public final Object vQ2(boolean z, InterfaceC1364105Vn interfaceC1364105Vn) {
        C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        withState(new AwS75S0210000_24(this, z, c2252611DEt, 3));
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLJIJ;
    }
}
