package com.ss.android.ugc.aweme.aigc.asynctask.experiment.aicreation;

import X.C09CT;
import X.C0C64;
import X.C0LMI;
import X.C2097608Jq;
import X.C786410Ut5;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.aigc.asynctask.experiment.aicreation.AICreationGenerateConfigExp;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class AITheaterGenerateConfigExp {
    public static final AITheaterGenerateConfig LIZ = new AITheaterGenerateConfig(false, false, null, null, false, 0.0f, 0.0f, false, 0, 0, 0, 0, 0, 8191, null);

    public static final class AITheaterGenerateConfig extends AICreationGenerateConfigExp.AICreationGenerateConfig {

        @C09CT("disable_loading_page_lottie")
        public final boolean disableLoadingPageLottie;

        @C09CT("disable_loading_page_play_video")
        public final boolean disableLoadingPagePlayVideo;

        @C09CT("im_generate_progress_list")
        public final Map<String, Float> dmProgressList;

        @C09CT("id_generate_progress_list")
        public final Map<String, Float> idProgressList;

        @C09CT("pe_fake_progress_enable")
        public final boolean peFakeProgressEnable;

        @C09CT("pe_fake_progress_step")
        public final float peFakeProgressStep;

        @C09CT("pe_fake_progress_value")
        public final float peFakeProgressValue;

        @C09CT("polling_optimize_max_interval")
        public final long pollingOptimizeMaxInterval;

        @C09CT("polling_optimize_min_interval")
        public final long pollingOptimizeMinInterval;

        @C09CT("polling_optimize_time_edge")
        public final long pollingOptimizeTimeEdge;

        @C09CT("show_remain_time_edge")
        public final long showRemainTimeEdge;

        @C09CT("show_remain_time_enable")
        public final boolean showRemainTimeEnable;

        @C09CT("show_remain_time_min")
        public final long showRemainTimeMin;

        public AITheaterGenerateConfig() {
            this(false, false, null, null, false, 0.0f, 0.0f, false, 0L, 0L, 0L, 0L, 0L, 8191, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AITheaterGenerateConfig)) {
                return false;
            }
            AITheaterGenerateConfig aITheaterGenerateConfig = (AITheaterGenerateConfig) obj;
            return this.disableLoadingPageLottie == aITheaterGenerateConfig.disableLoadingPageLottie && this.disableLoadingPagePlayVideo == aITheaterGenerateConfig.disableLoadingPagePlayVideo && Intrinsics.LJFF(this.dmProgressList, aITheaterGenerateConfig.dmProgressList) && Intrinsics.LJFF(this.idProgressList, aITheaterGenerateConfig.idProgressList) && this.peFakeProgressEnable == aITheaterGenerateConfig.peFakeProgressEnable && Float.compare(this.peFakeProgressValue, aITheaterGenerateConfig.peFakeProgressValue) == 0 && Float.compare(this.peFakeProgressStep, aITheaterGenerateConfig.peFakeProgressStep) == 0 && this.showRemainTimeEnable == aITheaterGenerateConfig.showRemainTimeEnable && this.showRemainTimeEdge == aITheaterGenerateConfig.showRemainTimeEdge && this.showRemainTimeMin == aITheaterGenerateConfig.showRemainTimeMin && this.pollingOptimizeTimeEdge == aITheaterGenerateConfig.pollingOptimizeTimeEdge && this.pollingOptimizeMinInterval == aITheaterGenerateConfig.pollingOptimizeMinInterval && this.pollingOptimizeMaxInterval == aITheaterGenerateConfig.pollingOptimizeMaxInterval;
        }

        public final String toString() {
            return "AITheaterGenerateConfig(disableLoadingPageLottie=" + this.disableLoadingPageLottie + ", disableLoadingPagePlayVideo=" + this.disableLoadingPagePlayVideo + ", dmProgressList=" + this.dmProgressList + ", idProgressList=" + this.idProgressList + ", peFakeProgressEnable=" + this.peFakeProgressEnable + ", peFakeProgressValue=" + this.peFakeProgressValue + ", peFakeProgressStep=" + this.peFakeProgressStep + ", showRemainTimeEnable=" + this.showRemainTimeEnable + ", showRemainTimeEdge=" + this.showRemainTimeEdge + ", showRemainTimeMin=" + this.showRemainTimeMin + ", pollingOptimizeTimeEdge=" + this.pollingOptimizeTimeEdge + ", pollingOptimizeMinInterval=" + this.pollingOptimizeMinInterval + ", pollingOptimizeMaxInterval=" + this.pollingOptimizeMaxInterval + ')';
        }

        public final int hashCode() {
            return (((((((((((((((((((((((C786410Ut5.Z2(this.disableLoadingPageLottie) * 31) + C786410Ut5.Z2(this.disableLoadingPagePlayVideo)) * 31) + this.dmProgressList.hashCode()) * 31) + this.idProgressList.hashCode()) * 31) + C786410Ut5.Z2(this.peFakeProgressEnable)) * 31) + Float.floatToIntBits(this.peFakeProgressValue)) * 31) + Float.floatToIntBits(this.peFakeProgressStep)) * 31) + C786410Ut5.Z2(this.showRemainTimeEnable)) * 31) + C786410Ut5.Y2(this.showRemainTimeEdge)) * 31) + C786410Ut5.Y2(this.showRemainTimeMin)) * 31) + C786410Ut5.Y2(this.pollingOptimizeTimeEdge)) * 31) + C786410Ut5.Y2(this.pollingOptimizeMinInterval)) * 31) + C786410Ut5.Y2(this.pollingOptimizeMaxInterval);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public AITheaterGenerateConfig(boolean z, boolean z2, Map<String, Float> map, Map<String, Float> map2, boolean z3, float f, float f2, boolean z4, long j, long j2, long j3, long j4, long j5) {
            String type = C0LMI.QUOTA.getType();
            Float fValueOf = Float.valueOf(0.01f);
            super(false, 0L, C2097608Jq.LJIIIIZZ(new Pair(type, fValueOf), new Pair(C0LMI.UPLOAD.getType(), Float.valueOf(0.03f)), new Pair(C0LMI.SERVER.getType(), fValueOf), new Pair(C0LMI.POLLING.getType(), Float.valueOf(0.85f)), new Pair(C0LMI.DOWNLOAD.getType(), Float.valueOf(0.1f))), false, 0L, false, 59, null);
            this.disableLoadingPageLottie = z;
            this.disableLoadingPagePlayVideo = z2;
            this.dmProgressList = map;
            this.idProgressList = map2;
            this.peFakeProgressEnable = z3;
            this.peFakeProgressValue = f;
            this.peFakeProgressStep = f2;
            this.showRemainTimeEnable = z4;
            this.showRemainTimeEdge = j;
            this.showRemainTimeMin = j2;
            this.pollingOptimizeTimeEdge = j3;
            this.pollingOptimizeMinInterval = j4;
            this.pollingOptimizeMaxInterval = j5;
        }

        public AITheaterGenerateConfig(boolean z, boolean z2, Map map, Map map2, boolean z3, float f, float f2, boolean z4, long j, long j2, long j3, long j4, long j5, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? C2097608Jq.LJIIIIZZ(new Pair(C0LMI.QUOTA.getType(), Float.valueOf(0.05f)), new Pair(C0LMI.UPLOAD.getType(), Float.valueOf(0.2f)), new Pair(C0LMI.FAKE_DM_MESSAGE.getType(), Float.valueOf(0.05f)), new Pair(C0LMI.SERVER.getType(), Float.valueOf(0.7f))) : map, (i & 8) != 0 ? C2097608Jq.LJIIIIZZ(new Pair(C0LMI.UPLOAD.getType(), Float.valueOf(0.05f)), new Pair(C0LMI.SERVER.getType(), Float.valueOf(0.05f)), new Pair(C0LMI.POLLING.getType(), Float.valueOf(0.85f)), new Pair(C0LMI.DOWNLOAD.getType(), Float.valueOf(0.05f))) : map2, (i & 16) == 0 ? z3 : false, (i & 32) != 0 ? 0.15f : f, (i & 64) != 0 ? 0.01f : f2, (i & 128) == 0 ? z4 : true, (i & 256) != 0 ? 300L : j, (i & 512) != 0 ? 60L : j2, (i & 1024) != 0 ? -1L : j3, (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? 5L : j4, (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? 10L : j5);
        }
    }

    public static final AITheaterGenerateConfig LIZ() {
        AITheaterGenerateConfig aITheaterGenerateConfig = (AITheaterGenerateConfig) C0C64.LJIILLIIL().LJJII(AITheaterGenerateConfig.class, LIZ, "ai_theater_generate_config", true);
        return aITheaterGenerateConfig == null ? new AITheaterGenerateConfig(false, false, null, null, false, 0.0f, 0.0f, false, 0L, 0L, 0L, 0L, 0L, 8191, null) : aITheaterGenerateConfig;
    }
}
