package com.ss.android.ugc.feed.platform.popup;

import X.C054G;
import X.C05QD;
import X.C1877490yxP;
import X.C204728159a;
import X.C204730159c;
import X.C20548215aq;
import X.C20585815gu;
import X.C20588615hM;
import X.C20588715hN;
import X.C20589115hR;
import X.C20589415hU;
import X.C20644615qO;
import X.C20645015qS;
import X.C20645115qT;
import X.C2188811AlT;
import X.C23250099c;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.feed.popup.FeedPopupService;
import com.ss.android.ugc.feed.platform.popup.dynamic.initialize.DynamicPopupConfig;
import com.ss.android.ugc.feed.platform.popup.dynamic.initialize.OutreachDynamicPopupFcpConfig;
import com.ss.android.ugc.feed.platform.popup.dynamic.initialize.PopupMetaInfo;
import com.ss.android.ugc.feed.platform.popup.exp.DynamicPopupExp;
import com.ss.android.ugc.feed.platform.popup.exp.FeedDynamicBugfixConfig;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes32.dex */
public final class FeedPopupServiceImpl implements FeedPopupService {
    @Override // com.ss.android.ugc.aweme.feed.popup.FeedPopupService
    public final C20644615qO LIZ() {
        C20588615hM.LIZ.getClass();
        DynamicPopupExp dynamicPopupExp = (DynamicPopupExp) C204730159c.LIZ.getValue();
        if (dynamicPopupExp == null || !dynamicPopupExp.dynamicPopupEnable) {
            return null;
        }
        return C20588615hM.LIZJ;
    }

    @Override // com.ss.android.ugc.aweme.feed.popup.FeedPopupService
    public final C20585815gu LIZIZ() {
        C20588615hM.LIZ.getClass();
        DynamicPopupExp dynamicPopupExp = (DynamicPopupExp) C204730159c.LIZ.getValue();
        if (dynamicPopupExp == null || !dynamicPopupExp.dynamicPopupEnable) {
            return null;
        }
        return C20588615hM.LIZLLL;
    }

    @Override // com.ss.android.ugc.aweme.feed.popup.FeedPopupService
    public final void LIZJ() {
        DynamicPopupConfig dynamicPopupConfig;
        List<PopupMetaInfo> list;
        List<String> list2;
        new Object() { // from class: X.15hO
        }.getClass();
        OutreachDynamicPopupFcpConfig outreachDynamicPopupFcpConfig = (OutreachDynamicPopupFcpConfig) C20588715hN.LIZ.getValue();
        if (outreachDynamicPopupFcpConfig == null || (dynamicPopupConfig = outreachDynamicPopupFcpConfig.dynamicPopupConfig) == null || (list = dynamicPopupConfig.popupMetaInfo) == null) {
            return;
        }
        for (PopupMetaInfo popupMetaInfo : list) {
            if (popupMetaInfo != null && (list2 = popupMetaInfo.geckoChannelList) != null) {
                for (String str : list2) {
                    if (str != null && str.length() != 0) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("key=");
                        sbLIZ.append(popupMetaInfo.popupKey);
                        sbLIZ.append(" geckoChannel=");
                        sbLIZ.append(str);
                        C20589415hU.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
                        C20548215aq.LIZ.getClass();
                        C20548215aq.LIZ(str);
                    }
                }
            }
        }
        DynamicPopupExp dynamicPopupExp = (DynamicPopupExp) C204730159c.LIZ.getValue();
        if (dynamicPopupExp == null || dynamicPopupExp.preloadImgColdStartDelay > 0) {
            C23250099c.LIZLLL(C05QD.LIZ, null, null, new C204728159a(list, null), 3);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.popup.FeedPopupService
    public final C20645015qS LIZLLL() {
        C20588615hM.LIZ.getClass();
        DynamicPopupExp dynamicPopupExp = (DynamicPopupExp) C204730159c.LIZ.getValue();
        if (dynamicPopupExp == null || !dynamicPopupExp.dynamicPopupEnable) {
            return null;
        }
        return C20588615hM.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.feed.popup.FeedPopupService
    public final boolean LJ() {
        C20588615hM.LIZ.getClass();
        if (!((FeedDynamicBugfixConfig) C20589115hR.LIZIZ.getValue()).enablePlayerPanel) {
            return false;
        }
        boolean z = C20588615hM.LJ;
        if (z && !C20588615hM.LJFF && PopupManager.LJII(C20645115qT.class)) {
            C1877490yxP.LIZ.getClass();
            C054G c054g = C05QD.LIZ;
            C05QD.LIZ(new Runnable() { // from class: X.00kZ
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("FeedDynamicPopupMonitor@d6d3.mobForPauseVideo$1");
                    try {
                        C20684815ws.LJIILLIIL("feed_android_bugfix", C2097908Jt.LIZJ(new Pair("source", "popup_pause_video")));
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("FeedDynamicPopupMonitor@d6d3.mobForPauseVideo$1");
                }
            });
        }
        return z;
    }
}
