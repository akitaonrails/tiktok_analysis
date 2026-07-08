package com.ss.android.ugc.aweme.tako.multipletemplate.album;

import X.C01D1;
import X.C01GW;
import X.C0Q4Y;
import X.C13IQ;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import X.C462630ICf;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import X.ViewOnLayoutChangeListenerC1077260e8i;
import X.ViewTreeObserverOnPreDrawListenerC1077350e8r;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.tako.multipletemplate.gallery.TakoPhotoChooseViewModel;
import com.ss.android.ugc.aweme.views.RoundingCornerLayout;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AwS462S0200000_27;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS630S0100000_16;
import kotlin.jvm.internal.AwS641S0100000_27;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoMediaChooseAlbumAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIL;
    public ViewOnAttachStateChangeListenerC20604515jv LLJJI;
    public final AssemVMLazy LLJJIII;
    public RoundingCornerLayout LLJJIJI;
    public final C01GW LLJJIJIIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TakoMediaChooseAlbumAssem.class, "takoPhotoChooseViewModel", "getTakoPhotoChooseViewModel()Lcom/ss/android/ugc/aweme/tako/multipletemplate/gallery/TakoPhotoChooseViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public TakoMediaChooseAlbumAssem() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TakoPhotoChooseViewModel.class);
        this.LLJJIII = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, C1637806bA.LIZ, new AwS560S0100000_16((C13IQ) c19719912DlLIZ, 585), AFwS269S0000000_27.get$arr$(253), null, true);
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1305));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.fnu;
    }

    public final TakoPhotoChooseViewModel ip() {
        AssemVMLazy assemVMLazy = this.LLJJIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIL;
        return (TakoPhotoChooseViewModel) assemVMLazy.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void hp() {
        /*
            r5 = this;
            android.view.View r4 = r5.getContentView()
            com.ss.android.ugc.aweme.tako.multipletemplate.gallery.TakoPhotoChooseViewModel r0 = r5.ip()
            X.002o r0 = r0.getState()
            X.0yK0 r0 = (X.C1853060yK0) r0
            java.util.List<com.ss.android.ugc.aweme.tako.multipletemplate.gallery.TikTokMediaModel> r0 = r0.LLIZ
            android.view.ViewGroup$LayoutParams r3 = r4.getLayoutParams()
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L52
            android.view.ViewParent r2 = r4.getParent()
            boolean r1 = r2 instanceof android.view.View
            r0 = 0
            if (r1 == 0) goto L31
            android.view.View r2 = (android.view.View) r2
            if (r2 == 0) goto L31
            int r0 = r2.getHeight()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L31:
            int r1 = X.C0R2Q.LIZ(r0)
            if (r1 <= 0) goto L52
            X.01GW r0 = r5.LLJJIJIIJIL
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L52
            com.ss.android.ugc.aweme.tako.multipletemplate.gallery.TakoPhotoChooseViewModel r0 = r5.ip()
            int r0 = r0.LLJIJIL
            int r1 = r1 - r0
        L4c:
            r3.height = r1
            r4.requestLayout()
            return
        L52:
            r1 = -1
            goto L4c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.multipletemplate.album.TakoMediaChooseAlbumAssem.hp():void");
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem, com.bytedance.assem.arch.core.UIAssem
    public final void xo() {
        View view;
        super.xo();
        C786410Ut5.y3(LJJIJL().getViewTreeObserver(), new ViewTreeObserverOnPreDrawListenerC1077350e8r(this, 2));
        Object parent = LJJIJL().getParent();
        if (!(parent instanceof ViewGroup) || (view = (View) parent) == null) {
            return;
        }
        view.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC1077260e8i(this, 6));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        ViewGroup viewGroup;
        Context context;
        super.onViewCreated(view);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) LJJIJL().findViewById(R.id.kbj);
        this.LLJJI = viewOnAttachStateChangeListenerC20604515jv;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            viewOnAttachStateChangeListenerC20604515jv.setLayoutManager(new LinearLayoutManager(getContext()));
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLJJI;
        if (viewOnAttachStateChangeListenerC20604515jv2 != null && (context = viewOnAttachStateChangeListenerC20604515jv2.getContext()) != null) {
            context.getString(2131822526);
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv3 = this.LLJJI;
        if (viewOnAttachStateChangeListenerC20604515jv3 != null) {
            viewOnAttachStateChangeListenerC20604515jv3.LJIILJJIL(TakoAlbumCell.class);
            viewOnAttachStateChangeListenerC20604515jv3.setItemAnimator(null);
            viewOnAttachStateChangeListenerC20604515jv3.getState().LIZLLL = C0Q4Y.BUFFER;
        }
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0yKY
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1853060yK0) obj).LLIZLLLIL);
            }
        }, C736820SvI.LIZLLL(), new AwS630S0100000_16(this, 99), 4);
        this.LLJJIJI = (RoundingCornerLayout) view.findViewById(R.id.msd);
        C786410Ut5.LJLLLLLL(4, LJJIJL());
        ip().wQ2(view.getContext());
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0yKm
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1853060yK0) obj).LLILZLL;
            }
        }, null, new AwS641S0100000_27(this, 55), 6);
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0yKk
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1853060yK0) obj).LLJIJIL;
            }
        }, null, new AwS462S0200000_27(this, view, 5), 6);
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0yKl
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1853060yK0) obj).LLIZ;
            }
        }, null, new AwS641S0100000_27(this, 56), 6);
        View viewLJJIJL = LJJIJL();
        if ((viewLJJIJL instanceof ViewGroup) && (viewGroup = (ViewGroup) viewLJJIJL) != null) {
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
        }
        RoundingCornerLayout roundingCornerLayout = this.LLJJIJI;
        if (roundingCornerLayout != null) {
            roundingCornerLayout.setRoundingParams(new C462630ICf(0.0f, 0.0f, 0.0f, 0.0f));
        }
    }
}
