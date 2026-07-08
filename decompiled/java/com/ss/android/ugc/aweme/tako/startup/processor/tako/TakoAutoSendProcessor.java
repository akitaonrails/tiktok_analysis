package com.ss.android.ugc.aweme.tako.startup.processor.tako;

import X.C07QF;
import X.C0DQF;
import X.C0ZP4;
import X.C123100dR;
import X.C14FD;
import X.C1697810uHb;
import X.C1861390yXR;
import X.C1862280yYs;
import X.C1862330yYx;
import X.C1862620yZQ;
import X.C1862660yZU;
import X.C19EG;
import X.C259800zU;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.model.FeedbarDrawCreateInfo;
import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import com.ss.android.ugc.aweme.tako.router.model.TakoDuplicateEnterData;
import com.ss.android.ugc.aweme.tako.startup.protocol.ITakoEnterAction;
import com.ss.android.ugc.aweme.tako.startup.protocol.ITakoNormalProcessorProtocol;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS40S0600000_27;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoAutoSendProcessor implements ITakoNormalProcessorProtocol, ITakoEnterAction {
    public final int LL = 80;
    public final List<String> LLILLJJLI = C1697810uHb.LJIIJJI("send_text_msg", "send_text_and_image_msg");

    @Override // com.ss.android.ugc.aweme.tako.startup.protocol.ITakoProcessorProtocol
    public final int getPriority() {
        return this.LL;
    }

    @Override // com.ss.android.ugc.aweme.tako.startup.protocol.ITakoNormalProcessorProtocol
    public final boolean Wd(IMessageAbility iMessageAbility, TakoEnterParams takoEnterParams) {
        TakoDuplicateEnterData takoDuplicateEnterData;
        List<String> list;
        C1862330yYx c1862330yYx = C1862330yYx.LIZ;
        String autoSendMsgContent = takoEnterParams.getAutoSendMsgContent();
        Map<String, String> commonParams = takoEnterParams.getCommonParams();
        c1862330yYx.getClass();
        C1862330yYx.LJFF(autoSendMsgContent, commonParams);
        FeedbarDrawCreateInfo feedbarDrawCreateInfo = takoEnterParams.carriedFeedbarDrawCreateInfo;
        if (feedbarDrawCreateInfo == null || !feedbarDrawCreateInfo.valid || (list = feedbarDrawCreateInfo.imageUrls) == null || list.isEmpty()) {
            C07QF.LIZ.getClass();
            if (C07QF.LIZ() && !C1861390yXR.LIZLLL() && ((takoDuplicateEnterData = takoEnterParams.duplicateEnterData) == null || !takoDuplicateEnterData.forceAutoSend)) {
                return false;
            }
            String autoSendMsgContent2 = takoEnterParams.getAutoSendMsgContent();
            if (autoSendMsgContent2 != null && C123100dR.LIZ(autoSendMsgContent2)) {
                return true;
            }
            List<String> autoSendImagePathList = takoEnterParams.getAutoSendImagePathList();
            if (autoSendImagePathList != null && C1862280yYs.LIZJ(autoSendImagePathList)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.tako.startup.protocol.ITakoProcessorProtocol
    public final boolean Xw(IMessageAbility iMessageAbility, TakoEnterParams takoEnterParams) {
        return C1862620yZQ.LIZ(this, takoEnterParams, iMessageAbility);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:199:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0121  */
    /* JADX WARN: Type inference failed for: r13v1, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v9, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r60v0, types: [com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(androidx.fragment.app.Fragment r59, com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility r60, com.ss.android.ugc.aweme.tako.model.TakoEnterParams r61, X.C1862660yZU r62) {
        /*
            Method dump skipped, instruction units count: 1778
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.startup.processor.tako.TakoAutoSendProcessor.LIZ(androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility, com.ss.android.ugc.aweme.tako.model.TakoEnterParams, X.0yZU):void");
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, X.0ZP4] */
    @Override // com.ss.android.ugc.aweme.tako.startup.protocol.ITakoProcessorProtocol
    public final boolean TS(Fragment fragment, TakoEnterParams takoEnterParams, C1862660yZU c1862660yZU, IMessageAbility iMessageAbility, C14FD c14fd) {
        if (iMessageAbility.oj()) {
            LIZ(fragment, iMessageAbility, takoEnterParams, c1862660yZU);
        } else {
            TakoDuplicateEnterData takoDuplicateEnterData = takoEnterParams.duplicateEnterData;
            if (takoDuplicateEnterData != null && takoDuplicateEnterData.forceAutoSend) {
                iMessageAbility.U51();
                C259800zU c259800zU = new C259800zU();
                c259800zU.element = iMessageAbility.tx1(new AwS40S0600000_27(this, (TakoAutoSendProcessor) fragment, (Fragment) takoEnterParams, (TakoEnterParams) c1862660yZU, (C1862660yZU) iMessageAbility, (IMessageAbility) c259800zU, (C259800zU<C0ZP4>) 2));
                return true;
            }
            C19EG activity = fragment.getActivity();
            if (activity != null) {
                C0DQF.LJIIJJI(activity, fragment, takoEnterParams.getCommonParams(), takoEnterParams.botInfo, 1000L);
                return true;
            }
        }
        return true;
    }
}
