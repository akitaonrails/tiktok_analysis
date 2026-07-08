package com.ss.android.ugc.aweme.profile.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public final class UserBioPermission implements Serializable {

    @C09CT("enable_download_app_link")
    public boolean enableDownloadAppLink;

    @C09CT("enable_email")
    public boolean enableEmail;

    @C09CT("enable_location")
    public boolean enableLocation;

    @C09CT("enable_phone")
    public boolean enablePhone;

    @C09CT("enable_url")
    public boolean enableUrl;

    public final boolean getEnableDownloadAppLink() {
        return this.enableDownloadAppLink;
    }

    public final boolean getEnableEmail() {
        return this.enableEmail;
    }

    public final boolean getEnableLocation() {
        return this.enableLocation;
    }

    public final boolean getEnablePhone() {
        return this.enablePhone;
    }

    public final boolean getEnableUrl() {
        return this.enableUrl;
    }

    public final void setEnableDownloadAppLink(boolean z) {
        this.enableDownloadAppLink = z;
    }

    public final void setEnableEmail(boolean z) {
        this.enableEmail = z;
    }

    public final void setEnableLocation(boolean z) {
        this.enableLocation = z;
    }

    public final void setEnablePhone(boolean z) {
        this.enablePhone = z;
    }

    public final void setEnableUrl(boolean z) {
        this.enableUrl = z;
    }
}
