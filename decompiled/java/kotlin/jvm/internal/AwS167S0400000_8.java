package kotlin.jvm.internal;

import X.AbstractC20598115it;
import X.C09AY;
import X.C0CHQ;
import X.C0DMI;
import X.C0M1R;
import X.C0M26;
import X.C0MUK;
import X.C1459640o5S;
import X.C1657820tF6;
import X.C19EG;
import X.C20656615sK;
import X.C259800zU;
import X.C537520L6g;
import X.C540290LGx;
import X.C563770M9f;
import X.C567510MNp;
import X.C580350MpV;
import X.C786410Ut5;
import X.InterfaceC569070MTp;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.tangram.TangramPersistenceModel;
import com.ss.android.ugc.aweme.creative.model.tangram.TangramTempModel;
import com.ss.android.ugc.aweme.services.external.ui.EditConfig;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.social.creation.api.mediapicker.EnterStoryParam;
import com.ss.android.ugc.aweme.tangram.TangramServiceImpl;
import com.ss.android.vesdk.VESize;
import com.ss.ugc.aweme.CreationConfigModel;
import com.ss.ugc.aweme.creation.base.BasicModel;
import com.ss.ugc.aweme.creation.base.TrackModel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import pic.q;

/* JADX INFO: loaded from: classes9.dex */
public class AwS167S0400000_8 extends C09AY implements Function2 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS167S0400000_8 awS167S0400000_8, Object obj, Object obj2) {
        ((Function0) awS167S0400000_8.l0).invoke();
        C540290LGx c540290LGx = C540290LGx.LIZ;
        C19EG c19eg = (C19EG) awS167S0400000_8.l1;
        Function0 function0 = (Function0) awS167S0400000_8.l2;
        Function0 function02 = (Function0) awS167S0400000_8.l3;
        AFwS194S0000000_8 aFwS194S0000000_8 = AFwS194S0000000_8.get$arr$(191);
        c540290LGx.getClass();
        C540290LGx.LJIIIIZZ(c19eg, function0, function02, aFwS194S0000000_8);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS167S0400000_8 awS167S0400000_8, Object obj, Object obj2) {
        C540290LGx c540290LGx = C540290LGx.LIZ;
        C19EG c19eg = (C19EG) awS167S0400000_8.l0;
        AwS252S0300000_8 awS252S0300000_8 = new AwS252S0300000_8((Function0) awS167S0400000_8.l1, (Function0<Unit>) c19eg, (C19EG) awS167S0400000_8.l2, (C20656615sK) 17);
        AwS409S0200000_8 awS409S0200000_8 = new AwS409S0200000_8((C20656615sK) awS167S0400000_8.l2, (Function0) awS167S0400000_8.l3, 56);
        AwS409S0200000_8 awS409S0200000_82 = new AwS409S0200000_8((C19EG) awS167S0400000_8.l0, (C20656615sK) awS167S0400000_8.l2, 57);
        c540290LGx.getClass();
        C540290LGx.LJII(c19eg, awS252S0300000_8, awS409S0200000_8, awS409S0200000_82);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS167S0400000_8 awS167S0400000_8, Object obj, Object obj2) {
        C540290LGx c540290LGx = C540290LGx.LIZ;
        C19EG c19eg = (C19EG) awS167S0400000_8.l0;
        Function0 function0 = (Function0) awS167S0400000_8.l1;
        Function0 function02 = (Function0) awS167S0400000_8.l2;
        Function0 function03 = (Function0) awS167S0400000_8.l3;
        c540290LGx.getClass();
        C540290LGx.LJIIJ(c19eg, function0, function02, function03);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS167S0400000_8 awS167S0400000_8, Object obj, Object obj2) {
        String creationId;
        CreationConfigModel creationConfigModel;
        BasicModel basic;
        Intent intentLIZ;
        float fFloatValue;
        Float musicVolume;
        Float voiceVolume;
        TrackModel track;
        String shootWay;
        Intent intentLIZ2;
        String shootWay2;
        TrackModel track2;
        InterfaceC569070MTp interfaceC569070MTp = (InterfaceC569070MTp) obj;
        CreationConfigModel creationConfigModel2 = (CreationConfigModel) obj2;
        ((Function1) awS167S0400000_8.l0).invoke(interfaceC569070MTp);
        EditConfig editConfig = (EditConfig) interfaceC569070MTp.LIZIZ(EditConfig.class);
        RecordConfig recordConfig = (RecordConfig) interfaceC569070MTp.LIZIZ(RecordConfig.class);
        if (recordConfig != null) {
            creationId = recordConfig.getCreationId();
        } else if (editConfig != null) {
            creationId = editConfig.getCreationId();
        } else {
            Object obj3 = awS167S0400000_8.l1;
            if ((obj3 instanceof CreationConfigModel) && (creationConfigModel = (CreationConfigModel) obj3) != null && (basic = creationConfigModel.getBasic()) != null) {
                creationId = basic.getCreationId();
            } else {
                creationId = null;
            }
        }
        if (creationId == null) {
            creationId = C0DMI.LIZ();
        }
        CreativeInfo creativeInfo = new CreativeInfo(creationId, 0, null, 6, null);
        interfaceC569070MTp.LIZJ(CreativeInfo.class, creativeInfo);
        interfaceC569070MTp.LIZJ(Context.class, (Context) awS167S0400000_8.l2);
        String str = "tangram";
        if (creationConfigModel2.getRecord() != null) {
            ((TangramServiceImpl) awS167S0400000_8.l3).getClass();
            if (recordConfig == null) {
                intentLIZ2 = new Intent();
                C537520L6g.LIZLLL(intentLIZ2, creativeInfo);
                BasicModel basic2 = creationConfigModel2.getBasic();
                if (basic2 == null || (track2 = basic2.getTrack()) == null || (shootWay2 = track2.getShootWay()) == null) {
                    shootWay2 = "tangram";
                }
                intentLIZ2.putExtra("shoot_way", shootWay2);
            } else {
                new q();
                intentLIZ2 = AbstractC20598115it.LIZ(recordConfig);
            }
            interfaceC569070MTp.LIZJ(ShortVideoContext.class, C0CHQ.LIZ().LJJJJJ().createShortVideoContext(intentLIZ2));
        }
        if (creationConfigModel2.getEdit() != null) {
            interfaceC569070MTp.LIZJ(VESize.class, C567510MNp.LIZ((Context) awS167S0400000_8.l2));
            ((TangramServiceImpl) awS167S0400000_8.l3).getClass();
            if (editConfig == null) {
                intentLIZ = new Intent();
                C0MUK.LJIIIZ(intentLIZ, C0MUK.LJIIIIZZ());
                C537520L6g.LIZLLL(intentLIZ, creativeInfo);
                BasicModel basic3 = creationConfigModel2.getBasic();
                if (basic3 != null && (track = basic3.getTrack()) != null && (shootWay = track.getShootWay()) != null) {
                    str = shootWay;
                }
                intentLIZ.putExtra("shoot_way", str);
            } else {
                intentLIZ = C580350MpV.LIZ(editConfig, true, null);
            }
            VideoPublishEditModel videoPublishEditModelLJIIIIZZ = C0CHQ.LIZ().LJII().LJIIIIZZ(intentLIZ);
            videoPublishEditModelLJIIIIZZ.creativeModel.tangramTempModel = new TangramTempModel(0);
            videoPublishEditModelLJIIIIZZ.creativeModel.tangramPersistenceModel = new TangramPersistenceModel(null, null, null, null, null, null, null, false);
            videoPublishEditModelLJIIIIZZ.setFastImport(true);
            float fFloatValue2 = 1.0f;
            if (editConfig != null && (voiceVolume = editConfig.getVoiceVolume()) != null) {
                fFloatValue = voiceVolume.floatValue();
            } else {
                fFloatValue = 1.0f;
            }
            videoPublishEditModelLJIIIIZZ.setVoiceVolume(fFloatValue);
            if (editConfig != null && (musicVolume = editConfig.getMusicVolume()) != null) {
                fFloatValue2 = musicVolume.floatValue();
            }
            videoPublishEditModelLJIIIIZZ.setMusicVolume(fFloatValue2);
            videoPublishEditModelLJIIIIZZ.setFromCut(true);
            interfaceC569070MTp.LIZJ(VideoPublishEditModel.class, videoPublishEditModelLJIIIIZZ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS167S0400000_8 awS167S0400000_8, Object obj, Object obj2) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (!zBooleanValue && !((EnterStoryParam) awS167S0400000_8.l0).getInterceptorWhenFailEnterStoryAlbum().invoke().booleanValue()) {
            ((C563770M9f) awS167S0400000_8.l1).openStoryRecordingPageDirectly((Activity) awS167S0400000_8.l2, (EnterStoryParam) awS167S0400000_8.l0, null);
        }
        Function1 function1 = (Function1) awS167S0400000_8.l3;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(zBooleanValue));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [T, android.animation.ObjectAnimator, android.animation.ValueAnimator] */
    public static final Object invoke$5(AwS167S0400000_8 awS167S0400000_8, Object obj, Object obj2) {
        int i;
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zLJFF = Intrinsics.LJFF(((C1459640o5S) awS167S0400000_8.l0).LJJIJIIJI().creativeModel.editSaveLocalModel.flowId, obj2);
        int i2 = R.attr.ee;
        if (zLJFF && zBooleanValue) {
            C1459640o5S c1459640o5S = (C1459640o5S) awS167S0400000_8.l0;
            C259800zU c259800zU = (C259800zU) awS167S0400000_8.l3;
            SmartImageView smartImageView = (SmartImageView) awS167S0400000_8.l1;
            c1459640o5S.getClass();
            C1459640o5S.LJJIJLIJ(smartImageView, R.raw.icon_spinner_normal, R.attr.ee);
            if (c259800zU.element == 0) {
                ?? OfFloat = ObjectAnimator.ofFloat(smartImageView, "rotation", 0.0f, 360.0f);
                OfFloat.setDuration(1000L);
                OfFloat.setRepeatCount(-1);
                OfFloat.setInterpolator(new LinearInterpolator());
                c259800zU.element = OfFloat;
            }
            ValueAnimator valueAnimator3 = (ValueAnimator) c259800zU.element;
            if ((valueAnimator3 == null || !valueAnimator3.isRunning()) && (valueAnimator2 = (ValueAnimator) c259800zU.element) != null) {
                valueAnimator2.start();
            }
            ((TextView) awS167S0400000_8.l2).setText(2131846806);
        } else {
            C1459640o5S c1459640o5S2 = (C1459640o5S) awS167S0400000_8.l0;
            C259800zU c259800zU2 = (C259800zU) awS167S0400000_8.l3;
            SmartImageView smartImageView2 = (SmartImageView) awS167S0400000_8.l1;
            C1657820tF6 c1657820tF6 = C1657820tF6.LIZ;
            c1657820tF6.getClass();
            if (C1657820tF6.LIZIZ()) {
                i = R.raw.icon_color_arrow_down_to_line;
            } else {
                i = R.raw.icon_arrow_down_to_line_fill;
            }
            c1657820tF6.getClass();
            if (C1657820tF6.LIZIZ()) {
                i2 = 0;
            }
            c1459640o5S2.getClass();
            C1459640o5S.LJJIJLIJ(smartImageView2, i, i2);
            C786410Ut5.Eb(smartImageView2, 0.0f);
            ValueAnimator valueAnimator4 = (ValueAnimator) c259800zU2.element;
            if (valueAnimator4 != null && valueAnimator4.isRunning() && (valueAnimator = (ValueAnimator) c259800zU2.element) != null) {
                valueAnimator.cancel();
            }
            ((TextView) awS167S0400000_8.l2).setText(2131846805);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$6(kotlin.jvm.internal.AwS167S0400000_8 r12, java.lang.Object r13, java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS167S0400000_8.invoke$6(kotlin.jvm.internal.AwS167S0400000_8, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS167S0400000_8(X.C19EG r3, kotlin.jvm.functions.Function0 r4, kotlin.jvm.functions.Function0 r5, kotlin.jvm.functions.Function0 r6, int r7) {
        /*
            r2 = this;
            r2.$t = r7
            if (r7 == 0) goto L12
            r1 = r2
            r1.l0 = r3
            r1.l1 = r4
            r1.l2 = r5
            r1.l3 = r6
            r0 = 2
        Le:
            r1.<init>(r0)
            return
        L12:
            r1 = r2
            r1.l0 = r4
            r1.l1 = r3
            r1.l2 = r5
            r1.l3 = r6
            r0 = 2
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS167S0400000_8.<init>(X.19EG, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS167S0400000_8(C19EG c19eg, C19EG c19eg2, Function0<Unit> function0, C20656615sK c20656615sK, Function0<Unit> function02) {
        super(2);
        this.$t = function02;
        this.l0 = c19eg;
        this.l1 = c19eg2;
        this.l2 = function0;
        this.l3 = c20656615sK;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS167S0400000_8(Context context, Context context2, C0M1R c0m1r, C0M26 c0m26, Function0<Unit> function0) {
        super(2);
        this.$t = function0;
        this.l0 = context;
        this.l1 = context2;
        this.l2 = c0m1r;
        this.l3 = c0m26;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS167S0400000_8(TextView textView, SmartImageView smartImageView, C1459640o5S c1459640o5S, C259800zU c259800zU, int i) {
        super(2);
        this.$t = i;
        this.l0 = c1459640o5S;
        this.l1 = smartImageView;
        this.l2 = textView;
        this.l3 = c259800zU;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS167S0400000_8(EnterStoryParam enterStoryParam, EnterStoryParam enterStoryParam2, C563770M9f c563770M9f, Activity activity, Function1<? super Boolean, Unit> function1) {
        super(2);
        this.$t = function1;
        this.l0 = enterStoryParam;
        this.l1 = enterStoryParam2;
        this.l2 = c563770M9f;
        this.l3 = activity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS167S0400000_8(Function1 function1, Function1<? super InterfaceC569070MTp, Unit> function12, Object obj, Context context, TangramServiceImpl tangramServiceImpl) {
        super(2);
        this.$t = tangramServiceImpl;
        this.l0 = function1;
        this.l1 = function12;
        this.l2 = obj;
        this.l3 = context;
    }
}
