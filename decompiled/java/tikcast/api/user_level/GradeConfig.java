package tikcast.api.user_level;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;

/* JADX INFO: loaded from: classes18.dex */
public final class GradeConfig {

    @C09CT("barrage_effect")
    public UpgradeBarrageEffectConfig barrageEffect;

    @C09CT("blast_module")
    public BlastModule blastModule;

    @C09CT("grade_score")
    public GradeScoreRule gradeScore;

    @C09CT("show_config")
    public GradeShowConfig showConfig;

    @C09CT("upgrade_effect")
    public UpgradeEffectConfig upgradeEffect;

    /* JADX INFO: loaded from: classes.dex */
    public static final class BlastModule {

        @C09CT("ship_icon")
        public ImageModel shipIcon;

        @C09CT("jump_url")
        public String jumpUrl = "";

        @C09CT("show_id")
        public String showId = "";
    }
}
