package com.ss.android.ugc.profile.platform.framework.aweme.profile.service;

import X.AbstractC1338480kw2;
import X.AbstractC1585770rMt;
import X.AbstractC19484711Kz;
import X.C11NZ;
import X.C19EG;
import X.C846160XHi;
import X.InterfaceC1054790dYT;
import X.InterfaceC1257430ipJ;
import X.InterfaceC1259570isl;
import X.InterfaceC1259580ism;
import X.InterfaceC1260100itc;
import X.InterfaceC1291910jiv;
import X.InterfaceC683650Qrj;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: loaded from: classes20.dex */
public interface IProfileDependentComponentService {
    InterfaceC1054790dYT adUtilsService();

    <T> T apiExecuteGetJSONObject(int i, String str, Class<T> cls, String str2, C846160XHi c846160XHi, boolean z, String str3);

    <T> T apiExecuteGetJSONObject(String str, Class<T> cls, String str2, boolean z, String str3, Object obj);

    InterfaceC1257430ipJ bridgeService();

    RecyclerView buildBaseRecyclerView(RecyclerView recyclerView, InterfaceC683650Qrj interfaceC683650Qrj, AbstractC1338480kw2 abstractC1338480kw2, boolean z);

    InterfaceC1259580ism favoritesMobUtilsService();

    AbstractC1585770rMt getDiscoverTabProtocol();

    AbstractC1585770rMt getProfileTabProtocol();

    void gotoCropActivity(Activity activity, String str, boolean z, float f, int i, int i2, int i3, int i4, int i5, boolean z2, Bundle bundle, boolean z3);

    void gotoCropActivity(Fragment fragment, String str, boolean z, float f, int i, int i2, int i3, int i4, int i5, Bundle bundle, boolean z2);

    boolean isDetailActivity(Activity activity);

    boolean isUserProfileActivity(Activity activity);

    InterfaceC1259570isl mainAnimViewModel(C19EG c19eg);

    C11NZ<Boolean> needShowDiskManagerGuideView();

    InterfaceC1291910jiv newLiveBlurProcessor(int i, float f, InterfaceC1260100itc interfaceC1260100itc);

    boolean onAntiCrawlerEvent(String str);

    AbstractC19484711Kz<BaseResponse> setPrivateSettingItem(String str, int i);

    boolean shouldUseRecyclerPartialUpdate();

    void startDownloadControlSettingActivity(Activity activity, int i);

    void startHeaderDetailActivity(Activity activity, View view, User user, boolean z);

    void startHeaderDetailActivity(Activity activity, View view, String str, User user);

    void watchLiveMob(Context context, User user, String str, String str2);
}
