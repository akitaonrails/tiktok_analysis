package com.ss.android.ugc.aweme.aigc;

import X.C01GW;
import X.C0X9S;
import X.C11NZ;
import X.C1697810uHb;
import X.C20175213ws;
import X.C2215311Bn7;
import X.C452501pT;
import X.EnumC20175313wt;
import X.EnumC2215301Bn6;
import X.InterfaceC1485505rh;
import X.InterfaceC1501100pAK;
import X.InterfaceC1501120pAM;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501200pAU;
import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS219S0000000_30;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes35.dex */
public final class AIGCApi {
    public static final C01GW<Api> LIZ = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(58));

    public interface Api {
        @InterfaceC1501200pAU("/tiktok/v1/aigc_avatar/styles")
        C0X9S<ResponseAIGCStyles> LIZ();

        @InterfaceC1501200pAU("/tiktok/v1/aigc_avatar/avatars")
        C0X9S<ResponseGetAvatars> LIZIZ(@InterfaceC1501120pAM("task_id") String str, @InterfaceC1501120pAM("start_index") int i, @InterfaceC1501120pAM("count") Integer num);

        @InterfaceC1501200pAU("/tiktok/v1/aigc_avatar/quota")
        C0X9S<ResponseAIGCQuotas> LIZJ();

        @InterfaceC1501200pAU("/tiktok/v1/aigc_avatar/tasks")
        C0X9S<ResponseAIGCTaskStatus> LIZLLL(@InterfaceC1501120pAM("task_ids") ArrayList<String> arrayList, @InterfaceC1501120pAM("filter_status") ArrayList<Integer> arrayList2, @InterfaceC1501120pAM("start_index") int i, @InterfaceC1501120pAM("count") Integer num, @InterfaceC1501120pAM("need_detail") int i2);

        @InterfaceC1485505rh
        @InterfaceC1501170pAR("/tiktok/v1/aigc_avatar/tasks/discard")
        C0X9S<ResponseDiscard> discard(@InterfaceC1501100pAK("task_id") String str);

        @InterfaceC1485505rh
        @InterfaceC1501170pAR("/tiktok/v1/aigc_avatar/regenerate")
        C11NZ<ResponseQuickGenerate> generateMore(@InterfaceC1501100pAK("task_id") String str);

        @InterfaceC1485505rh
        @InterfaceC1501170pAR("/tiktok/v1/aigc_avatar/quick_generate")
        C11NZ<ResponseQuickGenerate> quickGenerate(@InterfaceC1501100pAK("image_infos") JSONArray jSONArray);

        @InterfaceC1485505rh
        @InterfaceC1501170pAR("/tiktok/v1/aigc_avatar/slow_generate")
        C0X9S<ResponseSlowGenerate> slowGenerate(@InterfaceC1501100pAK("image_infos") JSONArray jSONArray, @InterfaceC1501100pAK("aigc_styles") JSONArray jSONArray2);
    }

    public static ResponseDiscard LIZ(String str) {
        C20175213ws c20175213ws = C20175213ws.LIZ;
        EnumC2215301Bn6 enumC2215301Bn6 = EnumC2215301Bn6.AIGC_NET_DISCARD;
        C20175213ws.LIZ(c20175213ws, enumC2215301Bn6, EnumC20175313wt.START, null, null, null, null, 60);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        ResponseDiscard responseDiscard = C2215311Bn7.LIZ().discard(str).execute().LIZIZ;
        if (responseDiscard.status_code != 0) {
            C20175213ws.LIZ(c20175213ws, enumC2215301Bn6, EnumC20175313wt.FAIL, Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime), null, String.valueOf(responseDiscard.status_code), responseDiscard.status_msg, 8);
            return responseDiscard;
        }
        C20175213ws.LIZ(c20175213ws, enumC2215301Bn6, EnumC20175313wt.SUCCESS, Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime), null, null, null, 56);
        return responseDiscard;
    }

    public static ResponseGetAvatars LIZIZ(String str) {
        String message;
        ResponseGetAvatars responseGetAvatars;
        String str2;
        Integer numValueOf = null;
        C20175213ws.LIZ(C20175213ws.LIZ, EnumC2215301Bn6.AIGC_NET_GET_AVATAR, EnumC20175313wt.START, null, null, null, null, 60);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        try {
            responseGetAvatars = C2215311Bn7.LIZ().LIZIZ(str, 0, null).execute().LIZIZ;
            message = null;
            if (responseGetAvatars != null && responseGetAvatars.status_code == 0) {
                if (responseGetAvatars.avatarUrls.isEmpty()) {
                    C20175213ws.LIZ(C20175213ws.LIZ, EnumC2215301Bn6.AIGC_NET_GET_AVATAR, EnumC20175313wt.FAIL, Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime), null, String.valueOf(responseGetAvatars.status_code), "Avatars is empty", 8);
                    return responseGetAvatars;
                }
                C20175213ws.LIZ(C20175213ws.LIZ, EnumC2215301Bn6.AIGC_NET_GET_AVATAR, EnumC20175313wt.SUCCESS, Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime), null, null, null, 56);
                return responseGetAvatars;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            message = e.getMessage();
            responseGetAvatars = null;
        }
        C20175213ws c20175213ws = C20175213ws.LIZ;
        EnumC2215301Bn6 enumC2215301Bn6 = EnumC2215301Bn6.AIGC_NET_GET_AVATAR;
        EnumC20175313wt enumC20175313wt = EnumC20175313wt.FAIL;
        Long lValueOf = Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime);
        if (responseGetAvatars != null) {
            numValueOf = Integer.valueOf(responseGetAvatars.status_code);
        }
        String strValueOf = String.valueOf(numValueOf);
        if (responseGetAvatars != null && (str2 = responseGetAvatars.status_msg) != null) {
            message = str2;
        }
        C20175213ws.LIZ(c20175213ws, enumC2215301Bn6, enumC20175313wt, lValueOf, null, strValueOf, message, 8);
        return responseGetAvatars;
    }

    public static ResponseAIGCTaskStatus LIZJ(String str) {
        ResponseAIGCTaskStatus responseAIGCTaskStatus;
        C20175213ws c20175213ws = C20175213ws.LIZ;
        EnumC2215301Bn6 enumC2215301Bn6 = EnumC2215301Bn6.AIGC_NET_GET_TASK;
        C20175213ws.LIZ(c20175213ws, enumC2215301Bn6, EnumC20175313wt.START, null, null, null, null, 60);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (str == null) {
            responseAIGCTaskStatus = C2215311Bn7.LIZ().LIZLLL(null, null, 0, null, 1).execute().LIZIZ;
        } else {
            responseAIGCTaskStatus = C2215311Bn7.LIZ().LIZLLL(C1697810uHb.LJ(str), null, 0, null, 1).execute().LIZIZ;
        }
        if (responseAIGCTaskStatus.status_code != 0) {
            C20175213ws.LIZ(c20175213ws, enumC2215301Bn6, EnumC20175313wt.FAIL, Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime), null, String.valueOf(responseAIGCTaskStatus.status_code), responseAIGCTaskStatus.status_msg, 8);
            return responseAIGCTaskStatus;
        }
        C20175213ws.LIZ(c20175213ws, enumC2215301Bn6, EnumC20175313wt.SUCCESS, Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime), null, null, null, 56);
        return responseAIGCTaskStatus;
    }
}
