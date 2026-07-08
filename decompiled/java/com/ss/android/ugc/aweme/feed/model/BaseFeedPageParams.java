package com.ss.android.ugc.aweme.feed.model;

import X.C2188811AlT;
import X.C2189821An6;
import X.InterfaceC1482650ogZ;

/* JADX INFO: loaded from: classes12.dex */
public final class BaseFeedPageParams {
    public static final Companion Companion = new Companion();
    public int awemeFromPage;
    public String challengeId;
    public String cid;
    public String eventType;
    public boolean isFromPostList;
    public boolean isMyProfile;
    public int pageType;
    public InterfaceC1482650ogZ surfaceHolder;
    public int videoHeight;
    public int videoWidth;
    public boolean isOriginalCaption = true;
    public C2189821An6 param = new C2189821An6();
    public boolean hasUsePreCreateSurface = true;

    public static final class Companion {
        public final BaseFeedPageParams newBuilder() {
            return new BaseFeedPageParams();
        }
    }

    public static /* synthetic */ void getAwemeFromPage$annotations() {
    }

    public static final BaseFeedPageParams newBuilder() {
        return Companion.newBuilder();
    }

    public final String getFromGroupId() {
        C2189821An6 c2189821An6 = this.param;
        if (c2189821An6 != null) {
            return c2189821An6.getFromGroupId();
        }
        return null;
    }

    public final String getPreviousPage() {
        C2189821An6 c2189821An6 = this.param;
        if (c2189821An6 != null) {
            return c2189821An6.getPreviousPage();
        }
        return null;
    }

    public final String getPreviousPagePosition() {
        C2189821An6 c2189821An6 = this.param;
        if (c2189821An6 != null) {
            return c2189821An6.getPreviousPagePosition();
        }
        return null;
    }

    public final boolean isPlayListCleanMode() {
        C2189821An6 c2189821An6 = this.param;
        if (c2189821An6 != null) {
            return c2189821An6.isPlaylistCleanMode();
        }
        return false;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BaseFeedPageParams{awemeFromPage=");
        sbLIZ.append(this.awemeFromPage);
        sbLIZ.append(", eventType='");
        sbLIZ.append(this.eventType);
        sbLIZ.append("', isMyProfile=");
        sbLIZ.append(this.isMyProfile);
        sbLIZ.append(", isFromPostList=");
        sbLIZ.append(this.isFromPostList);
        sbLIZ.append(", pageType=");
        sbLIZ.append(this.pageType);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int getAwemeFromPage() {
        return this.awemeFromPage;
    }

    public final String getChallengeId() {
        return this.challengeId;
    }

    public final String getCid() {
        return this.cid;
    }

    public final String getEventType() {
        return this.eventType;
    }

    public final boolean getHasUsePreCreateSurface() {
        return this.hasUsePreCreateSurface;
    }

    public final int getPageType() {
        return this.pageType;
    }

    public final C2189821An6 getParam() {
        return this.param;
    }

    public final InterfaceC1482650ogZ getSurfaceHolder() {
        return this.surfaceHolder;
    }

    public final int getVideoHeight() {
        return this.videoHeight;
    }

    public final int getVideoWidth() {
        return this.videoWidth;
    }

    public final boolean isFromPostList() {
        return this.isFromPostList;
    }

    public final boolean isMyProfile() {
        return this.isMyProfile;
    }

    public final boolean isOriginalCaption() {
        return this.isOriginalCaption;
    }

    public final BaseFeedPageParams setAwemeFromPage(int i) {
        this.awemeFromPage = i;
        return this;
    }

    public final BaseFeedPageParams setChallengeId(String str) {
        this.challengeId = str;
        return this;
    }

    public final BaseFeedPageParams setCid(String str) {
        this.cid = str;
        return this;
    }

    public final BaseFeedPageParams setEventType(String str) {
        this.eventType = str;
        return this;
    }

    public final BaseFeedPageParams setFromPostList(boolean z) {
        this.isFromPostList = z;
        return this;
    }

    public final void setHasUsePreCreateSurface(boolean z) {
        this.hasUsePreCreateSurface = z;
    }

    public final BaseFeedPageParams setIsOriginalCaption(boolean z) {
        this.isOriginalCaption = z;
        return this;
    }

    public final BaseFeedPageParams setMyProfile(boolean z) {
        this.isMyProfile = z;
        return this;
    }

    public final BaseFeedPageParams setPageType(int i) {
        this.pageType = i;
        return this;
    }

    public final BaseFeedPageParams setParam(C2189821An6 c2189821An6) {
        this.param = c2189821An6;
        return this;
    }

    public final void setSurfaceHolder(InterfaceC1482650ogZ interfaceC1482650ogZ) {
        this.surfaceHolder = interfaceC1482650ogZ;
    }

    public final void setVideoHeight(int i) {
        this.videoHeight = i;
    }

    public final void setVideoWidth(int i) {
        this.videoWidth = i;
    }
}
