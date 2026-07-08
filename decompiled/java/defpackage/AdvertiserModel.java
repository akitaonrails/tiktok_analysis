package defpackage;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;

/* JADX INFO: loaded from: classes13.dex */
public final class AdvertiserModel implements Serializable {
    public static final int $stable = 8;

    @C09CT("adv_id")
    public String advId;

    @C09CT("adv_name")
    public String advName;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public Integer advStatus;
    public Boolean advType;

    @C09CT("adv_website")
    public String advWebsite;

    public AdvertiserModel() {
        this(null, null, null, null, Boolean.FALSE);
    }

    public final String getAdvId() {
        return this.advId;
    }

    public final String getAdvName() {
        return this.advName;
    }

    public final Integer getAdvStatus() {
        return this.advStatus;
    }

    public final Boolean getAdvType() {
        return this.advType;
    }

    public final String getAdvWebsite() {
        return this.advWebsite;
    }

    public final void setAdvId(String str) {
        this.advId = str;
    }

    public final void setAdvName(String str) {
        this.advName = str;
    }

    public final void setAdvStatus(Integer num) {
        this.advStatus = num;
    }

    public final void setAdvType(Boolean bool) {
        this.advType = bool;
    }

    public final void setAdvWebsite(String str) {
        this.advWebsite = str;
    }

    public AdvertiserModel(String str, String str2, String str3, Integer num, Boolean bool) {
        this.advId = str;
        this.advName = str2;
        this.advWebsite = str3;
        this.advStatus = num;
        this.advType = bool;
    }
}
