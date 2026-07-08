package com.ss.android.ugc.aweme.commercialize.model;

import X.C09CT;
import X.C09DE;
import X.C1045260dJ6;
import X.C1045270dJ7;
import com.bytedance.vast.model.AdVerification;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes17.dex */
public class OmVast implements Serializable {

    @C09CT("ad_choice")
    public NativeIcon adChoiceIcon;

    @C09CT("adVerifications")
    public List<AdVerification> adVerificationList;

    @C09CT("extra_ad_verifications")
    public List<AdVerification> extraAdVerificationList;

    @C09CT("enable_content_url")
    public boolean isEnableContentUrl;

    @C09CT("local_cache_loaded")
    public boolean loaded;
    public transient boolean loading;

    @C09CT("local_cache_vast")
    public C1045270dJ7 vast;

    @C09CT("vastContent")
    @C09DE(serialize = false)
    public String vastContent;

    @C09CT("vastTemplate")
    @C09DE(serialize = false)
    public String vastTemplate;

    @C09CT("vastUrl")
    @C09DE(serialize = false)
    public String vastUrl;

    @C09CT("vastWrapperCount")
    @C09DE(serialize = false)
    public int vastWrapperCount = 1;

    @C09CT("providerType")
    public int providerType = 2;

    @C09CT("creative_type")
    @C09DE(serialize = false)
    public int creative_type = 4;

    @C09CT("impression_type")
    @C09DE(serialize = false)
    public int impression_type = 4;

    public List<C1045260dJ6> getCreativeList() {
        C1045270dJ7 c1045270dJ7 = this.vast;
        if (c1045270dJ7 == null) {
            return null;
        }
        return c1045270dJ7.creativeList;
    }

    public Set<String> getImpressions() {
        C1045270dJ7 c1045270dJ7 = this.vast;
        if (c1045270dJ7 == null) {
            return null;
        }
        return c1045270dJ7.impressionSet;
    }
}
