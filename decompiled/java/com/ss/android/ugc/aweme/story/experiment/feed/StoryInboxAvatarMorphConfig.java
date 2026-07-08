package com.ss.android.ugc.aweme.story.experiment.feed;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import X.C786410Ut5;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class StoryInboxAvatarMorphConfig {

    @C09CT("render_node_supported")
    public final boolean renderNodeSupported;

    @C09CT("scenes")
    public final List<String> scenes;

    @C09CT("support_low_end_device")
    public final boolean supportLowEndDevice;

    @C09CT("translucent")
    public final boolean translucent;

    public StoryInboxAvatarMorphConfig() {
        this(null, false, false, false, 15, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoryInboxAvatarMorphConfig)) {
            return false;
        }
        StoryInboxAvatarMorphConfig storyInboxAvatarMorphConfig = (StoryInboxAvatarMorphConfig) obj;
        return Intrinsics.LJFF(this.scenes, storyInboxAvatarMorphConfig.scenes) && this.supportLowEndDevice == storyInboxAvatarMorphConfig.supportLowEndDevice && this.renderNodeSupported == storyInboxAvatarMorphConfig.renderNodeSupported && this.translucent == storyInboxAvatarMorphConfig.translucent;
    }

    public final int hashCode() {
        return (((((this.scenes.hashCode() * 31) + C786410Ut5.Z2(this.supportLowEndDevice)) * 31) + C786410Ut5.Z2(this.renderNodeSupported)) * 31) + C786410Ut5.Z2(this.translucent);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StoryInboxAvatarMorphConfig(scenes=");
        sbLIZ.append(this.scenes);
        sbLIZ.append(", supportLowEndDevice=");
        sbLIZ.append(this.supportLowEndDevice);
        sbLIZ.append(", renderNodeSupported=");
        sbLIZ.append(this.renderNodeSupported);
        sbLIZ.append(", translucent=");
        sbLIZ.append(this.translucent);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public StoryInboxAvatarMorphConfig(List<String> list, boolean z, boolean z2, boolean z3) {
        this.scenes = list;
        this.supportLowEndDevice = z;
        this.renderNodeSupported = z2;
        this.translucent = z3;
    }

    public StoryInboxAvatarMorphConfig(List list, boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3);
    }
}
