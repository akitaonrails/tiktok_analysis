package com.ss.android.ugc.aweme.texttoimage.choose;

import X.C01GW;
import X.C0CHQ;
import X.C0LIV;
import X.C0MGE;
import X.C0MT6;
import X.C0MUK;
import X.C123100dR;
import X.C13LP;
import X.C1403010mc7;
import X.C1403470mcr;
import X.C1421540n60;
import X.C1441340nbw;
import X.C1450870nrJ;
import X.C1451800nso;
import X.C1452730nuJ;
import X.C1454870nxl;
import X.C1456140nzo;
import X.C1456890o11;
import X.C1456940o16;
import X.C1459050o4V;
import X.C1459720o5a;
import X.C1460620o72;
import X.C14EU;
import X.C1654320t9S;
import X.C1664590tQ1;
import X.C1664600tQ2;
import X.C1766560w4U;
import X.C19740512Lj;
import X.C19EG;
import X.C1DRG;
import X.C201955140j;
import X.C293350Bef;
import X.C295010BhL;
import X.C295710BiT;
import X.C385670FAf;
import X.C418440Gaw;
import X.C452501pT;
import X.C560380LyO;
import X.C560470LyX;
import X.C572050Mc7;
import X.C572240McQ;
import X.C572250McR;
import X.C572850MdP;
import X.C786410Ut5;
import X.C814420VxA;
import X.C854840XgA;
import X.EnumC560450LyV;
import X.InterfaceC1431860nMe;
import X.InterfaceC1439070nYH;
import X.InterfaceC1439510nYz;
import X.InterfaceC1444410ngt;
import X.InterfaceC1452170ntP;
import X.InterfaceC1455160nyE;
import X.InterfaceC1456650o0d;
import X.InterfaceC1460000o62;
import X.InterfaceC572020Mc4;
import Y.AObjectS241S0100000_8;
import Y.AObserverS212S0100000_8;
import Y.AObserverS225S0100000_22;
import Y.AObserverS51S0210000_8;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.als.FeatureAlsLogicContainer;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene;
import com.ss.android.ugc.aweme.commerce.tools.mission.service.ICommerceToolsMissionService;
import com.ss.android.ugc.aweme.creative.model.edit.EditImageInfo;
import com.ss.android.ugc.aweme.creative.model.edit.EditSaveLocalModel;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.ImageSurfaceData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.creative.model.edit.SrcImageInfo;
import com.ss.android.ugc.aweme.creative.model.edit.TextImageTaskInfo;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.texttoimage.choose.TextToImageChooseScene;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AwS108S0110000_22;
import kotlin.jvm.internal.AwS126S0110000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes9.dex */
public final class TextToImageChooseScene extends BaseScreenAdaptScene implements C0MGE, InterfaceC1455160nyE {
    public C19740512Lj LLJJLIIIJLLLLLLLZ;
    public C1454870nxl LLJL;
    public InterfaceC1460000o62 LLJLIL;
    public C1441340nbw LLJLILLLLZIIL;
    public C572850MdP LLJLL;
    public C1459050o4V LLJLLIL;
    public C1421540n60 LLJLLL;
    public InterfaceC1444410ngt LLJZ;
    public InterfaceC1431860nMe LLJZIJLIL;
    public InterfaceC1439510nYz LLL;
    public boolean LLLF;
    public boolean LLLI;
    public final C01GW LLLIIIIL;
    public final C01GW LLJJL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 385));
    public final C01GW LLLFF = C452501pT.LIZIZ(new AwS552S0100000_8(this, 383));
    public final C01GW LLLFFI = C452501pT.LIZIZ(new AwS552S0100000_8(this, 384));
    public final C01GW LLLFZ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 387));
    public final C01GW LLLII = C452501pT.LIZIZ(new AwS552S0100000_8(this, 386));
    public final C01GW LLLIIII = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(207));

    @Override // X.AbstractC214814194y
    public final boolean LLLLIILL() {
        return true;
    }

    @Override // X.InterfaceC1455160nyE
    public final void Q4(String str, int i, int i2, int i3, boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene
    public final void S3(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene
    public final void nm() {
    }

    @Override // com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene
    public final void p2(boolean z) {
    }

    @Override // X.InterfaceC1455160nyE
    public final void LLJL() {
        MutableLiveData<C1452730nuJ> mutableLiveDataVW1;
        LiveData<Boolean> liveDataLy0;
        C572850MdP c572850MdP = this.LLJLL;
        if (c572850MdP == null || (liveDataLy0 = c572850MdP.ly0()) == null || !Intrinsics.LJFF(liveDataLy0.getValue(), Boolean.TRUE)) {
            C1441340nbw c1441340nbw = this.LLJLILLLLZIIL;
            if (c1441340nbw != null) {
                c1441340nbw.LLJL();
            }
            ((ICommerceToolsMissionService) ServiceManager.get().getService(ICommerceToolsMissionService.class)).LJIILL(this.mActivity, getEditModel());
            C1403470mcr.LJII(getEditModel(), null, 30);
            if (C0MT6.LIZ()) {
                C1403010mc7.LIZ.getMusicService().Tk();
                C1459050o4V c1459050o4V = this.LLJLLIL;
                if (c1459050o4V != null) {
                    c1459050o4V.LJJ(true);
                }
                C572850MdP c572850MdP2 = this.LLJLL;
                if (c572850MdP2 != null) {
                    C1456140nzo.LIZIZ(c572850MdP2, false, false, false, false, 12);
                    return;
                }
                return;
            }
            C572850MdP c572850MdP3 = this.LLJLL;
            if (c572850MdP3 != null && (mutableLiveDataVW1 = c572850MdP3.vW1()) != null) {
                mutableLiveDataVW1.setValue(C1452730nuJ.LIZJ());
            }
            C1454870nxl c1454870nxl = this.LLJL;
            if (c1454870nxl != null) {
                c1454870nxl.cr();
            }
            C1403470mcr.LJFF(getEditModel());
        }
    }

    public final InterfaceC572020Mc4 LLLLLL() {
        return (InterfaceC572020Mc4) this.LLLFFI.getValue();
    }

    public final VideoPublishEditModel getEditModel() {
        return (VideoPublishEditModel) this.LLJJL.getValue();
    }

    @Override // X.AbstractC214814194y, X.C198H
    public final boolean onBackPressed() {
        LiveData<Boolean> liveDataLy0;
        C572850MdP c572850MdP = this.LLJLL;
        if (!((c572850MdP == null || (liveDataLy0 = c572850MdP.ly0()) == null) ? false : Intrinsics.LJFF(liveDataLy0.getValue(), Boolean.TRUE))) {
            C572850MdP c572850MdP2 = this.LLJLL;
            if (c572850MdP2 != null) {
                C1456140nzo.LIZ(c572850MdP2, true, 2);
            }
            return true;
        }
        C572850MdP c572850MdP3 = this.LLJLL;
        if (c572850MdP3 != null) {
            c572850MdP3.iv();
        }
        finish();
        return true;
    }

    @Override // X.InterfaceC1455160nyE
    public final void t3() {
        C1403010mc7.LIZ.getMusicService().Tk();
        C1459050o4V c1459050o4V = this.LLJLLIL;
        if (c1459050o4V != null) {
            c1459050o4V.LJJ(false);
        }
    }

    public TextToImageChooseScene() {
        LLLLJ(AFwS239S0000000_8.get$arr$(136));
        disableSupportRestore();
        this.LLLIIIIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 382));
    }

    public final boolean LLLLLLIL() {
        String uri;
        TextImageTaskInfo textImageTaskInfoLIZJ = C572250McR.LIZJ(getEditModel().creativeModel.text2ImageModel);
        if (Intrinsics.LJFF(textImageTaskInfoLIZJ != null ? textImageTaskInfoLIZJ.getType() : null, C0LIV.AI.getType())) {
            return C123100dR.LIZ(textImageTaskInfoLIZJ.getFailReason()) || (uri = textImageTaskInfoLIZJ.getUri()) == null || uri.length() == 0;
        }
        return false;
    }

    public final void LLLLLLJ() {
        int i;
        LiveData<InterfaceC1452170ntP> liveDataG;
        List<SingleImageData> imageList;
        InterfaceC1439070nYH publishService = C0CHQ.LIZ().getPublishService();
        if (publishService.LJJLIIIJJIZ(getEditModel(), true)) {
            EditSaveLocalModel editSaveLocalModel = getEditModel().creativeModel.editSaveLocalModel;
            ImageAlbumData imageAlbumData = getEditModel().getImageAlbumData();
            if (imageAlbumData == null || (imageList = imageAlbumData.getImageList()) == null) {
                i = -1;
            } else {
                Iterator<SingleImageData> it2 = imageList.iterator();
                i = 0;
                while (it2.hasNext()) {
                    if (it2.next().isText2Image()) {
                        break;
                    } else {
                        i++;
                    }
                }
                i = -1;
            }
            editSaveLocalModel.imageModeSelectedItem = i;
            VideoPublishEditModel editModel = getEditModel();
            C572850MdP c572850MdP = this.LLJLL;
            publishService.LJIJI((c572850MdP == null || (liveDataG = c572850MdP.g()) == null) ? null : liveDataG.getValue(), editModel, getEditModel().hasInfoStickers());
        }
    }

    @Override // X.AbstractC214814194y, X.C198H
    public final void finish() {
        getEditModel().creativeModel.text2ImageModel.imageTaskList.clear();
        getEditModel().setImageAlbumData(null);
        Intent intent = new Intent();
        C0MUK.LJIIIZ(intent, getEditModel().creativeModel);
        setResult(0, intent);
        super.finish();
    }

    @Override // X.AbstractC214814194y, com.bytedance.scene.Scene
    public final void onPause() {
        super.onPause();
        C201955140j.LIZIZ("CreativeToolStayTimeMonitor", "TextToImageChooseScene onPause");
        C560380LyO.LJIIZILJ = EnumC560450LyV.EDIT;
    }

    @Override // com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene, X.AbstractC214814194y, com.bytedance.scene.Scene
    public final void onResume() {
        super.onResume();
        getEditModel().creativeModel.text2ImageModel.mobSubEditPageType = "text_style_edit_page";
        C572240McQ.LIZ.getClass();
        if (C572240McQ.LIZLLL == 0) {
            C572240McQ.LIZLLL = System.currentTimeMillis();
        }
        C201955140j.LIZIZ("CreativeToolStayTimeMonitor", "TextToImageChooseScene onResume");
        EnumC560450LyV enumC560450LyV = EnumC560450LyV.EDIT;
        C560380LyO.LJIIZILJ(enumC560450LyV, null, getEditModel());
        C560380LyO.LJIILLIIL(new C560470LyX(enumC560450LyV, System.currentTimeMillis()));
    }

    @Override // com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene, X.AbstractC214814194y, com.bytedance.scene.Scene
    public final void onStart() {
        super.onStart();
        TuxImmersionBar tuxImmersionBarLJ = C1766560w4U.LJ(requireFragmentActivity());
        tuxImmersionBarLJ.LIZIZ.LJIIL();
        tuxImmersionBarLJ.LJ(0);
        tuxImmersionBarLJ.LIZ(false);
        tuxImmersionBarLJ.LIZIZ.LJIIJ(true);
        tuxImmersionBarLJ.LIZJ(false, false);
        tuxImmersionBarLJ.LIZLLL();
    }

    @Override // X.AbstractC214814194y, com.bytedance.scene.Scene
    public final void onStop() {
        super.onStop();
        if (Intrinsics.LJFF(getEditModel().creativeModel.text2ImageModel.mobSubEditPageType, "text_style_edit_page")) {
            getEditModel().creativeModel.text2ImageModel.mobSubEditPageType = null;
        }
        C572240McQ.LJ += C572240McQ.LIZIZ > 0 ? System.currentTimeMillis() - C572240McQ.LIZIZ : 0L;
        C572240McQ.LIZLLL = 0L;
    }

    @Override // X.AbstractC214814194y
    public final void dispatchTouchEvent(MotionEvent motionEvent) {
        super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene, com.ss.android.ugc.aweme.adaptation.AbsSceneAdaptationScene, X.AbstractC214814194y, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        boolean z;
        int iLIZIZ;
        String uri;
        boolean z2;
        List<SingleImageData> imageList;
        C572850MdP c572850MdP;
        LiveData<C1456890o11> liveDataYh;
        C385670FAf<AVMusic> c385670FAfBq2;
        LiveData<Pair<Boolean, C1456940o16>> liveDataUp;
        LiveData<Boolean> liveDataS90;
        LiveData<Unit> liveDataOp;
        LiveData<Integer> liveDataWw;
        ImageSurfaceData surfaceData;
        ImageSurfaceData surfaceData2;
        super.onActivityCreated(bundle);
        C0CHQ.LIZ().LJJIZ();
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            z = bundle2.getBoolean("direct_to_choose");
        } else {
            z = false;
        }
        this.LLLI = z;
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.gpu);
        if (C293350Bef.LIZ()) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
        } else {
            iLIZIZ = 0;
        }
        this.LLJJLIIIJLLLLLLLZ = C1451800nso.LIZ(requireContext(), viewGroup, iLIZIZ, 8);
        if (getEditModel().getImageAlbumData() == null) {
            VideoPublishEditModel editModel = getEditModel();
            ImageAlbumData imageAlbumData = new ImageAlbumData(null, 0, false, null, 0, 0, null, null, null, null, false, false, false, false, false, false, false, false, null, 0, null, 2097151, null);
            imageAlbumData.setSinglePhotoUsingImageEditFramework(true);
            editModel.setImageAlbumData(imageAlbumData);
        }
        FrameLayout.LayoutParams layoutParamsLJII = C1450870nrJ.LJII();
        C1450870nrJ.LJIIJJI(layoutParamsLJII.width, layoutParamsLJII.height);
        ImageAlbumData imageAlbumData2 = getEditModel().getImageAlbumData();
        if (imageAlbumData2 != null && (surfaceData2 = imageAlbumData2.getSurfaceData()) != null) {
            surfaceData2.setSurfaceViewWidth(layoutParamsLJII.width);
        }
        ImageAlbumData imageAlbumData3 = getEditModel().getImageAlbumData();
        if (imageAlbumData3 != null && (surfaceData = imageAlbumData3.getSurfaceData()) != null) {
            surfaceData.setSurfaceViewHeight(layoutParamsLJII.height);
        }
        final boolean z3 = this.LLLI;
        C1654320t9S.LIZIZ(this, AFwS239S0000000_8.get$arr$(138));
        C1664590tQ1.LIZLLL(this, "TextToImageChooseScene", false, new AwS587S0100000_8(this, 298), 2);
        C1664600tQ2.LIZ(this, "TextToImageEditScene", new AwS108S0110000_22(this, z3, 5));
        C1DRG c1drg = ((FeatureAlsLogicContainer) C1664600tQ2.LJ(this)).LLJJI;
        if (c1drg != null) {
            InterfaceC1460000o62 interfaceC1460000o62 = (InterfaceC1460000o62) c1drg.LJIIL(null, InterfaceC1460000o62.class);
            if (interfaceC1460000o62 != null) {
                Iterator<Integer> it2 = C1460620o72.LJIILJJIL.iterator();
                while (it2.hasNext()) {
                    interfaceC1460000o62.rm(it2.next().intValue(), false);
                }
            }
            this.LLJLIL = (InterfaceC1460000o62) c1drg.LJII(InterfaceC1460000o62.class, null);
            if (C295010BhL.LIZ()) {
                this.LLJZ = (InterfaceC1444410ngt) c1drg.LJII(InterfaceC1444410ngt.class, null);
                this.LLJZIJLIL = (InterfaceC1431860nMe) c1drg.LJIIL(null, InterfaceC1431860nMe.class);
                this.LLL = (InterfaceC1439510nYz) c1drg.LJII(InterfaceC1439510nYz.class, null);
            }
            if (C295010BhL.LIZ()) {
                add(R.id.gsr, new C1459720o5a(c1drg), "TextToImageToolbarOptionsScene");
            }
            InterfaceC1460000o62 interfaceC1460000o622 = this.LLJLIL;
            if (interfaceC1460000o622 != null && (liveDataWw = interfaceC1460000o622.ww()) != null) {
                liveDataWw.observe(this, new AObserverS225S0100000_22(this, 63));
            }
            C572850MdP c572850MdP2 = this.LLJLL;
            if (c572850MdP2 != null && (liveDataOp = c572850MdP2.op()) != null) {
                liveDataOp.observe(this, new AObserverS212S0100000_8(this, 46));
            }
            C572850MdP c572850MdP3 = this.LLJLL;
            if (c572850MdP3 != null && (liveDataS90 = c572850MdP3.S90()) != null) {
                liveDataS90.observe(this, new AObserverS51S0210000_8(this, z3, c1drg, 0));
            }
            C572850MdP c572850MdP4 = this.LLJLL;
            if (c572850MdP4 != null && (liveDataUp = c572850MdP4.Up()) != null) {
                liveDataUp.observe(this, new Observer() { // from class: X.0Mc5
                    @Override // androidx.lifecycle.Observer
                    public final void onChanged(Object obj) {
                        View viewFindViewById;
                        LiveData<Boolean> liveDataLy0;
                        if (C07CI.LIZ() != 0) {
                            if (this.LL.LLLLLL().LIZLLL()) {
                                this.LL.LLLLLL().dismissDialog();
                                return;
                            }
                            C572850MdP c572850MdP5 = this.LL.LLJLL;
                            if (c572850MdP5 != null && (liveDataLy0 = c572850MdP5.ly0()) != null && Intrinsics.LJFF(liveDataLy0.getValue(), Boolean.TRUE)) {
                                C572850MdP c572850MdP6 = this.LL.LLJLL;
                                if (c572850MdP6 != null) {
                                    c572850MdP6.iv();
                                }
                                this.LL.finish();
                                return;
                            }
                            View view = this.LL.mView;
                            if (view == null || (viewFindViewById = view.findViewById(R.id.bmy)) == null) {
                                return;
                            }
                            TextToImageChooseScene textToImageChooseScene = this.LL;
                            boolean z4 = z3;
                            textToImageChooseScene.LLLLLL().LIZJ(viewFindViewById);
                            textToImageChooseScene.LLLLLL().LIZIZ(C1697810uHb.LJIIJJI(Integer.valueOf(R.raw.icon_trash_bin), Integer.valueOf(R.raw.icon_pen), Integer.valueOf(R.raw.icon_draft)), C1697810uHb.LJIIJJI(2131829841, 2131835486, 2131829846), C1697810uHb.LJIIJJI(new AwS552S0100000_8(textToImageChooseScene, 394), new AwS126S0110000_8(textToImageChooseScene, z4, 3), new AwS552S0100000_8(textToImageChooseScene, 395)));
                            return;
                        }
                        C572240McQ c572240McQ = C572240McQ.LIZ;
                        VideoPublishEditModel editModel2 = this.LL.getEditModel();
                        c572240McQ.getClass();
                        C572240McQ.LIZJ(editModel2);
                        C572850MdP c572850MdP7 = this.LL.LLJLL;
                        if (c572850MdP7 != null) {
                            c572850MdP7.iv();
                        }
                        this.LL.finish();
                    }
                });
            }
            C1459050o4V c1459050o4V = this.LLJLLIL;
            if (c1459050o4V != null && (c385670FAfBq2 = c1459050o4V.bq2()) != null) {
                c385670FAfBq2.LIZ(this, new AObjectS241S0100000_8(this, 31));
            }
            C572850MdP c572850MdP5 = this.LLJLL;
            if (c572850MdP5 != null && (liveDataYh = c572850MdP5.Yh()) != null) {
                liveDataYh.observe(this, new AObjectS241S0100000_8(this, 32));
            }
            this.LLLF = true;
            TextImageTaskInfo textImageTaskInfoLIZJ = C572250McR.LIZJ(getEditModel().creativeModel.text2ImageModel);
            if (textImageTaskInfoLIZJ != null) {
                uri = textImageTaskInfoLIZJ.getUri();
            } else {
                uri = null;
            }
            if (C123100dR.LIZ(uri) && uri != null && (c572850MdP = this.LLJLL) != null) {
                c572850MdP.v92(uri);
            }
            InterfaceC1460000o62 interfaceC1460000o623 = this.LLJLIL;
            if (interfaceC1460000o623 != null) {
                ImageAlbumData imageAlbumData4 = getEditModel().getImageAlbumData();
                if (imageAlbumData4 != null && (imageList = imageAlbumData4.getImageList()) != null && imageList.size() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                interfaceC1460000o623.BJ(!z2);
            }
            C19EG c19eg = (C19EG) this.mActivity;
            C1DRG c1drgLJIIIZ = C1664600tQ2.LJIIIZ(this);
            if (c1drgLJIIIZ != null) {
                this.LLJL = new C1454870nxl(c19eg, this, c1drgLJIIIZ);
                if (getEditModel().creativeModel.draftInfoModel.isDraft) {
                    getEditModel().creativeModel.text2ImageModel.tempImageTaskList = getEditModel().creativeModel.text2ImageModel.imageTaskList;
                }
                C572240McQ.LJFF(getEditModel(), null);
                C572240McQ.LIZ.getClass();
                C572240McQ.LIZLLL = System.currentTimeMillis();
                return;
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onEvent(C854840XgA c854840XgA) {
        List<SingleImageData> imageList;
        int iIntValue;
        String uri;
        C572850MdP c572850MdP;
        List<SingleImageData> imageList2;
        SingleImageData next;
        EditImageInfo editImageInfo;
        String tempSynthesisPath;
        EditImageInfo editImageInfo2;
        String path;
        String path2;
        int iIntValue2;
        String uri2;
        C572850MdP c572850MdP2;
        List<SingleImageData> imageList3;
        List<SingleImageData> imageList4;
        SingleImageData next2;
        EditImageInfo editImageInfo3;
        String tempSynthesisPath2;
        String path3;
        String path4;
        c854840XgA.LIZ(getEditModel());
        if (C295710BiT.LIZ()) {
            getEditModel().creativeModel.livePhotoModel = c854840XgA.LJJLIIIJJIZ;
            ImageAlbumData imageAlbumData = c854840XgA.LJJIJIL;
            if (imageAlbumData != null) {
                if (getEditModel().getImageAlbumData() == null) {
                    getEditModel().setImageAlbumData(imageAlbumData);
                } else {
                    ImageAlbumData imageAlbumData2 = getEditModel().getImageAlbumData();
                    if (imageAlbumData2 != null) {
                        imageList3 = imageAlbumData2.getImageList();
                    } else {
                        imageList3 = null;
                    }
                    ImageAlbumData imageAlbumData3 = getEditModel().getImageAlbumData();
                    if (imageAlbumData3 != null) {
                        imageAlbumData3.setImageList(imageAlbumData.getImageList());
                    }
                    if (imageList3 != null) {
                        for (SingleImageData singleImageData : imageList3) {
                            ImageAlbumData imageAlbumData4 = getEditModel().getImageAlbumData();
                            if (imageAlbumData4 != null && (imageList4 = imageAlbumData4.getImageList()) != null) {
                                Iterator<SingleImageData> it2 = imageList4.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        next2 = it2.next();
                                        SrcImageInfo srcImageInfo = next2.getSrcImageInfo();
                                        if (srcImageInfo != null) {
                                            path3 = srcImageInfo.getPath();
                                        } else {
                                            path3 = null;
                                        }
                                        SrcImageInfo srcImageInfo2 = singleImageData.getSrcImageInfo();
                                        if (srcImageInfo2 != null) {
                                            path4 = srcImageInfo2.getPath();
                                        } else {
                                            path4 = null;
                                        }
                                        if (Intrinsics.LJFF(path3, path4)) {
                                            break;
                                        }
                                    } else {
                                        next2 = null;
                                        break;
                                    }
                                }
                                SingleImageData singleImageData2 = next2;
                                if (singleImageData2 != null) {
                                    if (singleImageData2.getSynthesisData() == null && singleImageData.getSynthesisData() != null) {
                                        singleImageData2.setSynthesisData(singleImageData.getSynthesisData());
                                    }
                                    EditImageInfo editImageInfo4 = singleImageData2.getEditImageInfo();
                                    if (editImageInfo4 == null || editImageInfo4.getTempSynthesisPath() == null) {
                                        EditImageInfo editImageInfo5 = singleImageData.getEditImageInfo();
                                        if (editImageInfo5 != null && editImageInfo5.getTempSynthesisPath() != null && (editImageInfo3 = singleImageData2.getEditImageInfo()) != null) {
                                            EditImageInfo editImageInfo6 = singleImageData.getEditImageInfo();
                                            if (editImageInfo6 != null) {
                                                tempSynthesisPath2 = editImageInfo6.getTempSynthesisPath();
                                            } else {
                                                tempSynthesisPath2 = null;
                                            }
                                            editImageInfo3.setTempSynthesisPath(tempSynthesisPath2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            getEditModel().creativeModel.text2ImageModel.transToDesc = false;
            List<TextImageTaskInfo> list = getEditModel().creativeModel.text2ImageModel.imageTaskList;
            Integer num = getEditModel().creativeModel.text2ImageModel.index;
            if (num != null) {
                iIntValue2 = num.intValue();
            } else {
                iIntValue2 = 0;
            }
            TextImageTaskInfo textImageTaskInfo = (TextImageTaskInfo) C13LP.LJJJLZIJ(iIntValue2, list);
            if (textImageTaskInfo != null && (uri2 = textImageTaskInfo.getUri()) != null && uri2.length() != 0 && (c572850MdP2 = this.LLJLL) != null) {
                c572850MdP2.v92(uri2);
            }
            C572050Mc7.LIZIZ(getEditModel());
        } else {
            if (getEditModel().getImageAlbumData() == null) {
                getEditModel().setImageAlbumData(c854840XgA.LJJIJIL);
            }
            ImageAlbumData imageAlbumData5 = getEditModel().getImageAlbumData();
            if (imageAlbumData5 != null) {
                imageList = imageAlbumData5.getImageList();
            } else {
                imageList = null;
            }
            ImageAlbumData imageAlbumData6 = getEditModel().getImageAlbumData();
            if (imageAlbumData6 != null) {
                imageAlbumData6.setImageList(c854840XgA.LJJIJIL.getImageList());
            }
            if (imageList != null) {
                for (SingleImageData singleImageData3 : imageList) {
                    ImageAlbumData imageAlbumData7 = getEditModel().getImageAlbumData();
                    if (imageAlbumData7 != null && (imageList2 = imageAlbumData7.getImageList()) != null) {
                        Iterator<SingleImageData> it3 = imageList2.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                next = it3.next();
                                SrcImageInfo srcImageInfo3 = next.getSrcImageInfo();
                                if (srcImageInfo3 != null) {
                                    path = srcImageInfo3.getPath();
                                } else {
                                    path = null;
                                }
                                SrcImageInfo srcImageInfo4 = singleImageData3.getSrcImageInfo();
                                if (srcImageInfo4 != null) {
                                    path2 = srcImageInfo4.getPath();
                                } else {
                                    path2 = null;
                                }
                                if (Intrinsics.LJFF(path, path2)) {
                                    break;
                                }
                            } else {
                                next = null;
                                break;
                            }
                        }
                        SingleImageData singleImageData4 = next;
                        if (singleImageData4 != null) {
                            if (singleImageData4.getSynthesisData() == null && singleImageData3.getSynthesisData() != null) {
                                singleImageData4.setSynthesisData(singleImageData3.getSynthesisData());
                            }
                            EditImageInfo editImageInfo7 = singleImageData4.getEditImageInfo();
                            if (editImageInfo7 == null || editImageInfo7.getTempSynthesisPath() == null) {
                                EditImageInfo editImageInfo8 = singleImageData3.getEditImageInfo();
                                if (editImageInfo8 != null && editImageInfo8.getTempSynthesisPath() != null && (editImageInfo = singleImageData3.getEditImageInfo()) != null && (tempSynthesisPath = editImageInfo.getTempSynthesisPath()) != null && (editImageInfo2 = singleImageData4.getEditImageInfo()) != null) {
                                    editImageInfo2.setTempSynthesisPath(tempSynthesisPath);
                                }
                            }
                        }
                    }
                }
            }
            List<TextImageTaskInfo> list2 = getEditModel().creativeModel.text2ImageModel.imageTaskList;
            Integer num2 = getEditModel().creativeModel.text2ImageModel.index;
            if (num2 != null) {
                iIntValue = num2.intValue();
            } else {
                iIntValue = 0;
            }
            TextImageTaskInfo textImageTaskInfo2 = (TextImageTaskInfo) C13LP.LJJJLZIJ(iIntValue, list2);
            if (textImageTaskInfo2 != null && (uri = textImageTaskInfo2.getUri()) != null && uri.length() != 0 && (c572850MdP = this.LLJLL) != null) {
                c572850MdP.v92(uri);
            }
            getEditModel().creativeModel.text2ImageModel.transToDesc = false;
        }
        C572240McQ.LJFF(getEditModel(), "video_post_page");
    }

    @Override // X.AbstractC214814194y
    public final boolean processNewArguments(Bundle bundle) {
        if (bundle != null) {
            getEditModel().creativeModel = C0MUK.LIZJ(bundle);
            C572850MdP c572850MdP = this.LLJLL;
            if (c572850MdP != null) {
                c572850MdP.ZL();
                return true;
            }
            return true;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene
    public final void LLLLLJLJLL(int i, int i2) {
        ((InterfaceC1456650o0d) this.LLLII.getValue()).LIZ(i, i2);
    }

    @Override // X.AbstractC1447660nm8, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.ert, viewGroup, false);
    }
}
