package kotlin.jvm.internal;

import X.C09AY;
import X.C19296910eV;
import X.C20306014cs;
import X.C20694815yU;
import android.content.Context;
import com.ss.android.ugc.aweme.setting.serverpush.compose.login.PushSettingsLoginVM;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes31.dex */
public class AwS13S1310000_30 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;
    public boolean z4;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS13S1310000_30 awS13S1310000_30) {
        ((PushSettingsLoginVM) awS13S1310000_30.l1).AQ2(new C20306014cs((Context) awS13S1310000_30.l2, (C20694815yU) awS13S1310000_30.l3, awS13S1310000_30.z4, awS13S1310000_30.s0));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS13S1310000_30 awS13S1310000_30) {
        HashMap<String, Map<String, Integer>> map = C19296910eV.LIZ;
        if (map.isEmpty() || !map.containsKey(((C20694815yU) awS13S1310000_30.l1).LLJJJ.itemId) || C19296910eV.LIZ(((C20694815yU) awS13S1310000_30.l1).LLJJJ, false, 6)) {
            ((PushSettingsLoginVM) awS13S1310000_30.l2).AQ2(new C20306014cs((Context) awS13S1310000_30.l3, (C20694815yU) awS13S1310000_30.l1, awS13S1310000_30.z4, awS13S1310000_30.s0));
        }
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS13S1310000_30(android.content.Context r3, com.ss.android.ugc.aweme.setting.serverpush.compose.login.PushSettingsLoginVM r4, X.C20694815yU r5, java.lang.String r6, boolean r7, int r8) {
        /*
            r2 = this;
            r2.$t = r8
            if (r8 == 0) goto L14
            r1 = r2
            r1.l1 = r5
            r1.l2 = r4
            r1.l3 = r3
            r1.z4 = r7
            r1.s0 = r6
            r0 = 0
        L10:
            r1.<init>(r0)
            return
        L14:
            r1 = r2
            r1.l1 = r4
            r1.l2 = r3
            r1.l3 = r5
            r1.z4 = r7
            r1.s0 = r6
            r0 = 0
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS13S1310000_30.<init>(android.content.Context, com.ss.android.ugc.aweme.setting.serverpush.compose.login.PushSettingsLoginVM, X.15yU, java.lang.String, boolean, int):void");
    }
}
