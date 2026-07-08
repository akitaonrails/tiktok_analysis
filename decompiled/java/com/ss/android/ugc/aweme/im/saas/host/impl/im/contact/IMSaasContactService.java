package com.ss.android.ugc.aweme.im.saas.host.impl.im.contact;

import X.C069P;
import X.C099R;
import X.C0CO3;
import X.C1528020prk;
import X.C596970NbD;
import X.C897640ZJi;
import X.C897740ZJs;
import X.EnumC1733330vCt;
import X.InterfaceC1364105Vn;
import X.InterfaceC1480505qt;
import X.InterfaceC596980NbE;
import com.ss.android.ugc.aweme.im.common.model.BaseContact;
import com.ss.android.ugc.aweme.im.common.model.IMSaasConversation;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBizInfo;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.contact.ContactFeature;
import java.util.List;
import kotlin.jvm.internal.AFwS281S0000000_34;

/* JADX INFO: loaded from: classes35.dex */
public final class IMSaasContactService implements ContactFeature {
    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.contact.ContactFeature
    public final C0CO3 LJIILIIL() {
        return C0CO3.BOOT_FINISH;
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.contact.ContactFeature
    public final Boolean LJFF(BaseContact baseContact) {
        boolean z;
        if (baseContact instanceof IMUser) {
            IMUser iMUser = (IMUser) baseContact;
            if (!iMUser.isBlock() && !iMUser.isBlocked()) {
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.contact.ContactFeature
    public final Integer LJI(String str) {
        IMUser iMUserLJIJ = LJIJ(str);
        if (!(iMUserLJIJ instanceof IMUser) || iMUserLJIJ == null) {
            return null;
        }
        return Integer.valueOf(iMUserLJIJ.getFollowStatus());
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.contact.ContactFeature
    public final Integer LJIIIIZZ(BaseContact baseContact) {
        if (baseContact instanceof IMUser) {
            return Integer.valueOf(((IMUser) baseContact).getFollowStatus());
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.contact.ContactFeature
    public final String LJIIIZ(BaseContact baseContact) {
        if (baseContact instanceof IMUser) {
            return baseContact.getUid();
        }
        if (baseContact instanceof IMConversation) {
            return ((IMConversation) baseContact).getConversationId();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.contact.ContactFeature
    public final IMUser LJIIJ(String str) {
        IMContactApi.LIZ.getClass();
        return C069P.LIZ().LJ().LIZLLL(str, null, "im_activity_status");
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.contact.ContactFeature
    public final void LJIIL(final AFwS281S0000000_34 aFwS281S0000000_34) {
        C596970NbD c596970NbD = C596970NbD.LIZIZ;
        C1528020prk.LIZ().getClass();
        c596970NbD.LIZ(EnumC1733330vCt.IM_CONTACT_SYNC_UID, new InterfaceC596980NbE() { // from class: X.1BDI
            @Override // X.InterfaceC596980NbE
            public final void LJ(C1525630pnt c1525630pnt) {
                byte[] bArr = c1525630pnt.LIZ;
                if (bArr != null) {
                    aFwS281S0000000_34.invoke(bArr);
                }
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.contact.ContactFeature
    public final Integer LJIILL(BaseContact baseContact) {
        IMUserBizInfo imUserBizInfo;
        if (!(baseContact instanceof IMUser) || (imUserBizInfo = ((IMUser) baseContact).getImUserBizInfo()) == null) {
            return null;
        }
        return imUserBizInfo.getActivityStatusSetting();
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.contact.ContactFeature
    public final IMSaasConversation LJIILLIIL(BaseContact baseContact) {
        if (baseContact instanceof IMConversation) {
            IMSaasConversation iMSaasConversation = new IMSaasConversation();
            IMConversation iMConversation = (IMConversation) baseContact;
            iMSaasConversation.setConversationId(iMConversation.getConversationId());
            iMSaasConversation.setConversationName(iMConversation.getConversationName());
            iMSaasConversation.setConversationAvatar(iMConversation.getConversationAvatar());
            iMSaasConversation.setConversationMemberCount(iMConversation.getConversationMemberCount());
            iMSaasConversation.setConversationType(iMConversation.getConversationType());
            iMSaasConversation.setConversationShortId(iMConversation.getConversationShortId());
            iMSaasConversation.setInitialLetter(iMConversation.getInitialLetter());
            iMSaasConversation.setMemberIdList(iMConversation.getMemberIdList());
            iMSaasConversation.setActive(iMConversation.isActive());
            iMSaasConversation.setAvatarThumb(baseContact.getAvatarThumb());
            iMSaasConversation.setAvatarStr(baseContact.getAvatarStr());
            return iMSaasConversation;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.contact.ContactFeature
    public final IMUser LJIJ(String str) {
        IMContactApi.LIZ.getClass();
        return C069P.LIZ().LJ().LJ(str, null);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.contact.ContactFeature
    public final IMUser LJ(String str, String str2) {
        IMContactApi.LIZ.getClass();
        return C069P.LIZ().LJ().LJIIL(str, null, str2);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.contact.ContactFeature
    public final void LJII(String str, final C897740ZJs c897740ZJs) {
        IMContactApi.LIZ.getClass();
        C069P.LIZ().LJ().LIZJ(new InterfaceC1480505qt() { // from class: X.1BGP
            @Override // X.InterfaceC1480505qt
            public final void LIZJ() {
            }

            @Override // X.InterfaceC1480505qt
            public final void LIZ(Throwable th) {
                C1BGQ c1bgq = c897740ZJs;
                if (c1bgq != null) {
                    c1bgq.LIZ(th);
                }
            }

            @Override // X.InterfaceC1480505qt
            public final void LIZIZ(IMUser iMUser) {
                C1BGQ c1bgq = c897740ZJs;
                if (c1bgq != null) {
                    c1bgq.LIZIZ(iMUser);
                }
            }
        }, str, null, "im_avatar", true);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.contact.ContactFeature
    public final Object LJIIJJI(String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        IMContactApi.LIZ.getClass();
        return C069P.LIZ().LJ().LJIJ(str, null, interfaceC1364105Vn);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.contact.ContactFeature
    public final Object LJIILJJIL(BaseContact baseContact, C897640ZJi c897640ZJi) {
        if (baseContact instanceof IMUser) {
            IMContactApi.LIZ.getClass();
            Object objLJIILJJIL = C069P.LIZ().LJ().LJIILJJIL((IMUser) baseContact, c897640ZJi);
            if (objLJIILJJIL == C099R.LJFF()) {
                return objLJIILJJIL;
            }
            return objLJIILJJIL;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.contact.ContactFeature
    public final Object LJIIZILJ(List list, C897640ZJi c897640ZJi, boolean z, boolean z2, boolean z3) {
        IMContactApi.LIZ.getClass();
        return C069P.LIZ().LJ().LJIILIIL("im_activity_status", list, c897640ZJi, z, z2, z3);
    }
}
