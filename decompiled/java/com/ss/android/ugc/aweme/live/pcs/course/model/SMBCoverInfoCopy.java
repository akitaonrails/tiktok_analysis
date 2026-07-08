package com.ss.android.ugc.aweme.live.pcs.course.model;

import X.C09CT;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public final class SMBCoverInfoCopy implements Serializable {
    public static final int $stable = 8;

    @C09CT("cover_height")
    public int coverHeight;

    @C09CT("cover_tsp")
    public double coverTsp;

    @C09CT("cover_type")
    public int coverType;

    @C09CT("cover_uri")
    public String coverUri;

    @C09CT("cover_width")
    public int coverWidth;

    @C09CT("crop_type")
    public int cropType;

    @C09CT("url")
    public List<String> url;

    public SMBCoverInfoCopy() {
        this(0, "", 0, 0, 0.0d, new ArrayList(), 0);
    }

    public final void setCoverHeight(int i) {
        this.coverHeight = i;
    }

    public final void setCoverTsp(double d) {
        this.coverTsp = d;
    }

    public final void setCoverType(int i) {
        this.coverType = i;
    }

    public final void setCoverUri(String str) {
        this.coverUri = str;
    }

    public final void setCoverWidth(int i) {
        this.coverWidth = i;
    }

    public final void setCropType(int i) {
        this.cropType = i;
    }

    public final void setUrl(List<String> list) {
        this.url = list;
    }

    public SMBCoverInfoCopy(int i, String str, int i2, int i3, double d, List<String> list, int i4) {
        this.coverType = i;
        this.coverUri = str;
        this.coverHeight = i2;
        this.coverWidth = i3;
        this.coverTsp = d;
        this.url = list;
        this.cropType = i4;
    }
}
