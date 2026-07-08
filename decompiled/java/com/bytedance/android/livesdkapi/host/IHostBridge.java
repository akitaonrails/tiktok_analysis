package com.bytedance.android.livesdkapi.host;

import X.C006A;
import X.InterfaceC1364105Vn;
import X.InterfaceC20630715o9;
import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public interface IHostBridge extends C006A {
    void clearCameraFilterCache();

    void clearFontEffectPlatformCache();

    void clearOpenLiveMultiTabPageParams();

    void clearSearchCache();

    boolean currentPageIsLiveHost();

    boolean enableGotoPreviewOpt();

    void forceRefreshPodcast();

    Object hasC2PAAIGCInfoInFile(String str, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn);

    void initC2PASdk();

    boolean isLiveRootPage(Object obj);

    boolean isSAAActivity(Activity activity);

    boolean liveInSaaStack();

    /* bridge */ /* synthetic */ void onInit();

    void prepareSearchCache();

    void queryRelationSearchList(int i, String str, String str2, Function1<? super List<? extends User>, Unit> function1, Function1<? super Throwable, Unit> function12);

    void reportDFEvent(String str, String str2);

    boolean requireCanDestroySAFScene(InterfaceC20630715o9 interfaceC20630715o9);

    boolean requireHostSingleActivityEnable();

    int requireHostTheme();

    void saveOpenLiveMultiTabPageParamsOnce();

    void startDowngradeLegoStrategy(String str, LifecycleOwner lifecycleOwner);

    void startIllegalActivityMethodCallCheck(Fragment fragment);

    void startIndependentLivePage(Context context);

    void stopIllegalActivityMethodCallCheck(Fragment fragment);
}
