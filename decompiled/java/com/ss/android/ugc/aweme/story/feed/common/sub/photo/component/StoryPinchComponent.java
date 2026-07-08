package com.ss.android.ugc.aweme.story.feed.common.sub.photo.component;

import X.C01GW;
import X.C0STN;
import X.C1558520qew;
import X.C19EG;
import X.C452501pT;
import X.C628500Oky;
import X.C630740Ooa;
import X.C724240Sb0;
import X.C729510SjV;
import X.EnumC584550MwH;
import X.InterfaceC665370Q7z;
import X.InterfaceC707080RoQ;
import Y.ATListenerS445S0100000_11;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.IDetailFeedSafService;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.story.feed.common.sub.ability.StoryPinchAbility;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryPinchComponent extends BaseCellContentComponent<StoryPinchComponent> implements InterfaceC707080RoQ, StoryPinchAbility {
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(149));
    public final C630740Ooa LLJJL = C628500Oky.LIZ(new AwS555S0100000_11(this, 633));
    public final C630740Ooa LLJJLIIIJLLLLLLLZ = C628500Oky.LIZ(new AwS555S0100000_11(this, 634));
    public final C630740Ooa LLJL = C628500Oky.LIZ(new AwS555S0100000_11(this, 632));
    public boolean LLJLIL = true;

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void Vo() {
        InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) this.LLJL.getValue();
        if (interfaceC665370Q7z != null) {
            C1558520qew.LJIIJJI(interfaceC665370Q7z, StoryPinchAbility.class, null);
        }
    }

    public final InterfaceC707080RoQ ep() {
        return (InterfaceC707080RoQ) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.sub.ability.StoryPinchAbility
    public final ATListenerS445S0100000_11 qm0() {
        return new ATListenerS445S0100000_11(this, 5);
    }

    @Override // X.InterfaceC707080RoQ
    public final void LJJJIL() {
        InterfaceC707080RoQ interfaceC707080RoQEp = ep();
        if (interfaceC707080RoQEp != null) {
            interfaceC707080RoQEp.LJJJIL();
        }
    }

    @Override // X.InterfaceC707080RoQ
    public final void LJZL() {
        InterfaceC707080RoQ interfaceC707080RoQEp = ep();
        if (interfaceC707080RoQEp != null) {
            interfaceC707080RoQEp.LJZL();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.AbstractC738140SxQ
    public final void onParentSet() {
        super.onParentSet();
        InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) this.LLJL.getValue();
        if (interfaceC665370Q7z != null) {
            C1558520qew.LJII(interfaceC665370Q7z, this, StoryPinchAbility.class, null, null);
        }
    }

    @Override // X.InterfaceC707080RoQ
    public final void onScaleBegin() {
        InterfaceC707080RoQ interfaceC707080RoQEp = ep();
        if (interfaceC707080RoQEp != null) {
            interfaceC707080RoQEp.onScaleBegin();
        }
    }

    @Override // X.InterfaceC707080RoQ
    public final void onScaleEnd() {
        InterfaceC707080RoQ interfaceC707080RoQEp = ep();
        if (interfaceC707080RoQEp != null) {
            interfaceC707080RoQEp.onScaleEnd();
        }
    }

    @Override // X.InterfaceC707080RoQ
    public final void jl(float f) {
        InterfaceC707080RoQ interfaceC707080RoQEp = ep();
        if (interfaceC707080RoQEp != null) {
            interfaceC707080RoQEp.jl(f);
        }
    }

    @Override // X.InterfaceC707080RoQ
    public final void onScale(float f) {
        InterfaceC707080RoQ interfaceC707080RoQEp = ep();
        if (interfaceC707080RoQEp != null) {
            interfaceC707080RoQEp.onScale(f);
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        View decorView;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        Fragment fragmentLIZ;
        Window window;
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        View view2 = null;
        if (c19egLIZ != null && (window = c19egLIZ.getWindow()) != null) {
            decorView = window.getDecorView();
        } else {
            decorView = null;
        }
        if ((decorView instanceof ViewGroup) && (viewGroup = (ViewGroup) decorView) != null && (view instanceof ViewGroup) && (viewGroup2 = (ViewGroup) view) != null) {
            IDetailFeedSafService iDetailFeedSafService = (IDetailFeedSafService) PluggableExtentionKt.pluggableSpi$default(IDetailFeedSafService.class, false, false, false, 14, null);
            if (iDetailFeedSafService != null && (fragmentLIZ = iDetailFeedSafService.LIZ(view)) != null) {
                view2 = fragmentLIZ.getView();
            }
            if ((view2 instanceof ViewGroup) && (viewGroup3 = (ViewGroup) view2) != null) {
                viewGroup = viewGroup3;
            }
            ((C0STN) this.LLJJJJLIIL.getValue()).LIZ(getContext(), viewGroup, viewGroup2, null, this, EnumC584550MwH.IMAGE, null);
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        this.LLJLIL = !C729510SjV.LJIJI(videoItemParams.getAweme());
    }
}
