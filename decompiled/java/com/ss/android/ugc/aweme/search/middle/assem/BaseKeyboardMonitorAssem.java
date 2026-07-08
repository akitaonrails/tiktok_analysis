package com.ss.android.ugc.aweme.search.middle.assem;

import X.AbstractC738140SxQ;
import X.AnonymousClass0956;
import X.C0QH8;
import X.C13LE;
import X.C1608210rx5;
import X.C20684815ws;
import X.C2217381BqS;
import X.C2344009Gk;
import X.C649290PdP;
import X.C679280Qkg;
import X.EnumC669960QPq;
import X.InterfaceC1294060jmO;
import X.InterfaceC2217461Bqa;
import X.InterfaceC669970QPr;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@InterfaceC1294060jmO
public abstract class BaseKeyboardMonitorAssem extends AbstractC738140SxQ {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZ;
    public static final String LLILZIL;
    public final C1608210rx5 LL = new C1608210rx5(this, C13LE.LJII(C0QH8.class));
    public volatile AnonymousClass0956 LLILLJJLI;
    public volatile InterfaceC669970QPr LLILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BaseKeyboardMonitorAssem.class, "singleSparkViewAbility", "getSingleSparkViewAbility()Lcom/ss/android/ugc/aweme/search/middle/communicate/SingleSparkViewAbility;", 0);
        C13LE.LIZ.getClass();
        LLILZ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLILZIL = "searchTransferKeyboardChange";
    }

    public final InterfaceC669970QPr bo() {
        InterfaceC669970QPr interfaceC669970QPr = this.LLILLL;
        if (interfaceC669970QPr == null) {
            synchronized (this) {
                interfaceC669970QPr = this.LLILLL;
                if (interfaceC669970QPr == null) {
                    InterfaceC669970QPr interfaceC669970QPrTn = ((C0QH8) this.LL.getValue()).Tn();
                    this.LLILLL = interfaceC669970QPrTn;
                    return interfaceC669970QPrTn;
                }
            }
        }
        return interfaceC669970QPr;
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public static void m309do(EnumC669960QPq enumC669960QPq) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(enumC669960QPq.getId(), Scene.SCENE_SERVICE);
        C20684815ws.LJIILLIIL("search_keyboard_edge_mob", c2344009Gk.LIZ);
    }

    public static void fo(boolean z, Integer num, C649290PdP c649290PdP) throws JSONException {
        String str;
        int iLIZIZ;
        JSONObject jSONObject = new JSONObject();
        if (z) {
            str = "on";
        } else {
            str = "off";
        }
        jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str);
        if (num != null) {
            iLIZIZ = C679280Qkg.LIZIZ(num);
        } else {
            iLIZIZ = 0;
        }
        jSONObject.put("height", iLIZIZ);
        c649290PdP.sendEvent(LLILZIL, jSONObject);
    }
}
