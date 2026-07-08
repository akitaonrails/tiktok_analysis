package com.ss.android.ugc.aweme.commercialize.model.router;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class AdUnifyJumpModel implements Serializable {

    @C09CT("app_id")
    public String appID;

    @C09CT("lynx_model")
    public CRouterLynxModel lynxModel;

    @C09CT("open_url")
    public String openURL;

    @C09CT("phone_number")
    public String phoneNumber;

    @C09CT("type")
    public String type;

    @C09CT("web_model")
    public CRouterWebModel webModel;

    public AdUnifyJumpModel() {
        this(null, new CRouterLynxModel(null, null, 0), new CRouterWebModel(null, null), null, null, null);
    }

    public final String getAppID() {
        return this.appID;
    }

    public final CRouterLynxModel getLynxModel() {
        return this.lynxModel;
    }

    public final String getOpenURL() {
        return this.openURL;
    }

    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public final String getType() {
        return this.type;
    }

    public final CRouterWebModel getWebModel() {
        return this.webModel;
    }

    public final void setAppID(String str) {
        this.appID = str;
    }

    public final void setLynxModel(CRouterLynxModel cRouterLynxModel) {
        this.lynxModel = cRouterLynxModel;
    }

    public final void setOpenURL(String str) {
        this.openURL = str;
    }

    public final void setPhoneNumber(String str) {
        this.phoneNumber = str;
    }

    public final void setType(String str) {
        this.type = str;
    }

    public final void setWebModel(CRouterWebModel cRouterWebModel) {
        this.webModel = cRouterWebModel;
    }

    public AdUnifyJumpModel(String str, CRouterLynxModel cRouterLynxModel, CRouterWebModel cRouterWebModel, String str2, String str3, String str4) {
        this.type = str;
        this.lynxModel = cRouterLynxModel;
        this.webModel = cRouterWebModel;
        this.openURL = str2;
        this.appID = str3;
        this.phoneNumber = str4;
    }
}
