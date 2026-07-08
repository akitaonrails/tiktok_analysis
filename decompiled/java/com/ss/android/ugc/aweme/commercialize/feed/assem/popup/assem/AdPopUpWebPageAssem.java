package com.ss.android.ugc.aweme.commercialize.feed.assem.popup.assem;

import X.C01GW;
import X.C0RP1;
import X.C1022620cia;
import X.C1035340d36;
import X.C1041070dCL;
import X.C13IQ;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C19EG;
import X.C1AF0;
import X.C20684815ws;
import X.C2217381BqS;
import X.C2344009Gk;
import X.C452501pT;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C988570bpf;
import X.C996020c1g;
import X.C996030c1h;
import X.C996040c1i;
import X.InterfaceC1035410d3D;
import X.InterfaceC1035570d3T;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC990300bsS;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.p;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.commercialize.feed.assem.popup.viewmodel.AdPopUpWebPageVM;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AFwS300S0000000_16;
import kotlin.jvm.internal.AwS560S0100000_16;

/* JADX INFO: loaded from: classes17.dex */
public final class AdPopUpWebPageAssem extends AbsAdPopUpWebPageAssem<AdPopUpWebPageAssem> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLLL;
    public final C01GW LLJL = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(131));
    public final InterfaceC1731706qJ LLJLIL;
    public final C996020c1g LLJLILLLLZIIL;
    public final C996030c1h LLJLL;
    public final C996040c1i LLJLLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AdPopUpWebPageAssem.class, "popUpVM", "getPopUpVM()Lcom/ss/android/ugc/aweme/commercialize/feed/assem/popup/viewmodel/AdPopUpWebPageVM;", 0);
        C13LE.LIZ.getClass();
        LLJLLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.0c1g] */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.0c1h] */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.0c1i] */
    public AdPopUpWebPageAssem() {
        C0RP1 c0rp1 = C0RP1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AdPopUpWebPageVM.class);
        this.LLJLIL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0rp1, C1637806bA.LIZ, new AwS560S0100000_16((C13IQ) c19719912DlLIZ, 166), null, AFwS252S0000000_16.get$arr$(127));
        this.LLJLILLLLZIIL = new InterfaceC1035410d3D() { // from class: X.0c1g
            @Override // X.InterfaceC1035410d3D
            public final void LIZIZ() {
            }

            @Override // X.InterfaceC1035410d3D
            public final String onShow() {
                Aweme aweme;
                AwemeRawAd awemeRawAd;
                Aweme aweme2;
                AdPopUpWebPageVM adPopUpWebPageVMHp = this.LIZ.cp();
                adPopUpWebPageVMHp.getClass();
                C1440005kM.LIZ(new C989800bre(true));
                adPopUpWebPageVMHp.setState(AFwS252S0000000_16.get$arr$(675));
                adPopUpWebPageVMHp.setState(AFwS252S0000000_16.get$arr$(676));
                adPopUpWebPageVMHp.LLILLJJLI = System.currentTimeMillis();
                VideoItemParams item = adPopUpWebPageVMHp.getItem();
                if (item != null && (aweme = item.getAweme()) != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && awemeRawAd.getWebviewType() == 1 && adPopUpWebPageVMHp.LLILLL == 2) {
                    VideoItemParams item2 = adPopUpWebPageVMHp.getItem();
                    C2184171Adz.LIZLLL("landing_ad", "detail_show", (item2 == null || (aweme2 = item2.getAweme()) == null) ? null : aweme2.getAwemeRawAd()).LJII();
                }
                return null;
            }

            @Override // X.InterfaceC1035410d3D
            public final String LIZ(int i) {
                String strVQ2 = this.LIZ.cp().vQ2();
                this.LIZ.cp().LL = null;
                return strVQ2;
            }

            @Override // X.InterfaceC1035410d3D
            public final void LIZLLL(int i) {
                ((VideoPlayViewModel) this.LIZ.LLJJJJ.getValue()).pauseVideo();
            }

            @Override // X.InterfaceC1035410d3D
            public final void LIZJ(int i, Boolean bool) {
                this.LIZ.cp().wQ2();
            }
        };
        this.LLJLL = new InterfaceC1035570d3T() { // from class: X.0c1h
            @Override // X.InterfaceC1035570d3T
            public final void LIZIZ() {
            }

            @Override // X.InterfaceC1035570d3T
            public final void LIZJ() {
            }

            @Override // X.InterfaceC1035570d3T
            public final void LIZ() {
                this.LIZ.cp().LL = "button";
                ((VideoPlayViewModel) this.LIZ.LLJJJJ.getValue()).LJJLIIJ();
            }
        };
        this.LLJLLIL = new InterfaceC990300bsS() { // from class: X.0c1i
            @Override // X.InterfaceC990300bsS
            public final void onBackPress() {
                this.LIZ.cp().LL = "back";
            }
        };
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem
    public final void so() {
        C736680Sv4.LJIIIIZZ(this, cp(), new C2217381BqS() { // from class: X.0c1d
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C995980c1c) obj).LLILLL;
            }
        }, null, AFwS300S0000000_16.get$arr$(46), 6);
        C736680Sv4.LJIIIIZZ(this, cp(), new C2217381BqS() { // from class: X.0c1e
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C995980c1c) obj).LL;
            }
        }, null, AFwS300S0000000_16.get$arr$(47), 6);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.assem.popup.assem.AbsAdPopUpWebPageAssem
    /* JADX INFO: renamed from: hp, reason: merged with bridge method [inline-methods] */
    public final AdPopUpWebPageVM cp() {
        return (AdPopUpWebPageVM) this.LLJLIL.getValue(this, LLJLLL[0]);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void Zo() {
        AdPopUpWebPageVM adPopUpWebPageVMCp = cp();
        long jCurrentTimeMillis = System.currentTimeMillis() - cp().LLILLJJLI;
        adPopUpWebPageVMCp.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZLLL(jCurrentTimeMillis, "duration");
        C20684815ws.LJIILLIIL("h5_stay_time", c2344009Gk.LIZ);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void ap() {
        AdPopUpWebPageVM adPopUpWebPageVMCp = cp();
        adPopUpWebPageVMCp.getClass();
        adPopUpWebPageVMCp.LLILLJJLI = System.currentTimeMillis();
        C1035340d36 c1035340d36 = this.LLJJLIIIJLLLLLLLZ;
        if (c1035340d36 == null || !c1035340d36.LJIIJJI()) {
            return;
        }
        ((VideoPlayViewModel) this.LLJJJJ.getValue()).pauseVideo();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem, com.bytedance.assem.arch.reused.ReusedAssem
    public final void oo() {
        super.oo();
        C1022620cia.LJ("AdPopUpWebPageAssem", "on in active");
        C1035340d36 c1035340d36 = this.LLJJLIIIJLLLLLLLZ;
        if (c1035340d36 != null) {
            c1035340d36.LJIJJ(true);
            C786410Ut5.LJJJLZIJ(c1035340d36, (ViewGroup) LJJIJL());
        }
        this.LLJJLIIIJLLLLLLLZ = null;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.assem.popup.assem.AbsAdPopUpWebPageAssem
    /* JADX INFO: renamed from: dp */
    public final boolean ur(VideoItemParams videoItemParams) {
        boolean z;
        boolean z2;
        String extra;
        AdPopUpWebPageVM adPopUpWebPageVMCp = cp();
        Aweme aweme = videoItemParams.getAweme();
        adPopUpWebPageVMCp.getClass();
        if (aweme == null) {
            return false;
        }
        List<AnchorCommonStruct> anchors = aweme.getAnchors();
        if (anchors != null) {
            Iterator<AnchorCommonStruct> it2 = anchors.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                AnchorCommonStruct next = it2.next();
                if (next.getType() == 24 && (extra = next.getExtra()) != null && extra.length() != 0) {
                    Boolean bool = (Boolean) GsonProtectorUtils.fromJson(new Gson(), GsonProtectorUtils.parse(new p(), next.getExtra()).LJIILIIL().LJJIIZ("is_schema_lynx"), new TypeToken<Boolean>() { // from class: X.0c28
                    }.getType());
                    if (bool != null) {
                        if (bool.booleanValue()) {
                            return true;
                        }
                        if (aweme == null) {
                            return false;
                        }
                    }
                }
            }
        }
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd == null) {
            return false;
        }
        if (awemeRawAd.getWebviewType() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (awemeRawAd.getProfileWithWebview() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z && !z2) {
            return false;
        }
        return true;
    }

    public final FrameLayout ep(C19EG c19eg) {
        FrameLayout frameLayout;
        Integer numValueOf = null;
        if (c19eg == null) {
            return null;
        }
        ViewStub viewStub = (ViewStub) c19eg.findViewById(R.id.a91);
        if (viewStub != null && viewStub.getParent() != null) {
            C988570bpf.LIZ.getClass();
            if (C1041070dCL.LIZ() != null) {
                numValueOf = Integer.valueOf(R.layout.cd4);
            }
            viewStub.setLayoutResource(numValueOf.intValue());
            frameLayout = (FrameLayout) C786410Ut5.LJLLLL(viewStub);
        } else {
            frameLayout = (FrameLayout) c19eg.findViewById(R.id.a90);
        }
        if (frameLayout == null) {
            ViewStub viewStub2 = (ViewStub) c19eg.findViewById(R.id.a7l);
            if (viewStub2 != null && viewStub2.getParent() != null) {
                viewStub2.setLayoutResource(R.layout.kz);
                return (FrameLayout) C786410Ut5.LJLLLL(viewStub2);
            }
            return (FrameLayout) c19eg.findViewById(R.id.a7k);
        }
        return frameLayout;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.assem.popup.assem.AbsAdPopUpWebPageAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        try {
            SettingsManager.LIZLLL().getClass();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
        }
        if (SettingsManager.LIZ("commerce_video_root_view_optimize", true)) {
            FrameLayout frameLayoutEp = ep(C724240Sb0.LIZ(this));
            if (frameLayoutEp != null) {
                C1022620cia.LJ("AdPopUpWebPageAssem", "set containerView");
                this.LLJJI = frameLayoutEp;
            }
        }
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJJJLIIL.getValue(), new C2217381BqS() { // from class: X.0SJz
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILLJJLI;
            }
        }, null, AFwS300S0000000_16.get$arr$(48), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJL.getValue(), new C2217381BqS() { // from class: X.0c26
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C996360c2E) obj).LL;
            }
        }, null, AFwS300S0000000_16.get$arr$(49), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJJJJIL.getValue(), new C2217381BqS() { // from class: X.0c25
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C996560c2Y) obj).LLJ;
            }
        }, null, AFwS300S0000000_16.get$arr$(50), 6);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.assem.popup.assem.AbsAdPopUpWebPageAssem, X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(VideoItemParams videoItemParams) {
        return ur(videoItemParams);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(VideoItemParams videoItemParams) {
    }
}
