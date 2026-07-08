package kotlin.jvm.internal;

import X.C09AY;
import X.C197039127h;
import X.C2174861A9s;
import X.C418440Gaw;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C814420VxA;
import X.C912160ZqQ;
import X.EnumC2174841A9q;
import X.InterfaceC1631620sYq;
import Y.ARunnableS133S0100000_33;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.feed.assem.relationbtn.VideoRelationBtnAssemV2;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Unit;

/* JADX INFO: loaded from: classes34.dex */
public class AFwS356S0000000_33 extends C09AY implements InterfaceC1631620sYq {
    public static final /* synthetic */ AtomicReferenceArray arr$ = new AtomicReferenceArray(3);
    public final int $t;

    public static AFwS356S0000000_33 get$arr$(int i) {
        AFwS356S0000000_33 aFwS356S0000000_33 = (AFwS356S0000000_33) arr$.get(i);
        if (aFwS356S0000000_33 != null) {
            return aFwS356S0000000_33;
        }
        arr$.compareAndSet(i, null, new AFwS356S0000000_33(i));
        return (AFwS356S0000000_33) arr$.get(i);
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            case 2:
                return invoke$2(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFwS356S0000000_33(int i) {
        super(3);
        this.$t = i;
    }

    public static final Object invoke$0(AFwS356S0000000_33 aFwS356S0000000_33, Object obj, Object obj2, Object obj3) {
        String uid;
        User author;
        User author2;
        VideoRelationBtnAssemV2 videoRelationBtnAssemV2 = (VideoRelationBtnAssemV2) obj;
        int i = C2174861A9s.LIZ[((EnumC2174841A9q) obj2).ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4 && (obj3 == EnumC2174841A9q.DEFAULT || obj3 == EnumC2174841A9q.HIDDEN)) {
                        HandlerHook.viewPost(videoRelationBtnAssemV2.LJJIJL(), new ARunnableS133S0100000_33(videoRelationBtnAssemV2, 54));
                        videoRelationBtnAssemV2.Qp(false);
                    }
                } else if (obj3 == EnumC2174841A9q.FOLLOW_DUAL) {
                    videoRelationBtnAssemV2.Gp();
                } else if (obj3 == EnumC2174841A9q.DEFAULT || obj3 == EnumC2174841A9q.HIDDEN) {
                    HandlerHook.viewPost(videoRelationBtnAssemV2.LJJIJL(), new ARunnableS133S0100000_33(videoRelationBtnAssemV2, 54));
                    videoRelationBtnAssemV2.Qp(false);
                }
            } else {
                C736680Sv4.LJIJJ(videoRelationBtnAssemV2.Ip(), new AwS612S0100000_33(videoRelationBtnAssemV2, 216));
            }
        } else if ((obj3 == EnumC2174841A9q.FOLLOW_DUAL || obj3 == EnumC2174841A9q.FOLLOW_SINGLE) && videoRelationBtnAssemV2.LLJLLIL != null) {
            RelationButton relationButton = videoRelationBtnAssemV2.LLJLLL;
            if (relationButton != null) {
                C786410Ut5.t0(relationButton, 8);
            }
            C197039127h c197039127h = videoRelationBtnAssemV2.LLJZ;
            if (c197039127h != null) {
                C786410Ut5.LLLLLLJ(c197039127h, 8);
            }
            C197039127h c197039127h2 = videoRelationBtnAssemV2.LLJZIJLIL;
            if (c197039127h2 != null) {
                ViewGroup.LayoutParams layoutParams = c197039127h2.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = videoRelationBtnAssemV2.LLLF;
                    VideoRelationBtnAssemV2.LLLILZJ.getClass();
                    layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(VideoRelationBtnAssemV2.LLLJ.getValue().floatValue())));
                    C786410Ut5.W5(c197039127h2, layoutParams);
                    C786410Ut5.w5(c197039127h2, 1.0f);
                    C786410Ut5.LLLLLLJ(c197039127h2, 0);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(videoRelationBtnAssemV2.Ep(0, videoRelationBtnAssemV2.LLJZIJLIL, videoRelationBtnAssemV2.LLLFF, videoRelationBtnAssemV2.LLLF, 125L)).with(videoRelationBtnAssemV2.Ep(0, videoRelationBtnAssemV2.LLJZ, videoRelationBtnAssemV2.LLLFF, 0.0f, 125L));
            animatorSet.start();
            String str = videoRelationBtnAssemV2.LLLIILIL;
            Aweme aweme = videoRelationBtnAssemV2.LLL;
            String recType = null;
            if (aweme != null && (author2 = aweme.getAuthor()) != null) {
                uid = author2.getUid();
            } else {
                uid = null;
            }
            if (str != null && uid != null) {
                Aweme aweme2 = videoRelationBtnAssemV2.LLL;
                if (aweme2 != null && (author = aweme2.getAuthor()) != null) {
                    recType = author.getRecType();
                }
                C912160ZqQ.LIZIZ(str, recType, uid);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* bridge */ /* synthetic */ java.lang.Object invoke$1(kotlin.jvm.internal.AFwS356S0000000_33 r5, java.lang.Object r6, java.lang.Object r7, java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AFwS356S0000000_33.invoke$1(kotlin.jvm.internal.AFwS356S0000000_33, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* bridge */ /* synthetic */ java.lang.Object invoke$2(kotlin.jvm.internal.AFwS356S0000000_33 r6, java.lang.Object r7, java.lang.Object r8, java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AFwS356S0000000_33.invoke$2(kotlin.jvm.internal.AFwS356S0000000_33, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
