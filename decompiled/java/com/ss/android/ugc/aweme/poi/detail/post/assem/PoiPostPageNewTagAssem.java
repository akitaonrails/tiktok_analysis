package com.ss.android.ugc.aweme.poi.detail.post.assem;

import X.C01GW;
import X.C061S;
import X.C1187980h1I;
import X.C1189860h4K;
import X.C13BV;
import X.C1558360qeg;
import X.C1559260qg8;
import X.C20600815jK;
import X.C452501pT;
import X.C723580SZw;
import X.C724240Sb0;
import X.InterfaceC1891350zJl;
import X.InterfaceC665370Q7z;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ARunnableS118S0100000_18;
import Y.AsS45S0100000_18;
import android.os.SystemClock;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.post.PoiPostPageShareVM;
import com.ss.android.ugc.aweme.poi.detail.post.tag.TagBarLayoutManager;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AwS562S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiPostPageNewTagAssem extends UIContentAssem {
    public C1189860h4K LLJI;
    public C1189860h4K LLJIJIL;
    public ViewOnAttachStateChangeListenerC20604515jv LLJILJIL;
    public TuxNavBar LLJILJILJ;
    public boolean LLJJ;
    public Integer LLJJI;
    public boolean LLJJIII;
    public String LLJJIJI;
    public long LLJJIJIIJIL;
    public final C1559260qg8 LLIZLLLIL = new C1559260qg8(new C723580SZw(this, C061S.class, "PoiPostPageHierarchyData"), checkSupervisorPrepared());
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1180));
    public List<PoiListApi.PostTag> LLJILLL = C13BV.INSTANCE;
    public final long LLJJIJIL = 800;
    public final Set<String> LLJJJ = new LinkedHashSet();
    public final AsS45S0100000_18 LLJJJIL = new AsS45S0100000_18(this, 4);

    public final PoiPostPageShareVM Ho() {
        return (PoiPostPageShareVM) this.LLJ.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void No() {
        /*
            r9 = this;
            X.0h4K r4 = r9.LLJI
            if (r4 != 0) goto L5
            return
        L5:
            X.0h4K r8 = r9.LLJIJIL
            if (r8 != 0) goto La
            return
        La:
            com.bytedance.tux.navigation.TuxNavBar r7 = r9.LLJILJILJ
            if (r7 != 0) goto Lf
            return
        Lf:
            boolean r0 = r8.isAttachedToWindow()
            r6 = 0
            r5 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L4f
            r0 = 2
            int[] r3 = new int[r0]
            int[] r0 = new int[r0]
            r8.getLocationInWindow(r3)
            r7.getLocationInWindow(r0)
            r1 = 1
            r2 = r0[r1]
            int r0 = r7.getHeight()
            int r2 = r2 + r0
            r1 = r3[r1]
            int r0 = r8.getHeight()
            int r1 = r1 + r0
            if (r1 <= r2) goto L4f
            r0 = 0
        L35:
            float r1 = X.C13LZ.LIZLLL(r0, r6, r5)
            android.view.ViewPropertyAnimator r0 = r4.animate()
            r0.cancel()
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 > 0) goto L52
            X.ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(r4)
            r4.setAlpha(r6)
            r0 = 4
            X.C786410Ut5.l0(r4, r0)
            return
        L4f:
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L35
        L52:
            r0 = 0
            X.C786410Ut5.l0(r4, r0)
            X.ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(r4)
            r4.setAlpha(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.post.assem.PoiPostPageNewTagAssem.No():void");
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
    }

    public final void Go(boolean z) {
        int paddingTop;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJILJIL;
        if (viewOnAttachStateChangeListenerC20604515jv == null) {
            return;
        }
        Integer num = this.LLJJI;
        if (num != null) {
            paddingTop = num.intValue();
        } else {
            paddingTop = viewOnAttachStateChangeListenerC20604515jv.getPaddingTop();
        }
        if (z) {
            paddingTop = 0;
        }
        if (viewOnAttachStateChangeListenerC20604515jv.getPaddingTop() == paddingTop) {
            return;
        }
        viewOnAttachStateChangeListenerC20604515jv.setPaddingRelative(viewOnAttachStateChangeListenerC20604515jv.getPaddingStart(), paddingTop, viewOnAttachStateChangeListenerC20604515jv.getPaddingEnd(), viewOnAttachStateChangeListenerC20604515jv.getPaddingBottom());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:174:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.bytedance.assem.arch.core.UIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r18) {
        /*
            Method dump skipped, instruction units count: 661
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.post.assem.PoiPostPageNewTagAssem.onViewCreated(android.view.View):void");
    }

    public final void Lo(PoiListApi.PostTag postTag, int i) {
        InterfaceC665370Q7z interfaceC665370Q7zLJFF;
        Set<String> set = this.LLJJJ;
        String str = postTag.tagCode;
        if (str == null) {
            str = "";
        }
        if (!set.add(str)) {
            return;
        }
        C1187980h1I c1187980h1I = C1187980h1I.LIZ;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        PageFinder pageFinderVia = null;
        if (fragmentLJI != null) {
            interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLJI, null);
        } else {
            interfaceC665370Q7zLJFF = null;
        }
        Fragment fragmentLJI2 = C724240Sb0.LJI(this);
        if (fragmentLJI2 != null) {
            pageFinderVia = PageFinder.via(fragmentLJI2);
        }
        String str2 = postTag.tagCode;
        c1187980h1I.getClass();
        C1187980h1I.LIZIZ(interfaceC665370Q7zLJFF, pageFinderVia, str2, i);
    }

    public final void Jo(boolean z, final int i, PoiListApi.PostTag postTag, boolean z2) {
        InterfaceC665370Q7z interfaceC665370Q7zLJFF;
        PageFinder pageFinderVia;
        C20600815jK<InterfaceC1891350zJl> state;
        C1189860h4K c1189860h4K;
        if (z2) {
            return;
        }
        C1189860h4K c1189860h4K2 = this.LLJI;
        if (c1189860h4K2 != null) {
            c1189860h4K2.setSelectedPosition(i);
        }
        C1189860h4K c1189860h4K3 = this.LLJIJIL;
        if (c1189860h4K3 != null) {
            c1189860h4K3.setSelectedPosition(i);
        }
        this.LLJJIJI = postTag.tagCode;
        this.LLJJIJIIJIL = SystemClock.uptimeMillis();
        if (this.LLJJ) {
            if (i != -1 && (c1189860h4K = this.LLJI) != null) {
                C1189860h4K.LIZ(c1189860h4K, i);
            }
        } else if (i != -1) {
            if (z) {
                C1189860h4K c1189860h4K4 = this.LLJI;
                if (c1189860h4K4 != null) {
                    C1189860h4K.LIZ(c1189860h4K4, i);
                }
                final C1189860h4K c1189860h4K5 = this.LLJIJIL;
                if (c1189860h4K5 != null && i >= 0 && i < c1189860h4K5.LLILZIL.size()) {
                    HandlerHook.viewPost(c1189860h4K5.LL, new Runnable() { // from class: X.0h4G
                        public final /* synthetic */ int LLILLL = 0;

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            TagBarLayoutManager tagBarLayoutManager;
                            C1C7U.LIZ("TagBarView@5d1b.scrollToPositionWithOffset$1");
                            try {
                                if (c1189860h4K5.LL.getParent() != null) {
                                    RecyclerView.LayoutManager layoutManager = c1189860h4K5.LL.getLayoutManager();
                                    if ((layoutManager instanceof TagBarLayoutManager) && (tagBarLayoutManager = (TagBarLayoutManager) layoutManager) != null) {
                                        int i2 = i;
                                        int i3 = this.LLILLL;
                                        tagBarLayoutManager.LLJJIJI = i2;
                                        tagBarLayoutManager.LLJJIJIIJIL = i3;
                                        tagBarLayoutManager.requestLayout();
                                    }
                                }
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("TagBarView@5d1b.scrollToPositionWithOffset$1");
                        }
                    });
                }
            } else {
                C1189860h4K c1189860h4K6 = this.LLJIJIL;
                if (c1189860h4K6 != null) {
                    C1189860h4K.LIZ(c1189860h4K6, i);
                }
                final C1189860h4K c1189860h4K7 = this.LLJI;
                if (c1189860h4K7 != null && i >= 0 && i < c1189860h4K7.LLILZIL.size()) {
                    HandlerHook.viewPost(c1189860h4K7.LL, new Runnable() { // from class: X.0h4G
                        public final /* synthetic */ int LLILLL = 0;

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            TagBarLayoutManager tagBarLayoutManager;
                            C1C7U.LIZ("TagBarView@5d1b.scrollToPositionWithOffset$1");
                            try {
                                if (c1189860h4K7.LL.getParent() != null) {
                                    RecyclerView.LayoutManager layoutManager = c1189860h4K7.LL.getLayoutManager();
                                    if ((layoutManager instanceof TagBarLayoutManager) && (tagBarLayoutManager = (TagBarLayoutManager) layoutManager) != null) {
                                        int i2 = i;
                                        int i3 = this.LLILLL;
                                        tagBarLayoutManager.LLJJIJI = i2;
                                        tagBarLayoutManager.LLJJIJIIJIL = i3;
                                        tagBarLayoutManager.requestLayout();
                                    }
                                }
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("TagBarView@5d1b.scrollToPositionWithOffset$1");
                        }
                    });
                }
            }
        }
        C1187980h1I c1187980h1I = C1187980h1I.LIZ;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLJI, null);
        } else {
            interfaceC665370Q7zLJFF = null;
        }
        Fragment fragmentLJI2 = C724240Sb0.LJI(this);
        if (fragmentLJI2 != null) {
            pageFinderVia = PageFinder.via(fragmentLJI2);
        } else {
            pageFinderVia = null;
        }
        String str = postTag.tagCode;
        c1187980h1I.getClass();
        C1187980h1I.LIZ(interfaceC665370Q7zLJFF, pageFinderVia, str, i);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJILJIL;
        if (viewOnAttachStateChangeListenerC20604515jv != null && (state = viewOnAttachStateChangeListenerC20604515jv.getState()) != null) {
            state.LJFF(null);
        }
        PoiPostPageShareVM poiPostPageShareVMHo = Ho();
        if (poiPostPageShareVMHo != null) {
            poiPostPageShareVMHo.IQ2(postTag);
        }
        PoiPostPageShareVM poiPostPageShareVMHo2 = Ho();
        if (poiPostPageShareVMHo2 != null) {
            poiPostPageShareVMHo2.manualListRefresh();
        }
        if (!this.LLJJ && z) {
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLJILJIL;
            if (viewOnAttachStateChangeListenerC20604515jv2 != null) {
                viewOnAttachStateChangeListenerC20604515jv2.scrollToPosition(0);
            }
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv3 = this.LLJILJIL;
            if (viewOnAttachStateChangeListenerC20604515jv3 != null) {
                HandlerHook.viewPost(viewOnAttachStateChangeListenerC20604515jv3, new ARunnableS118S0100000_18(this, 39));
            }
        }
    }
}
