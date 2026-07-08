package com.ss.android.ugc.aweme.influencer.ecommercelive.common.service;

import X.C034G;
import X.C1051660dTQ;
import X.C1440005kM;
import X.C2097608Jq;
import X.C2203531BLz;
import X.InterfaceC1051730dTX;
import X.InterfaceC1051760dTa;
import android.content.Context;
import com.bytedance.ies.web.jsbridge.IESJsBridge;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.bridgemethods.CopyTextToPasteBoardMethod;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.bridgemethods.CopyTextToPasteBoardMethodCrossPlatform;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.bridgemethods.OpenSchemaSingleTaskMethod;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.bridgemethods.OpenSchemaSingleTaskMethodCrossPlatform;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.bridgemethods.OpenWhatsAppChatMethod;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.bridgemethods.OpenWhatsAppChatMethodCrossPlatform;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.bridgemethods.SendEmailMethod;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.bridgemethods.SendEmailMethodCrossPlatform;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class ECommerceLiveBridgeMethodServiceImpl implements IECommerceLiveBridgeService {
    @Override // com.ss.android.ugc.aweme.influencer.ecommercelive.common.service.IECommerceLiveBridgeService
    public final Map<String, Class<?>> LIZJ() {
        return C2097608Jq.LJIIIIZZ(new Pair("openSingletonSchema", OpenSchemaSingleTaskMethod.class), new Pair("routeToWhatsapp", OpenWhatsAppChatMethod.class), new Pair("copyTextToPasteBoard", CopyTextToPasteBoardMethod.class), new Pair("sendEMailTo", SendEmailMethod.class));
    }

    @Override // com.ss.android.ugc.aweme.influencer.ecommercelive.common.service.IECommerceLiveBridgeService
    public final Map<String, InterfaceC1051760dTa> LIZ(C2203531BLz c2203531BLz, WeakReference<Context> weakReference) {
        IESJsBridge iESJsBridge = c2203531BLz.LIZJ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        OpenSchemaSingleTaskMethodCrossPlatform openSchemaSingleTaskMethodCrossPlatform = new OpenSchemaSingleTaskMethodCrossPlatform(iESJsBridge);
        openSchemaSingleTaskMethodCrossPlatform.attach(weakReference);
        linkedHashMap.put("openSingletonSchema", openSchemaSingleTaskMethodCrossPlatform);
        OpenWhatsAppChatMethodCrossPlatform openWhatsAppChatMethodCrossPlatform = new OpenWhatsAppChatMethodCrossPlatform(iESJsBridge);
        openWhatsAppChatMethodCrossPlatform.attach(weakReference);
        linkedHashMap.put("routeToWhatsapp", openWhatsAppChatMethodCrossPlatform);
        CopyTextToPasteBoardMethodCrossPlatform copyTextToPasteBoardMethodCrossPlatform = new CopyTextToPasteBoardMethodCrossPlatform(iESJsBridge);
        copyTextToPasteBoardMethodCrossPlatform.attach(weakReference);
        linkedHashMap.put("copyTextToPasteBoard", copyTextToPasteBoardMethodCrossPlatform);
        SendEmailMethodCrossPlatform sendEmailMethodCrossPlatform = new SendEmailMethodCrossPlatform(iESJsBridge);
        sendEmailMethodCrossPlatform.attach(weakReference);
        linkedHashMap.put("sendEMailTo", sendEmailMethodCrossPlatform);
        return linkedHashMap;
    }

    @Override // com.ss.android.ugc.aweme.influencer.ecommercelive.common.service.IECommerceLiveBridgeService
    public final void LIZIZ(String str, JSONObject jSONObject) {
        C1440005kM.LIZ(new C034G(str, jSONObject));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.ss.android.ugc.aweme.influencer.ecommercelive.common.service.IECommerceLiveBridgeService
    public final InterfaceC1051730dTX LIZLLL(C1051660dTQ c1051660dTQ, String str) {
        switch (str.hashCode()) {
            case 9705954:
                if (!str.equals("openSingletonSchema")) {
                    return null;
                }
                return new OpenSchemaSingleTaskMethod(c1051660dTQ);
            case 409811030:
                if (!str.equals("routeToWhatsapp")) {
                    return null;
                }
                return new OpenWhatsAppChatMethod(c1051660dTQ);
            case 945092688:
                if (!str.equals("copyTextToPasteBoard")) {
                    return null;
                }
                return new CopyTextToPasteBoardMethod(c1051660dTQ);
            case 1477348015:
                if (!str.equals("sendEMailTo")) {
                    return null;
                }
                return new SendEmailMethod(c1051660dTQ);
            default:
                return null;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.ss.android.ugc.aweme.influencer.ecommercelive.common.service.IECommerceLiveBridgeService
    public final InterfaceC1051760dTa LJ(C2203531BLz c2203531BLz, WeakReference<Context> weakReference, String str) {
        IESJsBridge iESJsBridge = c2203531BLz.LIZJ;
        switch (str.hashCode()) {
            case 9705954:
                if (!str.equals("openSingletonSchema")) {
                    return null;
                }
                OpenSchemaSingleTaskMethodCrossPlatform openSchemaSingleTaskMethodCrossPlatform = new OpenSchemaSingleTaskMethodCrossPlatform(iESJsBridge);
                openSchemaSingleTaskMethodCrossPlatform.attach(weakReference);
                return openSchemaSingleTaskMethodCrossPlatform;
            case 409811030:
                if (!str.equals("routeToWhatsapp")) {
                    return null;
                }
                OpenWhatsAppChatMethodCrossPlatform openWhatsAppChatMethodCrossPlatform = new OpenWhatsAppChatMethodCrossPlatform(iESJsBridge);
                openWhatsAppChatMethodCrossPlatform.attach(weakReference);
                return openWhatsAppChatMethodCrossPlatform;
            case 945092688:
                if (!str.equals("copyTextToPasteBoard")) {
                    return null;
                }
                CopyTextToPasteBoardMethodCrossPlatform copyTextToPasteBoardMethodCrossPlatform = new CopyTextToPasteBoardMethodCrossPlatform(iESJsBridge);
                copyTextToPasteBoardMethodCrossPlatform.attach(weakReference);
                return copyTextToPasteBoardMethodCrossPlatform;
            case 1477348015:
                if (!str.equals("sendEMailTo")) {
                    return null;
                }
                SendEmailMethodCrossPlatform sendEmailMethodCrossPlatform = new SendEmailMethodCrossPlatform(iESJsBridge);
                sendEmailMethodCrossPlatform.attach(weakReference);
                return sendEmailMethodCrossPlatform;
            default:
                return null;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.ss.android.ugc.aweme.influencer.ecommercelive.common.service.IECommerceLiveBridgeService
    public final InterfaceC1051760dTa LJFF(String str, WeakReference weakReference, IESJsBridge iESJsBridge) {
        switch (str.hashCode()) {
            case 9705954:
                if (!str.equals("openSingletonSchema")) {
                    return null;
                }
                OpenSchemaSingleTaskMethodCrossPlatform openSchemaSingleTaskMethodCrossPlatform = new OpenSchemaSingleTaskMethodCrossPlatform(iESJsBridge);
                openSchemaSingleTaskMethodCrossPlatform.attach((WeakReference<Context>) weakReference);
                return openSchemaSingleTaskMethodCrossPlatform;
            case 409811030:
                if (!str.equals("routeToWhatsapp")) {
                    return null;
                }
                OpenWhatsAppChatMethodCrossPlatform openWhatsAppChatMethodCrossPlatform = new OpenWhatsAppChatMethodCrossPlatform(iESJsBridge);
                openWhatsAppChatMethodCrossPlatform.attach((WeakReference<Context>) weakReference);
                return openWhatsAppChatMethodCrossPlatform;
            case 945092688:
                if (!str.equals("copyTextToPasteBoard")) {
                    return null;
                }
                CopyTextToPasteBoardMethodCrossPlatform copyTextToPasteBoardMethodCrossPlatform = new CopyTextToPasteBoardMethodCrossPlatform(iESJsBridge);
                copyTextToPasteBoardMethodCrossPlatform.attach((WeakReference<Context>) weakReference);
                return copyTextToPasteBoardMethodCrossPlatform;
            case 1477348015:
                if (!str.equals("sendEMailTo")) {
                    return null;
                }
                SendEmailMethodCrossPlatform sendEmailMethodCrossPlatform = new SendEmailMethodCrossPlatform(iESJsBridge);
                sendEmailMethodCrossPlatform.attach((WeakReference<Context>) weakReference);
                return sendEmailMethodCrossPlatform;
            default:
                return null;
        }
    }
}
