package com.ss.android.ugc.aweme.im.sharepanel.impl.share.controller.helper;

import X.C0YNP;
import X.C19719512Dh;
import X.C2095008Iq;
import X.C849230XTd;
import X.C869590Y9l;
import X.C896550ZFd;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.service.service.IShareStateHelper;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class ShareStateHelper implements IShareStateHelper {
    public static C896550ZFd LIZIZ;
    public static final ShareStateHelper LIZ = new ShareStateHelper();
    public static final Map<String, C896550ZFd> LIZJ = new LinkedHashMap();

    public static final class Service implements IShareStateHelper {
        public final /* synthetic */ ShareStateHelper LIZ = ShareStateHelper.LIZ;

        @Override // com.ss.android.ugc.aweme.im.service.service.IShareStateHelper
        public final void LIZ(C869590Y9l c869590Y9l) {
            this.LIZ.LIZ(c869590Y9l);
        }
    }

    public static void LIZIZ(C869590Y9l c869590Y9l) {
        C896550ZFd c896550ZFd;
        Boolean boolRemove;
        boolean z;
        Boolean boolRemove2;
        boolean z2;
        String str = null;
        if (!TextUtils.isEmpty(c869590Y9l.getLocalExtValue("process_id"))) {
            C896550ZFd c896550ZFd2 = (C896550ZFd) ((LinkedHashMap) LIZJ).get(c869590Y9l.getLocalExtValue("process_id"));
            if (c896550ZFd2 != null && Intrinsics.LJFF(c896550ZFd2.LIZ, "aweme") && (c869590Y9l.getMsgType() == 8 || c869590Y9l.getMsgType() == 11)) {
                if (c896550ZFd2.LIZIZ.containsKey(c869590Y9l.getConversationId()) && (boolRemove2 = c896550ZFd2.LIZIZ.remove(c869590Y9l.getConversationId())) != null) {
                    boolRemove2.booleanValue();
                    long jLJII = C0YNP.LJII(c869590Y9l.getConversationId());
                    C849230XTd.LIZIZ(c896550ZFd2.LIZJ, c869590Y9l.getConversationId(), jLJII);
                    if (c869590Y9l.getMsgStatus() == 2) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    C849230XTd.LIZ(c896550ZFd2.LIZJ, c869590Y9l.getConversationId(), jLJII, z2, c869590Y9l.getLocalExt().get("s:err_code"));
                    return;
                }
                return;
            }
        }
        C896550ZFd c896550ZFd3 = LIZIZ;
        if (c896550ZFd3 != null) {
            str = c896550ZFd3.LIZ;
        }
        if (Intrinsics.LJFF(str, "aweme")) {
            if ((c869590Y9l.getMsgType() == 8 || c869590Y9l.getMsgType() == 11) && (c896550ZFd = LIZIZ) != null && c896550ZFd.LIZIZ.containsKey(c869590Y9l.getConversationId()) && (boolRemove = c896550ZFd.LIZIZ.remove(c869590Y9l.getConversationId())) != null) {
                boolRemove.booleanValue();
                long jLJII2 = C0YNP.LJII(c869590Y9l.getConversationId());
                C849230XTd.LIZIZ(c896550ZFd.LIZJ, c869590Y9l.getConversationId(), jLJII2);
                if (c869590Y9l.getMsgStatus() == 2) {
                    z = true;
                } else {
                    z = false;
                }
                C849230XTd.LIZ(c896550ZFd.LIZJ, c869590Y9l.getConversationId(), jLJII2, z, c869590Y9l.getLocalExt().get("s:err_code"));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IShareStateHelper
    public final synchronized void LIZ(C869590Y9l c869590Y9l) {
        if (LIZIZ != null && c869590Y9l != null && (c869590Y9l.getMsgStatus() == 2 || c869590Y9l.getMsgStatus() == 3)) {
            LIZIZ(c869590Y9l);
            if (!TextUtils.isEmpty(c869590Y9l.getLocalExtValue("process_id"))) {
                Map<String, C896550ZFd> map = LIZJ;
                C896550ZFd c896550ZFd = (C896550ZFd) ((LinkedHashMap) map).get(c869590Y9l.getLocalExtValue("process_id"));
                if (c896550ZFd != null && c896550ZFd.LIZIZ.isEmpty()) {
                    C19719512Dh.LIZJ(map).remove(c869590Y9l.getLocalExtValue("process_id"));
                    return;
                }
            }
            if (LIZIZ.LIZIZ.isEmpty()) {
                LIZIZ = null;
            }
        }
    }

    public static final synchronized void LIZJ(SharePackage sharePackage, String str, List list) {
        Long lLJIILIIL;
        String conversationId;
        if (list.isEmpty()) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            IMContact iMContact = (IMContact) it2.next();
            if (iMContact instanceof IMUser) {
                String uid = iMContact.getUid();
                if (uid != null && (lLJIILIIL = C2095008Iq.LJIILIIL(uid)) != null) {
                    linkedHashMap.put(C0YNP.LIZLLL(Long.valueOf(lLJIILIIL.longValue())), Boolean.FALSE);
                }
            } else if ((iMContact instanceof IMConversation) && (conversationId = ((IMConversation) iMContact).getConversationId()) != null) {
                linkedHashMap.put(conversationId, Boolean.TRUE);
            }
        }
        LIZIZ = new C896550ZFd(sharePackage.itemType, linkedHashMap, sharePackage, list);
        if (!TextUtils.isEmpty(str)) {
            LIZJ.put(str, LIZIZ);
        }
    }
}
