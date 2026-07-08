package com.ss.android.ugc.aweme.search.lynx.core.viewmodel.plugin.impl;

import X.AbstractC1156450gCR;
import X.C08CX;
import X.C1156440gCQ;
import X.C1156460gCS;
import X.C13IQ;
import X.C1537480q70;
import X.C1D61;
import X.C1D63;
import X.C1D6D;
import X.C2250381D6e;
import X.EnumC115000c8;
import X.InterfaceC1541990qEH;
import X.InterfaceC2250311D5x;
import Y.AObserverS214S0100000_10;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import com.ss.android.ugc.aweme.common.EventLiveData;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.friends.service.IFriendsService;
import com.ss.android.ugc.aweme.friends.service.RelationService;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes36.dex */
public final class FollowStatusSyncPlugin implements InterfaceC2250311D5x {
    public Observer<FollowStatus> followObservable;
    public final Set<C1D61> lifecycleStages = Collections.singleton(C1D6D.ON_VIEW_CREATE);
    public static final C2250381D6e Companion = new Object() { // from class: X.1D6e
    };
    public static final int $stable = 8;

    @Override // X.InterfaceC2250311D5x
    public int getPriority() {
        return 10;
    }

    @Override // X.InterfaceC2250311D5x
    public void destroy() {
        IFriendsService iFriendsService;
        RelationService relationServiceLIZIZ;
        EventLiveData<FollowStatus> relationObservable;
        Observer<FollowStatus> observer = this.followObservable;
        if (observer == null || (iFriendsService = (IFriendsService) PluggableExtentionKt.pluggableSpi$default(IFriendsService.class, false, false, false, 14, null)) == null || (relationServiceLIZIZ = iFriendsService.LIZIZ()) == null || (relationObservable = relationServiceLIZIZ.getRelationObservable()) == null) {
            return;
        }
        relationObservable.removeObserver(observer);
    }

    @Override // X.InterfaceC2250311D5x
    public Set<C13IQ<? extends InterfaceC2250311D5x>> getDependencies() {
        return C08CX.INSTANCE;
    }

    @Override // X.InterfaceC2250311D5x
    public Set<C1D61> getLifecycleStages() {
        return this.lifecycleStages;
    }

    @Override // X.InterfaceC2250311D5x
    public AbstractC1156450gCR<?> executeDependencyReady(C1D63 c1d63) {
        return C1156460gCS.LIZ;
    }

    @Override // X.InterfaceC2250311D5x
    public AbstractC1156450gCR<?> executeImmediate(C1D63 c1d63) {
        InterfaceC1541990qEH interfaceC1541990qEHLJIJJ;
        View viewE1;
        LifecycleOwner lifecycleOwner;
        IFriendsService iFriendsService;
        RelationService relationServiceLIZIZ;
        EventLiveData<FollowStatus> relationObservable;
        AObserverS214S0100000_10 aObserverS214S0100000_10 = new AObserverS214S0100000_10(c1d63, 21);
        this.followObservable = aObserverS214S0100000_10;
        C1537480q70 c1537480q70 = c1d63.LIZJ;
        if (c1537480q70 != null && (interfaceC1541990qEHLJIJJ = c1537480q70.LJIJJ()) != null && (viewE1 = interfaceC1541990qEHLJIJJ.e1()) != null && (lifecycleOwner = ViewTreeLifecycleOwner.get(viewE1)) != null && (iFriendsService = (IFriendsService) PluggableExtentionKt.pluggableSpi$default(IFriendsService.class, false, false, false, 14, null)) != null && (relationServiceLIZIZ = iFriendsService.LIZIZ()) != null && (relationObservable = relationServiceLIZIZ.getRelationObservable()) != null) {
            relationObservable.observe(lifecycleOwner, aObserverS214S0100000_10);
        }
        return new C1156440gCQ(EnumC115000c8.SUCCESS);
    }
}
