package com.ss.android.ugc.aweme.feed.model.live;

import X.C09CT;
import X.InterfaceC2126708Uv;
import com.ss.android.ugc.aweme.discover.model.Challenge;

/* JADX INFO: loaded from: classes30.dex */
public class LiveChallenge {

    @C09CT("cha_name")
    public String challengeName;

    @C09CT("cid")
    @InterfaceC2126708Uv
    public String cid;

    @C09CT("is_commerce")
    public boolean isCommerce;

    @C09CT("schema")
    public String schema;

    @C09CT("sub_type")
    public int subType;

    @C09CT("type")
    public int type;

    public Challenge toAwemeChallenge() {
        Challenge challenge = new Challenge();
        challenge.setCid(this.cid);
        challenge.setChallengeName(this.challengeName);
        challenge.setSchema(this.schema);
        challenge.setType(this.type);
        challenge.setSubType(this.subType);
        return challenge;
    }

    public String getChallengeName() {
        return this.challengeName;
    }

    public String getCid() {
        return this.cid;
    }

    public String getSchema() {
        return this.schema;
    }

    public int getSubType() {
        return this.subType;
    }

    public int getType() {
        return this.type;
    }

    public boolean isCommerce() {
        return this.isCommerce;
    }

    public void setChallengeName(String str) {
        this.challengeName = str;
    }

    public void setCid(String str) {
        this.cid = str;
    }

    public void setCommerce(boolean z) {
        this.isCommerce = z;
    }

    public void setSchema(String str) {
        this.schema = str;
    }

    public void setSubType(int i) {
        this.subType = i;
    }

    public void setType(int i) {
        this.type = i;
    }
}
