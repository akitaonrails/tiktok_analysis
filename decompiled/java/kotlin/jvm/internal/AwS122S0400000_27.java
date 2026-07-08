package kotlin.jvm.internal;

import X.AnonymousClass1418;
import X.AnonymousClass1425;
import X.C013C;
import X.C07I4;
import X.C07ID;
import X.C07WB;
import X.C08LX;
import X.C08LY;
import X.C09AY;
import X.C0CNO;
import X.C0R2Q;
import X.C0R3Z;
import X.C12824050c;
import X.C1397620mTQ;
import X.C13BV;
import X.C13IQ;
import X.C13LE;
import X.C13LP;
import X.C14J2;
import X.C15438062q;
import X.C1697810uHb;
import X.C1786910wbJ;
import X.C1787110wbd;
import X.C1787120wbe;
import X.C1787520wcI;
import X.C1787540wcK;
import X.C1787830wcn;
import X.C1788060wdA;
import X.C1797130wrn;
import X.C1797250wrz;
import X.C1857380yQy;
import X.C1858290ySR;
import X.C1858350ySX;
import X.C1858670yT3;
import X.C1858770yTD;
import X.C1858870yTN;
import X.C1858890yTP;
import X.C1858900yTQ;
import X.C1860390yVp;
import X.C1861040yWs;
import X.C1861330yXL;
import X.C1861350yXN;
import X.C1861520yXe;
import X.C1862330yYx;
import X.C1862480yZC;
import X.C1862500yZE;
import X.C1862660yZU;
import X.C1863240yaQ;
import X.C1863280yaU;
import X.C1863380yae;
import X.C1918907fP;
import X.C1939607ik;
import X.C19404410vq;
import X.C19EG;
import X.C19ME;
import X.C201996141y;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C259800zU;
import X.C291001Au;
import X.C321970Cjj;
import X.C326880Cre;
import X.C326960Crm;
import X.C384050F3z;
import X.C418440Gaw;
import X.C443120HZe;
import X.C642530PId;
import X.C785410UrT;
import X.C786410Ut5;
import X.C814420VxA;
import X.C830490Whz;
import X.DialogC1389620mGW;
import X.EnumC174200lg;
import X.EnumC1780720wRK;
import X.EnumC1787060wbY;
import X.EnumC1787180wbk;
import X.EnumC1787510wcH;
import X.EnumC1787550wcL;
import X.EnumC1858880yTO;
import X.EnumC1861450yXX;
import X.EnumC1995007rg;
import X.InterfaceC1858000yRy;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import X.ViewOnLongClickListenerC1864620yce;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.skydoves.balloon.Balloon;
import com.ss.android.ugc.aweme.nimblecard.model.Ability;
import com.ss.android.ugc.aweme.nimblecard.model.Child;
import com.ss.android.ugc.aweme.nimblecard.model.Component;
import com.ss.android.ugc.aweme.nimblecard.model.Template;
import com.ss.android.ugc.aweme.nimblecard.tako.component.user.NimbleUserAssem;
import com.ss.android.ugc.aweme.offline.tako.debug.ITakoDebugService;
import com.ss.android.ugc.aweme.search.pages.result.common.reflist.core.model.ReferenceItemBridge;
import com.ss.android.ugc.aweme.search.pages.result.common.reflist.core.model.ReferenceLinkItemBridge;
import com.ss.android.ugc.aweme.search.pages.result.common.reflist.core.model.ReferenceVideoItemBridge;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tako.botpage.cards.answer.image.TakoNewImageAssem;
import com.ss.android.ugc.aweme.tako.botpage.cards.answer.messagedisclaimer.TakoMessageDisclamerAssem;
import com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem;
import com.ss.android.ugc.aweme.tako.botpage.components.botmarket.TakoBotMarketAssem;
import com.ss.android.ugc.aweme.tako.botpage.components.linkflow.TakoLinkFlowAssem;
import com.ss.android.ugc.aweme.tako.botpage.components.lynx.TakoLynxAssem;
import com.ss.android.ugc.aweme.tako.botpage.components.product.TakoProductListAssem;
import com.ss.android.ugc.aweme.tako.botpage.components.source.TakoReferenceAssem;
import com.ss.android.ugc.aweme.tako.botpage.components.sug.TakoContainerSugAssem;
import com.ss.android.ugc.aweme.tako.botpage.components.user.TakoUserAssem;
import com.ss.android.ugc.aweme.tako.botpage.components.userlist.TakoUserListAssem;
import com.ss.android.ugc.aweme.tako.botpage.components.video.singlevideo.TakoSingleVideoAssem;
import com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.MessageChunkResult;
import com.ss.android.ugc.aweme.tako.ccl.model.api.SearchLandingPageResponse;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBlockInfo;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoCertInfo;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoClientExt;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoFollowInfo;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoLinkItem;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoNimbleConfig;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoPassExt;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoPlaceholderSource;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoPrivateInfo;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoQuestionnaire;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoRelationInfo;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoSearchInfo;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoSourceItem;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoSug;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoUserItem;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoVideoItem;
import com.ss.android.ugc.aweme.tako.ccl.model.conversation.ConversationInfo;
import com.ss.android.ugc.aweme.tako.detail.operator.BatchDetailList;
import com.ss.android.ugc.aweme.tako.model.Link;
import com.ss.android.ugc.aweme.tako.model.NimbleParams;
import com.ss.android.ugc.aweme.tako.model.SearchBingItem;
import com.ss.android.ugc.aweme.tako.model.SearchVideoItem;
import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import com.ss.android.ugc.aweme.tako.model.TakoImageItem;
import com.ss.android.ugc.aweme.tako.nimblecard.NimbleCardAnswerAssem;
import com.ss.android.ugc.aweme.tako.router.model.TakoCarriedUpData;
import com.ss.android.ugc.aweme.tako.ui.TakoContentAssem$layoutManager$1;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import defpackage.r2;
import defpackage.w2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;

/* JADX INFO: loaded from: classes28.dex */
public class AwS122S0400000_27 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this, obj);
            case 14:
                return invoke$14(this, obj);
            case 15:
                return invoke$15(this, obj);
            case 16:
                return invoke$16(this, obj);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this, obj);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS122S0400000_27 awS122S0400000_27, Object obj) {
        C1861040yWs c1861040yWs = (C1861040yWs) obj;
        MessageViewModel messageViewModel = (MessageViewModel) awS122S0400000_27.l0;
        ArrayList arrayList = new ArrayList();
        w2 w2Var = (w2) awS122S0400000_27.l1;
        TakoSug takoSug = (TakoSug) awS122S0400000_27.l2;
        MessageViewModel messageViewModel2 = (MessageViewModel) awS122S0400000_27.l0;
        List<InterfaceC1858000yRy> list = c1861040yWs.LL.LIZ;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            if (!(obj2 instanceof C326960Crm) && !(obj2 instanceof C642530PId)) {
                arrayList2.add(obj2);
            }
        }
        arrayList.addAll(arrayList2);
        List<Message> list2 = w2Var.LIZIZ;
        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list2, 10));
        Iterator<Message> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(new C326880Cre(w2Var.LJIIIIZZ, it2.next(), null, 26));
        }
        arrayList.addAll(arrayList3);
        if (takoSug != null && C1858350ySX.LIZ(takoSug, messageViewModel2.LLJLLL)) {
            arrayList.add(new C326960Crm(takoSug.LJ, takoSug, takoSug.LJIIIZ));
        }
        C291001Au c291001Au = new C291001Au(arrayList);
        Function1 function1 = (Function1) awS122S0400000_27.l3;
        if (function1 != null) {
            function1.invoke(c291001Au);
        }
        return messageViewModel.WQ2(C1861040yWs.LIZ(c1861040yWs, c291001Au, false, true, null, null, false, false, null, null, false, 0L, false, null, null, null, null, null, null, false, null, false, null, 0L, null, null, null, null, null, 1073741818));
    }

    public static final Object invoke$1(AwS122S0400000_27 awS122S0400000_27, Object obj) {
        boolean z;
        String str;
        Object next;
        Message messageLIZ;
        TakoQuestionnaire takoQuestionnaire;
        TakoMixFeed takoMixFeedLJIIIZ;
        C1861040yWs c1861040yWs = (C1861040yWs) obj;
        C1858290ySR.LIZ.getClass();
        if (((Number) C1858290ySR.LIZIZ.getValue()).intValue() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Iterator<T> it2 = c1861040yWs.LL.LIZ.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    Message messageLIZ2 = C321970Cjj.LIZ((InterfaceC1858000yRy) next);
                    if (messageLIZ2 != null && (takoMixFeedLJIIIZ = messageLIZ2.LJIIIZ()) != null && takoMixFeedLJIIIZ.cardType == -8002) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            InterfaceC1858000yRy interfaceC1858000yRy = (InterfaceC1858000yRy) next;
            if (interfaceC1858000yRy != null && (messageLIZ = C321970Cjj.LIZ(interfaceC1858000yRy)) != null && (takoQuestionnaire = messageLIZ.LJIILL) != null) {
                takoQuestionnaire.setFollowMessageId(((Message) awS122S0400000_27.l0).uuid);
            }
        }
        List<InterfaceC1858000yRy> list = c1861040yWs.LL.LIZ;
        Message message = (Message) awS122S0400000_27.l1;
        w2 w2Var = (w2) awS122S0400000_27.l2;
        Message message2 = (Message) awS122S0400000_27.l0;
        ArrayList arrayList = new ArrayList();
        for (InterfaceC1858000yRy c326880Cre : list) {
            Message messageLIZ3 = C321970Cjj.LIZ(c326880Cre);
            if (messageLIZ3 != null) {
                str = messageLIZ3.uuid;
            } else {
                str = null;
            }
            if (Intrinsics.LJFF(str, message.uuid)) {
                c326880Cre = new C326880Cre(w2Var.LJIIIIZZ, message2, null, 26);
            } else if (Intrinsics.LJFF(str, message2.uuid) || c326880Cre == null) {
            }
            arrayList.add(c326880Cre);
        }
        C291001Au c291001Au = new C291001Au(arrayList);
        Message message3 = (Message) awS122S0400000_27.l1;
        MessageViewModel messageViewModel = (MessageViewModel) awS122S0400000_27.l3;
        w2 w2Var2 = (w2) awS122S0400000_27.l2;
        if (!C1858670yT3.LJIILLIIL(message3)) {
            messageViewModel.lR2(arrayList, EnumC1861450yXX.UPDATE_SWITCH_MESSAGE, new C1861520yXe(null, false, false, false, w2Var2.LIZIZ, null, null, null, null, null, false, 2031));
        }
        return C1861040yWs.LIZ(c1861040yWs, c291001Au, false, false, null, null, false, false, null, null, false, 0L, false, null, null, null, null, null, null, false, new C291001Au(Boolean.TRUE), false, null, 0L, null, null, null, null, null, 1071644666);
    }

    public static final Object invoke$10(AwS122S0400000_27 awS122S0400000_27, Object obj) {
        C0CNO.LIZLLL(0L, new AwS155S0400000_27((C259800zU) awS122S0400000_27.l0, (TakoAnswerBaseAssem) awS122S0400000_27.l1, (C013C) awS122S0400000_27.l2, (Function1) awS122S0400000_27.l3, 4));
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS122S0400000_27 awS122S0400000_27, Object obj) {
        C0CNO.LIZLLL(0L, new AwS155S0400000_27((C259800zU) awS122S0400000_27.l0, (C259800zU<DialogC1389620mGW>) awS122S0400000_27.l1, (TakoReferenceAssem) awS122S0400000_27.l2, (C013C) awS122S0400000_27.l3, (Function0<Unit>) 5));
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS122S0400000_27 awS122S0400000_27, Object obj) {
        int iIntValue = ((Number) obj).intValue();
        C1861330yXL.LJII((LinearLayoutManager) awS122S0400000_27.l1, iIntValue, (Context) awS122S0400000_27.l2, (((C1861350yXN) awS122S0400000_27.l3).LIZLLL - ((double) C1861330yXL.LIZ(iIntValue, null, (ViewOnAttachStateChangeListenerC20604515jv) awS122S0400000_27.l0))) - ((double) 20), 8);
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS122S0400000_27 awS122S0400000_27, Object obj) {
        C1787540wcK c1787540wcK = (C1787540wcK) obj;
        return C2097608Jq.LJIIL(C2097608Jq.LJIIIIZZ(new Pair(c1787540wcK.LIZIZ, String.valueOf(EnumC1787550wcL.RESTORE.getValue())), new Pair(c1787540wcK.LIZJ, ((EnumC1787510wcH) awS122S0400000_27.l0).getValue()), new Pair(c1787540wcK.LIZLLL, String.valueOf(((List) awS122S0400000_27.l1).size())), new Pair(c1787540wcK.LJ, ((List) awS122S0400000_27.l1).toString()), new Pair(c1787540wcK.LJFF, ((EnumC1780720wRK) awS122S0400000_27.l2).getValue())), ((C1787520wcI) awS122S0400000_27.l3).LIZ.getCommonEventInfo());
    }

    public static /* bridge */ /* synthetic */ Object invoke$14(AwS122S0400000_27 awS122S0400000_27, Object obj) {
        Dialog dialog = (Dialog) obj;
        dialog.dismiss();
        C785410UrT.LIZ(dialog);
        C1797130wrn c1797130wrn = (C1797130wrn) awS122S0400000_27.l0;
        Context context = (Context) awS122S0400000_27.l1;
        C1797250wrz c1797250wrz = (C1797250wrz) awS122S0400000_27.l2;
        c1797130wrn.getClass();
        C1797130wrn.LJIJ(context, c1797250wrz, "change_payment_method");
        ((Function1) awS122S0400000_27.l3).invoke(Boolean.TRUE);
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v20, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r2v21, types: [java.util.List<com.ss.android.ugc.aweme.tako.ccl.model.api.TakoSourceItem>] */
    /* JADX WARN: Type inference failed for: r2v49, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v59, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v6, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.List<com.ss.android.ugc.aweme.tako.ccl.model.api.TakoVideoItem>] */
    /* JADX WARN: Type inference failed for: r5v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v3, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.List<com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage>] */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v2, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.List<com.ss.android.ugc.aweme.tako.ccl.model.api.TakoLinkItem>] */
    public static final Object invoke$15(AwS122S0400000_27 awS122S0400000_27, Object obj) {
        ?? arrayList;
        Map<String, String> map;
        ?? arrayList2;
        ?? arrayList3;
        ?? arrayList4;
        int iIntValue;
        int iIntValue2;
        Integer num;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        Long lValueOf;
        List list;
        String str7;
        List<String> list2;
        TakoMixFeed takoMixFeed = (TakoMixFeed) obj;
        String carriedSendAnswerContent = ((TakoEnterParams) awS122S0400000_27.l0).getCarriedSendAnswerContent();
        String str8 = "";
        if (carriedSendAnswerContent == null) {
            carriedSendAnswerContent = "";
        }
        takoMixFeed.text = carriedSendAnswerContent;
        List<SearchVideoItem> carriedSendAnswerVideo = ((TakoEnterParams) awS122S0400000_27.l0).getCarriedSendAnswerVideo();
        if (carriedSendAnswerVideo != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(carriedSendAnswerVideo, 10));
            for (SearchVideoItem searchVideoItem : carriedSendAnswerVideo) {
                arrayList.add(new TakoVideoItem(searchVideoItem.awemeId, searchVideoItem.diggCount, new BaseImage(null, null, searchVideoItem.coverUrlList, null, 0, 0, null, null, null, null, null, null, null, null, null, 0, 0, null, 262139, null), new TakoUserItem(0L, "", "", new BaseImage(null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, 0, 0, null, 262143, null), "", new TakoCertInfo(false, ""), new TakoRelationInfo(new TakoBlockInfo(false, false), new TakoFollowInfo(-1, -1, 0)), new TakoPrivateInfo(false)), "", 0L, null, null, new LinkedHashMap(), null, null));
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        takoMixFeed.videoList = arrayList;
        TakoEnterParams takoEnterParams = (TakoEnterParams) awS122S0400000_27.l0;
        String str9 = takoEnterParams.searchLogId;
        if (str9 == null) {
            str9 = "";
        }
        String carriedRepeatKey = takoEnterParams.getCarriedRepeatKey();
        if (carriedRepeatKey == null) {
            carriedRepeatKey = "";
        }
        TakoCarriedUpData takoCarriedUpData = ((TakoEnterParams) awS122S0400000_27.l0).carriedUpData;
        if (takoCarriedUpData != null) {
            map = takoCarriedUpData.messageMobParams;
        } else {
            map = null;
        }
        takoMixFeed.clientExt = new TakoClientExt(carriedRepeatKey, str9, true, map);
        List<SearchBingItem> carriedBingList = ((TakoEnterParams) awS122S0400000_27.l0).getCarriedBingList();
        if (carriedBingList != null) {
            arrayList2 = new ArrayList(C15438062q.LJIJJ(carriedBingList, 10));
            for (SearchBingItem searchBingItem : carriedBingList) {
                Link link = searchBingItem.link;
                if (link == null || (list2 = link.urlLink) == null || (str7 = (String) C13LP.LJJJLL(list2)) == null) {
                    str7 = "";
                }
                arrayList2.add(new TakoLinkItem(str7, searchBingItem.name, "", "", ""));
            }
        } else {
            arrayList2 = C13BV.INSTANCE;
        }
        takoMixFeed.linkList = arrayList2;
        List<TakoImageItem> carriedImageList = ((TakoEnterParams) awS122S0400000_27.l0).getCarriedImageList();
        if (carriedImageList != null) {
            arrayList3 = new ArrayList(C15438062q.LJIJJ(carriedImageList, 10));
            for (TakoImageItem takoImageItem : carriedImageList) {
                arrayList3.add(new BaseImage(takoImageItem.imageId, null, takoImageItem.urlList, null, takoImageItem.width, takoImageItem.height, null, null, null, null, null, null, null, null, null, 0, 0, null, 262090, null));
            }
        } else {
            arrayList3 = C13BV.INSTANCE;
        }
        takoMixFeed.images = arrayList3;
        List<ReferenceItemBridge> carriedReferenceList = ((TakoEnterParams) awS122S0400000_27.l0).getCarriedReferenceList();
        if (carriedReferenceList != null) {
            arrayList4 = new ArrayList(C15438062q.LJIJJ(carriedReferenceList, 10));
            for (ReferenceItemBridge referenceItemBridge : carriedReferenceList) {
                TakoSourceItem takoSourceItem = new TakoSourceItem(referenceItemBridge.rank, referenceItemBridge.type, null, null, null, null);
                int i = referenceItemBridge.type;
                if (i != 0) {
                    if (i == 1) {
                        ReferenceVideoItemBridge referenceVideoItemBridge = referenceItemBridge.video;
                        if (referenceVideoItemBridge == null || (str6 = referenceVideoItemBridge.awemeId) == null) {
                            str6 = "";
                        }
                        if (referenceVideoItemBridge != null) {
                            lValueOf = Long.valueOf(referenceVideoItemBridge.diggCount);
                        } else {
                            lValueOf = null;
                        }
                        long jLIZIZ = C0R2Q.LIZIZ(lValueOf);
                        ReferenceVideoItemBridge referenceVideoItemBridge2 = referenceItemBridge.video;
                        if (referenceVideoItemBridge2 == null || (list = referenceVideoItemBridge2.coverUrlList) == null) {
                            list = C13BV.INSTANCE;
                        }
                        takoSourceItem.video = new TakoVideoItem(str6, jLIZIZ, new BaseImage(null, null, list, null, 0, 0, null, null, null, null, null, null, null, null, null, 0, 0, null, 262139, null), new TakoUserItem(0L, "", "", new BaseImage(null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, 0, 0, null, 262143, null), "", new TakoCertInfo(false, ""), new TakoRelationInfo(new TakoBlockInfo(false, false), new TakoFollowInfo(-1, -1, 0)), new TakoPrivateInfo(false)), "", 0L, null, null, new LinkedHashMap(), null, null);
                    }
                } else {
                    ReferenceLinkItemBridge referenceLinkItemBridge = referenceItemBridge.link;
                    if (referenceLinkItemBridge == null || (str = referenceLinkItemBridge.link) == null) {
                        str = "";
                    }
                    if (referenceLinkItemBridge == null || (str2 = referenceLinkItemBridge.name) == null) {
                        str2 = "";
                    }
                    if (referenceLinkItemBridge == null || (str3 = referenceLinkItemBridge.title) == null) {
                        str3 = "";
                    }
                    if (referenceLinkItemBridge == null || (str4 = referenceLinkItemBridge.snippet) == null) {
                        str4 = "";
                    }
                    if (referenceLinkItemBridge == null || (str5 = referenceLinkItemBridge.icon) == null) {
                        str5 = "";
                    }
                    takoSourceItem.link = new TakoLinkItem(str, str2, str3, str4, str5);
                }
                arrayList4.add(takoSourceItem);
            }
        } else {
            arrayList4 = C13BV.INSTANCE;
        }
        takoMixFeed.sources = arrayList4;
        String searchKeyword = ((TakoEnterParams) awS122S0400000_27.l0).getSearchKeyword();
        if (searchKeyword == null) {
            searchKeyword = "";
        }
        takoMixFeed.searchInfo = new TakoSearchInfo(searchKeyword);
        C443120HZe c443120HZeLIZJ = C1862480yZC.LIZJ((SearchLandingPageResponse) awS122S0400000_27.l3, (TakoEnterParams) awS122S0400000_27.l0, (C1862660yZU) awS122S0400000_27.l2, ((Message) awS122S0400000_27.l1).uuid);
        if (c443120HZeLIZJ != null) {
            TakoNimbleConfig takoNimbleConfig = (TakoNimbleConfig) c443120HZeLIZJ.getFirst();
            Map<String, ? extends Object> map2 = (Map) c443120HZeLIZJ.getSecond();
            String str10 = (String) c443120HZeLIZJ.getThird();
            takoMixFeed.nimbleConfig = takoNimbleConfig;
            takoMixFeed.LIZ = map2;
            takoMixFeed.nimbleDataStr = str10;
        }
        TakoEnterParams takoEnterParams2 = (TakoEnterParams) awS122S0400000_27.l0;
        String str11 = takoEnterParams2.searchMessageType;
        if (str11 != null) {
            str8 = str11;
        }
        String strLIZIZ = takoEnterParams2.searchIdList;
        if (strLIZIZ == null && (strLIZIZ = C1862480yZC.LIZIZ(takoMixFeed.LIZ)) == null) {
            strLIZIZ = C12824050c.LIZ();
        }
        Integer num2 = ((TakoEnterParams) awS122S0400000_27.l0).searchIsQuoteVideo;
        if (num2 != null) {
            iIntValue = num2.intValue();
        } else {
            iIntValue = 0;
        }
        takoMixFeed.ext = new TakoPassExt(0, null, 0, "", str8, strLIZIZ, iIntValue, "", 0, "", 0, "", null, null, 0, null, "");
        Map<String, String> carriedPlaceholders = ((TakoEnterParams) awS122S0400000_27.l0).getCarriedPlaceholders();
        if (carriedPlaceholders != null && (!carriedPlaceholders.isEmpty())) {
            for (Map.Entry<String, String> entry : carriedPlaceholders.entrySet()) {
                TakoPlaceholderSource takoPlaceholderSourceLJ = C1860390yVp.LJ(entry.getValue());
                if (takoPlaceholderSourceLJ != null) {
                    takoMixFeed.placeholderSources.put(entry.getKey(), takoPlaceholderSourceLJ);
                }
            }
        }
        Integer searchCardType = ((TakoEnterParams) awS122S0400000_27.l0).getSearchCardType();
        if (searchCardType != null) {
            iIntValue2 = searchCardType.intValue();
        } else {
            NimbleParams nimbleParams = ((TakoEnterParams) awS122S0400000_27.l0).getNimbleParams();
            if (nimbleParams != null && (num = nimbleParams.nimbleCardType) != null) {
                iIntValue2 = num.intValue();
            } else {
                iIntValue2 = 201;
            }
        }
        takoMixFeed.cardType = iIntValue2;
        return Unit.LIZ;
    }

    public static final Object invoke$16(AwS122S0400000_27 awS122S0400000_27, Object obj) {
        List<C326880Cre> listSL;
        Object obj2;
        IMessageAbility iMessageAbility;
        IMessageAbility iMessageAbility2 = (IMessageAbility) awS122S0400000_27.l0;
        if (iMessageAbility2 != null && (listSL = iMessageAbility2.sL()) != null) {
            C08LY c08ly = new C08LY(new C1939607ik(listSL), AFwS269S0000000_27.get$arr$(395));
            Message message = (Message) awS122S0400000_27.l2;
            C08LX c08lx = new C08LX(c08ly);
            while (true) {
                obj2 = null;
                if (!c08lx.hasNext()) {
                    break;
                }
                Object next = c08lx.next();
                Message message2 = (Message) next;
                TakoMixFeed takoMixFeedLJIIIZ = message2.LJIIIZ();
                if (takoMixFeedLJIIIZ != null && takoMixFeedLJIIIZ.cardType == -8002) {
                    TakoQuestionnaire takoQuestionnaire = message2.LJIILL;
                    if (takoQuestionnaire != null) {
                        obj2 = takoQuestionnaire.followMessageId;
                    }
                    if (Intrinsics.LJFF(obj2, message.uuid)) {
                        obj2 = next;
                        break;
                    }
                }
            }
            Message message3 = (Message) obj2;
            if (message3 != null && (iMessageAbility = (IMessageAbility) awS122S0400000_27.l0) != null) {
                iMessageAbility.dt0(message3, false);
            }
        }
        IMessageAbility iMessageAbility3 = (IMessageAbility) awS122S0400000_27.l0;
        if (iMessageAbility3 != null) {
            iMessageAbility3.cN0((Context) awS122S0400000_27.l1, (Message) awS122S0400000_27.l2, (List) awS122S0400000_27.l3, false);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$17(AwS122S0400000_27 awS122S0400000_27, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LJFF(2131822447, new AwS122S0400000_27((IMessageAbility) awS122S0400000_27.l0, (IMessageAbility) awS122S0400000_27.l1, (Context) awS122S0400000_27.l2, (Message) awS122S0400000_27.l3, (List<Message>) 16));
        c1397620mTQ.LJII(2131822445, AFwS269S0000000_27.get$arr$(396));
        return Unit.LIZ;
    }

    public static final Object invoke$18(AwS122S0400000_27 awS122S0400000_27, Object obj) {
        C1787120wbe c1787120wbe = (C1787120wbe) obj;
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair(c1787120wbe.LIZIZ, String.valueOf(((C1787110wbd) awS122S0400000_27.l0).LIZIZ.currentTimeMillis())), new Pair(c1787120wbe.LJIIIIZZ, String.valueOf(((C1787110wbd) awS122S0400000_27.l0).LIZIZ.currentTimeMillis() - ((C1787830wcn) awS122S0400000_27.l1).LJII.LIZ)), new Pair(c1787120wbe.LIZJ, ((Exception) awS122S0400000_27.l2).getClass().getSimpleName()), new Pair(c1787120wbe.LJFF, ((Exception) awS122S0400000_27.l2).getMessage()), new Pair(c1787120wbe.LJI, String.valueOf(((EnumC1787180wbk) awS122S0400000_27.l3).getCode())), new Pair(c1787120wbe.LJII, ((EnumC1787180wbk) awS122S0400000_27.l3).getMessage()));
        Exception exc = (Exception) awS122S0400000_27.l2;
        C1787830wcn c1787830wcn = (C1787830wcn) awS122S0400000_27.l1;
        if (exc instanceof C1786910wbJ) {
            C2097608Jq.LJIILIIL(mapLJIIIIZZ, new Pair(c1787120wbe.LIZLLL, "203"));
            mapLJIIIIZZ = C2097608Jq.LJIILIIL(mapLJIIIIZZ, new Pair(c1787120wbe.LJ, String.valueOf(((C1786910wbJ) exc).getErrorCode())));
        } else {
            EnumC1787060wbY enumC1787060wbY = c1787830wcn.LJ;
            if (enumC1787060wbY == EnumC1787060wbY.PURCHASED) {
                mapLJIIIIZZ = C2097608Jq.LJIILIIL(mapLJIIIIZZ, new Pair(c1787120wbe.LIZLLL, "205"));
            } else if (enumC1787060wbY == EnumC1787060wbY.UPLOADED) {
                mapLJIIIIZZ = C2097608Jq.LJIILIIL(mapLJIIIIZZ, new Pair(c1787120wbe.LIZLLL, "204"));
            }
        }
        return C2097608Jq.LJIIL(C2097608Jq.LJIIL(mapLJIIIIZZ, ((C1787830wcn) awS122S0400000_27.l1).LIZIZ()), ((C1787110wbd) awS122S0400000_27.l0).LIZ.getCommonEventInfo());
    }

    public static final Object invoke$2(AwS122S0400000_27 awS122S0400000_27, Object obj) throws JSONException {
        Long lValueOf;
        Integer numValueOf;
        ((Map) awS122S0400000_27.l0).put("message_type", "text_image");
        ((Map) awS122S0400000_27.l0).put("image_info", AnonymousClass1418.LJ(((TakoMixFeed) awS122S0400000_27.l1).images));
        ((Map) awS122S0400000_27.l0).put("image_count", String.valueOf(((TakoMixFeed) awS122S0400000_27.l1).images.size()));
        C201996141y c201996141y = C201996141y.LIZ;
        C1863380yae c1863380yae = ((MessageViewModel) awS122S0400000_27.l2).LLJJJJ;
        Map mapLIZ = null;
        if (c1863380yae != null) {
            lValueOf = Long.valueOf(c1863380yae.LJII);
        } else {
            lValueOf = null;
        }
        C1863380yae c1863380yae2 = ((MessageViewModel) awS122S0400000_27.l2).LLJJJJ;
        if (c1863380yae2 != null) {
            numValueOf = Integer.valueOf(c1863380yae2.LJIIIIZZ);
        } else {
            numValueOf = null;
        }
        c201996141y.getClass();
        String strLJ = C201996141y.LJ(numValueOf, lValueOf);
        if (strLJ != null) {
            ((Map) awS122S0400000_27.l0).put("is_memory", strLJ);
        }
        C1862330yYx c1862330yYx = C1862330yYx.LIZ;
        Map mapLJIIL = C2097608Jq.LJIIL((Map) awS122S0400000_27.l3, C2097908Jt.LIZJ(new Pair("mode", ((MessageViewModel) awS122S0400000_27.l2).FQ2())));
        Map map = (Map) awS122S0400000_27.l0;
        TakoEnterParams takoEnterParams = ((MessageViewModel) awS122S0400000_27.l2).LLILLL;
        if (takoEnterParams != null) {
            mapLIZ = C1862500yZE.LIZ(takoEnterParams, false);
        }
        c1862330yYx.getClass();
        C1862330yYx.LJLLI(mapLJIIL, map, mapLIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS122S0400000_27 awS122S0400000_27, Object obj) throws JSONException {
        Long lValueOf;
        Integer numValueOf;
        Map mapLJ;
        List list = (List) obj;
        if (((Message) awS122S0400000_27.l0).msgType == 7) {
            ((Map) awS122S0400000_27.l1).put("message_type", "text_image");
            ((Map) awS122S0400000_27.l1).put("image_info", AnonymousClass1418.LJ(list));
            ((Map) awS122S0400000_27.l1).put("image_count", String.valueOf(list.size()));
            C201996141y c201996141y = C201996141y.LIZ;
            C1863380yae c1863380yae = ((MessageViewModel) awS122S0400000_27.l2).LLJJJJ;
            Map mapLIZ = null;
            if (c1863380yae != null) {
                lValueOf = Long.valueOf(c1863380yae.LJII);
            } else {
                lValueOf = null;
            }
            C1863380yae c1863380yae2 = ((MessageViewModel) awS122S0400000_27.l2).LLJJJJ;
            if (c1863380yae2 != null) {
                numValueOf = Integer.valueOf(c1863380yae2.LJIIIIZZ);
            } else {
                numValueOf = null;
            }
            c201996141y.getClass();
            String strLJ = C201996141y.LJ(numValueOf, lValueOf);
            if (strLJ != null) {
                ((Map) awS122S0400000_27.l1).put("is_memory", strLJ);
            }
            C1862330yYx c1862330yYx = C1862330yYx.LIZ;
            Map map = (Map) awS122S0400000_27.l3;
            if (map != null) {
                mapLJ = C2097608Jq.LJIIL(map, C2097908Jt.LIZJ(new Pair("mode", ((MessageViewModel) awS122S0400000_27.l2).FQ2())));
            } else {
                mapLJ = C2097608Jq.LJ();
            }
            Map map2 = (Map) awS122S0400000_27.l1;
            TakoEnterParams takoEnterParams = ((MessageViewModel) awS122S0400000_27.l2).LLILLL;
            if (takoEnterParams != null) {
                mapLIZ = C1862500yZE.LIZ(takoEnterParams, false);
            }
            c1862330yYx.getClass();
            C1862330yYx.LJLLI(mapLJ, map2, mapLIZ);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v136, types: [T, java.lang.Integer] */
    public static final Object invoke$4(AwS122S0400000_27 awS122S0400000_27, Object obj) {
        Context context;
        List listSingletonList;
        Class cls;
        List listSingletonList2;
        List<Integer> listLJIIJJI;
        Pair pair;
        View viewLJFF;
        View view;
        View view2;
        FrameLayout frameLayoutLIZIZ;
        Assembler assembler = (Assembler) obj;
        Iterator it2 = ((List) awS122S0400000_27.l0).iterator();
        while (true) {
            int i = 0;
            if (it2.hasNext()) {
                Component component = (Component) it2.next();
                ((NimbleCardAnswerAssem) awS122S0400000_27.l1).LLLZI.getClass();
                String str = component.id;
                if (Intrinsics.LJFF(str, EnumC1858880yTO.TAKO_MARKDOWN_TEXT.getTag())) {
                    listSingletonList = C1697810uHb.LJIILJJIL(C0R3Z.LIZ());
                    List<Child> list = component.children;
                    if (list != null) {
                        Iterator<Child> it3 = list.iterator();
                        while (it3.hasNext()) {
                            String str2 = it3.next().id;
                            if (Intrinsics.LJFF(str2, EnumC1995007rg.TAKO_LINK_FLOW.getTag())) {
                                listSingletonList.add(C13LE.LIZ(TakoLinkFlowAssem.class));
                            } else if (Intrinsics.LJFF(str2, EnumC1995007rg.TAKO_CONTAINER_SUG.getTag())) {
                                listSingletonList.add(C13LE.LIZ(TakoContainerSugAssem.class));
                            } else if (Intrinsics.LJFF(str2, EnumC1995007rg.TAKO_BOT_MARKET.getTag())) {
                                listSingletonList.add(C13LE.LIZ(TakoBotMarketAssem.class));
                            }
                        }
                    }
                } else if (Intrinsics.LJFF(str, EnumC1858880yTO.TAKO_USER.getTag())) {
                    if (C07I4.LIZ()) {
                        cls = NimbleUserAssem.class;
                    } else {
                        cls = TakoUserAssem.class;
                    }
                    listSingletonList = Collections.singletonList(C13LE.LIZ(cls));
                } else {
                    listSingletonList = Intrinsics.LJFF(str, EnumC1858880yTO.TAKO_INTERACTION.getTag()) ? Collections.singletonList(C1858770yTD.LIZ()) : Intrinsics.LJFF(str, EnumC1858880yTO.TAKO_MESSAGE_DISCLAIMER.getTag()) ? Collections.singletonList(C13LE.LIZ(TakoMessageDisclamerAssem.class)) : Intrinsics.LJFF(str, EnumC1858880yTO.TAKO_HORIZONTAL_VIDEO.getTag()) ? Collections.singletonList(C1858890yTP.LIZ()) : Intrinsics.LJFF(str, EnumC1858880yTO.TAKO_INTENT_VIDEO.getTag()) ? Collections.singletonList(C13LE.LIZ(TakoSingleVideoAssem.class)) : Intrinsics.LJFF(str, EnumC1858880yTO.TAKO_HORIZONTAL_USER.getTag()) ? Collections.singletonList(C13LE.LIZ(TakoUserListAssem.class)) : Intrinsics.LJFF(str, EnumC1858880yTO.TAKO_GOODS.getTag()) ? Collections.singletonList(C13LE.LIZ(TakoProductListAssem.class)) : Intrinsics.LJFF(str, EnumC1858880yTO.TAKO_IMAGE.getTag()) ? Collections.singletonList(C13LE.LIZ(TakoNewImageAssem.class)) : null;
                }
                ((NimbleCardAnswerAssem) awS122S0400000_27.l1).LLLZI.getClass();
                String str3 = component.id;
                EnumC1858880yTO enumC1858880yTO = EnumC1858880yTO.TAKO_LYNX;
                if (Intrinsics.LJFF(str3, enumC1858880yTO.getTag())) {
                    listSingletonList2 = Collections.singletonList(C13LE.LIZ(TakoLynxAssem.class));
                } else {
                    listSingletonList2 = null;
                }
                NimbleCardAnswerAssem nimbleCardAnswerAssem = (NimbleCardAnswerAssem) awS122S0400000_27.l1;
                C1858900yTQ c1858900yTQ = nimbleCardAnswerAssem.LLLZI;
                C14J2 c14j2Pq = nimbleCardAnswerAssem.pq();
                Context context2 = ((NimbleCardAnswerAssem) awS122S0400000_27.l1).getContext();
                Integer num = (Integer) ((C259800zU) awS122S0400000_27.l2).element;
                c1858900yTQ.getClass();
                if (context2 != null) {
                    String str4 = component.id;
                    if (Intrinsics.LJFF(str4, EnumC1858880yTO.TAKO_MARKDOWN_TEXT.getTag())) {
                        Integer numValueOf = Integer.valueOf(R.id.bsx);
                        Integer numValueOf2 = Integer.valueOf(R.id.eva);
                        if (c14j2Pq == null) {
                            c14j2Pq = C1858870yTN.LJ(context2, C07WB.LIZ(component.padding), num, numValueOf, numValueOf2, false, true);
                        }
                        if (C07ID.LIZ()) {
                            listLJIIJJI = C1918907fP.LJIIIZ;
                        } else {
                            listLJIIJJI = C1697810uHb.LJIIJJI(Integer.valueOf(((Number) ListProtector.get(C07WB.LIZ(component.padding), 0)).intValue() + 16), Integer.valueOf(((Number) ListProtector.get(C07WB.LIZ(component.padding), 1)).intValue() + 12), Integer.valueOf(((Number) ListProtector.get(C07WB.LIZ(component.padding), 2)).intValue() + 12), ListProtector.get(C07WB.LIZ(component.padding), 3));
                        }
                        View viewLJIIIIZZ = C1858870yTN.LJIIIIZZ(context2, listLJIIJJI);
                        List listLJIILJJIL = C1697810uHb.LJIILJJIL(viewLJIIIIZZ);
                        c14j2Pq.addView(viewLJIIIIZZ);
                        List<Child> list2 = component.children;
                        if (list2 != null) {
                            Iterator<Child> it4 = list2.iterator();
                            while (it4.hasNext()) {
                                String str5 = it4.next().id;
                                if (Intrinsics.LJFF(str5, EnumC1995007rg.TAKO_LINK_FLOW.getTag())) {
                                    viewLJFF = C1858870yTN.LJFF(context2, C1697810uHb.LJIIJJI(0, 0, 0, 0));
                                } else if (Intrinsics.LJFF(str5, EnumC1995007rg.TAKO_CONTAINER_SUG.getTag())) {
                                    viewLJFF = C1858870yTN.LJII(context2);
                                } else if (Intrinsics.LJFF(str5, EnumC1995007rg.TAKO_BOT_MARKET.getTag())) {
                                    viewLJFF = C1858870yTN.LJI(context2);
                                }
                                if (viewLJFF != null) {
                                    listLJIILJJIL.add(viewLJFF);
                                    c14j2Pq.addView(viewLJFF);
                                }
                            }
                        }
                        pair = new Pair(c14j2Pq, listLJIILJJIL);
                    } else if (Intrinsics.LJFF(str4, EnumC1858880yTO.TAKO_USER.getTag())) {
                        FrameLayout frameLayoutLIZIZ2 = C1858870yTN.LIZIZ(context2, R.id.etl, C1858870yTN.LIZJ(C07WB.LIZ(component.padding)));
                        pair = new Pair(frameLayoutLIZIZ2, Collections.singletonList(frameLayoutLIZIZ2));
                    } else if (Intrinsics.LJFF(str4, EnumC1858880yTO.TAKO_INTERACTION.getTag())) {
                        View viewLJIIIZ = C1858870yTN.LJIIIZ(context2, C07WB.LIZ(component.padding), Boolean.TRUE);
                        pair = new Pair(viewLJIIIZ, Collections.singletonList(viewLJIIIZ));
                    } else if (Intrinsics.LJFF(str4, EnumC1858880yTO.TAKO_MESSAGE_DISCLAIMER.getTag())) {
                        View viewLJIIJJI = C1858870yTN.LJIIJJI(context2, C07WB.LIZ(component.padding), Boolean.TRUE);
                        pair = new Pair(viewLJIIJJI, Collections.singletonList(viewLJIIJJI));
                    } else if (Intrinsics.LJFF(str4, EnumC1858880yTO.TAKO_HORIZONTAL_VIDEO.getTag())) {
                        FrameLayout frameLayoutLIZIZ3 = C1858870yTN.LIZIZ(context2, R.id.etr, C1858870yTN.LIZJ(C07WB.LIZ(component.padding)));
                        pair = new Pair(frameLayoutLIZIZ3, Collections.singletonList(frameLayoutLIZIZ3));
                    } else if (Intrinsics.LJFF(str4, EnumC1858880yTO.TAKO_INTENT_VIDEO.getTag())) {
                        FrameLayout frameLayoutLIZIZ4 = C1858870yTN.LIZIZ(context2, R.id.eto, C1858870yTN.LIZJ(C07WB.LIZ(component.padding)));
                        pair = new Pair(frameLayoutLIZIZ4, Collections.singletonList(frameLayoutLIZIZ4));
                    } else if (Intrinsics.LJFF(str4, EnumC1858880yTO.TAKO_HORIZONTAL_USER.getTag())) {
                        FrameLayout frameLayoutLIZIZ5 = C1858870yTN.LIZIZ(context2, R.id.etm, C1858870yTN.LIZJ(C07WB.LIZ(component.padding)));
                        pair = new Pair(frameLayoutLIZIZ5, Collections.singletonList(frameLayoutLIZIZ5));
                    } else if (Intrinsics.LJFF(str4, EnumC1858880yTO.TAKO_GOODS.getTag())) {
                        FrameLayout frameLayoutLIZIZ6 = C1858870yTN.LIZIZ(context2, R.id.esz, C1858870yTN.LIZJ(C07WB.LIZ(component.padding)));
                        pair = new Pair(frameLayoutLIZIZ6, Collections.singletonList(frameLayoutLIZIZ6));
                    } else if (Intrinsics.LJFF(str4, EnumC1858880yTO.TAKO_IMAGE.getTag())) {
                        FrameLayout.LayoutParams layoutParamsLIZJ = C1858870yTN.LIZJ(C07WB.LIZ(component.padding));
                        layoutParamsLIZJ.width = -2;
                        FrameLayout frameLayoutLIZIZ7 = C1858870yTN.LIZIZ(context2, R.id.es4, layoutParamsLIZJ);
                        pair = new Pair(frameLayoutLIZIZ7, Collections.singletonList(frameLayoutLIZIZ7));
                    } else if (Intrinsics.LJFF(str4, enumC1858880yTO.getTag())) {
                        FrameLayout.LayoutParams layoutParamsLIZJ2 = C1858870yTN.LIZJ(C07WB.LIZ(component.padding));
                        if (C07ID.LIZ()) {
                            frameLayoutLIZIZ = new FrameLayout(context2);
                            frameLayoutLIZIZ.setId(R.id.esi);
                            C786410Ut5.a6(frameLayoutLIZIZ, layoutParamsLIZJ2);
                            C384050F3z c384050F3z = new C384050F3z();
                            c384050F3z.LJFF = Integer.valueOf(R.attr.a01);
                            c384050F3z.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.5d))));
                            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(16));
                            frameLayoutLIZIZ.setBackground(c384050F3z.LIZ(context2));
                        } else {
                            frameLayoutLIZIZ = C1858870yTN.LIZIZ(context2, R.id.esi, layoutParamsLIZJ2);
                        }
                        pair = new Pair(frameLayoutLIZIZ, Collections.singletonList(frameLayoutLIZIZ));
                    } else {
                        continue;
                    }
                    ((C259800zU) awS122S0400000_27.l2).element = Integer.valueOf(((View) pair.getFirst()).getId());
                    if (!Intrinsics.LJFF(pair.getFirst(), ((NimbleCardAnswerAssem) awS122S0400000_27.l1).pq())) {
                        ((NimbleCardAnswerAssem) awS122S0400000_27.l1).pq().addView((View) pair.getFirst());
                    }
                    NimbleCardAnswerAssem nimbleCardAnswerAssem2 = (NimbleCardAnswerAssem) awS122S0400000_27.l1;
                    View view3 = (View) pair.getFirst();
                    nimbleCardAnswerAssem2.LLLZIIL.getClass();
                    List<Ability> list3 = component.abilities;
                    String tag = EnumC174200lg.LONG_PRESS.getTag();
                    if (list3 != null && !list3.isEmpty()) {
                        Iterator<Ability> it5 = list3.iterator();
                        while (true) {
                            if (!it5.hasNext()) {
                                break;
                            }
                            if (Intrinsics.LJFF(it5.next().tag, tag)) {
                                View viewFindViewById = nimbleCardAnswerAssem2.LJJIJL().findViewById(R.id.umx);
                                C1857380yQy c1857380yQy = nimbleCardAnswerAssem2.LLLZIIL;
                                String str6 = component.id;
                                c1857380yQy.getClass();
                                List<Ability> list4 = component.abilities;
                                if (list4 != null && !list4.isEmpty()) {
                                    Iterator<Ability> it6 = list4.iterator();
                                    while (true) {
                                        if (!it6.hasNext()) {
                                            break;
                                        }
                                        if (Intrinsics.LJFF(it6.next().params.get("selection_position"), str6)) {
                                            if (viewFindViewById != null) {
                                                C19ME c19me = (C19ME) viewFindViewById.getLayoutParams();
                                                c19me.topToTop = view3.getId();
                                                c19me.bottomToBottom = view3.getId();
                                                C786410Ut5.W5(viewFindViewById, c19me);
                                            }
                                        }
                                    }
                                }
                                view3.setOnLongClickListener(new ViewOnLongClickListenerC1864620yce(nimbleCardAnswerAssem2, component, 0));
                            }
                        }
                    }
                    if (listSingletonList != null) {
                        NimbleCardAnswerAssem nimbleCardAnswerAssem3 = (NimbleCardAnswerAssem) awS122S0400000_27.l1;
                        int i2 = 0;
                        for (Object obj2 : listSingletonList) {
                            int i3 = i2 + 1;
                            if (i2 >= 0) {
                                C13IQ c13iq = (C13IQ) obj2;
                                List list5 = (List) pair.getSecond();
                                if (list5 != null && (view2 = (View) C13LP.LJJJLZIJ(i2, list5)) != null) {
                                    assembler.MQ2(nimbleCardAnswerAssem3, new AwS136S0101000_30(c13iq, (C13IQ<? extends ReusedUISlotAssem<?>>) view2.getId(), 2));
                                }
                                i2 = i3;
                            } else {
                                C1697810uHb.LJIJI();
                                throw null;
                            }
                        }
                    }
                    if (listSingletonList2 != null) {
                        NimbleCardAnswerAssem nimbleCardAnswerAssem4 = (NimbleCardAnswerAssem) awS122S0400000_27.l1;
                        for (Object obj3 : listSingletonList2) {
                            int i4 = i + 1;
                            if (i >= 0) {
                                C13IQ c13iq2 = (C13IQ) obj3;
                                List list6 = (List) pair.getSecond();
                                if (list6 != null && (view = (View) C13LP.LJJJLZIJ(i, list6)) != null) {
                                    assembler.LQ2(nimbleCardAnswerAssem4, new AwS136S0101000_30(c13iq2, (C13IQ<? extends ReusedUISlotAssem<?>>) view.getId(), 3));
                                }
                                i = i4;
                            } else {
                                C1697810uHb.LJIJI();
                                throw null;
                            }
                        }
                    } else {
                        continue;
                    }
                }
            } else {
                C1857380yQy c1857380yQy2 = ((NimbleCardAnswerAssem) awS122S0400000_27.l1).LLLZIIL;
                Template template = (Template) awS122S0400000_27.l3;
                c1857380yQy2.getClass();
                if (!C1857380yQy.LIZJ(template) && (context = ((NimbleCardAnswerAssem) awS122S0400000_27.l1).getContext()) != null) {
                    NimbleCardAnswerAssem nimbleCardAnswerAssem5 = (NimbleCardAnswerAssem) awS122S0400000_27.l1;
                    C1697810uHb.LJIIJJI(0, 0, 0, 0);
                    View viewLIZLLL = C1858870yTN.LIZLLL(context);
                    if (nimbleCardAnswerAssem5.LJJIJL() instanceof ViewGroup) {
                        ((ViewGroup) nimbleCardAnswerAssem5.LJJIJL()).addView(viewLIZLLL);
                    }
                    assembler.LQ2(nimbleCardAnswerAssem5, new AwS609S0100000_30(viewLIZLLL, 39));
                }
                AnonymousClass1425.LIZ.getClass();
                ITakoDebugService iTakoDebugServiceLIZ = AnonymousClass1425.LIZ();
                if (iTakoDebugServiceLIZ != null) {
                    iTakoDebugServiceLIZ.LJFF();
                }
                return Unit.LIZ;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$5(kotlin.jvm.internal.AwS122S0400000_27 r6, java.lang.Object r7) {
        /*
            java.lang.Object r2 = r6.l0
            X.0yaU r2 = (X.C1863280yaU) r2
            java.lang.Object r1 = r6.l1
            r2 r1 = (defpackage.r2) r1
            java.lang.String r0 = X.C1863280yaU.LJIILLIIL
            r0 = 0
            r2.LJJIJL(r1, r0)
            java.lang.Object r0 = r6.l2
            com.ss.android.ugc.aweme.tako.ccl.model.api.MessageChunkResult r0 = (com.ss.android.ugc.aweme.tako.ccl.model.api.MessageChunkResult) r0
            com.ss.android.ugc.aweme.tako.ccl.model.api.TakoQuestionnaire r5 = r0.questionnaire
            r2 = 1
            if (r5 == 0) goto L95
            int r1 = r5.type
            r0 = 2
            if (r1 != r0) goto L95
            r0 = 1
        L1d:
            java.lang.String r4 = ""
            if (r0 != 0) goto L59
            if (r5 == 0) goto L56
            int r1 = r5.type
            r0 = 3
            if (r1 == r0) goto L59
            java.lang.Object r3 = r6.l0
            X.0yaU r3 = (X.C1863280yaU) r3
            java.lang.Object r2 = r6.l1
            r2 r2 = (defpackage.r2) r2
            java.lang.Object r1 = r6.l3
            X.00zU r1 = (X.C259800zU) r1
            T r0 = r1.element
            com.ss.android.ugc.aweme.tako.ccl.model.api.Message r0 = (com.ss.android.ugc.aweme.tako.ccl.model.api.Message) r0
            if (r0 == 0) goto L3e
            java.lang.String r0 = r0.uuid
            if (r0 != 0) goto L3f
        L3e:
            r0 = r4
        L3f:
            r5.setFollowMessageId(r0)
            T r0 = r1.element
            com.ss.android.ugc.aweme.tako.ccl.model.api.Message r0 = (com.ss.android.ugc.aweme.tako.ccl.model.api.Message) r0
            if (r0 == 0) goto L4d
            java.lang.String r0 = r0.replyUuid
            if (r0 == 0) goto L4d
            r4 = r0
        L4d:
            r5.setFollowReplyMessageId(r4)
            r3.getClass()
            X.C1863280yaU.LJJJJIZL(r5, r2)
        L56:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L59:
            java.util.List<java.lang.String> r1 = X.C1863380yae.LJJIJLIJ
            if (r5 == 0) goto L61
            java.lang.String r0 = r5.anchorUuid
            if (r0 != 0) goto L62
        L61:
            r0 = r4
        L62:
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L56
            java.lang.Object r1 = r6.l2
            com.ss.android.ugc.aweme.tako.ccl.model.api.MessageChunkResult r1 = (com.ss.android.ugc.aweme.tako.ccl.model.api.MessageChunkResult) r1
            boolean r0 = r1.multiAnswerDegrade
            if (r0 == r2) goto L56
            com.ss.android.ugc.aweme.tako.ccl.model.api.TakoQuestionnaire r3 = r1.questionnaire
            if (r3 == 0) goto L56
            java.lang.Object r2 = r6.l0
            X.0yaU r2 = (X.C1863280yaU) r2
            java.lang.Object r1 = r6.l1
            r2 r1 = (defpackage.r2) r1
            java.lang.String r0 = r3.anchorUuid
            if (r0 != 0) goto L83
            r0 = r4
        L83:
            r3.setFollowMessageId(r0)
            java.lang.String r0 = r3.anchorReplyUuid
            if (r0 == 0) goto L8b
            r4 = r0
        L8b:
            r3.setFollowReplyMessageId(r4)
            r2.getClass()
            X.C1863280yaU.LJJJJIZL(r3, r1)
            goto L56
        L95:
            r0 = 0
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS122S0400000_27.invoke$5(kotlin.jvm.internal.AwS122S0400000_27, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$6(AwS122S0400000_27 awS122S0400000_27, Object obj) {
        Balloon balloon = (Balloon) ((C259800zU) awS122S0400000_27.l0).element;
        if (balloon != null) {
            balloon.dismiss();
        }
        ((C1863240yaQ) awS122S0400000_27.l1).LJJIFFI("delete");
        ((C1863240yaQ) awS122S0400000_27.l1).LJIILJJIL(((C19404410vq) awS122S0400000_27.l2).getContext(), (ConversationInfo) awS122S0400000_27.l3);
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS122S0400000_27 awS122S0400000_27, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LJ(2131822447, new AwS122S0400000_27((C259800zU) awS122S0400000_27.l0, (C259800zU<Balloon>) awS122S0400000_27.l1, (C1863240yaQ) awS122S0400000_27.l2, (C19404410vq) awS122S0400000_27.l3, (ConversationInfo) 6));
        c1397620mTQ.LJII(2131822445, AFwS271S0000000_28.get$arr$(228));
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* bridge */ /* synthetic */ java.lang.Object invoke$8(kotlin.jvm.internal.AwS122S0400000_27 r10, java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS122S0400000_27.invoke$8(kotlin.jvm.internal.AwS122S0400000_27, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$9(AwS122S0400000_27 awS122S0400000_27, Object obj) {
        C0CNO.LIZLLL(0L, new AwS83S0500000_27((C259800zU) awS122S0400000_27.l0, (TakoAnswerBaseAssem) awS122S0400000_27.l1, (C013C) awS122S0400000_27.l2, (Function1) awS122S0400000_27.l3, (BatchDetailList) obj, 3));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS122S0400000_27(C259800zU c259800zU, C259800zU<Balloon> c259800zU2, C1863240yaQ c1863240yaQ, C19404410vq c19404410vq, ConversationInfo conversationInfo) {
        super(1);
        this.$t = conversationInfo;
        this.l0 = c259800zU;
        this.l1 = c259800zU2;
        this.l2 = c1863240yaQ;
        this.l3 = c19404410vq;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS122S0400000_27(C259800zU c259800zU, C259800zU<DialogC1389620mGW> c259800zU2, TakoReferenceAssem takoReferenceAssem, C013C c013c, Function0<Unit> function0) {
        super(1);
        this.$t = function0;
        this.l0 = c259800zU;
        this.l1 = c259800zU2;
        this.l2 = takoReferenceAssem;
        this.l3 = c013c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS122S0400000_27(C830490Whz c830490Whz, TakoMixFeed takoMixFeed, MessageViewModel messageViewModel, C830490Whz c830490Whz2, int i) {
        super(1);
        this.$t = i;
        this.l0 = c830490Whz;
        this.l1 = takoMixFeed;
        this.l2 = messageViewModel;
        this.l3 = c830490Whz2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS122S0400000_27(C1787110wbd c1787110wbd, C1787830wcn c1787830wcn, Exception exc, EnumC1787180wbk enumC1787180wbk, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1787110wbd;
        this.l1 = c1787830wcn;
        this.l2 = exc;
        this.l3 = enumC1787180wbk;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS122S0400000_27(EnumC1787510wcH enumC1787510wcH, EnumC1787510wcH enumC1787510wcH2, List<C1788060wdA> list, EnumC1780720wRK enumC1780720wRK, C1787520wcI c1787520wcI) {
        super(1);
        this.$t = c1787520wcI;
        this.l0 = enumC1787510wcH;
        this.l1 = enumC1787510wcH2;
        this.l2 = list;
        this.l3 = enumC1780720wRK;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS122S0400000_27(C1797130wrn c1797130wrn, Context context, C1797250wrz c1797250wrz, AwS108S0201000_27 awS108S0201000_27, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1797130wrn;
        this.l1 = context;
        this.l2 = c1797250wrz;
        this.l3 = awS108S0201000_27;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS122S0400000_27(C1863280yaU c1863280yaU, C1863280yaU c1863280yaU2, r2 r2Var, MessageChunkResult messageChunkResult, C259800zU<Message> c259800zU) {
        super(1);
        this.$t = c259800zU;
        this.l0 = c1863280yaU;
        this.l1 = c1863280yaU2;
        this.l2 = r2Var;
        this.l3 = messageChunkResult;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS122S0400000_27(ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv, TakoContentAssem$layoutManager$1 takoContentAssem$layoutManager$1, C19EG c19eg, C1861350yXN c1861350yXN, int i) {
        super(1);
        this.$t = i;
        this.l0 = viewOnAttachStateChangeListenerC20604515jv;
        this.l1 = takoContentAssem$layoutManager$1;
        this.l2 = c19eg;
        this.l3 = c1861350yXN;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS122S0400000_27(Fragment fragment, IMessageAbility iMessageAbility, TakoEnterParams takoEnterParams, C1862660yZU c1862660yZU, int i) {
        super(1);
        this.$t = i;
        this.l0 = iMessageAbility;
        this.l1 = takoEnterParams;
        this.l2 = fragment;
        this.l3 = c1862660yZU;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS122S0400000_27(MessageViewModel messageViewModel, w2 w2Var, TakoSug takoSug, AwS393S0200000_27 awS393S0200000_27, int i) {
        super(1);
        this.$t = i;
        this.l0 = messageViewModel;
        this.l1 = w2Var;
        this.l2 = takoSug;
        this.l3 = awS393S0200000_27;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS122S0400000_27(IMessageAbility iMessageAbility, IMessageAbility iMessageAbility2, Context context, Message message, List<Message> list) {
        super(1);
        this.$t = list;
        this.l0 = iMessageAbility;
        this.l1 = iMessageAbility2;
        this.l2 = context;
        this.l3 = message;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS122S0400000_27(Message message, Message message2, w2 w2Var, MessageViewModel messageViewModel, int i) {
        super(1);
        this.$t = i;
        this.l0 = message;
        this.l1 = message2;
        this.l2 = w2Var;
        this.l3 = messageViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS122S0400000_27(Message message, Message message2, Map<String, String> map, MessageViewModel messageViewModel, Map<String, String> map2) {
        super(1);
        this.$t = map2;
        this.l0 = message;
        this.l1 = message2;
        this.l2 = map;
        this.l3 = messageViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS122S0400000_27(TakoEnterParams takoEnterParams, Message message, C1862660yZU c1862660yZU, SearchLandingPageResponse searchLandingPageResponse, int i) {
        super(1);
        this.$t = i;
        this.l0 = takoEnterParams;
        this.l1 = message;
        this.l2 = c1862660yZU;
        this.l3 = searchLandingPageResponse;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS122S0400000_27(List list, List<Component> list2, NimbleCardAnswerAssem nimbleCardAnswerAssem, C259800zU<Integer> c259800zU, Template template) {
        super(1);
        this.$t = template;
        this.l0 = list;
        this.l1 = list2;
        this.l2 = nimbleCardAnswerAssem;
        this.l3 = c259800zU;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS122S0400000_27(C259800zU c259800zU, TakoAnswerBaseAssem takoAnswerBaseAssem, C013C c013c, AwS29S1400000_27 awS29S1400000_27, String str, int i) {
        super(1);
        this.$t = i;
        this.l0 = c259800zU;
        this.l1 = takoAnswerBaseAssem;
        this.l2 = c013c;
        this.l3 = awS29S1400000_27;
    }
}
