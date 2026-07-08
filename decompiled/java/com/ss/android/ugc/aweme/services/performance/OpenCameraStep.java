package com.ss.android.ugc.aweme.services.performance;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes33.dex */
public final class OpenCameraStep {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ OpenCameraStep[] $VALUES;
    public final String stepName;
    public static final OpenCameraStep START_TIME = new OpenCameraStep("START_TIME", 0, "clickRecordBtn");
    public static final OpenCameraStep REAL_START = new OpenCameraStep("REAL_START", 1, "realStartActivity");
    public static final OpenCameraStep SAA_ON_CREATE_BEGIN = new OpenCameraStep("SAA_ON_CREATE_BEGIN", 2, "SAAA-OnCreate()-B");
    public static final OpenCameraStep INIT_RECORDER_BEGIN = new OpenCameraStep("INIT_RECORDER_BEGIN", 3, "Init_Recorder_B");
    public static final OpenCameraStep INIT_RECORDER_END = new OpenCameraStep("INIT_RECORDER_END", 4, "Init_Recorder_E");
    public static final OpenCameraStep SAA_ON_CREATE_END = new OpenCameraStep("SAA_ON_CREATE_END", 5, "SAAA-OnCreate()-E");
    public static final OpenCameraStep SAA_ON_START_BEGIN = new OpenCameraStep("SAA_ON_START_BEGIN", 6, "SAAA-onStart()-B");
    public static final OpenCameraStep PLAN_C_ON_ACTIVITY_CREATED_BEGIN = new OpenCameraStep("PLAN_C_ON_ACTIVITY_CREATED_BEGIN", 7, "PlanC-onActivityCreated()-B");
    public static final OpenCameraStep PLAN_C_ON_ACTIVITY_CREATED_END = new OpenCameraStep("PLAN_C_ON_ACTIVITY_CREATED_END", 8, "PlanC-onActivityCreated()-E");
    public static final OpenCameraStep SAA_ON_START_END = new OpenCameraStep("SAA_ON_START_END", 9, "SAAA-onStart()-E");
    public static final OpenCameraStep SAA_ON_RESUME_BEGIN = new OpenCameraStep("SAA_ON_RESUME_BEGIN", 10, "SAAA-onResume()-B");
    public static final OpenCameraStep SAA_ON_RESUME_END = new OpenCameraStep("SAA_ON_RESUME_END", 11, "SAAA-onResume()-E");
    public static final OpenCameraStep ANIMATION_DONE = new OpenCameraStep("ANIMATION_DONE", 12, "AnimationDone");
    public static final OpenCameraStep CAMERA_FIRST_FRAME = new OpenCameraStep("CAMERA_FIRST_FRAME", 13, "CameraFirstFrame");

    public static final /* synthetic */ OpenCameraStep[] $values() {
        return new OpenCameraStep[]{START_TIME, REAL_START, SAA_ON_CREATE_BEGIN, INIT_RECORDER_BEGIN, INIT_RECORDER_END, SAA_ON_CREATE_END, SAA_ON_START_BEGIN, PLAN_C_ON_ACTIVITY_CREATED_BEGIN, PLAN_C_ON_ACTIVITY_CREATED_END, SAA_ON_START_END, SAA_ON_RESUME_BEGIN, SAA_ON_RESUME_END, ANIMATION_DONE, CAMERA_FIRST_FRAME};
    }

    public static InterfaceC2044707zh<OpenCameraStep> getEntries() {
        return $ENTRIES;
    }

    static {
        OpenCameraStep[] openCameraStepArr$values = $values();
        $VALUES = openCameraStepArr$values;
        $ENTRIES = new C2254308sP(openCameraStepArr$values);
    }

    public static OpenCameraStep[] values() {
        return (OpenCameraStep[]) $VALUES.clone();
    }

    public final String getStepName() {
        return this.stepName;
    }

    public static OpenCameraStep valueOf(String str) {
        return (OpenCameraStep) C08FF.LIZ(OpenCameraStep.class, str);
    }

    public OpenCameraStep(String str, int i, String str2) {
        this.stepName = str2;
    }
}
