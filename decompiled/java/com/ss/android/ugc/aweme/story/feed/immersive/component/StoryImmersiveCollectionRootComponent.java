package com.ss.android.ugc.aweme.story.feed.immersive.component;

import X.C01GW;
import X.C0RBZ;
import X.C0ZP4;
import X.C13LE;
import X.C452501pT;
import X.C690430R6j;
import X.C691730RBj;
import X.C723830SaL;
import X.C725080ScM;
import X.C737910Sx3;
import X.InterfaceC445610Hdf;
import Y.ARunnableS111S0100000_11;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.story.SocialProhibitedTipComponent;
import com.ss.android.ugc.aweme.feed.assem.tns.mask.contentclassification.TUCContentClassificationMaskAssem;
import com.ss.android.ugc.aweme.feed.assem.tns.mask.general.TUCGeneralMaskAssem;
import com.ss.android.ugc.aweme.feed.assem.tns.mask.photosensitive.TUCPhotosensitiveMaskAssem;
import com.ss.android.ugc.aweme.feed.assem.tns.mask.report.TUCReportMaskAssem;
import com.ss.android.ugc.aweme.feed.collection.common.component.SimpleRootCellComponent;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.VideoMaskInfo;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.story.feed.immersive.component.StoryHighlightsOverlayComponent;
import com.ss.android.ugc.aweme.story.feed.immersive.component.toparea.right.first.storytopost.StoryToPostStateComponent;
import com.ss.android.ugc.aweme.videohotswap.overlay.StoryPaywallComponentTrigger;
import com.ss.android.ugc.aweme.videohotswap.service.IPaidContentVideoHotSwapService;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryImmersiveCollectionRootComponent extends SimpleRootCellComponent {
    public final C01GW LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public final C01GW LLJLLIL;
    public volatile C0ZP4 LLJLLL;

    public final C0RBZ hp() {
        return (C0RBZ) this.LLJLILLLLZIIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.common.component.SimpleRootCellComponent
    /* JADX INFO: renamed from: ep */
    public final void up(VideoItemParams videoItemParams) {
        super.up(videoItemParams);
        C691730RBj.LIZ(this, hp(), videoItemParams);
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.common.component.SimpleRootCellComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        StoryPaywallComponentTrigger storyPaywallComponentTriggerLJIIJ = null;
        C723830SaL.LIZ(this, null, new AwS590S0100000_11(this, 202));
        hp().LIZ(new InterfaceC445610Hdf() { // from class: X.0RDg
            public static final /* synthetic */ int LL = 0;

            @Override // X.InterfaceC445610Hdf
            public final C13IQ<? extends ReusedUIAssem<? extends C03H5>> getType() {
                return C13LE.LIZ(SocialProhibitedTipComponent.class);
            }

            @Override // X.InterfaceC445610Hdf
            public final boolean Fc(VideoItemParams videoItemParams, C690870R8b c690870R8b) {
                return C692230RDh.LIZ(videoItemParams);
            }
        });
        hp().LIZ(new InterfaceC445610Hdf() { // from class: X.0RDl
            @Override // X.InterfaceC445610Hdf
            public final C13IQ<? extends ReusedUIAssem<? extends C03H5>> getType() {
                return C13LE.LIZ(TUCReportMaskAssem.class);
            }

            @Override // X.InterfaceC445610Hdf
            public final boolean Fc(VideoItemParams videoItemParams, C690870R8b c690870R8b) {
                C10IT c10it = C10IT.LIZ;
                Aweme aweme = videoItemParams.getAweme();
                c10it.getClass();
                return C10IT.LJIILJJIL(aweme);
            }
        });
        hp().LIZ(new InterfaceC445610Hdf() { // from class: X.0RDj
            @Override // X.InterfaceC445610Hdf
            public final C13IQ<? extends ReusedUIAssem<? extends C03H5>> getType() {
                return C13LE.LIZ(TUCGeneralMaskAssem.class);
            }

            @Override // X.InterfaceC445610Hdf
            public final boolean Fc(VideoItemParams videoItemParams, C690870R8b c690870R8b) {
                C10IT c10it = C10IT.LIZ;
                Aweme aweme = videoItemParams.getAweme();
                c10it.getClass();
                return C10IT.LJIIL(aweme);
            }
        });
        hp().LIZ(new InterfaceC445610Hdf() { // from class: X.0RDk
            @Override // X.InterfaceC445610Hdf
            public final C13IQ<? extends ReusedUIAssem<? extends C03H5>> getType() {
                return C13LE.LIZ(TUCPhotosensitiveMaskAssem.class);
            }

            @Override // X.InterfaceC445610Hdf
            public final boolean Fc(VideoItemParams videoItemParams, C690870R8b c690870R8b) {
                C10IT c10it = C10IT.LIZ;
                Aweme aweme = videoItemParams.getAweme();
                c10it.getClass();
                return C10IT.LJIILIIL(aweme);
            }
        });
        hp().LIZ(new InterfaceC445610Hdf() { // from class: X.0RDi
            @Override // X.InterfaceC445610Hdf
            public final C13IQ<? extends ReusedUIAssem<? extends C03H5>> getType() {
                return C13LE.LIZ(TUCContentClassificationMaskAssem.class);
            }

            @Override // X.InterfaceC445610Hdf
            public final boolean Fc(VideoItemParams videoItemParams, C690870R8b c690870R8b) {
                VideoMaskInfo contentClassificationMaskInfo = videoItemParams.getAweme().getContentClassificationMaskInfo();
                if (contentClassificationMaskInfo != null) {
                    return Intrinsics.LJFF(contentClassificationMaskInfo.showMask, Boolean.TRUE);
                }
                return false;
            }
        });
        hp().LIZ(new InterfaceC445610Hdf() { // from class: X.0RDU
            public static final /* synthetic */ int LL = 0;

            @Override // X.InterfaceC445610Hdf
            public final C13IQ<? extends ReusedUIAssem<? extends C03H5>> getType() {
                return C13LE.LIZ(StoryHighlightsOverlayComponent.class);
            }

            @Override // X.InterfaceC445610Hdf
            public final boolean Fc(VideoItemParams videoItemParams, C690870R8b c690870R8b) {
                return C0RH1.LIZ(c690870R8b);
            }
        });
        C725080ScM.LIZ().execute(new ARunnableS111S0100000_11(this, 51));
        hp().LIZ(new InterfaceC445610Hdf() { // from class: X.0RDV
            public static final /* synthetic */ int LL = 0;

            @Override // X.InterfaceC445610Hdf
            public final C13IQ<? extends ReusedUIAssem<? extends C03H5>> getType() {
                return C13LE.LIZ(StoryToPostStateComponent.class);
            }

            @Override // X.InterfaceC445610Hdf
            public final boolean Fc(VideoItemParams videoItemParams, C690870R8b c690870R8b) {
                Integer numValueOf;
                C0RF0 c0rf0 = c690870R8b.LIZLLL;
                if (c0rf0 != null) {
                    numValueOf = Integer.valueOf(c0rf0.LJIILJJIL);
                } else {
                    numValueOf = null;
                }
                if (C729510SjV.LJIILLIIL(numValueOf) && C712420Rx2.LIZ(videoItemParams.getAweme())) {
                    return true;
                }
                return false;
            }
        });
        IPaidContentVideoHotSwapService iPaidContentVideoHotSwapService = (IPaidContentVideoHotSwapService) PluggableExtentionKt.pluggableSpi$default(IPaidContentVideoHotSwapService.class, false, false, false, 14, null);
        if (iPaidContentVideoHotSwapService != null) {
            storyPaywallComponentTriggerLJIIJ = iPaidContentVideoHotSwapService.LJIIJ();
        }
        if ((storyPaywallComponentTriggerLJIIJ instanceof InterfaceC445610Hdf) && storyPaywallComponentTriggerLJIIJ != null) {
            hp().LIZ(storyPaywallComponentTriggerLJIIJ);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.common.component.SimpleRootCellComponent, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(VideoItemParams videoItemParams) {
        up(videoItemParams);
    }

    public StoryImmersiveCollectionRootComponent(C690430R6j c690430R6j, AwS590S0100000_11 awS590S0100000_11) {
        super(c690430R6j, awS590S0100000_11);
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(0));
        this.LLJLL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoEventDispatchViewModel.class), AFwS243S0000000_11.get$arr$(0));
        this.LLJLLIL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), AFwS243S0000000_11.get$arr$(1));
    }
}
