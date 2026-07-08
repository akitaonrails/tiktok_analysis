package com.ss.android.ugc.aweme.commercialize.feed.assem.interactivead;

import X.C01GW;
import X.C0RP1;
import X.C1017070cZd;
import X.C13IQ;
import X.C13LE;
import X.C1558520qew;
import X.C15O7;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452501pT;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C737910Sx3;
import X.InterfaceC1554640qYg;
import X.InterfaceC1731706qJ;
import X.InterfaceC207173165b;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC996730c2p;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.feed.assem.CommerceContentBaseAssem;
import com.ss.android.ugc.aweme.commercialize.feed.assem.FeedAdViewModel;
import com.ss.android.ugc.aweme.commercialize.service.IAdInteractiveAbility;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.model.AdGestureGuidance;
import com.ss.android.ugc.aweme.feed.model.AdInteractionData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AFwS300S0000000_16;
import kotlin.jvm.internal.AwS560S0100000_16;

/* JADX INFO: loaded from: classes17.dex */
public final class AdInteractiveAssem extends CommerceContentBaseAssem<AdInteractiveAssem> implements IAdInteractiveAbility, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLLIL;
    public final InterfaceC1731706qJ LLJJJJLIIL;
    public final C01GW LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public final C01GW LLJLIL;
    public boolean LLJLILLLLZIIL;
    public final C01GW LLJLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AdInteractiveAssem.class, "adInteractiveVM", "getAdInteractiveVM()Lcom/ss/android/ugc/aweme/commercialize/feed/assem/interactivead/AdInteractiveVM;", 0);
        C13LE.LIZ.getClass();
        LLJLLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public AdInteractiveAssem() {
        C0RP1 c0rp1 = C0RP1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AdInteractiveVM.class);
        this.LLJJJJLIIL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0rp1, C1637806bA.LIZ, new AwS560S0100000_16((C13IQ) c19719912DlLIZ, 163), null, AFwS252S0000000_16.get$arr$(115));
        this.LLJJL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), AFwS252S0000000_16.get$arr$(116));
        this.LLJJLIIIJLLLLLLLZ = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoPlayViewModel.class), AFwS252S0000000_16.get$arr$(117));
        this.LLJL = C737910Sx3.LIZJ(this, C13LE.LIZ(FeedAdViewModel.class), AFwS252S0000000_16.get$arr$(118));
        this.LLJLIL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 162));
        this.LLJLILLLLZIIL = true;
        this.LLJLL = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(130));
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 455427571) {
            return null;
        }
        return this;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem
    public final void so() {
        C736680Sv4.LJIIIIZZ(this, ep(), new C2217381BqS() { // from class: X.0c2J
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C232200v2) obj).LL;
            }
        }, C736820SvI.LJ(), AFwS300S0000000_16.get$arr$(23), 4);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC712990Rxx
    public final void unBind() {
        this.LLJLILLLLZIIL = true;
    }

    public final AdInteractiveVM ep() {
        return (AdInteractiveVM) this.LLJJJJLIIL.getValue(this, LLJLLIL[0]);
    }

    public final FeedAdViewModel hp() {
        return (FeedAdViewModel) this.LLJL.getValue();
    }

    public final InterfaceC996730c2p ip() {
        return (InterfaceC996730c2p) this.LLJLIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.IAdInteractiveAbility
    public final boolean isShowing() {
        return ip().isShowing();
    }

    public final void kp() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("triggerInteractivePause adInteractiveVM.item?.toTab = ");
        VideoItemParams item = ep().getItem();
        sbLIZ.append(item != null ? item.toTab : null);
        C2188811AlT.LIZIZ(sbLIZ);
        ip().onPause();
    }

    public final void lp() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("triggerInteractiveResume adInteractiveVM.item?.toTab = ");
        VideoItemParams item = ep().getItem();
        sbLIZ.append(item != null ? item.toTab : null);
        C2188811AlT.LIZIZ(sbLIZ);
        InterfaceC996730c2p interfaceC996730c2pIp = ip();
        VideoItemParams item2 = ep().getItem();
        interfaceC996730c2pIp.LJ(item2 != null ? item2.toTab : null, this.LLJLILLLLZIIL);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem, com.bytedance.assem.arch.reused.ReusedAssem
    public final void oo() {
        super.oo();
        ip().reset();
        ip().LJFF(null, null);
        ip().setVisibility(8);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void Zo() {
        kp();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void ap() {
        lp();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent
    /* JADX INFO: renamed from: cp */
    public final boolean ur(VideoItemParams videoItemParams) {
        Aweme aweme;
        VideoItemParams item = ep().getItem();
        if (item == null || (aweme = item.getAweme()) == null || !C1017070cZd.LLFZ(aweme)) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJL.getValue(), new C2217381BqS() { // from class: X.0RnM
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LL;
            }
        }, C736820SvI.LIZLLL(), AFwS300S0000000_16.get$arr$(32), 4);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJL.getValue(), new C2217381BqS() { // from class: X.0Ro9
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILZ;
            }
        }, null, AFwS300S0000000_16.get$arr$(33), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJLIIIJLLLLLLLZ.getValue(), new C2217381BqS() { // from class: X.0RoA
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0RFV) obj).LLJILLL;
            }
        }, C736820SvI.LIZLLL(), AFwS300S0000000_16.get$arr$(34), 4);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJLIIIJLLLLLLLZ.getValue(), new C2217381BqS() { // from class: X.0RnK
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0RFV) obj).LLILZLL;
            }
        }, C736820SvI.LIZLLL(), AFwS300S0000000_16.get$arr$(22), 4);
        C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.0c2q
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C996560c2Y) obj).LL;
            }
        }, C736820SvI.LIZLLL(), AFwS300S0000000_16.get$arr$(24), 4);
        C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.0c2C
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C996560c2Y) obj).LLILLJJLI;
            }
        }, C736820SvI.LIZLLL(), AFwS300S0000000_16.get$arr$(25), 4);
        C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.0c2Z
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C996560c2Y) obj).LLILZLL;
            }
        }, C736820SvI.LIZLLL(), AFwS300S0000000_16.get$arr$(26), 4);
        C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.0c2a
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C996560c2Y) obj).LLIZ;
            }
        }, C736820SvI.LIZLLL(), AFwS300S0000000_16.get$arr$(27), 4);
        C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.0c2b
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C996560c2Y) obj).LLIZLLLIL;
            }
        }, C736820SvI.LIZLLL(), AFwS300S0000000_16.get$arr$(28), 4);
        C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.0c2r
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C996560c2Y) obj).LLILZIL;
            }
        }, C736820SvI.LIZLLL(), AFwS300S0000000_16.get$arr$(29), 4);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJL.getValue(), new C2217381BqS() { // from class: X.0SEd
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLIZ;
            }
        }, C736820SvI.LIZLLL(), AFwS300S0000000_16.get$arr$(30), 4);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJL.getValue(), new C2217381BqS() { // from class: X.0Ro8
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLIZLLLIL;
            }
        }, C736820SvI.LIZLLL(), AFwS300S0000000_16.get$arr$(31), 4);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        AwemeRawAd awemeRawAd;
        AdInteractionData adInteractionData;
        AdGestureGuidance adGestureGuidance;
        UrlModel urlModel;
        List<String> urlList;
        VideoItemParams videoItemParams2 = videoItemParams;
        this.LLJLILLLLZIIL = true;
        Aweme aweme = videoItemParams2.getAweme();
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (adInteractionData = awemeRawAd.getAdInteractionData()) != null && (adGestureGuidance = adInteractionData.gestureGuidance) != null && (urlModel = adGestureGuidance.image) != null && (urlList = urlModel.getUrlList()) != null && (true ^ urlList.isEmpty())) {
            final String str = (String) ListProtector.get(urlList, 0);
            C15O7.LIZJ(new Callable() { // from class: X.0kWA
                /* JADX WARN: Type inference failed for: r3v0, types: [X.0kWB] */
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    C1C7U.LIZ("AdInteractiveAssem@5d4d.preloadGuideImage$1");
                    if (!C1322410kW7.LIZJ(UriProtector.parse(str))) {
                        String str2 = str;
                        final ?? r3 = new InterfaceC1322420kW8() { // from class: X.0kWB
                            @Override // X.InterfaceC1322420kW8
                            public final void LIZ() {
                            }

                            @Override // X.InterfaceC1322420kW8
                            public final void LIZIZ() {
                            }
                        };
                        if (str2 != null && !str2.isEmpty() && !C1322410kW7.LIZJ(UriProtector.parse(str2))) {
                            C1328130kfL.LJIILIIL().LJIIL().LJIIZILJ(C1325710kbR.LIZIZ(str2), null).LIZJ(new C0HWE<Void>() { // from class: X.0kW9
                                @Override // X.C0HWE
                                public final void LJ(InterfaceC1320200kSY<Void> interfaceC1320200kSY) {
                                    InterfaceC1322420kW8 interfaceC1322420kW8 = r3;
                                    if (interfaceC1322420kW8 != null) {
                                        interfaceC1322420kW8.LIZ();
                                    }
                                }

                                @Override // X.C0HWE
                                public final void LJFF(InterfaceC1320200kSY<Void> interfaceC1320200kSY) {
                                    InterfaceC1322420kW8 interfaceC1322420kW8 = r3;
                                    if (interfaceC1322420kW8 != null) {
                                        interfaceC1322420kW8.LIZIZ();
                                    }
                                }
                            }, (Executor) C1322500kWG.LIZIZ.getValue());
                        }
                    }
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("AdInteractiveAssem@5d4d.preloadGuideImage$1");
                    return unit;
                }
            });
            ip().LJFF(videoItemParams2.getAweme(), str);
            ip().setOperator(new InterfaceC207173165b() { // from class: X.0c2D
                @Override // X.InterfaceC207173165b
                public final void LJJLIIJ() {
                    ((VideoPlayViewModel) this.LIZ.LLJJLIIIJLLLLLLLZ.getValue()).LJJLIIJ();
                }

                @Override // X.InterfaceC207173165b
                public final void pauseVideo() {
                    ((VideoPlayViewModel) this.LIZ.LLJJLIIIJLLLLLLLZ.getValue()).pauseVideo();
                }
            });
            ip().setVisibility(8);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(Object obj) {
        return ur((VideoItemParams) obj);
    }
}
