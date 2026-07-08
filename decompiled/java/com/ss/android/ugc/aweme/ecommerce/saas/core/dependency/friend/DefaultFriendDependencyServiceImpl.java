package com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.friend;

import X.InterfaceC1751820vgi;
import X.InterfaceC1751840vgk;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.ss.android.ugc.aweme.common.EventLiveData;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes27.dex */
public final class DefaultFriendDependencyServiceImpl implements IFriendDependencyService {
    public void initService() {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.friend.IFriendDependencyService
    public EventLiveData<FollowStatus> getRelationObservable() {
        return new EventLiveData<>();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.friend.IFriendDependencyService
    public InterfaceC1751840vgk createECRelationButtonDelegate(Context context, AttributeSet attributeSet, int i) {
        return new InterfaceC1751840vgk() { // from class: X.0vgq
            @Override // X.InterfaceC1751840vgk
            public final void LIZ(C1908330zl9 c1908330zl9) {
            }

            @Override // X.InterfaceC1751840vgk
            public final void LIZIZ(Function1<? super C197039127h, Unit> function1) {
            }

            @Override // X.InterfaceC1751810vgh
            public final void setDataChangeListener(Function1<? super C0SY7, Unit> function1) {
            }

            @Override // X.InterfaceC1751810vgh
            public final void setFollowClickInterceptor(Function1<? super InterfaceC1364105Vn<? super Boolean>, ? extends Object> function1) {
            }

            @Override // X.InterfaceC1751810vgh
            public final void setFollowClickListener(Function2<? super C0SY7, ? super C0SY7, Unit> function2) {
            }

            @Override // X.InterfaceC1751840vgk
            public final void setLoading(boolean z) {
            }

            @Override // X.InterfaceC1751810vgh
            public final void setTracker(Function0<C1909690znL> function0) {
            }

            @Override // X.InterfaceC1751810vgh
            public final View getView() {
                throw new IllegalArgumentException("must return the view");
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.friend.IFriendDependencyService
    public InterfaceC1751820vgi createECRelationTextViewDelegate(Context context, AttributeSet attributeSet, int i) {
        return new InterfaceC1751820vgi() { // from class: X.0vgp
            @Override // X.InterfaceC1751820vgi
            public final void LIZJ(C1751690vgV c1751690vgV) {
            }

            @Override // X.InterfaceC1751810vgh
            public final void setDataChangeListener(Function1<? super C0SY7, Unit> function1) {
            }

            @Override // X.InterfaceC1751810vgh
            public final void setFollowClickInterceptor(Function1<? super InterfaceC1364105Vn<? super Boolean>, ? extends Object> function1) {
            }

            @Override // X.InterfaceC1751810vgh
            public final void setFollowClickListener(Function2<? super C0SY7, ? super C0SY7, Unit> function2) {
            }

            @Override // X.InterfaceC1751810vgh
            public final void setTracker(Function0<C1909690znL> function0) {
            }

            @Override // X.InterfaceC1751810vgh
            public final View getView() {
                throw new IllegalArgumentException("must return the view");
            }
        };
    }
}
