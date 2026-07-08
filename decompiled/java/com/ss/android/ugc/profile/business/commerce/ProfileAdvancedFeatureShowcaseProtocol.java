package com.ss.android.ugc.profile.business.commerce;

import X.C08JS;
import X.C1733740vDY;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.IECommerceShowcaseService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.standard.vm.IProfilePlatformVM;
import com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.ProfileHeaderAdvancedFeatureViewModel;
import com.ss.android.ugc.profile.platform.standard.protocol.component.AdvancedFeatureProtocol;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileAdvancedFeatureShowcaseProtocol extends AdvancedFeatureProtocol implements GenericLifecycleObserver {
    public boolean LLJL;
    public final Map<String, Object> LLJLIL = new LinkedHashMap();
    public String LLJLILLLLZIIL = "";
    public String LLJLL;
    public String LLJLLIL;
    public String LLJLLL;
    public ShowCaseData LLJZ;

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final LifecycleObserver LJJIZ() {
        return this;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final String getName() {
        return "advanced_feature_showcase";
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        this.LLJL = false;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final void LIZLLL() {
        ProfileHeaderAdvancedFeatureViewModel profileHeaderAdvancedFeatureViewModel = this.LLJJJIL;
        if (profileHeaderAdvancedFeatureViewModel != null) {
            profileHeaderAdvancedFeatureViewModel.vQ2(new AwS598S0100000_19(this, 304));
        }
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.component.AdvancedFeatureProtocol
    public final void LJJLIIIJLJLI() {
        String showCaseSchema;
        ShowCaseData showCaseData = this.LLJZ;
        if (showCaseData == null || (showCaseSchema = showCaseData.getShowCaseSchema()) == null || a0.LJJJIL(showCaseSchema)) {
            AdvancedFeatureProtocol.LJJLL(this);
        } else {
            LJJZZI();
        }
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final Integer LJJI() {
        return Integer.valueOf(R.raw.icon_bag);
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final boolean LJII(View view) {
        ShowCaseData showCaseData;
        String showCaseSchema;
        String strLIZ;
        IECommerceShowcaseService iECommerceShowcaseService;
        String uid;
        String str;
        User userVQ2;
        this.LLJLIL.put("start_click_time", Long.valueOf(System.currentTimeMillis()));
        Context context = getContext();
        if (context != null && (showCaseData = this.LLJZ) != null && (showCaseSchema = showCaseData.getShowCaseSchema()) != null && (strLIZ = C1733740vDY.LIZ(showCaseSchema, C1733740vDY.LIZJ(this.LLILZ, "c7617.d8588"))) != null && (iECommerceShowcaseService = (IECommerceShowcaseService) PluggableExtentionKt.pluggableSpi$default(IECommerceShowcaseService.class, false, false, false, 14, null)) != null) {
            IProfilePlatformVM iProfilePlatformVM = this.LLIZLLLIL;
            if (iProfilePlatformVM == null || (userVQ2 = iProfilePlatformVM.vQ2()) == null || (uid = userVQ2.getUid()) == null) {
                uid = "";
            }
            String str2 = this.LLJLILLLLZIIL;
            boolean z = this.LLJI;
            if (z) {
                str = "personal_homepage";
            } else {
                str = "others_homepage";
            }
            iECommerceShowcaseService.LJIIJ(context, strLIZ, uid, str2, str, "showcase_icon", z, 0, this.LLJLILLLLZIIL, this.LLJLL, this.LLJLLIL, this.LLJLLL, this.LLJLIL, C1733740vDY.LJ(this.LLILZ, "c7617.d8588"));
            return true;
        }
        return true;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.component.AdvancedFeatureProtocol, com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final void LJJJLZIJ(n nVar) {
        ShowCaseData showCaseData = (ShowCaseData) C08JS.LIZ(nVar.toString(), ShowCaseData.class);
        this.LLJZ = showCaseData;
        this.LLJJJJ = showCaseData;
    }
}
