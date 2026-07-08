package com.ss.android.ugc.aweme.image.collage.model;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public final class CollageIntProtocol {
    public static final int $stable = 8;

    @C09CT("collage_id")
    public final String collageId;

    @C09CT("C")
    public final Integer cols;

    @C09CT("layout")
    public final List<List<Integer>> layout;

    @C09CT("R")
    public final Integer rows;

    /* JADX WARN: Multi-variable type inference failed */
    public CollageIntProtocol(String str, Integer num, Integer num2, List<? extends List<Integer>> list) {
        this.collageId = str;
        this.rows = num;
        this.cols = num2;
        this.layout = list;
    }
}
