package com.bytedance.android.livesdk.actionhandler.schema.handler;

import X.AbstractC2436909gl;
import X.C09CT;
import X.C1161920gLG;
import X.C15438062q;
import X.C2097908Jt;
import X.C2436109gd;
import android.content.Context;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes4.dex */
public final class BroadcastSchemaHandler extends AbstractC2436909gl<BroadcastSchemaModel> {
    public final List<String> LIZIZ = Collections.singletonList("webcast_broadcast");

    public static final class BroadcastSchemaModel extends C2436109gd {

        @C09CT("page")
        public String page = "";

        @C09CT(Scene.SCENE_SERVICE)
        public String scene = "";

        @C09CT("params")
        public String params = "";
    }

    @Override // X.AbstractC2436909gl
    public final List<String> LIZLLL() {
        return this.LIZIZ;
    }

    @Override // X.AbstractC2437009gm
    public final boolean LIZJ(Context context, C2436109gd c2436109gd, Map map) {
        BroadcastSchemaModel broadcastSchemaModel = (BroadcastSchemaModel) c2436109gd;
        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(broadcastSchemaModel.params, new String[]{"&"}, 0, 6);
        ArrayList<List> arrayList = new ArrayList();
        Iterator it2 = listLJJLIIIJILLIZJL.iterator();
        while (it2.hasNext()) {
            List listLJJLIIIJILLIZJL2 = a0.LJJLIIIJILLIZJL((String) it2.next(), new String[]{"="}, 0, 6);
            if (listLJJLIIIJILLIZJL2.size() == 2) {
                arrayList.add(listLJJLIIIJILLIZJL2);
            }
        }
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(arrayList, 10));
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        for (List list : arrayList) {
            Pair pair = new Pair(ListProtector.get(list, 0), ListProtector.get(list, 1));
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).dispatchBroadcastSchema(broadcastSchemaModel.page, broadcastSchemaModel.scene, linkedHashMap);
        return true;
    }
}
