package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicLinkInRoomInfoSettings;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class LinkMicLinkInRoomInfoSettings_Option_OptTypeAdapter extends TypeAdapter<LinkMicLinkInRoomInfoSettings.Option> {
    public final Gson LIZ;

    public LinkMicLinkInRoomInfoSettings_Option_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LinkMicLinkInRoomInfoSettings.Option read(C09CU c09cu) {
        LinkMicLinkInRoomInfoSettings.Option option = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            option = new LinkMicLinkInRoomInfoSettings.Option(false, true);
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "set_is_progress_0")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        option.isInProgress_0 = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "rtc_jonined_channel_0")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        option.rtcJoninedChannel_0 = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return option;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LinkMicLinkInRoomInfoSettings.Option option) throws IOException {
        LinkMicLinkInRoomInfoSettings.Option option2 = option;
        if (option2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("set_is_progress_0");
        c09dl.LJJJJJL(option2.isInProgress_0);
        c09dl.LJIILLIIL("rtc_jonined_channel_0");
        c09dl.LJJJJJL(option2.rtcJoninedChannel_0);
        c09dl.LJII();
    }
}
