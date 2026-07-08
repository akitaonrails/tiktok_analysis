package com.ss.android.ugc.aweme.tako.startup.processor.tako;

import X.C14FD;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1852640yJK;
import X.C1862620yZQ;
import X.C1862660yZU;
import X.C2188811AlT;
import X.EnumC992400bvq;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import com.ss.android.ugc.aweme.tako.model.TakoPageContext;
import com.ss.android.ugc.aweme.tako.router.model.TakoAttachedLandingPage;
import com.ss.android.ugc.aweme.tako.router.model.TakoInteractGuideData;
import com.ss.android.ugc.aweme.tako.startup.protocol.ITakoNormalProcessorProtocol;
import com.ss.android.ugc.aweme.tako.ui.ITakoChatPageAbility;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoAttachedLandingPageProcessor implements ITakoNormalProcessorProtocol {
    @Override // com.ss.android.ugc.aweme.tako.startup.protocol.ITakoProcessorProtocol
    public final int getPriority() {
        return 200;
    }

    @Override // com.ss.android.ugc.aweme.tako.startup.protocol.ITakoNormalProcessorProtocol
    public final boolean Wd(IMessageAbility iMessageAbility, TakoEnterParams takoEnterParams) {
        TakoInteractGuideData takoInteractGuideData;
        if (takoEnterParams != null && (takoInteractGuideData = takoEnterParams.interactGuideData) != null && takoInteractGuideData.attachedLandingPage != null) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.tako.startup.protocol.ITakoProcessorProtocol
    public final boolean Xw(IMessageAbility iMessageAbility, TakoEnterParams takoEnterParams) {
        return C1862620yZQ.LIZ(this, takoEnterParams, iMessageAbility);
    }

    @Override // com.ss.android.ugc.aweme.tako.startup.protocol.ITakoProcessorProtocol
    public final boolean TS(Fragment fragment, TakoEnterParams takoEnterParams, C1862660yZU c1862660yZU, IMessageAbility iMessageAbility, C14FD c14fd) {
        TakoPageContext takoPageContextBD;
        TakoAttachedLandingPage takoAttachedLandingPage;
        Context context = fragment.getContext();
        String str = null;
        ITakoChatPageAbility iTakoChatPageAbility = (ITakoChatPageAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragment, null), ITakoChatPageAbility.class, null);
        if (iTakoChatPageAbility != null) {
            takoPageContextBD = iTakoChatPageAbility.BD();
        } else {
            takoPageContextBD = null;
        }
        TakoInteractGuideData takoInteractGuideData = takoEnterParams.interactGuideData;
        if (takoInteractGuideData != null) {
            takoAttachedLandingPage = takoInteractGuideData.attachedLandingPage;
            if (takoAttachedLandingPage != null) {
                str = takoAttachedLandingPage.landingPage;
            }
        } else {
            takoAttachedLandingPage = null;
        }
        if (Intrinsics.LJFF(str, EnumC992400bvq.INSPIRATIONS.getType())) {
            String str2 = takoAttachedLandingPage.tabId;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(takoEnterParams.enterFrom);
            sbLIZ.append('_');
            sbLIZ.append(takoEnterParams.enterMethod);
            C1852640yJK.LJI(context, takoPageContextBD, str2, 40005, C2188811AlT.LIZIZ(sbLIZ), null);
            return false;
        }
        if (!Intrinsics.LJFF(str, EnumC992400bvq.IMAGE_EDIT.getType())) {
            return false;
        }
        String str3 = takoAttachedLandingPage.templateId;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(takoEnterParams.enterFrom);
        sbLIZ2.append('_');
        sbLIZ2.append(takoEnterParams.enterMethod);
        C1852640yJK.LJ(context, str3, takoPageContextBD, 40005, C2188811AlT.LIZIZ(sbLIZ2), null, fragment, 32);
        return false;
    }
}
