package com.ss.android.ugc.aweme.poi.videopublish.eventtrack.event;

import X.AbstractC207072161e;
import X.C13LE;
import X.C2097608Jq;
import X.C2805016t;
import X.InterfaceC1282004zy;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiRecommendationShowAlEvent extends AbstractC207072161e {
    public final Map<String, C2805016t> LJII;

    public PoiRecommendationShowAlEvent() {
        super("poi_recommendation_show_al");
        Class cls = Integer.TYPE;
        this.LJII = C2097608Jq.LJIIIIZZ(new Pair("content_type", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), null, false)), new Pair("creation_id", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), null, false)), new Pair("enable_location", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(cls)), null, false)), new Pair("enter_from", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), null, false)), new Pair("fake_mining_grade", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), null, false)), new Pair("inapp_is_precise", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(cls)), null, false)), new Pair("index", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(cls)), null, false)), new Pair("is_location_app_permission", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(cls)), null, false)), new Pair("is_location_system_permission", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(cls)), null, false)), new Pair("is_tt_key_category", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(cls)), null, false)), new Pair("log_id", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), null, false)), new Pair("poi_detail_type", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), null, false)), new Pair("poi_id", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), null, false)), new Pair("poi_type_code", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), null, false)), new Pair("recall_source", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), null, false)), new Pair("shoot_way", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), null, false)), new Pair("system_is_precise", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(cls)), null, false)), new Pair("tt_poi_type_name_level0", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), null, false)), new Pair("tt_type_code", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), null, false)));
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
