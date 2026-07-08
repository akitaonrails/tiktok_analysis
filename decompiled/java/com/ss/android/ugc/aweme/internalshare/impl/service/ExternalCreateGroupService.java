package com.ss.android.ugc.aweme.internalshare.impl.service;

import X.C0IDY;
import X.C0IKF;
import X.C0Y8T;
import X.C10EU;
import X.C1226350i1B;
import X.C1229210i5n;
import X.C1229230i5p;
import X.C1250860iei;
import X.C1336205Ku;
import X.C1369870lkf;
import X.C1371590lnR;
import X.C1371600lnS;
import X.C1388190mED;
import X.C1390920mIc;
import X.C1391850mK7;
import X.C1759206uk;
import X.C19738212Km;
import X.C19EG;
import X.C20684815ws;
import X.C2097908Jt;
import X.C23250099c;
import X.C2344009Gk;
import X.C259800zU;
import X.C465320IMo;
import X.C571830Mbl;
import X.C621180OYa;
import X.C729510SjV;
import X.C786410Ut5;
import X.DialogC1389620mGW;
import X.EnumC1371620lnU;
import X.InterfaceC1369790lkX;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeACLShare;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.internalshare.api.service.IExternalCreateGroupService;
import com.ss.android.ugc.aweme.internalshare.impl.external.SharePostAndGroupPanel;
import com.ss.android.ugc.aweme.share.ShareService;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public final class ExternalCreateGroupService implements IExternalCreateGroupService {
    @Override // com.ss.android.ugc.aweme.internalshare.api.service.IExternalCreateGroupService
    public final boolean LIZJ(BaseSharePackage baseSharePackage) {
        String string;
        Bundle bundle;
        if (baseSharePackage != null && (bundle = baseSharePackage.extras) != null) {
            string = bundle.getString("panel_source");
        } else {
            string = null;
        }
        return Intrinsics.LJFF(string, "share_post_and_group_chat_panel");
    }

    @Override // com.ss.android.ugc.aweme.internalshare.api.service.IExternalCreateGroupService
    public final boolean LJ(BaseSharePackage baseSharePackage) {
        AwemeACLShare awemeACLShare;
        Integer numValueOf;
        C1229230i5p.LIZ.getClass();
        if (baseSharePackage != null && C1250860iei.LIZ(baseSharePackage) && baseSharePackage.LJIILJJIL()) {
            ShareService shareService = C621180OYa.LIZ;
            SharePackage sharePackage = null;
            if (baseSharePackage instanceof SharePackage) {
                sharePackage = (SharePackage) baseSharePackage;
            }
            Aweme awemeLJJIJIL = shareService.LJJIJIL(sharePackage);
            if (awemeLJJIJIL != null && (awemeACLShare = awemeLJJIJIL.awemeACLShareInfo) != null && awemeACLShare.getShareListStatus() == 0 && !C10EU.LJIIIIZZ() && !AwemeExtKt.isScheduleVideo(awemeLJJIJIL) && awemeLJJIJIL != null && !AwemeExtKt.isInReviewing(awemeLJJIJIL) && !AwemeExtKt.isSelfSee(awemeLJJIJIL) && !AwemeExtKt.shouldShowReviewStatus(awemeLJJIJIL) && !C729510SjV.LJJIJIL(awemeLJJIJIL) && !awemeLJJIJIL.isAd() && !AwemeExtKt.isPrivate(awemeLJJIJIL) && C621180OYa.LIZIZ.LJJIIZI(awemeLJJIJIL) && (awemeLJJIJIL == null || (numValueOf = Integer.valueOf(awemeLJJIJIL.getAwemeType())) == null || (numValueOf.intValue() != 501 && numValueOf.intValue() != 502))) {
                String str = baseSharePackage.itemType;
                if ((Intrinsics.LJFF(str, "aweme") || Intrinsics.LJFF(str, "aweme_photo")) && !C1336205Ku.LIZJ().LIZJ()) {
                    C1759206uk c1759206uk = C1759206uk.LIZ;
                    if (C1759206uk.LIZ()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.internalshare.api.service.IExternalCreateGroupService
    public final void LIZ(Context context, BaseSharePackage baseSharePackage) {
        C1229230i5p.LIZ.getClass();
        DialogC1389620mGW dialogC1389620mGW = new DialogC1389620mGW(context);
        dialogC1389620mGW.LJJLJ(R.string.txr);
        dialogC1389620mGW.LJJLIIJ(true);
        C1391850mK7.LIZIZ(dialogC1389620mGW, "create group to share loading dialog");
        C571830Mbl.LIZIZ(dialogC1389620mGW);
        C23250099c.LIZLLL(C1229230i5p.LIZIZ, null, null, new C1229210i5n(baseSharePackage, dialogC1389620mGW, context, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.internalshare.api.service.IExternalCreateGroupService
    public final void LIZIZ(String str, Map<String, String> map) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJII(map);
        C20684815ws.LJIILLIIL(str, c2344009Gk.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [T, com.bytedance.tux.sheet.BaseSheet, com.bytedance.tux.sheet.sheet.TuxSheet, java.lang.Object] */
    @Override // com.ss.android.ugc.aweme.internalshare.api.service.IExternalCreateGroupService
    public final void LIZLLL(Context context, C0Y8T c0y8t, BaseSharePackage baseSharePackage) {
        SharePackage sharePackage;
        List<InterfaceC1369790lkX> list;
        String conversationId;
        C1229230i5p.LIZ.getClass();
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        if (c19egLIZIZ != null) {
            FragmentManager supportFragmentManager = c19egLIZIZ.getSupportFragmentManager();
            if (c0y8t != null && (conversationId = c0y8t.getConversationId()) != null) {
                C786410Ut5.LJJJI("share_post_and_group_to_chat_id", conversationId, baseSharePackage.extras);
            }
            ShareService shareService = C621180OYa.LIZ;
            C1371590lnR c1371590lnR = null;
            if (baseSharePackage instanceof SharePackage) {
                sharePackage = (SharePackage) baseSharePackage;
            } else {
                sharePackage = null;
            }
            Aweme awemeLJJIJIL = shareService.LJJIJIL(sharePackage);
            C1371600lnS c1371600lnSLJFF = C621180OYa.LIZ.LJFF(baseSharePackage);
            if (c1371600lnSLJFF != null) {
                c1371600lnSLJFF.LJJIIJZLJL = false;
                c1371600lnSLJFF.LJFF = new ArrayList();
                c1371600lnSLJFF.LIZLLL = EnumC1371620lnU.USE_CACHE;
            }
            String string = baseSharePackage.extras.getString("enter_from");
            if (string == null) {
                string = "";
            }
            Map mapLIZJ = C2097908Jt.LIZJ(new Pair("enter_from", string));
            if (c1371600lnSLJFF != null) {
                c1371590lnR = new C1371590lnR(c1371600lnSLJFF);
            }
            C1226350i1B c1226350i1B = new C1226350i1B(awemeLJJIJIL, c0y8t, c1371590lnR, mapLIZJ);
            C259800zU c259800zU = new C259800zU();
            SharePostAndGroupPanel sharePostAndGroupPanel = new SharePostAndGroupPanel();
            sharePostAndGroupPanel.LL = c1226350i1B;
            C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
            TuxSheet tuxSheet = c1390920mIc.LIZ;
            tuxSheet.LLJJIJI = sharePostAndGroupPanel;
            tuxSheet.LLJLL = true;
            if (c1371590lnR != null && (list = c1371590lnR.LIZ) != null && list.size() > 8) {
                c1390920mIc.LJIIIIZZ(1);
                C0IKF.LIZ.getClass();
                C465320IMo.LIZ();
                c1390920mIc.LIZ.LLJJL = (int) (((double) C19738212Km.LIZ(c19egLIZIZ).LIZ().height()) * 0.45d);
            } else {
                c1390920mIc.LJIIIIZZ(4);
            }
            C0IDY c0idy = new C0IDY(c259800zU, c1226350i1B, 1);
            ?? r0 = c1390920mIc.LIZ;
            r0.LLILLJJLI = c0idy;
            c259800zU.element = r0;
            C1391850mK7.LIZIZ(r0, "share post and group");
            ArrayList<JSONObject> arrayList = C1369870lkf.LIZ;
            C1369870lkf.LJIJI((TuxSheet) c259800zU.element);
            ((DialogFragment) c259800zU.element).show(supportFragmentManager, "share post and group");
        }
    }
}
