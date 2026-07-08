package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes34.dex */
public final class PathAnimationValue_OptTypeAdapter extends TypeAdapter<PathAnimationValue> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final PathAnimationValue read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        PathAnimationValue pathAnimationValue = new PathAnimationValue(null, null, 1, 1, null, null, null, null, null, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1576859635:
                        if (strLJJJJ.equals("end_position")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                pathAnimationValue.endPos = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1519987610:
                        if (strLJJJJ.equals("start_position")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                pathAnimationValue.startPos = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1316467858:
                        if (strLJJJJ.equals("file_name")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                pathAnimationValue.fileName = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -81305529:
                        if (strLJJJJ.equals("channel_name")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                pathAnimationValue.channelName = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 104:
                        if (strLJJJJ.equals("h")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                pathAnimationValue.h = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 119:
                        if (strLJJJJ.equals("w")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                pathAnimationValue.w = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1209733167:
                        if (strLJJJJ.equals("total_duration")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                pathAnimationValue.totalDuration = Integer.valueOf(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1397624118:
                        if (strLJJJJ.equals("start_fly_progress")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                pathAnimationValue.startFlyProgress = Float.valueOf((float) c09cu.LJJIL());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1725522149:
                        if (strLJJJJ.equals("end_size")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                pathAnimationValue.endSize = Integer.valueOf(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 2043286877:
                        if (strLJJJJ.equals("end_fly_progress")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                pathAnimationValue.endFlyProgress = Float.valueOf((float) c09cu.LJJIL());
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
        return pathAnimationValue;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, PathAnimationValue pathAnimationValue) {
        PathAnimationValue pathAnimationValue2 = pathAnimationValue;
        if (pathAnimationValue2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("channel_name");
        c09dl.LJJJJJ(pathAnimationValue2.channelName);
        c09dl.LJIILLIIL("file_name");
        c09dl.LJJJJJ(pathAnimationValue2.fileName);
        c09dl.LJIILLIIL("w");
        c09dl.LJJJJ(Integer.valueOf(pathAnimationValue2.w));
        c09dl.LJIILLIIL("h");
        c09dl.LJJJJ(Integer.valueOf(pathAnimationValue2.h));
        c09dl.LJIILLIIL("start_position");
        c09dl.LJJJJJ(pathAnimationValue2.startPos);
        c09dl.LJIILLIIL("end_position");
        c09dl.LJJJJJ(pathAnimationValue2.endPos);
        c09dl.LJIILLIIL("end_size");
        c09dl.LJJJJ(pathAnimationValue2.endSize);
        c09dl.LJIILLIIL("start_fly_progress");
        c09dl.LJJJJ(pathAnimationValue2.startFlyProgress);
        c09dl.LJIILLIIL("end_fly_progress");
        c09dl.LJJJJ(pathAnimationValue2.endFlyProgress);
        c09dl.LJIILLIIL("total_duration");
        c09dl.LJJJJ(pathAnimationValue2.totalDuration);
        c09dl.LJII();
    }
}
