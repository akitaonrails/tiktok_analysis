package com.ss.android.ugc.aweme.internalshare.impl.feedquickshare;

import X.AbstractC608770NuF;
import X.C019F;
import X.C01GW;
import X.C065U;
import X.C098200Yq;
import X.C09R3;
import X.C0CNO;
import X.C0HHT;
import X.C0I6I;
import X.C0RJE;
import X.C0RR7;
import X.C0Y8T;
import X.C0YSQ;
import X.C0ZP4;
import X.C1001920cBC;
import X.C1004090cEh;
import X.C1004130cEl;
import X.C1004140cEm;
import X.C1004170cEp;
import X.C1004330cF5;
import X.C1004340cF6;
import X.C1004350cF7;
import X.C1004360cF8;
import X.C1004370cF9;
import X.C1004380cFA;
import X.C1004390cFB;
import X.C1004400cFC;
import X.C1004410cFD;
import X.C1004420cFE;
import X.C1004430cFF;
import X.C1004480cFK;
import X.C1004490cFL;
import X.C1004510cFN;
import X.C1004550cFR;
import X.C12ES;
import X.C1383370m6R;
import X.C13LE;
import X.C1637806bA;
import X.C1637906bB;
import X.C1720006oQ;
import X.C178200mK;
import X.C1865840yec;
import X.C189200o6;
import X.C19719912Dl;
import X.C1A5L;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2271381DvM;
import X.C2271391DvN;
import X.C23250099c;
import X.C279060Awi;
import X.C294380BgK;
import X.C296820BkG;
import X.C418440Gaw;
import X.C452501pT;
import X.C609140Nuq;
import X.C694320RLi;
import X.C695730RQt;
import X.C724240Sb0;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C725430Scv;
import X.C736680Sv4;
import X.C736820SvI;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.C996430c2L;
import X.C996440c2M;
import X.C996450c2N;
import X.C997920c4k;
import X.C997930c4l;
import X.C997940c4m;
import X.EnumC452301pR;
import X.EnumC700430Rdh;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC866830XzV;
import X.InterfaceC876950Yaj;
import Y.AAListenerS134S0300000_9;
import Y.AAListenerS28S0301000_9;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.crash.Npth;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.share.QuickShareAIInfo;
import com.ss.android.ugc.aweme.base.share.QuickShareCandidate;
import com.ss.android.ugc.aweme.feed.adapter.FypExposedCommentAvoidViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.StatePassingVM;
import com.ss.android.ugc.aweme.feed.assem.share.InterceptorEventViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.contacts.api.model.MAFIMUser;
import com.ss.android.ugc.aweme.im.message.template.service.SendMessageEventParcel;
import com.ss.android.ugc.aweme.im.message.template.service.SendMessageTemplateTask;
import com.ss.android.ugc.aweme.im.sharepanel.api.IMSharePanelApi;
import com.ss.android.ugc.aweme.internalshare.impl.feedquickshare.QuickShareButtonAssem;
import com.ss.android.ugc.aweme.internalshare.impl.feedquickshare.QuickShareVM;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.share.ShareService;
import com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;
import com.ss.android.ugc.feed.platform.ab.ComponentMarginConfig;
import com.ss.android.ugc.feed.platform.ab.FeedComponentsMarginConfig;
import com.ss.android.ugc.feed.platform.ab.LowScreenOptimizeAB;
import com.ss.android.ugc.feed.platform.ab.UnifyComponentsMarginConfig;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.ss.android.ugc.feed.platform.container.info.ConstraintSizeVM;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS300S0000000_16;
import kotlin.jvm.internal.AwS30S0001000_16;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class QuickShareButtonAssem extends BaseCellSlotComponent<QuickShareButtonAssem> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLILZJ;
    public final C01GW LLJLLIL = C452501pT.LIZ(EnumC452301pR.NONE, new C997940c4m());
    public final C01GW LLJLLL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoEventDispatchViewModel.class), new C1004360cF8());
    public final C01GW LLJZ = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoPlayViewModel.class), new C1004370cF9());
    public final C01GW LLJZIJLIL = C737910Sx3.LIZJ(this, C13LE.LIZ(InterceptorEventViewModel.class), new C1004420cFE());
    public final C01GW LLL = C452501pT.LIZIZ(new C1004350cF7(this));
    public final C01GW LLLF = C737910Sx3.LIZJ(this, C13LE.LIZ(QuickShareVM.class), new C1004380cFA());
    public final C01GW LLLFF = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), new C1004390cFB());
    public final InterfaceC1731706qJ LLLFFI;
    public final InterfaceC1731706qJ LLLFZ;
    public final C01GW LLLI;
    public C0ZP4 LLLII;
    public C0ZP4 LLLIIII;
    public final C01GW LLLIIIIL;
    public C0I6I LLLIIIL;
    public C1004130cEl LLLIIL;
    public C1004330cF5 LLLIILIL;
    public final InterfaceC1731706qJ LLLIL;
    public final C01GW LLLILZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(QuickShareButtonAssem.class, "constraintSizeVM", "getConstraintSizeVM()Lcom/ss/android/ugc/feed/platform/container/info/ConstraintSizeVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(QuickShareButtonAssem.class, "statePassingVM", "getStatePassingVM()Lcom/ss/android/ugc/aweme/feed/assem/StatePassingVM;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(QuickShareButtonAssem.class, "exposedCommentAvoidVM", "getExposedCommentAvoidVM()Lcom/ss/android/ugc/aweme/feed/adapter/FypExposedCommentAvoidViewModel;", 0);
        c09r3.getClass();
        LLLILZJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    public QuickShareButtonAssem() {
        C0HHT c0hht = C0HHT.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ConstraintSizeVM.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLLFFI = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0hht, c1637906bB, new C996440c2M(c19719912DlLIZ), null, new C1004430cFF());
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(StatePassingVM.class);
        this.LLLFZ = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new C996450c2N(c19719912DlLIZ2), null, new C1004400cFC());
        this.LLLI = C452501pT.LIZIZ(new C1004510cFN(this));
        this.LLLIIIIL = C452501pT.LIZIZ(new C1004340cF6(this));
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(FypExposedCommentAvoidViewModel.class);
        this.LLLIL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c0hht, c1637906bB, new C996430c2L(c19719912DlLIZ3), null, new C1004410cFD());
        this.LLLILZ = C452501pT.LIZIZ(new AwS560S0100000_16(this, 317));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.cr_;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedAssem
    public final void mo() {
    }

    public final String Ep() {
        C1004550cFR c1004550cFR = C1004550cFR.LIZIZ;
        C724270Sb3 c724270Sb3 = this.LLJI;
        String aid = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme().getAid();
        c1004550cFR.getClass();
        boolean z = aid != null && (C1004550cFR.LIZLLL.contains(aid) || C1004550cFR.LJ.contains(aid));
        if (z) {
            C1720006oQ.LJ("QuickShareAssem", "tryToDisplayComponent fail canShowQuickShare=false");
        }
        C724270Sb3 c724270Sb32 = this.LLJI;
        boolean zLIZIZ = C1004550cFR.LIZIZ(((VideoItemParams) (c724270Sb32 != null ? c724270Sb32.LL : null)).getAweme().getAid());
        if (zLIZIZ) {
            C1720006oQ.LJ("QuickShareAssem", "tryToDisplayComponent current is showing");
        }
        if (z) {
            return "share_advance";
        }
        if (zLIZIZ) {
            return "button_displaying";
        }
        return null;
    }

    public final QuickShareVM Gp() {
        return (QuickShareVM) this.LLLF.getValue();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        C0I6I c0i6i;
        C1004330cF5 c1004330cF5 = this.LLLIILIL;
        if (c1004330cF5 != null) {
            C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LJJIJIIJIL(c1004330cF5);
        }
        if (!((Boolean) C1865840yec.LIZIZ.getValue()).booleanValue() || (c0i6i = this.LLLIIIL) == null) {
            return;
        }
        c0i6i.LLILZIL = null;
    }

    public static String Ip(VideoItemParams videoItemParams) {
        if (videoItemParams == null) {
            return "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("aid=");
        sbLIZ.append(videoItemParams.getAweme().getAid());
        sbLIZ.append("  ");
        sbLIZ.append(videoItemParams.getAweme().getDesc());
        sbLIZ.append(" \n");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void Bp(User user) {
        IMContact bindContactData;
        IMContact iMContact;
        boolean z;
        String uid;
        C0I6I c0i6i = this.LLLIIIL;
        Object obj = null;
        if (c0i6i != null) {
            bindContactData = c0i6i.getBindContactData();
        } else {
            bindContactData = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("blockUserSuccessEvent blockuser=");
        sbLIZ.append(user);
        sbLIZ.append(' ');
        if (bindContactData instanceof IMUser) {
            iMContact = bindContactData;
        } else {
            iMContact = null;
        }
        sbLIZ.append(iMContact);
        sbLIZ.append("    ");
        if (LJJIJL().getVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        C1720006oQ.LJ("QuickShareAssem", C2188811AlT.LIZIZ(sbLIZ));
        if (bindContactData != null && (bindContactData instanceof IMUser)) {
            String uid2 = bindContactData.getUid();
            if (user != null) {
                uid = user.getUid();
            } else {
                uid = null;
            }
            if (Intrinsics.LJFF(uid2, uid) && user != null && user.isBlock) {
                C786410Ut5.LJLLLLLL(8, LJJIJL());
                C1004550cFR c1004550cFR = C1004550cFR.LIZIZ;
                C724270Sb3 c724270Sb3 = this.LLJI;
                if (c724270Sb3 != null) {
                    obj = c724270Sb3.LL;
                }
                String aid = ((VideoItemParams) obj).getAweme().getAid();
                c1004550cFR.getClass();
                if (aid != null) {
                    C1004550cFR.LJFF.remove(aid);
                }
            }
        }
    }

    public final void Fp(boolean z) {
        Object obj;
        View childAt;
        C0I6I c0i6i;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        final int dimension;
        FeedComponentsMarginConfig feedComponentsMarginConfig;
        Map<String, ComponentMarginConfig> map;
        ComponentMarginConfig componentMarginConfig;
        C1004330cF5 c1004330cF5;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        C1004550cFR c1004550cFR = C1004550cFR.LIZIZ;
        C724270Sb3 c724270Sb3 = this.LLJI;
        Object obj9 = null;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        String aid = ((VideoItemParams) obj).getAweme().getAid();
        c1004550cFR.getClass();
        IMContact iMContact = (IMContact) ((Map) C1004550cFR.LJIILJJIL.getValue()).get(aid);
        if (iMContact != null) {
            int iLJIIJ = (int) ((C12ES.LJIIJ(LJJIJL().getContext()) - ((ConstraintSizeVM) this.LLLFFI.getValue(this, LLLILZJ[0])).wQ2()) - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)) * 2));
            View contentView = getContentView();
            if ((contentView instanceof ViewGroup) && (viewGroup2 = (ViewGroup) contentView) != null) {
                childAt = viewGroup2.getChildAt(0);
            } else {
                childAt = null;
            }
            if (childAt instanceof C0I6I) {
                c0i6i = (C0I6I) childAt;
            } else {
                c0i6i = null;
            }
            this.LLLIIIL = c0i6i;
            if (c0i6i == null) {
                this.LLLIIIL = new C0I6I(LJJIJL().getContext());
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 17;
                View contentView2 = getContentView();
                if ((contentView2 instanceof ViewGroup) && (viewGroup = (ViewGroup) contentView2) != null) {
                    viewGroup.addView(this.LLLIIIL, layoutParams);
                }
            }
            C0I6I c0i6i2 = this.LLLIIIL;
            if (c0i6i2 != null) {
                c0i6i2.LIZ(iLJIIJ, iMContact);
            }
            if (iMContact instanceof IMUser) {
                if (this.LLLII == null) {
                    this.LLLII = C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJLLL.getValue(), new C2217381BqS() { // from class: X.0P1I
                        @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                        public final Object get(Object obj10) {
                            return ((C1ELP) obj10).LLJJL;
                        }
                    }, null, AFwS300S0000000_16.get$arr$(58), 6);
                }
                if (this.LLLIIII == null) {
                    this.LLLIIII = C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJLLL.getValue(), new C2217381BqS() { // from class: X.0cFH
                        @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                        public final Object get(Object obj10) {
                            return ((C1ELP) obj10).LLJJLIIIJLLLLLLLZ;
                        }
                    }, null, AFwS300S0000000_16.get$arr$(59), 6);
                }
            }
            if ((iMContact instanceof IMConversation) && (c1004330cF5 = this.LLLIILIL) != null) {
                C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LJI(c1004330cF5);
            }
            C724270Sb3 c724270Sb32 = this.LLJI;
            if (c724270Sb32 != null) {
                obj2 = c724270Sb32.LL;
            } else {
                obj2 = null;
            }
            String aid2 = ((VideoItemParams) obj2).getAweme().getAid();
            if (aid2 != null) {
                C1004550cFR.LJFF.add(aid2);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            C724270Sb3 c724270Sb33 = this.LLJI;
            if (c724270Sb33 != null) {
                obj3 = c724270Sb33.LL;
            } else {
                obj3 = null;
            }
            sbLIZ.append(((VideoItemParams) obj3).getAweme().getAid());
            sbLIZ.append(" quick share show start");
            C1720006oQ.LJ("QuickShareAssem", C2188811AlT.LIZIZ(sbLIZ));
            C01GW c01gw = C695730RQt.LIZ;
            C724270Sb3 c724270Sb34 = this.LLJI;
            if (c724270Sb34 != null) {
                obj4 = c724270Sb34.LL;
            } else {
                obj4 = null;
            }
            Context context = ((VideoItemParams) obj4).fragment.getContext();
            C724270Sb3 c724270Sb35 = this.LLJI;
            if (c724270Sb35 != null) {
                obj5 = c724270Sb35.LL;
            } else {
                obj5 = null;
            }
            String str = ((VideoItemParams) obj5).mEventType;
            C724270Sb3 c724270Sb36 = this.LLJI;
            if (c724270Sb36 != null) {
                obj6 = c724270Sb36.LL;
            } else {
                obj6 = null;
            }
            if (C695730RQt.LIZIZ(context, ((VideoItemParams) obj6).getAweme(), str)) {
                UnifyComponentsMarginConfig unifyComponentsMarginConfig = C695730RQt.LIZIZ;
                if (unifyComponentsMarginConfig != null && (feedComponentsMarginConfig = unifyComponentsMarginConfig.componentsMarginConfig) != null && (((map = feedComponentsMarginConfig.containerCustomConfig) != null && (componentMarginConfig = map.get("bottom_button")) != null) || (componentMarginConfig = feedComponentsMarginConfig.leftContainerCommonSpace) != null)) {
                    dimension = ((Number) new Pair(Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(componentMarginConfig.topGap)))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(componentMarginConfig.bottomGap))))).getSecond()).intValue();
                } else {
                    dimension = C694320RLi.LIZJ;
                }
            } else {
                C724270Sb3 c724270Sb37 = this.LLJI;
                if (c724270Sb37 != null) {
                    obj7 = c724270Sb37.LL;
                } else {
                    obj7 = null;
                }
                Context context2 = ((VideoItemParams) obj7).fragment.getContext();
                C724270Sb3 c724270Sb38 = this.LLJI;
                if (c724270Sb38 != null) {
                    obj8 = c724270Sb38.LL;
                } else {
                    obj8 = null;
                }
                String str2 = ((VideoItemParams) obj8).mEventType;
                C724270Sb3 c724270Sb39 = this.LLJI;
                if (c724270Sb39 != null) {
                    obj9 = c724270Sb39.LL;
                }
                if (!C0RR7.LIZIZ(context2, ((VideoItemParams) obj9).getAweme(), str2) && !LowScreenOptimizeAB.LJ()) {
                    dimension = (int) LJJIJL().getResources().getDimension(R.dimen.a2u);
                } else {
                    dimension = C694320RLi.LIZJ;
                }
            }
            if (z) {
                final C997930c4l c997930c4l = (C997930c4l) this.LLJLLIL.getValue();
                final View contentView3 = getContentView();
                final View viewLJJIJL = LJJIJL();
                final int dimension2 = (int) LJJIJL().getResources().getDimension(R.dimen.a2t);
                final AwS560S0100000_16 awS560S0100000_16 = new AwS560S0100000_16(this, 316);
                AnimatorSet animatorSet = c997930c4l.LIZIZ;
                if (animatorSet != null && animatorSet.isRunning()) {
                    animatorSet.cancel();
                }
                AnimatorSet animatorSet2 = c997930c4l.LIZ;
                if ((animatorSet2 != null && animatorSet2.isRunning()) || !(contentView3.getParent() instanceof ViewGroup)) {
                    return;
                }
                final ViewGroup.MarginLayoutParams marginLayoutParamsLJI = C1383370m6R.LJI(viewLJJIJL);
                if (marginLayoutParamsLJI != null) {
                    marginLayoutParamsLJI.bottomMargin = -dimension2;
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("transitIn targetHeight=");
                sbLIZ2.append(dimension2);
                sbLIZ2.append("   originalMarginBottom=");
                sbLIZ2.append(dimension);
                C2188811AlT.LIZIZ(sbLIZ2);
                HandlerHook.viewPost(contentView3, new Runnable() { // from class: X.0P2k
                    public final /* synthetic */ long LLILZLL = 100;

                    public final void LIZ() {
                        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewLJJIJL, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                        objectAnimatorOfFloat.setInterpolator((Interpolator) c997930c4l.LIZJ.getValue());
                        objectAnimatorOfFloat.setDuration(300L);
                        final ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(-dimension2, dimension);
                        C997930c4l c997930c4l2 = c997930c4l;
                        final ViewGroup.MarginLayoutParams marginLayoutParams = marginLayoutParamsLJI;
                        final View view = viewLJJIJL;
                        valueAnimatorOfInt.setInterpolator((Interpolator) c997930c4l2.LIZLLL.getValue());
                        valueAnimatorOfInt.setDuration(300L);
                        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0P2l
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                int iIntValue = ((Integer) valueAnimatorOfInt.getAnimatedValue()).intValue();
                                ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
                                if (marginLayoutParams2 != null) {
                                    marginLayoutParams2.bottomMargin = iIntValue;
                                }
                                C786410Ut5.W5(view, marginLayoutParams);
                            }
                        });
                        C997930c4l c997930c4l3 = c997930c4l;
                        AnimatorSet animatorSet3 = new AnimatorSet();
                        long j = this.LLILZLL;
                        View view2 = contentView3;
                        View view3 = viewLJJIJL;
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParamsLJI;
                        int i = dimension;
                        Function0<Unit> function0 = awS560S0100000_16;
                        animatorSet3.playTogether(objectAnimatorOfFloat, valueAnimatorOfInt);
                        animatorSet3.setStartDelay(j);
                        animatorSet3.addListener(new AAListenerS134S0300000_9(view2, view3, marginLayoutParams2, 0));
                        animatorSet3.addListener(new AAListenerS28S0301000_9(view3, marginLayoutParams2, i, function0, 0));
                        animatorSet3.addListener(new AAListenerS28S0301000_9(view3, marginLayoutParams2, i, function0, 1));
                        c997930c4l3.LIZ = animatorSet3;
                        AnimatorSet animatorSet4 = c997930c4l.LIZ;
                        if (animatorSet4 != null) {
                            animatorSet4.start();
                        }
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("ShareButtonTransitionHelper@3571.transitIn$animRunnable$1");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("ShareButtonTransitionHelper@3571.transitIn$animRunnable$1");
                    }
                });
                return;
            }
            C786410Ut5.LJLLLLLL(0, getContentView());
            C786410Ut5.LJLLLLLL(0, LJJIJL());
            C786410Ut5.T4(LJJIJL(), 1.0f);
            ViewGroup.MarginLayoutParams marginLayoutParamsLJI2 = C1383370m6R.LJI(LJJIJL());
            if (marginLayoutParamsLJI2 != null) {
                marginLayoutParamsLJI2.bottomMargin = dimension;
            }
            C786410Ut5.W5(LJJIJL(), marginLayoutParamsLJI2);
        }
    }

    public final void Tp(C0Y8T c0y8t) {
        IMContact bindContactData;
        String conversationId;
        String conversationId2;
        IMConversation iMConversation;
        C0I6I c0i6i = this.LLLIIIL;
        String conversationId3 = null;
        if (c0i6i != null) {
            bindContactData = c0i6i.getBindContactData();
        } else {
            bindContactData = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onDeleteConversation contact = ");
        if ((bindContactData instanceof IMConversation) && (iMConversation = (IMConversation) bindContactData) != null) {
            conversationId = iMConversation.getConversationId();
        } else {
            conversationId = null;
        }
        sbLIZ.append(conversationId);
        sbLIZ.append("  conversation = ");
        if (c0y8t != null) {
            conversationId2 = c0y8t.getConversationId();
        } else {
            conversationId2 = null;
        }
        sbLIZ.append(conversationId2);
        C1720006oQ.LJ("QuickShareAssem", C2188811AlT.LIZIZ(sbLIZ));
        if (bindContactData != null && (bindContactData instanceof IMConversation)) {
            String conversationId4 = ((IMConversation) bindContactData).getConversationId();
            if (c0y8t != null) {
                conversationId3 = c0y8t.getConversationId();
            }
            if (Intrinsics.LJFF(conversationId4, conversationId3)) {
                C0CNO.LIZLLL(0L, new AwS560S0100000_16(this, 318));
            }
        }
    }

    public final void Up(String str) {
        Object obj;
        if (C294380BgK.LIZ()) {
            C724270Sb3 c724270Sb3 = this.LLJI;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            if (Intrinsics.LJFF(((VideoItemParams) obj).mEventType, "homepage_hot") && Gp().LLILZ) {
                ((FypExposedCommentAvoidViewModel) this.LLLIL.getValue(this, LLLILZJ[2])).vQ2(str);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v34, types: [X.0cEl] */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.0cF5] */
    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        GradientDrawable gradientDrawable;
        super.onViewCreated(view);
        C786410Ut5.LJLLLLLL(8, getContentView());
        Drawable background = view.getBackground();
        if ((background instanceof GradientDrawable) && (gradientDrawable = (GradientDrawable) background) != null) {
            gradientDrawable.setCornerRadius(C418440Gaw.LIZIZ(200));
        }
        setComponentClickStatusExperimental(getContentView(), EnumC700430Rdh.POSITIVE);
        C2271391DvN.LIZ(getContentView(), (C1A5L) C2271381DvM.LLJLIL.getValue());
        C786410Ut5.I7(new View.OnClickListener() { // from class: X.0dZr
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                IMContact bindContactData;
                String strLIZ;
                String str;
                String str2;
                Boolean bool;
                int followStatus;
                int followStatus2;
                String strJ3;
                SendMessageTemplateTask sendMessageTemplateTask;
                SendMessageEventParcel sendMessageEventParcel;
                IMUser iMUser;
                Aweme aweme = ((VideoItemParams) C631370Opb.LIZ(this.LL)).getAweme();
                String aid = aweme.getAid();
                if (aid == null) {
                    return;
                }
                C1004550cFR.LIZIZ.getClass();
                C1004550cFR.LJ.add(aid);
                C0I6I c0i6i = this.LL.LLLIIIL;
                String str3 = null;
                if (c0i6i != null) {
                    bindContactData = c0i6i.getBindContactData();
                } else {
                    bindContactData = null;
                }
                C1004480cFK c1004480cFKLIZ = C1004550cFR.LIZ(aweme);
                QuickShareButtonAssem quickShareButtonAssem = this.LL;
                if (bindContactData != null) {
                    strLIZ = C1055660dZs.LIZ(bindContactData);
                } else {
                    strLIZ = null;
                }
                quickShareButtonAssem.getClass();
                QuickShareButtonAssem.Jp(strLIZ, aweme, c1004480cFKLIZ);
                QuickShareVM quickShareVMGp = this.LL.Gp();
                Context context = this.LL.LJJIJL().getContext();
                int i = ((VideoItemParams) C631370Opb.LIZ(this.LL)).mPageType;
                String str4 = ((VideoItemParams) C631370Opb.LIZ(this.LL)).mEventType;
                String str5 = ((C1004110cEj) this.LL.Gp().getState()).LLILZ;
                if (c1004480cFKLIZ != null) {
                    str = c1004480cFKLIZ.LJII;
                } else {
                    str = null;
                }
                ConcurrentHashMap concurrentHashMapLIZ = C178200mK.LIZ(str);
                quickShareVMGp.getClass();
                if (bindContactData != null && context != null) {
                    C1004770cFn c1004770cFn = C1004770cFn.LIZ;
                    String aid2 = aweme.getAid();
                    String authorUid = AwemeExtKt.getAuthorUid(aweme);
                    if (c1004480cFKLIZ != null) {
                        str2 = c1004480cFKLIZ.LIZJ;
                        bool = c1004480cFKLIZ.LJFF;
                    } else {
                        str2 = null;
                        bool = null;
                    }
                    c1004770cFn.getClass();
                    C1004770cFn.LIZJ(false, aid2, authorUid, str5, str4, bindContactData, str2, bool, concurrentHashMapLIZ);
                    List<? extends IMContact> listLJIILJJIL = C1697810uHb.LJIILJJIL(bindContactData);
                    AwemeSharePackage awemeSharePackageLJJJLIIL = ((ShareService) ServiceManager.get().getService(ShareService.class)).LJJJLIIL(i, context, aweme, str4, "quick_share_button", "quick_share_button");
                    Bundle bundle = awemeSharePackageLJJJLIIL.extras;
                    C786410Ut5.LJJJI("position", "panel", bundle);
                    C786410Ut5.LJJJI("enter_method", "quick_share_button", bundle);
                    C786410Ut5.LJJJI("rank_num", CardStruct.IStatusCode.DEFAULT, bundle);
                    User author = aweme.getAuthor();
                    if (author != null) {
                        followStatus = author.getFollowStatus();
                    } else {
                        followStatus = 0;
                    }
                    C786410Ut5.LJJJI("follow_status", String.valueOf(followStatus), bundle);
                    if ((bindContactData instanceof IMUser) && (iMUser = (IMUser) bindContactData) != null) {
                        followStatus2 = iMUser.getFollowStatus();
                    } else {
                        followStatus2 = 0;
                    }
                    C786410Ut5.LJJJI("relation_tag", String.valueOf(followStatus2), bundle);
                    try {
                        JSONObject jSONObject = new JSONObject();
                        for (IMContact iMContact : listLJIILJJIL) {
                            if (iMContact instanceof MAFIMUser) {
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("relation_tag", String.valueOf(((MAFIMUser) iMContact).getFollowStatus()));
                                jSONObject2.put("rec_type", ((MAFIMUser) iMContact).getRecType());
                                jSONObject.put(iMContact.getUid(), jSONObject2);
                            }
                        }
                        strJ3 = C786410Ut5.J3(jSONObject);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        strJ3 = "";
                    }
                    if (strJ3.length() > 0) {
                        C786410Ut5.LJJJI("rec_map", strJ3, awemeSharePackageLJJJLIIL.extras);
                    }
                    SendMessageTemplateTask sendMessageTemplateTask2 = awemeSharePackageLJJJLIIL.sendMessageTemplateTask;
                    if (sendMessageTemplateTask2 != null) {
                        str3 = sendMessageTemplateTask2.scene;
                    }
                    if (Intrinsics.LJFF(str3, "ai_avatar") && (sendMessageTemplateTask = awemeSharePackageLJJJLIIL.sendMessageTemplateTask) != null && (sendMessageEventParcel = sendMessageTemplateTask.sendMessageEventParcel) != null) {
                        sendMessageEventParcel.enterMethod = "icon";
                    }
                    IMSharePanelApi.LIZ.getClass();
                    InterfaceC1365380ldQ shareService = C1599690rjL.LIZ().getShareService();
                    HashMap map = new HashMap();
                    map.put("panel_source", "quick_share_button");
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    String string = awemeSharePackageLJJJLIIL.extras.getString("video_sticker_status");
                    if (string == null) {
                        string = "";
                    }
                    linkedHashMap.put("video_sticker_status", string);
                    String string2 = awemeSharePackageLJJJLIIL.extras.getString("from_group_id");
                    if (string2 == null) {
                        string2 = "";
                    }
                    linkedHashMap.put("from_group_id", string2);
                    String string3 = awemeSharePackageLJJJLIIL.extras.getString("author_id");
                    if (string3 == null) {
                        string3 = "";
                    }
                    linkedHashMap.put("author_id", string3);
                    String string4 = awemeSharePackageLJJJLIIL.extras.getString("story_music_with_mute");
                    if (string4 == null) {
                        string4 = "";
                    }
                    linkedHashMap.put("story_music_with_mute", string4);
                    String string5 = awemeSharePackageLJJJLIIL.extras.getString("story_style_version");
                    if (string5 != null) {
                        linkedHashMap.put("story_style_version", string5);
                    }
                    String string6 = awemeSharePackageLJJJLIIL.extras.getString("story_type");
                    if (string6 != null) {
                        linkedHashMap.put("story_type", string6);
                        String string7 = awemeSharePackageLJJJLIIL.extras.getString("enter_position");
                        if (Intrinsics.LJFF(string6, "story") && C123100dR.LIZ(string7)) {
                            linkedHashMap.put("enter_position", string7);
                        }
                    }
                    String string8 = awemeSharePackageLJJJLIIL.extras.getString("prop_id");
                    if (string8 == null) {
                        string8 = "";
                    }
                    linkedHashMap.put("prop_id", string8);
                    linkedHashMap.put("enter_method", "quick_share_button");
                    shareService.LJJJ(awemeSharePackageLJJJLIIL, "", listLJIILJJIL, null, 1, null, map, linkedHashMap, true, null, C2097608Jq.LJ());
                    C1364590lc9 c1364590lc9 = C1364590lc9.LIZ;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    C0I0B c0i0b = C0I0B.LJFF;
                    InterfaceC1493505sz interfaceC1493505szLIZIZ = c0i0b.LIZIZ();
                    c1364590lc9.getClass();
                    C1364590lc9.LJFF(awemeSharePackageLJJJLIIL, bindContactData, false, "chat", jCurrentTimeMillis, interfaceC1493505szLIZIZ, 0);
                    List listSingletonList = Collections.singletonList(bindContactData);
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    InterfaceC1493505sz interfaceC1493505szLIZIZ2 = C0I0B.LJFF.LIZIZ();
                    c1364590lc9.getClass();
                    C1364590lc9.LIZLLL(awemeSharePackageLJJJLIIL, null, listSingletonList, jCurrentTimeMillis2, interfaceC1493505szLIZIZ2, 0);
                    C1364590lc9.LJI(awemeSharePackageLJJJLIIL, bindContactData, false, "chat_head", c0i0b.LIZIZ(), 0);
                }
            }
        }, getContentView());
        if (C296820BkG.LIZ()) {
            this.LLLIIL = new AbstractC608770NuF() { // from class: X.0cEl
                @Override // X.AbstractC608770NuF
                public final int LIZ() {
                    return 0;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.AbstractC608770NuF
                public final void LIZIZ(C608820NuK c608820NuK) {
                    Object obj;
                    Object obj2;
                    Object obj3;
                    Object obj4;
                    int i = c608820NuK.LIZ;
                    Object obj5 = null;
                    if (i != 0) {
                        int i2 = 1;
                        if (i == 1) {
                            QuickShareButtonAssem quickShareButtonAssem = this.LIZLLL;
                            C581630MrZ c581630MrZ = c608820NuK.LIZJ;
                            quickShareButtonAssem.getClass();
                            if (c581630MrZ != null) {
                                String str = c581630MrZ.LIZIZ;
                                C724270Sb3 c724270Sb3 = quickShareButtonAssem.LLJI;
                                if (c724270Sb3 != null) {
                                    obj3 = c724270Sb3.LL;
                                } else {
                                    obj3 = null;
                                }
                                if (Intrinsics.LJFF(str, ((VideoItemParams) obj3).getAweme().getAid()) && c581630MrZ.LIZ == 7) {
                                    QuickShareVM quickShareVMGp = quickShareButtonAssem.Gp();
                                    int i3 = ((C1004110cEj) quickShareVMGp.getState()).LLILLJJLI + 1;
                                    quickShareVMGp.setState(new AwS30S0001000_16(i3, 3));
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("playerEvent aid=");
                                    sbLIZ.append(c581630MrZ.LIZIZ);
                                    sbLIZ.append(' ');
                                    sbLIZ.append(c581630MrZ.LIZ);
                                    sbLIZ.append(" times=");
                                    sbLIZ.append(i3);
                                    C1720006oQ.LJ("QuickShareAssem", C2188811AlT.LIZIZ(sbLIZ));
                                    C1004140cEm.LIZ.getClass();
                                    if (C1004140cEm.LIZ().playLoopTrigger > 0) {
                                        i2 = C1004140cEm.LIZ().playLoopTrigger;
                                    }
                                    if (i3 == i2) {
                                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                        sbLIZ2.append("handlePlayCompleteTimes ");
                                        C724270Sb3 c724270Sb32 = quickShareButtonAssem.LLJI;
                                        if (c724270Sb32 != null) {
                                            obj4 = c724270Sb32.LL;
                                        } else {
                                            obj4 = null;
                                        }
                                        sbLIZ2.append(QuickShareButtonAssem.Ip((VideoItemParams) obj4));
                                        C1720006oQ.LJ("QuickShareAssem", C2188811AlT.LIZIZ(sbLIZ2));
                                        C724270Sb3 c724270Sb33 = quickShareButtonAssem.LLJI;
                                        if (c724270Sb33 != null) {
                                            obj5 = c724270Sb33.LL;
                                        }
                                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                        sbLIZ3.append("loop");
                                        sbLIZ3.append(i2);
                                        quickShareButtonAssem.Vp((VideoItemParams) obj5, C2188811AlT.LIZIZ(sbLIZ3), quickShareButtonAssem.LLLIIL);
                                        return;
                                    }
                                    C1004130cEl c1004130cEl = quickShareButtonAssem.LLLIIL;
                                    if (c1004130cEl == null) {
                                        return;
                                    }
                                    c1004130cEl.LIZJ("");
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    QuickShareButtonAssem quickShareButtonAssem2 = this.LIZLLL;
                    String str2 = c608820NuK.LIZIZ;
                    C724270Sb3 c724270Sb34 = quickShareButtonAssem2.LLJI;
                    if (c724270Sb34 != null) {
                        obj = c724270Sb34.LL;
                    } else {
                        obj = null;
                    }
                    if (!Intrinsics.LJFF(str2, ((VideoItemParams) obj).getAweme().getAid())) {
                        return;
                    }
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("diggStartEvent ");
                    C724270Sb3 c724270Sb35 = quickShareButtonAssem2.LLJI;
                    if (c724270Sb35 != null) {
                        obj2 = c724270Sb35.LL;
                    } else {
                        obj2 = null;
                    }
                    sbLIZ4.append(QuickShareButtonAssem.Ip((VideoItemParams) obj2));
                    C1720006oQ.LJ("QuickShareAssem", C2188811AlT.LIZIZ(sbLIZ4));
                    C724270Sb3 c724270Sb36 = quickShareButtonAssem2.LLJI;
                    if (c724270Sb36 != null) {
                        obj5 = c724270Sb36.LL;
                    }
                    quickShareButtonAssem2.Vp((VideoItemParams) obj5, "like", quickShareButtonAssem2.LLLIIL);
                }
            };
        }
        this.LLLIILIL = new InterfaceC866830XzV() { // from class: X.0cF5
            @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
            public final void LJJJJJL(C0Y8T c0y8t) {
            }

            @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
            public final void LJJLJLI(List<C0YAE> list) {
            }

            @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
            public final void LJJLL(List<C0YAE> list) {
            }

            @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
            public final void LJJZZI(List<C0YAE> list) {
            }

            @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
            public final void LJLI(String str, List<C0YAE> list) {
            }

            @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
            public final void LJLILLLLZI(C0Y8T c0y8t) {
            }

            @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
            public final void LJLJI(int i, C0Y8T c0y8t) {
            }

            @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
            public final void LJLL(C1711306n1 c1711306n1) {
            }

            @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
            public final void LLIIII(int i, String str) {
            }

            @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
            public final void LLIILZL(int i, String str, List list) {
            }

            @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
            public final int LLLIIII() {
                return 0;
            }

            @Override // X.InterfaceC866830XzV, X.InterfaceC867280Y0o
            public final void LLLIZZ(Map<String, C0Y8T> map) {
            }

            @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
            public final void LJJLIIIJ(C0Y8T c0y8t) {
                this.LL.Tp(c0y8t);
            }

            @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
            public final void LJZI(C0Y8T c0y8t) {
                this.LL.Tp(c0y8t);
            }
        };
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLFZ.getValue(this, LLLILZJ[1]), new C2217381BqS() { // from class: X.0Nu0
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C570070MXl) obj).LL;
            }
        }, null, new C609140Nuq(), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLFF.getValue(), new C2217381BqS() { // from class: X.0NvN
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILLL;
            }
        }, null, AFwS300S0000000_16.get$arr$(57), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLFF.getValue(), new C2217381BqS() { // from class: X.0NvO
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILZ;
            }
        }, null, new C1004170cEp(), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJLLL.getValue(), new C2217381BqS() { // from class: X.0Nu1
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1ELP) obj).LLJILJILJ;
            }
        }, null, new C997920c4k(), 6);
        C1004140cEm.LIZ.getClass();
        if (C1004140cEm.LIZ().enablePlayTimeTrigger == 1) {
            C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJZ.getValue(), new C2217381BqS() { // from class: X.0NvM
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C0RFV) obj).LLJJIII;
                }
            }, null, new C1004090cEh(), 6);
        }
        if (C1004140cEm.LIZ().enableRepostTrigger == 1) {
            if (C279060Awi.LIZ()) {
                try {
                    if (C724240Sb0.LIZ(this) == null) {
                        HashMap map = new HashMap();
                        for (Fragment fragmentLJI = C724240Sb0.LJI(this); fragmentLJI != null; fragmentLJI = fragmentLJI.getParentFragment()) {
                            map.put(fragmentLJI.getClass().getName(), fragmentLJI.getLifecycle().getCurrentState().toString());
                        }
                        map.put("AssemState", getLifecycle().getCurrentState().toString());
                        C725430Scv.LIZJ("Feed-Not-Expect-Lifecycle", 1.0f, new AwS546S0100000_2(map, (HashMap<String, String>) 639));
                        Npth.reportBizException("Feed_Not_Expect_Lifecycle", new Exception(), "Feed-Not-Expect-Lifecycle", map);
                    }
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
                if (((Boolean) C1865840yec.LIZLLL.getValue()).booleanValue()) {
                    C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C1001920cBC(this, null), 3);
                    return;
                }
                AssemViewModel assemViewModel = (AssemViewModel) this.LLLILZ.getValue();
                if (assemViewModel != null) {
                    C736680Sv4.LJIIIIZZ(this, assemViewModel, new C2217381BqS() { // from class: X.0c5Z
                        @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                        public final Object get(Object obj) {
                            return ((C998420c5Y) obj).LL;
                        }
                    }, C736820SvI.LIZLLL(), AFwS300S0000000_16.get$arr$(55), 4);
                    return;
                }
                return;
            }
            AssemViewModel assemViewModel2 = (AssemViewModel) this.LLLI.getValue();
            if (assemViewModel2 != null) {
                C736680Sv4.LJIIIIZZ(this, assemViewModel2, new C2217381BqS() { // from class: X.0cFM
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return ((C1358700lSe) obj).LLILLL;
                    }
                }, null, AFwS300S0000000_16.get$arr$(56), 6);
            }
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        VideoItemParams videoItemParams2 = videoItemParams;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("bind QuickShareButtonAssem ");
        sbLIZ.append(Ip(videoItemParams2));
        C1720006oQ.LJ("QuickShareAssem", C2188811AlT.LIZIZ(sbLIZ));
        C1004550cFR c1004550cFR = C1004550cFR.LIZIZ;
        String aid = videoItemParams2.getAweme().getAid();
        c1004550cFR.getClass();
        if (C1004550cFR.LIZIZ(aid)) {
            if (((Map) C1004550cFR.LJIILJJIL.getValue()).get(videoItemParams2.getAweme().getAid()) != null) {
                C786410Ut5.LJLLLLLL(0, LJJIJL());
                C0RJE.LIZ(this, new AwS560S0100000_16(this, 319));
                Up(videoItemParams2.getAweme().getAid());
                return;
            }
        }
        C786410Ut5.LJLLLLLL(8, LJJIJL());
    }

    public static QuickShareCandidate Jp(String str, Aweme aweme, C1004480cFK c1004480cFK) {
        QuickShareAIInfo quickShareAIInfo;
        List<QuickShareCandidate> list;
        String str2;
        String string;
        String string2;
        Object obj;
        Object obj2;
        Object obj3 = null;
        if (!C065U.LIZ() || (quickShareAIInfo = aweme.getQuickShareAIInfo()) == null || (list = quickShareAIInfo.candidateList) == null) {
            return null;
        }
        if (c1004480cFK != null) {
            str2 = c1004480cFK.LJII;
        } else {
            str2 = null;
        }
        ConcurrentHashMap concurrentHashMapLIZ = C178200mK.LIZ(str2);
        if (concurrentHashMapLIZ != null && (obj2 = concurrentHashMapLIZ.get("strategy_type")) != null) {
            string = obj2.toString();
        } else {
            string = null;
        }
        ArrayList arrayList = new ArrayList();
        for (QuickShareCandidate quickShareCandidate : list) {
            if (Intrinsics.LJFF(quickShareCandidate.candidateId, str)) {
                arrayList.add(quickShareCandidate);
            }
        }
        for (Object obj4 : arrayList) {
            QuickShareCandidate quickShareCandidate2 = (QuickShareCandidate) obj4;
            if (string != null && string.length() != 0) {
                ConcurrentHashMap concurrentHashMapLIZ2 = C178200mK.LIZ(quickShareCandidate2.extraInfo);
                if (concurrentHashMapLIZ2 != null && (obj = concurrentHashMapLIZ2.get("strategy_type")) != null) {
                    string2 = obj.toString();
                } else {
                    string2 = null;
                }
                if (Intrinsics.LJFF(string2, string)) {
                }
            }
            obj3 = obj4;
        }
        return (QuickShareCandidate) obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Qp(X.C1004480cFK r10, java.util.List<? extends com.ss.android.ugc.aweme.im.contacts.api.model.IMContact> r11, X.InterfaceC1364105Vn<? super kotlin.Pair<? extends com.ss.android.ugc.aweme.im.contacts.api.model.IMContact, java.lang.String>> r12) {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.internalshare.impl.feedquickshare.QuickShareButtonAssem.Qp(X.0cFK, java.util.List, X.05Vn):java.lang.Object");
    }

    public final void Vp(VideoItemParams videoItemParams, String str, C1004130cEl c1004130cEl) {
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C1004490cFL(videoItemParams, str, this, c1004130cEl, null), 3);
    }
}
