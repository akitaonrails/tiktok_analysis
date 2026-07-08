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
import com.ss.android.ugc.profile.platform.standard.protocol.component.ContentCellProtocol;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes20.dex */
public final class ContentCellShopProtocol extends ContentCellProtocol implements GenericLifecycleObserver {
    public final String LLL = "profile_center";
    public final Map<String, Object> LLLF = new LinkedHashMap();
    public boolean LLLFF;
    public String LLLFFI;
    public ShopData LLLFZ;

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final LifecycleObserver LJJIZ() {
        return this;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void destroy() {
        this.LLLFF = false;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final String getName() {
        return "content_section_cell_shop";
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            destroy();
        }
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final boolean LJII(View view) {
        ShopData shopData;
        String shopSchema;
        String strLIZ;
        IECommerceShowcaseService iECommerceShowcaseService;
        Context context = getContext();
        if (context != null && (shopData = this.LLLFZ) != null && (shopSchema = shopData.getShopSchema()) != null && (strLIZ = C1733740vDY.LIZ(shopSchema, C1733740vDY.LIZJ(this.LLILZ, "c60310.d36167"))) != null && (iECommerceShowcaseService = (IECommerceShowcaseService) PluggableExtentionKt.pluggableSpi$default(IECommerceShowcaseService.class, false, false, false, 14, null)) != null) {
            iECommerceShowcaseService.LIZIZ(context, strLIZ, this.LLLFFI, this.LLJI, this.LLL, null, null, this.LLLF, C1733740vDY.LJ(this.LLILZ, "c60310.d36167"));
        }
        return true;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.component.AdvancedFeatureProtocol, com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final void LJJJLZIJ(n nVar) {
        ShopData shopData = (ShopData) C08JS.LIZ(nVar.toString(), ShopData.class);
        this.LLLFZ = shopData;
        this.LLJJJJ = shopData;
        this.LLJILJIL = shopData;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007b A[PHI: r4
      0x007b: PHI (r4v12 java.lang.String) = (r4v9 java.lang.String), (r4v8 java.lang.String) binds: [B:33:0x0079, B:30:0x0073] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0087 A[PHI: r4
      0x0087: PHI (r4v10 java.lang.String) = (r4v11 java.lang.String), (r4v12 java.lang.String) binds: [B:38:0x0085, B:35:0x007f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0105 A[PHI: r1 r5
      0x0105: PHI (r1v15 X.0igu) = (r1v12 X.0igu), (r1v16 X.0igu) binds: [B:25:0x0069, B:23:0x0065] A[DONT_GENERATE, DONT_INLINE]
      0x0105: PHI (r5v6 java.lang.String) = (r5v4 java.lang.String), (r5v7 java.lang.String) binds: [B:25:0x0069, B:23:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ss.android.ugc.profile.platform.standard.protocol.component.ContentCellProtocol
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJLJJI(boolean r13) {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.commerce.ContentCellShopProtocol.LJLJJI(boolean):void");
    }
}
