package com.ss.android.ugc.aweme.compliance.protection.timelock;

import X.C01GW;
import X.C14EU;
import X.C15XM;
import X.C20335014hY;
import X.C204683157h;
import X.C452501pT;
import X.C484220Iyq;
import X.EnumC1745000vVi;
import X.EnumC1879480z0c;
import X.InterfaceC204685157j;
import X.InterfaceC20537915Yb;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.tiktok.pns.screen.interfaces.PnSDigitalWellbeingSDKService;
import java.util.Iterator;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes32.dex */
public final class RevampPasscodeUtil {
    public static final RevampPasscodeUtil LIZ;
    public static boolean LIZIZ;
    public static boolean LIZJ;
    public static final C01GW LIZLLL;

    static {
        RevampPasscodeUtil revampPasscodeUtil = new RevampPasscodeUtil();
        LIZ = revampPasscodeUtil;
        LIZLLL = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(120));
        EventBus.LIZLLL().LJIJJ(revampPasscodeUtil);
    }

    public static InterfaceC20537915Yb LIZ() {
        return (InterfaceC20537915Yb) LIZLLL.getValue();
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onJsBroadCastEvent(C484220Iyq c484220Iyq) {
        JSONObject jSONObject;
        JSONObject jSONObjectOptJSONObject;
        Integer numValueOf;
        JSONObject jSONObject2 = c484220Iyq.LIZ;
        String strOptString = null;
        if (jSONObject2 != null) {
            strOptString = jSONObject2.optString("eventName");
        }
        if ((Intrinsics.LJFF("check_passcode_success", strOptString) || Intrinsics.LJFF("reset_passcode_success", strOptString)) && (jSONObject = c484220Iyq.LIZ) != null && (jSONObjectOptJSONObject = jSONObject.optJSONObject("data")) != null && (numValueOf = Integer.valueOf(jSONObjectOptJSONObject.optInt("biz_scene"))) != null) {
            if (2 != numValueOf.intValue() && 1 != numValueOf.intValue()) {
                if (3 == numValueOf.intValue()) {
                    LIZIZ = false;
                    if (LIZ().LJIILL()) {
                        LIZ().LJIL();
                    }
                    ((PnSDigitalWellbeingSDKService) ServiceManager.get().getService(PnSDigitalWellbeingSDKService.class)).LJIIJJI(EnumC1879480z0c.DAILY_SCREEN_TIME, EnumC1745000vVi.OK, null, null);
                    return;
                }
                return;
            }
            C204683157h<Boolean> c204683157hLIZ = C15XM.LIZ();
            if (c204683157hLIZ == null) {
                return;
            }
            Boolean bool = Boolean.TRUE;
            Iterator<InterfaceC204685157j<Boolean>> it2 = c204683157hLIZ.LIZ.iterator();
            while (it2.hasNext()) {
                it2.next().onSuccess(bool);
            }
            c204683157hLIZ.LIZ.clear();
            C20335014hY c20335014hYLIZ = C20335014hY.LIZ();
            synchronized (c20335014hYLIZ) {
                c20335014hYLIZ.LIZ.values().remove(c204683157hLIZ);
            }
        }
    }
}
