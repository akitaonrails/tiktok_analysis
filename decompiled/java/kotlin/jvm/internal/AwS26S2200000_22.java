package kotlin.jvm.internal;

import X.C09AY;
import X.C0CHQ;
import X.C0WZX;
import X.C1322110kVd;
import X.C1443230nez;
import X.C1445410niV;
import X.C1445750nj3;
import X.C2204961BRm;
import X.C2252611DEt;
import X.C2286708xd;
import X.C785410UrT;
import X.DialogC1390150mHN;
import X.EnumC1445450niZ;
import X.InterfaceC20236714Gf;
import android.app.Activity;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public class AwS26S2200000_22 extends C09AY implements Function1 {
    public final int $t;
    public Object l2;
    public Object l3;
    public String s0;
    public String s1;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS26S2200000_22 awS26S2200000_22, Object obj) {
        ((Boolean) obj).booleanValue();
        C0CHQ.LIZ().getPublishService().LJJLIIIJ().LIZ("EditPostPublishScene", "download success");
        C1445750nj3 c1445750nj3 = C1445750nj3.LIZ;
        C1445750nj3.LJII.storeBoolean(awS26S2200000_22.s0, true);
        if (C2286708xd.LIZJ(awS26S2200000_22.s1) && !C1443230nez.LJIIJJI((VideoPublishEditModel) awS26S2200000_22.l2)) {
            C1443230nez.LJ((VideoPublishEditModel) awS26S2200000_22.l2, awS26S2200000_22.s1);
        }
        ((InterfaceC20236714Gf) awS26S2200000_22.l3).LJJIFFI(null, Boolean.TRUE);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AwS26S2200000_22 awS26S2200000_22, Object obj) throws Throwable {
        Activity activity;
        DialogC1390150mHN dialogC1390150mHN;
        DialogC1390150mHN dialogC1390150mHN2;
        DialogC1390150mHN dialogC1390150mHN3;
        if (((Boolean) obj).booleanValue() && (dialogC1390150mHN2 = ((C1445410niV) awS26S2200000_22.l2).LLLLII) != null && dialogC1390150mHN2.isShowing() && (dialogC1390150mHN3 = ((C1445410niV) awS26S2200000_22.l2).LLLLII) != null) {
            dialogC1390150mHN3.LJJLL(100.0f, false);
        }
        C0CHQ.LIZ().getPublishService().LJJLIIIJ().LIZ("EditPostPublishScene", "download success");
        C1445750nj3 c1445750nj3 = (C1445750nj3) awS26S2200000_22.l3;
        String str = awS26S2200000_22.s0;
        c1445750nj3.getClass();
        C1445750nj3.LJII.storeBoolean(str, true);
        if (C2286708xd.LIZJ(awS26S2200000_22.s1)) {
            VideoPublishEditModel videoPublishEditModel = ((C1445410niV) awS26S2200000_22.l2).LLJLLL;
            if (videoPublishEditModel != null) {
                if (!C1443230nez.LJIIJJI(videoPublishEditModel)) {
                    VideoPublishEditModel videoPublishEditModel2 = ((C1445410niV) awS26S2200000_22.l2).LLJLLL;
                    if (videoPublishEditModel2 != null) {
                        C1443230nez.LJ(videoPublishEditModel2, awS26S2200000_22.s1);
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                }
                DialogC1390150mHN dialogC1390150mHN4 = ((C1445410niV) awS26S2200000_22.l2).LLLLII;
                if (dialogC1390150mHN4 != null && dialogC1390150mHN4.isShowing() && (dialogC1390150mHN = ((C1445410niV) awS26S2200000_22.l2).LLLLII) != null) {
                    dialogC1390150mHN.dismiss();
                    C785410UrT.LIZ(dialogC1390150mHN);
                }
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        C1445410niV c1445410niV = (C1445410niV) awS26S2200000_22.l2;
        c1445410niV.LLLJ = true;
        EnumC1445450niZ enumC1445450niZ = c1445410niV.LLLF;
        C1322110kVd c1322110kVd = null;
        if (enumC1445450niZ == EnumC1445450niZ.CLICK_PREVIEW) {
            C1322110kVd c1322110kVd2 = c1445410niV.LLJJIJIL;
            if (c1322110kVd2 != null) {
                c1322110kVd = c1322110kVd2;
            }
            c1445410niV.LLLLLLIL(0, c1322110kVd);
        } else if (enumC1445450niZ == EnumC1445450niZ.CLICK_SELECT_COVER && (activity = c1445410niV.mActivity) != null && !c1445410niV.LLLII) {
            C2204961BRm.n(activity, c1445410niV.LLJLLL, 4, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhmcbMnZwSGu628qylbxLrjLD8GB77mX1dla2pGRg=", null));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS26S2200000_22(C1445410niV c1445410niV, String str, String str2, int i) {
        super(1);
        this.$t = i;
        C1445750nj3 c1445750nj3 = C1445750nj3.LIZ;
        this.l2 = c1445410niV;
        this.l3 = c1445750nj3;
        this.s0 = str;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS26S2200000_22(String str, String str2, VideoPublishEditModel videoPublishEditModel, C2252611DEt c2252611DEt, int i) {
        super(1);
        this.$t = i;
        C1445750nj3 c1445750nj3 = C1445750nj3.LIZ;
        this.s0 = str;
        this.s1 = str2;
        this.l2 = videoPublishEditModel;
        this.l3 = c2252611DEt;
    }
}
