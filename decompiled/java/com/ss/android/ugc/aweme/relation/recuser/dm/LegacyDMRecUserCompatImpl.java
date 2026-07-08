package com.ss.android.ugc.aweme.relation.recuser.dm;

import X.AbstractC1261460ivo;
import X.C0C64;
import X.C1075800e6M;
import X.C1210800hc6;
import X.C1210810hc7;
import X.C1261340ivc;
import X.C1261350ivd;
import X.C1261450ivn;
import X.C1261480ivq;
import X.C1261500ivs;
import X.C1261510ivt;
import X.C1387310mCn;
import X.C2188811AlT;
import X.InterfaceC1261750iwH;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Transformations;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.arch.widgets.base.ChangeLiveData;
import kotlin.jvm.internal.AFwS252S0000000_16;

/* JADX INFO: loaded from: classes20.dex */
public final class LegacyDMRecUserCompatImpl implements InterfaceC1261750iwH, LifecycleEventObserver {
    public final C1261500ivs LL;
    public final ChangeLiveData<C1075800e6M> LLILLJJLI;

    @Override // X.InterfaceC1261750iwH
    public final void LLF(RecyclerView recyclerView, int i) {
    }

    public LegacyDMRecUserCompatImpl() {
        C1261500ivs c1261500ivs = new C1261500ivs();
        this.LL = c1261500ivs;
        ChangeLiveData<C1075800e6M> changeLiveData = new ChangeLiveData<>();
        this.LLILLJJLI = changeLiveData;
        Transformations.map(changeLiveData, AFwS252S0000000_16.get$arr$(490));
        try {
            RecommendFriendInDMExperimentModel recommendFriendInDMExperimentModel = (RecommendFriendInDMExperimentModel) C0C64.LJIILLIIL().LJJII(RecommendFriendInDMExperimentModel.class, C1261510ivt.LIZ, "recommend_friends_in_imchat", true);
            if (recommendFriendInDMExperimentModel != null) {
                if (recommendFriendInDMExperimentModel.showRecommend == 0) {
                    c1261500ivs.LIZ = false;
                } else {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    String str = C1210800hc6.LIZIZ;
                    c1261500ivs.LIZ = jCurrentTimeMillis >= C1210810hc7.LIZ().LIZ.getLong("next_session_time_ms", -1L);
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("shouldShowRecommendFriend ");
        sbLIZ.append(c1261500ivs.LIZ);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1261750iwH
    public final void Kk0(AbstractC1261460ivo<?> abstractC1261460ivo) {
        RecommendFriendInDMExperimentModel recommendFriendInDMExperimentModel;
        int i;
        if (abstractC1261460ivo instanceof C1261350ivd) {
            this.LL.getClass();
            if (C1261500ivs.LIZIZ) {
                C1261500ivs.LIZIZ = false;
                try {
                    recommendFriendInDMExperimentModel = (RecommendFriendInDMExperimentModel) C0C64.LJIILLIIL().LJJII(RecommendFriendInDMExperimentModel.class, C1261510ivt.LIZ, "recommend_friends_in_imchat", true);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    recommendFriendInDMExperimentModel = null;
                }
                int i2 = 3;
                if (recommendFriendInDMExperimentModel != null) {
                    i = recommendFriendInDMExperimentModel.sessionCount;
                    i2 = recommendFriendInDMExperimentModel.hideDays;
                } else {
                    i = 3;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                String str = C1210800hc6.LIZIZ;
                long j = C1210810hc7.LIZ().LIZ.getLong("last_session_time_ms", -1L);
                int i3 = C1210810hc7.LIZ().LIZ.getInt("session_count", 0);
                if (C1387310mCn.LJFF(j)) {
                    int i4 = i3 + 1;
                    C1210810hc7.LIZ().LIZ.storeInt("session_count", i4);
                    if (i4 >= i) {
                        C1210810hc7.LIZ().LIZ.storeLong("next_session_time_ms", jCurrentTimeMillis + (((long) i2) * 86400000));
                        return;
                    }
                    return;
                }
                C1210810hc7.LIZ().LIZ.storeLong("last_session_time_ms", jCurrentTimeMillis);
                C1210810hc7.LIZ().LIZ.storeInt("session_count", 1);
                return;
            }
            return;
        }
        if ((abstractC1261460ivo instanceof C1261480ivq) || (abstractC1261460ivo instanceof C1261450ivn) || (abstractC1261460ivo instanceof C1261340ivc)) {
            this.LL.getClass();
            String str2 = C1210800hc6.LIZIZ;
            C1210810hc7.LIZ().LIZ.storeInt("session_count", 0);
            C1210810hc7.LIZ().LIZ.storeLong("last_session_time_ms", 0L);
            C1210810hc7.LIZ().LIZ.storeLong("next_session_time_ms", 0L);
        }
    }

    @Override // X.InterfaceC1261750iwH
    public final void nO0(C1075800e6M c1075800e6M) {
        this.LLILLJJLI.setValue(c1075800e6M);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }
}
