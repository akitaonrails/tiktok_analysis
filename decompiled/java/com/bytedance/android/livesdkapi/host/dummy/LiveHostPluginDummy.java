package com.bytedance.android.livesdkapi.host.dummy;

import X.C0UVR;
import android.content.Context;
import com.bytedance.android.livesdkapi.host.IHostPlugin;
import java.io.File;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveHostPluginDummy implements IHostPlugin {
    @Override // com.bytedance.android.livesdkapi.host.IHostPlugin
    public final boolean checkPluginInstalled(String str) {
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPlugin
    public final boolean checkPluginInstalledV2(String str) {
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPlugin
    public final void forceDeleteDemandPlugin(String str) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPlugin
    public final List<String> getFusedPlugins() {
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPlugin
    public final File getPluginNativeLibrariesFolder(String str) {
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPlugin
    public final void install(C0UVR c0uvr) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPlugin
    public final boolean loadLibrary(int i, Context context, String str, String str2, ClassLoader classLoader) {
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPlugin
    public final boolean needDownloadByteLinkAAB() {
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPlugin
    public final /* bridge */ /* synthetic */ void onInit() {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPlugin
    public final Pair<Boolean, String> splitCompatInstall(Context context) {
        return new Pair<>(Boolean.FALSE, "");
    }
}
