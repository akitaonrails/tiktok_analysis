package com.ss.android.ugc.profile.business.profile;

import X.C098200Yq;
import X.C09CT;
import X.C189200o6;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.profile.platform.base.data.Describe;
import com.ss.android.ugc.profile.platform.base.data.Icon;
import java.io.Serializable;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileLinkData implements Serializable {
    public static final int $stable = 8;

    @C09CT("backup_data_flow_id")
    public String backDataFlowId;

    @C09CT("backup_url")
    public String backupUrl;

    @C09CT("bio_link_click_action")
    public Integer bioLinkClickAction;

    @C09CT("data_flow_id")
    public String dataFlowId;

    @C09CT("icon")
    public Icon icon;

    @C09CT("lemon8_deep_link_value")
    public String lemon8DeepLinkValue;

    @C09CT("lemon8_link_type")
    public Integer lemon8LinkType;

    @C09CT("lemon8_open_id")
    public String lemonOpenId;

    @C09CT("package_name")
    public String packageName;

    @C09CT("profile_link_id")
    public Integer profileLinkId;

    @C09CT("describe")
    public Describe text;

    @C09CT("url")
    public String url;

    @C09CT("url_max_layers")
    public Integer urlMaxLayers = 0;

    public final String getLemon8CppAndroidPageId() {
        Object obj;
        String str = this.lemon8DeepLinkValue;
        if (str == null) {
            return null;
        }
        try {
            String strOptString = new JSONObject(str).optString("cpp_link");
            boolean z = !a0.LJJJIL(strOptString);
            String str2 = strOptString;
            if (!z) {
                str2 = null;
            }
            C189200o6.m2constructorimpl(str2);
            obj = str2;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            obj = c098200Yq;
        }
        return (String) (C189200o6.m7isFailureimpl(obj) ? null : obj);
    }

    public final String getBackDataFlowId() {
        return this.backDataFlowId;
    }

    public final String getBackupUrl() {
        return this.backupUrl;
    }

    public final Integer getBioLinkClickAction() {
        return this.bioLinkClickAction;
    }

    public final String getDataFlowId() {
        return this.dataFlowId;
    }

    public final Icon getIcon() {
        return this.icon;
    }

    public final String getLemon8DeepLinkValue() {
        return this.lemon8DeepLinkValue;
    }

    public final Integer getLemon8LinkType() {
        return this.lemon8LinkType;
    }

    public final String getLemonOpenId() {
        return this.lemonOpenId;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final Integer getProfileLinkId() {
        return this.profileLinkId;
    }

    public final Describe getText() {
        return this.text;
    }

    public final String getUrl() {
        return this.url;
    }

    public final Integer getUrlMaxLayers() {
        return this.urlMaxLayers;
    }

    public final void setBackDataFlowId(String str) {
        this.backDataFlowId = str;
    }

    public final void setBackupUrl(String str) {
        this.backupUrl = str;
    }

    public final void setBioLinkClickAction(Integer num) {
        this.bioLinkClickAction = num;
    }

    public final void setDataFlowId(String str) {
        this.dataFlowId = str;
    }

    public final void setIcon(Icon icon) {
        this.icon = icon;
    }

    public final void setLemon8DeepLinkValue(String str) {
        this.lemon8DeepLinkValue = str;
    }

    public final void setLemon8LinkType(Integer num) {
        this.lemon8LinkType = num;
    }

    public final void setLemonOpenId(String str) {
        this.lemonOpenId = str;
    }

    public final void setPackageName(String str) {
        this.packageName = str;
    }

    public final void setProfileLinkId(Integer num) {
        this.profileLinkId = num;
    }

    public final void setText(Describe describe) {
        this.text = describe;
    }

    public final void setUrl(String str) {
        this.url = str;
    }

    public final void setUrlMaxLayers(Integer num) {
        this.urlMaxLayers = num;
    }
}
