package kotlin.jvm.internal;

import X.C09AY;
import X.C1397620mTQ;
import X.C2250141D5g;
import X.C786410Ut5;
import X.C823050WQl;
import Y.ARunnableS15S1000000_24;
import android.content.Context;
import android.os.Bundle;
import com.aweme.storage.m2.M2StorageCleanImpl;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.performanceopt.api.IStorageApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes25.dex */
public class AwS2S2201000_24 extends C09AY implements Function1 {
    public final int $t;
    public int i4;
    public Object l2;
    public Object l3;
    public String s0;
    public String s1;

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AwS2S2201000_24 awS2S2201000_24, Object obj) {
        Bundle bundle = new Bundle();
        String str = awS2S2201000_24.s0;
        bundle.putLong("free_space_target", ((Number) C2250141D5g.LJ.getValue()).longValue() * ((long) 1048576));
        C786410Ut5.LJJJI("free_space_extra", str, bundle);
        C786410Ut5.LJJJI("enter_method", "managedrafts", bundle);
        bundle.putLong("click_draft_box_time", System.currentTimeMillis());
        IStorageApi iStorageApiLJFF = ((M2StorageCleanImpl) awS2S2201000_24.l2).LJFF();
        if (iStorageApiLJFF != null) {
            iStorageApiLJFF.openDraftActivity((Context) awS2S2201000_24.l3, bundle);
        }
        ((M2StorageCleanImpl) awS2S2201000_24.l2).LIZLLL((Context) awS2S2201000_24.l3, awS2S2201000_24.i4, awS2S2201000_24.s0);
        C823050WQl.LIZLLL().execute(new ARunnableS15S1000000_24(awS2S2201000_24.s1, 2));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS2S2201000_24 awS2S2201000_24, Object obj) {
        SmartRouter.buildRoute((Context) awS2S2201000_24.l2, awS2S2201000_24.s0).open();
        ((M2StorageCleanImpl) awS2S2201000_24.l3).LIZLLL((Context) awS2S2201000_24.l2, awS2S2201000_24.i4, awS2S2201000_24.s0);
        C823050WQl.LIZLLL().execute(new ARunnableS15S1000000_24(awS2S2201000_24.s1, 3));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS2S2201000_24 awS2S2201000_24, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        M2StorageCleanImpl m2StorageCleanImpl = (M2StorageCleanImpl) awS2S2201000_24.l2;
        c1397620mTQ.LJFF(2131821835, new AwS2S2201000_24(awS2S2201000_24.i4, (Context) awS2S2201000_24.l3, m2StorageCleanImpl, awS2S2201000_24.s0, awS2S2201000_24.s1, 0));
        Context context = (Context) awS2S2201000_24.l3;
        String str = awS2S2201000_24.s0;
        c1397620mTQ.LJII(2131821836, new AwS2S2201000_24(awS2S2201000_24.i4, context, (M2StorageCleanImpl) awS2S2201000_24.l2, str, awS2S2201000_24.s1, 1));
        c1397620mTQ.LJFF = true;
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS2S2201000_24(int r3, android.content.Context r4, com.aweme.storage.m2.M2StorageCleanImpl r5, java.lang.String r6, java.lang.String r7, int r8) {
        /*
            r2 = this;
            r2.$t = r8
            switch(r8) {
                case 0: goto L15;
                case 1: goto L5;
                case 2: goto L15;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l2 = r4
            r1.s0 = r6
            r1.l3 = r5
            r1.i4 = r3
            r1.s1 = r7
            r0 = 1
        L11:
            r1.<init>(r0)
            return
        L15:
            r1 = r2
            r1.l2 = r5
            r1.l3 = r4
            r1.s0 = r6
            r1.i4 = r3
            r1.s1 = r7
            r0 = 1
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS2S2201000_24.<init>(int, android.content.Context, com.aweme.storage.m2.M2StorageCleanImpl, java.lang.String, java.lang.String, int):void");
    }
}
