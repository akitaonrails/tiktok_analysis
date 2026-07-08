package com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.friend;

import X.InterfaceC1751820vgi;
import X.InterfaceC1751840vgk;
import android.content.Context;
import android.util.AttributeSet;
import com.ss.android.ugc.aweme.common.EventLiveData;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;

/* JADX INFO: loaded from: classes27.dex */
public interface IFriendDependencyService extends IECommerceHostService {
    InterfaceC1751840vgk createECRelationButtonDelegate(Context context, AttributeSet attributeSet, int i);

    InterfaceC1751820vgi createECRelationTextViewDelegate(Context context, AttributeSet attributeSet, int i);

    EventLiveData<FollowStatus> getRelationObservable();
}
