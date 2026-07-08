package com.ss.android.ugc.profile.business.pns.business;

import X.C0XQ7;
import X.C786410Ut5;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileHeaderTopTipsPrivateProtocol extends ProfilePlatformProtocol<BizBaseData> implements GenericLifecycleObserver {
    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final LifecycleObserver LJJIZ() {
        return this;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final String getName() {
        return "top_tips_private_info";
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
        }
    }

    public final void LJJLIIIJLJLI() {
        View view = this.LLILZLL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(C0XQ7.LJFF().getCurUser().isAccuratePrivateAccount() ? 0 : 8, view);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final Integer LJJI() {
        return Integer.valueOf(R.raw.icon_3pt_private_account);
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final String LJJIFFI() {
        Context context = getContext();
        if (context != null) {
            return context.getString(2131835513);
        }
        return null;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final void LIZLLL() {
        LJJLIIIJLJLI();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        LJJLIIIJLJLI();
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final boolean LJJLIIIJJIZ(ProfileComponents profileComponents) {
        LJJLIIIJLJLI();
        return true;
    }
}
