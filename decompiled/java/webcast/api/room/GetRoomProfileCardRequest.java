package webcast.api.room;

import X.C09CT;

/* JADX INFO: loaded from: classes8.dex */
public final class GetRoomProfileCardRequest {

    @C09CT("anchor_id")
    public long anchorId;

    @C09CT("business_data_filter")
    public BusinessDataFilter businessDataFilter;

    @C09CT("can_recognize_enigma_role")
    public boolean canRecognizeEnigmaRole;

    @C09CT("filter_bio_translate")
    public boolean filterBioTranslate;

    @C09CT("gallery_entrance_scene")
    public int galleryEntranceScene;

    @C09CT("room_id")
    public long roomId;

    @C09CT("target_user_id")
    public long targetUserId;

    @C09CT("user_role")
    public String userRole = "";
}
