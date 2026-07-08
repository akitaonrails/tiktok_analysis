package com.ss.android.ugc.aweme.story.feed.guideuploadcard;

import X.AbstractC712600RxK;
import X.C01GW;
import X.C0H4W;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C13LP;
import X.C14KQ;
import X.C197039127h;
import X.C19MB;
import X.C19ME;
import X.C2097608Jq;
import X.C339190DRl;
import X.C438710HIf;
import X.C452501pT;
import X.C497820Jfg;
import X.C628500Oky;
import X.C630740Ooa;
import X.C712620RxM;
import X.C786410Ut5;
import X.EnumC452301pR;
import Y.ARunnableS9S0210000_6;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.widget.RadiusLayout;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.story.inbox.StoryInsertCard;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import irm.AkS56S0200000_11;
import irm.AkS83S0100000_11;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryGuideUploadCardLogicAssem extends BaseCellSlotComponent<StoryGuideUploadCardLogicAssem> {
    public StoryInsertCard LLJLLL;
    public C197039127h LLJZIJLIL;
    public TuxTextView LLL;
    public TuxTextView LLLF;
    public FrameLayout LLLFF;
    public ConstraintLayout LLLFFI;
    public int LLLFZ;
    public final Map<Integer, Float> LLLIIII;
    public int LLLIIIIL;
    public final C01GW LLLIIIL;
    public final C630740Ooa LLJLLIL = C628500Oky.LIZ(new AwS555S0100000_11(this, 684));
    public String LLJZ = "";
    public final C01GW LLLI = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(158));
    public final C01GW LLLII = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(159));

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fcf;
    }

    public StoryGuideUploadCardLogicAssem() {
        Float fValueOf = Float.valueOf(1.0f);
        this.LLLIIII = C2097608Jq.LJIIIIZZ(new Pair(0, fValueOf), new Pair(1, fValueOf), new Pair(3, Float.valueOf(0.9f)), new Pair(2, Float.valueOf(0.9f)), new Pair(4, Float.valueOf(0.9f)));
        this.LLLIIIIL = (int) C339190DRl.LIZ(64);
        this.LLLIIIL = C452501pT.LIZ(EnumC452301pR.NONE, AFwS198S0000000_11.get$arr$(157));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v74, types: [X.0RxJ, android.view.View] */
    /* JADX WARN: Type inference failed for: r0v75, types: [X.0RxJ, android.view.View] */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        boolean z;
        int iLIZJ;
        int i;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams2;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        ViewGroup.LayoutParams layoutParams3;
        ViewGroup.MarginLayoutParams marginLayoutParams3;
        ViewGroup.LayoutParams layoutParams4;
        ViewGroup.MarginLayoutParams marginLayoutParams4;
        float f;
        FrameLayout frameLayout;
        float f2;
        UrlModel urlModel;
        UrlModel urlModel2;
        float f3;
        UrlModel urlModel3;
        float f4;
        float fFloatValue;
        ViewGroup.LayoutParams layoutParams5;
        ViewGroup.MarginLayoutParams marginLayoutParams5;
        VideoItemParams videoItemParams2 = videoItemParams;
        String str = this.LLJZ;
        String aid = videoItemParams2.getAweme().getAid();
        String str2 = "";
        if (aid == null) {
            aid = "";
        }
        if (!Intrinsics.LJFF(str, aid)) {
            String aid2 = videoItemParams2.getAweme().getAid();
            if (aid2 == null) {
                aid2 = "";
            }
            this.LLJZ = aid2;
            StoryGuideUploadCardManager storyGuideUploadCardManager = StoryGuideUploadCardManager.LL;
            String aid3 = videoItemParams2.getAweme().getAid();
            if (aid3 != null) {
                str2 = aid3;
            }
            storyGuideUploadCardManager.getClass();
            this.LLJLLL = (StoryInsertCard) ((LinkedHashMap) StoryGuideUploadCardManager.LLILZLL.getValue()).get(str2);
            View viewLJJIJL = LJJIJL();
            this.LLJZIJLIL = (C197039127h) viewLJJIJL.findViewById(R.id.cwd);
            this.LLL = (TuxTextView) viewLJJIJL.findViewById(R.id.zzh);
            this.LLLF = (TuxTextView) viewLJJIJL.findViewById(R.id.tv_title);
            this.LLLFF = (FrameLayout) viewLJJIJL.findViewById(R.id.jbs);
            this.LLLFFI = (ConstraintLayout) viewLJJIJL.findViewById(R.id.dwc);
            C197039127h c197039127h = this.LLJZIJLIL;
            if (c197039127h != null) {
                c197039127h.LJJJJL(new AwS581S0100000_2(this, 668));
            }
            C197039127h c197039127h2 = this.LLJZIJLIL;
            if (c197039127h2 != null) {
                C786410Ut5.I7(new AkS83S0100000_11(this, 10), c197039127h2);
            }
            TuxTextView tuxTextView = this.LLL;
            if (tuxTextView != null) {
                C786410Ut5.I7(new AkS83S0100000_11(this, 11), tuxTextView);
            }
            int iLIZIZ = C497820Jfg.LIZIZ(viewLJJIJL.getContext());
            int iLIZ = C497820Jfg.LIZ(viewLJJIJL.getContext());
            if (iLIZIZ < iLIZ) {
                z = true;
            } else {
                z = false;
            }
            StoryInsertCard storyInsertCard = this.LLJLLL;
            if (storyInsertCard != null) {
                int iCardStyle = storyInsertCard.cardStyle();
                this.LLLFZ = iCardStyle;
                final UrlModel urlModel4 = null;
                if (z) {
                    Float f5 = this.LLLIIII.get(Integer.valueOf(iCardStyle));
                    if (f5 != null) {
                        fFloatValue = f5.floatValue();
                    } else {
                        fFloatValue = 1.0f;
                    }
                    FrameLayout frameLayout2 = this.LLLFF;
                    if (frameLayout2 != null) {
                        layoutParams5 = frameLayout2.getLayoutParams();
                    } else {
                        layoutParams5 = null;
                    }
                    if (layoutParams5 instanceof C19ME) {
                        marginLayoutParams5 = (ViewGroup.MarginLayoutParams) layoutParams5;
                        if (marginLayoutParams5 != null) {
                            marginLayoutParams5.width = iLIZIZ;
                            marginLayoutParams5.height = (int) (iLIZIZ * fFloatValue);
                        }
                    } else {
                        marginLayoutParams5 = null;
                    }
                    FrameLayout frameLayout3 = this.LLLFF;
                    if (frameLayout3 != null) {
                        C786410Ut5.a6(frameLayout3, marginLayoutParams5);
                    }
                } else {
                    Context context = getContext();
                    if (context != null) {
                        iLIZJ = C497820Jfg.LIZJ(context);
                    } else {
                        iLIZJ = 0;
                    }
                    int iLIZLLL = (iLIZ - iLIZJ) - C14KQ.LIZLLL(getContext());
                    int i2 = this.LLLFZ;
                    if (i2 == 4) {
                        i = 24;
                    } else {
                        i = 64;
                    }
                    this.LLLIIIIL = (int) C339190DRl.LIZ(i);
                    ConstraintLayout constraintLayout = this.LLLFFI;
                    if (constraintLayout != null) {
                        layoutParams = constraintLayout.getLayoutParams();
                    } else {
                        layoutParams = null;
                    }
                    if (layoutParams instanceof FrameLayout.LayoutParams) {
                        marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        if (marginLayoutParams != null) {
                            marginLayoutParams.setMargins(0, 0, 0, this.LLLIIIIL);
                        }
                    } else {
                        marginLayoutParams = null;
                    }
                    ConstraintLayout constraintLayout2 = this.LLLFFI;
                    if (constraintLayout2 != null) {
                        C786410Ut5.m6(constraintLayout2, marginLayoutParams);
                    }
                    ConstraintLayout constraintLayout3 = this.LLLFFI;
                    if (constraintLayout3 != null) {
                        C19MB c19mb = new C19MB();
                        c19mb.LJII(this.LLLFFI);
                        c19mb.LJJIIJZLJL(constraintLayout3.getId(), 4, this.LLLIIIIL);
                        c19mb.LIZIZ(this.LLLFFI);
                    }
                    int i3 = (int) (iLIZLLL * 0.7863f);
                    if (i2 != 4) {
                        iLIZ = iLIZLLL;
                    }
                    int i4 = (int) (iLIZ * 0.6068f);
                    FrameLayout frameLayout4 = this.LLLFF;
                    if (frameLayout4 != null) {
                        layoutParams2 = frameLayout4.getLayoutParams();
                    } else {
                        layoutParams2 = null;
                    }
                    if (layoutParams2 instanceof C19ME) {
                        marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                        if (marginLayoutParams2 != null) {
                            marginLayoutParams2.width = i3;
                            marginLayoutParams2.height = i4;
                        }
                    } else {
                        marginLayoutParams2 = null;
                    }
                    FrameLayout frameLayout5 = this.LLLFF;
                    if (frameLayout5 != null) {
                        C786410Ut5.a6(frameLayout5, marginLayoutParams2);
                    }
                    C197039127h c197039127h3 = this.LLJZIJLIL;
                    if (c197039127h3 != null) {
                        layoutParams3 = c197039127h3.getLayoutParams();
                    } else {
                        layoutParams3 = null;
                    }
                    if (layoutParams3 instanceof C19ME) {
                        marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                    } else {
                        marginLayoutParams3 = null;
                    }
                    if (marginLayoutParams3 != null) {
                        marginLayoutParams3.width = (int) (i3 * 0.5f);
                    }
                    C197039127h c197039127h4 = this.LLJZIJLIL;
                    if (c197039127h4 != null) {
                        C786410Ut5.J6(c197039127h4, marginLayoutParams3);
                    }
                    TuxTextView tuxTextView2 = this.LLLF;
                    if (tuxTextView2 != null) {
                        layoutParams4 = tuxTextView2.getLayoutParams();
                    } else {
                        layoutParams4 = null;
                    }
                    if (layoutParams4 instanceof C19ME) {
                        marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams4;
                        if (marginLayoutParams4 != null) {
                            marginLayoutParams4.width = (int) (i3 * 0.5f);
                        }
                    } else {
                        marginLayoutParams4 = null;
                    }
                    TuxTextView tuxTextView3 = this.LLLF;
                    if (tuxTextView3 != null) {
                        C786410Ut5.R6(tuxTextView3, marginLayoutParams4);
                    }
                }
                ConstraintLayout constraintLayout4 = this.LLLFFI;
                if (constraintLayout4 != null) {
                    HandlerHook.viewPost(constraintLayout4, new ARunnableS9S0210000_6(constraintLayout4, this, z, 4));
                }
                final Context context2 = viewLJJIJL.getContext();
                int iCardStyle2 = storyInsertCard.cardStyle();
                if (iCardStyle2 != 1) {
                    final int i5 = 2;
                    if (iCardStyle2 != 2) {
                        final int i6 = 3;
                        if (iCardStyle2 != 3) {
                            if (iCardStyle2 == 4 && (frameLayout = this.LLLFF) != null) {
                                C712620RxM c712620RxM = new C712620RxM(context2);
                                int verticalHeight = (int) (c712620RxM.getVerticalHeight() * 0.7863f);
                                if (c712620RxM.getScreenWidth() < c712620RxM.getScreenHeight()) {
                                    verticalHeight = c712620RxM.getScreenWidth();
                                }
                                float f6 = verticalHeight * 0.353f;
                                float f7 = 0.071428575f * f6;
                                float f8 = f6 * 0.04852f;
                                if (C0H4W.LIZ()) {
                                    f8 = -f8;
                                }
                                AbstractC712600RxK.i0(c712620RxM, f8);
                                c712620RxM.findViewById(R.id.skn);
                                c712620RxM.LLILLL = (ConstraintLayout) c712620RxM.findViewById(R.id.je_);
                                c712620RxM.LLILZ = (SmartImageView) c712620RxM.findViewById(R.id.lds);
                                c712620RxM.LLILZIL = (SmartImageView) c712620RxM.findViewById(R.id.ldt);
                                c712620RxM.LLILZLL = (SmartImageView) c712620RxM.findViewById(R.id.lde);
                                ConstraintLayout constraintLayout5 = c712620RxM.LLILLL;
                                float f9 = 8.0f;
                                if (constraintLayout5 != null) {
                                    if (C0H4W.LIZ()) {
                                        f4 = 8.0f;
                                    } else {
                                        f4 = -8.0f;
                                    }
                                    AbstractC712600RxK.h0(constraintLayout5, f4);
                                    float f10 = (-f7) * 2;
                                    AbstractC712600RxK.j0(constraintLayout5, f10);
                                    if (C0H4W.LIZ()) {
                                        f10 = -f10;
                                    }
                                    AbstractC712600RxK.i0(constraintLayout5, f10);
                                    C786410Ut5.I7(new AkS56S0200000_11(c712620RxM, storyInsertCard, 8), constraintLayout5);
                                }
                                SmartImageView smartImageView = c712620RxM.LLILZ;
                                if (smartImageView != null) {
                                    if (C0H4W.LIZ()) {
                                        f3 = 8.0f;
                                    } else {
                                        f3 = -8.0f;
                                    }
                                    AbstractC712600RxK.h0(smartImageView, f3);
                                    AbstractC712600RxK.j0(smartImageView, -f7);
                                    List<UrlModel> list = storyInsertCard.coverUrls;
                                    if (list != null && (urlModel3 = (UrlModel) C13LP.LJJJLL(list)) != null) {
                                        C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(urlModel3));
                                        c1331670kl3LJIIIIZZ.LJJIIZ(R.drawable.d_g);
                                        c1331670kl3LJIIIIZZ.LJJI = c712620RxM.e0();
                                        c1331670kl3LJIIIIZZ.LJJ(smartImageView);
                                        c1331670kl3LJIIIIZZ.LJIIJ(c712620RxM.getDisplayListener());
                                    }
                                }
                                SmartImageView smartImageView2 = c712620RxM.LLILZIL;
                                if (smartImageView2 != null) {
                                    if (C0H4W.LIZ()) {
                                        f9 = -8.0f;
                                    }
                                    AbstractC712600RxK.h0(smartImageView2, f9);
                                    float f11 = -f7;
                                    if (C0H4W.LIZ()) {
                                        f11 = -f11;
                                    }
                                    AbstractC712600RxK.i0(smartImageView2, f11);
                                    List<UrlModel> list2 = storyInsertCard.coverUrls;
                                    if (list2 != null && (urlModel2 = (UrlModel) C13LP.LJJJLZIJ(1, list2)) != null) {
                                        C1331670kl3 c1331670kl3LJIIIIZZ2 = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(urlModel2));
                                        c1331670kl3LJIIIIZZ2.LJJIIZ(R.drawable.d_g);
                                        c1331670kl3LJIIIIZZ2.LJJI = c712620RxM.e0();
                                        c1331670kl3LJIIIIZZ2.LJJ(smartImageView2);
                                        c1331670kl3LJIIIIZZ2.LJIIJ(c712620RxM.getDisplayListener());
                                    }
                                }
                                SmartImageView smartImageView3 = c712620RxM.LLILZLL;
                                if (smartImageView3 != null) {
                                    if (C0H4W.LIZ()) {
                                        f2 = -16.0f;
                                    } else {
                                        f2 = 16.0f;
                                    }
                                    AbstractC712600RxK.h0(smartImageView3, f2);
                                    AbstractC712600RxK.j0(smartImageView3, (-f7) * 2);
                                    List<UrlModel> list3 = storyInsertCard.coverUrls;
                                    if (list3 != null && (urlModel = (UrlModel) C13LP.LJJJLZIJ(2, list3)) != null) {
                                        C1331670kl3 c1331670kl3LJIIIIZZ3 = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(urlModel));
                                        c1331670kl3LJIIIIZZ3.LJJIIZ(R.drawable.d_g);
                                        c1331670kl3LJIIIIZZ3.LJJI = c712620RxM.e0();
                                        c1331670kl3LJIIIIZZ3.LJJ(smartImageView3);
                                        c1331670kl3LJIIIIZZ3.LJIIJ(c712620RxM.getDisplayListener());
                                    }
                                }
                                frameLayout.addView(c712620RxM);
                                return;
                            }
                            return;
                        }
                        FrameLayout frameLayout6 = this.LLLFF;
                        if (frameLayout6 == 0) {
                            return;
                        }
                        ?? r0 = new AbstractC712600RxK(context2, i6, urlModel4) { // from class: X.0RxJ
                            public final UrlModel LLILLL;
                            public ConstraintLayout LLILZ;
                            public RadiusLayout LLILZIL;
                            public ConstraintLayout LLILZLL;
                            public SmartImageView LLIZ;

                            public final void l0(StoryInsertCard storyInsertCard2) {
                                int iIntValue;
                                float f12;
                                float f13;
                                int verticalHeight2 = (int) (getVerticalHeight() * 0.7863f);
                                if (getScreenWidth() < getScreenHeight()) {
                                    verticalHeight2 = getScreenWidth();
                                }
                                float f14 = verticalHeight2 * 0.435f * 0.1628f;
                                this.LLILZ = (ConstraintLayout) findViewById(R.id.je9);
                                this.LLILZLL = (ConstraintLayout) findViewById(R.id.vbu);
                                this.LLILZIL = (RadiusLayout) findViewById(R.id.bjv);
                                this.LLIZ = (SmartImageView) findViewById(R.id.ld7);
                                ConstraintLayout constraintLayout6 = this.LLILZ;
                                float f15 = -8.0f;
                                if (constraintLayout6 != null) {
                                    if (C0H4W.LIZ()) {
                                        f12 = -8.0f;
                                    } else {
                                        f12 = 8.0f;
                                    }
                                    AbstractC712600RxK.h0(constraintLayout6, f12);
                                    if (C0H4W.LIZ()) {
                                        f13 = f14;
                                    } else {
                                        f13 = -f14;
                                    }
                                    AbstractC712600RxK.i0(constraintLayout6, f13);
                                    C786410Ut5.I7(new AkS56S0200000_11(this, storyInsertCard2, 9), constraintLayout6);
                                }
                                ConstraintLayout constraintLayout7 = this.LLILZLL;
                                if (constraintLayout7 != null) {
                                    if (C0H4W.LIZ()) {
                                        f14 = -f14;
                                    }
                                    AbstractC712600RxK.i0(constraintLayout7, f14 / 2);
                                }
                                RadiusLayout radiusLayout = this.LLILZIL;
                                if (radiusLayout != null) {
                                    if (C0H4W.LIZ()) {
                                        f15 = 8.0f;
                                    }
                                    AbstractC712600RxK.h0(radiusLayout, f15);
                                    Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zi, getContext());
                                    if (numLIZJ != null) {
                                        iIntValue = numLIZJ.intValue();
                                    } else {
                                        iIntValue = 0;
                                    }
                                    radiusLayout.LIZIZ(iIntValue, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)), 0, 0);
                                }
                                final SmartImageView smartImageView4 = this.LLIZ;
                                if (smartImageView4 != null) {
                                    UrlModel urlModel5 = this.LLILLL;
                                    if (urlModel5 == null) {
                                        C1331670kl3 c1331670kl3LJIIIIZZ4 = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getAvatarLarger()));
                                        c1331670kl3LJIIIIZZ4.LJJIIZ(R.drawable.d_g);
                                        c1331670kl3LJIIIIZZ4.LJJI = e0();
                                        c1331670kl3LJIIIIZZ4.LJJII(new InterfaceC1331910klR() { // from class: X.0RxL
                                            @Override // X.InterfaceC1331910klR
                                            public final void onCanceled() {
                                            }

                                            @Override // X.InterfaceC1331910klR
                                            public final void onFailed(Throwable th) {
                                            }

                                            @Override // X.InterfaceC1331910klR
                                            public final void onProgress(float f16) {
                                            }

                                            @Override // X.InterfaceC1331910klR
                                            public final void LIZ(Bitmap bitmap) {
                                                if (bitmap == null) {
                                                    return;
                                                }
                                                getClass();
                                                int width = bitmap.getWidth();
                                                int height = bitmap.getHeight();
                                                int i7 = (int) (0.1f * height);
                                                int i8 = (int) (0.2f * width);
                                                smartImageView4.setImageBitmap(Bitmap.createBitmap(bitmap, i8, i7, width - (i8 + i8), height - (i7 + i7)));
                                            }
                                        });
                                        return;
                                    }
                                    C1331670kl3 c1331670kl3LJIIIIZZ5 = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(urlModel5));
                                    c1331670kl3LJIIIIZZ5.LJJIIZ(R.drawable.d_g);
                                    c1331670kl3LJIIIIZZ5.LJJI = e0();
                                    c1331670kl3LJIIIIZZ5.LJJ(smartImageView4);
                                    c1331670kl3LJIIIIZZ5.LJIIJ(getDisplayListener());
                                }
                            }

                            {
                                this.LLILLL = urlModel4;
                            }
                        };
                        r0.l0(storyInsertCard);
                        frameLayout6.addView(r0);
                        return;
                    }
                    final UrlModel urlModel5 = (UrlModel) C13LP.LJJLIIIJL(storyInsertCard.coverUrls);
                    FrameLayout frameLayout7 = this.LLLFF;
                    if (frameLayout7 == 0) {
                        return;
                    }
                    ?? r02 = new AbstractC712600RxK(context2, i5, urlModel5) { // from class: X.0RxJ
                        public final UrlModel LLILLL;
                        public ConstraintLayout LLILZ;
                        public RadiusLayout LLILZIL;
                        public ConstraintLayout LLILZLL;
                        public SmartImageView LLIZ;

                        public final void l0(StoryInsertCard storyInsertCard2) {
                            int iIntValue;
                            float f12;
                            float f13;
                            int verticalHeight2 = (int) (getVerticalHeight() * 0.7863f);
                            if (getScreenWidth() < getScreenHeight()) {
                                verticalHeight2 = getScreenWidth();
                            }
                            float f14 = verticalHeight2 * 0.435f * 0.1628f;
                            this.LLILZ = (ConstraintLayout) findViewById(R.id.je9);
                            this.LLILZLL = (ConstraintLayout) findViewById(R.id.vbu);
                            this.LLILZIL = (RadiusLayout) findViewById(R.id.bjv);
                            this.LLIZ = (SmartImageView) findViewById(R.id.ld7);
                            ConstraintLayout constraintLayout6 = this.LLILZ;
                            float f15 = -8.0f;
                            if (constraintLayout6 != null) {
                                if (C0H4W.LIZ()) {
                                    f12 = -8.0f;
                                } else {
                                    f12 = 8.0f;
                                }
                                AbstractC712600RxK.h0(constraintLayout6, f12);
                                if (C0H4W.LIZ()) {
                                    f13 = f14;
                                } else {
                                    f13 = -f14;
                                }
                                AbstractC712600RxK.i0(constraintLayout6, f13);
                                C786410Ut5.I7(new AkS56S0200000_11(this, storyInsertCard2, 9), constraintLayout6);
                            }
                            ConstraintLayout constraintLayout7 = this.LLILZLL;
                            if (constraintLayout7 != null) {
                                if (C0H4W.LIZ()) {
                                    f14 = -f14;
                                }
                                AbstractC712600RxK.i0(constraintLayout7, f14 / 2);
                            }
                            RadiusLayout radiusLayout = this.LLILZIL;
                            if (radiusLayout != null) {
                                if (C0H4W.LIZ()) {
                                    f15 = 8.0f;
                                }
                                AbstractC712600RxK.h0(radiusLayout, f15);
                                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zi, getContext());
                                if (numLIZJ != null) {
                                    iIntValue = numLIZJ.intValue();
                                } else {
                                    iIntValue = 0;
                                }
                                radiusLayout.LIZIZ(iIntValue, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)), 0, 0);
                            }
                            final SmartImageView smartImageView4 = this.LLIZ;
                            if (smartImageView4 != null) {
                                UrlModel urlModel52 = this.LLILLL;
                                if (urlModel52 == null) {
                                    C1331670kl3 c1331670kl3LJIIIIZZ4 = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getAvatarLarger()));
                                    c1331670kl3LJIIIIZZ4.LJJIIZ(R.drawable.d_g);
                                    c1331670kl3LJIIIIZZ4.LJJI = e0();
                                    c1331670kl3LJIIIIZZ4.LJJII(new InterfaceC1331910klR() { // from class: X.0RxL
                                        @Override // X.InterfaceC1331910klR
                                        public final void onCanceled() {
                                        }

                                        @Override // X.InterfaceC1331910klR
                                        public final void onFailed(Throwable th) {
                                        }

                                        @Override // X.InterfaceC1331910klR
                                        public final void onProgress(float f16) {
                                        }

                                        @Override // X.InterfaceC1331910klR
                                        public final void LIZ(Bitmap bitmap) {
                                            if (bitmap == null) {
                                                return;
                                            }
                                            getClass();
                                            int width = bitmap.getWidth();
                                            int height = bitmap.getHeight();
                                            int i7 = (int) (0.1f * height);
                                            int i8 = (int) (0.2f * width);
                                            smartImageView4.setImageBitmap(Bitmap.createBitmap(bitmap, i8, i7, width - (i8 + i8), height - (i7 + i7)));
                                        }
                                    });
                                    return;
                                }
                                C1331670kl3 c1331670kl3LJIIIIZZ5 = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(urlModel52));
                                c1331670kl3LJIIIIZZ5.LJJIIZ(R.drawable.d_g);
                                c1331670kl3LJIIIIZZ5.LJJI = e0();
                                c1331670kl3LJIIIIZZ5.LJJ(smartImageView4);
                                c1331670kl3LJIIIIZZ5.LJIIJ(getDisplayListener());
                            }
                        }

                        {
                            this.LLILLL = urlModel5;
                        }
                    };
                    r02.l0(storyInsertCard);
                    frameLayout7.addView(r02);
                    return;
                }
                FrameLayout frameLayout8 = this.LLLFF;
                if (frameLayout8 == null) {
                    return;
                }
                AbstractC712600RxK abstractC712600RxK = new AbstractC712600RxK(context2) { // from class: X.0RxN
                };
                View viewFindViewById = abstractC712600RxK.findViewById(R.id.je9);
                if (viewFindViewById != null) {
                    if (C0H4W.LIZ()) {
                        f = -6.0f;
                    } else {
                        f = 6.0f;
                    }
                    AbstractC712600RxK.h0(viewFindViewById, f);
                    C786410Ut5.I7(new AkS56S0200000_11(abstractC712600RxK, storyInsertCard, 7), viewFindViewById);
                }
                frameLayout8.addView(abstractC712600RxK);
            }
        }
    }
}
