package com.ss.android.ugc.aweme.feed.cell;

import X.C2217381BqS;
import X.C723830SaL;
import X.C736680Sv4;
import X.InterfaceC494301wD;
import Y.AObjectS386S0100000_11;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.assem.FeedVideoAssem;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import kotlin.jvm.internal.AFwS294S0000000_11;
import kotlin.jvm.internal.AwS590S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class FullFollowRootAssem extends FeedVideoAssem {
    @Override // com.ss.android.ugc.aweme.feed.assem.FeedVideoAssem, X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -959555912) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.FeedVideoAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C723830SaL.LIZ(this, null, new AwS590S0100000_11(this, 114));
        super.onViewCreated(view);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJL.getValue(), new C2217381BqS() { // from class: X.0Rse
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LL;
            }
        }, null, AFwS294S0000000_11.get$arr$(63), 6);
    }

    public FullFollowRootAssem(BaseFeedPageParams baseFeedPageParams, AObjectS386S0100000_11 aObjectS386S0100000_11, ConcurrentHashSet concurrentHashSet) {
        super(baseFeedPageParams, aObjectS386S0100000_11, 3, concurrentHashSet);
    }
}
