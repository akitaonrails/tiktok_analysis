package com.ss.android.ugc.aweme.port.in;

import X.C0WXA;
import X.InterfaceC1364105Vn;
import X.InterfaceC1631620sYq;
import android.app.Activity;
import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.lang.ref.WeakReference;
import kotlin.Unit;

/* JADX INFO: loaded from: classes29.dex */
public interface IReplaceMusicDownloadService {
    void LIZ(Activity activity, String str, String str2, String str3);

    void LIZIZ(Context context, Aweme aweme);

    void LIZJ(WeakReference<InterfaceC1631620sYq<String, Integer, Integer, Unit>> weakReference);

    Object LIZLLL(String str, String str2, InterfaceC1364105Vn<? super C0WXA> interfaceC1364105Vn);

    void LJ(WeakReference<InterfaceC1631620sYq<String, Integer, Integer, Unit>> weakReference);

    void LJFF(int i, long j, Aweme aweme, String str);

    Unit LJI(Aweme aweme);
}
