package com.ss.android.ugc.aweme.services.edit;

import X.C15O7;
import X.C19EG;
import X.C2344009Gk;
import X.InterfaceC20660715sz;
import android.content.Context;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes29.dex */
public interface IReplaceMusicService {
    void dismissCopyrightViolationSnackBar();

    void doReeditRequest(Context context, StripMusicRequest stripMusicRequest, boolean z);

    void doReeditRequestV2(Context context, StripMusicRequest stripMusicRequest);

    void doRequest(String str, ReplaceMusicRequest replaceMusicRequest, C19EG c19eg);

    void doRequest(String str, ReplaceMusicRequest replaceMusicRequest, C19EG c19eg, PromoteReplaceMusicRequest promoteReplaceMusicRequest);

    boolean getClickPost();

    String getCover();

    String getMuteReason();

    String getReplaceMusicContentType();

    ReplaceMusicRequest getReplaceMusicRequest();

    StripMusicRequest getReplaceMusicWithStrippedSoundRequest();

    long getReplaceStartTime();

    int getSimilarTag();

    String getSource();

    C2344009Gk getStripMusicPostMobParams();

    StripMusicRequest getStripMusicRequest();

    StripMusicPostType getStripPostClicked();

    boolean getUploadingStatus();

    int isLongVideo();

    void mobProfileTabClientClick(String str, int i, int i2, String str2, String str3, String str4, String str5);

    void mobProfileTabClientShow(String str, int i, int i2, String str2, String str3, String str4, String str5, String str6);

    C15O7<Integer> replaceDirectInPromoteScene(PromoteReplaceMusicRequest promoteReplaceMusicRequest);

    void retryInPromoteScene(PromoteReplaceMusicRequest promoteReplaceMusicRequest);

    void setClickPost(boolean z);

    void setCover(String str);

    void setLongVideo(int i);

    void setMuteReason(String str);

    void setReplaceMusicContentType(String str);

    void setReplaceMusicRequest(ReplaceMusicRequest replaceMusicRequest);

    void setReplaceMusicWithStrippedSoundRequest(StripMusicRequest stripMusicRequest);

    void setReplaceStartTime(long j);

    void setSimilarTag(int i);

    void setSource(String str);

    void setStripMusicPostMobParams(C2344009Gk c2344009Gk);

    void setStripMusicRequest(StripMusicRequest stripMusicRequest);

    void setStripPostClicked(StripMusicPostType stripMusicPostType);

    void setUploadingStatus(boolean z);

    boolean shouldShowCopyrightViolationSnackBar(Aweme aweme);

    void showCopyrightViolationSnackBar(ViewGroup viewGroup, InterfaceC20660715sz interfaceC20660715sz, Aweme aweme);

    void showMusicStripResult(boolean z, StripMusicRequest stripMusicRequest, boolean z2);

    void showMusicStripResult(boolean z, JSONObject jSONObject);

    void showWindow(JSONObject jSONObject, boolean z);

    void showWindow(boolean z, String str, ReplaceMusicRequest replaceMusicRequest);
}
