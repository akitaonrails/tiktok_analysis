package com.bytedance.android.livesdkapi.host.dummy;

import X.InterfaceC1364105Vn;
import X.InterfaceC20630715o9;
import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.host.IHostBridge;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveHostBridgeDummy implements IHostBridge {
    @Override // com.bytedance.android.livesdkapi.host.IHostBridge
    public final void clearCameraFilterCache() {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostBridge
    public final void clearFontEffectPlatformCache() {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostBridge
    public final void clearOpenLiveMultiTabPageParams() {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostBridge
    public final void clearSearchCache() {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostBridge
    public final boolean currentPageIsLiveHost() {
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostBridge
    public final boolean enableGotoPreviewOpt() {
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostBridge
    public final void forceRefreshPodcast() {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostBridge
    public final void initC2PASdk() {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostBridge
    public final boolean isLiveRootPage(Object obj) {
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostBridge
    public final boolean isSAAActivity(Activity activity) {
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostBridge
    public final boolean liveInSaaStack() {
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostBridge
    public final void prepareSearchCache() {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostBridge
    public final void queryRelationSearchList(int i, String str, String str2, Function1<? super List<? extends User>, Unit> function1, Function1<? super Throwable, Unit> function12) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostBridge
    public final void reportDFEvent(String str, String str2) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostBridge
    public final boolean requireCanDestroySAFScene(InterfaceC20630715o9 interfaceC20630715o9) {
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostBridge
    public final boolean requireHostSingleActivityEnable() {
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostBridge
    public final int requireHostTheme() {
        return 0;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostBridge
    public final void saveOpenLiveMultiTabPageParamsOnce() {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostBridge
    public final void startDowngradeLegoStrategy(String str, LifecycleOwner lifecycleOwner) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostBridge
    public final void startIllegalActivityMethodCallCheck(Fragment fragment) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostBridge
    public final void startIndependentLivePage(Context context) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostBridge
    public final void stopIllegalActivityMethodCallCheck(Fragment fragment) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostBridge
    public final /* bridge */ /* synthetic */ void onInit() {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostBridge
    public final Object hasC2PAAIGCInfoInFile(String str, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return false;
    }
}
