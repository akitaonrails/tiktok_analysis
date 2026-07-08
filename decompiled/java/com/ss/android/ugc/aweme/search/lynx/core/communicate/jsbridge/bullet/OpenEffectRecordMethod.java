package com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.bullet;

import X.C1051660dTQ;
import X.C663340Q0e;
import X.C681260Qns;
import X.EnumC1051570dTH;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;

/* JADX INFO: loaded from: classes11.dex */
public final class OpenEffectRecordMethod extends BaseBridgeMethod {
    public EnumC1051570dTH access;
    public final C663340Q0e helper;
    public final String name;
    public static final C681260Qns Companion = new Object() { // from class: X.0Qns
    };
    public static final int $stable = 8;

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.AbstractC1051750dTZ, X.InterfaceC1051460dT6
    public EnumC1051570dTH getAccess() {
        return this.access;
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, com.bytedance.ies.bullet.ui.common.bridge.ContainerBridgeMethod, X.InterfaceC1051460dT6
    public String getName() {
        return this.name;
    }

    public OpenEffectRecordMethod(C1051660dTQ c1051660dTQ) {
        super(c1051660dTQ);
        this.name = "open_effect_record";
        this.access = EnumC1051570dTH.PRIVATE;
        this.helper = new C663340Q0e(c1051660dTQ, getName());
    }

    @Override // X.AbstractC1051750dTZ
    public void setAccess(EnumC1051570dTH enumC1051570dTH) {
        this.access = enumC1051570dTH;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00df A[Catch: Exception -> 0x01e8, TryCatch #0 {Exception -> 0x01e8, blocks: (B:9:0x0035, B:10:0x0070, B:12:0x0076, B:13:0x0084, B:15:0x00bc, B:16:0x00c2, B:18:0x00c6, B:20:0x00d0, B:22:0x00d6, B:24:0x00df, B:25:0x00f4, B:27:0x00ff, B:28:0x0101, B:69:0x01ac, B:32:0x0141, B:34:0x014b, B:36:0x0159, B:39:0x015e, B:41:0x0162, B:44:0x016b, B:46:0x0171, B:48:0x0177, B:49:0x017b, B:51:0x0181, B:60:0x0195, B:62:0x0199, B:63:0x019d, B:55:0x0188, B:57:0x018c), top: B:79:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ff A[Catch: Exception -> 0x01e8, TryCatch #0 {Exception -> 0x01e8, blocks: (B:9:0x0035, B:10:0x0070, B:12:0x0076, B:13:0x0084, B:15:0x00bc, B:16:0x00c2, B:18:0x00c6, B:20:0x00d0, B:22:0x00d6, B:24:0x00df, B:25:0x00f4, B:27:0x00ff, B:28:0x0101, B:69:0x01ac, B:32:0x0141, B:34:0x014b, B:36:0x0159, B:39:0x015e, B:41:0x0162, B:44:0x016b, B:46:0x0171, B:48:0x0177, B:49:0x017b, B:51:0x0181, B:60:0x0195, B:62:0x0199, B:63:0x019d, B:55:0x0188, B:57:0x018c), top: B:79:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x016b A[Catch: Exception -> 0x01e8, TryCatch #0 {Exception -> 0x01e8, blocks: (B:9:0x0035, B:10:0x0070, B:12:0x0076, B:13:0x0084, B:15:0x00bc, B:16:0x00c2, B:18:0x00c6, B:20:0x00d0, B:22:0x00d6, B:24:0x00df, B:25:0x00f4, B:27:0x00ff, B:28:0x0101, B:69:0x01ac, B:32:0x0141, B:34:0x014b, B:36:0x0159, B:39:0x015e, B:41:0x0162, B:44:0x016b, B:46:0x0171, B:48:0x0177, B:49:0x017b, B:51:0x0181, B:60:0x0195, B:62:0x0199, B:63:0x019d, B:55:0x0188, B:57:0x018c), top: B:79:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01a4 A[EDGE_INSN: B:66:0x01a4->B:22:0x00d6 BREAK  A[LOOP:1: B:60:0x0195->B:65:0x01a3]] */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[SYNTHETIC] */
    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void handle(org.json.JSONObject r29, X.InterfaceC1019840ce6 r30) {
        /*
            Method dump skipped, instruction units count: 501
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.bullet.OpenEffectRecordMethod.handle(org.json.JSONObject, X.0ce6):void");
    }
}
