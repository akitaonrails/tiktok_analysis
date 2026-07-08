package com.ss.android.ugc.aweme.music.model;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class MusicCoverInfo {

    @C09CT("url_list")
    public List<String> coverUrlList;

    @C09CT("partner_name")
    public String partnerName;

    public List<String> getCoverUrlList() {
        return this.coverUrlList;
    }

    public String getPartnerName() {
        return this.partnerName;
    }

    public void setCoverUrlList(List<String> list) {
        this.coverUrlList = list;
    }

    public void setPartnerName(String str) {
        this.partnerName = str;
    }
}
