package com.ss.android.ugc.gamora.editor.ailive.newprompt;

import X.C01GW;
import X.C0L76;
import X.C0LE3;
import X.C0MD8;
import X.C0MDE;
import X.C0MGE;
import X.C0MUK;
import X.C0MWS;
import X.C1361400lX0;
import X.C1664590tQ1;
import X.C1664600tQ2;
import X.C201955140j;
import X.C452501pT;
import X.C786410Ut5;
import X.InterfaceC362610EJn;
import X.InterfaceC484050IyZ;
import X.InterfaceC524950KiL;
import Y.AObserverS212S0100000_8;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LiveData;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene;
import com.ss.android.ugc.aweme.creative.model.ailive.AILivePhotoModel;
import com.ss.android.ugc.aweme.creative.model.ailive.PromptPageMobParam;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.SoftKeyBoardListener;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS587S0100000_8;

/* JADX INFO: loaded from: classes9.dex */
public final class AILivePromptDependencyRootScene extends BaseScreenAdaptScene implements InterfaceC524950KiL, C0MWS, C0MGE {
    public C0MD8 LLJL;
    public NewPromptPageModel LLJLIL;
    public VideoPublishEditModel LLJLILLLLZIIL;
    public ShortVideoContext LLJLL;
    public final ArrayList<InterfaceC484050IyZ> LLJJL = new ArrayList<>();
    public final ArrayList<InterfaceC362610EJn> LLJJLIIIJLLLLLLLZ = new ArrayList<>();
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 535));

    @Override // com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene
    public final void S3(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene
    public final void nm() {
    }

    @Override // com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene
    public final void p2(boolean z) {
    }

    @Override // X.AbstractC214814194y, X.C198H
    public final boolean onBackPressed() {
        ArrayList<InterfaceC362610EJn> arrayList = this.LLJJLIIIJLLLLLLLZ;
        if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
            Iterator<InterfaceC362610EJn> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (it2.next().onKeyDown(4, null)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene, X.AbstractC214814194y, X.AbstractC1447660nm8, com.bytedance.scene.Scene
    public final void onDestroyView() {
        super.onDestroyView();
        C201955140j.LJIILL(C0L76.LIZIZ, "AILivePromptDependencyRootScene", "onDestroyView");
    }

    @Override // X.C0MWS
    public final C0LE3 getType() {
        return C0LE3.AI_LIVE_PROMPT;
    }

    @Override // X.InterfaceC524950KiL
    public final void AH(InterfaceC362610EJn interfaceC362610EJn) {
        ListProtector.add(this.LLJJLIIIJLLLLLLLZ, 0, interfaceC362610EJn);
    }

    @Override // X.C0MWS
    public final void LJLL(boolean z) {
        C786410Ut5.LJLLLLLL(8, this.mView);
    }

    @Override // X.InterfaceC524950KiL
    public final void Qh(InterfaceC484050IyZ interfaceC484050IyZ) {
        this.LLJJL.add(interfaceC484050IyZ);
    }

    @Override // X.InterfaceC524950KiL
    public final void T4(InterfaceC484050IyZ interfaceC484050IyZ) {
        this.LLJJL.remove(interfaceC484050IyZ);
    }

    @Override // X.InterfaceC524950KiL
    public final void b8(InterfaceC362610EJn interfaceC362610EJn) {
        this.LLJJLIIIJLLLLLLLZ.remove(interfaceC362610EJn);
    }

    @Override // X.InterfaceC524950KiL
    public final void kF(InterfaceC362610EJn interfaceC362610EJn) {
        this.LLJJLIIIJLLLLLLLZ.add(interfaceC362610EJn);
    }

    @Override // com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene, com.ss.android.ugc.aweme.adaptation.AbsSceneAdaptationScene, X.AbstractC214814194y, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        LiveData<C0MDE> liveDataY;
        LiveData<Unit> liveDataHI2;
        NewPromptPageModel newPromptPageModel;
        ShortVideoContext shortVideoContext;
        VideoPublishEditModel videoPublishEditModel;
        AILivePhotoModel aILivePhotoModel;
        PromptPageMobParam promptPageMobParam;
        AILivePhotoModel aILivePhotoModel2;
        PromptPageMobParam promptPageMobParam2;
        super.onActivityCreated(bundle);
        C201955140j.LJIILL(C0L76.LIZIZ, "AILivePromptDependencyRootScene", "onActivityCreated");
        Bundle argumentsSafely = getArgumentsSafely();
        if (argumentsSafely != null) {
            Parcelable parcelable = argumentsSafely.getParcelable("ai_live_new_prompt_model");
            if (parcelable instanceof NewPromptPageModel) {
                newPromptPageModel = (NewPromptPageModel) parcelable;
            } else {
                newPromptPageModel = null;
            }
            this.LLJLIL = newPromptPageModel;
            VideoPublishEditModel videoPublishEditModel2 = (VideoPublishEditModel) argumentsSafely.getSerializable("args");
            if (videoPublishEditModel2 != null) {
                videoPublishEditModel2.creativeModel = C0MUK.LIZJ(argumentsSafely);
            } else {
                videoPublishEditModel2 = null;
            }
            this.LLJLILLLLZIIL = videoPublishEditModel2;
            Parcelable parcelable2 = argumentsSafely.getParcelable("key_short_video_context");
            if (parcelable2 instanceof ShortVideoContext) {
                shortVideoContext = (ShortVideoContext) parcelable2;
            } else {
                shortVideoContext = null;
            }
            this.LLJLL = shortVideoContext;
            VideoPublishEditModel videoPublishEditModel3 = this.LLJLILLLLZIIL;
            if ((videoPublishEditModel3 == null || (aILivePhotoModel2 = videoPublishEditModel3.getAILivePhotoModel()) == null || (promptPageMobParam2 = aILivePhotoModel2.mobParam) == null || promptPageMobParam2.aiAliveChangePhoto == null) && (videoPublishEditModel = this.LLJLILLLLZIIL) != null && (aILivePhotoModel = videoPublishEditModel.getAILivePhotoModel()) != null && (promptPageMobParam = aILivePhotoModel.mobParam) != null) {
                promptPageMobParam.aiAliveChangePhoto = Boolean.FALSE;
            }
        }
        C1664590tQ1.LIZLLL(this, "AILivePromptDependencyRootScene", false, new AwS587S0100000_8(this, 578), 2);
        C1664600tQ2.LIZ(this, "AILivePromptDependencyRootScene", new AwS587S0100000_8(this, 583));
        C0MD8 c0md8 = this.LLJL;
        if (c0md8 != null && (liveDataHI2 = c0md8.HI2()) != null) {
            liveDataHI2.observe(this, new AObserverS212S0100000_8(this, 76));
        }
        C0MD8 c0md82 = this.LLJL;
        if (c0md82 != null && (liveDataY = c0md82.Y()) != null) {
            liveDataY.observe(this, new AObserverS212S0100000_8(this, 77));
        }
    }

    @Override // com.ss.android.ugc.aweme.adaptation.AbsSceneAdaptationScene, X.AbstractC214814194y, com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C201955140j.LJIILL(C0L76.LIZIZ, "AILivePromptDependencyRootScene", "onViewCreated");
        ((SoftKeyBoardListener) this.LLJLLIL.getValue()).LIZJ();
    }

    @Override // X.AbstractC214814194y
    public final void onActivityResult(int i, int i2, Intent intent) {
        Iterator<InterfaceC484050IyZ> it2 = this.LLJJL.iterator();
        while (it2.hasNext() && !it2.next().onActivityResult(i, i2, intent)) {
        }
    }

    @Override // X.AbstractC1447660nm8, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C201955140j.LJIILL(C0L76.LIZIZ, "AILivePromptDependencyRootScene", "onCreateView");
        return (ViewGroup) C786410Ut5.Td(layoutInflater.cloneInContext(new C1361400lX0(this.mActivity, R.style.y0)), R.layout.emj, viewGroup, false);
    }
}
