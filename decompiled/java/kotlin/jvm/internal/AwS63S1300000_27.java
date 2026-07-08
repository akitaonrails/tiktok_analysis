package kotlin.jvm.internal;

import X.C07EI;
import X.C09AY;
import X.C123100dR;
import X.C1318505Dz;
import X.C13BV;
import X.C13LP;
import X.C1854650yMZ;
import X.C1854660yMa;
import X.C1854670yMb;
import X.C1854680yMc;
import X.C1856090yOt;
import X.C1859190yTt;
import X.C1862290yYt;
import X.C1862660yZU;
import X.C20227614Cs;
import X.C665120Q7a;
import X.EnumC20234414Fi;
import X.InterfaceC1859540yUS;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility;
import com.ss.android.ugc.aweme.tako.botpage.components.flowmarkdown.assem.TakoNewMarkdownAssem;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseVideo;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.MessageSender;
import com.ss.android.ugc.aweme.tako.ccl.model.api.SearchLandingPageResponse;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoAnyCard;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoPlaceholderSource;
import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import com.ss.android.ugc.aweme.tako.model.TakoEntranceRequestInfo;
import com.ss.android.ugc.aweme.tako.router.model.TakoAutoSendData;
import defpackage.d8;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes28.dex */
public class AwS63S1300000_27 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
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

    public static final Object invoke$0(AwS63S1300000_27 awS63S1300000_27, Object obj) {
        List<String> urlList;
        String str;
        TakoAutoSendData takoAutoSendData = (TakoAutoSendData) obj;
        takoAutoSendData.setImagePathList((List) awS63S1300000_27.l1);
        takoAutoSendData.setSendType(EnumC20234414Fi.SEND_TYPE_IMAGE_QA);
        takoAutoSendData.setMobParams(C1862290yYt.LIZ(((C1318505Dz) awS63S1300000_27.l2).LIZ, (C1856090yOt) awS63S1300000_27.l3, awS63S1300000_27.s0));
        C1318505Dz c1318505Dz = (C1318505Dz) awS63S1300000_27.l2;
        String str2 = awS63S1300000_27.s0;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("mode_source", str2);
        linkedHashMap.put("tagList", c1318505Dz.LIZIZ);
        UrlModel urlModel = c1318505Dz.LJFF;
        if (urlModel != null && (urlList = urlModel.getUrlList()) != null && (str = (String) C13LP.LJJJLL(urlList)) != null && str.length() > 0) {
            linkedHashMap.put("detailPictUrl", str);
        }
        String str3 = c1318505Dz.LJ;
        if (str3 != null && str3.length() > 0) {
            linkedHashMap.put("detailPictUri", str3);
        }
        takoAutoSendData.setRequestInfo(new TakoEntranceRequestInfo(null, null, null, linkedHashMap, null, null));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS63S1300000_27 awS63S1300000_27, Object obj) {
        List<BaseImage> listSingletonList;
        TakoMixFeed takoMixFeed = (TakoMixFeed) obj;
        takoMixFeed.text = awS63S1300000_27.s0;
        if (!(!((BaseImage) awS63S1300000_27.l1).urlList.isEmpty()) && !C123100dR.LIZ(((BaseImage) awS63S1300000_27.l1).uri)) {
            listSingletonList = C13BV.INSTANCE;
        } else {
            listSingletonList = Collections.singletonList((BaseImage) awS63S1300000_27.l1);
        }
        takoMixFeed.images = listSingletonList;
        C13BV c13bv = C13BV.INSTANCE;
        takoMixFeed.style = c13bv;
        takoMixFeed.videos = Collections.singletonList((BaseVideo) awS63S1300000_27.l2);
        takoMixFeed.fromVideoSug = true;
        takoMixFeed.videoList = c13bv;
        takoMixFeed.cardType = 1010;
        takoMixFeed.msgExt = (Map) awS63S1300000_27.l3;
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS63S1300000_27 awS63S1300000_27, Object obj) {
        ((C1854680yMc) obj).LIZ = new C1854670yMb(awS63S1300000_27.s0, (Function0) awS63S1300000_27.l1, (C1854650yMZ) awS63S1300000_27.l2, (C1854660yMa) awS63S1300000_27.l3);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS63S1300000_27 awS63S1300000_27, Object obj) {
        Message messageYy1;
        TakoAnyCard takoAnyCard;
        TakoPlaceholderSource takoPlaceholderSource;
        Message messageYy12;
        TakoAnyCard takoAnyCard2;
        TakoAnyCard takoAnyCard3;
        Integer num;
        int iIntValue = ((Number) obj).intValue();
        if (!C07EI.LIZ()) {
            if (iIntValue > C1859190yTt.LLJILJIL && ((takoPlaceholderSource = (TakoPlaceholderSource) awS63S1300000_27.l1) == null || (takoAnyCard3 = takoPlaceholderSource.anyCard) == null || (num = takoAnyCard3.height) == null || iIntValue != num.intValue())) {
                TakoPlaceholderSource takoPlaceholderSource2 = (TakoPlaceholderSource) awS63S1300000_27.l1;
                if (takoPlaceholderSource2 != null && (takoAnyCard2 = takoPlaceholderSource2.anyCard) != null) {
                    takoAnyCard2.height = Integer.valueOf(iIntValue);
                }
                TakoCardAbility takoCardAbilitySp = ((TakoNewMarkdownAssem) awS63S1300000_27.l2).sp();
                if (takoCardAbilitySp != null && (messageYy12 = takoCardAbilitySp.Yy1()) != null) {
                    messageYy12.LJIIJJI(new AwS30S1101000_27((Map) awS63S1300000_27.l3, awS63S1300000_27.s0, iIntValue, 0));
                }
                InterfaceC1859540yUS interfaceC1859540yUS = ((TakoNewMarkdownAssem) awS63S1300000_27.l2).LLJLL;
                if (interfaceC1859540yUS != null) {
                    ((TakoNewMarkdownAssem) awS63S1300000_27.l2).rr(interfaceC1859540yUS);
                }
            }
        } else {
            Integer num2 = (Integer) ((LinkedHashMap) ((TakoNewMarkdownAssem) awS63S1300000_27.l2).LLJJLIIIJLLLLLLLZ).get(awS63S1300000_27.s0);
            if (iIntValue > C1859190yTt.LLJILJIL && (num2 == null || iIntValue != num2.intValue())) {
                ((TakoNewMarkdownAssem) awS63S1300000_27.l2).LLJJLIIIJLLLLLLLZ.put(awS63S1300000_27.s0, Integer.valueOf(iIntValue));
                TakoPlaceholderSource takoPlaceholderSource3 = (TakoPlaceholderSource) awS63S1300000_27.l1;
                if (takoPlaceholderSource3 != null && (takoAnyCard = takoPlaceholderSource3.anyCard) != null) {
                    takoAnyCard.height = Integer.valueOf(iIntValue);
                }
                TakoCardAbility takoCardAbilitySp2 = ((TakoNewMarkdownAssem) awS63S1300000_27.l2).sp();
                if (takoCardAbilitySp2 != null && (messageYy1 = takoCardAbilitySp2.Yy1()) != null) {
                    messageYy1.LJIIJJI(new AwS30S1101000_27((Map) awS63S1300000_27.l3, awS63S1300000_27.s0, iIntValue, 1));
                }
                InterfaceC1859540yUS interfaceC1859540yUS2 = ((TakoNewMarkdownAssem) awS63S1300000_27.l2).LLJLL;
                if (interfaceC1859540yUS2 != null) {
                    ((TakoNewMarkdownAssem) awS63S1300000_27.l2).rr(interfaceC1859540yUS2);
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS63S1300000_27 awS63S1300000_27, Object obj) {
        Message message = (Message) obj;
        message.sender = new MessageSender(2, 0L, 0L, false, "");
        message.msgType = 3;
        message.uuid = UUID.randomUUID().toString();
        message.replyUuid = awS63S1300000_27.s0;
        message.LIZLLL = System.currentTimeMillis();
        message.LIZIZ = 1;
        if (C20227614Cs.LIZIZ((TakoEnterParams) awS63S1300000_27.l1)) {
            TakoEnterParams takoEnterParams = (TakoEnterParams) awS63S1300000_27.l1;
            message.botId = takoEnterParams.botInfo.botId;
            message.subSessionId = takoEnterParams.getSubProcessId();
        }
        message.LIZJ(new AwS122S0400000_27((TakoEnterParams) awS63S1300000_27.l1, message, (C1862660yZU) awS63S1300000_27.l2, (SearchLandingPageResponse) awS63S1300000_27.l3, 15));
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS63S1300000_27 awS63S1300000_27, Object obj) {
        IMessageAbility iMessageAbility = (IMessageAbility) awS63S1300000_27.l1;
        iMessageAbility.O62(awS63S1300000_27.s0, new d8(new AwS271S0300000_27(iMessageAbility, (C665120Q7a) awS63S1300000_27.l2, (TakoEnterParams) awS63S1300000_27.l3, 19)));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS63S1300000_27(IMessageAbility iMessageAbility, String str, C665120Q7a c665120Q7a, TakoEnterParams takoEnterParams, int i) {
        super(1);
        this.$t = i;
        this.l1 = iMessageAbility;
        this.s0 = str;
        this.l2 = c665120Q7a;
        this.l3 = takoEnterParams;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS63S1300000_27(SearchLandingPageResponse searchLandingPageResponse, TakoEnterParams takoEnterParams, C1862660yZU c1862660yZU, String str, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = takoEnterParams;
        this.l2 = c1862660yZU;
        this.l3 = searchLandingPageResponse;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS63S1300000_27(TakoPlaceholderSource takoPlaceholderSource, TakoPlaceholderSource takoPlaceholderSource2, TakoNewMarkdownAssem takoNewMarkdownAssem, String str, Map<String, TakoPlaceholderSource> map) {
        super(1);
        this.$t = map;
        this.l1 = takoPlaceholderSource;
        this.l2 = takoPlaceholderSource2;
        this.s0 = takoNewMarkdownAssem;
        this.l3 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS63S1300000_27(String str, String str2, BaseImage baseImage, BaseVideo baseVideo, Map<String, String> map) {
        super(1);
        this.$t = map;
        this.s0 = str;
        this.l1 = str2;
        this.l2 = baseImage;
        this.l3 = baseVideo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS63S1300000_27(String str, String str2, Function0<Unit> function0, C1854650yMZ c1854650yMZ, C1854660yMa c1854660yMa) {
        super(1);
        this.$t = c1854660yMa;
        this.s0 = str;
        this.l1 = str2;
        this.l2 = function0;
        this.l3 = c1854650yMZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS63S1300000_27(List list, List<String> list2, C1318505Dz c1318505Dz, C1856090yOt c1856090yOt, String str) {
        super(1);
        this.$t = str;
        this.l1 = list;
        this.l2 = list2;
        this.l3 = c1318505Dz;
        this.s0 = c1856090yOt;
    }
}
