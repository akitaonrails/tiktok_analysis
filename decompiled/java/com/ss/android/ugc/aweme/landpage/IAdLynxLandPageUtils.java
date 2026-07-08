package com.ss.android.ugc.aweme.landpage;

import X.C1026310coX;
import X.C19EG;
import X.EnumC1036160d4Q;
import X.InterfaceC1036270d4b;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public interface IAdLynxLandPageUtils {
    boolean LIZ(String str);

    Fragment LIZIZ(Context context, String str, C1026310coX c1026310coX, boolean z, EnumC1036160d4Q enumC1036160d4Q, int i, String str2, boolean z2, InterfaceC1036270d4b interfaceC1036270d4b);

    boolean LIZJ(Aweme aweme);

    boolean LIZLLL(AwemeRawAd awemeRawAd);

    Fragment LJ(C19EG c19eg, Bundle bundle, Aweme aweme, String str, String str2, boolean z);

    String LJFF(C1026310coX c1026310coX, Context context, String str);

    String LJI(AwemeRawAd awemeRawAd, Context context, Boolean bool, Boolean bool2, String str, JSONObject jSONObject, Bundle bundle);

    void LJJIZ();
}
