package com.ss.android.ugc.aweme.network;

import X.AbstractC1604130rqV;
import X.C01GW;
import X.C098200Yq;
import X.C0X52;
import X.C0XIR;
import X.C189200o6;
import X.C2188811AlT;
import X.C23112093u;
import X.C452501pT;
import android.net.Uri;
import com.bytedance.frameworks.baselib.netx.partner.NetworkPartner;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.editpost.ClientText;
import com.ss.android.ugc.aweme.editpost.ClientTextWrapper;
import com.ss.android.ugc.aweme.translation.model.DescriptionTranslationResult;
import com.ss.android.ugc.aweme.translation.model.PerfMetric;
import com.ss.android.ugc.aweme.translation.model.RealtimeCaptionsTranslationResult;
import java.io.ByteArrayOutputStream;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class CaptionNetworkPartner implements NetworkPartner.Bystander {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(238));

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.Bystander
    public final void LIZLLL(C0X52<?> c0x52) {
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.Bystander
    public final void LJI(Request request) {
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.Bystander
    public final void LJIIJ(Request request) {
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner
    public final boolean enable() {
        return true;
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.Bystander
    public final void onException(Throwable th) {
    }

    public final void LIZIZ(String str, C0X52<?> c0x52, Throwable th) {
        int errorCode;
        String strValueOf;
        if (c0x52 != null) {
            errorCode = c0x52.LIZ.LIZIZ;
        } else {
            if (th != null) {
                if (th instanceof C0XIR) {
                    errorCode = ((C23112093u) th).getErrorCode();
                } else {
                    errorCode = -1002;
                }
                if (th instanceof C0XIR) {
                    strValueOf = ((C0XIR) th).getErrorMsg();
                } else {
                    strValueOf = String.valueOf(th.getCause());
                }
                AbstractC1604130rqV abstractC1604130rqV = (AbstractC1604130rqV) this.LIZ.getValue();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("CaptionNetworkPartner path: ");
                sbLIZ.append(str);
                sbLIZ.append(", statusCode: ");
                sbLIZ.append(errorCode);
                sbLIZ.append(", statusMsg: ");
                sbLIZ.append(strValueOf);
                abstractC1604130rqV.LJ(C2188811AlT.LIZIZ(sbLIZ));
            }
            errorCode = -1001;
        }
        strValueOf = "unknown";
        AbstractC1604130rqV abstractC1604130rqV2 = (AbstractC1604130rqV) this.LIZ.getValue();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("CaptionNetworkPartner path: ");
        sbLIZ2.append(str);
        sbLIZ2.append(", statusCode: ");
        sbLIZ2.append(errorCode);
        sbLIZ2.append(", statusMsg: ");
        sbLIZ2.append(strValueOf);
        abstractC1604130rqV2.LJ(C2188811AlT.LIZIZ(sbLIZ2));
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.Bystander
    public final void LJIIJJI(Request request, C0X52<?> c0x52, Throwable th) {
        Object obj;
        Throwable th2;
        Integer numValueOf;
        Integer numValueOf2;
        String str;
        ClientText clientText;
        Integer numValueOf3;
        if (c0x52 == null) {
            obj = null;
        } else {
            try {
                obj = c0x52.LIZIZ;
            } catch (Throwable th3) {
                th2 = th3;
                TryCatchGuardChecker.doCheck(th2);
                C189200o6.m2constructorimpl(new C098200Yq(th2));
            }
        }
        String path = request.getPath();
        try {
            if (Intrinsics.LJFF(path, "/tiktok/cla/subtitle_translation/get/v1/")) {
                if (obj instanceof RealtimeCaptionsTranslationResult) {
                    String str2 = ((RealtimeCaptionsTranslationResult) obj).variant;
                    PerfMetric perfMetric = ((RealtimeCaptionsTranslationResult) obj).perfMetrics;
                    String str3 = ((RealtimeCaptionsTranslationResult) obj).translatedContent;
                    Integer num = ((RealtimeCaptionsTranslationResult) obj).aiLabTime;
                    Integer num2 = ((RealtimeCaptionsTranslationResult) obj).translationCacheTime;
                    Uri uri = UriProtector.parse(request.getUrl());
                    String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "subtitle_id");
                    String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "target_language");
                    String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "item_id");
                    String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "enter_from");
                    AbstractC1604130rqV abstractC1604130rqV = (AbstractC1604130rqV) this.LIZ.getValue();
                    StringBuilder sb = new StringBuilder("CaptionNetworkPartner path: ");
                    sb.append(path);
                    sb.append(", statusCode: ");
                    sb.append(((RealtimeCaptionsTranslationResult) obj).status_code);
                    sb.append(", statusMsg: ");
                    sb.append(((RealtimeCaptionsTranslationResult) obj).status_msg);
                    sb.append(", logId: ");
                    sb.append(((RealtimeCaptionsTranslationResult) obj).extra.logid);
                    sb.append(", req {subtitleId: ");
                    sb.append(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                    sb.append(", targetLang: ");
                    sb.append(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2);
                    sb.append(", itemId: ");
                    sb.append(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3);
                    sb.append(", enterFrom: ");
                    sb.append(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4);
                    sb.append("}, res {variant: ");
                    sb.append(str2);
                    sb.append(", perfMetrics: ");
                    sb.append(perfMetric);
                    sb.append(", translatedContent: ");
                    if (str3 == null) {
                        numValueOf3 = null;
                    } else {
                        numValueOf3 = Integer.valueOf(str3.length());
                    }
                    sb.append(numValueOf3);
                    sb.append(", aiLabTime: ");
                    sb.append(num);
                    sb.append(", translationCacheTime: ");
                    sb.append(num2);
                    sb.append('}');
                    abstractC1604130rqV.LJ(sb.toString());
                } else {
                    LIZIZ(path, c0x52, th);
                }
            } else if (Intrinsics.LJFF(path, "/aweme/v1/translation/description/")) {
                if (obj instanceof DescriptionTranslationResult) {
                    String str4 = ((DescriptionTranslationResult) obj).variant;
                    PerfMetric perfMetric2 = ((DescriptionTranslationResult) obj).perfMetrics;
                    String str5 = ((DescriptionTranslationResult) obj).translatedContent;
                    ClientTextWrapper clientTextWrapper = ((DescriptionTranslationResult) obj).translatedClientText;
                    Integer num3 = ((DescriptionTranslationResult) obj).format;
                    Integer num4 = ((DescriptionTranslationResult) obj).translationStatusCode;
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    request.getBody().writeTo(byteArrayOutputStream);
                    AbstractC1604130rqV abstractC1604130rqV2 = (AbstractC1604130rqV) this.LIZ.getValue();
                    StringBuilder sb2 = new StringBuilder("CaptionNetworkPartner path: ");
                    sb2.append(path);
                    sb2.append(", statusCode: ");
                    sb2.append(((DescriptionTranslationResult) obj).status_code);
                    sb2.append(", statusMsg: ");
                    sb2.append(((DescriptionTranslationResult) obj).status_msg);
                    sb2.append(", logId: ");
                    sb2.append(((DescriptionTranslationResult) obj).extra.logid);
                    sb2.append(", req {");
                    sb2.append(byteArrayOutputStream);
                    sb2.append("}, res {variant: ");
                    sb2.append(str4);
                    sb2.append(", perfMetrics: ");
                    sb2.append(perfMetric2);
                    sb2.append(", translatedContent: ");
                    if (str5 == null) {
                        numValueOf = null;
                    } else {
                        numValueOf = Integer.valueOf(str5.length());
                    }
                    sb2.append(numValueOf);
                    sb2.append(", translationProtocol: ");
                    if (clientTextWrapper == null) {
                        numValueOf2 = null;
                    } else {
                        numValueOf2 = Integer.valueOf(clientTextWrapper.translationProtocol);
                    }
                    sb2.append(numValueOf2);
                    sb2.append(", markupText: ");
                    if (clientTextWrapper == null || (clientText = clientTextWrapper.clientText) == null) {
                        str = null;
                    } else {
                        str = clientText.markupText;
                    }
                    sb2.append(str);
                    sb2.append(", format: ");
                    sb2.append(num3);
                    sb2.append(", translationStatusCode: ");
                    sb2.append(num4);
                    sb2.append('}');
                    abstractC1604130rqV2.LJ(sb2.toString());
                } else {
                    LIZIZ(path, c0x52, th);
                }
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th4) {
            th2 = th4;
            TryCatchGuardChecker.doCheck(th2);
            C189200o6.m2constructorimpl(new C098200Yq(th2));
        }
    }
}
