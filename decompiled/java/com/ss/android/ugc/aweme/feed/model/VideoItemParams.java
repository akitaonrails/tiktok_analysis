package com.ss.android.ugc.aweme.feed.model;

import X.C0OB8;
import X.C0R5I;
import X.C0R7E;
import X.C0SIV;
import X.C1AF0;
import X.C1EE2;
import X.C2189821An6;
import X.InterfaceC1021920chS;
import X.InterfaceC689860R4e;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class VideoItemParams implements C0OB8 {
    public String adapterType;
    public BaseFeedPageParams baseFeedPageParams;
    public C0R5I commodityCard;
    public C0R7E component;
    public int currentPosition;
    public DataCenter dataCenter;
    public Fragment fragment;
    public boolean fromInnerBind;
    public int isEnterGraphicDetail;
    public boolean isFromPostList;
    public boolean isMyProfile;
    public InterfaceC1021920chS mAdOpenCallBack;
    public Aweme mAweme;
    public int mAwemeFromPage;
    public volatile String mEnterMethodValue;
    public volatile String mEventType;
    public String mFrom;
    public volatile int mPageType;
    public volatile JSONObject mRequestId;
    public Aweme mWidgetAweme;
    public int storyPosition;
    public String trackerData;
    public C0SIV videoCellDescAbility;
    public String fromTab = "HOME";
    public String toTab = "HOME";

    public static VideoItemParams newBuilder() {
        return new VideoItemParams();
    }

    public InterfaceC1021920chS getAdOpenCallBack() {
        return this.mAdOpenCallBack;
    }

    public String getAdapterType() {
        return this.adapterType;
    }

    @Override // X.C0OB8
    public Aweme getAweme() {
        return this.mAweme;
    }

    public int getAwemeFromPage() {
        return this.mAwemeFromPage;
    }

    public BaseFeedPageParams getBaseFeedParams() {
        return this.baseFeedPageParams;
    }

    public C0R5I getCommodityCard() {
        return this.commodityCard;
    }

    public C0R7E getComponent() {
        return this.component;
    }

    public int getCurrentPosition() {
        return this.currentPosition;
    }

    public DataCenter getDataCenter() {
        return this.dataCenter;
    }

    public String getEnterMethodValue() {
        return this.mEnterMethodValue;
    }

    public String getEventType() {
        return this.mEventType;
    }

    public Fragment getFragment() {
        return this.fragment;
    }

    public String getFrom() {
        return this.mFrom;
    }

    public String getFromTab() {
        return this.fromTab;
    }

    public int getIsEnterGraphicDetail() {
        return this.isEnterGraphicDetail;
    }

    public int getPageType() {
        return this.mPageType;
    }

    public JSONObject getRequestId() {
        return this.mRequestId;
    }

    public int getStoryPosition() {
        return this.storyPosition;
    }

    public String getToTab() {
        return this.toTab;
    }

    public String getTrackerData() {
        return this.trackerData;
    }

    public C0SIV getVideoCellDescAbility() {
        return this.videoCellDescAbility;
    }

    public Aweme getWidgetAweme() {
        return this.mWidgetAweme;
    }

    public boolean isFromInnerBind() {
        return this.fromInnerBind;
    }

    public boolean isFromPostList() {
        return this.isFromPostList;
    }

    public boolean isMyProfile() {
        return this.isMyProfile;
    }

    public VideoItemParams setAdOpenCallBack(InterfaceC1021920chS interfaceC1021920chS) {
        this.mAdOpenCallBack = interfaceC1021920chS;
        return this;
    }

    public void setAdapterType(String str) {
        this.adapterType = str;
    }

    public void setAweme(Aweme aweme) {
        this.mAweme = aweme;
    }

    public VideoItemParams setAwemeFromPage(int i) {
        this.mAwemeFromPage = i;
        return this;
    }

    public VideoItemParams setBaseFeedParams(BaseFeedPageParams baseFeedPageParams) {
        this.baseFeedPageParams = baseFeedPageParams;
        return this;
    }

    public VideoItemParams setCommodityCard(C0R5I c0r5i) {
        this.commodityCard = c0r5i;
        return this;
    }

    public VideoItemParams setComponent(C0R7E c0r7e) {
        this.component = c0r7e;
        return this;
    }

    public void setCurrentPosition(int i) {
        this.currentPosition = i;
    }

    public VideoItemParams setDataCenter(DataCenter dataCenter) {
        this.dataCenter = dataCenter;
        return this;
    }

    public VideoItemParams setEnterMethodValue(String str) {
        this.mEnterMethodValue = str;
        return this;
    }

    public VideoItemParams setEventType(String str) {
        this.mEventType = str;
        return this;
    }

    public VideoItemParams setFragment(Fragment fragment) {
        this.fragment = fragment;
        return this;
    }

    public VideoItemParams setFrom(String str) {
        this.mFrom = str;
        return this;
    }

    public VideoItemParams setFromInnerBind(boolean z) {
        this.fromInnerBind = z;
        return this;
    }

    public VideoItemParams setFromPostList(boolean z) {
        this.isFromPostList = z;
        return this;
    }

    public VideoItemParams setFromTab(String str) {
        this.fromTab = str;
        return this;
    }

    public VideoItemParams setIsEnterGraphicDetail(int i) {
        if (!C1EE2.LIZIZ.LIZLLL()) {
            i = 0;
        }
        this.isEnterGraphicDetail = i;
        return this;
    }

    public VideoItemParams setMyProfile(boolean z) {
        this.isMyProfile = z;
        return this;
    }

    public VideoItemParams setPageType(int i) {
        this.mPageType = i;
        return this;
    }

    public VideoItemParams setRequestId(JSONObject jSONObject) {
        this.mRequestId = jSONObject;
        return this;
    }

    public void setStoryPosition(int i) {
        this.storyPosition = i;
    }

    public VideoItemParams setToTab(String str) {
        this.toTab = str;
        return this;
    }

    public void setTrackerData(String str) {
        this.trackerData = str;
    }

    public VideoItemParams setVideoCellDescAbility(C0SIV c0siv) {
        this.videoCellDescAbility = c0siv;
        return this;
    }

    public VideoItemParams setwidgetAweme(Aweme aweme) {
        this.mWidgetAweme = aweme;
        return this;
    }

    public static VideoItemParams newBuilder(BaseFeedPageParams baseFeedPageParams, InterfaceC689860R4e interfaceC689860R4e, C0R7E c0r7e, Fragment fragment, String str, DataCenter dataCenter, C0SIV c0siv, C0R5I c0r5i) {
        VideoItemParams videoItemParams = new VideoItemParams();
        videoItemParams.setEventType(baseFeedPageParams.eventType);
        videoItemParams.setMyProfile(baseFeedPageParams.isMyProfile);
        videoItemParams.setPageType(baseFeedPageParams.pageType);
        videoItemParams.setFromPostList(baseFeedPageParams.isFromPostList);
        videoItemParams.setFragment(fragment);
        videoItemParams.setEnterMethodValue(str);
        videoItemParams.setDataCenter(dataCenter);
        videoItemParams.setComponent(c0r7e);
        videoItemParams.setBaseFeedParams(baseFeedPageParams);
        videoItemParams.setVideoCellDescAbility(c0siv);
        videoItemParams.setFrom(baseFeedPageParams.param.getFrom());
        videoItemParams.setCommodityCard(c0r5i);
        videoItemParams.setAwemeFromPage(baseFeedPageParams.awemeFromPage);
        if (baseFeedPageParams.eventType == null) {
            C1AF0.LIZJ("event type null ");
        }
        C2189821An6 c2189821An6 = baseFeedPageParams.param;
        if (c2189821An6 != null) {
            videoItemParams.trackerData = c2189821An6.getTracker();
        }
        if (interfaceC689860R4e != null) {
            videoItemParams.setAdOpenCallBack(interfaceC689860R4e.LLIIIJ());
        }
        return videoItemParams;
    }
}
