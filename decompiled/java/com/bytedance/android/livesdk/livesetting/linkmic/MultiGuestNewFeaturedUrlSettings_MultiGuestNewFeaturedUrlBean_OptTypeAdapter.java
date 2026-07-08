package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestNewFeaturedUrlSettings;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class MultiGuestNewFeaturedUrlSettings_MultiGuestNewFeaturedUrlBean_OptTypeAdapter extends TypeAdapter<MultiGuestNewFeaturedUrlSettings.MultiGuestNewFeaturedUrlBean> {
    @Override // com.google.gson.TypeAdapter
    public final MultiGuestNewFeaturedUrlSettings.MultiGuestNewFeaturedUrlBean read(C09CU c09cu) {
        MultiGuestNewFeaturedUrlSettings.MultiGuestNewFeaturedUrlBean multiGuestNewFeaturedUrlBean = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            multiGuestNewFeaturedUrlBean = new MultiGuestNewFeaturedUrlSettings.MultiGuestNewFeaturedUrlBean("sslocal://webcast_lynxview_popup?url=https%3A%2F%2Flf-main-gecko-source.tiktokcdn.com%2Fobj%2Ftiktok-teko-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_interaction_multi_guest%2Fpages%2Ffeatured-container%2Ftemplate.js&height=70%25", "sslocal://webcast_lynxview_popup?url=https%3A%2F%2Flf-main-gecko-source.tiktokcdn.com%2Fobj%2Ftiktok-teko-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_interaction_multi_guest%2Fpages%2Ffeatured-container-faq%2Ftemplate.js&height=70%25");
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "featured-container")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        multiGuestNewFeaturedUrlBean.featuredUrl = c09cu.LJJJZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "featured-container-faq")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        multiGuestNewFeaturedUrlBean.featuredFAQUrl = c09cu.LJJJZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return multiGuestNewFeaturedUrlBean;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, MultiGuestNewFeaturedUrlSettings.MultiGuestNewFeaturedUrlBean multiGuestNewFeaturedUrlBean) {
        MultiGuestNewFeaturedUrlSettings.MultiGuestNewFeaturedUrlBean multiGuestNewFeaturedUrlBean2 = multiGuestNewFeaturedUrlBean;
        if (multiGuestNewFeaturedUrlBean2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("featured-container");
        c09dl.LJJJJJ(multiGuestNewFeaturedUrlBean2.featuredUrl);
        c09dl.LJIILLIIL("featured-container-faq");
        c09dl.LJJJJJ(multiGuestNewFeaturedUrlBean2.featuredFAQUrl);
        c09dl.LJII();
    }
}
