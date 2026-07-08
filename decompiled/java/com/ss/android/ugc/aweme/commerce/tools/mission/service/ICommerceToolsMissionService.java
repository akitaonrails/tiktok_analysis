package com.ss.android.ugc.aweme.commerce.tools.mission.service;

import X.C1638580sk4;
import X.C19EG;
import X.C1DRG;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: loaded from: classes26.dex */
public interface ICommerceToolsMissionService {
    void LIZ(String str, int i, VideoPublishEditModel videoPublishEditModel, String str2, String str3, C19EG c19eg);

    void LIZIZ(ShortVideoContext shortVideoContext, C19EG c19eg);

    void LIZJ(int i, VideoPublishEditModel videoPublishEditModel, String str);

    void LIZLLL(Intent intent);

    void LJ(Intent intent);

    C1638580sk4 LJFF(C1DRG c1drg);

    boolean LJI(String str);

    boolean LJII(Activity activity, Uri uri);

    void LJIIIIZZ(VideoPublishEditModel videoPublishEditModel, String str);

    void LJIIIZ(ShortVideoContext shortVideoContext, C19EG c19eg);

    void LJIIJ(Intent intent, Intent intent2, String str, String str2);

    void LJIIJJI(C19EG c19eg, ShortVideoContext shortVideoContext, String str);

    boolean LJIIL(Intent intent);

    void LJIILIIL(int i, int i2, VideoPublishEditModel videoPublishEditModel, String str, String str2);

    void LJIILJJIL(ShortVideoContext shortVideoContext, Activity activity);

    void LJIILL(Activity activity, VideoPublishEditModel videoPublishEditModel);
}
