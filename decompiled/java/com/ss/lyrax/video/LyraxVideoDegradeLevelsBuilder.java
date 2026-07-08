package com.ss.lyrax.video;

import X.C08FF;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.n;
import com.ss.lyrax.video.LyraxVideoEncoderProfile;
import java.util.ArrayList;
import java.util.List;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxVideoDegradeLevelsBuilder {
    public int fps;
    public String gearIdentifier;
    public int height;
    public n netDegradePaths;
    public n perfDegradePaths;
    public int width;

    public LyraxVideoEncoderProfile.VideoDegradeLevels build() {
        LyraxVideoEncoderProfile.VideoDegradeLevels videoDegradeLevels = new LyraxVideoEncoderProfile.VideoDegradeLevels();
        List<LyraxVideoDegradeConfig> listBuildDegradePath = buildDegradePath(VideoDegradeLevelsType.PERF);
        List<LyraxVideoDegradeConfig> listBuildDegradePath2 = buildDegradePath(VideoDegradeLevelsType.NET);
        if (listBuildDegradePath != null) {
            videoDegradeLevels.perf = listBuildDegradePath;
        }
        if (listBuildDegradePath2 != null) {
            videoDegradeLevels.f441net = listBuildDegradePath2;
        }
        return videoDegradeLevels;
    }

    public enum VideoDegradeLevelsType {
        PERF,
        NET;

        public static VideoDegradeLevelsType valueOf(String str) {
            return (VideoDegradeLevelsType) C08FF.LIZ(VideoDegradeLevelsType.class, str);
        }
    }

    private List<LyraxVideoDegradeConfig> buildDegradePath(VideoDegradeLevelsType videoDegradeLevelsType) {
        n nVar;
        String str;
        h hVarLJJIIZI;
        int i;
        VideoDegradeLevelsType videoDegradeLevelsType2 = VideoDegradeLevelsType.PERF;
        if (videoDegradeLevelsType == videoDegradeLevelsType2) {
            nVar = this.perfDegradePaths;
        } else {
            nVar = this.netDegradePaths;
        }
        if (nVar != null && (str = this.gearIdentifier) != null && nVar.LJJIJIIJIL(str)) {
            k kVarLJJIIZ = nVar.LJJIIZ(this.gearIdentifier);
            kVarLJJIIZ.getClass();
            if (!(kVarLJJIIZ instanceof h) || (hVarLJJIIZI = nVar.LJJIIZI(this.gearIdentifier)) == null) {
                return null;
            }
            if (videoDegradeLevelsType == videoDegradeLevelsType2) {
                i = 3;
            } else {
                i = 5;
            }
            int i2 = this.width * this.height;
            for (int i3 = 0; i3 < hVarLJJIIZI.size(); i3++) {
                k kVarLJJIIJZLJL = hVarLJJIIZI.LJJIIJZLJL(i3);
                kVarLJJIIJZLJL.getClass();
                if (kVarLJJIIJZLJL instanceof h) {
                    h hVarLJIIL = hVarLJJIIZI.LJJIIJZLJL(i3).LJIIL();
                    if (hVarLJIIL.size() > 0) {
                        k kVarLJJIIJZLJL2 = hVarLJIIL.LJJIIJZLJL(0);
                        kVarLJJIIJZLJL2.getClass();
                        if (kVarLJJIIJZLJL2 instanceof h) {
                            h hVarLJIIL2 = hVarLJIIL.LJJIIJZLJL(0).LJIIL();
                            if (hVarLJIIL2.size() >= i) {
                                int iLJIIJJI = hVarLJIIL2.LJJIIJZLJL(0).LJIIJJI();
                                int iLJIIJJI2 = hVarLJIIL2.LJJIIJZLJL(1).LJIIJJI();
                                int iLJIIJJI3 = hVarLJIIL2.LJJIIJZLJL(2).LJIIJJI();
                                if (iLJIIJJI * iLJIIJJI2 == i2 && iLJIIJJI3 == this.fps) {
                                    ArrayList arrayList = new ArrayList();
                                    for (int i4 = 0; i4 < hVarLJIIL.size(); i4++) {
                                        k kVarLJJIIJZLJL3 = hVarLJIIL.LJJIIJZLJL(i4);
                                        kVarLJJIIJZLJL3.getClass();
                                        if (kVarLJJIIJZLJL3 instanceof h) {
                                            h hVarLJIIL3 = hVarLJIIL.LJJIIJZLJL(i4).LJIIL();
                                            if (hVarLJIIL3.size() >= i) {
                                                LyraxVideoDegradeConfig lyraxVideoDegradeConfig = new LyraxVideoDegradeConfig();
                                                lyraxVideoDegradeConfig.width = hVarLJIIL3.LJJIIJZLJL(0).LJIIJJI();
                                                lyraxVideoDegradeConfig.height = hVarLJIIL3.LJJIIJZLJL(1).LJIIJJI();
                                                lyraxVideoDegradeConfig.framerate = hVarLJIIL3.LJJIIJZLJL(2).LJIIJJI();
                                                if (videoDegradeLevelsType == VideoDegradeLevelsType.NET) {
                                                    lyraxVideoDegradeConfig.upThresholdKbps = hVarLJIIL3.LJJIIJZLJL(3).LJIIJJI();
                                                    lyraxVideoDegradeConfig.downThresholdKbps = hVarLJIIL3.LJJIIJZLJL(4).LJIIJJI();
                                                } else {
                                                    lyraxVideoDegradeConfig.upThresholdKbps = -1;
                                                    lyraxVideoDegradeConfig.downThresholdKbps = -1;
                                                }
                                                arrayList.add(lyraxVideoDegradeConfig);
                                            }
                                        }
                                    }
                                    return arrayList;
                                }
                            } else {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    private String listToString(List<LyraxVideoDegradeConfig> list) {
        if (list == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder(e3.e);
        for (int i = 0; i < list.size(); i++) {
            LyraxVideoDegradeConfig lyraxVideoDegradeConfig = (LyraxVideoDegradeConfig) ListProtector.get(list, i);
            sb.append("{w=");
            sb.append(lyraxVideoDegradeConfig.width);
            sb.append(",h=");
            sb.append(lyraxVideoDegradeConfig.height);
            sb.append(",fps=");
            sb.append(lyraxVideoDegradeConfig.framerate);
            sb.append(",up=");
            sb.append(lyraxVideoDegradeConfig.upThresholdKbps);
            sb.append(",down=");
            sb.append(lyraxVideoDegradeConfig.downThresholdKbps);
            sb.append("}");
            if (i < list.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append(e3.f);
        return sb.toString();
    }

    public LyraxVideoDegradeLevelsBuilder setGearIdentifier(String str) {
        this.gearIdentifier = str;
        return this;
    }

    public LyraxVideoDegradeLevelsBuilder setNetDegradePaths(n nVar) {
        this.netDegradePaths = nVar;
        return this;
    }

    public LyraxVideoDegradeLevelsBuilder setPerfDegradePaths(n nVar) {
        this.perfDegradePaths = nVar;
        return this;
    }

    public LyraxVideoDegradeLevelsBuilder setVideoParams(int i, int i2, int i3) {
        this.width = i;
        this.height = i2;
        this.fps = i3;
        return this;
    }
}
