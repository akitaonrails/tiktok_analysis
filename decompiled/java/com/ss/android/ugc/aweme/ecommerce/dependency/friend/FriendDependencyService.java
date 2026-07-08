package com.ss.android.ugc.aweme.ecommerce.dependency.friend;

import X.C04TD;
import X.C1908730zln;
import X.InterfaceC1751820vgi;
import X.InterfaceC1751840vgk;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.ss.android.ugc.aweme.common.EventLiveData;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.friend.IFriendDependencyService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.friends.service.IFriendsService;
import com.ss.android.ugc.aweme.friends.service.RelationService;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class FriendDependencyService implements IFriendDependencyService {
    public void initService() {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.friend.IFriendDependencyService
    public EventLiveData<FollowStatus> getRelationObservable() {
        RelationService relationServiceLIZIZ;
        EventLiveData<FollowStatus> relationObservable;
        IFriendsService iFriendsService = (IFriendsService) PluggableExtentionKt.pluggableSpi$default(IFriendsService.class, false, false, false, 14, null);
        return (iFriendsService == null || (relationServiceLIZIZ = iFriendsService.LIZIZ()) == null || (relationObservable = relationServiceLIZIZ.getRelationObservable()) == null) ? new EventLiveData<>() : relationObservable;
    }

    public static IFriendDependencyService createIFriendDependencyServicebyMonsterPlugin(boolean z) {
        Object objLIZ = C04TD.LIZ(IFriendDependencyService.class, z);
        if (objLIZ != null) {
            return (IFriendDependencyService) objLIZ;
        }
        if (C04TD.v == null) {
            synchronized (IFriendDependencyService.class) {
                if (C04TD.v == null) {
                    C04TD.v = new FriendDependencyService();
                }
            }
        }
        return C04TD.v;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.friend.IFriendDependencyService
    public InterfaceC1751840vgk createECRelationButtonDelegate(Context context, AttributeSet attributeSet, int i) {
        final RelationButton relationButton = new RelationButton(context, attributeSet, i, 8);
        return new InterfaceC1751840vgk() { // from class: X.0zl8
            @Override // X.InterfaceC1751810vgh
            public final View getView() {
                return relationButton;
            }

            @Override // X.InterfaceC1751840vgk
            public final void LIZ(C1908330zl9 c1908330zl9) {
                RelationButton relationButton2 = relationButton;
                C1387050mCN c1387050mCN = new C1387050mCN(c1908330zl9.LIZ);
                c1387050mCN.LJFF = c1908330zl9.LIZIZ;
                c1387050mCN.LJIIJJI = c1908330zl9.LIZJ;
                relationButton2.LLLLZIL(c1387050mCN.LIZ());
            }

            @Override // X.InterfaceC1751840vgk
            public final void LIZIZ(Function1<? super C197039127h, Unit> function1) {
                relationButton.LJJJJL(function1);
            }

            @Override // X.InterfaceC1751810vgh
            public final void setDataChangeListener(Function1<? super C0SY7, Unit> function1) {
                relationButton.setDataChangeListener(function1);
            }

            @Override // X.InterfaceC1751810vgh
            public final void setFollowClickInterceptor(Function1<? super InterfaceC1364105Vn<? super Boolean>, ? extends Object> function1) {
                relationButton.setFollowClickInterceptor(function1);
            }

            @Override // X.InterfaceC1751810vgh
            public final void setFollowClickListener(Function2<? super C0SY7, ? super C0SY7, Unit> function2) {
                relationButton.setFollowClickListener(function2);
            }

            @Override // X.InterfaceC1751840vgk
            public final void setLoading(boolean z) {
                relationButton.setLoading(z);
            }

            @Override // X.InterfaceC1751810vgh
            public final void setTracker(Function0<C1909690znL> function0) {
                relationButton.setTracker(new AwS572S0100000_28(function0, (Function0<Unit>) 197));
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.friend.IFriendDependencyService
    public InterfaceC1751820vgi createECRelationTextViewDelegate(Context context, AttributeSet attributeSet, int i) {
        final C1908730zln c1908730zln = new C1908730zln(context, attributeSet, i, 8);
        return new InterfaceC1751820vgi() { // from class: X.0zl7
            @Override // X.InterfaceC1751810vgh
            public final View getView() {
                return c1908730zln;
            }

            @Override // X.InterfaceC1751820vgi
            public final void LIZJ(C1751690vgV c1751690vgV) {
                C1908730zln c1908730zln2 = c1908730zln;
                C0SWE c0swe = new C0SWE(c1751690vgV.LIZ);
                c0swe.LIZIZ = c1751690vgV.LIZIZ;
                c0swe.LIZLLL = c1751690vgV.LIZJ;
                c0swe.LJFF = c1751690vgV.LIZLLL;
                c1908730zln2.LLLLZIL(c0swe.LIZ());
            }

            @Override // X.InterfaceC1751810vgh
            public final void setDataChangeListener(Function1<? super C0SY7, Unit> function1) {
                c1908730zln.setDataChangeListener(function1);
            }

            @Override // X.InterfaceC1751810vgh
            public final void setFollowClickInterceptor(Function1<? super InterfaceC1364105Vn<? super Boolean>, ? extends Object> function1) {
                c1908730zln.setFollowClickInterceptor(function1);
            }

            @Override // X.InterfaceC1751810vgh
            public final void setFollowClickListener(Function2<? super C0SY7, ? super C0SY7, Unit> function2) {
                c1908730zln.setFollowClickListener(function2);
            }

            @Override // X.InterfaceC1751810vgh
            public final void setTracker(Function0<C1909690znL> function0) {
                c1908730zln.setTracker(new AwS572S0100000_28(function0, (Function0<Unit>) 198));
            }
        };
    }
}
