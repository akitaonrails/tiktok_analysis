package kotlin.jvm.internal;

import X.C013C;
import X.C01GW;
import X.C09AY;
import X.C0DQF;
import X.C0F7E;
import X.C0FNV;
import X.C10GR;
import X.C1160200gIU;
import X.C1161920gLG;
import X.C123100dR;
import X.C127A;
import X.C127K;
import X.C13BV;
import X.C13LC;
import X.C13LP;
import X.C14G0;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1701530uNb;
import X.C1778070wN3;
import X.C1788540wdw;
import X.C1789400wfK;
import X.C1790730whT;
import X.C1801890wzT;
import X.C1801910wzV;
import X.C1809680xC2;
import X.C1810340xD6;
import X.C1810410xDD;
import X.C1810690xDf;
import X.C1812460xGW;
import X.C1836130xsh;
import X.C1836500xtI;
import X.C1845150y7F;
import X.C1851620yHg;
import X.C1851920yIA;
import X.C1855350yNh;
import X.C1855550yO1;
import X.C1856050yOp;
import X.C1856220yP6;
import X.C1857420yR2;
import X.C1858660yT2;
import X.C1859930yV5;
import X.C1860130yVP;
import X.C1862330yYx;
import X.C1862420yZ6;
import X.C1862680yZW;
import X.C1863240yaQ;
import X.C1863370yad;
import X.C1863850ybP;
import X.C1863860ybQ;
import X.C1887230zD7;
import X.C1909107dp;
import X.C1954807lC;
import X.C19741112Lp;
import X.C19EG;
import X.C1DKA;
import X.C20235014Fo;
import X.C20600815jK;
import X.C20627315nb;
import X.C20684815ws;
import X.C2095008Iq;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2248251Cz9;
import X.C2344009Gk;
import X.C259800zU;
import X.C322730Ckx;
import X.C597050NbL;
import X.C665120Q7a;
import X.C724240Sb0;
import X.C786410Ut5;
import X.C946803n0;
import X.DialogC1389620mGW;
import X.DialogInterfaceOnCancelListenerC1864700ycm;
import X.EnumC1791270wiL;
import X.EnumC1801380wye;
import X.EnumC1858730yT9;
import X.InterfaceC1786800wb8;
import X.InterfaceC1788510wdt;
import X.InterfaceC1788520wdu;
import X.InterfaceC1812430xGT;
import X.InterfaceC1812440xGU;
import X.InterfaceC1859950yV7;
import X.InterfaceC1860040yVG;
import X.InterfaceC1860070yVJ;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.RunnableC514801zW;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ARunnableS96S0200000_27;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.rank.impl.list.controller.OfflineRankRootController;
import com.bytedance.android.live.rank.impl.list.controller.RankListController;
import com.bytedance.android.live.rank.impl.list.viewmodel.OfflineRankRootViewModel;
import com.bytedance.android.live.rank.impl.list.viewmodel.RankListViewModel;
import com.bytedance.android.live.rank.impl.page.ui.CreatorRankingSubPageFragment;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.android.livesdk.rank.list.model.RankListV2Response;
import com.bytedance.android.livesdk.rank.model.RankTabInfo;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.keva.Keva;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationParam;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIPlaygroundGenerateParams;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.BottomInputAssem;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.TakoInputViewUIAbility;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.TakoReferenceAskInfo;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.vm.TakoSpeechViewModel;
import com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem;
import com.ss.android.ugc.aweme.tako.botpage.cards.interceptor.TakoInterceptorAssem;
import com.ss.android.ugc.aweme.tako.botpage.components.source.TakoReferenceAssem;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.ITakoScreenTypeAbility;
import com.ss.android.ugc.aweme.tako.camera.record.pageui.TakoRecordUIAssem;
import com.ss.android.ugc.aweme.tako.ccl.model.api.EntityIntro;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.NewActionAIImageItem;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoSug;
import com.ss.android.ugc.aweme.tako.ccl.model.conversation.ConversationInfo;
import com.ss.android.ugc.aweme.tako.model.AIBotInfo;
import com.ss.android.ugc.aweme.tako.model.NimbleParams;
import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import com.ss.android.ugc.aweme.tako.otherpage.entitysug.TakoEntityInfoSheetFragment;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.ss.android.ugc.tiktok.pns.activitycenter.bimetricslock.toggle.ui.ACEntranceUnlockToggleSettingFragment;
import com.ss.android.ugc.tiktok.pns.activitycenter.bimetricslock.toggle.ui.ACEntranceUnlockToggleSettingViewModel;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS373S0200000_7;
import kotlin.jvm.internal.AwS393S0200000_27;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS586S0100000_7;

/* JADX INFO: loaded from: classes28.dex */
public class AwS271S0300000_27 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this);
            case 14:
                return invoke$14(this);
            case 15:
                return invoke$15(this);
            case 16:
                return invoke$16(this);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this);
            case 19:
                return invoke$19(this);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return invoke$20(this);
            case 21:
                return invoke$21(this);
            case 22:
                return invoke$22(this);
            case 23:
                return invoke$23(this);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return invoke$24(this);
            case 25:
                return invoke$25(this);
            case 26:
                return invoke$26(this);
            case 27:
                return invoke$27(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS271S0300000_27 awS271S0300000_27) {
        boolean z;
        String strLIZIZ;
        if (((C1DKA) awS271S0300000_27.l0) != ((C1DKA) awS271S0300000_27.l1)) {
            z = true;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("from [");
            sbLIZ.append((C1DKA) awS271S0300000_27.l0);
            sbLIZ.append("]\n to [");
            sbLIZ.append((C1DKA) awS271S0300000_27.l1);
            sbLIZ.append("], \n source: [");
            sbLIZ.append((C1DKA) awS271S0300000_27.l2);
            sbLIZ.append(']');
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            z = false;
            strLIZIZ = "";
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("context changed: ");
        sbLIZ2.append(z);
        sbLIZ2.append(" after copy; \n ");
        sbLIZ2.append(strLIZIZ);
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    public static final Object invoke$1(AwS271S0300000_27 awS271S0300000_27) {
        ViewModel viewModel = ViewModelProviders.of((Fragment) awS271S0300000_27.l0).get((Class<ViewModel>) OfflineRankRootViewModel.class);
        C1810340xD6 c1810340xD6 = (C1810340xD6) awS271S0300000_27.l1;
        OfflineRankRootController offlineRankRootController = (OfflineRankRootController) awS271S0300000_27.l2;
        OfflineRankRootViewModel offlineRankRootViewModel = (OfflineRankRootViewModel) viewModel;
        offlineRankRootViewModel.LLJJJIL = c1810340xD6.LIZ;
        offlineRankRootViewModel.LLILLL = true;
        offlineRankRootViewModel.LLILLJJLI = true;
        List<RankTabInfo> list = c1810340xD6.LIZJ;
        if (list != null && !list.isEmpty()) {
            offlineRankRootViewModel.yQ2(c1810340xD6);
        }
        offlineRankRootViewModel.LLJJIJIL = offlineRankRootController.LLIZLLLIL;
        return offlineRankRootViewModel;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [T, X.0mGW, android.app.Dialog] */
    public static final Object invoke$10(AwS271S0300000_27 awS271S0300000_27) {
        Context context = ((TakoAnswerBaseAssem) awS271S0300000_27.l0).getContext();
        if (context != null) {
            C259800zU c259800zU = (C259800zU) awS271S0300000_27.l1;
            C013C c013c = (C013C) awS271S0300000_27.l2;
            ?? dialogC1389620mGW = new DialogC1389620mGW(context);
            dialogC1389620mGW.LJJLIIJ(false);
            dialogC1389620mGW.LJJLL(true);
            dialogC1389620mGW.setOnCancelListener(new DialogInterfaceOnCancelListenerC1864700ycm(c013c, 3));
            C0FNV.LIZJ(dialogC1389620mGW);
            c259800zU.element = dialogC1389620mGW;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [T, X.0mGW, android.app.Dialog] */
    public static final Object invoke$11(AwS271S0300000_27 awS271S0300000_27) {
        Context context = ((TakoReferenceAssem) awS271S0300000_27.l0).getContext();
        if (context != null) {
            C259800zU c259800zU = (C259800zU) awS271S0300000_27.l1;
            C013C c013c = (C013C) awS271S0300000_27.l2;
            ?? dialogC1389620mGW = new DialogC1389620mGW(context);
            dialogC1389620mGW.LJJLIIJ(false);
            dialogC1389620mGW.LJJLL(true);
            dialogC1389620mGW.setOnCancelListener(new DialogInterfaceOnCancelListenerC1864700ycm(c013c, 4));
            C0FNV.LIZJ(dialogC1389620mGW);
            c259800zU.element = dialogC1389620mGW;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS271S0300000_27 awS271S0300000_27) {
        Map<String, String> mapLJ;
        String strNZ0;
        String strLJFF = C1859930yV5.LJFF((InterfaceC1860040yVG) awS271S0300000_27.l0);
        TakoInputViewUIAbility takoInputViewUIAbility = (TakoInputViewUIAbility) C1558520qew.LIZ((InterfaceC665370Q7z) awS271S0300000_27.l1, TakoInputViewUIAbility.class, null);
        if (takoInputViewUIAbility != null) {
            takoInputViewUIAbility.Jd(new TakoReferenceAskInfo(strLJFF, ((Message) awS271S0300000_27.l2).msgId), true);
        }
        InterfaceC1859950yV7 textSelector = ((InterfaceC1860040yVG) awS271S0300000_27.l0).getTextSelector();
        if (textSelector != null) {
            textSelector.LIZJ();
        }
        C1862330yYx c1862330yYx = C1862330yYx.LIZ;
        ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) C1558520qew.LIZ((InterfaceC665370Q7z) awS271S0300000_27.l1, ITakoContextAbility.class, null);
        if (iTakoContextAbility == null || (mapLJ = iTakoContextAbility.getCommonParams()) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        ITakoScreenTypeAbility iTakoScreenTypeAbility = (ITakoScreenTypeAbility) C1558520qew.LIZ((InterfaceC665370Q7z) awS271S0300000_27.l1, ITakoScreenTypeAbility.class, null);
        if (iTakoScreenTypeAbility == null || (strNZ0 = iTakoScreenTypeAbility.nZ0()) == null) {
            strNZ0 = "full_screen";
        }
        Message message = (Message) awS271S0300000_27.l2;
        String str = message.uuid;
        C1857420yR2 c1857420yR2 = C1857420yR2.LIZ;
        String strLJJI = C1857420yR2.LJJI(message);
        C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
        c1862330yYx.getClass();
        c20235014FoLIZ.LIZ("tikbot_select_ask_tako", C2097608Jq.LJIIIIZZ(new Pair("enter_from", mapLJ.get("enter_from")), new Pair("enter_method", mapLJ.get("enter_method")), new Pair("process_id", mapLJ.get("process_id")), new Pair("tako_session_id", mapLJ.get("tako_session_id")), new Pair("tako_chat_id", mapLJ.get("tako_chat_id")), new Pair("message_id", str), new Pair("message_type", strLJJI), new Pair("screen_type", strNZ0), new Pair("selected_content", strLJFF)));
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS271S0300000_27 awS271S0300000_27) {
        String selectedText;
        InterfaceC1860070yVJ interfaceC1860070yVJ;
        Map<String, String> mapLJ;
        String str;
        int i;
        int i2;
        InterfaceC1860040yVG interfaceC1860040yVG = (InterfaceC1860040yVG) awS271S0300000_27.l0;
        String str2 = "";
        Map<String, String> commonParams = null;
        if (interfaceC1860040yVG instanceof C1860130yVP) {
            C1860130yVP c1860130yVP = (C1860130yVP) interfaceC1860040yVG;
            C2248251Cz9 textSelector = c1860130yVP.getTextSelector();
            if (textSelector == null || (i = textSelector.LJIIJJI) < 0) {
                i = 0;
            }
            C2248251Cz9 textSelector2 = c1860130yVP.getTextSelector();
            if (textSelector2 != null) {
                i2 = textSelector2.LJIIL;
                int length = c1860130yVP.getText().length();
                if (i2 > length) {
                    i2 = length;
                }
            } else {
                i2 = 0;
            }
            selectedText = C1859930yV5.LJ(c1860130yVP, i, i2, true);
        } else if (!(interfaceC1860040yVG instanceof InterfaceC1860070yVJ) || (interfaceC1860070yVJ = (InterfaceC1860070yVJ) interfaceC1860040yVG) == null || (selectedText = interfaceC1860070yVJ.getSelectedText()) == null) {
            selectedText = "";
        }
        C1857420yR2 c1857420yR2 = C1857420yR2.LIZ;
        C1857420yR2.LJJ(((InterfaceC1860040yVG) awS271S0300000_27.l0).LJJZZI(), selectedText);
        InterfaceC1859950yV7 textSelector3 = ((InterfaceC1860040yVG) awS271S0300000_27.l0).getTextSelector();
        if (textSelector3 != null) {
            textSelector3.LIZJ();
        }
        ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) C1558520qew.LIZ((InterfaceC665370Q7z) awS271S0300000_27.l1, ITakoContextAbility.class, null);
        if (iTakoContextAbility != null) {
            commonParams = iTakoContextAbility.getCommonParams();
        }
        C1862330yYx c1862330yYx = C1862330yYx.LIZ;
        if (commonParams == null) {
            mapLJ = C2097608Jq.LJ();
        } else {
            mapLJ = commonParams;
        }
        String str3 = ((Message) awS271S0300000_27.l2).uuid;
        C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
        c1862330yYx.getClass();
        c20235014FoLIZ.LIZ("tikbot_select_text_copy", C2097608Jq.LJIIIIZZ(new Pair("enter_from", mapLJ.get("enter_from")), new Pair("enter_method", mapLJ.get("enter_method")), new Pair("process_id", mapLJ.get("process_id")), new Pair("message_id", str3), new Pair("copied_content", selectedText)));
        C1862420yZ6 c1862420yZ6 = C1862420yZ6.LIZ;
        if (commonParams != null && (str = commonParams.get("process_id")) != null) {
            str2 = str;
        }
        String str4 = ((Message) awS271S0300000_27.l2).uuid;
        String type = EnumC1858730yT9.COPY.getType();
        c1862420yZ6.getClass();
        C1862420yZ6.LIZ(str2, str4, type);
        return Unit.LIZ;
    }

    public static final Object invoke$14(AwS271S0300000_27 awS271S0300000_27) {
        C1859930yV5.LJI((InterfaceC1860040yVG) awS271S0300000_27.l0, (Message) awS271S0300000_27.l1, (InterfaceC665370Q7z) awS271S0300000_27.l2, true, null, 16);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$15(AwS271S0300000_27 awS271S0300000_27) {
        C0F7E c0f7e = (C0F7E) awS271S0300000_27.l0;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0f7e);
        c0f7e.setAlpha(1.0f);
        HandlerHook.viewPostDelay(((TakoRecordUIAssem) awS271S0300000_27.l1).getContentView(), new RunnableC514801zW((Function0) awS271S0300000_27.l2, (Function0<Unit>) 100), 300L);
        return Unit.LIZ;
    }

    public static final Object invoke$16(AwS271S0300000_27 awS271S0300000_27) {
        return new C1788540wdw((InterfaceC1786800wb8) awS271S0300000_27.l0, (InterfaceC1788520wdu) awS271S0300000_27.l2, (InterfaceC1788510wdt) awS271S0300000_27.l1);
    }

    public static final Object invoke$17(AwS271S0300000_27 awS271S0300000_27) {
        return new C1789400wfK((InterfaceC1786800wb8) awS271S0300000_27.l2, (InterfaceC1788520wdu) awS271S0300000_27.l0, (InterfaceC1788510wdt) awS271S0300000_27.l1);
    }

    public static final Object invoke$18(AwS271S0300000_27 awS271S0300000_27) {
        C1851920yIA c1851920yIA = C1851920yIA.LIZ;
        Map map = (Map) awS271S0300000_27.l0;
        c1851920yIA.getClass();
        C1851920yIA.LIZJ("Open settings", map);
        C19741112Lp c19741112Lp = C19741112Lp.LIZ;
        Context context = (Context) awS271S0300000_27.l1;
        c19741112Lp.getClass();
        C19741112Lp.LJIIIIZZ(context);
        ((Function0) awS271S0300000_27.l2).invoke();
        return Unit.LIZ;
    }

    public static final Object invoke$19(AwS271S0300000_27 awS271S0300000_27) {
        String str;
        IMessageAbility iMessageAbility = (IMessageAbility) awS271S0300000_27.l0;
        C665120Q7a c665120Q7a = (C665120Q7a) awS271S0300000_27.l1;
        NimbleParams nimbleParams = ((TakoEnterParams) awS271S0300000_27.l2).getNimbleParams();
        if (nimbleParams != null) {
            str = nimbleParams.storageKey;
        } else {
            str = null;
        }
        iMessageAbility.MF0(c665120Q7a, str);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS271S0300000_27 awS271S0300000_27) {
        AIGCGenerationParam aIGCGenerationParam = (AIGCGenerationParam) awS271S0300000_27.l0;
        AIPlaygroundGenerateParams aIPlaygroundGenerateParams = (AIPlaygroundGenerateParams) awS271S0300000_27.l1;
        ((C1851620yHg) awS271S0300000_27.l2).i3(new AwS606S0100000_27(AIGCGenerationParam.LIZ(aIGCGenerationParam, null, null, null, null, null, null, false, 0, false, null, new AIPlaygroundGenerateParams(aIPlaygroundGenerateParams.aiPlaygroundGenerationType, C13BV.INSTANCE), null, null, -16777217, 7), 88));
        return Unit.LIZ;
    }

    public static final Object invoke$20(AwS271S0300000_27 awS271S0300000_27) {
        C0DQF c0dqf = C0DQF.LIZ;
        Activity activity = (Activity) awS271S0300000_27.l0;
        C1863860ybQ c1863860ybQ = (C1863860ybQ) awS271S0300000_27.l1;
        Map<String, String> commonParams = ((ITakoContextAbility) awS271S0300000_27.l2).getCommonParams();
        long j = ((C1863850ybP) ((ITakoContextAbility) awS271S0300000_27.l2).T71().LIZIZ()).LLJJ;
        int i = ((C1863850ybP) ((ITakoContextAbility) awS271S0300000_27.l2).T71().LIZIZ()).LLJJI;
        String str = ((C1863850ybP) ((ITakoContextAbility) awS271S0300000_27.l2).T71().LIZIZ()).LLJJIII;
        if (str == null) {
            str = "";
        }
        c0dqf.LJIIL(activity, c1863860ybQ, commonParams, new AIBotInfo(j, str, null, i, 0, 0, null, null, false, false, false, null, null, null, null, null, null, null, false, null, null, null, null, 8388596, null));
        return Unit.LIZ;
    }

    public static final Object invoke$21(AwS271S0300000_27 awS271S0300000_27) {
        C0DQF c0dqf = C0DQF.LIZ;
        Activity activity = (Activity) awS271S0300000_27.l0;
        C1887230zD7 c1887230zD7 = (C1887230zD7) awS271S0300000_27.l1;
        Map<String, String> commonParams = ((ITakoContextAbility) awS271S0300000_27.l2).getCommonParams();
        long j = ((C1863850ybP) ((ITakoContextAbility) awS271S0300000_27.l2).T71().LIZIZ()).LLJJ;
        int i = ((C1863850ybP) ((ITakoContextAbility) awS271S0300000_27.l2).T71().LIZIZ()).LLJJI;
        String str = ((C1863850ybP) ((ITakoContextAbility) awS271S0300000_27.l2).T71().LIZIZ()).LLJJIII;
        if (str == null) {
            str = "";
        }
        c0dqf.LJIIL(activity, c1887230zD7, commonParams, new AIBotInfo(j, str, null, i, 0, 0, null, null, false, false, false, null, null, null, null, null, null, null, false, null, null, null, null, 8388596, null));
        return Unit.LIZ;
    }

    public static final Object invoke$22(AwS271S0300000_27 awS271S0300000_27) {
        String str;
        C1862330yYx c1862330yYx = C1862330yYx.LIZ;
        Map<String, String> commonParams = ((BottomInputAssem) awS271S0300000_27.l0).getCommonParams();
        C1855550yO1 c1855550yO1 = ((BottomInputAssem) awS271S0300000_27.l0).LLLFZ;
        if (c1855550yO1 != null && c1855550yO1.LIZJ) {
            str = "button_click";
        } else {
            str = "long_press";
        }
        c1862330yYx.getClass();
        C1862330yYx.LLFFF("finger_off", str, commonParams);
        ((TakoSpeechViewModel) awS271S0300000_27.l1).yQ2(EnumC1801380wye.CANCEL);
        ((C1855350yNh) awS271S0300000_27.l2).LIZ(false);
        return Unit.LIZ;
    }

    public static final Object invoke$23(AwS271S0300000_27 awS271S0300000_27) {
        Map<String, String> mapLJ;
        long j;
        int i;
        String str;
        C13LC<C1863850ybP> c13lcT71;
        C1863850ybP c1863850ybP;
        C13LC<C1863850ybP> c13lcT712;
        C1863850ybP c1863850ybP2;
        C13LC<C1863850ybP> c13lcT713;
        C1863850ybP c1863850ybP3;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        C13LC<C1863850ybP> c13lcT714;
        C1863850ybP c1863850ybP4;
        String str7;
        C13LC<C1863850ybP> c13lcT715;
        C1863850ybP c1863850ybP5;
        Integer numLJIIJJI;
        C13LC<C1863850ybP> c13lcT716;
        C1863850ybP c1863850ybP6;
        C13LC<C1863850ybP> c13lcT717;
        C1863850ybP c1863850ybP7;
        C13LC<C1863850ybP> c13lcT718;
        C1863850ybP c1863850ybP8;
        AssemVMLazy assemVMLazy = ((TakoInterceptorAssem) awS271S0300000_27.l0).LLJLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = TakoInterceptorAssem.LLJLLIL;
        if (!((C1160200gIU) assemVMLazy.getValue().getState()).LL.LIZ.booleanValue()) {
            String str8 = null;
            IMessageAbility iMessageAbility = (IMessageAbility) C1558520qew.LIZ(C1558520qew.LJIIL((TakoInterceptorAssem) awS271S0300000_27.l0), IMessageAbility.class, null);
            if (iMessageAbility != null) {
                C322730Ckx c322730Ckx = (C322730Ckx) awS271S0300000_27.l1;
                TakoInterceptorAssem takoInterceptorAssem = (TakoInterceptorAssem) awS271S0300000_27.l0;
                TuxTextView tuxTextView = (TuxTextView) awS271S0300000_27.l2;
                String str9 = "";
                if (iMessageAbility.oj()) {
                    iMessageAbility.IW1(c322730Ckx.LLILLJJLI.LLILLL);
                } else {
                    C19EG c19egLIZ = C724240Sb0.LIZ(takoInterceptorAssem);
                    if (c19egLIZ != null) {
                        C0DQF c0dqf = C0DQF.LIZ;
                        takoInterceptorAssem.getClass();
                        ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) C1558520qew.LIZ(C1558520qew.LJIIL(takoInterceptorAssem), ITakoContextAbility.class, null);
                        if (iTakoContextAbility == null || (mapLJ = iTakoContextAbility.getCommonParams()) == null) {
                            mapLJ = C2097608Jq.LJ();
                        }
                        ITakoContextAbility iTakoContextAbility2 = (ITakoContextAbility) C1558520qew.LIZ(C1558520qew.LJIIL(takoInterceptorAssem), ITakoContextAbility.class, null);
                        if (iTakoContextAbility2 != null && (c13lcT713 = iTakoContextAbility2.T71()) != null && (c1863850ybP3 = (C1863850ybP) c13lcT713.LIZIZ()) != null) {
                            j = c1863850ybP3.LLJJ;
                        } else {
                            j = 0;
                        }
                        ITakoContextAbility iTakoContextAbility3 = (ITakoContextAbility) C1558520qew.LIZ(C1558520qew.LJIIL(takoInterceptorAssem), ITakoContextAbility.class, null);
                        if (iTakoContextAbility3 != null && (c13lcT712 = iTakoContextAbility3.T71()) != null && (c1863850ybP2 = (C1863850ybP) c13lcT712.LIZIZ()) != null) {
                            i = c1863850ybP2.LLJJI;
                        } else {
                            i = 0;
                        }
                        ITakoContextAbility iTakoContextAbility4 = (ITakoContextAbility) C1558520qew.LIZ(C1558520qew.LJIIL(takoInterceptorAssem), ITakoContextAbility.class, null);
                        if (iTakoContextAbility4 == null || (c13lcT71 = iTakoContextAbility4.T71()) == null || (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) == null || (str = c1863850ybP.LLJJIII) == null) {
                            str = "";
                        }
                        c0dqf.LJIIL(c19egLIZ, tuxTextView, mapLJ, new AIBotInfo(j, str, null, i, 0, 0, null, null, false, false, false, null, null, null, null, null, null, null, false, null, null, null, null, 8388596, null));
                    }
                }
                Message message = c322730Ckx.LLILLJJLI.LLILLL;
                String str10 = message.uuid;
                TakoMixFeed takoMixFeedLJIIIZ = message.LJIIIZ();
                if (takoMixFeedLJIIIZ != null) {
                    str2 = takoMixFeedLJIIIZ.msgExt.get("source_card_type");
                } else {
                    str2 = null;
                }
                takoInterceptorAssem.getClass();
                C1862330yYx c1862330yYx = C1862330yYx.LIZ;
                ITakoContextAbility iTakoContextAbilityOp = takoInterceptorAssem.op();
                if (iTakoContextAbilityOp != null && (c13lcT718 = iTakoContextAbilityOp.T71()) != null && (c1863850ybP8 = (C1863850ybP) c13lcT718.LIZIZ()) != null) {
                    str3 = c1863850ybP8.LL;
                } else {
                    str3 = null;
                }
                ITakoContextAbility iTakoContextAbilityOp2 = takoInterceptorAssem.op();
                if (iTakoContextAbilityOp2 != null && (c13lcT717 = iTakoContextAbilityOp2.T71()) != null && (c1863850ybP7 = (C1863850ybP) c13lcT717.LIZIZ()) != null) {
                    str4 = c1863850ybP7.LLILLJJLI;
                } else {
                    str4 = null;
                }
                ITakoContextAbility iTakoContextAbilityOp3 = takoInterceptorAssem.op();
                if (iTakoContextAbilityOp3 != null && (c13lcT716 = iTakoContextAbilityOp3.T71()) != null && (c1863850ybP6 = (C1863850ybP) c13lcT716.LIZIZ()) != null) {
                    str8 = c1863850ybP6.LLILZIL;
                }
                if (str2 != null && (numLJIIJJI = C2095008Iq.LJIIJJI(str2)) != null && numLJIIJJI.intValue() == 301) {
                    str5 = "image_generation";
                } else {
                    str5 = "text_generation";
                }
                ITakoContextAbility iTakoContextAbilityOp4 = takoInterceptorAssem.op();
                if (iTakoContextAbilityOp4 == null || (c13lcT715 = iTakoContextAbilityOp4.T71()) == null || (c1863850ybP5 = (C1863850ybP) c13lcT715.LIZIZ()) == null || (str6 = c1863850ybP5.LLILZLL) == null) {
                    str6 = "";
                }
                ITakoContextAbility iTakoContextAbilityOp5 = takoInterceptorAssem.op();
                if (iTakoContextAbilityOp5 != null && (c13lcT714 = iTakoContextAbilityOp5.T71()) != null && (c1863850ybP4 = (C1863850ybP) c13lcT714.LIZIZ()) != null && (str7 = c1863850ybP4.LLIZ) != null) {
                    str9 = str7;
                }
                C1862330yYx.LJJLIIIJILLIZJL(c1862330yYx, str3, str4, str8, str10, str5, "try again", str6, str9);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$24(AwS271S0300000_27 awS271S0300000_27) {
        IInteractService iInteractService = (IInteractService) C1161920gLG.LIZJ(IInteractService.class);
        ((C1812460xGW) awS271S0300000_27.l0).getClass();
        InterfaceC1812430xGT interfaceC1812430xGT = (InterfaceC1812430xGT) C1909107dp.LIZJ(InterfaceC1812430xGT.class, null);
        interfaceC1812430xGT.setDisplayStatusMap(iInteractService.yh0(((InterfaceC1812440xGU) awS271S0300000_27.l2).getUidList()));
        ((CompletionBlock) awS271S0300000_27.l1).onSuccess(interfaceC1812430xGT, "");
        return Unit.LIZ;
    }

    public static final Object invoke$25(AwS271S0300000_27 awS271S0300000_27) {
        ((C1845150y7F) awS271S0300000_27.l0).LIZIZ = false;
        ((C1845150y7F) awS271S0300000_27.l0).LIZ((Activity) awS271S0300000_27.l1, (Function1) awS271S0300000_27.l2);
        return Unit.LIZ;
    }

    public static final Object invoke$26(AwS271S0300000_27 awS271S0300000_27) {
        HandlerHook.viewPost((ViewOnAttachStateChangeListenerC20604515jv) awS271S0300000_27.l0, new ARunnableS96S0200000_27((CreatorRankingSubPageFragment) awS271S0300000_27.l1, (C1778070wN3) awS271S0300000_27.l2, 33));
        return Unit.LIZ;
    }

    public static final Object invoke$27(AwS271S0300000_27 awS271S0300000_27) {
        String str;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "activity_center_setting");
        if (((C127A) awS271S0300000_27.l0).LJIILIIL()) {
            str = "on";
        } else {
            str = "off";
        }
        c2344009Gk.LJIIIIZZ("from_status", str);
        c2344009Gk.LJIIIIZZ("biometric_type", "fingerprint");
        C20684815ws.LJIILLIIL("click_biometric_unlock", c2344009Gk.LIZ);
        if (((C127A) awS271S0300000_27.l0).LJIILIIL()) {
            ((ACEntranceUnlockToggleSettingFragment) awS271S0300000_27.l1).PR(((C127A) awS271S0300000_27.l0).LJIILIIL(), !((C127A) awS271S0300000_27.l0).LJIILIIL());
            ACEntranceUnlockToggleSettingViewModel aCEntranceUnlockToggleSettingViewModelNR = ((ACEntranceUnlockToggleSettingFragment) awS271S0300000_27.l1).NR();
            boolean z = !((C127A) awS271S0300000_27.l0).LJIILIIL();
            aCEntranceUnlockToggleSettingViewModelNR.getClass();
            String currentUserID = ((IUserService) aCEntranceUnlockToggleSettingViewModelNR.LLILLJJLI.getValue()).getCurrentUserID();
            C01GW c01gw = C1801890wzT.LIZ;
            Keva keva = (Keva) c01gw.getValue();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Toggle_");
            sbLIZ.append(currentUserID);
            keva.storeBoolean(C2188811AlT.LIZIZ(sbLIZ), z);
            if (z) {
                Keva keva2 = (Keva) c01gw.getValue();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("HasSet_");
                sbLIZ2.append(currentUserID);
                keva2.storeBoolean(C2188811AlT.LIZIZ(sbLIZ2), true);
            }
            aCEntranceUnlockToggleSettingViewModelNR.LL.postValue(Boolean.valueOf(z));
        } else {
            C1836500xtI c1836500xtI = C1836500xtI.LIZ;
            Context context = ((C127K) awS271S0300000_27.l2).getContext();
            c1836500xtI.getClass();
            int i = C1801910wzV.LIZ[C1836500xtI.LIZ(context).ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        ACEntranceUnlockToggleSettingViewModel aCEntranceUnlockToggleSettingViewModelNR2 = ((ACEntranceUnlockToggleSettingFragment) awS271S0300000_27.l1).NR();
                        Context context2 = ((C127K) awS271S0300000_27.l2).getContext();
                        AwS393S0200000_27 awS393S0200000_27 = new AwS393S0200000_27((ACEntranceUnlockToggleSettingFragment) awS271S0300000_27.l1, (C127A) awS271S0300000_27.l0, 177);
                        aCEntranceUnlockToggleSettingViewModelNR2.getClass();
                        String currentUserID2 = ((IUserService) aCEntranceUnlockToggleSettingViewModelNR2.LLILLJJLI.getValue()).getCurrentUserID();
                        Keva keva3 = (Keva) C1801890wzT.LIZ.getValue();
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("HasSet_");
                        sbLIZ3.append(currentUserID2);
                        if (keva3.getBoolean(C2188811AlT.LIZIZ(sbLIZ3), false)) {
                            awS393S0200000_27.invoke(EnumC1791270wiL.SUCCEED);
                        } else {
                            AwS606S0100000_27 awS606S0100000_27 = new AwS606S0100000_27(awS393S0200000_27, 647);
                            c1836500xtI.getClass();
                            C1836500xtI.LIZIZ(context2, "activity_center_setting", "biometric_unlock", awS606S0100000_27);
                        }
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    ((ACEntranceUnlockToggleSettingFragment) awS271S0300000_27.l1).OR(((C127A) awS271S0300000_27.l0).LJIILIIL(), EnumC1791270wiL.FAILED);
                }
            } else {
                final Context context3 = ((C127K) awS271S0300000_27.l2).getContext();
                final LifecycleOwner viewLifecycleOwner = ((ACEntranceUnlockToggleSettingFragment) awS271S0300000_27.l1).getViewLifecycleOwner();
                PopupManager.LJIJI(new C10GR(context3, viewLifecycleOwner) { // from class: X.0yIN
                    public final Context LL;
                    public final LifecycleOwner LLILLJJLI;
                    public final int LLILLL = 8001;

                    @Override // X.InterfaceC20660415sw
                    public final C688120Qyw i2() {
                        return new C688120Qyw(this.LL, this.LLILLJJLI, null);
                    }

                    @Override // X.InterfaceC20660515sx
                    public final int getPriority() {
                        return this.LLILLL;
                    }

                    {
                        this.LL = context3;
                        this.LLILLJJLI = viewLifecycleOwner;
                    }

                    @Override // X.InterfaceC20659015si
                    public final void LJFF(C688120Qyw c688120Qyw, C20656615sK c20656615sK) {
                        C1836500xtI c1836500xtI2 = C1836500xtI.LIZ;
                        Context context4 = c688120Qyw.LIZ;
                        AwS571S0100000_27 awS571S0100000_27 = new AwS571S0100000_27(c20656615sK, 1345);
                        c1836500xtI2.getClass();
                        C2344009Gk c2344009Gk2 = new C2344009Gk();
                        c2344009Gk2.LJIIIIZZ("enter_from", "activity_center_setting");
                        c2344009Gk2.LJIIIIZZ("business", "activity_center");
                        c2344009Gk2.LJIIIIZZ("popup_key", "activity_center_biometric_setup");
                        c2344009Gk2.LJIIIIZZ("biometric_type", "fingerprint");
                        AwS586S0100000_7 awS586S0100000_7 = new AwS586S0100000_7(c2344009Gk2, 563);
                        C1397580mTM c1397580mTM = new C1397580mTM(context4);
                        c1397580mTM.LJI(context4.getString(2131834578));
                        c1397580mTM.LIZIZ(context4.getString(2131834575));
                        C985403tE.LIZ(c1397580mTM, new AwS373S0200000_7(context4, awS586S0100000_7, 90));
                        c1397580mTM.LIZLLL(new AwS393S0200000_27(awS571S0100000_27, awS586S0100000_7, 150));
                        new C1397510mTF(c1397580mTM).LIZLLL();
                        C20684815ws.LJIILLIIL("pns_popup_shown", c2344009Gk2.LIZ);
                    }
                }, true);
            }
        }
        return Boolean.TRUE;
    }

    public static final Object invoke$3(AwS271S0300000_27 awS271S0300000_27) {
        ((C1836130xsh) awS271S0300000_27.l1).LIZJ(((Function2) awS271S0300000_27.l0).invoke(((C1836130xsh) awS271S0300000_27.l1).LIZIZ, ((C1836130xsh) awS271S0300000_27.l2).LIZIZ));
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS271S0300000_27 awS271S0300000_27) {
        ((BottomInputAssem) awS271S0300000_27.l0).ip();
        BottomInputAssem bottomInputAssem = (BottomInputAssem) awS271S0300000_27.l0;
        bottomInputAssem.na("convert_style", new AwS304S0300000_27(bottomInputAssem, (Context) awS271S0300000_27.l1, (NewActionAIImageItem) awS271S0300000_27.l2, 3));
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS271S0300000_27 awS271S0300000_27) {
        Lifecycle lifecycle;
        Map<String, String> commonParams;
        C20600815jK<InterfaceC1891350zJl> state;
        C1863240yaQ c1863240yaQ = (C1863240yaQ) awS271S0300000_27.l0;
        c1863240yaQ.LLJJJ = ((ConversationInfo) awS271S0300000_27.l1).subConversationId;
        List<InterfaceC1891350zJl> list = c1863240yaQ.LLJJIJIL;
        ArrayList<C1863370yad> arrayList = new ArrayList();
        for (Object obj : (ArrayList) list) {
            if (obj instanceof C1863370yad) {
                arrayList.add(obj);
            }
        }
        C1863240yaQ c1863240yaQ2 = (C1863240yaQ) awS271S0300000_27.l0;
        for (C1863370yad c1863370yad : arrayList) {
            c1863370yad.LLILZ = Intrinsics.LJFF(c1863370yad.LL.subConversationId, c1863240yaQ2.LLJJJ);
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = ((C1863240yaQ) awS271S0300000_27.l0).LLILLL;
        String str = null;
        if (viewOnAttachStateChangeListenerC20604515jv != null && (state = viewOnAttachStateChangeListenerC20604515jv.getState()) != null) {
            state.LJIILL(((C1863240yaQ) awS271S0300000_27.l0).LLJJIJIL, null);
        }
        IMessageAbility iMessageAbility = (IMessageAbility) C1558520qew.LIZ(C1558360qeg.LJ((C1863240yaQ) awS271S0300000_27.l0, null), IMessageAbility.class, null);
        if (iMessageAbility != null) {
            iMessageAbility.po1((Context) awS271S0300000_27.l2, (ConversationInfo) awS271S0300000_27.l1);
        }
        ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) C1558520qew.LIZ(C1558360qeg.LJ((C1863240yaQ) awS271S0300000_27.l0, null), ITakoContextAbility.class, null);
        if (iTakoContextAbility != null) {
            iTakoContextAbility.PG0(new C14G0(((ConversationInfo) awS271S0300000_27.l1).subConversationId, "history"));
        }
        String str2 = ((ConversationInfo) awS271S0300000_27.l1).subConversationId;
        if (str2 == null) {
            str2 = "";
        }
        C1862680yZW.LJ(C1558360qeg.LJ((C1863240yaQ) awS271S0300000_27.l0, null), str2, "history");
        Fragment fragmentLIZ = C946803n0.LIZ((C1863240yaQ) awS271S0300000_27.l0);
        if (fragmentLIZ != null && (lifecycle = fragmentLIZ.getLifecycle()) != null) {
            C1863240yaQ c1863240yaQ3 = (C1863240yaQ) awS271S0300000_27.l0;
            ConversationInfo conversationInfo = (ConversationInfo) awS271S0300000_27.l1;
            ITakoContextAbility iTakoContextAbility2 = (ITakoContextAbility) C1558520qew.LIZ(C1558360qeg.LJ(c1863240yaQ3, null), ITakoContextAbility.class, null);
            if (iTakoContextAbility2 != null && (commonParams = iTakoContextAbility2.getCommonParams()) != null) {
                str = commonParams.get("process_id");
            }
            C1701530uNb.LIZJ(lifecycle, C1701530uNb.LIZLLL(str, conversationInfo.subConversationId));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS271S0300000_27 awS271S0300000_27) {
        String str;
        C20600815jK<InterfaceC1891350zJl> state;
        List<String> list;
        Integer num;
        EntityIntro entityIntro = ((TakoEntityInfoSheetFragment) awS271S0300000_27.l0).LLJJJJJIL;
        if (entityIntro != null) {
            str = entityIntro.content;
        } else {
            str = null;
        }
        boolean z = true;
        if (C123100dR.LIZ(str) || ((num = (Integer) awS271S0300000_27.l1) != null && num.intValue() == 1)) {
            TakoSug takoSug = (TakoSug) awS271S0300000_27.l2;
            if (takoSug == null || (list = takoSug.sugList) == null || !(!list.isEmpty())) {
                z = false;
            }
            if (z) {
                TakoEntityInfoSheetFragment takoEntityInfoSheetFragment = (TakoEntityInfoSheetFragment) awS271S0300000_27.l0;
                TakoSug takoSug2 = (TakoSug) awS271S0300000_27.l2;
                View view = takoEntityInfoSheetFragment.LLJJIJI;
                if (view != null) {
                    C786410Ut5.LJLLLLLL(8, view);
                }
                C20627315nb c20627315nb = takoEntityInfoSheetFragment.LLJJI;
                if (c20627315nb != null) {
                    C786410Ut5.LLLZLL(c20627315nb, 8);
                }
                TuxTextView tuxTextView = takoEntityInfoSheetFragment.LLJJ;
                if (tuxTextView != null) {
                    C786410Ut5.LLLLZLL(tuxTextView, 0);
                }
                ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = takoEntityInfoSheetFragment.LLJJIII;
                if (viewOnAttachStateChangeListenerC20604515jv != null) {
                    C786410Ut5.LLF(0, viewOnAttachStateChangeListenerC20604515jv);
                }
                ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = takoEntityInfoSheetFragment.LLJJIII;
                if (viewOnAttachStateChangeListenerC20604515jv2 != null && (state = viewOnAttachStateChangeListenerC20604515jv2.getState()) != null) {
                    int size = takoSug2.sugList.size();
                    ArrayList arrayList = new ArrayList(size);
                    for (int i = 0; i < size; i++) {
                        InterfaceC665370Q7z interfaceC665370Q7z = takoEntityInfoSheetFragment.LLJJJJLIIL;
                        String str2 = takoEntityInfoSheetFragment.LLJJJIL;
                        Message message = takoEntityInfoSheetFragment.LLJJL;
                        String str3 = takoEntityInfoSheetFragment.LLJJLIIIJLLLLLLLZ;
                        String str4 = (String) C1856050yOp.LIZ(i, takoSug2.sugList);
                        if (str4 == null) {
                            str4 = "";
                        }
                        arrayList.add(new C1856220yP6(interfaceC665370Q7z, str2, str4, Integer.valueOf(i), Integer.valueOf(takoSug2.sugList.size()), message, str3, takoEntityInfoSheetFragment.LLJJJJ, false, new AwS571S0100000_27(takoEntityInfoSheetFragment, 1267)));
                    }
                    state.LJIILL(C13LP.LL(arrayList, 4), null);
                }
            } else {
                TakoEntityInfoSheetFragment takoEntityInfoSheetFragment2 = (TakoEntityInfoSheetFragment) awS271S0300000_27.l0;
                View view2 = takoEntityInfoSheetFragment2.LLJJIJI;
                if (view2 != null) {
                    C786410Ut5.LJLLLLLL(0, view2);
                }
                TuxTextView tuxTextView2 = takoEntityInfoSheetFragment2.LLJJ;
                if (tuxTextView2 != null) {
                    C786410Ut5.LLLLZLL(tuxTextView2, 8);
                }
                C20627315nb c20627315nb2 = takoEntityInfoSheetFragment2.LLJJI;
                if (c20627315nb2 != null) {
                    C786410Ut5.LLLZLL(c20627315nb2, 8);
                }
                ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv3 = takoEntityInfoSheetFragment2.LLJJIII;
                if (viewOnAttachStateChangeListenerC20604515jv3 != null) {
                    C786410Ut5.LLF(8, viewOnAttachStateChangeListenerC20604515jv3);
                }
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x009f A[PHI: r1
      0x009f: PHI (r1v1 androidx.fragment.app.Fragment) = (r1v0 androidx.fragment.app.Fragment), (r1v3 androidx.fragment.app.Fragment) binds: [B:39:0x009c, B:35:0x0092] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$7(kotlin.jvm.internal.AwS271S0300000_27 r5) {
        /*
            java.lang.Object r0 = r5.l0
            com.bytedance.android.live.rank.impl.list.controller.RankListController r0 = (com.bytedance.android.live.rank.impl.list.controller.RankListController) r0
            if (r0 == 0) goto L7e
            com.bytedance.android.live.rank.impl.list.controller.RankPageController r0 = r0.LLILZIL
            if (r0 == 0) goto L7e
            com.bytedance.android.live.rank.impl.list.controller.RankRootController r0 = r0.LLILZLL
            if (r0 == 0) goto L7e
            androidx.fragment.app.Fragment r0 = r0.LLILLJJLI
            if (r0 == 0) goto L7e
            android.view.View r0 = r0.getView()
            if (r0 == 0) goto L7e
            int r0 = r0.getHeight()
        L1c:
            float r0 = X.C497740JfY.LJJI(r0)
            int r0 = (int) r0
            java.lang.String r4 = java.lang.String.valueOf(r0)
            java.lang.Object r0 = r5.l1
            com.bytedance.android.livesdk.rank.list.model.RankListV2Response$Gap r0 = (com.bytedance.android.livesdk.rank.list.model.RankListV2Response.Gap) r0
            java.lang.String r1 = ""
            if (r0 == 0) goto L39
            com.bytedance.android.livesdk.rank.list.model.RankListV2Response$GapExtra r0 = r0.gapExtra
            if (r0 == 0) goto L39
            com.bytedance.android.livesdk.rank.list.model.RankListV2Response$BottomBarAnchorSkipStruct r0 = r0.skipInfo
            if (r0 == 0) goto L39
            java.lang.String r0 = r0.skipSchema
            if (r0 != 0) goto L3a
        L39:
            r0 = r1
        L3a:
            android.net.Uri r3 = com.bytedance.mt.protector.impl.UriProtector.parse(r0)
            java.lang.String r2 = "url"
            java.lang.String r0 = com.bytedance.mt.protector.impl.UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(r3, r2)
            if (r0 == 0) goto L47
            r1 = r0
        L47:
            android.net.Uri r0 = com.bytedance.mt.protector.impl.UriProtector.parse(r1)
            android.net.Uri$Builder r0 = r0.buildUpon()
            java.lang.String r1 = "height"
            r0.appendQueryParameter(r1, r4)
            java.lang.String r0 = r0.toString()
            android.net.Uri r0 = X.C500260Jjc.LJJL(r3, r2, r0)
            android.net.Uri$Builder r0 = r0.buildUpon()
            android.net.Uri$Builder r0 = r0.appendQueryParameter(r1, r4)
            android.net.Uri r0 = r0.build()
            java.lang.String r2 = r0.toString()
            java.lang.Class<com.bytedance.android.live.actionhandler.IActionHandlerService> r0 = com.bytedance.android.live.actionhandler.IActionHandlerService.class
            X.006A r1 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.live.actionhandler.IActionHandlerService r1 = (com.bytedance.android.live.actionhandler.IActionHandlerService) r1
            java.lang.Object r0 = r5.l2
            android.content.Context r0 = (android.content.Context) r0
            r1.handle(r0, r2)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L7e:
            java.lang.Object r2 = r5.l0
            com.bytedance.android.live.rank.impl.list.controller.RankListController r2 = (com.bytedance.android.live.rank.impl.list.controller.RankListController) r2
            if (r2 == 0) goto L9b
            com.bytedance.android.live.rank.impl.list.controller.RankPageController r0 = r2.LLILZIL
            if (r0 == 0) goto L9b
            com.bytedance.android.live.rank.impl.list.controller.RankRootController r0 = r0.LLILZLL
            if (r0 == 0) goto L9b
            androidx.fragment.app.Fragment r1 = r0.LLILLJJLI
        L8e:
            com.bytedance.android.live.rank.impl.list.viewmodel.RankRootViewModel r0 = r2.LIZ()
            if (r0 == 0) goto L9f
            boolean r0 = r0.LLILLJJLI
        L96:
            int r0 = X.C760380TsC.LIZ(r1, r0)
            goto L1c
        L9b:
            r1 = 0
            if (r2 == 0) goto L9f
            goto L8e
        L9f:
            r0 = 1
            goto L96
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS271S0300000_27.invoke$7(kotlin.jvm.internal.AwS271S0300000_27):java.lang.Object");
    }

    public static final Object invoke$8(AwS271S0300000_27 awS271S0300000_27) {
        RankListViewModel rankListViewModelLJIIIZ;
        RankListV2Response.RankView rankView;
        RankListController rankListController = (RankListController) awS271S0300000_27.l0;
        if (rankListController != null && (rankListViewModelLJIIIZ = rankListController.LJIIIZ()) != null && (rankView = rankListViewModelLJIIIZ.LLILLJJLI) != null) {
            RankListController rankListController2 = (RankListController) awS271S0300000_27.l0;
            C1809680xC2 c1809680xC2 = (C1809680xC2) awS271S0300000_27.l1;
            DataChannel dataChannel = (DataChannel) awS271S0300000_27.l2;
            if (rankListController2 != null) {
                rankListController2.LIZIZ(new C1790730whT(c1809680xC2.LIZ, rankView.ruleUrl));
            }
            C1810690xDf c1810690xDf = C1810690xDf.LIZ;
            C1810410xDD c1810410xDD = c1809680xC2.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(c1809680xC2.LIZ.LIZIZ.rankName);
            sbLIZ.append("_unstable_location");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c1810690xDf.getClass();
            C1810690xDf.LJIILJJIL(c1810410xDD, rankView, dataChannel, strLIZIZ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS271S0300000_27 awS271S0300000_27) {
        RankListViewModel rankListViewModelLJIIIZ;
        RankListV2Response.RankView rankView;
        RankListController rankListController = (RankListController) awS271S0300000_27.l0;
        if (rankListController != null && (rankListViewModelLJIIIZ = rankListController.LJIIIZ()) != null && (rankView = rankListViewModelLJIIIZ.LLILLJJLI) != null) {
            RankListController rankListController2 = (RankListController) awS271S0300000_27.l0;
            C1809680xC2 c1809680xC2 = (C1809680xC2) awS271S0300000_27.l1;
            DataChannel dataChannel = (DataChannel) awS271S0300000_27.l2;
            if (rankListController2 != null) {
                rankListController2.LIZIZ(new C1790730whT(c1809680xC2.LIZ, rankView.ruleUrl));
            }
            C1810690xDf c1810690xDf = C1810690xDf.LIZ;
            C1810410xDD c1810410xDD = c1809680xC2.LIZ;
            c1810690xDf.getClass();
            C1810690xDf.LJIILJJIL(c1810410xDD, rankView, dataChannel, "rookie_star_rank_bottom_bar");
        }
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS271S0300000_27(X.InterfaceC665370Q7z r3, X.InterfaceC1860040yVG r4, com.ss.android.ugc.aweme.tako.ccl.model.api.Message r5, int r6) {
        /*
            r2 = this;
            r2.$t = r6
            switch(r6) {
                case 12: goto L11;
                case 13: goto L11;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l0 = r4
            r1.l1 = r5
            r1.l2 = r3
            r0 = 0
        Ld:
            r1.<init>(r0)
            return
        L11:
            r1 = r2
            r1.l0 = r4
            r1.l1 = r3
            r1.l2 = r5
            r0 = 0
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS271S0300000_27.<init>(X.0Q7z, X.0yVG, com.ss.android.ugc.aweme.tako.ccl.model.api.Message, int):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS271S0300000_27(X.InterfaceC1786800wb8 r3, X.C1789260wf6 r4, X.InterfaceC1788510wdt r5, int r6) {
        /*
            r2 = this;
            r2.$t = r6
            int r6 = 16 - r6
            if (r6 == 0) goto L12
            r1 = r2
            r1.l0 = r4
            r1.l1 = r5
            r1.l2 = r3
            r0 = 0
        Le:
            r1.<init>(r0)
            return
        L12:
            r1 = r2
            r1.l0 = r3
            r1.l1 = r5
            r1.l2 = r4
            r0 = 0
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS271S0300000_27.<init>(X.0wb8, X.0wf6, X.0wdt, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS271S0300000_27(C0F7E c0f7e, TakoRecordUIAssem takoRecordUIAssem, AwS571S0100000_27 awS571S0100000_27, int i) {
        super(0);
        this.$t = i;
        this.l0 = c0f7e;
        this.l1 = takoRecordUIAssem;
        this.l2 = awS571S0100000_27;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS271S0300000_27(C1812460xGW c1812460xGW, C1812460xGW c1812460xGW2, CompletionBlock<InterfaceC1812430xGT> completionBlock, InterfaceC1812440xGU interfaceC1812440xGU) {
        super(0);
        this.$t = interfaceC1812440xGU;
        this.l0 = c1812460xGW;
        this.l1 = c1812460xGW2;
        this.l2 = completionBlock;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS271S0300000_27(C1845150y7F c1845150y7F, Activity activity, AFwS269S0000000_27 aFwS269S0000000_27, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1845150y7F;
        this.l1 = activity;
        this.l2 = aFwS269S0000000_27;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS271S0300000_27(C1863240yaQ c1863240yaQ, ConversationInfo conversationInfo, Context context, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1863240yaQ;
        this.l1 = conversationInfo;
        this.l2 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS271S0300000_27(C127A c127a, ACEntranceUnlockToggleSettingFragment aCEntranceUnlockToggleSettingFragment, C127K c127k, int i) {
        super(0);
        this.$t = i;
        this.l0 = c127a;
        this.l1 = aCEntranceUnlockToggleSettingFragment;
        this.l2 = c127k;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS271S0300000_27(ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv, CreatorRankingSubPageFragment creatorRankingSubPageFragment, C1778070wN3 c1778070wN3, int i) {
        super(0);
        this.$t = i;
        this.l0 = viewOnAttachStateChangeListenerC20604515jv;
        this.l1 = creatorRankingSubPageFragment;
        this.l2 = c1778070wN3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS271S0300000_27(C1DKA c1dka, C1DKA c1dka2, C1DKA c1dka3, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1dka;
        this.l1 = c1dka2;
        this.l2 = c1dka3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS271S0300000_27(Activity activity, C1863860ybQ c1863860ybQ, ITakoContextAbility iTakoContextAbility, int i) {
        super(0);
        this.$t = i;
        this.l0 = activity;
        this.l1 = c1863860ybQ;
        this.l2 = iTakoContextAbility;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS271S0300000_27(Activity activity, C1887230zD7 c1887230zD7, ITakoContextAbility iTakoContextAbility, int i) {
        super(0);
        this.$t = i;
        this.l0 = activity;
        this.l1 = c1887230zD7;
        this.l2 = iTakoContextAbility;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS271S0300000_27(Context context, Map map, Function0 function0, int i) {
        super(0);
        this.$t = i;
        this.l0 = map;
        this.l1 = context;
        this.l2 = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS271S0300000_27(Fragment fragment, C1810340xD6 c1810340xD6, OfflineRankRootController offlineRankRootController, int i) {
        super(0);
        this.$t = i;
        this.l0 = fragment;
        this.l1 = c1810340xD6;
        this.l2 = offlineRankRootController;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS271S0300000_27(RankListController rankListController, C1809680xC2 c1809680xC2, DataChannel dataChannel, int i) {
        super(0);
        this.$t = i;
        this.l0 = rankListController;
        this.l1 = c1809680xC2;
        this.l2 = dataChannel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS271S0300000_27(RankListController rankListController, RankListV2Response.Gap gap, Context context, int i) {
        super(0);
        this.$t = i;
        this.l0 = rankListController;
        this.l1 = gap;
        this.l2 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS271S0300000_27(AIGCGenerationParam aIGCGenerationParam, AIPlaygroundGenerateParams aIPlaygroundGenerateParams, C1851620yHg c1851620yHg, int i) {
        super(0);
        this.$t = i;
        this.l0 = aIGCGenerationParam;
        this.l1 = aIPlaygroundGenerateParams;
        this.l2 = c1851620yHg;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS271S0300000_27(BottomInputAssem bottomInputAssem, Context context, NewActionAIImageItem newActionAIImageItem, int i) {
        super(0);
        this.$t = i;
        this.l0 = bottomInputAssem;
        this.l1 = context;
        this.l2 = newActionAIImageItem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS271S0300000_27(BottomInputAssem bottomInputAssem, TakoSpeechViewModel takoSpeechViewModel, C1855350yNh c1855350yNh, int i) {
        super(0);
        this.$t = i;
        this.l0 = bottomInputAssem;
        this.l1 = takoSpeechViewModel;
        this.l2 = c1855350yNh;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS271S0300000_27(TakoAnswerBaseAssem takoAnswerBaseAssem, TakoAnswerBaseAssem<C1858660yT2> takoAnswerBaseAssem2, C259800zU<DialogC1389620mGW> c259800zU, C013C c013c) {
        super(0);
        this.$t = c013c;
        this.l0 = takoAnswerBaseAssem;
        this.l1 = takoAnswerBaseAssem2;
        this.l2 = c259800zU;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS271S0300000_27(TakoInterceptorAssem takoInterceptorAssem, C322730Ckx c322730Ckx, TuxTextView tuxTextView, int i) {
        super(0);
        this.$t = i;
        this.l0 = takoInterceptorAssem;
        this.l1 = c322730Ckx;
        this.l2 = tuxTextView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS271S0300000_27(TakoReferenceAssem takoReferenceAssem, TakoReferenceAssem takoReferenceAssem2, C259800zU<DialogC1389620mGW> c259800zU, C013C c013c) {
        super(0);
        this.$t = c013c;
        this.l0 = takoReferenceAssem;
        this.l1 = takoReferenceAssem2;
        this.l2 = c259800zU;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS271S0300000_27(IMessageAbility iMessageAbility, C665120Q7a c665120Q7a, TakoEnterParams takoEnterParams, int i) {
        super(0);
        this.$t = i;
        this.l0 = iMessageAbility;
        this.l1 = c665120Q7a;
        this.l2 = takoEnterParams;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS271S0300000_27(TakoEntityInfoSheetFragment takoEntityInfoSheetFragment, Integer num, TakoSug takoSug, int i) {
        super(0);
        this.$t = i;
        this.l0 = takoEntityInfoSheetFragment;
        this.l1 = num;
        this.l2 = takoSug;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS271S0300000_27(Function2 function2, Function2<Object, Object, Object> function22, C1836130xsh<Object> c1836130xsh, C1836130xsh<Object> c1836130xsh2) {
        super(0);
        this.$t = c1836130xsh2;
        this.l0 = function2;
        this.l1 = function22;
        this.l2 = c1836130xsh;
    }
}
