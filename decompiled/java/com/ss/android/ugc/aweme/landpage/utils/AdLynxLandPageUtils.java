package com.ss.android.ugc.aweme.landpage.utils;

import X.C1037700d6u;
import X.C305310Bxx;
import X.C444960Hcc;
import X.C497820Jfg;
import X.C786410Ut5;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.autofill.IAdAutofillService;
import com.ss.android.ugc.aweme.commercialize.feed.preload.PreloadData;
import com.ss.android.ugc.aweme.commercialize.model.NativeSiteConfig;
import com.ss.android.ugc.aweme.commercialize.service.IFeedVideoShrinkService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.landpage.IAdLynxLandPageUtils;
import com.ss.android.ugc.aweme.web.service.IAdWebUtils;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class AdLynxLandPageUtils implements IAdLynxLandPageUtils {
    @Override // com.ss.android.ugc.aweme.landpage.IAdLynxLandPageUtils
    public final void LJJIZ() {
        IFeedVideoShrinkService iFeedVideoShrinkService = (IFeedVideoShrinkService) PluggableExtentionKt.pluggableSpi$default(IFeedVideoShrinkService.class, false, false, false, 14, null);
        if (iFeedVideoShrinkService != null) {
            iFeedVideoShrinkService.LLL();
        }
    }

    @Override // com.ss.android.ugc.aweme.landpage.IAdLynxLandPageUtils
    public final boolean LIZ(String str) {
        if (str == null) {
            return false;
        }
        return u.LJJIIJZLJL(str, "aweme://lynxview", false);
    }

    @Override // com.ss.android.ugc.aweme.landpage.IAdLynxLandPageUtils
    public final boolean LIZJ(Aweme aweme) {
        if (aweme != null) {
            return LIZLLL(aweme.getAwemeRawAd());
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.landpage.IAdLynxLandPageUtils
    public final boolean LIZLLL(AwemeRawAd awemeRawAd) {
        NativeSiteConfig nativeSiteConfig;
        if (awemeRawAd == null || (nativeSiteConfig = awemeRawAd.getNativeSiteConfig()) == null || !TextUtils.equals(nativeSiteConfig.renderType, "lynx") || TextUtils.isEmpty(nativeSiteConfig.lynxScheme)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00f4  */
    @Override // com.ss.android.ugc.aweme.landpage.IAdLynxLandPageUtils
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LJFF(X.C1026310coX r13, android.content.Context r14, java.lang.String r15) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.landpage.utils.AdLynxLandPageUtils.LJFF(X.0coX, android.content.Context, java.lang.String):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00fb  */
    @Override // com.ss.android.ugc.aweme.landpage.IAdLynxLandPageUtils
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.fragment.app.Fragment LJ(X.C19EG r45, android.os.Bundle r46, com.ss.android.ugc.aweme.feed.model.Aweme r47, java.lang.String r48, java.lang.String r49, boolean r50) {
        /*
            Method dump skipped, instruction units count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.landpage.utils.AdLynxLandPageUtils.LJ(X.19EG, android.os.Bundle, com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, java.lang.String, boolean):androidx.fragment.app.Fragment");
    }

    @Override // com.ss.android.ugc.aweme.landpage.IAdLynxLandPageUtils
    public final String LJI(AwemeRawAd awemeRawAd, Context context, Boolean bool, Boolean bool2, String str, JSONObject jSONObject, Bundle bundle) throws JSONException {
        String siteId;
        String string;
        String nativeSiteAdInfo;
        int iLIZJ;
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (awemeRawAd != null) {
            PreloadData preloadData = awemeRawAd.getPreloadData();
            String string2 = null;
            if (preloadData != null) {
                siteId = preloadData.getSiteId();
            } else {
                siteId = null;
            }
            jSONObject.put("siteId", siteId);
            Long adId = awemeRawAd.getAdId();
            if (adId != null) {
                string = adId.toString();
            } else {
                string = null;
            }
            jSONObject.put("adId", string);
            jSONObject.put("creativeId", awemeRawAd.getCreativeIdStr());
            jSONObject.put("logExtra", awemeRawAd.getLogExtra());
            Long groupId = awemeRawAd.getGroupId();
            if (groupId != null) {
                string2 = groupId.toString();
            }
            jSONObject.put("groupId", string2);
            jSONObject.put("webUrl", awemeRawAd.getWebUrl());
            if (bundle == null || (nativeSiteAdInfo = bundle.getString("bundle_native_site_ad_info")) == null) {
                nativeSiteAdInfo = awemeRawAd.getNativeSiteAdInfo();
            }
            jSONObject.put("pageData", nativeSiteAdInfo);
            jSONObject.put("appData", awemeRawAd.getAppData());
            jSONObject.put("isRTL", C444960Hcc.LIZJ(context) ? 1 : 0);
            if (context != null) {
                iLIZJ = C497820Jfg.LIZJ(context);
            } else {
                iLIZJ = 0;
            }
            jSONObject.put("topSafeAreaHeight", iLIZJ);
            jSONObject.put("isAutoFillEnable", ((IAdAutofillService) ServiceManager.get().getService(IAdAutofillService.class)).LIZIZ(awemeRawAd) ? 1 : 0);
            jSONObject.put("enableAutofillV2", C305310Bxx.LIZ());
            jSONObject.put("autoFillInfo", ((IAdAutofillService) ServiceManager.get().getService(IAdAutofillService.class)).LJIILJJIL());
            Boolean bool3 = Boolean.TRUE;
            if (Intrinsics.LJFF(bool, bool3)) {
                C1037700d6u.LIZ.getClass();
                jSONObject.put("landPageShowType", C1037700d6u.LIZLLL(awemeRawAd));
            }
            if (Intrinsics.LJFF(bool2, bool3)) {
                jSONObject.put("landPageShowType", "3");
            }
            ((IAdWebUtils) ServiceManager.get().getService(IAdWebUtils.class)).rv(awemeRawAd, str, jSONObject);
        }
        return C786410Ut5.J3(jSONObject);
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x04ca  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x050e  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0530  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0533  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0539  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x053c  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x053f  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0542  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x054f  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0555  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0558  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0566 A[Catch: all -> 0x058b, TryCatch #1 {all -> 0x058b, blocks: (B:343:0x055c, B:345:0x0566, B:347:0x0579, B:348:0x0585), top: B:462:0x055c }] */
    /* JADX WARN: Removed duplicated region for block: B:358:0x05a9  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x05b8  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x05d7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x05e2  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x05ed  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x05f8  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x060c  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x0625  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x0712  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x0715  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x0718  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x071b  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x0721  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x023f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x015b  */
    @Override // com.ss.android.ugc.aweme.landpage.IAdLynxLandPageUtils
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.fragment.app.Fragment LIZIZ(android.content.Context r42, java.lang.String r43, X.C1026310coX r44, boolean r45, X.EnumC1036160d4Q r46, int r47, java.lang.String r48, boolean r49, X.InterfaceC1036270d4b r50) {
        /*
            Method dump skipped, instruction units count: 2024
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.landpage.utils.AdLynxLandPageUtils.LIZIZ(android.content.Context, java.lang.String, X.0coX, boolean, X.0d4Q, int, java.lang.String, boolean, X.0d4b):androidx.fragment.app.Fragment");
    }
}
