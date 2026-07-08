package com.bytedance.android.livesdkapi.host.dummy;

import X.C11NZ;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdkapi.host.IHostPgcSubsService;
import com.google.gson.n;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveHostPgcSubsServiceDummy implements IHostPgcSubsService {
    @Override // com.bytedance.android.livesdkapi.host.IHostPgcSubsService
    public final Fragment getPgcPrivilegePageFragment(String str, String str2, Bundle bundle) {
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPgcSubsService
    public final Fragment getPgcSubOnlySpaceDetailFragment() {
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPgcSubsService
    public final Fragment getPgcSubOnlySpaceFragment() {
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPgcSubsService
    public final Fragment getPgcSubSpaceActivityListFragment() {
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPgcSubsService
    public final C11NZ<n> getPgcSubscribeInfo(boolean z, String str, boolean z2, String str2, int i) {
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPgcSubsService
    public final boolean openPgcSpotlightPrivilegePopup(Context context, String str, String str2, String str3, boolean z) {
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPgcSubsService
    public final Context wrapWithPgcOverlay(Context context) {
        return context;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPgcSubsService
    public final /* bridge */ /* synthetic */ void onInit() {
    }
}
