package com.ss.android.ugc.aweme.live.livehostimpl;

import X.C09CT;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public final class LiveBusinessExtra implements Serializable {
    public static final int $stable = 8;

    @C09CT("anchor_info")
    public final CreateAnchorInfo AnchorInfo;

    @C09CT("fragment_type")
    public final int FragmentType;

    @C09CT("pin_time")
    public final long PinTime;

    @C09CT("product_click_count")
    public final long ProductClickCount;

    @C09CT("product_id")
    public final String ProductID;

    @C09CT("product_pic_url")
    public final String ProductPicURL;

    @C09CT("product_title")
    public final String ProductTitle;

    @C09CT("suggest_video_title")
    public final String VideoSuggestTitle;

    @C09CT("suggest_video_toast")
    public final String VideoSuggestToast;

    public final CreateAnchorInfo getAnchorInfo() {
        return this.AnchorInfo;
    }

    public final int getFragmentType() {
        return this.FragmentType;
    }

    public final long getPinTime() {
        return this.PinTime;
    }

    public final long getProductClickCount() {
        return this.ProductClickCount;
    }

    public final String getProductID() {
        return this.ProductID;
    }

    public final String getProductPicURL() {
        return this.ProductPicURL;
    }

    public final String getProductTitle() {
        return this.ProductTitle;
    }

    public final String getVideoSuggestTitle() {
        return this.VideoSuggestTitle;
    }

    public final String getVideoSuggestToast() {
        return this.VideoSuggestToast;
    }

    public LiveBusinessExtra(String str, long j, int i, long j2, String str2, String str3, String str4, String str5, CreateAnchorInfo createAnchorInfo) {
        this.ProductID = str;
        this.PinTime = j;
        this.FragmentType = i;
        this.ProductClickCount = j2;
        this.ProductPicURL = str2;
        this.ProductTitle = str3;
        this.VideoSuggestTitle = str4;
        this.VideoSuggestToast = str5;
        this.AnchorInfo = createAnchorInfo;
    }
}
