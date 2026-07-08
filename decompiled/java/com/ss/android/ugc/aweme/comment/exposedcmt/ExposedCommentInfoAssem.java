package com.ss.android.ugc.aweme.comment.exposedcmt;

import X.C12ES;
import X.C1308910kAL;
import X.C1344220l5I;
import X.C13LE;
import X.C13LP;
import X.C14EU;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1590970rVH;
import X.C19EG;
import X.C20684815ws;
import X.C2217381BqS;
import X.C622680Oba;
import X.C628500Oky;
import X.C630740Ooa;
import X.C708350RqT;
import X.C724240Sb0;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.C888460YtI;
import X.EnumC700430Rdh;
import X.InterfaceC1554640qYg;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import Y.ACListenerS146S0100000_11;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.comment.api.IExposedCommentAbility;
import com.ss.android.ugc.aweme.comment.api.IExposedCommentDataAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.ExposedCommentInfo;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AFwS294S0000000_11;
import kotlin.jvm.internal.AwS125S1100000_11;
import kotlin.jvm.internal.AwS377S0200000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes12.dex */
public final class ExposedCommentInfoAssem extends BaseCellSlotComponent<ExposedCommentInfoAssem> implements IExposedCommentAbility, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLFZ;
    public LinearLayout LLJLLIL;
    public SmartAvatarImageView LLJLLL;
    public TuxTextView LLJZ;
    public ExposedCommentInfo LLJZIJLIL;
    public IExposedCommentDataAbility LLLF;
    public final C708350RqT LLL = new C708350RqT(this);
    public final C630740Ooa LLLFF = C628500Oky.LIZ(new AwS555S0100000_11(this, 79));
    public final Set<String> LLLFFI = new LinkedHashSet();

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ExposedCommentInfoAssem.class, "exposedCommentVM", "getExposedCommentVM()Lcom/ss/android/ugc/aweme/comment/exposedcmt/ExposedCommentVM;", 0);
        C13LE.LIZ.getClass();
        LLLFZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.bbt;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -1620210743) {
            return null;
        }
        return this;
    }

    public final ExposedCommentVM Bp() {
        return (ExposedCommentVM) this.LLL.getValue(this, LLLFZ[0]);
    }

    @Override // com.ss.android.ugc.aweme.comment.api.IExposedCommentAbility
    public final void MP0() {
        C786410Ut5.LJLLLLLL(8, LJJIJL());
    }

    @Override // com.ss.android.ugc.aweme.comment.api.IExposedCommentAbility
    public final boolean Re2() {
        return LJJIJL().getVisibility() == 0;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        C622680Oba.LIZLLL(this);
        this.LLLFFI.clear();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem, com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        if (!C622680Oba.LIZ(this)) {
            C622680Oba.LIZJ(this);
        }
        final C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            IExposedCommentDataAbility iExposedCommentDataAbility = (IExposedCommentDataAbility) C1558520qew.LIZ(C1558360qeg.LJI(c19egLIZ, null), IExposedCommentDataAbility.class, null);
            this.LLLF = iExposedCommentDataAbility;
            if (iExposedCommentDataAbility == null) {
                C1558520qew.LJII(C1558360qeg.LJI(c19egLIZ, null), new ExposedCommentRepo(), IExposedCommentDataAbility.class, null, null);
                this.LLLF = (IExposedCommentDataAbility) C1558520qew.LIZ(C1558360qeg.LJI(c19egLIZ, null), IExposedCommentDataAbility.class, null);
                LifecycleOwner lifecycleOwnerLIZ = C1590970rVH.LIZ(this);
                if (lifecycleOwnerLIZ == null) {
                    lifecycleOwnerLIZ = c19egLIZ;
                }
                lifecycleOwnerLIZ.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.comment.exposedcmt.ExposedCommentInfoAssem$loadAbility$1
                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                        if (event == Lifecycle.Event.ON_DESTROY) {
                            C1558520qew.LJIIJJI(C1558360qeg.LJI(c19egLIZ, null), IExposedCommentDataAbility.class, null);
                        }
                    }
                });
            }
            ExposedCommentVM exposedCommentVMBp = Bp();
            IExposedCommentDataAbility iExposedCommentDataAbility2 = this.LLLF;
            if (iExposedCommentDataAbility2 == null) {
                exposedCommentVMBp.getClass();
            } else {
                exposedCommentVMBp.LL = iExposedCommentDataAbility2;
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onUserBlockEvent(C888460YtI c888460YtI) {
        String uid;
        ExposedCommentVM exposedCommentVMBp = Bp();
        exposedCommentVMBp.getClass();
        User user = c888460YtI.LIZ;
        if (user != null && (uid = user.getUid()) != null && uid.length() != 0) {
            exposedCommentVMBp.withState(new AwS125S1100000_11(uid, exposedCommentVMBp, 19));
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        int iIntValue;
        super.onViewCreated(view);
        this.LLJLLIL = (LinearLayout) view.findViewById(R.id.ilz);
        this.LLJLLL = (SmartAvatarImageView) view.findViewById(R.id.ebb);
        this.LLJZ = (TuxTextView) view.findViewById(R.id.ebc);
        LinearLayout linearLayout = this.LLJLLIL;
        LinearLayout linearLayout2 = null;
        if (linearLayout == null) {
            linearLayout = null;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        Context context = getContext();
        if (context != null) {
            gradientDrawable.setCornerRadius(C12ES.LIZJ(8.0f, context));
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.e4, context);
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = 0;
            }
            gradientDrawable.setColor(iIntValue);
        }
        linearLayout.setBackground(gradientDrawable);
        LinearLayout linearLayout3 = this.LLJLLIL;
        if (linearLayout3 == null) {
            linearLayout3 = null;
        }
        setComponentClickStatusExperimental(linearLayout3, EnumC700430Rdh.POSITIVE);
        LinearLayout linearLayout4 = this.LLJLLIL;
        if (linearLayout4 != null) {
            linearLayout2 = linearLayout4;
        }
        C786410Ut5.R7(linearLayout2, new ACListenerS146S0100000_11(this, 0));
        C736680Sv4.LJIIIIZZ(this, Bp(), new C2217381BqS() { // from class: X.0RZO
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0RZV) obj).LL;
            }
        }, C736820SvI.LIZLLL(), AFwS294S0000000_11.get$arr$(316), 4);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void tp(VideoItemParams videoItemParams) {
        ExposedCommentInfo exposedCommentInfo;
        Set<String> setPo0;
        VideoItemParams videoItemParams2 = videoItemParams;
        C786410Ut5.LJLLLLLL(8, LJJIJL());
        C1344220l5I c1344220l5I = C1344220l5I.LIZ;
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        Aweme aweme = videoItemParams2.getAweme();
        c1344220l5I.getClass();
        C1344220l5I.LJ(aweme, c19egLIZ);
        ExposedCommentVM exposedCommentVMBp = Bp();
        exposedCommentVMBp.getClass();
        String aid = videoItemParams2.getAweme().getAid();
        if (aid != null) {
            List<ExposedCommentInfo> exposedCommentInfoList = videoItemParams2.getAweme().getExposedCommentInfoList();
            if (exposedCommentInfoList != null && (exposedCommentInfo = (ExposedCommentInfo) C13LP.LJJJLL(exposedCommentInfoList)) != null) {
                IExposedCommentDataAbility iExposedCommentDataAbility = exposedCommentVMBp.LL;
                if (iExposedCommentDataAbility != null && (setPo0 = iExposedCommentDataAbility.po0()) != null && setPo0.contains(exposedCommentInfo.commentUserId)) {
                    IExposedCommentDataAbility iExposedCommentDataAbility2 = exposedCommentVMBp.LL;
                    if (iExposedCommentDataAbility2 == null || !iExposedCommentDataAbility2.Lw0(aid)) {
                        exposedCommentVMBp.setState(AFwS243S0000000_11.get$arr$(827));
                        return;
                    }
                } else {
                    exposedCommentVMBp.setState(new AwS377S0200000_11(ExposedCommentVM.vQ2(videoItemParams2), exposedCommentInfo, 177));
                    return;
                }
            }
            exposedCommentVMBp.setState(AFwS243S0000000_11.get$arr$(828));
            IExposedCommentDataAbility iExposedCommentDataAbility3 = exposedCommentVMBp.LL;
            if (iExposedCommentDataAbility3 != null) {
                iExposedCommentDataAbility3.gg1(15, videoItemParams2.getAweme(), videoItemParams2.mEventType, new AwS377S0200000_11(exposedCommentVMBp, videoItemParams2, 179));
            }
        }
    }

    public static void Ep(String str, Aweme aweme, ExposedCommentInfo exposedCommentInfo) {
        User author;
        String uid;
        Pair[] pairArr = new Pair[6];
        pairArr[0] = new Pair("homepage_friends", "enter_from");
        String aid = null;
        if (aweme != null) {
            aid = aweme.getAid();
        }
        String str2 = "";
        if (aid == null) {
            aid = "";
        }
        pairArr[1] = new Pair(aid, "group_id");
        if (aweme != null && (author = aweme.getAuthor()) != null && (uid = author.getUid()) != null) {
            str2 = uid;
        }
        pairArr[2] = new Pair(str2, "author_id");
        pairArr[3] = new Pair(exposedCommentInfo.commentId, "comment_id");
        pairArr[4] = new Pair(exposedCommentInfo.commentUserId, "comment_user_id");
        pairArr[5] = new Pair(Integer.valueOf(exposedCommentInfo.followStatusRelation), "follow_status_relation");
        C20684815ws.LJIJI(str, pairArr);
    }
}
