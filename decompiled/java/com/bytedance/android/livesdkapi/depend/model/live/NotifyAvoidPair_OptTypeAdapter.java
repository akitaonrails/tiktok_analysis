package com.bytedance.android.livesdkapi.depend.model.live;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class NotifyAvoidPair_OptTypeAdapter extends TypeAdapter<NotifyAvoidPair> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final NotifyAvoidPair read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        NotifyAvoidPair notifyAvoidPair = new NotifyAvoidPair();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1582068845:
                        if (strLJJJJ.equals("after_feature")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                notifyAvoidPair.afterFeature = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -477450770:
                        if (strLJJJJ.equals("avoid_time_gap")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                notifyAvoidPair.avoidTimeGap = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -406077875:
                        if (strLJJJJ.equals("last_feature")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                notifyAvoidPair.lastFeature = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 339542830:
                        if (strLJJJJ.equals("user_type")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                notifyAvoidPair.userType = c09cu.LJJIZ();
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
        return notifyAvoidPair;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, NotifyAvoidPair notifyAvoidPair) throws IOException {
        NotifyAvoidPair notifyAvoidPair2 = notifyAvoidPair;
        if (notifyAvoidPair2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("after_feature");
        c09dl.LJJJJ(Integer.valueOf(notifyAvoidPair2.afterFeature));
        c09dl.LJIILLIIL("avoid_time_gap");
        c09dl.LJJIZ(notifyAvoidPair2.avoidTimeGap);
        c09dl.LJIILLIIL("last_feature");
        c09dl.LJJJJ(Integer.valueOf(notifyAvoidPair2.lastFeature));
        c09dl.LJIILLIIL("user_type");
        c09dl.LJJJJ(Integer.valueOf(notifyAvoidPair2.userType));
        c09dl.LJII();
    }
}
