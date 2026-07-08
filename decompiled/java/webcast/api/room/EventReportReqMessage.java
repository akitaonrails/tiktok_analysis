package webcast.api.room;

import X.C09CT;

/* JADX INFO: loaded from: classes13.dex */
public final class EventReportReqMessage {

    @C09CT("confirm_box_operation")
    public int confirmBoxOperation;

    @C09CT("event")
    public int event;

    @C09CT("event_scene")
    public int eventScene;

    @C09CT("pre_finish_type")
    public int preFinishType;

    @C09CT("room_id")
    public long roomId;

    @C09CT("effect_id")
    public String effectId = "";

    @C09CT("last_effect_id")
    public String lastEffectId = "";

    @C09CT("resource_id")
    public String resourceId = "";

    @C09CT("last_resource_id")
    public String lastResourceId = "";
}
