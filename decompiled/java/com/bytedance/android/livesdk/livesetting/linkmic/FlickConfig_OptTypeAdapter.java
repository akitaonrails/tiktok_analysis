package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes34.dex */
public final class FlickConfig_OptTypeAdapter extends TypeAdapter<FlickConfig> {
    public final Gson LIZ;

    public FlickConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final FlickConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        FlickConfig flickConfig = new FlickConfig(0, 10, 10800000L, false, true, false, true, true);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1511964554:
                        if (strLJJJJ.equals("opt_same_img")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                flickConfig.optSameImage = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -909675094:
                        if (strLJJJJ.equals("sample")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                flickConfig.sample = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -88528982:
                        if (strLJJJJ.equals("opt_feed")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                flickConfig.optFeed = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 29051550:
                        if (strLJJJJ.equals("cache_size")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                flickConfig.cacheSize = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 92903629:
                        if (strLJJJJ.equals("alive")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                flickConfig.alive = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 598246771:
                        if (strLJJJJ.equals("placeholder")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                flickConfig.placeholder = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1355031424:
                        if (strLJJJJ.equals("opt_room_enter")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                flickConfig.optRoomEnter = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 2014872096:
                        if (strLJJJJ.equals("skip_for_layout")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                flickConfig.shouldSkipWhenLayoutNotMatch = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
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
        return flickConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, FlickConfig flickConfig) throws IOException {
        FlickConfig flickConfig2 = flickConfig;
        if (flickConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("cache_size");
        c09dl.LJJJJ(Integer.valueOf(flickConfig2.cacheSize));
        c09dl.LJIILLIIL("sample");
        c09dl.LJJJJ(Integer.valueOf(flickConfig2.sample));
        c09dl.LJIILLIIL("alive");
        c09dl.LJJIZ(flickConfig2.alive);
        c09dl.LJIILLIIL("placeholder");
        c09dl.LJJJJJL(flickConfig2.placeholder);
        c09dl.LJIILLIIL("skip_for_layout");
        c09dl.LJJJJJL(flickConfig2.shouldSkipWhenLayoutNotMatch);
        c09dl.LJIILLIIL("opt_feed");
        c09dl.LJJJJJL(flickConfig2.optFeed);
        c09dl.LJIILLIIL("opt_room_enter");
        c09dl.LJJJJJL(flickConfig2.optRoomEnter);
        c09dl.LJIILLIIL("opt_same_img");
        c09dl.LJJJJJL(flickConfig2.optSameImage);
        c09dl.LJII();
    }
}
