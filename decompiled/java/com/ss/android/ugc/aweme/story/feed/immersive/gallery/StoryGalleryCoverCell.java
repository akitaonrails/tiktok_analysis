package com.ss.android.ugc.aweme.story.feed.immersive.gallery;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C08ZP;
import X.C09R3;
import X.C0PEM;
import X.C0S12;
import X.C1077100e8S;
import X.C1196320hEk;
import X.C1308910kAL;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C13LE;
import X.C19719912Dl;
import X.C2141608aE;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2296808zG;
import X.C23250099c;
import X.C287140BNg;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C438710HIf;
import X.C452080Ho6;
import X.C452501pT;
import X.C708880RrK;
import X.C710930Rud;
import X.C727310Sfx;
import X.C729220Sj2;
import X.C729240Sj4;
import X.C729510SjV;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1338240kve;
import X.EnumC696090RSd;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC665370Q7z;
import X.InterfaceC713360RyY;
import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.widget.RadiusLayout;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.zhiliaoapp.musically.R;
import irm.AkS83S0100000_11;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS434S0200000_33;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class StoryGalleryCoverCell extends PowerCell<C727310Sfx> implements InterfaceC713360RyY {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZLLLIL;
    public final C01GW LL = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(450));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS577S0100000_33(this, 3247));
    public final AssemVMLazy LLILLL;
    public RadiusLayout LLILZ;
    public SmartImageView LLILZIL;
    public TuxIconView LLILZLL;
    public final AssemVMLazy LLIZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(StoryGalleryCoverCell.class, "galleryListVM", "getGalleryListVM()Lcom/ss/android/ugc/aweme/story/feed/immersive/gallery/StoryGalleryListViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(StoryGalleryCoverCell.class, "viewerListVM", "getViewerListVM()Lcom/ss/android/ugc/aweme/story/feed/immersive/gallery/StoryViewerListViewModel;", 0);
        c09r3.getClass();
        LLIZLLLIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.fbp;
    }

    public StoryGalleryCoverCell() {
        AssemVMLazy assemVMLazy;
        AssemVMLazy assemVMLazy2;
        Object obj = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(StoryGalleryListViewModel.class);
        AwS577S0100000_33 awS577S0100000_33 = new AwS577S0100000_33(c19719912DlLIZ, 3246);
        AFwS279S0000000_33 aFwS279S0000000_33 = AFwS279S0000000_33.get$arr$(233);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 3233), awS577S0100000_33, AFwS224S0000000_33.get$arr$(452), new AwS577S0100000_33((C03K6) this, 3223), new AwS577S0100000_33((C03K6) this, 3234), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 3237), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 3240), null, new AwS577S0100000_33((C03K6) this, 3243));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS577S0100000_33 awS577S0100000_332 = new AwS577S0100000_33((C03K6) this, 3219);
            AwS577S0100000_33 awS577S0100000_333 = new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 3221);
            AwS577S0100000_33 awS577S0100000_334 = new AwS577S0100000_33(c19719912DlLIZ, 3224);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS434S0200000_33((InterfaceC451590HnJ) obj, awS577S0100000_332, 126));
            AwS577S0100000_33 awS577S0100000_335 = new AwS577S0100000_33(c01gwLIZIZ, 3229);
            AwS577S0100000_33 awS577S0100000_336 = new AwS577S0100000_33(c01gwLIZIZ, 3232);
            AwS577S0100000_33 awS577S0100000_337 = new AwS577S0100000_33(c01gwLIZIZ, 3235);
            AwS577S0100000_33 awS577S0100000_338 = new AwS577S0100000_33(c01gwLIZIZ, 3238);
            AwS577S0100000_33 awS577S0100000_339 = new AwS577S0100000_33(c01gwLIZIZ, 3241);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS577S0100000_334, awS577S0100000_33, new C452080Ho6(), awS577S0100000_335, awS577S0100000_336, awS577S0100000_333, aFwS279S0000000_33, awS577S0100000_337, awS577S0100000_338, awS577S0100000_339);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 3244), awS577S0100000_33, AFwS224S0000000_33.get$arr$(451), new AwS577S0100000_33((C03K6) this, 3249), new AwS577S0100000_33((C03K6) this, 3251), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 3253), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 3255), null, new AwS577S0100000_33((C03K6) this, 3257));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 3258), awS577S0100000_33, AFwS224S0000000_33.get$arr$(453), new AwS577S0100000_33((C03K6) this, 3260), new AwS577S0100000_33((C03K6) this, 3262), new AwS577S0100000_33((C03K6) this, 3265), aFwS279S0000000_33, null, null, new AwS577S0100000_33((C03K6) this, 3267));
        }
        this.LLILLL = assemVMLazy;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(StoryViewerListViewModel.class);
        AwS577S0100000_33 awS577S0100000_3310 = new AwS577S0100000_33(c19719912DlLIZ2, 3215);
        AFwS279S0000000_33 aFwS279S0000000_332 = AFwS279S0000000_33.get$arr$(232);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy2 = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ2, 3218), awS577S0100000_3310, AFwS224S0000000_33.get$arr$(449), new AwS577S0100000_33((C03K6) this, 3222), new AwS577S0100000_33((C03K6) this, 3225), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 3227), aFwS279S0000000_332, new AwS577S0100000_33((C03K6) this, 3230), null, new AwS577S0100000_33((C03K6) this, 3236));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS577S0100000_33 awS577S0100000_3311 = new AwS577S0100000_33((C03K6) this, 3239);
            AwS577S0100000_33 awS577S0100000_3312 = new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 3242);
            AwS577S0100000_33 awS577S0100000_3313 = new AwS577S0100000_33(c19719912DlLIZ2, 3245);
            C01GW c01gwLIZIZ2 = C452501pT.LIZIZ(new AwS434S0200000_33((InterfaceC451590HnJ) obj, awS577S0100000_3311, 127));
            AwS577S0100000_33 awS577S0100000_3314 = new AwS577S0100000_33(c01gwLIZIZ2, 3248);
            AwS577S0100000_33 awS577S0100000_3315 = new AwS577S0100000_33(c01gwLIZIZ2, 3250);
            AwS577S0100000_33 awS577S0100000_3316 = new AwS577S0100000_33(c01gwLIZIZ2, 3252);
            AwS577S0100000_33 awS577S0100000_3317 = new AwS577S0100000_33(c01gwLIZIZ2, 3254);
            AwS577S0100000_33 awS577S0100000_3318 = new AwS577S0100000_33(c01gwLIZIZ2, 3256);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = C737910Sx3.LIZ;
            assemVMLazy2 = new AssemVMLazy(awS577S0100000_3313, awS577S0100000_3310, new C452080Ho6(), awS577S0100000_3314, awS577S0100000_3315, awS577S0100000_3312, aFwS279S0000000_332, awS577S0100000_3316, awS577S0100000_3317, awS577S0100000_3318);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy2 = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ2, 3259), awS577S0100000_3310, AFwS224S0000000_33.get$arr$(454), new AwS577S0100000_33((C03K6) this, 3261), new AwS577S0100000_33((C03K6) this, 3263), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 3264), aFwS279S0000000_332, new AwS577S0100000_33((C03K6) this, 3266), null, new AwS577S0100000_33((C03K6) this, 3216));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Don't support this VMScope: ");
                sbLIZ2.append(obj);
                sbLIZ2.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
            }
            assemVMLazy2 = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ2, 3217), awS577S0100000_3310, AFwS224S0000000_33.get$arr$(448), new AwS577S0100000_33((C03K6) this, 3220), new AwS577S0100000_33((C03K6) this, 3226), new AwS577S0100000_33((C03K6) this, 3228), aFwS279S0000000_332, null, null, new AwS577S0100000_33((C03K6) this, 3231));
        }
        this.LLIZ = assemVMLazy2;
    }

    @Override // X.InterfaceC713360RyY
    public final ViewModelStoreOwner LLIIIILZ() {
        return (ViewModelStoreOwner) this.LLILLJJLI.getValue();
    }

    @Override // X.InterfaceC713360RyY
    public final InterfaceC665370Q7z k0() {
        return C1196320hEk.LIZ(this);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.LLILZ = (RadiusLayout) this.itemView.findViewById(R.id.spp);
        this.LLILZIL = (SmartImageView) this.itemView.findViewById(R.id.f5b);
        this.LLILZLL = (TuxIconView) this.itemView.findViewById(R.id.jwz);
        C786410Ut5.I7(new AkS83S0100000_11(this, 6), this.itemView);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl, List list) {
        int iIntValue;
        Context context;
        Integer numLIZJ;
        int iIntValue2;
        int iIntValue3;
        Aweme aweme;
        SmartImageView smartImageView;
        C727310Sfx c727310Sfx = (C727310Sfx) interfaceC1891350zJl;
        super.onBindItemView(c727310Sfx, list);
        Aweme aweme2 = c727310Sfx.LL;
        EnumC696090RSd enumC696090RSd = c727310Sfx.LLILLJJLI;
        Integer numValueOf = Integer.valueOf(R.attr.zg);
        UrlModel originCover = null;
        if (enumC696090RSd != null) {
            C727310Sfx item = getItem();
            if (item != null && (aweme = item.LL) != null) {
                if (((Number) C287140BNg.LIZ.getValue()).intValue() <= 1 && aweme.getIsTikTokStory()) {
                    C729220Sj2 c729220Sj2 = C729220Sj2.LL;
                    String scheduleId = AwemeBizExtKt.getScheduleId(aweme);
                    c729220Sj2.getClass();
                    C729240Sj4 c729240Sj4LJIIZILJ = C729220Sj2.LJIIZILJ();
                    if (scheduleId == null) {
                        c729240Sj4LJIIZILJ.getClass();
                    } else {
                        Bitmap bitmap = (Bitmap) ((ConcurrentHashMap) c729240Sj4LJIIZILJ.LL.LJ.getValue()).get(scheduleId);
                        if (bitmap != null) {
                            if (C2141608aE.LIZ() && (smartImageView = this.LLILZIL) != null) {
                                smartImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                            }
                            SmartImageView smartImageView2 = this.LLILZIL;
                            if (smartImageView2 != null) {
                                smartImageView2.setImageBitmap(bitmap);
                                if (Unit.LIZ == null) {
                                }
                            }
                        }
                    }
                    SmartImageView smartImageView3 = this.LLILZIL;
                    if (smartImageView3 != null) {
                        C384050F3z c384050F3z = new C384050F3z();
                        c384050F3z.LIZIZ = numValueOf;
                        smartImageView3.setImageDrawable(c384050F3z.LIZ(this.itemView.getContext()));
                    }
                } else {
                    C729220Sj2 c729220Sj22 = C729220Sj2.LL;
                    String strLJIILLIIL = C729220Sj2.LJIILLIIL(AwemeBizExtKt.getScheduleId(aweme));
                    if (strLJIILLIIL != null) {
                        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C08ZP(strLJIILLIIL, this, aweme, null), 3);
                    }
                }
            }
            TuxIconView tuxIconView = this.LLILZLL;
            if (tuxIconView != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView, 8);
            }
        } else if (C0S12.LIZIZ(aweme2)) {
            SmartImageView smartImageView4 = this.LLILZIL;
            if (smartImageView4 != null) {
                C384050F3z c384050F3z2 = new C384050F3z();
                c384050F3z2.LIZIZ = numValueOf;
                smartImageView4.setImageDrawable(c384050F3z2.LIZ(this.itemView.getContext()));
            }
            TuxIconView tuxIconView2 = this.LLILZLL;
            if (tuxIconView2 != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView2, 0);
            }
        } else if (!AwemeExtKt.shouldShowReviewStatus(aweme2) && !C708880RrK.LIZ(aweme2)) {
            if (!AwemeExtKt.isCommentPostInvisible(aweme2) && AwemeExtKt.isSharedStoryVisible(aweme2)) {
                TuxIconView tuxIconView3 = this.LLILZLL;
                if (tuxIconView3 != null) {
                    C786410Ut5.LLLLLLZZ(tuxIconView3, 8);
                }
                if (C729510SjV.LJIJI(aweme2)) {
                    originCover = C710930Rud.LJ(aweme2);
                } else {
                    Video video = aweme2.getVideo();
                    if (video != null) {
                        originCover = video.getOriginCover();
                    }
                }
                C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(originCover));
                c1331670kl3LJIIIIZZ.LJJ(this.LLILZIL);
                c1331670kl3LJIIIIZZ.LJJ = EnumC1338240kve.FIT_CENTER;
                C384050F3z c384050F3z3 = new C384050F3z();
                c384050F3z3.LIZIZ = numValueOf;
                c1331670kl3LJIIIIZZ.LJIL(c384050F3z3.LIZ(this.itemView.getContext()));
                c1331670kl3LJIIIIZZ.LJIIJ(new C1077100e8S(1));
            } else {
                SmartImageView smartImageView5 = this.LLILZIL;
                if (smartImageView5 != null) {
                    C419910GdJ c419910GdJ = new C419910GdJ();
                    c419910GdJ.LIZ = R.raw.icon_video_slash_fill;
                    c419910GdJ.LJ = Integer.valueOf(R.attr.zj);
                    c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
                    c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
                    smartImageView5.setImageDrawable(c419910GdJ.LIZ(this.itemView.getContext()));
                }
                SmartImageView smartImageView6 = this.LLILZIL;
                if (smartImageView6 != null) {
                    smartImageView6.setScaleType(ImageView.ScaleType.CENTER);
                }
                SmartImageView smartImageView7 = this.LLILZIL;
                if (smartImageView7 != null && (context = smartImageView7.getContext()) != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.zg, context)) != null) {
                    iIntValue = numLIZJ.intValue();
                } else {
                    iIntValue = 0;
                }
                SmartImageView smartImageView8 = this.LLILZIL;
                if (smartImageView8 != null) {
                    smartImageView8.setBackgroundColor(iIntValue);
                }
                TuxIconView tuxIconView4 = this.LLILZLL;
                if (tuxIconView4 != null) {
                    C786410Ut5.LLLLLLZZ(tuxIconView4, 8);
                }
            }
        } else {
            SmartImageView smartImageView9 = this.LLILZIL;
            if (smartImageView9 != null) {
                C384050F3z c384050F3z4 = new C384050F3z();
                c384050F3z4.LIZIZ = numValueOf;
                smartImageView9.setImageDrawable(c384050F3z4.LIZ(this.itemView.getContext()));
            }
            TuxIconView tuxIconView5 = this.LLILZLL;
            if (tuxIconView5 != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView5, 8);
            }
        }
        if (!AwemeExtKt.shouldShowReviewStatus(c727310Sfx.LL) && c727310Sfx.LLILLJJLI != EnumC696090RSd.FAILED) {
            RadiusLayout radiusLayout = this.LLILZ;
            if (radiusLayout != null) {
                Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.zj, this.itemView.getContext());
                if (numLIZJ2 != null) {
                    iIntValue3 = numLIZJ2.intValue();
                } else {
                    iIntValue3 = 0;
                }
                radiusLayout.LIZIZ(iIntValue3, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.5d))), 0, 0);
            }
        } else {
            RadiusLayout radiusLayout2 = this.LLILZ;
            if (radiusLayout2 != null) {
                Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.zs, this.itemView.getContext());
                if (numLIZJ3 != null) {
                    iIntValue2 = numLIZJ3.intValue();
                } else {
                    iIntValue2 = 0;
                }
                radiusLayout2.LIZIZ(iIntValue2, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), 0, 0);
            }
        }
        RadiusLayout radiusLayout3 = this.LLILZ;
        if (radiusLayout3 != null) {
            radiusLayout3.LIZJ(true);
        }
    }
}
