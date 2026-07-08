package com.ss.android.ugc.aweme.topic;

import X.C09R7;
import X.C13IQ;
import X.C13LE;
import X.C1697810uHb;
import X.C2097608Jq;
import X.C613410O4d;
import X.C613440O4g;
import X.EnumC1430380nKG;
import X.InterfaceC21284718Rh;
import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes10.dex */
public final class TopicAnchorFactory implements ITopicAnchorFactory {
    public final HashMap<Integer, C13IQ<? extends InterfaceC21284718Rh>> LIZ;

    public TopicAnchorFactory() {
        HashMap<Integer, C13IQ<? extends InterfaceC21284718Rh>> map = new HashMap<>();
        this.LIZ = map;
        C2097608Jq.LJIILJJIL(C1697810uHb.LJ(new Pair(Integer.valueOf(EnumC1430380nKG.ANCHOR_BOOKTOK.getTYPE()), C13LE.LIZ(C613410O4d.class)), new Pair(Integer.valueOf(EnumC1430380nKG.ANCHOR_MOVIETOK.getTYPE()), C13LE.LIZ(C613440O4g.class))), map);
    }

    @Override // com.ss.android.ugc.aweme.topic.ITopicAnchorFactory
    public final <T extends InterfaceC21284718Rh> T LIZ(int i) {
        C13IQ<? extends InterfaceC21284718Rh> c13iq = this.LIZ.get(Integer.valueOf(i));
        if (c13iq != null) {
            return (T) C09R7.LIZ(c13iq).newInstance();
        }
        return null;
    }
}
