package kotlin.jvm.internal;

import X.C09AY;
import X.C0Y3I;
import X.C0Y8T;
import X.C0YTK;
import X.C11E9;
import X.C1DUV;
import X.C1EBU;
import X.C1EBV;
import X.C869590Y9l;
import X.C896400ZEo;
import X.InterfaceC1212360hec;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.swap.IPhotoSwapSendCallback;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes36.dex */
public class AwS470S0200000_35 extends C09AY implements Function2 {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            case 4:
                return invoke$4(this, obj, obj2);
            case 5:
                return invoke$5(this, obj, obj2);
            case 6:
                return invoke$6(this, obj, obj2);
            case 7:
                return invoke$7(this, obj, obj2);
            case 8:
                return invoke$8(this, obj, obj2);
            default:
                return null;
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS470S0200000_35(com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel r3, X.C1EBU r4, int r5) {
        /*
            r2 = this;
            r2.$t = r5
            switch(r5) {
                case 3: goto Lf;
                case 4: goto L5;
                case 5: goto Lf;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l0 = r3
            r1.l1 = r4
            r0 = 2
        Lb:
            r1.<init>(r0)
            return
        Lf:
            r1 = r2
            r1.l0 = r4
            r1.l1 = r3
            r0 = 2
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS470S0200000_35.<init>(com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, X.1EBU, int):void");
    }

    public static final Object invoke$0(AwS470S0200000_35 awS470S0200000_35, Object obj, Object obj2) {
        ((C11E9) obj).withState(((C1EBV) awS470S0200000_35.l0).LL, new AwS608S0100000_29((InterfaceC1212360hec) awS470S0200000_35.l1, (InterfaceC1212360hec<Aweme>) 78));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS470S0200000_35 awS470S0200000_35, Object obj, Object obj2) {
        ((InterfaceC1212360hec) awS470S0200000_35.l0).Wi(new Exception((Throwable) obj2));
        ((C1EBV) awS470S0200000_35.l1).LLILLL = false;
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS470S0200000_35 awS470S0200000_35, Object obj, Object obj2) {
        ((C11E9) obj).withState(((C1EBV) awS470S0200000_35.l0).LL, new AwS608S0100000_29((InterfaceC1212360hec) awS470S0200000_35.l1, (InterfaceC1212360hec<Aweme>) 79));
        ((C1EBV) awS470S0200000_35.l0).LLILLL = false;
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS470S0200000_35 awS470S0200000_35, Object obj, Object obj2) {
        ((C11E9) obj).withState(((C1EBU) awS470S0200000_35.l0).LL, new AwS608S0100000_29((InterfaceC1212360hec) awS470S0200000_35.l1, (InterfaceC1212360hec<Aweme>) 610));
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS470S0200000_35 awS470S0200000_35, Object obj, Object obj2) {
        ((InterfaceC1212360hec) awS470S0200000_35.l0).Wi(new Exception((Throwable) obj2));
        ((C1EBU) awS470S0200000_35.l1).LLILLL = false;
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS470S0200000_35 awS470S0200000_35, Object obj, Object obj2) {
        ((C11E9) obj).withState(((C1EBU) awS470S0200000_35.l0).LL, new AwS608S0100000_29((InterfaceC1212360hec) awS470S0200000_35.l1, (InterfaceC1212360hec<Aweme>) 611));
        ((C1EBU) awS470S0200000_35.l0).LLILLL = false;
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS470S0200000_35 awS470S0200000_35, Object obj, Object obj2) {
        String uuid;
        C0Y8T c0y8t = (C0Y8T) obj;
        C869590Y9l c869590Y9l = (C869590Y9l) obj2;
        C0YTK c0ytk = (C0YTK) awS470S0200000_35.l0;
        if (c0ytk != null) {
            c0ytk.LIZLLL(c0y8t, c869590Y9l);
        }
        String str = (String) ((Map) awS470S0200000_35.l1).get("pre_stage_track_uuid");
        if (str != null && str.length() > 0) {
            if (c869590Y9l != null && (uuid = c869590Y9l.getUuid()) != null) {
                C1DUV.LIZ(str).LIZ(uuid);
            }
            C1DUV.LIZ(str).LIZIZ();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS470S0200000_35 awS470S0200000_35, Object obj, Object obj2) {
        IPhotoSwapSendCallback iPhotoSwapSendCallback;
        C0Y8T c0y8t = (C0Y8T) obj;
        C869590Y9l c869590Y9l = (C869590Y9l) obj2;
        if (c869590Y9l != null && C896400ZEo.LJIIIZ(c869590Y9l) && (iPhotoSwapSendCallback = (IPhotoSwapSendCallback) PluggableExtentionKt.pluggableSpi$default(IPhotoSwapSendCallback.class, false, false, false, 14, null)) != null) {
            iPhotoSwapSendCallback.LIZJ((C0Y3I) awS470S0200000_35.l0, c869590Y9l);
        }
        C0YTK c0ytk = (C0YTK) awS470S0200000_35.l1;
        if (c0ytk != null) {
            c0ytk.LIZLLL(c0y8t, c869590Y9l);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS470S0200000_35 awS470S0200000_35, Object obj, Object obj2) {
        String uuid;
        C0Y8T c0y8t = (C0Y8T) obj;
        C869590Y9l c869590Y9l = (C869590Y9l) obj2;
        C0YTK c0ytk = (C0YTK) awS470S0200000_35.l0;
        if (c0ytk != null) {
            c0ytk.LIZLLL(c0y8t, c869590Y9l);
        }
        String str = (String) ((Map) awS470S0200000_35.l1).get("pre_stage_track_uuid");
        if (str != null && str.length() > 0) {
            if (c869590Y9l != null && (uuid = c869590Y9l.getUuid()) != null) {
                C1DUV.LIZ(str).LIZ(uuid);
            }
            C1DUV.LIZ(str).LIZIZ();
        }
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS470S0200000_35(com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel r3, X.C1EBV r4, int r5) {
        /*
            r2 = this;
            r2.$t = r5
            switch(r5) {
                case 0: goto Lf;
                case 1: goto L5;
                case 2: goto Lf;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l0 = r3
            r1.l1 = r4
            r0 = 2
        Lb:
            r1.<init>(r0)
            return
        Lf:
            r1 = r2
            r1.l0 = r4
            r1.l1 = r3
            r0 = 2
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS470S0200000_35.<init>(com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, X.1EBV, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS470S0200000_35(C0Y3I c0y3i, C0YTK c0ytk, int i) {
        super(2);
        this.$t = i;
        this.l0 = c0y3i;
        this.l1 = c0ytk;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS470S0200000_35(C0YTK c0ytk, C0YTK c0ytk2, Map<String, String> map) {
        super(2);
        this.$t = map;
        this.l0 = c0ytk;
        this.l1 = c0ytk2;
    }
}
