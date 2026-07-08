package com.ss.android.ugc.aweme.tako.startup.processor;

import X.C07QF;
import X.C0DQF;
import X.C123100dR;
import X.C13LC;
import X.C14FD;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1859740yUm;
import X.C1861390yXR;
import X.C1861630yXp;
import X.C1862480yZC;
import X.C1862550yZJ;
import X.C1862660yZU;
import X.C1864000ybe;
import X.C1864200yby;
import X.C19719512Dh;
import X.C19EG;
import X.C259800zU;
import X.C665120Q7a;
import X.InterfaceC665370Q7z;
import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.ccl.model.api.SearchLandingPageResponse;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import com.ss.android.ugc.aweme.tako.model.NimbleParams;
import com.ss.android.ugc.aweme.tako.model.SearchBingItem;
import com.ss.android.ugc.aweme.tako.model.SearchVideoItem;
import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import com.ss.android.ugc.aweme.tako.model.TakoImageItem;
import com.ss.android.ugc.aweme.tako.router.model.TakoInteractGuideData;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.ss.android.ugc.aweme.tako.startup.protocol.ITakoEnterAction;
import com.ss.android.ugc.aweme.tako.startup.protocol.ITakoProcessorProtocol;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AFwS226S0000000_35;
import kotlin.jvm.internal.AwS141S1100000_27;
import kotlin.jvm.internal.AwS63S1300000_27;
import kotlin.jvm.internal.AwS6S1500000_27;
import kotlin.jvm.internal.AwS9S2400000_27;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoSearchCarryProcessor implements ITakoProcessorProtocol, ITakoEnterAction {
    public final int LL = 53;
    public final List<String> LLILLJJLI = Collections.singletonList("carry_in_msg");

    @Override // com.ss.android.ugc.aweme.tako.startup.protocol.ITakoProcessorProtocol
    public final int getPriority() {
        return this.LL;
    }

    @Override // com.ss.android.ugc.aweme.tako.startup.protocol.ITakoProcessorProtocol
    public final boolean Xw(IMessageAbility iMessageAbility, TakoEnterParams takoEnterParams) {
        List<SearchVideoItem> carriedSendAnswerVideo;
        List<SearchBingItem> carriedBingList;
        List<TakoImageItem> carriedImageList;
        List<TakoImageItem> carriedSendImageList;
        String carriedSendAnswerContent = takoEnterParams.getCarriedSendAnswerContent();
        if (((carriedSendAnswerContent != null && carriedSendAnswerContent.length() != 0) || (((carriedSendAnswerVideo = takoEnterParams.getCarriedSendAnswerVideo()) != null && !carriedSendAnswerVideo.isEmpty()) || (((carriedBingList = takoEnterParams.getCarriedBingList()) != null && !carriedBingList.isEmpty()) || (((carriedImageList = takoEnterParams.getCarriedImageList()) != null && !carriedImageList.isEmpty()) || (((carriedSendImageList = takoEnterParams.getCarriedSendImageList()) != null && !carriedSendImageList.isEmpty()) || takoEnterParams.getNimbleParams() != null || takoEnterParams.getSearchLandingPageRequest() != null || C1859740yUm.LIZ(takoEnterParams.getEnterSearchId()) != null))))) && !C123100dR.LIZ(takoEnterParams.getAutoSendMsgContent())) {
            C07QF.LIZ.getClass();
            if (!C07QF.LIZ() || C1861390yXR.LIZLLL() || !C1861390yXR.LIZIZ.LJIJ) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.tako.startup.protocol.ITakoProcessorProtocol
    public final boolean TS(Fragment fragment, TakoEnterParams takoEnterParams, C1862660yZU c1862660yZU, IMessageAbility iMessageAbility, C14FD c14fd) {
        String str;
        SearchLandingPageResponse searchLandingPageResponse;
        Integer num;
        ITakoContextAbility iTakoContextAbility;
        C13LC<C1864200yby> c13lcAp0;
        C1864200yby c1864200yby;
        String str2 = null;
        try {
            InterfaceC665370Q7z interfaceC665370Q7zLJIIJJI = C1558360qeg.LJIIJJI(fragment, null);
            if (interfaceC665370Q7zLJIIJJI != null && (iTakoContextAbility = (ITakoContextAbility) C1558520qew.LIZ(interfaceC665370Q7zLJIIJJI, ITakoContextAbility.class, null)) != null && (c13lcAp0 = iTakoContextAbility.Ap0()) != null && (c1864200yby = (C1864200yby) c13lcAp0.LIZIZ()) != null) {
                str = c1864200yby.LL;
            } else {
                str = null;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            str = null;
        }
        boolean zLJFF = false;
        if ((Intrinsics.LJFF(takoEnterParams.enterMethod, "click_smart_search_info_card") || Intrinsics.LJFF(takoEnterParams.enterMethod, "click_smart_search_recommend_card") || Intrinsics.LJFF(takoEnterParams.enterMethod, "click_smart_search_bar")) && !iMessageAbility.oj()) {
            C19EG activity = fragment.getActivity();
            if (activity != null) {
                C0DQF.LJIIJJI(activity, fragment, takoEnterParams.getCommonParams(), takoEnterParams.botInfo, 500L);
            }
            return true;
        }
        C259800zU c259800zU = new C259800zU();
        String enterSearchId = takoEnterParams.getEnterSearchId();
        TakoMixFeed takoMixFeedLIZ = C1859740yUm.LIZ(enterSearchId);
        System.currentTimeMillis();
        iMessageAbility.Uj0(C1861630yXp.LIZ(new AwS6S1500000_27(takoEnterParams, (TakoEnterParams) c259800zU, (C259800zU<String>) takoMixFeedLIZ, (TakoMixFeed) this, (TakoSearchCarryProcessor) c1862660yZU, (C1862660yZU) str, (String) 1)));
        String str3 = (String) c259800zU.element;
        if (str3 != null && takoEnterParams.getSearchLandingPageRequest() != null && ((searchLandingPageResponse = C1864000ybe.LIZIZ) == null || !Intrinsics.LJFF(searchLandingPageResponse.LIZ, takoEnterParams.getDataRepeatKey()))) {
            if (C1862550yZJ.LIZ(takoEnterParams)) {
                NimbleParams nimbleParams = takoEnterParams.getNimbleParams();
                if (nimbleParams != null && (num = nimbleParams.nimbleOffsetIndex) != null) {
                    num.intValue();
                    NimbleParams nimbleParams2 = takoEnterParams.getNimbleParams();
                    if (nimbleParams2 != null) {
                        nimbleParams2.setNimbleOffsetMessageUUID(C1862480yZC.LIZ(takoEnterParams.getCarriedRepeatKey()));
                    }
                }
                iMessageAbility.Uj0(C1861630yXp.LIZ(new AwS141S1100000_27(takoEnterParams, str3, 18)));
            } else {
                iMessageAbility.vL(str3);
                C665120Q7a searchLandingPageRequest = takoEnterParams.getSearchLandingPageRequest();
                if (searchLandingPageRequest != null) {
                    NimbleParams nimbleParams3 = takoEnterParams.getNimbleParams();
                    if (nimbleParams3 != null) {
                        str2 = nimbleParams3.storageKey;
                    }
                    iMessageAbility.MF0(searchLandingPageRequest, str2);
                    iMessageAbility.G01(fragment, new AwS63S1300000_27(iMessageAbility, str3, searchLandingPageRequest, takoEnterParams, 5), AFwS226S0000000_35.get$arr$(450), new AwS9S2400000_27(this, takoEnterParams, iMessageAbility, str3, c1862660yZU, (String) null, 1));
                }
            }
        }
        C07QF.LIZ.getClass();
        if (C07QF.LIZ()) {
            zLJFF = C1861390yXR.LJIIJ(takoEnterParams);
        } else {
            TakoInteractGuideData takoInteractGuideData = takoEnterParams.interactGuideData;
            if (takoInteractGuideData != null) {
                zLJFF = Intrinsics.LJFF(takoInteractGuideData.requestShowKeyboard, Boolean.TRUE);
            }
        }
        iMessageAbility.zJ1(zLJFF);
        C19719512Dh.LIZJ(C1859740yUm.LIZ).remove(enterSearchId);
        return true;
    }
}
