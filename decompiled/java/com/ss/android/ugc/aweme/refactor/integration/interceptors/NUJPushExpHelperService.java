package com.ss.android.ugc.aweme.refactor.integration.interceptors;

import X.AbstractC1387200mCc;
import X.AbstractC826920WcE;
import X.C1388190mED;
import X.C1906580ziK;
import X.C1912300zrY;
import X.C19719912Dl;
import X.C19EG;
import X.C2187451AjH;
import X.C2211631BhB;
import X.C2222691Bz1;
import X.C259890AGl;
import X.InterfaceC1914010zuJ;
import android.app.Activity;
import com.ss.android.ugc.aweme.IAccountMainService;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService;
import com.ss.android.ugc.aweme.compliance.api.services.termspp.ITermsConsentService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.journey.INUJPushService;
import com.ss.android.ugc.aweme.journey.INUJRevampService;
import com.ss.android.ugc.aweme.refactor.integration.interceptors.NUJPushExpHelperService;
import com.ss.android.ugc.aweme.unifiedauthapi.push.IPushSystemPermissionApi;
import com.ss.android.ugc.awemepushapi.IPushPermissionApi;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class NUJPushExpHelperService implements INUJPushService {
    public boolean LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public boolean LJFF;

    @Override // com.ss.android.ugc.aweme.journey.INUJPushService
    public final void LJFF() {
        this.LJFF = true;
    }

    @Override // com.ss.android.ugc.aweme.journey.INUJPushService
    public final void LJI() {
        this.LJ = true;
    }

    @Override // com.ss.android.ugc.aweme.journey.INUJPushService
    public final void LJII() {
        this.LIZIZ = true;
    }

    @Override // com.ss.android.ugc.aweme.journey.INUJPushService
    public final void LJIIJ() {
        this.LIZ = true;
    }

    @Override // com.ss.android.ugc.aweme.journey.INUJPushService
    public final boolean LIZ() {
        return this.LJ;
    }

    @Override // com.ss.android.ugc.aweme.journey.INUJPushService
    public final boolean LIZJ() {
        return this.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.journey.INUJPushService
    public final boolean LJ() {
        return this.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.journey.INUJPushService
    public final boolean LJIIIIZZ() {
        return this.LIZJ;
    }

    @Override // com.ss.android.ugc.aweme.journey.INUJPushService
    public final boolean LJIIJJI() {
        return this.LJFF;
    }

    public static Activity LJIIL(Activity activity) {
        Activity activityLIZ;
        C19719912Dl c19719912DlLIZJ;
        Activity activityLIZIZ;
        INUJRevampService iNUJRevampService = (INUJRevampService) PluggableExtentionKt.pluggableSpi$default(INUJRevampService.class, false, false, false, 14, null);
        if ((iNUJRevampService != null && iNUJRevampService.LIZ(false)) || !Intrinsics.LJFF(C2222691Bz1.LIZ().toUpperCase(Locale.ROOT), "BR")) {
            return activity;
        }
        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
        if (abstractC1387200mCcLJ != null && (activityLIZIZ = abstractC1387200mCcLJ.LIZIZ()) != null) {
            activityLIZ = C1388190mED.LIZ(activityLIZIZ);
        } else {
            activityLIZ = null;
        }
        IAccountMainService iAccountMainService = (IAccountMainService) PluggableExtentionKt.pluggableSpi$default(IAccountMainService.class, false, false, false, 14, null);
        if (iAccountMainService != null && (c19719912DlLIZJ = iAccountMainService.LIZJ()) != null && c19719912DlLIZJ.LIZIZ(activityLIZ) && activityLIZ != null && !activityLIZ.isFinishing() && ((Boolean) C259890AGl.LIZ.getValue()).booleanValue()) {
            return activityLIZ;
        }
        return activity;
    }

    @Override // com.ss.android.ugc.aweme.journey.INUJPushService
    public final void LIZIZ(final C19EG c19eg) {
        if (this.LIZLLL) {
            int i = C2187451AjH.LIZ;
            return;
        }
        this.LIZLLL = true;
        final IPushPermissionApi iPushPermissionApi = (IPushPermissionApi) ServiceManager.get().getService(IPushPermissionApi.class);
        ITpcConsentService iTpcConsentService = (ITpcConsentService) ServiceManager.get().getService(ITpcConsentService.class);
        ServiceManager.get().getService(ITermsConsentService.class);
        if (!iTpcConsentService.LJ()) {
            int i2 = C2187451AjH.LIZ;
            iPushPermissionApi.LJIILIIL(c19eg, "interest_done", null);
        } else {
            int i3 = C2187451AjH.LIZ;
            ComplianceServiceProvider.LJIILJJIL().LJIIJJI(new AbstractC826920WcE() { // from class: X.0zuH
                public final /* synthetic */ String LIZJ = "interest_done";

                @Override // X.InterfaceC1915870zxJ
                public final void LIZ(EnumC1876780ywG enumC1876780ywG) {
                    if (EnumC1876780ywG.APPROVE == enumC1876780ywG) {
                        int i4 = C2187451AjH.LIZ;
                        iPushPermissionApi.LJIILIIL(c19eg, this.LIZJ, null);
                        ComplianceServiceProvider.LJIILJJIL().LJIIIZ(this);
                    }
                }
            });
        }
    }

    @Override // com.ss.android.ugc.aweme.journey.INUJPushService
    public final void LJIIIZ(C19EG c19eg, C1912300zrY c1912300zrY) {
        if (this.LIZJ) {
            int i = C2187451AjH.LIZ;
            c1912300zrY.LIZIZ();
            return;
        }
        this.LIZJ = true;
        IPushSystemPermissionApi iPushSystemPermissionApi = (IPushSystemPermissionApi) PluggableExtentionKt.pluggableSpi$default(IPushSystemPermissionApi.class, false, false, false, 14, null);
        int i2 = C2187451AjH.LIZ;
        if (iPushSystemPermissionApi != null) {
            iPushSystemPermissionApi.LIZJ(LJIIL(c19eg), c1912300zrY);
        }
        C2211631BhB.LJIILL("b8170", null);
    }

    @Override // com.ss.android.ugc.aweme.journey.INUJPushService
    public final void LIZLLL(final Activity activity, final String str, boolean z, final boolean z2, final InterfaceC1914010zuJ interfaceC1914010zuJ) {
        if (this.LIZJ) {
            int i = C2187451AjH.LIZ;
            if (interfaceC1914010zuJ != null) {
                interfaceC1914010zuJ.LIZIZ();
                return;
            }
            return;
        }
        this.LIZJ = true;
        final IPushPermissionApi iPushPermissionApi = (IPushPermissionApi) ServiceManager.get().getService(IPushPermissionApi.class);
        ITpcConsentService iTpcConsentService = (ITpcConsentService) ServiceManager.get().getService(ITpcConsentService.class);
        ServiceManager.get().getService(ITermsConsentService.class);
        if (iTpcConsentService.LJ() && !z) {
            int i2 = C2187451AjH.LIZ;
            if (interfaceC1914010zuJ != null) {
                interfaceC1914010zuJ.LIZ();
            }
            ComplianceServiceProvider.LJIILJJIL().LJIIJJI(new AbstractC826920WcE() { // from class: X.0zuI
                @Override // X.InterfaceC1915870zxJ
                public final void LIZ(EnumC1876780ywG enumC1876780ywG) {
                    if (EnumC1876780ywG.APPROVE == enumC1876780ywG) {
                        int i3 = C2187451AjH.LIZ;
                        IPushPermissionApi iPushPermissionApi2 = iPushPermissionApi;
                        NUJPushExpHelperService nUJPushExpHelperService = this;
                        Activity activity2 = activity;
                        nUJPushExpHelperService.getClass();
                        iPushPermissionApi2.LJIIZILJ(NUJPushExpHelperService.LJIIL(activity2), str, false, z2, interfaceC1914010zuJ);
                        C2211631BhB.LJIILL("b8170", null);
                        ComplianceServiceProvider.LJIILJJIL().LJIIIZ(this);
                    }
                }
            });
            return;
        }
        int i3 = C2187451AjH.LIZ;
        iPushPermissionApi.LJIIZILJ(LJIIL(activity), str, z, z2, interfaceC1914010zuJ);
        C2211631BhB.LJIILL("b8170", null);
    }
}
