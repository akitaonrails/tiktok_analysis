package webcast.data;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class CommunityDecorationInfo {

    @C09CT("decoration_id")
    public long decorationId;

    @C09CT("decoration_resource")
    public DecorationResource decorationResource;

    @C09CT("is_default")
    public boolean isDefault;

    @C09CT("is_in_effect")
    public boolean isInEffect;

    @C09CT("is_unlocked")
    public boolean isUnlocked;

    @C09CT("preview_image")
    public ImageModel previewImage;

    @C09CT("slot_type")
    public int slotType;

    @C09CT("unlock_level")
    public long unlockLevel;

    @C09CT("value")
    public long value;

    @C09CT("name")
    public String name = "";

    @C09CT("rive_images")
    public Map<Integer, ImageModel> riveImages = new LinkedHashMap();

    @C09CT("decoration_linkages")
    public List<DecorationLinkage> decorationLinkages = new ArrayList();

    @C09CT("tags")
    public List<String> tags = new ArrayList();
}
