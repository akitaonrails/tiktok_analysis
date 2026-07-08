package com.ss.android.ugc.aweme.vision.model;

import X.InterfaceC1294060jmO;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public final class PhotoSearchPdpEnterParams implements Serializable {
    public String enterProductId;
    public String pageName;
    public final String previousPage;
    public String rawPhotoSource;
    public Integer screenHeight;
    public String searchEntrance;
    public String trackId;

    public PhotoSearchPdpEnterParams() {
        this(null, null, null, null, null, null, null);
    }

    @InterfaceC1294060jmO
    public static /* synthetic */ void getScreenHeight$annotations() {
    }

    public final PhotoSearchPdpEnterParams copy(String str, String str2, String str3, String str4, String str5, Integer num, String str6) {
        return new PhotoSearchPdpEnterParams(str, str2, str3, str4, str5, num, str6);
    }

    public final void setEnterProductId(String str) {
        this.enterProductId = str;
    }

    public final void setPageName(String str) {
        this.pageName = str;
    }

    public final void setRawPhotoSource(String str) {
        this.rawPhotoSource = str;
    }

    public final void setScreenHeight(Integer num) {
        this.screenHeight = num;
    }

    public final void setSearchEntrance(String str) {
        this.searchEntrance = str;
    }

    public final void setTrackId(String str) {
        this.trackId = str;
    }

    public PhotoSearchPdpEnterParams(String str, String str2, String str3, String str4, String str5, Integer num, String str6) {
        this.searchEntrance = str;
        this.pageName = str2;
        this.rawPhotoSource = str3;
        this.enterProductId = str4;
        this.trackId = str5;
        this.screenHeight = num;
        this.previousPage = str6;
    }
}
