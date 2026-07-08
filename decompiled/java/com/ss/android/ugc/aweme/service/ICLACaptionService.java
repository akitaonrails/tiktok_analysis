package com.ss.android.ugc.aweme.service;

import X.C19719912Dl;
import X.C19EG;
import X.C20698515z5;
import X.C581750Mrl;
import X.EnumC1390800mIQ;
import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CaptionModel;
import com.ss.android.ugc.aweme.network.CaptionNetworkPartner;

/* JADX INFO: loaded from: classes12.dex */
public interface ICLACaptionService {
    CaptionNetworkPartner LIZ();

    void LIZIZ(C19EG c19eg, Aweme aweme, String str, EnumC1390800mIQ enumC1390800mIQ);

    boolean LIZJ(Aweme aweme);

    void LIZLLL(C20698515z5 c20698515z5, boolean z);

    boolean LJ(Aweme aweme);

    C19719912Dl LJFF();

    void LJI(Context context, String str, EnumC1390800mIQ enumC1390800mIQ, Aweme aweme, boolean z, Long l);

    C19719912Dl LJII();

    void LJIIIIZZ(Aweme aweme);

    C581750Mrl LJIIIZ(Aweme aweme);

    int LJIIJ(Aweme aweme);

    CaptionModel LJIIJJI(Aweme aweme, String str, CaptionModel captionModel);

    void LJIIL(String str, String str2, EnumC1390800mIQ enumC1390800mIQ, C19EG c19eg);

    boolean R2(Aweme aweme);
}
