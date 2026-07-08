package kotlin.jvm.internal;

import X.C09AY;
import X.C0DQF;
import X.C0PI2;
import X.C1161920gLG;
import X.C12824050c;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C1558520qew;
import X.C1797130wrn;
import X.C1797250wrz;
import X.C1852810yJb;
import X.C1854760yMk;
import X.C1855920yOc;
import X.C1858150ySD;
import X.C1862330yYx;
import X.C1862480yZC;
import X.C1862660yZU;
import X.C1862950yZx;
import X.C1864000ybe;
import X.C1919007fQ;
import X.C19723912Ez;
import X.C19EG;
import X.C20227614Cs;
import X.C2097608Jq;
import X.C259800zU;
import X.C419910GdJ;
import X.C443120HZe;
import X.C785410UrT;
import X.C830490Whz;
import X.C985403tE;
import X.EnumC1857430yR3;
import X.EnumC1858090yS7;
import X.InterfaceC665370Q7z;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.BottomInputAssem;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.TakoReferenceAskInfo;
import com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem;
import com.ss.android.ugc.aweme.tako.botpage.components.image.TakoAIImageConvertStyleFragment;
import com.ss.android.ugc.aweme.tako.botpage.submodebar.TakoSubModeBarAbility;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.ITakoScreenTypeAbility;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.MessageSender;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoNimbleConfig;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoPassExt;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoSourceItem;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoVideoItem;
import com.ss.android.ugc.aweme.tako.detail.operator.BatchDetailList;
import com.ss.android.ugc.aweme.tako.model.NimbleParams;
import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes28.dex */
public class AwS29S1400000_27 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS29S1400000_27 awS29S1400000_27, Object obj) {
        String string;
        TakoReferenceAskInfo takoReferenceAskInfo;
        IMessageAbility iMessageAbilityOp = ((BottomInputAssem) awS29S1400000_27.l1).op();
        int i = 0;
        if (iMessageAbilityOp != null && iMessageAbilityOp.oj()) {
            C830490Whz c830490Whz = new C830490Whz();
            c830490Whz.put("is_resend", CardStruct.IStatusCode.DEFAULT);
            c830490Whz.put("interaction_type", "manual_input");
            c830490Whz.put("message_type", "image");
            TakoSubModeBarAbility takoSubModeBarAbilityEp = ((BottomInputAssem) awS29S1400000_27.l1).Ep();
            if (takoSubModeBarAbilityEp != null) {
                takoSubModeBarAbilityEp.br0();
            }
            IMessageAbility iMessageAbilityOp2 = ((BottomInputAssem) awS29S1400000_27.l1).op();
            if (iMessageAbilityOp2 != null) {
                Context context = (Context) awS29S1400000_27.l2;
                if (context == null || (string = context.getString(2131849635)) == null) {
                    string = "";
                }
                List listSingletonList = Collections.singletonList((BaseImage) awS29S1400000_27.l3);
                List listSingletonList2 = Collections.singletonList(obj);
                EnumC1858090yS7 enumC1858090yS7 = EnumC1858090yS7.CUSTOM;
                if (!Intrinsics.LJFF(awS29S1400000_27.s0, "image_shortcuts")) {
                    i = 3;
                }
                String str = awS29S1400000_27.s0;
                Map<String, String> commonParams = ((BottomInputAssem) awS29S1400000_27.l1).getCommonParams();
                C1854760yMk c1854760yMk = ((BottomInputAssem) awS29S1400000_27.l1).LLJJJ;
                if (c1854760yMk != null) {
                    takoReferenceAskInfo = c1854760yMk.getTakoReferenceAskInfo();
                } else {
                    takoReferenceAskInfo = null;
                }
                C1858150ySD.LIZIZ(iMessageAbilityOp2, string, listSingletonList, listSingletonList2, true, enumC1858090yS7, i, null, 3002, str, null, commonParams, c830490Whz, false, null, null, null, takoReferenceAskInfo, ((BottomInputAssem) awS29S1400000_27.l1).LLLLZI, 127552);
            }
        } else {
            TakoSubModeBarAbility takoSubModeBarAbilityEp2 = ((BottomInputAssem) awS29S1400000_27.l1).Ep();
            if (takoSubModeBarAbilityEp2 != null) {
                takoSubModeBarAbilityEp2.br0();
            }
            C19EG activity = ((TakoAIImageConvertStyleFragment) awS29S1400000_27.l4).getActivity();
            if (activity != null) {
                BottomInputAssem bottomInputAssem = (BottomInputAssem) awS29S1400000_27.l1;
                C0DQF.LIZ.LJIIL(activity, bottomInputAssem.getContentView(), bottomInputAssem.getCommonParams(), bottomInputAssem.getBotInfo());
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS29S1400000_27 awS29S1400000_27, Object obj) {
        List<C0PI2> list;
        TakoVideoItem takoVideoItem;
        String str;
        BatchDetailList batchDetailList = (BatchDetailList) obj;
        if (batchDetailList != null && (list = batchDetailList.items) != null) {
            List list2 = (List) awS29S1400000_27.l4;
            for (C0PI2 c0pi2 : list) {
                Object obj2 = null;
                if (list2 != null) {
                    Iterator it2 = list2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next = it2.next();
                        TakoVideoItem takoVideoItem2 = ((TakoSourceItem) next).video;
                        if (takoVideoItem2 != null) {
                            str = takoVideoItem2.awemeId;
                        } else {
                            str = null;
                        }
                        if (Intrinsics.LJFF(str, c0pi2.getAid())) {
                            obj2 = next;
                            break;
                        }
                    }
                    TakoSourceItem takoSourceItem = (TakoSourceItem) obj2;
                    if (takoSourceItem != null && (takoVideoItem = takoSourceItem.video) != null) {
                        takoVideoItem.LIZ = c0pi2;
                    }
                }
            }
        }
        ((TakoAnswerBaseAssem) awS29S1400000_27.l1).Jq((List) awS29S1400000_27.l2, (View) awS29S1400000_27.l3, awS29S1400000_27.s0);
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$2(AwS29S1400000_27 awS29S1400000_27, Object obj) {
        int iIntValue;
        int iIntValue2;
        NimbleParams nimbleParams;
        Message message = (Message) obj;
        message.sender = new MessageSender(2, 0L, 0L, false, "");
        message.msgType = 3;
        message.uuid = awS29S1400000_27.s0;
        String str = (String) ((C259800zU) awS29S1400000_27.l1).element;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        message.replyUuid = str;
        message.LIZLLL = System.currentTimeMillis();
        message.LIZIZ = 1;
        if (C20227614Cs.LIZIZ((TakoEnterParams) awS29S1400000_27.l2)) {
            TakoEnterParams takoEnterParams = (TakoEnterParams) awS29S1400000_27.l2;
            message.botId = takoEnterParams.botInfo.botId;
            message.subSessionId = takoEnterParams.getSubProcessId();
        } else if (Intrinsics.LJFF(((TakoEnterParams) awS29S1400000_27.l2).enterMethod, "click_tako_brand_card")) {
            message.botId = ((TakoEnterParams) awS29S1400000_27.l2).botInfo.botId;
        }
        TakoMixFeed takoMixFeed = (TakoMixFeed) awS29S1400000_27.l3;
        if (takoMixFeed != null) {
            message.LJIIJ(takoMixFeed);
            C443120HZe c443120HZeLIZJ = C1862480yZC.LIZJ(C1864000ybe.LIZIZ, (TakoEnterParams) awS29S1400000_27.l2, (C1862660yZU) awS29S1400000_27.l4, message.uuid);
            if (c443120HZeLIZJ != null) {
                TakoNimbleConfig takoNimbleConfig = (TakoNimbleConfig) c443120HZeLIZJ.getFirst();
                Map<String, ? extends Object> map = (Map) c443120HZeLIZJ.getSecond();
                String str3 = (String) c443120HZeLIZJ.getThird();
                takoMixFeed.nimbleConfig = takoNimbleConfig;
                takoMixFeed.LIZ = map;
                takoMixFeed.nimbleDataStr = str3;
            }
            TakoEnterParams takoEnterParams2 = (TakoEnterParams) awS29S1400000_27.l2;
            String str4 = takoEnterParams2.searchMessageType;
            if (str4 != null) {
                str2 = str4;
            }
            String strLIZIZ = takoEnterParams2.searchIdList;
            if (strLIZIZ == null && (strLIZIZ = C1862480yZC.LIZIZ(takoMixFeed.LIZ)) == null) {
                strLIZIZ = C12824050c.LIZ();
            }
            Integer num = ((TakoEnterParams) awS29S1400000_27.l2).searchIsQuoteVideo;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            takoMixFeed.ext = new TakoPassExt(0, null, 0, "", str2, strLIZIZ, iIntValue, "", 0, "", 0, "", null, null, 0, null, "");
            Integer searchCardType = ((TakoEnterParams) awS29S1400000_27.l2).getSearchCardType();
            if (searchCardType != null || ((nimbleParams = ((TakoEnterParams) awS29S1400000_27.l2).getNimbleParams()) != null && (searchCardType = nimbleParams.nimbleCardType) != null)) {
                iIntValue2 = searchCardType.intValue();
            } else {
                iIntValue2 = 201;
            }
            takoMixFeed.cardType = iIntValue2;
        } else {
            message.LIZJ(new AwS236S0300000_27((TakoEnterParams) awS29S1400000_27.l2, message, (C1862660yZU) awS29S1400000_27.l4, 18));
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$3(AwS29S1400000_27 awS29S1400000_27, Object obj) {
        Dialog dialog = (Dialog) obj;
        dialog.dismiss();
        C785410UrT.LIZ(dialog);
        C1797130wrn c1797130wrn = (C1797130wrn) awS29S1400000_27.l1;
        Context context = (Context) awS29S1400000_27.l2;
        C1797250wrz c1797250wrz = (C1797250wrz) awS29S1400000_27.l3;
        c1797130wrn.getClass();
        C1797130wrn.LJIJ(context, c1797250wrz, "web_recharge");
        ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle((Context) awS29S1400000_27.l2, awS29S1400000_27.s0);
        ((Function1) awS29S1400000_27.l4).invoke(Boolean.FALSE);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS29S1400000_27 awS29S1400000_27, Object obj) {
        Map<String, String> mapLJ;
        String str;
        Integer numValueOf;
        String strNZ0;
        Context context;
        IMessageAbility iMessageAbility = (IMessageAbility) C1558520qew.LIZ((InterfaceC665370Q7z) awS29S1400000_27.l1, IMessageAbility.class, null);
        Message message = (Message) awS29S1400000_27.l2;
        if (message.isMultiAnswer && (context = (Context) awS29S1400000_27.l3) != null) {
            C1397580mTM c1397580mTM = new C1397580mTM(context);
            c1397580mTM.LIZ(2131822446);
            C985403tE.LIZ(c1397580mTM, new AwS122S0400000_27(iMessageAbility, (IMessageAbility) awS29S1400000_27.l3, (Context) awS29S1400000_27.l2, (Message) awS29S1400000_27.l4, (List<Message>) 17));
            new C1397510mTF(c1397580mTM).LIZLLL();
        } else if (iMessageAbility != null) {
            iMessageAbility.cN0((Context) awS29S1400000_27.l3, message, (List) awS29S1400000_27.l4, true);
        }
        C1862330yYx c1862330yYx = C1862330yYx.LIZ;
        ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) C1558520qew.LIZ((InterfaceC665370Q7z) awS29S1400000_27.l1, ITakoContextAbility.class, null);
        if (iTakoContextAbility == null || (mapLJ = iTakoContextAbility.getCommonParams()) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        Message message2 = (Message) awS29S1400000_27.l2;
        String str2 = message2.uuid;
        String str3 = message2.subSessionId;
        long j = message2.actionId;
        long j2 = message2.botId;
        String strLIZIZ = C1855920yOc.LIZIZ(message2);
        String strLIZLLL = C1852810yJb.LIZLLL(Integer.valueOf(((Message) awS29S1400000_27.l2).ext.activeAiImageSubBar));
        Message message3 = (Message) awS29S1400000_27.l2;
        boolean z = message3.isMultiAnswer;
        if (z) {
            str = "multi_answer";
        } else {
            str = "default";
        }
        if (z) {
            numValueOf = Integer.valueOf(message3.selectedAnswerIndex + 1);
        } else {
            numValueOf = null;
        }
        ITakoScreenTypeAbility iTakoScreenTypeAbility = (ITakoScreenTypeAbility) C1558520qew.LIZ((InterfaceC665370Q7z) awS29S1400000_27.l1, ITakoScreenTypeAbility.class, null);
        if (iTakoScreenTypeAbility == null || (strNZ0 = iTakoScreenTypeAbility.nZ0()) == null) {
            strNZ0 = "full_screen";
        }
        C1862950yZx c1862950yZx = C1862950yZx.LIZ;
        InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) awS29S1400000_27.l1;
        c1862950yZx.getClass();
        C1862330yYx.LJJLJ(c1862330yYx, mapLJ, str2, str3, Long.valueOf(j), Long.valueOf(j2), "delete", strLIZIZ, awS29S1400000_27.s0, strLIZLLL, null, null, null, str, numValueOf, strNZ0, C1862950yZx.LIZJ(interfaceC665370Q7z), 69120);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS29S1400000_27 awS29S1400000_27, Object obj) {
        int i;
        Integer numValueOf;
        C19723912Ez c19723912Ez = (C19723912Ez) obj;
        c19723912Ez.LIZ = EnumC1857430yR3.DELETE;
        c19723912Ez.LIZJ = Integer.valueOf(R.string.gm7);
        C1919007fQ.LIZ.getClass();
        if (C1919007fQ.LIZLLL()) {
            i = R.attr.a1i;
        } else {
            i = R.attr.a1h;
        }
        c19723912Ez.LIZLLL = i;
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_trash_bin;
        if (C1919007fQ.LIZLLL()) {
            numValueOf = Integer.valueOf(R.attr.a1i);
        } else {
            numValueOf = Integer.valueOf(R.attr.a1h);
        }
        c419910GdJ.LJ = numValueOf;
        c19723912Ez.LJ = c419910GdJ;
        c19723912Ez.LJIIJ = new AwS29S1400000_27((InterfaceC665370Q7z) awS29S1400000_27.l1, (InterfaceC665370Q7z) awS29S1400000_27.l2, (Message) awS29S1400000_27.l3, (Context) awS29S1400000_27.l4, (List<Message>) awS29S1400000_27.s0, (String) 4);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS29S1400000_27(InterfaceC665370Q7z interfaceC665370Q7z, InterfaceC665370Q7z interfaceC665370Q7z2, Message message, Context context, List<Message> list, String str) {
        super(1);
        this.$t = str;
        this.l1 = interfaceC665370Q7z;
        this.l2 = interfaceC665370Q7z2;
        this.l3 = message;
        this.l4 = context;
        this.s0 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS29S1400000_27(C1797130wrn c1797130wrn, Context context, C1797250wrz c1797250wrz, String str, AwS108S0201000_27 awS108S0201000_27, int i) {
        super(1);
        this.$t = i;
        this.l1 = c1797130wrn;
        this.l2 = context;
        this.l3 = c1797250wrz;
        this.s0 = str;
        this.l4 = awS108S0201000_27;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS29S1400000_27(BottomInputAssem bottomInputAssem, Context context, BaseImage baseImage, String str, TakoAIImageConvertStyleFragment takoAIImageConvertStyleFragment, int i) {
        super(1);
        this.$t = i;
        this.l1 = bottomInputAssem;
        this.l2 = context;
        this.l3 = baseImage;
        this.s0 = str;
        this.l4 = takoAIImageConvertStyleFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS29S1400000_27(TakoAnswerBaseAssem takoAnswerBaseAssem, TakoAnswerBaseAssem<T> takoAnswerBaseAssem2, List<? extends CharSequence> list, View view, String str, List<TakoSourceItem> list2) {
        super(1);
        this.$t = list2;
        this.l1 = takoAnswerBaseAssem;
        this.l2 = takoAnswerBaseAssem2;
        this.l3 = list;
        this.s0 = view;
        this.l4 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS29S1400000_27(String str, String str2, C259800zU<String> c259800zU, TakoEnterParams takoEnterParams, TakoMixFeed takoMixFeed, C1862660yZU c1862660yZU) {
        super(1);
        this.$t = c1862660yZU;
        this.s0 = str;
        this.l1 = str2;
        this.l2 = c259800zU;
        this.l3 = takoEnterParams;
        this.l4 = takoMixFeed;
    }
}
