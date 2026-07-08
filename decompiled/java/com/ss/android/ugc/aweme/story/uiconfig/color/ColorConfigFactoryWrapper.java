package com.ss.android.ugc.aweme.story.uiconfig.color;

import X.C09CT;
import X.C1608650rxn;
import X.C1697810uHb;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes25.dex */
public final class ColorConfigFactoryWrapper {

    @C09CT("avatar_badge_color")
    public final List<FactoryColorConfig> avatarBadgeColor;

    @C09CT("avatar_ring_color")
    public final List<FactoryColorConfig> avatarRingColor;

    @C09CT("record_button_color")
    public final List<FactoryColorConfig> recordButtonColor;

    @C09CT("story_tag_color")
    public final List<FactoryColorConfig> storyTagColor;

    public ColorConfigFactoryWrapper() {
        this(null, null, null, null, 15, null);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ColorConfigFactoryWrapper(avatarRingColor=");
        sbLIZ.append(this.avatarRingColor);
        sbLIZ.append(", avatarBadgeColor=");
        sbLIZ.append(this.avatarBadgeColor);
        sbLIZ.append(", recordButtonColor=");
        sbLIZ.append(this.recordButtonColor);
        sbLIZ.append(", storyTagColor=");
        sbLIZ.append(this.storyTagColor);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ColorConfigFactoryWrapper(List<FactoryColorConfig> list, List<FactoryColorConfig> list2, List<FactoryColorConfig> list3, List<FactoryColorConfig> list4) {
        this.avatarRingColor = list;
        this.avatarBadgeColor = list2;
        this.recordButtonColor = list3;
        this.storyTagColor = list4;
    }

    public ColorConfigFactoryWrapper(List list, List list2, List list3, List list4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C1697810uHb.LJIIJJI(new FactoryColorConfig("purple_theme_type", C1608650rxn.LIZIZ), new FactoryColorConfig("blue_theme_type", C1608650rxn.LIZJ)) : list, (i & 2) != 0 ? C1697810uHb.LJIIJJI(new FactoryColorConfig("purple_theme_type", C1608650rxn.LJIIIIZZ), new FactoryColorConfig("blue_theme_type", C1608650rxn.LJIIIZ)) : list2, (i & 4) != 0 ? C1697810uHb.LJIIJJI(new FactoryColorConfig("purple_theme_type", C1608650rxn.LJ), new FactoryColorConfig("blue_theme_type", C1608650rxn.LJI), new FactoryColorConfig("blue_theme_type_plus", C1608650rxn.LJFF)) : list3, (i & 8) != 0 ? C1697810uHb.LJIIJJI(new FactoryColorConfig("purple_theme_type", C1608650rxn.LJIIJJI), new FactoryColorConfig("blue_theme_type_v2", C1608650rxn.LJIIL), new FactoryColorConfig("blue_theme_type_v1", C1608650rxn.LJIIJ)) : list4);
    }
}
