package kotlin.jvm.internal;

import X.C09AY;
import X.C1358700lSe;
import X.C1358880lSw;
import X.C1358940lT2;
import X.C1623606Xi;
import X.C19EG;
import X.C291001Au;
import X.C333801Rg;
import X.C491001vg;
import X.C735200Ssg;
import android.app.Activity;
import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.upvote.CarrierType;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import com.ss.android.ugc.aweme.upvote.model.UpvotePublishResponse;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes22.dex */
public class AwS5S1310000_21 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;
    public boolean z4;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS5S1310000_21 awS5S1310000_21, Object obj) {
        String str = awS5S1310000_21.s0;
        C291001Au c291001Au = new C291001Au(new C735200Ssg(0, str, (CarrierType) awS5S1310000_21.l1, awS5S1310000_21.z4));
        C1358880lSw.LIZ.getClass();
        return C1358700lSe.LIZ((C1358700lSe) obj, null, c291001Au, C1358940lT2.LIZJ(C1358880lSw.LJFF(str)), (UpvoteStruct) awS5S1310000_21.l2, (Integer) awS5S1310000_21.l3, 3);
    }

    public static final Object invoke$1(AwS5S1310000_21 awS5S1310000_21, Object obj) {
        C1623606Xi c1623606Xi = new C1623606Xi((UpvotePublishResponse) awS5S1310000_21.l1);
        String str = awS5S1310000_21.s0;
        C291001Au c291001Au = new C291001Au(new C735200Ssg(1, str, (CarrierType) awS5S1310000_21.l2, awS5S1310000_21.z4));
        C1358880lSw.LIZ.getClass();
        return C1358700lSe.LIZ((C1358700lSe) obj, c1623606Xi, c291001Au, C1358940lT2.LIZJ(C1358880lSw.LJFF(str)), (UpvoteStruct) awS5S1310000_21.l3, null, 34);
    }

    public static final Object invoke$2(AwS5S1310000_21 awS5S1310000_21, Object obj) {
        return C1358700lSe.LIZ((C1358700lSe) obj, new C491001vg((Throwable) awS5S1310000_21.l1), new C291001Au(new C735200Ssg(2, awS5S1310000_21.s0, (CarrierType) awS5S1310000_21.l2, !awS5S1310000_21.z4)), (UpvoteStruct) awS5S1310000_21.l3, null, null, 34);
    }

    public static final Object invoke$3(AwS5S1310000_21 awS5S1310000_21, Object obj) {
        C491001vg c491001vg = new C491001vg((Throwable) awS5S1310000_21.l1);
        String str = awS5S1310000_21.s0;
        C291001Au c291001Au = new C291001Au(new C735200Ssg(4, str, (CarrierType) awS5S1310000_21.l2, awS5S1310000_21.z4));
        C1358880lSw.LIZ.getClass();
        return C1358700lSe.LIZ((C1358700lSe) obj, c491001vg, c291001Au, C1358940lT2.LIZJ(C1358880lSw.LJFF(str)), (UpvoteStruct) awS5S1310000_21.l3, null, 34);
    }

    public static final Object invoke$4(AwS5S1310000_21 awS5S1310000_21, Object obj) {
        return C1358700lSe.LIZ((C1358700lSe) obj, null, new C291001Au(new C735200Ssg(3, awS5S1310000_21.s0, (CarrierType) awS5S1310000_21.l1, awS5S1310000_21.z4)), (UpvoteStruct) awS5S1310000_21.l2, (UpvoteStruct) awS5S1310000_21.l3, null, 35);
    }

    public static final Object invoke$5(AwS5S1310000_21 awS5S1310000_21, Object obj) {
        if (Intrinsics.LJFF(obj, Boolean.TRUE)) {
            final UrlModel urlModel = (UrlModel) awS5S1310000_21.l2;
            final Function1 function1 = (Function1) awS5S1310000_21.l1;
            final Activity activity = (Activity) awS5S1310000_21.l3;
            final String str = awS5S1310000_21.s0;
            final boolean z = awS5S1310000_21.z4;
            C333801Rg.LIZ(new Runnable() { // from class: X.0l6L
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("CommentPhotoSaver@c0b6.savePhoto$1$1");
                    try {
                        C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(urlModel));
                        c1331670kl3LJIIIIZZ.LJIL = Bitmap.Config.ARGB_8888;
                        c1331670kl3LJIIIIZZ.LJJIIJZLJL = new Executor() { // from class: X.0l6M
                            @Override // java.util.concurrent.Executor
                            public final void execute(Runnable runnable) {
                                if (runnable != null) {
                                    runnable.run();
                                }
                            }
                        };
                        final Function1<Boolean, Unit> function12 = function1;
                        final Activity activity2 = activity;
                        final String str2 = str;
                        final boolean z2 = z;
                        c1331670kl3LJIIIIZZ.LJJII(new InterfaceC1331910klR() { // from class: X.0mEd
                            @Override // X.InterfaceC1331910klR
                            public final void onProgress(float f) {
                            }

                            @Override // X.InterfaceC1331910klR
                            public final void onCanceled() {
                                function12.invoke(Boolean.FALSE);
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Removed duplicated region for block: B:109:0x027f A[EXC_TOP_SPLITTER, SYNTHETIC] */
                            /* JADX WARN: Removed duplicated region for block: B:54:0x023f A[Catch: Exception -> 0x0254, all -> 0x0275, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x0275, blocks: (B:37:0x0220, B:38:0x0224, B:64:0x0264, B:54:0x023f, B:49:0x0237, B:50:0x023a), top: B:101:0x01ff }] */
                            /* JADX WARN: Removed duplicated region for block: B:83:0x028f  */
                            /* JADX WARN: Removed duplicated region for block: B:89:0x02b1  */
                            /* JADX WARN: Removed duplicated region for block: B:91:0x02b9  */
                            /* JADX WARN: Removed duplicated region for block: B:95:0x0258 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                            /* JADX WARN: Type inference failed for: r11v1 */
                            /* JADX WARN: Type inference failed for: r11v2 */
                            /* JADX WARN: Type inference failed for: r11v3, types: [java.io.OutputStream] */
                            /* JADX WARN: Type inference failed for: r11v4 */
                            @Override // X.InterfaceC1331910klR
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final void LIZ(android.graphics.Bitmap r15) throws java.lang.Throwable {
                                /*
                                    Method dump skipped, instruction units count: 705
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: X.C1388450mEd.LIZ(android.graphics.Bitmap):void");
                            }

                            @Override // X.InterfaceC1331910klR
                            public final void onFailed(Throwable th) {
                                function12.invoke(Boolean.FALSE);
                            }
                        });
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("CommentPhotoSaver@c0b6.savePhoto$1$1");
                }
            });
        } else {
            Boolean bool = Boolean.FALSE;
            if (Intrinsics.LJFF(obj, bool)) {
                ((Function1) awS5S1310000_21.l1).invoke(bool);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS5S1310000_21(C19EG c19eg, UrlModel urlModel, String str, AwS117S0400000_21 awS117S0400000_21, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l1 = awS117S0400000_21;
        this.l2 = urlModel;
        this.l3 = c19eg;
        this.s0 = str;
        this.z4 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS5S1310000_21(UpvotePublishResponse upvotePublishResponse, String str, CarrierType carrierType, boolean z, UpvoteStruct upvoteStruct, int i) {
        super(1);
        this.$t = i;
        this.l1 = upvotePublishResponse;
        this.s0 = str;
        this.l2 = carrierType;
        this.z4 = z;
        this.l3 = upvoteStruct;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS5S1310000_21(String str, CarrierType carrierType, boolean z, UpvoteStruct upvoteStruct, UpvoteStruct upvoteStruct2, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = carrierType;
        this.z4 = z;
        this.l2 = upvoteStruct;
        this.l3 = upvoteStruct2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS5S1310000_21(String str, CarrierType carrierType, boolean z, UpvoteStruct upvoteStruct, Integer num, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = carrierType;
        this.z4 = z;
        this.l2 = upvoteStruct;
        this.l3 = num;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS5S1310000_21(Throwable th, String str, CarrierType carrierType, boolean z, UpvoteStruct upvoteStruct, int i) {
        super(1);
        this.$t = i;
        this.l1 = th;
        this.s0 = str;
        this.l2 = carrierType;
        this.z4 = z;
        this.l3 = upvoteStruct;
    }
}
