package com.ss.android.ugc.aweme.feed.assem.incentive;

import X.C01D1;
import X.C01GW;
import X.C0SC6;
import X.C0SVC;
import X.C0SY7;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1387050mCN;
import X.C13LE;
import X.C1637806bA;
import X.C1894700zPA;
import X.C1908890zm3;
import X.C19719912Dl;
import X.C2097608Jq;
import X.C2178808gE;
import X.C2188811AlT;
import X.C2211631BhB;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C710500Rtw;
import X.C710890RuZ;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C786410Ut5;
import X.EnumC2274741E1w;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS78S0300000_11;
import Y.ARunnableS111S0100000_11;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.touchpoint.api.model.CommonFeedButton;
import com.bytedance.touchpoint.api.model.FollowInfo;
import com.bytedance.touchpoint.api.model.Title;
import com.ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel;
import com.ss.android.ugc.aweme.feed.assem.ffpbutton.FollowButtonFFPViewModel;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AFwS294S0000000_11;
import kotlin.jvm.internal.AwS377S0200000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class IncentiveBottomButtonAssem extends BaseCellSlotComponent<IncentiveBottomButtonAssem> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLL;
    public RelationButton LLJLLIL;
    public LinearLayout LLJLLL;
    public final InterfaceC1731706qJ LLJZ;
    public final C01GW LLJZIJLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(IncentiveBottomButtonAssem.class, "followBtnVM", "getFollowBtnVM()Lcom/ss/android/ugc/aweme/feed/assem/ffpbutton/FollowButtonFFPViewModel;", 0);
        C13LE.LIZ.getClass();
        LLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public IncentiveBottomButtonAssem() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FollowButtonFFPViewModel.class);
        this.LLJZ = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, C1637806bA.LIZ, new AwS555S0100000_11(c19719912DlLIZ, 230), null, AFwS243S0000000_11.get$arr$(73));
        this.LLJZIJLIL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoEventDispatchViewModel.class), AFwS243S0000000_11.get$arr$(74));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.b75;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public final void handleOnResume() {
        super.handleOnResume();
        C724270Sb3 c724270Sb3 = this.LLJI;
        String aid = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme().getAid();
        if (aid != null) {
            Set<String> set = C710500Rtw.LIZ;
            if (set.contains(aid)) {
                return;
            }
            set.add(aid);
            C710890RuZ.LIZ.LJ("_type_bottom_button");
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        HandlerHook.viewPost(LJJIJL(), new ARunnableS111S0100000_11(this, 23));
        this.LLJLLIL = (RelationButton) LJJIJL().findViewById(R.id.kki);
        C01GW<C1894700zPA> c01gw = C1894700zPA.LJIJ;
        List listLJFF = C2178808gE.LIZ().LJFF(95);
        if (listLJFF != null) {
            for (Object obj : listLJFF) {
                if (Intrinsics.LJFF(((CommonFeedButton) obj).actionType, "follow")) {
                    if (obj != null) {
                        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJZIJLIL.getValue(), new C2217381BqS() { // from class: X.0S1p
                            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                            public final Object get(Object obj2) {
                                return ((C1ELP) obj2).LLJJI;
                            }
                        }, null, AFwS294S0000000_11.get$arr$(54), 6);
                        return;
                    }
                    return;
                }
            }
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        String str;
        String str2;
        boolean z;
        String str3;
        String str4;
        String str5;
        String str6;
        Title title;
        Title title2;
        VideoItemParams videoItemParams2 = videoItemParams;
        Set<String> set = C710500Rtw.LIZ;
        CommonFeedButton commonFeedButtonLIZ = C710500Rtw.LIZ(videoItemParams2.getAweme().getAid());
        if (commonFeedButtonLIZ != null) {
            this.LLJLLL = (LinearLayout) LJJIJL().findViewById(R.id.ne4);
            TextView textView = (TextView) LJJIJL().findViewById(R.id.kkh);
            SmartImageView smartImageView = (SmartImageView) LJJIJL().findViewById(R.id.kkg);
            RelationButton relationButton = (RelationButton) getContentView().findViewById(R.id.kki);
            this.LLJLLIL = relationButton;
            boolean z2 = true;
            String str7 = null;
            int i = 8;
            if (Intrinsics.LJFF(commonFeedButtonLIZ.actionType, "follow")) {
                User author = videoItemParams2.getAweme().getAuthor();
                if (author != null) {
                    C1387050mCN c1387050mCN = new C1387050mCN(author);
                    c1387050mCN.LJIIJJI = getHostLifecycleOwner();
                    c1387050mCN.LJFF = EnumC2274741E1w.TUX_SEMI_TRANSPARENT;
                    c1387050mCN.LJIIJ = true;
                    Pair[] pairArr = new Pair[4];
                    C0SY7 c0sy7 = C0SY7.UNFOLLOW;
                    Title title3 = commonFeedButtonLIZ.title;
                    if (title3 != null) {
                        str3 = title3.text;
                    } else {
                        str3 = null;
                    }
                    pairArr[0] = new Pair(c0sy7, new C1908890zm3(str3, null));
                    C0SY7 c0sy72 = C0SY7.UNFOLLOW_BUT_BE_FOLLOWED;
                    Title title4 = commonFeedButtonLIZ.title;
                    if (title4 != null) {
                        str4 = title4.text;
                    } else {
                        str4 = null;
                    }
                    pairArr[1] = new Pair(c0sy72, new C1908890zm3(str4, null));
                    C0SY7 c0sy73 = C0SY7.FOLLOWED;
                    FollowInfo followInfo = commonFeedButtonLIZ.followInfo;
                    if (followInfo != null && (title2 = followInfo.afterClickText) != null) {
                        str5 = title2.text;
                    } else {
                        str5 = null;
                    }
                    pairArr[2] = new Pair(c0sy73, new C1908890zm3(str5, null));
                    C0SY7 c0sy74 = C0SY7.FOLLOW_MUTUAL;
                    FollowInfo followInfo2 = commonFeedButtonLIZ.followInfo;
                    if (followInfo2 != null && (title = followInfo2.afterClickText) != null) {
                        str6 = title.text;
                    } else {
                        str6 = null;
                    }
                    pairArr[3] = new Pair(c0sy74, new C1908890zm3(str6, null));
                    c1387050mCN.LJII.putAll(C2097608Jq.LJIIIIZZ(pairArr));
                    relationButton.LLLLZIL(c1387050mCN.LIZ());
                }
                relationButton.setButtonStartIcon(Integer.valueOf(R.raw.icon_plus_small));
                Title title5 = commonFeedButtonLIZ.title;
                if (title5 != null) {
                    str2 = title5.text;
                } else {
                    str2 = null;
                }
                relationButton.setText(str2);
                this.LLJZ.getValue(this, LLL[0]).getClass();
                User author2 = videoItemParams2.getAweme().getAuthor();
                if (author2 != null && author2.getFollowStatus() == 0) {
                    if (!C710500Rtw.LIZIZ.contains(AwemeExtKt.getAuthorUid(videoItemParams2.getAweme()))) {
                        i = 0;
                    }
                }
                C786410Ut5.LJLLLLLL(i, relationButton);
                relationButton.setFollowClickInterceptor(new C0SC6(videoItemParams2, commonFeedButtonLIZ, this, null));
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("relationButton isVisible: ");
                if (relationButton.getVisibility() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                sbLIZ.append(z);
                sbLIZ.append(", container isVisible: ");
                if (LJJIJL().getVisibility() != 0) {
                    z2 = false;
                }
                sbLIZ.append(z2);
                C2188811AlT.LIZIZ(sbLIZ);
                C2211631BhB.LJ(relationButton, new AwS377S0200000_11(commonFeedButtonLIZ, videoItemParams2, 175));
                return;
            }
            if (!Intrinsics.LJFF(commonFeedButtonLIZ.actionType, "jump")) {
                return;
            }
            Title title6 = commonFeedButtonLIZ.title;
            if (title6 != null) {
                str = title6.text;
            } else {
                str = null;
            }
            textView.setText(str);
            C0SVC c0svc = C0SVC.LIZ;
            Title title7 = commonFeedButtonLIZ.title;
            if (title7 != null) {
                str7 = title7.color;
            }
            textView.setTextColor(C0SVC.LIZIZ(c0svc, str7));
            String str8 = commonFeedButtonLIZ.icon;
            if (str8 != null && str8.length() != 0) {
                C1331670kl3 c1331670kl3LJI = C1331660kl2.LJI(UriProtector.parse(commonFeedButtonLIZ.icon));
                c1331670kl3LJI.LJJ(smartImageView);
                C786410Ut5.h3(c1331670kl3LJI);
            }
            String str9 = commonFeedButtonLIZ.backgroundColor;
            if (str9 != null && str9.length() != 0) {
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(C0SVC.LIZIZ(c0svc, commonFeedButtonLIZ.backgroundColor));
                gradientDrawable.setCornerRadius(C418440Gaw.LIZIZ(8));
                LJJIJL().setBackground(gradientDrawable);
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onBind jump button, container isVisible: ");
            if (LJJIJL().getVisibility() != 0) {
                z2 = false;
            }
            sbLIZ2.append(z2);
            C2188811AlT.LIZIZ(sbLIZ2);
            LinearLayout linearLayout = this.LLJLLL;
            if (linearLayout != null) {
                C786410Ut5.LJLLLLLL(0, linearLayout);
            }
            LinearLayout linearLayout2 = this.LLJLLL;
            if (linearLayout2 != null) {
                C786410Ut5.R7(linearLayout2, new ACListenerS78S0300000_11(this, commonFeedButtonLIZ, videoItemParams2, 7));
            }
            LinearLayout linearLayout3 = this.LLJLLL;
            if (linearLayout3 == null) {
                return;
            }
            C2211631BhB.LJ(linearLayout3, new AwS377S0200000_11(commonFeedButtonLIZ, videoItemParams2, 176));
        }
    }
}
