package com.ss.android.ugc.aweme.im.contacts.impl.serviceimpl;

import X.AbstractC1711506n3;
import X.C069P;
import X.C0I0B;
import X.C0Y8T;
import X.C0Y8Y;
import X.C0YAE;
import X.C0YNP;
import X.C0YSQ;
import X.C0ZDX;
import X.C123100dR;
import X.C1489370orP;
import X.C15438062q;
import X.C2201941BFw;
import X.C461720I8s;
import X.C869590Y9l;
import X.C879390Yef;
import X.C885340YoG;
import X.C894660Z7w;
import X.InterfaceC876950Yaj;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.contacts.api.service.IIMContactUtilService;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class IMContactUtilService implements IIMContactUtilService {
    @Override // com.ss.android.ugc.aweme.im.contacts.api.service.IIMContactUtilService
    public final IMContact LJI(C0Y8T c0y8t) {
        if (c0y8t.getConversationType() == AbstractC1711506n3.LIZ) {
            long jLJII = C0YNP.LJII(c0y8t.getConversationId());
            String strLJIIIIZZ = LJIIIIZZ(c0y8t, C885340YoG.LIZ(c0y8t));
            IMContactApi.LIZ.getClass();
            return C069P.LIZ().LJ().LIZLLL(String.valueOf(jLJII), strLJIIIIZZ, "im_share");
        }
        return LJII(c0y8t);
    }

    @Override // com.ss.android.ugc.aweme.im.contacts.api.service.IIMContactUtilService
    public final IMConversation LJII(C0Y8T c0y8t) {
        IMConversation iMConversation = new IMConversation();
        iMConversation.setConversationType(c0y8t.getConversationType());
        iMConversation.setConversationId(c0y8t.getConversationId());
        iMConversation.setConversationMemberCount(c0y8t.getMemberCount());
        C0Y8Y coreInfo = c0y8t.getCoreInfo();
        String string = null;
        if (coreInfo != null) {
            string = coreInfo.getName();
        }
        if (!Boolean.valueOf(C123100dR.LIZ(string)).booleanValue() || string == null) {
            C0I0B.LJFF.LIZJ();
            string = C894660Z7w.LIZ().getString(2131829002);
        }
        iMConversation.setConversationName(string);
        iMConversation.setConversationAvatar(C879390Yef.LIZIZ(c0y8t));
        iMConversation.setInitialLetter(C1489370orP.LIZ(iMConversation.getDisplayName()));
        List<Long> memberIds = c0y8t.getMemberIds();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(memberIds, 10));
        Iterator<Long> it2 = memberIds.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().toString());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            IMUser.Companion.getClass();
            if (!C2201941BFw.LJFF((String) obj)) {
                arrayList2.add(obj);
            }
        }
        iMConversation.setMemberIdList(arrayList2);
        return iMConversation;
    }

    @Override // com.ss.android.ugc.aweme.im.contacts.api.service.IIMContactUtilService
    public final boolean LJIIIZ(IMUser iMUser) {
        String uid;
        String uid2 = null;
        if (iMUser != null) {
            uid = iMUser.getUid();
        } else {
            uid = null;
        }
        if (uid == null || uid.length() == 0) {
            return false;
        }
        if (iMUser != null) {
            uid2 = iMUser.getUid();
        }
        if (!Intrinsics.LJFF(uid2, C461720I8s.LIZIZ())) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.im.contacts.api.service.IIMContactUtilService
    public final String LJIIJ(String str) {
        if (str != null && str.length() != 0) {
            C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(str);
            return LJIIIIZZ(c0y8tLIZ, C885340YoG.LIZ(c0y8tLIZ));
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.im.contacts.api.service.IIMContactUtilService
    public final IMUser LJIIJJI(C0Y8T c0y8t) {
        if (c0y8t != null && c0y8t.isSingleChat()) {
            long jLJII = C0YNP.LJII(c0y8t.getConversationId());
            String strLJIIIIZZ = LJIIIIZZ(c0y8t, C885340YoG.LIZ(c0y8t));
            IMContactApi.LIZ.getClass();
            return C069P.LIZ().LJ().LIZLLL(String.valueOf(jLJII), strLJIIIIZZ, "im_share");
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.im.contacts.api.service.IIMContactUtilService
    public final String LJIIIIZZ(C0Y8T c0y8t, String str) {
        String secUid;
        String secSender;
        if (c0y8t != null && c0y8t.isSingleChat()) {
            if (str != null && str.length() != 0 && Intrinsics.LJFF(C461720I8s.LIZIZ(), str)) {
                return C461720I8s.LIZ();
            }
            User userLIZLLL = C461720I8s.LIZLLL();
            if (userLIZLLL != null && (secUid = userLIZLLL.getSecUid()) != null) {
                List<C0YAE> singleChatMembers = c0y8t.getSingleChatMembers();
                if (singleChatMembers != null) {
                    for (C0YAE c0yae : singleChatMembers) {
                        String secUid2 = c0yae.getSecUid();
                        if (secUid2 != null && secUid2.length() != 0 && !Intrinsics.LJFF(c0yae.getSecUid(), secUid)) {
                            return c0yae.getSecUid();
                        }
                        String secUid3 = c0yae.getSecUid();
                        if (secUid3 == null || secUid3.length() == 0) {
                            if (str.length() == 0) {
                                IMContactApi.LIZ.getClass();
                                C069P.LIZ().LJ().getClass();
                                new IllegalArgumentException("Null or empty uid and SecUid");
                            }
                        }
                    }
                }
                C869590Y9l lastShowMessage = c0y8t.getLastShowMessage();
                if (lastShowMessage != null && (!C0ZDX.LJJJJIZL(lastShowMessage)) && (secSender = lastShowMessage.getSecSender()) != null && secSender.length() != 0) {
                    return lastShowMessage.getSecSender();
                }
            }
        }
        return null;
    }
}
