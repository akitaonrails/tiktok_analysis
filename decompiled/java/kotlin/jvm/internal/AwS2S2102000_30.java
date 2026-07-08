package kotlin.jvm.internal;

import X.AbstractC20187113yn;
import X.C09AY;
import X.C189200o6;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes31.dex */
public class AwS2S2102000_30 extends C09AY implements Function0 {
    public final int $t;
    public int i3;
    public int i4;
    public Object l2;
    public String s0;
    public String s1;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0097 A[Catch: all -> 0x0155, TRY_ENTER, TryCatch #0 {all -> 0x0155, blocks: (B:3:0x0023, B:5:0x0033, B:10:0x0043, B:12:0x004f, B:14:0x0053, B:17:0x0062, B:20:0x0069, B:25:0x0070, B:27:0x007b, B:29:0x0087, B:38:0x0097, B:42:0x00ca, B:44:0x00ce, B:46:0x00d4, B:48:0x00dd, B:50:0x00eb, B:51:0x00ed, B:53:0x00f4, B:54:0x00f6, B:56:0x00fd, B:57:0x00ff, B:59:0x0106, B:60:0x0108, B:62:0x010f, B:63:0x0111, B:39:0x00a5, B:41:0x00ab, B:13:0x0051, B:47:0x00d7), top: B:72:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00dd A[Catch: all -> 0x0155, TryCatch #0 {all -> 0x0155, blocks: (B:3:0x0023, B:5:0x0033, B:10:0x0043, B:12:0x004f, B:14:0x0053, B:17:0x0062, B:20:0x0069, B:25:0x0070, B:27:0x007b, B:29:0x0087, B:38:0x0097, B:42:0x00ca, B:44:0x00ce, B:46:0x00d4, B:48:0x00dd, B:50:0x00eb, B:51:0x00ed, B:53:0x00f4, B:54:0x00f6, B:56:0x00fd, B:57:0x00ff, B:59:0x0106, B:60:0x0108, B:62:0x010f, B:63:0x0111, B:39:0x00a5, B:41:0x00ab, B:13:0x0051, B:47:0x00d7), top: B:72:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00eb A[Catch: all -> 0x0155, TryCatch #0 {all -> 0x0155, blocks: (B:3:0x0023, B:5:0x0033, B:10:0x0043, B:12:0x004f, B:14:0x0053, B:17:0x0062, B:20:0x0069, B:25:0x0070, B:27:0x007b, B:29:0x0087, B:38:0x0097, B:42:0x00ca, B:44:0x00ce, B:46:0x00d4, B:48:0x00dd, B:50:0x00eb, B:51:0x00ed, B:53:0x00f4, B:54:0x00f6, B:56:0x00fd, B:57:0x00ff, B:59:0x0106, B:60:0x0108, B:62:0x010f, B:63:0x0111, B:39:0x00a5, B:41:0x00ab, B:13:0x0051, B:47:0x00d7), top: B:72:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f4 A[Catch: all -> 0x0155, TryCatch #0 {all -> 0x0155, blocks: (B:3:0x0023, B:5:0x0033, B:10:0x0043, B:12:0x004f, B:14:0x0053, B:17:0x0062, B:20:0x0069, B:25:0x0070, B:27:0x007b, B:29:0x0087, B:38:0x0097, B:42:0x00ca, B:44:0x00ce, B:46:0x00d4, B:48:0x00dd, B:50:0x00eb, B:51:0x00ed, B:53:0x00f4, B:54:0x00f6, B:56:0x00fd, B:57:0x00ff, B:59:0x0106, B:60:0x0108, B:62:0x010f, B:63:0x0111, B:39:0x00a5, B:41:0x00ab, B:13:0x0051, B:47:0x00d7), top: B:72:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00fd A[Catch: all -> 0x0155, TryCatch #0 {all -> 0x0155, blocks: (B:3:0x0023, B:5:0x0033, B:10:0x0043, B:12:0x004f, B:14:0x0053, B:17:0x0062, B:20:0x0069, B:25:0x0070, B:27:0x007b, B:29:0x0087, B:38:0x0097, B:42:0x00ca, B:44:0x00ce, B:46:0x00d4, B:48:0x00dd, B:50:0x00eb, B:51:0x00ed, B:53:0x00f4, B:54:0x00f6, B:56:0x00fd, B:57:0x00ff, B:59:0x0106, B:60:0x0108, B:62:0x010f, B:63:0x0111, B:39:0x00a5, B:41:0x00ab, B:13:0x0051, B:47:0x00d7), top: B:72:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0106 A[Catch: all -> 0x0155, TryCatch #0 {all -> 0x0155, blocks: (B:3:0x0023, B:5:0x0033, B:10:0x0043, B:12:0x004f, B:14:0x0053, B:17:0x0062, B:20:0x0069, B:25:0x0070, B:27:0x007b, B:29:0x0087, B:38:0x0097, B:42:0x00ca, B:44:0x00ce, B:46:0x00d4, B:48:0x00dd, B:50:0x00eb, B:51:0x00ed, B:53:0x00f4, B:54:0x00f6, B:56:0x00fd, B:57:0x00ff, B:59:0x0106, B:60:0x0108, B:62:0x010f, B:63:0x0111, B:39:0x00a5, B:41:0x00ab, B:13:0x0051, B:47:0x00d7), top: B:72:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x010f A[Catch: all -> 0x0155, TryCatch #0 {all -> 0x0155, blocks: (B:3:0x0023, B:5:0x0033, B:10:0x0043, B:12:0x004f, B:14:0x0053, B:17:0x0062, B:20:0x0069, B:25:0x0070, B:27:0x007b, B:29:0x0087, B:38:0x0097, B:42:0x00ca, B:44:0x00ce, B:46:0x00d4, B:48:0x00dd, B:50:0x00eb, B:51:0x00ed, B:53:0x00f4, B:54:0x00f6, B:56:0x00fd, B:57:0x00ff, B:59:0x0106, B:60:0x0108, B:62:0x010f, B:63:0x0111, B:39:0x00a5, B:41:0x00ab, B:13:0x0051, B:47:0x00d7), top: B:72:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0152  */
    /* JADX WARN: Type inference failed for: r0v17, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r2v4, types: [T, com.ss.bduploader.BDImageXUploader, com.ss.bduploader.BDImageXUploaderBase] */
    /* JADX INFO: renamed from: invoke-d1pmJ48$0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m358invoked1pmJ48$0() {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS2S2102000_30.m358invoked1pmJ48$0():java.lang.Object");
    }

    public static final Object invoke$0(AwS2S2102000_30 awS2S2102000_30) {
        ((AbstractC20187113yn) awS2S2102000_30.l2).LIZIZ(awS2S2102000_30.s0, awS2S2102000_30.i3, awS2S2102000_30.i4, awS2S2102000_30.s1);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS2S2102000_30 awS2S2102000_30) {
        AbstractC20187113yn abstractC20187113yn = (AbstractC20187113yn) awS2S2102000_30.l2;
        if (abstractC20187113yn != null) {
            abstractC20187113yn.LIZIZ(awS2S2102000_30.s0, awS2S2102000_30.i3, awS2S2102000_30.i4, awS2S2102000_30.s1);
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$2(AwS2S2102000_30 awS2S2102000_30) {
        return C189200o6.m1boximpl(awS2S2102000_30.m358invoked1pmJ48$0());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS2S2102000_30(AbstractC20187113yn abstractC20187113yn, String str, int i, int i2, String str2, int i3) {
        super(0);
        this.$t = i3;
        this.l2 = abstractC20187113yn;
        this.s0 = str;
        this.i3 = i;
        this.i4 = i2;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS2S2102000_30(String str, String str2, Function2<? super String, ? super String, Unit> function2, String str3, int i, int i2) {
        super(0);
        this.$t = i2;
        this.s0 = str;
        this.l2 = str2;
        this.s1 = function2;
        this.i3 = str3;
        this.i4 = i;
    }
}
