package com.ss.android.ugc.aweme.feed.assem.base;

import X.C0R9N;
import X.C2189821An6;
import X.InterfaceC0148002o;
import X.InterfaceC1294060jmO;
import X.InterfaceC738070SxJ;
import androidx.fragment.app.Fragment;
import com.bytedance.ext_power_list.AssemViewModelWithItem;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public abstract class FeedBaseViewModel<S extends InterfaceC0148002o> extends AssemViewModelWithItem<S, VideoItemParams> implements InterfaceC738070SxJ<S, VideoItemParams> {
    public static final int $stable = 8;
    public int awemeFromPage;
    public String enterMethodValue;
    public String eventType;
    public C2189821An6 feedParams;
    public Fragment fragment;
    public boolean isMyProfile;
    public int pageType;
    public C0R9N rebind;
    public JSONObject requestId;

    public S paramSync2StateAccept(S s, VideoItemParams videoItemParams) {
        return s;
    }

    @InterfaceC1294060jmO
    public VideoItemParams state2ItemAccept(S s, VideoItemParams videoItemParams) {
        return videoItemParams;
    }

    public final boolean isRebind() {
        return this.rebind != null;
    }

    public final int getAwemeFromPage() {
        return this.awemeFromPage;
    }

    public final String getEnterMethodValue() {
        return this.enterMethodValue;
    }

    public final String getEventType() {
        return this.eventType;
    }

    public final C2189821An6 getFeedParams() {
        return this.feedParams;
    }

    public final Fragment getFragment() {
        return this.fragment;
    }

    public final int getPageType() {
        return this.pageType;
    }

    public final C0R9N getRebind() {
        return this.rebind;
    }

    public final JSONObject getRequestId() {
        return this.requestId;
    }

    public final boolean isMyProfile() {
        return this.isMyProfile;
    }

    public void initParams(VideoItemParams videoItemParams) {
        C2189821An6 c2189821An6;
        if (videoItemParams == null) {
            return;
        }
        this.pageType = videoItemParams.mPageType;
        this.eventType = videoItemParams.mEventType;
        this.requestId = videoItemParams.mRequestId;
        this.isMyProfile = videoItemParams.isMyProfile;
        this.enterMethodValue = videoItemParams.mEnterMethodValue;
        this.fragment = videoItemParams.fragment;
        this.awemeFromPage = videoItemParams.mAwemeFromPage;
        BaseFeedPageParams baseFeedPageParams = videoItemParams.baseFeedPageParams;
        if (baseFeedPageParams != null) {
            c2189821An6 = baseFeedPageParams.param;
        } else {
            c2189821An6 = null;
        }
        this.feedParams = c2189821An6;
    }

    public final void setAwemeFromPage(int i) {
        this.awemeFromPage = i;
    }

    public final void setEnterMethodValue(String str) {
        this.enterMethodValue = str;
    }

    public final void setEventType(String str) {
        this.eventType = str;
    }

    public final void setFeedParams(C2189821An6 c2189821An6) {
        this.feedParams = c2189821An6;
    }

    public final void setFragment(Fragment fragment) {
        this.fragment = fragment;
    }

    public final void setMyProfile(boolean z) {
        this.isMyProfile = z;
    }

    public final void setPageType(int i) {
        this.pageType = i;
    }

    public final void setRequestId(JSONObject jSONObject) {
        this.requestId = jSONObject;
    }

    public final S itemSync2StateAccept(S s, VideoItemParams videoItemParams) {
        return (S) itemSync2StateAccept2((InterfaceC0148002o) s, videoItemParams, (List<? extends Object>) null);
    }

    public /* bridge */ /* synthetic */ Object state2ItemAccept(InterfaceC0148002o interfaceC0148002o, Object obj) {
        VideoItemParams videoItemParams = (VideoItemParams) obj;
        state2ItemAccept(interfaceC0148002o, videoItemParams);
        return videoItemParams;
    }

    /* JADX INFO: renamed from: itemSync2StateAccept, reason: avoid collision after fix types in other method */
    public final S itemSync2StateAccept2(S s, VideoItemParams videoItemParams, List<? extends Object> list) {
        C0R9N c0r9n;
        initParams(videoItemParams);
        if (list != null) {
            for (Object obj : list) {
                if (obj instanceof C0R9N) {
                    c0r9n = (C0R9N) obj;
                    break;
                }
            }
            c0r9n = null;
        } else {
            c0r9n = null;
        }
        this.rebind = c0r9n;
        return (S) paramSync2StateAccept(s, videoItemParams);
    }

    @Override // X.InterfaceC738070SxJ
    public /* bridge */ /* synthetic */ InterfaceC0148002o itemSync2StateAccept(InterfaceC0148002o interfaceC0148002o, VideoItemParams videoItemParams, List list) {
        return itemSync2StateAccept2(interfaceC0148002o, videoItemParams, (List<? extends Object>) list);
    }
}
