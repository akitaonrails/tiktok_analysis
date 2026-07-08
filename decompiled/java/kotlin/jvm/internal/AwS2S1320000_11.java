package kotlin.jvm.internal;

import X.C09AY;
import X.C0LAB;
import X.C20684815ws;
import X.C339190DRl;
import X.C695720RQs;
import android.text.TextUtils;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.GlobalComponentData;
import com.ss.android.ugc.feed.platform.ab.ComponentMarginConfig;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes12.dex */
public class AwS2S1320000_11 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;
    public boolean z4;
    public boolean z5;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS2S1320000_11 awS2S1320000_11, Object obj) {
        String genreType;
        String genreType2;
        String aid;
        Pair pair = (Pair) obj;
        C0LAB c0lab = new C0LAB();
        Aweme aweme = (Aweme) awS2S1320000_11.l1;
        String componentKey = null;
        if (aweme != null) {
            genreType = AwemeExtKt.getGenreType(aweme);
        } else {
            genreType = null;
        }
        if (!TextUtils.isEmpty(genreType)) {
            Aweme aweme2 = (Aweme) awS2S1320000_11.l1;
            if (aweme2 != null) {
                genreType2 = AwemeExtKt.getGenreType(aweme2);
            } else {
                genreType2 = null;
            }
        } else {
            genreType2 = "video";
        }
        c0lab.LJ("genre_type", genreType2);
        Aweme aweme3 = (Aweme) awS2S1320000_11.l1;
        if (aweme3 != null) {
            aid = aweme3.getAid();
        } else {
            aid = null;
        }
        c0lab.LJ("group_id", aid);
        c0lab.LJ(Scene.SCENE_SERVICE, awS2S1320000_11.s0);
        c0lab.LIZ(((Number) pair.getFirst()).intValue(), "current_top");
        c0lab.LIZ(((Number) pair.getSecond()).intValue(), "current_bottom");
        c0lab.LIZJ(Float.valueOf(C339190DRl.LIZ(((ComponentMarginConfig) awS2S1320000_11.l2).topGap)), "target_top");
        c0lab.LIZJ(Float.valueOf(C339190DRl.LIZ(((ComponentMarginConfig) awS2S1320000_11.l2).bottomGap)), "target_bottom");
        GlobalComponentData globalComponentData = (GlobalComponentData) awS2S1320000_11.l3;
        if (globalComponentData != null) {
            componentKey = globalComponentData.getComponentKey();
        }
        c0lab.LJ("component_key", componentKey);
        c0lab.LIZJ(Float.valueOf(((Number) C695720RQs.LIZJ.getValue()).floatValue()), "display_metrics");
        c0lab.LIZ(awS2S1320000_11.z4 ? 1 : 0, "use_new_design_spacing");
        c0lab.LIZ(awS2S1320000_11.z5 ? 1 : 0, "is_last_one");
        C20684815ws.LJIILLIIL("component_unified_spacing_online_diff", c0lab.LIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS2S1320000_11 awS2S1320000_11, Object obj) {
        String genreType;
        String genreType2;
        String aid;
        Pair pair = (Pair) obj;
        C0LAB c0lab = new C0LAB();
        Aweme aweme = (Aweme) awS2S1320000_11.l1;
        String componentKey = null;
        if (aweme != null) {
            genreType = AwemeExtKt.getGenreType(aweme);
        } else {
            genreType = null;
        }
        if (!TextUtils.isEmpty(genreType)) {
            Aweme aweme2 = (Aweme) awS2S1320000_11.l1;
            if (aweme2 != null) {
                genreType2 = AwemeExtKt.getGenreType(aweme2);
            } else {
                genreType2 = null;
            }
        } else {
            genreType2 = "video";
        }
        c0lab.LJ("genre_type", genreType2);
        Aweme aweme3 = (Aweme) awS2S1320000_11.l1;
        if (aweme3 != null) {
            aid = aweme3.getAid();
        } else {
            aid = null;
        }
        c0lab.LJ("group_id", aid);
        c0lab.LJ(Scene.SCENE_SERVICE, awS2S1320000_11.s0);
        c0lab.LIZ(((Number) pair.getFirst()).intValue(), "current_top");
        c0lab.LIZ(((Number) pair.getSecond()).intValue(), "current_bottom");
        c0lab.LIZJ(Float.valueOf(C339190DRl.LIZ(((ComponentMarginConfig) awS2S1320000_11.l2).topGap)), "target_top");
        c0lab.LIZJ(Float.valueOf(C339190DRl.LIZ(((ComponentMarginConfig) awS2S1320000_11.l2).bottomGap)), "target_bottom");
        GlobalComponentData globalComponentData = (GlobalComponentData) awS2S1320000_11.l3;
        if (globalComponentData != null) {
            componentKey = globalComponentData.getComponentKey();
        }
        c0lab.LJ("component_key", componentKey);
        c0lab.LIZJ(Float.valueOf(((Number) C695720RQs.LIZJ.getValue()).floatValue()), "display_metrics");
        c0lab.LIZ(awS2S1320000_11.z4 ? 1 : 0, "use_new_design_spacing");
        c0lab.LIZ(awS2S1320000_11.z5 ? 1 : 0, "is_last_one");
        C20684815ws.LJIILLIIL("component_unified_spacing_online_diff", c0lab.LIZ);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS2S1320000_11(Aweme aweme, String str, ComponentMarginConfig componentMarginConfig, GlobalComponentData globalComponentData, boolean z, boolean z2, int i) {
        super(1);
        this.$t = i;
        this.l1 = aweme;
        this.s0 = str;
        this.l2 = componentMarginConfig;
        this.l3 = globalComponentData;
        this.z4 = z;
        this.z5 = z2;
    }
}
