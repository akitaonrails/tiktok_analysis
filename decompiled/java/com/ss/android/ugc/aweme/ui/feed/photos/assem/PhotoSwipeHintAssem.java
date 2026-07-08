package com.ss.android.ugc.aweme.ui.feed.photos.assem;

import X.AnonymousClass0956;
import X.C01GW;
import X.C0SLX;
import X.C13LE;
import X.C2217381BqS;
import X.C716710S9l;
import X.C736680Sv4;
import X.C737910Sx3;
import X.InterfaceC469360Ias;
import Y.ATListenerS445S0100000_11;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.ui.feed.photos.PhotoViewModelV2;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AFwS294S0000000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class PhotoSwipeHintAssem extends BaseCellContentComponent<PhotoSwipeHintAssem> implements InterfaceC469360Ias {
    public static final /* synthetic */ int LLJLIL = 0;
    public final C01GW LLJJJJLIIL = C737910Sx3.LIZJ(this, C13LE.LIZ(PhotoViewModelV2.class), AFwS243S0000000_11.get$arr$(531));
    public C0SLX LLJJL;
    public AnonymousClass0956 LLJJLIIIJLLLLLLLZ;
    public C716710S9l LLJL;

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent
    /* JADX INFO: renamed from: cp */
    public final boolean ur(VideoItemParams videoItemParams) {
        return true;
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageScrolled(int i, float f, int i2) {
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageSelected(int i) {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem, com.bytedance.assem.arch.reused.ReusedAssem
    public final void oo() {
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LJL() {
        AnonymousClass0956 anonymousClass0956 = this.LLJJLIIIJLLLLLLLZ;
        if (anonymousClass0956 == null || !anonymousClass0956.isActive()) {
            return;
        }
        AnonymousClass0956 anonymousClass09562 = this.LLJJLIIIJLLLLLLLZ;
        if (anonymousClass09562 != null) {
            anonymousClass09562.LIZIZ(null);
        }
        C0SLX c0slx = this.LLJJL;
        if (c0slx != null) {
            c0slx.LJJIJL(0, 0, 0);
        }
    }

    public final PhotoViewModelV2 ep() {
        return (PhotoViewModelV2) this.LLJJJJLIIL.getValue();
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageScrollStateChanged(int i) {
        AnonymousClass0956 anonymousClass0956;
        if (i != 0) {
            if (i == 1 && (anonymousClass0956 = this.LLJJLIIIJLLLLLLLZ) != null) {
                anonymousClass0956.LIZIZ(null);
                return;
            }
            return;
        }
        C716710S9l c716710S9l = this.LLJL;
        if (c716710S9l == null) {
            return;
        }
        c716710S9l.LIZ.LIZ = 0;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLJJL = (C0SLX) view.findViewById(R.id.qez);
        this.LLJL = new C716710S9l(LJJIJL().getContext());
        C0SLX c0slx = this.LLJJL;
        if (c0slx != null) {
            c0slx.setOnDispatchTouchEventListener(new ATListenerS445S0100000_11(this, 3));
            C716710S9l c716710S9l = this.LLJL;
            if (c716710S9l != null) {
                c0slx.setScroller(c716710S9l);
            }
            c0slx.LIZLLL(this);
        }
        C736680Sv4.LJIIIIZZ(this, ep(), new C2217381BqS() { // from class: X.0S9R
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C0S9P) obj).LLJL);
            }
        }, null, AFwS294S0000000_11.get$arr$(188), 6);
        C736680Sv4.LJIIIIZZ(this, ep(), new C2217381BqS() { // from class: X.0Rjf
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C0S9P) obj).LLILZ);
            }
        }, null, AFwS294S0000000_11.get$arr$(189), 6);
        C736680Sv4.LJIIIIZZ(this, ep(), new C2217381BqS() { // from class: X.0RVN
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C0S9P) obj).LLJJLIIIJLLLLLLLZ);
            }
        }, null, AFwS294S0000000_11.get$arr$(190), 6);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(Object obj) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(VideoItemParams videoItemParams) {
    }
}
