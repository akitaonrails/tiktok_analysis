package kotlin.jvm.internal;

import X.C013C;
import X.C09AY;
import X.C1AF3;
import X.C1AIA;
import X.C1AIE;
import X.EnumC742830TBx;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import Y.ARunnableS133S0100000_33;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.commercialize.model.FollowButtonData;
import com.ss.android.ugc.aweme.feed.assem.relationbtn.VideoRelationBtnAssemV2;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;

/* JADX INFO: loaded from: classes34.dex */
public class AwS84S0210000_33 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
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

    public static final Object invoke$0(AwS84S0210000_33 awS84S0210000_33, Object obj) {
        int iIntValue;
        AwemeRawAd awemeRawAd;
        FollowButtonData followButtonData;
        Integer num;
        if (Intrinsics.LJFF(((VideoRelationBtnAssemV2) awS84S0210000_33.l0).Ip().LL, EnumC742830TBx.AD.getValue()) && ((C013C) awS84S0210000_33.l1).element) {
            if (awS84S0210000_33.z2) {
                Aweme aweme = ((VideoRelationBtnAssemV2) awS84S0210000_33.l0).LLL;
                if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (followButtonData = awemeRawAd.getFollowButtonData()) != null && (num = followButtonData.showSeconds) != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 2;
                }
                int i = iIntValue * LSPassThroughRecordSizeConfig.DEFAULT;
                VideoRelationBtnAssemV2 videoRelationBtnAssemV2 = (VideoRelationBtnAssemV2) awS84S0210000_33.l0;
                videoRelationBtnAssemV2.LLLIIL = new ARunnableS133S0100000_33(videoRelationBtnAssemV2, 55);
                View view = videoRelationBtnAssemV2.LLJLLIL;
                if (view != null) {
                    HandlerHook.viewPostDelay(view, videoRelationBtnAssemV2.LLLIIL, i);
                }
            } else {
                VideoRelationBtnAssemV2 videoRelationBtnAssemV22 = (VideoRelationBtnAssemV2) awS84S0210000_33.l0;
                ARunnableS133S0100000_33 aRunnableS133S0100000_33 = new ARunnableS133S0100000_33(videoRelationBtnAssemV22, 56);
                ARunnableS133S0100000_33 aRunnableS133S0100000_332 = videoRelationBtnAssemV22.LLLIIL;
                if (aRunnableS133S0100000_332 != null) {
                    View view2 = videoRelationBtnAssemV22.LLJLLIL;
                    if (view2 != null) {
                        HandlerHook.viewRemoveCallbacks(view2, aRunnableS133S0100000_332);
                    }
                    videoRelationBtnAssemV22.LLLIIL = null;
                }
                View view3 = ((VideoRelationBtnAssemV2) awS84S0210000_33.l0).LLJLLIL;
                if (view3 != null) {
                    HandlerHook.viewPost(view3, aRunnableS133S0100000_33);
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS84S0210000_33 awS84S0210000_33, Object obj) throws JSONException {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        Function0 function0 = (Function0) awS84S0210000_33.l0;
        if (function0 != null) {
            function0.invoke();
        }
        if (zBooleanValue || awS84S0210000_33.z2) {
            C1AF3 c1af3 = (C1AF3) awS84S0210000_33.l1;
            if (!c1af3.LJJIJL.LJIIIIZZ) {
                SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = c1af3.LJIIL;
                if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
                    sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.setTag(Boolean.TRUE);
                }
            } else {
                c1af3.LJJIIJ();
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00a2 A[PHI: r5
      0x00a2: PHI (r5v6 java.lang.String) = (r5v0 java.lang.String), (r5v7 java.lang.String) binds: [B:41:0x00a0, B:39:0x009c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00aa A[PHI: r5
      0x00aa: PHI (r5v1 java.lang.String) = (r5v0 java.lang.String), (r5v6 java.lang.String), (r5v6 java.lang.String) binds: [B:41:0x00a0, B:43:0x00a4, B:45:0x00a8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ae A[PHI: r4 r5
      0x00ae: PHI (r4v6 java.lang.String) = (r4v2 java.lang.String), (r4v8 java.lang.String) binds: [B:47:0x00ac, B:45:0x00a8] A[DONT_GENERATE, DONT_INLINE]
      0x00ae: PHI (r5v5 java.lang.String) = (r5v1 java.lang.String), (r5v6 java.lang.String) binds: [B:47:0x00ac, B:45:0x00a8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0176 A[PHI: r4 r5
      0x0176: PHI (r4v3 java.lang.String) = (r4v2 java.lang.String), (r4v6 java.lang.String) binds: [B:47:0x00ac, B:49:0x00b0] A[DONT_GENERATE, DONT_INLINE]
      0x0176: PHI (r5v2 java.lang.String) = (r5v1 java.lang.String), (r5v5 java.lang.String) binds: [B:47:0x00ac, B:49:0x00b0] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$2(kotlin.jvm.internal.AwS84S0210000_33 r84, java.lang.Object r85) {
        /*
            Method dump skipped, instruction units count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS84S0210000_33.invoke$2(kotlin.jvm.internal.AwS84S0210000_33, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS84S0210000_33(VideoRelationBtnAssemV2 videoRelationBtnAssemV2, C013C c013c, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = videoRelationBtnAssemV2;
        this.l1 = c013c;
        this.z2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS84S0210000_33(Function0 function0, Function0<Unit> function02, boolean z, C1AF3 c1af3) {
        super(1);
        this.$t = c1af3;
        this.l0 = function0;
        this.z2 = function02;
        this.l1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS84S0210000_33(boolean z, C1AIA c1aia, C1AIE c1aie, int i) {
        super(1);
        this.$t = i;
        this.z2 = z;
        this.l0 = c1aia;
        this.l1 = c1aie;
    }
}
