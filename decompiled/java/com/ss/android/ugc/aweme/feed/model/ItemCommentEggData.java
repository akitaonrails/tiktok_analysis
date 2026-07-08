package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class ItemCommentEggData implements Serializable {

    @C09CT("egg_id")
    public String eggId;

    @C09CT("file_type")
    public String fileType;

    @C09CT("material_url")
    public String materialUrl;

    @C09CT("open_url")
    public String openUrl;

    @C09CT("regex")
    public String regex;

    @C09CT("web_url")
    public String webUrl;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ItemCommentEggData{regex='");
        sbLIZ.append(this.regex);
        sbLIZ.append('\'');
        sbLIZ.append(", fileType='");
        sbLIZ.append(this.fileType);
        sbLIZ.append('\'');
        sbLIZ.append(", webUrl='");
        sbLIZ.append(this.webUrl);
        sbLIZ.append('\'');
        sbLIZ.append(", openUrl='");
        sbLIZ.append(this.openUrl);
        sbLIZ.append('\'');
        sbLIZ.append(", materialUrl='");
        sbLIZ.append(this.materialUrl);
        sbLIZ.append('\'');
        sbLIZ.append(", eggId='");
        sbLIZ.append(this.eggId);
        sbLIZ.append('\'');
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public String getEggId() {
        return this.eggId;
    }

    public String getFileType() {
        return this.fileType;
    }

    public String getMaterialUrl() {
        return this.materialUrl;
    }

    public String getOpenUrl() {
        return this.openUrl;
    }

    public String getRegex() {
        return this.regex;
    }

    public String getWebUrl() {
        return this.webUrl;
    }

    public void setEggId(String str) {
        this.eggId = str;
    }

    public void setFileType(String str) {
        this.fileType = str;
    }

    public void setMaterialUrl(String str) {
        this.materialUrl = str;
    }

    public void setOpenUrl(String str) {
        this.openUrl = str;
    }

    public void setRegex(String str) {
        this.regex = str;
    }

    public void setWebUrl(String str) {
        this.webUrl = str;
    }
}
