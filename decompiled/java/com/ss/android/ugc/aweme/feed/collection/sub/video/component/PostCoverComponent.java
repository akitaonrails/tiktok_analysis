package com.ss.android.ugc.aweme.feed.collection.sub.video.component;

import X.C0R6C;
import X.C0R6F;
import X.C0R6H;
import X.C1558520qew;
import X.C19252910Tv;
import X.C628500Oky;
import X.C630740Ooa;
import X.C690360R6c;
import X.C960203pA;
import X.InterfaceC665370Q7z;
import X.InterfaceC690040R4w;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import com.ss.android.ugc.feed.platform.cell.component.cover.VideoCoverAbility;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class PostCoverComponent extends BaseCellContentComponent<PostCoverComponent> implements VideoCoverAbility {
    public C690360R6c LLJJJJLIIL;
    public final C630740Ooa LLJJL = C628500Oky.LIZ(new AwS555S0100000_11(this, 364));
    public final C630740Ooa LLJJLIIIJLLLLLLLZ;

    @Override // com.ss.android.ugc.feed.platform.cell.component.cover.VideoCoverAbility
    public final void Er1(String str) {
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.cover.VideoCoverAbility
    public final void lD2(boolean z) {
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.cover.VideoCoverAbility
    public final void qa1(String str) {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void Vo() {
        InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) this.LLJJL.getValue();
        if (interfaceC665370Q7z != null) {
            C1558520qew.LJIIJJI(interfaceC665370Q7z, VideoCoverAbility.class, null);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.cover.VideoCoverAbility
    public final SmartImageView getVideoCover() {
        C690360R6c c690360R6c = this.LLJJJJLIIL;
        View viewLIZIZ = c690360R6c != null ? c690360R6c.LIZIZ() : null;
        if (viewLIZIZ instanceof SmartImageView) {
            return (SmartImageView) viewLIZIZ;
        }
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC712990Rxx
    public final void unBind() {
        C690360R6c c690360R6c = this.LLJJJJLIIL;
        if (c690360R6c != null) {
            c690360R6c.LIZLLL();
        }
    }

    public PostCoverComponent() {
        C628500Oky.LIZ(new AwS555S0100000_11(this, 369));
        this.LLJJLIIIJLLLLLLLZ = C628500Oky.LIZ(new AwS555S0100000_11(this, 363));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.AbstractC738140SxQ
    public final void onParentSet() {
        super.onParentSet();
        InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) this.LLJJL.getValue();
        if (interfaceC665370Q7z != null) {
            C1558520qew.LJII(interfaceC665370Q7z, this, VideoCoverAbility.class, null, null);
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        InterfaceC690040R4w interfaceC690040R4wLLILZ;
        C0R6H c0r6h = new C0R6H(new C0R6C() { // from class: X.0R7O
            @Override // X.C0R6C
            public final Aweme im() {
                return null;
            }

            @Override // X.C0R6C
            public final boolean km() {
                return false;
            }

            @Override // X.C0R6C
            public final InterfaceC665370Q7z LLIIJLIL() {
                return C1558520qew.LJIIL(this.LIZ);
            }

            @Override // X.C0R6C
            public final Aweme getAweme() {
                return ((VideoItemParams) C631370Opb.LIZ(this.LIZ)).getAweme();
            }

            @Override // X.C0R6C
            public final int getPosition() {
                return ((VideoItemParams) C631370Opb.LIZ(this.LIZ)).currentPosition;
            }

            @Override // X.C0R6C
            public final C690870R8b jm() {
                return this.LIZ.jm();
            }
        }, (ViewGroup) view.findViewById(R.id.video_visible_area_container));
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.player_view);
        ViewGroup viewGroup2 = (ViewGroup) view.findViewById(R.id.kvf);
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.x0c);
        C19252910Tv c19252910Tv = C19252910Tv.LIZIZ;
        if (!c19252910Tv.LIZLLL().LJIJI().LJJJI() && viewStub != null) {
            interfaceC690040R4wLLILZ = c19252910Tv.LIZLLL().LJIJI().LLILZ(viewStub, C960203pA.LIZ(R.attr.bn, viewStub.getContext()));
        } else {
            interfaceC690040R4wLLILZ = null;
        }
        C0R6F c0r6f = new C0R6F(new AwS555S0100000_11(this, 365), new AwS555S0100000_11(viewGroup, 366), new AwS555S0100000_11(viewGroup2, 367), new AwS555S0100000_11(interfaceC690040R4wLLILZ, 368));
        if (this.LLJJJJLIIL == null) {
            this.LLJJJJLIIL = new C690360R6c(c0r6h, c0r6f);
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        C690360R6c c690360R6c = this.LLJJJJLIIL;
        if (c690360R6c != null) {
            c690360R6c.LIZ();
        }
    }
}
