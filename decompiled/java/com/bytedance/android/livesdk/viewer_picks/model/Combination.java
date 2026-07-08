package com.bytedance.android.livesdk.viewer_picks.model;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Combination {

    @C09CT("combination_id")
    public long combinationId;

    @C09CT("cover_image")
    public ImageModel coverImage;

    @C09CT("extra")
    public TemplateExtra extra;

    @C09CT("settings")
    public ViewerPicksUserSettings settings;

    @C09CT("name")
    public String name = "";

    @C09CT("description")
    public String description = "";

    @C09CT("gifts")
    public List<GiftPickTemplate> gifts = new ArrayList();

    @C09CT("combination_id_str")
    public String combinationIdStr = "";

    @C09CT("search_prefix")
    public String searchPrefix = "";

    @C09CT("biz_name")
    public String bizName = "";
}
