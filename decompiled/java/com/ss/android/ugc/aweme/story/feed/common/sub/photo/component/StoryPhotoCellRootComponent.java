package com.ss.android.ugc.aweme.story.feed.common.sub.photo.component;

import X.C01GW;
import X.C0RBZ;
import X.C452501pT;
import X.C690430R6j;
import X.C691730RBj;
import X.InterfaceC445610Hdf;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.ss.android.ugc.aweme.feed.collection.common.component.SimpleRootCellComponent;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.story.feed.common.sub.abroll.StoryAbRollComponent;
import com.ss.android.ugc.aweme.story.feed.common.sub.photo.component.StoryStickerComponent;
import java.util.List;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AwS590S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryPhotoCellRootComponent extends SimpleRootCellComponent {
    public final C01GW LLJLILLLLZIIL;

    @Override // com.ss.android.ugc.aweme.feed.collection.common.component.SimpleRootCellComponent
    /* JADX INFO: renamed from: ep */
    public final void up(VideoItemParams videoItemParams) {
        super.up(videoItemParams);
        C691730RBj.LIZ(this, (C0RBZ) this.LLJLILLLLZIIL.getValue(), videoItemParams);
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.common.component.SimpleRootCellComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        ((C0RBZ) this.LLJLILLLLZIIL.getValue()).LIZ(new InterfaceC445610Hdf() { // from class: X.0I0t
            public static final /* synthetic */ int LL = 0;

            @Override // X.InterfaceC445610Hdf
            public final C13IQ<? extends ReusedUIAssem<? extends C03H5>> getType() {
                return C13LE.LIZ(StoryStickerComponent.class);
            }

            @Override // X.InterfaceC445610Hdf
            public final boolean Fc(VideoItemParams videoItemParams, C690870R8b c690870R8b) {
                List<InteractStickerStruct> interactStickerStructs = videoItemParams.getAweme().getInteractStickerStructs();
                if (interactStickerStructs == null) {
                    interactStickerStructs = C13BV.INSTANCE;
                }
                return !interactStickerStructs.isEmpty();
            }
        });
        ((C0RBZ) this.LLJLILLLLZIIL.getValue()).LIZ(new InterfaceC445610Hdf() { // from class: X.0Hdc
            public static final /* synthetic */ int LL = 0;

            @Override // X.InterfaceC445610Hdf
            public final C13IQ<? extends ReusedUIAssem<? extends C03H5>> getType() {
                return C13LE.LIZ(StoryAbRollComponent.class);
            }

            @Override // X.InterfaceC445610Hdf
            public final boolean Fc(VideoItemParams videoItemParams, C690870R8b c690870R8b) {
                return C729510SjV.LJJIJ(videoItemParams.getAweme());
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.common.component.SimpleRootCellComponent, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(VideoItemParams videoItemParams) {
        up(videoItemParams);
    }

    public StoryPhotoCellRootComponent(C690430R6j c690430R6j, AwS590S0100000_11 awS590S0100000_11) {
        super(c690430R6j, awS590S0100000_11);
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(348));
    }
}
