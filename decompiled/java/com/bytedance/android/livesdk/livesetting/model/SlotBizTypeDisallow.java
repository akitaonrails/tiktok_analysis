package com.bytedance.android.livesdk.livesetting.model;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class SlotBizTypeDisallow implements Serializable {
    public static final TypeAdapter ADAPTER = new SlotBizTypeDisallow_OptTypeAdapter(NormalGson.singleton());

    @C09CT("disallow_all")
    public boolean disallowAll;

    @C09CT("frame_slot_disallow_list")
    public List<String> frameSlotDisallowList;

    @C09CT("icon_slot_disallow_list")
    public List<String> iconSlotDisallowList;

    public SlotBizTypeDisallow() {
        this(false, null, null);
    }

    public final boolean getDisallowAll() {
        return this.disallowAll;
    }

    public final List<String> getFrameSlotDisallowList() {
        return this.frameSlotDisallowList;
    }

    public final List<String> getIconSlotDisallowList() {
        return this.iconSlotDisallowList;
    }

    public final void setDisallowAll(boolean z) {
        this.disallowAll = z;
    }

    public final void setFrameSlotDisallowList(List<String> list) {
        this.frameSlotDisallowList = list;
    }

    public final void setIconSlotDisallowList(List<String> list) {
        this.iconSlotDisallowList = list;
    }

    public SlotBizTypeDisallow(boolean z, List<String> list, List<String> list2) {
        this.disallowAll = z;
        this.iconSlotDisallowList = list;
        this.frameSlotDisallowList = list2;
    }
}
