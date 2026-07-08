package kotlin.jvm.internal;

import X.C09AY;
import X.C0LAB;
import X.C20684815ws;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes10.dex */
public class AwS10S1010000_9 extends C09AY implements Function0 {
    public final int $t;
    public String s0;
    public boolean z1;

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0078 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* bridge */ /* synthetic */ java.lang.Object invoke$0(kotlin.jvm.internal.AwS10S1010000_9 r5) throws org.json.JSONException {
        /*
            X.0NDV r0 = X.C0NDV.LIZ
            r0.getClass()
            X.0NDX r1 = X.C0NDV.LJII()
            java.lang.String r0 = r5.s0
            X.0NDe r0 = r1.LIZIZ(r0)
            r2 = 0
            if (r0 == 0) goto L14
            java.lang.String r2 = r0.LJIIZILJ
        L14:
            r4 = 0
            r1 = 1
            if (r2 == 0) goto L47
            boolean r0 = kotlin.text.a0.LJJJIL(r2)
            r0 = r0 ^ 1
            if (r0 != r1) goto L47
            if (r2 == 0) goto L47
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>(r2)
        L27:
            java.lang.String r1 = "complete"
            boolean r0 = r5.z1
            r3.put(r1, r0)
            X.0NDX r2 = X.C0NDV.LJII()
            java.lang.String r1 = r5.s0
            java.lang.String r0 = X.C786410Ut5.J3(r3)
            r2.LJIIL(r1, r0)
            boolean r0 = r5.z1
            if (r0 == 0) goto L7b
            X.0NEh r3 = X.C590570NEh.LIZ
            java.lang.String r2 = r5.s0
            monitor-enter(r3)
            if (r2 == 0) goto L78
            goto L4d
        L47:
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            goto L27
        L4d:
            int r0 = r2.length()     // Catch: java.lang.Throwable -> L75
            if (r0 == 0) goto L78
            X.0NDs r0 = X.C590420NDs.LIZ     // Catch: java.lang.Throwable -> L75
            r0.getClass()     // Catch: java.lang.Throwable -> L75
            java.lang.String r1 = X.C590420NDs.LJFF()     // Catch: java.lang.Throwable -> L75
            boolean r0 = kotlin.text.a0.LJJIIZI(r1, r2, r4)     // Catch: java.lang.Throwable -> L75
            if (r0 == 0) goto L7a
            x0 r0 = defpackage.x0.LIZ     // Catch: java.lang.Throwable -> L75
            r0.getClass()     // Catch: java.lang.Throwable -> L75
            java.lang.String r2 = defpackage.x0.LJI(r1, r2)     // Catch: java.lang.Throwable -> L75
            com.bytedance.keva.Keva r1 = X.C590420NDs.LJI()     // Catch: java.lang.Throwable -> L75
            java.lang.String r0 = "incomplete_video_group_db"
            r1.storeString(r0, r2)     // Catch: java.lang.Throwable -> L75
            goto L7a
        L75:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L78:
            monitor-exit(r3)
            goto L7b
        L7a:
            monitor-exit(r3)
        L7b:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS10S1010000_9.invoke$0(kotlin.jvm.internal.AwS10S1010000_9):java.lang.Object");
    }

    public static final Object invoke$1(AwS10S1010000_9 awS10S1010000_9) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("api_type", awS10S1010000_9.s0);
        c0lab.LIZ(awS10S1010000_9.z1 ? 1 : 0, "is_from_cache");
        C20684815ws.LJIILLIIL("tool_performance_api", c0lab.LIZ);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS10S1010000_9(String str, boolean z, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.z1 = z;
    }
}
