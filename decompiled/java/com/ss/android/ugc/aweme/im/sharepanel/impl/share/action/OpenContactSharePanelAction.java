package com.ss.android.ugc.aweme.im.sharepanel.impl.share.action;

import X.C098200Yq;
import X.C0PEM;
import X.C105700ad;
import X.C1235910iGb;
import X.C1383370m6R;
import X.C1388190mED;
import X.C189200o6;
import X.C19EG;
import X.C1DFH;
import X.C2095008Iq;
import X.C2097608Jq;
import X.C2107308Nj;
import X.C2296808zG;
import X.C23250099c;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.router.route.IRouteAction;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class OpenContactSharePanelAction implements IRouteAction {
    public static final int $stable = 0;

    @Override // com.bytedance.router.route.IRouteAction
    public Object open(Context context, String str, Bundle bundle) throws UnsupportedEncodingException {
        String string;
        Integer numLJIIJJI;
        Object c098200Yq;
        Long lLJIILIIL;
        if (bundle != null && (string = bundle.getString("m_type")) != null && (numLJIIJJI = C2095008Iq.LJIIJJI(string)) != null) {
            int iIntValue = numLJIIJJI.intValue();
            String string2 = bundle.getString("m_scene");
            String str2 = "";
            if (string2 == null) {
                string2 = "";
            }
            String string3 = bundle.getString("m_content");
            if (string3 == null) {
                string3 = "";
            }
            String string4 = bundle.getString("enter_from");
            if (string4 == null) {
                string4 = "";
            }
            String string5 = bundle.getString("enter_method");
            if (string5 == null) {
                string5 = "";
            }
            boolean zLJFF = Intrinsics.LJFF(bundle.getString("m_is_half_screen"), "1");
            boolean zLJFF2 = Intrinsics.LJFF(bundle.getString("m_show_bottom_send_emoji"), "1");
            String string6 = bundle.getString("m_cover");
            if (string6 == null) {
                string6 = "";
            }
            String strDecode = URLDecoder.decode(string6, "UTF-8");
            String string7 = bundle.getString("m_default_text");
            if (string7 == null) {
                string7 = "";
            }
            String string8 = bundle.getString("uid_list");
            if (string8 == null) {
                string8 = "";
            }
            String string9 = bundle.getString("track_extra");
            if (string9 != null) {
                str2 = string9;
            }
            try {
                c098200Yq = (Map) C105700ad.LIZ(str2, Map.class);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            C19EG c19egLIZIZ = null;
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            Map mapLJ = (Map) c098200Yq;
            if (mapLJ == null) {
                mapLJ = C2097608Jq.LJ();
            }
            String string10 = bundle.getString("min_support_version");
            if (string10 != null) {
                lLJIILIIL = C2095008Iq.LJIILIIL(string10);
            } else {
                lLJIILIIL = null;
            }
            boolean zLJFF3 = Intrinsics.LJFF(bundle.getString("m_need_share_finish_notification"), "1");
            boolean zLJFF4 = Intrinsics.LJFF(bundle.getString("from_open_platform"), "1");
            String string11 = bundle.getString("m_unique_id");
            Context contextLJIIL = C1383370m6R.LJIIL();
            if (contextLJIIL != null) {
                c19egLIZIZ = C1388190mED.LIZIZ(contextLJIIL);
            }
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C1235910iGb(iIntValue, string2, string3, string11, c19egLIZIZ, string4, string5, zLJFF, zLJFF2, strDecode, string7, string8, mapLJ, lLJIILIIL, zLJFF3, zLJFF4, null), 3);
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
