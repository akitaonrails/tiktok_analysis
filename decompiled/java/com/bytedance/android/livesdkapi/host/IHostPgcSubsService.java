package com.bytedance.android.livesdkapi.host;

import X.C006A;
import X.C11NZ;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.google.gson.n;

/* JADX INFO: loaded from: classes8.dex */
public interface IHostPgcSubsService extends C006A {
    Fragment getPgcPrivilegePageFragment(String str, String str2, Bundle bundle);

    Fragment getPgcSubOnlySpaceDetailFragment();

    Fragment getPgcSubOnlySpaceFragment();

    Fragment getPgcSubSpaceActivityListFragment();

    C11NZ<n> getPgcSubscribeInfo(boolean z, String str, boolean z2, String str2, int i);

    /* bridge */ /* synthetic */ void onInit();

    boolean openPgcSpotlightPrivilegePopup(Context context, String str, String str2, String str3, boolean z);

    Context wrapWithPgcOverlay(Context context);
}
