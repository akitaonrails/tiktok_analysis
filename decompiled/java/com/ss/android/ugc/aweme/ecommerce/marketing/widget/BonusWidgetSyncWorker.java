package com.ss.android.ugc.aweme.ecommerce.marketing.widget;

import X.C13BV;
import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.ecommerce.marketing.widget.api.BonusWidgetDataResponse;

/* JADX INFO: loaded from: classes28.dex */
public final class BonusWidgetSyncWorker extends CoroutineWorker {
    public static final Gson LLJ = new Gson();

    public static void LJIIIIZZ(BonusWidgetDataResponse bonusWidgetDataResponse) {
        int iIntValue;
        Keva repo = Keva.getRepo("keva_repo_bonus_widget");
        String str = bonusWidgetDataResponse.mainTitle;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        repo.storeString("main_title", str);
        String str3 = bonusWidgetDataResponse.subTitle;
        if (str3 == null) {
            str3 = "";
        }
        repo.storeString("sub_title", str3);
        String str4 = bonusWidgetDataResponse.balanceAmount;
        if (str4 == null) {
            str4 = "";
        }
        repo.storeString("balance_amount", str4);
        String str5 = bonusWidgetDataResponse.bonusCenterSchema;
        if (str5 != null) {
            str2 = str5;
        }
        repo.storeString("bonus_center_schema", str2);
        Integer num = bonusWidgetDataResponse.refreshIntervalSeconds;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        repo.storeInt("refresh_interval_seconds", iIntValue);
        Gson gson = LLJ;
        Object obj = bonusWidgetDataResponse.bubbleInfo;
        if (obj == null) {
            obj = C13BV.INSTANCE;
        }
        repo.storeString("bubble_info", GsonProtectorUtils.toJson(gson, obj));
        Object obj2 = bonusWidgetDataResponse.actionNotice;
        if (obj2 == null) {
            obj2 = C13BV.INSTANCE;
        }
        repo.storeString("action_notice", GsonProtectorUtils.toJson(gson, obj2));
        Object obj3 = bonusWidgetDataResponse.logisticInfo;
        if (obj3 == null) {
            obj3 = C13BV.INSTANCE;
        }
        repo.storeString("logistic_info", GsonProtectorUtils.toJson(gson, obj3));
        repo.storeLong("last_update_time", System.currentTimeMillis());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x021e A[Catch: all -> 0x0274, IOException -> 0x0283, TryCatch #5 {IOException -> 0x0283, all -> 0x0274, blocks: (B:100:0x01e9, B:101:0x01ec, B:103:0x021e, B:111:0x023b, B:112:0x023f, B:95:0x01cb, B:96:0x01ce, B:54:0x0128, B:55:0x012b, B:58:0x013b, B:60:0x0153, B:61:0x015c, B:63:0x0162, B:65:0x016c, B:73:0x017c, B:75:0x0182, B:77:0x0186, B:78:0x018f, B:80:0x0195, B:82:0x019f, B:90:0x01af, B:92:0x01b5, B:91:0x01b3, B:74:0x0180, B:114:0x024a, B:51:0x0111), top: B:122:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01e5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01e6  */
    /* JADX WARN: Type inference failed for: r13v1, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r13v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v8, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.util.List] */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJII(X.InterfaceC1364105Vn<? super X.AbstractC795160VHe> r20) {
        /*
            Method dump skipped, instruction units count: 653
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.marketing.widget.BonusWidgetSyncWorker.LJII(X.05Vn):java.lang.Object");
    }

    public BonusWidgetSyncWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }
}
