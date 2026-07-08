package com.bytedance.android.livesdk.actionhandler.schema.handler;

import X.AbstractC2436909gl;
import X.C098200Yq;
import X.C09CT;
import X.C1161920gLG;
import X.C189200o6;
import X.C2436109gd;
import android.content.Context;
import android.net.Uri;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.a;
import com.google.gson.b;
import com.google.gson.e;
import com.google.gson.reflect.TypeToken;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class LiveAiSummaryDescriptionDialogHandler extends AbstractC2436909gl<SummarySchemaModel> {
    public final List<String> LIZIZ = Collections.singletonList("live_ai_summary");

    public static final class SummarySchemaModel extends C2436109gd {

        @C09CT("anchor_id")
        public String anchorId = "";

        @C09CT("room_id")
        public String roomId = "";

        @C09CT("enter_from_merge")
        public String enterFromMerge = "";

        @C09CT("enter_method")
        public String enterMethod = "";

        @C09CT("action_type")
        public String actionType = "";

        @C09CT("ai_summary_content")
        public String aiSummaryContent = "";

        @C09CT("result_key")
        public String resultKey = "";
    }

    @Override // X.AbstractC2436909gl
    public final List<String> LIZLLL() {
        return this.LIZIZ;
    }

    @Override // X.AbstractC2437009gm
    public final boolean LIZJ(Context context, C2436109gd c2436109gd, Map map) {
        String path;
        Object c098200Yq;
        Uri uri = c2436109gd.LIZ;
        Object obj = null;
        if (uri != null) {
            path = uri.getPath();
        } else {
            path = null;
        }
        if (Intrinsics.LJFF("/description_dialog", path)) {
            e eVar = new e();
            eVar.LJ(new a() { // from class: X.09Dz
                @Override // com.google.gson.a
                public final boolean shouldSkipClass(Class<?> cls) {
                    return false;
                }

                @Override // com.google.gson.a
                public final boolean shouldSkipField(b bVar) {
                    return !Intrinsics.LJFF(String.class, bVar.LIZ.getType());
                }
            });
            Gson gsonLIZ = eVar.LIZ();
            try {
                c098200Yq = (Map) gsonLIZ.LJIIIIZZ(gsonLIZ.LJIILL(c2436109gd), new TypeToken<Map<String, ? extends String>>() { // from class: X.04X8
                }.getType());
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                obj = c098200Yq;
            }
            Map<String, String> linkedHashMap = (Map) obj;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap<>();
            }
            ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).openAiSummaryDescDialog(context, linkedHashMap);
        }
        return true;
    }
}
