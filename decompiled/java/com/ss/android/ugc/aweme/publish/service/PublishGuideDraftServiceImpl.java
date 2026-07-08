package com.ss.android.ugc.aweme.publish.service;

import X.C01GW;
import X.C05J6;
import X.C0C64;
import X.C0MAY;
import X.C0PEM;
import X.C1345005Oe;
import X.C13BV;
import X.C13LP;
import X.C15438062q;
import X.C201955140j;
import X.C2095008Iq;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C2286608xc;
import X.C2296808zG;
import X.C23250099c;
import X.C452501pT;
import X.EnumC1240560iO6;
import X.InterfaceC1710106mp;
import Y.AComparatorS501S0100000_2;
import com.ss.android.ugc.aweme.affinity.model.SocialAffinityItem;
import com.ss.android.ugc.aweme.affinity.service.ISocialAffinityService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.common.model.BaseContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.port.internal.IInternalDraftSizeCalculator;
import com.ss.android.ugc.aweme.port.internal.IPublishGuideDraftService;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AwS581S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class PublishGuideDraftServiceImpl implements IPublishGuideDraftService {
    public final String LIZ = "PublishGuideDraftService";
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(609));

    @Override // com.ss.android.ugc.aweme.port.internal.IPublishGuideDraftService
    public final IInternalDraftSizeCalculator LIZIZ() {
        return (IInternalDraftSizeCalculator) PluggableExtentionKt.pluggableSpi$default(IInternalDraftSizeCalculator.class, false, false, false, 14, null);
    }

    @Override // com.ss.android.ugc.aweme.port.internal.IPublishGuideDraftService
    public final boolean LIZ() {
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_publish_page_draft_calculate_image_after_compile", true) != 0;
    }

    @Override // com.ss.android.ugc.aweme.port.internal.IPublishGuideDraftService
    public final void LIZJ(AwS581S0100000_2 awS581S0100000_2) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C05J6(this, Integer.MAX_VALUE, awS581S0100000_2, null), 3);
    }

    public final Object LIZLLL(int i) {
        Map<String, SocialAffinityItem> mapLIZIZ;
        Long lLJIILIIL;
        ArrayList arrayList = null;
        ISocialAffinityService iSocialAffinityService = (ISocialAffinityService) PluggableExtentionKt.pluggableSpi$default(ISocialAffinityService.class, false, false, false, 14, null);
        if (iSocialAffinityService != null) {
            mapLIZIZ = iSocialAffinityService.LIZIZ("publish");
        } else {
            mapLIZIZ = null;
        }
        C0MAY c0may = C0MAY.LIZIZ;
        StringBuilder sb = new StringBuilder();
        sb.append(this.LIZ);
        sb.append(" getSocialAffinityUserInfo, affinityResult: ");
        if (mapLIZIZ != null) {
            arrayList = new ArrayList(mapLIZIZ.size());
            for (Map.Entry<String, SocialAffinityItem> entry : mapLIZIZ.entrySet()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(entry.getKey());
                sbLIZ.append(" / ");
                sbLIZ.append(entry.getValue().toUserId);
                sbLIZ.append("/ ");
                sbLIZ.append(entry.getValue().score);
                arrayList.add(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        sb.append(arrayList);
        C201955140j.LJIILJJIL(c0may, sb.toString());
        if (mapLIZIZ != null && !mapLIZIZ.isEmpty()) {
            List<IMUser> allFriends = ((InterfaceC1710106mp) this.LIZIZ.getValue()).getAllFriends();
            int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(allFriends, 10));
            if (iLIZIZ < 16) {
                iLIZIZ = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
            for (IMUser iMUser : allFriends) {
                linkedHashMap.put(iMUser.getUid(), iMUser);
            }
            C0MAY c0may2 = C0MAY.LIZIZ;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.LIZ);
            sb2.append(" getUserList, affinityUserMap: ");
            ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append((String) entry2.getKey());
                sbLIZ2.append(" / ");
                sbLIZ2.append(((IMUser) entry2.getValue()).getAlias());
                sbLIZ2.append(" / ");
                sbLIZ2.append(((BaseContact) entry2.getValue()).getNickName());
                arrayList2.add(C2188811AlT.LIZIZ(sbLIZ2));
            }
            sb2.append(arrayList2);
            C201955140j.LJIILJJIL(c0may2, sb2.toString());
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                if (((IMUser) entry3.getValue()).getFollowStatus() == EnumC1240560iO6.FOLLOW_EACH_OTHER.getStatus()) {
                    linkedHashMap2.put(entry3.getKey(), entry3.getValue());
                }
            }
            ArrayList arrayList3 = new ArrayList();
            for (Map.Entry entry4 : linkedHashMap2.entrySet()) {
                String uid = ((BaseContact) entry4.getValue()).getUid();
                if (uid != null && (lLJIILIIL = C2095008Iq.LJIILIIL(uid)) != null) {
                    Long lLJFF = C2286608xc.LJFF(lLJIILIIL.longValue());
                    UrlModel avatarMedium = ((IMUser) entry4.getValue()).getAvatarMedium();
                    ((BaseContact) entry4.getValue()).getNickName();
                    arrayList3.add(new C1345005Oe(lLJFF, avatarMedium));
                }
            }
            return C13LP.LL(C13LP.LJLLLL(new AComparatorS501S0100000_2(mapLIZIZ, 3), arrayList3), i);
        }
        return C13BV.INSTANCE;
    }
}
