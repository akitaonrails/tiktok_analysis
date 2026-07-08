package webcast.data;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class CommunitySlotInfo {

    @C09CT("icon")
    public ImageModel icon;

    @C09CT("is_unlocked")
    public boolean isUnlocked;

    @C09CT("protect_time")
    public long protectTime;

    @C09CT("slot_type")
    public int slotType;

    @C09CT("unlock_level")
    public long unlockLevel;

    @C09CT("svg_icon")
    public String svgIcon = "";

    @C09CT("decorations")
    public List<CommunityDecorationInfo> decorations = new ArrayList();
}
