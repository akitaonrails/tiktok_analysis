package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class LiveLOPSchemaData_OptTypeAdapter extends TypeAdapter<LiveLOPSchemaData> {
    @Override // com.google.gson.TypeAdapter
    public final LiveLOPSchemaData read(C09CU c09cu) {
        LiveLOPSchemaData liveLOPSchemaData = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            liveLOPSchemaData = new LiveLOPSchemaData("sslocal://webcast_lynxview?hide_nav_bar=1&url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_fundamental_live_tools%2Fpages%2Flop-pannel%2Ftemplate.js%3Fhide_loading%3D1&should_full_screen=1&hide_status_bar=0&bdhm_bid=tiktok_live_fundamental_live_onboard_program&bdhm_pid=lop-pannel", "sslocal://webcast_lynxview_popup?url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_fundamental_live_tools%2Fpages%2Flop-pannel%2Ftemplate.js&show_loading=1&hide_nav_bar=1&height_mode=max_6&silent_load_type=2&use_live_sheet=1&launch_mode=navigate&enter_from=like_take_page_banner");
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "full_schema")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        liveLOPSchemaData.fullSchema = c09cu.LJJJZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "popup_schema")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        liveLOPSchemaData.popupSchema = c09cu.LJJJZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return liveLOPSchemaData;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveLOPSchemaData liveLOPSchemaData) {
        LiveLOPSchemaData liveLOPSchemaData2 = liveLOPSchemaData;
        if (liveLOPSchemaData2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("full_schema");
        c09dl.LJJJJJ(liveLOPSchemaData2.fullSchema);
        c09dl.LJIILLIIL("popup_schema");
        c09dl.LJJJJJ(liveLOPSchemaData2.popupSchema);
        c09dl.LJII();
    }
}
