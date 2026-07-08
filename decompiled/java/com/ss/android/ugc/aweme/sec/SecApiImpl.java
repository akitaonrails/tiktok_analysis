package com.ss.android.ugc.aweme.sec;

import X.C149A;
import X.C149B;
import X.C2188811AlT;
import X.C2344809Gs;
import X.EnumC20222314Ar;
import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.bdturing.ttnet.TTNetUtil;
import com.ss.android.ugc.aweme.secapi.ISecApi;
import java.util.Map;

/* JADX INFO: loaded from: classes31.dex */
public final class SecApiImpl implements ISecApi {
    @Override // com.ss.android.ugc.aweme.secapi.ISecApi
    public final void dismissCaptcha() {
        C2344809Gs.LIZLLL(4, "Sec", "dismissCaptcha");
        DmtSec.dismissCaptcha();
    }

    @Override // com.ss.android.ugc.aweme.secapi.ISecApi
    public final String onEvent() {
        return DmtSec.INSTANCE.onEvent();
    }

    @Override // com.ss.android.ugc.aweme.secapi.ISecApi
    public final void setParams() {
        DmtSec.INSTANCE.setParams();
    }

    @Override // com.ss.android.ugc.aweme.secapi.ISecApi
    public final void initTask() {
        TTNetUtil.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.secapi.ISecApi
    public final boolean isCaptchaUrl(String str) {
        boolean zIsCaptchaUrl = DmtSec.isCaptchaUrl(str);
        if (zIsCaptchaUrl) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("isCaptchaUrl: ");
            sbLIZ.append(str);
            C2344809Gs.LIZLLL(4, "Sec", C2188811AlT.LIZIZ(sbLIZ));
        }
        return zIsCaptchaUrl;
    }

    @Override // com.ss.android.ugc.aweme.secapi.ISecApi
    public final boolean needVerifyImage(int i) {
        boolean zNeedVerifyImage = DmtSec.needVerifyImage(i);
        if (zNeedVerifyImage) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("needVerifyImage: ");
            sbLIZ.append(i);
            C2344809Gs.LIZLLL(4, "Sec", C2188811AlT.LIZIZ(sbLIZ));
        }
        return zNeedVerifyImage;
    }

    @Override // com.ss.android.ugc.aweme.secapi.ISecApi
    public final void reportData(String str) {
        DmtSec.report(str);
    }

    @Override // com.ss.android.ugc.aweme.secapi.ISecApi
    public final void updateCollectMode(EnumC20222314Ar enumC20222314Ar) {
        DmtSec.INSTANCE.updateCollectMode(enumC20222314Ar);
    }

    @Override // com.ss.android.ugc.aweme.secapi.ISecApi
    public final Map<String, String> frameSign(String str, int i) {
        return DmtSec.INSTANCE.frameSign(str, i);
    }

    @Override // com.ss.android.ugc.aweme.secapi.ISecApi
    public final void setDeviceInfo(String str, String str2) {
        DmtSec.INSTANCE.updateDeviceInfo(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.secapi.ISecApi
    public final void updateDeviceIdAndInstallId(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateDeviceIdAndInstallId:did = ");
        sbLIZ.append(str);
        sbLIZ.append("  iid = ");
        sbLIZ.append(str2);
        C2344809Gs.LIZLLL(4, "Sec", C2188811AlT.LIZIZ(sbLIZ));
        DmtSec.updateDeviceIdAndInstallId(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.secapi.ISecApi
    public final void popCaptcha(Activity activity, int i, C149A c149a) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("popCaptcha - errorcode = ");
        sbLIZ.append(i);
        C2344809Gs.LIZLLL(4, "Sec", C2188811AlT.LIZIZ(sbLIZ));
        DmtSec.popCaptcha(i, activity, c149a);
    }

    @Override // com.ss.android.ugc.aweme.secapi.ISecApi
    public final void popCaptchaV2(Activity activity, String str, C149A c149a, Fragment fragment) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("popCaptchaV2 - riskInfo = ");
        sbLIZ.append(str);
        C2344809Gs.LIZLLL(4, "Sec", C2188811AlT.LIZIZ(sbLIZ));
        if (str.length() == 0) {
            C2344809Gs.LIZLLL(6, "Sec", "popCaptchaV2 - riskInfo is empty. will not popup Captcha dialog!");
        }
        DmtSec.INSTANCE.popCaptchaV2(str, activity, c149a, fragment);
    }

    @Override // com.ss.android.ugc.aweme.secapi.ISecApi
    public final void initSec(Context context, String str, int i, String str2, String str3, boolean z, C149B c149b) {
        C2344809Gs.LIZLLL(4, "Sec", "initSec");
        DmtSec.init(context, str, i, str2, str3, z, c149b);
    }
}
