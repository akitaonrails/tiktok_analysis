package com.ss.android.ugc.aweme.base;

import X.C793770VBv;
import X.C794240VDq;
import com.ss.android.ugc.aweme.api.ITerminalMonitorService;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public final class TerminalMonitorService implements ITerminalMonitorService {
    @Override // com.ss.android.ugc.aweme.api.ITerminalMonitorService
    public final void LIZ(JSONObject jSONObject) {
        Intrinsics.LJFF("aweme_image_load_log", "aweme_image_load_log");
        Intrinsics.LJFF("image_error", "image_error");
        C794240VDq.LIZIZ("aweme_image_load_log", "image_error", jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.api.ITerminalMonitorService
    public final void LIZIZ(float f) {
        Intrinsics.LJFF("aweme_image_load", "aweme_image_load");
        String str = "load_time";
        if (!Intrinsics.LJFF("load_time", "load_time") && Intrinsics.LJFF("load_time", "download_time")) {
            str = "download_time";
        }
        C794240VDq.LJ("aweme_image_load", str, f);
    }

    @Override // com.ss.android.ugc.aweme.api.ITerminalMonitorService
    public final void LIZJ(String str, float f) {
        Intrinsics.LJFF("aweme_feed_load_more_duration", "aweme_feed_load_more_duration");
        C794240VDq.LJFF("aweme_feed_load_more_duration", str, f);
    }

    @Override // com.ss.android.ugc.aweme.api.ITerminalMonitorService
    public final void LIZLLL(int i, JSONObject jSONObject) {
        Intrinsics.LJFF("aweme_image_load_error_rate", "aweme_image_load_error_rate");
        if (i == 0) {
            i = 0;
        }
        CopyOnWriteArrayList<Runnable> copyOnWriteArrayList = C794240VDq.LIZ;
        C793770VBv.LJIIJJI("aweme_image_load_error_rate", i, jSONObject);
    }
}
