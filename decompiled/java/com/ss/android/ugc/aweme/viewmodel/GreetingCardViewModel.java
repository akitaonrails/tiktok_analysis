package com.ss.android.ugc.aweme.viewmodel;

import X.AbstractC19994813Le;
import X.AbstractC909840Zmg;
import X.C013C;
import X.C01GW;
import X.C051M;
import X.C09BH;
import X.C0I0B;
import X.C0PEM;
import X.C0VSJ;
import X.C0ZDX;
import X.C1383370m6R;
import X.C13BV;
import X.C13LP;
import X.C1400340mXo;
import X.C1503305uZ;
import X.C1559260qg8;
import X.C1710306mr;
import X.C20684815ws;
import X.C2097608Jq;
import X.C23250099c;
import X.C452501pT;
import X.C457780HxI;
import X.C461300I7c;
import X.C723600SZy;
import X.C817503Hh;
import X.C869590Y9l;
import X.C908950ZlF;
import X.C909290Zln;
import X.EnumC310830CGj;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import android.net.Uri;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.message.template.component.GreetingCardInfoComponent;
import com.ss.android.ugc.aweme.im.service.service.IDMGreetingCardGeckoChannelManager;
import com.ss.android.ugc.aweme.im.strategy.commonresource.GreetingCardResource;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS223S0300000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes15.dex */
public final class GreetingCardViewModel extends AssemViewModel<C908950ZlF> {
    public String LLIZLLLIL;
    public final C1559260qg8 LL = new C1559260qg8(new C723600SZy(this, C457780HxI.class, null), true);
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1168));
    public Map<String, GreetingCardResource> LLILLL = C2097608Jq.LJ();
    public List<String> LLILZ = C13BV.INSTANCE;
    public String LLILZIL = "";
    public String LLILZLL = "";
    public String LLIZ = "";
    public final C01GW LLJ = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(324));

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C908950ZlF(null);
    }

    public final void yQ2() {
        setState(AFwS248S0000000_14.get$arr$(347));
    }

    public static Map wQ2(String str) {
        Map<String, String> mapLIZLLL;
        IDMGreetingCardGeckoChannelManager iDMGreetingCardGeckoChannelManager = (IDMGreetingCardGeckoChannelManager) PluggableExtentionKt.pluggableSpiForReal(IDMGreetingCardGeckoChannelManager.class);
        if (iDMGreetingCardGeckoChannelManager == null || (mapLIZLLL = iDMGreetingCardGeckoChannelManager.LIZLLL(str)) == null) {
            return new LinkedHashMap();
        }
        return mapLIZLLL;
    }

    public final void AQ2(String str) {
        String strLJIIJ;
        String strLJIIJ2;
        String strLJ;
        C909290Zln c909290Zln;
        IMUser fromUser;
        SessionInfo sessionInfo = (SessionInfo) this.LLILLJJLI.getValue();
        String displayName = null;
        if ((sessionInfo instanceof C909290Zln) && (c909290Zln = (C909290Zln) sessionInfo) != null && (fromUser = c909290Zln.getFromUser()) != null) {
            displayName = fromUser.getDisplayName();
        }
        if (displayName != null) {
            strLJIIJ = C1710306mr.LIZIZ(2131831039, displayName);
            if (strLJIIJ.length() > 18) {
                strLJIIJ = C1383370m6R.LJIIJ(2131831035);
            }
        } else {
            SessionInfo sessionInfo2 = (SessionInfo) this.LLILLJJLI.getValue();
            if (sessionInfo2 != null && sessionInfo2.isGroupChat()) {
                strLJIIJ = C1383370m6R.LJIIJ(2131831036);
            } else {
                strLJIIJ = C1383370m6R.LJIIJ(2131831035);
            }
        }
        this.LLILZLL = strLJIIJ;
        User currentUser = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurrentUser();
        if (currentUser == null || (strLJIIJ2 = currentUser.getNickname()) == null || strLJIIJ2.length() > 18) {
            strLJIIJ2 = C1383370m6R.LJIIJ(2131831037);
        }
        this.LLILZIL = strLJIIJ2;
        GreetingCardResource greetingCardResource = this.LLILLL.get(str);
        if (greetingCardResource != null && Intrinsics.LJFF(greetingCardResource.getHasPregeneratedText(), Boolean.FALSE)) {
            this.LLILZ = C13BV.INSTANCE;
            return;
        }
        IDMGreetingCardGeckoChannelManager iDMGreetingCardGeckoChannelManager = (IDMGreetingCardGeckoChannelManager) PluggableExtentionKt.pluggableSpiForReal(IDMGreetingCardGeckoChannelManager.class);
        if (iDMGreetingCardGeckoChannelManager != null && (strLJ = iDMGreetingCardGeckoChannelManager.LJ(str)) != null) {
            try {
                this.LLILZ = C051M.LIZLLL(String[].class, C09BH.LJI(new C0VSJ(strLJ), Charsets.UTF_8), false);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                this.LLILZ = C13BV.INSTANCE;
            }
        } else {
            this.LLILZ = C13BV.INSTANCE;
        }
        String str2 = (String) C13LP.LJLJJL(this.LLILZ, AbstractC19994813Le.Default);
        if (str2 == null) {
            str2 = "";
        }
        this.LLIZ = str2;
    }

    public final void BQ2(String str) {
        SessionInfo sessionInfo;
        String eventTrackingName;
        String str2;
        String string;
        AbstractC909840Zmg abstractC909840Zmg = getState().LL;
        if (abstractC909840Zmg != null && (sessionInfo = (SessionInfo) this.LLILLJJLI.getValue()) != null) {
            C869590Y9l c869590Y9l = abstractC909840Zmg.LIZIZ;
            GreetingCardResource greetingCardResource = this.LLILLL.get(abstractC909840Zmg.LIZ);
            String str3 = "";
            if (greetingCardResource == null || (eventTrackingName = greetingCardResource.getEventTrackingName()) == null) {
                eventTrackingName = "";
            }
            C0I0B.LJFF.LIZIZ();
            Pair[] pairArr = new Pair[6];
            pairArr[0] = new Pair("enter_from", sessionInfo.getEnterFromForMob());
            if (sessionInfo.getChatType() == 3) {
                str2 = "group";
            } else {
                str2 = "private";
            }
            pairArr[1] = new Pair("chat_type", str2);
            pairArr[2] = new Pair("conversation_id", sessionInfo.getConversationId());
            if (c869590Y9l != null && (string = Long.valueOf(c869590Y9l.getSender()).toString()) != null) {
                str3 = string;
            }
            pairArr[3] = new Pair("from_user_id", str3);
            pairArr[4] = new Pair("greeting_card_name", eventTrackingName);
            pairArr[5] = new Pair("button_name", str);
            C20684815ws.LJIILLIIL("ttsocial_dm_greeting_card_click", C2097608Jq.LJIIIIZZ(pairArr));
        }
    }

    public final UrlModel xQ2(String str, boolean z) {
        String str2;
        Map mapWQ2 = wQ2(str);
        if (z) {
            str2 = (String) mapWQ2.get(EnumC310830CGj.MESSAGE_OPEN_IMAGE.getPath());
        } else {
            str2 = (String) mapWQ2.get(EnumC310830CGj.MESSAGE_CLOSE_IMAGE.getPath());
        }
        if (str2 != null) {
            C0VSJ c0vsj = new C0VSJ(str2);
            if (c0vsj.exists()) {
                String string = Uri.fromFile(c0vsj).toString();
                UrlModel urlModel = new UrlModel();
                urlModel.setUrlList(Collections.singletonList(string));
                return urlModel;
            }
        }
        GreetingCardResource greetingCardResource = this.LLILLL.get(str);
        if (greetingCardResource == null) {
            return null;
        }
        if (z) {
            UrlModel urlModel2 = new UrlModel();
            urlModel2.setUrlList(Collections.singletonList(greetingCardResource.getOpenedCardMessageListImageUrl()));
            return urlModel2;
        }
        UrlModel urlModel3 = new UrlModel();
        urlModel3.setUrlList(Collections.singletonList(greetingCardResource.getClosedCardMessageListImageUrl()));
        return urlModel3;
    }

    public final void zQ2(C869590Y9l c869590Y9l, boolean z) {
        GreetingCardInfoComponent greetingCardInfoComponentLJI;
        String str;
        String eventTrackingName;
        String str2;
        if (getState().LL != null || (greetingCardInfoComponentLJI = C0ZDX.LJI(c869590Y9l)) == null) {
            return;
        }
        C013C c013c = new C013C();
        boolean zLIZIZ = C461300I7c.LIZIZ(c869590Y9l, greetingCardInfoComponentLJI.status);
        c013c.element = zLIZIZ;
        if (!zLIZIZ && !C0ZDX.LJJJJIZL(c869590Y9l)) {
            C461300I7c.LIZJ(c869590Y9l);
            C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C1503305uZ(c869590Y9l, null), 2);
        }
        AQ2(greetingCardInfoComponentLJI.festiveId);
        setState(new AwS223S0300000_14(greetingCardInfoComponentLJI, c013c, c869590Y9l, 12));
        SessionInfo sessionInfo = (SessionInfo) this.LLILLJJLI.getValue();
        if (sessionInfo != null) {
            if (z) {
                str = "click_open_btn";
            } else {
                str = "click_msg";
            }
            GreetingCardResource greetingCardResource = this.LLILLL.get(greetingCardInfoComponentLJI.festiveId);
            if (greetingCardResource == null || (eventTrackingName = greetingCardResource.getEventTrackingName()) == null) {
                eventTrackingName = "";
            }
            C0I0B.LJFF.LIZIZ();
            Pair[] pairArr = new Pair[7];
            pairArr[0] = new Pair("enter_from", sessionInfo.getEnterFromForMob());
            pairArr[1] = new Pair("enter_method", str);
            if (sessionInfo.getChatType() == 3) {
                str2 = "group";
            } else {
                str2 = "private";
            }
            pairArr[2] = new Pair("chat_type", str2);
            pairArr[3] = new Pair("conversation_id", sessionInfo.getConversationId());
            pairArr[4] = new Pair("message_id", String.valueOf(c869590Y9l.getMsgId()));
            pairArr[5] = new Pair("from_user_id", String.valueOf(c869590Y9l.getSender()));
            pairArr[6] = new Pair("greeting_card_name", eventTrackingName);
            C20684815ws.LJIILLIIL("ttsocial_greeting_card_msg_click", C2097608Jq.LJIIIIZZ(pairArr));
        }
    }

    public final Object vQ2(String str, String str2, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        GreetingCardResource greetingCardResource;
        String geckoChannelName;
        IDMGreetingCardGeckoChannelManager iDMGreetingCardGeckoChannelManager = (IDMGreetingCardGeckoChannelManager) PluggableExtentionKt.pluggableSpiForReal(IDMGreetingCardGeckoChannelManager.class);
        if (iDMGreetingCardGeckoChannelManager == null || (greetingCardResource = this.LLILLL.get(str)) == null || (geckoChannelName = greetingCardResource.getGeckoChannelName()) == null) {
            return null;
        }
        return iDMGreetingCardGeckoChannelManager.LIZIZ(geckoChannelName, str, str2, interfaceC1364105Vn);
    }
}
