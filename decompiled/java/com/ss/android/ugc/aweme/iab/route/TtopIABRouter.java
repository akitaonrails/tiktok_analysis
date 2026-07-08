package com.ss.android.ugc.aweme.iab.route;

import X.C2095008Iq;
import X.EnumC2434109gJ;
import X.EnumC2434209gK;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.router.route.IRouteAction;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.api.ITtopIABService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class TtopIABRouter implements IRouteAction {
    @Override // com.bytedance.router.route.IRouteAction
    public final Object open(Context context, String str, Bundle bundle) {
        Integer numLJIIJJI;
        Integer numLJIIJJI2;
        EnumC2434209gK enumC2434209gK;
        EnumC2434109gJ next;
        if (context == null) {
            return Boolean.FALSE;
        }
        if (bundle == null) {
            return Boolean.FALSE;
        }
        String string = bundle.getString("url");
        if (string == null) {
            return Boolean.FALSE;
        }
        String string2 = bundle.getString(Scene.SCENE_SERVICE);
        if (string2 != null && (numLJIIJJI = C2095008Iq.LJIIJJI(string2)) != null) {
            int iIntValue = numLJIIJJI.intValue();
            String string3 = bundle.getString("businessScene");
            if (string3 != null && (numLJIIJJI2 = C2095008Iq.LJIIJJI(string3)) != null) {
                int iIntValue2 = numLJIIJJI2.intValue();
                Iterator<EnumC2434109gJ> it2 = EnumC2434109gJ.getEntries().iterator();
                while (true) {
                    enumC2434209gK = null;
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (next.getType() == iIntValue) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                EnumC2434109gJ enumC2434109gJ = next;
                if (enumC2434109gJ == null) {
                    return Boolean.FALSE;
                }
                Iterator<EnumC2434209gK> it3 = EnumC2434209gK.getEntries().iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    EnumC2434209gK next2 = it3.next();
                    if (next2.getType() == iIntValue2) {
                        enumC2434209gK = next2;
                        break;
                    }
                }
                EnumC2434209gK enumC2434209gK2 = enumC2434209gK;
                if (enumC2434209gK2 == null) {
                    return Boolean.FALSE;
                }
                ITtopIABService iTtopIABService = (ITtopIABService) PluggableExtentionKt.pluggableSpi$default(ITtopIABService.class, false, false, false, 14, null);
                if (iTtopIABService != null) {
                    iTtopIABService.LIZ(context, string, enumC2434109gJ, enumC2434209gK2, true, null, null, null);
                }
                return Boolean.TRUE;
            }
            return Boolean.FALSE;
        }
        return Boolean.FALSE;
    }
}
