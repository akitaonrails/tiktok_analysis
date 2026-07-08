package kotlin.jvm.internal;

import X.C013C;
import X.C06X5;
import X.C09AY;
import X.C0FNV;
import X.C0IJT;
import X.C0PEM;
import X.C0R2X;
import X.C1105900esu;
import X.C1161920gLG;
import X.C13LP;
import X.C14FD;
import X.C1558520qew;
import X.C1578630rBN;
import X.C1786270waH;
import X.C1793460wls;
import X.C1809680xC2;
import X.C1810690xDf;
import X.C1836130xsh;
import X.C1852650yJL;
import X.C1854260yLw;
import X.C1854340yM4;
import X.C1854370yM7;
import X.C1860520yW2;
import X.C1860930yWh;
import X.C1862330yYx;
import X.C1862660yZU;
import X.C1863250yaR;
import X.C1863850ybP;
import X.C19EG;
import X.C2188811AlT;
import X.C2296808zG;
import X.C23250099c;
import X.C259800zU;
import X.C327501Ov;
import X.C474500IjA;
import X.C747440TTq;
import X.DialogC1389620mGW;
import X.InterfaceC1631620sYq;
import X.InterfaceC1793490wlv;
import X.InterfaceC1799770ww3;
import X.InterfaceC665370Q7z;
import X.InterfaceC914930Zut;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.app.Dialog;
import android.content.Context;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.rank.impl.list.controller.RankListController;
import com.bytedance.android.live.rank.impl.list.viewmodel.RankListViewModel;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.android.livesdk.rank.list.model.RankListV2Response;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.IMAiGroupShotConfig;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tako.botpage.actionbar.model.TakoActiveBotItem;
import com.ss.android.ugc.aweme.tako.botpage.cards.ability.NimbleVideoListDependAbilityImpl;
import com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility;
import com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem;
import com.ss.android.ugc.aweme.tako.botpage.components.source.TakoReferenceAssem;
import com.ss.android.ugc.aweme.tako.ccl.model.api.ConvertStyle;
import com.ss.android.ugc.aweme.tako.ccl.model.api.ConvertStyleItem;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import com.ss.android.ugc.aweme.tako.startup.processor.aibot.AIBotDisclaimerDialogProcessor;
import com.tts.oecverify.BdTuring;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import webcast.api.ranklist.RankExtraInfo;

/* JADX INFO: loaded from: classes28.dex */
public class AwS155S0400000_27 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS155S0400000_27 awS155S0400000_27) {
        ((C1836130xsh) awS155S0400000_27.l1).LIZJ(((InterfaceC1631620sYq) awS155S0400000_27.l0).invoke(((C1836130xsh) awS155S0400000_27.l1).LIZIZ, ((C1836130xsh) awS155S0400000_27.l2).LIZIZ, ((C1836130xsh) awS155S0400000_27.l3).LIZIZ));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS155S0400000_27 awS155S0400000_27) {
        String string;
        Integer numValueOf;
        String str;
        TakoMixFeed takoMixFeedLJIIIZ;
        C1862330yYx c1862330yYx = C1862330yYx.LIZ;
        C1863850ybP c1863850ybP = (C1863850ybP) awS155S0400000_27.l0;
        String str2 = c1863850ybP.LL;
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        String str4 = c1863850ybP.LLILLJJLI;
        if (str4 == null) {
            str4 = "";
        }
        String str5 = c1863850ybP.LLILZIL;
        if (str5 == null) {
            str5 = "";
        }
        Message message = (Message) awS155S0400000_27.l1;
        String str6 = message.uuid;
        if (str6 == null) {
            str6 = "";
        }
        String strValueOf = String.valueOf(message.botId);
        Message message2 = (Message) awS155S0400000_27.l1;
        long j = message2.actionId;
        String str7 = message2.subSessionId;
        String str8 = ((C1863850ybP) awS155S0400000_27.l0).LLILLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(((C1860930yWh) awS155S0400000_27.l2).LLILZLL);
        sbLIZ.append('_');
        sbLIZ.append(((C1860930yWh) awS155S0400000_27.l2).LL);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C1860930yWh c1860930yWh = (C1860930yWh) awS155S0400000_27.l2;
        String str9 = c1860930yWh.LLILLJJLI;
        String str10 = (String) C13LP.LJJJLL(c1860930yWh.LLILZ);
        if (str10 == null) {
            str10 = "";
        }
        Integer numValueOf2 = null;
        TakoCardAbility takoCardAbility = (TakoCardAbility) C1558520qew.LIZ(C1558520qew.LJIIL(((NimbleVideoListDependAbilityImpl) awS155S0400000_27.l3).LL), TakoCardAbility.class, null);
        if (takoCardAbility != null) {
            string = Integer.valueOf(takoCardAbility.t70()).toString();
        } else {
            string = null;
        }
        Message messageYy1 = ((NimbleVideoListDependAbilityImpl) awS155S0400000_27.l3).LL.Yy1();
        if (messageYy1 != null && (takoMixFeedLJIIIZ = messageYy1.LJIIIZ()) != null) {
            numValueOf = Integer.valueOf(takoMixFeedLJIIIZ.cardType);
        } else {
            numValueOf = null;
        }
        String strLIZIZ2 = C0R2X.LIZIZ(numValueOf);
        Message message3 = (Message) awS155S0400000_27.l1;
        boolean z = message3.isMultiAnswer;
        if (z) {
            str = "multi_answer";
        } else {
            str = "default";
        }
        if (z) {
            numValueOf2 = Integer.valueOf(message3.selectedAnswerIndex + 1);
        }
        Integer num = ((C1860930yWh) awS155S0400000_27.l2).LLJIJIL;
        C1863850ybP c1863850ybP2 = (C1863850ybP) awS155S0400000_27.l0;
        String str11 = c1863850ybP2.LLIZ;
        String str12 = c1863850ybP2.LLILZLL;
        if (str12 != null) {
            str3 = str12;
        }
        C1862330yYx.LJJJJJ(c1862330yYx, str2, str4, str6, str5, str3, str11, strValueOf, Long.valueOf(j), str7, str8, "video", str9, string, strLIZIZ2, str10, null, null, strLIZIZ, str, numValueOf2, null, null, null, null, num, null, null, null, null, false, 2112061440);
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS155S0400000_27 awS155S0400000_27) {
        C1786270waH c1786270waH = C1786270waH.LIZ;
        IMAiGroupShotConfig.CustomClick customClick = ((IMAiGroupShotConfig.ContactSelectConfig.CustomTopAction.Visible) ((IMAiGroupShotConfig.ContactSelectConfig.CustomTopAction) awS155S0400000_27.l0)).onClick;
        C19EG c19eg = (C19EG) awS155S0400000_27.l1;
        Fragment fragment = (Fragment) awS155S0400000_27.l2;
        IMAiGroupShotConfig iMAiGroupShotConfig = (IMAiGroupShotConfig) awS155S0400000_27.l3;
        c1786270waH.getClass();
        C1786270waH.LIZ(customClick, c19eg, fragment, iMAiGroupShotConfig);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS155S0400000_27 awS155S0400000_27) {
        List<ConvertStyleItem> list;
        ConvertStyle convertStyle;
        C1854340yM4 c1854340yM4 = (C1854340yM4) awS155S0400000_27.l0;
        c1854340yM4.LLJILLL = true;
        C1854260yLw c1854260yLw = C1854260yLw.LIZ;
        Context context = (Context) awS155S0400000_27.l1;
        AwS236S0300000_27 awS236S0300000_27 = new AwS236S0300000_27(c1854340yM4, (C1854340yM4) awS155S0400000_27.l2, (C259800zU<List<C1854370yM7>>) awS155S0400000_27.l3, (ViewOnAttachStateChangeListenerC20604515jv) 19);
        AwS571S0100000_27 awS571S0100000_27 = new AwS571S0100000_27((C1854340yM4) awS155S0400000_27.l0, 1022);
        AwS571S0100000_27 awS571S0100000_272 = new AwS571S0100000_27((C1854340yM4) awS155S0400000_27.l0, 1023);
        C1852650yJL c1852650yJL = C1854260yLw.LIZIZ;
        if (c1852650yJL != null && (convertStyle = c1852650yJL.LIZJ) != null) {
            list = convertStyle.styleList;
        } else {
            list = null;
        }
        C06X5 c06x5 = C1854260yLw.LJIIJJI;
        c1854260yLw.getClass();
        C1854260yLw.LJIIJ(context, awS236S0300000_27, awS571S0100000_27, awS571S0100000_272, list, c06x5, null, C1854260yLw.LJ, null, null, null);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS155S0400000_27 awS155S0400000_27) {
        RankListV2Response.RankView rankView;
        int i;
        RankListV2Response.RankInfo rankInfo;
        RankListV2Response.Gap gap;
        RankListV2Response.GapExtra gapExtra;
        RankListV2Response.GapClassRankExtra gapClassRankExtra;
        RankListV2Response.ClassTitle classTitle;
        RankExtraInfo rankExtraInfo;
        RankListV2Response.ClassExtra classExtra;
        RankListViewModel rankListViewModelLJIIIZ;
        Function0 function0 = (Function0) awS155S0400000_27.l0;
        if (function0 != null) {
            function0.invoke();
        }
        C1810690xDf c1810690xDf = C1810690xDf.LIZ;
        DataChannel dataChannel = (DataChannel) awS155S0400000_27.l1;
        String str = ((C1809680xC2) awS155S0400000_27.l2).LIZ.LIZIZ.rankName;
        RankListController rankListController = (RankListController) awS155S0400000_27.l3;
        Long lValueOf = null;
        if (rankListController != null && (rankListViewModelLJIIIZ = rankListController.LJIIIZ()) != null) {
            rankView = rankListViewModelLJIIIZ.LLILLJJLI;
        } else {
            rankView = null;
        }
        c1810690xDf.getClass();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_rank_open_settings_click");
        c474500IjALIZ.LJIJJLI(dataChannel);
        C1810690xDf.LIZ(c474500IjALIZ, dataChannel);
        c474500IjALIZ.LJJII("rank", "page_name");
        c474500IjALIZ.LJJII(str, "rank_type");
        if (TextUtils.equals(str, RankTypeV2.LJIL.rankName)) {
            boolean z = C1105900esu.LIZIZ;
            if (rankView != null && (rankExtraInfo = rankView.rankExtraInfo) != null && (classExtra = rankExtraInfo.classExtra) != null) {
                i = classExtra.classType;
            } else {
                i = 0;
            }
            c474500IjALIZ.LJJII(C1105900esu.LIZJ(i), "anchor_ranking_league_level");
            if (rankView != null && (rankInfo = rankView.ownerRank) != null && (gap = rankInfo.gap) != null && (gapExtra = gap.gapExtra) != null && (gapClassRankExtra = gapExtra.classRankExtra) != null && (classTitle = gapClassRankExtra.classTitle) != null) {
                lValueOf = Long.valueOf(classTitle.getStarNumber);
            }
            c474500IjALIZ.LJJII(lValueOf, "anchor_ranking_league_star");
        }
        c474500IjALIZ.LIZ();
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$4(AwS155S0400000_27 awS155S0400000_27) {
        Function1 function1;
        Dialog dialog = (Dialog) ((C259800zU) awS155S0400000_27.l0).element;
        if (dialog != null) {
            C0FNV.LIZ(dialog);
        }
        if (!C1578630rBN.LJIIIZ((TakoAnswerBaseAssem) awS155S0400000_27.l1) && !((C013C) awS155S0400000_27.l2).element && (function1 = (Function1) awS155S0400000_27.l3) != null) {
            function1.invoke(null);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$5(AwS155S0400000_27 awS155S0400000_27) {
        Function0 function0;
        Dialog dialog = (Dialog) ((C259800zU) awS155S0400000_27.l0).element;
        if (dialog != null) {
            C0FNV.LIZ(dialog);
        }
        if (!C1578630rBN.LJIIIZ((TakoReferenceAssem) awS155S0400000_27.l1) && !((C013C) awS155S0400000_27.l2).element && (function0 = (Function0) awS155S0400000_27.l3) != null) {
            function0.invoke();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS155S0400000_27 awS155S0400000_27) {
        ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).openStickerPropsDialog(((InterfaceC1799770ww3) awS155S0400000_27.l0).getScene(), (DataChannel) awS155S0400000_27.l1, (FragmentManager) awS155S0400000_27.l2, (Room) awS155S0400000_27.l3);
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS155S0400000_27 awS155S0400000_27) {
        C23250099c.LIZLLL(C2296808zG.LIZIZ(), null, null, new C1863250yaR((InterfaceC665370Q7z) awS155S0400000_27.l0, (Context) awS155S0400000_27.l1, (TakoActiveBotItem) awS155S0400000_27.l2, (Function0) awS155S0400000_27.l3, null), 3);
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS155S0400000_27 awS155S0400000_27) throws JSONException {
        ((AIBotDisclaimerDialogProcessor) awS155S0400000_27.l0).getClass();
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C327501Ov(null), 3);
        C1860520yW2.LIZ.getClass();
        C1860520yW2.LJJIIZI(true);
        C1862330yYx.LJJJZ(C1862330yYx.LIZ, ((TakoEnterParams) awS155S0400000_27.l1).getCommonParams(), "click_confirm");
        AIBotDisclaimerDialogProcessor aIBotDisclaimerDialogProcessor = (AIBotDisclaimerDialogProcessor) awS155S0400000_27.l0;
        TakoEnterParams takoEnterParams = (TakoEnterParams) awS155S0400000_27.l1;
        String str = C747440TTq.LIZJ().confirmQuery;
        if (str == null) {
            str = "";
        }
        aIBotDisclaimerDialogProcessor.getClass();
        AIBotDisclaimerDialogProcessor.LIZ(true, takoEnterParams, str);
        ((C1862660yZU) awS155S0400000_27.l2).LJ = true;
        ((C14FD) awS155S0400000_27.l3).LIZ((AIBotDisclaimerDialogProcessor) awS155S0400000_27.l0);
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.0wlx] */
    public static final Object invoke$9(AwS155S0400000_27 awS155S0400000_27) {
        IInteractService iInteractService = (IInteractService) awS155S0400000_27.l0;
        Context context = (Context) awS155S0400000_27.l1;
        final C1793460wls c1793460wls = (C1793460wls) awS155S0400000_27.l2;
        final CompletionBlock completionBlock = (CompletionBlock) awS155S0400000_27.l3;
        iInteractService.LB2(context, new InterfaceC914930Zut<Unit>() { // from class: X.0wlx
            @Override // X.InterfaceC914930Zut
            public final void onSuccess(Unit unit) {
                c1793460wls.getClass();
                completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1793490wlv.class, null), "");
            }

            @Override // X.InterfaceC914930Zut
            public final void LIZ(int i, String str, Throwable th) {
                C2382909Vj.LIZ(completionBlock, i, str, null, 4);
            }
        });
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS155S0400000_27(C259800zU c259800zU, TakoAnswerBaseAssem takoAnswerBaseAssem, C013C c013c, Function1 function1, int i) {
        super(0);
        this.$t = i;
        this.l0 = c259800zU;
        this.l1 = takoAnswerBaseAssem;
        this.l2 = c013c;
        this.l3 = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS155S0400000_27(C259800zU c259800zU, C259800zU<DialogC1389620mGW> c259800zU2, TakoReferenceAssem takoReferenceAssem, C013C c013c, Function0<Unit> function0) {
        super(0);
        this.$t = function0;
        this.l0 = c259800zU;
        this.l1 = c259800zU2;
        this.l2 = takoReferenceAssem;
        this.l3 = c013c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS155S0400000_27(InterfaceC1631620sYq interfaceC1631620sYq, InterfaceC1631620sYq<Object, Object, Object, Object> interfaceC1631620sYq2, C1836130xsh<Object> c1836130xsh, C1836130xsh<Object> c1836130xsh2, C1836130xsh<Object> c1836130xsh3) {
        super(0);
        this.$t = c1836130xsh3;
        this.l0 = interfaceC1631620sYq;
        this.l1 = interfaceC1631620sYq2;
        this.l2 = c1836130xsh;
        this.l3 = c1836130xsh2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS155S0400000_27(InterfaceC1799770ww3 interfaceC1799770ww3, DataChannel dataChannel, FragmentManager fragmentManager, Room room, int i) {
        super(0);
        this.$t = i;
        this.l0 = interfaceC1799770ww3;
        this.l1 = dataChannel;
        this.l2 = fragmentManager;
        this.l3 = room;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS155S0400000_27(C1854340yM4 c1854340yM4, C1854340yM4 c1854340yM42, Context context, C259800zU<List<C1854370yM7>> c259800zU, ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv) {
        super(0);
        this.$t = viewOnAttachStateChangeListenerC20604515jv;
        this.l0 = c1854340yM4;
        this.l1 = c1854340yM42;
        this.l2 = context;
        this.l3 = c259800zU;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS155S0400000_27(C1863850ybP c1863850ybP, C1863850ybP c1863850ybP2, Message message, C1860930yWh c1860930yWh, NimbleVideoListDependAbilityImpl<T> nimbleVideoListDependAbilityImpl) {
        super(0);
        this.$t = nimbleVideoListDependAbilityImpl;
        this.l0 = c1863850ybP;
        this.l1 = c1863850ybP2;
        this.l2 = message;
        this.l3 = c1860930yWh;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS155S0400000_27(Context context, InterfaceC665370Q7z interfaceC665370Q7z, TakoActiveBotItem takoActiveBotItem, AwS578S0100000_34 awS578S0100000_34, int i) {
        super(0);
        this.$t = i;
        this.l0 = interfaceC665370Q7z;
        this.l1 = context;
        this.l2 = takoActiveBotItem;
        this.l3 = awS578S0100000_34;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS155S0400000_27(IInteractService iInteractService, IInteractService iInteractService2, Context context, C1793460wls c1793460wls, CompletionBlock<InterfaceC1793490wlv> completionBlock) {
        super(0);
        this.$t = completionBlock;
        this.l0 = iInteractService;
        this.l1 = iInteractService2;
        this.l2 = context;
        this.l3 = c1793460wls;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS155S0400000_27(IMAiGroupShotConfig.ContactSelectConfig.CustomTopAction customTopAction, C19EG c19eg, Fragment fragment, IMAiGroupShotConfig iMAiGroupShotConfig, int i) {
        super(0);
        this.$t = i;
        this.l0 = customTopAction;
        this.l1 = c19eg;
        this.l2 = fragment;
        this.l3 = iMAiGroupShotConfig;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS155S0400000_27(AIBotDisclaimerDialogProcessor aIBotDisclaimerDialogProcessor, TakoEnterParams takoEnterParams, C1862660yZU c1862660yZU, C14FD c14fd, int i) {
        super(0);
        this.$t = i;
        this.l0 = aIBotDisclaimerDialogProcessor;
        this.l1 = takoEnterParams;
        this.l2 = c1862660yZU;
        this.l3 = c14fd;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS155S0400000_27(Function0 function0, Function0<Unit> function02, DataChannel dataChannel, C1809680xC2 c1809680xC2, RankListController rankListController) {
        super(0);
        this.$t = rankListController;
        this.l0 = function0;
        this.l1 = function02;
        this.l2 = dataChannel;
        this.l3 = c1809680xC2;
    }
}
