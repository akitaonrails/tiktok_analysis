package com.ss.android.ugc.aweme.settings;

import X.C09CT;
import X.C2188811AlT;
import android.os.Build;
import android.text.TextUtils;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
public class LooperProtectEnhanceSetting$ExceptionInfo {

    @C09CT("apiLevels")
    public List<Integer> apiLevels;

    @C09CT("exceptionMessage")
    public String exceptionMessage;

    @C09CT("exceptionType")
    public String exceptionType;

    @C09CT("models")
    public List<String> models;

    @C09CT("stackClassName")
    public String stackClassName;

    @C09CT("stackMethodName")
    public String stackMethodName;

    public final boolean LIZ() {
        if (TextUtils.isEmpty(this.exceptionType) || TextUtils.isEmpty(this.exceptionMessage) || TextUtils.isEmpty(this.stackClassName) || TextUtils.isEmpty(this.stackMethodName)) {
            return false;
        }
        List<String> list = this.models;
        if (list != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(Build.MANUFACTURER);
            sbLIZ.append(" ");
            sbLIZ.append(Build.MODEL);
            if (!list.contains(C2188811AlT.LIZIZ(sbLIZ))) {
                return false;
            }
        }
        List<Integer> list2 = this.apiLevels;
        if (list2 != null) {
            return list2.contains(Integer.valueOf(Build.VERSION.SDK_INT));
        }
        return true;
    }
}
