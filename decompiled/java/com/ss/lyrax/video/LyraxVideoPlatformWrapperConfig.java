package com.ss.lyrax.video;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxVideoPlatformWrapperConfig {
    public LyraxVideoContentType contentType;
    public boolean enableAux;
    public ErrorStrategy errorStrategy;
    public String jsonParams;
    public String sessionId;
    public String sourceRoute;

    public int getErrorStrategy() {
        return this.errorStrategy.value();
    }

    public LyraxVideoPlatformWrapperConfig() {
        this.sessionId = "";
        this.sourceRoute = "";
        this.contentType = LyraxVideoContentType.CAMERA;
        this.jsonParams = "";
        this.errorStrategy = ErrorStrategy.FREEZE;
    }

    public LyraxVideoContentType getContentType() {
        return this.contentType;
    }

    public boolean getEnableAux() {
        return this.enableAux;
    }

    public String getJsonParams() {
        return this.jsonParams;
    }

    public String getSessionId() {
        return this.sessionId;
    }

    public String getSourceRoute() {
        return this.sourceRoute;
    }

    public LyraxVideoPlatformWrapperConfig(String str, String str2, LyraxVideoContentType lyraxVideoContentType, String str3, int i) {
        this(str, str2, lyraxVideoContentType, str3, false, i);
    }

    public LyraxVideoPlatformWrapperConfig(String str, String str2, LyraxVideoContentType lyraxVideoContentType, String str3, boolean z, int i) {
        this.sessionId = "";
        this.sourceRoute = "";
        this.contentType = LyraxVideoContentType.CAMERA;
        this.jsonParams = "";
        this.errorStrategy = ErrorStrategy.FREEZE;
        this.sessionId = str;
        this.sourceRoute = str2;
        this.contentType = lyraxVideoContentType;
        this.jsonParams = str3;
        this.enableAux = z;
        this.errorStrategy = ErrorStrategy.fromValue(i);
    }
}
