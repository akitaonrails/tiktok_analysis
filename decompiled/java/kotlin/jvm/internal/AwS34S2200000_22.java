package kotlin.jvm.internal;

import X.C09AY;
import X.C0LAB;
import X.C20684815ws;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public class AwS34S2200000_22 extends C09AY implements Function0 {
    public final int $t;
    public Object l2;
    public Object l3;
    public String s0;
    public String s1 = "video_edit_page";

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS34S2200000_22 awS34S2200000_22) {
        String str;
        int duetVideoDuration;
        String duetLayout;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", awS34S2200000_22.s0);
        c0lab.LJ("enter_from", awS34S2200000_22.s1);
        c0lab.LJ("to_status", "disabled");
        HashMap map = (HashMap) awS34S2200000_22.l2;
        if (map != null) {
            str = (String) map.get("shoot_way");
        } else {
            str = null;
        }
        c0lab.LJ("shoot_way", str);
        if (((VideoPublishEditModel) awS34S2200000_22.l3).isDuet()) {
            duetVideoDuration = ((VideoPublishEditModel) awS34S2200000_22.l3).getDuetVideoDuration();
        } else {
            duetVideoDuration = 0;
        }
        c0lab.LIZ(duetVideoDuration, "duet_video_duration");
        c0lab.LIZ(((VideoPublishEditModel) awS34S2200000_22.l3).getDuetFromDuetButton(), "is_from_duet_button");
        if (((VideoPublishEditModel) awS34S2200000_22.l3).isDuet()) {
            duetLayout = ((VideoPublishEditModel) awS34S2200000_22.l3).getDuetLayout();
        } else {
            duetLayout = "";
        }
        c0lab.LJ("duet_layout", duetLayout);
        c0lab.LIZ(((VideoPublishEditModel) awS34S2200000_22.l3).getVideoLength(), "creation_duration");
        C20684815ws.LJIILLIIL("click_react_duet_control", c0lab.LIZ);
        return Boolean.FALSE;
    }

    public static final Object invoke$1(AwS34S2200000_22 awS34S2200000_22) {
        String str;
        String str2;
        String str3;
        int stitchVideoDuration;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", awS34S2200000_22.s0);
        c0lab.LJ("enter_from", awS34S2200000_22.s1);
        c0lab.LJ("to_status", "disabled");
        HashMap map = (HashMap) awS34S2200000_22.l2;
        Integer numValueOf = null;
        if (map != null) {
            str = (String) map.get("content_type");
        } else {
            str = null;
        }
        c0lab.LJ("content_type", str);
        HashMap map2 = (HashMap) awS34S2200000_22.l2;
        if (map2 != null) {
            str2 = (String) map2.get("content_source");
        } else {
            str2 = null;
        }
        c0lab.LJ("content_source", str2);
        HashMap map3 = (HashMap) awS34S2200000_22.l2;
        if (map3 != null) {
            str3 = (String) map3.get("shoot_way");
        } else {
            str3 = null;
        }
        c0lab.LJ("shoot_way", str3);
        if (((VideoPublishEditModel) awS34S2200000_22.l3).isStitchMode()) {
            StitchParams stitchParams = ((VideoPublishEditModel) awS34S2200000_22.l3).getStitchParams();
            if (stitchParams != null) {
                stitchVideoDuration = stitchParams.getStitchVideoDuration();
            }
            c0lab.LIZLLL(numValueOf, "stitch_video_duration");
            c0lab.LIZ(((VideoPublishEditModel) awS34S2200000_22.l3).getVideoLength(), "creation_duration");
            C20684815ws.LJIILLIIL("click_stitch_control", c0lab.LIZ);
            return Boolean.FALSE;
        }
        stitchVideoDuration = 0;
        numValueOf = Integer.valueOf(stitchVideoDuration);
        c0lab.LIZLLL(numValueOf, "stitch_video_duration");
        c0lab.LIZ(((VideoPublishEditModel) awS34S2200000_22.l3).getVideoLength(), "creation_duration");
        C20684815ws.LJIILLIIL("click_stitch_control", c0lab.LIZ);
        return Boolean.FALSE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS34S2200000_22(String str, HashMap map, VideoPublishEditModel videoPublishEditModel, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l2 = map;
        this.l3 = videoPublishEditModel;
    }
}
