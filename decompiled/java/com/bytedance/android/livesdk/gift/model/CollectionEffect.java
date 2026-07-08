package com.bytedance.android.livesdk.gift.model;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;

/* JADX INFO: loaded from: classes27.dex */
public final class CollectionEffect {

    @C09CT("effect_content")
    public String effectContent;

    @C09CT("effect_id")
    public Long effectId;

    @C09CT("effect_name")
    public String effectName;

    @C09CT("first_contributor")
    public CollectionUser firstContributor;

    @C09CT("has_been_collected")
    public Boolean hasBeenCollected;

    @C09CT("img")
    public ImageModel img;

    @C09CT("is_rare_effect")
    public Boolean isRareEffect;

    @C09CT("non_activated_img")
    public ImageModel nonActivatedImg;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.effectId != null) {
            sb.append(", effect_id=");
            sb.append(this.effectId);
        }
        if (this.effectName != null) {
            sb.append(", effect_name=");
            sb.append(this.effectName);
        }
        if (this.effectContent != null) {
            sb.append(", effect_content=");
            sb.append(this.effectContent);
        }
        if (this.firstContributor != null) {
            sb.append(", first_contributor=");
            sb.append(this.firstContributor);
        }
        if (this.isRareEffect != null) {
            sb.append(", is_rare_effect=");
            sb.append(this.isRareEffect);
        }
        if (this.hasBeenCollected != null) {
            sb.append(", has_been_collected=");
            sb.append(this.hasBeenCollected);
        }
        if (this.img != null) {
            sb.append(", img=");
            sb.append(this.img);
        }
        if (this.nonActivatedImg != null) {
            sb.append(", non_activated_img=");
            sb.append(this.nonActivatedImg);
        }
        sb.replace(0, 2, "CollectionEffect{");
        sb.append('}');
        return sb.toString();
    }
}
