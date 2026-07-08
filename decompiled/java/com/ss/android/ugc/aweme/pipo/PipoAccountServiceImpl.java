package com.ss.android.ugc.aweme.pipo;

import X.C0PEM;
import X.C1227904rF;
import X.C1716030ukz;
import X.C1716670um1;
import X.C1716680um2;
import X.C1776140wJw;
import X.C1AF0;
import X.C1DFH;
import X.C2107308Nj;
import X.C2296808zG;
import X.C23250099c;
import X.C259800zU;
import android.content.Context;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.component.guide.InfoCollectGuideModel;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: loaded from: classes27.dex */
public final class PipoAccountServiceImpl implements IPipoAccountService {
    public final C1776140wJw LIZ = new C1776140wJw(CoroutineExceptionHandler.LJJLIL, 2);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v18, types: [T, java.lang.String] */
    @Override // com.ss.android.ugc.aweme.pipo.IPipoAccountService
    public final void LIZ(Context context, String str, Map<String, String> map) {
        boolean z;
        Uri uri;
        try {
            C1227904rF.LIZ.getClass();
            InfoCollectGuideModel infoCollectGuideModel = (InfoCollectGuideModel) C1227904rF.LIZIZ(str, InfoCollectGuideModel.class);
            C1716670um1.LIZ.getClass();
            C1716670um1.LIZ(infoCollectGuideModel, map);
            String str2 = (String) ((LinkedHashMap) map).get("action_url");
            if (str2 == null) {
                str2 = "";
            }
            C259800zU c259800zU = new C259800zU();
            c259800zU.element = "";
            C259800zU c259800zU2 = new C259800zU();
            c259800zU2.element = "";
            if (str2.length() <= 0) {
                z = false;
            } else {
                z = true;
            }
            if (z && (uri = UriProtector.parse(str2)) != null && uri.isHierarchical()) {
                c259800zU.element = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "enter_from");
                c259800zU2.element = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "session_id");
            }
            C1716030ukz.LIZIZ = (String) c259800zU.element;
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ.plus(this.LIZ)), null, null, new C1716680um2(context, infoCollectGuideModel, c259800zU, c259800zU2, null), 3);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJFF(e, "member_info_collect_in_bnplservice");
            C1716030ukz.LIZ(false);
        }
    }
}
