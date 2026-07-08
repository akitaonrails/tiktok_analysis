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
import com.ss.android.ugc.profile.platform.standard.protocol.component.AdvancedFeatureProtocol;
import com.ss.android.ugc.profile.platform.standard.protocol.component.ContentCellProtocol;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes20.dex */
public final class ContentCellShowcaseProtocol extends ContentCellProtocol implements GenericLifecycleObserver {
    public boolean LLLF;
    public String LLLFZ;
    public String LLLI;
    public String LLLII;
    public ShowCaseData LLLIIII;
    public final String LLL = "profile_center";
    public final Map<String, Object> LLLFF = new LinkedHashMap();
    public String LLLFFI = "";

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final LifecycleObserver LJJIZ() {
        return this;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void destroy() {
        this.LLLF = false;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final String getName() {
        return "content_section_cell_showcase";
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            destroy();
        }
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.component.AdvancedFeatureProtocol
    public final void LJJLIIIJLJLI() {
        String showCaseSchema;
        ShowCaseData showCaseData = this.LLLIIII;
        if (showCaseData == null || (showCaseSchema = showCaseData.getShowCaseSchema()) == null || a0.LJJJIL(showCaseSchema)) {
            AdvancedFeatureProtocol.LJJLL(this);
        } else {
            LJJZZI();
        }
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final boolean LJII(View view) {
        ShowCaseData showCaseData;
        String showCaseSchema;
        String strLIZ;
        IECommerceShowcaseService iECommerceShowcaseService;
        String uid;
        User userVQ2;
        this.LLLFF.put("start_click_time", Long.valueOf(System.currentTimeMillis()));
        Context context = getContext();
        if (context != null && (showCaseData = this.LLLIIII) != null && (showCaseSchema = showCaseData.getShowCaseSchema()) != null && (strLIZ = C1733740vDY.LIZ(showCaseSchema, C1733740vDY.LIZJ(this.LLILZ, "c60310.d49409"))) != null && (iECommerceShowcaseService = (IECommerceShowcaseService) PluggableExtentionKt.pluggableSpi$default(IECommerceShowcaseService.class, false, false, false, 14, null)) != null) {
            IProfilePlatformVM iProfilePlatformVM = this.LLIZLLLIL;
            if (iProfilePlatformVM == null || (userVQ2 = iProfilePlatformVM.vQ2()) == null || (uid = userVQ2.getUid()) == null) {
                uid = "";
            }
            iECommerceShowcaseService.LJIIJ(context, strLIZ, uid, this.LLLFFI, this.LLL, "showcase_icon", this.LLJI, 0, this.LLLFFI, this.LLLFZ, this.LLLI, this.LLLII, this.LLLFF, C1733740vDY.LJ(this.LLILZ, "c60310.d49409"));
            return true;
        }
        return true;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.component.AdvancedFeatureProtocol, com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final void LJJJLZIJ(n nVar) {
        ShowCaseData showCaseData = (ShowCaseData) C08JS.LIZ(nVar.toString(), ShowCaseData.class);
        this.LLLIIII = showCaseData;
        this.LLJJJJ = showCaseData;
        this.LLJILJIL = showCaseData;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003f A[PHI: r3
      0x003f: PHI (r3v9 java.lang.String) = (r3v6 java.lang.String), (r3v5 java.lang.String) binds: [B:22:0x003d, B:19:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004b A[PHI: r3
      0x004b: PHI (r3v7 java.lang.String) = (r3v8 java.lang.String), (r3v9 java.lang.String) binds: [B:27:0x0049, B:24:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ss.android.ugc.profile.platform.standard.protocol.component.ContentCellProtocol
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJLJJI(boolean r16) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.commerce.ContentCellShowcaseProtocol.LJLJJI(boolean):void");
    }
}
