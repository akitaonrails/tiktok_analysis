package com.ss.android.ugc.aweme.commercialize.router.api.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class CRouterCoreModel implements Serializable {

    @C09CT("app_model")
    public CRouterAppModel appModel;

    @C09CT("deeplink_model")
    public CRouterDeeplinkModel deeplinkModel;

    @C09CT("lynx_model")
    public CRouterLynxModel lynxModel;

    @C09CT("phone_model")
    public CRouterPhoneModel phoneModel;

    @C09CT("type")
    public final String type;

    @C09CT("web_model")
    public CRouterWebModel webModel;

    @C09CT("web_type")
    public final int webType;

    public CRouterCoreModel() {
        this(null, 0, null, null, null, null, null);
    }

    public final CRouterAppModel getAppModel() {
        return this.appModel;
    }

    public final CRouterDeeplinkModel getDeeplinkModel() {
        return this.deeplinkModel;
    }

    public final CRouterLynxModel getLynxModel() {
        return this.lynxModel;
    }

    public final CRouterPhoneModel getPhoneModel() {
        return this.phoneModel;
    }

    public final String getType() {
        return this.type;
    }

    public final CRouterWebModel getWebModel() {
        return this.webModel;
    }

    public final int getWebType() {
        return this.webType;
    }

    public final void setAppModel(CRouterAppModel cRouterAppModel) {
        this.appModel = cRouterAppModel;
    }

    public final void setDeeplinkModel(CRouterDeeplinkModel cRouterDeeplinkModel) {
        this.deeplinkModel = cRouterDeeplinkModel;
    }

    public final void setLynxModel(CRouterLynxModel cRouterLynxModel) {
        this.lynxModel = cRouterLynxModel;
    }

    public final void setPhoneModel(CRouterPhoneModel cRouterPhoneModel) {
        this.phoneModel = cRouterPhoneModel;
    }

    public final void setWebModel(CRouterWebModel cRouterWebModel) {
        this.webModel = cRouterWebModel;
    }

    public CRouterCoreModel(String str, int i, CRouterLynxModel cRouterLynxModel, CRouterWebModel cRouterWebModel, CRouterDeeplinkModel cRouterDeeplinkModel, CRouterAppModel cRouterAppModel, CRouterPhoneModel cRouterPhoneModel) {
        this.type = str;
        this.webType = i;
        this.lynxModel = cRouterLynxModel;
        this.webModel = cRouterWebModel;
        this.deeplinkModel = cRouterDeeplinkModel;
        this.appModel = cRouterAppModel;
        this.phoneModel = cRouterPhoneModel;
    }
}
