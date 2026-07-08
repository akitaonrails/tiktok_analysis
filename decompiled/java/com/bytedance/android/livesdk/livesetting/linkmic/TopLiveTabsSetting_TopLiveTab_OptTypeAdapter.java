package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.linkmic.TopLiveTabsSetting;
import com.google.gson.TypeAdapter;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class TopLiveTabsSetting_TopLiveTab_OptTypeAdapter extends TypeAdapter<TopLiveTabsSetting.TopLiveTab> {
    @Override // com.google.gson.TypeAdapter
    public final TopLiveTabsSetting.TopLiveTab read(C09CU c09cu) {
        TopLiveTabsSetting.TopLiveTab topLiveTab = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            topLiveTab = new TopLiveTabsSetting.TopLiveTab("", "");
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, FollowStatusChangeMethod.PARAM_UID)) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        topLiveTab.id = c09cu.LJJJZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "title")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        topLiveTab.title = c09cu.LJJJZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return topLiveTab;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, TopLiveTabsSetting.TopLiveTab topLiveTab) {
        TopLiveTabsSetting.TopLiveTab topLiveTab2 = topLiveTab;
        if (topLiveTab2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL(FollowStatusChangeMethod.PARAM_UID);
        c09dl.LJJJJJ(topLiveTab2.id);
        c09dl.LJIILLIIL("title");
        c09dl.LJJJJJ(topLiveTab2.title);
        c09dl.LJII();
    }
}
