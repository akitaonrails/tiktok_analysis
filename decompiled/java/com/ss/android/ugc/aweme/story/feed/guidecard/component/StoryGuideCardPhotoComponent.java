package com.ss.android.ugc.aweme.story.feed.guidecard.component;

import X.C03IT;
import X.C1308910kAL;
import X.C1331070kk5;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1331730kl9;
import X.C1331750klB;
import X.C13LP;
import X.C2188811AlT;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C428600GrK;
import X.C442540HWy;
import X.C710930Rud;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1334360kpO;
import X.EnumC1338240kve;
import X.InterfaceC427850Gq7;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.story.feed.common.sub.photo.base.StoryBasePhotoComponent;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class StoryGuideCardPhotoComponent extends StoryBasePhotoComponent<StoryGuideCardPhotoComponent> implements InterfaceC427850Gq7 {
    public SmartImageView LLJJJJLIIL;

    @Override // X.InterfaceC427850Gq7
    public final void Bh(Uri uri, View view) {
    }

    @Override // X.InterfaceC427850Gq7
    public final void e1(Uri uri) {
    }

    @Override // X.InterfaceC427850Gq7
    public final void lg(Uri uri, Throwable th) {
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LJLLLL() {
        SmartImageView smartImageView = this.LLJJJJLIIL;
        if (smartImageView != null) {
            smartImageView.setImageBitmap(null);
        }
        SmartImageView smartImageView2 = this.LLJJJJLIIL;
        if (smartImageView2 != null) {
            smartImageView2.setActualImageScaleType(EnumC1338240kve.CENTER_CROP);
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        SmartImageView smartImageView;
        C1331070kk5 hierarchy;
        Integer numLIZJ = null;
        if (view instanceof SmartImageView) {
            smartImageView = (SmartImageView) view;
        } else {
            smartImageView = null;
        }
        this.LLJJJJLIIL = smartImageView;
        if (smartImageView != null) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_tiktok_logo;
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(100));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(100));
            Context context = getContext();
            if (context != null) {
                numLIZJ = C1308910kAL.LIZJ(R.attr.ei, context);
            }
            c419910GdJ.LIZLLL = numLIZJ;
            smartImageView.setPlaceholderImage(c419910GdJ.LIZ(view.getContext()));
        }
        SmartImageView smartImageView2 = this.LLJJJJLIIL;
        if (smartImageView2 != null && (hierarchy = smartImageView2.getHierarchy()) != null) {
            C419910GdJ c419910GdJ2 = new C419910GdJ();
            c419910GdJ2.LIZ = R.raw.icon_color_tiktok_logo_light;
            c419910GdJ2.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(100));
            c419910GdJ2.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(100));
            hierarchy.LJIJ(c419910GdJ2.LIZ(view.getContext()), 5);
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        String str;
        UrlModel urlModelLIZIZ = C710930Rud.LIZIZ(videoItemParams.getAweme());
        if (urlModelLIZIZ != null) {
            C442540HWy c442540HWy = C442540HWy.LIZ;
            List<String> urlList = urlModelLIZIZ.getUrlList();
            if (urlList == null || (str = (String) C13LP.LJJJLL(urlList)) == null) {
                str = "";
            }
            c442540HWy.getClass();
            C442540HWy.LJ(str);
            C1331670kl3 c1331670kl3LJIIJ = C1331660kl2.LJIIJ(new C03IT(urlModelLIZIZ.getUrlList()));
            c1331670kl3LJIIJ.LIZLLL("story_photo");
            c1331670kl3LJIIJ.LJJJIL = this;
            c1331670kl3LJIIJ.LJIL = Bitmap.Config.RGB_565;
            c1331670kl3LJIIJ.LJJIII = EnumC1334360kpO.HIGH;
            c1331670kl3LJIIJ.LJJ(this.LLJJJJLIIL);
            c1331670kl3LJIIJ.LJIILJJIL = 0;
            c1331670kl3LJIIJ.LJIIJ(this);
        }
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
        if (!this.LLJJIII) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onComplete, uri: ");
        sbLIZ.append(uri);
        sbLIZ.append(", image info: ");
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
        EnumC1338240kve enumC1338240kve = EnumC1338240kve.CENTER_CROP;
        int i = (int) 0.0f;
        SmartImageView smartImageView = this.LLJJJJLIIL;
        if (smartImageView != null) {
            ViewGroup.LayoutParams layoutParams = smartImageView.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.width = -1;
                marginLayoutParams.height = -1;
                marginLayoutParams.topMargin = i;
                C786410Ut5.W5(smartImageView, marginLayoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
        SmartImageView smartImageView2 = this.LLJJJJLIIL;
        if (smartImageView2 != null) {
            smartImageView2.setActualImageScaleType(enumC1338240kve);
        }
        SmartImageView smartImageView3 = this.LLJJJJLIIL;
        if (smartImageView3 != null) {
            C1331750klB c1331750klB = new C1331750klB();
            c1331750klB.LJ = 0.0f;
            smartImageView3.setCircleOptions(new C1331730kl9(c1331750klB));
        }
    }
}
