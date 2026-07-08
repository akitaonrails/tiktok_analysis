package com.ss.android.ugc.tiktok.tuc.service;

import X.AnonymousClass1021;
import X.C07XH;
import X.C101K;
import X.C101N;
import X.C101O;
import X.C101P;
import X.C1219200hpe;
import X.C191774100u;
import X.C191789101j;
import X.C722160SUk;
import X.C722170SUl;
import X.C722180SUm;
import X.C722220SUq;
import X.C722400SVi;
import X.EnumC707150RoX;
import X.InterfaceC722440SVm;
import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.tuc.TUCBannerData;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AwS412S0200000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public interface ITUCBizService {
    C722220SUq LIZ(Context context, Aweme aweme, String str, boolean z, AFwS198S0000000_11 aFwS198S0000000_11);

    C722400SVi LIZIZ(Context context, Aweme aweme, String str);

    C722180SUm LIZJ(Context context, TUCBannerData tUCBannerData, String str, boolean z, AFwS198S0000000_11 aFwS198S0000000_11);

    C101P LIZLLL(Context context, Aweme aweme, String str, AwS412S0200000_11 awS412S0200000_11, AwS555S0100000_11 awS555S0100000_11, AwS412S0200000_11 awS412S0200000_112);

    C722160SUk LJ(Context context, Aweme aweme, String str, AFwS198S0000000_11 aFwS198S0000000_11);

    AnonymousClass1021 LJFF();

    C722170SUl LJI(Context context);

    C101K LJII(Context context, Aweme aweme, Fragment fragment, String str, AwS555S0100000_11 awS555S0100000_11, AwS555S0100000_11 awS555S0100000_112, AwS555S0100000_11 awS555S0100000_113);

    C101N LJIIIIZZ(Activity activity, Aweme aweme, C1219200hpe c1219200hpe, AwS590S0100000_11 awS590S0100000_11);

    C191774100u LJIIIZ();

    InterfaceC722440SVm<? extends C07XH> LJIIJ(Context context, EnumC707150RoX enumC707150RoX, Aweme aweme, String str);

    C191789101j LJIIJJI(Context context, Aweme aweme, String str, AwS555S0100000_11 awS555S0100000_11, AwS555S0100000_11 awS555S0100000_112);

    C101O LJIIL(Context context, Aweme aweme, String str, AFwS198S0000000_11 aFwS198S0000000_11, AwS555S0100000_11 awS555S0100000_11, AwS555S0100000_11 awS555S0100000_112);
}
