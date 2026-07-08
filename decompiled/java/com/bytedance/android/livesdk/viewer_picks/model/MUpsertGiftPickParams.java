package com.bytedance.android.livesdk.viewer_picks.model;

import X.C09CT;
import com.bytedance.scene.Scene;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
public final class MUpsertGiftPickParams {

    @C09CT("add_to_place")
    public int addToPlace;

    @C09CT("profile_extra")
    public ProfileExtra profileExtra;

    @C09CT("replace")
    public boolean replace;

    @C09CT("room_id")
    public long roomId;

    @C09CT(Scene.SCENE_SERVICE)
    public int scene;

    @C09CT("template_id")
    public long templateId;

    @C09CT("upsert_type")
    public int upsertType;

    @C09CT("upsert_gift_picks")
    public List<UpsertGiftPick> upsertGiftPicks = new ArrayList();

    @C09CT("template_name")
    public String templateName = "";

    @C09CT("gift_pick_ids_to_delete")
    public List<Long> giftPickIdsToDelete = new ArrayList();

    /* JADX INFO: loaded from: classes.dex */
    public static final class UpsertGiftPick {

        @C09CT("desc_source")
        public int descSource;

        @C09CT("extra")
        public GiftPickExtra extra;

        @C09CT("gift_id")
        public long giftId;

        @C09CT("gift_pick_id")
        public long giftPickId;

        @C09CT("is_priority_request")
        public boolean isPriorityRequest;

        @C09CT("template_id")
        public long templateId;

        @C09CT("customized_desc")
        public String customizedDesc = "";

        @C09CT("content_source")
        public String contentSource = "";
    }
}
