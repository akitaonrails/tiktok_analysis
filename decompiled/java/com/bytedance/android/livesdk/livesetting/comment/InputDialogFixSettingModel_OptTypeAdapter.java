package com.bytedance.android.livesdk.livesetting.comment;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class InputDialogFixSettingModel_OptTypeAdapter extends TypeAdapter<InputDialogFixSettingModel> {
    public final Gson LIZ;

    public InputDialogFixSettingModel_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final InputDialogFixSettingModel read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        InputDialogFixSettingModel inputDialogFixSettingModel = new InputDialogFixSettingModel(false, 0L);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "enable")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    inputDialogFixSettingModel.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "delayTime")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    inputDialogFixSettingModel.delayTime = c09cu.LJJJ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return inputDialogFixSettingModel;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, InputDialogFixSettingModel inputDialogFixSettingModel) throws IOException {
        InputDialogFixSettingModel inputDialogFixSettingModel2 = inputDialogFixSettingModel;
        if (inputDialogFixSettingModel2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(inputDialogFixSettingModel2.enable);
        c09dl.LJIILLIIL("delayTime");
        c09dl.LJJIZ(inputDialogFixSettingModel2.delayTime);
        c09dl.LJII();
    }
}
