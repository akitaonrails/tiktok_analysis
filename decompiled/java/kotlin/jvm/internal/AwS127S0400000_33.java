package kotlin.jvm.internal;

import X.C09AY;
import X.C0R93;
import X.C10EU;
import X.C11KT;
import X.C1294720jnS;
import X.C1295960jpS;
import X.C1AGN;
import X.C2174851A9r;
import X.C2188811AlT;
import X.C464420IJc;
import X.C500260Jjc;
import X.EnumC21166217sK;
import X.EnumC2174841A9q;
import X.InterfaceC2329309At;
import android.animation.Animator;
import android.graphics.drawable.Drawable;
import com.bytedance.android.livesdk.livesetting.linkmic.PathAnimationValue;
import com.ss.android.ugc.aweme.feed.assem.relationbtn.VideoRelationBtnVMV2;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes34.dex */
public class AwS127S0400000_33 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

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

    public static final Object invoke$0(AwS127S0400000_33 awS127S0400000_33, Object obj) {
        float fFloatValue;
        Boolean boolValueOf;
        C1294720jnS c1294720jnS = (C1294720jnS) obj;
        if (c1294720jnS == null) {
            ((InterfaceC2329309At) awS127S0400000_33.l0).onError(new Throwable("lottie res is null"));
        } else {
            C1AGN c1agn = (C1AGN) awS127S0400000_33.l1;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("handleAnimation loadGecko result:");
            sbLIZ.append(c1294720jnS.hashCode());
            c1agn.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
            C500260Jjc.LJLJLJ((C1295960jpS) awS127S0400000_33.l2, true);
            ((C1295960jpS) awS127S0400000_33.l2).setComposition(c1294720jnS);
            C1295960jpS c1295960jpS = (C1295960jpS) awS127S0400000_33.l2;
            Float f = ((PathAnimationValue) awS127S0400000_33.l3).startFlyProgress;
            if (f != null) {
                fFloatValue = f.floatValue();
            } else {
                fFloatValue = 0.0f;
            }
            c1295960jpS.setMinAndMaxProgress(0.0f, fFloatValue);
            final C1295960jpS c1295960jpS2 = (C1295960jpS) awS127S0400000_33.l2;
            final C1AGN c1agn2 = (C1AGN) awS127S0400000_33.l1;
            final InterfaceC2329309At interfaceC2329309At = (InterfaceC2329309At) awS127S0400000_33.l0;
            c1295960jpS2.addAnimatorListener(new C464420IJc() { // from class: X.1AGE
                @Override // X.C464420IJc, android.animation.Animator.AnimatorListener
                public final void onAnimationCancel(Animator animator) {
                    c1agn2.LIZLLL("handleAnimation onAnimationCancel");
                    C1295960jpS c1295960jpS3 = c1295960jpS2;
                    interfaceC2329309At.onSuccess(c1295960jpS3);
                    c1295960jpS3.removeAnimatorListener(this);
                }

                @Override // X.C464420IJc, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    c1agn2.LIZLLL("handleAnimation onAnimationEnd");
                    C1295960jpS c1295960jpS3 = c1295960jpS2;
                    interfaceC2329309At.onSuccess(c1295960jpS3);
                    c1295960jpS3.removeAnimatorListener(this);
                }

                @Override // X.C464420IJc, android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                    c1agn2.LIZLLL("handleAnimation onAnimationStart");
                }
            });
            C1AGN c1agn3 = (C1AGN) awS127S0400000_33.l1;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("handleAnimation loadGecko isVisible:");
            Drawable drawable = ((C1295960jpS) awS127S0400000_33.l2).getDrawable();
            if (drawable != null) {
                boolValueOf = Boolean.valueOf(drawable.isVisible());
            } else {
                boolValueOf = null;
            }
            sbLIZ2.append(boolValueOf);
            sbLIZ2.append(" lottieAnimationView.isVisible():");
            sbLIZ2.append(C500260Jjc.LJJJJIZL((C1295960jpS) awS127S0400000_33.l2));
            c1agn3.LIZLLL(C2188811AlT.LIZIZ(sbLIZ2));
            Drawable drawable2 = ((C1295960jpS) awS127S0400000_33.l2).getDrawable();
            if (drawable2 != null) {
                drawable2.setVisible(true, false);
            }
            C1295960jpS c1295960jpS3 = (C1295960jpS) awS127S0400000_33.l2;
            c1295960jpS3.getDrawable().setVisible(true, false);
            c1295960jpS3.playAnimation();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS127S0400000_33 awS127S0400000_33, Object obj) {
        EnumC21166217sK enumC21166217sK;
        User author;
        EnumC2174841A9q enumC2174841A9q = ((C2174851A9r) obj).LL;
        if (((VideoRelationBtnVMV2) awS127S0400000_33.l0).LL != null) {
            if (((FollowStatus) awS127S0400000_33.l1).getFollowStatus() == 0) {
                if (enumC2174841A9q == EnumC2174841A9q.SEND_A_WAVE) {
                    ((VideoRelationBtnVMV2) awS127S0400000_33.l0).wQ2((Aweme) awS127S0400000_33.l2, EnumC2174841A9q.HIDDEN);
                }
            } else if (enumC2174841A9q == EnumC2174841A9q.FOLLOW_SINGLE || enumC2174841A9q == EnumC2174841A9q.FOLLOW_DUAL) {
                VideoRelationBtnVMV2 videoRelationBtnVMV2 = (VideoRelationBtnVMV2) awS127S0400000_33.l0;
                Aweme aweme = (Aweme) awS127S0400000_33.l2;
                List list = (List) awS127S0400000_33.l3;
                videoRelationBtnVMV2.getClass();
                if (!C10EU.LJIIIIZZ() && !C0R93.LIZ(videoRelationBtnVMV2.eventType) && aweme != null && (author = aweme.getAuthor()) != null && list.contains(Integer.valueOf(author.getFollowStatus()))) {
                    enumC21166217sK = EnumC21166217sK.SEND_A_WAVE;
                } else {
                    enumC21166217sK = EnumC21166217sK.NA;
                }
                if (enumC21166217sK == EnumC21166217sK.NA) {
                    ((VideoRelationBtnVMV2) awS127S0400000_33.l0).wQ2((Aweme) awS127S0400000_33.l2, EnumC2174841A9q.HIDDEN);
                } else {
                    ((VideoRelationBtnVMV2) awS127S0400000_33.l0).wQ2((Aweme) awS127S0400000_33.l2, EnumC2174841A9q.SEND_A_WAVE);
                }
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS127S0400000_33(C11KT c11kt, C1AGN c1agn, C1295960jpS c1295960jpS, PathAnimationValue pathAnimationValue, int i) {
        super(1);
        this.$t = i;
        this.l0 = c11kt;
        this.l1 = c1agn;
        this.l2 = c1295960jpS;
        this.l3 = pathAnimationValue;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS127S0400000_33(VideoRelationBtnVMV2 videoRelationBtnVMV2, VideoRelationBtnVMV2 videoRelationBtnVMV22, FollowStatus followStatus, Aweme aweme, List<Integer> list) {
        super(1);
        this.$t = list;
        this.l0 = videoRelationBtnVMV2;
        this.l1 = videoRelationBtnVMV22;
        this.l2 = followStatus;
        this.l3 = aweme;
    }
}
