package com.bytedance.android.pgcsdk.subscribe.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class ItemInfo {

    @C09CT("item_id")
    public long itemId;

    @C09CT("item_type")
    public long itemType;

    @C09CT("play_count")
    public long playCount;

    @C09CT("item_name")
    public String itemName = "";

    @C09CT("play_address")
    public List<String> playAddress = new ArrayList();

    @C09CT("cover_origin")
    public List<String> coverOrigin = new ArrayList();

    @C09CT("cover_cropped")
    public List<String> coverCropped = new ArrayList();

    @C09CT("creator_id")
    public String creatorId = "";
}
