package com.ss.android.ugc.aweme.friends.psp;

import X.C0XQ7;
import X.C1072630e1F;
import X.C20339714iJ;
import X.C2188811AlT;
import X.InterfaceC805220ViK;
import X.InterfaceC829930Wh5;
import X.InterfaceC830890Wid;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.profile.model.User;
import com.tiktok.strategycenterengine.manager.TTMStrategyCenterManager;
import com.tiktok.ttm.TTMParamData;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS204S0000000_16;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes32.dex */
public final class ContactUploadPSPServiceImpl implements IContactUploadPSPService {
    @Override // com.ss.android.ugc.aweme.friends.psp.IContactUploadPSPService
    public final boolean LIZIZ() throws JSONException {
        Boolean bool;
        C20339714iJ.LIZ.getClass();
        InterfaceC830890Wid interfaceC830890Wid = C20339714iJ.LIZJ;
        if (interfaceC830890Wid == null) {
            return false;
        }
        JSONObject jSONObject = new JSONObject();
        User curUser = C0XQ7.LJFF().getCurUser();
        jSONObject.put("muf_count", curUser != null ? curUser.getFriendCount() : 0);
        String curUserId = C0XQ7.LJFF().getCurUserId();
        if (curUserId == null) {
            curUserId = "";
        }
        jSONObject.put("user_id", curUserId);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Input Data: muf_count ");
        User curUser2 = C0XQ7.LJFF().getCurUser();
        sbLIZ.append(curUser2 != null ? curUser2.getFriendCount() : 0);
        sbLIZ.append(" | user_id: ");
        String curUserId2 = C0XQ7.LJFF().getCurUserId();
        sbLIZ.append(curUserId2 != null ? curUserId2 : "");
        C2188811AlT.LIZIZ(sbLIZ);
        InterfaceC805220ViK interfaceC805220ViKRunScene = TTMStrategyCenterManager.runScene(interfaceC830890Wid, "two_phased_freq_ctrl", new TTMParamData(jSONObject));
        if (interfaceC805220ViKRunScene == null) {
            return false;
        }
        Object objLIZJ = interfaceC805220ViKRunScene.LIZJ();
        if ((objLIZJ instanceof Boolean) && (bool = (Boolean) objLIZJ) != null && bool.booleanValue()) {
            return C1072630e1F.LIZ.LIZJ();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.friends.psp.IContactUploadPSPService
    public final void init() {
        C20339714iJ.LIZ.getClass();
        if (C20339714iJ.LIZIZ) {
            return;
        }
        C20339714iJ.LIZIZ = true;
        TTMStrategyCenterManager.registerTTMStrategyCenterStateListener(new InterfaceC829930Wh5() { // from class: X.14iI
            @Override // X.InterfaceC829930Wh5
            public final void LIZ(EnumC829940Wh6 enumC829940Wh6) {
                if (enumC829940Wh6 == EnumC829940Wh6.TTMStateInitFinish) {
                    C20339714iJ.LIZ.getClass();
                    C20339714iJ.LIZ();
                } else {
                    if (enumC829940Wh6 != EnumC829940Wh6.TTMStateSceneDataUpdateFinish || C20339714iJ.LIZLLL) {
                        return;
                    }
                    C20339714iJ.LIZ.getClass();
                    C20339714iJ.LIZ();
                }
            }
        });
        if (TTMStrategyCenterManager.isInit()) {
            C20339714iJ.LIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.friends.psp.IContactUploadPSPService
    public final void LIZ(AFwS204S0000000_16 aFwS204S0000000_16) {
        C20339714iJ.LIZ.getClass();
        synchronized (C20339714iJ.LJFF) {
            try {
                if (C20339714iJ.LJI) {
                    aFwS204S0000000_16.invoke();
                } else {
                    ((ArrayList) C20339714iJ.LJII).add(aFwS204S0000000_16);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
