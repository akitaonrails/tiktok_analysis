package com.ss.android.ugc.aweme.story.feed.common.sub.video.component;

import X.C01GW;
import X.C03H5;
import X.C0RBZ;
import X.C19252910Tv;
import X.C452501pT;
import X.C690430R6j;
import X.C690870R8b;
import X.C691730RBj;
import X.InterfaceC445610Hdf;
import X.InterfaceC665370Q7z;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.ss.android.ugc.aweme.feed.collection.common.component.SimpleRootCellComponent;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.story.feed.common.sub.video.component.StoryShapeAdaptComponent;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import com.ss.android.ugc.feed.platform.cell.CellConfigurationProtocol;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS198S0000000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryVideoCellRootComponent extends SimpleRootCellComponent {
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
        if (C19252910Tv.LIZIZ.LIZLLL().LJIIJ().isPad() == 0) {
            ((C0RBZ) this.LLJLILLLLZIIL.getValue()).LIZ(new InterfaceC445610Hdf() { // from class: X.0R9h
                public static final /* synthetic */ int LL = 0;

                @Override // X.InterfaceC445610Hdf
                public final C13IQ<? extends ReusedUIAssem<? extends C03H5>> getType() {
                    return C13LE.LIZ(StoryShapeAdaptComponent.class);
                }

                @Override // X.InterfaceC445610Hdf
                public final boolean Fc(VideoItemParams videoItemParams, C690870R8b c690870R8b) {
                    if (videoItemParams.getAweme().getStoryType() == 3) {
                        return true;
                    }
                    return false;
                }
            });
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.common.component.SimpleRootCellComponent, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(VideoItemParams videoItemParams) {
        up(videoItemParams);
    }

    public StoryVideoCellRootComponent(C690430R6j c690430R6j, Function1<? super InterfaceC665370Q7z, ? extends List<? extends CellConfigurationProtocol<C690870R8b, BaseCellContentComponent<? extends C03H5>>>> function1) {
        super(c690430R6j, function1);
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(152));
    }
}
