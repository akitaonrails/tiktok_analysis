package com.bytedance.android.livesdk.livesetting.level;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.bytedance.android.livesdk.livesetting.level.LiveFansClubTextLanguageSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveFansClubTextLanguageSetting_JoinTextSizeLanguageSetting_OptTypeAdapter extends TypeAdapter<LiveFansClubTextLanguageSetting.JoinTextSizeLanguageSetting> {
    public final Gson LIZ;

    public LiveFansClubTextLanguageSetting_JoinTextSizeLanguageSetting_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveFansClubTextLanguageSetting.JoinTextSizeLanguageSetting read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveFansClubTextLanguageSetting.JoinTextSizeLanguageSetting joinTextSizeLanguageSetting = new LiveFansClubTextLanguageSetting.JoinTextSizeLanguageSetting(false, null, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1298848381) {
                    if (iHashCode != -993048376) {
                        if (iHashCode == -962840592 && strLJJJJ.equals("font_size_twelve_language")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                joinTextSizeLanguageSetting.twelveLanguages = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("font_size_ten_language")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            joinTextSizeLanguageSetting.tenLanguages = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("enable")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        joinTextSizeLanguageSetting.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return joinTextSizeLanguageSetting;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveFansClubTextLanguageSetting.JoinTextSizeLanguageSetting joinTextSizeLanguageSetting) throws IOException {
        LiveFansClubTextLanguageSetting.JoinTextSizeLanguageSetting joinTextSizeLanguageSetting2 = joinTextSizeLanguageSetting;
        if (joinTextSizeLanguageSetting2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(joinTextSizeLanguageSetting2.enable);
        c09dl.LJIILLIIL("font_size_twelve_language");
        C473040Igo.LIZLLL(this.LIZ, c09dl, joinTextSizeLanguageSetting2.twelveLanguages, String.class);
        c09dl.LJIILLIIL("font_size_ten_language");
        C473040Igo.LIZLLL(this.LIZ, c09dl, joinTextSizeLanguageSetting2.tenLanguages, String.class);
        c09dl.LJII();
    }
}
