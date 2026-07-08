package com.ss.android.ugc.aweme.series.commonfeed.component.bottombanner;

import X.C01GW;
import X.C0RRR;
import X.C0SGS;
import X.C0SGV;
import X.C0SGW;
import X.C13LE;
import X.C1483410ohn;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1637806bA;
import X.C1697810uHb;
import X.C197039127h;
import X.C19719912Dl;
import X.C19EG;
import X.C2097908Jt;
import X.C2217381BqS;
import X.C384050F3z;
import X.C418440Gaw;
import X.C452501pT;
import X.C718280SFm;
import X.C723830SaL;
import X.C724240Sb0;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC1577520r9a;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC718610SGt;
import Y.ARunnableS111S0100000_11;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.series.feed.ISeriesFeedService;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.ss.android.ugc.feed.platform.standard.preload.AbsFcpDataPreloadTask;
import com.ss.android.ugc.feed.platform.standard.preload.FcpStandardPreloadProtocol;
import com.zhiliaoapp.musically.R;
import irm.AkS27S0300000_11;
import irm.AkS56S0200000_11;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AFwS294S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class SeriesInteractBottomBannerAssem extends BaseCellSlotComponent<SeriesInteractBottomBannerAssem> implements FcpStandardPreloadProtocol {
    public static final C0SGW LLLFFI;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLFZ;
    public final C01GW LLJLLIL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoPlayViewModel.class), AFwS243S0000000_11.get$arr$(302));
    public final C01GW LLJLLL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), AFwS243S0000000_11.get$arr$(303));
    public final InterfaceC1731706qJ LLJZ;
    public C197039127h LLJZIJLIL;
    public TuxIconView LLL;
    public boolean LLLF;
    public final C01GW LLLFF;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SeriesInteractBottomBannerAssem.class, "playNextVM", "getPlayNextVM()Lcom/ss/android/ugc/aweme/series/commonfeed/component/bottombanner/SeriesPlayNextVM;", 0);
        C13LE.LIZ.getClass();
        LLLFZ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLLFFI = new C0SGW();
    }

    public SeriesInteractBottomBannerAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SeriesPlayNextVM.class);
        this.LLJZ = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), null, C1637806bA.LIZ, new AwS555S0100000_11(c19719912DlLIZ, 523), null, AFwS243S0000000_11.get$arr$(301));
        this.LLLFF = C452501pT.LIZIZ(new AwS555S0100000_11(this, 521));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.bhz;
    }

    @Override // com.ss.android.ugc.feed.platform.standard.preload.FcpStandardPreloadProtocol
    public final Map<Class<? extends AbsFcpDataPreloadTask<?, ?>>, InterfaceC718610SGt> so1() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC712990Rxx
    public final void unBind() {
    }

    public final SeriesPlayNextVM Bp() {
        return (SeriesPlayNextVM) this.LLJZ.getValue(this, LLLFZ[0]);
    }

    public final void Fp() {
        TuxIconView tuxIconView;
        C197039127h c197039127h = this.LLJZIJLIL;
        if (c197039127h == null || c197039127h.getVisibility() != 8) {
            C197039127h c197039127h2 = this.LLJZIJLIL;
            if (c197039127h2 != null) {
                c197039127h2.setTag(null);
            }
            C197039127h c197039127h3 = this.LLJZIJLIL;
            if (c197039127h3 != null) {
                C786410Ut5.LJLLLLLL(8, c197039127h3);
            }
        }
        TuxIconView tuxIconView2 = this.LLL;
        if ((tuxIconView2 == null || tuxIconView2.getVisibility() != 0) && (tuxIconView = this.LLL) != null) {
            C786410Ut5.LJLLLLLL(0, tuxIconView);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.standard.preload.FcpStandardPreloadProtocol
    public final Map<Class<? extends AbsFcpDataPreloadTask<?, ?>>, Function0<Object>> Yr2() {
        return C2097908Jt.LIZJ(new Pair(SeriesBottomBannerEntrancePreloadTask.class, new AwS555S0100000_11(this, 522)));
    }

    public final void Ep() {
        Aweme aweme;
        Video video;
        int duration;
        String string;
        String string2;
        String string3;
        String string4;
        InterfaceC1577520r9a interfaceC1577520r9aLIZIZ;
        VideoItemParams item = Bp().getItem();
        if (item == null || (aweme = item.getAweme()) == null || (video = aweme.getVideo()) == null || (duration = video.getDuration()) < 5000) {
            return;
        }
        Float fValueOf = Float.valueOf((((long) duration) - C1483410ohn.LJLJJI().getCurrentPosition()) / C1483410ohn.LJLJJI().getSpeed());
        if (fValueOf != null) {
            float fFloatValue = fValueOf.floatValue();
            ISeriesFeedService iSeriesFeedServiceLIZIZ = C0RRR.LIZIZ();
            if (iSeriesFeedServiceLIZIZ != null && (interfaceC1577520r9aLIZIZ = iSeriesFeedServiceLIZIZ.LIZIZ()) != null) {
                C724270Sb3 c724270Sb3 = this.LLJI;
                if (interfaceC1577520r9aLIZIZ.LJI(((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).mEventType)) {
                    Fp();
                    return;
                }
            }
            if (fFloatValue <= 5000.0f) {
                int i = C0SGV.LIZ[Bp().vQ2().ordinal()];
                if (i == 1) {
                    this.LLLF = true;
                    C19EG c19egLIZ = C724240Sb0.LIZ(this);
                    if (c19egLIZ == null || (string3 = c19egLIZ.getString(2131847448)) == null) {
                        return;
                    }
                    Gp(string3, SeriesBottomBannerButtonType.PLAY_NEXT);
                    return;
                }
                if (i != 2) {
                    Fp();
                    return;
                }
                this.LLLF = true;
                C19EG c19egLIZ2 = C724240Sb0.LIZ(this);
                if (c19egLIZ2 == null || (string4 = c19egLIZ2.getString(2131847449)) == null) {
                    return;
                }
                Gp(string4, SeriesBottomBannerButtonType.WATCH);
                return;
            }
            int i2 = C0SGV.LIZ[Bp().vQ2().ordinal()];
            if (i2 == 1) {
                if (!this.LLLF) {
                    Fp();
                    return;
                }
                this.LLLF = true;
                C19EG c19egLIZ3 = C724240Sb0.LIZ(this);
                if (c19egLIZ3 == null || (string = c19egLIZ3.getString(2131847448)) == null) {
                    return;
                }
                Gp(string, SeriesBottomBannerButtonType.PLAY_NEXT);
                return;
            }
            if (i2 != 2) {
                Fp();
                return;
            }
            if (!this.LLLF) {
                Fp();
                return;
            }
            this.LLLF = true;
            C19EG c19egLIZ4 = C724240Sb0.LIZ(this);
            if (c19egLIZ4 == null || (string2 = c19egLIZ4.getString(2131847449)) == null) {
                return;
            }
            Gp(string2, SeriesBottomBannerButtonType.WATCH);
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem, com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C1554610qYd.LIZJ(C1558520qew.LJIIL(this), FcpStandardPreloadProtocol.class, C1697810uHb.LJIILJJIL(this));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLL = (TuxIconView) view.findViewById(R.id.h4e);
        C197039127h c197039127h = (C197039127h) view.findViewById(R.id.d6g);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(34));
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.dy);
        c197039127h.setBackground(c384050F3z.LIZ(c197039127h.getContext()));
        c197039127h.LJJJJI(12.0f);
        C786410Ut5.I7(new AkS56S0200000_11(c197039127h, this, 6), c197039127h);
        this.LLJZIJLIL = c197039127h;
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJLLL.getValue(), new C2217381BqS() { // from class: X.0Nz5
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILLL;
            }
        }, null, AFwS294S0000000_11.get$arr$(260), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJLLL.getValue(), new C2217381BqS() { // from class: X.0Nks
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILZ;
            }
        }, null, AFwS294S0000000_11.get$arr$(261), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJLLIL.getValue(), new C2217381BqS() { // from class: X.0S9B
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0RFV) obj).LLJJL;
            }
        }, C736820SvI.LJ(), AFwS294S0000000_11.get$arr$(262), 4);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJLLIL.getValue(), new C2217381BqS() { // from class: X.0RSp
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0RFV) obj).LLJJIJI;
            }
        }, C736820SvI.LJ(), AFwS294S0000000_11.get$arr$(263), 4);
        C723830SaL.LIZ(this, null, new AwS590S0100000_11(this, 169));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent
    /* JADX INFO: renamed from: op */
    public final boolean ur(VideoItemParams videoItemParams) {
        int i = SeriesBannerInteractTriggerAssem.LLJJLIIIJLLLLLLLZ;
        return C0SGS.LIZ(videoItemParams);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        VideoItemParams videoItemParams2 = videoItemParams;
        this.LLLF = false;
        Fp();
        C786410Ut5.LJLLLLLL(0, getContentView());
        C786410Ut5.LJLLLLLL(0, LJJIJL());
        C0SGW c0sgw = LLLFFI;
        View viewLJJIJL = LJJIJL();
        c0sgw.getClass();
        View viewLIZ = C0SGW.LIZ(viewLJJIJL);
        if (viewLIZ != null) {
            viewLIZ.setEnabled(true);
            C786410Ut5.I7(new AkS27S0300000_11(videoItemParams2, this, viewLIZ, 1), viewLIZ);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(Object obj) {
        return ur((VideoItemParams) obj);
    }

    public final void Gp(String str, SeriesBottomBannerButtonType seriesBottomBannerButtonType) {
        boolean z;
        Object tag;
        Object obj;
        ViewPropertyAnimator viewPropertyAnimatorAlpha;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator viewPropertyAnimatorWithEndAction;
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        ViewPropertyAnimator viewPropertyAnimatorAlpha2;
        Object obj2;
        C197039127h c197039127h = this.LLJZIJLIL;
        if (c197039127h != null && c197039127h.getVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        Object obj3 = null;
        if (!z) {
            C718280SFm c718280SFm = C718280SFm.LIZ;
            C724270Sb3 c724270Sb3 = this.LLJI;
            if (c724270Sb3 != null) {
                obj2 = c724270Sb3.LL;
            } else {
                obj2 = null;
            }
            Aweme aweme = ((VideoItemParams) obj2).getAweme();
            C724270Sb3 c724270Sb32 = this.LLJI;
            if (c724270Sb32 != null) {
                obj3 = c724270Sb32.LL;
            }
            String str2 = ((VideoItemParams) obj3).mEventType;
            c718280SFm.getClass();
            C718280SFm.LIZ("series_play_next_button_show", aweme, seriesBottomBannerButtonType, str2);
        } else {
            C197039127h c197039127h2 = this.LLJZIJLIL;
            if (c197039127h2 != null) {
                tag = c197039127h2.getTag();
            } else {
                tag = null;
            }
            if (seriesBottomBannerButtonType != tag) {
                C718280SFm c718280SFm2 = C718280SFm.LIZ;
                C724270Sb3 c724270Sb33 = this.LLJI;
                if (c724270Sb33 != null) {
                    obj = c724270Sb33.LL;
                } else {
                    obj = null;
                }
                Aweme aweme2 = ((VideoItemParams) obj).getAweme();
                C724270Sb3 c724270Sb34 = this.LLJI;
                if (c724270Sb34 != null) {
                    obj3 = c724270Sb34.LL;
                }
                String str3 = ((VideoItemParams) obj3).mEventType;
                c718280SFm2.getClass();
                C718280SFm.LIZ("series_play_next_button_show", aweme2, seriesBottomBannerButtonType, str3);
            }
        }
        C197039127h c197039127h3 = this.LLJZIJLIL;
        if (c197039127h3 != null) {
            c197039127h3.setTag(seriesBottomBannerButtonType);
        }
        C197039127h c197039127h4 = this.LLJZIJLIL;
        if (c197039127h4 != null) {
            c197039127h4.setText(str);
        }
        C197039127h c197039127h5 = this.LLJZIJLIL;
        if (c197039127h5 != null && c197039127h5.getVisibility() == 0) {
            return;
        }
        C197039127h c197039127h6 = this.LLJZIJLIL;
        if (c197039127h6 != null) {
            C786410Ut5.LJLLLLLL(0, c197039127h6);
        }
        C197039127h c197039127h7 = this.LLJZIJLIL;
        if (c197039127h7 != null) {
            C786410Ut5.w5(c197039127h7, 0.0f);
        }
        C197039127h c197039127h8 = this.LLJZIJLIL;
        if (c197039127h8 != null && (viewPropertyAnimatorAnimate = c197039127h8.animate()) != null && (viewPropertyAnimatorAlpha2 = viewPropertyAnimatorAnimate.alpha(1.0f)) != null) {
            viewPropertyAnimatorAlpha2.setStartDelay(100L);
            viewPropertyAnimatorAlpha2.setDuration(200L).start();
        }
        TuxIconView tuxIconView = this.LLL;
        if (tuxIconView == null || (viewPropertyAnimatorAlpha = tuxIconView.animate().alpha(0.0f)) == null || (duration = viewPropertyAnimatorAlpha.setDuration(200L)) == null || (viewPropertyAnimatorWithEndAction = duration.withEndAction(new ARunnableS111S0100000_11(this, 43))) == null) {
            return;
        }
        viewPropertyAnimatorWithEndAction.start();
    }
}
