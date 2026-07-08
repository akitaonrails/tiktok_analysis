package com.bytedance.android.livesdk.actionhandler.schema.handler;

import X.AbstractC2436909gl;
import X.C09CT;
import X.C2436109gd;
import android.content.Context;
import com.bytedance.android.livesdk.dataChannel.OpenExtendedScreenChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveOpenExtendedScreenHandler extends AbstractC2436909gl<Model> {

    public static final class Model extends C2436109gd {

        @C09CT("from")
        public String from;
    }

    @Override // X.AbstractC2436909gl
    public final List<String> LIZLLL() {
        return Collections.singletonList("webcast_open_negative_screen");
    }

    @Override // X.AbstractC2437009gm
    public final boolean LIZJ(Context context, C2436109gd c2436109gd, Map map) {
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        String str = ((Model) c2436109gd).from;
        if (str == null) {
            str = "";
        }
        dataChannelGlobal.FQ2(OpenExtendedScreenChannel.class, str);
        return true;
    }
}
