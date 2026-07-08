package com.ss.android.ugc.aweme.tools.draft.monitor;

import X.AbstractC1387200mCc;
import X.C09CT;
import X.C1397950mTx;
import X.C1906580ziK;
import X.C570430MYv;
import android.app.Activity;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.ICreativeSAAService;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes9.dex */
public final class DraftOperationEvent {

    @C09CT("activity")
    public final String activityName;

    @C09CT("errorCode")
    public final int errorCode;

    @C09CT("errorMsg")
    public final String errorMsg;

    @C09CT("event")
    public final String eventName;

    @C09CT(Scene.SCENE_SERVICE)
    public final String eventScene;

    @C09CT("params")
    public final C570430MYv params;

    @C09CT("platform")
    public final int platform;

    @C09CT("uniqueId")
    public final String uniqueId;

    @C09CT("utcTime")
    public final String utcTime;

    @C09CT("version")
    public final String version;

    public DraftOperationEvent(String str, String str2, String str3, int i, String str4, String str5, int i2, String str6, C570430MYv c570430MYv, String str7) {
        this.version = str;
        this.eventName = str2;
        this.uniqueId = str3;
        this.platform = i;
        this.utcTime = str4;
        this.eventScene = str5;
        this.errorCode = i2;
        this.errorMsg = str6;
        this.params = c570430MYv;
        this.activityName = str7;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DraftOperationEvent(String str, String str2, String str3, int i, String str4, String str5, int i2, String str6, C570430MYv c570430MYv, String str7, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        int i4 = i2;
        String str8 = str6;
        String str9 = str3;
        int i5 = i;
        String str10 = (i3 & 1) != 0 ? "1.0" : str;
        String simpleName = "";
        str9 = (i3 & 4) != 0 ? "" : str9;
        i5 = (i3 & 8) != 0 ? 2 : i5;
        i4 = (i3 & 64) != 0 ? 0 : i4;
        str8 = (i3 & 128) != 0 ? null : str8;
        C570430MYv c570430MYv2 = (i3 & 256) == 0 ? c570430MYv : null;
        if ((i3 & 512) != 0) {
            AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
            if (abstractC1387200mCcLJ != null) {
                if (!(abstractC1387200mCcLJ instanceof C1397950mTx)) {
                    simpleName = abstractC1387200mCcLJ.LIZ.toString();
                } else {
                    Activity activity = ((C1397950mTx) abstractC1387200mCcLJ).LIZLLL;
                    ICreativeSAAService iCreativeSAAService = (ICreativeSAAService) ServiceManager.get().getService(ICreativeSAAService.class);
                    if (!iCreativeSAAService.isSAAActivity(activity)) {
                        simpleName = activity.getClass().getSimpleName();
                    } else {
                        Scene currentScene = iCreativeSAAService.getCurrentScene(activity);
                        if (currentScene != null) {
                            simpleName = currentScene.getClass().getSimpleName();
                        }
                    }
                }
            }
        } else {
            simpleName = str7;
        }
        this(str10, str2, str9, i5, str4, str5, i4, str8, c570430MYv2, simpleName);
    }
}
