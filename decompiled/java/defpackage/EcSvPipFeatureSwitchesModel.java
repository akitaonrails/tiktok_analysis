package defpackage;

import X.C09CT;

/* JADX INFO: loaded from: classes32.dex */
public final class EcSvPipFeatureSwitchesModel {

    @C09CT("enable_hide_to_side")
    public final boolean enableHideToSide;

    @C09CT("enable_snap_to_edge")
    public final boolean enableSnapToEdge;

    @C09CT("enable_video_loop")
    public final boolean enableVideoLoop;

    @C09CT("show_controls_on_entry")
    public final boolean showControlsOnEntry;

    public EcSvPipFeatureSwitchesModel() {
        this(false, false, false, false);
    }

    public EcSvPipFeatureSwitchesModel(boolean z, boolean z2, boolean z3, boolean z4) {
        this.enableHideToSide = z;
        this.enableSnapToEdge = z2;
        this.enableVideoLoop = z3;
        this.showControlsOnEntry = z4;
    }
}
