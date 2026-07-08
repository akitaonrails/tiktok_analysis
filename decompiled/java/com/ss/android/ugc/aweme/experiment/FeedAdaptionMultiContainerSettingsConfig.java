package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import X.C1697810uHb;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class FeedAdaptionMultiContainerSettingsConfig {

    @C09CT("multi_container_align_type_list")
    public final List<Integer> multi_container_align_type_list;

    @C09CT("multi_container_bottom_type_list")
    public final List<Integer> multi_container_bottom_type_list;

    @C09CT("multi_container_bottom_type_list_small")
    public final List<Integer> multi_container_bottom_type_list_small;

    @C09CT("multi_container_top_type_list")
    public final List<Integer> multi_container_top_type_list;

    @C09CT("multi_container_top_type_list_small")
    public final List<Integer> multi_container_top_type_list_small;

    @C09CT("multi_container_width_threshold")
    public final List<Float> multi_container_width_threshold;

    @C09CT("multi_containers_between_threshold_default")
    public final List<Float> multi_containers_between_threshold_default;

    @C09CT("multi_containers_between_threshold_text")
    public final List<Float> multi_containers_between_threshold_text;

    @C09CT("multi_containers_top_black_rate_list")
    public final List<Float> multi_containers_top_black_rate_list;

    @C09CT("smallest_container_trans_top_by_bottom_tab")
    public final float smallest_container_trans_top_by_bottom_tab;

    /* JADX WARN: Illegal instructions before constructor call */
    public FeedAdaptionMultiContainerSettingsConfig() {
        Float fValueOf = Float.valueOf(1.0f);
        this(1.0f, C1697810uHb.LJIIJJI(0, 1, 3, 3), C1697810uHb.LJIIJJI(0, 0, 0, 3), C1697810uHb.LJIIJJI(0, 1, 3, 3), C1697810uHb.LJIIJJI(1, 1, 1, 3), C1697810uHb.LJIIJJI(Float.valueOf(0.0f), Float.valueOf(0.05f), fValueOf, fValueOf), C1697810uHb.LJIIJJI(0, 2, 0, 0), C1697810uHb.LJIIJJI(Float.valueOf(0.5f), Float.valueOf(0.5f), Float.valueOf(0.5f)), C1697810uHb.LJIIJJI(Float.valueOf(0.75f), Float.valueOf(0.75f), Float.valueOf(0.75f)), C1697810uHb.LJIIJJI(Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f)));
    }

    public FeedAdaptionMultiContainerSettingsConfig(float f, List<Integer> list, List<Integer> list2, List<Integer> list3, List<Integer> list4, List<Float> list5, List<Integer> list6, List<Float> list7, List<Float> list8, List<Float> list9) {
        this.smallest_container_trans_top_by_bottom_tab = f;
        this.multi_container_top_type_list = list;
        this.multi_container_bottom_type_list = list2;
        this.multi_container_top_type_list_small = list3;
        this.multi_container_bottom_type_list_small = list4;
        this.multi_container_width_threshold = list5;
        this.multi_container_align_type_list = list6;
        this.multi_containers_between_threshold_default = list7;
        this.multi_containers_between_threshold_text = list8;
        this.multi_containers_top_black_rate_list = list9;
    }
}
