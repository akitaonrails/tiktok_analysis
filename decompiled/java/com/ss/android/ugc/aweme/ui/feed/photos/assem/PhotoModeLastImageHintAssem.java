package com.ss.android.ugc.aweme.ui.feed.photos.assem;

import X.C01GW;
import X.C0BKL;
import X.C0HIW;
import X.C0HIX;
import X.C0HU6;
import X.C0HUY;
import X.C0RHE;
import X.C0SLX;
import X.C0SPE;
import X.C0SRF;
import X.C12P4;
import X.C1342130l1v;
import X.C13LE;
import X.C1440005kM;
import X.C1558520qew;
import X.C1697810uHb;
import X.C19746412Nq;
import X.C1EE2;
import X.C20684815ws;
import X.C21647019ng;
import X.C2344009Gk;
import X.C426750GoL;
import X.C690450R6l;
import X.C698300RaG;
import X.C719880SLq;
import X.C721190SQr;
import X.C724270Sb3;
import X.C737910Sx3;
import X.C786410Ut5;
import X.EnumC706820Ro0;
import Y.ARunnableS111S0100000_11;
import android.content.Context;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.ui.feed.photos.PhotoViewModelV2;
import com.ss.android.ugc.aweme.ui.feed.subphoto.holders.PhotosViewHolderV3;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS243S0000000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class PhotoModeLastImageHintAssem extends BaseCellContentComponent<PhotoModeLastImageHintAssem> {
    public static boolean LLLILZ;
    public C0SLX LLJJJJLIIL;
    public TuxTextView LLJJL;
    public C12P4 LLJJLIIIJLLLLLLLZ;
    public boolean LLJLIL;
    public boolean LLJLILLLLZIIL;
    public C719880SLq LLJLL;
    public boolean LLJZIJLIL;
    public InteractAreaCommonAbility LLL;
    public boolean LLLF;
    public boolean LLLFF;
    public C21647019ng LLLFFI;
    public C21647019ng LLLFZ;
    public final C698300RaG LLLI;
    public boolean LLLII;
    public Float LLLIIII;
    public final C0HU6 LLLIIIIL;
    public final List<C19746412Nq> LLLIIIL;
    public final C0HU6 LLLIIL;
    public final List<C19746412Nq> LLLIILIL;
    public final List<C19746412Nq> LLLIL;
    public final C01GW LLJL = C737910Sx3.LIZJ(this, C13LE.LIZ(PhotoViewModelV2.class), AFwS243S0000000_11.get$arr$(518));
    public final int LLJLLIL = 1;
    public final int LLJLLL = 2;
    public int LLJZ = 1;

    public final PhotosViewHolderV3 ep() {
        PhotosViewHolderV3 photosViewHolderV3;
        View view;
        View childAt;
        try {
            C0SLX c0slx = this.LLJJJJLIIL;
            if (c0slx != null) {
                int childCount = c0slx.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    C0SLX c0slx2 = this.LLJJJJLIIL;
                    Object tag = (c0slx2 == null || (childAt = c0slx2.getChildAt(i)) == null) ? null : childAt.getTag(R.id.el8);
                    if ((tag instanceof PhotosViewHolderV3) && (photosViewHolderV3 = (PhotosViewHolderV3) tag) != null && (view = photosViewHolderV3.LL) != null && ((TuxIconView) view.findViewById(R.id.qcv)) != null) {
                        return photosViewHolderV3;
                    }
                }
            }
            return null;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public final PhotoViewModelV2 ip() {
        return (PhotoViewModelV2) this.LLJL.getValue();
    }

    public final void kp() {
        C0SLX c0slx;
        String str;
        List<PhotoModeImageUrlModel> imageList;
        BaseFeedPageParams baseFeedPageParams;
        Context context;
        View view;
        TuxIconView tuxIconView;
        BaseFeedPageParams baseFeedPageParams2;
        if (!this.LLJLILLLLZIIL) {
            C0SLX c0slx2 = this.LLJJJJLIIL;
            if (c0slx2 != null) {
                c0slx2.setSmoothScrollDelay(false);
                return;
            }
            return;
        }
        VideoItemParams videoItemParams = ip().LLILLL;
        Integer numValueOf = (videoItemParams == null || (baseFeedPageParams2 = videoItemParams.baseFeedPageParams) == null) ? null : Integer.valueOf(baseFeedPageParams2.awemeFromPage);
        VideoItemParams videoItemParams2 = ip().LLILLL;
        String str2 = videoItemParams2 != null ? videoItemParams2.mEventType : null;
        if (numValueOf != null) {
            numValueOf.intValue();
        }
        C690450R6l c690450R6l = new C690450R6l(str2);
        Context context2 = getContext();
        int iHashCode = context2 != null ? context2.hashCode() : 0;
        if (numValueOf != null) {
            numValueOf.intValue();
        }
        C0SPE c0spe = new C0SPE(iHashCode, 0);
        ip();
        C1440005kM.LIZ(c690450R6l);
        C1440005kM.LIZ(c0spe);
        PhotosViewHolderV3 photosViewHolderV3Ep = ep();
        if (photosViewHolderV3Ep != null && (view = photosViewHolderV3Ep.LL) != null && (tuxIconView = (TuxIconView) view.findViewById(R.id.qcv)) != null) {
            tuxIconView.setIconRes(R.raw.icon_arrow_left_circle_ltr);
            tuxIconView.setTintColorRes(R.attr.zl);
            C786410Ut5.x5(tuxIconView, 0.0f);
        }
        mp(false, null);
        if ((this.LLJZ == this.LLJLLIL || ((context = getContext()) != null && C426750GoL.LIZLLL(context) && this.LLJZ == this.LLJLLL)) && (c0slx = this.LLJJJJLIIL) != null && c0slx.getCurrentItem() == hp()) {
            C786410Ut5.LJJZZIII(new BPEAHandler(), new ARunnableS111S0100000_11(this, 198));
        }
        C721190SQr c721190SQr = C721190SQr.LIZ;
        C724270Sb3 c724270Sb3 = this.LLJI;
        Aweme aweme = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme();
        VideoItemParams videoItemParams3 = ip().LLILLL;
        if (videoItemParams3 == null || (baseFeedPageParams = videoItemParams3.baseFeedPageParams) == null || (str = baseFeedPageParams.eventType) == null) {
            str = "";
        }
        VideoItemParams videoItemParams4 = ip().LLILLL;
        int i = videoItemParams4 != null ? videoItemParams4.isEnterGraphicDetail : 0;
        c721190SQr.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("to_user_id", AwemeExtKt.getAuthorUid(aweme));
        c2344009Gk.LJIIIIZZ("group_id", aweme.getGroupId());
        c2344009Gk.LJIIIIZZ("request_id", aweme.getRequestId());
        c2344009Gk.LJIIIIZZ("log_pb", aweme.getLogPbString());
        c2344009Gk.LJIIIIZZ("author_id", AwemeExtKt.getAuthorUid(aweme));
        c2344009Gk.LJIIIIZZ("enter_method", "slide_left");
        PhotoModeImageInfo photoModeImageInfo = aweme.getPhotoModeImageInfo();
        c2344009Gk.LIZJ((photoModeImageInfo == null || (imageList = photoModeImageInfo.getImageList()) == null) ? 0 : imageList.size(), "pic_cnt");
        c2344009Gk.LIZJ(aweme.getAwemeType(), "aweme_type");
        c2344009Gk.LIZLLL(System.currentTimeMillis(), "profile_entrance_id");
        if (C1EE2.LIZIZ.LIZLLL()) {
            c2344009Gk.LIZJ(i, "is_enter_graphic_detail");
        }
        C20684815ws.LJIILLIIL("enter_personal_detail", c2344009Gk.LIZ);
        this.LLJLILLLLZIIL = false;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem, com.bytedance.assem.arch.reused.ReusedAssem
    public final void oo() {
        TuxTextView tuxTextView = this.LLJJL;
        if (tuxTextView != null) {
            C786410Ut5.LLLLZLL(tuxTextView, 8);
        }
        C12P4 c12p4 = this.LLJJLIIIJLLLLLLLZ;
        if (c12p4 != null) {
            C786410Ut5.LLLLLLZ(c12p4, 8);
        }
    }

    public PhotoModeLastImageHintAssem() {
        C0SRF c0srf = new C0SRF();
        c0srf.LIZ = 100L;
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        c0srf.LIZIZ = linearInterpolator;
        this.LLLI = new C698300RaG(c0srf.LIZ, linearInterpolator);
        this.LLLIIIIL = new C0HU6(new C1342130l1v(322.27f), new C1342130l1v(32.31f));
        this.LLLIIIL = C1697810uHb.LJIIJJI(new C19746412Nq("alpha1", new C0HUY(0.0f, 1.0f)), new C19746412Nq("alpha", new C0HUY(1.0f, 0.0f)));
        this.LLLIIL = new C0HU6(new C1342130l1v(631.65f), new C1342130l1v(42.73f));
        this.LLLIILIL = C1697810uHb.LJIIJJI(new C19746412Nq("scaleX1", new C0HIW(0.25f, 1.0f)), new C19746412Nq("scaleY1", new C0HIX(0.25f, 1.0f)), new C19746412Nq("alpha1", new C0HUY(0.0f, 1.0f)));
        this.LLLIL = C1697810uHb.LJIIJJI(new C19746412Nq("scaleX", new C0HIW(1.0f, 0.25f)), new C19746412Nq("scaleY", new C0HIX(1.0f, 0.25f)), new C19746412Nq("alpha", new C0HUY(1.0f, 0.0f)));
    }

    public final int hp() {
        return ip().zQ2();
    }

    public final boolean op() {
        if ((!C0RHE.LJ() || ip().AQ2() <= 1) && (!C0RHE.LIZLLL() || ip().AQ2() <= 0)) {
            return false;
        }
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (AwemeExtKt.isAdTraffic(((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme())) {
            return false;
        }
        C724270Sb3 c724270Sb32 = this.LLJI;
        VideoItemParams videoItemParams = (VideoItemParams) (c724270Sb32 != null ? c724270Sb32.LL : null);
        return videoItemParams != null && videoItemParams.mPageType == 0;
    }

    public final void lp(boolean z) {
        if (this.LLLII != z && op()) {
            mp(z, this.LLLI);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0097  */
    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r7) {
        /*
            r6 = this;
            X.0SLX r7 = (X.C0SLX) r7
            r6.LLJJJJLIIL = r7
            if (r7 == 0) goto Lf
            X.0Syj r1 = new X.0Syj
            r0 = 3
            r1.<init>(r6, r0)
            r7.LIZLLL(r1)
        Lf:
            X.0SLX r0 = r6.LLJJJJLIIL
            r5 = 0
            if (r0 == 0) goto L99
            android.view.ViewParent r1 = r0.getParent()
        L18:
            boolean r0 = r1 instanceof android.view.View
            if (r0 == 0) goto L36
            android.view.View r1 = (android.view.View) r1
            if (r1 == 0) goto L36
            r0 = 2131378609(0x7f0a41b1, float:1.8377455E38)
            android.view.View r0 = r1.findViewById(r0)
            com.bytedance.tux.input.TuxTextView r0 = (com.bytedance.tux.input.TuxTextView) r0
            r6.LLJJL = r0
            r0 = 2131378610(0x7f0a41b2, float:1.8377457E38)
            android.view.View r0 = r1.findViewById(r0)
            X.12P4 r0 = (X.C12P4) r0
            r6.LLJJLIIIJLLLLLLLZ = r0
        L36:
            X.19EG r0 = X.C724240Sb0.LIZ(r6)
            boolean r0 = r0 instanceof X.InterfaceC1603190roz
            if (r0 == 0) goto L89
            X.19EG r1 = X.C724240Sb0.LIZ(r6)
            if (r1 == 0) goto L97
            r0 = 2131388947(0x7f0a6a13, float:1.8398423E38)
            android.view.View r0 = r1.findViewById(r0)
        L4b:
            com.bytedance.tux.input.TuxTextView r4 = r6.LLJJL
            if (r4 == 0) goto L7a
            r3 = 0
            if (r0 == 0) goto L87
            int r2 = r0.getHeight()
        L56:
            r0 = 12
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            int r0 = X.C814420VxA.LIZIZ(r0)
            int r2 = r2 + r0
            android.view.ViewGroup$LayoutParams r1 = r4.getLayoutParams()
            boolean r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L73
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            if (r1 == 0) goto L73
            int r3 = r1.topMargin
        L73:
            int r0 = java.lang.Math.max(r2, r3)
            X.C0H9H.LJI(r0, r4)
        L7a:
            X.0SLX r0 = r6.LLJJJJLIIL
            if (r0 == 0) goto L82
            androidx.viewpager.widget.PagerAdapter r5 = r0.getAdapter()
        L82:
            X.0SLq r5 = (X.C719880SLq) r5
            r6.LLJLL = r5
            return
        L87:
            r2 = 0
            goto L56
        L89:
            X.19EG r1 = X.C724240Sb0.LIZ(r6)
            if (r1 == 0) goto L97
            r0 = 2131373656(0x7f0a2e58, float:1.836741E38)
            android.view.View r0 = r1.findViewById(r0)
            goto L4b
        L97:
            r0 = r5
            goto L4b
        L99:
            r1 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ui.feed.photos.assem.PhotoModeLastImageHintAssem.onViewCreated(android.view.View):void");
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(VideoItemParams videoItemParams) {
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void J1(int i, Aweme aweme) {
        View view;
        TuxIconView tuxIconView;
        this.LLJLIL = false;
        TuxTextView tuxTextView = this.LLJJL;
        if (tuxTextView != null) {
            C786410Ut5.LLLLZLL(tuxTextView, 8);
        }
        C12P4 c12p4 = this.LLJJLIIIJLLLLLLLZ;
        if (c12p4 != null) {
            C786410Ut5.LLLLLLZ(c12p4, 8);
        }
        this.LLLFFI = null;
        this.LLLFZ = null;
        PhotosViewHolderV3 photosViewHolderV3Ep = ep();
        if (photosViewHolderV3Ep != null && (view = photosViewHolderV3Ep.LL) != null && (tuxIconView = (TuxIconView) view.findViewById(R.id.qcv)) != null) {
            C786410Ut5.x5(tuxIconView, 0.0f);
        }
        if (((Number) C0BKL.LIZ.getValue()).intValue() == 2) {
            LLLILZ = false;
        }
        this.LLLFF = false;
        C0SLX c0slx = this.LLJJJJLIIL;
        if (c0slx != null) {
            c0slx.LJJJIL();
        }
    }

    public final void mp(boolean z, C698300RaG c698300RaG) {
        if (this.LLL == null) {
            this.LLL = (InteractAreaCommonAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), InteractAreaCommonAbility.class, null);
        }
        InteractAreaCommonAbility interactAreaCommonAbility = this.LLL;
        if (interactAreaCommonAbility != null) {
            interactAreaCommonAbility.Xz2(EnumC706820Ro0.RIGHT_AREA, !z, c698300RaG, false, null);
        }
        this.LLLII = z;
    }
}
