package com.ss.android.ugc.aweme.im.saas.host.api.feature.socialavatar;

import X.C06QS;
import X.C1605770rt9;
import X.C19EG;
import X.C427870Gq9;
import X.EnumC1606080rte;
import X.InterfaceC1364105Vn;
import X.InterfaceC1398730mVD;
import X.InterfaceC427850Gq7;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.annotation.Feature;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: loaded from: classes7.dex */
@Feature(id = "social_avatar", name = "Social Avatar")
public interface SocialAvatarFeature {
    public static final C06QS LIZ = C06QS.LIZ;

    InterfaceC1398730mVD LIZ(C1605770rt9 c1605770rt9);

    boolean LIZIZ();

    Object LIZJ(String str, InterfaceC1364105Vn<? super String> interfaceC1364105Vn);

    boolean LIZLLL();

    boolean LJ();

    void LJFF(int i, C427870Gq9 c427870Gq9, InterfaceC427850Gq7 interfaceC427850Gq7);

    String LJI(String str);

    boolean LJII(User user);

    boolean LJIIIIZZ();

    float LJIIIZ(EnumC1606080rte enumC1606080rte);

    void LJIIJ(C19EG c19eg);

    int LJIIJJI(User user, Integer num);

    boolean LJIIL(User user);
}
