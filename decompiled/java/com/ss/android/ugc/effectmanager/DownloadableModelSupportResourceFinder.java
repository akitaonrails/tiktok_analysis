package com.ss.android.ugc.effectmanager;

import X.C13Q5;
import com.bef.effectsdk.ResourceFinder;

/* JADX INFO: loaded from: classes31.dex */
public class DownloadableModelSupportResourceFinder implements ResourceFinder {
    @Override // com.bef.effectsdk.ResourceFinder
    public void release(long j) {
    }

    @Override // com.bef.effectsdk.ResourceFinder
    public long createNativeMD5ResourceFinder(long j) {
        return C13Q5.LIZ().LIZLLL().createNativeMD5ResourceFinder(j);
    }

    @Override // com.bef.effectsdk.ResourceFinder
    public long createNativeResourceFinder(long j) {
        return C13Q5.LIZ().LIZLLL().createNativeResourceFinder(j);
    }

    public static String findResourceUri(String str, String str2) {
        return C13Q5.LIZ().LIZLLL().realFindResourceUri(0, str, str2);
    }
}
