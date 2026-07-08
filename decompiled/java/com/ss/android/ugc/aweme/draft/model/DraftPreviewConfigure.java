package com.ss.android.ugc.aweme.draft.model;

import X.C09CT;
import X.C13BV;
import X.InterfaceC1294060jmO;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC1294060jmO
public final class DraftPreviewConfigure {

    @C09CT("draftDir")
    public String draftDir;

    @C09CT("fps")
    public int mFps;

    @C09CT("volume")
    public float mVolume;

    @C09CT("preview_height")
    public int previewHeight;

    @C09CT("preview_width")
    public int previewWidth;

    @C09CT("scene_in")
    public int sceneIn;

    @C09CT("scene_out")
    public int sceneOut;

    @C09CT("video_segment_list")
    public List<DraftVideoSegment> videoSegments;

    public DraftPreviewConfigure() {
        this(0, 0, null, 0.0f, 0, 0, 0, null, 255, null);
    }

    public DraftPreviewConfigure(int i, int i2, List<DraftVideoSegment> list, float f, int i3, int i4, int i5, String str) {
        this.previewWidth = i;
        this.previewHeight = i2;
        this.videoSegments = list;
        this.mVolume = f;
        this.mFps = i3;
        this.sceneIn = i4;
        this.sceneOut = i5;
        this.draftDir = str;
    }

    public DraftPreviewConfigure(int i, int i2, List list, float f, int i3, int i4, int i5, String str, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? 576 : i, (i6 & 2) != 0 ? 1024 : i2, (i6 & 4) != 0 ? C13BV.INSTANCE : list, (i6 & 8) != 0 ? 0.0f : f, (i6 & 16) != 0 ? -1 : i3, (i6 & 32) != 0 ? 0 : i4, (i6 & 64) == 0 ? i5 : 0, (i6 & 128) != 0 ? null : str);
    }
}
