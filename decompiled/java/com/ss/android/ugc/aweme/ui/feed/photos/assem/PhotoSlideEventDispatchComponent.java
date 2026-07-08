package com.ss.android.ugc.aweme.ui.feed.photos.assem;

import X.C01GW;
import X.C0IB2;
import X.C0SKV;
import X.C0SLX;
import X.C0SMF;
import X.C0SO6;
import X.C0SOA;
import X.C0SOB;
import X.C0SOE;
import X.C13LE;
import X.C1558520qew;
import X.C2217381BqS;
import X.C2487409ou;
import X.C452501pT;
import X.C666700QDc;
import X.C687700QyG;
import X.C719520SKg;
import X.C719880SLq;
import X.C736680Sv4;
import X.C736820SvI;
import X.C737910Sx3;
import X.C738950Syj;
import X.InterfaceC1554640qYg;
import X.InterfaceC469360Ias;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import X.InterfaceC719500SKe;
import X.InterfaceC737790Swr;
import Y.ARunnableS80S0200000_11;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.ability.IPhotoSlidesEventDispatchAbility;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.model.SlidesImageLoadParams;
import com.ss.android.ugc.aweme.scope.PhotoSlideScope;
import com.ss.android.ugc.aweme.ui.feed.photos.PhotoViewModelV2;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import com.ss.android.ugc.feed.platform.container.scope.VideoCellScope;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AFwS294S0000000_11;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class PhotoSlideEventDispatchComponent extends BaseCellContentComponent<PhotoSlideEventDispatchComponent> implements InterfaceC719500SKe, C0SKV, IPhotoSlidesEventDispatchAbility, InterfaceC1554640qYg, InterfaceC737790Swr {
    public InterfaceC719500SKe LLJLIL;
    public C0SLX LLJLL;
    public C719880SLq LLJLLIL;
    public final C01GW LLJJJJLIIL = C737910Sx3.LIZJ(this, C13LE.LIZ(PhotoViewModelV2.class), AFwS243S0000000_11.get$arr$(526));
    public final PhotoSlideEventDispatchComponent LLJJL = this;
    public final PhotoSlideEventDispatchComponent LLJJLIIIJLLLLLLLZ = this;
    public final C01GW LLJL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(233));
    public final CopyOnWriteArrayList<InterfaceC719500SKe> LLJLILLLLZIIL = new CopyOnWriteArrayList<>();
    public int LLJLLL = -1;
    public final List<InterfaceC469360Ias> LLJZ = new ArrayList();

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 1334075177) {
            return null;
        }
        return this;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void Vo() {
        this.LLJLILLLLZIIL.clear();
    }

    public final C0SO6 ep() {
        return (C0SO6) this.LLJL.getValue();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LJL() {
        C0SO6 c0so6Ep = ep();
        c0so6Ep.LIZ.clear();
        c0so6Ep.LIZIZ.clear();
        c0so6Ep.LIZJ.clear();
        c0so6Ep.LIZLLL.clear();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.aweme.ability.IPhotoSlidesEventDispatchAbility
    public final boolean Bk0(C0SOA c0soa) {
        return ep().LJ.addIfAbsent(c0soa);
    }

    @Override // com.ss.android.ugc.aweme.ability.IPhotoSlidesEventDispatchAbility
    public final void GS0(C0SMF c0smf) {
        C719880SLq c719880SLq = this.LLJLLIL;
        if (c719880SLq != null) {
            c719880SLq.LLJJIJIL = c0smf;
        }
    }

    @Override // com.ss.android.ugc.aweme.ability.IPhotoSlidesEventDispatchAbility
    public final void IL1(C0SOB c0sob) {
        ep().LIZ.remove(c0sob);
    }

    @Override // com.ss.android.ugc.aweme.ability.IPhotoSlidesEventDispatchAbility
    public final boolean K32(C0SOE c0soe) {
        return ep().LIZJ.addIfAbsent(c0soe);
    }

    @Override // com.ss.android.ugc.aweme.ability.IPhotoSlidesEventDispatchAbility
    public final void K5(C0SMF c0smf) {
        C719880SLq c719880SLq = this.LLJLLIL;
        if (c719880SLq != null) {
            ((ArrayList) c719880SLq.LLJJJ).add(c0smf);
        }
    }

    @Override // com.ss.android.ugc.aweme.ability.IPhotoSlidesEventDispatchAbility
    public final void LLJJI(InterfaceC469360Ias interfaceC469360Ias) {
        if (this.LLJLL == null) {
            ((ArrayList) this.LLJZ).add(interfaceC469360Ias);
            return;
        }
        if (C0IB2.LIZ()) {
            C0SLX c0slx = this.LLJLL;
            if (c0slx != null) {
                c0slx.LIZLLL(interfaceC469360Ias);
                return;
            }
            return;
        }
        C2487409ou.LIZJ(new ARunnableS80S0200000_11(this, interfaceC469360Ias, 15));
    }

    @Override // com.ss.android.ugc.aweme.ability.IPhotoSlidesEventDispatchAbility
    public final void Qt(InterfaceC719500SKe interfaceC719500SKe) {
        this.LLJLILLLLZIIL.remove(interfaceC719500SKe);
    }

    @Override // com.ss.android.ugc.aweme.ability.IPhotoSlidesEventDispatchAbility
    public final void a71(C0SOE c0soe) {
        ep().LIZJ.remove(c0soe);
    }

    @Override // com.ss.android.ugc.aweme.ability.IPhotoSlidesEventDispatchAbility
    public final void b3(InterfaceC469360Ias interfaceC469360Ias) {
        if (this.LLJLL == null) {
            ((ArrayList) this.LLJZ).remove(interfaceC469360Ias);
            return;
        }
        if (C0IB2.LIZ()) {
            C0SLX c0slx = this.LLJLL;
            if (c0slx != null) {
                c0slx.LJJIIJZLJL(interfaceC469360Ias);
                return;
            }
            return;
        }
        C2487409ou.LIZJ(new ARunnableS80S0200000_11(this, interfaceC469360Ias, 16));
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{PhotoSlideScope.class}).unbindAbility(this.LLJJL, C0SKV.class);
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{VideoCellScope.class}).unbindAbility(this.LLJJLIIIJLLLLLLLZ, IPhotoSlidesEventDispatchAbility.class);
    }

    @Override // com.ss.android.ugc.aweme.ability.IPhotoSlidesEventDispatchAbility
    public final void fc1(C0SOA c0soa) {
        ep().LJ.remove(c0soa);
    }

    @Override // com.ss.android.ugc.aweme.ability.IPhotoSlidesEventDispatchAbility
    public final void lv0(C719520SKg c719520SKg) {
        this.LLJLIL = c719520SKg;
    }

    @Override // com.ss.android.ugc.aweme.ability.IPhotoSlidesEventDispatchAbility
    public final boolean oa2(C666700QDc c666700QDc) {
        return ep().LIZIZ.addIfAbsent(c666700QDc);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        PagerAdapter adapter;
        C0SLX c0slx = (C0SLX) view.findViewById(R.id.qez);
        this.LLJLL = c0slx;
        C719880SLq c719880SLq = null;
        if (c0slx != null) {
            adapter = c0slx.getAdapter();
        } else {
            adapter = null;
        }
        if (adapter instanceof C719880SLq) {
            c719880SLq = (C719880SLq) adapter;
        }
        this.LLJLLIL = c719880SLq;
        C0SLX c0slx2 = this.LLJLL;
        if (c0slx2 != null) {
            c0slx2.LIZLLL(new C738950Syj(this, 4));
        }
        if (!((ArrayList) this.LLJZ).isEmpty()) {
            for (InterfaceC469360Ias interfaceC469360Ias : (ArrayList) this.LLJZ) {
                C0SLX c0slx3 = this.LLJLL;
                if (c0slx3 != null) {
                    c0slx3.LIZLLL(interfaceC469360Ias);
                }
            }
            ((ArrayList) this.LLJZ).clear();
        }
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJJJLIIL.getValue(), new C2217381BqS() { // from class: X.0S9e
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C0S9P) obj).LLILZIL);
            }
        }, null, AFwS294S0000000_11.get$arr$(177), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJJJLIIL.getValue(), new C2217381BqS() { // from class: X.0Rjh
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C0S9P) obj).LLILZ);
            }
        }, C736820SvI.LIZLLL(), AFwS294S0000000_11.get$arr$(178), 4);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJJJLIIL.getValue(), new C2217381BqS() { // from class: X.0SO7
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C0S9P) obj).LLILLJJLI);
            }
        }, C736820SvI.LIZLLL(), AFwS294S0000000_11.get$arr$(179), 4);
    }

    @Override // X.InterfaceC719500SKe
    public final void p2(SlidesImageLoadParams slidesImageLoadParams) {
        InterfaceC719500SKe interfaceC719500SKe = this.LLJLIL;
        if (interfaceC719500SKe != null) {
            interfaceC719500SKe.p2(slidesImageLoadParams);
        }
        for (InterfaceC719500SKe interfaceC719500SKe2 : this.LLJLILLLLZIIL) {
            if (interfaceC719500SKe2 != null) {
                interfaceC719500SKe2.p2(slidesImageLoadParams);
            }
        }
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{PhotoSlideScope.class}).bindAbility(this.LLJJL, C0SKV.class);
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{VideoCellScope.class}).bindAbility(this.LLJJLIIIJLLLLLLLZ, IPhotoSlidesEventDispatchAbility.class);
    }

    @Override // com.ss.android.ugc.aweme.ability.IPhotoSlidesEventDispatchAbility
    public final void tj(C0SMF c0smf) {
        C719880SLq c719880SLq = this.LLJLLIL;
        if (c719880SLq != null) {
            ((ArrayList) c719880SLq.LLJJJ).remove(c0smf);
        }
    }

    @Override // com.ss.android.ugc.aweme.ability.IPhotoSlidesEventDispatchAbility
    public final boolean u52(C0SOB c0sob) {
        return ep().LIZ.addIfAbsent(c0sob);
    }

    @Override // X.InterfaceC719500SKe
    public final void u6(SlidesImageLoadParams slidesImageLoadParams) {
        InterfaceC719500SKe interfaceC719500SKe = this.LLJLIL;
        if (interfaceC719500SKe != null) {
            interfaceC719500SKe.u6(slidesImageLoadParams);
        }
        for (InterfaceC719500SKe interfaceC719500SKe2 : this.LLJLILLLLZIIL) {
            if (interfaceC719500SKe2 != null) {
                interfaceC719500SKe2.u6(slidesImageLoadParams);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ability.IPhotoSlidesEventDispatchAbility
    public final void x6(InterfaceC719500SKe interfaceC719500SKe) {
        this.LLJLILLLLZIIL.add(interfaceC719500SKe);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(VideoItemParams videoItemParams) {
    }

    @Override // X.C0SKV
    public final void F8(Drawable drawable, String str) {
        Iterator<C0SOA> it2 = ep().LJ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZIZ(drawable, str);
        }
    }

    @Override // X.InterfaceC719500SKe
    public final void n5(int i, JSONObject jSONObject) {
        InterfaceC719500SKe interfaceC719500SKe = this.LLJLIL;
        if (interfaceC719500SKe != null) {
            interfaceC719500SKe.n5(i, jSONObject);
        }
        for (InterfaceC719500SKe interfaceC719500SKe2 : this.LLJLILLLLZIIL) {
            if (interfaceC719500SKe2 != null) {
                interfaceC719500SKe2.n5(i, jSONObject);
            }
        }
    }

    @Override // X.C0SKV
    public final void r4(int i, int i2, int i3, int i4, String str) {
        Iterator<C0SOA> it2 = ep().LJ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(i, i2, i3, i4, str);
        }
    }
}
