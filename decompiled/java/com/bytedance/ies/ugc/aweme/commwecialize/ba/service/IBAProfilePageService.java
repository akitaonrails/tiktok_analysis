package com.bytedance.ies.ugc.aweme.commwecialize.ba.service;

import X.C19EG;
import android.content.Context;
import com.bytedance.ies.ugc.aweme.commwecialize.ba.model.ExpandEmailAndPhone;
import com.ss.android.ugc.aweme.commerce.BizAccountInfo;
import com.ss.android.ugc.aweme.commerce.CouponInfo;
import com.ss.android.ugc.aweme.commerce.LeadsGenModel;
import com.ss.android.ugc.aweme.commercialize.ba.impl.ui.BusinessPageFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes20.dex */
public interface IBAProfilePageService {
    void LIZ(Context context, String str);

    void LIZIZ(Context context, LeadsGenModel leadsGenModel, User user, Aweme aweme);

    void LIZJ();

    void LIZLLL(Context context, Aweme aweme, User user, CouponInfo couponInfo);

    boolean LJ(Context context, int i, String str, Aweme aweme, String str2, String str3, Integer num);

    void LJFF(C19EG c19eg, String str, BizAccountInfo bizAccountInfo);

    void LJI(C19EG c19eg);

    boolean LJII(C19EG c19eg);

    ExpandEmailAndPhone LJIIIIZZ();

    BusinessPageFragment LJIIIZ(Function0 function0, boolean z);

    void LJIIJ(C19EG c19eg);
}
