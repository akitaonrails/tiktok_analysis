package com.ss.android.ugc.aweme.profile.model;

import X.C09CS;
import X.C09CT;
import com.ss.android.ugc.aweme.utils.JsonToStringAdapter;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public class UserAwemeCover implements Serializable {

    @C09CT("aweme_info")
    @C09CS(JsonToStringAdapter.class)
    public String awemeInfo;

    @C09CT("preview_end")
    public int previewEnd;

    @C09CT("preview_start")
    public int previewStart;

    @C09CT("pull_text")
    public String pullText;

    public String getAwemeInfo() {
        return this.awemeInfo;
    }

    public int getPreviewEnd() {
        return this.previewEnd;
    }

    public int getPreviewStart() {
        return this.previewStart;
    }

    public String getPullText() {
        return this.pullText;
    }

    public void setAwemeInfo(String str) {
        this.awemeInfo = str;
    }

    public void setPreviewEnd(int i) {
        this.previewEnd = i;
    }

    public void setPreviewStart(int i) {
        this.previewStart = i;
    }

    public void setPullText(String str) {
        this.pullText = str;
    }
}
