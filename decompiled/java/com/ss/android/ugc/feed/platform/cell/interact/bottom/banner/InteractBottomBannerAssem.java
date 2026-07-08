package com.ss.android.ugc.feed.platform.cell.interact.bottom.banner;

import X.C01GW;
import X.C03H5;
import X.C07CT;
import X.C0BOU;
import X.C0RD6;
import X.C0RF0;
import X.C0RJN;
import X.C0SH7;
import X.C1110904Wd;
import X.C1111004We;
import X.C1331670kl3;
import X.C1590970rVH;
import X.C1954807lC;
import X.C1A5L;
import X.C1AV3;
import X.C2180521AVm;
import X.C2271381DvM;
import X.C2271391DvN;
import X.C419910GdJ;
import X.C452501pT;
import X.C690870R8b;
import X.C724270Sb3;
import X.C786410Ut5;
import X.C799570VYd;
import X.C823050WQl;
import X.EnumC700430Rdh;
import X.InterfaceC1350790lFt;
import Y.ARunnableS44S0300000_11;
import Y.ARunnableS80S0200000_11;
import android.os.Looper;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.base.ui.bottom.banner.FeedBottomBannerView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.bottom.banner.FeedBottomBannerConfig;
import com.ss.android.ugc.aweme.feed.model.bottom.banner.FeedBottomBannerUIProps;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.tako.ITakoService;
import com.ss.android.ugc.feed.platform.cell.trigger.DynamicComponent;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public abstract class InteractBottomBannerAssem<T extends C03H5> extends DynamicComponent<T> {
    public FeedBottomBannerView LLJZIJLIL;
    public final C01GW LLL = C452501pT.LIZIZ(new AwS555S0100000_11((InteractBottomBannerAssem) this, 1208));
    public FeedBottomBannerConfig LLLF;
    public boolean LLLFF;

    public abstract String Jp();

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.b5e;
    }

    public abstract FeedBottomBannerConfig Up(FeedBottomBannerConfig.Builder builder);

    public boolean aq() {
        return false;
    }

    public boolean dq(VideoItemParams videoItemParams) {
        return true;
    }

    public final FeedBottomBannerConfig Qp() {
        FeedBottomBannerConfig feedBottomBannerConfig = this.LLLF;
        if (feedBottomBannerConfig != null) {
            return feedBottomBannerConfig;
        }
        return null;
    }

    private final boolean Vp() {
        C0RJN c0rjnLIZIZ;
        C690870R8b c690870R8bJm = jm();
        return C07CT.LIZ((c690870R8bJm == null || (c0rjnLIZIZ = c690870R8bJm.LIZIZ()) == null) ? null : c0rjnLIZIZ.LIZJ);
    }

    private final boolean Xp() {
        InterfaceC1350790lFt interfaceC1350790lFtLJIILL;
        C0RJN c0rjnLIZIZ;
        if (!Vp()) {
            ITakoService iTakoService = (ITakoService) PluggableExtentionKt.pluggableSpi$default(ITakoService.class, false, false, false, 14, null);
            if (iTakoService == null || (interfaceC1350790lFtLJIILL = iTakoService.LJIILL()) == null) {
                return false;
            }
            C690870R8b c690870R8bJm = jm();
            if (!interfaceC1350790lFtLJIILL.LJ((c690870R8bJm == null || (c0rjnLIZIZ = c690870R8bJm.LIZIZ()) == null) ? null : c0rjnLIZIZ.LIZJ)) {
                return false;
            }
        }
        return true;
    }

    public final boolean Gp() {
        Fragment fragment;
        LifecycleOwner activity;
        C0RF0 c0rf0 = jm().LIZLLL;
        if (c0rf0 == null || (fragment = c0rf0.LIZJ) == null || (activity = fragment.getActivity()) == null) {
            return true;
        }
        Fragment fragmentLIZ = C1590970rVH.LIZ(this);
        if (fragmentLIZ != null) {
            activity = fragmentLIZ;
        }
        Lifecycle.State currentState = activity.getLifecycle().getCurrentState();
        Lifecycle.State state = Lifecycle.State.DESTROYED;
        return currentState.compareTo(state) <= 0 || fragment.getLifecycle().getCurrentState().compareTo(state) <= 0 || fragment.isDetached() || getLifecycle().getCurrentState().compareTo(state) <= 0;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.trigger.DynamicComponent
    /* JADX INFO: renamed from: Ep */
    public void up(VideoItemParams videoItemParams) {
        C2180521AVm.LIZLLL(LJJIJL(), 8, C1AV3.LIZ(1, "Feed", null, "bottom_banner"));
        if (dq(videoItemParams)) {
            fq(videoItemParams);
        } else {
            C2180521AVm.LIZLLL(LJJIJL(), 8, C1AV3.LIZ(2, "Feed", null, "bottom_banner"));
        }
    }

    public final void Fp(boolean z) {
        ITakoService iTakoService;
        if (Xp()) {
            FeedBottomBannerView feedBottomBannerView = this.LLJZIJLIL;
            if (feedBottomBannerView != null && (iTakoService = (ITakoService) PluggableExtentionKt.pluggableSpi$default(ITakoService.class, false, false, false, 14, null)) != null) {
                Integer numValueOf = Integer.valueOf(C1111004We.LIZ());
                numValueOf.intValue();
                if (!Vp() || !C1110904Wd.LIZ()) {
                    numValueOf = null;
                }
                iTakoService.LJJZZIII(feedBottomBannerView, numValueOf);
                return;
            }
            return;
        }
        FeedBottomBannerView feedBottomBannerView2 = this.LLJZIJLIL;
        if (feedBottomBannerView2 == null) {
            return;
        }
        feedBottomBannerView2.setBackground(z);
    }

    public final void Ip(View.OnClickListener onClickListener) {
        FeedBottomBannerView feedBottomBannerView = this.LLJZIJLIL;
        if (feedBottomBannerView != null) {
            C786410Ut5.I9(feedBottomBannerView, onClickListener);
        }
        C2271391DvN.LIZ(this.LLJZIJLIL, (C1A5L) C2271381DvM.LJFF.getValue());
    }

    public final void Tp(FeedBottomBannerConfig feedBottomBannerConfig) {
        Integer num = feedBottomBannerConfig.interactionLayoutId;
        if (num != null) {
            C823050WQl.LIZLLL().execute(new ARunnableS44S0300000_11(feedBottomBannerConfig, this, num, 9));
        }
    }

    public final void Wp(FeedBottomBannerConfig.Builder builder) {
        View view;
        FeedBottomBannerView feedBottomBannerView;
        C0SH7 c0sh7;
        FeedBottomBannerView feedBottomBannerView2;
        FeedBottomBannerView feedBottomBannerView3;
        C419910GdJ c419910GdJ;
        FeedBottomBannerView feedBottomBannerView4;
        FeedBottomBannerView feedBottomBannerView5;
        FeedBottomBannerView feedBottomBannerView6;
        Function1<C1331670kl3, Unit> function1;
        FeedBottomBannerView feedBottomBannerView7;
        Integer num;
        FeedBottomBannerView feedBottomBannerView8;
        if (Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread())) {
            FeedBottomBannerConfig feedBottomBannerConfigBuild = builder.build();
            FeedBottomBannerConfig feedBottomBannerConfigQp = Qp();
            if (!Intrinsics.LJFF(feedBottomBannerConfigBuild.backgroundOverride, feedBottomBannerConfigQp.backgroundOverride)) {
                Fp(Intrinsics.LJFF(feedBottomBannerConfigBuild.backgroundOverride, Boolean.TRUE));
            }
            if ((!Intrinsics.LJFF(feedBottomBannerConfigBuild.iconType, feedBottomBannerConfigQp.iconType)) && (feedBottomBannerView8 = this.LLJZIJLIL) != null) {
                feedBottomBannerView8.setIconType(feedBottomBannerConfigBuild.iconType);
            }
            if ((!Intrinsics.LJFF(feedBottomBannerConfigBuild.iconRes, feedBottomBannerConfigQp.iconRes)) && (num = feedBottomBannerConfigBuild.iconRes) != null) {
                int iIntValue = num.intValue();
                FeedBottomBannerView feedBottomBannerView9 = this.LLJZIJLIL;
                if (feedBottomBannerView9 != null) {
                    Pair<Integer, Integer> pair = FeedBottomBannerView.LLJJIJIIJIL;
                    feedBottomBannerView9.LIZLLL(iIntValue, null);
                }
            }
            if ((!Intrinsics.LJFF(feedBottomBannerConfigBuild.iconLighten, feedBottomBannerConfigQp.iconLighten)) && (function1 = feedBottomBannerConfigBuild.iconLighten) != null && (feedBottomBannerView7 = this.LLJZIJLIL) != null) {
                feedBottomBannerView7.setLightenBuilder(function1);
            }
            boolean z = feedBottomBannerConfigBuild.titleSyncSet;
            if (z != feedBottomBannerConfigQp.titleSyncSet && (feedBottomBannerView6 = this.LLJZIJLIL) != null) {
                feedBottomBannerView6.setTitleUpdateSync(z);
            }
            int i = feedBottomBannerConfigBuild.titleMaxLine;
            if (i != feedBottomBannerConfigQp.titleMaxLine && (feedBottomBannerView5 = this.LLJZIJLIL) != null) {
                feedBottomBannerView5.setTitleMaxLines(i);
            }
            if ((!Intrinsics.LJFF(feedBottomBannerConfigBuild.titleEndIcon, feedBottomBannerConfigQp.titleEndIcon)) && (c419910GdJ = feedBottomBannerConfigBuild.titleEndIcon) != null && (feedBottomBannerView4 = this.LLJZIJLIL) != null) {
                Pair<Integer, Integer> pair2 = FeedBottomBannerView.LLJJIJIIJIL;
                feedBottomBannerView4.LJ(c419910GdJ, null);
            }
            if ((!Intrinsics.LJFF(feedBottomBannerConfigBuild.interactionType, feedBottomBannerConfigQp.interactionType)) && (feedBottomBannerView3 = this.LLJZIJLIL) != null) {
                feedBottomBannerView3.setInteractionAreaType(feedBottomBannerConfigBuild.interactionType);
            }
            if ((!Intrinsics.LJFF(feedBottomBannerConfigBuild.interactionAction, feedBottomBannerConfigQp.interactionAction)) && (c0sh7 = feedBottomBannerConfigBuild.interactionAction) != null && (feedBottomBannerView2 = this.LLJZIJLIL) != null) {
                feedBottomBannerView2.setInteractionAction(c0sh7);
            }
            if ((!Intrinsics.LJFF(feedBottomBannerConfigBuild.interactionLayoutView, feedBottomBannerConfigQp.interactionLayoutView)) && (view = feedBottomBannerConfigBuild.interactionLayoutView) != null && (feedBottomBannerView = this.LLJZIJLIL) != null) {
                feedBottomBannerView.setInteractionArea(view);
            }
            if (!Intrinsics.LJFF(feedBottomBannerConfigBuild.interactionLayoutId, feedBottomBannerConfigQp.interactionLayoutId)) {
                Tp(feedBottomBannerConfigBuild);
            }
            this.LLLF = feedBottomBannerConfigBuild;
            return;
        }
        C786410Ut5.LJJZZIII(C799570VYd.LIZJ(), new ARunnableS80S0200000_11(builder, this, 22));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC1565640qqQ
    public final void eventInit(C0RD6 c0rd6) {
        if (((Boolean) C0BOU.LIZ.getValue()).booleanValue()) {
            c0rd6.LIZIZ("event_component_clickable", new AwS590S0100000_11((InteractBottomBannerAssem) this, 330));
        }
    }

    public void fq(VideoItemParams videoItemParams) {
        if (Qp().interactionType == FeedBottomBannerConfig.InteractionType.BUTTON) {
            this.LLLFF = true;
            C2180521AVm.LIZLLL(LJJIJL(), 8, C1AV3.LIZ(3, "Feed", null, "bottom_banner"));
        } else {
            C786410Ut5.LJLLLLLL(0, LJJIJL());
        }
    }

    public final void iq(List<? extends FeedBottomBannerUIProps> list) {
        FeedBottomBannerView feedBottomBannerView;
        if (Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread())) {
            for (FeedBottomBannerUIProps feedBottomBannerUIProps : list) {
                if (feedBottomBannerUIProps instanceof FeedBottomBannerUIProps.Icon) {
                    String str = ((FeedBottomBannerUIProps.Icon) feedBottomBannerUIProps).url;
                    if (str != null && (feedBottomBannerView = this.LLJZIJLIL) != null) {
                        feedBottomBannerView.setIcon(str);
                    }
                } else if (feedBottomBannerUIProps instanceof FeedBottomBannerUIProps.Title) {
                    FeedBottomBannerView feedBottomBannerView2 = this.LLJZIJLIL;
                    if (feedBottomBannerView2 != null) {
                        feedBottomBannerView2.setTitle(((FeedBottomBannerUIProps.Title) feedBottomBannerUIProps).content);
                    }
                } else {
                    throw new C1954807lC();
                }
            }
            return;
        }
        C786410Ut5.LJJZZIII(C799570VYd.LIZJ(), new ARunnableS80S0200000_11(list, this, 23));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public void onViewCreated(View view) {
        FeedBottomBannerView feedBottomBannerView;
        FeedBottomBannerView feedBottomBannerView2;
        FeedBottomBannerView feedBottomBannerView3;
        FeedBottomBannerView feedBottomBannerView4;
        FeedBottomBannerView feedBottomBannerView5;
        super.onViewCreated(view);
        LJJIJL().getContext();
        this.LLLF = Up((FeedBottomBannerConfig.Builder) this.LLL.getValue());
        FeedBottomBannerView feedBottomBannerView6 = (FeedBottomBannerView) view.findViewById(R.id.tr7);
        this.LLJZIJLIL = feedBottomBannerView6;
        if (feedBottomBannerView6 != null) {
            feedBottomBannerView6.setCompactRightAreaEnabled(Vp());
        }
        FeedBottomBannerView feedBottomBannerView7 = this.LLJZIJLIL;
        if (feedBottomBannerView7 != null) {
            setComponentClickStatusExperimental(feedBottomBannerView7, EnumC700430Rdh.POSITIVE);
        }
        FeedBottomBannerConfig feedBottomBannerConfigQp = Qp();
        Boolean bool = feedBottomBannerConfigQp.backgroundOverride;
        Boolean bool2 = Boolean.TRUE;
        Fp(Intrinsics.LJFF(bool, bool2));
        FeedBottomBannerView feedBottomBannerView8 = this.LLJZIJLIL;
        if (feedBottomBannerView8 != null) {
            feedBottomBannerView8.setIconType(feedBottomBannerConfigQp.iconType);
        }
        if (Intrinsics.LJFF(feedBottomBannerConfigQp.iconTintOverride, bool2)) {
            Integer num = feedBottomBannerConfigQp.iconRes;
            if (num != null) {
                int iIntValue = num.intValue();
                FeedBottomBannerView feedBottomBannerView9 = this.LLJZIJLIL;
                if (feedBottomBannerView9 != null) {
                    feedBottomBannerView9.LIZLLL(iIntValue, Integer.valueOf(R.attr.a1r));
                }
            }
        } else {
            Integer num2 = feedBottomBannerConfigQp.iconRes;
            if (num2 != null) {
                int iIntValue2 = num2.intValue();
                FeedBottomBannerView feedBottomBannerView10 = this.LLJZIJLIL;
                if (feedBottomBannerView10 != null) {
                    Pair<Integer, Integer> pair = FeedBottomBannerView.LLJJIJIIJIL;
                    feedBottomBannerView10.LIZLLL(iIntValue2, null);
                }
            }
        }
        Function1<C1331670kl3, Unit> function1 = feedBottomBannerConfigQp.iconLighten;
        if (function1 != null && (feedBottomBannerView5 = this.LLJZIJLIL) != null) {
            feedBottomBannerView5.setLightenBuilder(function1);
        }
        FeedBottomBannerView feedBottomBannerView11 = this.LLJZIJLIL;
        if (feedBottomBannerView11 != null) {
            feedBottomBannerView11.setTitleMaxLines(feedBottomBannerConfigQp.titleMaxLine);
        }
        FeedBottomBannerView feedBottomBannerView12 = this.LLJZIJLIL;
        if (feedBottomBannerView12 != null) {
            feedBottomBannerView12.setTitleUpdateSync(feedBottomBannerConfigQp.titleSyncSet);
        }
        C419910GdJ c419910GdJ = feedBottomBannerConfigQp.titleEndIcon;
        if (c419910GdJ != null && (feedBottomBannerView4 = this.LLJZIJLIL) != null) {
            feedBottomBannerView4.LJ(c419910GdJ, feedBottomBannerConfigQp.titleEndIconView);
        }
        FeedBottomBannerView feedBottomBannerView13 = this.LLJZIJLIL;
        if (feedBottomBannerView13 != null) {
            feedBottomBannerView13.setInteractionAreaType(feedBottomBannerConfigQp.interactionType);
        }
        C0SH7 c0sh7 = feedBottomBannerConfigQp.interactionAction;
        if (c0sh7 != null && (feedBottomBannerView3 = this.LLJZIJLIL) != null) {
            feedBottomBannerView3.setInteractionAction(c0sh7);
        }
        View view2 = feedBottomBannerConfigQp.interactionLayoutView;
        if (view2 != null && (feedBottomBannerView2 = this.LLJZIJLIL) != null) {
            feedBottomBannerView2.setInteractionArea(view2);
        }
        Tp(feedBottomBannerConfigQp);
        int iLJJL = 0;
        if (!Xp()) {
            FeedBottomBannerView feedBottomBannerView14 = this.LLJZIJLIL;
            if (feedBottomBannerView14 != null) {
                feedBottomBannerView14.setExtraEndPadding(0);
                return;
            }
            return;
        }
        if (!Vp() || (feedBottomBannerView = this.LLJZIJLIL) == null) {
            return;
        }
        ITakoService iTakoService = (ITakoService) PluggableExtentionKt.pluggableSpi$default(ITakoService.class, false, false, false, 14, null);
        if (iTakoService != null) {
            iLJJL = iTakoService.LJJL();
        }
        feedBottomBannerView.setExtraEndPadding(iLJJL);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.trigger.DynamicComponent, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public /* bridge */ /* synthetic */ void up(Object obj) {
        up((VideoItemParams) obj);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC691660RBc
    public void J1(int i, Aweme aweme) {
        Object obj;
        if (this.LLLFF || aq()) {
            C724270Sb3 c724270Sb3 = this.LLJI;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            if (dq((VideoItemParams) obj)) {
                this.LLLFF = false;
                FeedBottomBannerView feedBottomBannerView = this.LLJZIJLIL;
                if (feedBottomBannerView != null) {
                    feedBottomBannerView.LIZ(new AwS555S0100000_11((InteractBottomBannerAssem) this, 1209));
                }
            }
        }
    }
}
