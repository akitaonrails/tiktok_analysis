package com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday;

import X.AbstractC568240MQk;
import X.C03IT;
import X.C0BDU;
import X.C0CHQ;
import X.C0FJP;
import X.C0GTR;
import X.C0LAB;
import X.C0MKJ;
import X.C0ML5;
import X.C0ML6;
import X.C0ML7;
import X.C0ML9;
import X.C0MLE;
import X.C0MMK;
import X.C0MQ1;
import X.C0MQO;
import X.C0MRT;
import X.C0MT7;
import X.C0MT8;
import X.C12WG;
import X.C1324750kZt;
import X.C1378990lzN;
import X.C13LP;
import X.C1428640nHS;
import X.C1429810nJL;
import X.C1438580nXU;
import X.C1440005kM;
import X.C1447800nmM;
import X.C14EU;
import X.C15438062q;
import X.C1618440sDa;
import X.C1654320t9S;
import X.C1664590tQ1;
import X.C1664600tQ2;
import X.C1697810uHb;
import X.C19292410dm;
import X.C19719612Di;
import X.C1DRF;
import X.C1DRG;
import X.C201955140j;
import X.C20684815ws;
import X.C337180DJs;
import X.C418440Gaw;
import X.C427660Gpo;
import X.C427870Gq9;
import X.C537520L6g;
import X.C539960LFq;
import X.C566580MKa;
import X.C568160MQc;
import X.C568190MQf;
import X.C568200MQg;
import X.C568250MQl;
import X.C568340MQu;
import X.C568380MQy;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1455160nyE;
import X.InterfaceC1618460sDc;
import X.InterfaceC568180MQe;
import X.InterfaceC568220MQi;
import X.InterfaceC568260MQm;
import X.InterfaceC568270MQn;
import X.InterfaceC568290MQp;
import X.InterfaceC568300MQq;
import X.ViewOnLayoutChangeListenerC580890MqN;
import Y.ACListenerS143S0100000_8;
import Y.ARunnableS108S0100000_8;
import android.animation.Animator;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.als.FeatureAlsLogicContainer;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.model.AIGCInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.OnThisDayData;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.image.ui.ImageEditRootScene;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.services.onthisday.OnThisDayService;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoEditContainerScene;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday.OnThisDayCardPreviewScene;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes9.dex */
public class OnThisDayCardPreviewScene extends BaseOnThisDayPreviewScene implements InterfaceC1455160nyE {
    public static final /* synthetic */ int LLLLIIIILLL = 0;
    public View LLJL;
    public View LLJLIL;
    public View LLJLILLLLZIIL;
    public View LLJLL;
    public View LLJLLIL;
    public View LLJLLL;
    public View LLJZ;
    public C427870Gq9 LLJZIJLIL;
    public View LLL;
    public View LLLF;
    public Animator LLLFFI;
    public ViewOnLayoutChangeListenerC580890MqN LLLFZ;
    public ARunnableS108S0100000_8 LLLI;
    public boolean LLLII;
    public C0MMK LLLIIIIL;
    public InterfaceC568260MQm LLLIIL;
    public InterfaceC568300MQq LLLIILIL;
    public C0MRT LLLIL;
    public InterfaceC568270MQn LLLILZ;
    public int LLLILZJ;
    public C1DRG LLLJIL;
    public final boolean LLLJL;
    public InterfaceC568180MQe LLLL;
    public InterfaceC568290MQp LLLLII;
    public final C568340MQu LLLFF = new Object() { // from class: X.0MQu
    };
    public final ArrayList<ForwardMedia> LLLIIII = new ArrayList<>();
    public final C568190MQf LLLIIIL = new C568190MQf();
    public int LLLILZLLLI = 1;
    public final HashMap<Integer, C0MT7> LLLIZZ = new HashMap<>();
    public final HashMap<Integer, Integer> LLLJ = new HashMap<>();

    @Override // X.AbstractC214814194y
    public final boolean LLLLIILL() {
        return true;
    }

    public void LLLLLIL(C539960LFq c539960LFq) {
    }

    public void LLLLLLL(C1DRF c1drf) {
    }

    @Override // X.InterfaceC1455160nyE
    public final void LLJL() {
        InterfaceC568180MQe interfaceC568180MQe = this.LLLL;
        if (interfaceC568180MQe != null) {
            interfaceC568180MQe.LLJL();
        }
    }

    public final void LLLLLILLIL() {
        Animator animator;
        Animator animator2 = this.LLLFFI;
        if (animator2 == null || !animator2.isRunning() || (animator = this.LLLFFI) == null) {
            return;
        }
        animator.cancel();
    }

    public final void LLLLLJIL() {
        ForwardMedia forwardMediaLLLLLL;
        C0MMK c0mmk;
        MediaModel mediaModel;
        String str;
        InterfaceC568220MQi interfaceC568220MQi;
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        if (creativeToolsPluginService == null || !creativeToolsPluginService.LIZJ(requireSceneContext(), "on_this_day", true) || (forwardMediaLLLLLL = LLLLLL()) == null) {
            return;
        }
        C0ML5 c0ml5 = C0ML5.LIZ;
        Context contextRequireSceneContext = requireSceneContext();
        String enterFrom = this.LLJJJIL.getEnterFrom();
        c0ml5.getClass();
        if (C0ML5.LIZIZ(contextRequireSceneContext, forwardMediaLLLLLL, enterFrom) || (c0mmk = this.LLLIIIIL) == null) {
            return;
        }
        AbstractC568240MQk abstractC568240MQkLLLLLLIL = LLLLLLIL();
        if (abstractC568240MQkLLLLLLIL != null && (interfaceC568220MQi = abstractC568240MQkLLLLLLIL.LLJJJJLIIL) != null) {
            interfaceC568220MQi.rg2();
        }
        AIGCInfo aIGCInfo = this.LLJJJIL.creativeModel.privacySettingModel.aigcInfo;
        aIGCInfo.manualChangeSwitch = aIGCInfo.AIGCLabelType < 2;
        LLLLLLZZ();
        OnThisDayData onThisDayData = this.LLJJJIL.creativeModel.onThisDayData;
        ForwardMedia forwardMediaLLLLLL2 = LLLLLL();
        onThisDayData.setLeftWay("on_this_day_slider_edit");
        onThisDayData.setLocalMediaMimeType((forwardMediaLLLLLL2 == null || (mediaModel = forwardMediaLLLLLL2.localMedia) == null || (str = mediaModel.mimeType) == null) ? new ArrayList<>() : C1697810uHb.LJ(str));
        onThisDayData.setClickNextButtonTime(0L);
        String str2 = C566580MKa.LIZ(forwardMediaLLLLLL).LIZIZ.musicSelectedFrom;
        if (str2 != null) {
            onThisDayData.setMusicSelectedFromV2(str2);
        }
        onThisDayData.setMoveMusicToTop(false);
        onThisDayData.setDisableAutoSelectMusicInEditing(forwardMediaLLLLLL.disableAutoSelectMusicInEditing);
        MusicBuzModel musicBuzModel = this.LLJJJIL.creativeModel.musicBuzModel;
        if (musicBuzModel.music != null) {
            musicBuzModel.musicOrigin = onThisDayData.getMusicSelectedFromV2();
        }
        C0MKJ c0mkj = C0MKJ.LIZ;
        Context contextRequireSceneContext2 = requireSceneContext();
        VideoPublishEditModel videoPublishEditModel = this.LLJJJIL;
        c0mkj.getClass();
        C0MKJ.LJIIJ(contextRequireSceneContext2, forwardMediaLLLLLL, c0mmk, videoPublishEditModel);
    }

    public final ForwardMedia LLLLLL() {
        ArrayList<ForwardMedia> arrayList = this.LLLIIII;
        ViewPager viewPager = this.LLJJIJIL;
        return (ForwardMedia) C13LP.LJJJLZIJ(viewPager != null ? viewPager.getCurrentItem() : 0, arrayList);
    }

    public final AbstractC568240MQk LLLLLLIL() {
        ViewPager viewPager = this.LLJJIJIL;
        if (viewPager == null) {
            return null;
        }
        return LLLLLLJ(viewPager.getCurrentItem());
    }

    public final void LLLLLLLLL() {
        View view = this.LLJLILLLLZIIL;
        if (view == null || view.getVisibility() != 0) {
            C201955140j.LIZLLL(C1429810nJL.LIZIZ, "OnThisDayCardPreviewScene", "styleSwitchToPublishButtons");
            LLLLLILLIL();
            this.LLLFFI = C568380MQy.LIZ(null, this.LLJLILLLLZIIL);
            InterfaceC568300MQq interfaceC568300MQq = this.LLLIILIL;
            if (interfaceC568300MQq != null) {
                interfaceC568300MQq.HV0();
            }
        }
    }

    public final void LLLLLLLLLL() {
        View view = this.LLJLILLLLZIIL;
        if (view == null || view.getVisibility() != 8) {
            C201955140j.LIZLLL(C1429810nJL.LIZIZ, "OnThisDayCardPreviewScene", "styleSwitchToRecallMediaButtons");
            LLLLLILLIL();
            this.LLLFFI = C568380MQy.LIZ(this.LLJLILLLLZIIL, null);
            InterfaceC568300MQq interfaceC568300MQq = this.LLLIILIL;
            if (interfaceC568300MQq != null) {
                interfaceC568300MQq.HD0();
            }
        }
    }

    public final void LLLLLLZ() {
        if (this.LLLII) {
            C0ML5.LIZ.getClass();
            if (C0ML5.LIZ()) {
                View view = this.LLJLL;
                if (view != null) {
                    C786410Ut5.LJLLLLLL(0, view);
                }
            } else {
                View view2 = this.LLJLL;
                if (view2 != null) {
                    C786410Ut5.LJLLLLLL(4, view2);
                }
            }
            if (this.LLLIIII.isEmpty()) {
                View view3 = this.LLJLL;
                if (view3 != null) {
                    C786410Ut5.T4(view3, 0.5f);
                }
                View view4 = this.LLJLLIL;
                if (view4 != null) {
                    C786410Ut5.T4(view4, 0.5f);
                    return;
                }
                return;
            }
            View view5 = this.LLJLL;
            if (view5 != null) {
                C786410Ut5.T4(view5, 1.0f);
            }
            View view6 = this.LLJLLIL;
            if (view6 != null) {
                C786410Ut5.T4(view6, 1.0f);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041 A[PHI: r1
      0x0041: PHI (r1v1 int) = (r1v0 int), (r1v4 int), (r1v4 int) binds: [B:21:0x003e, B:8:0x0016, B:9:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLLLLZZ() {
        /*
            r5 = this;
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r5.LLJJJIL
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r0.creativeModel
            com.ss.android.ugc.aweme.creative.model.OnThisDayData r4 = r0.onThisDayData
            com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia r3 = r5.LLLLLL()
            r2 = 1
            if (r3 == 0) goto L3d
            boolean r0 = r3.isStory()
            if (r0 != r2) goto L3d
            r1 = 1
        L14:
            com.ss.android.ugc.aweme.mediachoose.helper.MediaModel r0 = r3.localMedia
            if (r0 != 0) goto L41
            if (r1 != 0) goto L41
            r0 = 1
        L1b:
            r4.setPostCnt(r0)
            r4.setStoryCnt(r1)
            if (r3 == 0) goto L3b
            com.ss.android.ugc.aweme.mediachoose.helper.MediaModel r0 = r3.localMedia
            if (r0 == 0) goto L3b
        L27:
            r4.setLocalCnt(r2)
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r5.LLJJJIL
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r0.creativeModel
            com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel r1 = r0.musicBuzModel
            com.ss.android.ugc.aweme.creative.model.music.MusicObject r0 = r1.music
            if (r0 == 0) goto L3a
            java.lang.String r0 = r4.getMusicSelectedFromV2()
            r1.musicOrigin = r0
        L3a:
            return
        L3b:
            r2 = 0
            goto L27
        L3d:
            r1 = 0
            if (r3 == 0) goto L41
            goto L14
        L41:
            r0 = 0
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday.OnThisDayCardPreviewScene.LLLLLLZZ():void");
    }

    @Override // X.AbstractC214814194y, X.AbstractC1447660nm8, com.bytedance.scene.Scene
    public final void onDestroyView() {
        ViewPager viewPager;
        ViewPager viewPager2;
        ARunnableS108S0100000_8 aRunnableS108S0100000_8 = this.LLLI;
        if (aRunnableS108S0100000_8 != null && (viewPager2 = this.LLJJIJIL) != null) {
            HandlerHook.viewRemoveCallbacks(viewPager2, aRunnableS108S0100000_8);
        }
        this.LLLI = null;
        ViewOnLayoutChangeListenerC580890MqN viewOnLayoutChangeListenerC580890MqN = this.LLLFZ;
        if (viewOnLayoutChangeListenerC580890MqN != null && (viewPager = this.LLJJIJIL) != null) {
            viewPager.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC580890MqN);
        }
        this.LLLFZ = null;
        super.onDestroyView();
        LLLLLILLIL();
        C0ML7.LIZ.getClass();
        C0ML7.LIZIZ = "has_post";
    }

    @Override // X.InterfaceC1455160nyE
    public final void t3() {
        InterfaceC568180MQe interfaceC568180MQe = this.LLLL;
        if (interfaceC568180MQe != null) {
            interfaceC568180MQe.t3();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0MQu] */
    public OnThisDayCardPreviewScene() {
        this.LLLJL = ((Number) C0BDU.LIZ.getValue()).intValue() == 2;
        LLLLJ(AFwS239S0000000_8.get$arr$(202));
    }

    public final void LLLLLLLZIL() {
        List<PhotoModeImageUrlModel> imageList;
        ForwardMedia forwardMediaLLLLLL = LLLLLL();
        if (forwardMediaLLLLLL == null) {
            return;
        }
        PhotoModeImageInfo photoModeImageInfo = forwardMediaLLLLLL.photoModeImageInfo;
        if (((photoModeImageInfo == null || (imageList = photoModeImageInfo.getImageList()) == null) ? 0 : imageList.size()) > 1) {
            this.LLJJJIL.setCreationMode(2);
        } else {
            this.LLJJJIL.setCreationMode(1);
        }
    }

    @Override // com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday.BaseOnThisDayPreviewScene, X.AbstractC214814194y, com.bytedance.scene.Scene
    public final void onResume() {
        super.onResume();
        AbstractC568240MQk abstractC568240MQkLLLLLLIL = LLLLLLIL();
        if (abstractC568240MQkLLLLLLIL != null) {
            abstractC568240MQkLLLLLLIL.LLLLIIIILLL(true);
        }
        C0ML5.LIZ.getClass();
        if (C0ML5.LIZ() || !(this instanceof CreationOnThisDayPreviewScene)) {
            return;
        }
        ArrayList<ForwardMedia> arrayList = this.LLLIIII;
        if ((arrayList instanceof Collection) && arrayList.isEmpty()) {
            return;
        }
        Iterator<ForwardMedia> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            if (it2.next().localMedia != null) {
                C201955140j.LIZLLL(C1429810nJL.LIZIZ, "OnThisDayCardPreviewScene", "permission change from YES to NO");
                C19719612Di.LJJIIJ(this.LLLIIII, AFwS239S0000000_8.get$arr$(203), true);
                InterfaceC568270MQn interfaceC568270MQn = this.LLLILZ;
                if (interfaceC568270MQn != null) {
                    interfaceC568270MQn.xU();
                }
                C1440005kM.LIZ(new C568250MQl(1));
                return;
            }
        }
    }

    @Override // X.AbstractC214814194y
    public final void onEnterAnimationComplete() {
        super.onEnterAnimationComplete();
    }

    public final int LLLLLJLJLL(int i) {
        PhotoModeImageInfo photoModeImageInfo;
        List<PhotoModeImageUrlModel> imageList;
        ForwardMedia forwardMedia = (ForwardMedia) C13LP.LJJJLZIJ(i, this.LLLIIII);
        if (forwardMedia == null || (photoModeImageInfo = forwardMedia.photoModeImageInfo) == null || (imageList = photoModeImageInfo.getImageList()) == null || imageList.size() <= 1) {
            return 1;
        }
        return 2;
    }

    public final AbstractC568240MQk LLLLLLJ(int i) {
        Object objLJJI;
        ViewPager viewPager = this.LLJJIJIL;
        if (viewPager == null) {
            return null;
        }
        PagerAdapter adapter = viewPager.getAdapter();
        if (adapter != null) {
            objLJJI = adapter.LJJI(i, viewPager);
        } else {
            objLJJI = null;
        }
        if (!(objLJJI instanceof AbstractC568240MQk)) {
            return null;
        }
        return (AbstractC568240MQk) objLJJI;
    }

    @Override // com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday.BaseOnThisDayPreviewScene, X.AbstractC214814194y, com.bytedance.scene.Scene
    public void onActivityCreated(Bundle bundle) {
        Serializable serializable;
        Serializable serializable2;
        ArrayList arrayList;
        Serializable serializable3;
        C0MMK c0mmk;
        CreativeInfo creativeInfo;
        String str;
        String string;
        C427870Gq9 c427870Gq9;
        Number numberValueOf;
        UrlModel avatarThumb;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        RelativeLayout.LayoutParams layoutParams2;
        ShortVideoContext shortVideoContext;
        ArrayList arrayList2;
        String string2;
        super.onActivityCreated(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null && (string2 = bundle2.getString("on_this_day_enter_method")) != null) {
            C0ML7.LIZ.getClass();
            C0ML7.LIZIZ = string2;
            this.LLLII = Intrinsics.LJFF(string2, "album_authorize");
        }
        disableSupportRestore();
        Bundle bundle3 = this.mArguments;
        ViewGroup.LayoutParams layoutParams3 = null;
        if (bundle3 != null) {
            serializable = bundle3.getSerializable("forward_media_list");
        } else {
            serializable = null;
        }
        if ((serializable instanceof ArrayList) && (arrayList2 = (ArrayList) serializable) != null) {
            this.LLLIIII.addAll(arrayList2);
        }
        Bundle bundle4 = this.mArguments;
        if (bundle4 != null) {
            serializable2 = bundle4.getSerializable("local_media_list");
        } else {
            serializable2 = null;
        }
        if (serializable2 instanceof ArrayList) {
            arrayList = (ArrayList) serializable2;
        } else {
            arrayList = null;
        }
        final int i = 0;
        if (arrayList != null) {
            C0ML5.LIZ.getClass();
            if (!C0ML5.LIZ()) {
                Bundle bundle5 = this.mArguments;
                if (bundle5 != null) {
                    bundle5.putBoolean("has_scanned_album", false);
                }
            } else {
                InterfaceC1618460sDc interfaceC1618460sDcLJIJJLI = C1618440sDa.LIZIZ.LJIJJLI();
                ArrayList<ForwardMedia> arrayList3 = this.LLLIIII;
                ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(interfaceC1618460sDcLJIJJLI.LJIJJLI((MediaModel) it2.next()));
                }
                arrayList3.addAll(arrayList4);
            }
        }
        Bundle bundle6 = this.mArguments;
        if (bundle6 != null) {
            serializable3 = bundle6.getSerializable("forward_config");
        } else {
            serializable3 = null;
        }
        if (serializable3 instanceof C0MMK) {
            c0mmk = (C0MMK) serializable3;
        } else {
            c0mmk = null;
        }
        this.LLLIIIIL = c0mmk;
        VideoPublishEditModel videoPublishEditModel = this.LLJJJIL;
        Bundle bundle7 = this.mArguments;
        if (bundle7 != null) {
            creativeInfo = C537520L6g.LIZIZ(bundle7);
        } else {
            creativeInfo = videoPublishEditModel.getCreativeInfo();
        }
        videoPublishEditModel.setCreativeInfo(creativeInfo);
        VideoPublishEditModel videoPublishEditModel2 = this.LLJJJIL;
        videoPublishEditModel2.mShootWay = "on_this_day";
        String str2 = "story_archive";
        if (Intrinsics.LJFF(this.LLJJL, "story_archive")) {
            str = "story_archive";
        } else {
            str = "on_this_day_page";
        }
        videoPublishEditModel2.setEnterFrom(str);
        VideoPublishEditModel videoPublishEditModel3 = this.LLJJJIL;
        if (!Intrinsics.LJFF(this.LLJJL, "story_archive")) {
            str2 = "";
        }
        videoPublishEditModel3.setShootEnterMethod(str2);
        Bundle bundle8 = this.mArguments;
        if (bundle8 != null) {
            Object objCreateShortVideoContext = ((OnThisDayService) ServiceManager.get().getService(OnThisDayService.class)).createShortVideoContext(bundle8);
            if (objCreateShortVideoContext instanceof ShortVideoContext) {
                shortVideoContext = (ShortVideoContext) objCreateShortVideoContext;
            } else {
                shortVideoContext = null;
            }
            this.LLJJJJ = shortVideoContext;
            if (shortVideoContext != null) {
                shortVideoContext.creativeModel = this.LLJJJIL.creativeModel;
                shortVideoContext.creativeInfo = this.LLJJJIL.getCreativeInfo();
            }
            ShortVideoContext shortVideoContext2 = this.LLJJJJ;
            if (shortVideoContext2 != null) {
                shortVideoContext2.shootWay = "on_this_day";
            }
        }
        OnThisDayData onThisDayData = this.LLJJJIL.creativeModel.onThisDayData;
        onThisDayData.setInOnThisDayPreviewPage(true);
        onThisDayData.setFromOnThisDay(true);
        onThisDayData.setShouldSkipMusicEnd(true);
        onThisDayData.setCelebrationType(this.LLJJJJJIL);
        onThisDayData.setVersion(1);
        C0ML7.LIZ.getClass();
        onThisDayData.setEnterMethod(C0ML7.LIZIZ);
        Bundle bundle9 = this.mArguments;
        if (bundle9 != null) {
            string = bundle9.getString("on_this_day_enter_type");
        } else {
            string = null;
        }
        onThisDayData.setEnterType(string);
        C1654320t9S.LIZIZ(this, AFwS239S0000000_8.get$arr$(14));
        C1664590tQ1.LIZLLL(this, "OnThisDayCardPreviewScene", false, new AwS587S0100000_8(this, 16), 2);
        C1664600tQ2.LIZ(this, "OnThisDayCardPreviewScene", new AwS587S0100000_8(this, 22));
        C1DRG c1drg = ((FeatureAlsLogicContainer) C1664600tQ2.LJ(this)).LLJJI;
        if (c1drg != null) {
            this.LLLIIL = (InterfaceC568260MQm) c1drg.LJII(InterfaceC568260MQm.class, null);
            this.LLLIL = (C0MRT) c1drg.LJII(C0MRT.class, null);
            this.LLLILZ = (InterfaceC568270MQn) c1drg.LJIIL(null, InterfaceC568270MQn.class);
            this.LLLL = (InterfaceC568180MQe) c1drg.LJIIL(null, InterfaceC568180MQe.class);
            this.LLLLII = (InterfaceC568290MQp) c1drg.LJIIL(null, InterfaceC568290MQp.class);
            this.LLLIILIL = (InterfaceC568300MQq) c1drg.LJIIL(null, InterfaceC568300MQq.class);
        } else {
            c1drg = null;
        }
        this.LLLJIL = c1drg;
        super.LLLLL();
        View viewFindViewById = findViewById(R.id.z9c);
        this.LLJZ = viewFindViewById;
        if (viewFindViewById != null) {
            C786410Ut5.I7(new ACListenerS143S0100000_8(this, 6), viewFindViewById);
        }
        View viewFindViewById2 = findViewById(R.id.zzh);
        this.LLJLLL = viewFindViewById2;
        if (viewFindViewById2 != null) {
            C786410Ut5.I7(new ACListenerS143S0100000_8(this, 7), viewFindViewById2);
        }
        this.LLL = findViewById(R.id.uuu);
        this.LLLF = findViewById(R.id.ott);
        this.LLJLL = findViewById(R.id.ccd);
        this.LLJLLIL = findViewById(R.id.y_b);
        this.LLJLILLLLZIIL = findViewById(R.id.ceb);
        LLLLLLZ();
        if (this.LLLJL && this.LLJJJJJIL != 0) {
            ViewPager viewPager = this.LLJJIJIL;
            if (viewPager != null) {
                layoutParams = viewPager.getLayoutParams();
            } else {
                layoutParams = null;
            }
            if ((layoutParams instanceof RelativeLayout.LayoutParams) && (layoutParams2 = (RelativeLayout.LayoutParams) layoutParams) != null) {
                layoutParams2.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44));
                layoutParams2.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(110));
            }
            View view = this.LLJLILLLLZIIL;
            if (view != null) {
                C786410Ut5.LJLLLLLL(8, view);
            }
            View viewFindViewById3 = findViewById(R.id.ced);
            this.LLJLILLLLZIIL = viewFindViewById3;
            if (viewFindViewById3 != null) {
                C786410Ut5.LJLLLLLL(0, viewFindViewById3);
            }
            this.LLJZIJLIL = (C427870Gq9) requireViewById(R.id.l9i);
            this.LLJL = findViewById(R.id.sgs);
            this.LLJLIL = requireViewById(R.id.sha);
            C1428640nHS.LIZ.getClass();
            if (!C1428640nHS.LIZIZ()) {
                View view2 = this.LLJLIL;
                if (view2 != null) {
                    C786410Ut5.LJLLLLLL(8, view2);
                }
                View view3 = this.LLJL;
                if (view3 != null) {
                    layoutParams3 = view3.getLayoutParams();
                }
                if ((layoutParams3 instanceof LinearLayout.LayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3) != null) {
                    marginLayoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
                    marginLayoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
                }
            }
            ((C0GTR) requireViewById(R.id.bhv)).setRingWidth(C418440Gaw.LIZIZ(Double.valueOf(1.5d)));
        } else {
            if (!C0MQ1.LJFF(this.LLJJJJJIL) && !C0MQO.LIZ()) {
                c427870Gq9 = (C427870Gq9) requireViewById(R.id.l9h);
            } else {
                C337180DJs.LIZ(requireViewById(R.id.l9h));
                c427870Gq9 = (C427870Gq9) requireViewById(R.id.l9x);
            }
            this.LLJZIJLIL = c427870Gq9;
            if (c427870Gq9 != null) {
                C786410Ut5.LJLLLLLL(0, c427870Gq9);
            }
            this.LLJL = requireViewById(R.id.sgp);
            this.LLJLIL = requireViewById(R.id.sh_);
            C0GTR c0gtr = (C0GTR) requireViewById(R.id.bhu);
            if (C0MQO.LIZ()) {
                numberValueOf = Double.valueOf(2.5d);
            } else {
                numberValueOf = 2;
            }
            c0gtr.setRingWidth(C418440Gaw.LIZIZ(numberValueOf));
            C1428640nHS.LIZ.getClass();
            if (!C1428640nHS.LIZIZ()) {
                View viewFindViewById4 = findViewById(R.id.w8z);
                if (viewFindViewById4 != null) {
                    C786410Ut5.LJLLLLLL(8, viewFindViewById4);
                }
                View viewFindViewById5 = findViewById(R.id.i_n);
                if (viewFindViewById5 != null) {
                    C786410Ut5.LJLLLLLL(0, viewFindViewById5);
                }
                View viewFindViewById6 = findViewById(R.id.cv6);
                if (viewFindViewById6 != null) {
                    C786410Ut5.I7(new ACListenerS143S0100000_8(this, 5), viewFindViewById6);
                }
            }
        }
        View viewFindViewById7 = findViewById(R.id.bmy);
        this.LLJJJ = viewFindViewById7;
        if (viewFindViewById7 != null) {
            C786410Ut5.I7(new ACListenerS143S0100000_8(this, 8), viewFindViewById7);
        }
        C786410Ut5.I7(new ACListenerS143S0100000_8(this, 9), requireViewById(R.id.uuu));
        View viewFindViewById8 = findViewById(R.id.cpt);
        if (viewFindViewById8 != null) {
            C786410Ut5.I7(new ACListenerS143S0100000_8(this, 10), viewFindViewById8);
        }
        View view4 = this.LLJLIL;
        if (view4 != null) {
            C786410Ut5.I7(new ACListenerS143S0100000_8(this, 3), view4);
        }
        View view5 = this.LLJL;
        if (view5 != null) {
            C786410Ut5.I7(new ACListenerS143S0100000_8(this, 4), view5);
        }
        C19292410dm currentUser = C0CHQ.LIZ().getAccountService().getCurrentUser();
        if (currentUser != null && (avatarThumb = currentUser.getAvatarThumb()) != null) {
            C427870Gq9 c427870Gq92 = this.LLJZIJLIL;
            if (c427870Gq92 instanceof C427660Gpo) {
                C427660Gpo.LJIIJJI((C427660Gpo) c427870Gq92, new C03IT(avatarThumb.getUrlList()), false, null, null, false, false, null, null, false, null, 990);
            } else {
                C1324750kZt.LJI(c427870Gq92, avatarThumb, -1, -1);
            }
        }
        HandlerHook.viewPost(this.mView, new ARunnableS108S0100000_8(this, 0));
        View viewFindViewById9 = findViewById(R.id.view_all);
        if (viewFindViewById9 != null) {
            C1378990lzN.LIZIZ(viewFindViewById9, Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(17))), null, null, null, null, 30);
            if (this.LLJJJJJIL != 0) {
                i = 1;
            }
            C786410Ut5.I7(new View.OnClickListener() { // from class: X.0MQb
                @Override // android.view.View.OnClickListener
                public final void onClick(View view6) {
                    ViewPager viewPager2;
                    int currentItem;
                    InterfaceC568220MQi interfaceC568220MQi;
                    if (this.LL.LLLIIII.isEmpty() || (viewPager2 = this.LL.LLJJIJIL) == null) {
                        return;
                    }
                    if (viewPager2.getCurrentItem() >= this.LL.LLLIIII.size()) {
                        currentItem = viewPager2.getCurrentItem() - 1;
                    } else {
                        currentItem = viewPager2.getCurrentItem();
                    }
                    AbstractC568240MQk abstractC568240MQkLLLLLLJ = this.LL.LLLLLLJ(currentItem);
                    if (abstractC568240MQkLLLLLLJ != null && (interfaceC568220MQi = abstractC568240MQkLLLLLLJ.LLJJJJLIIL) != null) {
                        interfaceC568220MQi.rg2();
                    }
                    OnThisDayService onThisDayService = (OnThisDayService) ServiceManager.get().getService(OnThisDayService.class);
                    OnThisDayCardPreviewScene onThisDayCardPreviewScene = this.LL;
                    ArrayList<ForwardMedia> arrayList5 = onThisDayCardPreviewScene.LLLIIII;
                    ArrayList arrayList6 = new ArrayList();
                    ForwardMedia forwardMediaLLLLLL = this.LL.LLLLLL();
                    if (forwardMediaLLLLLL != null) {
                        arrayList6.add(forwardMediaLLLLLL);
                    }
                    OnThisDayCardPreviewScene onThisDayCardPreviewScene2 = this.LL;
                    OnThisDayService.DefaultImpls.startMaterialSelectScene$default(onThisDayService, onThisDayCardPreviewScene, arrayList5, arrayList6, onThisDayCardPreviewScene2.LLLIIIIL, onThisDayCardPreviewScene2.LLJJJJ, i, null, onThisDayCardPreviewScene2.LLJJJJJIL, 64, null);
                }
            }, viewFindViewById9);
        }
        ForwardMedia forwardMedia = (ForwardMedia) C13LP.LJJJLL(this.LLLIIII);
        if (forwardMedia != null) {
            ((IAVServiceProxy) ServiceManager.get().getService(IAVServiceProxy.class)).getStoryService().LJIIIIZZ(forwardMedia.pastMemoryKey);
        }
        int i2 = 0;
        long j = 0;
        this.LLJJJIL.setEditPreviewInfo(new EditPreviewInfo(new ArrayList(), i2, i2, j, j, "", 30, null));
        EditPreviewInfo editPreviewInfo = this.LLJJJIL.getEditPreviewInfo();
        if (editPreviewInfo != null) {
            editPreviewInfo.setPreviewVideoLength(15000);
        }
        LLLLLLLZIL();
        this.LLLILZLLLI = this.LLJJJIL.getCreationMode();
        C0MLE.LIZIZ(C0MLE.LIZ, this.LLJJJIL, this.LLJJJJJIL, this.LLJJJJLIIL, 2, Intrinsics.LJFF(this.LLJJL, "out_push"), null, null, null, 224);
        this.LLLIIIL.LIZJ.LIZLLL(AFwS229S0000000_2.get$arr$(733), true);
        C0FJP.LIZIZ();
        C1438580nXU c1438580nXU = C1438580nXU.LIZ;
        VideoPublishEditModel videoPublishEditModel4 = this.LLJJJIL;
        c1438580nXU.getClass();
        C1438580nXU.LIZIZ(videoPublishEditModel4);
        VideoPublishEditModel videoPublishEditModel5 = this.LLJJJIL;
        ForwardMedia forwardMedia2 = (ForwardMedia) C13LP.LJJJLL(this.LLLIIII);
        if (forwardMedia2 != null) {
            videoPublishEditModel5.creativeModel.privacySettingModel.aigcInfo.AIGCLabelType = forwardMedia2.originVideoAIGCLabelType;
        }
        C0ML6 c0ml6 = C0ML6.LIZ;
        long jCurrentTimeMillis = System.currentTimeMillis();
        c0ml6.getClass();
        C0ML6.LIZ().storeLong("key_last_click_low_activity_time", jCurrentTimeMillis);
        VideoPublishEditModel videoPublishEditModel6 = this.LLJJJIL;
        ArrayList<ForwardMedia> arrayList5 = this.LLLIIII;
        C0LAB c0lab = new C0LAB();
        C0ML7.LIZIZ(videoPublishEditModel6, c0lab);
        C0ML7.LJI(c0lab, arrayList5, videoPublishEditModel6.creativeModel);
        C0ML9.LIZIZ(videoPublishEditModel6.creativeModel, c0lab);
        c0lab.LJ("enter_method", C0ML7.LIZIZ);
        C0ML7.LJ(c0lab, arrayList5);
        C20684815ws.LJIILLIIL("enter_on_this_day_page", c0lab.LIZ);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onEvent(C568250MQl c568250MQl) {
        C568160MQc c568160MQc;
        int count;
        AbstractC568240MQk abstractC568240MQkLLLLLLJ;
        View view;
        AbstractC568240MQk abstractC568240MQkLLLLLLJ2;
        View view2;
        View view3;
        InterfaceC568290MQp interfaceC568290MQp;
        ViewPager viewPager = this.LLJJIJIL;
        if (viewPager == null) {
            return;
        }
        PagerAdapter adapter = viewPager.getAdapter();
        if (adapter instanceof C568160MQc) {
            c568160MQc = (C568160MQc) adapter;
        } else {
            c568160MQc = null;
        }
        LLLLLLZ();
        if (c568250MQl.LIZ == 1) {
            if (c568160MQc != null && (c568160MQc.LLILZIL instanceof CreationOnThisDayPreviewScene)) {
                c568160MQc.LLJILLL = true;
            }
            LLLLLLLLL();
            C12WG.LIZJ(this, new ARunnableS108S0100000_8(this, 82));
        }
        if (c568160MQc != null) {
            c568160MQc.LJJIZ(this.LLLIIII, this.LLLII);
        }
        if (c568250MQl.LIZ != 0 && (interfaceC568290MQp = this.LLLLII) != null) {
            interfaceC568290MQp.em1(LLLLLLIL());
        }
        C568200MQg c568200MQg = new C568200MQg();
        AbstractC568240MQk abstractC568240MQkLLLLLLIL = LLLLLLIL();
        if (abstractC568240MQkLLLLLLIL != null && (view3 = abstractC568240MQkLLLLLLIL.mView) != null) {
            c568200MQg.LIZ(view3, 0.0f);
        }
        if (viewPager.getCurrentItem() - 1 >= 0 && (abstractC568240MQkLLLLLLJ2 = LLLLLLJ(viewPager.getCurrentItem() - 1)) != null && (view2 = abstractC568240MQkLLLLLLJ2.mView) != null) {
            c568200MQg.LIZ(view2, -1.0f);
        }
        int currentItem = viewPager.getCurrentItem() + 1;
        PagerAdapter adapter2 = viewPager.getAdapter();
        if (adapter2 != null) {
            count = adapter2.getCount();
        } else {
            count = 0;
        }
        if (currentItem < count && (abstractC568240MQkLLLLLLJ = LLLLLLJ(viewPager.getCurrentItem() + 1)) != null && (view = abstractC568240MQkLLLLLLJ.mView) != null) {
            c568200MQg.LIZ(view, 1.0f);
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onEvent(C0MT8 c0mt8) {
        if (!Intrinsics.LJFF(c0mt8.LJIIJ, ImageEditRootScene.class) && !Intrinsics.LJFF(c0mt8.LJIIJ, VideoEditContainerScene.class)) {
            return;
        }
        Class<?> materialSelectSceneClass = ((OnThisDayService) ServiceManager.get().getService(OnThisDayService.class)).getMaterialSelectSceneClass();
        Iterator<Scene> it2 = C1447800nmM.LIZIZ(this).getSceneList().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Scene next = it2.next();
            if (Intrinsics.LJFF(next.getClass(), materialSelectSceneClass)) {
                if (next != null) {
                    return;
                }
            }
        }
        c0mt8.LIZ(this.LLJJJIL);
    }

    @Override // X.InterfaceC1455160nyE
    public final void Q4(String str, int i, int i2, int i3, boolean z) {
        InterfaceC568180MQe interfaceC568180MQe = this.LLLL;
        if (interfaceC568180MQe != null) {
            interfaceC568180MQe.Q4(str, i, i2, i3, z);
        }
    }
}
