package com.ss.android.ugc.aweme.compliance.consent.deviceconsent.config;

import X.AbstractC19484711Kz;
import X.C11S5;
import X.C1701940uOG;
import X.C1912410zrj;
import X.C1912740zsG;
import X.C1913000zsg;
import X.C516201zk;
import Y.ACallableS30S1000000_28;
import android.content.Context;
import com.ss.android.ugc.aweme.compliance.api.services.consent.IPNSConsentConfigService;
import com.ss.android.ugc.aweme.compliance.api.services.consent.model.ConsentBoxConfig;
import com.ss.android.ugc.aweme.compliance.api.services.consent.model.ConsentConfigResponse;
import com.ss.android.ugc.aweme.compliance.api.services.consent.model.ConsentLabelConfig;
import com.ss.android.ugc.aweme.compliance.api.services.consent.model.DeviceConsentConfig;
import com.ss.android.ugc.aweme.compliance.api.services.consent.model.KRConsentConfig;
import com.ss.android.ugc.aweme.compliance.api.services.consent.model.TextWithInlineLink;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS78S1000000_28;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes29.dex */
public final class PNSConsentConfigServiceImpl implements IPNSConsentConfigService {
    @Override // com.ss.android.ugc.aweme.compliance.api.services.consent.IPNSConsentConfigService
    public final TextWithInlineLink LIZIZ() {
        ConsentLabelConfig consentLabelConfig;
        C1912410zrj.LIZ.getClass();
        ConsentConfigResponse consentConfigResponseLIZ = C1912410zrj.LIZ();
        if (consentConfigResponseLIZ == null || (consentLabelConfig = consentConfigResponseLIZ.consentLabel) == null) {
            return null;
        }
        return consentLabelConfig.changeRegion;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.consent.IPNSConsentConfigService
    public final void LIZJ() {
        C1913000zsg.LIZ.getClass();
        C1913000zsg.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.consent.IPNSConsentConfigService
    public final ConsentBoxConfig LJI() {
        DeviceConsentConfig deviceConsentConfig;
        C1912410zrj.LIZ.getClass();
        ConsentConfigResponse consentConfigResponseLIZ = C1912410zrj.LIZ();
        if (consentConfigResponseLIZ == null || (deviceConsentConfig = consentConfigResponseLIZ.deviceConsent) == null) {
            return null;
        }
        return deviceConsentConfig.consentBox;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.consent.IPNSConsentConfigService
    public final TextWithInlineLink LJII() {
        ConsentLabelConfig consentLabelConfig;
        C1912410zrj.LIZ.getClass();
        ConsentConfigResponse consentConfigResponseLIZ = C1912410zrj.LIZ();
        if (consentConfigResponseLIZ == null || (consentLabelConfig = consentConfigResponseLIZ.consentLabel) == null) {
            return null;
        }
        return consentLabelConfig.kidsMode;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.consent.IPNSConsentConfigService
    public final TextWithInlineLink LJIIIIZZ() {
        ConsentLabelConfig consentLabelConfig;
        C1912410zrj.LIZ.getClass();
        ConsentConfigResponse consentConfigResponseLIZ = C1912410zrj.LIZ();
        if (consentConfigResponseLIZ == null || (consentLabelConfig = consentConfigResponseLIZ.consentLabel) == null) {
            return null;
        }
        return consentLabelConfig.f52default;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.consent.IPNSConsentConfigService
    public final KRConsentConfig LJIIJ() {
        DeviceConsentConfig deviceConsentConfig;
        C1912410zrj.LIZ.getClass();
        ConsentConfigResponse consentConfigResponseLIZ = C1912410zrj.LIZ();
        if (consentConfigResponseLIZ == null || (deviceConsentConfig = consentConfigResponseLIZ.deviceConsent) == null) {
            return null;
        }
        return deviceConsentConfig.krConsent;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.consent.IPNSConsentConfigService
    public final ConsentBoxConfig LJIIJJI() {
        DeviceConsentConfig deviceConsentConfig;
        C1912410zrj.LIZ.getClass();
        ConsentConfigResponse consentConfigResponseLIZ = C1912410zrj.LIZ();
        if (consentConfigResponseLIZ == null || (deviceConsentConfig = consentConfigResponseLIZ.deviceConsent) == null) {
            return null;
        }
        return deviceConsentConfig.huConsent;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.consent.IPNSConsentConfigService
    public final void LIZLLL(String str) {
        C1913000zsg.LIZ.getClass();
        C1913000zsg.LIZLLL(str);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.consent.IPNSConsentConfigService
    public final void LJIIIZ(String str) {
        C1913000zsg.LIZ.getClass();
        C1913000zsg.LIZJ(str);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.consent.IPNSConsentConfigService
    public final void LJ(String str, Function1 function1) {
        C1912410zrj.LIZ.getClass();
        AbstractC19484711Kz.LJIJI(new ACallableS30S1000000_28(str, 1)).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LJJIIZ(new C516201zk(function1, 118), new C516201zk(function1, 119));
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.consent.IPNSConsentConfigService
    public final CharSequence LJFF(Context context, ConsentBoxConfig consentBoxConfig, String str, int i) {
        String str2 = consentBoxConfig.body;
        if (str2 != null && str2.length() != 0) {
            C1913000zsg c1913000zsg = C1913000zsg.LIZ;
            AwS78S1000000_28 awS78S1000000_28 = new AwS78S1000000_28(str, 8);
            c1913000zsg.getClass();
            return C1912740zsG.LIZ(new TextWithInlineLink(consentBoxConfig.body, consentBoxConfig.bodyLinkList), i, 82, awS78S1000000_28);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.consent.IPNSConsentConfigService
    public final CharSequence LIZ(Context context, TextWithInlineLink textWithInlineLink, String str, int i, int i2) {
        String str2 = textWithInlineLink.text;
        if (str2 != null && str2.length() != 0) {
            Regex regex = C1912740zsG.LIZ;
            return C1912740zsG.LIZ(textWithInlineLink, i, i2, new AwS78S1000000_28(str, 2));
        }
        return null;
    }
}
