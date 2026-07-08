package com.bytedance.ies.ugc.aweme.rich.model.feed.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class AdInteractionData implements Serializable {

    @C09CT("gesture_guidance")
    public AdGestureGuidance gestureGuidance;

    @C09CT("interaction_type")
    public int interactionType;

    @C09CT("music")
    public UrlModel music;

    @C09CT("popup_image")
    public UrlModel popupImage;

    public final void setGestureGuidance(AdGestureGuidance adGestureGuidance) {
        this.gestureGuidance = adGestureGuidance;
    }

    public final void setInteractionType(int i) {
        this.interactionType = i;
    }

    public final void setMusic(UrlModel urlModel) {
        this.music = urlModel;
    }

    public final void setPopupImage(UrlModel urlModel) {
        this.popupImage = urlModel;
    }

    public AdInteractionData(int i, AdGestureGuidance adGestureGuidance, UrlModel urlModel, UrlModel urlModel2) {
        this.interactionType = i;
        this.gestureGuidance = adGestureGuidance;
        this.popupImage = urlModel;
        this.music = urlModel2;
    }
}
