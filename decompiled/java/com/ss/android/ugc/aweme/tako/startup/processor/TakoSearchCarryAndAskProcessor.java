package com.ss.android.ugc.aweme.tako.startup.processor;

import X.C0DQF;
import X.C13LC;
import X.C14FD;
import X.C1558360qeg;
import X.C1558520qew;
import X.C18089076p;
import X.C1861390yXR;
import X.C1861940yYK;
import X.C1862550yZJ;
import X.C1862660yZU;
import X.C1864200yby;
import X.C19EG;
import X.C20227614Cs;
import X.C324800CoI;
import X.C830490Whz;
import X.EnumC1858090yS7;
import X.InterfaceC665370Q7z;
import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.model.SearchBingItem;
import com.ss.android.ugc.aweme.tako.model.SearchVideoItem;
import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import com.ss.android.ugc.aweme.tako.model.TakoImageItem;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.ss.android.ugc.aweme.tako.startup.protocol.ITakoEnterAction;
import com.ss.android.ugc.aweme.tako.startup.protocol.ITakoProcessorProtocol;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.AwS110S1200000_27;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoSearchCarryAndAskProcessor implements ITakoProcessorProtocol, ITakoEnterAction {
    public final int LL = 52;
    public final List<String> LLILLJJLI = Collections.singletonList("carry_in_msg_and_send_text_msg");

    @Override // com.ss.android.ugc.aweme.tako.startup.protocol.ITakoProcessorProtocol
    public final int getPriority() {
        return this.LL;
    }

    @Override // com.ss.android.ugc.aweme.tako.startup.protocol.ITakoProcessorProtocol
    public final boolean Xw(IMessageAbility iMessageAbility, TakoEnterParams takoEnterParams) {
        String carriedSendAnswerContent;
        List<SearchVideoItem> carriedSendAnswerVideo;
        List<SearchBingItem> carriedBingList;
        List<TakoImageItem> carriedImageList;
        String autoSendMsgContent;
        String searchKeyword = takoEnterParams.getSearchKeyword();
        if (searchKeyword == null || searchKeyword.length() == 0 || ((((carriedSendAnswerContent = takoEnterParams.getCarriedSendAnswerContent()) == null || a0.LJJJIL(carriedSendAnswerContent)) && (((carriedSendAnswerVideo = takoEnterParams.getCarriedSendAnswerVideo()) == null || carriedSendAnswerVideo.isEmpty()) && (((carriedBingList = takoEnterParams.getCarriedBingList()) == null || carriedBingList.isEmpty()) && ((carriedImageList = takoEnterParams.getCarriedImageList()) == null || carriedImageList.isEmpty())))) || (autoSendMsgContent = takoEnterParams.getAutoSendMsgContent()) == null || autoSendMsgContent.length() == 0)) {
            return false;
        }
        return C18089076p.LIZIZ;
    }

    public static void LIZ(TakoEnterParams takoEnterParams, C1862660yZU c1862660yZU, IMessageAbility iMessageAbility, C830490Whz c830490Whz) {
        boolean z;
        String string = UUID.randomUUID().toString();
        if (!C1862550yZJ.LIZ(takoEnterParams)) {
            C1861390yXR.LIZJ = string;
        }
        String autoSendMsgContent = takoEnterParams.getAutoSendMsgContent();
        if (autoSendMsgContent == null) {
            autoSendMsgContent = "";
        }
        if (C20227614Cs.LIZ(takoEnterParams.botInfo) && c1862660yZU.LJ) {
            z = true;
        } else {
            z = false;
        }
        iMessageAbility.S22(autoSendMsgContent, z, EnumC1858090yS7.SEARCH_SUG, takoEnterParams.getCommonParams(), c830490Whz, takoEnterParams.enterStartTime, new AwS110S1200000_27(takoEnterParams, c1862660yZU, string, 12));
    }

    @Override // com.ss.android.ugc.aweme.tako.startup.protocol.ITakoProcessorProtocol
    public final boolean TS(Fragment fragment, TakoEnterParams takoEnterParams, C1862660yZU c1862660yZU, IMessageAbility iMessageAbility, C14FD c14fd) {
        String str;
        C19EG activity;
        InterfaceC665370Q7z interfaceC665370Q7zLJIIJJI;
        ITakoContextAbility iTakoContextAbility;
        C13LC<C1864200yby> c13lcAp0;
        C1864200yby c1864200yby;
        InterfaceC665370Q7z interfaceC665370Q7zLJIIJJI2;
        ITakoContextAbility iTakoContextAbility2;
        C13LC<C1864200yby> c13lcAp02;
        C1864200yby c1864200yby2;
        try {
            interfaceC665370Q7zLJIIJJI2 = C1558360qeg.LJIIJJI(fragment, null);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (interfaceC665370Q7zLJIIJJI2 != null && (iTakoContextAbility2 = (ITakoContextAbility) C1558520qew.LIZ(interfaceC665370Q7zLJIIJJI2, ITakoContextAbility.class, null)) != null && (c13lcAp02 = iTakoContextAbility2.Ap0()) != null && (c1864200yby2 = (C1864200yby) c13lcAp02.LIZIZ()) != null) {
            str = c1864200yby2.LL;
        } else {
            str = null;
        }
        if (iMessageAbility.oj()) {
            C830490Whz c830490Whz = new C830490Whz();
            c830490Whz.put("is_resend", CardStruct.IStatusCode.DEFAULT);
            c830490Whz.put("interaction_type", "recommend_word");
            c830490Whz.put("tako_session_id", str);
            C324800CoI.LIZ.getClass();
            if (C324800CoI.LIZ() && (interfaceC665370Q7zLJIIJJI = C1558360qeg.LJIIJJI(fragment, null)) != null && (iTakoContextAbility = (ITakoContextAbility) C1558520qew.LIZ(interfaceC665370Q7zLJIIJJI, ITakoContextAbility.class, null)) != null && (c13lcAp0 = iTakoContextAbility.Ap0()) != null && (c1864200yby = (C1864200yby) c13lcAp0.LIZIZ()) != null) {
                c830490Whz.put("tako_session_id", c1864200yby.LL);
                c830490Whz.put("session_source", c1864200yby.LLILLJJLI);
            }
            if (C20227614Cs.LIZ(takoEnterParams.botInfo)) {
                LIZ(takoEnterParams, c1862660yZU, iMessageAbility, c830490Whz);
                return true;
            }
            if (C1861940yYK.LIZJ(takoEnterParams.getCarriedRepeatKey())) {
                String string = UUID.randomUUID().toString();
                if (!C1862550yZJ.LIZ(takoEnterParams)) {
                    C1861390yXR.LIZJ = string;
                }
                String autoSendMsgContent = takoEnterParams.getAutoSendMsgContent();
                if (autoSendMsgContent == null) {
                    autoSendMsgContent = "";
                }
                iMessageAbility.Rl2(autoSendMsgContent, true, EnumC1858090yS7.SEARCH_SUG, takoEnterParams.getCommonParams(), c830490Whz, new LinkedHashMap<>(), null, null, "", 0, null, 0, 202, null, null, string, null, null);
                return true;
            }
            LIZ(takoEnterParams, c1862660yZU, iMessageAbility, c830490Whz);
            return true;
        }
        if (C20227614Cs.LIZ(takoEnterParams.botInfo) || (activity = fragment.getActivity()) == null) {
            return true;
        }
        C0DQF.LJIIJJI(activity, fragment, takoEnterParams.getCommonParams(), takoEnterParams.botInfo, 1000L);
        return true;
    }
}
