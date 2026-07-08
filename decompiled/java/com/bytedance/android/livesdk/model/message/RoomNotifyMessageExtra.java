package com.bytedance.android.livesdk.model.message;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class RoomNotifyMessageExtra {

    @C09CT("background")
    public Background background;

    @C09CT("duration")
    public long duration;

    @C09CT("content_list")
    public NotifyHighlightInfo highlightInfo;

    @C09CT("highlighted")
    public List<Object> highlightedList;

    public static class Background extends ImageModel {
    }
}
