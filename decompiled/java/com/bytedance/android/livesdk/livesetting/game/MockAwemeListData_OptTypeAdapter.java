package com.bytedance.android.livesdk.livesetting.game;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class MockAwemeListData_OptTypeAdapter extends TypeAdapter<MockAwemeListData> {
    @Override // com.google.gson.TypeAdapter
    public final MockAwemeListData read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        MockAwemeListData mockAwemeListData = new MockAwemeListData();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "type_str")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    mockAwemeListData.typeStr = c09cu.LJJJZ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "aweme_ids_str")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    mockAwemeListData.awemeIdsStr = c09cu.LJJJZ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return mockAwemeListData;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, MockAwemeListData mockAwemeListData) {
        MockAwemeListData mockAwemeListData2 = mockAwemeListData;
        if (mockAwemeListData2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("type_str");
        c09dl.LJJJJJ(mockAwemeListData2.typeStr);
        c09dl.LJIILLIIL("aweme_ids_str");
        c09dl.LJJJJJ(mockAwemeListData2.awemeIdsStr);
        c09dl.LJII();
    }
}
