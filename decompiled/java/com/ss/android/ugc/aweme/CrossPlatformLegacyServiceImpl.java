package com.ss.android.ugc.aweme;

import X.AbstractC305760Byg;
import X.AbstractC827890Wdn;
import X.C1024900cmG;
import X.C1024950cmL;
import X.C1025140cme;
import X.C1048440dOE;
import X.C2277881EDy;
import X.C286910BMj;
import X.C844470XAv;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.tiktok.ef.i18n.service.manager.I18nServiceApi;
import com.tiktok.ef.i18nmanagerapi.service.i18n.I18nManagerServiceApi;
import java.util.Locale;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public class CrossPlatformLegacyServiceImpl implements ICrossPlatformLegacyService {
    @Override // com.ss.android.ugc.aweme.ICrossPlatformLegacyService
    public final String LIZ() {
        I18nServiceApi i18nServiceApi = (I18nServiceApi) PluggableExtentionKt.pluggableSpi(I18nServiceApi.class);
        if (i18nServiceApi == null || i18nServiceApi.LIZ() == null) {
            return "";
        }
        I18nManagerServiceApi i18nManagerServiceApiLIZ = i18nServiceApi.LIZ();
        C844470XAv.LIZ.getClass();
        return i18nManagerServiceApiLIZ.LJIILJJIL(C844470XAv.LIZ());
    }

    @Override // com.ss.android.ugc.aweme.ICrossPlatformLegacyService
    public final String LJFF() {
        return AbstractC305760Byg.LLIZLLLIL.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.ICrossPlatformLegacyService
    public final JSONObject LJI() {
        return AbstractC305760Byg.LLIZLLLIL.LLILLL;
    }

    @Override // com.ss.android.ugc.aweme.ICrossPlatformLegacyService
    public final Locale LJII() {
        I18nServiceApi i18nServiceApi = (I18nServiceApi) PluggableExtentionKt.pluggableSpi(I18nServiceApi.class);
        if (i18nServiceApi == null || i18nServiceApi.LIZ() == null) {
            return Locale.getDefault();
        }
        I18nManagerServiceApi i18nManagerServiceApiLIZ = i18nServiceApi.LIZ();
        C844470XAv.LIZ.getClass();
        return i18nManagerServiceApiLIZ.LJIJJLI(C844470XAv.LIZ());
    }

    @Override // com.ss.android.ugc.aweme.ICrossPlatformLegacyService
    public final boolean LJIIIIZZ() {
        AbstractC305760Byg.LLIZLLLIL.getClass();
        return ((Boolean) C286910BMj.LIZ.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.ICrossPlatformLegacyService
    public final void LJIIJ() {
        AbstractC827890Wdn.LIZIZ().getClass();
    }

    @Override // com.ss.android.ugc.aweme.ICrossPlatformLegacyService
    public final boolean LIZJ(Uri uri) {
        return C1024900cmG.LIZIZ(uri);
    }

    @Override // com.ss.android.ugc.aweme.ICrossPlatformLegacyService
    public final boolean LIZLLL(Context context) {
        return C1024900cmG.LIZ(context);
    }

    @Override // com.ss.android.ugc.aweme.ICrossPlatformLegacyService
    public final void LIZIZ(Activity activity, Uri.Builder builder) {
        ComplianceServiceProvider.LJJ().LIZIZ(activity, builder);
    }

    @Override // com.ss.android.ugc.aweme.ICrossPlatformLegacyService
    public final boolean LJ(Context context, Uri uri) {
        return C1024900cmG.LJI(context, uri);
    }

    @Override // com.ss.android.ugc.aweme.ICrossPlatformLegacyService
    public final void LJIIJJI(Activity activity, String str) {
        Aweme awemeEr = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).Er(str);
        ComplianceServiceProvider.LJJ().LJFF(C1048440dOE.LIZIZ(awemeEr));
        ComplianceServiceProvider.LJJ().LIZJ(activity, C1048440dOE.LIZJ(awemeEr, "landing_page"));
    }

    @Override // com.ss.android.ugc.aweme.ICrossPlatformLegacyService
    public final boolean LJIILIIL(Context context, Uri uri) {
        return C1025140cme.LIZLLL(context, uri);
    }

    @Override // com.ss.android.ugc.aweme.ICrossPlatformLegacyService
    public final boolean LJIILJJIL(Context context, String str) {
        return C1024950cmL.LIZ(context, str);
    }

    @Override // com.ss.android.ugc.aweme.ICrossPlatformLegacyService
    public final boolean hasAppByHttp(Context context, Uri uri) {
        return C1025140cme.LIZJ(context, uri);
    }

    @Override // com.ss.android.ugc.aweme.ICrossPlatformLegacyService
    public final void LJIIIZ(BaseActivity baseActivity, View view, float f, String... strArr) {
        C2277881EDy.LIZIZ.startHeaderDetailActivity(baseActivity, view, f, null, false, false, null, strArr);
    }

    @Override // com.ss.android.ugc.aweme.ICrossPlatformLegacyService
    public final void LJIIL(Context context, AwemeRawAd awemeRawAd, String str, Boolean bool, String str2) {
        C1025140cme.LJFF(context, awemeRawAd, str, bool.booleanValue(), str2);
    }
}
