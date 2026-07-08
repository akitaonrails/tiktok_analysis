package com.ss.android.ugc.aweme.tools.music.aichoosemusic;

import X.AbstractC2289508y5;
import X.C11PQ;
import X.C19475711Hn;
import com.ss.android.ugc.aweme.music.understanding.IAIMusicUploadFrameZipPathProvider;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class UploadFrameZipPathProviderImpl implements IAIMusicUploadFrameZipPathProvider {
    @Override // com.ss.android.ugc.aweme.music.understanding.IAIMusicUploadFrameZipPathProvider
    public final C19475711Hn LIZ(String str) {
        C11PQ<String> c11pqPutIfAbsent;
        ConcurrentHashMap<String, C11PQ<String>> concurrentHashMap = AbstractC2289508y5.LJIL;
        if (str == null) {
            str = "";
        }
        C11PQ<String> c11pq = concurrentHashMap.get(str);
        if (c11pq == null && (c11pqPutIfAbsent = concurrentHashMap.putIfAbsent(str, (c11pq = new C11PQ<>()))) != null) {
            c11pq = c11pqPutIfAbsent;
        }
        return new C19475711Hn(c11pq);
    }
}
