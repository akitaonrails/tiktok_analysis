package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes19.dex */
public final class MultiGuestUploadFileManagerConfig_OptTypeAdapter extends TypeAdapter<MultiGuestUploadFileManagerConfig> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final MultiGuestUploadFileManagerConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        MultiGuestUploadFileManagerConfig multiGuestUploadFileManagerConfig = new MultiGuestUploadFileManagerConfig(2, 2, 10, 5);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1040502155:
                        if (strLJJJJ.equals("file_retry_count")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                multiGuestUploadFileManagerConfig.fileRetryCount = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -900781517:
                        if (strLJJJJ.equals("max_fail_time")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                multiGuestUploadFileManagerConfig.maxFailTime = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -222106265:
                        if (strLJJJJ.equals("rw_timeout")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                multiGuestUploadFileManagerConfig.rwTimeout = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 31590586:
                        if (strLJJJJ.equals("socket_num")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                multiGuestUploadFileManagerConfig.socketNum = c09cu.LJJIZ();
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
        return multiGuestUploadFileManagerConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, MultiGuestUploadFileManagerConfig multiGuestUploadFileManagerConfig) {
        MultiGuestUploadFileManagerConfig multiGuestUploadFileManagerConfig2 = multiGuestUploadFileManagerConfig;
        if (multiGuestUploadFileManagerConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("file_retry_count");
        c09dl.LJJJJ(Integer.valueOf(multiGuestUploadFileManagerConfig2.fileRetryCount));
        c09dl.LJIILLIIL("socket_num");
        c09dl.LJJJJ(Integer.valueOf(multiGuestUploadFileManagerConfig2.socketNum));
        c09dl.LJIILLIIL("rw_timeout");
        c09dl.LJJJJ(Integer.valueOf(multiGuestUploadFileManagerConfig2.rwTimeout));
        c09dl.LJIILLIIL("max_fail_time");
        c09dl.LJJJJ(Integer.valueOf(multiGuestUploadFileManagerConfig2.maxFailTime));
        c09dl.LJII();
    }
}
