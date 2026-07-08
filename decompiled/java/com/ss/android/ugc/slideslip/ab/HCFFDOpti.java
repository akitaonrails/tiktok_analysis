package com.ss.android.ugc.slideslip.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes26.dex */
public final class HCFFDOpti {

    @C09CT("disable_slide_slip_gesture_component")
    public final boolean disableSlideSlipGestureComponent;

    @C09CT("lazy_add_mobile_effect_guide_submit_api_component_listener")
    public final boolean lazyAddMobileEffectGuideSubmitApiComponentListener;

    @C09CT("lazy_load_carousel_scroll_listener")
    public final boolean lazyLoadCarouselScrollListener;

    @C09CT("lazy_load_effect_carousel_bottom_component")
    public final int lazyLoadEffectViewComponent;

    public HCFFDOpti() {
        this(0, false, false, false);
    }

    public HCFFDOpti(int i, boolean z, boolean z2, boolean z3) {
        this.lazyLoadEffectViewComponent = i;
        this.disableSlideSlipGestureComponent = z;
        this.lazyLoadCarouselScrollListener = z2;
        this.lazyAddMobileEffectGuideSubmitApiComponentListener = z3;
    }
}
