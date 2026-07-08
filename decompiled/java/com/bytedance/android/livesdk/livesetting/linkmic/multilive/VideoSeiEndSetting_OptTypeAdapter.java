package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C1697810uHb;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes18.dex */
public final class VideoSeiEndSetting_OptTypeAdapter extends TypeAdapter<VideoSeiEndSetting> {
    public final Gson LIZ;

    public VideoSeiEndSetting_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final VideoSeiEndSetting read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        VideoSeiEndSetting videoSeiEndSetting = new VideoSeiEndSetting(1, 1, 1, new ArrayList(C1697810uHb.LJIIJJI("video", "live_studio")));
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -588362725:
                        if (strLJJJJ.equals("end_layout_scene")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                videoSeiEndSetting.enableSceneList = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -393401994:
                        if (strLJJJJ.equals("enable_video_sei_end_layout")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                videoSeiEndSetting.enableVideoSeiEndLayout = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -312752124:
                        if (strLJJJJ.equals("enable_no_parse_sei_end_layout")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                videoSeiEndSetting.enableNoParseSeiEndLayout = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1911268055:
                        if (strLJJJJ.equals("enable_video_sei")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                videoSeiEndSetting.enableVideoSei = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return videoSeiEndSetting;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, VideoSeiEndSetting videoSeiEndSetting) {
        VideoSeiEndSetting videoSeiEndSetting2 = videoSeiEndSetting;
        if (videoSeiEndSetting2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable_video_sei");
        c09dl.LJJJJ(Integer.valueOf(videoSeiEndSetting2.enableVideoSei));
        c09dl.LJIILLIIL("enable_video_sei_end_layout");
        c09dl.LJJJJ(Integer.valueOf(videoSeiEndSetting2.enableVideoSeiEndLayout));
        c09dl.LJIILLIIL("enable_no_parse_sei_end_layout");
        c09dl.LJJJJ(Integer.valueOf(videoSeiEndSetting2.enableNoParseSeiEndLayout));
        c09dl.LJIILLIIL("end_layout_scene");
        C473040Igo.LIZLLL(this.LIZ, c09dl, videoSeiEndSetting2.enableSceneList, String.class);
        c09dl.LJII();
    }
}
