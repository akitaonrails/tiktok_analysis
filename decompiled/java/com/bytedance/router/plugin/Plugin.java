package com.bytedance.router.plugin;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public class Plugin {
    public String mName;
    public String mPackageName;
    public String mSchemaRegExp;

    public String getName() {
        return this.mName;
    }

    public String getPackageName() {
        return this.mPackageName;
    }

    public String getSchemaRegExp() {
        return this.mSchemaRegExp;
    }

    public boolean containsUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String schemeSpecificPart = UriProtector.parse(str).getSchemeSpecificPart();
        if (TextUtils.isEmpty(schemeSpecificPart)) {
            return false;
        }
        return Pattern.matches(this.mSchemaRegExp, schemeSpecificPart);
    }

    public Plugin(String str, String str2, String str3) {
        this.mName = str;
        this.mPackageName = str2;
        this.mSchemaRegExp = str3;
    }
}
