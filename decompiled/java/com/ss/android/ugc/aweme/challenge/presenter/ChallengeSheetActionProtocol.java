package com.ss.android.ugc.aweme.challenge.presenter;

import X.AbstractC848400XPy;
import X.C0XQ7;
import X.C1593730rZj;
import X.InterfaceC1370310llN;
import X.InterfaceC1371910lnx;
import android.content.Context;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.challenge.presenter.ChallengeSharePackageV2;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.share.ShareExtService;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.base.model.ShareModel;
import com.ss.android.ugc.aweme.share.config.TTSheetActionProtocol;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public final class ChallengeSheetActionProtocol extends TTSheetActionProtocol {
    @Override // com.ss.android.ugc.aweme.share.config.TTSheetActionProtocol, com.ss.android.ugc.aweme.share.core.protocol.SheetActionProtocol
    public final InterfaceC1371910lnx hF0() {
        return new InterfaceC1371910lnx() { // from class: X.0lt5
            @Override // X.InterfaceC1371910lnx
            public final void LIZIZ(Context context, BaseSharePackage baseSharePackage, InterfaceC1370310llN interfaceC1370310llN) {
                Challenge challenge;
                ShareModel shareModel = baseSharePackage.shareModel;
                Serializable serializable = null;
                if (shareModel != null) {
                    serializable = shareModel.customModel;
                }
                if ((serializable instanceof Challenge) && (challenge = (Challenge) serializable) != null && C1373230lq5.LIZ.contains(interfaceC1370310llN.key())) {
                    C1374970lst c1374970lst = ChallengeSharePackageV2.Companion;
                    String strKey = interfaceC1370310llN.key();
                    c1374970lst.getClass();
                    C1374970lst.LIZ(strKey, true, challenge);
                }
            }
        };
    }

    public ChallengeSheetActionProtocol(BaseSharePackage baseSharePackage) {
        super(baseSharePackage);
    }

    @Override // com.ss.android.ugc.aweme.share.config.TTSheetActionProtocol, com.ss.android.ugc.aweme.share.core.protocol.SheetActionProtocol
    public final List<InterfaceC1370310llN> uO1(BaseSharePackage baseSharePackage) {
        Serializable serializable;
        Challenge challenge;
        ShareModel shareModel = baseSharePackage.shareModel;
        String uid = null;
        if (shareModel != null) {
            serializable = shareModel.customModel;
        } else {
            serializable = null;
        }
        if ((serializable instanceof Challenge) && (challenge = (Challenge) serializable) != null) {
            ArrayList arrayList = new ArrayList();
            ChallengeSharePackageV2.Companion.getClass();
            String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
            User author = challenge.getAuthor();
            if (author != null) {
                uid = author.getUid();
            }
            if (TextUtils.isEmpty(curUserId) || TextUtils.isEmpty(uid) || !TextUtils.equals(curUserId, uid)) {
                arrayList.add(((ShareExtService) ServiceManager.get().getService(ShareExtService.class)).LJJLIIIJJI(challenge));
            }
            if (C1593730rZj.LIZIZ.LJIJ()) {
                arrayList.add(((ShareExtService) ServiceManager.get().getService(ShareExtService.class)).LJJIIJ(challenge, baseSharePackage.extras.getBoolean("isHashtag"), baseSharePackage.extras.getString("challengeId"), baseSharePackage.extras.getString("requestId"), baseSharePackage.extras.getString("processId")));
            }
            return arrayList;
        }
        return new ArrayList();
    }
}
