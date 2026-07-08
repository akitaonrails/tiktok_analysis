package com.bytedance.touchpoint.api.model;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class MultipleRewardConfig {
    public String LIZ;

    @C09CT("multiple_reward_img")
    public String multipleRewardImg;

    @C09CT("multiple_reward_text")
    public Content multipleRewardText;

    public MultipleRewardConfig(String str, Content content, String str2) {
        this.multipleRewardImg = str;
        this.multipleRewardText = content;
        this.LIZ = str2;
    }
}
