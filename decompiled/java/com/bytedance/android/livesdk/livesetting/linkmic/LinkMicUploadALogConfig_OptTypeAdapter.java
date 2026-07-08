package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes19.dex */
public final class LinkMicUploadALogConfig_OptTypeAdapter extends TypeAdapter<LinkMicUploadALogConfig> {
    public final Gson LIZ;

    public LinkMicUploadALogConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LinkMicUploadALogConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LinkMicUploadALogConfig linkMicUploadALogConfig = new LinkMicUploadALogConfig(null, null, null, null, null, 1, 0, 10);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1298848381:
                        if (strLJJJJ.equals("enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                linkMicUploadALogConfig.enable = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 143424988:
                        if (strLJJJJ.equals("sample_100")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                linkMicUploadALogConfig.sample100ExceptionType = (int[]) this.LIZ.LJIIJ(int[].class).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1113005268:
                        if (strLJJJJ.equals("sample_10")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                linkMicUploadALogConfig.sample10ExceptionType = (int[]) this.LIZ.LJIIJ(int[].class).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1113005392:
                        if (strLJJJJ.equals("sample_50")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                linkMicUploadALogConfig.sample50ExceptionType = (int[]) this.LIZ.LJIIJ(int[].class).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1602207074:
                        if (strLJJJJ.equals("upload_freq_threshold")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                linkMicUploadALogConfig.uploadThreshold = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1975566043:
                        if (strLJJJJ.equals("sample_0")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                linkMicUploadALogConfig.sample0ExceptionType = (int[]) this.LIZ.LJIIJ(int[].class).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1975566044:
                        if (strLJJJJ.equals("sample_1")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                linkMicUploadALogConfig.sample1ExceptionType = (int[]) this.LIZ.LJIIJ(int[].class).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 2138259816:
                        if (strLJJJJ.equals("default_sample")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                linkMicUploadALogConfig.defaultSample = c09cu.LJJIZ();
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
        return linkMicUploadALogConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LinkMicUploadALogConfig linkMicUploadALogConfig) {
        LinkMicUploadALogConfig linkMicUploadALogConfig2 = linkMicUploadALogConfig;
        if (linkMicUploadALogConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("upload_freq_threshold");
        c09dl.LJJJJ(Integer.valueOf(linkMicUploadALogConfig2.uploadThreshold));
        c09dl.LJIILLIIL("sample_0");
        TypeAdapter typeAdapterLJIIJ = this.LIZ.LJIIJ(int[].class);
        typeAdapterLJIIJ.write(c09dl, linkMicUploadALogConfig2.sample0ExceptionType);
        c09dl.LJIILLIIL("sample_1");
        typeAdapterLJIIJ.write(c09dl, linkMicUploadALogConfig2.sample1ExceptionType);
        c09dl.LJIILLIIL("sample_10");
        typeAdapterLJIIJ.write(c09dl, linkMicUploadALogConfig2.sample10ExceptionType);
        c09dl.LJIILLIIL("sample_50");
        typeAdapterLJIIJ.write(c09dl, linkMicUploadALogConfig2.sample50ExceptionType);
        c09dl.LJIILLIIL("sample_100");
        typeAdapterLJIIJ.write(c09dl, linkMicUploadALogConfig2.sample100ExceptionType);
        c09dl.LJIILLIIL("default_sample");
        c09dl.LJJJJ(Integer.valueOf(linkMicUploadALogConfig2.defaultSample));
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJ(Integer.valueOf(linkMicUploadALogConfig2.enable));
        c09dl.LJII();
    }
}
