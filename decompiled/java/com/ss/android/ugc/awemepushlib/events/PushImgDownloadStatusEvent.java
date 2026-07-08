package com.ss.android.ugc.awemepushlib.events;

import X.AbstractC207072161e;
import X.C13LE;
import X.C2097608Jq;
import X.C2805016t;
import X.EnumC814950Vy1;
import X.EnumC815370Vyh;
import X.InterfaceC1282004zy;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes14.dex */
public final class PushImgDownloadStatusEvent extends AbstractC207072161e {
    public final Map<String, C2805016t> LJII;

    public PushImgDownloadStatusEvent() {
        super("push_img_download_status");
        Class cls = Integer.TYPE;
        this.LJII = C2097608Jq.LJIIIIZZ(new Pair("img_source", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(EnumC815370Vyh.class)), AbstractC207072161e.LJ("{\"allowed\":[\"avatar\",\"common\"]}", "enum"), false)), new Pair("img_type", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), AbstractC207072161e.LJ("{}", "ordinary"), false)), new Pair("img_url", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), AbstractC207072161e.LJ("{}", "ordinary"), false)), new Pair("push_type", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), AbstractC207072161e.LJ("{}", "ordinary"), false)), new Pair("rule_id", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), AbstractC207072161e.LJ("{}", "ordinary"), false)), new Pair(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(EnumC814950Vy1.class)), AbstractC207072161e.LJ("{\"allowed\":[\"0\",\"1\"]}", "enum"), false)), new Pair("err_msg", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), AbstractC207072161e.LJ("{}", "ordinary"), false)), new Pair("fallback_used", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(cls)), AbstractC207072161e.LJ("{\"allowed\":[\"0\",\"1\"]}", "ordinary"), false)), new Pair("item_type", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), AbstractC207072161e.LJ("{}", "ordinary"), false)), new Pair("loading_duration", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(cls)), AbstractC207072161e.LJ("{}", "ordinary"), false)), new Pair("fail_reason", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), AbstractC207072161e.LJ("{}", "ordinary"), false)));
    }

    @Override // X.AbstractC207072161e
    public final Map<String, C2805016t> LIZJ() {
        return this.LJII;
    }

    @Override // X.AbstractC207072161e
    public final AbstractC207072161e LJII(InterfaceC1282004zy interfaceC1282004zy) {
        LIZ().add(interfaceC1282004zy);
        return this;
    }
}
