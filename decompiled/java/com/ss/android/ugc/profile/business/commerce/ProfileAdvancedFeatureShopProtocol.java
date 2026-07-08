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
import com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.ProfileHeaderAdvancedFeatureViewModel;
import com.ss.android.ugc.profile.platform.standard.protocol.component.AdvancedFeatureProtocol;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS598S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileAdvancedFeatureShopProtocol extends AdvancedFeatureProtocol implements GenericLifecycleObserver {
    public final Map<String, Object> LLJL = new LinkedHashMap();
    public boolean LLJLIL;
    public String LLJLILLLLZIIL;
    public ShopData LLJLL;

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final LifecycleObserver LJJIZ() {
        return this;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final String getName() {
        return "advanced_feature_shop";
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        this.LLJLIL = false;
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
            profileHeaderAdvancedFeatureViewModel.vQ2(new AwS598S0100000_19(this, 303));
        }
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final Integer LJJI() {
        return Integer.valueOf(R.raw.icon_bag);
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final boolean LJII(View view) {
        ShopData shopData;
        String shopSchema;
        String strLIZ;
        IECommerceShowcaseService iECommerceShowcaseService;
        String str;
        Context context = getContext();
        if (context != null && (shopData = this.LLJLL) != null && (shopSchema = shopData.getShopSchema()) != null && (strLIZ = C1733740vDY.LIZ(shopSchema, C1733740vDY.LIZJ(this.LLILZ, "c7617.d8034"))) != null && (iECommerceShowcaseService = (IECommerceShowcaseService) PluggableExtentionKt.pluggableSpi$default(IECommerceShowcaseService.class, false, false, false, 14, null)) != null) {
            String str2 = this.LLJLILLLLZIIL;
            boolean z = this.LLJI;
            if (z) {
                str = "personal_homepage";
            } else {
                str = "others_homepage";
            }
            iECommerceShowcaseService.LIZIZ(context, strLIZ, str2, z, str, null, null, this.LLJL, C1733740vDY.LJ(this.LLILZ, "c7617.d8034"));
        }
        return true;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.component.AdvancedFeatureProtocol, com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final void LJJJLZIJ(n nVar) {
        ShopData shopData = (ShopData) C08JS.LIZ(nVar.toString(), ShopData.class);
        this.LLJLL = shopData;
        this.LLJJJJ = shopData;
    }
}
