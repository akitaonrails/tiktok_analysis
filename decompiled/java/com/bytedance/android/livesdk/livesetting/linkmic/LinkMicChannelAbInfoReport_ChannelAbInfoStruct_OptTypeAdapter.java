package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicChannelAbInfoReport;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class LinkMicChannelAbInfoReport_ChannelAbInfoStruct_OptTypeAdapter extends TypeAdapter<LinkMicChannelAbInfoReport.ChannelAbInfoStruct> {
    public final Gson LIZ;

    public LinkMicChannelAbInfoReport_ChannelAbInfoStruct_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LinkMicChannelAbInfoReport.ChannelAbInfoStruct read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LinkMicChannelAbInfoReport.ChannelAbInfoStruct channelAbInfoStruct = new LinkMicChannelAbInfoReport.ChannelAbInfoStruct(null, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "2")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    channelAbInfoStruct.multiHostList = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "4")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    channelAbInfoStruct.multiGuestList = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return channelAbInfoStruct;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LinkMicChannelAbInfoReport.ChannelAbInfoStruct channelAbInfoStruct) {
        LinkMicChannelAbInfoReport.ChannelAbInfoStruct channelAbInfoStruct2 = channelAbInfoStruct;
        if (channelAbInfoStruct2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("2");
        C473040Igo.LIZLLL(this.LIZ, c09dl, channelAbInfoStruct2.multiHostList, String.class);
        c09dl.LJIILLIIL("4");
        C473040Igo.LIZLLL(this.LIZ, c09dl, channelAbInfoStruct2.multiGuestList, String.class);
        c09dl.LJII();
    }
}
