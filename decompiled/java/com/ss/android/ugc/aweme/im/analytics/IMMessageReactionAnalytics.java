package com.ss.android.ugc.aweme.im.analytics;

import X.AnonymousClass0629;
import X.C01GW;
import X.C23250099c;
import X.C452501pT;
import X.C817503Hh;
import X.C830490Whz;
import X.C869590Y9l;
import X.C893490Z3j;
import X.EnumC879260YeS;
import X.EnumC879370Yed;
import X.InterfaceC1493105sv;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.ai.api.IMAIServiceAPI;
import com.ss.android.ugc.aweme.im.messagelist.api.IIMMessageReactionAnalytics;
import com.ss.android.ugc.aweme.im.service.analytics.IIMMessageAnalytics;
import com.ss.android.ugc.aweme.im.service.analytics.IMessageAnalyticsUtils;
import java.util.Map;
import kotlin.jvm.internal.AFwS201S0000000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class IMMessageReactionAnalytics implements IIMMessageReactionAnalytics {
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(89));

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.IIMMessageReactionAnalytics
    public final void LIZ(C869590Y9l c869590Y9l, InterfaceC1493105sv interfaceC1493105sv) {
        String strLJIIIIZZ;
        String strLJ;
        C830490Whz c830490Whz = new C830490Whz();
        IIMMessageAnalytics iIMMessageAnalytics = (IIMMessageAnalytics) PluggableExtentionKt.pluggableSpiForReal(IIMMessageAnalytics.class);
        if (iIMMessageAnalytics == null || (strLJIIIIZZ = iIMMessageAnalytics.LJIIIIZZ(c869590Y9l)) == null) {
            strLJIIIIZZ = "";
        }
        c830490Whz.put("chat_type", strLJIIIIZZ);
        IMessageAnalyticsUtils iMessageAnalyticsUtils = (IMessageAnalyticsUtils) this.LIZIZ.getValue();
        if (iMessageAnalyticsUtils != null && (strLJ = iMessageAnalyticsUtils.LJ(c869590Y9l)) != null) {
            c830490Whz.put("message_type", strLJ);
        }
        c830490Whz.put("enter_method", "bubble_reaction");
        c830490Whz.put("enter_from", "chat");
        interfaceC1493105sv.sendEvent("reaction_panel_show", c830490Whz);
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.IIMMessageReactionAnalytics
    public final void LIZIZ(InterfaceC1493105sv interfaceC1493105sv, Integer num, String str) {
        String string;
        C830490Whz c830490Whz = new C830490Whz();
        if (num == null || (string = num.toString()) == null) {
            string = "-1";
        }
        c830490Whz.put("index", string);
        if (str == null) {
            str = "";
        }
        c830490Whz.put("emoji_name", str);
        c830490Whz.put("like_method", "chat_panel_emoji");
        interfaceC1493105sv.sendEvent("chat_emoji_feedback_send", c830490Whz);
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.IIMMessageReactionAnalytics
    public final void LIZJ(C869590Y9l c869590Y9l, Map<String, String> map, InterfaceC1493105sv interfaceC1493105sv) {
        C23250099c.LIZLLL(C817503Hh.LL, null, null, new C893490Z3j(c869590Y9l, map, interfaceC1493105sv, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.IIMMessageReactionAnalytics
    public final void LIZLLL(C869590Y9l c869590Y9l, EnumC879370Yed enumC879370Yed, EnumC879260YeS enumC879260YeS, InterfaceC1493105sv interfaceC1493105sv) {
        String strLJIIIIZZ;
        String str;
        String strLJ;
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("button_name", enumC879370Yed.getMobStr());
        c830490Whz.put("enter_method", "bubble_reaction");
        c830490Whz.put("enter_from", "chat");
        IMessageAnalyticsUtils iMessageAnalyticsUtils = (IMessageAnalyticsUtils) this.LIZIZ.getValue();
        if (iMessageAnalyticsUtils != null && (strLJ = iMessageAnalyticsUtils.LJ(c869590Y9l)) != null) {
            c830490Whz.put("message_type", strLJ);
        }
        IIMMessageAnalytics iIMMessageAnalytics = (IIMMessageAnalytics) PluggableExtentionKt.pluggableSpiForReal(IIMMessageAnalytics.class);
        if (iIMMessageAnalytics == null || (strLJIIIIZZ = iIMMessageAnalytics.LJIIIIZZ(c869590Y9l)) == null) {
            strLJIIIIZZ = "";
        }
        c830490Whz.put("chat_type", strLJIIIIZZ);
        if (enumC879260YeS != null && enumC879260YeS.isBot()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c830490Whz.put("is_ai_react", str);
        IMAIServiceAPI.LIZ.getClass();
        c830490Whz.putAll(AnonymousClass0629.LIZ().LIZ().LJJIJIL(c869590Y9l));
        interfaceC1493105sv.sendEvent("ttsocial_reaction_panel_click", c830490Whz);
    }
}
