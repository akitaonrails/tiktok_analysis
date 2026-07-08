package com.ss.android.ugc.aweme.story.feed.common.sub.abroll;

import X.C01GW;
import X.C03IT;
import X.C098200Yq;
import X.C0LAB;
import X.C0RF0;
import X.C1308910kAL;
import X.C1331070kk5;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1331730kl9;
import X.C1331750klB;
import X.C1378990lzN;
import X.C13LE;
import X.C13LP;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1609930rzr;
import X.C1618440sDa;
import X.C1619980sG4;
import X.C189200o6;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2189821An6;
import X.C2217381BqS;
import X.C287130BNf;
import X.C337180DJs;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C428600GrK;
import X.C437040HBu;
import X.C442540HWy;
import X.C628500Oky;
import X.C630740Ooa;
import X.C706480RnS;
import X.C710930Rud;
import X.C724270Sb3;
import X.C729510SjV;
import X.C735840Sti;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1334360kpO;
import X.EnumC1338240kve;
import X.InterfaceC427850Gq7;
import Y.ALAdapterS1S0210000_6;
import Y.ALAdapterS3S0100000_6;
import Y.ATListenerS440S0100000_6;
import Y.AUListenerS256S0100000_6;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IDetailFeedSafService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.collection.common.protocol.CleanModeProtocol;
import com.ss.android.ugc.aweme.feed.model.AbRollInfo;
import com.ss.android.ugc.aweme.feed.model.AbRollStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.feed.common.sub.photo.base.StoryBasePhotoSlotComponent;
import com.ss.android.ugc.aweme.story.feed.common.sub.photo.component.StoryPhotoAbility;
import com.ss.android.ugc.aweme.story.feed.common.sub.photo.component.StoryStickerInteractAbility;
import com.ss.android.ugc.aweme.story.feed.immersive.abroll.StoryAbRollProgressButton;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AFwS289S0000000_6;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class StoryAbRollComponent extends StoryBasePhotoSlotComponent<StoryAbRollComponent> implements InterfaceC427850Gq7 {
    public final C630740Ooa LLJLLIL = C628500Oky.LIZ(new AwS550S0100000_6(this, 717));
    public final C630740Ooa LLJLLL = C628500Oky.LIZ(new AwS550S0100000_6(this, 718));
    public final C630740Ooa LLJZ = C628500Oky.LIZ(new AwS550S0100000_6(this, 714));
    public final C630740Ooa LLJZIJLIL = C628500Oky.LIZ(new AwS550S0100000_6(this, 715));
    public final C01GW LLL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), AFwS236S0000000_6.get$arr$(353));
    public final C630740Ooa LLLF = C628500Oky.LIZ(new AwS550S0100000_6(this, 719));
    public ObjectAnimator LLLFF;
    public ObjectAnimator LLLFFI;
    public boolean LLLFZ;
    public boolean LLLI;
    public boolean LLLII;
    public boolean LLLIIII;
    public long LLLIIIIL;

    @Override // X.InterfaceC427850Gq7
    public final void Bh(Uri uri, View view) {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fc5;
    }

    @Override // X.InterfaceC427850Gq7
    public final void e1(Uri uri) {
    }

    @Override // X.InterfaceC427850Gq7
    public final void lg(Uri uri, Throwable th) {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Co() {
        C706480RnS c706480RnS = C706480RnS.LIZ;
        AwS550S0100000_6 awS550S0100000_6 = new AwS550S0100000_6(this, 716);
        c706480RnS.getClass();
        C706480RnS.LJII(this, "story_layout_ab_roll_view", true, awS550S0100000_6);
    }

    public final void Ep() {
        StoryPhotoAbility storyPhotoAbility;
        C1618440sDa.LIZIZ.LJJLIIIIJ(C1558520qew.LJIIL(this), false);
        StoryAbRollProgressButton storyAbRollProgressButtonJp = Jp();
        if (storyAbRollProgressButtonJp != null) {
            storyAbRollProgressButtonJp.LLJJ = false;
            ValueAnimator valueAnimator = storyAbRollProgressButtonJp.LLIZLLLIL;
            if (valueAnimator != null) {
                valueAnimator.pause();
            }
            ValueAnimator valueAnimator2 = storyAbRollProgressButtonJp.LLIZ;
            if (valueAnimator2 != null) {
                valueAnimator2.pause();
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(storyAbRollProgressButtonJp.LLILZLL, 100.0f);
            valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
            valueAnimatorOfFloat.setDuration((long) (DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL * (storyAbRollProgressButtonJp.LLILZLL / 100.0f)));
            valueAnimatorOfFloat.addUpdateListener(new AUListenerS256S0100000_6(storyAbRollProgressButtonJp, 179));
            valueAnimatorOfFloat.start();
            storyAbRollProgressButtonJp.LIZJ(storyAbRollProgressButtonJp.getScaleX(), 1.0f);
            storyAbRollProgressButtonJp.LIZLLL();
        }
        ObjectAnimator objectAnimator = this.LLLFF;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        ObjectAnimator objectAnimator2 = this.LLLFFI;
        if (objectAnimator2 != null) {
            objectAnimator2.cancel();
        }
        View viewGp = Gp();
        if (viewGp != null) {
            Tp(viewGp.getScaleX(), 1.0f);
        }
        if (!this.LLLI && (storyPhotoAbility = (StoryPhotoAbility) this.LLJLLIL.getValue()) != null) {
            storyPhotoAbility.LJIILLIIL();
        }
        Qp(false);
    }

    public final View Gp() {
        return (View) this.LLJZ.getValue();
    }

    public final SmartImageView Ip() {
        return (SmartImageView) this.LLJZIJLIL.getValue();
    }

    public final StoryAbRollProgressButton Jp() {
        return (StoryAbRollProgressButton) this.LLLF.getValue();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        StoryAbRollProgressButton storyAbRollProgressButtonJp;
        IDetailFeedSafService iDetailFeedSafService = (IDetailFeedSafService) PluggableExtentionKt.pluggableSpi$default(IDetailFeedSafService.class, false, false, false, 14, null);
        if (iDetailFeedSafService != null) {
            C0RF0 c0rf0 = jm().LIZLLL;
            if (iDetailFeedSafService.LIZLLL(c0rf0 != null ? c0rf0.LIZJ : null) == null || (storyAbRollProgressButtonJp = Jp()) == null) {
                return;
            }
            storyAbRollProgressButtonJp.LIZ();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC691660RBc
    public final void LJL() {
        List listLIZIZ = C1554610qYd.LIZIZ(C1558520qew.LJIIL(this), CleanModeProtocol.class, false);
        if (listLIZIZ != null) {
            Iterator it2 = listLIZIZ.iterator();
            while (it2.hasNext()) {
                ((CleanModeProtocol) it2.next()).Iu0();
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC691660RBc
    public final void LJLLLL() {
        SmartImageView smartImageViewIp = Ip();
        smartImageViewIp.setImageBitmap(null);
        smartImageViewIp.setActualImageScaleType(EnumC1338240kve.CENTER_CROP);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedAssem
    public final void oo() {
        try {
            C786410Ut5.LJLLLLLL(8, getContentView());
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public final void Fp(boolean z) {
        View viewIp;
        View viewGp;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        StoryPhotoAbility storyPhotoAbility = (StoryPhotoAbility) this.LLJLLIL.getValue();
        if (storyPhotoAbility != null) {
            storyPhotoAbility.pausePlay();
        }
        this.LLLI = true;
        if (z) {
            List listLIZIZ = C1554610qYd.LIZIZ(C1558520qew.LJIIL(this), CleanModeProtocol.class, false);
            if (listLIZIZ != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : (ArrayList) listLIZIZ) {
                    CleanModeProtocol cleanModeProtocol = (CleanModeProtocol) obj;
                    if (!((Boolean) C287130BNf.LIZIZ.getValue()).booleanValue() || !Intrinsics.LJFF(cleanModeProtocol.BB1(), "bottom_bar_tag")) {
                        arrayList.add(obj);
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((CleanModeProtocol) it2.next()).Lv();
                }
            }
            C1618440sDa.LIZIZ.LJJLIIIIJ(C1558520qew.LJIIL(this), true);
            StoryStickerInteractAbility storyStickerInteractAbility = (StoryStickerInteractAbility) this.LLJLLL.getValue();
            if (storyStickerInteractAbility != null) {
                storyStickerInteractAbility.zA0();
            }
            viewIp = Gp();
            viewGp = Ip();
            StoryAbRollProgressButton storyAbRollProgressButtonJp = Jp();
            if (storyAbRollProgressButtonJp != null) {
                storyAbRollProgressButtonJp.LIZIZ(false);
            }
        } else {
            viewIp = Ip();
            viewGp = Gp();
            StoryAbRollProgressButton storyAbRollProgressButtonJp2 = Jp();
            if (storyAbRollProgressButtonJp2 != null) {
                storyAbRollProgressButtonJp2.LIZIZ(true);
            }
        }
        Property property = View.SCALE_X;
        float[] fArr = new float[2];
        if (z) {
            f = 0.8f;
        } else {
            f = 1.0f;
        }
        fArr[0] = f;
        fArr[1] = 0.6f;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewIp, (Property<View, Float>) property, fArr);
        objectAnimatorOfFloat.setInterpolator(C1619980sG4.LJIILIIL());
        objectAnimatorOfFloat.setDuration(150L);
        objectAnimatorOfFloat.addListener(new ALAdapterS1S0210000_6(this, viewIp, z, 1));
        C786410Ut5.Pd(objectAnimatorOfFloat);
        Property property2 = View.SCALE_Y;
        float[] fArr2 = new float[2];
        if (z) {
            f2 = 0.8f;
        } else {
            f2 = 1.0f;
        }
        fArr2[0] = f2;
        fArr2[1] = 0.6f;
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(viewIp, (Property<View, Float>) property2, fArr2);
        objectAnimatorOfFloat2.setInterpolator(C1619980sG4.LJIILIIL());
        objectAnimatorOfFloat2.setDuration(150L);
        objectAnimatorOfFloat2.addListener(new ALAdapterS3S0100000_6(viewIp, 11));
        C786410Ut5.Pd(objectAnimatorOfFloat2);
        Property property3 = View.ROTATION_Y;
        float[] fArr3 = new float[2];
        fArr3[0] = 0.0f;
        float f6 = -180.0f;
        if (z) {
            f3 = -180.0f;
        } else {
            f3 = 180.0f;
        }
        fArr3[1] = f3;
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(viewIp, (Property<View, Float>) property3, fArr3);
        objectAnimatorOfFloat3.setInterpolator(C1619980sG4.LJIILIIL());
        objectAnimatorOfFloat3.setDuration(650L);
        objectAnimatorOfFloat3.addListener(new ALAdapterS3S0100000_6(this, 12));
        C786410Ut5.Pd(objectAnimatorOfFloat3);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(viewIp, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
        objectAnimatorOfFloat4.setInterpolator(new LinearInterpolator());
        objectAnimatorOfFloat4.setDuration(1L);
        objectAnimatorOfFloat4.setStartDelay(110L);
        C786410Ut5.Pd(objectAnimatorOfFloat4);
        Property property4 = View.SCALE_X;
        float[] fArr4 = new float[2];
        if (z) {
            f4 = 0.8f;
        } else {
            f4 = 1.0f;
        }
        fArr4[0] = f4;
        fArr4[1] = 0.6f;
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(viewGp, (Property<View, Float>) property4, fArr4);
        objectAnimatorOfFloat5.setInterpolator(C1619980sG4.LJIILIIL());
        objectAnimatorOfFloat5.setDuration(150L);
        objectAnimatorOfFloat5.addListener(new ALAdapterS3S0100000_6(viewGp, 13));
        C786410Ut5.Pd(objectAnimatorOfFloat5);
        Property property5 = View.SCALE_Y;
        float[] fArr5 = new float[2];
        if (z) {
            f5 = 0.8f;
        } else {
            f5 = 1.0f;
        }
        fArr5[0] = f5;
        fArr5[1] = 0.6f;
        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(viewGp, (Property<View, Float>) property5, fArr5);
        objectAnimatorOfFloat6.setInterpolator(C1619980sG4.LJIILIIL());
        objectAnimatorOfFloat6.setDuration(150L);
        objectAnimatorOfFloat6.addListener(new ALAdapterS3S0100000_6(viewGp, 14));
        C786410Ut5.Pd(objectAnimatorOfFloat6);
        Property property6 = View.ROTATION_Y;
        float[] fArr6 = new float[2];
        if (z) {
            f6 = 180.0f;
        }
        fArr6[0] = f6;
        fArr6[1] = 0.0f;
        ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(viewGp, (Property<View, Float>) property6, fArr6);
        objectAnimatorOfFloat7.setInterpolator(C1619980sG4.LJIILIIL());
        objectAnimatorOfFloat7.setDuration(650L);
        C786410Ut5.Pd(objectAnimatorOfFloat7);
        ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(viewGp, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
        objectAnimatorOfFloat8.setInterpolator(new LinearInterpolator());
        objectAnimatorOfFloat8.setDuration(1L);
        objectAnimatorOfFloat8.setStartDelay(110L);
        C786410Ut5.Pd(objectAnimatorOfFloat8);
    }

    public final void Qp(boolean z) {
        Object obj;
        String eventType;
        String strLJIL;
        String authorUid;
        String aid;
        Integer numValueOf;
        String str;
        User author;
        BaseFeedPageParams baseFeedPageParams;
        C2189821An6 c2189821An6;
        BaseFeedPageParams baseFeedPageParams2;
        C2189821An6 c2189821An62;
        C735840Sti c735840Sti = C735840Sti.LIZ;
        C724270Sb3 c724270Sb3 = this.LLJI;
        Integer numValueOf2 = null;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        Aweme aweme = ((VideoItemParams) obj).getAweme();
        C0RF0 c0rf0 = jm().LIZLLL;
        if (c0rf0 != null && (baseFeedPageParams2 = c0rf0.LJ) != null && (c2189821An62 = baseFeedPageParams2.param) != null) {
            eventType = c2189821An62.getEventType();
        } else {
            eventType = null;
        }
        C0RF0 c0rf02 = jm().LIZLLL;
        if (c0rf02 != null && (baseFeedPageParams = c0rf02.LJ) != null && (c2189821An6 = baseFeedPageParams.param) != null) {
            strLJIL = C1609930rzr.LJIL(c2189821An6);
        } else {
            strLJIL = null;
        }
        c735840Sti.getClass();
        C0LAB c0lab = new C0LAB();
        if (aweme != null) {
            authorUid = AwemeExtKt.getAuthorUid(aweme);
        } else {
            authorUid = null;
        }
        c0lab.LJ("author_id", authorUid);
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        c0lab.LJ("group_id", aid);
        if (aweme != null) {
            numValueOf = Integer.valueOf(aweme.getAwemeType());
        } else {
            numValueOf = null;
        }
        c0lab.LIZLLL(numValueOf, "aweme_type");
        if (aweme != null && (author = aweme.getAuthor()) != null) {
            numValueOf2 = Integer.valueOf(author.getFollowStatus());
        }
        c0lab.LIZLLL(numValueOf2, "follow_status");
        c0lab.LJ("story_type", "story");
        c0lab.LJ("enter_from", eventType);
        c0lab.LJ("enter_position", strLJIL);
        if (z) {
            str = "success";
        } else {
            str = "fail";
        }
        c0lab.LJ("result", str);
        C20684815ws.LJIILLIIL("story_hold_for_b", c0lab.LIZ);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        Integer numLIZJ;
        C337180DJs.LIZ(getContentView().findViewById(R.id.tv_progress));
        SmartImageView smartImageViewIp = Ip();
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_tiktok_logo;
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(100));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(100));
        Context context = smartImageViewIp.getContext();
        if (context != null) {
            numLIZJ = C1308910kAL.LIZJ(R.attr.ei, context);
        } else {
            numLIZJ = null;
        }
        c419910GdJ.LIZLLL = numLIZJ;
        smartImageViewIp.setPlaceholderImage(c419910GdJ.LIZ(view.getContext()));
        C1331070kk5 hierarchy = smartImageViewIp.getHierarchy();
        if (hierarchy != null) {
            C419910GdJ c419910GdJ2 = new C419910GdJ();
            c419910GdJ2.LIZ = R.raw.icon_color_tiktok_logo_light;
            c419910GdJ2.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(100));
            c419910GdJ2.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(100));
            hierarchy.LJIJ(c419910GdJ2.LIZ(view.getContext()), 5);
        }
        C1378990lzN.LIZIZ(smartImageViewIp, Float.valueOf(C418440Gaw.LIZIZ(14)), null, null, null, null, 30);
        Ip().setOnTouchListener(new ATListenerS440S0100000_6(this, 6));
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLL.getValue(), new C2217381BqS() { // from class: X.0HBw
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILLL;
            }
        }, null, AFwS289S0000000_6.get$arr$(26), 6);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent
    /* JADX INFO: renamed from: op */
    public final boolean ur(VideoItemParams videoItemParams) {
        return C729510SjV.LJJIJ(videoItemParams.getAweme());
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        AbRollInfo abRollInfo;
        int i;
        PhotoModeImageInfo photoModeImageInfo;
        List<PhotoModeImageUrlModel> imageList;
        PhotoModeImageUrlModel photoModeImageUrlModel;
        UrlModel urlModelLIZJ;
        String str;
        VideoItemParams videoItemParams2 = videoItemParams;
        C786410Ut5.LJLLLLLL(0, getContentView());
        AbRollStruct abRollStruct = videoItemParams2.getAweme().getAbRollStruct();
        if (abRollStruct != null && (abRollInfo = abRollStruct.abRollInfoB) != null && (i = abRollInfo.index) != -1 && (photoModeImageInfo = videoItemParams2.getAweme().getPhotoModeImageInfo()) != null && (imageList = photoModeImageInfo.getImageList()) != null && (photoModeImageUrlModel = (PhotoModeImageUrlModel) C13LP.LJJJLZIJ(i, imageList)) != null && (urlModelLIZJ = C710930Rud.LIZJ(photoModeImageUrlModel)) != null) {
            C442540HWy c442540HWy = C442540HWy.LIZ;
            List<String> urlList = urlModelLIZJ.getUrlList();
            if (urlList == null || (str = (String) C13LP.LJJJLL(urlList)) == null) {
                str = "";
            }
            c442540HWy.getClass();
            C442540HWy.LJ(str);
            C1331670kl3 c1331670kl3LJIIJ = C1331660kl2.LJIIJ(new C03IT(urlModelLIZJ.getUrlList()));
            c1331670kl3LJIIJ.LIZLLL("story_photo");
            c1331670kl3LJIIJ.LJJJIL = this;
            c1331670kl3LJIIJ.LJIL = Bitmap.Config.RGB_565;
            c1331670kl3LJIIJ.LJJIII = EnumC1334360kpO.HIGH;
            c1331670kl3LJIIJ.LJJ(Ip());
            c1331670kl3LJIIJ.LJIILJJIL = 0;
            c1331670kl3LJIIJ.LJIIJ(this);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(Object obj) {
        return ur((VideoItemParams) obj);
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

    public final void Tp(float f, float f2) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(Gp(), (Property<View, Float>) View.SCALE_X, f, f2);
        objectAnimatorOfFloat.setInterpolator(C1619980sG4.LJIILIIL());
        objectAnimatorOfFloat.setDuration(300L);
        C786410Ut5.Pd(objectAnimatorOfFloat);
        this.LLLFF = objectAnimatorOfFloat;
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(Gp(), (Property<View, Float>) View.SCALE_Y, f, f2);
        objectAnimatorOfFloat2.setInterpolator(C1619980sG4.LJIILIIL());
        objectAnimatorOfFloat2.setDuration(300L);
        C786410Ut5.Pd(objectAnimatorOfFloat2);
        this.LLLFFI = objectAnimatorOfFloat2;
    }

    @Override // X.InterfaceC427850Gq7
    public final void cm(Uri uri, View view, Throwable th) {
        String string;
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
        Context context;
        View viewLJJIJL;
        if (!this.LLJJIII) {
            return;
        }
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
        C442540HWy c442540HWy = C442540HWy.LIZ;
        if (uri == null || (string2 = uri.toString()) == null) {
            string2 = "";
        }
        c442540HWy.getClass();
        C442540HWy.LJFF(null, null, string2, false);
        if (c428600GrK != null && (context = getContext()) != null) {
            if (Bo()) {
                viewLJJIJL = LJJIJL();
            } else {
                viewLJJIJL = null;
            }
            C0RF0 c0rf0 = jm().LIZLLL;
            if (c0rf0 != null) {
                fragment = c0rf0.LIZJ;
            }
            C437040HBu c437040HBuLIZ = C710930Rud.LIZ(context, c428600GrK, 4, viewLJJIJL, fragment);
            SmartImageView smartImageViewIp = Ip();
            ViewGroup.LayoutParams layoutParams = smartImageViewIp.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.width = c437040HBuLIZ.LIZJ;
                marginLayoutParams.height = c437040HBuLIZ.LIZLLL;
                marginLayoutParams.topMargin = c437040HBuLIZ.LJ;
                C786410Ut5.W5(smartImageViewIp, marginLayoutParams);
                Ip().setActualImageScaleType(c437040HBuLIZ.LIZ);
                SmartImageView smartImageViewIp2 = Ip();
                C1331750klB c1331750klB = new C1331750klB();
                c1331750klB.LJ = c437040HBuLIZ.LIZIZ;
                smartImageViewIp2.setCircleOptions(new C1331730kl9(c1331750klB));
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }
}
