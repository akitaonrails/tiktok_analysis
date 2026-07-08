package com.ss.android.ugc.aweme.ecommerce.search.lynx.spark.core.communicate.jsb;

import X.AbstractC1387200mCc;
import X.AbstractC1851970yIF;
import X.C1851920yIA;
import X.C1906580ziK;
import X.C1909107dp;
import X.C19741112Lp;
import X.C737910Sx3;
import X.C786410Ut5;
import X.EnumC1063300dmC;
import X.InterfaceC1851980yIG;
import X.InterfaceC1851990yIH;
import X.InterfaceC2038907yl;
import X.InterfaceC634840OvC;
import android.app.Activity;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Locale;
import java.util.UUID;
import kotlin.text.a0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes28.dex */
public final class EcSearchAsrMethod extends AbstractC1851970yIF implements InterfaceC2038907yl {
    public static final int $stable = 8;

    private final void handleCancel(InterfaceC1851990yIH interfaceC1851990yIH, CompletionBlock<InterfaceC1851980yIG> completionBlock) {
        String asrSessionId = interfaceC1851990yIH.getAsrSessionId();
        String containerID = null;
        if (asrSessionId == null || !(!a0.LJJJIL(asrSessionId))) {
            asrSessionId = null;
        }
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        }
        InterfaceC1851980yIG interfaceC1851980yIG = (InterfaceC1851980yIG) C1909107dp.LIZJ(InterfaceC1851980yIG.class, containerID);
        interfaceC1851980yIG.setAsrSessionId(asrSessionId);
        String str = "";
        if (asrSessionId == null) {
            interfaceC1851980yIG.setCode(0);
            interfaceC1851980yIG.setMsg("asr_session_id required");
            String msg = interfaceC1851980yIG.getMsg();
            if (msg != null) {
                str = msg;
            }
            completionBlock.onFailure(0, str, interfaceC1851980yIG);
            return;
        }
        C1851920yIA.LIZ.getClass();
        if (!C1851920yIA.LJIIIZ(asrSessionId, true)) {
            interfaceC1851980yIG.setCode(-2);
            interfaceC1851980yIG.setMsg("session not found");
        } else {
            interfaceC1851980yIG.setCode(1);
            interfaceC1851980yIG.setMsg("ok");
        }
        completionBlock.onSuccess(interfaceC1851980yIG, "");
    }

    private final void handleCheck(InterfaceC1851990yIH interfaceC1851990yIH, CompletionBlock<InterfaceC1851980yIG> completionBlock) {
        String containerID;
        Activity activityLIZIZ;
        boolean zLIZLLL;
        Activity activityLIZLLL;
        String asrSessionId = interfaceC1851990yIH.getAsrSessionId();
        Activity activityLIZIZ2 = null;
        if (asrSessionId == null || !(!a0.LJJJIL(asrSessionId))) {
            asrSessionId = null;
        }
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        } else {
            containerID = null;
        }
        InterfaceC1851980yIG interfaceC1851980yIG = (InterfaceC1851980yIG) C1909107dp.LIZJ(InterfaceC1851980yIG.class, containerID);
        interfaceC1851980yIG.setAsrSessionId(asrSessionId);
        InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
        if (interfaceC634840OvC2 != null && (activityLIZLLL = interfaceC634840OvC2.LIZLLL()) != null) {
            activityLIZIZ2 = activityLIZLLL;
        } else {
            AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
            if (abstractC1387200mCcLJ != null && (activityLIZIZ = abstractC1387200mCcLJ.LIZIZ()) != null) {
                activityLIZIZ2 = C737910Sx3.LIZIZ(activityLIZIZ);
            }
        }
        C1851920yIA.LIZ.getClass();
        if (activityLIZIZ2 == null) {
            zLIZLLL = false;
        } else {
            C19741112Lp.LIZ.getClass();
            zLIZLLL = C19741112Lp.LIZLLL(activityLIZIZ2, "android.permission.RECORD_AUDIO");
        }
        String str = "";
        if (zLIZLLL) {
            interfaceC1851980yIG.setCode(1);
            completionBlock.onSuccess(interfaceC1851980yIG, "");
            return;
        }
        interfaceC1851980yIG.setCode(-1);
        interfaceC1851980yIG.setMsg("no mic permission");
        String msg = interfaceC1851980yIG.getMsg();
        if (msg != null) {
            str = msg;
        }
        completionBlock.onFailure(0, str, interfaceC1851980yIG);
    }

    private final void handleEnd(InterfaceC1851990yIH interfaceC1851990yIH, CompletionBlock<InterfaceC1851980yIG> completionBlock) {
        String asrSessionId = interfaceC1851990yIH.getAsrSessionId();
        String containerID = null;
        if (asrSessionId == null || !(!a0.LJJJIL(asrSessionId))) {
            asrSessionId = null;
        }
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        }
        InterfaceC1851980yIG interfaceC1851980yIG = (InterfaceC1851980yIG) C1909107dp.LIZJ(InterfaceC1851980yIG.class, containerID);
        interfaceC1851980yIG.setAsrSessionId(asrSessionId);
        String str = "";
        if (asrSessionId == null) {
            interfaceC1851980yIG.setCode(0);
            interfaceC1851980yIG.setMsg("asr_session_id required");
            String msg = interfaceC1851980yIG.getMsg();
            if (msg != null) {
                str = msg;
            }
            completionBlock.onFailure(0, str, interfaceC1851980yIG);
            return;
        }
        C1851920yIA.LIZ.getClass();
        if (!C1851920yIA.LIZIZ(asrSessionId, "manual_stop")) {
            interfaceC1851980yIG.setCode(-2);
            interfaceC1851980yIG.setMsg("session not found");
        } else {
            interfaceC1851980yIG.setCode(1);
            interfaceC1851980yIG.setMsg("ok");
        }
        completionBlock.onSuccess(interfaceC1851980yIG, "");
    }

    private final void handleStart(InterfaceC1851990yIH interfaceC1851990yIH, CompletionBlock<InterfaceC1851980yIG> completionBlock) {
        String containerID;
        Activity activityLIZIZ;
        Activity activityLIZLLL;
        C1851920yIA c1851920yIA = C1851920yIA.LIZ;
        String asrSessionId = interfaceC1851990yIH.getAsrSessionId();
        c1851920yIA.getClass();
        Activity activityLIZIZ2 = null;
        if (asrSessionId == null || !(!a0.LJJJIL(asrSessionId))) {
            asrSessionId = UUID.randomUUID().toString();
        }
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        } else {
            containerID = null;
        }
        InterfaceC1851980yIG interfaceC1851980yIG = (InterfaceC1851980yIG) C1909107dp.LIZJ(InterfaceC1851980yIG.class, containerID);
        interfaceC1851980yIG.setAsrSessionId(asrSessionId);
        InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
        if (interfaceC634840OvC2 != null && (activityLIZLLL = interfaceC634840OvC2.LIZLLL()) != null) {
            activityLIZIZ2 = activityLIZLLL;
        } else {
            AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
            if (abstractC1387200mCcLJ != null && (activityLIZIZ = abstractC1387200mCcLJ.LIZIZ()) != null) {
                activityLIZIZ2 = C737910Sx3.LIZIZ(activityLIZIZ);
            }
        }
        String str = "";
        if (!C1851920yIA.LJIIIIZZ(asrSessionId, activityLIZIZ2, this, interfaceC1851990yIH.getLogExtra())) {
            interfaceC1851980yIG.setCode(-1);
            interfaceC1851980yIG.setMsg("no mic permission");
            String msg = interfaceC1851980yIG.getMsg();
            if (msg != null) {
                str = msg;
            }
            completionBlock.onFailure(0, str, interfaceC1851980yIG);
            return;
        }
        interfaceC1851980yIG.setCode(1);
        interfaceC1851980yIG.setMsg("ok");
        completionBlock.onSuccess(interfaceC1851980yIG, "");
    }

    @Override // X.InterfaceC2038907yl
    public void onVolumeUpdate(String str, JSONArray jSONArray) throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("asr_session_id", str).put("values", jSONArray);
        IEventCenter iEventCenter = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter != null) {
            iEventCenter.LIZ("ec_search_asr_update", C786410Ut5.J3(jSONObjectPut));
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void handle(InterfaceC1851990yIH interfaceC1851990yIH, CompletionBlock<InterfaceC1851980yIG> completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String containerID;
        String lowerCase = interfaceC1851990yIH.getType().toLowerCase(Locale.ROOT);
        switch (lowerCase.hashCode()) {
            case -1367724422:
                if (lowerCase.equals("cancel")) {
                    handleCancel(interfaceC1851990yIH, completionBlock);
                    return;
                }
                break;
            case 100571:
                if (lowerCase.equals("end")) {
                    handleEnd(interfaceC1851990yIH, completionBlock);
                    return;
                }
                break;
            case 94627080:
                if (lowerCase.equals("check")) {
                    handleCheck(interfaceC1851990yIH, completionBlock);
                    return;
                }
                break;
            case 109757538:
                if (lowerCase.equals("start")) {
                    handleStart(interfaceC1851990yIH, completionBlock);
                    return;
                }
                break;
        }
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        } else {
            containerID = null;
        }
        InterfaceC1851980yIG interfaceC1851980yIG = (InterfaceC1851980yIG) C1909107dp.LIZJ(InterfaceC1851980yIG.class, containerID);
        interfaceC1851980yIG.setCode(0);
        interfaceC1851980yIG.setMsg("invalid type");
        String msg = interfaceC1851980yIG.getMsg();
        if (msg == null) {
            msg = "";
        }
        completionBlock.onFailure(0, msg, interfaceC1851980yIG);
    }

    @Override // X.AbstractC1549150qPp
    public /* bridge */ /* synthetic */ void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        handle((InterfaceC1851990yIH) xBaseParamModel, (CompletionBlock<InterfaceC1851980yIG>) completionBlock, enumC1063300dmC);
    }

    @Override // X.InterfaceC2038907yl
    public void onResult(String str, String str2, String str3, Integer num, String str4, long j, boolean z, String str5, String str6) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("asr_session_id", str);
        jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str2);
        jSONObject.put("duration", j);
        jSONObject.put("is_final", z ? 1 : 0);
        if (str5 != null && (!a0.LJJJIL(str5))) {
            jSONObject.put("request_id", str5);
        }
        if (str3 != null) {
            jSONObject.put("text", str3);
        }
        if (num != null) {
            jSONObject.put("error_code", num.intValue());
        }
        if (str4 != null && (!a0.LJJJIL(str4))) {
            jSONObject.put("error_message", str4);
        }
        if (str6 != null && (!a0.LJJJIL(str6))) {
            jSONObject.put("stop_reason", str6);
        }
        IEventCenter iEventCenter = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter != null) {
            iEventCenter.LIZ("ec_search_asr_result", C786410Ut5.J3(jSONObject));
        }
    }
}
