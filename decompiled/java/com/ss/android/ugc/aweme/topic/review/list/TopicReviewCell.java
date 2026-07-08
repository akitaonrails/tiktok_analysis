package com.ss.android.ugc.aweme.topic.review.list;

import X.AbstractC848400XPy;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03IT;
import X.C03K6;
import X.C09R3;
import X.C0XQ7;
import X.C1202310hOP;
import X.C1247510iZJ;
import X.C12DM;
import X.C1390850mIV;
import X.C1391850mK7;
import X.C13LE;
import X.C1602160rnK;
import X.C1848410yCV;
import X.C1908030zkf;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2211941Bhg;
import X.C2213981Bky;
import X.C2215101Bmm;
import X.C2217381BqS;
import X.C306780C0u;
import X.C418440Gaw;
import X.C418540Gb6;
import X.C419910GdJ;
import X.C426750GoL;
import X.C427660Gpo;
import X.C452080Ho6;
import X.C452501pT;
import X.C626770OiB;
import X.C626790OiD;
import X.C626800OiE;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.C946803n0;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import Y.ACListenerS135S0200000_33;
import Y.ACListenerS144S0100000_9;
import Y.ALAdapterS14S0100000_18;
import Y.AUListenerS256S0100000_6;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import avg.f;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.actionsheet.TuxActionSheet;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.topic.review.list.TopicReviewCell;
import com.ss.android.ugc.aweme.topic.review.model.TopicReview;
import com.ss.android.ugc.aweme.topic.review.panel.TopicReviewPanel;
import com.ss.android.ugc.aweme.topic.review.vm.TopicReviewListVM;
import com.ss.android.ugc.aweme.topic.review.vm.TopicReviewVM;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS218S0300000_9;
import kotlin.jvm.internal.AwS375S0200000_9;
import kotlin.jvm.internal.AwS434S0200000_33;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.Intrinsics;
import mf.a;

/* JADX INFO: loaded from: classes34.dex */
public final class TopicReviewCell extends PowerCell<C626770OiB> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public final AssemVMLazy LL;
    public final AssemVMLazy LLILLJJLI;
    public C427660Gpo LLILLL;
    public TuxTextView LLILZ;
    public C418540Gb6 LLILZIL;
    public C1202310hOP LLILZLL;
    public TuxTextView LLIZ;
    public TuxTextView LLIZLLLIL;
    public TuxTextView LLJ;
    public TuxTextView LLJI;
    public TuxIconView LLJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TopicReviewCell.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/topic/review/vm/TopicReviewListVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(TopicReviewCell.class, "topicReviewVM", "getTopicReviewVM()Lcom/ss/android/ugc/aweme/topic/review/vm/TopicReviewVM;", 0);
        c09r3.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public TopicReviewCell() {
        AssemVMLazy assemVMLazy;
        AssemVMLazy assemVMLazy2;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TopicReviewListVM.class);
        AwS577S0100000_33 awS577S0100000_33 = new AwS577S0100000_33(c19719912DlLIZ, 3615);
        AFwS279S0000000_33 aFwS279S0000000_33 = AFwS279S0000000_33.get$arr$(254);
        Object obj2 = C01D1.LIZ;
        if (Intrinsics.LJFF(obj, obj2)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 3602), awS577S0100000_33, AFwS224S0000000_33.get$arr$(497), new AwS577S0100000_33((C03K6) this, 3592), new AwS577S0100000_33((C03K6) this, 3603), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 3606), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 3609), null, new AwS577S0100000_33((C03K6) this, 3612));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS577S0100000_33 awS577S0100000_332 = new AwS577S0100000_33((C03K6) this, 3588);
            AwS577S0100000_33 awS577S0100000_333 = new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 3590);
            AwS577S0100000_33 awS577S0100000_334 = new AwS577S0100000_33(c19719912DlLIZ, 3593);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS434S0200000_33((InterfaceC451590HnJ) obj, awS577S0100000_332, 139));
            AwS577S0100000_33 awS577S0100000_335 = new AwS577S0100000_33(c01gwLIZIZ, 3598);
            AwS577S0100000_33 awS577S0100000_336 = new AwS577S0100000_33(c01gwLIZIZ, 3601);
            AwS577S0100000_33 awS577S0100000_337 = new AwS577S0100000_33(c01gwLIZIZ, 3604);
            AwS577S0100000_33 awS577S0100000_338 = new AwS577S0100000_33(c01gwLIZIZ, 3607);
            AwS577S0100000_33 awS577S0100000_339 = new AwS577S0100000_33(c01gwLIZIZ, 3610);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS577S0100000_334, awS577S0100000_33, new C452080Ho6(), awS577S0100000_335, awS577S0100000_336, awS577S0100000_333, aFwS279S0000000_33, awS577S0100000_337, awS577S0100000_338, awS577S0100000_339);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 3613), awS577S0100000_33, AFwS224S0000000_33.get$arr$(496), new AwS577S0100000_33((C03K6) this, 3617), new AwS577S0100000_33((C03K6) this, 3619), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 3621), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 3623), null, new AwS577S0100000_33((C03K6) this, 3625));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 3626), awS577S0100000_33, AFwS224S0000000_33.get$arr$(498), new AwS577S0100000_33((C03K6) this, 3628), new AwS577S0100000_33((C03K6) this, 3630), new AwS577S0100000_33((C03K6) this, 3633), aFwS279S0000000_33, null, null, new AwS577S0100000_33((C03K6) this, 3582));
        }
        this.LL = assemVMLazy;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(TopicReviewVM.class);
        AwS577S0100000_33 awS577S0100000_3310 = new AwS577S0100000_33(c19719912DlLIZ2, 3584);
        AFwS279S0000000_33 aFwS279S0000000_332 = AFwS279S0000000_33.get$arr$(253);
        if (Intrinsics.LJFF(obj2, obj2)) {
            assemVMLazy2 = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ2, 3587), awS577S0100000_3310, AFwS224S0000000_33.get$arr$(495), new AwS577S0100000_33((C03K6) this, 3591), new AwS577S0100000_33((C03K6) this, 3594), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 3596), aFwS279S0000000_332, new AwS577S0100000_33((C03K6) this, 3599), null, new AwS577S0100000_33((C03K6) this, 3605));
        } else if (obj2 instanceof InterfaceC451590HnJ) {
            AwS577S0100000_33 awS577S0100000_3311 = new AwS577S0100000_33((C03K6) this, 3608);
            AwS577S0100000_33 awS577S0100000_3312 = new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 3611);
            AwS577S0100000_33 awS577S0100000_3313 = new AwS577S0100000_33(c19719912DlLIZ2, 3614);
            C01GW c01gwLIZIZ2 = C452501pT.LIZIZ(new AwS434S0200000_33((InterfaceC451590HnJ) obj2, awS577S0100000_3311, 140));
            AwS577S0100000_33 awS577S0100000_3314 = new AwS577S0100000_33(c01gwLIZIZ2, 3616);
            AwS577S0100000_33 awS577S0100000_3315 = new AwS577S0100000_33(c01gwLIZIZ2, 3618);
            AwS577S0100000_33 awS577S0100000_3316 = new AwS577S0100000_33(c01gwLIZIZ2, 3620);
            AwS577S0100000_33 awS577S0100000_3317 = new AwS577S0100000_33(c01gwLIZIZ2, 3622);
            AwS577S0100000_33 awS577S0100000_3318 = new AwS577S0100000_33(c01gwLIZIZ2, 3624);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = C737910Sx3.LIZ;
            assemVMLazy2 = new AssemVMLazy(awS577S0100000_3313, awS577S0100000_3310, new C452080Ho6(), awS577S0100000_3314, awS577S0100000_3315, awS577S0100000_3312, aFwS279S0000000_332, awS577S0100000_3316, awS577S0100000_3317, awS577S0100000_3318);
        } else if (Intrinsics.LJFF(obj2, obj)) {
            assemVMLazy2 = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ2, 3627), awS577S0100000_3310, AFwS224S0000000_33.get$arr$(499), new AwS577S0100000_33((C03K6) this, 3629), new AwS577S0100000_33((C03K6) this, 3631), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 3632), aFwS279S0000000_332, new AwS577S0100000_33((C03K6) this, 3583), null, new AwS577S0100000_33((C03K6) this, 3585));
        } else {
            if (!Intrinsics.LJFF(obj2, C03IJ.LIZ)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Don't support this VMScope: ");
                sbLIZ2.append(obj2);
                sbLIZ2.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
            }
            assemVMLazy2 = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ2, 3586), awS577S0100000_3310, AFwS224S0000000_33.get$arr$(494), new AwS577S0100000_33((C03K6) this, 3589), new AwS577S0100000_33((C03K6) this, 3595), new AwS577S0100000_33((C03K6) this, 3597), aFwS279S0000000_332, null, null, new AwS577S0100000_33((C03K6) this, 3600));
        }
        this.LLILLJJLI = assemVMLazy2;
    }

    public final TopicReviewVM I5() {
        AssemVMLazy assemVMLazy = this.LLILLJJLI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
        return (TopicReviewVM) assemVMLazy.getValue();
    }

    public final TopicReviewListVM L5() {
        AssemVMLazy assemVMLazy = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
        return (TopicReviewListVM) assemVMLazy.getValue();
    }

    public final void N5() {
        FragmentManager fragmentManager;
        C626770OiB item;
        TopicReview topicReview;
        Fragment fragmentLIZ = C946803n0.LIZ(this.itemView);
        if (fragmentLIZ == null || (fragmentManager = fragmentLIZ.getFragmentManager()) == null || (item = getItem()) == null || (topicReview = item.LL) == null) {
            return;
        }
        C626800OiE.LIZ(TopicReviewPanel.LLJJI, fragmentManager, null, topicReview, true, null, 18);
    }

    public final void P5() {
        FragmentManager fragmentManager;
        C626770OiB item;
        TopicReview topicReview;
        Fragment fragmentLIZ = C946803n0.LIZ(this.itemView);
        if (fragmentLIZ == null || (fragmentManager = fragmentLIZ.getFragmentManager()) == null || (item = getItem()) == null || (topicReview = item.LL) == null) {
            return;
        }
        C1390850mIV c1390850mIV = new C1390850mIV();
        if (Intrinsics.LJFF(topicReview.user.getUid(), ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId())) {
            C1247510iZJ c1247510iZJ = new C1247510iZJ();
            c1247510iZJ.LIZIZ(2131827865);
            c1247510iZJ.LIZ(new AwS218S0300000_9(this, fragmentManager, topicReview, 13));
            C1247510iZJ c1247510iZJ2 = new C1247510iZJ();
            c1247510iZJ2.LIZIZ(2131827864);
            c1247510iZJ2.LIZJ = 1;
            c1247510iZJ2.LIZ(new AwS375S0200000_9(this, topicReview, 103));
            c1390850mIV.LIZIZ(c1247510iZJ, c1247510iZJ2);
        } else {
            c1390850mIV.LIZ.LLJJIJI = C786410Ut5.j4(this.itemView.getContext().getString(2131827872), Arrays.copyOf(new Object[]{topicReview.user.getNickname()}, 1));
            C1247510iZJ c1247510iZJ3 = new C1247510iZJ();
            c1247510iZJ3.LIZIZ(2131827871);
            c1247510iZJ3.LIZ(new AwS375S0200000_9(this, topicReview, 104));
            c1390850mIV.LIZIZ(c1247510iZJ3);
        }
        c1390850mIV.LIZLLL(2131827870);
        TuxActionSheet tuxActionSheetLIZJ = c1390850mIV.LIZJ();
        C1391850mK7.LIZIZ(tuxActionSheetLIZJ, "bookanchordetail_book_review_score_report_nscreen");
        tuxActionSheetLIZJ.show(fragmentManager, "TopicReviewMenuPanel");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.LLILLL = (C427660Gpo) this.itemView.findViewById(R.id.bh2);
        this.LLILZ = (TuxTextView) this.itemView.findViewById(R.id.p09);
        this.LLILZIL = (C418540Gb6) this.itemView.findViewById(R.id.srg);
        this.LLILZLL = (C1202310hOP) this.itemView.findViewById(R.id.text);
        this.LLIZ = (TuxTextView) this.itemView.findViewById(R.id.a0x);
        this.LLIZLLLIL = (TuxTextView) this.itemView.findViewById(R.id.ffs);
        this.LLJ = (TuxTextView) this.itemView.findViewById(R.id.gnd);
        this.LLJI = (TuxTextView) this.itemView.findViewById(R.id.mo7);
        this.LLJIJIL = (TuxIconView) this.itemView.findViewById(R.id.mnv);
        if (C306780C0u.LIZ()) {
            C426750GoL.LJIIL(this.itemView.findViewById(R.id.m6p), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), 16);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        TopicReview topicReview;
        super.onViewAttachedToWindow();
        C626770OiB item = getItem();
        if (item == null || (topicReview = item.LL) == null) {
            return;
        }
        L5().LLILZ.LIZ.put(topicReview.reviewId, Long.valueOf(System.currentTimeMillis()));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewDetachedFromWindow() {
        TopicReview topicReview;
        super.onViewDetachedFromWindow();
        C626770OiB item = getItem();
        if (item == null || (topicReview = item.LL) == null) {
            return;
        }
        C626790OiD c626790OiD = L5().LLILZ;
        Long lRemove = c626790OiD.LIZ.remove(topicReview.reviewId);
        if (lRemove != null) {
            long jCurrentTimeMillis = System.currentTimeMillis() - lRemove.longValue();
            HashMap<String, Long> map = c626790OiD.LIZIZ;
            String str = topicReview.reviewId;
            Long l = map.get(str);
            map.put(str, Long.valueOf((l != null ? l.longValue() : 0L) + jCurrentTimeMillis));
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.fw9, viewGroup, false);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl, List list) {
        UrlModel avatarLarger;
        List<String> urlList;
        int i;
        int i2;
        String str;
        CharSequence charSequence;
        String str2;
        C626770OiB c626770OiB = (C626770OiB) interfaceC1891350zJl;
        final int i3 = 0;
        this.itemView.setOnLongClickListener(new View.OnLongClickListener(this, i3) { // from class: X.1Amj
            public final int $t;
            public Object l0;

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                switch (this.$t) {
                    case 0:
                        return onLongClick$0(this, view);
                    case 1:
                        return onLongClick$1(this, view);
                    default:
                        return false;
                }
            }

            {
                this.$t = i3;
                this.l0 = this;
            }

            public static final boolean onLongClick$0(ViewOnLongClickListenerC2189591Amj viewOnLongClickListenerC2189591Amj, View view) {
                ((TopicReviewCell) viewOnLongClickListenerC2189591Amj.l0).P5();
                return true;
            }

            public static final boolean onLongClick$1(ViewOnLongClickListenerC2189591Amj viewOnLongClickListenerC2189591Amj, View view) {
                ((TopicReviewCell) viewOnLongClickListenerC2189591Amj.l0).P5();
                return true;
            }
        });
        C427660Gpo c427660Gpo = this.LLILLL;
        if (c427660Gpo == null) {
            c427660Gpo = null;
        }
        User user = c626770OiB.LL.user;
        UrlModel avatarMedium = user.getAvatarMedium();
        if ((avatarMedium == null || (urlList = avatarMedium.getUrlList()) == null) && ((avatarLarger = user.getAvatarLarger()) == null || (urlList = avatarLarger.getUrlList()) == null)) {
            UrlModel avatarThumb = user.getAvatarThumb();
            if (avatarThumb != null) {
                urlList = avatarThumb.getUrlList();
            } else {
                urlList = null;
            }
        }
        C427660Gpo.LJIIJJI(c427660Gpo, new C03IT(urlList), false, null, null, false, false, null, null, false, null, 1022);
        C786410Ut5.T8(c427660Gpo, new ACListenerS144S0100000_9(this, 147));
        TuxTextView tuxTextView = this.LLILZ;
        if (tuxTextView == null) {
            tuxTextView = null;
        }
        tuxTextView.setText(c626770OiB.LL.user.getNickname());
        Context context = this.itemView.getContext();
        String customVerify = c626770OiB.LL.user.getCustomVerify();
        String enterpriseVerifyReason = c626770OiB.LL.user.getEnterpriseVerifyReason();
        TuxTextView tuxTextView2 = this.LLILZ;
        if (tuxTextView2 == null) {
            tuxTextView2 = null;
        }
        C1908030zkf.LJI(context, customVerify, enterpriseVerifyReason, tuxTextView2);
        C418540Gb6 c418540Gb6 = this.LLILZIL;
        if (c418540Gb6 == null) {
            c418540Gb6 = null;
        }
        c418540Gb6.setRatingValue(c626770OiB.LL.topicRating);
        C418540Gb6 c418540Gb62 = this.LLILZIL;
        if (c418540Gb62 == null) {
            c418540Gb62 = null;
        }
        c418540Gb62.setRatingSize(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
        C418540Gb6 c418540Gb63 = this.LLILZIL;
        if (c418540Gb63 == null) {
            c418540Gb63 = null;
        }
        c418540Gb63.setRatingSpacing(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)));
        C418540Gb6 c418540Gb64 = this.LLILZIL;
        if (c418540Gb64 == null) {
            c418540Gb64 = null;
        }
        c418540Gb64.setRatingEnableTouch(false);
        TuxTextView tuxTextView3 = this.LLIZLLLIL;
        if (tuxTextView3 == null) {
            tuxTextView3 = null;
        }
        tuxTextView3.setText(C2215101Bmm.LJ(c626770OiB.LL.updateTime * ((long) LSPassThroughRecordSizeConfig.DEFAULT)));
        if (Intrinsics.LJFF(c626770OiB.LL.user.getUid(), ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId()) && (str2 = c626770OiB.LL.text) != null && str2.length() != 0) {
            TuxTextView tuxTextView4 = this.LLJ;
            if (tuxTextView4 == null) {
                tuxTextView4 = null;
            }
            C786410Ut5.LLLLZLL(tuxTextView4, 0);
            TuxTextView tuxTextView5 = this.LLJ;
            if (tuxTextView5 == null) {
                tuxTextView5 = null;
            }
            C786410Ut5.h9(tuxTextView5, new ACListenerS144S0100000_9(this, 148));
        } else {
            TuxTextView tuxTextView6 = this.LLJ;
            if (tuxTextView6 == null) {
                tuxTextView6 = null;
            }
            C786410Ut5.LLLLZLL(tuxTextView6, 8);
        }
        TuxTextView tuxTextView7 = this.LLJI;
        if (tuxTextView7 == null) {
            tuxTextView7 = null;
        }
        if (c626770OiB.LL.diggCount > 0) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LLLLZLL(tuxTextView7, i);
        TuxTextView tuxTextView8 = this.LLJI;
        if (tuxTextView8 == null) {
            tuxTextView8 = null;
        }
        tuxTextView8.setText(String.valueOf(c626770OiB.LL.diggCount));
        TuxTextView tuxTextView9 = this.LLJI;
        if (tuxTextView9 == null) {
            tuxTextView9 = null;
        }
        C786410Ut5.h9(tuxTextView9, new ACListenerS135S0200000_33(this, c626770OiB, 18));
        TuxIconView tuxIconView = this.LLJIJIL;
        if (tuxIconView == null) {
            tuxIconView = null;
        }
        C786410Ut5.a9(tuxIconView, new ACListenerS135S0200000_33(this, c626770OiB, 19));
        if (c626770OiB.LL.userDigged) {
            TuxTextView tuxTextView10 = this.LLJI;
            if (tuxTextView10 == null) {
                tuxTextView10 = null;
            }
            tuxTextView10.setTextColorRes(R.attr.a04);
            TuxIconView tuxIconView2 = this.LLJIJIL;
            if (tuxIconView2 == null) {
                tuxIconView2 = null;
            }
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_heart_fill;
            tuxIconView2.setTuxIcon(c419910GdJ);
            TuxIconView tuxIconView3 = this.LLJIJIL;
            if (tuxIconView3 == null) {
                tuxIconView3 = null;
            }
            tuxIconView3.setTintColorRes(R.attr.a04);
        } else {
            TuxTextView tuxTextView11 = this.LLJI;
            if (tuxTextView11 == null) {
                tuxTextView11 = null;
            }
            tuxTextView11.setTextColorRes(R.attr.a1p);
            TuxIconView tuxIconView4 = this.LLJIJIL;
            if (tuxIconView4 == null) {
                tuxIconView4 = null;
            }
            C419910GdJ c419910GdJ2 = new C419910GdJ();
            c419910GdJ2.LIZ = R.raw.icon_heart;
            tuxIconView4.setTuxIcon(c419910GdJ2);
            TuxIconView tuxIconView5 = this.LLJIJIL;
            if (tuxIconView5 == null) {
                tuxIconView5 = null;
            }
            tuxIconView5.setTintColorRes(R.attr.a1k);
        }
        C1202310hOP c1202310hOP = this.LLILZLL;
        if (c1202310hOP == null) {
            c1202310hOP = null;
        }
        String str3 = c626770OiB.LL.text;
        if (str3 != null && str3.length() != 0) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        int visibility = c1202310hOP.getVisibility();
        c1202310hOP.setVisibility(i2);
        C1602160rnK.LIZIZ(visibility, i2, c1202310hOP);
        String str4 = c626770OiB.LL.text;
        if (str4 == null) {
            str4 = "";
        }
        c1202310hOP.setOriginalText(str4);
        View.OnClickListener aCListenerS135S0200000_33 = new ACListenerS135S0200000_33(this, c626770OiB, 20);
        if (C1848410yCV.LIZ) {
            aCListenerS135S0200000_33 = new f(aCListenerS135S0200000_33);
        }
        a aVar = new a(aCListenerS135S0200000_33);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c1202310hOP);
        }
        c1202310hOP.setOnClickListener(aVar);
        final int i4 = 1;
        c1202310hOP.setOnLongClickListener(new View.OnLongClickListener(this, i4) { // from class: X.1Amj
            public final int $t;
            public Object l0;

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                switch (this.$t) {
                    case 0:
                        return onLongClick$0(this, view);
                    case 1:
                        return onLongClick$1(this, view);
                    default:
                        return false;
                }
            }

            {
                this.$t = i4;
                this.l0 = this;
            }

            public static final boolean onLongClick$0(ViewOnLongClickListenerC2189591Amj viewOnLongClickListenerC2189591Amj, View view) {
                ((TopicReviewCell) viewOnLongClickListenerC2189591Amj.l0).P5();
                return true;
            }

            public static final boolean onLongClick$1(ViewOnLongClickListenerC2189591Amj viewOnLongClickListenerC2189591Amj, View view) {
                ((TopicReviewCell) viewOnLongClickListenerC2189591Amj.l0).P5();
                return true;
            }
        });
        if (c626770OiB.LLILLJJLI) {
            TuxTextView tuxTextView12 = this.LLIZ;
            if (tuxTextView12 == null) {
                tuxTextView12 = null;
            }
            C786410Ut5.LLLLZLL(tuxTextView12, 0);
            tuxTextView12.setText(tuxTextView12.getContext().getText(2131827868));
            tuxTextView12.setTuxFont(42);
            tuxTextView12.setTextColorRes(R.attr.a1p);
            C786410Ut5.h9(tuxTextView12, new ACListenerS135S0200000_33(this, c626770OiB, 21));
        } else if (Intrinsics.LJFF(c626770OiB.LL.user.getUid(), ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId()) && ((str = c626770OiB.LL.text) == null || str.length() == 0)) {
            TuxTextView tuxTextView13 = this.LLIZ;
            if (tuxTextView13 == null) {
                tuxTextView13 = null;
            }
            C786410Ut5.LLLLZLL(tuxTextView13, 0);
            tuxTextView13.setText(tuxTextView13.getContext().getText(2131827873));
            tuxTextView13.setTuxFont(52);
            tuxTextView13.setTextColorRes(R.attr.a04);
            C786410Ut5.h9(tuxTextView13, new ACListenerS144S0100000_9(this, 146));
        } else {
            TuxTextView tuxTextView14 = this.LLIZ;
            if (tuxTextView14 == null) {
                tuxTextView14 = null;
            }
            C786410Ut5.LLLLZLL(tuxTextView14, 8);
            tuxTextView14.setText("");
        }
        if (list.isEmpty()) {
            C1202310hOP c1202310hOP2 = this.LLILZLL;
            if (c1202310hOP2 == null) {
                c1202310hOP2 = null;
            }
            c1202310hOP2.setExpanded$topic_release(c626770OiB.LLILLJJLI);
        }
        for (Object obj : list) {
            if ((obj instanceof Integer) && (((Number) obj).intValue() & 1) != 0) {
                C1202310hOP c1202310hOP3 = this.LLILZLL;
                if (c1202310hOP3 == null) {
                    c1202310hOP3 = null;
                }
                if (Intrinsics.LJFF(c1202310hOP3.LLJJJJ, c1202310hOP3.LLJLLL)) {
                    c1202310hOP3.LLJJLIIIJLLLLLLLZ = !c1202310hOP3.LLJJLIIIJLLLLLLLZ;
                } else {
                    int height = c1202310hOP3.getHeight();
                    if (c1202310hOP3.LLJJLIIIJLLLLLLLZ) {
                        charSequence = c1202310hOP3.LLJJJJ;
                    } else {
                        charSequence = c1202310hOP3.LLJLLL;
                    }
                    c1202310hOP3.setText(charSequence);
                    c1202310hOP3.measure(View.MeasureSpec.makeMeasureSpec(c1202310hOP3.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(c1202310hOP3.getHeight(), 0));
                    int measuredHeight = c1202310hOP3.getMeasuredHeight();
                    Animator animator = c1202310hOP3.LLJLILLLLZIIL;
                    if (animator != null) {
                        animator.cancel();
                    }
                    long jAbs = ((long) Math.abs(measuredHeight - height)) * 2;
                    if (jAbs > 300) {
                        jAbs = 300;
                    }
                    ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(height, measuredHeight);
                    valueAnimatorOfInt.setInterpolator(new C12DM());
                    valueAnimatorOfInt.setDuration(jAbs);
                    valueAnimatorOfInt.addUpdateListener(new AUListenerS256S0100000_6(c1202310hOP3, 73));
                    valueAnimatorOfInt.addListener(new ALAdapterS14S0100000_18(c1202310hOP3, 9));
                    valueAnimatorOfInt.start();
                    c1202310hOP3.LLJLILLLLZIIL = valueAnimatorOfInt;
                }
            }
        }
    }
}
