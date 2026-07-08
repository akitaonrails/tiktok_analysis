package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestAigcWallpaperPicStyleSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes16.dex */
public final class MultiGuestAigcWallpaperPicStyleSetting_PicStyleItem_OptTypeAdapter extends TypeAdapter<MultiGuestAigcWallpaperPicStyleSetting.PicStyleItem> {
    public final Gson LIZ;

    public MultiGuestAigcWallpaperPicStyleSetting_PicStyleItem_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final MultiGuestAigcWallpaperPicStyleSetting.PicStyleItem read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        MultiGuestAigcWallpaperPicStyleSetting.PicStyleItem picStyleItem = new MultiGuestAigcWallpaperPicStyleSetting.PicStyleItem(null, null, 0, false, 0L);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -988498043:
                        if (strLJJJJ.equals("picUrl")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                picStyleItem.geckoFileName = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 398301669:
                        if (strLJJJJ.equals("isSelected")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                picStyleItem.isSelected = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 747804969:
                        if (strLJJJJ.equals("position")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                picStyleItem.position = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1805110236:
                        if (strLJJJJ.equals("styleName")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                picStyleItem.styleName = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1997899696:
                        if (strLJJJJ.equals("styleVal")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                picStyleItem.styleVal = c09cu.LJJJ();
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
        return picStyleItem;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, MultiGuestAigcWallpaperPicStyleSetting.PicStyleItem picStyleItem) throws IOException {
        MultiGuestAigcWallpaperPicStyleSetting.PicStyleItem picStyleItem2 = picStyleItem;
        if (picStyleItem2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("picUrl");
        c09dl.LJJJJJ(picStyleItem2.geckoFileName);
        c09dl.LJIILLIIL("styleName");
        c09dl.LJJJJJ(picStyleItem2.styleName);
        c09dl.LJIILLIIL("position");
        c09dl.LJJJJ(Integer.valueOf(picStyleItem2.position));
        c09dl.LJIILLIIL("isSelected");
        c09dl.LJJJJJL(picStyleItem2.isSelected);
        c09dl.LJIILLIIL("styleVal");
        c09dl.LJJIZ(picStyleItem2.styleVal);
        c09dl.LJII();
    }
}
