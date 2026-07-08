package com.ss.android.ugc.aweme.api;

import X.C09CT;
import com.google.gson.n;
import com.ss.android.ugc.aweme.poi.model.PoiSearchRequestBody;

/* JADX INFO: loaded from: classes35.dex */
public final class PoiSearchRequestBodyForPrecise extends PoiSearchRequestBody {

    @C09CT("inapp_is_precise")
    public int inAppIsPrecise;

    @C09CT("system_is_precise")
    public int systemIsPrecise;

    @Override // com.ss.android.ugc.aweme.poi.model.PoiSearchRequestBody
    public n toJsonObject() {
        n jsonObject = super.toJsonObject();
        jsonObject.LJJIII(Integer.valueOf(this.systemIsPrecise), "system_is_precise");
        jsonObject.LJJIII(Integer.valueOf(this.inAppIsPrecise), "inapp_is_precise");
        return jsonObject;
    }

    public final int getInAppIsPrecise() {
        return this.inAppIsPrecise;
    }

    public final int getSystemIsPrecise() {
        return this.systemIsPrecise;
    }

    public PoiSearchRequestBodyForPrecise(PoiSearchRequestBody poiSearchRequestBody) {
        super(poiSearchRequestBody.getRegion(), poiSearchRequestBody.getLanguage(), poiSearchRequestBody.getScenario(), poiSearchRequestBody.getRadius(), poiSearchRequestBody.getOffset(), poiSearchRequestBody.getPage(), poiSearchRequestBody.getDevice(), poiSearchRequestBody.getAppId(), poiSearchRequestBody.getDid(), poiSearchRequestBody.getAppVersion(), poiSearchRequestBody.getSdkVersion(), poiSearchRequestBody.getTimeStamp(), poiSearchRequestBody.getLocationAllowed(), poiSearchRequestBody.getLocationInstalled(), poiSearchRequestBody.getLocationPrecise(), poiSearchRequestBody.getAbParams(), poiSearchRequestBody.getEncData(), poiSearchRequestBody.getSessionId(), poiSearchRequestBody.getAwemeId(), poiSearchRequestBody.getEnterFrom(), poiSearchRequestBody.getSearchId(), poiSearchRequestBody.getPublishPoiId(), poiSearchRequestBody.getPublishLogId(), poiSearchRequestBody.getClientExtraData(), poiSearchRequestBody.getPublishContent(), poiSearchRequestBody.getHashtags(), poiSearchRequestBody.isAllianceCreator(), poiSearchRequestBody.getNeedFilterData(), poiSearchRequestBody.getFilterIds(), poiSearchRequestBody.getFirstPagePoiIds());
    }

    public final void setInAppIsPrecise(int i) {
        this.inAppIsPrecise = i;
    }

    public final void setSystemIsPrecise(int i) {
        this.systemIsPrecise = i;
    }
}
