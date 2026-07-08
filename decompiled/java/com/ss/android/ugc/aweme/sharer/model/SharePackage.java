package com.ss.android.ugc.aweme.sharer.model;

import X.AbstractC1375550ltp;
import X.AbstractC1387200mCc;
import X.C1361760lXa;
import X.C1364460lbw;
import X.C1370940lmO;
import X.C1370950lmP;
import X.C1388190mED;
import X.C1402020maW;
import X.C1906580ziK;
import android.app.Activity;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.im.message.template.service.SendMessageTemplateDynamicTask;
import com.ss.android.ugc.aweme.im.message.template.service.SendMessageTemplateTask;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS600S0100000_21;

/* JADX INFO: loaded from: classes22.dex */
public class SharePackage extends BaseSharePackage {
    public final C1370940lmO builder;
    public final SendMessageTemplateDynamicTask sendMessageTemplateDynamicTask;
    public final SendMessageTemplateTask sendMessageTemplateTask;
    public static final C1370950lmP Companion = new C1370950lmP();
    public static final Parcelable.Creator<SharePackage> CREATOR = new C1402020maW(7);

    public SharePackage(C1370940lmO c1370940lmO) {
        super(c1370940lmO);
        this.builder = c1370940lmO;
        this.sendMessageTemplateTask = c1370940lmO.LJIIIIZZ;
        this.sendMessageTemplateDynamicTask = c1370940lmO.LJIIIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1361760lXa.LIZ = linkedHashMap;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        linkedHashMap.put("click_to_show_duration", new C1364460lbw(jElapsedRealtime, 2));
        linkedHashMap.put("click_to_expose_duration", new C1364460lbw(jElapsedRealtime, 2));
        linkedHashMap.put("click_to_respond_duration", new C1364460lbw(jElapsedRealtime, 2));
        linkedHashMap.put("click_to_platform_click_duration", new C1364460lbw(jElapsedRealtime, 2));
        linkedHashMap.put("click_to_im_show_duration", new C1364460lbw(jElapsedRealtime, 2));
    }

    public static boolean LJIL(String str) {
        Companion.getClass();
        if (str.length() > 0) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.share.base.model.BaseSharePackage, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.sendMessageTemplateTask, i);
        parcel.writeParcelable(this.sendMessageTemplateDynamicTask, i);
    }

    public static void LJIJJLI(SharePackage sharePackage, SharePackage sharePackage2, AbstractC1375550ltp abstractC1375550ltp, Function2 function2) {
        Activity activityLIZ;
        Activity activityLIZIZ;
        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
        if (abstractC1387200mCcLIZIZ != null && (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) != null) {
            activityLIZ = C1388190mED.LIZ(activityLIZIZ);
        } else {
            activityLIZ = null;
        }
        sharePackage.getClass();
        C1370950lmP c1370950lmP = Companion;
        AwS600S0100000_21 awS600S0100000_21 = new AwS600S0100000_21(sharePackage2, 286);
        c1370950lmP.getClass();
        C1370950lmP.LIZIZ(sharePackage2, abstractC1375550ltp, activityLIZ, awS600S0100000_21, function2);
    }
}
