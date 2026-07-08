package com.bytedance.android.livesdkapi.host;

import X.C006A;
import X.C0UVR;
import X.C773050UUd;
import android.content.Context;
import java.io.File;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes13.dex */
public interface IHostPlugin extends C006A {
    public static final C773050UUd Companion = C773050UUd.LIZ;

    boolean checkPluginInstalled(String str);

    boolean checkPluginInstalledV2(String str);

    void forceDeleteDemandPlugin(String str);

    List<String> getFusedPlugins();

    File getPluginNativeLibrariesFolder(String str);

    void install(C0UVR c0uvr);

    boolean loadLibrary(int i, Context context, String str, String str2, ClassLoader classLoader);

    boolean needDownloadByteLinkAAB();

    /* bridge */ /* synthetic */ void onInit();

    Pair<Boolean, String> splitCompatInstall(Context context);
}
