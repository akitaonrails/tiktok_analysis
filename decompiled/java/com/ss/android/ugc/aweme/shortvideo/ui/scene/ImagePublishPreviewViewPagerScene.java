package com.ss.android.ugc.aweme.shortvideo.ui.scene;

import X.C13LE;
import X.C1428310nGv;
import X.C1447800nmM;
import X.C1664600tQ2;
import X.C19714312Bh;
import X.C1DRG;
import X.C418440Gaw;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC379610EuV;
import Y.ACListenerS163S0100000_29;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.scene.navigation.NavigationScene;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.adaptation.PublishPreviewScene;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.ui.ImagePublishPreviewScene;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class ImagePublishPreviewViewPagerScene extends PublishPreviewScene implements InterfaceC379610EuV {
    public final VideoPublishEditModel LLJJL;
    public final String LLJJLIIIJLLLLLLLZ;
    public final UrlModel LLJL;
    public final int LLJLIL;
    public final String LLJLILLLLZIIL;
    public final int LLJLL;
    public final Function0<Unit> LLJLLIL;
    public final Function0<Unit> LLJLLL;
    public final int LLJZ;
    public final Function1<Integer, Unit> LLJZIJLIL;
    public final Function1<Integer, Unit> LLL;
    public TuxTextView LLLF;
    public TuxTextView LLLFF;
    public ImagePublishPreviewScene LLLFFI;
    public ImagePublishFullPagePreviewScene LLLFZ;
    public ViewGroup LLLI;
    public final C19714312Bh LLLII;

    @Override // com.ss.android.ugc.aweme.adaptation.PublishPreviewScene
    public final boolean LLLLLLIL() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene
    public final void nm() {
    }

    public final ImagePublishPreviewScene LLLLLLLLL() {
        ImagePublishPreviewScene imagePublishPreviewScene = this.LLLFFI;
        if (imagePublishPreviewScene != null) {
            return imagePublishPreviewScene;
        }
        return null;
    }

    public final ImagePublishFullPagePreviewScene LLLLLLLLLL() {
        ImagePublishFullPagePreviewScene imagePublishFullPagePreviewScene = this.LLLFZ;
        if (imagePublishFullPagePreviewScene != null) {
            return imagePublishFullPagePreviewScene;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.adaptation.PublishPreviewScene
    public final void LLLLLL() {
        LLLLLLLLLL().getClass();
        LLLLLLLLL().LLLLLL();
    }

    @Override // com.ss.android.ugc.aweme.adaptation.PublishPreviewScene
    public final boolean LLLLLLJ() {
        NavigationScene navigationSceneLIZ = C1447800nmM.LIZ(this);
        return Intrinsics.LJFF(navigationSceneLIZ != null ? navigationSceneLIZ.LLLLIIIILLL() : null, this);
    }

    @Override // com.ss.android.ugc.aweme.adaptation.PublishPreviewScene
    public final void LLLLLLL() {
        LLLLLLLLLL().LLLLLLL();
        LLLLLLLLL().LLLLLLL();
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        C1DRG c1drgLJIIIZ = C1664600tQ2.LJIIIZ(this);
        if (c1drgLJIIIZ != null) {
            return c1drgLJIIIZ;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene
    public final void S3(boolean z) {
        LLLLLLLLL().S3(z);
    }

    @Override // com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene
    public final void p2(boolean z) {
        LLLLLLLLL().p2(z);
    }

    @Override // com.ss.android.ugc.aweme.adaptation.AbsSceneAdaptationScene, X.AbstractC214814194y, com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        this.LLLFFI = new ImagePublishPreviewScene(this.LLJJL, this.LLJJLIIIJLLLLLLLZ, this.LLJL, this.LLJLIL, this.LLJLILLLLZIIL, this.LLJLL, this.LLJLLIL, this.LLJLLL, true, this.LLJZ, this.LLLII, this.LLJZIJLIL, this.LLL, false, 8192);
        ImagePublishPreviewScene imagePublishPreviewSceneLLLLLLLLL = LLLLLLLLL();
        String str = "";
        if (!isAdded(imagePublishPreviewSceneLLLLLLLLL)) {
            String strLJI = C13LE.LIZ(imagePublishPreviewSceneLLLLLLLLL.getClass()).LJI();
            if (strLJI == null) {
                strLJI = "";
            }
            add(R.id.rqf, imagePublishPreviewSceneLLLLLLLLL, strLJI);
        }
        this.LLLFZ = new ImagePublishFullPagePreviewScene(this.LLJJL, this.LLLII, this.LLJJLIIIJLLLLLLLZ, this.LLJL, this.LLJLL, false, this.LLJLLIL, this.LLJLILLLLZIIL, null, null, true);
        ImagePublishFullPagePreviewScene imagePublishFullPagePreviewSceneLLLLLLLLLL = LLLLLLLLLL();
        if (!isAdded(imagePublishFullPagePreviewSceneLLLLLLLLLL)) {
            String strLJI2 = C13LE.LIZ(imagePublishFullPagePreviewSceneLLLLLLLLLL.getClass()).LJI();
            if (strLJI2 != null) {
                str = strLJI2;
            }
            add(R.id.rql, imagePublishFullPagePreviewSceneLLLLLLLLLL, str);
        }
        this.LLLI = (ViewGroup) this.mView.findViewById(R.id.uk5);
        this.LLLF = (TuxTextView) this.mView.findViewById(R.id.hsl);
        this.LLLFF = (TuxTextView) this.mView.findViewById(R.id.int_res_0x7f0a2eff);
        TuxTextView tuxTextView = this.LLLF;
        TuxTextView tuxTextView2 = null;
        if (tuxTextView == null) {
            tuxTextView = null;
        }
        tuxTextView.setSelected(true);
        ViewGroup viewGroup = this.LLLI;
        if (viewGroup != null) {
            C1428310nGv.LJI(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)), viewGroup, true);
        }
        TuxTextView tuxTextView3 = this.LLLF;
        if (tuxTextView3 == null) {
            tuxTextView3 = null;
        }
        C786410Ut5.h9(tuxTextView3, new ACListenerS163S0100000_29(this, 93));
        TuxTextView tuxTextView4 = this.LLLFF;
        if (tuxTextView4 != null) {
            tuxTextView2 = tuxTextView4;
        }
        C786410Ut5.h9(tuxTextView2, new ACListenerS163S0100000_29(this, 94));
        super.onViewCreated(view, bundle);
    }

    @Override // X.AbstractC1447660nm8, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.csx, viewGroup, false);
    }

    public /* synthetic */ ImagePublishPreviewViewPagerScene(VideoPublishEditModel videoPublishEditModel, String str, UrlModel urlModel, int i, String str2, int i2, Function0 function0, Function0 function02, int i3) {
        this(videoPublishEditModel, str, urlModel, i, str2, i2, function0, function02, i3, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ImagePublishPreviewViewPagerScene(VideoPublishEditModel videoPublishEditModel, String str, UrlModel urlModel, int i, String str2, int i2, Function0<Unit> function0, Function0<Unit> function02, int i3, Function1<? super Integer, Unit> function1, Function1<? super Integer, Unit> function12) {
        this.LLJJL = videoPublishEditModel;
        this.LLJJLIIIJLLLLLLLZ = str;
        this.LLJL = urlModel;
        this.LLJLIL = i;
        this.LLJLILLLLZIIL = str2;
        this.LLJLL = i2;
        this.LLJLLIL = function0;
        this.LLJLLL = function02;
        this.LLJZ = i3;
        this.LLJZIJLIL = function1;
        this.LLL = function12;
        disableSceneRestore();
        disableSupportRestore();
        this.LLLII = new C19714312Bh(this);
    }
}
