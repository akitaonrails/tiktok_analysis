package com.bytedance.android.livesdkapi.depend.model.live.bubble;

import X.C09CT;
import X.C2188811AlT;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.io.Serializable;

/* JADX INFO: loaded from: classes29.dex */
public final class LiveBubbleData implements Serializable {

    @C09CT("bubble_title")
    public String bubbleTitle;

    @C09CT("room_data")
    public Room roomData;

    @C09CT("show_head")
    public boolean showHead;

    public LiveBubbleData() {
        this(null, false, "");
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveBubbleData(roomData=");
        sbLIZ.append(this.roomData);
        sbLIZ.append(", showHead=");
        sbLIZ.append(this.showHead);
        sbLIZ.append(", bubbleTitle=");
        sbLIZ.append(this.bubbleTitle);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void setBubbleTitle(String str) {
        this.bubbleTitle = str;
    }

    public final void setRoomData(Room room) {
        this.roomData = room;
    }

    public final void setShowHead(boolean z) {
        this.showHead = z;
    }

    public LiveBubbleData(Room room, boolean z, String str) {
        this.roomData = room;
        this.showHead = z;
        this.bubbleTitle = str;
    }
}
