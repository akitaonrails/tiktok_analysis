package kotlin.jvm.internal;

import X.C09AY;
import X.C0EYQ;
import X.C0FQS;
import X.C0L7B;
import X.C0LAB;
import X.C0LDE;
import X.C0LDJ;
import X.C0MV0;
import X.C1322110kVd;
import X.C19EG;
import X.C259800zU;
import X.C294050Bfn;
import X.C537850L7n;
import X.C537860L7o;
import X.C552890LmJ;
import X.C552940LmO;
import X.C555600Lqg;
import X.C555910LrB;
import X.C576730Mjf;
import X.EnumC1412640mre;
import Y.ARunnableS8S1300000_8;
import android.app.Activity;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes9.dex */
public class AwS76S1300000_8 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            default:
                return null;
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static final Object invoke$0(AwS76S1300000_8 awS76S1300000_8) {
        C576730Mjf.LJIIJJI("CameraLayoutNLECompiler", "startVideoCompile onCompileDone");
        ((C0LDE) awS76S1300000_8.l1).LJI(awS76S1300000_8.s0, (ArrayList) awS76S1300000_8.l2);
        C0LDE.LJIIJJI.put(((C0LDE) awS76S1300000_8.l1).LIZ.getCreationId(), (Pair<String, List<MediaModel>>) ((C259800zU) awS76S1300000_8.l3).element);
        C0LDJ c0ldj = C0LDJ.LIZ;
        C0LAB c0lab = ((C0LDE) awS76S1300000_8.l1).LJIIJ;
        c0ldj.getClass();
        C0LDJ.LJI(c0lab);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS76S1300000_8 awS76S1300000_8) {
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) awS76S1300000_8.l1;
        C19EG c19eg = (C19EG) awS76S1300000_8.l2;
        C1322110kVd c1322110kVd = (C1322110kVd) awS76S1300000_8.l3;
        HandlerHook.viewPost(c1322110kVd, new ARunnableS8S1300000_8(c19eg, c1322110kVd, videoPublishEditModel, awS76S1300000_8.s0, 1));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS76S1300000_8 awS76S1300000_8) {
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) awS76S1300000_8.l1;
        C19EG c19eg = (C19EG) awS76S1300000_8.l2;
        C1322110kVd c1322110kVd = (C1322110kVd) awS76S1300000_8.l3;
        HandlerHook.viewPost(c1322110kVd, new ARunnableS8S1300000_8(c19eg, c1322110kVd, videoPublishEditModel, awS76S1300000_8.s0, 1));
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS76S1300000_8 awS76S1300000_8) {
        return new C555600Lqg(awS76S1300000_8.s0, (C552890LmJ) awS76S1300000_8.l1, (C555910LrB) awS76S1300000_8.l2, (C552940LmO) awS76S1300000_8.l3);
    }

    public static final Object invoke$4(AwS76S1300000_8 awS76S1300000_8) {
        NLETemplateModel nLETemplateModel;
        NLETemplateModel nLETemplateModel2;
        AVMusic aVMusic;
        String str;
        Boolean boolValueOf;
        C0FQS c0fqs = (C0FQS) awS76S1300000_8.l1;
        C0L7B c0l7b = (C0L7B) awS76S1300000_8.l2;
        if (c0l7b != null) {
            nLETemplateModel = c0l7b.LIZ;
        } else {
            nLETemplateModel = null;
        }
        c0fqs.LJIIJ = nLETemplateModel;
        C537850L7n c537850L7n = c0fqs.LJIILL;
        if (c537850L7n != null) {
            if (c0l7b != null) {
                aVMusic = c0l7b.LJIIIIZZ;
            } else {
                aVMusic = null;
            }
            c537850L7n.LIZLLL = aVMusic;
            if (c0l7b != null) {
                str = c0l7b.LJIIIZ;
            } else {
                str = null;
            }
            c537850L7n.LJ = str;
            if (c537850L7n.LIZJ == null && c537850L7n != null) {
                if (c0l7b != null) {
                    boolValueOf = Boolean.valueOf(c0l7b.LJIIJ);
                } else {
                    boolValueOf = null;
                }
                c537850L7n.LIZJ = boolValueOf;
            }
        }
        if (C294050Bfn.LIZ() && (nLETemplateModel2 = ((C0FQS) awS76S1300000_8.l1).LJIIJ) != null) {
            C0EYQ.LJI(nLETemplateModel2, EnumC1412640mre.CUT_SAME.getValue(), awS76S1300000_8.s0);
        }
        ((C537860L7o) awS76S1300000_8.l3).LIZJ((C0FQS) awS76S1300000_8.l1, null);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS76S1300000_8 awS76S1300000_8) {
        ((C0MV0) awS76S1300000_8.l1).LJJII((Activity) awS76S1300000_8.l2, (LifecycleOwner) awS76S1300000_8.l3, awS76S1300000_8.s0);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS76S1300000_8(C0FQS c0fqs, C0L7B c0l7b, String str, C537860L7o c537860L7o, int i) {
        super(0);
        this.$t = i;
        this.l1 = c0fqs;
        this.l2 = c0l7b;
        this.s0 = str;
        this.l3 = c537860L7o;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS76S1300000_8(C0LDE c0lde, C0LDE c0lde2, String str, ArrayList<MediaModel> arrayList, C259800zU<Pair<String, List<MediaModel>>> c259800zU) {
        super(0);
        this.$t = c259800zU;
        this.l1 = c0lde;
        this.s0 = c0lde2;
        this.l2 = str;
        this.l3 = arrayList;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS76S1300000_8(C0MV0 c0mv0, Activity activity, LifecycleOwner lifecycleOwner, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c0mv0;
        this.l2 = activity;
        this.l3 = lifecycleOwner;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS76S1300000_8(C19EG c19eg, C1322110kVd c1322110kVd, VideoPublishEditModel videoPublishEditModel, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = videoPublishEditModel;
        this.l2 = c19eg;
        this.l3 = c1322110kVd;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS76S1300000_8(String str, String str2, C552890LmJ<?, ?, ?, ?> c552890LmJ, C555910LrB c555910LrB, C552940LmO c552940LmO) {
        super(0);
        this.$t = c552940LmO;
        this.s0 = str;
        this.l1 = str2;
        this.l2 = c552890LmJ;
        this.l3 = c555910LrB;
    }
}
