package com.ss.android.ugc.aweme.effect;

import X.C09CT;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public final class DescriptionData implements Serializable {

    @C09CT("prop_list")
    public List<CreateAnchorInfo> effectList;

    @C09CT("make_by_mae")
    public String makeByMae;

    @C09CT("met_publish_data")
    public List<ReuploadMetaData> metData;

    @C09CT("product")
    public String product;

    public DescriptionData() {
        this(null, null, null, null);
    }

    public final void setEffectList(List<CreateAnchorInfo> list) {
        this.effectList = list;
    }

    public final void setMakeByMae(String str) {
        this.makeByMae = str;
    }

    public final void setMetData(List<ReuploadMetaData> list) {
        this.metData = list;
    }

    public final void setProduct(String str) {
        this.product = str;
    }

    public DescriptionData(String str, List<CreateAnchorInfo> list, List<ReuploadMetaData> list2, String str2) {
        this.product = str;
        this.effectList = list;
        this.metData = list2;
        this.makeByMae = str2;
    }
}
