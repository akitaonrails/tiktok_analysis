package com.bytedance.android.livestrategy;

import X.C006A;
import X.C0IEG;
import X.C0J0Q;
import X.C1090000eTG;
import X.EnumC1094630eaj;
import X.InterfaceC1093100eYG;
import com.bytedance.android.livesdk.LiveRoomFragment;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes8.dex */
public interface ILiveFeatureCenterService extends C006A {
    Map<String, C1090000eTG> Du2(String str);

    void Iy(LiveRoomFragment liveRoomFragment);

    InterfaceC1093100eYG Ll(String str, String str2, InterfaceC1093100eYG interfaceC1093100eYG);

    void MG1(C0J0Q c0j0q, String str, String str2);

    void Ng();

    C1090000eTG O3(EnumC1094630eaj enumC1094630eaj, String str, String str2);

    void SW(C0IEG c0ieg);

    void Xu0(C0J0Q c0j0q, String str, Map map);

    void bg(C0J0Q c0j0q, String str, Object obj, String str2, boolean z);

    void nI2(long j, Object obj, String str, String str2);

    void nl0(String str, String str2);

    void sl(String str, String str2, InterfaceC1093100eYG interfaceC1093100eYG);

    void yG0(C0J0Q c0j0q);

    ConcurrentHashMap<String, CopyOnWriteArraySet<InterfaceC1093100eYG>> yT0();

    void zG1(C0J0Q c0j0q, String str, String str2, String str3);

    void zq1(C0J0Q c0j0q, EnumC1094630eaj enumC1094630eaj, String str, Object obj, int i);

    boolean zr0(C0J0Q c0j0q);
}
