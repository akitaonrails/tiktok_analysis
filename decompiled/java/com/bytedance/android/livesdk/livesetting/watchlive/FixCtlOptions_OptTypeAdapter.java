package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes36.dex */
public final class FixCtlOptions_OptTypeAdapter extends TypeAdapter<FixCtlOptions> {
    public final Gson LIZ;

    public FixCtlOptions_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final FixCtlOptions read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        FixCtlOptions fixCtlOptions = new FixCtlOptions(false, false, false, false, false);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1370047327:
                        if (strLJJJJ.equals("root_view_reuse_leak_fix")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                fixCtlOptions.enableReuseLeakFix = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -833141507:
                        if (strLJJJJ.equals("live_dialog_leak_fix")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                fixCtlOptions.enableLiveDialogLeakFix = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 181479214:
                        if (strLJJJJ.equals("enable_data_channel_leak_fix")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                fixCtlOptions.enableDataChannelLeakFix = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1590690847:
                        if (strLJJJJ.equals("enable_likeable_view_leak_opt")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                fixCtlOptions.enableLikeableViewLeakOpt = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1899743217:
                        if (strLJJJJ.equals("portrait_audience_fragment_leak_fix")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                fixCtlOptions.enablePortraitAudienceFragmentLeakFix = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
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
        return fixCtlOptions;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, FixCtlOptions fixCtlOptions) throws IOException {
        FixCtlOptions fixCtlOptions2 = fixCtlOptions;
        if (fixCtlOptions2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("live_dialog_leak_fix");
        c09dl.LJJJJJL(fixCtlOptions2.enableLiveDialogLeakFix);
        c09dl.LJIILLIIL("portrait_audience_fragment_leak_fix");
        c09dl.LJJJJJL(fixCtlOptions2.enablePortraitAudienceFragmentLeakFix);
        c09dl.LJIILLIIL("enable_likeable_view_leak_opt");
        c09dl.LJJJJJL(fixCtlOptions2.enableLikeableViewLeakOpt);
        c09dl.LJIILLIIL("enable_data_channel_leak_fix");
        c09dl.LJJJJJL(fixCtlOptions2.enableDataChannelLeakFix);
        c09dl.LJIILLIIL("root_view_reuse_leak_fix");
        c09dl.LJJJJJL(fixCtlOptions2.enableReuseLeakFix);
        c09dl.LJII();
    }
}
