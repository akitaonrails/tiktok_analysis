package com.bytedance.pumbaa.hybrid.governance.router;

import X.C098200Yq;
import X.C0VZT;
import X.C0WM1;
import X.C0WMC;
import X.C0WN7;
import X.C0WNH;
import X.C1110204Vw;
import X.C189200o6;
import X.C2188811AlT;
import X.C800360VaU;
import X.C821850WLv;
import X.C822330WNr;
import X.C828420Wee;
import X.EnumC822170WNb;
import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.bytedance.hybrid.spark.security.api.protocols.SparkSecurityWebRouterService;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import kotlin.text.u;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes14.dex */
public final class ThirdWebRouterServiceImpl implements SparkSecurityWebRouterService {
    public final C0WMC<C0WNH> LIZ;

    @Override // com.bytedance.hybrid.spark.security.api.protocols.SparkSecurityWebRouterService
    public C821850WLv handleDidWebRouterWithEvent(C828420Wee c828420Wee) {
        return null;
    }

    @Override // com.bytedance.hybrid.spark.security.api.protocols.SparkSecurityService
    public boolean interceptable() {
        return true;
    }

    public ThirdWebRouterServiceImpl(C0WMC<C0WNH> c0wmc) {
        this.LIZ = c0wmc;
    }

    @Override // com.bytedance.hybrid.spark.security.api.protocols.SparkSecurityWebRouterService
    public C821850WLv handleWillWebRouterWithEvent(C828420Wee c828420Wee) {
        int iOrdinal;
        C0WM1 c0wm1LIZ;
        Object c098200Yq;
        String str;
        int iIntValue;
        String str2;
        int iIntValue2;
        Context context;
        WeakReference weakReference;
        C822330WNr c822330WNr = new C822330WNr();
        try {
            c822330WNr.LIZIZ = c828420Wee;
            str = (String) c828420Wee.LJFF.get("URL");
            iIntValue = ((Integer) c828420Wee.LJFF.get("web_runtime")).intValue();
            str2 = (String) c828420Wee.LJFF.get("runtime_name");
            iIntValue2 = ((Integer) c828420Wee.LJFF.get("dataflowId")).intValue();
            Object obj = c828420Wee.LJFF.get("context");
            if (!(obj instanceof WeakReference) || (weakReference = (WeakReference) obj) == null || (context = (Context) weakReference.get()) == null) {
                context = C0VZT.LIZ;
            }
        } catch (Throwable th) {
            th = th;
            iOrdinal = 0;
        }
        if (str.length() != 0) {
            Uri uri = UriProtector.parse(str);
            iOrdinal = EnumC822170WNb.CCT.ordinal();
            try {
                if (iIntValue == iOrdinal) {
                    C800360VaU.LIZ(iIntValue2);
                    c822330WNr.LIZ = new C0WN7(c828420Wee, str, uri, str, uri, iIntValue, iIntValue2, context, !C1110204Vw.LIZ().LIZLLL(uri));
                    iOrdinal = 0;
                } else if (iIntValue == EnumC822170WNb.Spark.ordinal()) {
                    String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "url");
                    if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
                        strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = str;
                    }
                    if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter.length() != 0 && u.LJJIIJZLJL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, "http", false)) {
                        iOrdinal = 0;
                        c822330WNr.LIZ = new C0WN7(c828420Wee, str, uri, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, UriProtector.parse(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter), iIntValue, iIntValue2, context, !C1110204Vw.LIZ().LIZLLL(r10), (String) c828420Wee.LJFF.get("container_id"), ((Integer) c828420Wee.LJFF.get("web_ui_type")).intValue(), str2);
                    }
                } else {
                    iOrdinal = 0;
                    if (iIntValue == EnumC822170WNb.SparkThird.ordinal()) {
                        c822330WNr.LIZ = new C0WN7(c828420Wee, str, uri, str, uri, iIntValue, iIntValue2, context, !C1110204Vw.LIZ().LIZLLL(uri));
                    }
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("WebRouter event: ");
                sbLIZ.append(c822330WNr.LIZ);
                c098200Yq = Integer.valueOf(Log.d("WebRouterService", C2188811AlT.LIZIZ(sbLIZ)));
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th2) {
                th = th2;
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("WebRouterOperandHolder: ");
                StackTraceElement[] stackTrace = thM5exceptionOrNullimpl.getStackTrace();
                StringBuilder sb = new StringBuilder();
                for (StackTraceElement stackTraceElement : stackTrace) {
                    iOrdinal++;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("\tat ");
                    sbLIZ3.append(stackTraceElement.getClassName());
                    sb.append(C2188811AlT.LIZIZ(sbLIZ3));
                    sb.append(e3.d);
                    sb.append(stackTraceElement.getMethodName());
                    sb.append(e3.h);
                    sb.append(stackTraceElement.getFileName());
                    sb.append(":");
                    sb.append(stackTraceElement.getLineNumber());
                    sb.append(")\n");
                    if (iOrdinal > 30) {
                        break;
                    }
                }
                sbLIZ2.append(sb.toString());
                C2188811AlT.LIZIZ(sbLIZ2);
            }
        }
        C0WMC<C0WNH> c0wmc = this.LIZ;
        if (c0wmc == null || (c0wm1LIZ = c0wmc.LIZ(c822330WNr)) == null) {
            return null;
        }
        return c0wm1LIZ.LIZLLL;
    }
}
