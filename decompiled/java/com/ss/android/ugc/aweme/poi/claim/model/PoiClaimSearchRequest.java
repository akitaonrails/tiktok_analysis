package com.ss.android.ugc.aweme.poi.claim.model;

import X.C09CT;
import X.C1227904rF;
import X.C2188811AlT;
import X.C2237441Chi;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.poi.model.PoiSearchRequestBody;

/* JADX INFO: loaded from: classes35.dex */
public final class PoiClaimSearchRequest extends PoiSearchRequestBody {
    public static final C2237441Chi Companion = new Object() { // from class: X.1Chi
    };

    @C09CT("account_shop")
    public AccountShop accountShop;

    @C09CT("inapp_is_precise")
    public int inAppIsPrecise;

    @C09CT("system_is_precise")
    public int systemIsPrecise;

    @Override // com.ss.android.ugc.aweme.poi.model.PoiSearchRequestBody
    public n toJsonObject() {
        n jsonObject = super.toJsonObject();
        jsonObject.LJJIII(Integer.valueOf(this.systemIsPrecise), "system_is_precise");
        jsonObject.LJJIII(Integer.valueOf(this.inAppIsPrecise), "inapp_is_precise");
        try {
            C1227904rF.LIZ.getClass();
            jsonObject.LJJIFFI("account_shop", C1227904rF.LIZLLL().LJIJJLI(this.accountShop));
            return jsonObject;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("something was wrong when PoiClaimSearchRequest.toJsonObject, e=");
            sbLIZ.append(e.getMessage());
            C2188811AlT.LIZIZ(sbLIZ);
            return jsonObject;
        }
    }

    public final AccountShop getAccountShop() {
        return this.accountShop;
    }

    public final int getInAppIsPrecise() {
        return this.inAppIsPrecise;
    }

    public final int getSystemIsPrecise() {
        return this.systemIsPrecise;
    }

    public PoiClaimSearchRequest(PoiSearchRequestBody poiSearchRequestBody) {
        super(poiSearchRequestBody.getRegion(), poiSearchRequestBody.getLanguage(), poiSearchRequestBody.getScenario(), poiSearchRequestBody.getRadius(), poiSearchRequestBody.getOffset(), poiSearchRequestBody.getPage(), poiSearchRequestBody.getDevice(), poiSearchRequestBody.getAppId(), poiSearchRequestBody.getDid(), poiSearchRequestBody.getAppVersion(), poiSearchRequestBody.getSdkVersion(), poiSearchRequestBody.getTimeStamp(), poiSearchRequestBody.getLocationAllowed(), poiSearchRequestBody.getLocationInstalled(), poiSearchRequestBody.getLocationPrecise(), poiSearchRequestBody.getAbParams(), poiSearchRequestBody.getEncData(), poiSearchRequestBody.getSessionId(), poiSearchRequestBody.getAwemeId(), poiSearchRequestBody.getEnterFrom(), poiSearchRequestBody.getSearchId(), poiSearchRequestBody.getPublishPoiId(), poiSearchRequestBody.getPublishLogId(), poiSearchRequestBody.getClientExtraData(), poiSearchRequestBody.getPublishContent(), poiSearchRequestBody.getHashtags(), poiSearchRequestBody.isAllianceCreator(), poiSearchRequestBody.getNeedFilterData(), poiSearchRequestBody.getFilterIds(), null);
        this.accountShop = new AccountShop(null, null, null, null);
    }

    public final void setAccountShop(AccountShop accountShop) {
        this.accountShop = accountShop;
    }

    public final void setInAppIsPrecise(int i) {
        this.inAppIsPrecise = i;
    }

    public final void setSystemIsPrecise(int i) {
        this.systemIsPrecise = i;
    }
}
