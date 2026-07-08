package com.ss.android.ugc.aweme.story.feed.common.sub.reveal;

import X.C01GW;
import X.C03IT;
import X.C0RF0;
import X.C1322090kVb;
import X.C1331070kk5;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1331730kl9;
import X.C1331750klB;
import X.C1389890mGx;
import X.C13LE;
import X.C13LP;
import X.C1517550par;
import X.C1558520qew;
import X.C1618440sDa;
import X.C19EG;
import X.C1C1T;
import X.C2188811AlT;
import X.C2203191BKr;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C428600GrK;
import X.C437040HBu;
import X.C442540HWy;
import X.C452501pT;
import X.C628500Oky;
import X.C630740Ooa;
import X.C706480RnS;
import X.C710930Rud;
import X.C724240Sb0;
import X.C724270Sb3;
import X.C729510SjV;
import X.C729980SkG;
import X.C736680Sv4;
import X.C736820SvI;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1334360kpO;
import X.InterfaceC427850Gq7;
import X.InterfaceC665370Q7z;
import X.InterfaceC706770Rnv;
import Y.ARunnableS111S0100000_11;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import androidx.fragment.app.Fragment;
import com.bytedance.als.extensions.LifecycleOwnerExtensionsKt;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.story.feed.common.collection.ability.StoryPlayerControlAbility;
import com.ss.android.ugc.aweme.story.feed.common.sub.photo.base.StoryBasePhotoSlotComponent;
import com.ss.android.ugc.aweme.story.feed.common.sub.photo.component.StoryPhotoAbility;
import com.ss.android.ugc.aweme.story.feed.common.sub.photo.component.StoryStickerInteractAbility;
import com.ss.android.ugc.aweme.story.reveal.IStoryRevealService;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AFwS294S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryRevealPhotoComponent extends StoryBasePhotoSlotComponent<StoryRevealPhotoComponent> implements InterfaceC427850Gq7, StoryRevealPhotoAbility {
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 640));
    public final C01GW LLJLLL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 642));
    public final C630740Ooa LLJZ = C628500Oky.LIZ(new AwS555S0100000_11(this, 639));
    public final C01GW LLJZIJLIL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), AFwS243S0000000_11.get$arr$(347));
    public final C01GW LLL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(150));
    public final C630740Ooa LLLF = C628500Oky.LIZ(new AwS555S0100000_11(this, 644));
    public final C630740Ooa LLLFF = C628500Oky.LIZ(new AwS555S0100000_11(this, 643));
    public boolean LLLFFI = true;
    public boolean LLLFZ;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fd1;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Co() {
        C706480RnS c706480RnS = C706480RnS.LIZ;
        AwS555S0100000_11 awS555S0100000_11 = new AwS555S0100000_11(this, 641);
        c706480RnS.getClass();
        C706480RnS.LJII(this, "story_layout_photo_view", true, awS555S0100000_11);
    }

    public final StoryPhotoAbility Ep() {
        return (StoryPhotoAbility) this.LLJLLL.getValue();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) this.LLJZ.getValue();
        if (interfaceC665370Q7z != null) {
            C1558520qew.LJIIJJI(interfaceC665370Q7z, StoryRevealPhotoAbility.class, null);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.AbstractC738140SxQ
    public final void onParentSet() {
        super.onParentSet();
        InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) this.LLJZ.getValue();
        if (interfaceC665370Q7z != null) {
            C1558520qew.LJII(interfaceC665370Q7z, this, StoryRevealPhotoAbility.class, null, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.sub.reveal.StoryRevealPhotoAbility
    public final boolean ZH1() {
        return this.LLLFFI;
    }

    public final void Fp(boolean z) {
        float f;
        View contentView = getContentView();
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        C786410Ut5.T4(contentView, f);
        if (z) {
            StoryStickerInteractAbility storyStickerInteractAbility = (StoryStickerInteractAbility) this.LLLF.getValue();
            if (storyStickerInteractAbility != null) {
                storyStickerInteractAbility.zA0();
                return;
            }
            return;
        }
        StoryStickerInteractAbility storyStickerInteractAbility2 = (StoryStickerInteractAbility) this.LLLF.getValue();
        if (storyStickerInteractAbility2 == null) {
            return;
        }
        storyStickerInteractAbility2.xv0();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC691660RBc
    public final void LLLI(int i) {
        Object obj;
        Object obj2;
        boolean z;
        Boolean boolValueOf;
        Object obj3;
        View imageView;
        C1517550par c1517550par;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onHolderResume, mode: ");
        sbLIZ.append(i);
        C2188811AlT.LIZIZ(sbLIZ);
        C724270Sb3 c724270Sb3 = this.LLJI;
        Object obj4 = null;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        if (!C729980SkG.LJIIIIZZ(((VideoItemParams) obj).getAweme())) {
            C724270Sb3 c724270Sb32 = this.LLJI;
            if (c724270Sb32 != null) {
                obj2 = c724270Sb32.LL;
            } else {
                obj2 = null;
            }
            C1C1T c1c1t = C2203191BKr.LIZ(((VideoItemParams) obj2).getAweme()).socialBlob;
            if (c1c1t != null && (c1517550par = c1c1t.reveal_story_blob) != null && Intrinsics.LJFF(c1517550par.is_unlocked, Boolean.TRUE)) {
                return;
            }
            IStoryRevealService iStoryRevealService = (IStoryRevealService) this.LLL.getValue();
            if (iStoryRevealService != null && iStoryRevealService.LJI()) {
                z = true;
            } else {
                z = false;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("checkUnlockStatusTransition, ");
            IStoryRevealService iStoryRevealService2 = (IStoryRevealService) this.LLL.getValue();
            if (iStoryRevealService2 != null) {
                boolValueOf = Boolean.valueOf(iStoryRevealService2.LJ());
            } else {
                boolValueOf = null;
            }
            sbLIZ2.append(boolValueOf);
            sbLIZ2.append(' ');
            sbLIZ2.append(z);
            C2188811AlT.LIZIZ(sbLIZ2);
            if (!z) {
                return;
            }
            C724270Sb3 c724270Sb33 = this.LLJI;
            if (c724270Sb33 != null) {
                obj3 = c724270Sb33.LL;
            } else {
                obj3 = null;
            }
            String aid = ((VideoItemParams) obj3).getAweme().getAid();
            if (aid != null) {
                IStoryRevealService iStoryRevealService3 = (IStoryRevealService) this.LLL.getValue();
                if (iStoryRevealService3 != null) {
                    C724270Sb3 c724270Sb34 = this.LLJI;
                    if (c724270Sb34 != null) {
                        obj4 = c724270Sb34.LL;
                    }
                    iStoryRevealService3.LJIIZILJ(aid, AwemeExtKt.getAuthorUid(((VideoItemParams) obj4).getAweme()), true);
                } else {
                    InterfaceC706770Rnv interfaceC706770RnvLJJIIJ = C1618440sDa.LIZIZ.LJJIIJ();
                    C724270Sb3 c724270Sb35 = this.LLJI;
                    if (c724270Sb35 != null) {
                        obj4 = c724270Sb35.LL;
                    }
                    interfaceC706770RnvLJJIIJ.LIZIZ(Boolean.TRUE, aid, AwemeExtKt.getAuthorUid(((VideoItemParams) obj4).getAweme()));
                }
                IStoryRevealService iStoryRevealService4 = (IStoryRevealService) this.LLL.getValue();
                if (iStoryRevealService4 != null) {
                    iStoryRevealService4.LJIIL(aid, true);
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("reportCurrentStoryAsUnlocked: aid=");
                sbLIZ3.append(aid);
                C2188811AlT.LIZIZ(sbLIZ3);
            }
            C19EG c19egLIZ = C724240Sb0.LIZ(this);
            if (c19egLIZ != null) {
                C1389890mGx c1389890mGx = new C1389890mGx(c19egLIZ);
                c1389890mGx.LJIIIZ(2131849105);
                c1389890mGx.LJFF(R.raw.icon_tick_fill);
                c1389890mGx.LJII(R.attr.a1u);
                c1389890mGx.LJIIJJI();
            }
            StoryPhotoAbility storyPhotoAbilityEp = Ep();
            if (storyPhotoAbilityEp != null && (imageView = storyPhotoAbilityEp.getImageView()) != null) {
                C786410Ut5.LJLLLLLL(0, imageView);
            }
            getContentView().animate().alpha(0.0f).setDuration(400L).setInterpolator(new LinearInterpolator()).withEndAction(new ARunnableS111S0100000_11(this, 114)).start();
            StoryPlayerControlAbility storyPlayerControlAbility = (StoryPlayerControlAbility) this.LLLFF.getValue();
            if (storyPlayerControlAbility == null) {
                return;
            }
            storyPlayerControlAbility.JL2();
        }
    }

    @Override // X.InterfaceC427850Gq7
    public final void e1(Uri uri) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onRelease, uri: ");
        sbLIZ.append(uri);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        ((View) this.LLJLLIL.getValue()).setBackground(null);
        C1331070kk5 c1331070kk5 = (C1331070kk5) ((C1322090kVb) this.LLJLLIL.getValue()).getHierarchy();
        if (c1331070kk5 != null) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_color_tiktok_logo_light;
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(100));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(100));
            c1331070kk5.LJIJ(c419910GdJ.LIZ(view.getContext()), 5);
        }
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJZIJLIL.getValue(), new C2217381BqS() { // from class: X.0Rr3
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILLL;
            }
        }, C736820SvI.LIZLLL(), AFwS294S0000000_11.get$arr$(110), 4);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void tp(VideoItemParams videoItemParams) {
        View imageView;
        View imageView2;
        String str;
        View imageView3;
        View imageView4;
        VideoItemParams videoItemParams2 = videoItemParams;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onBind, item: ");
        sbLIZ.append(videoItemParams2.getAweme().getAid());
        sbLIZ.append(", isRevealUnlocked: ");
        sbLIZ.append(C729510SjV.LJIJJ(videoItemParams2.getAweme()));
        C2188811AlT.LIZIZ(sbLIZ);
        this.LLLFZ = false;
        if (C729510SjV.LJIJI(videoItemParams2.getAweme())) {
            boolean zLJIIIIZZ = C729980SkG.LJIIIIZZ(videoItemParams2.getAweme());
            if (zLJIIIIZZ) {
                this.LLLFFI = true;
                getContentView().animate().cancel();
                C786410Ut5.T4(getContentView(), 0.0f);
                C786410Ut5.LJLLLLLL(0, getContentView());
                StoryPhotoAbility storyPhotoAbilityEp = Ep();
                if (storyPhotoAbilityEp != null && (imageView4 = storyPhotoAbilityEp.getImageView()) != null) {
                    C786410Ut5.LJLLLLLL(0, imageView4);
                }
                Fp(false);
            } else if (C729510SjV.LJIJJ(videoItemParams2.getAweme())) {
                getContentView().animate().cancel();
                C786410Ut5.T4(getContentView(), 0.0f);
                StoryPhotoAbility storyPhotoAbilityEp2 = Ep();
                if (storyPhotoAbilityEp2 != null && (imageView2 = storyPhotoAbilityEp2.getImageView()) != null) {
                    C786410Ut5.LJLLLLLL(0, imageView2);
                }
                Fp(false);
                return;
            }
            UrlModel urlModelLIZLLL = C710930Rud.LIZLLL(videoItemParams2.getAweme());
            if (urlModelLIZLLL != null) {
                if (!zLJIIIIZZ) {
                    C786410Ut5.T4(getContentView(), 1.0f);
                    StoryPhotoAbility storyPhotoAbilityEp3 = Ep();
                    if (storyPhotoAbilityEp3 != null && (imageView3 = storyPhotoAbilityEp3.getImageView()) != null) {
                        C786410Ut5.LJLLLLLL(4, imageView3);
                    }
                    LifecycleOwnerExtensionsKt.LIZ(this, new ARunnableS111S0100000_11(this, 115));
                }
                C442540HWy c442540HWy = C442540HWy.LIZ;
                List<String> urlList = urlModelLIZLLL.getUrlList();
                if (urlList == null || (str = (String) C13LP.LJJJLL(urlList)) == null) {
                    str = "";
                }
                c442540HWy.getClass();
                C442540HWy.LJ(str);
                C1331670kl3 c1331670kl3LJIIJ = C1331660kl2.LJIIJ(new C03IT(urlModelLIZLLL.getUrlList()));
                c1331670kl3LJIIJ.LJJJIL = this;
                c1331670kl3LJIIJ.LIZLLL("story_reveal_photo");
                c1331670kl3LJIIJ.LJIL = Bitmap.Config.ARGB_8888;
                c1331670kl3LJIIJ.LJJIII = EnumC1334360kpO.HIGH;
                c1331670kl3LJIIJ.LJJ((SmartImageView) this.LLJLLIL.getValue());
                c1331670kl3LJIIJ.LJIIJ(this);
                return;
            }
            return;
        }
        this.LLLFFI = true;
        StoryPhotoAbility storyPhotoAbilityEp4 = Ep();
        if (storyPhotoAbilityEp4 != null && (imageView = storyPhotoAbilityEp4.getImageView()) != null) {
            C786410Ut5.LJLLLLLL(0, imageView);
        }
        C786410Ut5.LJLLLLLL(8, getContentView());
    }

    @Override // X.InterfaceC427850Gq7
    public final void A3(Uri uri, C428600GrK c428600GrK) {
        String string;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onIntermediateImageSet, uri: ");
        sbLIZ.append(uri);
        sbLIZ.append(", image info: ");
        if (c428600GrK != null) {
            string = c428600GrK.toString();
        } else {
            string = null;
        }
        sbLIZ.append(string);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC427850Gq7
    public final void Bh(Uri uri, View view) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onStart: ");
        sbLIZ.append(uri);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC427850Gq7
    public final void lg(Uri uri, Throwable th) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onIntermediateImageFailed, uri: ");
        sbLIZ.append(uri);
        sbLIZ.append(", error: ");
        sbLIZ.append(Log.getStackTraceString(th));
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC427850Gq7
    public final void cm(Uri uri, View view, Throwable th) {
        String string;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onFailed, uri: ");
        sbLIZ.append(uri);
        sbLIZ.append(", error: ");
        sbLIZ.append(Log.getStackTraceString(th));
        C2188811AlT.LIZIZ(sbLIZ);
        this.LLLFZ = false;
        C442540HWy c442540HWy = C442540HWy.LIZ;
        if (uri == null || (string = uri.toString()) == null) {
            string = "";
        }
        c442540HWy.getClass();
        C442540HWy.LIZLLL(string, th, false);
    }

    @Override // X.InterfaceC427850Gq7
    public final void Ad(Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        String string;
        String string2;
        View imageView;
        Context context;
        Object obj;
        View viewLJJIJL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onComplete, uri: ");
        sbLIZ.append(uri);
        sbLIZ.append(", image info: ");
        Fragment fragment = null;
        if (c428600GrK != null) {
            string = c428600GrK.toString();
        } else {
            string = null;
        }
        sbLIZ.append(string);
        C2188811AlT.LIZIZ(sbLIZ);
        this.LLLFZ = true;
        C442540HWy c442540HWy = C442540HWy.LIZ;
        if (uri == null || (string2 = uri.toString()) == null) {
            string2 = "";
        }
        c442540HWy.getClass();
        C442540HWy.LJFF(null, null, string2, false);
        if (c428600GrK != null && (context = getContext()) != null) {
            C724270Sb3 c724270Sb3 = this.LLJI;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            int storyType = ((VideoItemParams) obj).getAweme().getStoryType();
            if (Bo()) {
                viewLJJIJL = LJJIJL();
            } else {
                viewLJJIJL = null;
            }
            C0RF0 c0rf0 = jm().LIZLLL;
            if (c0rf0 != null) {
                fragment = c0rf0.LIZJ;
            }
            C437040HBu c437040HBuLIZ = C710930Rud.LIZ(context, c428600GrK, storyType, viewLJJIJL, fragment);
            SmartImageView smartImageView = (SmartImageView) this.LLJLLIL.getValue();
            ViewGroup.LayoutParams layoutParams = smartImageView.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.width = c437040HBuLIZ.LIZJ;
                marginLayoutParams.height = c437040HBuLIZ.LIZLLL;
                marginLayoutParams.topMargin = c437040HBuLIZ.LJ;
                C786410Ut5.W5(smartImageView, marginLayoutParams);
                smartImageView.setActualImageScaleType(c437040HBuLIZ.LIZ);
                SmartImageView smartImageView2 = (SmartImageView) this.LLJLLIL.getValue();
                C1331750klB c1331750klB = new C1331750klB();
                c1331750klB.LJ = c437040HBuLIZ.LIZIZ;
                smartImageView2.setCircleOptions(new C1331730kl9(c1331750klB));
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
        StoryPhotoAbility storyPhotoAbilityEp = Ep();
        if (storyPhotoAbilityEp != null && (imageView = storyPhotoAbilityEp.getImageView()) != null) {
            C786410Ut5.LJLLLLLL(0, imageView);
        }
    }
}
