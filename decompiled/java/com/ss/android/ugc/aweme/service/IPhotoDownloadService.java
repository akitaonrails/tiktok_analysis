package com.ss.android.ugc.aweme.service;

import X.C1374320lrq;
import X.C1374880lsk;
import X.InterfaceC1370310llN;
import android.app.Activity;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;

/* JADX INFO: loaded from: classes22.dex */
public interface IPhotoDownloadService {
    void LIZ();

    void LIZIZ(Activity activity, Integer num, Aweme aweme, C1374880lsk c1374880lsk, C1374320lrq c1374320lrq, String str);

    boolean LIZJ();

    void LIZLLL(int i);

    void LJ();

    void LJFF(SharePackage sharePackage);

    int LJI();

    void LJII();

    Observer<Aweme> LJIIIIZZ();

    boolean LJIIIZ();

    InterfaceC1370310llN LJIIJ(Activity activity, Aweme aweme, String str, String str2, String str3, String str4, String str5, Integer num);

    void LJIIJJI();
}
