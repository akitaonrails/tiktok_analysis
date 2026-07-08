package com.ss.android.ugc.aweme.im.saas.host.api.feature.contact;

import X.C06QG;
import X.C0CO3;
import X.C897640ZJi;
import X.C897740ZJs;
import X.InterfaceC1364105Vn;
import com.ss.android.ugc.aweme.im.common.model.BaseContact;
import com.ss.android.ugc.aweme.im.common.model.IMSaasConversation;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.annotation.Feature;
import java.util.List;
import kotlin.jvm.internal.AFwS281S0000000_34;

/* JADX INFO: loaded from: classes15.dex */
@Feature(id = "contact", name = "Contact")
public interface ContactFeature {
    public static final C06QG LIZ = C06QG.LIZ;

    IMUser LJ(String str, String str2);

    Boolean LJFF(BaseContact baseContact);

    Integer LJI(String str);

    void LJII(String str, C897740ZJs c897740ZJs);

    Integer LJIIIIZZ(BaseContact baseContact);

    String LJIIIZ(BaseContact baseContact);

    IMUser LJIIJ(String str);

    Object LJIIJJI(String str, InterfaceC1364105Vn interfaceC1364105Vn);

    void LJIIL(AFwS281S0000000_34 aFwS281S0000000_34);

    C0CO3 LJIILIIL();

    Object LJIILJJIL(BaseContact baseContact, C897640ZJi c897640ZJi);

    Integer LJIILL(BaseContact baseContact);

    IMSaasConversation LJIILLIIL(BaseContact baseContact);

    Object LJIIZILJ(List list, C897640ZJi c897640ZJi, boolean z, boolean z2, boolean z3);

    IMUser LJIJ(String str);
}
